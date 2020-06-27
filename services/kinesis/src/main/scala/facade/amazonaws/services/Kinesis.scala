package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object kinesis {
  type BooleanObject                 = Boolean
  type ConsumerARN                   = String
  type ConsumerCountObject           = Int
  type ConsumerList                  = js.Array[Consumer]
  type ConsumerName                  = String
  type Data                          = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DescribeStreamInputLimit      = Int
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
  type MetricsNameList               = js.Array[MetricsName]
  type MillisBehindLatest            = Double
  type NextToken                     = String
  type PartitionKey                  = String
  type PositiveIntegerObject         = Int
  type PutRecordsRequestEntryList    = js.Array[PutRecordsRequestEntry]
  type PutRecordsResultEntryList     = js.Array[PutRecordsResultEntry]
  type RecordList                    = js.Array[Record]
  type RetentionPeriodHours          = Int
  type SequenceNumber                = String
  type ShardCountObject              = Int
  type ShardId                       = String
  type ShardIterator                 = String
  type ShardList                     = js.Array[Shard]
  type StreamARN                     = String
  type StreamName                    = String
  type StreamNameList                = js.Array[StreamName]
  type TagKey                        = String
  type TagKeyList                    = js.Array[TagKey]
  type TagList                       = js.Array[Tag]
  type TagMap                        = js.Dictionary[TagValue]
  type TagValue                      = String
  type Timestamp                     = js.Date

  implicit final class KinesisOps(private val service: Kinesis) extends AnyVal {

    @inline def addTagsToStreamFuture(params: AddTagsToStreamInput): Future[js.Object] =
      service.addTagsToStream(params).promise().toFuture
    @inline def createStreamFuture(params: CreateStreamInput): Future[js.Object] =
      service.createStream(params).promise().toFuture
    @inline def decreaseStreamRetentionPeriodFuture(params: DecreaseStreamRetentionPeriodInput): Future[js.Object] =
      service.decreaseStreamRetentionPeriod(params).promise().toFuture
    @inline def deleteStreamFuture(params: DeleteStreamInput): Future[js.Object] =
      service.deleteStream(params).promise().toFuture
    @inline def deregisterStreamConsumerFuture(params: DeregisterStreamConsumerInput): Future[js.Object] =
      service.deregisterStreamConsumer(params).promise().toFuture
    @inline def describeLimitsFuture(params: DescribeLimitsInput): Future[DescribeLimitsOutput] =
      service.describeLimits(params).promise().toFuture
    @inline def describeStreamConsumerFuture(
        params: DescribeStreamConsumerInput
    ): Future[DescribeStreamConsumerOutput] = service.describeStreamConsumer(params).promise().toFuture
    @inline def describeStreamFuture(params: DescribeStreamInput): Future[DescribeStreamOutput] =
      service.describeStream(params).promise().toFuture
    @inline def describeStreamSummaryFuture(params: DescribeStreamSummaryInput): Future[DescribeStreamSummaryOutput] =
      service.describeStreamSummary(params).promise().toFuture
    @inline def disableEnhancedMonitoringFuture(
        params: DisableEnhancedMonitoringInput
    ): Future[EnhancedMonitoringOutput] = service.disableEnhancedMonitoring(params).promise().toFuture
    @inline def enableEnhancedMonitoringFuture(
        params: EnableEnhancedMonitoringInput
    ): Future[EnhancedMonitoringOutput] = service.enableEnhancedMonitoring(params).promise().toFuture
    @inline def getRecordsFuture(params: GetRecordsInput): Future[GetRecordsOutput] =
      service.getRecords(params).promise().toFuture
    @inline def getShardIteratorFuture(params: GetShardIteratorInput): Future[GetShardIteratorOutput] =
      service.getShardIterator(params).promise().toFuture
    @inline def increaseStreamRetentionPeriodFuture(params: IncreaseStreamRetentionPeriodInput): Future[js.Object] =
      service.increaseStreamRetentionPeriod(params).promise().toFuture
    @inline def listShardsFuture(params: ListShardsInput): Future[ListShardsOutput] =
      service.listShards(params).promise().toFuture
    @inline def listStreamConsumersFuture(params: ListStreamConsumersInput): Future[ListStreamConsumersOutput] =
      service.listStreamConsumers(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsInput): Future[ListStreamsOutput] =
      service.listStreams(params).promise().toFuture
    @inline def listTagsForStreamFuture(params: ListTagsForStreamInput): Future[ListTagsForStreamOutput] =
      service.listTagsForStream(params).promise().toFuture
    @inline def mergeShardsFuture(params: MergeShardsInput): Future[js.Object] =
      service.mergeShards(params).promise().toFuture
    @inline def putRecordFuture(params: PutRecordInput): Future[PutRecordOutput] =
      service.putRecord(params).promise().toFuture
    @inline def putRecordsFuture(params: PutRecordsInput): Future[PutRecordsOutput] =
      service.putRecords(params).promise().toFuture
    @inline def registerStreamConsumerFuture(
        params: RegisterStreamConsumerInput
    ): Future[RegisterStreamConsumerOutput] = service.registerStreamConsumer(params).promise().toFuture
    @inline def removeTagsFromStreamFuture(params: RemoveTagsFromStreamInput): Future[js.Object] =
      service.removeTagsFromStream(params).promise().toFuture
    @inline def splitShardFuture(params: SplitShardInput): Future[js.Object] =
      service.splitShard(params).promise().toFuture
    @inline def startStreamEncryptionFuture(params: StartStreamEncryptionInput): Future[js.Object] =
      service.startStreamEncryption(params).promise().toFuture
    @inline def stopStreamEncryptionFuture(params: StopStreamEncryptionInput): Future[js.Object] =
      service.stopStreamEncryption(params).promise().toFuture
    @inline def updateShardCountFuture(params: UpdateShardCountInput): Future[UpdateShardCountOutput] =
      service.updateShardCount(params).promise().toFuture
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
  @Factory
  trait AddTagsToStreamInput extends js.Object {
    var StreamName: StreamName
    var Tags: TagMap
  }

  /**
    * An object that represents the details of the consumer you registered.
    */
  @js.native
  @Factory
  trait Consumer extends js.Object {
    var ConsumerARN: ConsumerARN
    var ConsumerCreationTimestamp: Timestamp
    var ConsumerName: ConsumerName
    var ConsumerStatus: ConsumerStatus
  }

  /**
    * An object that represents the details of a registered consumer.
    */
  @js.native
  @Factory
  trait ConsumerDescription extends js.Object {
    var ConsumerARN: ConsumerARN
    var ConsumerCreationTimestamp: Timestamp
    var ConsumerName: ConsumerName
    var ConsumerStatus: ConsumerStatus
    var StreamARN: StreamARN
  }

  @js.native
  sealed trait ConsumerStatus extends js.Any
  object ConsumerStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[ConsumerStatus]
    val DELETING = "DELETING".asInstanceOf[ConsumerStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[ConsumerStatus]

    val values = js.Object.freeze(js.Array(CREATING, DELETING, ACTIVE))
  }

  /**
    * Represents the input for <code>CreateStream</code>.
    */
  @js.native
  @Factory
  trait CreateStreamInput extends js.Object {
    var ShardCount: PositiveIntegerObject
    var StreamName: StreamName
  }

  /**
    * Represents the input for <a>DecreaseStreamRetentionPeriod</a>.
    */
  @js.native
  @Factory
  trait DecreaseStreamRetentionPeriodInput extends js.Object {
    var RetentionPeriodHours: RetentionPeriodHours
    var StreamName: StreamName
  }

  /**
    * Represents the input for <a>DeleteStream</a>.
    */
  @js.native
  @Factory
  trait DeleteStreamInput extends js.Object {
    var StreamName: StreamName
    var EnforceConsumerDeletion: js.UndefOr[BooleanObject]
  }

  @js.native
  @Factory
  trait DeregisterStreamConsumerInput extends js.Object {
    var ConsumerARN: js.UndefOr[ConsumerARN]
    var ConsumerName: js.UndefOr[ConsumerName]
    var StreamARN: js.UndefOr[StreamARN]
  }

  @js.native
  @Factory
  trait DescribeLimitsInput extends js.Object {}

  @js.native
  @Factory
  trait DescribeLimitsOutput extends js.Object {
    var OpenShardCount: ShardCountObject
    var ShardLimit: ShardCountObject
  }

  @js.native
  @Factory
  trait DescribeStreamConsumerInput extends js.Object {
    var ConsumerARN: js.UndefOr[ConsumerARN]
    var ConsumerName: js.UndefOr[ConsumerName]
    var StreamARN: js.UndefOr[StreamARN]
  }

  @js.native
  @Factory
  trait DescribeStreamConsumerOutput extends js.Object {
    var ConsumerDescription: ConsumerDescription
  }

  /**
    * Represents the input for <code>DescribeStream</code>.
    */
  @js.native
  @Factory
  trait DescribeStreamInput extends js.Object {
    var StreamName: StreamName
    var ExclusiveStartShardId: js.UndefOr[ShardId]
    var Limit: js.UndefOr[DescribeStreamInputLimit]
  }

  /**
    * Represents the output for <code>DescribeStream</code>.
    */
  @js.native
  @Factory
  trait DescribeStreamOutput extends js.Object {
    var StreamDescription: StreamDescription
  }

  @js.native
  @Factory
  trait DescribeStreamSummaryInput extends js.Object {
    var StreamName: StreamName
  }

  @js.native
  @Factory
  trait DescribeStreamSummaryOutput extends js.Object {
    var StreamDescriptionSummary: StreamDescriptionSummary
  }

  /**
    * Represents the input for <a>DisableEnhancedMonitoring</a>.
    */
  @js.native
  @Factory
  trait DisableEnhancedMonitoringInput extends js.Object {
    var ShardLevelMetrics: MetricsNameList
    var StreamName: StreamName
  }

  /**
    * Represents the input for <a>EnableEnhancedMonitoring</a>.
    */
  @js.native
  @Factory
  trait EnableEnhancedMonitoringInput extends js.Object {
    var ShardLevelMetrics: MetricsNameList
    var StreamName: StreamName
  }

  @js.native
  sealed trait EncryptionType extends js.Any
  object EncryptionType extends js.Object {
    val NONE = "NONE".asInstanceOf[EncryptionType]
    val KMS  = "KMS".asInstanceOf[EncryptionType]

    val values = js.Object.freeze(js.Array(NONE, KMS))
  }

  /**
    * Represents enhanced metrics types.
    */
  @js.native
  @Factory
  trait EnhancedMetrics extends js.Object {
    var ShardLevelMetrics: js.UndefOr[MetricsNameList]
  }

  /**
    * Represents the output for <a>EnableEnhancedMonitoring</a> and <a>DisableEnhancedMonitoring</a>.
    */
  @js.native
  @Factory
  trait EnhancedMonitoringOutput extends js.Object {
    var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList]
    var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList]
    var StreamName: js.UndefOr[StreamName]
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
  @Factory
  trait GetRecordsInput extends js.Object {
    var ShardIterator: ShardIterator
    var Limit: js.UndefOr[GetRecordsInputLimit]
  }

  /**
    * Represents the output for <a>GetRecords</a>.
    */
  @js.native
  @Factory
  trait GetRecordsOutput extends js.Object {
    var Records: RecordList
    var MillisBehindLatest: js.UndefOr[MillisBehindLatest]
    var NextShardIterator: js.UndefOr[ShardIterator]
  }

  /**
    * Represents the input for <code>GetShardIterator</code>.
    */
  @js.native
  @Factory
  trait GetShardIteratorInput extends js.Object {
    var ShardId: ShardId
    var ShardIteratorType: ShardIteratorType
    var StreamName: StreamName
    var StartingSequenceNumber: js.UndefOr[SequenceNumber]
    var Timestamp: js.UndefOr[Timestamp]
  }

  /**
    * Represents the output for <code>GetShardIterator</code>.
    */
  @js.native
  @Factory
  trait GetShardIteratorOutput extends js.Object {
    var ShardIterator: js.UndefOr[ShardIterator]
  }

  /**
    * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
    */
  @js.native
  @Factory
  trait HashKeyRange extends js.Object {
    var EndingHashKey: HashKey
    var StartingHashKey: HashKey
  }

  /**
    * Represents the input for <a>IncreaseStreamRetentionPeriod</a>.
    */
  @js.native
  @Factory
  trait IncreaseStreamRetentionPeriodInput extends js.Object {
    var RetentionPeriodHours: RetentionPeriodHours
    var StreamName: StreamName
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
  @Factory
  trait ListShardsInput extends js.Object {
    var ExclusiveStartShardId: js.UndefOr[ShardId]
    var MaxResults: js.UndefOr[ListShardsInputLimit]
    var NextToken: js.UndefOr[NextToken]
    var StreamCreationTimestamp: js.UndefOr[Timestamp]
    var StreamName: js.UndefOr[StreamName]
  }

  @js.native
  @Factory
  trait ListShardsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Shards: js.UndefOr[ShardList]
  }

  @js.native
  @Factory
  trait ListStreamConsumersInput extends js.Object {
    var StreamARN: StreamARN
    var MaxResults: js.UndefOr[ListStreamConsumersInputLimit]
    var NextToken: js.UndefOr[NextToken]
    var StreamCreationTimestamp: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait ListStreamConsumersOutput extends js.Object {
    var Consumers: js.UndefOr[ConsumerList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input for <code>ListStreams</code>.
    */
  @js.native
  @Factory
  trait ListStreamsInput extends js.Object {
    var ExclusiveStartStreamName: js.UndefOr[StreamName]
    var Limit: js.UndefOr[ListStreamsInputLimit]
  }

  /**
    * Represents the output for <code>ListStreams</code>.
    */
  @js.native
  @Factory
  trait ListStreamsOutput extends js.Object {
    var HasMoreStreams: BooleanObject
    var StreamNames: StreamNameList
  }

  /**
    * Represents the input for <code>ListTagsForStream</code>.
    */
  @js.native
  @Factory
  trait ListTagsForStreamInput extends js.Object {
    var StreamName: StreamName
    var ExclusiveStartTagKey: js.UndefOr[TagKey]
    var Limit: js.UndefOr[ListTagsForStreamInputLimit]
  }

  /**
    * Represents the output for <code>ListTagsForStream</code>.
    */
  @js.native
  @Factory
  trait ListTagsForStreamOutput extends js.Object {
    var HasMoreTags: BooleanObject
    var Tags: TagList
  }

  /**
    * Represents the input for <code>MergeShards</code>.
    */
  @js.native
  @Factory
  trait MergeShardsInput extends js.Object {
    var AdjacentShardToMerge: ShardId
    var ShardToMerge: ShardId
    var StreamName: StreamName
  }

  @js.native
  sealed trait MetricsName extends js.Any
  object MetricsName extends js.Object {
    val IncomingBytes                      = "IncomingBytes".asInstanceOf[MetricsName]
    val IncomingRecords                    = "IncomingRecords".asInstanceOf[MetricsName]
    val OutgoingBytes                      = "OutgoingBytes".asInstanceOf[MetricsName]
    val OutgoingRecords                    = "OutgoingRecords".asInstanceOf[MetricsName]
    val WriteProvisionedThroughputExceeded = "WriteProvisionedThroughputExceeded".asInstanceOf[MetricsName]
    val ReadProvisionedThroughputExceeded  = "ReadProvisionedThroughputExceeded".asInstanceOf[MetricsName]
    val IteratorAgeMilliseconds            = "IteratorAgeMilliseconds".asInstanceOf[MetricsName]
    val ALL                                = "ALL".asInstanceOf[MetricsName]

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
  @Factory
  trait PutRecordInput extends js.Object {
    var Data: Data
    var PartitionKey: PartitionKey
    var StreamName: StreamName
    var ExplicitHashKey: js.UndefOr[HashKey]
    var SequenceNumberForOrdering: js.UndefOr[SequenceNumber]
  }

  /**
    * Represents the output for <code>PutRecord</code>.
    */
  @js.native
  @Factory
  trait PutRecordOutput extends js.Object {
    var SequenceNumber: SequenceNumber
    var ShardId: ShardId
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  /**
    * A <code>PutRecords</code> request.
    */
  @js.native
  @Factory
  trait PutRecordsInput extends js.Object {
    var Records: PutRecordsRequestEntryList
    var StreamName: StreamName
  }

  /**
    * <code>PutRecords</code> results.
    */
  @js.native
  @Factory
  trait PutRecordsOutput extends js.Object {
    var Records: PutRecordsResultEntryList
    var EncryptionType: js.UndefOr[EncryptionType]
    var FailedRecordCount: js.UndefOr[PositiveIntegerObject]
  }

  /**
    * Represents the output for <code>PutRecords</code>.
    */
  @js.native
  @Factory
  trait PutRecordsRequestEntry extends js.Object {
    var Data: Data
    var PartitionKey: PartitionKey
    var ExplicitHashKey: js.UndefOr[HashKey]
  }

  /**
    * Represents the result of an individual record from a <code>PutRecords</code> request. A record that is successfully added to a stream includes <code>SequenceNumber</code> and <code>ShardId</code> in the result. A record that fails to be added to the stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
    */
  @js.native
  @Factory
  trait PutRecordsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var ShardId: js.UndefOr[ShardId]
  }

  /**
    * The unit of data of the Kinesis data stream, which is composed of a sequence number, a partition key, and a data blob.
    */
  @js.native
  @Factory
  trait Record extends js.Object {
    var Data: Data
    var PartitionKey: PartitionKey
    var SequenceNumber: SequenceNumber
    var ApproximateArrivalTimestamp: js.UndefOr[Timestamp]
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  @js.native
  @Factory
  trait RegisterStreamConsumerInput extends js.Object {
    var ConsumerName: ConsumerName
    var StreamARN: StreamARN
  }

  @js.native
  @Factory
  trait RegisterStreamConsumerOutput extends js.Object {
    var Consumer: Consumer
  }

  /**
    * Represents the input for <code>RemoveTagsFromStream</code>.
    */
  @js.native
  @Factory
  trait RemoveTagsFromStreamInput extends js.Object {
    var StreamName: StreamName
    var TagKeys: TagKeyList
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

  @js.native
  sealed trait ScalingType extends js.Any
  object ScalingType extends js.Object {
    val UNIFORM_SCALING = "UNIFORM_SCALING".asInstanceOf[ScalingType]

    val values = js.Object.freeze(js.Array(UNIFORM_SCALING))
  }

  /**
    * The range of possible sequence numbers for the shard.
    */
  @js.native
  @Factory
  trait SequenceNumberRange extends js.Object {
    var StartingSequenceNumber: SequenceNumber
    var EndingSequenceNumber: js.UndefOr[SequenceNumber]
  }

  /**
    * A uniquely identified group of data records in a Kinesis data stream.
    */
  @js.native
  @Factory
  trait Shard extends js.Object {
    var HashKeyRange: HashKeyRange
    var SequenceNumberRange: SequenceNumberRange
    var ShardId: ShardId
    var AdjacentParentShardId: js.UndefOr[ShardId]
    var ParentShardId: js.UndefOr[ShardId]
  }

  @js.native
  sealed trait ShardIteratorType extends js.Any
  object ShardIteratorType extends js.Object {
    val AT_SEQUENCE_NUMBER    = "AT_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
    val AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
    val TRIM_HORIZON          = "TRIM_HORIZON".asInstanceOf[ShardIteratorType]
    val LATEST                = "LATEST".asInstanceOf[ShardIteratorType]
    val AT_TIMESTAMP          = "AT_TIMESTAMP".asInstanceOf[ShardIteratorType]

    val values =
      js.Object.freeze(js.Array(AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST, AT_TIMESTAMP))
  }

  /**
    * Represents the input for <code>SplitShard</code>.
    */
  @js.native
  @Factory
  trait SplitShardInput extends js.Object {
    var NewStartingHashKey: HashKey
    var ShardToSplit: ShardId
    var StreamName: StreamName
  }

  @js.native
  @Factory
  trait StartStreamEncryptionInput extends js.Object {
    var EncryptionType: EncryptionType
    var KeyId: KeyId
    var StreamName: StreamName
  }

  @js.native
  @Factory
  trait StartingPosition extends js.Object {
    var Type: ShardIteratorType
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var Timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait StopStreamEncryptionInput extends js.Object {
    var EncryptionType: EncryptionType
    var KeyId: KeyId
    var StreamName: StreamName
  }

  /**
    * Represents the output for <a>DescribeStream</a>.
    */
  @js.native
  @Factory
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

  /**
    * Represents the output for <a>DescribeStreamSummary</a>
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait StreamStatus extends js.Any
  object StreamStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[StreamStatus]
    val DELETING = "DELETING".asInstanceOf[StreamStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[StreamStatus]
    val UPDATING = "UPDATING".asInstanceOf[StreamStatus]

    val values = js.Object.freeze(js.Array(CREATING, DELETING, ACTIVE, UPDATING))
  }

  /**
    * After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer.
    */
  @js.native
  @Factory
  trait SubscribeToShardEvent extends js.Object {
    var ContinuationSequenceNumber: SequenceNumber
    var MillisBehindLatest: MillisBehindLatest
    var Records: RecordList
  }

  @js.native
  @Factory
  trait SubscribeToShardEventStream extends js.Object {
    var SubscribeToShardEvent: SubscribeToShardEvent
  }

  @js.native
  @Factory
  trait SubscribeToShardInput extends js.Object {
    var ConsumerARN: ConsumerARN
    var ShardId: ShardId
    var StartingPosition: StartingPosition
  }

  @js.native
  @Factory
  trait SubscribeToShardOutput extends js.Object {
    var EventStream: SubscribeToShardEventStream
  }

  /**
    * Metadata assigned to the stream, consisting of a key-value pair.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait UpdateShardCountInput extends js.Object {
    var ScalingType: ScalingType
    var StreamName: StreamName
    var TargetShardCount: PositiveIntegerObject
  }

  @js.native
  @Factory
  trait UpdateShardCountOutput extends js.Object {
    var CurrentShardCount: js.UndefOr[PositiveIntegerObject]
    var StreamName: js.UndefOr[StreamName]
    var TargetShardCount: js.UndefOr[PositiveIntegerObject]
  }
}
