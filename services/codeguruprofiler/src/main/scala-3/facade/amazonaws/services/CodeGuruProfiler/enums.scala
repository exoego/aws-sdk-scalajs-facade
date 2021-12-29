package facade.amazonaws.services.codeguruprofiler

import scalajs._

type ActionGroup = "agentPermissions"
object ActionGroup {
  val agentPermissions: "agentPermissions" = "agentPermissions"

  @inline def values = js.Array[ActionGroup](agentPermissions)
}

type AgentParameterField = "SamplingIntervalInMilliseconds" | "ReportingIntervalInMilliseconds" | "MinimumTimeForReportingInMilliseconds" | "MemoryUsageLimitPercent" | "MaxStackDepth"
object AgentParameterField {
  val SamplingIntervalInMilliseconds: "SamplingIntervalInMilliseconds" = "SamplingIntervalInMilliseconds"
  val ReportingIntervalInMilliseconds: "ReportingIntervalInMilliseconds" = "ReportingIntervalInMilliseconds"
  val MinimumTimeForReportingInMilliseconds: "MinimumTimeForReportingInMilliseconds" = "MinimumTimeForReportingInMilliseconds"
  val MemoryUsageLimitPercent: "MemoryUsageLimitPercent" = "MemoryUsageLimitPercent"
  val MaxStackDepth: "MaxStackDepth" = "MaxStackDepth"

  @inline def values = js.Array[AgentParameterField](SamplingIntervalInMilliseconds, ReportingIntervalInMilliseconds, MinimumTimeForReportingInMilliseconds, MemoryUsageLimitPercent, MaxStackDepth)
}

type AggregationPeriod = "PT5M" | "PT1H" | "P1D"
object AggregationPeriod {
  val PT5M: "PT5M" = "PT5M"
  val PT1H: "PT1H" = "PT1H"
  val P1D: "P1D" = "P1D"

  @inline def values = js.Array[AggregationPeriod](PT5M, PT1H, P1D)
}

type ComputePlatform = "Default" | "AWSLambda"
object ComputePlatform {
  val Default: "Default" = "Default"
  val AWSLambda: "AWSLambda" = "AWSLambda"

  @inline def values = js.Array[ComputePlatform](Default, AWSLambda)
}

type EventPublisher = "AnomalyDetection"
object EventPublisher {
  val AnomalyDetection: "AnomalyDetection" = "AnomalyDetection"

  @inline def values = js.Array[EventPublisher](AnomalyDetection)
}

type FeedbackType = "Positive" | "Negative"
object FeedbackType {
  val Positive: "Positive" = "Positive"
  val Negative: "Negative" = "Negative"

  @inline def values = js.Array[FeedbackType](Positive, Negative)
}

type MetadataField = "ComputePlatform" | "AgentId" | "AwsRequestId" | "ExecutionEnvironment" | "LambdaFunctionArn" | "LambdaMemoryLimitInMB" | "LambdaRemainingTimeInMilliseconds" | "LambdaTimeGapBetweenInvokesInMilliseconds" | "LambdaPreviousExecutionTimeInMilliseconds"
object MetadataField {
  val ComputePlatform: "ComputePlatform" = "ComputePlatform"
  val AgentId: "AgentId" = "AgentId"
  val AwsRequestId: "AwsRequestId" = "AwsRequestId"
  val ExecutionEnvironment: "ExecutionEnvironment" = "ExecutionEnvironment"
  val LambdaFunctionArn: "LambdaFunctionArn" = "LambdaFunctionArn"
  val LambdaMemoryLimitInMB: "LambdaMemoryLimitInMB" = "LambdaMemoryLimitInMB"
  val LambdaRemainingTimeInMilliseconds: "LambdaRemainingTimeInMilliseconds" = "LambdaRemainingTimeInMilliseconds"
  val LambdaTimeGapBetweenInvokesInMilliseconds: "LambdaTimeGapBetweenInvokesInMilliseconds" = "LambdaTimeGapBetweenInvokesInMilliseconds"
  val LambdaPreviousExecutionTimeInMilliseconds: "LambdaPreviousExecutionTimeInMilliseconds" = "LambdaPreviousExecutionTimeInMilliseconds"

  @inline def values = js.Array[MetadataField](
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
  val AggregatedRelativeTotalTime: "AggregatedRelativeTotalTime" = "AggregatedRelativeTotalTime"

  @inline def values = js.Array[MetricType](AggregatedRelativeTotalTime)
}

type OrderBy = "TimestampDescending" | "TimestampAscending"
object OrderBy {
  val TimestampDescending: "TimestampDescending" = "TimestampDescending"
  val TimestampAscending: "TimestampAscending" = "TimestampAscending"

  @inline def values = js.Array[OrderBy](TimestampDescending, TimestampAscending)
}
