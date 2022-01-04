package facade.amazonaws.services.sqs

import scalajs.js

@js.native
sealed trait MessageSystemAttributeName extends js.Any
object MessageSystemAttributeName {
  val SenderId = "SenderId".asInstanceOf[MessageSystemAttributeName]
  val SentTimestamp = "SentTimestamp".asInstanceOf[MessageSystemAttributeName]
  val ApproximateReceiveCount = "ApproximateReceiveCount".asInstanceOf[MessageSystemAttributeName]
  val ApproximateFirstReceiveTimestamp = "ApproximateFirstReceiveTimestamp".asInstanceOf[MessageSystemAttributeName]
  val SequenceNumber = "SequenceNumber".asInstanceOf[MessageSystemAttributeName]
  val MessageDeduplicationId = "MessageDeduplicationId".asInstanceOf[MessageSystemAttributeName]
  val MessageGroupId = "MessageGroupId".asInstanceOf[MessageSystemAttributeName]
  val AWSTraceHeader = "AWSTraceHeader".asInstanceOf[MessageSystemAttributeName]

  @inline def values: js.Array[MessageSystemAttributeName] = js.Array(SenderId, SentTimestamp, ApproximateReceiveCount, ApproximateFirstReceiveTimestamp, SequenceNumber, MessageDeduplicationId, MessageGroupId, AWSTraceHeader)
}

@js.native
sealed trait MessageSystemAttributeNameForSends extends js.Any
object MessageSystemAttributeNameForSends {
  val AWSTraceHeader = "AWSTraceHeader".asInstanceOf[MessageSystemAttributeNameForSends]

  @inline def values: js.Array[MessageSystemAttributeNameForSends] = js.Array(AWSTraceHeader)
}

@js.native
sealed trait QueueAttributeName extends js.Any
object QueueAttributeName {
  val All = "All".asInstanceOf[QueueAttributeName]
  val Policy = "Policy".asInstanceOf[QueueAttributeName]
  val VisibilityTimeout = "VisibilityTimeout".asInstanceOf[QueueAttributeName]
  val MaximumMessageSize = "MaximumMessageSize".asInstanceOf[QueueAttributeName]
  val MessageRetentionPeriod = "MessageRetentionPeriod".asInstanceOf[QueueAttributeName]
  val ApproximateNumberOfMessages = "ApproximateNumberOfMessages".asInstanceOf[QueueAttributeName]
  val ApproximateNumberOfMessagesNotVisible = "ApproximateNumberOfMessagesNotVisible".asInstanceOf[QueueAttributeName]
  val CreatedTimestamp = "CreatedTimestamp".asInstanceOf[QueueAttributeName]
  val LastModifiedTimestamp = "LastModifiedTimestamp".asInstanceOf[QueueAttributeName]
  val QueueArn = "QueueArn".asInstanceOf[QueueAttributeName]
  val ApproximateNumberOfMessagesDelayed = "ApproximateNumberOfMessagesDelayed".asInstanceOf[QueueAttributeName]
  val DelaySeconds = "DelaySeconds".asInstanceOf[QueueAttributeName]
  val ReceiveMessageWaitTimeSeconds = "ReceiveMessageWaitTimeSeconds".asInstanceOf[QueueAttributeName]
  val RedrivePolicy = "RedrivePolicy".asInstanceOf[QueueAttributeName]
  val FifoQueue = "FifoQueue".asInstanceOf[QueueAttributeName]
  val ContentBasedDeduplication = "ContentBasedDeduplication".asInstanceOf[QueueAttributeName]
  val KmsMasterKeyId = "KmsMasterKeyId".asInstanceOf[QueueAttributeName]
  val KmsDataKeyReusePeriodSeconds = "KmsDataKeyReusePeriodSeconds".asInstanceOf[QueueAttributeName]
  val DeduplicationScope = "DeduplicationScope".asInstanceOf[QueueAttributeName]
  val FifoThroughputLimit = "FifoThroughputLimit".asInstanceOf[QueueAttributeName]
  val RedriveAllowPolicy = "RedriveAllowPolicy".asInstanceOf[QueueAttributeName]
  val SqsManagedSseEnabled = "SqsManagedSseEnabled".asInstanceOf[QueueAttributeName]

  @inline def values: js.Array[QueueAttributeName] = js.Array(
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
    KmsDataKeyReusePeriodSeconds,
    DeduplicationScope,
    FifoThroughputLimit,
    RedriveAllowPolicy,
    SqsManagedSseEnabled
  )
}
