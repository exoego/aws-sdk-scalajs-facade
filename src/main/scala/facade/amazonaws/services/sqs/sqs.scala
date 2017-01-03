package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object sqs {
  type AWSAccountIdList = js.Array[String]
  type ActionNameList = js.Array[String]
  type AttributeNameList = js.Array[QueueAttributeName]
  type BatchResultErrorEntryList = js.Array[BatchResultErrorEntry]
  type Binary = js.Array[Byte]
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
}

package sqs {
  @js.native
  trait Sqs extends js.Object {
    def addPermission(params: AddPermissionRequest, callback: Callback[js.Object]): Unit = js.native
    def addPermission(params: AddPermissionRequest): Request[js.Object] = js.native
    def changeMessageVisibility(params: ChangeMessageVisibilityRequest, callback: Callback[js.Object]): Unit = js.native
    def changeMessageVisibility(params: ChangeMessageVisibilityRequest): Request[js.Object] = js.native
    def changeMessageVisibilityBatch(params: ChangeMessageVisibilityBatchRequest, callback: Callback[ChangeMessageVisibilityBatchResult]): Unit = js.native
    def changeMessageVisibilityBatch(params: ChangeMessageVisibilityBatchRequest): Request[ChangeMessageVisibilityBatchResult] = js.native
    def createQueue(params: CreateQueueRequest, callback: Callback[CreateQueueResult]): Unit = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResult] = js.native
    def deleteMessage(params: DeleteMessageRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteMessage(params: DeleteMessageRequest): Request[js.Object] = js.native
    def deleteMessageBatch(params: DeleteMessageBatchRequest, callback: Callback[DeleteMessageBatchResult]): Unit = js.native
    def deleteMessageBatch(params: DeleteMessageBatchRequest): Request[DeleteMessageBatchResult] = js.native
    def deleteQueue(params: DeleteQueueRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteQueue(params: DeleteQueueRequest): Request[js.Object] = js.native
    def getQueueAttributes(params: GetQueueAttributesRequest, callback: Callback[GetQueueAttributesResult]): Unit = js.native
    def getQueueAttributes(params: GetQueueAttributesRequest): Request[GetQueueAttributesResult] = js.native
    def getQueueUrl(params: GetQueueUrlRequest, callback: Callback[GetQueueUrlResult]): Unit = js.native
    def getQueueUrl(params: GetQueueUrlRequest): Request[GetQueueUrlResult] = js.native
    def listDeadLetterSourceQueues(params: ListDeadLetterSourceQueuesRequest, callback: Callback[ListDeadLetterSourceQueuesResult]): Unit = js.native
    def listDeadLetterSourceQueues(params: ListDeadLetterSourceQueuesRequest): Request[ListDeadLetterSourceQueuesResult] = js.native
    def listQueues(params: ListQueuesRequest, callback: Callback[ListQueuesResult]): Unit = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResult] = js.native
    def purgeQueue(params: PurgeQueueRequest, callback: Callback[js.Object]): Unit = js.native
    def purgeQueue(params: PurgeQueueRequest): Request[js.Object] = js.native
    def receiveMessage(params: ReceiveMessageRequest, callback: Callback[ReceiveMessageResult]): Unit = js.native
    def receiveMessage(params: ReceiveMessageRequest): Request[ReceiveMessageResult] = js.native
    def removePermission(params: RemovePermissionRequest, callback: Callback[js.Object]): Unit = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object] = js.native
    def sendMessage(params: SendMessageRequest, callback: Callback[SendMessageResult]): Unit = js.native
    def sendMessage(params: SendMessageRequest): Request[SendMessageResult] = js.native
    def sendMessageBatch(params: SendMessageBatchRequest, callback: Callback[SendMessageBatchResult]): Unit = js.native
    def sendMessageBatch(params: SendMessageBatchRequest): Request[SendMessageBatchResult] = js.native
    def setQueueAttributes(params: SetQueueAttributesRequest, callback: Callback[js.Object]): Unit = js.native
    def setQueueAttributes(params: SetQueueAttributesRequest): Request[js.Object] = js.native
  }

  /**
   * <p/>
   */
  @js.native
  trait AddPermissionRequest extends js.Object {
    var QueueUrl: String
    var Label: String
    var AWSAccountIds: AWSAccountIdList
    var Actions: ActionNameList
  }

  object AddPermissionRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Label: js.UndefOr[String] = js.undefined,
      AWSAccountIds: js.UndefOr[AWSAccountIdList] = js.undefined,
      Actions: js.UndefOr[ActionNameList] = js.undefined
    ): AddPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("Label" -> Label.map { x => x: js.Any }),
        ("AWSAccountIds" -> AWSAccountIds.map { x => x: js.Any }),
        ("Actions" -> Actions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionRequest]
    }
  }

  /**
   * <p>Two or more batch entries in the request have the same <code>Id</code>.</p>
   */
  @js.native
  trait BatchEntryIdsNotDistinctException extends js.Object {

  }

  /**
   * <p>The length of all the messages put together is more than the limit.</p>
   */
  @js.native
  trait BatchRequestTooLongException extends js.Object {

  }

  /**
   * <p>This is used in the responses of batch API to give a detailed description of the result of an action on each entry in the request.</p>
   */
  @js.native
  trait BatchResultErrorEntry extends js.Object {
    var Id: String
    var SenderFault: Boolean
    var Code: String
    var Message: String
  }

  object BatchResultErrorEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      SenderFault: js.UndefOr[Boolean] = js.undefined,
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): BatchResultErrorEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("SenderFault" -> SenderFault.map { x => x: js.Any }),
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchResultErrorEntry]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ChangeMessageVisibilityBatchRequest extends js.Object {
    var QueueUrl: String
    var Entries: ChangeMessageVisibilityBatchRequestEntryList
  }

  object ChangeMessageVisibilityBatchRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Entries: js.UndefOr[ChangeMessageVisibilityBatchRequestEntryList] = js.undefined
    ): ChangeMessageVisibilityBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("Entries" -> Entries.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityBatchRequest]
    }
  }

  /**
   * <p>Encloses a receipt handle and an entry id for each message in <code> <a>ChangeMessageVisibilityBatch</a> </code>.</p> <important> <p>All of the following list parameters must be prefixed with <code>ChangeMessageVisibilityBatchRequestEntry.n</code>, where <code>n</code> is an integer value starting with <code>1</code>. For example, a parameter list for this action might look like this:</p> </important> <p> <code>&amp;amp;ChangeMessageVisibilityBatchRequestEntry.1.Id=change_visibility_msg_2</code> </p> <p> <code>&amp;amp;ChangeMessageVisibilityBatchRequestEntry.1.ReceiptHandle=&lt;replaceable&gt;Your_Receipt_Handle&lt;/replaceable&gt;</code> </p> <p> <code>&amp;amp;ChangeMessageVisibilityBatchRequestEntry.1.VisibilityTimeout=45</code> </p>
   */
  @js.native
  trait ChangeMessageVisibilityBatchRequestEntry extends js.Object {
    var Id: String
    var ReceiptHandle: String
    var VisibilityTimeout: Integer
  }

  object ChangeMessageVisibilityBatchRequestEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      ReceiptHandle: js.UndefOr[String] = js.undefined,
      VisibilityTimeout: js.UndefOr[Integer] = js.undefined
    ): ChangeMessageVisibilityBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ReceiptHandle" -> ReceiptHandle.map { x => x: js.Any }),
        ("VisibilityTimeout" -> VisibilityTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
    }
  }

  /**
   * <p>For each message in the batch, the response contains a <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.</p>
   */
  @js.native
  trait ChangeMessageVisibilityBatchResult extends js.Object {
    var Successful: ChangeMessageVisibilityBatchResultEntryList
    var Failed: BatchResultErrorEntryList
  }

  object ChangeMessageVisibilityBatchResult {
    def apply(
      Successful: js.UndefOr[ChangeMessageVisibilityBatchResultEntryList] = js.undefined,
      Failed: js.UndefOr[BatchResultErrorEntryList] = js.undefined
    ): ChangeMessageVisibilityBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Successful" -> Successful.map { x => x: js.Any }),
        ("Failed" -> Failed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityBatchResult]
    }
  }

  /**
   * <p>Encloses the <code>Id</code> of an entry in <code> <a>ChangeMessageVisibilityBatch</a> </code>.</p>
   */
  @js.native
  trait ChangeMessageVisibilityBatchResultEntry extends js.Object {
    var Id: String
  }

  object ChangeMessageVisibilityBatchResultEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined
    ): ChangeMessageVisibilityBatchResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
    }
  }

  @js.native
  trait ChangeMessageVisibilityRequest extends js.Object {
    var QueueUrl: String
    var ReceiptHandle: String
    var VisibilityTimeout: Integer
  }

  object ChangeMessageVisibilityRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      ReceiptHandle: js.UndefOr[String] = js.undefined,
      VisibilityTimeout: js.UndefOr[Integer] = js.undefined
    ): ChangeMessageVisibilityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("ReceiptHandle" -> ReceiptHandle.map { x => x: js.Any }),
        ("VisibilityTimeout" -> VisibilityTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeMessageVisibilityRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateQueueRequest extends js.Object {
    var QueueName: String
    var Attributes: QueueAttributeMap
  }

  object CreateQueueRequest {
    def apply(
      QueueName: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[QueueAttributeMap] = js.undefined
    ): CreateQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueName" -> QueueName.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueueRequest]
    }
  }

  /**
   * <p>Returns the <code>QueueUrl</code> attribute of the created queue.</p>
   */
  @js.native
  trait CreateQueueResult extends js.Object {
    var QueueUrl: String
  }

  object CreateQueueResult {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined
    ): CreateQueueResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueueResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteMessageBatchRequest extends js.Object {
    var QueueUrl: String
    var Entries: DeleteMessageBatchRequestEntryList
  }

  object DeleteMessageBatchRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Entries: js.UndefOr[DeleteMessageBatchRequestEntryList] = js.undefined
    ): DeleteMessageBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("Entries" -> Entries.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageBatchRequest]
    }
  }

  /**
   * <p>Encloses a receipt handle and an identifier for it.</p>
   */
  @js.native
  trait DeleteMessageBatchRequestEntry extends js.Object {
    var Id: String
    var ReceiptHandle: String
  }

  object DeleteMessageBatchRequestEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      ReceiptHandle: js.UndefOr[String] = js.undefined
    ): DeleteMessageBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ReceiptHandle" -> ReceiptHandle.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageBatchRequestEntry]
    }
  }

  /**
   * <p>For each message in the batch, the response contains a <code> <a>DeleteMessageBatchResultEntry</a> </code> tag if the message is deleted or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message can't be deleted.</p>
   */
  @js.native
  trait DeleteMessageBatchResult extends js.Object {
    var Successful: DeleteMessageBatchResultEntryList
    var Failed: BatchResultErrorEntryList
  }

  object DeleteMessageBatchResult {
    def apply(
      Successful: js.UndefOr[DeleteMessageBatchResultEntryList] = js.undefined,
      Failed: js.UndefOr[BatchResultErrorEntryList] = js.undefined
    ): DeleteMessageBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Successful" -> Successful.map { x => x: js.Any }),
        ("Failed" -> Failed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageBatchResult]
    }
  }

  /**
   * <p>Encloses the <code>Id</code> of an entry in <code> <a>DeleteMessageBatch</a> </code>.</p>
   */
  @js.native
  trait DeleteMessageBatchResultEntry extends js.Object {
    var Id: String
  }

  object DeleteMessageBatchResultEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined
    ): DeleteMessageBatchResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageBatchResultEntry]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteMessageRequest extends js.Object {
    var QueueUrl: String
    var ReceiptHandle: String
  }

  object DeleteMessageRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      ReceiptHandle: js.UndefOr[String] = js.undefined
    ): DeleteMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("ReceiptHandle" -> ReceiptHandle.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMessageRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteQueueRequest extends js.Object {
    var QueueUrl: String
  }

  object DeleteQueueRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined
    ): DeleteQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQueueRequest]
    }
  }

  /**
   * <p>The batch request doesn't contain any entries.</p>
   */
  @js.native
  trait EmptyBatchRequestException extends js.Object {

  }

  /**
   * <p/>
   */
  @js.native
  trait GetQueueAttributesRequest extends js.Object {
    var QueueUrl: String
    var AttributeNames: AttributeNameList
  }

  object GetQueueAttributesRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
    ): GetQueueAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("AttributeNames" -> AttributeNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueAttributesRequest]
    }
  }

  /**
   * <p>A list of returned queue attributes.</p>
   */
  @js.native
  trait GetQueueAttributesResult extends js.Object {
    var Attributes: QueueAttributeMap
  }

  object GetQueueAttributesResult {
    def apply(
      Attributes: js.UndefOr[QueueAttributeMap] = js.undefined
    ): GetQueueAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueAttributesResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetQueueUrlRequest extends js.Object {
    var QueueName: String
    var QueueOwnerAWSAccountId: String
  }

  object GetQueueUrlRequest {
    def apply(
      QueueName: js.UndefOr[String] = js.undefined,
      QueueOwnerAWSAccountId: js.UndefOr[String] = js.undefined
    ): GetQueueUrlRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueName" -> QueueName.map { x => x: js.Any }),
        ("QueueOwnerAWSAccountId" -> QueueOwnerAWSAccountId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueUrlRequest]
    }
  }

  /**
   * <p>For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/UnderstandingResponses.html">Responses</a> in the <i>Amazon SQS Developer Guide</i>.</p>
   */
  @js.native
  trait GetQueueUrlResult extends js.Object {
    var QueueUrl: String
  }

  object GetQueueUrlResult {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined
    ): GetQueueUrlResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueUrlResult]
    }
  }

  /**
   * <p>The attribute referred to doesn't exist.</p>
   */
  @js.native
  trait InvalidAttributeNameException extends js.Object {

  }

  /**
   * <p>The <code>Id</code> of a batch entry in a batch request doesn't abide by the specification.</p>
   */
  @js.native
  trait InvalidBatchEntryIdException extends js.Object {

  }

  /**
   * <p>The receipt handle isn't valid for the current version.</p>
   */
  @js.native
  trait InvalidIdFormatException extends js.Object {

  }

  /**
   * <p>The message contains characters outside the allowed set.</p>
   */
  @js.native
  trait InvalidMessageContentsException extends js.Object {

  }

  /**
   * <p/>
   */
  @js.native
  trait ListDeadLetterSourceQueuesRequest extends js.Object {
    var QueueUrl: String
  }

  object ListDeadLetterSourceQueuesRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined
    ): ListDeadLetterSourceQueuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeadLetterSourceQueuesRequest]
    }
  }

  /**
   * <p>A list of your dead letter source queues.</p>
   */
  @js.native
  trait ListDeadLetterSourceQueuesResult extends js.Object {
    var queueUrls: QueueUrlList
  }

  object ListDeadLetterSourceQueuesResult {
    def apply(
      queueUrls: js.UndefOr[QueueUrlList] = js.undefined
    ): ListDeadLetterSourceQueuesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("queueUrls" -> queueUrls.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeadLetterSourceQueuesResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListQueuesRequest extends js.Object {
    var QueueNamePrefix: String
  }

  object ListQueuesRequest {
    def apply(
      QueueNamePrefix: js.UndefOr[String] = js.undefined
    ): ListQueuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueNamePrefix" -> QueueNamePrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueuesRequest]
    }
  }

  /**
   * <p>A list of your queues.</p>
   */
  @js.native
  trait ListQueuesResult extends js.Object {
    var QueueUrls: QueueUrlList
  }

  object ListQueuesResult {
    def apply(
      QueueUrls: js.UndefOr[QueueUrlList] = js.undefined
    ): ListQueuesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrls" -> QueueUrls.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueuesResult]
    }
  }

  /**
   * <p>An Amazon SQS message.</p>
   */
  @js.native
  trait Message extends js.Object {
    var ReceiptHandle: String
    var Attributes: MessageSystemAttributeMap
    var MD5OfMessageAttributes: String
    var Body: String
    var MessageAttributes: MessageBodyAttributeMap
    var MD5OfBody: String
    var MessageId: String
  }

  object Message {
    def apply(
      ReceiptHandle: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[MessageSystemAttributeMap] = js.undefined,
      MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
      Body: js.UndefOr[String] = js.undefined,
      MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
      MD5OfBody: js.UndefOr[String] = js.undefined,
      MessageId: js.UndefOr[String] = js.undefined
    ): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReceiptHandle" -> ReceiptHandle.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("MD5OfMessageAttributes" -> MD5OfMessageAttributes.map { x => x: js.Any }),
        ("Body" -> Body.map { x => x: js.Any }),
        ("MessageAttributes" -> MessageAttributes.map { x => x: js.Any }),
        ("MD5OfBody" -> MD5OfBody.map { x => x: js.Any }),
        ("MessageId" -> MessageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
    }
  }

  /**
   * <p>The user-specified message attribute value. For string data types, the <code>Value</code> attribute has the same restrictions on the content as the message body. For more information, see <code> <a>SendMessage</a> </code>.</p> <p> <code>Name</code>, <code>type</code>, <code>value</code> and the message body must not be empty or null. All parts of the message attribute, including <code>Name</code>, <code>Type</code>, and <code>Value</code>, are part of the message size restriction (256 KB or 262,144 bytes).</p>
   */
  @js.native
  trait MessageAttributeValue extends js.Object {
    var BinaryValue: Binary
    var StringValue: String
    var BinaryListValues: BinaryList
    var DataType: String
    var StringListValues: StringList
  }

  object MessageAttributeValue {
    def apply(
      BinaryValue: js.UndefOr[Binary] = js.undefined,
      StringValue: js.UndefOr[String] = js.undefined,
      BinaryListValues: js.UndefOr[BinaryList] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined,
      StringListValues: js.UndefOr[StringList] = js.undefined
    ): MessageAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BinaryValue" -> BinaryValue.map { x => x: js.Any }),
        ("StringValue" -> StringValue.map { x => x: js.Any }),
        ("BinaryListValues" -> BinaryListValues.map { x => x: js.Any }),
        ("DataType" -> DataType.map { x => x: js.Any }),
        ("StringListValues" -> StringListValues.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageAttributeValue]
    }
  }

  /**
   * <p>The message referred to isn't in flight.</p>
   */
  @js.native
  trait MessageNotInflightException extends js.Object {

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
   * <p>The action that you requested would violate a limit. For example, <code>ReceiveMessage</code> returns this error if the maximum number of inflight messages is reached. <code> <a>AddPermission</a> </code> returns this error if the maximum number of permissions for the queue is reached.</p>
   */
  @js.native
  trait OverLimitException extends js.Object {

  }

  /**
   * <p>Indicates that the specified queue previously received a <code>PurgeQueue</code> request within the last 60 seconds (the time it can take to delete the messages in the queue).</p>
   */
  @js.native
  trait PurgeQueueInProgressException extends js.Object {

  }

  /**
   * <p/>
   */
  @js.native
  trait PurgeQueueRequest extends js.Object {
    var QueueUrl: String
  }

  object PurgeQueueRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined
    ): PurgeQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

    val values = IndexedSeq(All, Policy, VisibilityTimeout, MaximumMessageSize, MessageRetentionPeriod, ApproximateNumberOfMessages, ApproximateNumberOfMessagesNotVisible, CreatedTimestamp, LastModifiedTimestamp, QueueArn, ApproximateNumberOfMessagesDelayed, DelaySeconds, ReceiveMessageWaitTimeSeconds, RedrivePolicy, FifoQueue, ContentBasedDeduplication)
  }

  /**
   * <p>You must wait 60 seconds after deleting a queue before you can create another one with the same name.</p>
   */
  @js.native
  trait QueueDeletedRecentlyException extends js.Object {

  }

  /**
   * <p>The queue referred to doesn't exist.</p>
   */
  @js.native
  trait QueueDoesNotExistException extends js.Object {

  }

  /**
   * <p>A queue already exists with this name. Amazon SQS returns this error only if the request includes attributes whose values differ from those of the existing queue.</p>
   */
  @js.native
  trait QueueNameExistsException extends js.Object {

  }

  /**
   * <p>The receipt handle provided isn't valid.</p>
   */
  @js.native
  trait ReceiptHandleIsInvalidException extends js.Object {

  }

  /**
   * <p/>
   */
  @js.native
  trait ReceiveMessageRequest extends js.Object {
    var MessageAttributeNames: MessageAttributeNameList
    var VisibilityTimeout: Integer
    var MaxNumberOfMessages: Integer
    var WaitTimeSeconds: Integer
    var ReceiveRequestAttemptId: String
    var QueueUrl: String
    var AttributeNames: AttributeNameList
  }

  object ReceiveMessageRequest {
    def apply(
      MessageAttributeNames: js.UndefOr[MessageAttributeNameList] = js.undefined,
      VisibilityTimeout: js.UndefOr[Integer] = js.undefined,
      MaxNumberOfMessages: js.UndefOr[Integer] = js.undefined,
      WaitTimeSeconds: js.UndefOr[Integer] = js.undefined,
      ReceiveRequestAttemptId: js.UndefOr[String] = js.undefined,
      QueueUrl: js.UndefOr[String] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
    ): ReceiveMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MessageAttributeNames" -> MessageAttributeNames.map { x => x: js.Any }),
        ("VisibilityTimeout" -> VisibilityTimeout.map { x => x: js.Any }),
        ("MaxNumberOfMessages" -> MaxNumberOfMessages.map { x => x: js.Any }),
        ("WaitTimeSeconds" -> WaitTimeSeconds.map { x => x: js.Any }),
        ("ReceiveRequestAttemptId" -> ReceiveRequestAttemptId.map { x => x: js.Any }),
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("AttributeNames" -> AttributeNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiveMessageRequest]
    }
  }

  /**
   * <p>A list of received messages.</p>
   */
  @js.native
  trait ReceiveMessageResult extends js.Object {
    var Messages: MessageList
  }

  object ReceiveMessageResult {
    def apply(
      Messages: js.UndefOr[MessageList] = js.undefined
    ): ReceiveMessageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Messages" -> Messages.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiveMessageResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RemovePermissionRequest extends js.Object {
    var QueueUrl: String
    var Label: String
  }

  object RemovePermissionRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Label: js.UndefOr[String] = js.undefined
    ): RemovePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("Label" -> Label.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait SendMessageBatchRequest extends js.Object {
    var QueueUrl: String
    var Entries: SendMessageBatchRequestEntryList
  }

  object SendMessageBatchRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Entries: js.UndefOr[SendMessageBatchRequestEntryList] = js.undefined
    ): SendMessageBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("Entries" -> Entries.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageBatchRequest]
    }
  }

  /**
   * <p>Contains the details of a single Amazon SQS message along with an <code>Id</code>.</p>
   */
  @js.native
  trait SendMessageBatchRequestEntry extends js.Object {
    var Id: String
    var MessageBody: String
    var MessageGroupId: String
    var MessageDeduplicationId: String
    var MessageAttributes: MessageBodyAttributeMap
    var DelaySeconds: Integer
  }

  object SendMessageBatchRequestEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      MessageBody: js.UndefOr[String] = js.undefined,
      MessageGroupId: js.UndefOr[String] = js.undefined,
      MessageDeduplicationId: js.UndefOr[String] = js.undefined,
      MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
      DelaySeconds: js.UndefOr[Integer] = js.undefined
    ): SendMessageBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("MessageBody" -> MessageBody.map { x => x: js.Any }),
        ("MessageGroupId" -> MessageGroupId.map { x => x: js.Any }),
        ("MessageDeduplicationId" -> MessageDeduplicationId.map { x => x: js.Any }),
        ("MessageAttributes" -> MessageAttributes.map { x => x: js.Any }),
        ("DelaySeconds" -> DelaySeconds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageBatchRequestEntry]
    }
  }

  /**
   * <p>For each message in the batch, the response contains a <code> <a>SendMessageBatchResultEntry</a> </code> tag if the message succeeds or a <code> <a>BatchResultErrorEntry</a> </code> tag if the message fails.</p>
   */
  @js.native
  trait SendMessageBatchResult extends js.Object {
    var Successful: SendMessageBatchResultEntryList
    var Failed: BatchResultErrorEntryList
  }

  object SendMessageBatchResult {
    def apply(
      Successful: js.UndefOr[SendMessageBatchResultEntryList] = js.undefined,
      Failed: js.UndefOr[BatchResultErrorEntryList] = js.undefined
    ): SendMessageBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Successful" -> Successful.map { x => x: js.Any }),
        ("Failed" -> Failed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageBatchResult]
    }
  }

  /**
   * <p>Encloses a <code>MessageId</code> for a successfully-enqueued message in a <code> <a>SendMessageBatch</a> </code>.</p>
   */
  @js.native
  trait SendMessageBatchResultEntry extends js.Object {
    var Id: String
    var SequenceNumber: String
    var MD5OfMessageAttributes: String
    var MessageId: String
    var MD5OfMessageBody: String
  }

  object SendMessageBatchResultEntry {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      SequenceNumber: js.UndefOr[String] = js.undefined,
      MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
      MessageId: js.UndefOr[String] = js.undefined,
      MD5OfMessageBody: js.UndefOr[String] = js.undefined
    ): SendMessageBatchResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("SequenceNumber" -> SequenceNumber.map { x => x: js.Any }),
        ("MD5OfMessageAttributes" -> MD5OfMessageAttributes.map { x => x: js.Any }),
        ("MessageId" -> MessageId.map { x => x: js.Any }),
        ("MD5OfMessageBody" -> MD5OfMessageBody.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageBatchResultEntry]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait SendMessageRequest extends js.Object {
    var MessageBody: String
    var MessageGroupId: String
    var MessageDeduplicationId: String
    var MessageAttributes: MessageBodyAttributeMap
    var DelaySeconds: Integer
    var QueueUrl: String
  }

  object SendMessageRequest {
    def apply(
      MessageBody: js.UndefOr[String] = js.undefined,
      MessageGroupId: js.UndefOr[String] = js.undefined,
      MessageDeduplicationId: js.UndefOr[String] = js.undefined,
      MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined,
      DelaySeconds: js.UndefOr[Integer] = js.undefined,
      QueueUrl: js.UndefOr[String] = js.undefined
    ): SendMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MessageBody" -> MessageBody.map { x => x: js.Any }),
        ("MessageGroupId" -> MessageGroupId.map { x => x: js.Any }),
        ("MessageDeduplicationId" -> MessageDeduplicationId.map { x => x: js.Any }),
        ("MessageAttributes" -> MessageAttributes.map { x => x: js.Any }),
        ("DelaySeconds" -> DelaySeconds.map { x => x: js.Any }),
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageRequest]
    }
  }

  /**
   * <p>The <code>MD5OfMessageBody</code> and <code>MessageId</code> elements.</p>
   */
  @js.native
  trait SendMessageResult extends js.Object {
    var MD5OfMessageBody: String
    var MD5OfMessageAttributes: String
    var MessageId: String
    var SequenceNumber: String
  }

  object SendMessageResult {
    def apply(
      MD5OfMessageBody: js.UndefOr[String] = js.undefined,
      MD5OfMessageAttributes: js.UndefOr[String] = js.undefined,
      MessageId: js.UndefOr[String] = js.undefined,
      SequenceNumber: js.UndefOr[String] = js.undefined
    ): SendMessageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MD5OfMessageBody" -> MD5OfMessageBody.map { x => x: js.Any }),
        ("MD5OfMessageAttributes" -> MD5OfMessageAttributes.map { x => x: js.Any }),
        ("MessageId" -> MessageId.map { x => x: js.Any }),
        ("SequenceNumber" -> SequenceNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessageResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait SetQueueAttributesRequest extends js.Object {
    var QueueUrl: String
    var Attributes: QueueAttributeMap
  }

  object SetQueueAttributesRequest {
    def apply(
      QueueUrl: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[QueueAttributeMap] = js.undefined
    ): SetQueueAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueueUrl" -> QueueUrl.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetQueueAttributesRequest]
    }
  }

  /**
   * <p>The batch request contains more entries than permissible.</p>
   */
  @js.native
  trait TooManyEntriesInBatchRequestException extends js.Object {

  }

  /**
   * <p>Error code 400. Unsupported operation.</p>
   */
  @js.native
  trait UnsupportedOperationException extends js.Object {

  }
}
