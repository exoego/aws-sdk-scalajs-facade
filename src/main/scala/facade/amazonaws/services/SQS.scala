package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object sqs {
  type AWSAccountIdList = js.Array[String]
  type ActionNameList = js.Array[String]
  type AttributeNameList = js.Array[QueueAttributeName]
  type BatchResultErrorEntryList = js.Array[BatchResultErrorEntry]
  type Binary = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinaryList = js.Array[Binary]
  type ChangeMessageVisibilityBatchRequestEntryList = js.Array[ChangeMessageVisibilityBatchRequestEntry]
  type ChangeMessageVisibilityBatchResultEntryList = js.Array[ChangeMessageVisibilityBatchResultEntry]
  type DeleteMessageBatchRequestEntryList = js.Array[DeleteMessageBatchRequestEntry]
  type DeleteMessageBatchResultEntryList = js.Array[DeleteMessageBatchResultEntry]
  type MessageAttributeName = String
  type MessageAttributeNameList = js.Array[MessageAttributeName]
  type MessageBodyAttributeMap = js.Dictionary[MessageAttributeValue]
  type MessageList = js.Array[Message]
  type MessageSystemAttributeMap = js.Dictionary[String]
  type MessageSystemAttributeName = String
  type QueueAttributeMap = js.Dictionary[String]
  type QueueAttributeName = String
  type QueueUrlList = js.Array[String]
  type SendMessageBatchRequestEntryList = js.Array[SendMessageBatchRequestEntry]
  type SendMessageBatchResultEntryList = js.Array[SendMessageBatchResultEntry]
  type StringList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
}

package sqs {
  @js.native
  @JSImport("aws-sdk", "SQS")
  class SQS(config: AWSConfig) extends js.Object {
    def addPermission(params: AddPermissionRequest): Request[js.Object] = js.native
    def changeMessageVisibility(params: ChangeMessageVisibilityRequest): Request[js.Object] = js.native
    def changeMessageVisibilityBatch(params: ChangeMessageVisibilityBatchRequest): Request[ChangeMessageVisibilityBatchResult] = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResult] = js.native
    def deleteMessage(params: DeleteMessageRequest): Request[js.Object] = js.native
    def deleteMessageBatch(params: DeleteMessageBatchRequest): Request[DeleteMessageBatchResult] = js.native
    def deleteQueue(params: DeleteQueueRequest): Request[js.Object] = js.native
    def getQueueAttributes(params: GetQueueAttributesRequest): Request[GetQueueAttributesResult] = js.native
    def getQueueUrl(params: GetQueueUrlRequest): Request[GetQueueUrlResult] = js.native
    def listDeadLetterSourceQueues(params: ListDeadLetterSourceQueuesRequest): Request[ListDeadLetterSourceQueuesResult] = js.native
    def listQueueTags(params: ListQueueTagsRequest): Request[ListQueueTagsResult] = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResult] = js.native
    def purgeQueue(params: PurgeQueueRequest): Request[js.Object] = js.native
    def receiveMessage(params: ReceiveMessageRequest): Request[ReceiveMessageResult] = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object] = js.native
    def sendMessage(params: SendMessageRequest): Request[SendMessageResult] = js.native
    def sendMessageBatch(params: SendMessageBatchRequest): Request[SendMessageBatchResult] = js.native
    def setQueueAttributes(params: SetQueueAttributesRequest): Request[js.Object] = js.native
    def tagQueue(params: TagQueueRequest): Request[js.Object] = js.native
    def untagQueue(params: UntagQueueRequest): Request[js.Object] = js.native
  }

  /**
   * <p/>
   */
  @js.native
  trait AddPermissionRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var AWSAccountIds: js.UndefOr[AWSAccountIdList]
    var Actions: js.UndefOr[ActionNameList]
  }

  object AddPermissionRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Label: js.UndefOr[String] = js.undefined,
      AWSAccountIds: js.UndefOr[AWSAccountIdList] = js.undefined,
      Actions: js.UndefOr[ActionNameList] = js.undefined): AddPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "AWSAccountIds" -> AWSAccountIds.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionRequest]
    }
  }

  /**
   * <p>Gives a detailed description of the result of an action on each entry in the request.</p>
   */
  @js.native
  trait BatchResultErrorEntry extends js.Object {
    var Id: js.UndefOr[String]
    var SenderFault: js.UndefOr[Boolean]
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object BatchResultErrorEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      SenderFault: js.UndefOr[Boolean] = js.undefined,
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): BatchResultErrorEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "SenderFault" -> SenderFault.map { x => x.asInstanceOf[js.Any] },
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchResultErrorEntry]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ChangeMessageVisibilityBatchRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var Entries: js.UndefOr[ChangeMessageVisibilityBatchRequestEntryList]
  }

  object ChangeMessageVisibilityBatchRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Entries: js.UndefOr[ChangeMessageVisibilityBatchRequestEntryList] = js.undefined): ChangeMessageVisibilityBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityBatchRequest]
    }
  }

  /**
   * <p>Encloses a receipt handle and an entry id for each message in <code> <a>ChangeMessageVisibilityBatch</a>.</code> </p> <important> <p>All of the following list parameters must be prefixed with <code>ChangeMessageVisibilityBatchRequestEntry.n</code>, where <code>n</code> is an integer value starting with <code>1</code>. For example, a parameter list for this action might look like this:</p> </important> <p> <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.Id=change_visibility_msg_2</code> </p> <p> <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.ReceiptHandle=your_receipt_handle</code> </p> <p> <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.VisibilityTimeout=45</code> </p>
   */
  @js.native
  trait ChangeMessageVisibilityBatchRequestEntry extends js.Object {
    var Id: js.UndefOr[String]
    var ReceiptHandle: js.UndefOr[String]
    var VisibilityTimeout: js.UndefOr[Int]
  }

  object ChangeMessageVisibilityBatchRequestEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      ReceiptHandle: js.UndefOr[String] = js.undefined,
      VisibilityTimeout: js.UndefOr[Int] = js.undefined): ChangeMessageVisibilityBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ReceiptHandle" -> ReceiptHandle.map { x => x.asInstanceOf[js.Any] },
        "VisibilityTimeout" -> VisibilityTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
    }
  }

  /**
   * <p>For each message in the batch, the response contains a <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.</p>
   */
  @js.native
  trait ChangeMessageVisibilityBatchResult extends js.Object {
    var Successful: js.UndefOr[ChangeMessageVisibilityBatchResultEntryList]
    var Failed: js.UndefOr[BatchResultErrorEntryList]
  }

  object ChangeMessageVisibilityBatchResult {
    def apply(
      Successful: js.UndefOr[ChangeMessageVisibilityBatchResultEntryList] = js.undefined,
      Failed: js.UndefOr[BatchResultErrorEntryList] = js.undefined): ChangeMessageVisibilityBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Successful" -> Successful.map { x => x.asInstanceOf[js.Any] },
        "Failed" -> Failed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityBatchResult]
    }
  }

  /**
   * <p>Encloses the <code>Id</code> of an entry in <code> <a>ChangeMessageVisibilityBatch</a>.</code> </p>
   */
  @js.native
  trait ChangeMessageVisibilityBatchResultEntry extends js.Object {
    var Id: js.UndefOr[String]
  }

  object ChangeMessageVisibilityBatchResultEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined): ChangeMessageVisibilityBatchResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
    }
  }

  @js.native
  trait ChangeMessageVisibilityRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var ReceiptHandle: js.UndefOr[String]
    var VisibilityTimeout: js.UndefOr[Int]
  }

  object ChangeMessageVisibilityRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      ReceiptHandle: js.UndefOr[String] = js.undefined,
      VisibilityTimeout: js.UndefOr[Int] = js.undefined): ChangeMessageVisibilityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "ReceiptHandle" -> ReceiptHandle.map { x => x.asInstanceOf[js.Any] },
        "VisibilityTimeout" -> VisibilityTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateQueueRequest extends js.Object {
    var QueueName: js.UndefOr[String]
    var Attributes: js.UndefOr[QueueAttributeMap]
  }

  object CreateQueueRequest {
    def apply(
      QueueName: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[QueueAttributeMap] = js.undefined): CreateQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueName" -> QueueName.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueueRequest]
    }
  }

  /**
   * <p>Returns the <code>QueueUrl</code> attribute of the created queue.</p>
   */
  @js.native
  trait CreateQueueResult extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  object CreateQueueResult {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined): CreateQueueResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueueResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteMessageBatchRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var Entries: js.UndefOr[DeleteMessageBatchRequestEntryList]
  }

  object DeleteMessageBatchRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Entries: js.UndefOr[DeleteMessageBatchRequestEntryList] = js.undefined): DeleteMessageBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageBatchRequest]
    }
  }

  /**
   * <p>Encloses a receipt handle and an identifier for it.</p>
   */
  @js.native
  trait DeleteMessageBatchRequestEntry extends js.Object {
    var Id: js.UndefOr[String]
    var ReceiptHandle: js.UndefOr[String]
  }

  object DeleteMessageBatchRequestEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      ReceiptHandle: js.UndefOr[String] = js.undefined): DeleteMessageBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ReceiptHandle" -> ReceiptHandle.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageBatchRequestEntry]
    }
  }

  /**
   * <p>For each message in the batch, the response contains a <code> <a>DeleteMessageBatchResultEntry</a> </code> tag if the message is deleted or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message can't be deleted.</p>
   */
  @js.native
  trait DeleteMessageBatchResult extends js.Object {
    var Successful: js.UndefOr[DeleteMessageBatchResultEntryList]
    var Failed: js.UndefOr[BatchResultErrorEntryList]
  }

  object DeleteMessageBatchResult {
    def apply(
      Successful: js.UndefOr[DeleteMessageBatchResultEntryList] = js.undefined,
      Failed: js.UndefOr[BatchResultErrorEntryList] = js.undefined): DeleteMessageBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Successful" -> Successful.map { x => x.asInstanceOf[js.Any] },
        "Failed" -> Failed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageBatchResult]
    }
  }

  /**
   * <p>Encloses the <code>Id</code> of an entry in <code> <a>DeleteMessageBatch</a>.</code> </p>
   */
  @js.native
  trait DeleteMessageBatchResultEntry extends js.Object {
    var Id: js.UndefOr[String]
  }

  object DeleteMessageBatchResultEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined): DeleteMessageBatchResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageBatchResultEntry]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteMessageRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var ReceiptHandle: js.UndefOr[String]
  }

  object DeleteMessageRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      ReceiptHandle: js.UndefOr[String] = js.undefined): DeleteMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "ReceiptHandle" -> ReceiptHandle.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteQueueRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  object DeleteQueueRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined): DeleteQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQueueRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetQueueAttributesRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object GetQueueAttributesRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined): GetQueueAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueAttributesRequest]
    }
  }

  /**
   * <p>A list of returned queue attributes.</p>
   */
  @js.native
  trait GetQueueAttributesResult extends js.Object {
    var Attributes: js.UndefOr[QueueAttributeMap]
  }

  object GetQueueAttributesResult {
    def apply(
      Attributes: js.UndefOr[QueueAttributeMap] = js.undefined): GetQueueAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueAttributesResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetQueueUrlRequest extends js.Object {
    var QueueName: js.UndefOr[String]
    var QueueOwnerAWSAccountId: js.UndefOr[String]
  }

  object GetQueueUrlRequest {
    def apply(
      QueueName: js.UndefOr[String] = js.undefined,
      QueueOwnerAWSAccountId: js.UndefOr[String] = js.undefined): GetQueueUrlRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueName" -> QueueName.map { x => x.asInstanceOf[js.Any] },
        "QueueOwnerAWSAccountId" -> QueueOwnerAWSAccountId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueUrlRequest]
    }
  }

  /**
   * <p>For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-api-responses.html">Interpreting Responses</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
   */
  @js.native
  trait GetQueueUrlResult extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  object GetQueueUrlResult {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined): GetQueueUrlResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueUrlResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListDeadLetterSourceQueuesRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  object ListDeadLetterSourceQueuesRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined): ListDeadLetterSourceQueuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeadLetterSourceQueuesRequest]
    }
  }

  /**
   * <p>A list of your dead letter source queues.</p>
   */
  @js.native
  trait ListDeadLetterSourceQueuesResult extends js.Object {
    var queueUrls: js.UndefOr[QueueUrlList]
  }

  object ListDeadLetterSourceQueuesResult {
    def apply(
      queueUrls: js.UndefOr[QueueUrlList] = js.undefined): ListDeadLetterSourceQueuesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "queueUrls" -> queueUrls.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeadLetterSourceQueuesResult]
    }
  }

  @js.native
  trait ListQueueTagsRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  object ListQueueTagsRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined): ListQueueTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueueTagsRequest]
    }
  }

  @js.native
  trait ListQueueTagsResult extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListQueueTagsResult {
    def apply(
      Tags: js.UndefOr[TagMap] = js.undefined): ListQueueTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueueTagsResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListQueuesRequest extends js.Object {
    var QueueNamePrefix: js.UndefOr[String]
  }

  object ListQueuesRequest {
    def apply(
      QueueNamePrefix: js.UndefOr[String] = js.undefined): ListQueuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueNamePrefix" -> QueueNamePrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueuesRequest]
    }
  }

  /**
   * <p>A list of your queues.</p>
   */
  @js.native
  trait ListQueuesResult extends js.Object {
    var QueueUrls: js.UndefOr[QueueUrlList]
  }

  object ListQueuesResult {
    def apply(
      QueueUrls: js.UndefOr[QueueUrlList] = js.undefined): ListQueuesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrls" -> QueueUrls.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueuesResult]
    }
  }

  /**
   * <p>An Amazon SQS message.</p>
   */
  @js.native
  trait Message extends js.Object {
    var ReceiptHandle: js.UndefOr[String]
    var Attributes: js.UndefOr[MessageSystemAttributeMap]
    var MD5OfMessageAttributes: js.UndefOr[String]
    var Body: js.UndefOr[String]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var MD5OfBody: js.UndefOr[String]
    var MessageId: js.UndefOr[String]
  }

  object Message {
    def apply(
      ReceiptHandle: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[MessageSystemAttributeMap] = js.undefined,
      MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
      Body: js.UndefOr[String] = js.undefined,
      MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
      MD5OfBody: js.UndefOr[String] = js.undefined,
      MessageId: js.UndefOr[String] = js.undefined): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReceiptHandle" -> ReceiptHandle.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "MD5OfMessageAttributes" -> MD5OfMessageAttributes.map { x => x.asInstanceOf[js.Any] },
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "MessageAttributes" -> MessageAttributes.map { x => x.asInstanceOf[js.Any] },
        "MD5OfBody" -> MD5OfBody.map { x => x.asInstanceOf[js.Any] },
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
    }
  }

  /**
   * <p>The user-specified message attribute value. For string data types, the <code>Value</code> attribute has the same restrictions on the content as the message body. For more information, see <code> <a>SendMessage</a>.</code> </p> <p> <code>Name</code>, <code>type</code>, <code>value</code> and the message body must not be empty or null. All parts of the message attribute, including <code>Name</code>, <code>Type</code>, and <code>Value</code>, are part of the message size restriction (256 KB or 262,144 bytes).</p>
   */
  @js.native
  trait MessageAttributeValue extends js.Object {
    var BinaryValue: js.UndefOr[Binary]
    var StringValue: js.UndefOr[String]
    var BinaryListValues: js.UndefOr[BinaryList]
    var DataType: js.UndefOr[String]
    var StringListValues: js.UndefOr[StringList]
  }

  object MessageAttributeValue {
    def apply(
      BinaryValue: js.UndefOr[Binary] = js.undefined,
      StringValue: js.UndefOr[String] = js.undefined,
      BinaryListValues: js.UndefOr[BinaryList] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined,
      StringListValues: js.UndefOr[StringList] = js.undefined): MessageAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BinaryValue" -> BinaryValue.map { x => x.asInstanceOf[js.Any] },
        "StringValue" -> StringValue.map { x => x.asInstanceOf[js.Any] },
        "BinaryListValues" -> BinaryListValues.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] },
        "StringListValues" -> StringListValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageAttributeValue]
    }
  }

  object MessageSystemAttributeNameEnum {
    val SenderId = "SenderId"
    val SentTimestamp = "SentTimestamp"
    val ApproximateReceiveCount = "ApproximateReceiveCount"
    val ApproximateFirstReceiveTimestamp = "ApproximateFirstReceiveTimestamp"
    val SequenceNumber = "SequenceNumber"
    val MessageDeduplicationId = "MessageDeduplicationId"
    val MessageGroupId = "MessageGroupId"

    val values = IndexedSeq(SenderId, SentTimestamp, ApproximateReceiveCount, ApproximateFirstReceiveTimestamp, SequenceNumber, MessageDeduplicationId, MessageGroupId)
  }

  /**
   * <p/>
   */
  @js.native
  trait PurgeQueueRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
  }

  object PurgeQueueRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined): PurgeQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurgeQueueRequest]
    }
  }

  object QueueAttributeNameEnum {
    val All = "All"
    val Policy = "Policy"
    val VisibilityTimeout = "VisibilityTimeout"
    val MaximumMessageSize = "MaximumMessageSize"
    val MessageRetentionPeriod = "MessageRetentionPeriod"
    val ApproximateNumberOfMessages = "ApproximateNumberOfMessages"
    val ApproximateNumberOfMessagesNotVisible = "ApproximateNumberOfMessagesNotVisible"
    val CreatedTimestamp = "CreatedTimestamp"
    val LastModifiedTimestamp = "LastModifiedTimestamp"
    val QueueArn = "QueueArn"
    val ApproximateNumberOfMessagesDelayed = "ApproximateNumberOfMessagesDelayed"
    val DelaySeconds = "DelaySeconds"
    val ReceiveMessageWaitTimeSeconds = "ReceiveMessageWaitTimeSeconds"
    val RedrivePolicy = "RedrivePolicy"
    val FifoQueue = "FifoQueue"
    val ContentBasedDeduplication = "ContentBasedDeduplication"
    val KmsMasterKeyId = "KmsMasterKeyId"
    val KmsDataKeyReusePeriodSeconds = "KmsDataKeyReusePeriodSeconds"

    val values = IndexedSeq(All, Policy, VisibilityTimeout, MaximumMessageSize, MessageRetentionPeriod, ApproximateNumberOfMessages, ApproximateNumberOfMessagesNotVisible, CreatedTimestamp, LastModifiedTimestamp, QueueArn, ApproximateNumberOfMessagesDelayed, DelaySeconds, ReceiveMessageWaitTimeSeconds, RedrivePolicy, FifoQueue, ContentBasedDeduplication, KmsMasterKeyId, KmsDataKeyReusePeriodSeconds)
  }

  /**
   * <p/>
   */
  @js.native
  trait ReceiveMessageRequest extends js.Object {
    var MessageAttributeNames: js.UndefOr[MessageAttributeNameList]
    var VisibilityTimeout: js.UndefOr[Int]
    var MaxNumberOfMessages: js.UndefOr[Int]
    var WaitTimeSeconds: js.UndefOr[Int]
    var ReceiveRequestAttemptId: js.UndefOr[String]
    var QueueUrl: js.UndefOr[String]
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object ReceiveMessageRequest {
    def apply(
      MessageAttributeNames: js.UndefOr[MessageAttributeNameList] = js.undefined,
      VisibilityTimeout: js.UndefOr[Int] = js.undefined,
      MaxNumberOfMessages: js.UndefOr[Int] = js.undefined,
      WaitTimeSeconds: js.UndefOr[Int] = js.undefined,
      ReceiveRequestAttemptId: js.UndefOr[String] = js.undefined,
      QueueUrl: js.UndefOr[String] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined): ReceiveMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageAttributeNames" -> MessageAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "VisibilityTimeout" -> VisibilityTimeout.map { x => x.asInstanceOf[js.Any] },
        "MaxNumberOfMessages" -> MaxNumberOfMessages.map { x => x.asInstanceOf[js.Any] },
        "WaitTimeSeconds" -> WaitTimeSeconds.map { x => x.asInstanceOf[js.Any] },
        "ReceiveRequestAttemptId" -> ReceiveRequestAttemptId.map { x => x.asInstanceOf[js.Any] },
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiveMessageRequest]
    }
  }

  /**
   * <p>A list of received messages.</p>
   */
  @js.native
  trait ReceiveMessageResult extends js.Object {
    var Messages: js.UndefOr[MessageList]
  }

  object ReceiveMessageResult {
    def apply(
      Messages: js.UndefOr[MessageList] = js.undefined): ReceiveMessageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Messages" -> Messages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiveMessageResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RemovePermissionRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var Label: js.UndefOr[String]
  }

  object RemovePermissionRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Label: js.UndefOr[String] = js.undefined): RemovePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait SendMessageBatchRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var Entries: js.UndefOr[SendMessageBatchRequestEntryList]
  }

  object SendMessageBatchRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Entries: js.UndefOr[SendMessageBatchRequestEntryList] = js.undefined): SendMessageBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "Entries" -> Entries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageBatchRequest]
    }
  }

  /**
   * <p>Contains the details of a single Amazon SQS message along with an <code>Id</code>.</p>
   */
  @js.native
  trait SendMessageBatchRequestEntry extends js.Object {
    var Id: js.UndefOr[String]
    var MessageBody: js.UndefOr[String]
    var MessageGroupId: js.UndefOr[String]
    var MessageDeduplicationId: js.UndefOr[String]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var DelaySeconds: js.UndefOr[Int]
  }

  object SendMessageBatchRequestEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      MessageBody: js.UndefOr[String] = js.undefined,
      MessageGroupId: js.UndefOr[String] = js.undefined,
      MessageDeduplicationId: js.UndefOr[String] = js.undefined,
      MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
      DelaySeconds: js.UndefOr[Int] = js.undefined): SendMessageBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "MessageBody" -> MessageBody.map { x => x.asInstanceOf[js.Any] },
        "MessageGroupId" -> MessageGroupId.map { x => x.asInstanceOf[js.Any] },
        "MessageDeduplicationId" -> MessageDeduplicationId.map { x => x.asInstanceOf[js.Any] },
        "MessageAttributes" -> MessageAttributes.map { x => x.asInstanceOf[js.Any] },
        "DelaySeconds" -> DelaySeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageBatchRequestEntry]
    }
  }

  /**
   * <p>For each message in the batch, the response contains a <code> <a>SendMessageBatchResultEntry</a> </code> tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.</p>
   */
  @js.native
  trait SendMessageBatchResult extends js.Object {
    var Successful: js.UndefOr[SendMessageBatchResultEntryList]
    var Failed: js.UndefOr[BatchResultErrorEntryList]
  }

  object SendMessageBatchResult {
    def apply(
      Successful: js.UndefOr[SendMessageBatchResultEntryList] = js.undefined,
      Failed: js.UndefOr[BatchResultErrorEntryList] = js.undefined): SendMessageBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Successful" -> Successful.map { x => x.asInstanceOf[js.Any] },
        "Failed" -> Failed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageBatchResult]
    }
  }

  /**
   * <p>Encloses a <code>MessageId</code> for a successfully-enqueued message in a <code> <a>SendMessageBatch</a>.</code> </p>
   */
  @js.native
  trait SendMessageBatchResultEntry extends js.Object {
    var Id: js.UndefOr[String]
    var SequenceNumber: js.UndefOr[String]
    var MD5OfMessageAttributes: js.UndefOr[String]
    var MessageId: js.UndefOr[String]
    var MD5OfMessageBody: js.UndefOr[String]
  }

  object SendMessageBatchResultEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      SequenceNumber: js.UndefOr[String] = js.undefined,
      MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
      MessageId: js.UndefOr[String] = js.undefined,
      MD5OfMessageBody: js.UndefOr[String] = js.undefined): SendMessageBatchResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "MD5OfMessageAttributes" -> MD5OfMessageAttributes.map { x => x.asInstanceOf[js.Any] },
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] },
        "MD5OfMessageBody" -> MD5OfMessageBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageBatchResultEntry]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait SendMessageRequest extends js.Object {
    var MessageBody: js.UndefOr[String]
    var MessageGroupId: js.UndefOr[String]
    var MessageDeduplicationId: js.UndefOr[String]
    var MessageAttributes: js.UndefOr[MessageBodyAttributeMap]
    var DelaySeconds: js.UndefOr[Int]
    var QueueUrl: js.UndefOr[String]
  }

  object SendMessageRequest {
    def apply(
      MessageBody: js.UndefOr[String] = js.undefined,
      MessageGroupId: js.UndefOr[String] = js.undefined,
      MessageDeduplicationId: js.UndefOr[String] = js.undefined,
      MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
      DelaySeconds: js.UndefOr[Int] = js.undefined,
      QueueUrl: js.UndefOr[String] = js.undefined): SendMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageBody" -> MessageBody.map { x => x.asInstanceOf[js.Any] },
        "MessageGroupId" -> MessageGroupId.map { x => x.asInstanceOf[js.Any] },
        "MessageDeduplicationId" -> MessageDeduplicationId.map { x => x.asInstanceOf[js.Any] },
        "MessageAttributes" -> MessageAttributes.map { x => x.asInstanceOf[js.Any] },
        "DelaySeconds" -> DelaySeconds.map { x => x.asInstanceOf[js.Any] },
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageRequest]
    }
  }

  /**
   * <p>The <code>MD5OfMessageBody</code> and <code>MessageId</code> elements.</p>
   */
  @js.native
  trait SendMessageResult extends js.Object {
    var MD5OfMessageBody: js.UndefOr[String]
    var MD5OfMessageAttributes: js.UndefOr[String]
    var MessageId: js.UndefOr[String]
    var SequenceNumber: js.UndefOr[String]
  }

  object SendMessageResult {
    def apply(
      MD5OfMessageBody: js.UndefOr[String] = js.undefined,
      MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
      MessageId: js.UndefOr[String] = js.undefined,
      SequenceNumber: js.UndefOr[String] = js.undefined): SendMessageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MD5OfMessageBody" -> MD5OfMessageBody.map { x => x.asInstanceOf[js.Any] },
        "MD5OfMessageAttributes" -> MD5OfMessageAttributes.map { x => x.asInstanceOf[js.Any] },
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait SetQueueAttributesRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var Attributes: js.UndefOr[QueueAttributeMap]
  }

  object SetQueueAttributesRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[QueueAttributeMap] = js.undefined): SetQueueAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetQueueAttributesRequest]
    }
  }

  @js.native
  trait TagQueueRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var Tags: js.UndefOr[TagMap]
  }

  object TagQueueRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagMap] = js.undefined): TagQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagQueueRequest]
    }
  }

  @js.native
  trait UntagQueueRequest extends js.Object {
    var QueueUrl: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object UntagQueueRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueueUrl" -> QueueUrl.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagQueueRequest]
    }
  }
}
