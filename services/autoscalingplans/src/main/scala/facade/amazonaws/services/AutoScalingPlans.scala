package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object autoscalingplans {
  type ApplicationSources           = js.Array[ApplicationSource]
  type Cooldown                     = Int
  type Datapoints                   = js.Array[Datapoint]
  type DisableDynamicScaling        = Boolean
  type DisableScaleIn               = Boolean
  type MaxResults                   = Int
  type MetricDimensionName          = String
  type MetricDimensionValue         = String
  type MetricDimensions             = js.Array[MetricDimension]
  type MetricName                   = String
  type MetricNamespace              = String
  type MetricScale                  = Double
  type MetricUnit                   = String
  type NextToken                    = String
  type PolicyName                   = String
  type ResourceCapacity             = Int
  type ResourceIdMaxLen1600         = String
  type ResourceLabel                = String
  type ScalingInstructions          = js.Array[ScalingInstruction]
  type ScalingPlanName              = String
  type ScalingPlanNames             = js.Array[ScalingPlanName]
  type ScalingPlanResources         = js.Array[ScalingPlanResource]
  type ScalingPlanVersion           = Double
  type ScalingPlans                 = js.Array[ScalingPlan]
  type ScalingPolicies              = js.Array[ScalingPolicy]
  type ScheduledActionBufferTime    = Int
  type TagFilters                   = js.Array[TagFilter]
  type TagValues                    = js.Array[XmlStringMaxLen256]
  type TargetTrackingConfigurations = js.Array[TargetTrackingConfiguration]
  type TimestampType                = js.Date
  type XmlString                    = String
  type XmlStringMaxLen128           = String
  type XmlStringMaxLen256           = String

  implicit final class AutoScalingPlansOps(private val service: AutoScalingPlans) extends AnyVal {

    @inline def createScalingPlanFuture(params: CreateScalingPlanRequest): Future[CreateScalingPlanResponse] =
      service.createScalingPlan(params).promise().toFuture
    @inline def deleteScalingPlanFuture(params: DeleteScalingPlanRequest): Future[DeleteScalingPlanResponse] =
      service.deleteScalingPlan(params).promise().toFuture
    @inline def describeScalingPlanResourcesFuture(
        params: DescribeScalingPlanResourcesRequest
    ): Future[DescribeScalingPlanResourcesResponse] = service.describeScalingPlanResources(params).promise().toFuture
    @inline def describeScalingPlansFuture(params: DescribeScalingPlansRequest): Future[DescribeScalingPlansResponse] =
      service.describeScalingPlans(params).promise().toFuture
    @inline def getScalingPlanResourceForecastDataFuture(
        params: GetScalingPlanResourceForecastDataRequest
    ): Future[GetScalingPlanResourceForecastDataResponse] =
      service.getScalingPlanResourceForecastData(params).promise().toFuture
    @inline def updateScalingPlanFuture(params: UpdateScalingPlanRequest): Future[UpdateScalingPlanResponse] =
      service.updateScalingPlan(params).promise().toFuture
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
  @Factory
  trait ApplicationSource extends js.Object {
    var CloudFormationStackARN: js.UndefOr[XmlString]
    var TagFilters: js.UndefOr[TagFilters]
  }

  @js.native
  @Factory
  trait CreateScalingPlanRequest extends js.Object {
    var ApplicationSource: ApplicationSource
    var ScalingInstructions: ScalingInstructions
    var ScalingPlanName: ScalingPlanName
  }

  @js.native
  @Factory
  trait CreateScalingPlanResponse extends js.Object {
    var ScalingPlanVersion: ScalingPlanVersion
  }

  /**
    * Represents a CloudWatch metric of your choosing that can be used for predictive scaling.
    *  For predictive scaling to work with a customized load metric specification, AWS Auto Scaling needs access to the <code>Sum</code> and <code>Average</code> statistics that CloudWatch computes from metric data. Statistics are calculations used to aggregate data over specified time periods.
    *  When you choose a load metric, make sure that the required <code>Sum</code> and <code>Average</code> statistics for your metric are available in CloudWatch and that they provide relevant data for predictive scaling. The <code>Sum</code> statistic must represent the total load on the resource, and the <code>Average</code> statistic must represent the average load per capacity unit of the resource. For example, there is a metric that counts the number of requests processed by your Auto Scaling group. If the <code>Sum</code> statistic represents the total request count processed by the group, then the <code>Average</code> statistic for the specified metric must represent the average request count processed by each instance of the group.
    *  For information about terminology, available metrics, or how to publish new metrics, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]] in the <i>Amazon CloudWatch User Guide</i>.
    */
  @js.native
  @Factory
  trait CustomizedLoadMetricSpecification extends js.Object {
    var MetricName: MetricName
    var Namespace: MetricNamespace
    var Statistic: MetricStatistic
    var Dimensions: js.UndefOr[MetricDimensions]
    var Unit: js.UndefOr[MetricUnit]
  }

  /**
    * Represents a CloudWatch metric of your choosing that can be used for dynamic scaling as part of a target tracking scaling policy.
    *  To create your customized scaling metric specification:
    * * Add values for each required parameter from CloudWatch. You can use an existing metric, or a new metric that you create. To use your own metric, you must first publish the metric to CloudWatch. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html|Publish Custom Metrics]] in the <i>Amazon CloudWatch User Guide</i>.
    *  * Choose a metric that changes proportionally with capacity. The value of the metric should increase or decrease in inverse proportion to the number of capacity units. That is, the value of the metric should decrease when capacity increases.
    * For more information about CloudWatch, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]].
    */
  @js.native
  @Factory
  trait CustomizedScalingMetricSpecification extends js.Object {
    var MetricName: MetricName
    var Namespace: MetricNamespace
    var Statistic: MetricStatistic
    var Dimensions: js.UndefOr[MetricDimensions]
    var Unit: js.UndefOr[MetricUnit]
  }

  /**
    * Represents a single value in the forecast data used for predictive scaling.
    */
  @js.native
  @Factory
  trait Datapoint extends js.Object {
    var Timestamp: js.UndefOr[TimestampType]
    var Value: js.UndefOr[MetricScale]
  }

  @js.native
  @Factory
  trait DeleteScalingPlanRequest extends js.Object {
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
  }

  @js.native
  @Factory
  trait DeleteScalingPlanResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeScalingPlanResourcesRequest extends js.Object {
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeScalingPlanResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScalingPlanResources: js.UndefOr[ScalingPlanResources]
  }

  @js.native
  @Factory
  trait DescribeScalingPlansRequest extends js.Object {
    var ApplicationSources: js.UndefOr[ApplicationSources]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ScalingPlanNames: js.UndefOr[ScalingPlanNames]
    var ScalingPlanVersion: js.UndefOr[ScalingPlanVersion]
  }

  @js.native
  @Factory
  trait DescribeScalingPlansResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ScalingPlans: js.UndefOr[ScalingPlans]
  }

  @js.native
  sealed trait ForecastDataType extends js.Any
  object ForecastDataType extends js.Object {
    val CapacityForecast           = "CapacityForecast".asInstanceOf[ForecastDataType]
    val LoadForecast               = "LoadForecast".asInstanceOf[ForecastDataType]
    val ScheduledActionMinCapacity = "ScheduledActionMinCapacity".asInstanceOf[ForecastDataType]
    val ScheduledActionMaxCapacity = "ScheduledActionMaxCapacity".asInstanceOf[ForecastDataType]

    val values =
      js.Object.freeze(js.Array(CapacityForecast, LoadForecast, ScheduledActionMinCapacity, ScheduledActionMaxCapacity))
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetScalingPlanResourceForecastDataResponse extends js.Object {
    var Datapoints: Datapoints
  }

  @js.native
  sealed trait LoadMetricType extends js.Any
  object LoadMetricType extends js.Object {
    val ASGTotalCPUUtilization     = "ASGTotalCPUUtilization".asInstanceOf[LoadMetricType]
    val ASGTotalNetworkIn          = "ASGTotalNetworkIn".asInstanceOf[LoadMetricType]
    val ASGTotalNetworkOut         = "ASGTotalNetworkOut".asInstanceOf[LoadMetricType]
    val ALBTargetGroupRequestCount = "ALBTargetGroupRequestCount".asInstanceOf[LoadMetricType]

    val values = js.Object.freeze(
      js.Array(ASGTotalCPUUtilization, ASGTotalNetworkIn, ASGTotalNetworkOut, ALBTargetGroupRequestCount)
    )
  }

  /**
    * Represents a dimension for a customized metric.
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
  sealed trait PolicyType extends js.Any
  object PolicyType extends js.Object {
    val TargetTrackingScaling = "TargetTrackingScaling".asInstanceOf[PolicyType]

    val values = js.Object.freeze(js.Array(TargetTrackingScaling))
  }

  /**
    * Represents a predefined metric that can be used for predictive scaling.
    */
  @js.native
  @Factory
  trait PredefinedLoadMetricSpecification extends js.Object {
    var PredefinedLoadMetricType: LoadMetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  /**
    * Represents a predefined metric that can be used for dynamic scaling as part of a target tracking scaling policy.
    */
  @js.native
  @Factory
  trait PredefinedScalingMetricSpecification extends js.Object {
    var PredefinedScalingMetricType: ScalingMetricType
    var ResourceLabel: js.UndefOr[ResourceLabel]
  }

  @js.native
  sealed trait PredictiveScalingMaxCapacityBehavior extends js.Any
  object PredictiveScalingMaxCapacityBehavior extends js.Object {
    val SetForecastCapacityToMaxCapacity =
      "SetForecastCapacityToMaxCapacity".asInstanceOf[PredictiveScalingMaxCapacityBehavior]
    val SetMaxCapacityToForecastCapacity =
      "SetMaxCapacityToForecastCapacity".asInstanceOf[PredictiveScalingMaxCapacityBehavior]
    val SetMaxCapacityAboveForecastCapacity =
      "SetMaxCapacityAboveForecastCapacity".asInstanceOf[PredictiveScalingMaxCapacityBehavior]

    val values = js.Object.freeze(
      js.Array(SetForecastCapacityToMaxCapacity, SetMaxCapacityToForecastCapacity, SetMaxCapacityAboveForecastCapacity)
    )
  }

  @js.native
  sealed trait PredictiveScalingMode extends js.Any
  object PredictiveScalingMode extends js.Object {
    val ForecastAndScale = "ForecastAndScale".asInstanceOf[PredictiveScalingMode]
    val ForecastOnly     = "ForecastOnly".asInstanceOf[PredictiveScalingMode]

    val values = js.Object.freeze(js.Array(ForecastAndScale, ForecastOnly))
  }

  @js.native
  sealed trait ScalableDimension extends js.Any
  object ScalableDimension extends js.Object {
    val `autoscaling:autoScalingGroup:DesiredCapacity` =
      "autoscaling:autoScalingGroup:DesiredCapacity".asInstanceOf[ScalableDimension]
    val `ecs:service:DesiredCount` = "ecs:service:DesiredCount".asInstanceOf[ScalableDimension]
    val `ec2:spot-fleet-request:TargetCapacity` =
      "ec2:spot-fleet-request:TargetCapacity".asInstanceOf[ScalableDimension]
    val `rds:cluster:ReadReplicaCount`      = "rds:cluster:ReadReplicaCount".asInstanceOf[ScalableDimension]
    val `dynamodb:table:ReadCapacityUnits`  = "dynamodb:table:ReadCapacityUnits".asInstanceOf[ScalableDimension]
    val `dynamodb:table:WriteCapacityUnits` = "dynamodb:table:WriteCapacityUnits".asInstanceOf[ScalableDimension]
    val `dynamodb:index:ReadCapacityUnits`  = "dynamodb:index:ReadCapacityUnits".asInstanceOf[ScalableDimension]
    val `dynamodb:index:WriteCapacityUnits` = "dynamodb:index:WriteCapacityUnits".asInstanceOf[ScalableDimension]

    val values = js.Object.freeze(
      js.Array(
        `autoscaling:autoScalingGroup:DesiredCapacity`,
        `ecs:service:DesiredCount`,
        `ec2:spot-fleet-request:TargetCapacity`,
        `rds:cluster:ReadReplicaCount`,
        `dynamodb:table:ReadCapacityUnits`,
        `dynamodb:table:WriteCapacityUnits`,
        `dynamodb:index:ReadCapacityUnits`,
        `dynamodb:index:WriteCapacityUnits`
      )
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
  @Factory
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

  @js.native
  sealed trait ScalingMetricType extends js.Any
  object ScalingMetricType extends js.Object {
    val ASGAverageCPUUtilization            = "ASGAverageCPUUtilization".asInstanceOf[ScalingMetricType]
    val ASGAverageNetworkIn                 = "ASGAverageNetworkIn".asInstanceOf[ScalingMetricType]
    val ASGAverageNetworkOut                = "ASGAverageNetworkOut".asInstanceOf[ScalingMetricType]
    val DynamoDBReadCapacityUtilization     = "DynamoDBReadCapacityUtilization".asInstanceOf[ScalingMetricType]
    val DynamoDBWriteCapacityUtilization    = "DynamoDBWriteCapacityUtilization".asInstanceOf[ScalingMetricType]
    val ECSServiceAverageCPUUtilization     = "ECSServiceAverageCPUUtilization".asInstanceOf[ScalingMetricType]
    val ECSServiceAverageMemoryUtilization  = "ECSServiceAverageMemoryUtilization".asInstanceOf[ScalingMetricType]
    val ALBRequestCountPerTarget            = "ALBRequestCountPerTarget".asInstanceOf[ScalingMetricType]
    val RDSReaderAverageCPUUtilization      = "RDSReaderAverageCPUUtilization".asInstanceOf[ScalingMetricType]
    val RDSReaderAverageDatabaseConnections = "RDSReaderAverageDatabaseConnections".asInstanceOf[ScalingMetricType]
    val EC2SpotFleetRequestAverageCPUUtilization =
      "EC2SpotFleetRequestAverageCPUUtilization".asInstanceOf[ScalingMetricType]
    val EC2SpotFleetRequestAverageNetworkIn  = "EC2SpotFleetRequestAverageNetworkIn".asInstanceOf[ScalingMetricType]
    val EC2SpotFleetRequestAverageNetworkOut = "EC2SpotFleetRequestAverageNetworkOut".asInstanceOf[ScalingMetricType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Represents a scaling plan.
    */
  @js.native
  @Factory
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

  /**
    * Represents a scalable resource.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ScalingPlanStatusCode extends js.Any
  object ScalingPlanStatusCode extends js.Object {
    val Active             = "Active".asInstanceOf[ScalingPlanStatusCode]
    val ActiveWithProblems = "ActiveWithProblems".asInstanceOf[ScalingPlanStatusCode]
    val CreationInProgress = "CreationInProgress".asInstanceOf[ScalingPlanStatusCode]
    val CreationFailed     = "CreationFailed".asInstanceOf[ScalingPlanStatusCode]
    val DeletionInProgress = "DeletionInProgress".asInstanceOf[ScalingPlanStatusCode]
    val DeletionFailed     = "DeletionFailed".asInstanceOf[ScalingPlanStatusCode]
    val UpdateInProgress   = "UpdateInProgress".asInstanceOf[ScalingPlanStatusCode]
    val UpdateFailed       = "UpdateFailed".asInstanceOf[ScalingPlanStatusCode]

    val values = js.Object.freeze(
      js.Array(
        Active,
        ActiveWithProblems,
        CreationInProgress,
        CreationFailed,
        DeletionInProgress,
        DeletionFailed,
        UpdateInProgress,
        UpdateFailed
      )
    )
  }

  /**
    * Represents a scaling policy.
    */
  @js.native
  @Factory
  trait ScalingPolicy extends js.Object {
    var PolicyName: PolicyName
    var PolicyType: PolicyType
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  @js.native
  sealed trait ScalingPolicyUpdateBehavior extends js.Any
  object ScalingPolicyUpdateBehavior extends js.Object {
    val KeepExternalPolicies    = "KeepExternalPolicies".asInstanceOf[ScalingPolicyUpdateBehavior]
    val ReplaceExternalPolicies = "ReplaceExternalPolicies".asInstanceOf[ScalingPolicyUpdateBehavior]

    val values = js.Object.freeze(js.Array(KeepExternalPolicies, ReplaceExternalPolicies))
  }

  @js.native
  sealed trait ScalingStatusCode extends js.Any
  object ScalingStatusCode extends js.Object {
    val Inactive        = "Inactive".asInstanceOf[ScalingStatusCode]
    val PartiallyActive = "PartiallyActive".asInstanceOf[ScalingStatusCode]
    val Active          = "Active".asInstanceOf[ScalingStatusCode]

    val values = js.Object.freeze(js.Array(Inactive, PartiallyActive, Active))
  }

  @js.native
  sealed trait ServiceNamespace extends js.Any
  object ServiceNamespace extends js.Object {
    val autoscaling = "autoscaling".asInstanceOf[ServiceNamespace]
    val ecs         = "ecs".asInstanceOf[ServiceNamespace]
    val ec2         = "ec2".asInstanceOf[ServiceNamespace]
    val rds         = "rds".asInstanceOf[ServiceNamespace]
    val dynamodb    = "dynamodb".asInstanceOf[ServiceNamespace]

    val values = js.Object.freeze(js.Array(autoscaling, ecs, ec2, rds, dynamodb))
  }

  /**
    * Represents a tag.
    */
  @js.native
  @Factory
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[XmlStringMaxLen128]
    var Values: js.UndefOr[TagValues]
  }

  /**
    * Describes a target tracking configuration to use with AWS Auto Scaling. Used with <a>ScalingInstruction</a> and <a>ScalingPolicy</a>.
    */
  @js.native
  @Factory
  trait TargetTrackingConfiguration extends js.Object {
    var TargetValue: MetricScale
    var CustomizedScalingMetricSpecification: js.UndefOr[CustomizedScalingMetricSpecification]
    var DisableScaleIn: js.UndefOr[DisableScaleIn]
    var EstimatedInstanceWarmup: js.UndefOr[Cooldown]
    var PredefinedScalingMetricSpecification: js.UndefOr[PredefinedScalingMetricSpecification]
    var ScaleInCooldown: js.UndefOr[Cooldown]
    var ScaleOutCooldown: js.UndefOr[Cooldown]
  }

  @js.native
  @Factory
  trait UpdateScalingPlanRequest extends js.Object {
    var ScalingPlanName: ScalingPlanName
    var ScalingPlanVersion: ScalingPlanVersion
    var ApplicationSource: js.UndefOr[ApplicationSource]
    var ScalingInstructions: js.UndefOr[ScalingInstructions]
  }

  @js.native
  @Factory
  trait UpdateScalingPlanResponse extends js.Object {}
}
