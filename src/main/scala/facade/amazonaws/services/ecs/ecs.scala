package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object ecs {
  type BoxedBoolean = Boolean
  type BoxedInteger = Integer
  type Clusters = js.Array[Cluster]
  type ContainerDefinitions = js.Array[ContainerDefinition]
  type ContainerInstances = js.Array[ContainerInstance]
  type ContainerOverrides = js.Array[ContainerOverride]
  type Containers = js.Array[Container]
  type Deployments = js.Array[Deployment]
  type EnvironmentVariables = js.Array[KeyValuePair]
  type Failures = js.Array[Failure]
  type LoadBalancers = js.Array[LoadBalancer]
  type MountPointList = js.Array[MountPoint]
  type NetworkBindings = js.Array[NetworkBinding]
  type PortMappingList = js.Array[PortMapping]
  type Resources = js.Array[Resource]
  type ServiceEvents = js.Array[ServiceEvent]
  type Services = js.Array[Service]
  type StringList = js.Array[String]
  type Tasks = js.Array[Task]
  type Timestamp = js.Date
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
    def updateService(params: UpdateServiceRequest, callback: Callback[UpdateServiceResponse]): Unit = js.native
    def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse] = js.native
  }

  /**
   * <p>These errors are usually caused by something the client did, such as use an action or resource on behalf of a user that doesn't have permission to use the action or resource, or specify an identifier that is not valid.</p>
   */
  @js.native
  trait ClientExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>A regional grouping of one or more container instances on which you can run task requests. Each account receives a default cluster the first time you use the Amazon ECS service, but you may also create other clusters. Clusters may contain more than one instance type simultaneously.</p> <important> <p>During the preview, each account is limited to two clusters.</p> </important>
   */
  @js.native
  trait Cluster extends js.Object {
    var runningTasksCount: Integer
    var pendingTasksCount: Integer
    var status: String
    var clusterArn: String
    var registeredContainerInstancesCount: Integer
    var clusterName: String
  }

  object Cluster {
    def apply(
      runningTasksCount: js.UndefOr[Integer] = js.undefined,
      pendingTasksCount: js.UndefOr[Integer] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined,
      registeredContainerInstancesCount: js.UndefOr[Integer] = js.undefined,
      clusterName: js.UndefOr[String] = js.undefined
    ): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
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
    var mountPoints: MountPointList
    var name: String
    var entryPoint: StringList
    var portMappings: PortMappingList
    var essential: BoxedBoolean
    var image: String
    var command: StringList
    var links: StringList
    var volumesFrom: VolumeFromList
    var cpu: Integer
    var environment: EnvironmentVariables
    var memory: Integer
  }

  object ContainerDefinition {
    def apply(
      mountPoints: js.UndefOr[MountPointList] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      entryPoint: js.UndefOr[StringList] = js.undefined,
      portMappings: js.UndefOr[PortMappingList] = js.undefined,
      essential: js.UndefOr[BoxedBoolean] = js.undefined,
      image: js.UndefOr[String] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      links: js.UndefOr[StringList] = js.undefined,
      volumesFrom: js.UndefOr[VolumeFromList] = js.undefined,
      cpu: js.UndefOr[Integer] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      memory: js.UndefOr[Integer] = js.undefined
    ): ContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("mountPoints" -> mountPoints.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("entryPoint" -> entryPoint.map { x => x: js.Any }),
        ("portMappings" -> portMappings.map { x => x: js.Any }),
        ("essential" -> essential.map { x => x: js.Any }),
        ("image" -> image.map { x => x: js.Any }),
        ("command" -> command.map { x => x: js.Any }),
        ("links" -> links.map { x => x: js.Any }),
        ("volumesFrom" -> volumesFrom.map { x => x: js.Any }),
        ("cpu" -> cpu.map { x => x: js.Any }),
        ("environment" -> environment.map { x => x: js.Any }),
        ("memory" -> memory.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDefinition]
    }
  }

  /**
   * <p>An Amazon EC2 instance that is running the Amazon ECS agent and has been registered with a cluster.</p>
   */
  @js.native
  trait ContainerInstance extends js.Object {
    var remainingResources: Resources
    var registeredResources: Resources
    var ec2InstanceId: String
    var runningTasksCount: Integer
    var pendingTasksCount: Integer
    var agentConnected: Boolean
    var status: String
    var containerInstanceArn: String
  }

  object ContainerInstance {
    def apply(
      remainingResources: js.UndefOr[Resources] = js.undefined,
      registeredResources: js.UndefOr[Resources] = js.undefined,
      ec2InstanceId: js.UndefOr[String] = js.undefined,
      runningTasksCount: js.UndefOr[Integer] = js.undefined,
      pendingTasksCount: js.UndefOr[Integer] = js.undefined,
      agentConnected: js.UndefOr[Boolean] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined
    ): ContainerInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("remainingResources" -> remainingResources.map { x => x: js.Any }),
        ("registeredResources" -> registeredResources.map { x => x: js.Any }),
        ("ec2InstanceId" -> ec2InstanceId.map { x => x: js.Any }),
        ("runningTasksCount" -> runningTasksCount.map { x => x: js.Any }),
        ("pendingTasksCount" -> pendingTasksCount.map { x => x: js.Any }),
        ("agentConnected" -> agentConnected.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("containerInstanceArn" -> containerInstanceArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerInstance]
    }
  }

  /**
   * <p>The name of a container in a task definition and the command it should run instead of its default.</p>
   */
  @js.native
  trait ContainerOverride extends js.Object {
    var name: String
    var command: StringList
  }

  object ContainerOverride {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined
    ): ContainerOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("command" -> command.map { x => x: js.Any })
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
    var role: String
    var desiredCount: BoxedInteger
    var serviceName: String
    var clientToken: String
    var loadBalancers: LoadBalancers
    var cluster: String
    var taskDefinition: String
  }

  object CreateServiceRequest {
    def apply(
      role: js.UndefOr[String] = js.undefined,
      desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
      serviceName: js.UndefOr[String] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined,
      loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined
    ): CreateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("role" -> role.map { x => x: js.Any }),
        ("desiredCount" -> desiredCount.map { x => x: js.Any }),
        ("serviceName" -> serviceName.map { x => x: js.Any }),
        ("clientToken" -> clientToken.map { x => x: js.Any }),
        ("loadBalancers" -> loadBalancers.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any })
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
  }

  object DiscoverPollEndpointResponse {
    def apply(
      endpoint: js.UndefOr[String] = js.undefined
    ): DiscoverPollEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("endpoint" -> endpoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverPollEndpointResponse]
    }
  }

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
    var nextToken: String
    var maxResults: BoxedInteger
  }

  object ListContainerInstancesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined
    ): ListContainerInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
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
    var nextToken: String
    var maxResults: BoxedInteger
  }

  object ListTaskDefinitionFamiliesRequest {
    def apply(
      familyPrefix: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined
    ): ListTaskDefinitionFamiliesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("familyPrefix" -> familyPrefix.map { x => x: js.Any }),
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
    var familyPrefix: String
    var nextToken: String
    var maxResults: BoxedInteger
  }

  object ListTaskDefinitionsRequest {
    def apply(
      familyPrefix: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined
    ): ListTaskDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("familyPrefix" -> familyPrefix.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("maxResults" -> maxResults.map { x => x: js.Any })
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
      nextToken: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      family: js.UndefOr[String] = js.undefined
    ): ListTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startedBy" -> startedBy.map { x => x: js.Any }),
        ("containerInstance" -> containerInstance.map { x => x: js.Any }),
        ("maxResults" -> maxResults.map { x => x: js.Any }),
        ("serviceName" -> serviceName.map { x => x: js.Any }),
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

  @js.native
  trait LoadBalancer extends js.Object {
    var loadBalancerName: String
    var containerName: String
    var containerPort: BoxedInteger
  }

  object LoadBalancer {
    def apply(
      loadBalancerName: js.UndefOr[String] = js.undefined,
      containerName: js.UndefOr[String] = js.undefined,
      containerPort: js.UndefOr[BoxedInteger] = js.undefined
    ): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("loadBalancerName" -> loadBalancerName.map { x => x: js.Any }),
        ("containerName" -> containerName.map { x => x: js.Any }),
        ("containerPort" -> containerPort.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
    }
  }

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

  @js.native
  trait NetworkBinding extends js.Object {
    var bindIP: String
    var containerPort: BoxedInteger
    var hostPort: BoxedInteger
  }

  object NetworkBinding {
    def apply(
      bindIP: js.UndefOr[String] = js.undefined,
      containerPort: js.UndefOr[BoxedInteger] = js.undefined,
      hostPort: js.UndefOr[BoxedInteger] = js.undefined
    ): NetworkBinding = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("bindIP" -> bindIP.map { x => x: js.Any }),
        ("containerPort" -> containerPort.map { x => x: js.Any }),
        ("hostPort" -> hostPort.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkBinding]
    }
  }

  /**
   * <p>Port mappings allow containers to access ports on the host container instance to send or receive traffic. Port mappings are specified as part of the container definition.</p>
   */
  @js.native
  trait PortMapping extends js.Object {
    var containerPort: Integer
    var hostPort: Integer
  }

  object PortMapping {
    def apply(
      containerPort: js.UndefOr[Integer] = js.undefined,
      hostPort: js.UndefOr[Integer] = js.undefined
    ): PortMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerPort" -> containerPort.map { x => x: js.Any }),
        ("hostPort" -> hostPort.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortMapping]
    }
  }

  @js.native
  trait RegisterContainerInstanceRequest extends js.Object {
    var instanceIdentityDocument: String
    var instanceIdentityDocumentSignature: String
    var cluster: String
    var totalResources: Resources
    var versionInfo: VersionInfo
  }

  object RegisterContainerInstanceRequest {
    def apply(
      instanceIdentityDocument: js.UndefOr[String] = js.undefined,
      instanceIdentityDocumentSignature: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      totalResources: js.UndefOr[Resources] = js.undefined,
      versionInfo: js.UndefOr[VersionInfo] = js.undefined
    ): RegisterContainerInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("instanceIdentityDocument" -> instanceIdentityDocument.map { x => x: js.Any }),
        ("instanceIdentityDocumentSignature" -> instanceIdentityDocumentSignature.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
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
    var family: String
    var containerDefinitions: ContainerDefinitions
    var volumes: VolumeList
  }

  object RegisterTaskDefinitionRequest {
    def apply(
      family: js.UndefOr[String] = js.undefined,
      containerDefinitions: js.UndefOr[ContainerDefinitions] = js.undefined,
      volumes: js.UndefOr[VolumeList] = js.undefined
    ): RegisterTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("family" -> family.map { x => x: js.Any }),
        ("containerDefinitions" -> containerDefinitions.map { x => x: js.Any }),
        ("volumes" -> volumes.map { x => x: js.Any })
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
    var overrides: TaskOverride
    var cluster: String
    var taskDefinition: String
  }

  object RunTaskRequest {
    def apply(
      startedBy: js.UndefOr[String] = js.undefined,
      count: js.UndefOr[BoxedInteger] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined
    ): RunTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startedBy" -> startedBy.map { x => x: js.Any }),
        ("count" -> count.map { x => x: js.Any }),
        ("overrides" -> overrides.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any })
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
   * <p>These errors are usually caused by a server-side issue.</p>
   */
  @js.native
  trait ServerExceptionException extends js.Object {
    var message: String
  }

  @js.native
  trait Service extends js.Object {
    var runningCount: Integer
    var desiredCount: Integer
    var serviceName: String
    var serviceArn: String
    var loadBalancers: LoadBalancers
    var roleArn: String
    var status: String
    var taskDefinition: String
    var clusterArn: String
    var deployments: Deployments
    var pendingCount: Integer
    var events: ServiceEvents
  }

  object Service {
    def apply(
      runningCount: js.UndefOr[Integer] = js.undefined,
      desiredCount: js.UndefOr[Integer] = js.undefined,
      serviceName: js.UndefOr[String] = js.undefined,
      serviceArn: js.UndefOr[String] = js.undefined,
      loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
      roleArn: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined,
      deployments: js.UndefOr[Deployments] = js.undefined,
      pendingCount: js.UndefOr[Integer] = js.undefined,
      events: js.UndefOr[ServiceEvents] = js.undefined
    ): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("runningCount" -> runningCount.map { x => x: js.Any }),
        ("desiredCount" -> desiredCount.map { x => x: js.Any }),
        ("serviceName" -> serviceName.map { x => x: js.Any }),
        ("serviceArn" -> serviceArn.map { x => x: js.Any }),
        ("loadBalancers" -> loadBalancers.map { x => x: js.Any }),
        ("roleArn" -> roleArn.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any }),
        ("clusterArn" -> clusterArn.map { x => x: js.Any }),
        ("deployments" -> deployments.map { x => x: js.Any }),
        ("pendingCount" -> pendingCount.map { x => x: js.Any }),
        ("events" -> events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }

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

  @js.native
  trait StartTaskRequest extends js.Object {
    var startedBy: String
    var overrides: TaskOverride
    var cluster: String
    var taskDefinition: String
    var containerInstances: StringList
  }

  object StartTaskRequest {
    def apply(
      startedBy: js.UndefOr[String] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      containerInstances: js.UndefOr[StringList] = js.undefined
    ): StartTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startedBy" -> startedBy.map { x => x: js.Any }),
        ("overrides" -> overrides.map { x => x: js.Any }),
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("taskDefinition" -> taskDefinition.map { x => x: js.Any }),
        ("containerInstances" -> containerInstances.map { x => x: js.Any })
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
  }

  object StopTaskRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      task: js.UndefOr[String] = js.undefined
    ): StopTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("task" -> task.map { x => x: js.Any })
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

  @js.native
  trait Task extends js.Object {
    var taskDefinitionArn: String
    var startedBy: String
    var lastStatus: String
    var desiredStatus: String
    var overrides: TaskOverride
    var containers: Containers
    var taskArn: String
    var containerInstanceArn: String
    var clusterArn: String
  }

  object Task {
    def apply(
      taskDefinitionArn: js.UndefOr[String] = js.undefined,
      startedBy: js.UndefOr[String] = js.undefined,
      lastStatus: js.UndefOr[String] = js.undefined,
      desiredStatus: js.UndefOr[String] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      containers: js.UndefOr[Containers] = js.undefined,
      taskArn: js.UndefOr[String] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined
    ): Task = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinitionArn" -> taskDefinitionArn.map { x => x: js.Any }),
        ("startedBy" -> startedBy.map { x => x: js.Any }),
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("desiredStatus" -> desiredStatus.map { x => x: js.Any }),
        ("overrides" -> overrides.map { x => x: js.Any }),
        ("containers" -> containers.map { x => x: js.Any }),
        ("taskArn" -> taskArn.map { x => x: js.Any }),
        ("containerInstanceArn" -> containerInstanceArn.map { x => x: js.Any }),
        ("clusterArn" -> clusterArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Task]
    }
  }

  @js.native
  trait TaskDefinition extends js.Object {
    var taskDefinitionArn: String
    var volumes: VolumeList
    var revision: Integer
    var containerDefinitions: ContainerDefinitions
    var family: String
  }

  object TaskDefinition {
    def apply(
      taskDefinitionArn: js.UndefOr[String] = js.undefined,
      volumes: js.UndefOr[VolumeList] = js.undefined,
      revision: js.UndefOr[Integer] = js.undefined,
      containerDefinitions: js.UndefOr[ContainerDefinitions] = js.undefined,
      family: js.UndefOr[String] = js.undefined
    ): TaskDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskDefinitionArn" -> taskDefinitionArn.map { x => x: js.Any }),
        ("volumes" -> volumes.map { x => x: js.Any }),
        ("revision" -> revision.map { x => x: js.Any }),
        ("containerDefinitions" -> containerDefinitions.map { x => x: js.Any }),
        ("family" -> family.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskDefinition]
    }
  }

  /**
   * <p>A list of container overrides in JSON format that specify the name of a container in a task definition and the command it should run instead of its default.</p>
   */
  @js.native
  trait TaskOverride extends js.Object {
    var containerOverrides: ContainerOverrides
  }

  object TaskOverride {
    def apply(
      containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined
    ): TaskOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("containerOverrides" -> containerOverrides.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskOverride]
    }
  }

  @js.native
  trait UpdateServiceRequest extends js.Object {
    var cluster: String
    var service: String
    var desiredCount: BoxedInteger
    var taskDefinition: String
  }

  object UpdateServiceRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      service: js.UndefOr[String] = js.undefined,
      desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined
    ): UpdateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cluster" -> cluster.map { x => x: js.Any }),
        ("service" -> service.map { x => x: js.Any }),
        ("desiredCount" -> desiredCount.map { x => x: js.Any }),
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
