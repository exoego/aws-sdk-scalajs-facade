package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object codedeploy {
  type ApplicationId = String
  type ApplicationName = String
  type ApplicationRevisionSortBy = String
  type ApplicationsInfoList = js.Array[ApplicationInfo]
  type ApplicationsList = js.Array[ApplicationName]
  type AutoScalingGroupHook = String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AutoScalingGroupName = String
  type AutoScalingGroupNameList = js.Array[AutoScalingGroupName]
  type BundleType = String
  type CommitId = String
  type DeploymentConfigId = String
  type DeploymentConfigName = String
  type DeploymentConfigsList = js.Array[DeploymentConfigName]
  type DeploymentCreator = String
  type DeploymentGroupId = String
  type DeploymentGroupName = String
  type DeploymentGroupsList = js.Array[DeploymentGroupName]
  type DeploymentId = String
  type DeploymentStatus = String
  type DeploymentStatusList = js.Array[DeploymentStatus]
  type DeploymentsInfoList = js.Array[DeploymentInfo]
  type DeploymentsList = js.Array[DeploymentId]
  type Description = String
  type EC2TagFilterList = js.Array[EC2TagFilter]
  type EC2TagFilterType = String
  type ETag = String
  type ErrorCode = String
  type ErrorMessage = String
  type IamUserArn = String
  type InstanceArn = String
  type InstanceCount = Long
  type InstanceId = String
  type InstanceInfoList = js.Array[InstanceInfo]
  type InstanceName = String
  type InstanceNameList = js.Array[InstanceName]
  type InstanceStatus = String
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstancesList = js.Array[InstanceId]
  type Key = String
  type LifecycleErrorCode = String
  type LifecycleEventList = js.Array[LifecycleEvent]
  type LifecycleEventName = String
  type LifecycleEventStatus = String
  type LifecycleMessage = String
  type ListStateFilterAction = String
  type LogTail = String
  type Message = String
  type MinimumHealthyHostsType = String
  type MinimumHealthyHostsValue = Integer
  type NextToken = String
  type RegistrationStatus = String
  type Repository = String
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
  type Timestamp = js.Date
  type Value = String
  type VersionId = String
}

package codedeploy {
  @js.native
  trait Codedeploy extends js.Object {
    def addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput, callback: Callback[js.Object]): Unit = js.native
    def addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput): Request[js.Object] = js.native
    def batchGetApplications(params: BatchGetApplicationsInput, callback: Callback[BatchGetApplicationsOutput]): Unit = js.native
    def batchGetApplications(params: BatchGetApplicationsInput): Request[BatchGetApplicationsOutput] = js.native
    def batchGetDeployments(params: BatchGetDeploymentsInput, callback: Callback[BatchGetDeploymentsOutput]): Unit = js.native
    def batchGetDeployments(params: BatchGetDeploymentsInput): Request[BatchGetDeploymentsOutput] = js.native
    def batchGetOnPremisesInstances(params: BatchGetOnPremisesInstancesInput, callback: Callback[BatchGetOnPremisesInstancesOutput]): Unit = js.native
    def batchGetOnPremisesInstances(params: BatchGetOnPremisesInstancesInput): Request[BatchGetOnPremisesInstancesOutput] = js.native
    def createApplication(params: CreateApplicationInput, callback: Callback[CreateApplicationOutput]): Unit = js.native
    def createApplication(params: CreateApplicationInput): Request[CreateApplicationOutput] = js.native
    def createDeployment(params: CreateDeploymentInput, callback: Callback[CreateDeploymentOutput]): Unit = js.native
    def createDeployment(params: CreateDeploymentInput): Request[CreateDeploymentOutput] = js.native
    def createDeploymentConfig(params: CreateDeploymentConfigInput, callback: Callback[CreateDeploymentConfigOutput]): Unit = js.native
    def createDeploymentConfig(params: CreateDeploymentConfigInput): Request[CreateDeploymentConfigOutput] = js.native
    def createDeploymentGroup(params: CreateDeploymentGroupInput, callback: Callback[CreateDeploymentGroupOutput]): Unit = js.native
    def createDeploymentGroup(params: CreateDeploymentGroupInput): Request[CreateDeploymentGroupOutput] = js.native
    def deleteApplication(params: DeleteApplicationInput, callback: Callback[js.Object]): Unit = js.native
    def deleteApplication(params: DeleteApplicationInput): Request[js.Object] = js.native
    def deleteDeploymentConfig(params: DeleteDeploymentConfigInput, callback: Callback[js.Object]): Unit = js.native
    def deleteDeploymentConfig(params: DeleteDeploymentConfigInput): Request[js.Object] = js.native
    def deleteDeploymentGroup(params: DeleteDeploymentGroupInput, callback: Callback[DeleteDeploymentGroupOutput]): Unit = js.native
    def deleteDeploymentGroup(params: DeleteDeploymentGroupInput): Request[DeleteDeploymentGroupOutput] = js.native
    def deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput, callback: Callback[js.Object]): Unit = js.native
    def deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput): Request[js.Object] = js.native
    def getApplication(params: GetApplicationInput, callback: Callback[GetApplicationOutput]): Unit = js.native
    def getApplication(params: GetApplicationInput): Request[GetApplicationOutput] = js.native
    def getApplicationRevision(params: GetApplicationRevisionInput, callback: Callback[GetApplicationRevisionOutput]): Unit = js.native
    def getApplicationRevision(params: GetApplicationRevisionInput): Request[GetApplicationRevisionOutput] = js.native
    def getDeployment(params: GetDeploymentInput, callback: Callback[GetDeploymentOutput]): Unit = js.native
    def getDeployment(params: GetDeploymentInput): Request[GetDeploymentOutput] = js.native
    def getDeploymentConfig(params: GetDeploymentConfigInput, callback: Callback[GetDeploymentConfigOutput]): Unit = js.native
    def getDeploymentConfig(params: GetDeploymentConfigInput): Request[GetDeploymentConfigOutput] = js.native
    def getDeploymentGroup(params: GetDeploymentGroupInput, callback: Callback[GetDeploymentGroupOutput]): Unit = js.native
    def getDeploymentGroup(params: GetDeploymentGroupInput): Request[GetDeploymentGroupOutput] = js.native
    def getDeploymentInstance(params: GetDeploymentInstanceInput, callback: Callback[GetDeploymentInstanceOutput]): Unit = js.native
    def getDeploymentInstance(params: GetDeploymentInstanceInput): Request[GetDeploymentInstanceOutput] = js.native
    def getOnPremisesInstance(params: GetOnPremisesInstanceInput, callback: Callback[GetOnPremisesInstanceOutput]): Unit = js.native
    def getOnPremisesInstance(params: GetOnPremisesInstanceInput): Request[GetOnPremisesInstanceOutput] = js.native
    def listApplicationRevisions(params: ListApplicationRevisionsInput, callback: Callback[ListApplicationRevisionsOutput]): Unit = js.native
    def listApplicationRevisions(params: ListApplicationRevisionsInput): Request[ListApplicationRevisionsOutput] = js.native
    def listApplications(params: ListApplicationsInput, callback: Callback[ListApplicationsOutput]): Unit = js.native
    def listApplications(params: ListApplicationsInput): Request[ListApplicationsOutput] = js.native
    def listDeploymentConfigs(params: ListDeploymentConfigsInput, callback: Callback[ListDeploymentConfigsOutput]): Unit = js.native
    def listDeploymentConfigs(params: ListDeploymentConfigsInput): Request[ListDeploymentConfigsOutput] = js.native
    def listDeploymentGroups(params: ListDeploymentGroupsInput, callback: Callback[ListDeploymentGroupsOutput]): Unit = js.native
    def listDeploymentGroups(params: ListDeploymentGroupsInput): Request[ListDeploymentGroupsOutput] = js.native
    def listDeploymentInstances(params: ListDeploymentInstancesInput, callback: Callback[ListDeploymentInstancesOutput]): Unit = js.native
    def listDeploymentInstances(params: ListDeploymentInstancesInput): Request[ListDeploymentInstancesOutput] = js.native
    def listDeployments(params: ListDeploymentsInput, callback: Callback[ListDeploymentsOutput]): Unit = js.native
    def listDeployments(params: ListDeploymentsInput): Request[ListDeploymentsOutput] = js.native
    def listOnPremisesInstances(params: ListOnPremisesInstancesInput, callback: Callback[ListOnPremisesInstancesOutput]): Unit = js.native
    def listOnPremisesInstances(params: ListOnPremisesInstancesInput): Request[ListOnPremisesInstancesOutput] = js.native
    def registerApplicationRevision(params: RegisterApplicationRevisionInput, callback: Callback[js.Object]): Unit = js.native
    def registerApplicationRevision(params: RegisterApplicationRevisionInput): Request[js.Object] = js.native
    def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput, callback: Callback[js.Object]): Unit = js.native
    def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput): Request[js.Object] = js.native
    def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput, callback: Callback[js.Object]): Unit = js.native
    def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput): Request[js.Object] = js.native
    def stopDeployment(params: StopDeploymentInput, callback: Callback[StopDeploymentOutput]): Unit = js.native
    def stopDeployment(params: StopDeploymentInput): Request[StopDeploymentOutput] = js.native
    def updateApplication(params: UpdateApplicationInput, callback: Callback[js.Object]): Unit = js.native
    def updateApplication(params: UpdateApplicationInput): Request[js.Object] = js.native
    def updateDeploymentGroup(params: UpdateDeploymentGroupInput, callback: Callback[UpdateDeploymentGroupOutput]): Unit = js.native
    def updateDeploymentGroup(params: UpdateDeploymentGroupInput): Request[UpdateDeploymentGroupOutput] = js.native
  }

  /**
   * <p>Represents the input of an adds tags to on-premises instance operation.</p>
   */
  @js.native
  trait AddTagsToOnPremisesInstancesInput extends js.Object {
    var tags: TagList
    var instanceNames: InstanceNameList
  }

  object AddTagsToOnPremisesInstancesInput {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      instanceNames: js.UndefOr[InstanceNameList] = js.undefined
    ): AddTagsToOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tags" -> tags.map { x => x: js.Any }),
        ("instanceNames" -> instanceNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToOnPremisesInstancesInput]
    }
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
    var applicationId: ApplicationId
    var applicationName: ApplicationName
    var createTime: Timestamp
    var linkedToGitHub: Boolean
  }

  object ApplicationInfo {
    def apply(
      applicationId: js.UndefOr[ApplicationId] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      createTime: js.UndefOr[Timestamp] = js.undefined,
      linkedToGitHub: js.UndefOr[Boolean] = js.undefined
    ): ApplicationInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationId" -> applicationId.map { x => x: js.Any }),
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("createTime" -> createTime.map { x => x: js.Any }),
        ("linkedToGitHub" -> linkedToGitHub.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationInfo]
    }
  }

  /**
   * <p>More applications were attempted to be created than were allowed.</p>
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
   * <p>Information about an Auto Scaling group.</p>
   */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var name: AutoScalingGroupName
    var hook: AutoScalingGroupHook
  }

  object AutoScalingGroup {
    def apply(
      name: js.UndefOr[AutoScalingGroupName] = js.undefined,
      hook: js.UndefOr[AutoScalingGroupHook] = js.undefined
    ): AutoScalingGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("hook" -> hook.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroup]
    }
  }

  /**
   * <p>Represents the input of a batch get applications operation.</p>
   */
  @js.native
  trait BatchGetApplicationsInput extends js.Object {
    var applicationNames: ApplicationsList
  }

  object BatchGetApplicationsInput {
    def apply(
      applicationNames: js.UndefOr[ApplicationsList] = js.undefined
    ): BatchGetApplicationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationNames" -> applicationNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationsInput]
    }
  }

  /**
   * <p>Represents the output of a batch get applications operation.</p>
   */
  @js.native
  trait BatchGetApplicationsOutput extends js.Object {
    var applicationsInfo: ApplicationsInfoList
  }

  object BatchGetApplicationsOutput {
    def apply(
      applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.undefined
    ): BatchGetApplicationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationsInfo" -> applicationsInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetApplicationsOutput]
    }
  }

  /**
   * <p>Represents the input of a batch get deployments operation.</p>
   */
  @js.native
  trait BatchGetDeploymentsInput extends js.Object {
    var deploymentIds: DeploymentsList
  }

  object BatchGetDeploymentsInput {
    def apply(
      deploymentIds: js.UndefOr[DeploymentsList] = js.undefined
    ): BatchGetDeploymentsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentIds" -> deploymentIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentsInput]
    }
  }

  /**
   * <p>Represents the output of a batch get deployments operation.</p>
   */
  @js.native
  trait BatchGetDeploymentsOutput extends js.Object {
    var deploymentsInfo: DeploymentsInfoList
  }

  object BatchGetDeploymentsOutput {
    def apply(
      deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.undefined
    ): BatchGetDeploymentsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentsInfo" -> deploymentsInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDeploymentsOutput]
    }
  }

  /**
   * <p>Represents the input of a batch get on-premises instances operation.</p>
   */
  @js.native
  trait BatchGetOnPremisesInstancesInput extends js.Object {
    var instanceNames: InstanceNameList
  }

  object BatchGetOnPremisesInstancesInput {
    def apply(
      instanceNames: js.UndefOr[InstanceNameList] = js.undefined
    ): BatchGetOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceNames" -> instanceNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetOnPremisesInstancesInput]
    }
  }

  /**
   * <p>Represents the output of a batch get on-premises instances operation.</p>
   */
  @js.native
  trait BatchGetOnPremisesInstancesOutput extends js.Object {
    var instanceInfos: InstanceInfoList
  }

  object BatchGetOnPremisesInstancesOutput {
    def apply(
      instanceInfos: js.UndefOr[InstanceInfoList] = js.undefined
    ): BatchGetOnPremisesInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceInfos" -> instanceInfos.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetOnPremisesInstancesOutput]
    }
  }

  /**
   * <p>A bucket name is required but was not provided.</p>
   */
  @js.native
  trait BucketNameFilterRequiredExceptionException extends js.Object {

  }


  object BundleTypeEnum {
    val tar = "tar"
    val tgz = "tgz"
    val zip = "zip"

    val values = IndexedSeq(tar, tgz, zip)
  }

  /**
   * <p>Represents the input of a create application operation.</p>
   */
  @js.native
  trait CreateApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  object CreateApplicationInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined
    ): CreateApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationInput]
    }
  }

  /**
   * <p>Represents the output of a create application operation.</p>
   */
  @js.native
  trait CreateApplicationOutput extends js.Object {
    var applicationId: ApplicationId
  }

  object CreateApplicationOutput {
    def apply(
      applicationId: js.UndefOr[ApplicationId] = js.undefined
    ): CreateApplicationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationId" -> applicationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationOutput]
    }
  }

  /**
   * <p>Represents the input of a create deployment configuration operation.</p>
   */
  @js.native
  trait CreateDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
    var minimumHealthyHosts: MinimumHealthyHosts
  }

  object CreateDeploymentConfigInput {
    def apply(
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined
    ): CreateDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any }),
        ("minimumHealthyHosts" -> minimumHealthyHosts.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentConfigInput]
    }
  }

  /**
   * <p>Represents the output of a create deployment configuration operation.</p>
   */
  @js.native
  trait CreateDeploymentConfigOutput extends js.Object {
    var deploymentConfigId: DeploymentConfigId
  }

  object CreateDeploymentConfigOutput {
    def apply(
      deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined
    ): CreateDeploymentConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentConfigId" -> deploymentConfigId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentConfigOutput]
    }
  }

  /**
   * <p>Represents the input of a create deployment group operation.</p>
   */
  @js.native
  trait CreateDeploymentGroupInput extends js.Object {
    var serviceRoleArn: Role
    var autoScalingGroups: AutoScalingGroupNameList
    var applicationName: ApplicationName
    var deploymentConfigName: DeploymentConfigName
    var onPremisesInstanceTagFilters: TagFilterList
    var deploymentGroupName: DeploymentGroupName
    var ec2TagFilters: EC2TagFilterList
  }

  object CreateDeploymentGroupInput {
    def apply(
      serviceRoleArn: js.UndefOr[Role] = js.undefined,
      autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined
    ): CreateDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("serviceRoleArn" -> serviceRoleArn.map { x => x: js.Any }),
        ("autoScalingGroups" -> autoScalingGroups.map { x => x: js.Any }),
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any }),
        ("onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x => x: js.Any }),
        ("deploymentGroupName" -> deploymentGroupName.map { x => x: js.Any }),
        ("ec2TagFilters" -> ec2TagFilters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentGroupInput]
    }
  }

  /**
   * <p>Represents the output of a create deployment group operation.</p>
   */
  @js.native
  trait CreateDeploymentGroupOutput extends js.Object {
    var deploymentGroupId: DeploymentGroupId
  }

  object CreateDeploymentGroupOutput {
    def apply(
      deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined
    ): CreateDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentGroupId" -> deploymentGroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentGroupOutput]
    }
  }

  /**
   * <p>Represents the input of a create deployment operation.</p>
   */
  @js.native
  trait CreateDeploymentInput extends js.Object {
    var description: Description
    var applicationName: ApplicationName
    var revision: RevisionLocation
    var deploymentConfigName: DeploymentConfigName
    var deploymentGroupName: DeploymentGroupName
    var ignoreApplicationStopFailures: Boolean
  }

  object CreateDeploymentInput {
    def apply(
      description: js.UndefOr[Description] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined
    ): CreateDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("description" -> description.map { x => x: js.Any }),
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("revision" -> revision.map { x => x: js.Any }),
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any }),
        ("deploymentGroupName" -> deploymentGroupName.map { x => x: js.Any }),
        ("ignoreApplicationStopFailures" -> ignoreApplicationStopFailures.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentInput]
    }
  }

  /**
   * <p>Represents the output of a create deployment operation.</p>
   */
  @js.native
  trait CreateDeploymentOutput extends js.Object {
    var deploymentId: DeploymentId
  }

  object CreateDeploymentOutput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined
    ): CreateDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentId" -> deploymentId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentOutput]
    }
  }

  /**
   * <p>Represents the input of a delete application operation.</p>
   */
  @js.native
  trait DeleteApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  object DeleteApplicationInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined
    ): DeleteApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationInput]
    }
  }

  /**
   * <p>Represents the input of a delete deployment configuration operation.</p>
   */
  @js.native
  trait DeleteDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
  }

  object DeleteDeploymentConfigInput {
    def apply(
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
    ): DeleteDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentConfigInput]
    }
  }

  /**
   * <p>Represents the input of a delete deployment group operation.</p>
   */
  @js.native
  trait DeleteDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
  }

  object DeleteDeploymentGroupInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    ): DeleteDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("deploymentGroupName" -> deploymentGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentGroupInput]
    }
  }

  /**
   * <p>Represents the output of a delete deployment group operation.</p>
   */
  @js.native
  trait DeleteDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: AutoScalingGroupList
  }

  object DeleteDeploymentGroupOutput {
    def apply(
      hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
    ): DeleteDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("hooksNotCleanedUp" -> hooksNotCleanedUp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentGroupOutput]
    }
  }

  /**
   * <p>The deployment is already completed.</p>
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
    var deploymentConfigId: DeploymentConfigId
    var deploymentConfigName: DeploymentConfigName
    var minimumHealthyHosts: MinimumHealthyHosts
    var createTime: Timestamp
  }

  object DeploymentConfigInfo {
    def apply(
      deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined,
      createTime: js.UndefOr[Timestamp] = js.undefined
    ): DeploymentConfigInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentConfigId" -> deploymentConfigId.map { x => x: js.Any }),
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any }),
        ("minimumHealthyHosts" -> minimumHealthyHosts.map { x => x: js.Any }),
        ("createTime" -> createTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

    val values = IndexedSeq(user, autoscaling)
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
    var serviceRoleArn: Role
    var autoScalingGroups: AutoScalingGroupList
    var applicationName: ApplicationName
    var deploymentGroupId: DeploymentGroupId
    var targetRevision: RevisionLocation
    var deploymentConfigName: DeploymentConfigName
    var onPremisesInstanceTagFilters: TagFilterList
    var deploymentGroupName: DeploymentGroupName
    var ec2TagFilters: EC2TagFilterList
  }

  object DeploymentGroupInfo {
    def apply(
      serviceRoleArn: js.UndefOr[Role] = js.undefined,
      autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined,
      targetRevision: js.UndefOr[RevisionLocation] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined
    ): DeploymentGroupInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("serviceRoleArn" -> serviceRoleArn.map { x => x: js.Any }),
        ("autoScalingGroups" -> autoScalingGroups.map { x => x: js.Any }),
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("deploymentGroupId" -> deploymentGroupId.map { x => x: js.Any }),
        ("targetRevision" -> targetRevision.map { x => x: js.Any }),
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any }),
        ("onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x => x: js.Any }),
        ("deploymentGroupName" -> deploymentGroupName.map { x => x: js.Any }),
        ("ec2TagFilters" -> ec2TagFilters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var startTime: Timestamp
    var createTime: Timestamp
    var description: Description
    var completeTime: Timestamp
    var deploymentId: DeploymentId
    var applicationName: ApplicationName
    var creator: DeploymentCreator
    var deploymentOverview: DeploymentOverview
    var revision: RevisionLocation
    var deploymentConfigName: DeploymentConfigName
    var status: DeploymentStatus
    var deploymentGroupName: DeploymentGroupName
    var ignoreApplicationStopFailures: Boolean
    var errorInformation: ErrorInformation
  }

  object DeploymentInfo {
    def apply(
      startTime: js.UndefOr[Timestamp] = js.undefined,
      createTime: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      completeTime: js.UndefOr[Timestamp] = js.undefined,
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      creator: js.UndefOr[DeploymentCreator] = js.undefined,
      deploymentOverview: js.UndefOr[DeploymentOverview] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      status: js.UndefOr[DeploymentStatus] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
      errorInformation: js.UndefOr[ErrorInformation] = js.undefined
    ): DeploymentInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startTime" -> startTime.map { x => x: js.Any }),
        ("createTime" -> createTime.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any }),
        ("completeTime" -> completeTime.map { x => x: js.Any }),
        ("deploymentId" -> deploymentId.map { x => x: js.Any }),
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("creator" -> creator.map { x => x: js.Any }),
        ("deploymentOverview" -> deploymentOverview.map { x => x: js.Any }),
        ("revision" -> revision.map { x => x: js.Any }),
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("deploymentGroupName" -> deploymentGroupName.map { x => x: js.Any }),
        ("ignoreApplicationStopFailures" -> ignoreApplicationStopFailures.map { x => x: js.Any }),
        ("errorInformation" -> errorInformation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentInfo]
    }
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

  /**
   * <p>Information about the deployment status of the instances in the deployment.</p>
   */
  @js.native
  trait DeploymentOverview extends js.Object {
    var Pending: InstanceCount
    var InProgress: InstanceCount
    var Succeeded: InstanceCount
    var Skipped: InstanceCount
    var Failed: InstanceCount
  }

  object DeploymentOverview {
    def apply(
      Pending: js.UndefOr[InstanceCount] = js.undefined,
      InProgress: js.UndefOr[InstanceCount] = js.undefined,
      Succeeded: js.UndefOr[InstanceCount] = js.undefined,
      Skipped: js.UndefOr[InstanceCount] = js.undefined,
      Failed: js.UndefOr[InstanceCount] = js.undefined
    ): DeploymentOverview = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Pending" -> Pending.map { x => x: js.Any }),
        ("InProgress" -> InProgress.map { x => x: js.Any }),
        ("Succeeded" -> Succeeded.map { x => x: js.Any }),
        ("Skipped" -> Skipped.map { x => x: js.Any }),
        ("Failed" -> Failed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentOverview]
    }
  }


  object DeploymentStatusEnum {
    val Created = "Created"
    val Queued = "Queued"
    val InProgress = "InProgress"
    val Succeeded = "Succeeded"
    val Failed = "Failed"
    val Stopped = "Stopped"

    val values = IndexedSeq(Created, Queued, InProgress, Succeeded, Failed, Stopped)
  }

  /**
   * <p>Represents the input of a deregister on-premises instance operation.</p>
   */
  @js.native
  trait DeregisterOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
  }

  object DeregisterOnPremisesInstanceInput {
    def apply(
      instanceName: js.UndefOr[InstanceName] = js.undefined
    ): DeregisterOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceName" -> instanceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterOnPremisesInstanceInput]
    }
  }

  /**
   * <p>The description that was provided is too long.</p>
   */
  @js.native
  trait DescriptionTooLongExceptionException extends js.Object {

  }

  /**
   * <p>Diagnostic information about executable scripts that are part of a deployment.</p>
   */
  @js.native
  trait Diagnostics extends js.Object {
    var errorCode: LifecycleErrorCode
    var scriptName: ScriptName
    var message: LifecycleMessage
    var logTail: LogTail
  }

  object Diagnostics {
    def apply(
      errorCode: js.UndefOr[LifecycleErrorCode] = js.undefined,
      scriptName: js.UndefOr[ScriptName] = js.undefined,
      message: js.UndefOr[LifecycleMessage] = js.undefined,
      logTail: js.UndefOr[LogTail] = js.undefined
    ): Diagnostics = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("errorCode" -> errorCode.map { x => x: js.Any }),
        ("scriptName" -> scriptName.map { x => x: js.Any }),
        ("message" -> message.map { x => x: js.Any }),
        ("logTail" -> logTail.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Diagnostics]
    }
  }

  /**
   * <p>Information about a tag filter.</p>
   */
  @js.native
  trait EC2TagFilter extends js.Object {
    var Key: Key
    var Value: Value
    var Type: EC2TagFilterType
  }

  object EC2TagFilter {
    def apply(
      Key: js.UndefOr[Key] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined,
      Type: js.UndefOr[EC2TagFilterType] = js.undefined
    ): EC2TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2TagFilter]
    }
  }


  object EC2TagFilterTypeEnum {
    val `KEY_ONLY` = "KEY_ONLY"
    val `VALUE_ONLY` = "VALUE_ONLY"
    val `KEY_AND_VALUE` = "KEY_AND_VALUE"

    val values = IndexedSeq(`KEY_ONLY`, `VALUE_ONLY`, `KEY_AND_VALUE`)
  }


  object ErrorCodeEnum {
    val `DEPLOYMENT_GROUP_MISSING` = "DEPLOYMENT_GROUP_MISSING"
    val `APPLICATION_MISSING` = "APPLICATION_MISSING"
    val `REVISION_MISSING` = "REVISION_MISSING"
    val `IAM_ROLE_MISSING` = "IAM_ROLE_MISSING"
    val `IAM_ROLE_PERMISSIONS` = "IAM_ROLE_PERMISSIONS"
    val `NO_EC2_SUBSCRIPTION` = "NO_EC2_SUBSCRIPTION"
    val `OVER_MAX_INSTANCES` = "OVER_MAX_INSTANCES"
    val `NO_INSTANCES` = "NO_INSTANCES"
    val TIMEOUT = "TIMEOUT"
    val `HEALTH_CONSTRAINTS_INVALID` = "HEALTH_CONSTRAINTS_INVALID"
    val `HEALTH_CONSTRAINTS` = "HEALTH_CONSTRAINTS"
    val `INTERNAL_ERROR` = "INTERNAL_ERROR"
    val THROTTLED = "THROTTLED"

    val values = IndexedSeq(`DEPLOYMENT_GROUP_MISSING`, `APPLICATION_MISSING`, `REVISION_MISSING`, `IAM_ROLE_MISSING`, `IAM_ROLE_PERMISSIONS`, `NO_EC2_SUBSCRIPTION`, `OVER_MAX_INSTANCES`, `NO_INSTANCES`, TIMEOUT, `HEALTH_CONSTRAINTS_INVALID`, `HEALTH_CONSTRAINTS`, `INTERNAL_ERROR`, THROTTLED)
  }

  /**
   * <p>Information about a deployment error.</p>
   */
  @js.native
  trait ErrorInformation extends js.Object {
    var code: ErrorCode
    var message: ErrorMessage
  }

  object ErrorInformation {
    def apply(
      code: js.UndefOr[ErrorCode] = js.undefined,
      message: js.UndefOr[ErrorMessage] = js.undefined
    ): ErrorInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("code" -> code.map { x => x: js.Any }),
        ("message" -> message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorInformation]
    }
  }

  /**
   * <p>Information about an application revision.</p>
   */
  @js.native
  trait GenericRevisionInfo extends js.Object {
    var firstUsedTime: Timestamp
    var description: Description
    var registerTime: Timestamp
    var deploymentGroups: DeploymentGroupsList
    var lastUsedTime: Timestamp
  }

  object GenericRevisionInfo {
    def apply(
      firstUsedTime: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      registerTime: js.UndefOr[Timestamp] = js.undefined,
      deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined,
      lastUsedTime: js.UndefOr[Timestamp] = js.undefined
    ): GenericRevisionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("firstUsedTime" -> firstUsedTime.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any }),
        ("registerTime" -> registerTime.map { x => x: js.Any }),
        ("deploymentGroups" -> deploymentGroups.map { x => x: js.Any }),
        ("lastUsedTime" -> lastUsedTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenericRevisionInfo]
    }
  }

  /**
   * <p>Represents the input of a get application operation.</p>
   */
  @js.native
  trait GetApplicationInput extends js.Object {
    var applicationName: ApplicationName
  }

  object GetApplicationInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined
    ): GetApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationInput]
    }
  }

  /**
   * <p>Represents the output of a get application operation.</p>
   */
  @js.native
  trait GetApplicationOutput extends js.Object {
    var application: ApplicationInfo
  }

  object GetApplicationOutput {
    def apply(
      application: js.UndefOr[ApplicationInfo] = js.undefined
    ): GetApplicationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("application" -> application.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationOutput]
    }
  }

  /**
   * <p>Represents the input of a get application revision operation.</p>
   */
  @js.native
  trait GetApplicationRevisionInput extends js.Object {
    var applicationName: ApplicationName
    var revision: RevisionLocation
  }

  object GetApplicationRevisionInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined
    ): GetApplicationRevisionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("revision" -> revision.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationRevisionInput]
    }
  }

  /**
   * <p>Represents the output of a get application revision operation.</p>
   */
  @js.native
  trait GetApplicationRevisionOutput extends js.Object {
    var applicationName: ApplicationName
    var revision: RevisionLocation
    var revisionInfo: GenericRevisionInfo
  }

  object GetApplicationRevisionOutput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined,
      revisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined
    ): GetApplicationRevisionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("revision" -> revision.map { x => x: js.Any }),
        ("revisionInfo" -> revisionInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationRevisionOutput]
    }
  }

  /**
   * <p>Represents the input of a get deployment configuration operation.</p>
   */
  @js.native
  trait GetDeploymentConfigInput extends js.Object {
    var deploymentConfigName: DeploymentConfigName
  }

  object GetDeploymentConfigInput {
    def apply(
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
    ): GetDeploymentConfigInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentConfigInput]
    }
  }

  /**
   * <p>Represents the output of a get deployment configuration operation.</p>
   */
  @js.native
  trait GetDeploymentConfigOutput extends js.Object {
    var deploymentConfigInfo: DeploymentConfigInfo
  }

  object GetDeploymentConfigOutput {
    def apply(
      deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.undefined
    ): GetDeploymentConfigOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentConfigInfo" -> deploymentConfigInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentConfigOutput]
    }
  }

  /**
   * <p>Represents the input of a get deployment group operation.</p>
   */
  @js.native
  trait GetDeploymentGroupInput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroupName: DeploymentGroupName
  }

  object GetDeploymentGroupInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    ): GetDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("deploymentGroupName" -> deploymentGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentGroupInput]
    }
  }

  /**
   * <p>Represents the output of a get deployment group operation.</p>
   */
  @js.native
  trait GetDeploymentGroupOutput extends js.Object {
    var deploymentGroupInfo: DeploymentGroupInfo
  }

  object GetDeploymentGroupOutput {
    def apply(
      deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.undefined
    ): GetDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentGroupInfo" -> deploymentGroupInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentGroupOutput]
    }
  }

  /**
   * <p>Represents the input of a get deployment operation.</p>
   */
  @js.native
  trait GetDeploymentInput extends js.Object {
    var deploymentId: DeploymentId
  }

  object GetDeploymentInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined
    ): GetDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentId" -> deploymentId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInput]
    }
  }

  /**
   * <p>Represents the input of a get deployment instance operation.</p>
   */
  @js.native
  trait GetDeploymentInstanceInput extends js.Object {
    var deploymentId: DeploymentId
    var instanceId: InstanceId
  }

  object GetDeploymentInstanceInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      instanceId: js.UndefOr[InstanceId] = js.undefined
    ): GetDeploymentInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentId" -> deploymentId.map { x => x: js.Any }),
        ("instanceId" -> instanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInstanceInput]
    }
  }

  /**
   * <p>Represents the output of a get deployment instance operation.</p>
   */
  @js.native
  trait GetDeploymentInstanceOutput extends js.Object {
    var instanceSummary: InstanceSummary
  }

  object GetDeploymentInstanceOutput {
    def apply(
      instanceSummary: js.UndefOr[InstanceSummary] = js.undefined
    ): GetDeploymentInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceSummary" -> instanceSummary.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentInstanceOutput]
    }
  }

  /**
   * <p>Represents the output of a get deployment operation.</p>
   */
  @js.native
  trait GetDeploymentOutput extends js.Object {
    var deploymentInfo: DeploymentInfo
  }

  object GetDeploymentOutput {
    def apply(
      deploymentInfo: js.UndefOr[DeploymentInfo] = js.undefined
    ): GetDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentInfo" -> deploymentInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentOutput]
    }
  }

  /**
   * <p>Represents the input of a get on-premises instance operation.</p>
   */
  @js.native
  trait GetOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
  }

  object GetOnPremisesInstanceInput {
    def apply(
      instanceName: js.UndefOr[InstanceName] = js.undefined
    ): GetOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceName" -> instanceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOnPremisesInstanceInput]
    }
  }

  /**
   * <p>Represents the output of a get on-premises instance operation.</p>
   */
  @js.native
  trait GetOnPremisesInstanceOutput extends js.Object {
    var instanceInfo: InstanceInfo
  }

  object GetOnPremisesInstanceOutput {
    def apply(
      instanceInfo: js.UndefOr[InstanceInfo] = js.undefined
    ): GetOnPremisesInstanceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceInfo" -> instanceInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOnPremisesInstanceOutput]
    }
  }

  /**
   * <p>Information about the location of application artifacts that are stored in GitHub.</p>
   */
  @js.native
  trait GitHubLocation extends js.Object {
    var repository: Repository
    var commitId: CommitId
  }

  object GitHubLocation {
    def apply(
      repository: js.UndefOr[Repository] = js.undefined,
      commitId: js.UndefOr[CommitId] = js.undefined
    ): GitHubLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("repository" -> repository.map { x => x: js.Any }),
        ("commitId" -> commitId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GitHubLocation]
    }
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
    var tags: TagList
    var registerTime: Timestamp
    var deregisterTime: Timestamp
    var instanceArn: InstanceArn
    var iamUserArn: IamUserArn
    var instanceName: InstanceName
  }

  object InstanceInfo {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      registerTime: js.UndefOr[Timestamp] = js.undefined,
      deregisterTime: js.UndefOr[Timestamp] = js.undefined,
      instanceArn: js.UndefOr[InstanceArn] = js.undefined,
      iamUserArn: js.UndefOr[IamUserArn] = js.undefined,
      instanceName: js.UndefOr[InstanceName] = js.undefined
    ): InstanceInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tags" -> tags.map { x => x: js.Any }),
        ("registerTime" -> registerTime.map { x => x: js.Any }),
        ("deregisterTime" -> deregisterTime.map { x => x: js.Any }),
        ("instanceArn" -> instanceArn.map { x => x: js.Any }),
        ("iamUserArn" -> iamUserArn.map { x => x: js.Any }),
        ("instanceName" -> instanceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

    val values = IndexedSeq(Pending, InProgress, Succeeded, Failed, Skipped, Unknown)
  }

  /**
   * <p>Information about an instance in a deployment.</p>
   */
  @js.native
  trait InstanceSummary extends js.Object {
    var instanceId: InstanceId
    var deploymentId: DeploymentId
    var lifecycleEvents: LifecycleEventList
    var status: InstanceStatus
    var lastUpdatedAt: Timestamp
  }

  object InstanceSummary {
    def apply(
      instanceId: js.UndefOr[InstanceId] = js.undefined,
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined,
      status: js.UndefOr[InstanceStatus] = js.undefined,
      lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): InstanceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceId" -> instanceId.map { x => x: js.Any }),
        ("deploymentId" -> deploymentId.map { x => x: js.Any }),
        ("lifecycleEvents" -> lifecycleEvents.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("lastUpdatedAt" -> lastUpdatedAt.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceSummary]
    }
  }

  /**
   * <p>The application name was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidApplicationNameExceptionException extends js.Object {

  }

  /**
   * <p>The Auto Scaling group was specified in an invalid format or does not exist.</p>
   */
  @js.native
  trait InvalidAutoScalingGroupExceptionException extends js.Object {

  }

  /**
   * <p>The bucket name either doesn't exist or was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidBucketNameFilterExceptionException extends js.Object {

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
   * <p>The specified deployment status doesn't exist or cannot be determined.</p>
   */
  @js.native
  trait InvalidDeploymentStatusExceptionException extends js.Object {

  }

  /**
   * <p>The tag was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidEC2TagExceptionException extends js.Object {

  }

  /**
   * <p>The IAM user ARN was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidIamUserArnExceptionException extends js.Object {

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
   * <p>The specified key prefix filter was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidKeyPrefixFilterExceptionException extends js.Object {

  }

  /**
   * <p>The minimum healthy instances value was specified in an invalid format.</p>
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
   * <p>The specified time range was specified in an invalid format.</p>
   */
  @js.native
  trait InvalidTimeRangeExceptionException extends js.Object {

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
    var startTime: Timestamp
    var endTime: Timestamp
    var diagnostics: Diagnostics
    var status: LifecycleEventStatus
    var lifecycleEventName: LifecycleEventName
  }

  object LifecycleEvent {
    def apply(
      startTime: js.UndefOr[Timestamp] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      diagnostics: js.UndefOr[Diagnostics] = js.undefined,
      status: js.UndefOr[LifecycleEventStatus] = js.undefined,
      lifecycleEventName: js.UndefOr[LifecycleEventName] = js.undefined
    ): LifecycleEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startTime" -> startTime.map { x => x: js.Any }),
        ("endTime" -> endTime.map { x => x: js.Any }),
        ("diagnostics" -> diagnostics.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("lifecycleEventName" -> lifecycleEventName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleEvent]
    }
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
   * <p>Represents the input of a list application revisions operation.</p>
   */
  @js.native
  trait ListApplicationRevisionsInput extends js.Object {
    var s3Bucket: S3Bucket
    var sortBy: ApplicationRevisionSortBy
    var applicationName: ApplicationName
    var nextToken: NextToken
    var deployed: ListStateFilterAction
    var sortOrder: SortOrder
    var s3KeyPrefix: S3Key
  }

  object ListApplicationRevisionsInput {
    def apply(
      s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      sortBy: js.UndefOr[ApplicationRevisionSortBy] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      deployed: js.UndefOr[ListStateFilterAction] = js.undefined,
      sortOrder: js.UndefOr[SortOrder] = js.undefined,
      s3KeyPrefix: js.UndefOr[S3Key] = js.undefined
    ): ListApplicationRevisionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("s3Bucket" -> s3Bucket.map { x => x: js.Any }),
        ("sortBy" -> sortBy.map { x => x: js.Any }),
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("deployed" -> deployed.map { x => x: js.Any }),
        ("sortOrder" -> sortOrder.map { x => x: js.Any }),
        ("s3KeyPrefix" -> s3KeyPrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationRevisionsInput]
    }
  }

  /**
   * <p>Represents the output of a list application revisions operation.</p>
   */
  @js.native
  trait ListApplicationRevisionsOutput extends js.Object {
    var revisions: RevisionLocationList
    var nextToken: NextToken
  }

  object ListApplicationRevisionsOutput {
    def apply(
      revisions: js.UndefOr[RevisionLocationList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationRevisionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("revisions" -> revisions.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationRevisionsOutput]
    }
  }

  /**
   * <p>Represents the input of a list applications operation.</p>
   */
  @js.native
  trait ListApplicationsInput extends js.Object {
    var nextToken: NextToken
  }

  object ListApplicationsInput {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsInput]
    }
  }

  /**
   * <p>Represents the output of a list applications operation.</p>
   */
  @js.native
  trait ListApplicationsOutput extends js.Object {
    var applications: ApplicationsList
    var nextToken: NextToken
  }

  object ListApplicationsOutput {
    def apply(
      applications: js.UndefOr[ApplicationsList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applications" -> applications.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsOutput]
    }
  }

  /**
   * <p>Represents the input of a list deployment configurations operation.</p>
   */
  @js.native
  trait ListDeploymentConfigsInput extends js.Object {
    var nextToken: NextToken
  }

  object ListDeploymentConfigsInput {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentConfigsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentConfigsInput]
    }
  }

  /**
   * <p>Represents the output of a list deployment configurations operation.</p>
   */
  @js.native
  trait ListDeploymentConfigsOutput extends js.Object {
    var deploymentConfigsList: DeploymentConfigsList
    var nextToken: NextToken
  }

  object ListDeploymentConfigsOutput {
    def apply(
      deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentConfigsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentConfigsList" -> deploymentConfigsList.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentConfigsOutput]
    }
  }

  /**
   * <p>Represents the input of a list deployment groups operation.</p>
   */
  @js.native
  trait ListDeploymentGroupsInput extends js.Object {
    var applicationName: ApplicationName
    var nextToken: NextToken
  }

  object ListDeploymentGroupsInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentGroupsInput]
    }
  }

  /**
   * <p>Represents the output of a list deployment groups operation.</p>
   */
  @js.native
  trait ListDeploymentGroupsOutput extends js.Object {
    var applicationName: ApplicationName
    var deploymentGroups: DeploymentGroupsList
    var nextToken: NextToken
  }

  object ListDeploymentGroupsOutput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("deploymentGroups" -> deploymentGroups.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentGroupsOutput]
    }
  }

  /**
   * <p>Represents the input of a list deployment instances operation.</p>
   */
  @js.native
  trait ListDeploymentInstancesInput extends js.Object {
    var deploymentId: DeploymentId
    var nextToken: NextToken
    var instanceStatusFilter: InstanceStatusList
  }

  object ListDeploymentInstancesInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      instanceStatusFilter: js.UndefOr[InstanceStatusList] = js.undefined
    ): ListDeploymentInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentId" -> deploymentId.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("instanceStatusFilter" -> instanceStatusFilter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentInstancesInput]
    }
  }

  /**
   * <p>Represents the output of a list deployment instances operation.</p>
   */
  @js.native
  trait ListDeploymentInstancesOutput extends js.Object {
    var instancesList: InstancesList
    var nextToken: NextToken
  }

  object ListDeploymentInstancesOutput {
    def apply(
      instancesList: js.UndefOr[InstancesList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instancesList" -> instancesList.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentInstancesOutput]
    }
  }

  /**
   * <p>Represents the input of a list deployments operation.</p>
   */
  @js.native
  trait ListDeploymentsInput extends js.Object {
    var includeOnlyStatuses: DeploymentStatusList
    var createTimeRange: TimeRange
    var applicationName: ApplicationName
    var nextToken: NextToken
    var deploymentGroupName: DeploymentGroupName
  }

  object ListDeploymentsInput {
    def apply(
      includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.undefined,
      createTimeRange: js.UndefOr[TimeRange] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    ): ListDeploymentsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("includeOnlyStatuses" -> includeOnlyStatuses.map { x => x: js.Any }),
        ("createTimeRange" -> createTimeRange.map { x => x: js.Any }),
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("deploymentGroupName" -> deploymentGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentsInput]
    }
  }

  /**
   * <p>Represents the output of a list deployments operation.</p>
   */
  @js.native
  trait ListDeploymentsOutput extends js.Object {
    var deployments: DeploymentsList
    var nextToken: NextToken
  }

  object ListDeploymentsOutput {
    def apply(
      deployments: js.UndefOr[DeploymentsList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deployments" -> deployments.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentsOutput]
    }
  }

  /**
   * <p>Represents the input of a list on-premises instances operation.</p>.
   */
  @js.native
  trait ListOnPremisesInstancesInput extends js.Object {
    var registrationStatus: RegistrationStatus
    var tagFilters: TagFilterList
    var nextToken: NextToken
  }

  object ListOnPremisesInstancesInput {
    def apply(
      registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      tagFilters: js.UndefOr[TagFilterList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("registrationStatus" -> registrationStatus.map { x => x: js.Any }),
        ("tagFilters" -> tagFilters.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOnPremisesInstancesInput]
    }
  }

  /**
   * <p>Represents the output of list on-premises instances operation.</p>
   */
  @js.native
  trait ListOnPremisesInstancesOutput extends js.Object {
    var instanceNames: InstanceNameList
    var nextToken: NextToken
  }

  object ListOnPremisesInstancesOutput {
    def apply(
      instanceNames: js.UndefOr[InstanceNameList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOnPremisesInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceNames" -> instanceNames.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
   * <p>Information about minimum healthy instances.</p>
   */
  @js.native
  trait MinimumHealthyHosts extends js.Object {
    var value: MinimumHealthyHostsValue
    var `type`: MinimumHealthyHostsType
  }

  object MinimumHealthyHosts {
    def apply(
      value: js.UndefOr[MinimumHealthyHostsValue] = js.undefined,
      `type`: js.UndefOr[MinimumHealthyHostsType] = js.undefined
    ): MinimumHealthyHosts = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("value" -> value.map { x => x: js.Any }),
        ("`type`" -> `type`.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MinimumHealthyHosts]
    }
  }


  object MinimumHealthyHostsTypeEnum {
    val `HOST_COUNT` = "HOST_COUNT"
    val `FLEET_PERCENT` = "FLEET_PERCENT"

    val values = IndexedSeq(`HOST_COUNT`, `FLEET_PERCENT`)
  }

  /**
   * <p>Represents the input of a register application revision operation.</p>
   */
  @js.native
  trait RegisterApplicationRevisionInput extends js.Object {
    var applicationName: ApplicationName
    var description: Description
    var revision: RevisionLocation
  }

  object RegisterApplicationRevisionInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      revision: js.UndefOr[RevisionLocation] = js.undefined
    ): RegisterApplicationRevisionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any }),
        ("revision" -> revision.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterApplicationRevisionInput]
    }
  }

  /**
   * <p>Represents the input of register on-premises instance operation.</p>
   */
  @js.native
  trait RegisterOnPremisesInstanceInput extends js.Object {
    var instanceName: InstanceName
    var iamUserArn: IamUserArn
  }

  object RegisterOnPremisesInstanceInput {
    def apply(
      instanceName: js.UndefOr[InstanceName] = js.undefined,
      iamUserArn: js.UndefOr[IamUserArn] = js.undefined
    ): RegisterOnPremisesInstanceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceName" -> instanceName.map { x => x: js.Any }),
        ("iamUserArn" -> iamUserArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterOnPremisesInstanceInput]
    }
  }


  object RegistrationStatusEnum {
    val Registered = "Registered"
    val Deregistered = "Deregistered"

    val values = IndexedSeq(Registered, Deregistered)
  }

  /**
   * <p>Represents the input of a remove tags from on-premises instances operation.</p>
   */
  @js.native
  trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
    var tags: TagList
    var instanceNames: InstanceNameList
  }

  object RemoveTagsFromOnPremisesInstancesInput {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      instanceNames: js.UndefOr[InstanceNameList] = js.undefined
    ): RemoveTagsFromOnPremisesInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tags" -> tags.map { x => x: js.Any }),
        ("instanceNames" -> instanceNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromOnPremisesInstancesInput]
    }
  }

  /**
   * <p>The named revision does not exist with the applicable IAM user or AWS account.</p>
   */
  @js.native
  trait RevisionDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>Information about an application revision's location.</p>
   */
  @js.native
  trait RevisionLocation extends js.Object {
    var revisionType: RevisionLocationType
    var s3Location: S3Location
    var gitHubLocation: GitHubLocation
  }

  object RevisionLocation {
    def apply(
      revisionType: js.UndefOr[RevisionLocationType] = js.undefined,
      s3Location: js.UndefOr[S3Location] = js.undefined,
      gitHubLocation: js.UndefOr[GitHubLocation] = js.undefined
    ): RevisionLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("revisionType" -> revisionType.map { x => x: js.Any }),
        ("s3Location" -> s3Location.map { x => x: js.Any }),
        ("gitHubLocation" -> gitHubLocation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevisionLocation]
    }
  }


  object RevisionLocationTypeEnum {
    val S3 = "S3"
    val GitHub = "GitHub"

    val values = IndexedSeq(S3, GitHub)
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
   * <p>Information about the location of application artifacts that are stored in Amazon S3.</p>
   */
  @js.native
  trait S3Location extends js.Object {
    var eTag: ETag
    var key: S3Key
    var version: VersionId
    var bundleType: BundleType
    var bucket: S3Bucket
  }

  object S3Location {
    def apply(
      eTag: js.UndefOr[ETag] = js.undefined,
      key: js.UndefOr[S3Key] = js.undefined,
      version: js.UndefOr[VersionId] = js.undefined,
      bundleType: js.UndefOr[BundleType] = js.undefined,
      bucket: js.UndefOr[S3Bucket] = js.undefined
    ): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("eTag" -> eTag.map { x => x: js.Any }),
        ("key" -> key.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any }),
        ("bundleType" -> bundleType.map { x => x: js.Any }),
        ("bucket" -> bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }


  object SortOrderEnum {
    val ascending = "ascending"
    val descending = "descending"

    val values = IndexedSeq(ascending, descending)
  }

  /**
   * <p>Represents the input of a stop deployment operation.</p>
   */
  @js.native
  trait StopDeploymentInput extends js.Object {
    var deploymentId: DeploymentId
  }

  object StopDeploymentInput {
    def apply(
      deploymentId: js.UndefOr[DeploymentId] = js.undefined
    ): StopDeploymentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deploymentId" -> deploymentId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDeploymentInput]
    }
  }

  /**
   * <p>Represents the output of a stop deployment operation.</p>
   */
  @js.native
  trait StopDeploymentOutput extends js.Object {
    var status: StopStatus
    var statusMessage: Message
  }

  object StopDeploymentOutput {
    def apply(
      status: js.UndefOr[StopStatus] = js.undefined,
      statusMessage: js.UndefOr[Message] = js.undefined
    ): StopDeploymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("status" -> status.map { x => x: js.Any }),
        ("statusMessage" -> statusMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Key: Key
    var Value: Value
  }

  object Tag {
    def apply(
      Key: js.UndefOr[Key] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Information about an on-premises instance tag filter.</p>
   */
  @js.native
  trait TagFilter extends js.Object {
    var Key: Key
    var Value: Value
    var Type: TagFilterType
  }

  object TagFilter {
    def apply(
      Key: js.UndefOr[Key] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined,
      Type: js.UndefOr[TagFilterType] = js.undefined
    ): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }


  object TagFilterTypeEnum {
    val `KEY_ONLY` = "KEY_ONLY"
    val `VALUE_ONLY` = "VALUE_ONLY"
    val `KEY_AND_VALUE` = "KEY_AND_VALUE"

    val values = IndexedSeq(`KEY_ONLY`, `VALUE_ONLY`, `KEY_AND_VALUE`)
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
   * <p>Information about a time range.</p>
   */
  @js.native
  trait TimeRange extends js.Object {
    var start: Timestamp
    var end: Timestamp
  }

  object TimeRange {
    def apply(
      start: js.UndefOr[Timestamp] = js.undefined,
      end: js.UndefOr[Timestamp] = js.undefined
    ): TimeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("start" -> start.map { x => x: js.Any }),
        ("end" -> end.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeRange]
    }
  }

  /**
   * <p>Represents the input of an update application operation.</p>
   */
  @js.native
  trait UpdateApplicationInput extends js.Object {
    var applicationName: ApplicationName
    var newApplicationName: ApplicationName
  }

  object UpdateApplicationInput {
    def apply(
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      newApplicationName: js.UndefOr[ApplicationName] = js.undefined
    ): UpdateApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("newApplicationName" -> newApplicationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationInput]
    }
  }

  /**
   * <p>Represents the input of an update deployment group operation.</p>
   */
  @js.native
  trait UpdateDeploymentGroupInput extends js.Object {
    var currentDeploymentGroupName: DeploymentGroupName
    var serviceRoleArn: Role
    var autoScalingGroups: AutoScalingGroupNameList
    var applicationName: ApplicationName
    var deploymentConfigName: DeploymentConfigName
    var onPremisesInstanceTagFilters: TagFilterList
    var ec2TagFilters: EC2TagFilterList
    var newDeploymentGroupName: DeploymentGroupName
  }

  object UpdateDeploymentGroupInput {
    def apply(
      currentDeploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined,
      serviceRoleArn: js.UndefOr[Role] = js.undefined,
      autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined,
      applicationName: js.UndefOr[ApplicationName] = js.undefined,
      deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined,
      onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined,
      ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined,
      newDeploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    ): UpdateDeploymentGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("currentDeploymentGroupName" -> currentDeploymentGroupName.map { x => x: js.Any }),
        ("serviceRoleArn" -> serviceRoleArn.map { x => x: js.Any }),
        ("autoScalingGroups" -> autoScalingGroups.map { x => x: js.Any }),
        ("applicationName" -> applicationName.map { x => x: js.Any }),
        ("deploymentConfigName" -> deploymentConfigName.map { x => x: js.Any }),
        ("onPremisesInstanceTagFilters" -> onPremisesInstanceTagFilters.map { x => x: js.Any }),
        ("ec2TagFilters" -> ec2TagFilters.map { x => x: js.Any }),
        ("newDeploymentGroupName" -> newDeploymentGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeploymentGroupInput]
    }
  }

  /**
   * <p>Represents the output of an update deployment group operation.</p>
   */
  @js.native
  trait UpdateDeploymentGroupOutput extends js.Object {
    var hooksNotCleanedUp: AutoScalingGroupList
  }

  object UpdateDeploymentGroupOutput {
    def apply(
      hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
    ): UpdateDeploymentGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("hooksNotCleanedUp" -> hooksNotCleanedUp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeploymentGroupOutput]
    }
  }
}
