package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object applicationautoscaling {
  type Alarms                 = js.Array[Alarm]
  type Cooldown               = Int
  type DisableScaleIn         = Boolean
  type MaxResults             = Int
  type MetricDimensionName    = String
  type MetricDimensionValue   = String
  type MetricDimensions       = js.Array[MetricDimension]
  type MetricName             = String
  type MetricNamespace        = String
  type MetricScale            = Double
  type MetricUnit             = String
  type MinAdjustmentMagnitude = Int
  type PolicyName             = String
  type ResourceCapacity       = Int
  type ResourceId             = String
  type ResourceIdMaxLen1600   = String
  type ResourceIdsMaxLen1600  = js.Array[ResourceIdMaxLen1600]
  type ResourceLabel          = String
  type ScalableTargets        = js.Array[ScalableTarget]
  type ScalingActivities      = js.Array[ScalingActivity]
  type ScalingAdjustment      = Int
  type ScalingPolicies        = js.Array[ScalingPolicy]
  type ScalingSuspended       = Boolean
  type ScheduledActionName    = String
  type ScheduledActions       = js.Array[ScheduledAction]
  type StepAdjustments        = js.Array[StepAdjustment]
  type TimestampType          = js.Date
  type XmlString              = String

  implicit final class ApplicationAutoScalingOps(private val service: ApplicationAutoScaling) extends AnyVal {

    @inline def deleteScalingPolicyFuture(params: DeleteScalingPolicyRequest): Future[DeleteScalingPolicyResponse] =
      service.deleteScalingPolicy(params).promise().toFuture
    @inline def deleteScheduledActionFuture(
        params: DeleteScheduledActionRequest
    ): Future[DeleteScheduledActionResponse] = service.deleteScheduledAction(params).promise().toFuture
    @inline def deregisterScalableTargetFuture(
        params: DeregisterScalableTargetRequest
    ): Future[DeregisterScalableTargetResponse] = service.deregisterScalableTarget(params).promise().toFuture
    @inline def describeScalableTargetsFuture(
        params: DescribeScalableTargetsRequest
    ): Future[DescribeScalableTargetsResponse] = service.describeScalableTargets(params).promise().toFuture
    @inline def describeScalingActivitiesFuture(
        params: DescribeScalingActivitiesRequest
    ): Future[DescribeScalingActivitiesResponse] = service.describeScalingActivities(params).promise().toFuture
    @inline def describeScalingPoliciesFuture(
        params: DescribeScalingPoliciesRequest
    ): Future[DescribeScalingPoliciesResponse] = service.describeScalingPolicies(params).promise().toFuture
    @inline def describeScheduledActionsFuture(
        params: DescribeScheduledActionsRequest
    ): Future[DescribeScheduledActionsResponse] = service.describeScheduledActions(params).promise().toFuture
    @inline def putScalingPolicyFuture(params: PutScalingPolicyRequest): Future[PutScalingPolicyResponse] =
      service.putScalingPolicy(params).promise().toFuture
    @inline def putScheduledActionFuture(params: PutScheduledActionRequest): Future[PutScheduledActionResponse] =
      service.putScheduledAction(params).promise().toFuture
    @inline def registerScalableTargetFuture(
        params: RegisterScalableTargetRequest
    ): Future[RegisterScalableTargetResponse] = service.registerScalableTarget(params).promise().toFuture
  }
}

package applicationautoscaling {
  @js.native
  @JSImport("aws-sdk", "ApplicationAutoScaling")
  class ApplicationAutoScaling() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteScalingPolicy(params: DeleteScalingPolicyRequest): Request[DeleteScalingPolicyResponse]       = js.native
    def deleteScheduledAction(params: DeleteScheduledActionRequest): Request[DeleteScheduledActionResponse] = js.native
    def deregisterScalableTarget(params: DeregisterScalableTargetRequest): Request[DeregisterScalableTargetResponse] =
      js.native
    def describeScalableTargets(params: DescribeScalableTargetsRequest): Request[DescribeScalableTargetsResponse] =
      js.native
    def describeScalingActivities(
        params: DescribeScalingActivitiesRequest
    ): Request[DescribeScalingActivitiesResponse] = js.native
    def describeScalingPolicies(params: DescribeScalingPoliciesRequest): Request[DescribeScalingPoliciesResponse] =
      js.native
    def describeScheduledActions(params: DescribeScheduledActionsRequest): Request[DescribeScheduledActionsResponse] =
      js.native
    def putScalingPolicy(params: PutScalingPolicyRequest): Request[PutScalingPolicyResponse]       = js.native
    def putScheduledAction(params: PutScheduledActionRequest): Request[PutScheduledActionResponse] = js.native
    def registerScalableTarget(params: RegisterScalableTargetRequest): Request[RegisterScalableTargetResponse] =
      js.native
  }

  @js.native
  sealed trait AdjustmentType extends js.Any
  object AdjustmentType extends js.Object {
    val ChangeInCapacity        = "ChangeInCapacity".asInstanceOf[AdjustmentType]
    val PercentChangeInCapacity = "PercentChangeInCapacity".asInstanceOf[AdjustmentType]
    val ExactCapacity           = "ExactCapacity".asInstanceOf[AdjustmentType]

    val values = js.Object.freeze(js.Array(ChangeInCapacity, PercentChangeInCapacity, ExactCapacity))
  }

  /**
    * Represents a CloudWatch alarm associated with a scaling policy.
    */
  @js.native
  @Factory
  trait Alarm extends js.Object {
    var AlarmARN: ResourceId
    var AlarmName: ResourceId
  }

  /**
    * Represents a CloudWatch metric of your choosing for a target tracking scaling policy to use with Application Auto Scaling.
    *  To create your customized metric specification:
    * * Add values for each required parameter from CloudWatch. You can use an existing metric, or a new metric that you create. To use your own metric, you must first publish the metric to CloudWatch. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html|Publish Custom Metrics]] in the <i>Amazon CloudWatch User Guide</i>.
    *  * Choose a metric that changes proportionally with capacity. The value of the metric should increase or decrease in inverse proportion to the number of capacity units. That is, the value of the metric should decrease when capacity increases.
    * For more information about CloudWatch, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]].
    */
  @js.native
  @Factory
  trait CustomizedMetricSpecification extends js.Object {
    var MetricName: MetricName
    var Namespace: MetricNamespace
    var Statistic: MetricStatistic
    var Dimensions: js.UndefOr[MetricDimensions]
    var Unit: js.UndefOr[MetricUnit]
  }

  @js.native
  @Factory
  trait DeleteScalingPolicyRequest extends js.Object {
    var PolicyName: ResourceIdMaxLen1600
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
  }

  @js.native
  @Factory
  trait DeleteScalingPolicyResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteScheduledActionRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ScheduledActionName: ResourceIdMaxLen1600
    var ServiceNamespace: ServiceNamespace
  }

  @js.native
  @Factory
  trait DeleteScheduledActionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeregisterScalableTargetRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
  }

  @js.native
  @Factory
  trait DeregisterScalableTargetResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeScalableTargetsRequest extends js.Object {
    var ServiceNamespace: ServiceNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[XmlString]
    var ResourceIds: js.UndefOr[ResourceIdsMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  @js.native
  @Factory
  trait DescribeScalableTargetsResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalableTargets: js.UndefOr[ScalableTargets]
  }

  @js.native
  @Factory
  trait DescribeScalingActivitiesRequest extends js.Object {
    var ServiceNamespace: ServiceNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[XmlString]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  @js.native
  @Factory
  trait DescribeScalingActivitiesResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingActivities: js.UndefOr[ScalingActivities]
  }

  @js.native
  @Factory
  trait DescribeScalingPoliciesRequest extends js.Object {
    var ServiceNamespace: ServiceNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[XmlString]
    var PolicyNames: js.UndefOr[ResourceIdsMaxLen1600]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  @js.native
  @Factory
  trait DescribeScalingPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingPolicies: js.UndefOr[ScalingPolicies]
  }

  @js.native
  @Factory
  trait DescribeScheduledActionsRequest extends js.Object {
    var ServiceNamespace: ServiceNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[XmlString]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ScheduledActionNames: js.UndefOr[ResourceIdsMaxLen1600]
  }

  @js.native
  @Factory
  trait DescribeScheduledActionsResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScheduledActions: js.UndefOr[ScheduledActions]
  }

  @js.native
  sealed trait MetricAggregationType extends js.Any
  object MetricAggregationType extends js.Object {
    val Average = "Average".asInstanceOf[MetricAggregationType]
    val Minimum = "Minimum".asInstanceOf[MetricAggregationType]
    val Maximum = "Maximum".asInstanceOf[MetricAggregationType]

    val values = js.Object.freeze(js.Array(Average, Minimum, Maximum))
  }

  /**
    * Describes the dimension names and values associated with a metric.
    */
  @js.native
  @Factory
  trait MetricDimension extends js.Object {
    var Name: MetricDimensionName
    var Value: MetricDimensionValue
  }

  @js.native
  sealed trait MetricStatistic extends js.Any
  object MetricStatistic extends js.Object {
    val Average     = "Average".asInstanceOf[MetricStatistic]
    val Minimum     = "Minimum".asInstanceOf[MetricStatistic]
    val Maximum     = "Maximum".asInstanceOf[MetricStatistic]
    val SampleCount = "SampleCount".asInstanceOf[MetricStatistic]
    val Sum         = "Sum".asInstanceOf[MetricStatistic]

    val values = js.Object.freeze(js.Array(Average, Minimum, Maximum, SampleCount, Sum))
  }

  @js.native
  sealed trait MetricType extends js.Any
  object MetricType extends js.Object {
    val DynamoDBReadCapacityUtilization          = "DynamoDBReadCapacityUtilization".asInstanceOf[MetricType]
    val DynamoDBWriteCapacityUtilization         = "DynamoDBWriteCapacityUtilization".asInstanceOf[MetricType]
    val ALBRequestCountPerTarget                 = "ALBRequestCountPerTarget".asInstanceOf[MetricType]
    val RDSReaderAverageCPUUtilization           = "RDSReaderAverageCPUUtilization".asInstanceOf[MetricType]
    val RDSReaderAverageDatabaseConnections      = "RDSReaderAverageDatabaseConnections".asInstanceOf[MetricType]
    val EC2SpotFleetRequestAverageCPUUtilization = "EC2SpotFleetRequestAverageCPUUtilization".asInstanceOf[MetricType]
    val EC2SpotFleetRequestAverageNetworkIn      = "EC2SpotFleetRequestAverageNetworkIn".asInstanceOf[MetricType]
    val EC2SpotFleetRequestAverageNetworkOut     = "EC2SpotFleetRequestAverageNetworkOut".asInstanceOf[MetricType]
    val SageMakerVariantInvocationsPerInstance   = "SageMakerVariantInvocationsPerInstance".asInstanceOf[MetricType]
    val ECSServiceAverageCPUUtilization          = "ECSServiceAverageCPUUtilization".asInstanceOf[MetricType]
    val ECSServiceAverageMemoryUtilization       = "ECSServiceAverageMemoryUtilization".asInstanceOf[MetricType]
    val AppStreamAverageCapacityUtilization      = "AppStreamAverageCapacityUtilization".asInstanceOf[MetricType]
    val ComprehendInferenceUtilization           = "ComprehendInferenceUtilization".asInstanceOf[MetricType]
    val LambdaProvisionedConcurrencyUtilization  = "LambdaProvisionedConcurrencyUtilization".asInstanceOf[MetricType]

    val values = js.Object.freeze(
      js.Array(
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
        LambdaProvisionedConcurrencyUtilization
      )
    )
  }

  @js.native
  sealed trait PolicyType extends js.Any
  object PolicyType extends js.Object {
    val StepScaling           = "StepScaling".asInstanceOf[PolicyType]
    val TargetTrackingScaling = "TargetTrackingScaling".asInstanceOf[PolicyType]

    val values = js.Object.freeze(js.Array(StepScaling, TargetTrackingScaling))
  }

  /**
    * Represents a predefined metric for a target tracking scaling policy to use with Application Auto Scaling.
    */
  @js.native
  @Factory
  trait PredefinedMetricSpecification extends js.Object {
    var PredefinedMetricType: MetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  @js.native
  @Factory
  trait PutScalingPolicyRequest extends js.Object {
    var PolicyName: PolicyName
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
    var PolicyType: js.UndefOr[PolicyType]
    var StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration]
  }

  @js.native
  @Factory
  trait PutScalingPolicyResponse extends js.Object {
    var PolicyARN: ResourceIdMaxLen1600
    var Alarms: js.UndefOr[Alarms]
  }

  @js.native
  @Factory
  trait PutScheduledActionRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ScheduledActionName: ScheduledActionName
    var ServiceNamespace: ServiceNamespace
    var EndTime: js.UndefOr[TimestampType]
    var ScalableTargetAction: js.UndefOr[ScalableTargetAction]
    var Schedule: js.UndefOr[ResourceIdMaxLen1600]
    var StartTime: js.UndefOr[TimestampType]
  }

  @js.native
  @Factory
  trait PutScheduledActionResponse extends js.Object {}

  @js.native
  @Factory
  trait RegisterScalableTargetRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
    var MaxCapacity: js.UndefOr[ResourceCapacity]
    var MinCapacity: js.UndefOr[ResourceCapacity]
    var RoleARN: js.UndefOr[ResourceIdMaxLen1600]
    var SuspendedState: js.UndefOr[SuspendedState]
  }

  @js.native
  @Factory
  trait RegisterScalableTargetResponse extends js.Object {}

  @js.native
  sealed trait ScalableDimension extends js.Any
  object ScalableDimension extends js.Object {
    val `ecs:service:DesiredCount` = "ecs:service:DesiredCount".asInstanceOf[ScalableDimension]
    val `ec2:spot-fleet-request:TargetCapacity` =
      "ec2:spot-fleet-request:TargetCapacity".asInstanceOf[ScalableDimension]
    val `elasticmapreduce:instancegroup:InstanceCount` =
      "elasticmapreduce:instancegroup:InstanceCount".asInstanceOf[ScalableDimension]
    val `appstream:fleet:DesiredCapacity`   = "appstream:fleet:DesiredCapacity".asInstanceOf[ScalableDimension]
    val `dynamodb:table:ReadCapacityUnits`  = "dynamodb:table:ReadCapacityUnits".asInstanceOf[ScalableDimension]
    val `dynamodb:table:WriteCapacityUnits` = "dynamodb:table:WriteCapacityUnits".asInstanceOf[ScalableDimension]
    val `dynamodb:index:ReadCapacityUnits`  = "dynamodb:index:ReadCapacityUnits".asInstanceOf[ScalableDimension]
    val `dynamodb:index:WriteCapacityUnits` = "dynamodb:index:WriteCapacityUnits".asInstanceOf[ScalableDimension]
    val `rds:cluster:ReadReplicaCount`      = "rds:cluster:ReadReplicaCount".asInstanceOf[ScalableDimension]
    val `sagemaker:variant:DesiredInstanceCount` =
      "sagemaker:variant:DesiredInstanceCount".asInstanceOf[ScalableDimension]
    val `custom-resource:ResourceType:Property` =
      "custom-resource:ResourceType:Property".asInstanceOf[ScalableDimension]
    val `comprehend:document-classifier-endpoint:DesiredInferenceUnits` =
      "comprehend:document-classifier-endpoint:DesiredInferenceUnits".asInstanceOf[ScalableDimension]
    val `lambda:function:ProvisionedConcurrency` =
      "lambda:function:ProvisionedConcurrency".asInstanceOf[ScalableDimension]

    val values = js.Object.freeze(
      js.Array(
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
        `lambda:function:ProvisionedConcurrency`
      )
    )
  }

  /**
    * Represents a scalable target.
    */
  @js.native
  @Factory
  trait ScalableTarget extends js.Object {
    var CreationTime: TimestampType
    var MaxCapacity: ResourceCapacity
    var MinCapacity: ResourceCapacity
    var ResourceId: ResourceIdMaxLen1600
    var RoleARN: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
    var SuspendedState: js.UndefOr[SuspendedState]
  }

  /**
    * Represents the minimum and maximum capacity for a scheduled action.
    */
  @js.native
  @Factory
  trait ScalableTargetAction extends js.Object {
    var MaxCapacity: js.UndefOr[ResourceCapacity]
    var MinCapacity: js.UndefOr[ResourceCapacity]
  }

  /**
    * Represents a scaling activity.
    */
  @js.native
  @Factory
  trait ScalingActivity extends js.Object {
    var ActivityId: ResourceId
    var Cause: XmlString
    var Description: XmlString
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
    var StartTime: TimestampType
    var StatusCode: ScalingActivityStatusCode
    var Details: js.UndefOr[XmlString]
    var EndTime: js.UndefOr[TimestampType]
    var StatusMessage: js.UndefOr[XmlString]
  }

  @js.native
  sealed trait ScalingActivityStatusCode extends js.Any
  object ScalingActivityStatusCode extends js.Object {
    val Pending     = "Pending".asInstanceOf[ScalingActivityStatusCode]
    val InProgress  = "InProgress".asInstanceOf[ScalingActivityStatusCode]
    val Successful  = "Successful".asInstanceOf[ScalingActivityStatusCode]
    val Overridden  = "Overridden".asInstanceOf[ScalingActivityStatusCode]
    val Unfulfilled = "Unfulfilled".asInstanceOf[ScalingActivityStatusCode]
    val Failed      = "Failed".asInstanceOf[ScalingActivityStatusCode]

    val values = js.Object.freeze(js.Array(Pending, InProgress, Successful, Overridden, Unfulfilled, Failed))
  }

  /**
    * Represents a scaling policy to use with Application Auto Scaling.
    */
  @js.native
  @Factory
  trait ScalingPolicy extends js.Object {
    var CreationTime: TimestampType
    var PolicyARN: ResourceIdMaxLen1600
    var PolicyName: PolicyName
    var PolicyType: PolicyType
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
    var Alarms: js.UndefOr[Alarms]
    var StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration]
  }

  /**
    * Represents a scheduled action.
    */
  @js.native
  @Factory
  trait ScheduledAction extends js.Object {
    var CreationTime: TimestampType
    var ResourceId: ResourceIdMaxLen1600
    var Schedule: ResourceIdMaxLen1600
    var ScheduledActionARN: ResourceIdMaxLen1600
    var ScheduledActionName: ScheduledActionName
    var ServiceNamespace: ServiceNamespace
    var EndTime: js.UndefOr[TimestampType]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ScalableTargetAction: js.UndefOr[ScalableTargetAction]
    var StartTime: js.UndefOr[TimestampType]
  }

  @js.native
  sealed trait ServiceNamespace extends js.Any
  object ServiceNamespace extends js.Object {
    val ecs               = "ecs".asInstanceOf[ServiceNamespace]
    val elasticmapreduce  = "elasticmapreduce".asInstanceOf[ServiceNamespace]
    val ec2               = "ec2".asInstanceOf[ServiceNamespace]
    val appstream         = "appstream".asInstanceOf[ServiceNamespace]
    val dynamodb          = "dynamodb".asInstanceOf[ServiceNamespace]
    val rds               = "rds".asInstanceOf[ServiceNamespace]
    val sagemaker         = "sagemaker".asInstanceOf[ServiceNamespace]
    val `custom-resource` = "custom-resource".asInstanceOf[ServiceNamespace]
    val comprehend        = "comprehend".asInstanceOf[ServiceNamespace]
    val lambda            = "lambda".asInstanceOf[ServiceNamespace]

    val values = js.Object.freeze(
      js.Array(ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, `custom-resource`, comprehend, lambda)
    )
  }

  /**
    * Represents a step adjustment for a <a>StepScalingPolicyConfiguration</a>. Describes an adjustment based on the difference between the value of the aggregated CloudWatch metric and the breach threshold that you've defined for the alarm.
    *  For the following examples, suppose that you have an alarm with a breach threshold of 50:
    * * To trigger the adjustment when the metric is greater than or equal to 50 and less than 60, specify a lower bound of 0 and an upper bound of 10.
    *  * To trigger the adjustment when the metric is greater than 40 and less than or equal to 50, specify a lower bound of -10 and an upper bound of 0.
    * There are a few rules for the step adjustments for your step policy:
    * * The ranges of your step adjustments can't overlap or have a gap.
    *  * At most one step adjustment can have a null lower bound. If one step adjustment has a negative lower bound, then there must be a step adjustment with a null lower bound.
    *  * At most one step adjustment can have a null upper bound. If one step adjustment has a positive upper bound, then there must be a step adjustment with a null upper bound.
    *  * The upper and lower bound can't be null in the same step adjustment.
    */
  @js.native
  @Factory
  trait StepAdjustment extends js.Object {
    var ScalingAdjustment: ScalingAdjustment
    var MetricIntervalLowerBound: js.UndefOr[MetricScale]
    var MetricIntervalUpperBound: js.UndefOr[MetricScale]
  }

  /**
    * Represents a step scaling policy configuration to use with Application Auto Scaling.
    */
  @js.native
  @Factory
  trait StepScalingPolicyConfiguration extends js.Object {
    var AdjustmentType: js.UndefOr[AdjustmentType]
    var Cooldown: js.UndefOr[Cooldown]
    var MetricAggregationType: js.UndefOr[MetricAggregationType]
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude]
    var StepAdjustments: js.UndefOr[StepAdjustments]
  }

  /**
    * Specifies whether the scaling activities for a scalable target are in a suspended state.
    */
  @js.native
  @Factory
  trait SuspendedState extends js.Object {
    var DynamicScalingInSuspended: js.UndefOr[ScalingSuspended]
    var DynamicScalingOutSuspended: js.UndefOr[ScalingSuspended]
    var ScheduledScalingSuspended: js.UndefOr[ScalingSuspended]
  }

  /**
    * Represents a target tracking scaling policy configuration to use with Application Auto Scaling.
    */
  @js.native
  @Factory
  trait TargetTrackingScalingPolicyConfiguration extends js.Object {
    var TargetValue: MetricScale
    var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification]
    var DisableScaleIn: js.UndefOr[DisableScaleIn]
    var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification]
    var ScaleInCooldown: js.UndefOr[Cooldown]
    var ScaleOutCooldown: js.UndefOr[Cooldown]
  }
}
