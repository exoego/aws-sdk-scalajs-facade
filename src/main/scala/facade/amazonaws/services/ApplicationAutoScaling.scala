package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object applicationautoscaling {
  type AdjustmentType = String
  type Alarms = js.Array[Alarm]
  type Cooldown = Int
  type DisableScaleIn = Boolean
  type ErrorMessage = String
  type MaxResults = Int
  type MetricAggregationType = String
  type MetricDimensionName = String
  type MetricDimensionValue = String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricName = String
  type MetricNamespace = String
  type MetricScale = Double
  type MetricStatistic = String
  type MetricType = String
  type MetricUnit = String
  type MinAdjustmentMagnitude = Int
  type PolicyName = String
  type PolicyType = String
  type ResourceCapacity = Int
  type ResourceId = String
  type ResourceIdMaxLen1600 = String
  type ResourceIdsMaxLen1600 = js.Array[ResourceIdMaxLen1600]
  type ResourceLabel = String
  type ScalableDimension = String
  type ScalableTargets = js.Array[ScalableTarget]
  type ScalingActivities = js.Array[ScalingActivity]
  type ScalingActivityStatusCode = String
  type ScalingAdjustment = Int
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionName = String
  type ScheduledActions = js.Array[ScheduledAction]
  type ServiceNamespace = String
  type StepAdjustments = js.Array[StepAdjustment]
  type TimestampType = js.Date
  type XmlString = String
}

package applicationautoscaling {
  @js.native
  @JSImport("aws-sdk", "ApplicationAutoScaling")
  class ApplicationAutoScaling(config: AWSConfig) extends js.Object {
    def deleteScalingPolicy(params: DeleteScalingPolicyRequest): Request[DeleteScalingPolicyResponse] = js.native
    def deleteScheduledAction(params: DeleteScheduledActionRequest): Request[DeleteScheduledActionResponse] = js.native
    def deregisterScalableTarget(params: DeregisterScalableTargetRequest): Request[DeregisterScalableTargetResponse] = js.native
    def describeScalableTargets(params: DescribeScalableTargetsRequest): Request[DescribeScalableTargetsResponse] = js.native
    def describeScalingActivities(params: DescribeScalingActivitiesRequest): Request[DescribeScalingActivitiesResponse] = js.native
    def describeScalingPolicies(params: DescribeScalingPoliciesRequest): Request[DescribeScalingPoliciesResponse] = js.native
    def describeScheduledActions(params: DescribeScheduledActionsRequest): Request[DescribeScheduledActionsResponse] = js.native
    def putScalingPolicy(params: PutScalingPolicyRequest): Request[PutScalingPolicyResponse] = js.native
    def putScheduledAction(params: PutScheduledActionRequest): Request[PutScheduledActionResponse] = js.native
    def registerScalableTarget(params: RegisterScalableTargetRequest): Request[RegisterScalableTargetResponse] = js.native
  }

  object AdjustmentTypeEnum {
    val ChangeInCapacity = "ChangeInCapacity"
    val PercentChangeInCapacity = "PercentChangeInCapacity"
    val ExactCapacity = "ExactCapacity"

    val values = IndexedSeq(ChangeInCapacity, PercentChangeInCapacity, ExactCapacity)
  }

  /**
   * Represents a CloudWatch alarm associated with a scaling policy.
   */
  @js.native
  trait Alarm extends js.Object {
    var AlarmARN: ResourceId
    var AlarmName: ResourceId
  }

  object Alarm {
    def apply(
      AlarmARN: ResourceId,
      AlarmName: ResourceId): Alarm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmARN" -> AlarmARN.asInstanceOf[js.Any],
        "AlarmName" -> AlarmName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alarm]
    }
  }

  /**
   * Concurrent updates caused an exception, for example, if you request an update to an Application Auto Scaling resource that already has a pending update.
   */
  @js.native
  trait ConcurrentUpdateExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * Configures a customized metric for a target tracking policy.
   */
  @js.native
  trait CustomizedMetricSpecification extends js.Object {
    var MetricName: MetricName
    var Namespace: MetricNamespace
    var Statistic: MetricStatistic
    var Dimensions: js.UndefOr[MetricDimensions]
    var Unit: js.UndefOr[MetricUnit]
  }

  object CustomizedMetricSpecification {
    def apply(
      MetricName: MetricName,
      Namespace: MetricNamespace,
      Statistic: MetricStatistic,
      Dimensions: js.UndefOr[MetricDimensions] = js.undefined,
      Unit: js.UndefOr[MetricUnit] = js.undefined): CustomizedMetricSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Statistic" -> Statistic.asInstanceOf[js.Any],
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomizedMetricSpecification]
    }
  }

  @js.native
  trait DeleteScalingPolicyRequest extends js.Object {
    var PolicyName: ResourceIdMaxLen1600
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
  }

  object DeleteScalingPolicyRequest {
    def apply(
      PolicyName: ResourceIdMaxLen1600,
      ResourceId: ResourceIdMaxLen1600,
      ScalableDimension: ScalableDimension,
      ServiceNamespace: ServiceNamespace): DeleteScalingPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScalingPolicyRequest]
    }
  }

  @js.native
  trait DeleteScalingPolicyResponse extends js.Object {

  }

  object DeleteScalingPolicyResponse {
    def apply(): DeleteScalingPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScalingPolicyResponse]
    }
  }

  @js.native
  trait DeleteScheduledActionRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScheduledActionName: ResourceIdMaxLen1600
    var ServiceNamespace: ServiceNamespace
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  object DeleteScheduledActionRequest {
    def apply(
      ResourceId: ResourceIdMaxLen1600,
      ScheduledActionName: ResourceIdMaxLen1600,
      ServiceNamespace: ServiceNamespace,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined): DeleteScheduledActionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScheduledActionRequest]
    }
  }

  @js.native
  trait DeleteScheduledActionResponse extends js.Object {

  }

  object DeleteScheduledActionResponse {
    def apply(): DeleteScheduledActionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScheduledActionResponse]
    }
  }

  @js.native
  trait DeregisterScalableTargetRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
  }

  object DeregisterScalableTargetRequest {
    def apply(
      ResourceId: ResourceIdMaxLen1600,
      ScalableDimension: ScalableDimension,
      ServiceNamespace: ServiceNamespace): DeregisterScalableTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterScalableTargetRequest]
    }
  }

  @js.native
  trait DeregisterScalableTargetResponse extends js.Object {

  }

  object DeregisterScalableTargetResponse {
    def apply(): DeregisterScalableTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterScalableTargetResponse]
    }
  }

  @js.native
  trait DescribeScalableTargetsRequest extends js.Object {
    var ServiceNamespace: ServiceNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[XmlString]
    var ResourceIds: js.UndefOr[ResourceIdsMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  object DescribeScalableTargetsRequest {
    def apply(
      ServiceNamespace: ServiceNamespace,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ResourceIds: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined): DescribeScalableTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceIds" -> ResourceIds.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalableTargetsRequest]
    }
  }

  @js.native
  trait DescribeScalableTargetsResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalableTargets: js.UndefOr[ScalableTargets]
  }

  object DescribeScalableTargetsResponse {
    def apply(
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScalableTargets: js.UndefOr[ScalableTargets] = js.undefined): DescribeScalableTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScalableTargets" -> ScalableTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalableTargetsResponse]
    }
  }

  @js.native
  trait DescribeScalingActivitiesRequest extends js.Object {
    var ServiceNamespace: ServiceNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[XmlString]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  object DescribeScalingActivitiesRequest {
    def apply(
      ServiceNamespace: ServiceNamespace,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined): DescribeScalingActivitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingActivitiesRequest]
    }
  }

  @js.native
  trait DescribeScalingActivitiesResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingActivities: js.UndefOr[ScalingActivities]
  }

  object DescribeScalingActivitiesResponse {
    def apply(
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScalingActivities: js.UndefOr[ScalingActivities] = js.undefined): DescribeScalingActivitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScalingActivities" -> ScalingActivities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingActivitiesResponse]
    }
  }

  @js.native
  trait DescribeScalingPoliciesRequest extends js.Object {
    var ServiceNamespace: ServiceNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[XmlString]
    var PolicyNames: js.UndefOr[ResourceIdsMaxLen1600]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  object DescribeScalingPoliciesRequest {
    def apply(
      ServiceNamespace: ServiceNamespace,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      PolicyNames: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined): DescribeScalingPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingPoliciesRequest]
    }
  }

  @js.native
  trait DescribeScalingPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingPolicies: js.UndefOr[ScalingPolicies]
  }

  object DescribeScalingPoliciesResponse {
    def apply(
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined): DescribeScalingPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScalingPolicies" -> ScalingPolicies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingPoliciesResponse]
    }
  }

  @js.native
  trait DescribeScheduledActionsRequest extends js.Object {
    var ServiceNamespace: ServiceNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[XmlString]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ScheduledActionNames: js.UndefOr[ResourceIdsMaxLen1600]
  }

  object DescribeScheduledActionsRequest {
    def apply(
      ServiceNamespace: ServiceNamespace,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ScheduledActionNames: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined): DescribeScheduledActionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionNames" -> ScheduledActionNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledActionsRequest]
    }
  }

  @js.native
  trait DescribeScheduledActionsResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScheduledActions: js.UndefOr[ScheduledActions]
  }

  object DescribeScheduledActionsResponse {
    def apply(
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScheduledActions: js.UndefOr[ScheduledActions] = js.undefined): DescribeScheduledActionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActions" -> ScheduledActions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledActionsResponse]
    }
  }

  /**
   * Failed access to resources caused an exception. This exception is thrown when Application Auto Scaling is unable to retrieve the alarms associated with a scaling policy due to a client error, for example, if the role ARN specified for a scalable target does not have permission to call the CloudWatch <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarms.html">DescribeAlarms</a> on your behalf.
   */
  @js.native
  trait FailedResourceAccessExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * The service encountered an internal error.
   */
  @js.native
  trait InternalServiceExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * The next token supplied was invalid.
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * A per-account resource limit is exceeded. For more information, see <a href="http://docs.aws.amazon.com/ApplicationAutoScaling/latest/userguide/application-auto-scaling-limits.html">Application Auto Scaling Limits</a>.
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object MetricAggregationTypeEnum {
    val Average = "Average"
    val Minimum = "Minimum"
    val Maximum = "Maximum"

    val values = IndexedSeq(Average, Minimum, Maximum)
  }

  /**
   * Describes the dimension of a metric.
   */
  @js.native
  trait MetricDimension extends js.Object {
    var Name: MetricDimensionName
    var Value: MetricDimensionValue
  }

  object MetricDimension {
    def apply(
      Name: MetricDimensionName,
      Value: MetricDimensionValue): MetricDimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDimension]
    }
  }

  object MetricStatisticEnum {
    val Average = "Average"
    val Minimum = "Minimum"
    val Maximum = "Maximum"
    val SampleCount = "SampleCount"
    val Sum = "Sum"

    val values = IndexedSeq(Average, Minimum, Maximum, SampleCount, Sum)
  }

  object MetricTypeEnum {
    val DynamoDBReadCapacityUtilization = "DynamoDBReadCapacityUtilization"
    val DynamoDBWriteCapacityUtilization = "DynamoDBWriteCapacityUtilization"
    val ALBRequestCountPerTarget = "ALBRequestCountPerTarget"
    val RDSReaderAverageCPUUtilization = "RDSReaderAverageCPUUtilization"
    val RDSReaderAverageDatabaseConnections = "RDSReaderAverageDatabaseConnections"
    val EC2SpotFleetRequestAverageCPUUtilization = "EC2SpotFleetRequestAverageCPUUtilization"
    val EC2SpotFleetRequestAverageNetworkIn = "EC2SpotFleetRequestAverageNetworkIn"
    val EC2SpotFleetRequestAverageNetworkOut = "EC2SpotFleetRequestAverageNetworkOut"
    val SageMakerVariantInvocationsPerInstance = "SageMakerVariantInvocationsPerInstance"
    val ECSServiceAverageCPUUtilization = "ECSServiceAverageCPUUtilization"
    val ECSServiceAverageMemoryUtilization = "ECSServiceAverageMemoryUtilization"

    val values = IndexedSeq(DynamoDBReadCapacityUtilization, DynamoDBWriteCapacityUtilization, ALBRequestCountPerTarget, RDSReaderAverageCPUUtilization, RDSReaderAverageDatabaseConnections, EC2SpotFleetRequestAverageCPUUtilization, EC2SpotFleetRequestAverageNetworkIn, EC2SpotFleetRequestAverageNetworkOut, SageMakerVariantInvocationsPerInstance, ECSServiceAverageCPUUtilization, ECSServiceAverageMemoryUtilization)
  }

  /**
   * The specified object could not be found. For any operation that depends on the existence of a scalable target, this exception is thrown if the scalable target with the specified service namespace, resource ID, and scalable dimension does not exist. For any operation that deletes or deregisters a resource, this exception is thrown if the resource cannot be found.
   */
  @js.native
  trait ObjectNotFoundExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object PolicyTypeEnum {
    val StepScaling = "StepScaling"
    val TargetTrackingScaling = "TargetTrackingScaling"

    val values = IndexedSeq(StepScaling, TargetTrackingScaling)
  }

  /**
   * Configures a predefined metric for a target tracking policy.
   */
  @js.native
  trait PredefinedMetricSpecification extends js.Object {
    var PredefinedMetricType: MetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  object PredefinedMetricSpecification {
    def apply(
      PredefinedMetricType: MetricType,
      ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined): PredefinedMetricSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PredefinedMetricType" -> PredefinedMetricType.asInstanceOf[js.Any],
        "ResourceLabel" -> ResourceLabel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PredefinedMetricSpecification]
    }
  }

  @js.native
  trait PutScalingPolicyRequest extends js.Object {
    var PolicyName: PolicyName
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
    var PolicyType: js.UndefOr[PolicyType]
    var StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration]
  }

  object PutScalingPolicyRequest {
    def apply(
      PolicyName: PolicyName,
      ResourceId: ResourceIdMaxLen1600,
      ScalableDimension: ScalableDimension,
      ServiceNamespace: ServiceNamespace,
      PolicyType: js.UndefOr[PolicyType] = js.undefined,
      StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration] = js.undefined,
      TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration] = js.undefined): PutScalingPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] },
        "StepScalingPolicyConfiguration" -> StepScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] },
        "TargetTrackingScalingPolicyConfiguration" -> TargetTrackingScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyRequest]
    }
  }

  @js.native
  trait PutScalingPolicyResponse extends js.Object {
    var PolicyARN: ResourceIdMaxLen1600
    var Alarms: js.UndefOr[Alarms]
  }

  object PutScalingPolicyResponse {
    def apply(
      PolicyARN: ResourceIdMaxLen1600,
      Alarms: js.UndefOr[Alarms] = js.undefined): PutScalingPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyARN" -> PolicyARN.asInstanceOf[js.Any],
        "Alarms" -> Alarms.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyResponse]
    }
  }

  @js.native
  trait PutScheduledActionRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScheduledActionName: ScheduledActionName
    var ServiceNamespace: ServiceNamespace
    var EndTime: js.UndefOr[TimestampType]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ScalableTargetAction: js.UndefOr[ScalableTargetAction]
    var Schedule: js.UndefOr[ResourceIdMaxLen1600]
    var StartTime: js.UndefOr[TimestampType]
  }

  object PutScheduledActionRequest {
    def apply(
      ResourceId: ResourceIdMaxLen1600,
      ScheduledActionName: ScheduledActionName,
      ServiceNamespace: ServiceNamespace,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ScalableTargetAction: js.UndefOr[ScalableTargetAction] = js.undefined,
      Schedule: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined): PutScheduledActionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ScalableTargetAction" -> ScalableTargetAction.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScheduledActionRequest]
    }
  }

  @js.native
  trait PutScheduledActionResponse extends js.Object {

  }

  object PutScheduledActionResponse {
    def apply(): PutScheduledActionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScheduledActionResponse]
    }
  }

  @js.native
  trait RegisterScalableTargetRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
    var MaxCapacity: js.UndefOr[ResourceCapacity]
    var MinCapacity: js.UndefOr[ResourceCapacity]
    var RoleARN: js.UndefOr[ResourceIdMaxLen1600]
  }

  object RegisterScalableTargetRequest {
    def apply(
      ResourceId: ResourceIdMaxLen1600,
      ScalableDimension: ScalableDimension,
      ServiceNamespace: ServiceNamespace,
      MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
      MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
      RoleARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined): RegisterScalableTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "MaxCapacity" -> MaxCapacity.map { x => x.asInstanceOf[js.Any] },
        "MinCapacity" -> MinCapacity.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterScalableTargetRequest]
    }
  }

  @js.native
  trait RegisterScalableTargetResponse extends js.Object {

  }

  object RegisterScalableTargetResponse {
    def apply(): RegisterScalableTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterScalableTargetResponse]
    }
  }

  object ScalableDimensionEnum {
    val `ecs:service:DesiredCount` = "ecs:service:DesiredCount"
    val `ec2:spot-fleet-request:TargetCapacity` = "ec2:spot-fleet-request:TargetCapacity"
    val `elasticmapreduce:instancegroup:InstanceCount` = "elasticmapreduce:instancegroup:InstanceCount"
    val `appstream:fleet:DesiredCapacity` = "appstream:fleet:DesiredCapacity"
    val `dynamodb:table:ReadCapacityUnits` = "dynamodb:table:ReadCapacityUnits"
    val `dynamodb:table:WriteCapacityUnits` = "dynamodb:table:WriteCapacityUnits"
    val `dynamodb:index:ReadCapacityUnits` = "dynamodb:index:ReadCapacityUnits"
    val `dynamodb:index:WriteCapacityUnits` = "dynamodb:index:WriteCapacityUnits"
    val `rds:cluster:ReadReplicaCount` = "rds:cluster:ReadReplicaCount"
    val `sagemaker:variant:DesiredInstanceCount` = "sagemaker:variant:DesiredInstanceCount"
    val `custom-resource:ResourceType:Property` = "custom-resource:ResourceType:Property"

    val values = IndexedSeq(`ecs:service:DesiredCount`, `ec2:spot-fleet-request:TargetCapacity`, `elasticmapreduce:instancegroup:InstanceCount`, `appstream:fleet:DesiredCapacity`, `dynamodb:table:ReadCapacityUnits`, `dynamodb:table:WriteCapacityUnits`, `dynamodb:index:ReadCapacityUnits`, `dynamodb:index:WriteCapacityUnits`, `rds:cluster:ReadReplicaCount`, `sagemaker:variant:DesiredInstanceCount`, `custom-resource:ResourceType:Property`)
  }

  /**
   * Represents a scalable target.
   */
  @js.native
  trait ScalableTarget extends js.Object {
    var CreationTime: TimestampType
    var MaxCapacity: ResourceCapacity
    var MinCapacity: ResourceCapacity
    var ResourceId: ResourceIdMaxLen1600
    var RoleARN: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
  }

  object ScalableTarget {
    def apply(
      CreationTime: TimestampType,
      MaxCapacity: ResourceCapacity,
      MinCapacity: ResourceCapacity,
      ResourceId: ResourceIdMaxLen1600,
      RoleARN: ResourceIdMaxLen1600,
      ScalableDimension: ScalableDimension,
      ServiceNamespace: ServiceNamespace): ScalableTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "MaxCapacity" -> MaxCapacity.asInstanceOf[js.Any],
        "MinCapacity" -> MinCapacity.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalableTarget]
    }
  }

  /**
   * Represents the minimum and maximum capacity for a scheduled action.
   */
  @js.native
  trait ScalableTargetAction extends js.Object {
    var MaxCapacity: js.UndefOr[ResourceCapacity]
    var MinCapacity: js.UndefOr[ResourceCapacity]
  }

  object ScalableTargetAction {
    def apply(
      MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
      MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined): ScalableTargetAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxCapacity" -> MaxCapacity.map { x => x.asInstanceOf[js.Any] },
        "MinCapacity" -> MinCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalableTargetAction]
    }
  }

  /**
   * Represents a scaling activity.
   */
  @js.native
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

  object ScalingActivity {
    def apply(
      ActivityId: ResourceId,
      Cause: XmlString,
      Description: XmlString,
      ResourceId: ResourceIdMaxLen1600,
      ScalableDimension: ScalableDimension,
      ServiceNamespace: ServiceNamespace,
      StartTime: TimestampType,
      StatusCode: ScalingActivityStatusCode,
      Details: js.UndefOr[XmlString] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      StatusMessage: js.UndefOr[XmlString] = js.undefined): ScalingActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivityId" -> ActivityId.asInstanceOf[js.Any],
        "Cause" -> Cause.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any],
        "StatusCode" -> StatusCode.asInstanceOf[js.Any],
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingActivity]
    }
  }

  object ScalingActivityStatusCodeEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Successful = "Successful"
    val Overridden = "Overridden"
    val Unfulfilled = "Unfulfilled"
    val Failed = "Failed"

    val values = IndexedSeq(Pending, InProgress, Successful, Overridden, Unfulfilled, Failed)
  }

  /**
   * Represents a scaling policy.
   */
  @js.native
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

  object ScalingPolicy {
    def apply(
      CreationTime: TimestampType,
      PolicyARN: ResourceIdMaxLen1600,
      PolicyName: PolicyName,
      PolicyType: PolicyType,
      ResourceId: ResourceIdMaxLen1600,
      ScalableDimension: ScalableDimension,
      ServiceNamespace: ServiceNamespace,
      Alarms: js.UndefOr[Alarms] = js.undefined,
      StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration] = js.undefined,
      TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration] = js.undefined): ScalingPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "PolicyARN" -> PolicyARN.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "PolicyType" -> PolicyType.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "Alarms" -> Alarms.map { x => x.asInstanceOf[js.Any] },
        "StepScalingPolicyConfiguration" -> StepScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] },
        "TargetTrackingScalingPolicyConfiguration" -> TargetTrackingScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingPolicy]
    }
  }

  /**
   * Represents a scheduled action.
   */
  @js.native
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

  object ScheduledAction {
    def apply(
      CreationTime: TimestampType,
      ResourceId: ResourceIdMaxLen1600,
      Schedule: ResourceIdMaxLen1600,
      ScheduledActionARN: ResourceIdMaxLen1600,
      ScheduledActionName: ScheduledActionName,
      ServiceNamespace: ServiceNamespace,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ScalableTargetAction: js.UndefOr[ScalableTargetAction] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined): ScheduledAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Schedule" -> Schedule.asInstanceOf[js.Any],
        "ScheduledActionARN" -> ScheduledActionARN.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ScalableTargetAction" -> ScalableTargetAction.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledAction]
    }
  }

  object ServiceNamespaceEnum {
    val ecs = "ecs"
    val elasticmapreduce = "elasticmapreduce"
    val ec2 = "ec2"
    val appstream = "appstream"
    val dynamodb = "dynamodb"
    val rds = "rds"
    val sagemaker = "sagemaker"
    val `custom-resource` = "custom-resource"

    val values = IndexedSeq(ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, `custom-resource`)
  }

  /**
   * Represents a step adjustment for a '''StepScalingPolicyConfiguration'''. Describes an adjustment based on the difference between the value of the aggregated CloudWatch metric and the breach threshold that you've defined for the alarm.
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
  trait StepAdjustment extends js.Object {
    var ScalingAdjustment: ScalingAdjustment
    var MetricIntervalLowerBound: js.UndefOr[MetricScale]
    var MetricIntervalUpperBound: js.UndefOr[MetricScale]
  }

  object StepAdjustment {
    def apply(
      ScalingAdjustment: ScalingAdjustment,
      MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.undefined,
      MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.undefined): StepAdjustment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScalingAdjustment" -> ScalingAdjustment.asInstanceOf[js.Any],
        "MetricIntervalLowerBound" -> MetricIntervalLowerBound.map { x => x.asInstanceOf[js.Any] },
        "MetricIntervalUpperBound" -> MetricIntervalUpperBound.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepAdjustment]
    }
  }

  /**
   * Represents a step scaling policy configuration.
   */
  @js.native
  trait StepScalingPolicyConfiguration extends js.Object {
    var AdjustmentType: js.UndefOr[AdjustmentType]
    var Cooldown: js.UndefOr[Cooldown]
    var MetricAggregationType: js.UndefOr[MetricAggregationType]
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude]
    var StepAdjustments: js.UndefOr[StepAdjustments]
  }

  object StepScalingPolicyConfiguration {
    def apply(
      AdjustmentType: js.UndefOr[AdjustmentType] = js.undefined,
      Cooldown: js.UndefOr[Cooldown] = js.undefined,
      MetricAggregationType: js.UndefOr[MetricAggregationType] = js.undefined,
      MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
      StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined): StepScalingPolicyConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdjustmentType" -> AdjustmentType.map { x => x.asInstanceOf[js.Any] },
        "Cooldown" -> Cooldown.map { x => x.asInstanceOf[js.Any] },
        "MetricAggregationType" -> MetricAggregationType.map { x => x.asInstanceOf[js.Any] },
        "MinAdjustmentMagnitude" -> MinAdjustmentMagnitude.map { x => x.asInstanceOf[js.Any] },
        "StepAdjustments" -> StepAdjustments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepScalingPolicyConfiguration]
    }
  }

  /**
   * Represents a target tracking scaling policy configuration.
   */
  @js.native
  trait TargetTrackingScalingPolicyConfiguration extends js.Object {
    var TargetValue: MetricScale
    var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification]
    var DisableScaleIn: js.UndefOr[DisableScaleIn]
    var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification]
    var ScaleInCooldown: js.UndefOr[Cooldown]
    var ScaleOutCooldown: js.UndefOr[Cooldown]
  }

  object TargetTrackingScalingPolicyConfiguration {
    def apply(
      TargetValue: MetricScale,
      CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification] = js.undefined,
      DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
      PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined,
      ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined,
      ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined): TargetTrackingScalingPolicyConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetValue" -> TargetValue.asInstanceOf[js.Any],
        "CustomizedMetricSpecification" -> CustomizedMetricSpecification.map { x => x.asInstanceOf[js.Any] },
        "DisableScaleIn" -> DisableScaleIn.map { x => x.asInstanceOf[js.Any] },
        "PredefinedMetricSpecification" -> PredefinedMetricSpecification.map { x => x.asInstanceOf[js.Any] },
        "ScaleInCooldown" -> ScaleInCooldown.map { x => x.asInstanceOf[js.Any] },
        "ScaleOutCooldown" -> ScaleOutCooldown.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetTrackingScalingPolicyConfiguration]
    }
  }

  /**
   * An exception was thrown for a validation issue. Review the available parameters for the API request.
   */
  @js.native
  trait ValidationExceptionException extends js.Object {
    val Message: ErrorMessage
  }
}
