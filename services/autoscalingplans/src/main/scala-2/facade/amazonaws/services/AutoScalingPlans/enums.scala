package facade.amazonaws.services.autoscalingplans

import scalajs.js

@js.native
sealed trait ForecastDataType extends js.Any
object ForecastDataType {
  val CapacityForecast = "CapacityForecast".asInstanceOf[ForecastDataType]
  val LoadForecast = "LoadForecast".asInstanceOf[ForecastDataType]
  val ScheduledActionMinCapacity = "ScheduledActionMinCapacity".asInstanceOf[ForecastDataType]
  val ScheduledActionMaxCapacity = "ScheduledActionMaxCapacity".asInstanceOf[ForecastDataType]

  @inline def values: js.Array[ForecastDataType] = js.Array(CapacityForecast, LoadForecast, ScheduledActionMinCapacity, ScheduledActionMaxCapacity)
}

@js.native
sealed trait LoadMetricType extends js.Any
object LoadMetricType {
  val ASGTotalCPUUtilization = "ASGTotalCPUUtilization".asInstanceOf[LoadMetricType]
  val ASGTotalNetworkIn = "ASGTotalNetworkIn".asInstanceOf[LoadMetricType]
  val ASGTotalNetworkOut = "ASGTotalNetworkOut".asInstanceOf[LoadMetricType]
  val ALBTargetGroupRequestCount = "ALBTargetGroupRequestCount".asInstanceOf[LoadMetricType]

  @inline def values: js.Array[LoadMetricType] = js.Array(ASGTotalCPUUtilization, ASGTotalNetworkIn, ASGTotalNetworkOut, ALBTargetGroupRequestCount)
}

@js.native
sealed trait MetricStatistic extends js.Any
object MetricStatistic {
  val Average = "Average".asInstanceOf[MetricStatistic]
  val Minimum = "Minimum".asInstanceOf[MetricStatistic]
  val Maximum = "Maximum".asInstanceOf[MetricStatistic]
  val SampleCount = "SampleCount".asInstanceOf[MetricStatistic]
  val Sum = "Sum".asInstanceOf[MetricStatistic]

  @inline def values: js.Array[MetricStatistic] = js.Array(Average, Minimum, Maximum, SampleCount, Sum)
}

@js.native
sealed trait PolicyType extends js.Any
object PolicyType {
  val TargetTrackingScaling = "TargetTrackingScaling".asInstanceOf[PolicyType]

  @inline def values: js.Array[PolicyType] = js.Array(TargetTrackingScaling)
}

@js.native
sealed trait PredictiveScalingMaxCapacityBehavior extends js.Any
object PredictiveScalingMaxCapacityBehavior {
  val SetForecastCapacityToMaxCapacity = "SetForecastCapacityToMaxCapacity".asInstanceOf[PredictiveScalingMaxCapacityBehavior]
  val SetMaxCapacityToForecastCapacity = "SetMaxCapacityToForecastCapacity".asInstanceOf[PredictiveScalingMaxCapacityBehavior]
  val SetMaxCapacityAboveForecastCapacity = "SetMaxCapacityAboveForecastCapacity".asInstanceOf[PredictiveScalingMaxCapacityBehavior]

  @inline def values: js.Array[PredictiveScalingMaxCapacityBehavior] = js.Array(SetForecastCapacityToMaxCapacity, SetMaxCapacityToForecastCapacity, SetMaxCapacityAboveForecastCapacity)
}

@js.native
sealed trait PredictiveScalingMode extends js.Any
object PredictiveScalingMode {
  val ForecastAndScale = "ForecastAndScale".asInstanceOf[PredictiveScalingMode]
  val ForecastOnly = "ForecastOnly".asInstanceOf[PredictiveScalingMode]

  @inline def values: js.Array[PredictiveScalingMode] = js.Array(ForecastAndScale, ForecastOnly)
}

@js.native
sealed trait ScalableDimension extends js.Any
object ScalableDimension {
  val `autoscaling:autoScalingGroup:DesiredCapacity` = "autoscaling:autoScalingGroup:DesiredCapacity".asInstanceOf[ScalableDimension]
  val `ecs:service:DesiredCount` = "ecs:service:DesiredCount".asInstanceOf[ScalableDimension]
  val `ec2:spot-fleet-request:TargetCapacity` = "ec2:spot-fleet-request:TargetCapacity".asInstanceOf[ScalableDimension]
  val `rds:cluster:ReadReplicaCount` = "rds:cluster:ReadReplicaCount".asInstanceOf[ScalableDimension]
  val `dynamodb:table:ReadCapacityUnits` = "dynamodb:table:ReadCapacityUnits".asInstanceOf[ScalableDimension]
  val `dynamodb:table:WriteCapacityUnits` = "dynamodb:table:WriteCapacityUnits".asInstanceOf[ScalableDimension]
  val `dynamodb:index:ReadCapacityUnits` = "dynamodb:index:ReadCapacityUnits".asInstanceOf[ScalableDimension]
  val `dynamodb:index:WriteCapacityUnits` = "dynamodb:index:WriteCapacityUnits".asInstanceOf[ScalableDimension]

  @inline def values: js.Array[ScalableDimension] = js.Array(
    `autoscaling:autoScalingGroup:DesiredCapacity`,
    `ecs:service:DesiredCount`,
    `ec2:spot-fleet-request:TargetCapacity`,
    `rds:cluster:ReadReplicaCount`,
    `dynamodb:table:ReadCapacityUnits`,
    `dynamodb:table:WriteCapacityUnits`,
    `dynamodb:index:ReadCapacityUnits`,
    `dynamodb:index:WriteCapacityUnits`
  )
}

@js.native
sealed trait ScalingMetricType extends js.Any
object ScalingMetricType {
  val ASGAverageCPUUtilization = "ASGAverageCPUUtilization".asInstanceOf[ScalingMetricType]
  val ASGAverageNetworkIn = "ASGAverageNetworkIn".asInstanceOf[ScalingMetricType]
  val ASGAverageNetworkOut = "ASGAverageNetworkOut".asInstanceOf[ScalingMetricType]
  val DynamoDBReadCapacityUtilization = "DynamoDBReadCapacityUtilization".asInstanceOf[ScalingMetricType]
  val DynamoDBWriteCapacityUtilization = "DynamoDBWriteCapacityUtilization".asInstanceOf[ScalingMetricType]
  val ECSServiceAverageCPUUtilization = "ECSServiceAverageCPUUtilization".asInstanceOf[ScalingMetricType]
  val ECSServiceAverageMemoryUtilization = "ECSServiceAverageMemoryUtilization".asInstanceOf[ScalingMetricType]
  val ALBRequestCountPerTarget = "ALBRequestCountPerTarget".asInstanceOf[ScalingMetricType]
  val RDSReaderAverageCPUUtilization = "RDSReaderAverageCPUUtilization".asInstanceOf[ScalingMetricType]
  val RDSReaderAverageDatabaseConnections = "RDSReaderAverageDatabaseConnections".asInstanceOf[ScalingMetricType]
  val EC2SpotFleetRequestAverageCPUUtilization = "EC2SpotFleetRequestAverageCPUUtilization".asInstanceOf[ScalingMetricType]
  val EC2SpotFleetRequestAverageNetworkIn = "EC2SpotFleetRequestAverageNetworkIn".asInstanceOf[ScalingMetricType]
  val EC2SpotFleetRequestAverageNetworkOut = "EC2SpotFleetRequestAverageNetworkOut".asInstanceOf[ScalingMetricType]

  @inline def values: js.Array[ScalingMetricType] = js.Array(
    ASGAverageCPUUtilization,
    ASGAverageNetworkIn,
    ASGAverageNetworkOut,
    DynamoDBReadCapacityUtilization,
    DynamoDBWriteCapacityUtilization,
    ECSServiceAverageCPUUtilization,
    ECSServiceAverageMemoryUtilization,
    ALBRequestCountPerTarget,
    RDSReaderAverageCPUUtilization,
    RDSReaderAverageDatabaseConnections,
    EC2SpotFleetRequestAverageCPUUtilization,
    EC2SpotFleetRequestAverageNetworkIn,
    EC2SpotFleetRequestAverageNetworkOut
  )
}

@js.native
sealed trait ScalingPlanStatusCode extends js.Any
object ScalingPlanStatusCode {
  val Active = "Active".asInstanceOf[ScalingPlanStatusCode]
  val ActiveWithProblems = "ActiveWithProblems".asInstanceOf[ScalingPlanStatusCode]
  val CreationInProgress = "CreationInProgress".asInstanceOf[ScalingPlanStatusCode]
  val CreationFailed = "CreationFailed".asInstanceOf[ScalingPlanStatusCode]
  val DeletionInProgress = "DeletionInProgress".asInstanceOf[ScalingPlanStatusCode]
  val DeletionFailed = "DeletionFailed".asInstanceOf[ScalingPlanStatusCode]
  val UpdateInProgress = "UpdateInProgress".asInstanceOf[ScalingPlanStatusCode]
  val UpdateFailed = "UpdateFailed".asInstanceOf[ScalingPlanStatusCode]

  @inline def values: js.Array[ScalingPlanStatusCode] = js.Array(Active, ActiveWithProblems, CreationInProgress, CreationFailed, DeletionInProgress, DeletionFailed, UpdateInProgress, UpdateFailed)
}

@js.native
sealed trait ScalingPolicyUpdateBehavior extends js.Any
object ScalingPolicyUpdateBehavior {
  val KeepExternalPolicies = "KeepExternalPolicies".asInstanceOf[ScalingPolicyUpdateBehavior]
  val ReplaceExternalPolicies = "ReplaceExternalPolicies".asInstanceOf[ScalingPolicyUpdateBehavior]

  @inline def values: js.Array[ScalingPolicyUpdateBehavior] = js.Array(KeepExternalPolicies, ReplaceExternalPolicies)
}

@js.native
sealed trait ScalingStatusCode extends js.Any
object ScalingStatusCode {
  val Inactive = "Inactive".asInstanceOf[ScalingStatusCode]
  val PartiallyActive = "PartiallyActive".asInstanceOf[ScalingStatusCode]
  val Active = "Active".asInstanceOf[ScalingStatusCode]

  @inline def values: js.Array[ScalingStatusCode] = js.Array(Inactive, PartiallyActive, Active)
}

@js.native
sealed trait ServiceNamespace extends js.Any
object ServiceNamespace {
  val autoscaling = "autoscaling".asInstanceOf[ServiceNamespace]
  val ecs = "ecs".asInstanceOf[ServiceNamespace]
  val ec2 = "ec2".asInstanceOf[ServiceNamespace]
  val rds = "rds".asInstanceOf[ServiceNamespace]
  val dynamodb = "dynamodb".asInstanceOf[ServiceNamespace]

  @inline def values: js.Array[ServiceNamespace] = js.Array(autoscaling, ecs, ec2, rds, dynamodb)
}
