package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object dynamodbstreams {
  type AttributeMap = js.Dictionary[AttributeValue]
  type AttributeName = String
  type BinaryAttributeValue = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = Boolean
  type Date = js.Date
  type ErrorMessage = String
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = String
  type ListAttributeValue = js.Array[AttributeValue]
  type MapAttributeValue = js.Dictionary[AttributeValue]
  type NullAttributeValue = Boolean
  type NumberAttributeValue = String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  type PositiveIntegerObject = Int
  type PositiveLongObject = Double
  type RecordList = js.Array[Record]
  type SequenceNumber = String
  type ShardDescriptionList = js.Array[Shard]
  type ShardId = String
  type ShardIterator = String
  type StreamArn = String
  type StreamList = js.Array[Stream]
  type StringAttributeValue = String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableName = String

  implicit final class DynamoDBStreamsOps(private val service: DynamoDBStreams) extends AnyVal {

    @inline def describeStreamFuture(params: DescribeStreamInput): Future[DescribeStreamOutput] = service.describeStream(params).promise().toFuture
    @inline def getRecordsFuture(params: GetRecordsInput): Future[GetRecordsOutput] = service.getRecords(params).promise().toFuture
    @inline def getShardIteratorFuture(params: GetShardIteratorInput): Future[GetShardIteratorOutput] = service.getShardIterator(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsInput): Future[ListStreamsOutput] = service.listStreams(params).promise().toFuture

  }
}

package dynamodbstreams {
  @js.native
  @JSImport("aws-sdk/clients/dynamodbstreams", JSImport.Namespace, "AWS.DynamoDBStreams")
  class DynamoDBStreams() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput] = js.native
    def getRecords(params: GetRecordsInput): Request[GetRecordsOutput] = js.native
    def getShardIterator(params: GetShardIteratorInput): Request[GetShardIteratorOutput] = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput] = js.native
  }

  /** Represents the data for an attribute. You can set one, and only one, of the elements.
    * Each attribute in an item is a name-value pair. An attribute can be single-valued or multi-valued set. For example, a book item can have title and authors attributes. Each book has one title but can have many authors. The multi-valued attribute is a set; duplicate values are not allowed.
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
    @inline
    def apply(
        B: js.UndefOr[BinaryAttributeValue] = js.undefined,
        BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined,
        BS: js.UndefOr[BinarySetAttributeValue] = js.undefined,
        L: js.UndefOr[ListAttributeValue] = js.undefined,
        M: js.UndefOr[MapAttributeValue] = js.undefined,
        N: js.UndefOr[NumberAttributeValue] = js.undefined,
        NS: js.UndefOr[NumberSetAttributeValue] = js.undefined,
        NULL: js.UndefOr[NullAttributeValue] = js.undefined,
        S: js.UndefOr[StringAttributeValue] = js.undefined,
        SS: js.UndefOr[StringSetAttributeValue] = js.undefined
    ): AttributeValue = {
      val __obj = js.Dynamic.literal()
      B.foreach(__v => __obj.updateDynamic("B")(__v.asInstanceOf[js.Any]))
      BOOL.foreach(__v => __obj.updateDynamic("BOOL")(__v.asInstanceOf[js.Any]))
      BS.foreach(__v => __obj.updateDynamic("BS")(__v.asInstanceOf[js.Any]))
      L.foreach(__v => __obj.updateDynamic("L")(__v.asInstanceOf[js.Any]))
      M.foreach(__v => __obj.updateDynamic("M")(__v.asInstanceOf[js.Any]))
      N.foreach(__v => __obj.updateDynamic("N")(__v.asInstanceOf[js.Any]))
      NS.foreach(__v => __obj.updateDynamic("NS")(__v.asInstanceOf[js.Any]))
      NULL.foreach(__v => __obj.updateDynamic("NULL")(__v.asInstanceOf[js.Any]))
      S.foreach(__v => __obj.updateDynamic("S")(__v.asInstanceOf[js.Any]))
      SS.foreach(__v => __obj.updateDynamic("SS")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeValue]
    }
  }

  /** Represents the input of a <code>DescribeStream</code> operation.
    */
  @js.native
  trait DescribeStreamInput extends js.Object {
    var StreamArn: StreamArn
    var ExclusiveStartShardId: js.UndefOr[ShardId]
    var Limit: js.UndefOr[PositiveIntegerObject]
  }

  object DescribeStreamInput {
    @inline
    def apply(
        StreamArn: StreamArn,
        ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined,
        Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    ): DescribeStreamInput = {
      val __obj = js.Dynamic.literal(
        "StreamArn" -> StreamArn.asInstanceOf[js.Any]
      )

      ExclusiveStartShardId.foreach(__v => __obj.updateDynamic("ExclusiveStartShardId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStreamInput]
    }
  }

  /** Represents the output of a <code>DescribeStream</code> operation.
    */
  @js.native
  trait DescribeStreamOutput extends js.Object {
    var StreamDescription: js.UndefOr[StreamDescription]
  }

  object DescribeStreamOutput {
    @inline
    def apply(
        StreamDescription: js.UndefOr[StreamDescription] = js.undefined
    ): DescribeStreamOutput = {
      val __obj = js.Dynamic.literal()
      StreamDescription.foreach(__v => __obj.updateDynamic("StreamDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStreamOutput]
    }
  }

  /** The shard iterator has expired and can no longer be used to retrieve stream records. A shard iterator expires 15 minutes after it is retrieved using the <code>GetShardIterator</code> action.
    */
  @js.native
  trait ExpiredIteratorExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /** Represents the input of a <code>GetRecords</code> operation.
    */
  @js.native
  trait GetRecordsInput extends js.Object {
    var ShardIterator: ShardIterator
    var Limit: js.UndefOr[PositiveIntegerObject]
  }

  object GetRecordsInput {
    @inline
    def apply(
        ShardIterator: ShardIterator,
        Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    ): GetRecordsInput = {
      val __obj = js.Dynamic.literal(
        "ShardIterator" -> ShardIterator.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecordsInput]
    }
  }

  /** Represents the output of a <code>GetRecords</code> operation.
    */
  @js.native
  trait GetRecordsOutput extends js.Object {
    var NextShardIterator: js.UndefOr[ShardIterator]
    var Records: js.UndefOr[RecordList]
  }

  object GetRecordsOutput {
    @inline
    def apply(
        NextShardIterator: js.UndefOr[ShardIterator] = js.undefined,
        Records: js.UndefOr[RecordList] = js.undefined
    ): GetRecordsOutput = {
      val __obj = js.Dynamic.literal()
      NextShardIterator.foreach(__v => __obj.updateDynamic("NextShardIterator")(__v.asInstanceOf[js.Any]))
      Records.foreach(__v => __obj.updateDynamic("Records")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecordsOutput]
    }
  }

  /** Represents the input of a <code>GetShardIterator</code> operation.
    */
  @js.native
  trait GetShardIteratorInput extends js.Object {
    var ShardId: ShardId
    var ShardIteratorType: ShardIteratorType
    var StreamArn: StreamArn
    var SequenceNumber: js.UndefOr[SequenceNumber]
  }

  object GetShardIteratorInput {
    @inline
    def apply(
        ShardId: ShardId,
        ShardIteratorType: ShardIteratorType,
        StreamArn: StreamArn,
        SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    ): GetShardIteratorInput = {
      val __obj = js.Dynamic.literal(
        "ShardId" -> ShardId.asInstanceOf[js.Any],
        "ShardIteratorType" -> ShardIteratorType.asInstanceOf[js.Any],
        "StreamArn" -> StreamArn.asInstanceOf[js.Any]
      )

      SequenceNumber.foreach(__v => __obj.updateDynamic("SequenceNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetShardIteratorInput]
    }
  }

  /** Represents the output of a <code>GetShardIterator</code> operation.
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

  /** Contains details about the type of identity that made the request.
    */
  @js.native
  trait Identity extends js.Object {
    var PrincipalId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object Identity {
    @inline
    def apply(
        PrincipalId: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): Identity = {
      val __obj = js.Dynamic.literal()
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Identity]
    }
  }

  /** An error occurred on the server side.
    */
  @js.native
  trait InternalServerErrorException extends js.Object {
    val message: ErrorMessage
  }

  /** Represents <i>a single element</i> of a key schema. A key schema specifies the attributes that make up the primary key of a table, or the key attributes of an index.
    * A <code>KeySchemaElement</code> represents exactly one attribute of the primary key. For example, a simple primary key (partition key) would be represented by one <code>KeySchemaElement</code>. A composite primary key (partition key and sort key) would require one <code>KeySchemaElement</code> for the partition key, and another <code>KeySchemaElement</code> for the sort key.
    *
    * '''Note:'''The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.
    * The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.
    */
  @js.native
  trait KeySchemaElement extends js.Object {
    var AttributeName: KeySchemaAttributeName
    var KeyType: KeyType
  }

  object KeySchemaElement {
    @inline
    def apply(
        AttributeName: KeySchemaAttributeName,
        KeyType: KeyType
    ): KeySchemaElement = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "KeyType" -> KeyType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KeySchemaElement]
    }
  }

  @js.native
  sealed trait KeyType extends js.Any
  object KeyType {
    val HASH = "HASH".asInstanceOf[KeyType]
    val RANGE = "RANGE".asInstanceOf[KeyType]

    @inline def values = js.Array(HASH, RANGE)
  }

  /** Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of requests and use exponential backoff. For more information, go to [[http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries|Error Retries and Exponential Backoff]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /** Represents the input of a <code>ListStreams</code> operation.
    */
  @js.native
  trait ListStreamsInput extends js.Object {
    var ExclusiveStartStreamArn: js.UndefOr[StreamArn]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var TableName: js.UndefOr[TableName]
  }

  object ListStreamsInput {
    @inline
    def apply(
        ExclusiveStartStreamArn: js.UndefOr[StreamArn] = js.undefined,
        Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
        TableName: js.UndefOr[TableName] = js.undefined
    ): ListStreamsInput = {
      val __obj = js.Dynamic.literal()
      ExclusiveStartStreamArn.foreach(__v => __obj.updateDynamic("ExclusiveStartStreamArn")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsInput]
    }
  }

  /** Represents the output of a <code>ListStreams</code> operation.
    */
  @js.native
  trait ListStreamsOutput extends js.Object {
    var LastEvaluatedStreamArn: js.UndefOr[StreamArn]
    var Streams: js.UndefOr[StreamList]
  }

  object ListStreamsOutput {
    @inline
    def apply(
        LastEvaluatedStreamArn: js.UndefOr[StreamArn] = js.undefined,
        Streams: js.UndefOr[StreamList] = js.undefined
    ): ListStreamsOutput = {
      val __obj = js.Dynamic.literal()
      LastEvaluatedStreamArn.foreach(__v => __obj.updateDynamic("LastEvaluatedStreamArn")(__v.asInstanceOf[js.Any]))
      Streams.foreach(__v => __obj.updateDynamic("Streams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsOutput]
    }
  }

  @js.native
  sealed trait OperationType extends js.Any
  object OperationType {
    val INSERT = "INSERT".asInstanceOf[OperationType]
    val MODIFY = "MODIFY".asInstanceOf[OperationType]
    val REMOVE = "REMOVE".asInstanceOf[OperationType]

    @inline def values = js.Array(INSERT, MODIFY, REMOVE)
  }

  /** A description of a unique event within a stream.
    */
  @js.native
  trait Record extends js.Object {
    var awsRegion: js.UndefOr[String]
    var dynamodb: js.UndefOr[StreamRecord]
    var eventID: js.UndefOr[String]
    var eventName: js.UndefOr[OperationType]
    var eventSource: js.UndefOr[String]
    var eventVersion: js.UndefOr[String]
    var userIdentity: js.UndefOr[Identity]
  }

  object Record {
    @inline
    def apply(
        awsRegion: js.UndefOr[String] = js.undefined,
        dynamodb: js.UndefOr[StreamRecord] = js.undefined,
        eventID: js.UndefOr[String] = js.undefined,
        eventName: js.UndefOr[OperationType] = js.undefined,
        eventSource: js.UndefOr[String] = js.undefined,
        eventVersion: js.UndefOr[String] = js.undefined,
        userIdentity: js.UndefOr[Identity] = js.undefined
    ): Record = {
      val __obj = js.Dynamic.literal()
      awsRegion.foreach(__v => __obj.updateDynamic("awsRegion")(__v.asInstanceOf[js.Any]))
      dynamodb.foreach(__v => __obj.updateDynamic("dynamodb")(__v.asInstanceOf[js.Any]))
      eventID.foreach(__v => __obj.updateDynamic("eventID")(__v.asInstanceOf[js.Any]))
      eventName.foreach(__v => __obj.updateDynamic("eventName")(__v.asInstanceOf[js.Any]))
      eventSource.foreach(__v => __obj.updateDynamic("eventSource")(__v.asInstanceOf[js.Any]))
      eventVersion.foreach(__v => __obj.updateDynamic("eventVersion")(__v.asInstanceOf[js.Any]))
      userIdentity.foreach(__v => __obj.updateDynamic("userIdentity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Record]
    }
  }

  /** The operation tried to access a nonexistent stream.
    */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /** The beginning and ending sequence numbers for the stream records contained within a shard.
    */
  @js.native
  trait SequenceNumberRange extends js.Object {
    var EndingSequenceNumber: js.UndefOr[SequenceNumber]
    var StartingSequenceNumber: js.UndefOr[SequenceNumber]
  }

  object SequenceNumberRange {
    @inline
    def apply(
        EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
        StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    ): SequenceNumberRange = {
      val __obj = js.Dynamic.literal()
      EndingSequenceNumber.foreach(__v => __obj.updateDynamic("EndingSequenceNumber")(__v.asInstanceOf[js.Any]))
      StartingSequenceNumber.foreach(__v => __obj.updateDynamic("StartingSequenceNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SequenceNumberRange]
    }
  }

  /** A uniquely identified group of stream records within a stream.
    */
  @js.native
  trait Shard extends js.Object {
    var ParentShardId: js.UndefOr[ShardId]
    var SequenceNumberRange: js.UndefOr[SequenceNumberRange]
    var ShardId: js.UndefOr[ShardId]
  }

  object Shard {
    @inline
    def apply(
        ParentShardId: js.UndefOr[ShardId] = js.undefined,
        SequenceNumberRange: js.UndefOr[SequenceNumberRange] = js.undefined,
        ShardId: js.UndefOr[ShardId] = js.undefined
    ): Shard = {
      val __obj = js.Dynamic.literal()
      ParentShardId.foreach(__v => __obj.updateDynamic("ParentShardId")(__v.asInstanceOf[js.Any]))
      SequenceNumberRange.foreach(__v => __obj.updateDynamic("SequenceNumberRange")(__v.asInstanceOf[js.Any]))
      ShardId.foreach(__v => __obj.updateDynamic("ShardId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Shard]
    }
  }

  @js.native
  sealed trait ShardIteratorType extends js.Any
  object ShardIteratorType {
    val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[ShardIteratorType]
    val LATEST = "LATEST".asInstanceOf[ShardIteratorType]
    val AT_SEQUENCE_NUMBER = "AT_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
    val AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]

    @inline def values = js.Array(TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER)
  }

  /** Represents all of the data describing a particular stream.
    */
  @js.native
  trait Stream extends js.Object {
    var StreamArn: js.UndefOr[StreamArn]
    var StreamLabel: js.UndefOr[String]
    var TableName: js.UndefOr[TableName]
  }

  object Stream {
    @inline
    def apply(
        StreamArn: js.UndefOr[StreamArn] = js.undefined,
        StreamLabel: js.UndefOr[String] = js.undefined,
        TableName: js.UndefOr[TableName] = js.undefined
    ): Stream = {
      val __obj = js.Dynamic.literal()
      StreamArn.foreach(__v => __obj.updateDynamic("StreamArn")(__v.asInstanceOf[js.Any]))
      StreamLabel.foreach(__v => __obj.updateDynamic("StreamLabel")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stream]
    }
  }

  /** Represents all of the data describing a particular stream.
    */
  @js.native
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

  object StreamDescription {
    @inline
    def apply(
        CreationRequestDateTime: js.UndefOr[Date] = js.undefined,
        KeySchema: js.UndefOr[KeySchema] = js.undefined,
        LastEvaluatedShardId: js.UndefOr[ShardId] = js.undefined,
        Shards: js.UndefOr[ShardDescriptionList] = js.undefined,
        StreamArn: js.UndefOr[StreamArn] = js.undefined,
        StreamLabel: js.UndefOr[String] = js.undefined,
        StreamStatus: js.UndefOr[StreamStatus] = js.undefined,
        StreamViewType: js.UndefOr[StreamViewType] = js.undefined,
        TableName: js.UndefOr[TableName] = js.undefined
    ): StreamDescription = {
      val __obj = js.Dynamic.literal()
      CreationRequestDateTime.foreach(__v => __obj.updateDynamic("CreationRequestDateTime")(__v.asInstanceOf[js.Any]))
      KeySchema.foreach(__v => __obj.updateDynamic("KeySchema")(__v.asInstanceOf[js.Any]))
      LastEvaluatedShardId.foreach(__v => __obj.updateDynamic("LastEvaluatedShardId")(__v.asInstanceOf[js.Any]))
      Shards.foreach(__v => __obj.updateDynamic("Shards")(__v.asInstanceOf[js.Any]))
      StreamArn.foreach(__v => __obj.updateDynamic("StreamArn")(__v.asInstanceOf[js.Any]))
      StreamLabel.foreach(__v => __obj.updateDynamic("StreamLabel")(__v.asInstanceOf[js.Any]))
      StreamStatus.foreach(__v => __obj.updateDynamic("StreamStatus")(__v.asInstanceOf[js.Any]))
      StreamViewType.foreach(__v => __obj.updateDynamic("StreamViewType")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamDescription]
    }
  }

  /** A description of a single data modification that was performed on an item in a DynamoDB table.
    */
  @js.native
  trait StreamRecord extends js.Object {
    var ApproximateCreationDateTime: js.UndefOr[Date]
    var Keys: js.UndefOr[AttributeMap]
    var NewImage: js.UndefOr[AttributeMap]
    var OldImage: js.UndefOr[AttributeMap]
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var SizeBytes: js.UndefOr[PositiveLongObject]
    var StreamViewType: js.UndefOr[StreamViewType]
  }

  object StreamRecord {
    @inline
    def apply(
        ApproximateCreationDateTime: js.UndefOr[Date] = js.undefined,
        Keys: js.UndefOr[AttributeMap] = js.undefined,
        NewImage: js.UndefOr[AttributeMap] = js.undefined,
        OldImage: js.UndefOr[AttributeMap] = js.undefined,
        SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
        SizeBytes: js.UndefOr[PositiveLongObject] = js.undefined,
        StreamViewType: js.UndefOr[StreamViewType] = js.undefined
    ): StreamRecord = {
      val __obj = js.Dynamic.literal()
      ApproximateCreationDateTime.foreach(__v => __obj.updateDynamic("ApproximateCreationDateTime")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      NewImage.foreach(__v => __obj.updateDynamic("NewImage")(__v.asInstanceOf[js.Any]))
      OldImage.foreach(__v => __obj.updateDynamic("OldImage")(__v.asInstanceOf[js.Any]))
      SequenceNumber.foreach(__v => __obj.updateDynamic("SequenceNumber")(__v.asInstanceOf[js.Any]))
      SizeBytes.foreach(__v => __obj.updateDynamic("SizeBytes")(__v.asInstanceOf[js.Any]))
      StreamViewType.foreach(__v => __obj.updateDynamic("StreamViewType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamRecord]
    }
  }

  @js.native
  sealed trait StreamStatus extends js.Any
  object StreamStatus {
    val ENABLING = "ENABLING".asInstanceOf[StreamStatus]
    val ENABLED = "ENABLED".asInstanceOf[StreamStatus]
    val DISABLING = "DISABLING".asInstanceOf[StreamStatus]
    val DISABLED = "DISABLED".asInstanceOf[StreamStatus]

    @inline def values = js.Array(ENABLING, ENABLED, DISABLING, DISABLED)
  }

  @js.native
  sealed trait StreamViewType extends js.Any
  object StreamViewType {
    val NEW_IMAGE = "NEW_IMAGE".asInstanceOf[StreamViewType]
    val OLD_IMAGE = "OLD_IMAGE".asInstanceOf[StreamViewType]
    val NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[StreamViewType]
    val KEYS_ONLY = "KEYS_ONLY".asInstanceOf[StreamViewType]

    @inline def values = js.Array(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
  }

  /** The operation attempted to read past the oldest stream record in a shard.
    * In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are subject to removal (trimming) from the stream. You might receive a TrimmedDataAccessException if:
    * * You request a shard iterator with a sequence number older than the trim point (24 hours).
    * * You obtain a shard iterator, but before you use the iterator in a <code>GetRecords</code> request, a stream record in the shard exceeds the 24 hour period and is trimmed. This causes the iterator to access a record that no longer exists.
    */
  @js.native
  trait TrimmedDataAccessExceptionException extends js.Object {
    val message: ErrorMessage
  }
}
