package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object autoscaling {
  type Activities                               = js.Array[Activity]
  type ActivityIds                              = js.Array[XmlString]
  type AdjustmentTypes                          = js.Array[AdjustmentType]
  type Alarms                                   = js.Array[Alarm]
  type AsciiStringMaxLen255                     = String
  type AssociatePublicIpAddress                 = Boolean
  type AutoScalingGroupDesiredCapacity          = Int
  type AutoScalingGroupMaxSize                  = Int
  type AutoScalingGroupMinSize                  = Int
  type AutoScalingGroupNames                    = js.Array[ResourceName]
  type AutoScalingGroups                        = js.Array[AutoScalingGroup]
  type AutoScalingInstances                     = js.Array[AutoScalingInstanceDetails]
  type AutoScalingNotificationTypes             = js.Array[XmlStringMaxLen255]
  type AvailabilityZones                        = js.Array[XmlStringMaxLen255]
  type BlockDeviceEbsDeleteOnTermination        = Boolean
  type BlockDeviceEbsEncrypted                  = Boolean
  type BlockDeviceEbsIops                       = Int
  type BlockDeviceEbsVolumeSize                 = Int
  type BlockDeviceEbsVolumeType                 = String
  type BlockDeviceMappings                      = js.Array[BlockDeviceMapping]
  type ClassicLinkVPCSecurityGroups             = js.Array[XmlStringMaxLen255]
  type Cooldown                                 = Int
  type DisableScaleIn                           = Boolean
  type EbsOptimized                             = Boolean
  type EnabledMetrics                           = js.Array[EnabledMetric]
  type EstimatedInstanceWarmup                  = Int
  type FailedScheduledUpdateGroupActionRequests = js.Array[FailedScheduledUpdateGroupActionRequest]
  type Filters                                  = js.Array[Filter]
  type ForceDelete                              = Boolean
  type GlobalTimeout                            = Int
  type HealthCheckGracePeriod                   = Int
  type HeartbeatTimeout                         = Int
  type HonorCooldown                            = Boolean
  type InstanceIds                              = js.Array[XmlStringMaxLen19]
  type InstanceProtected                        = Boolean
  type Instances                                = js.Array[Instance]
  type LaunchConfigurationNames                 = js.Array[ResourceName]
  type LaunchConfigurations                     = js.Array[LaunchConfiguration]
  type LaunchTemplateName                       = String
  type LifecycleActionResult                    = String
  type LifecycleActionToken                     = String
  type LifecycleHookNames                       = js.Array[AsciiStringMaxLen255]
  type LifecycleHookSpecifications              = js.Array[LifecycleHookSpecification]
  type LifecycleHooks                           = js.Array[LifecycleHook]
  type LifecycleTransition                      = String
  type LoadBalancerNames                        = js.Array[XmlStringMaxLen255]
  type LoadBalancerStates                       = js.Array[LoadBalancerState]
  type LoadBalancerTargetGroupStates            = js.Array[LoadBalancerTargetGroupState]
  type MaxInstanceLifetime                      = Int
  type MaxNumberOfAutoScalingGroups             = Int
  type MaxNumberOfLaunchConfigurations          = Int
  type MaxRecords                               = Int
  type MetricCollectionTypes                    = js.Array[MetricCollectionType]
  type MetricDimensionName                      = String
  type MetricDimensionValue                     = String
  type MetricDimensions                         = js.Array[MetricDimension]
  type MetricGranularityTypes                   = js.Array[MetricGranularityType]
  type MetricName                               = String
  type MetricNamespace                          = String
  type MetricScale                              = Double
  type MetricUnit                               = String
  type Metrics                                  = js.Array[XmlStringMaxLen255]
  type MinAdjustmentMagnitude                   = Int
  @deprecated("Deprecated in AWS SDK", "forever")
  type MinAdjustmentStep                   = Int
  type MixedInstanceSpotPrice              = String
  type MonitoringEnabled                   = Boolean
  type NoDevice                            = Boolean
  type NotificationConfigurations          = js.Array[NotificationConfiguration]
  type NotificationTargetResourceName      = String
  type NumberOfAutoScalingGroups           = Int
  type NumberOfLaunchConfigurations        = Int
  type OnDemandBaseCapacity                = Int
  type OnDemandPercentageAboveBaseCapacity = Int
  type Overrides                           = js.Array[LaunchTemplateOverrides]
  type PolicyIncrement                     = Int
  type PolicyNames                         = js.Array[ResourceName]
  type PolicyTypes                         = js.Array[XmlStringMaxLen64]
  type ProcessNames                        = js.Array[XmlStringMaxLen255]
  type Processes                           = js.Array[ProcessType]
  type Progress                            = Int
  type PropagateAtLaunch                   = Boolean
  type ProtectedFromScaleIn                = Boolean
  type ResourceName                        = String
  type ScalingPolicies                     = js.Array[ScalingPolicy]
  type ScalingPolicyEnabled                = Boolean
  type ScheduledActionNames                = js.Array[ResourceName]
  type ScheduledUpdateGroupActionRequests  = js.Array[ScheduledUpdateGroupActionRequest]
  type ScheduledUpdateGroupActions         = js.Array[ScheduledUpdateGroupAction]
  type SecurityGroups                      = js.Array[XmlString]
  type ShouldDecrementDesiredCapacity      = Boolean
  type ShouldRespectGracePeriod            = Boolean
  type SpotInstancePools                   = Int
  type SpotPrice                           = String
  type StepAdjustments                     = js.Array[StepAdjustment]
  type SuspendedProcesses                  = js.Array[SuspendedProcess]
  type TagDescriptionList                  = js.Array[TagDescription]
  type TagKey                              = String
  type TagValue                            = String
  type Tags                                = js.Array[Tag]
  type TargetGroupARNs                     = js.Array[XmlStringMaxLen511]
  type TerminationPolicies                 = js.Array[XmlStringMaxLen1600]
  type TimestampType                       = js.Date
  type Values                              = js.Array[XmlString]
  type XmlString                           = String
  type XmlStringMaxLen1023                 = String
  type XmlStringMaxLen1600                 = String
  type XmlStringMaxLen19                   = String
  type XmlStringMaxLen2047                 = String
  type XmlStringMaxLen255                  = String
  type XmlStringMaxLen32                   = String
  type XmlStringMaxLen511                  = String
  type XmlStringMaxLen64                   = String
  type XmlStringUserData                   = String

  implicit final class AutoScalingOps(private val service: AutoScaling) extends AnyVal {

    @inline def attachInstancesFuture(params: AttachInstancesQuery): Future[js.Object] =
      service.attachInstances(params).promise().toFuture
    @inline def attachLoadBalancerTargetGroupsFuture(
        params: AttachLoadBalancerTargetGroupsType
    ): Future[AttachLoadBalancerTargetGroupsResultType] =
      service.attachLoadBalancerTargetGroups(params).promise().toFuture
    @inline def attachLoadBalancersFuture(params: AttachLoadBalancersType): Future[AttachLoadBalancersResultType] =
      service.attachLoadBalancers(params).promise().toFuture
    @inline def batchDeleteScheduledActionFuture(
        params: BatchDeleteScheduledActionType
    ): Future[BatchDeleteScheduledActionAnswer] = service.batchDeleteScheduledAction(params).promise().toFuture
    @inline def batchPutScheduledUpdateGroupActionFuture(
        params: BatchPutScheduledUpdateGroupActionType
    ): Future[BatchPutScheduledUpdateGroupActionAnswer] =
      service.batchPutScheduledUpdateGroupAction(params).promise().toFuture
    @inline def completeLifecycleActionFuture(
        params: CompleteLifecycleActionType
    ): Future[CompleteLifecycleActionAnswer] = service.completeLifecycleAction(params).promise().toFuture
    @inline def createAutoScalingGroupFuture(params: CreateAutoScalingGroupType): Future[js.Object] =
      service.createAutoScalingGroup(params).promise().toFuture
    @inline def createLaunchConfigurationFuture(params: CreateLaunchConfigurationType): Future[js.Object] =
      service.createLaunchConfiguration(params).promise().toFuture
    @inline def createOrUpdateTagsFuture(params: CreateOrUpdateTagsType): Future[js.Object] =
      service.createOrUpdateTags(params).promise().toFuture
    @inline def deleteAutoScalingGroupFuture(params: DeleteAutoScalingGroupType): Future[js.Object] =
      service.deleteAutoScalingGroup(params).promise().toFuture
    @inline def deleteLaunchConfigurationFuture(params: LaunchConfigurationNameType): Future[js.Object] =
      service.deleteLaunchConfiguration(params).promise().toFuture
    @inline def deleteLifecycleHookFuture(params: DeleteLifecycleHookType): Future[DeleteLifecycleHookAnswer] =
      service.deleteLifecycleHook(params).promise().toFuture
    @inline def deleteNotificationConfigurationFuture(params: DeleteNotificationConfigurationType): Future[js.Object] =
      service.deleteNotificationConfiguration(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyType): Future[js.Object] =
      service.deletePolicy(params).promise().toFuture
    @inline def deleteScheduledActionFuture(params: DeleteScheduledActionType): Future[js.Object] =
      service.deleteScheduledAction(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsType): Future[js.Object] =
      service.deleteTags(params).promise().toFuture
    @inline def describeAccountLimitsFuture(): Future[DescribeAccountLimitsAnswer] =
      service.describeAccountLimits().promise().toFuture
    @inline def describeAdjustmentTypesFuture(): Future[DescribeAdjustmentTypesAnswer] =
      service.describeAdjustmentTypes().promise().toFuture
    @inline def describeAutoScalingGroupsFuture(params: AutoScalingGroupNamesType): Future[AutoScalingGroupsType] =
      service.describeAutoScalingGroups(params).promise().toFuture
    @inline def describeAutoScalingInstancesFuture(
        params: DescribeAutoScalingInstancesType
    ): Future[AutoScalingInstancesType] = service.describeAutoScalingInstances(params).promise().toFuture
    @inline def describeAutoScalingNotificationTypesFuture(): Future[DescribeAutoScalingNotificationTypesAnswer] =
      service.describeAutoScalingNotificationTypes().promise().toFuture
    @inline def describeLaunchConfigurationsFuture(
        params: LaunchConfigurationNamesType
    ): Future[LaunchConfigurationsType] = service.describeLaunchConfigurations(params).promise().toFuture
    @inline def describeLifecycleHookTypesFuture(): Future[DescribeLifecycleHookTypesAnswer] =
      service.describeLifecycleHookTypes().promise().toFuture
    @inline def describeLifecycleHooksFuture(params: DescribeLifecycleHooksType): Future[DescribeLifecycleHooksAnswer] =
      service.describeLifecycleHooks(params).promise().toFuture
    @inline def describeLoadBalancerTargetGroupsFuture(
        params: DescribeLoadBalancerTargetGroupsRequest
    ): Future[DescribeLoadBalancerTargetGroupsResponse] =
      service.describeLoadBalancerTargetGroups(params).promise().toFuture
    @inline def describeLoadBalancersFuture(
        params: DescribeLoadBalancersRequest
    ): Future[DescribeLoadBalancersResponse] = service.describeLoadBalancers(params).promise().toFuture
    @inline def describeMetricCollectionTypesFuture(): Future[DescribeMetricCollectionTypesAnswer] =
      service.describeMetricCollectionTypes().promise().toFuture
    @inline def describeNotificationConfigurationsFuture(
        params: DescribeNotificationConfigurationsType
    ): Future[DescribeNotificationConfigurationsAnswer] =
      service.describeNotificationConfigurations(params).promise().toFuture
    @inline def describePoliciesFuture(params: DescribePoliciesType): Future[PoliciesType] =
      service.describePolicies(params).promise().toFuture
    @inline def describeScalingActivitiesFuture(params: DescribeScalingActivitiesType): Future[ActivitiesType] =
      service.describeScalingActivities(params).promise().toFuture
    @inline def describeScalingProcessTypesFuture(): Future[ProcessesType] =
      service.describeScalingProcessTypes().promise().toFuture
    @inline def describeScheduledActionsFuture(params: DescribeScheduledActionsType): Future[ScheduledActionsType] =
      service.describeScheduledActions(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsType): Future[TagsType] =
      service.describeTags(params).promise().toFuture
    @inline def describeTerminationPolicyTypesFuture(): Future[DescribeTerminationPolicyTypesAnswer] =
      service.describeTerminationPolicyTypes().promise().toFuture
    @inline def detachInstancesFuture(params: DetachInstancesQuery): Future[DetachInstancesAnswer] =
      service.detachInstances(params).promise().toFuture
    @inline def detachLoadBalancerTargetGroupsFuture(
        params: DetachLoadBalancerTargetGroupsType
    ): Future[DetachLoadBalancerTargetGroupsResultType] =
      service.detachLoadBalancerTargetGroups(params).promise().toFuture
    @inline def detachLoadBalancersFuture(params: DetachLoadBalancersType): Future[DetachLoadBalancersResultType] =
      service.detachLoadBalancers(params).promise().toFuture
    @inline def disableMetricsCollectionFuture(params: DisableMetricsCollectionQuery): Future[js.Object] =
      service.disableMetricsCollection(params).promise().toFuture
    @inline def enableMetricsCollectionFuture(params: EnableMetricsCollectionQuery): Future[js.Object] =
      service.enableMetricsCollection(params).promise().toFuture
    @inline def enterStandbyFuture(params: EnterStandbyQuery): Future[EnterStandbyAnswer] =
      service.enterStandby(params).promise().toFuture
    @inline def executePolicyFuture(params: ExecutePolicyType): Future[js.Object] =
      service.executePolicy(params).promise().toFuture
    @inline def exitStandbyFuture(params: ExitStandbyQuery): Future[ExitStandbyAnswer] =
      service.exitStandby(params).promise().toFuture
    @inline def putLifecycleHookFuture(params: PutLifecycleHookType): Future[PutLifecycleHookAnswer] =
      service.putLifecycleHook(params).promise().toFuture
    @inline def putNotificationConfigurationFuture(params: PutNotificationConfigurationType): Future[js.Object] =
      service.putNotificationConfiguration(params).promise().toFuture
    @inline def putScalingPolicyFuture(params: PutScalingPolicyType): Future[PolicyARNType] =
      service.putScalingPolicy(params).promise().toFuture
    @inline def putScheduledUpdateGroupActionFuture(params: PutScheduledUpdateGroupActionType): Future[js.Object] =
      service.putScheduledUpdateGroupAction(params).promise().toFuture
    @inline def recordLifecycleActionHeartbeatFuture(
        params: RecordLifecycleActionHeartbeatType
    ): Future[RecordLifecycleActionHeartbeatAnswer] = service.recordLifecycleActionHeartbeat(params).promise().toFuture
    @inline def resumeProcessesFuture(params: ScalingProcessQuery): Future[js.Object] =
      service.resumeProcesses(params).promise().toFuture
    @inline def setDesiredCapacityFuture(params: SetDesiredCapacityType): Future[js.Object] =
      service.setDesiredCapacity(params).promise().toFuture
    @inline def setInstanceHealthFuture(params: SetInstanceHealthQuery): Future[js.Object] =
      service.setInstanceHealth(params).promise().toFuture
    @inline def setInstanceProtectionFuture(params: SetInstanceProtectionQuery): Future[SetInstanceProtectionAnswer] =
      service.setInstanceProtection(params).promise().toFuture
    @inline def suspendProcessesFuture(params: ScalingProcessQuery): Future[js.Object] =
      service.suspendProcesses(params).promise().toFuture
    @inline def terminateInstanceInAutoScalingGroupFuture(
        params: TerminateInstanceInAutoScalingGroupType
    ): Future[ActivityType] = service.terminateInstanceInAutoScalingGroup(params).promise().toFuture
    @inline def updateAutoScalingGroupFuture(params: UpdateAutoScalingGroupType): Future[js.Object] =
      service.updateAutoScalingGroup(params).promise().toFuture
  }
}

package autoscaling {
  @js.native
  @JSImport("aws-sdk", "AutoScaling")
  class AutoScaling() extends js.Object {
    def this(config: AWSConfig) = this()

    def attachInstances(params: AttachInstancesQuery): Request[js.Object] = js.native
    def attachLoadBalancerTargetGroups(
        params: AttachLoadBalancerTargetGroupsType
    ): Request[AttachLoadBalancerTargetGroupsResultType]                                             = js.native
    def attachLoadBalancers(params: AttachLoadBalancersType): Request[AttachLoadBalancersResultType] = js.native
    def batchDeleteScheduledAction(params: BatchDeleteScheduledActionType): Request[BatchDeleteScheduledActionAnswer] =
      js.native
    def batchPutScheduledUpdateGroupAction(
        params: BatchPutScheduledUpdateGroupActionType
    ): Request[BatchPutScheduledUpdateGroupActionAnswer]                                                     = js.native
    def completeLifecycleAction(params: CompleteLifecycleActionType): Request[CompleteLifecycleActionAnswer] = js.native
    def createAutoScalingGroup(params: CreateAutoScalingGroupType): Request[js.Object]                       = js.native
    def createLaunchConfiguration(params: CreateLaunchConfigurationType): Request[js.Object]                 = js.native
    def createOrUpdateTags(params: CreateOrUpdateTagsType): Request[js.Object]                               = js.native
    def deleteAutoScalingGroup(params: DeleteAutoScalingGroupType): Request[js.Object]                       = js.native
    def deleteLaunchConfiguration(params: LaunchConfigurationNameType): Request[js.Object]                   = js.native
    def deleteLifecycleHook(params: DeleteLifecycleHookType): Request[DeleteLifecycleHookAnswer]             = js.native
    def deleteNotificationConfiguration(params: DeleteNotificationConfigurationType): Request[js.Object]     = js.native
    def deletePolicy(params: DeletePolicyType): Request[js.Object]                                           = js.native
    def deleteScheduledAction(params: DeleteScheduledActionType): Request[js.Object]                         = js.native
    def deleteTags(params: DeleteTagsType): Request[js.Object]                                               = js.native
    def describeAccountLimits(): Request[DescribeAccountLimitsAnswer]                                        = js.native
    def describeAdjustmentTypes(): Request[DescribeAdjustmentTypesAnswer]                                    = js.native
    def describeAutoScalingGroups(params: AutoScalingGroupNamesType): Request[AutoScalingGroupsType]         = js.native
    def describeAutoScalingInstances(params: DescribeAutoScalingInstancesType): Request[AutoScalingInstancesType] =
      js.native
    def describeAutoScalingNotificationTypes(): Request[DescribeAutoScalingNotificationTypesAnswer] = js.native
    def describeLaunchConfigurations(params: LaunchConfigurationNamesType): Request[LaunchConfigurationsType] =
      js.native
    def describeLifecycleHookTypes(): Request[DescribeLifecycleHookTypesAnswer]                           = js.native
    def describeLifecycleHooks(params: DescribeLifecycleHooksType): Request[DescribeLifecycleHooksAnswer] = js.native
    def describeLoadBalancerTargetGroups(
        params: DescribeLoadBalancerTargetGroupsRequest
    ): Request[DescribeLoadBalancerTargetGroupsResponse]                                                    = js.native
    def describeLoadBalancers(params: DescribeLoadBalancersRequest): Request[DescribeLoadBalancersResponse] = js.native
    def describeMetricCollectionTypes(): Request[DescribeMetricCollectionTypesAnswer]                       = js.native
    def describeNotificationConfigurations(
        params: DescribeNotificationConfigurationsType
    ): Request[DescribeNotificationConfigurationsAnswer]                                              = js.native
    def describePolicies(params: DescribePoliciesType): Request[PoliciesType]                         = js.native
    def describeScalingActivities(params: DescribeScalingActivitiesType): Request[ActivitiesType]     = js.native
    def describeScalingProcessTypes(): Request[ProcessesType]                                         = js.native
    def describeScheduledActions(params: DescribeScheduledActionsType): Request[ScheduledActionsType] = js.native
    def describeTags(params: DescribeTagsType): Request[TagsType]                                     = js.native
    def describeTerminationPolicyTypes(): Request[DescribeTerminationPolicyTypesAnswer]               = js.native
    def detachInstances(params: DetachInstancesQuery): Request[DetachInstancesAnswer]                 = js.native
    def detachLoadBalancerTargetGroups(
        params: DetachLoadBalancerTargetGroupsType
    ): Request[DetachLoadBalancerTargetGroupsResultType]                                             = js.native
    def detachLoadBalancers(params: DetachLoadBalancersType): Request[DetachLoadBalancersResultType] = js.native
    def disableMetricsCollection(params: DisableMetricsCollectionQuery): Request[js.Object]          = js.native
    def enableMetricsCollection(params: EnableMetricsCollectionQuery): Request[js.Object]            = js.native
    def enterStandby(params: EnterStandbyQuery): Request[EnterStandbyAnswer]                         = js.native
    def executePolicy(params: ExecutePolicyType): Request[js.Object]                                 = js.native
    def exitStandby(params: ExitStandbyQuery): Request[ExitStandbyAnswer]                            = js.native
    def putLifecycleHook(params: PutLifecycleHookType): Request[PutLifecycleHookAnswer]              = js.native
    def putNotificationConfiguration(params: PutNotificationConfigurationType): Request[js.Object]   = js.native
    def putScalingPolicy(params: PutScalingPolicyType): Request[PolicyARNType]                       = js.native
    def putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType): Request[js.Object] = js.native
    def recordLifecycleActionHeartbeat(
        params: RecordLifecycleActionHeartbeatType
    ): Request[RecordLifecycleActionHeartbeatAnswer]                                                    = js.native
    def resumeProcesses(params: ScalingProcessQuery): Request[js.Object]                                = js.native
    def setDesiredCapacity(params: SetDesiredCapacityType): Request[js.Object]                          = js.native
    def setInstanceHealth(params: SetInstanceHealthQuery): Request[js.Object]                           = js.native
    def setInstanceProtection(params: SetInstanceProtectionQuery): Request[SetInstanceProtectionAnswer] = js.native
    def suspendProcesses(params: ScalingProcessQuery): Request[js.Object]                               = js.native
    def terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType): Request[ActivityType] =
      js.native
    def updateAutoScalingGroup(params: UpdateAutoScalingGroupType): Request[js.Object] = js.native
  }

  @js.native
  @Factory
  trait ActivitiesType extends js.Object {
    var Activities: Activities
    var NextToken: js.UndefOr[XmlString]
  }

  /**
    * Describes scaling activity, which is a long-running process that represents a change to your Auto Scaling group, such as changing its size or replacing an instance.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ActivityType extends js.Object {
    var Activity: js.UndefOr[Activity]
  }

  /**
    * Describes a policy adjustment type.
    */
  @js.native
  @Factory
  trait AdjustmentType extends js.Object {
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
  }

  /**
    * Describes an alarm.
    */
  @js.native
  @Factory
  trait Alarm extends js.Object {
    var AlarmARN: js.UndefOr[ResourceName]
    var AlarmName: js.UndefOr[XmlStringMaxLen255]
  }

  @js.native
  @Factory
  trait AttachInstancesQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  @js.native
  @Factory
  trait AttachLoadBalancerTargetGroupsResultType extends js.Object {}

  @js.native
  @Factory
  trait AttachLoadBalancerTargetGroupsType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var TargetGroupARNs: TargetGroupARNs
  }

  @js.native
  @Factory
  trait AttachLoadBalancersResultType extends js.Object {}

  @js.native
  @Factory
  trait AttachLoadBalancersType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LoadBalancerNames: LoadBalancerNames
  }

  /**
    * Describes an Auto Scaling group.
    */
  @js.native
  @Factory
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
    var MaxInstanceLifetime: js.UndefOr[MaxInstanceLifetime]
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

  @js.native
  @Factory
  trait AutoScalingGroupNamesType extends js.Object {
    var AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait AutoScalingGroupsType extends js.Object {
    var AutoScalingGroups: AutoScalingGroups
    var NextToken: js.UndefOr[XmlString]
  }

  /**
    * Describes an EC2 instance associated with an Auto Scaling group.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait AutoScalingInstancesType extends js.Object {
    var AutoScalingInstances: js.UndefOr[AutoScalingInstances]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait BatchDeleteScheduledActionAnswer extends js.Object {
    var FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests]
  }

  @js.native
  @Factory
  trait BatchDeleteScheduledActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScheduledActionNames: ScheduledActionNames
  }

  @js.native
  @Factory
  trait BatchPutScheduledUpdateGroupActionAnswer extends js.Object {
    var FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests]
  }

  @js.native
  @Factory
  trait BatchPutScheduledUpdateGroupActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  }

  /**
    * Describes a block device mapping.
    */
  @js.native
  @Factory
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: XmlStringMaxLen255
    var Ebs: js.UndefOr[Ebs]
    var NoDevice: js.UndefOr[NoDevice]
    var VirtualName: js.UndefOr[XmlStringMaxLen255]
  }

  @js.native
  @Factory
  trait CompleteLifecycleActionAnswer extends js.Object {}

  @js.native
  @Factory
  trait CompleteLifecycleActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleActionResult: LifecycleActionResult
    var LifecycleHookName: AsciiStringMaxLen255
    var InstanceId: js.UndefOr[XmlStringMaxLen19]
    var LifecycleActionToken: js.UndefOr[LifecycleActionToken]
  }

  @js.native
  @Factory
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
    var MaxInstanceLifetime: js.UndefOr[MaxInstanceLifetime]
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy]
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected]
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255]
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName]
    var Tags: js.UndefOr[Tags]
    var TargetGroupARNs: js.UndefOr[TargetGroupARNs]
    var TerminationPolicies: js.UndefOr[TerminationPolicies]
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateOrUpdateTagsType extends js.Object {
    var Tags: Tags
  }

  /**
    * Represents a CloudWatch metric of your choosing for a target tracking scaling policy to use with Amazon EC2 Auto Scaling.
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
  trait DeleteAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ForceDelete: js.UndefOr[ForceDelete]
  }

  @js.native
  @Factory
  trait DeleteLifecycleHookAnswer extends js.Object {}

  @js.native
  @Factory
  trait DeleteLifecycleHookType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleHookName: AsciiStringMaxLen255
  }

  @js.native
  @Factory
  trait DeleteNotificationConfigurationType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var TopicARN: ResourceName
  }

  @js.native
  @Factory
  trait DeletePolicyType extends js.Object {
    var PolicyName: ResourceName
    var AutoScalingGroupName: js.UndefOr[ResourceName]
  }

  @js.native
  @Factory
  trait DeleteScheduledActionType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScheduledActionName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteTagsType extends js.Object {
    var Tags: Tags
  }

  @js.native
  @Factory
  trait DescribeAccountLimitsAnswer extends js.Object {
    var MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups]
    var MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations]
    var NumberOfAutoScalingGroups: js.UndefOr[NumberOfAutoScalingGroups]
    var NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations]
  }

  @js.native
  @Factory
  trait DescribeAdjustmentTypesAnswer extends js.Object {
    var AdjustmentTypes: js.UndefOr[AdjustmentTypes]
  }

  @js.native
  @Factory
  trait DescribeAutoScalingInstancesType extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIds]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
    var AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes]
  }

  @js.native
  @Factory
  trait DescribeLifecycleHookTypesAnswer extends js.Object {
    var LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes]
  }

  @js.native
  @Factory
  trait DescribeLifecycleHooksAnswer extends js.Object {
    var LifecycleHooks: js.UndefOr[LifecycleHooks]
  }

  @js.native
  @Factory
  trait DescribeLifecycleHooksType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleHookNames: js.UndefOr[LifecycleHookNames]
  }

  @js.native
  @Factory
  trait DescribeLoadBalancerTargetGroupsRequest extends js.Object {
    var AutoScalingGroupName: ResourceName
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribeLoadBalancerTargetGroupsResponse extends js.Object {
    var LoadBalancerTargetGroups: js.UndefOr[LoadBalancerTargetGroupStates]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribeLoadBalancersRequest extends js.Object {
    var AutoScalingGroupName: ResourceName
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribeLoadBalancersResponse extends js.Object {
    var LoadBalancers: js.UndefOr[LoadBalancerStates]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribeMetricCollectionTypesAnswer extends js.Object {
    var Granularities: js.UndefOr[MetricGranularityTypes]
    var Metrics: js.UndefOr[MetricCollectionTypes]
  }

  @js.native
  @Factory
  trait DescribeNotificationConfigurationsAnswer extends js.Object {
    var NotificationConfigurations: NotificationConfigurations
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribeNotificationConfigurationsType extends js.Object {
    var AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribePoliciesType extends js.Object {
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
    var PolicyNames: js.UndefOr[PolicyNames]
    var PolicyTypes: js.UndefOr[PolicyTypes]
  }

  @js.native
  @Factory
  trait DescribeScalingActivitiesType extends js.Object {
    var ActivityIds: js.UndefOr[ActivityIds]
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribeScheduledActionsType extends js.Object {
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var EndTime: js.UndefOr[TimestampType]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
    var ScheduledActionNames: js.UndefOr[ScheduledActionNames]
    var StartTime: js.UndefOr[TimestampType]
  }

  @js.native
  @Factory
  trait DescribeTagsType extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait DescribeTerminationPolicyTypesAnswer extends js.Object {
    var TerminationPolicyTypes: js.UndefOr[TerminationPolicies]
  }

  @js.native
  @Factory
  trait DetachInstancesAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  @js.native
  @Factory
  trait DetachInstancesQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  @js.native
  @Factory
  trait DetachLoadBalancerTargetGroupsResultType extends js.Object {}

  @js.native
  @Factory
  trait DetachLoadBalancerTargetGroupsType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var TargetGroupARNs: TargetGroupARNs
  }

  @js.native
  @Factory
  trait DetachLoadBalancersResultType extends js.Object {}

  @js.native
  @Factory
  trait DetachLoadBalancersType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LoadBalancerNames: LoadBalancerNames
  }

  @js.native
  @Factory
  trait DisableMetricsCollectionQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var Metrics: js.UndefOr[Metrics]
  }

  /**
    * Describes an Amazon EBS volume. Used in combination with <a>BlockDeviceMapping</a>.
    */
  @js.native
  @Factory
  trait Ebs extends js.Object {
    var DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination]
    var Encrypted: js.UndefOr[BlockDeviceEbsEncrypted]
    var Iops: js.UndefOr[BlockDeviceEbsIops]
    var SnapshotId: js.UndefOr[XmlStringMaxLen255]
    var VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize]
    var VolumeType: js.UndefOr[BlockDeviceEbsVolumeType]
  }

  @js.native
  @Factory
  trait EnableMetricsCollectionQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var Granularity: XmlStringMaxLen255
    var Metrics: js.UndefOr[Metrics]
  }

  /**
    * Describes an enabled metric.
    */
  @js.native
  @Factory
  trait EnabledMetric extends js.Object {
    var Granularity: js.UndefOr[XmlStringMaxLen255]
    var Metric: js.UndefOr[XmlStringMaxLen255]
  }

  @js.native
  @Factory
  trait EnterStandbyAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  @js.native
  @Factory
  trait EnterStandbyQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  @js.native
  @Factory
  trait ExecutePolicyType extends js.Object {
    var PolicyName: ResourceName
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var BreachThreshold: js.UndefOr[MetricScale]
    var HonorCooldown: js.UndefOr[HonorCooldown]
    var MetricValue: js.UndefOr[MetricScale]
  }

  @js.native
  @Factory
  trait ExitStandbyAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  @js.native
  @Factory
  trait ExitStandbyQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var InstanceIds: js.UndefOr[InstanceIds]
  }

  /**
    * Describes a scheduled action that could not be created, updated, or deleted.
    */
  @js.native
  @Factory
  trait FailedScheduledUpdateGroupActionRequest extends js.Object {
    var ScheduledActionName: XmlStringMaxLen255
    var ErrorCode: js.UndefOr[XmlStringMaxLen64]
    var ErrorMessage: js.UndefOr[XmlString]
  }

  /**
    * Describes a filter.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: js.UndefOr[XmlString]
    var Values: js.UndefOr[Values]
  }

  /**
    * Describes an EC2 instance.
    */
  @js.native
  @Factory
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

  /**
    * Describes whether detailed monitoring is enabled for the Auto Scaling instances.
    */
  @js.native
  @Factory
  trait InstanceMonitoring extends js.Object {
    var Enabled: js.UndefOr[MonitoringEnabled]
  }

  /**
    * Describes an instances distribution for an Auto Scaling group with <a>MixedInstancesPolicy</a>.
    *  The instances distribution specifies the distribution of On-Demand Instances and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill On-Demand and Spot capacity.
    *  When you update <code>SpotAllocationStrategy</code>, <code>SpotInstancePools</code>, or <code>SpotMaxPrice</code>, this update action does not deploy any changes across the running Amazon EC2 instances in the group. Your existing Spot Instances continue to run as long as the maximum price for those instances is higher than the current Spot price. When scale out occurs, Amazon EC2 Auto Scaling launches instances based on the new settings. When scale in occurs, Amazon EC2 Auto Scaling terminates instances according to the group's termination policies.
    */
  @js.native
  @Factory
  trait InstancesDistribution extends js.Object {
    var OnDemandAllocationStrategy: js.UndefOr[XmlString]
    var OnDemandBaseCapacity: js.UndefOr[OnDemandBaseCapacity]
    var OnDemandPercentageAboveBaseCapacity: js.UndefOr[OnDemandPercentageAboveBaseCapacity]
    var SpotAllocationStrategy: js.UndefOr[XmlString]
    var SpotInstancePools: js.UndefOr[SpotInstancePools]
    var SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice]
  }

  /**
    * Describes a launch configuration.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait LaunchConfigurationNameType extends js.Object {
    var LaunchConfigurationName: ResourceName
  }

  @js.native
  @Factory
  trait LaunchConfigurationNamesType extends js.Object {
    var LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[XmlString]
  }

  @js.native
  @Factory
  trait LaunchConfigurationsType extends js.Object {
    var LaunchConfigurations: LaunchConfigurations
    var NextToken: js.UndefOr[XmlString]
  }

  /**
    * Describes a launch template and overrides.
    *  The overrides are used to override the instance type specified by the launch template with multiple instance types that can be used to launch On-Demand Instances and Spot Instances.
    *  When you update the launch template or overrides, existing Amazon EC2 instances continue to run. When scale out occurs, Amazon EC2 Auto Scaling launches instances to match the new settings. When scale in occurs, Amazon EC2 Auto Scaling terminates instances according to the group's termination policies.
    */
  @js.native
  @Factory
  trait LaunchTemplate extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification]
    var Overrides: js.UndefOr[Overrides]
  }

  /**
    * Describes an override for a launch template.
    */
  @js.native
  @Factory
  trait LaunchTemplateOverrides extends js.Object {
    var InstanceType: js.UndefOr[XmlStringMaxLen255]
    var WeightedCapacity: js.UndefOr[XmlStringMaxLen32]
  }

  /**
    * Describes a launch template and the launch template version.
    *  The launch template that is specified must be configured for use with an Auto Scaling group. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html|Creating a Launch Template for an Auto Scaling Group]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  @Factory
  trait LaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[XmlStringMaxLen255]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Version: js.UndefOr[XmlStringMaxLen255]
  }

  /**
    * Describes a lifecycle hook, which tells Amazon EC2 Auto Scaling that you want to perform an action whenever it launches instances or terminates instances. Used in response to <a>DescribeLifecycleHooks</a>.
    */
  @js.native
  @Factory
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

  /**
    * Describes a lifecycle hook. Used in combination with <a>CreateAutoScalingGroup</a>.
    *  A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches (before it is put into service) or as the instance terminates (before it is fully terminated).
    *  This step is a part of the procedure for creating a lifecycle hook for an Auto Scaling group:
    *  <ol> * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.
    *  * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
    *  * ```Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.```
    *  * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using <a>RecordLifecycleActionHeartbeat</a>.
    *  * If you finish before the timeout period ends, complete the lifecycle action using <a>CompleteLifecycleAction</a>.
    *  </ol> For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html|Amazon EC2 Auto Scaling Lifecycle Hooks]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    *  You can view the lifecycle hooks for an Auto Scaling group using <a>DescribeLifecycleHooks</a>. You can modify an existing lifecycle hook or create new lifecycle hooks using <a>PutLifecycleHook</a>. If you are no longer using a lifecycle hook, you can delete it using <a>DeleteLifecycleHook</a>.
    */
  @js.native
  @Factory
  trait LifecycleHookSpecification extends js.Object {
    var LifecycleHookName: AsciiStringMaxLen255
    var LifecycleTransition: LifecycleTransition
    var DefaultResult: js.UndefOr[LifecycleActionResult]
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout]
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023]
    var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName]
    var RoleARN: js.UndefOr[ResourceName]
  }

  @js.native
  sealed trait LifecycleState extends js.Any
  object LifecycleState extends js.Object {
    val Pending               = "Pending".asInstanceOf[LifecycleState]
    val `Pending:Wait`        = "Pending:Wait".asInstanceOf[LifecycleState]
    val `Pending:Proceed`     = "Pending:Proceed".asInstanceOf[LifecycleState]
    val Quarantined           = "Quarantined".asInstanceOf[LifecycleState]
    val InService             = "InService".asInstanceOf[LifecycleState]
    val Terminating           = "Terminating".asInstanceOf[LifecycleState]
    val `Terminating:Wait`    = "Terminating:Wait".asInstanceOf[LifecycleState]
    val `Terminating:Proceed` = "Terminating:Proceed".asInstanceOf[LifecycleState]
    val Terminated            = "Terminated".asInstanceOf[LifecycleState]
    val Detaching             = "Detaching".asInstanceOf[LifecycleState]
    val Detached              = "Detached".asInstanceOf[LifecycleState]
    val EnteringStandby       = "EnteringStandby".asInstanceOf[LifecycleState]
    val Standby               = "Standby".asInstanceOf[LifecycleState]

    val values = js.Object.freeze(
      js.Array(
        Pending,
        `Pending:Wait`,
        `Pending:Proceed`,
        Quarantined,
        InService,
        Terminating,
        `Terminating:Wait`,
        `Terminating:Proceed`,
        Terminated,
        Detaching,
        Detached,
        EnteringStandby,
        Standby
      )
    )
  }

  /**
    * Describes the state of a Classic Load Balancer.
    *  If you specify a load balancer when creating the Auto Scaling group, the state of the load balancer is <code>InService</code>.
    *  If you attach a load balancer to an existing Auto Scaling group, the initial state is <code>Adding</code>. The state transitions to <code>Added</code> after all instances in the group are registered with the load balancer. If Elastic Load Balancing health checks are enabled for the load balancer, the state transitions to <code>InService</code> after at least one instance in the group passes the health check. If EC2 health checks are enabled instead, the load balancer remains in the <code>Added</code> state.
    */
  @js.native
  @Factory
  trait LoadBalancerState extends js.Object {
    var LoadBalancerName: js.UndefOr[XmlStringMaxLen255]
    var State: js.UndefOr[XmlStringMaxLen255]
  }

  /**
    * Describes the state of a target group.
    *  If you attach a target group to an existing Auto Scaling group, the initial state is <code>Adding</code>. The state transitions to <code>Added</code> after all Auto Scaling instances are registered with the target group. If Elastic Load Balancing health checks are enabled, the state transitions to <code>InService</code> after at least one Auto Scaling instance passes the health check. If EC2 health checks are enabled instead, the target group remains in the <code>Added</code> state.
    */
  @js.native
  @Factory
  trait LoadBalancerTargetGroupState extends js.Object {
    var LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511]
    var State: js.UndefOr[XmlStringMaxLen255]
  }

  /**
    * Describes a metric.
    */
  @js.native
  @Factory
  trait MetricCollectionType extends js.Object {
    var Metric: js.UndefOr[XmlStringMaxLen255]
  }

  /**
    * Describes the dimension of a metric.
    */
  @js.native
  @Factory
  trait MetricDimension extends js.Object {
    var Name: MetricDimensionName
    var Value: MetricDimensionValue
  }

  /**
    * Describes a granularity of a metric.
    */
  @js.native
  @Factory
  trait MetricGranularityType extends js.Object {
    var Granularity: js.UndefOr[XmlStringMaxLen255]
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
    val ASGAverageCPUUtilization = "ASGAverageCPUUtilization".asInstanceOf[MetricType]
    val ASGAverageNetworkIn      = "ASGAverageNetworkIn".asInstanceOf[MetricType]
    val ASGAverageNetworkOut     = "ASGAverageNetworkOut".asInstanceOf[MetricType]
    val ALBRequestCountPerTarget = "ALBRequestCountPerTarget".asInstanceOf[MetricType]

    val values = js.Object.freeze(
      js.Array(ASGAverageCPUUtilization, ASGAverageNetworkIn, ASGAverageNetworkOut, ALBRequestCountPerTarget)
    )
  }

  /**
    * Describes a mixed instances policy for an Auto Scaling group. With mixed instances, your Auto Scaling group can provision a combination of On-Demand Instances and Spot Instances across multiple instance types. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html|Auto Scaling Groups with Multiple Instance Types and Purchase Options]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    *  You can create a mixed instances policy for a new Auto Scaling group, or you can create it for an existing group by updating the group to specify <code>MixedInstancesPolicy</code> as the top-level parameter instead of a launch configuration or template. For more information, see <a>CreateAutoScalingGroup</a> and <a>UpdateAutoScalingGroup</a>.
    */
  @js.native
  @Factory
  trait MixedInstancesPolicy extends js.Object {
    var InstancesDistribution: js.UndefOr[InstancesDistribution]
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  /**
    * Describes a notification.
    */
  @js.native
  @Factory
  trait NotificationConfiguration extends js.Object {
    var AutoScalingGroupName: js.UndefOr[ResourceName]
    var NotificationType: js.UndefOr[XmlStringMaxLen255]
    var TopicARN: js.UndefOr[ResourceName]
  }

  @js.native
  @Factory
  trait PoliciesType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScalingPolicies: js.UndefOr[ScalingPolicies]
  }

  /**
    * Contains the output of PutScalingPolicy.
    */
  @js.native
  @Factory
  trait PolicyARNType extends js.Object {
    var Alarms: js.UndefOr[Alarms]
    var PolicyARN: js.UndefOr[ResourceName]
  }

  /**
    * Represents a predefined metric for a target tracking scaling policy to use with Amazon EC2 Auto Scaling.
    */
  @js.native
  @Factory
  trait PredefinedMetricSpecification extends js.Object {
    var PredefinedMetricType: MetricType
    var ResourceLabel: js.UndefOr[XmlStringMaxLen1023]
  }

  /**
    * Describes a process type.
    *  For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html#process-types|Scaling Processes]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  @Factory
  trait ProcessType extends js.Object {
    var ProcessName: XmlStringMaxLen255
  }

  @js.native
  @Factory
  trait ProcessesType extends js.Object {
    var Processes: js.UndefOr[Processes]
  }

  @js.native
  @Factory
  trait PutLifecycleHookAnswer extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PutNotificationConfigurationType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var NotificationTypes: AutoScalingNotificationTypes
    var TopicARN: ResourceName
  }

  @js.native
  @Factory
  trait PutScalingPolicyType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var PolicyName: XmlStringMaxLen255
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
    var Cooldown: js.UndefOr[Cooldown]
    var Enabled: js.UndefOr[ScalingPolicyEnabled]
    var EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup]
    var MetricAggregationType: js.UndefOr[XmlStringMaxLen32]
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude]
    var MinAdjustmentStep: js.UndefOr[MinAdjustmentStep]
    var PolicyType: js.UndefOr[XmlStringMaxLen64]
    var ScalingAdjustment: js.UndefOr[PolicyIncrement]
    var StepAdjustments: js.UndefOr[StepAdjustments]
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait RecordLifecycleActionHeartbeatAnswer extends js.Object {}

  @js.native
  @Factory
  trait RecordLifecycleActionHeartbeatType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var LifecycleHookName: AsciiStringMaxLen255
    var InstanceId: js.UndefOr[XmlStringMaxLen19]
    var LifecycleActionToken: js.UndefOr[LifecycleActionToken]
  }

  @js.native
  sealed trait ScalingActivityStatusCode extends js.Any
  object ScalingActivityStatusCode extends js.Object {
    val PendingSpotBidPlacement         = "PendingSpotBidPlacement".asInstanceOf[ScalingActivityStatusCode]
    val WaitingForSpotInstanceRequestId = "WaitingForSpotInstanceRequestId".asInstanceOf[ScalingActivityStatusCode]
    val WaitingForSpotInstanceId        = "WaitingForSpotInstanceId".asInstanceOf[ScalingActivityStatusCode]
    val WaitingForInstanceId            = "WaitingForInstanceId".asInstanceOf[ScalingActivityStatusCode]
    val PreInService                    = "PreInService".asInstanceOf[ScalingActivityStatusCode]
    val InProgress                      = "InProgress".asInstanceOf[ScalingActivityStatusCode]
    val WaitingForELBConnectionDraining = "WaitingForELBConnectionDraining".asInstanceOf[ScalingActivityStatusCode]
    val MidLifecycleAction              = "MidLifecycleAction".asInstanceOf[ScalingActivityStatusCode]
    val WaitingForInstanceWarmup        = "WaitingForInstanceWarmup".asInstanceOf[ScalingActivityStatusCode]
    val Successful                      = "Successful".asInstanceOf[ScalingActivityStatusCode]
    val Failed                          = "Failed".asInstanceOf[ScalingActivityStatusCode]
    val Cancelled                       = "Cancelled".asInstanceOf[ScalingActivityStatusCode]

    val values = js.Object.freeze(
      js.Array(
        PendingSpotBidPlacement,
        WaitingForSpotInstanceRequestId,
        WaitingForSpotInstanceId,
        WaitingForInstanceId,
        PreInService,
        InProgress,
        WaitingForELBConnectionDraining,
        MidLifecycleAction,
        WaitingForInstanceWarmup,
        Successful,
        Failed,
        Cancelled
      )
    )
  }

  /**
    * Describes a scaling policy.
    */
  @js.native
  @Factory
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
    var ScalingAdjustment: js.UndefOr[PolicyIncrement]
    var StepAdjustments: js.UndefOr[StepAdjustments]
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration]
  }

  @js.native
  @Factory
  trait ScalingProcessQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var ScalingProcesses: js.UndefOr[ProcessNames]
  }

  @js.native
  @Factory
  trait ScheduledActionsType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions]
  }

  /**
    * Describes a scheduled scaling action. Used in response to <a>DescribeScheduledActions</a>.
    */
  @js.native
  @Factory
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

  /**
    * Describes one or more scheduled scaling action updates for a specified Auto Scaling group. Used in combination with <a>BatchPutScheduledUpdateGroupAction</a>.
    *  When updating a scheduled scaling action, all optional parameters are left unchanged if not specified.
    */
  @js.native
  @Factory
  trait ScheduledUpdateGroupActionRequest extends js.Object {
    var ScheduledActionName: XmlStringMaxLen255
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var EndTime: js.UndefOr[TimestampType]
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize]
    var MinSize: js.UndefOr[AutoScalingGroupMinSize]
    var Recurrence: js.UndefOr[XmlStringMaxLen255]
    var StartTime: js.UndefOr[TimestampType]
  }

  @js.native
  @Factory
  trait SetDesiredCapacityType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    var HonorCooldown: js.UndefOr[HonorCooldown]
  }

  @js.native
  @Factory
  trait SetInstanceHealthQuery extends js.Object {
    var HealthStatus: XmlStringMaxLen32
    var InstanceId: XmlStringMaxLen19
    var ShouldRespectGracePeriod: js.UndefOr[ShouldRespectGracePeriod]
  }

  @js.native
  @Factory
  trait SetInstanceProtectionAnswer extends js.Object {}

  @js.native
  @Factory
  trait SetInstanceProtectionQuery extends js.Object {
    var AutoScalingGroupName: ResourceName
    var InstanceIds: InstanceIds
    var ProtectedFromScaleIn: ProtectedFromScaleIn
  }

  /**
    * Describes an adjustment based on the difference between the value of the aggregated CloudWatch metric and the breach threshold that you've defined for the alarm. Used in combination with <a>PutScalingPolicy</a>.
    *  For the following examples, suppose that you have an alarm with a breach threshold of 50:
    * * To trigger the adjustment when the metric is greater than or equal to 50 and less than 60, specify a lower bound of 0 and an upper bound of 10.
    *  * To trigger the adjustment when the metric is greater than 40 and less than or equal to 50, specify a lower bound of -10 and an upper bound of 0.
    * There are a few rules for the step adjustments for your step policy:
    * * The ranges of your step adjustments can't overlap or have a gap.
    *  * At most, one step adjustment can have a null lower bound. If one step adjustment has a negative lower bound, then there must be a step adjustment with a null lower bound.
    *  * At most, one step adjustment can have a null upper bound. If one step adjustment has a positive upper bound, then there must be a step adjustment with a null upper bound.
    *  * The upper and lower bound can't be null in the same step adjustment.
    */
  @js.native
  @Factory
  trait StepAdjustment extends js.Object {
    var ScalingAdjustment: PolicyIncrement
    var MetricIntervalLowerBound: js.UndefOr[MetricScale]
    var MetricIntervalUpperBound: js.UndefOr[MetricScale]
  }

  /**
    * Describes an automatic scaling process that has been suspended. For more information, see <a>ProcessType</a>.
    */
  @js.native
  @Factory
  trait SuspendedProcess extends js.Object {
    var ProcessName: js.UndefOr[XmlStringMaxLen255]
    var SuspensionReason: js.UndefOr[XmlStringMaxLen255]
  }

  /**
    * Describes a tag for an Auto Scaling group.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var PropagateAtLaunch: js.UndefOr[PropagateAtLaunch]
    var ResourceId: js.UndefOr[XmlString]
    var ResourceType: js.UndefOr[XmlString]
    var Value: js.UndefOr[TagValue]
  }

  /**
    * Describes a tag for an Auto Scaling group.
    */
  @js.native
  @Factory
  trait TagDescription extends js.Object {
    var Key: js.UndefOr[TagKey]
    var PropagateAtLaunch: js.UndefOr[PropagateAtLaunch]
    var ResourceId: js.UndefOr[XmlString]
    var ResourceType: js.UndefOr[XmlString]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagsType extends js.Object {
    var NextToken: js.UndefOr[XmlString]
    var Tags: js.UndefOr[TagDescriptionList]
  }

  /**
    * Represents a target tracking scaling policy configuration to use with Amazon EC2 Auto Scaling.
    */
  @js.native
  @Factory
  trait TargetTrackingConfiguration extends js.Object {
    var TargetValue: MetricScale
    var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification]
    var DisableScaleIn: js.UndefOr[DisableScaleIn]
    var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification]
  }

  @js.native
  @Factory
  trait TerminateInstanceInAutoScalingGroupType extends js.Object {
    var InstanceId: XmlStringMaxLen19
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }

  @js.native
  @Factory
  trait UpdateAutoScalingGroupType extends js.Object {
    var AutoScalingGroupName: ResourceName
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var DefaultCooldown: js.UndefOr[Cooldown]
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity]
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod]
    var HealthCheckType: js.UndefOr[XmlStringMaxLen32]
    var LaunchConfigurationName: js.UndefOr[ResourceName]
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
}
