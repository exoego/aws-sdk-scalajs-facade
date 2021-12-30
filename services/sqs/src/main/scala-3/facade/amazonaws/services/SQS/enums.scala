package facade.amazonaws.services.sqs

import scalajs.js

type MessageSystemAttributeName = "SenderId" | "SentTimestamp" | "ApproximateReceiveCount" | "ApproximateFirstReceiveTimestamp" | "SequenceNumber" | "MessageDeduplicationId" | "MessageGroupId" | "AWSTraceHeader"
object MessageSystemAttributeName {
  inline val SenderId: "SenderId" = "SenderId"
  inline val SentTimestamp: "SentTimestamp" = "SentTimestamp"
  inline val ApproximateReceiveCount: "ApproximateReceiveCount" = "ApproximateReceiveCount"
  inline val ApproximateFirstReceiveTimestamp: "ApproximateFirstReceiveTimestamp" = "ApproximateFirstReceiveTimestamp"
  inline val SequenceNumber: "SequenceNumber" = "SequenceNumber"
  inline val MessageDeduplicationId: "MessageDeduplicationId" = "MessageDeduplicationId"
  inline val MessageGroupId: "MessageGroupId" = "MessageGroupId"
  inline val AWSTraceHeader: "AWSTraceHeader" = "AWSTraceHeader"

  inline def values: js.Array[MessageSystemAttributeName] = js.Array(SenderId, SentTimestamp, ApproximateReceiveCount, ApproximateFirstReceiveTimestamp, SequenceNumber, MessageDeduplicationId, MessageGroupId, AWSTraceHeader)
}

type MessageSystemAttributeNameForSends = "AWSTraceHeader"
object MessageSystemAttributeNameForSends {
  inline val AWSTraceHeader: "AWSTraceHeader" = "AWSTraceHeader"

  inline def values: js.Array[MessageSystemAttributeNameForSends] = js.Array(AWSTraceHeader)
}

type QueueAttributeName = "All" | "Policy" | "VisibilityTimeout" | "MaximumMessageSize" | "MessageRetentionPeriod" | "ApproximateNumberOfMessages" | "ApproximateNumberOfMessagesNotVisible" | "CreatedTimestamp" | "LastModifiedTimestamp" | "QueueArn" | "ApproximateNumberOfMessagesDelayed" | "DelaySeconds" | "ReceiveMessageWaitTimeSeconds" | "RedrivePolicy" | "FifoQueue" | "ContentBasedDeduplication" | "KmsMasterKeyId" | "KmsDataKeyReusePeriodSeconds" | "DeduplicationScope" | "FifoThroughputLimit"
object QueueAttributeName {
  inline val All: "All" = "All"
  inline val Policy: "Policy" = "Policy"
  inline val VisibilityTimeout: "VisibilityTimeout" = "VisibilityTimeout"
  inline val MaximumMessageSize: "MaximumMessageSize" = "MaximumMessageSize"
  inline val MessageRetentionPeriod: "MessageRetentionPeriod" = "MessageRetentionPeriod"
  inline val ApproximateNumberOfMessages: "ApproximateNumberOfMessages" = "ApproximateNumberOfMessages"
  inline val ApproximateNumberOfMessagesNotVisible: "ApproximateNumberOfMessagesNotVisible" = "ApproximateNumberOfMessagesNotVisible"
  inline val CreatedTimestamp: "CreatedTimestamp" = "CreatedTimestamp"
  inline val LastModifiedTimestamp: "LastModifiedTimestamp" = "LastModifiedTimestamp"
  inline val QueueArn: "QueueArn" = "QueueArn"
  inline val ApproximateNumberOfMessagesDelayed: "ApproximateNumberOfMessagesDelayed" = "ApproximateNumberOfMessagesDelayed"
  inline val DelaySeconds: "DelaySeconds" = "DelaySeconds"
  inline val ReceiveMessageWaitTimeSeconds: "ReceiveMessageWaitTimeSeconds" = "ReceiveMessageWaitTimeSeconds"
  inline val RedrivePolicy: "RedrivePolicy" = "RedrivePolicy"
  inline val FifoQueue: "FifoQueue" = "FifoQueue"
  inline val ContentBasedDeduplication: "ContentBasedDeduplication" = "ContentBasedDeduplication"
  inline val KmsMasterKeyId: "KmsMasterKeyId" = "KmsMasterKeyId"
  inline val KmsDataKeyReusePeriodSeconds: "KmsDataKeyReusePeriodSeconds" = "KmsDataKeyReusePeriodSeconds"
  inline val DeduplicationScope: "DeduplicationScope" = "DeduplicationScope"
  inline val FifoThroughputLimit: "FifoThroughputLimit" = "FifoThroughputLimit"

  inline def values: js.Array[QueueAttributeName] = js.Array(
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
