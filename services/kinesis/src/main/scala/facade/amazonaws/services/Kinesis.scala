package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesis {
  type BooleanObject                 = Boolean
  type ConsumerARN                   = String
  type ConsumerCountObject           = Int
  type ConsumerList                  = js.Array[Consumer]
  type ConsumerName                  = String
  type ConsumerStatus                = String
  type Data                          = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DescribeStreamInputLimit      = Int
  type EncryptionType                = String
  type EnhancedMonitoringList        = js.Array[EnhancedMetrics]
  type ErrorCode                     = String
  type ErrorMessage                  = String
  type GetRecordsInputLimit          = Int
  type HashKey                       = String
  type KeyId                         = String
  type ListShardsInputLimit          = Int
  type ListStreamConsumersInputLimit = Int
  type ListStreamsInputLimit         = Int
  type ListTagsForStreamInputLimit   = Int
  type MetricsName                   = String
  type MetricsNameList               = js.Array[MetricsName]
  type MillisBehindLatest            = Double
  type NextToken                     = String
  type PartitionKey                  = String
  type PositiveIntegerObject         = Int
  type PutRecordsRequestEntryList    = js.Array[PutRecordsRequestEntry]
  type PutRecordsResultEntryList     = js.Array[PutRecordsResultEntry]
  type RecordList                    = js.Array[Record]
  type RetentionPeriodHours          = Int
  type ScalingType                   = String
  type SequenceNumber                = String
  type ShardCountObject              = Int
  type ShardId                       = String
  type ShardIterator                 = String
  type ShardIteratorType             = String
  type ShardList                     = js.Array[Shard]
  type StreamARN                     = String
  type StreamName                    = String
  type StreamNameList                = js.Array[StreamName]
  type StreamStatus                  = String
  type TagKey                        = String
  type TagKeyList                    = js.Array[TagKey]
  type TagList                       = js.Array[Tag]
  type TagMap                        = js.Dictionary[TagValue]
  type TagValue                      = String
  type Timestamp                     = js.Date

  implicit final class KinesisOps(private val service: Kinesis) extends AnyVal {
    @inline def addTagsToStreamFuture(params: AddTagsToStreamInput): Future[js.Object] =
      service.addTagsToStream(params).promise.toFuture
    @inline def createStreamFuture(params: CreateStreamInput): Future[js.Object] =
      service.createStream(params).promise.toFuture
    @inline def decreaseStreamRetentionPeriodFuture(params: DecreaseStreamRetentionPeriodInput): Future[js.Object] =
      service.decreaseStreamRetentionPeriod(params).promise.toFuture
    @inline def deleteStreamFuture(params: DeleteStreamInput): Future[js.Object] =
      service.deleteStream(params).promise.toFuture
    @inline def deregisterStreamConsumerFuture(params: DeregisterStreamConsumerInput): Future[js.Object] =
      service.deregisterStreamConsumer(params).promise.toFuture
    @inline def describeLimitsFuture(params: DescribeLimitsInput): Future[DescribeLimitsOutput] =
      service.describeLimits(params).promise.toFuture
    @inline def describeStreamConsumerFuture(
        params: DescribeStreamConsumerInput
    ): Future[DescribeStreamConsumerOutput] = service.describeStreamConsumer(params).promise.toFuture
    @inline def describeStreamFuture(params: DescribeStreamInput): Future[DescribeStreamOutput] =
      service.describeStream(params).promise.toFuture
    @inline def describeStreamSummaryFuture(params: DescribeStreamSummaryInput): Future[DescribeStreamSummaryOutput] =
      service.describeStreamSummary(params).promise.toFuture
    @inline def disableEnhancedMonitoringFuture(
        params: DisableEnhancedMonitoringInput
    ): Future[EnhancedMonitoringOutput] = service.disableEnhancedMonitoring(params).promise.toFuture
    @inline def enableEnhancedMonitoringFuture(
        params: EnableEnhancedMonitoringInput
    ): Future[EnhancedMonitoringOutput] = service.enableEnhancedMonitoring(params).promise.toFuture
    @inline def getRecordsFuture(params: GetRecordsInput): Future[GetRecordsOutput] =
      service.getRecords(params).promise.toFuture
    @inline def getShardIteratorFuture(params: GetShardIteratorInput): Future[GetShardIteratorOutput] =
      service.getShardIterator(params).promise.toFuture
    @inline def increaseStreamRetentionPeriodFuture(params: IncreaseStreamRetentionPeriodInput): Future[js.Object] =
      service.increaseStreamRetentionPeriod(params).promise.toFuture
    @inline def listShardsFuture(params: ListShardsInput): Future[ListShardsOutput] =
      service.listShards(params).promise.toFuture
    @inline def listStreamConsumersFuture(params: ListStreamConsumersInput): Future[ListStreamConsumersOutput] =
      service.listStreamConsumers(params).promise.toFuture
    @inline def listStreamsFuture(params: ListStreamsInput): Future[ListStreamsOutput] =
      service.listStreams(params).promise.toFuture
    @inline def listTagsForStreamFuture(params: ListTagsForStreamInput): Future[ListTagsForStreamOutput] =
      service.listTagsForStream(params).promise.toFuture
    @inline def mergeShardsFuture(params: MergeShardsInput): Future[js.Object] =
      service.mergeShards(params).promise.toFuture
    @inline def putRecordFuture(params: PutRecordInput): Future[PutRecordOutput] =
      service.putRecord(params).promise.toFuture
    @inline def putRecordsFuture(params: PutRecordsInput): Future[PutRecordsOutput] =
      service.putRecords(params).promise.toFuture
    @inline def registerStreamConsumerFuture(
        params: RegisterStreamConsumerInput
    ): Future[RegisterStreamConsumerOutput] = service.registerStreamConsumer(params).promise.toFuture
    @inline def removeTagsFromStreamFuture(params: RemoveTagsFromStreamInput): Future[js.Object] =
      service.removeTagsFromStream(params).promise.toFuture
    @inline def splitShardFuture(params: SplitShardInput): Future[js.Object] =
      service.splitShard(params).promise.toFuture
    @inline def startStreamEncryptionFuture(params: StartStreamEncryptionInput): Future[js.Object] =
      service.startStreamEncryption(params).promise.toFuture
    @inline def stopStreamEncryptionFuture(params: StopStreamEncryptionInput): Future[js.Object] =
      service.stopStreamEncryption(params).promise.toFuture
    @inline def updateShardCountFuture(params: UpdateShardCountInput): Future[UpdateShardCountOutput] =
      service.updateShardCount(params).promise.toFuture
  }
}

package kinesis {
  @js.native
  @JSImport("aws-sdk", "Kinesis")
  class Kinesis() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToStream(params: AddTagsToStreamInput): Request[js.Object]                                    = js.native
    def createStream(params: CreateStreamInput): Request[js.Object]                                          = js.native
    def decreaseStreamRetentionPeriod(params: DecreaseStreamRetentionPeriodInput): Request[js.Object]        = js.native
    def deleteStream(params: DeleteStreamInput): Request[js.Object]                                          = js.native
    def deregisterStreamConsumer(params: DeregisterStreamConsumerInput): Request[js.Object]                  = js.native
    def describeLimits(params: DescribeLimitsInput): Request[DescribeLimitsOutput]                           = js.native
    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput]                           = js.native
    def describeStreamConsumer(params: DescribeStreamConsumerInput): Request[DescribeStreamConsumerOutput]   = js.native
    def describeStreamSummary(params: DescribeStreamSummaryInput): Request[DescribeStreamSummaryOutput]      = js.native
    def disableEnhancedMonitoring(params: DisableEnhancedMonitoringInput): Request[EnhancedMonitoringOutput] = js.native
    def enableEnhancedMonitoring(params: EnableEnhancedMonitoringInput): Request[EnhancedMonitoringOutput]   = js.native
    def getRecords(params: GetRecordsInput): Request[GetRecordsOutput]                                       = js.native
    def getShardIterator(params: GetShardIteratorInput): Request[GetShardIteratorOutput]                     = js.native
    def increaseStreamRetentionPeriod(params: IncreaseStreamRetentionPeriodInput): Request[js.Object]        = js.native
    def listShards(params: ListShardsInput): Request[ListShardsOutput]                                       = js.native
    def listStreamConsumers(params: ListStreamConsumersInput): Request[ListStreamConsumersOutput]            = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput]                                    = js.native
    def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput]                  = js.native
    def mergeShards(params: MergeShardsInput): Request[js.Object]                                            = js.native
    def putRecord(params: PutRecordInput): Request[PutRecordOutput]                                          = js.native
    def putRecords(params: PutRecordsInput): Request[PutRecordsOutput]                                       = js.native
    def registerStreamConsumer(params: RegisterStreamConsumerInput): Request[RegisterStreamConsumerOutput]   = js.native
    def removeTagsFromStream(params: RemoveTagsFromStreamInput): Request[js.Object]                          = js.native
    def splitShard(params: SplitShardInput): Request[js.Object]                                              = js.native
    def startStreamEncryption(params: StartStreamEncryptionInput): Request[js.Object]                        = js.native
    def stopStreamEncryption(params: StopStreamEncryptionInput): Request[js.Object]                          = js.native
    def updateShardCount(params: UpdateShardCountInput): Request[UpdateShardCountOutput]                     = js.native
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
    @inline
    def apply(
        StreamName: StreamName,
        Tags: TagMap
    ): AddTagsToStreamInput = {
      val __obj = js.Dynamic.literal(
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "Tags"       -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToStreamInput]
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
    @inline
    def apply(
        ConsumerARN: ConsumerARN,
        ConsumerCreationTimestamp: Timestamp,
        ConsumerName: ConsumerName,
        ConsumerStatus: ConsumerStatus
    ): Consumer = {
      val __obj = js.Dynamic.literal(
        "ConsumerARN"               -> ConsumerARN.asInstanceOf[js.Any],
        "ConsumerCreationTimestamp" -> ConsumerCreationTimestamp.asInstanceOf[js.Any],
        "ConsumerName"              -> ConsumerName.asInstanceOf[js.Any],
        "ConsumerStatus"            -> ConsumerStatus.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Consumer]
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
    @inline
    def apply(
        ConsumerARN: ConsumerARN,
        ConsumerCreationTimestamp: Timestamp,
        ConsumerName: ConsumerName,
        ConsumerStatus: ConsumerStatus,
        StreamARN: StreamARN
    ): ConsumerDescription = {
      val __obj = js.Dynamic.literal(
        "ConsumerARN"               -> ConsumerARN.asInstanceOf[js.Any],
        "ConsumerCreationTimestamp" -> ConsumerCreationTimestamp.asInstanceOf[js.Any],
        "ConsumerName"              -> ConsumerName.asInstanceOf[js.Any],
        "ConsumerStatus"            -> ConsumerStatus.asInstanceOf[js.Any],
        "StreamARN"                 -> StreamARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConsumerDescription]
    }
  }

  object ConsumerStatusEnum {
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val ACTIVE   = "ACTIVE"

    val values = js.Object.freeze(js.Array(CREATING, DELETING, ACTIVE))
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
    @inline
    def apply(
        ShardCount: PositiveIntegerObject,
        StreamName: StreamName
    ): CreateStreamInput = {
      val __obj = js.Dynamic.literal(
        "ShardCount" -> ShardCount.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateStreamInput]
    }
  }

  /**
    * Represents the input for <a>DecreaseStreamRetentionPeriod</a>.
    */
  @js.native
  trait DecreaseStreamRetentionPeriodInput extends js.Object {
    var RetentionPeriodHours: RetentionPeriodHours
    var StreamName: StreamName
  }

  object DecreaseStreamRetentionPeriodInput {
    @inline
    def apply(
        RetentionPeriodHours: RetentionPeriodHours,
        StreamName: StreamName
    ): DecreaseStreamRetentionPeriodInput = {
      val __obj = js.Dynamic.literal(
        "RetentionPeriodHours" -> RetentionPeriodHours.asInstanceOf[js.Any],
        "StreamName"           -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DecreaseStreamRetentionPeriodInput]
    }
  }

  /**
    * Represents the input for <a>DeleteStream</a>.
    */
  @js.native
  trait DeleteStreamInput extends js.Object {
    var StreamName: StreamName
    var EnforceConsumerDeletion: js.UndefOr[BooleanObject]
  }

  object DeleteStreamInput {
    @inline
    def apply(
        StreamName: StreamName,
        EnforceConsumerDeletion: js.UndefOr[BooleanObject] = js.undefined
    ): DeleteStreamInput = {
      val __obj = js.Dynamic.literal(
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      EnforceConsumerDeletion.foreach(__v => __obj.updateDynamic("EnforceConsumerDeletion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStreamInput]
    }
  }

  @js.native
  trait DeregisterStreamConsumerInput extends js.Object {
    var ConsumerARN: js.UndefOr[ConsumerARN]
    var ConsumerName: js.UndefOr[ConsumerName]
    var StreamARN: js.UndefOr[StreamARN]
  }

  object DeregisterStreamConsumerInput {
    @inline
    def apply(
        ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined,
        ConsumerName: js.UndefOr[ConsumerName] = js.undefined,
        StreamARN: js.UndefOr[StreamARN] = js.undefined
    ): DeregisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      ConsumerARN.foreach(__v => __obj.updateDynamic("ConsumerARN")(__v.asInstanceOf[js.Any]))
      ConsumerName.foreach(__v => __obj.updateDynamic("ConsumerName")(__v.asInstanceOf[js.Any]))
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterStreamConsumerInput]
    }
  }

  @js.native
  trait DescribeLimitsInput extends js.Object {}

  object DescribeLimitsInput {
    @inline
    def apply(
        ): DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeLimitsInput]
    }
  }

  @js.native
  trait DescribeLimitsOutput extends js.Object {
    var OpenShardCount: ShardCountObject
    var ShardLimit: ShardCountObject
  }

  object DescribeLimitsOutput {
    @inline
    def apply(
        OpenShardCount: ShardCountObject,
        ShardLimit: ShardCountObject
    ): DescribeLimitsOutput = {
      val __obj = js.Dynamic.literal(
        "OpenShardCount" -> OpenShardCount.asInstanceOf[js.Any],
        "ShardLimit"     -> ShardLimit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLimitsOutput]
    }
  }

  @js.native
  trait DescribeStreamConsumerInput extends js.Object {
    var ConsumerARN: js.UndefOr[ConsumerARN]
    var ConsumerName: js.UndefOr[ConsumerName]
    var StreamARN: js.UndefOr[StreamARN]
  }

  object DescribeStreamConsumerInput {
    @inline
    def apply(
        ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined,
        ConsumerName: js.UndefOr[ConsumerName] = js.undefined,
        StreamARN: js.UndefOr[StreamARN] = js.undefined
    ): DescribeStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      ConsumerARN.foreach(__v => __obj.updateDynamic("ConsumerARN")(__v.asInstanceOf[js.Any]))
      ConsumerName.foreach(__v => __obj.updateDynamic("ConsumerName")(__v.asInstanceOf[js.Any]))
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStreamConsumerInput]
    }
  }

  @js.native
  trait DescribeStreamConsumerOutput extends js.Object {
    var ConsumerDescription: ConsumerDescription
  }

  object DescribeStreamConsumerOutput {
    @inline
    def apply(
        ConsumerDescription: ConsumerDescription
    ): DescribeStreamConsumerOutput = {
      val __obj = js.Dynamic.literal(
        "ConsumerDescription" -> ConsumerDescription.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStreamConsumerOutput]
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
    @inline
    def apply(
        StreamName: StreamName,
        ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined,
        Limit: js.UndefOr[DescribeStreamInputLimit] = js.undefined
    ): DescribeStreamInput = {
      val __obj = js.Dynamic.literal(
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      ExclusiveStartShardId.foreach(__v => __obj.updateDynamic("ExclusiveStartShardId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStreamInput]
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
    @inline
    def apply(
        StreamDescription: StreamDescription
    ): DescribeStreamOutput = {
      val __obj = js.Dynamic.literal(
        "StreamDescription" -> StreamDescription.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStreamOutput]
    }
  }

  @js.native
  trait DescribeStreamSummaryInput extends js.Object {
    var StreamName: StreamName
  }

  object DescribeStreamSummaryInput {
    @inline
    def apply(
        StreamName: StreamName
    ): DescribeStreamSummaryInput = {
      val __obj = js.Dynamic.literal(
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStreamSummaryInput]
    }
  }

  @js.native
  trait DescribeStreamSummaryOutput extends js.Object {
    var StreamDescriptionSummary: StreamDescriptionSummary
  }

  object DescribeStreamSummaryOutput {
    @inline
    def apply(
        StreamDescriptionSummary: StreamDescriptionSummary
    ): DescribeStreamSummaryOutput = {
      val __obj = js.Dynamic.literal(
        "StreamDescriptionSummary" -> StreamDescriptionSummary.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStreamSummaryOutput]
    }
  }

  /**
    * Represents the input for <a>DisableEnhancedMonitoring</a>.
    */
  @js.native
  trait DisableEnhancedMonitoringInput extends js.Object {
    var ShardLevelMetrics: MetricsNameList
    var StreamName: StreamName
  }

  object DisableEnhancedMonitoringInput {
    @inline
    def apply(
        ShardLevelMetrics: MetricsNameList,
        StreamName: StreamName
    ): DisableEnhancedMonitoringInput = {
      val __obj = js.Dynamic.literal(
        "ShardLevelMetrics" -> ShardLevelMetrics.asInstanceOf[js.Any],
        "StreamName"        -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableEnhancedMonitoringInput]
    }
  }

  /**
    * Represents the input for <a>EnableEnhancedMonitoring</a>.
    */
  @js.native
  trait EnableEnhancedMonitoringInput extends js.Object {
    var ShardLevelMetrics: MetricsNameList
    var StreamName: StreamName
  }

  object EnableEnhancedMonitoringInput {
    @inline
    def apply(
        ShardLevelMetrics: MetricsNameList,
        StreamName: StreamName
    ): EnableEnhancedMonitoringInput = {
      val __obj = js.Dynamic.literal(
        "ShardLevelMetrics" -> ShardLevelMetrics.asInstanceOf[js.Any],
        "StreamName"        -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableEnhancedMonitoringInput]
    }
  }

  object EncryptionTypeEnum {
    val NONE = "NONE"
    val KMS  = "KMS"

    val values = js.Object.freeze(js.Array(NONE, KMS))
  }

  /**
    * Represents enhanced metrics types.
    */
  @js.native
  trait EnhancedMetrics extends js.Object {
    var ShardLevelMetrics: js.UndefOr[MetricsNameList]
  }

  object EnhancedMetrics {
    @inline
    def apply(
        ShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
    ): EnhancedMetrics = {
      val __obj = js.Dynamic.literal()
      ShardLevelMetrics.foreach(__v => __obj.updateDynamic("ShardLevelMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnhancedMetrics]
    }
  }

  /**
    * Represents the output for <a>EnableEnhancedMonitoring</a> and <a>DisableEnhancedMonitoring</a>.
    */
  @js.native
  trait EnhancedMonitoringOutput extends js.Object {
    var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList]
    var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList]
    var StreamName: js.UndefOr[StreamName]
  }

  object EnhancedMonitoringOutput {
    @inline
    def apply(
        CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined,
        DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): EnhancedMonitoringOutput = {
      val __obj = js.Dynamic.literal()
      CurrentShardLevelMetrics.foreach(__v => __obj.updateDynamic("CurrentShardLevelMetrics")(__v.asInstanceOf[js.Any]))
      DesiredShardLevelMetrics.foreach(__v => __obj.updateDynamic("DesiredShardLevelMetrics")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnhancedMonitoringOutput]
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
    * Represents the input for <a>GetRecords</a>.
    */
  @js.native
  trait GetRecordsInput extends js.Object {
    var ShardIterator: ShardIterator
    var Limit: js.UndefOr[GetRecordsInputLimit]
  }

  object GetRecordsInput {
    @inline
    def apply(
        ShardIterator: ShardIterator,
        Limit: js.UndefOr[GetRecordsInputLimit] = js.undefined
    ): GetRecordsInput = {
      val __obj = js.Dynamic.literal(
        "ShardIterator" -> ShardIterator.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecordsInput]
    }
  }

  /**
    * Represents the output for <a>GetRecords</a>.
    */
  @js.native
  trait GetRecordsOutput extends js.Object {
    var Records: RecordList
    var MillisBehindLatest: js.UndefOr[MillisBehindLatest]
    var NextShardIterator: js.UndefOr[ShardIterator]
  }

  object GetRecordsOutput {
    @inline
    def apply(
        Records: RecordList,
        MillisBehindLatest: js.UndefOr[MillisBehindLatest] = js.undefined,
        NextShardIterator: js.UndefOr[ShardIterator] = js.undefined
    ): GetRecordsOutput = {
      val __obj = js.Dynamic.literal(
        "Records" -> Records.asInstanceOf[js.Any]
      )

      MillisBehindLatest.foreach(__v => __obj.updateDynamic("MillisBehindLatest")(__v.asInstanceOf[js.Any]))
      NextShardIterator.foreach(__v => __obj.updateDynamic("NextShardIterator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecordsOutput]
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
    @inline
    def apply(
        ShardId: ShardId,
        ShardIteratorType: ShardIteratorType,
        StreamName: StreamName,
        StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): GetShardIteratorInput = {
      val __obj = js.Dynamic.literal(
        "ShardId"           -> ShardId.asInstanceOf[js.Any],
        "ShardIteratorType" -> ShardIteratorType.asInstanceOf[js.Any],
        "StreamName"        -> StreamName.asInstanceOf[js.Any]
      )

      StartingSequenceNumber.foreach(__v => __obj.updateDynamic("StartingSequenceNumber")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetShardIteratorInput]
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
    @inline
    def apply(
        ShardIterator: js.UndefOr[ShardIterator] = js.undefined
    ): GetShardIteratorOutput = {
      val __obj = js.Dynamic.literal()
      ShardIterator.foreach(__v => __obj.updateDynamic("ShardIterator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetShardIteratorOutput]
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
    @inline
    def apply(
        EndingHashKey: HashKey,
        StartingHashKey: HashKey
    ): HashKeyRange = {
      val __obj = js.Dynamic.literal(
        "EndingHashKey"   -> EndingHashKey.asInstanceOf[js.Any],
        "StartingHashKey" -> StartingHashKey.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HashKeyRange]
    }
  }

  /**
    * Represents the input for <a>IncreaseStreamRetentionPeriod</a>.
    */
  @js.native
  trait IncreaseStreamRetentionPeriodInput extends js.Object {
    var RetentionPeriodHours: RetentionPeriodHours
    var StreamName: StreamName
  }

  object IncreaseStreamRetentionPeriodInput {
    @inline
    def apply(
        RetentionPeriodHours: RetentionPeriodHours,
        StreamName: StreamName
    ): IncreaseStreamRetentionPeriodInput = {
      val __obj = js.Dynamic.literal(
        "RetentionPeriodHours" -> RetentionPeriodHours.asInstanceOf[js.Any],
        "StreamName"           -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IncreaseStreamRetentionPeriodInput]
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
    * The request was rejected because the state of the specified resource isn't valid for this request. For more information, see [[http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html|How Key State Affects Use of a Customer Master Key]] in the <i>AWS Key Management Service Developer Guide</i>.
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
    * The request was denied due to request throttling. For more information about throttling, see [[http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#requests-per-second|Limits]] in the <i>AWS Key Management Service Developer Guide</i>.
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
    @inline
    def apply(
        ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined,
        MaxResults: js.UndefOr[ListShardsInputLimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): ListShardsInput = {
      val __obj = js.Dynamic.literal()
      ExclusiveStartShardId.foreach(__v => __obj.updateDynamic("ExclusiveStartShardId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StreamCreationTimestamp.foreach(__v => __obj.updateDynamic("StreamCreationTimestamp")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListShardsInput]
    }
  }

  @js.native
  trait ListShardsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Shards: js.UndefOr[ShardList]
  }

  object ListShardsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Shards: js.UndefOr[ShardList] = js.undefined
    ): ListShardsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Shards.foreach(__v => __obj.updateDynamic("Shards")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListShardsOutput]
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
    @inline
    def apply(
        StreamARN: StreamARN,
        MaxResults: js.UndefOr[ListStreamConsumersInputLimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): ListStreamConsumersInput = {
      val __obj = js.Dynamic.literal(
        "StreamARN" -> StreamARN.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StreamCreationTimestamp.foreach(__v => __obj.updateDynamic("StreamCreationTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamConsumersInput]
    }
  }

  @js.native
  trait ListStreamConsumersOutput extends js.Object {
    var Consumers: js.UndefOr[ConsumerList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStreamConsumersOutput {
    @inline
    def apply(
        Consumers: js.UndefOr[ConsumerList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStreamConsumersOutput = {
      val __obj = js.Dynamic.literal()
      Consumers.foreach(__v => __obj.updateDynamic("Consumers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamConsumersOutput]
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
    @inline
    def apply(
        ExclusiveStartStreamName: js.UndefOr[StreamName] = js.undefined,
        Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined
    ): ListStreamsInput = {
      val __obj = js.Dynamic.literal()
      ExclusiveStartStreamName.foreach(__v => __obj.updateDynamic("ExclusiveStartStreamName")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsInput]
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
    @inline
    def apply(
        HasMoreStreams: BooleanObject,
        StreamNames: StreamNameList
    ): ListStreamsOutput = {
      val __obj = js.Dynamic.literal(
        "HasMoreStreams" -> HasMoreStreams.asInstanceOf[js.Any],
        "StreamNames"    -> StreamNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListStreamsOutput]
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
    @inline
    def apply(
        StreamName: StreamName,
        ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined,
        Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.undefined
    ): ListTagsForStreamInput = {
      val __obj = js.Dynamic.literal(
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      ExclusiveStartTagKey.foreach(__v => __obj.updateDynamic("ExclusiveStartTagKey")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForStreamInput]
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
    @inline
    def apply(
        HasMoreTags: BooleanObject,
        Tags: TagList
    ): ListTagsForStreamOutput = {
      val __obj = js.Dynamic.literal(
        "HasMoreTags" -> HasMoreTags.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForStreamOutput]
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
    @inline
    def apply(
        AdjacentShardToMerge: ShardId,
        ShardToMerge: ShardId,
        StreamName: StreamName
    ): MergeShardsInput = {
      val __obj = js.Dynamic.literal(
        "AdjacentShardToMerge" -> AdjacentShardToMerge.asInstanceOf[js.Any],
        "ShardToMerge"         -> ShardToMerge.asInstanceOf[js.Any],
        "StreamName"           -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MergeShardsInput]
    }
  }

  object MetricsNameEnum {
    val IncomingBytes                      = "IncomingBytes"
    val IncomingRecords                    = "IncomingRecords"
    val OutgoingBytes                      = "OutgoingBytes"
    val OutgoingRecords                    = "OutgoingRecords"
    val WriteProvisionedThroughputExceeded = "WriteProvisionedThroughputExceeded"
    val ReadProvisionedThroughputExceeded  = "ReadProvisionedThroughputExceeded"
    val IteratorAgeMilliseconds            = "IteratorAgeMilliseconds"
    val ALL                                = "ALL"

    val values = js.Object.freeze(
      js.Array(
        IncomingBytes,
        IncomingRecords,
        OutgoingBytes,
        OutgoingRecords,
        WriteProvisionedThroughputExceeded,
        ReadProvisionedThroughputExceeded,
        IteratorAgeMilliseconds,
        ALL
      )
    )
  }

  /**
    * The request rate for the stream is too high, or the requested data is too large for the available throughput. Reduce the frequency or size of your requests. For more information, see [[http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html|Streams Limits]] in the <i>Amazon Kinesis Data Streams Developer Guide</i>, and [[http://docs.aws.amazon.com/general/latest/gr/api-retries.html|Error Retries and Exponential Backoff in AWS]] in the <i>AWS General Reference</i>.
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
    @inline
    def apply(
        Data: Data,
        PartitionKey: PartitionKey,
        StreamName: StreamName,
        ExplicitHashKey: js.UndefOr[HashKey] = js.undefined,
        SequenceNumberForOrdering: js.UndefOr[SequenceNumber] = js.undefined
    ): PutRecordInput = {
      val __obj = js.Dynamic.literal(
        "Data"         -> Data.asInstanceOf[js.Any],
        "PartitionKey" -> PartitionKey.asInstanceOf[js.Any],
        "StreamName"   -> StreamName.asInstanceOf[js.Any]
      )

      ExplicitHashKey.foreach(__v => __obj.updateDynamic("ExplicitHashKey")(__v.asInstanceOf[js.Any]))
      SequenceNumberForOrdering.foreach(__v =>
        __obj.updateDynamic("SequenceNumberForOrdering")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutRecordInput]
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
    @inline
    def apply(
        SequenceNumber: SequenceNumber,
        ShardId: ShardId,
        EncryptionType: js.UndefOr[EncryptionType] = js.undefined
    ): PutRecordOutput = {
      val __obj = js.Dynamic.literal(
        "SequenceNumber" -> SequenceNumber.asInstanceOf[js.Any],
        "ShardId"        -> ShardId.asInstanceOf[js.Any]
      )

      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecordOutput]
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
    @inline
    def apply(
        Records: PutRecordsRequestEntryList,
        StreamName: StreamName
    ): PutRecordsInput = {
      val __obj = js.Dynamic.literal(
        "Records"    -> Records.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRecordsInput]
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
    @inline
    def apply(
        Records: PutRecordsResultEntryList,
        EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
        FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.undefined
    ): PutRecordsOutput = {
      val __obj = js.Dynamic.literal(
        "Records" -> Records.asInstanceOf[js.Any]
      )

      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      FailedRecordCount.foreach(__v => __obj.updateDynamic("FailedRecordCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecordsOutput]
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
    @inline
    def apply(
        Data: Data,
        PartitionKey: PartitionKey,
        ExplicitHashKey: js.UndefOr[HashKey] = js.undefined
    ): PutRecordsRequestEntry = {
      val __obj = js.Dynamic.literal(
        "Data"         -> Data.asInstanceOf[js.Any],
        "PartitionKey" -> PartitionKey.asInstanceOf[js.Any]
      )

      ExplicitHashKey.foreach(__v => __obj.updateDynamic("ExplicitHashKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecordsRequestEntry]
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
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
        ShardId: js.UndefOr[ShardId] = js.undefined
    ): PutRecordsResultEntry = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      SequenceNumber.foreach(__v => __obj.updateDynamic("SequenceNumber")(__v.asInstanceOf[js.Any]))
      ShardId.foreach(__v => __obj.updateDynamic("ShardId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecordsResultEntry]
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
    @inline
    def apply(
        Data: Data,
        PartitionKey: PartitionKey,
        SequenceNumber: SequenceNumber,
        ApproximateArrivalTimestamp: js.UndefOr[Timestamp] = js.undefined,
        EncryptionType: js.UndefOr[EncryptionType] = js.undefined
    ): Record = {
      val __obj = js.Dynamic.literal(
        "Data"           -> Data.asInstanceOf[js.Any],
        "PartitionKey"   -> PartitionKey.asInstanceOf[js.Any],
        "SequenceNumber" -> SequenceNumber.asInstanceOf[js.Any]
      )

      ApproximateArrivalTimestamp.foreach(__v =>
        __obj.updateDynamic("ApproximateArrivalTimestamp")(__v.asInstanceOf[js.Any])
      )
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Record]
    }
  }

  @js.native
  trait RegisterStreamConsumerInput extends js.Object {
    var ConsumerName: ConsumerName
    var StreamARN: StreamARN
  }

  object RegisterStreamConsumerInput {
    @inline
    def apply(
        ConsumerName: ConsumerName,
        StreamARN: StreamARN
    ): RegisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal(
        "ConsumerName" -> ConsumerName.asInstanceOf[js.Any],
        "StreamARN"    -> StreamARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterStreamConsumerInput]
    }
  }

  @js.native
  trait RegisterStreamConsumerOutput extends js.Object {
    var Consumer: Consumer
  }

  object RegisterStreamConsumerOutput {
    @inline
    def apply(
        Consumer: Consumer
    ): RegisterStreamConsumerOutput = {
      val __obj = js.Dynamic.literal(
        "Consumer" -> Consumer.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterStreamConsumerOutput]
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
    @inline
    def apply(
        StreamName: StreamName,
        TagKeys: TagKeyList
    ): RemoveTagsFromStreamInput = {
      val __obj = js.Dynamic.literal(
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "TagKeys"    -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromStreamInput]
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

    val values = js.Object.freeze(js.Array(UNIFORM_SCALING))
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
    @inline
    def apply(
        StartingSequenceNumber: SequenceNumber,
        EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    ): SequenceNumberRange = {
      val __obj = js.Dynamic.literal(
        "StartingSequenceNumber" -> StartingSequenceNumber.asInstanceOf[js.Any]
      )

      EndingSequenceNumber.foreach(__v => __obj.updateDynamic("EndingSequenceNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SequenceNumberRange]
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
    @inline
    def apply(
        HashKeyRange: HashKeyRange,
        SequenceNumberRange: SequenceNumberRange,
        ShardId: ShardId,
        AdjacentParentShardId: js.UndefOr[ShardId] = js.undefined,
        ParentShardId: js.UndefOr[ShardId] = js.undefined
    ): Shard = {
      val __obj = js.Dynamic.literal(
        "HashKeyRange"        -> HashKeyRange.asInstanceOf[js.Any],
        "SequenceNumberRange" -> SequenceNumberRange.asInstanceOf[js.Any],
        "ShardId"             -> ShardId.asInstanceOf[js.Any]
      )

      AdjacentParentShardId.foreach(__v => __obj.updateDynamic("AdjacentParentShardId")(__v.asInstanceOf[js.Any]))
      ParentShardId.foreach(__v => __obj.updateDynamic("ParentShardId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Shard]
    }
  }

  object ShardIteratorTypeEnum {
    val AT_SEQUENCE_NUMBER    = "AT_SEQUENCE_NUMBER"
    val AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER"
    val TRIM_HORIZON          = "TRIM_HORIZON"
    val LATEST                = "LATEST"
    val AT_TIMESTAMP          = "AT_TIMESTAMP"

    val values =
      js.Object.freeze(js.Array(AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST, AT_TIMESTAMP))
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
    @inline
    def apply(
        NewStartingHashKey: HashKey,
        ShardToSplit: ShardId,
        StreamName: StreamName
    ): SplitShardInput = {
      val __obj = js.Dynamic.literal(
        "NewStartingHashKey" -> NewStartingHashKey.asInstanceOf[js.Any],
        "ShardToSplit"       -> ShardToSplit.asInstanceOf[js.Any],
        "StreamName"         -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SplitShardInput]
    }
  }

  @js.native
  trait StartStreamEncryptionInput extends js.Object {
    var EncryptionType: EncryptionType
    var KeyId: KeyId
    var StreamName: StreamName
  }

  object StartStreamEncryptionInput {
    @inline
    def apply(
        EncryptionType: EncryptionType,
        KeyId: KeyId,
        StreamName: StreamName
    ): StartStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(
        "EncryptionType" -> EncryptionType.asInstanceOf[js.Any],
        "KeyId"          -> KeyId.asInstanceOf[js.Any],
        "StreamName"     -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartStreamEncryptionInput]
    }
  }

  @js.native
  trait StartingPosition extends js.Object {
    var Type: ShardIteratorType
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object StartingPosition {
    @inline
    def apply(
        Type: ShardIteratorType,
        SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): StartingPosition = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      SequenceNumber.foreach(__v => __obj.updateDynamic("SequenceNumber")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartingPosition]
    }
  }

  @js.native
  trait StopStreamEncryptionInput extends js.Object {
    var EncryptionType: EncryptionType
    var KeyId: KeyId
    var StreamName: StreamName
  }

  object StopStreamEncryptionInput {
    @inline
    def apply(
        EncryptionType: EncryptionType,
        KeyId: KeyId,
        StreamName: StreamName
    ): StopStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(
        "EncryptionType" -> EncryptionType.asInstanceOf[js.Any],
        "KeyId"          -> KeyId.asInstanceOf[js.Any],
        "StreamName"     -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopStreamEncryptionInput]
    }
  }

  /**
    * Represents the output for <a>DescribeStream</a>.
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
    @inline
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
        KeyId: js.UndefOr[KeyId] = js.undefined
    ): StreamDescription = {
      val __obj = js.Dynamic.literal(
        "EnhancedMonitoring"      -> EnhancedMonitoring.asInstanceOf[js.Any],
        "HasMoreShards"           -> HasMoreShards.asInstanceOf[js.Any],
        "RetentionPeriodHours"    -> RetentionPeriodHours.asInstanceOf[js.Any],
        "Shards"                  -> Shards.asInstanceOf[js.Any],
        "StreamARN"               -> StreamARN.asInstanceOf[js.Any],
        "StreamCreationTimestamp" -> StreamCreationTimestamp.asInstanceOf[js.Any],
        "StreamName"              -> StreamName.asInstanceOf[js.Any],
        "StreamStatus"            -> StreamStatus.asInstanceOf[js.Any]
      )

      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamDescription]
    }
  }

  /**
    * Represents the output for <a>DescribeStreamSummary</a>
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
    @inline
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
        KeyId: js.UndefOr[KeyId] = js.undefined
    ): StreamDescriptionSummary = {
      val __obj = js.Dynamic.literal(
        "EnhancedMonitoring"      -> EnhancedMonitoring.asInstanceOf[js.Any],
        "OpenShardCount"          -> OpenShardCount.asInstanceOf[js.Any],
        "RetentionPeriodHours"    -> RetentionPeriodHours.asInstanceOf[js.Any],
        "StreamARN"               -> StreamARN.asInstanceOf[js.Any],
        "StreamCreationTimestamp" -> StreamCreationTimestamp.asInstanceOf[js.Any],
        "StreamName"              -> StreamName.asInstanceOf[js.Any],
        "StreamStatus"            -> StreamStatus.asInstanceOf[js.Any]
      )

      ConsumerCount.foreach(__v => __obj.updateDynamic("ConsumerCount")(__v.asInstanceOf[js.Any]))
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamDescriptionSummary]
    }
  }

  object StreamStatusEnum {
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val ACTIVE   = "ACTIVE"
    val UPDATING = "UPDATING"

    val values = js.Object.freeze(js.Array(CREATING, DELETING, ACTIVE, UPDATING))
  }

  /**
    * After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer.
    */
  @js.native
  trait SubscribeToShardEvent extends js.Object {
    var ContinuationSequenceNumber: SequenceNumber
    var MillisBehindLatest: MillisBehindLatest
    var Records: RecordList
  }

  object SubscribeToShardEvent {
    @inline
    def apply(
        ContinuationSequenceNumber: SequenceNumber,
        MillisBehindLatest: MillisBehindLatest,
        Records: RecordList
    ): SubscribeToShardEvent = {
      val __obj = js.Dynamic.literal(
        "ContinuationSequenceNumber" -> ContinuationSequenceNumber.asInstanceOf[js.Any],
        "MillisBehindLatest"         -> MillisBehindLatest.asInstanceOf[js.Any],
        "Records"                    -> Records.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubscribeToShardEvent]
    }
  }

  @js.native
  trait SubscribeToShardEventStream extends js.Object {
    var SubscribeToShardEvent: SubscribeToShardEvent
  }

  object SubscribeToShardEventStream {
    @inline
    def apply(
        SubscribeToShardEvent: SubscribeToShardEvent
    ): SubscribeToShardEventStream = {
      val __obj = js.Dynamic.literal(
        "SubscribeToShardEvent" -> SubscribeToShardEvent.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubscribeToShardEventStream]
    }
  }

  @js.native
  trait SubscribeToShardInput extends js.Object {
    var ConsumerARN: ConsumerARN
    var ShardId: ShardId
    var StartingPosition: StartingPosition
  }

  object SubscribeToShardInput {
    @inline
    def apply(
        ConsumerARN: ConsumerARN,
        ShardId: ShardId,
        StartingPosition: StartingPosition
    ): SubscribeToShardInput = {
      val __obj = js.Dynamic.literal(
        "ConsumerARN"      -> ConsumerARN.asInstanceOf[js.Any],
        "ShardId"          -> ShardId.asInstanceOf[js.Any],
        "StartingPosition" -> StartingPosition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubscribeToShardInput]
    }
  }

  @js.native
  trait SubscribeToShardOutput extends js.Object {
    var EventStream: SubscribeToShardEventStream
  }

  object SubscribeToShardOutput {
    @inline
    def apply(
        EventStream: SubscribeToShardEventStream
    ): SubscribeToShardOutput = {
      val __obj = js.Dynamic.literal(
        "EventStream" -> EventStream.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubscribeToShardOutput]
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
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait UpdateShardCountInput extends js.Object {
    var ScalingType: ScalingType
    var StreamName: StreamName
    var TargetShardCount: PositiveIntegerObject
  }

  object UpdateShardCountInput {
    @inline
    def apply(
        ScalingType: ScalingType,
        StreamName: StreamName,
        TargetShardCount: PositiveIntegerObject
    ): UpdateShardCountInput = {
      val __obj = js.Dynamic.literal(
        "ScalingType"      -> ScalingType.asInstanceOf[js.Any],
        "StreamName"       -> StreamName.asInstanceOf[js.Any],
        "TargetShardCount" -> TargetShardCount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateShardCountInput]
    }
  }

  @js.native
  trait UpdateShardCountOutput extends js.Object {
    var CurrentShardCount: js.UndefOr[PositiveIntegerObject]
    var StreamName: js.UndefOr[StreamName]
    var TargetShardCount: js.UndefOr[PositiveIntegerObject]
  }

  object UpdateShardCountOutput {
    @inline
    def apply(
        CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined,
        TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
    ): UpdateShardCountOutput = {
      val __obj = js.Dynamic.literal()
      CurrentShardCount.foreach(__v => __obj.updateDynamic("CurrentShardCount")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      TargetShardCount.foreach(__v => __obj.updateDynamic("TargetShardCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateShardCountOutput]
    }
  }
}
