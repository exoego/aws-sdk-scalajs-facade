package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object kinesis {
  type BooleanObject = Boolean
  type Data = js.Array[Byte]
  type DescribeStreamInputLimit = Integer
  type ErrorCode = String
  type ErrorMessage = String
  type GetRecordsInputLimit = Integer
  type HashKey = String
  type ListStreamsInputLimit = Integer
  type ListTagsForStreamInputLimit = Integer
  type PartitionKey = String
  type PositiveIntegerObject = Integer
  type PutRecordsRequestEntryList = js.Array[PutRecordsRequestEntry]
  type PutRecordsResultEntryList = js.Array[PutRecordsResultEntry]
  type RecordList = js.Array[Record]
  type SequenceNumber = String
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
}

package kinesis {
  @js.native
  trait Kinesis extends js.Object {
    def addTagsToStream(params: AddTagsToStreamInput, callback: Callback[js.Object]): Unit = js.native
    def addTagsToStream(params: AddTagsToStreamInput): Request[js.Object] = js.native
    def createStream(params: CreateStreamInput, callback: Callback[js.Object]): Unit = js.native
    def createStream(params: CreateStreamInput): Request[js.Object] = js.native
    def deleteStream(params: DeleteStreamInput, callback: Callback[js.Object]): Unit = js.native
    def deleteStream(params: DeleteStreamInput): Request[js.Object] = js.native
    def describeStream(params: DescribeStreamInput, callback: Callback[DescribeStreamOutput]): Unit = js.native
    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput] = js.native
    def getRecords(params: GetRecordsInput, callback: Callback[GetRecordsOutput]): Unit = js.native
    def getRecords(params: GetRecordsInput): Request[GetRecordsOutput] = js.native
    def getShardIterator(params: GetShardIteratorInput, callback: Callback[GetShardIteratorOutput]): Unit = js.native
    def getShardIterator(params: GetShardIteratorInput): Request[GetShardIteratorOutput] = js.native
    def listStreams(params: ListStreamsInput, callback: Callback[ListStreamsOutput]): Unit = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput] = js.native
    def listTagsForStream(params: ListTagsForStreamInput, callback: Callback[ListTagsForStreamOutput]): Unit = js.native
    def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput] = js.native
    def mergeShards(params: MergeShardsInput, callback: Callback[js.Object]): Unit = js.native
    def mergeShards(params: MergeShardsInput): Request[js.Object] = js.native
    def putRecord(params: PutRecordInput, callback: Callback[PutRecordOutput]): Unit = js.native
    def putRecord(params: PutRecordInput): Request[PutRecordOutput] = js.native
    def putRecords(params: PutRecordsInput, callback: Callback[PutRecordsOutput]): Unit = js.native
    def putRecords(params: PutRecordsInput): Request[PutRecordsOutput] = js.native
    def removeTagsFromStream(params: RemoveTagsFromStreamInput, callback: Callback[js.Object]): Unit = js.native
    def removeTagsFromStream(params: RemoveTagsFromStreamInput): Request[js.Object] = js.native
    def splitShard(params: SplitShardInput, callback: Callback[js.Object]): Unit = js.native
    def splitShard(params: SplitShardInput): Request[js.Object] = js.native
  }

  /**
   * <p>Represents the input for <code>AddTagsToStream</code>.</p>
   */
  @js.native
  trait AddTagsToStreamInput extends js.Object {
    var StreamName: StreamName
    var Tags: TagMap
  }

  object AddTagsToStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      Tags: js.UndefOr[TagMap] = js.undefined
    ): AddTagsToStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToStreamInput]
    }
  }

  /**
   * <p>Represents the input for <code>CreateStream</code>.</p>
   */
  @js.native
  trait CreateStreamInput extends js.Object {
    var StreamName: StreamName
    var ShardCount: PositiveIntegerObject
  }

  object CreateStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
    ): CreateStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("ShardCount" -> ShardCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamInput]
    }
  }

  /**
   * <p>Represents the input for <code>DeleteStream</code>.</p>
   */
  @js.native
  trait DeleteStreamInput extends js.Object {
    var StreamName: StreamName
  }

  object DeleteStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined
    ): DeleteStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamInput]
    }
  }

  /**
   * <p>Represents the input for <code>DescribeStream</code>.</p>
   */
  @js.native
  trait DescribeStreamInput extends js.Object {
    var StreamName: StreamName
    var Limit: DescribeStreamInputLimit
    var ExclusiveStartShardId: ShardId
  }

  object DescribeStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      Limit: js.UndefOr[DescribeStreamInputLimit] = js.undefined,
      ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
    ): DescribeStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("ExclusiveStartShardId" -> ExclusiveStartShardId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamInput]
    }
  }

  /**
   * <p>Represents the output for <code>DescribeStream</code>.</p>
   */
  @js.native
  trait DescribeStreamOutput extends js.Object {
    var StreamDescription: StreamDescription
  }

  object DescribeStreamOutput {
    def apply(
      StreamDescription: js.UndefOr[StreamDescription] = js.undefined
    ): DescribeStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamDescription" -> StreamDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamOutput]
    }
  }

  /**
   * <p>The provided iterator exceeds the maximum age allowed.</p>
   */
  @js.native
  trait ExpiredIteratorExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Represents the input for <code>GetRecords</code>.</p>
   */
  @js.native
  trait GetRecordsInput extends js.Object {
    var ShardIterator: ShardIterator
    var Limit: GetRecordsInputLimit
  }

  object GetRecordsInput {
    def apply(
      ShardIterator: js.UndefOr[ShardIterator] = js.undefined,
      Limit: js.UndefOr[GetRecordsInputLimit] = js.undefined
    ): GetRecordsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ShardIterator" -> ShardIterator.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRecordsInput]
    }
  }

  /**
   * <p>Represents the output for <code>GetRecords</code>.</p>
   */
  @js.native
  trait GetRecordsOutput extends js.Object {
    var Records: RecordList
    var NextShardIterator: ShardIterator
  }

  object GetRecordsOutput {
    def apply(
      Records: js.UndefOr[RecordList] = js.undefined,
      NextShardIterator: js.UndefOr[ShardIterator] = js.undefined
    ): GetRecordsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Records" -> Records.map { x => x: js.Any }),
        ("NextShardIterator" -> NextShardIterator.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRecordsOutput]
    }
  }

  /**
   * <p>Represents the input for <code>GetShardIterator</code>.</p>
   */
  @js.native
  trait GetShardIteratorInput extends js.Object {
    var StreamName: StreamName
    var ShardId: ShardId
    var ShardIteratorType: ShardIteratorType
    var StartingSequenceNumber: SequenceNumber
  }

  object GetShardIteratorInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined,
      ShardIteratorType: js.UndefOr[ShardIteratorType] = js.undefined,
      StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    ): GetShardIteratorInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("ShardId" -> ShardId.map { x => x: js.Any }),
        ("ShardIteratorType" -> ShardIteratorType.map { x => x: js.Any }),
        ("StartingSequenceNumber" -> StartingSequenceNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShardIteratorInput]
    }
  }

  /**
   * <p>Represents the output for <code>GetShardIterator</code>.</p>
   */
  @js.native
  trait GetShardIteratorOutput extends js.Object {
    var ShardIterator: ShardIterator
  }

  object GetShardIteratorOutput {
    def apply(
      ShardIterator: js.UndefOr[ShardIterator] = js.undefined
    ): GetShardIteratorOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ShardIterator" -> ShardIterator.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShardIteratorOutput]
    }
  }

  /**
   * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
   */
  @js.native
  trait HashKeyRange extends js.Object {
    var StartingHashKey: HashKey
    var EndingHashKey: HashKey
  }

  object HashKeyRange {
    def apply(
      StartingHashKey: js.UndefOr[HashKey] = js.undefined,
      EndingHashKey: js.UndefOr[HashKey] = js.undefined
    ): HashKeyRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartingHashKey" -> StartingHashKey.map { x => x: js.Any }),
        ("EndingHashKey" -> EndingHashKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HashKeyRange]
    }
  }

  /**
   * <p>A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information, see the returned message.</p>
   */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed (5).</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Represents the input for <code>ListStreams</code>.</p>
   */
  @js.native
  trait ListStreamsInput extends js.Object {
    var Limit: ListStreamsInputLimit
    var ExclusiveStartStreamName: StreamName
  }

  object ListStreamsInput {
    def apply(
      Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined,
      ExclusiveStartStreamName: js.UndefOr[StreamName] = js.undefined
    ): ListStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("ExclusiveStartStreamName" -> ExclusiveStartStreamName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsInput]
    }
  }

  /**
   * <p>Represents the output for <code>ListStreams</code>.</p>
   */
  @js.native
  trait ListStreamsOutput extends js.Object {
    var StreamNames: StreamNameList
    var HasMoreStreams: BooleanObject
  }

  object ListStreamsOutput {
    def apply(
      StreamNames: js.UndefOr[StreamNameList] = js.undefined,
      HasMoreStreams: js.UndefOr[BooleanObject] = js.undefined
    ): ListStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamNames" -> StreamNames.map { x => x: js.Any }),
        ("HasMoreStreams" -> HasMoreStreams.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsOutput]
    }
  }

  /**
   * <p>Represents the input for <code>ListTagsForStream</code>.</p>
   */
  @js.native
  trait ListTagsForStreamInput extends js.Object {
    var StreamName: StreamName
    var ExclusiveStartTagKey: TagKey
    var Limit: ListTagsForStreamInputLimit
  }

  object ListTagsForStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined,
      Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.undefined
    ): ListTagsForStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("ExclusiveStartTagKey" -> ExclusiveStartTagKey.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForStreamInput]
    }
  }

  /**
   * <p>Represents the output for <code>ListTagsForStream</code>.</p>
   */
  @js.native
  trait ListTagsForStreamOutput extends js.Object {
    var Tags: TagList
    var HasMoreTags: BooleanObject
  }

  object ListTagsForStreamOutput {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      HasMoreTags: js.UndefOr[BooleanObject] = js.undefined
    ): ListTagsForStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("HasMoreTags" -> HasMoreTags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForStreamOutput]
    }
  }

  /**
   * <p>Represents the input for <code>MergeShards</code>.</p>
   */
  @js.native
  trait MergeShardsInput extends js.Object {
    var StreamName: StreamName
    var ShardToMerge: ShardId
    var AdjacentShardToMerge: ShardId
  }

  object MergeShardsInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardToMerge: js.UndefOr[ShardId] = js.undefined,
      AdjacentShardToMerge: js.UndefOr[ShardId] = js.undefined
    ): MergeShardsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("ShardToMerge" -> ShardToMerge.map { x => x: js.Any }),
        ("AdjacentShardToMerge" -> AdjacentShardToMerge.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergeShardsInput]
    }
  }

  /**
   * <p>The request rate is too high, or the requested data is too large for the available throughput. Reduce the frequency or size of your requests. For more information, see <a href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html" target="_blank">Error Retries and Exponential Backoff in AWS</a> in the <i>AWS General Reference</i>.</p>
   */
  @js.native
  trait ProvisionedThroughputExceededExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Represents the input for <code>PutRecord</code>.</p>
   */
  @js.native
  trait PutRecordInput extends js.Object {
    var ExplicitHashKey: HashKey
    var PartitionKey: PartitionKey
    var SequenceNumberForOrdering: SequenceNumber
    var StreamName: StreamName
    var Data: Data
  }

  object PutRecordInput {
    def apply(
      ExplicitHashKey: js.UndefOr[HashKey] = js.undefined,
      PartitionKey: js.UndefOr[PartitionKey] = js.undefined,
      SequenceNumberForOrdering: js.UndefOr[SequenceNumber] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      Data: js.UndefOr[Data] = js.undefined
    ): PutRecordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExplicitHashKey" -> ExplicitHashKey.map { x => x: js.Any }),
        ("PartitionKey" -> PartitionKey.map { x => x: js.Any }),
        ("SequenceNumberForOrdering" -> SequenceNumberForOrdering.map { x => x: js.Any }),
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("Data" -> Data.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordInput]
    }
  }

  /**
   * <p>Represents the output for <code>PutRecord</code>.</p>
   */
  @js.native
  trait PutRecordOutput extends js.Object {
    var ShardId: ShardId
    var SequenceNumber: SequenceNumber
  }

  object PutRecordOutput {
    def apply(
      ShardId: js.UndefOr[ShardId] = js.undefined,
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    ): PutRecordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ShardId" -> ShardId.map { x => x: js.Any }),
        ("SequenceNumber" -> SequenceNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordOutput]
    }
  }

  /**
   * <p>A <code>PutRecords</code> request.</p>
   */
  @js.native
  trait PutRecordsInput extends js.Object {
    var Records: PutRecordsRequestEntryList
    var StreamName: StreamName
  }

  object PutRecordsInput {
    def apply(
      Records: js.UndefOr[PutRecordsRequestEntryList] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined
    ): PutRecordsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Records" -> Records.map { x => x: js.Any }),
        ("StreamName" -> StreamName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsInput]
    }
  }

  /**
   * <p><code>PutRecords</code> results.</p>
   */
  @js.native
  trait PutRecordsOutput extends js.Object {
    var FailedRecordCount: PositiveIntegerObject
    var Records: PutRecordsResultEntryList
  }

  object PutRecordsOutput {
    def apply(
      FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.undefined,
      Records: js.UndefOr[PutRecordsResultEntryList] = js.undefined
    ): PutRecordsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailedRecordCount" -> FailedRecordCount.map { x => x: js.Any }),
        ("Records" -> Records.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsOutput]
    }
  }

  /**
   * <p>Represents the output for <code>PutRecords</code>.</p>
   */
  @js.native
  trait PutRecordsRequestEntry extends js.Object {
    var Data: Data
    var ExplicitHashKey: HashKey
    var PartitionKey: PartitionKey
  }

  object PutRecordsRequestEntry {
    def apply(
      Data: js.UndefOr[Data] = js.undefined,
      ExplicitHashKey: js.UndefOr[HashKey] = js.undefined,
      PartitionKey: js.UndefOr[PartitionKey] = js.undefined
    ): PutRecordsRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Data" -> Data.map { x => x: js.Any }),
        ("ExplicitHashKey" -> ExplicitHashKey.map { x => x: js.Any }),
        ("PartitionKey" -> PartitionKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsRequestEntry]
    }
  }

  /**
   * <p>Represents the result of an individual record from a <code>PutRecords</code> request. A record that is successfully added to your Amazon Kinesis stream includes SequenceNumber and ShardId in the result. A record that fails to be added to your Amazon Kinesis stream includes ErrorCode and ErrorMessage in the result.</p>
   */
  @js.native
  trait PutRecordsResultEntry extends js.Object {
    var SequenceNumber: SequenceNumber
    var ShardId: ShardId
    var ErrorCode: ErrorCode
    var ErrorMessage: ErrorMessage
  }

  object PutRecordsResultEntry {
    def apply(
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): PutRecordsResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SequenceNumber" -> SequenceNumber.map { x => x: js.Any }),
        ("ShardId" -> ShardId.map { x => x: js.Any }),
        ("ErrorCode" -> ErrorCode.map { x => x: js.Any }),
        ("ErrorMessage" -> ErrorMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsResultEntry]
    }
  }

  /**
   * <p>The unit of data of the Amazon Kinesis stream, which is composed of a sequence number, a partition key, and a data blob.</p>
   */
  @js.native
  trait Record extends js.Object {
    var SequenceNumber: SequenceNumber
    var Data: Data
    var PartitionKey: PartitionKey
  }

  object Record {
    def apply(
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      Data: js.UndefOr[Data] = js.undefined,
      PartitionKey: js.UndefOr[PartitionKey] = js.undefined
    ): Record = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SequenceNumber" -> SequenceNumber.map { x => x: js.Any }),
        ("Data" -> Data.map { x => x: js.Any }),
        ("PartitionKey" -> PartitionKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
    }
  }

  /**
   * <p>Represents the input for <code>RemoveTagsFromStream</code>.</p>
   */
  @js.native
  trait RemoveTagsFromStreamInput extends js.Object {
    var StreamName: StreamName
    var TagKeys: TagKeyList
  }

  object RemoveTagsFromStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): RemoveTagsFromStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromStreamInput]
    }
  }

  /**
   * <p>The resource is not available for this operation. For example, you attempted to split a shard but the stream is not in the <code>ACTIVE</code> state.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The requested resource could not be found. It might not be specified correctly, or it might not be in the <code>ACTIVE</code> state.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The range of possible sequence numbers for the shard.</p>
   */
  @js.native
  trait SequenceNumberRange extends js.Object {
    var StartingSequenceNumber: SequenceNumber
    var EndingSequenceNumber: SequenceNumber
  }

  object SequenceNumberRange {
    def apply(
      StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    ): SequenceNumberRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartingSequenceNumber" -> StartingSequenceNumber.map { x => x: js.Any }),
        ("EndingSequenceNumber" -> EndingSequenceNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SequenceNumberRange]
    }
  }

  /**
   * <p>A uniquely identified group of data records in an Amazon Kinesis stream.</p>
   */
  @js.native
  trait Shard extends js.Object {
    var ParentShardId: ShardId
    var AdjacentParentShardId: ShardId
    var HashKeyRange: HashKeyRange
    var SequenceNumberRange: SequenceNumberRange
    var ShardId: ShardId
  }

  object Shard {
    def apply(
      ParentShardId: js.UndefOr[ShardId] = js.undefined,
      AdjacentParentShardId: js.UndefOr[ShardId] = js.undefined,
      HashKeyRange: js.UndefOr[HashKeyRange] = js.undefined,
      SequenceNumberRange: js.UndefOr[SequenceNumberRange] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined
    ): Shard = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParentShardId" -> ParentShardId.map { x => x: js.Any }),
        ("AdjacentParentShardId" -> AdjacentParentShardId.map { x => x: js.Any }),
        ("HashKeyRange" -> HashKeyRange.map { x => x: js.Any }),
        ("SequenceNumberRange" -> SequenceNumberRange.map { x => x: js.Any }),
        ("ShardId" -> ShardId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Shard]
    }
  }


  object ShardIteratorTypeEnum {
    val `AT_SEQUENCE_NUMBER` = "AT_SEQUENCE_NUMBER"
    val `AFTER_SEQUENCE_NUMBER` = "AFTER_SEQUENCE_NUMBER"
    val `TRIM_HORIZON` = "TRIM_HORIZON"
    val LATEST = "LATEST"

    val values = IndexedSeq(`AT_SEQUENCE_NUMBER`, `AFTER_SEQUENCE_NUMBER`, `TRIM_HORIZON`, LATEST)
  }

  /**
   * <p>Represents the input for <code>SplitShard</code>.</p>
   */
  @js.native
  trait SplitShardInput extends js.Object {
    var StreamName: StreamName
    var ShardToSplit: ShardId
    var NewStartingHashKey: HashKey
  }

  object SplitShardInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardToSplit: js.UndefOr[ShardId] = js.undefined,
      NewStartingHashKey: js.UndefOr[HashKey] = js.undefined
    ): SplitShardInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("ShardToSplit" -> ShardToSplit.map { x => x: js.Any }),
        ("NewStartingHashKey" -> NewStartingHashKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplitShardInput]
    }
  }

  /**
   * <p>Represents the output for <code>DescribeStream</code>.</p>
   */
  @js.native
  trait StreamDescription extends js.Object {
    var StreamARN: StreamARN
    var StreamStatus: StreamStatus
    var StreamName: StreamName
    var HasMoreShards: BooleanObject
    var Shards: ShardList
  }

  object StreamDescription {
    def apply(
      StreamARN: js.UndefOr[StreamARN] = js.undefined,
      StreamStatus: js.UndefOr[StreamStatus] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      HasMoreShards: js.UndefOr[BooleanObject] = js.undefined,
      Shards: js.UndefOr[ShardList] = js.undefined
    ): StreamDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamARN" -> StreamARN.map { x => x: js.Any }),
        ("StreamStatus" -> StreamStatus.map { x => x: js.Any }),
        ("StreamName" -> StreamName.map { x => x: js.Any }),
        ("HasMoreShards" -> HasMoreShards.map { x => x: js.Any }),
        ("Shards" -> Shards.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamDescription]
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
   * <p>Metadata assigned to the stream, consisting of a key-value pair.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }
}
