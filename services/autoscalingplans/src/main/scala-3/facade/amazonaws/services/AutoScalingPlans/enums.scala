package facade.amazonaws.services.autoscalingplans

import scalajs._

type ForecastDataType = "CapacityForecast" | "LoadForecast" | "ScheduledActionMinCapacity" | "ScheduledActionMaxCapacity"
object ForecastDataType {
  val CapacityForecast: "CapacityForecast" = "CapacityForecast"
  val LoadForecast: "LoadForecast" = "LoadForecast"
  val ScheduledActionMinCapacity: "ScheduledActionMinCapacity" = "ScheduledActionMinCapacity"
  val ScheduledActionMaxCapacity: "ScheduledActionMaxCapacity" = "ScheduledActionMaxCapacity"

  @inline def values = js.Array[ForecastDataType](CapacityForecast, LoadForecast, ScheduledActionMinCapacity, ScheduledActionMaxCapacity)
}

type LoadMetricType = "ASGTotalCPUUtilization" | "ASGTotalNetworkIn" | "ASGTotalNetworkOut" | "ALBTargetGroupRequestCount"
object LoadMetricType {
  val ASGTotalCPUUtilization: "ASGTotalCPUUtilization" = "ASGTotalCPUUtilization"
  val ASGTotalNetworkIn: "ASGTotalNetworkIn" = "ASGTotalNetworkIn"
  val ASGTotalNetworkOut: "ASGTotalNetworkOut" = "ASGTotalNetworkOut"
  val ALBTargetGroupRequestCount: "ALBTargetGroupRequestCount" = "ALBTargetGroupRequestCount"

  @inline def values = js.Array[LoadMetricType](ASGTotalCPUUtilization, ASGTotalNetworkIn, ASGTotalNetworkOut, ALBTargetGroupRequestCount)
}

type MetricStatistic = "Average" | "Minimum" | "Maximum" | "SampleCount" | "Sum"
object MetricStatistic {
  val Average: "Average" = "Average"
  val Minimum: "Minimum" = "Minimum"
  val Maximum: "Maximum" = "Maximum"
  val SampleCount: "SampleCount" = "SampleCount"
  val Sum: "Sum" = "Sum"

  @inline def values = js.Array[MetricStatistic](Average, Minimum, Maximum, SampleCount, Sum)
}

type PolicyType = "TargetTrackingScaling"
object PolicyType {
  val TargetTrackingScaling: "TargetTrackingScaling" = "TargetTrackingScaling"

  @inline def values = js.Array[PolicyType](TargetTrackingScaling)
}

type PredictiveScalingMaxCapacityBehavior = "SetForecastCapacityToMaxCapacity" | "SetMaxCapacityToForecastCapacity" | "SetMaxCapacityAboveForecastCapacity"
object PredictiveScalingMaxCapacityBehavior {
  val SetForecastCapacityToMaxCapacity: "SetForecastCapacityToMaxCapacity" = "SetForecastCapacityToMaxCapacity"
  val SetMaxCapacityToForecastCapacity: "SetMaxCapacityToForecastCapacity" = "SetMaxCapacityToForecastCapacity"
  val SetMaxCapacityAboveForecastCapacity: "SetMaxCapacityAboveForecastCapacity" = "SetMaxCapacityAboveForecastCapacity"

  @inline def values = js.Array[PredictiveScalingMaxCapacityBehavior](SetForecastCapacityToMaxCapacity, SetMaxCapacityToForecastCapacity, SetMaxCapacityAboveForecastCapacity)
}

type PredictiveScalingMode = "ForecastAndScale" | "ForecastOnly"
object PredictiveScalingMode {
  val ForecastAndScale: "ForecastAndScale" = "ForecastAndScale"
  val ForecastOnly: "ForecastOnly" = "ForecastOnly"

  @inline def values = js.Array[PredictiveScalingMode](ForecastAndScale, ForecastOnly)
}

type ScalableDimension = "autoscaling:autoScalingGroup:DesiredCapacity" | "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "rds:cluster:ReadReplicaCount" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits"
object ScalableDimension {
  val `autoscaling:autoScalingGroup:DesiredCapacity`: "autoscaling:autoScalingGroup:DesiredCapacity" = "autoscaling:autoScalingGroup:DesiredCapacity"
  val `ecs:service:DesiredCount`: "ecs:service:DesiredCount" = "ecs:service:DesiredCount"
  val `ec2:spot-fleet-request:TargetCapacity`: "ec2:spot-fleet-request:TargetCapacity" = "ec2:spot-fleet-request:TargetCapacity"
  val `rds:cluster:ReadReplicaCount`: "rds:cluster:ReadReplicaCount" = "rds:cluster:ReadReplicaCount"
  val `dynamodb:table:ReadCapacityUnits`: "dynamodb:table:ReadCapacityUnits" = "dynamodb:table:ReadCapacityUnits"
  val `dynamodb:table:WriteCapacityUnits`: "dynamodb:table:WriteCapacityUnits" = "dynamodb:table:WriteCapacityUnits"
  val `dynamodb:index:ReadCapacityUnits`: "dynamodb:index:ReadCapacityUnits" = "dynamodb:index:ReadCapacityUnits"
  val `dynamodb:index:WriteCapacityUnits`: "dynamodb:index:WriteCapacityUnits" = "dynamodb:index:WriteCapacityUnits"

  @inline def values = js.Array[ScalableDimension](
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

type ScalingMetricType = "ASGAverageCPUUtilization" | "ASGAverageNetworkIn" | "ASGAverageNetworkOut" | "DynamoDBReadCapacityUtilization" | "DynamoDBWriteCapacityUtilization" | "ECSServiceAverageCPUUtilization" | "ECSServiceAverageMemoryUtilization" | "ALBRequestCountPerTarget" | "RDSReaderAverageCPUUtilization" | "RDSReaderAverageDatabaseConnections" | "EC2SpotFleetRequestAverageCPUUtilization" | "EC2SpotFleetRequestAverageNetworkIn" | "EC2SpotFleetRequestAverageNetworkOut"
object ScalingMetricType {
  val ASGAverageCPUUtilization: "ASGAverageCPUUtilization" = "ASGAverageCPUUtilization"
  val ASGAverageNetworkIn: "ASGAverageNetworkIn" = "ASGAverageNetworkIn"
  val ASGAverageNetworkOut: "ASGAverageNetworkOut" = "ASGAverageNetworkOut"
  val DynamoDBReadCapacityUtilization: "DynamoDBReadCapacityUtilization" = "DynamoDBReadCapacityUtilization"
  val DynamoDBWriteCapacityUtilization: "DynamoDBWriteCapacityUtilization" = "DynamoDBWriteCapacityUtilization"
  val ECSServiceAverageCPUUtilization: "ECSServiceAverageCPUUtilization" = "ECSServiceAverageCPUUtilization"
  val ECSServiceAverageMemoryUtilization: "ECSServiceAverageMemoryUtilization" = "ECSServiceAverageMemoryUtilization"
  val ALBRequestCountPerTarget: "ALBRequestCountPerTarget" = "ALBRequestCountPerTarget"
  val RDSReaderAverageCPUUtilization: "RDSReaderAverageCPUUtilization" = "RDSReaderAverageCPUUtilization"
  val RDSReaderAverageDatabaseConnections: "RDSReaderAverageDatabaseConnections" = "RDSReaderAverageDatabaseConnections"
  val EC2SpotFleetRequestAverageCPUUtilization: "EC2SpotFleetRequestAverageCPUUtilization" = "EC2SpotFleetRequestAverageCPUUtilization"
  val EC2SpotFleetRequestAverageNetworkIn: "EC2SpotFleetRequestAverageNetworkIn" = "EC2SpotFleetRequestAverageNetworkIn"
  val EC2SpotFleetRequestAverageNetworkOut: "EC2SpotFleetRequestAverageNetworkOut" = "EC2SpotFleetRequestAverageNetworkOut"

  @inline def values = js.Array[ScalingMetricType](
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

type ScalingPlanStatusCode = "Active" | "ActiveWithProblems" | "CreationInProgress" | "CreationFailed" | "DeletionInProgress" | "DeletionFailed" | "UpdateInProgress" | "UpdateFailed"
object ScalingPlanStatusCode {
  val Active: "Active" = "Active"
  val ActiveWithProblems: "ActiveWithProblems" = "ActiveWithProblems"
  val CreationInProgress: "CreationInProgress" = "CreationInProgress"
  val CreationFailed: "CreationFailed" = "CreationFailed"
  val DeletionInProgress: "DeletionInProgress" = "DeletionInProgress"
  val DeletionFailed: "DeletionFailed" = "DeletionFailed"
  val UpdateInProgress: "UpdateInProgress" = "UpdateInProgress"
  val UpdateFailed: "UpdateFailed" = "UpdateFailed"

  @inline def values = js.Array[ScalingPlanStatusCode](Active, ActiveWithProblems, CreationInProgress, CreationFailed, DeletionInProgress, DeletionFailed, UpdateInProgress, UpdateFailed)
}

type ScalingPolicyUpdateBehavior = "KeepExternalPolicies" | "ReplaceExternalPolicies"
object ScalingPolicyUpdateBehavior {
  val KeepExternalPolicies: "KeepExternalPolicies" = "KeepExternalPolicies"
  val ReplaceExternalPolicies: "ReplaceExternalPolicies" = "ReplaceExternalPolicies"

  @inline def values = js.Array[ScalingPolicyUpdateBehavior](KeepExternalPolicies, ReplaceExternalPolicies)
}

type ScalingStatusCode = "Inactive" | "PartiallyActive" | "Active"
object ScalingStatusCode {
  val Inactive: "Inactive" = "Inactive"
  val PartiallyActive: "PartiallyActive" = "PartiallyActive"
  val Active: "Active" = "Active"

  @inline def values = js.Array[ScalingStatusCode](Inactive, PartiallyActive, Active)
}

type ServiceNamespace = "autoscaling" | "ecs" | "ec2" | "rds" | "dynamodb"
object ServiceNamespace {
  val autoscaling: "autoscaling" = "autoscaling"
  val ecs: "ecs" = "ecs"
  val ec2: "ec2" = "ec2"
  val rds: "rds" = "rds"
  val dynamodb: "dynamodb" = "dynamodb"

  @inline def values = js.Array[ServiceNamespace](autoscaling, ecs, ec2, rds, dynamodb)
}
