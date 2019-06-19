package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object codedeploy {
  type AdditionalDeploymentStatusInfo = String
  type AlarmList                      = js.Array[Alarm]
  type AlarmName                      = String
  type ApplicationId                  = String
  type ApplicationName                = String
  type ApplicationRevisionSortBy      = String
  type ApplicationsInfoList           = js.Array[ApplicationInfo]
  type ApplicationsList               = js.Array[ApplicationName]
  type AutoRollbackEvent              = String
  type AutoRollbackEventsList         = js.Array[AutoRollbackEvent]
  type AutoScalingGroupHook           = String
  type AutoScalingGroupList           = js.Array[AutoScalingGroup]
  type AutoScalingGroupName           = String
  type AutoScalingGroupNameList       = js.Array[AutoScalingGroupName]
  type BundleType                     = String
  type CommitId                       = String
  type ComputePlatform                = String
  type DeploymentConfigId             = String
  type DeploymentConfigName           = String
  type DeploymentConfigsList          = js.Array[DeploymentConfigName]
  type DeploymentCreator              = String
  type DeploymentGroupId              = String
  type DeploymentGroupInfoList        = js.Array[DeploymentGroupInfo]
  type DeploymentGroupName            = String
  type DeploymentGroupsList           = js.Array[DeploymentGroupName]
  type DeploymentId                   = String
  type DeploymentOption               = String
  type DeploymentReadyAction          = String
  type DeploymentStatus               = String
  type DeploymentStatusList           = js.Array[DeploymentStatus]
  type DeploymentStatusMessageList    = js.Array[ErrorMessage]
  type DeploymentTargetList           = js.Array[DeploymentTarget]
  type DeploymentTargetType           = String
  type DeploymentType                 = String
  type DeploymentWaitType             = String
  type DeploymentsInfoList            = js.Array[DeploymentInfo]
  type DeploymentsList                = js.Array[DeploymentId]
  type Description                    = String
  type Duration                       = Int
  type EC2TagFilterList               = js.Array[EC2TagFilter]
  type EC2TagFilterType               = String
  type EC2TagSetList                  = js.Array[EC2TagFilterList]
  type ECSClusterName                 = String
  type ECSServiceList                 = js.Array[ECSService]
  type ECSServiceName                 = String
  type ECSTaskSetCount                = Double
  type ECSTaskSetIdentifier           = String
  type ECSTaskSetList                 = js.Array[ECSTaskSet]
  type ECSTaskSetStatus               = String
  type ELBInfoList                    = js.Array[ELBInfo]
  type ELBName                        = String
  type ETag                           = String
  type ErrorCode                      = String
  type ErrorMessage                   = String
  type FileExistsBehavior             = String
  type FilterValue                    = String
  type FilterValueList                = js.Array[FilterValue]
  type GitHubAccountTokenName         = String
  type GitHubAccountTokenNameList     = js.Array[GitHubAccountTokenName]
  type GreenFleetProvisioningAction   = String
  type IamSessionArn                  = String
  type IamUserArn                     = String
  type InstanceAction                 = String
  type InstanceArn                    = String
  type InstanceCount                  = Double
  type InstanceId                     = String
  type InstanceInfoList               = js.Array[InstanceInfo]
  type InstanceName                   = String
  type InstanceNameList               = js.Array[InstanceName]
  type InstanceStatus                 = String
  type InstanceStatusList             = js.Array[InstanceStatus]
  type InstanceSummaryList            = js.Array[InstanceSummary]
  type InstanceType                   = String
  type InstanceTypeList               = js.Array[InstanceType]
  type InstancesList                  = js.Array[InstanceId]
  type Key                            = String
  type LifecycleErrorCode             = String
  type LifecycleEventHookExecutionId  = String
  type LifecycleEventList             = js.Array[LifecycleEvent]
  type LifecycleEventName             = String
  type LifecycleEventStatus           = String
  type LifecycleMessage               = String
  type ListStateFilterAction          = String
  type ListenerArn                    = String
  type ListenerArnList                = js.Array[ListenerArn]
  type LogTail                        = String
  type Message                        = String
  type MinimumHealthyHostsType        = String
  type MinimumHealthyHostsValue       = Int
  type NextToken                      = String
  type NullableBoolean                = Boolean
  type OnPremisesTagSetList           = js.Array[TagFilterList]
  type Percentage                     = Int
  type RawStringContent               = String
  type RawStringSha256                = String
  type RegistrationStatus             = String
  type Repository                     = String
  type RevisionInfoList               = js.Array[RevisionInfo]
  type RevisionLocationList           = js.Array[RevisionLocation]
  type RevisionLocationType           = String
  type Role                           = String
  type S3Bucket                       = String
  type S3Key                          = String
  type ScriptName                     = String
  type SortOrder                      = String
  type StopStatus                     = String
  type TagFilterList                  = js.Array[TagFilter]
  type TagFilterType                  = String
  type TagList                        = js.Array[Tag]
  type TargetArn                      = String
  type TargetFilterName               = String
  type TargetFilters                  = js.Dictionary[FilterValueList]
  type TargetGroupInfoList            = js.Array[TargetGroupInfo]
  type TargetGroupName                = String
  type TargetGroupPairInfoList        = js.Array[TargetGroupPairInfo]
  type TargetId                       = String
  type TargetIdList                   = js.Array[TargetId]
  type TargetLabel                    = String
  type TargetStatus                   = String
  type Time                           = js.Date
  type Timestamp                      = js.Date
  type TrafficRoutingType             = String
  type TrafficWeight                  = Double
  type TriggerConfigList              = js.Array[TriggerConfig]
  type TriggerEventType               = String
  type TriggerEventTypeList           = js.Array[TriggerEventType]
  type TriggerName                    = String
  type TriggerTargetArn               = String
  type Value                          = String
  type VersionId                      = String
  type WaitTimeInMins                 = Int
}

package codedeploy {
  @js.native
  @JSImport("aws-sdk", "CodeDeploy")
  class CodeDeploy() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput): Request[js.Object] = js.native
    def batchGetApplicationRevisions(
        params: BatchGetApplicationRevisionsInput
    ): Request[BatchGetApplicationRevisionsOutput]                                                   = js.native
    def batchGetApplications(params: BatchGetApplicationsInput): Request[BatchGetApplicationsOutput] = js.native
    def batchGetDeploymentGroups(params: BatchGetDeploymentGroupsInput): Request[BatchGetDeploymentGroupsOutput] =
      js.native
    def batchGetDeploymentInstances(
        params: BatchGetDeploymentInstancesInput
    ): Request[BatchGetDeploymentInstancesOutput] = js.native
    def batchGetDeploymentTargets(params: BatchGetDeploymentTargetsInput): Request[BatchGetDeploymentTargetsOutput] =
      js.native
    def batchGetDeployments(params: BatchGetDeploymentsInput): Request[BatchGetDeploymentsOutput] = js.native
    def batchGetOnPremisesInstances(
        params: BatchGetOnPremisesInstancesInput
    ): Request[BatchGetOnPremisesInstancesOutput]                                                          = js.native
    def continueDeployment(params: ContinueDeploymentInput): Request[js.Object]                            = js.native
    def createApplication(params: CreateApplicationInput): Request[CreateApplicationOutput]                = js.native
    def createDeployment(params: CreateDeploymentInput): Request[CreateDeploymentOutput]                   = js.native
    def createDeploymentConfig(params: CreateDeploymentConfigInput): Request[CreateDeploymentConfigOutput] = js.native
    def createDeploymentGroup(params: CreateDeploymentGroupInput): Request[CreateDeploymentGroupOutput]    = js.native
    def deleteApplication(params: DeleteApplicationInput): Request[js.Object]                              = js.native
    def deleteDeploymentConfig(params: DeleteDeploymentConfigInput): Request[js.Object]                    = js.native
    def deleteDeploymentGroup(params: DeleteDeploymentGroupInput): Request[DeleteDeploymentGroupOutput]    = js.native
    def deleteGitHubAccountToken(params: DeleteGitHubAccountTokenInput): Request[DeleteGitHubAccountTokenOutput] =
      js.native
    def deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput): Request[js.Object]        = js.native
    def getApplication(params: GetApplicationInput): Request[GetApplicationOutput]                         = js.native
    def getApplicationRevision(params: GetApplicationRevisionInput): Request[GetApplicationRevisionOutput] = js.native
    def getDeployment(params: GetDeploymentInput): Request[GetDeploymentOutput]                            = js.native
    def getDeploymentConfig(params: GetDeploymentConfigInput): Request[GetDeploymentConfigOutput]          = js.native
    def getDeploymentGroup(params: GetDeploymentGroupInput): Request[GetDeploymentGroupOutput]             = js.native
    def getDeploymentInstance(params: GetDeploymentInstanceInput): Request[GetDeploymentInstanceOutput]    = js.native
    def getDeploymentTarget(params: GetDeploymentTargetInput): Request[GetDeploymentTargetOutput]          = js.native
    def getOnPremisesInstance(params: GetOnPremisesInstanceInput): Request[GetOnPremisesInstanceOutput]    = js.native
    def listApplicationRevisions(params: ListApplicationRevisionsInput): Request[ListApplicationRevisionsOutput] =
      js.native
    def listApplications(params: ListApplicationsInput): Request[ListApplicationsOutput]                = js.native
    def listDeploymentConfigs(params: ListDeploymentConfigsInput): Request[ListDeploymentConfigsOutput] = js.native
    def listDeploymentGroups(params: ListDeploymentGroupsInput): Request[ListDeploymentGroupsOutput]    = js.native
    def listDeploymentInstances(params: ListDeploymentInstancesInput): Request[ListDeploymentInstancesOutput] =
      js.native
    def listDeploymentTargets(params: ListDeploymentTargetsInput): Request[ListDeploymentTargetsOutput] = js.native
    def listDeployments(params: ListDeploymentsInput): Request[ListDeploymentsOutput]                   = js.native
    def listGitHubAccountTokenNames(
        params: ListGitHubAccountTokenNamesInput
    ): Request[ListGitHubAccountTokenNamesOutput] = js.native
    def listOnPremisesInstances(params: ListOnPremisesInstancesInput): Request[ListOnPremisesInstancesOutput] =
      js.native
    def putLifecycleEventHookExecutionStatus(
        params: PutLifecycleEventHookExecutionStatusInput
    ): Request[PutLifecycleEventHookExecutionStatusOutput]                                        = js.native
    def registerApplicationRevision(params: RegisterApplicationRevisionInput): Request[js.Object] = js.native
    def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput): Request[js.Object]   = js.native
    def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput): Request[js.Object] =
      js.native
    def skipWaitTimeForInstanceTermination(params: SkipWaitTimeForInstanceTerminationInput): Request[js.Object] =
      js.native
    def stopDeployment(params: StopDeploymentInput): Request[StopDeploymentOutput]                      = js.native
    def updateApplication(params: UpdateApplicationInput): Request[js.Object]                           = js.native
    def updateDeploymentGroup(params: UpdateDeploymentGroupInput): Request[UpdateDeploymentGroupOutput] = js.native
  }

  /**
    * Represents the input of, and adds tags to, an on-premises instance operation.
    */
  @js.native
  trait AddTagsToOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
    var tags: TagList
  }

  object AddTagsToOnPremisesInstancesInput {
    def apply(instanceNames: InstanceNameList, tags: TagList): AddTagsToOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceNames" -> instanceNames.asInstanceOf[js.Any],
        "tags"          -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToOnPremisesInstancesInput]
    }
  }

  /**
    * Information about an alarm.
    */
  @js.native
  trait Alarm extends js.Object {
    var name: js.UndefOr[AlarmName]
  }

  object Alarm {
    def apply(name: js.UndefOr[AlarmName] = js.undefined): Alarm = {
      val _fields = IndexedSeq[(String, js.Any)]("name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alarm]
    }
  }

  /**
    * Information about alarms associated with the deployment group.
    */
  @js.native
  trait AlarmConfiguration extends js.Object {
    var alarms: js.UndefOr[AlarmList]
    var enabled: js.UndefOr[Boolean]
    var ignorePollAlarmFailure: js.UndefOr[Boolean]
  }

  object AlarmConfiguration {
    def apply(alarms: js.UndefOr[AlarmList] = js.undefined,
              enabled: js.UndefOr[Boolean] = js.undefined,
              ignorePollAlarmFailure: js.UndefOr[Boolean] = js.undefined): AlarmConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "alarms" -> alarms.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enabled" -> enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ignorePollAlarmFailure" -> ignorePollAlarmFailure.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlarmConfiguration]
    }
  }

  /**
    * A revision for an AWS Lambda or Amazon ECS deployment that is a YAML-formatted or JSON-formatted string. For AWS Lambda and Amazon ECS deployments, the revision is the same as the AppSpec file. This method replaces the deprecated <code>RawString</code> data type.
    */
  @js.native
  trait AppSpecContent extends js.Object {
    var content: js.UndefOr[RawStringContent]
    var sha256: js.UndefOr[RawStringSha256]
  }

  object AppSpecContent {
    def apply(content: js.UndefOr[RawStringContent] = js.undefined,
              sha256: js.UndefOr[RawStringSha256] = js.undefined): AppSpecContent = {
      val _fields = IndexedSeq[(String, js.Any)]("content" -> content.map { x =>
        x.asInstanceOf[js.Any]
      }, "sha256" -> sha256.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AppSpecContent]
    }
  }

  /**
    * Information about an application.
    */
  @js.native
  trait ApplicationInfo extends js.Object {
    var applicationId: js.UndefOr[ApplicationId]
    var applicationName: js.UndefOr[ApplicationName]
    var computePlatform: js.UndefOr[ComputePlatform]
    var createTime: js.UndefOr[Timestamp]
    var gitHubAccountName: js.UndefOr[GitHubAccountTokenName]
    var linkedToGitHub: js.UndefOr[Boolean]
  }

  object ApplicationInfo {
    def apply(applicationId: js.UndefOr[ApplicationId] = js.undefined,
              applicationName: js.UndefOr[ApplicationName] = js.undefined,
              computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
              createTime: js.UndefOr[Timestamp] = js.undefined,
              gitHubAccountName: js.UndefOr[GitHubAccountTokenName] = js.undefined,
              linkedToGitHub: js.UndefOr[Boolean] = js.undefined): ApplicationInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationId" -> applicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "applicationName" -> applicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "computePlatform" -> computePlatform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createTime" -> createTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "gitHubAccountName" -> gitHubAccountName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "linkedToGitHub" -> linkedToGitHub.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationInfo]
    }
  }

  object ApplicationRevisionSortByEnum {
    val registerTime  = "registerTime"
    val firstUsedTime = "firstUsedTime"
    val lastUsedTime  = "lastUsedTime"

    val values = IndexedSeq(registerTime, firstUsedTime, lastUsedTime)
  }

  /**
    * Information about a configuration for automatically rolling back to a previous version of an application revision when a deployment doesn't complete successfully.
    */
  @js.native
  trait AutoRollbackConfiguration extends js.Object {
    var enabled: js.UndefOr[Boolean]
    var events: js.UndefOr[AutoRollbackEventsList]
  }

  object AutoRollbackConfiguration {
    def apply(enabled: js.UndefOr[Boolean] = js.undefined,
              events: js.UndefOr[AutoRollbackEventsList] = js.undefined): AutoRollbackConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("enabled" -> enabled.map { x =>
        x.asInstanceOf[js.Any]
      }, "events" -> events.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoRollbackConfiguration]
    }
  }

  object AutoRollbackEventEnum {
    val DEPLOYMENT_FAILURE         = "DEPLOYMENT_FAILURE"
    val DEPLOYMENT_STOP_ON_ALARM   = "DEPLOYMENT_STOP_ON_ALARM"
    val DEPLOYMENT_STOP_ON_REQUEST = "DEPLOYMENT_STOP_ON_REQUEST"

    val values = IndexedSeq(DEPLOYMENT_FAILURE, DEPLOYMENT_STOP_ON_ALARM, DEPLOYMENT_STOP_ON_REQUEST)
  }

  /**
    * Information about an Auto Scaling group.
    */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var hook: js.UndefOr[AutoScalingGroupHook]
    var name: js.UndefOr[AutoScalingGroupName]
  }

  object AutoScalingGroup {
    def apply(hook: js.UndefOr[AutoScalingGroupHook] = js.undefined,
              name: js.UndefOr[AutoScalingGroupName] = js.undefined): AutoScalingGroup = {
      val _fields = IndexedSeq[(String, js.Any)]("hook" -> hook.map { x =>
        x.asInstanceOf[js.Any]
      }, "name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroup]
    }
  }

  /**
    * Represents the input of a BatchGetApplicationRevisions operation.
    */
  @js.native
  trait BatchGetApplicationRevisionsInput extends js.Object {
    var applicationName: ApplicationName
    var revisions: RevisionLocationList
  }

  object BatchGetApplicationRevisionsInput {
    def apply(applicationName: ApplicationName, revisions: RevisionLocationList): BatchGetApplicationRevisionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "revisions"       -> revisions.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationRevisionsInput]
    }
  }

  /**
    * Represents the output of a BatchGetApplicationRevisions operation.
    */
  @js.native
  trait BatchGetApplicationRevisionsOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var errorMessage: js.UndefOr[ErrorMessage]
    var revisions: js.UndefOr[RevisionInfoList]
  }

  object BatchGetApplicationRevisionsOutput {
    def apply(applicationName: js.UndefOr[ApplicationName] = js.undefined,
              errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
              revisions: js.UndefOr[RevisionInfoList] = js.undefined): BatchGetApplicationRevisionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorMessage" -> errorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "revisions" -> revisions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationRevisionsOutput]
    }
  }

  /**
    * Represents the input of a BatchGetApplications operation.
    */
  @js.native
  trait BatchGetApplicationsInput extends js.Object {
    var applicationNames: ApplicationsList
  }

  object BatchGetApplicationsInput {
    def apply(applicationNames: ApplicationsList): BatchGetApplicationsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("applicationNames" -> applicationNames.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationsInput]
    }
  }

  /**
    * Represents the output of a BatchGetApplications operation.
    */
  @js.native
  trait BatchGetApplicationsOutput extends js.Object {
    var applicationsInfo: js.UndefOr[ApplicationsInfoList]
  }

  object BatchGetApplicationsOutput {
    def apply(applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.undefined): BatchGetApplicationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("applicationsInfo" -> applicationsInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationsOutput]
    }
  }

  /**
    * Represents the input of a BatchGetDeploymentGroups operation.
    */
  @js.native
  trait BatchGetDeploymentGroupsInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupNames: DeploymentGroupsList
  }

  object BatchGetDeploymentGroupsInput {
    def apply(applicationName: ApplicationName,
              deploymentGroupNames: DeploymentGroupsList): BatchGetDeploymentGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName"      -> applicationName.asInstanceOf[js.Any],
        "deploymentGroupNames" -> deploymentGroupNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentGroupsInput]
    }
  }

  /**
    * Represents the output of a BatchGetDeploymentGroups operation.
    */
  @js.native
  trait BatchGetDeploymentGroupsOutput extends js.Object {
    var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchGetDeploymentGroupsOutput {
    def apply(deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList] = js.undefined,
              errorMessage: js.UndefOr[ErrorMessage] = js.undefined): BatchGetDeploymentGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentGroupsInfo" -> deploymentGroupsInfo.map { x =>
        x.asInstanceOf[js.Any]
      }, "errorMessage" -> errorMessage.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentGroupsOutput]
    }
  }

  /**
    * Represents the input of a BatchGetDeploymentInstances operation.
    */
  @js.native
  trait BatchGetDeploymentInstancesInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceIds: InstancesList
  }

  object BatchGetDeploymentInstancesInput {
    def apply(deploymentId: DeploymentId, instanceIds: InstancesList): BatchGetDeploymentInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "instanceIds"  -> instanceIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentInstancesInput]
    }
  }

  /**
    * Represents the output of a BatchGetDeploymentInstances operation.
    */
  @js.native
  trait BatchGetDeploymentInstancesOutput extends js.Object {
    var errorMessage: js.UndefOr[ErrorMessage]
    var instancesSummary: js.UndefOr[InstanceSummaryList]
  }

  object BatchGetDeploymentInstancesOutput {
    def apply(errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
              instancesSummary: js.UndefOr[InstanceSummaryList] = js.undefined): BatchGetDeploymentInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("errorMessage" -> errorMessage.map { x =>
        x.asInstanceOf[js.Any]
      }, "instancesSummary" -> instancesSummary.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentInstancesOutput]
    }
  }

  @js.native
  trait BatchGetDeploymentTargetsInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var targetIds: js.UndefOr[TargetIdList]
  }

  object BatchGetDeploymentTargetsInput {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              targetIds: js.UndefOr[TargetIdList] = js.undefined): BatchGetDeploymentTargetsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentId" -> deploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }, "targetIds" -> targetIds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentTargetsInput]
    }
  }

  @js.native
  trait BatchGetDeploymentTargetsOutput extends js.Object {
    var deploymentTargets: js.UndefOr[DeploymentTargetList]
  }

  object BatchGetDeploymentTargetsOutput {
    def apply(deploymentTargets: js.UndefOr[DeploymentTargetList] = js.undefined): BatchGetDeploymentTargetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentTargets" -> deploymentTargets.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentTargetsOutput]
    }
  }

  /**
    * Represents the input of a BatchGetDeployments operation.
    */
  @js.native
  trait BatchGetDeploymentsInput extends js.Object {
    var deploymentIds: DeploymentsList
  }

  object BatchGetDeploymentsInput {
    def apply(deploymentIds: DeploymentsList): BatchGetDeploymentsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentIds" -> deploymentIds.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentsInput]
    }
  }

  /**
    * Represents the output of a BatchGetDeployments operation.
    */
  @js.native
  trait BatchGetDeploymentsOutput extends js.Object {
    var deploymentsInfo: js.UndefOr[DeploymentsInfoList]
  }

  object BatchGetDeploymentsOutput {
    def apply(deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.undefined): BatchGetDeploymentsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentsInfo" -> deploymentsInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentsOutput]
    }
  }

  /**
    * Represents the input of a BatchGetOnPremisesInstances operation.
    */
  @js.native
  trait BatchGetOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
  }

  object BatchGetOnPremisesInstancesInput {
    def apply(instanceNames: InstanceNameList): BatchGetOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)]("instanceNames" -> instanceNames.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetOnPremisesInstancesInput]
    }
  }

  /**
    * Represents the output of a BatchGetOnPremisesInstances operation.
    */
  @js.native
  trait BatchGetOnPremisesInstancesOutput extends js.Object {
    var instanceInfos: js.UndefOr[InstanceInfoList]
  }

  object BatchGetOnPremisesInstancesOutput {
    def apply(instanceInfos: js.UndefOr[InstanceInfoList] = js.undefined): BatchGetOnPremisesInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("instanceInfos" -> instanceInfos.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetOnPremisesInstancesOutput]
    }
  }

  /**
    * Information about blue/green deployment options for a deployment group.
    */
  @js.native
  trait BlueGreenDeploymentConfiguration extends js.Object {
    var deploymentReadyOption: js.UndefOr[DeploymentReadyOption]
    var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption]
    var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption]
  }

  object BlueGreenDeploymentConfiguration {
    def apply(
        deploymentReadyOption: js.UndefOr[DeploymentReadyOption] = js.undefined,
        greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption] = js.undefined,
        terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption] = js.undefined
    ): BlueGreenDeploymentConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentReadyOption" -> deploymentReadyOption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "greenFleetProvisioningOption" -> greenFleetProvisioningOption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "terminateBlueInstancesOnDeploymentSuccess" -> terminateBlueInstancesOnDeploymentSuccess.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlueGreenDeploymentConfiguration]
    }
  }

  /**
    * Information about whether instances in the original environment are terminated when a blue/green deployment is successful.
    */
  @js.native
  trait BlueInstanceTerminationOption extends js.Object {
    var action: js.UndefOr[InstanceAction]
    var terminationWaitTimeInMinutes: js.UndefOr[Duration]
  }

  object BlueInstanceTerminationOption {
    def apply(action: js.UndefOr[InstanceAction] = js.undefined,
              terminationWaitTimeInMinutes: js.UndefOr[Duration] = js.undefined): BlueInstanceTerminationOption = {
      val _fields = IndexedSeq[(String, js.Any)]("action" -> action.map { x =>
        x.asInstanceOf[js.Any]
      }, "terminationWaitTimeInMinutes" -> terminationWaitTimeInMinutes.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlueInstanceTerminationOption]
    }
  }

  object BundleTypeEnum {
    val tar  = "tar"
    val tgz  = "tgz"
    val zip  = "zip"
    val YAML = "YAML"
    val JSON = "JSON"

    val values = IndexedSeq(tar, tgz, zip, YAML, JSON)
  }

  object ComputePlatformEnum {
    val Server = "Server"
    val Lambda = "Lambda"
    val ECS    = "ECS"

    val values = IndexedSeq(Server, Lambda, ECS)
  }

  @js.native
  trait ContinueDeploymentInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var deploymentWaitType: js.UndefOr[DeploymentWaitType]
  }

  object ContinueDeploymentInput {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              deploymentWaitType: js.UndefOr[DeploymentWaitType] = js.undefined): ContinueDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentId" -> deploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }, "deploymentWaitType" -> deploymentWaitType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueDeploymentInput]
    }
  }

  /**
    * Represents the input of a CreateApplication operation.
    */
  @js.native
  trait CreateApplicationInput extends js.Object {
    var applicationName: ApplicationName
    var computePlatform: js.UndefOr[ComputePlatform]
  }

  object CreateApplicationInput {
    def apply(applicationName: ApplicationName,
              computePlatform: js.UndefOr[ComputePlatform] = js.undefined): CreateApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "computePlatform" -> computePlatform.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationInput]
    }
  }

  /**
    * Represents the output of a CreateApplication operation.
    */
  @js.native
  trait CreateApplicationOutput extends js.Object {
    var applicationId: js.UndefOr[ApplicationId]
  }

  object CreateApplicationOutput {
    def apply(applicationId: js.UndefOr[ApplicationId] = js.undefined): CreateApplicationOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("applicationId" -> applicationId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationOutput]
    }
  }

  /**
    * Represents the input of a CreateDeploymentConfig operation.
    */
  @js.native
  trait CreateDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
    var computePlatform: js.UndefOr[ComputePlatform]
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts]
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig]
  }

  object CreateDeploymentConfigInput {
    def apply(deploymentConfigName: DeploymentConfigName,
              computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
              minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined,
              trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined): CreateDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentConfigName" -> deploymentConfigName.asInstanceOf[js.Any],
        "computePlatform" -> computePlatform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "minimumHealthyHosts" -> minimumHealthyHosts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "trafficRoutingConfig" -> trafficRoutingConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentConfigInput]
    }
  }

  /**
    * Represents the output of a CreateDeploymentConfig operation.
    */
  @js.native
  trait CreateDeploymentConfigOutput extends js.Object {
    var deploymentConfigId: js.UndefOr[DeploymentConfigId]
  }

  object CreateDeploymentConfigOutput {
    def apply(deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined): CreateDeploymentConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentConfigId" -> deploymentConfigId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentConfigOutput]
    }
  }

  /**
    * Represents the input of a CreateDeploymentGroup operation.
    */
  @js.native
  trait CreateDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
    var serviceRoleArn: Role
    var alarmConfiguration: js.UndefOr[AlarmConfiguration]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList]
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var deploymentStyle: js.UndefOr[DeploymentStyle]
    var ec2TagFilters: js.UndefOr[EC2TagFilterList]
    var ec2TagSet: js.UndefOr[EC2TagSet]
    var ecsServices: js.UndefOr[ECSServiceList]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList]
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
  }

  object CreateDeploymentGroupInput {
    def apply(applicationName: ApplicationName,
              deploymentGroupName: DeploymentGroupName,
              serviceRoleArn: Role,
              alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined,
              autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
              autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
              blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined,
              deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
              deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined,
              ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined,
              ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined,
              ecsServices: js.UndefOr[ECSServiceList] = js.undefined,
              loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
              onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
              onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined,
              triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined): CreateDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName"     -> applicationName.asInstanceOf[js.Any],
        "deploymentGroupName" -> deploymentGroupName.asInstanceOf[js.Any],
        "serviceRoleArn"      -> serviceRoleArn.asInstanceOf[js.Any],
        "alarmConfiguration" -> alarmConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoScalingGroups" -> autoScalingGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "blueGreenDeploymentConfiguration" -> blueGreenDeploymentConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentConfigName" -> deploymentConfigName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentStyle" -> deploymentStyle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ec2TagFilters" -> ec2TagFilters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ec2TagSet" -> ec2TagSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ecsServices" -> ecsServices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "loadBalancerInfo" -> loadBalancerInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "onPremisesTagSet" -> onPremisesTagSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "triggerConfigurations" -> triggerConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentGroupInput]
    }
  }

  /**
    * Represents the output of a CreateDeploymentGroup operation.
    */
  @js.native
  trait CreateDeploymentGroupOutput extends js.Object {
    var deploymentGroupId: js.UndefOr[DeploymentGroupId]
  }

  object CreateDeploymentGroupOutput {
    def apply(deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined): CreateDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentGroupId" -> deploymentGroupId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentGroupOutput]
    }
  }

  /**
    * Represents the input of a CreateDeployment operation.
    */
  @js.native
  trait CreateDeploymentInput extends js.Object {
    var applicationName: ApplicationName
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var description: js.UndefOr[Description]
    var fileExistsBehavior: js.UndefOr[FileExistsBehavior]
    var ignoreApplicationStopFailures: js.UndefOr[Boolean]
    var revision: js.UndefOr[RevisionLocation]
    var targetInstances: js.UndefOr[TargetInstances]
    var updateOutdatedInstancesOnly: js.UndefOr[Boolean]
  }

  object CreateDeploymentInput {
    def apply(applicationName: ApplicationName,
              autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
              deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
              deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
              description: js.UndefOr[Description] = js.undefined,
              fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined,
              ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
              revision: js.UndefOr[RevisionLocation] = js.undefined,
              targetInstances: js.UndefOr[TargetInstances] = js.undefined,
              updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined): CreateDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentConfigName" -> deploymentConfigName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentGroupName" -> deploymentGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fileExistsBehavior" -> fileExistsBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ignoreApplicationStopFailures" -> ignoreApplicationStopFailures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "revision" -> revision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetInstances" -> targetInstances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "updateOutdatedInstancesOnly" -> updateOutdatedInstancesOnly.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentInput]
    }
  }

  /**
    * Represents the output of a CreateDeployment operation.
    */
  @js.native
  trait CreateDeploymentOutput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  object CreateDeploymentOutput {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined): CreateDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentId" -> deploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentOutput]
    }
  }

  /**
    * Represents the input of a DeleteApplication operation.
    */
  @js.native
  trait DeleteApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  object DeleteApplicationInput {
    def apply(applicationName: ApplicationName): DeleteApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)]("applicationName" -> applicationName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationInput]
    }
  }

  /**
    * Represents the input of a DeleteDeploymentConfig operation.
    */
  @js.native
  trait DeleteDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
  }

  object DeleteDeploymentConfigInput {
    def apply(deploymentConfigName: DeploymentConfigName): DeleteDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentConfigName" -> deploymentConfigName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentConfigInput]
    }
  }

  /**
    * Represents the input of a DeleteDeploymentGroup operation.
    */
  @js.native
  trait DeleteDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
  }

  object DeleteDeploymentGroupInput {
    def apply(applicationName: ApplicationName,
              deploymentGroupName: DeploymentGroupName): DeleteDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName"     -> applicationName.asInstanceOf[js.Any],
        "deploymentGroupName" -> deploymentGroupName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentGroupInput]
    }
  }

  /**
    * Represents the output of a DeleteDeploymentGroup operation.
    */
  @js.native
  trait DeleteDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList]
  }

  object DeleteDeploymentGroupOutput {
    def apply(hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined): DeleteDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("hooksNotCleanedUp" -> hooksNotCleanedUp.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentGroupOutput]
    }
  }

  /**
    * Represents the input of a DeleteGitHubAccount operation.
    */
  @js.native
  trait DeleteGitHubAccountTokenInput extends js.Object {
    var tokenName: js.UndefOr[GitHubAccountTokenName]
  }

  object DeleteGitHubAccountTokenInput {
    def apply(tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined): DeleteGitHubAccountTokenInput = {
      val _fields = IndexedSeq[(String, js.Any)]("tokenName" -> tokenName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGitHubAccountTokenInput]
    }
  }

  /**
    * Represents the output of a DeleteGitHubAccountToken operation.
    */
  @js.native
  trait DeleteGitHubAccountTokenOutput extends js.Object {
    var tokenName: js.UndefOr[GitHubAccountTokenName]
  }

  object DeleteGitHubAccountTokenOutput {
    def apply(tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined): DeleteGitHubAccountTokenOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("tokenName" -> tokenName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGitHubAccountTokenOutput]
    }
  }

  /**
    * Information about a deployment configuration.
    */
  @js.native
  trait DeploymentConfigInfo extends js.Object {
    var computePlatform: js.UndefOr[ComputePlatform]
    var createTime: js.UndefOr[Timestamp]
    var deploymentConfigId: js.UndefOr[DeploymentConfigId]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts]
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig]
  }

  object DeploymentConfigInfo {
    def apply(computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
              createTime: js.UndefOr[Timestamp] = js.undefined,
              deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined,
              deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
              minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined,
              trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined): DeploymentConfigInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computePlatform" -> computePlatform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createTime" -> createTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentConfigId" -> deploymentConfigId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentConfigName" -> deploymentConfigName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "minimumHealthyHosts" -> minimumHealthyHosts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "trafficRoutingConfig" -> trafficRoutingConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentConfigInfo]
    }
  }

  object DeploymentCreatorEnum {
    val user               = "user"
    val autoscaling        = "autoscaling"
    val codeDeployRollback = "codeDeployRollback"

    val values = IndexedSeq(user, autoscaling, codeDeployRollback)
  }

  /**
    * Information about a deployment group.
    */
  @js.native
  trait DeploymentGroupInfo extends js.Object {
    var alarmConfiguration: js.UndefOr[AlarmConfiguration]
    var applicationName: js.UndefOr[ApplicationName]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var autoScalingGroups: js.UndefOr[AutoScalingGroupList]
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration]
    var computePlatform: js.UndefOr[ComputePlatform]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var deploymentGroupId: js.UndefOr[DeploymentGroupId]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var deploymentStyle: js.UndefOr[DeploymentStyle]
    var ec2TagFilters: js.UndefOr[EC2TagFilterList]
    var ec2TagSet: js.UndefOr[EC2TagSet]
    var ecsServices: js.UndefOr[ECSServiceList]
    var lastAttemptedDeployment: js.UndefOr[LastDeploymentInfo]
    var lastSuccessfulDeployment: js.UndefOr[LastDeploymentInfo]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList]
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet]
    var serviceRoleArn: js.UndefOr[Role]
    var targetRevision: js.UndefOr[RevisionLocation]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
  }

  object DeploymentGroupInfo {
    def apply(alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined,
              applicationName: js.UndefOr[ApplicationName] = js.undefined,
              autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
              autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
              blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined,
              computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
              deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
              deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined,
              deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
              deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined,
              ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined,
              ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined,
              ecsServices: js.UndefOr[ECSServiceList] = js.undefined,
              lastAttemptedDeployment: js.UndefOr[LastDeploymentInfo] = js.undefined,
              lastSuccessfulDeployment: js.UndefOr[LastDeploymentInfo] = js.undefined,
              loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
              onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
              onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined,
              serviceRoleArn: js.UndefOr[Role] = js.undefined,
              targetRevision: js.UndefOr[RevisionLocation] = js.undefined,
              triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined): DeploymentGroupInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "alarmConfiguration" -> alarmConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "applicationName" -> applicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoScalingGroups" -> autoScalingGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "blueGreenDeploymentConfiguration" -> blueGreenDeploymentConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "computePlatform" -> computePlatform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentConfigName" -> deploymentConfigName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentGroupId" -> deploymentGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentGroupName" -> deploymentGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentStyle" -> deploymentStyle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ec2TagFilters" -> ec2TagFilters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ec2TagSet" -> ec2TagSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ecsServices" -> ecsServices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastAttemptedDeployment" -> lastAttemptedDeployment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastSuccessfulDeployment" -> lastSuccessfulDeployment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "loadBalancerInfo" -> loadBalancerInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "onPremisesTagSet" -> onPremisesTagSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serviceRoleArn" -> serviceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetRevision" -> targetRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "triggerConfigurations" -> triggerConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentGroupInfo]
    }
  }

  /**
    * Information about a deployment.
    */
  @js.native
  trait DeploymentInfo extends js.Object {
    var additionalDeploymentStatusInfo: js.UndefOr[AdditionalDeploymentStatusInfo]
    var applicationName: js.UndefOr[ApplicationName]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration]
    var completeTime: js.UndefOr[Timestamp]
    var computePlatform: js.UndefOr[ComputePlatform]
    var createTime: js.UndefOr[Timestamp]
    var creator: js.UndefOr[DeploymentCreator]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var deploymentId: js.UndefOr[DeploymentId]
    var deploymentOverview: js.UndefOr[DeploymentOverview]
    var deploymentStatusMessages: js.UndefOr[DeploymentStatusMessageList]
    var deploymentStyle: js.UndefOr[DeploymentStyle]
    var description: js.UndefOr[Description]
    var errorInformation: js.UndefOr[ErrorInformation]
    var fileExistsBehavior: js.UndefOr[FileExistsBehavior]
    var ignoreApplicationStopFailures: js.UndefOr[Boolean]
    var instanceTerminationWaitTimeStarted: js.UndefOr[Boolean]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var previousRevision: js.UndefOr[RevisionLocation]
    var revision: js.UndefOr[RevisionLocation]
    var rollbackInfo: js.UndefOr[RollbackInfo]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DeploymentStatus]
    var targetInstances: js.UndefOr[TargetInstances]
    var updateOutdatedInstancesOnly: js.UndefOr[Boolean]
  }

  object DeploymentInfo {
    def apply(additionalDeploymentStatusInfo: js.UndefOr[AdditionalDeploymentStatusInfo] = js.undefined,
              applicationName: js.UndefOr[ApplicationName] = js.undefined,
              autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
              blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined,
              completeTime: js.UndefOr[Timestamp] = js.undefined,
              computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
              createTime: js.UndefOr[Timestamp] = js.undefined,
              creator: js.UndefOr[DeploymentCreator] = js.undefined,
              deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
              deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
              deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              deploymentOverview: js.UndefOr[DeploymentOverview] = js.undefined,
              deploymentStatusMessages: js.UndefOr[DeploymentStatusMessageList] = js.undefined,
              deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined,
              description: js.UndefOr[Description] = js.undefined,
              errorInformation: js.UndefOr[ErrorInformation] = js.undefined,
              fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined,
              ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
              instanceTerminationWaitTimeStarted: js.UndefOr[Boolean] = js.undefined,
              loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
              previousRevision: js.UndefOr[RevisionLocation] = js.undefined,
              revision: js.UndefOr[RevisionLocation] = js.undefined,
              rollbackInfo: js.UndefOr[RollbackInfo] = js.undefined,
              startTime: js.UndefOr[Timestamp] = js.undefined,
              status: js.UndefOr[DeploymentStatus] = js.undefined,
              targetInstances: js.UndefOr[TargetInstances] = js.undefined,
              updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined): DeploymentInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "additionalDeploymentStatusInfo" -> additionalDeploymentStatusInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "applicationName" -> applicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "blueGreenDeploymentConfiguration" -> blueGreenDeploymentConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "completeTime" -> completeTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "computePlatform" -> computePlatform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createTime" -> createTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creator" -> creator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentConfigName" -> deploymentConfigName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentGroupName" -> deploymentGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentId" -> deploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentOverview" -> deploymentOverview.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentStatusMessages" -> deploymentStatusMessages.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentStyle" -> deploymentStyle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorInformation" -> errorInformation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fileExistsBehavior" -> fileExistsBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ignoreApplicationStopFailures" -> ignoreApplicationStopFailures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceTerminationWaitTimeStarted" -> instanceTerminationWaitTimeStarted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "loadBalancerInfo" -> loadBalancerInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "previousRevision" -> previousRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "revision" -> revision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rollbackInfo" -> rollbackInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTime" -> startTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetInstances" -> targetInstances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "updateOutdatedInstancesOnly" -> updateOutdatedInstancesOnly.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentInfo]
    }
  }

  object DeploymentOptionEnum {
    val WITH_TRAFFIC_CONTROL    = "WITH_TRAFFIC_CONTROL"
    val WITHOUT_TRAFFIC_CONTROL = "WITHOUT_TRAFFIC_CONTROL"

    val values = IndexedSeq(WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL)
  }

  /**
    * Information about the deployment status of the instances in the deployment.
    */
  @js.native
  trait DeploymentOverview extends js.Object {
    var Failed: js.UndefOr[InstanceCount]
    var InProgress: js.UndefOr[InstanceCount]
    var Pending: js.UndefOr[InstanceCount]
    var Ready: js.UndefOr[InstanceCount]
    var Skipped: js.UndefOr[InstanceCount]
    var Succeeded: js.UndefOr[InstanceCount]
  }

  object DeploymentOverview {
    def apply(Failed: js.UndefOr[InstanceCount] = js.undefined,
              InProgress: js.UndefOr[InstanceCount] = js.undefined,
              Pending: js.UndefOr[InstanceCount] = js.undefined,
              Ready: js.UndefOr[InstanceCount] = js.undefined,
              Skipped: js.UndefOr[InstanceCount] = js.undefined,
              Succeeded: js.UndefOr[InstanceCount] = js.undefined): DeploymentOverview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Failed" -> Failed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InProgress" -> InProgress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pending" -> Pending.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ready" -> Ready.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Skipped" -> Skipped.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Succeeded" -> Succeeded.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentOverview]
    }
  }

  object DeploymentReadyActionEnum {
    val CONTINUE_DEPLOYMENT = "CONTINUE_DEPLOYMENT"
    val STOP_DEPLOYMENT     = "STOP_DEPLOYMENT"

    val values = IndexedSeq(CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT)
  }

  /**
    * Information about how traffic is rerouted to instances in a replacement environment in a blue/green deployment.
    */
  @js.native
  trait DeploymentReadyOption extends js.Object {
    var actionOnTimeout: js.UndefOr[DeploymentReadyAction]
    var waitTimeInMinutes: js.UndefOr[Duration]
  }

  object DeploymentReadyOption {
    def apply(actionOnTimeout: js.UndefOr[DeploymentReadyAction] = js.undefined,
              waitTimeInMinutes: js.UndefOr[Duration] = js.undefined): DeploymentReadyOption = {
      val _fields = IndexedSeq[(String, js.Any)]("actionOnTimeout" -> actionOnTimeout.map { x =>
        x.asInstanceOf[js.Any]
      }, "waitTimeInMinutes" -> waitTimeInMinutes.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentReadyOption]
    }
  }

  object DeploymentStatusEnum {
    val Created    = "Created"
    val Queued     = "Queued"
    val InProgress = "InProgress"
    val Succeeded  = "Succeeded"
    val Failed     = "Failed"
    val Stopped    = "Stopped"
    val Ready      = "Ready"

    val values = IndexedSeq(Created, Queued, InProgress, Succeeded, Failed, Stopped, Ready)
  }

  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  @js.native
  trait DeploymentStyle extends js.Object {
    var deploymentOption: js.UndefOr[DeploymentOption]
    var deploymentType: js.UndefOr[DeploymentType]
  }

  object DeploymentStyle {
    def apply(deploymentOption: js.UndefOr[DeploymentOption] = js.undefined,
              deploymentType: js.UndefOr[DeploymentType] = js.undefined): DeploymentStyle = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentOption" -> deploymentOption.map { x =>
        x.asInstanceOf[js.Any]
      }, "deploymentType" -> deploymentType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentStyle]
    }
  }

  /**
    * Information about the deployment target.
    */
  @js.native
  trait DeploymentTarget extends js.Object {
    var deploymentTargetType: js.UndefOr[DeploymentTargetType]
    var ecsTarget: js.UndefOr[ECSTarget]
    var instanceTarget: js.UndefOr[InstanceTarget]
    var lambdaTarget: js.UndefOr[LambdaTarget]
  }

  object DeploymentTarget {
    def apply(deploymentTargetType: js.UndefOr[DeploymentTargetType] = js.undefined,
              ecsTarget: js.UndefOr[ECSTarget] = js.undefined,
              instanceTarget: js.UndefOr[InstanceTarget] = js.undefined,
              lambdaTarget: js.UndefOr[LambdaTarget] = js.undefined): DeploymentTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentTargetType" -> deploymentTargetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ecsTarget" -> ecsTarget.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceTarget" -> instanceTarget.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lambdaTarget" -> lambdaTarget.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentTarget]
    }
  }

  object DeploymentTargetTypeEnum {
    val InstanceTarget = "InstanceTarget"
    val LambdaTarget   = "LambdaTarget"
    val ECSTarget      = "ECSTarget"

    val values = IndexedSeq(InstanceTarget, LambdaTarget, ECSTarget)
  }

  object DeploymentTypeEnum {
    val IN_PLACE   = "IN_PLACE"
    val BLUE_GREEN = "BLUE_GREEN"

    val values = IndexedSeq(IN_PLACE, BLUE_GREEN)
  }

  object DeploymentWaitTypeEnum {
    val READY_WAIT       = "READY_WAIT"
    val TERMINATION_WAIT = "TERMINATION_WAIT"

    val values = IndexedSeq(READY_WAIT, TERMINATION_WAIT)
  }

  /**
    * Represents the input of a DeregisterOnPremisesInstance operation.
    */
  @js.native
  trait DeregisterOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
  }

  object DeregisterOnPremisesInstanceInput {
    def apply(instanceName: InstanceName): DeregisterOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)]("instanceName" -> instanceName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterOnPremisesInstanceInput]
    }
  }

  /**
    * Diagnostic information about executable scripts that are part of a deployment.
    */
  @js.native
  trait Diagnostics extends js.Object {
    var errorCode: js.UndefOr[LifecycleErrorCode]
    var logTail: js.UndefOr[LogTail]
    var message: js.UndefOr[LifecycleMessage]
    var scriptName: js.UndefOr[ScriptName]
  }

  object Diagnostics {
    def apply(errorCode: js.UndefOr[LifecycleErrorCode] = js.undefined,
              logTail: js.UndefOr[LogTail] = js.undefined,
              message: js.UndefOr[LifecycleMessage] = js.undefined,
              scriptName: js.UndefOr[ScriptName] = js.undefined): Diagnostics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errorCode" -> errorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "logTail" -> logTail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "scriptName" -> scriptName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Diagnostics]
    }
  }

  /**
    * Information about an EC2 tag filter.
    */
  @js.native
  trait EC2TagFilter extends js.Object {
    var Key: js.UndefOr[Key]
    var Type: js.UndefOr[EC2TagFilterType]
    var Value: js.UndefOr[Value]
  }

  object EC2TagFilter {
    def apply(Key: js.UndefOr[Key] = js.undefined,
              Type: js.UndefOr[EC2TagFilterType] = js.undefined,
              Value: js.UndefOr[Value] = js.undefined): EC2TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Type" -> Type.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2TagFilter]
    }
  }

  object EC2TagFilterTypeEnum {
    val KEY_ONLY      = "KEY_ONLY"
    val VALUE_ONLY    = "VALUE_ONLY"
    val KEY_AND_VALUE = "KEY_AND_VALUE"

    val values = IndexedSeq(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
  }

  /**
    * Information about groups of EC2 instance tags.
    */
  @js.native
  trait EC2TagSet extends js.Object {
    var ec2TagSetList: js.UndefOr[EC2TagSetList]
  }

  object EC2TagSet {
    def apply(ec2TagSetList: js.UndefOr[EC2TagSetList] = js.undefined): EC2TagSet = {
      val _fields = IndexedSeq[(String, js.Any)]("ec2TagSetList" -> ec2TagSetList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2TagSet]
    }
  }

  /**
    * Contains the service and cluster names used to identify an Amazon ECS deployment's target.
    */
  @js.native
  trait ECSService extends js.Object {
    var clusterName: js.UndefOr[ECSClusterName]
    var serviceName: js.UndefOr[ECSServiceName]
  }

  object ECSService {
    def apply(clusterName: js.UndefOr[ECSClusterName] = js.undefined,
              serviceName: js.UndefOr[ECSServiceName] = js.undefined): ECSService = {
      val _fields = IndexedSeq[(String, js.Any)]("clusterName" -> clusterName.map { x =>
        x.asInstanceOf[js.Any]
      }, "serviceName" -> serviceName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ECSService]
    }
  }

  /**
    * Information about the target of an Amazon ECS deployment.
    */
  @js.native
  trait ECSTarget extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lastUpdatedAt: js.UndefOr[Time]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[TargetStatus]
    var targetArn: js.UndefOr[TargetArn]
    var targetId: js.UndefOr[TargetId]
    var taskSetsInfo: js.UndefOr[ECSTaskSetList]
  }

  object ECSTarget {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              lastUpdatedAt: js.UndefOr[Time] = js.undefined,
              lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
              status: js.UndefOr[TargetStatus] = js.undefined,
              targetArn: js.UndefOr[TargetArn] = js.undefined,
              targetId: js.UndefOr[TargetId] = js.undefined,
              taskSetsInfo: js.UndefOr[ECSTaskSetList] = js.undefined): ECSTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lifecycleEvents" -> lifecycleEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetArn" -> targetArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetId" -> targetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskSetsInfo" -> taskSetsInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ECSTarget]
    }
  }

  /**
    * A set of Amazon ECS tasks. A task set runs a specified number of instances of a task definition simultaneously inside an Amazon ECS service. Information about a set of Amazon ECS tasks in an AWS CodeDeploy deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic or not.
    */
  @js.native
  trait ECSTaskSet extends js.Object {
    var desiredCount: js.UndefOr[ECSTaskSetCount]
    var identifer: js.UndefOr[ECSTaskSetIdentifier]
    var pendingCount: js.UndefOr[ECSTaskSetCount]
    var runningCount: js.UndefOr[ECSTaskSetCount]
    var status: js.UndefOr[ECSTaskSetStatus]
    var targetGroup: js.UndefOr[TargetGroupInfo]
    var taskSetLabel: js.UndefOr[TargetLabel]
    var trafficWeight: js.UndefOr[TrafficWeight]
  }

  object ECSTaskSet {
    def apply(desiredCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
              identifer: js.UndefOr[ECSTaskSetIdentifier] = js.undefined,
              pendingCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
              runningCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
              status: js.UndefOr[ECSTaskSetStatus] = js.undefined,
              targetGroup: js.UndefOr[TargetGroupInfo] = js.undefined,
              taskSetLabel: js.UndefOr[TargetLabel] = js.undefined,
              trafficWeight: js.UndefOr[TrafficWeight] = js.undefined): ECSTaskSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "desiredCount" -> desiredCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "identifer" -> identifer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pendingCount" -> pendingCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "runningCount" -> runningCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetGroup" -> targetGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskSetLabel" -> taskSetLabel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "trafficWeight" -> trafficWeight.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ECSTaskSet]
    }
  }

  /**
    * Information about a load balancer in Elastic Load Balancing to use in a deployment. Instances are registered directly with a load balancer, and traffic is routed to the load balancer.
    */
  @js.native
  trait ELBInfo extends js.Object {
    var name: js.UndefOr[ELBName]
  }

  object ELBInfo {
    def apply(name: js.UndefOr[ELBName] = js.undefined): ELBInfo = {
      val _fields = IndexedSeq[(String, js.Any)]("name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ELBInfo]
    }
  }

  object ErrorCodeEnum {
    val DEPLOYMENT_GROUP_MISSING                    = "DEPLOYMENT_GROUP_MISSING"
    val APPLICATION_MISSING                         = "APPLICATION_MISSING"
    val REVISION_MISSING                            = "REVISION_MISSING"
    val IAM_ROLE_MISSING                            = "IAM_ROLE_MISSING"
    val IAM_ROLE_PERMISSIONS                        = "IAM_ROLE_PERMISSIONS"
    val NO_EC2_SUBSCRIPTION                         = "NO_EC2_SUBSCRIPTION"
    val OVER_MAX_INSTANCES                          = "OVER_MAX_INSTANCES"
    val NO_INSTANCES                                = "NO_INSTANCES"
    val TIMEOUT                                     = "TIMEOUT"
    val HEALTH_CONSTRAINTS_INVALID                  = "HEALTH_CONSTRAINTS_INVALID"
    val HEALTH_CONSTRAINTS                          = "HEALTH_CONSTRAINTS"
    val INTERNAL_ERROR                              = "INTERNAL_ERROR"
    val THROTTLED                                   = "THROTTLED"
    val ALARM_ACTIVE                                = "ALARM_ACTIVE"
    val AGENT_ISSUE                                 = "AGENT_ISSUE"
    val AUTO_SCALING_IAM_ROLE_PERMISSIONS           = "AUTO_SCALING_IAM_ROLE_PERMISSIONS"
    val AUTO_SCALING_CONFIGURATION                  = "AUTO_SCALING_CONFIGURATION"
    val MANUAL_STOP                                 = "MANUAL_STOP"
    val MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION = "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION"
    val MISSING_ELB_INFORMATION                     = "MISSING_ELB_INFORMATION"
    val MISSING_GITHUB_TOKEN                        = "MISSING_GITHUB_TOKEN"
    val ELASTIC_LOAD_BALANCING_INVALID              = "ELASTIC_LOAD_BALANCING_INVALID"
    val ELB_INVALID_INSTANCE                        = "ELB_INVALID_INSTANCE"
    val INVALID_LAMBDA_CONFIGURATION                = "INVALID_LAMBDA_CONFIGURATION"
    val INVALID_LAMBDA_FUNCTION                     = "INVALID_LAMBDA_FUNCTION"
    val HOOK_EXECUTION_FAILURE                      = "HOOK_EXECUTION_FAILURE"
    val AUTOSCALING_VALIDATION_ERROR                = "AUTOSCALING_VALIDATION_ERROR"
    val INVALID_ECS_SERVICE                         = "INVALID_ECS_SERVICE"
    val ECS_UPDATE_ERROR                            = "ECS_UPDATE_ERROR"
    val INVALID_REVISION                            = "INVALID_REVISION"

    val values = IndexedSeq(
      DEPLOYMENT_GROUP_MISSING,
      APPLICATION_MISSING,
      REVISION_MISSING,
      IAM_ROLE_MISSING,
      IAM_ROLE_PERMISSIONS,
      NO_EC2_SUBSCRIPTION,
      OVER_MAX_INSTANCES,
      NO_INSTANCES,
      TIMEOUT,
      HEALTH_CONSTRAINTS_INVALID,
      HEALTH_CONSTRAINTS,
      INTERNAL_ERROR,
      THROTTLED,
      ALARM_ACTIVE,
      AGENT_ISSUE,
      AUTO_SCALING_IAM_ROLE_PERMISSIONS,
      AUTO_SCALING_CONFIGURATION,
      MANUAL_STOP,
      MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION,
      MISSING_ELB_INFORMATION,
      MISSING_GITHUB_TOKEN,
      ELASTIC_LOAD_BALANCING_INVALID,
      ELB_INVALID_INSTANCE,
      INVALID_LAMBDA_CONFIGURATION,
      INVALID_LAMBDA_FUNCTION,
      HOOK_EXECUTION_FAILURE,
      AUTOSCALING_VALIDATION_ERROR,
      INVALID_ECS_SERVICE,
      ECS_UPDATE_ERROR,
      INVALID_REVISION
    )
  }

  /**
    * Information about a deployment error.
    */
  @js.native
  trait ErrorInformation extends js.Object {
    var code: js.UndefOr[ErrorCode]
    var message: js.UndefOr[ErrorMessage]
  }

  object ErrorInformation {
    def apply(code: js.UndefOr[ErrorCode] = js.undefined,
              message: js.UndefOr[ErrorMessage] = js.undefined): ErrorInformation = {
      val _fields = IndexedSeq[(String, js.Any)]("code" -> code.map { x =>
        x.asInstanceOf[js.Any]
      }, "message" -> message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorInformation]
    }
  }

  object FileExistsBehaviorEnum {
    val DISALLOW  = "DISALLOW"
    val OVERWRITE = "OVERWRITE"
    val RETAIN    = "RETAIN"

    val values = IndexedSeq(DISALLOW, OVERWRITE, RETAIN)
  }

  /**
    * Information about an application revision.
    */
  @js.native
  trait GenericRevisionInfo extends js.Object {
    var deploymentGroups: js.UndefOr[DeploymentGroupsList]
    var description: js.UndefOr[Description]
    var firstUsedTime: js.UndefOr[Timestamp]
    var lastUsedTime: js.UndefOr[Timestamp]
    var registerTime: js.UndefOr[Timestamp]
  }

  object GenericRevisionInfo {
    def apply(deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined,
              description: js.UndefOr[Description] = js.undefined,
              firstUsedTime: js.UndefOr[Timestamp] = js.undefined,
              lastUsedTime: js.UndefOr[Timestamp] = js.undefined,
              registerTime: js.UndefOr[Timestamp] = js.undefined): GenericRevisionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentGroups" -> deploymentGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "firstUsedTime" -> firstUsedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUsedTime" -> lastUsedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "registerTime" -> registerTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenericRevisionInfo]
    }
  }

  /**
    * Represents the input of a GetApplication operation.
    */
  @js.native
  trait GetApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  object GetApplicationInput {
    def apply(applicationName: ApplicationName): GetApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)]("applicationName" -> applicationName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationInput]
    }
  }

  /**
    * Represents the output of a GetApplication operation.
    */
  @js.native
  trait GetApplicationOutput extends js.Object {
    var application: js.UndefOr[ApplicationInfo]
  }

  object GetApplicationOutput {
    def apply(application: js.UndefOr[ApplicationInfo] = js.undefined): GetApplicationOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("application" -> application.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationOutput]
    }
  }

  /**
    * Represents the input of a GetApplicationRevision operation.
    */
  @js.native
  trait GetApplicationRevisionInput extends js.Object {
    var applicationName: ApplicationName
    var revision: RevisionLocation
  }

  object GetApplicationRevisionInput {
    def apply(applicationName: ApplicationName, revision: RevisionLocation): GetApplicationRevisionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "revision"        -> revision.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationRevisionInput]
    }
  }

  /**
    * Represents the output of a GetApplicationRevision operation.
    */
  @js.native
  trait GetApplicationRevisionOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var revision: js.UndefOr[RevisionLocation]
    var revisionInfo: js.UndefOr[GenericRevisionInfo]
  }

  object GetApplicationRevisionOutput {
    def apply(applicationName: js.UndefOr[ApplicationName] = js.undefined,
              revision: js.UndefOr[RevisionLocation] = js.undefined,
              revisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined): GetApplicationRevisionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "revision" -> revision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "revisionInfo" -> revisionInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationRevisionOutput]
    }
  }

  /**
    * Represents the input of a GetDeploymentConfig operation.
    */
  @js.native
  trait GetDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
  }

  object GetDeploymentConfigInput {
    def apply(deploymentConfigName: DeploymentConfigName): GetDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentConfigName" -> deploymentConfigName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentConfigInput]
    }
  }

  /**
    * Represents the output of a GetDeploymentConfig operation.
    */
  @js.native
  trait GetDeploymentConfigOutput extends js.Object {
    var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo]
  }

  object GetDeploymentConfigOutput {
    def apply(deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.undefined): GetDeploymentConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentConfigInfo" -> deploymentConfigInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentConfigOutput]
    }
  }

  /**
    * Represents the input of a GetDeploymentGroup operation.
    */
  @js.native
  trait GetDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
  }

  object GetDeploymentGroupInput {
    def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName): GetDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName"     -> applicationName.asInstanceOf[js.Any],
        "deploymentGroupName" -> deploymentGroupName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentGroupInput]
    }
  }

  /**
    * Represents the output of a GetDeploymentGroup operation.
    */
  @js.native
  trait GetDeploymentGroupOutput extends js.Object {
    var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo]
  }

  object GetDeploymentGroupOutput {
    def apply(deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.undefined): GetDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentGroupInfo" -> deploymentGroupInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentGroupOutput]
    }
  }

  /**
    * Represents the input of a GetDeployment operation.
    */
  @js.native
  trait GetDeploymentInput extends js.Object {
    var deploymentId: DeploymentId
  }

  object GetDeploymentInput {
    def apply(deploymentId: DeploymentId): GetDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentId" -> deploymentId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInput]
    }
  }

  /**
    * Represents the input of a GetDeploymentInstance operation.
    */
  @js.native
  trait GetDeploymentInstanceInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceId: InstanceId
  }

  object GetDeploymentInstanceInput {
    def apply(deploymentId: DeploymentId, instanceId: InstanceId): GetDeploymentInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "instanceId"   -> instanceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInstanceInput]
    }
  }

  /**
    * Represents the output of a GetDeploymentInstance operation.
    */
  @js.native
  trait GetDeploymentInstanceOutput extends js.Object {
    var instanceSummary: js.UndefOr[InstanceSummary]
  }

  object GetDeploymentInstanceOutput {
    def apply(instanceSummary: js.UndefOr[InstanceSummary] = js.undefined): GetDeploymentInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("instanceSummary" -> instanceSummary.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInstanceOutput]
    }
  }

  /**
    * Represents the output of a GetDeployment operation.
    */
  @js.native
  trait GetDeploymentOutput extends js.Object {
    var deploymentInfo: js.UndefOr[DeploymentInfo]
  }

  object GetDeploymentOutput {
    def apply(deploymentInfo: js.UndefOr[DeploymentInfo] = js.undefined): GetDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentInfo" -> deploymentInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentOutput]
    }
  }

  @js.native
  trait GetDeploymentTargetInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var targetId: js.UndefOr[TargetId]
  }

  object GetDeploymentTargetInput {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              targetId: js.UndefOr[TargetId] = js.undefined): GetDeploymentTargetInput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentId" -> deploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }, "targetId" -> targetId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentTargetInput]
    }
  }

  @js.native
  trait GetDeploymentTargetOutput extends js.Object {
    var deploymentTarget: js.UndefOr[DeploymentTarget]
  }

  object GetDeploymentTargetOutput {
    def apply(deploymentTarget: js.UndefOr[DeploymentTarget] = js.undefined): GetDeploymentTargetOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentTarget" -> deploymentTarget.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentTargetOutput]
    }
  }

  /**
    * Represents the input of a GetOnPremisesInstance operation.
    */
  @js.native
  trait GetOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
  }

  object GetOnPremisesInstanceInput {
    def apply(instanceName: InstanceName): GetOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)]("instanceName" -> instanceName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOnPremisesInstanceInput]
    }
  }

  /**
    * Represents the output of a GetOnPremisesInstance operation.
    */
  @js.native
  trait GetOnPremisesInstanceOutput extends js.Object {
    var instanceInfo: js.UndefOr[InstanceInfo]
  }

  object GetOnPremisesInstanceOutput {
    def apply(instanceInfo: js.UndefOr[InstanceInfo] = js.undefined): GetOnPremisesInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("instanceInfo" -> instanceInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOnPremisesInstanceOutput]
    }
  }

  /**
    * Information about the location of application artifacts stored in GitHub.
    */
  @js.native
  trait GitHubLocation extends js.Object {
    var commitId: js.UndefOr[CommitId]
    var repository: js.UndefOr[Repository]
  }

  object GitHubLocation {
    def apply(commitId: js.UndefOr[CommitId] = js.undefined,
              repository: js.UndefOr[Repository] = js.undefined): GitHubLocation = {
      val _fields = IndexedSeq[(String, js.Any)]("commitId" -> commitId.map { x =>
        x.asInstanceOf[js.Any]
      }, "repository" -> repository.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GitHubLocation]
    }
  }

  object GreenFleetProvisioningActionEnum {
    val DISCOVER_EXISTING       = "DISCOVER_EXISTING"
    val COPY_AUTO_SCALING_GROUP = "COPY_AUTO_SCALING_GROUP"

    val values = IndexedSeq(DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP)
  }

  /**
    * Information about the instances that belong to the replacement environment in a blue/green deployment.
    */
  @js.native
  trait GreenFleetProvisioningOption extends js.Object {
    var action: js.UndefOr[GreenFleetProvisioningAction]
  }

  object GreenFleetProvisioningOption {
    def apply(action: js.UndefOr[GreenFleetProvisioningAction] = js.undefined): GreenFleetProvisioningOption = {
      val _fields = IndexedSeq[(String, js.Any)]("action" -> action.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GreenFleetProvisioningOption]
    }
  }

  object InstanceActionEnum {
    val TERMINATE  = "TERMINATE"
    val KEEP_ALIVE = "KEEP_ALIVE"

    val values = IndexedSeq(TERMINATE, KEEP_ALIVE)
  }

  /**
    * Information about an on-premises instance.
    */
  @js.native
  trait InstanceInfo extends js.Object {
    var deregisterTime: js.UndefOr[Timestamp]
    var iamSessionArn: js.UndefOr[IamSessionArn]
    var iamUserArn: js.UndefOr[IamUserArn]
    var instanceArn: js.UndefOr[InstanceArn]
    var instanceName: js.UndefOr[InstanceName]
    var registerTime: js.UndefOr[Timestamp]
    var tags: js.UndefOr[TagList]
  }

  object InstanceInfo {
    def apply(deregisterTime: js.UndefOr[Timestamp] = js.undefined,
              iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined,
              iamUserArn: js.UndefOr[IamUserArn] = js.undefined,
              instanceArn: js.UndefOr[InstanceArn] = js.undefined,
              instanceName: js.UndefOr[InstanceName] = js.undefined,
              registerTime: js.UndefOr[Timestamp] = js.undefined,
              tags: js.UndefOr[TagList] = js.undefined): InstanceInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deregisterTime" -> deregisterTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iamSessionArn" -> iamSessionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iamUserArn" -> iamUserArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceArn" -> instanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceName" -> instanceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "registerTime" -> registerTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInfo]
    }
  }

  @deprecated
  object InstanceStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Succeeded  = "Succeeded"
    val Failed     = "Failed"
    val Skipped    = "Skipped"
    val Unknown    = "Unknown"
    val Ready      = "Ready"

    val values = IndexedSeq(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
  }

  /**
    * Information about an instance in a deployment.
    */
  @deprecated
  @js.native
  trait InstanceSummary extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var instanceId: js.UndefOr[InstanceId]
    var instanceType: js.UndefOr[InstanceType]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[InstanceStatus]
  }

  object InstanceSummary {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              instanceId: js.UndefOr[InstanceId] = js.undefined,
              instanceType: js.UndefOr[InstanceType] = js.undefined,
              lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
              lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
              status: js.UndefOr[InstanceStatus] = js.undefined): InstanceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceId" -> instanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceType" -> instanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lifecycleEvents" -> lifecycleEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceSummary]
    }
  }

  /**
    * A target Amazon EC2 or on-premises instance during a deployment that uses the EC2/On-premises compute platform.
    */
  @js.native
  trait InstanceTarget extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var instanceLabel: js.UndefOr[TargetLabel]
    var lastUpdatedAt: js.UndefOr[Time]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[TargetStatus]
    var targetArn: js.UndefOr[TargetArn]
    var targetId: js.UndefOr[TargetId]
  }

  object InstanceTarget {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              instanceLabel: js.UndefOr[TargetLabel] = js.undefined,
              lastUpdatedAt: js.UndefOr[Time] = js.undefined,
              lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
              status: js.UndefOr[TargetStatus] = js.undefined,
              targetArn: js.UndefOr[TargetArn] = js.undefined,
              targetId: js.UndefOr[TargetId] = js.undefined): InstanceTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceLabel" -> instanceLabel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lifecycleEvents" -> lifecycleEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetArn" -> targetArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetId" -> targetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceTarget]
    }
  }

  object InstanceTypeEnum {
    val Blue  = "Blue"
    val Green = "Green"

    val values = IndexedSeq(Blue, Green)
  }

  /**
    * Information about the target AWS Lambda function during an AWS Lambda deployment.
    */
  @js.native
  trait LambdaTarget extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lastUpdatedAt: js.UndefOr[Time]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[TargetStatus]
    var targetArn: js.UndefOr[TargetArn]
    var targetId: js.UndefOr[TargetId]
  }

  object LambdaTarget {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              lastUpdatedAt: js.UndefOr[Time] = js.undefined,
              lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
              status: js.UndefOr[TargetStatus] = js.undefined,
              targetArn: js.UndefOr[TargetArn] = js.undefined,
              targetId: js.UndefOr[TargetId] = js.undefined): LambdaTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lifecycleEvents" -> lifecycleEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetArn" -> targetArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetId" -> targetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaTarget]
    }
  }

  /**
    * Information about the most recent attempted or successful deployment to a deployment group.
    */
  @js.native
  trait LastDeploymentInfo extends js.Object {
    var createTime: js.UndefOr[Timestamp]
    var deploymentId: js.UndefOr[DeploymentId]
    var endTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DeploymentStatus]
  }

  object LastDeploymentInfo {
    def apply(createTime: js.UndefOr[Timestamp] = js.undefined,
              deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              endTime: js.UndefOr[Timestamp] = js.undefined,
              status: js.UndefOr[DeploymentStatus] = js.undefined): LastDeploymentInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createTime" -> createTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentId" -> deploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "endTime" -> endTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LastDeploymentInfo]
    }
  }

  object LifecycleErrorCodeEnum {
    val Success             = "Success"
    val ScriptMissing       = "ScriptMissing"
    val ScriptNotExecutable = "ScriptNotExecutable"
    val ScriptTimedOut      = "ScriptTimedOut"
    val ScriptFailed        = "ScriptFailed"
    val UnknownError        = "UnknownError"

    val values = IndexedSeq(Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError)
  }

  /**
    * Information about a deployment lifecycle event.
    */
  @js.native
  trait LifecycleEvent extends js.Object {
    var diagnostics: js.UndefOr[Diagnostics]
    var endTime: js.UndefOr[Timestamp]
    var lifecycleEventName: js.UndefOr[LifecycleEventName]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[LifecycleEventStatus]
  }

  object LifecycleEvent {
    def apply(diagnostics: js.UndefOr[Diagnostics] = js.undefined,
              endTime: js.UndefOr[Timestamp] = js.undefined,
              lifecycleEventName: js.UndefOr[LifecycleEventName] = js.undefined,
              startTime: js.UndefOr[Timestamp] = js.undefined,
              status: js.UndefOr[LifecycleEventStatus] = js.undefined): LifecycleEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diagnostics" -> diagnostics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "endTime" -> endTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lifecycleEventName" -> lifecycleEventName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTime" -> startTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleEvent]
    }
  }

  object LifecycleEventStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Succeeded  = "Succeeded"
    val Failed     = "Failed"
    val Skipped    = "Skipped"
    val Unknown    = "Unknown"

    val values = IndexedSeq(Pending, InProgress, Succeeded, Failed, Skipped, Unknown)
  }

  /**
    * Represents the input of a ListApplicationRevisions operation.
    */
  @js.native
  trait ListApplicationRevisionsInput extends js.Object {
    var applicationName: ApplicationName
    var deployed: js.UndefOr[ListStateFilterAction]
    var nextToken: js.UndefOr[NextToken]
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3KeyPrefix: js.UndefOr[S3Key]
    var sortBy: js.UndefOr[ApplicationRevisionSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object ListApplicationRevisionsInput {
    def apply(applicationName: ApplicationName,
              deployed: js.UndefOr[ListStateFilterAction] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined,
              s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
              s3KeyPrefix: js.UndefOr[S3Key] = js.undefined,
              sortBy: js.UndefOr[ApplicationRevisionSortBy] = js.undefined,
              sortOrder: js.UndefOr[SortOrder] = js.undefined): ListApplicationRevisionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "deployed" -> deployed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "s3Bucket" -> s3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "s3KeyPrefix" -> s3KeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sortBy" -> sortBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sortOrder" -> sortOrder.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationRevisionsInput]
    }
  }

  /**
    * Represents the output of a ListApplicationRevisions operation.
    */
  @js.native
  trait ListApplicationRevisionsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var revisions: js.UndefOr[RevisionLocationList]
  }

  object ListApplicationRevisionsOutput {
    def apply(nextToken: js.UndefOr[NextToken] = js.undefined,
              revisions: js.UndefOr[RevisionLocationList] = js.undefined): ListApplicationRevisionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "revisions" -> revisions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationRevisionsOutput]
    }
  }

  /**
    * Represents the input of a ListApplications operation.
    */
  @js.native
  trait ListApplicationsInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsInput {
    def apply(nextToken: js.UndefOr[NextToken] = js.undefined): ListApplicationsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsInput]
    }
  }

  /**
    * Represents the output of a ListApplications operation.
    */
  @js.native
  trait ListApplicationsOutput extends js.Object {
    var applications: js.UndefOr[ApplicationsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsOutput {
    def apply(applications: js.UndefOr[ApplicationsList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListApplicationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("applications" -> applications.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsOutput]
    }
  }

  /**
    * Represents the input of a ListDeploymentConfigs operation.
    */
  @js.native
  trait ListDeploymentConfigsInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentConfigsInput {
    def apply(nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentConfigsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentConfigsInput]
    }
  }

  /**
    * Represents the output of a ListDeploymentConfigs operation.
    */
  @js.native
  trait ListDeploymentConfigsOutput extends js.Object {
    var deploymentConfigsList: js.UndefOr[DeploymentConfigsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentConfigsOutput {
    def apply(deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentConfigsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentConfigsList" -> deploymentConfigsList.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentConfigsOutput]
    }
  }

  /**
    * Represents the input of a ListDeploymentGroups operation.
    */
  @js.native
  trait ListDeploymentGroupsInput extends js.Object {
    var applicationName: ApplicationName
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentGroupsInput {
    def apply(applicationName: ApplicationName,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentGroupsInput]
    }
  }

  /**
    * Represents the output of a ListDeploymentGroups operation.
    */
  @js.native
  trait ListDeploymentGroupsOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var deploymentGroups: js.UndefOr[DeploymentGroupsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentGroupsOutput {
    def apply(applicationName: js.UndefOr[ApplicationName] = js.undefined,
              deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentGroups" -> deploymentGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentGroupsOutput]
    }
  }

  /**
    * Represents the input of a ListDeploymentInstances operation.
    */
  @js.native
  trait ListDeploymentInstancesInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceStatusFilter: js.UndefOr[InstanceStatusList]
    var instanceTypeFilter: js.UndefOr[InstanceTypeList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentInstancesInput {
    def apply(deploymentId: DeploymentId,
              instanceStatusFilter: js.UndefOr[InstanceStatusList] = js.undefined,
              instanceTypeFilter: js.UndefOr[InstanceTypeList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "instanceStatusFilter" -> instanceStatusFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceTypeFilter" -> instanceTypeFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentInstancesInput]
    }
  }

  /**
    * Represents the output of a ListDeploymentInstances operation.
    */
  @js.native
  trait ListDeploymentInstancesOutput extends js.Object {
    var instancesList: js.UndefOr[InstancesList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentInstancesOutput {
    def apply(instancesList: js.UndefOr[InstancesList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("instancesList" -> instancesList.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentInstancesOutput]
    }
  }

  @js.native
  trait ListDeploymentTargetsInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var nextToken: js.UndefOr[NextToken]
    var targetFilters: js.UndefOr[TargetFilters]
  }

  object ListDeploymentTargetsInput {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined,
              targetFilters: js.UndefOr[TargetFilters] = js.undefined): ListDeploymentTargetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetFilters" -> targetFilters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentTargetsInput]
    }
  }

  @js.native
  trait ListDeploymentTargetsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var targetIds: js.UndefOr[TargetIdList]
  }

  object ListDeploymentTargetsOutput {
    def apply(nextToken: js.UndefOr[NextToken] = js.undefined,
              targetIds: js.UndefOr[TargetIdList] = js.undefined): ListDeploymentTargetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "targetIds" -> targetIds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentTargetsOutput]
    }
  }

  /**
    * Represents the input of a ListDeployments operation.
    */
  @js.native
  trait ListDeploymentsInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var createTimeRange: js.UndefOr[TimeRange]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var includeOnlyStatuses: js.UndefOr[DeploymentStatusList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentsInput {
    def apply(applicationName: js.UndefOr[ApplicationName] = js.undefined,
              createTimeRange: js.UndefOr[TimeRange] = js.undefined,
              deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
              includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createTimeRange" -> createTimeRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentGroupName" -> deploymentGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "includeOnlyStatuses" -> includeOnlyStatuses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentsInput]
    }
  }

  /**
    * Represents the output of a ListDeployments operation.
    */
  @js.native
  trait ListDeploymentsOutput extends js.Object {
    var deployments: js.UndefOr[DeploymentsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentsOutput {
    def apply(deployments: js.UndefOr[DeploymentsList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("deployments" -> deployments.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentsOutput]
    }
  }

  /**
    * Represents the input of a ListGitHubAccountTokenNames operation.
    */
  @js.native
  trait ListGitHubAccountTokenNamesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListGitHubAccountTokenNamesInput {
    def apply(nextToken: js.UndefOr[NextToken] = js.undefined): ListGitHubAccountTokenNamesInput = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGitHubAccountTokenNamesInput]
    }
  }

  /**
    * Represents the output of a ListGitHubAccountTokenNames operation.
    */
  @js.native
  trait ListGitHubAccountTokenNamesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tokenNameList: js.UndefOr[GitHubAccountTokenNameList]
  }

  object ListGitHubAccountTokenNamesOutput {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tokenNameList: js.UndefOr[GitHubAccountTokenNameList] = js.undefined
    ): ListGitHubAccountTokenNamesOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "tokenNameList" -> tokenNameList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGitHubAccountTokenNamesOutput]
    }
  }

  /**
    * Represents the input of a ListOnPremisesInstances operation.
    */
  @js.native
  trait ListOnPremisesInstancesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var registrationStatus: js.UndefOr[RegistrationStatus]
    var tagFilters: js.UndefOr[TagFilterList]
  }

  object ListOnPremisesInstancesInput {
    def apply(nextToken: js.UndefOr[NextToken] = js.undefined,
              registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
              tagFilters: js.UndefOr[TagFilterList] = js.undefined): ListOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "registrationStatus" -> registrationStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tagFilters" -> tagFilters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOnPremisesInstancesInput]
    }
  }

  /**
    * Represents the output of list on-premises instances operation.
    */
  @js.native
  trait ListOnPremisesInstancesOutput extends js.Object {
    var instanceNames: js.UndefOr[InstanceNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListOnPremisesInstancesOutput {
    def apply(instanceNames: js.UndefOr[InstanceNameList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListOnPremisesInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("instanceNames" -> instanceNames.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOnPremisesInstancesOutput]
    }
  }

  object ListStateFilterActionEnum {
    val include = "include"
    val exclude = "exclude"
    val ignore  = "ignore"

    val values = IndexedSeq(include, exclude, ignore)
  }

  /**
    * Information about the Elastic Load Balancing load balancer or target group used in a deployment.
    */
  @js.native
  trait LoadBalancerInfo extends js.Object {
    var elbInfoList: js.UndefOr[ELBInfoList]
    var targetGroupInfoList: js.UndefOr[TargetGroupInfoList]
    var targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList]
  }

  object LoadBalancerInfo {
    def apply(elbInfoList: js.UndefOr[ELBInfoList] = js.undefined,
              targetGroupInfoList: js.UndefOr[TargetGroupInfoList] = js.undefined,
              targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList] = js.undefined): LoadBalancerInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "elbInfoList" -> elbInfoList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetGroupInfoList" -> targetGroupInfoList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetGroupPairInfoList" -> targetGroupPairInfoList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerInfo]
    }
  }

  /**
    * Information about minimum healthy instance.
    */
  @js.native
  trait MinimumHealthyHosts extends js.Object {
    var `type`: js.UndefOr[MinimumHealthyHostsType]
    var value: js.UndefOr[MinimumHealthyHostsValue]
  }

  object MinimumHealthyHosts {
    def apply(`type`: js.UndefOr[MinimumHealthyHostsType] = js.undefined,
              value: js.UndefOr[MinimumHealthyHostsValue] = js.undefined): MinimumHealthyHosts = {
      val _fields = IndexedSeq[(String, js.Any)]("`type`" -> `type`.map { x =>
        x.asInstanceOf[js.Any]
      }, "value" -> value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MinimumHealthyHosts]
    }
  }

  object MinimumHealthyHostsTypeEnum {
    val HOST_COUNT    = "HOST_COUNT"
    val FLEET_PERCENT = "FLEET_PERCENT"

    val values = IndexedSeq(HOST_COUNT, FLEET_PERCENT)
  }

  /**
    * Information about groups of on-premises instance tags.
    */
  @js.native
  trait OnPremisesTagSet extends js.Object {
    var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList]
  }

  object OnPremisesTagSet {
    def apply(onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList] = js.undefined): OnPremisesTagSet = {
      val _fields = IndexedSeq[(String, js.Any)]("onPremisesTagSetList" -> onPremisesTagSetList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OnPremisesTagSet]
    }
  }

  @js.native
  trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId]
    var status: js.UndefOr[LifecycleEventStatus]
  }

  object PutLifecycleEventHookExecutionStatusInput {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined,
              lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined,
              status: js.UndefOr[LifecycleEventStatus] = js.undefined): PutLifecycleEventHookExecutionStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lifecycleEventHookExecutionId" -> lifecycleEventHookExecutionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
    }
  }

  @js.native
  trait PutLifecycleEventHookExecutionStatusOutput extends js.Object {
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId]
  }

  object PutLifecycleEventHookExecutionStatusOutput {
    def apply(
        lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined
    ): PutLifecycleEventHookExecutionStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("lifecycleEventHookExecutionId" -> lifecycleEventHookExecutionId.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutLifecycleEventHookExecutionStatusOutput]
    }
  }

  /**
    * A revision for an AWS Lambda deployment that is a YAML-formatted or JSON-formatted string. For AWS Lambda deployments, the revision is the same as the AppSpec file.
    */
  @deprecated
  @js.native
  trait RawString extends js.Object {
    var content: js.UndefOr[RawStringContent]
    var sha256: js.UndefOr[RawStringSha256]
  }

  object RawString {
    def apply(content: js.UndefOr[RawStringContent] = js.undefined,
              sha256: js.UndefOr[RawStringSha256] = js.undefined): RawString = {
      val _fields = IndexedSeq[(String, js.Any)]("content" -> content.map { x =>
        x.asInstanceOf[js.Any]
      }, "sha256" -> sha256.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RawString]
    }
  }

  /**
    * Represents the input of a RegisterApplicationRevision operation.
    */
  @js.native
  trait RegisterApplicationRevisionInput extends js.Object {
    var applicationName: ApplicationName
    var revision: RevisionLocation
    var description: js.UndefOr[Description]
  }

  object RegisterApplicationRevisionInput {
    def apply(applicationName: ApplicationName,
              revision: RevisionLocation,
              description: js.UndefOr[Description] = js.undefined): RegisterApplicationRevisionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "revision"        -> revision.asInstanceOf[js.Any],
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterApplicationRevisionInput]
    }
  }

  /**
    * Represents the input of the register on-premises instance operation.
    */
  @js.native
  trait RegisterOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
    var iamSessionArn: js.UndefOr[IamSessionArn]
    var iamUserArn: js.UndefOr[IamUserArn]
  }

  object RegisterOnPremisesInstanceInput {
    def apply(instanceName: InstanceName,
              iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined,
              iamUserArn: js.UndefOr[IamUserArn] = js.undefined): RegisterOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "iamSessionArn" -> iamSessionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iamUserArn" -> iamUserArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterOnPremisesInstanceInput]
    }
  }

  object RegistrationStatusEnum {
    val Registered   = "Registered"
    val Deregistered = "Deregistered"

    val values = IndexedSeq(Registered, Deregistered)
  }

  /**
    * Represents the input of a RemoveTagsFromOnPremisesInstances operation.
    */
  @js.native
  trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
    var tags: TagList
  }

  object RemoveTagsFromOnPremisesInstancesInput {
    def apply(instanceNames: InstanceNameList, tags: TagList): RemoveTagsFromOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceNames" -> instanceNames.asInstanceOf[js.Any],
        "tags"          -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromOnPremisesInstancesInput]
    }
  }

  /**
    * Information about an application revision.
    */
  @js.native
  trait RevisionInfo extends js.Object {
    var genericRevisionInfo: js.UndefOr[GenericRevisionInfo]
    var revisionLocation: js.UndefOr[RevisionLocation]
  }

  object RevisionInfo {
    def apply(genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined,
              revisionLocation: js.UndefOr[RevisionLocation] = js.undefined): RevisionInfo = {
      val _fields = IndexedSeq[(String, js.Any)]("genericRevisionInfo" -> genericRevisionInfo.map { x =>
        x.asInstanceOf[js.Any]
      }, "revisionLocation" -> revisionLocation.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevisionInfo]
    }
  }

  /**
    * Information about the location of an application revision.
    */
  @js.native
  trait RevisionLocation extends js.Object {
    var appSpecContent: js.UndefOr[AppSpecContent]
    var gitHubLocation: js.UndefOr[GitHubLocation]
    var revisionType: js.UndefOr[RevisionLocationType]
    var s3Location: js.UndefOr[S3Location]
    var string: js.UndefOr[RawString]
  }

  object RevisionLocation {
    def apply(appSpecContent: js.UndefOr[AppSpecContent] = js.undefined,
              gitHubLocation: js.UndefOr[GitHubLocation] = js.undefined,
              revisionType: js.UndefOr[RevisionLocationType] = js.undefined,
              s3Location: js.UndefOr[S3Location] = js.undefined,
              string: js.UndefOr[RawString] = js.undefined): RevisionLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appSpecContent" -> appSpecContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "gitHubLocation" -> gitHubLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "revisionType" -> revisionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "s3Location" -> s3Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "string" -> string.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevisionLocation]
    }
  }

  object RevisionLocationTypeEnum {
    val S3             = "S3"
    val GitHub         = "GitHub"
    val String         = "String"
    val AppSpecContent = "AppSpecContent"

    val values = IndexedSeq(S3, GitHub, String, AppSpecContent)
  }

  /**
    * Information about a deployment rollback.
    */
  @js.native
  trait RollbackInfo extends js.Object {
    var rollbackDeploymentId: js.UndefOr[DeploymentId]
    var rollbackMessage: js.UndefOr[Description]
    var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId]
  }

  object RollbackInfo {
    def apply(rollbackDeploymentId: js.UndefOr[DeploymentId] = js.undefined,
              rollbackMessage: js.UndefOr[Description] = js.undefined,
              rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId] = js.undefined): RollbackInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rollbackDeploymentId" -> rollbackDeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rollbackMessage" -> rollbackMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rollbackTriggeringDeploymentId" -> rollbackTriggeringDeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RollbackInfo]
    }
  }

  /**
    * Information about the location of application artifacts stored in Amazon S3.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var bundleType: js.UndefOr[BundleType]
    var eTag: js.UndefOr[ETag]
    var key: js.UndefOr[S3Key]
    var version: js.UndefOr[VersionId]
  }

  object S3Location {
    def apply(bucket: js.UndefOr[S3Bucket] = js.undefined,
              bundleType: js.UndefOr[BundleType] = js.undefined,
              eTag: js.UndefOr[ETag] = js.undefined,
              key: js.UndefOr[S3Key] = js.undefined,
              version: js.UndefOr[VersionId] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucket" -> bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "bundleType" -> bundleType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "eTag" -> eTag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "key" -> key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  @js.native
  trait SkipWaitTimeForInstanceTerminationInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  object SkipWaitTimeForInstanceTerminationInput {
    def apply(deploymentId: js.UndefOr[DeploymentId] = js.undefined): SkipWaitTimeForInstanceTerminationInput = {
      val _fields = IndexedSeq[(String, js.Any)]("deploymentId" -> deploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SkipWaitTimeForInstanceTerminationInput]
    }
  }

  object SortOrderEnum {
    val ascending  = "ascending"
    val descending = "descending"

    val values = IndexedSeq(ascending, descending)
  }

  /**
    * Represents the input of a StopDeployment operation.
    */
  @js.native
  trait StopDeploymentInput extends js.Object {
    var deploymentId: DeploymentId
    var autoRollbackEnabled: js.UndefOr[NullableBoolean]
  }

  object StopDeploymentInput {
    def apply(deploymentId: DeploymentId,
              autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.undefined): StopDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "autoRollbackEnabled" -> autoRollbackEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDeploymentInput]
    }
  }

  /**
    * Represents the output of a StopDeployment operation.
    */
  @js.native
  trait StopDeploymentOutput extends js.Object {
    var status: js.UndefOr[StopStatus]
    var statusMessage: js.UndefOr[Message]
  }

  object StopDeploymentOutput {
    def apply(status: js.UndefOr[StopStatus] = js.undefined,
              statusMessage: js.UndefOr[Message] = js.undefined): StopDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("status" -> status.map { x =>
        x.asInstanceOf[js.Any]
      }, "statusMessage" -> statusMessage.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDeploymentOutput]
    }
  }

  object StopStatusEnum {
    val Pending   = "Pending"
    val Succeeded = "Succeeded"

    val values = IndexedSeq(Pending, Succeeded)
  }

  /**
    * Information about a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[Key]
    var Value: js.UndefOr[Value]
  }

  object Tag {
    def apply(Key: js.UndefOr[Key] = js.undefined, Value: js.UndefOr[Value] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
    * Information about an on-premises instance tag filter.
    */
  @js.native
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[Key]
    var Type: js.UndefOr[TagFilterType]
    var Value: js.UndefOr[Value]
  }

  object TagFilter {
    def apply(Key: js.UndefOr[Key] = js.undefined,
              Type: js.UndefOr[TagFilterType] = js.undefined,
              Value: js.UndefOr[Value] = js.undefined): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Type" -> Type.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  object TagFilterTypeEnum {
    val KEY_ONLY      = "KEY_ONLY"
    val VALUE_ONLY    = "VALUE_ONLY"
    val KEY_AND_VALUE = "KEY_AND_VALUE"

    val values = IndexedSeq(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
  }

  object TargetFilterNameEnum {
    val TargetStatus        = "TargetStatus"
    val ServerInstanceLabel = "ServerInstanceLabel"

    val values = IndexedSeq(TargetStatus, ServerInstanceLabel)
  }

  /**
    * Information about a target group in Elastic Load Balancing to use in a deployment. Instances are registered as targets in a target group, and traffic is routed to the target group.
    */
  @js.native
  trait TargetGroupInfo extends js.Object {
    var name: js.UndefOr[TargetGroupName]
  }

  object TargetGroupInfo {
    def apply(name: js.UndefOr[TargetGroupName] = js.undefined): TargetGroupInfo = {
      val _fields = IndexedSeq[(String, js.Any)]("name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroupInfo]
    }
  }

  /**
    * Information about two target groups and how traffic routes during an Amazon ECS deployment. An optional test traffic route can be specified.
    */
  @js.native
  trait TargetGroupPairInfo extends js.Object {
    var prodTrafficRoute: js.UndefOr[TrafficRoute]
    var targetGroups: js.UndefOr[TargetGroupInfoList]
    var testTrafficRoute: js.UndefOr[TrafficRoute]
  }

  object TargetGroupPairInfo {
    def apply(prodTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined,
              targetGroups: js.UndefOr[TargetGroupInfoList] = js.undefined,
              testTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined): TargetGroupPairInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "prodTrafficRoute" -> prodTrafficRoute.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetGroups" -> targetGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "testTrafficRoute" -> testTrafficRoute.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroupPairInfo]
    }
  }

  /**
    * Information about the instances to be used in the replacement environment in a blue/green deployment.
    */
  @js.native
  trait TargetInstances extends js.Object {
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList]
    var ec2TagSet: js.UndefOr[EC2TagSet]
    var tagFilters: js.UndefOr[EC2TagFilterList]
  }

  object TargetInstances {
    def apply(autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
              ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined,
              tagFilters: js.UndefOr[EC2TagFilterList] = js.undefined): TargetInstances = {
      val _fields = IndexedSeq[(String, js.Any)](
        "autoScalingGroups" -> autoScalingGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ec2TagSet" -> ec2TagSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tagFilters" -> tagFilters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetInstances]
    }
  }

  object TargetLabelEnum {
    val Blue  = "Blue"
    val Green = "Green"

    val values = IndexedSeq(Blue, Green)
  }

  object TargetStatusEnum {
    val Pending    = "Pending"
    val InProgress = "InProgress"
    val Succeeded  = "Succeeded"
    val Failed     = "Failed"
    val Skipped    = "Skipped"
    val Unknown    = "Unknown"
    val Ready      = "Ready"

    val values = IndexedSeq(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
  }

  /**
    * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The original and target Lambda function versions are specified in the deployment's AppSpec file.
    */
  @js.native
  trait TimeBasedCanary extends js.Object {
    var canaryInterval: js.UndefOr[WaitTimeInMins]
    var canaryPercentage: js.UndefOr[Percentage]
  }

  object TimeBasedCanary {
    def apply(canaryInterval: js.UndefOr[WaitTimeInMins] = js.undefined,
              canaryPercentage: js.UndefOr[Percentage] = js.undefined): TimeBasedCanary = {
      val _fields = IndexedSeq[(String, js.Any)]("canaryInterval" -> canaryInterval.map { x =>
        x.asInstanceOf[js.Any]
      }, "canaryPercentage" -> canaryPercentage.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeBasedCanary]
    }
  }

  /**
    * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions are specified in the deployment's AppSpec file.
    */
  @js.native
  trait TimeBasedLinear extends js.Object {
    var linearInterval: js.UndefOr[WaitTimeInMins]
    var linearPercentage: js.UndefOr[Percentage]
  }

  object TimeBasedLinear {
    def apply(linearInterval: js.UndefOr[WaitTimeInMins] = js.undefined,
              linearPercentage: js.UndefOr[Percentage] = js.undefined): TimeBasedLinear = {
      val _fields = IndexedSeq[(String, js.Any)]("linearInterval" -> linearInterval.map { x =>
        x.asInstanceOf[js.Any]
      }, "linearPercentage" -> linearPercentage.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeBasedLinear]
    }
  }

  /**
    * Information about a time range.
    */
  @js.native
  trait TimeRange extends js.Object {
    var end: js.UndefOr[Timestamp]
    var start: js.UndefOr[Timestamp]
  }

  object TimeRange {
    def apply(end: js.UndefOr[Timestamp] = js.undefined, start: js.UndefOr[Timestamp] = js.undefined): TimeRange = {
      val _fields = IndexedSeq[(String, js.Any)]("end" -> end.map { x =>
        x.asInstanceOf[js.Any]
      }, "start" -> start.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeRange]
    }
  }

  /**
    * Information about a listener. The listener contains the path used to route traffic that is received from the load balancer to a target group.
    */
  @js.native
  trait TrafficRoute extends js.Object {
    var listenerArns: js.UndefOr[ListenerArnList]
  }

  object TrafficRoute {
    def apply(listenerArns: js.UndefOr[ListenerArnList] = js.undefined): TrafficRoute = {
      val _fields = IndexedSeq[(String, js.Any)]("listenerArns" -> listenerArns.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficRoute]
    }
  }

  /**
    * The configuration that specifies how traffic is shifted from one version of a Lambda function to another version during an AWS Lambda deployment.
    */
  @js.native
  trait TrafficRoutingConfig extends js.Object {
    var timeBasedCanary: js.UndefOr[TimeBasedCanary]
    var timeBasedLinear: js.UndefOr[TimeBasedLinear]
    var `type`: js.UndefOr[TrafficRoutingType]
  }

  object TrafficRoutingConfig {
    def apply(timeBasedCanary: js.UndefOr[TimeBasedCanary] = js.undefined,
              timeBasedLinear: js.UndefOr[TimeBasedLinear] = js.undefined,
              `type`: js.UndefOr[TrafficRoutingType] = js.undefined): TrafficRoutingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timeBasedCanary" -> timeBasedCanary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeBasedLinear" -> timeBasedLinear.map { x =>
          x.asInstanceOf[js.Any]
        },
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficRoutingConfig]
    }
  }

  object TrafficRoutingTypeEnum {
    val TimeBasedCanary = "TimeBasedCanary"
    val TimeBasedLinear = "TimeBasedLinear"
    val AllAtOnce       = "AllAtOnce"

    val values = IndexedSeq(TimeBasedCanary, TimeBasedLinear, AllAtOnce)
  }

  /**
    * Information about notification triggers for the deployment group.
    */
  @js.native
  trait TriggerConfig extends js.Object {
    var triggerEvents: js.UndefOr[TriggerEventTypeList]
    var triggerName: js.UndefOr[TriggerName]
    var triggerTargetArn: js.UndefOr[TriggerTargetArn]
  }

  object TriggerConfig {
    def apply(triggerEvents: js.UndefOr[TriggerEventTypeList] = js.undefined,
              triggerName: js.UndefOr[TriggerName] = js.undefined,
              triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.undefined): TriggerConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "triggerEvents" -> triggerEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "triggerName" -> triggerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "triggerTargetArn" -> triggerTargetArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TriggerConfig]
    }
  }

  object TriggerEventTypeEnum {
    val DeploymentStart    = "DeploymentStart"
    val DeploymentSuccess  = "DeploymentSuccess"
    val DeploymentFailure  = "DeploymentFailure"
    val DeploymentStop     = "DeploymentStop"
    val DeploymentRollback = "DeploymentRollback"
    val DeploymentReady    = "DeploymentReady"
    val InstanceStart      = "InstanceStart"
    val InstanceSuccess    = "InstanceSuccess"
    val InstanceFailure    = "InstanceFailure"
    val InstanceReady      = "InstanceReady"

    val values = IndexedSeq(
      DeploymentStart,
      DeploymentSuccess,
      DeploymentFailure,
      DeploymentStop,
      DeploymentRollback,
      DeploymentReady,
      InstanceStart,
      InstanceSuccess,
      InstanceFailure,
      InstanceReady
    )
  }

  /**
    * Represents the input of an UpdateApplication operation.
    */
  @js.native
  trait UpdateApplicationInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var newApplicationName: js.UndefOr[ApplicationName]
  }

  object UpdateApplicationInput {
    def apply(applicationName: js.UndefOr[ApplicationName] = js.undefined,
              newApplicationName: js.UndefOr[ApplicationName] = js.undefined): UpdateApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)]("applicationName" -> applicationName.map { x =>
        x.asInstanceOf[js.Any]
      }, "newApplicationName" -> newApplicationName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationInput]
    }
  }

  /**
    * Represents the input of an UpdateDeploymentGroup operation.
    */
  @js.native
  trait UpdateDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var currentDeploymentGroupName: DeploymentGroupName
    var alarmConfiguration: js.UndefOr[AlarmConfiguration]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList]
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var deploymentStyle: js.UndefOr[DeploymentStyle]
    var ec2TagFilters: js.UndefOr[EC2TagFilterList]
    var ec2TagSet: js.UndefOr[EC2TagSet]
    var ecsServices: js.UndefOr[ECSServiceList]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var newDeploymentGroupName: js.UndefOr[DeploymentGroupName]
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList]
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet]
    var serviceRoleArn: js.UndefOr[Role]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
  }

  object UpdateDeploymentGroupInput {
    def apply(applicationName: ApplicationName,
              currentDeploymentGroupName: DeploymentGroupName,
              alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined,
              autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
              autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
              blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined,
              deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
              deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined,
              ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined,
              ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined,
              ecsServices: js.UndefOr[ECSServiceList] = js.undefined,
              loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
              newDeploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
              onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
              onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined,
              serviceRoleArn: js.UndefOr[Role] = js.undefined,
              triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined): UpdateDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName"            -> applicationName.asInstanceOf[js.Any],
        "currentDeploymentGroupName" -> currentDeploymentGroupName.asInstanceOf[js.Any],
        "alarmConfiguration" -> alarmConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoScalingGroups" -> autoScalingGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "blueGreenDeploymentConfiguration" -> blueGreenDeploymentConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentConfigName" -> deploymentConfigName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deploymentStyle" -> deploymentStyle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ec2TagFilters" -> ec2TagFilters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ec2TagSet" -> ec2TagSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ecsServices" -> ecsServices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "loadBalancerInfo" -> loadBalancerInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "newDeploymentGroupName" -> newDeploymentGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "onPremisesTagSet" -> onPremisesTagSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serviceRoleArn" -> serviceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "triggerConfigurations" -> triggerConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeploymentGroupInput]
    }
  }

  /**
    * Represents the output of an UpdateDeploymentGroup operation.
    */
  @js.native
  trait UpdateDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList]
  }

  object UpdateDeploymentGroupOutput {
    def apply(hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined): UpdateDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("hooksNotCleanedUp" -> hooksNotCleanedUp.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeploymentGroupOutput]
    }
  }
}
