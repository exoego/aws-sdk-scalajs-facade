package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object autoscalingplans {
  type ApplicationSources = js.Array[ApplicationSource]
  type Cooldown = Int
  type Datapoints = js.Array[Datapoint]
  type DisableDynamicScaling = Boolean
  type DisableScaleIn = Boolean
  type MaxResults = Int
  type MetricDimensionName = String
  type MetricDimensionValue = String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricName = String
  type MetricNamespace = String
  type MetricScale = Double
  type MetricUnit = String
  type NextToken = String
  type PolicyName = String
  type ResourceCapacity = Int
  type ResourceIdMaxLen1600 = String
  type ResourceLabel = String
  type ScalingInstructions = js.Array[ScalingInstruction]
  type ScalingPlanName = String
  type ScalingPlanNames = js.Array[ScalingPlanName]
  type ScalingPlanResources = js.Array[ScalingPlanResource]
  type ScalingPlanVersion = Double
  type ScalingPlans = js.Array[ScalingPlan]
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionBufferTime = Int
  type TagFilters = js.Array[TagFilter]
  type TagValues = js.Array[XmlStringMaxLen256]
  type TargetTrackingConfigurations = js.Array[TargetTrackingConfiguration]
  type TimestampType = js.Date
  type XmlString = String
  type XmlStringMaxLen128 = String
  type XmlStringMaxLen256 = String

  final class AutoScalingPlansOps(private val service: AutoScalingPlans) extends AnyVal {

    @inline def createScalingPlanFuture(params: CreateScalingPlanRequest): Future[CreateScalingPlanResponse] = service.createScalingPlan(params).promise().toFuture
    @inline def deleteScalingPlanFuture(params: DeleteScalingPlanRequest): Future[DeleteScalingPlanResponse] = service.deleteScalingPlan(params).promise().toFuture
    @inline def describeScalingPlanResourcesFuture(params: DescribeScalingPlanResourcesRequest): Future[DescribeScalingPlanResourcesResponse] = service.describeScalingPlanResources(params).promise().toFuture
    @inline def describeScalingPlansFuture(params: DescribeScalingPlansRequest): Future[DescribeScalingPlansResponse] = service.describeScalingPlans(params).promise().toFuture
    @inline def getScalingPlanResourceForecastDataFuture(params: GetScalingPlanResourceForecastDataRequest): Future[GetScalingPlanResourceForecastDataResponse] = service.getScalingPlanResourceForecastData(params).promise().toFuture
    @inline def updateScalingPlanFuture(params: UpdateScalingPlanRequest): Future[UpdateScalingPlanResponse] = service.updateScalingPlan(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/autoscalingplans", JSImport.Namespace, "AWS.AutoScalingPlans")
  class AutoScalingPlans() extends js.Object {
    def this(config: AWSConfig) = this()

    def createScalingPlan(params: CreateScalingPlanRequest): Request[CreateScalingPlanResponse] = js.native
    def deleteScalingPlan(params: DeleteScalingPlanRequest): Request[DeleteScalingPlanResponse] = js.native
    def describeScalingPlanResources(params: DescribeScalingPlanResourcesRequest): Request[DescribeScalingPlanResourcesResponse] = js.native
    def describeScalingPlans(params: DescribeScalingPlansRequest): Request[DescribeScalingPlansResponse] = js.native
    def getScalingPlanResourceForecastData(params: GetScalingPlanResourceForecastDataRequest): Request[GetScalingPlanResourceForecastDataResponse] = js.native
    def updateScalingPlan(params: UpdateScalingPlanRequest): Request[UpdateScalingPlanResponse] = js.native
  }
  object AutoScalingPlans {
    @inline implicit def toOps(service: AutoScalingPlans): AutoScalingPlansOps = {
      new AutoScalingPlansOps(service)
    }
  }

  /** Represents an application source.
    */
  @js.native
  trait ApplicationSource extends js.Object {
    var CloudFormationStackARN: js.UndefOr[XmlString]
    var TagFilters: js.UndefOr[TagFilters]
  }

  object ApplicationSource {
    @inline
    def apply(
        CloudFormationStackARN: js.UndefOr[XmlString] = js.undefined,
        TagFilters: js.UndefOr[TagFilters] = js.undefined
    ): ApplicationSource = {
      val __obj = js.Dynamic.literal()
      CloudFormationStackARN.foreach(__v => __obj.updateDynamic("CloudFormationStackARN")(__v.asInstanceOf[js.Any]))
      TagFilters.foreach(__v => __obj.updateDynamic("TagFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSource]
    }
  }

  @js.native
  trait CreateScalingPlanRequest extends js.Object {
    var ApplicationSource: ApplicationSource
    var ScalingInstructions: ScalingInstructions
    var ScalingPlanName: ScalingPlanName
  }

  object CreateScalingPlanRequest {
    @inline
    def apply(
        ApplicationSource: ApplicationSource,
        ScalingInstructions: ScalingInstructions,
        ScalingPlanName: ScalingPlanName
    ): CreateScalingPlanRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationSource" -> ApplicationSource.asInstanceOf[js.Any],
        "ScalingInstructions" -> ScalingInstructions.asInstanceOf[js.Any],
        "ScalingPlanName" -> ScalingPlanName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateScalingPlanRequest]
    }
  }

  @js.native
  trait CreateScalingPlanResponse extends js.Object {
    var ScalingPlanVersion: ScalingPlanVersion
  }

  object CreateScalingPlanResponse {
    @inline
    def apply(
        ScalingPlanVersion: ScalingPlanVersion
    ): CreateScalingPlanResponse = {
      val __obj = js.Dynamic.literal(
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateScalingPlanResponse]
    }
  }

  /** Represents a CloudWatch metric of your choosing that can be used for predictive scaling. For predictive scaling to work with a customized load metric specification, AWS Auto Scaling needs access to the <code>Sum</code> and <code>Average</code> statistics that CloudWatch computes from metric data. When you choose a load metric, make sure that the required <code>Sum</code> and <code>Average</code> statistics for your metric are available in CloudWatch and that they provide relevant data for predictive scaling. The <code>Sum</code> statistic must represent the total load on the resource, and the <code>Average</code> statistic must represent the average load per capacity unit of the resource. For example, there is a metric that counts the number of requests processed by your Auto Scaling group. If the <code>Sum</code> statistic represents the total request count processed by the group, then the <code>Average</code> statistic for the specified metric must represent the average request
    * count processed by each instance of the group. If you publish your own metrics, you can aggregate the data points at a given interval and then publish the aggregated data points to CloudWatch. Before AWS Auto Scaling generates the forecast, it sums up all the metric data points that occurred within each hour to match the granularity period that is used in the forecast (60 minutes). For information about terminology, available metrics, or how to publish new metrics, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]] in the <i>Amazon CloudWatch User Guide</i>. After creating your scaling plan, you can use the AWS Auto Scaling console to visualize forecasts for the specified metric. For more information, see [[https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-create-scaling-plan.html#gs-view-resource|View Scaling Information for a Resource]] in the <i>AWS Auto Scaling User Guide</i>.
    */
  @js.native
  trait CustomizedLoadMetricSpecification extends js.Object {
    var MetricName: MetricName
    var Namespace: MetricNamespace
    var Statistic: MetricStatistic
    var Dimensions: js.UndefOr[MetricDimensions]
    var Unit: js.UndefOr[MetricUnit]
  }

  object CustomizedLoadMetricSpecification {
    @inline
    def apply(
        MetricName: MetricName,
        Namespace: MetricNamespace,
        Statistic: MetricStatistic,
        Dimensions: js.UndefOr[MetricDimensions] = js.undefined,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): CustomizedLoadMetricSpecification = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Statistic" -> Statistic.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomizedLoadMetricSpecification]
    }
  }

  /** Represents a CloudWatch metric of your choosing that can be used for dynamic scaling as part of a target tracking scaling policy. To create your customized scaling metric specification: * Add values for each required parameter from CloudWatch. You can use an existing metric, or a new metric that you create. To use your own metric, you must first publish the metric to CloudWatch. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html|Publish Custom Metrics]] in the <i>Amazon CloudWatch User Guide</i>. * Choose a metric that changes proportionally with capacity. The value of the metric should increase or decrease in inverse proportion to the number of capacity units. That is, the value of the metric should decrease when capacity increases. For information about terminology, available metrics, or how to publish new metrics, see
    * [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]] in the <i>Amazon CloudWatch User Guide</i>.
    */
  @js.native
  trait CustomizedScalingMetricSpecification extends js.Object {
    var MetricName: MetricName
    var Namespace: MetricNamespace
    var Statistic: MetricStatistic
    var Dimensions: js.UndefOr[MetricDimensions]
    var Unit: js.UndefOr[MetricUnit]
  }

  object CustomizedScalingMetricSpecification {
    @inline
    def apply(
        MetricName: MetricName,
        Namespace: MetricNamespace,
        Statistic: MetricStatistic,
        Dimensions: js.UndefOr[MetricDimensions] = js.undefined,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): CustomizedScalingMetricSpecification = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Statistic" -> Statistic.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomizedScalingMetricSpecification]
    }
  }

  /** Represents a single value in the forecast data used for predictive scaling.
    */
  @js.native
  trait Datapoint extends js.Object {
    var Timestamp: js.UndefOr[TimestampType]
    var Value: js.UndefOr[MetricScale]
  }

  object Datapoint {
    @inline
    def apply(
        Timestamp: js.UndefOr[TimestampType] = js.undefined,
        Value: js.UndefOr[MetricScale] = js.undefined
    ): Datapoint = {
      val __obj = js.Dynamic.literal()
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Datapoint]
    }
  }

  @js.native
  trait DeleteScalingPlanRequest extends js.Object {
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
  }

  object DeleteScalingPlanRequest {
    @inline
    def apply(
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion
    ): DeleteScalingPlanRequest = {
      val __obj = js.Dynamic.literal(
        "ScalingPlanName" -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScalingPlanRequest]
    }
  }

  @js.native
  trait DeleteScalingPlanResponse extends js.Object

  object DeleteScalingPlanResponse {
    @inline
    def apply(): DeleteScalingPlanResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteScalingPlanResponse]
    }
  }

  @js.native
  trait DescribeScalingPlanResourcesRequest extends js.Object {
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeScalingPlanResourcesRequest {
    @inline
    def apply(
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeScalingPlanResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "ScalingPlanName" -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPlanResourcesRequest]
    }
  }

  @js.native
  trait DescribeScalingPlanResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScalingPlanResources: js.UndefOr[ScalingPlanResources]
  }

  object DescribeScalingPlanResourcesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScalingPlanResources: js.UndefOr[ScalingPlanResources] = js.undefined
    ): DescribeScalingPlanResourcesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScalingPlanResources.foreach(__v => __obj.updateDynamic("ScalingPlanResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPlanResourcesResponse]
    }
  }

  @js.native
  trait DescribeScalingPlansRequest extends js.Object {
    var ApplicationSources: js.UndefOr[ApplicationSources]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ScalingPlanNames: js.UndefOr[ScalingPlanNames]
    var ScalingPlanVersion: js.UndefOr[ScalingPlanVersion]
  }

  object DescribeScalingPlansRequest {
    @inline
    def apply(
        ApplicationSources: js.UndefOr[ApplicationSources] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScalingPlanNames: js.UndefOr[ScalingPlanNames] = js.undefined,
        ScalingPlanVersion: js.UndefOr[ScalingPlanVersion] = js.undefined
    ): DescribeScalingPlansRequest = {
      val __obj = js.Dynamic.literal()
      ApplicationSources.foreach(__v => __obj.updateDynamic("ApplicationSources")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScalingPlanNames.foreach(__v => __obj.updateDynamic("ScalingPlanNames")(__v.asInstanceOf[js.Any]))
      ScalingPlanVersion.foreach(__v => __obj.updateDynamic("ScalingPlanVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPlansRequest]
    }
  }

  @js.native
  trait DescribeScalingPlansResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScalingPlans: js.UndefOr[ScalingPlans]
  }

  object DescribeScalingPlansResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScalingPlans: js.UndefOr[ScalingPlans] = js.undefined
    ): DescribeScalingPlansResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScalingPlans.foreach(__v => __obj.updateDynamic("ScalingPlans")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPlansResponse]
    }
  }

  @js.native
  trait GetScalingPlanResourceForecastDataRequest extends js.Object {
    var EndTime: TimestampType
    var ForecastDataType: ForecastDataType
    var ResourceId: XmlString
    var ScalableDimension: ScalableDimension
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
    var ServiceNamespace: ServiceNamespace
    var StartTime: TimestampType
  }

  object GetScalingPlanResourceForecastDataRequest {
    @inline
    def apply(
        EndTime: TimestampType,
        ForecastDataType: ForecastDataType,
        ResourceId: XmlString,
        ScalableDimension: ScalableDimension,
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion,
        ServiceNamespace: ServiceNamespace,
        StartTime: TimestampType
    ): GetScalingPlanResourceForecastDataRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "ForecastDataType" -> ForecastDataType.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ScalingPlanName" -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetScalingPlanResourceForecastDataRequest]
    }
  }

  @js.native
  trait GetScalingPlanResourceForecastDataResponse extends js.Object {
    var Datapoints: Datapoints
  }

  object GetScalingPlanResourceForecastDataResponse {
    @inline
    def apply(
        Datapoints: Datapoints
    ): GetScalingPlanResourceForecastDataResponse = {
      val __obj = js.Dynamic.literal(
        "Datapoints" -> Datapoints.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetScalingPlanResourceForecastDataResponse]
    }
  }

  /** Represents a dimension for a customized metric.
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

  /** Represents a predefined metric that can be used for predictive scaling. After creating your scaling plan, you can use the AWS Auto Scaling console to visualize forecasts for the specified metric. For more information, see [[https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-create-scaling-plan.html#gs-view-resource|View Scaling Information for a Resource]] in the <i>AWS Auto Scaling User Guide</i>.
    */
  @js.native
  trait PredefinedLoadMetricSpecification extends js.Object {
    var PredefinedLoadMetricType: LoadMetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  object PredefinedLoadMetricSpecification {
    @inline
    def apply(
        PredefinedLoadMetricType: LoadMetricType,
        ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
    ): PredefinedLoadMetricSpecification = {
      val __obj = js.Dynamic.literal(
        "PredefinedLoadMetricType" -> PredefinedLoadMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.updateDynamic("ResourceLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredefinedLoadMetricSpecification]
    }
  }

  /** Represents a predefined metric that can be used for dynamic scaling as part of a target tracking scaling policy.
    */
  @js.native
  trait PredefinedScalingMetricSpecification extends js.Object {
    var PredefinedScalingMetricType: ScalingMetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  object PredefinedScalingMetricSpecification {
    @inline
    def apply(
        PredefinedScalingMetricType: ScalingMetricType,
        ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
    ): PredefinedScalingMetricSpecification = {
      val __obj = js.Dynamic.literal(
        "PredefinedScalingMetricType" -> PredefinedScalingMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.updateDynamic("ResourceLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredefinedScalingMetricSpecification]
    }
  }

  /** Describes a scaling instruction for a scalable resource in a scaling plan. Each scaling instruction applies to one resource. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions. Target tracking scaling policies adjust the capacity of your scalable resource as required to maintain resource utilization at the target value that you specified. AWS Auto Scaling also configures predictive scaling for your Amazon EC2 Auto Scaling groups using a subset of parameters, including the load metric, the scaling metric, the target value for the scaling metric, the predictive scaling mode (forecast and scale or forecast only), and the desired behavior when the forecast capacity exceeds the maximum capacity of the resource. With predictive scaling, AWS Auto Scaling generates forecasts with traffic predictions for the two days ahead and schedules scaling actions that proactively add and remove resource capacity to match the forecast. <important> We recommend
    * waiting a minimum of 24 hours after creating an Auto Scaling group to configure predictive scaling. At minimum, there must be 24 hours of historical data to generate a forecast. For more information, see [[https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-best-practices.html|Best Practices for AWS Auto Scaling]] in the <i>AWS Auto Scaling User Guide</i>. </important>
    */
  @js.native
  trait ScalingInstruction extends js.Object {
    var MaxCapacity: ResourceCapacity
    var MinCapacity: ResourceCapacity
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ServiceNamespace: ServiceNamespace
    var TargetTrackingConfigurations: TargetTrackingConfigurations
    var CustomizedLoadMetricSpecification: js.UndefOr[CustomizedLoadMetricSpecification]
    var DisableDynamicScaling: js.UndefOr[DisableDynamicScaling]
    var PredefinedLoadMetricSpecification: js.UndefOr[PredefinedLoadMetricSpecification]
    var PredictiveScalingMaxCapacityBehavior: js.UndefOr[PredictiveScalingMaxCapacityBehavior]
    var PredictiveScalingMaxCapacityBuffer: js.UndefOr[ResourceCapacity]
    var PredictiveScalingMode: js.UndefOr[PredictiveScalingMode]
    var ScalingPolicyUpdateBehavior: js.UndefOr[ScalingPolicyUpdateBehavior]
    var ScheduledActionBufferTime: js.UndefOr[ScheduledActionBufferTime]
  }

  object ScalingInstruction {
    @inline
    def apply(
        MaxCapacity: ResourceCapacity,
        MinCapacity: ResourceCapacity,
        ResourceId: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ServiceNamespace: ServiceNamespace,
        TargetTrackingConfigurations: TargetTrackingConfigurations,
        CustomizedLoadMetricSpecification: js.UndefOr[CustomizedLoadMetricSpecification] = js.undefined,
        DisableDynamicScaling: js.UndefOr[DisableDynamicScaling] = js.undefined,
        PredefinedLoadMetricSpecification: js.UndefOr[PredefinedLoadMetricSpecification] = js.undefined,
        PredictiveScalingMaxCapacityBehavior: js.UndefOr[PredictiveScalingMaxCapacityBehavior] = js.undefined,
        PredictiveScalingMaxCapacityBuffer: js.UndefOr[ResourceCapacity] = js.undefined,
        PredictiveScalingMode: js.UndefOr[PredictiveScalingMode] = js.undefined,
        ScalingPolicyUpdateBehavior: js.UndefOr[ScalingPolicyUpdateBehavior] = js.undefined,
        ScheduledActionBufferTime: js.UndefOr[ScheduledActionBufferTime] = js.undefined
    ): ScalingInstruction = {
      val __obj = js.Dynamic.literal(
        "MaxCapacity" -> MaxCapacity.asInstanceOf[js.Any],
        "MinCapacity" -> MinCapacity.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any],
        "TargetTrackingConfigurations" -> TargetTrackingConfigurations.asInstanceOf[js.Any]
      )

      CustomizedLoadMetricSpecification.foreach(__v => __obj.updateDynamic("CustomizedLoadMetricSpecification")(__v.asInstanceOf[js.Any]))
      DisableDynamicScaling.foreach(__v => __obj.updateDynamic("DisableDynamicScaling")(__v.asInstanceOf[js.Any]))
      PredefinedLoadMetricSpecification.foreach(__v => __obj.updateDynamic("PredefinedLoadMetricSpecification")(__v.asInstanceOf[js.Any]))
      PredictiveScalingMaxCapacityBehavior.foreach(__v => __obj.updateDynamic("PredictiveScalingMaxCapacityBehavior")(__v.asInstanceOf[js.Any]))
      PredictiveScalingMaxCapacityBuffer.foreach(__v => __obj.updateDynamic("PredictiveScalingMaxCapacityBuffer")(__v.asInstanceOf[js.Any]))
      PredictiveScalingMode.foreach(__v => __obj.updateDynamic("PredictiveScalingMode")(__v.asInstanceOf[js.Any]))
      ScalingPolicyUpdateBehavior.foreach(__v => __obj.updateDynamic("ScalingPolicyUpdateBehavior")(__v.asInstanceOf[js.Any]))
      ScheduledActionBufferTime.foreach(__v => __obj.updateDynamic("ScheduledActionBufferTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingInstruction]
    }
  }

  /** Represents a scaling plan.
    */
  @js.native
  trait ScalingPlan extends js.Object {
    var ApplicationSource: ApplicationSource
    var ScalingInstructions: ScalingInstructions
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
    var StatusCode: ScalingPlanStatusCode
    var CreationTime: js.UndefOr[TimestampType]
    var StatusMessage: js.UndefOr[XmlString]
    var StatusStartTime: js.UndefOr[TimestampType]
  }

  object ScalingPlan {
    @inline
    def apply(
        ApplicationSource: ApplicationSource,
        ScalingInstructions: ScalingInstructions,
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion,
        StatusCode: ScalingPlanStatusCode,
        CreationTime: js.UndefOr[TimestampType] = js.undefined,
        StatusMessage: js.UndefOr[XmlString] = js.undefined,
        StatusStartTime: js.UndefOr[TimestampType] = js.undefined
    ): ScalingPlan = {
      val __obj = js.Dynamic.literal(
        "ApplicationSource" -> ApplicationSource.asInstanceOf[js.Any],
        "ScalingInstructions" -> ScalingInstructions.asInstanceOf[js.Any],
        "ScalingPlanName" -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any],
        "StatusCode" -> StatusCode.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      StatusStartTime.foreach(__v => __obj.updateDynamic("StatusStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPlan]
    }
  }

  /** Represents a scalable resource.
    */
  @js.native
  trait ScalingPlanResource extends js.Object {
    var ResourceId: ResourceIdMaxLen1600
    var ScalableDimension: ScalableDimension
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
    var ScalingStatusCode: ScalingStatusCode
    var ServiceNamespace: ServiceNamespace
    var ScalingPolicies: js.UndefOr[ScalingPolicies]
    var ScalingStatusMessage: js.UndefOr[XmlString]
  }

  object ScalingPlanResource {
    @inline
    def apply(
        ResourceId: ResourceIdMaxLen1600,
        ScalableDimension: ScalableDimension,
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion,
        ScalingStatusCode: ScalingStatusCode,
        ServiceNamespace: ServiceNamespace,
        ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined,
        ScalingStatusMessage: js.UndefOr[XmlString] = js.undefined
    ): ScalingPlanResource = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension" -> ScalableDimension.asInstanceOf[js.Any],
        "ScalingPlanName" -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any],
        "ScalingStatusCode" -> ScalingStatusCode.asInstanceOf[js.Any],
        "ServiceNamespace" -> ServiceNamespace.asInstanceOf[js.Any]
      )

      ScalingPolicies.foreach(__v => __obj.updateDynamic("ScalingPolicies")(__v.asInstanceOf[js.Any]))
      ScalingStatusMessage.foreach(__v => __obj.updateDynamic("ScalingStatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPlanResource]
    }
  }

  /** Represents a scaling policy.
    */
  @js.native
  trait ScalingPolicy extends js.Object {
    var PolicyName: PolicyName
    var PolicyType: PolicyType
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  object ScalingPolicy {
    @inline
    def apply(
        PolicyName: PolicyName,
        PolicyType: PolicyType,
        TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
    ): ScalingPolicy = {
      val __obj = js.Dynamic.literal(
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "PolicyType" -> PolicyType.asInstanceOf[js.Any]
      )

      TargetTrackingConfiguration.foreach(__v => __obj.updateDynamic("TargetTrackingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPolicy]
    }
  }

  /** Represents a tag.
    */
  @js.native
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[XmlStringMaxLen128]
    var Values: js.UndefOr[TagValues]
  }

  object TagFilter {
    @inline
    def apply(
        Key: js.UndefOr[XmlStringMaxLen128] = js.undefined,
        Values: js.UndefOr[TagValues] = js.undefined
    ): TagFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagFilter]
    }
  }

  /** Describes a target tracking configuration to use with AWS Auto Scaling. Used with <a>ScalingInstruction</a> and <a>ScalingPolicy</a>.
    */
  @js.native
  trait TargetTrackingConfiguration extends js.Object {
    var TargetValue: MetricScale
    var CustomizedScalingMetricSpecification: js.UndefOr[CustomizedScalingMetricSpecification]
    var DisableScaleIn: js.UndefOr[DisableScaleIn]
    var EstimatedInstanceWarmup: js.UndefOr[Cooldown]
    var PredefinedScalingMetricSpecification: js.UndefOr[PredefinedScalingMetricSpecification]
    var ScaleInCooldown: js.UndefOr[Cooldown]
    var ScaleOutCooldown: js.UndefOr[Cooldown]
  }

  object TargetTrackingConfiguration {
    @inline
    def apply(
        TargetValue: MetricScale,
        CustomizedScalingMetricSpecification: js.UndefOr[CustomizedScalingMetricSpecification] = js.undefined,
        DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
        EstimatedInstanceWarmup: js.UndefOr[Cooldown] = js.undefined,
        PredefinedScalingMetricSpecification: js.UndefOr[PredefinedScalingMetricSpecification] = js.undefined,
        ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined,
        ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
    ): TargetTrackingConfiguration = {
      val __obj = js.Dynamic.literal(
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      )

      CustomizedScalingMetricSpecification.foreach(__v => __obj.updateDynamic("CustomizedScalingMetricSpecification")(__v.asInstanceOf[js.Any]))
      DisableScaleIn.foreach(__v => __obj.updateDynamic("DisableScaleIn")(__v.asInstanceOf[js.Any]))
      EstimatedInstanceWarmup.foreach(__v => __obj.updateDynamic("EstimatedInstanceWarmup")(__v.asInstanceOf[js.Any]))
      PredefinedScalingMetricSpecification.foreach(__v => __obj.updateDynamic("PredefinedScalingMetricSpecification")(__v.asInstanceOf[js.Any]))
      ScaleInCooldown.foreach(__v => __obj.updateDynamic("ScaleInCooldown")(__v.asInstanceOf[js.Any]))
      ScaleOutCooldown.foreach(__v => __obj.updateDynamic("ScaleOutCooldown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetTrackingConfiguration]
    }
  }

  @js.native
  trait UpdateScalingPlanRequest extends js.Object {
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
    var ApplicationSource: js.UndefOr[ApplicationSource]
    var ScalingInstructions: js.UndefOr[ScalingInstructions]
  }

  object UpdateScalingPlanRequest {
    @inline
    def apply(
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion,
        ApplicationSource: js.UndefOr[ApplicationSource] = js.undefined,
        ScalingInstructions: js.UndefOr[ScalingInstructions] = js.undefined
    ): UpdateScalingPlanRequest = {
      val __obj = js.Dynamic.literal(
        "ScalingPlanName" -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any]
      )

      ApplicationSource.foreach(__v => __obj.updateDynamic("ApplicationSource")(__v.asInstanceOf[js.Any]))
      ScalingInstructions.foreach(__v => __obj.updateDynamic("ScalingInstructions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateScalingPlanRequest]
    }
  }

  @js.native
  trait UpdateScalingPlanResponse extends js.Object

  object UpdateScalingPlanResponse {
    @inline
    def apply(): UpdateScalingPlanResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateScalingPlanResponse]
    }
  }
}
