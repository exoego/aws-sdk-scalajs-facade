package facade.amazonaws.services.applicationautoscaling

import scalajs._

type AdjustmentType = "ChangeInCapacity" | "PercentChangeInCapacity" | "ExactCapacity"
object AdjustmentType {
  inline val ChangeInCapacity: "ChangeInCapacity" = "ChangeInCapacity"
  inline val PercentChangeInCapacity: "PercentChangeInCapacity" = "PercentChangeInCapacity"
  inline val ExactCapacity: "ExactCapacity" = "ExactCapacity"

  inline def values: js.Array[AdjustmentType] = js.Array(ChangeInCapacity, PercentChangeInCapacity, ExactCapacity)
}

type MetricAggregationType = "Average" | "Minimum" | "Maximum"
object MetricAggregationType {
  inline val Average: "Average" = "Average"
  inline val Minimum: "Minimum" = "Minimum"
  inline val Maximum: "Maximum" = "Maximum"

  inline def values: js.Array[MetricAggregationType] = js.Array(Average, Minimum, Maximum)
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

type MetricType = "DynamoDBReadCapacityUtilization" | "DynamoDBWriteCapacityUtilization" | "ALBRequestCountPerTarget" | "RDSReaderAverageCPUUtilization" | "RDSReaderAverageDatabaseConnections" | "EC2SpotFleetRequestAverageCPUUtilization" | "EC2SpotFleetRequestAverageNetworkIn" | "EC2SpotFleetRequestAverageNetworkOut" | "SageMakerVariantInvocationsPerInstance" | "ECSServiceAverageCPUUtilization" | "ECSServiceAverageMemoryUtilization" | "AppStreamAverageCapacityUtilization" | "ComprehendInferenceUtilization" | "LambdaProvisionedConcurrencyUtilization" | "CassandraReadCapacityUtilization" | "CassandraWriteCapacityUtilization" | "KafkaBrokerStorageUtilization"
object MetricType {
  inline val DynamoDBReadCapacityUtilization: "DynamoDBReadCapacityUtilization" = "DynamoDBReadCapacityUtilization"
  inline val DynamoDBWriteCapacityUtilization: "DynamoDBWriteCapacityUtilization" = "DynamoDBWriteCapacityUtilization"
  inline val ALBRequestCountPerTarget: "ALBRequestCountPerTarget" = "ALBRequestCountPerTarget"
  inline val RDSReaderAverageCPUUtilization: "RDSReaderAverageCPUUtilization" = "RDSReaderAverageCPUUtilization"
  inline val RDSReaderAverageDatabaseConnections: "RDSReaderAverageDatabaseConnections" = "RDSReaderAverageDatabaseConnections"
  inline val EC2SpotFleetRequestAverageCPUUtilization: "EC2SpotFleetRequestAverageCPUUtilization" = "EC2SpotFleetRequestAverageCPUUtilization"
  inline val EC2SpotFleetRequestAverageNetworkIn: "EC2SpotFleetRequestAverageNetworkIn" = "EC2SpotFleetRequestAverageNetworkIn"
  inline val EC2SpotFleetRequestAverageNetworkOut: "EC2SpotFleetRequestAverageNetworkOut" = "EC2SpotFleetRequestAverageNetworkOut"
  inline val SageMakerVariantInvocationsPerInstance: "SageMakerVariantInvocationsPerInstance" = "SageMakerVariantInvocationsPerInstance"
  inline val ECSServiceAverageCPUUtilization: "ECSServiceAverageCPUUtilization" = "ECSServiceAverageCPUUtilization"
  inline val ECSServiceAverageMemoryUtilization: "ECSServiceAverageMemoryUtilization" = "ECSServiceAverageMemoryUtilization"
  inline val AppStreamAverageCapacityUtilization: "AppStreamAverageCapacityUtilization" = "AppStreamAverageCapacityUtilization"
  inline val ComprehendInferenceUtilization: "ComprehendInferenceUtilization" = "ComprehendInferenceUtilization"
  inline val LambdaProvisionedConcurrencyUtilization: "LambdaProvisionedConcurrencyUtilization" = "LambdaProvisionedConcurrencyUtilization"
  inline val CassandraReadCapacityUtilization: "CassandraReadCapacityUtilization" = "CassandraReadCapacityUtilization"
  inline val CassandraWriteCapacityUtilization: "CassandraWriteCapacityUtilization" = "CassandraWriteCapacityUtilization"
  inline val KafkaBrokerStorageUtilization: "KafkaBrokerStorageUtilization" = "KafkaBrokerStorageUtilization"

  inline def values: js.Array[MetricType] = js.Array(
    DynamoDBReadCapacityUtilization,
    DynamoDBWriteCapacityUtilization,
    ALBRequestCountPerTarget,
    RDSReaderAverageCPUUtilization,
    RDSReaderAverageDatabaseConnections,
    EC2SpotFleetRequestAverageCPUUtilization,
    EC2SpotFleetRequestAverageNetworkIn,
    EC2SpotFleetRequestAverageNetworkOut,
    SageMakerVariantInvocationsPerInstance,
    ECSServiceAverageCPUUtilization,
    ECSServiceAverageMemoryUtilization,
    AppStreamAverageCapacityUtilization,
    ComprehendInferenceUtilization,
    LambdaProvisionedConcurrencyUtilization,
    CassandraReadCapacityUtilization,
    CassandraWriteCapacityUtilization,
    KafkaBrokerStorageUtilization
  )
}

type PolicyType = "StepScaling" | "TargetTrackingScaling"
object PolicyType {
  inline val StepScaling: "StepScaling" = "StepScaling"
  inline val TargetTrackingScaling: "TargetTrackingScaling" = "TargetTrackingScaling"

  inline def values: js.Array[PolicyType] = js.Array(StepScaling, TargetTrackingScaling)
}

type ScalableDimension = "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "comprehend:entity-recognizer-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | "cassandra:table:ReadCapacityUnits" | "cassandra:table:WriteCapacityUnits" | "kafka:broker-storage:VolumeSize"
object ScalableDimension {
  inline val `ecs:service:DesiredCount`: "ecs:service:DesiredCount" = "ecs:service:DesiredCount"
  inline val `ec2:spot-fleet-request:TargetCapacity`: "ec2:spot-fleet-request:TargetCapacity" = "ec2:spot-fleet-request:TargetCapacity"
  inline val `elasticmapreduce:instancegroup:InstanceCount`: "elasticmapreduce:instancegroup:InstanceCount" = "elasticmapreduce:instancegroup:InstanceCount"
  inline val `appstream:fleet:DesiredCapacity`: "appstream:fleet:DesiredCapacity" = "appstream:fleet:DesiredCapacity"
  inline val `dynamodb:table:ReadCapacityUnits`: "dynamodb:table:ReadCapacityUnits" = "dynamodb:table:ReadCapacityUnits"
  inline val `dynamodb:table:WriteCapacityUnits`: "dynamodb:table:WriteCapacityUnits" = "dynamodb:table:WriteCapacityUnits"
  inline val `dynamodb:index:ReadCapacityUnits`: "dynamodb:index:ReadCapacityUnits" = "dynamodb:index:ReadCapacityUnits"
  inline val `dynamodb:index:WriteCapacityUnits`: "dynamodb:index:WriteCapacityUnits" = "dynamodb:index:WriteCapacityUnits"
  inline val `rds:cluster:ReadReplicaCount`: "rds:cluster:ReadReplicaCount" = "rds:cluster:ReadReplicaCount"
  inline val `sagemaker:variant:DesiredInstanceCount`: "sagemaker:variant:DesiredInstanceCount" = "sagemaker:variant:DesiredInstanceCount"
  inline val `custom-resource:ResourceType:Property`: "custom-resource:ResourceType:Property" = "custom-resource:ResourceType:Property"
  inline val `comprehend:document-classifier-endpoint:DesiredInferenceUnits`: "comprehend:document-classifier-endpoint:DesiredInferenceUnits" = "comprehend:document-classifier-endpoint:DesiredInferenceUnits"
  inline val `comprehend:entity-recognizer-endpoint:DesiredInferenceUnits`: "comprehend:entity-recognizer-endpoint:DesiredInferenceUnits" = "comprehend:entity-recognizer-endpoint:DesiredInferenceUnits"
  inline val `lambda:function:ProvisionedConcurrency`: "lambda:function:ProvisionedConcurrency" = "lambda:function:ProvisionedConcurrency"
  inline val `cassandra:table:ReadCapacityUnits`: "cassandra:table:ReadCapacityUnits" = "cassandra:table:ReadCapacityUnits"
  inline val `cassandra:table:WriteCapacityUnits`: "cassandra:table:WriteCapacityUnits" = "cassandra:table:WriteCapacityUnits"
  inline val `kafka:broker-storage:VolumeSize`: "kafka:broker-storage:VolumeSize" = "kafka:broker-storage:VolumeSize"

  inline def values: js.Array[ScalableDimension] = js.Array(
    `ecs:service:DesiredCount`,
    `ec2:spot-fleet-request:TargetCapacity`,
    `elasticmapreduce:instancegroup:InstanceCount`,
    `appstream:fleet:DesiredCapacity`,
    `dynamodb:table:ReadCapacityUnits`,
    `dynamodb:table:WriteCapacityUnits`,
    `dynamodb:index:ReadCapacityUnits`,
    `dynamodb:index:WriteCapacityUnits`,
    `rds:cluster:ReadReplicaCount`,
    `sagemaker:variant:DesiredInstanceCount`,
    `custom-resource:ResourceType:Property`,
    `comprehend:document-classifier-endpoint:DesiredInferenceUnits`,
    `comprehend:entity-recognizer-endpoint:DesiredInferenceUnits`,
    `lambda:function:ProvisionedConcurrency`,
    `cassandra:table:ReadCapacityUnits`,
    `cassandra:table:WriteCapacityUnits`,
    `kafka:broker-storage:VolumeSize`
  )
}

type ScalingActivityStatusCode = "Pending" | "InProgress" | "Successful" | "Overridden" | "Unfulfilled" | "Failed"
object ScalingActivityStatusCode {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Successful: "Successful" = "Successful"
  inline val Overridden: "Overridden" = "Overridden"
  inline val Unfulfilled: "Unfulfilled" = "Unfulfilled"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[ScalingActivityStatusCode] = js.Array(Pending, InProgress, Successful, Overridden, Unfulfilled, Failed)
}

type ServiceNamespace = "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | "cassandra" | "kafka"
object ServiceNamespace {
  inline val ecs: "ecs" = "ecs"
  inline val elasticmapreduce: "elasticmapreduce" = "elasticmapreduce"
  inline val ec2: "ec2" = "ec2"
  inline val appstream: "appstream" = "appstream"
  inline val dynamodb: "dynamodb" = "dynamodb"
  inline val rds: "rds" = "rds"
  inline val sagemaker: "sagemaker" = "sagemaker"
  inline val `custom-resource`: "custom-resource" = "custom-resource"
  inline val comprehend: "comprehend" = "comprehend"
  inline val lambda: "lambda" = "lambda"
  inline val cassandra: "cassandra" = "cassandra"
  inline val kafka: "kafka" = "kafka"

  inline def values: js.Array[ServiceNamespace] = js.Array(ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, `custom-resource`, comprehend, lambda, cassandra, kafka)
}
