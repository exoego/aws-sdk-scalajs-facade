package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object dynamodbstreams {
  type AttributeMap            = js.Dictionary[AttributeValue]
  type AttributeName           = String
  type BinaryAttributeValue    = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue   = Boolean
  type Date                    = js.Date
  type ErrorMessage            = String
  type KeySchema               = js.Array[KeySchemaElement]
  type KeySchemaAttributeName  = String
  type ListAttributeValue      = js.Array[AttributeValue]
  type MapAttributeValue       = js.Dictionary[AttributeValue]
  type NullAttributeValue      = Boolean
  type NumberAttributeValue    = String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  type PositiveIntegerObject   = Int
  type PositiveLongObject      = Double
  type RecordList              = js.Array[Record]
  type SequenceNumber          = String
  type ShardDescriptionList    = js.Array[Shard]
  type ShardId                 = String
  type ShardIterator           = String
  type StreamArn               = String
  type StreamList              = js.Array[Stream]
  type StringAttributeValue    = String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableName               = String

  implicit final class DynamoDBStreamsOps(private val service: DynamoDBStreams) extends AnyVal {

    @inline def describeStreamFuture(params: DescribeStreamInput): Future[DescribeStreamOutput] =
      service.describeStream(params).promise().toFuture
    @inline def getRecordsFuture(params: GetRecordsInput): Future[GetRecordsOutput] =
      service.getRecords(params).promise().toFuture
    @inline def getShardIteratorFuture(params: GetShardIteratorInput): Future[GetShardIteratorOutput] =
      service.getShardIterator(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsInput): Future[ListStreamsOutput] =
      service.listStreams(params).promise().toFuture
  }
}

package dynamodbstreams {
  @js.native
  @JSImport("aws-sdk", "DynamoDBStreams")
  class DynamoDBStreams() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput]       = js.native
    def getRecords(params: GetRecordsInput): Request[GetRecordsOutput]                   = js.native
    def getShardIterator(params: GetShardIteratorInput): Request[GetShardIteratorOutput] = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput]                = js.native
  }

  /**
    * Represents the data for an attribute. You can set one, and only one, of the elements.
    *  Each attribute in an item is a name-value pair. An attribute can be single-valued or multi-valued set. For example, a book item can have title and authors attributes. Each book has one title but can have many authors. The multi-valued attribute is a set; duplicate values are not allowed.
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

  /**
    * Represents the input of a <code>DescribeStream</code> operation.
    */
  @js.native
  @Factory
  trait DescribeStreamInput extends js.Object {
    var StreamArn: StreamArn
    var ExclusiveStartShardId: js.UndefOr[ShardId]
    var Limit: js.UndefOr[PositiveIntegerObject]
  }

  /**
    * Represents the output of a <code>DescribeStream</code> operation.
    */
  @js.native
  @Factory
  trait DescribeStreamOutput extends js.Object {
    var StreamDescription: js.UndefOr[StreamDescription]
  }

  /**
    * The shard iterator has expired and can no longer be used to retrieve stream records. A shard iterator expires 15 minutes after it is retrieved using the <code>GetShardIterator</code> action.
    */
  @js.native
  trait ExpiredIteratorExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Represents the input of a <code>GetRecords</code> operation.
    */
  @js.native
  @Factory
  trait GetRecordsInput extends js.Object {
    var ShardIterator: ShardIterator
    var Limit: js.UndefOr[PositiveIntegerObject]
  }

  /**
    * Represents the output of a <code>GetRecords</code> operation.
    */
  @js.native
  @Factory
  trait GetRecordsOutput extends js.Object {
    var NextShardIterator: js.UndefOr[ShardIterator]
    var Records: js.UndefOr[RecordList]
  }

  /**
    * Represents the input of a <code>GetShardIterator</code> operation.
    */
  @js.native
  @Factory
  trait GetShardIteratorInput extends js.Object {
    var ShardId: ShardId
    var ShardIteratorType: ShardIteratorType
    var StreamArn: StreamArn
    var SequenceNumber: js.UndefOr[SequenceNumber]
  }

  /**
    * Represents the output of a <code>GetShardIterator</code> operation.
    */
  @js.native
  @Factory
  trait GetShardIteratorOutput extends js.Object {
    var ShardIterator: js.UndefOr[ShardIterator]
  }

  /**
    * Contains details about the type of identity that made the request.
    */
  @js.native
  @Factory
  trait Identity extends js.Object {
    var PrincipalId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  /**
    * An error occurred on the server side.
    */
  @js.native
  trait InternalServerErrorException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Represents <i>a single element</i> of a key schema. A key schema specifies the attributes that make up the primary key of a table, or the key attributes of an index.
    *  A <code>KeySchemaElement</code> represents exactly one attribute of the primary key. For example, a simple primary key (partition key) would be represented by one <code>KeySchemaElement</code>. A composite primary key (partition key and sort key) would require one <code>KeySchemaElement</code> for the partition key, and another <code>KeySchemaElement</code> for the sort key.
    *
    * '''Note:'''The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.
    *  The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.
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
    * Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of requests and use exponential backoff. For more information, go to [[http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries|Error Retries and Exponential Backoff]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Represents the input of a <code>ListStreams</code> operation.
    */
  @js.native
  @Factory
  trait ListStreamsInput extends js.Object {
    var ExclusiveStartStreamArn: js.UndefOr[StreamArn]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var TableName: js.UndefOr[TableName]
  }

  /**
    * Represents the output of a <code>ListStreams</code> operation.
    */
  @js.native
  @Factory
  trait ListStreamsOutput extends js.Object {
    var LastEvaluatedStreamArn: js.UndefOr[StreamArn]
    var Streams: js.UndefOr[StreamList]
  }

  @js.native
  sealed trait OperationType extends js.Any
  object OperationType extends js.Object {
    val INSERT = "INSERT".asInstanceOf[OperationType]
    val MODIFY = "MODIFY".asInstanceOf[OperationType]
    val REMOVE = "REMOVE".asInstanceOf[OperationType]

    val values = js.Object.freeze(js.Array(INSERT, MODIFY, REMOVE))
  }

  /**
    * A description of a unique event within a stream.
    */
  @js.native
  @Factory
  trait Record extends js.Object {
    var awsRegion: js.UndefOr[String]
    var dynamodb: js.UndefOr[StreamRecord]
    var eventID: js.UndefOr[String]
    var eventName: js.UndefOr[OperationType]
    var eventSource: js.UndefOr[String]
    var eventVersion: js.UndefOr[String]
    var userIdentity: js.UndefOr[Identity]
  }

  /**
    * The operation tried to access a nonexistent stream.
    */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The beginning and ending sequence numbers for the stream records contained within a shard.
    */
  @js.native
  @Factory
  trait SequenceNumberRange extends js.Object {
    var EndingSequenceNumber: js.UndefOr[SequenceNumber]
    var StartingSequenceNumber: js.UndefOr[SequenceNumber]
  }

  /**
    * A uniquely identified group of stream records within a stream.
    */
  @js.native
  @Factory
  trait Shard extends js.Object {
    var ParentShardId: js.UndefOr[ShardId]
    var SequenceNumberRange: js.UndefOr[SequenceNumberRange]
    var ShardId: js.UndefOr[ShardId]
  }

  @js.native
  sealed trait ShardIteratorType extends js.Any
  object ShardIteratorType extends js.Object {
    val TRIM_HORIZON          = "TRIM_HORIZON".asInstanceOf[ShardIteratorType]
    val LATEST                = "LATEST".asInstanceOf[ShardIteratorType]
    val AT_SEQUENCE_NUMBER    = "AT_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
    val AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]

    val values = js.Object.freeze(js.Array(TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER))
  }

  /**
    * Represents all of the data describing a particular stream.
    */
  @js.native
  @Factory
  trait Stream extends js.Object {
    var StreamArn: js.UndefOr[StreamArn]
    var StreamLabel: js.UndefOr[String]
    var TableName: js.UndefOr[TableName]
  }

  /**
    * Represents all of the data describing a particular stream.
    */
  @js.native
  @Factory
  trait StreamDescription extends js.Object {
    var CreationRequestDateTime: js.UndefOr[Date]
    var KeySchema: js.UndefOr[KeySchema]
    var LastEvaluatedShardId: js.UndefOr[ShardId]
    var Shards: js.UndefOr[ShardDescriptionList]
    var StreamArn: js.UndefOr[StreamArn]
    var StreamLabel: js.UndefOr[String]
    var StreamStatus: js.UndefOr[StreamStatus]
    var StreamViewType: js.UndefOr[StreamViewType]
    var TableName: js.UndefOr[TableName]
  }

  /**
    * A description of a single data modification that was performed on an item in a DynamoDB table.
    */
  @js.native
  @Factory
  trait StreamRecord extends js.Object {
    var ApproximateCreationDateTime: js.UndefOr[Date]
    var Keys: js.UndefOr[AttributeMap]
    var NewImage: js.UndefOr[AttributeMap]
    var OldImage: js.UndefOr[AttributeMap]
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var SizeBytes: js.UndefOr[PositiveLongObject]
    var StreamViewType: js.UndefOr[StreamViewType]
  }

  @js.native
  sealed trait StreamStatus extends js.Any
  object StreamStatus extends js.Object {
    val ENABLING  = "ENABLING".asInstanceOf[StreamStatus]
    val ENABLED   = "ENABLED".asInstanceOf[StreamStatus]
    val DISABLING = "DISABLING".asInstanceOf[StreamStatus]
    val DISABLED  = "DISABLED".asInstanceOf[StreamStatus]

    val values = js.Object.freeze(js.Array(ENABLING, ENABLED, DISABLING, DISABLED))
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
    * The operation attempted to read past the oldest stream record in a shard.
    *  In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are subject to removal (trimming) from the stream. You might receive a TrimmedDataAccessException if:
    * * You request a shard iterator with a sequence number older than the trim point (24 hours).
    *  * You obtain a shard iterator, but before you use the iterator in a <code>GetRecords</code> request, a stream record in the shard exceeds the 24 hour period and is trimmed. This causes the iterator to access a record that no longer exists.
    */
  @js.native
  trait TrimmedDataAccessExceptionException extends js.Object {
    val message: ErrorMessage
  }
}
