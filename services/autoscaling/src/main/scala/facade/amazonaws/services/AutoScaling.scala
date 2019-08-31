package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

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
  type LifecycleState                           = String
  type LifecycleTransition                      = String
  type LoadBalancerNames                        = js.Array[XmlStringMaxLen255]
  type LoadBalancerStates                       = js.Array[LoadBalancerState]
  type LoadBalancerTargetGroupStates            = js.Array[LoadBalancerTargetGroupState]
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
  type MetricStatistic                          = String
  type MetricType                               = String
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
  type ScalingActivityStatusCode           = String
  type ScalingPolicies                     = js.Array[ScalingPolicy]
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

    def attachInstancesFuture(params: AttachInstancesQuery): Future[js.Object] =
      service.attachInstances(params).promise.toFuture
    def attachLoadBalancerTargetGroupsFuture(
        params: AttachLoadBalancerTargetGroupsType
    ): Future[AttachLoadBalancerTargetGroupsResultType] =
      service.attachLoadBalancerTargetGroups(params).promise.toFuture
    def attachLoadBalancersFuture(params: AttachLoadBalancersType): Future[AttachLoadBalancersResultType] =
      service.attachLoadBalancers(params).promise.toFuture
    def batchDeleteScheduledActionFuture(
        params: BatchDeleteScheduledActionType
    ): Future[BatchDeleteScheduledActionAnswer] = service.batchDeleteScheduledAction(params).promise.toFuture
    def batchPutScheduledUpdateGroupActionFuture(
        params: BatchPutScheduledUpdateGroupActionType
    ): Future[BatchPutScheduledUpdateGroupActionAnswer] =
      service.batchPutScheduledUpdateGroupAction(params).promise.toFuture
    def completeLifecycleActionFuture(params: CompleteLifecycleActionType): Future[CompleteLifecycleActionAnswer] =
      service.completeLifecycleAction(params).promise.toFuture
    def createAutoScalingGroupFuture(params: CreateAutoScalingGroupType): Future[js.Object] =
      service.createAutoScalingGroup(params).promise.toFuture
    def createLaunchConfigurationFuture(params: CreateLaunchConfigurationType): Future[js.Object] =
      service.createLaunchConfiguration(params).promise.toFuture
    def createOrUpdateTagsFuture(params: CreateOrUpdateTagsType): Future[js.Object] =
      service.createOrUpdateTags(params).promise.toFuture
    def deleteAutoScalingGroupFuture(params: DeleteAutoScalingGroupType): Future[js.Object] =
      service.deleteAutoScalingGroup(params).promise.toFuture
    def deleteLaunchConfigurationFuture(params: LaunchConfigurationNameType): Future[js.Object] =
      service.deleteLaunchConfiguration(params).promise.toFuture
    def deleteLifecycleHookFuture(params: DeleteLifecycleHookType): Future[DeleteLifecycleHookAnswer] =
      service.deleteLifecycleHook(params).promise.toFuture
    def deleteNotificationConfigurationFuture(params: DeleteNotificationConfigurationType): Future[js.Object] =
      service.deleteNotificationConfiguration(params).promise.toFuture
    def deletePolicyFuture(params: DeletePolicyType): Future[js.Object] = service.deletePolicy(params).promise.toFuture
    def deleteScheduledActionFuture(params: DeleteScheduledActionType): Future[js.Object] =
      service.deleteScheduledAction(params).promise.toFuture
    def deleteTagsFuture(params: DeleteTagsType): Future[js.Object] = service.deleteTags(params).promise.toFuture
    def describeAccountLimitsFuture(): Future[DescribeAccountLimitsAnswer] =
      service.describeAccountLimits().promise.toFuture
    def describeAdjustmentTypesFuture(): Future[DescribeAdjustmentTypesAnswer] =
      service.describeAdjustmentTypes().promise.toFuture
    def describeAutoScalingGroupsFuture(params: AutoScalingGroupNamesType): Future[AutoScalingGroupsType] =
      service.describeAutoScalingGroups(params).promise.toFuture
    def describeAutoScalingInstancesFuture(params: DescribeAutoScalingInstancesType): Future[AutoScalingInstancesType] =
      service.describeAutoScalingInstances(params).promise.toFuture
    def describeAutoScalingNotificationTypesFuture(): Future[DescribeAutoScalingNotificationTypesAnswer] =
      service.describeAutoScalingNotificationTypes().promise.toFuture
    def describeLaunchConfigurationsFuture(params: LaunchConfigurationNamesType): Future[LaunchConfigurationsType] =
      service.describeLaunchConfigurations(params).promise.toFuture
    def describeLifecycleHookTypesFuture(): Future[DescribeLifecycleHookTypesAnswer] =
      service.describeLifecycleHookTypes().promise.toFuture
    def describeLifecycleHooksFuture(params: DescribeLifecycleHooksType): Future[DescribeLifecycleHooksAnswer] =
      service.describeLifecycleHooks(params).promise.toFuture
    def describeLoadBalancerTargetGroupsFuture(
        params: DescribeLoadBalancerTargetGroupsRequest
    ): Future[DescribeLoadBalancerTargetGroupsResponse] =
      service.describeLoadBalancerTargetGroups(params).promise.toFuture
    def describeLoadBalancersFuture(params: DescribeLoadBalancersRequest): Future[DescribeLoadBalancersResponse] =
      service.describeLoadBalancers(params).promise.toFuture
    def describeMetricCollectionTypesFuture(): Future[DescribeMetricCollectionTypesAnswer] =
      service.describeMetricCollectionTypes().promise.toFuture
    def describeNotificationConfigurationsFuture(
        params: DescribeNotificationConfigurationsType
    ): Future[DescribeNotificationConfigurationsAnswer] =
      service.describeNotificationConfigurations(params).promise.toFuture
    def describePoliciesFuture(params: DescribePoliciesType): Future[PoliciesType] =
      service.describePolicies(params).promise.toFuture
    def describeScalingActivitiesFuture(params: DescribeScalingActivitiesType): Future[ActivitiesType] =
      service.describeScalingActivities(params).promise.toFuture
    def describeScalingProcessTypesFuture(): Future[ProcessesType] =
      service.describeScalingProcessTypes().promise.toFuture
    def describeScheduledActionsFuture(params: DescribeScheduledActionsType): Future[ScheduledActionsType] =
      service.describeScheduledActions(params).promise.toFuture
    def describeTagsFuture(params: DescribeTagsType): Future[TagsType] = service.describeTags(params).promise.toFuture
    def describeTerminationPolicyTypesFuture(): Future[DescribeTerminationPolicyTypesAnswer] =
      service.describeTerminationPolicyTypes().promise.toFuture
    def detachInstancesFuture(params: DetachInstancesQuery): Future[DetachInstancesAnswer] =
      service.detachInstances(params).promise.toFuture
    def detachLoadBalancerTargetGroupsFuture(
        params: DetachLoadBalancerTargetGroupsType
    ): Future[DetachLoadBalancerTargetGroupsResultType] =
      service.detachLoadBalancerTargetGroups(params).promise.toFuture
    def detachLoadBalancersFuture(params: DetachLoadBalancersType): Future[DetachLoadBalancersResultType] =
      service.detachLoadBalancers(params).promise.toFuture
    def disableMetricsCollectionFuture(params: DisableMetricsCollectionQuery): Future[js.Object] =
      service.disableMetricsCollection(params).promise.toFuture
    def enableMetricsCollectionFuture(params: EnableMetricsCollectionQuery): Future[js.Object] =
      service.enableMetricsCollection(params).promise.toFuture
    def enterStandbyFuture(params: EnterStandbyQuery): Future[EnterStandbyAnswer] =
      service.enterStandby(params).promise.toFuture
    def executePolicyFuture(params: ExecutePolicyType): Future[js.Object] =
      service.executePolicy(params).promise.toFuture
    def exitStandbyFuture(params: ExitStandbyQuery): Future[ExitStandbyAnswer] =
      service.exitStandby(params).promise.toFuture
    def putLifecycleHookFuture(params: PutLifecycleHookType): Future[PutLifecycleHookAnswer] =
      service.putLifecycleHook(params).promise.toFuture
    def putNotificationConfigurationFuture(params: PutNotificationConfigurationType): Future[js.Object] =
      service.putNotificationConfiguration(params).promise.toFuture
    def putScalingPolicyFuture(params: PutScalingPolicyType): Future[PolicyARNType] =
      service.putScalingPolicy(params).promise.toFuture
    def putScheduledUpdateGroupActionFuture(params: PutScheduledUpdateGroupActionType): Future[js.Object] =
      service.putScheduledUpdateGroupAction(params).promise.toFuture
    def recordLifecycleActionHeartbeatFuture(
        params: RecordLifecycleActionHeartbeatType
    ): Future[RecordLifecycleActionHeartbeatAnswer] = service.recordLifecycleActionHeartbeat(params).promise.toFuture
    def resumeProcessesFuture(params: ScalingProcessQuery): Future[js.Object] =
      service.resumeProcesses(params).promise.toFuture
    def setDesiredCapacityFuture(params: SetDesiredCapacityType): Future[js.Object] =
      service.setDesiredCapacity(params).promise.toFuture
    def setInstanceHealthFuture(params: SetInstanceHealthQuery): Future[js.Object] =
      service.setInstanceHealth(params).promise.toFuture
    def setInstanceProtectionFuture(params: SetInstanceProtectionQuery): Future[SetInstanceProtectionAnswer] =
      service.setInstanceProtection(params).promise.toFuture
    def suspendProcessesFuture(params: ScalingProcessQuery): Future[js.Object] =
      service.suspendProcesses(params).promise.toFuture
    def terminateInstanceInAutoScalingGroupFuture(
        params: TerminateInstanceInAutoScalingGroupType
    ): Future[ActivityType] = service.terminateInstanceInAutoScalingGroup(params).promise.toFuture
    def updateAutoScalingGroupFuture(params: UpdateAutoScalingGroupType): Future[js.Object] =
      service.updateAutoScalingGroup(params).promise.toFuture
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
  trait ActivitiesType extends js.Object {
    var Activities: Activities
    var NextToken: js.UndefOr[XmlString]
  }

  object ActivitiesType {
    def apply(
        Activities: Activities,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): ActivitiesType = {
      val __obj = js.Dictionary[js.Any](
        "Activities" -> Activities.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivitiesType]
    }
  }

  /**
    * Describes scaling activity, which is a long-running process that represents a change to your Auto Scaling group, such as changing its size or replacing an instance.
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
        StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): Activity = {
      val __obj = js.Dictionary[js.Any](
        "ActivityId"           -> ActivityId.asInstanceOf[js.Any],
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "Cause"                -> Cause.asInstanceOf[js.Any],
        "StartTime"            -> StartTime.asInstanceOf[js.Any],
        "StatusCode"           -> StatusCode.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      Progress.foreach(__v => __obj.update("Progress", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Activity]
    }
  }

  @js.native
  trait ActivityType extends js.Object {
    var Activity: js.UndefOr[Activity]
  }

  object ActivityType {
    def apply(
        Activity: js.UndefOr[Activity] = js.undefined
    ): ActivityType = {
      val __obj = js.Dictionary.empty[js.Any]
      Activity.foreach(__v => __obj.update("Activity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityType]
    }
  }

  /**
    * Describes a policy adjustment type.
    */
  @js.native
  trait AdjustmentType extends js.Object {
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255]
  }

  object AdjustmentType {
    def apply(
        AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): AdjustmentType = {
      val __obj = js.Dictionary.empty[js.Any]
      AdjustmentType.foreach(__v => __obj.update("AdjustmentType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdjustmentType]
    }
  }

  /**
    * Describes an alarm.
    */
  @js.native
  trait Alarm extends js.Object {
    var AlarmARN: js.UndefOr[ResourceName]
    var AlarmName: js.UndefOr[XmlStringMaxLen255]
  }

  object Alarm {
    def apply(
        AlarmARN: js.UndefOr[ResourceName] = js.undefined,
        AlarmName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): Alarm = {
      val __obj = js.Dictionary.empty[js.Any]
      AlarmARN.foreach(__v => __obj.update("AlarmARN", __v.asInstanceOf[js.Any]))
      AlarmName.foreach(__v => __obj.update("AlarmName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alarm]
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
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    ): AttachInstancesQuery = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachInstancesQuery]
    }
  }

  @js.native
  trait AttachLoadBalancerTargetGroupsResultType extends js.Object {}

  object AttachLoadBalancerTargetGroupsResultType {
    def apply(
        ): AttachLoadBalancerTargetGroupsResultType = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AttachLoadBalancerTargetGroupsResultType]
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
        TargetGroupARNs: TargetGroupARNs
    ): AttachLoadBalancerTargetGroupsType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TargetGroupARNs"      -> TargetGroupARNs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachLoadBalancerTargetGroupsType]
    }
  }

  @js.native
  trait AttachLoadBalancersResultType extends js.Object {}

  object AttachLoadBalancersResultType {
    def apply(
        ): AttachLoadBalancersResultType = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AttachLoadBalancersResultType]
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
        LoadBalancerNames: LoadBalancerNames
    ): AttachLoadBalancersType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LoadBalancerNames"    -> LoadBalancerNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachLoadBalancersType]
    }
  }

  /**
    * Describes an Auto Scaling group.
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
        VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
    ): AutoScalingGroup = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "AvailabilityZones"    -> AvailabilityZones.asInstanceOf[js.Any],
        "CreatedTime"          -> CreatedTime.asInstanceOf[js.Any],
        "DefaultCooldown"      -> DefaultCooldown.asInstanceOf[js.Any],
        "DesiredCapacity"      -> DesiredCapacity.asInstanceOf[js.Any],
        "HealthCheckType"      -> HealthCheckType.asInstanceOf[js.Any],
        "MaxSize"              -> MaxSize.asInstanceOf[js.Any],
        "MinSize"              -> MinSize.asInstanceOf[js.Any]
      )

      AutoScalingGroupARN.foreach(__v => __obj.update("AutoScalingGroupARN", __v.asInstanceOf[js.Any]))
      EnabledMetrics.foreach(__v => __obj.update("EnabledMetrics", __v.asInstanceOf[js.Any]))
      HealthCheckGracePeriod.foreach(__v => __obj.update("HealthCheckGracePeriod", __v.asInstanceOf[js.Any]))
      Instances.foreach(__v => __obj.update("Instances", __v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.update("LaunchConfigurationName", __v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.update("LaunchTemplate", __v.asInstanceOf[js.Any]))
      LoadBalancerNames.foreach(__v => __obj.update("LoadBalancerNames", __v.asInstanceOf[js.Any]))
      MixedInstancesPolicy.foreach(__v => __obj.update("MixedInstancesPolicy", __v.asInstanceOf[js.Any]))
      NewInstancesProtectedFromScaleIn.foreach(
        __v => __obj.update("NewInstancesProtectedFromScaleIn", __v.asInstanceOf[js.Any])
      )
      PlacementGroup.foreach(__v => __obj.update("PlacementGroup", __v.asInstanceOf[js.Any]))
      ServiceLinkedRoleARN.foreach(__v => __obj.update("ServiceLinkedRoleARN", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SuspendedProcesses.foreach(__v => __obj.update("SuspendedProcesses", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TargetGroupARNs.foreach(__v => __obj.update("TargetGroupARNs", __v.asInstanceOf[js.Any]))
      TerminationPolicies.foreach(__v => __obj.update("TerminationPolicies", __v.asInstanceOf[js.Any]))
      VPCZoneIdentifier.foreach(__v => __obj.update("VPCZoneIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroup]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): AutoScalingGroupNamesType = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingGroupNames.foreach(__v => __obj.update("AutoScalingGroupNames", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupNamesType]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): AutoScalingGroupsType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroups" -> AutoScalingGroups.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupsType]
    }
  }

  /**
    * Describes an EC2 instance associated with an Auto Scaling group.
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
        LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    ): AutoScalingInstanceDetails = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "AvailabilityZone"     -> AvailabilityZone.asInstanceOf[js.Any],
        "HealthStatus"         -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId"           -> InstanceId.asInstanceOf[js.Any],
        "LifecycleState"       -> LifecycleState.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any]
      )

      LaunchConfigurationName.foreach(__v => __obj.update("LaunchConfigurationName", __v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.update("LaunchTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingInstanceDetails]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): AutoScalingInstancesType = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingInstances.foreach(__v => __obj.update("AutoScalingInstances", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingInstancesType]
    }
  }

  @js.native
  trait BatchDeleteScheduledActionAnswer extends js.Object {
    var FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests]
  }

  object BatchDeleteScheduledActionAnswer {
    def apply(
        FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined
    ): BatchDeleteScheduledActionAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedScheduledActions.foreach(__v => __obj.update("FailedScheduledActions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteScheduledActionAnswer]
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
        ScheduledActionNames: ScheduledActionNames
    ): BatchDeleteScheduledActionType = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined
    ): BatchPutScheduledUpdateGroupActionAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      FailedScheduledUpdateGroupActions.foreach(
        __v => __obj.update("FailedScheduledUpdateGroupActions", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionAnswer]
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
        ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
    ): BatchPutScheduledUpdateGroupActionType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName"        -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledUpdateGroupActions" -> ScheduledUpdateGroupActions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionType]
    }
  }

  /**
    * Describes a block device mapping.
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
        VirtualName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): BlockDeviceMapping = {
      val __obj = js.Dictionary[js.Any](
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )

      Ebs.foreach(__v => __obj.update("Ebs", __v.asInstanceOf[js.Any]))
      NoDevice.foreach(__v => __obj.update("NoDevice", __v.asInstanceOf[js.Any]))
      VirtualName.foreach(__v => __obj.update("VirtualName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlockDeviceMapping]
    }
  }

  @js.native
  trait CompleteLifecycleActionAnswer extends js.Object {}

  object CompleteLifecycleActionAnswer {
    def apply(
        ): CompleteLifecycleActionAnswer = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        AutoScalingGroupName: ResourceName,
        LifecycleActionResult: LifecycleActionResult,
        LifecycleHookName: AsciiStringMaxLen255,
        InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
        LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined
    ): CompleteLifecycleActionType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName"  -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleActionResult" -> LifecycleActionResult.asInstanceOf[js.Any],
        "LifecycleHookName"     -> LifecycleHookName.asInstanceOf[js.Any]
      )

      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      LifecycleActionToken.foreach(__v => __obj.update("LifecycleActionToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteLifecycleActionType]
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
        VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
    ): CreateAutoScalingGroupType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "MaxSize"              -> MaxSize.asInstanceOf[js.Any],
        "MinSize"              -> MinSize.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      DefaultCooldown.foreach(__v => __obj.update("DefaultCooldown", __v.asInstanceOf[js.Any]))
      DesiredCapacity.foreach(__v => __obj.update("DesiredCapacity", __v.asInstanceOf[js.Any]))
      HealthCheckGracePeriod.foreach(__v => __obj.update("HealthCheckGracePeriod", __v.asInstanceOf[js.Any]))
      HealthCheckType.foreach(__v => __obj.update("HealthCheckType", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.update("LaunchConfigurationName", __v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.update("LaunchTemplate", __v.asInstanceOf[js.Any]))
      LifecycleHookSpecificationList.foreach(
        __v => __obj.update("LifecycleHookSpecificationList", __v.asInstanceOf[js.Any])
      )
      LoadBalancerNames.foreach(__v => __obj.update("LoadBalancerNames", __v.asInstanceOf[js.Any]))
      MixedInstancesPolicy.foreach(__v => __obj.update("MixedInstancesPolicy", __v.asInstanceOf[js.Any]))
      NewInstancesProtectedFromScaleIn.foreach(
        __v => __obj.update("NewInstancesProtectedFromScaleIn", __v.asInstanceOf[js.Any])
      )
      PlacementGroup.foreach(__v => __obj.update("PlacementGroup", __v.asInstanceOf[js.Any]))
      ServiceLinkedRoleARN.foreach(__v => __obj.update("ServiceLinkedRoleARN", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TargetGroupARNs.foreach(__v => __obj.update("TargetGroupARNs", __v.asInstanceOf[js.Any]))
      TerminationPolicies.foreach(__v => __obj.update("TerminationPolicies", __v.asInstanceOf[js.Any]))
      VPCZoneIdentifier.foreach(__v => __obj.update("VPCZoneIdentifier", __v.asInstanceOf[js.Any]))
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
        UserData: js.UndefOr[XmlStringUserData] = js.undefined
    ): CreateLaunchConfigurationType = {
      val __obj = js.Dictionary[js.Any](
        "LaunchConfigurationName" -> LaunchConfigurationName.asInstanceOf[js.Any]
      )

      AssociatePublicIpAddress.foreach(__v => __obj.update("AssociatePublicIpAddress", __v.asInstanceOf[js.Any]))
      BlockDeviceMappings.foreach(__v => __obj.update("BlockDeviceMappings", __v.asInstanceOf[js.Any]))
      ClassicLinkVPCId.foreach(__v => __obj.update("ClassicLinkVPCId", __v.asInstanceOf[js.Any]))
      ClassicLinkVPCSecurityGroups.foreach(
        __v => __obj.update("ClassicLinkVPCSecurityGroups", __v.asInstanceOf[js.Any])
      )
      EbsOptimized.foreach(__v => __obj.update("EbsOptimized", __v.asInstanceOf[js.Any]))
      IamInstanceProfile.foreach(__v => __obj.update("IamInstanceProfile", __v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.update("ImageId", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      InstanceMonitoring.foreach(__v => __obj.update("InstanceMonitoring", __v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      KernelId.foreach(__v => __obj.update("KernelId", __v.asInstanceOf[js.Any]))
      KeyName.foreach(__v => __obj.update("KeyName", __v.asInstanceOf[js.Any]))
      PlacementTenancy.foreach(__v => __obj.update("PlacementTenancy", __v.asInstanceOf[js.Any]))
      RamdiskId.foreach(__v => __obj.update("RamdiskId", __v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.update("SecurityGroups", __v.asInstanceOf[js.Any]))
      SpotPrice.foreach(__v => __obj.update("SpotPrice", __v.asInstanceOf[js.Any]))
      UserData.foreach(__v => __obj.update("UserData", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLaunchConfigurationType]
    }
  }

  @js.native
  trait CreateOrUpdateTagsType extends js.Object {
    var Tags: Tags
  }

  object CreateOrUpdateTagsType {
    def apply(
        Tags: Tags
    ): CreateOrUpdateTagsType = {
      val __obj = js.Dictionary[js.Any](
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateOrUpdateTagsType]
    }
  }

  /**
    * Represents a CloudWatch metric of your choosing for a target tracking scaling policy to use with Amazon EC2 Auto Scaling.
    *  To create your customized metric specification:
    * * Add values for each required parameter from CloudWatch. You can use an existing metric, or a new metric that you create. To use your own metric, you must first publish the metric to CloudWatch. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html|Publish Custom Metrics]] in the <i>Amazon CloudWatch User Guide</i>.
    *  * Choose a metric that changes proportionally with capacity. The value of the metric should increase or decrease in inverse proportion to the number of capacity units. That is, the value of the metric should decrease when capacity increases.
    * For more information about CloudWatch, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html|Amazon CloudWatch Concepts]].
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
        Unit: js.UndefOr[MetricUnit] = js.undefined
    ): CustomizedMetricSpecification = {
      val __obj = js.Dictionary[js.Any](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace"  -> Namespace.asInstanceOf[js.Any],
        "Statistic"  -> Statistic.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomizedMetricSpecification]
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
        ForceDelete: js.UndefOr[ForceDelete] = js.undefined
    ): DeleteAutoScalingGroupType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      ForceDelete.foreach(__v => __obj.update("ForceDelete", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAutoScalingGroupType]
    }
  }

  @js.native
  trait DeleteLifecycleHookAnswer extends js.Object {}

  object DeleteLifecycleHookAnswer {
    def apply(
        ): DeleteLifecycleHookAnswer = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteLifecycleHookAnswer]
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
        LifecycleHookName: AsciiStringMaxLen255
    ): DeleteLifecycleHookType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName"    -> LifecycleHookName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLifecycleHookType]
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
        TopicARN: ResourceName
    ): DeleteNotificationConfigurationType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TopicARN"             -> TopicARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNotificationConfigurationType]
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
        AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    ): DeletePolicyType = {
      val __obj = js.Dictionary[js.Any](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePolicyType]
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
        ScheduledActionName: ResourceName
    ): DeleteScheduledActionType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledActionName"  -> ScheduledActionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteScheduledActionType]
    }
  }

  @js.native
  trait DeleteTagsType extends js.Object {
    var Tags: Tags
  }

  object DeleteTagsType {
    def apply(
        Tags: Tags
    ): DeleteTagsType = {
      val __obj = js.Dictionary[js.Any](
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsType]
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
        NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations] = js.undefined
    ): DescribeAccountLimitsAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxNumberOfAutoScalingGroups.foreach(
        __v => __obj.update("MaxNumberOfAutoScalingGroups", __v.asInstanceOf[js.Any])
      )
      MaxNumberOfLaunchConfigurations.foreach(
        __v => __obj.update("MaxNumberOfLaunchConfigurations", __v.asInstanceOf[js.Any])
      )
      NumberOfAutoScalingGroups.foreach(__v => __obj.update("NumberOfAutoScalingGroups", __v.asInstanceOf[js.Any]))
      NumberOfLaunchConfigurations.foreach(
        __v => __obj.update("NumberOfLaunchConfigurations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeAccountLimitsAnswer]
    }
  }

  @js.native
  trait DescribeAdjustmentTypesAnswer extends js.Object {
    var AdjustmentTypes: js.UndefOr[AdjustmentTypes]
  }

  object DescribeAdjustmentTypesAnswer {
    def apply(
        AdjustmentTypes: js.UndefOr[AdjustmentTypes] = js.undefined
    ): DescribeAdjustmentTypesAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      AdjustmentTypes.foreach(__v => __obj.update("AdjustmentTypes", __v.asInstanceOf[js.Any]))
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
    def apply(
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeAutoScalingInstancesType = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutoScalingInstancesType]
    }
  }

  @js.native
  trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
    var AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes]
  }

  object DescribeAutoScalingNotificationTypesAnswer {
    def apply(
        AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
    ): DescribeAutoScalingNotificationTypesAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingNotificationTypes.foreach(
        __v => __obj.update("AutoScalingNotificationTypes", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHookTypesAnswer extends js.Object {
    var LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes]
  }

  object DescribeLifecycleHookTypesAnswer {
    def apply(
        LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
    ): DescribeLifecycleHookTypesAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      LifecycleHookTypes.foreach(__v => __obj.update("LifecycleHookTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLifecycleHookTypesAnswer]
    }
  }

  @js.native
  trait DescribeLifecycleHooksAnswer extends js.Object {
    var LifecycleHooks: js.UndefOr[LifecycleHooks]
  }

  object DescribeLifecycleHooksAnswer {
    def apply(
        LifecycleHooks: js.UndefOr[LifecycleHooks] = js.undefined
    ): DescribeLifecycleHooksAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      LifecycleHooks.foreach(__v => __obj.update("LifecycleHooks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLifecycleHooksAnswer]
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
        LifecycleHookNames: js.UndefOr[LifecycleHookNames] = js.undefined
    ): DescribeLifecycleHooksType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      LifecycleHookNames.foreach(__v => __obj.update("LifecycleHookNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLifecycleHooksType]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeLoadBalancerTargetGroupsRequest = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerTargetGroupsRequest]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeLoadBalancerTargetGroupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LoadBalancerTargetGroups.foreach(__v => __obj.update("LoadBalancerTargetGroups", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerTargetGroupsResponse]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeLoadBalancersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancersRequest]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeLoadBalancersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LoadBalancers.foreach(__v => __obj.update("LoadBalancers", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancersResponse]
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
        Metrics: js.UndefOr[MetricCollectionTypes] = js.undefined
    ): DescribeMetricCollectionTypesAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      Granularities.foreach(__v => __obj.update("Granularities", __v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMetricCollectionTypesAnswer]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeNotificationConfigurationsAnswer = {
      val __obj = js.Dictionary[js.Any](
        "NotificationConfigurations" -> NotificationConfigurations.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeNotificationConfigurationsType = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingGroupNames.foreach(__v => __obj.update("AutoScalingGroupNames", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotificationConfigurationsType]
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
        PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
    ): DescribePoliciesType = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.update("PolicyNames", __v.asInstanceOf[js.Any]))
      PolicyTypes.foreach(__v => __obj.update("PolicyTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePoliciesType]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeScalingActivitiesType = {
      val __obj = js.Dictionary.empty[js.Any]
      ActivityIds.foreach(__v => __obj.update("ActivityIds", __v.asInstanceOf[js.Any]))
      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingActivitiesType]
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
        StartTime: js.UndefOr[TimestampType] = js.undefined
    ): DescribeScheduledActionsType = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ScheduledActionNames.foreach(__v => __obj.update("ScheduledActionNames", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): DescribeTagsType = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsType]
    }
  }

  @js.native
  trait DescribeTerminationPolicyTypesAnswer extends js.Object {
    var TerminationPolicyTypes: js.UndefOr[TerminationPolicies]
  }

  object DescribeTerminationPolicyTypesAnswer {
    def apply(
        TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.undefined
    ): DescribeTerminationPolicyTypesAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      TerminationPolicyTypes.foreach(__v => __obj.update("TerminationPolicyTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTerminationPolicyTypesAnswer]
    }
  }

  @js.native
  trait DetachInstancesAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object DetachInstancesAnswer {
    def apply(
        Activities: js.UndefOr[Activities] = js.undefined
    ): DetachInstancesAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      Activities.foreach(__v => __obj.update("Activities", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachInstancesAnswer]
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
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    ): DetachInstancesQuery = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName"           -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachInstancesQuery]
    }
  }

  @js.native
  trait DetachLoadBalancerTargetGroupsResultType extends js.Object {}

  object DetachLoadBalancerTargetGroupsResultType {
    def apply(
        ): DetachLoadBalancerTargetGroupsResultType = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DetachLoadBalancerTargetGroupsResultType]
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
        TargetGroupARNs: TargetGroupARNs
    ): DetachLoadBalancerTargetGroupsType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "TargetGroupARNs"      -> TargetGroupARNs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachLoadBalancerTargetGroupsType]
    }
  }

  @js.native
  trait DetachLoadBalancersResultType extends js.Object {}

  object DetachLoadBalancersResultType {
    def apply(
        ): DetachLoadBalancersResultType = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DetachLoadBalancersResultType]
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
        LoadBalancerNames: LoadBalancerNames
    ): DetachLoadBalancersType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LoadBalancerNames"    -> LoadBalancerNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachLoadBalancersType]
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
        Metrics: js.UndefOr[Metrics] = js.undefined
    ): DisableMetricsCollectionQuery = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableMetricsCollectionQuery]
    }
  }

  /**
    * Describes an Amazon EBS volume. Used in combination with <a>BlockDeviceMapping</a>.
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
        VolumeType: js.UndefOr[BlockDeviceEbsVolumeType] = js.undefined
    ): Ebs = {
      val __obj = js.Dictionary.empty[js.Any]
      DeleteOnTermination.foreach(__v => __obj.update("DeleteOnTermination", __v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.update("Encrypted", __v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.update("Iops", __v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.update("SnapshotId", __v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.update("VolumeSize", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ebs]
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
        Metrics: js.UndefOr[Metrics] = js.undefined
    ): EnableMetricsCollectionQuery = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "Granularity"          -> Granularity.asInstanceOf[js.Any]
      )

      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableMetricsCollectionQuery]
    }
  }

  /**
    * Describes an enabled metric.
    */
  @js.native
  trait EnabledMetric extends js.Object {
    var Granularity: js.UndefOr[XmlStringMaxLen255]
    var Metric: js.UndefOr[XmlStringMaxLen255]
  }

  object EnabledMetric {
    def apply(
        Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): EnabledMetric = {
      val __obj = js.Dictionary.empty[js.Any]
      Granularity.foreach(__v => __obj.update("Granularity", __v.asInstanceOf[js.Any]))
      Metric.foreach(__v => __obj.update("Metric", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnabledMetric]
    }
  }

  @js.native
  trait EnterStandbyAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object EnterStandbyAnswer {
    def apply(
        Activities: js.UndefOr[Activities] = js.undefined
    ): EnterStandbyAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      Activities.foreach(__v => __obj.update("Activities", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnterStandbyAnswer]
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
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    ): EnterStandbyQuery = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName"           -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnterStandbyQuery]
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
        MetricValue: js.UndefOr[MetricScale] = js.undefined
    ): ExecutePolicyType = {
      val __obj = js.Dictionary[js.Any](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      BreachThreshold.foreach(__v => __obj.update("BreachThreshold", __v.asInstanceOf[js.Any]))
      HonorCooldown.foreach(__v => __obj.update("HonorCooldown", __v.asInstanceOf[js.Any]))
      MetricValue.foreach(__v => __obj.update("MetricValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutePolicyType]
    }
  }

  @js.native
  trait ExitStandbyAnswer extends js.Object {
    var Activities: js.UndefOr[Activities]
  }

  object ExitStandbyAnswer {
    def apply(
        Activities: js.UndefOr[Activities] = js.undefined
    ): ExitStandbyAnswer = {
      val __obj = js.Dictionary.empty[js.Any]
      Activities.foreach(__v => __obj.update("Activities", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExitStandbyAnswer]
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
        InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    ): ExitStandbyQuery = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExitStandbyQuery]
    }
  }

  /**
    * Describes a scheduled action that could not be created, updated, or deleted.
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
        ErrorMessage: js.UndefOr[XmlString] = js.undefined
    ): FailedScheduledUpdateGroupActionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]
      )

      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedScheduledUpdateGroupActionRequest]
    }
  }

  /**
    * Describes a filter.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[XmlString]
    var Values: js.UndefOr[Values]
  }

  object Filter {
    def apply(
        Name: js.UndefOr[XmlString] = js.undefined,
        Values: js.UndefOr[Values] = js.undefined
    ): Filter = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /**
    * Describes an EC2 instance.
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
        LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    ): Instance = {
      val __obj = js.Dictionary[js.Any](
        "AvailabilityZone"     -> AvailabilityZone.asInstanceOf[js.Any],
        "HealthStatus"         -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId"           -> InstanceId.asInstanceOf[js.Any],
        "LifecycleState"       -> LifecycleState.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any]
      )

      LaunchConfigurationName.foreach(__v => __obj.update("LaunchConfigurationName", __v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.update("LaunchTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /**
    * Describes whether detailed monitoring is enabled for the Auto Scaling instances.
    */
  @js.native
  trait InstanceMonitoring extends js.Object {
    var Enabled: js.UndefOr[MonitoringEnabled]
  }

  object InstanceMonitoring {
    def apply(
        Enabled: js.UndefOr[MonitoringEnabled] = js.undefined
    ): InstanceMonitoring = {
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceMonitoring]
    }
  }

  /**
    * Describes an instances distribution for an Auto Scaling group with <a>MixedInstancesPolicy</a>.
    *  The instances distribution specifies the distribution of On-Demand Instances and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill On-Demand and Spot capacity.
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
    def apply(
        OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.undefined,
        OnDemandBaseCapacity: js.UndefOr[OnDemandBaseCapacity] = js.undefined,
        OnDemandPercentageAboveBaseCapacity: js.UndefOr[OnDemandPercentageAboveBaseCapacity] = js.undefined,
        SpotAllocationStrategy: js.UndefOr[XmlString] = js.undefined,
        SpotInstancePools: js.UndefOr[SpotInstancePools] = js.undefined,
        SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice] = js.undefined
    ): InstancesDistribution = {
      val __obj = js.Dictionary.empty[js.Any]
      OnDemandAllocationStrategy.foreach(__v => __obj.update("OnDemandAllocationStrategy", __v.asInstanceOf[js.Any]))
      OnDemandBaseCapacity.foreach(__v => __obj.update("OnDemandBaseCapacity", __v.asInstanceOf[js.Any]))
      OnDemandPercentageAboveBaseCapacity.foreach(
        __v => __obj.update("OnDemandPercentageAboveBaseCapacity", __v.asInstanceOf[js.Any])
      )
      SpotAllocationStrategy.foreach(__v => __obj.update("SpotAllocationStrategy", __v.asInstanceOf[js.Any]))
      SpotInstancePools.foreach(__v => __obj.update("SpotInstancePools", __v.asInstanceOf[js.Any]))
      SpotMaxPrice.foreach(__v => __obj.update("SpotMaxPrice", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstancesDistribution]
    }
  }

  /**
    * Describes a launch configuration.
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
        UserData: js.UndefOr[XmlStringUserData] = js.undefined
    ): LaunchConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "CreatedTime"             -> CreatedTime.asInstanceOf[js.Any],
        "ImageId"                 -> ImageId.asInstanceOf[js.Any],
        "InstanceType"            -> InstanceType.asInstanceOf[js.Any],
        "LaunchConfigurationName" -> LaunchConfigurationName.asInstanceOf[js.Any]
      )

      AssociatePublicIpAddress.foreach(__v => __obj.update("AssociatePublicIpAddress", __v.asInstanceOf[js.Any]))
      BlockDeviceMappings.foreach(__v => __obj.update("BlockDeviceMappings", __v.asInstanceOf[js.Any]))
      ClassicLinkVPCId.foreach(__v => __obj.update("ClassicLinkVPCId", __v.asInstanceOf[js.Any]))
      ClassicLinkVPCSecurityGroups.foreach(
        __v => __obj.update("ClassicLinkVPCSecurityGroups", __v.asInstanceOf[js.Any])
      )
      EbsOptimized.foreach(__v => __obj.update("EbsOptimized", __v.asInstanceOf[js.Any]))
      IamInstanceProfile.foreach(__v => __obj.update("IamInstanceProfile", __v.asInstanceOf[js.Any]))
      InstanceMonitoring.foreach(__v => __obj.update("InstanceMonitoring", __v.asInstanceOf[js.Any]))
      KernelId.foreach(__v => __obj.update("KernelId", __v.asInstanceOf[js.Any]))
      KeyName.foreach(__v => __obj.update("KeyName", __v.asInstanceOf[js.Any]))
      LaunchConfigurationARN.foreach(__v => __obj.update("LaunchConfigurationARN", __v.asInstanceOf[js.Any]))
      PlacementTenancy.foreach(__v => __obj.update("PlacementTenancy", __v.asInstanceOf[js.Any]))
      RamdiskId.foreach(__v => __obj.update("RamdiskId", __v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.update("SecurityGroups", __v.asInstanceOf[js.Any]))
      SpotPrice.foreach(__v => __obj.update("SpotPrice", __v.asInstanceOf[js.Any]))
      UserData.foreach(__v => __obj.update("UserData", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfiguration]
    }
  }

  @js.native
  trait LaunchConfigurationNameType extends js.Object {
    var LaunchConfigurationName: ResourceName
  }

  object LaunchConfigurationNameType {
    def apply(
        LaunchConfigurationName: ResourceName
    ): LaunchConfigurationNameType = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): LaunchConfigurationNamesType = {
      val __obj = js.Dictionary.empty[js.Any]
      LaunchConfigurationNames.foreach(__v => __obj.update("LaunchConfigurationNames", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfigurationNamesType]
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
        NextToken: js.UndefOr[XmlString] = js.undefined
    ): LaunchConfigurationsType = {
      val __obj = js.Dictionary[js.Any](
        "LaunchConfigurations" -> LaunchConfigurations.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfigurationsType]
    }
  }

  /**
    * Describes a launch template and overrides.
    *  The overrides are used to override the instance type specified by the launch template with multiple instance types that can be used to launch On-Demand Instances and Spot Instances.
    */
  @js.native
  trait LaunchTemplate extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification]
    var Overrides: js.UndefOr[Overrides]
  }

  object LaunchTemplate {
    def apply(
        LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        Overrides: js.UndefOr[Overrides] = js.undefined
    ): LaunchTemplate = {
      val __obj = js.Dictionary.empty[js.Any]
      LaunchTemplateSpecification.foreach(__v => __obj.update("LaunchTemplateSpecification", __v.asInstanceOf[js.Any]))
      Overrides.foreach(__v => __obj.update("Overrides", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplate]
    }
  }

  /**
    * Describes an override for a launch template.
    */
  @js.native
  trait LaunchTemplateOverrides extends js.Object {
    var InstanceType: js.UndefOr[XmlStringMaxLen255]
  }

  object LaunchTemplateOverrides {
    def apply(
        InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LaunchTemplateOverrides = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplateOverrides]
    }
  }

  /**
    * Describes a launch template and the launch template version.
    *  The launch template that is specified must be configured for use with an Auto Scaling group. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html|Creating a Launch Template for an Auto Scaling Group]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
        Version: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LaunchTemplateSpecification = {
      val __obj = js.Dictionary.empty[js.Any]
      LaunchTemplateId.foreach(__v => __obj.update("LaunchTemplateId", __v.asInstanceOf[js.Any]))
      LaunchTemplateName.foreach(__v => __obj.update("LaunchTemplateName", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplateSpecification]
    }
  }

  /**
    * Describes a lifecycle hook, which tells Amazon EC2 Auto Scaling that you want to perform an action whenever it launches instances or terminates instances. Used in response to <a>DescribeLifecycleHooks</a>.
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
        RoleARN: js.UndefOr[ResourceName] = js.undefined
    ): LifecycleHook = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      DefaultResult.foreach(__v => __obj.update("DefaultResult", __v.asInstanceOf[js.Any]))
      GlobalTimeout.foreach(__v => __obj.update("GlobalTimeout", __v.asInstanceOf[js.Any]))
      HeartbeatTimeout.foreach(__v => __obj.update("HeartbeatTimeout", __v.asInstanceOf[js.Any]))
      LifecycleHookName.foreach(__v => __obj.update("LifecycleHookName", __v.asInstanceOf[js.Any]))
      LifecycleTransition.foreach(__v => __obj.update("LifecycleTransition", __v.asInstanceOf[js.Any]))
      NotificationMetadata.foreach(__v => __obj.update("NotificationMetadata", __v.asInstanceOf[js.Any]))
      NotificationTargetARN.foreach(__v => __obj.update("NotificationTargetARN", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleHook]
    }
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
        RoleARN: js.UndefOr[ResourceName] = js.undefined
    ): LifecycleHookSpecification = {
      val __obj = js.Dictionary[js.Any](
        "LifecycleHookName"   -> LifecycleHookName.asInstanceOf[js.Any],
        "LifecycleTransition" -> LifecycleTransition.asInstanceOf[js.Any]
      )

      DefaultResult.foreach(__v => __obj.update("DefaultResult", __v.asInstanceOf[js.Any]))
      HeartbeatTimeout.foreach(__v => __obj.update("HeartbeatTimeout", __v.asInstanceOf[js.Any]))
      NotificationMetadata.foreach(__v => __obj.update("NotificationMetadata", __v.asInstanceOf[js.Any]))
      NotificationTargetARN.foreach(__v => __obj.update("NotificationTargetARN", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleHookSpecification]
    }
  }

  object LifecycleStateEnum {
    val Pending               = "Pending"
    val `Pending:Wait`        = "Pending:Wait"
    val `Pending:Proceed`     = "Pending:Proceed"
    val Quarantined           = "Quarantined"
    val InService             = "InService"
    val Terminating           = "Terminating"
    val `Terminating:Wait`    = "Terminating:Wait"
    val `Terminating:Proceed` = "Terminating:Proceed"
    val Terminated            = "Terminated"
    val Detaching             = "Detaching"
    val Detached              = "Detached"
    val EnteringStandby       = "EnteringStandby"
    val Standby               = "Standby"

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
  trait LoadBalancerState extends js.Object {
    var LoadBalancerName: js.UndefOr[XmlStringMaxLen255]
    var State: js.UndefOr[XmlStringMaxLen255]
  }

  object LoadBalancerState {
    def apply(
        LoadBalancerName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        State: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LoadBalancerState = {
      val __obj = js.Dictionary.empty[js.Any]
      LoadBalancerName.foreach(__v => __obj.update("LoadBalancerName", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerState]
    }
  }

  /**
    * Describes the state of a target group.
    *  If you attach a target group to an existing Auto Scaling group, the initial state is <code>Adding</code>. The state transitions to <code>Added</code> after all Auto Scaling instances are registered with the target group. If Elastic Load Balancing health checks are enabled, the state transitions to <code>InService</code> after at least one Auto Scaling instance passes the health check. If EC2 health checks are enabled instead, the target group remains in the <code>Added</code> state.
    */
  @js.native
  trait LoadBalancerTargetGroupState extends js.Object {
    var LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511]
    var State: js.UndefOr[XmlStringMaxLen255]
  }

  object LoadBalancerTargetGroupState {
    def apply(
        LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511] = js.undefined,
        State: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): LoadBalancerTargetGroupState = {
      val __obj = js.Dictionary.empty[js.Any]
      LoadBalancerTargetGroupARN.foreach(__v => __obj.update("LoadBalancerTargetGroupARN", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerTargetGroupState]
    }
  }

  /**
    * Describes a metric.
    */
  @js.native
  trait MetricCollectionType extends js.Object {
    var Metric: js.UndefOr[XmlStringMaxLen255]
  }

  object MetricCollectionType {
    def apply(
        Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): MetricCollectionType = {
      val __obj = js.Dictionary.empty[js.Any]
      Metric.foreach(__v => __obj.update("Metric", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricCollectionType]
    }
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
        Value: MetricDimensionValue
    ): MetricDimension = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MetricDimension]
    }
  }

  /**
    * Describes a granularity of a metric.
    */
  @js.native
  trait MetricGranularityType extends js.Object {
    var Granularity: js.UndefOr[XmlStringMaxLen255]
  }

  object MetricGranularityType {
    def apply(
        Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): MetricGranularityType = {
      val __obj = js.Dictionary.empty[js.Any]
      Granularity.foreach(__v => __obj.update("Granularity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricGranularityType]
    }
  }

  object MetricStatisticEnum {
    val Average     = "Average"
    val Minimum     = "Minimum"
    val Maximum     = "Maximum"
    val SampleCount = "SampleCount"
    val Sum         = "Sum"

    val values = js.Object.freeze(js.Array(Average, Minimum, Maximum, SampleCount, Sum))
  }

  object MetricTypeEnum {
    val ASGAverageCPUUtilization = "ASGAverageCPUUtilization"
    val ASGAverageNetworkIn      = "ASGAverageNetworkIn"
    val ASGAverageNetworkOut     = "ASGAverageNetworkOut"
    val ALBRequestCountPerTarget = "ALBRequestCountPerTarget"

    val values = js.Object.freeze(
      js.Array(ASGAverageCPUUtilization, ASGAverageNetworkIn, ASGAverageNetworkOut, ALBRequestCountPerTarget)
    )
  }

  /**
    * Describes a mixed instances policy for an Auto Scaling group. With mixed instances, your Auto Scaling group can provision a combination of On-Demand Instances and Spot Instances across multiple instance types. For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html|Auto Scaling Groups with Multiple Instance Types and Purchase Options]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    *  You can create a mixed instances policy for a new Auto Scaling group, or you can create it for an existing group by updating the group to specify <code>MixedInstancesPolicy</code> as the top-level parameter instead of a launch configuration or template. For more information, see <a>CreateAutoScalingGroup</a> and <a>UpdateAutoScalingGroup</a>.
    */
  @js.native
  trait MixedInstancesPolicy extends js.Object {
    var InstancesDistribution: js.UndefOr[InstancesDistribution]
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  object MixedInstancesPolicy {
    def apply(
        InstancesDistribution: js.UndefOr[InstancesDistribution] = js.undefined,
        LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined
    ): MixedInstancesPolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      InstancesDistribution.foreach(__v => __obj.update("InstancesDistribution", __v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.update("LaunchTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MixedInstancesPolicy]
    }
  }

  /**
    * Describes a notification.
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
        TopicARN: js.UndefOr[ResourceName] = js.undefined
    ): NotificationConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      NotificationType.foreach(__v => __obj.update("NotificationType", __v.asInstanceOf[js.Any]))
      TopicARN.foreach(__v => __obj.update("TopicARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfiguration]
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
        ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined
    ): PoliciesType = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ScalingPolicies.foreach(__v => __obj.update("ScalingPolicies", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PoliciesType]
    }
  }

  /**
    * Contains the output of PutScalingPolicy.
    */
  @js.native
  trait PolicyARNType extends js.Object {
    var Alarms: js.UndefOr[Alarms]
    var PolicyARN: js.UndefOr[ResourceName]
  }

  object PolicyARNType {
    def apply(
        Alarms: js.UndefOr[Alarms] = js.undefined,
        PolicyARN: js.UndefOr[ResourceName] = js.undefined
    ): PolicyARNType = {
      val __obj = js.Dictionary.empty[js.Any]
      Alarms.foreach(__v => __obj.update("Alarms", __v.asInstanceOf[js.Any]))
      PolicyARN.foreach(__v => __obj.update("PolicyARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyARNType]
    }
  }

  /**
    * Represents a predefined metric for a target tracking scaling policy to use with Amazon EC2 Auto Scaling.
    */
  @js.native
  trait PredefinedMetricSpecification extends js.Object {
    var PredefinedMetricType: MetricType
    var ResourceLabel: js.UndefOr[XmlStringMaxLen1023]
  }

  object PredefinedMetricSpecification {
    def apply(
        PredefinedMetricType: MetricType,
        ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    ): PredefinedMetricSpecification = {
      val __obj = js.Dictionary[js.Any](
        "PredefinedMetricType" -> PredefinedMetricType.asInstanceOf[js.Any]
      )

      ResourceLabel.foreach(__v => __obj.update("ResourceLabel", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredefinedMetricSpecification]
    }
  }

  /**
    * Describes a process type.
    *  For more information, see [[https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html#process-types|Scaling Processes]] in the <i>Amazon EC2 Auto Scaling User Guide</i>.
    */
  @js.native
  trait ProcessType extends js.Object {
    var ProcessName: XmlStringMaxLen255
  }

  object ProcessType {
    def apply(
        ProcessName: XmlStringMaxLen255
    ): ProcessType = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Processes: js.UndefOr[Processes] = js.undefined
    ): ProcessesType = {
      val __obj = js.Dictionary.empty[js.Any]
      Processes.foreach(__v => __obj.update("Processes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessesType]
    }
  }

  @js.native
  trait PutLifecycleHookAnswer extends js.Object {}

  object PutLifecycleHookAnswer {
    def apply(
        ): PutLifecycleHookAnswer = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutLifecycleHookAnswer]
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
        RoleARN: js.UndefOr[ResourceName] = js.undefined
    ): PutLifecycleHookType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName"    -> LifecycleHookName.asInstanceOf[js.Any]
      )

      DefaultResult.foreach(__v => __obj.update("DefaultResult", __v.asInstanceOf[js.Any]))
      HeartbeatTimeout.foreach(__v => __obj.update("HeartbeatTimeout", __v.asInstanceOf[js.Any]))
      LifecycleTransition.foreach(__v => __obj.update("LifecycleTransition", __v.asInstanceOf[js.Any]))
      NotificationMetadata.foreach(__v => __obj.update("NotificationMetadata", __v.asInstanceOf[js.Any]))
      NotificationTargetARN.foreach(__v => __obj.update("NotificationTargetARN", __v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.update("RoleARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLifecycleHookType]
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
        TopicARN: ResourceName
    ): PutNotificationConfigurationType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "NotificationTypes"    -> NotificationTypes.asInstanceOf[js.Any],
        "TopicARN"             -> TopicARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutNotificationConfigurationType]
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
        TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
    ): PutScalingPolicyType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "PolicyName"           -> PolicyName.asInstanceOf[js.Any]
      )

      AdjustmentType.foreach(__v => __obj.update("AdjustmentType", __v.asInstanceOf[js.Any]))
      Cooldown.foreach(__v => __obj.update("Cooldown", __v.asInstanceOf[js.Any]))
      EstimatedInstanceWarmup.foreach(__v => __obj.update("EstimatedInstanceWarmup", __v.asInstanceOf[js.Any]))
      MetricAggregationType.foreach(__v => __obj.update("MetricAggregationType", __v.asInstanceOf[js.Any]))
      MinAdjustmentMagnitude.foreach(__v => __obj.update("MinAdjustmentMagnitude", __v.asInstanceOf[js.Any]))
      MinAdjustmentStep.foreach(__v => __obj.update("MinAdjustmentStep", __v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.update("PolicyType", __v.asInstanceOf[js.Any]))
      ScalingAdjustment.foreach(__v => __obj.update("ScalingAdjustment", __v.asInstanceOf[js.Any]))
      StepAdjustments.foreach(__v => __obj.update("StepAdjustments", __v.asInstanceOf[js.Any]))
      TargetTrackingConfiguration.foreach(__v => __obj.update("TargetTrackingConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScalingPolicyType]
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
        Time: js.UndefOr[TimestampType] = js.undefined
    ): PutScheduledUpdateGroupActionType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "ScheduledActionName"  -> ScheduledActionName.asInstanceOf[js.Any]
      )

      DesiredCapacity.foreach(__v => __obj.update("DesiredCapacity", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.update("MaxSize", __v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.update("MinSize", __v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.update("Recurrence", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.update("Time", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScheduledUpdateGroupActionType]
    }
  }

  @js.native
  trait RecordLifecycleActionHeartbeatAnswer extends js.Object {}

  object RecordLifecycleActionHeartbeatAnswer {
    def apply(
        ): RecordLifecycleActionHeartbeatAnswer = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        AutoScalingGroupName: ResourceName,
        LifecycleHookName: AsciiStringMaxLen255,
        InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined,
        LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined
    ): RecordLifecycleActionHeartbeatType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "LifecycleHookName"    -> LifecycleHookName.asInstanceOf[js.Any]
      )

      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      LifecycleActionToken.foreach(__v => __obj.update("LifecycleActionToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordLifecycleActionHeartbeatType]
    }
  }

  object ScalingActivityStatusCodeEnum {
    val PendingSpotBidPlacement         = "PendingSpotBidPlacement"
    val WaitingForSpotInstanceRequestId = "WaitingForSpotInstanceRequestId"
    val WaitingForSpotInstanceId        = "WaitingForSpotInstanceId"
    val WaitingForInstanceId            = "WaitingForInstanceId"
    val PreInService                    = "PreInService"
    val InProgress                      = "InProgress"
    val WaitingForELBConnectionDraining = "WaitingForELBConnectionDraining"
    val MidLifecycleAction              = "MidLifecycleAction"
    val WaitingForInstanceWarmup        = "WaitingForInstanceWarmup"
    val Successful                      = "Successful"
    val Failed                          = "Failed"
    val Cancelled                       = "Cancelled"

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
        TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
    ): ScalingPolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      AdjustmentType.foreach(__v => __obj.update("AdjustmentType", __v.asInstanceOf[js.Any]))
      Alarms.foreach(__v => __obj.update("Alarms", __v.asInstanceOf[js.Any]))
      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      Cooldown.foreach(__v => __obj.update("Cooldown", __v.asInstanceOf[js.Any]))
      EstimatedInstanceWarmup.foreach(__v => __obj.update("EstimatedInstanceWarmup", __v.asInstanceOf[js.Any]))
      MetricAggregationType.foreach(__v => __obj.update("MetricAggregationType", __v.asInstanceOf[js.Any]))
      MinAdjustmentMagnitude.foreach(__v => __obj.update("MinAdjustmentMagnitude", __v.asInstanceOf[js.Any]))
      MinAdjustmentStep.foreach(__v => __obj.update("MinAdjustmentStep", __v.asInstanceOf[js.Any]))
      PolicyARN.foreach(__v => __obj.update("PolicyARN", __v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.update("PolicyName", __v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.update("PolicyType", __v.asInstanceOf[js.Any]))
      ScalingAdjustment.foreach(__v => __obj.update("ScalingAdjustment", __v.asInstanceOf[js.Any]))
      StepAdjustments.foreach(__v => __obj.update("StepAdjustments", __v.asInstanceOf[js.Any]))
      TargetTrackingConfiguration.foreach(__v => __obj.update("TargetTrackingConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPolicy]
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
        ScalingProcesses: js.UndefOr[ProcessNames] = js.undefined
    ): ScalingProcessQuery = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      ScalingProcesses.foreach(__v => __obj.update("ScalingProcesses", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingProcessQuery]
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
        ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions] = js.undefined
    ): ScheduledActionsType = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ScheduledUpdateGroupActions.foreach(__v => __obj.update("ScheduledUpdateGroupActions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledActionsType]
    }
  }

  /**
    * Describes a scheduled scaling action. Used in response to <a>DescribeScheduledActions</a>.
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
        Time: js.UndefOr[TimestampType] = js.undefined
    ): ScheduledUpdateGroupAction = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoScalingGroupName.foreach(__v => __obj.update("AutoScalingGroupName", __v.asInstanceOf[js.Any]))
      DesiredCapacity.foreach(__v => __obj.update("DesiredCapacity", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.update("MaxSize", __v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.update("MinSize", __v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.update("Recurrence", __v.asInstanceOf[js.Any]))
      ScheduledActionARN.foreach(__v => __obj.update("ScheduledActionARN", __v.asInstanceOf[js.Any]))
      ScheduledActionName.foreach(__v => __obj.update("ScheduledActionName", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.update("Time", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledUpdateGroupAction]
    }
  }

  /**
    * Describes one or more scheduled scaling action updates for a specified Auto Scaling group. Used in combination with <a>BatchPutScheduledUpdateGroupAction</a>.
    *  When updating a scheduled scaling action, all optional parameters are left unchanged if not specified.
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
        StartTime: js.UndefOr[TimestampType] = js.undefined
    ): ScheduledUpdateGroupActionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]
      )

      DesiredCapacity.foreach(__v => __obj.update("DesiredCapacity", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.update("MaxSize", __v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.update("MinSize", __v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.update("Recurrence", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledUpdateGroupActionRequest]
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
        HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined
    ): SetDesiredCapacityType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "DesiredCapacity"      -> DesiredCapacity.asInstanceOf[js.Any]
      )

      HonorCooldown.foreach(__v => __obj.update("HonorCooldown", __v.asInstanceOf[js.Any]))
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
    def apply(
        HealthStatus: XmlStringMaxLen32,
        InstanceId: XmlStringMaxLen19,
        ShouldRespectGracePeriod: js.UndefOr[ShouldRespectGracePeriod] = js.undefined
    ): SetInstanceHealthQuery = {
      val __obj = js.Dictionary[js.Any](
        "HealthStatus" -> HealthStatus.asInstanceOf[js.Any],
        "InstanceId"   -> InstanceId.asInstanceOf[js.Any]
      )

      ShouldRespectGracePeriod.foreach(__v => __obj.update("ShouldRespectGracePeriod", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetInstanceHealthQuery]
    }
  }

  @js.native
  trait SetInstanceProtectionAnswer extends js.Object {}

  object SetInstanceProtectionAnswer {
    def apply(
        ): SetInstanceProtectionAnswer = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetInstanceProtectionAnswer]
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
        ProtectedFromScaleIn: ProtectedFromScaleIn
    ): SetInstanceProtectionQuery = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any],
        "InstanceIds"          -> InstanceIds.asInstanceOf[js.Any],
        "ProtectedFromScaleIn" -> ProtectedFromScaleIn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetInstanceProtectionQuery]
    }
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
  trait StepAdjustment extends js.Object {
    var ScalingAdjustment: PolicyIncrement
    var MetricIntervalLowerBound: js.UndefOr[MetricScale]
    var MetricIntervalUpperBound: js.UndefOr[MetricScale]
  }

  object StepAdjustment {
    def apply(
        ScalingAdjustment: PolicyIncrement,
        MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.undefined,
        MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.undefined
    ): StepAdjustment = {
      val __obj = js.Dictionary[js.Any](
        "ScalingAdjustment" -> ScalingAdjustment.asInstanceOf[js.Any]
      )

      MetricIntervalLowerBound.foreach(__v => __obj.update("MetricIntervalLowerBound", __v.asInstanceOf[js.Any]))
      MetricIntervalUpperBound.foreach(__v => __obj.update("MetricIntervalUpperBound", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepAdjustment]
    }
  }

  /**
    * Describes an automatic scaling process that has been suspended. For more information, see <a>ProcessType</a>.
    */
  @js.native
  trait SuspendedProcess extends js.Object {
    var ProcessName: js.UndefOr[XmlStringMaxLen255]
    var SuspensionReason: js.UndefOr[XmlStringMaxLen255]
  }

  object SuspendedProcess {
    def apply(
        ProcessName: js.UndefOr[XmlStringMaxLen255] = js.undefined,
        SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.undefined
    ): SuspendedProcess = {
      val __obj = js.Dictionary.empty[js.Any]
      ProcessName.foreach(__v => __obj.update("ProcessName", __v.asInstanceOf[js.Any]))
      SuspensionReason.foreach(__v => __obj.update("SuspensionReason", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuspendedProcess]
    }
  }

  /**
    * Describes a tag for an Auto Scaling group.
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
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      PropagateAtLaunch.foreach(__v => __obj.update("PropagateAtLaunch", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * Describes a tag for an Auto Scaling group.
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
        Value: js.UndefOr[TagValue] = js.undefined
    ): TagDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      PropagateAtLaunch.foreach(__v => __obj.update("PropagateAtLaunch", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagDescription]
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
        Tags: js.UndefOr[TagDescriptionList] = js.undefined
    ): TagsType = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagsType]
    }
  }

  /**
    * Represents a target tracking scaling policy configuration to use with Amazon EC2 Auto Scaling.
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
        PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined
    ): TargetTrackingConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      )

      CustomizedMetricSpecification.foreach(
        __v => __obj.update("CustomizedMetricSpecification", __v.asInstanceOf[js.Any])
      )
      DisableScaleIn.foreach(__v => __obj.update("DisableScaleIn", __v.asInstanceOf[js.Any]))
      PredefinedMetricSpecification.foreach(
        __v => __obj.update("PredefinedMetricSpecification", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[TargetTrackingConfiguration]
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
        ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    ): TerminateInstanceInAutoScalingGroupType = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId"                     -> InstanceId.asInstanceOf[js.Any],
        "ShouldDecrementDesiredCapacity" -> ShouldDecrementDesiredCapacity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TerminateInstanceInAutoScalingGroupType]
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
        VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
    ): UpdateAutoScalingGroupType = {
      val __obj = js.Dictionary[js.Any](
        "AutoScalingGroupName" -> AutoScalingGroupName.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      DefaultCooldown.foreach(__v => __obj.update("DefaultCooldown", __v.asInstanceOf[js.Any]))
      DesiredCapacity.foreach(__v => __obj.update("DesiredCapacity", __v.asInstanceOf[js.Any]))
      HealthCheckGracePeriod.foreach(__v => __obj.update("HealthCheckGracePeriod", __v.asInstanceOf[js.Any]))
      HealthCheckType.foreach(__v => __obj.update("HealthCheckType", __v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.update("LaunchConfigurationName", __v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.update("LaunchTemplate", __v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.update("MaxSize", __v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.update("MinSize", __v.asInstanceOf[js.Any]))
      MixedInstancesPolicy.foreach(__v => __obj.update("MixedInstancesPolicy", __v.asInstanceOf[js.Any]))
      NewInstancesProtectedFromScaleIn.foreach(
        __v => __obj.update("NewInstancesProtectedFromScaleIn", __v.asInstanceOf[js.Any])
      )
      PlacementGroup.foreach(__v => __obj.update("PlacementGroup", __v.asInstanceOf[js.Any]))
      ServiceLinkedRoleARN.foreach(__v => __obj.update("ServiceLinkedRoleARN", __v.asInstanceOf[js.Any]))
      TerminationPolicies.foreach(__v => __obj.update("TerminationPolicies", __v.asInstanceOf[js.Any]))
      VPCZoneIdentifier.foreach(__v => __obj.update("VPCZoneIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAutoScalingGroupType]
    }
  }
}
