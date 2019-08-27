package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object autoscalingplans {
  type ApplicationSources                   = js.Array[ApplicationSource]
  type Cooldown                             = Int
  type Datapoints                           = js.Array[Datapoint]
  type DisableDynamicScaling                = Boolean
  type DisableScaleIn                       = Boolean
  type ForecastDataType                     = String
  type LoadMetricType                       = String
  type MaxResults                           = Int
  type MetricDimensionName                  = String
  type MetricDimensionValue                 = String
  type MetricDimensions                     = js.Array[MetricDimension]
  type MetricName                           = String
  type MetricNamespace                      = String
  type MetricScale                          = Double
  type MetricStatistic                      = String
  type MetricUnit                           = String
  type NextToken                            = String
  type PolicyName                           = String
  type PolicyType                           = String
  type PredictiveScalingMaxCapacityBehavior = String
  type PredictiveScalingMode                = String
  type ResourceCapacity                     = Int
  type ResourceIdMaxLen1600                 = String
  type ResourceLabel                        = String
  type ScalableDimension                    = String
  type ScalingInstructions                  = js.Array[ScalingInstruction]
  type ScalingMetricType                    = String
  type ScalingPlanName                      = String
  type ScalingPlanNames                     = js.Array[ScalingPlanName]
  type ScalingPlanResources                 = js.Array[ScalingPlanResource]
  type ScalingPlanStatusCode                = String
  type ScalingPlanVersion                   = Double
  type ScalingPlans                         = js.Array[ScalingPlan]
  type ScalingPolicies                      = js.Array[ScalingPolicy]
  type ScalingPolicyUpdateBehavior          = String
  type ScalingStatusCode                    = String
  type ScheduledActionBufferTime            = Int
  type ServiceNamespace                     = String
  type TagFilters                           = js.Array[TagFilter]
  type TagValues                            = js.Array[XmlStringMaxLen256]
  type TargetTrackingConfigurations         = js.Array[TargetTrackingConfiguration]
  type TimestampType                        = js.Date
  type XmlString                            = String
  type XmlStringMaxLen128                   = String
  type XmlStringMaxLen256                   = String

  implicit final class AutoScalingPlansOps(val service: AutoScalingPlans) extends AnyVal {

    def createScalingPlanFuture(params: CreateScalingPlanRequest): Future[CreateScalingPlanResponse] =
      service.createScalingPlan(params).promise.toFuture
    def deleteScalingPlanFuture(params: DeleteScalingPlanRequest): Future[DeleteScalingPlanResponse] =
      service.deleteScalingPlan(params).promise.toFuture
    def describeScalingPlanResourcesFuture(
        params: DescribeScalingPlanResourcesRequest
    ): Future[DescribeScalingPlanResourcesResponse] = service.describeScalingPlanResources(params).promise.toFuture
    def describeScalingPlansFuture(params: DescribeScalingPlansRequest): Future[DescribeScalingPlansResponse] =
      service.describeScalingPlans(params).promise.toFuture
    def getScalingPlanResourceForecastDataFuture(
        params: GetScalingPlanResourceForecastDataRequest
    ): Future[GetScalingPlanResourceForecastDataResponse] =
      service.getScalingPlanResourceForecastData(params).promise.toFuture
    def updateScalingPlanFuture(params: UpdateScalingPlanRequest): Future[UpdateScalingPlanResponse] =
      service.updateScalingPlan(params).promise.toFuture
  }
}

package autoscalingplans {
  @js.native
  @JSImport("aws-sdk", "AutoScalingPlans")
  class AutoScalingPlans() extends js.Object {
    def this(config: AWSConfig) = this()

    def createScalingPlan(params: CreateScalingPlanRequest): Request[CreateScalingPlanResponse] = js.native
    def deleteScalingPlan(params: DeleteScalingPlanRequest): Request[DeleteScalingPlanResponse] = js.native
    def describeScalingPlanResources(
        params: DescribeScalingPlanResourcesRequest
    ): Request[DescribeScalingPlanResourcesResponse]                                                     = js.native
    def describeScalingPlans(params: DescribeScalingPlansRequest): Request[DescribeScalingPlansResponse] = js.native
    def getScalingPlanResourceForecastData(
        params: GetScalingPlanResourceForecastDataRequest
    ): Request[GetScalingPlanResourceForecastDataResponse]                                      = js.native
    def updateScalingPlan(params: UpdateScalingPlanRequest): Request[UpdateScalingPlanResponse] = js.native
  }

  /**
    * Represents an application source.
    */
  @js.native
  trait ApplicationSource extends js.Object {
    var CloudFormationStackARN: js.UndefOr[XmlString]
    var TagFilters: js.UndefOr[TagFilters]
  }

  object ApplicationSource {
    def apply(
        CloudFormationStackARN: js.UndefOr[XmlString] = js.undefined,
        TagFilters: js.UndefOr[TagFilters] = js.undefined
    ): ApplicationSource = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudFormationStackARN.foreach(__v => __obj.update("CloudFormationStackARN", __v.asInstanceOf[js.Any]))
      TagFilters.foreach(__v => __obj.update("TagFilters", __v.asInstanceOf[js.Any]))
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
    def apply(
        ApplicationSource: ApplicationSource,
        ScalingInstructions: ScalingInstructions,
        ScalingPlanName: ScalingPlanName
    ): CreateScalingPlanRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationSource"   -> ApplicationSource.asInstanceOf[js.Any],
        "ScalingInstructions" -> ScalingInstructions.asInstanceOf[js.Any],
        "ScalingPlanName"     -> ScalingPlanName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateScalingPlanRequest]
    }
  }

  @js.native
  trait CreateScalingPlanResponse extends js.Object {
    var ScalingPlanVersion: ScalingPlanVersion
  }

  object CreateScalingPlanResponse {
    def apply(
        ScalingPlanVersion: ScalingPlanVersion
    ): CreateScalingPlanResponse = {
      val __obj = js.Dictionary[js.Any](
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateScalingPlanResponse]
    }
  }

  /**
    * Represents a CloudWatch metric of your choosing that can be used for predictive scaling.
    *  For predictive scaling to work with a customized load metric specification, AWS Auto Scaling needs access to the <code>Sum</code> and <code>Average</code> statistics that CloudWatch computes from metric data. Statistics are calculations used to aggregate data over specified time periods.
    *  When you choose a load metric, make sure that the required <code>Sum</code> and <code>Average</code> statistics for your metric are available in CloudWatch and that they provide relevant data for predictive scaling. The <code>Sum</code> statistic must represent the total load on the resource, and the <code>Average</code> statistic must represent the average load per capacity unit of the resource. For example, there is a metric that counts the number of requests processed by your Auto Scaling group. If the <code>Sum</code> statistic represents the total request count processed by the group, then the <code>Average</code> statistic for the specified metric must represent the average request count processed by each instance of the group.
    *  For information about terminology, available metrics, or how to publish new metrics, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]] in the <i>Amazon CloudWatch User Guide</i>.
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
    def apply(
        MetricName: MetricName,
        Namespace: MetricNamespace,
        Statistic: MetricStatistic,
        Dimensions: js.UndefOr[MetricDimensions] = js.undefined,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): CustomizedLoadMetricSpecification = {
      val __obj = js.Dictionary[js.Any](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace"  -> Namespace.asInstanceOf[js.Any],
        "Statistic"  -> Statistic.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomizedLoadMetricSpecification]
    }
  }

  /**
    * Represents a CloudWatch metric of your choosing that can be used for dynamic scaling as part of a target tracking scaling policy.
    *  To create your customized scaling metric specification:
    * * Add values for each required parameter from CloudWatch. You can use an existing metric, or a new metric that you create. To use your own metric, you must first publish the metric to CloudWatch. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html|Publish Custom Metrics]] in the <i>Amazon CloudWatch User Guide</i>.
    *  * Choose a metric that changes proportionally with capacity. The value of the metric should increase or decrease in inverse proportion to the number of capacity units. That is, the value of the metric should decrease when capacity increases.
    * For more information about CloudWatch, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]].
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
    def apply(
        MetricName: MetricName,
        Namespace: MetricNamespace,
        Statistic: MetricStatistic,
        Dimensions: js.UndefOr[MetricDimensions] = js.undefined,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): CustomizedScalingMetricSpecification = {
      val __obj = js.Dictionary[js.Any](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace"  -> Namespace.asInstanceOf[js.Any],
        "Statistic"  -> Statistic.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomizedScalingMetricSpecification]
    }
  }

  /**
    * Represents a single value in the forecast data used for predictive scaling.
    */
  @js.native
  trait Datapoint extends js.Object {
    var Timestamp: js.UndefOr[TimestampType]
    var Value: js.UndefOr[MetricScale]
  }

  object Datapoint {
    def apply(
        Timestamp: js.UndefOr[TimestampType] = js.undefined,
        Value: js.UndefOr[MetricScale] = js.undefined
    ): Datapoint = {
      val __obj = js.Dictionary.empty[js.Any]
      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Datapoint]
    }
  }

  @js.native
  trait DeleteScalingPlanRequest extends js.Object {
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
  }

  object DeleteScalingPlanRequest {
    def apply(
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion
    ): DeleteScalingPlanRequest = {
      val __obj = js.Dictionary[js.Any](
        "ScalingPlanName"    -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteScalingPlanRequest]
    }
  }

  @js.native
  trait DeleteScalingPlanResponse extends js.Object {}

  object DeleteScalingPlanResponse {
    def apply(
        ): DeleteScalingPlanResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeScalingPlanResourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ScalingPlanName"    -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPlanResourcesRequest]
    }
  }

  @js.native
  trait DescribeScalingPlanResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScalingPlanResources: js.UndefOr[ScalingPlanResources]
  }

  object DescribeScalingPlanResourcesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScalingPlanResources: js.UndefOr[ScalingPlanResources] = js.undefined
    ): DescribeScalingPlanResourcesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ScalingPlanResources.foreach(__v => __obj.update("ScalingPlanResources", __v.asInstanceOf[js.Any]))
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
    def apply(
        ApplicationSources: js.UndefOr[ApplicationSources] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScalingPlanNames: js.UndefOr[ScalingPlanNames] = js.undefined,
        ScalingPlanVersion: js.UndefOr[ScalingPlanVersion] = js.undefined
    ): DescribeScalingPlansRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationSources.foreach(__v => __obj.update("ApplicationSources", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ScalingPlanNames.foreach(__v => __obj.update("ScalingPlanNames", __v.asInstanceOf[js.Any]))
      ScalingPlanVersion.foreach(__v => __obj.update("ScalingPlanVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPlansRequest]
    }
  }

  @js.native
  trait DescribeScalingPlansResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScalingPlans: js.UndefOr[ScalingPlans]
  }

  object DescribeScalingPlansResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScalingPlans: js.UndefOr[ScalingPlans] = js.undefined
    ): DescribeScalingPlansResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ScalingPlans.foreach(__v => __obj.update("ScalingPlans", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPlansResponse]
    }
  }

  object ForecastDataTypeEnum {
    val CapacityForecast           = "CapacityForecast"
    val LoadForecast               = "LoadForecast"
    val ScheduledActionMinCapacity = "ScheduledActionMinCapacity"
    val ScheduledActionMaxCapacity = "ScheduledActionMaxCapacity"

    val values = IndexedSeq(CapacityForecast, LoadForecast, ScheduledActionMinCapacity, ScheduledActionMaxCapacity)
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
      val __obj = js.Dictionary[js.Any](
        "EndTime"            -> EndTime.asInstanceOf[js.Any],
        "ForecastDataType"   -> ForecastDataType.asInstanceOf[js.Any],
        "ResourceId"         -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension"  -> ScalableDimension.asInstanceOf[js.Any],
        "ScalingPlanName"    -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any],
        "ServiceNamespace"   -> ServiceNamespace.asInstanceOf[js.Any],
        "StartTime"          -> StartTime.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetScalingPlanResourceForecastDataRequest]
    }
  }

  @js.native
  trait GetScalingPlanResourceForecastDataResponse extends js.Object {
    var Datapoints: Datapoints
  }

  object GetScalingPlanResourceForecastDataResponse {
    def apply(
        Datapoints: Datapoints
    ): GetScalingPlanResourceForecastDataResponse = {
      val __obj = js.Dictionary[js.Any](
        "Datapoints" -> Datapoints.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetScalingPlanResourceForecastDataResponse]
    }
  }

  object LoadMetricTypeEnum {
    val ASGTotalCPUUtilization     = "ASGTotalCPUUtilization"
    val ASGTotalNetworkIn          = "ASGTotalNetworkIn"
    val ASGTotalNetworkOut         = "ASGTotalNetworkOut"
    val ALBTargetGroupRequestCount = "ALBTargetGroupRequestCount"

    val values = IndexedSeq(ASGTotalCPUUtilization, ASGTotalNetworkIn, ASGTotalNetworkOut, ALBTargetGroupRequestCount)
  }

  /**
    * Represents a dimension for a customized metric.
    */
  @js.native
  trait MetricDimension extends js.Object {
    var Name: MetricDimensionName
    var Value: MetricDimensionValue
  }

  object MetricDimension {
    def apply(
        Name: MetricDimensionName,
        Value: MetricDimensionValue
    ): MetricDimension = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MetricDimension]
    }
  }

  object MetricStatisticEnum {
    val Average     = "Average"
    val Minimum     = "Minimum"
    val Maximum     = "Maximum"
    val SampleCount = "SampleCount"
    val Sum         = "Sum"

    val values = IndexedSeq(Average, Minimum, Maximum, SampleCount, Sum)
  }

  object PolicyTypeEnum {
    val TargetTrackingScaling = "TargetTrackingScaling"

    val values = IndexedSeq(TargetTrackingScaling)
  }

  /**
    * Represents a predefined metric that can be used for predictive scaling.
    */
  @js.native
  trait PredefinedLoadMetricSpecification extends js.Object {
    var PredefinedLoadMetricType: LoadMetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  object PredefinedLoadMetricSpecification {
    def apply(
        PredefinedLoadMetricType: LoadMetricType,
        ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
    ): PredefinedLoadMetricSpecification = {
      val __obj = js.Dictionary[js.Any](
        "PredefinedLoadMetricType" -> PredefinedLoadMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.update("ResourceLabel", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredefinedLoadMetricSpecification]
    }
  }

  /**
    * Represents a predefined metric that can be used for dynamic scaling as part of a target tracking scaling policy.
    */
  @js.native
  trait PredefinedScalingMetricSpecification extends js.Object {
    var PredefinedScalingMetricType: ScalingMetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  object PredefinedScalingMetricSpecification {
    def apply(
        PredefinedScalingMetricType: ScalingMetricType,
        ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
    ): PredefinedScalingMetricSpecification = {
      val __obj = js.Dictionary[js.Any](
        "PredefinedScalingMetricType" -> PredefinedScalingMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.update("ResourceLabel", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredefinedScalingMetricSpecification]
    }
  }

  object PredictiveScalingMaxCapacityBehaviorEnum {
    val SetForecastCapacityToMaxCapacity    = "SetForecastCapacityToMaxCapacity"
    val SetMaxCapacityToForecastCapacity    = "SetMaxCapacityToForecastCapacity"
    val SetMaxCapacityAboveForecastCapacity = "SetMaxCapacityAboveForecastCapacity"

    val values = IndexedSeq(
      SetForecastCapacityToMaxCapacity,
      SetMaxCapacityToForecastCapacity,
      SetMaxCapacityAboveForecastCapacity
    )
  }

  object PredictiveScalingModeEnum {
    val ForecastAndScale = "ForecastAndScale"
    val ForecastOnly     = "ForecastOnly"

    val values = IndexedSeq(ForecastAndScale, ForecastOnly)
  }

  object ScalableDimensionEnum {
    val `autoscaling:autoScalingGroup:DesiredCapacity` = "autoscaling:autoScalingGroup:DesiredCapacity"
    val `ecs:service:DesiredCount`                     = "ecs:service:DesiredCount"
    val `ec2:spot-fleet-request:TargetCapacity`        = "ec2:spot-fleet-request:TargetCapacity"
    val `rds:cluster:ReadReplicaCount`                 = "rds:cluster:ReadReplicaCount"
    val `dynamodb:table:ReadCapacityUnits`             = "dynamodb:table:ReadCapacityUnits"
    val `dynamodb:table:WriteCapacityUnits`            = "dynamodb:table:WriteCapacityUnits"
    val `dynamodb:index:ReadCapacityUnits`             = "dynamodb:index:ReadCapacityUnits"
    val `dynamodb:index:WriteCapacityUnits`            = "dynamodb:index:WriteCapacityUnits"

    val values = IndexedSeq(
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

  /**
    * Describes a scaling instruction for a scalable resource.
    *  The scaling instruction is used in combination with a scaling plan, which is a set of instructions for configuring dynamic scaling and predictive scaling for the scalable resources in your application. Each scaling instruction applies to one resource.
    *  AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions. Target tracking scaling policies adjust the capacity of your scalable resource as required to maintain resource utilization at the target value that you specified.
    *  AWS Auto Scaling also configures predictive scaling for your Amazon EC2 Auto Scaling groups using a subset of parameters, including the load metric, the scaling metric, the target value for the scaling metric, the predictive scaling mode (forecast and scale or forecast only), and the desired behavior when the forecast capacity exceeds the maximum capacity of the resource. With predictive scaling, AWS Auto Scaling generates forecasts with traffic predictions for the two days ahead and schedules scaling actions that proactively add and remove resource capacity to match the forecast.
    *  We recommend waiting a minimum of 24 hours after creating an Auto Scaling group to configure predictive scaling. At minimum, there must be 24 hours of historical data to generate a forecast.
    *  For more information, see [[https://docs.aws.amazon.com/autoscaling/plans/userguide/auto-scaling-getting-started.html|Getting Started with AWS Auto Scaling]].
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
      val __obj = js.Dictionary[js.Any](
        "MaxCapacity"                  -> MaxCapacity.asInstanceOf[js.Any],
        "MinCapacity"                  -> MinCapacity.asInstanceOf[js.Any],
        "ResourceId"                   -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension"            -> ScalableDimension.asInstanceOf[js.Any],
        "ServiceNamespace"             -> ServiceNamespace.asInstanceOf[js.Any],
        "TargetTrackingConfigurations" -> TargetTrackingConfigurations.asInstanceOf[js.Any]
      )

      CustomizedLoadMetricSpecification.foreach(
        __v => __obj.update("CustomizedLoadMetricSpecification", __v.asInstanceOf[js.Any])
      )
      DisableDynamicScaling.foreach(__v => __obj.update("DisableDynamicScaling", __v.asInstanceOf[js.Any]))
      PredefinedLoadMetricSpecification.foreach(
        __v => __obj.update("PredefinedLoadMetricSpecification", __v.asInstanceOf[js.Any])
      )
      PredictiveScalingMaxCapacityBehavior.foreach(
        __v => __obj.update("PredictiveScalingMaxCapacityBehavior", __v.asInstanceOf[js.Any])
      )
      PredictiveScalingMaxCapacityBuffer.foreach(
        __v => __obj.update("PredictiveScalingMaxCapacityBuffer", __v.asInstanceOf[js.Any])
      )
      PredictiveScalingMode.foreach(__v => __obj.update("PredictiveScalingMode", __v.asInstanceOf[js.Any]))
      ScalingPolicyUpdateBehavior.foreach(__v => __obj.update("ScalingPolicyUpdateBehavior", __v.asInstanceOf[js.Any]))
      ScheduledActionBufferTime.foreach(__v => __obj.update("ScheduledActionBufferTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingInstruction]
    }
  }

  object ScalingMetricTypeEnum {
    val ASGAverageCPUUtilization                 = "ASGAverageCPUUtilization"
    val ASGAverageNetworkIn                      = "ASGAverageNetworkIn"
    val ASGAverageNetworkOut                     = "ASGAverageNetworkOut"
    val DynamoDBReadCapacityUtilization          = "DynamoDBReadCapacityUtilization"
    val DynamoDBWriteCapacityUtilization         = "DynamoDBWriteCapacityUtilization"
    val ECSServiceAverageCPUUtilization          = "ECSServiceAverageCPUUtilization"
    val ECSServiceAverageMemoryUtilization       = "ECSServiceAverageMemoryUtilization"
    val ALBRequestCountPerTarget                 = "ALBRequestCountPerTarget"
    val RDSReaderAverageCPUUtilization           = "RDSReaderAverageCPUUtilization"
    val RDSReaderAverageDatabaseConnections      = "RDSReaderAverageDatabaseConnections"
    val EC2SpotFleetRequestAverageCPUUtilization = "EC2SpotFleetRequestAverageCPUUtilization"
    val EC2SpotFleetRequestAverageNetworkIn      = "EC2SpotFleetRequestAverageNetworkIn"
    val EC2SpotFleetRequestAverageNetworkOut     = "EC2SpotFleetRequestAverageNetworkOut"

    val values = IndexedSeq(
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

  /**
    * Represents a scaling plan.
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationSource"   -> ApplicationSource.asInstanceOf[js.Any],
        "ScalingInstructions" -> ScalingInstructions.asInstanceOf[js.Any],
        "ScalingPlanName"     -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion"  -> ScalingPlanVersion.asInstanceOf[js.Any],
        "StatusCode"          -> StatusCode.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      StatusStartTime.foreach(__v => __obj.update("StatusStartTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPlan]
    }
  }

  /**
    * Represents a scalable resource.
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
      val __obj = js.Dictionary[js.Any](
        "ResourceId"         -> ResourceId.asInstanceOf[js.Any],
        "ScalableDimension"  -> ScalableDimension.asInstanceOf[js.Any],
        "ScalingPlanName"    -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any],
        "ScalingStatusCode"  -> ScalingStatusCode.asInstanceOf[js.Any],
        "ServiceNamespace"   -> ServiceNamespace.asInstanceOf[js.Any]
      )

      ScalingPolicies.foreach(__v => __obj.update("ScalingPolicies", __v.asInstanceOf[js.Any]))
      ScalingStatusMessage.foreach(__v => __obj.update("ScalingStatusMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPlanResource]
    }
  }

  object ScalingPlanStatusCodeEnum {
    val Active             = "Active"
    val ActiveWithProblems = "ActiveWithProblems"
    val CreationInProgress = "CreationInProgress"
    val CreationFailed     = "CreationFailed"
    val DeletionInProgress = "DeletionInProgress"
    val DeletionFailed     = "DeletionFailed"
    val UpdateInProgress   = "UpdateInProgress"
    val UpdateFailed       = "UpdateFailed"

    val values = IndexedSeq(
      Active,
      ActiveWithProblems,
      CreationInProgress,
      CreationFailed,
      DeletionInProgress,
      DeletionFailed,
      UpdateInProgress,
      UpdateFailed
    )
  }

  /**
    * Represents a scaling policy.
    */
  @js.native
  trait ScalingPolicy extends js.Object {
    var PolicyName: PolicyName
    var PolicyType: PolicyType
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  object ScalingPolicy {
    def apply(
        PolicyName: PolicyName,
        PolicyType: PolicyType,
        TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
    ): ScalingPolicy = {
      val __obj = js.Dictionary[js.Any](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "PolicyType" -> PolicyType.asInstanceOf[js.Any]
      )

      TargetTrackingConfiguration.foreach(__v => __obj.update("TargetTrackingConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPolicy]
    }
  }

  object ScalingPolicyUpdateBehaviorEnum {
    val KeepExternalPolicies    = "KeepExternalPolicies"
    val ReplaceExternalPolicies = "ReplaceExternalPolicies"

    val values = IndexedSeq(KeepExternalPolicies, ReplaceExternalPolicies)
  }

  object ScalingStatusCodeEnum {
    val Inactive        = "Inactive"
    val PartiallyActive = "PartiallyActive"
    val Active          = "Active"

    val values = IndexedSeq(Inactive, PartiallyActive, Active)
  }

  object ServiceNamespaceEnum {
    val autoscaling = "autoscaling"
    val ecs         = "ecs"
    val ec2         = "ec2"
    val rds         = "rds"
    val dynamodb    = "dynamodb"

    val values = IndexedSeq(autoscaling, ecs, ec2, rds, dynamodb)
  }

  /**
    * Represents a tag.
    */
  @js.native
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[XmlStringMaxLen128]
    var Values: js.UndefOr[TagValues]
  }

  object TagFilter {
    def apply(
        Key: js.UndefOr[XmlStringMaxLen128] = js.undefined,
        Values: js.UndefOr[TagValues] = js.undefined
    ): TagFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagFilter]
    }
  }

  /**
    * Describes a target tracking configuration to use with AWS Auto Scaling. Used with <a>ScalingInstruction</a> and <a>ScalingPolicy</a>.
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
    def apply(
        TargetValue: MetricScale,
        CustomizedScalingMetricSpecification: js.UndefOr[CustomizedScalingMetricSpecification] = js.undefined,
        DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
        EstimatedInstanceWarmup: js.UndefOr[Cooldown] = js.undefined,
        PredefinedScalingMetricSpecification: js.UndefOr[PredefinedScalingMetricSpecification] = js.undefined,
        ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined,
        ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
    ): TargetTrackingConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      )

      CustomizedScalingMetricSpecification.foreach(
        __v => __obj.update("CustomizedScalingMetricSpecification", __v.asInstanceOf[js.Any])
      )
      DisableScaleIn.foreach(__v => __obj.update("DisableScaleIn", __v.asInstanceOf[js.Any]))
      EstimatedInstanceWarmup.foreach(__v => __obj.update("EstimatedInstanceWarmup", __v.asInstanceOf[js.Any]))
      PredefinedScalingMetricSpecification.foreach(
        __v => __obj.update("PredefinedScalingMetricSpecification", __v.asInstanceOf[js.Any])
      )
      ScaleInCooldown.foreach(__v => __obj.update("ScaleInCooldown", __v.asInstanceOf[js.Any]))
      ScaleOutCooldown.foreach(__v => __obj.update("ScaleOutCooldown", __v.asInstanceOf[js.Any]))
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
    def apply(
        ScalingPlanName: ScalingPlanName,
        ScalingPlanVersion: ScalingPlanVersion,
        ApplicationSource: js.UndefOr[ApplicationSource] = js.undefined,
        ScalingInstructions: js.UndefOr[ScalingInstructions] = js.undefined
    ): UpdateScalingPlanRequest = {
      val __obj = js.Dictionary[js.Any](
        "ScalingPlanName"    -> ScalingPlanName.asInstanceOf[js.Any],
        "ScalingPlanVersion" -> ScalingPlanVersion.asInstanceOf[js.Any]
      )

      ApplicationSource.foreach(__v => __obj.update("ApplicationSource", __v.asInstanceOf[js.Any]))
      ScalingInstructions.foreach(__v => __obj.update("ScalingInstructions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateScalingPlanRequest]
    }
  }

  @js.native
  trait UpdateScalingPlanResponse extends js.Object {}

  object UpdateScalingPlanResponse {
    def apply(
        ): UpdateScalingPlanResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateScalingPlanResponse]
    }
  }
}
