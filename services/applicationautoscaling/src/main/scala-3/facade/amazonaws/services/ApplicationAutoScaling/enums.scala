package facade.amazonaws.services.applicationautoscaling

import scalajs._

type AdjustmentType = "ChangeInCapacity" | "PercentChangeInCapacity" | "ExactCapacity"
object AdjustmentType {
  val ChangeInCapacity: "ChangeInCapacity" = "ChangeInCapacity"
  val PercentChangeInCapacity: "PercentChangeInCapacity" = "PercentChangeInCapacity"
  val ExactCapacity: "ExactCapacity" = "ExactCapacity"

  @inline def values = js.Array[AdjustmentType](ChangeInCapacity, PercentChangeInCapacity, ExactCapacity)
}

type MetricAggregationType = "Average" | "Minimum" | "Maximum"
object MetricAggregationType {
  val Average: "Average" = "Average"
  val Minimum: "Minimum" = "Minimum"
  val Maximum: "Maximum" = "Maximum"

  @inline def values = js.Array[MetricAggregationType](Average, Minimum, Maximum)
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

type MetricType = "DynamoDBReadCapacityUtilization" | "DynamoDBWriteCapacityUtilization" | "ALBRequestCountPerTarget" | "RDSReaderAverageCPUUtilization" | "RDSReaderAverageDatabaseConnections" | "EC2SpotFleetRequestAverageCPUUtilization" | "EC2SpotFleetRequestAverageNetworkIn" | "EC2SpotFleetRequestAverageNetworkOut" | "SageMakerVariantInvocationsPerInstance" | "ECSServiceAverageCPUUtilization" | "ECSServiceAverageMemoryUtilization" | "AppStreamAverageCapacityUtilization" | "ComprehendInferenceUtilization" | "LambdaProvisionedConcurrencyUtilization" | "CassandraReadCapacityUtilization" | "CassandraWriteCapacityUtilization" | "KafkaBrokerStorageUtilization"
object MetricType {
  val DynamoDBReadCapacityUtilization: "DynamoDBReadCapacityUtilization" = "DynamoDBReadCapacityUtilization"
  val DynamoDBWriteCapacityUtilization: "DynamoDBWriteCapacityUtilization" = "DynamoDBWriteCapacityUtilization"
  val ALBRequestCountPerTarget: "ALBRequestCountPerTarget" = "ALBRequestCountPerTarget"
  val RDSReaderAverageCPUUtilization: "RDSReaderAverageCPUUtilization" = "RDSReaderAverageCPUUtilization"
  val RDSReaderAverageDatabaseConnections: "RDSReaderAverageDatabaseConnections" = "RDSReaderAverageDatabaseConnections"
  val EC2SpotFleetRequestAverageCPUUtilization: "EC2SpotFleetRequestAverageCPUUtilization" = "EC2SpotFleetRequestAverageCPUUtilization"
  val EC2SpotFleetRequestAverageNetworkIn: "EC2SpotFleetRequestAverageNetworkIn" = "EC2SpotFleetRequestAverageNetworkIn"
  val EC2SpotFleetRequestAverageNetworkOut: "EC2SpotFleetRequestAverageNetworkOut" = "EC2SpotFleetRequestAverageNetworkOut"
  val SageMakerVariantInvocationsPerInstance: "SageMakerVariantInvocationsPerInstance" = "SageMakerVariantInvocationsPerInstance"
  val ECSServiceAverageCPUUtilization: "ECSServiceAverageCPUUtilization" = "ECSServiceAverageCPUUtilization"
  val ECSServiceAverageMemoryUtilization: "ECSServiceAverageMemoryUtilization" = "ECSServiceAverageMemoryUtilization"
  val AppStreamAverageCapacityUtilization: "AppStreamAverageCapacityUtilization" = "AppStreamAverageCapacityUtilization"
  val ComprehendInferenceUtilization: "ComprehendInferenceUtilization" = "ComprehendInferenceUtilization"
  val LambdaProvisionedConcurrencyUtilization: "LambdaProvisionedConcurrencyUtilization" = "LambdaProvisionedConcurrencyUtilization"
  val CassandraReadCapacityUtilization: "CassandraReadCapacityUtilization" = "CassandraReadCapacityUtilization"
  val CassandraWriteCapacityUtilization: "CassandraWriteCapacityUtilization" = "CassandraWriteCapacityUtilization"
  val KafkaBrokerStorageUtilization: "KafkaBrokerStorageUtilization" = "KafkaBrokerStorageUtilization"

  @inline def values = js.Array[MetricType](
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
  val StepScaling: "StepScaling" = "StepScaling"
  val TargetTrackingScaling: "TargetTrackingScaling" = "TargetTrackingScaling"

  @inline def values = js.Array[PolicyType](StepScaling, TargetTrackingScaling)
}

type ScalableDimension = "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "comprehend:entity-recognizer-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | "cassandra:table:ReadCapacityUnits" | "cassandra:table:WriteCapacityUnits" | "kafka:broker-storage:VolumeSize"
object ScalableDimension {
  val `ecs:service:DesiredCount`: "ecs:service:DesiredCount" = "ecs:service:DesiredCount"
  val `ec2:spot-fleet-request:TargetCapacity`: "ec2:spot-fleet-request:TargetCapacity" = "ec2:spot-fleet-request:TargetCapacity"
  val `elasticmapreduce:instancegroup:InstanceCount`: "elasticmapreduce:instancegroup:InstanceCount" = "elasticmapreduce:instancegroup:InstanceCount"
  val `appstream:fleet:DesiredCapacity`: "appstream:fleet:DesiredCapacity" = "appstream:fleet:DesiredCapacity"
  val `dynamodb:table:ReadCapacityUnits`: "dynamodb:table:ReadCapacityUnits" = "dynamodb:table:ReadCapacityUnits"
  val `dynamodb:table:WriteCapacityUnits`: "dynamodb:table:WriteCapacityUnits" = "dynamodb:table:WriteCapacityUnits"
  val `dynamodb:index:ReadCapacityUnits`: "dynamodb:index:ReadCapacityUnits" = "dynamodb:index:ReadCapacityUnits"
  val `dynamodb:index:WriteCapacityUnits`: "dynamodb:index:WriteCapacityUnits" = "dynamodb:index:WriteCapacityUnits"
  val `rds:cluster:ReadReplicaCount`: "rds:cluster:ReadReplicaCount" = "rds:cluster:ReadReplicaCount"
  val `sagemaker:variant:DesiredInstanceCount`: "sagemaker:variant:DesiredInstanceCount" = "sagemaker:variant:DesiredInstanceCount"
  val `custom-resource:ResourceType:Property`: "custom-resource:ResourceType:Property" = "custom-resource:ResourceType:Property"
  val `comprehend:document-classifier-endpoint:DesiredInferenceUnits`: "comprehend:document-classifier-endpoint:DesiredInferenceUnits" = "comprehend:document-classifier-endpoint:DesiredInferenceUnits"
  val `comprehend:entity-recognizer-endpoint:DesiredInferenceUnits`: "comprehend:entity-recognizer-endpoint:DesiredInferenceUnits" = "comprehend:entity-recognizer-endpoint:DesiredInferenceUnits"
  val `lambda:function:ProvisionedConcurrency`: "lambda:function:ProvisionedConcurrency" = "lambda:function:ProvisionedConcurrency"
  val `cassandra:table:ReadCapacityUnits`: "cassandra:table:ReadCapacityUnits" = "cassandra:table:ReadCapacityUnits"
  val `cassandra:table:WriteCapacityUnits`: "cassandra:table:WriteCapacityUnits" = "cassandra:table:WriteCapacityUnits"
  val `kafka:broker-storage:VolumeSize`: "kafka:broker-storage:VolumeSize" = "kafka:broker-storage:VolumeSize"

  @inline def values = js.Array[ScalableDimension](
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
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Successful: "Successful" = "Successful"
  val Overridden: "Overridden" = "Overridden"
  val Unfulfilled: "Unfulfilled" = "Unfulfilled"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[ScalingActivityStatusCode](Pending, InProgress, Successful, Overridden, Unfulfilled, Failed)
}

type ServiceNamespace = "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | "cassandra" | "kafka"
object ServiceNamespace {
  val ecs: "ecs" = "ecs"
  val elasticmapreduce: "elasticmapreduce" = "elasticmapreduce"
  val ec2: "ec2" = "ec2"
  val appstream: "appstream" = "appstream"
  val dynamodb: "dynamodb" = "dynamodb"
  val rds: "rds" = "rds"
  val sagemaker: "sagemaker" = "sagemaker"
  val `custom-resource`: "custom-resource" = "custom-resource"
  val comprehend: "comprehend" = "comprehend"
  val lambda: "lambda" = "lambda"
  val cassandra: "cassandra" = "cassandra"
  val kafka: "kafka" = "kafka"

  @inline def values = js.Array[ServiceNamespace](ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, `custom-resource`, comprehend, lambda, cassandra, kafka)
}
