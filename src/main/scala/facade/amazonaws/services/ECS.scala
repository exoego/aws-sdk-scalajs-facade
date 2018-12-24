package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object ecs {
  type AgentUpdateStatus = String
  type AssignPublicIp = String
  type AttachmentDetails = js.Array[KeyValuePair]
  type AttachmentStateChanges = js.Array[AttachmentStateChange]
  type Attachments = js.Array[Attachment]
  type Attributes = js.Array[Attribute]
  type BoxedBoolean = Boolean
  type BoxedInteger = Int
  type ClusterField = String
  type ClusterFieldList = js.Array[ClusterField]
  type Clusters = js.Array[Cluster]
  type Compatibility = String
  type CompatibilityList = js.Array[Compatibility]
  type Connectivity = String
  type ContainerDefinitions = js.Array[ContainerDefinition]
  type ContainerInstanceField = String
  type ContainerInstanceFieldList = js.Array[ContainerInstanceField]
  type ContainerInstanceStatus = String
  type ContainerInstances = js.Array[ContainerInstance]
  type ContainerOverrides = js.Array[ContainerOverride]
  type ContainerStateChanges = js.Array[ContainerStateChange]
  type Containers = js.Array[Container]
  type DeploymentControllerType = String
  type Deployments = js.Array[Deployment]
  type DesiredStatus = String
  type DeviceCgroupPermission = String
  type DeviceCgroupPermissions = js.Array[DeviceCgroupPermission]
  type DevicesList = js.Array[Device]
  type DockerLabelsMap = js.Dictionary[String]
  type EnvironmentVariables = js.Array[KeyValuePair]
  type Failures = js.Array[Failure]
  type HealthStatus = String
  type HostEntryList = js.Array[HostEntry]
  type IpcMode = String
  type LaunchType = String
  type LoadBalancers = js.Array[LoadBalancer]
  type LogConfigurationOptionsMap = js.Dictionary[String]
  type LogDriver = String
  type MountPointList = js.Array[MountPoint]
  type NetworkBindings = js.Array[NetworkBinding]
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NetworkMode = String
  type PidMode = String
  type PlacementConstraintType = String
  type PlacementConstraints = js.Array[PlacementConstraint]
  type PlacementStrategies = js.Array[PlacementStrategy]
  type PlacementStrategyType = String
  type PortMappingList = js.Array[PortMapping]
  type PropagateTags = String
  type RequiresAttributes = js.Array[Attribute]
  type Resources = js.Array[Resource]
  type ScaleUnit = String
  type SchedulingStrategy = String
  type Scope = String
  type SecretList = js.Array[Secret]
  type ServiceEvents = js.Array[ServiceEvent]
  type ServiceField = String
  type ServiceFieldList = js.Array[ServiceField]
  type ServiceRegistries = js.Array[ServiceRegistry]
  type Services = js.Array[Service]
  type SettingName = String
  type Settings = js.Array[Setting]
  type SortOrder = String
  type StabilityStatus = String
  type Statistics = js.Array[KeyValuePair]
  type StringList = js.Array[String]
  type StringMap = js.Dictionary[String]
  type SystemControls = js.Array[SystemControl]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TargetType = String
  type TaskDefinitionFamilyStatus = String
  type TaskDefinitionField = String
  type TaskDefinitionFieldList = js.Array[TaskDefinitionField]
  type TaskDefinitionPlacementConstraintType = String
  type TaskDefinitionPlacementConstraints = js.Array[TaskDefinitionPlacementConstraint]
  type TaskDefinitionStatus = String
  type TaskField = String
  type TaskFieldList = js.Array[TaskField]
  type TaskSets = js.Array[TaskSet]
  type TaskStopCode = String
  type Tasks = js.Array[Task]
  type Timestamp = js.Date
  type TmpfsList = js.Array[Tmpfs]
  type TransportProtocol = String
  type UlimitList = js.Array[Ulimit]
  type UlimitName = String
  type VolumeFromList = js.Array[VolumeFrom]
  type VolumeList = js.Array[Volume]
}

package ecs {
  @js.native
  @JSImport("aws-sdk", "ECS")
  class ECS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse] = js.native
    def deleteAccountSetting(params: DeleteAccountSettingRequest): Request[DeleteAccountSettingResponse] = js.native
    def deleteAttributes(params: DeleteAttributesRequest): Request[DeleteAttributesResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse] = js.native
    def deregisterContainerInstance(params: DeregisterContainerInstanceRequest): Request[DeregisterContainerInstanceResponse] = js.native
    def deregisterTaskDefinition(params: DeregisterTaskDefinitionRequest): Request[DeregisterTaskDefinitionResponse] = js.native
    def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse] = js.native
    def describeContainerInstances(params: DescribeContainerInstancesRequest): Request[DescribeContainerInstancesResponse] = js.native
    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse] = js.native
    def describeTaskDefinition(params: DescribeTaskDefinitionRequest): Request[DescribeTaskDefinitionResponse] = js.native
    def describeTasks(params: DescribeTasksRequest): Request[DescribeTasksResponse] = js.native
    def discoverPollEndpoint(params: DiscoverPollEndpointRequest): Request[DiscoverPollEndpointResponse] = js.native
    def listAccountSettings(params: ListAccountSettingsRequest): Request[ListAccountSettingsResponse] = js.native
    def listAttributes(params: ListAttributesRequest): Request[ListAttributesResponse] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse] = js.native
    def listContainerInstances(params: ListContainerInstancesRequest): Request[ListContainerInstancesResponse] = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTaskDefinitionFamilies(params: ListTaskDefinitionFamiliesRequest): Request[ListTaskDefinitionFamiliesResponse] = js.native
    def listTaskDefinitions(params: ListTaskDefinitionsRequest): Request[ListTaskDefinitionsResponse] = js.native
    def listTasks(params: ListTasksRequest): Request[ListTasksResponse] = js.native
    def putAccountSetting(params: PutAccountSettingRequest): Request[PutAccountSettingResponse] = js.native
    def putAttributes(params: PutAttributesRequest): Request[PutAttributesResponse] = js.native
    def registerContainerInstance(params: RegisterContainerInstanceRequest): Request[RegisterContainerInstanceResponse] = js.native
    def registerTaskDefinition(params: RegisterTaskDefinitionRequest): Request[RegisterTaskDefinitionResponse] = js.native
    def runTask(params: RunTaskRequest): Request[RunTaskResponse] = js.native
    def startTask(params: StartTaskRequest): Request[StartTaskResponse] = js.native
    def stopTask(params: StopTaskRequest): Request[StopTaskResponse] = js.native
    def submitContainerStateChange(params: SubmitContainerStateChangeRequest): Request[SubmitContainerStateChangeResponse] = js.native
    def submitTaskStateChange(params: SubmitTaskStateChangeRequest): Request[SubmitTaskStateChangeResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateContainerAgent(params: UpdateContainerAgentRequest): Request[UpdateContainerAgentResponse] = js.native
    def updateContainerInstancesState(params: UpdateContainerInstancesStateRequest): Request[UpdateContainerInstancesStateResponse] = js.native
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

  object AssignPublicIpEnum {
    val ENABLED = "ENABLED"
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
      `type`: js.UndefOr[String] = js.undefined): Attachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attachment]
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
      status: String): AttachmentStateChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachmentArn" -> attachmentArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachmentStateChange]
    }
  }

  /**
   * An attribute is a name-value pair associated with an Amazon ECS object. Attributes enable you to extend the Amazon ECS data model by adding custom metadata to your resources. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes">Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
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
      value: js.UndefOr[String] = js.undefined): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "targetId" -> targetId.map { x => x.asInstanceOf[js.Any] },
        "targetType" -> targetType.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
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
      securityGroups: js.UndefOr[StringList] = js.undefined): AwsVpcConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subnets" -> subnets.asInstanceOf[js.Any],
        "assignPublicIp" -> assignPublicIp.map { x => x.asInstanceOf[js.Any] },
        "securityGroups" -> securityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsVpcConfiguration]
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
      statistics: js.UndefOr[Statistics] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activeServicesCount" -> activeServicesCount.map { x => x.asInstanceOf[js.Any] },
        "clusterArn" -> clusterArn.map { x => x.asInstanceOf[js.Any] },
        "clusterName" -> clusterName.map { x => x.asInstanceOf[js.Any] },
        "pendingTasksCount" -> pendingTasksCount.map { x => x.asInstanceOf[js.Any] },
        "registeredContainerInstancesCount" -> registeredContainerInstancesCount.map { x => x.asInstanceOf[js.Any] },
        "runningTasksCount" -> runningTasksCount.map { x => x.asInstanceOf[js.Any] },
        "statistics" -> statistics.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
    }
  }

  object ClusterFieldEnum {
    val STATISTICS = "STATISTICS"
    val TAGS = "TAGS"

    val values = IndexedSeq(STATISTICS, TAGS)
  }

  object CompatibilityEnum {
    val EC2 = "EC2"
    val FARGATE = "FARGATE"

    val values = IndexedSeq(EC2, FARGATE)
  }

  object ConnectivityEnum {
    val CONNECTED = "CONNECTED"
    val DISCONNECTED = "DISCONNECTED"

    val values = IndexedSeq(CONNECTED, DISCONNECTED)
  }

  /**
   * A Docker container that is part of a task.
   */
  @js.native
  trait Container extends js.Object {
    var containerArn: js.UndefOr[String]
    var exitCode: js.UndefOr[BoxedInteger]
    var healthStatus: js.UndefOr[HealthStatus]
    var lastStatus: js.UndefOr[String]
    var name: js.UndefOr[String]
    var networkBindings: js.UndefOr[NetworkBindings]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var reason: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
  }

  object Container {
    def apply(
      containerArn: js.UndefOr[String] = js.undefined,
      exitCode: js.UndefOr[BoxedInteger] = js.undefined,
      healthStatus: js.UndefOr[HealthStatus] = js.undefined,
      lastStatus: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
      networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      taskArn: js.UndefOr[String] = js.undefined): Container = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerArn" -> containerArn.map { x => x.asInstanceOf[js.Any] },
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
        "healthStatus" -> healthStatus.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "networkBindings" -> networkBindings.map { x => x.asInstanceOf[js.Any] },
        "networkInterfaces" -> networkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "taskArn" -> taskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Container]
    }
  }

  /**
   * Container definitions are used in task definitions to describe the different containers that are launched as part of a task.
   */
  @js.native
  trait ContainerDefinition extends js.Object {
    var command: js.UndefOr[StringList]
    var cpu: js.UndefOr[Int]
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
    var secrets: js.UndefOr[SecretList]
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
      secrets: js.UndefOr[SecretList] = js.undefined,
      systemControls: js.UndefOr[SystemControls] = js.undefined,
      ulimits: js.UndefOr[UlimitList] = js.undefined,
      user: js.UndefOr[String] = js.undefined,
      volumesFrom: js.UndefOr[VolumeFromList] = js.undefined,
      workingDirectory: js.UndefOr[String] = js.undefined): ContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "command" -> command.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "disableNetworking" -> disableNetworking.map { x => x.asInstanceOf[js.Any] },
        "dnsSearchDomains" -> dnsSearchDomains.map { x => x.asInstanceOf[js.Any] },
        "dnsServers" -> dnsServers.map { x => x.asInstanceOf[js.Any] },
        "dockerLabels" -> dockerLabels.map { x => x.asInstanceOf[js.Any] },
        "dockerSecurityOptions" -> dockerSecurityOptions.map { x => x.asInstanceOf[js.Any] },
        "entryPoint" -> entryPoint.map { x => x.asInstanceOf[js.Any] },
        "environment" -> environment.map { x => x.asInstanceOf[js.Any] },
        "essential" -> essential.map { x => x.asInstanceOf[js.Any] },
        "extraHosts" -> extraHosts.map { x => x.asInstanceOf[js.Any] },
        "healthCheck" -> healthCheck.map { x => x.asInstanceOf[js.Any] },
        "hostname" -> hostname.map { x => x.asInstanceOf[js.Any] },
        "image" -> image.map { x => x.asInstanceOf[js.Any] },
        "interactive" -> interactive.map { x => x.asInstanceOf[js.Any] },
        "links" -> links.map { x => x.asInstanceOf[js.Any] },
        "linuxParameters" -> linuxParameters.map { x => x.asInstanceOf[js.Any] },
        "logConfiguration" -> logConfiguration.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] },
        "memoryReservation" -> memoryReservation.map { x => x.asInstanceOf[js.Any] },
        "mountPoints" -> mountPoints.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "portMappings" -> portMappings.map { x => x.asInstanceOf[js.Any] },
        "privileged" -> privileged.map { x => x.asInstanceOf[js.Any] },
        "pseudoTerminal" -> pseudoTerminal.map { x => x.asInstanceOf[js.Any] },
        "readonlyRootFilesystem" -> readonlyRootFilesystem.map { x => x.asInstanceOf[js.Any] },
        "repositoryCredentials" -> repositoryCredentials.map { x => x.asInstanceOf[js.Any] },
        "secrets" -> secrets.map { x => x.asInstanceOf[js.Any] },
        "systemControls" -> systemControls.map { x => x.asInstanceOf[js.Any] },
        "ulimits" -> ulimits.map { x => x.asInstanceOf[js.Any] },
        "user" -> user.map { x => x.asInstanceOf[js.Any] },
        "volumesFrom" -> volumesFrom.map { x => x.asInstanceOf[js.Any] },
        "workingDirectory" -> workingDirectory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDefinition]
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
      tags: js.UndefOr[Tags] = js.undefined,
      version: js.UndefOr[Double] = js.undefined,
      versionInfo: js.UndefOr[VersionInfo] = js.undefined): ContainerInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentConnected" -> agentConnected.map { x => x.asInstanceOf[js.Any] },
        "agentUpdateStatus" -> agentUpdateStatus.map { x => x.asInstanceOf[js.Any] },
        "attachments" -> attachments.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "containerInstanceArn" -> containerInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "ec2InstanceId" -> ec2InstanceId.map { x => x.asInstanceOf[js.Any] },
        "pendingTasksCount" -> pendingTasksCount.map { x => x.asInstanceOf[js.Any] },
        "registeredAt" -> registeredAt.map { x => x.asInstanceOf[js.Any] },
        "registeredResources" -> registeredResources.map { x => x.asInstanceOf[js.Any] },
        "remainingResources" -> remainingResources.map { x => x.asInstanceOf[js.Any] },
        "runningTasksCount" -> runningTasksCount.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "versionInfo" -> versionInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerInstance]
    }
  }

  object ContainerInstanceFieldEnum {
    val TAGS = "TAGS"

    val values = IndexedSeq(TAGS)
  }

  object ContainerInstanceStatusEnum {
    val ACTIVE = "ACTIVE"
    val DRAINING = "DRAINING"

    val values = IndexedSeq(ACTIVE, DRAINING)
  }

  /**
   * The overrides that should be sent to a container.
   */
  @js.native
  trait ContainerOverride extends js.Object {
    var command: js.UndefOr[StringList]
    var cpu: js.UndefOr[BoxedInteger]
    var environment: js.UndefOr[EnvironmentVariables]
    var memory: js.UndefOr[BoxedInteger]
    var memoryReservation: js.UndefOr[BoxedInteger]
    var name: js.UndefOr[String]
  }

  object ContainerOverride {
    def apply(
      command: js.UndefOr[StringList] = js.undefined,
      cpu: js.UndefOr[BoxedInteger] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      memory: js.UndefOr[BoxedInteger] = js.undefined,
      memoryReservation: js.UndefOr[BoxedInteger] = js.undefined,
      name: js.UndefOr[String] = js.undefined): ContainerOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        "command" -> command.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "environment" -> environment.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] },
        "memoryReservation" -> memoryReservation.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerOverride]
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
      status: js.UndefOr[String] = js.undefined): ContainerStateChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerName" -> containerName.map { x => x.asInstanceOf[js.Any] },
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
        "networkBindings" -> networkBindings.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerStateChange]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var clusterName: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  object CreateClusterRequest {
    def apply(
      clusterName: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): CreateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clusterName" -> clusterName.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    def apply(
      cluster: js.UndefOr[Cluster] = js.undefined): CreateClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait CreateServiceRequest extends js.Object {
    var serviceName: String
    var taskDefinition: String
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
  }

  object CreateServiceRequest {
    def apply(
      serviceName: String,
      taskDefinition: String,
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
      tags: js.UndefOr[Tags] = js.undefined): CreateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "serviceName" -> serviceName.asInstanceOf[js.Any],
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any],
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfiguration" -> deploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "deploymentController" -> deploymentController.map { x => x.asInstanceOf[js.Any] },
        "desiredCount" -> desiredCount.map { x => x.asInstanceOf[js.Any] },
        "enableECSManagedTags" -> enableECSManagedTags.map { x => x.asInstanceOf[js.Any] },
        "healthCheckGracePeriodSeconds" -> healthCheckGracePeriodSeconds.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "loadBalancers" -> loadBalancers.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "placementStrategy" -> placementStrategy.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "propagateTags" -> propagateTags.map { x => x.asInstanceOf[js.Any] },
        "role" -> role.map { x => x.asInstanceOf[js.Any] },
        "schedulingStrategy" -> schedulingStrategy.map { x => x.asInstanceOf[js.Any] },
        "serviceRegistries" -> serviceRegistries.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceRequest]
    }
  }

  @js.native
  trait CreateServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  object CreateServiceResponse {
    def apply(
      service: js.UndefOr[Service] = js.undefined): CreateServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "service" -> service.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceResponse]
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
      principalArn: js.UndefOr[String] = js.undefined): DeleteAccountSettingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "principalArn" -> principalArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountSettingRequest]
    }
  }

  @js.native
  trait DeleteAccountSettingResponse extends js.Object {
    var setting: js.UndefOr[Setting]
  }

  object DeleteAccountSettingResponse {
    def apply(
      setting: js.UndefOr[Setting] = js.undefined): DeleteAccountSettingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "setting" -> setting.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountSettingResponse]
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
      cluster: js.UndefOr[String] = js.undefined): DeleteAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAttributesRequest]
    }
  }

  @js.native
  trait DeleteAttributesResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
  }

  object DeleteAttributesResponse {
    def apply(
      attributes: js.UndefOr[Attributes] = js.undefined): DeleteAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAttributesResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var cluster: String
  }

  object DeleteClusterRequest {
    def apply(
      cluster: String): DeleteClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    def apply(
      cluster: js.UndefOr[Cluster] = js.undefined): DeleteClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResponse]
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
      force: js.UndefOr[BoxedBoolean] = js.undefined): DeleteServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "service" -> service.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceRequest]
    }
  }

  @js.native
  trait DeleteServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  object DeleteServiceResponse {
    def apply(
      service: js.UndefOr[Service] = js.undefined): DeleteServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "service" -> service.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceResponse]
    }
  }

  /**
   * The details of an Amazon ECS service deployment. This is used when a service uses the <code>CODE_DEPLOY</code> deployment controller type.
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
      updatedAt: js.UndefOr[Timestamp] = js.undefined): Deployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "desiredCount" -> desiredCount.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "pendingCount" -> pendingCount.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "runningCount" -> runningCount.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "updatedAt" -> updatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployment]
    }
  }

  /**
   * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
   */
  @js.native
  trait DeploymentConfiguration extends js.Object {
    var maximumPercent: js.UndefOr[BoxedInteger]
    var minimumHealthyPercent: js.UndefOr[BoxedInteger]
  }

  object DeploymentConfiguration {
    def apply(
      maximumPercent: js.UndefOr[BoxedInteger] = js.undefined,
      minimumHealthyPercent: js.UndefOr[BoxedInteger] = js.undefined): DeploymentConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maximumPercent" -> maximumPercent.map { x => x.asInstanceOf[js.Any] },
        "minimumHealthyPercent" -> minimumHealthyPercent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentConfiguration]
    }
  }

  /**
   * The deployment controller to use for the service. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html">Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
   */
  @js.native
  trait DeploymentController extends js.Object {
    var `type`: DeploymentControllerType
  }

  object DeploymentController {
    def apply(
      `type`: DeploymentControllerType): DeploymentController = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentController]
    }
  }

  object DeploymentControllerTypeEnum {
    val ECS = "ECS"
    val CODE_DEPLOY = "CODE_DEPLOY"

    val values = IndexedSeq(ECS, CODE_DEPLOY)
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
      force: js.UndefOr[BoxedBoolean] = js.undefined): DeregisterContainerInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstance" -> containerInstance.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterContainerInstanceRequest]
    }
  }

  @js.native
  trait DeregisterContainerInstanceResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  object DeregisterContainerInstanceResponse {
    def apply(
      containerInstance: js.UndefOr[ContainerInstance] = js.undefined): DeregisterContainerInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterContainerInstanceResponse]
    }
  }

  @js.native
  trait DeregisterTaskDefinitionRequest extends js.Object {
    var taskDefinition: String
  }

  object DeregisterTaskDefinitionRequest {
    def apply(
      taskDefinition: String): DeregisterTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTaskDefinitionRequest]
    }
  }

  @js.native
  trait DeregisterTaskDefinitionResponse extends js.Object {
    var taskDefinition: js.UndefOr[TaskDefinition]
  }

  object DeregisterTaskDefinitionResponse {
    def apply(
      taskDefinition: js.UndefOr[TaskDefinition] = js.undefined): DeregisterTaskDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTaskDefinitionResponse]
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
      include: js.UndefOr[ClusterFieldList] = js.undefined): DescribeClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clusters" -> clusters.map { x => x.asInstanceOf[js.Any] },
        "include" -> include.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersRequest]
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
      failures: js.UndefOr[Failures] = js.undefined): DescribeClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clusters" -> clusters.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersResponse]
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
      include: js.UndefOr[ContainerInstanceFieldList] = js.undefined): DescribeContainerInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstances" -> containerInstances.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "include" -> include.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContainerInstancesRequest]
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
      failures: js.UndefOr[Failures] = js.undefined): DescribeContainerInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstances" -> containerInstances.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContainerInstancesResponse]
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
      include: js.UndefOr[ServiceFieldList] = js.undefined): DescribeServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "services" -> services.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "include" -> include.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesRequest]
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
      services: js.UndefOr[Services] = js.undefined): DescribeServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] },
        "services" -> services.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesResponse]
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
      include: js.UndefOr[TaskDefinitionFieldList] = js.undefined): DescribeTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any],
        "include" -> include.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskDefinitionRequest]
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
      taskDefinition: js.UndefOr[TaskDefinition] = js.undefined): DescribeTaskDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskDefinitionResponse]
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
      include: js.UndefOr[TaskFieldList] = js.undefined): DescribeTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tasks" -> tasks.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "include" -> include.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTasksRequest]
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
      tasks: js.UndefOr[Tasks] = js.undefined): DescribeTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] },
        "tasks" -> tasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTasksResponse]
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
      permissions: js.UndefOr[DeviceCgroupPermissions] = js.undefined): Device = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hostPath" -> hostPath.asInstanceOf[js.Any],
        "containerPath" -> containerPath.map { x => x.asInstanceOf[js.Any] },
        "permissions" -> permissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Device]
    }
  }

  object DeviceCgroupPermissionEnum {
    val read = "read"
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
      containerInstance: js.UndefOr[String] = js.undefined): DiscoverPollEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverPollEndpointRequest]
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
      telemetryEndpoint: js.UndefOr[String] = js.undefined): DiscoverPollEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endpoint" -> endpoint.map { x => x.asInstanceOf[js.Any] },
        "telemetryEndpoint" -> telemetryEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverPollEndpointResponse]
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
      scope: js.UndefOr[Scope] = js.undefined): DockerVolumeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "autoprovision" -> autoprovision.map { x => x.asInstanceOf[js.Any] },
        "driver" -> driver.map { x => x.asInstanceOf[js.Any] },
        "driverOpts" -> driverOpts.map { x => x.asInstanceOf[js.Any] },
        "labels" -> labels.map { x => x.asInstanceOf[js.Any] },
        "scope" -> scope.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DockerVolumeConfiguration]
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
      reason: js.UndefOr[String] = js.undefined): Failure = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Failure]
    }
  }

  /**
   * An object representing a container health check. Health check parameters that are specified in a container definition override any Docker health checks that exist in the container image (such as those specified in a parent image or from the image's Dockerfile).
   *  The following are notes about container health check support:
   * * Container health checks require version 1.17.0 or greater of the Amazon ECS container agent. For more information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS Container Agent</a>.
   *  * Container health checks are supported for Fargate tasks if you are using platform version 1.1.0 or greater. For more information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform Versions</a>.
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
      timeout: js.UndefOr[BoxedInteger] = js.undefined): HealthCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        "command" -> command.asInstanceOf[js.Any],
        "interval" -> interval.map { x => x.asInstanceOf[js.Any] },
        "retries" -> retries.map { x => x.asInstanceOf[js.Any] },
        "startPeriod" -> startPeriod.map { x => x.asInstanceOf[js.Any] },
        "timeout" -> timeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheck]
    }
  }

  object HealthStatusEnum {
    val HEALTHY = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val UNKNOWN = "UNKNOWN"

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
      ipAddress: String): HostEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hostname" -> hostname.asInstanceOf[js.Any],
        "ipAddress" -> ipAddress.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostEntry]
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
      sourcePath: js.UndefOr[String] = js.undefined): HostVolumeProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sourcePath" -> sourcePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostVolumeProperties]
    }
  }

  object IpcModeEnum {
    val host = "host"
    val task = "task"
    val none = "none"

    val values = IndexedSeq(host, task, none)
  }

  /**
   * The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker. For more information on the default capabilities and the non-default available capabilities, see <a href="https://docs.docker.com/engine/reference/run/#runtime-privilege-and-linux-capabilities">Runtime privilege and Linux capabilities</a> in the <i>Docker run reference</i>. For more detailed information on these Linux capabilities, see the <a href="http://man7.org/linux/man-pages/man7/capabilities.7.html">capabilities(7)</a> Linux manual page.
   */
  @js.native
  trait KernelCapabilities extends js.Object {
    var add: js.UndefOr[StringList]
    var drop: js.UndefOr[StringList]
  }

  object KernelCapabilities {
    def apply(
      add: js.UndefOr[StringList] = js.undefined,
      drop: js.UndefOr[StringList] = js.undefined): KernelCapabilities = {
      val _fields = IndexedSeq[(String, js.Any)](
        "add" -> add.map { x => x.asInstanceOf[js.Any] },
        "drop" -> drop.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KernelCapabilities]
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
      value: js.UndefOr[String] = js.undefined): KeyValuePair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyValuePair]
    }
  }

  object LaunchTypeEnum {
    val EC2 = "EC2"
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
    var sharedMemorySize: js.UndefOr[BoxedInteger]
    var tmpfs: js.UndefOr[TmpfsList]
  }

  object LinuxParameters {
    def apply(
      capabilities: js.UndefOr[KernelCapabilities] = js.undefined,
      devices: js.UndefOr[DevicesList] = js.undefined,
      initProcessEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
      sharedMemorySize: js.UndefOr[BoxedInteger] = js.undefined,
      tmpfs: js.UndefOr[TmpfsList] = js.undefined): LinuxParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "capabilities" -> capabilities.map { x => x.asInstanceOf[js.Any] },
        "devices" -> devices.map { x => x.asInstanceOf[js.Any] },
        "initProcessEnabled" -> initProcessEnabled.map { x => x.asInstanceOf[js.Any] },
        "sharedMemorySize" -> sharedMemorySize.map { x => x.asInstanceOf[js.Any] },
        "tmpfs" -> tmpfs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LinuxParameters]
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
      value: js.UndefOr[String] = js.undefined): ListAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "effectiveSettings" -> effectiveSettings.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "principalArn" -> principalArn.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountSettingsRequest]
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
      settings: js.UndefOr[Settings] = js.undefined): ListAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "settings" -> settings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountSettingsResponse]
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
      nextToken: js.UndefOr[String] = js.undefined): ListAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetType" -> targetType.asInstanceOf[js.Any],
        "attributeName" -> attributeName.map { x => x.asInstanceOf[js.Any] },
        "attributeValue" -> attributeValue.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttributesRequest]
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
      nextToken: js.UndefOr[String] = js.undefined): ListAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttributesResponse]
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
      nextToken: js.UndefOr[String] = js.undefined): ListClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersRequest]
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
      nextToken: js.UndefOr[String] = js.undefined): ListClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clusterArns" -> clusterArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersResponse]
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
      status: js.UndefOr[ContainerInstanceStatus] = js.undefined): ListContainerInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListContainerInstancesRequest]
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
      nextToken: js.UndefOr[String] = js.undefined): ListContainerInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstanceArns" -> containerInstanceArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListContainerInstancesResponse]
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
      schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined): ListServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "schedulingStrategy" -> schedulingStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServicesRequest]
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
      serviceArns: js.UndefOr[StringList] = js.undefined): ListServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "serviceArns" -> serviceArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServicesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    def apply(
      resourceArn: String): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    def apply(
      tags: js.UndefOr[Tags] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
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
      status: js.UndefOr[TaskDefinitionFamilyStatus] = js.undefined): ListTaskDefinitionFamiliesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "familyPrefix" -> familyPrefix.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionFamiliesRequest]
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
      nextToken: js.UndefOr[String] = js.undefined): ListTaskDefinitionFamiliesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "families" -> families.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionFamiliesResponse]
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
      status: js.UndefOr[TaskDefinitionStatus] = js.undefined): ListTaskDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "familyPrefix" -> familyPrefix.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "sort" -> sort.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionsRequest]
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
      taskDefinitionArns: js.UndefOr[StringList] = js.undefined): ListTaskDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "taskDefinitionArns" -> taskDefinitionArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionsResponse]
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
      startedBy: js.UndefOr[String] = js.undefined): ListTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] },
        "desiredStatus" -> desiredStatus.map { x => x.asInstanceOf[js.Any] },
        "family" -> family.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "serviceName" -> serviceName.map { x => x.asInstanceOf[js.Any] },
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksRequest]
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
      taskArns: js.UndefOr[StringList] = js.undefined): ListTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "taskArns" -> taskArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksResponse]
    }
  }

  /**
   * Details on a load balancer that is used with a service.
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
      targetGroupArn: js.UndefOr[String] = js.undefined): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerName" -> containerName.map { x => x.asInstanceOf[js.Any] },
        "containerPort" -> containerPort.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "targetGroupArn" -> targetGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
    }
  }

  /**
   * Log configuration options to send to a custom log driver for the container.
   */
  @js.native
  trait LogConfiguration extends js.Object {
    var logDriver: LogDriver
    var options: js.UndefOr[LogConfigurationOptionsMap]
  }

  object LogConfiguration {
    def apply(
      logDriver: LogDriver,
      options: js.UndefOr[LogConfigurationOptionsMap] = js.undefined): LogConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logDriver" -> logDriver.asInstanceOf[js.Any],
        "options" -> options.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      sourceVolume: js.UndefOr[String] = js.undefined): MountPoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerPath" -> containerPath.map { x => x.asInstanceOf[js.Any] },
        "readOnly" -> readOnly.map { x => x.asInstanceOf[js.Any] },
        "sourceVolume" -> sourceVolume.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MountPoint]
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
      protocol: js.UndefOr[TransportProtocol] = js.undefined): NetworkBinding = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bindIP" -> bindIP.map { x => x.asInstanceOf[js.Any] },
        "containerPort" -> containerPort.map { x => x.asInstanceOf[js.Any] },
        "hostPort" -> hostPort.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkBinding]
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
      awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined): NetworkConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsvpcConfiguration" -> awsvpcConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkConfiguration]
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
      privateIpv4Address: js.UndefOr[String] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachmentId" -> attachmentId.map { x => x.asInstanceOf[js.Any] },
        "ipv6Address" -> ipv6Address.map { x => x.asInstanceOf[js.Any] },
        "privateIpv4Address" -> privateIpv4Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
    }
  }

  object NetworkModeEnum {
    val bridge = "bridge"
    val host = "host"
    val awsvpc = "awsvpc"
    val none = "none"

    val values = IndexedSeq(bridge, host, awsvpc, none)
  }

  object PidModeEnum {
    val host = "host"
    val task = "task"

    val values = IndexedSeq(host, task)
  }

  /**
   * An object representing a constraint on task placement. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html">Task Placement Constraints</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
   */
  @js.native
  trait PlacementConstraint extends js.Object {
    var expression: js.UndefOr[String]
    var `type`: js.UndefOr[PlacementConstraintType]
  }

  object PlacementConstraint {
    def apply(
      expression: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[PlacementConstraintType] = js.undefined): PlacementConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expression" -> expression.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementConstraint]
    }
  }

  object PlacementConstraintTypeEnum {
    val distinctInstance = "distinctInstance"
    val memberOf = "memberOf"

    val values = IndexedSeq(distinctInstance, memberOf)
  }

  /**
   * The task placement strategy for a task or service. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html">Task Placement Strategies</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
   */
  @js.native
  trait PlacementStrategy extends js.Object {
    var field: js.UndefOr[String]
    var `type`: js.UndefOr[PlacementStrategyType]
  }

  object PlacementStrategy {
    def apply(
      field: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[PlacementStrategyType] = js.undefined): PlacementStrategy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "field" -> field.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      protocol: js.UndefOr[TransportProtocol] = js.undefined): PortMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerPort" -> containerPort.map { x => x.asInstanceOf[js.Any] },
        "hostPort" -> hostPort.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortMapping]
    }
  }

  object PropagateTagsEnum {
    val TASK_DEFINITION = "TASK_DEFINITION"
    val SERVICE = "SERVICE"

    val values = IndexedSeq(TASK_DEFINITION, SERVICE)
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
      principalArn: js.UndefOr[String] = js.undefined): PutAccountSettingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any],
        "principalArn" -> principalArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAccountSettingRequest]
    }
  }

  @js.native
  trait PutAccountSettingResponse extends js.Object {
    var setting: js.UndefOr[Setting]
  }

  object PutAccountSettingResponse {
    def apply(
      setting: js.UndefOr[Setting] = js.undefined): PutAccountSettingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "setting" -> setting.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAccountSettingResponse]
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
      cluster: js.UndefOr[String] = js.undefined): PutAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAttributesRequest]
    }
  }

  @js.native
  trait PutAttributesResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
  }

  object PutAttributesResponse {
    def apply(
      attributes: js.UndefOr[Attributes] = js.undefined): PutAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAttributesResponse]
    }
  }

  @js.native
  trait RegisterContainerInstanceRequest extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var cluster: js.UndefOr[String]
    var containerInstanceArn: js.UndefOr[String]
    var instanceIdentityDocument: js.UndefOr[String]
    var instanceIdentityDocumentSignature: js.UndefOr[String]
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
      tags: js.UndefOr[Tags] = js.undefined,
      totalResources: js.UndefOr[Resources] = js.undefined,
      versionInfo: js.UndefOr[VersionInfo] = js.undefined): RegisterContainerInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerInstanceArn" -> containerInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "instanceIdentityDocument" -> instanceIdentityDocument.map { x => x.asInstanceOf[js.Any] },
        "instanceIdentityDocumentSignature" -> instanceIdentityDocumentSignature.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "totalResources" -> totalResources.map { x => x.asInstanceOf[js.Any] },
        "versionInfo" -> versionInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterContainerInstanceRequest]
    }
  }

  @js.native
  trait RegisterContainerInstanceResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  object RegisterContainerInstanceResponse {
    def apply(
      containerInstance: js.UndefOr[ContainerInstance] = js.undefined): RegisterContainerInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterContainerInstanceResponse]
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
      requiresCompatibilities: js.UndefOr[CompatibilityList] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      taskRoleArn: js.UndefOr[String] = js.undefined,
      volumes: js.UndefOr[VolumeList] = js.undefined): RegisterTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerDefinitions" -> containerDefinitions.asInstanceOf[js.Any],
        "family" -> family.asInstanceOf[js.Any],
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "executionRoleArn" -> executionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "ipcMode" -> ipcMode.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] },
        "networkMode" -> networkMode.map { x => x.asInstanceOf[js.Any] },
        "pidMode" -> pidMode.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "requiresCompatibilities" -> requiresCompatibilities.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "taskRoleArn" -> taskRoleArn.map { x => x.asInstanceOf[js.Any] },
        "volumes" -> volumes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskDefinitionRequest]
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
      taskDefinition: js.UndefOr[TaskDefinition] = js.undefined): RegisterTaskDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskDefinitionResponse]
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
      credentialsParameter: String): RepositoryCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "credentialsParameter" -> credentialsParameter.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RepositoryCredentials]
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
      `type`: js.UndefOr[String] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "doubleValue" -> doubleValue.map { x => x.asInstanceOf[js.Any] },
        "integerValue" -> integerValue.map { x => x.asInstanceOf[js.Any] },
        "longValue" -> longValue.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "stringSetValue" -> stringSetValue.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
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
      tags: js.UndefOr[Tags] = js.undefined): RunTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "enableECSManagedTags" -> enableECSManagedTags.map { x => x.asInstanceOf[js.Any] },
        "group" -> group.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "placementStrategy" -> placementStrategy.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "propagateTags" -> propagateTags.map { x => x.asInstanceOf[js.Any] },
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunTaskRequest]
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
      tasks: js.UndefOr[Tasks] = js.undefined): RunTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] },
        "tasks" -> tasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunTaskResponse]
    }
  }

  /**
   * A floating-point percentage of the desired number of tasks to place and keep running in the service. This is used when a service uses the <code>CODE_DEPLOY</code> deployment controller type.
   */
  @js.native
  trait Scale extends js.Object {
    var unit: js.UndefOr[ScaleUnit]
    var value: js.UndefOr[Double]
  }

  object Scale {
    def apply(
      unit: js.UndefOr[ScaleUnit] = js.undefined,
      value: js.UndefOr[Double] = js.undefined): Scale = {
      val _fields = IndexedSeq[(String, js.Any)](
        "unit" -> unit.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scale]
    }
  }

  object ScaleUnitEnum {
    val PERCENT = "PERCENT"

    val values = IndexedSeq(PERCENT)
  }

  object SchedulingStrategyEnum {
    val REPLICA = "REPLICA"
    val DAEMON = "DAEMON"

    val values = IndexedSeq(REPLICA, DAEMON)
  }

  object ScopeEnum {
    val task = "task"
    val shared = "shared"

    val values = IndexedSeq(task, shared)
  }

  /**
   * An object representing the secret to expose to your container.
   */
  @js.native
  trait Secret extends js.Object {
    var name: String
    var valueFrom: String
  }

  object Secret {
    def apply(
      name: String,
      valueFrom: String): Secret = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "valueFrom" -> valueFrom.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Secret]
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
      taskSets: js.UndefOr[TaskSets] = js.undefined): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clusterArn" -> clusterArn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "createdBy" -> createdBy.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfiguration" -> deploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "deploymentController" -> deploymentController.map { x => x.asInstanceOf[js.Any] },
        "deployments" -> deployments.map { x => x.asInstanceOf[js.Any] },
        "desiredCount" -> desiredCount.map { x => x.asInstanceOf[js.Any] },
        "enableECSManagedTags" -> enableECSManagedTags.map { x => x.asInstanceOf[js.Any] },
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "healthCheckGracePeriodSeconds" -> healthCheckGracePeriodSeconds.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "loadBalancers" -> loadBalancers.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "pendingCount" -> pendingCount.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "placementStrategy" -> placementStrategy.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "propagateTags" -> propagateTags.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "runningCount" -> runningCount.map { x => x.asInstanceOf[js.Any] },
        "schedulingStrategy" -> schedulingStrategy.map { x => x.asInstanceOf[js.Any] },
        "serviceArn" -> serviceArn.map { x => x.asInstanceOf[js.Any] },
        "serviceName" -> serviceName.map { x => x.asInstanceOf[js.Any] },
        "serviceRegistries" -> serviceRegistries.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "taskSets" -> taskSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
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
      message: js.UndefOr[String] = js.undefined): ServiceEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceEvent]
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
      registryArn: js.UndefOr[String] = js.undefined): ServiceRegistry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerName" -> containerName.map { x => x.asInstanceOf[js.Any] },
        "containerPort" -> containerPort.map { x => x.asInstanceOf[js.Any] },
        "port" -> port.map { x => x.asInstanceOf[js.Any] },
        "registryArn" -> registryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceRegistry]
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
      value: js.UndefOr[String] = js.undefined): Setting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "principalArn" -> principalArn.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Setting]
    }
  }

  object SettingNameEnum {
    val serviceLongArnFormat = "serviceLongArnFormat"
    val taskLongArnFormat = "taskLongArnFormat"
    val containerInstanceLongArnFormat = "containerInstanceLongArnFormat"

    val values = IndexedSeq(serviceLongArnFormat, taskLongArnFormat, containerInstanceLongArnFormat)
  }

  object SortOrderEnum {
    val ASC = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
  }

  object StabilityStatusEnum {
    val STEADY_STATE = "STEADY_STATE"
    val STABILIZING = "STABILIZING"

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
      tags: js.UndefOr[Tags] = js.undefined): StartTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstances" -> containerInstances.asInstanceOf[js.Any],
        "taskDefinition" -> taskDefinition.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "enableECSManagedTags" -> enableECSManagedTags.map { x => x.asInstanceOf[js.Any] },
        "group" -> group.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "propagateTags" -> propagateTags.map { x => x.asInstanceOf[js.Any] },
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskRequest]
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
      tasks: js.UndefOr[Tasks] = js.undefined): StartTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] },
        "tasks" -> tasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskResponse]
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
      reason: js.UndefOr[String] = js.undefined): StopTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "task" -> task.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTaskRequest]
    }
  }

  @js.native
  trait StopTaskResponse extends js.Object {
    var task: js.UndefOr[Task]
  }

  object StopTaskResponse {
    def apply(
      task: js.UndefOr[Task] = js.undefined): StopTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "task" -> task.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTaskResponse]
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
      task: js.UndefOr[String] = js.undefined): SubmitContainerStateChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerName" -> containerName.map { x => x.asInstanceOf[js.Any] },
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
        "networkBindings" -> networkBindings.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "task" -> task.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitContainerStateChangeRequest]
    }
  }

  @js.native
  trait SubmitContainerStateChangeResponse extends js.Object {
    var acknowledgment: js.UndefOr[String]
  }

  object SubmitContainerStateChangeResponse {
    def apply(
      acknowledgment: js.UndefOr[String] = js.undefined): SubmitContainerStateChangeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "acknowledgment" -> acknowledgment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitContainerStateChangeResponse]
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
      task: js.UndefOr[String] = js.undefined): SubmitTaskStateChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachments" -> attachments.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containers" -> containers.map { x => x.asInstanceOf[js.Any] },
        "executionStoppedAt" -> executionStoppedAt.map { x => x.asInstanceOf[js.Any] },
        "pullStartedAt" -> pullStartedAt.map { x => x.asInstanceOf[js.Any] },
        "pullStoppedAt" -> pullStoppedAt.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "task" -> task.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitTaskStateChangeRequest]
    }
  }

  @js.native
  trait SubmitTaskStateChangeResponse extends js.Object {
    var acknowledgment: js.UndefOr[String]
  }

  object SubmitTaskStateChangeResponse {
    def apply(
      acknowledgment: js.UndefOr[String] = js.undefined): SubmitTaskStateChangeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "acknowledgment" -> acknowledgment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitTaskStateChangeResponse]
    }
  }

  /**
   * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--sysctl</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
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
      value: js.UndefOr[String] = js.undefined): SystemControl = {
      val _fields = IndexedSeq[(String, js.Any)](
        "namespace" -> namespace.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SystemControl]
    }
  }

  /**
   * The metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
   */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      key: js.UndefOr[TagKey] = js.undefined,
      value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
      tags: Tags): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
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
      version: js.UndefOr[Double] = js.undefined): Task = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachments" -> attachments.map { x => x.asInstanceOf[js.Any] },
        "clusterArn" -> clusterArn.map { x => x.asInstanceOf[js.Any] },
        "connectivity" -> connectivity.map { x => x.asInstanceOf[js.Any] },
        "connectivityAt" -> connectivityAt.map { x => x.asInstanceOf[js.Any] },
        "containerInstanceArn" -> containerInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "containers" -> containers.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "desiredStatus" -> desiredStatus.map { x => x.asInstanceOf[js.Any] },
        "executionStoppedAt" -> executionStoppedAt.map { x => x.asInstanceOf[js.Any] },
        "group" -> group.map { x => x.asInstanceOf[js.Any] },
        "healthStatus" -> healthStatus.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "pullStartedAt" -> pullStartedAt.map { x => x.asInstanceOf[js.Any] },
        "pullStoppedAt" -> pullStoppedAt.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] },
        "stopCode" -> stopCode.map { x => x.asInstanceOf[js.Any] },
        "stoppedAt" -> stoppedAt.map { x => x.asInstanceOf[js.Any] },
        "stoppedReason" -> stoppedReason.map { x => x.asInstanceOf[js.Any] },
        "stoppingAt" -> stoppingAt.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "taskArn" -> taskArn.map { x => x.asInstanceOf[js.Any] },
        "taskDefinitionArn" -> taskDefinitionArn.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Task]
    }
  }

  /**
   * Details of a task definition.
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
      requiresAttributes: js.UndefOr[RequiresAttributes] = js.undefined,
      requiresCompatibilities: js.UndefOr[CompatibilityList] = js.undefined,
      revision: js.UndefOr[Int] = js.undefined,
      status: js.UndefOr[TaskDefinitionStatus] = js.undefined,
      taskDefinitionArn: js.UndefOr[String] = js.undefined,
      taskRoleArn: js.UndefOr[String] = js.undefined,
      volumes: js.UndefOr[VolumeList] = js.undefined): TaskDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "compatibilities" -> compatibilities.map { x => x.asInstanceOf[js.Any] },
        "containerDefinitions" -> containerDefinitions.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "executionRoleArn" -> executionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "family" -> family.map { x => x.asInstanceOf[js.Any] },
        "ipcMode" -> ipcMode.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] },
        "networkMode" -> networkMode.map { x => x.asInstanceOf[js.Any] },
        "pidMode" -> pidMode.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "requiresAttributes" -> requiresAttributes.map { x => x.asInstanceOf[js.Any] },
        "requiresCompatibilities" -> requiresCompatibilities.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "taskDefinitionArn" -> taskDefinitionArn.map { x => x.asInstanceOf[js.Any] },
        "taskRoleArn" -> taskRoleArn.map { x => x.asInstanceOf[js.Any] },
        "volumes" -> volumes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskDefinition]
    }
  }

  object TaskDefinitionFamilyStatusEnum {
    val ACTIVE = "ACTIVE"
    val INACTIVE = "INACTIVE"
    val ALL = "ALL"

    val values = IndexedSeq(ACTIVE, INACTIVE, ALL)
  }

  object TaskDefinitionFieldEnum {
    val TAGS = "TAGS"

    val values = IndexedSeq(TAGS)
  }

  /**
   * An object representing a constraint on task placement in the task definition.
   *  If you are using the Fargate launch type, task placement constraints are not supported.
   *  For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html">Task Placement Constraints</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
   */
  @js.native
  trait TaskDefinitionPlacementConstraint extends js.Object {
    var expression: js.UndefOr[String]
    var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType]
  }

  object TaskDefinitionPlacementConstraint {
    def apply(
      expression: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.undefined): TaskDefinitionPlacementConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expression" -> expression.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      taskRoleArn: js.UndefOr[String] = js.undefined): TaskOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerOverrides" -> containerOverrides.map { x => x.asInstanceOf[js.Any] },
        "executionRoleArn" -> executionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "taskRoleArn" -> taskRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskOverride]
    }
  }

  /**
   * Information about a set of Amazon ECS tasks in an AWS CodeDeploy deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
   */
  @js.native
  trait TaskSet extends js.Object {
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
      stabilityStatus: js.UndefOr[StabilityStatus] = js.undefined,
      stabilityStatusAt: js.UndefOr[Timestamp] = js.undefined,
      startedBy: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      taskSetArn: js.UndefOr[String] = js.undefined,
      updatedAt: js.UndefOr[Timestamp] = js.undefined): TaskSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computedDesiredCount" -> computedDesiredCount.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "externalId" -> externalId.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "loadBalancers" -> loadBalancers.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "pendingCount" -> pendingCount.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "runningCount" -> runningCount.map { x => x.asInstanceOf[js.Any] },
        "scale" -> scale.map { x => x.asInstanceOf[js.Any] },
        "stabilityStatus" -> stabilityStatus.map { x => x.asInstanceOf[js.Any] },
        "stabilityStatusAt" -> stabilityStatusAt.map { x => x.asInstanceOf[js.Any] },
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "taskSetArn" -> taskSetArn.map { x => x.asInstanceOf[js.Any] },
        "updatedAt" -> updatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskSet]
    }
  }

  object TaskStopCodeEnum {
    val TaskFailedToStart = "TaskFailedToStart"
    val EssentialContainerExited = "EssentialContainerExited"
    val UserInitiated = "UserInitiated"

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
      mountOptions: js.UndefOr[StringList] = js.undefined): Tmpfs = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerPath" -> containerPath.asInstanceOf[js.Any],
        "size" -> size.asInstanceOf[js.Any],
        "mountOptions" -> mountOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tmpfs]
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
      softLimit: Int): Ulimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hardLimit" -> hardLimit.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "softLimit" -> softLimit.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(
      resourceArn: String,
      tagKeys: TagKeys): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
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
      cluster: js.UndefOr[String] = js.undefined): UpdateContainerAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstance" -> containerInstance.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContainerAgentRequest]
    }
  }

  @js.native
  trait UpdateContainerAgentResponse extends js.Object {
    var containerInstance: js.UndefOr[ContainerInstance]
  }

  object UpdateContainerAgentResponse {
    def apply(
      containerInstance: js.UndefOr[ContainerInstance] = js.undefined): UpdateContainerAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContainerAgentResponse]
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
      cluster: js.UndefOr[String] = js.undefined): UpdateContainerInstancesStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstances" -> containerInstances.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContainerInstancesStateRequest]
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
      failures: js.UndefOr[Failures] = js.undefined): UpdateContainerInstancesStateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstances" -> containerInstances.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContainerInstancesStateResponse]
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
      taskDefinition: js.UndefOr[String] = js.undefined): UpdateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "service" -> service.asInstanceOf[js.Any],
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfiguration" -> deploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "desiredCount" -> desiredCount.map { x => x.asInstanceOf[js.Any] },
        "forceNewDeployment" -> forceNewDeployment.map { x => x.asInstanceOf[js.Any] },
        "healthCheckGracePeriodSeconds" -> healthCheckGracePeriodSeconds.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceRequest]
    }
  }

  @js.native
  trait UpdateServiceResponse extends js.Object {
    var service: js.UndefOr[Service]
  }

  object UpdateServiceResponse {
    def apply(
      service: js.UndefOr[Service] = js.undefined): UpdateServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "service" -> service.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceResponse]
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
      dockerVersion: js.UndefOr[String] = js.undefined): VersionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentHash" -> agentHash.map { x => x.asInstanceOf[js.Any] },
        "agentVersion" -> agentVersion.map { x => x.asInstanceOf[js.Any] },
        "dockerVersion" -> dockerVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VersionInfo]
    }
  }

  /**
   * A data volume used in a task definition. For tasks that use a Docker volume, specify a <code>DockerVolumeConfiguration</code>. For tasks that use a bind mount host volume, specify a <code>host</code> and optional <code>sourcePath</code>. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html">Using Data Volumes in Tasks</a>.
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
      name: js.UndefOr[String] = js.undefined): Volume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dockerVolumeConfiguration" -> dockerVolumeConfiguration.map { x => x.asInstanceOf[js.Any] },
        "host" -> host.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
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
      sourceContainer: js.UndefOr[String] = js.undefined): VolumeFrom = {
      val _fields = IndexedSeq[(String, js.Any)](
        "readOnly" -> readOnly.map { x => x.asInstanceOf[js.Any] },
        "sourceContainer" -> sourceContainer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeFrom]
    }
  }
}
