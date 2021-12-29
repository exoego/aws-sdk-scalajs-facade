package facade.amazonaws.services.autoscalingplans

import scalajs._

type ForecastDataType = "CapacityForecast" | "LoadForecast" | "ScheduledActionMinCapacity" | "ScheduledActionMaxCapacity"
object ForecastDataType {
  inline val CapacityForecast: "CapacityForecast" = "CapacityForecast"
  inline val LoadForecast: "LoadForecast" = "LoadForecast"
  inline val ScheduledActionMinCapacity: "ScheduledActionMinCapacity" = "ScheduledActionMinCapacity"
  inline val ScheduledActionMaxCapacity: "ScheduledActionMaxCapacity" = "ScheduledActionMaxCapacity"

  inline def values: js.Array[ForecastDataType] = js.Array(CapacityForecast, LoadForecast, ScheduledActionMinCapacity, ScheduledActionMaxCapacity)
}

type LoadMetricType = "ASGTotalCPUUtilization" | "ASGTotalNetworkIn" | "ASGTotalNetworkOut" | "ALBTargetGroupRequestCount"
object LoadMetricType {
  inline val ASGTotalCPUUtilization: "ASGTotalCPUUtilization" = "ASGTotalCPUUtilization"
  inline val ASGTotalNetworkIn: "ASGTotalNetworkIn" = "ASGTotalNetworkIn"
  inline val ASGTotalNetworkOut: "ASGTotalNetworkOut" = "ASGTotalNetworkOut"
  inline val ALBTargetGroupRequestCount: "ALBTargetGroupRequestCount" = "ALBTargetGroupRequestCount"

  inline def values: js.Array[LoadMetricType] = js.Array(ASGTotalCPUUtilization, ASGTotalNetworkIn, ASGTotalNetworkOut, ALBTargetGroupRequestCount)
}

type MetricStatistic = "Average" | "Minimum" | "Maximum" | "SampleCount" | "Sum"
object MetricStatistic {
  inline val Average: "Average" = "Average"
  inline val Minimum: "Minimum" = "Minimum"
  inline val Maximum: "Maximum" = "Maximum"
  inline val SampleCount: "SampleCount" = "SampleCount"
  inline val Sum: "Sum" = "Sum"

  inline def values: js.Array[MetricStatistic] = js.Array(Average, Minimum, Maximum, SampleCount, Sum)
}

type PolicyType = "TargetTrackingScaling"
object PolicyType {
  inline val TargetTrackingScaling: "TargetTrackingScaling" = "TargetTrackingScaling"

  inline def values: js.Array[PolicyType] = js.Array(TargetTrackingScaling)
}

type PredictiveScalingMaxCapacityBehavior = "SetForecastCapacityToMaxCapacity" | "SetMaxCapacityToForecastCapacity" | "SetMaxCapacityAboveForecastCapacity"
object PredictiveScalingMaxCapacityBehavior {
  inline val SetForecastCapacityToMaxCapacity: "SetForecastCapacityToMaxCapacity" = "SetForecastCapacityToMaxCapacity"
  inline val SetMaxCapacityToForecastCapacity: "SetMaxCapacityToForecastCapacity" = "SetMaxCapacityToForecastCapacity"
  inline val SetMaxCapacityAboveForecastCapacity: "SetMaxCapacityAboveForecastCapacity" = "SetMaxCapacityAboveForecastCapacity"

  inline def values: js.Array[PredictiveScalingMaxCapacityBehavior] = js.Array(SetForecastCapacityToMaxCapacity, SetMaxCapacityToForecastCapacity, SetMaxCapacityAboveForecastCapacity)
}

type PredictiveScalingMode = "ForecastAndScale" | "ForecastOnly"
object PredictiveScalingMode {
  inline val ForecastAndScale: "ForecastAndScale" = "ForecastAndScale"
  inline val ForecastOnly: "ForecastOnly" = "ForecastOnly"

  inline def values: js.Array[PredictiveScalingMode] = js.Array(ForecastAndScale, ForecastOnly)
}

type ScalableDimension = "autoscaling:autoScalingGroup:DesiredCapacity" | "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "rds:cluster:ReadReplicaCount" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits"
object ScalableDimension {
  inline val `autoscaling:autoScalingGroup:DesiredCapacity`: "autoscaling:autoScalingGroup:DesiredCapacity" = "autoscaling:autoScalingGroup:DesiredCapacity"
  inline val `ecs:service:DesiredCount`: "ecs:service:DesiredCount" = "ecs:service:DesiredCount"
  inline val `ec2:spot-fleet-request:TargetCapacity`: "ec2:spot-fleet-request:TargetCapacity" = "ec2:spot-fleet-request:TargetCapacity"
  inline val `rds:cluster:ReadReplicaCount`: "rds:cluster:ReadReplicaCount" = "rds:cluster:ReadReplicaCount"
  inline val `dynamodb:table:ReadCapacityUnits`: "dynamodb:table:ReadCapacityUnits" = "dynamodb:table:ReadCapacityUnits"
  inline val `dynamodb:table:WriteCapacityUnits`: "dynamodb:table:WriteCapacityUnits" = "dynamodb:table:WriteCapacityUnits"
  inline val `dynamodb:index:ReadCapacityUnits`: "dynamodb:index:ReadCapacityUnits" = "dynamodb:index:ReadCapacityUnits"
  inline val `dynamodb:index:WriteCapacityUnits`: "dynamodb:index:WriteCapacityUnits" = "dynamodb:index:WriteCapacityUnits"

  inline def values: js.Array[ScalableDimension] = js.Array(
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
  inline val ASGAverageCPUUtilization: "ASGAverageCPUUtilization" = "ASGAverageCPUUtilization"
  inline val ASGAverageNetworkIn: "ASGAverageNetworkIn" = "ASGAverageNetworkIn"
  inline val ASGAverageNetworkOut: "ASGAverageNetworkOut" = "ASGAverageNetworkOut"
  inline val DynamoDBReadCapacityUtilization: "DynamoDBReadCapacityUtilization" = "DynamoDBReadCapacityUtilization"
  inline val DynamoDBWriteCapacityUtilization: "DynamoDBWriteCapacityUtilization" = "DynamoDBWriteCapacityUtilization"
  inline val ECSServiceAverageCPUUtilization: "ECSServiceAverageCPUUtilization" = "ECSServiceAverageCPUUtilization"
  inline val ECSServiceAverageMemoryUtilization: "ECSServiceAverageMemoryUtilization" = "ECSServiceAverageMemoryUtilization"
  inline val ALBRequestCountPerTarget: "ALBRequestCountPerTarget" = "ALBRequestCountPerTarget"
  inline val RDSReaderAverageCPUUtilization: "RDSReaderAverageCPUUtilization" = "RDSReaderAverageCPUUtilization"
  inline val RDSReaderAverageDatabaseConnections: "RDSReaderAverageDatabaseConnections" = "RDSReaderAverageDatabaseConnections"
  inline val EC2SpotFleetRequestAverageCPUUtilization: "EC2SpotFleetRequestAverageCPUUtilization" = "EC2SpotFleetRequestAverageCPUUtilization"
  inline val EC2SpotFleetRequestAverageNetworkIn: "EC2SpotFleetRequestAverageNetworkIn" = "EC2SpotFleetRequestAverageNetworkIn"
  inline val EC2SpotFleetRequestAverageNetworkOut: "EC2SpotFleetRequestAverageNetworkOut" = "EC2SpotFleetRequestAverageNetworkOut"

  inline def values: js.Array[ScalingMetricType] = js.Array(
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
  inline val Active: "Active" = "Active"
  inline val ActiveWithProblems: "ActiveWithProblems" = "ActiveWithProblems"
  inline val CreationInProgress: "CreationInProgress" = "CreationInProgress"
  inline val CreationFailed: "CreationFailed" = "CreationFailed"
  inline val DeletionInProgress: "DeletionInProgress" = "DeletionInProgress"
  inline val DeletionFailed: "DeletionFailed" = "DeletionFailed"
  inline val UpdateInProgress: "UpdateInProgress" = "UpdateInProgress"
  inline val UpdateFailed: "UpdateFailed" = "UpdateFailed"

  inline def values: js.Array[ScalingPlanStatusCode] = js.Array(Active, ActiveWithProblems, CreationInProgress, CreationFailed, DeletionInProgress, DeletionFailed, UpdateInProgress, UpdateFailed)
}

type ScalingPolicyUpdateBehavior = "KeepExternalPolicies" | "ReplaceExternalPolicies"
object ScalingPolicyUpdateBehavior {
  inline val KeepExternalPolicies: "KeepExternalPolicies" = "KeepExternalPolicies"
  inline val ReplaceExternalPolicies: "ReplaceExternalPolicies" = "ReplaceExternalPolicies"

  inline def values: js.Array[ScalingPolicyUpdateBehavior] = js.Array(KeepExternalPolicies, ReplaceExternalPolicies)
}

type ScalingStatusCode = "Inactive" | "PartiallyActive" | "Active"
object ScalingStatusCode {
  inline val Inactive: "Inactive" = "Inactive"
  inline val PartiallyActive: "PartiallyActive" = "PartiallyActive"
  inline val Active: "Active" = "Active"

  inline def values: js.Array[ScalingStatusCode] = js.Array(Inactive, PartiallyActive, Active)
}

type ServiceNamespace = "autoscaling" | "ecs" | "ec2" | "rds" | "dynamodb"
object ServiceNamespace {
  inline val autoscaling: "autoscaling" = "autoscaling"
  inline val ecs: "ecs" = "ecs"
  inline val ec2: "ec2" = "ec2"
  inline val rds: "rds" = "rds"
  inline val dynamodb: "dynamodb" = "dynamodb"

  inline def values: js.Array[ServiceNamespace] = js.Array(autoscaling, ecs, ec2, rds, dynamodb)
}
