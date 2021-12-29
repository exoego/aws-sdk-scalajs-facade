package facade.amazonaws.services.sqs

import scalajs._

type MessageSystemAttributeName = "SenderId" | "SentTimestamp" | "ApproximateReceiveCount" | "ApproximateFirstReceiveTimestamp" | "SequenceNumber" | "MessageDeduplicationId" | "MessageGroupId" | "AWSTraceHeader"
object MessageSystemAttributeName {
  val SenderId: "SenderId" = "SenderId"
  val SentTimestamp: "SentTimestamp" = "SentTimestamp"
  val ApproximateReceiveCount: "ApproximateReceiveCount" = "ApproximateReceiveCount"
  val ApproximateFirstReceiveTimestamp: "ApproximateFirstReceiveTimestamp" = "ApproximateFirstReceiveTimestamp"
  val SequenceNumber: "SequenceNumber" = "SequenceNumber"
  val MessageDeduplicationId: "MessageDeduplicationId" = "MessageDeduplicationId"
  val MessageGroupId: "MessageGroupId" = "MessageGroupId"
  val AWSTraceHeader: "AWSTraceHeader" = "AWSTraceHeader"

  @inline def values = js.Array[MessageSystemAttributeName](SenderId, SentTimestamp, ApproximateReceiveCount, ApproximateFirstReceiveTimestamp, SequenceNumber, MessageDeduplicationId, MessageGroupId, AWSTraceHeader)
}

type MessageSystemAttributeNameForSends = "AWSTraceHeader"
object MessageSystemAttributeNameForSends {
  val AWSTraceHeader: "AWSTraceHeader" = "AWSTraceHeader"

  @inline def values = js.Array[MessageSystemAttributeNameForSends](AWSTraceHeader)
}

type QueueAttributeName = "All" | "Policy" | "VisibilityTimeout" | "MaximumMessageSize" | "MessageRetentionPeriod" | "ApproximateNumberOfMessages" | "ApproximateNumberOfMessagesNotVisible" | "CreatedTimestamp" | "LastModifiedTimestamp" | "QueueArn" | "ApproximateNumberOfMessagesDelayed" | "DelaySeconds" | "ReceiveMessageWaitTimeSeconds" | "RedrivePolicy" | "FifoQueue" | "ContentBasedDeduplication" | "KmsMasterKeyId" | "KmsDataKeyReusePeriodSeconds" | "DeduplicationScope" | "FifoThroughputLimit"
object QueueAttributeName {
  val All: "All" = "All"
  val Policy: "Policy" = "Policy"
  val VisibilityTimeout: "VisibilityTimeout" = "VisibilityTimeout"
  val MaximumMessageSize: "MaximumMessageSize" = "MaximumMessageSize"
  val MessageRetentionPeriod: "MessageRetentionPeriod" = "MessageRetentionPeriod"
  val ApproximateNumberOfMessages: "ApproximateNumberOfMessages" = "ApproximateNumberOfMessages"
  val ApproximateNumberOfMessagesNotVisible: "ApproximateNumberOfMessagesNotVisible" = "ApproximateNumberOfMessagesNotVisible"
  val CreatedTimestamp: "CreatedTimestamp" = "CreatedTimestamp"
  val LastModifiedTimestamp: "LastModifiedTimestamp" = "LastModifiedTimestamp"
  val QueueArn: "QueueArn" = "QueueArn"
  val ApproximateNumberOfMessagesDelayed: "ApproximateNumberOfMessagesDelayed" = "ApproximateNumberOfMessagesDelayed"
  val DelaySeconds: "DelaySeconds" = "DelaySeconds"
  val ReceiveMessageWaitTimeSeconds: "ReceiveMessageWaitTimeSeconds" = "ReceiveMessageWaitTimeSeconds"
  val RedrivePolicy: "RedrivePolicy" = "RedrivePolicy"
  val FifoQueue: "FifoQueue" = "FifoQueue"
  val ContentBasedDeduplication: "ContentBasedDeduplication" = "ContentBasedDeduplication"
  val KmsMasterKeyId: "KmsMasterKeyId" = "KmsMasterKeyId"
  val KmsDataKeyReusePeriodSeconds: "KmsDataKeyReusePeriodSeconds" = "KmsDataKeyReusePeriodSeconds"
  val DeduplicationScope: "DeduplicationScope" = "DeduplicationScope"
  val FifoThroughputLimit: "FifoThroughputLimit" = "FifoThroughputLimit"

  @inline def values = js.Array[QueueAttributeName](
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
    FifoThroughputLimit
  )
}
