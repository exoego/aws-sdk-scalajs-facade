package facade.amazonaws.services.applicationautoscaling

import scalajs.js

@js.native
sealed trait AdjustmentType extends js.Any
object AdjustmentType {
  val ChangeInCapacity = "ChangeInCapacity".asInstanceOf[AdjustmentType]
  val PercentChangeInCapacity = "PercentChangeInCapacity".asInstanceOf[AdjustmentType]
  val ExactCapacity = "ExactCapacity".asInstanceOf[AdjustmentType]

  @inline def values: js.Array[AdjustmentType] = js.Array(ChangeInCapacity, PercentChangeInCapacity, ExactCapacity)
}

@js.native
sealed trait MetricAggregationType extends js.Any
object MetricAggregationType {
  val Average = "Average".asInstanceOf[MetricAggregationType]
  val Minimum = "Minimum".asInstanceOf[MetricAggregationType]
  val Maximum = "Maximum".asInstanceOf[MetricAggregationType]

  @inline def values: js.Array[MetricAggregationType] = js.Array(Average, Minimum, Maximum)
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
sealed trait MetricType extends js.Any
object MetricType {
  val DynamoDBReadCapacityUtilization = "DynamoDBReadCapacityUtilization".asInstanceOf[MetricType]
  val DynamoDBWriteCapacityUtilization = "DynamoDBWriteCapacityUtilization".asInstanceOf[MetricType]
  val ALBRequestCountPerTarget = "ALBRequestCountPerTarget".asInstanceOf[MetricType]
  val RDSReaderAverageCPUUtilization = "RDSReaderAverageCPUUtilization".asInstanceOf[MetricType]
  val RDSReaderAverageDatabaseConnections = "RDSReaderAverageDatabaseConnections".asInstanceOf[MetricType]
  val EC2SpotFleetRequestAverageCPUUtilization = "EC2SpotFleetRequestAverageCPUUtilization".asInstanceOf[MetricType]
  val EC2SpotFleetRequestAverageNetworkIn = "EC2SpotFleetRequestAverageNetworkIn".asInstanceOf[MetricType]
  val EC2SpotFleetRequestAverageNetworkOut = "EC2SpotFleetRequestAverageNetworkOut".asInstanceOf[MetricType]
  val SageMakerVariantInvocationsPerInstance = "SageMakerVariantInvocationsPerInstance".asInstanceOf[MetricType]
  val ECSServiceAverageCPUUtilization = "ECSServiceAverageCPUUtilization".asInstanceOf[MetricType]
  val ECSServiceAverageMemoryUtilization = "ECSServiceAverageMemoryUtilization".asInstanceOf[MetricType]
  val AppStreamAverageCapacityUtilization = "AppStreamAverageCapacityUtilization".asInstanceOf[MetricType]
  val ComprehendInferenceUtilization = "ComprehendInferenceUtilization".asInstanceOf[MetricType]
  val LambdaProvisionedConcurrencyUtilization = "LambdaProvisionedConcurrencyUtilization".asInstanceOf[MetricType]
  val CassandraReadCapacityUtilization = "CassandraReadCapacityUtilization".asInstanceOf[MetricType]
  val CassandraWriteCapacityUtilization = "CassandraWriteCapacityUtilization".asInstanceOf[MetricType]
  val KafkaBrokerStorageUtilization = "KafkaBrokerStorageUtilization".asInstanceOf[MetricType]
  val ElastiCachePrimaryEngineCPUUtilization = "ElastiCachePrimaryEngineCPUUtilization".asInstanceOf[MetricType]
  val ElastiCacheReplicaEngineCPUUtilization = "ElastiCacheReplicaEngineCPUUtilization".asInstanceOf[MetricType]
  val ElastiCacheDatabaseMemoryUsageCountedForEvictPercentage = "ElastiCacheDatabaseMemoryUsageCountedForEvictPercentage".asInstanceOf[MetricType]
  val NeptuneReaderAverageCPUUtilization = "NeptuneReaderAverageCPUUtilization".asInstanceOf[MetricType]

  @inline def values: js.Array[MetricType] = js.Array(
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
    KafkaBrokerStorageUtilization,
    ElastiCachePrimaryEngineCPUUtilization,
    ElastiCacheReplicaEngineCPUUtilization,
    ElastiCacheDatabaseMemoryUsageCountedForEvictPercentage,
    NeptuneReaderAverageCPUUtilization
  )
}

@js.native
sealed trait PolicyType extends js.Any
object PolicyType {
  val StepScaling = "StepScaling".asInstanceOf[PolicyType]
  val TargetTrackingScaling = "TargetTrackingScaling".asInstanceOf[PolicyType]

  @inline def values: js.Array[PolicyType] = js.Array(StepScaling, TargetTrackingScaling)
}

@js.native
sealed trait ScalableDimension extends js.Any
object ScalableDimension {
  val `ecs:service:DesiredCount` = "ecs:service:DesiredCount".asInstanceOf[ScalableDimension]
  val `ec2:spot-fleet-request:TargetCapacity` = "ec2:spot-fleet-request:TargetCapacity".asInstanceOf[ScalableDimension]
  val `elasticmapreduce:instancegroup:InstanceCount` = "elasticmapreduce:instancegroup:InstanceCount".asInstanceOf[ScalableDimension]
  val `appstream:fleet:DesiredCapacity` = "appstream:fleet:DesiredCapacity".asInstanceOf[ScalableDimension]
  val `dynamodb:table:ReadCapacityUnits` = "dynamodb:table:ReadCapacityUnits".asInstanceOf[ScalableDimension]
  val `dynamodb:table:WriteCapacityUnits` = "dynamodb:table:WriteCapacityUnits".asInstanceOf[ScalableDimension]
  val `dynamodb:index:ReadCapacityUnits` = "dynamodb:index:ReadCapacityUnits".asInstanceOf[ScalableDimension]
  val `dynamodb:index:WriteCapacityUnits` = "dynamodb:index:WriteCapacityUnits".asInstanceOf[ScalableDimension]
  val `rds:cluster:ReadReplicaCount` = "rds:cluster:ReadReplicaCount".asInstanceOf[ScalableDimension]
  val `sagemaker:variant:DesiredInstanceCount` = "sagemaker:variant:DesiredInstanceCount".asInstanceOf[ScalableDimension]
  val `custom-resource:ResourceType:Property` = "custom-resource:ResourceType:Property".asInstanceOf[ScalableDimension]
  val `comprehend:document-classifier-endpoint:DesiredInferenceUnits` = "comprehend:document-classifier-endpoint:DesiredInferenceUnits".asInstanceOf[ScalableDimension]
  val `comprehend:entity-recognizer-endpoint:DesiredInferenceUnits` = "comprehend:entity-recognizer-endpoint:DesiredInferenceUnits".asInstanceOf[ScalableDimension]
  val `lambda:function:ProvisionedConcurrency` = "lambda:function:ProvisionedConcurrency".asInstanceOf[ScalableDimension]
  val `cassandra:table:ReadCapacityUnits` = "cassandra:table:ReadCapacityUnits".asInstanceOf[ScalableDimension]
  val `cassandra:table:WriteCapacityUnits` = "cassandra:table:WriteCapacityUnits".asInstanceOf[ScalableDimension]
  val `kafka:broker-storage:VolumeSize` = "kafka:broker-storage:VolumeSize".asInstanceOf[ScalableDimension]
  val `elasticache:replication-group:NodeGroups` = "elasticache:replication-group:NodeGroups".asInstanceOf[ScalableDimension]
  val `elasticache:replication-group:Replicas` = "elasticache:replication-group:Replicas".asInstanceOf[ScalableDimension]
  val `neptune:cluster:ReadReplicaCount` = "neptune:cluster:ReadReplicaCount".asInstanceOf[ScalableDimension]

  @inline def values: js.Array[ScalableDimension] = js.Array(
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
    `kafka:broker-storage:VolumeSize`,
    `elasticache:replication-group:NodeGroups`,
    `elasticache:replication-group:Replicas`,
    `neptune:cluster:ReadReplicaCount`
  )
}

@js.native
sealed trait ScalingActivityStatusCode extends js.Any
object ScalingActivityStatusCode {
  val Pending = "Pending".asInstanceOf[ScalingActivityStatusCode]
  val InProgress = "InProgress".asInstanceOf[ScalingActivityStatusCode]
  val Successful = "Successful".asInstanceOf[ScalingActivityStatusCode]
  val Overridden = "Overridden".asInstanceOf[ScalingActivityStatusCode]
  val Unfulfilled = "Unfulfilled".asInstanceOf[ScalingActivityStatusCode]
  val Failed = "Failed".asInstanceOf[ScalingActivityStatusCode]

  @inline def values: js.Array[ScalingActivityStatusCode] = js.Array(Pending, InProgress, Successful, Overridden, Unfulfilled, Failed)
}

@js.native
sealed trait ServiceNamespace extends js.Any
object ServiceNamespace {
  val ecs = "ecs".asInstanceOf[ServiceNamespace]
  val elasticmapreduce = "elasticmapreduce".asInstanceOf[ServiceNamespace]
  val ec2 = "ec2".asInstanceOf[ServiceNamespace]
  val appstream = "appstream".asInstanceOf[ServiceNamespace]
  val dynamodb = "dynamodb".asInstanceOf[ServiceNamespace]
  val rds = "rds".asInstanceOf[ServiceNamespace]
  val sagemaker = "sagemaker".asInstanceOf[ServiceNamespace]
  val `custom-resource` = "custom-resource".asInstanceOf[ServiceNamespace]
  val comprehend = "comprehend".asInstanceOf[ServiceNamespace]
  val lambda = "lambda".asInstanceOf[ServiceNamespace]
  val cassandra = "cassandra".asInstanceOf[ServiceNamespace]
  val kafka = "kafka".asInstanceOf[ServiceNamespace]
  val elasticache = "elasticache".asInstanceOf[ServiceNamespace]
  val neptune = "neptune".asInstanceOf[ServiceNamespace]

  @inline def values: js.Array[ServiceNamespace] = js.Array(ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, `custom-resource`, comprehend, lambda, cassandra, kafka, elasticache, neptune)
}
