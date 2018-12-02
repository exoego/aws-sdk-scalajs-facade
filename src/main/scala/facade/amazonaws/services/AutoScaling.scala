package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object autoscaling {
  type Activities = js.Array[Activity]
  type ActivityIds = js.Array[XmlString]
  type AdjustmentTypes = js.Array[AdjustmentType]
  type Alarms = js.Array[Alarm]
  type AsciiStringMaxLen255 = String
  type AssociatePublicIpAddress = Boolean
  type AutoScalingGroupDesiredCapacity = Int
  type AutoScalingGroupMaxSize = Int
  type AutoScalingGroupMinSize = Int
  type AutoScalingGroupNames = js.Array[ResourceName]
  type AutoScalingGroups = js.Array[AutoScalingGroup]
  type AutoScalingInstances = js.Array[AutoScalingInstanceDetails]
  type AutoScalingNotificationTypes = js.Array[XmlStringMaxLen255]
  type AvailabilityZones = js.Array[XmlStringMaxLen255]
  type BlockDeviceEbsDeleteOnTermination = Boolean
  type BlockDeviceEbsEncrypted = Boolean
  type BlockDeviceEbsIops = Int
  type BlockDeviceEbsVolumeSize = Int
  type BlockDeviceEbsVolumeType = String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type ClassicLinkVPCSecurityGroups = js.Array[XmlStringMaxLen255]
  type Cooldown = Int
  type DisableScaleIn = Boolean
  type EbsOptimized = Boolean
  type EnabledMetrics = js.Array[EnabledMetric]
  type EstimatedInstanceWarmup = Int
  type FailedScheduledUpdateGroupActionRequests = js.Array[FailedScheduledUpdateGroupActionRequest]
  type Filters = js.Array[Filter]
  type ForceDelete = Boolean
  type GlobalTimeout = Int
  type HealthCheckGracePeriod = Int
  type HeartbeatTimeout = Int
  type HonorCooldown = Boolean
  type InstanceIds = js.Array[XmlStringMaxLen19]
  type InstanceProtected = Boolean
  type Instances = js.Array[Instance]
  type LaunchConfigurationNames = js.Array[ResourceName]
  type LaunchConfigurations = js.Array[LaunchConfiguration]
  type LaunchTemplateName = String
  type LifecycleActionResult = String
  type LifecycleActionToken = String
  type LifecycleHookNames = js.Array[AsciiStringMaxLen255]
  type LifecycleHookSpecifications = js.Array[LifecycleHookSpecification]
  type LifecycleHooks = js.Array[LifecycleHook]
  type LifecycleState = String
  type LifecycleTransition = String
  type LoadBalancerNames = js.Array[XmlStringMaxLen255]
  type LoadBalancerStates = js.Array[LoadBalancerState]
  type LoadBalancerTargetGroupStates = js.Array[LoadBalancerTargetGroupState]
  type MaxNumberOfAutoScalingGroups = Int
  type MaxNumberOfLaunchConfigurations = Int
  type MaxRecords = Int
  type MetricCollectionTypes = js.Array[MetricCollectionType]
  type MetricDimensionName = String
  type MetricDimensionValue = String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricGranularityTypes = js.Array[MetricGranularityType]
  type MetricName = String
  type MetricNamespace = String
  type MetricScale = Double
  type MetricStatistic = String
  type MetricType = String
  type MetricUnit = String
  type Metrics = js.Array[XmlStringMaxLen255]
  type MinAdjustmentMagnitude = Int
  type MinAdjustmentStep = Int
  type MonitoringEnabled = Boolean
  type NoDevice = Boolean
  type NotificationConfigurations = js.Array[NotificationConfiguration]
  type NotificationTargetResourceName = String
  type NumberOfAutoScalingGroups = Int
  type NumberOfLaunchConfigurations = Int
  type OnDemandBaseCapacity = Int
  type OnDemandPercentageAboveBaseCapacity = Int
  type Overrides = js.Array[LaunchTemplateOverrides]
  type PolicyIncrement = Int
  type PolicyNames = js.Array[ResourceName]
  type PolicyTypes = js.Array[XmlStringMaxLen64]
  type ProcessNames = js.Array[XmlStringMaxLen255]
  type Processes = js.Array[ProcessType]
  type Progress = Int
  type PropagateAtLaunch = Boolean
  type ProtectedFromScaleIn = Boolean
  type ResourceName = String
  type ScalingActivityStatusCode = String
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionNames = js.Array[ResourceName]
  type ScheduledUpdateGroupActionRequests = js.Array[ScheduledUpdateGroupActionRequest]
  type ScheduledUpdateGroupActions = js.Array[ScheduledUpdateGroupAction]
  type SecurityGroups = js.Array[XmlString]
  type ShouldDecrementDesiredCapacity = Boolean
  type ShouldRespectGracePeriod = Boolean
  type SpotInstancePools = Int
  type SpotPrice = String
  type StepAdjustments = js.Array[StepAdjustment]
  type SuspendedProcesses = js.Array[SuspendedProcess]
  type TagDescriptionList = js.Array[TagDescription]
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TargetGroupARNs = js.Array[XmlStringMaxLen511]
  type TerminationPolicies = js.Array[XmlStringMaxLen1600]
  type TimestampType = js.Date
  type Values = js.Array[XmlString]
  type XmlString = String
  type XmlStringMaxLen1023 = String
  type XmlStringMaxLen1600 = String
  type XmlStringMaxLen19 = String
  type XmlStringMaxLen2047 = String
  type XmlStringMaxLen255 = String
  type XmlStringMaxLen32 = String
  type XmlStringMaxLen511 = String
  type XmlStringMaxLen64 = String
  type XmlStringUserData = String
}

package autoscaling {
  @js.native
  @JSImport("aws-sdk", "AutoScaling")
  class AutoScaling(config: AWSConfig) extends js.Object {
    def attachInstances(params: AttachInstancesQuery): Request[js.Object] = js.native
    def attachLoadBalancerTargetGroups(params: AttachLoadBalancerTargetGroupsType): Request[AttachLoadBalancerTargetGroupsResultType] = js.native
    def attachLoadBalancers(params: AttachLoadBalancersType): Request[AttachLoadBalancersResultType] = js.native
    def batchDeleteScheduledAction(params: BatchDeleteScheduledActionType): Request[BatchDeleteScheduledActionAnswer] = js.native
    def batchPutScheduledUpdateGroupAction(params: BatchPutScheduledUpdateGroupActionType): Request[BatchPutScheduledUpdateGroupActionAnswer] = js.native
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
    def describeAccountLimits(): Request[DescribeAccountLimitsAnswer] = js.native
    def describeAdjustmentTypes(): Request[DescribeAdjustmentTypesAnswer] = js.native
    def describeAutoScalingGroups(params: AutoScalingGroupNamesType): Request[AutoScalingGroupsType] = js.native
    def describeAutoScalingInstances(params: DescribeAutoScalingInstancesType): Request[AutoScalingInstancesType] = js.native
    def describeAutoScalingNotificationTypes(): Request[DescribeAutoScalingNotificationTypesAnswer] = js.native
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
    def detachInstances(params: DetachInstancesQuery): Request[DetachInstancesAnswer] = js.native
    def detachLoadBalancerTargetGroups(params: DetachLoadBalancerTargetGroupsType): Request[DetachLoadBalancerTargetGroupsResultType] = js.native
    def detachLoadBalancers(params: DetachLoadBalancersType): Request[DetachLoadBalancersResultType] = js.native
    def disableMetricsCollection(params: DisableMetricsCollectionQuery): Request[js.Object] = js.native
    def enableMetricsCollection(params: EnableMetricsCollectionQuery): Request[js.Object] = js.native
    def enterStandby(params: EnterStandbyQuery): Request[EnterStandbyAnswer] = js.native
    def executePolicy(params: ExecutePolicyType): Request[js.Object] = js.native
    def exitStandby(params: ExitStandbyQuery): Request[ExitStandbyAnswer] = js.native
    def putLifecycleHook(params: PutLifecycleHookType): Request[PutLifecycleHookAnswer] = js.native
    def putNotificationConfiguration(params: PutNotificationConfigurationType): Request[js.Object] = js.native
    def putScalingPolicy(params: PutScalingPolicyType): Request[PolicyARNType] = js.native
    def putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType): Request[js.Object] = js.native
    def recordLifecycleActionHeartbeat(params: RecordLifecycleActionHeartbeatType): Request[RecordLifecycleActionHeartbeatAnswer] = js.native
    def resumeProcesses(params: ScalingProcessQuery): Request[js.Object] = js.native
    def setDesiredCapacity(params: SetDesiredCapacityType): Request[js.Object] = js.native
    def setInstanceHealth(params: SetInstanceHealthQuery): Request[js.Object] = js.native
    def setInstanceProtection(params: SetInstanceProtectionQuery): Request[SetInstanceProtectionAnswer] = js.native
    def suspendProcesses(params: ScalingProcessQuery): Request[js.Object] = js.native
    def terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType): Request[ActivityType] = js.native
    def updateAutoScalingGroup(params: UpdateAutoScalingGroupType): Request[js.Object] = js.native
  }

  @js.native
  trait ActivitiesType extends js.Object {
    var Activities: Activities
    var NextToken: js.UndefOr[XmlString]
  }

  object ActivitiesType {
    def apply(
      Activities: Activities,
      NextToken: js.UndefOr[XmlString] = js.undefined): ActivitiesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Activities" -> Activities.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivitiesType]
    }
  }

  /**
   * <p>Describes scaling activity, which is a long-running process that represents a change to your Auto Scaling group, such as changing its size or replacing an instance.</p>
   */
  @js.native
  trait Activity extends js.Object {
    var ActivityId: XmlString
    var AutoScalingGroupName: XmlStringMaxLen255
    var Cause: XmlStringMaxLen1023
    var StartTime: TimestampType
    var StatusCode: ScalingActivityStatusCode
    var Description: js.UndefOr[XmlString]
    var Details: js.UndefOr[XmlString]
    var EndTime: js.UndefOr[TimestampType]
    var Progress: js.UndefOr[Progress]
    var StatusMessage: js.UndefOr[XmlStringMaxLen255]
  }

  object Activity {
    def apply(
      ActivityId: XmlString,
      AutoScalingGroupName: XmlStringMaxLen255,
      Cause: XmlStringMaxLen1023,
      StartTime: TimestampType,
      StatusCode: ScalingActivityStatusCode,
      Description: js.UndefOr[XmlString] = js.undefined,
      Details: js.UndefOr[XmlString] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      Progress: js.UndefOr[Progress] = js.undefined,
      StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.undefined): Activity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivityId" -> ActivityId.asInstanceOf[js.Any],
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "Cause" -> Cause.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any],
        "StatusCode" -> StatusCode.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Activity]
    }
  }

  @js.native
  trait ActivityType extends js.Object {
    var Activity: js.UndefOr[Activity]
  }

  object ActivityType {
    def apply(
      Activity: js.UndefOr[Activity] = js.undefined): ActivityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Activity" -> Activity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityType]
    }
  }

  /**
   * <p>Describes a policy adjustment type.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html">Dynamic Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
   */
  @js.native
  trait AdjustmentType extends js.Object {
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
  }

  object AdjustmentType {
    def apply(
      AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined): AdjustmentType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdjustmentType" -> AdjustmentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdjustmentType]
    }
  }

  /**
   * <p>Describes an alarm.</p>
   */
  @js.native
  trait Alarm extends js.Object {
    var AlarmARN: js.UndefOr[ResourceName]
    var AlarmName: js.UndefOr[XmlStringMaxLen255]
  }

  object Alarm {
    def apply(
      AlarmARN: js.UndefOr[ResourceName] = js.undefined,
      AlarmName: js.UndefOr[XmlStringMaxLen255] = js.undefined): Alarm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmARN" -> AlarmARN.map { x => x.asInstanceOf[js.Any] },
        "AlarmName" -> AlarmName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alarm]
    }
  }

  @js.native
  trait AttachInstancesQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  object AttachInstancesQuery {
    def apply(
      AutoScalingGroupName: ResourceName,
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined): AttachInstancesQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachInstancesQuery]
    }
  }

  @js.native
  trait AttachLoadBalancerTargetGroupsResultType extends js.Object {

  }

  object AttachLoadBalancerTargetGroupsResultType {
    def apply(): AttachLoadBalancerTargetGroupsResultType = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerTargetGroupsResultType]
    }
  }

  @js.native
  trait AttachLoadBalancerTargetGroupsType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var TargetGroupARNs: TargetGroupARNs
  }

  object AttachLoadBalancerTargetGroupsType {
    def apply(
      AutoScalingGroupName: ResourceName,
      TargetGroupARNs: TargetGroupARNs): AttachLoadBalancerTargetGroupsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TargetGroupARNs" -> TargetGroupARNs.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerTargetGroupsType]
    }
  }

  @js.native
  trait AttachLoadBalancersResultType extends js.Object {

  }

  object AttachLoadBalancersResultType {
    def apply(): AttachLoadBalancersResultType = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancersResultType]
    }
  }

  @js.native
  trait AttachLoadBalancersType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LoadBalancerNames: LoadBalancerNames
  }

  object AttachLoadBalancersType {
    def apply(
      AutoScalingGroupName: ResourceName,
      LoadBalancerNames: LoadBalancerNames): AttachLoadBalancersType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancersType]
    }
  }

  /**
   * <p>Describes an Auto Scaling group.</p>
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
    var EnabledMetrics: js.UndefOr[EnabledMetrics]
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod]
    var Instances: js.UndefOr[Instances]
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames]
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy]
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected]
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255]
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName]
    var Status: js.UndefOr[XmlStringMaxLen255]
    var SuspendedProcesses: js.UndefOr[SuspendedProcesses]
    var Tags: js.UndefOr[TagDescriptionList]
    var TargetGroupARNs: js.UndefOr[TargetGroupARNs]
    var TerminationPolicies: js.UndefOr[TerminationPolicies]
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047]
  }

  object AutoScalingGroup {
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
      EnabledMetrics: js.UndefOr[EnabledMetrics] = js.undefined,
      HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
      Instances: js.UndefOr[Instances] = js.undefined,
      LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
      LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
      MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined,
      NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined,
      PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined,
      Status: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      SuspendedProcesses: js.UndefOr[SuspendedProcesses] = js.undefined,
      Tags: js.UndefOr[TagDescriptionList] = js.undefined,
      TargetGroupARNs: js.UndefOr[TargetGroupARNs] = js.undefined,
      TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
      VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined): AutoScalingGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "DefaultCooldown" -> DefaultCooldown.asInstanceOf[js.Any],
        "DesiredCapacity" -> DesiredCapacity.asInstanceOf[js.Any],
        "HealthCheckType" -> HealthCheckType.asInstanceOf[js.Any],
        "MaxSize" -> MaxSize.asInstanceOf[js.Any],
        "MinSize" -> MinSize.asInstanceOf[js.Any],
        "AutoScalingGroupARN" -> AutoScalingGroupARN.map { x => x.asInstanceOf[js.Any] },
        "EnabledMetrics" -> EnabledMetrics.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckGracePeriod" -> HealthCheckGracePeriod.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "LaunchConfigurationName" -> LaunchConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerNames" -> LoadBalancerNames.map { x => x.asInstanceOf[js.Any] },
        "MixedInstancesPolicy" -> MixedInstancesPolicy.map { x => x.asInstanceOf[js.Any] },
        "NewInstancesProtectedFromScaleIn" -> NewInstancesProtectedFromScaleIn.map { x => x.asInstanceOf[js.Any] },
        "PlacementGroup" -> PlacementGroup.map { x => x.asInstanceOf[js.Any] },
        "ServiceLinkedRoleARN" -> ServiceLinkedRoleARN.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SuspendedProcesses" -> SuspendedProcesses.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupARNs" -> TargetGroupARNs.map { x => x.asInstanceOf[js.Any] },
        "TerminationPolicies" -> TerminationPolicies.map { x => x.asInstanceOf[js.Any] },
        "VPCZoneIdentifier" -> VPCZoneIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroup]
    }
  }

  @js.native
  trait AutoScalingGroupNamesType extends js.Object {
    var AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object AutoScalingGroupNamesType {
    def apply(
      AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): AutoScalingGroupNamesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupNames" -> AutoScalingGroupNames.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroupNamesType]
    }
  }

  @js.native
  trait AutoScalingGroupsType extends js.Object {
    var AutoScalingGroups: AutoScalingGroups
    var NextToken: js.UndefOr[XmlString]
  }

  object AutoScalingGroupsType {
    def apply(
      AutoScalingGroups: AutoScalingGroups,
      NextToken: js.UndefOr[XmlString] = js.undefined): AutoScalingGroupsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroups" -> AutoScalingGroups.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroupsType]
    }
  }

  /**
   * <p>Describes an EC2 instance associated with an Auto Scaling group.</p>
   */
  @js.native
  trait AutoScalingInstanceDetails extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var AvailabilityZone: XmlStringMaxLen255
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen19
    var LifecycleState: XmlStringMaxLen32
    var ProtectedFromScaleIn: InstanceProtected
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
  }

  object AutoScalingInstanceDetails {
    def apply(
      AutoScalingGroupName: XmlStringMaxLen255,
      AvailabilityZone: XmlStringMaxLen255,
      HealthStatus: XmlStringMaxLen32,
      InstanceId: XmlStringMaxLen19,
      LifecycleState: XmlStringMaxLen32,
      ProtectedFromScaleIn: InstanceProtected,
      LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined): AutoScalingInstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "HealthStatus" -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LifecycleState" -> LifecycleState.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any],
        "LaunchConfigurationName" -> LaunchConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingInstanceDetails]
    }
  }

  @js.native
  trait AutoScalingInstancesType extends js.Object {
    var AutoScalingInstances: js.UndefOr[AutoScalingInstances]
    var NextToken: js.UndefOr[XmlString]
  }

  object AutoScalingInstancesType {
    def apply(
      AutoScalingInstances: js.UndefOr[AutoScalingInstances] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): AutoScalingInstancesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingInstances" -> AutoScalingInstances.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingInstancesType]
    }
  }

  @js.native
  trait BatchDeleteScheduledActionAnswer extends js.Object {
    var FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests]
  }

  object BatchDeleteScheduledActionAnswer {
    def apply(
      FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined): BatchDeleteScheduledActionAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedScheduledActions" -> FailedScheduledActions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteScheduledActionAnswer]
    }
  }

  @js.native
  trait BatchDeleteScheduledActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScheduledActionNames: ScheduledActionNames
  }

  object BatchDeleteScheduledActionType {
    def apply(
      AutoScalingGroupName: ResourceName,
      ScheduledActionNames: ScheduledActionNames): BatchDeleteScheduledActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledActionNames" -> ScheduledActionNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteScheduledActionType]
    }
  }

  @js.native
  trait BatchPutScheduledUpdateGroupActionAnswer extends js.Object {
    var FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests]
  }

  object BatchPutScheduledUpdateGroupActionAnswer {
    def apply(
      FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined): BatchPutScheduledUpdateGroupActionAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedScheduledUpdateGroupActions" -> FailedScheduledUpdateGroupActions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchPutScheduledUpdateGroupActionAnswer]
    }
  }

  @js.native
  trait BatchPutScheduledUpdateGroupActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  }

  object BatchPutScheduledUpdateGroupActionType {
    def apply(
      AutoScalingGroupName: ResourceName,
      ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests): BatchPutScheduledUpdateGroupActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledUpdateGroupActions" -> ScheduledUpdateGroupActions.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchPutScheduledUpdateGroupActionType]
    }
  }

  /**
   * <p>Describes a block device mapping.</p>
   */
  @js.native
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: XmlStringMaxLen255
    var Ebs: js.UndefOr[Ebs]
    var NoDevice: js.UndefOr[NoDevice]
    var VirtualName: js.UndefOr[XmlStringMaxLen255]
  }

  object BlockDeviceMapping {
    def apply(
      DeviceName: XmlStringMaxLen255,
      Ebs: js.UndefOr[Ebs] = js.undefined,
      NoDevice: js.UndefOr[NoDevice] = js.undefined,
      VirtualName: js.UndefOr[XmlStringMaxLen255] = js.undefined): BlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceName" -> DeviceName.asInstanceOf[js.Any],
        "Ebs" -> Ebs.map { x => x.asInstanceOf[js.Any] },
        "NoDevice" -> NoDevice.map { x => x.asInstanceOf[js.Any] },
        "VirtualName" -> VirtualName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlockDeviceMapping]
    }
  }

  @js.native
  trait CompleteLifecycleActionAnswer extends js.Object {

  }

  object CompleteLifecycleActionAnswer {
    def apply(): CompleteLifecycleActionAnswer = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteLifecycleActionAnswer]
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
    def apply(
      AutoScalingGroupName: ResourceName,
      LifecycleActionResult: LifecycleActionResult,
      LifecycleHookName: AsciiStringMaxLen255,
      InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
      LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined): CompleteLifecycleActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleActionResult" -> LifecycleActionResult.asInstanceOf[js.Any],
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "LifecycleActionToken" -> LifecycleActionToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteLifecycleActionType]
    }
  }

  @js.native
  trait CreateAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var MaxSize: AutoScalingGroupMaxSize
    var MinSize: AutoScalingGroupMinSize
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var DefaultCooldown: js.UndefOr[Cooldown]
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod]
    var HealthCheckType: js.UndefOr[XmlStringMaxLen32]
    var InstanceId: js.UndefOr[XmlStringMaxLen19]
    var LaunchConfigurationName: js.UndefOr[ResourceName]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications]
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames]
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy]
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected]
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255]
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName]
    var Tags: js.UndefOr[Tags]
    var TargetGroupARNs: js.UndefOr[TargetGroupARNs]
    var TerminationPolicies: js.UndefOr[TerminationPolicies]
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047]
  }

  object CreateAutoScalingGroupType {
    def apply(
      AutoScalingGroupName: XmlStringMaxLen255,
      MaxSize: AutoScalingGroupMaxSize,
      MinSize: AutoScalingGroupMinSize,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      DefaultCooldown: js.UndefOr[Cooldown] = js.undefined,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
      HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
      LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined,
      LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
      LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications] = js.undefined,
      LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
      MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined,
      NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined,
      PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      TargetGroupARNs: js.UndefOr[TargetGroupARNs] = js.undefined,
      TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
      VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined): CreateAutoScalingGroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "MaxSize" -> MaxSize.asInstanceOf[js.Any],
        "MinSize" -> MinSize.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "DefaultCooldown" -> DefaultCooldown.map { x => x.asInstanceOf[js.Any] },
        "DesiredCapacity" -> DesiredCapacity.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckGracePeriod" -> HealthCheckGracePeriod.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckType" -> HealthCheckType.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "LaunchConfigurationName" -> LaunchConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] },
        "LifecycleHookSpecificationList" -> LifecycleHookSpecificationList.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerNames" -> LoadBalancerNames.map { x => x.asInstanceOf[js.Any] },
        "MixedInstancesPolicy" -> MixedInstancesPolicy.map { x => x.asInstanceOf[js.Any] },
        "NewInstancesProtectedFromScaleIn" -> NewInstancesProtectedFromScaleIn.map { x => x.asInstanceOf[js.Any] },
        "PlacementGroup" -> PlacementGroup.map { x => x.asInstanceOf[js.Any] },
        "ServiceLinkedRoleARN" -> ServiceLinkedRoleARN.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupARNs" -> TargetGroupARNs.map { x => x.asInstanceOf[js.Any] },
        "TerminationPolicies" -> TerminationPolicies.map { x => x.asInstanceOf[js.Any] },
        "VPCZoneIdentifier" -> VPCZoneIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAutoScalingGroupType]
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
    var PlacementTenancy: js.UndefOr[XmlStringMaxLen64]
    var RamdiskId: js.UndefOr[XmlStringMaxLen255]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SpotPrice: js.UndefOr[SpotPrice]
    var UserData: js.UndefOr[XmlStringUserData]
  }

  object CreateLaunchConfigurationType {
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
      PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined,
      RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      SpotPrice: js.UndefOr[SpotPrice] = js.undefined,
      UserData: js.UndefOr[XmlStringUserData] = js.undefined): CreateLaunchConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchConfigurationName" -> LaunchConfigurationName.asInstanceOf[js.Any],
        "AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "ClassicLinkVPCId" -> ClassicLinkVPCId.map { x => x.asInstanceOf[js.Any] },
        "ClassicLinkVPCSecurityGroups" -> ClassicLinkVPCSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "InstanceMonitoring" -> InstanceMonitoring.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "PlacementTenancy" -> PlacementTenancy.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "SpotPrice" -> SpotPrice.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLaunchConfigurationType]
    }
  }

  @js.native
  trait CreateOrUpdateTagsType extends js.Object {
    var Tags: Tags
  }

  object CreateOrUpdateTagsType {
    def apply(
      Tags: Tags): CreateOrUpdateTagsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrUpdateTagsType]
    }
  }

  /**
   * <p>Configures a customized metric for a target tracking policy.</p>
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
  trait DeleteAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ForceDelete: js.UndefOr[ForceDelete]
  }

  object DeleteAutoScalingGroupType {
    def apply(
      AutoScalingGroupName: ResourceName,
      ForceDelete: js.UndefOr[ForceDelete] = js.undefined): DeleteAutoScalingGroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ForceDelete" -> ForceDelete.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAutoScalingGroupType]
    }
  }

  @js.native
  trait DeleteLifecycleHookAnswer extends js.Object {

  }

  object DeleteLifecycleHookAnswer {
    def apply(): DeleteLifecycleHookAnswer = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecycleHookAnswer]
    }
  }

  @js.native
  trait DeleteLifecycleHookType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleHookName: AsciiStringMaxLen255
  }

  object DeleteLifecycleHookType {
    def apply(
      AutoScalingGroupName: ResourceName,
      LifecycleHookName: AsciiStringMaxLen255): DeleteLifecycleHookType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecycleHookType]
    }
  }

  @js.native
  trait DeleteNotificationConfigurationType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var TopicARN: ResourceName
  }

  object DeleteNotificationConfigurationType {
    def apply(
      AutoScalingGroupName: ResourceName,
      TopicARN: ResourceName): DeleteNotificationConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TopicARN" -> TopicARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotificationConfigurationType]
    }
  }

  @js.native
  trait DeletePolicyType extends js.Object {
    var PolicyName: ResourceName
    var AutoScalingGroupName: js.UndefOr[ResourceName]
  }

  object DeletePolicyType {
    def apply(
      PolicyName: ResourceName,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined): DeletePolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyType]
    }
  }

  @js.native
  trait DeleteScheduledActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScheduledActionName: ResourceName
  }

  object DeleteScheduledActionType {
    def apply(
      AutoScalingGroupName: ResourceName,
      ScheduledActionName: ResourceName): DeleteScheduledActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScheduledActionType]
    }
  }

  @js.native
  trait DeleteTagsType extends js.Object {
    var Tags: Tags
  }

  object DeleteTagsType {
    def apply(
      Tags: Tags): DeleteTagsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsType]
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
    def apply(
      MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups] = js.undefined,
      MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations] = js.undefined,
      NumberOfAutoScalingGroups: js.UndefOr[NumberOfAutoScalingGroups] = js.undefined,
      NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations] = js.undefined): DescribeAccountLimitsAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxNumberOfAutoScalingGroups" -> MaxNumberOfAutoScalingGroups.map { x => x.asInstanceOf[js.Any] },
        "MaxNumberOfLaunchConfigurations" -> MaxNumberOfLaunchConfigurations.map { x => x.asInstanceOf[js.Any] },
        "NumberOfAutoScalingGroups" -> NumberOfAutoScalingGroups.map { x => x.asInstanceOf[js.Any] },
        "NumberOfLaunchConfigurations" -> NumberOfLaunchConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountLimitsAnswer]
    }
  }

  @js.native
  trait DescribeAdjustmentTypesAnswer extends js.Object {
    var AdjustmentTypes: js.UndefOr[AdjustmentTypes]
  }

  object DescribeAdjustmentTypesAnswer {
    def apply(
      AdjustmentTypes: js.UndefOr[AdjustmentTypes] = js.undefined): DescribeAdjustmentTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdjustmentTypes" -> AdjustmentTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAdjustmentTypesAnswer]
    }
  }

  @js.native
  trait DescribeAutoScalingInstancesType extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIds]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeAutoScalingInstancesType {
    def apply(
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeAutoScalingInstancesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutoScalingInstancesType]
    }
  }

  @js.native
  trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
    var AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes]
  }

  object DescribeAutoScalingNotificationTypesAnswer {
    def apply(
      AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined): DescribeAutoScalingNotificationTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingNotificationTypes" -> AutoScalingNotificationTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHookTypesAnswer extends js.Object {
    var LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes]
  }

  object DescribeLifecycleHookTypesAnswer {
    def apply(
      LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined): DescribeLifecycleHookTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LifecycleHookTypes" -> LifecycleHookTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLifecycleHookTypesAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHooksAnswer extends js.Object {
    var LifecycleHooks: js.UndefOr[LifecycleHooks]
  }

  object DescribeLifecycleHooksAnswer {
    def apply(
      LifecycleHooks: js.UndefOr[LifecycleHooks] = js.undefined): DescribeLifecycleHooksAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LifecycleHooks" -> LifecycleHooks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLifecycleHooksAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHooksType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleHookNames: js.UndefOr[LifecycleHookNames]
  }

  object DescribeLifecycleHooksType {
    def apply(
      AutoScalingGroupName: ResourceName,
      LifecycleHookNames: js.UndefOr[LifecycleHookNames] = js.undefined): DescribeLifecycleHooksType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookNames" -> LifecycleHookNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLifecycleHooksType]
    }
  }

  @js.native
  trait DescribeLoadBalancerTargetGroupsRequest extends js.Object {
    var AutoScalingGroupName: ResourceName
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeLoadBalancerTargetGroupsRequest {
    def apply(
      AutoScalingGroupName: ResourceName,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeLoadBalancerTargetGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerTargetGroupsRequest]
    }
  }

  @js.native
  trait DescribeLoadBalancerTargetGroupsResponse extends js.Object {
    var LoadBalancerTargetGroups: js.UndefOr[LoadBalancerTargetGroupStates]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeLoadBalancerTargetGroupsResponse {
    def apply(
      LoadBalancerTargetGroups: js.UndefOr[LoadBalancerTargetGroupStates] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeLoadBalancerTargetGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerTargetGroups" -> LoadBalancerTargetGroups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerTargetGroupsResponse]
    }
  }

  @js.native
  trait DescribeLoadBalancersRequest extends js.Object {
    var AutoScalingGroupName: ResourceName
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeLoadBalancersRequest {
    def apply(
      AutoScalingGroupName: ResourceName,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeLoadBalancersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancersRequest]
    }
  }

  @js.native
  trait DescribeLoadBalancersResponse extends js.Object {
    var LoadBalancers: js.UndefOr[LoadBalancerStates]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeLoadBalancersResponse {
    def apply(
      LoadBalancers: js.UndefOr[LoadBalancerStates] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeLoadBalancersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancers" -> LoadBalancers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancersResponse]
    }
  }

  @js.native
  trait DescribeMetricCollectionTypesAnswer extends js.Object {
    var Granularities: js.UndefOr[MetricGranularityTypes]
    var Metrics: js.UndefOr[MetricCollectionTypes]
  }

  object DescribeMetricCollectionTypesAnswer {
    def apply(
      Granularities: js.UndefOr[MetricGranularityTypes] = js.undefined,
      Metrics: js.UndefOr[MetricCollectionTypes] = js.undefined): DescribeMetricCollectionTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Granularities" -> Granularities.map { x => x.asInstanceOf[js.Any] },
        "Metrics" -> Metrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMetricCollectionTypesAnswer]
    }
  }

  @js.native
  trait DescribeNotificationConfigurationsAnswer extends js.Object {
    var NotificationConfigurations: NotificationConfigurations
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeNotificationConfigurationsAnswer {
    def apply(
      NotificationConfigurations: NotificationConfigurations,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeNotificationConfigurationsAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotificationConfigurations" -> NotificationConfigurations.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationConfigurationsAnswer]
    }
  }

  @js.native
  trait DescribeNotificationConfigurationsType extends js.Object {
    var AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeNotificationConfigurationsType {
    def apply(
      AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeNotificationConfigurationsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupNames" -> AutoScalingGroupNames.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationConfigurationsType]
    }
  }

  @js.native
  trait DescribePoliciesType extends js.Object {
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
    var PolicyNames: js.UndefOr[PolicyNames]
    var PolicyTypes: js.UndefOr[PolicyTypes]
  }

  object DescribePoliciesType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined,
      PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined): DescribePoliciesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] },
        "PolicyTypes" -> PolicyTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePoliciesType]
    }
  }

  @js.native
  trait DescribeScalingActivitiesType extends js.Object {
    var ActivityIds: js.UndefOr[ActivityIds]
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeScalingActivitiesType {
    def apply(
      ActivityIds: js.UndefOr[ActivityIds] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeScalingActivitiesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivityIds" -> ActivityIds.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingActivitiesType]
    }
  }

  @js.native
  trait DescribeScheduledActionsType extends js.Object {
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var EndTime: js.UndefOr[TimestampType]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
    var ScheduledActionNames: js.UndefOr[ScheduledActionNames]
    var StartTime: js.UndefOr[TimestampType]
  }

  object DescribeScheduledActionsType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScheduledActionNames: js.UndefOr[ScheduledActionNames] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined): DescribeScheduledActionsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionNames" -> ScheduledActionNames.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledActionsType]
    }
  }

  @js.native
  trait DescribeTagsType extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object DescribeTagsType {
    def apply(
      Filters: js.UndefOr[Filters] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): DescribeTagsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsType]
    }
  }

  @js.native
  trait DescribeTerminationPolicyTypesAnswer extends js.Object {
    var TerminationPolicyTypes: js.UndefOr[TerminationPolicies]
  }

  object DescribeTerminationPolicyTypesAnswer {
    def apply(
      TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.undefined): DescribeTerminationPolicyTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminationPolicyTypes" -> TerminationPolicyTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTerminationPolicyTypesAnswer]
    }
  }

  @js.native
  trait DetachInstancesAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object DetachInstancesAnswer {
    def apply(
      Activities: js.UndefOr[Activities] = js.undefined): DetachInstancesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Activities" -> Activities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInstancesAnswer]
    }
  }

  @js.native
  trait DetachInstancesQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  object DetachInstancesQuery {
    def apply(
      AutoScalingGroupName: ResourceName,
      ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity,
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined): DetachInstancesQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any],
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInstancesQuery]
    }
  }

  @js.native
  trait DetachLoadBalancerTargetGroupsResultType extends js.Object {

  }

  object DetachLoadBalancerTargetGroupsResultType {
    def apply(): DetachLoadBalancerTargetGroupsResultType = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachLoadBalancerTargetGroupsResultType]
    }
  }

  @js.native
  trait DetachLoadBalancerTargetGroupsType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var TargetGroupARNs: TargetGroupARNs
  }

  object DetachLoadBalancerTargetGroupsType {
    def apply(
      AutoScalingGroupName: ResourceName,
      TargetGroupARNs: TargetGroupARNs): DetachLoadBalancerTargetGroupsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TargetGroupARNs" -> TargetGroupARNs.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachLoadBalancerTargetGroupsType]
    }
  }

  @js.native
  trait DetachLoadBalancersResultType extends js.Object {

  }

  object DetachLoadBalancersResultType {
    def apply(): DetachLoadBalancersResultType = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachLoadBalancersResultType]
    }
  }

  @js.native
  trait DetachLoadBalancersType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LoadBalancerNames: LoadBalancerNames
  }

  object DetachLoadBalancersType {
    def apply(
      AutoScalingGroupName: ResourceName,
      LoadBalancerNames: LoadBalancerNames): DetachLoadBalancersType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachLoadBalancersType]
    }
  }

  @js.native
  trait DisableMetricsCollectionQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var Metrics: js.UndefOr[Metrics]
  }

  object DisableMetricsCollectionQuery {
    def apply(
      AutoScalingGroupName: ResourceName,
      Metrics: js.UndefOr[Metrics] = js.undefined): DisableMetricsCollectionQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "Metrics" -> Metrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableMetricsCollectionQuery]
    }
  }

  /**
   * <p>Describes an Amazon EBS volume.</p>
   */
  @js.native
  trait Ebs extends js.Object {
    var DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination]
    var Encrypted: js.UndefOr[BlockDeviceEbsEncrypted]
    var Iops: js.UndefOr[BlockDeviceEbsIops]
    var SnapshotId: js.UndefOr[XmlStringMaxLen255]
    var VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize]
    var VolumeType: js.UndefOr[BlockDeviceEbsVolumeType]
  }

  object Ebs {
    def apply(
      DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination] = js.undefined,
      Encrypted: js.UndefOr[BlockDeviceEbsEncrypted] = js.undefined,
      Iops: js.UndefOr[BlockDeviceEbsIops] = js.undefined,
      SnapshotId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize] = js.undefined,
      VolumeType: js.UndefOr[BlockDeviceEbsVolumeType] = js.undefined): Ebs = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeleteOnTermination" -> DeleteOnTermination.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "VolumeSize" -> VolumeSize.map { x => x.asInstanceOf[js.Any] },
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ebs]
    }
  }

  @js.native
  trait EnableMetricsCollectionQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var Granularity: XmlStringMaxLen255
    var Metrics: js.UndefOr[Metrics]
  }

  object EnableMetricsCollectionQuery {
    def apply(
      AutoScalingGroupName: ResourceName,
      Granularity: XmlStringMaxLen255,
      Metrics: js.UndefOr[Metrics] = js.undefined): EnableMetricsCollectionQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "Granularity" -> Granularity.asInstanceOf[js.Any],
        "Metrics" -> Metrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableMetricsCollectionQuery]
    }
  }

  /**
   * <p>Describes an enabled metric.</p>
   */
  @js.native
  trait EnabledMetric extends js.Object {
    var Granularity: js.UndefOr[XmlStringMaxLen255]
    var Metric: js.UndefOr[XmlStringMaxLen255]
  }

  object EnabledMetric {
    def apply(
      Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined): EnabledMetric = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Granularity" -> Granularity.map { x => x.asInstanceOf[js.Any] },
        "Metric" -> Metric.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnabledMetric]
    }
  }

  @js.native
  trait EnterStandbyAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object EnterStandbyAnswer {
    def apply(
      Activities: js.UndefOr[Activities] = js.undefined): EnterStandbyAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Activities" -> Activities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnterStandbyAnswer]
    }
  }

  @js.native
  trait EnterStandbyQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  object EnterStandbyQuery {
    def apply(
      AutoScalingGroupName: ResourceName,
      ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity,
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined): EnterStandbyQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any],
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnterStandbyQuery]
    }
  }

  @js.native
  trait ExecutePolicyType extends js.Object {
    var PolicyName: ResourceName
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var BreachThreshold: js.UndefOr[MetricScale]
    var HonorCooldown: js.UndefOr[HonorCooldown]
    var MetricValue: js.UndefOr[MetricScale]
  }

  object ExecutePolicyType {
    def apply(
      PolicyName: ResourceName,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      BreachThreshold: js.UndefOr[MetricScale] = js.undefined,
      HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined,
      MetricValue: js.UndefOr[MetricScale] = js.undefined): ExecutePolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] },
        "BreachThreshold" -> BreachThreshold.map { x => x.asInstanceOf[js.Any] },
        "HonorCooldown" -> HonorCooldown.map { x => x.asInstanceOf[js.Any] },
        "MetricValue" -> MetricValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutePolicyType]
    }
  }

  @js.native
  trait ExitStandbyAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object ExitStandbyAnswer {
    def apply(
      Activities: js.UndefOr[Activities] = js.undefined): ExitStandbyAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Activities" -> Activities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExitStandbyAnswer]
    }
  }

  @js.native
  trait ExitStandbyQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  object ExitStandbyQuery {
    def apply(
      AutoScalingGroupName: ResourceName,
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined): ExitStandbyQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExitStandbyQuery]
    }
  }

  /**
   * <p>Describes a scheduled action that could not be created, updated, or deleted.</p>
   */
  @js.native
  trait FailedScheduledUpdateGroupActionRequest extends js.Object {
    var ScheduledActionName: XmlStringMaxLen255
    var ErrorCode: js.UndefOr[XmlStringMaxLen64]
    var ErrorMessage: js.UndefOr[XmlString]
  }

  object FailedScheduledUpdateGroupActionRequest {
    def apply(
      ScheduledActionName: XmlStringMaxLen255,
      ErrorCode: js.UndefOr[XmlStringMaxLen64] = js.undefined,
      ErrorMessage: js.UndefOr[XmlString] = js.undefined): FailedScheduledUpdateGroupActionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedScheduledUpdateGroupActionRequest]
    }
  }

  /**
   * <p>Describes a filter.</p>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[XmlString]
    var Values: js.UndefOr[Values]
  }

  object Filter {
    def apply(
      Name: js.UndefOr[XmlString] = js.undefined,
      Values: js.UndefOr[Values] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
   * <p>Describes an EC2 instance.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var AvailabilityZone: XmlStringMaxLen255
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen19
    var LifecycleState: LifecycleState
    var ProtectedFromScaleIn: InstanceProtected
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
  }

  object Instance {
    def apply(
      AvailabilityZone: XmlStringMaxLen255,
      HealthStatus: XmlStringMaxLen32,
      InstanceId: XmlStringMaxLen19,
      LifecycleState: LifecycleState,
      ProtectedFromScaleIn: InstanceProtected,
      LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "HealthStatus" -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LifecycleState" -> LifecycleState.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any],
        "LaunchConfigurationName" -> LaunchConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>Describes whether detailed monitoring is enabled for the Auto Scaling instances.</p>
   */
  @js.native
  trait InstanceMonitoring extends js.Object {
    var Enabled: js.UndefOr[MonitoringEnabled]
  }

  object InstanceMonitoring {
    def apply(
      Enabled: js.UndefOr[MonitoringEnabled] = js.undefined): InstanceMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceMonitoring]
    }
  }

  /**
   * <p>Describes an instances distribution for an Auto Scaling group with <a>MixedInstancesPolicy</a>.</p> <p>The instances distribution specifies the distribution of On-Demand Instances and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types.</p>
   */
  @js.native
  trait InstancesDistribution extends js.Object {
    var OnDemandAllocationStrategy: js.UndefOr[XmlString]
    var OnDemandBaseCapacity: js.UndefOr[OnDemandBaseCapacity]
    var OnDemandPercentageAboveBaseCapacity: js.UndefOr[OnDemandPercentageAboveBaseCapacity]
    var SpotAllocationStrategy: js.UndefOr[XmlString]
    var SpotInstancePools: js.UndefOr[SpotInstancePools]
    var SpotMaxPrice: js.UndefOr[SpotPrice]
  }

  object InstancesDistribution {
    def apply(
      OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.undefined,
      OnDemandBaseCapacity: js.UndefOr[OnDemandBaseCapacity] = js.undefined,
      OnDemandPercentageAboveBaseCapacity: js.UndefOr[OnDemandPercentageAboveBaseCapacity] = js.undefined,
      SpotAllocationStrategy: js.UndefOr[XmlString] = js.undefined,
      SpotInstancePools: js.UndefOr[SpotInstancePools] = js.undefined,
      SpotMaxPrice: js.UndefOr[SpotPrice] = js.undefined): InstancesDistribution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OnDemandAllocationStrategy" -> OnDemandAllocationStrategy.map { x => x.asInstanceOf[js.Any] },
        "OnDemandBaseCapacity" -> OnDemandBaseCapacity.map { x => x.asInstanceOf[js.Any] },
        "OnDemandPercentageAboveBaseCapacity" -> OnDemandPercentageAboveBaseCapacity.map { x => x.asInstanceOf[js.Any] },
        "SpotAllocationStrategy" -> SpotAllocationStrategy.map { x => x.asInstanceOf[js.Any] },
        "SpotInstancePools" -> SpotInstancePools.map { x => x.asInstanceOf[js.Any] },
        "SpotMaxPrice" -> SpotMaxPrice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancesDistribution]
    }
  }

  /**
   * <p>Describes a launch configuration.</p>
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
    var PlacementTenancy: js.UndefOr[XmlStringMaxLen64]
    var RamdiskId: js.UndefOr[XmlStringMaxLen255]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SpotPrice: js.UndefOr[SpotPrice]
    var UserData: js.UndefOr[XmlStringUserData]
  }

  object LaunchConfiguration {
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
      PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined,
      RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      SpotPrice: js.UndefOr[SpotPrice] = js.undefined,
      UserData: js.UndefOr[XmlStringUserData] = js.undefined): LaunchConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "ImageId" -> ImageId.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "LaunchConfigurationName" -> LaunchConfigurationName.asInstanceOf[js.Any],
        "AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x => x.asInstanceOf[js.Any] },
        "ClassicLinkVPCId" -> ClassicLinkVPCId.map { x => x.asInstanceOf[js.Any] },
        "ClassicLinkVPCSecurityGroups" -> ClassicLinkVPCSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "EbsOptimized" -> EbsOptimized.map { x => x.asInstanceOf[js.Any] },
        "IamInstanceProfile" -> IamInstanceProfile.map { x => x.asInstanceOf[js.Any] },
        "InstanceMonitoring" -> InstanceMonitoring.map { x => x.asInstanceOf[js.Any] },
        "KernelId" -> KernelId.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "LaunchConfigurationARN" -> LaunchConfigurationARN.map { x => x.asInstanceOf[js.Any] },
        "PlacementTenancy" -> PlacementTenancy.map { x => x.asInstanceOf[js.Any] },
        "RamdiskId" -> RamdiskId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "SpotPrice" -> SpotPrice.map { x => x.asInstanceOf[js.Any] },
        "UserData" -> UserData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfiguration]
    }
  }

  @js.native
  trait LaunchConfigurationNameType extends js.Object {
    var LaunchConfigurationName: ResourceName
  }

  object LaunchConfigurationNameType {
    def apply(
      LaunchConfigurationName: ResourceName): LaunchConfigurationNameType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchConfigurationName" -> LaunchConfigurationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfigurationNameType]
    }
  }

  @js.native
  trait LaunchConfigurationNamesType extends js.Object {
    var LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  object LaunchConfigurationNamesType {
    def apply(
      LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined): LaunchConfigurationNamesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchConfigurationNames" -> LaunchConfigurationNames.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfigurationNamesType]
    }
  }

  @js.native
  trait LaunchConfigurationsType extends js.Object {
    var LaunchConfigurations: LaunchConfigurations
    var NextToken: js.UndefOr[XmlString]
  }

  object LaunchConfigurationsType {
    def apply(
      LaunchConfigurations: LaunchConfigurations,
      NextToken: js.UndefOr[XmlString] = js.undefined): LaunchConfigurationsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchConfigurations" -> LaunchConfigurations.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfigurationsType]
    }
  }

  /**
   * <p>Describes a launch template and overrides. </p> <p>The overrides are used to override the instance type specified by the launch template with multiple instance types that can be used to launch On-Demand Instances and Spot Instances. </p>
   */
  @js.native
  trait LaunchTemplate extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification]
    var Overrides: js.UndefOr[Overrides]
  }

  object LaunchTemplate {
    def apply(
      LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
      Overrides: js.UndefOr[Overrides] = js.undefined): LaunchTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateSpecification" -> LaunchTemplateSpecification.map { x => x.asInstanceOf[js.Any] },
        "Overrides" -> Overrides.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplate]
    }
  }

  /**
   * <p>Describes an override for a launch template. </p>
   */
  @js.native
  trait LaunchTemplateOverrides extends js.Object {
    var InstanceType: js.UndefOr[XmlStringMaxLen255]
  }

  object LaunchTemplateOverrides {
    def apply(
      InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined): LaunchTemplateOverrides = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateOverrides]
    }
  }

  /**
   * <p>Describes a launch template and the launch template version.</p> <p>The launch template that is specified must be configured for use with an Auto Scaling group. For more information, see <a href="http://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a Launch Template for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
   */
  @js.native
  trait LaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Version: js.UndefOr[XmlStringMaxLen255]
  }

  object LaunchTemplateSpecification {
    def apply(
      LaunchTemplateId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
      Version: js.UndefOr[XmlStringMaxLen255] = js.undefined): LaunchTemplateSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchTemplateId" -> LaunchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplateName" -> LaunchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateSpecification]
    }
  }

  /**
   * <p>Describes a lifecycle hook, which tells Amazon EC2 Auto Scaling that you want to perform an action whenever it launches instances or whenever it terminates instances.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Lifecycle Hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
   */
  @js.native
  trait LifecycleHook extends js.Object {
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var DefaultResult: js.UndefOr[LifecycleActionResult]
    var GlobalTimeout: js.UndefOr[GlobalTimeout]
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout]
    var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255]
    var LifecycleTransition: js.UndefOr[LifecycleTransition]
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023]
    var NotificationTargetARN: js.UndefOr[ResourceName]
    var RoleARN: js.UndefOr[ResourceName]
  }

  object LifecycleHook {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined,
      GlobalTimeout: js.UndefOr[GlobalTimeout] = js.undefined,
      HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
      LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined,
      LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined,
      NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
      NotificationTargetARN: js.UndefOr[ResourceName] = js.undefined,
      RoleARN: js.UndefOr[ResourceName] = js.undefined): LifecycleHook = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] },
        "DefaultResult" -> DefaultResult.map { x => x.asInstanceOf[js.Any] },
        "GlobalTimeout" -> GlobalTimeout.map { x => x.asInstanceOf[js.Any] },
        "HeartbeatTimeout" -> HeartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "LifecycleHookName" -> LifecycleHookName.map { x => x.asInstanceOf[js.Any] },
        "LifecycleTransition" -> LifecycleTransition.map { x => x.asInstanceOf[js.Any] },
        "NotificationMetadata" -> NotificationMetadata.map { x => x.asInstanceOf[js.Any] },
        "NotificationTargetARN" -> NotificationTargetARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleHook]
    }
  }

  /**
   * <p>Describes a lifecycle hook, which tells Amazon EC2 Auto Scaling that you want to perform an action whenever it launches instances or whenever it terminates instances.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Lifecycle Hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
   */
  @js.native
  trait LifecycleHookSpecification extends js.Object {
    var LifecycleHookName: AsciiStringMaxLen255
    var LifecycleTransition: LifecycleTransition
    var DefaultResult: js.UndefOr[LifecycleActionResult]
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout]
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023]
    var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName]
    var RoleARN: js.UndefOr[ResourceName]
  }

  object LifecycleHookSpecification {
    def apply(
      LifecycleHookName: AsciiStringMaxLen255,
      LifecycleTransition: LifecycleTransition,
      DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined,
      HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
      NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
      NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined,
      RoleARN: js.UndefOr[ResourceName] = js.undefined): LifecycleHookSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any],
        "LifecycleTransition" -> LifecycleTransition.asInstanceOf[js.Any],
        "DefaultResult" -> DefaultResult.map { x => x.asInstanceOf[js.Any] },
        "HeartbeatTimeout" -> HeartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "NotificationMetadata" -> NotificationMetadata.map { x => x.asInstanceOf[js.Any] },
        "NotificationTargetARN" -> NotificationTargetARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleHookSpecification]
    }
  }

  object LifecycleStateEnum {
    val Pending = "Pending"
    val `Pending:Wait` = "Pending:Wait"
    val `Pending:Proceed` = "Pending:Proceed"
    val Quarantined = "Quarantined"
    val InService = "InService"
    val Terminating = "Terminating"
    val `Terminating:Wait` = "Terminating:Wait"
    val `Terminating:Proceed` = "Terminating:Proceed"
    val Terminated = "Terminated"
    val Detaching = "Detaching"
    val Detached = "Detached"
    val EnteringStandby = "EnteringStandby"
    val Standby = "Standby"

    val values = IndexedSeq(Pending, `Pending:Wait`, `Pending:Proceed`, Quarantined, InService, Terminating, `Terminating:Wait`, `Terminating:Proceed`, Terminated, Detaching, Detached, EnteringStandby, Standby)
  }

  /**
   * <p>Describes the state of a Classic Load Balancer.</p> <p>If you specify a load balancer when creating the Auto Scaling group, the state of the load balancer is <code>InService</code>.</p> <p>If you attach a load balancer to an existing Auto Scaling group, the initial state is <code>Adding</code>. The state transitions to <code>Added</code> after all instances in the group are registered with the load balancer. If Elastic Load Balancing health checks are enabled for the load balancer, the state transitions to <code>InService</code> after at least one instance in the group passes the health check. If EC2 health checks are enabled instead, the load balancer remains in the <code>Added</code> state.</p>
   */
  @js.native
  trait LoadBalancerState extends js.Object {
    var LoadBalancerName: js.UndefOr[XmlStringMaxLen255]
    var State: js.UndefOr[XmlStringMaxLen255]
  }

  object LoadBalancerState {
    def apply(
      LoadBalancerName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      State: js.UndefOr[XmlStringMaxLen255] = js.undefined): LoadBalancerState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerState]
    }
  }

  /**
   * <p>Describes the state of a target group.</p> <p>If you attach a target group to an existing Auto Scaling group, the initial state is <code>Adding</code>. The state transitions to <code>Added</code> after all Auto Scaling instances are registered with the target group. If Elastic Load Balancing health checks are enabled, the state transitions to <code>InService</code> after at least one Auto Scaling instance passes the health check. If EC2 health checks are enabled instead, the target group remains in the <code>Added</code> state.</p>
   */
  @js.native
  trait LoadBalancerTargetGroupState extends js.Object {
    var LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511]
    var State: js.UndefOr[XmlStringMaxLen255]
  }

  object LoadBalancerTargetGroupState {
    def apply(
      LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511] = js.undefined,
      State: js.UndefOr[XmlStringMaxLen255] = js.undefined): LoadBalancerTargetGroupState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerTargetGroupARN" -> LoadBalancerTargetGroupARN.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTargetGroupState]
    }
  }

  /**
   * <p>Describes a metric.</p>
   */
  @js.native
  trait MetricCollectionType extends js.Object {
    var Metric: js.UndefOr[XmlStringMaxLen255]
  }

  object MetricCollectionType {
    def apply(
      Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined): MetricCollectionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metric" -> Metric.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricCollectionType]
    }
  }

  /**
   * <p>Describes the dimension of a metric.</p>
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

  /**
   * <p>Describes a granularity of a metric.</p>
   */
  @js.native
  trait MetricGranularityType extends js.Object {
    var Granularity: js.UndefOr[XmlStringMaxLen255]
  }

  object MetricGranularityType {
    def apply(
      Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined): MetricGranularityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Granularity" -> Granularity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricGranularityType]
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
    val ASGAverageCPUUtilization = "ASGAverageCPUUtilization"
    val ASGAverageNetworkIn = "ASGAverageNetworkIn"
    val ASGAverageNetworkOut = "ASGAverageNetworkOut"
    val ALBRequestCountPerTarget = "ALBRequestCountPerTarget"

    val values = IndexedSeq(ASGAverageCPUUtilization, ASGAverageNetworkIn, ASGAverageNetworkOut, ALBRequestCountPerTarget)
  }

  /**
   * <p>Describes a mixed instances policy for an Auto Scaling group. With mixed instances, your Auto Scaling group can provision a combination of On-Demand Instances and Spot Instances across multiple instance types. For more information, see <a href="http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroup.html#asg-purchase-options">Using Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p> <p>When you create your Auto Scaling group, you can specify a launch configuration or template as a parameter for the top-level object, or you can specify a mixed instances policy, but not both at the same time.</p>
   */
  @js.native
  trait MixedInstancesPolicy extends js.Object {
    var InstancesDistribution: js.UndefOr[InstancesDistribution]
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  object MixedInstancesPolicy {
    def apply(
      InstancesDistribution: js.UndefOr[InstancesDistribution] = js.undefined,
      LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined): MixedInstancesPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstancesDistribution" -> InstancesDistribution.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MixedInstancesPolicy]
    }
  }

  /**
   * <p>Describes a notification.</p>
   */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var NotificationType: js.UndefOr[XmlStringMaxLen255]
    var TopicARN: js.UndefOr[ResourceName]
  }

  object NotificationConfiguration {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      NotificationType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      TopicARN: js.UndefOr[ResourceName] = js.undefined): NotificationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] },
        "NotificationType" -> NotificationType.map { x => x.asInstanceOf[js.Any] },
        "TopicARN" -> TopicARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfiguration]
    }
  }

  @js.native
  trait PoliciesType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingPolicies: js.UndefOr[ScalingPolicies]
  }

  object PoliciesType {
    def apply(
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined): PoliciesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScalingPolicies" -> ScalingPolicies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PoliciesType]
    }
  }

  /**
   * <p>Contains the output of PutScalingPolicy.</p>
   */
  @js.native
  trait PolicyARNType extends js.Object {
    var Alarms: js.UndefOr[Alarms]
    var PolicyARN: js.UndefOr[ResourceName]
  }

  object PolicyARNType {
    def apply(
      Alarms: js.UndefOr[Alarms] = js.undefined,
      PolicyARN: js.UndefOr[ResourceName] = js.undefined): PolicyARNType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alarms" -> Alarms.map { x => x.asInstanceOf[js.Any] },
        "PolicyARN" -> PolicyARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyARNType]
    }
  }

  /**
   * <p>Configures a predefined metric for a target tracking policy.</p>
   */
  @js.native
  trait PredefinedMetricSpecification extends js.Object {
    var PredefinedMetricType: MetricType
    var ResourceLabel: js.UndefOr[XmlStringMaxLen1023]
  }

  object PredefinedMetricSpecification {
    def apply(
      PredefinedMetricType: MetricType,
      ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined): PredefinedMetricSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PredefinedMetricType" -> PredefinedMetricType.asInstanceOf[js.Any],
        "ResourceLabel" -> ResourceLabel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PredefinedMetricSpecification]
    }
  }

  /**
   * <p>Describes a process type.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html#process-types">Scaling Processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
   */
  @js.native
  trait ProcessType extends js.Object {
    var ProcessName: XmlStringMaxLen255
  }

  object ProcessType {
    def apply(
      ProcessName: XmlStringMaxLen255): ProcessType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessName" -> ProcessName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessType]
    }
  }

  @js.native
  trait ProcessesType extends js.Object {
    var Processes: js.UndefOr[Processes]
  }

  object ProcessesType {
    def apply(
      Processes: js.UndefOr[Processes] = js.undefined): ProcessesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Processes" -> Processes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessesType]
    }
  }

  @js.native
  trait PutLifecycleHookAnswer extends js.Object {

  }

  object PutLifecycleHookAnswer {
    def apply(): PutLifecycleHookAnswer = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecycleHookAnswer]
    }
  }

  @js.native
  trait PutLifecycleHookType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleHookName: AsciiStringMaxLen255
    var DefaultResult: js.UndefOr[LifecycleActionResult]
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout]
    var LifecycleTransition: js.UndefOr[LifecycleTransition]
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023]
    var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName]
    var RoleARN: js.UndefOr[ResourceName]
  }

  object PutLifecycleHookType {
    def apply(
      AutoScalingGroupName: ResourceName,
      LifecycleHookName: AsciiStringMaxLen255,
      DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined,
      HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
      LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined,
      NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
      NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined,
      RoleARN: js.UndefOr[ResourceName] = js.undefined): PutLifecycleHookType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any],
        "DefaultResult" -> DefaultResult.map { x => x.asInstanceOf[js.Any] },
        "HeartbeatTimeout" -> HeartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "LifecycleTransition" -> LifecycleTransition.map { x => x.asInstanceOf[js.Any] },
        "NotificationMetadata" -> NotificationMetadata.map { x => x.asInstanceOf[js.Any] },
        "NotificationTargetARN" -> NotificationTargetARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecycleHookType]
    }
  }

  @js.native
  trait PutNotificationConfigurationType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var NotificationTypes: AutoScalingNotificationTypes
    var TopicARN: ResourceName
  }

  object PutNotificationConfigurationType {
    def apply(
      AutoScalingGroupName: ResourceName,
      NotificationTypes: AutoScalingNotificationTypes,
      TopicARN: ResourceName): PutNotificationConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "NotificationTypes" -> NotificationTypes.asInstanceOf[js.Any],
        "TopicARN" -> TopicARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutNotificationConfigurationType]
    }
  }

  @js.native
  trait PutScalingPolicyType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var PolicyName: XmlStringMaxLen255
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
    var Cooldown: js.UndefOr[Cooldown]
    var EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup]
    var MetricAggregationType: js.UndefOr[XmlStringMaxLen32]
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude]
    var MinAdjustmentStep: js.UndefOr[MinAdjustmentStep]
    var PolicyType: js.UndefOr[XmlStringMaxLen64]
    var ScalingAdjustment: js.UndefOr[PolicyIncrement]
    var StepAdjustments: js.UndefOr[StepAdjustments]
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  object PutScalingPolicyType {
    def apply(
      AutoScalingGroupName: ResourceName,
      PolicyName: XmlStringMaxLen255,
      AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Cooldown: js.UndefOr[Cooldown] = js.undefined,
      EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined,
      MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
      MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined,
      PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined,
      ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
      StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined,
      TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined): PutScalingPolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "AdjustmentType" -> AdjustmentType.map { x => x.asInstanceOf[js.Any] },
        "Cooldown" -> Cooldown.map { x => x.asInstanceOf[js.Any] },
        "EstimatedInstanceWarmup" -> EstimatedInstanceWarmup.map { x => x.asInstanceOf[js.Any] },
        "MetricAggregationType" -> MetricAggregationType.map { x => x.asInstanceOf[js.Any] },
        "MinAdjustmentMagnitude" -> MinAdjustmentMagnitude.map { x => x.asInstanceOf[js.Any] },
        "MinAdjustmentStep" -> MinAdjustmentStep.map { x => x.asInstanceOf[js.Any] },
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] },
        "ScalingAdjustment" -> ScalingAdjustment.map { x => x.asInstanceOf[js.Any] },
        "StepAdjustments" -> StepAdjustments.map { x => x.asInstanceOf[js.Any] },
        "TargetTrackingConfiguration" -> TargetTrackingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyType]
    }
  }

  @js.native
  trait PutScheduledUpdateGroupActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScheduledActionName: XmlStringMaxLen255
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var EndTime: js.UndefOr[TimestampType]
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize]
    var MinSize: js.UndefOr[AutoScalingGroupMinSize]
    var Recurrence: js.UndefOr[XmlStringMaxLen255]
    var StartTime: js.UndefOr[TimestampType]
    var Time: js.UndefOr[TimestampType]
  }

  object PutScheduledUpdateGroupActionType {
    def apply(
      AutoScalingGroupName: ResourceName,
      ScheduledActionName: XmlStringMaxLen255,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
      MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
      Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      Time: js.UndefOr[TimestampType] = js.undefined): PutScheduledUpdateGroupActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "DesiredCapacity" -> DesiredCapacity.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxSize" -> MaxSize.map { x => x.asInstanceOf[js.Any] },
        "MinSize" -> MinSize.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Time" -> Time.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScheduledUpdateGroupActionType]
    }
  }

  @js.native
  trait RecordLifecycleActionHeartbeatAnswer extends js.Object {

  }

  object RecordLifecycleActionHeartbeatAnswer {
    def apply(): RecordLifecycleActionHeartbeatAnswer = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordLifecycleActionHeartbeatAnswer]
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
    def apply(
      AutoScalingGroupName: ResourceName,
      LifecycleHookName: AsciiStringMaxLen255,
      InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
      LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined): RecordLifecycleActionHeartbeatType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName" -> LifecycleHookName.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "LifecycleActionToken" -> LifecycleActionToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordLifecycleActionHeartbeatType]
    }
  }

  object ScalingActivityStatusCodeEnum {
    val PendingSpotBidPlacement = "PendingSpotBidPlacement"
    val WaitingForSpotInstanceRequestId = "WaitingForSpotInstanceRequestId"
    val WaitingForSpotInstanceId = "WaitingForSpotInstanceId"
    val WaitingForInstanceId = "WaitingForInstanceId"
    val PreInService = "PreInService"
    val InProgress = "InProgress"
    val WaitingForELBConnectionDraining = "WaitingForELBConnectionDraining"
    val MidLifecycleAction = "MidLifecycleAction"
    val WaitingForInstanceWarmup = "WaitingForInstanceWarmup"
    val Successful = "Successful"
    val Failed = "Failed"
    val Cancelled = "Cancelled"

    val values = IndexedSeq(PendingSpotBidPlacement, WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, WaitingForELBConnectionDraining, MidLifecycleAction, WaitingForInstanceWarmup, Successful, Failed, Cancelled)
  }

  /**
   * <p>Describes a scaling policy.</p>
   */
  @js.native
  trait ScalingPolicy extends js.Object {
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
    var Alarms: js.UndefOr[Alarms]
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255]
    var Cooldown: js.UndefOr[Cooldown]
    var EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup]
    var MetricAggregationType: js.UndefOr[XmlStringMaxLen32]
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude]
    var MinAdjustmentStep: js.UndefOr[MinAdjustmentStep]
    var PolicyARN: js.UndefOr[ResourceName]
    var PolicyName: js.UndefOr[XmlStringMaxLen255]
    var PolicyType: js.UndefOr[XmlStringMaxLen64]
    var ScalingAdjustment: js.UndefOr[PolicyIncrement]
    var StepAdjustments: js.UndefOr[StepAdjustments]
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  object ScalingPolicy {
    def apply(
      AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Alarms: js.UndefOr[Alarms] = js.undefined,
      AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Cooldown: js.UndefOr[Cooldown] = js.undefined,
      EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined,
      MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined,
      MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined,
      PolicyARN: js.UndefOr[ResourceName] = js.undefined,
      PolicyName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined,
      ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
      StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined,
      TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined): ScalingPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdjustmentType" -> AdjustmentType.map { x => x.asInstanceOf[js.Any] },
        "Alarms" -> Alarms.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] },
        "Cooldown" -> Cooldown.map { x => x.asInstanceOf[js.Any] },
        "EstimatedInstanceWarmup" -> EstimatedInstanceWarmup.map { x => x.asInstanceOf[js.Any] },
        "MetricAggregationType" -> MetricAggregationType.map { x => x.asInstanceOf[js.Any] },
        "MinAdjustmentMagnitude" -> MinAdjustmentMagnitude.map { x => x.asInstanceOf[js.Any] },
        "MinAdjustmentStep" -> MinAdjustmentStep.map { x => x.asInstanceOf[js.Any] },
        "PolicyARN" -> PolicyARN.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] },
        "ScalingAdjustment" -> ScalingAdjustment.map { x => x.asInstanceOf[js.Any] },
        "StepAdjustments" -> StepAdjustments.map { x => x.asInstanceOf[js.Any] },
        "TargetTrackingConfiguration" -> TargetTrackingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingPolicy]
    }
  }

  @js.native
  trait ScalingProcessQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScalingProcesses: js.UndefOr[ProcessNames]
  }

  object ScalingProcessQuery {
    def apply(
      AutoScalingGroupName: ResourceName,
      ScalingProcesses: js.UndefOr[ProcessNames] = js.undefined): ScalingProcessQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScalingProcesses" -> ScalingProcesses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingProcessQuery]
    }
  }

  @js.native
  trait ScheduledActionsType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions]
  }

  object ScheduledActionsType {
    def apply(
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions] = js.undefined): ScheduledActionsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScheduledUpdateGroupActions" -> ScheduledUpdateGroupActions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledActionsType]
    }
  }

  /**
   * <p>Describes a scheduled scaling action. Used in response to <a>DescribeScheduledActions</a>. </p>
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
  }

  object ScheduledUpdateGroupAction {
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
      Time: js.UndefOr[TimestampType] = js.undefined): ScheduledUpdateGroupAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.map { x => x.asInstanceOf[js.Any] },
        "DesiredCapacity" -> DesiredCapacity.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxSize" -> MaxSize.map { x => x.asInstanceOf[js.Any] },
        "MinSize" -> MinSize.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionARN" -> ScheduledActionARN.map { x => x.asInstanceOf[js.Any] },
        "ScheduledActionName" -> ScheduledActionName.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Time" -> Time.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledUpdateGroupAction]
    }
  }

  /**
   * <p>Describes one or more scheduled scaling action updates for a specified Auto Scaling group. Used in combination with <a>BatchPutScheduledUpdateGroupAction</a>. </p> <p>When updating a scheduled scaling action, all optional parameters are left unchanged if not specified. </p>
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
  }

  object ScheduledUpdateGroupActionRequest {
    def apply(
      ScheduledActionName: XmlStringMaxLen255,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
      MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
      Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined): ScheduledUpdateGroupActionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "DesiredCapacity" -> DesiredCapacity.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxSize" -> MaxSize.map { x => x.asInstanceOf[js.Any] },
        "MinSize" -> MinSize.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledUpdateGroupActionRequest]
    }
  }

  @js.native
  trait SetDesiredCapacityType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var HonorCooldown: js.UndefOr[HonorCooldown]
  }

  object SetDesiredCapacityType {
    def apply(
      AutoScalingGroupName: ResourceName,
      DesiredCapacity: AutoScalingGroupDesiredCapacity,
      HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined): SetDesiredCapacityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "DesiredCapacity" -> DesiredCapacity.asInstanceOf[js.Any],
        "HonorCooldown" -> HonorCooldown.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDesiredCapacityType]
    }
  }

  @js.native
  trait SetInstanceHealthQuery extends js.Object {
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen19
    var ShouldRespectGracePeriod: js.UndefOr[ShouldRespectGracePeriod]
  }

  object SetInstanceHealthQuery {
    def apply(
      HealthStatus: XmlStringMaxLen32,
      InstanceId: XmlStringMaxLen19,
      ShouldRespectGracePeriod: js.UndefOr[ShouldRespectGracePeriod] = js.undefined): SetInstanceHealthQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthStatus" -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ShouldRespectGracePeriod" -> ShouldRespectGracePeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetInstanceHealthQuery]
    }
  }

  @js.native
  trait SetInstanceProtectionAnswer extends js.Object {

  }

  object SetInstanceProtectionAnswer {
    def apply(): SetInstanceProtectionAnswer = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetInstanceProtectionAnswer]
    }
  }

  @js.native
  trait SetInstanceProtectionQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var InstanceIds: InstanceIds
    var ProtectedFromScaleIn: ProtectedFromScaleIn
  }

  object SetInstanceProtectionQuery {
    def apply(
      AutoScalingGroupName: ResourceName,
      InstanceIds: InstanceIds,
      ProtectedFromScaleIn: ProtectedFromScaleIn): SetInstanceProtectionQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "InstanceIds" -> InstanceIds.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetInstanceProtectionQuery]
    }
  }

  /**
   * <p>Describes an adjustment based on the difference between the value of the aggregated CloudWatch metric and the breach threshold that you've defined for the alarm.</p> <p>For the following examples, suppose that you have an alarm with a breach threshold of 50:</p> <ul> <li> <p>To trigger the adjustment when the metric is greater than or equal to 50 and less than 60, specify a lower bound of 0 and an upper bound of 10.</p> </li> <li> <p>To trigger the adjustment when the metric is greater than 40 and less than or equal to 50, specify a lower bound of -10 and an upper bound of 0.</p> </li> </ul> <p>There are a few rules for the step adjustments for your step policy:</p> <ul> <li> <p>The ranges of your step adjustments can't overlap or have a gap.</p> </li> <li> <p>At most, one step adjustment can have a null lower bound. If one step adjustment has a negative lower bound, then there must be a step adjustment with a null lower bound.</p> </li> <li> <p>At most, one step adjustment can have a null upper bound. If one step adjustment has a positive upper bound, then there must be a step adjustment with a null upper bound.</p> </li> <li> <p>The upper and lower bound can't be null in the same step adjustment.</p> </li> </ul>
   */
  @js.native
  trait StepAdjustment extends js.Object {
    var ScalingAdjustment: PolicyIncrement
    var MetricIntervalLowerBound: js.UndefOr[MetricScale]
    var MetricIntervalUpperBound: js.UndefOr[MetricScale]
  }

  object StepAdjustment {
    def apply(
      ScalingAdjustment: PolicyIncrement,
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
   * <p>Describes an automatic scaling process that has been suspended. For more information, see <a>ProcessType</a>.</p>
   */
  @js.native
  trait SuspendedProcess extends js.Object {
    var ProcessName: js.UndefOr[XmlStringMaxLen255]
    var SuspensionReason: js.UndefOr[XmlStringMaxLen255]
  }

  object SuspendedProcess {
    def apply(
      ProcessName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.undefined): SuspendedProcess = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessName" -> ProcessName.map { x => x.asInstanceOf[js.Any] },
        "SuspensionReason" -> SuspensionReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuspendedProcess]
    }
  }

  /**
   * <p>Describes a tag for an Auto Scaling group.</p>
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
    def apply(
      Key: TagKey,
      PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined,
      ResourceId: js.UndefOr[XmlString] = js.undefined,
      ResourceType: js.UndefOr[XmlString] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "PropagateAtLaunch" -> PropagateAtLaunch.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Describes a tag for an Auto Scaling group.</p>
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
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined,
      ResourceId: js.UndefOr[XmlString] = js.undefined,
      ResourceType: js.UndefOr[XmlString] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): TagDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "PropagateAtLaunch" -> PropagateAtLaunch.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDescription]
    }
  }

  @js.native
  trait TagsType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var Tags: js.UndefOr[TagDescriptionList]
  }

  object TagsType {
    def apply(
      NextToken: js.UndefOr[XmlString] = js.undefined,
      Tags: js.UndefOr[TagDescriptionList] = js.undefined): TagsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagsType]
    }
  }

  /**
   * <p>Represents a target tracking policy configuration.</p>
   */
  @js.native
  trait TargetTrackingConfiguration extends js.Object {
    var TargetValue: MetricScale
    var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification]
    var DisableScaleIn: js.UndefOr[DisableScaleIn]
    var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification]
  }

  object TargetTrackingConfiguration {
    def apply(
      TargetValue: MetricScale,
      CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification] = js.undefined,
      DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
      PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined): TargetTrackingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetValue" -> TargetValue.asInstanceOf[js.Any],
        "CustomizedMetricSpecification" -> CustomizedMetricSpecification.map { x => x.asInstanceOf[js.Any] },
        "DisableScaleIn" -> DisableScaleIn.map { x => x.asInstanceOf[js.Any] },
        "PredefinedMetricSpecification" -> PredefinedMetricSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetTrackingConfiguration]
    }
  }

  @js.native
  trait TerminateInstanceInAutoScalingGroupType extends js.Object {
    var InstanceId: XmlStringMaxLen19
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }

  object TerminateInstanceInAutoScalingGroupType {
    def apply(
      InstanceId: XmlStringMaxLen19,
      ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity): TerminateInstanceInAutoScalingGroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateInstanceInAutoScalingGroupType]
    }
  }

  @js.native
  trait UpdateAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var DefaultCooldown: js.UndefOr[Cooldown]
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod]
    var HealthCheckType: js.UndefOr[XmlStringMaxLen32]
    var LaunchConfigurationName: js.UndefOr[ResourceName]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
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
    def apply(
      AutoScalingGroupName: ResourceName,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      DefaultCooldown: js.UndefOr[Cooldown] = js.undefined,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
      HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined,
      LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
      MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
      MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
      MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined,
      NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined,
      PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined,
      TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
      VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined): UpdateAutoScalingGroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "DefaultCooldown" -> DefaultCooldown.map { x => x.asInstanceOf[js.Any] },
        "DesiredCapacity" -> DesiredCapacity.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckGracePeriod" -> HealthCheckGracePeriod.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckType" -> HealthCheckType.map { x => x.asInstanceOf[js.Any] },
        "LaunchConfigurationName" -> LaunchConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "LaunchTemplate" -> LaunchTemplate.map { x => x.asInstanceOf[js.Any] },
        "MaxSize" -> MaxSize.map { x => x.asInstanceOf[js.Any] },
        "MinSize" -> MinSize.map { x => x.asInstanceOf[js.Any] },
        "MixedInstancesPolicy" -> MixedInstancesPolicy.map { x => x.asInstanceOf[js.Any] },
        "NewInstancesProtectedFromScaleIn" -> NewInstancesProtectedFromScaleIn.map { x => x.asInstanceOf[js.Any] },
        "PlacementGroup" -> PlacementGroup.map { x => x.asInstanceOf[js.Any] },
        "ServiceLinkedRoleARN" -> ServiceLinkedRoleARN.map { x => x.asInstanceOf[js.Any] },
        "TerminationPolicies" -> TerminationPolicies.map { x => x.asInstanceOf[js.Any] },
        "VPCZoneIdentifier" -> VPCZoneIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAutoScalingGroupType]
    }
  }
}
