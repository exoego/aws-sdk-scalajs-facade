package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object ecs {
  type AgentUpdateStatus                     = String
  type AssignPublicIp                        = String
  type AttachmentDetails                     = js.Array[KeyValuePair]
  type AttachmentStateChanges                = js.Array[AttachmentStateChange]
  type Attachments                           = js.Array[Attachment]
  type Attributes                            = js.Array[Attribute]
  type BoxedBoolean                          = Boolean
  type BoxedInteger                          = Int
  type ClusterField                          = String
  type ClusterFieldList                      = js.Array[ClusterField]
  type ClusterSettingName                    = String
  type ClusterSettings                       = js.Array[ClusterSetting]
  type Clusters                              = js.Array[Cluster]
  type Compatibility                         = String
  type CompatibilityList                     = js.Array[Compatibility]
  type Connectivity                          = String
  type ContainerCondition                    = String
  type ContainerDefinitions                  = js.Array[ContainerDefinition]
  type ContainerDependencies                 = js.Array[ContainerDependency]
  type ContainerInstanceField                = String
  type ContainerInstanceFieldList            = js.Array[ContainerInstanceField]
  type ContainerInstanceStatus               = String
  type ContainerInstances                    = js.Array[ContainerInstance]
  type ContainerOverrides                    = js.Array[ContainerOverride]
  type ContainerStateChanges                 = js.Array[ContainerStateChange]
  type Containers                            = js.Array[Container]
  type DeploymentControllerType              = String
  type Deployments                           = js.Array[Deployment]
  type DesiredStatus                         = String
  type DeviceCgroupPermission                = String
  type DeviceCgroupPermissions               = js.Array[DeviceCgroupPermission]
  type DevicesList                           = js.Array[Device]
  type DockerLabelsMap                       = js.Dictionary[String]
  type EnvironmentVariables                  = js.Array[KeyValuePair]
  type Failures                              = js.Array[Failure]
  type GpuIds                                = js.Array[String]
  type HealthStatus                          = String
  type HostEntryList                         = js.Array[HostEntry]
  type IpcMode                               = String
  type LaunchType                            = String
  type LoadBalancers                         = js.Array[LoadBalancer]
  type LogConfigurationOptionsMap            = js.Dictionary[String]
  type LogDriver                             = String
  type MountPointList                        = js.Array[MountPoint]
  type NetworkBindings                       = js.Array[NetworkBinding]
  type NetworkInterfaces                     = js.Array[NetworkInterface]
  type NetworkMode                           = String
  type PidMode                               = String
  type PlacementConstraintType               = String
  type PlacementConstraints                  = js.Array[PlacementConstraint]
  type PlacementStrategies                   = js.Array[PlacementStrategy]
  type PlacementStrategyType                 = String
  type PlatformDeviceType                    = String
  type PlatformDevices                       = js.Array[PlatformDevice]
  type PortMappingList                       = js.Array[PortMapping]
  type PropagateTags                         = String
  type ProxyConfigurationProperties          = js.Array[KeyValuePair]
  type ProxyConfigurationType                = String
  type RequiresAttributes                    = js.Array[Attribute]
  type ResourceRequirements                  = js.Array[ResourceRequirement]
  type ResourceType                          = String
  type Resources                             = js.Array[Resource]
  type ScaleUnit                             = String
  type SchedulingStrategy                    = String
  type Scope                                 = String
  type SecretList                            = js.Array[Secret]
  type ServiceEvents                         = js.Array[ServiceEvent]
  type ServiceField                          = String
  type ServiceFieldList                      = js.Array[ServiceField]
  type ServiceRegistries                     = js.Array[ServiceRegistry]
  type Services                              = js.Array[Service]
  type SettingName                           = String
  type Settings                              = js.Array[Setting]
  type SortOrder                             = String
  type StabilityStatus                       = String
  type Statistics                            = js.Array[KeyValuePair]
  type StringList                            = js.Array[String]
  type StringMap                             = js.Dictionary[String]
  type SystemControls                        = js.Array[SystemControl]
  type TagKey                                = String
  type TagKeys                               = js.Array[TagKey]
  type TagValue                              = String
  type Tags                                  = js.Array[Tag]
  type TargetType                            = String
  type TaskDefinitionFamilyStatus            = String
  type TaskDefinitionField                   = String
  type TaskDefinitionFieldList               = js.Array[TaskDefinitionField]
  type TaskDefinitionPlacementConstraintType = String
  type TaskDefinitionPlacementConstraints    = js.Array[TaskDefinitionPlacementConstraint]
  type TaskDefinitionStatus                  = String
  type TaskField                             = String
  type TaskFieldList                         = js.Array[TaskField]
  type TaskSets                              = js.Array[TaskSet]
  type TaskStopCode                          = String
  type Tasks                                 = js.Array[Task]
  type Timestamp                             = js.Date
  type TmpfsList                             = js.Array[Tmpfs]
  type TransportProtocol                     = String
  type UlimitList                            = js.Array[Ulimit]
  type UlimitName                            = String
  type VolumeFromList                        = js.Array[VolumeFrom]
  type VolumeList                            = js.Array[Volume]

  implicit final class ECSOps(val service: ECS) extends AnyVal {

    def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise.toFuture
    def createServiceFuture(params: CreateServiceRequest): Future[CreateServiceResponse] =
      service.createService(params).promise.toFuture
    def createTaskSetFuture(params: CreateTaskSetRequest): Future[CreateTaskSetResponse] =
      service.createTaskSet(params).promise.toFuture
    def deleteAccountSettingFuture(params: DeleteAccountSettingRequest): Future[DeleteAccountSettingResponse] =
      service.deleteAccountSetting(params).promise.toFuture
    def deleteAttributesFuture(params: DeleteAttributesRequest): Future[DeleteAttributesResponse] =
      service.deleteAttributes(params).promise.toFuture
    def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise.toFuture
    def deleteServiceFuture(params: DeleteServiceRequest): Future[DeleteServiceResponse] =
      service.deleteService(params).promise.toFuture
    def deleteTaskSetFuture(params: DeleteTaskSetRequest): Future[DeleteTaskSetResponse] =
      service.deleteTaskSet(params).promise.toFuture
    def deregisterContainerInstanceFuture(
        params: DeregisterContainerInstanceRequest
    ): Future[DeregisterContainerInstanceResponse] = service.deregisterContainerInstance(params).promise.toFuture
    def deregisterTaskDefinitionFuture(
        params: DeregisterTaskDefinitionRequest
    ): Future[DeregisterTaskDefinitionResponse] = service.deregisterTaskDefinition(params).promise.toFuture
    def describeClustersFuture(params: DescribeClustersRequest): Future[DescribeClustersResponse] =
      service.describeClusters(params).promise.toFuture
    def describeContainerInstancesFuture(
        params: DescribeContainerInstancesRequest
    ): Future[DescribeContainerInstancesResponse] = service.describeContainerInstances(params).promise.toFuture
    def describeServicesFuture(params: DescribeServicesRequest): Future[DescribeServicesResponse] =
      service.describeServices(params).promise.toFuture
    def describeTaskDefinitionFuture(params: DescribeTaskDefinitionRequest): Future[DescribeTaskDefinitionResponse] =
      service.describeTaskDefinition(params).promise.toFuture
    def describeTaskSetsFuture(params: DescribeTaskSetsRequest): Future[DescribeTaskSetsResponse] =
      service.describeTaskSets(params).promise.toFuture
    def describeTasksFuture(params: DescribeTasksRequest): Future[DescribeTasksResponse] =
      service.describeTasks(params).promise.toFuture
    def discoverPollEndpointFuture(params: DiscoverPollEndpointRequest): Future[DiscoverPollEndpointResponse] =
      service.discoverPollEndpoint(params).promise.toFuture
    def listAccountSettingsFuture(params: ListAccountSettingsRequest): Future[ListAccountSettingsResponse] =
      service.listAccountSettings(params).promise.toFuture
    def listAttributesFuture(params: ListAttributesRequest): Future[ListAttributesResponse] =
      service.listAttributes(params).promise.toFuture
    def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] =
      service.listClusters(params).promise.toFuture
    def listContainerInstancesFuture(params: ListContainerInstancesRequest): Future[ListContainerInstancesResponse] =
      service.listContainerInstances(params).promise.toFuture
    def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] =
      service.listServices(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listTaskDefinitionFamiliesFuture(
        params: ListTaskDefinitionFamiliesRequest
    ): Future[ListTaskDefinitionFamiliesResponse] = service.listTaskDefinitionFamilies(params).promise.toFuture
    def listTaskDefinitionsFuture(params: ListTaskDefinitionsRequest): Future[ListTaskDefinitionsResponse] =
      service.listTaskDefinitions(params).promise.toFuture
    def listTasksFuture(params: ListTasksRequest): Future[ListTasksResponse] =
      service.listTasks(params).promise.toFuture
    def putAccountSettingDefaultFuture(
        params: PutAccountSettingDefaultRequest
    ): Future[PutAccountSettingDefaultResponse] = service.putAccountSettingDefault(params).promise.toFuture
    def putAccountSettingFuture(params: PutAccountSettingRequest): Future[PutAccountSettingResponse] =
      service.putAccountSetting(params).promise.toFuture
    def putAttributesFuture(params: PutAttributesRequest): Future[PutAttributesResponse] =
      service.putAttributes(params).promise.toFuture
    def registerContainerInstanceFuture(
        params: RegisterContainerInstanceRequest
    ): Future[RegisterContainerInstanceResponse] = service.registerContainerInstance(params).promise.toFuture
    def registerTaskDefinitionFuture(params: RegisterTaskDefinitionRequest): Future[RegisterTaskDefinitionResponse] =
      service.registerTaskDefinition(params).promise.toFuture
    def runTaskFuture(params: RunTaskRequest): Future[RunTaskResponse] = service.runTask(params).promise.toFuture
    def startTaskFuture(params: StartTaskRequest): Future[StartTaskResponse] =
      service.startTask(params).promise.toFuture
    def stopTaskFuture(params: StopTaskRequest): Future[StopTaskResponse] = service.stopTask(params).promise.toFuture
    def submitAttachmentStateChangesFuture(
        params: SubmitAttachmentStateChangesRequest
    ): Future[SubmitAttachmentStateChangesResponse] = service.submitAttachmentStateChanges(params).promise.toFuture
    def submitContainerStateChangeFuture(
        params: SubmitContainerStateChangeRequest
    ): Future[SubmitContainerStateChangeResponse] = service.submitContainerStateChange(params).promise.toFuture
    def submitTaskStateChangeFuture(params: SubmitTaskStateChangeRequest): Future[SubmitTaskStateChangeResponse] =
      service.submitTaskStateChange(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateContainerAgentFuture(params: UpdateContainerAgentRequest): Future[UpdateContainerAgentResponse] =
      service.updateContainerAgent(params).promise.toFuture
    def updateContainerInstancesStateFuture(
        params: UpdateContainerInstancesStateRequest
    ): Future[UpdateContainerInstancesStateResponse] = service.updateContainerInstancesState(params).promise.toFuture
    def updateServiceFuture(params: UpdateServiceRequest): Future[UpdateServiceResponse] =
      service.updateService(params).promise.toFuture
    def updateServicePrimaryTaskSetFuture(
        params: UpdateServicePrimaryTaskSetRequest
    ): Future[UpdateServicePrimaryTaskSetResponse] = service.updateServicePrimaryTaskSet(params).promise.toFuture
    def updateTaskSetFuture(params: UpdateTaskSetRequest): Future[UpdateTaskSetResponse] =
      service.updateTaskSet(params).promise.toFuture
  }
}

package ecs {
  @js.native
  @JSImport("aws-sdk", "ECS")
  class ECS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse]                      = js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse]                      = js.native
    def createTaskSet(params: CreateTaskSetRequest): Request[CreateTaskSetResponse]                      = js.native
    def deleteAccountSetting(params: DeleteAccountSettingRequest): Request[DeleteAccountSettingResponse] = js.native
    def deleteAttributes(params: DeleteAttributesRequest): Request[DeleteAttributesResponse]             = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse]                      = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse]                      = js.native
    def deleteTaskSet(params: DeleteTaskSetRequest): Request[DeleteTaskSetResponse]                      = js.native
    def deregisterContainerInstance(
        params: DeregisterContainerInstanceRequest
    ): Request[DeregisterContainerInstanceResponse] = js.native
    def deregisterTaskDefinition(params: DeregisterTaskDefinitionRequest): Request[DeregisterTaskDefinitionResponse] =
      js.native
    def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse] = js.native
    def describeContainerInstances(
        params: DescribeContainerInstancesRequest
    ): Request[DescribeContainerInstancesResponse]                                           = js.native
    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse] = js.native
    def describeTaskDefinition(params: DescribeTaskDefinitionRequest): Request[DescribeTaskDefinitionResponse] =
      js.native
    def describeTaskSets(params: DescribeTaskSetsRequest): Request[DescribeTaskSetsResponse]             = js.native
    def describeTasks(params: DescribeTasksRequest): Request[DescribeTasksResponse]                      = js.native
    def discoverPollEndpoint(params: DiscoverPollEndpointRequest): Request[DiscoverPollEndpointResponse] = js.native
    def listAccountSettings(params: ListAccountSettingsRequest): Request[ListAccountSettingsResponse]    = js.native
    def listAttributes(params: ListAttributesRequest): Request[ListAttributesResponse]                   = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse]                         = js.native
    def listContainerInstances(params: ListContainerInstancesRequest): Request[ListContainerInstancesResponse] =
      js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse]                      = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTaskDefinitionFamilies(
        params: ListTaskDefinitionFamiliesRequest
    ): Request[ListTaskDefinitionFamiliesResponse]                                                    = js.native
    def listTaskDefinitions(params: ListTaskDefinitionsRequest): Request[ListTaskDefinitionsResponse] = js.native
    def listTasks(params: ListTasksRequest): Request[ListTasksResponse]                               = js.native
    def putAccountSetting(params: PutAccountSettingRequest): Request[PutAccountSettingResponse]       = js.native
    def putAccountSettingDefault(params: PutAccountSettingDefaultRequest): Request[PutAccountSettingDefaultResponse] =
      js.native
    def putAttributes(params: PutAttributesRequest): Request[PutAttributesResponse] = js.native
    def registerContainerInstance(
        params: RegisterContainerInstanceRequest
    ): Request[RegisterContainerInstanceResponse] = js.native
    def registerTaskDefinition(params: RegisterTaskDefinitionRequest): Request[RegisterTaskDefinitionResponse] =
      js.native
    def runTask(params: RunTaskRequest): Request[RunTaskResponse]       = js.native
    def startTask(params: StartTaskRequest): Request[StartTaskResponse] = js.native
    def stopTask(params: StopTaskRequest): Request[StopTaskResponse]    = js.native
    def submitAttachmentStateChanges(
        params: SubmitAttachmentStateChangesRequest
    ): Request[SubmitAttachmentStateChangesResponse] = js.native
    def submitContainerStateChange(
        params: SubmitContainerStateChangeRequest
    ): Request[SubmitContainerStateChangeResponse]                                                          = js.native
    def submitTaskStateChange(params: SubmitTaskStateChangeRequest): Request[SubmitTaskStateChangeResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateContainerAgent(params: UpdateContainerAgentRequest): Request[UpdateContainerAgentResponse]    = js.native
    def updateContainerInstancesState(
        params: UpdateContainerInstancesStateRequest
    ): Request[UpdateContainerInstancesStateResponse]                               = js.native
    def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse] = js.native
    def updateServicePrimaryTaskSet(
        params: UpdateServicePrimaryTaskSetRequest
    ): Request[UpdateServicePrimaryTaskSetResponse]                                 = js.native
    def updateTaskSet(params: UpdateTaskSetRequest): Request[UpdateTaskSetResponse] = js.native
  }

  object AgentUpdateStatusEnum {
    val PENDING  = "PENDING"
    val STAGING  = "STAGING"
    val STAGED   = "STAGED"
    val UPDATING = "UPDATING"
    val UPDATED  = "UPDATED"
    val FAILED   = "FAILED"

    val values = IndexedSeq(PENDING, STAGING, STAGED, UPDATING, UPDATED, FAILED)
  }

  object AssignPublicIpEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
    * An object representing a container instance or task attachment.
    */
  @js.native
  trait Attachment extends js.Object {
    var details: js.UndefOr[AttachmentDetails]
    var id: js.UndefOr[String]
    var status: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  object Attachment {
    def apply(
        details: js.UndefOr[AttachmentDetails] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): Attachment = {
      val __obj = js.Dictionary.empty[js.Any]
      details.foreach(__v => __obj.update("details", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attachment]
    }
  }

  /**
    * An object representing a change in state for a task attachment.
    */
  @js.native
  trait AttachmentStateChange extends js.Object {
    var attachmentArn: String
    var status: String
  }

  object AttachmentStateChange {
    def apply(
        attachmentArn: String,
        status: String
    ): AttachmentStateChange = {
      val __obj = js.Dictionary[js.Any](
        "attachmentArn" -> attachmentArn.asInstanceOf[js.Any],
        "status"        -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachmentStateChange]
    }
  }

  /**
    * An attribute is a name-value pair associated with an Amazon ECS object. Attributes enable you to extend the Amazon ECS data model by adding custom metadata to your resources. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes|Attributes]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  trait Attribute extends js.Object {
    var name: String
    var targetId: js.UndefOr[String]
    var targetType: js.UndefOr[TargetType]
    var value: js.UndefOr[String]
  }

  object Attribute {
    def apply(
        name: String,
        targetId: js.UndefOr[String] = js.undefined,
        targetType: js.UndefOr[TargetType] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): Attribute = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      targetId.foreach(__v => __obj.update("targetId", __v.asInstanceOf[js.Any]))
      targetType.foreach(__v => __obj.update("targetType", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  /**
    * An object representing the networking details for a task or service.
    */
  @js.native
  trait AwsVpcConfiguration extends js.Object {
    var subnets: StringList
    var assignPublicIp: js.UndefOr[AssignPublicIp]
    var securityGroups: js.UndefOr[StringList]
  }

  object AwsVpcConfiguration {
    def apply(
        subnets: StringList,
        assignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined,
        securityGroups: js.UndefOr[StringList] = js.undefined
    ): AwsVpcConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "subnets" -> subnets.asInstanceOf[js.Any]
      )

      assignPublicIp.foreach(__v => __obj.update("assignPublicIp", __v.asInstanceOf[js.Any]))
      securityGroups.foreach(__v => __obj.update("securityGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsVpcConfiguration]
    }
  }

  /**
    * A regional grouping of one or more container instances on which you can run task requests. Each account receives a default cluster the first time you use the Amazon ECS service, but you may also create other clusters. Clusters may contain more than one instance type simultaneously.
    */
  @js.native
  trait Cluster extends js.Object {
    var activeServicesCount: js.UndefOr[Int]
    var clusterArn: js.UndefOr[String]
    var clusterName: js.UndefOr[String]
    var pendingTasksCount: js.UndefOr[Int]
    var registeredContainerInstancesCount: js.UndefOr[Int]
    var runningTasksCount: js.UndefOr[Int]
    var settings: js.UndefOr[ClusterSettings]
    var statistics: js.UndefOr[Statistics]
    var status: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  object Cluster {
    def apply(
        activeServicesCount: js.UndefOr[Int] = js.undefined,
        clusterArn: js.UndefOr[String] = js.undefined,
        clusterName: js.UndefOr[String] = js.undefined,
        pendingTasksCount: js.UndefOr[Int] = js.undefined,
        registeredContainerInstancesCount: js.UndefOr[Int] = js.undefined,
        runningTasksCount: js.UndefOr[Int] = js.undefined,
        settings: js.UndefOr[ClusterSettings] = js.undefined,
        statistics: js.UndefOr[Statistics] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): Cluster = {
      val __obj = js.Dictionary.empty[js.Any]
      activeServicesCount.foreach(__v => __obj.update("activeServicesCount", __v.asInstanceOf[js.Any]))
      clusterArn.foreach(__v => __obj.update("clusterArn", __v.asInstanceOf[js.Any]))
      clusterName.foreach(__v => __obj.update("clusterName", __v.asInstanceOf[js.Any]))
      pendingTasksCount.foreach(__v => __obj.update("pendingTasksCount", __v.asInstanceOf[js.Any]))
      registeredContainerInstancesCount.foreach(
        __v => __obj.update("registeredContainerInstancesCount", __v.asInstanceOf[js.Any])
      )
      runningTasksCount.foreach(__v => __obj.update("runningTasksCount", __v.asInstanceOf[js.Any]))
      settings.foreach(__v => __obj.update("settings", __v.asInstanceOf[js.Any]))
      statistics.foreach(__v => __obj.update("statistics", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  object ClusterFieldEnum {
    val STATISTICS = "STATISTICS"
    val TAGS       = "TAGS"

    val values = IndexedSeq(STATISTICS, TAGS)
  }

  /**
    * The settings to use when creating a cluster. This parameter is used to enable CloudWatch Container Insights for a cluster.
    */
  @js.native
  trait ClusterSetting extends js.Object {
    var name: js.UndefOr[ClusterSettingName]
    var value: js.UndefOr[String]
  }

  object ClusterSetting {
    def apply(
        name: js.UndefOr[ClusterSettingName] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): ClusterSetting = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterSetting]
    }
  }

  object ClusterSettingNameEnum {
    val containerInsights = "containerInsights"

    val values = IndexedSeq(containerInsights)
  }

  object CompatibilityEnum {
    val EC2     = "EC2"
    val FARGATE = "FARGATE"

    val values = IndexedSeq(EC2, FARGATE)
  }

  object ConnectivityEnum {
    val CONNECTED    = "CONNECTED"
    val DISCONNECTED = "DISCONNECTED"

    val values = IndexedSeq(CONNECTED, DISCONNECTED)
  }

  /**
    * A Docker container that is part of a task.
    */
  @js.native
  trait Container extends js.Object {
    var containerArn: js.UndefOr[String]
    var cpu: js.UndefOr[String]
    var exitCode: js.UndefOr[BoxedInteger]
    var gpuIds: js.UndefOr[GpuIds]
    var healthStatus: js.UndefOr[HealthStatus]
    var lastStatus: js.UndefOr[String]
    var memory: js.UndefOr[String]
    var memoryReservation: js.UndefOr[String]
    var name: js.UndefOr[String]
    var networkBindings: js.UndefOr[NetworkBindings]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var reason: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
  }

  object Container {
    def apply(
        containerArn: js.UndefOr[String] = js.undefined,
        cpu: js.UndefOr[String] = js.undefined,
        exitCode: js.UndefOr[BoxedInteger] = js.undefined,
        gpuIds: js.UndefOr[GpuIds] = js.undefined,
        healthStatus: js.UndefOr[HealthStatus] = js.undefined,
        lastStatus: js.UndefOr[String] = js.undefined,
        memory: js.UndefOr[String] = js.undefined,
        memoryReservation: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
        networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        taskArn: js.UndefOr[String] = js.undefined
    ): Container = {
      val __obj = js.Dictionary.empty[js.Any]
      containerArn.foreach(__v => __obj.update("containerArn", __v.asInstanceOf[js.Any]))
      cpu.foreach(__v => __obj.update("cpu", __v.asInstanceOf[js.Any]))
      exitCode.foreach(__v => __obj.update("exitCode", __v.asInstanceOf[js.Any]))
      gpuIds.foreach(__v => __obj.update("gpuIds", __v.asInstanceOf[js.Any]))
      healthStatus.foreach(__v => __obj.update("healthStatus", __v.asInstanceOf[js.Any]))
      lastStatus.foreach(__v => __obj.update("lastStatus", __v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.update("memory", __v.asInstanceOf[js.Any]))
      memoryReservation.foreach(__v => __obj.update("memoryReservation", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      networkBindings.foreach(__v => __obj.update("networkBindings", __v.asInstanceOf[js.Any]))
      networkInterfaces.foreach(__v => __obj.update("networkInterfaces", __v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.update("reason", __v.asInstanceOf[js.Any]))
      taskArn.foreach(__v => __obj.update("taskArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Container]
    }
  }

  object ContainerConditionEnum {
    val START    = "START"
    val COMPLETE = "COMPLETE"
    val SUCCESS  = "SUCCESS"
    val HEALTHY  = "HEALTHY"

    val values = IndexedSeq(START, COMPLETE, SUCCESS, HEALTHY)
  }

  /**
    * Container definitions are used in task definitions to describe the different containers that are launched as part of a task.
    */
  @js.native
  trait ContainerDefinition extends js.Object {
    var command: js.UndefOr[StringList]
    var cpu: js.UndefOr[Int]
    var dependsOn: js.UndefOr[ContainerDependencies]
    var disableNetworking: js.UndefOr[BoxedBoolean]
    var dnsSearchDomains: js.UndefOr[StringList]
    var dnsServers: js.UndefOr[StringList]
    var dockerLabels: js.UndefOr[DockerLabelsMap]
    var dockerSecurityOptions: js.UndefOr[StringList]
    var entryPoint: js.UndefOr[StringList]
    var environment: js.UndefOr[EnvironmentVariables]
    var essential: js.UndefOr[BoxedBoolean]
    var extraHosts: js.UndefOr[HostEntryList]
    var healthCheck: js.UndefOr[HealthCheck]
    var hostname: js.UndefOr[String]
    var image: js.UndefOr[String]
    var interactive: js.UndefOr[BoxedBoolean]
    var links: js.UndefOr[StringList]
    var linuxParameters: js.UndefOr[LinuxParameters]
    var logConfiguration: js.UndefOr[LogConfiguration]
    var memory: js.UndefOr[BoxedInteger]
    var memoryReservation: js.UndefOr[BoxedInteger]
    var mountPoints: js.UndefOr[MountPointList]
    var name: js.UndefOr[String]
    var portMappings: js.UndefOr[PortMappingList]
    var privileged: js.UndefOr[BoxedBoolean]
    var pseudoTerminal: js.UndefOr[BoxedBoolean]
    var readonlyRootFilesystem: js.UndefOr[BoxedBoolean]
    var repositoryCredentials: js.UndefOr[RepositoryCredentials]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
    var secrets: js.UndefOr[SecretList]
    var startTimeout: js.UndefOr[BoxedInteger]
    var stopTimeout: js.UndefOr[BoxedInteger]
    var systemControls: js.UndefOr[SystemControls]
    var ulimits: js.UndefOr[UlimitList]
    var user: js.UndefOr[String]
    var volumesFrom: js.UndefOr[VolumeFromList]
    var workingDirectory: js.UndefOr[String]
  }

  object ContainerDefinition {
    def apply(
        command: js.UndefOr[StringList] = js.undefined,
        cpu: js.UndefOr[Int] = js.undefined,
        dependsOn: js.UndefOr[ContainerDependencies] = js.undefined,
        disableNetworking: js.UndefOr[BoxedBoolean] = js.undefined,
        dnsSearchDomains: js.UndefOr[StringList] = js.undefined,
        dnsServers: js.UndefOr[StringList] = js.undefined,
        dockerLabels: js.UndefOr[DockerLabelsMap] = js.undefined,
        dockerSecurityOptions: js.UndefOr[StringList] = js.undefined,
        entryPoint: js.UndefOr[StringList] = js.undefined,
        environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        essential: js.UndefOr[BoxedBoolean] = js.undefined,
        extraHosts: js.UndefOr[HostEntryList] = js.undefined,
        healthCheck: js.UndefOr[HealthCheck] = js.undefined,
        hostname: js.UndefOr[String] = js.undefined,
        image: js.UndefOr[String] = js.undefined,
        interactive: js.UndefOr[BoxedBoolean] = js.undefined,
        links: js.UndefOr[StringList] = js.undefined,
        linuxParameters: js.UndefOr[LinuxParameters] = js.undefined,
        logConfiguration: js.UndefOr[LogConfiguration] = js.undefined,
        memory: js.UndefOr[BoxedInteger] = js.undefined,
        memoryReservation: js.UndefOr[BoxedInteger] = js.undefined,
        mountPoints: js.UndefOr[MountPointList] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        portMappings: js.UndefOr[PortMappingList] = js.undefined,
        privileged: js.UndefOr[BoxedBoolean] = js.undefined,
        pseudoTerminal: js.UndefOr[BoxedBoolean] = js.undefined,
        readonlyRootFilesystem: js.UndefOr[BoxedBoolean] = js.undefined,
        repositoryCredentials: js.UndefOr[RepositoryCredentials] = js.undefined,
        resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined,
        secrets: js.UndefOr[SecretList] = js.undefined,
        startTimeout: js.UndefOr[BoxedInteger] = js.undefined,
        stopTimeout: js.UndefOr[BoxedInteger] = js.undefined,
        systemControls: js.UndefOr[SystemControls] = js.undefined,
        ulimits: js.UndefOr[UlimitList] = js.undefined,
        user: js.UndefOr[String] = js.undefined,
        volumesFrom: js.UndefOr[VolumeFromList] = js.undefined,
        workingDirectory: js.UndefOr[String] = js.undefined
    ): ContainerDefinition = {
      val __obj = js.Dictionary.empty[js.Any]
      command.foreach(__v => __obj.update("command", __v.asInstanceOf[js.Any]))
      cpu.foreach(__v => __obj.update("cpu", __v.asInstanceOf[js.Any]))
      dependsOn.foreach(__v => __obj.update("dependsOn", __v.asInstanceOf[js.Any]))
      disableNetworking.foreach(__v => __obj.update("disableNetworking", __v.asInstanceOf[js.Any]))
      dnsSearchDomains.foreach(__v => __obj.update("dnsSearchDomains", __v.asInstanceOf[js.Any]))
      dnsServers.foreach(__v => __obj.update("dnsServers", __v.asInstanceOf[js.Any]))
      dockerLabels.foreach(__v => __obj.update("dockerLabels", __v.asInstanceOf[js.Any]))
      dockerSecurityOptions.foreach(__v => __obj.update("dockerSecurityOptions", __v.asInstanceOf[js.Any]))
      entryPoint.foreach(__v => __obj.update("entryPoint", __v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.update("environment", __v.asInstanceOf[js.Any]))
      essential.foreach(__v => __obj.update("essential", __v.asInstanceOf[js.Any]))
      extraHosts.foreach(__v => __obj.update("extraHosts", __v.asInstanceOf[js.Any]))
      healthCheck.foreach(__v => __obj.update("healthCheck", __v.asInstanceOf[js.Any]))
      hostname.foreach(__v => __obj.update("hostname", __v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.update("image", __v.asInstanceOf[js.Any]))
      interactive.foreach(__v => __obj.update("interactive", __v.asInstanceOf[js.Any]))
      links.foreach(__v => __obj.update("links", __v.asInstanceOf[js.Any]))
      linuxParameters.foreach(__v => __obj.update("linuxParameters", __v.asInstanceOf[js.Any]))
      logConfiguration.foreach(__v => __obj.update("logConfiguration", __v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.update("memory", __v.asInstanceOf[js.Any]))
      memoryReservation.foreach(__v => __obj.update("memoryReservation", __v.asInstanceOf[js.Any]))
      mountPoints.foreach(__v => __obj.update("mountPoints", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      portMappings.foreach(__v => __obj.update("portMappings", __v.asInstanceOf[js.Any]))
      privileged.foreach(__v => __obj.update("privileged", __v.asInstanceOf[js.Any]))
      pseudoTerminal.foreach(__v => __obj.update("pseudoTerminal", __v.asInstanceOf[js.Any]))
      readonlyRootFilesystem.foreach(__v => __obj.update("readonlyRootFilesystem", __v.asInstanceOf[js.Any]))
      repositoryCredentials.foreach(__v => __obj.update("repositoryCredentials", __v.asInstanceOf[js.Any]))
      resourceRequirements.foreach(__v => __obj.update("resourceRequirements", __v.asInstanceOf[js.Any]))
      secrets.foreach(__v => __obj.update("secrets", __v.asInstanceOf[js.Any]))
      startTimeout.foreach(__v => __obj.update("startTimeout", __v.asInstanceOf[js.Any]))
      stopTimeout.foreach(__v => __obj.update("stopTimeout", __v.asInstanceOf[js.Any]))
      systemControls.foreach(__v => __obj.update("systemControls", __v.asInstanceOf[js.Any]))
      ulimits.foreach(__v => __obj.update("ulimits", __v.asInstanceOf[js.Any]))
      user.foreach(__v => __obj.update("user", __v.asInstanceOf[js.Any]))
      volumesFrom.foreach(__v => __obj.update("volumesFrom", __v.asInstanceOf[js.Any]))
      workingDirectory.foreach(__v => __obj.update("workingDirectory", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDefinition]
    }
  }

  /**
    * The dependencies defined for container startup and shutdown. A container can contain multiple dependencies. When a dependency is defined for container startup, for container shutdown it is reversed.
    *  Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable container dependencies. However, we recommend using the latest container agent version. For information about checking your agent version and updating to the latest version, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html|Updating the Amazon ECS Container Agent]] in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code> or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html|Amazon ECS-optimized Linux AMI]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    *
    * '''Note:'''If you are using tasks that use the Fargate launch type, container dependency parameters are not supported.
    */
  @js.native
  trait ContainerDependency extends js.Object {
    var condition: ContainerCondition
    var containerName: String
  }

  object ContainerDependency {
    def apply(
        condition: ContainerCondition,
        containerName: String
    ): ContainerDependency = {
      val __obj = js.Dictionary[js.Any](
        "condition"     -> condition.asInstanceOf[js.Any],
        "containerName" -> containerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ContainerDependency]
    }
  }

  /**
    * An EC2 instance that is running the Amazon ECS agent and has been registered with a cluster.
    */
  @js.native
  trait ContainerInstance extends js.Object {
    var agentConnected: js.UndefOr[Boolean]
    var agentUpdateStatus: js.UndefOr[AgentUpdateStatus]
    var attachments: js.UndefOr[Attachments]
    var attributes: js.UndefOr[Attributes]
    var containerInstanceArn: js.UndefOr[String]
    var ec2InstanceId: js.UndefOr[String]
    var pendingTasksCount: js.UndefOr[Int]
    var registeredAt: js.UndefOr[Timestamp]
    var registeredResources: js.UndefOr[Resources]
    var remainingResources: js.UndefOr[Resources]
    var runningTasksCount: js.UndefOr[Int]
    var status: js.UndefOr[String]
    var statusReason: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
    var version: js.UndefOr[Double]
    var versionInfo: js.UndefOr[VersionInfo]
  }

  object ContainerInstance {
    def apply(
        agentConnected: js.UndefOr[Boolean] = js.undefined,
        agentUpdateStatus: js.UndefOr[AgentUpdateStatus] = js.undefined,
        attachments: js.UndefOr[Attachments] = js.undefined,
        attributes: js.UndefOr[Attributes] = js.undefined,
        containerInstanceArn: js.UndefOr[String] = js.undefined,
        ec2InstanceId: js.UndefOr[String] = js.undefined,
        pendingTasksCount: js.UndefOr[Int] = js.undefined,
        registeredAt: js.UndefOr[Timestamp] = js.undefined,
        registeredResources: js.UndefOr[Resources] = js.undefined,
        remainingResources: js.UndefOr[Resources] = js.undefined,
        runningTasksCount: js.UndefOr[Int] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        version: js.UndefOr[Double] = js.undefined,
        versionInfo: js.UndefOr[VersionInfo] = js.undefined
    ): ContainerInstance = {
      val __obj = js.Dictionary.empty[js.Any]
      agentConnected.foreach(__v => __obj.update("agentConnected", __v.asInstanceOf[js.Any]))
      agentUpdateStatus.foreach(__v => __obj.update("agentUpdateStatus", __v.asInstanceOf[js.Any]))
      attachments.foreach(__v => __obj.update("attachments", __v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      containerInstanceArn.foreach(__v => __obj.update("containerInstanceArn", __v.asInstanceOf[js.Any]))
      ec2InstanceId.foreach(__v => __obj.update("ec2InstanceId", __v.asInstanceOf[js.Any]))
      pendingTasksCount.foreach(__v => __obj.update("pendingTasksCount", __v.asInstanceOf[js.Any]))
      registeredAt.foreach(__v => __obj.update("registeredAt", __v.asInstanceOf[js.Any]))
      registeredResources.foreach(__v => __obj.update("registeredResources", __v.asInstanceOf[js.Any]))
      remainingResources.foreach(__v => __obj.update("remainingResources", __v.asInstanceOf[js.Any]))
      runningTasksCount.foreach(__v => __obj.update("runningTasksCount", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.update("statusReason", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      versionInfo.foreach(__v => __obj.update("versionInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerInstance]
    }
  }

  object ContainerInstanceFieldEnum {
    val TAGS = "TAGS"

    val values = IndexedSeq(TAGS)
  }

  object ContainerInstanceStatusEnum {
    val ACTIVE              = "ACTIVE"
    val DRAINING            = "DRAINING"
    val REGISTERING         = "REGISTERING"
    val DEREGISTERING       = "DEREGISTERING"
    val REGISTRATION_FAILED = "REGISTRATION_FAILED"

    val values = IndexedSeq(ACTIVE, DRAINING, REGISTERING, DEREGISTERING, REGISTRATION_FAILED)
  }

  /**
    * The overrides that should be sent to a container. An empty container override can be passed in. An example of an empty container override would be <code>{"containerOverrides": [ ] }</code>. If a non-empty container override is specified, the <code>name</code> parameter must be included.
    */
  @js.native
  trait ContainerOverride extends js.Object {
    var command: js.UndefOr[StringList]
    var cpu: js.UndefOr[BoxedInteger]
    var environment: js.UndefOr[EnvironmentVariables]
    var memory: js.UndefOr[BoxedInteger]
    var memoryReservation: js.UndefOr[BoxedInteger]
    var name: js.UndefOr[String]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
  }

  object ContainerOverride {
    def apply(
        command: js.UndefOr[StringList] = js.undefined,
        cpu: js.UndefOr[BoxedInteger] = js.undefined,
        environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        memory: js.UndefOr[BoxedInteger] = js.undefined,
        memoryReservation: js.UndefOr[BoxedInteger] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined
    ): ContainerOverride = {
      val __obj = js.Dictionary.empty[js.Any]
      command.foreach(__v => __obj.update("command", __v.asInstanceOf[js.Any]))
      cpu.foreach(__v => __obj.update("cpu", __v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.update("environment", __v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.update("memory", __v.asInstanceOf[js.Any]))
      memoryReservation.foreach(__v => __obj.update("memoryReservation", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      resourceRequirements.foreach(__v => __obj.update("resourceRequirements", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerOverride]
    }
  }

  /**
    * An object representing a change in state for a container.
    */
  @js.native
  trait ContainerStateChange extends js.Object {
    var containerName: js.UndefOr[String]
    var exitCode: js.UndefOr[BoxedInteger]
    var networkBindings: js.UndefOr[NetworkBindings]
    var reason: js.UndefOr[String]
    var status: js.UndefOr[String]
  }

  object ContainerStateChange {
    def apply(
        containerName: js.UndefOr[String] = js.undefined,
        exitCode: js.UndefOr[BoxedInteger] = js.undefined,
        networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined
    ): ContainerStateChange = {
      val __obj = js.Dictionary.empty[js.Any]
      containerName.foreach(__v => __obj.update("containerName", __v.asInstanceOf[js.Any]))
      exitCode.foreach(__v => __obj.update("exitCode", __v.asInstanceOf[js.Any]))
      networkBindings.foreach(__v => __obj.update("networkBindings", __v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.update("reason", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerStateChange]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var clusterName: js.UndefOr[String]
    var settings: js.UndefOr[ClusterSettings]
    var tags: js.UndefOr[Tags]
  }

  object CreateClusterRequest {
    def apply(
        clusterName: js.UndefOr[String] = js.undefined,
        settings: js.UndefOr[ClusterSettings] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      clusterName.foreach(__v => __obj.update("clusterName", __v.asInstanceOf[js.Any]))
      settings.foreach(__v => __obj.update("settings", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    def apply(
        cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait CreateServiceRequest extends js.Object {
    var serviceName: String
    var clientToken: js.UndefOr[String]
    var cluster: js.UndefOr[String]
    var deploymentConfiguration: js.UndefOr[DeploymentConfiguration]
    var deploymentController: js.UndefOr[DeploymentController]
    var desiredCount: js.UndefOr[BoxedInteger]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger]
    var launchType: js.UndefOr[LaunchType]
    var loadBalancers: js.UndefOr[LoadBalancers]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var placementConstraints: js.UndefOr[PlacementConstraints]
    var placementStrategy: js.UndefOr[PlacementStrategies]
    var platformVersion: js.UndefOr[String]
    var propagateTags: js.UndefOr[PropagateTags]
    var role: js.UndefOr[String]
    var schedulingStrategy: js.UndefOr[SchedulingStrategy]
    var serviceRegistries: js.UndefOr[ServiceRegistries]
    var tags: js.UndefOr[Tags]
    var taskDefinition: js.UndefOr[String]
  }

  object CreateServiceRequest {
    def apply(
        serviceName: String,
        clientToken: js.UndefOr[String] = js.undefined,
        cluster: js.UndefOr[String] = js.undefined,
        deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
        deploymentController: js.UndefOr[DeploymentController] = js.undefined,
        desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
        enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
        healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
        placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        propagateTags: js.UndefOr[PropagateTags] = js.undefined,
        role: js.UndefOr[String] = js.undefined,
        schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined,
        serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        taskDefinition: js.UndefOr[String] = js.undefined
    ): CreateServiceRequest = {
      val __obj = js.Dictionary[js.Any](
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      deploymentConfiguration.foreach(__v => __obj.update("deploymentConfiguration", __v.asInstanceOf[js.Any]))
      deploymentController.foreach(__v => __obj.update("deploymentController", __v.asInstanceOf[js.Any]))
      desiredCount.foreach(__v => __obj.update("desiredCount", __v.asInstanceOf[js.Any]))
      enableECSManagedTags.foreach(__v => __obj.update("enableECSManagedTags", __v.asInstanceOf[js.Any]))
      healthCheckGracePeriodSeconds.foreach(
        __v => __obj.update("healthCheckGracePeriodSeconds", __v.asInstanceOf[js.Any])
      )
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      loadBalancers.foreach(__v => __obj.update("loadBalancers", __v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.update("networkConfiguration", __v.asInstanceOf[js.Any]))
      placementConstraints.foreach(__v => __obj.update("placementConstraints", __v.asInstanceOf[js.Any]))
      placementStrategy.foreach(__v => __obj.update("placementStrategy", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      propagateTags.foreach(__v => __obj.update("propagateTags", __v.asInstanceOf[js.Any]))
      role.foreach(__v => __obj.update("role", __v.asInstanceOf[js.Any]))
      schedulingStrategy.foreach(__v => __obj.update("schedulingStrategy", __v.asInstanceOf[js.Any]))
      serviceRegistries.foreach(__v => __obj.update("serviceRegistries", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      taskDefinition.foreach(__v => __obj.update("taskDefinition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceRequest]
    }
  }

  @js.native
  trait CreateServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  object CreateServiceResponse {
    def apply(
        service: js.UndefOr[Service] = js.undefined
    ): CreateServiceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      service.foreach(__v => __obj.update("service", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceResponse]
    }
  }

  @js.native
  trait CreateTaskSetRequest extends js.Object {
    var cluster: String
    var service: String
    var taskDefinition: String
    var clientToken: js.UndefOr[String]
    var externalId: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var loadBalancers: js.UndefOr[LoadBalancers]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var platformVersion: js.UndefOr[String]
    var scale: js.UndefOr[Scale]
    var serviceRegistries: js.UndefOr[ServiceRegistries]
  }

  object CreateTaskSetRequest {
    def apply(
        cluster: String,
        service: String,
        taskDefinition: String,
        clientToken: js.UndefOr[String] = js.undefined,
        externalId: js.UndefOr[String] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        scale: js.UndefOr[Scale] = js.undefined,
        serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined
    ): CreateTaskSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "cluster"        -> cluster.asInstanceOf[js.Any],
        "service"        -> service.asInstanceOf[js.Any],
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      externalId.foreach(__v => __obj.update("externalId", __v.asInstanceOf[js.Any]))
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      loadBalancers.foreach(__v => __obj.update("loadBalancers", __v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.update("networkConfiguration", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      scale.foreach(__v => __obj.update("scale", __v.asInstanceOf[js.Any]))
      serviceRegistries.foreach(__v => __obj.update("serviceRegistries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTaskSetRequest]
    }
  }

  @js.native
  trait CreateTaskSetResponse extends js.Object {
    var taskSet: js.UndefOr[TaskSet]
  }

  object CreateTaskSetResponse {
    def apply(
        taskSet: js.UndefOr[TaskSet] = js.undefined
    ): CreateTaskSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      taskSet.foreach(__v => __obj.update("taskSet", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTaskSetResponse]
    }
  }

  @js.native
  trait DeleteAccountSettingRequest extends js.Object {
    var name: SettingName
    var principalArn: js.UndefOr[String]
  }

  object DeleteAccountSettingRequest {
    def apply(
        name: SettingName,
        principalArn: js.UndefOr[String] = js.undefined
    ): DeleteAccountSettingRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      principalArn.foreach(__v => __obj.update("principalArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccountSettingRequest]
    }
  }

  @js.native
  trait DeleteAccountSettingResponse extends js.Object {
    var setting: js.UndefOr[Setting]
  }

  object DeleteAccountSettingResponse {
    def apply(
        setting: js.UndefOr[Setting] = js.undefined
    ): DeleteAccountSettingResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      setting.foreach(__v => __obj.update("setting", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccountSettingResponse]
    }
  }

  @js.native
  trait DeleteAttributesRequest extends js.Object {
    var attributes: Attributes
    var cluster: js.UndefOr[String]
  }

  object DeleteAttributesRequest {
    def apply(
        attributes: Attributes,
        cluster: js.UndefOr[String] = js.undefined
    ): DeleteAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "attributes" -> attributes.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAttributesRequest]
    }
  }

  @js.native
  trait DeleteAttributesResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
  }

  object DeleteAttributesResponse {
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined
    ): DeleteAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAttributesResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var cluster: String
  }

  object DeleteClusterRequest {
    def apply(
        cluster: String
    ): DeleteClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "cluster" -> cluster.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    def apply(
        cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DeleteServiceRequest extends js.Object {
    var service: String
    var cluster: js.UndefOr[String]
    var force: js.UndefOr[BoxedBoolean]
  }

  object DeleteServiceRequest {
    def apply(
        service: String,
        cluster: js.UndefOr[String] = js.undefined,
        force: js.UndefOr[BoxedBoolean] = js.undefined
    ): DeleteServiceRequest = {
      val __obj = js.Dictionary[js.Any](
        "service" -> service.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      force.foreach(__v => __obj.update("force", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceRequest]
    }
  }

  @js.native
  trait DeleteServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  object DeleteServiceResponse {
    def apply(
        service: js.UndefOr[Service] = js.undefined
    ): DeleteServiceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      service.foreach(__v => __obj.update("service", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceResponse]
    }
  }

  @js.native
  trait DeleteTaskSetRequest extends js.Object {
    var cluster: String
    var service: String
    var taskSet: String
    var force: js.UndefOr[BoxedBoolean]
  }

  object DeleteTaskSetRequest {
    def apply(
        cluster: String,
        service: String,
        taskSet: String,
        force: js.UndefOr[BoxedBoolean] = js.undefined
    ): DeleteTaskSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "cluster" -> cluster.asInstanceOf[js.Any],
        "service" -> service.asInstanceOf[js.Any],
        "taskSet" -> taskSet.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.update("force", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTaskSetRequest]
    }
  }

  @js.native
  trait DeleteTaskSetResponse extends js.Object {
    var taskSet: js.UndefOr[TaskSet]
  }

  object DeleteTaskSetResponse {
    def apply(
        taskSet: js.UndefOr[TaskSet] = js.undefined
    ): DeleteTaskSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      taskSet.foreach(__v => __obj.update("taskSet", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTaskSetResponse]
    }
  }

  /**
    * The details of an Amazon ECS service deployment. This is used only when a service uses the <code>ECS</code> deployment controller type.
    */
  @js.native
  trait Deployment extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var desiredCount: js.UndefOr[Int]
    var id: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var pendingCount: js.UndefOr[Int]
    var platformVersion: js.UndefOr[String]
    var runningCount: js.UndefOr[Int]
    var status: js.UndefOr[String]
    var taskDefinition: js.UndefOr[String]
    var updatedAt: js.UndefOr[Timestamp]
  }

  object Deployment {
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        desiredCount: js.UndefOr[Int] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        pendingCount: js.UndefOr[Int] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        runningCount: js.UndefOr[Int] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        taskDefinition: js.UndefOr[String] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): Deployment = {
      val __obj = js.Dictionary.empty[js.Any]
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      desiredCount.foreach(__v => __obj.update("desiredCount", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.update("networkConfiguration", __v.asInstanceOf[js.Any]))
      pendingCount.foreach(__v => __obj.update("pendingCount", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      runningCount.foreach(__v => __obj.update("runningCount", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      taskDefinition.foreach(__v => __obj.update("taskDefinition", __v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.update("updatedAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  /**
    * Optional deployment parameters that control how many tasks run during a deployment and the ordering of stopping and starting tasks.
    */
  @js.native
  trait DeploymentConfiguration extends js.Object {
    var maximumPercent: js.UndefOr[BoxedInteger]
    var minimumHealthyPercent: js.UndefOr[BoxedInteger]
  }

  object DeploymentConfiguration {
    def apply(
        maximumPercent: js.UndefOr[BoxedInteger] = js.undefined,
        minimumHealthyPercent: js.UndefOr[BoxedInteger] = js.undefined
    ): DeploymentConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      maximumPercent.foreach(__v => __obj.update("maximumPercent", __v.asInstanceOf[js.Any]))
      minimumHealthyPercent.foreach(__v => __obj.update("minimumHealthyPercent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentConfiguration]
    }
  }

  /**
    * The deployment controller to use for the service. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html|Amazon ECS Deployment Types]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  trait DeploymentController extends js.Object {
    var `type`: DeploymentControllerType
  }

  object DeploymentController {
    def apply(
        `type`: DeploymentControllerType
    ): DeploymentController = {
      val __obj = js.Dictionary[js.Any](
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeploymentController]
    }
  }

  object DeploymentControllerTypeEnum {
    val ECS         = "ECS"
    val CODE_DEPLOY = "CODE_DEPLOY"
    val EXTERNAL    = "EXTERNAL"

    val values = IndexedSeq(ECS, CODE_DEPLOY, EXTERNAL)
  }

  @js.native
  trait DeregisterContainerInstanceRequest extends js.Object {
    var containerInstance: String
    var cluster: js.UndefOr[String]
    var force: js.UndefOr[BoxedBoolean]
  }

  object DeregisterContainerInstanceRequest {
    def apply(
        containerInstance: String,
        cluster: js.UndefOr[String] = js.undefined,
        force: js.UndefOr[BoxedBoolean] = js.undefined
    ): DeregisterContainerInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "containerInstance" -> containerInstance.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      force.foreach(__v => __obj.update("force", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterContainerInstanceRequest]
    }
  }

  @js.native
  trait DeregisterContainerInstanceResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  object DeregisterContainerInstanceResponse {
    def apply(
        containerInstance: js.UndefOr[ContainerInstance] = js.undefined
    ): DeregisterContainerInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      containerInstance.foreach(__v => __obj.update("containerInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterContainerInstanceResponse]
    }
  }

  @js.native
  trait DeregisterTaskDefinitionRequest extends js.Object {
    var taskDefinition: String
  }

  object DeregisterTaskDefinitionRequest {
    def apply(
        taskDefinition: String
    ): DeregisterTaskDefinitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterTaskDefinitionRequest]
    }
  }

  @js.native
  trait DeregisterTaskDefinitionResponse extends js.Object {
    var taskDefinition: js.UndefOr[TaskDefinition]
  }

  object DeregisterTaskDefinitionResponse {
    def apply(
        taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
    ): DeregisterTaskDefinitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      taskDefinition.foreach(__v => __obj.update("taskDefinition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTaskDefinitionResponse]
    }
  }

  @js.native
  trait DescribeClustersRequest extends js.Object {
    var clusters: js.UndefOr[StringList]
    var include: js.UndefOr[ClusterFieldList]
  }

  object DescribeClustersRequest {
    def apply(
        clusters: js.UndefOr[StringList] = js.undefined,
        include: js.UndefOr[ClusterFieldList] = js.undefined
    ): DescribeClustersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      clusters.foreach(__v => __obj.update("clusters", __v.asInstanceOf[js.Any]))
      include.foreach(__v => __obj.update("include", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersRequest]
    }
  }

  @js.native
  trait DescribeClustersResponse extends js.Object {
    var clusters: js.UndefOr[Clusters]
    var failures: js.UndefOr[Failures]
  }

  object DescribeClustersResponse {
    def apply(
        clusters: js.UndefOr[Clusters] = js.undefined,
        failures: js.UndefOr[Failures] = js.undefined
    ): DescribeClustersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      clusters.foreach(__v => __obj.update("clusters", __v.asInstanceOf[js.Any]))
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersResponse]
    }
  }

  @js.native
  trait DescribeContainerInstancesRequest extends js.Object {
    var containerInstances: StringList
    var cluster: js.UndefOr[String]
    var include: js.UndefOr[ContainerInstanceFieldList]
  }

  object DescribeContainerInstancesRequest {
    def apply(
        containerInstances: StringList,
        cluster: js.UndefOr[String] = js.undefined,
        include: js.UndefOr[ContainerInstanceFieldList] = js.undefined
    ): DescribeContainerInstancesRequest = {
      val __obj = js.Dictionary[js.Any](
        "containerInstances" -> containerInstances.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      include.foreach(__v => __obj.update("include", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContainerInstancesRequest]
    }
  }

  @js.native
  trait DescribeContainerInstancesResponse extends js.Object {
    var containerInstances: js.UndefOr[ContainerInstances]
    var failures: js.UndefOr[Failures]
  }

  object DescribeContainerInstancesResponse {
    def apply(
        containerInstances: js.UndefOr[ContainerInstances] = js.undefined,
        failures: js.UndefOr[Failures] = js.undefined
    ): DescribeContainerInstancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      containerInstances.foreach(__v => __obj.update("containerInstances", __v.asInstanceOf[js.Any]))
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContainerInstancesResponse]
    }
  }

  @js.native
  trait DescribeServicesRequest extends js.Object {
    var services: StringList
    var cluster: js.UndefOr[String]
    var include: js.UndefOr[ServiceFieldList]
  }

  object DescribeServicesRequest {
    def apply(
        services: StringList,
        cluster: js.UndefOr[String] = js.undefined,
        include: js.UndefOr[ServiceFieldList] = js.undefined
    ): DescribeServicesRequest = {
      val __obj = js.Dictionary[js.Any](
        "services" -> services.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      include.foreach(__v => __obj.update("include", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServicesRequest]
    }
  }

  @js.native
  trait DescribeServicesResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var services: js.UndefOr[Services]
  }

  object DescribeServicesResponse {
    def apply(
        failures: js.UndefOr[Failures] = js.undefined,
        services: js.UndefOr[Services] = js.undefined
    ): DescribeServicesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      services.foreach(__v => __obj.update("services", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServicesResponse]
    }
  }

  @js.native
  trait DescribeTaskDefinitionRequest extends js.Object {
    var taskDefinition: String
    var include: js.UndefOr[TaskDefinitionFieldList]
  }

  object DescribeTaskDefinitionRequest {
    def apply(
        taskDefinition: String,
        include: js.UndefOr[TaskDefinitionFieldList] = js.undefined
    ): DescribeTaskDefinitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any]
      )

      include.foreach(__v => __obj.update("include", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTaskDefinitionRequest]
    }
  }

  @js.native
  trait DescribeTaskDefinitionResponse extends js.Object {
    var tags: js.UndefOr[Tags]
    var taskDefinition: js.UndefOr[TaskDefinition]
  }

  object DescribeTaskDefinitionResponse {
    def apply(
        tags: js.UndefOr[Tags] = js.undefined,
        taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
    ): DescribeTaskDefinitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      taskDefinition.foreach(__v => __obj.update("taskDefinition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTaskDefinitionResponse]
    }
  }

  @js.native
  trait DescribeTaskSetsRequest extends js.Object {
    var cluster: String
    var service: String
    var taskSets: js.UndefOr[StringList]
  }

  object DescribeTaskSetsRequest {
    def apply(
        cluster: String,
        service: String,
        taskSets: js.UndefOr[StringList] = js.undefined
    ): DescribeTaskSetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "cluster" -> cluster.asInstanceOf[js.Any],
        "service" -> service.asInstanceOf[js.Any]
      )

      taskSets.foreach(__v => __obj.update("taskSets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTaskSetsRequest]
    }
  }

  @js.native
  trait DescribeTaskSetsResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var taskSets: js.UndefOr[TaskSets]
  }

  object DescribeTaskSetsResponse {
    def apply(
        failures: js.UndefOr[Failures] = js.undefined,
        taskSets: js.UndefOr[TaskSets] = js.undefined
    ): DescribeTaskSetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      taskSets.foreach(__v => __obj.update("taskSets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTaskSetsResponse]
    }
  }

  @js.native
  trait DescribeTasksRequest extends js.Object {
    var tasks: StringList
    var cluster: js.UndefOr[String]
    var include: js.UndefOr[TaskFieldList]
  }

  object DescribeTasksRequest {
    def apply(
        tasks: StringList,
        cluster: js.UndefOr[String] = js.undefined,
        include: js.UndefOr[TaskFieldList] = js.undefined
    ): DescribeTasksRequest = {
      val __obj = js.Dictionary[js.Any](
        "tasks" -> tasks.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      include.foreach(__v => __obj.update("include", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTasksRequest]
    }
  }

  @js.native
  trait DescribeTasksResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var tasks: js.UndefOr[Tasks]
  }

  object DescribeTasksResponse {
    def apply(
        failures: js.UndefOr[Failures] = js.undefined,
        tasks: js.UndefOr[Tasks] = js.undefined
    ): DescribeTasksResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.update("tasks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTasksResponse]
    }
  }

  object DesiredStatusEnum {
    val RUNNING = "RUNNING"
    val PENDING = "PENDING"
    val STOPPED = "STOPPED"

    val values = IndexedSeq(RUNNING, PENDING, STOPPED)
  }

  /**
    * An object representing a container instance host device.
    */
  @js.native
  trait Device extends js.Object {
    var hostPath: String
    var containerPath: js.UndefOr[String]
    var permissions: js.UndefOr[DeviceCgroupPermissions]
  }

  object Device {
    def apply(
        hostPath: String,
        containerPath: js.UndefOr[String] = js.undefined,
        permissions: js.UndefOr[DeviceCgroupPermissions] = js.undefined
    ): Device = {
      val __obj = js.Dictionary[js.Any](
        "hostPath" -> hostPath.asInstanceOf[js.Any]
      )

      containerPath.foreach(__v => __obj.update("containerPath", __v.asInstanceOf[js.Any]))
      permissions.foreach(__v => __obj.update("permissions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  object DeviceCgroupPermissionEnum {
    val read  = "read"
    val write = "write"
    val mknod = "mknod"

    val values = IndexedSeq(read, write, mknod)
  }

  @js.native
  trait DiscoverPollEndpointRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var containerInstance: js.UndefOr[String]
  }

  object DiscoverPollEndpointRequest {
    def apply(
        cluster: js.UndefOr[String] = js.undefined,
        containerInstance: js.UndefOr[String] = js.undefined
    ): DiscoverPollEndpointRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      containerInstance.foreach(__v => __obj.update("containerInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverPollEndpointRequest]
    }
  }

  @js.native
  trait DiscoverPollEndpointResponse extends js.Object {
    var endpoint: js.UndefOr[String]
    var telemetryEndpoint: js.UndefOr[String]
  }

  object DiscoverPollEndpointResponse {
    def apply(
        endpoint: js.UndefOr[String] = js.undefined,
        telemetryEndpoint: js.UndefOr[String] = js.undefined
    ): DiscoverPollEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      endpoint.foreach(__v => __obj.update("endpoint", __v.asInstanceOf[js.Any]))
      telemetryEndpoint.foreach(__v => __obj.update("telemetryEndpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverPollEndpointResponse]
    }
  }

  /**
    * This parameter is specified when you are using Docker volumes. Docker volumes are only supported when you are using the EC2 launch type. Windows containers only support the use of the <code>local</code> driver. To use bind mounts, specify a <code>host</code> instead.
    */
  @js.native
  trait DockerVolumeConfiguration extends js.Object {
    var autoprovision: js.UndefOr[BoxedBoolean]
    var driver: js.UndefOr[String]
    var driverOpts: js.UndefOr[StringMap]
    var labels: js.UndefOr[StringMap]
    var scope: js.UndefOr[Scope]
  }

  object DockerVolumeConfiguration {
    def apply(
        autoprovision: js.UndefOr[BoxedBoolean] = js.undefined,
        driver: js.UndefOr[String] = js.undefined,
        driverOpts: js.UndefOr[StringMap] = js.undefined,
        labels: js.UndefOr[StringMap] = js.undefined,
        scope: js.UndefOr[Scope] = js.undefined
    ): DockerVolumeConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      autoprovision.foreach(__v => __obj.update("autoprovision", __v.asInstanceOf[js.Any]))
      driver.foreach(__v => __obj.update("driver", __v.asInstanceOf[js.Any]))
      driverOpts.foreach(__v => __obj.update("driverOpts", __v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.update("labels", __v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.update("scope", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DockerVolumeConfiguration]
    }
  }

  /**
    * A failed resource.
    */
  @js.native
  trait Failure extends js.Object {
    var arn: js.UndefOr[String]
    var reason: js.UndefOr[String]
  }

  object Failure {
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        reason: js.UndefOr[String] = js.undefined
    ): Failure = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.update("reason", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Failure]
    }
  }

  /**
    * An object representing a container health check. Health check parameters that are specified in a container definition override any Docker health checks that exist in the container image (such as those specified in a parent image or from the image's Dockerfile).
    *  The following are notes about container health check support:
    * * Container health checks require version 1.17.0 or greater of the Amazon ECS container agent. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html|Updating the Amazon ECS Container Agent]].
    *  * Container health checks are supported for Fargate tasks if you are using platform version 1.1.0 or greater. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html|AWS Fargate Platform Versions]].
    *  * Container health checks are not supported for tasks that are part of a service that is configured to use a Classic Load Balancer.
    */
  @js.native
  trait HealthCheck extends js.Object {
    var command: StringList
    var interval: js.UndefOr[BoxedInteger]
    var retries: js.UndefOr[BoxedInteger]
    var startPeriod: js.UndefOr[BoxedInteger]
    var timeout: js.UndefOr[BoxedInteger]
  }

  object HealthCheck {
    def apply(
        command: StringList,
        interval: js.UndefOr[BoxedInteger] = js.undefined,
        retries: js.UndefOr[BoxedInteger] = js.undefined,
        startPeriod: js.UndefOr[BoxedInteger] = js.undefined,
        timeout: js.UndefOr[BoxedInteger] = js.undefined
    ): HealthCheck = {
      val __obj = js.Dictionary[js.Any](
        "command" -> command.asInstanceOf[js.Any]
      )

      interval.foreach(__v => __obj.update("interval", __v.asInstanceOf[js.Any]))
      retries.foreach(__v => __obj.update("retries", __v.asInstanceOf[js.Any]))
      startPeriod.foreach(__v => __obj.update("startPeriod", __v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.update("timeout", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheck]
    }
  }

  object HealthStatusEnum {
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val UNKNOWN   = "UNKNOWN"

    val values = IndexedSeq(HEALTHY, UNHEALTHY, UNKNOWN)
  }

  /**
    * Hostnames and IP address entries that are added to the <code>/etc/hosts</code> file of a container via the <code>extraHosts</code> parameter of its <a>ContainerDefinition</a>.
    */
  @js.native
  trait HostEntry extends js.Object {
    var hostname: String
    var ipAddress: String
  }

  object HostEntry {
    def apply(
        hostname: String,
        ipAddress: String
    ): HostEntry = {
      val __obj = js.Dictionary[js.Any](
        "hostname"  -> hostname.asInstanceOf[js.Any],
        "ipAddress" -> ipAddress.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HostEntry]
    }
  }

  /**
    * Details on a container instance bind mount host volume.
    */
  @js.native
  trait HostVolumeProperties extends js.Object {
    var sourcePath: js.UndefOr[String]
  }

  object HostVolumeProperties {
    def apply(
        sourcePath: js.UndefOr[String] = js.undefined
    ): HostVolumeProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      sourcePath.foreach(__v => __obj.update("sourcePath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostVolumeProperties]
    }
  }

  object IpcModeEnum {
    val host = "host"
    val task = "task"
    val none = "none"

    val values = IndexedSeq(host, task, none)
  }

  /**
    * The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker. For more information on the default capabilities and the non-default available capabilities, see [[https://docs.docker.com/engine/reference/run/#runtime-privilege-and-linux-capabilities|Runtime privilege and Linux capabilities]] in the <i>Docker run reference</i>. For more detailed information on these Linux capabilities, see the [[http://man7.org/linux/man-pages/man7/capabilities.7.html|capabilities(7)]] Linux manual page.
    */
  @js.native
  trait KernelCapabilities extends js.Object {
    var add: js.UndefOr[StringList]
    var drop: js.UndefOr[StringList]
  }

  object KernelCapabilities {
    def apply(
        add: js.UndefOr[StringList] = js.undefined,
        drop: js.UndefOr[StringList] = js.undefined
    ): KernelCapabilities = {
      val __obj = js.Dictionary.empty[js.Any]
      add.foreach(__v => __obj.update("add", __v.asInstanceOf[js.Any]))
      drop.foreach(__v => __obj.update("drop", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KernelCapabilities]
    }
  }

  /**
    * A key-value pair object.
    */
  @js.native
  trait KeyValuePair extends js.Object {
    var name: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object KeyValuePair {
    def apply(
        name: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): KeyValuePair = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyValuePair]
    }
  }

  object LaunchTypeEnum {
    val EC2     = "EC2"
    val FARGATE = "FARGATE"

    val values = IndexedSeq(EC2, FARGATE)
  }

  /**
    * Linux-specific options that are applied to the container, such as Linux <a>KernelCapabilities</a>.
    */
  @js.native
  trait LinuxParameters extends js.Object {
    var capabilities: js.UndefOr[KernelCapabilities]
    var devices: js.UndefOr[DevicesList]
    var initProcessEnabled: js.UndefOr[BoxedBoolean]
    var maxSwap: js.UndefOr[BoxedInteger]
    var sharedMemorySize: js.UndefOr[BoxedInteger]
    var swappiness: js.UndefOr[BoxedInteger]
    var tmpfs: js.UndefOr[TmpfsList]
  }

  object LinuxParameters {
    def apply(
        capabilities: js.UndefOr[KernelCapabilities] = js.undefined,
        devices: js.UndefOr[DevicesList] = js.undefined,
        initProcessEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        maxSwap: js.UndefOr[BoxedInteger] = js.undefined,
        sharedMemorySize: js.UndefOr[BoxedInteger] = js.undefined,
        swappiness: js.UndefOr[BoxedInteger] = js.undefined,
        tmpfs: js.UndefOr[TmpfsList] = js.undefined
    ): LinuxParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      capabilities.foreach(__v => __obj.update("capabilities", __v.asInstanceOf[js.Any]))
      devices.foreach(__v => __obj.update("devices", __v.asInstanceOf[js.Any]))
      initProcessEnabled.foreach(__v => __obj.update("initProcessEnabled", __v.asInstanceOf[js.Any]))
      maxSwap.foreach(__v => __obj.update("maxSwap", __v.asInstanceOf[js.Any]))
      sharedMemorySize.foreach(__v => __obj.update("sharedMemorySize", __v.asInstanceOf[js.Any]))
      swappiness.foreach(__v => __obj.update("swappiness", __v.asInstanceOf[js.Any]))
      tmpfs.foreach(__v => __obj.update("tmpfs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LinuxParameters]
    }
  }

  @js.native
  trait ListAccountSettingsRequest extends js.Object {
    var effectiveSettings: js.UndefOr[Boolean]
    var maxResults: js.UndefOr[Int]
    var name: js.UndefOr[SettingName]
    var nextToken: js.UndefOr[String]
    var principalArn: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object ListAccountSettingsRequest {
    def apply(
        effectiveSettings: js.UndefOr[Boolean] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        name: js.UndefOr[SettingName] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principalArn: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): ListAccountSettingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      effectiveSettings.foreach(__v => __obj.update("effectiveSettings", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      principalArn.foreach(__v => __obj.update("principalArn", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountSettingsRequest]
    }
  }

  @js.native
  trait ListAccountSettingsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var settings: js.UndefOr[Settings]
  }

  object ListAccountSettingsResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        settings: js.UndefOr[Settings] = js.undefined
    ): ListAccountSettingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      settings.foreach(__v => __obj.update("settings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountSettingsResponse]
    }
  }

  @js.native
  trait ListAttributesRequest extends js.Object {
    var targetType: TargetType
    var attributeName: js.UndefOr[String]
    var attributeValue: js.UndefOr[String]
    var cluster: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
  }

  object ListAttributesRequest {
    def apply(
        targetType: TargetType,
        attributeName: js.UndefOr[String] = js.undefined,
        attributeValue: js.UndefOr[String] = js.undefined,
        cluster: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[BoxedInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "targetType" -> targetType.asInstanceOf[js.Any]
      )

      attributeName.foreach(__v => __obj.update("attributeName", __v.asInstanceOf[js.Any]))
      attributeValue.foreach(__v => __obj.update("attributeValue", __v.asInstanceOf[js.Any]))
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttributesRequest]
    }
  }

  @js.native
  trait ListAttributesResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var nextToken: js.UndefOr[String]
  }

  object ListAttributesResponse {
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttributesResponse]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
  }

  object ListClustersRequest {
    def apply(
        maxResults: js.UndefOr[BoxedInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListClustersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var clusterArns: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListClustersResponse {
    def apply(
        clusterArns: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListClustersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      clusterArns.foreach(__v => __obj.update("clusterArns", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListContainerInstancesRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var filter: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[ContainerInstanceStatus]
  }

  object ListContainerInstancesRequest {
    def apply(
        cluster: js.UndefOr[String] = js.undefined,
        filter: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[BoxedInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ContainerInstanceStatus] = js.undefined
    ): ListContainerInstancesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      filter.foreach(__v => __obj.update("filter", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContainerInstancesRequest]
    }
  }

  @js.native
  trait ListContainerInstancesResponse extends js.Object {
    var containerInstanceArns: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListContainerInstancesResponse {
    def apply(
        containerInstanceArns: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListContainerInstancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      containerInstanceArns.foreach(__v => __obj.update("containerInstanceArns", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContainerInstancesResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var schedulingStrategy: js.UndefOr[SchedulingStrategy]
  }

  object ListServicesRequest {
    def apply(
        cluster: js.UndefOr[String] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        maxResults: js.UndefOr[BoxedInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined
    ): ListServicesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      schedulingStrategy.foreach(__v => __obj.update("schedulingStrategy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var serviceArns: js.UndefOr[StringList]
  }

  object ListServicesResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        serviceArns: js.UndefOr[StringList] = js.undefined
    ): ListServicesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      serviceArns.foreach(__v => __obj.update("serviceArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTaskDefinitionFamiliesRequest extends js.Object {
    var familyPrefix: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[TaskDefinitionFamilyStatus]
  }

  object ListTaskDefinitionFamiliesRequest {
    def apply(
        familyPrefix: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[BoxedInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[TaskDefinitionFamilyStatus] = js.undefined
    ): ListTaskDefinitionFamiliesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      familyPrefix.foreach(__v => __obj.update("familyPrefix", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTaskDefinitionFamiliesRequest]
    }
  }

  @js.native
  trait ListTaskDefinitionFamiliesResponse extends js.Object {
    var families: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListTaskDefinitionFamiliesResponse {
    def apply(
        families: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListTaskDefinitionFamiliesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      families.foreach(__v => __obj.update("families", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTaskDefinitionFamiliesResponse]
    }
  }

  @js.native
  trait ListTaskDefinitionsRequest extends js.Object {
    var familyPrefix: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var sort: js.UndefOr[SortOrder]
    var status: js.UndefOr[TaskDefinitionStatus]
  }

  object ListTaskDefinitionsRequest {
    def apply(
        familyPrefix: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[BoxedInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        sort: js.UndefOr[SortOrder] = js.undefined,
        status: js.UndefOr[TaskDefinitionStatus] = js.undefined
    ): ListTaskDefinitionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      familyPrefix.foreach(__v => __obj.update("familyPrefix", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      sort.foreach(__v => __obj.update("sort", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTaskDefinitionsRequest]
    }
  }

  @js.native
  trait ListTaskDefinitionsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var taskDefinitionArns: js.UndefOr[StringList]
  }

  object ListTaskDefinitionsResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        taskDefinitionArns: js.UndefOr[StringList] = js.undefined
    ): ListTaskDefinitionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      taskDefinitionArns.foreach(__v => __obj.update("taskDefinitionArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTaskDefinitionsResponse]
    }
  }

  @js.native
  trait ListTasksRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var containerInstance: js.UndefOr[String]
    var desiredStatus: js.UndefOr[DesiredStatus]
    var family: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var serviceName: js.UndefOr[String]
    var startedBy: js.UndefOr[String]
  }

  object ListTasksRequest {
    def apply(
        cluster: js.UndefOr[String] = js.undefined,
        containerInstance: js.UndefOr[String] = js.undefined,
        desiredStatus: js.UndefOr[DesiredStatus] = js.undefined,
        family: js.UndefOr[String] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        maxResults: js.UndefOr[BoxedInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        serviceName: js.UndefOr[String] = js.undefined,
        startedBy: js.UndefOr[String] = js.undefined
    ): ListTasksRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      containerInstance.foreach(__v => __obj.update("containerInstance", __v.asInstanceOf[js.Any]))
      desiredStatus.foreach(__v => __obj.update("desiredStatus", __v.asInstanceOf[js.Any]))
      family.foreach(__v => __obj.update("family", __v.asInstanceOf[js.Any]))
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      serviceName.foreach(__v => __obj.update("serviceName", __v.asInstanceOf[js.Any]))
      startedBy.foreach(__v => __obj.update("startedBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTasksRequest]
    }
  }

  @js.native
  trait ListTasksResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var taskArns: js.UndefOr[StringList]
  }

  object ListTasksResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        taskArns: js.UndefOr[StringList] = js.undefined
    ): ListTasksResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      taskArns.foreach(__v => __obj.update("taskArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTasksResponse]
    }
  }

  /**
    * Details on a load balancer to be used with a service or task set.
    *  If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer or target group.
    *  If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use either an Application Load Balancer or Network Load Balancer. When you are creating an AWS CodeDeploy deployment group, you specify two target groups (referred to as a <code>targetGroupPair</code>). Each target group binds to a separate task set in the deployment. The load balancer can also have up to two listeners, a required listener for production traffic and an optional listener that allows you to test new revisions of the service before routing production traffic to it.
    *  Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate launch type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not supported. Also, when you create any target groups for these services, you must choose <code>ip</code> as the target type, not <code>instance</code>. Tasks that use the <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2 instance.
    */
  @js.native
  trait LoadBalancer extends js.Object {
    var containerName: js.UndefOr[String]
    var containerPort: js.UndefOr[BoxedInteger]
    var loadBalancerName: js.UndefOr[String]
    var targetGroupArn: js.UndefOr[String]
  }

  object LoadBalancer {
    def apply(
        containerName: js.UndefOr[String] = js.undefined,
        containerPort: js.UndefOr[BoxedInteger] = js.undefined,
        loadBalancerName: js.UndefOr[String] = js.undefined,
        targetGroupArn: js.UndefOr[String] = js.undefined
    ): LoadBalancer = {
      val __obj = js.Dictionary.empty[js.Any]
      containerName.foreach(__v => __obj.update("containerName", __v.asInstanceOf[js.Any]))
      containerPort.foreach(__v => __obj.update("containerPort", __v.asInstanceOf[js.Any]))
      loadBalancerName.foreach(__v => __obj.update("loadBalancerName", __v.asInstanceOf[js.Any]))
      targetGroupArn.foreach(__v => __obj.update("targetGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancer]
    }
  }

  /**
    * Log configuration options to send to a custom log driver for the container.
    */
  @js.native
  trait LogConfiguration extends js.Object {
    var logDriver: LogDriver
    var options: js.UndefOr[LogConfigurationOptionsMap]
    var secretOptions: js.UndefOr[SecretList]
  }

  object LogConfiguration {
    def apply(
        logDriver: LogDriver,
        options: js.UndefOr[LogConfigurationOptionsMap] = js.undefined,
        secretOptions: js.UndefOr[SecretList] = js.undefined
    ): LogConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "logDriver" -> logDriver.asInstanceOf[js.Any]
      )

      options.foreach(__v => __obj.update("options", __v.asInstanceOf[js.Any]))
      secretOptions.foreach(__v => __obj.update("secretOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogConfiguration]
    }
  }

  object LogDriverEnum {
    val `json-file` = "json-file"
    val syslog      = "syslog"
    val journald    = "journald"
    val gelf        = "gelf"
    val fluentd     = "fluentd"
    val awslogs     = "awslogs"
    val splunk      = "splunk"

    val values = IndexedSeq(`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk)
  }

  /**
    * Details on a volume mount point that is used in a container definition.
    */
  @js.native
  trait MountPoint extends js.Object {
    var containerPath: js.UndefOr[String]
    var readOnly: js.UndefOr[BoxedBoolean]
    var sourceVolume: js.UndefOr[String]
  }

  object MountPoint {
    def apply(
        containerPath: js.UndefOr[String] = js.undefined,
        readOnly: js.UndefOr[BoxedBoolean] = js.undefined,
        sourceVolume: js.UndefOr[String] = js.undefined
    ): MountPoint = {
      val __obj = js.Dictionary.empty[js.Any]
      containerPath.foreach(__v => __obj.update("containerPath", __v.asInstanceOf[js.Any]))
      readOnly.foreach(__v => __obj.update("readOnly", __v.asInstanceOf[js.Any]))
      sourceVolume.foreach(__v => __obj.update("sourceVolume", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MountPoint]
    }
  }

  /**
    * Details on the network bindings between a container and its host container instance. After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
    */
  @js.native
  trait NetworkBinding extends js.Object {
    var bindIP: js.UndefOr[String]
    var containerPort: js.UndefOr[BoxedInteger]
    var hostPort: js.UndefOr[BoxedInteger]
    var protocol: js.UndefOr[TransportProtocol]
  }

  object NetworkBinding {
    def apply(
        bindIP: js.UndefOr[String] = js.undefined,
        containerPort: js.UndefOr[BoxedInteger] = js.undefined,
        hostPort: js.UndefOr[BoxedInteger] = js.undefined,
        protocol: js.UndefOr[TransportProtocol] = js.undefined
    ): NetworkBinding = {
      val __obj = js.Dictionary.empty[js.Any]
      bindIP.foreach(__v => __obj.update("bindIP", __v.asInstanceOf[js.Any]))
      containerPort.foreach(__v => __obj.update("containerPort", __v.asInstanceOf[js.Any]))
      hostPort.foreach(__v => __obj.update("hostPort", __v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.update("protocol", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkBinding]
    }
  }

  /**
    * An object representing the network configuration for a task or service.
    */
  @js.native
  trait NetworkConfiguration extends js.Object {
    var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration]
  }

  object NetworkConfiguration {
    def apply(
        awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined
    ): NetworkConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      awsvpcConfiguration.foreach(__v => __obj.update("awsvpcConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfiguration]
    }
  }

  /**
    * An object representing the elastic network interface for tasks that use the <code>awsvpc</code> network mode.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var attachmentId: js.UndefOr[String]
    var ipv6Address: js.UndefOr[String]
    var privateIpv4Address: js.UndefOr[String]
  }

  object NetworkInterface {
    def apply(
        attachmentId: js.UndefOr[String] = js.undefined,
        ipv6Address: js.UndefOr[String] = js.undefined,
        privateIpv4Address: js.UndefOr[String] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dictionary.empty[js.Any]
      attachmentId.foreach(__v => __obj.update("attachmentId", __v.asInstanceOf[js.Any]))
      ipv6Address.foreach(__v => __obj.update("ipv6Address", __v.asInstanceOf[js.Any]))
      privateIpv4Address.foreach(__v => __obj.update("privateIpv4Address", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  object NetworkModeEnum {
    val bridge = "bridge"
    val host   = "host"
    val awsvpc = "awsvpc"
    val none   = "none"

    val values = IndexedSeq(bridge, host, awsvpc, none)
  }

  object PidModeEnum {
    val host = "host"
    val task = "task"

    val values = IndexedSeq(host, task)
  }

  /**
    * An object representing a constraint on task placement. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html|Task Placement Constraints]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  trait PlacementConstraint extends js.Object {
    var expression: js.UndefOr[String]
    var `type`: js.UndefOr[PlacementConstraintType]
  }

  object PlacementConstraint {
    def apply(
        expression: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[PlacementConstraintType] = js.undefined
    ): PlacementConstraint = {
      val __obj = js.Dictionary.empty[js.Any]
      expression.foreach(__v => __obj.update("expression", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacementConstraint]
    }
  }

  object PlacementConstraintTypeEnum {
    val distinctInstance = "distinctInstance"
    val memberOf         = "memberOf"

    val values = IndexedSeq(distinctInstance, memberOf)
  }

  /**
    * The task placement strategy for a task or service. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html|Task Placement Strategies]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  trait PlacementStrategy extends js.Object {
    var field: js.UndefOr[String]
    var `type`: js.UndefOr[PlacementStrategyType]
  }

  object PlacementStrategy {
    def apply(
        field: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[PlacementStrategyType] = js.undefined
    ): PlacementStrategy = {
      val __obj = js.Dictionary.empty[js.Any]
      field.foreach(__v => __obj.update("field", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacementStrategy]
    }
  }

  object PlacementStrategyTypeEnum {
    val random  = "random"
    val spread  = "spread"
    val binpack = "binpack"

    val values = IndexedSeq(random, spread, binpack)
  }

  /**
    * The devices that are available on the container instance. The only supported device type is a GPU.
    */
  @js.native
  trait PlatformDevice extends js.Object {
    var id: String
    var `type`: PlatformDeviceType
  }

  object PlatformDevice {
    def apply(
        id: String,
        `type`: PlatformDeviceType
    ): PlatformDevice = {
      val __obj = js.Dictionary[js.Any](
        "id"   -> id.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PlatformDevice]
    }
  }

  object PlatformDeviceTypeEnum {
    val GPU = "GPU"

    val values = IndexedSeq(GPU)
  }

  /**
    * Port mappings allow containers to access ports on the host container instance to send or receive traffic. Port mappings are specified as part of the container definition.
    *  If you are using containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, exposed ports should be specified using <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as the <code>containerPort</code>.
    *  After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
    */
  @js.native
  trait PortMapping extends js.Object {
    var containerPort: js.UndefOr[BoxedInteger]
    var hostPort: js.UndefOr[BoxedInteger]
    var protocol: js.UndefOr[TransportProtocol]
  }

  object PortMapping {
    def apply(
        containerPort: js.UndefOr[BoxedInteger] = js.undefined,
        hostPort: js.UndefOr[BoxedInteger] = js.undefined,
        protocol: js.UndefOr[TransportProtocol] = js.undefined
    ): PortMapping = {
      val __obj = js.Dictionary.empty[js.Any]
      containerPort.foreach(__v => __obj.update("containerPort", __v.asInstanceOf[js.Any]))
      hostPort.foreach(__v => __obj.update("hostPort", __v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.update("protocol", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortMapping]
    }
  }

  object PropagateTagsEnum {
    val TASK_DEFINITION = "TASK_DEFINITION"
    val SERVICE         = "SERVICE"

    val values = IndexedSeq(TASK_DEFINITION, SERVICE)
  }

  /**
    * The configuration details for the App Mesh proxy.
    *  For tasks using the EC2 launch type, the container instances require at least version 1.26.0 of the container agent and at least version 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container instances are launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html|Amazon ECS-optimized Linux AMI]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    *  For tasks using the Fargate launch type, the task or service requires platform version 1.3.0 or later.
    */
  @js.native
  trait ProxyConfiguration extends js.Object {
    var containerName: String
    var properties: js.UndefOr[ProxyConfigurationProperties]
    var `type`: js.UndefOr[ProxyConfigurationType]
  }

  object ProxyConfiguration {
    def apply(
        containerName: String,
        properties: js.UndefOr[ProxyConfigurationProperties] = js.undefined,
        `type`: js.UndefOr[ProxyConfigurationType] = js.undefined
    ): ProxyConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "containerName" -> containerName.asInstanceOf[js.Any]
      )

      properties.foreach(__v => __obj.update("properties", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProxyConfiguration]
    }
  }

  object ProxyConfigurationTypeEnum {
    val APPMESH = "APPMESH"

    val values = IndexedSeq(APPMESH)
  }

  @js.native
  trait PutAccountSettingDefaultRequest extends js.Object {
    var name: SettingName
    var value: String
  }

  object PutAccountSettingDefaultRequest {
    def apply(
        name: SettingName,
        value: String
    ): PutAccountSettingDefaultRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"  -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutAccountSettingDefaultRequest]
    }
  }

  @js.native
  trait PutAccountSettingDefaultResponse extends js.Object {
    var setting: js.UndefOr[Setting]
  }

  object PutAccountSettingDefaultResponse {
    def apply(
        setting: js.UndefOr[Setting] = js.undefined
    ): PutAccountSettingDefaultResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      setting.foreach(__v => __obj.update("setting", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountSettingDefaultResponse]
    }
  }

  @js.native
  trait PutAccountSettingRequest extends js.Object {
    var name: SettingName
    var value: String
    var principalArn: js.UndefOr[String]
  }

  object PutAccountSettingRequest {
    def apply(
        name: SettingName,
        value: String,
        principalArn: js.UndefOr[String] = js.undefined
    ): PutAccountSettingRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"  -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      principalArn.foreach(__v => __obj.update("principalArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountSettingRequest]
    }
  }

  @js.native
  trait PutAccountSettingResponse extends js.Object {
    var setting: js.UndefOr[Setting]
  }

  object PutAccountSettingResponse {
    def apply(
        setting: js.UndefOr[Setting] = js.undefined
    ): PutAccountSettingResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      setting.foreach(__v => __obj.update("setting", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountSettingResponse]
    }
  }

  @js.native
  trait PutAttributesRequest extends js.Object {
    var attributes: Attributes
    var cluster: js.UndefOr[String]
  }

  object PutAttributesRequest {
    def apply(
        attributes: Attributes,
        cluster: js.UndefOr[String] = js.undefined
    ): PutAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "attributes" -> attributes.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAttributesRequest]
    }
  }

  @js.native
  trait PutAttributesResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
  }

  object PutAttributesResponse {
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined
    ): PutAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAttributesResponse]
    }
  }

  @js.native
  trait RegisterContainerInstanceRequest extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var cluster: js.UndefOr[String]
    var containerInstanceArn: js.UndefOr[String]
    var instanceIdentityDocument: js.UndefOr[String]
    var instanceIdentityDocumentSignature: js.UndefOr[String]
    var platformDevices: js.UndefOr[PlatformDevices]
    var tags: js.UndefOr[Tags]
    var totalResources: js.UndefOr[Resources]
    var versionInfo: js.UndefOr[VersionInfo]
  }

  object RegisterContainerInstanceRequest {
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        cluster: js.UndefOr[String] = js.undefined,
        containerInstanceArn: js.UndefOr[String] = js.undefined,
        instanceIdentityDocument: js.UndefOr[String] = js.undefined,
        instanceIdentityDocumentSignature: js.UndefOr[String] = js.undefined,
        platformDevices: js.UndefOr[PlatformDevices] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        totalResources: js.UndefOr[Resources] = js.undefined,
        versionInfo: js.UndefOr[VersionInfo] = js.undefined
    ): RegisterContainerInstanceRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      containerInstanceArn.foreach(__v => __obj.update("containerInstanceArn", __v.asInstanceOf[js.Any]))
      instanceIdentityDocument.foreach(__v => __obj.update("instanceIdentityDocument", __v.asInstanceOf[js.Any]))
      instanceIdentityDocumentSignature.foreach(
        __v => __obj.update("instanceIdentityDocumentSignature", __v.asInstanceOf[js.Any])
      )
      platformDevices.foreach(__v => __obj.update("platformDevices", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      totalResources.foreach(__v => __obj.update("totalResources", __v.asInstanceOf[js.Any]))
      versionInfo.foreach(__v => __obj.update("versionInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterContainerInstanceRequest]
    }
  }

  @js.native
  trait RegisterContainerInstanceResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  object RegisterContainerInstanceResponse {
    def apply(
        containerInstance: js.UndefOr[ContainerInstance] = js.undefined
    ): RegisterContainerInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      containerInstance.foreach(__v => __obj.update("containerInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterContainerInstanceResponse]
    }
  }

  @js.native
  trait RegisterTaskDefinitionRequest extends js.Object {
    var containerDefinitions: ContainerDefinitions
    var family: String
    var cpu: js.UndefOr[String]
    var executionRoleArn: js.UndefOr[String]
    var ipcMode: js.UndefOr[IpcMode]
    var memory: js.UndefOr[String]
    var networkMode: js.UndefOr[NetworkMode]
    var pidMode: js.UndefOr[PidMode]
    var placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints]
    var proxyConfiguration: js.UndefOr[ProxyConfiguration]
    var requiresCompatibilities: js.UndefOr[CompatibilityList]
    var tags: js.UndefOr[Tags]
    var taskRoleArn: js.UndefOr[String]
    var volumes: js.UndefOr[VolumeList]
  }

  object RegisterTaskDefinitionRequest {
    def apply(
        containerDefinitions: ContainerDefinitions,
        family: String,
        cpu: js.UndefOr[String] = js.undefined,
        executionRoleArn: js.UndefOr[String] = js.undefined,
        ipcMode: js.UndefOr[IpcMode] = js.undefined,
        memory: js.UndefOr[String] = js.undefined,
        networkMode: js.UndefOr[NetworkMode] = js.undefined,
        pidMode: js.UndefOr[PidMode] = js.undefined,
        placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.undefined,
        proxyConfiguration: js.UndefOr[ProxyConfiguration] = js.undefined,
        requiresCompatibilities: js.UndefOr[CompatibilityList] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        taskRoleArn: js.UndefOr[String] = js.undefined,
        volumes: js.UndefOr[VolumeList] = js.undefined
    ): RegisterTaskDefinitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "containerDefinitions" -> containerDefinitions.asInstanceOf[js.Any],
        "family"               -> family.asInstanceOf[js.Any]
      )

      cpu.foreach(__v => __obj.update("cpu", __v.asInstanceOf[js.Any]))
      executionRoleArn.foreach(__v => __obj.update("executionRoleArn", __v.asInstanceOf[js.Any]))
      ipcMode.foreach(__v => __obj.update("ipcMode", __v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.update("memory", __v.asInstanceOf[js.Any]))
      networkMode.foreach(__v => __obj.update("networkMode", __v.asInstanceOf[js.Any]))
      pidMode.foreach(__v => __obj.update("pidMode", __v.asInstanceOf[js.Any]))
      placementConstraints.foreach(__v => __obj.update("placementConstraints", __v.asInstanceOf[js.Any]))
      proxyConfiguration.foreach(__v => __obj.update("proxyConfiguration", __v.asInstanceOf[js.Any]))
      requiresCompatibilities.foreach(__v => __obj.update("requiresCompatibilities", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      taskRoleArn.foreach(__v => __obj.update("taskRoleArn", __v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.update("volumes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTaskDefinitionRequest]
    }
  }

  @js.native
  trait RegisterTaskDefinitionResponse extends js.Object {
    var tags: js.UndefOr[Tags]
    var taskDefinition: js.UndefOr[TaskDefinition]
  }

  object RegisterTaskDefinitionResponse {
    def apply(
        tags: js.UndefOr[Tags] = js.undefined,
        taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
    ): RegisterTaskDefinitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      taskDefinition.foreach(__v => __obj.update("taskDefinition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTaskDefinitionResponse]
    }
  }

  /**
    * The repository credentials for private registry authentication.
    */
  @js.native
  trait RepositoryCredentials extends js.Object {
    var credentialsParameter: String
  }

  object RepositoryCredentials {
    def apply(
        credentialsParameter: String
    ): RepositoryCredentials = {
      val __obj = js.Dictionary[js.Any](
        "credentialsParameter" -> credentialsParameter.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RepositoryCredentials]
    }
  }

  /**
    * Describes the resources available for a container instance.
    */
  @js.native
  trait Resource extends js.Object {
    var doubleValue: js.UndefOr[Double]
    var integerValue: js.UndefOr[Int]
    var longValue: js.UndefOr[Double]
    var name: js.UndefOr[String]
    var stringSetValue: js.UndefOr[StringList]
    var `type`: js.UndefOr[String]
  }

  object Resource {
    def apply(
        doubleValue: js.UndefOr[Double] = js.undefined,
        integerValue: js.UndefOr[Int] = js.undefined,
        longValue: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        stringSetValue: js.UndefOr[StringList] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): Resource = {
      val __obj = js.Dictionary.empty[js.Any]
      doubleValue.foreach(__v => __obj.update("doubleValue", __v.asInstanceOf[js.Any]))
      integerValue.foreach(__v => __obj.update("integerValue", __v.asInstanceOf[js.Any]))
      longValue.foreach(__v => __obj.update("longValue", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      stringSetValue.foreach(__v => __obj.update("stringSetValue", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /**
    * The type and amount of a resource to assign to a container. The only supported resource is a GPU. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html|Working with GPUs on Amazon ECS]] in the <i>Amazon Elastic Container Service Developer Guide</i>
    */
  @js.native
  trait ResourceRequirement extends js.Object {
    var `type`: ResourceType
    var value: String
  }

  object ResourceRequirement {
    def apply(
        `type`: ResourceType,
        value: String
    ): ResourceRequirement = {
      val __obj = js.Dictionary[js.Any](
        "type"  -> `type`.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceRequirement]
    }
  }

  object ResourceTypeEnum {
    val GPU = "GPU"

    val values = IndexedSeq(GPU)
  }

  @js.native
  trait RunTaskRequest extends js.Object {
    var taskDefinition: String
    var cluster: js.UndefOr[String]
    var count: js.UndefOr[BoxedInteger]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var group: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var overrides: js.UndefOr[TaskOverride]
    var placementConstraints: js.UndefOr[PlacementConstraints]
    var placementStrategy: js.UndefOr[PlacementStrategies]
    var platformVersion: js.UndefOr[String]
    var propagateTags: js.UndefOr[PropagateTags]
    var startedBy: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  object RunTaskRequest {
    def apply(
        taskDefinition: String,
        cluster: js.UndefOr[String] = js.undefined,
        count: js.UndefOr[BoxedInteger] = js.undefined,
        enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
        group: js.UndefOr[String] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        overrides: js.UndefOr[TaskOverride] = js.undefined,
        placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
        placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        propagateTags: js.UndefOr[PropagateTags] = js.undefined,
        startedBy: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): RunTaskRequest = {
      val __obj = js.Dictionary[js.Any](
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.update("count", __v.asInstanceOf[js.Any]))
      enableECSManagedTags.foreach(__v => __obj.update("enableECSManagedTags", __v.asInstanceOf[js.Any]))
      group.foreach(__v => __obj.update("group", __v.asInstanceOf[js.Any]))
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.update("networkConfiguration", __v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.update("overrides", __v.asInstanceOf[js.Any]))
      placementConstraints.foreach(__v => __obj.update("placementConstraints", __v.asInstanceOf[js.Any]))
      placementStrategy.foreach(__v => __obj.update("placementStrategy", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      propagateTags.foreach(__v => __obj.update("propagateTags", __v.asInstanceOf[js.Any]))
      startedBy.foreach(__v => __obj.update("startedBy", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunTaskRequest]
    }
  }

  @js.native
  trait RunTaskResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var tasks: js.UndefOr[Tasks]
  }

  object RunTaskResponse {
    def apply(
        failures: js.UndefOr[Failures] = js.undefined,
        tasks: js.UndefOr[Tasks] = js.undefined
    ): RunTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.update("tasks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunTaskResponse]
    }
  }

  /**
    * A floating-point percentage of the desired number of tasks to place and keep running in the task set.
    */
  @js.native
  trait Scale extends js.Object {
    var unit: js.UndefOr[ScaleUnit]
    var value: js.UndefOr[Double]
  }

  object Scale {
    def apply(
        unit: js.UndefOr[ScaleUnit] = js.undefined,
        value: js.UndefOr[Double] = js.undefined
    ): Scale = {
      val __obj = js.Dictionary.empty[js.Any]
      unit.foreach(__v => __obj.update("unit", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scale]
    }
  }

  object ScaleUnitEnum {
    val PERCENT = "PERCENT"

    val values = IndexedSeq(PERCENT)
  }

  object SchedulingStrategyEnum {
    val REPLICA = "REPLICA"
    val DAEMON  = "DAEMON"

    val values = IndexedSeq(REPLICA, DAEMON)
  }

  object ScopeEnum {
    val task   = "task"
    val shared = "shared"

    val values = IndexedSeq(task, shared)
  }

  /**
    * An object representing the secret to expose to your container. Secrets can be exposed to a container in the following ways:
    * * To inject sensitive data into your containers as environment variables, use the <code>secrets</code> container definition parameter.
    *  * To reference sensitive information in the log configuration of a container, use the <code>secretOptions</code> container definition parameter.
    * For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html|Specifying Sensitive Data]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  trait Secret extends js.Object {
    var name: String
    var valueFrom: String
  }

  object Secret {
    def apply(
        name: String,
        valueFrom: String
    ): Secret = {
      val __obj = js.Dictionary[js.Any](
        "name"      -> name.asInstanceOf[js.Any],
        "valueFrom" -> valueFrom.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Secret]
    }
  }

  /**
    * Details on a service within a cluster
    */
  @js.native
  trait Service extends js.Object {
    var clusterArn: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[String]
    var deploymentConfiguration: js.UndefOr[DeploymentConfiguration]
    var deploymentController: js.UndefOr[DeploymentController]
    var deployments: js.UndefOr[Deployments]
    var desiredCount: js.UndefOr[Int]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var events: js.UndefOr[ServiceEvents]
    var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger]
    var launchType: js.UndefOr[LaunchType]
    var loadBalancers: js.UndefOr[LoadBalancers]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var pendingCount: js.UndefOr[Int]
    var placementConstraints: js.UndefOr[PlacementConstraints]
    var placementStrategy: js.UndefOr[PlacementStrategies]
    var platformVersion: js.UndefOr[String]
    var propagateTags: js.UndefOr[PropagateTags]
    var roleArn: js.UndefOr[String]
    var runningCount: js.UndefOr[Int]
    var schedulingStrategy: js.UndefOr[SchedulingStrategy]
    var serviceArn: js.UndefOr[String]
    var serviceName: js.UndefOr[String]
    var serviceRegistries: js.UndefOr[ServiceRegistries]
    var status: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
    var taskDefinition: js.UndefOr[String]
    var taskSets: js.UndefOr[TaskSets]
  }

  object Service {
    def apply(
        clusterArn: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[String] = js.undefined,
        deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
        deploymentController: js.UndefOr[DeploymentController] = js.undefined,
        deployments: js.UndefOr[Deployments] = js.undefined,
        desiredCount: js.UndefOr[Int] = js.undefined,
        enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
        events: js.UndefOr[ServiceEvents] = js.undefined,
        healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        pendingCount: js.UndefOr[Int] = js.undefined,
        placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
        placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        propagateTags: js.UndefOr[PropagateTags] = js.undefined,
        roleArn: js.UndefOr[String] = js.undefined,
        runningCount: js.UndefOr[Int] = js.undefined,
        schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined,
        serviceArn: js.UndefOr[String] = js.undefined,
        serviceName: js.UndefOr[String] = js.undefined,
        serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        taskDefinition: js.UndefOr[String] = js.undefined,
        taskSets: js.UndefOr[TaskSets] = js.undefined
    ): Service = {
      val __obj = js.Dictionary.empty[js.Any]
      clusterArn.foreach(__v => __obj.update("clusterArn", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.update("createdBy", __v.asInstanceOf[js.Any]))
      deploymentConfiguration.foreach(__v => __obj.update("deploymentConfiguration", __v.asInstanceOf[js.Any]))
      deploymentController.foreach(__v => __obj.update("deploymentController", __v.asInstanceOf[js.Any]))
      deployments.foreach(__v => __obj.update("deployments", __v.asInstanceOf[js.Any]))
      desiredCount.foreach(__v => __obj.update("desiredCount", __v.asInstanceOf[js.Any]))
      enableECSManagedTags.foreach(__v => __obj.update("enableECSManagedTags", __v.asInstanceOf[js.Any]))
      events.foreach(__v => __obj.update("events", __v.asInstanceOf[js.Any]))
      healthCheckGracePeriodSeconds.foreach(
        __v => __obj.update("healthCheckGracePeriodSeconds", __v.asInstanceOf[js.Any])
      )
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      loadBalancers.foreach(__v => __obj.update("loadBalancers", __v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.update("networkConfiguration", __v.asInstanceOf[js.Any]))
      pendingCount.foreach(__v => __obj.update("pendingCount", __v.asInstanceOf[js.Any]))
      placementConstraints.foreach(__v => __obj.update("placementConstraints", __v.asInstanceOf[js.Any]))
      placementStrategy.foreach(__v => __obj.update("placementStrategy", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      propagateTags.foreach(__v => __obj.update("propagateTags", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      runningCount.foreach(__v => __obj.update("runningCount", __v.asInstanceOf[js.Any]))
      schedulingStrategy.foreach(__v => __obj.update("schedulingStrategy", __v.asInstanceOf[js.Any]))
      serviceArn.foreach(__v => __obj.update("serviceArn", __v.asInstanceOf[js.Any]))
      serviceName.foreach(__v => __obj.update("serviceName", __v.asInstanceOf[js.Any]))
      serviceRegistries.foreach(__v => __obj.update("serviceRegistries", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      taskDefinition.foreach(__v => __obj.update("taskDefinition", __v.asInstanceOf[js.Any]))
      taskSets.foreach(__v => __obj.update("taskSets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /**
    * Details on an event associated with a service.
    */
  @js.native
  trait ServiceEvent extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[String]
    var message: js.UndefOr[String]
  }

  object ServiceEvent {
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        message: js.UndefOr[String] = js.undefined
    ): ServiceEvent = {
      val __obj = js.Dictionary.empty[js.Any]
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceEvent]
    }
  }

  object ServiceFieldEnum {
    val TAGS = "TAGS"

    val values = IndexedSeq(TAGS)
  }

  /**
    * Details of the service registry.
    */
  @js.native
  trait ServiceRegistry extends js.Object {
    var containerName: js.UndefOr[String]
    var containerPort: js.UndefOr[BoxedInteger]
    var port: js.UndefOr[BoxedInteger]
    var registryArn: js.UndefOr[String]
  }

  object ServiceRegistry {
    def apply(
        containerName: js.UndefOr[String] = js.undefined,
        containerPort: js.UndefOr[BoxedInteger] = js.undefined,
        port: js.UndefOr[BoxedInteger] = js.undefined,
        registryArn: js.UndefOr[String] = js.undefined
    ): ServiceRegistry = {
      val __obj = js.Dictionary.empty[js.Any]
      containerName.foreach(__v => __obj.update("containerName", __v.asInstanceOf[js.Any]))
      containerPort.foreach(__v => __obj.update("containerPort", __v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.update("port", __v.asInstanceOf[js.Any]))
      registryArn.foreach(__v => __obj.update("registryArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceRegistry]
    }
  }

  /**
    * The current account setting for a resource.
    */
  @js.native
  trait Setting extends js.Object {
    var name: js.UndefOr[SettingName]
    var principalArn: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object Setting {
    def apply(
        name: js.UndefOr[SettingName] = js.undefined,
        principalArn: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): Setting = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      principalArn.foreach(__v => __obj.update("principalArn", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Setting]
    }
  }

  object SettingNameEnum {
    val serviceLongArnFormat           = "serviceLongArnFormat"
    val taskLongArnFormat              = "taskLongArnFormat"
    val containerInstanceLongArnFormat = "containerInstanceLongArnFormat"
    val awsvpcTrunking                 = "awsvpcTrunking"
    val containerInsights              = "containerInsights"

    val values = IndexedSeq(
      serviceLongArnFormat,
      taskLongArnFormat,
      containerInstanceLongArnFormat,
      awsvpcTrunking,
      containerInsights
    )
  }

  object SortOrderEnum {
    val ASC  = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
  }

  object StabilityStatusEnum {
    val STEADY_STATE = "STEADY_STATE"
    val STABILIZING  = "STABILIZING"

    val values = IndexedSeq(STEADY_STATE, STABILIZING)
  }

  @js.native
  trait StartTaskRequest extends js.Object {
    var containerInstances: StringList
    var taskDefinition: String
    var cluster: js.UndefOr[String]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var group: js.UndefOr[String]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var overrides: js.UndefOr[TaskOverride]
    var propagateTags: js.UndefOr[PropagateTags]
    var startedBy: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  object StartTaskRequest {
    def apply(
        containerInstances: StringList,
        taskDefinition: String,
        cluster: js.UndefOr[String] = js.undefined,
        enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
        group: js.UndefOr[String] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        overrides: js.UndefOr[TaskOverride] = js.undefined,
        propagateTags: js.UndefOr[PropagateTags] = js.undefined,
        startedBy: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): StartTaskRequest = {
      val __obj = js.Dictionary[js.Any](
        "containerInstances" -> containerInstances.asInstanceOf[js.Any],
        "taskDefinition"     -> taskDefinition.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      enableECSManagedTags.foreach(__v => __obj.update("enableECSManagedTags", __v.asInstanceOf[js.Any]))
      group.foreach(__v => __obj.update("group", __v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.update("networkConfiguration", __v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.update("overrides", __v.asInstanceOf[js.Any]))
      propagateTags.foreach(__v => __obj.update("propagateTags", __v.asInstanceOf[js.Any]))
      startedBy.foreach(__v => __obj.update("startedBy", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTaskRequest]
    }
  }

  @js.native
  trait StartTaskResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var tasks: js.UndefOr[Tasks]
  }

  object StartTaskResponse {
    def apply(
        failures: js.UndefOr[Failures] = js.undefined,
        tasks: js.UndefOr[Tasks] = js.undefined
    ): StartTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.update("tasks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTaskResponse]
    }
  }

  @js.native
  trait StopTaskRequest extends js.Object {
    var task: String
    var cluster: js.UndefOr[String]
    var reason: js.UndefOr[String]
  }

  object StopTaskRequest {
    def apply(
        task: String,
        cluster: js.UndefOr[String] = js.undefined,
        reason: js.UndefOr[String] = js.undefined
    ): StopTaskRequest = {
      val __obj = js.Dictionary[js.Any](
        "task" -> task.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.update("reason", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopTaskRequest]
    }
  }

  @js.native
  trait StopTaskResponse extends js.Object {
    var task: js.UndefOr[Task]
  }

  object StopTaskResponse {
    def apply(
        task: js.UndefOr[Task] = js.undefined
    ): StopTaskResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      task.foreach(__v => __obj.update("task", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopTaskResponse]
    }
  }

  @js.native
  trait SubmitAttachmentStateChangesRequest extends js.Object {
    var attachments: AttachmentStateChanges
    var cluster: js.UndefOr[String]
  }

  object SubmitAttachmentStateChangesRequest {
    def apply(
        attachments: AttachmentStateChanges,
        cluster: js.UndefOr[String] = js.undefined
    ): SubmitAttachmentStateChangesRequest = {
      val __obj = js.Dictionary[js.Any](
        "attachments" -> attachments.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitAttachmentStateChangesRequest]
    }
  }

  @js.native
  trait SubmitAttachmentStateChangesResponse extends js.Object {
    var acknowledgment: js.UndefOr[String]
  }

  object SubmitAttachmentStateChangesResponse {
    def apply(
        acknowledgment: js.UndefOr[String] = js.undefined
    ): SubmitAttachmentStateChangesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      acknowledgment.foreach(__v => __obj.update("acknowledgment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitAttachmentStateChangesResponse]
    }
  }

  @js.native
  trait SubmitContainerStateChangeRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var containerName: js.UndefOr[String]
    var exitCode: js.UndefOr[BoxedInteger]
    var networkBindings: js.UndefOr[NetworkBindings]
    var reason: js.UndefOr[String]
    var status: js.UndefOr[String]
    var task: js.UndefOr[String]
  }

  object SubmitContainerStateChangeRequest {
    def apply(
        cluster: js.UndefOr[String] = js.undefined,
        containerName: js.UndefOr[String] = js.undefined,
        exitCode: js.UndefOr[BoxedInteger] = js.undefined,
        networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        task: js.UndefOr[String] = js.undefined
    ): SubmitContainerStateChangeRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      containerName.foreach(__v => __obj.update("containerName", __v.asInstanceOf[js.Any]))
      exitCode.foreach(__v => __obj.update("exitCode", __v.asInstanceOf[js.Any]))
      networkBindings.foreach(__v => __obj.update("networkBindings", __v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.update("reason", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      task.foreach(__v => __obj.update("task", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitContainerStateChangeRequest]
    }
  }

  @js.native
  trait SubmitContainerStateChangeResponse extends js.Object {
    var acknowledgment: js.UndefOr[String]
  }

  object SubmitContainerStateChangeResponse {
    def apply(
        acknowledgment: js.UndefOr[String] = js.undefined
    ): SubmitContainerStateChangeResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      acknowledgment.foreach(__v => __obj.update("acknowledgment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitContainerStateChangeResponse]
    }
  }

  @js.native
  trait SubmitTaskStateChangeRequest extends js.Object {
    var attachments: js.UndefOr[AttachmentStateChanges]
    var cluster: js.UndefOr[String]
    var containers: js.UndefOr[ContainerStateChanges]
    var executionStoppedAt: js.UndefOr[Timestamp]
    var pullStartedAt: js.UndefOr[Timestamp]
    var pullStoppedAt: js.UndefOr[Timestamp]
    var reason: js.UndefOr[String]
    var status: js.UndefOr[String]
    var task: js.UndefOr[String]
  }

  object SubmitTaskStateChangeRequest {
    def apply(
        attachments: js.UndefOr[AttachmentStateChanges] = js.undefined,
        cluster: js.UndefOr[String] = js.undefined,
        containers: js.UndefOr[ContainerStateChanges] = js.undefined,
        executionStoppedAt: js.UndefOr[Timestamp] = js.undefined,
        pullStartedAt: js.UndefOr[Timestamp] = js.undefined,
        pullStoppedAt: js.UndefOr[Timestamp] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        task: js.UndefOr[String] = js.undefined
    ): SubmitTaskStateChangeRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      attachments.foreach(__v => __obj.update("attachments", __v.asInstanceOf[js.Any]))
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      containers.foreach(__v => __obj.update("containers", __v.asInstanceOf[js.Any]))
      executionStoppedAt.foreach(__v => __obj.update("executionStoppedAt", __v.asInstanceOf[js.Any]))
      pullStartedAt.foreach(__v => __obj.update("pullStartedAt", __v.asInstanceOf[js.Any]))
      pullStoppedAt.foreach(__v => __obj.update("pullStoppedAt", __v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.update("reason", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      task.foreach(__v => __obj.update("task", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitTaskStateChangeRequest]
    }
  }

  @js.native
  trait SubmitTaskStateChangeResponse extends js.Object {
    var acknowledgment: js.UndefOr[String]
  }

  object SubmitTaskStateChangeResponse {
    def apply(
        acknowledgment: js.UndefOr[String] = js.undefined
    ): SubmitTaskStateChangeResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      acknowledgment.foreach(__v => __obj.update("acknowledgment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitTaskStateChangeResponse]
    }
  }

  /**
    * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in the [[https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate|Create a container]] section of the [[https://docs.docker.com/engine/api/v1.35/|Docker Remote API]] and the <code>--sysctl</code> option to [[https://docs.docker.com/engine/reference/run/|docker run]].
    *  It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network mode for the following reasons:
    * * For tasks that use the <code>awsvpc</code> network mode, if you set <code>systemControls</code> for any container, it applies to all containers in the task. If you set different <code>systemControls</code> for multiple containers in a single task, the container that is started last determines which <code>systemControls</code> take effect.
    *  * For tasks that use the <code>host</code> network mode, the <code>systemControls</code> parameter applies to the container instance's kernel parameter as well as that of all containers of any tasks running on that container instance.
    */
  @js.native
  trait SystemControl extends js.Object {
    var namespace: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object SystemControl {
    def apply(
        namespace: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): SystemControl = {
      val __obj = js.Dictionary.empty[js.Any]
      namespace.foreach(__v => __obj.update("namespace", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemControl]
    }
  }

  /**
    * The metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define.
    *  The following basic restrictions apply to tags:
    * * Maximum number of tags per resource - 50
    *  * For each resource, each tag key must be unique, and each tag key can have only one value.
    *  * Maximum key length - 128 Unicode characters in UTF-8
    *  * Maximum value length - 256 Unicode characters in UTF-8
    *  * If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.
    *  * Tag keys and values are case-sensitive.
    *  * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.
    */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      key.foreach(__v => __obj.update("key", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: Tags
  }

  object TagResourceRequest {
    def apply(
        resourceArn: String,
        tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  object TargetTypeEnum {
    val `container-instance` = "container-instance"

    val values = IndexedSeq(`container-instance`)
  }

  /**
    * Details on a task in a cluster.
    */
  @js.native
  trait Task extends js.Object {
    var attachments: js.UndefOr[Attachments]
    var clusterArn: js.UndefOr[String]
    var connectivity: js.UndefOr[Connectivity]
    var connectivityAt: js.UndefOr[Timestamp]
    var containerInstanceArn: js.UndefOr[String]
    var containers: js.UndefOr[Containers]
    var cpu: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var desiredStatus: js.UndefOr[String]
    var executionStoppedAt: js.UndefOr[Timestamp]
    var group: js.UndefOr[String]
    var healthStatus: js.UndefOr[HealthStatus]
    var lastStatus: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var memory: js.UndefOr[String]
    var overrides: js.UndefOr[TaskOverride]
    var platformVersion: js.UndefOr[String]
    var pullStartedAt: js.UndefOr[Timestamp]
    var pullStoppedAt: js.UndefOr[Timestamp]
    var startedAt: js.UndefOr[Timestamp]
    var startedBy: js.UndefOr[String]
    var stopCode: js.UndefOr[TaskStopCode]
    var stoppedAt: js.UndefOr[Timestamp]
    var stoppedReason: js.UndefOr[String]
    var stoppingAt: js.UndefOr[Timestamp]
    var tags: js.UndefOr[Tags]
    var taskArn: js.UndefOr[String]
    var taskDefinitionArn: js.UndefOr[String]
    var version: js.UndefOr[Double]
  }

  object Task {
    def apply(
        attachments: js.UndefOr[Attachments] = js.undefined,
        clusterArn: js.UndefOr[String] = js.undefined,
        connectivity: js.UndefOr[Connectivity] = js.undefined,
        connectivityAt: js.UndefOr[Timestamp] = js.undefined,
        containerInstanceArn: js.UndefOr[String] = js.undefined,
        containers: js.UndefOr[Containers] = js.undefined,
        cpu: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        desiredStatus: js.UndefOr[String] = js.undefined,
        executionStoppedAt: js.UndefOr[Timestamp] = js.undefined,
        group: js.UndefOr[String] = js.undefined,
        healthStatus: js.UndefOr[HealthStatus] = js.undefined,
        lastStatus: js.UndefOr[String] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        memory: js.UndefOr[String] = js.undefined,
        overrides: js.UndefOr[TaskOverride] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        pullStartedAt: js.UndefOr[Timestamp] = js.undefined,
        pullStoppedAt: js.UndefOr[Timestamp] = js.undefined,
        startedAt: js.UndefOr[Timestamp] = js.undefined,
        startedBy: js.UndefOr[String] = js.undefined,
        stopCode: js.UndefOr[TaskStopCode] = js.undefined,
        stoppedAt: js.UndefOr[Timestamp] = js.undefined,
        stoppedReason: js.UndefOr[String] = js.undefined,
        stoppingAt: js.UndefOr[Timestamp] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        taskArn: js.UndefOr[String] = js.undefined,
        taskDefinitionArn: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[Double] = js.undefined
    ): Task = {
      val __obj = js.Dictionary.empty[js.Any]
      attachments.foreach(__v => __obj.update("attachments", __v.asInstanceOf[js.Any]))
      clusterArn.foreach(__v => __obj.update("clusterArn", __v.asInstanceOf[js.Any]))
      connectivity.foreach(__v => __obj.update("connectivity", __v.asInstanceOf[js.Any]))
      connectivityAt.foreach(__v => __obj.update("connectivityAt", __v.asInstanceOf[js.Any]))
      containerInstanceArn.foreach(__v => __obj.update("containerInstanceArn", __v.asInstanceOf[js.Any]))
      containers.foreach(__v => __obj.update("containers", __v.asInstanceOf[js.Any]))
      cpu.foreach(__v => __obj.update("cpu", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      desiredStatus.foreach(__v => __obj.update("desiredStatus", __v.asInstanceOf[js.Any]))
      executionStoppedAt.foreach(__v => __obj.update("executionStoppedAt", __v.asInstanceOf[js.Any]))
      group.foreach(__v => __obj.update("group", __v.asInstanceOf[js.Any]))
      healthStatus.foreach(__v => __obj.update("healthStatus", __v.asInstanceOf[js.Any]))
      lastStatus.foreach(__v => __obj.update("lastStatus", __v.asInstanceOf[js.Any]))
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.update("memory", __v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.update("overrides", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      pullStartedAt.foreach(__v => __obj.update("pullStartedAt", __v.asInstanceOf[js.Any]))
      pullStoppedAt.foreach(__v => __obj.update("pullStoppedAt", __v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.update("startedAt", __v.asInstanceOf[js.Any]))
      startedBy.foreach(__v => __obj.update("startedBy", __v.asInstanceOf[js.Any]))
      stopCode.foreach(__v => __obj.update("stopCode", __v.asInstanceOf[js.Any]))
      stoppedAt.foreach(__v => __obj.update("stoppedAt", __v.asInstanceOf[js.Any]))
      stoppedReason.foreach(__v => __obj.update("stoppedReason", __v.asInstanceOf[js.Any]))
      stoppingAt.foreach(__v => __obj.update("stoppingAt", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      taskArn.foreach(__v => __obj.update("taskArn", __v.asInstanceOf[js.Any]))
      taskDefinitionArn.foreach(__v => __obj.update("taskDefinitionArn", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Task]
    }
  }

  /**
    * The details of a task definition which describes the container and volume definitions of an Amazon Elastic Container Service task. You can specify which Docker images to use, the required resources, and other configurations related to launching the task definition through an Amazon ECS service or task.
    */
  @js.native
  trait TaskDefinition extends js.Object {
    var compatibilities: js.UndefOr[CompatibilityList]
    var containerDefinitions: js.UndefOr[ContainerDefinitions]
    var cpu: js.UndefOr[String]
    var executionRoleArn: js.UndefOr[String]
    var family: js.UndefOr[String]
    var ipcMode: js.UndefOr[IpcMode]
    var memory: js.UndefOr[String]
    var networkMode: js.UndefOr[NetworkMode]
    var pidMode: js.UndefOr[PidMode]
    var placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints]
    var proxyConfiguration: js.UndefOr[ProxyConfiguration]
    var requiresAttributes: js.UndefOr[RequiresAttributes]
    var requiresCompatibilities: js.UndefOr[CompatibilityList]
    var revision: js.UndefOr[Int]
    var status: js.UndefOr[TaskDefinitionStatus]
    var taskDefinitionArn: js.UndefOr[String]
    var taskRoleArn: js.UndefOr[String]
    var volumes: js.UndefOr[VolumeList]
  }

  object TaskDefinition {
    def apply(
        compatibilities: js.UndefOr[CompatibilityList] = js.undefined,
        containerDefinitions: js.UndefOr[ContainerDefinitions] = js.undefined,
        cpu: js.UndefOr[String] = js.undefined,
        executionRoleArn: js.UndefOr[String] = js.undefined,
        family: js.UndefOr[String] = js.undefined,
        ipcMode: js.UndefOr[IpcMode] = js.undefined,
        memory: js.UndefOr[String] = js.undefined,
        networkMode: js.UndefOr[NetworkMode] = js.undefined,
        pidMode: js.UndefOr[PidMode] = js.undefined,
        placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.undefined,
        proxyConfiguration: js.UndefOr[ProxyConfiguration] = js.undefined,
        requiresAttributes: js.UndefOr[RequiresAttributes] = js.undefined,
        requiresCompatibilities: js.UndefOr[CompatibilityList] = js.undefined,
        revision: js.UndefOr[Int] = js.undefined,
        status: js.UndefOr[TaskDefinitionStatus] = js.undefined,
        taskDefinitionArn: js.UndefOr[String] = js.undefined,
        taskRoleArn: js.UndefOr[String] = js.undefined,
        volumes: js.UndefOr[VolumeList] = js.undefined
    ): TaskDefinition = {
      val __obj = js.Dictionary.empty[js.Any]
      compatibilities.foreach(__v => __obj.update("compatibilities", __v.asInstanceOf[js.Any]))
      containerDefinitions.foreach(__v => __obj.update("containerDefinitions", __v.asInstanceOf[js.Any]))
      cpu.foreach(__v => __obj.update("cpu", __v.asInstanceOf[js.Any]))
      executionRoleArn.foreach(__v => __obj.update("executionRoleArn", __v.asInstanceOf[js.Any]))
      family.foreach(__v => __obj.update("family", __v.asInstanceOf[js.Any]))
      ipcMode.foreach(__v => __obj.update("ipcMode", __v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.update("memory", __v.asInstanceOf[js.Any]))
      networkMode.foreach(__v => __obj.update("networkMode", __v.asInstanceOf[js.Any]))
      pidMode.foreach(__v => __obj.update("pidMode", __v.asInstanceOf[js.Any]))
      placementConstraints.foreach(__v => __obj.update("placementConstraints", __v.asInstanceOf[js.Any]))
      proxyConfiguration.foreach(__v => __obj.update("proxyConfiguration", __v.asInstanceOf[js.Any]))
      requiresAttributes.foreach(__v => __obj.update("requiresAttributes", __v.asInstanceOf[js.Any]))
      requiresCompatibilities.foreach(__v => __obj.update("requiresCompatibilities", __v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.update("revision", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      taskDefinitionArn.foreach(__v => __obj.update("taskDefinitionArn", __v.asInstanceOf[js.Any]))
      taskRoleArn.foreach(__v => __obj.update("taskRoleArn", __v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.update("volumes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskDefinition]
    }
  }

  object TaskDefinitionFamilyStatusEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"
    val ALL      = "ALL"

    val values = IndexedSeq(ACTIVE, INACTIVE, ALL)
  }

  object TaskDefinitionFieldEnum {
    val TAGS = "TAGS"

    val values = IndexedSeq(TAGS)
  }

  /**
    * An object representing a constraint on task placement in the task definition.
    *  If you are using the Fargate launch type, task placement constraints are not supported.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html|Task Placement Constraints]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  trait TaskDefinitionPlacementConstraint extends js.Object {
    var expression: js.UndefOr[String]
    var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType]
  }

  object TaskDefinitionPlacementConstraint {
    def apply(
        expression: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.undefined
    ): TaskDefinitionPlacementConstraint = {
      val __obj = js.Dictionary.empty[js.Any]
      expression.foreach(__v => __obj.update("expression", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
    }
  }

  object TaskDefinitionPlacementConstraintTypeEnum {
    val memberOf = "memberOf"

    val values = IndexedSeq(memberOf)
  }

  object TaskDefinitionStatusEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
  }

  object TaskFieldEnum {
    val TAGS = "TAGS"

    val values = IndexedSeq(TAGS)
  }

  /**
    * The overrides associated with a task.
    */
  @js.native
  trait TaskOverride extends js.Object {
    var containerOverrides: js.UndefOr[ContainerOverrides]
    var executionRoleArn: js.UndefOr[String]
    var taskRoleArn: js.UndefOr[String]
  }

  object TaskOverride {
    def apply(
        containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined,
        executionRoleArn: js.UndefOr[String] = js.undefined,
        taskRoleArn: js.UndefOr[String] = js.undefined
    ): TaskOverride = {
      val __obj = js.Dictionary.empty[js.Any]
      containerOverrides.foreach(__v => __obj.update("containerOverrides", __v.asInstanceOf[js.Any]))
      executionRoleArn.foreach(__v => __obj.update("executionRoleArn", __v.asInstanceOf[js.Any]))
      taskRoleArn.foreach(__v => __obj.update("taskRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskOverride]
    }
  }

  /**
    * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
    */
  @js.native
  trait TaskSet extends js.Object {
    var clusterArn: js.UndefOr[String]
    var computedDesiredCount: js.UndefOr[Int]
    var createdAt: js.UndefOr[Timestamp]
    var externalId: js.UndefOr[String]
    var id: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var loadBalancers: js.UndefOr[LoadBalancers]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var pendingCount: js.UndefOr[Int]
    var platformVersion: js.UndefOr[String]
    var runningCount: js.UndefOr[Int]
    var scale: js.UndefOr[Scale]
    var serviceArn: js.UndefOr[String]
    var serviceRegistries: js.UndefOr[ServiceRegistries]
    var stabilityStatus: js.UndefOr[StabilityStatus]
    var stabilityStatusAt: js.UndefOr[Timestamp]
    var startedBy: js.UndefOr[String]
    var status: js.UndefOr[String]
    var taskDefinition: js.UndefOr[String]
    var taskSetArn: js.UndefOr[String]
    var updatedAt: js.UndefOr[Timestamp]
  }

  object TaskSet {
    def apply(
        clusterArn: js.UndefOr[String] = js.undefined,
        computedDesiredCount: js.UndefOr[Int] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        externalId: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        launchType: js.UndefOr[LaunchType] = js.undefined,
        loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        pendingCount: js.UndefOr[Int] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        runningCount: js.UndefOr[Int] = js.undefined,
        scale: js.UndefOr[Scale] = js.undefined,
        serviceArn: js.UndefOr[String] = js.undefined,
        serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined,
        stabilityStatus: js.UndefOr[StabilityStatus] = js.undefined,
        stabilityStatusAt: js.UndefOr[Timestamp] = js.undefined,
        startedBy: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        taskDefinition: js.UndefOr[String] = js.undefined,
        taskSetArn: js.UndefOr[String] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): TaskSet = {
      val __obj = js.Dictionary.empty[js.Any]
      clusterArn.foreach(__v => __obj.update("clusterArn", __v.asInstanceOf[js.Any]))
      computedDesiredCount.foreach(__v => __obj.update("computedDesiredCount", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      externalId.foreach(__v => __obj.update("externalId", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      launchType.foreach(__v => __obj.update("launchType", __v.asInstanceOf[js.Any]))
      loadBalancers.foreach(__v => __obj.update("loadBalancers", __v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.update("networkConfiguration", __v.asInstanceOf[js.Any]))
      pendingCount.foreach(__v => __obj.update("pendingCount", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      runningCount.foreach(__v => __obj.update("runningCount", __v.asInstanceOf[js.Any]))
      scale.foreach(__v => __obj.update("scale", __v.asInstanceOf[js.Any]))
      serviceArn.foreach(__v => __obj.update("serviceArn", __v.asInstanceOf[js.Any]))
      serviceRegistries.foreach(__v => __obj.update("serviceRegistries", __v.asInstanceOf[js.Any]))
      stabilityStatus.foreach(__v => __obj.update("stabilityStatus", __v.asInstanceOf[js.Any]))
      stabilityStatusAt.foreach(__v => __obj.update("stabilityStatusAt", __v.asInstanceOf[js.Any]))
      startedBy.foreach(__v => __obj.update("startedBy", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      taskDefinition.foreach(__v => __obj.update("taskDefinition", __v.asInstanceOf[js.Any]))
      taskSetArn.foreach(__v => __obj.update("taskSetArn", __v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.update("updatedAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskSet]
    }
  }

  object TaskStopCodeEnum {
    val TaskFailedToStart        = "TaskFailedToStart"
    val EssentialContainerExited = "EssentialContainerExited"
    val UserInitiated            = "UserInitiated"

    val values = IndexedSeq(TaskFailedToStart, EssentialContainerExited, UserInitiated)
  }

  /**
    * The container path, mount options, and size of the tmpfs mount.
    */
  @js.native
  trait Tmpfs extends js.Object {
    var containerPath: String
    var size: Int
    var mountOptions: js.UndefOr[StringList]
  }

  object Tmpfs {
    def apply(
        containerPath: String,
        size: Int,
        mountOptions: js.UndefOr[StringList] = js.undefined
    ): Tmpfs = {
      val __obj = js.Dictionary[js.Any](
        "containerPath" -> containerPath.asInstanceOf[js.Any],
        "size"          -> size.asInstanceOf[js.Any]
      )

      mountOptions.foreach(__v => __obj.update("mountOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tmpfs]
    }
  }

  object TransportProtocolEnum {
    val tcp = "tcp"
    val udp = "udp"

    val values = IndexedSeq(tcp, udp)
  }

  /**
    * The <code>ulimit</code> settings to pass to the container.
    */
  @js.native
  trait Ulimit extends js.Object {
    var hardLimit: Int
    var name: UlimitName
    var softLimit: Int
  }

  object Ulimit {
    def apply(
        hardLimit: Int,
        name: UlimitName,
        softLimit: Int
    ): Ulimit = {
      val __obj = js.Dictionary[js.Any](
        "hardLimit" -> hardLimit.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "softLimit" -> softLimit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Ulimit]
    }
  }

  object UlimitNameEnum {
    val core       = "core"
    val cpu        = "cpu"
    val data       = "data"
    val fsize      = "fsize"
    val locks      = "locks"
    val memlock    = "memlock"
    val msgqueue   = "msgqueue"
    val nice       = "nice"
    val nofile     = "nofile"
    val nproc      = "nproc"
    val rss        = "rss"
    val rtprio     = "rtprio"
    val rttime     = "rttime"
    val sigpending = "sigpending"
    val stack      = "stack"

    val values = IndexedSeq(
      core,
      cpu,
      data,
      fsize,
      locks,
      memlock,
      msgqueue,
      nice,
      nofile,
      nproc,
      rss,
      rtprio,
      rttime,
      sigpending,
      stack
    )
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(
        resourceArn: String,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateContainerAgentRequest extends js.Object {
    var containerInstance: String
    var cluster: js.UndefOr[String]
  }

  object UpdateContainerAgentRequest {
    def apply(
        containerInstance: String,
        cluster: js.UndefOr[String] = js.undefined
    ): UpdateContainerAgentRequest = {
      val __obj = js.Dictionary[js.Any](
        "containerInstance" -> containerInstance.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContainerAgentRequest]
    }
  }

  @js.native
  trait UpdateContainerAgentResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  object UpdateContainerAgentResponse {
    def apply(
        containerInstance: js.UndefOr[ContainerInstance] = js.undefined
    ): UpdateContainerAgentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      containerInstance.foreach(__v => __obj.update("containerInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContainerAgentResponse]
    }
  }

  @js.native
  trait UpdateContainerInstancesStateRequest extends js.Object {
    var containerInstances: StringList
    var status: ContainerInstanceStatus
    var cluster: js.UndefOr[String]
  }

  object UpdateContainerInstancesStateRequest {
    def apply(
        containerInstances: StringList,
        status: ContainerInstanceStatus,
        cluster: js.UndefOr[String] = js.undefined
    ): UpdateContainerInstancesStateRequest = {
      val __obj = js.Dictionary[js.Any](
        "containerInstances" -> containerInstances.asInstanceOf[js.Any],
        "status"             -> status.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContainerInstancesStateRequest]
    }
  }

  @js.native
  trait UpdateContainerInstancesStateResponse extends js.Object {
    var containerInstances: js.UndefOr[ContainerInstances]
    var failures: js.UndefOr[Failures]
  }

  object UpdateContainerInstancesStateResponse {
    def apply(
        containerInstances: js.UndefOr[ContainerInstances] = js.undefined,
        failures: js.UndefOr[Failures] = js.undefined
    ): UpdateContainerInstancesStateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      containerInstances.foreach(__v => __obj.update("containerInstances", __v.asInstanceOf[js.Any]))
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContainerInstancesStateResponse]
    }
  }

  @js.native
  trait UpdateServicePrimaryTaskSetRequest extends js.Object {
    var cluster: String
    var primaryTaskSet: String
    var service: String
  }

  object UpdateServicePrimaryTaskSetRequest {
    def apply(
        cluster: String,
        primaryTaskSet: String,
        service: String
    ): UpdateServicePrimaryTaskSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "cluster"        -> cluster.asInstanceOf[js.Any],
        "primaryTaskSet" -> primaryTaskSet.asInstanceOf[js.Any],
        "service"        -> service.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateServicePrimaryTaskSetRequest]
    }
  }

  @js.native
  trait UpdateServicePrimaryTaskSetResponse extends js.Object {
    var taskSet: js.UndefOr[TaskSet]
  }

  object UpdateServicePrimaryTaskSetResponse {
    def apply(
        taskSet: js.UndefOr[TaskSet] = js.undefined
    ): UpdateServicePrimaryTaskSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      taskSet.foreach(__v => __obj.update("taskSet", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServicePrimaryTaskSetResponse]
    }
  }

  @js.native
  trait UpdateServiceRequest extends js.Object {
    var service: String
    var cluster: js.UndefOr[String]
    var deploymentConfiguration: js.UndefOr[DeploymentConfiguration]
    var desiredCount: js.UndefOr[BoxedInteger]
    var forceNewDeployment: js.UndefOr[Boolean]
    var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var platformVersion: js.UndefOr[String]
    var taskDefinition: js.UndefOr[String]
  }

  object UpdateServiceRequest {
    def apply(
        service: String,
        cluster: js.UndefOr[String] = js.undefined,
        deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
        desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
        forceNewDeployment: js.UndefOr[Boolean] = js.undefined,
        healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        taskDefinition: js.UndefOr[String] = js.undefined
    ): UpdateServiceRequest = {
      val __obj = js.Dictionary[js.Any](
        "service" -> service.asInstanceOf[js.Any]
      )

      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      deploymentConfiguration.foreach(__v => __obj.update("deploymentConfiguration", __v.asInstanceOf[js.Any]))
      desiredCount.foreach(__v => __obj.update("desiredCount", __v.asInstanceOf[js.Any]))
      forceNewDeployment.foreach(__v => __obj.update("forceNewDeployment", __v.asInstanceOf[js.Any]))
      healthCheckGracePeriodSeconds.foreach(
        __v => __obj.update("healthCheckGracePeriodSeconds", __v.asInstanceOf[js.Any])
      )
      networkConfiguration.foreach(__v => __obj.update("networkConfiguration", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      taskDefinition.foreach(__v => __obj.update("taskDefinition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceRequest]
    }
  }

  @js.native
  trait UpdateServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  object UpdateServiceResponse {
    def apply(
        service: js.UndefOr[Service] = js.undefined
    ): UpdateServiceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      service.foreach(__v => __obj.update("service", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceResponse]
    }
  }

  @js.native
  trait UpdateTaskSetRequest extends js.Object {
    var cluster: String
    var scale: Scale
    var service: String
    var taskSet: String
  }

  object UpdateTaskSetRequest {
    def apply(
        cluster: String,
        scale: Scale,
        service: String,
        taskSet: String
    ): UpdateTaskSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "cluster" -> cluster.asInstanceOf[js.Any],
        "scale"   -> scale.asInstanceOf[js.Any],
        "service" -> service.asInstanceOf[js.Any],
        "taskSet" -> taskSet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTaskSetRequest]
    }
  }

  @js.native
  trait UpdateTaskSetResponse extends js.Object {
    var taskSet: js.UndefOr[TaskSet]
  }

  object UpdateTaskSetResponse {
    def apply(
        taskSet: js.UndefOr[TaskSet] = js.undefined
    ): UpdateTaskSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      taskSet.foreach(__v => __obj.update("taskSet", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTaskSetResponse]
    }
  }

  /**
    * The Docker and Amazon ECS container agent version information about a container instance.
    */
  @js.native
  trait VersionInfo extends js.Object {
    var agentHash: js.UndefOr[String]
    var agentVersion: js.UndefOr[String]
    var dockerVersion: js.UndefOr[String]
  }

  object VersionInfo {
    def apply(
        agentHash: js.UndefOr[String] = js.undefined,
        agentVersion: js.UndefOr[String] = js.undefined,
        dockerVersion: js.UndefOr[String] = js.undefined
    ): VersionInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      agentHash.foreach(__v => __obj.update("agentHash", __v.asInstanceOf[js.Any]))
      agentVersion.foreach(__v => __obj.update("agentVersion", __v.asInstanceOf[js.Any]))
      dockerVersion.foreach(__v => __obj.update("dockerVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersionInfo]
    }
  }

  /**
    * A data volume used in a task definition. For tasks that use a Docker volume, specify a <code>DockerVolumeConfiguration</code>. For tasks that use a bind mount host volume, specify a <code>host</code> and optional <code>sourcePath</code>. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html|Using Data Volumes in Tasks]].
    */
  @js.native
  trait Volume extends js.Object {
    var dockerVolumeConfiguration: js.UndefOr[DockerVolumeConfiguration]
    var host: js.UndefOr[HostVolumeProperties]
    var name: js.UndefOr[String]
  }

  object Volume {
    def apply(
        dockerVolumeConfiguration: js.UndefOr[DockerVolumeConfiguration] = js.undefined,
        host: js.UndefOr[HostVolumeProperties] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): Volume = {
      val __obj = js.Dictionary.empty[js.Any]
      dockerVolumeConfiguration.foreach(__v => __obj.update("dockerVolumeConfiguration", __v.asInstanceOf[js.Any]))
      host.foreach(__v => __obj.update("host", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Volume]
    }
  }

  /**
    * Details on a data volume from another container in the same task definition.
    */
  @js.native
  trait VolumeFrom extends js.Object {
    var readOnly: js.UndefOr[BoxedBoolean]
    var sourceContainer: js.UndefOr[String]
  }

  object VolumeFrom {
    def apply(
        readOnly: js.UndefOr[BoxedBoolean] = js.undefined,
        sourceContainer: js.UndefOr[String] = js.undefined
    ): VolumeFrom = {
      val __obj = js.Dictionary.empty[js.Any]
      readOnly.foreach(__v => __obj.update("readOnly", __v.asInstanceOf[js.Any]))
      sourceContainer.foreach(__v => __obj.update("sourceContainer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeFrom]
    }
  }
}
