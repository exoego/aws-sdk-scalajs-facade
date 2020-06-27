package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object sqs {
  type AWSAccountIdList                             = js.Array[String]
  type ActionNameList                               = js.Array[String]
  type AttributeNameList                            = js.Array[QueueAttributeName]
  type BatchResultErrorEntryList                    = js.Array[BatchResultErrorEntry]
  type Binary                                       = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinaryList                                   = js.Array[Binary]
  type ChangeMessageVisibilityBatchRequestEntryList = js.Array[ChangeMessageVisibilityBatchRequestEntry]
  type ChangeMessageVisibilityBatchResultEntryList  = js.Array[ChangeMessageVisibilityBatchResultEntry]
  type DeleteMessageBatchRequestEntryList           = js.Array[DeleteMessageBatchRequestEntry]
  type DeleteMessageBatchResultEntryList            = js.Array[DeleteMessageBatchResultEntry]
  type MessageAttributeName                         = String
  type MessageAttributeNameList                     = js.Array[MessageAttributeName]
  type MessageBodyAttributeMap                      = js.Dictionary[MessageAttributeValue]
  type MessageBodySystemAttributeMap                = js.Dictionary[MessageSystemAttributeValue]
  type MessageList                                  = js.Array[Message]
  type MessageSystemAttributeMap                    = js.Dictionary[String]
  type QueueAttributeMap                            = js.Dictionary[String]
  type QueueUrlList                                 = js.Array[String]
  type SendMessageBatchRequestEntryList             = js.Array[SendMessageBatchRequestEntry]
  type SendMessageBatchResultEntryList              = js.Array[SendMessageBatchResultEntry]
  type StringList                                   = js.Array[String]
  type TagKey                                       = String
  type TagKeyList                                   = js.Array[TagKey]
  type TagMap                                       = js.Dictionary[TagValue]
  type TagValue                                     = String

  implicit final class SQSOps(private val service: SQS) extends AnyVal {

    @inline def addPermissionFuture(params: AddPermissionRequest): Future[js.Object] =
      service.addPermission(params).promise().toFuture
    @inline def changeMessageVisibilityBatchFuture(
        params: ChangeMessageVisibilityBatchRequest
    ): Future[ChangeMessageVisibilityBatchResult] = service.changeMessageVisibilityBatch(params).promise().toFuture
    @inline def changeMessageVisibilityFuture(params: ChangeMessageVisibilityRequest): Future[js.Object] =
      service.changeMessageVisibility(params).promise().toFuture
    @inline def createQueueFuture(params: CreateQueueRequest): Future[CreateQueueResult] =
      service.createQueue(params).promise().toFuture
    @inline def deleteMessageBatchFuture(params: DeleteMessageBatchRequest): Future[DeleteMessageBatchResult] =
      service.deleteMessageBatch(params).promise().toFuture
    @inline def deleteMessageFuture(params: DeleteMessageRequest): Future[js.Object] =
      service.deleteMessage(params).promise().toFuture
    @inline def deleteQueueFuture(params: DeleteQueueRequest): Future[js.Object] =
      service.deleteQueue(params).promise().toFuture
    @inline def getQueueAttributesFuture(params: GetQueueAttributesRequest): Future[GetQueueAttributesResult] =
      service.getQueueAttributes(params).promise().toFuture
    @inline def getQueueUrlFuture(params: GetQueueUrlRequest): Future[GetQueueUrlResult] =
      service.getQueueUrl(params).promise().toFuture
    @inline def listDeadLetterSourceQueuesFuture(
        params: ListDeadLetterSourceQueuesRequest
    ): Future[ListDeadLetterSourceQueuesResult] = service.listDeadLetterSourceQueues(params).promise().toFuture
    @inline def listQueueTagsFuture(params: ListQueueTagsRequest): Future[ListQueueTagsResult] =
      service.listQueueTags(params).promise().toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResult] =
      service.listQueues(params).promise().toFuture
    @inline def purgeQueueFuture(params: PurgeQueueRequest): Future[js.Object] =
      service.purgeQueue(params).promise().toFuture
    @inline def receiveMessageFuture(params: ReceiveMessageRequest): Future[ReceiveMessageResult] =
      service.receiveMessage(params).promise().toFuture
    @inline def removePermissionFuture(params: RemovePermissionRequest): Future[js.Object] =
      service.removePermission(params).promise().toFuture
    @inline def sendMessageBatchFuture(params: SendMessageBatchRequest): Future[SendMessageBatchResult] =
      service.sendMessageBatch(params).promise().toFuture
    @inline def sendMessageFuture(params: SendMessageRequest): Future[SendMessageResult] =
      service.sendMessage(params).promise().toFuture
    @inline def setQueueAttributesFuture(params: SetQueueAttributesRequest): Future[js.Object] =
      service.setQueueAttributes(params).promise().toFuture
    @inline def tagQueueFuture(params: TagQueueRequest): Future[js.Object] = service.tagQueue(params).promise().toFuture
    @inline def untagQueueFuture(params: UntagQueueRequest): Future[js.Object] =
      service.untagQueue(params).promise().toFuture
  }
}

package sqs {
  @js.native
  @JSImport("aws-sdk", "SQS")
  class SQS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addPermission(params: AddPermissionRequest): Request[js.Object]                     = js.native
    def changeMessageVisibility(params: ChangeMessageVisibilityRequest): Request[js.Object] = js.native
    def changeMessageVisibilityBatch(
        params: ChangeMessageVisibilityBatchRequest
    ): Request[ChangeMessageVisibilityBatchResult]                                               = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResult]                      = js.native
    def deleteMessage(params: DeleteMessageRequest): Request[js.Object]                          = js.native
    def deleteMessageBatch(params: DeleteMessageBatchRequest): Request[DeleteMessageBatchResult] = js.native
    def deleteQueue(params: DeleteQueueRequest): Request[js.Object]                              = js.native
    def getQueueAttributes(params: GetQueueAttributesRequest): Request[GetQueueAttributesResult] = js.native
    def getQueueUrl(params: GetQueueUrlRequest): Request[GetQueueUrlResult]                      = js.native
    def listDeadLetterSourceQueues(
        params: ListDeadLetterSourceQueuesRequest
    ): Request[ListDeadLetterSourceQueuesResult]                                           = js.native
    def listQueueTags(params: ListQueueTagsRequest): Request[ListQueueTagsResult]          = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResult]                   = js.native
    def purgeQueue(params: PurgeQueueRequest): Request[js.Object]                          = js.native
    def receiveMessage(params: ReceiveMessageRequest): Request[ReceiveMessageResult]       = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object]              = js.native
    def sendMessage(params: SendMessageRequest): Request[SendMessageResult]                = js.native
    def sendMessageBatch(params: SendMessageBatchRequest): Request[SendMessageBatchResult] = js.native
    def setQueueAttributes(params: SetQueueAttributesRequest): Request[js.Object]          = js.native
    def tagQueue(params: TagQueueRequest): Request[js.Object]                              = js.native
    def untagQueue(params: UntagQueueRequest): Request[js.Object]                          = js.native
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddPermissionRequest extends js.Object {
    var AWSAccountIds: AWSAccountIdList
    var Actions: ActionNameList
    var Label: String
    var QueueUrl: String
  }

  /**
    * Gives a detailed description of the result of an action on each entry in the request.
    */
  @js.native
  @Factory
  trait BatchResultErrorEntry extends js.Object {
    var Code: String
    var Id: String
    var SenderFault: Boolean
    var Message: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ChangeMessageVisibilityBatchRequest extends js.Object {
    var Entries: ChangeMessageVisibilityBatchRequestEntryList
    var QueueUrl: String
  }

  /**
    * Encloses a receipt handle and an entry id for each message in <code> <a>ChangeMessageVisibilityBatch</a>.</code>
    *  <important> All of the following list parameters must be prefixed with <code>ChangeMessageVisibilityBatchRequestEntry.n</code>, where <code>n</code> is an integer value starting with <code>1</code>. For example, a parameter list for this action might look like this:
    *  </important> <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.Id=change_visibility_msg_2</code>
    *  <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.ReceiptHandle=your_receipt_handle</code>
    *  <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.VisibilityTimeout=45</code>
    */
  @js.native
  @Factory
  trait ChangeMessageVisibilityBatchRequestEntry extends js.Object {
    var Id: String
    var ReceiptHandle: String
    var VisibilityTimeout: js.UndefOr[Int]
  }

  /**
    * For each message in the batch, the response contains a <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.
    */
  @js.native
  @Factory
  trait ChangeMessageVisibilityBatchResult extends js.Object {
    var Failed: BatchResultErrorEntryList
    var Successful: ChangeMessageVisibilityBatchResultEntryList
  }

  /**
    * Encloses the <code>Id</code> of an entry in <code> <a>ChangeMessageVisibilityBatch</a>.</code>
    */
  @js.native
  @Factory
  trait ChangeMessageVisibilityBatchResultEntry extends js.Object {
    var Id: String
  }

  @js.native
  @Factory
  trait ChangeMessageVisibilityRequest extends js.Object {
    var QueueUrl: String
    var ReceiptHandle: String
    var VisibilityTimeout: Int
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateQueueRequest extends js.Object {
    var QueueName: String
    var Attributes: js.UndefOr[QueueAttributeMap]
    var tags: js.UndefOr[TagMap]
  }

  /**
    * Returns the <code>QueueUrl</code> attribute of the created queue.
    */
  @js.native
  @Factory
  trait CreateQueueResult extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteMessageBatchRequest extends js.Object {
    var Entries: DeleteMessageBatchRequestEntryList
    var QueueUrl: String
  }

  /**
    * Encloses a receipt handle and an identifier for it.
    */
  @js.native
  @Factory
  trait DeleteMessageBatchRequestEntry extends js.Object {
    var Id: String
    var ReceiptHandle: String
  }

  /**
    * For each message in the batch, the response contains a <code> <a>DeleteMessageBatchResultEntry</a> </code> tag if the message is deleted or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message can't be deleted.
    */
  @js.native
  @Factory
  trait DeleteMessageBatchResult extends js.Object {
    var Failed: BatchResultErrorEntryList
    var Successful: DeleteMessageBatchResultEntryList
  }

  /**
    * Encloses the <code>Id</code> of an entry in <code> <a>DeleteMessageBatch</a>.</code>
    */
  @js.native
  @Factory
  trait DeleteMessageBatchResultEntry extends js.Object {
    var Id: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteMessageRequest extends js.Object {
    var QueueUrl: String
    var ReceiptHandle: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteQueueRequest extends js.Object {
    var QueueUrl: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetQueueAttributesRequest extends js.Object {
    var QueueUrl: String
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  /**
    * A list of returned queue attributes.
    */
  @js.native
  @Factory
  trait GetQueueAttributesResult extends js.Object {
    var Attributes: js.UndefOr[QueueAttributeMap]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetQueueUrlRequest extends js.Object {
    var QueueName: String
    var QueueOwnerAWSAccountId: js.UndefOr[String]
  }

  /**
    * For more information, see [[https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-api-responses.html|Interpreting Responses]] in the <i>Amazon Simple Queue Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait GetQueueUrlResult extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListDeadLetterSourceQueuesRequest extends js.Object {
    var QueueUrl: String
  }

  /**
    * A list of your dead letter source queues.
    */
  @js.native
  @Factory
  trait ListDeadLetterSourceQueuesResult extends js.Object {
    var queueUrls: QueueUrlList
  }

  @js.native
  @Factory
  trait ListQueueTagsRequest extends js.Object {
    var QueueUrl: String
  }

  @js.native
  @Factory
  trait ListQueueTagsResult extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListQueuesRequest extends js.Object {
    var QueueNamePrefix: js.UndefOr[String]
  }

  /**
    * A list of your queues.
    */
  @js.native
  @Factory
  trait ListQueuesResult extends js.Object {
    var QueueUrls: js.UndefOr[QueueUrlList]
  }

  /**
    * An Amazon SQS message.
    */
  @js.native
  @Factory
  trait Message extends js.Object {
    var Attributes: js.UndefOr[MessageSystemAttributeMap]
    var Body: js.UndefOr[String]
    var MD5OfBody: js.UndefOr[String]
    var MD5OfMessageAttributes: js.UndefOr[String]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var MessageId: js.UndefOr[String]
    var ReceiptHandle: js.UndefOr[String]
  }

  /**
    * The user-specified message attribute value. For string data types, the <code>Value</code> attribute has the same restrictions on the content as the message body. For more information, see <code> <a>SendMessage</a>.</code>
    *  <code>Name</code>, <code>type</code>, <code>value</code> and the message body must not be empty or null. All parts of the message attribute, including <code>Name</code>, <code>Type</code>, and <code>Value</code>, are part of the message size restriction (256 KB or 262,144 bytes).
    */
  @js.native
  @Factory
  trait MessageAttributeValue extends js.Object {
    var DataType: String
    var BinaryListValues: js.UndefOr[BinaryList]
    var BinaryValue: js.UndefOr[Binary]
    var StringListValues: js.UndefOr[StringList]
    var StringValue: js.UndefOr[String]
  }

  @js.native
  sealed trait MessageSystemAttributeName extends js.Any
  object MessageSystemAttributeName extends js.Object {
    val SenderId                         = "SenderId".asInstanceOf[MessageSystemAttributeName]
    val SentTimestamp                    = "SentTimestamp".asInstanceOf[MessageSystemAttributeName]
    val ApproximateReceiveCount          = "ApproximateReceiveCount".asInstanceOf[MessageSystemAttributeName]
    val ApproximateFirstReceiveTimestamp = "ApproximateFirstReceiveTimestamp".asInstanceOf[MessageSystemAttributeName]
    val SequenceNumber                   = "SequenceNumber".asInstanceOf[MessageSystemAttributeName]
    val MessageDeduplicationId           = "MessageDeduplicationId".asInstanceOf[MessageSystemAttributeName]
    val MessageGroupId                   = "MessageGroupId".asInstanceOf[MessageSystemAttributeName]
    val AWSTraceHeader                   = "AWSTraceHeader".asInstanceOf[MessageSystemAttributeName]

    val values = js.Object.freeze(
      js.Array(
        SenderId,
        SentTimestamp,
        ApproximateReceiveCount,
        ApproximateFirstReceiveTimestamp,
        SequenceNumber,
        MessageDeduplicationId,
        MessageGroupId,
        AWSTraceHeader
      )
    )
  }

  @js.native
  sealed trait MessageSystemAttributeNameForSends extends js.Any
  object MessageSystemAttributeNameForSends extends js.Object {
    val AWSTraceHeader = "AWSTraceHeader".asInstanceOf[MessageSystemAttributeNameForSends]

    val values = js.Object.freeze(js.Array(AWSTraceHeader))
  }

  /**
    * The user-specified message system attribute value. For string data types, the <code>Value</code> attribute has the same restrictions on the content as the message body. For more information, see <code> <a>SendMessage</a>.</code>
    *  <code>Name</code>, <code>type</code>, <code>value</code> and the message body must not be empty or null.
    */
  @js.native
  @Factory
  trait MessageSystemAttributeValue extends js.Object {
    var DataType: String
    var BinaryListValues: js.UndefOr[BinaryList]
    var BinaryValue: js.UndefOr[Binary]
    var StringListValues: js.UndefOr[StringList]
    var StringValue: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait PurgeQueueRequest extends js.Object {
    var QueueUrl: String
  }

  @js.native
  sealed trait QueueAttributeName extends js.Any
  object QueueAttributeName extends js.Object {
    val All                                   = "All".asInstanceOf[QueueAttributeName]
    val Policy                                = "Policy".asInstanceOf[QueueAttributeName]
    val VisibilityTimeout                     = "VisibilityTimeout".asInstanceOf[QueueAttributeName]
    val MaximumMessageSize                    = "MaximumMessageSize".asInstanceOf[QueueAttributeName]
    val MessageRetentionPeriod                = "MessageRetentionPeriod".asInstanceOf[QueueAttributeName]
    val ApproximateNumberOfMessages           = "ApproximateNumberOfMessages".asInstanceOf[QueueAttributeName]
    val ApproximateNumberOfMessagesNotVisible = "ApproximateNumberOfMessagesNotVisible".asInstanceOf[QueueAttributeName]
    val CreatedTimestamp                      = "CreatedTimestamp".asInstanceOf[QueueAttributeName]
    val LastModifiedTimestamp                 = "LastModifiedTimestamp".asInstanceOf[QueueAttributeName]
    val QueueArn                              = "QueueArn".asInstanceOf[QueueAttributeName]
    val ApproximateNumberOfMessagesDelayed    = "ApproximateNumberOfMessagesDelayed".asInstanceOf[QueueAttributeName]
    val DelaySeconds                          = "DelaySeconds".asInstanceOf[QueueAttributeName]
    val ReceiveMessageWaitTimeSeconds         = "ReceiveMessageWaitTimeSeconds".asInstanceOf[QueueAttributeName]
    val RedrivePolicy                         = "RedrivePolicy".asInstanceOf[QueueAttributeName]
    val FifoQueue                             = "FifoQueue".asInstanceOf[QueueAttributeName]
    val ContentBasedDeduplication             = "ContentBasedDeduplication".asInstanceOf[QueueAttributeName]
    val KmsMasterKeyId                        = "KmsMasterKeyId".asInstanceOf[QueueAttributeName]
    val KmsDataKeyReusePeriodSeconds          = "KmsDataKeyReusePeriodSeconds".asInstanceOf[QueueAttributeName]

    val values = js.Object.freeze(
      js.Array(
        All,
        Policy,
        VisibilityTimeout,
        MaximumMessageSize,
        MessageRetentionPeriod,
        ApproximateNumberOfMessages,
        ApproximateNumberOfMessagesNotVisible,
        CreatedTimestamp,
        LastModifiedTimestamp,
        QueueArn,
        ApproximateNumberOfMessagesDelayed,
        DelaySeconds,
        ReceiveMessageWaitTimeSeconds,
        RedrivePolicy,
        FifoQueue,
        ContentBasedDeduplication,
        KmsMasterKeyId,
        KmsDataKeyReusePeriodSeconds
      )
    )
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReceiveMessageRequest extends js.Object {
    var QueueUrl: String
    var AttributeNames: js.UndefOr[AttributeNameList]
    var MaxNumberOfMessages: js.UndefOr[Int]
    var MessageAttributeNames: js.UndefOr[MessageAttributeNameList]
    var ReceiveRequestAttemptId: js.UndefOr[String]
    var VisibilityTimeout: js.UndefOr[Int]
    var WaitTimeSeconds: js.UndefOr[Int]
  }

  /**
    * A list of received messages.
    */
  @js.native
  @Factory
  trait ReceiveMessageResult extends js.Object {
    var Messages: js.UndefOr[MessageList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RemovePermissionRequest extends js.Object {
    var Label: String
    var QueueUrl: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait SendMessageBatchRequest extends js.Object {
    var Entries: SendMessageBatchRequestEntryList
    var QueueUrl: String
  }

  /**
    * Contains the details of a single Amazon SQS message along with an <code>Id</code>.
    */
  @js.native
  @Factory
  trait SendMessageBatchRequestEntry extends js.Object {
    var Id: String
    var MessageBody: String
    var DelaySeconds: js.UndefOr[Int]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var MessageDeduplicationId: js.UndefOr[String]
    var MessageGroupId: js.UndefOr[String]
    var MessageSystemAttributes: js.UndefOr[MessageBodySystemAttributeMap]
  }

  /**
    * For each message in the batch, the response contains a <code> <a>SendMessageBatchResultEntry</a> </code> tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.
    */
  @js.native
  @Factory
  trait SendMessageBatchResult extends js.Object {
    var Failed: BatchResultErrorEntryList
    var Successful: SendMessageBatchResultEntryList
  }

  /**
    * Encloses a <code>MessageId</code> for a successfully-enqueued message in a <code> <a>SendMessageBatch</a>.</code>
    */
  @js.native
  @Factory
  trait SendMessageBatchResultEntry extends js.Object {
    var Id: String
    var MD5OfMessageBody: String
    var MessageId: String
    var MD5OfMessageAttributes: js.UndefOr[String]
    var MD5OfMessageSystemAttributes: js.UndefOr[String]
    var SequenceNumber: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait SendMessageRequest extends js.Object {
    var MessageBody: String
    var QueueUrl: String
    var DelaySeconds: js.UndefOr[Int]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var MessageDeduplicationId: js.UndefOr[String]
    var MessageGroupId: js.UndefOr[String]
    var MessageSystemAttributes: js.UndefOr[MessageBodySystemAttributeMap]
  }

  /**
    * The <code>MD5OfMessageBody</code> and <code>MessageId</code> elements.
    */
  @js.native
  @Factory
  trait SendMessageResult extends js.Object {
    var MD5OfMessageAttributes: js.UndefOr[String]
    var MD5OfMessageBody: js.UndefOr[String]
    var MD5OfMessageSystemAttributes: js.UndefOr[String]
    var MessageId: js.UndefOr[String]
    var SequenceNumber: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait SetQueueAttributesRequest extends js.Object {
    var Attributes: QueueAttributeMap
    var QueueUrl: String
  }

  @js.native
  @Factory
  trait TagQueueRequest extends js.Object {
    var QueueUrl: String
    var Tags: TagMap
  }

  @js.native
  @Factory
  trait UntagQueueRequest extends js.Object {
    var QueueUrl: String
    var TagKeys: TagKeyList
  }
}
