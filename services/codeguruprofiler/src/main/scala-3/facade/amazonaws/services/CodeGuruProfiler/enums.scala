package facade.amazonaws.services.codeguruprofiler

import scalajs._

type ActionGroup = "agentPermissions"
object ActionGroup {
  inline val agentPermissions: "agentPermissions" = "agentPermissions"

  inline def values: js.Array[ActionGroup] = js.Array(agentPermissions)
}

type AgentParameterField = "SamplingIntervalInMilliseconds" | "ReportingIntervalInMilliseconds" | "MinimumTimeForReportingInMilliseconds" | "MemoryUsageLimitPercent" | "MaxStackDepth"
object AgentParameterField {
  inline val SamplingIntervalInMilliseconds: "SamplingIntervalInMilliseconds" = "SamplingIntervalInMilliseconds"
  inline val ReportingIntervalInMilliseconds: "ReportingIntervalInMilliseconds" = "ReportingIntervalInMilliseconds"
  inline val MinimumTimeForReportingInMilliseconds: "MinimumTimeForReportingInMilliseconds" = "MinimumTimeForReportingInMilliseconds"
  inline val MemoryUsageLimitPercent: "MemoryUsageLimitPercent" = "MemoryUsageLimitPercent"
  inline val MaxStackDepth: "MaxStackDepth" = "MaxStackDepth"

  inline def values: js.Array[AgentParameterField] = js.Array(SamplingIntervalInMilliseconds, ReportingIntervalInMilliseconds, MinimumTimeForReportingInMilliseconds, MemoryUsageLimitPercent, MaxStackDepth)
}

type AggregationPeriod = "PT5M" | "PT1H" | "P1D"
object AggregationPeriod {
  inline val PT5M: "PT5M" = "PT5M"
  inline val PT1H: "PT1H" = "PT1H"
  inline val P1D: "P1D" = "P1D"

  inline def values: js.Array[AggregationPeriod] = js.Array(PT5M, PT1H, P1D)
}

type ComputePlatform = "Default" | "AWSLambda"
object ComputePlatform {
  inline val Default: "Default" = "Default"
  inline val AWSLambda: "AWSLambda" = "AWSLambda"

  inline def values: js.Array[ComputePlatform] = js.Array(Default, AWSLambda)
}

type EventPublisher = "AnomalyDetection"
object EventPublisher {
  inline val AnomalyDetection: "AnomalyDetection" = "AnomalyDetection"

  inline def values: js.Array[EventPublisher] = js.Array(AnomalyDetection)
}

type FeedbackType = "Positive" | "Negative"
object FeedbackType {
  inline val Positive: "Positive" = "Positive"
  inline val Negative: "Negative" = "Negative"

  inline def values: js.Array[FeedbackType] = js.Array(Positive, Negative)
}

type MetadataField = "ComputePlatform" | "AgentId" | "AwsRequestId" | "ExecutionEnvironment" | "LambdaFunctionArn" | "LambdaMemoryLimitInMB" | "LambdaRemainingTimeInMilliseconds" | "LambdaTimeGapBetweenInvokesInMilliseconds" | "LambdaPreviousExecutionTimeInMilliseconds"
object MetadataField {
  inline val ComputePlatform: "ComputePlatform" = "ComputePlatform"
  inline val AgentId: "AgentId" = "AgentId"
  inline val AwsRequestId: "AwsRequestId" = "AwsRequestId"
  inline val ExecutionEnvironment: "ExecutionEnvironment" = "ExecutionEnvironment"
  inline val LambdaFunctionArn: "LambdaFunctionArn" = "LambdaFunctionArn"
  inline val LambdaMemoryLimitInMB: "LambdaMemoryLimitInMB" = "LambdaMemoryLimitInMB"
  inline val LambdaRemainingTimeInMilliseconds: "LambdaRemainingTimeInMilliseconds" = "LambdaRemainingTimeInMilliseconds"
  inline val LambdaTimeGapBetweenInvokesInMilliseconds: "LambdaTimeGapBetweenInvokesInMilliseconds" = "LambdaTimeGapBetweenInvokesInMilliseconds"
  inline val LambdaPreviousExecutionTimeInMilliseconds: "LambdaPreviousExecutionTimeInMilliseconds" = "LambdaPreviousExecutionTimeInMilliseconds"

  inline def values: js.Array[MetadataField] = js.Array(
    ComputePlatform,
    AgentId,
    AwsRequestId,
    ExecutionEnvironment,
    LambdaFunctionArn,
    LambdaMemoryLimitInMB,
    LambdaRemainingTimeInMilliseconds,
    LambdaTimeGapBetweenInvokesInMilliseconds,
    LambdaPreviousExecutionTimeInMilliseconds
  )
}

type MetricType = "AggregatedRelativeTotalTime"
object MetricType {
  inline val AggregatedRelativeTotalTime: "AggregatedRelativeTotalTime" = "AggregatedRelativeTotalTime"

  inline def values: js.Array[MetricType] = js.Array(AggregatedRelativeTotalTime)
}

type OrderBy = "TimestampDescending" | "TimestampAscending"
object OrderBy {
  inline val TimestampDescending: "TimestampDescending" = "TimestampDescending"
  inline val TimestampAscending: "TimestampAscending" = "TimestampAscending"

  inline def values: js.Array[OrderBy] = js.Array(TimestampDescending, TimestampAscending)
}
