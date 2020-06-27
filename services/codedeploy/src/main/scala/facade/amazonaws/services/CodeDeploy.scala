package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object codedeploy {
  @deprecated("AdditionalDeploymentStatusInfo is deprecated, use DeploymentStatusMessageList instead.", "forever")
  type AdditionalDeploymentStatusInfo = String
  type AlarmList                      = js.Array[Alarm]
  type AlarmName                      = String
  type ApplicationId                  = String
  type ApplicationName                = String
  type ApplicationsInfoList           = js.Array[ApplicationInfo]
  type ApplicationsList               = js.Array[ApplicationName]
  type Arn                            = String
  type AutoRollbackEventsList         = js.Array[AutoRollbackEvent]
  type AutoScalingGroupHook           = String
  type AutoScalingGroupList           = js.Array[AutoScalingGroup]
  type AutoScalingGroupName           = String
  type AutoScalingGroupNameList       = js.Array[AutoScalingGroupName]
  type CommitId                       = String
  type DeploymentConfigId             = String
  type DeploymentConfigName           = String
  type DeploymentConfigsList          = js.Array[DeploymentConfigName]
  type DeploymentGroupId              = String
  type DeploymentGroupInfoList        = js.Array[DeploymentGroupInfo]
  type DeploymentGroupName            = String
  type DeploymentGroupsList           = js.Array[DeploymentGroupName]
  type DeploymentId                   = String
  type DeploymentStatusList           = js.Array[DeploymentStatus]
  type DeploymentStatusMessageList    = js.Array[ErrorMessage]
  type DeploymentTargetList           = js.Array[DeploymentTarget]
  type DeploymentsInfoList            = js.Array[DeploymentInfo]
  type DeploymentsList                = js.Array[DeploymentId]
  type Description                    = String
  type Duration                       = Int
  type EC2TagFilterList               = js.Array[EC2TagFilter]
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
  type ErrorMessage                   = String
  type FilterValue                    = String
  type FilterValueList                = js.Array[FilterValue]
  type GitHubAccountTokenName         = String
  type GitHubAccountTokenNameList     = js.Array[GitHubAccountTokenName]
  type IamSessionArn                  = String
  type IamUserArn                     = String
  type InstanceArn                    = String
  type InstanceCount                  = Double
  type InstanceId                     = String
  type InstanceInfoList               = js.Array[InstanceInfo]
  type InstanceName                   = String
  type InstanceNameList               = js.Array[InstanceName]
  type InstanceStatusList             = js.Array[InstanceStatus]
  type InstanceSummaryList            = js.Array[InstanceSummary]
  type InstanceTypeList               = js.Array[InstanceType]
  type InstancesList                  = js.Array[InstanceId]
  type Key                            = String
  type LambdaFunctionAlias            = String
  type LambdaFunctionName             = String
  type LifecycleEventHookExecutionId  = String
  type LifecycleEventList             = js.Array[LifecycleEvent]
  type LifecycleEventName             = String
  type LifecycleMessage               = String
  type ListenerArn                    = String
  type ListenerArnList                = js.Array[ListenerArn]
  type LogTail                        = String
  type Message                        = String
  type MinimumHealthyHostsValue       = Int
  type NextToken                      = String
  type NullableBoolean                = Boolean
  type OnPremisesTagSetList           = js.Array[TagFilterList]
  type Percentage                     = Int
  type RawStringContent               = String
  type RawStringSha256                = String
  type Repository                     = String
  type RevisionInfoList               = js.Array[RevisionInfo]
  type RevisionLocationList           = js.Array[RevisionLocation]
  type Role                           = String
  type S3Bucket                       = String
  type S3Key                          = String
  type ScriptName                     = String
  type TagFilterList                  = js.Array[TagFilter]
  type TagKeyList                     = js.Array[Key]
  type TagList                        = js.Array[Tag]
  type TargetArn                      = String
  type TargetFilters                  = js.Dictionary[FilterValueList]
  type TargetGroupInfoList            = js.Array[TargetGroupInfo]
  type TargetGroupName                = String
  type TargetGroupPairInfoList        = js.Array[TargetGroupPairInfo]
  type TargetId                       = String
  type TargetIdList                   = js.Array[TargetId]
  type Time                           = js.Date
  type Timestamp                      = js.Date
  type TrafficWeight                  = Double
  type TriggerConfigList              = js.Array[TriggerConfig]
  type TriggerEventTypeList           = js.Array[TriggerEventType]
  type TriggerName                    = String
  type TriggerTargetArn               = String
  type Value                          = String
  type Version                        = String
  type VersionId                      = String
  type WaitTimeInMins                 = Int

  implicit final class CodeDeployOps(private val service: CodeDeploy) extends AnyVal {

    @inline def addTagsToOnPremisesInstancesFuture(params: AddTagsToOnPremisesInstancesInput): Future[js.Object] =
      service.addTagsToOnPremisesInstances(params).promise().toFuture
    @inline def batchGetApplicationRevisionsFuture(
        params: BatchGetApplicationRevisionsInput
    ): Future[BatchGetApplicationRevisionsOutput] = service.batchGetApplicationRevisions(params).promise().toFuture
    @inline def batchGetApplicationsFuture(params: BatchGetApplicationsInput): Future[BatchGetApplicationsOutput] =
      service.batchGetApplications(params).promise().toFuture
    @inline def batchGetDeploymentGroupsFuture(
        params: BatchGetDeploymentGroupsInput
    ): Future[BatchGetDeploymentGroupsOutput] = service.batchGetDeploymentGroups(params).promise().toFuture
    @inline def batchGetDeploymentTargetsFuture(
        params: BatchGetDeploymentTargetsInput
    ): Future[BatchGetDeploymentTargetsOutput] = service.batchGetDeploymentTargets(params).promise().toFuture
    @inline def batchGetDeploymentsFuture(params: BatchGetDeploymentsInput): Future[BatchGetDeploymentsOutput] =
      service.batchGetDeployments(params).promise().toFuture
    @inline def batchGetOnPremisesInstancesFuture(
        params: BatchGetOnPremisesInstancesInput
    ): Future[BatchGetOnPremisesInstancesOutput] = service.batchGetOnPremisesInstances(params).promise().toFuture
    @inline def continueDeploymentFuture(params: ContinueDeploymentInput): Future[js.Object] =
      service.continueDeployment(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationInput): Future[CreateApplicationOutput] =
      service.createApplication(params).promise().toFuture
    @inline def createDeploymentConfigFuture(
        params: CreateDeploymentConfigInput
    ): Future[CreateDeploymentConfigOutput] = service.createDeploymentConfig(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentInput): Future[CreateDeploymentOutput] =
      service.createDeployment(params).promise().toFuture
    @inline def createDeploymentGroupFuture(params: CreateDeploymentGroupInput): Future[CreateDeploymentGroupOutput] =
      service.createDeploymentGroup(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationInput): Future[js.Object] =
      service.deleteApplication(params).promise().toFuture
    @inline def deleteDeploymentConfigFuture(params: DeleteDeploymentConfigInput): Future[js.Object] =
      service.deleteDeploymentConfig(params).promise().toFuture
    @inline def deleteDeploymentGroupFuture(params: DeleteDeploymentGroupInput): Future[DeleteDeploymentGroupOutput] =
      service.deleteDeploymentGroup(params).promise().toFuture
    @inline def deleteGitHubAccountTokenFuture(
        params: DeleteGitHubAccountTokenInput
    ): Future[DeleteGitHubAccountTokenOutput] = service.deleteGitHubAccountToken(params).promise().toFuture
    @inline def deregisterOnPremisesInstanceFuture(params: DeregisterOnPremisesInstanceInput): Future[js.Object] =
      service.deregisterOnPremisesInstance(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationInput): Future[GetApplicationOutput] =
      service.getApplication(params).promise().toFuture
    @inline def getApplicationRevisionFuture(
        params: GetApplicationRevisionInput
    ): Future[GetApplicationRevisionOutput] = service.getApplicationRevision(params).promise().toFuture
    @inline def getDeploymentConfigFuture(params: GetDeploymentConfigInput): Future[GetDeploymentConfigOutput] =
      service.getDeploymentConfig(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentInput): Future[GetDeploymentOutput] =
      service.getDeployment(params).promise().toFuture
    @inline def getDeploymentGroupFuture(params: GetDeploymentGroupInput): Future[GetDeploymentGroupOutput] =
      service.getDeploymentGroup(params).promise().toFuture
    @inline def getDeploymentTargetFuture(params: GetDeploymentTargetInput): Future[GetDeploymentTargetOutput] =
      service.getDeploymentTarget(params).promise().toFuture
    @inline def getOnPremisesInstanceFuture(params: GetOnPremisesInstanceInput): Future[GetOnPremisesInstanceOutput] =
      service.getOnPremisesInstance(params).promise().toFuture
    @inline def listApplicationRevisionsFuture(
        params: ListApplicationRevisionsInput
    ): Future[ListApplicationRevisionsOutput] = service.listApplicationRevisions(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsInput): Future[ListApplicationsOutput] =
      service.listApplications(params).promise().toFuture
    @inline def listDeploymentConfigsFuture(params: ListDeploymentConfigsInput): Future[ListDeploymentConfigsOutput] =
      service.listDeploymentConfigs(params).promise().toFuture
    @inline def listDeploymentGroupsFuture(params: ListDeploymentGroupsInput): Future[ListDeploymentGroupsOutput] =
      service.listDeploymentGroups(params).promise().toFuture
    @inline def listDeploymentTargetsFuture(params: ListDeploymentTargetsInput): Future[ListDeploymentTargetsOutput] =
      service.listDeploymentTargets(params).promise().toFuture
    @inline def listDeploymentsFuture(params: ListDeploymentsInput): Future[ListDeploymentsOutput] =
      service.listDeployments(params).promise().toFuture
    @inline def listGitHubAccountTokenNamesFuture(
        params: ListGitHubAccountTokenNamesInput
    ): Future[ListGitHubAccountTokenNamesOutput] = service.listGitHubAccountTokenNames(params).promise().toFuture
    @inline def listOnPremisesInstancesFuture(
        params: ListOnPremisesInstancesInput
    ): Future[ListOnPremisesInstancesOutput] = service.listOnPremisesInstances(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putLifecycleEventHookExecutionStatusFuture(
        params: PutLifecycleEventHookExecutionStatusInput
    ): Future[PutLifecycleEventHookExecutionStatusOutput] =
      service.putLifecycleEventHookExecutionStatus(params).promise().toFuture
    @inline def registerApplicationRevisionFuture(params: RegisterApplicationRevisionInput): Future[js.Object] =
      service.registerApplicationRevision(params).promise().toFuture
    @inline def registerOnPremisesInstanceFuture(params: RegisterOnPremisesInstanceInput): Future[js.Object] =
      service.registerOnPremisesInstance(params).promise().toFuture
    @inline def removeTagsFromOnPremisesInstancesFuture(
        params: RemoveTagsFromOnPremisesInstancesInput
    ): Future[js.Object] = service.removeTagsFromOnPremisesInstances(params).promise().toFuture
    @inline def stopDeploymentFuture(params: StopDeploymentInput): Future[StopDeploymentOutput] =
      service.stopDeployment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationInput): Future[js.Object] =
      service.updateApplication(params).promise().toFuture
    @inline def updateDeploymentGroupFuture(params: UpdateDeploymentGroupInput): Future[UpdateDeploymentGroupOutput] =
      service.updateDeploymentGroup(params).promise().toFuture
  }
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
    def getDeploymentTarget(params: GetDeploymentTargetInput): Request[GetDeploymentTargetOutput]          = js.native
    def getOnPremisesInstance(params: GetOnPremisesInstanceInput): Request[GetOnPremisesInstanceOutput]    = js.native
    def listApplicationRevisions(params: ListApplicationRevisionsInput): Request[ListApplicationRevisionsOutput] =
      js.native
    def listApplications(params: ListApplicationsInput): Request[ListApplicationsOutput]                = js.native
    def listDeploymentConfigs(params: ListDeploymentConfigsInput): Request[ListDeploymentConfigsOutput] = js.native
    def listDeploymentGroups(params: ListDeploymentGroupsInput): Request[ListDeploymentGroupsOutput]    = js.native
    def listDeploymentTargets(params: ListDeploymentTargetsInput): Request[ListDeploymentTargetsOutput] = js.native
    def listDeployments(params: ListDeploymentsInput): Request[ListDeploymentsOutput]                   = js.native
    def listGitHubAccountTokenNames(
        params: ListGitHubAccountTokenNamesInput
    ): Request[ListGitHubAccountTokenNamesOutput] = js.native
    def listOnPremisesInstances(params: ListOnPremisesInstancesInput): Request[ListOnPremisesInstancesOutput] =
      js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def putLifecycleEventHookExecutionStatus(
        params: PutLifecycleEventHookExecutionStatusInput
    ): Request[PutLifecycleEventHookExecutionStatusOutput]                                        = js.native
    def registerApplicationRevision(params: RegisterApplicationRevisionInput): Request[js.Object] = js.native
    def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput): Request[js.Object]   = js.native
    def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput): Request[js.Object] =
      js.native
    def stopDeployment(params: StopDeploymentInput): Request[StopDeploymentOutput]                      = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                               = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                         = js.native
    def updateApplication(params: UpdateApplicationInput): Request[js.Object]                           = js.native
    def updateDeploymentGroup(params: UpdateDeploymentGroupInput): Request[UpdateDeploymentGroupOutput] = js.native
    @deprecated(
      "This operation is deprecated, use BatchGetDeploymentTargets instead.",
      "forever"
    ) def batchGetDeploymentInstances(
        params: BatchGetDeploymentInstancesInput
    ): Request[BatchGetDeploymentInstancesOutput] = js.native
    @deprecated(
      "This operation is deprecated, use ContinueDeployment with DeploymentWaitType instead.",
      "forever"
    ) def skipWaitTimeForInstanceTermination(params: SkipWaitTimeForInstanceTerminationInput): Request[js.Object] =
      js.native
    @deprecated("This operation is deprecated, use GetDeploymentTarget instead.", "forever") def getDeploymentInstance(
        params: GetDeploymentInstanceInput
    ): Request[GetDeploymentInstanceOutput] = js.native
    @deprecated(
      "This operation is deprecated, use ListDeploymentTargets instead.",
      "forever"
    ) def listDeploymentInstances(params: ListDeploymentInstancesInput): Request[ListDeploymentInstancesOutput] =
      js.native
  }

  /**
    * Represents the input of, and adds tags to, an on-premises instance operation.
    */
  @js.native
  @Factory
  trait AddTagsToOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
    var tags: TagList
  }

  /**
    * Information about an alarm.
    */
  @js.native
  @Factory
  trait Alarm extends js.Object {
    var name: js.UndefOr[AlarmName]
  }

  /**
    * Information about alarms associated with the deployment group.
    */
  @js.native
  @Factory
  trait AlarmConfiguration extends js.Object {
    var alarms: js.UndefOr[AlarmList]
    var enabled: js.UndefOr[Boolean]
    var ignorePollAlarmFailure: js.UndefOr[Boolean]
  }

  /**
    * A revision for an AWS Lambda or Amazon ECS deployment that is a YAML-formatted or JSON-formatted string. For AWS Lambda and Amazon ECS deployments, the revision is the same as the AppSpec file. This method replaces the deprecated <code>RawString</code> data type.
    */
  @js.native
  @Factory
  trait AppSpecContent extends js.Object {
    var content: js.UndefOr[RawStringContent]
    var sha256: js.UndefOr[RawStringSha256]
  }

  /**
    * Information about an application.
    */
  @js.native
  @Factory
  trait ApplicationInfo extends js.Object {
    var applicationId: js.UndefOr[ApplicationId]
    var applicationName: js.UndefOr[ApplicationName]
    var computePlatform: js.UndefOr[ComputePlatform]
    var createTime: js.UndefOr[Timestamp]
    var gitHubAccountName: js.UndefOr[GitHubAccountTokenName]
    var linkedToGitHub: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait ApplicationRevisionSortBy extends js.Any
  object ApplicationRevisionSortBy extends js.Object {
    val registerTime  = "registerTime".asInstanceOf[ApplicationRevisionSortBy]
    val firstUsedTime = "firstUsedTime".asInstanceOf[ApplicationRevisionSortBy]
    val lastUsedTime  = "lastUsedTime".asInstanceOf[ApplicationRevisionSortBy]

    val values = js.Object.freeze(js.Array(registerTime, firstUsedTime, lastUsedTime))
  }

  /**
    * Information about a configuration for automatically rolling back to a previous version of an application revision when a deployment is not completed successfully.
    */
  @js.native
  @Factory
  trait AutoRollbackConfiguration extends js.Object {
    var enabled: js.UndefOr[Boolean]
    var events: js.UndefOr[AutoRollbackEventsList]
  }

  @js.native
  sealed trait AutoRollbackEvent extends js.Any
  object AutoRollbackEvent extends js.Object {
    val DEPLOYMENT_FAILURE         = "DEPLOYMENT_FAILURE".asInstanceOf[AutoRollbackEvent]
    val DEPLOYMENT_STOP_ON_ALARM   = "DEPLOYMENT_STOP_ON_ALARM".asInstanceOf[AutoRollbackEvent]
    val DEPLOYMENT_STOP_ON_REQUEST = "DEPLOYMENT_STOP_ON_REQUEST".asInstanceOf[AutoRollbackEvent]

    val values = js.Object.freeze(js.Array(DEPLOYMENT_FAILURE, DEPLOYMENT_STOP_ON_ALARM, DEPLOYMENT_STOP_ON_REQUEST))
  }

  /**
    * Information about an Auto Scaling group.
    */
  @js.native
  @Factory
  trait AutoScalingGroup extends js.Object {
    var hook: js.UndefOr[AutoScalingGroupHook]
    var name: js.UndefOr[AutoScalingGroupName]
  }

  /**
    * Represents the input of a BatchGetApplicationRevisions operation.
    */
  @js.native
  @Factory
  trait BatchGetApplicationRevisionsInput extends js.Object {
    var applicationName: ApplicationName
    var revisions: RevisionLocationList
  }

  /**
    * Represents the output of a BatchGetApplicationRevisions operation.
    */
  @js.native
  @Factory
  trait BatchGetApplicationRevisionsOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var errorMessage: js.UndefOr[ErrorMessage]
    var revisions: js.UndefOr[RevisionInfoList]
  }

  /**
    * Represents the input of a BatchGetApplications operation.
    */
  @js.native
  @Factory
  trait BatchGetApplicationsInput extends js.Object {
    var applicationNames: ApplicationsList
  }

  /**
    * Represents the output of a BatchGetApplications operation.
    */
  @js.native
  @Factory
  trait BatchGetApplicationsOutput extends js.Object {
    var applicationsInfo: js.UndefOr[ApplicationsInfoList]
  }

  /**
    * Represents the input of a BatchGetDeploymentGroups operation.
    */
  @js.native
  @Factory
  trait BatchGetDeploymentGroupsInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupNames: DeploymentGroupsList
  }

  /**
    * Represents the output of a BatchGetDeploymentGroups operation.
    */
  @js.native
  @Factory
  trait BatchGetDeploymentGroupsOutput extends js.Object {
    var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  /**
    * Represents the input of a BatchGetDeploymentInstances operation.
    */
  @js.native
  @Factory
  trait BatchGetDeploymentInstancesInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceIds: InstancesList
  }

  /**
    * Represents the output of a BatchGetDeploymentInstances operation.
    */
  @js.native
  @Factory
  trait BatchGetDeploymentInstancesOutput extends js.Object {
    var errorMessage: js.UndefOr[ErrorMessage]
    var instancesSummary: js.UndefOr[InstanceSummaryList]
  }

  @js.native
  @Factory
  trait BatchGetDeploymentTargetsInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var targetIds: js.UndefOr[TargetIdList]
  }

  @js.native
  @Factory
  trait BatchGetDeploymentTargetsOutput extends js.Object {
    var deploymentTargets: js.UndefOr[DeploymentTargetList]
  }

  /**
    * Represents the input of a BatchGetDeployments operation.
    */
  @js.native
  @Factory
  trait BatchGetDeploymentsInput extends js.Object {
    var deploymentIds: DeploymentsList
  }

  /**
    * Represents the output of a BatchGetDeployments operation.
    */
  @js.native
  @Factory
  trait BatchGetDeploymentsOutput extends js.Object {
    var deploymentsInfo: js.UndefOr[DeploymentsInfoList]
  }

  /**
    * Represents the input of a BatchGetOnPremisesInstances operation.
    */
  @js.native
  @Factory
  trait BatchGetOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
  }

  /**
    * Represents the output of a BatchGetOnPremisesInstances operation.
    */
  @js.native
  @Factory
  trait BatchGetOnPremisesInstancesOutput extends js.Object {
    var instanceInfos: js.UndefOr[InstanceInfoList]
  }

  /**
    * Information about blue/green deployment options for a deployment group.
    */
  @js.native
  @Factory
  trait BlueGreenDeploymentConfiguration extends js.Object {
    var deploymentReadyOption: js.UndefOr[DeploymentReadyOption]
    var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption]
    var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption]
  }

  /**
    * Information about whether instances in the original environment are terminated when a blue/green deployment is successful. <code>BlueInstanceTerminationOption</code> does not apply to Lambda deployments.
    */
  @js.native
  @Factory
  trait BlueInstanceTerminationOption extends js.Object {
    var action: js.UndefOr[InstanceAction]
    var terminationWaitTimeInMinutes: js.UndefOr[Duration]
  }

  @js.native
  sealed trait BundleType extends js.Any
  object BundleType extends js.Object {
    val tar  = "tar".asInstanceOf[BundleType]
    val tgz  = "tgz".asInstanceOf[BundleType]
    val zip  = "zip".asInstanceOf[BundleType]
    val YAML = "YAML".asInstanceOf[BundleType]
    val JSON = "JSON".asInstanceOf[BundleType]

    val values = js.Object.freeze(js.Array(tar, tgz, zip, YAML, JSON))
  }

  @js.native
  sealed trait ComputePlatform extends js.Any
  object ComputePlatform extends js.Object {
    val Server = "Server".asInstanceOf[ComputePlatform]
    val Lambda = "Lambda".asInstanceOf[ComputePlatform]
    val ECS    = "ECS".asInstanceOf[ComputePlatform]

    val values = js.Object.freeze(js.Array(Server, Lambda, ECS))
  }

  @js.native
  @Factory
  trait ContinueDeploymentInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var deploymentWaitType: js.UndefOr[DeploymentWaitType]
  }

  /**
    * Represents the input of a CreateApplication operation.
    */
  @js.native
  @Factory
  trait CreateApplicationInput extends js.Object {
    var applicationName: ApplicationName
    var computePlatform: js.UndefOr[ComputePlatform]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Represents the output of a CreateApplication operation.
    */
  @js.native
  @Factory
  trait CreateApplicationOutput extends js.Object {
    var applicationId: js.UndefOr[ApplicationId]
  }

  /**
    * Represents the input of a CreateDeploymentConfig operation.
    */
  @js.native
  @Factory
  trait CreateDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
    var computePlatform: js.UndefOr[ComputePlatform]
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts]
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig]
  }

  /**
    * Represents the output of a CreateDeploymentConfig operation.
    */
  @js.native
  @Factory
  trait CreateDeploymentConfigOutput extends js.Object {
    var deploymentConfigId: js.UndefOr[DeploymentConfigId]
  }

  /**
    * Represents the input of a CreateDeploymentGroup operation.
    */
  @js.native
  @Factory
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
    var tags: js.UndefOr[TagList]
    var triggerConfigurations: js.UndefOr[TriggerConfigList]
  }

  /**
    * Represents the output of a CreateDeploymentGroup operation.
    */
  @js.native
  @Factory
  trait CreateDeploymentGroupOutput extends js.Object {
    var deploymentGroupId: js.UndefOr[DeploymentGroupId]
  }

  /**
    * Represents the input of a CreateDeployment operation.
    */
  @js.native
  @Factory
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

  /**
    * Represents the output of a CreateDeployment operation.
    */
  @js.native
  @Factory
  trait CreateDeploymentOutput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  /**
    * Represents the input of a DeleteApplication operation.
    */
  @js.native
  @Factory
  trait DeleteApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  /**
    * Represents the input of a DeleteDeploymentConfig operation.
    */
  @js.native
  @Factory
  trait DeleteDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
  }

  /**
    * Represents the input of a DeleteDeploymentGroup operation.
    */
  @js.native
  @Factory
  trait DeleteDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
  }

  /**
    * Represents the output of a DeleteDeploymentGroup operation.
    */
  @js.native
  @Factory
  trait DeleteDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList]
  }

  /**
    * Represents the input of a DeleteGitHubAccount operation.
    */
  @js.native
  @Factory
  trait DeleteGitHubAccountTokenInput extends js.Object {
    var tokenName: js.UndefOr[GitHubAccountTokenName]
  }

  /**
    * Represents the output of a DeleteGitHubAccountToken operation.
    */
  @js.native
  @Factory
  trait DeleteGitHubAccountTokenOutput extends js.Object {
    var tokenName: js.UndefOr[GitHubAccountTokenName]
  }

  /**
    * Information about a deployment configuration.
    */
  @js.native
  @Factory
  trait DeploymentConfigInfo extends js.Object {
    var computePlatform: js.UndefOr[ComputePlatform]
    var createTime: js.UndefOr[Timestamp]
    var deploymentConfigId: js.UndefOr[DeploymentConfigId]
    var deploymentConfigName: js.UndefOr[DeploymentConfigName]
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts]
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig]
  }

  @js.native
  sealed trait DeploymentCreator extends js.Any
  object DeploymentCreator extends js.Object {
    val user               = "user".asInstanceOf[DeploymentCreator]
    val autoscaling        = "autoscaling".asInstanceOf[DeploymentCreator]
    val codeDeployRollback = "codeDeployRollback".asInstanceOf[DeploymentCreator]

    val values = js.Object.freeze(js.Array(user, autoscaling, codeDeployRollback))
  }

  /**
    * Information about a deployment group.
    */
  @js.native
  @Factory
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

  /**
    * Information about a deployment.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait DeploymentOption extends js.Any
  object DeploymentOption extends js.Object {
    val WITH_TRAFFIC_CONTROL    = "WITH_TRAFFIC_CONTROL".asInstanceOf[DeploymentOption]
    val WITHOUT_TRAFFIC_CONTROL = "WITHOUT_TRAFFIC_CONTROL".asInstanceOf[DeploymentOption]

    val values = js.Object.freeze(js.Array(WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL))
  }

  /**
    * Information about the deployment status of the instances in the deployment.
    */
  @js.native
  @Factory
  trait DeploymentOverview extends js.Object {
    var Failed: js.UndefOr[InstanceCount]
    var InProgress: js.UndefOr[InstanceCount]
    var Pending: js.UndefOr[InstanceCount]
    var Ready: js.UndefOr[InstanceCount]
    var Skipped: js.UndefOr[InstanceCount]
    var Succeeded: js.UndefOr[InstanceCount]
  }

  @js.native
  sealed trait DeploymentReadyAction extends js.Any
  object DeploymentReadyAction extends js.Object {
    val CONTINUE_DEPLOYMENT = "CONTINUE_DEPLOYMENT".asInstanceOf[DeploymentReadyAction]
    val STOP_DEPLOYMENT     = "STOP_DEPLOYMENT".asInstanceOf[DeploymentReadyAction]

    val values = js.Object.freeze(js.Array(CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT))
  }

  /**
    * Information about how traffic is rerouted to instances in a replacement environment in a blue/green deployment.
    */
  @js.native
  @Factory
  trait DeploymentReadyOption extends js.Object {
    var actionOnTimeout: js.UndefOr[DeploymentReadyAction]
    var waitTimeInMinutes: js.UndefOr[Duration]
  }

  @js.native
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus extends js.Object {
    val Created    = "Created".asInstanceOf[DeploymentStatus]
    val Queued     = "Queued".asInstanceOf[DeploymentStatus]
    val InProgress = "InProgress".asInstanceOf[DeploymentStatus]
    val Succeeded  = "Succeeded".asInstanceOf[DeploymentStatus]
    val Failed     = "Failed".asInstanceOf[DeploymentStatus]
    val Stopped    = "Stopped".asInstanceOf[DeploymentStatus]
    val Ready      = "Ready".asInstanceOf[DeploymentStatus]

    val values = js.Object.freeze(js.Array(Created, Queued, InProgress, Succeeded, Failed, Stopped, Ready))
  }

  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  @js.native
  @Factory
  trait DeploymentStyle extends js.Object {
    var deploymentOption: js.UndefOr[DeploymentOption]
    var deploymentType: js.UndefOr[DeploymentType]
  }

  /**
    * Information about the deployment target.
    */
  @js.native
  @Factory
  trait DeploymentTarget extends js.Object {
    var deploymentTargetType: js.UndefOr[DeploymentTargetType]
    var ecsTarget: js.UndefOr[ECSTarget]
    var instanceTarget: js.UndefOr[InstanceTarget]
    var lambdaTarget: js.UndefOr[LambdaTarget]
  }

  @js.native
  sealed trait DeploymentTargetType extends js.Any
  object DeploymentTargetType extends js.Object {
    val InstanceTarget = "InstanceTarget".asInstanceOf[DeploymentTargetType]
    val LambdaTarget   = "LambdaTarget".asInstanceOf[DeploymentTargetType]
    val ECSTarget      = "ECSTarget".asInstanceOf[DeploymentTargetType]

    val values = js.Object.freeze(js.Array(InstanceTarget, LambdaTarget, ECSTarget))
  }

  @js.native
  sealed trait DeploymentType extends js.Any
  object DeploymentType extends js.Object {
    val IN_PLACE   = "IN_PLACE".asInstanceOf[DeploymentType]
    val BLUE_GREEN = "BLUE_GREEN".asInstanceOf[DeploymentType]

    val values = js.Object.freeze(js.Array(IN_PLACE, BLUE_GREEN))
  }

  @js.native
  sealed trait DeploymentWaitType extends js.Any
  object DeploymentWaitType extends js.Object {
    val READY_WAIT       = "READY_WAIT".asInstanceOf[DeploymentWaitType]
    val TERMINATION_WAIT = "TERMINATION_WAIT".asInstanceOf[DeploymentWaitType]

    val values = js.Object.freeze(js.Array(READY_WAIT, TERMINATION_WAIT))
  }

  /**
    * Represents the input of a DeregisterOnPremisesInstance operation.
    */
  @js.native
  @Factory
  trait DeregisterOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
  }

  /**
    * Diagnostic information about executable scripts that are part of a deployment.
    */
  @js.native
  @Factory
  trait Diagnostics extends js.Object {
    var errorCode: js.UndefOr[LifecycleErrorCode]
    var logTail: js.UndefOr[LogTail]
    var message: js.UndefOr[LifecycleMessage]
    var scriptName: js.UndefOr[ScriptName]
  }

  /**
    * Information about an EC2 tag filter.
    */
  @js.native
  @Factory
  trait EC2TagFilter extends js.Object {
    var Key: js.UndefOr[Key]
    var Type: js.UndefOr[EC2TagFilterType]
    var Value: js.UndefOr[Value]
  }

  @js.native
  sealed trait EC2TagFilterType extends js.Any
  object EC2TagFilterType extends js.Object {
    val KEY_ONLY      = "KEY_ONLY".asInstanceOf[EC2TagFilterType]
    val VALUE_ONLY    = "VALUE_ONLY".asInstanceOf[EC2TagFilterType]
    val KEY_AND_VALUE = "KEY_AND_VALUE".asInstanceOf[EC2TagFilterType]

    val values = js.Object.freeze(js.Array(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE))
  }

  /**
    * Information about groups of EC2 instance tags.
    */
  @js.native
  @Factory
  trait EC2TagSet extends js.Object {
    var ec2TagSetList: js.UndefOr[EC2TagSetList]
  }

  /**
    * Contains the service and cluster names used to identify an Amazon ECS deployment's target.
    */
  @js.native
  @Factory
  trait ECSService extends js.Object {
    var clusterName: js.UndefOr[ECSClusterName]
    var serviceName: js.UndefOr[ECSServiceName]
  }

  /**
    * Information about the target of an Amazon ECS deployment.
    */
  @js.native
  @Factory
  trait ECSTarget extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lastUpdatedAt: js.UndefOr[Time]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[TargetStatus]
    var targetArn: js.UndefOr[TargetArn]
    var targetId: js.UndefOr[TargetId]
    var taskSetsInfo: js.UndefOr[ECSTaskSetList]
  }

  /**
    * Information about a set of Amazon ECS tasks in an AWS CodeDeploy deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic. An AWS CodeDeploy application that uses the Amazon ECS compute platform deploys a containerized application in an Amazon ECS service as a task set.
    */
  @js.native
  @Factory
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

  /**
    * Information about a load balancer in Elastic Load Balancing to use in a deployment. Instances are registered directly with a load balancer, and traffic is routed to the load balancer.
    */
  @js.native
  @Factory
  trait ELBInfo extends js.Object {
    var name: js.UndefOr[ELBName]
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val AGENT_ISSUE                         = "AGENT_ISSUE".asInstanceOf[ErrorCode]
    val ALARM_ACTIVE                        = "ALARM_ACTIVE".asInstanceOf[ErrorCode]
    val APPLICATION_MISSING                 = "APPLICATION_MISSING".asInstanceOf[ErrorCode]
    val AUTOSCALING_VALIDATION_ERROR        = "AUTOSCALING_VALIDATION_ERROR".asInstanceOf[ErrorCode]
    val AUTO_SCALING_CONFIGURATION          = "AUTO_SCALING_CONFIGURATION".asInstanceOf[ErrorCode]
    val AUTO_SCALING_IAM_ROLE_PERMISSIONS   = "AUTO_SCALING_IAM_ROLE_PERMISSIONS".asInstanceOf[ErrorCode]
    val CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND = "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND".asInstanceOf[ErrorCode]
    val CUSTOMER_APPLICATION_UNHEALTHY      = "CUSTOMER_APPLICATION_UNHEALTHY".asInstanceOf[ErrorCode]
    val DEPLOYMENT_GROUP_MISSING            = "DEPLOYMENT_GROUP_MISSING".asInstanceOf[ErrorCode]
    val ECS_UPDATE_ERROR                    = "ECS_UPDATE_ERROR".asInstanceOf[ErrorCode]
    val ELASTIC_LOAD_BALANCING_INVALID      = "ELASTIC_LOAD_BALANCING_INVALID".asInstanceOf[ErrorCode]
    val ELB_INVALID_INSTANCE                = "ELB_INVALID_INSTANCE".asInstanceOf[ErrorCode]
    val HEALTH_CONSTRAINTS                  = "HEALTH_CONSTRAINTS".asInstanceOf[ErrorCode]
    val HEALTH_CONSTRAINTS_INVALID          = "HEALTH_CONSTRAINTS_INVALID".asInstanceOf[ErrorCode]
    val HOOK_EXECUTION_FAILURE              = "HOOK_EXECUTION_FAILURE".asInstanceOf[ErrorCode]
    val IAM_ROLE_MISSING                    = "IAM_ROLE_MISSING".asInstanceOf[ErrorCode]
    val IAM_ROLE_PERMISSIONS                = "IAM_ROLE_PERMISSIONS".asInstanceOf[ErrorCode]
    val INTERNAL_ERROR                      = "INTERNAL_ERROR".asInstanceOf[ErrorCode]
    val INVALID_ECS_SERVICE                 = "INVALID_ECS_SERVICE".asInstanceOf[ErrorCode]
    val INVALID_LAMBDA_CONFIGURATION        = "INVALID_LAMBDA_CONFIGURATION".asInstanceOf[ErrorCode]
    val INVALID_LAMBDA_FUNCTION             = "INVALID_LAMBDA_FUNCTION".asInstanceOf[ErrorCode]
    val INVALID_REVISION                    = "INVALID_REVISION".asInstanceOf[ErrorCode]
    val MANUAL_STOP                         = "MANUAL_STOP".asInstanceOf[ErrorCode]
    val MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION =
      "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION".asInstanceOf[ErrorCode]
    val MISSING_ELB_INFORMATION = "MISSING_ELB_INFORMATION".asInstanceOf[ErrorCode]
    val MISSING_GITHUB_TOKEN    = "MISSING_GITHUB_TOKEN".asInstanceOf[ErrorCode]
    val NO_EC2_SUBSCRIPTION     = "NO_EC2_SUBSCRIPTION".asInstanceOf[ErrorCode]
    val NO_INSTANCES            = "NO_INSTANCES".asInstanceOf[ErrorCode]
    val OVER_MAX_INSTANCES      = "OVER_MAX_INSTANCES".asInstanceOf[ErrorCode]
    val RESOURCE_LIMIT_EXCEEDED = "RESOURCE_LIMIT_EXCEEDED".asInstanceOf[ErrorCode]
    val REVISION_MISSING        = "REVISION_MISSING".asInstanceOf[ErrorCode]
    val THROTTLED               = "THROTTLED".asInstanceOf[ErrorCode]
    val TIMEOUT                 = "TIMEOUT".asInstanceOf[ErrorCode]

    val values = js.Object.freeze(
      js.Array(
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
        TIMEOUT
      )
    )
  }

  /**
    * Information about a deployment error.
    */
  @js.native
  @Factory
  trait ErrorInformation extends js.Object {
    var code: js.UndefOr[ErrorCode]
    var message: js.UndefOr[ErrorMessage]
  }

  @js.native
  sealed trait FileExistsBehavior extends js.Any
  object FileExistsBehavior extends js.Object {
    val DISALLOW  = "DISALLOW".asInstanceOf[FileExistsBehavior]
    val OVERWRITE = "OVERWRITE".asInstanceOf[FileExistsBehavior]
    val RETAIN    = "RETAIN".asInstanceOf[FileExistsBehavior]

    val values = js.Object.freeze(js.Array(DISALLOW, OVERWRITE, RETAIN))
  }

  /**
    * Information about an application revision.
    */
  @js.native
  @Factory
  trait GenericRevisionInfo extends js.Object {
    var deploymentGroups: js.UndefOr[DeploymentGroupsList]
    var description: js.UndefOr[Description]
    var firstUsedTime: js.UndefOr[Timestamp]
    var lastUsedTime: js.UndefOr[Timestamp]
    var registerTime: js.UndefOr[Timestamp]
  }

  /**
    * Represents the input of a GetApplication operation.
    */
  @js.native
  @Factory
  trait GetApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  /**
    * Represents the output of a GetApplication operation.
    */
  @js.native
  @Factory
  trait GetApplicationOutput extends js.Object {
    var application: js.UndefOr[ApplicationInfo]
  }

  /**
    * Represents the input of a GetApplicationRevision operation.
    */
  @js.native
  @Factory
  trait GetApplicationRevisionInput extends js.Object {
    var applicationName: ApplicationName
    var revision: RevisionLocation
  }

  /**
    * Represents the output of a GetApplicationRevision operation.
    */
  @js.native
  @Factory
  trait GetApplicationRevisionOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var revision: js.UndefOr[RevisionLocation]
    var revisionInfo: js.UndefOr[GenericRevisionInfo]
  }

  /**
    * Represents the input of a GetDeploymentConfig operation.
    */
  @js.native
  @Factory
  trait GetDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
  }

  /**
    * Represents the output of a GetDeploymentConfig operation.
    */
  @js.native
  @Factory
  trait GetDeploymentConfigOutput extends js.Object {
    var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo]
  }

  /**
    * Represents the input of a GetDeploymentGroup operation.
    */
  @js.native
  @Factory
  trait GetDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
  }

  /**
    * Represents the output of a GetDeploymentGroup operation.
    */
  @js.native
  @Factory
  trait GetDeploymentGroupOutput extends js.Object {
    var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo]
  }

  /**
    * Represents the input of a GetDeployment operation.
    */
  @js.native
  @Factory
  trait GetDeploymentInput extends js.Object {
    var deploymentId: DeploymentId
  }

  /**
    * Represents the input of a GetDeploymentInstance operation.
    */
  @js.native
  @Factory
  trait GetDeploymentInstanceInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceId: InstanceId
  }

  /**
    * Represents the output of a GetDeploymentInstance operation.
    */
  @js.native
  @Factory
  trait GetDeploymentInstanceOutput extends js.Object {
    var instanceSummary: js.UndefOr[InstanceSummary]
  }

  /**
    * Represents the output of a GetDeployment operation.
    */
  @js.native
  @Factory
  trait GetDeploymentOutput extends js.Object {
    var deploymentInfo: js.UndefOr[DeploymentInfo]
  }

  @js.native
  @Factory
  trait GetDeploymentTargetInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var targetId: js.UndefOr[TargetId]
  }

  @js.native
  @Factory
  trait GetDeploymentTargetOutput extends js.Object {
    var deploymentTarget: js.UndefOr[DeploymentTarget]
  }

  /**
    * Represents the input of a GetOnPremisesInstance operation.
    */
  @js.native
  @Factory
  trait GetOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
  }

  /**
    * Represents the output of a GetOnPremisesInstance operation.
    */
  @js.native
  @Factory
  trait GetOnPremisesInstanceOutput extends js.Object {
    var instanceInfo: js.UndefOr[InstanceInfo]
  }

  /**
    * Information about the location of application artifacts stored in GitHub.
    */
  @js.native
  @Factory
  trait GitHubLocation extends js.Object {
    var commitId: js.UndefOr[CommitId]
    var repository: js.UndefOr[Repository]
  }

  @js.native
  sealed trait GreenFleetProvisioningAction extends js.Any
  object GreenFleetProvisioningAction extends js.Object {
    val DISCOVER_EXISTING       = "DISCOVER_EXISTING".asInstanceOf[GreenFleetProvisioningAction]
    val COPY_AUTO_SCALING_GROUP = "COPY_AUTO_SCALING_GROUP".asInstanceOf[GreenFleetProvisioningAction]

    val values = js.Object.freeze(js.Array(DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP))
  }

  /**
    * Information about the instances that belong to the replacement environment in a blue/green deployment.
    */
  @js.native
  @Factory
  trait GreenFleetProvisioningOption extends js.Object {
    var action: js.UndefOr[GreenFleetProvisioningAction]
  }

  @js.native
  sealed trait InstanceAction extends js.Any
  object InstanceAction extends js.Object {
    val TERMINATE  = "TERMINATE".asInstanceOf[InstanceAction]
    val KEEP_ALIVE = "KEEP_ALIVE".asInstanceOf[InstanceAction]

    val values = js.Object.freeze(js.Array(TERMINATE, KEEP_ALIVE))
  }

  /**
    * Information about an on-premises instance.
    */
  @js.native
  @Factory
  trait InstanceInfo extends js.Object {
    var deregisterTime: js.UndefOr[Timestamp]
    var iamSessionArn: js.UndefOr[IamSessionArn]
    var iamUserArn: js.UndefOr[IamUserArn]
    var instanceArn: js.UndefOr[InstanceArn]
    var instanceName: js.UndefOr[InstanceName]
    var registerTime: js.UndefOr[Timestamp]
    var tags: js.UndefOr[TagList]
  }

  @deprecated("InstanceStatus is deprecated, use TargetStatus instead.", "forever")
  @js.native
  sealed trait InstanceStatus extends js.Any
  object InstanceStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[InstanceStatus]
    val InProgress = "InProgress".asInstanceOf[InstanceStatus]
    val Succeeded  = "Succeeded".asInstanceOf[InstanceStatus]
    val Failed     = "Failed".asInstanceOf[InstanceStatus]
    val Skipped    = "Skipped".asInstanceOf[InstanceStatus]
    val Unknown    = "Unknown".asInstanceOf[InstanceStatus]
    val Ready      = "Ready".asInstanceOf[InstanceStatus]

    val values = js.Object.freeze(js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready))
  }

  /**
    * Information about an instance in a deployment.
    */
  @deprecated("InstanceSummary is deprecated, use DeploymentTarget instead.", "forever")
  @js.native
  @Factory
  trait InstanceSummary extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var instanceId: js.UndefOr[InstanceId]
    var instanceType: js.UndefOr[InstanceType]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[InstanceStatus]
  }

  /**
    * A target Amazon EC2 or on-premises instance during a deployment that uses the EC2/On-premises compute platform.
    */
  @js.native
  @Factory
  trait InstanceTarget extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var instanceLabel: js.UndefOr[TargetLabel]
    var lastUpdatedAt: js.UndefOr[Time]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[TargetStatus]
    var targetArn: js.UndefOr[TargetArn]
    var targetId: js.UndefOr[TargetId]
  }

  @js.native
  sealed trait InstanceType extends js.Any
  object InstanceType extends js.Object {
    val Blue  = "Blue".asInstanceOf[InstanceType]
    val Green = "Green".asInstanceOf[InstanceType]

    val values = js.Object.freeze(js.Array(Blue, Green))
  }

  /**
    * Information about a Lambda function specified in a deployment.
    */
  @js.native
  @Factory
  trait LambdaFunctionInfo extends js.Object {
    var currentVersion: js.UndefOr[Version]
    var functionAlias: js.UndefOr[LambdaFunctionAlias]
    var functionName: js.UndefOr[LambdaFunctionName]
    var targetVersion: js.UndefOr[Version]
    var targetVersionWeight: js.UndefOr[TrafficWeight]
  }

  /**
    * Information about the target AWS Lambda function during an AWS Lambda deployment.
    */
  @js.native
  @Factory
  trait LambdaTarget extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lambdaFunctionInfo: js.UndefOr[LambdaFunctionInfo]
    var lastUpdatedAt: js.UndefOr[Time]
    var lifecycleEvents: js.UndefOr[LifecycleEventList]
    var status: js.UndefOr[TargetStatus]
    var targetArn: js.UndefOr[TargetArn]
    var targetId: js.UndefOr[TargetId]
  }

  /**
    * Information about the most recent attempted or successful deployment to a deployment group.
    */
  @js.native
  @Factory
  trait LastDeploymentInfo extends js.Object {
    var createTime: js.UndefOr[Timestamp]
    var deploymentId: js.UndefOr[DeploymentId]
    var endTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DeploymentStatus]
  }

  @js.native
  sealed trait LifecycleErrorCode extends js.Any
  object LifecycleErrorCode extends js.Object {
    val Success             = "Success".asInstanceOf[LifecycleErrorCode]
    val ScriptMissing       = "ScriptMissing".asInstanceOf[LifecycleErrorCode]
    val ScriptNotExecutable = "ScriptNotExecutable".asInstanceOf[LifecycleErrorCode]
    val ScriptTimedOut      = "ScriptTimedOut".asInstanceOf[LifecycleErrorCode]
    val ScriptFailed        = "ScriptFailed".asInstanceOf[LifecycleErrorCode]
    val UnknownError        = "UnknownError".asInstanceOf[LifecycleErrorCode]

    val values = js.Object.freeze(
      js.Array(Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError)
    )
  }

  /**
    * Information about a deployment lifecycle event.
    */
  @js.native
  @Factory
  trait LifecycleEvent extends js.Object {
    var diagnostics: js.UndefOr[Diagnostics]
    var endTime: js.UndefOr[Timestamp]
    var lifecycleEventName: js.UndefOr[LifecycleEventName]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[LifecycleEventStatus]
  }

  @js.native
  sealed trait LifecycleEventStatus extends js.Any
  object LifecycleEventStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[LifecycleEventStatus]
    val InProgress = "InProgress".asInstanceOf[LifecycleEventStatus]
    val Succeeded  = "Succeeded".asInstanceOf[LifecycleEventStatus]
    val Failed     = "Failed".asInstanceOf[LifecycleEventStatus]
    val Skipped    = "Skipped".asInstanceOf[LifecycleEventStatus]
    val Unknown    = "Unknown".asInstanceOf[LifecycleEventStatus]

    val values = js.Object.freeze(js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown))
  }

  /**
    * Represents the input of a ListApplicationRevisions operation.
    */
  @js.native
  @Factory
  trait ListApplicationRevisionsInput extends js.Object {
    var applicationName: ApplicationName
    var deployed: js.UndefOr[ListStateFilterAction]
    var nextToken: js.UndefOr[NextToken]
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3KeyPrefix: js.UndefOr[S3Key]
    var sortBy: js.UndefOr[ApplicationRevisionSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  /**
    * Represents the output of a ListApplicationRevisions operation.
    */
  @js.native
  @Factory
  trait ListApplicationRevisionsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var revisions: js.UndefOr[RevisionLocationList]
  }

  /**
    * Represents the input of a ListApplications operation.
    */
  @js.native
  @Factory
  trait ListApplicationsInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a ListApplications operation.
    */
  @js.native
  @Factory
  trait ListApplicationsOutput extends js.Object {
    var applications: js.UndefOr[ApplicationsList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input of a ListDeploymentConfigs operation.
    */
  @js.native
  @Factory
  trait ListDeploymentConfigsInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a ListDeploymentConfigs operation.
    */
  @js.native
  @Factory
  trait ListDeploymentConfigsOutput extends js.Object {
    var deploymentConfigsList: js.UndefOr[DeploymentConfigsList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input of a ListDeploymentGroups operation.
    */
  @js.native
  @Factory
  trait ListDeploymentGroupsInput extends js.Object {
    var applicationName: ApplicationName
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a ListDeploymentGroups operation.
    */
  @js.native
  @Factory
  trait ListDeploymentGroupsOutput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var deploymentGroups: js.UndefOr[DeploymentGroupsList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input of a ListDeploymentInstances operation.
    */
  @js.native
  @Factory
  trait ListDeploymentInstancesInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceStatusFilter: js.UndefOr[InstanceStatusList]
    var instanceTypeFilter: js.UndefOr[InstanceTypeList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a ListDeploymentInstances operation.
    */
  @js.native
  @Factory
  trait ListDeploymentInstancesOutput extends js.Object {
    var instancesList: js.UndefOr[InstancesList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDeploymentTargetsInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var nextToken: js.UndefOr[NextToken]
    var targetFilters: js.UndefOr[TargetFilters]
  }

  @js.native
  @Factory
  trait ListDeploymentTargetsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var targetIds: js.UndefOr[TargetIdList]
  }

  /**
    * Represents the input of a ListDeployments operation.
    */
  @js.native
  @Factory
  trait ListDeploymentsInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var createTimeRange: js.UndefOr[TimeRange]
    var deploymentGroupName: js.UndefOr[DeploymentGroupName]
    var includeOnlyStatuses: js.UndefOr[DeploymentStatusList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a ListDeployments operation.
    */
  @js.native
  @Factory
  trait ListDeploymentsOutput extends js.Object {
    var deployments: js.UndefOr[DeploymentsList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input of a ListGitHubAccountTokenNames operation.
    */
  @js.native
  @Factory
  trait ListGitHubAccountTokenNamesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a ListGitHubAccountTokenNames operation.
    */
  @js.native
  @Factory
  trait ListGitHubAccountTokenNamesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tokenNameList: js.UndefOr[GitHubAccountTokenNameList]
  }

  /**
    * Represents the input of a ListOnPremisesInstances operation.
    */
  @js.native
  @Factory
  trait ListOnPremisesInstancesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var registrationStatus: js.UndefOr[RegistrationStatus]
    var tagFilters: js.UndefOr[TagFilterList]
  }

  /**
    * Represents the output of the list on-premises instances operation.
    */
  @js.native
  @Factory
  trait ListOnPremisesInstancesOutput extends js.Object {
    var instanceNames: js.UndefOr[InstanceNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  sealed trait ListStateFilterAction extends js.Any
  object ListStateFilterAction extends js.Object {
    val include = "include".asInstanceOf[ListStateFilterAction]
    val exclude = "exclude".asInstanceOf[ListStateFilterAction]
    val ignore  = "ignore".asInstanceOf[ListStateFilterAction]

    val values = js.Object.freeze(js.Array(include, exclude, ignore))
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: Arn
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Information about the Elastic Load Balancing load balancer or target group used in a deployment.
    */
  @js.native
  @Factory
  trait LoadBalancerInfo extends js.Object {
    var elbInfoList: js.UndefOr[ELBInfoList]
    var targetGroupInfoList: js.UndefOr[TargetGroupInfoList]
    var targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList]
  }

  /**
    * Information about minimum healthy instance.
    */
  @js.native
  @Factory
  trait MinimumHealthyHosts extends js.Object {
    var `type`: js.UndefOr[MinimumHealthyHostsType]
    var value: js.UndefOr[MinimumHealthyHostsValue]
  }

  @js.native
  sealed trait MinimumHealthyHostsType extends js.Any
  object MinimumHealthyHostsType extends js.Object {
    val HOST_COUNT    = "HOST_COUNT".asInstanceOf[MinimumHealthyHostsType]
    val FLEET_PERCENT = "FLEET_PERCENT".asInstanceOf[MinimumHealthyHostsType]

    val values = js.Object.freeze(js.Array(HOST_COUNT, FLEET_PERCENT))
  }

  /**
    * Information about groups of on-premises instance tags.
    */
  @js.native
  @Factory
  trait OnPremisesTagSet extends js.Object {
    var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList]
  }

  @js.native
  @Factory
  trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId]
    var status: js.UndefOr[LifecycleEventStatus]
  }

  @js.native
  @Factory
  trait PutLifecycleEventHookExecutionStatusOutput extends js.Object {
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId]
  }

  /**
    * A revision for an AWS Lambda deployment that is a YAML-formatted or JSON-formatted string. For AWS Lambda deployments, the revision is the same as the AppSpec file.
    */
  @deprecated("RawString and String revision type are deprecated, use AppSpecContent type instead.", "forever")
  @js.native
  @Factory
  trait RawString extends js.Object {
    var content: js.UndefOr[RawStringContent]
    var sha256: js.UndefOr[RawStringSha256]
  }

  /**
    * Represents the input of a RegisterApplicationRevision operation.
    */
  @js.native
  @Factory
  trait RegisterApplicationRevisionInput extends js.Object {
    var applicationName: ApplicationName
    var revision: RevisionLocation
    var description: js.UndefOr[Description]
  }

  /**
    * Represents the input of the register on-premises instance operation.
    */
  @js.native
  @Factory
  trait RegisterOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
    var iamSessionArn: js.UndefOr[IamSessionArn]
    var iamUserArn: js.UndefOr[IamUserArn]
  }

  @js.native
  sealed trait RegistrationStatus extends js.Any
  object RegistrationStatus extends js.Object {
    val Registered   = "Registered".asInstanceOf[RegistrationStatus]
    val Deregistered = "Deregistered".asInstanceOf[RegistrationStatus]

    val values = js.Object.freeze(js.Array(Registered, Deregistered))
  }

  /**
    * Represents the input of a RemoveTagsFromOnPremisesInstances operation.
    */
  @js.native
  @Factory
  trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
    var tags: TagList
  }

  /**
    * Information about an application revision.
    */
  @js.native
  @Factory
  trait RevisionInfo extends js.Object {
    var genericRevisionInfo: js.UndefOr[GenericRevisionInfo]
    var revisionLocation: js.UndefOr[RevisionLocation]
  }

  /**
    * Information about the location of an application revision.
    */
  @js.native
  @Factory
  trait RevisionLocation extends js.Object {
    var appSpecContent: js.UndefOr[AppSpecContent]
    var gitHubLocation: js.UndefOr[GitHubLocation]
    var revisionType: js.UndefOr[RevisionLocationType]
    var s3Location: js.UndefOr[S3Location]
    var string: js.UndefOr[RawString]
  }

  @js.native
  sealed trait RevisionLocationType extends js.Any
  object RevisionLocationType extends js.Object {
    val S3             = "S3".asInstanceOf[RevisionLocationType]
    val GitHub         = "GitHub".asInstanceOf[RevisionLocationType]
    val String         = "String".asInstanceOf[RevisionLocationType]
    val AppSpecContent = "AppSpecContent".asInstanceOf[RevisionLocationType]

    val values = js.Object.freeze(js.Array(S3, GitHub, String, AppSpecContent))
  }

  /**
    * Information about a deployment rollback.
    */
  @js.native
  @Factory
  trait RollbackInfo extends js.Object {
    var rollbackDeploymentId: js.UndefOr[DeploymentId]
    var rollbackMessage: js.UndefOr[Description]
    var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId]
  }

  /**
    * Information about the location of application artifacts stored in Amazon S3.
    */
  @js.native
  @Factory
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var bundleType: js.UndefOr[BundleType]
    var eTag: js.UndefOr[ETag]
    var key: js.UndefOr[S3Key]
    var version: js.UndefOr[VersionId]
  }

  @js.native
  @Factory
  trait SkipWaitTimeForInstanceTerminationInput extends js.Object {
    var deploymentId: js.UndefOr[DeploymentId]
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val ascending  = "ascending".asInstanceOf[SortOrder]
    val descending = "descending".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(ascending, descending))
  }

  /**
    * Represents the input of a StopDeployment operation.
    */
  @js.native
  @Factory
  trait StopDeploymentInput extends js.Object {
    var deploymentId: DeploymentId
    var autoRollbackEnabled: js.UndefOr[NullableBoolean]
  }

  /**
    * Represents the output of a StopDeployment operation.
    */
  @js.native
  @Factory
  trait StopDeploymentOutput extends js.Object {
    var status: js.UndefOr[StopStatus]
    var statusMessage: js.UndefOr[Message]
  }

  @js.native
  sealed trait StopStatus extends js.Any
  object StopStatus extends js.Object {
    val Pending   = "Pending".asInstanceOf[StopStatus]
    val Succeeded = "Succeeded".asInstanceOf[StopStatus]

    val values = js.Object.freeze(js.Array(Pending, Succeeded))
  }

  /**
    * Information about a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[Key]
    var Value: js.UndefOr[Value]
  }

  /**
    * Information about an on-premises instance tag filter.
    */
  @js.native
  @Factory
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[Key]
    var Type: js.UndefOr[TagFilterType]
    var Value: js.UndefOr[Value]
  }

  @js.native
  sealed trait TagFilterType extends js.Any
  object TagFilterType extends js.Object {
    val KEY_ONLY      = "KEY_ONLY".asInstanceOf[TagFilterType]
    val VALUE_ONLY    = "VALUE_ONLY".asInstanceOf[TagFilterType]
    val KEY_AND_VALUE = "KEY_AND_VALUE".asInstanceOf[TagFilterType]

    val values = js.Object.freeze(js.Array(KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE))
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceOutput extends js.Object {}

  @js.native
  sealed trait TargetFilterName extends js.Any
  object TargetFilterName extends js.Object {
    val TargetStatus        = "TargetStatus".asInstanceOf[TargetFilterName]
    val ServerInstanceLabel = "ServerInstanceLabel".asInstanceOf[TargetFilterName]

    val values = js.Object.freeze(js.Array(TargetStatus, ServerInstanceLabel))
  }

  /**
    * Information about a target group in Elastic Load Balancing to use in a deployment. Instances are registered as targets in a target group, and traffic is routed to the target group.
    */
  @js.native
  @Factory
  trait TargetGroupInfo extends js.Object {
    var name: js.UndefOr[TargetGroupName]
  }

  /**
    * Information about two target groups and how traffic is routed during an Amazon ECS deployment. An optional test traffic route can be specified.
    */
  @js.native
  @Factory
  trait TargetGroupPairInfo extends js.Object {
    var prodTrafficRoute: js.UndefOr[TrafficRoute]
    var targetGroups: js.UndefOr[TargetGroupInfoList]
    var testTrafficRoute: js.UndefOr[TrafficRoute]
  }

  /**
    * Information about the instances to be used in the replacement environment in a blue/green deployment.
    */
  @js.native
  @Factory
  trait TargetInstances extends js.Object {
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList]
    var ec2TagSet: js.UndefOr[EC2TagSet]
    var tagFilters: js.UndefOr[EC2TagFilterList]
  }

  @js.native
  sealed trait TargetLabel extends js.Any
  object TargetLabel extends js.Object {
    val Blue  = "Blue".asInstanceOf[TargetLabel]
    val Green = "Green".asInstanceOf[TargetLabel]

    val values = js.Object.freeze(js.Array(Blue, Green))
  }

  @js.native
  sealed trait TargetStatus extends js.Any
  object TargetStatus extends js.Object {
    val Pending    = "Pending".asInstanceOf[TargetStatus]
    val InProgress = "InProgress".asInstanceOf[TargetStatus]
    val Succeeded  = "Succeeded".asInstanceOf[TargetStatus]
    val Failed     = "Failed".asInstanceOf[TargetStatus]
    val Skipped    = "Skipped".asInstanceOf[TargetStatus]
    val Unknown    = "Unknown".asInstanceOf[TargetStatus]
    val Ready      = "Ready".asInstanceOf[TargetStatus]

    val values = js.Object.freeze(js.Array(Pending, InProgress, Succeeded, Failed, Skipped, Unknown, Ready))
  }

  /**
    * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The original and target Lambda function versions are specified in the deployment's AppSpec file.
    */
  @js.native
  @Factory
  trait TimeBasedCanary extends js.Object {
    var canaryInterval: js.UndefOr[WaitTimeInMins]
    var canaryPercentage: js.UndefOr[Percentage]
  }

  /**
    * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions are specified in the deployment's AppSpec file.
    */
  @js.native
  @Factory
  trait TimeBasedLinear extends js.Object {
    var linearInterval: js.UndefOr[WaitTimeInMins]
    var linearPercentage: js.UndefOr[Percentage]
  }

  /**
    * Information about a time range.
    */
  @js.native
  @Factory
  trait TimeRange extends js.Object {
    var end: js.UndefOr[Timestamp]
    var start: js.UndefOr[Timestamp]
  }

  /**
    * Information about a listener. The listener contains the path used to route traffic that is received from the load balancer to a target group.
    */
  @js.native
  @Factory
  trait TrafficRoute extends js.Object {
    var listenerArns: js.UndefOr[ListenerArnList]
  }

  /**
    * The configuration that specifies how traffic is shifted from one version of a Lambda function to another version during an AWS Lambda deployment.
    */
  @js.native
  @Factory
  trait TrafficRoutingConfig extends js.Object {
    var timeBasedCanary: js.UndefOr[TimeBasedCanary]
    var timeBasedLinear: js.UndefOr[TimeBasedLinear]
    var `type`: js.UndefOr[TrafficRoutingType]
  }

  @js.native
  sealed trait TrafficRoutingType extends js.Any
  object TrafficRoutingType extends js.Object {
    val TimeBasedCanary = "TimeBasedCanary".asInstanceOf[TrafficRoutingType]
    val TimeBasedLinear = "TimeBasedLinear".asInstanceOf[TrafficRoutingType]
    val AllAtOnce       = "AllAtOnce".asInstanceOf[TrafficRoutingType]

    val values = js.Object.freeze(js.Array(TimeBasedCanary, TimeBasedLinear, AllAtOnce))
  }

  /**
    * Information about notification triggers for the deployment group.
    */
  @js.native
  @Factory
  trait TriggerConfig extends js.Object {
    var triggerEvents: js.UndefOr[TriggerEventTypeList]
    var triggerName: js.UndefOr[TriggerName]
    var triggerTargetArn: js.UndefOr[TriggerTargetArn]
  }

  @js.native
  sealed trait TriggerEventType extends js.Any
  object TriggerEventType extends js.Object {
    val DeploymentStart    = "DeploymentStart".asInstanceOf[TriggerEventType]
    val DeploymentSuccess  = "DeploymentSuccess".asInstanceOf[TriggerEventType]
    val DeploymentFailure  = "DeploymentFailure".asInstanceOf[TriggerEventType]
    val DeploymentStop     = "DeploymentStop".asInstanceOf[TriggerEventType]
    val DeploymentRollback = "DeploymentRollback".asInstanceOf[TriggerEventType]
    val DeploymentReady    = "DeploymentReady".asInstanceOf[TriggerEventType]
    val InstanceStart      = "InstanceStart".asInstanceOf[TriggerEventType]
    val InstanceSuccess    = "InstanceSuccess".asInstanceOf[TriggerEventType]
    val InstanceFailure    = "InstanceFailure".asInstanceOf[TriggerEventType]
    val InstanceReady      = "InstanceReady".asInstanceOf[TriggerEventType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceOutput extends js.Object {}

  /**
    * Represents the input of an UpdateApplication operation.
    */
  @js.native
  @Factory
  trait UpdateApplicationInput extends js.Object {
    var applicationName: js.UndefOr[ApplicationName]
    var newApplicationName: js.UndefOr[ApplicationName]
  }

  /**
    * Represents the input of an UpdateDeploymentGroup operation.
    */
  @js.native
  @Factory
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

  /**
    * Represents the output of an UpdateDeploymentGroup operation.
    */
  @js.native
  @Factory
  trait UpdateDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList]
  }
}
