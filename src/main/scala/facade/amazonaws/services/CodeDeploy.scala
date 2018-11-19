package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object codedeploy {
  type AdditionalDeploymentStatusInfo = String
  type AlarmList = js.Array[Alarm]
  type AlarmName = String
  type ApplicationId = String
  type ApplicationName = String
  type ApplicationRevisionSortBy = String
  type ApplicationsInfoList = js.Array[ApplicationInfo]
  type ApplicationsList = js.Array[ApplicationName]
  type AutoRollbackEvent = String
  type AutoRollbackEventsList = js.Array[AutoRollbackEvent]
  type AutoScalingGroupHook = String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AutoScalingGroupName = String
  type AutoScalingGroupNameList = js.Array[AutoScalingGroupName]
  type BundleType = String
  type CommitId = String
  type ComputePlatform = String
  type DeploymentConfigId = String
  type DeploymentConfigName = String
  type DeploymentConfigsList = js.Array[DeploymentConfigName]
  type DeploymentCreator = String
  type DeploymentGroupId = String
  type DeploymentGroupInfoList = js.Array[DeploymentGroupInfo]
  type DeploymentGroupName = String
  type DeploymentGroupsList = js.Array[DeploymentGroupName]
  type DeploymentId = String
  type DeploymentOption = String
  type DeploymentReadyAction = String
  type DeploymentStatus = String
  type DeploymentStatusList = js.Array[DeploymentStatus]
  type DeploymentStatusMessageList = js.Array[ErrorMessage]
  type DeploymentType = String
  type DeploymentsInfoList = js.Array[DeploymentInfo]
  type DeploymentsList = js.Array[DeploymentId]
  type Description = String
  type Duration = Int
  type EC2TagFilterList = js.Array[EC2TagFilter]
  type EC2TagFilterType = String
  type EC2TagSetList = js.Array[EC2TagFilterList]
  type ELBInfoList = js.Array[ELBInfo]
  type ELBName = String
  type ETag = String
  type ErrorCode = String
  type ErrorMessage = String
  type FileExistsBehavior = String
  type GitHubAccountTokenName = String
  type GitHubAccountTokenNameList = js.Array[GitHubAccountTokenName]
  type GreenFleetProvisioningAction = String
  type IamSessionArn = String
  type IamUserArn = String
  type InstanceAction = String
  type InstanceArn = String
  type InstanceCount = Double
  type InstanceId = String
  type InstanceInfoList = js.Array[InstanceInfo]
  type InstanceName = String
  type InstanceNameList = js.Array[InstanceName]
  type InstanceStatus = String
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type InstanceType = String
  type InstanceTypeList = js.Array[InstanceType]
  type InstancesList = js.Array[InstanceId]
  type Key = String
  type LifecycleErrorCode = String
  type LifecycleEventHookExecutionId = String
  type LifecycleEventList = js.Array[LifecycleEvent]
  type LifecycleEventName = String
  type LifecycleEventStatus = String
  type LifecycleMessage = String
  type ListStateFilterAction = String
  type LogTail = String
  type Message = String
  type MinimumHealthyHostsType = String
  type MinimumHealthyHostsValue = Int
  type NextToken = String
  type NullableBoolean = Boolean
  type OnPremisesTagSetList = js.Array[TagFilterList]
  type Percentage = Int
  type RawStringContent = String
  type RawStringSha256 = String
  type RegistrationStatus = String
  type Repository = String
  type RevisionInfoList = js.Array[RevisionInfo]
  type RevisionLocationList = js.Array[RevisionLocation]
  type RevisionLocationType = String
  type Role = String
  type S3Bucket = String
  type S3Key = String
  type ScriptName = String
  type SortOrder = String
  type StopStatus = String
  type TagFilterList = js.Array[TagFilter]
  type TagFilterType = String
  type TagList = js.Array[Tag]
  type TargetGroupInfoList = js.Array[TargetGroupInfo]
  type TargetGroupName = String
  type Timestamp = js.Date
  type TrafficRoutingType = String
  type TriggerConfigList = js.Array[TriggerConfig]
  type TriggerEventType = String
  type TriggerEventTypeList = js.Array[TriggerEventType]
  type TriggerName = String
  type TriggerTargetArn = String
  type Value = String
  type VersionId = String
  type WaitTimeInMins = Int
}

package codedeploy {
  @js.native
  @JSImport("aws-sdk", "CodeDeploy")
  class CodeDeploy(config: AWSConfig) extends js.Object {
    def addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput): Request[js.Object] = js.native
    def batchGetApplicationRevisions(params: BatchGetApplicationRevisionsInput): Request[BatchGetApplicationRevisionsOutput] = js.native
    def batchGetApplications(params: BatchGetApplicationsInput): Request[BatchGetApplicationsOutput] = js.native
    def batchGetDeploymentGroups(params: BatchGetDeploymentGroupsInput): Request[BatchGetDeploymentGroupsOutput] = js.native
    def batchGetDeploymentInstances(params: BatchGetDeploymentInstancesInput): Request[BatchGetDeploymentInstancesOutput] = js.native
    def batchGetDeployments(params: BatchGetDeploymentsInput): Request[BatchGetDeploymentsOutput] = js.native
    def batchGetOnPremisesInstances(params: BatchGetOnPremisesInstancesInput): Request[BatchGetOnPremisesInstancesOutput] = js.native
    def continueDeployment(params: ContinueDeploymentInput): Request[js.Object] = js.native
    def createApplication(params: CreateApplicationInput): Request[CreateApplicationOutput] = js.native
    def createDeployment(params: CreateDeploymentInput): Request[CreateDeploymentOutput] = js.native
    def createDeploymentConfig(params: CreateDeploymentConfigInput): Request[CreateDeploymentConfigOutput] = js.native
    def createDeploymentGroup(params: CreateDeploymentGroupInput): Request[CreateDeploymentGroupOutput] = js.native
    def deleteApplication(params: DeleteApplicationInput): Request[js.Object] = js.native
    def deleteDeploymentConfig(params: DeleteDeploymentConfigInput): Request[js.Object] = js.native
    def deleteDeploymentGroup(params: DeleteDeploymentGroupInput): Request[DeleteDeploymentGroupOutput] = js.native
    def deleteGitHubAccountToken(params: DeleteGitHubAccountTokenInput): Request[DeleteGitHubAccountTokenOutput] = js.native
    def deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput): Request[js.Object] = js.native
    def getApplication(params: GetApplicationInput): Request[GetApplicationOutput] = js.native
    def getApplicationRevision(params: GetApplicationRevisionInput): Request[GetApplicationRevisionOutput] = js.native
    def getDeployment(params: GetDeploymentInput): Request[GetDeploymentOutput] = js.native
    def getDeploymentConfig(params: GetDeploymentConfigInput): Request[GetDeploymentConfigOutput] = js.native
    def getDeploymentGroup(params: GetDeploymentGroupInput): Request[GetDeploymentGroupOutput] = js.native
    def getDeploymentInstance(params: GetDeploymentInstanceInput): Request[GetDeploymentInstanceOutput] = js.native
    def getOnPremisesInstance(params: GetOnPremisesInstanceInput): Request[GetOnPremisesInstanceOutput] = js.native
    def listApplicationRevisions(params: ListApplicationRevisionsInput): Request[ListApplicationRevisionsOutput] = js.native
    def listApplications(params: ListApplicationsInput): Request[ListApplicationsOutput] = js.native
    def listDeploymentConfigs(params: ListDeploymentConfigsInput): Request[ListDeploymentConfigsOutput] = js.native
    def listDeploymentGroups(params: ListDeploymentGroupsInput): Request[ListDeploymentGroupsOutput] = js.native
    def listDeploymentInstances(params: ListDeploymentInstancesInput): Request[ListDeploymentInstancesOutput] = js.native
    def listDeployments(params: ListDeploymentsInput): Request[ListDeploymentsOutput] = js.native
    def listGitHubAccountTokenNames(params: ListGitHubAccountTokenNamesInput): Request[ListGitHubAccountTokenNamesOutput] = js.native
    def listOnPremisesInstances(params: ListOnPremisesInstancesInput): Request[ListOnPremisesInstancesOutput] = js.native
    def putLifecycleEventHookExecutionStatus(params: PutLifecycleEventHookExecutionStatusInput): Request[PutLifecycleEventHookExecutionStatusOutput] = js.native
    def registerApplicationRevision(params: RegisterApplicationRevisionInput): Request[js.Object] = js.native
    def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput): Request[js.Object] = js.native
    def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput): Request[js.Object] = js.native
    def skipWaitTimeForInstanceTermination(params: SkipWaitTimeForInstanceTerminationInput): Request[js.Object] = js.native
    def stopDeployment(params: StopDeploymentInput): Request[StopDeploymentOutput] = js.native
    def updateApplication(params: UpdateApplicationInput): Request[js.Object] = js.native
    def updateDeploymentGroup(params: UpdateDeploymentGroupInput): Request[UpdateDeploymentGroupOutput] = js.native
  }

  /**
   * <p>Represents the input of, and adds tags to, an on-premises instance operation.</p>
   */
  @js.native
  trait AddTagsToOnPremisesInstancesInput extends js.Object {
    var tags: js.UndefOr[TagList]
    var instanceNames: js.UndefOr[InstanceNameList]
  }

  object AddTagsToOnPremisesInstancesInput {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      instanceNames: js.UndefOr[InstanceNameList] = js.undefined): AddTagsToOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "instanceNames" -> instanceNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToOnPremisesInstancesInput]
    }
  }

  /**
   * <p>Information about an alarm.</p>
   */
  @js.native
  trait Alarm extends js.Object {
    var name: js.UndefOr[AlarmName]
  }

  object Alarm {
    def apply(
      name: js.UndefOr[AlarmName] = js.undefined): Alarm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alarm]
    }
  }

  /**
   * <p>Information about alarms associated with the deployment group.</p>
   */
  @js.native
  trait AlarmConfiguration extends js.Object {
    var enabled: js.UndefOr[Boolean]
    var ignorePollAlarmFailure: js.UndefOr[Boolean]
    var alarms: js.UndefOr[AlarmList]
  }

  object AlarmConfiguration {
    def apply(
      enabled: js.UndefOr[Boolean] = js.undefined,
      ignorePollAlarmFailure: js.UndefOr[Boolean] = js.undefined,
      alarms: js.UndefOr[AlarmList] = js.undefined): AlarmConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "enabled" -> enabled.map { x => x.asInstanceOf[js.Any] },
        "ignorePollAlarmFailure" -> ignorePollAlarmFailure.map { x => x.asInstanceOf[js.Any] },
        "alarms" -> alarms.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlarmConfiguration]
    }
  }

  /**
   * <p>The maximum number of alarms for a deployment group (10) was exceeded.</p>
   */
  @js.native
  trait AlarmsLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>An application with the specified name already exists with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait ApplicationAlreadyExistsExceptionException extends js.Object {

  }

  /**
   * <p>The application does not exist with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait ApplicationDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>Information about an application.</p>
   */
  @js.native
  trait ApplicationInfo extends js.Object {
    var gitHubAccountName: js.UndefOr[GitHubAccountTokenName]
    var computePlatform: js.UndefOr[ComputePlatform]
    var createTime: js.UndefOr[Timestamp]
    var applicationId: js.UndefOr[ApplicationId]
    var applicationName: js.UndefOr[ApplicationName]
    var linkedToGitHub: js.UndefOr[Boolean]
  }

  object ApplicationInfo {
    def apply(
      gitHubAccountName: js.UndefOr[GitHubAccountTokenName] = js.undefined,
      computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
      createTime: js.UndefOr[Timestamp] = js.undefined,
      applicationId: js.UndefOr[ApplicationId] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      linkedToGitHub: js.UndefOr[Boolean] = js.undefined): ApplicationInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "gitHubAccountName" -> gitHubAccountName.map { x => x.asInstanceOf[js.Any] },
        "computePlatform" -> computePlatform.map { x => x.asInstanceOf[js.Any] },
        "createTime" -> createTime.map { x => x.asInstanceOf[js.Any] },
        "applicationId" -> applicationId.map { x => x.asInstanceOf[js.Any] },
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "linkedToGitHub" -> linkedToGitHub.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationInfo]
    }
  }

  /**
   * <p>More applications were attempted to be created than are allowed.</p>
   */
  @js.native
  trait ApplicationLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>The minimum number of required application names was not specified.</p>
   */
  @js.native
  trait ApplicationNameRequiredExceptionException extends js.Object {

  }

  object ApplicationRevisionSortByEnum {
    val registerTime = "registerTime"
    val firstUsedTime = "firstUsedTime"
    val lastUsedTime = "lastUsedTime"

    val values = IndexedSeq(registerTime, firstUsedTime, lastUsedTime)
  }

  /**
   * <p>Information about a configuration for automatically rolling back to a previous version of an application revision when a deployment doesn't complete successfully.</p>
   */
  @js.native
  trait AutoRollbackConfiguration extends js.Object {
    var enabled: js.UndefOr[Boolean]
    var events: js.UndefOr[AutoRollbackEventsList]
  }

  object AutoRollbackConfiguration {
    def apply(
      enabled: js.UndefOr[Boolean] = js.undefined,
      events: js.UndefOr[AutoRollbackEventsList] = js.undefined): AutoRollbackConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "enabled" -> enabled.map { x => x.asInstanceOf[js.Any] },
        "events" -> events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoRollbackConfiguration]
    }
  }

  object AutoRollbackEventEnum {
    val DEPLOYMENT_FAILURE = "DEPLOYMENT_FAILURE"
    val DEPLOYMENT_STOP_ON_ALARM = "DEPLOYMENT_STOP_ON_ALARM"
    val DEPLOYMENT_STOP_ON_REQUEST = "DEPLOYMENT_STOP_ON_REQUEST"

    val values = IndexedSeq(DEPLOYMENT_FAILURE, DEPLOYMENT_STOP_ON_ALARM, DEPLOYMENT_STOP_ON_REQUEST)
  }

  /**
   * <p>Information about an Auto Scaling group.</p>
   */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var name: js.UndefOr[AutoScalingGroupName]
    var hook: js.UndefOr[AutoScalingGroupHook]
  }

  object AutoScalingGroup {
    def apply(
      name: js.UndefOr[AutoScalingGroupName] = js.undefined,
      hook: js.UndefOr[AutoScalingGroupHook] = js.undefined): AutoScalingGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "hook" -> hook.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroup]
    }
  }

  /**
   * <p>Represents the input of a BatchGetApplicationRevisions operation.</p>
   */
  @js.native
  trait BatchGetApplicationRevisionsInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var revisions: js.UndefOr[RevisionLocationList]
  }

  object BatchGetApplicationRevisionsInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      revisions: js.UndefOr[RevisionLocationList] = js.undefined): BatchGetApplicationRevisionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "revisions" -> revisions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationRevisionsInput]
    }
  }

  /**
   * <p>Represents the output of a BatchGetApplicationRevisions operation.</p>
   */
  @js.native
  trait BatchGetApplicationRevisionsOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var errorMessage: js.UndefOr[ErrorMessage]
    var revisions: js.UndefOr[RevisionInfoList]
  }

  object BatchGetApplicationRevisionsOutput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
      revisions: js.UndefOr[RevisionInfoList] = js.undefined): BatchGetApplicationRevisionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "errorMessage" -> errorMessage.map { x => x.asInstanceOf[js.Any] },
        "revisions" -> revisions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationRevisionsOutput]
    }
  }

  /**
   * <p>Represents the input of a BatchGetApplications operation.</p>
   */
  @js.native
  trait BatchGetApplicationsInput extends js.Object {
    var applicationNames: js.UndefOr[ApplicationsList]
  }

  object BatchGetApplicationsInput {
    def apply(
      applicationNames: js.UndefOr[ApplicationsList] = js.undefined): BatchGetApplicationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationNames" -> applicationNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationsInput]
    }
  }

  /**
   * <p>Represents the output of a BatchGetApplications operation.</p>
   */
  @js.native
  trait BatchGetApplicationsOutput extends js.Object {
    var applicationsInfo: js.UndefOr[ApplicationsInfoList]
  }

  object BatchGetApplicationsOutput {
    def apply(
      applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.undefined): BatchGetApplicationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationsInfo" -> applicationsInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationsOutput]
    }
  }

  /**
   * <p>Represents the input of a BatchGetDeploymentGroups operation.</p>
   */
  @js.native
  trait BatchGetDeploymentGroupsInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var deploymentGroupNames: js.UndefOr[DeploymentGroupsList]
  }

  object BatchGetDeploymentGroupsInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroupNames: js.UndefOr[DeploymentGroupsList] = js.undefined): BatchGetDeploymentGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupNames" -> deploymentGroupNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentGroupsInput]
    }
  }

  /**
   * <p>Represents the output of a BatchGetDeploymentGroups operation.</p>
   */
  @js.native
  trait BatchGetDeploymentGroupsOutput extends js.Object {
    var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchGetDeploymentGroupsOutput {
    def apply(
      deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList] = js.undefined,
      errorMessage: js.UndefOr[ErrorMessage] = js.undefined): BatchGetDeploymentGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentGroupsInfo" -> deploymentGroupsInfo.map { x => x.asInstanceOf[js.Any] },
        "errorMessage" -> errorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentGroupsOutput]
    }
  }

  /**
   * <p>Represents the input of a BatchGetDeploymentInstances operation.</p>
   */
  @js.native
  trait BatchGetDeploymentInstancesInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var instanceIds: js.UndefOr[InstancesList]
  }

  object BatchGetDeploymentInstancesInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      instanceIds: js.UndefOr[InstancesList] = js.undefined): BatchGetDeploymentInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "instanceIds" -> instanceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentInstancesInput]
    }
  }

  /**
   * <p>Represents the output of a BatchGetDeploymentInstances operation.</p>
   */
  @js.native
  trait BatchGetDeploymentInstancesOutput extends js.Object {
    var instancesSummary: js.UndefOr[InstanceSummaryList]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchGetDeploymentInstancesOutput {
    def apply(
      instancesSummary: js.UndefOr[InstanceSummaryList] = js.undefined,
      errorMessage: js.UndefOr[ErrorMessage] = js.undefined): BatchGetDeploymentInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instancesSummary" -> instancesSummary.map { x => x.asInstanceOf[js.Any] },
        "errorMessage" -> errorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentInstancesOutput]
    }
  }

  /**
   * <p>Represents the input of a BatchGetDeployments operation.</p>
   */
  @js.native
  trait BatchGetDeploymentsInput extends js.Object {
    var deploymentIds: js.UndefOr[DeploymentsList]
  }

  object BatchGetDeploymentsInput {
    def apply(
      deploymentIds: js.UndefOr[DeploymentsList] = js.undefined): BatchGetDeploymentsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentIds" -> deploymentIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentsInput]
    }
  }

  /**
   * <p>Represents the output of a BatchGetDeployments operation.</p>
   */
  @js.native
  trait BatchGetDeploymentsOutput extends js.Object {
    var deploymentsInfo: js.UndefOr[DeploymentsInfoList]
  }

  object BatchGetDeploymentsOutput {
    def apply(
      deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.undefined): BatchGetDeploymentsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentsInfo" -> deploymentsInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentsOutput]
    }
  }

  /**
   * <p>Represents the input of a BatchGetOnPremisesInstances operation.</p>
   */
  @js.native
  trait BatchGetOnPremisesInstancesInput extends js.Object {
    var instanceNames: js.UndefOr[InstanceNameList]
  }

  object BatchGetOnPremisesInstancesInput {
    def apply(
      instanceNames: js.UndefOr[InstanceNameList] = js.undefined): BatchGetOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceNames" -> instanceNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetOnPremisesInstancesInput]
    }
  }

  /**
   * <p>Represents the output of a BatchGetOnPremisesInstances operation.</p>
   */
  @js.native
  trait BatchGetOnPremisesInstancesOutput extends js.Object {
    var instanceInfos: js.UndefOr[InstanceInfoList]
  }

  object BatchGetOnPremisesInstancesOutput {
    def apply(
      instanceInfos: js.UndefOr[InstanceInfoList] = js.undefined): BatchGetOnPremisesInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceInfos" -> instanceInfos.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetOnPremisesInstancesOutput]
    }
  }

  /**
   * <p>The maximum number of names or IDs allowed for this request (100) was exceeded.</p>
   */
  @js.native
  trait BatchLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>Information about blue/green deployment options for a deployment group.</p>
   */
  @js.native
  trait BlueGreenDeploymentConfiguration extends js.Object {
    var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption]
    var deploymentReadyOption: js.UndefOr[DeploymentReadyOption]
    var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption]
  }

  object BlueGreenDeploymentConfiguration {
    def apply(
      terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption] = js.undefined,
      deploymentReadyOption: js.UndefOr[DeploymentReadyOption] = js.undefined,
      greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption] = js.undefined): BlueGreenDeploymentConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "terminateBlueInstancesOnDeploymentSuccess" -> terminateBlueInstancesOnDeploymentSuccess.map { x => x.asInstanceOf[js.Any] },
        "deploymentReadyOption" -> deploymentReadyOption.map { x => x.asInstanceOf[js.Any] },
        "greenFleetProvisioningOption" -> greenFleetProvisioningOption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlueGreenDeploymentConfiguration]
    }
  }

  /**
   * <p>Information about whether instances in the original environment are terminated when a blue/green deployment is successful.</p>
   */
  @js.native
  trait BlueInstanceTerminationOption extends js.Object {
    var action: js.UndefOr[InstanceAction]
    var terminationWaitTimeInMinutes: js.UndefOr[Duration]
  }

  object BlueInstanceTerminationOption {
    def apply(
      action: js.UndefOr[InstanceAction] = js.undefined,
      terminationWaitTimeInMinutes: js.UndefOr[Duration] = js.undefined): BlueInstanceTerminationOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "action" -> action.map { x => x.asInstanceOf[js.Any] },
        "terminationWaitTimeInMinutes" -> terminationWaitTimeInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlueInstanceTerminationOption]
    }
  }

  /**
   * <p>A bucket name is required, but was not provided.</p>
   */
  @js.native
  trait BucketNameFilterRequiredExceptionException extends js.Object {

  }

  object BundleTypeEnum {
    val tar = "tar"
    val tgz = "tgz"
    val zip = "zip"
    val YAML = "YAML"
    val JSON = "JSON"

    val values = IndexedSeq(tar, tgz, zip, YAML, JSON)
  }

  object ComputePlatformEnum {
    val Server = "Server"
    val Lambda = "Lambda"

    val values = IndexedSeq(Server, Lambda)
  }

  @js.native
  trait ContinueDeploymentInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  object ContinueDeploymentInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined): ContinueDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueDeploymentInput]
    }
  }

  /**
   * <p>Represents the input of a CreateApplication operation.</p>
   */
  @js.native
  trait CreateApplicationInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var computePlatform: js.UndefOr[ComputePlatform]
  }

  object CreateApplicationInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      computePlatform: js.UndefOr[ComputePlatform] = js.undefined): CreateApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "computePlatform" -> computePlatform.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationInput]
    }
  }

  /**
   * <p>Represents the output of a CreateApplication operation.</p>
   */
  @js.native
  trait CreateApplicationOutput extends js.Object {
    var applicationId: js.UndefOr[ApplicationId]
  }

  object CreateApplicationOutput {
    def apply(
      applicationId: js.UndefOr[ApplicationId] = js.undefined): CreateApplicationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationId" -> applicationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationOutput]
    }
  }

  /**
   * <p>Represents the input of a CreateDeploymentConfig operation.</p>
   */
  @js.native
  trait CreateDeploymentConfigInput extends js.Object {
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts]
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig]
    var computePlatform: js.UndefOr[ComputePlatform]
  }

  object CreateDeploymentConfigInput {
    def apply(
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined,
      trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined,
      computePlatform: js.UndefOr[ComputePlatform] = js.undefined): CreateDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] },
        "minimumHealthyHosts" -> minimumHealthyHosts.map { x => x.asInstanceOf[js.Any] },
        "trafficRoutingConfig" -> trafficRoutingConfig.map { x => x.asInstanceOf[js.Any] },
        "computePlatform" -> computePlatform.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentConfigInput]
    }
  }

  /**
   * <p>Represents the output of a CreateDeploymentConfig operation.</p>
   */
  @js.native
  trait CreateDeploymentConfigOutput extends js.Object {
    var deploymentConfigId: js.UndefOr[DeploymentConfigId]
  }

  object CreateDeploymentConfigOutput {
    def apply(
      deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined): CreateDeploymentConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentConfigId" -> deploymentConfigId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentConfigOutput]
    }
  }

  /**
   * <p>Represents the input of a CreateDeploymentGroup operation.</p>
   */
  @js.native
  trait CreateDeploymentGroupInput extends js.Object {
    var alarmConfiguration: js.UndefOr[AlarmConfiguration]
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration]
    var deploymentStyle: js.UndefOr[DeploymentStyle]
    var serviceRoleArn: js.UndefOr[Role]
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
    var applicationName: js.UndefOr[ApplicationName]
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var ec2TagFilters: js.UndefOr[EC2TagFilterList]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var ec2TagSet: js.UndefOr[EC2TagSet]
  }

  object CreateDeploymentGroupInput {
    def apply(
      alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined,
      blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined,
      deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined,
      serviceRoleArn: js.UndefOr[Role] = js.undefined,
      autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
      triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined,
      autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
      loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
      ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined): CreateDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "alarmConfiguration" -> alarmConfiguration.map { x => x.asInstanceOf[js.Any] },
        "blueGreenDeploymentConfiguration" -> blueGreenDeploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "deploymentStyle" -> deploymentStyle.map { x => x.asInstanceOf[js.Any] },
        "serviceRoleArn" -> serviceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "autoScalingGroups" -> autoScalingGroups.map { x => x.asInstanceOf[js.Any] },
        "triggerConfigurations" -> triggerConfigurations.map { x => x.asInstanceOf[js.Any] },
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "onPremisesTagSet" -> onPremisesTagSet.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] },
        "onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupName" -> deploymentGroupName.map { x => x.asInstanceOf[js.Any] },
        "ec2TagFilters" -> ec2TagFilters.map { x => x.asInstanceOf[js.Any] },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerInfo" -> loadBalancerInfo.map { x => x.asInstanceOf[js.Any] },
        "ec2TagSet" -> ec2TagSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentGroupInput]
    }
  }

  /**
   * <p>Represents the output of a CreateDeploymentGroup operation.</p>
   */
  @js.native
  trait CreateDeploymentGroupOutput extends js.Object {
    var deploymentGroupId: js.UndefOr[DeploymentGroupId]
  }

  object CreateDeploymentGroupOutput {
    def apply(
      deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined): CreateDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentGroupId" -> deploymentGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentGroupOutput]
    }
  }

  /**
   * <p>Represents the input of a CreateDeployment operation.</p>
   */
  @js.native
  trait CreateDeploymentInput extends js.Object {
    var targetInstances: js.UndefOr[TargetInstances]
    var description: js.UndefOr[Description]
    var applicationName: js.UndefOr[ApplicationName]
    var revision: js.UndefOr[RevisionLocation]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var ignoreApplicationStopFailures: js.UndefOr[Boolean]
    var updateOutdatedInstancesOnly: js.UndefOr[Boolean]
    var fileExistsBehavior: js.UndefOr[FileExistsBehavior]
  }

  object CreateDeploymentInput {
    def apply(
      targetInstances: js.UndefOr[TargetInstances] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
      ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
      updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined,
      fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined): CreateDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetInstances" -> targetInstances.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupName" -> deploymentGroupName.map { x => x.asInstanceOf[js.Any] },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ignoreApplicationStopFailures" -> ignoreApplicationStopFailures.map { x => x.asInstanceOf[js.Any] },
        "updateOutdatedInstancesOnly" -> updateOutdatedInstancesOnly.map { x => x.asInstanceOf[js.Any] },
        "fileExistsBehavior" -> fileExistsBehavior.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentInput]
    }
  }

  /**
   * <p>Represents the output of a CreateDeployment operation.</p>
   */
  @js.native
  trait CreateDeploymentOutput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  object CreateDeploymentOutput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined): CreateDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentOutput]
    }
  }

  /**
   * <p>Represents the input of a DeleteApplication operation.</p>
   */
  @js.native
  trait DeleteApplicationInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
  }

  object DeleteApplicationInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined): DeleteApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationInput]
    }
  }

  /**
   * <p>Represents the input of a DeleteDeploymentConfig operation.</p>
   */
  @js.native
  trait DeleteDeploymentConfigInput extends js.Object {
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
  }

  object DeleteDeploymentConfigInput {
    def apply(
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined): DeleteDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentConfigInput]
    }
  }

  /**
   * <p>Represents the input of a DeleteDeploymentGroup operation.</p>
   */
  @js.native
  trait DeleteDeploymentGroupInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
  }

  object DeleteDeploymentGroupInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined): DeleteDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupName" -> deploymentGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentGroupInput]
    }
  }

  /**
   * <p>Represents the output of a DeleteDeploymentGroup operation.</p>
   */
  @js.native
  trait DeleteDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList]
  }

  object DeleteDeploymentGroupOutput {
    def apply(
      hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined): DeleteDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hooksNotCleanedUp" -> hooksNotCleanedUp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentGroupOutput]
    }
  }

  /**
   * <p>Represents the input of a DeleteGitHubAccount operation.</p>
   */
  @js.native
  trait DeleteGitHubAccountTokenInput extends js.Object {
    var tokenName: js.UndefOr[GitHubAccountTokenName]
  }

  object DeleteGitHubAccountTokenInput {
    def apply(
      tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined): DeleteGitHubAccountTokenInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tokenName" -> tokenName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGitHubAccountTokenInput]
    }
  }

  /**
   * <p>Represents the output of a DeleteGitHubAccountToken operation.</p>
   */
  @js.native
  trait DeleteGitHubAccountTokenOutput extends js.Object {
    var tokenName: js.UndefOr[GitHubAccountTokenName]
  }

  object DeleteGitHubAccountTokenOutput {
    def apply(
      tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined): DeleteGitHubAccountTokenOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tokenName" -> tokenName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGitHubAccountTokenOutput]
    }
  }

  /**
   * <p>The deployment is already complete.</p>
   */
  @js.native
  trait DeploymentAlreadyCompletedExceptionException extends js.Object {

  }

  /**
   * <p>A deployment configuration with the specified name already exists with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait DeploymentConfigAlreadyExistsExceptionException extends js.Object {

  }

  /**
   * <p>The deployment configuration does not exist with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait DeploymentConfigDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>The deployment configuration is still in use.</p>
   */
  @js.native
  trait DeploymentConfigInUseExceptionException extends js.Object {

  }

  /**
   * <p>Information about a deployment configuration.</p>
   */
  @js.native
  trait DeploymentConfigInfo extends js.Object {
    var computePlatform: js.UndefOr[ComputePlatform]
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts]
    var createTime: js.UndefOr[Timestamp]
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig]
    var deploymentConfigId: js.UndefOr[DeploymentConfigId]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
  }

  object DeploymentConfigInfo {
    def apply(
      computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
      minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined,
      createTime: js.UndefOr[Timestamp] = js.undefined,
      trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined,
      deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined): DeploymentConfigInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computePlatform" -> computePlatform.map { x => x.asInstanceOf[js.Any] },
        "minimumHealthyHosts" -> minimumHealthyHosts.map { x => x.asInstanceOf[js.Any] },
        "createTime" -> createTime.map { x => x.asInstanceOf[js.Any] },
        "trafficRoutingConfig" -> trafficRoutingConfig.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfigId" -> deploymentConfigId.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentConfigInfo]
    }
  }

  /**
   * <p>The deployment configurations limit was exceeded.</p>
   */
  @js.native
  trait DeploymentConfigLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>The deployment configuration name was not specified.</p>
   */
  @js.native
  trait DeploymentConfigNameRequiredExceptionException extends js.Object {

  }

  object DeploymentCreatorEnum {
    val user = "user"
    val autoscaling = "autoscaling"
    val codeDeployRollback = "codeDeployRollback"

    val values = IndexedSeq(user, autoscaling, codeDeployRollback)
  }

  /**
   * <p>The deployment does not exist with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait DeploymentDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>A deployment group with the specified name already exists with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait DeploymentGroupAlreadyExistsExceptionException extends js.Object {

  }

  /**
   * <p>The named deployment group does not exist with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait DeploymentGroupDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>Information about a deployment group.</p>
   */
  @js.native
  trait DeploymentGroupInfo extends js.Object {
    var alarmConfiguration: js.UndefOr[AlarmConfiguration]
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration]
    var computePlatform: js.UndefOr[ComputePlatform]
    var deploymentStyle: js.UndefOr[DeploymentStyle]
    var serviceRoleArn: js.UndefOr[Role]
    var autoScalingGroups: js.UndefOr[AutoScalingGroupList]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
    var applicationName: js.UndefOr[ApplicationName]
    var deploymentGroupId: js.UndefOr[DeploymentGroupId]
    var targetRevision: js.UndefOr[RevisionLocation]
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var ec2TagFilters: js.UndefOr[EC2TagFilterList]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var lastAttemptedDeployment: js.UndefOr[LastDeploymentInfo]
    var lastSuccessfulDeployment: js.UndefOr[LastDeploymentInfo]
    var ec2TagSet: js.UndefOr[EC2TagSet]
  }

  object DeploymentGroupInfo {
    def apply(
      alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined,
      blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined,
      computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
      deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined,
      serviceRoleArn: js.UndefOr[Role] = js.undefined,
      autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
      triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined,
      targetRevision: js.UndefOr[RevisionLocation] = js.undefined,
      onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined,
      autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
      loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
      lastAttemptedDeployment: js.UndefOr[LastDeploymentInfo] = js.undefined,
      lastSuccessfulDeployment: js.UndefOr[LastDeploymentInfo] = js.undefined,
      ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined): DeploymentGroupInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "alarmConfiguration" -> alarmConfiguration.map { x => x.asInstanceOf[js.Any] },
        "blueGreenDeploymentConfiguration" -> blueGreenDeploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "computePlatform" -> computePlatform.map { x => x.asInstanceOf[js.Any] },
        "deploymentStyle" -> deploymentStyle.map { x => x.asInstanceOf[js.Any] },
        "serviceRoleArn" -> serviceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "autoScalingGroups" -> autoScalingGroups.map { x => x.asInstanceOf[js.Any] },
        "triggerConfigurations" -> triggerConfigurations.map { x => x.asInstanceOf[js.Any] },
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupId" -> deploymentGroupId.map { x => x.asInstanceOf[js.Any] },
        "targetRevision" -> targetRevision.map { x => x.asInstanceOf[js.Any] },
        "onPremisesTagSet" -> onPremisesTagSet.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] },
        "onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupName" -> deploymentGroupName.map { x => x.asInstanceOf[js.Any] },
        "ec2TagFilters" -> ec2TagFilters.map { x => x.asInstanceOf[js.Any] },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerInfo" -> loadBalancerInfo.map { x => x.asInstanceOf[js.Any] },
        "lastAttemptedDeployment" -> lastAttemptedDeployment.map { x => x.asInstanceOf[js.Any] },
        "lastSuccessfulDeployment" -> lastSuccessfulDeployment.map { x => x.asInstanceOf[js.Any] },
        "ec2TagSet" -> ec2TagSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentGroupInfo]
    }
  }

  /**
   * <p> The deployment groups limit was exceeded.</p>
   */
  @js.native
  trait DeploymentGroupLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>The deployment group name was not specified.</p>
   */
  @js.native
  trait DeploymentGroupNameRequiredExceptionException extends js.Object {

  }

  /**
   * <p>At least one deployment ID must be specified.</p>
   */
  @js.native
  trait DeploymentIdRequiredExceptionException extends js.Object {

  }

  /**
   * <p>Information about a deployment.</p>
   */
  @js.native
  trait DeploymentInfo extends js.Object {
    var instanceTerminationWaitTimeStarted: js.UndefOr[Boolean]
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration]
    var rollbackInfo: js.UndefOr[RollbackInfo]
    var startTime: js.UndefOr[Timestamp]
    var additionalDeploymentStatusInfo: js.UndefOr[AdditionalDeploymentStatusInfo]
    var targetInstances: js.UndefOr[TargetInstances]
    var computePlatform: js.UndefOr[ComputePlatform]
    var createTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var deploymentStyle: js.UndefOr[DeploymentStyle]
    var completeTime: js.UndefOr[Timestamp]
    var deploymentId: js.UndefOr[DeploymentId]
    var applicationName: js.UndefOr[ApplicationName]
    var creator: js.UndefOr[DeploymentCreator]
    var deploymentOverview: js.UndefOr[DeploymentOverview]
    var revision: js.UndefOr[RevisionLocation]
    var deploymentStatusMessages: js.UndefOr[DeploymentStatusMessageList]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var status: js.UndefOr[DeploymentStatus]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var ignoreApplicationStopFailures: js.UndefOr[Boolean]
    var previousRevision: js.UndefOr[RevisionLocation]
    var updateOutdatedInstancesOnly: js.UndefOr[Boolean]
    var errorInformation: js.UndefOr[ErrorInformation]
    var fileExistsBehavior: js.UndefOr[FileExistsBehavior]
  }

  object DeploymentInfo {
    def apply(
      instanceTerminationWaitTimeStarted: js.UndefOr[Boolean] = js.undefined,
      blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined,
      rollbackInfo: js.UndefOr[RollbackInfo] = js.undefined,
      startTime: js.UndefOr[Timestamp] = js.undefined,
      additionalDeploymentStatusInfo: js.UndefOr[AdditionalDeploymentStatusInfo] = js.undefined,
      targetInstances: js.UndefOr[TargetInstances] = js.undefined,
      computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
      createTime: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined,
      completeTime: js.UndefOr[Timestamp] = js.undefined,
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      creator: js.UndefOr[DeploymentCreator] = js.undefined,
      deploymentOverview: js.UndefOr[DeploymentOverview] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined,
      deploymentStatusMessages: js.UndefOr[DeploymentStatusMessageList] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      status: js.UndefOr[DeploymentStatus] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
      loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
      ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
      previousRevision: js.UndefOr[RevisionLocation] = js.undefined,
      updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined,
      errorInformation: js.UndefOr[ErrorInformation] = js.undefined,
      fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined): DeploymentInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceTerminationWaitTimeStarted" -> instanceTerminationWaitTimeStarted.map { x => x.asInstanceOf[js.Any] },
        "blueGreenDeploymentConfiguration" -> blueGreenDeploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "rollbackInfo" -> rollbackInfo.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "additionalDeploymentStatusInfo" -> additionalDeploymentStatusInfo.map { x => x.asInstanceOf[js.Any] },
        "targetInstances" -> targetInstances.map { x => x.asInstanceOf[js.Any] },
        "computePlatform" -> computePlatform.map { x => x.asInstanceOf[js.Any] },
        "createTime" -> createTime.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "deploymentStyle" -> deploymentStyle.map { x => x.asInstanceOf[js.Any] },
        "completeTime" -> completeTime.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "creator" -> creator.map { x => x.asInstanceOf[js.Any] },
        "deploymentOverview" -> deploymentOverview.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] },
        "deploymentStatusMessages" -> deploymentStatusMessages.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupName" -> deploymentGroupName.map { x => x.asInstanceOf[js.Any] },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerInfo" -> loadBalancerInfo.map { x => x.asInstanceOf[js.Any] },
        "ignoreApplicationStopFailures" -> ignoreApplicationStopFailures.map { x => x.asInstanceOf[js.Any] },
        "previousRevision" -> previousRevision.map { x => x.asInstanceOf[js.Any] },
        "updateOutdatedInstancesOnly" -> updateOutdatedInstancesOnly.map { x => x.asInstanceOf[js.Any] },
        "errorInformation" -> errorInformation.map { x => x.asInstanceOf[js.Any] },
        "fileExistsBehavior" -> fileExistsBehavior.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentInfo]
    }
  }

  /**
   * <p>The deployment does not have a status of Ready and can't continue yet.</p>
   */
  @js.native
  trait DeploymentIsNotInReadyStateExceptionException extends js.Object {

  }

  /**
   * <p>The number of allowed deployments was exceeded.</p>
   */
  @js.native
  trait DeploymentLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>The specified deployment has not started.</p>
   */
  @js.native
  trait DeploymentNotStartedExceptionException extends js.Object {

  }

  object DeploymentOptionEnum {
    val WITH_TRAFFIC_CONTROL = "WITH_TRAFFIC_CONTROL"
    val WITHOUT_TRAFFIC_CONTROL = "WITHOUT_TRAFFIC_CONTROL"

    val values = IndexedSeq(WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL)
  }

  /**
   * <p>Information about the deployment status of the instances in the deployment.</p>
   */
  @js.native
  trait DeploymentOverview extends js.Object {
    var Pending: js.UndefOr[InstanceCount]
    var Ready: js.UndefOr[InstanceCount]
    var InProgress: js.UndefOr[InstanceCount]
    var Succeeded: js.UndefOr[InstanceCount]
    var Skipped: js.UndefOr[InstanceCount]
    var Failed: js.UndefOr[InstanceCount]
  }

  object DeploymentOverview {
    def apply(
      Pending: js.UndefOr[InstanceCount] = js.undefined,
      Ready: js.UndefOr[InstanceCount] = js.undefined,
      InProgress: js.UndefOr[InstanceCount] = js.undefined,
      Succeeded: js.UndefOr[InstanceCount] = js.undefined,
      Skipped: js.UndefOr[InstanceCount] = js.undefined,
      Failed: js.UndefOr[InstanceCount] = js.undefined): DeploymentOverview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pending" -> Pending.map { x => x.asInstanceOf[js.Any] },
        "Ready" -> Ready.map { x => x.asInstanceOf[js.Any] },
        "InProgress" -> InProgress.map { x => x.asInstanceOf[js.Any] },
        "Succeeded" -> Succeeded.map { x => x.asInstanceOf[js.Any] },
        "Skipped" -> Skipped.map { x => x.asInstanceOf[js.Any] },
        "Failed" -> Failed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentOverview]
    }
  }

  object DeploymentReadyActionEnum {
    val CONTINUE_DEPLOYMENT = "CONTINUE_DEPLOYMENT"
    val STOP_DEPLOYMENT = "STOP_DEPLOYMENT"

    val values = IndexedSeq(CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT)
  }

  /**
   * <p>Information about how traffic is rerouted to instances in a replacement environment in a blue/green deployment.</p>
   */
  @js.native
  trait DeploymentReadyOption extends js.Object {
    var actionOnTimeout: js.UndefOr[DeploymentReadyAction]
    var waitTimeInMinutes: js.UndefOr[Duration]
  }

  object DeploymentReadyOption {
    def apply(
      actionOnTimeout: js.UndefOr[DeploymentReadyAction] = js.undefined,
      waitTimeInMinutes: js.UndefOr[Duration] = js.undefined): DeploymentReadyOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "actionOnTimeout" -> actionOnTimeout.map { x => x.asInstanceOf[js.Any] },
        "waitTimeInMinutes" -> waitTimeInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentReadyOption]
    }
  }

  object DeploymentStatusEnum {
    val Created = "Created"
    val Queued = "Queued"
    val InProgress = "InProgress"
    val Succeeded = "Succeeded"
    val Failed = "Failed"
    val Stopped = "Stopped"
    val Ready = "Ready"

    val values = IndexedSeq(Created, Queued, InProgress, Succeeded, Failed, Stopped, Ready)
  }

  /**
   * <p>Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.</p>
   */
  @js.native
  trait DeploymentStyle extends js.Object {
    var deploymentType: js.UndefOr[DeploymentType]
    var deploymentOption: js.UndefOr[DeploymentOption]
  }

  object DeploymentStyle {
    def apply(
      deploymentType: js.UndefOr[DeploymentType] = js.undefined,
      deploymentOption: js.UndefOr[DeploymentOption] = js.undefined): DeploymentStyle = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentType" -> deploymentType.map { x => x.asInstanceOf[js.Any] },
        "deploymentOption" -> deploymentOption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentStyle]
    }
  }

  object DeploymentTypeEnum {
    val IN_PLACE = "IN_PLACE"
    val BLUE_GREEN = "BLUE_GREEN"

    val values = IndexedSeq(IN_PLACE, BLUE_GREEN)
  }

  /**
   * <p>Represents the input of a DeregisterOnPremisesInstance operation.</p>
   */
  @js.native
  trait DeregisterOnPremisesInstanceInput extends js.Object {
    var instanceName: js.UndefOr[InstanceName]
  }

  object DeregisterOnPremisesInstanceInput {
    def apply(
      instanceName: js.UndefOr[InstanceName] = js.undefined): DeregisterOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterOnPremisesInstanceInput]
    }
  }

  /**
   * <p>The description is too long.</p>
   */
  @js.native
  trait DescriptionTooLongExceptionException extends js.Object {

  }

  /**
   * <p>Diagnostic information about executable scripts that are part of a deployment.</p>
   */
  @js.native
  trait Diagnostics extends js.Object {
    var errorCode: js.UndefOr[LifecycleErrorCode]
    var scriptName: js.UndefOr[ScriptName]
    var message: js.UndefOr[LifecycleMessage]
    var logTail: js.UndefOr[LogTail]
  }

  object Diagnostics {
    def apply(
      errorCode: js.UndefOr[LifecycleErrorCode] = js.undefined,
      scriptName: js.UndefOr[ScriptName] = js.undefined,
      message: js.UndefOr[LifecycleMessage] = js.undefined,
      logTail: js.UndefOr[LogTail] = js.undefined): Diagnostics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errorCode" -> errorCode.map { x => x.asInstanceOf[js.Any] },
        "scriptName" -> scriptName.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "logTail" -> logTail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Diagnostics]
    }
  }

  /**
   * <p>Information about an EC2 tag filter.</p>
   */
  @js.native
  trait EC2TagFilter extends js.Object {
    var Key: js.UndefOr[Key]
    var Value: js.UndefOr[Value]
    var Type: js.UndefOr[EC2TagFilterType]
  }

  object EC2TagFilter {
    def apply(
      Key: js.UndefOr[Key] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined,
      Type: js.UndefOr[EC2TagFilterType] = js.undefined): EC2TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2TagFilter]
    }
  }

  object EC2TagFilterTypeEnum {
    val KEY_ONLY = "KEY_ONLY"
    val VALUE_ONLY = "VALUE_ONLY"
    val KEY_AND_VALUE = "KEY_AND_VALUE"

    val values = IndexedSeq(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
  }

  /**
   * <p>Information about groups of EC2 instance tags.</p>
   */
  @js.native
  trait EC2TagSet extends js.Object {
    var ec2TagSetList: js.UndefOr[EC2TagSetList]
  }

  object EC2TagSet {
    def apply(
      ec2TagSetList: js.UndefOr[EC2TagSetList] = js.undefined): EC2TagSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ec2TagSetList" -> ec2TagSetList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2TagSet]
    }
  }

  /**
   * <p>Information about a load balancer in Elastic Load Balancing to use in a deployment. Instances are registered directly with a load balancer, and traffic is routed to the load balancer.</p>
   */
  @js.native
  trait ELBInfo extends js.Object {
    var name: js.UndefOr[ELBName]
  }

  object ELBInfo {
    def apply(
      name: js.UndefOr[ELBName] = js.undefined): ELBInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ELBInfo]
    }
  }

  object ErrorCodeEnum {
    val DEPLOYMENT_GROUP_MISSING = "DEPLOYMENT_GROUP_MISSING"
    val APPLICATION_MISSING = "APPLICATION_MISSING"
    val REVISION_MISSING = "REVISION_MISSING"
    val IAM_ROLE_MISSING = "IAM_ROLE_MISSING"
    val IAM_ROLE_PERMISSIONS = "IAM_ROLE_PERMISSIONS"
    val NO_EC2_SUBSCRIPTION = "NO_EC2_SUBSCRIPTION"
    val OVER_MAX_INSTANCES = "OVER_MAX_INSTANCES"
    val NO_INSTANCES = "NO_INSTANCES"
    val TIMEOUT = "TIMEOUT"
    val HEALTH_CONSTRAINTS_INVALID = "HEALTH_CONSTRAINTS_INVALID"
    val HEALTH_CONSTRAINTS = "HEALTH_CONSTRAINTS"
    val INTERNAL_ERROR = "INTERNAL_ERROR"
    val THROTTLED = "THROTTLED"
    val ALARM_ACTIVE = "ALARM_ACTIVE"
    val AGENT_ISSUE = "AGENT_ISSUE"
    val AUTO_SCALING_IAM_ROLE_PERMISSIONS = "AUTO_SCALING_IAM_ROLE_PERMISSIONS"
    val AUTO_SCALING_CONFIGURATION = "AUTO_SCALING_CONFIGURATION"
    val MANUAL_STOP = "MANUAL_STOP"
    val MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION = "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION"
    val MISSING_ELB_INFORMATION = "MISSING_ELB_INFORMATION"
    val MISSING_GITHUB_TOKEN = "MISSING_GITHUB_TOKEN"
    val ELASTIC_LOAD_BALANCING_INVALID = "ELASTIC_LOAD_BALANCING_INVALID"
    val ELB_INVALID_INSTANCE = "ELB_INVALID_INSTANCE"
    val INVALID_LAMBDA_CONFIGURATION = "INVALID_LAMBDA_CONFIGURATION"
    val INVALID_LAMBDA_FUNCTION = "INVALID_LAMBDA_FUNCTION"
    val HOOK_EXECUTION_FAILURE = "HOOK_EXECUTION_FAILURE"

    val values = IndexedSeq(DEPLOYMENT_GROUP_MISSING, APPLICATION_MISSING, REVISION_MISSING, IAM_ROLE_MISSING, IAM_ROLE_PERMISSIONS, NO_EC2_SUBSCRIPTION, OVER_MAX_INSTANCES, NO_INSTANCES, TIMEOUT, HEALTH_CONSTRAINTS_INVALID, HEALTH_CONSTRAINTS, INTERNAL_ERROR, THROTTLED, ALARM_ACTIVE, AGENT_ISSUE, AUTO_SCALING_IAM_ROLE_PERMISSIONS, AUTO_SCALING_CONFIGURATION, MANUAL_STOP, MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION, MISSING_ELB_INFORMATION, MISSING_GITHUB_TOKEN, ELASTIC_LOAD_BALANCING_INVALID, ELB_INVALID_INSTANCE, INVALID_LAMBDA_CONFIGURATION, INVALID_LAMBDA_FUNCTION, HOOK_EXECUTION_FAILURE)
  }

  /**
   * <p>Information about a deployment error.</p>
   */
  @js.native
  trait ErrorInformation extends js.Object {
    var code: js.UndefOr[ErrorCode]
    var message: js.UndefOr[ErrorMessage]
  }

  object ErrorInformation {
    def apply(
      code: js.UndefOr[ErrorCode] = js.undefined,
      message: js.UndefOr[ErrorMessage] = js.undefined): ErrorInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "code" -> code.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorInformation]
    }
  }

  object FileExistsBehaviorEnum {
    val DISALLOW = "DISALLOW"
    val OVERWRITE = "OVERWRITE"
    val RETAIN = "RETAIN"

    val values = IndexedSeq(DISALLOW, OVERWRITE, RETAIN)
  }

  /**
   * <p>Information about an application revision.</p>
   */
  @js.native
  trait GenericRevisionInfo extends js.Object {
    var firstUsedTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var registerTime: js.UndefOr[Timestamp]
    var deploymentGroups: js.UndefOr[DeploymentGroupsList]
    var lastUsedTime: js.UndefOr[Timestamp]
  }

  object GenericRevisionInfo {
    def apply(
      firstUsedTime: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      registerTime: js.UndefOr[Timestamp] = js.undefined,
      deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined,
      lastUsedTime: js.UndefOr[Timestamp] = js.undefined): GenericRevisionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "firstUsedTime" -> firstUsedTime.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "registerTime" -> registerTime.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroups" -> deploymentGroups.map { x => x.asInstanceOf[js.Any] },
        "lastUsedTime" -> lastUsedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenericRevisionInfo]
    }
  }

  /**
   * <p>Represents the input of a GetApplication operation.</p>
   */
  @js.native
  trait GetApplicationInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
  }

  object GetApplicationInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined): GetApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationInput]
    }
  }

  /**
   * <p>Represents the output of a GetApplication operation.</p>
   */
  @js.native
  trait GetApplicationOutput extends js.Object {
    var application: js.UndefOr[ApplicationInfo]
  }

  object GetApplicationOutput {
    def apply(
      application: js.UndefOr[ApplicationInfo] = js.undefined): GetApplicationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "application" -> application.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationOutput]
    }
  }

  /**
   * <p>Represents the input of a GetApplicationRevision operation.</p>
   */
  @js.native
  trait GetApplicationRevisionInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var revision: js.UndefOr[RevisionLocation]
  }

  object GetApplicationRevisionInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined): GetApplicationRevisionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationRevisionInput]
    }
  }

  /**
   * <p>Represents the output of a GetApplicationRevision operation.</p>
   */
  @js.native
  trait GetApplicationRevisionOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var revision: js.UndefOr[RevisionLocation]
    var revisionInfo: js.UndefOr[GenericRevisionInfo]
  }

  object GetApplicationRevisionOutput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined,
      revisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined): GetApplicationRevisionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] },
        "revisionInfo" -> revisionInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationRevisionOutput]
    }
  }

  /**
   * <p>Represents the input of a GetDeploymentConfig operation.</p>
   */
  @js.native
  trait GetDeploymentConfigInput extends js.Object {
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
  }

  object GetDeploymentConfigInput {
    def apply(
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined): GetDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentConfigInput]
    }
  }

  /**
   * <p>Represents the output of a GetDeploymentConfig operation.</p>
   */
  @js.native
  trait GetDeploymentConfigOutput extends js.Object {
    var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo]
  }

  object GetDeploymentConfigOutput {
    def apply(
      deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.undefined): GetDeploymentConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentConfigInfo" -> deploymentConfigInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentConfigOutput]
    }
  }

  /**
   * <p>Represents the input of a GetDeploymentGroup operation.</p>
   */
  @js.native
  trait GetDeploymentGroupInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
  }

  object GetDeploymentGroupInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined): GetDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupName" -> deploymentGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentGroupInput]
    }
  }

  /**
   * <p>Represents the output of a GetDeploymentGroup operation.</p>
   */
  @js.native
  trait GetDeploymentGroupOutput extends js.Object {
    var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo]
  }

  object GetDeploymentGroupOutput {
    def apply(
      deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.undefined): GetDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentGroupInfo" -> deploymentGroupInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentGroupOutput]
    }
  }

  /**
   * <p>Represents the input of a GetDeployment operation.</p>
   */
  @js.native
  trait GetDeploymentInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  object GetDeploymentInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined): GetDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInput]
    }
  }

  /**
   * <p>Represents the input of a GetDeploymentInstance operation.</p>
   */
  @js.native
  trait GetDeploymentInstanceInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var instanceId: js.UndefOr[InstanceId]
  }

  object GetDeploymentInstanceInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      instanceId: js.UndefOr[InstanceId] = js.undefined): GetDeploymentInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "instanceId" -> instanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInstanceInput]
    }
  }

  /**
   * <p>Represents the output of a GetDeploymentInstance operation.</p>
   */
  @js.native
  trait GetDeploymentInstanceOutput extends js.Object {
    var instanceSummary: js.UndefOr[InstanceSummary]
  }

  object GetDeploymentInstanceOutput {
    def apply(
      instanceSummary: js.UndefOr[InstanceSummary] = js.undefined): GetDeploymentInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSummary" -> instanceSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInstanceOutput]
    }
  }

  /**
   * <p>Represents the output of a GetDeployment operation.</p>
   */
  @js.native
  trait GetDeploymentOutput extends js.Object {
    var deploymentInfo: js.UndefOr[DeploymentInfo]
  }

  object GetDeploymentOutput {
    def apply(
      deploymentInfo: js.UndefOr[DeploymentInfo] = js.undefined): GetDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentInfo" -> deploymentInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentOutput]
    }
  }

  /**
   * <p>Represents the input of a GetOnPremisesInstance operation.</p>
   */
  @js.native
  trait GetOnPremisesInstanceInput extends js.Object {
    var instanceName: js.UndefOr[InstanceName]
  }

  object GetOnPremisesInstanceInput {
    def apply(
      instanceName: js.UndefOr[InstanceName] = js.undefined): GetOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOnPremisesInstanceInput]
    }
  }

  /**
   * <p>Represents the output of a GetOnPremisesInstance operation.</p>
   */
  @js.native
  trait GetOnPremisesInstanceOutput extends js.Object {
    var instanceInfo: js.UndefOr[InstanceInfo]
  }

  object GetOnPremisesInstanceOutput {
    def apply(
      instanceInfo: js.UndefOr[InstanceInfo] = js.undefined): GetOnPremisesInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceInfo" -> instanceInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOnPremisesInstanceOutput]
    }
  }

  /**
   * <p>No GitHub account connection exists with the named specified in the call.</p>
   */
  @js.native
  trait GitHubAccountTokenDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>The call is missing a required GitHub account connection name.</p>
   */
  @js.native
  trait GitHubAccountTokenNameRequiredExceptionException extends js.Object {

  }

  /**
   * <p>Information about the location of application artifacts stored in GitHub.</p>
   */
  @js.native
  trait GitHubLocation extends js.Object {
    var repository: js.UndefOr[Repository]
    var commitId: js.UndefOr[CommitId]
  }

  object GitHubLocation {
    def apply(
      repository: js.UndefOr[Repository] = js.undefined,
      commitId: js.UndefOr[CommitId] = js.undefined): GitHubLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repository" -> repository.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GitHubLocation]
    }
  }

  object GreenFleetProvisioningActionEnum {
    val DISCOVER_EXISTING = "DISCOVER_EXISTING"
    val COPY_AUTO_SCALING_GROUP = "COPY_AUTO_SCALING_GROUP"

    val values = IndexedSeq(DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP)
  }

  /**
   * <p>Information about the instances that belong to the replacement environment in a blue/green deployment.</p>
   */
  @js.native
  trait GreenFleetProvisioningOption extends js.Object {
    var action: js.UndefOr[GreenFleetProvisioningAction]
  }

  object GreenFleetProvisioningOption {
    def apply(
      action: js.UndefOr[GreenFleetProvisioningAction] = js.undefined): GreenFleetProvisioningOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "action" -> action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GreenFleetProvisioningOption]
    }
  }

  /**
   * <p>No IAM ARN was included in the request. You must use an IAM session ARN or IAM user ARN in the request.</p>
   */
  @js.native
  trait IamArnRequiredExceptionException extends js.Object {

  }

  /**
   * <p>The request included an IAM session ARN that has already been used to register a different instance.</p>
   */
  @js.native
  trait IamSessionArnAlreadyRegisteredExceptionException extends js.Object {

  }

  /**
   * <p>The specified IAM user ARN is already registered with an on-premises instance.</p>
   */
  @js.native
  trait IamUserArnAlreadyRegisteredExceptionException extends js.Object {

  }

  /**
   * <p>An IAM user ARN was not specified.</p>
   */
  @js.native
  trait IamUserArnRequiredExceptionException extends js.Object {

  }

  object InstanceActionEnum {
    val TERMINATE = "TERMINATE"
    val KEEP_ALIVE = "KEEP_ALIVE"

    val values = IndexedSeq(TERMINATE, KEEP_ALIVE)
  }

  /**
   * <p>The specified instance does not exist in the deployment group.</p>
   */
  @js.native
  trait InstanceDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>The instance ID was not specified.</p>
   */
  @js.native
  trait InstanceIdRequiredExceptionException extends js.Object {

  }

  /**
   * <p>Information about an on-premises instance.</p>
   */
  @js.native
  trait InstanceInfo extends js.Object {
    var tags: js.UndefOr[TagList]
    var registerTime: js.UndefOr[Timestamp]
    var deregisterTime: js.UndefOr[Timestamp]
    var iamSessionArn: js.UndefOr[IamSessionArn]
    var instanceArn: js.UndefOr[InstanceArn]
    var iamUserArn: js.UndefOr[IamUserArn]
    var instanceName: js.UndefOr[InstanceName]
  }

  object InstanceInfo {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      registerTime: js.UndefOr[Timestamp] = js.undefined,
      deregisterTime: js.UndefOr[Timestamp] = js.undefined,
      iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined,
      instanceArn: js.UndefOr[InstanceArn] = js.undefined,
      iamUserArn: js.UndefOr[IamUserArn] = js.undefined,
      instanceName: js.UndefOr[InstanceName] = js.undefined): InstanceInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "registerTime" -> registerTime.map { x => x.asInstanceOf[js.Any] },
        "deregisterTime" -> deregisterTime.map { x => x.asInstanceOf[js.Any] },
        "iamSessionArn" -> iamSessionArn.map { x => x.asInstanceOf[js.Any] },
        "instanceArn" -> instanceArn.map { x => x.asInstanceOf[js.Any] },
        "iamUserArn" -> iamUserArn.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceInfo]
    }
  }

  /**
   * <p>The maximum number of allowed on-premises instances in a single call was exceeded.</p>
   */
  @js.native
  trait InstanceLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>The specified on-premises instance name is already registered.</p>
   */
  @js.native
  trait InstanceNameAlreadyRegisteredExceptionException extends js.Object {

  }

  /**
   * <p>An on-premises instance name was not specified.</p>
   */
  @js.native
  trait InstanceNameRequiredExceptionException extends js.Object {

  }

  /**
   * <p>The specified on-premises instance is not registered.</p>
   */
  @js.native
  trait InstanceNotRegisteredExceptionException extends js.Object {

  }

  object InstanceStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Succeeded = "Succeeded"
    val Failed = "Failed"
    val Skipped = "Skipped"
    val Unknown = "Unknown"
    val Ready = "Ready"

    val values = IndexedSeq(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
  }

  /**
   * <p>Information about an instance in a deployment.</p>
   */
  @js.native
  trait InstanceSummary extends js.Object {
    var instanceId: js.UndefOr[InstanceId]
    var deploymentId: js.UndefOr[DeploymentId]
    var instanceType: js.UndefOr[InstanceType]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[InstanceStatus]
    var lastUpdatedAt: js.UndefOr[Timestamp]
  }

  object InstanceSummary {
    def apply(
      instanceId: js.UndefOr[InstanceId] = js.undefined,
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      instanceType: js.UndefOr[InstanceType] = js.undefined,
      lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
      status: js.UndefOr[InstanceStatus] = js.undefined,
      lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined): InstanceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceId" -> instanceId.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "instanceType" -> instanceType.map { x => x.asInstanceOf[js.Any] },
        "lifecycleEvents" -> lifecycleEvents.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceSummary]
    }
  }

  object InstanceTypeEnum {
    val Blue = "Blue"
    val Green = "Green"

    val values = IndexedSeq(Blue, Green)
  }

  /**
   * <p>The format of the alarm configuration is invalid. Possible causes include:</p> <ul> <li> <p>The alarm list is null.</p> </li> <li> <p>The alarm object is null.</p> </li> <li> <p>The alarm name is empty or null or exceeds the 255 character limit.</p> </li> <li> <p>Two alarms with the same name have been specified.</p> </li> <li> <p>The alarm configuration is enabled but the alarm list is empty.</p> </li> </ul>
   */
  @js.native
  trait InvalidAlarmConfigExceptionException extends js.Object {

  }

  /**
   * <p>The application name was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidApplicationNameExceptionException extends js.Object {

  }

  /**
   * <p>The automatic rollback configuration was specified in an invalid format. For example, automatic rollback is enabled but an invalid triggering event type or no event types were listed.</p>
   */
  @js.native
  trait InvalidAutoRollbackConfigExceptionException extends js.Object {

  }

  /**
   * <p>The Auto Scaling group was specified in an invalid format or does not exist.</p>
   */
  @js.native
  trait InvalidAutoScalingGroupExceptionException extends js.Object {

  }

  /**
   * <p>The configuration for the blue/green deployment group was provided in an invalid format. For information about deployment configuration format, see <a>CreateDeploymentConfig</a>.</p>
   */
  @js.native
  trait InvalidBlueGreenDeploymentConfigurationExceptionException extends js.Object {

  }

  /**
   * <p>The bucket name either doesn't exist or was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidBucketNameFilterExceptionException extends js.Object {

  }

  /**
   * <p>The computePlatform is invalid. The computePlatform should be <code>Lambda</code> or <code>Server</code>.</p>
   */
  @js.native
  trait InvalidComputePlatformExceptionException extends js.Object {

  }

  /**
   * <p>The deployed state filter was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidDeployedStateFilterExceptionException extends js.Object {

  }

  /**
   * <p>The deployment configuration name was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidDeploymentConfigNameExceptionException extends js.Object {

  }

  /**
   * <p>The deployment group name was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidDeploymentGroupNameExceptionException extends js.Object {

  }

  /**
   * <p>At least one of the deployment IDs was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidDeploymentIdExceptionException extends js.Object {

  }

  /**
   * <p>An instance type was specified for an in-place deployment. Instance types are supported for blue/green deployments only.</p>
   */
  @js.native
  trait InvalidDeploymentInstanceTypeExceptionException extends js.Object {

  }

  /**
   * <p>The specified deployment status doesn't exist or cannot be determined.</p>
   */
  @js.native
  trait InvalidDeploymentStatusExceptionException extends js.Object {

  }

  /**
   * <p>An invalid deployment style was specified. Valid deployment types include "IN_PLACE" and "BLUE_GREEN". Valid deployment options include "WITH_TRAFFIC_CONTROL" and "WITHOUT_TRAFFIC_CONTROL".</p>
   */
  @js.native
  trait InvalidDeploymentStyleExceptionException extends js.Object {

  }

  /**
   * <p>A call was submitted that specified both Ec2TagFilters and Ec2TagSet, but only one of these data types can be used in a single call.</p>
   */
  @js.native
  trait InvalidEC2TagCombinationExceptionException extends js.Object {

  }

  /**
   * <p>The tag was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidEC2TagExceptionException extends js.Object {

  }

  /**
   * <p>An invalid fileExistsBehavior option was specified to determine how AWS CodeDeploy handles files or directories that already exist in a deployment target location but weren't part of the previous successful deployment. Valid values include "DISALLOW", "OVERWRITE", and "RETAIN".</p>
   */
  @js.native
  trait InvalidFileExistsBehaviorExceptionException extends js.Object {

  }

  /**
   * <p>The GitHub token is not valid.</p>
   */
  @js.native
  trait InvalidGitHubAccountTokenExceptionException extends js.Object {

  }

  /**
   * <p>The format of the specified GitHub account connection name is invalid.</p>
   */
  @js.native
  trait InvalidGitHubAccountTokenNameExceptionException extends js.Object {

  }

  /**
   * <p>The IAM session ARN was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidIamSessionArnExceptionException extends js.Object {

  }

  /**
   * <p>The IAM user ARN was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidIamUserArnExceptionException extends js.Object {

  }

  /**
   * <p>The IgnoreApplicationStopFailures value is invalid. For AWS Lambda deployments, <code>false</code> is expected. For EC2/On-premises deployments, <code>true</code> or <code>false</code> is expected.</p>
   */
  @js.native
  trait InvalidIgnoreApplicationStopFailuresValueExceptionException extends js.Object {

  }

  /**
   * <p>The specified input was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidInputExceptionException extends js.Object {

  }

  /**
   * <p> </p>
   */
  @js.native
  trait InvalidInstanceIdExceptionException extends js.Object {

  }

  /**
   * <p>The specified on-premises instance name was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidInstanceNameExceptionException extends js.Object {

  }

  /**
   * <p>The specified instance status does not exist.</p>
   */
  @js.native
  trait InvalidInstanceStatusExceptionException extends js.Object {

  }

  /**
   * <p>An invalid instance type was specified for instances in a blue/green deployment. Valid values include "Blue" for an original environment and "Green" for a replacement environment.</p>
   */
  @js.native
  trait InvalidInstanceTypeExceptionException extends js.Object {

  }

  /**
   * <p>The specified key prefix filter was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidKeyPrefixFilterExceptionException extends js.Object {

  }

  /**
   * <p>A lifecycle event hook is invalid. Review the <code>hooks</code> section in your AppSpec file to ensure the lifecycle events and <code>hooks</code> functions are valid.</p>
   */
  @js.native
  trait InvalidLifecycleEventHookExecutionIdExceptionException extends js.Object {

  }

  /**
   * <p>The result of a Lambda validation function that verifies a lifecycle event is invalid. It should return <code>Succeeded</code> or <code>Failed</code>.</p>
   */
  @js.native
  trait InvalidLifecycleEventHookExecutionStatusExceptionException extends js.Object {

  }

  /**
   * <p>An invalid load balancer name, or no load balancer name, was specified.</p>
   */
  @js.native
  trait InvalidLoadBalancerInfoExceptionException extends js.Object {

  }

  /**
   * <p>The minimum healthy instance value was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidMinimumHealthyHostValueExceptionException extends js.Object {

  }

  /**
   * <p>The next token was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {

  }

  /**
   * <p>A call was submitted that specified both OnPremisesTagFilters and OnPremisesTagSet, but only one of these data types can be used in a single call.</p>
   */
  @js.native
  trait InvalidOnPremisesTagCombinationExceptionException extends js.Object {

  }

  /**
   * <p>An invalid operation was detected.</p>
   */
  @js.native
  trait InvalidOperationExceptionException extends js.Object {

  }

  /**
   * <p>The registration status was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidRegistrationStatusExceptionException extends js.Object {

  }

  /**
   * <p>The revision was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidRevisionExceptionException extends js.Object {

  }

  /**
   * <p>The service role ARN was specified in an invalid format. Or, if an Auto Scaling group was specified, the specified service role does not grant the appropriate permissions to Auto Scaling.</p>
   */
  @js.native
  trait InvalidRoleExceptionException extends js.Object {

  }

  /**
   * <p>The column name to sort by is either not present or was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidSortByExceptionException extends js.Object {

  }

  /**
   * <p>The sort order was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidSortOrderExceptionException extends js.Object {

  }

  /**
   * <p>The specified tag was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidTagExceptionException extends js.Object {

  }

  /**
   * <p>The specified tag filter was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidTagFilterExceptionException extends js.Object {

  }

  /**
   * <p>The target instance configuration is invalid. Possible causes include:</p> <ul> <li> <p>Configuration data for target instances was entered for an in-place deployment.</p> </li> <li> <p>The limit of 10 tags for a tag type was exceeded.</p> </li> <li> <p>The combined length of the tag names exceeded the limit. </p> </li> <li> <p>A specified tag is not currently applied to any instances.</p> </li> </ul>
   */
  @js.native
  trait InvalidTargetInstancesExceptionException extends js.Object {

  }

  /**
   * <p>The specified time range was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidTimeRangeExceptionException extends js.Object {

  }

  /**
   * <p> The configuration that specifies how traffic is routed during a deployment is invalid.</p>
   */
  @js.native
  trait InvalidTrafficRoutingConfigurationExceptionException extends js.Object {

  }

  /**
   * <p>The trigger was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidTriggerConfigExceptionException extends js.Object {

  }

  /**
   * <p>The UpdateOutdatedInstancesOnly value is invalid. For AWS Lambda deployments, <code>false</code> is expected. For EC2/On-premises deployments, <code>true</code> or <code>false</code> is expected.</p>
   */
  @js.native
  trait InvalidUpdateOutdatedInstancesOnlyValueExceptionException extends js.Object {

  }

  /**
   * <p>Information about the most recent attempted or successful deployment to a deployment group.</p>
   */
  @js.native
  trait LastDeploymentInfo extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var status: js.UndefOr[DeploymentStatus]
    var endTime: js.UndefOr[Timestamp]
    var createTime: js.UndefOr[Timestamp]
  }

  object LastDeploymentInfo {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      status: js.UndefOr[DeploymentStatus] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      createTime: js.UndefOr[Timestamp] = js.undefined): LastDeploymentInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "createTime" -> createTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LastDeploymentInfo]
    }
  }

  object LifecycleErrorCodeEnum {
    val Success = "Success"
    val ScriptMissing = "ScriptMissing"
    val ScriptNotExecutable = "ScriptNotExecutable"
    val ScriptTimedOut = "ScriptTimedOut"
    val ScriptFailed = "ScriptFailed"
    val UnknownError = "UnknownError"

    val values = IndexedSeq(Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError)
  }

  /**
   * <p>Information about a deployment lifecycle event.</p>
   */
  @js.native
  trait LifecycleEvent extends js.Object {
    var startTime: js.UndefOr[Timestamp]
    var endTime: js.UndefOr[Timestamp]
    var diagnostics: js.UndefOr[Diagnostics]
    var status: js.UndefOr[LifecycleEventStatus]
    var lifecycleEventName: js.UndefOr[LifecycleEventName]
  }

  object LifecycleEvent {
    def apply(
      startTime: js.UndefOr[Timestamp] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      diagnostics: js.UndefOr[Diagnostics] = js.undefined,
      status: js.UndefOr[LifecycleEventStatus] = js.undefined,
      lifecycleEventName: js.UndefOr[LifecycleEventName] = js.undefined): LifecycleEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "diagnostics" -> diagnostics.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "lifecycleEventName" -> lifecycleEventName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleEvent]
    }
  }

  /**
   * <p>An attempt to return the status of an already completed lifecycle event occurred.</p>
   */
  @js.native
  trait LifecycleEventAlreadyCompletedExceptionException extends js.Object {

  }

  object LifecycleEventStatusEnum {
    val Pending = "Pending"
    val InProgress = "InProgress"
    val Succeeded = "Succeeded"
    val Failed = "Failed"
    val Skipped = "Skipped"
    val Unknown = "Unknown"

    val values = IndexedSeq(Pending, InProgress, Succeeded, Failed, Skipped, Unknown)
  }

  /**
   * <p>The limit for lifecycle hooks was exceeded.</p>
   */
  @js.native
  trait LifecycleHookLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>Represents the input of a ListApplicationRevisions operation.</p>
   */
  @js.native
  trait ListApplicationRevisionsInput extends js.Object {
    var s3Bucket: js.UndefOr[S3Bucket]
    var sortBy: js.UndefOr[ApplicationRevisionSortBy]
    var applicationName: js.UndefOr[ApplicationName]
    var nextToken: js.UndefOr[NextToken]
    var deployed: js.UndefOr[ListStateFilterAction]
    var sortOrder: js.UndefOr[SortOrder]
    var s3KeyPrefix: js.UndefOr[S3Key]
  }

  object ListApplicationRevisionsInput {
    def apply(
      s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      sortBy: js.UndefOr[ApplicationRevisionSortBy] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      deployed: js.UndefOr[ListStateFilterAction] = js.undefined,
      sortOrder: js.UndefOr[SortOrder] = js.undefined,
      s3KeyPrefix: js.UndefOr[S3Key] = js.undefined): ListApplicationRevisionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3Bucket" -> s3Bucket.map { x => x.asInstanceOf[js.Any] },
        "sortBy" -> sortBy.map { x => x.asInstanceOf[js.Any] },
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "deployed" -> deployed.map { x => x.asInstanceOf[js.Any] },
        "sortOrder" -> sortOrder.map { x => x.asInstanceOf[js.Any] },
        "s3KeyPrefix" -> s3KeyPrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationRevisionsInput]
    }
  }

  /**
   * <p>Represents the output of a ListApplicationRevisions operation.</p>
   */
  @js.native
  trait ListApplicationRevisionsOutput extends js.Object {
    var revisions: js.UndefOr[RevisionLocationList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationRevisionsOutput {
    def apply(
      revisions: js.UndefOr[RevisionLocationList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListApplicationRevisionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "revisions" -> revisions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationRevisionsOutput]
    }
  }

  /**
   * <p>Represents the input of a ListApplications operation.</p>
   */
  @js.native
  trait ListApplicationsInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsInput {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined): ListApplicationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsInput]
    }
  }

  /**
   * <p>Represents the output of a ListApplications operation.</p>
   */
  @js.native
  trait ListApplicationsOutput extends js.Object {
    var applications: js.UndefOr[ApplicationsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsOutput {
    def apply(
      applications: js.UndefOr[ApplicationsList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListApplicationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applications" -> applications.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsOutput]
    }
  }

  /**
   * <p>Represents the input of a ListDeploymentConfigs operation.</p>
   */
  @js.native
  trait ListDeploymentConfigsInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentConfigsInput {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentConfigsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentConfigsInput]
    }
  }

  /**
   * <p>Represents the output of a ListDeploymentConfigs operation.</p>
   */
  @js.native
  trait ListDeploymentConfigsOutput extends js.Object {
    var deploymentConfigsList: js.UndefOr[DeploymentConfigsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentConfigsOutput {
    def apply(
      deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentConfigsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentConfigsList" -> deploymentConfigsList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentConfigsOutput]
    }
  }

  /**
   * <p>Represents the input of a ListDeploymentGroups operation.</p>
   */
  @js.native
  trait ListDeploymentGroupsInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentGroupsInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentGroupsInput]
    }
  }

  /**
   * <p>Represents the output of a ListDeploymentGroups operation.</p>
   */
  @js.native
  trait ListDeploymentGroupsOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var deploymentGroups: js.UndefOr[DeploymentGroupsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentGroupsOutput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroups" -> deploymentGroups.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentGroupsOutput]
    }
  }

  /**
   * <p>Represents the input of a ListDeploymentInstances operation.</p>
   */
  @js.native
  trait ListDeploymentInstancesInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var nextToken: js.UndefOr[NextToken]
    var instanceStatusFilter: js.UndefOr[InstanceStatusList]
    var instanceTypeFilter: js.UndefOr[InstanceTypeList]
  }

  object ListDeploymentInstancesInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      instanceStatusFilter: js.UndefOr[InstanceStatusList] = js.undefined,
      instanceTypeFilter: js.UndefOr[InstanceTypeList] = js.undefined): ListDeploymentInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "instanceStatusFilter" -> instanceStatusFilter.map { x => x.asInstanceOf[js.Any] },
        "instanceTypeFilter" -> instanceTypeFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentInstancesInput]
    }
  }

  /**
   * <p>Represents the output of a ListDeploymentInstances operation.</p>
   */
  @js.native
  trait ListDeploymentInstancesOutput extends js.Object {
    var instancesList: js.UndefOr[InstancesList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentInstancesOutput {
    def apply(
      instancesList: js.UndefOr[InstancesList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instancesList" -> instancesList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentInstancesOutput]
    }
  }

  /**
   * <p>Represents the input of a ListDeployments operation.</p>
   */
  @js.native
  trait ListDeploymentsInput extends js.Object {
    var includeOnlyStatuses: js.UndefOr[DeploymentStatusList]
    var createTimeRange: js.UndefOr[TimeRange]
    var applicationName: js.UndefOr[ApplicationName]
    var nextToken: js.UndefOr[NextToken]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
  }

  object ListDeploymentsInput {
    def apply(
      includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.undefined,
      createTimeRange: js.UndefOr[TimeRange] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined): ListDeploymentsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeOnlyStatuses" -> includeOnlyStatuses.map { x => x.asInstanceOf[js.Any] },
        "createTimeRange" -> createTimeRange.map { x => x.asInstanceOf[js.Any] },
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "deploymentGroupName" -> deploymentGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentsInput]
    }
  }

  /**
   * <p>Represents the output of a ListDeployments operation.</p>
   */
  @js.native
  trait ListDeploymentsOutput extends js.Object {
    var deployments: js.UndefOr[DeploymentsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentsOutput {
    def apply(
      deployments: js.UndefOr[DeploymentsList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDeploymentsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deployments" -> deployments.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentsOutput]
    }
  }

  /**
   * <p>Represents the input of a ListGitHubAccountTokenNames operation.</p>
   */
  @js.native
  trait ListGitHubAccountTokenNamesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListGitHubAccountTokenNamesInput {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined): ListGitHubAccountTokenNamesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGitHubAccountTokenNamesInput]
    }
  }

  /**
   * <p>Represents the output of a ListGitHubAccountTokenNames operation.</p>
   */
  @js.native
  trait ListGitHubAccountTokenNamesOutput extends js.Object {
    var tokenNameList: js.UndefOr[GitHubAccountTokenNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListGitHubAccountTokenNamesOutput {
    def apply(
      tokenNameList: js.UndefOr[GitHubAccountTokenNameList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListGitHubAccountTokenNamesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tokenNameList" -> tokenNameList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGitHubAccountTokenNamesOutput]
    }
  }

  /**
   * <p>Represents the input of a ListOnPremisesInstances operation.</p>
   */
  @js.native
  trait ListOnPremisesInstancesInput extends js.Object {
    var registrationStatus: js.UndefOr[RegistrationStatus]
    var tagFilters: js.UndefOr[TagFilterList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListOnPremisesInstancesInput {
    def apply(
      registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      tagFilters: js.UndefOr[TagFilterList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registrationStatus" -> registrationStatus.map { x => x.asInstanceOf[js.Any] },
        "tagFilters" -> tagFilters.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOnPremisesInstancesInput]
    }
  }

  /**
   * <p>Represents the output of list on-premises instances operation.</p>
   */
  @js.native
  trait ListOnPremisesInstancesOutput extends js.Object {
    var instanceNames: js.UndefOr[InstanceNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListOnPremisesInstancesOutput {
    def apply(
      instanceNames: js.UndefOr[InstanceNameList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListOnPremisesInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceNames" -> instanceNames.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOnPremisesInstancesOutput]
    }
  }

  object ListStateFilterActionEnum {
    val include = "include"
    val exclude = "exclude"
    val ignore = "ignore"

    val values = IndexedSeq(include, exclude, ignore)
  }

  /**
   * <p>Information about the Elastic Load Balancing load balancer or target group used in a deployment.</p>
   */
  @js.native
  trait LoadBalancerInfo extends js.Object {
    var elbInfoList: js.UndefOr[ELBInfoList]
    var targetGroupInfoList: js.UndefOr[TargetGroupInfoList]
  }

  object LoadBalancerInfo {
    def apply(
      elbInfoList: js.UndefOr[ELBInfoList] = js.undefined,
      targetGroupInfoList: js.UndefOr[TargetGroupInfoList] = js.undefined): LoadBalancerInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "elbInfoList" -> elbInfoList.map { x => x.asInstanceOf[js.Any] },
        "targetGroupInfoList" -> targetGroupInfoList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerInfo]
    }
  }

  /**
   * <p>Information about minimum healthy instance.</p>
   */
  @js.native
  trait MinimumHealthyHosts extends js.Object {
    var value: js.UndefOr[MinimumHealthyHostsValue]
    var `type`: js.UndefOr[MinimumHealthyHostsType]
  }

  object MinimumHealthyHosts {
    def apply(
      value: js.UndefOr[MinimumHealthyHostsValue] = js.undefined,
      `type`: js.UndefOr[MinimumHealthyHostsType] = js.undefined): MinimumHealthyHosts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MinimumHealthyHosts]
    }
  }

  object MinimumHealthyHostsTypeEnum {
    val HOST_COUNT = "HOST_COUNT"
    val FLEET_PERCENT = "FLEET_PERCENT"

    val values = IndexedSeq(HOST_COUNT, FLEET_PERCENT)
  }

  /**
   * <p>Both an IAM user ARN and an IAM session ARN were included in the request. Use only one ARN type.</p>
   */
  @js.native
  trait MultipleIamArnsProvidedExceptionException extends js.Object {

  }

  /**
   * <p>Information about groups of on-premises instance tags.</p>
   */
  @js.native
  trait OnPremisesTagSet extends js.Object {
    var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList]
  }

  object OnPremisesTagSet {
    def apply(
      onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList] = js.undefined): OnPremisesTagSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "onPremisesTagSetList" -> onPremisesTagSetList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OnPremisesTagSet]
    }
  }

  /**
   * <p>The API used does not support the deployment.</p>
   */
  @js.native
  trait OperationNotSupportedExceptionException extends js.Object {

  }

  @js.native
  trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId]
    var status: js.UndefOr[LifecycleEventStatus]
  }

  object PutLifecycleEventHookExecutionStatusInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined,
      status: js.UndefOr[LifecycleEventStatus] = js.undefined): PutLifecycleEventHookExecutionStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "lifecycleEventHookExecutionId" -> lifecycleEventHookExecutionId.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
    }
  }

  @js.native
  trait PutLifecycleEventHookExecutionStatusOutput extends js.Object {
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId]
  }

  object PutLifecycleEventHookExecutionStatusOutput {
    def apply(
      lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined): PutLifecycleEventHookExecutionStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lifecycleEventHookExecutionId" -> lifecycleEventHookExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecycleEventHookExecutionStatusOutput]
    }
  }

  /**
   * <p>A revision for an AWS Lambda deployment that is a YAML-formatted or JSON-formatted string. For AWS Lambda deployments, the revision is the same as the AppSpec file.</p>
   */
  @js.native
  trait RawString extends js.Object {
    var content: js.UndefOr[RawStringContent]
    var sha256: js.UndefOr[RawStringSha256]
  }

  object RawString {
    def apply(
      content: js.UndefOr[RawStringContent] = js.undefined,
      sha256: js.UndefOr[RawStringSha256] = js.undefined): RawString = {
      val _fields = IndexedSeq[(String, js.Any)](
        "content" -> content.map { x => x.asInstanceOf[js.Any] },
        "sha256" -> sha256.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RawString]
    }
  }

  /**
   * <p>Represents the input of a RegisterApplicationRevision operation.</p>
   */
  @js.native
  trait RegisterApplicationRevisionInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var description: js.UndefOr[Description]
    var revision: js.UndefOr[RevisionLocation]
  }

  object RegisterApplicationRevisionInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined): RegisterApplicationRevisionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterApplicationRevisionInput]
    }
  }

  /**
   * <p>Represents the input of the register on-premises instance operation.</p>
   */
  @js.native
  trait RegisterOnPremisesInstanceInput extends js.Object {
    var instanceName: js.UndefOr[InstanceName]
    var iamSessionArn: js.UndefOr[IamSessionArn]
    var iamUserArn: js.UndefOr[IamUserArn]
  }

  object RegisterOnPremisesInstanceInput {
    def apply(
      instanceName: js.UndefOr[InstanceName] = js.undefined,
      iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined,
      iamUserArn: js.UndefOr[IamUserArn] = js.undefined): RegisterOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] },
        "iamSessionArn" -> iamSessionArn.map { x => x.asInstanceOf[js.Any] },
        "iamUserArn" -> iamUserArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterOnPremisesInstanceInput]
    }
  }

  object RegistrationStatusEnum {
    val Registered = "Registered"
    val Deregistered = "Deregistered"

    val values = IndexedSeq(Registered, Deregistered)
  }

  /**
   * <p>Represents the input of a RemoveTagsFromOnPremisesInstances operation.</p>
   */
  @js.native
  trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
    var tags: js.UndefOr[TagList]
    var instanceNames: js.UndefOr[InstanceNameList]
  }

  object RemoveTagsFromOnPremisesInstancesInput {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      instanceNames: js.UndefOr[InstanceNameList] = js.undefined): RemoveTagsFromOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "instanceNames" -> instanceNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromOnPremisesInstancesInput]
    }
  }

  /**
   * <p>The specified resource could not be validated.</p>
   */
  @js.native
  trait ResourceValidationExceptionException extends js.Object {

  }

  /**
   * <p>The named revision does not exist with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait RevisionDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>Information about an application revision.</p>
   */
  @js.native
  trait RevisionInfo extends js.Object {
    var revisionLocation: js.UndefOr[RevisionLocation]
    var genericRevisionInfo: js.UndefOr[GenericRevisionInfo]
  }

  object RevisionInfo {
    def apply(
      revisionLocation: js.UndefOr[RevisionLocation] = js.undefined,
      genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined): RevisionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "revisionLocation" -> revisionLocation.map { x => x.asInstanceOf[js.Any] },
        "genericRevisionInfo" -> genericRevisionInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevisionInfo]
    }
  }

  /**
   * <p>Information about the location of an application revision.</p>
   */
  @js.native
  trait RevisionLocation extends js.Object {
    var revisionType: js.UndefOr[RevisionLocationType]
    var s3Location: js.UndefOr[S3Location]
    var gitHubLocation: js.UndefOr[GitHubLocation]
    var string: js.UndefOr[RawString]
  }

  object RevisionLocation {
    def apply(
      revisionType: js.UndefOr[RevisionLocationType] = js.undefined,
      s3Location: js.UndefOr[S3Location] = js.undefined,
      gitHubLocation: js.UndefOr[GitHubLocation] = js.undefined,
      string: js.UndefOr[RawString] = js.undefined): RevisionLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "revisionType" -> revisionType.map { x => x.asInstanceOf[js.Any] },
        "s3Location" -> s3Location.map { x => x.asInstanceOf[js.Any] },
        "gitHubLocation" -> gitHubLocation.map { x => x.asInstanceOf[js.Any] },
        "string" -> string.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevisionLocation]
    }
  }

  object RevisionLocationTypeEnum {
    val S3 = "S3"
    val GitHub = "GitHub"
    val String = "String"

    val values = IndexedSeq(S3, GitHub, String)
  }

  /**
   * <p>The revision ID was not specified.</p>
   */
  @js.native
  trait RevisionRequiredExceptionException extends js.Object {

  }

  /**
   * <p>The role ID was not specified.</p>
   */
  @js.native
  trait RoleRequiredExceptionException extends js.Object {

  }

  /**
   * <p>Information about a deployment rollback.</p>
   */
  @js.native
  trait RollbackInfo extends js.Object {
    var rollbackDeploymentId: js.UndefOr[DeploymentId]
    var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId]
    var rollbackMessage: js.UndefOr[Description]
  }

  object RollbackInfo {
    def apply(
      rollbackDeploymentId: js.UndefOr[DeploymentId] = js.undefined,
      rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId] = js.undefined,
      rollbackMessage: js.UndefOr[Description] = js.undefined): RollbackInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rollbackDeploymentId" -> rollbackDeploymentId.map { x => x.asInstanceOf[js.Any] },
        "rollbackTriggeringDeploymentId" -> rollbackTriggeringDeploymentId.map { x => x.asInstanceOf[js.Any] },
        "rollbackMessage" -> rollbackMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RollbackInfo]
    }
  }

  /**
   * <p>Information about the location of application artifacts stored in Amazon S3.</p>
   */
  @js.native
  trait S3Location extends js.Object {
    var eTag: js.UndefOr[ETag]
    var key: js.UndefOr[S3Key]
    var version: js.UndefOr[VersionId]
    var bundleType: js.UndefOr[BundleType]
    var bucket: js.UndefOr[S3Bucket]
  }

  object S3Location {
    def apply(
      eTag: js.UndefOr[ETag] = js.undefined,
      key: js.UndefOr[S3Key] = js.undefined,
      version: js.UndefOr[VersionId] = js.undefined,
      bundleType: js.UndefOr[BundleType] = js.undefined,
      bucket: js.UndefOr[S3Bucket] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eTag" -> eTag.map { x => x.asInstanceOf[js.Any] },
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "bundleType" -> bundleType.map { x => x.asInstanceOf[js.Any] },
        "bucket" -> bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  @js.native
  trait SkipWaitTimeForInstanceTerminationInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  object SkipWaitTimeForInstanceTerminationInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined): SkipWaitTimeForInstanceTerminationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SkipWaitTimeForInstanceTerminationInput]
    }
  }

  object SortOrderEnum {
    val ascending = "ascending"
    val descending = "descending"

    val values = IndexedSeq(ascending, descending)
  }

  /**
   * <p>Represents the input of a StopDeployment operation.</p>
   */
  @js.native
  trait StopDeploymentInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var autoRollbackEnabled: js.UndefOr[NullableBoolean]
  }

  object StopDeploymentInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.undefined): StopDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "autoRollbackEnabled" -> autoRollbackEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDeploymentInput]
    }
  }

  /**
   * <p>Represents the output of a StopDeployment operation.</p>
   */
  @js.native
  trait StopDeploymentOutput extends js.Object {
    var status: js.UndefOr[StopStatus]
    var statusMessage: js.UndefOr[Message]
  }

  object StopDeploymentOutput {
    def apply(
      status: js.UndefOr[StopStatus] = js.undefined,
      statusMessage: js.UndefOr[Message] = js.undefined): StopDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDeploymentOutput]
    }
  }

  object StopStatusEnum {
    val Pending = "Pending"
    val Succeeded = "Succeeded"

    val values = IndexedSeq(Pending, Succeeded)
  }

  /**
   * <p>Information about a tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[Key]
    var Value: js.UndefOr[Value]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[Key] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Information about an on-premises instance tag filter.</p>
   */
  @js.native
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[Key]
    var Value: js.UndefOr[Value]
    var Type: js.UndefOr[TagFilterType]
  }

  object TagFilter {
    def apply(
      Key: js.UndefOr[Key] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined,
      Type: js.UndefOr[TagFilterType] = js.undefined): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  object TagFilterTypeEnum {
    val KEY_ONLY = "KEY_ONLY"
    val VALUE_ONLY = "VALUE_ONLY"
    val KEY_AND_VALUE = "KEY_AND_VALUE"

    val values = IndexedSeq(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
  }

  /**
   * <p>The maximum allowed number of tags was exceeded.</p>
   */
  @js.native
  trait TagLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>A tag was not specified.</p>
   */
  @js.native
  trait TagRequiredExceptionException extends js.Object {

  }

  /**
   * <p>The number of tag groups included in the tag set list exceeded the maximum allowed limit of 3.</p>
   */
  @js.native
  trait TagSetListLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>Information about a target group in Elastic Load Balancing to use in a deployment. Instances are registered as targets in a target group, and traffic is routed to the target group.</p>
   */
  @js.native
  trait TargetGroupInfo extends js.Object {
    var name: js.UndefOr[TargetGroupName]
  }

  object TargetGroupInfo {
    def apply(
      name: js.UndefOr[TargetGroupName] = js.undefined): TargetGroupInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroupInfo]
    }
  }

  /**
   * <p>Information about the instances to be used in the replacement environment in a blue/green deployment.</p>
   */
  @js.native
  trait TargetInstances extends js.Object {
    var tagFilters: js.UndefOr[EC2TagFilterList]
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList]
    var ec2TagSet: js.UndefOr[EC2TagSet]
  }

  object TargetInstances {
    def apply(
      tagFilters: js.UndefOr[EC2TagFilterList] = js.undefined,
      autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
      ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined): TargetInstances = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tagFilters" -> tagFilters.map { x => x.asInstanceOf[js.Any] },
        "autoScalingGroups" -> autoScalingGroups.map { x => x.asInstanceOf[js.Any] },
        "ec2TagSet" -> ec2TagSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetInstances]
    }
  }

  /**
   * <p>An API function was called too frequently.</p>
   */
  @js.native
  trait ThrottlingExceptionException extends js.Object {

  }

  /**
   * <p>A configuration that shifts traffic from one version of a Lambda function to another in two increments. The original and target Lambda function versions are specified in the deployment's AppSpec file.</p>
   */
  @js.native
  trait TimeBasedCanary extends js.Object {
    var canaryPercentage: js.UndefOr[Percentage]
    var canaryInterval: js.UndefOr[WaitTimeInMins]
  }

  object TimeBasedCanary {
    def apply(
      canaryPercentage: js.UndefOr[Percentage] = js.undefined,
      canaryInterval: js.UndefOr[WaitTimeInMins] = js.undefined): TimeBasedCanary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "canaryPercentage" -> canaryPercentage.map { x => x.asInstanceOf[js.Any] },
        "canaryInterval" -> canaryInterval.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeBasedCanary]
    }
  }

  /**
   * <p>A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions are specified in the deployment's AppSpec file.</p>
   */
  @js.native
  trait TimeBasedLinear extends js.Object {
    var linearPercentage: js.UndefOr[Percentage]
    var linearInterval: js.UndefOr[WaitTimeInMins]
  }

  object TimeBasedLinear {
    def apply(
      linearPercentage: js.UndefOr[Percentage] = js.undefined,
      linearInterval: js.UndefOr[WaitTimeInMins] = js.undefined): TimeBasedLinear = {
      val _fields = IndexedSeq[(String, js.Any)](
        "linearPercentage" -> linearPercentage.map { x => x.asInstanceOf[js.Any] },
        "linearInterval" -> linearInterval.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeBasedLinear]
    }
  }

  /**
   * <p>Information about a time range.</p>
   */
  @js.native
  trait TimeRange extends js.Object {
    var start: js.UndefOr[Timestamp]
    var end: js.UndefOr[Timestamp]
  }

  object TimeRange {
    def apply(
      start: js.UndefOr[Timestamp] = js.undefined,
      end: js.UndefOr[Timestamp] = js.undefined): TimeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "start" -> start.map { x => x.asInstanceOf[js.Any] },
        "end" -> end.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeRange]
    }
  }

  /**
   * <p>The configuration that specifies how traffic is shifted from one version of a Lambda function to another version during an AWS Lambda deployment.</p>
   */
  @js.native
  trait TrafficRoutingConfig extends js.Object {
    var `type`: js.UndefOr[TrafficRoutingType]
    var timeBasedCanary: js.UndefOr[TimeBasedCanary]
    var timeBasedLinear: js.UndefOr[TimeBasedLinear]
  }

  object TrafficRoutingConfig {
    def apply(
      `type`: js.UndefOr[TrafficRoutingType] = js.undefined,
      timeBasedCanary: js.UndefOr[TimeBasedCanary] = js.undefined,
      timeBasedLinear: js.UndefOr[TimeBasedLinear] = js.undefined): TrafficRoutingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "timeBasedCanary" -> timeBasedCanary.map { x => x.asInstanceOf[js.Any] },
        "timeBasedLinear" -> timeBasedLinear.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficRoutingConfig]
    }
  }

  object TrafficRoutingTypeEnum {
    val TimeBasedCanary = "TimeBasedCanary"
    val TimeBasedLinear = "TimeBasedLinear"
    val AllAtOnce = "AllAtOnce"

    val values = IndexedSeq(TimeBasedCanary, TimeBasedLinear, AllAtOnce)
  }

  /**
   * <p>Information about notification triggers for the deployment group.</p>
   */
  @js.native
  trait TriggerConfig extends js.Object {
    var triggerName: js.UndefOr[TriggerName]
    var triggerTargetArn: js.UndefOr[TriggerTargetArn]
    var triggerEvents: js.UndefOr[TriggerEventTypeList]
  }

  object TriggerConfig {
    def apply(
      triggerName: js.UndefOr[TriggerName] = js.undefined,
      triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.undefined,
      triggerEvents: js.UndefOr[TriggerEventTypeList] = js.undefined): TriggerConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "triggerName" -> triggerName.map { x => x.asInstanceOf[js.Any] },
        "triggerTargetArn" -> triggerTargetArn.map { x => x.asInstanceOf[js.Any] },
        "triggerEvents" -> triggerEvents.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TriggerConfig]
    }
  }

  object TriggerEventTypeEnum {
    val DeploymentStart = "DeploymentStart"
    val DeploymentSuccess = "DeploymentSuccess"
    val DeploymentFailure = "DeploymentFailure"
    val DeploymentStop = "DeploymentStop"
    val DeploymentRollback = "DeploymentRollback"
    val DeploymentReady = "DeploymentReady"
    val InstanceStart = "InstanceStart"
    val InstanceSuccess = "InstanceSuccess"
    val InstanceFailure = "InstanceFailure"
    val InstanceReady = "InstanceReady"

    val values = IndexedSeq(DeploymentStart, DeploymentSuccess, DeploymentFailure, DeploymentStop, DeploymentRollback, DeploymentReady, InstanceStart, InstanceSuccess, InstanceFailure, InstanceReady)
  }

  /**
   * <p>The maximum allowed number of triggers was exceeded.</p>
   */
  @js.native
  trait TriggerTargetsLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>A call was submitted that is not supported for the specified deployment type.</p>
   */
  @js.native
  trait UnsupportedActionForDeploymentTypeExceptionException extends js.Object {

  }

  /**
   * <p>Represents the input of an UpdateApplication operation.</p>
   */
  @js.native
  trait UpdateApplicationInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var newApplicationName: js.UndefOr[ApplicationName]
  }

  object UpdateApplicationInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      newApplicationName: js.UndefOr[ApplicationName] = js.undefined): UpdateApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "newApplicationName" -> newApplicationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationInput]
    }
  }

  /**
   * <p>Represents the input of an UpdateDeploymentGroup operation.</p>
   */
  @js.native
  trait UpdateDeploymentGroupInput extends js.Object {
    var alarmConfiguration: js.UndefOr[AlarmConfiguration]
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration]
    var currentDeploymentGroupName: js.UndefOr[DeploymentGroupName]
    var deploymentStyle: js.UndefOr[DeploymentStyle]
    var serviceRoleArn: js.UndefOr[Role]
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
    var applicationName: js.UndefOr[ApplicationName]
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList]
    var ec2TagFilters: js.UndefOr[EC2TagFilterList]
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var newDeploymentGroupName: js.UndefOr[DeploymentGroupName]
    var ec2TagSet: js.UndefOr[EC2TagSet]
  }

  object UpdateDeploymentGroupInput {
    def apply(
      alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined,
      blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined,
      currentDeploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined,
      serviceRoleArn: js.UndefOr[Role] = js.undefined,
      autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
      triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
      ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined,
      autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
      loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
      newDeploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined): UpdateDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "alarmConfiguration" -> alarmConfiguration.map { x => x.asInstanceOf[js.Any] },
        "blueGreenDeploymentConfiguration" -> blueGreenDeploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "currentDeploymentGroupName" -> currentDeploymentGroupName.map { x => x.asInstanceOf[js.Any] },
        "deploymentStyle" -> deploymentStyle.map { x => x.asInstanceOf[js.Any] },
        "serviceRoleArn" -> serviceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "autoScalingGroups" -> autoScalingGroups.map { x => x.asInstanceOf[js.Any] },
        "triggerConfigurations" -> triggerConfigurations.map { x => x.asInstanceOf[js.Any] },
        "applicationName" -> applicationName.map { x => x.asInstanceOf[js.Any] },
        "onPremisesTagSet" -> onPremisesTagSet.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfigName" -> deploymentConfigName.map { x => x.asInstanceOf[js.Any] },
        "onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x => x.asInstanceOf[js.Any] },
        "ec2TagFilters" -> ec2TagFilters.map { x => x.asInstanceOf[js.Any] },
        "autoRollbackConfiguration" -> autoRollbackConfiguration.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerInfo" -> loadBalancerInfo.map { x => x.asInstanceOf[js.Any] },
        "newDeploymentGroupName" -> newDeploymentGroupName.map { x => x.asInstanceOf[js.Any] },
        "ec2TagSet" -> ec2TagSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeploymentGroupInput]
    }
  }

  /**
   * <p>Represents the output of an UpdateDeploymentGroup operation.</p>
   */
  @js.native
  trait UpdateDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList]
  }

  object UpdateDeploymentGroupOutput {
    def apply(
      hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined): UpdateDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hooksNotCleanedUp" -> hooksNotCleanedUp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeploymentGroupOutput]
    }
  }
}
