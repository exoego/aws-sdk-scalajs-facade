package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object codedeploy {
  @deprecated("AdditionalDeploymentStatusInfo is deprecated, use DeploymentStatusMessageList instead.", "forever")
  type AdditionalDeploymentStatusInfo = String
  type AlarmList = js.Array[Alarm]
  type AlarmName = String
  type ApplicationId = String
  type ApplicationName = String
  type ApplicationsInfoList = js.Array[ApplicationInfo]
  type ApplicationsList = js.Array[ApplicationName]
  type Arn = String
  type AutoRollbackEventsList = js.Array[AutoRollbackEvent]
  type AutoScalingGroupHook = String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AutoScalingGroupName = String
  type AutoScalingGroupNameList = js.Array[AutoScalingGroupName]
  type CloudFormationResourceType = String
  type CommitId = String
  type DeploymentConfigId = String
  type DeploymentConfigName = String
  type DeploymentConfigsList = js.Array[DeploymentConfigName]
  type DeploymentGroupId = String
  type DeploymentGroupInfoList = js.Array[DeploymentGroupInfo]
  type DeploymentGroupName = String
  type DeploymentGroupsList = js.Array[DeploymentGroupName]
  type DeploymentId = String
  type DeploymentStatusList = js.Array[DeploymentStatus]
  type DeploymentStatusMessageList = js.Array[ErrorMessage]
  type DeploymentTargetList = js.Array[DeploymentTarget]
  type DeploymentsInfoList = js.Array[DeploymentInfo]
  type DeploymentsList = js.Array[DeploymentId]
  type Description = String
  type Duration = Int
  type EC2TagFilterList = js.Array[EC2TagFilter]
  type EC2TagSetList = js.Array[EC2TagFilterList]
  type ECSClusterName = String
  type ECSServiceList = js.Array[ECSService]
  type ECSServiceName = String
  type ECSTaskSetCount = Double
  type ECSTaskSetIdentifier = String
  type ECSTaskSetList = js.Array[ECSTaskSet]
  type ECSTaskSetStatus = String
  type ELBInfoList = js.Array[ELBInfo]
  type ELBName = String
  type ETag = String
  type ErrorMessage = String
  type ExternalId = String
  type FilterValue = String
  type FilterValueList = js.Array[FilterValue]
  type GitHubAccountTokenName = String
  type GitHubAccountTokenNameList = js.Array[GitHubAccountTokenName]
  type IamSessionArn = String
  type IamUserArn = String
  type InstanceArn = String
  type InstanceCount = Double
  type InstanceId = String
  type InstanceInfoList = js.Array[InstanceInfo]
  type InstanceName = String
  type InstanceNameList = js.Array[InstanceName]
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type InstanceTypeList = js.Array[InstanceType]
  type InstancesList = js.Array[InstanceId]
  type Key = String
  type LambdaFunctionAlias = String
  type LambdaFunctionName = String
  type LifecycleEventHookExecutionId = String
  type LifecycleEventList = js.Array[LifecycleEvent]
  type LifecycleEventName = String
  type LifecycleMessage = String
  type ListenerArn = String
  type ListenerArnList = js.Array[ListenerArn]
  type LogTail = String
  type Message = String
  type MinimumHealthyHostsValue = Int
  type NextToken = String
  type NullableBoolean = Boolean
  type OnPremisesTagSetList = js.Array[TagFilterList]
  type Percentage = Int
  type RawStringContent = String
  type RawStringSha256 = String
  type Repository = String
  type RevisionInfoList = js.Array[RevisionInfo]
  type RevisionLocationList = js.Array[RevisionLocation]
  type Role = String
  type S3Bucket = String
  type S3Key = String
  type ScriptName = String
  type TagFilterList = js.Array[TagFilter]
  type TagKeyList = js.Array[Key]
  type TagList = js.Array[Tag]
  type TargetArn = String
  type TargetFilters = js.Dictionary[FilterValueList]
  type TargetGroupInfoList = js.Array[TargetGroupInfo]
  type TargetGroupName = String
  type TargetGroupPairInfoList = js.Array[TargetGroupPairInfo]
  type TargetId = String
  type TargetIdList = js.Array[TargetId]
  type Time = js.Date
  type Timestamp = js.Date
  type TrafficWeight = Double
  type TriggerConfigList = js.Array[TriggerConfig]
  type TriggerEventTypeList = js.Array[TriggerEventType]
  type TriggerName = String
  type TriggerTargetArn = String
  type Value = String
  type Version = String
  type VersionId = String
  type WaitTimeInMins = Int

  final class CodeDeployOps(private val service: CodeDeploy) extends AnyVal {

    @inline def addTagsToOnPremisesInstancesFuture(params: AddTagsToOnPremisesInstancesInput): Future[js.Object] = service.addTagsToOnPremisesInstances(params).promise().toFuture
    @inline def batchGetApplicationRevisionsFuture(params: BatchGetApplicationRevisionsInput): Future[BatchGetApplicationRevisionsOutput] = service.batchGetApplicationRevisions(params).promise().toFuture
    @inline def batchGetApplicationsFuture(params: BatchGetApplicationsInput): Future[BatchGetApplicationsOutput] = service.batchGetApplications(params).promise().toFuture
    @inline def batchGetDeploymentGroupsFuture(params: BatchGetDeploymentGroupsInput): Future[BatchGetDeploymentGroupsOutput] = service.batchGetDeploymentGroups(params).promise().toFuture
    @inline def batchGetDeploymentTargetsFuture(params: BatchGetDeploymentTargetsInput): Future[BatchGetDeploymentTargetsOutput] = service.batchGetDeploymentTargets(params).promise().toFuture
    @inline def batchGetDeploymentsFuture(params: BatchGetDeploymentsInput): Future[BatchGetDeploymentsOutput] = service.batchGetDeployments(params).promise().toFuture
    @inline def batchGetOnPremisesInstancesFuture(params: BatchGetOnPremisesInstancesInput): Future[BatchGetOnPremisesInstancesOutput] = service.batchGetOnPremisesInstances(params).promise().toFuture
    @inline def continueDeploymentFuture(params: ContinueDeploymentInput): Future[js.Object] = service.continueDeployment(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationInput): Future[CreateApplicationOutput] = service.createApplication(params).promise().toFuture
    @inline def createDeploymentConfigFuture(params: CreateDeploymentConfigInput): Future[CreateDeploymentConfigOutput] = service.createDeploymentConfig(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentInput): Future[CreateDeploymentOutput] = service.createDeployment(params).promise().toFuture
    @inline def createDeploymentGroupFuture(params: CreateDeploymentGroupInput): Future[CreateDeploymentGroupOutput] = service.createDeploymentGroup(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationInput): Future[js.Object] = service.deleteApplication(params).promise().toFuture
    @inline def deleteDeploymentConfigFuture(params: DeleteDeploymentConfigInput): Future[js.Object] = service.deleteDeploymentConfig(params).promise().toFuture
    @inline def deleteDeploymentGroupFuture(params: DeleteDeploymentGroupInput): Future[DeleteDeploymentGroupOutput] = service.deleteDeploymentGroup(params).promise().toFuture
    @inline def deleteGitHubAccountTokenFuture(params: DeleteGitHubAccountTokenInput): Future[DeleteGitHubAccountTokenOutput] = service.deleteGitHubAccountToken(params).promise().toFuture
    @inline def deleteResourcesByExternalIdFuture(params: DeleteResourcesByExternalIdInput): Future[DeleteResourcesByExternalIdOutput] = service.deleteResourcesByExternalId(params).promise().toFuture
    @inline def deregisterOnPremisesInstanceFuture(params: DeregisterOnPremisesInstanceInput): Future[js.Object] = service.deregisterOnPremisesInstance(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationInput): Future[GetApplicationOutput] = service.getApplication(params).promise().toFuture
    @inline def getApplicationRevisionFuture(params: GetApplicationRevisionInput): Future[GetApplicationRevisionOutput] = service.getApplicationRevision(params).promise().toFuture
    @inline def getDeploymentConfigFuture(params: GetDeploymentConfigInput): Future[GetDeploymentConfigOutput] = service.getDeploymentConfig(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentInput): Future[GetDeploymentOutput] = service.getDeployment(params).promise().toFuture
    @inline def getDeploymentGroupFuture(params: GetDeploymentGroupInput): Future[GetDeploymentGroupOutput] = service.getDeploymentGroup(params).promise().toFuture
    @inline def getDeploymentTargetFuture(params: GetDeploymentTargetInput): Future[GetDeploymentTargetOutput] = service.getDeploymentTarget(params).promise().toFuture
    @inline def getOnPremisesInstanceFuture(params: GetOnPremisesInstanceInput): Future[GetOnPremisesInstanceOutput] = service.getOnPremisesInstance(params).promise().toFuture
    @inline def listApplicationRevisionsFuture(params: ListApplicationRevisionsInput): Future[ListApplicationRevisionsOutput] = service.listApplicationRevisions(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsInput): Future[ListApplicationsOutput] = service.listApplications(params).promise().toFuture
    @inline def listDeploymentConfigsFuture(params: ListDeploymentConfigsInput): Future[ListDeploymentConfigsOutput] = service.listDeploymentConfigs(params).promise().toFuture
    @inline def listDeploymentGroupsFuture(params: ListDeploymentGroupsInput): Future[ListDeploymentGroupsOutput] = service.listDeploymentGroups(params).promise().toFuture
    @inline def listDeploymentTargetsFuture(params: ListDeploymentTargetsInput): Future[ListDeploymentTargetsOutput] = service.listDeploymentTargets(params).promise().toFuture
    @inline def listDeploymentsFuture(params: ListDeploymentsInput): Future[ListDeploymentsOutput] = service.listDeployments(params).promise().toFuture
    @inline def listGitHubAccountTokenNamesFuture(params: ListGitHubAccountTokenNamesInput): Future[ListGitHubAccountTokenNamesOutput] = service.listGitHubAccountTokenNames(params).promise().toFuture
    @inline def listOnPremisesInstancesFuture(params: ListOnPremisesInstancesInput): Future[ListOnPremisesInstancesOutput] = service.listOnPremisesInstances(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def putLifecycleEventHookExecutionStatusFuture(params: PutLifecycleEventHookExecutionStatusInput): Future[PutLifecycleEventHookExecutionStatusOutput] = service.putLifecycleEventHookExecutionStatus(params).promise().toFuture
    @inline def registerApplicationRevisionFuture(params: RegisterApplicationRevisionInput): Future[js.Object] = service.registerApplicationRevision(params).promise().toFuture
    @inline def registerOnPremisesInstanceFuture(params: RegisterOnPremisesInstanceInput): Future[js.Object] = service.registerOnPremisesInstance(params).promise().toFuture
    @inline def removeTagsFromOnPremisesInstancesFuture(params: RemoveTagsFromOnPremisesInstancesInput): Future[js.Object] = service.removeTagsFromOnPremisesInstances(params).promise().toFuture
    @inline def stopDeploymentFuture(params: StopDeploymentInput): Future[StopDeploymentOutput] = service.stopDeployment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationInput): Future[js.Object] = service.updateApplication(params).promise().toFuture
    @inline def updateDeploymentGroupFuture(params: UpdateDeploymentGroupInput): Future[UpdateDeploymentGroupOutput] = service.updateDeploymentGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/codedeploy", JSImport.Namespace, "AWS.CodeDeploy")
  class CodeDeploy() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("This operation is deprecated, use BatchGetDeploymentTargets instead.", "forever") def batchGetDeploymentInstances(params: BatchGetDeploymentInstancesInput): Request[BatchGetDeploymentInstancesOutput] = js.native
    @deprecated("This operation is deprecated, use ContinueDeployment with DeploymentWaitType instead.", "forever") def skipWaitTimeForInstanceTermination(params: SkipWaitTimeForInstanceTerminationInput): Request[js.Object] = js.native
    @deprecated("This operation is deprecated, use GetDeploymentTarget instead.", "forever") def getDeploymentInstance(params: GetDeploymentInstanceInput): Request[GetDeploymentInstanceOutput] = js.native
    @deprecated("This operation is deprecated, use ListDeploymentTargets instead.", "forever") def listDeploymentInstances(params: ListDeploymentInstancesInput): Request[ListDeploymentInstancesOutput] = js.native
    def addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput): Request[js.Object] = js.native
    def batchGetApplicationRevisions(params: BatchGetApplicationRevisionsInput): Request[BatchGetApplicationRevisionsOutput] = js.native
    def batchGetApplications(params: BatchGetApplicationsInput): Request[BatchGetApplicationsOutput] = js.native
    def batchGetDeploymentGroups(params: BatchGetDeploymentGroupsInput): Request[BatchGetDeploymentGroupsOutput] = js.native
    def batchGetDeploymentTargets(params: BatchGetDeploymentTargetsInput): Request[BatchGetDeploymentTargetsOutput] = js.native
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
    def deleteResourcesByExternalId(params: DeleteResourcesByExternalIdInput): Request[DeleteResourcesByExternalIdOutput] = js.native
    def deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput): Request[js.Object] = js.native
    def getApplication(params: GetApplicationInput): Request[GetApplicationOutput] = js.native
    def getApplicationRevision(params: GetApplicationRevisionInput): Request[GetApplicationRevisionOutput] = js.native
    def getDeployment(params: GetDeploymentInput): Request[GetDeploymentOutput] = js.native
    def getDeploymentConfig(params: GetDeploymentConfigInput): Request[GetDeploymentConfigOutput] = js.native
    def getDeploymentGroup(params: GetDeploymentGroupInput): Request[GetDeploymentGroupOutput] = js.native
    def getDeploymentTarget(params: GetDeploymentTargetInput): Request[GetDeploymentTargetOutput] = js.native
    def getOnPremisesInstance(params: GetOnPremisesInstanceInput): Request[GetOnPremisesInstanceOutput] = js.native
    def listApplicationRevisions(params: ListApplicationRevisionsInput): Request[ListApplicationRevisionsOutput] = js.native
    def listApplications(params: ListApplicationsInput): Request[ListApplicationsOutput] = js.native
    def listDeploymentConfigs(params: ListDeploymentConfigsInput): Request[ListDeploymentConfigsOutput] = js.native
    def listDeploymentGroups(params: ListDeploymentGroupsInput): Request[ListDeploymentGroupsOutput] = js.native
    def listDeploymentTargets(params: ListDeploymentTargetsInput): Request[ListDeploymentTargetsOutput] = js.native
    def listDeployments(params: ListDeploymentsInput): Request[ListDeploymentsOutput] = js.native
    def listGitHubAccountTokenNames(params: ListGitHubAccountTokenNamesInput): Request[ListGitHubAccountTokenNamesOutput] = js.native
    def listOnPremisesInstances(params: ListOnPremisesInstancesInput): Request[ListOnPremisesInstancesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def putLifecycleEventHookExecutionStatus(params: PutLifecycleEventHookExecutionStatusInput): Request[PutLifecycleEventHookExecutionStatusOutput] = js.native
    def registerApplicationRevision(params: RegisterApplicationRevisionInput): Request[js.Object] = js.native
    def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput): Request[js.Object] = js.native
    def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput): Request[js.Object] = js.native
    def stopDeployment(params: StopDeploymentInput): Request[StopDeploymentOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateApplication(params: UpdateApplicationInput): Request[js.Object] = js.native
    def updateDeploymentGroup(params: UpdateDeploymentGroupInput): Request[UpdateDeploymentGroupOutput] = js.native
  }
  object CodeDeploy {
    @inline implicit def toOps(service: CodeDeploy): CodeDeployOps = {
      new CodeDeployOps(service)
    }
  }

  /** Represents the input of, and adds tags to, an on-premises instance operation.
    */
  @js.native
  trait AddTagsToOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
    var tags: TagList
  }

  object AddTagsToOnPremisesInstancesInput {
    @inline
    def apply(
        instanceNames: InstanceNameList,
        tags: TagList
    ): AddTagsToOnPremisesInstancesInput = {
      val __obj = js.Dynamic.literal(
        "instanceNames" -> instanceNames.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddTagsToOnPremisesInstancesInput]
    }
  }

  /** Information about an alarm.
    */
  @js.native
  trait Alarm extends js.Object {
    var name: js.UndefOr[AlarmName]
  }

  object Alarm {
    @inline
    def apply(
        name: js.UndefOr[AlarmName] = js.undefined
    ): Alarm = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alarm]
    }
  }

  /** Information about alarms associated with the deployment group.
    */
  @js.native
  trait AlarmConfiguration extends js.Object {
    var alarms: js.UndefOr[AlarmList]
    var enabled: js.UndefOr[Boolean]
    var ignorePollAlarmFailure: js.UndefOr[Boolean]
  }

  object AlarmConfiguration {
    @inline
    def apply(
        alarms: js.UndefOr[AlarmList] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        ignorePollAlarmFailure: js.UndefOr[Boolean] = js.undefined
    ): AlarmConfiguration = {
      val __obj = js.Dynamic.literal()
      alarms.foreach(__v => __obj.updateDynamic("alarms")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      ignorePollAlarmFailure.foreach(__v => __obj.updateDynamic("ignorePollAlarmFailure")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmConfiguration]
    }
  }

  /** A revision for an AWS Lambda or Amazon ECS deployment that is a YAML-formatted or JSON-formatted string. For AWS Lambda and Amazon ECS deployments, the revision is the same as the AppSpec file. This method replaces the deprecated <code>RawString</code> data type.
    */
  @js.native
  trait AppSpecContent extends js.Object {
    var content: js.UndefOr[RawStringContent]
    var sha256: js.UndefOr[RawStringSha256]
  }

  object AppSpecContent {
    @inline
    def apply(
        content: js.UndefOr[RawStringContent] = js.undefined,
        sha256: js.UndefOr[RawStringSha256] = js.undefined
    ): AppSpecContent = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      sha256.foreach(__v => __obj.updateDynamic("sha256")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppSpecContent]
    }
  }

  /** Information about an application.
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
    @inline
    def apply(
        applicationId: js.UndefOr[ApplicationId] = js.undefined,
        applicationName: js.UndefOr[ApplicationName] = js.undefined,
        computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
        createTime: js.UndefOr[Timestamp] = js.undefined,
        gitHubAccountName: js.UndefOr[GitHubAccountTokenName] = js.undefined,
        linkedToGitHub: js.UndefOr[Boolean] = js.undefined
    ): ApplicationInfo = {
      val __obj = js.Dynamic.literal()
      applicationId.foreach(__v => __obj.updateDynamic("applicationId")(__v.asInstanceOf[js.Any]))
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      computePlatform.foreach(__v => __obj.updateDynamic("computePlatform")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      gitHubAccountName.foreach(__v => __obj.updateDynamic("gitHubAccountName")(__v.asInstanceOf[js.Any]))
      linkedToGitHub.foreach(__v => __obj.updateDynamic("linkedToGitHub")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationInfo]
    }
  }

  @js.native
  sealed trait ApplicationRevisionSortBy extends js.Any
  object ApplicationRevisionSortBy {
    val registerTime = "registerTime".asInstanceOf[ApplicationRevisionSortBy]
    val firstUsedTime = "firstUsedTime".asInstanceOf[ApplicationRevisionSortBy]
    val lastUsedTime = "lastUsedTime".asInstanceOf[ApplicationRevisionSortBy]

    @inline def values = js.Array(registerTime, firstUsedTime, lastUsedTime)
  }

  /** Information about a configuration for automatically rolling back to a previous version of an application revision when a deployment is not completed successfully.
    */
  @js.native
  trait AutoRollbackConfiguration extends js.Object {
    var enabled: js.UndefOr[Boolean]
    var events: js.UndefOr[AutoRollbackEventsList]
  }

  object AutoRollbackConfiguration {
    @inline
    def apply(
        enabled: js.UndefOr[Boolean] = js.undefined,
        events: js.UndefOr[AutoRollbackEventsList] = js.undefined
    ): AutoRollbackConfiguration = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      events.foreach(__v => __obj.updateDynamic("events")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoRollbackConfiguration]
    }
  }

  @js.native
  sealed trait AutoRollbackEvent extends js.Any
  object AutoRollbackEvent {
    val DEPLOYMENT_FAILURE = "DEPLOYMENT_FAILURE".asInstanceOf[AutoRollbackEvent]
    val DEPLOYMENT_STOP_ON_ALARM = "DEPLOYMENT_STOP_ON_ALARM".asInstanceOf[AutoRollbackEvent]
    val DEPLOYMENT_STOP_ON_REQUEST = "DEPLOYMENT_STOP_ON_REQUEST".asInstanceOf[AutoRollbackEvent]

    @inline def values = js.Array(DEPLOYMENT_FAILURE, DEPLOYMENT_STOP_ON_ALARM, DEPLOYMENT_STOP_ON_REQUEST)
  }

  /** Information about an Auto Scaling group.
    */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var hook: js.UndefOr[AutoScalingGroupHook]
    var name: js.UndefOr[AutoScalingGroupName]
  }

  object AutoScalingGroup {
    @inline
    def apply(
        hook: js.UndefOr[AutoScalingGroupHook] = js.undefined,
        name: js.UndefOr[AutoScalingGroupName] = js.undefined
    ): AutoScalingGroup = {
      val __obj = js.Dynamic.literal()
      hook.foreach(__v => __obj.updateDynamic("hook")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroup]
    }
  }

  /** Represents the input of a <code>BatchGetApplicationRevisions</code> operation.
    */
  @js.native
  trait BatchGetApplicationRevisionsInput extends js.Object {
    var applicationName: ApplicationName
    var revisions: RevisionLocationList
  }

  object BatchGetApplicationRevisionsInput {
    @inline
    def apply(
        applicationName: ApplicationName,
        revisions: RevisionLocationList
    ): BatchGetApplicationRevisionsInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "revisions" -> revisions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetApplicationRevisionsInput]
    }
  }

  /** Represents the output of a <code>BatchGetApplicationRevisions</code> operation.
    */
  @js.native
  trait BatchGetApplicationRevisionsOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var errorMessage: js.UndefOr[ErrorMessage]
    var revisions: js.UndefOr[RevisionInfoList]
  }

  object BatchGetApplicationRevisionsOutput {
    @inline
    def apply(
        applicationName: js.UndefOr[ApplicationName] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        revisions: js.UndefOr[RevisionInfoList] = js.undefined
    ): BatchGetApplicationRevisionsOutput = {
      val __obj = js.Dynamic.literal()
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      revisions.foreach(__v => __obj.updateDynamic("revisions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetApplicationRevisionsOutput]
    }
  }

  /** Represents the input of a <code>BatchGetApplications</code> operation.
    */
  @js.native
  trait BatchGetApplicationsInput extends js.Object {
    var applicationNames: ApplicationsList
  }

  object BatchGetApplicationsInput {
    @inline
    def apply(
        applicationNames: ApplicationsList
    ): BatchGetApplicationsInput = {
      val __obj = js.Dynamic.literal(
        "applicationNames" -> applicationNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetApplicationsInput]
    }
  }

  /** Represents the output of a <code>BatchGetApplications</code> operation.
    */
  @js.native
  trait BatchGetApplicationsOutput extends js.Object {
    var applicationsInfo: js.UndefOr[ApplicationsInfoList]
  }

  object BatchGetApplicationsOutput {
    @inline
    def apply(
        applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.undefined
    ): BatchGetApplicationsOutput = {
      val __obj = js.Dynamic.literal()
      applicationsInfo.foreach(__v => __obj.updateDynamic("applicationsInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetApplicationsOutput]
    }
  }

  /** Represents the input of a <code>BatchGetDeploymentGroups</code> operation.
    */
  @js.native
  trait BatchGetDeploymentGroupsInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupNames: DeploymentGroupsList
  }

  object BatchGetDeploymentGroupsInput {
    @inline
    def apply(
        applicationName: ApplicationName,
        deploymentGroupNames: DeploymentGroupsList
    ): BatchGetDeploymentGroupsInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "deploymentGroupNames" -> deploymentGroupNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetDeploymentGroupsInput]
    }
  }

  /** Represents the output of a <code>BatchGetDeploymentGroups</code> operation.
    */
  @js.native
  trait BatchGetDeploymentGroupsOutput extends js.Object {
    var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchGetDeploymentGroupsOutput {
    @inline
    def apply(
        deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): BatchGetDeploymentGroupsOutput = {
      val __obj = js.Dynamic.literal()
      deploymentGroupsInfo.foreach(__v => __obj.updateDynamic("deploymentGroupsInfo")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDeploymentGroupsOutput]
    }
  }

  /** Represents the input of a <code>BatchGetDeploymentInstances</code> operation.
    */
  @js.native
  trait BatchGetDeploymentInstancesInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceIds: InstancesList
  }

  object BatchGetDeploymentInstancesInput {
    @inline
    def apply(
        deploymentId: DeploymentId,
        instanceIds: InstancesList
    ): BatchGetDeploymentInstancesInput = {
      val __obj = js.Dynamic.literal(
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "instanceIds" -> instanceIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetDeploymentInstancesInput]
    }
  }

  /** Represents the output of a <code>BatchGetDeploymentInstances</code> operation.
    */
  @js.native
  trait BatchGetDeploymentInstancesOutput extends js.Object {
    var errorMessage: js.UndefOr[ErrorMessage]
    var instancesSummary: js.UndefOr[InstanceSummaryList]
  }

  object BatchGetDeploymentInstancesOutput {
    @inline
    def apply(
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        instancesSummary: js.UndefOr[InstanceSummaryList] = js.undefined
    ): BatchGetDeploymentInstancesOutput = {
      val __obj = js.Dynamic.literal()
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      instancesSummary.foreach(__v => __obj.updateDynamic("instancesSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDeploymentInstancesOutput]
    }
  }

  @js.native
  trait BatchGetDeploymentTargetsInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var targetIds: js.UndefOr[TargetIdList]
  }

  object BatchGetDeploymentTargetsInput {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        targetIds: js.UndefOr[TargetIdList] = js.undefined
    ): BatchGetDeploymentTargetsInput = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      targetIds.foreach(__v => __obj.updateDynamic("targetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDeploymentTargetsInput]
    }
  }

  @js.native
  trait BatchGetDeploymentTargetsOutput extends js.Object {
    var deploymentTargets: js.UndefOr[DeploymentTargetList]
  }

  object BatchGetDeploymentTargetsOutput {
    @inline
    def apply(
        deploymentTargets: js.UndefOr[DeploymentTargetList] = js.undefined
    ): BatchGetDeploymentTargetsOutput = {
      val __obj = js.Dynamic.literal()
      deploymentTargets.foreach(__v => __obj.updateDynamic("deploymentTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDeploymentTargetsOutput]
    }
  }

  /** Represents the input of a <code>BatchGetDeployments</code> operation.
    */
  @js.native
  trait BatchGetDeploymentsInput extends js.Object {
    var deploymentIds: DeploymentsList
  }

  object BatchGetDeploymentsInput {
    @inline
    def apply(
        deploymentIds: DeploymentsList
    ): BatchGetDeploymentsInput = {
      val __obj = js.Dynamic.literal(
        "deploymentIds" -> deploymentIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetDeploymentsInput]
    }
  }

  /** Represents the output of a <code>BatchGetDeployments</code> operation.
    */
  @js.native
  trait BatchGetDeploymentsOutput extends js.Object {
    var deploymentsInfo: js.UndefOr[DeploymentsInfoList]
  }

  object BatchGetDeploymentsOutput {
    @inline
    def apply(
        deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.undefined
    ): BatchGetDeploymentsOutput = {
      val __obj = js.Dynamic.literal()
      deploymentsInfo.foreach(__v => __obj.updateDynamic("deploymentsInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDeploymentsOutput]
    }
  }

  /** Represents the input of a <code>BatchGetOnPremisesInstances</code> operation.
    */
  @js.native
  trait BatchGetOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
  }

  object BatchGetOnPremisesInstancesInput {
    @inline
    def apply(
        instanceNames: InstanceNameList
    ): BatchGetOnPremisesInstancesInput = {
      val __obj = js.Dynamic.literal(
        "instanceNames" -> instanceNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetOnPremisesInstancesInput]
    }
  }

  /** Represents the output of a <code>BatchGetOnPremisesInstances</code> operation.
    */
  @js.native
  trait BatchGetOnPremisesInstancesOutput extends js.Object {
    var instanceInfos: js.UndefOr[InstanceInfoList]
  }

  object BatchGetOnPremisesInstancesOutput {
    @inline
    def apply(
        instanceInfos: js.UndefOr[InstanceInfoList] = js.undefined
    ): BatchGetOnPremisesInstancesOutput = {
      val __obj = js.Dynamic.literal()
      instanceInfos.foreach(__v => __obj.updateDynamic("instanceInfos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetOnPremisesInstancesOutput]
    }
  }

  /** Information about blue/green deployment options for a deployment group.
    */
  @js.native
  trait BlueGreenDeploymentConfiguration extends js.Object {
    var deploymentReadyOption: js.UndefOr[DeploymentReadyOption]
    var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption]
    var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption]
  }

  object BlueGreenDeploymentConfiguration {
    @inline
    def apply(
        deploymentReadyOption: js.UndefOr[DeploymentReadyOption] = js.undefined,
        greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption] = js.undefined,
        terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption] = js.undefined
    ): BlueGreenDeploymentConfiguration = {
      val __obj = js.Dynamic.literal()
      deploymentReadyOption.foreach(__v => __obj.updateDynamic("deploymentReadyOption")(__v.asInstanceOf[js.Any]))
      greenFleetProvisioningOption.foreach(__v => __obj.updateDynamic("greenFleetProvisioningOption")(__v.asInstanceOf[js.Any]))
      terminateBlueInstancesOnDeploymentSuccess.foreach(__v => __obj.updateDynamic("terminateBlueInstancesOnDeploymentSuccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlueGreenDeploymentConfiguration]
    }
  }

  /** Information about whether instances in the original environment are terminated when a blue/green deployment is successful. <code>BlueInstanceTerminationOption</code> does not apply to Lambda deployments.
    */
  @js.native
  trait BlueInstanceTerminationOption extends js.Object {
    var action: js.UndefOr[InstanceAction]
    var terminationWaitTimeInMinutes: js.UndefOr[Duration]
  }

  object BlueInstanceTerminationOption {
    @inline
    def apply(
        action: js.UndefOr[InstanceAction] = js.undefined,
        terminationWaitTimeInMinutes: js.UndefOr[Duration] = js.undefined
    ): BlueInstanceTerminationOption = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      terminationWaitTimeInMinutes.foreach(__v => __obj.updateDynamic("terminationWaitTimeInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlueInstanceTerminationOption]
    }
  }

  @js.native
  sealed trait BundleType extends js.Any
  object BundleType {
    val tar = "tar".asInstanceOf[BundleType]
    val tgz = "tgz".asInstanceOf[BundleType]
    val zip = "zip".asInstanceOf[BundleType]
    val YAML = "YAML".asInstanceOf[BundleType]
    val JSON = "JSON".asInstanceOf[BundleType]

    @inline def values = js.Array(tar, tgz, zip, YAML, JSON)
  }

  /** Information about the target to be updated by an AWS CloudFormation blue/green deployment. This target type is used for all deployments initiated by a CloudFormation stack update.
    */
  @js.native
  trait CloudFormationTarget extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lastUpdatedAt: js.UndefOr[Time]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var resourceType: js.UndefOr[CloudFormationResourceType]
    var status: js.UndefOr[TargetStatus]
    var targetId: js.UndefOr[TargetId]
    var targetVersionWeight: js.UndefOr[TrafficWeight]
  }

  object CloudFormationTarget {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        lastUpdatedAt: js.UndefOr[Time] = js.undefined,
        lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
        resourceType: js.UndefOr[CloudFormationResourceType] = js.undefined,
        status: js.UndefOr[TargetStatus] = js.undefined,
        targetId: js.UndefOr[TargetId] = js.undefined,
        targetVersionWeight: js.UndefOr[TrafficWeight] = js.undefined
    ): CloudFormationTarget = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lifecycleEvents.foreach(__v => __obj.updateDynamic("lifecycleEvents")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetId.foreach(__v => __obj.updateDynamic("targetId")(__v.asInstanceOf[js.Any]))
      targetVersionWeight.foreach(__v => __obj.updateDynamic("targetVersionWeight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFormationTarget]
    }
  }

  @js.native
  sealed trait ComputePlatform extends js.Any
  object ComputePlatform {
    val Server = "Server".asInstanceOf[ComputePlatform]
    val Lambda = "Lambda".asInstanceOf[ComputePlatform]
    val ECS = "ECS".asInstanceOf[ComputePlatform]

    @inline def values = js.Array(Server, Lambda, ECS)
  }

  @js.native
  trait ContinueDeploymentInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var deploymentWaitType: js.UndefOr[DeploymentWaitType]
  }

  object ContinueDeploymentInput {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        deploymentWaitType: js.UndefOr[DeploymentWaitType] = js.undefined
    ): ContinueDeploymentInput = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      deploymentWaitType.foreach(__v => __obj.updateDynamic("deploymentWaitType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContinueDeploymentInput]
    }
  }

  /** Represents the input of a <code>CreateApplication</code> operation.
    */
  @js.native
  trait CreateApplicationInput extends js.Object {
    var applicationName: ApplicationName
    var computePlatform: js.UndefOr[ComputePlatform]
    var tags: js.UndefOr[TagList]
  }

  object CreateApplicationInput {
    @inline
    def apply(
        applicationName: ApplicationName,
        computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateApplicationInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any]
      )

      computePlatform.foreach(__v => __obj.updateDynamic("computePlatform")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationInput]
    }
  }

  /** Represents the output of a <code>CreateApplication</code> operation.
    */
  @js.native
  trait CreateApplicationOutput extends js.Object {
    var applicationId: js.UndefOr[ApplicationId]
  }

  object CreateApplicationOutput {
    @inline
    def apply(
        applicationId: js.UndefOr[ApplicationId] = js.undefined
    ): CreateApplicationOutput = {
      val __obj = js.Dynamic.literal()
      applicationId.foreach(__v => __obj.updateDynamic("applicationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationOutput]
    }
  }

  /** Represents the input of a <code>CreateDeploymentConfig</code> operation.
    */
  @js.native
  trait CreateDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
    var computePlatform: js.UndefOr[ComputePlatform]
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts]
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig]
  }

  object CreateDeploymentConfigInput {
    @inline
    def apply(
        deploymentConfigName: DeploymentConfigName,
        computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
        minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined,
        trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined
    ): CreateDeploymentConfigInput = {
      val __obj = js.Dynamic.literal(
        "deploymentConfigName" -> deploymentConfigName.asInstanceOf[js.Any]
      )

      computePlatform.foreach(__v => __obj.updateDynamic("computePlatform")(__v.asInstanceOf[js.Any]))
      minimumHealthyHosts.foreach(__v => __obj.updateDynamic("minimumHealthyHosts")(__v.asInstanceOf[js.Any]))
      trafficRoutingConfig.foreach(__v => __obj.updateDynamic("trafficRoutingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentConfigInput]
    }
  }

  /** Represents the output of a <code>CreateDeploymentConfig</code> operation.
    */
  @js.native
  trait CreateDeploymentConfigOutput extends js.Object {
    var deploymentConfigId: js.UndefOr[DeploymentConfigId]
  }

  object CreateDeploymentConfigOutput {
    @inline
    def apply(
        deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined
    ): CreateDeploymentConfigOutput = {
      val __obj = js.Dynamic.literal()
      deploymentConfigId.foreach(__v => __obj.updateDynamic("deploymentConfigId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentConfigOutput]
    }
  }

  /** Represents the input of a <code>CreateDeploymentGroup</code> operation.
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
    var outdatedInstancesStrategy: js.UndefOr[OutdatedInstancesStrategy]
    var tags: js.UndefOr[TagList]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
  }

  object CreateDeploymentGroupInput {
    @inline
    def apply(
        applicationName: ApplicationName,
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
        outdatedInstancesStrategy: js.UndefOr[OutdatedInstancesStrategy] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined
    ): CreateDeploymentGroupInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "deploymentGroupName" -> deploymentGroupName.asInstanceOf[js.Any],
        "serviceRoleArn" -> serviceRoleArn.asInstanceOf[js.Any]
      )

      alarmConfiguration.foreach(__v => __obj.updateDynamic("alarmConfiguration")(__v.asInstanceOf[js.Any]))
      autoRollbackConfiguration.foreach(__v => __obj.updateDynamic("autoRollbackConfiguration")(__v.asInstanceOf[js.Any]))
      autoScalingGroups.foreach(__v => __obj.updateDynamic("autoScalingGroups")(__v.asInstanceOf[js.Any]))
      blueGreenDeploymentConfiguration.foreach(__v => __obj.updateDynamic("blueGreenDeploymentConfiguration")(__v.asInstanceOf[js.Any]))
      deploymentConfigName.foreach(__v => __obj.updateDynamic("deploymentConfigName")(__v.asInstanceOf[js.Any]))
      deploymentStyle.foreach(__v => __obj.updateDynamic("deploymentStyle")(__v.asInstanceOf[js.Any]))
      ec2TagFilters.foreach(__v => __obj.updateDynamic("ec2TagFilters")(__v.asInstanceOf[js.Any]))
      ec2TagSet.foreach(__v => __obj.updateDynamic("ec2TagSet")(__v.asInstanceOf[js.Any]))
      ecsServices.foreach(__v => __obj.updateDynamic("ecsServices")(__v.asInstanceOf[js.Any]))
      loadBalancerInfo.foreach(__v => __obj.updateDynamic("loadBalancerInfo")(__v.asInstanceOf[js.Any]))
      onPremisesInstanceTagFilters.foreach(__v => __obj.updateDynamic("onPremisesInstanceTagFilters")(__v.asInstanceOf[js.Any]))
      onPremisesTagSet.foreach(__v => __obj.updateDynamic("onPremisesTagSet")(__v.asInstanceOf[js.Any]))
      outdatedInstancesStrategy.foreach(__v => __obj.updateDynamic("outdatedInstancesStrategy")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      triggerConfigurations.foreach(__v => __obj.updateDynamic("triggerConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentGroupInput]
    }
  }

  /** Represents the output of a <code>CreateDeploymentGroup</code> operation.
    */
  @js.native
  trait CreateDeploymentGroupOutput extends js.Object {
    var deploymentGroupId: js.UndefOr[DeploymentGroupId]
  }

  object CreateDeploymentGroupOutput {
    @inline
    def apply(
        deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined
    ): CreateDeploymentGroupOutput = {
      val __obj = js.Dynamic.literal()
      deploymentGroupId.foreach(__v => __obj.updateDynamic("deploymentGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentGroupOutput]
    }
  }

  /** Represents the input of a <code>CreateDeployment</code> operation.
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
    @inline
    def apply(
        applicationName: ApplicationName,
        autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined,
        deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
        deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined,
        ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
        revision: js.UndefOr[RevisionLocation] = js.undefined,
        targetInstances: js.UndefOr[TargetInstances] = js.undefined,
        updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined
    ): CreateDeploymentInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any]
      )

      autoRollbackConfiguration.foreach(__v => __obj.updateDynamic("autoRollbackConfiguration")(__v.asInstanceOf[js.Any]))
      deploymentConfigName.foreach(__v => __obj.updateDynamic("deploymentConfigName")(__v.asInstanceOf[js.Any]))
      deploymentGroupName.foreach(__v => __obj.updateDynamic("deploymentGroupName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      fileExistsBehavior.foreach(__v => __obj.updateDynamic("fileExistsBehavior")(__v.asInstanceOf[js.Any]))
      ignoreApplicationStopFailures.foreach(__v => __obj.updateDynamic("ignoreApplicationStopFailures")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      targetInstances.foreach(__v => __obj.updateDynamic("targetInstances")(__v.asInstanceOf[js.Any]))
      updateOutdatedInstancesOnly.foreach(__v => __obj.updateDynamic("updateOutdatedInstancesOnly")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentInput]
    }
  }

  /** Represents the output of a <code>CreateDeployment</code> operation.
    */
  @js.native
  trait CreateDeploymentOutput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  object CreateDeploymentOutput {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined
    ): CreateDeploymentOutput = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentOutput]
    }
  }

  /** Represents the input of a <code>DeleteApplication</code> operation.
    */
  @js.native
  trait DeleteApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  object DeleteApplicationInput {
    @inline
    def apply(
        applicationName: ApplicationName
    ): DeleteApplicationInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationInput]
    }
  }

  /** Represents the input of a <code>DeleteDeploymentConfig</code> operation.
    */
  @js.native
  trait DeleteDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
  }

  object DeleteDeploymentConfigInput {
    @inline
    def apply(
        deploymentConfigName: DeploymentConfigName
    ): DeleteDeploymentConfigInput = {
      val __obj = js.Dynamic.literal(
        "deploymentConfigName" -> deploymentConfigName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDeploymentConfigInput]
    }
  }

  /** Represents the input of a <code>DeleteDeploymentGroup</code> operation.
    */
  @js.native
  trait DeleteDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
  }

  object DeleteDeploymentGroupInput {
    @inline
    def apply(
        applicationName: ApplicationName,
        deploymentGroupName: DeploymentGroupName
    ): DeleteDeploymentGroupInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "deploymentGroupName" -> deploymentGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDeploymentGroupInput]
    }
  }

  /** Represents the output of a <code>DeleteDeploymentGroup</code> operation.
    */
  @js.native
  trait DeleteDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList]
  }

  object DeleteDeploymentGroupOutput {
    @inline
    def apply(
        hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
    ): DeleteDeploymentGroupOutput = {
      val __obj = js.Dynamic.literal()
      hooksNotCleanedUp.foreach(__v => __obj.updateDynamic("hooksNotCleanedUp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDeploymentGroupOutput]
    }
  }

  /** Represents the input of a <code>DeleteGitHubAccount</code> operation.
    */
  @js.native
  trait DeleteGitHubAccountTokenInput extends js.Object {
    var tokenName: js.UndefOr[GitHubAccountTokenName]
  }

  object DeleteGitHubAccountTokenInput {
    @inline
    def apply(
        tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
    ): DeleteGitHubAccountTokenInput = {
      val __obj = js.Dynamic.literal()
      tokenName.foreach(__v => __obj.updateDynamic("tokenName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGitHubAccountTokenInput]
    }
  }

  /** Represents the output of a <code>DeleteGitHubAccountToken</code> operation.
    */
  @js.native
  trait DeleteGitHubAccountTokenOutput extends js.Object {
    var tokenName: js.UndefOr[GitHubAccountTokenName]
  }

  object DeleteGitHubAccountTokenOutput {
    @inline
    def apply(
        tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
    ): DeleteGitHubAccountTokenOutput = {
      val __obj = js.Dynamic.literal()
      tokenName.foreach(__v => __obj.updateDynamic("tokenName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGitHubAccountTokenOutput]
    }
  }

  @js.native
  trait DeleteResourcesByExternalIdInput extends js.Object {
    var externalId: js.UndefOr[ExternalId]
  }

  object DeleteResourcesByExternalIdInput {
    @inline
    def apply(
        externalId: js.UndefOr[ExternalId] = js.undefined
    ): DeleteResourcesByExternalIdInput = {
      val __obj = js.Dynamic.literal()
      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourcesByExternalIdInput]
    }
  }

  @js.native
  trait DeleteResourcesByExternalIdOutput extends js.Object

  object DeleteResourcesByExternalIdOutput {
    @inline
    def apply(): DeleteResourcesByExternalIdOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourcesByExternalIdOutput]
    }
  }

  /** Information about a deployment configuration.
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
    @inline
    def apply(
        computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
        createTime: js.UndefOr[Timestamp] = js.undefined,
        deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined,
        deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
        minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined,
        trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined
    ): DeploymentConfigInfo = {
      val __obj = js.Dynamic.literal()
      computePlatform.foreach(__v => __obj.updateDynamic("computePlatform")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      deploymentConfigId.foreach(__v => __obj.updateDynamic("deploymentConfigId")(__v.asInstanceOf[js.Any]))
      deploymentConfigName.foreach(__v => __obj.updateDynamic("deploymentConfigName")(__v.asInstanceOf[js.Any]))
      minimumHealthyHosts.foreach(__v => __obj.updateDynamic("minimumHealthyHosts")(__v.asInstanceOf[js.Any]))
      trafficRoutingConfig.foreach(__v => __obj.updateDynamic("trafficRoutingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentConfigInfo]
    }
  }

  @js.native
  sealed trait DeploymentCreator extends js.Any
  object DeploymentCreator {
    val user = "user".asInstanceOf[DeploymentCreator]
    val autoscaling = "autoscaling".asInstanceOf[DeploymentCreator]
    val codeDeployRollback = "codeDeployRollback".asInstanceOf[DeploymentCreator]
    val CodeDeploy = "CodeDeploy".asInstanceOf[DeploymentCreator]
    val CodeDeployAutoUpdate = "CodeDeployAutoUpdate".asInstanceOf[DeploymentCreator]
    val CloudFormation = "CloudFormation".asInstanceOf[DeploymentCreator]
    val CloudFormationRollback = "CloudFormationRollback".asInstanceOf[DeploymentCreator]

    @inline def values = js.Array(user, autoscaling, codeDeployRollback, CodeDeploy, CodeDeployAutoUpdate, CloudFormation, CloudFormationRollback)
  }

  /** Information about a deployment group.
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
    var outdatedInstancesStrategy: js.UndefOr[OutdatedInstancesStrategy]
    var serviceRoleArn: js.UndefOr[Role]
    var targetRevision: js.UndefOr[RevisionLocation]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
  }

  object DeploymentGroupInfo {
    @inline
    def apply(
        alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined,
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
        outdatedInstancesStrategy: js.UndefOr[OutdatedInstancesStrategy] = js.undefined,
        serviceRoleArn: js.UndefOr[Role] = js.undefined,
        targetRevision: js.UndefOr[RevisionLocation] = js.undefined,
        triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined
    ): DeploymentGroupInfo = {
      val __obj = js.Dynamic.literal()
      alarmConfiguration.foreach(__v => __obj.updateDynamic("alarmConfiguration")(__v.asInstanceOf[js.Any]))
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      autoRollbackConfiguration.foreach(__v => __obj.updateDynamic("autoRollbackConfiguration")(__v.asInstanceOf[js.Any]))
      autoScalingGroups.foreach(__v => __obj.updateDynamic("autoScalingGroups")(__v.asInstanceOf[js.Any]))
      blueGreenDeploymentConfiguration.foreach(__v => __obj.updateDynamic("blueGreenDeploymentConfiguration")(__v.asInstanceOf[js.Any]))
      computePlatform.foreach(__v => __obj.updateDynamic("computePlatform")(__v.asInstanceOf[js.Any]))
      deploymentConfigName.foreach(__v => __obj.updateDynamic("deploymentConfigName")(__v.asInstanceOf[js.Any]))
      deploymentGroupId.foreach(__v => __obj.updateDynamic("deploymentGroupId")(__v.asInstanceOf[js.Any]))
      deploymentGroupName.foreach(__v => __obj.updateDynamic("deploymentGroupName")(__v.asInstanceOf[js.Any]))
      deploymentStyle.foreach(__v => __obj.updateDynamic("deploymentStyle")(__v.asInstanceOf[js.Any]))
      ec2TagFilters.foreach(__v => __obj.updateDynamic("ec2TagFilters")(__v.asInstanceOf[js.Any]))
      ec2TagSet.foreach(__v => __obj.updateDynamic("ec2TagSet")(__v.asInstanceOf[js.Any]))
      ecsServices.foreach(__v => __obj.updateDynamic("ecsServices")(__v.asInstanceOf[js.Any]))
      lastAttemptedDeployment.foreach(__v => __obj.updateDynamic("lastAttemptedDeployment")(__v.asInstanceOf[js.Any]))
      lastSuccessfulDeployment.foreach(__v => __obj.updateDynamic("lastSuccessfulDeployment")(__v.asInstanceOf[js.Any]))
      loadBalancerInfo.foreach(__v => __obj.updateDynamic("loadBalancerInfo")(__v.asInstanceOf[js.Any]))
      onPremisesInstanceTagFilters.foreach(__v => __obj.updateDynamic("onPremisesInstanceTagFilters")(__v.asInstanceOf[js.Any]))
      onPremisesTagSet.foreach(__v => __obj.updateDynamic("onPremisesTagSet")(__v.asInstanceOf[js.Any]))
      outdatedInstancesStrategy.foreach(__v => __obj.updateDynamic("outdatedInstancesStrategy")(__v.asInstanceOf[js.Any]))
      serviceRoleArn.foreach(__v => __obj.updateDynamic("serviceRoleArn")(__v.asInstanceOf[js.Any]))
      targetRevision.foreach(__v => __obj.updateDynamic("targetRevision")(__v.asInstanceOf[js.Any]))
      triggerConfigurations.foreach(__v => __obj.updateDynamic("triggerConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentGroupInfo]
    }
  }

  /** Information about a deployment.
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
    var externalId: js.UndefOr[ExternalId]
    var fileExistsBehavior: js.UndefOr[FileExistsBehavior]
    var ignoreApplicationStopFailures: js.UndefOr[Boolean]
    var instanceTerminationWaitTimeStarted: js.UndefOr[Boolean]
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo]
    var previousRevision: js.UndefOr[RevisionLocation]
    var relatedDeployments: js.UndefOr[RelatedDeployments]
    var revision: js.UndefOr[RevisionLocation]
    var rollbackInfo: js.UndefOr[RollbackInfo]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DeploymentStatus]
    var targetInstances: js.UndefOr[TargetInstances]
    var updateOutdatedInstancesOnly: js.UndefOr[Boolean]
  }

  object DeploymentInfo {
    @inline
    def apply(
        additionalDeploymentStatusInfo: js.UndefOr[AdditionalDeploymentStatusInfo] = js.undefined,
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
        externalId: js.UndefOr[ExternalId] = js.undefined,
        fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined,
        ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
        instanceTerminationWaitTimeStarted: js.UndefOr[Boolean] = js.undefined,
        loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined,
        previousRevision: js.UndefOr[RevisionLocation] = js.undefined,
        relatedDeployments: js.UndefOr[RelatedDeployments] = js.undefined,
        revision: js.UndefOr[RevisionLocation] = js.undefined,
        rollbackInfo: js.UndefOr[RollbackInfo] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[DeploymentStatus] = js.undefined,
        targetInstances: js.UndefOr[TargetInstances] = js.undefined,
        updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined
    ): DeploymentInfo = {
      val __obj = js.Dynamic.literal()
      additionalDeploymentStatusInfo.foreach(__v => __obj.updateDynamic("additionalDeploymentStatusInfo")(__v.asInstanceOf[js.Any]))
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      autoRollbackConfiguration.foreach(__v => __obj.updateDynamic("autoRollbackConfiguration")(__v.asInstanceOf[js.Any]))
      blueGreenDeploymentConfiguration.foreach(__v => __obj.updateDynamic("blueGreenDeploymentConfiguration")(__v.asInstanceOf[js.Any]))
      completeTime.foreach(__v => __obj.updateDynamic("completeTime")(__v.asInstanceOf[js.Any]))
      computePlatform.foreach(__v => __obj.updateDynamic("computePlatform")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      creator.foreach(__v => __obj.updateDynamic("creator")(__v.asInstanceOf[js.Any]))
      deploymentConfigName.foreach(__v => __obj.updateDynamic("deploymentConfigName")(__v.asInstanceOf[js.Any]))
      deploymentGroupName.foreach(__v => __obj.updateDynamic("deploymentGroupName")(__v.asInstanceOf[js.Any]))
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      deploymentOverview.foreach(__v => __obj.updateDynamic("deploymentOverview")(__v.asInstanceOf[js.Any]))
      deploymentStatusMessages.foreach(__v => __obj.updateDynamic("deploymentStatusMessages")(__v.asInstanceOf[js.Any]))
      deploymentStyle.foreach(__v => __obj.updateDynamic("deploymentStyle")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      errorInformation.foreach(__v => __obj.updateDynamic("errorInformation")(__v.asInstanceOf[js.Any]))
      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      fileExistsBehavior.foreach(__v => __obj.updateDynamic("fileExistsBehavior")(__v.asInstanceOf[js.Any]))
      ignoreApplicationStopFailures.foreach(__v => __obj.updateDynamic("ignoreApplicationStopFailures")(__v.asInstanceOf[js.Any]))
      instanceTerminationWaitTimeStarted.foreach(__v => __obj.updateDynamic("instanceTerminationWaitTimeStarted")(__v.asInstanceOf[js.Any]))
      loadBalancerInfo.foreach(__v => __obj.updateDynamic("loadBalancerInfo")(__v.asInstanceOf[js.Any]))
      previousRevision.foreach(__v => __obj.updateDynamic("previousRevision")(__v.asInstanceOf[js.Any]))
      relatedDeployments.foreach(__v => __obj.updateDynamic("relatedDeployments")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      rollbackInfo.foreach(__v => __obj.updateDynamic("rollbackInfo")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetInstances.foreach(__v => __obj.updateDynamic("targetInstances")(__v.asInstanceOf[js.Any]))
      updateOutdatedInstancesOnly.foreach(__v => __obj.updateDynamic("updateOutdatedInstancesOnly")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentInfo]
    }
  }

  @js.native
  sealed trait DeploymentOption extends js.Any
  object DeploymentOption {
    val WITH_TRAFFIC_CONTROL = "WITH_TRAFFIC_CONTROL".asInstanceOf[DeploymentOption]
    val WITHOUT_TRAFFIC_CONTROL = "WITHOUT_TRAFFIC_CONTROL".asInstanceOf[DeploymentOption]

    @inline def values = js.Array(WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL)
  }

  /** Information about the deployment status of the instances in the deployment.
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
    @inline
    def apply(
        Failed: js.UndefOr[InstanceCount] = js.undefined,
        InProgress: js.UndefOr[InstanceCount] = js.undefined,
        Pending: js.UndefOr[InstanceCount] = js.undefined,
        Ready: js.UndefOr[InstanceCount] = js.undefined,
        Skipped: js.UndefOr[InstanceCount] = js.undefined,
        Succeeded: js.UndefOr[InstanceCount] = js.undefined
    ): DeploymentOverview = {
      val __obj = js.Dynamic.literal()
      Failed.foreach(__v => __obj.updateDynamic("Failed")(__v.asInstanceOf[js.Any]))
      InProgress.foreach(__v => __obj.updateDynamic("InProgress")(__v.asInstanceOf[js.Any]))
      Pending.foreach(__v => __obj.updateDynamic("Pending")(__v.asInstanceOf[js.Any]))
      Ready.foreach(__v => __obj.updateDynamic("Ready")(__v.asInstanceOf[js.Any]))
      Skipped.foreach(__v => __obj.updateDynamic("Skipped")(__v.asInstanceOf[js.Any]))
      Succeeded.foreach(__v => __obj.updateDynamic("Succeeded")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentOverview]
    }
  }

  @js.native
  sealed trait DeploymentReadyAction extends js.Any
  object DeploymentReadyAction {
    val CONTINUE_DEPLOYMENT = "CONTINUE_DEPLOYMENT".asInstanceOf[DeploymentReadyAction]
    val STOP_DEPLOYMENT = "STOP_DEPLOYMENT".asInstanceOf[DeploymentReadyAction]

    @inline def values = js.Array(CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT)
  }

  /** Information about how traffic is rerouted to instances in a replacement environment in a blue/green deployment.
    */
  @js.native
  trait DeploymentReadyOption extends js.Object {
    var actionOnTimeout: js.UndefOr[DeploymentReadyAction]
    var waitTimeInMinutes: js.UndefOr[Duration]
  }

  object DeploymentReadyOption {
    @inline
    def apply(
        actionOnTimeout: js.UndefOr[DeploymentReadyAction] = js.undefined,
        waitTimeInMinutes: js.UndefOr[Duration] = js.undefined
    ): DeploymentReadyOption = {
      val __obj = js.Dynamic.literal()
      actionOnTimeout.foreach(__v => __obj.updateDynamic("actionOnTimeout")(__v.asInstanceOf[js.Any]))
      waitTimeInMinutes.foreach(__v => __obj.updateDynamic("waitTimeInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentReadyOption]
    }
  }

  @js.native
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus {
    val Created = "Created".asInstanceOf[DeploymentStatus]
    val Queued = "Queued".asInstanceOf[DeploymentStatus]
    val InProgress = "InProgress".asInstanceOf[DeploymentStatus]
    val Baking = "Baking".asInstanceOf[DeploymentStatus]
    val Succeeded = "Succeeded".asInstanceOf[DeploymentStatus]
    val Failed = "Failed".asInstanceOf[DeploymentStatus]
    val Stopped = "Stopped".asInstanceOf[DeploymentStatus]
    val Ready = "Ready".asInstanceOf[DeploymentStatus]

    @inline def values = js.Array(Created, Queued, InProgress, Baking, Succeeded, Failed, Stopped, Ready)
  }

  /** Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  @js.native
  trait DeploymentStyle extends js.Object {
    var deploymentOption: js.UndefOr[DeploymentOption]
    var deploymentType: js.UndefOr[DeploymentType]
  }

  object DeploymentStyle {
    @inline
    def apply(
        deploymentOption: js.UndefOr[DeploymentOption] = js.undefined,
        deploymentType: js.UndefOr[DeploymentType] = js.undefined
    ): DeploymentStyle = {
      val __obj = js.Dynamic.literal()
      deploymentOption.foreach(__v => __obj.updateDynamic("deploymentOption")(__v.asInstanceOf[js.Any]))
      deploymentType.foreach(__v => __obj.updateDynamic("deploymentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentStyle]
    }
  }

  /** Information about the deployment target.
    */
  @js.native
  trait DeploymentTarget extends js.Object {
    var cloudFormationTarget: js.UndefOr[CloudFormationTarget]
    var deploymentTargetType: js.UndefOr[DeploymentTargetType]
    var ecsTarget: js.UndefOr[ECSTarget]
    var instanceTarget: js.UndefOr[InstanceTarget]
    var lambdaTarget: js.UndefOr[LambdaTarget]
  }

  object DeploymentTarget {
    @inline
    def apply(
        cloudFormationTarget: js.UndefOr[CloudFormationTarget] = js.undefined,
        deploymentTargetType: js.UndefOr[DeploymentTargetType] = js.undefined,
        ecsTarget: js.UndefOr[ECSTarget] = js.undefined,
        instanceTarget: js.UndefOr[InstanceTarget] = js.undefined,
        lambdaTarget: js.UndefOr[LambdaTarget] = js.undefined
    ): DeploymentTarget = {
      val __obj = js.Dynamic.literal()
      cloudFormationTarget.foreach(__v => __obj.updateDynamic("cloudFormationTarget")(__v.asInstanceOf[js.Any]))
      deploymentTargetType.foreach(__v => __obj.updateDynamic("deploymentTargetType")(__v.asInstanceOf[js.Any]))
      ecsTarget.foreach(__v => __obj.updateDynamic("ecsTarget")(__v.asInstanceOf[js.Any]))
      instanceTarget.foreach(__v => __obj.updateDynamic("instanceTarget")(__v.asInstanceOf[js.Any]))
      lambdaTarget.foreach(__v => __obj.updateDynamic("lambdaTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentTarget]
    }
  }

  @js.native
  sealed trait DeploymentTargetType extends js.Any
  object DeploymentTargetType {
    val InstanceTarget = "InstanceTarget".asInstanceOf[DeploymentTargetType]
    val LambdaTarget = "LambdaTarget".asInstanceOf[DeploymentTargetType]
    val ECSTarget = "ECSTarget".asInstanceOf[DeploymentTargetType]
    val CloudFormationTarget = "CloudFormationTarget".asInstanceOf[DeploymentTargetType]

    @inline def values = js.Array(InstanceTarget, LambdaTarget, ECSTarget, CloudFormationTarget)
  }

  @js.native
  sealed trait DeploymentType extends js.Any
  object DeploymentType {
    val IN_PLACE = "IN_PLACE".asInstanceOf[DeploymentType]
    val BLUE_GREEN = "BLUE_GREEN".asInstanceOf[DeploymentType]

    @inline def values = js.Array(IN_PLACE, BLUE_GREEN)
  }

  @js.native
  sealed trait DeploymentWaitType extends js.Any
  object DeploymentWaitType {
    val READY_WAIT = "READY_WAIT".asInstanceOf[DeploymentWaitType]
    val TERMINATION_WAIT = "TERMINATION_WAIT".asInstanceOf[DeploymentWaitType]

    @inline def values = js.Array(READY_WAIT, TERMINATION_WAIT)
  }

  /** Represents the input of a <code>DeregisterOnPremisesInstance</code> operation.
    */
  @js.native
  trait DeregisterOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
  }

  object DeregisterOnPremisesInstanceInput {
    @inline
    def apply(
        instanceName: InstanceName
    ): DeregisterOnPremisesInstanceInput = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterOnPremisesInstanceInput]
    }
  }

  /** Diagnostic information about executable scripts that are part of a deployment.
    */
  @js.native
  trait Diagnostics extends js.Object {
    var errorCode: js.UndefOr[LifecycleErrorCode]
    var logTail: js.UndefOr[LogTail]
    var message: js.UndefOr[LifecycleMessage]
    var scriptName: js.UndefOr[ScriptName]
  }

  object Diagnostics {
    @inline
    def apply(
        errorCode: js.UndefOr[LifecycleErrorCode] = js.undefined,
        logTail: js.UndefOr[LogTail] = js.undefined,
        message: js.UndefOr[LifecycleMessage] = js.undefined,
        scriptName: js.UndefOr[ScriptName] = js.undefined
    ): Diagnostics = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      logTail.foreach(__v => __obj.updateDynamic("logTail")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      scriptName.foreach(__v => __obj.updateDynamic("scriptName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Diagnostics]
    }
  }

  /** Information about an EC2 tag filter.
    */
  @js.native
  trait EC2TagFilter extends js.Object {
    var Key: js.UndefOr[Key]
    var Type: js.UndefOr[EC2TagFilterType]
    var Value: js.UndefOr[Value]
  }

  object EC2TagFilter {
    @inline
    def apply(
        Key: js.UndefOr[Key] = js.undefined,
        Type: js.UndefOr[EC2TagFilterType] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): EC2TagFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2TagFilter]
    }
  }

  @js.native
  sealed trait EC2TagFilterType extends js.Any
  object EC2TagFilterType {
    val KEY_ONLY = "KEY_ONLY".asInstanceOf[EC2TagFilterType]
    val VALUE_ONLY = "VALUE_ONLY".asInstanceOf[EC2TagFilterType]
    val KEY_AND_VALUE = "KEY_AND_VALUE".asInstanceOf[EC2TagFilterType]

    @inline def values = js.Array(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
  }

  /** Information about groups of EC2 instance tags.
    */
  @js.native
  trait EC2TagSet extends js.Object {
    var ec2TagSetList: js.UndefOr[EC2TagSetList]
  }

  object EC2TagSet {
    @inline
    def apply(
        ec2TagSetList: js.UndefOr[EC2TagSetList] = js.undefined
    ): EC2TagSet = {
      val __obj = js.Dynamic.literal()
      ec2TagSetList.foreach(__v => __obj.updateDynamic("ec2TagSetList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2TagSet]
    }
  }

  /** Contains the service and cluster names used to identify an Amazon ECS deployment's target.
    */
  @js.native
  trait ECSService extends js.Object {
    var clusterName: js.UndefOr[ECSClusterName]
    var serviceName: js.UndefOr[ECSServiceName]
  }

  object ECSService {
    @inline
    def apply(
        clusterName: js.UndefOr[ECSClusterName] = js.undefined,
        serviceName: js.UndefOr[ECSServiceName] = js.undefined
    ): ECSService = {
      val __obj = js.Dynamic.literal()
      clusterName.foreach(__v => __obj.updateDynamic("clusterName")(__v.asInstanceOf[js.Any]))
      serviceName.foreach(__v => __obj.updateDynamic("serviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ECSService]
    }
  }

  /** Information about the target of an Amazon ECS deployment.
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
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        lastUpdatedAt: js.UndefOr[Time] = js.undefined,
        lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
        status: js.UndefOr[TargetStatus] = js.undefined,
        targetArn: js.UndefOr[TargetArn] = js.undefined,
        targetId: js.UndefOr[TargetId] = js.undefined,
        taskSetsInfo: js.UndefOr[ECSTaskSetList] = js.undefined
    ): ECSTarget = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lifecycleEvents.foreach(__v => __obj.updateDynamic("lifecycleEvents")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      targetId.foreach(__v => __obj.updateDynamic("targetId")(__v.asInstanceOf[js.Any]))
      taskSetsInfo.foreach(__v => __obj.updateDynamic("taskSetsInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ECSTarget]
    }
  }

  /** Information about a set of Amazon ECS tasks in an AWS CodeDeploy deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic. An AWS CodeDeploy application that uses the Amazon ECS compute platform deploys a containerized application in an Amazon ECS service as a task set.
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
    @inline
    def apply(
        desiredCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
        identifer: js.UndefOr[ECSTaskSetIdentifier] = js.undefined,
        pendingCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
        runningCount: js.UndefOr[ECSTaskSetCount] = js.undefined,
        status: js.UndefOr[ECSTaskSetStatus] = js.undefined,
        targetGroup: js.UndefOr[TargetGroupInfo] = js.undefined,
        taskSetLabel: js.UndefOr[TargetLabel] = js.undefined,
        trafficWeight: js.UndefOr[TrafficWeight] = js.undefined
    ): ECSTaskSet = {
      val __obj = js.Dynamic.literal()
      desiredCount.foreach(__v => __obj.updateDynamic("desiredCount")(__v.asInstanceOf[js.Any]))
      identifer.foreach(__v => __obj.updateDynamic("identifer")(__v.asInstanceOf[js.Any]))
      pendingCount.foreach(__v => __obj.updateDynamic("pendingCount")(__v.asInstanceOf[js.Any]))
      runningCount.foreach(__v => __obj.updateDynamic("runningCount")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetGroup.foreach(__v => __obj.updateDynamic("targetGroup")(__v.asInstanceOf[js.Any]))
      taskSetLabel.foreach(__v => __obj.updateDynamic("taskSetLabel")(__v.asInstanceOf[js.Any]))
      trafficWeight.foreach(__v => __obj.updateDynamic("trafficWeight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ECSTaskSet]
    }
  }

  /** Information about a load balancer in Elastic Load Balancing to use in a deployment. Instances are registered directly with a load balancer, and traffic is routed to the load balancer.
    */
  @js.native
  trait ELBInfo extends js.Object {
    var name: js.UndefOr[ELBName]
  }

  object ELBInfo {
    @inline
    def apply(
        name: js.UndefOr[ELBName] = js.undefined
    ): ELBInfo = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ELBInfo]
    }
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode {
    val AGENT_ISSUE = "AGENT_ISSUE".asInstanceOf[ErrorCode]
    val ALARM_ACTIVE = "ALARM_ACTIVE".asInstanceOf[ErrorCode]
    val APPLICATION_MISSING = "APPLICATION_MISSING".asInstanceOf[ErrorCode]
    val AUTOSCALING_VALIDATION_ERROR = "AUTOSCALING_VALIDATION_ERROR".asInstanceOf[ErrorCode]
    val AUTO_SCALING_CONFIGURATION = "AUTO_SCALING_CONFIGURATION".asInstanceOf[ErrorCode]
    val AUTO_SCALING_IAM_ROLE_PERMISSIONS = "AUTO_SCALING_IAM_ROLE_PERMISSIONS".asInstanceOf[ErrorCode]
    val CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND = "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND".asInstanceOf[ErrorCode]
    val CUSTOMER_APPLICATION_UNHEALTHY = "CUSTOMER_APPLICATION_UNHEALTHY".asInstanceOf[ErrorCode]
    val DEPLOYMENT_GROUP_MISSING = "DEPLOYMENT_GROUP_MISSING".asInstanceOf[ErrorCode]
    val ECS_UPDATE_ERROR = "ECS_UPDATE_ERROR".asInstanceOf[ErrorCode]
    val ELASTIC_LOAD_BALANCING_INVALID = "ELASTIC_LOAD_BALANCING_INVALID".asInstanceOf[ErrorCode]
    val ELB_INVALID_INSTANCE = "ELB_INVALID_INSTANCE".asInstanceOf[ErrorCode]
    val HEALTH_CONSTRAINTS = "HEALTH_CONSTRAINTS".asInstanceOf[ErrorCode]
    val HEALTH_CONSTRAINTS_INVALID = "HEALTH_CONSTRAINTS_INVALID".asInstanceOf[ErrorCode]
    val HOOK_EXECUTION_FAILURE = "HOOK_EXECUTION_FAILURE".asInstanceOf[ErrorCode]
    val IAM_ROLE_MISSING = "IAM_ROLE_MISSING".asInstanceOf[ErrorCode]
    val IAM_ROLE_PERMISSIONS = "IAM_ROLE_PERMISSIONS".asInstanceOf[ErrorCode]
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ErrorCode]
    val INVALID_ECS_SERVICE = "INVALID_ECS_SERVICE".asInstanceOf[ErrorCode]
    val INVALID_LAMBDA_CONFIGURATION = "INVALID_LAMBDA_CONFIGURATION".asInstanceOf[ErrorCode]
    val INVALID_LAMBDA_FUNCTION = "INVALID_LAMBDA_FUNCTION".asInstanceOf[ErrorCode]
    val INVALID_REVISION = "INVALID_REVISION".asInstanceOf[ErrorCode]
    val MANUAL_STOP = "MANUAL_STOP".asInstanceOf[ErrorCode]
    val MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION = "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION".asInstanceOf[ErrorCode]
    val MISSING_ELB_INFORMATION = "MISSING_ELB_INFORMATION".asInstanceOf[ErrorCode]
    val MISSING_GITHUB_TOKEN = "MISSING_GITHUB_TOKEN".asInstanceOf[ErrorCode]
    val NO_EC2_SUBSCRIPTION = "NO_EC2_SUBSCRIPTION".asInstanceOf[ErrorCode]
    val NO_INSTANCES = "NO_INSTANCES".asInstanceOf[ErrorCode]
    val OVER_MAX_INSTANCES = "OVER_MAX_INSTANCES".asInstanceOf[ErrorCode]
    val RESOURCE_LIMIT_EXCEEDED = "RESOURCE_LIMIT_EXCEEDED".asInstanceOf[ErrorCode]
    val REVISION_MISSING = "REVISION_MISSING".asInstanceOf[ErrorCode]
    val THROTTLED = "THROTTLED".asInstanceOf[ErrorCode]
    val TIMEOUT = "TIMEOUT".asInstanceOf[ErrorCode]
    val CLOUDFORMATION_STACK_FAILURE = "CLOUDFORMATION_STACK_FAILURE".asInstanceOf[ErrorCode]

    @inline def values = js.Array(
      AGENT_ISSUE,
      ALARM_ACTIVE,
      APPLICATION_MISSING,
      AUTOSCALING_VALIDATION_ERROR,
      AUTO_SCALING_CONFIGURATION,
      AUTO_SCALING_IAM_ROLE_PERMISSIONS,
      CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND,
      CUSTOMER_APPLICATION_UNHEALTHY,
      DEPLOYMENT_GROUP_MISSING,
      ECS_UPDATE_ERROR,
      ELASTIC_LOAD_BALANCING_INVALID,
      ELB_INVALID_INSTANCE,
      HEALTH_CONSTRAINTS,
      HEALTH_CONSTRAINTS_INVALID,
      HOOK_EXECUTION_FAILURE,
      IAM_ROLE_MISSING,
      IAM_ROLE_PERMISSIONS,
      INTERNAL_ERROR,
      INVALID_ECS_SERVICE,
      INVALID_LAMBDA_CONFIGURATION,
      INVALID_LAMBDA_FUNCTION,
      INVALID_REVISION,
      MANUAL_STOP,
      MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION,
      MISSING_ELB_INFORMATION,
      MISSING_GITHUB_TOKEN,
      NO_EC2_SUBSCRIPTION,
      NO_INSTANCES,
      OVER_MAX_INSTANCES,
      RESOURCE_LIMIT_EXCEEDED,
      REVISION_MISSING,
      THROTTLED,
      TIMEOUT,
      CLOUDFORMATION_STACK_FAILURE
    )
  }

  /** Information about a deployment error.
    */
  @js.native
  trait ErrorInformation extends js.Object {
    var code: js.UndefOr[ErrorCode]
    var message: js.UndefOr[ErrorMessage]
  }

  object ErrorInformation {
    @inline
    def apply(
        code: js.UndefOr[ErrorCode] = js.undefined,
        message: js.UndefOr[ErrorMessage] = js.undefined
    ): ErrorInformation = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorInformation]
    }
  }

  @js.native
  sealed trait FileExistsBehavior extends js.Any
  object FileExistsBehavior {
    val DISALLOW = "DISALLOW".asInstanceOf[FileExistsBehavior]
    val OVERWRITE = "OVERWRITE".asInstanceOf[FileExistsBehavior]
    val RETAIN = "RETAIN".asInstanceOf[FileExistsBehavior]

    @inline def values = js.Array(DISALLOW, OVERWRITE, RETAIN)
  }

  /** Information about an application revision.
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
    @inline
    def apply(
        deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        firstUsedTime: js.UndefOr[Timestamp] = js.undefined,
        lastUsedTime: js.UndefOr[Timestamp] = js.undefined,
        registerTime: js.UndefOr[Timestamp] = js.undefined
    ): GenericRevisionInfo = {
      val __obj = js.Dynamic.literal()
      deploymentGroups.foreach(__v => __obj.updateDynamic("deploymentGroups")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      firstUsedTime.foreach(__v => __obj.updateDynamic("firstUsedTime")(__v.asInstanceOf[js.Any]))
      lastUsedTime.foreach(__v => __obj.updateDynamic("lastUsedTime")(__v.asInstanceOf[js.Any]))
      registerTime.foreach(__v => __obj.updateDynamic("registerTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenericRevisionInfo]
    }
  }

  /** Represents the input of a <code>GetApplication</code> operation.
    */
  @js.native
  trait GetApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  object GetApplicationInput {
    @inline
    def apply(
        applicationName: ApplicationName
    ): GetApplicationInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationInput]
    }
  }

  /** Represents the output of a <code>GetApplication</code> operation.
    */
  @js.native
  trait GetApplicationOutput extends js.Object {
    var application: js.UndefOr[ApplicationInfo]
  }

  object GetApplicationOutput {
    @inline
    def apply(
        application: js.UndefOr[ApplicationInfo] = js.undefined
    ): GetApplicationOutput = {
      val __obj = js.Dynamic.literal()
      application.foreach(__v => __obj.updateDynamic("application")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationOutput]
    }
  }

  /** Represents the input of a <code>GetApplicationRevision</code> operation.
    */
  @js.native
  trait GetApplicationRevisionInput extends js.Object {
    var applicationName: ApplicationName
    var revision: RevisionLocation
  }

  object GetApplicationRevisionInput {
    @inline
    def apply(
        applicationName: ApplicationName,
        revision: RevisionLocation
    ): GetApplicationRevisionInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "revision" -> revision.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationRevisionInput]
    }
  }

  /** Represents the output of a <code>GetApplicationRevision</code> operation.
    */
  @js.native
  trait GetApplicationRevisionOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var revision: js.UndefOr[RevisionLocation]
    var revisionInfo: js.UndefOr[GenericRevisionInfo]
  }

  object GetApplicationRevisionOutput {
    @inline
    def apply(
        applicationName: js.UndefOr[ApplicationName] = js.undefined,
        revision: js.UndefOr[RevisionLocation] = js.undefined,
        revisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined
    ): GetApplicationRevisionOutput = {
      val __obj = js.Dynamic.literal()
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      revisionInfo.foreach(__v => __obj.updateDynamic("revisionInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationRevisionOutput]
    }
  }

  /** Represents the input of a <code>GetDeploymentConfig</code> operation.
    */
  @js.native
  trait GetDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
  }

  object GetDeploymentConfigInput {
    @inline
    def apply(
        deploymentConfigName: DeploymentConfigName
    ): GetDeploymentConfigInput = {
      val __obj = js.Dynamic.literal(
        "deploymentConfigName" -> deploymentConfigName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeploymentConfigInput]
    }
  }

  /** Represents the output of a <code>GetDeploymentConfig</code> operation.
    */
  @js.native
  trait GetDeploymentConfigOutput extends js.Object {
    var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo]
  }

  object GetDeploymentConfigOutput {
    @inline
    def apply(
        deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.undefined
    ): GetDeploymentConfigOutput = {
      val __obj = js.Dynamic.literal()
      deploymentConfigInfo.foreach(__v => __obj.updateDynamic("deploymentConfigInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentConfigOutput]
    }
  }

  /** Represents the input of a <code>GetDeploymentGroup</code> operation.
    */
  @js.native
  trait GetDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
  }

  object GetDeploymentGroupInput {
    @inline
    def apply(
        applicationName: ApplicationName,
        deploymentGroupName: DeploymentGroupName
    ): GetDeploymentGroupInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "deploymentGroupName" -> deploymentGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeploymentGroupInput]
    }
  }

  /** Represents the output of a <code>GetDeploymentGroup</code> operation.
    */
  @js.native
  trait GetDeploymentGroupOutput extends js.Object {
    var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo]
  }

  object GetDeploymentGroupOutput {
    @inline
    def apply(
        deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.undefined
    ): GetDeploymentGroupOutput = {
      val __obj = js.Dynamic.literal()
      deploymentGroupInfo.foreach(__v => __obj.updateDynamic("deploymentGroupInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentGroupOutput]
    }
  }

  /** Represents the input of a <code>GetDeployment</code> operation.
    */
  @js.native
  trait GetDeploymentInput extends js.Object {
    var deploymentId: DeploymentId
  }

  object GetDeploymentInput {
    @inline
    def apply(
        deploymentId: DeploymentId
    ): GetDeploymentInput = {
      val __obj = js.Dynamic.literal(
        "deploymentId" -> deploymentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeploymentInput]
    }
  }

  /** Represents the input of a <code>GetDeploymentInstance</code> operation.
    */
  @js.native
  trait GetDeploymentInstanceInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceId: InstanceId
  }

  object GetDeploymentInstanceInput {
    @inline
    def apply(
        deploymentId: DeploymentId,
        instanceId: InstanceId
    ): GetDeploymentInstanceInput = {
      val __obj = js.Dynamic.literal(
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "instanceId" -> instanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeploymentInstanceInput]
    }
  }

  /** Represents the output of a <code>GetDeploymentInstance</code> operation.
    */
  @js.native
  trait GetDeploymentInstanceOutput extends js.Object {
    var instanceSummary: js.UndefOr[InstanceSummary]
  }

  object GetDeploymentInstanceOutput {
    @inline
    def apply(
        instanceSummary: js.UndefOr[InstanceSummary] = js.undefined
    ): GetDeploymentInstanceOutput = {
      val __obj = js.Dynamic.literal()
      instanceSummary.foreach(__v => __obj.updateDynamic("instanceSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentInstanceOutput]
    }
  }

  /** Represents the output of a <code>GetDeployment</code> operation.
    */
  @js.native
  trait GetDeploymentOutput extends js.Object {
    var deploymentInfo: js.UndefOr[DeploymentInfo]
  }

  object GetDeploymentOutput {
    @inline
    def apply(
        deploymentInfo: js.UndefOr[DeploymentInfo] = js.undefined
    ): GetDeploymentOutput = {
      val __obj = js.Dynamic.literal()
      deploymentInfo.foreach(__v => __obj.updateDynamic("deploymentInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentOutput]
    }
  }

  @js.native
  trait GetDeploymentTargetInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var targetId: js.UndefOr[TargetId]
  }

  object GetDeploymentTargetInput {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        targetId: js.UndefOr[TargetId] = js.undefined
    ): GetDeploymentTargetInput = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      targetId.foreach(__v => __obj.updateDynamic("targetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentTargetInput]
    }
  }

  @js.native
  trait GetDeploymentTargetOutput extends js.Object {
    var deploymentTarget: js.UndefOr[DeploymentTarget]
  }

  object GetDeploymentTargetOutput {
    @inline
    def apply(
        deploymentTarget: js.UndefOr[DeploymentTarget] = js.undefined
    ): GetDeploymentTargetOutput = {
      val __obj = js.Dynamic.literal()
      deploymentTarget.foreach(__v => __obj.updateDynamic("deploymentTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentTargetOutput]
    }
  }

  /** Represents the input of a <code>GetOnPremisesInstance</code> operation.
    */
  @js.native
  trait GetOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
  }

  object GetOnPremisesInstanceInput {
    @inline
    def apply(
        instanceName: InstanceName
    ): GetOnPremisesInstanceInput = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOnPremisesInstanceInput]
    }
  }

  /** Represents the output of a <code>GetOnPremisesInstance</code> operation.
    */
  @js.native
  trait GetOnPremisesInstanceOutput extends js.Object {
    var instanceInfo: js.UndefOr[InstanceInfo]
  }

  object GetOnPremisesInstanceOutput {
    @inline
    def apply(
        instanceInfo: js.UndefOr[InstanceInfo] = js.undefined
    ): GetOnPremisesInstanceOutput = {
      val __obj = js.Dynamic.literal()
      instanceInfo.foreach(__v => __obj.updateDynamic("instanceInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOnPremisesInstanceOutput]
    }
  }

  /** Information about the location of application artifacts stored in GitHub.
    */
  @js.native
  trait GitHubLocation extends js.Object {
    var commitId: js.UndefOr[CommitId]
    var repository: js.UndefOr[Repository]
  }

  object GitHubLocation {
    @inline
    def apply(
        commitId: js.UndefOr[CommitId] = js.undefined,
        repository: js.UndefOr[Repository] = js.undefined
    ): GitHubLocation = {
      val __obj = js.Dynamic.literal()
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GitHubLocation]
    }
  }

  @js.native
  sealed trait GreenFleetProvisioningAction extends js.Any
  object GreenFleetProvisioningAction {
    val DISCOVER_EXISTING = "DISCOVER_EXISTING".asInstanceOf[GreenFleetProvisioningAction]
    val COPY_AUTO_SCALING_GROUP = "COPY_AUTO_SCALING_GROUP".asInstanceOf[GreenFleetProvisioningAction]

    @inline def values = js.Array(DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP)
  }

  /** Information about the instances that belong to the replacement environment in a blue/green deployment.
    */
  @js.native
  trait GreenFleetProvisioningOption extends js.Object {
    var action: js.UndefOr[GreenFleetProvisioningAction]
  }

  object GreenFleetProvisioningOption {
    @inline
    def apply(
        action: js.UndefOr[GreenFleetProvisioningAction] = js.undefined
    ): GreenFleetProvisioningOption = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GreenFleetProvisioningOption]
    }
  }

  @js.native
  sealed trait InstanceAction extends js.Any
  object InstanceAction {
    val TERMINATE = "TERMINATE".asInstanceOf[InstanceAction]
    val KEEP_ALIVE = "KEEP_ALIVE".asInstanceOf[InstanceAction]

    @inline def values = js.Array(TERMINATE, KEEP_ALIVE)
  }

  /** Information about an on-premises instance.
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
    @inline
    def apply(
        deregisterTime: js.UndefOr[Timestamp] = js.undefined,
        iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined,
        iamUserArn: js.UndefOr[IamUserArn] = js.undefined,
        instanceArn: js.UndefOr[InstanceArn] = js.undefined,
        instanceName: js.UndefOr[InstanceName] = js.undefined,
        registerTime: js.UndefOr[Timestamp] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): InstanceInfo = {
      val __obj = js.Dynamic.literal()
      deregisterTime.foreach(__v => __obj.updateDynamic("deregisterTime")(__v.asInstanceOf[js.Any]))
      iamSessionArn.foreach(__v => __obj.updateDynamic("iamSessionArn")(__v.asInstanceOf[js.Any]))
      iamUserArn.foreach(__v => __obj.updateDynamic("iamUserArn")(__v.asInstanceOf[js.Any]))
      instanceArn.foreach(__v => __obj.updateDynamic("instanceArn")(__v.asInstanceOf[js.Any]))
      instanceName.foreach(__v => __obj.updateDynamic("instanceName")(__v.asInstanceOf[js.Any]))
      registerTime.foreach(__v => __obj.updateDynamic("registerTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceInfo]
    }
  }

  @deprecated("InstanceStatus is deprecated, use TargetStatus instead.", "forever")
  @js.native
  sealed trait InstanceStatus extends js.Any
  object InstanceStatus {
    val Pending = "Pending".asInstanceOf[InstanceStatus]
    val InProgress = "InProgress".asInstanceOf[InstanceStatus]
    val Succeeded = "Succeeded".asInstanceOf[InstanceStatus]
    val Failed = "Failed".asInstanceOf[InstanceStatus]
    val Skipped = "Skipped".asInstanceOf[InstanceStatus]
    val Unknown = "Unknown".asInstanceOf[InstanceStatus]
    val Ready = "Ready".asInstanceOf[InstanceStatus]

    @inline def values = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
  }

  /** Information about an instance in a deployment.
    */
  @deprecated("InstanceSummary is deprecated, use DeploymentTarget instead.", "forever")
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
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        instanceId: js.UndefOr[InstanceId] = js.undefined,
        instanceType: js.UndefOr[InstanceType] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
        status: js.UndefOr[InstanceStatus] = js.undefined
    ): InstanceSummary = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      instanceId.foreach(__v => __obj.updateDynamic("instanceId")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lifecycleEvents.foreach(__v => __obj.updateDynamic("lifecycleEvents")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceSummary]
    }
  }

  /** A target Amazon EC2 or on-premises instance during a deployment that uses the EC2/On-premises compute platform.
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
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        instanceLabel: js.UndefOr[TargetLabel] = js.undefined,
        lastUpdatedAt: js.UndefOr[Time] = js.undefined,
        lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
        status: js.UndefOr[TargetStatus] = js.undefined,
        targetArn: js.UndefOr[TargetArn] = js.undefined,
        targetId: js.UndefOr[TargetId] = js.undefined
    ): InstanceTarget = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      instanceLabel.foreach(__v => __obj.updateDynamic("instanceLabel")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lifecycleEvents.foreach(__v => __obj.updateDynamic("lifecycleEvents")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      targetId.foreach(__v => __obj.updateDynamic("targetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceTarget]
    }
  }

  @js.native
  sealed trait InstanceType extends js.Any
  object InstanceType {
    val Blue = "Blue".asInstanceOf[InstanceType]
    val Green = "Green".asInstanceOf[InstanceType]

    @inline def values = js.Array(Blue, Green)
  }

  /** Information about a Lambda function specified in a deployment.
    */
  @js.native
  trait LambdaFunctionInfo extends js.Object {
    var currentVersion: js.UndefOr[Version]
    var functionAlias: js.UndefOr[LambdaFunctionAlias]
    var functionName: js.UndefOr[LambdaFunctionName]
    var targetVersion: js.UndefOr[Version]
    var targetVersionWeight: js.UndefOr[TrafficWeight]
  }

  object LambdaFunctionInfo {
    @inline
    def apply(
        currentVersion: js.UndefOr[Version] = js.undefined,
        functionAlias: js.UndefOr[LambdaFunctionAlias] = js.undefined,
        functionName: js.UndefOr[LambdaFunctionName] = js.undefined,
        targetVersion: js.UndefOr[Version] = js.undefined,
        targetVersionWeight: js.UndefOr[TrafficWeight] = js.undefined
    ): LambdaFunctionInfo = {
      val __obj = js.Dynamic.literal()
      currentVersion.foreach(__v => __obj.updateDynamic("currentVersion")(__v.asInstanceOf[js.Any]))
      functionAlias.foreach(__v => __obj.updateDynamic("functionAlias")(__v.asInstanceOf[js.Any]))
      functionName.foreach(__v => __obj.updateDynamic("functionName")(__v.asInstanceOf[js.Any]))
      targetVersion.foreach(__v => __obj.updateDynamic("targetVersion")(__v.asInstanceOf[js.Any]))
      targetVersionWeight.foreach(__v => __obj.updateDynamic("targetVersionWeight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionInfo]
    }
  }

  /** Information about the target AWS Lambda function during an AWS Lambda deployment.
    */
  @js.native
  trait LambdaTarget extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lambdaFunctionInfo: js.UndefOr[LambdaFunctionInfo]
    var lastUpdatedAt: js.UndefOr[Time]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[TargetStatus]
    var targetArn: js.UndefOr[TargetArn]
    var targetId: js.UndefOr[TargetId]
  }

  object LambdaTarget {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        lambdaFunctionInfo: js.UndefOr[LambdaFunctionInfo] = js.undefined,
        lastUpdatedAt: js.UndefOr[Time] = js.undefined,
        lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
        status: js.UndefOr[TargetStatus] = js.undefined,
        targetArn: js.UndefOr[TargetArn] = js.undefined,
        targetId: js.UndefOr[TargetId] = js.undefined
    ): LambdaTarget = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      lambdaFunctionInfo.foreach(__v => __obj.updateDynamic("lambdaFunctionInfo")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lifecycleEvents.foreach(__v => __obj.updateDynamic("lifecycleEvents")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      targetId.foreach(__v => __obj.updateDynamic("targetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaTarget]
    }
  }

  /** Information about the most recent attempted or successful deployment to a deployment group.
    */
  @js.native
  trait LastDeploymentInfo extends js.Object {
    var createTime: js.UndefOr[Timestamp]
    var deploymentId: js.UndefOr[DeploymentId]
    var endTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DeploymentStatus]
  }

  object LastDeploymentInfo {
    @inline
    def apply(
        createTime: js.UndefOr[Timestamp] = js.undefined,
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[DeploymentStatus] = js.undefined
    ): LastDeploymentInfo = {
      val __obj = js.Dynamic.literal()
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LastDeploymentInfo]
    }
  }

  @js.native
  sealed trait LifecycleErrorCode extends js.Any
  object LifecycleErrorCode {
    val Success = "Success".asInstanceOf[LifecycleErrorCode]
    val ScriptMissing = "ScriptMissing".asInstanceOf[LifecycleErrorCode]
    val ScriptNotExecutable = "ScriptNotExecutable".asInstanceOf[LifecycleErrorCode]
    val ScriptTimedOut = "ScriptTimedOut".asInstanceOf[LifecycleErrorCode]
    val ScriptFailed = "ScriptFailed".asInstanceOf[LifecycleErrorCode]
    val UnknownError = "UnknownError".asInstanceOf[LifecycleErrorCode]

    @inline def values = js.Array(Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError)
  }

  /** Information about a deployment lifecycle event.
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
    @inline
    def apply(
        diagnostics: js.UndefOr[Diagnostics] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        lifecycleEventName: js.UndefOr[LifecycleEventName] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[LifecycleEventStatus] = js.undefined
    ): LifecycleEvent = {
      val __obj = js.Dynamic.literal()
      diagnostics.foreach(__v => __obj.updateDynamic("diagnostics")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      lifecycleEventName.foreach(__v => __obj.updateDynamic("lifecycleEventName")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleEvent]
    }
  }

  @js.native
  sealed trait LifecycleEventStatus extends js.Any
  object LifecycleEventStatus {
    val Pending = "Pending".asInstanceOf[LifecycleEventStatus]
    val InProgress = "InProgress".asInstanceOf[LifecycleEventStatus]
    val Succeeded = "Succeeded".asInstanceOf[LifecycleEventStatus]
    val Failed = "Failed".asInstanceOf[LifecycleEventStatus]
    val Skipped = "Skipped".asInstanceOf[LifecycleEventStatus]
    val Unknown = "Unknown".asInstanceOf[LifecycleEventStatus]

    @inline def values = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown)
  }

  /** Represents the input of a <code>ListApplicationRevisions</code> operation.
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
    @inline
    def apply(
        applicationName: ApplicationName,
        deployed: js.UndefOr[ListStateFilterAction] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        s3KeyPrefix: js.UndefOr[S3Key] = js.undefined,
        sortBy: js.UndefOr[ApplicationRevisionSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListApplicationRevisionsInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any]
      )

      deployed.foreach(__v => __obj.updateDynamic("deployed")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3KeyPrefix.foreach(__v => __obj.updateDynamic("s3KeyPrefix")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationRevisionsInput]
    }
  }

  /** Represents the output of a <code>ListApplicationRevisions</code> operation.
    */
  @js.native
  trait ListApplicationRevisionsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var revisions: js.UndefOr[RevisionLocationList]
  }

  object ListApplicationRevisionsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        revisions: js.UndefOr[RevisionLocationList] = js.undefined
    ): ListApplicationRevisionsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      revisions.foreach(__v => __obj.updateDynamic("revisions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationRevisionsOutput]
    }
  }

  /** Represents the input of a <code>ListApplications</code> operation.
    */
  @js.native
  trait ListApplicationsInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsInput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsInput]
    }
  }

  /** Represents the output of a ListApplications operation.
    */
  @js.native
  trait ListApplicationsOutput extends js.Object {
    var applications: js.UndefOr[ApplicationsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsOutput {
    @inline
    def apply(
        applications: js.UndefOr[ApplicationsList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsOutput = {
      val __obj = js.Dynamic.literal()
      applications.foreach(__v => __obj.updateDynamic("applications")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsOutput]
    }
  }

  /** Represents the input of a <code>ListDeploymentConfigs</code> operation.
    */
  @js.native
  trait ListDeploymentConfigsInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentConfigsInput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentConfigsInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentConfigsInput]
    }
  }

  /** Represents the output of a <code>ListDeploymentConfigs</code> operation.
    */
  @js.native
  trait ListDeploymentConfigsOutput extends js.Object {
    var deploymentConfigsList: js.UndefOr[DeploymentConfigsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentConfigsOutput {
    @inline
    def apply(
        deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentConfigsOutput = {
      val __obj = js.Dynamic.literal()
      deploymentConfigsList.foreach(__v => __obj.updateDynamic("deploymentConfigsList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentConfigsOutput]
    }
  }

  /** Represents the input of a <code>ListDeploymentGroups</code> operation.
    */
  @js.native
  trait ListDeploymentGroupsInput extends js.Object {
    var applicationName: ApplicationName
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentGroupsInput {
    @inline
    def apply(
        applicationName: ApplicationName,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentGroupsInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentGroupsInput]
    }
  }

  /** Represents the output of a <code>ListDeploymentGroups</code> operation.
    */
  @js.native
  trait ListDeploymentGroupsOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var deploymentGroups: js.UndefOr[DeploymentGroupsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentGroupsOutput {
    @inline
    def apply(
        applicationName: js.UndefOr[ApplicationName] = js.undefined,
        deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentGroupsOutput = {
      val __obj = js.Dynamic.literal()
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      deploymentGroups.foreach(__v => __obj.updateDynamic("deploymentGroups")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentGroupsOutput]
    }
  }

  /** Represents the input of a <code>ListDeploymentInstances</code> operation.
    */
  @js.native
  trait ListDeploymentInstancesInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceStatusFilter: js.UndefOr[InstanceStatusList]
    var instanceTypeFilter: js.UndefOr[InstanceTypeList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentInstancesInput {
    @inline
    def apply(
        deploymentId: DeploymentId,
        instanceStatusFilter: js.UndefOr[InstanceStatusList] = js.undefined,
        instanceTypeFilter: js.UndefOr[InstanceTypeList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentInstancesInput = {
      val __obj = js.Dynamic.literal(
        "deploymentId" -> deploymentId.asInstanceOf[js.Any]
      )

      instanceStatusFilter.foreach(__v => __obj.updateDynamic("instanceStatusFilter")(__v.asInstanceOf[js.Any]))
      instanceTypeFilter.foreach(__v => __obj.updateDynamic("instanceTypeFilter")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentInstancesInput]
    }
  }

  /** Represents the output of a <code>ListDeploymentInstances</code> operation.
    */
  @js.native
  trait ListDeploymentInstancesOutput extends js.Object {
    var instancesList: js.UndefOr[InstancesList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentInstancesOutput {
    @inline
    def apply(
        instancesList: js.UndefOr[InstancesList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentInstancesOutput = {
      val __obj = js.Dynamic.literal()
      instancesList.foreach(__v => __obj.updateDynamic("instancesList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentInstancesOutput]
    }
  }

  @js.native
  trait ListDeploymentTargetsInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var nextToken: js.UndefOr[NextToken]
    var targetFilters: js.UndefOr[TargetFilters]
  }

  object ListDeploymentTargetsInput {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        targetFilters: js.UndefOr[TargetFilters] = js.undefined
    ): ListDeploymentTargetsInput = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      targetFilters.foreach(__v => __obj.updateDynamic("targetFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentTargetsInput]
    }
  }

  @js.native
  trait ListDeploymentTargetsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var targetIds: js.UndefOr[TargetIdList]
  }

  object ListDeploymentTargetsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        targetIds: js.UndefOr[TargetIdList] = js.undefined
    ): ListDeploymentTargetsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      targetIds.foreach(__v => __obj.updateDynamic("targetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentTargetsOutput]
    }
  }

  /** Represents the input of a <code>ListDeployments</code> operation.
    */
  @js.native
  trait ListDeploymentsInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var createTimeRange: js.UndefOr[TimeRange]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var externalId: js.UndefOr[ExternalId]
    var includeOnlyStatuses: js.UndefOr[DeploymentStatusList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentsInput {
    @inline
    def apply(
        applicationName: js.UndefOr[ApplicationName] = js.undefined,
        createTimeRange: js.UndefOr[TimeRange] = js.undefined,
        deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
        externalId: js.UndefOr[ExternalId] = js.undefined,
        includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentsInput = {
      val __obj = js.Dynamic.literal()
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      createTimeRange.foreach(__v => __obj.updateDynamic("createTimeRange")(__v.asInstanceOf[js.Any]))
      deploymentGroupName.foreach(__v => __obj.updateDynamic("deploymentGroupName")(__v.asInstanceOf[js.Any]))
      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      includeOnlyStatuses.foreach(__v => __obj.updateDynamic("includeOnlyStatuses")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsInput]
    }
  }

  /** Represents the output of a <code>ListDeployments</code> operation.
    */
  @js.native
  trait ListDeploymentsOutput extends js.Object {
    var deployments: js.UndefOr[DeploymentsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentsOutput {
    @inline
    def apply(
        deployments: js.UndefOr[DeploymentsList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentsOutput = {
      val __obj = js.Dynamic.literal()
      deployments.foreach(__v => __obj.updateDynamic("deployments")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsOutput]
    }
  }

  /** Represents the input of a <code>ListGitHubAccountTokenNames</code> operation.
    */
  @js.native
  trait ListGitHubAccountTokenNamesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListGitHubAccountTokenNamesInput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGitHubAccountTokenNamesInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGitHubAccountTokenNamesInput]
    }
  }

  /** Represents the output of a <code>ListGitHubAccountTokenNames</code> operation.
    */
  @js.native
  trait ListGitHubAccountTokenNamesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tokenNameList: js.UndefOr[GitHubAccountTokenNameList]
  }

  object ListGitHubAccountTokenNamesOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tokenNameList: js.UndefOr[GitHubAccountTokenNameList] = js.undefined
    ): ListGitHubAccountTokenNamesOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tokenNameList.foreach(__v => __obj.updateDynamic("tokenNameList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGitHubAccountTokenNamesOutput]
    }
  }

  /** Represents the input of a <code>ListOnPremisesInstances</code> operation.
    */
  @js.native
  trait ListOnPremisesInstancesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var registrationStatus: js.UndefOr[RegistrationStatus]
    var tagFilters: js.UndefOr[TagFilterList]
  }

  object ListOnPremisesInstancesInput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
        tagFilters: js.UndefOr[TagFilterList] = js.undefined
    ): ListOnPremisesInstancesInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registrationStatus.foreach(__v => __obj.updateDynamic("registrationStatus")(__v.asInstanceOf[js.Any]))
      tagFilters.foreach(__v => __obj.updateDynamic("tagFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOnPremisesInstancesInput]
    }
  }

  /** Represents the output of the list on-premises instances operation.
    */
  @js.native
  trait ListOnPremisesInstancesOutput extends js.Object {
    var instanceNames: js.UndefOr[InstanceNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListOnPremisesInstancesOutput {
    @inline
    def apply(
        instanceNames: js.UndefOr[InstanceNameList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOnPremisesInstancesOutput = {
      val __obj = js.Dynamic.literal()
      instanceNames.foreach(__v => __obj.updateDynamic("instanceNames")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOnPremisesInstancesOutput]
    }
  }

  @js.native
  sealed trait ListStateFilterAction extends js.Any
  object ListStateFilterAction {
    val include = "include".asInstanceOf[ListStateFilterAction]
    val exclude = "exclude".asInstanceOf[ListStateFilterAction]
    val ignore = "ignore".asInstanceOf[ListStateFilterAction]

    @inline def values = js.Array(include, exclude, ignore)
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: Arn
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceArn: Arn,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** Information about the Elastic Load Balancing load balancer or target group used in a deployment.
    */
  @js.native
  trait LoadBalancerInfo extends js.Object {
    var elbInfoList: js.UndefOr[ELBInfoList]
    var targetGroupInfoList: js.UndefOr[TargetGroupInfoList]
    var targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList]
  }

  object LoadBalancerInfo {
    @inline
    def apply(
        elbInfoList: js.UndefOr[ELBInfoList] = js.undefined,
        targetGroupInfoList: js.UndefOr[TargetGroupInfoList] = js.undefined,
        targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList] = js.undefined
    ): LoadBalancerInfo = {
      val __obj = js.Dynamic.literal()
      elbInfoList.foreach(__v => __obj.updateDynamic("elbInfoList")(__v.asInstanceOf[js.Any]))
      targetGroupInfoList.foreach(__v => __obj.updateDynamic("targetGroupInfoList")(__v.asInstanceOf[js.Any]))
      targetGroupPairInfoList.foreach(__v => __obj.updateDynamic("targetGroupPairInfoList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerInfo]
    }
  }

  /** Information about minimum healthy instance.
    */
  @js.native
  trait MinimumHealthyHosts extends js.Object {
    var `type`: js.UndefOr[MinimumHealthyHostsType]
    var value: js.UndefOr[MinimumHealthyHostsValue]
  }

  object MinimumHealthyHosts {
    @inline
    def apply(
        `type`: js.UndefOr[MinimumHealthyHostsType] = js.undefined,
        value: js.UndefOr[MinimumHealthyHostsValue] = js.undefined
    ): MinimumHealthyHosts = {
      val __obj = js.Dynamic.literal()
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MinimumHealthyHosts]
    }
  }

  @js.native
  sealed trait MinimumHealthyHostsType extends js.Any
  object MinimumHealthyHostsType {
    val HOST_COUNT = "HOST_COUNT".asInstanceOf[MinimumHealthyHostsType]
    val FLEET_PERCENT = "FLEET_PERCENT".asInstanceOf[MinimumHealthyHostsType]

    @inline def values = js.Array(HOST_COUNT, FLEET_PERCENT)
  }

  /** Information about groups of on-premises instance tags.
    */
  @js.native
  trait OnPremisesTagSet extends js.Object {
    var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList]
  }

  object OnPremisesTagSet {
    @inline
    def apply(
        onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList] = js.undefined
    ): OnPremisesTagSet = {
      val __obj = js.Dynamic.literal()
      onPremisesTagSetList.foreach(__v => __obj.updateDynamic("onPremisesTagSetList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnPremisesTagSet]
    }
  }

  @js.native
  sealed trait OutdatedInstancesStrategy extends js.Any
  object OutdatedInstancesStrategy {
    val UPDATE = "UPDATE".asInstanceOf[OutdatedInstancesStrategy]
    val IGNORE = "IGNORE".asInstanceOf[OutdatedInstancesStrategy]

    @inline def values = js.Array(UPDATE, IGNORE)
  }

  @js.native
  trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId]
    var status: js.UndefOr[LifecycleEventStatus]
  }

  object PutLifecycleEventHookExecutionStatusInput {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined,
        status: js.UndefOr[LifecycleEventStatus] = js.undefined
    ): PutLifecycleEventHookExecutionStatusInput = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      lifecycleEventHookExecutionId.foreach(__v => __obj.updateDynamic("lifecycleEventHookExecutionId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
    }
  }

  @js.native
  trait PutLifecycleEventHookExecutionStatusOutput extends js.Object {
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId]
  }

  object PutLifecycleEventHookExecutionStatusOutput {
    @inline
    def apply(
        lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined
    ): PutLifecycleEventHookExecutionStatusOutput = {
      val __obj = js.Dynamic.literal()
      lifecycleEventHookExecutionId.foreach(__v => __obj.updateDynamic("lifecycleEventHookExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusOutput]
    }
  }

  /** A revision for an AWS Lambda deployment that is a YAML-formatted or JSON-formatted string. For AWS Lambda deployments, the revision is the same as the AppSpec file.
    */
  @deprecated("RawString and String revision type are deprecated, use AppSpecContent type instead.", "forever")
  @js.native
  trait RawString extends js.Object {
    var content: js.UndefOr[RawStringContent]
    var sha256: js.UndefOr[RawStringSha256]
  }

  object RawString {
    @inline
    def apply(
        content: js.UndefOr[RawStringContent] = js.undefined,
        sha256: js.UndefOr[RawStringSha256] = js.undefined
    ): RawString = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      sha256.foreach(__v => __obj.updateDynamic("sha256")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RawString]
    }
  }

  /** Represents the input of a RegisterApplicationRevision operation.
    */
  @js.native
  trait RegisterApplicationRevisionInput extends js.Object {
    var applicationName: ApplicationName
    var revision: RevisionLocation
    var description: js.UndefOr[Description]
  }

  object RegisterApplicationRevisionInput {
    @inline
    def apply(
        applicationName: ApplicationName,
        revision: RevisionLocation,
        description: js.UndefOr[Description] = js.undefined
    ): RegisterApplicationRevisionInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "revision" -> revision.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterApplicationRevisionInput]
    }
  }

  /** Represents the input of the register on-premises instance operation.
    */
  @js.native
  trait RegisterOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
    var iamSessionArn: js.UndefOr[IamSessionArn]
    var iamUserArn: js.UndefOr[IamUserArn]
  }

  object RegisterOnPremisesInstanceInput {
    @inline
    def apply(
        instanceName: InstanceName,
        iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined,
        iamUserArn: js.UndefOr[IamUserArn] = js.undefined
    ): RegisterOnPremisesInstanceInput = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      iamSessionArn.foreach(__v => __obj.updateDynamic("iamSessionArn")(__v.asInstanceOf[js.Any]))
      iamUserArn.foreach(__v => __obj.updateDynamic("iamUserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterOnPremisesInstanceInput]
    }
  }

  @js.native
  sealed trait RegistrationStatus extends js.Any
  object RegistrationStatus {
    val Registered = "Registered".asInstanceOf[RegistrationStatus]
    val Deregistered = "Deregistered".asInstanceOf[RegistrationStatus]

    @inline def values = js.Array(Registered, Deregistered)
  }

  /** Information about deployments related to the specified deployment.
    */
  @js.native
  trait RelatedDeployments extends js.Object {
    var autoUpdateOutdatedInstancesDeploymentIds: js.UndefOr[DeploymentsList]
    var autoUpdateOutdatedInstancesRootDeploymentId: js.UndefOr[DeploymentId]
  }

  object RelatedDeployments {
    @inline
    def apply(
        autoUpdateOutdatedInstancesDeploymentIds: js.UndefOr[DeploymentsList] = js.undefined,
        autoUpdateOutdatedInstancesRootDeploymentId: js.UndefOr[DeploymentId] = js.undefined
    ): RelatedDeployments = {
      val __obj = js.Dynamic.literal()
      autoUpdateOutdatedInstancesDeploymentIds.foreach(__v => __obj.updateDynamic("autoUpdateOutdatedInstancesDeploymentIds")(__v.asInstanceOf[js.Any]))
      autoUpdateOutdatedInstancesRootDeploymentId.foreach(__v => __obj.updateDynamic("autoUpdateOutdatedInstancesRootDeploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedDeployments]
    }
  }

  /** Represents the input of a <code>RemoveTagsFromOnPremisesInstances</code> operation.
    */
  @js.native
  trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
    var tags: TagList
  }

  object RemoveTagsFromOnPremisesInstancesInput {
    @inline
    def apply(
        instanceNames: InstanceNameList,
        tags: TagList
    ): RemoveTagsFromOnPremisesInstancesInput = {
      val __obj = js.Dynamic.literal(
        "instanceNames" -> instanceNames.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveTagsFromOnPremisesInstancesInput]
    }
  }

  /** Information about an application revision.
    */
  @js.native
  trait RevisionInfo extends js.Object {
    var genericRevisionInfo: js.UndefOr[GenericRevisionInfo]
    var revisionLocation: js.UndefOr[RevisionLocation]
  }

  object RevisionInfo {
    @inline
    def apply(
        genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined,
        revisionLocation: js.UndefOr[RevisionLocation] = js.undefined
    ): RevisionInfo = {
      val __obj = js.Dynamic.literal()
      genericRevisionInfo.foreach(__v => __obj.updateDynamic("genericRevisionInfo")(__v.asInstanceOf[js.Any]))
      revisionLocation.foreach(__v => __obj.updateDynamic("revisionLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevisionInfo]
    }
  }

  /** Information about the location of an application revision.
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
    @inline
    def apply(
        appSpecContent: js.UndefOr[AppSpecContent] = js.undefined,
        gitHubLocation: js.UndefOr[GitHubLocation] = js.undefined,
        revisionType: js.UndefOr[RevisionLocationType] = js.undefined,
        s3Location: js.UndefOr[S3Location] = js.undefined,
        string: js.UndefOr[RawString] = js.undefined
    ): RevisionLocation = {
      val __obj = js.Dynamic.literal()
      appSpecContent.foreach(__v => __obj.updateDynamic("appSpecContent")(__v.asInstanceOf[js.Any]))
      gitHubLocation.foreach(__v => __obj.updateDynamic("gitHubLocation")(__v.asInstanceOf[js.Any]))
      revisionType.foreach(__v => __obj.updateDynamic("revisionType")(__v.asInstanceOf[js.Any]))
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      string.foreach(__v => __obj.updateDynamic("string")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevisionLocation]
    }
  }

  @js.native
  sealed trait RevisionLocationType extends js.Any
  object RevisionLocationType {
    val S3 = "S3".asInstanceOf[RevisionLocationType]
    val GitHub = "GitHub".asInstanceOf[RevisionLocationType]
    val String = "String".asInstanceOf[RevisionLocationType]
    val AppSpecContent = "AppSpecContent".asInstanceOf[RevisionLocationType]

    @inline def values = js.Array(S3, GitHub, String, AppSpecContent)
  }

  /** Information about a deployment rollback.
    */
  @js.native
  trait RollbackInfo extends js.Object {
    var rollbackDeploymentId: js.UndefOr[DeploymentId]
    var rollbackMessage: js.UndefOr[Description]
    var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId]
  }

  object RollbackInfo {
    @inline
    def apply(
        rollbackDeploymentId: js.UndefOr[DeploymentId] = js.undefined,
        rollbackMessage: js.UndefOr[Description] = js.undefined,
        rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId] = js.undefined
    ): RollbackInfo = {
      val __obj = js.Dynamic.literal()
      rollbackDeploymentId.foreach(__v => __obj.updateDynamic("rollbackDeploymentId")(__v.asInstanceOf[js.Any]))
      rollbackMessage.foreach(__v => __obj.updateDynamic("rollbackMessage")(__v.asInstanceOf[js.Any]))
      rollbackTriggeringDeploymentId.foreach(__v => __obj.updateDynamic("rollbackTriggeringDeploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RollbackInfo]
    }
  }

  /** Information about the location of application artifacts stored in Amazon S3.
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
    @inline
    def apply(
        bucket: js.UndefOr[S3Bucket] = js.undefined,
        bundleType: js.UndefOr[BundleType] = js.undefined,
        eTag: js.UndefOr[ETag] = js.undefined,
        key: js.UndefOr[S3Key] = js.undefined,
        version: js.UndefOr[VersionId] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      bundleType.foreach(__v => __obj.updateDynamic("bundleType")(__v.asInstanceOf[js.Any]))
      eTag.foreach(__v => __obj.updateDynamic("eTag")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  @js.native
  trait SkipWaitTimeForInstanceTerminationInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  object SkipWaitTimeForInstanceTerminationInput {
    @inline
    def apply(
        deploymentId: js.UndefOr[DeploymentId] = js.undefined
    ): SkipWaitTimeForInstanceTerminationInput = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkipWaitTimeForInstanceTerminationInput]
    }
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder {
    val ascending = "ascending".asInstanceOf[SortOrder]
    val descending = "descending".asInstanceOf[SortOrder]

    @inline def values = js.Array(ascending, descending)
  }

  /** Represents the input of a <code>StopDeployment</code> operation.
    */
  @js.native
  trait StopDeploymentInput extends js.Object {
    var deploymentId: DeploymentId
    var autoRollbackEnabled: js.UndefOr[NullableBoolean]
  }

  object StopDeploymentInput {
    @inline
    def apply(
        deploymentId: DeploymentId,
        autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.undefined
    ): StopDeploymentInput = {
      val __obj = js.Dynamic.literal(
        "deploymentId" -> deploymentId.asInstanceOf[js.Any]
      )

      autoRollbackEnabled.foreach(__v => __obj.updateDynamic("autoRollbackEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDeploymentInput]
    }
  }

  /** Represents the output of a <code>StopDeployment</code> operation.
    */
  @js.native
  trait StopDeploymentOutput extends js.Object {
    var status: js.UndefOr[StopStatus]
    var statusMessage: js.UndefOr[Message]
  }

  object StopDeploymentOutput {
    @inline
    def apply(
        status: js.UndefOr[StopStatus] = js.undefined,
        statusMessage: js.UndefOr[Message] = js.undefined
    ): StopDeploymentOutput = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDeploymentOutput]
    }
  }

  @js.native
  sealed trait StopStatus extends js.Any
  object StopStatus {
    val Pending = "Pending".asInstanceOf[StopStatus]
    val Succeeded = "Succeeded".asInstanceOf[StopStatus]

    @inline def values = js.Array(Pending, Succeeded)
  }

  /** Information about a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[Key]
    var Value: js.UndefOr[Value]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[Key] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /** Information about an on-premises instance tag filter.
    */
  @js.native
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[Key]
    var Type: js.UndefOr[TagFilterType]
    var Value: js.UndefOr[Value]
  }

  object TagFilter {
    @inline
    def apply(
        Key: js.UndefOr[Key] = js.undefined,
        Type: js.UndefOr[TagFilterType] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): TagFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagFilter]
    }
  }

  @js.native
  sealed trait TagFilterType extends js.Any
  object TagFilterType {
    val KEY_ONLY = "KEY_ONLY".asInstanceOf[TagFilterType]
    val VALUE_ONLY = "VALUE_ONLY".asInstanceOf[TagFilterType]
    val KEY_AND_VALUE = "KEY_AND_VALUE".asInstanceOf[TagFilterType]

    @inline def values = js.Array(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE)
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  sealed trait TargetFilterName extends js.Any
  object TargetFilterName {
    val TargetStatus = "TargetStatus".asInstanceOf[TargetFilterName]
    val ServerInstanceLabel = "ServerInstanceLabel".asInstanceOf[TargetFilterName]

    @inline def values = js.Array(TargetStatus, ServerInstanceLabel)
  }

  /** Information about a target group in Elastic Load Balancing to use in a deployment. Instances are registered as targets in a target group, and traffic is routed to the target group.
    */
  @js.native
  trait TargetGroupInfo extends js.Object {
    var name: js.UndefOr[TargetGroupName]
  }

  object TargetGroupInfo {
    @inline
    def apply(
        name: js.UndefOr[TargetGroupName] = js.undefined
    ): TargetGroupInfo = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetGroupInfo]
    }
  }

  /** Information about two target groups and how traffic is routed during an Amazon ECS deployment. An optional test traffic route can be specified.
    */
  @js.native
  trait TargetGroupPairInfo extends js.Object {
    var prodTrafficRoute: js.UndefOr[TrafficRoute]
    var targetGroups: js.UndefOr[TargetGroupInfoList]
    var testTrafficRoute: js.UndefOr[TrafficRoute]
  }

  object TargetGroupPairInfo {
    @inline
    def apply(
        prodTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined,
        targetGroups: js.UndefOr[TargetGroupInfoList] = js.undefined,
        testTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined
    ): TargetGroupPairInfo = {
      val __obj = js.Dynamic.literal()
      prodTrafficRoute.foreach(__v => __obj.updateDynamic("prodTrafficRoute")(__v.asInstanceOf[js.Any]))
      targetGroups.foreach(__v => __obj.updateDynamic("targetGroups")(__v.asInstanceOf[js.Any]))
      testTrafficRoute.foreach(__v => __obj.updateDynamic("testTrafficRoute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetGroupPairInfo]
    }
  }

  /** Information about the instances to be used in the replacement environment in a blue/green deployment.
    */
  @js.native
  trait TargetInstances extends js.Object {
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList]
    var ec2TagSet: js.UndefOr[EC2TagSet]
    var tagFilters: js.UndefOr[EC2TagFilterList]
  }

  object TargetInstances {
    @inline
    def apply(
        autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
        ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined,
        tagFilters: js.UndefOr[EC2TagFilterList] = js.undefined
    ): TargetInstances = {
      val __obj = js.Dynamic.literal()
      autoScalingGroups.foreach(__v => __obj.updateDynamic("autoScalingGroups")(__v.asInstanceOf[js.Any]))
      ec2TagSet.foreach(__v => __obj.updateDynamic("ec2TagSet")(__v.asInstanceOf[js.Any]))
      tagFilters.foreach(__v => __obj.updateDynamic("tagFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetInstances]
    }
  }

  @js.native
  sealed trait TargetLabel extends js.Any
  object TargetLabel {
    val Blue = "Blue".asInstanceOf[TargetLabel]
    val Green = "Green".asInstanceOf[TargetLabel]

    @inline def values = js.Array(Blue, Green)
  }

  @js.native
  sealed trait TargetStatus extends js.Any
  object TargetStatus {
    val Pending = "Pending".asInstanceOf[TargetStatus]
    val InProgress = "InProgress".asInstanceOf[TargetStatus]
    val Succeeded = "Succeeded".asInstanceOf[TargetStatus]
    val Failed = "Failed".asInstanceOf[TargetStatus]
    val Skipped = "Skipped".asInstanceOf[TargetStatus]
    val Unknown = "Unknown".asInstanceOf[TargetStatus]
    val Ready = "Ready".asInstanceOf[TargetStatus]

    @inline def values = js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready)
  }

  /** A configuration that shifts traffic from one version of a Lambda function or ECS task set to another in two increments. The original and target Lambda function versions or ECS task sets are specified in the deployment's AppSpec file.
    */
  @js.native
  trait TimeBasedCanary extends js.Object {
    var canaryInterval: js.UndefOr[WaitTimeInMins]
    var canaryPercentage: js.UndefOr[Percentage]
  }

  object TimeBasedCanary {
    @inline
    def apply(
        canaryInterval: js.UndefOr[WaitTimeInMins] = js.undefined,
        canaryPercentage: js.UndefOr[Percentage] = js.undefined
    ): TimeBasedCanary = {
      val __obj = js.Dynamic.literal()
      canaryInterval.foreach(__v => __obj.updateDynamic("canaryInterval")(__v.asInstanceOf[js.Any]))
      canaryPercentage.foreach(__v => __obj.updateDynamic("canaryPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeBasedCanary]
    }
  }

  /** A configuration that shifts traffic from one version of a Lambda function or ECS task set to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions or ECS task sets are specified in the deployment's AppSpec file.
    */
  @js.native
  trait TimeBasedLinear extends js.Object {
    var linearInterval: js.UndefOr[WaitTimeInMins]
    var linearPercentage: js.UndefOr[Percentage]
  }

  object TimeBasedLinear {
    @inline
    def apply(
        linearInterval: js.UndefOr[WaitTimeInMins] = js.undefined,
        linearPercentage: js.UndefOr[Percentage] = js.undefined
    ): TimeBasedLinear = {
      val __obj = js.Dynamic.literal()
      linearInterval.foreach(__v => __obj.updateDynamic("linearInterval")(__v.asInstanceOf[js.Any]))
      linearPercentage.foreach(__v => __obj.updateDynamic("linearPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeBasedLinear]
    }
  }

  /** Information about a time range.
    */
  @js.native
  trait TimeRange extends js.Object {
    var end: js.UndefOr[Timestamp]
    var start: js.UndefOr[Timestamp]
  }

  object TimeRange {
    @inline
    def apply(
        end: js.UndefOr[Timestamp] = js.undefined,
        start: js.UndefOr[Timestamp] = js.undefined
    ): TimeRange = {
      val __obj = js.Dynamic.literal()
      end.foreach(__v => __obj.updateDynamic("end")(__v.asInstanceOf[js.Any]))
      start.foreach(__v => __obj.updateDynamic("start")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRange]
    }
  }

  /** Information about a listener. The listener contains the path used to route traffic that is received from the load balancer to a target group.
    */
  @js.native
  trait TrafficRoute extends js.Object {
    var listenerArns: js.UndefOr[ListenerArnList]
  }

  object TrafficRoute {
    @inline
    def apply(
        listenerArns: js.UndefOr[ListenerArnList] = js.undefined
    ): TrafficRoute = {
      val __obj = js.Dynamic.literal()
      listenerArns.foreach(__v => __obj.updateDynamic("listenerArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrafficRoute]
    }
  }

  /** The configuration that specifies how traffic is shifted from one version of a Lambda function to another version during an AWS Lambda deployment, or from one Amazon ECS task set to another during an Amazon ECS deployment.
    */
  @js.native
  trait TrafficRoutingConfig extends js.Object {
    var timeBasedCanary: js.UndefOr[TimeBasedCanary]
    var timeBasedLinear: js.UndefOr[TimeBasedLinear]
    var `type`: js.UndefOr[TrafficRoutingType]
  }

  object TrafficRoutingConfig {
    @inline
    def apply(
        timeBasedCanary: js.UndefOr[TimeBasedCanary] = js.undefined,
        timeBasedLinear: js.UndefOr[TimeBasedLinear] = js.undefined,
        `type`: js.UndefOr[TrafficRoutingType] = js.undefined
    ): TrafficRoutingConfig = {
      val __obj = js.Dynamic.literal()
      timeBasedCanary.foreach(__v => __obj.updateDynamic("timeBasedCanary")(__v.asInstanceOf[js.Any]))
      timeBasedLinear.foreach(__v => __obj.updateDynamic("timeBasedLinear")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrafficRoutingConfig]
    }
  }

  @js.native
  sealed trait TrafficRoutingType extends js.Any
  object TrafficRoutingType {
    val TimeBasedCanary = "TimeBasedCanary".asInstanceOf[TrafficRoutingType]
    val TimeBasedLinear = "TimeBasedLinear".asInstanceOf[TrafficRoutingType]
    val AllAtOnce = "AllAtOnce".asInstanceOf[TrafficRoutingType]

    @inline def values = js.Array(TimeBasedCanary, TimeBasedLinear, AllAtOnce)
  }

  /** Information about notification triggers for the deployment group.
    */
  @js.native
  trait TriggerConfig extends js.Object {
    var triggerEvents: js.UndefOr[TriggerEventTypeList]
    var triggerName: js.UndefOr[TriggerName]
    var triggerTargetArn: js.UndefOr[TriggerTargetArn]
  }

  object TriggerConfig {
    @inline
    def apply(
        triggerEvents: js.UndefOr[TriggerEventTypeList] = js.undefined,
        triggerName: js.UndefOr[TriggerName] = js.undefined,
        triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.undefined
    ): TriggerConfig = {
      val __obj = js.Dynamic.literal()
      triggerEvents.foreach(__v => __obj.updateDynamic("triggerEvents")(__v.asInstanceOf[js.Any]))
      triggerName.foreach(__v => __obj.updateDynamic("triggerName")(__v.asInstanceOf[js.Any]))
      triggerTargetArn.foreach(__v => __obj.updateDynamic("triggerTargetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerConfig]
    }
  }

  @js.native
  sealed trait TriggerEventType extends js.Any
  object TriggerEventType {
    val DeploymentStart = "DeploymentStart".asInstanceOf[TriggerEventType]
    val DeploymentSuccess = "DeploymentSuccess".asInstanceOf[TriggerEventType]
    val DeploymentFailure = "DeploymentFailure".asInstanceOf[TriggerEventType]
    val DeploymentStop = "DeploymentStop".asInstanceOf[TriggerEventType]
    val DeploymentRollback = "DeploymentRollback".asInstanceOf[TriggerEventType]
    val DeploymentReady = "DeploymentReady".asInstanceOf[TriggerEventType]
    val InstanceStart = "InstanceStart".asInstanceOf[TriggerEventType]
    val InstanceSuccess = "InstanceSuccess".asInstanceOf[TriggerEventType]
    val InstanceFailure = "InstanceFailure".asInstanceOf[TriggerEventType]
    val InstanceReady = "InstanceReady".asInstanceOf[TriggerEventType]

    @inline def values = js.Array(
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

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  /** Represents the input of an <code>UpdateApplication</code> operation.
    */
  @js.native
  trait UpdateApplicationInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var newApplicationName: js.UndefOr[ApplicationName]
  }

  object UpdateApplicationInput {
    @inline
    def apply(
        applicationName: js.UndefOr[ApplicationName] = js.undefined,
        newApplicationName: js.UndefOr[ApplicationName] = js.undefined
    ): UpdateApplicationInput = {
      val __obj = js.Dynamic.literal()
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      newApplicationName.foreach(__v => __obj.updateDynamic("newApplicationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationInput]
    }
  }

  /** Represents the input of an <code>UpdateDeploymentGroup</code> operation.
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
    var outdatedInstancesStrategy: js.UndefOr[OutdatedInstancesStrategy]
    var serviceRoleArn: js.UndefOr[Role]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
  }

  object UpdateDeploymentGroupInput {
    @inline
    def apply(
        applicationName: ApplicationName,
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
        outdatedInstancesStrategy: js.UndefOr[OutdatedInstancesStrategy] = js.undefined,
        serviceRoleArn: js.UndefOr[Role] = js.undefined,
        triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined
    ): UpdateDeploymentGroupInput = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "currentDeploymentGroupName" -> currentDeploymentGroupName.asInstanceOf[js.Any]
      )

      alarmConfiguration.foreach(__v => __obj.updateDynamic("alarmConfiguration")(__v.asInstanceOf[js.Any]))
      autoRollbackConfiguration.foreach(__v => __obj.updateDynamic("autoRollbackConfiguration")(__v.asInstanceOf[js.Any]))
      autoScalingGroups.foreach(__v => __obj.updateDynamic("autoScalingGroups")(__v.asInstanceOf[js.Any]))
      blueGreenDeploymentConfiguration.foreach(__v => __obj.updateDynamic("blueGreenDeploymentConfiguration")(__v.asInstanceOf[js.Any]))
      deploymentConfigName.foreach(__v => __obj.updateDynamic("deploymentConfigName")(__v.asInstanceOf[js.Any]))
      deploymentStyle.foreach(__v => __obj.updateDynamic("deploymentStyle")(__v.asInstanceOf[js.Any]))
      ec2TagFilters.foreach(__v => __obj.updateDynamic("ec2TagFilters")(__v.asInstanceOf[js.Any]))
      ec2TagSet.foreach(__v => __obj.updateDynamic("ec2TagSet")(__v.asInstanceOf[js.Any]))
      ecsServices.foreach(__v => __obj.updateDynamic("ecsServices")(__v.asInstanceOf[js.Any]))
      loadBalancerInfo.foreach(__v => __obj.updateDynamic("loadBalancerInfo")(__v.asInstanceOf[js.Any]))
      newDeploymentGroupName.foreach(__v => __obj.updateDynamic("newDeploymentGroupName")(__v.asInstanceOf[js.Any]))
      onPremisesInstanceTagFilters.foreach(__v => __obj.updateDynamic("onPremisesInstanceTagFilters")(__v.asInstanceOf[js.Any]))
      onPremisesTagSet.foreach(__v => __obj.updateDynamic("onPremisesTagSet")(__v.asInstanceOf[js.Any]))
      outdatedInstancesStrategy.foreach(__v => __obj.updateDynamic("outdatedInstancesStrategy")(__v.asInstanceOf[js.Any]))
      serviceRoleArn.foreach(__v => __obj.updateDynamic("serviceRoleArn")(__v.asInstanceOf[js.Any]))
      triggerConfigurations.foreach(__v => __obj.updateDynamic("triggerConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeploymentGroupInput]
    }
  }

  /** Represents the output of an <code>UpdateDeploymentGroup</code> operation.
    */
  @js.native
  trait UpdateDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList]
  }

  object UpdateDeploymentGroupOutput {
    @inline
    def apply(
        hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
    ): UpdateDeploymentGroupOutput = {
      val __obj = js.Dynamic.literal()
      hooksNotCleanedUp.foreach(__v => __obj.updateDynamic("hooksNotCleanedUp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeploymentGroupOutput]
    }
  }
}
