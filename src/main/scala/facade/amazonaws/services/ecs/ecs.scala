package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object ecs {
  type AgentUpdateStatus = String
  type Attributes = js.Array[Attribute]
  type BoxedBoolean = Boolean
  type BoxedInteger = Integer
  type Clusters = js.Array[Cluster]
  type ContainerDefinitions = js.Array[ContainerDefinition]
  type ContainerInstances = js.Array[ContainerInstance]
  type ContainerOverrides = js.Array[ContainerOverride]
  type Containers = js.Array[Container]
  type Deployments = js.Array[Deployment]
  type DesiredStatus = String
  type DockerLabelsMap = js.Dictionary[String]
  type EnvironmentVariables = js.Array[KeyValuePair]
  type Failures = js.Array[Failure]
  type HostEntryList = js.Array[HostEntry]
  type LoadBalancers = js.Array[LoadBalancer]
  type LogConfigurationOptionsMap = js.Dictionary[String]
  type LogDriver = String
  type MountPointList = js.Array[MountPoint]
  type NetworkBindings = js.Array[NetworkBinding]
  type NetworkMode = String
  type PlacementConstraintType = String
  type PlacementConstraints = js.Array[PlacementConstraint]
  type PlacementStrategies = js.Array[PlacementStrategy]
  type PlacementStrategyType = String
  type PortMappingList = js.Array[PortMapping]
  type RequiresAttributes = js.Array[Attribute]
  type Resources = js.Array[Resource]
  type ServiceEvents = js.Array[ServiceEvent]
  type Services = js.Array[Service]
  type SortOrder = String
  type StringList = js.Array[String]
  type TargetType = String
  type TaskDefinitionFamilyStatus = String
  type TaskDefinitionPlacementConstraintType = String
  type TaskDefinitionPlacementConstraints = js.Array[TaskDefinitionPlacementConstraint]
  type TaskDefinitionStatus = String
  type Tasks = js.Array[Task]
  type Timestamp = js.Date
  type TransportProtocol = String
  type UlimitList = js.Array[Ulimit]
  type UlimitName = String
  type VolumeFromList = js.Array[VolumeFrom]
  type VolumeList = js.Array[Volume]
}

package ecs {
  @js.native
  trait Ecs extends js.Object {
    def createCluster(params: CreateClusterRequest, callback: Callback[CreateClusterResponse]): Unit = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createService(params: CreateServiceRequest, callback: Callback[CreateServiceResponse]): Unit = js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse] = js.native
    def deleteAttributes(params: DeleteAttributesRequest, callback: Callback[DeleteAttributesResponse]): Unit = js.native
    def deleteAttributes(params: DeleteAttributesRequest): Request[DeleteAttributesResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest, callback: Callback[DeleteClusterResponse]): Unit = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteService(params: DeleteServiceRequest, callback: Callback[DeleteServiceResponse]): Unit = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse] = js.native
    def deregisterContainerInstance(params: DeregisterContainerInstanceRequest, callback: Callback[DeregisterContainerInstanceResponse]): Unit = js.native
    def deregisterContainerInstance(params: DeregisterContainerInstanceRequest): Request[DeregisterContainerInstanceResponse] = js.native
    def deregisterTaskDefinition(params: DeregisterTaskDefinitionRequest, callback: Callback[DeregisterTaskDefinitionResponse]): Unit = js.native
    def deregisterTaskDefinition(params: DeregisterTaskDefinitionRequest): Request[DeregisterTaskDefinitionResponse] = js.native
    def describeClusters(params: DescribeClustersRequest, callback: Callback[DescribeClustersResponse]): Unit = js.native
    def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse] = js.native
    def describeContainerInstances(params: DescribeContainerInstancesRequest, callback: Callback[DescribeContainerInstancesResponse]): Unit = js.native
    def describeContainerInstances(params: DescribeContainerInstancesRequest): Request[DescribeContainerInstancesResponse] = js.native
    def describeServices(params: DescribeServicesRequest, callback: Callback[DescribeServicesResponse]): Unit = js.native
    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse] = js.native
    def describeTaskDefinition(params: DescribeTaskDefinitionRequest, callback: Callback[DescribeTaskDefinitionResponse]): Unit = js.native
    def describeTaskDefinition(params: DescribeTaskDefinitionRequest): Request[DescribeTaskDefinitionResponse] = js.native
    def describeTasks(params: DescribeTasksRequest, callback: Callback[DescribeTasksResponse]): Unit = js.native
    def describeTasks(params: DescribeTasksRequest): Request[DescribeTasksResponse] = js.native
    def discoverPollEndpoint(params: DiscoverPollEndpointRequest, callback: Callback[DiscoverPollEndpointResponse]): Unit = js.native
    def discoverPollEndpoint(params: DiscoverPollEndpointRequest): Request[DiscoverPollEndpointResponse] = js.native
    def listAttributes(params: ListAttributesRequest, callback: Callback[ListAttributesResponse]): Unit = js.native
    def listAttributes(params: ListAttributesRequest): Request[ListAttributesResponse] = js.native
    def listClusters(params: ListClustersRequest, callback: Callback[ListClustersResponse]): Unit = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse] = js.native
    def listContainerInstances(params: ListContainerInstancesRequest, callback: Callback[ListContainerInstancesResponse]): Unit = js.native
    def listContainerInstances(params: ListContainerInstancesRequest): Request[ListContainerInstancesResponse] = js.native
    def listServices(params: ListServicesRequest, callback: Callback[ListServicesResponse]): Unit = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse] = js.native
    def listTaskDefinitionFamilies(params: ListTaskDefinitionFamiliesRequest, callback: Callback[ListTaskDefinitionFamiliesResponse]): Unit = js.native
    def listTaskDefinitionFamilies(params: ListTaskDefinitionFamiliesRequest): Request[ListTaskDefinitionFamiliesResponse] = js.native
    def listTaskDefinitions(params: ListTaskDefinitionsRequest, callback: Callback[ListTaskDefinitionsResponse]): Unit = js.native
    def listTaskDefinitions(params: ListTaskDefinitionsRequest): Request[ListTaskDefinitionsResponse] = js.native
    def listTasks(params: ListTasksRequest, callback: Callback[ListTasksResponse]): Unit = js.native
    def listTasks(params: ListTasksRequest): Request[ListTasksResponse] = js.native
    def putAttributes(params: PutAttributesRequest, callback: Callback[PutAttributesResponse]): Unit = js.native
    def putAttributes(params: PutAttributesRequest): Request[PutAttributesResponse] = js.native
    def registerContainerInstance(params: RegisterContainerInstanceRequest, callback: Callback[RegisterContainerInstanceResponse]): Unit = js.native
    def registerContainerInstance(params: RegisterContainerInstanceRequest): Request[RegisterContainerInstanceResponse] = js.native
    def registerTaskDefinition(params: RegisterTaskDefinitionRequest, callback: Callback[RegisterTaskDefinitionResponse]): Unit = js.native
    def registerTaskDefinition(params: RegisterTaskDefinitionRequest): Request[RegisterTaskDefinitionResponse] = js.native
    def runTask(params: RunTaskRequest, callback: Callback[RunTaskResponse]): Unit = js.native
    def runTask(params: RunTaskRequest): Request[RunTaskResponse] = js.native
    def startTask(params: StartTaskRequest, callback: Callback[StartTaskResponse]): Unit = js.native
    def startTask(params: StartTaskRequest): Request[StartTaskResponse] = js.native
    def stopTask(params: StopTaskRequest, callback: Callback[StopTaskResponse]): Unit = js.native
    def stopTask(params: StopTaskRequest): Request[StopTaskResponse] = js.native
    def submitContainerStateChange(params: SubmitContainerStateChangeRequest, callback: Callback[SubmitContainerStateChangeResponse]): Unit = js.native
    def submitContainerStateChange(params: SubmitContainerStateChangeRequest): Request[SubmitContainerStateChangeResponse] = js.native
    def submitTaskStateChange(params: SubmitTaskStateChangeRequest, callback: Callback[SubmitTaskStateChangeResponse]): Unit = js.native
    def submitTaskStateChange(params: SubmitTaskStateChangeRequest): Request[SubmitTaskStateChangeResponse] = js.native
    def updateContainerAgent(params: UpdateContainerAgentRequest, callback: Callback[UpdateContainerAgentResponse]): Unit = js.native
    def updateContainerAgent(params: UpdateContainerAgentRequest): Request[UpdateContainerAgentResponse] = js.native
    def updateService(params: UpdateServiceRequest, callback: Callback[UpdateServiceResponse]): Unit = js.native
    def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse] = js.native
  }


  object AgentUpdateStatusEnum {
    val PENDING = "PENDING"
    val STAGING = "STAGING"
    val STAGED = "STAGED"
    val UPDATING = "UPDATING"
    val UPDATED = "UPDATED"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING, STAGING, STAGED, UPDATING, UPDATED, FAILED)
  }

  /**
   * <p>Attributes are name-value pairs associated with various Amazon ECS objects. Attributes allow you to extend the Amazon ECS data model by adding custom metadata to your resources.</p>
   */
  @js.native
  trait Attribute extends js.Object {
    var name: String
    var value: String
    var targetType: TargetType
    var targetId: String
  }

  object Attribute {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[String] = js.undefined,
      targetType: js.UndefOr[TargetType] = js.undefined,
      targetId: js.UndefOr[String] = js.undefined
    ): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("value" -> value.map { x => x: js.Any }),
        ("targetType" -> targetType.map { x => x: js.Any }),
        ("targetId" -> targetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
    }
  }

  /**
   * <p>You can apply up to 10 custom attributes per resource. You can view the attributes of a resource with <a>ListAttributes</a>. You can remove existing attributes on a resource with <a>DeleteAttributes</a>.</p>
   */
  @js.native
  trait AttributeLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permission to use the action or resource, or specifying an identifier that is not valid.</p>
   */
  @js.native
  trait ClientExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>A regional grouping of one or more container instances on which you can run task requests. Each account receives a default cluster the first time you use the Amazon ECS service, but you may also create other clusters. Clusters may contain more than one instance type simultaneously.</p>
   */
  @js.native
  trait Cluster extends js.Object {
    var activeServicesCount: Integer
    var runningTasksCount: Integer
    var pendingTasksCount: Integer
    var status: String
    var clusterArn: String
    var registeredContainerInstancesCount: Integer
    var clusterName: String
  }

  object Cluster {
    def apply(
      activeServicesCount: js.UndefOr[Integer] = js.undefined,
      runningTasksCount: js.UndefOr[Integer] = js.undefined,
      pendingTasksCount: js.UndefOr[Integer] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined,
      registeredContainerInstancesCount: js.UndefOr[Integer] = js.undefined,
      clusterName: js.UndefOr[String] = js.undefined
    ): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("activeServicesCount" -> activeServicesCount.map { x => x: js.Any }),
        ("runningTasksCount" -> runningTasksCount.map { x => x: js.Any }),
        ("pendingTasksCount" -> pendingTasksCount.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("clusterArn" -> clusterArn.map { x => x: js.Any }),
        ("registeredContainerInstancesCount" -> registeredContainerInstancesCount.map { x => x: js.Any }),
        ("clusterName" -> clusterName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
    }
  }

  /**
   * <p>You cannot delete a cluster that has registered container instances. You must first deregister the container instances before you can delete the cluster. For more information, see <a>DeregisterContainerInstance</a>.</p>
   */
  @js.native
  trait ClusterContainsContainerInstancesExceptionException extends js.Object {

  }

  /**
   * <p>You cannot delete a cluster that contains services. You must first update the service to reduce its desired task count to 0 and then delete the service. For more information, see <a>UpdateService</a> and <a>DeleteService</a>.</p>
   */
  @js.native
  trait ClusterContainsServicesExceptionException extends js.Object {

  }

  /**
   * <p>The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>. Amazon ECS clusters are region-specific.</p>
   */
  @js.native
  trait ClusterNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>A Docker container that is part of a task.</p>
   */
  @js.native
  trait Container extends js.Object {
    var name: String
    var lastStatus: String
    var networkBindings: NetworkBindings
    var exitCode: BoxedInteger
    var reason: String
    var containerArn: String
    var taskArn: String
  }

  object Container {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      lastStatus: js.UndefOr[String] = js.undefined,
      networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
      exitCode: js.UndefOr[BoxedInteger] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      containerArn: js.UndefOr[String] = js.undefined,
      taskArn: js.UndefOr[String] = js.undefined
    ): Container = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("networkBindings" -> networkBindings.map { x => x: js.Any }),
        ("exitCode" -> exitCode.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any }),
        ("containerArn" -> containerArn.map { x => x: js.Any }),
        ("taskArn" -> taskArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Container]
    }
  }

  /**
   * <p>Container definitions are used in task definitions to describe the different containers that are launched as part of a task.</p>
   */
  @js.native
  trait ContainerDefinition extends js.Object {
    var dockerSecurityOptions: StringList
    var ulimits: UlimitList
    var mountPoints: MountPointList
    var name: String
    var hostname: String
    var entryPoint: StringList
    var portMappings: PortMappingList
    var essential: BoxedBoolean
    var readonlyRootFilesystem: BoxedBoolean
    var image: String
    var dnsSearchDomains: StringList
    var command: StringList
    var links: StringList
    var memoryReservation: BoxedInteger
    var volumesFrom: VolumeFromList
    var cpu: Integer
    var environment: EnvironmentVariables
    var workingDirectory: String
    var extraHosts: HostEntryList
    var dockerLabels: DockerLabelsMap
    var privileged: BoxedBoolean
    var logConfiguration: LogConfiguration
    var user: String
    var disableNetworking: BoxedBoolean
    var memory: BoxedInteger
    var dnsServers: StringList
  }

  object ContainerDefinition {
    def apply(
      dockerSecurityOptions: js.UndefOr[StringList] = js.undefined,
      ulimits: js.UndefOr[UlimitList] = js.undefined,
      mountPoints: js.UndefOr[MountPointList] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      hostname: js.UndefOr[String] = js.undefined,
      entryPoint: js.UndefOr[StringList] = js.undefined,
      portMappings: js.UndefOr[PortMappingList] = js.undefined,
      essential: js.UndefOr[BoxedBoolean] = js.undefined,
      readonlyRootFilesystem: js.UndefOr[BoxedBoolean] = js.undefined,
      image: js.UndefOr[String] = js.undefined,
      dnsSearchDomains: js.UndefOr[StringList] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      links: js.UndefOr[StringList] = js.undefined,
      memoryReservation: js.UndefOr[BoxedInteger] = js.undefined,
      volumesFrom: js.UndefOr[VolumeFromList] = js.undefined,
      cpu: js.UndefOr[Integer] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      workingDirectory: js.UndefOr[String] = js.undefined,
      extraHosts: js.UndefOr[HostEntryList] = js.undefined,
      dockerLabels: js.UndefOr[DockerLabelsMap] = js.undefined,
      privileged: js.UndefOr[BoxedBoolean] = js.undefined,
      logConfiguration: js.UndefOr[LogConfiguration] = js.undefined,
      user: js.UndefOr[String] = js.undefined,
      disableNetworking: js.UndefOr[BoxedBoolean] = js.undefined,
      memory: js.UndefOr[BoxedInteger] = js.undefined,
      dnsServers: js.UndefOr[StringList] = js.undefined
    ): ContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("dockerSecurityOptions" -> dockerSecurityOptions.map { x => x: js.Any }),
        ("ulimits" -> ulimits.map { x => x: js.Any }),
        ("mountPoints" -> mountPoints.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("hostname" -> hostname.map { x => x: js.Any }),
        ("entryPoint" -> entryPoint.map { x => x: js.Any }),
        ("portMappings" -> portMappings.map { x => x: js.Any }),
        ("essential" -> essential.map { x => x: js.Any }),
        ("readonlyRootFilesystem" -> readonlyRootFilesystem.map { x => x: js.Any }),
        ("image" -> image.map { x => x: js.Any }),
        ("dnsSearchDomains" -> dnsSearchDomains.map { x => x: js.Any }),
        ("command" -> command.map { x => x: js.Any }),
        ("links" -> links.map { x => x: js.Any }),
        ("memoryReservation" -> memoryReservation.map { x => x: js.Any }),
        ("volumesFrom" -> volumesFrom.map { x => x: js.Any }),
        ("cpu" -> cpu.map { x => x: js.Any }),
        ("environment" -> environment.map { x => x: js.Any }),
        ("workingDirectory" -> workingDirectory.map { x => x: js.Any }),
        ("extraHosts" -> extraHosts.map { x => x: js.Any }),
        ("dockerLabels" -> dockerLabels.map { x => x: js.Any }),
        ("privileged" -> privileged.map { x => x: js.Any }),
        ("logConfiguration" -> logConfiguration.map { x => x: js.Any }),
        ("user" -> user.map { x => x: js.Any }),
        ("disableNetworking" -> disableNetworking.map { x => x: js.Any }),
        ("memory" -> memory.map { x => x: js.Any }),
        ("dnsServers" -> dnsServers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDefinition]
    }
  }

  /**
   * <p>An EC2 instance that is running the Amazon ECS agent and has been registered with a cluster.</p>
   */
  @js.native
  trait ContainerInstance extends js.Object {
    var remainingResources: Resources
    var registeredResources: Resources
    var ec2InstanceId: String
    var runningTasksCount: Integer
    var attributes: Attributes
    var version: Long
    var pendingTasksCount: Integer
    var agentConnected: Boolean
    var status: String
    var containerInstanceArn: String
    var agentUpdateStatus: AgentUpdateStatus
    var versionInfo: VersionInfo
  }

  object ContainerInstance {
    def apply(
      remainingResources: js.UndefOr[Resources] = js.undefined,
      registeredResources: js.UndefOr[Resources] = js.undefined,
      ec2InstanceId: js.UndefOr[String] = js.undefined,
      runningTasksCount: js.UndefOr[Integer] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      version: js.UndefOr[Long] = js.undefined,
      pendingTasksCount: js.UndefOr[Integer] = js.undefined,
      agentConnected: js.UndefOr[Boolean] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined,
      agentUpdateStatus: js.UndefOr[AgentUpdateStatus] = js.undefined,
      versionInfo: js.UndefOr[VersionInfo] = js.undefined
    ): ContainerInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("remainingResources" -> remainingResources.map { x => x: js.Any }),
        ("registeredResources" -> registeredResources.map { x => x: js.Any }),
        ("ec2InstanceId" -> ec2InstanceId.map { x => x: js.Any }),
        ("runningTasksCount" -> runningTasksCount.map { x => x: js.Any }),
        ("attributes" -> attributes.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any }),
        ("pendingTasksCount" -> pendingTasksCount.map { x => x: js.Any }),
        ("agentConnected" -> agentConnected.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("containerInstanceArn" -> containerInstanceArn.map { x => x: js.Any }),
        ("agentUpdateStatus" -> agentUpdateStatus.map { x => x: js.Any }),
        ("versionInfo" -> versionInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerInstance]
    }
  }

  /**
   * <p>The overrides that should be sent to a container.</p>
   */
  @js.native
  trait ContainerOverride extends js.Object {
    var name: String
    var command: StringList
    var environment: EnvironmentVariables
  }

  object ContainerOverride {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined
    ): ContainerOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("command" -> command.map { x => x: js.Any }),
        ("environment" -> environment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerOverride]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var clusterName: String
  }

  object CreateClusterRequest {
    def apply(
      clusterName: js.UndefOr[String] = js.undefined
    ): CreateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("clusterName" -> clusterName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var cluster: Cluster
  }

  object CreateClusterResponse {
    def apply(
      cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait CreateServiceRequest extends js.Object {
    var placementStrategy: PlacementStrategies
    var role: String
    var desiredCount: BoxedInteger
    var serviceName: String
    var clientToken: String
    var loadBalancers: LoadBalancers
    var cluster: String
    var deploymentConfiguration: DeploymentConfiguration
    var taskDefinition: String
    var placementConstraints: PlacementConstraints
  }

  object CreateServiceRequest {
    def apply(
      placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
      role: js.UndefOr[String] = js.undefined,
      desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
      serviceName: js.UndefOr[String] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined,
      loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined
    ): CreateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("placementStrategy" -> placementStrategy.map { x => x: js.Any }),
        ("role" -> role.map { x => x: js.Any }),
        ("desiredCount" -> desiredCount.map { x => x: js.Any }),
        ("serviceName" -> serviceName.map { x => x: js.Any }),
        ("clientToken" -> clientToken.map { x => x: js.Any }),
        ("loadBalancers" -> loadBalancers.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("deploymentConfiguration" -> deploymentConfiguration.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any }),
        ("placementConstraints" -> placementConstraints.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceRequest]
    }
  }

  @js.native
  trait CreateServiceResponse extends js.Object {
    var service: Service
  }

  object CreateServiceResponse {
    def apply(
      service: js.UndefOr[Service] = js.undefined
    ): CreateServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("service" -> service.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceResponse]
    }
  }

  @js.native
  trait DeleteAttributesRequest extends js.Object {
    var cluster: String
    var attributes: Attributes
  }

  object DeleteAttributesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined
    ): DeleteAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("attributes" -> attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAttributesRequest]
    }
  }

  @js.native
  trait DeleteAttributesResponse extends js.Object {
    var attributes: Attributes
  }

  object DeleteAttributesResponse {
    def apply(
      attributes: js.UndefOr[Attributes] = js.undefined
    ): DeleteAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attributes" -> attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAttributesResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var cluster: String
  }

  object DeleteClusterRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined
    ): DeleteClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var cluster: Cluster
  }

  object DeleteClusterResponse {
    def apply(
      cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DeleteServiceRequest extends js.Object {
    var cluster: String
    var service: String
  }

  object DeleteServiceRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      service: js.UndefOr[String] = js.undefined
    ): DeleteServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("service" -> service.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceRequest]
    }
  }

  @js.native
  trait DeleteServiceResponse extends js.Object {
    var service: Service
  }

  object DeleteServiceResponse {
    def apply(
      service: js.UndefOr[Service] = js.undefined
    ): DeleteServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("service" -> service.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceResponse]
    }
  }

  /**
   * <p>The details of an Amazon ECS service deployment.</p>
   */
  @js.native
  trait Deployment extends js.Object {
    var updatedAt: Timestamp
    var runningCount: Integer
    var desiredCount: Integer
    var id: String
    var status: String
    var createdAt: Timestamp
    var taskDefinition: String
    var pendingCount: Integer
  }

  object Deployment {
    def apply(
      updatedAt: js.UndefOr[Timestamp] = js.undefined,
      runningCount: js.UndefOr[Integer] = js.undefined,
      desiredCount: js.UndefOr[Integer] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      pendingCount: js.UndefOr[Integer] = js.undefined
    ): Deployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("updatedAt" -> updatedAt.map { x => x: js.Any }),
        ("runningCount" -> runningCount.map { x => x: js.Any }),
        ("desiredCount" -> desiredCount.map { x => x: js.Any }),
        ("id" -> id.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("createdAt" -> createdAt.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any }),
        ("pendingCount" -> pendingCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployment]
    }
  }

  /**
   * <p>Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.</p>
   */
  @js.native
  trait DeploymentConfiguration extends js.Object {
    var maximumPercent: BoxedInteger
    var minimumHealthyPercent: BoxedInteger
  }

  object DeploymentConfiguration {
    def apply(
      maximumPercent: js.UndefOr[BoxedInteger] = js.undefined,
      minimumHealthyPercent: js.UndefOr[BoxedInteger] = js.undefined
    ): DeploymentConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("maximumPercent" -> maximumPercent.map { x => x: js.Any }),
        ("minimumHealthyPercent" -> minimumHealthyPercent.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentConfiguration]
    }
  }

  @js.native
  trait DeregisterContainerInstanceRequest extends js.Object {
    var cluster: String
    var containerInstance: String
    var force: BoxedBoolean
  }

  object DeregisterContainerInstanceRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      containerInstance: js.UndefOr[String] = js.undefined,
      force: js.UndefOr[BoxedBoolean] = js.undefined
    ): DeregisterContainerInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("containerInstance" -> containerInstance.map { x => x: js.Any }),
        ("force" -> force.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterContainerInstanceRequest]
    }
  }

  @js.native
  trait DeregisterContainerInstanceResponse extends js.Object {
    var containerInstance: ContainerInstance
  }

  object DeregisterContainerInstanceResponse {
    def apply(
      containerInstance: js.UndefOr[ContainerInstance] = js.undefined
    ): DeregisterContainerInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerInstance" -> containerInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterContainerInstanceResponse]
    }
  }

  @js.native
  trait DeregisterTaskDefinitionRequest extends js.Object {
    var taskDefinition: String
  }

  object DeregisterTaskDefinitionRequest {
    def apply(
      taskDefinition: js.UndefOr[String] = js.undefined
    ): DeregisterTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTaskDefinitionRequest]
    }
  }

  @js.native
  trait DeregisterTaskDefinitionResponse extends js.Object {
    var taskDefinition: TaskDefinition
  }

  object DeregisterTaskDefinitionResponse {
    def apply(
      taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
    ): DeregisterTaskDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTaskDefinitionResponse]
    }
  }

  @js.native
  trait DescribeClustersRequest extends js.Object {
    var clusters: StringList
  }

  object DescribeClustersRequest {
    def apply(
      clusters: js.UndefOr[StringList] = js.undefined
    ): DescribeClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("clusters" -> clusters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersRequest]
    }
  }

  @js.native
  trait DescribeClustersResponse extends js.Object {
    var clusters: Clusters
    var failures: Failures
  }

  object DescribeClustersResponse {
    def apply(
      clusters: js.UndefOr[Clusters] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined
    ): DescribeClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("clusters" -> clusters.map { x => x: js.Any }),
        ("failures" -> failures.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersResponse]
    }
  }

  @js.native
  trait DescribeContainerInstancesRequest extends js.Object {
    var cluster: String
    var containerInstances: StringList
  }

  object DescribeContainerInstancesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      containerInstances: js.UndefOr[StringList] = js.undefined
    ): DescribeContainerInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("containerInstances" -> containerInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContainerInstancesRequest]
    }
  }

  @js.native
  trait DescribeContainerInstancesResponse extends js.Object {
    var containerInstances: ContainerInstances
    var failures: Failures
  }

  object DescribeContainerInstancesResponse {
    def apply(
      containerInstances: js.UndefOr[ContainerInstances] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined
    ): DescribeContainerInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerInstances" -> containerInstances.map { x => x: js.Any }),
        ("failures" -> failures.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContainerInstancesResponse]
    }
  }

  @js.native
  trait DescribeServicesRequest extends js.Object {
    var cluster: String
    var services: StringList
  }

  object DescribeServicesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      services: js.UndefOr[StringList] = js.undefined
    ): DescribeServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("services" -> services.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesRequest]
    }
  }

  @js.native
  trait DescribeServicesResponse extends js.Object {
    var services: Services
    var failures: Failures
  }

  object DescribeServicesResponse {
    def apply(
      services: js.UndefOr[Services] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined
    ): DescribeServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("services" -> services.map { x => x: js.Any }),
        ("failures" -> failures.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesResponse]
    }
  }

  @js.native
  trait DescribeTaskDefinitionRequest extends js.Object {
    var taskDefinition: String
  }

  object DescribeTaskDefinitionRequest {
    def apply(
      taskDefinition: js.UndefOr[String] = js.undefined
    ): DescribeTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskDefinitionRequest]
    }
  }

  @js.native
  trait DescribeTaskDefinitionResponse extends js.Object {
    var taskDefinition: TaskDefinition
  }

  object DescribeTaskDefinitionResponse {
    def apply(
      taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
    ): DescribeTaskDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskDefinitionResponse]
    }
  }

  @js.native
  trait DescribeTasksRequest extends js.Object {
    var cluster: String
    var tasks: StringList
  }

  object DescribeTasksRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      tasks: js.UndefOr[StringList] = js.undefined
    ): DescribeTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("tasks" -> tasks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTasksRequest]
    }
  }

  @js.native
  trait DescribeTasksResponse extends js.Object {
    var tasks: Tasks
    var failures: Failures
  }

  object DescribeTasksResponse {
    def apply(
      tasks: js.UndefOr[Tasks] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined
    ): DescribeTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tasks" -> tasks.map { x => x: js.Any }),
        ("failures" -> failures.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTasksResponse]
    }
  }


  object DesiredStatusEnum {
    val RUNNING = "RUNNING"
    val PENDING = "PENDING"
    val STOPPED = "STOPPED"

    val values = IndexedSeq(RUNNING, PENDING, STOPPED)
  }

  @js.native
  trait DiscoverPollEndpointRequest extends js.Object {
    var containerInstance: String
    var cluster: String
  }

  object DiscoverPollEndpointRequest {
    def apply(
      containerInstance: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined
    ): DiscoverPollEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerInstance" -> containerInstance.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverPollEndpointRequest]
    }
  }

  @js.native
  trait DiscoverPollEndpointResponse extends js.Object {
    var endpoint: String
    var telemetryEndpoint: String
  }

  object DiscoverPollEndpointResponse {
    def apply(
      endpoint: js.UndefOr[String] = js.undefined,
      telemetryEndpoint: js.UndefOr[String] = js.undefined
    ): DiscoverPollEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("endpoint" -> endpoint.map { x => x: js.Any }),
        ("telemetryEndpoint" -> telemetryEndpoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverPollEndpointResponse]
    }
  }

  /**
   * <p>A failed resource.</p>
   */
  @js.native
  trait Failure extends js.Object {
    var arn: String
    var reason: String
  }

  object Failure {
    def apply(
      arn: js.UndefOr[String] = js.undefined,
      reason: js.UndefOr[String] = js.undefined
    ): Failure = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("arn" -> arn.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Failure]
    }
  }

  /**
   * <p>Hostnames and IP address entries that are added to the <code>/etc/hosts</code> file of a container via the <code>extraHosts</code> parameter of its <a>ContainerDefinition</a>. </p>
   */
  @js.native
  trait HostEntry extends js.Object {
    var hostname: String
    var ipAddress: String
  }

  object HostEntry {
    def apply(
      hostname: js.UndefOr[String] = js.undefined,
      ipAddress: js.UndefOr[String] = js.undefined
    ): HostEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("hostname" -> hostname.map { x => x: js.Any }),
        ("ipAddress" -> ipAddress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostEntry]
    }
  }

  /**
   * <p>Details on a container instance host volume.</p>
   */
  @js.native
  trait HostVolumeProperties extends js.Object {
    var sourcePath: String
  }

  object HostVolumeProperties {
    def apply(
      sourcePath: js.UndefOr[String] = js.undefined
    ): HostVolumeProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("sourcePath" -> sourcePath.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostVolumeProperties]
    }
  }

  /**
   * <p>The specified parameter is invalid. Review the available parameters for the API request.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {

  }

  /**
   * <p>A key and value pair object.</p>
   */
  @js.native
  trait KeyValuePair extends js.Object {
    var name: String
    var value: String
  }

  object KeyValuePair {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[String] = js.undefined
    ): KeyValuePair = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("value" -> value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyValuePair]
    }
  }

  @js.native
  trait ListAttributesRequest extends js.Object {
    var maxResults: BoxedInteger
    var attributeValue: String
    var nextToken: String
    var attributeName: String
    var cluster: String
    var targetType: TargetType
  }

  object ListAttributesRequest {
    def apply(
      maxResults: js.UndefOr[BoxedInteger] = js.undefined,
      attributeValue: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      attributeName: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      targetType: js.UndefOr[TargetType] = js.undefined
    ): ListAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("maxResults" -> maxResults.map { x => x: js.Any }),
        ("attributeValue" -> attributeValue.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("attributeName" -> attributeName.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("targetType" -> targetType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttributesRequest]
    }
  }

  @js.native
  trait ListAttributesResponse extends js.Object {
    var attributes: Attributes
    var nextToken: String
  }

  object ListAttributesResponse {
    def apply(
      attributes: js.UndefOr[Attributes] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined
    ): ListAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attributes" -> attributes.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttributesResponse]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var nextToken: String
    var maxResults: BoxedInteger
  }

  object ListClustersRequest {
    def apply(
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined
    ): ListClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("maxResults" -> maxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var clusterArns: StringList
    var nextToken: String
  }

  object ListClustersResponse {
    def apply(
      clusterArns: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined
    ): ListClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("clusterArns" -> clusterArns.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListContainerInstancesRequest extends js.Object {
    var cluster: String
    var filter: String
    var nextToken: String
    var maxResults: BoxedInteger
  }

  object ListContainerInstancesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      filter: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined
    ): ListContainerInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("filter" -> filter.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("maxResults" -> maxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListContainerInstancesRequest]
    }
  }

  @js.native
  trait ListContainerInstancesResponse extends js.Object {
    var containerInstanceArns: StringList
    var nextToken: String
  }

  object ListContainerInstancesResponse {
    def apply(
      containerInstanceArns: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined
    ): ListContainerInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerInstanceArns" -> containerInstanceArns.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListContainerInstancesResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var cluster: String
    var nextToken: String
    var maxResults: BoxedInteger
  }

  object ListServicesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined
    ): ListServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("maxResults" -> maxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var serviceArns: StringList
    var nextToken: String
  }

  object ListServicesResponse {
    def apply(
      serviceArns: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined
    ): ListServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("serviceArns" -> serviceArns.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServicesResponse]
    }
  }

  @js.native
  trait ListTaskDefinitionFamiliesRequest extends js.Object {
    var familyPrefix: String
    var status: TaskDefinitionFamilyStatus
    var nextToken: String
    var maxResults: BoxedInteger
  }

  object ListTaskDefinitionFamiliesRequest {
    def apply(
      familyPrefix: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[TaskDefinitionFamilyStatus] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined
    ): ListTaskDefinitionFamiliesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("familyPrefix" -> familyPrefix.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("maxResults" -> maxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionFamiliesRequest]
    }
  }

  @js.native
  trait ListTaskDefinitionFamiliesResponse extends js.Object {
    var families: StringList
    var nextToken: String
  }

  object ListTaskDefinitionFamiliesResponse {
    def apply(
      families: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined
    ): ListTaskDefinitionFamiliesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("families" -> families.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionFamiliesResponse]
    }
  }

  @js.native
  trait ListTaskDefinitionsRequest extends js.Object {
    var maxResults: BoxedInteger
    var nextToken: String
    var status: TaskDefinitionStatus
    var sort: SortOrder
    var familyPrefix: String
  }

  object ListTaskDefinitionsRequest {
    def apply(
      maxResults: js.UndefOr[BoxedInteger] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[TaskDefinitionStatus] = js.undefined,
      sort: js.UndefOr[SortOrder] = js.undefined,
      familyPrefix: js.UndefOr[String] = js.undefined
    ): ListTaskDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("maxResults" -> maxResults.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("sort" -> sort.map { x => x: js.Any }),
        ("familyPrefix" -> familyPrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionsRequest]
    }
  }

  @js.native
  trait ListTaskDefinitionsResponse extends js.Object {
    var taskDefinitionArns: StringList
    var nextToken: String
  }

  object ListTaskDefinitionsResponse {
    def apply(
      taskDefinitionArns: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined
    ): ListTaskDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinitionArns" -> taskDefinitionArns.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionsResponse]
    }
  }

  @js.native
  trait ListTasksRequest extends js.Object {
    var startedBy: String
    var containerInstance: String
    var maxResults: BoxedInteger
    var serviceName: String
    var desiredStatus: DesiredStatus
    var nextToken: String
    var cluster: String
    var family: String
  }

  object ListTasksRequest {
    def apply(
      startedBy: js.UndefOr[String] = js.undefined,
      containerInstance: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined,
      serviceName: js.UndefOr[String] = js.undefined,
      desiredStatus: js.UndefOr[DesiredStatus] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      family: js.UndefOr[String] = js.undefined
    ): ListTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startedBy" -> startedBy.map { x => x: js.Any }),
        ("containerInstance" -> containerInstance.map { x => x: js.Any }),
        ("maxResults" -> maxResults.map { x => x: js.Any }),
        ("serviceName" -> serviceName.map { x => x: js.Any }),
        ("desiredStatus" -> desiredStatus.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("family" -> family.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksRequest]
    }
  }

  @js.native
  trait ListTasksResponse extends js.Object {
    var taskArns: StringList
    var nextToken: String
  }

  object ListTasksResponse {
    def apply(
      taskArns: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined
    ): ListTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskArns" -> taskArns.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksResponse]
    }
  }

  /**
   * <p>Details on a load balancer that is used with a service.</p>
   */
  @js.native
  trait LoadBalancer extends js.Object {
    var targetGroupArn: String
    var loadBalancerName: String
    var containerName: String
    var containerPort: BoxedInteger
  }

  object LoadBalancer {
    def apply(
      targetGroupArn: js.UndefOr[String] = js.undefined,
      loadBalancerName: js.UndefOr[String] = js.undefined,
      containerName: js.UndefOr[String] = js.undefined,
      containerPort: js.UndefOr[BoxedInteger] = js.undefined
    ): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("targetGroupArn" -> targetGroupArn.map { x => x: js.Any }),
        ("loadBalancerName" -> loadBalancerName.map { x => x: js.Any }),
        ("containerName" -> containerName.map { x => x: js.Any }),
        ("containerPort" -> containerPort.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
    }
  }

  /**
   * <p>Log configuration options to send to a custom log driver for the container.</p>
   */
  @js.native
  trait LogConfiguration extends js.Object {
    var logDriver: LogDriver
    var options: LogConfigurationOptionsMap
  }

  object LogConfiguration {
    def apply(
      logDriver: js.UndefOr[LogDriver] = js.undefined,
      options: js.UndefOr[LogConfigurationOptionsMap] = js.undefined
    ): LogConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logDriver" -> logDriver.map { x => x: js.Any }),
        ("options" -> options.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogConfiguration]
    }
  }


  object LogDriverEnum {
    val `json-file` = "json-file"
    val syslog = "syslog"
    val journald = "journald"
    val gelf = "gelf"
    val fluentd = "fluentd"
    val awslogs = "awslogs"
    val splunk = "splunk"

    val values = IndexedSeq(`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk)
  }

  /**
   * <p>Amazon ECS is unable to determine the current version of the Amazon ECS container agent on the container instance and does not have enough information to proceed with an update. This could be because the agent running on the container instance is an older or custom version that does not use our version information.</p>
   */
  @js.native
  trait MissingVersionExceptionException extends js.Object {

  }

  /**
   * <p>Details on a volume mount point that is used in a container definition.</p>
   */
  @js.native
  trait MountPoint extends js.Object {
    var sourceVolume: String
    var containerPath: String
    var readOnly: BoxedBoolean
  }

  object MountPoint {
    def apply(
      sourceVolume: js.UndefOr[String] = js.undefined,
      containerPath: js.UndefOr[String] = js.undefined,
      readOnly: js.UndefOr[BoxedBoolean] = js.undefined
    ): MountPoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("sourceVolume" -> sourceVolume.map { x => x: js.Any }),
        ("containerPath" -> containerPath.map { x => x: js.Any }),
        ("readOnly" -> readOnly.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MountPoint]
    }
  }

  /**
   * <p>Details on the network bindings between a container and its host container instance. After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.</p>
   */
  @js.native
  trait NetworkBinding extends js.Object {
    var bindIP: String
    var containerPort: BoxedInteger
    var hostPort: BoxedInteger
    var protocol: TransportProtocol
  }

  object NetworkBinding {
    def apply(
      bindIP: js.UndefOr[String] = js.undefined,
      containerPort: js.UndefOr[BoxedInteger] = js.undefined,
      hostPort: js.UndefOr[BoxedInteger] = js.undefined,
      protocol: js.UndefOr[TransportProtocol] = js.undefined
    ): NetworkBinding = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("bindIP" -> bindIP.map { x => x: js.Any }),
        ("containerPort" -> containerPort.map { x => x: js.Any }),
        ("hostPort" -> hostPort.map { x => x: js.Any }),
        ("protocol" -> protocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkBinding]
    }
  }


  object NetworkModeEnum {
    val bridge = "bridge"
    val host = "host"
    val none = "none"

    val values = IndexedSeq(bridge, host, none)
  }

  /**
   * <p>There is no update available for this Amazon ECS container agent. This could be because the agent is already running the latest version, or it is so old that there is no update path to the current version.</p>
   */
  @js.native
  trait NoUpdateAvailableExceptionException extends js.Object {

  }

  /**
   * <p>An object representing a constraint on task placement. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html">Task Placement Constraints</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.</p>
   */
  @js.native
  trait PlacementConstraint extends js.Object {
    var `type`: PlacementConstraintType
    var expression: String
  }

  object PlacementConstraint {
    def apply(
      `type`: js.UndefOr[PlacementConstraintType] = js.undefined,
      expression: js.UndefOr[String] = js.undefined
    ): PlacementConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("`type`" -> `type`.map { x => x: js.Any }),
        ("expression" -> expression.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementConstraint]
    }
  }


  object PlacementConstraintTypeEnum {
    val distinctInstance = "distinctInstance"
    val memberOf = "memberOf"

    val values = IndexedSeq(distinctInstance, memberOf)
  }

  /**
   * <p>The task placement strategy for a task or service. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html">Task Placement Strategies</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.</p>
   */
  @js.native
  trait PlacementStrategy extends js.Object {
    var `type`: PlacementStrategyType
    var field: String
  }

  object PlacementStrategy {
    def apply(
      `type`: js.UndefOr[PlacementStrategyType] = js.undefined,
      field: js.UndefOr[String] = js.undefined
    ): PlacementStrategy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("`type`" -> `type`.map { x => x: js.Any }),
        ("field" -> field.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementStrategy]
    }
  }


  object PlacementStrategyTypeEnum {
    val random = "random"
    val spread = "spread"
    val binpack = "binpack"

    val values = IndexedSeq(random, spread, binpack)
  }

  /**
   * <p>Port mappings allow containers to access ports on the host container instance to send or receive traffic. Port mappings are specified as part of the container definition. After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.</p>
   */
  @js.native
  trait PortMapping extends js.Object {
    var containerPort: BoxedInteger
    var hostPort: BoxedInteger
    var protocol: TransportProtocol
  }

  object PortMapping {
    def apply(
      containerPort: js.UndefOr[BoxedInteger] = js.undefined,
      hostPort: js.UndefOr[BoxedInteger] = js.undefined,
      protocol: js.UndefOr[TransportProtocol] = js.undefined
    ): PortMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerPort" -> containerPort.map { x => x: js.Any }),
        ("hostPort" -> hostPort.map { x => x: js.Any }),
        ("protocol" -> protocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortMapping]
    }
  }

  @js.native
  trait PutAttributesRequest extends js.Object {
    var cluster: String
    var attributes: Attributes
  }

  object PutAttributesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined
    ): PutAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("attributes" -> attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAttributesRequest]
    }
  }

  @js.native
  trait PutAttributesResponse extends js.Object {
    var attributes: Attributes
  }

  object PutAttributesResponse {
    def apply(
      attributes: js.UndefOr[Attributes] = js.undefined
    ): PutAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attributes" -> attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAttributesResponse]
    }
  }

  @js.native
  trait RegisterContainerInstanceRequest extends js.Object {
    var instanceIdentityDocument: String
    var instanceIdentityDocumentSignature: String
    var attributes: Attributes
    var cluster: String
    var containerInstanceArn: String
    var totalResources: Resources
    var versionInfo: VersionInfo
  }

  object RegisterContainerInstanceRequest {
    def apply(
      instanceIdentityDocument: js.UndefOr[String] = js.undefined,
      instanceIdentityDocumentSignature: js.UndefOr[String] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined,
      totalResources: js.UndefOr[Resources] = js.undefined,
      versionInfo: js.UndefOr[VersionInfo] = js.undefined
    ): RegisterContainerInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceIdentityDocument" -> instanceIdentityDocument.map { x => x: js.Any }),
        ("instanceIdentityDocumentSignature" -> instanceIdentityDocumentSignature.map { x => x: js.Any }),
        ("attributes" -> attributes.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("containerInstanceArn" -> containerInstanceArn.map { x => x: js.Any }),
        ("totalResources" -> totalResources.map { x => x: js.Any }),
        ("versionInfo" -> versionInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterContainerInstanceRequest]
    }
  }

  @js.native
  trait RegisterContainerInstanceResponse extends js.Object {
    var containerInstance: ContainerInstance
  }

  object RegisterContainerInstanceResponse {
    def apply(
      containerInstance: js.UndefOr[ContainerInstance] = js.undefined
    ): RegisterContainerInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerInstance" -> containerInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterContainerInstanceResponse]
    }
  }

  @js.native
  trait RegisterTaskDefinitionRequest extends js.Object {
    var taskRoleArn: String
    var volumes: VolumeList
    var containerDefinitions: ContainerDefinitions
    var networkMode: NetworkMode
    var placementConstraints: TaskDefinitionPlacementConstraints
    var family: String
  }

  object RegisterTaskDefinitionRequest {
    def apply(
      taskRoleArn: js.UndefOr[String] = js.undefined,
      volumes: js.UndefOr[VolumeList] = js.undefined,
      containerDefinitions: js.UndefOr[ContainerDefinitions] = js.undefined,
      networkMode: js.UndefOr[NetworkMode] = js.undefined,
      placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.undefined,
      family: js.UndefOr[String] = js.undefined
    ): RegisterTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskRoleArn" -> taskRoleArn.map { x => x: js.Any }),
        ("volumes" -> volumes.map { x => x: js.Any }),
        ("containerDefinitions" -> containerDefinitions.map { x => x: js.Any }),
        ("networkMode" -> networkMode.map { x => x: js.Any }),
        ("placementConstraints" -> placementConstraints.map { x => x: js.Any }),
        ("family" -> family.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskDefinitionRequest]
    }
  }

  @js.native
  trait RegisterTaskDefinitionResponse extends js.Object {
    var taskDefinition: TaskDefinition
  }

  object RegisterTaskDefinitionResponse {
    def apply(
      taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
    ): RegisterTaskDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskDefinitionResponse]
    }
  }

  /**
   * <p>Describes the resources available for a container instance.</p>
   */
  @js.native
  trait Resource extends js.Object {
    var stringSetValue: StringList
    var name: String
    var doubleValue: Double
    var integerValue: Integer
    var longValue: Long
    var `type`: String
  }

  object Resource {
    def apply(
      stringSetValue: js.UndefOr[StringList] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      doubleValue: js.UndefOr[Double] = js.undefined,
      integerValue: js.UndefOr[Integer] = js.undefined,
      longValue: js.UndefOr[Long] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined
    ): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("stringSetValue" -> stringSetValue.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("doubleValue" -> doubleValue.map { x => x: js.Any }),
        ("integerValue" -> integerValue.map { x => x: js.Any }),
        ("longValue" -> longValue.map { x => x: js.Any }),
        ("`type`" -> `type`.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  @js.native
  trait RunTaskRequest extends js.Object {
    var startedBy: String
    var count: BoxedInteger
    var placementStrategy: PlacementStrategies
    var overrides: TaskOverride
    var cluster: String
    var taskDefinition: String
    var placementConstraints: PlacementConstraints
    var group: String
  }

  object RunTaskRequest {
    def apply(
      startedBy: js.UndefOr[String] = js.undefined,
      count: js.UndefOr[BoxedInteger] = js.undefined,
      placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
      group: js.UndefOr[String] = js.undefined
    ): RunTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startedBy" -> startedBy.map { x => x: js.Any }),
        ("count" -> count.map { x => x: js.Any }),
        ("placementStrategy" -> placementStrategy.map { x => x: js.Any }),
        ("overrides" -> overrides.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any }),
        ("placementConstraints" -> placementConstraints.map { x => x: js.Any }),
        ("group" -> group.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunTaskRequest]
    }
  }

  @js.native
  trait RunTaskResponse extends js.Object {
    var tasks: Tasks
    var failures: Failures
  }

  object RunTaskResponse {
    def apply(
      tasks: js.UndefOr[Tasks] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined
    ): RunTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tasks" -> tasks.map { x => x: js.Any }),
        ("failures" -> failures.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunTaskResponse]
    }
  }

  /**
   * <p>These errors are usually caused by a server issue.</p>
   */
  @js.native
  trait ServerExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Details on a service within a cluster</p>
   */
  @js.native
  trait Service extends js.Object {
    var runningCount: Integer
    var placementStrategy: PlacementStrategies
    var desiredCount: Integer
    var serviceName: String
    var serviceArn: String
    var loadBalancers: LoadBalancers
    var deploymentConfiguration: DeploymentConfiguration
    var roleArn: String
    var status: String
    var createdAt: Timestamp
    var taskDefinition: String
    var clusterArn: String
    var placementConstraints: PlacementConstraints
    var deployments: Deployments
    var pendingCount: Integer
    var events: ServiceEvents
  }

  object Service {
    def apply(
      runningCount: js.UndefOr[Integer] = js.undefined,
      placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
      desiredCount: js.UndefOr[Integer] = js.undefined,
      serviceName: js.UndefOr[String] = js.undefined,
      serviceArn: js.UndefOr[String] = js.undefined,
      loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
      deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
      roleArn: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined,
      placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
      deployments: js.UndefOr[Deployments] = js.undefined,
      pendingCount: js.UndefOr[Integer] = js.undefined,
      events: js.UndefOr[ServiceEvents] = js.undefined
    ): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("runningCount" -> runningCount.map { x => x: js.Any }),
        ("placementStrategy" -> placementStrategy.map { x => x: js.Any }),
        ("desiredCount" -> desiredCount.map { x => x: js.Any }),
        ("serviceName" -> serviceName.map { x => x: js.Any }),
        ("serviceArn" -> serviceArn.map { x => x: js.Any }),
        ("loadBalancers" -> loadBalancers.map { x => x: js.Any }),
        ("deploymentConfiguration" -> deploymentConfiguration.map { x => x: js.Any }),
        ("roleArn" -> roleArn.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("createdAt" -> createdAt.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any }),
        ("clusterArn" -> clusterArn.map { x => x: js.Any }),
        ("placementConstraints" -> placementConstraints.map { x => x: js.Any }),
        ("deployments" -> deployments.map { x => x: js.Any }),
        ("pendingCount" -> pendingCount.map { x => x: js.Any }),
        ("events" -> events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }

  /**
   * <p>Details on an event associated with a service.</p>
   */
  @js.native
  trait ServiceEvent extends js.Object {
    var id: String
    var createdAt: Timestamp
    var message: String
  }

  object ServiceEvent {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      message: js.UndefOr[String] = js.undefined
    ): ServiceEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("id" -> id.map { x => x: js.Any }),
        ("createdAt" -> createdAt.map { x => x: js.Any }),
        ("message" -> message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceEvent]
    }
  }

  /**
   * <p>The specified service is not active. You cannot update a service that is not active. If you have previously deleted a service, you can re-create it with <a>CreateService</a>.</p>
   */
  @js.native
  trait ServiceNotActiveExceptionException extends js.Object {

  }

  /**
   * <p>The specified service could not be found. You can view your available services with <a>ListServices</a>. Amazon ECS services are cluster-specific and region-specific.</p>
   */
  @js.native
  trait ServiceNotFoundExceptionException extends js.Object {

  }


  object SortOrderEnum {
    val ASC = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
  }

  @js.native
  trait StartTaskRequest extends js.Object {
    var startedBy: String
    var overrides: TaskOverride
    var cluster: String
    var taskDefinition: String
    var containerInstances: StringList
    var group: String
  }

  object StartTaskRequest {
    def apply(
      startedBy: js.UndefOr[String] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      containerInstances: js.UndefOr[StringList] = js.undefined,
      group: js.UndefOr[String] = js.undefined
    ): StartTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startedBy" -> startedBy.map { x => x: js.Any }),
        ("overrides" -> overrides.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any }),
        ("containerInstances" -> containerInstances.map { x => x: js.Any }),
        ("group" -> group.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskRequest]
    }
  }

  @js.native
  trait StartTaskResponse extends js.Object {
    var tasks: Tasks
    var failures: Failures
  }

  object StartTaskResponse {
    def apply(
      tasks: js.UndefOr[Tasks] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined
    ): StartTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tasks" -> tasks.map { x => x: js.Any }),
        ("failures" -> failures.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskResponse]
    }
  }

  @js.native
  trait StopTaskRequest extends js.Object {
    var cluster: String
    var task: String
    var reason: String
  }

  object StopTaskRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      task: js.UndefOr[String] = js.undefined,
      reason: js.UndefOr[String] = js.undefined
    ): StopTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("task" -> task.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTaskRequest]
    }
  }

  @js.native
  trait StopTaskResponse extends js.Object {
    var task: Task
  }

  object StopTaskResponse {
    def apply(
      task: js.UndefOr[Task] = js.undefined
    ): StopTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("task" -> task.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTaskResponse]
    }
  }

  @js.native
  trait SubmitContainerStateChangeRequest extends js.Object {
    var containerName: String
    var task: String
    var networkBindings: NetworkBindings
    var exitCode: BoxedInteger
    var reason: String
    var cluster: String
    var status: String
  }

  object SubmitContainerStateChangeRequest {
    def apply(
      containerName: js.UndefOr[String] = js.undefined,
      task: js.UndefOr[String] = js.undefined,
      networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
      exitCode: js.UndefOr[BoxedInteger] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined
    ): SubmitContainerStateChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerName" -> containerName.map { x => x: js.Any }),
        ("task" -> task.map { x => x: js.Any }),
        ("networkBindings" -> networkBindings.map { x => x: js.Any }),
        ("exitCode" -> exitCode.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitContainerStateChangeRequest]
    }
  }

  @js.native
  trait SubmitContainerStateChangeResponse extends js.Object {
    var acknowledgment: String
  }

  object SubmitContainerStateChangeResponse {
    def apply(
      acknowledgment: js.UndefOr[String] = js.undefined
    ): SubmitContainerStateChangeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("acknowledgment" -> acknowledgment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitContainerStateChangeResponse]
    }
  }

  @js.native
  trait SubmitTaskStateChangeRequest extends js.Object {
    var cluster: String
    var task: String
    var status: String
    var reason: String
  }

  object SubmitTaskStateChangeRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      task: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      reason: js.UndefOr[String] = js.undefined
    ): SubmitTaskStateChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("task" -> task.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitTaskStateChangeRequest]
    }
  }

  @js.native
  trait SubmitTaskStateChangeResponse extends js.Object {
    var acknowledgment: String
  }

  object SubmitTaskStateChangeResponse {
    def apply(
      acknowledgment: js.UndefOr[String] = js.undefined
    ): SubmitTaskStateChangeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("acknowledgment" -> acknowledgment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitTaskStateChangeResponse]
    }
  }

  /**
   * <p>The specified target could not be found. You can view your available container instances with <a>ListContainerInstances</a>. Amazon ECS container instances are cluster-specific and region-specific.</p>
   */
  @js.native
  trait TargetNotFoundExceptionException extends js.Object {

  }


  object TargetTypeEnum {
    val `container-instance` = "container-instance"

    val values = IndexedSeq(`container-instance`)
  }

  /**
   * <p>Details on a task in a cluster.</p>
   */
  @js.native
  trait Task extends js.Object {
    var taskDefinitionArn: String
    var startedBy: String
    var lastStatus: String
    var stoppedAt: Timestamp
    var desiredStatus: String
    var stoppedReason: String
    var overrides: TaskOverride
    var version: Long
    var containers: Containers
    var taskArn: String
    var createdAt: Timestamp
    var startedAt: Timestamp
    var containerInstanceArn: String
    var clusterArn: String
    var group: String
  }

  object Task {
    def apply(
      taskDefinitionArn: js.UndefOr[String] = js.undefined,
      startedBy: js.UndefOr[String] = js.undefined,
      lastStatus: js.UndefOr[String] = js.undefined,
      stoppedAt: js.UndefOr[Timestamp] = js.undefined,
      desiredStatus: js.UndefOr[String] = js.undefined,
      stoppedReason: js.UndefOr[String] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      version: js.UndefOr[Long] = js.undefined,
      containers: js.UndefOr[Containers] = js.undefined,
      taskArn: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      startedAt: js.UndefOr[Timestamp] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined,
      group: js.UndefOr[String] = js.undefined
    ): Task = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinitionArn" -> taskDefinitionArn.map { x => x: js.Any }),
        ("startedBy" -> startedBy.map { x => x: js.Any }),
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("stoppedAt" -> stoppedAt.map { x => x: js.Any }),
        ("desiredStatus" -> desiredStatus.map { x => x: js.Any }),
        ("stoppedReason" -> stoppedReason.map { x => x: js.Any }),
        ("overrides" -> overrides.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any }),
        ("containers" -> containers.map { x => x: js.Any }),
        ("taskArn" -> taskArn.map { x => x: js.Any }),
        ("createdAt" -> createdAt.map { x => x: js.Any }),
        ("startedAt" -> startedAt.map { x => x: js.Any }),
        ("containerInstanceArn" -> containerInstanceArn.map { x => x: js.Any }),
        ("clusterArn" -> clusterArn.map { x => x: js.Any }),
        ("group" -> group.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Task]
    }
  }

  /**
   * <p>Details of a task definition.</p>
   */
  @js.native
  trait TaskDefinition extends js.Object {
    var taskDefinitionArn: String
    var requiresAttributes: RequiresAttributes
    var taskRoleArn: String
    var volumes: VolumeList
    var revision: Integer
    var status: TaskDefinitionStatus
    var containerDefinitions: ContainerDefinitions
    var networkMode: NetworkMode
    var placementConstraints: TaskDefinitionPlacementConstraints
    var family: String
  }

  object TaskDefinition {
    def apply(
      taskDefinitionArn: js.UndefOr[String] = js.undefined,
      requiresAttributes: js.UndefOr[RequiresAttributes] = js.undefined,
      taskRoleArn: js.UndefOr[String] = js.undefined,
      volumes: js.UndefOr[VolumeList] = js.undefined,
      revision: js.UndefOr[Integer] = js.undefined,
      status: js.UndefOr[TaskDefinitionStatus] = js.undefined,
      containerDefinitions: js.UndefOr[ContainerDefinitions] = js.undefined,
      networkMode: js.UndefOr[NetworkMode] = js.undefined,
      placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.undefined,
      family: js.UndefOr[String] = js.undefined
    ): TaskDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinitionArn" -> taskDefinitionArn.map { x => x: js.Any }),
        ("requiresAttributes" -> requiresAttributes.map { x => x: js.Any }),
        ("taskRoleArn" -> taskRoleArn.map { x => x: js.Any }),
        ("volumes" -> volumes.map { x => x: js.Any }),
        ("revision" -> revision.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("containerDefinitions" -> containerDefinitions.map { x => x: js.Any }),
        ("networkMode" -> networkMode.map { x => x: js.Any }),
        ("placementConstraints" -> placementConstraints.map { x => x: js.Any }),
        ("family" -> family.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskDefinition]
    }
  }


  object TaskDefinitionFamilyStatusEnum {
    val ACTIVE = "ACTIVE"
    val INACTIVE = "INACTIVE"
    val ALL = "ALL"

    val values = IndexedSeq(ACTIVE, INACTIVE, ALL)
  }

  /**
   * <p>An object representing a constraint on task placement in the task definition. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html">Task Placement Constraints</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.</p>
   */
  @js.native
  trait TaskDefinitionPlacementConstraint extends js.Object {
    var `type`: TaskDefinitionPlacementConstraintType
    var expression: String
  }

  object TaskDefinitionPlacementConstraint {
    def apply(
      `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.undefined,
      expression: js.UndefOr[String] = js.undefined
    ): TaskDefinitionPlacementConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("`type`" -> `type`.map { x => x: js.Any }),
        ("expression" -> expression.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskDefinitionPlacementConstraint]
    }
  }


  object TaskDefinitionPlacementConstraintTypeEnum {
    val memberOf = "memberOf"

    val values = IndexedSeq(memberOf)
  }


  object TaskDefinitionStatusEnum {
    val ACTIVE = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
  }

  /**
   * <p>The overrides associated with a task.</p>
   */
  @js.native
  trait TaskOverride extends js.Object {
    var containerOverrides: ContainerOverrides
    var taskRoleArn: String
  }

  object TaskOverride {
    def apply(
      containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined,
      taskRoleArn: js.UndefOr[String] = js.undefined
    ): TaskOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerOverrides" -> containerOverrides.map { x => x: js.Any }),
        ("taskRoleArn" -> taskRoleArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskOverride]
    }
  }


  object TransportProtocolEnum {
    val tcp = "tcp"
    val udp = "udp"

    val values = IndexedSeq(tcp, udp)
  }

  /**
   * <p>The <code>ulimit</code> settings to pass to the container.</p>
   */
  @js.native
  trait Ulimit extends js.Object {
    var name: UlimitName
    var softLimit: Integer
    var hardLimit: Integer
  }

  object Ulimit {
    def apply(
      name: js.UndefOr[UlimitName] = js.undefined,
      softLimit: js.UndefOr[Integer] = js.undefined,
      hardLimit: js.UndefOr[Integer] = js.undefined
    ): Ulimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("softLimit" -> softLimit.map { x => x: js.Any }),
        ("hardLimit" -> hardLimit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ulimit]
    }
  }


  object UlimitNameEnum {
    val core = "core"
    val cpu = "cpu"
    val data = "data"
    val fsize = "fsize"
    val locks = "locks"
    val memlock = "memlock"
    val msgqueue = "msgqueue"
    val nice = "nice"
    val nofile = "nofile"
    val nproc = "nproc"
    val rss = "rss"
    val rtprio = "rtprio"
    val rttime = "rttime"
    val sigpending = "sigpending"
    val stack = "stack"

    val values = IndexedSeq(core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack)
  }

  @js.native
  trait UpdateContainerAgentRequest extends js.Object {
    var cluster: String
    var containerInstance: String
  }

  object UpdateContainerAgentRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      containerInstance: js.UndefOr[String] = js.undefined
    ): UpdateContainerAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("containerInstance" -> containerInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContainerAgentRequest]
    }
  }

  @js.native
  trait UpdateContainerAgentResponse extends js.Object {
    var containerInstance: ContainerInstance
  }

  object UpdateContainerAgentResponse {
    def apply(
      containerInstance: js.UndefOr[ContainerInstance] = js.undefined
    ): UpdateContainerAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerInstance" -> containerInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContainerAgentResponse]
    }
  }

  /**
   * <p>There is already a current Amazon ECS container agent update in progress on the specified container instance. If the container agent becomes disconnected while it is in a transitional stage, such as <code>PENDING</code> or <code>STAGING</code>, the update process can get stuck in that state. However, when the agent reconnects, it resumes where it stopped previously.</p>
   */
  @js.native
  trait UpdateInProgressExceptionException extends js.Object {

  }

  @js.native
  trait UpdateServiceRequest extends js.Object {
    var desiredCount: BoxedInteger
    var service: String
    var cluster: String
    var deploymentConfiguration: DeploymentConfiguration
    var taskDefinition: String
  }

  object UpdateServiceRequest {
    def apply(
      desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
      service: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined
    ): UpdateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("desiredCount" -> desiredCount.map { x => x: js.Any }),
        ("service" -> service.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("deploymentConfiguration" -> deploymentConfiguration.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceRequest]
    }
  }

  @js.native
  trait UpdateServiceResponse extends js.Object {
    var service: Service
  }

  object UpdateServiceResponse {
    def apply(
      service: js.UndefOr[Service] = js.undefined
    ): UpdateServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("service" -> service.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceResponse]
    }
  }

  /**
   * <p>The Docker and Amazon ECS container agent version information about a container instance.</p>
   */
  @js.native
  trait VersionInfo extends js.Object {
    var agentVersion: String
    var agentHash: String
    var dockerVersion: String
  }

  object VersionInfo {
    def apply(
      agentVersion: js.UndefOr[String] = js.undefined,
      agentHash: js.UndefOr[String] = js.undefined,
      dockerVersion: js.UndefOr[String] = js.undefined
    ): VersionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("agentVersion" -> agentVersion.map { x => x: js.Any }),
        ("agentHash" -> agentHash.map { x => x: js.Any }),
        ("dockerVersion" -> dockerVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VersionInfo]
    }
  }

  /**
   * <p>A data volume used in a task definition.</p>
   */
  @js.native
  trait Volume extends js.Object {
    var name: String
    var host: HostVolumeProperties
  }

  object Volume {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      host: js.UndefOr[HostVolumeProperties] = js.undefined
    ): Volume = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("host" -> host.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
    }
  }

  /**
   * <p>Details on a data volume from another container.</p>
   */
  @js.native
  trait VolumeFrom extends js.Object {
    var sourceContainer: String
    var readOnly: BoxedBoolean
  }

  object VolumeFrom {
    def apply(
      sourceContainer: js.UndefOr[String] = js.undefined,
      readOnly: js.UndefOr[BoxedBoolean] = js.undefined
    ): VolumeFrom = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("sourceContainer" -> sourceContainer.map { x => x: js.Any }),
        ("readOnly" -> readOnly.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeFrom]
    }
  }
}
