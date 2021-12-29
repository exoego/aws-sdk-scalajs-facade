package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object applicationautoscaling {
  type Alarms = js.Array[Alarm]
  type Cooldown = Int
  type DisableScaleIn = Boolean
  type MaxResults = Int
  type MetricDimensionName = String
  type MetricDimensionValue = String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricName = String
  type MetricNamespace = String
  type MetricScale = Double
  type MetricUnit = String
  type MinAdjustmentMagnitude = Int
  type PolicyName = String
  type ResourceCapacity = Int
  type ResourceId = String
  type ResourceIdMaxLen1600 = String
  type ResourceIdsMaxLen1600 = js.Array[ResourceIdMaxLen1600]
  type ResourceLabel = String
  type ScalableTargets = js.Array[ScalableTarget]
  type ScalingActivities = js.Array[ScalingActivity]
  type ScalingAdjustment = Int
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScalingSuspended = Boolean
  type ScheduledActionName = String
  type ScheduledActions = js.Array[ScheduledAction]
  type StepAdjustments = js.Array[StepAdjustment]
  type TimestampType = js.Date
  type XmlString = String

  final class ApplicationAutoScalingOps(private val service: ApplicationAutoScaling) extends AnyVal {

    @inline def deleteScalingPolicyFuture(params: DeleteScalingPolicyRequest): Future[DeleteScalingPolicyResponse] = service.deleteScalingPolicy(params).promise().toFuture
    @inline def deleteScheduledActionFuture(params: DeleteScheduledActionRequest): Future[DeleteScheduledActionResponse] = service.deleteScheduledAction(params).promise().toFuture
    @inline def deregisterScalableTargetFuture(params: DeregisterScalableTargetRequest): Future[DeregisterScalableTargetResponse] = service.deregisterScalableTarget(params).promise().toFuture
    @inline def describeScalableTargetsFuture(params: DescribeScalableTargetsRequest): Future[DescribeScalableTargetsResponse] = service.describeScalableTargets(params).promise().toFuture
    @inline def describeScalingActivitiesFuture(params: DescribeScalingActivitiesRequest): Future[DescribeScalingActivitiesResponse] = service.describeScalingActivities(params).promise().toFuture
    @inline def describeScalingPoliciesFuture(params: DescribeScalingPoliciesRequest): Future[DescribeScalingPoliciesResponse] = service.describeScalingPolicies(params).promise().toFuture
    @inline def describeScheduledActionsFuture(params: DescribeScheduledActionsRequest): Future[DescribeScheduledActionsResponse] = service.describeScheduledActions(params).promise().toFuture
    @inline def putScalingPolicyFuture(params: PutScalingPolicyRequest): Future[PutScalingPolicyResponse] = service.putScalingPolicy(params).promise().toFuture
    @inline def putScheduledActionFuture(params: PutScheduledActionRequest): Future[PutScheduledActionResponse] = service.putScheduledAction(params).promise().toFuture
    @inline def registerScalableTargetFuture(params: RegisterScalableTargetRequest): Future[RegisterScalableTargetResponse] = service.registerScalableTarget(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/applicationautoscaling", JSImport.Namespace, "AWS.ApplicationAutoScaling")
  class ApplicationAutoScaling() extends js.Object {
    def this(config: AWSConfig) = this()

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
  object ApplicationAutoScaling {
    @inline implicit def toOps(service: ApplicationAutoScaling): ApplicationAutoScalingOps = {
      new ApplicationAutoScalingOps(service)
    }
  }

  /** Represents a CloudWatch alarm associated with a scaling policy.
    */
  @js.native
  trait Alarm extends js.Object {
    var AlarmARN: ResourceId
    var AlarmName: ResourceId
  }

  object Alarm {
    @inline
    def apply(
        AlarmARN: ResourceId,
        AlarmName: ResourceId
    ): Alarm = {
      val __obj = js.Dynamic.literal(
        "AlarmARN" -> AlarmARN.asInstanceOf[js.Any],
        "AlarmName" -> AlarmName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Alarm]
    }
  }

  /** Represents a CloudWatch metric of your choosing for a target tracking scaling policy to use with Application Auto Scaling. For information about the available metrics for a service, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html|AWS Services That Publish CloudWatch Metrics]] in the <i>Amazon CloudWatch User Guide</i>. To create your customized metric specification: * Add values for each required parameter from CloudWatch. You can use an existing metric, or a new metric that you create. To use your own metric, you must first publish the metric to CloudWatch. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html|Publish Custom Metrics]] in the <i>Amazon CloudWatch User Guide</i>. * Choose a metric that changes proportionally with capacity. The value of the metric should increase or decrease in inverse proportion to the number of capacity units. That is, the value
    * of the metric should decrease when capacity increases, and increase when capacity decreases. For more information about CloudWatch, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]].
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
    @inline
    def apply(
        MetricName: MetricName,
        Namespace: MetricNamespace,
        Statistic: MetricStatistic,
        Dimensions: js.UndefOr[MetricDimensions] = js.undefined,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): CustomizedMetricSpecification = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Statistic" -> Statistic.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomizedMetricSpecification]
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
    @inline
    def apply(
        PolicyName: ResourceIdMaxLen1600,
        ResourceId: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ServiceNamespace: ServiceNamespace
    ): DeleteScalingPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScalingPolicyRequest]
    }
  }

  @js.native
  trait DeleteScalingPolicyResponse extends js.Object

  object DeleteScalingPolicyResponse {
    @inline
    def apply(): DeleteScalingPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteScalingPolicyResponse]
    }
  }

  @js.native
  trait DeleteScheduledActionRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ScheduledActionName: ResourceIdMaxLen1600
    var ServiceNamespace: ServiceNamespace
  }

  object DeleteScheduledActionRequest {
    @inline
    def apply(
        ResourceId: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ScheduledActionName: ResourceIdMaxLen1600,
        ServiceNamespace: ServiceNamespace
    ): DeleteScheduledActionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScheduledActionRequest]
    }
  }

  @js.native
  trait DeleteScheduledActionResponse extends js.Object

  object DeleteScheduledActionResponse {
    @inline
    def apply(): DeleteScheduledActionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteScheduledActionResponse]
    }
  }

  @js.native
  trait DeregisterScalableTargetRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
  }

  object DeregisterScalableTargetRequest {
    @inline
    def apply(
        ResourceId: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ServiceNamespace: ServiceNamespace
    ): DeregisterScalableTargetRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterScalableTargetRequest]
    }
  }

  @js.native
  trait DeregisterScalableTargetResponse extends js.Object

  object DeregisterScalableTargetResponse {
    @inline
    def apply(): DeregisterScalableTargetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterScalableTargetResponse]
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
    @inline
    def apply(
        ServiceNamespace: ServiceNamespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ResourceIds: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined,
        ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    ): DescribeScalableTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceIds.foreach(__v => __obj.updateDynamic("ResourceIds")(__v.asInstanceOf[js.Any]))
      ScalableDimension.foreach(__v => __obj.updateDynamic("ScalableDimension")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalableTargetsRequest]
    }
  }

  @js.native
  trait DescribeScalableTargetsResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalableTargets: js.UndefOr[ScalableTargets]
  }

  object DescribeScalableTargetsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ScalableTargets: js.UndefOr[ScalableTargets] = js.undefined
    ): DescribeScalableTargetsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScalableTargets.foreach(__v => __obj.updateDynamic("ScalableTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalableTargetsResponse]
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
    @inline
    def apply(
        ServiceNamespace: ServiceNamespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
        ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    ): DescribeScalingActivitiesRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ScalableDimension.foreach(__v => __obj.updateDynamic("ScalableDimension")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingActivitiesRequest]
    }
  }

  @js.native
  trait DescribeScalingActivitiesResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingActivities: js.UndefOr[ScalingActivities]
  }

  object DescribeScalingActivitiesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ScalingActivities: js.UndefOr[ScalingActivities] = js.undefined
    ): DescribeScalingActivitiesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScalingActivities.foreach(__v => __obj.updateDynamic("ScalingActivities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingActivitiesResponse]
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
    @inline
    def apply(
        ServiceNamespace: ServiceNamespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined,
        PolicyNames: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined,
        ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
        ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined
    ): DescribeScalingPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.updateDynamic("PolicyNames")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ScalableDimension.foreach(__v => __obj.updateDynamic("ScalableDimension")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPoliciesRequest]
    }
  }

  @js.native
  trait DescribeScalingPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingPolicies: js.UndefOr[ScalingPolicies]
  }

  object DescribeScalingPoliciesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined
    ): DescribeScalingPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScalingPolicies.foreach(__v => __obj.updateDynamic("ScalingPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPoliciesResponse]
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
    @inline
    def apply(
        ServiceNamespace: ServiceNamespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ResourceId: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
        ScalableDimension: js.UndefOr[ScalableDimension] = js.undefined,
        ScheduledActionNames: js.UndefOr[ResourceIdsMaxLen1600] = js.undefined
    ): DescribeScheduledActionsRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ScalableDimension.foreach(__v => __obj.updateDynamic("ScalableDimension")(__v.asInstanceOf[js.Any]))
      ScheduledActionNames.foreach(__v => __obj.updateDynamic("ScheduledActionNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScheduledActionsRequest]
    }
  }

  @js.native
  trait DescribeScheduledActionsResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScheduledActions: js.UndefOr[ScheduledActions]
  }

  object DescribeScheduledActionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ScheduledActions: js.UndefOr[ScheduledActions] = js.undefined
    ): DescribeScheduledActionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScheduledActions.foreach(__v => __obj.updateDynamic("ScheduledActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScheduledActionsResponse]
    }
  }

  /** Describes the dimension names and values associated with a metric.
    */
  @js.native
  trait MetricDimension extends js.Object {
    var Name: MetricDimensionName
    var Value: MetricDimensionValue
  }

  object MetricDimension {
    @inline
    def apply(
        Name: MetricDimensionName,
        Value: MetricDimensionValue
    ): MetricDimension = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MetricDimension]
    }
  }

  /** Represents a predefined metric for a target tracking scaling policy to use with Application Auto Scaling. Only the AWS services that you're using send metrics to Amazon CloudWatch. To determine whether a desired metric already exists by looking up its namespace and dimension using the CloudWatch metrics dashboard in the console, follow the procedure in [[https://docs.aws.amazon.com/autoscaling/application/userguide/monitoring-cloudwatch.html|Building dashboards with CloudWatch]] in the <i>Application Auto Scaling User Guide</i>.
    */
  @js.native
  trait PredefinedMetricSpecification extends js.Object {
    var PredefinedMetricType: MetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  object PredefinedMetricSpecification {
    @inline
    def apply(
        PredefinedMetricType: MetricType,
        ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
    ): PredefinedMetricSpecification = {
      val __obj = js.Dynamic.literal(
        "PredefinedMetricType" -> PredefinedMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.updateDynamic("ResourceLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredefinedMetricSpecification]
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
    @inline
    def apply(
        PolicyName: PolicyName,
        ResourceId: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ServiceNamespace: ServiceNamespace,
        PolicyType: js.UndefOr[PolicyType] = js.undefined,
        StepScalingPolicyConfiguration: js.UndefOr[StepScalingPolicyConfiguration] = js.undefined,
        TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration] = js.undefined
    ): PutScalingPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      StepScalingPolicyConfiguration.foreach(__v => __obj.updateDynamic("StepScalingPolicyConfiguration")(__v.asInstanceOf[js.Any]))
      TargetTrackingScalingPolicyConfiguration.foreach(__v => __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScalingPolicyRequest]
    }
  }

  @js.native
  trait PutScalingPolicyResponse extends js.Object {
    var PolicyARN: ResourceIdMaxLen1600
    var Alarms: js.UndefOr[Alarms]
  }

  object PutScalingPolicyResponse {
    @inline
    def apply(
        PolicyARN: ResourceIdMaxLen1600,
        Alarms: js.UndefOr[Alarms] = js.undefined
    ): PutScalingPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "PolicyARN" -> PolicyARN.asInstanceOf[js.Any]
      )

      Alarms.foreach(__v => __obj.updateDynamic("Alarms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScalingPolicyResponse]
    }
  }

  @js.native
  trait PutScheduledActionRequest extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ScheduledActionName: ScheduledActionName
    var ServiceNamespace: ServiceNamespace
    var EndTime: js.UndefOr[TimestampType]
    var ScalableTargetAction: js.UndefOr[ScalableTargetAction]
    var Schedule: js.UndefOr[ResourceIdMaxLen1600]
    var StartTime: js.UndefOr[TimestampType]
    var Timezone: js.UndefOr[ResourceIdMaxLen1600]
  }

  object PutScheduledActionRequest {
    @inline
    def apply(
        ResourceId: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ScheduledActionName: ScheduledActionName,
        ServiceNamespace: ServiceNamespace,
        EndTime: js.UndefOr[TimestampType] = js.undefined,
        ScalableTargetAction: js.UndefOr[ScalableTargetAction] = js.undefined,
        Schedule: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
        StartTime: js.UndefOr[TimestampType] = js.undefined,
        Timezone: js.UndefOr[ResourceIdMaxLen1600] = js.undefined
    ): PutScheduledActionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ScalableTargetAction.foreach(__v => __obj.updateDynamic("ScalableTargetAction")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScheduledActionRequest]
    }
  }

  @js.native
  trait PutScheduledActionResponse extends js.Object

  object PutScheduledActionResponse {
    @inline
    def apply(): PutScheduledActionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutScheduledActionResponse]
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
    var SuspendedState: js.UndefOr[SuspendedState]
  }

  object RegisterScalableTargetRequest {
    @inline
    def apply(
        ResourceId: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ServiceNamespace: ServiceNamespace,
        MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
        MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
        RoleARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined,
        SuspendedState: js.UndefOr[SuspendedState] = js.undefined
    ): RegisterScalableTargetRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MinCapacity.foreach(__v => __obj.updateDynamic("MinCapacity")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      SuspendedState.foreach(__v => __obj.updateDynamic("SuspendedState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterScalableTargetRequest]
    }
  }

  @js.native
  trait RegisterScalableTargetResponse extends js.Object

  object RegisterScalableTargetResponse {
    @inline
    def apply(): RegisterScalableTargetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterScalableTargetResponse]
    }
  }

  /** Represents a scalable target.
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
    var SuspendedState: js.UndefOr[SuspendedState]
  }

  object ScalableTarget {
    @inline
    def apply(
        CreationTime: TimestampType,
        MaxCapacity: ResourceCapacity,
        MinCapacity: ResourceCapacity,
        ResourceId: ResourceIdMaxLen1600,
        RoleARN: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ServiceNamespace: ServiceNamespace,
        SuspendedState: js.UndefOr[SuspendedState] = js.undefined
    ): ScalableTarget = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "MaxCapacity" -> MaxCapacity.asInstanceOf[js.Any],
        "MinCapacity" -> MinCapacity.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      SuspendedState.foreach(__v => __obj.updateDynamic("SuspendedState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalableTarget]
    }
  }

  /** Represents the minimum and maximum capacity for a scheduled action.
    */
  @js.native
  trait ScalableTargetAction extends js.Object {
    var MaxCapacity: js.UndefOr[ResourceCapacity]
    var MinCapacity: js.UndefOr[ResourceCapacity]
  }

  object ScalableTargetAction {
    @inline
    def apply(
        MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
        MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
    ): ScalableTargetAction = {
      val __obj = js.Dynamic.literal()
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MinCapacity.foreach(__v => __obj.updateDynamic("MinCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalableTargetAction]
    }
  }

  /** Represents a scaling activity.
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
    @inline
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
        StatusMessage: js.UndefOr[XmlString] = js.undefined
    ): ScalingActivity = {
      val __obj = js.Dynamic.literal(
        "ActivityId" -> ActivityId.asInstanceOf[js.Any],
        "Cause" -> Cause.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any],
        "StatusCode" -> StatusCode.asInstanceOf[js.Any]
      )

      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingActivity]
    }
  }

  /** Represents a scaling policy to use with Application Auto Scaling. For more information about configuring scaling policies for a specific service, see [[https://docs.aws.amazon.com/autoscaling/application/userguide/getting-started.html|Getting started with Application Auto Scaling]] in the <i>Application Auto Scaling User Guide</i>.
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
    @inline
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
        TargetTrackingScalingPolicyConfiguration: js.UndefOr[TargetTrackingScalingPolicyConfiguration] = js.undefined
    ): ScalingPolicy = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "PolicyARN" -> PolicyARN.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "PolicyType" -> PolicyType.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      Alarms.foreach(__v => __obj.updateDynamic("Alarms")(__v.asInstanceOf[js.Any]))
      StepScalingPolicyConfiguration.foreach(__v => __obj.updateDynamic("StepScalingPolicyConfiguration")(__v.asInstanceOf[js.Any]))
      TargetTrackingScalingPolicyConfiguration.foreach(__v => __obj.updateDynamic("TargetTrackingScalingPolicyConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPolicy]
    }
  }

  /** Represents a scheduled action.
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
    var Timezone: js.UndefOr[ResourceIdMaxLen1600]
  }

  object ScheduledAction {
    @inline
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
        StartTime: js.UndefOr[TimestampType] = js.undefined,
        Timezone: js.UndefOr[ResourceIdMaxLen1600] = js.undefined
    ): ScheduledAction = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Schedule" -> Schedule.asInstanceOf[js.Any],
        "ScheduledActionARN" -> ScheduledActionARN.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ScalableDimension.foreach(__v => __obj.updateDynamic("ScalableDimension")(__v.asInstanceOf[js.Any]))
      ScalableTargetAction.foreach(__v => __obj.updateDynamic("ScalableTargetAction")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledAction]
    }
  }

  /** Represents a step adjustment for a [[https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html|StepScalingPolicyConfiguration]]. Describes an adjustment based on the difference between the value of the aggregated CloudWatch metric and the breach threshold that you've defined for the alarm. For the following examples, suppose that you have an alarm with a breach threshold of 50: * To trigger the adjustment when the metric is greater than or equal to 50 and less than 60, specify a lower bound of 0 and an upper bound of 10. * To trigger the adjustment when the metric is greater than 40 and less than or equal to 50, specify a lower bound of -10 and an upper bound of 0. There are a few rules for the step adjustments for your step policy: * The ranges of your step adjustments can't overlap or have a gap. * At most one step adjustment can have a null lower bound. If one step adjustment has a negative lower bound, then there must be a step
    * adjustment with a null lower bound. * At most one step adjustment can have a null upper bound. If one step adjustment has a positive upper bound, then there must be a step adjustment with a null upper bound. * The upper and lower bound can't be null in the same step adjustment.
    */
  @js.native
  trait StepAdjustment extends js.Object {
    var ScalingAdjustment: ScalingAdjustment
    var MetricIntervalLowerBound: js.UndefOr[MetricScale]
    var MetricIntervalUpperBound: js.UndefOr[MetricScale]
  }

  object StepAdjustment {
    @inline
    def apply(
        ScalingAdjustment: ScalingAdjustment,
        MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.undefined,
        MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.undefined
    ): StepAdjustment = {
      val __obj = js.Dynamic.literal(
        "ScalingAdjustment" -> ScalingAdjustment.asInstanceOf[js.Any]
      )

      MetricIntervalLowerBound.foreach(__v => __obj.updateDynamic("MetricIntervalLowerBound")(__v.asInstanceOf[js.Any]))
      MetricIntervalUpperBound.foreach(__v => __obj.updateDynamic("MetricIntervalUpperBound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepAdjustment]
    }
  }

  /** Represents a step scaling policy configuration to use with Application Auto Scaling.
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
    @inline
    def apply(
        AdjustmentType: js.UndefOr[AdjustmentType] = js.undefined,
        Cooldown: js.UndefOr[Cooldown] = js.undefined,
        MetricAggregationType: js.UndefOr[MetricAggregationType] = js.undefined,
        MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
        StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined
    ): StepScalingPolicyConfiguration = {
      val __obj = js.Dynamic.literal()
      AdjustmentType.foreach(__v => __obj.updateDynamic("AdjustmentType")(__v.asInstanceOf[js.Any]))
      Cooldown.foreach(__v => __obj.updateDynamic("Cooldown")(__v.asInstanceOf[js.Any]))
      MetricAggregationType.foreach(__v => __obj.updateDynamic("MetricAggregationType")(__v.asInstanceOf[js.Any]))
      MinAdjustmentMagnitude.foreach(__v => __obj.updateDynamic("MinAdjustmentMagnitude")(__v.asInstanceOf[js.Any]))
      StepAdjustments.foreach(__v => __obj.updateDynamic("StepAdjustments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepScalingPolicyConfiguration]
    }
  }

  /** Specifies whether the scaling activities for a scalable target are in a suspended state.
    */
  @js.native
  trait SuspendedState extends js.Object {
    var DynamicScalingInSuspended: js.UndefOr[ScalingSuspended]
    var DynamicScalingOutSuspended: js.UndefOr[ScalingSuspended]
    var ScheduledScalingSuspended: js.UndefOr[ScalingSuspended]
  }

  object SuspendedState {
    @inline
    def apply(
        DynamicScalingInSuspended: js.UndefOr[ScalingSuspended] = js.undefined,
        DynamicScalingOutSuspended: js.UndefOr[ScalingSuspended] = js.undefined,
        ScheduledScalingSuspended: js.UndefOr[ScalingSuspended] = js.undefined
    ): SuspendedState = {
      val __obj = js.Dynamic.literal()
      DynamicScalingInSuspended.foreach(__v => __obj.updateDynamic("DynamicScalingInSuspended")(__v.asInstanceOf[js.Any]))
      DynamicScalingOutSuspended.foreach(__v => __obj.updateDynamic("DynamicScalingOutSuspended")(__v.asInstanceOf[js.Any]))
      ScheduledScalingSuspended.foreach(__v => __obj.updateDynamic("ScheduledScalingSuspended")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuspendedState]
    }
  }

  /** Represents a target tracking scaling policy configuration to use with Application Auto Scaling.
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
    @inline
    def apply(
        TargetValue: MetricScale,
        CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification] = js.undefined,
        DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
        PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined,
        ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined,
        ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
    ): TargetTrackingScalingPolicyConfiguration = {
      val __obj = js.Dynamic.literal(
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      )

      CustomizedMetricSpecification.foreach(__v => __obj.updateDynamic("CustomizedMetricSpecification")(__v.asInstanceOf[js.Any]))
      DisableScaleIn.foreach(__v => __obj.updateDynamic("DisableScaleIn")(__v.asInstanceOf[js.Any]))
      PredefinedMetricSpecification.foreach(__v => __obj.updateDynamic("PredefinedMetricSpecification")(__v.asInstanceOf[js.Any]))
      ScaleInCooldown.foreach(__v => __obj.updateDynamic("ScaleInCooldown")(__v.asInstanceOf[js.Any]))
      ScaleOutCooldown.foreach(__v => __obj.updateDynamic("ScaleOutCooldown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetTrackingScalingPolicyConfiguration]
    }
  }
}
