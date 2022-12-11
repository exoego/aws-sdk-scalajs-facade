package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object autoscaling {
  type AcceleratorManufacturers = js.Array[AcceleratorManufacturer]
  type AcceleratorNames = js.Array[AcceleratorName]
  type AcceleratorTypes = js.Array[AcceleratorType]
  type Activities = js.Array[Activity]
  type ActivityIds = js.Array[XmlString]
  type AdjustmentTypes = js.Array[AdjustmentType]
  type Alarms = js.Array[Alarm]
  type AllowedInstanceType = String
  type AllowedInstanceTypes = js.Array[AllowedInstanceType]
  type AsciiStringMaxLen255 = String
  type AssociatePublicIpAddress = Boolean
  type AutoScalingGroupDesiredCapacity = Int
  type AutoScalingGroupMaxSize = Int
  type AutoScalingGroupMinSize = Int
  type AutoScalingGroupNames = js.Array[XmlStringMaxLen255]
  type AutoScalingGroupPredictedCapacity = Int
  type AutoScalingGroupState = String
  type AutoScalingGroups = js.Array[AutoScalingGroup]
  type AutoScalingInstances = js.Array[AutoScalingInstanceDetails]
  type AutoScalingNotificationTypes = js.Array[XmlStringMaxLen255]
  type AvailabilityZones = js.Array[XmlStringMaxLen255]
  type BlockDeviceEbsDeleteOnTermination = Boolean
  type BlockDeviceEbsEncrypted = Boolean
  type BlockDeviceEbsIops = Int
  type BlockDeviceEbsThroughput = Int
  type BlockDeviceEbsVolumeSize = Int
  type BlockDeviceEbsVolumeType = String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type CapacityRebalanceEnabled = Boolean
  type CheckpointDelay = Int
  type CheckpointPercentages = js.Array[NonZeroIntPercent]
  type ClassicLinkVPCSecurityGroups = js.Array[XmlStringMaxLen255]
  type Context = String
  type Cooldown = Int
  type CpuManufacturers = js.Array[CpuManufacturer]
  type DefaultInstanceWarmup = Int
  type DisableScaleIn = Boolean
  type EbsOptimized = Boolean
  type EnabledMetrics = js.Array[EnabledMetric]
  type EstimatedInstanceWarmup = Int
  type ExcludedInstance = String
  type ExcludedInstanceTypes = js.Array[ExcludedInstance]
  type FailedScheduledUpdateGroupActionRequests = js.Array[FailedScheduledUpdateGroupActionRequest]
  type Filters = js.Array[Filter]
  type ForceDelete = Boolean
  type GlobalTimeout = Int
  type HealthCheckGracePeriod = Int
  type HeartbeatTimeout = Int
  type HonorCooldown = Boolean
  type IncludeDeletedGroups = Boolean
  type InstanceGenerations = js.Array[InstanceGeneration]
  type InstanceIds = js.Array[XmlStringMaxLen19]
  type InstanceMetadataHttpPutResponseHopLimit = Int
  type InstanceProtected = Boolean
  type InstanceRefreshIds = js.Array[XmlStringMaxLen255]
  type InstanceRefreshes = js.Array[InstanceRefresh]
  type Instances = js.Array[Instance]
  type InstancesToUpdate = Int
  type IntPercent = Int
  type LaunchConfigurationNames = js.Array[XmlStringMaxLen255]
  type LaunchConfigurations = js.Array[LaunchConfiguration]
  type LaunchTemplateName = String
  type LifecycleActionResult = String
  type LifecycleActionToken = String
  type LifecycleHookNames = js.Array[AsciiStringMaxLen255]
  type LifecycleHookSpecifications = js.Array[LifecycleHookSpecification]
  type LifecycleHooks = js.Array[LifecycleHook]
  type LifecycleTransition = String
  type LoadBalancerNames = js.Array[XmlStringMaxLen255]
  type LoadBalancerStates = js.Array[LoadBalancerState]
  type LoadBalancerTargetGroupStates = js.Array[LoadBalancerTargetGroupState]
  type LoadForecasts = js.Array[LoadForecast]
  type LocalStorageTypes = js.Array[LocalStorageType]
  type MaxGroupPreparedCapacity = Int
  type MaxInstanceLifetime = Int
  type MaxNumberOfAutoScalingGroups = Int
  type MaxNumberOfLaunchConfigurations = Int
  type MaxRecords = Int
  type MetricCollectionTypes = js.Array[MetricCollectionType]
  type MetricDataQueries = js.Array[MetricDataQuery]
  type MetricDimensionName = String
  type MetricDimensionValue = String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricGranularityTypes = js.Array[MetricGranularityType]
  type MetricName = String
  type MetricNamespace = String
  type MetricScale = Double
  type MetricUnit = String
  type Metrics = js.Array[XmlStringMaxLen255]
  type MinAdjustmentMagnitude = Int
  @deprecated("Deprecated in AWS SDK", "forever")
  type MinAdjustmentStep = Int
  type MixedInstanceSpotPrice = String
  type MonitoringEnabled = Boolean
  type NoDevice = Boolean
  type NonZeroIntPercent = Int
  type NotificationConfigurations = js.Array[NotificationConfiguration]
  type NotificationTargetResourceName = String
  type NullableBoolean = Boolean
  type NullablePositiveDouble = Double
  type NullablePositiveInteger = Int
  type NumberOfAutoScalingGroups = Int
  type NumberOfLaunchConfigurations = Int
  type OnDemandBaseCapacity = Int
  type OnDemandPercentageAboveBaseCapacity = Int
  type Overrides = js.Array[LaunchTemplateOverrides]
  type PolicyIncrement = Int
  type PolicyNames = js.Array[ResourceName]
  type PolicyTypes = js.Array[XmlStringMaxLen64]
  type PredictiveScalingForecastTimestamps = js.Array[TimestampType]
  type PredictiveScalingForecastValues = js.Array[MetricScale]
  type PredictiveScalingMaxCapacityBuffer = Int
  type PredictiveScalingMetricSpecifications = js.Array[PredictiveScalingMetricSpecification]
  type PredictiveScalingSchedulingBufferTime = Int
  type ProcessNames = js.Array[XmlStringMaxLen255]
  type Processes = js.Array[ProcessType]
  type Progress = Int
  type PropagateAtLaunch = Boolean
  type ProtectedFromScaleIn = Boolean
  type RefreshInstanceWarmup = Int
  type ResourceName = String
  type ReturnData = Boolean
  type ReuseOnScaleIn = Boolean
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScalingPolicyEnabled = Boolean
  type ScheduledActionNames = js.Array[XmlStringMaxLen255]
  type ScheduledUpdateGroupActionRequests = js.Array[ScheduledUpdateGroupActionRequest]
  type ScheduledUpdateGroupActions = js.Array[ScheduledUpdateGroupAction]
  type SecurityGroups = js.Array[XmlString]
  type ShouldDecrementDesiredCapacity = Boolean
  type ShouldRespectGracePeriod = Boolean
  type SkipMatching = Boolean
  type SpotInstancePools = Int
  type SpotPrice = String
  type StepAdjustments = js.Array[StepAdjustment]
  type SuspendedProcesses = js.Array[SuspendedProcess]
  type TagDescriptionList = js.Array[TagDescription]
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TargetGroupARNs = js.Array[XmlStringMaxLen511]
  type TargetTrackingMetricDataQueries = js.Array[TargetTrackingMetricDataQuery]
  type TerminationPolicies = js.Array[XmlStringMaxLen1600]
  type TimestampType = js.Date
  type TrafficSourceStates = js.Array[TrafficSourceState]
  type TrafficSources = js.Array[TrafficSourceIdentifier]
  type Values = js.Array[XmlString]
  type WarmPoolMinSize = Int
  type WarmPoolSize = Int
  type XmlString = String
  type XmlStringMaxLen1023 = String
  type XmlStringMaxLen1600 = String
  type XmlStringMaxLen19 = String
  type XmlStringMaxLen2047 = String
  type XmlStringMaxLen255 = String
  type XmlStringMaxLen32 = String
  type XmlStringMaxLen511 = String
  type XmlStringMaxLen64 = String
  type XmlStringMetricLabel = String
  type XmlStringMetricStat = String
  type XmlStringUserData = String

  final class AutoScalingOps(private val service: AutoScaling) extends AnyVal {

    @inline def attachInstancesFuture(params: AttachInstancesQuery): Future[js.Object] = service.attachInstances(params).promise().toFuture
    @inline def attachLoadBalancerTargetGroupsFuture(params: AttachLoadBalancerTargetGroupsType): Future[AttachLoadBalancerTargetGroupsResultType] = service.attachLoadBalancerTargetGroups(params).promise().toFuture
    @inline def attachLoadBalancersFuture(params: AttachLoadBalancersType): Future[AttachLoadBalancersResultType] = service.attachLoadBalancers(params).promise().toFuture
    @inline def attachTrafficSourcesFuture(params: AttachTrafficSourcesType): Future[AttachTrafficSourcesResultType] = service.attachTrafficSources(params).promise().toFuture
    @inline def batchDeleteScheduledActionFuture(params: BatchDeleteScheduledActionType): Future[BatchDeleteScheduledActionAnswer] = service.batchDeleteScheduledAction(params).promise().toFuture
    @inline def batchPutScheduledUpdateGroupActionFuture(params: BatchPutScheduledUpdateGroupActionType): Future[BatchPutScheduledUpdateGroupActionAnswer] = service.batchPutScheduledUpdateGroupAction(params).promise().toFuture
    @inline def cancelInstanceRefreshFuture(params: CancelInstanceRefreshType): Future[CancelInstanceRefreshAnswer] = service.cancelInstanceRefresh(params).promise().toFuture
    @inline def completeLifecycleActionFuture(params: CompleteLifecycleActionType): Future[CompleteLifecycleActionAnswer] = service.completeLifecycleAction(params).promise().toFuture
    @inline def createAutoScalingGroupFuture(params: CreateAutoScalingGroupType): Future[js.Object] = service.createAutoScalingGroup(params).promise().toFuture
    @inline def createLaunchConfigurationFuture(params: CreateLaunchConfigurationType): Future[js.Object] = service.createLaunchConfiguration(params).promise().toFuture
    @inline def createOrUpdateTagsFuture(params: CreateOrUpdateTagsType): Future[js.Object] = service.createOrUpdateTags(params).promise().toFuture
    @inline def deleteAutoScalingGroupFuture(params: DeleteAutoScalingGroupType): Future[js.Object] = service.deleteAutoScalingGroup(params).promise().toFuture
    @inline def deleteLaunchConfigurationFuture(params: LaunchConfigurationNameType): Future[js.Object] = service.deleteLaunchConfiguration(params).promise().toFuture
    @inline def deleteLifecycleHookFuture(params: DeleteLifecycleHookType): Future[DeleteLifecycleHookAnswer] = service.deleteLifecycleHook(params).promise().toFuture
    @inline def deleteNotificationConfigurationFuture(params: DeleteNotificationConfigurationType): Future[js.Object] = service.deleteNotificationConfiguration(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyType): Future[js.Object] = service.deletePolicy(params).promise().toFuture
    @inline def deleteScheduledActionFuture(params: DeleteScheduledActionType): Future[js.Object] = service.deleteScheduledAction(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsType): Future[js.Object] = service.deleteTags(params).promise().toFuture
    @inline def deleteWarmPoolFuture(params: DeleteWarmPoolType): Future[DeleteWarmPoolAnswer] = service.deleteWarmPool(params).promise().toFuture
    @inline def describeAccountLimitsFuture(): Future[DescribeAccountLimitsAnswer] = service.describeAccountLimits().promise().toFuture
    @inline def describeAdjustmentTypesFuture(): Future[DescribeAdjustmentTypesAnswer] = service.describeAdjustmentTypes().promise().toFuture
    @inline def describeAutoScalingGroupsFuture(params: AutoScalingGroupNamesType): Future[AutoScalingGroupsType] = service.describeAutoScalingGroups(params).promise().toFuture
    @inline def describeAutoScalingInstancesFuture(params: DescribeAutoScalingInstancesType): Future[AutoScalingInstancesType] = service.describeAutoScalingInstances(params).promise().toFuture
    @inline def describeAutoScalingNotificationTypesFuture(): Future[DescribeAutoScalingNotificationTypesAnswer] = service.describeAutoScalingNotificationTypes().promise().toFuture
    @inline def describeInstanceRefreshesFuture(params: DescribeInstanceRefreshesType): Future[DescribeInstanceRefreshesAnswer] = service.describeInstanceRefreshes(params).promise().toFuture
    @inline def describeLaunchConfigurationsFuture(params: LaunchConfigurationNamesType): Future[LaunchConfigurationsType] = service.describeLaunchConfigurations(params).promise().toFuture
    @inline def describeLifecycleHookTypesFuture(): Future[DescribeLifecycleHookTypesAnswer] = service.describeLifecycleHookTypes().promise().toFuture
    @inline def describeLifecycleHooksFuture(params: DescribeLifecycleHooksType): Future[DescribeLifecycleHooksAnswer] = service.describeLifecycleHooks(params).promise().toFuture
    @inline def describeLoadBalancerTargetGroupsFuture(params: DescribeLoadBalancerTargetGroupsRequest): Future[DescribeLoadBalancerTargetGroupsResponse] = service.describeLoadBalancerTargetGroups(params).promise().toFuture
    @inline def describeLoadBalancersFuture(params: DescribeLoadBalancersRequest): Future[DescribeLoadBalancersResponse] = service.describeLoadBalancers(params).promise().toFuture
    @inline def describeMetricCollectionTypesFuture(): Future[DescribeMetricCollectionTypesAnswer] = service.describeMetricCollectionTypes().promise().toFuture
    @inline def describeNotificationConfigurationsFuture(params: DescribeNotificationConfigurationsType): Future[DescribeNotificationConfigurationsAnswer] = service.describeNotificationConfigurations(params).promise().toFuture
    @inline def describePoliciesFuture(params: DescribePoliciesType): Future[PoliciesType] = service.describePolicies(params).promise().toFuture
    @inline def describeScalingActivitiesFuture(params: DescribeScalingActivitiesType): Future[ActivitiesType] = service.describeScalingActivities(params).promise().toFuture
    @inline def describeScalingProcessTypesFuture(): Future[ProcessesType] = service.describeScalingProcessTypes().promise().toFuture
    @inline def describeScheduledActionsFuture(params: DescribeScheduledActionsType): Future[ScheduledActionsType] = service.describeScheduledActions(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsType): Future[TagsType] = service.describeTags(params).promise().toFuture
    @inline def describeTerminationPolicyTypesFuture(): Future[DescribeTerminationPolicyTypesAnswer] = service.describeTerminationPolicyTypes().promise().toFuture
    @inline def describeTrafficSourcesFuture(params: DescribeTrafficSourcesRequest): Future[DescribeTrafficSourcesResponse] = service.describeTrafficSources(params).promise().toFuture
    @inline def describeWarmPoolFuture(params: DescribeWarmPoolType): Future[DescribeWarmPoolAnswer] = service.describeWarmPool(params).promise().toFuture
    @inline def detachInstancesFuture(params: DetachInstancesQuery): Future[DetachInstancesAnswer] = service.detachInstances(params).promise().toFuture
    @inline def detachLoadBalancerTargetGroupsFuture(params: DetachLoadBalancerTargetGroupsType): Future[DetachLoadBalancerTargetGroupsResultType] = service.detachLoadBalancerTargetGroups(params).promise().toFuture
    @inline def detachLoadBalancersFuture(params: DetachLoadBalancersType): Future[DetachLoadBalancersResultType] = service.detachLoadBalancers(params).promise().toFuture
    @inline def detachTrafficSourcesFuture(params: DetachTrafficSourcesType): Future[DetachTrafficSourcesResultType] = service.detachTrafficSources(params).promise().toFuture
    @inline def disableMetricsCollectionFuture(params: DisableMetricsCollectionQuery): Future[js.Object] = service.disableMetricsCollection(params).promise().toFuture
    @inline def enableMetricsCollectionFuture(params: EnableMetricsCollectionQuery): Future[js.Object] = service.enableMetricsCollection(params).promise().toFuture
    @inline def enterStandbyFuture(params: EnterStandbyQuery): Future[EnterStandbyAnswer] = service.enterStandby(params).promise().toFuture
    @inline def executePolicyFuture(params: ExecutePolicyType): Future[js.Object] = service.executePolicy(params).promise().toFuture
    @inline def exitStandbyFuture(params: ExitStandbyQuery): Future[ExitStandbyAnswer] = service.exitStandby(params).promise().toFuture
    @inline def getPredictiveScalingForecastFuture(params: GetPredictiveScalingForecastType): Future[GetPredictiveScalingForecastAnswer] = service.getPredictiveScalingForecast(params).promise().toFuture
    @inline def putLifecycleHookFuture(params: PutLifecycleHookType): Future[PutLifecycleHookAnswer] = service.putLifecycleHook(params).promise().toFuture
    @inline def putNotificationConfigurationFuture(params: PutNotificationConfigurationType): Future[js.Object] = service.putNotificationConfiguration(params).promise().toFuture
    @inline def putScalingPolicyFuture(params: PutScalingPolicyType): Future[PolicyARNType] = service.putScalingPolicy(params).promise().toFuture
    @inline def putScheduledUpdateGroupActionFuture(params: PutScheduledUpdateGroupActionType): Future[js.Object] = service.putScheduledUpdateGroupAction(params).promise().toFuture
    @inline def putWarmPoolFuture(params: PutWarmPoolType): Future[PutWarmPoolAnswer] = service.putWarmPool(params).promise().toFuture
    @inline def recordLifecycleActionHeartbeatFuture(params: RecordLifecycleActionHeartbeatType): Future[RecordLifecycleActionHeartbeatAnswer] = service.recordLifecycleActionHeartbeat(params).promise().toFuture
    @inline def resumeProcessesFuture(params: ScalingProcessQuery): Future[js.Object] = service.resumeProcesses(params).promise().toFuture
    @inline def setDesiredCapacityFuture(params: SetDesiredCapacityType): Future[js.Object] = service.setDesiredCapacity(params).promise().toFuture
    @inline def setInstanceHealthFuture(params: SetInstanceHealthQuery): Future[js.Object] = service.setInstanceHealth(params).promise().toFuture
    @inline def setInstanceProtectionFuture(params: SetInstanceProtectionQuery): Future[SetInstanceProtectionAnswer] = service.setInstanceProtection(params).promise().toFuture
    @inline def startInstanceRefreshFuture(params: StartInstanceRefreshType): Future[StartInstanceRefreshAnswer] = service.startInstanceRefresh(params).promise().toFuture
    @inline def suspendProcessesFuture(params: ScalingProcessQuery): Future[js.Object] = service.suspendProcesses(params).promise().toFuture
    @inline def terminateInstanceInAutoScalingGroupFuture(params: TerminateInstanceInAutoScalingGroupType): Future[ActivityType] = service.terminateInstanceInAutoScalingGroup(params).promise().toFuture
    @inline def updateAutoScalingGroupFuture(params: UpdateAutoScalingGroupType): Future[js.Object] = service.updateAutoScalingGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/autoscaling", JSImport.Namespace, "AWS.AutoScaling")
  class AutoScaling() extends js.Object {
    def this(config: AWSConfig) = this()

    def attachInstances(params: AttachInstancesQuery): Request[js.Object] = js.native
    def attachLoadBalancerTargetGroups(params: AttachLoadBalancerTargetGroupsType): Request[AttachLoadBalancerTargetGroupsResultType] = js.native
    def attachLoadBalancers(params: AttachLoadBalancersType): Request[AttachLoadBalancersResultType] = js.native
    def attachTrafficSources(params: AttachTrafficSourcesType): Request[AttachTrafficSourcesResultType] = js.native
    def batchDeleteScheduledAction(params: BatchDeleteScheduledActionType): Request[BatchDeleteScheduledActionAnswer] = js.native
    def batchPutScheduledUpdateGroupAction(params: BatchPutScheduledUpdateGroupActionType): Request[BatchPutScheduledUpdateGroupActionAnswer] = js.native
    def cancelInstanceRefresh(params: CancelInstanceRefreshType): Request[CancelInstanceRefreshAnswer] = js.native
    def completeLifecycleAction(params: CompleteLifecycleActionType): Request[CompleteLifecycleActionAnswer] = js.native
    def createAutoScalingGroup(params: CreateAutoScalingGroupType): Request[js.Object] = js.native
    def createLaunchConfiguration(params: CreateLaunchConfigurationType): Request[js.Object] = js.native
    def createOrUpdateTags(params: CreateOrUpdateTagsType): Request[js.Object] = js.native
    def deleteAutoScalingGroup(params: DeleteAutoScalingGroupType): Request[js.Object] = js.native
    def deleteLaunchConfiguration(params: LaunchConfigurationNameType): Request[js.Object] = js.native
    def deleteLifecycleHook(params: DeleteLifecycleHookType): Request[DeleteLifecycleHookAnswer] = js.native
    def deleteNotificationConfiguration(params: DeleteNotificationConfigurationType): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyType): Request[js.Object] = js.native
    def deleteScheduledAction(params: DeleteScheduledActionType): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsType): Request[js.Object] = js.native
    def deleteWarmPool(params: DeleteWarmPoolType): Request[DeleteWarmPoolAnswer] = js.native
    def describeAccountLimits(): Request[DescribeAccountLimitsAnswer] = js.native
    def describeAdjustmentTypes(): Request[DescribeAdjustmentTypesAnswer] = js.native
    def describeAutoScalingGroups(params: AutoScalingGroupNamesType): Request[AutoScalingGroupsType] = js.native
    def describeAutoScalingInstances(params: DescribeAutoScalingInstancesType): Request[AutoScalingInstancesType] = js.native
    def describeAutoScalingNotificationTypes(): Request[DescribeAutoScalingNotificationTypesAnswer] = js.native
    def describeInstanceRefreshes(params: DescribeInstanceRefreshesType): Request[DescribeInstanceRefreshesAnswer] = js.native
    def describeLaunchConfigurations(params: LaunchConfigurationNamesType): Request[LaunchConfigurationsType] = js.native
    def describeLifecycleHookTypes(): Request[DescribeLifecycleHookTypesAnswer] = js.native
    def describeLifecycleHooks(params: DescribeLifecycleHooksType): Request[DescribeLifecycleHooksAnswer] = js.native
    def describeLoadBalancerTargetGroups(params: DescribeLoadBalancerTargetGroupsRequest): Request[DescribeLoadBalancerTargetGroupsResponse] = js.native
    def describeLoadBalancers(params: DescribeLoadBalancersRequest): Request[DescribeLoadBalancersResponse] = js.native
    def describeMetricCollectionTypes(): Request[DescribeMetricCollectionTypesAnswer] = js.native
    def describeNotificationConfigurations(params: DescribeNotificationConfigurationsType): Request[DescribeNotificationConfigurationsAnswer] = js.native
    def describePolicies(params: DescribePoliciesType): Request[PoliciesType] = js.native
    def describeScalingActivities(params: DescribeScalingActivitiesType): Request[ActivitiesType] = js.native
    def describeScalingProcessTypes(): Request[ProcessesType] = js.native
    def describeScheduledActions(params: DescribeScheduledActionsType): Request[ScheduledActionsType] = js.native
    def describeTags(params: DescribeTagsType): Request[TagsType] = js.native
    def describeTerminationPolicyTypes(): Request[DescribeTerminationPolicyTypesAnswer] = js.native
    def describeTrafficSources(params: DescribeTrafficSourcesRequest): Request[DescribeTrafficSourcesResponse] = js.native
    def describeWarmPool(params: DescribeWarmPoolType): Request[DescribeWarmPoolAnswer] = js.native
    def detachInstances(params: DetachInstancesQuery): Request[DetachInstancesAnswer] = js.native
    def detachLoadBalancerTargetGroups(params: DetachLoadBalancerTargetGroupsType): Request[DetachLoadBalancerTargetGroupsResultType] = js.native
    def detachLoadBalancers(params: DetachLoadBalancersType): Request[DetachLoadBalancersResultType] = js.native
    def detachTrafficSources(params: DetachTrafficSourcesType): Request[DetachTrafficSourcesResultType] = js.native
    def disableMetricsCollection(params: DisableMetricsCollectionQuery): Request[js.Object] = js.native
    def enableMetricsCollection(params: EnableMetricsCollectionQuery): Request[js.Object] = js.native
    def enterStandby(params: EnterStandbyQuery): Request[EnterStandbyAnswer] = js.native
    def executePolicy(params: ExecutePolicyType): Request[js.Object] = js.native
    def exitStandby(params: ExitStandbyQuery): Request[ExitStandbyAnswer] = js.native
    def getPredictiveScalingForecast(params: GetPredictiveScalingForecastType): Request[GetPredictiveScalingForecastAnswer] = js.native
    def putLifecycleHook(params: PutLifecycleHookType): Request[PutLifecycleHookAnswer] = js.native
    def putNotificationConfiguration(params: PutNotificationConfigurationType): Request[js.Object] = js.native
    def putScalingPolicy(params: PutScalingPolicyType): Request[PolicyARNType] = js.native
    def putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType): Request[js.Object] = js.native
    def putWarmPool(params: PutWarmPoolType): Request[PutWarmPoolAnswer] = js.native
    def recordLifecycleActionHeartbeat(params: RecordLifecycleActionHeartbeatType): Request[RecordLifecycleActionHeartbeatAnswer] = js.native
    def resumeProcesses(params: ScalingProcessQuery): Request[js.Object] = js.native
    def setDesiredCapacity(params: SetDesiredCapacityType): Request[js.Object] = js.native
    def setInstanceHealth(params: SetInstanceHealthQuery): Request[js.Object] = js.native
    def setInstanceProtection(params: SetInstanceProtectionQuery): Request[SetInstanceProtectionAnswer] = js.native
    def startInstanceRefresh(params: StartInstanceRefreshType): Request[StartInstanceRefreshAnswer] = js.native
    def suspendProcesses(params: ScalingProcessQuery): Request[js.Object] = js.native
    def terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType): Request[ActivityType] = js.native
    def updateAutoScalingGroup(params: UpdateAutoScalingGroupType): Request[js.Object] = js.native
  }
  object AutoScaling {
    @inline implicit def toOps(service: AutoScaling): AutoScalingOps = {
      new AutoScalingOps(service)
    }
  }

  /** Specifies the minimum and maximum for the <code>AcceleratorCount</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    */
  @js.native
  trait AcceleratorCountRequest extends js.Object {
    var Max: js.UndefOr[NullablePositiveInteger]
    var Min: js.UndefOr[NullablePositiveInteger]
  }

  object AcceleratorCountRequest {
    @inline
    def apply(
        Max: js.UndefOr[NullablePositiveInteger] = js.undefined,
        Min: js.UndefOr[NullablePositiveInteger] = js.undefined
    ): AcceleratorCountRequest = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceleratorCountRequest]
    }
  }

  /** Specifies the minimum and maximum for the <code>AcceleratorTotalMemoryMiB</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    */
  @js.native
  trait AcceleratorTotalMemoryMiBRequest extends js.Object {
    var Max: js.UndefOr[NullablePositiveInteger]
    var Min: js.UndefOr[NullablePositiveInteger]
  }

  object AcceleratorTotalMemoryMiBRequest {
    @inline
    def apply(
        Max: js.UndefOr[NullablePositiveInteger] = js.undefined,
        Min: js.UndefOr[NullablePositiveInteger] = js.undefined
    ): AcceleratorTotalMemoryMiBRequest = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceleratorTotalMemoryMiBRequest]
    }
  }

  @js.native
  trait ActivitiesType extends js.Object {
    var Activities: Activities
    var NextToken: js.UndefOr[XmlString]
  }

  object ActivitiesType {
    @inline
    def apply(
        Activities: Activities,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): ActivitiesType = {
      val __obj = js.Dynamic.literal(
        "Activities" -> Activities.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivitiesType]
    }
  }

  /** Describes scaling activity, which is a long-running process that represents a change to your Auto Scaling group, such as changing its size or replacing an instance.
    */
  @js.native
  trait Activity extends js.Object {
    var ActivityId: XmlString
    var AutoScalingGroupName: XmlStringMaxLen255
    var Cause: XmlStringMaxLen1023
    var StartTime: TimestampType
    var StatusCode: ScalingActivityStatusCode
    var AutoScalingGroupARN: js.UndefOr[ResourceName]
    var AutoScalingGroupState: js.UndefOr[AutoScalingGroupState]
    var Description: js.UndefOr[XmlString]
    var Details: js.UndefOr[XmlString]
    var EndTime: js.UndefOr[TimestampType]
    var Progress: js.UndefOr[Progress]
    var StatusMessage: js.UndefOr[XmlStringMaxLen255]
  }

  object Activity {
    @inline
    def apply(
        ActivityId: XmlString,
        AutoScalingGroupName: XmlStringMaxLen255,
        Cause: XmlStringMaxLen1023,
        StartTime: TimestampType,
        StatusCode: ScalingActivityStatusCode,
        AutoScalingGroupARN: js.UndefOr[ResourceName] = js.undefined,
        AutoScalingGroupState: js.UndefOr[AutoScalingGroupState] = js.undefined,
        Description: js.UndefOr[XmlString] = js.undefined,
        Details: js.UndefOr[XmlString] = js.undefined,
        EndTime: js.UndefOr[TimestampType] = js.undefined,
        Progress: js.UndefOr[Progress] = js.undefined,
        StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): Activity = {
      val __obj = js.Dynamic.literal(
        "ActivityId" -> ActivityId.asInstanceOf[js.Any],
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "Cause" -> Cause.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any],
        "StatusCode" -> StatusCode.asInstanceOf[js.Any]
      )

      AutoScalingGroupARN.foreach(__v => __obj.updateDynamic("AutoScalingGroupARN")(__v.asInstanceOf[js.Any]))
      AutoScalingGroupState.foreach(__v => __obj.updateDynamic("AutoScalingGroupState")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Progress.foreach(__v => __obj.updateDynamic("Progress")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Activity]
    }
  }

  @js.native
  trait ActivityType extends js.Object {
    var Activity: js.UndefOr[Activity]
  }

  object ActivityType {
    @inline
    def apply(
        Activity: js.UndefOr[Activity] = js.undefined
    ): ActivityType = {
      val __obj = js.Dynamic.literal()
      Activity.foreach(__v => __obj.updateDynamic("Activity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityType]
    }
  }

  /** Describes a policy adjustment type.
    */
  @js.native
  trait AdjustmentType extends js.Object {
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
  }

  object AdjustmentType {
    @inline
    def apply(
        AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): AdjustmentType = {
      val __obj = js.Dynamic.literal()
      AdjustmentType.foreach(__v => __obj.updateDynamic("AdjustmentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdjustmentType]
    }
  }

  /** Describes an alarm.
    */
  @js.native
  trait Alarm extends js.Object {
    var AlarmARN: js.UndefOr[ResourceName]
    var AlarmName: js.UndefOr[XmlStringMaxLen255]
  }

  object Alarm {
    @inline
    def apply(
        AlarmARN: js.UndefOr[ResourceName] = js.undefined,
        AlarmName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): Alarm = {
      val __obj = js.Dynamic.literal()
      AlarmARN.foreach(__v => __obj.updateDynamic("AlarmARN")(__v.asInstanceOf[js.Any]))
      AlarmName.foreach(__v => __obj.updateDynamic("AlarmName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alarm]
    }
  }

  @js.native
  trait AttachInstancesQuery extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  object AttachInstancesQuery {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    ): AttachInstancesQuery = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachInstancesQuery]
    }
  }

  @js.native
  trait AttachLoadBalancerTargetGroupsResultType extends js.Object

  object AttachLoadBalancerTargetGroupsResultType {
    @inline
    def apply(): AttachLoadBalancerTargetGroupsResultType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachLoadBalancerTargetGroupsResultType]
    }
  }

  @js.native
  trait AttachLoadBalancerTargetGroupsType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var TargetGroupARNs: TargetGroupARNs
  }

  object AttachLoadBalancerTargetGroupsType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        TargetGroupARNs: TargetGroupARNs
    ): AttachLoadBalancerTargetGroupsType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TargetGroupARNs" -> TargetGroupARNs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttachLoadBalancerTargetGroupsType]
    }
  }

  @js.native
  trait AttachLoadBalancersResultType extends js.Object

  object AttachLoadBalancersResultType {
    @inline
    def apply(): AttachLoadBalancersResultType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachLoadBalancersResultType]
    }
  }

  @js.native
  trait AttachLoadBalancersType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var LoadBalancerNames: LoadBalancerNames
  }

  object AttachLoadBalancersType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        LoadBalancerNames: LoadBalancerNames
    ): AttachLoadBalancersType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttachLoadBalancersType]
    }
  }

  @js.native
  trait AttachTrafficSourcesResultType extends js.Object

  object AttachTrafficSourcesResultType {
    @inline
    def apply(): AttachTrafficSourcesResultType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachTrafficSourcesResultType]
    }
  }

  @js.native
  trait AttachTrafficSourcesType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var TrafficSources: TrafficSources
  }

  object AttachTrafficSourcesType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        TrafficSources: TrafficSources
    ): AttachTrafficSourcesType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TrafficSources" -> TrafficSources.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttachTrafficSourcesType]
    }
  }

  /** Describes an Auto Scaling group.
    */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var AvailabilityZones: AvailabilityZones
    var CreatedTime: TimestampType
    var DefaultCooldown: Cooldown
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var HealthCheckType: XmlStringMaxLen32
    var MaxSize: AutoScalingGroupMaxSize
    var MinSize: AutoScalingGroupMinSize
    var AutoScalingGroupARN: js.UndefOr[ResourceName]
    var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled]
    var Context: js.UndefOr[Context]
    var DefaultInstanceWarmup: js.UndefOr[DefaultInstanceWarmup]
    var DesiredCapacityType: js.UndefOr[XmlStringMaxLen255]
    var EnabledMetrics: js.UndefOr[EnabledMetrics]
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod]
    var Instances: js.UndefOr[Instances]
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames]
    var MaxInstanceLifetime: js.UndefOr[MaxInstanceLifetime]
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy]
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected]
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255]
    var PredictedCapacity: js.UndefOr[AutoScalingGroupPredictedCapacity]
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName]
    var Status: js.UndefOr[XmlStringMaxLen255]
    var SuspendedProcesses: js.UndefOr[SuspendedProcesses]
    var Tags: js.UndefOr[TagDescriptionList]
    var TargetGroupARNs: js.UndefOr[TargetGroupARNs]
    var TerminationPolicies: js.UndefOr[TerminationPolicies]
    var TrafficSources: js.UndefOr[TrafficSources]
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047]
    var WarmPoolConfiguration: js.UndefOr[WarmPoolConfiguration]
    var WarmPoolSize: js.UndefOr[WarmPoolSize]
  }

  object AutoScalingGroup {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        AvailabilityZones: AvailabilityZones,
        CreatedTime: TimestampType,
        DefaultCooldown: Cooldown,
        DesiredCapacity: AutoScalingGroupDesiredCapacity,
        HealthCheckType: XmlStringMaxLen32,
        MaxSize: AutoScalingGroupMaxSize,
        MinSize: AutoScalingGroupMinSize,
        AutoScalingGroupARN: js.UndefOr[ResourceName] = js.undefined,
        CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.undefined,
        Context: js.UndefOr[Context] = js.undefined,
        DefaultInstanceWarmup: js.UndefOr[DefaultInstanceWarmup] = js.undefined,
        DesiredCapacityType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        EnabledMetrics: js.UndefOr[EnabledMetrics] = js.undefined,
        HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
        Instances: js.UndefOr[Instances] = js.undefined,
        LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
        MaxInstanceLifetime: js.UndefOr[MaxInstanceLifetime] = js.undefined,
        MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined,
        NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined,
        PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        PredictedCapacity: js.UndefOr[AutoScalingGroupPredictedCapacity] = js.undefined,
        ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined,
        Status: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        SuspendedProcesses: js.UndefOr[SuspendedProcesses] = js.undefined,
        Tags: js.UndefOr[TagDescriptionList] = js.undefined,
        TargetGroupARNs: js.UndefOr[TargetGroupARNs] = js.undefined,
        TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
        TrafficSources: js.UndefOr[TrafficSources] = js.undefined,
        VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined,
        WarmPoolConfiguration: js.UndefOr[WarmPoolConfiguration] = js.undefined,
        WarmPoolSize: js.UndefOr[WarmPoolSize] = js.undefined
    ): AutoScalingGroup = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "DefaultCooldown" -> DefaultCooldown.asInstanceOf[js.Any],
        "DesiredCapacity" -> DesiredCapacity.asInstanceOf[js.Any],
        "HealthCheckType" -> HealthCheckType.asInstanceOf[js.Any],
        "MaxSize" -> MaxSize.asInstanceOf[js.Any],
        "MinSize" -> MinSize.asInstanceOf[js.Any]
      )

      AutoScalingGroupARN.foreach(__v => __obj.updateDynamic("AutoScalingGroupARN")(__v.asInstanceOf[js.Any]))
      CapacityRebalance.foreach(__v => __obj.updateDynamic("CapacityRebalance")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      DefaultInstanceWarmup.foreach(__v => __obj.updateDynamic("DefaultInstanceWarmup")(__v.asInstanceOf[js.Any]))
      DesiredCapacityType.foreach(__v => __obj.updateDynamic("DesiredCapacityType")(__v.asInstanceOf[js.Any]))
      EnabledMetrics.foreach(__v => __obj.updateDynamic("EnabledMetrics")(__v.asInstanceOf[js.Any]))
      HealthCheckGracePeriod.foreach(__v => __obj.updateDynamic("HealthCheckGracePeriod")(__v.asInstanceOf[js.Any]))
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.updateDynamic("LaunchConfigurationName")(__v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      LoadBalancerNames.foreach(__v => __obj.updateDynamic("LoadBalancerNames")(__v.asInstanceOf[js.Any]))
      MaxInstanceLifetime.foreach(__v => __obj.updateDynamic("MaxInstanceLifetime")(__v.asInstanceOf[js.Any]))
      MixedInstancesPolicy.foreach(__v => __obj.updateDynamic("MixedInstancesPolicy")(__v.asInstanceOf[js.Any]))
      NewInstancesProtectedFromScaleIn.foreach(__v => __obj.updateDynamic("NewInstancesProtectedFromScaleIn")(__v.asInstanceOf[js.Any]))
      PlacementGroup.foreach(__v => __obj.updateDynamic("PlacementGroup")(__v.asInstanceOf[js.Any]))
      PredictedCapacity.foreach(__v => __obj.updateDynamic("PredictedCapacity")(__v.asInstanceOf[js.Any]))
      ServiceLinkedRoleARN.foreach(__v => __obj.updateDynamic("ServiceLinkedRoleARN")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SuspendedProcesses.foreach(__v => __obj.updateDynamic("SuspendedProcesses")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetGroupARNs.foreach(__v => __obj.updateDynamic("TargetGroupARNs")(__v.asInstanceOf[js.Any]))
      TerminationPolicies.foreach(__v => __obj.updateDynamic("TerminationPolicies")(__v.asInstanceOf[js.Any]))
      TrafficSources.foreach(__v => __obj.updateDynamic("TrafficSources")(__v.asInstanceOf[js.Any]))
      VPCZoneIdentifier.foreach(__v => __obj.updateDynamic("VPCZoneIdentifier")(__v.asInstanceOf[js.Any]))
      WarmPoolConfiguration.foreach(__v => __obj.updateDynamic("WarmPoolConfiguration")(__v.asInstanceOf[js.Any]))
      WarmPoolSize.foreach(__v => __obj.updateDynamic("WarmPoolSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroup]
    }
  }

  @js.native
  trait AutoScalingGroupNamesType extends js.Object {
    var AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames]
    var Filters: js.UndefOr[Filters]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object AutoScalingGroupNamesType {
    @inline
    def apply(
        AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): AutoScalingGroupNamesType = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupNames.foreach(__v => __obj.updateDynamic("AutoScalingGroupNames")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupNamesType]
    }
  }

  @js.native
  trait AutoScalingGroupsType extends js.Object {
    var AutoScalingGroups: AutoScalingGroups
    var NextToken: js.UndefOr[XmlString]
  }

  object AutoScalingGroupsType {
    @inline
    def apply(
        AutoScalingGroups: AutoScalingGroups,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): AutoScalingGroupsType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroups" -> AutoScalingGroups.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupsType]
    }
  }

  /** Describes an EC2 instance associated with an Auto Scaling group.
    */
  @js.native
  trait AutoScalingInstanceDetails extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var AvailabilityZone: XmlStringMaxLen255
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen19
    var LifecycleState: XmlStringMaxLen32
    var ProtectedFromScaleIn: InstanceProtected
    var InstanceType: js.UndefOr[XmlStringMaxLen255]
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var WeightedCapacity: js.UndefOr[XmlStringMaxLen32]
  }

  object AutoScalingInstanceDetails {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        AvailabilityZone: XmlStringMaxLen255,
        HealthStatus: XmlStringMaxLen32,
        InstanceId: XmlStringMaxLen19,
        LifecycleState: XmlStringMaxLen32,
        ProtectedFromScaleIn: InstanceProtected,
        InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        WeightedCapacity: js.UndefOr[XmlStringMaxLen32] = js.undefined
    ): AutoScalingInstanceDetails = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "HealthStatus" -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LifecycleState" -> LifecycleState.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any]
      )

      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.updateDynamic("LaunchConfigurationName")(__v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      WeightedCapacity.foreach(__v => __obj.updateDynamic("WeightedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingInstanceDetails]
    }
  }

  @js.native
  trait AutoScalingInstancesType extends js.Object {
    var AutoScalingInstances: js.UndefOr[AutoScalingInstances]
    var NextToken: js.UndefOr[XmlString]
  }

  object AutoScalingInstancesType {
    @inline
    def apply(
        AutoScalingInstances: js.UndefOr[AutoScalingInstances] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): AutoScalingInstancesType = {
      val __obj = js.Dynamic.literal()
      AutoScalingInstances.foreach(__v => __obj.updateDynamic("AutoScalingInstances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingInstancesType]
    }
  }

  /** Specifies the minimum and maximum for the <code>BaselineEbsBandwidthMbps</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    */
  @js.native
  trait BaselineEbsBandwidthMbpsRequest extends js.Object {
    var Max: js.UndefOr[NullablePositiveInteger]
    var Min: js.UndefOr[NullablePositiveInteger]
  }

  object BaselineEbsBandwidthMbpsRequest {
    @inline
    def apply(
        Max: js.UndefOr[NullablePositiveInteger] = js.undefined,
        Min: js.UndefOr[NullablePositiveInteger] = js.undefined
    ): BaselineEbsBandwidthMbpsRequest = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaselineEbsBandwidthMbpsRequest]
    }
  }

  @js.native
  trait BatchDeleteScheduledActionAnswer extends js.Object {
    var FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests]
  }

  object BatchDeleteScheduledActionAnswer {
    @inline
    def apply(
        FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined
    ): BatchDeleteScheduledActionAnswer = {
      val __obj = js.Dynamic.literal()
      FailedScheduledActions.foreach(__v => __obj.updateDynamic("FailedScheduledActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteScheduledActionAnswer]
    }
  }

  @js.native
  trait BatchDeleteScheduledActionType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ScheduledActionNames: ScheduledActionNames
  }

  object BatchDeleteScheduledActionType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ScheduledActionNames: ScheduledActionNames
    ): BatchDeleteScheduledActionType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledActionNames" -> ScheduledActionNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteScheduledActionType]
    }
  }

  @js.native
  trait BatchPutScheduledUpdateGroupActionAnswer extends js.Object {
    var FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests]
  }

  object BatchPutScheduledUpdateGroupActionAnswer {
    @inline
    def apply(
        FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined
    ): BatchPutScheduledUpdateGroupActionAnswer = {
      val __obj = js.Dynamic.literal()
      FailedScheduledUpdateGroupActions.foreach(__v => __obj.updateDynamic("FailedScheduledUpdateGroupActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionAnswer]
    }
  }

  @js.native
  trait BatchPutScheduledUpdateGroupActionType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  }

  object BatchPutScheduledUpdateGroupActionType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
    ): BatchPutScheduledUpdateGroupActionType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledUpdateGroupActions" -> ScheduledUpdateGroupActions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionType]
    }
  }

  /** Describes a block device mapping.
    */
  @js.native
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: XmlStringMaxLen255
    var Ebs: js.UndefOr[Ebs]
    var NoDevice: js.UndefOr[NoDevice]
    var VirtualName: js.UndefOr[XmlStringMaxLen255]
  }

  object BlockDeviceMapping {
    @inline
    def apply(
        DeviceName: XmlStringMaxLen255,
        Ebs: js.UndefOr[Ebs] = js.undefined,
        NoDevice: js.UndefOr[NoDevice] = js.undefined,
        VirtualName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): BlockDeviceMapping = {
      val __obj = js.Dynamic.literal(
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )

      Ebs.foreach(__v => __obj.updateDynamic("Ebs")(__v.asInstanceOf[js.Any]))
      NoDevice.foreach(__v => __obj.updateDynamic("NoDevice")(__v.asInstanceOf[js.Any]))
      VirtualName.foreach(__v => __obj.updateDynamic("VirtualName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlockDeviceMapping]
    }
  }

  @js.native
  trait CancelInstanceRefreshAnswer extends js.Object {
    var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255]
  }

  object CancelInstanceRefreshAnswer {
    @inline
    def apply(
        InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): CancelInstanceRefreshAnswer = {
      val __obj = js.Dynamic.literal()
      InstanceRefreshId.foreach(__v => __obj.updateDynamic("InstanceRefreshId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelInstanceRefreshAnswer]
    }
  }

  @js.native
  trait CancelInstanceRefreshType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
  }

  object CancelInstanceRefreshType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255
    ): CancelInstanceRefreshType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelInstanceRefreshType]
    }
  }

  /** A <code>GetPredictiveScalingForecast</code> call returns the capacity forecast for a predictive scaling policy. This structure includes the data points for that capacity forecast, along with the timestamps of those data points.
    */
  @js.native
  trait CapacityForecast extends js.Object {
    var Timestamps: PredictiveScalingForecastTimestamps
    var Values: PredictiveScalingForecastValues
  }

  object CapacityForecast {
    @inline
    def apply(
        Timestamps: PredictiveScalingForecastTimestamps,
        Values: PredictiveScalingForecastValues
    ): CapacityForecast = {
      val __obj = js.Dynamic.literal(
        "Timestamps" -> Timestamps.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CapacityForecast]
    }
  }

  @js.native
  trait CompleteLifecycleActionAnswer extends js.Object

  object CompleteLifecycleActionAnswer {
    @inline
    def apply(): CompleteLifecycleActionAnswer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompleteLifecycleActionAnswer]
    }
  }

  @js.native
  trait CompleteLifecycleActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleActionResult: LifecycleActionResult
    var LifecycleHookName: AsciiStringMaxLen255
    var InstanceId: js.UndefOr[XmlStringMaxLen19]
    var LifecycleActionToken: js.UndefOr[LifecycleActionToken]
  }

  object CompleteLifecycleActionType {
    @inline
    def apply(
        AutoScalingGroupName: ResourceName,
        LifecycleActionResult: LifecycleActionResult,
        LifecycleHookName: AsciiStringMaxLen255,
        InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
        LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined
    ): CompleteLifecycleActionType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleActionResult" -> LifecycleActionResult.asInstanceOf[js.Any],
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any]
      )

      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      LifecycleActionToken.foreach(__v => __obj.updateDynamic("LifecycleActionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteLifecycleActionType]
    }
  }

  @js.native
  trait CreateAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var MaxSize: AutoScalingGroupMaxSize
    var MinSize: AutoScalingGroupMinSize
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled]
    var Context: js.UndefOr[Context]
    var DefaultCooldown: js.UndefOr[Cooldown]
    var DefaultInstanceWarmup: js.UndefOr[DefaultInstanceWarmup]
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var DesiredCapacityType: js.UndefOr[XmlStringMaxLen255]
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod]
    var HealthCheckType: js.UndefOr[XmlStringMaxLen32]
    var InstanceId: js.UndefOr[XmlStringMaxLen19]
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications]
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames]
    var MaxInstanceLifetime: js.UndefOr[MaxInstanceLifetime]
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy]
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected]
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255]
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName]
    var Tags: js.UndefOr[Tags]
    var TargetGroupARNs: js.UndefOr[TargetGroupARNs]
    var TerminationPolicies: js.UndefOr[TerminationPolicies]
    var TrafficSources: js.UndefOr[TrafficSources]
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047]
  }

  object CreateAutoScalingGroupType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        MaxSize: AutoScalingGroupMaxSize,
        MinSize: AutoScalingGroupMinSize,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.undefined,
        Context: js.UndefOr[Context] = js.undefined,
        DefaultCooldown: js.UndefOr[Cooldown] = js.undefined,
        DefaultInstanceWarmup: js.UndefOr[DefaultInstanceWarmup] = js.undefined,
        DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
        DesiredCapacityType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
        HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
        InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
        LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications] = js.undefined,
        LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
        MaxInstanceLifetime: js.UndefOr[MaxInstanceLifetime] = js.undefined,
        MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined,
        NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined,
        PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TargetGroupARNs: js.UndefOr[TargetGroupARNs] = js.undefined,
        TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
        TrafficSources: js.UndefOr[TrafficSources] = js.undefined,
        VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
    ): CreateAutoScalingGroupType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "MaxSize" -> MaxSize.asInstanceOf[js.Any],
        "MinSize" -> MinSize.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      CapacityRebalance.foreach(__v => __obj.updateDynamic("CapacityRebalance")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      DefaultCooldown.foreach(__v => __obj.updateDynamic("DefaultCooldown")(__v.asInstanceOf[js.Any]))
      DefaultInstanceWarmup.foreach(__v => __obj.updateDynamic("DefaultInstanceWarmup")(__v.asInstanceOf[js.Any]))
      DesiredCapacity.foreach(__v => __obj.updateDynamic("DesiredCapacity")(__v.asInstanceOf[js.Any]))
      DesiredCapacityType.foreach(__v => __obj.updateDynamic("DesiredCapacityType")(__v.asInstanceOf[js.Any]))
      HealthCheckGracePeriod.foreach(__v => __obj.updateDynamic("HealthCheckGracePeriod")(__v.asInstanceOf[js.Any]))
      HealthCheckType.foreach(__v => __obj.updateDynamic("HealthCheckType")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.updateDynamic("LaunchConfigurationName")(__v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      LifecycleHookSpecificationList.foreach(__v => __obj.updateDynamic("LifecycleHookSpecificationList")(__v.asInstanceOf[js.Any]))
      LoadBalancerNames.foreach(__v => __obj.updateDynamic("LoadBalancerNames")(__v.asInstanceOf[js.Any]))
      MaxInstanceLifetime.foreach(__v => __obj.updateDynamic("MaxInstanceLifetime")(__v.asInstanceOf[js.Any]))
      MixedInstancesPolicy.foreach(__v => __obj.updateDynamic("MixedInstancesPolicy")(__v.asInstanceOf[js.Any]))
      NewInstancesProtectedFromScaleIn.foreach(__v => __obj.updateDynamic("NewInstancesProtectedFromScaleIn")(__v.asInstanceOf[js.Any]))
      PlacementGroup.foreach(__v => __obj.updateDynamic("PlacementGroup")(__v.asInstanceOf[js.Any]))
      ServiceLinkedRoleARN.foreach(__v => __obj.updateDynamic("ServiceLinkedRoleARN")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetGroupARNs.foreach(__v => __obj.updateDynamic("TargetGroupARNs")(__v.asInstanceOf[js.Any]))
      TerminationPolicies.foreach(__v => __obj.updateDynamic("TerminationPolicies")(__v.asInstanceOf[js.Any]))
      TrafficSources.foreach(__v => __obj.updateDynamic("TrafficSources")(__v.asInstanceOf[js.Any]))
      VPCZoneIdentifier.foreach(__v => __obj.updateDynamic("VPCZoneIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAutoScalingGroupType]
    }
  }

  @js.native
  trait CreateLaunchConfigurationType extends js.Object {
    var LaunchConfigurationName: XmlStringMaxLen255
    var AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings]
    var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255]
    var ClassicLinkVPCSecurityGroups: js.UndefOr[ClassicLinkVPCSecurityGroups]
    var EbsOptimized: js.UndefOr[EbsOptimized]
    var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600]
    var ImageId: js.UndefOr[XmlStringMaxLen255]
    var InstanceId: js.UndefOr[XmlStringMaxLen19]
    var InstanceMonitoring: js.UndefOr[InstanceMonitoring]
    var InstanceType: js.UndefOr[XmlStringMaxLen255]
    var KernelId: js.UndefOr[XmlStringMaxLen255]
    var KeyName: js.UndefOr[XmlStringMaxLen255]
    var MetadataOptions: js.UndefOr[InstanceMetadataOptions]
    var PlacementTenancy: js.UndefOr[XmlStringMaxLen64]
    var RamdiskId: js.UndefOr[XmlStringMaxLen255]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SpotPrice: js.UndefOr[SpotPrice]
    var UserData: js.UndefOr[XmlStringUserData]
  }

  object CreateLaunchConfigurationType {
    @inline
    def apply(
        LaunchConfigurationName: XmlStringMaxLen255,
        AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
        BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
        ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        ClassicLinkVPCSecurityGroups: js.UndefOr[ClassicLinkVPCSecurityGroups] = js.undefined,
        EbsOptimized: js.UndefOr[EbsOptimized] = js.undefined,
        IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined,
        ImageId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
        InstanceMonitoring: js.UndefOr[InstanceMonitoring] = js.undefined,
        InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        KeyName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        MetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.undefined,
        PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined,
        RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        SpotPrice: js.UndefOr[SpotPrice] = js.undefined,
        UserData: js.UndefOr[XmlStringUserData] = js.undefined
    ): CreateLaunchConfigurationType = {
      val __obj = js.Dynamic.literal(
        "LaunchConfigurationName" -> LaunchConfigurationName.asInstanceOf[js.Any]
      )

      AssociatePublicIpAddress.foreach(__v => __obj.updateDynamic("AssociatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      BlockDeviceMappings.foreach(__v => __obj.updateDynamic("BlockDeviceMappings")(__v.asInstanceOf[js.Any]))
      ClassicLinkVPCId.foreach(__v => __obj.updateDynamic("ClassicLinkVPCId")(__v.asInstanceOf[js.Any]))
      ClassicLinkVPCSecurityGroups.foreach(__v => __obj.updateDynamic("ClassicLinkVPCSecurityGroups")(__v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.updateDynamic("EbsOptimized")(__v.asInstanceOf[js.Any]))
      IamInstanceProfile.foreach(__v => __obj.updateDynamic("IamInstanceProfile")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      InstanceMonitoring.foreach(__v => __obj.updateDynamic("InstanceMonitoring")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      KernelId.foreach(__v => __obj.updateDynamic("KernelId")(__v.asInstanceOf[js.Any]))
      KeyName.foreach(__v => __obj.updateDynamic("KeyName")(__v.asInstanceOf[js.Any]))
      MetadataOptions.foreach(__v => __obj.updateDynamic("MetadataOptions")(__v.asInstanceOf[js.Any]))
      PlacementTenancy.foreach(__v => __obj.updateDynamic("PlacementTenancy")(__v.asInstanceOf[js.Any]))
      RamdiskId.foreach(__v => __obj.updateDynamic("RamdiskId")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SpotPrice.foreach(__v => __obj.updateDynamic("SpotPrice")(__v.asInstanceOf[js.Any]))
      UserData.foreach(__v => __obj.updateDynamic("UserData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLaunchConfigurationType]
    }
  }

  @js.native
  trait CreateOrUpdateTagsType extends js.Object {
    var Tags: Tags
  }

  object CreateOrUpdateTagsType {
    @inline
    def apply(
        Tags: Tags
    ): CreateOrUpdateTagsType = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateOrUpdateTagsType]
    }
  }

  /** Represents a CloudWatch metric of your choosing for a target tracking scaling policy to use with Amazon EC2 Auto Scaling. To create your customized metric specification: * Add values for each required property from CloudWatch. You can use an existing metric, or a new metric that you create. To use your own metric, you must first publish the metric to CloudWatch. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html|Publish custom metrics]] in the <i>Amazon CloudWatch User Guide</i>. * Choose a metric that changes proportionally with capacity. The value of the metric should increase or decrease in inverse proportion to the number of capacity units. That is, the value of the metric should decrease when capacity increases. For more information about the CloudWatch terminology below, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch concepts]].
    *
    * '''Note:'''Each individual service provides information about the metrics, namespace, and dimensions they use. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html|Amazon Web Services services that publish CloudWatch metrics]] in the <i>Amazon CloudWatch User Guide</i>.
    */
  @js.native
  trait CustomizedMetricSpecification extends js.Object {
    var Dimensions: js.UndefOr[MetricDimensions]
    var MetricName: js.UndefOr[MetricName]
    var Metrics: js.UndefOr[TargetTrackingMetricDataQueries]
    var Namespace: js.UndefOr[MetricNamespace]
    var Statistic: js.UndefOr[MetricStatistic]
    var Unit: js.UndefOr[MetricUnit]
  }

  object CustomizedMetricSpecification {
    @inline
    def apply(
        Dimensions: js.UndefOr[MetricDimensions] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Metrics: js.UndefOr[TargetTrackingMetricDataQueries] = js.undefined,
        Namespace: js.UndefOr[MetricNamespace] = js.undefined,
        Statistic: js.UndefOr[MetricStatistic] = js.undefined,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): CustomizedMetricSpecification = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.updateDynamic("Statistic")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomizedMetricSpecification]
    }
  }

  @js.native
  trait DeleteAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ForceDelete: js.UndefOr[ForceDelete]
  }

  object DeleteAutoScalingGroupType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ForceDelete: js.UndefOr[ForceDelete] = js.undefined
    ): DeleteAutoScalingGroupType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      ForceDelete.foreach(__v => __obj.updateDynamic("ForceDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAutoScalingGroupType]
    }
  }

  @js.native
  trait DeleteLifecycleHookAnswer extends js.Object

  object DeleteLifecycleHookAnswer {
    @inline
    def apply(): DeleteLifecycleHookAnswer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLifecycleHookAnswer]
    }
  }

  @js.native
  trait DeleteLifecycleHookType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var LifecycleHookName: AsciiStringMaxLen255
  }

  object DeleteLifecycleHookType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        LifecycleHookName: AsciiStringMaxLen255
    ): DeleteLifecycleHookType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLifecycleHookType]
    }
  }

  @js.native
  trait DeleteNotificationConfigurationType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var TopicARN: XmlStringMaxLen255
  }

  object DeleteNotificationConfigurationType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        TopicARN: XmlStringMaxLen255
    ): DeleteNotificationConfigurationType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TopicARN" -> TopicARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteNotificationConfigurationType]
    }
  }

  @js.native
  trait DeletePolicyType extends js.Object {
    var PolicyName: ResourceName
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
  }

  object DeletePolicyType {
    @inline
    def apply(
        PolicyName: ResourceName,
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): DeletePolicyType = {
      val __obj = js.Dynamic.literal(
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePolicyType]
    }
  }

  @js.native
  trait DeleteScheduledActionType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ScheduledActionName: XmlStringMaxLen255
  }

  object DeleteScheduledActionType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ScheduledActionName: XmlStringMaxLen255
    ): DeleteScheduledActionType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScheduledActionType]
    }
  }

  @js.native
  trait DeleteTagsType extends js.Object {
    var Tags: Tags
  }

  object DeleteTagsType {
    @inline
    def apply(
        Tags: Tags
    ): DeleteTagsType = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTagsType]
    }
  }

  @js.native
  trait DeleteWarmPoolAnswer extends js.Object

  object DeleteWarmPoolAnswer {
    @inline
    def apply(): DeleteWarmPoolAnswer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWarmPoolAnswer]
    }
  }

  @js.native
  trait DeleteWarmPoolType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ForceDelete: js.UndefOr[ForceDelete]
  }

  object DeleteWarmPoolType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ForceDelete: js.UndefOr[ForceDelete] = js.undefined
    ): DeleteWarmPoolType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      ForceDelete.foreach(__v => __obj.updateDynamic("ForceDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWarmPoolType]
    }
  }

  @js.native
  trait DescribeAccountLimitsAnswer extends js.Object {
    var MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups]
    var MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations]
    var NumberOfAutoScalingGroups: js.UndefOr[NumberOfAutoScalingGroups]
    var NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations]
  }

  object DescribeAccountLimitsAnswer {
    @inline
    def apply(
        MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups] = js.undefined,
        MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations] = js.undefined,
        NumberOfAutoScalingGroups: js.UndefOr[NumberOfAutoScalingGroups] = js.undefined,
        NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations] = js.undefined
    ): DescribeAccountLimitsAnswer = {
      val __obj = js.Dynamic.literal()
      MaxNumberOfAutoScalingGroups.foreach(__v => __obj.updateDynamic("MaxNumberOfAutoScalingGroups")(__v.asInstanceOf[js.Any]))
      MaxNumberOfLaunchConfigurations.foreach(__v => __obj.updateDynamic("MaxNumberOfLaunchConfigurations")(__v.asInstanceOf[js.Any]))
      NumberOfAutoScalingGroups.foreach(__v => __obj.updateDynamic("NumberOfAutoScalingGroups")(__v.asInstanceOf[js.Any]))
      NumberOfLaunchConfigurations.foreach(__v => __obj.updateDynamic("NumberOfLaunchConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountLimitsAnswer]
    }
  }

  @js.native
  trait DescribeAdjustmentTypesAnswer extends js.Object {
    var AdjustmentTypes: js.UndefOr[AdjustmentTypes]
  }

  object DescribeAdjustmentTypesAnswer {
    @inline
    def apply(
        AdjustmentTypes: js.UndefOr[AdjustmentTypes] = js.undefined
    ): DescribeAdjustmentTypesAnswer = {
      val __obj = js.Dynamic.literal()
      AdjustmentTypes.foreach(__v => __obj.updateDynamic("AdjustmentTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAdjustmentTypesAnswer]
    }
  }

  @js.native
  trait DescribeAutoScalingInstancesType extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIds]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeAutoScalingInstancesType {
    @inline
    def apply(
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeAutoScalingInstancesType = {
      val __obj = js.Dynamic.literal()
      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutoScalingInstancesType]
    }
  }

  @js.native
  trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
    var AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes]
  }

  object DescribeAutoScalingNotificationTypesAnswer {
    @inline
    def apply(
        AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
    ): DescribeAutoScalingNotificationTypesAnswer = {
      val __obj = js.Dynamic.literal()
      AutoScalingNotificationTypes.foreach(__v => __obj.updateDynamic("AutoScalingNotificationTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
    }
  }

  @js.native
  trait DescribeInstanceRefreshesAnswer extends js.Object {
    var InstanceRefreshes: js.UndefOr[InstanceRefreshes]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeInstanceRefreshesAnswer {
    @inline
    def apply(
        InstanceRefreshes: js.UndefOr[InstanceRefreshes] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeInstanceRefreshesAnswer = {
      val __obj = js.Dynamic.literal()
      InstanceRefreshes.foreach(__v => __obj.updateDynamic("InstanceRefreshes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceRefreshesAnswer]
    }
  }

  @js.native
  trait DescribeInstanceRefreshesType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var InstanceRefreshIds: js.UndefOr[InstanceRefreshIds]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeInstanceRefreshesType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        InstanceRefreshIds: js.UndefOr[InstanceRefreshIds] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeInstanceRefreshesType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      InstanceRefreshIds.foreach(__v => __obj.updateDynamic("InstanceRefreshIds")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceRefreshesType]
    }
  }

  @js.native
  trait DescribeLifecycleHookTypesAnswer extends js.Object {
    var LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes]
  }

  object DescribeLifecycleHookTypesAnswer {
    @inline
    def apply(
        LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
    ): DescribeLifecycleHookTypesAnswer = {
      val __obj = js.Dynamic.literal()
      LifecycleHookTypes.foreach(__v => __obj.updateDynamic("LifecycleHookTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLifecycleHookTypesAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHooksAnswer extends js.Object {
    var LifecycleHooks: js.UndefOr[LifecycleHooks]
  }

  object DescribeLifecycleHooksAnswer {
    @inline
    def apply(
        LifecycleHooks: js.UndefOr[LifecycleHooks] = js.undefined
    ): DescribeLifecycleHooksAnswer = {
      val __obj = js.Dynamic.literal()
      LifecycleHooks.foreach(__v => __obj.updateDynamic("LifecycleHooks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLifecycleHooksAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHooksType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var LifecycleHookNames: js.UndefOr[LifecycleHookNames]
  }

  object DescribeLifecycleHooksType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        LifecycleHookNames: js.UndefOr[LifecycleHookNames] = js.undefined
    ): DescribeLifecycleHooksType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      LifecycleHookNames.foreach(__v => __obj.updateDynamic("LifecycleHookNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLifecycleHooksType]
    }
  }

  @js.native
  trait DescribeLoadBalancerTargetGroupsRequest extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeLoadBalancerTargetGroupsRequest {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeLoadBalancerTargetGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerTargetGroupsRequest]
    }
  }

  @js.native
  trait DescribeLoadBalancerTargetGroupsResponse extends js.Object {
    var LoadBalancerTargetGroups: js.UndefOr[LoadBalancerTargetGroupStates]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeLoadBalancerTargetGroupsResponse {
    @inline
    def apply(
        LoadBalancerTargetGroups: js.UndefOr[LoadBalancerTargetGroupStates] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeLoadBalancerTargetGroupsResponse = {
      val __obj = js.Dynamic.literal()
      LoadBalancerTargetGroups.foreach(__v => __obj.updateDynamic("LoadBalancerTargetGroups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerTargetGroupsResponse]
    }
  }

  @js.native
  trait DescribeLoadBalancersRequest extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeLoadBalancersRequest {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeLoadBalancersRequest = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancersRequest]
    }
  }

  @js.native
  trait DescribeLoadBalancersResponse extends js.Object {
    var LoadBalancers: js.UndefOr[LoadBalancerStates]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeLoadBalancersResponse {
    @inline
    def apply(
        LoadBalancers: js.UndefOr[LoadBalancerStates] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeLoadBalancersResponse = {
      val __obj = js.Dynamic.literal()
      LoadBalancers.foreach(__v => __obj.updateDynamic("LoadBalancers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancersResponse]
    }
  }

  @js.native
  trait DescribeMetricCollectionTypesAnswer extends js.Object {
    var Granularities: js.UndefOr[MetricGranularityTypes]
    var Metrics: js.UndefOr[MetricCollectionTypes]
  }

  object DescribeMetricCollectionTypesAnswer {
    @inline
    def apply(
        Granularities: js.UndefOr[MetricGranularityTypes] = js.undefined,
        Metrics: js.UndefOr[MetricCollectionTypes] = js.undefined
    ): DescribeMetricCollectionTypesAnswer = {
      val __obj = js.Dynamic.literal()
      Granularities.foreach(__v => __obj.updateDynamic("Granularities")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMetricCollectionTypesAnswer]
    }
  }

  @js.native
  trait DescribeNotificationConfigurationsAnswer extends js.Object {
    var NotificationConfigurations: NotificationConfigurations
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeNotificationConfigurationsAnswer {
    @inline
    def apply(
        NotificationConfigurations: NotificationConfigurations,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeNotificationConfigurationsAnswer = {
      val __obj = js.Dynamic.literal(
        "NotificationConfigurations" -> NotificationConfigurations.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotificationConfigurationsAnswer]
    }
  }

  @js.native
  trait DescribeNotificationConfigurationsType extends js.Object {
    var AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeNotificationConfigurationsType {
    @inline
    def apply(
        AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeNotificationConfigurationsType = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupNames.foreach(__v => __obj.updateDynamic("AutoScalingGroupNames")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotificationConfigurationsType]
    }
  }

  @js.native
  trait DescribePoliciesType extends js.Object {
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
    var PolicyNames: js.UndefOr[PolicyNames]
    var PolicyTypes: js.UndefOr[PolicyTypes]
  }

  object DescribePoliciesType {
    @inline
    def apply(
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined,
        PolicyNames: js.UndefOr[PolicyNames] = js.undefined,
        PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
    ): DescribePoliciesType = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.updateDynamic("PolicyNames")(__v.asInstanceOf[js.Any]))
      PolicyTypes.foreach(__v => __obj.updateDynamic("PolicyTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePoliciesType]
    }
  }

  @js.native
  trait DescribeScalingActivitiesType extends js.Object {
    var ActivityIds: js.UndefOr[ActivityIds]
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var IncludeDeletedGroups: js.UndefOr[IncludeDeletedGroups]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScalingActivitiesType {
    @inline
    def apply(
        ActivityIds: js.UndefOr[ActivityIds] = js.undefined,
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        IncludeDeletedGroups: js.UndefOr[IncludeDeletedGroups] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeScalingActivitiesType = {
      val __obj = js.Dynamic.literal()
      ActivityIds.foreach(__v => __obj.updateDynamic("ActivityIds")(__v.asInstanceOf[js.Any]))
      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      IncludeDeletedGroups.foreach(__v => __obj.updateDynamic("IncludeDeletedGroups")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingActivitiesType]
    }
  }

  @js.native
  trait DescribeScheduledActionsType extends js.Object {
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var EndTime: js.UndefOr[TimestampType]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
    var ScheduledActionNames: js.UndefOr[ScheduledActionNames]
    var StartTime: js.UndefOr[TimestampType]
  }

  object DescribeScheduledActionsType {
    @inline
    def apply(
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        EndTime: js.UndefOr[TimestampType] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ScheduledActionNames: js.UndefOr[ScheduledActionNames] = js.undefined,
        StartTime: js.UndefOr[TimestampType] = js.undefined
    ): DescribeScheduledActionsType = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScheduledActionNames.foreach(__v => __obj.updateDynamic("ScheduledActionNames")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScheduledActionsType]
    }
  }

  @js.native
  trait DescribeTagsType extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeTagsType {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeTagsType = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsType]
    }
  }

  @js.native
  trait DescribeTerminationPolicyTypesAnswer extends js.Object {
    var TerminationPolicyTypes: js.UndefOr[TerminationPolicies]
  }

  object DescribeTerminationPolicyTypesAnswer {
    @inline
    def apply(
        TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.undefined
    ): DescribeTerminationPolicyTypesAnswer = {
      val __obj = js.Dynamic.literal()
      TerminationPolicyTypes.foreach(__v => __obj.updateDynamic("TerminationPolicyTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTerminationPolicyTypesAnswer]
    }
  }

  @js.native
  trait DescribeTrafficSourcesRequest extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var TrafficSourceType: XmlStringMaxLen255
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeTrafficSourcesRequest {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        TrafficSourceType: XmlStringMaxLen255,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeTrafficSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TrafficSourceType" -> TrafficSourceType.asInstanceOf[js.Any]
      )

      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrafficSourcesRequest]
    }
  }

  @js.native
  trait DescribeTrafficSourcesResponse extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var TrafficSources: js.UndefOr[TrafficSourceStates]
  }

  object DescribeTrafficSourcesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[XmlString] = js.undefined,
        TrafficSources: js.UndefOr[TrafficSourceStates] = js.undefined
    ): DescribeTrafficSourcesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TrafficSources.foreach(__v => __obj.updateDynamic("TrafficSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrafficSourcesResponse]
    }
  }

  @js.native
  trait DescribeWarmPoolAnswer extends js.Object {
    var Instances: js.UndefOr[Instances]
    var NextToken: js.UndefOr[XmlString]
    var WarmPoolConfiguration: js.UndefOr[WarmPoolConfiguration]
  }

  object DescribeWarmPoolAnswer {
    @inline
    def apply(
        Instances: js.UndefOr[Instances] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined,
        WarmPoolConfiguration: js.UndefOr[WarmPoolConfiguration] = js.undefined
    ): DescribeWarmPoolAnswer = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WarmPoolConfiguration.foreach(__v => __obj.updateDynamic("WarmPoolConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWarmPoolAnswer]
    }
  }

  @js.native
  trait DescribeWarmPoolType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeWarmPoolType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeWarmPoolType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWarmPoolType]
    }
  }

  /** Describes the desired configuration for an instance refresh. If you specify a desired configuration, you must specify either a <code>LaunchTemplate</code> or a <code>MixedInstancesPolicy</code>.
    */
  @js.native
  trait DesiredConfiguration extends js.Object {
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy]
  }

  object DesiredConfiguration {
    @inline
    def apply(
        LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined
    ): DesiredConfiguration = {
      val __obj = js.Dynamic.literal()
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      MixedInstancesPolicy.foreach(__v => __obj.updateDynamic("MixedInstancesPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DesiredConfiguration]
    }
  }

  @js.native
  trait DetachInstancesAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object DetachInstancesAnswer {
    @inline
    def apply(
        Activities: js.UndefOr[Activities] = js.undefined
    ): DetachInstancesAnswer = {
      val __obj = js.Dynamic.literal()
      Activities.foreach(__v => __obj.updateDynamic("Activities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachInstancesAnswer]
    }
  }

  @js.native
  trait DetachInstancesQuery extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  object DetachInstancesQuery {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity,
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    ): DetachInstancesQuery = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachInstancesQuery]
    }
  }

  @js.native
  trait DetachLoadBalancerTargetGroupsResultType extends js.Object

  object DetachLoadBalancerTargetGroupsResultType {
    @inline
    def apply(): DetachLoadBalancerTargetGroupsResultType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetachLoadBalancerTargetGroupsResultType]
    }
  }

  @js.native
  trait DetachLoadBalancerTargetGroupsType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var TargetGroupARNs: TargetGroupARNs
  }

  object DetachLoadBalancerTargetGroupsType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        TargetGroupARNs: TargetGroupARNs
    ): DetachLoadBalancerTargetGroupsType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TargetGroupARNs" -> TargetGroupARNs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetachLoadBalancerTargetGroupsType]
    }
  }

  @js.native
  trait DetachLoadBalancersResultType extends js.Object

  object DetachLoadBalancersResultType {
    @inline
    def apply(): DetachLoadBalancersResultType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetachLoadBalancersResultType]
    }
  }

  @js.native
  trait DetachLoadBalancersType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var LoadBalancerNames: LoadBalancerNames
  }

  object DetachLoadBalancersType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        LoadBalancerNames: LoadBalancerNames
    ): DetachLoadBalancersType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetachLoadBalancersType]
    }
  }

  @js.native
  trait DetachTrafficSourcesResultType extends js.Object

  object DetachTrafficSourcesResultType {
    @inline
    def apply(): DetachTrafficSourcesResultType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetachTrafficSourcesResultType]
    }
  }

  @js.native
  trait DetachTrafficSourcesType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var TrafficSources: TrafficSources
  }

  object DetachTrafficSourcesType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        TrafficSources: TrafficSources
    ): DetachTrafficSourcesType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TrafficSources" -> TrafficSources.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetachTrafficSourcesType]
    }
  }

  @js.native
  trait DisableMetricsCollectionQuery extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var Metrics: js.UndefOr[Metrics]
  }

  object DisableMetricsCollectionQuery {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        Metrics: js.UndefOr[Metrics] = js.undefined
    ): DisableMetricsCollectionQuery = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableMetricsCollectionQuery]
    }
  }

  /** Describes information used to set up an Amazon EBS volume specified in a block device mapping.
    */
  @js.native
  trait Ebs extends js.Object {
    var DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination]
    var Encrypted: js.UndefOr[BlockDeviceEbsEncrypted]
    var Iops: js.UndefOr[BlockDeviceEbsIops]
    var SnapshotId: js.UndefOr[XmlStringMaxLen255]
    var Throughput: js.UndefOr[BlockDeviceEbsThroughput]
    var VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize]
    var VolumeType: js.UndefOr[BlockDeviceEbsVolumeType]
  }

  object Ebs {
    @inline
    def apply(
        DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination] = js.undefined,
        Encrypted: js.UndefOr[BlockDeviceEbsEncrypted] = js.undefined,
        Iops: js.UndefOr[BlockDeviceEbsIops] = js.undefined,
        SnapshotId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        Throughput: js.UndefOr[BlockDeviceEbsThroughput] = js.undefined,
        VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize] = js.undefined,
        VolumeType: js.UndefOr[BlockDeviceEbsVolumeType] = js.undefined
    ): Ebs = {
      val __obj = js.Dynamic.literal()
      DeleteOnTermination.foreach(__v => __obj.updateDynamic("DeleteOnTermination")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      Throughput.foreach(__v => __obj.updateDynamic("Throughput")(__v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.updateDynamic("VolumeSize")(__v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.updateDynamic("VolumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ebs]
    }
  }

  @js.native
  trait EnableMetricsCollectionQuery extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var Granularity: XmlStringMaxLen255
    var Metrics: js.UndefOr[Metrics]
  }

  object EnableMetricsCollectionQuery {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        Granularity: XmlStringMaxLen255,
        Metrics: js.UndefOr[Metrics] = js.undefined
    ): EnableMetricsCollectionQuery = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "Granularity" -> Granularity.asInstanceOf[js.Any]
      )

      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableMetricsCollectionQuery]
    }
  }

  /** Describes an enabled Auto Scaling group metric.
    */
  @js.native
  trait EnabledMetric extends js.Object {
    var Granularity: js.UndefOr[XmlStringMaxLen255]
    var Metric: js.UndefOr[XmlStringMaxLen255]
  }

  object EnabledMetric {
    @inline
    def apply(
        Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): EnabledMetric = {
      val __obj = js.Dynamic.literal()
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnabledMetric]
    }
  }

  @js.native
  trait EnterStandbyAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object EnterStandbyAnswer {
    @inline
    def apply(
        Activities: js.UndefOr[Activities] = js.undefined
    ): EnterStandbyAnswer = {
      val __obj = js.Dynamic.literal()
      Activities.foreach(__v => __obj.updateDynamic("Activities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnterStandbyAnswer]
    }
  }

  @js.native
  trait EnterStandbyQuery extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  object EnterStandbyQuery {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity,
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    ): EnterStandbyQuery = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnterStandbyQuery]
    }
  }

  @js.native
  trait ExecutePolicyType extends js.Object {
    var PolicyName: ResourceName
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var BreachThreshold: js.UndefOr[MetricScale]
    var HonorCooldown: js.UndefOr[HonorCooldown]
    var MetricValue: js.UndefOr[MetricScale]
  }

  object ExecutePolicyType {
    @inline
    def apply(
        PolicyName: ResourceName,
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        BreachThreshold: js.UndefOr[MetricScale] = js.undefined,
        HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined,
        MetricValue: js.UndefOr[MetricScale] = js.undefined
    ): ExecutePolicyType = {
      val __obj = js.Dynamic.literal(
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      BreachThreshold.foreach(__v => __obj.updateDynamic("BreachThreshold")(__v.asInstanceOf[js.Any]))
      HonorCooldown.foreach(__v => __obj.updateDynamic("HonorCooldown")(__v.asInstanceOf[js.Any]))
      MetricValue.foreach(__v => __obj.updateDynamic("MetricValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutePolicyType]
    }
  }

  @js.native
  trait ExitStandbyAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object ExitStandbyAnswer {
    @inline
    def apply(
        Activities: js.UndefOr[Activities] = js.undefined
    ): ExitStandbyAnswer = {
      val __obj = js.Dynamic.literal()
      Activities.foreach(__v => __obj.updateDynamic("Activities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExitStandbyAnswer]
    }
  }

  @js.native
  trait ExitStandbyQuery extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  object ExitStandbyQuery {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    ): ExitStandbyQuery = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExitStandbyQuery]
    }
  }

  /** Describes a scheduled action that could not be created, updated, or deleted.
    */
  @js.native
  trait FailedScheduledUpdateGroupActionRequest extends js.Object {
    var ScheduledActionName: XmlStringMaxLen255
    var ErrorCode: js.UndefOr[XmlStringMaxLen64]
    var ErrorMessage: js.UndefOr[XmlString]
  }

  object FailedScheduledUpdateGroupActionRequest {
    @inline
    def apply(
        ScheduledActionName: XmlStringMaxLen255,
        ErrorCode: js.UndefOr[XmlStringMaxLen64] = js.undefined,
        ErrorMessage: js.UndefOr[XmlString] = js.undefined
    ): FailedScheduledUpdateGroupActionRequest = {
      val __obj = js.Dynamic.literal(
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]
      )

      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedScheduledUpdateGroupActionRequest]
    }
  }

  /** Describes a filter that is used to return a more specific list of results from a describe operation. If you specify multiple filters, the filters are automatically logically joined with an <code>AND</code>, and the request returns only the results that match all of the specified filters. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html|Tag Auto Scaling groups and instances]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[XmlString]
    var Values: js.UndefOr[Values]
  }

  object Filter {
    @inline
    def apply(
        Name: js.UndefOr[XmlString] = js.undefined,
        Values: js.UndefOr[Values] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetPredictiveScalingForecastAnswer extends js.Object {
    var CapacityForecast: CapacityForecast
    var LoadForecast: LoadForecasts
    var UpdateTime: TimestampType
  }

  object GetPredictiveScalingForecastAnswer {
    @inline
    def apply(
        CapacityForecast: CapacityForecast,
        LoadForecast: LoadForecasts,
        UpdateTime: TimestampType
    ): GetPredictiveScalingForecastAnswer = {
      val __obj = js.Dynamic.literal(
        "CapacityForecast" -> CapacityForecast.asInstanceOf[js.Any],
        "LoadForecast" -> LoadForecast.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPredictiveScalingForecastAnswer]
    }
  }

  @js.native
  trait GetPredictiveScalingForecastType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var EndTime: TimestampType
    var PolicyName: XmlStringMaxLen255
    var StartTime: TimestampType
  }

  object GetPredictiveScalingForecastType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        EndTime: TimestampType,
        PolicyName: XmlStringMaxLen255,
        StartTime: TimestampType
    ): GetPredictiveScalingForecastType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPredictiveScalingForecastType]
    }
  }

  /** Describes an EC2 instance.
    */
  @js.native
  trait Instance extends js.Object {
    var AvailabilityZone: XmlStringMaxLen255
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen19
    var LifecycleState: LifecycleState
    var ProtectedFromScaleIn: InstanceProtected
    var InstanceType: js.UndefOr[XmlStringMaxLen255]
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var WeightedCapacity: js.UndefOr[XmlStringMaxLen32]
  }

  object Instance {
    @inline
    def apply(
        AvailabilityZone: XmlStringMaxLen255,
        HealthStatus: XmlStringMaxLen32,
        InstanceId: XmlStringMaxLen19,
        LifecycleState: LifecycleState,
        ProtectedFromScaleIn: InstanceProtected,
        InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        WeightedCapacity: js.UndefOr[XmlStringMaxLen32] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "HealthStatus" -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LifecycleState" -> LifecycleState.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any]
      )

      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.updateDynamic("LaunchConfigurationName")(__v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      WeightedCapacity.foreach(__v => __obj.updateDynamic("WeightedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /** The metadata options for the instances. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds|Configuring the Instance Metadata Options]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait InstanceMetadataOptions extends js.Object {
    var HttpEndpoint: js.UndefOr[InstanceMetadataEndpointState]
    var HttpPutResponseHopLimit: js.UndefOr[InstanceMetadataHttpPutResponseHopLimit]
    var HttpTokens: js.UndefOr[InstanceMetadataHttpTokensState]
  }

  object InstanceMetadataOptions {
    @inline
    def apply(
        HttpEndpoint: js.UndefOr[InstanceMetadataEndpointState] = js.undefined,
        HttpPutResponseHopLimit: js.UndefOr[InstanceMetadataHttpPutResponseHopLimit] = js.undefined,
        HttpTokens: js.UndefOr[InstanceMetadataHttpTokensState] = js.undefined
    ): InstanceMetadataOptions = {
      val __obj = js.Dynamic.literal()
      HttpEndpoint.foreach(__v => __obj.updateDynamic("HttpEndpoint")(__v.asInstanceOf[js.Any]))
      HttpPutResponseHopLimit.foreach(__v => __obj.updateDynamic("HttpPutResponseHopLimit")(__v.asInstanceOf[js.Any]))
      HttpTokens.foreach(__v => __obj.updateDynamic("HttpTokens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceMetadataOptions]
    }
  }

  /** Describes whether detailed monitoring is enabled for the Auto Scaling instances.
    */
  @js.native
  trait InstanceMonitoring extends js.Object {
    var Enabled: js.UndefOr[MonitoringEnabled]
  }

  object InstanceMonitoring {
    @inline
    def apply(
        Enabled: js.UndefOr[MonitoringEnabled] = js.undefined
    ): InstanceMonitoring = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceMonitoring]
    }
  }

  /** Describes an instance refresh for an Auto Scaling group.
    */
  @js.native
  trait InstanceRefresh extends js.Object {
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var DesiredConfiguration: js.UndefOr[DesiredConfiguration]
    var EndTime: js.UndefOr[TimestampType]
    var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255]
    var InstancesToUpdate: js.UndefOr[InstancesToUpdate]
    var PercentageComplete: js.UndefOr[IntPercent]
    var Preferences: js.UndefOr[RefreshPreferences]
    var ProgressDetails: js.UndefOr[InstanceRefreshProgressDetails]
    var StartTime: js.UndefOr[TimestampType]
    var Status: js.UndefOr[InstanceRefreshStatus]
    var StatusReason: js.UndefOr[XmlStringMaxLen1023]
  }

  object InstanceRefresh {
    @inline
    def apply(
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        DesiredConfiguration: js.UndefOr[DesiredConfiguration] = js.undefined,
        EndTime: js.UndefOr[TimestampType] = js.undefined,
        InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        InstancesToUpdate: js.UndefOr[InstancesToUpdate] = js.undefined,
        PercentageComplete: js.UndefOr[IntPercent] = js.undefined,
        Preferences: js.UndefOr[RefreshPreferences] = js.undefined,
        ProgressDetails: js.UndefOr[InstanceRefreshProgressDetails] = js.undefined,
        StartTime: js.UndefOr[TimestampType] = js.undefined,
        Status: js.UndefOr[InstanceRefreshStatus] = js.undefined,
        StatusReason: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    ): InstanceRefresh = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      DesiredConfiguration.foreach(__v => __obj.updateDynamic("DesiredConfiguration")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InstanceRefreshId.foreach(__v => __obj.updateDynamic("InstanceRefreshId")(__v.asInstanceOf[js.Any]))
      InstancesToUpdate.foreach(__v => __obj.updateDynamic("InstancesToUpdate")(__v.asInstanceOf[js.Any]))
      PercentageComplete.foreach(__v => __obj.updateDynamic("PercentageComplete")(__v.asInstanceOf[js.Any]))
      Preferences.foreach(__v => __obj.updateDynamic("Preferences")(__v.asInstanceOf[js.Any]))
      ProgressDetails.foreach(__v => __obj.updateDynamic("ProgressDetails")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceRefresh]
    }
  }

  /** Reports the progress of an instance refresh on instances that are in the Auto Scaling group.
    */
  @js.native
  trait InstanceRefreshLivePoolProgress extends js.Object {
    var InstancesToUpdate: js.UndefOr[InstancesToUpdate]
    var PercentageComplete: js.UndefOr[IntPercent]
  }

  object InstanceRefreshLivePoolProgress {
    @inline
    def apply(
        InstancesToUpdate: js.UndefOr[InstancesToUpdate] = js.undefined,
        PercentageComplete: js.UndefOr[IntPercent] = js.undefined
    ): InstanceRefreshLivePoolProgress = {
      val __obj = js.Dynamic.literal()
      InstancesToUpdate.foreach(__v => __obj.updateDynamic("InstancesToUpdate")(__v.asInstanceOf[js.Any]))
      PercentageComplete.foreach(__v => __obj.updateDynamic("PercentageComplete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceRefreshLivePoolProgress]
    }
  }

  /** Reports the progress of an instance refresh on an Auto Scaling group that has a warm pool. This includes separate details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
    */
  @js.native
  trait InstanceRefreshProgressDetails extends js.Object {
    var LivePoolProgress: js.UndefOr[InstanceRefreshLivePoolProgress]
    var WarmPoolProgress: js.UndefOr[InstanceRefreshWarmPoolProgress]
  }

  object InstanceRefreshProgressDetails {
    @inline
    def apply(
        LivePoolProgress: js.UndefOr[InstanceRefreshLivePoolProgress] = js.undefined,
        WarmPoolProgress: js.UndefOr[InstanceRefreshWarmPoolProgress] = js.undefined
    ): InstanceRefreshProgressDetails = {
      val __obj = js.Dynamic.literal()
      LivePoolProgress.foreach(__v => __obj.updateDynamic("LivePoolProgress")(__v.asInstanceOf[js.Any]))
      WarmPoolProgress.foreach(__v => __obj.updateDynamic("WarmPoolProgress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceRefreshProgressDetails]
    }
  }

  /** Reports the progress of an instance refresh on instances that are in the warm pool.
    */
  @js.native
  trait InstanceRefreshWarmPoolProgress extends js.Object {
    var InstancesToUpdate: js.UndefOr[InstancesToUpdate]
    var PercentageComplete: js.UndefOr[IntPercent]
  }

  object InstanceRefreshWarmPoolProgress {
    @inline
    def apply(
        InstancesToUpdate: js.UndefOr[InstancesToUpdate] = js.undefined,
        PercentageComplete: js.UndefOr[IntPercent] = js.undefined
    ): InstanceRefreshWarmPoolProgress = {
      val __obj = js.Dynamic.literal()
      InstancesToUpdate.foreach(__v => __obj.updateDynamic("InstancesToUpdate")(__v.asInstanceOf[js.Any]))
      PercentageComplete.foreach(__v => __obj.updateDynamic("PercentageComplete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceRefreshWarmPoolProgress]
    }
  }

  /** The attributes for the instance types for a mixed instances policy. Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then, it uses your On-Demand and Spot allocation strategies to launch instances from these instance types. When you specify multiple attributes, you get instance types that satisfy all of the specified attributes. If you specify multiple values for an attribute, you get instance types that satisfy any of the specified values. To limit the list of instance types from which Amazon EC2 Auto Scaling can identify matching instance types, you can use one of the following parameters, but not both in the same request: * <code>AllowedInstanceTypes</code> - The instance types to include in the list. All other instance types are ignored, even if they match your specified attributes. * <code>ExcludedInstanceTypes</code> - The instance types to exclude from the list, even if they match your specified attributes. '''Note:'''You must specify
    * <code>VCpuCount</code> and <code>MemoryMiB</code>. All other attributes are optional. Any unspecified optional attribute is set to its default. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-instance-type-requirements.html|Creating an Auto Scaling group using attribute-based instance type selection]] in the <i>Amazon EC2 Auto Scaling User Guide</i>. For help determining which instance types match your attributes before you apply them to your Auto Scaling group, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-get-instance-types-from-instance-requirements|Preview instance types with specified attributes]] in the <i>Amazon EC2 User Guide for Linux Instances</i>.
    */
  @js.native
  trait InstanceRequirements extends js.Object {
    var MemoryMiB: MemoryMiBRequest
    var VCpuCount: VCpuCountRequest
    var AcceleratorCount: js.UndefOr[AcceleratorCountRequest]
    var AcceleratorManufacturers: js.UndefOr[AcceleratorManufacturers]
    var AcceleratorNames: js.UndefOr[AcceleratorNames]
    var AcceleratorTotalMemoryMiB: js.UndefOr[AcceleratorTotalMemoryMiBRequest]
    var AcceleratorTypes: js.UndefOr[AcceleratorTypes]
    var AllowedInstanceTypes: js.UndefOr[AllowedInstanceTypes]
    var BareMetal: js.UndefOr[BareMetal]
    var BaselineEbsBandwidthMbps: js.UndefOr[BaselineEbsBandwidthMbpsRequest]
    var BurstablePerformance: js.UndefOr[BurstablePerformance]
    var CpuManufacturers: js.UndefOr[CpuManufacturers]
    var ExcludedInstanceTypes: js.UndefOr[ExcludedInstanceTypes]
    var InstanceGenerations: js.UndefOr[InstanceGenerations]
    var LocalStorage: js.UndefOr[LocalStorage]
    var LocalStorageTypes: js.UndefOr[LocalStorageTypes]
    var MemoryGiBPerVCpu: js.UndefOr[MemoryGiBPerVCpuRequest]
    var NetworkBandwidthGbps: js.UndefOr[NetworkBandwidthGbpsRequest]
    var NetworkInterfaceCount: js.UndefOr[NetworkInterfaceCountRequest]
    var OnDemandMaxPricePercentageOverLowestPrice: js.UndefOr[NullablePositiveInteger]
    var RequireHibernateSupport: js.UndefOr[NullableBoolean]
    var SpotMaxPricePercentageOverLowestPrice: js.UndefOr[NullablePositiveInteger]
    var TotalLocalStorageGB: js.UndefOr[TotalLocalStorageGBRequest]
  }

  object InstanceRequirements {
    @inline
    def apply(
        MemoryMiB: MemoryMiBRequest,
        VCpuCount: VCpuCountRequest,
        AcceleratorCount: js.UndefOr[AcceleratorCountRequest] = js.undefined,
        AcceleratorManufacturers: js.UndefOr[AcceleratorManufacturers] = js.undefined,
        AcceleratorNames: js.UndefOr[AcceleratorNames] = js.undefined,
        AcceleratorTotalMemoryMiB: js.UndefOr[AcceleratorTotalMemoryMiBRequest] = js.undefined,
        AcceleratorTypes: js.UndefOr[AcceleratorTypes] = js.undefined,
        AllowedInstanceTypes: js.UndefOr[AllowedInstanceTypes] = js.undefined,
        BareMetal: js.UndefOr[BareMetal] = js.undefined,
        BaselineEbsBandwidthMbps: js.UndefOr[BaselineEbsBandwidthMbpsRequest] = js.undefined,
        BurstablePerformance: js.UndefOr[BurstablePerformance] = js.undefined,
        CpuManufacturers: js.UndefOr[CpuManufacturers] = js.undefined,
        ExcludedInstanceTypes: js.UndefOr[ExcludedInstanceTypes] = js.undefined,
        InstanceGenerations: js.UndefOr[InstanceGenerations] = js.undefined,
        LocalStorage: js.UndefOr[LocalStorage] = js.undefined,
        LocalStorageTypes: js.UndefOr[LocalStorageTypes] = js.undefined,
        MemoryGiBPerVCpu: js.UndefOr[MemoryGiBPerVCpuRequest] = js.undefined,
        NetworkBandwidthGbps: js.UndefOr[NetworkBandwidthGbpsRequest] = js.undefined,
        NetworkInterfaceCount: js.UndefOr[NetworkInterfaceCountRequest] = js.undefined,
        OnDemandMaxPricePercentageOverLowestPrice: js.UndefOr[NullablePositiveInteger] = js.undefined,
        RequireHibernateSupport: js.UndefOr[NullableBoolean] = js.undefined,
        SpotMaxPricePercentageOverLowestPrice: js.UndefOr[NullablePositiveInteger] = js.undefined,
        TotalLocalStorageGB: js.UndefOr[TotalLocalStorageGBRequest] = js.undefined
    ): InstanceRequirements = {
      val __obj = js.Dynamic.literal(
        "MemoryMiB" -> MemoryMiB.asInstanceOf[js.Any],
        "VCpuCount" -> VCpuCount.asInstanceOf[js.Any]
      )

      AcceleratorCount.foreach(__v => __obj.updateDynamic("AcceleratorCount")(__v.asInstanceOf[js.Any]))
      AcceleratorManufacturers.foreach(__v => __obj.updateDynamic("AcceleratorManufacturers")(__v.asInstanceOf[js.Any]))
      AcceleratorNames.foreach(__v => __obj.updateDynamic("AcceleratorNames")(__v.asInstanceOf[js.Any]))
      AcceleratorTotalMemoryMiB.foreach(__v => __obj.updateDynamic("AcceleratorTotalMemoryMiB")(__v.asInstanceOf[js.Any]))
      AcceleratorTypes.foreach(__v => __obj.updateDynamic("AcceleratorTypes")(__v.asInstanceOf[js.Any]))
      AllowedInstanceTypes.foreach(__v => __obj.updateDynamic("AllowedInstanceTypes")(__v.asInstanceOf[js.Any]))
      BareMetal.foreach(__v => __obj.updateDynamic("BareMetal")(__v.asInstanceOf[js.Any]))
      BaselineEbsBandwidthMbps.foreach(__v => __obj.updateDynamic("BaselineEbsBandwidthMbps")(__v.asInstanceOf[js.Any]))
      BurstablePerformance.foreach(__v => __obj.updateDynamic("BurstablePerformance")(__v.asInstanceOf[js.Any]))
      CpuManufacturers.foreach(__v => __obj.updateDynamic("CpuManufacturers")(__v.asInstanceOf[js.Any]))
      ExcludedInstanceTypes.foreach(__v => __obj.updateDynamic("ExcludedInstanceTypes")(__v.asInstanceOf[js.Any]))
      InstanceGenerations.foreach(__v => __obj.updateDynamic("InstanceGenerations")(__v.asInstanceOf[js.Any]))
      LocalStorage.foreach(__v => __obj.updateDynamic("LocalStorage")(__v.asInstanceOf[js.Any]))
      LocalStorageTypes.foreach(__v => __obj.updateDynamic("LocalStorageTypes")(__v.asInstanceOf[js.Any]))
      MemoryGiBPerVCpu.foreach(__v => __obj.updateDynamic("MemoryGiBPerVCpu")(__v.asInstanceOf[js.Any]))
      NetworkBandwidthGbps.foreach(__v => __obj.updateDynamic("NetworkBandwidthGbps")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceCount.foreach(__v => __obj.updateDynamic("NetworkInterfaceCount")(__v.asInstanceOf[js.Any]))
      OnDemandMaxPricePercentageOverLowestPrice.foreach(__v => __obj.updateDynamic("OnDemandMaxPricePercentageOverLowestPrice")(__v.asInstanceOf[js.Any]))
      RequireHibernateSupport.foreach(__v => __obj.updateDynamic("RequireHibernateSupport")(__v.asInstanceOf[js.Any]))
      SpotMaxPricePercentageOverLowestPrice.foreach(__v => __obj.updateDynamic("SpotMaxPricePercentageOverLowestPrice")(__v.asInstanceOf[js.Any]))
      TotalLocalStorageGB.foreach(__v => __obj.updateDynamic("TotalLocalStorageGB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceRequirements]
    }
  }

  /** Describes an instance reuse policy for a warm pool. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html|Warm pools for Amazon EC2 Auto Scaling]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait InstanceReusePolicy extends js.Object {
    var ReuseOnScaleIn: js.UndefOr[ReuseOnScaleIn]
  }

  object InstanceReusePolicy {
    @inline
    def apply(
        ReuseOnScaleIn: js.UndefOr[ReuseOnScaleIn] = js.undefined
    ): InstanceReusePolicy = {
      val __obj = js.Dynamic.literal()
      ReuseOnScaleIn.foreach(__v => __obj.updateDynamic("ReuseOnScaleIn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceReusePolicy]
    }
  }

  /** Use this structure to specify the distribution of On-Demand Instances and Spot Instances and the allocation strategies used to fulfill On-Demand and Spot capacities for a mixed instances policy.
    */
  @js.native
  trait InstancesDistribution extends js.Object {
    var OnDemandAllocationStrategy: js.UndefOr[XmlString]
    var OnDemandBaseCapacity: js.UndefOr[OnDemandBaseCapacity]
    var OnDemandPercentageAboveBaseCapacity: js.UndefOr[OnDemandPercentageAboveBaseCapacity]
    var SpotAllocationStrategy: js.UndefOr[XmlString]
    var SpotInstancePools: js.UndefOr[SpotInstancePools]
    var SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice]
  }

  object InstancesDistribution {
    @inline
    def apply(
        OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.undefined,
        OnDemandBaseCapacity: js.UndefOr[OnDemandBaseCapacity] = js.undefined,
        OnDemandPercentageAboveBaseCapacity: js.UndefOr[OnDemandPercentageAboveBaseCapacity] = js.undefined,
        SpotAllocationStrategy: js.UndefOr[XmlString] = js.undefined,
        SpotInstancePools: js.UndefOr[SpotInstancePools] = js.undefined,
        SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice] = js.undefined
    ): InstancesDistribution = {
      val __obj = js.Dynamic.literal()
      OnDemandAllocationStrategy.foreach(__v => __obj.updateDynamic("OnDemandAllocationStrategy")(__v.asInstanceOf[js.Any]))
      OnDemandBaseCapacity.foreach(__v => __obj.updateDynamic("OnDemandBaseCapacity")(__v.asInstanceOf[js.Any]))
      OnDemandPercentageAboveBaseCapacity.foreach(__v => __obj.updateDynamic("OnDemandPercentageAboveBaseCapacity")(__v.asInstanceOf[js.Any]))
      SpotAllocationStrategy.foreach(__v => __obj.updateDynamic("SpotAllocationStrategy")(__v.asInstanceOf[js.Any]))
      SpotInstancePools.foreach(__v => __obj.updateDynamic("SpotInstancePools")(__v.asInstanceOf[js.Any]))
      SpotMaxPrice.foreach(__v => __obj.updateDynamic("SpotMaxPrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstancesDistribution]
    }
  }

  /** Describes a launch configuration.
    */
  @js.native
  trait LaunchConfiguration extends js.Object {
    var CreatedTime: TimestampType
    var ImageId: XmlStringMaxLen255
    var InstanceType: XmlStringMaxLen255
    var LaunchConfigurationName: XmlStringMaxLen255
    var AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings]
    var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255]
    var ClassicLinkVPCSecurityGroups: js.UndefOr[ClassicLinkVPCSecurityGroups]
    var EbsOptimized: js.UndefOr[EbsOptimized]
    var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600]
    var InstanceMonitoring: js.UndefOr[InstanceMonitoring]
    var KernelId: js.UndefOr[XmlStringMaxLen255]
    var KeyName: js.UndefOr[XmlStringMaxLen255]
    var LaunchConfigurationARN: js.UndefOr[ResourceName]
    var MetadataOptions: js.UndefOr[InstanceMetadataOptions]
    var PlacementTenancy: js.UndefOr[XmlStringMaxLen64]
    var RamdiskId: js.UndefOr[XmlStringMaxLen255]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SpotPrice: js.UndefOr[SpotPrice]
    var UserData: js.UndefOr[XmlStringUserData]
  }

  object LaunchConfiguration {
    @inline
    def apply(
        CreatedTime: TimestampType,
        ImageId: XmlStringMaxLen255,
        InstanceType: XmlStringMaxLen255,
        LaunchConfigurationName: XmlStringMaxLen255,
        AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
        BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
        ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        ClassicLinkVPCSecurityGroups: js.UndefOr[ClassicLinkVPCSecurityGroups] = js.undefined,
        EbsOptimized: js.UndefOr[EbsOptimized] = js.undefined,
        IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined,
        InstanceMonitoring: js.UndefOr[InstanceMonitoring] = js.undefined,
        KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        KeyName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchConfigurationARN: js.UndefOr[ResourceName] = js.undefined,
        MetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.undefined,
        PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined,
        RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        SpotPrice: js.UndefOr[SpotPrice] = js.undefined,
        UserData: js.UndefOr[XmlStringUserData] = js.undefined
    ): LaunchConfiguration = {
      val __obj = js.Dynamic.literal(
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "ImageId" -> ImageId.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "LaunchConfigurationName" -> LaunchConfigurationName.asInstanceOf[js.Any]
      )

      AssociatePublicIpAddress.foreach(__v => __obj.updateDynamic("AssociatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      BlockDeviceMappings.foreach(__v => __obj.updateDynamic("BlockDeviceMappings")(__v.asInstanceOf[js.Any]))
      ClassicLinkVPCId.foreach(__v => __obj.updateDynamic("ClassicLinkVPCId")(__v.asInstanceOf[js.Any]))
      ClassicLinkVPCSecurityGroups.foreach(__v => __obj.updateDynamic("ClassicLinkVPCSecurityGroups")(__v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.updateDynamic("EbsOptimized")(__v.asInstanceOf[js.Any]))
      IamInstanceProfile.foreach(__v => __obj.updateDynamic("IamInstanceProfile")(__v.asInstanceOf[js.Any]))
      InstanceMonitoring.foreach(__v => __obj.updateDynamic("InstanceMonitoring")(__v.asInstanceOf[js.Any]))
      KernelId.foreach(__v => __obj.updateDynamic("KernelId")(__v.asInstanceOf[js.Any]))
      KeyName.foreach(__v => __obj.updateDynamic("KeyName")(__v.asInstanceOf[js.Any]))
      LaunchConfigurationARN.foreach(__v => __obj.updateDynamic("LaunchConfigurationARN")(__v.asInstanceOf[js.Any]))
      MetadataOptions.foreach(__v => __obj.updateDynamic("MetadataOptions")(__v.asInstanceOf[js.Any]))
      PlacementTenancy.foreach(__v => __obj.updateDynamic("PlacementTenancy")(__v.asInstanceOf[js.Any]))
      RamdiskId.foreach(__v => __obj.updateDynamic("RamdiskId")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SpotPrice.foreach(__v => __obj.updateDynamic("SpotPrice")(__v.asInstanceOf[js.Any]))
      UserData.foreach(__v => __obj.updateDynamic("UserData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfiguration]
    }
  }

  @js.native
  trait LaunchConfigurationNameType extends js.Object {
    var LaunchConfigurationName: XmlStringMaxLen255
  }

  object LaunchConfigurationNameType {
    @inline
    def apply(
        LaunchConfigurationName: XmlStringMaxLen255
    ): LaunchConfigurationNameType = {
      val __obj = js.Dynamic.literal(
        "LaunchConfigurationName" -> LaunchConfigurationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LaunchConfigurationNameType]
    }
  }

  @js.native
  trait LaunchConfigurationNamesType extends js.Object {
    var LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object LaunchConfigurationNamesType {
    @inline
    def apply(
        LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): LaunchConfigurationNamesType = {
      val __obj = js.Dynamic.literal()
      LaunchConfigurationNames.foreach(__v => __obj.updateDynamic("LaunchConfigurationNames")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfigurationNamesType]
    }
  }

  @js.native
  trait LaunchConfigurationsType extends js.Object {
    var LaunchConfigurations: LaunchConfigurations
    var NextToken: js.UndefOr[XmlString]
  }

  object LaunchConfigurationsType {
    @inline
    def apply(
        LaunchConfigurations: LaunchConfigurations,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): LaunchConfigurationsType = {
      val __obj = js.Dynamic.literal(
        "LaunchConfigurations" -> LaunchConfigurations.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfigurationsType]
    }
  }

  /** Use this structure to specify the launch templates and instance types (overrides) for a mixed instances policy.
    */
  @js.native
  trait LaunchTemplate extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification]
    var Overrides: js.UndefOr[Overrides]
  }

  object LaunchTemplate {
    @inline
    def apply(
        LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        Overrides: js.UndefOr[Overrides] = js.undefined
    ): LaunchTemplate = {
      val __obj = js.Dynamic.literal()
      LaunchTemplateSpecification.foreach(__v => __obj.updateDynamic("LaunchTemplateSpecification")(__v.asInstanceOf[js.Any]))
      Overrides.foreach(__v => __obj.updateDynamic("Overrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplate]
    }
  }

  /** Use this structure to let Amazon EC2 Auto Scaling do the following when the Auto Scaling group has a mixed instances policy: * Override the instance type that is specified in the launch template. * Use multiple instance types. Specify the instance types that you want, or define your instance requirements instead and let Amazon EC2 Auto Scaling provision the available instance types that meet your requirements. This can provide Amazon EC2 Auto Scaling with a larger selection of instance types to choose from when fulfilling Spot and On-Demand capacities. You can view which instance types are matched before you apply the instance requirements to your Auto Scaling group. After you define your instance requirements, you don't have to keep updating these settings to get new EC2 instance types automatically. Amazon EC2 Auto Scaling uses the instance requirements of the Auto Scaling group to determine whether a new EC2 instance type can be used.
    */
  @js.native
  trait LaunchTemplateOverrides extends js.Object {
    var InstanceRequirements: js.UndefOr[InstanceRequirements]
    var InstanceType: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification]
    var WeightedCapacity: js.UndefOr[XmlStringMaxLen32]
  }

  object LaunchTemplateOverrides {
    @inline
    def apply(
        InstanceRequirements: js.UndefOr[InstanceRequirements] = js.undefined,
        InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        WeightedCapacity: js.UndefOr[XmlStringMaxLen32] = js.undefined
    ): LaunchTemplateOverrides = {
      val __obj = js.Dynamic.literal()
      InstanceRequirements.foreach(__v => __obj.updateDynamic("InstanceRequirements")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LaunchTemplateSpecification.foreach(__v => __obj.updateDynamic("LaunchTemplateSpecification")(__v.asInstanceOf[js.Any]))
      WeightedCapacity.foreach(__v => __obj.updateDynamic("WeightedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplateOverrides]
    }
  }

  /** Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to launch Amazon EC2 instances. For more information about launch templates, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchTemplates.html|Launch templates]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait LaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Version: js.UndefOr[XmlStringMaxLen255]
  }

  object LaunchTemplateSpecification {
    @inline
    def apply(
        LaunchTemplateId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
        Version: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LaunchTemplateSpecification = {
      val __obj = js.Dynamic.literal()
      LaunchTemplateId.foreach(__v => __obj.updateDynamic("LaunchTemplateId")(__v.asInstanceOf[js.Any]))
      LaunchTemplateName.foreach(__v => __obj.updateDynamic("LaunchTemplateName")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplateSpecification]
    }
  }

  /** Describes a lifecycle hook. A lifecycle hook lets you create solutions that are aware of events in the Auto Scaling instance lifecycle, and then perform a custom action on instances when the corresponding lifecycle event occurs.
    */
  @js.native
  trait LifecycleHook extends js.Object {
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var DefaultResult: js.UndefOr[LifecycleActionResult]
    var GlobalTimeout: js.UndefOr[GlobalTimeout]
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout]
    var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255]
    var LifecycleTransition: js.UndefOr[LifecycleTransition]
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023]
    var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName]
    var RoleARN: js.UndefOr[XmlStringMaxLen255]
  }

  object LifecycleHook {
    @inline
    def apply(
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined,
        GlobalTimeout: js.UndefOr[GlobalTimeout] = js.undefined,
        HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
        LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined,
        LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined,
        NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
        NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined,
        RoleARN: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LifecycleHook = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      DefaultResult.foreach(__v => __obj.updateDynamic("DefaultResult")(__v.asInstanceOf[js.Any]))
      GlobalTimeout.foreach(__v => __obj.updateDynamic("GlobalTimeout")(__v.asInstanceOf[js.Any]))
      HeartbeatTimeout.foreach(__v => __obj.updateDynamic("HeartbeatTimeout")(__v.asInstanceOf[js.Any]))
      LifecycleHookName.foreach(__v => __obj.updateDynamic("LifecycleHookName")(__v.asInstanceOf[js.Any]))
      LifecycleTransition.foreach(__v => __obj.updateDynamic("LifecycleTransition")(__v.asInstanceOf[js.Any]))
      NotificationMetadata.foreach(__v => __obj.updateDynamic("NotificationMetadata")(__v.asInstanceOf[js.Any]))
      NotificationTargetARN.foreach(__v => __obj.updateDynamic("NotificationTargetARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleHook]
    }
  }

  /** Describes information used to specify a lifecycle hook for an Auto Scaling group. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html|Amazon EC2 Auto Scaling lifecycle hooks]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait LifecycleHookSpecification extends js.Object {
    var LifecycleHookName: AsciiStringMaxLen255
    var LifecycleTransition: LifecycleTransition
    var DefaultResult: js.UndefOr[LifecycleActionResult]
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout]
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023]
    var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName]
    var RoleARN: js.UndefOr[XmlStringMaxLen255]
  }

  object LifecycleHookSpecification {
    @inline
    def apply(
        LifecycleHookName: AsciiStringMaxLen255,
        LifecycleTransition: LifecycleTransition,
        DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined,
        HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
        NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
        NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined,
        RoleARN: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LifecycleHookSpecification = {
      val __obj = js.Dynamic.literal(
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any],
        "LifecycleTransition" -> LifecycleTransition.asInstanceOf[js.Any]
      )

      DefaultResult.foreach(__v => __obj.updateDynamic("DefaultResult")(__v.asInstanceOf[js.Any]))
      HeartbeatTimeout.foreach(__v => __obj.updateDynamic("HeartbeatTimeout")(__v.asInstanceOf[js.Any]))
      NotificationMetadata.foreach(__v => __obj.updateDynamic("NotificationMetadata")(__v.asInstanceOf[js.Any]))
      NotificationTargetARN.foreach(__v => __obj.updateDynamic("NotificationTargetARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleHookSpecification]
    }
  }

  /** Describes the state of a Classic Load Balancer.
    */
  @js.native
  trait LoadBalancerState extends js.Object {
    var LoadBalancerName: js.UndefOr[XmlStringMaxLen255]
    var State: js.UndefOr[XmlStringMaxLen255]
  }

  object LoadBalancerState {
    @inline
    def apply(
        LoadBalancerName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        State: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LoadBalancerState = {
      val __obj = js.Dynamic.literal()
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerState]
    }
  }

  /** Describes the state of a target group.
    */
  @js.native
  trait LoadBalancerTargetGroupState extends js.Object {
    var LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511]
    var State: js.UndefOr[XmlStringMaxLen255]
  }

  object LoadBalancerTargetGroupState {
    @inline
    def apply(
        LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511] = js.undefined,
        State: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LoadBalancerTargetGroupState = {
      val __obj = js.Dynamic.literal()
      LoadBalancerTargetGroupARN.foreach(__v => __obj.updateDynamic("LoadBalancerTargetGroupARN")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerTargetGroupState]
    }
  }

  /** A <code>GetPredictiveScalingForecast</code> call returns the load forecast for a predictive scaling policy. This structure includes the data points for that load forecast, along with the timestamps of those data points and the metric specification.
    */
  @js.native
  trait LoadForecast extends js.Object {
    var MetricSpecification: PredictiveScalingMetricSpecification
    var Timestamps: PredictiveScalingForecastTimestamps
    var Values: PredictiveScalingForecastValues
  }

  object LoadForecast {
    @inline
    def apply(
        MetricSpecification: PredictiveScalingMetricSpecification,
        Timestamps: PredictiveScalingForecastTimestamps,
        Values: PredictiveScalingForecastValues
    ): LoadForecast = {
      val __obj = js.Dynamic.literal(
        "MetricSpecification" -> MetricSpecification.asInstanceOf[js.Any],
        "Timestamps" -> Timestamps.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LoadForecast]
    }
  }

  /** Specifies the minimum and maximum for the <code>MemoryGiBPerVCpu</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    */
  @js.native
  trait MemoryGiBPerVCpuRequest extends js.Object {
    var Max: js.UndefOr[NullablePositiveDouble]
    var Min: js.UndefOr[NullablePositiveDouble]
  }

  object MemoryGiBPerVCpuRequest {
    @inline
    def apply(
        Max: js.UndefOr[NullablePositiveDouble] = js.undefined,
        Min: js.UndefOr[NullablePositiveDouble] = js.undefined
    ): MemoryGiBPerVCpuRequest = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemoryGiBPerVCpuRequest]
    }
  }

  /** Specifies the minimum and maximum for the <code>MemoryMiB</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    */
  @js.native
  trait MemoryMiBRequest extends js.Object {
    var Min: NullablePositiveInteger
    var Max: js.UndefOr[NullablePositiveInteger]
  }

  object MemoryMiBRequest {
    @inline
    def apply(
        Min: NullablePositiveInteger,
        Max: js.UndefOr[NullablePositiveInteger] = js.undefined
    ): MemoryMiBRequest = {
      val __obj = js.Dynamic.literal(
        "Min" -> Min.asInstanceOf[js.Any]
      )

      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemoryMiBRequest]
    }
  }

  /** Represents a specific metric.
    */
  @js.native
  trait Metric extends js.Object {
    var MetricName: MetricName
    var Namespace: MetricNamespace
    var Dimensions: js.UndefOr[MetricDimensions]
  }

  object Metric {
    @inline
    def apply(
        MetricName: MetricName,
        Namespace: MetricNamespace,
        Dimensions: js.UndefOr[MetricDimensions] = js.undefined
    ): Metric = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metric]
    }
  }

  /** Describes a metric.
    */
  @js.native
  trait MetricCollectionType extends js.Object {
    var Metric: js.UndefOr[XmlStringMaxLen255]
  }

  object MetricCollectionType {
    @inline
    def apply(
        Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): MetricCollectionType = {
      val __obj = js.Dynamic.literal()
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricCollectionType]
    }
  }

  /** The metric data to return. Also defines whether this call is returning data for one metric only, or whether it is performing a math expression on the values of returned metric statistics to create a new time series. A time series is a series of data points, each of which is associated with a timestamp. For more information and examples, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/predictive-scaling-customized-metric-specification.html|Advanced predictive scaling policy configurations using custom metrics]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait MetricDataQuery extends js.Object {
    var Id: XmlStringMaxLen255
    var Expression: js.UndefOr[XmlStringMaxLen1023]
    var Label: js.UndefOr[XmlStringMetricLabel]
    var MetricStat: js.UndefOr[MetricStat]
    var ReturnData: js.UndefOr[ReturnData]
  }

  object MetricDataQuery {
    @inline
    def apply(
        Id: XmlStringMaxLen255,
        Expression: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
        Label: js.UndefOr[XmlStringMetricLabel] = js.undefined,
        MetricStat: js.UndefOr[MetricStat] = js.undefined,
        ReturnData: js.UndefOr[ReturnData] = js.undefined
    ): MetricDataQuery = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      MetricStat.foreach(__v => __obj.updateDynamic("MetricStat")(__v.asInstanceOf[js.Any]))
      ReturnData.foreach(__v => __obj.updateDynamic("ReturnData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDataQuery]
    }
  }

  /** Describes the dimension of a metric.
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

  /** Describes a granularity of a metric.
    */
  @js.native
  trait MetricGranularityType extends js.Object {
    var Granularity: js.UndefOr[XmlStringMaxLen255]
  }

  object MetricGranularityType {
    @inline
    def apply(
        Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): MetricGranularityType = {
      val __obj = js.Dynamic.literal()
      Granularity.foreach(__v => __obj.updateDynamic("Granularity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricGranularityType]
    }
  }

  /** This structure defines the CloudWatch metric to return, along with the statistic, period, and unit. For more information about the CloudWatch terminology below, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch concepts]] in the <i>Amazon CloudWatch User Guide</i>.
    */
  @js.native
  trait MetricStat extends js.Object {
    var Metric: Metric
    var Stat: XmlStringMetricStat
    var Unit: js.UndefOr[MetricUnit]
  }

  object MetricStat {
    @inline
    def apply(
        Metric: Metric,
        Stat: XmlStringMetricStat,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): MetricStat = {
      val __obj = js.Dynamic.literal(
        "Metric" -> Metric.asInstanceOf[js.Any],
        "Stat" -> Stat.asInstanceOf[js.Any]
      )

      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricStat]
    }
  }

  /** Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a single Auto Scaling group. A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and help optimize your costs. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html|Auto Scaling groups with multiple instance types and purchase options]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait MixedInstancesPolicy extends js.Object {
    var InstancesDistribution: js.UndefOr[InstancesDistribution]
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  object MixedInstancesPolicy {
    @inline
    def apply(
        InstancesDistribution: js.UndefOr[InstancesDistribution] = js.undefined,
        LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined
    ): MixedInstancesPolicy = {
      val __obj = js.Dynamic.literal()
      InstancesDistribution.foreach(__v => __obj.updateDynamic("InstancesDistribution")(__v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MixedInstancesPolicy]
    }
  }

  /** Specifies the minimum and maximum for the <code>NetworkBandwidthGbps</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    *
    * '''Note:'''Setting the minimum bandwidth does not guarantee that your instance will achieve the minimum bandwidth. Amazon EC2 will identify instance types that support the specified minimum bandwidth, but the actual bandwidth of your instance might go below the specified minimum at times. For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html#available-instance-bandwidth|Available instance bandwidth]] in the <i>Amazon EC2 User Guide for Linux Instances</i>.
    */
  @js.native
  trait NetworkBandwidthGbpsRequest extends js.Object {
    var Max: js.UndefOr[NullablePositiveDouble]
    var Min: js.UndefOr[NullablePositiveDouble]
  }

  object NetworkBandwidthGbpsRequest {
    @inline
    def apply(
        Max: js.UndefOr[NullablePositiveDouble] = js.undefined,
        Min: js.UndefOr[NullablePositiveDouble] = js.undefined
    ): NetworkBandwidthGbpsRequest = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkBandwidthGbpsRequest]
    }
  }

  /** Specifies the minimum and maximum for the <code>NetworkInterfaceCount</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    */
  @js.native
  trait NetworkInterfaceCountRequest extends js.Object {
    var Max: js.UndefOr[NullablePositiveInteger]
    var Min: js.UndefOr[NullablePositiveInteger]
  }

  object NetworkInterfaceCountRequest {
    @inline
    def apply(
        Max: js.UndefOr[NullablePositiveInteger] = js.undefined,
        Min: js.UndefOr[NullablePositiveInteger] = js.undefined
    ): NetworkInterfaceCountRequest = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterfaceCountRequest]
    }
  }

  /** Describes a notification.
    */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var NotificationType: js.UndefOr[XmlStringMaxLen255]
    var TopicARN: js.UndefOr[XmlStringMaxLen255]
  }

  object NotificationConfiguration {
    @inline
    def apply(
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        NotificationType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        TopicARN: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): NotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      NotificationType.foreach(__v => __obj.updateDynamic("NotificationType")(__v.asInstanceOf[js.Any]))
      TopicARN.foreach(__v => __obj.updateDynamic("TopicARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfiguration]
    }
  }

  @js.native
  trait PoliciesType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingPolicies: js.UndefOr[ScalingPolicies]
  }

  object PoliciesType {
    @inline
    def apply(
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined
    ): PoliciesType = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScalingPolicies.foreach(__v => __obj.updateDynamic("ScalingPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PoliciesType]
    }
  }

  /** Contains the output of PutScalingPolicy.
    */
  @js.native
  trait PolicyARNType extends js.Object {
    var Alarms: js.UndefOr[Alarms]
    var PolicyARN: js.UndefOr[ResourceName]
  }

  object PolicyARNType {
    @inline
    def apply(
        Alarms: js.UndefOr[Alarms] = js.undefined,
        PolicyARN: js.UndefOr[ResourceName] = js.undefined
    ): PolicyARNType = {
      val __obj = js.Dynamic.literal()
      Alarms.foreach(__v => __obj.updateDynamic("Alarms")(__v.asInstanceOf[js.Any]))
      PolicyARN.foreach(__v => __obj.updateDynamic("PolicyARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyARNType]
    }
  }

  /** Represents a predefined metric for a target tracking scaling policy to use with Amazon EC2 Auto Scaling.
    */
  @js.native
  trait PredefinedMetricSpecification extends js.Object {
    var PredefinedMetricType: MetricType
    var ResourceLabel: js.UndefOr[XmlStringMaxLen1023]
  }

  object PredefinedMetricSpecification {
    @inline
    def apply(
        PredefinedMetricType: MetricType,
        ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    ): PredefinedMetricSpecification = {
      val __obj = js.Dynamic.literal(
        "PredefinedMetricType" -> PredefinedMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.updateDynamic("ResourceLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredefinedMetricSpecification]
    }
  }

  /** Represents a predictive scaling policy configuration to use with Amazon EC2 Auto Scaling.
    */
  @js.native
  trait PredictiveScalingConfiguration extends js.Object {
    var MetricSpecifications: PredictiveScalingMetricSpecifications
    var MaxCapacityBreachBehavior: js.UndefOr[PredictiveScalingMaxCapacityBreachBehavior]
    var MaxCapacityBuffer: js.UndefOr[PredictiveScalingMaxCapacityBuffer]
    var Mode: js.UndefOr[PredictiveScalingMode]
    var SchedulingBufferTime: js.UndefOr[PredictiveScalingSchedulingBufferTime]
  }

  object PredictiveScalingConfiguration {
    @inline
    def apply(
        MetricSpecifications: PredictiveScalingMetricSpecifications,
        MaxCapacityBreachBehavior: js.UndefOr[PredictiveScalingMaxCapacityBreachBehavior] = js.undefined,
        MaxCapacityBuffer: js.UndefOr[PredictiveScalingMaxCapacityBuffer] = js.undefined,
        Mode: js.UndefOr[PredictiveScalingMode] = js.undefined,
        SchedulingBufferTime: js.UndefOr[PredictiveScalingSchedulingBufferTime] = js.undefined
    ): PredictiveScalingConfiguration = {
      val __obj = js.Dynamic.literal(
        "MetricSpecifications" -> MetricSpecifications.asInstanceOf[js.Any]
      )

      MaxCapacityBreachBehavior.foreach(__v => __obj.updateDynamic("MaxCapacityBreachBehavior")(__v.asInstanceOf[js.Any]))
      MaxCapacityBuffer.foreach(__v => __obj.updateDynamic("MaxCapacityBuffer")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      SchedulingBufferTime.foreach(__v => __obj.updateDynamic("SchedulingBufferTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictiveScalingConfiguration]
    }
  }

  /** Describes a customized capacity metric for a predictive scaling policy.
    */
  @js.native
  trait PredictiveScalingCustomizedCapacityMetric extends js.Object {
    var MetricDataQueries: MetricDataQueries
  }

  object PredictiveScalingCustomizedCapacityMetric {
    @inline
    def apply(
        MetricDataQueries: MetricDataQueries
    ): PredictiveScalingCustomizedCapacityMetric = {
      val __obj = js.Dynamic.literal(
        "MetricDataQueries" -> MetricDataQueries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PredictiveScalingCustomizedCapacityMetric]
    }
  }

  /** Describes a custom load metric for a predictive scaling policy.
    */
  @js.native
  trait PredictiveScalingCustomizedLoadMetric extends js.Object {
    var MetricDataQueries: MetricDataQueries
  }

  object PredictiveScalingCustomizedLoadMetric {
    @inline
    def apply(
        MetricDataQueries: MetricDataQueries
    ): PredictiveScalingCustomizedLoadMetric = {
      val __obj = js.Dynamic.literal(
        "MetricDataQueries" -> MetricDataQueries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PredictiveScalingCustomizedLoadMetric]
    }
  }

  /** Describes a custom scaling metric for a predictive scaling policy.
    */
  @js.native
  trait PredictiveScalingCustomizedScalingMetric extends js.Object {
    var MetricDataQueries: MetricDataQueries
  }

  object PredictiveScalingCustomizedScalingMetric {
    @inline
    def apply(
        MetricDataQueries: MetricDataQueries
    ): PredictiveScalingCustomizedScalingMetric = {
      val __obj = js.Dynamic.literal(
        "MetricDataQueries" -> MetricDataQueries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PredictiveScalingCustomizedScalingMetric]
    }
  }

  /** This structure specifies the metrics and target utilization settings for a predictive scaling policy. You must specify either a metric pair, or a load metric and a scaling metric individually. Specifying a metric pair instead of individual metrics provides a simpler way to configure metrics for a scaling policy. You choose the metric pair, and the policy automatically knows the correct sum and average statistics to use for the load metric and the scaling metric. Example * You create a predictive scaling policy and specify <code>ALBRequestCount</code> as the value for the metric pair and <code>1000.0</code> as the target value. For this type of metric, you must provide the metric dimension for the corresponding target group, so you also provide a resource label for the Application Load Balancer target group that is attached to your Auto Scaling group. * The number of requests the target group receives per minute provides the load metric, and the request count averaged between the
    * members of the target group provides the scaling metric. In CloudWatch, this refers to the <code>RequestCount</code> and <code>RequestCountPerTarget</code> metrics, respectively. * For optimal use of predictive scaling, you adhere to the best practice of using a dynamic scaling policy to automatically scale between the minimum capacity and maximum capacity in response to real-time changes in resource utilization. * Amazon EC2 Auto Scaling consumes data points for the load metric over the last 14 days and creates an hourly load forecast for predictive scaling. (A minimum of 24 hours of data is required.) * After creating the load forecast, Amazon EC2 Auto Scaling determines when to reduce or increase the capacity of your Auto Scaling group in each hour of the forecast period so that the average number of requests received by each instance is as close to 1000 requests per minute as possible at all times. For information about using custom metrics with predictive scaling, see
    * [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/predictive-scaling-customized-metric-specification.html|Advanced predictive scaling policy configurations using custom metrics]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait PredictiveScalingMetricSpecification extends js.Object {
    var TargetValue: MetricScale
    var CustomizedCapacityMetricSpecification: js.UndefOr[PredictiveScalingCustomizedCapacityMetric]
    var CustomizedLoadMetricSpecification: js.UndefOr[PredictiveScalingCustomizedLoadMetric]
    var CustomizedScalingMetricSpecification: js.UndefOr[PredictiveScalingCustomizedScalingMetric]
    var PredefinedLoadMetricSpecification: js.UndefOr[PredictiveScalingPredefinedLoadMetric]
    var PredefinedMetricPairSpecification: js.UndefOr[PredictiveScalingPredefinedMetricPair]
    var PredefinedScalingMetricSpecification: js.UndefOr[PredictiveScalingPredefinedScalingMetric]
  }

  object PredictiveScalingMetricSpecification {
    @inline
    def apply(
        TargetValue: MetricScale,
        CustomizedCapacityMetricSpecification: js.UndefOr[PredictiveScalingCustomizedCapacityMetric] = js.undefined,
        CustomizedLoadMetricSpecification: js.UndefOr[PredictiveScalingCustomizedLoadMetric] = js.undefined,
        CustomizedScalingMetricSpecification: js.UndefOr[PredictiveScalingCustomizedScalingMetric] = js.undefined,
        PredefinedLoadMetricSpecification: js.UndefOr[PredictiveScalingPredefinedLoadMetric] = js.undefined,
        PredefinedMetricPairSpecification: js.UndefOr[PredictiveScalingPredefinedMetricPair] = js.undefined,
        PredefinedScalingMetricSpecification: js.UndefOr[PredictiveScalingPredefinedScalingMetric] = js.undefined
    ): PredictiveScalingMetricSpecification = {
      val __obj = js.Dynamic.literal(
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      )

      CustomizedCapacityMetricSpecification.foreach(__v => __obj.updateDynamic("CustomizedCapacityMetricSpecification")(__v.asInstanceOf[js.Any]))
      CustomizedLoadMetricSpecification.foreach(__v => __obj.updateDynamic("CustomizedLoadMetricSpecification")(__v.asInstanceOf[js.Any]))
      CustomizedScalingMetricSpecification.foreach(__v => __obj.updateDynamic("CustomizedScalingMetricSpecification")(__v.asInstanceOf[js.Any]))
      PredefinedLoadMetricSpecification.foreach(__v => __obj.updateDynamic("PredefinedLoadMetricSpecification")(__v.asInstanceOf[js.Any]))
      PredefinedMetricPairSpecification.foreach(__v => __obj.updateDynamic("PredefinedMetricPairSpecification")(__v.asInstanceOf[js.Any]))
      PredefinedScalingMetricSpecification.foreach(__v => __obj.updateDynamic("PredefinedScalingMetricSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictiveScalingMetricSpecification]
    }
  }

  /** Describes a load metric for a predictive scaling policy. When returned in the output of <code>DescribePolicies</code>, it indicates that a predictive scaling policy uses individually specified load and scaling metrics instead of a metric pair.
    */
  @js.native
  trait PredictiveScalingPredefinedLoadMetric extends js.Object {
    var PredefinedMetricType: PredefinedLoadMetricType
    var ResourceLabel: js.UndefOr[XmlStringMaxLen1023]
  }

  object PredictiveScalingPredefinedLoadMetric {
    @inline
    def apply(
        PredefinedMetricType: PredefinedLoadMetricType,
        ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    ): PredictiveScalingPredefinedLoadMetric = {
      val __obj = js.Dynamic.literal(
        "PredefinedMetricType" -> PredefinedMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.updateDynamic("ResourceLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictiveScalingPredefinedLoadMetric]
    }
  }

  /** Represents a metric pair for a predictive scaling policy.
    */
  @js.native
  trait PredictiveScalingPredefinedMetricPair extends js.Object {
    var PredefinedMetricType: PredefinedMetricPairType
    var ResourceLabel: js.UndefOr[XmlStringMaxLen1023]
  }

  object PredictiveScalingPredefinedMetricPair {
    @inline
    def apply(
        PredefinedMetricType: PredefinedMetricPairType,
        ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    ): PredictiveScalingPredefinedMetricPair = {
      val __obj = js.Dynamic.literal(
        "PredefinedMetricType" -> PredefinedMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.updateDynamic("ResourceLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictiveScalingPredefinedMetricPair]
    }
  }

  /** Describes a scaling metric for a predictive scaling policy. When returned in the output of <code>DescribePolicies</code>, it indicates that a predictive scaling policy uses individually specified load and scaling metrics instead of a metric pair.
    */
  @js.native
  trait PredictiveScalingPredefinedScalingMetric extends js.Object {
    var PredefinedMetricType: PredefinedScalingMetricType
    var ResourceLabel: js.UndefOr[XmlStringMaxLen1023]
  }

  object PredictiveScalingPredefinedScalingMetric {
    @inline
    def apply(
        PredefinedMetricType: PredefinedScalingMetricType,
        ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    ): PredictiveScalingPredefinedScalingMetric = {
      val __obj = js.Dynamic.literal(
        "PredefinedMetricType" -> PredefinedMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.updateDynamic("ResourceLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictiveScalingPredefinedScalingMetric]
    }
  }

  /** Describes a process type. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html#process-types|Scaling processes]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait ProcessType extends js.Object {
    var ProcessName: XmlStringMaxLen255
  }

  object ProcessType {
    @inline
    def apply(
        ProcessName: XmlStringMaxLen255
    ): ProcessType = {
      val __obj = js.Dynamic.literal(
        "ProcessName" -> ProcessName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProcessType]
    }
  }

  @js.native
  trait ProcessesType extends js.Object {
    var Processes: js.UndefOr[Processes]
  }

  object ProcessesType {
    @inline
    def apply(
        Processes: js.UndefOr[Processes] = js.undefined
    ): ProcessesType = {
      val __obj = js.Dynamic.literal()
      Processes.foreach(__v => __obj.updateDynamic("Processes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessesType]
    }
  }

  @js.native
  trait PutLifecycleHookAnswer extends js.Object

  object PutLifecycleHookAnswer {
    @inline
    def apply(): PutLifecycleHookAnswer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutLifecycleHookAnswer]
    }
  }

  @js.native
  trait PutLifecycleHookType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var LifecycleHookName: AsciiStringMaxLen255
    var DefaultResult: js.UndefOr[LifecycleActionResult]
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout]
    var LifecycleTransition: js.UndefOr[LifecycleTransition]
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023]
    var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName]
    var RoleARN: js.UndefOr[XmlStringMaxLen255]
  }

  object PutLifecycleHookType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        LifecycleHookName: AsciiStringMaxLen255,
        DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined,
        HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
        LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined,
        NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
        NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined,
        RoleARN: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): PutLifecycleHookType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any]
      )

      DefaultResult.foreach(__v => __obj.updateDynamic("DefaultResult")(__v.asInstanceOf[js.Any]))
      HeartbeatTimeout.foreach(__v => __obj.updateDynamic("HeartbeatTimeout")(__v.asInstanceOf[js.Any]))
      LifecycleTransition.foreach(__v => __obj.updateDynamic("LifecycleTransition")(__v.asInstanceOf[js.Any]))
      NotificationMetadata.foreach(__v => __obj.updateDynamic("NotificationMetadata")(__v.asInstanceOf[js.Any]))
      NotificationTargetARN.foreach(__v => __obj.updateDynamic("NotificationTargetARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLifecycleHookType]
    }
  }

  @js.native
  trait PutNotificationConfigurationType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var NotificationTypes: AutoScalingNotificationTypes
    var TopicARN: XmlStringMaxLen255
  }

  object PutNotificationConfigurationType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        NotificationTypes: AutoScalingNotificationTypes,
        TopicARN: XmlStringMaxLen255
    ): PutNotificationConfigurationType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "NotificationTypes" -> NotificationTypes.asInstanceOf[js.Any],
        "TopicARN" -> TopicARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutNotificationConfigurationType]
    }
  }

  @js.native
  trait PutScalingPolicyType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var PolicyName: XmlStringMaxLen255
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
    var Cooldown: js.UndefOr[Cooldown]
    var Enabled: js.UndefOr[ScalingPolicyEnabled]
    var EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup]
    var MetricAggregationType: js.UndefOr[XmlStringMaxLen32]
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude]
    var MinAdjustmentStep: js.UndefOr[MinAdjustmentStep]
    var PolicyType: js.UndefOr[XmlStringMaxLen64]
    var PredictiveScalingConfiguration: js.UndefOr[PredictiveScalingConfiguration]
    var ScalingAdjustment: js.UndefOr[PolicyIncrement]
    var StepAdjustments: js.UndefOr[StepAdjustments]
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  object PutScalingPolicyType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        PolicyName: XmlStringMaxLen255,
        AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        Cooldown: js.UndefOr[Cooldown] = js.undefined,
        Enabled: js.UndefOr[ScalingPolicyEnabled] = js.undefined,
        EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined,
        MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
        MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
        MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined,
        PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined,
        PredictiveScalingConfiguration: js.UndefOr[PredictiveScalingConfiguration] = js.undefined,
        ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
        StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined,
        TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
    ): PutScalingPolicyType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      AdjustmentType.foreach(__v => __obj.updateDynamic("AdjustmentType")(__v.asInstanceOf[js.Any]))
      Cooldown.foreach(__v => __obj.updateDynamic("Cooldown")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EstimatedInstanceWarmup.foreach(__v => __obj.updateDynamic("EstimatedInstanceWarmup")(__v.asInstanceOf[js.Any]))
      MetricAggregationType.foreach(__v => __obj.updateDynamic("MetricAggregationType")(__v.asInstanceOf[js.Any]))
      MinAdjustmentMagnitude.foreach(__v => __obj.updateDynamic("MinAdjustmentMagnitude")(__v.asInstanceOf[js.Any]))
      MinAdjustmentStep.foreach(__v => __obj.updateDynamic("MinAdjustmentStep")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      PredictiveScalingConfiguration.foreach(__v => __obj.updateDynamic("PredictiveScalingConfiguration")(__v.asInstanceOf[js.Any]))
      ScalingAdjustment.foreach(__v => __obj.updateDynamic("ScalingAdjustment")(__v.asInstanceOf[js.Any]))
      StepAdjustments.foreach(__v => __obj.updateDynamic("StepAdjustments")(__v.asInstanceOf[js.Any]))
      TargetTrackingConfiguration.foreach(__v => __obj.updateDynamic("TargetTrackingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScalingPolicyType]
    }
  }

  @js.native
  trait PutScheduledUpdateGroupActionType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ScheduledActionName: XmlStringMaxLen255
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var EndTime: js.UndefOr[TimestampType]
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize]
    var MinSize: js.UndefOr[AutoScalingGroupMinSize]
    var Recurrence: js.UndefOr[XmlStringMaxLen255]
    var StartTime: js.UndefOr[TimestampType]
    var Time: js.UndefOr[TimestampType]
    var TimeZone: js.UndefOr[XmlStringMaxLen255]
  }

  object PutScheduledUpdateGroupActionType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ScheduledActionName: XmlStringMaxLen255,
        DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
        EndTime: js.UndefOr[TimestampType] = js.undefined,
        MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
        MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
        Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        StartTime: js.UndefOr[TimestampType] = js.undefined,
        Time: js.UndefOr[TimestampType] = js.undefined,
        TimeZone: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): PutScheduledUpdateGroupActionType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]
      )

      DesiredCapacity.foreach(__v => __obj.updateDynamic("DesiredCapacity")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.updateDynamic("MaxSize")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.updateDynamic("Recurrence")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.updateDynamic("Time")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScheduledUpdateGroupActionType]
    }
  }

  @js.native
  trait PutWarmPoolAnswer extends js.Object

  object PutWarmPoolAnswer {
    @inline
    def apply(): PutWarmPoolAnswer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutWarmPoolAnswer]
    }
  }

  @js.native
  trait PutWarmPoolType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var InstanceReusePolicy: js.UndefOr[InstanceReusePolicy]
    var MaxGroupPreparedCapacity: js.UndefOr[MaxGroupPreparedCapacity]
    var MinSize: js.UndefOr[WarmPoolMinSize]
    var PoolState: js.UndefOr[WarmPoolState]
  }

  object PutWarmPoolType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        InstanceReusePolicy: js.UndefOr[InstanceReusePolicy] = js.undefined,
        MaxGroupPreparedCapacity: js.UndefOr[MaxGroupPreparedCapacity] = js.undefined,
        MinSize: js.UndefOr[WarmPoolMinSize] = js.undefined,
        PoolState: js.UndefOr[WarmPoolState] = js.undefined
    ): PutWarmPoolType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      InstanceReusePolicy.foreach(__v => __obj.updateDynamic("InstanceReusePolicy")(__v.asInstanceOf[js.Any]))
      MaxGroupPreparedCapacity.foreach(__v => __obj.updateDynamic("MaxGroupPreparedCapacity")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      PoolState.foreach(__v => __obj.updateDynamic("PoolState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutWarmPoolType]
    }
  }

  @js.native
  trait RecordLifecycleActionHeartbeatAnswer extends js.Object

  object RecordLifecycleActionHeartbeatAnswer {
    @inline
    def apply(): RecordLifecycleActionHeartbeatAnswer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordLifecycleActionHeartbeatAnswer]
    }
  }

  @js.native
  trait RecordLifecycleActionHeartbeatType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleHookName: AsciiStringMaxLen255
    var InstanceId: js.UndefOr[XmlStringMaxLen19]
    var LifecycleActionToken: js.UndefOr[LifecycleActionToken]
  }

  object RecordLifecycleActionHeartbeatType {
    @inline
    def apply(
        AutoScalingGroupName: ResourceName,
        LifecycleHookName: AsciiStringMaxLen255,
        InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
        LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined
    ): RecordLifecycleActionHeartbeatType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any]
      )

      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      LifecycleActionToken.foreach(__v => __obj.updateDynamic("LifecycleActionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordLifecycleActionHeartbeatType]
    }
  }

  /** Describes the preferences for an instance refresh.
    */
  @js.native
  trait RefreshPreferences extends js.Object {
    var CheckpointDelay: js.UndefOr[CheckpointDelay]
    var CheckpointPercentages: js.UndefOr[CheckpointPercentages]
    var InstanceWarmup: js.UndefOr[RefreshInstanceWarmup]
    var MinHealthyPercentage: js.UndefOr[IntPercent]
    var SkipMatching: js.UndefOr[SkipMatching]
  }

  object RefreshPreferences {
    @inline
    def apply(
        CheckpointDelay: js.UndefOr[CheckpointDelay] = js.undefined,
        CheckpointPercentages: js.UndefOr[CheckpointPercentages] = js.undefined,
        InstanceWarmup: js.UndefOr[RefreshInstanceWarmup] = js.undefined,
        MinHealthyPercentage: js.UndefOr[IntPercent] = js.undefined,
        SkipMatching: js.UndefOr[SkipMatching] = js.undefined
    ): RefreshPreferences = {
      val __obj = js.Dynamic.literal()
      CheckpointDelay.foreach(__v => __obj.updateDynamic("CheckpointDelay")(__v.asInstanceOf[js.Any]))
      CheckpointPercentages.foreach(__v => __obj.updateDynamic("CheckpointPercentages")(__v.asInstanceOf[js.Any]))
      InstanceWarmup.foreach(__v => __obj.updateDynamic("InstanceWarmup")(__v.asInstanceOf[js.Any]))
      MinHealthyPercentage.foreach(__v => __obj.updateDynamic("MinHealthyPercentage")(__v.asInstanceOf[js.Any]))
      SkipMatching.foreach(__v => __obj.updateDynamic("SkipMatching")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RefreshPreferences]
    }
  }

  /** Describes a scaling policy.
    */
  @js.native
  trait ScalingPolicy extends js.Object {
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
    var Alarms: js.UndefOr[Alarms]
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var Cooldown: js.UndefOr[Cooldown]
    var Enabled: js.UndefOr[ScalingPolicyEnabled]
    var EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup]
    var MetricAggregationType: js.UndefOr[XmlStringMaxLen32]
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude]
    var MinAdjustmentStep: js.UndefOr[MinAdjustmentStep]
    var PolicyARN: js.UndefOr[ResourceName]
    var PolicyName: js.UndefOr[XmlStringMaxLen255]
    var PolicyType: js.UndefOr[XmlStringMaxLen64]
    var PredictiveScalingConfiguration: js.UndefOr[PredictiveScalingConfiguration]
    var ScalingAdjustment: js.UndefOr[PolicyIncrement]
    var StepAdjustments: js.UndefOr[StepAdjustments]
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  object ScalingPolicy {
    @inline
    def apply(
        AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        Alarms: js.UndefOr[Alarms] = js.undefined,
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        Cooldown: js.UndefOr[Cooldown] = js.undefined,
        Enabled: js.UndefOr[ScalingPolicyEnabled] = js.undefined,
        EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined,
        MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
        MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
        MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined,
        PolicyARN: js.UndefOr[ResourceName] = js.undefined,
        PolicyName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined,
        PredictiveScalingConfiguration: js.UndefOr[PredictiveScalingConfiguration] = js.undefined,
        ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
        StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined,
        TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
    ): ScalingPolicy = {
      val __obj = js.Dynamic.literal()
      AdjustmentType.foreach(__v => __obj.updateDynamic("AdjustmentType")(__v.asInstanceOf[js.Any]))
      Alarms.foreach(__v => __obj.updateDynamic("Alarms")(__v.asInstanceOf[js.Any]))
      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      Cooldown.foreach(__v => __obj.updateDynamic("Cooldown")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EstimatedInstanceWarmup.foreach(__v => __obj.updateDynamic("EstimatedInstanceWarmup")(__v.asInstanceOf[js.Any]))
      MetricAggregationType.foreach(__v => __obj.updateDynamic("MetricAggregationType")(__v.asInstanceOf[js.Any]))
      MinAdjustmentMagnitude.foreach(__v => __obj.updateDynamic("MinAdjustmentMagnitude")(__v.asInstanceOf[js.Any]))
      MinAdjustmentStep.foreach(__v => __obj.updateDynamic("MinAdjustmentStep")(__v.asInstanceOf[js.Any]))
      PolicyARN.foreach(__v => __obj.updateDynamic("PolicyARN")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      PredictiveScalingConfiguration.foreach(__v => __obj.updateDynamic("PredictiveScalingConfiguration")(__v.asInstanceOf[js.Any]))
      ScalingAdjustment.foreach(__v => __obj.updateDynamic("ScalingAdjustment")(__v.asInstanceOf[js.Any]))
      StepAdjustments.foreach(__v => __obj.updateDynamic("StepAdjustments")(__v.asInstanceOf[js.Any]))
      TargetTrackingConfiguration.foreach(__v => __obj.updateDynamic("TargetTrackingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPolicy]
    }
  }

  @js.native
  trait ScalingProcessQuery extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ScalingProcesses: js.UndefOr[ProcessNames]
  }

  object ScalingProcessQuery {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        ScalingProcesses: js.UndefOr[ProcessNames] = js.undefined
    ): ScalingProcessQuery = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      ScalingProcesses.foreach(__v => __obj.updateDynamic("ScalingProcesses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingProcessQuery]
    }
  }

  @js.native
  trait ScheduledActionsType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions]
  }

  object ScheduledActionsType {
    @inline
    def apply(
        NextToken: js.UndefOr[XmlString] = js.undefined,
        ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions] = js.undefined
    ): ScheduledActionsType = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScheduledUpdateGroupActions.foreach(__v => __obj.updateDynamic("ScheduledUpdateGroupActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledActionsType]
    }
  }

  /** Describes a scheduled scaling action.
    */
  @js.native
  trait ScheduledUpdateGroupAction extends js.Object {
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var EndTime: js.UndefOr[TimestampType]
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize]
    var MinSize: js.UndefOr[AutoScalingGroupMinSize]
    var Recurrence: js.UndefOr[XmlStringMaxLen255]
    var ScheduledActionARN: js.UndefOr[ResourceName]
    var ScheduledActionName: js.UndefOr[XmlStringMaxLen255]
    var StartTime: js.UndefOr[TimestampType]
    var Time: js.UndefOr[TimestampType]
    var TimeZone: js.UndefOr[XmlStringMaxLen255]
  }

  object ScheduledUpdateGroupAction {
    @inline
    def apply(
        AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
        EndTime: js.UndefOr[TimestampType] = js.undefined,
        MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
        MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
        Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        ScheduledActionARN: js.UndefOr[ResourceName] = js.undefined,
        ScheduledActionName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        StartTime: js.UndefOr[TimestampType] = js.undefined,
        Time: js.UndefOr[TimestampType] = js.undefined,
        TimeZone: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): ScheduledUpdateGroupAction = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupName.foreach(__v => __obj.updateDynamic("AutoScalingGroupName")(__v.asInstanceOf[js.Any]))
      DesiredCapacity.foreach(__v => __obj.updateDynamic("DesiredCapacity")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.updateDynamic("MaxSize")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.updateDynamic("Recurrence")(__v.asInstanceOf[js.Any]))
      ScheduledActionARN.foreach(__v => __obj.updateDynamic("ScheduledActionARN")(__v.asInstanceOf[js.Any]))
      ScheduledActionName.foreach(__v => __obj.updateDynamic("ScheduledActionName")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.updateDynamic("Time")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledUpdateGroupAction]
    }
  }

  /** Describes information used for one or more scheduled scaling action updates in a <a>BatchPutScheduledUpdateGroupAction</a> operation.
    */
  @js.native
  trait ScheduledUpdateGroupActionRequest extends js.Object {
    var ScheduledActionName: XmlStringMaxLen255
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var EndTime: js.UndefOr[TimestampType]
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize]
    var MinSize: js.UndefOr[AutoScalingGroupMinSize]
    var Recurrence: js.UndefOr[XmlStringMaxLen255]
    var StartTime: js.UndefOr[TimestampType]
    var TimeZone: js.UndefOr[XmlStringMaxLen255]
  }

  object ScheduledUpdateGroupActionRequest {
    @inline
    def apply(
        ScheduledActionName: XmlStringMaxLen255,
        DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
        EndTime: js.UndefOr[TimestampType] = js.undefined,
        MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
        MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
        Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        StartTime: js.UndefOr[TimestampType] = js.undefined,
        TimeZone: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): ScheduledUpdateGroupActionRequest = {
      val __obj = js.Dynamic.literal(
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]
      )

      DesiredCapacity.foreach(__v => __obj.updateDynamic("DesiredCapacity")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.updateDynamic("MaxSize")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.updateDynamic("Recurrence")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledUpdateGroupActionRequest]
    }
  }

  @js.native
  trait SetDesiredCapacityType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var HonorCooldown: js.UndefOr[HonorCooldown]
  }

  object SetDesiredCapacityType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        DesiredCapacity: AutoScalingGroupDesiredCapacity,
        HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined
    ): SetDesiredCapacityType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "DesiredCapacity" -> DesiredCapacity.asInstanceOf[js.Any]
      )

      HonorCooldown.foreach(__v => __obj.updateDynamic("HonorCooldown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetDesiredCapacityType]
    }
  }

  @js.native
  trait SetInstanceHealthQuery extends js.Object {
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen19
    var ShouldRespectGracePeriod: js.UndefOr[ShouldRespectGracePeriod]
  }

  object SetInstanceHealthQuery {
    @inline
    def apply(
        HealthStatus: XmlStringMaxLen32,
        InstanceId: XmlStringMaxLen19,
        ShouldRespectGracePeriod: js.UndefOr[ShouldRespectGracePeriod] = js.undefined
    ): SetInstanceHealthQuery = {
      val __obj = js.Dynamic.literal(
        "HealthStatus" -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      ShouldRespectGracePeriod.foreach(__v => __obj.updateDynamic("ShouldRespectGracePeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetInstanceHealthQuery]
    }
  }

  @js.native
  trait SetInstanceProtectionAnswer extends js.Object

  object SetInstanceProtectionAnswer {
    @inline
    def apply(): SetInstanceProtectionAnswer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetInstanceProtectionAnswer]
    }
  }

  @js.native
  trait SetInstanceProtectionQuery extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var InstanceIds: InstanceIds
    var ProtectedFromScaleIn: ProtectedFromScaleIn
  }

  object SetInstanceProtectionQuery {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        InstanceIds: InstanceIds,
        ProtectedFromScaleIn: ProtectedFromScaleIn
    ): SetInstanceProtectionQuery = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "InstanceIds" -> InstanceIds.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetInstanceProtectionQuery]
    }
  }

  @js.native
  trait StartInstanceRefreshAnswer extends js.Object {
    var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255]
  }

  object StartInstanceRefreshAnswer {
    @inline
    def apply(
        InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): StartInstanceRefreshAnswer = {
      val __obj = js.Dynamic.literal()
      InstanceRefreshId.foreach(__v => __obj.updateDynamic("InstanceRefreshId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartInstanceRefreshAnswer]
    }
  }

  @js.native
  trait StartInstanceRefreshType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var DesiredConfiguration: js.UndefOr[DesiredConfiguration]
    var Preferences: js.UndefOr[RefreshPreferences]
    var Strategy: js.UndefOr[RefreshStrategy]
  }

  object StartInstanceRefreshType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        DesiredConfiguration: js.UndefOr[DesiredConfiguration] = js.undefined,
        Preferences: js.UndefOr[RefreshPreferences] = js.undefined,
        Strategy: js.UndefOr[RefreshStrategy] = js.undefined
    ): StartInstanceRefreshType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      DesiredConfiguration.foreach(__v => __obj.updateDynamic("DesiredConfiguration")(__v.asInstanceOf[js.Any]))
      Preferences.foreach(__v => __obj.updateDynamic("Preferences")(__v.asInstanceOf[js.Any]))
      Strategy.foreach(__v => __obj.updateDynamic("Strategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartInstanceRefreshType]
    }
  }

  /** Describes information used to create a step adjustment for a step scaling policy. For the following examples, suppose that you have an alarm with a breach threshold of 50: * To trigger the adjustment when the metric is greater than or equal to 50 and less than 60, specify a lower bound of 0 and an upper bound of 10. * To trigger the adjustment when the metric is greater than 40 and less than or equal to 50, specify a lower bound of -10 and an upper bound of 0. There are a few rules for the step adjustments for your step policy: * The ranges of your step adjustments can't overlap or have a gap. * At most, one step adjustment can have a null lower bound. If one step adjustment has a negative lower bound, then there must be a step adjustment with a null lower bound. * At most, one step adjustment can have a null upper bound. If one step adjustment has a positive upper bound, then there must be a step adjustment with a null upper bound. * The upper and lower bound can't be null in
    * the same step adjustment. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-steps|Step adjustments]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait StepAdjustment extends js.Object {
    var ScalingAdjustment: PolicyIncrement
    var MetricIntervalLowerBound: js.UndefOr[MetricScale]
    var MetricIntervalUpperBound: js.UndefOr[MetricScale]
  }

  object StepAdjustment {
    @inline
    def apply(
        ScalingAdjustment: PolicyIncrement,
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

  /** Describes an auto scaling process that has been suspended. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html#process-types|Scaling processes]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait SuspendedProcess extends js.Object {
    var ProcessName: js.UndefOr[XmlStringMaxLen255]
    var SuspensionReason: js.UndefOr[XmlStringMaxLen255]
  }

  object SuspendedProcess {
    @inline
    def apply(
        ProcessName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): SuspendedProcess = {
      val __obj = js.Dynamic.literal()
      ProcessName.foreach(__v => __obj.updateDynamic("ProcessName")(__v.asInstanceOf[js.Any]))
      SuspensionReason.foreach(__v => __obj.updateDynamic("SuspensionReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuspendedProcess]
    }
  }

  /** Describes a tag for an Auto Scaling group.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var PropagateAtLaunch: js.UndefOr[PropagateAtLaunch]
    var ResourceId: js.UndefOr[XmlString]
    var ResourceType: js.UndefOr[XmlString]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined,
        ResourceId: js.UndefOr[XmlString] = js.undefined,
        ResourceType: js.UndefOr[XmlString] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      PropagateAtLaunch.foreach(__v => __obj.updateDynamic("PropagateAtLaunch")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /** Describes a tag for an Auto Scaling group.
    */
  @js.native
  trait TagDescription extends js.Object {
    var Key: js.UndefOr[TagKey]
    var PropagateAtLaunch: js.UndefOr[PropagateAtLaunch]
    var ResourceId: js.UndefOr[XmlString]
    var ResourceType: js.UndefOr[XmlString]
    var Value: js.UndefOr[TagValue]
  }

  object TagDescription {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined,
        ResourceId: js.UndefOr[XmlString] = js.undefined,
        ResourceType: js.UndefOr[XmlString] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): TagDescription = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      PropagateAtLaunch.foreach(__v => __obj.updateDynamic("PropagateAtLaunch")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagDescription]
    }
  }

  @js.native
  trait TagsType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var Tags: js.UndefOr[TagDescriptionList]
  }

  object TagsType {
    @inline
    def apply(
        NextToken: js.UndefOr[XmlString] = js.undefined,
        Tags: js.UndefOr[TagDescriptionList] = js.undefined
    ): TagsType = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagsType]
    }
  }

  /** Represents a target tracking scaling policy configuration to use with Amazon EC2 Auto Scaling.
    */
  @js.native
  trait TargetTrackingConfiguration extends js.Object {
    var TargetValue: MetricScale
    var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification]
    var DisableScaleIn: js.UndefOr[DisableScaleIn]
    var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification]
  }

  object TargetTrackingConfiguration {
    @inline
    def apply(
        TargetValue: MetricScale,
        CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification] = js.undefined,
        DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
        PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined
    ): TargetTrackingConfiguration = {
      val __obj = js.Dynamic.literal(
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      )

      CustomizedMetricSpecification.foreach(__v => __obj.updateDynamic("CustomizedMetricSpecification")(__v.asInstanceOf[js.Any]))
      DisableScaleIn.foreach(__v => __obj.updateDynamic("DisableScaleIn")(__v.asInstanceOf[js.Any]))
      PredefinedMetricSpecification.foreach(__v => __obj.updateDynamic("PredefinedMetricSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetTrackingConfiguration]
    }
  }

  /** The metric data to return. Also defines whether this call is returning data for one metric only, or whether it is performing a math expression on the values of returned metric statistics to create a new time series. A time series is a series of data points, each of which is associated with a timestamp.
    */
  @js.native
  trait TargetTrackingMetricDataQuery extends js.Object {
    var Id: XmlStringMaxLen255
    var Expression: js.UndefOr[XmlStringMaxLen2047]
    var Label: js.UndefOr[XmlStringMetricLabel]
    var MetricStat: js.UndefOr[TargetTrackingMetricStat]
    var ReturnData: js.UndefOr[ReturnData]
  }

  object TargetTrackingMetricDataQuery {
    @inline
    def apply(
        Id: XmlStringMaxLen255,
        Expression: js.UndefOr[XmlStringMaxLen2047] = js.undefined,
        Label: js.UndefOr[XmlStringMetricLabel] = js.undefined,
        MetricStat: js.UndefOr[TargetTrackingMetricStat] = js.undefined,
        ReturnData: js.UndefOr[ReturnData] = js.undefined
    ): TargetTrackingMetricDataQuery = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      MetricStat.foreach(__v => __obj.updateDynamic("MetricStat")(__v.asInstanceOf[js.Any]))
      ReturnData.foreach(__v => __obj.updateDynamic("ReturnData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetTrackingMetricDataQuery]
    }
  }

  /** This structure defines the CloudWatch metric to return, along with the statistic, period, and unit. For more information about the CloudWatch terminology below, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch concepts]] in the <i>Amazon CloudWatch User Guide</i>.
    */
  @js.native
  trait TargetTrackingMetricStat extends js.Object {
    var Metric: Metric
    var Stat: XmlStringMetricStat
    var Unit: js.UndefOr[MetricUnit]
  }

  object TargetTrackingMetricStat {
    @inline
    def apply(
        Metric: Metric,
        Stat: XmlStringMetricStat,
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): TargetTrackingMetricStat = {
      val __obj = js.Dynamic.literal(
        "Metric" -> Metric.asInstanceOf[js.Any],
        "Stat" -> Stat.asInstanceOf[js.Any]
      )

      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetTrackingMetricStat]
    }
  }

  @js.native
  trait TerminateInstanceInAutoScalingGroupType extends js.Object {
    var InstanceId: XmlStringMaxLen19
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }

  object TerminateInstanceInAutoScalingGroupType {
    @inline
    def apply(
        InstanceId: XmlStringMaxLen19,
        ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    ): TerminateInstanceInAutoScalingGroupType = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TerminateInstanceInAutoScalingGroupType]
    }
  }

  /** Specifies the minimum and maximum for the <code>TotalLocalStorageGB</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    */
  @js.native
  trait TotalLocalStorageGBRequest extends js.Object {
    var Max: js.UndefOr[NullablePositiveDouble]
    var Min: js.UndefOr[NullablePositiveDouble]
  }

  object TotalLocalStorageGBRequest {
    @inline
    def apply(
        Max: js.UndefOr[NullablePositiveDouble] = js.undefined,
        Min: js.UndefOr[NullablePositiveDouble] = js.undefined
    ): TotalLocalStorageGBRequest = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TotalLocalStorageGBRequest]
    }
  }

  /** Describes the identifier of a traffic source. Currently, you must specify an Amazon Resource Name (ARN) for an existing VPC Lattice target group.
    */
  @js.native
  trait TrafficSourceIdentifier extends js.Object {
    var Identifier: js.UndefOr[XmlStringMaxLen511]
  }

  object TrafficSourceIdentifier {
    @inline
    def apply(
        Identifier: js.UndefOr[XmlStringMaxLen511] = js.undefined
    ): TrafficSourceIdentifier = {
      val __obj = js.Dynamic.literal()
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrafficSourceIdentifier]
    }
  }

  /** Describes the state of a traffic source.
    */
  @js.native
  trait TrafficSourceState extends js.Object {
    var State: js.UndefOr[XmlStringMaxLen255]
    var TrafficSource: js.UndefOr[XmlStringMaxLen511]
  }

  object TrafficSourceState {
    @inline
    def apply(
        State: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        TrafficSource: js.UndefOr[XmlStringMaxLen511] = js.undefined
    ): TrafficSourceState = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TrafficSource.foreach(__v => __obj.updateDynamic("TrafficSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrafficSourceState]
    }
  }

  @js.native
  trait UpdateAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled]
    var Context: js.UndefOr[Context]
    var DefaultCooldown: js.UndefOr[Cooldown]
    var DefaultInstanceWarmup: js.UndefOr[DefaultInstanceWarmup]
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var DesiredCapacityType: js.UndefOr[XmlStringMaxLen255]
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod]
    var HealthCheckType: js.UndefOr[XmlStringMaxLen32]
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var MaxInstanceLifetime: js.UndefOr[MaxInstanceLifetime]
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize]
    var MinSize: js.UndefOr[AutoScalingGroupMinSize]
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy]
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected]
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255]
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName]
    var TerminationPolicies: js.UndefOr[TerminationPolicies]
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047]
  }

  object UpdateAutoScalingGroupType {
    @inline
    def apply(
        AutoScalingGroupName: XmlStringMaxLen255,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.undefined,
        Context: js.UndefOr[Context] = js.undefined,
        DefaultCooldown: js.UndefOr[Cooldown] = js.undefined,
        DefaultInstanceWarmup: js.UndefOr[DefaultInstanceWarmup] = js.undefined,
        DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
        DesiredCapacityType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
        HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
        LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        MaxInstanceLifetime: js.UndefOr[MaxInstanceLifetime] = js.undefined,
        MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
        MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
        MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined,
        NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined,
        PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined,
        TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
        VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
    ): UpdateAutoScalingGroupType = {
      val __obj = js.Dynamic.literal(
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      CapacityRebalance.foreach(__v => __obj.updateDynamic("CapacityRebalance")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      DefaultCooldown.foreach(__v => __obj.updateDynamic("DefaultCooldown")(__v.asInstanceOf[js.Any]))
      DefaultInstanceWarmup.foreach(__v => __obj.updateDynamic("DefaultInstanceWarmup")(__v.asInstanceOf[js.Any]))
      DesiredCapacity.foreach(__v => __obj.updateDynamic("DesiredCapacity")(__v.asInstanceOf[js.Any]))
      DesiredCapacityType.foreach(__v => __obj.updateDynamic("DesiredCapacityType")(__v.asInstanceOf[js.Any]))
      HealthCheckGracePeriod.foreach(__v => __obj.updateDynamic("HealthCheckGracePeriod")(__v.asInstanceOf[js.Any]))
      HealthCheckType.foreach(__v => __obj.updateDynamic("HealthCheckType")(__v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.updateDynamic("LaunchConfigurationName")(__v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      MaxInstanceLifetime.foreach(__v => __obj.updateDynamic("MaxInstanceLifetime")(__v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.updateDynamic("MaxSize")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      MixedInstancesPolicy.foreach(__v => __obj.updateDynamic("MixedInstancesPolicy")(__v.asInstanceOf[js.Any]))
      NewInstancesProtectedFromScaleIn.foreach(__v => __obj.updateDynamic("NewInstancesProtectedFromScaleIn")(__v.asInstanceOf[js.Any]))
      PlacementGroup.foreach(__v => __obj.updateDynamic("PlacementGroup")(__v.asInstanceOf[js.Any]))
      ServiceLinkedRoleARN.foreach(__v => __obj.updateDynamic("ServiceLinkedRoleARN")(__v.asInstanceOf[js.Any]))
      TerminationPolicies.foreach(__v => __obj.updateDynamic("TerminationPolicies")(__v.asInstanceOf[js.Any]))
      VPCZoneIdentifier.foreach(__v => __obj.updateDynamic("VPCZoneIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAutoScalingGroupType]
    }
  }

  /** Specifies the minimum and maximum for the <code>VCpuCount</code> object when you specify <a>InstanceRequirements</a> for an Auto Scaling group.
    */
  @js.native
  trait VCpuCountRequest extends js.Object {
    var Min: NullablePositiveInteger
    var Max: js.UndefOr[NullablePositiveInteger]
  }

  object VCpuCountRequest {
    @inline
    def apply(
        Min: NullablePositiveInteger,
        Max: js.UndefOr[NullablePositiveInteger] = js.undefined
    ): VCpuCountRequest = {
      val __obj = js.Dynamic.literal(
        "Min" -> Min.asInstanceOf[js.Any]
      )

      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VCpuCountRequest]
    }
  }

  /** Describes a warm pool configuration.
    */
  @js.native
  trait WarmPoolConfiguration extends js.Object {
    var InstanceReusePolicy: js.UndefOr[InstanceReusePolicy]
    var MaxGroupPreparedCapacity: js.UndefOr[MaxGroupPreparedCapacity]
    var MinSize: js.UndefOr[WarmPoolMinSize]
    var PoolState: js.UndefOr[WarmPoolState]
    var Status: js.UndefOr[WarmPoolStatus]
  }

  object WarmPoolConfiguration {
    @inline
    def apply(
        InstanceReusePolicy: js.UndefOr[InstanceReusePolicy] = js.undefined,
        MaxGroupPreparedCapacity: js.UndefOr[MaxGroupPreparedCapacity] = js.undefined,
        MinSize: js.UndefOr[WarmPoolMinSize] = js.undefined,
        PoolState: js.UndefOr[WarmPoolState] = js.undefined,
        Status: js.UndefOr[WarmPoolStatus] = js.undefined
    ): WarmPoolConfiguration = {
      val __obj = js.Dynamic.literal()
      InstanceReusePolicy.foreach(__v => __obj.updateDynamic("InstanceReusePolicy")(__v.asInstanceOf[js.Any]))
      MaxGroupPreparedCapacity.foreach(__v => __obj.updateDynamic("MaxGroupPreparedCapacity")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      PoolState.foreach(__v => __obj.updateDynamic("PoolState")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WarmPoolConfiguration]
    }
  }
}
