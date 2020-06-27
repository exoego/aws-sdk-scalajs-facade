package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ecs {
  type AttachmentDetails                  = js.Array[KeyValuePair]
  type AttachmentStateChanges             = js.Array[AttachmentStateChange]
  type Attachments                        = js.Array[Attachment]
  type Attributes                         = js.Array[Attribute]
  type BoxedBoolean                       = Boolean
  type BoxedInteger                       = Int
  type CapacityProviderFieldList          = js.Array[CapacityProviderField]
  type CapacityProviderStrategy           = js.Array[CapacityProviderStrategyItem]
  type CapacityProviderStrategyItemBase   = Int
  type CapacityProviderStrategyItemWeight = Int
  type CapacityProviders                  = js.Array[CapacityProvider]
  type ClusterFieldList                   = js.Array[ClusterField]
  type ClusterSettings                    = js.Array[ClusterSetting]
  type Clusters                           = js.Array[Cluster]
  type CompatibilityList                  = js.Array[Compatibility]
  type ContainerDefinitions               = js.Array[ContainerDefinition]
  type ContainerDependencies              = js.Array[ContainerDependency]
  type ContainerInstanceFieldList         = js.Array[ContainerInstanceField]
  type ContainerInstances                 = js.Array[ContainerInstance]
  type ContainerOverrides                 = js.Array[ContainerOverride]
  type ContainerStateChanges              = js.Array[ContainerStateChange]
  type Containers                         = js.Array[Container]
  type Deployments                        = js.Array[Deployment]
  type DeviceCgroupPermissions            = js.Array[DeviceCgroupPermission]
  type DevicesList                        = js.Array[Device]
  type DockerLabelsMap                    = js.Dictionary[String]
  type EnvironmentVariables               = js.Array[KeyValuePair]
  type Failures                           = js.Array[Failure]
  type FirelensConfigurationOptionsMap    = js.Dictionary[String]
  type GpuIds                             = js.Array[String]
  type HostEntryList                      = js.Array[HostEntry]
  type InferenceAcceleratorOverrides      = js.Array[InferenceAcceleratorOverride]
  type InferenceAccelerators              = js.Array[InferenceAccelerator]
  type LoadBalancers                      = js.Array[LoadBalancer]
  type LogConfigurationOptionsMap         = js.Dictionary[String]
  type ManagedScalingStepSize             = Int
  type ManagedScalingTargetCapacity       = Int
  type MountPointList                     = js.Array[MountPoint]
  type NetworkBindings                    = js.Array[NetworkBinding]
  type NetworkInterfaces                  = js.Array[NetworkInterface]
  type PlacementConstraints               = js.Array[PlacementConstraint]
  type PlacementStrategies                = js.Array[PlacementStrategy]
  type PlatformDevices                    = js.Array[PlatformDevice]
  type PortMappingList                    = js.Array[PortMapping]
  type ProxyConfigurationProperties       = js.Array[KeyValuePair]
  type RequiresAttributes                 = js.Array[Attribute]
  type ResourceRequirements               = js.Array[ResourceRequirement]
  type Resources                          = js.Array[Resource]
  type SecretList                         = js.Array[Secret]
  type ServiceEvents                      = js.Array[ServiceEvent]
  type ServiceFieldList                   = js.Array[ServiceField]
  type ServiceRegistries                  = js.Array[ServiceRegistry]
  type Services                           = js.Array[Service]
  type Settings                           = js.Array[Setting]
  type Statistics                         = js.Array[KeyValuePair]
  type StringList                         = js.Array[String]
  type StringMap                          = js.Dictionary[String]
  type SystemControls                     = js.Array[SystemControl]
  type TagKey                             = String
  type TagKeys                            = js.Array[TagKey]
  type TagValue                           = String
  type Tags                               = js.Array[Tag]
  type TaskDefinitionFieldList            = js.Array[TaskDefinitionField]
  type TaskDefinitionPlacementConstraints = js.Array[TaskDefinitionPlacementConstraint]
  type TaskFieldList                      = js.Array[TaskField]
  type TaskSetFieldList                   = js.Array[TaskSetField]
  type TaskSets                           = js.Array[TaskSet]
  type Tasks                              = js.Array[Task]
  type Timestamp                          = js.Date
  type TmpfsList                          = js.Array[Tmpfs]
  type UlimitList                         = js.Array[Ulimit]
  type VolumeFromList                     = js.Array[VolumeFrom]
  type VolumeList                         = js.Array[Volume]

  implicit final class ECSOps(private val service: ECS) extends AnyVal {

    @inline def createCapacityProviderFuture(
        params: CreateCapacityProviderRequest
    ): Future[CreateCapacityProviderResponse] = service.createCapacityProvider(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise().toFuture
    @inline def createServiceFuture(params: CreateServiceRequest): Future[CreateServiceResponse] =
      service.createService(params).promise().toFuture
    @inline def createTaskSetFuture(params: CreateTaskSetRequest): Future[CreateTaskSetResponse] =
      service.createTaskSet(params).promise().toFuture
    @inline def deleteAccountSettingFuture(params: DeleteAccountSettingRequest): Future[DeleteAccountSettingResponse] =
      service.deleteAccountSetting(params).promise().toFuture
    @inline def deleteAttributesFuture(params: DeleteAttributesRequest): Future[DeleteAttributesResponse] =
      service.deleteAttributes(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise().toFuture
    @inline def deleteServiceFuture(params: DeleteServiceRequest): Future[DeleteServiceResponse] =
      service.deleteService(params).promise().toFuture
    @inline def deleteTaskSetFuture(params: DeleteTaskSetRequest): Future[DeleteTaskSetResponse] =
      service.deleteTaskSet(params).promise().toFuture
    @inline def deregisterContainerInstanceFuture(
        params: DeregisterContainerInstanceRequest
    ): Future[DeregisterContainerInstanceResponse] = service.deregisterContainerInstance(params).promise().toFuture
    @inline def deregisterTaskDefinitionFuture(
        params: DeregisterTaskDefinitionRequest
    ): Future[DeregisterTaskDefinitionResponse] = service.deregisterTaskDefinition(params).promise().toFuture
    @inline def describeCapacityProvidersFuture(
        params: DescribeCapacityProvidersRequest
    ): Future[DescribeCapacityProvidersResponse] = service.describeCapacityProviders(params).promise().toFuture
    @inline def describeClustersFuture(params: DescribeClustersRequest): Future[DescribeClustersResponse] =
      service.describeClusters(params).promise().toFuture
    @inline def describeContainerInstancesFuture(
        params: DescribeContainerInstancesRequest
    ): Future[DescribeContainerInstancesResponse] = service.describeContainerInstances(params).promise().toFuture
    @inline def describeServicesFuture(params: DescribeServicesRequest): Future[DescribeServicesResponse] =
      service.describeServices(params).promise().toFuture
    @inline def describeTaskDefinitionFuture(
        params: DescribeTaskDefinitionRequest
    ): Future[DescribeTaskDefinitionResponse] = service.describeTaskDefinition(params).promise().toFuture
    @inline def describeTaskSetsFuture(params: DescribeTaskSetsRequest): Future[DescribeTaskSetsResponse] =
      service.describeTaskSets(params).promise().toFuture
    @inline def describeTasksFuture(params: DescribeTasksRequest): Future[DescribeTasksResponse] =
      service.describeTasks(params).promise().toFuture
    @inline def discoverPollEndpointFuture(params: DiscoverPollEndpointRequest): Future[DiscoverPollEndpointResponse] =
      service.discoverPollEndpoint(params).promise().toFuture
    @inline def listAccountSettingsFuture(params: ListAccountSettingsRequest): Future[ListAccountSettingsResponse] =
      service.listAccountSettings(params).promise().toFuture
    @inline def listAttributesFuture(params: ListAttributesRequest): Future[ListAttributesResponse] =
      service.listAttributes(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] =
      service.listClusters(params).promise().toFuture
    @inline def listContainerInstancesFuture(
        params: ListContainerInstancesRequest
    ): Future[ListContainerInstancesResponse] = service.listContainerInstances(params).promise().toFuture
    @inline def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] =
      service.listServices(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTaskDefinitionFamiliesFuture(
        params: ListTaskDefinitionFamiliesRequest
    ): Future[ListTaskDefinitionFamiliesResponse] = service.listTaskDefinitionFamilies(params).promise().toFuture
    @inline def listTaskDefinitionsFuture(params: ListTaskDefinitionsRequest): Future[ListTaskDefinitionsResponse] =
      service.listTaskDefinitions(params).promise().toFuture
    @inline def listTasksFuture(params: ListTasksRequest): Future[ListTasksResponse] =
      service.listTasks(params).promise().toFuture
    @inline def putAccountSettingDefaultFuture(
        params: PutAccountSettingDefaultRequest
    ): Future[PutAccountSettingDefaultResponse] = service.putAccountSettingDefault(params).promise().toFuture
    @inline def putAccountSettingFuture(params: PutAccountSettingRequest): Future[PutAccountSettingResponse] =
      service.putAccountSetting(params).promise().toFuture
    @inline def putAttributesFuture(params: PutAttributesRequest): Future[PutAttributesResponse] =
      service.putAttributes(params).promise().toFuture
    @inline def putClusterCapacityProvidersFuture(
        params: PutClusterCapacityProvidersRequest
    ): Future[PutClusterCapacityProvidersResponse] = service.putClusterCapacityProviders(params).promise().toFuture
    @inline def registerContainerInstanceFuture(
        params: RegisterContainerInstanceRequest
    ): Future[RegisterContainerInstanceResponse] = service.registerContainerInstance(params).promise().toFuture
    @inline def registerTaskDefinitionFuture(
        params: RegisterTaskDefinitionRequest
    ): Future[RegisterTaskDefinitionResponse] = service.registerTaskDefinition(params).promise().toFuture
    @inline def runTaskFuture(params: RunTaskRequest): Future[RunTaskResponse] =
      service.runTask(params).promise().toFuture
    @inline def startTaskFuture(params: StartTaskRequest): Future[StartTaskResponse] =
      service.startTask(params).promise().toFuture
    @inline def stopTaskFuture(params: StopTaskRequest): Future[StopTaskResponse] =
      service.stopTask(params).promise().toFuture
    @inline def submitAttachmentStateChangesFuture(
        params: SubmitAttachmentStateChangesRequest
    ): Future[SubmitAttachmentStateChangesResponse] = service.submitAttachmentStateChanges(params).promise().toFuture
    @inline def submitContainerStateChangeFuture(
        params: SubmitContainerStateChangeRequest
    ): Future[SubmitContainerStateChangeResponse] = service.submitContainerStateChange(params).promise().toFuture
    @inline def submitTaskStateChangeFuture(
        params: SubmitTaskStateChangeRequest
    ): Future[SubmitTaskStateChangeResponse] = service.submitTaskStateChange(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateClusterSettingsFuture(
        params: UpdateClusterSettingsRequest
    ): Future[UpdateClusterSettingsResponse] = service.updateClusterSettings(params).promise().toFuture
    @inline def updateContainerAgentFuture(params: UpdateContainerAgentRequest): Future[UpdateContainerAgentResponse] =
      service.updateContainerAgent(params).promise().toFuture
    @inline def updateContainerInstancesStateFuture(
        params: UpdateContainerInstancesStateRequest
    ): Future[UpdateContainerInstancesStateResponse] = service.updateContainerInstancesState(params).promise().toFuture
    @inline def updateServiceFuture(params: UpdateServiceRequest): Future[UpdateServiceResponse] =
      service.updateService(params).promise().toFuture
    @inline def updateServicePrimaryTaskSetFuture(
        params: UpdateServicePrimaryTaskSetRequest
    ): Future[UpdateServicePrimaryTaskSetResponse] = service.updateServicePrimaryTaskSet(params).promise().toFuture
    @inline def updateTaskSetFuture(params: UpdateTaskSetRequest): Future[UpdateTaskSetResponse] =
      service.updateTaskSet(params).promise().toFuture
  }
}

package ecs {
  @js.native
  @JSImport("aws-sdk", "ECS")
  class ECS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCapacityProvider(params: CreateCapacityProviderRequest): Request[CreateCapacityProviderResponse] =
      js.native
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
    def describeCapacityProviders(
        params: DescribeCapacityProvidersRequest
    ): Request[DescribeCapacityProvidersResponse]                                            = js.native
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
    def putClusterCapacityProviders(
        params: PutClusterCapacityProvidersRequest
    ): Request[PutClusterCapacityProvidersResponse] = js.native
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
    def updateClusterSettings(params: UpdateClusterSettingsRequest): Request[UpdateClusterSettingsResponse] = js.native
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

  @js.native
  sealed trait AgentUpdateStatus extends js.Any
  object AgentUpdateStatus extends js.Object {
    val PENDING  = "PENDING".asInstanceOf[AgentUpdateStatus]
    val STAGING  = "STAGING".asInstanceOf[AgentUpdateStatus]
    val STAGED   = "STAGED".asInstanceOf[AgentUpdateStatus]
    val UPDATING = "UPDATING".asInstanceOf[AgentUpdateStatus]
    val UPDATED  = "UPDATED".asInstanceOf[AgentUpdateStatus]
    val FAILED   = "FAILED".asInstanceOf[AgentUpdateStatus]

    val values = js.Object.freeze(js.Array(PENDING, STAGING, STAGED, UPDATING, UPDATED, FAILED))
  }

  @js.native
  sealed trait AssignPublicIp extends js.Any
  object AssignPublicIp extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[AssignPublicIp]
    val DISABLED = "DISABLED".asInstanceOf[AssignPublicIp]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * An object representing a container instance or task attachment.
    */
  @js.native
  @Factory
  trait Attachment extends js.Object {
    var details: js.UndefOr[AttachmentDetails]
    var id: js.UndefOr[String]
    var status: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  /**
    * An object representing a change in state for a task attachment.
    */
  @js.native
  @Factory
  trait AttachmentStateChange extends js.Object {
    var attachmentArn: String
    var status: String
  }

  /**
    * An attribute is a name-value pair associated with an Amazon ECS object. Attributes enable you to extend the Amazon ECS data model by adding custom metadata to your resources. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes|Attributes]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait Attribute extends js.Object {
    var name: String
    var targetId: js.UndefOr[String]
    var targetType: js.UndefOr[TargetType]
    var value: js.UndefOr[String]
  }

  /**
    * The details of the Auto Scaling group for the capacity provider.
    */
  @js.native
  @Factory
  trait AutoScalingGroupProvider extends js.Object {
    var autoScalingGroupArn: String
    var managedScaling: js.UndefOr[ManagedScaling]
    var managedTerminationProtection: js.UndefOr[ManagedTerminationProtection]
  }

  /**
    * An object representing the networking details for a task or service.
    */
  @js.native
  @Factory
  trait AwsVpcConfiguration extends js.Object {
    var subnets: StringList
    var assignPublicIp: js.UndefOr[AssignPublicIp]
    var securityGroups: js.UndefOr[StringList]
  }

  /**
    * The details of a capacity provider.
    */
  @js.native
  @Factory
  trait CapacityProvider extends js.Object {
    var autoScalingGroupProvider: js.UndefOr[AutoScalingGroupProvider]
    var capacityProviderArn: js.UndefOr[String]
    var name: js.UndefOr[String]
    var status: js.UndefOr[CapacityProviderStatus]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  sealed trait CapacityProviderField extends js.Any
  object CapacityProviderField extends js.Object {
    val TAGS = "TAGS".asInstanceOf[CapacityProviderField]

    val values = js.Object.freeze(js.Array(TAGS))
  }

  @js.native
  sealed trait CapacityProviderStatus extends js.Any
  object CapacityProviderStatus extends js.Object {
    val ACTIVE = "ACTIVE".asInstanceOf[CapacityProviderStatus]

    val values = js.Object.freeze(js.Array(ACTIVE))
  }

  /**
    * The details of a capacity provider strategy.
    */
  @js.native
  @Factory
  trait CapacityProviderStrategyItem extends js.Object {
    var capacityProvider: String
    var base: js.UndefOr[CapacityProviderStrategyItemBase]
    var weight: js.UndefOr[CapacityProviderStrategyItemWeight]
  }

  /**
    * A regional grouping of one or more container instances on which you can run task requests. Each account receives a default cluster the first time you use the Amazon ECS service, but you may also create other clusters. Clusters may contain more than one instance type simultaneously.
    */
  @js.native
  @Factory
  trait Cluster extends js.Object {
    var activeServicesCount: js.UndefOr[Int]
    var attachments: js.UndefOr[Attachments]
    var attachmentsStatus: js.UndefOr[String]
    var capacityProviders: js.UndefOr[StringList]
    var clusterArn: js.UndefOr[String]
    var clusterName: js.UndefOr[String]
    var defaultCapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
    var pendingTasksCount: js.UndefOr[Int]
    var registeredContainerInstancesCount: js.UndefOr[Int]
    var runningTasksCount: js.UndefOr[Int]
    var settings: js.UndefOr[ClusterSettings]
    var statistics: js.UndefOr[Statistics]
    var status: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  sealed trait ClusterField extends js.Any
  object ClusterField extends js.Object {
    val ATTACHMENTS = "ATTACHMENTS".asInstanceOf[ClusterField]
    val SETTINGS    = "SETTINGS".asInstanceOf[ClusterField]
    val STATISTICS  = "STATISTICS".asInstanceOf[ClusterField]
    val TAGS        = "TAGS".asInstanceOf[ClusterField]

    val values = js.Object.freeze(js.Array(ATTACHMENTS, SETTINGS, STATISTICS, TAGS))
  }

  /**
    * The settings to use when creating a cluster. This parameter is used to enable CloudWatch Container Insights for a cluster.
    */
  @js.native
  @Factory
  trait ClusterSetting extends js.Object {
    var name: js.UndefOr[ClusterSettingName]
    var value: js.UndefOr[String]
  }

  @js.native
  sealed trait ClusterSettingName extends js.Any
  object ClusterSettingName extends js.Object {
    val containerInsights = "containerInsights".asInstanceOf[ClusterSettingName]

    val values = js.Object.freeze(js.Array(containerInsights))
  }

  @js.native
  sealed trait Compatibility extends js.Any
  object Compatibility extends js.Object {
    val EC2     = "EC2".asInstanceOf[Compatibility]
    val FARGATE = "FARGATE".asInstanceOf[Compatibility]

    val values = js.Object.freeze(js.Array(EC2, FARGATE))
  }

  @js.native
  sealed trait Connectivity extends js.Any
  object Connectivity extends js.Object {
    val CONNECTED    = "CONNECTED".asInstanceOf[Connectivity]
    val DISCONNECTED = "DISCONNECTED".asInstanceOf[Connectivity]

    val values = js.Object.freeze(js.Array(CONNECTED, DISCONNECTED))
  }

  /**
    * A Docker container that is part of a task.
    */
  @js.native
  @Factory
  trait Container extends js.Object {
    var containerArn: js.UndefOr[String]
    var cpu: js.UndefOr[String]
    var exitCode: js.UndefOr[BoxedInteger]
    var gpuIds: js.UndefOr[GpuIds]
    var healthStatus: js.UndefOr[HealthStatus]
    var image: js.UndefOr[String]
    var imageDigest: js.UndefOr[String]
    var lastStatus: js.UndefOr[String]
    var memory: js.UndefOr[String]
    var memoryReservation: js.UndefOr[String]
    var name: js.UndefOr[String]
    var networkBindings: js.UndefOr[NetworkBindings]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var reason: js.UndefOr[String]
    var runtimeId: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
  }

  @js.native
  sealed trait ContainerCondition extends js.Any
  object ContainerCondition extends js.Object {
    val START    = "START".asInstanceOf[ContainerCondition]
    val COMPLETE = "COMPLETE".asInstanceOf[ContainerCondition]
    val SUCCESS  = "SUCCESS".asInstanceOf[ContainerCondition]
    val HEALTHY  = "HEALTHY".asInstanceOf[ContainerCondition]

    val values = js.Object.freeze(js.Array(START, COMPLETE, SUCCESS, HEALTHY))
  }

  /**
    * Container definitions are used in task definitions to describe the different containers that are launched as part of a task.
    */
  @js.native
  @Factory
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
    var firelensConfiguration: js.UndefOr[FirelensConfiguration]
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

  /**
    * The dependencies defined for container startup and shutdown. A container can contain multiple dependencies. When a dependency is defined for container startup, for container shutdown it is reversed.
    *  Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable container dependencies. However, we recommend using the latest container agent version. For information about checking your agent version and updating to the latest version, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html|Updating the Amazon ECS Container Agent]] in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code> or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html|Amazon ECS-optimized Linux AMI]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    *
    * '''Note:'''For tasks using the Fargate launch type, this parameter requires that the task or service uses platform version 1.3.0 or later.
    */
  @js.native
  @Factory
  trait ContainerDependency extends js.Object {
    var condition: ContainerCondition
    var containerName: String
  }

  /**
    * An EC2 instance that is running the Amazon ECS agent and has been registered with a cluster.
    */
  @js.native
  @Factory
  trait ContainerInstance extends js.Object {
    var agentConnected: js.UndefOr[Boolean]
    var agentUpdateStatus: js.UndefOr[AgentUpdateStatus]
    var attachments: js.UndefOr[Attachments]
    var attributes: js.UndefOr[Attributes]
    var capacityProviderName: js.UndefOr[String]
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

  @js.native
  sealed trait ContainerInstanceField extends js.Any
  object ContainerInstanceField extends js.Object {
    val TAGS = "TAGS".asInstanceOf[ContainerInstanceField]

    val values = js.Object.freeze(js.Array(TAGS))
  }

  @js.native
  sealed trait ContainerInstanceStatus extends js.Any
  object ContainerInstanceStatus extends js.Object {
    val ACTIVE              = "ACTIVE".asInstanceOf[ContainerInstanceStatus]
    val DRAINING            = "DRAINING".asInstanceOf[ContainerInstanceStatus]
    val REGISTERING         = "REGISTERING".asInstanceOf[ContainerInstanceStatus]
    val DEREGISTERING       = "DEREGISTERING".asInstanceOf[ContainerInstanceStatus]
    val REGISTRATION_FAILED = "REGISTRATION_FAILED".asInstanceOf[ContainerInstanceStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, DRAINING, REGISTERING, DEREGISTERING, REGISTRATION_FAILED))
  }

  /**
    * The overrides that should be sent to a container. An empty container override can be passed in. An example of an empty container override would be <code>{"containerOverrides": [ ] }</code>. If a non-empty container override is specified, the <code>name</code> parameter must be included.
    */
  @js.native
  @Factory
  trait ContainerOverride extends js.Object {
    var command: js.UndefOr[StringList]
    var cpu: js.UndefOr[BoxedInteger]
    var environment: js.UndefOr[EnvironmentVariables]
    var memory: js.UndefOr[BoxedInteger]
    var memoryReservation: js.UndefOr[BoxedInteger]
    var name: js.UndefOr[String]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
  }

  /**
    * An object representing a change in state for a container.
    */
  @js.native
  @Factory
  trait ContainerStateChange extends js.Object {
    var containerName: js.UndefOr[String]
    var exitCode: js.UndefOr[BoxedInteger]
    var imageDigest: js.UndefOr[String]
    var networkBindings: js.UndefOr[NetworkBindings]
    var reason: js.UndefOr[String]
    var runtimeId: js.UndefOr[String]
    var status: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateCapacityProviderRequest extends js.Object {
    var autoScalingGroupProvider: AutoScalingGroupProvider
    var name: String
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateCapacityProviderResponse extends js.Object {
    var capacityProvider: js.UndefOr[CapacityProvider]
  }

  @js.native
  @Factory
  trait CreateClusterRequest extends js.Object {
    var capacityProviders: js.UndefOr[StringList]
    var clusterName: js.UndefOr[String]
    var defaultCapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
    var settings: js.UndefOr[ClusterSettings]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait CreateServiceRequest extends js.Object {
    var serviceName: String
    var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
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

  @js.native
  @Factory
  trait CreateServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  @js.native
  @Factory
  trait CreateTaskSetRequest extends js.Object {
    var cluster: String
    var service: String
    var taskDefinition: String
    var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
    var clientToken: js.UndefOr[String]
    var externalId: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var loadBalancers: js.UndefOr[LoadBalancers]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var platformVersion: js.UndefOr[String]
    var scale: js.UndefOr[Scale]
    var serviceRegistries: js.UndefOr[ServiceRegistries]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateTaskSetResponse extends js.Object {
    var taskSet: js.UndefOr[TaskSet]
  }

  @js.native
  @Factory
  trait DeleteAccountSettingRequest extends js.Object {
    var name: SettingName
    var principalArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteAccountSettingResponse extends js.Object {
    var setting: js.UndefOr[Setting]
  }

  @js.native
  @Factory
  trait DeleteAttributesRequest extends js.Object {
    var attributes: Attributes
    var cluster: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteAttributesResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
  }

  @js.native
  @Factory
  trait DeleteClusterRequest extends js.Object {
    var cluster: String
  }

  @js.native
  @Factory
  trait DeleteClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait DeleteServiceRequest extends js.Object {
    var service: String
    var cluster: js.UndefOr[String]
    var force: js.UndefOr[BoxedBoolean]
  }

  @js.native
  @Factory
  trait DeleteServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  @js.native
  @Factory
  trait DeleteTaskSetRequest extends js.Object {
    var cluster: String
    var service: String
    var taskSet: String
    var force: js.UndefOr[BoxedBoolean]
  }

  @js.native
  @Factory
  trait DeleteTaskSetResponse extends js.Object {
    var taskSet: js.UndefOr[TaskSet]
  }

  /**
    * The details of an Amazon ECS service deployment. This is used only when a service uses the <code>ECS</code> deployment controller type.
    */
  @js.native
  @Factory
  trait Deployment extends js.Object {
    var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
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

  /**
    * Optional deployment parameters that control how many tasks run during a deployment and the ordering of stopping and starting tasks.
    */
  @js.native
  @Factory
  trait DeploymentConfiguration extends js.Object {
    var maximumPercent: js.UndefOr[BoxedInteger]
    var minimumHealthyPercent: js.UndefOr[BoxedInteger]
  }

  /**
    * The deployment controller to use for the service. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html|Amazon ECS Deployment Types]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait DeploymentController extends js.Object {
    var `type`: DeploymentControllerType
  }

  @js.native
  sealed trait DeploymentControllerType extends js.Any
  object DeploymentControllerType extends js.Object {
    val ECS         = "ECS".asInstanceOf[DeploymentControllerType]
    val CODE_DEPLOY = "CODE_DEPLOY".asInstanceOf[DeploymentControllerType]
    val EXTERNAL    = "EXTERNAL".asInstanceOf[DeploymentControllerType]

    val values = js.Object.freeze(js.Array(ECS, CODE_DEPLOY, EXTERNAL))
  }

  @js.native
  @Factory
  trait DeregisterContainerInstanceRequest extends js.Object {
    var containerInstance: String
    var cluster: js.UndefOr[String]
    var force: js.UndefOr[BoxedBoolean]
  }

  @js.native
  @Factory
  trait DeregisterContainerInstanceResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  @js.native
  @Factory
  trait DeregisterTaskDefinitionRequest extends js.Object {
    var taskDefinition: String
  }

  @js.native
  @Factory
  trait DeregisterTaskDefinitionResponse extends js.Object {
    var taskDefinition: js.UndefOr[TaskDefinition]
  }

  @js.native
  @Factory
  trait DescribeCapacityProvidersRequest extends js.Object {
    var capacityProviders: js.UndefOr[StringList]
    var include: js.UndefOr[CapacityProviderFieldList]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeCapacityProvidersResponse extends js.Object {
    var capacityProviders: js.UndefOr[CapacityProviders]
    var failures: js.UndefOr[Failures]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeClustersRequest extends js.Object {
    var clusters: js.UndefOr[StringList]
    var include: js.UndefOr[ClusterFieldList]
  }

  @js.native
  @Factory
  trait DescribeClustersResponse extends js.Object {
    var clusters: js.UndefOr[Clusters]
    var failures: js.UndefOr[Failures]
  }

  @js.native
  @Factory
  trait DescribeContainerInstancesRequest extends js.Object {
    var containerInstances: StringList
    var cluster: js.UndefOr[String]
    var include: js.UndefOr[ContainerInstanceFieldList]
  }

  @js.native
  @Factory
  trait DescribeContainerInstancesResponse extends js.Object {
    var containerInstances: js.UndefOr[ContainerInstances]
    var failures: js.UndefOr[Failures]
  }

  @js.native
  @Factory
  trait DescribeServicesRequest extends js.Object {
    var services: StringList
    var cluster: js.UndefOr[String]
    var include: js.UndefOr[ServiceFieldList]
  }

  @js.native
  @Factory
  trait DescribeServicesResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var services: js.UndefOr[Services]
  }

  @js.native
  @Factory
  trait DescribeTaskDefinitionRequest extends js.Object {
    var taskDefinition: String
    var include: js.UndefOr[TaskDefinitionFieldList]
  }

  @js.native
  @Factory
  trait DescribeTaskDefinitionResponse extends js.Object {
    var tags: js.UndefOr[Tags]
    var taskDefinition: js.UndefOr[TaskDefinition]
  }

  @js.native
  @Factory
  trait DescribeTaskSetsRequest extends js.Object {
    var cluster: String
    var service: String
    var include: js.UndefOr[TaskSetFieldList]
    var taskSets: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait DescribeTaskSetsResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var taskSets: js.UndefOr[TaskSets]
  }

  @js.native
  @Factory
  trait DescribeTasksRequest extends js.Object {
    var tasks: StringList
    var cluster: js.UndefOr[String]
    var include: js.UndefOr[TaskFieldList]
  }

  @js.native
  @Factory
  trait DescribeTasksResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var tasks: js.UndefOr[Tasks]
  }

  @js.native
  sealed trait DesiredStatus extends js.Any
  object DesiredStatus extends js.Object {
    val RUNNING = "RUNNING".asInstanceOf[DesiredStatus]
    val PENDING = "PENDING".asInstanceOf[DesiredStatus]
    val STOPPED = "STOPPED".asInstanceOf[DesiredStatus]

    val values = js.Object.freeze(js.Array(RUNNING, PENDING, STOPPED))
  }

  /**
    * An object representing a container instance host device.
    */
  @js.native
  @Factory
  trait Device extends js.Object {
    var hostPath: String
    var containerPath: js.UndefOr[String]
    var permissions: js.UndefOr[DeviceCgroupPermissions]
  }

  @js.native
  sealed trait DeviceCgroupPermission extends js.Any
  object DeviceCgroupPermission extends js.Object {
    val read  = "read".asInstanceOf[DeviceCgroupPermission]
    val write = "write".asInstanceOf[DeviceCgroupPermission]
    val mknod = "mknod".asInstanceOf[DeviceCgroupPermission]

    val values = js.Object.freeze(js.Array(read, write, mknod))
  }

  @js.native
  @Factory
  trait DiscoverPollEndpointRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var containerInstance: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DiscoverPollEndpointResponse extends js.Object {
    var endpoint: js.UndefOr[String]
    var telemetryEndpoint: js.UndefOr[String]
  }

  /**
    * This parameter is specified when you are using Docker volumes. Docker volumes are only supported when you are using the EC2 launch type. Windows containers only support the use of the <code>local</code> driver. To use bind mounts, specify a <code>host</code> instead.
    */
  @js.native
  @Factory
  trait DockerVolumeConfiguration extends js.Object {
    var autoprovision: js.UndefOr[BoxedBoolean]
    var driver: js.UndefOr[String]
    var driverOpts: js.UndefOr[StringMap]
    var labels: js.UndefOr[StringMap]
    var scope: js.UndefOr[Scope]
  }

  /**
    * This parameter is specified when you are using an Amazon Elastic File System (Amazon EFS) file storage. Amazon EFS file systems are only supported when you are using the EC2 launch type.
    *  <important> <code>EFSVolumeConfiguration</code> remains in preview and is a Beta Service as defined by and subject to the Beta Service Participation Service Terms located at [[https://aws.amazon.com/service-terms|https://aws.amazon.com/service-terms]] ("Beta Terms"). These Beta Terms apply to your participation in this preview of <code>EFSVolumeConfiguration</code>.
    *  </important>
    */
  @js.native
  @Factory
  trait EFSVolumeConfiguration extends js.Object {
    var fileSystemId: String
    var rootDirectory: js.UndefOr[String]
  }

  /**
    * A failed resource.
    */
  @js.native
  @Factory
  trait Failure extends js.Object {
    var arn: js.UndefOr[String]
    var detail: js.UndefOr[String]
    var reason: js.UndefOr[String]
  }

  /**
    * The FireLens configuration for the container. This is used to specify and configure a log router for container logs. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html|Custom Log Routing]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait FirelensConfiguration extends js.Object {
    var `type`: FirelensConfigurationType
    var options: js.UndefOr[FirelensConfigurationOptionsMap]
  }

  @js.native
  sealed trait FirelensConfigurationType extends js.Any
  object FirelensConfigurationType extends js.Object {
    val fluentd   = "fluentd".asInstanceOf[FirelensConfigurationType]
    val fluentbit = "fluentbit".asInstanceOf[FirelensConfigurationType]

    val values = js.Object.freeze(js.Array(fluentd, fluentbit))
  }

  /**
    * An object representing a container health check. Health check parameters that are specified in a container definition override any Docker health checks that exist in the container image (such as those specified in a parent image or from the image's Dockerfile).
    *  The following are notes about container health check support:
    * * Container health checks require version 1.17.0 or greater of the Amazon ECS container agent. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html|Updating the Amazon ECS Container Agent]].
    *  * Container health checks are supported for Fargate tasks if you are using platform version 1.1.0 or greater. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html|AWS Fargate Platform Versions]].
    *  * Container health checks are not supported for tasks that are part of a service that is configured to use a Classic Load Balancer.
    */
  @js.native
  @Factory
  trait HealthCheck extends js.Object {
    var command: StringList
    var interval: js.UndefOr[BoxedInteger]
    var retries: js.UndefOr[BoxedInteger]
    var startPeriod: js.UndefOr[BoxedInteger]
    var timeout: js.UndefOr[BoxedInteger]
  }

  @js.native
  sealed trait HealthStatus extends js.Any
  object HealthStatus extends js.Object {
    val HEALTHY   = "HEALTHY".asInstanceOf[HealthStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatus]
    val UNKNOWN   = "UNKNOWN".asInstanceOf[HealthStatus]

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, UNKNOWN))
  }

  /**
    * Hostnames and IP address entries that are added to the <code>/etc/hosts</code> file of a container via the <code>extraHosts</code> parameter of its <a>ContainerDefinition</a>.
    */
  @js.native
  @Factory
  trait HostEntry extends js.Object {
    var hostname: String
    var ipAddress: String
  }

  /**
    * Details on a container instance bind mount host volume.
    */
  @js.native
  @Factory
  trait HostVolumeProperties extends js.Object {
    var sourcePath: js.UndefOr[String]
  }

  /**
    * Details on a Elastic Inference accelerator. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-eia.html|Working with Amazon Elastic Inference on Amazon ECS]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait InferenceAccelerator extends js.Object {
    var deviceName: String
    var deviceType: String
  }

  /**
    * Details on an Elastic Inference accelerator task override. This parameter is used to override the Elastic Inference accelerator specified in the task definition. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-eia.html|Working with Amazon Elastic Inference on Amazon ECS]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait InferenceAcceleratorOverride extends js.Object {
    var deviceName: js.UndefOr[String]
    var deviceType: js.UndefOr[String]
  }

  @js.native
  sealed trait IpcMode extends js.Any
  object IpcMode extends js.Object {
    val host = "host".asInstanceOf[IpcMode]
    val task = "task".asInstanceOf[IpcMode]
    val none = "none".asInstanceOf[IpcMode]

    val values = js.Object.freeze(js.Array(host, task, none))
  }

  /**
    * The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker. For more information on the default capabilities and the non-default available capabilities, see [[https://docs.docker.com/engine/reference/run/#runtime-privilege-and-linux-capabilities|Runtime privilege and Linux capabilities]] in the <i>Docker run reference</i>. For more detailed information on these Linux capabilities, see the [[http://man7.org/linux/man-pages/man7/capabilities.7.html|capabilities(7)]] Linux manual page.
    */
  @js.native
  @Factory
  trait KernelCapabilities extends js.Object {
    var add: js.UndefOr[StringList]
    var drop: js.UndefOr[StringList]
  }

  /**
    * A key-value pair object.
    */
  @js.native
  @Factory
  trait KeyValuePair extends js.Object {
    var name: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  @js.native
  sealed trait LaunchType extends js.Any
  object LaunchType extends js.Object {
    val EC2     = "EC2".asInstanceOf[LaunchType]
    val FARGATE = "FARGATE".asInstanceOf[LaunchType]

    val values = js.Object.freeze(js.Array(EC2, FARGATE))
  }

  /**
    * Linux-specific options that are applied to the container, such as Linux <a>KernelCapabilities</a>.
    */
  @js.native
  @Factory
  trait LinuxParameters extends js.Object {
    var capabilities: js.UndefOr[KernelCapabilities]
    var devices: js.UndefOr[DevicesList]
    var initProcessEnabled: js.UndefOr[BoxedBoolean]
    var maxSwap: js.UndefOr[BoxedInteger]
    var sharedMemorySize: js.UndefOr[BoxedInteger]
    var swappiness: js.UndefOr[BoxedInteger]
    var tmpfs: js.UndefOr[TmpfsList]
  }

  @js.native
  @Factory
  trait ListAccountSettingsRequest extends js.Object {
    var effectiveSettings: js.UndefOr[Boolean]
    var maxResults: js.UndefOr[Int]
    var name: js.UndefOr[SettingName]
    var nextToken: js.UndefOr[String]
    var principalArn: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAccountSettingsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var settings: js.UndefOr[Settings]
  }

  @js.native
  @Factory
  trait ListAttributesRequest extends js.Object {
    var targetType: TargetType
    var attributeName: js.UndefOr[String]
    var attributeValue: js.UndefOr[String]
    var cluster: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAttributesResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListClustersRequest extends js.Object {
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListClustersResponse extends js.Object {
    var clusterArns: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListContainerInstancesRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var filter: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[ContainerInstanceStatus]
  }

  @js.native
  @Factory
  trait ListContainerInstancesResponse extends js.Object {
    var containerInstanceArns: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListServicesRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var schedulingStrategy: js.UndefOr[SchedulingStrategy]
  }

  @js.native
  @Factory
  trait ListServicesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var serviceArns: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait ListTaskDefinitionFamiliesRequest extends js.Object {
    var familyPrefix: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[TaskDefinitionFamilyStatus]
  }

  @js.native
  @Factory
  trait ListTaskDefinitionFamiliesResponse extends js.Object {
    var families: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTaskDefinitionsRequest extends js.Object {
    var familyPrefix: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var sort: js.UndefOr[SortOrder]
    var status: js.UndefOr[TaskDefinitionStatus]
  }

  @js.native
  @Factory
  trait ListTaskDefinitionsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var taskDefinitionArns: js.UndefOr[StringList]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListTasksResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var taskArns: js.UndefOr[StringList]
  }

  /**
    * Details on the load balancer or load balancers to use with a service or task set.
    */
  @js.native
  @Factory
  trait LoadBalancer extends js.Object {
    var containerName: js.UndefOr[String]
    var containerPort: js.UndefOr[BoxedInteger]
    var loadBalancerName: js.UndefOr[String]
    var targetGroupArn: js.UndefOr[String]
  }

  /**
    * The log configuration specification for the container.
    *  This parameter maps to <code>LogConfig</code> in the [[https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate|Create a container]] section of the [[https://docs.docker.com/engine/api/v1.35/|Docker Remote API]] and the <code>--log-driver</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/"> <code>docker run</code> </a>. By default, containers use the same logging driver that the Docker daemon uses; however the container may use a different logging driver than the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different logging driver for a container, the log system must be configured properly on the container instance (or on a different log server for remote logging options). For more information on the options for different supported log drivers, see [[https://docs.docker.com/engine/admin/logging/overview/|Configure logging drivers]] in the Docker documentation.
    *  The following should be noted when specifying a log configuration for your containers:
    * * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the valid values below). Additional log drivers may be available in future releases of the Amazon ECS container agent.
    *  * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance.
    *  * For tasks using the EC2 launch type, the Amazon ECS container agent running on a container instance must register the logging drivers available on that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed on that instance can use these log configuration options. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html|Amazon ECS Container Agent Configuration]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    *  * For tasks using the Fargate launch type, because you do not have access to the underlying infrastructure your tasks are hosted on, any additional software needed will have to be installed outside of the task. For example, the Fluentd output aggregators or a remote host running Logstash to send Gelf logs to.
    */
  @js.native
  @Factory
  trait LogConfiguration extends js.Object {
    var logDriver: LogDriver
    var options: js.UndefOr[LogConfigurationOptionsMap]
    var secretOptions: js.UndefOr[SecretList]
  }

  @js.native
  sealed trait LogDriver extends js.Any
  object LogDriver extends js.Object {
    val `json-file` = "json-file".asInstanceOf[LogDriver]
    val syslog      = "syslog".asInstanceOf[LogDriver]
    val journald    = "journald".asInstanceOf[LogDriver]
    val gelf        = "gelf".asInstanceOf[LogDriver]
    val fluentd     = "fluentd".asInstanceOf[LogDriver]
    val awslogs     = "awslogs".asInstanceOf[LogDriver]
    val splunk      = "splunk".asInstanceOf[LogDriver]
    val awsfirelens = "awsfirelens".asInstanceOf[LogDriver]

    val values = js.Object.freeze(js.Array(`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk, awsfirelens))
  }

  /**
    * The managed scaling settings for the Auto Scaling group capacity provider.
    *  When managed scaling is enabled, Amazon ECS manages the scale-in and scale-out actions of the Auto Scaling group. Amazon ECS manages a target tracking scaling policy using an Amazon ECS-managed CloudWatch metric with the specified <code>targetCapacity</code> value as the target value for the metric. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/asg-capacity-providers.html#asg-capacity-providers-managed-scaling|Using Managed Scaling]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    *  If managed scaling is disabled, the user must manage the scaling of the Auto Scaling group.
    */
  @js.native
  @Factory
  trait ManagedScaling extends js.Object {
    var maximumScalingStepSize: js.UndefOr[ManagedScalingStepSize]
    var minimumScalingStepSize: js.UndefOr[ManagedScalingStepSize]
    var status: js.UndefOr[ManagedScalingStatus]
    var targetCapacity: js.UndefOr[ManagedScalingTargetCapacity]
  }

  @js.native
  sealed trait ManagedScalingStatus extends js.Any
  object ManagedScalingStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[ManagedScalingStatus]
    val DISABLED = "DISABLED".asInstanceOf[ManagedScalingStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait ManagedTerminationProtection extends js.Any
  object ManagedTerminationProtection extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[ManagedTerminationProtection]
    val DISABLED = "DISABLED".asInstanceOf[ManagedTerminationProtection]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Details on a volume mount point that is used in a container definition.
    */
  @js.native
  @Factory
  trait MountPoint extends js.Object {
    var containerPath: js.UndefOr[String]
    var readOnly: js.UndefOr[BoxedBoolean]
    var sourceVolume: js.UndefOr[String]
  }

  /**
    * Details on the network bindings between a container and its host container instance. After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
    */
  @js.native
  @Factory
  trait NetworkBinding extends js.Object {
    var bindIP: js.UndefOr[String]
    var containerPort: js.UndefOr[BoxedInteger]
    var hostPort: js.UndefOr[BoxedInteger]
    var protocol: js.UndefOr[TransportProtocol]
  }

  /**
    * An object representing the network configuration for a task or service.
    */
  @js.native
  @Factory
  trait NetworkConfiguration extends js.Object {
    var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration]
  }

  /**
    * An object representing the elastic network interface for tasks that use the <code>awsvpc</code> network mode.
    */
  @js.native
  @Factory
  trait NetworkInterface extends js.Object {
    var attachmentId: js.UndefOr[String]
    var ipv6Address: js.UndefOr[String]
    var privateIpv4Address: js.UndefOr[String]
  }

  @js.native
  sealed trait NetworkMode extends js.Any
  object NetworkMode extends js.Object {
    val bridge = "bridge".asInstanceOf[NetworkMode]
    val host   = "host".asInstanceOf[NetworkMode]
    val awsvpc = "awsvpc".asInstanceOf[NetworkMode]
    val none   = "none".asInstanceOf[NetworkMode]

    val values = js.Object.freeze(js.Array(bridge, host, awsvpc, none))
  }

  @js.native
  sealed trait PidMode extends js.Any
  object PidMode extends js.Object {
    val host = "host".asInstanceOf[PidMode]
    val task = "task".asInstanceOf[PidMode]

    val values = js.Object.freeze(js.Array(host, task))
  }

  /**
    * An object representing a constraint on task placement. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html|Task Placement Constraints]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    *
    * '''Note:'''If you are using the Fargate launch type, task placement constraints are not supported.
    */
  @js.native
  @Factory
  trait PlacementConstraint extends js.Object {
    var expression: js.UndefOr[String]
    var `type`: js.UndefOr[PlacementConstraintType]
  }

  @js.native
  sealed trait PlacementConstraintType extends js.Any
  object PlacementConstraintType extends js.Object {
    val distinctInstance = "distinctInstance".asInstanceOf[PlacementConstraintType]
    val memberOf         = "memberOf".asInstanceOf[PlacementConstraintType]

    val values = js.Object.freeze(js.Array(distinctInstance, memberOf))
  }

  /**
    * The task placement strategy for a task or service. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html|Task Placement Strategies]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait PlacementStrategy extends js.Object {
    var field: js.UndefOr[String]
    var `type`: js.UndefOr[PlacementStrategyType]
  }

  @js.native
  sealed trait PlacementStrategyType extends js.Any
  object PlacementStrategyType extends js.Object {
    val random  = "random".asInstanceOf[PlacementStrategyType]
    val spread  = "spread".asInstanceOf[PlacementStrategyType]
    val binpack = "binpack".asInstanceOf[PlacementStrategyType]

    val values = js.Object.freeze(js.Array(random, spread, binpack))
  }

  /**
    * The devices that are available on the container instance. The only supported device type is a GPU.
    */
  @js.native
  @Factory
  trait PlatformDevice extends js.Object {
    var id: String
    var `type`: PlatformDeviceType
  }

  @js.native
  sealed trait PlatformDeviceType extends js.Any
  object PlatformDeviceType extends js.Object {
    val GPU = "GPU".asInstanceOf[PlatformDeviceType]

    val values = js.Object.freeze(js.Array(GPU))
  }

  /**
    * Port mappings allow containers to access ports on the host container instance to send or receive traffic. Port mappings are specified as part of the container definition.
    *  If you are using containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, exposed ports should be specified using <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as the <code>containerPort</code>.
    *  After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
    */
  @js.native
  @Factory
  trait PortMapping extends js.Object {
    var containerPort: js.UndefOr[BoxedInteger]
    var hostPort: js.UndefOr[BoxedInteger]
    var protocol: js.UndefOr[TransportProtocol]
  }

  @js.native
  sealed trait PropagateTags extends js.Any
  object PropagateTags extends js.Object {
    val TASK_DEFINITION = "TASK_DEFINITION".asInstanceOf[PropagateTags]
    val SERVICE         = "SERVICE".asInstanceOf[PropagateTags]

    val values = js.Object.freeze(js.Array(TASK_DEFINITION, SERVICE))
  }

  /**
    * The configuration details for the App Mesh proxy.
    *  For tasks using the EC2 launch type, the container instances require at least version 1.26.0 of the container agent and at least version 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container instances are launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html|Amazon ECS-optimized Linux AMI]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    *  For tasks using the Fargate launch type, the task or service requires platform version 1.3.0 or later.
    */
  @js.native
  @Factory
  trait ProxyConfiguration extends js.Object {
    var containerName: String
    var properties: js.UndefOr[ProxyConfigurationProperties]
    var `type`: js.UndefOr[ProxyConfigurationType]
  }

  @js.native
  sealed trait ProxyConfigurationType extends js.Any
  object ProxyConfigurationType extends js.Object {
    val APPMESH = "APPMESH".asInstanceOf[ProxyConfigurationType]

    val values = js.Object.freeze(js.Array(APPMESH))
  }

  @js.native
  @Factory
  trait PutAccountSettingDefaultRequest extends js.Object {
    var name: SettingName
    var value: String
  }

  @js.native
  @Factory
  trait PutAccountSettingDefaultResponse extends js.Object {
    var setting: js.UndefOr[Setting]
  }

  @js.native
  @Factory
  trait PutAccountSettingRequest extends js.Object {
    var name: SettingName
    var value: String
    var principalArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PutAccountSettingResponse extends js.Object {
    var setting: js.UndefOr[Setting]
  }

  @js.native
  @Factory
  trait PutAttributesRequest extends js.Object {
    var attributes: Attributes
    var cluster: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PutAttributesResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
  }

  @js.native
  @Factory
  trait PutClusterCapacityProvidersRequest extends js.Object {
    var capacityProviders: StringList
    var cluster: String
    var defaultCapacityProviderStrategy: CapacityProviderStrategy
  }

  @js.native
  @Factory
  trait PutClusterCapacityProvidersResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait RegisterContainerInstanceResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  @js.native
  @Factory
  trait RegisterTaskDefinitionRequest extends js.Object {
    var containerDefinitions: ContainerDefinitions
    var family: String
    var cpu: js.UndefOr[String]
    var executionRoleArn: js.UndefOr[String]
    var inferenceAccelerators: js.UndefOr[InferenceAccelerators]
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

  @js.native
  @Factory
  trait RegisterTaskDefinitionResponse extends js.Object {
    var tags: js.UndefOr[Tags]
    var taskDefinition: js.UndefOr[TaskDefinition]
  }

  /**
    * The repository credentials for private registry authentication.
    */
  @js.native
  @Factory
  trait RepositoryCredentials extends js.Object {
    var credentialsParameter: String
  }

  /**
    * Describes the resources available for a container instance.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var doubleValue: js.UndefOr[Double]
    var integerValue: js.UndefOr[Int]
    var longValue: js.UndefOr[Double]
    var name: js.UndefOr[String]
    var stringSetValue: js.UndefOr[StringList]
    var `type`: js.UndefOr[String]
  }

  /**
    * The type and amount of a resource to assign to a container. The supported resource types are GPUs and Elastic Inference accelerators. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html|Working with GPUs on Amazon ECS]] or [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-eia.html|Working with Amazon Elastic Inference on Amazon ECS]] in the <i>Amazon Elastic Container Service Developer Guide</i>
    */
  @js.native
  @Factory
  trait ResourceRequirement extends js.Object {
    var `type`: ResourceType
    var value: String
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val GPU                  = "GPU".asInstanceOf[ResourceType]
    val InferenceAccelerator = "InferenceAccelerator".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(GPU, InferenceAccelerator))
  }

  @js.native
  @Factory
  trait RunTaskRequest extends js.Object {
    var taskDefinition: String
    var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
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
    var referenceId: js.UndefOr[String]
    var startedBy: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait RunTaskResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var tasks: js.UndefOr[Tasks]
  }

  /**
    * A floating-point percentage of the desired number of tasks to place and keep running in the task set.
    */
  @js.native
  @Factory
  trait Scale extends js.Object {
    var unit: js.UndefOr[ScaleUnit]
    var value: js.UndefOr[Double]
  }

  @js.native
  sealed trait ScaleUnit extends js.Any
  object ScaleUnit extends js.Object {
    val PERCENT = "PERCENT".asInstanceOf[ScaleUnit]

    val values = js.Object.freeze(js.Array(PERCENT))
  }

  @js.native
  sealed trait SchedulingStrategy extends js.Any
  object SchedulingStrategy extends js.Object {
    val REPLICA = "REPLICA".asInstanceOf[SchedulingStrategy]
    val DAEMON  = "DAEMON".asInstanceOf[SchedulingStrategy]

    val values = js.Object.freeze(js.Array(REPLICA, DAEMON))
  }

  @js.native
  sealed trait Scope extends js.Any
  object Scope extends js.Object {
    val task   = "task".asInstanceOf[Scope]
    val shared = "shared".asInstanceOf[Scope]

    val values = js.Object.freeze(js.Array(task, shared))
  }

  /**
    * An object representing the secret to expose to your container. Secrets can be exposed to a container in the following ways:
    * * To inject sensitive data into your containers as environment variables, use the <code>secrets</code> container definition parameter.
    *  * To reference sensitive information in the log configuration of a container, use the <code>secretOptions</code> container definition parameter.
    * For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html|Specifying Sensitive Data]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait Secret extends js.Object {
    var name: String
    var valueFrom: String
  }

  /**
    * Details on a service within a cluster
    */
  @js.native
  @Factory
  trait Service extends js.Object {
    var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
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

  /**
    * Details on an event associated with a service.
    */
  @js.native
  @Factory
  trait ServiceEvent extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[String]
    var message: js.UndefOr[String]
  }

  @js.native
  sealed trait ServiceField extends js.Any
  object ServiceField extends js.Object {
    val TAGS = "TAGS".asInstanceOf[ServiceField]

    val values = js.Object.freeze(js.Array(TAGS))
  }

  /**
    * Details of the service registry.
    */
  @js.native
  @Factory
  trait ServiceRegistry extends js.Object {
    var containerName: js.UndefOr[String]
    var containerPort: js.UndefOr[BoxedInteger]
    var port: js.UndefOr[BoxedInteger]
    var registryArn: js.UndefOr[String]
  }

  /**
    * The current account setting for a resource.
    */
  @js.native
  @Factory
  trait Setting extends js.Object {
    var name: js.UndefOr[SettingName]
    var principalArn: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  @js.native
  sealed trait SettingName extends js.Any
  object SettingName extends js.Object {
    val serviceLongArnFormat           = "serviceLongArnFormat".asInstanceOf[SettingName]
    val taskLongArnFormat              = "taskLongArnFormat".asInstanceOf[SettingName]
    val containerInstanceLongArnFormat = "containerInstanceLongArnFormat".asInstanceOf[SettingName]
    val awsvpcTrunking                 = "awsvpcTrunking".asInstanceOf[SettingName]
    val containerInsights              = "containerInsights".asInstanceOf[SettingName]

    val values = js.Object.freeze(
      js.Array(
        serviceLongArnFormat,
        taskLongArnFormat,
        containerInstanceLongArnFormat,
        awsvpcTrunking,
        containerInsights
      )
    )
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val ASC  = "ASC".asInstanceOf[SortOrder]
    val DESC = "DESC".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }

  @js.native
  sealed trait StabilityStatus extends js.Any
  object StabilityStatus extends js.Object {
    val STEADY_STATE = "STEADY_STATE".asInstanceOf[StabilityStatus]
    val STABILIZING  = "STABILIZING".asInstanceOf[StabilityStatus]

    val values = js.Object.freeze(js.Array(STEADY_STATE, STABILIZING))
  }

  @js.native
  @Factory
  trait StartTaskRequest extends js.Object {
    var containerInstances: StringList
    var taskDefinition: String
    var cluster: js.UndefOr[String]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var group: js.UndefOr[String]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var overrides: js.UndefOr[TaskOverride]
    var propagateTags: js.UndefOr[PropagateTags]
    var referenceId: js.UndefOr[String]
    var startedBy: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait StartTaskResponse extends js.Object {
    var failures: js.UndefOr[Failures]
    var tasks: js.UndefOr[Tasks]
  }

  @js.native
  @Factory
  trait StopTaskRequest extends js.Object {
    var task: String
    var cluster: js.UndefOr[String]
    var reason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait StopTaskResponse extends js.Object {
    var task: js.UndefOr[Task]
  }

  @js.native
  @Factory
  trait SubmitAttachmentStateChangesRequest extends js.Object {
    var attachments: AttachmentStateChanges
    var cluster: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SubmitAttachmentStateChangesResponse extends js.Object {
    var acknowledgment: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SubmitContainerStateChangeRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var containerName: js.UndefOr[String]
    var exitCode: js.UndefOr[BoxedInteger]
    var networkBindings: js.UndefOr[NetworkBindings]
    var reason: js.UndefOr[String]
    var runtimeId: js.UndefOr[String]
    var status: js.UndefOr[String]
    var task: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SubmitContainerStateChangeResponse extends js.Object {
    var acknowledgment: js.UndefOr[String]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait SubmitTaskStateChangeResponse extends js.Object {
    var acknowledgment: js.UndefOr[String]
  }

  /**
    * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in the [[https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate|Create a container]] section of the [[https://docs.docker.com/engine/api/v1.35/|Docker Remote API]] and the <code>--sysctl</code> option to [[https://docs.docker.com/engine/reference/run/|docker run]].
    *  It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network mode for the following reasons:
    * * For tasks that use the <code>awsvpc</code> network mode, if you set <code>systemControls</code> for any container, it applies to all containers in the task. If you set different <code>systemControls</code> for multiple containers in a single task, the container that is started last determines which <code>systemControls</code> take effect.
    *  * For tasks that use the <code>host</code> network mode, the <code>systemControls</code> parameter applies to the container instance's kernel parameter as well as that of all containers of any tasks running on that container instance.
    */
  @js.native
  @Factory
  trait SystemControl extends js.Object {
    var namespace: js.UndefOr[String]
    var value: js.UndefOr[String]
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
  @Factory
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: Tags
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  sealed trait TargetType extends js.Any
  object TargetType extends js.Object {
    val `container-instance` = "container-instance".asInstanceOf[TargetType]

    val values = js.Object.freeze(js.Array(`container-instance`))
  }

  /**
    * Details on a task in a cluster.
    */
  @js.native
  @Factory
  trait Task extends js.Object {
    var attachments: js.UndefOr[Attachments]
    var attributes: js.UndefOr[Attributes]
    var availabilityZone: js.UndefOr[String]
    var capacityProviderName: js.UndefOr[String]
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
    var inferenceAccelerators: js.UndefOr[InferenceAccelerators]
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

  /**
    * The details of a task definition which describes the container and volume definitions of an Amazon Elastic Container Service task. You can specify which Docker images to use, the required resources, and other configurations related to launching the task definition through an Amazon ECS service or task.
    */
  @js.native
  @Factory
  trait TaskDefinition extends js.Object {
    var compatibilities: js.UndefOr[CompatibilityList]
    var containerDefinitions: js.UndefOr[ContainerDefinitions]
    var cpu: js.UndefOr[String]
    var executionRoleArn: js.UndefOr[String]
    var family: js.UndefOr[String]
    var inferenceAccelerators: js.UndefOr[InferenceAccelerators]
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

  @js.native
  sealed trait TaskDefinitionFamilyStatus extends js.Any
  object TaskDefinitionFamilyStatus extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[TaskDefinitionFamilyStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[TaskDefinitionFamilyStatus]
    val ALL      = "ALL".asInstanceOf[TaskDefinitionFamilyStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE, ALL))
  }

  @js.native
  sealed trait TaskDefinitionField extends js.Any
  object TaskDefinitionField extends js.Object {
    val TAGS = "TAGS".asInstanceOf[TaskDefinitionField]

    val values = js.Object.freeze(js.Array(TAGS))
  }

  /**
    * An object representing a constraint on task placement in the task definition. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html|Task Placement Constraints]] in the <i>Amazon Elastic Container Service Developer Guide</i>.
    *
    * '''Note:'''If you are using the Fargate launch type, task placement constraints are not supported.
    */
  @js.native
  @Factory
  trait TaskDefinitionPlacementConstraint extends js.Object {
    var expression: js.UndefOr[String]
    var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType]
  }

  @js.native
  sealed trait TaskDefinitionPlacementConstraintType extends js.Any
  object TaskDefinitionPlacementConstraintType extends js.Object {
    val memberOf = "memberOf".asInstanceOf[TaskDefinitionPlacementConstraintType]

    val values = js.Object.freeze(js.Array(memberOf))
  }

  @js.native
  sealed trait TaskDefinitionStatus extends js.Any
  object TaskDefinitionStatus extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[TaskDefinitionStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[TaskDefinitionStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
  }

  @js.native
  sealed trait TaskField extends js.Any
  object TaskField extends js.Object {
    val TAGS = "TAGS".asInstanceOf[TaskField]

    val values = js.Object.freeze(js.Array(TAGS))
  }

  /**
    * The overrides associated with a task.
    */
  @js.native
  @Factory
  trait TaskOverride extends js.Object {
    var containerOverrides: js.UndefOr[ContainerOverrides]
    var cpu: js.UndefOr[String]
    var executionRoleArn: js.UndefOr[String]
    var inferenceAcceleratorOverrides: js.UndefOr[InferenceAcceleratorOverrides]
    var memory: js.UndefOr[String]
    var taskRoleArn: js.UndefOr[String]
  }

  /**
    * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
    */
  @js.native
  @Factory
  trait TaskSet extends js.Object {
    var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
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
    var tags: js.UndefOr[Tags]
    var taskDefinition: js.UndefOr[String]
    var taskSetArn: js.UndefOr[String]
    var updatedAt: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait TaskSetField extends js.Any
  object TaskSetField extends js.Object {
    val TAGS = "TAGS".asInstanceOf[TaskSetField]

    val values = js.Object.freeze(js.Array(TAGS))
  }

  @js.native
  sealed trait TaskStopCode extends js.Any
  object TaskStopCode extends js.Object {
    val TaskFailedToStart        = "TaskFailedToStart".asInstanceOf[TaskStopCode]
    val EssentialContainerExited = "EssentialContainerExited".asInstanceOf[TaskStopCode]
    val UserInitiated            = "UserInitiated".asInstanceOf[TaskStopCode]

    val values = js.Object.freeze(js.Array(TaskFailedToStart, EssentialContainerExited, UserInitiated))
  }

  /**
    * The container path, mount options, and size of the tmpfs mount.
    */
  @js.native
  @Factory
  trait Tmpfs extends js.Object {
    var containerPath: String
    var size: Int
    var mountOptions: js.UndefOr[StringList]
  }

  @js.native
  sealed trait TransportProtocol extends js.Any
  object TransportProtocol extends js.Object {
    val tcp = "tcp".asInstanceOf[TransportProtocol]
    val udp = "udp".asInstanceOf[TransportProtocol]

    val values = js.Object.freeze(js.Array(tcp, udp))
  }

  /**
    * The <code>ulimit</code> settings to pass to the container.
    */
  @js.native
  @Factory
  trait Ulimit extends js.Object {
    var hardLimit: Int
    var name: UlimitName
    var softLimit: Int
  }

  @js.native
  sealed trait UlimitName extends js.Any
  object UlimitName extends js.Object {
    val core       = "core".asInstanceOf[UlimitName]
    val cpu        = "cpu".asInstanceOf[UlimitName]
    val data       = "data".asInstanceOf[UlimitName]
    val fsize      = "fsize".asInstanceOf[UlimitName]
    val locks      = "locks".asInstanceOf[UlimitName]
    val memlock    = "memlock".asInstanceOf[UlimitName]
    val msgqueue   = "msgqueue".asInstanceOf[UlimitName]
    val nice       = "nice".asInstanceOf[UlimitName]
    val nofile     = "nofile".asInstanceOf[UlimitName]
    val nproc      = "nproc".asInstanceOf[UlimitName]
    val rss        = "rss".asInstanceOf[UlimitName]
    val rtprio     = "rtprio".asInstanceOf[UlimitName]
    val rttime     = "rttime".asInstanceOf[UlimitName]
    val sigpending = "sigpending".asInstanceOf[UlimitName]
    val stack      = "stack".asInstanceOf[UlimitName]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateClusterSettingsRequest extends js.Object {
    var cluster: String
    var settings: ClusterSettings
  }

  @js.native
  @Factory
  trait UpdateClusterSettingsResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait UpdateContainerAgentRequest extends js.Object {
    var containerInstance: String
    var cluster: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateContainerAgentResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  @js.native
  @Factory
  trait UpdateContainerInstancesStateRequest extends js.Object {
    var containerInstances: StringList
    var status: ContainerInstanceStatus
    var cluster: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateContainerInstancesStateResponse extends js.Object {
    var containerInstances: js.UndefOr[ContainerInstances]
    var failures: js.UndefOr[Failures]
  }

  @js.native
  @Factory
  trait UpdateServicePrimaryTaskSetRequest extends js.Object {
    var cluster: String
    var primaryTaskSet: String
    var service: String
  }

  @js.native
  @Factory
  trait UpdateServicePrimaryTaskSetResponse extends js.Object {
    var taskSet: js.UndefOr[TaskSet]
  }

  @js.native
  @Factory
  trait UpdateServiceRequest extends js.Object {
    var service: String
    var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy]
    var cluster: js.UndefOr[String]
    var deploymentConfiguration: js.UndefOr[DeploymentConfiguration]
    var desiredCount: js.UndefOr[BoxedInteger]
    var forceNewDeployment: js.UndefOr[Boolean]
    var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var platformVersion: js.UndefOr[String]
    var taskDefinition: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  @js.native
  @Factory
  trait UpdateTaskSetRequest extends js.Object {
    var cluster: String
    var scale: Scale
    var service: String
    var taskSet: String
  }

  @js.native
  @Factory
  trait UpdateTaskSetResponse extends js.Object {
    var taskSet: js.UndefOr[TaskSet]
  }

  /**
    * The Docker and Amazon ECS container agent version information about a container instance.
    */
  @js.native
  @Factory
  trait VersionInfo extends js.Object {
    var agentHash: js.UndefOr[String]
    var agentVersion: js.UndefOr[String]
    var dockerVersion: js.UndefOr[String]
  }

  /**
    * A data volume used in a task definition. For tasks that use a Docker volume, specify a <code>DockerVolumeConfiguration</code>. For tasks that use a bind mount host volume, specify a <code>host</code> and optional <code>sourcePath</code>. For more information, see [[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html|Using Data Volumes in Tasks]].
    */
  @js.native
  @Factory
  trait Volume extends js.Object {
    var dockerVolumeConfiguration: js.UndefOr[DockerVolumeConfiguration]
    var efsVolumeConfiguration: js.UndefOr[EFSVolumeConfiguration]
    var host: js.UndefOr[HostVolumeProperties]
    var name: js.UndefOr[String]
  }

  /**
    * Details on a data volume from another container in the same task definition.
    */
  @js.native
  @Factory
  trait VolumeFrom extends js.Object {
    var readOnly: js.UndefOr[BoxedBoolean]
    var sourceContainer: js.UndefOr[String]
  }
}
