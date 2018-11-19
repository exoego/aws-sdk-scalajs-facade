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
   * <p>Represents a CloudWatch alarm associated with a scaling policy.</p>
   */
  @js.native
  trait Alarm extends js.Object {
    var AlarmName: js.UndefOr[ResourceId]
    var AlarmARN: js.UndefOr[ResourceId]
  }

  object Alarm {
    def apply(
      AlarmName: js.UndefOr[ResourceId] = js.undefined,
      AlarmARN: js.UndefOr[ResourceId] = js.undefined): Alarm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmName" -> AlarmName.map { x => x.asInstanceOf[js.Any] },
        "AlarmARN" -> AlarmARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alarm]
    }
  }

  /**
   * <p>Concurrent updates caused an exception, for example, if you request an update to an Application Auto Scaling resource that already has a pending update.</p>
   */
  @js.native
  trait ConcurrentUpdateExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Configures a customized metric for a target tracking policy.</p>
   */
  @js.native
  trait CustomizedMetricSpecification extends js.Object {
    var Dimensions: js.UndefOr[MetricDimensions]
    var Statistic: js.UndefOr[MetricStatistic]
    var Namespace: js.UndefOr[MetricNamespace]
    var Unit: js.UndefOr[MetricUnit]
    var MetricName: js.UndefOr[MetricName]
  }

  object CustomizedMetricSpecification {
    def apply(
      Dimensions: js.UndefOr[MetricDimensions] = js.undefined,
      Statistic: js.UndefOr[MetricStatistic] = js.undefined,
      Namespace: js.UndefOr[MetricNamespace] = js.undefined,
      Unit: js.UndefOr[MetricUnit] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): CustomizedMetricSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "Statistic" -> Statistic.map { x => x.asInstanceOf[js.Any] },
        "Namespace" -> Namespace.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomizedMetricSpecification]
    }
  }

  @js.native
  trait DeleteScalingPolicyRequest extends js.Object {
    var PolicyName: js.UndefOr[ResourceIdMaxLen1600]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  object DeleteScalingPolicyRequest {
    def apply(
      PolicyName: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined): DeleteScalingPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var ScheduledActionName: js.UndefOr[ResourceIdMaxLen1600]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  object DeleteScheduledActionRequest {
    def apply(
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      ScheduledActionName: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined): DeleteScheduledActionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionName" -> ScheduledActionName.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
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
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
  }

  object DeregisterScalableTargetRequest {
    def apply(
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined): DeregisterScalableTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var MaxResults: js.UndefOr[MaxResults]
    var ResourceIds: js.UndefOr[ResourceIdsMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScalableTargetsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ResourceIds: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeScalableTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ResourceIds" -> ResourceIds.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalableTargetsRequest]
    }
  }

  @js.native
  trait DescribeScalableTargetsResponse extends js.Object {
    var ScalableTargets: js.UndefOr[ScalableTargets]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScalableTargetsResponse {
    def apply(
      ScalableTargets: js.UndefOr[ScalableTargets] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeScalableTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScalableTargets" -> ScalableTargets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalableTargetsResponse]
    }
  }

  @js.native
  trait DescribeScalingActivitiesRequest extends js.Object {
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var MaxResults: js.UndefOr[MaxResults]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScalingActivitiesRequest {
    def apply(
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeScalingActivitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingActivitiesRequest]
    }
  }

  @js.native
  trait DescribeScalingActivitiesResponse extends js.Object {
    var ScalingActivities: js.UndefOr[ScalingActivities]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScalingActivitiesResponse {
    def apply(
      ScalingActivities: js.UndefOr[ScalingActivities] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeScalingActivitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScalingActivities" -> ScalingActivities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingActivitiesResponse]
    }
  }

  @js.native
  trait DescribeScalingPoliciesRequest extends js.Object {
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var PolicyNames: js.UndefOr[ResourceIdsMaxLen1600]
    var MaxResults: js.UndefOr[MaxResults]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScalingPoliciesRequest {
    def apply(
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      PolicyNames: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeScalingPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingPoliciesRequest]
    }
  }

  @js.native
  trait DescribeScalingPoliciesResponse extends js.Object {
    var ScalingPolicies: js.UndefOr[ScalingPolicies]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScalingPoliciesResponse {
    def apply(
      ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeScalingPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScalingPolicies" -> ScalingPolicies.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingPoliciesResponse]
    }
  }

  @js.native
  trait DescribeScheduledActionsRequest extends js.Object {
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var MaxResults: js.UndefOr[MaxResults]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var NextToken: js.UndefOr[XmlString]
    var ScheduledActionNames: js.UndefOr[ResourceIdsMaxLen1600]
  }

  object DescribeScheduledActionsRequest {
    def apply(
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScheduledActionNames: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined): DescribeScheduledActionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionNames" -> ScheduledActionNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledActionsRequest]
    }
  }

  @js.native
  trait DescribeScheduledActionsResponse extends js.Object {
    var ScheduledActions: js.UndefOr[ScheduledActions]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScheduledActionsResponse {
    def apply(
      ScheduledActions: js.UndefOr[ScheduledActions] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeScheduledActionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduledActions" -> ScheduledActions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledActionsResponse]
    }
  }

  /**
   * <p>Failed access to resources caused an exception. This exception is thrown when Application Auto Scaling is unable to retrieve the alarms associated with a scaling policy due to a client error, for example, if the role ARN specified for a scalable target does not have permission to call the CloudWatch <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarms.html">DescribeAlarms</a> on your behalf.</p>
   */
  @js.native
  trait FailedResourceAccessExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>The service encountered an internal error.</p>
   */
  @js.native
  trait InternalServiceExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>The next token supplied was invalid.</p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>A per-account resource limit is exceeded. For more information, see <a href="http://docs.aws.amazon.com/ApplicationAutoScaling/latest/userguide/application-auto-scaling-limits.html">Application Auto Scaling Limits</a>.</p>
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
   * <p>Describes the dimension of a metric.</p>
   */
  @js.native
  trait MetricDimension extends js.Object {
    var Name: js.UndefOr[MetricDimensionName]
    var Value: js.UndefOr[MetricDimensionValue]
  }

  object MetricDimension {
    def apply(
      Name: js.UndefOr[MetricDimensionName] = js.undefined,
      Value: js.UndefOr[MetricDimensionValue] = js.undefined): MetricDimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The specified object could not be found. For any operation that depends on the existence of a scalable target, this exception is thrown if the scalable target with the specified service namespace, resource ID, and scalable dimension does not exist. For any operation that deletes or deregisters a resource, this exception is thrown if the resource cannot be found.</p>
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
   * <p>Configures a predefined metric for a target tracking policy.</p>
   */
  @js.native
  trait PredefinedMetricSpecification extends js.Object {
    var PredefinedMetricType: js.UndefOr[MetricType]
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  object PredefinedMetricSpecification {
    def apply(
      PredefinedMetricType: js.UndefOr[MetricType] = js.undefined,
      ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined): PredefinedMetricSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PredefinedMetricType" -> PredefinedMetricType.map { x => x.asInstanceOf[js.Any] },
        "ResourceLabel" -> ResourceLabel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PredefinedMetricSpecification]
    }
  }

  @js.native
  trait PutScalingPolicyRequest extends js.Object {
    var PolicyType: js.UndefOr[PolicyType]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration]
    var PolicyName: js.UndefOr[PolicyName]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
  }

  object PutScalingPolicyRequest {
    def apply(
      PolicyType: js.UndefOr[PolicyType] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration] = js.undefined,
      TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined): PutScalingPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "StepScalingPolicyConfiguration" -> StepScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] },
        "TargetTrackingScalingPolicyConfiguration" -> TargetTrackingScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyRequest]
    }
  }

  @js.native
  trait PutScalingPolicyResponse extends js.Object {
    var PolicyARN: js.UndefOr[ResourceIdMaxLen1600]
    var Alarms: js.UndefOr[Alarms]
  }

  object PutScalingPolicyResponse {
    def apply(
      PolicyARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      Alarms: js.UndefOr[Alarms] = js.undefined): PutScalingPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyARN" -> PolicyARN.map { x => x.asInstanceOf[js.Any] },
        "Alarms" -> Alarms.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyResponse]
    }
  }

  @js.native
  trait PutScheduledActionRequest extends js.Object {
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var StartTime: js.UndefOr[TimestampType]
    var EndTime: js.UndefOr[TimestampType]
    var ScalableTargetAction: js.UndefOr[ScalableTargetAction]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var Schedule: js.UndefOr[ResourceIdMaxLen1600]
    var ScheduledActionName: js.UndefOr[ScheduledActionName]
  }

  object PutScheduledActionRequest {
    def apply(
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      ScalableTargetAction: js.UndefOr[ScalableTargetAction] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      Schedule: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScheduledActionName: js.UndefOr[ScheduledActionName] = js.undefined): PutScheduledActionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "ScalableTargetAction" -> ScalableTargetAction.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionName" -> ScheduledActionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var MinCapacity: js.UndefOr[ResourceCapacity]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var MaxCapacity: js.UndefOr[ResourceCapacity]
    var RoleARN: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
  }

  object RegisterScalableTargetRequest {
    def apply(
      MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
      RoleARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined): RegisterScalableTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinCapacity" -> MinCapacity.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "MaxCapacity" -> MaxCapacity.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents a scalable target.</p>
   */
  @js.native
  trait ScalableTarget extends js.Object {
    var MinCapacity: js.UndefOr[ResourceCapacity]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var MaxCapacity: js.UndefOr[ResourceCapacity]
    var RoleARN: js.UndefOr[ResourceIdMaxLen1600]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var CreationTime: js.UndefOr[TimestampType]
  }

  object ScalableTarget {
    def apply(
      MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
      RoleARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      CreationTime: js.UndefOr[TimestampType] = js.undefined): ScalableTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinCapacity" -> MinCapacity.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "MaxCapacity" -> MaxCapacity.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalableTarget]
    }
  }

  /**
   * <p>Represents the minimum and maximum capacity for a scheduled action.</p>
   */
  @js.native
  trait ScalableTargetAction extends js.Object {
    var MinCapacity: js.UndefOr[ResourceCapacity]
    var MaxCapacity: js.UndefOr[ResourceCapacity]
  }

  object ScalableTargetAction {
    def apply(
      MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
      MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined): ScalableTargetAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinCapacity" -> MinCapacity.map { x => x.asInstanceOf[js.Any] },
        "MaxCapacity" -> MaxCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalableTargetAction]
    }
  }

  /**
   * <p>Represents a scaling activity.</p>
   */
  @js.native
  trait ScalingActivity extends js.Object {
    var StatusMessage: js.UndefOr[XmlString]
    var Cause: js.UndefOr[XmlString]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var StatusCode: js.UndefOr[ScalingActivityStatusCode]
    var Description: js.UndefOr[XmlString]
    var StartTime: js.UndefOr[TimestampType]
    var EndTime: js.UndefOr[TimestampType]
    var Details: js.UndefOr[XmlString]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ActivityId: js.UndefOr[ResourceId]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
  }

  object ScalingActivity {
    def apply(
      StatusMessage: js.UndefOr[XmlString] = js.undefined,
      Cause: js.UndefOr[XmlString] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      StatusCode: js.UndefOr[ScalingActivityStatusCode] = js.undefined,
      Description: js.UndefOr[XmlString] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      Details: js.UndefOr[XmlString] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ActivityId: js.UndefOr[ResourceId] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined): ScalingActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Cause" -> Cause.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ActivityId" -> ActivityId.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents a scaling policy.</p>
   */
  @js.native
  trait ScalingPolicy extends js.Object {
    var PolicyType: js.UndefOr[PolicyType]
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration]
    var PolicyName: js.UndefOr[PolicyName]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var Alarms: js.UndefOr[Alarms]
    var PolicyARN: js.UndefOr[ResourceIdMaxLen1600]
    var CreationTime: js.UndefOr[TimestampType]
  }

  object ScalingPolicy {
    def apply(
      PolicyType: js.UndefOr[PolicyType] = js.undefined,
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration] = js.undefined,
      TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      Alarms: js.UndefOr[Alarms] = js.undefined,
      PolicyARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      CreationTime: js.UndefOr[TimestampType] = js.undefined): ScalingPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "StepScalingPolicyConfiguration" -> StepScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] },
        "TargetTrackingScalingPolicyConfiguration" -> TargetTrackingScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "Alarms" -> Alarms.map { x => x.asInstanceOf[js.Any] },
        "PolicyARN" -> PolicyARN.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingPolicy]
    }
  }

  /**
   * <p>Represents a scheduled action.</p>
   */
  @js.native
  trait ScheduledAction extends js.Object {
    var ResourceId: js.UndefOr[ResourceIdMaxLen1600]
    var ScheduledActionARN: js.UndefOr[ResourceIdMaxLen1600]
    var StartTime: js.UndefOr[TimestampType]
    var EndTime: js.UndefOr[TimestampType]
    var ScalableTargetAction: js.UndefOr[ScalableTargetAction]
    var ScalableDimension: js.UndefOr[ScalableDimension]
    var ServiceNamespace: js.UndefOr[ServiceNamespace]
    var Schedule: js.UndefOr[ResourceIdMaxLen1600]
    var ScheduledActionName: js.UndefOr[ScheduledActionName]
    var CreationTime: js.UndefOr[TimestampType]
  }

  object ScheduledAction {
    def apply(
      ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScheduledActionARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      ScalableTargetAction: js.UndefOr[ScalableTargetAction] = js.undefined,
      ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
      ServiceNamespace: js.UndefOr[ServiceNamespace] = js.undefined,
      Schedule: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
      ScheduledActionName: js.UndefOr[ScheduledActionName] = js.undefined,
      CreationTime: js.UndefOr[TimestampType] = js.undefined): ScheduledAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionARN" -> ScheduledActionARN.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "ScalableTargetAction" -> ScalableTargetAction.map { x => x.asInstanceOf[js.Any] },
        "ScalableDimension" -> ScalableDimension.map { x => x.asInstanceOf[js.Any] },
        "ServiceNamespace" -> ServiceNamespace.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionName" -> ScheduledActionName.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents a step adjustment for a <a>StepScalingPolicyConfiguration</a>. Describes an adjustment based on the difference between the value of the aggregated CloudWatch metric and the breach threshold that you've defined for the alarm. </p> <p>For the following examples, suppose that you have an alarm with a breach threshold of 50:</p> <ul> <li> <p>To trigger the adjustment when the metric is greater than or equal to 50 and less than 60, specify a lower bound of 0 and an upper bound of 10.</p> </li> <li> <p>To trigger the adjustment when the metric is greater than 40 and less than or equal to 50, specify a lower bound of -10 and an upper bound of 0.</p> </li> </ul> <p>There are a few rules for the step adjustments for your step policy:</p> <ul> <li> <p>The ranges of your step adjustments can't overlap or have a gap.</p> </li> <li> <p>At most one step adjustment can have a null lower bound. If one step adjustment has a negative lower bound, then there must be a step adjustment with a null lower bound.</p> </li> <li> <p>At most one step adjustment can have a null upper bound. If one step adjustment has a positive upper bound, then there must be a step adjustment with a null upper bound.</p> </li> <li> <p>The upper and lower bound can't be null in the same step adjustment.</p> </li> </ul>
   */
  @js.native
  trait StepAdjustment extends js.Object {
    var MetricIntervalLowerBound: js.UndefOr[MetricScale]
    var MetricIntervalUpperBound: js.UndefOr[MetricScale]
    var ScalingAdjustment: js.UndefOr[ScalingAdjustment]
  }

  object StepAdjustment {
    def apply(
      MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.undefined,
      MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.undefined,
      ScalingAdjustment: js.UndefOr[ScalingAdjustment] = js.undefined): StepAdjustment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricIntervalLowerBound" -> MetricIntervalLowerBound.map { x => x.asInstanceOf[js.Any] },
        "MetricIntervalUpperBound" -> MetricIntervalUpperBound.map { x => x.asInstanceOf[js.Any] },
        "ScalingAdjustment" -> ScalingAdjustment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepAdjustment]
    }
  }

  /**
   * <p>Represents a step scaling policy configuration.</p>
   */
  @js.native
  trait StepScalingPolicyConfiguration extends js.Object {
    var MetricAggregationType: js.UndefOr[MetricAggregationType]
    var Cooldown: js.UndefOr[Cooldown]
    var StepAdjustments: js.UndefOr[StepAdjustments]
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude]
    var AdjustmentType: js.UndefOr[AdjustmentType]
  }

  object StepScalingPolicyConfiguration {
    def apply(
      MetricAggregationType: js.UndefOr[MetricAggregationType] = js.undefined,
      Cooldown: js.UndefOr[Cooldown] = js.undefined,
      StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined,
      MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
      AdjustmentType: js.UndefOr[AdjustmentType] = js.undefined): StepScalingPolicyConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricAggregationType" -> MetricAggregationType.map { x => x.asInstanceOf[js.Any] },
        "Cooldown" -> Cooldown.map { x => x.asInstanceOf[js.Any] },
        "StepAdjustments" -> StepAdjustments.map { x => x.asInstanceOf[js.Any] },
        "MinAdjustmentMagnitude" -> MinAdjustmentMagnitude.map { x => x.asInstanceOf[js.Any] },
        "AdjustmentType" -> AdjustmentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepScalingPolicyConfiguration]
    }
  }

  /**
   * <p>Represents a target tracking scaling policy configuration.</p>
   */
  @js.native
  trait TargetTrackingScalingPolicyConfiguration extends js.Object {
    var DisableScaleIn: js.UndefOr[DisableScaleIn]
    var TargetValue: js.UndefOr[MetricScale]
    var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification]
    var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification]
    var ScaleInCooldown: js.UndefOr[Cooldown]
    var ScaleOutCooldown: js.UndefOr[Cooldown]
  }

  object TargetTrackingScalingPolicyConfiguration {
    def apply(
      DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
      TargetValue: js.UndefOr[MetricScale] = js.undefined,
      CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification] = js.undefined,
      PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined,
      ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined,
      ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined): TargetTrackingScalingPolicyConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisableScaleIn" -> DisableScaleIn.map { x => x.asInstanceOf[js.Any] },
        "TargetValue" -> TargetValue.map { x => x.asInstanceOf[js.Any] },
        "CustomizedMetricSpecification" -> CustomizedMetricSpecification.map { x => x.asInstanceOf[js.Any] },
        "PredefinedMetricSpecification" -> PredefinedMetricSpecification.map { x => x.asInstanceOf[js.Any] },
        "ScaleInCooldown" -> ScaleInCooldown.map { x => x.asInstanceOf[js.Any] },
        "ScaleOutCooldown" -> ScaleOutCooldown.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetTrackingScalingPolicyConfiguration]
    }
  }

  /**
   * <p>An exception was thrown for a validation issue. Review the available parameters for the API request.</p>
   */
  @js.native
  trait ValidationExceptionException extends js.Object {
    val Message: ErrorMessage
  }
}
