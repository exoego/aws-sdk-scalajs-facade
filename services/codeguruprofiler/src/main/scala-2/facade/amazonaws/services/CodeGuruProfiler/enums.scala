package facade.amazonaws.services.codeguruprofiler

import scalajs.js

@js.native
sealed trait ActionGroup extends js.Any
object ActionGroup {
  val agentPermissions = "agentPermissions".asInstanceOf[ActionGroup]

  @inline def values: js.Array[ActionGroup] = js.Array(agentPermissions)
}

@js.native
sealed trait AgentParameterField extends js.Any
object AgentParameterField {
  val SamplingIntervalInMilliseconds = "SamplingIntervalInMilliseconds".asInstanceOf[AgentParameterField]
  val ReportingIntervalInMilliseconds = "ReportingIntervalInMilliseconds".asInstanceOf[AgentParameterField]
  val MinimumTimeForReportingInMilliseconds = "MinimumTimeForReportingInMilliseconds".asInstanceOf[AgentParameterField]
  val MemoryUsageLimitPercent = "MemoryUsageLimitPercent".asInstanceOf[AgentParameterField]
  val MaxStackDepth = "MaxStackDepth".asInstanceOf[AgentParameterField]

  @inline def values: js.Array[AgentParameterField] = js.Array(SamplingIntervalInMilliseconds, ReportingIntervalInMilliseconds, MinimumTimeForReportingInMilliseconds, MemoryUsageLimitPercent, MaxStackDepth)
}

@js.native
sealed trait AggregationPeriod extends js.Any
object AggregationPeriod {
  val PT5M = "PT5M".asInstanceOf[AggregationPeriod]
  val PT1H = "PT1H".asInstanceOf[AggregationPeriod]
  val P1D = "P1D".asInstanceOf[AggregationPeriod]

  @inline def values: js.Array[AggregationPeriod] = js.Array(PT5M, PT1H, P1D)
}

@js.native
sealed trait ComputePlatform extends js.Any
object ComputePlatform {
  val Default = "Default".asInstanceOf[ComputePlatform]
  val AWSLambda = "AWSLambda".asInstanceOf[ComputePlatform]

  @inline def values: js.Array[ComputePlatform] = js.Array(Default, AWSLambda)
}

@js.native
sealed trait EventPublisher extends js.Any
object EventPublisher {
  val AnomalyDetection = "AnomalyDetection".asInstanceOf[EventPublisher]

  @inline def values: js.Array[EventPublisher] = js.Array(AnomalyDetection)
}

@js.native
sealed trait FeedbackType extends js.Any
object FeedbackType {
  val Positive = "Positive".asInstanceOf[FeedbackType]
  val Negative = "Negative".asInstanceOf[FeedbackType]

  @inline def values: js.Array[FeedbackType] = js.Array(Positive, Negative)
}

@js.native
sealed trait MetadataField extends js.Any
object MetadataField {
  val ComputePlatform = "ComputePlatform".asInstanceOf[MetadataField]
  val AgentId = "AgentId".asInstanceOf[MetadataField]
  val AwsRequestId = "AwsRequestId".asInstanceOf[MetadataField]
  val ExecutionEnvironment = "ExecutionEnvironment".asInstanceOf[MetadataField]
  val LambdaFunctionArn = "LambdaFunctionArn".asInstanceOf[MetadataField]
  val LambdaMemoryLimitInMB = "LambdaMemoryLimitInMB".asInstanceOf[MetadataField]
  val LambdaRemainingTimeInMilliseconds = "LambdaRemainingTimeInMilliseconds".asInstanceOf[MetadataField]
  val LambdaTimeGapBetweenInvokesInMilliseconds = "LambdaTimeGapBetweenInvokesInMilliseconds".asInstanceOf[MetadataField]
  val LambdaPreviousExecutionTimeInMilliseconds = "LambdaPreviousExecutionTimeInMilliseconds".asInstanceOf[MetadataField]

  @inline def values: js.Array[MetadataField] = js.Array(
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

@js.native
sealed trait MetricType extends js.Any
object MetricType {
  val AggregatedRelativeTotalTime = "AggregatedRelativeTotalTime".asInstanceOf[MetricType]

  @inline def values: js.Array[MetricType] = js.Array(AggregatedRelativeTotalTime)
}

@js.native
sealed trait OrderBy extends js.Any
object OrderBy {
  val TimestampDescending = "TimestampDescending".asInstanceOf[OrderBy]
  val TimestampAscending = "TimestampAscending".asInstanceOf[OrderBy]

  @inline def values: js.Array[OrderBy] = js.Array(TimestampDescending, TimestampAscending)
}
