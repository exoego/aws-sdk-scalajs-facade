package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object autoscaling {
  type Activities = js.Array[Activity]
  type ActivityIds = js.Array[XmlString]
  type AdjustmentTypes = js.Array[AdjustmentType]
  type Alarms = js.Array[Alarm]
  type AsciiStringMaxLen255 = String
  type AssociatePublicIpAddress = Boolean
  type AutoScalingGroupDesiredCapacity = Integer
  type AutoScalingGroupMaxSize = Integer
  type AutoScalingGroupMinSize = Integer
  type AutoScalingGroupNames = js.Array[ResourceName]
  type AutoScalingGroups = js.Array[AutoScalingGroup]
  type AutoScalingInstances = js.Array[AutoScalingInstanceDetails]
  type AutoScalingNotificationTypes = js.Array[XmlStringMaxLen255]
  type AvailabilityZones = js.Array[XmlStringMaxLen255]
  type BlockDeviceEbsDeleteOnTermination = Boolean
  type BlockDeviceEbsIops = Integer
  type BlockDeviceEbsVolumeSize = Integer
  type BlockDeviceEbsVolumeType = String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type ClassicLinkVPCSecurityGroups = js.Array[XmlStringMaxLen255]
  type Cooldown = Integer
  type EbsOptimized = Boolean
  type EnabledMetrics = js.Array[EnabledMetric]
  type Filters = js.Array[Filter]
  type ForceDelete = Boolean
  type GlobalTimeout = Integer
  type HealthCheckGracePeriod = Integer
  type HeartbeatTimeout = Integer
  type HonorCooldown = Boolean
  type InstanceIds = js.Array[XmlStringMaxLen16]
  type Instances = js.Array[Instance]
  type LaunchConfigurationNames = js.Array[ResourceName]
  type LaunchConfigurations = js.Array[LaunchConfiguration]
  type LifecycleActionResult = String
  type LifecycleActionToken = String
  type LifecycleHookNames = js.Array[AsciiStringMaxLen255]
  type LifecycleHooks = js.Array[LifecycleHook]
  type LifecycleState = String
  type LifecycleTransition = String
  type LoadBalancerNames = js.Array[XmlStringMaxLen255]
  type MaxNumberOfAutoScalingGroups = Integer
  type MaxNumberOfLaunchConfigurations = Integer
  type MaxRecords = Integer
  type MetricCollectionTypes = js.Array[MetricCollectionType]
  type MetricGranularityTypes = js.Array[MetricGranularityType]
  type Metrics = js.Array[XmlStringMaxLen255]
  type MinAdjustmentStep = Integer
  type MonitoringEnabled = Boolean
  type NoDevice = Boolean
  type NotificationConfigurations = js.Array[NotificationConfiguration]
  type PolicyIncrement = Integer
  type PolicyNames = js.Array[ResourceName]
  type ProcessNames = js.Array[XmlStringMaxLen255]
  type Processes = js.Array[ProcessType]
  type Progress = Integer
  type PropagateAtLaunch = Boolean
  type ResourceName = String
  type ScalingActivityStatusCode = String
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionNames = js.Array[ResourceName]
  type ScheduledUpdateGroupActions = js.Array[ScheduledUpdateGroupAction]
  type SecurityGroups = js.Array[XmlString]
  type ShouldDecrementDesiredCapacity = Boolean
  type ShouldRespectGracePeriod = Boolean
  type SpotPrice = String
  type SuspendedProcesses = js.Array[SuspendedProcess]
  type TagDescriptionList = js.Array[TagDescription]
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TerminationPolicies = js.Array[XmlStringMaxLen1600]
  type TimestampType = js.Date
  type Values = js.Array[XmlString]
  type XmlString = String
  type XmlStringMaxLen1023 = String
  type XmlStringMaxLen16 = String
  type XmlStringMaxLen1600 = String
  type XmlStringMaxLen255 = String
  type XmlStringMaxLen32 = String
  type XmlStringMaxLen64 = String
  type XmlStringUserData = String
}

package autoscaling {
  @js.native
  trait Autoscaling extends js.Object {
    def attachInstances(params: AttachInstancesQuery, callback: Callback[js.Object]): Unit = js.native
    def attachInstances(params: AttachInstancesQuery): Request[js.Object] = js.native
    def completeLifecycleAction(params: CompleteLifecycleActionType, callback: Callback[CompleteLifecycleActionAnswer]): Unit = js.native
    def completeLifecycleAction(params: CompleteLifecycleActionType): Request[CompleteLifecycleActionAnswer] = js.native
    def createAutoScalingGroup(params: CreateAutoScalingGroupType, callback: Callback[js.Object]): Unit = js.native
    def createAutoScalingGroup(params: CreateAutoScalingGroupType): Request[js.Object] = js.native
    def createLaunchConfiguration(params: CreateLaunchConfigurationType, callback: Callback[js.Object]): Unit = js.native
    def createLaunchConfiguration(params: CreateLaunchConfigurationType): Request[js.Object] = js.native
    def createOrUpdateTags(params: CreateOrUpdateTagsType, callback: Callback[js.Object]): Unit = js.native
    def createOrUpdateTags(params: CreateOrUpdateTagsType): Request[js.Object] = js.native
    def deleteAutoScalingGroup(params: DeleteAutoScalingGroupType, callback: Callback[js.Object]): Unit = js.native
    def deleteAutoScalingGroup(params: DeleteAutoScalingGroupType): Request[js.Object] = js.native
    def deleteLaunchConfiguration(params: LaunchConfigurationNameType, callback: Callback[js.Object]): Unit = js.native
    def deleteLaunchConfiguration(params: LaunchConfigurationNameType): Request[js.Object] = js.native
    def deleteLifecycleHook(params: DeleteLifecycleHookType, callback: Callback[DeleteLifecycleHookAnswer]): Unit = js.native
    def deleteLifecycleHook(params: DeleteLifecycleHookType): Request[DeleteLifecycleHookAnswer] = js.native
    def deleteNotificationConfiguration(params: DeleteNotificationConfigurationType, callback: Callback[js.Object]): Unit = js.native
    def deleteNotificationConfiguration(params: DeleteNotificationConfigurationType): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyType, callback: Callback[js.Object]): Unit = js.native
    def deletePolicy(params: DeletePolicyType): Request[js.Object] = js.native
    def deleteScheduledAction(params: DeleteScheduledActionType, callback: Callback[js.Object]): Unit = js.native
    def deleteScheduledAction(params: DeleteScheduledActionType): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsType, callback: Callback[js.Object]): Unit = js.native
    def deleteTags(params: DeleteTagsType): Request[js.Object] = js.native
    def describeAccountLimits(callback: Callback[DescribeAccountLimitsAnswer]): Unit = js.native
    def describeAccountLimits(): Request[DescribeAccountLimitsAnswer] = js.native
    def describeAdjustmentTypes(callback: Callback[DescribeAdjustmentTypesAnswer]): Unit = js.native
    def describeAdjustmentTypes(): Request[DescribeAdjustmentTypesAnswer] = js.native
    def describeAutoScalingGroups(params: AutoScalingGroupNamesType, callback: Callback[AutoScalingGroupsType]): Unit = js.native
    def describeAutoScalingGroups(params: AutoScalingGroupNamesType): Request[AutoScalingGroupsType] = js.native
    def describeAutoScalingInstances(params: DescribeAutoScalingInstancesType, callback: Callback[AutoScalingInstancesType]): Unit = js.native
    def describeAutoScalingInstances(params: DescribeAutoScalingInstancesType): Request[AutoScalingInstancesType] = js.native
    def describeAutoScalingNotificationTypes(callback: Callback[DescribeAutoScalingNotificationTypesAnswer]): Unit = js.native
    def describeAutoScalingNotificationTypes(): Request[DescribeAutoScalingNotificationTypesAnswer] = js.native
    def describeLaunchConfigurations(params: LaunchConfigurationNamesType, callback: Callback[LaunchConfigurationsType]): Unit = js.native
    def describeLaunchConfigurations(params: LaunchConfigurationNamesType): Request[LaunchConfigurationsType] = js.native
    def describeLifecycleHookTypes(callback: Callback[DescribeLifecycleHookTypesAnswer]): Unit = js.native
    def describeLifecycleHookTypes(): Request[DescribeLifecycleHookTypesAnswer] = js.native
    def describeLifecycleHooks(params: DescribeLifecycleHooksType, callback: Callback[DescribeLifecycleHooksAnswer]): Unit = js.native
    def describeLifecycleHooks(params: DescribeLifecycleHooksType): Request[DescribeLifecycleHooksAnswer] = js.native
    def describeMetricCollectionTypes(callback: Callback[DescribeMetricCollectionTypesAnswer]): Unit = js.native
    def describeMetricCollectionTypes(): Request[DescribeMetricCollectionTypesAnswer] = js.native
    def describeNotificationConfigurations(params: DescribeNotificationConfigurationsType, callback: Callback[DescribeNotificationConfigurationsAnswer]): Unit = js.native
    def describeNotificationConfigurations(params: DescribeNotificationConfigurationsType): Request[DescribeNotificationConfigurationsAnswer] = js.native
    def describePolicies(params: DescribePoliciesType, callback: Callback[PoliciesType]): Unit = js.native
    def describePolicies(params: DescribePoliciesType): Request[PoliciesType] = js.native
    def describeScalingActivities(params: DescribeScalingActivitiesType, callback: Callback[ActivitiesType]): Unit = js.native
    def describeScalingActivities(params: DescribeScalingActivitiesType): Request[ActivitiesType] = js.native
    def describeScalingProcessTypes(callback: Callback[ProcessesType]): Unit = js.native
    def describeScalingProcessTypes(): Request[ProcessesType] = js.native
    def describeScheduledActions(params: DescribeScheduledActionsType, callback: Callback[ScheduledActionsType]): Unit = js.native
    def describeScheduledActions(params: DescribeScheduledActionsType): Request[ScheduledActionsType] = js.native
    def describeTags(params: DescribeTagsType, callback: Callback[TagsType]): Unit = js.native
    def describeTags(params: DescribeTagsType): Request[TagsType] = js.native
    def describeTerminationPolicyTypes(callback: Callback[DescribeTerminationPolicyTypesAnswer]): Unit = js.native
    def describeTerminationPolicyTypes(): Request[DescribeTerminationPolicyTypesAnswer] = js.native
    def detachInstances(params: DetachInstancesQuery, callback: Callback[DetachInstancesAnswer]): Unit = js.native
    def detachInstances(params: DetachInstancesQuery): Request[DetachInstancesAnswer] = js.native
    def disableMetricsCollection(params: DisableMetricsCollectionQuery, callback: Callback[js.Object]): Unit = js.native
    def disableMetricsCollection(params: DisableMetricsCollectionQuery): Request[js.Object] = js.native
    def enableMetricsCollection(params: EnableMetricsCollectionQuery, callback: Callback[js.Object]): Unit = js.native
    def enableMetricsCollection(params: EnableMetricsCollectionQuery): Request[js.Object] = js.native
    def enterStandby(params: EnterStandbyQuery, callback: Callback[EnterStandbyAnswer]): Unit = js.native
    def enterStandby(params: EnterStandbyQuery): Request[EnterStandbyAnswer] = js.native
    def executePolicy(params: ExecutePolicyType, callback: Callback[js.Object]): Unit = js.native
    def executePolicy(params: ExecutePolicyType): Request[js.Object] = js.native
    def exitStandby(params: ExitStandbyQuery, callback: Callback[ExitStandbyAnswer]): Unit = js.native
    def exitStandby(params: ExitStandbyQuery): Request[ExitStandbyAnswer] = js.native
    def putLifecycleHook(params: PutLifecycleHookType, callback: Callback[PutLifecycleHookAnswer]): Unit = js.native
    def putLifecycleHook(params: PutLifecycleHookType): Request[PutLifecycleHookAnswer] = js.native
    def putNotificationConfiguration(params: PutNotificationConfigurationType, callback: Callback[js.Object]): Unit = js.native
    def putNotificationConfiguration(params: PutNotificationConfigurationType): Request[js.Object] = js.native
    def putScalingPolicy(params: PutScalingPolicyType, callback: Callback[PolicyARNType]): Unit = js.native
    def putScalingPolicy(params: PutScalingPolicyType): Request[PolicyARNType] = js.native
    def putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType, callback: Callback[js.Object]): Unit = js.native
    def putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType): Request[js.Object] = js.native
    def recordLifecycleActionHeartbeat(params: RecordLifecycleActionHeartbeatType, callback: Callback[RecordLifecycleActionHeartbeatAnswer]): Unit = js.native
    def recordLifecycleActionHeartbeat(params: RecordLifecycleActionHeartbeatType): Request[RecordLifecycleActionHeartbeatAnswer] = js.native
    def resumeProcesses(params: ScalingProcessQuery, callback: Callback[js.Object]): Unit = js.native
    def resumeProcesses(params: ScalingProcessQuery): Request[js.Object] = js.native
    def setDesiredCapacity(params: SetDesiredCapacityType, callback: Callback[js.Object]): Unit = js.native
    def setDesiredCapacity(params: SetDesiredCapacityType): Request[js.Object] = js.native
    def setInstanceHealth(params: SetInstanceHealthQuery, callback: Callback[js.Object]): Unit = js.native
    def setInstanceHealth(params: SetInstanceHealthQuery): Request[js.Object] = js.native
    def suspendProcesses(params: ScalingProcessQuery, callback: Callback[js.Object]): Unit = js.native
    def suspendProcesses(params: ScalingProcessQuery): Request[js.Object] = js.native
    def terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType, callback: Callback[ActivityType]): Unit = js.native
    def terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType): Request[ActivityType] = js.native
    def updateAutoScalingGroup(params: UpdateAutoScalingGroupType, callback: Callback[js.Object]): Unit = js.native
    def updateAutoScalingGroup(params: UpdateAutoScalingGroupType): Request[js.Object] = js.native
  }

  @js.native
  trait ActivitiesType extends js.Object {
    var Activities: Activities
    var NextToken: XmlString
  }

  object ActivitiesType {
    def apply(
      Activities: js.UndefOr[Activities] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): ActivitiesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Activities" -> Activities.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivitiesType]
    }
  }

  /**
   * <p>Describes a long-running process that represents a change to your Auto Scaling group, such as changing its size. This can also be a process to replace an instance, or a process to perform any other long-running operations.</p>
   */
  @js.native
  trait Activity extends js.Object {
    var StatusMessage: XmlStringMaxLen255
    var Cause: XmlStringMaxLen1023
    var AutoScalingGroupName: XmlStringMaxLen255
    var StatusCode: ScalingActivityStatusCode
    var Description: XmlString
    var StartTime: TimestampType
    var EndTime: TimestampType
    var Details: XmlString
    var ActivityId: XmlString
    var Progress: Progress
  }

  object Activity {
    def apply(
      StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Cause: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
      AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      StatusCode: js.UndefOr[ScalingActivityStatusCode] = js.undefined,
      Description: js.UndefOr[XmlString] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      Details: js.UndefOr[XmlString] = js.undefined,
      ActivityId: js.UndefOr[XmlString] = js.undefined,
      Progress: js.UndefOr[Progress] = js.undefined
    ): Activity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("Cause" -> Cause.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("StatusCode" -> StatusCode.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("Details" -> Details.map { x => x: js.Any }),
        ("ActivityId" -> ActivityId.map { x => x: js.Any }),
        ("Progress" -> Progress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Activity]
    }
  }

  @js.native
  trait ActivityType extends js.Object {
    var Activity: Activity
  }

  object ActivityType {
    def apply(
      Activity: js.UndefOr[Activity] = js.undefined
    ): ActivityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Activity" -> Activity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityType]
    }
  }

  /**
   * <p>Describes a policy adjustment type.</p>
   */
  @js.native
  trait AdjustmentType extends js.Object {
    var AdjustmentType: XmlStringMaxLen255
  }

  object AdjustmentType {
    def apply(
      AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): AdjustmentType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AdjustmentType" -> AdjustmentType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdjustmentType]
    }
  }

  /**
   * <p>Describes an alarm.</p>
   */
  @js.native
  trait Alarm extends js.Object {
    var AlarmName: XmlStringMaxLen255
    var AlarmARN: ResourceName
  }

  object Alarm {
    def apply(
      AlarmName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      AlarmARN: js.UndefOr[ResourceName] = js.undefined
    ): Alarm = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AlarmName" -> AlarmName.map { x => x: js.Any }),
        ("AlarmARN" -> AlarmARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alarm]
    }
  }

  /**
   * <p>You already have an Auto Scaling group or launch configuration with this name.</p>
   */
  @js.native
  trait AlreadyExistsFaultException extends js.Object {
    var message: XmlStringMaxLen255
  }

  @js.native
  trait AttachInstancesQuery extends js.Object {
    var InstanceIds: InstanceIds
    var AutoScalingGroupName: ResourceName
  }

  object AttachInstancesQuery {
    def apply(
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    ): AttachInstancesQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachInstancesQuery]
    }
  }

  /**
   * <p>Describes an Auto Scaling group.</p>
   */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var DefaultCooldown: Cooldown
    var CreatedTime: TimestampType
    var PlacementGroup: XmlStringMaxLen255
    var TerminationPolicies: TerminationPolicies
    var SuspendedProcesses: SuspendedProcesses
    var AutoScalingGroupName: XmlStringMaxLen255
    var LoadBalancerNames: LoadBalancerNames
    var EnabledMetrics: EnabledMetrics
    var AutoScalingGroupARN: ResourceName
    var HealthCheckType: XmlStringMaxLen32
    var VPCZoneIdentifier: XmlStringMaxLen255
    var MaxSize: AutoScalingGroupMaxSize
    var MinSize: AutoScalingGroupMinSize
    var Instances: Instances
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var Tags: TagDescriptionList
    var LaunchConfigurationName: XmlStringMaxLen255
    var HealthCheckGracePeriod: HealthCheckGracePeriod
    var Status: XmlStringMaxLen255
    var AvailabilityZones: AvailabilityZones
  }

  object AutoScalingGroup {
    def apply(
      DefaultCooldown: js.UndefOr[Cooldown] = js.undefined,
      CreatedTime: js.UndefOr[TimestampType] = js.undefined,
      PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
      SuspendedProcesses: js.UndefOr[SuspendedProcesses] = js.undefined,
      AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
      EnabledMetrics: js.UndefOr[EnabledMetrics] = js.undefined,
      AutoScalingGroupARN: js.UndefOr[ResourceName] = js.undefined,
      HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
      MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
      Instances: js.UndefOr[Instances] = js.undefined,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      Tags: js.UndefOr[TagDescriptionList] = js.undefined,
      LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
      Status: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): AutoScalingGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultCooldown" -> DefaultCooldown.map { x => x: js.Any }),
        ("CreatedTime" -> CreatedTime.map { x => x: js.Any }),
        ("PlacementGroup" -> PlacementGroup.map { x => x: js.Any }),
        ("TerminationPolicies" -> TerminationPolicies.map { x => x: js.Any }),
        ("SuspendedProcesses" -> SuspendedProcesses.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("LoadBalancerNames" -> LoadBalancerNames.map { x => x: js.Any }),
        ("EnabledMetrics" -> EnabledMetrics.map { x => x: js.Any }),
        ("AutoScalingGroupARN" -> AutoScalingGroupARN.map { x => x: js.Any }),
        ("HealthCheckType" -> HealthCheckType.map { x => x: js.Any }),
        ("VPCZoneIdentifier" -> VPCZoneIdentifier.map { x => x: js.Any }),
        ("MaxSize" -> MaxSize.map { x => x: js.Any }),
        ("MinSize" -> MinSize.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("DesiredCapacity" -> DesiredCapacity.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("LaunchConfigurationName" -> LaunchConfigurationName.map { x => x: js.Any }),
        ("HealthCheckGracePeriod" -> HealthCheckGracePeriod.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroup]
    }
  }

  @js.native
  trait AutoScalingGroupNamesType extends js.Object {
    var AutoScalingGroupNames: AutoScalingGroupNames
    var NextToken: XmlString
    var MaxRecords: MaxRecords
  }

  object AutoScalingGroupNamesType {
    def apply(
      AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    ): AutoScalingGroupNamesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupNames" -> AutoScalingGroupNames.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroupNamesType]
    }
  }

  @js.native
  trait AutoScalingGroupsType extends js.Object {
    var AutoScalingGroups: AutoScalingGroups
    var NextToken: XmlString
  }

  object AutoScalingGroupsType {
    def apply(
      AutoScalingGroups: js.UndefOr[AutoScalingGroups] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): AutoScalingGroupsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroups" -> AutoScalingGroups.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroupsType]
    }
  }

  /**
   * <p>Describes an EC2 instance associated with an Auto Scaling group.</p>
   */
  @js.native
  trait AutoScalingInstanceDetails extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var LifecycleState: XmlStringMaxLen32
    var AvailabilityZone: XmlStringMaxLen255
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen16
    var LaunchConfigurationName: XmlStringMaxLen255
  }

  object AutoScalingInstanceDetails {
    def apply(
      AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      LifecycleState: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      AvailabilityZone: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      HealthStatus: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      InstanceId: js.UndefOr[XmlStringMaxLen16] = js.undefined,
      LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): AutoScalingInstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("LifecycleState" -> LifecycleState.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("HealthStatus" -> HealthStatus.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("LaunchConfigurationName" -> LaunchConfigurationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingInstanceDetails]
    }
  }

  @js.native
  trait AutoScalingInstancesType extends js.Object {
    var AutoScalingInstances: AutoScalingInstances
    var NextToken: XmlString
  }

  object AutoScalingInstancesType {
    def apply(
      AutoScalingInstances: js.UndefOr[AutoScalingInstances] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): AutoScalingInstancesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingInstances" -> AutoScalingInstances.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingInstancesType]
    }
  }

  /**
   * <p>Describes a block device mapping.</p>
   */
  @js.native
  trait BlockDeviceMapping extends js.Object {
    var VirtualName: XmlStringMaxLen255
    var DeviceName: XmlStringMaxLen255
    var Ebs: Ebs
    var NoDevice: NoDevice
  }

  object BlockDeviceMapping {
    def apply(
      VirtualName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      DeviceName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Ebs: js.UndefOr[Ebs] = js.undefined,
      NoDevice: js.UndefOr[NoDevice] = js.undefined
    ): BlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VirtualName" -> VirtualName.map { x => x: js.Any }),
        ("DeviceName" -> DeviceName.map { x => x: js.Any }),
        ("Ebs" -> Ebs.map { x => x: js.Any }),
        ("NoDevice" -> NoDevice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlockDeviceMapping]
    }
  }

  @js.native
  trait CompleteLifecycleActionAnswer extends js.Object {

  }

  object CompleteLifecycleActionAnswer {
    def apply(

    ): CompleteLifecycleActionAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteLifecycleActionAnswer]
    }
  }

  @js.native
  trait CompleteLifecycleActionType extends js.Object {
    var LifecycleHookName: AsciiStringMaxLen255
    var AutoScalingGroupName: ResourceName
    var LifecycleActionToken: LifecycleActionToken
    var LifecycleActionResult: LifecycleActionResult
  }

  object CompleteLifecycleActionType {
    def apply(
      LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined,
      LifecycleActionResult: js.UndefOr[LifecycleActionResult] = js.undefined
    ): CompleteLifecycleActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LifecycleHookName" -> LifecycleHookName.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("LifecycleActionToken" -> LifecycleActionToken.map { x => x: js.Any }),
        ("LifecycleActionResult" -> LifecycleActionResult.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteLifecycleActionType]
    }
  }

  @js.native
  trait CreateAutoScalingGroupType extends js.Object {
    var DefaultCooldown: Cooldown
    var PlacementGroup: XmlStringMaxLen255
    var TerminationPolicies: TerminationPolicies
    var AutoScalingGroupName: XmlStringMaxLen255
    var LoadBalancerNames: LoadBalancerNames
    var HealthCheckType: XmlStringMaxLen32
    var VPCZoneIdentifier: XmlStringMaxLen255
    var MaxSize: AutoScalingGroupMaxSize
    var MinSize: AutoScalingGroupMinSize
    var InstanceId: XmlStringMaxLen16
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var Tags: Tags
    var LaunchConfigurationName: ResourceName
    var HealthCheckGracePeriod: HealthCheckGracePeriod
    var AvailabilityZones: AvailabilityZones
  }

  object CreateAutoScalingGroupType {
    def apply(
      DefaultCooldown: js.UndefOr[Cooldown] = js.undefined,
      PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
      AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
      HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
      MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
      InstanceId: js.UndefOr[XmlStringMaxLen16] = js.undefined,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined,
      HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): CreateAutoScalingGroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultCooldown" -> DefaultCooldown.map { x => x: js.Any }),
        ("PlacementGroup" -> PlacementGroup.map { x => x: js.Any }),
        ("TerminationPolicies" -> TerminationPolicies.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("LoadBalancerNames" -> LoadBalancerNames.map { x => x: js.Any }),
        ("HealthCheckType" -> HealthCheckType.map { x => x: js.Any }),
        ("VPCZoneIdentifier" -> VPCZoneIdentifier.map { x => x: js.Any }),
        ("MaxSize" -> MaxSize.map { x => x: js.Any }),
        ("MinSize" -> MinSize.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("DesiredCapacity" -> DesiredCapacity.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("LaunchConfigurationName" -> LaunchConfigurationName.map { x => x: js.Any }),
        ("HealthCheckGracePeriod" -> HealthCheckGracePeriod.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAutoScalingGroupType]
    }
  }

  @js.native
  trait CreateLaunchConfigurationType extends js.Object {
    var RamdiskId: XmlStringMaxLen255
    var BlockDeviceMappings: BlockDeviceMappings
    var ClassicLinkVPCId: XmlStringMaxLen255
    var ImageId: XmlStringMaxLen255
    var EbsOptimized: EbsOptimized
    var UserData: XmlStringUserData
    var SecurityGroups: SecurityGroups
    var KernelId: XmlStringMaxLen255
    var ClassicLinkVPCSecurityGroups: ClassicLinkVPCSecurityGroups
    var KeyName: XmlStringMaxLen255
    var InstanceType: XmlStringMaxLen255
    var InstanceId: XmlStringMaxLen16
    var AssociatePublicIpAddress: AssociatePublicIpAddress
    var SpotPrice: SpotPrice
    var PlacementTenancy: XmlStringMaxLen64
    var IamInstanceProfile: XmlStringMaxLen1600
    var LaunchConfigurationName: XmlStringMaxLen255
    var InstanceMonitoring: InstanceMonitoring
  }

  object CreateLaunchConfigurationType {
    def apply(
      RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
      ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      ImageId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      EbsOptimized: js.UndefOr[EbsOptimized] = js.undefined,
      UserData: js.UndefOr[XmlStringUserData] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      ClassicLinkVPCSecurityGroups: js.UndefOr[ClassicLinkVPCSecurityGroups] = js.undefined,
      KeyName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      InstanceId: js.UndefOr[XmlStringMaxLen16] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
      SpotPrice: js.UndefOr[SpotPrice] = js.undefined,
      PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined,
      IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined,
      LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      InstanceMonitoring: js.UndefOr[InstanceMonitoring] = js.undefined
    ): CreateLaunchConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ClassicLinkVPCId" -> ClassicLinkVPCId.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("ClassicLinkVPCSecurityGroups" -> ClassicLinkVPCSecurityGroups.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x: js.Any }),
        ("SpotPrice" -> SpotPrice.map { x => x: js.Any }),
        ("PlacementTenancy" -> PlacementTenancy.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("LaunchConfigurationName" -> LaunchConfigurationName.map { x => x: js.Any }),
        ("InstanceMonitoring" -> InstanceMonitoring.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLaunchConfigurationType]
    }
  }

  @js.native
  trait CreateOrUpdateTagsType extends js.Object {
    var Tags: Tags
  }

  object CreateOrUpdateTagsType {
    def apply(
      Tags: js.UndefOr[Tags] = js.undefined
    ): CreateOrUpdateTagsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOrUpdateTagsType]
    }
  }

  @js.native
  trait DeleteAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ForceDelete: ForceDelete
  }

  object DeleteAutoScalingGroupType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      ForceDelete: js.UndefOr[ForceDelete] = js.undefined
    ): DeleteAutoScalingGroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("ForceDelete" -> ForceDelete.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAutoScalingGroupType]
    }
  }

  @js.native
  trait DeleteLifecycleHookAnswer extends js.Object {

  }

  object DeleteLifecycleHookAnswer {
    def apply(

    ): DeleteLifecycleHookAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecycleHookAnswer]
    }
  }

  @js.native
  trait DeleteLifecycleHookType extends js.Object {
    var LifecycleHookName: AsciiStringMaxLen255
    var AutoScalingGroupName: ResourceName
  }

  object DeleteLifecycleHookType {
    def apply(
      LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    ): DeleteLifecycleHookType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LifecycleHookName" -> LifecycleHookName.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      TopicARN: js.UndefOr[ResourceName] = js.undefined
    ): DeleteNotificationConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("TopicARN" -> TopicARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotificationConfigurationType]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeletePolicyType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var PolicyName: ResourceName
  }

  object DeletePolicyType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      PolicyName: js.UndefOr[ResourceName] = js.undefined
    ): DeletePolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      ScheduledActionName: js.UndefOr[ResourceName] = js.undefined
    ): DeleteScheduledActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("ScheduledActionName" -> ScheduledActionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScheduledActionType]
    }
  }

  @js.native
  trait DeleteTagsType extends js.Object {
    var Tags: Tags
  }

  object DeleteTagsType {
    def apply(
      Tags: js.UndefOr[Tags] = js.undefined
    ): DeleteTagsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsType]
    }
  }

  @js.native
  trait DescribeAccountLimitsAnswer extends js.Object {
    var MaxNumberOfAutoScalingGroups: MaxNumberOfAutoScalingGroups
    var MaxNumberOfLaunchConfigurations: MaxNumberOfLaunchConfigurations
  }

  object DescribeAccountLimitsAnswer {
    def apply(
      MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups] = js.undefined,
      MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations] = js.undefined
    ): DescribeAccountLimitsAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxNumberOfAutoScalingGroups" -> MaxNumberOfAutoScalingGroups.map { x => x: js.Any }),
        ("MaxNumberOfLaunchConfigurations" -> MaxNumberOfLaunchConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountLimitsAnswer]
    }
  }

  @js.native
  trait DescribeAdjustmentTypesAnswer extends js.Object {
    var AdjustmentTypes: AdjustmentTypes
  }

  object DescribeAdjustmentTypesAnswer {
    def apply(
      AdjustmentTypes: js.UndefOr[AdjustmentTypes] = js.undefined
    ): DescribeAdjustmentTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AdjustmentTypes" -> AdjustmentTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAdjustmentTypesAnswer]
    }
  }

  @js.native
  trait DescribeAutoScalingInstancesType extends js.Object {
    var InstanceIds: InstanceIds
    var MaxRecords: MaxRecords
    var NextToken: XmlString
  }

  object DescribeAutoScalingInstancesType {
    def apply(
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeAutoScalingInstancesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutoScalingInstancesType]
    }
  }

  @js.native
  trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
    var AutoScalingNotificationTypes: AutoScalingNotificationTypes
  }

  object DescribeAutoScalingNotificationTypesAnswer {
    def apply(
      AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
    ): DescribeAutoScalingNotificationTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingNotificationTypes" -> AutoScalingNotificationTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHookTypesAnswer extends js.Object {
    var LifecycleHookTypes: AutoScalingNotificationTypes
  }

  object DescribeLifecycleHookTypesAnswer {
    def apply(
      LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
    ): DescribeLifecycleHookTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LifecycleHookTypes" -> LifecycleHookTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLifecycleHookTypesAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHooksAnswer extends js.Object {
    var LifecycleHooks: LifecycleHooks
  }

  object DescribeLifecycleHooksAnswer {
    def apply(
      LifecycleHooks: js.UndefOr[LifecycleHooks] = js.undefined
    ): DescribeLifecycleHooksAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LifecycleHooks" -> LifecycleHooks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLifecycleHooksAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHooksType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleHookNames: LifecycleHookNames
  }

  object DescribeLifecycleHooksType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      LifecycleHookNames: js.UndefOr[LifecycleHookNames] = js.undefined
    ): DescribeLifecycleHooksType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("LifecycleHookNames" -> LifecycleHookNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLifecycleHooksType]
    }
  }

  @js.native
  trait DescribeMetricCollectionTypesAnswer extends js.Object {
    var Metrics: MetricCollectionTypes
    var Granularities: MetricGranularityTypes
  }

  object DescribeMetricCollectionTypesAnswer {
    def apply(
      Metrics: js.UndefOr[MetricCollectionTypes] = js.undefined,
      Granularities: js.UndefOr[MetricGranularityTypes] = js.undefined
    ): DescribeMetricCollectionTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Metrics" -> Metrics.map { x => x: js.Any }),
        ("Granularities" -> Granularities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMetricCollectionTypesAnswer]
    }
  }

  @js.native
  trait DescribeNotificationConfigurationsAnswer extends js.Object {
    var NotificationConfigurations: NotificationConfigurations
    var NextToken: XmlString
  }

  object DescribeNotificationConfigurationsAnswer {
    def apply(
      NotificationConfigurations: js.UndefOr[NotificationConfigurations] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeNotificationConfigurationsAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotificationConfigurations" -> NotificationConfigurations.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationConfigurationsAnswer]
    }
  }

  @js.native
  trait DescribeNotificationConfigurationsType extends js.Object {
    var AutoScalingGroupNames: AutoScalingGroupNames
    var NextToken: XmlString
    var MaxRecords: MaxRecords
  }

  object DescribeNotificationConfigurationsType {
    def apply(
      AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    ): DescribeNotificationConfigurationsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupNames" -> AutoScalingGroupNames.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationConfigurationsType]
    }
  }

  @js.native
  trait DescribePoliciesType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var PolicyNames: PolicyNames
    var NextToken: XmlString
    var MaxRecords: MaxRecords
  }

  object DescribePoliciesType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    ): DescribePoliciesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePoliciesType]
    }
  }

  @js.native
  trait DescribeScalingActivitiesType extends js.Object {
    var ActivityIds: ActivityIds
    var AutoScalingGroupName: ResourceName
    var MaxRecords: MaxRecords
    var NextToken: XmlString
  }

  object DescribeScalingActivitiesType {
    def apply(
      ActivityIds: js.UndefOr[ActivityIds] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeScalingActivitiesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ActivityIds" -> ActivityIds.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingActivitiesType]
    }
  }

  @js.native
  trait DescribeScheduledActionsType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var StartTime: TimestampType
    var EndTime: TimestampType
    var MaxRecords: MaxRecords
    var NextToken: XmlString
    var ScheduledActionNames: ScheduledActionNames
  }

  object DescribeScheduledActionsType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      ScheduledActionNames: js.UndefOr[ScheduledActionNames] = js.undefined
    ): DescribeScheduledActionsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("ScheduledActionNames" -> ScheduledActionNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledActionsType]
    }
  }

  @js.native
  trait DescribeTagsType extends js.Object {
    var Filters: Filters
    var NextToken: XmlString
    var MaxRecords: MaxRecords
  }

  object DescribeTagsType {
    def apply(
      Filters: js.UndefOr[Filters] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    ): DescribeTagsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsType]
    }
  }

  @js.native
  trait DescribeTerminationPolicyTypesAnswer extends js.Object {
    var TerminationPolicyTypes: TerminationPolicies
  }

  object DescribeTerminationPolicyTypesAnswer {
    def apply(
      TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.undefined
    ): DescribeTerminationPolicyTypesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TerminationPolicyTypes" -> TerminationPolicyTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTerminationPolicyTypesAnswer]
    }
  }

  @js.native
  trait DetachInstancesAnswer extends js.Object {
    var Activities: Activities
  }

  object DetachInstancesAnswer {
    def apply(
      Activities: js.UndefOr[Activities] = js.undefined
    ): DetachInstancesAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Activities" -> Activities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInstancesAnswer]
    }
  }

  @js.native
  trait DetachInstancesQuery extends js.Object {
    var InstanceIds: InstanceIds
    var AutoScalingGroupName: ResourceName
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }

  object DetachInstancesQuery {
    def apply(
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      ShouldDecrementDesiredCapacity: js.UndefOr[ShouldDecrementDesiredCapacity] = js.undefined
    ): DetachInstancesQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInstancesQuery]
    }
  }

  @js.native
  trait DisableMetricsCollectionQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var Metrics: Metrics
  }

  object DisableMetricsCollectionQuery {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      Metrics: js.UndefOr[Metrics] = js.undefined
    ): DisableMetricsCollectionQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("Metrics" -> Metrics.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableMetricsCollectionQuery]
    }
  }

  /**
   * <p>Describes an Amazon EBS volume.</p>
   */
  @js.native
  trait Ebs extends js.Object {
    var VolumeType: BlockDeviceEbsVolumeType
    var SnapshotId: XmlStringMaxLen255
    var VolumeSize: BlockDeviceEbsVolumeSize
    var Iops: BlockDeviceEbsIops
    var DeleteOnTermination: BlockDeviceEbsDeleteOnTermination
  }

  object Ebs {
    def apply(
      VolumeType: js.UndefOr[BlockDeviceEbsVolumeType] = js.undefined,
      SnapshotId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize] = js.undefined,
      Iops: js.UndefOr[BlockDeviceEbsIops] = js.undefined,
      DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination] = js.undefined
    ): Ebs = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("VolumeSize" -> VolumeSize.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ebs]
    }
  }

  @js.native
  trait EnableMetricsCollectionQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var Metrics: Metrics
    var Granularity: XmlStringMaxLen255
  }

  object EnableMetricsCollectionQuery {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      Metrics: js.UndefOr[Metrics] = js.undefined,
      Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): EnableMetricsCollectionQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("Metrics" -> Metrics.map { x => x: js.Any }),
        ("Granularity" -> Granularity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableMetricsCollectionQuery]
    }
  }

  /**
   * <p>Describes an enabled metric.</p>
   */
  @js.native
  trait EnabledMetric extends js.Object {
    var Metric: XmlStringMaxLen255
    var Granularity: XmlStringMaxLen255
  }

  object EnabledMetric {
    def apply(
      Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): EnabledMetric = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Metric" -> Metric.map { x => x: js.Any }),
        ("Granularity" -> Granularity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnabledMetric]
    }
  }

  @js.native
  trait EnterStandbyAnswer extends js.Object {
    var Activities: Activities
  }

  object EnterStandbyAnswer {
    def apply(
      Activities: js.UndefOr[Activities] = js.undefined
    ): EnterStandbyAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Activities" -> Activities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnterStandbyAnswer]
    }
  }

  @js.native
  trait EnterStandbyQuery extends js.Object {
    var InstanceIds: InstanceIds
    var AutoScalingGroupName: ResourceName
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }

  object EnterStandbyQuery {
    def apply(
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      ShouldDecrementDesiredCapacity: js.UndefOr[ShouldDecrementDesiredCapacity] = js.undefined
    ): EnterStandbyQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnterStandbyQuery]
    }
  }

  @js.native
  trait ExecutePolicyType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var PolicyName: ResourceName
    var HonorCooldown: HonorCooldown
  }

  object ExecutePolicyType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      PolicyName: js.UndefOr[ResourceName] = js.undefined,
      HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined
    ): ExecutePolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("HonorCooldown" -> HonorCooldown.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutePolicyType]
    }
  }

  @js.native
  trait ExitStandbyAnswer extends js.Object {
    var Activities: Activities
  }

  object ExitStandbyAnswer {
    def apply(
      Activities: js.UndefOr[Activities] = js.undefined
    ): ExitStandbyAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Activities" -> Activities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExitStandbyAnswer]
    }
  }

  @js.native
  trait ExitStandbyQuery extends js.Object {
    var InstanceIds: InstanceIds
    var AutoScalingGroupName: ResourceName
  }

  object ExitStandbyQuery {
    def apply(
      InstanceIds: js.UndefOr[InstanceIds] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    ): ExitStandbyQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExitStandbyQuery]
    }
  }

  /**
   * <p>Describes a filter.</p>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: XmlString
    var Values: Values
  }

  object Filter {
    def apply(
      Name: js.UndefOr[XmlString] = js.undefined,
      Values: js.UndefOr[Values] = js.undefined
    ): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
   * <p>Describes an EC2 instance.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var LifecycleState: LifecycleState
    var AvailabilityZone: XmlStringMaxLen255
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen16
    var LaunchConfigurationName: XmlStringMaxLen255
  }

  object Instance {
    def apply(
      LifecycleState: js.UndefOr[LifecycleState] = js.undefined,
      AvailabilityZone: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      HealthStatus: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      InstanceId: js.UndefOr[XmlStringMaxLen16] = js.undefined,
      LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LifecycleState" -> LifecycleState.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("HealthStatus" -> HealthStatus.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("LaunchConfigurationName" -> LaunchConfigurationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>Describes whether instance monitoring is enabled.</p>
   */
  @js.native
  trait InstanceMonitoring extends js.Object {
    var Enabled: MonitoringEnabled
  }

  object InstanceMonitoring {
    def apply(
      Enabled: js.UndefOr[MonitoringEnabled] = js.undefined
    ): InstanceMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceMonitoring]
    }
  }

  /**
   * <p>The <code>NextToken</code> value is not valid.</p>
   */
  @js.native
  trait InvalidNextTokenException extends js.Object {
    var message: XmlStringMaxLen255
  }

  /**
   * <p>Describes a launch configuration.</p>
   */
  @js.native
  trait LaunchConfiguration extends js.Object {
    var RamdiskId: XmlStringMaxLen255
    var BlockDeviceMappings: BlockDeviceMappings
    var ClassicLinkVPCId: XmlStringMaxLen255
    var ImageId: XmlStringMaxLen255
    var CreatedTime: TimestampType
    var EbsOptimized: EbsOptimized
    var UserData: XmlStringUserData
    var SecurityGroups: SecurityGroups
    var KernelId: XmlStringMaxLen255
    var ClassicLinkVPCSecurityGroups: ClassicLinkVPCSecurityGroups
    var KeyName: XmlStringMaxLen255
    var InstanceType: XmlStringMaxLen255
    var AssociatePublicIpAddress: AssociatePublicIpAddress
    var SpotPrice: SpotPrice
    var PlacementTenancy: XmlStringMaxLen64
    var IamInstanceProfile: XmlStringMaxLen1600
    var LaunchConfigurationName: XmlStringMaxLen255
    var InstanceMonitoring: InstanceMonitoring
    var LaunchConfigurationARN: ResourceName
  }

  object LaunchConfiguration {
    def apply(
      RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
      ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      ImageId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      CreatedTime: js.UndefOr[TimestampType] = js.undefined,
      EbsOptimized: js.UndefOr[EbsOptimized] = js.undefined,
      UserData: js.UndefOr[XmlStringUserData] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      ClassicLinkVPCSecurityGroups: js.UndefOr[ClassicLinkVPCSecurityGroups] = js.undefined,
      KeyName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
      SpotPrice: js.UndefOr[SpotPrice] = js.undefined,
      PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined,
      IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined,
      LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      InstanceMonitoring: js.UndefOr[InstanceMonitoring] = js.undefined,
      LaunchConfigurationARN: js.UndefOr[ResourceName] = js.undefined
    ): LaunchConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ClassicLinkVPCId" -> ClassicLinkVPCId.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("CreatedTime" -> CreatedTime.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("ClassicLinkVPCSecurityGroups" -> ClassicLinkVPCSecurityGroups.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x: js.Any }),
        ("SpotPrice" -> SpotPrice.map { x => x: js.Any }),
        ("PlacementTenancy" -> PlacementTenancy.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("LaunchConfigurationName" -> LaunchConfigurationName.map { x => x: js.Any }),
        ("InstanceMonitoring" -> InstanceMonitoring.map { x => x: js.Any }),
        ("LaunchConfigurationARN" -> LaunchConfigurationARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfiguration]
    }
  }

  @js.native
  trait LaunchConfigurationNameType extends js.Object {
    var LaunchConfigurationName: ResourceName
  }

  object LaunchConfigurationNameType {
    def apply(
      LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined
    ): LaunchConfigurationNameType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LaunchConfigurationName" -> LaunchConfigurationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfigurationNameType]
    }
  }

  @js.native
  trait LaunchConfigurationNamesType extends js.Object {
    var LaunchConfigurationNames: LaunchConfigurationNames
    var NextToken: XmlString
    var MaxRecords: MaxRecords
  }

  object LaunchConfigurationNamesType {
    def apply(
      LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    ): LaunchConfigurationNamesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LaunchConfigurationNames" -> LaunchConfigurationNames.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfigurationNamesType]
    }
  }

  @js.native
  trait LaunchConfigurationsType extends js.Object {
    var LaunchConfigurations: LaunchConfigurations
    var NextToken: XmlString
  }

  object LaunchConfigurationsType {
    def apply(
      LaunchConfigurations: js.UndefOr[LaunchConfigurations] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): LaunchConfigurationsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LaunchConfigurations" -> LaunchConfigurations.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfigurationsType]
    }
  }

  /**
   * <p>Describes a lifecycle hook, which tells Auto Scaling that you want to perform an action when an instance launches or terminates. When you have a lifecycle hook in place, the Auto Scaling group will either:</p> <ul> <li>Pause the instance after it launches, but before it is put into service</li> <li>Pause the instance as it terminates, but before it is fully terminated</li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html">Auto Scaling Pending State</a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html">Auto Scaling Terminating State</a> in the <i>Auto Scaling Developer Guide</i>.</p>
   */
  @js.native
  trait LifecycleHook extends js.Object {
    var NotificationMetadata: XmlStringMaxLen1023
    var LifecycleHookName: AsciiStringMaxLen255
    var AutoScalingGroupName: ResourceName
    var NotificationTargetARN: ResourceName
    var RoleARN: ResourceName
    var HeartbeatTimeout: HeartbeatTimeout
    var LifecycleTransition: LifecycleTransition
    var GlobalTimeout: GlobalTimeout
    var DefaultResult: LifecycleActionResult
  }

  object LifecycleHook {
    def apply(
      NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
      LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      NotificationTargetARN: js.UndefOr[ResourceName] = js.undefined,
      RoleARN: js.UndefOr[ResourceName] = js.undefined,
      HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
      LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined,
      GlobalTimeout: js.UndefOr[GlobalTimeout] = js.undefined,
      DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
    ): LifecycleHook = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotificationMetadata" -> NotificationMetadata.map { x => x: js.Any }),
        ("LifecycleHookName" -> LifecycleHookName.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("NotificationTargetARN" -> NotificationTargetARN.map { x => x: js.Any }),
        ("RoleARN" -> RoleARN.map { x => x: js.Any }),
        ("HeartbeatTimeout" -> HeartbeatTimeout.map { x => x: js.Any }),
        ("LifecycleTransition" -> LifecycleTransition.map { x => x: js.Any }),
        ("GlobalTimeout" -> GlobalTimeout.map { x => x: js.Any }),
        ("DefaultResult" -> DefaultResult.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleHook]
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
   * <p>The limit for the number of Auto Scaling groups or launch configurations has already been reached.</p>
   */
  @js.native
  trait LimitExceededFaultException extends js.Object {
    var message: XmlStringMaxLen255
  }

  /**
   * <p>Describes a metric.</p>
   */
  @js.native
  trait MetricCollectionType extends js.Object {
    var Metric: XmlStringMaxLen255
  }

  object MetricCollectionType {
    def apply(
      Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): MetricCollectionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Metric" -> Metric.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricCollectionType]
    }
  }

  /**
   * <p>Describes a granularity of a metric.</p>
   */
  @js.native
  trait MetricGranularityType extends js.Object {
    var Granularity: XmlStringMaxLen255
  }

  object MetricGranularityType {
    def apply(
      Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): MetricGranularityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Granularity" -> Granularity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricGranularityType]
    }
  }

  /**
   * <p>Describes a notification.</p>
   */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var AutoScalingGroupName: ResourceName
    var TopicARN: ResourceName
    var NotificationType: XmlStringMaxLen255
  }

  object NotificationConfiguration {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      TopicARN: js.UndefOr[ResourceName] = js.undefined,
      NotificationType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): NotificationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("TopicARN" -> TopicARN.map { x => x: js.Any }),
        ("NotificationType" -> NotificationType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfiguration]
    }
  }

  @js.native
  trait PoliciesType extends js.Object {
    var ScalingPolicies: ScalingPolicies
    var NextToken: XmlString
  }

  object PoliciesType {
    def apply(
      ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): PoliciesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ScalingPolicies" -> ScalingPolicies.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PoliciesType]
    }
  }

  @js.native
  trait PolicyARNType extends js.Object {
    var PolicyARN: ResourceName
  }

  object PolicyARNType {
    def apply(
      PolicyARN: js.UndefOr[ResourceName] = js.undefined
    ): PolicyARNType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyARN" -> PolicyARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyARNType]
    }
  }

  /**
   * <p>Describes a process type.</p> <p>There are two primary Auto Scaling process types--<code>Launch</code> and <code>Terminate</code>. The <code>Launch</code> process creates a new EC2 instance for an Auto Scaling group, and the <code>Terminate</code> process removes an existing EC2 instance. The remaining Auto Scaling process types relate to specific Auto Scaling features:</p> <ul> <li>AddToLoadBalancer</li> <li>AlarmNotification</li> <li>AZRebalance</li> <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>ScheduledActions</li> </ul> <important> If you suspend <code>Launch</code> or <code>Terminate</code>, all other process types are affected to varying degrees. The following descriptions discuss how each process type is affected by a suspension of <code>Launch</code> or <code>Terminate</code>. </important> <p>The <code>AddToLoadBalancer</code> process type adds instances to the load balancer when the instances are launched. If you suspend this process, Auto Scaling will launch the instances but will not add them to the load balancer. If you resume the <code>AddToLoadBalancer</code> process, Auto Scaling will also resume adding new instances to the load balancer when they are launched. However, Auto Scaling will not add running instances that were launched while the process was suspended; those instances must be added manually using the <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_RegisterInstancesWithLoadBalancer.html"> RegisterInstancesWithLoadBalancer</a> call.</p> <p>The <code>AlarmNotification</code> process type accepts notifications from Amazon CloudWatch alarms that are associated with the Auto Scaling group. If you suspend the <code>AlarmNotification</code> process type, Auto Scaling will not automatically execute scaling policies that would be triggered by alarms.</p> <p>Although the <code>AlarmNotification</code> process type is not directly affected by a suspension of <code>Launch</code> or <code>Terminate</code>, alarm notifications are often used to signal that a change in the size of the Auto Scaling group is warranted. If you suspend <code>Launch</code> or <code>Terminate</code>, Auto Scaling might not be able to implement the alarm's associated policy.</p> <p>The <code>AZRebalance</code> process type seeks to maintain a balanced number of instances across Availability Zones within a Region. If you remove an Availability Zone from your Auto Scaling group or an Availability Zone otherwise becomes unhealthy or unavailable, Auto Scaling launches new instances in an unaffected Availability Zone before terminating the unhealthy or unavailable instances. When the unhealthy Availability Zone returns to a healthy state, Auto Scaling automatically redistributes the application instances evenly across all of the designated Availability Zones.</p> <important> <p>If you call <a>SuspendProcesses</a> on the <code>launch</code> process type, the <code>AZRebalance</code> process will neither launch new instances nor terminate existing instances. This is because the <code>AZRebalance</code> process terminates existing instances only after launching the replacement instances.</p> <p>If you call <a>SuspendProcesses</a> on the <code>terminate</code> process type, the <code>AZRebalance</code> process can cause your Auto Scaling group to grow up to ten percent larger than the maximum size. This is because Auto Scaling allows groups to temporarily grow larger than the maximum size during rebalancing activities. If Auto Scaling cannot terminate instances, your Auto Scaling group could remain up to ten percent larger than the maximum size until you resume the <code>terminate</code> process type.</p> </important> <p>The <code>HealthCheck</code> process type checks the health of the instances. Auto Scaling marks an instance as unhealthy if Amazon EC2 or Elastic Load Balancing informs Auto Scaling that the instance is unhealthy. The <code>HealthCheck</code> process can override the health status of an instance that you set with <a>SetInstanceHealth</a>.</p> <p>The <code>ReplaceUnhealthy</code> process type terminates instances that are marked as unhealthy and subsequently creates new instances to replace them. This process calls both of the primary process types--first <code>Terminate</code> and then <code>Launch</code>.</p> <important> <p>The <code>HealthCheck</code> process type works in conjunction with the <code>ReplaceUnhealthly</code> process type to provide health check functionality. If you suspend either <code>Launch</code> or <code>Terminate</code>, the <code>ReplaceUnhealthy</code> process type will not function properly.</p> </important> <p>The <code>ScheduledActions</code> process type performs scheduled actions that you create with <a>PutScheduledUpdateGroupAction</a>. Scheduled actions often involve launching new instances or terminating existing instances. If you suspend either <code>Launch</code> or <code>Terminate</code>, your scheduled actions might not function as expected.</p>
   */
  @js.native
  trait ProcessType extends js.Object {
    var ProcessName: XmlStringMaxLen255
  }

  object ProcessType {
    def apply(
      ProcessName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): ProcessType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ProcessName" -> ProcessName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessType]
    }
  }

  @js.native
  trait ProcessesType extends js.Object {
    var Processes: Processes
  }

  object ProcessesType {
    def apply(
      Processes: js.UndefOr[Processes] = js.undefined
    ): ProcessesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Processes" -> Processes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessesType]
    }
  }

  @js.native
  trait PutLifecycleHookAnswer extends js.Object {

  }

  object PutLifecycleHookAnswer {
    def apply(

    ): PutLifecycleHookAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecycleHookAnswer]
    }
  }

  @js.native
  trait PutLifecycleHookType extends js.Object {
    var NotificationMetadata: XmlStringMaxLen1023
    var LifecycleHookName: AsciiStringMaxLen255
    var AutoScalingGroupName: ResourceName
    var NotificationTargetARN: ResourceName
    var RoleARN: ResourceName
    var HeartbeatTimeout: HeartbeatTimeout
    var LifecycleTransition: LifecycleTransition
    var DefaultResult: LifecycleActionResult
  }

  object PutLifecycleHookType {
    def apply(
      NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined,
      LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      NotificationTargetARN: js.UndefOr[ResourceName] = js.undefined,
      RoleARN: js.UndefOr[ResourceName] = js.undefined,
      HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
      LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined,
      DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
    ): PutLifecycleHookType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotificationMetadata" -> NotificationMetadata.map { x => x: js.Any }),
        ("LifecycleHookName" -> LifecycleHookName.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("NotificationTargetARN" -> NotificationTargetARN.map { x => x: js.Any }),
        ("RoleARN" -> RoleARN.map { x => x: js.Any }),
        ("HeartbeatTimeout" -> HeartbeatTimeout.map { x => x: js.Any }),
        ("LifecycleTransition" -> LifecycleTransition.map { x => x: js.Any }),
        ("DefaultResult" -> DefaultResult.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecycleHookType]
    }
  }

  @js.native
  trait PutNotificationConfigurationType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var TopicARN: ResourceName
    var NotificationTypes: AutoScalingNotificationTypes
  }

  object PutNotificationConfigurationType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      TopicARN: js.UndefOr[ResourceName] = js.undefined,
      NotificationTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
    ): PutNotificationConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("TopicARN" -> TopicARN.map { x => x: js.Any }),
        ("NotificationTypes" -> NotificationTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutNotificationConfigurationType]
    }
  }

  @js.native
  trait PutScalingPolicyType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScalingAdjustment: PolicyIncrement
    var Cooldown: Cooldown
    var PolicyName: XmlStringMaxLen255
    var AdjustmentType: XmlStringMaxLen255
    var MinAdjustmentStep: MinAdjustmentStep
  }

  object PutScalingPolicyType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
      Cooldown: js.UndefOr[Cooldown] = js.undefined,
      PolicyName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined
    ): PutScalingPolicyType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("ScalingAdjustment" -> ScalingAdjustment.map { x => x: js.Any }),
        ("Cooldown" -> Cooldown.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("AdjustmentType" -> AdjustmentType.map { x => x: js.Any }),
        ("MinAdjustmentStep" -> MinAdjustmentStep.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyType]
    }
  }

  @js.native
  trait PutScheduledUpdateGroupActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var MaxSize: AutoScalingGroupMaxSize
    var StartTime: TimestampType
    var EndTime: TimestampType
    var MinSize: AutoScalingGroupMinSize
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var ScheduledActionName: XmlStringMaxLen255
    var Time: TimestampType
    var Recurrence: XmlStringMaxLen255
  }

  object PutScheduledUpdateGroupActionType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      ScheduledActionName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Time: js.UndefOr[TimestampType] = js.undefined,
      Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): PutScheduledUpdateGroupActionType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("MaxSize" -> MaxSize.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("MinSize" -> MinSize.map { x => x: js.Any }),
        ("DesiredCapacity" -> DesiredCapacity.map { x => x: js.Any }),
        ("ScheduledActionName" -> ScheduledActionName.map { x => x: js.Any }),
        ("Time" -> Time.map { x => x: js.Any }),
        ("Recurrence" -> Recurrence.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScheduledUpdateGroupActionType]
    }
  }

  @js.native
  trait RecordLifecycleActionHeartbeatAnswer extends js.Object {

  }

  object RecordLifecycleActionHeartbeatAnswer {
    def apply(

    ): RecordLifecycleActionHeartbeatAnswer = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordLifecycleActionHeartbeatAnswer]
    }
  }

  @js.native
  trait RecordLifecycleActionHeartbeatType extends js.Object {
    var LifecycleHookName: AsciiStringMaxLen255
    var AutoScalingGroupName: ResourceName
    var LifecycleActionToken: LifecycleActionToken
  }

  object RecordLifecycleActionHeartbeatType {
    def apply(
      LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined
    ): RecordLifecycleActionHeartbeatType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LifecycleHookName" -> LifecycleHookName.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("LifecycleActionToken" -> LifecycleActionToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordLifecycleActionHeartbeatType]
    }
  }

  /**
   * <p>The Auto Scaling group or launch configuration can't be deleted because it is in use.</p>
   */
  @js.native
  trait ResourceInUseFaultException extends js.Object {
    var message: XmlStringMaxLen255
  }

  /**
   * <p>The Auto Scaling group can't be deleted because there are scaling activities in progress.</p>
   */
  @js.native
  trait ScalingActivityInProgressFaultException extends js.Object {
    var message: XmlStringMaxLen255
  }


  object ScalingActivityStatusCodeEnum {
    val WaitingForSpotInstanceRequestId = "WaitingForSpotInstanceRequestId"
    val WaitingForSpotInstanceId = "WaitingForSpotInstanceId"
    val WaitingForInstanceId = "WaitingForInstanceId"
    val PreInService = "PreInService"
    val InProgress = "InProgress"
    val WaitingForELBConnectionDraining = "WaitingForELBConnectionDraining"
    val MidLifecycleAction = "MidLifecycleAction"
    val Successful = "Successful"
    val Failed = "Failed"
    val Cancelled = "Cancelled"

    val values = IndexedSeq(WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, WaitingForELBConnectionDraining, MidLifecycleAction, Successful, Failed, Cancelled)
  }

  /**
   * <p>Describes a scaling policy.</p>
   */
  @js.native
  trait ScalingPolicy extends js.Object {
    var AutoScalingGroupName: XmlStringMaxLen255
    var ScalingAdjustment: PolicyIncrement
    var Cooldown: Cooldown
    var PolicyName: XmlStringMaxLen255
    var Alarms: Alarms
    var AdjustmentType: XmlStringMaxLen255
    var PolicyARN: ResourceName
    var MinAdjustmentStep: MinAdjustmentStep
  }

  object ScalingPolicy {
    def apply(
      AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined,
      Cooldown: js.UndefOr[Cooldown] = js.undefined,
      PolicyName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Alarms: js.UndefOr[Alarms] = js.undefined,
      AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      PolicyARN: js.UndefOr[ResourceName] = js.undefined,
      MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined
    ): ScalingPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("ScalingAdjustment" -> ScalingAdjustment.map { x => x: js.Any }),
        ("Cooldown" -> Cooldown.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("Alarms" -> Alarms.map { x => x: js.Any }),
        ("AdjustmentType" -> AdjustmentType.map { x => x: js.Any }),
        ("PolicyARN" -> PolicyARN.map { x => x: js.Any }),
        ("MinAdjustmentStep" -> MinAdjustmentStep.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingPolicy]
    }
  }

  @js.native
  trait ScalingProcessQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScalingProcesses: ProcessNames
  }

  object ScalingProcessQuery {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      ScalingProcesses: js.UndefOr[ProcessNames] = js.undefined
    ): ScalingProcessQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("ScalingProcesses" -> ScalingProcesses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingProcessQuery]
    }
  }

  @js.native
  trait ScheduledActionsType extends js.Object {
    var ScheduledUpdateGroupActions: ScheduledUpdateGroupActions
    var NextToken: XmlString
  }

  object ScheduledActionsType {
    def apply(
      ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): ScheduledActionsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ScheduledUpdateGroupActions" -> ScheduledUpdateGroupActions.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledActionsType]
    }
  }

  /**
   * <p>Describes a scheduled update to an Auto Scaling group.</p>
   */
  @js.native
  trait ScheduledUpdateGroupAction extends js.Object {
    var ScheduledActionARN: ResourceName
    var AutoScalingGroupName: XmlStringMaxLen255
    var MaxSize: AutoScalingGroupMaxSize
    var StartTime: TimestampType
    var EndTime: TimestampType
    var MinSize: AutoScalingGroupMinSize
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var ScheduledActionName: XmlStringMaxLen255
    var Time: TimestampType
    var Recurrence: XmlStringMaxLen255
  }

  object ScheduledUpdateGroupAction {
    def apply(
      ScheduledActionARN: js.UndefOr[ResourceName] = js.undefined,
      AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      ScheduledActionName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      Time: js.UndefOr[TimestampType] = js.undefined,
      Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): ScheduledUpdateGroupAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ScheduledActionARN" -> ScheduledActionARN.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("MaxSize" -> MaxSize.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("MinSize" -> MinSize.map { x => x: js.Any }),
        ("DesiredCapacity" -> DesiredCapacity.map { x => x: js.Any }),
        ("ScheduledActionName" -> ScheduledActionName.map { x => x: js.Any }),
        ("Time" -> Time.map { x => x: js.Any }),
        ("Recurrence" -> Recurrence.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledUpdateGroupAction]
    }
  }

  @js.native
  trait SetDesiredCapacityType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var HonorCooldown: HonorCooldown
  }

  object SetDesiredCapacityType {
    def apply(
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined
    ): SetDesiredCapacityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("DesiredCapacity" -> DesiredCapacity.map { x => x: js.Any }),
        ("HonorCooldown" -> HonorCooldown.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDesiredCapacityType]
    }
  }

  @js.native
  trait SetInstanceHealthQuery extends js.Object {
    var InstanceId: XmlStringMaxLen16
    var HealthStatus: XmlStringMaxLen32
    var ShouldRespectGracePeriod: ShouldRespectGracePeriod
  }

  object SetInstanceHealthQuery {
    def apply(
      InstanceId: js.UndefOr[XmlStringMaxLen16] = js.undefined,
      HealthStatus: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      ShouldRespectGracePeriod: js.UndefOr[ShouldRespectGracePeriod] = js.undefined
    ): SetInstanceHealthQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("HealthStatus" -> HealthStatus.map { x => x: js.Any }),
        ("ShouldRespectGracePeriod" -> ShouldRespectGracePeriod.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetInstanceHealthQuery]
    }
  }

  /**
   * <p>Describes an Auto Scaling process that has been suspended. For more information, see <a>ProcessType</a>.</p>
   */
  @js.native
  trait SuspendedProcess extends js.Object {
    var ProcessName: XmlStringMaxLen255
    var SuspensionReason: XmlStringMaxLen255
  }

  object SuspendedProcess {
    def apply(
      ProcessName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): SuspendedProcess = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ProcessName" -> ProcessName.map { x => x: js.Any }),
        ("SuspensionReason" -> SuspensionReason.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuspendedProcess]
    }
  }

  /**
   * <p>Describes a tag applied to an Auto Scaling group.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var ResourceId: XmlString
    var PropagateAtLaunch: PropagateAtLaunch
    var ResourceType: XmlString
    var Value: TagValue
    var Key: TagKey
  }

  object Tag {
    def apply(
      ResourceId: js.UndefOr[XmlString] = js.undefined,
      PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined,
      ResourceType: js.UndefOr[XmlString] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined,
      Key: js.UndefOr[TagKey] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("PropagateAtLaunch" -> PropagateAtLaunch.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Describes a tag applied to an Auto Scaling group.</p>
   */
  @js.native
  trait TagDescription extends js.Object {
    var ResourceId: XmlString
    var PropagateAtLaunch: PropagateAtLaunch
    var ResourceType: XmlString
    var Value: TagValue
    var Key: TagKey
  }

  object TagDescription {
    def apply(
      ResourceId: js.UndefOr[XmlString] = js.undefined,
      PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined,
      ResourceType: js.UndefOr[XmlString] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined,
      Key: js.UndefOr[TagKey] = js.undefined
    ): TagDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("PropagateAtLaunch" -> PropagateAtLaunch.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDescription]
    }
  }

  @js.native
  trait TagsType extends js.Object {
    var Tags: TagDescriptionList
    var NextToken: XmlString
  }

  object TagsType {
    def apply(
      Tags: js.UndefOr[TagDescriptionList] = js.undefined,
      NextToken: js.UndefOr[XmlString] = js.undefined
    ): TagsType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagsType]
    }
  }

  @js.native
  trait TerminateInstanceInAutoScalingGroupType extends js.Object {
    var InstanceId: XmlStringMaxLen16
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }

  object TerminateInstanceInAutoScalingGroupType {
    def apply(
      InstanceId: js.UndefOr[XmlStringMaxLen16] = js.undefined,
      ShouldDecrementDesiredCapacity: js.UndefOr[ShouldDecrementDesiredCapacity] = js.undefined
    ): TerminateInstanceInAutoScalingGroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateInstanceInAutoScalingGroupType]
    }
  }

  @js.native
  trait UpdateAutoScalingGroupType extends js.Object {
    var DefaultCooldown: Cooldown
    var PlacementGroup: XmlStringMaxLen255
    var TerminationPolicies: TerminationPolicies
    var AutoScalingGroupName: ResourceName
    var HealthCheckType: XmlStringMaxLen32
    var VPCZoneIdentifier: XmlStringMaxLen255
    var MaxSize: AutoScalingGroupMaxSize
    var MinSize: AutoScalingGroupMinSize
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var LaunchConfigurationName: ResourceName
    var HealthCheckGracePeriod: HealthCheckGracePeriod
    var AvailabilityZones: AvailabilityZones
  }

  object UpdateAutoScalingGroupType {
    def apply(
      DefaultCooldown: js.UndefOr[Cooldown] = js.undefined,
      PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined,
      AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined,
      HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined,
      VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen255] = js.undefined,
      MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
      MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
      DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
      LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined,
      HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): UpdateAutoScalingGroupType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultCooldown" -> DefaultCooldown.map { x => x: js.Any }),
        ("PlacementGroup" -> PlacementGroup.map { x => x: js.Any }),
        ("TerminationPolicies" -> TerminationPolicies.map { x => x: js.Any }),
        ("AutoScalingGroupName" -> AutoScalingGroupName.map { x => x: js.Any }),
        ("HealthCheckType" -> HealthCheckType.map { x => x: js.Any }),
        ("VPCZoneIdentifier" -> VPCZoneIdentifier.map { x => x: js.Any }),
        ("MaxSize" -> MaxSize.map { x => x: js.Any }),
        ("MinSize" -> MinSize.map { x => x: js.Any }),
        ("DesiredCapacity" -> DesiredCapacity.map { x => x: js.Any }),
        ("LaunchConfigurationName" -> LaunchConfigurationName.map { x => x: js.Any }),
        ("HealthCheckGracePeriod" -> HealthCheckGracePeriod.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAutoScalingGroupType]
    }
  }
}
