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
  class ECS(config: AWSConfig) extends js.Object {
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
   * <p>An object representing a container instance or task attachment.</p>
   */
  @js.native
  trait Attachment extends js.Object {
    var id: js.UndefOr[String]
    var `type`: js.UndefOr[String]
    var status: js.UndefOr[String]
    var details: js.UndefOr[AttachmentDetails]
  }

  object Attachment {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      details: js.UndefOr[AttachmentDetails] = js.undefined): Attachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attachment]
    }
  }

  /**
   * <p>An object representing a change in state for a task attachment.</p>
   */
  @js.native
  trait AttachmentStateChange extends js.Object {
    var attachmentArn: js.UndefOr[String]
    var status: js.UndefOr[String]
  }

  object AttachmentStateChange {
    def apply(
      attachmentArn: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined): AttachmentStateChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachmentArn" -> attachmentArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachmentStateChange]
    }
  }

  /**
   * <p>An attribute is a name-value pair associated with an Amazon ECS object. Attributes enable you to extend the Amazon ECS data model by adding custom metadata to your resources. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes">Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
   */
  @js.native
  trait Attribute extends js.Object {
    var name: js.UndefOr[String]
    var value: js.UndefOr[String]
    var targetType: js.UndefOr[TargetType]
    var targetId: js.UndefOr[String]
  }

  object Attribute {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[String] = js.undefined,
      targetType: js.UndefOr[TargetType] = js.undefined,
      targetId: js.UndefOr[String] = js.undefined): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
        "targetType" -> targetType.map { x => x.asInstanceOf[js.Any] },
        "targetId" -> targetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
    }
  }

  /**
   * <p>An object representing the networking details for a task or service.</p>
   */
  @js.native
  trait AwsVpcConfiguration extends js.Object {
    var subnets: js.UndefOr[StringList]
    var securityGroups: js.UndefOr[StringList]
    var assignPublicIp: js.UndefOr[AssignPublicIp]
  }

  object AwsVpcConfiguration {
    def apply(
      subnets: js.UndefOr[StringList] = js.undefined,
      securityGroups: js.UndefOr[StringList] = js.undefined,
      assignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined): AwsVpcConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subnets" -> subnets.map { x => x.asInstanceOf[js.Any] },
        "securityGroups" -> securityGroups.map { x => x.asInstanceOf[js.Any] },
        "assignPublicIp" -> assignPublicIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsVpcConfiguration]
    }
  }

  /**
   * <p>A regional grouping of one or more container instances on which you can run task requests. Each account receives a default cluster the first time you use the Amazon ECS service, but you may also create other clusters. Clusters may contain more than one instance type simultaneously.</p>
   */
  @js.native
  trait Cluster extends js.Object {
    var statistics: js.UndefOr[Statistics]
    var activeServicesCount: js.UndefOr[Int]
    var tags: js.UndefOr[Tags]
    var runningTasksCount: js.UndefOr[Int]
    var pendingTasksCount: js.UndefOr[Int]
    var status: js.UndefOr[String]
    var clusterArn: js.UndefOr[String]
    var registeredContainerInstancesCount: js.UndefOr[Int]
    var clusterName: js.UndefOr[String]
  }

  object Cluster {
    def apply(
      statistics: js.UndefOr[Statistics] = js.undefined,
      activeServicesCount: js.UndefOr[Int] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      runningTasksCount: js.UndefOr[Int] = js.undefined,
      pendingTasksCount: js.UndefOr[Int] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined,
      registeredContainerInstancesCount: js.UndefOr[Int] = js.undefined,
      clusterName: js.UndefOr[String] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statistics" -> statistics.map { x => x.asInstanceOf[js.Any] },
        "activeServicesCount" -> activeServicesCount.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "runningTasksCount" -> runningTasksCount.map { x => x.asInstanceOf[js.Any] },
        "pendingTasksCount" -> pendingTasksCount.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "clusterArn" -> clusterArn.map { x => x.asInstanceOf[js.Any] },
        "registeredContainerInstancesCount" -> registeredContainerInstancesCount.map { x => x.asInstanceOf[js.Any] },
        "clusterName" -> clusterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A Docker container that is part of a task.</p>
   */
  @js.native
  trait Container extends js.Object {
    var name: js.UndefOr[String]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var lastStatus: js.UndefOr[String]
    var healthStatus: js.UndefOr[HealthStatus]
    var networkBindings: js.UndefOr[NetworkBindings]
    var exitCode: js.UndefOr[BoxedInteger]
    var reason: js.UndefOr[String]
    var containerArn: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
  }

  object Container {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
      lastStatus: js.UndefOr[String] = js.undefined,
      healthStatus: js.UndefOr[HealthStatus] = js.undefined,
      networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
      exitCode: js.UndefOr[BoxedInteger] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      containerArn: js.UndefOr[String] = js.undefined,
      taskArn: js.UndefOr[String] = js.undefined): Container = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "networkInterfaces" -> networkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "healthStatus" -> healthStatus.map { x => x.asInstanceOf[js.Any] },
        "networkBindings" -> networkBindings.map { x => x.asInstanceOf[js.Any] },
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "containerArn" -> containerArn.map { x => x.asInstanceOf[js.Any] },
        "taskArn" -> taskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Container]
    }
  }

  /**
   * <p>Container definitions are used in task definitions to describe the different containers that are launched as part of a task.</p>
   */
  @js.native
  trait ContainerDefinition extends js.Object {
    var dockerSecurityOptions: js.UndefOr[StringList]
    var ulimits: js.UndefOr[UlimitList]
    var mountPoints: js.UndefOr[MountPointList]
    var repositoryCredentials: js.UndefOr[RepositoryCredentials]
    var healthCheck: js.UndefOr[HealthCheck]
    var name: js.UndefOr[String]
    var hostname: js.UndefOr[String]
    var secrets: js.UndefOr[SecretList]
    var entryPoint: js.UndefOr[StringList]
    var portMappings: js.UndefOr[PortMappingList]
    var essential: js.UndefOr[BoxedBoolean]
    var readonlyRootFilesystem: js.UndefOr[BoxedBoolean]
    var image: js.UndefOr[String]
    var dnsSearchDomains: js.UndefOr[StringList]
    var systemControls: js.UndefOr[SystemControls]
    var command: js.UndefOr[StringList]
    var interactive: js.UndefOr[BoxedBoolean]
    var links: js.UndefOr[StringList]
    var memoryReservation: js.UndefOr[BoxedInteger]
    var volumesFrom: js.UndefOr[VolumeFromList]
    var linuxParameters: js.UndefOr[LinuxParameters]
    var pseudoTerminal: js.UndefOr[BoxedBoolean]
    var cpu: js.UndefOr[Int]
    var environment: js.UndefOr[EnvironmentVariables]
    var workingDirectory: js.UndefOr[String]
    var extraHosts: js.UndefOr[HostEntryList]
    var dockerLabels: js.UndefOr[DockerLabelsMap]
    var privileged: js.UndefOr[BoxedBoolean]
    var logConfiguration: js.UndefOr[LogConfiguration]
    var user: js.UndefOr[String]
    var disableNetworking: js.UndefOr[BoxedBoolean]
    var memory: js.UndefOr[BoxedInteger]
    var dnsServers: js.UndefOr[StringList]
  }

  object ContainerDefinition {
    def apply(
      dockerSecurityOptions: js.UndefOr[StringList] = js.undefined,
      ulimits: js.UndefOr[UlimitList] = js.undefined,
      mountPoints: js.UndefOr[MountPointList] = js.undefined,
      repositoryCredentials: js.UndefOr[RepositoryCredentials] = js.undefined,
      healthCheck: js.UndefOr[HealthCheck] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      hostname: js.UndefOr[String] = js.undefined,
      secrets: js.UndefOr[SecretList] = js.undefined,
      entryPoint: js.UndefOr[StringList] = js.undefined,
      portMappings: js.UndefOr[PortMappingList] = js.undefined,
      essential: js.UndefOr[BoxedBoolean] = js.undefined,
      readonlyRootFilesystem: js.UndefOr[BoxedBoolean] = js.undefined,
      image: js.UndefOr[String] = js.undefined,
      dnsSearchDomains: js.UndefOr[StringList] = js.undefined,
      systemControls: js.UndefOr[SystemControls] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      interactive: js.UndefOr[BoxedBoolean] = js.undefined,
      links: js.UndefOr[StringList] = js.undefined,
      memoryReservation: js.UndefOr[BoxedInteger] = js.undefined,
      volumesFrom: js.UndefOr[VolumeFromList] = js.undefined,
      linuxParameters: js.UndefOr[LinuxParameters] = js.undefined,
      pseudoTerminal: js.UndefOr[BoxedBoolean] = js.undefined,
      cpu: js.UndefOr[Int] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      workingDirectory: js.UndefOr[String] = js.undefined,
      extraHosts: js.UndefOr[HostEntryList] = js.undefined,
      dockerLabels: js.UndefOr[DockerLabelsMap] = js.undefined,
      privileged: js.UndefOr[BoxedBoolean] = js.undefined,
      logConfiguration: js.UndefOr[LogConfiguration] = js.undefined,
      user: js.UndefOr[String] = js.undefined,
      disableNetworking: js.UndefOr[BoxedBoolean] = js.undefined,
      memory: js.UndefOr[BoxedInteger] = js.undefined,
      dnsServers: js.UndefOr[StringList] = js.undefined): ContainerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dockerSecurityOptions" -> dockerSecurityOptions.map { x => x.asInstanceOf[js.Any] },
        "ulimits" -> ulimits.map { x => x.asInstanceOf[js.Any] },
        "mountPoints" -> mountPoints.map { x => x.asInstanceOf[js.Any] },
        "repositoryCredentials" -> repositoryCredentials.map { x => x.asInstanceOf[js.Any] },
        "healthCheck" -> healthCheck.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "hostname" -> hostname.map { x => x.asInstanceOf[js.Any] },
        "secrets" -> secrets.map { x => x.asInstanceOf[js.Any] },
        "entryPoint" -> entryPoint.map { x => x.asInstanceOf[js.Any] },
        "portMappings" -> portMappings.map { x => x.asInstanceOf[js.Any] },
        "essential" -> essential.map { x => x.asInstanceOf[js.Any] },
        "readonlyRootFilesystem" -> readonlyRootFilesystem.map { x => x.asInstanceOf[js.Any] },
        "image" -> image.map { x => x.asInstanceOf[js.Any] },
        "dnsSearchDomains" -> dnsSearchDomains.map { x => x.asInstanceOf[js.Any] },
        "systemControls" -> systemControls.map { x => x.asInstanceOf[js.Any] },
        "command" -> command.map { x => x.asInstanceOf[js.Any] },
        "interactive" -> interactive.map { x => x.asInstanceOf[js.Any] },
        "links" -> links.map { x => x.asInstanceOf[js.Any] },
        "memoryReservation" -> memoryReservation.map { x => x.asInstanceOf[js.Any] },
        "volumesFrom" -> volumesFrom.map { x => x.asInstanceOf[js.Any] },
        "linuxParameters" -> linuxParameters.map { x => x.asInstanceOf[js.Any] },
        "pseudoTerminal" -> pseudoTerminal.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "environment" -> environment.map { x => x.asInstanceOf[js.Any] },
        "workingDirectory" -> workingDirectory.map { x => x.asInstanceOf[js.Any] },
        "extraHosts" -> extraHosts.map { x => x.asInstanceOf[js.Any] },
        "dockerLabels" -> dockerLabels.map { x => x.asInstanceOf[js.Any] },
        "privileged" -> privileged.map { x => x.asInstanceOf[js.Any] },
        "logConfiguration" -> logConfiguration.map { x => x.asInstanceOf[js.Any] },
        "user" -> user.map { x => x.asInstanceOf[js.Any] },
        "disableNetworking" -> disableNetworking.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] },
        "dnsServers" -> dnsServers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDefinition]
    }
  }

  /**
   * <p>An EC2 instance that is running the Amazon ECS agent and has been registered with a cluster.</p>
   */
  @js.native
  trait ContainerInstance extends js.Object {
    var remainingResources: js.UndefOr[Resources]
    var tags: js.UndefOr[Tags]
    var registeredResources: js.UndefOr[Resources]
    var ec2InstanceId: js.UndefOr[String]
    var runningTasksCount: js.UndefOr[Int]
    var registeredAt: js.UndefOr[Timestamp]
    var attributes: js.UndefOr[Attributes]
    var version: js.UndefOr[Double]
    var pendingTasksCount: js.UndefOr[Int]
    var agentConnected: js.UndefOr[Boolean]
    var status: js.UndefOr[String]
    var containerInstanceArn: js.UndefOr[String]
    var attachments: js.UndefOr[Attachments]
    var agentUpdateStatus: js.UndefOr[AgentUpdateStatus]
    var versionInfo: js.UndefOr[VersionInfo]
  }

  object ContainerInstance {
    def apply(
      remainingResources: js.UndefOr[Resources] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      registeredResources: js.UndefOr[Resources] = js.undefined,
      ec2InstanceId: js.UndefOr[String] = js.undefined,
      runningTasksCount: js.UndefOr[Int] = js.undefined,
      registeredAt: js.UndefOr[Timestamp] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      version: js.UndefOr[Double] = js.undefined,
      pendingTasksCount: js.UndefOr[Int] = js.undefined,
      agentConnected: js.UndefOr[Boolean] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined,
      attachments: js.UndefOr[Attachments] = js.undefined,
      agentUpdateStatus: js.UndefOr[AgentUpdateStatus] = js.undefined,
      versionInfo: js.UndefOr[VersionInfo] = js.undefined): ContainerInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "remainingResources" -> remainingResources.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "registeredResources" -> registeredResources.map { x => x.asInstanceOf[js.Any] },
        "ec2InstanceId" -> ec2InstanceId.map { x => x.asInstanceOf[js.Any] },
        "runningTasksCount" -> runningTasksCount.map { x => x.asInstanceOf[js.Any] },
        "registeredAt" -> registeredAt.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "pendingTasksCount" -> pendingTasksCount.map { x => x.asInstanceOf[js.Any] },
        "agentConnected" -> agentConnected.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "containerInstanceArn" -> containerInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "attachments" -> attachments.map { x => x.asInstanceOf[js.Any] },
        "agentUpdateStatus" -> agentUpdateStatus.map { x => x.asInstanceOf[js.Any] },
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
   * <p>The overrides that should be sent to a container.</p>
   */
  @js.native
  trait ContainerOverride extends js.Object {
    var name: js.UndefOr[String]
    var command: js.UndefOr[StringList]
    var memoryReservation: js.UndefOr[BoxedInteger]
    var cpu: js.UndefOr[BoxedInteger]
    var environment: js.UndefOr[EnvironmentVariables]
    var memory: js.UndefOr[BoxedInteger]
  }

  object ContainerOverride {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      memoryReservation: js.UndefOr[BoxedInteger] = js.undefined,
      cpu: js.UndefOr[BoxedInteger] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      memory: js.UndefOr[BoxedInteger] = js.undefined): ContainerOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "command" -> command.map { x => x.asInstanceOf[js.Any] },
        "memoryReservation" -> memoryReservation.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "environment" -> environment.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerOverride]
    }
  }

  /**
   * <p>An object representing a change in state for a container.</p>
   */
  @js.native
  trait ContainerStateChange extends js.Object {
    var containerName: js.UndefOr[String]
    var networkBindings: js.UndefOr[NetworkBindings]
    var exitCode: js.UndefOr[BoxedInteger]
    var reason: js.UndefOr[String]
    var status: js.UndefOr[String]
  }

  object ContainerStateChange {
    def apply(
      containerName: js.UndefOr[String] = js.undefined,
      networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
      exitCode: js.UndefOr[BoxedInteger] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined): ContainerStateChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerName" -> containerName.map { x => x.asInstanceOf[js.Any] },
        "networkBindings" -> networkBindings.map { x => x.asInstanceOf[js.Any] },
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
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
    var placementStrategy: js.UndefOr[PlacementStrategies]
    var platformVersion: js.UndefOr[String]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var role: js.UndefOr[String]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var desiredCount: js.UndefOr[BoxedInteger]
    var tags: js.UndefOr[Tags]
    var serviceName: js.UndefOr[String]
    var clientToken: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var loadBalancers: js.UndefOr[LoadBalancers]
    var cluster: js.UndefOr[String]
    var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger]
    var propagateTags: js.UndefOr[PropagateTags]
    var deploymentConfiguration: js.UndefOr[DeploymentConfiguration]
    var taskDefinition: js.UndefOr[String]
    var serviceRegistries: js.UndefOr[ServiceRegistries]
    var placementConstraints: js.UndefOr[PlacementConstraints]
    var schedulingStrategy: js.UndefOr[SchedulingStrategy]
  }

  object CreateServiceRequest {
    def apply(
      placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
      platformVersion: js.UndefOr[String] = js.undefined,
      enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
      role: js.UndefOr[String] = js.undefined,
      networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
      desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      serviceName: js.UndefOr[String] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined,
      launchType: js.UndefOr[LaunchType] = js.undefined,
      loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
      propagateTags: js.UndefOr[PropagateTags] = js.undefined,
      deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined,
      placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
      schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined): CreateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "placementStrategy" -> placementStrategy.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "enableECSManagedTags" -> enableECSManagedTags.map { x => x.asInstanceOf[js.Any] },
        "role" -> role.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "desiredCount" -> desiredCount.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "serviceName" -> serviceName.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "loadBalancers" -> loadBalancers.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "healthCheckGracePeriodSeconds" -> healthCheckGracePeriodSeconds.map { x => x.asInstanceOf[js.Any] },
        "propagateTags" -> propagateTags.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfiguration" -> deploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "serviceRegistries" -> serviceRegistries.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "schedulingStrategy" -> schedulingStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var name: js.UndefOr[SettingName]
    var principalArn: js.UndefOr[String]
  }

  object DeleteAccountSettingRequest {
    def apply(
      name: js.UndefOr[SettingName] = js.undefined,
      principalArn: js.UndefOr[String] = js.undefined): DeleteAccountSettingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
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
    var cluster: js.UndefOr[String]
    var attributes: js.UndefOr[Attributes]
  }

  object DeleteAttributesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined): DeleteAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var cluster: js.UndefOr[String]
  }

  object DeleteClusterRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined): DeleteClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var cluster: js.UndefOr[String]
    var service: js.UndefOr[String]
    var force: js.UndefOr[BoxedBoolean]
  }

  object DeleteServiceRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      service: js.UndefOr[String] = js.undefined,
      force: js.UndefOr[BoxedBoolean] = js.undefined): DeleteServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "service" -> service.map { x => x.asInstanceOf[js.Any] },
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
   * <p>The details of an Amazon ECS service deployment.</p>
   */
  @js.native
  trait Deployment extends js.Object {
    var updatedAt: js.UndefOr[Timestamp]
    var runningCount: js.UndefOr[Int]
    var platformVersion: js.UndefOr[String]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var desiredCount: js.UndefOr[Int]
    var launchType: js.UndefOr[LaunchType]
    var id: js.UndefOr[String]
    var status: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var taskDefinition: js.UndefOr[String]
    var pendingCount: js.UndefOr[Int]
  }

  object Deployment {
    def apply(
      updatedAt: js.UndefOr[Timestamp] = js.undefined,
      runningCount: js.UndefOr[Int] = js.undefined,
      platformVersion: js.UndefOr[String] = js.undefined,
      networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
      desiredCount: js.UndefOr[Int] = js.undefined,
      launchType: js.UndefOr[LaunchType] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      pendingCount: js.UndefOr[Int] = js.undefined): Deployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "updatedAt" -> updatedAt.map { x => x.asInstanceOf[js.Any] },
        "runningCount" -> runningCount.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "desiredCount" -> desiredCount.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "pendingCount" -> pendingCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployment]
    }
  }

  /**
   * <p>Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.</p>
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

  @js.native
  trait DeregisterContainerInstanceRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var containerInstance: js.UndefOr[String]
    var force: js.UndefOr[BoxedBoolean]
  }

  object DeregisterContainerInstanceRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      containerInstance: js.UndefOr[String] = js.undefined,
      force: js.UndefOr[BoxedBoolean] = js.undefined): DeregisterContainerInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] },
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
    var taskDefinition: js.UndefOr[String]
  }

  object DeregisterTaskDefinitionRequest {
    def apply(
      taskDefinition: js.UndefOr[String] = js.undefined): DeregisterTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var cluster: js.UndefOr[String]
    var containerInstances: js.UndefOr[StringList]
    var include: js.UndefOr[ContainerInstanceFieldList]
  }

  object DescribeContainerInstancesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      containerInstances: js.UndefOr[StringList] = js.undefined,
      include: js.UndefOr[ContainerInstanceFieldList] = js.undefined): DescribeContainerInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerInstances" -> containerInstances.map { x => x.asInstanceOf[js.Any] },
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
    var cluster: js.UndefOr[String]
    var services: js.UndefOr[StringList]
    var include: js.UndefOr[ServiceFieldList]
  }

  object DescribeServicesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      services: js.UndefOr[StringList] = js.undefined,
      include: js.UndefOr[ServiceFieldList] = js.undefined): DescribeServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "services" -> services.map { x => x.asInstanceOf[js.Any] },
        "include" -> include.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesRequest]
    }
  }

  @js.native
  trait DescribeServicesResponse extends js.Object {
    var services: js.UndefOr[Services]
    var failures: js.UndefOr[Failures]
  }

  object DescribeServicesResponse {
    def apply(
      services: js.UndefOr[Services] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined): DescribeServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "services" -> services.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesResponse]
    }
  }

  @js.native
  trait DescribeTaskDefinitionRequest extends js.Object {
    var taskDefinition: js.UndefOr[String]
    var include: js.UndefOr[TaskDefinitionFieldList]
  }

  object DescribeTaskDefinitionRequest {
    def apply(
      taskDefinition: js.UndefOr[String] = js.undefined,
      include: js.UndefOr[TaskDefinitionFieldList] = js.undefined): DescribeTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "include" -> include.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskDefinitionRequest]
    }
  }

  @js.native
  trait DescribeTaskDefinitionResponse extends js.Object {
    var taskDefinition: js.UndefOr[TaskDefinition]
    var tags: js.UndefOr[Tags]
  }

  object DescribeTaskDefinitionResponse {
    def apply(
      taskDefinition: js.UndefOr[TaskDefinition] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): DescribeTaskDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskDefinitionResponse]
    }
  }

  @js.native
  trait DescribeTasksRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var tasks: js.UndefOr[StringList]
    var include: js.UndefOr[TaskFieldList]
  }

  object DescribeTasksRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      tasks: js.UndefOr[StringList] = js.undefined,
      include: js.UndefOr[TaskFieldList] = js.undefined): DescribeTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "tasks" -> tasks.map { x => x.asInstanceOf[js.Any] },
        "include" -> include.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTasksRequest]
    }
  }

  @js.native
  trait DescribeTasksResponse extends js.Object {
    var tasks: js.UndefOr[Tasks]
    var failures: js.UndefOr[Failures]
  }

  object DescribeTasksResponse {
    def apply(
      tasks: js.UndefOr[Tasks] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined): DescribeTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tasks" -> tasks.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>An object representing a container instance host device.</p>
   */
  @js.native
  trait Device extends js.Object {
    var hostPath: js.UndefOr[String]
    var containerPath: js.UndefOr[String]
    var permissions: js.UndefOr[DeviceCgroupPermissions]
  }

  object Device {
    def apply(
      hostPath: js.UndefOr[String] = js.undefined,
      containerPath: js.UndefOr[String] = js.undefined,
      permissions: js.UndefOr[DeviceCgroupPermissions] = js.undefined): Device = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hostPath" -> hostPath.map { x => x.asInstanceOf[js.Any] },
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
    var containerInstance: js.UndefOr[String]
    var cluster: js.UndefOr[String]
  }

  object DiscoverPollEndpointRequest {
    def apply(
      containerInstance: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined): DiscoverPollEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>This parameter is specified when you are using Docker volumes. Docker volumes are only supported when you are using the EC2 launch type. Windows containers only support the use of the <code>local</code> driver. To use bind mounts, specify a <code>host</code> instead.</p>
   */
  @js.native
  trait DockerVolumeConfiguration extends js.Object {
    var scope: js.UndefOr[Scope]
    var autoprovision: js.UndefOr[BoxedBoolean]
    var driver: js.UndefOr[String]
    var labels: js.UndefOr[StringMap]
    var driverOpts: js.UndefOr[StringMap]
  }

  object DockerVolumeConfiguration {
    def apply(
      scope: js.UndefOr[Scope] = js.undefined,
      autoprovision: js.UndefOr[BoxedBoolean] = js.undefined,
      driver: js.UndefOr[String] = js.undefined,
      labels: js.UndefOr[StringMap] = js.undefined,
      driverOpts: js.UndefOr[StringMap] = js.undefined): DockerVolumeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scope" -> scope.map { x => x.asInstanceOf[js.Any] },
        "autoprovision" -> autoprovision.map { x => x.asInstanceOf[js.Any] },
        "driver" -> driver.map { x => x.asInstanceOf[js.Any] },
        "labels" -> labels.map { x => x.asInstanceOf[js.Any] },
        "driverOpts" -> driverOpts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DockerVolumeConfiguration]
    }
  }

  /**
   * <p>A failed resource.</p>
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
   * <p>An object representing a container health check. Health check parameters that are specified in a container definition override any Docker health checks that exist in the container image (such as those specified in a parent image or from the image's Dockerfile).</p> <p>The following are notes about container health check support:</p> <ul> <li> <p>Container health checks require version 1.17.0 or greater of the Amazon ECS container agent. For more information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS Container Agent</a>.</p> </li> <li> <p>Container health checks are supported for Fargate tasks if you are using platform version 1.1.0 or greater. For more information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform Versions</a>.</p> </li> <li> <p>Container health checks are not supported for tasks that are part of a service that is configured to use a Classic Load Balancer.</p> </li> </ul>
   */
  @js.native
  trait HealthCheck extends js.Object {
    var retries: js.UndefOr[BoxedInteger]
    var command: js.UndefOr[StringList]
    var interval: js.UndefOr[BoxedInteger]
    var startPeriod: js.UndefOr[BoxedInteger]
    var timeout: js.UndefOr[BoxedInteger]
  }

  object HealthCheck {
    def apply(
      retries: js.UndefOr[BoxedInteger] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      interval: js.UndefOr[BoxedInteger] = js.undefined,
      startPeriod: js.UndefOr[BoxedInteger] = js.undefined,
      timeout: js.UndefOr[BoxedInteger] = js.undefined): HealthCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        "retries" -> retries.map { x => x.asInstanceOf[js.Any] },
        "command" -> command.map { x => x.asInstanceOf[js.Any] },
        "interval" -> interval.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Hostnames and IP address entries that are added to the <code>/etc/hosts</code> file of a container via the <code>extraHosts</code> parameter of its <a>ContainerDefinition</a>. </p>
   */
  @js.native
  trait HostEntry extends js.Object {
    var hostname: js.UndefOr[String]
    var ipAddress: js.UndefOr[String]
  }

  object HostEntry {
    def apply(
      hostname: js.UndefOr[String] = js.undefined,
      ipAddress: js.UndefOr[String] = js.undefined): HostEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hostname" -> hostname.map { x => x.asInstanceOf[js.Any] },
        "ipAddress" -> ipAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostEntry]
    }
  }

  /**
   * <p>Details on a container instance bind mount host volume.</p>
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
   * <p>The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker. For more information on the default capabilities and the non-default available capabilities, see <a href="https://docs.docker.com/engine/reference/run/#runtime-privilege-and-linux-capabilities">Runtime privilege and Linux capabilities</a> in the <i>Docker run reference</i>. For more detailed information on these Linux capabilities, see the <a href="http://man7.org/linux/man-pages/man7/capabilities.7.html">capabilities(7)</a> Linux manual page.</p>
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
   * <p>A key-value pair object.</p>
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
   * <p>Linux-specific options that are applied to the container, such as Linux <a>KernelCapabilities</a>.</p>
   */
  @js.native
  trait LinuxParameters extends js.Object {
    var capabilities: js.UndefOr[KernelCapabilities]
    var initProcessEnabled: js.UndefOr[BoxedBoolean]
    var sharedMemorySize: js.UndefOr[BoxedInteger]
    var devices: js.UndefOr[DevicesList]
    var tmpfs: js.UndefOr[TmpfsList]
  }

  object LinuxParameters {
    def apply(
      capabilities: js.UndefOr[KernelCapabilities] = js.undefined,
      initProcessEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
      sharedMemorySize: js.UndefOr[BoxedInteger] = js.undefined,
      devices: js.UndefOr[DevicesList] = js.undefined,
      tmpfs: js.UndefOr[TmpfsList] = js.undefined): LinuxParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "capabilities" -> capabilities.map { x => x.asInstanceOf[js.Any] },
        "initProcessEnabled" -> initProcessEnabled.map { x => x.asInstanceOf[js.Any] },
        "sharedMemorySize" -> sharedMemorySize.map { x => x.asInstanceOf[js.Any] },
        "devices" -> devices.map { x => x.asInstanceOf[js.Any] },
        "tmpfs" -> tmpfs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LinuxParameters]
    }
  }

  @js.native
  trait ListAccountSettingsRequest extends js.Object {
    var name: js.UndefOr[SettingName]
    var maxResults: js.UndefOr[Int]
    var effectiveSettings: js.UndefOr[Boolean]
    var nextToken: js.UndefOr[String]
    var principalArn: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object ListAccountSettingsRequest {
    def apply(
      name: js.UndefOr[SettingName] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      effectiveSettings: js.UndefOr[Boolean] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      principalArn: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[String] = js.undefined): ListAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "effectiveSettings" -> effectiveSettings.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "principalArn" -> principalArn.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountSettingsRequest]
    }
  }

  @js.native
  trait ListAccountSettingsResponse extends js.Object {
    var settings: js.UndefOr[Settings]
    var nextToken: js.UndefOr[String]
  }

  object ListAccountSettingsResponse {
    def apply(
      settings: js.UndefOr[Settings] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "settings" -> settings.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAccountSettingsResponse]
    }
  }

  @js.native
  trait ListAttributesRequest extends js.Object {
    var maxResults: js.UndefOr[BoxedInteger]
    var attributeValue: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
    var attributeName: js.UndefOr[String]
    var cluster: js.UndefOr[String]
    var targetType: js.UndefOr[TargetType]
  }

  object ListAttributesRequest {
    def apply(
      maxResults: js.UndefOr[BoxedInteger] = js.undefined,
      attributeValue: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      attributeName: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      targetType: js.UndefOr[TargetType] = js.undefined): ListAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "attributeValue" -> attributeValue.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "attributeName" -> attributeName.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "targetType" -> targetType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var nextToken: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
  }

  object ListClustersRequest {
    def apply(
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined): ListClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var filter: js.UndefOr[String]
    var cluster: js.UndefOr[String]
    var status: js.UndefOr[ContainerInstanceStatus]
  }

  object ListContainerInstancesRequest {
    def apply(
      maxResults: js.UndefOr[BoxedInteger] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      filter: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[ContainerInstanceStatus] = js.undefined): ListContainerInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
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
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var cluster: js.UndefOr[String]
    var schedulingStrategy: js.UndefOr[SchedulingStrategy]
  }

  object ListServicesRequest {
    def apply(
      maxResults: js.UndefOr[BoxedInteger] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      launchType: js.UndefOr[LaunchType] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined): ListServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "schedulingStrategy" -> schedulingStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var serviceArns: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListServicesResponse {
    def apply(
      serviceArns: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "serviceArns" -> serviceArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServicesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[String]
  }

  object ListTagsForResourceRequest {
    def apply(
      resourceArn: js.UndefOr[String] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var status: js.UndefOr[TaskDefinitionFamilyStatus]
    var nextToken: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
  }

  object ListTaskDefinitionFamiliesRequest {
    def apply(
      familyPrefix: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[TaskDefinitionFamilyStatus] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined): ListTaskDefinitionFamiliesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "familyPrefix" -> familyPrefix.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var maxResults: js.UndefOr[BoxedInteger]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[TaskDefinitionStatus]
    var sort: js.UndefOr[SortOrder]
    var familyPrefix: js.UndefOr[String]
  }

  object ListTaskDefinitionsRequest {
    def apply(
      maxResults: js.UndefOr[BoxedInteger] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[TaskDefinitionStatus] = js.undefined,
      sort: js.UndefOr[SortOrder] = js.undefined,
      familyPrefix: js.UndefOr[String] = js.undefined): ListTaskDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "sort" -> sort.map { x => x.asInstanceOf[js.Any] },
        "familyPrefix" -> familyPrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionsRequest]
    }
  }

  @js.native
  trait ListTaskDefinitionsResponse extends js.Object {
    var taskDefinitionArns: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListTaskDefinitionsResponse {
    def apply(
      taskDefinitionArns: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListTaskDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinitionArns" -> taskDefinitionArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskDefinitionsResponse]
    }
  }

  @js.native
  trait ListTasksRequest extends js.Object {
    var startedBy: js.UndefOr[String]
    var containerInstance: js.UndefOr[String]
    var maxResults: js.UndefOr[BoxedInteger]
    var serviceName: js.UndefOr[String]
    var desiredStatus: js.UndefOr[DesiredStatus]
    var nextToken: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var cluster: js.UndefOr[String]
    var family: js.UndefOr[String]
  }

  object ListTasksRequest {
    def apply(
      startedBy: js.UndefOr[String] = js.undefined,
      containerInstance: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[BoxedInteger] = js.undefined,
      serviceName: js.UndefOr[String] = js.undefined,
      desiredStatus: js.UndefOr[DesiredStatus] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      launchType: js.UndefOr[LaunchType] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      family: js.UndefOr[String] = js.undefined): ListTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] },
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "serviceName" -> serviceName.map { x => x.asInstanceOf[js.Any] },
        "desiredStatus" -> desiredStatus.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "family" -> family.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksRequest]
    }
  }

  @js.native
  trait ListTasksResponse extends js.Object {
    var taskArns: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListTasksResponse {
    def apply(
      taskArns: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskArns" -> taskArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksResponse]
    }
  }

  /**
   * <p>Details on a load balancer that is used with a service.</p> <p>Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate launch type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not supported. Also, when you create any target groups for these services, you must choose <code>ip</code> as the target type, not <code>instance</code>. Tasks that use the <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2 instance.</p>
   */
  @js.native
  trait LoadBalancer extends js.Object {
    var targetGroupArn: js.UndefOr[String]
    var loadBalancerName: js.UndefOr[String]
    var containerName: js.UndefOr[String]
    var containerPort: js.UndefOr[BoxedInteger]
  }

  object LoadBalancer {
    def apply(
      targetGroupArn: js.UndefOr[String] = js.undefined,
      loadBalancerName: js.UndefOr[String] = js.undefined,
      containerName: js.UndefOr[String] = js.undefined,
      containerPort: js.UndefOr[BoxedInteger] = js.undefined): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetGroupArn" -> targetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "containerName" -> containerName.map { x => x.asInstanceOf[js.Any] },
        "containerPort" -> containerPort.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
    }
  }

  /**
   * <p>Log configuration options to send to a custom log driver for the container.</p>
   */
  @js.native
  trait LogConfiguration extends js.Object {
    var logDriver: js.UndefOr[LogDriver]
    var options: js.UndefOr[LogConfigurationOptionsMap]
  }

  object LogConfiguration {
    def apply(
      logDriver: js.UndefOr[LogDriver] = js.undefined,
      options: js.UndefOr[LogConfigurationOptionsMap] = js.undefined): LogConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logDriver" -> logDriver.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Details on a volume mount point that is used in a container definition.</p>
   */
  @js.native
  trait MountPoint extends js.Object {
    var sourceVolume: js.UndefOr[String]
    var containerPath: js.UndefOr[String]
    var readOnly: js.UndefOr[BoxedBoolean]
  }

  object MountPoint {
    def apply(
      sourceVolume: js.UndefOr[String] = js.undefined,
      containerPath: js.UndefOr[String] = js.undefined,
      readOnly: js.UndefOr[BoxedBoolean] = js.undefined): MountPoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sourceVolume" -> sourceVolume.map { x => x.asInstanceOf[js.Any] },
        "containerPath" -> containerPath.map { x => x.asInstanceOf[js.Any] },
        "readOnly" -> readOnly.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MountPoint]
    }
  }

  /**
   * <p>Details on the network bindings between a container and its host container instance. After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.</p>
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
   * <p>An object representing the network configuration for a task or service.</p>
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
   * <p>An object representing the elastic network interface for tasks that use the <code>awsvpc</code> network mode.</p>
   */
  @js.native
  trait NetworkInterface extends js.Object {
    var attachmentId: js.UndefOr[String]
    var privateIpv4Address: js.UndefOr[String]
    var ipv6Address: js.UndefOr[String]
  }

  object NetworkInterface {
    def apply(
      attachmentId: js.UndefOr[String] = js.undefined,
      privateIpv4Address: js.UndefOr[String] = js.undefined,
      ipv6Address: js.UndefOr[String] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachmentId" -> attachmentId.map { x => x.asInstanceOf[js.Any] },
        "privateIpv4Address" -> privateIpv4Address.map { x => x.asInstanceOf[js.Any] },
        "ipv6Address" -> ipv6Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>An object representing a constraint on task placement. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html">Task Placement Constraints</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
   */
  @js.native
  trait PlacementConstraint extends js.Object {
    var `type`: js.UndefOr[PlacementConstraintType]
    var expression: js.UndefOr[String]
  }

  object PlacementConstraint {
    def apply(
      `type`: js.UndefOr[PlacementConstraintType] = js.undefined,
      expression: js.UndefOr[String] = js.undefined): PlacementConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "expression" -> expression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementConstraint]
    }
  }

  object PlacementConstraintTypeEnum {
    val distinctInstance = "distinctInstance"
    val memberOf = "memberOf"

    val values = IndexedSeq(distinctInstance, memberOf)
  }

  /**
   * <p>The task placement strategy for a task or service. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html">Task Placement Strategies</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
   */
  @js.native
  trait PlacementStrategy extends js.Object {
    var `type`: js.UndefOr[PlacementStrategyType]
    var field: js.UndefOr[String]
  }

  object PlacementStrategy {
    def apply(
      `type`: js.UndefOr[PlacementStrategyType] = js.undefined,
      field: js.UndefOr[String] = js.undefined): PlacementStrategy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "field" -> field.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Port mappings allow containers to access ports on the host container instance to send or receive traffic. Port mappings are specified as part of the container definition.</p> <p>If you are using containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, exposed ports should be specified using <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as the <code>containerPort</code>.</p> <p>After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.</p>
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
    var name: js.UndefOr[SettingName]
    var value: js.UndefOr[String]
    var principalArn: js.UndefOr[String]
  }

  object PutAccountSettingRequest {
    def apply(
      name: js.UndefOr[SettingName] = js.undefined,
      value: js.UndefOr[String] = js.undefined,
      principalArn: js.UndefOr[String] = js.undefined): PutAccountSettingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
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
    var cluster: js.UndefOr[String]
    var attributes: js.UndefOr[Attributes]
  }

  object PutAttributesRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined): PutAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var instanceIdentityDocument: js.UndefOr[String]
    var instanceIdentityDocumentSignature: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
    var attributes: js.UndefOr[Attributes]
    var cluster: js.UndefOr[String]
    var containerInstanceArn: js.UndefOr[String]
    var totalResources: js.UndefOr[Resources]
    var versionInfo: js.UndefOr[VersionInfo]
  }

  object RegisterContainerInstanceRequest {
    def apply(
      instanceIdentityDocument: js.UndefOr[String] = js.undefined,
      instanceIdentityDocumentSignature: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined,
      totalResources: js.UndefOr[Resources] = js.undefined,
      versionInfo: js.UndefOr[VersionInfo] = js.undefined): RegisterContainerInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceIdentityDocument" -> instanceIdentityDocument.map { x => x.asInstanceOf[js.Any] },
        "instanceIdentityDocumentSignature" -> instanceIdentityDocumentSignature.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerInstanceArn" -> containerInstanceArn.map { x => x.asInstanceOf[js.Any] },
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
    var pidMode: js.UndefOr[PidMode]
    var taskRoleArn: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
    var volumes: js.UndefOr[VolumeList]
    var ipcMode: js.UndefOr[IpcMode]
    var requiresCompatibilities: js.UndefOr[CompatibilityList]
    var cpu: js.UndefOr[String]
    var executionRoleArn: js.UndefOr[String]
    var containerDefinitions: js.UndefOr[ContainerDefinitions]
    var networkMode: js.UndefOr[NetworkMode]
    var placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints]
    var family: js.UndefOr[String]
    var memory: js.UndefOr[String]
  }

  object RegisterTaskDefinitionRequest {
    def apply(
      pidMode: js.UndefOr[PidMode] = js.undefined,
      taskRoleArn: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      volumes: js.UndefOr[VolumeList] = js.undefined,
      ipcMode: js.UndefOr[IpcMode] = js.undefined,
      requiresCompatibilities: js.UndefOr[CompatibilityList] = js.undefined,
      cpu: js.UndefOr[String] = js.undefined,
      executionRoleArn: js.UndefOr[String] = js.undefined,
      containerDefinitions: js.UndefOr[ContainerDefinitions] = js.undefined,
      networkMode: js.UndefOr[NetworkMode] = js.undefined,
      placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.undefined,
      family: js.UndefOr[String] = js.undefined,
      memory: js.UndefOr[String] = js.undefined): RegisterTaskDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pidMode" -> pidMode.map { x => x.asInstanceOf[js.Any] },
        "taskRoleArn" -> taskRoleArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "volumes" -> volumes.map { x => x.asInstanceOf[js.Any] },
        "ipcMode" -> ipcMode.map { x => x.asInstanceOf[js.Any] },
        "requiresCompatibilities" -> requiresCompatibilities.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "executionRoleArn" -> executionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "containerDefinitions" -> containerDefinitions.map { x => x.asInstanceOf[js.Any] },
        "networkMode" -> networkMode.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "family" -> family.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskDefinitionRequest]
    }
  }

  @js.native
  trait RegisterTaskDefinitionResponse extends js.Object {
    var taskDefinition: js.UndefOr[TaskDefinition]
    var tags: js.UndefOr[Tags]
  }

  object RegisterTaskDefinitionResponse {
    def apply(
      taskDefinition: js.UndefOr[TaskDefinition] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): RegisterTaskDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTaskDefinitionResponse]
    }
  }

  /**
   * <p>The repository credentials for private registry authentication.</p>
   */
  @js.native
  trait RepositoryCredentials extends js.Object {
    var credentialsParameter: js.UndefOr[String]
  }

  object RepositoryCredentials {
    def apply(
      credentialsParameter: js.UndefOr[String] = js.undefined): RepositoryCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "credentialsParameter" -> credentialsParameter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RepositoryCredentials]
    }
  }

  /**
   * <p>Describes the resources available for a container instance.</p>
   */
  @js.native
  trait Resource extends js.Object {
    var stringSetValue: js.UndefOr[StringList]
    var name: js.UndefOr[String]
    var doubleValue: js.UndefOr[Double]
    var integerValue: js.UndefOr[Int]
    var longValue: js.UndefOr[Double]
    var `type`: js.UndefOr[String]
  }

  object Resource {
    def apply(
      stringSetValue: js.UndefOr[StringList] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      doubleValue: js.UndefOr[Double] = js.undefined,
      integerValue: js.UndefOr[Int] = js.undefined,
      longValue: js.UndefOr[Double] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stringSetValue" -> stringSetValue.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "doubleValue" -> doubleValue.map { x => x.asInstanceOf[js.Any] },
        "integerValue" -> integerValue.map { x => x.asInstanceOf[js.Any] },
        "longValue" -> longValue.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  @js.native
  trait RunTaskRequest extends js.Object {
    var startedBy: js.UndefOr[String]
    var count: js.UndefOr[BoxedInteger]
    var placementStrategy: js.UndefOr[PlacementStrategies]
    var platformVersion: js.UndefOr[String]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var tags: js.UndefOr[Tags]
    var launchType: js.UndefOr[LaunchType]
    var overrides: js.UndefOr[TaskOverride]
    var cluster: js.UndefOr[String]
    var propagateTags: js.UndefOr[PropagateTags]
    var taskDefinition: js.UndefOr[String]
    var placementConstraints: js.UndefOr[PlacementConstraints]
    var group: js.UndefOr[String]
  }

  object RunTaskRequest {
    def apply(
      startedBy: js.UndefOr[String] = js.undefined,
      count: js.UndefOr[BoxedInteger] = js.undefined,
      placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
      platformVersion: js.UndefOr[String] = js.undefined,
      enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
      networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      launchType: js.UndefOr[LaunchType] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      propagateTags: js.UndefOr[PropagateTags] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
      group: js.UndefOr[String] = js.undefined): RunTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] },
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "placementStrategy" -> placementStrategy.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "enableECSManagedTags" -> enableECSManagedTags.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "propagateTags" -> propagateTags.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "group" -> group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunTaskRequest]
    }
  }

  @js.native
  trait RunTaskResponse extends js.Object {
    var tasks: js.UndefOr[Tasks]
    var failures: js.UndefOr[Failures]
  }

  object RunTaskResponse {
    def apply(
      tasks: js.UndefOr[Tasks] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined): RunTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tasks" -> tasks.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunTaskResponse]
    }
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
   * <p>An object representing the secret to expose to your container.</p>
   */
  @js.native
  trait Secret extends js.Object {
    var name: js.UndefOr[String]
    var valueFrom: js.UndefOr[String]
  }

  object Secret {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      valueFrom: js.UndefOr[String] = js.undefined): Secret = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "valueFrom" -> valueFrom.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Secret]
    }
  }

  /**
   * <p>Details on a service within a cluster</p>
   */
  @js.native
  trait Service extends js.Object {
    var runningCount: js.UndefOr[Int]
    var placementStrategy: js.UndefOr[PlacementStrategies]
    var platformVersion: js.UndefOr[String]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var desiredCount: js.UndefOr[Int]
    var tags: js.UndefOr[Tags]
    var serviceName: js.UndefOr[String]
    var serviceArn: js.UndefOr[String]
    var launchType: js.UndefOr[LaunchType]
    var loadBalancers: js.UndefOr[LoadBalancers]
    var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger]
    var propagateTags: js.UndefOr[PropagateTags]
    var deploymentConfiguration: js.UndefOr[DeploymentConfiguration]
    var roleArn: js.UndefOr[String]
    var status: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[String]
    var taskDefinition: js.UndefOr[String]
    var clusterArn: js.UndefOr[String]
    var serviceRegistries: js.UndefOr[ServiceRegistries]
    var placementConstraints: js.UndefOr[PlacementConstraints]
    var deployments: js.UndefOr[Deployments]
    var pendingCount: js.UndefOr[Int]
    var events: js.UndefOr[ServiceEvents]
    var schedulingStrategy: js.UndefOr[SchedulingStrategy]
  }

  object Service {
    def apply(
      runningCount: js.UndefOr[Int] = js.undefined,
      placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined,
      platformVersion: js.UndefOr[String] = js.undefined,
      enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
      networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
      desiredCount: js.UndefOr[Int] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      serviceName: js.UndefOr[String] = js.undefined,
      serviceArn: js.UndefOr[String] = js.undefined,
      launchType: js.UndefOr[LaunchType] = js.undefined,
      loadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
      healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
      propagateTags: js.UndefOr[PropagateTags] = js.undefined,
      deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
      roleArn: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      createdBy: js.UndefOr[String] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined,
      serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined,
      placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined,
      deployments: js.UndefOr[Deployments] = js.undefined,
      pendingCount: js.UndefOr[Int] = js.undefined,
      events: js.UndefOr[ServiceEvents] = js.undefined,
      schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.undefined): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        "runningCount" -> runningCount.map { x => x.asInstanceOf[js.Any] },
        "placementStrategy" -> placementStrategy.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "enableECSManagedTags" -> enableECSManagedTags.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "desiredCount" -> desiredCount.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "serviceName" -> serviceName.map { x => x.asInstanceOf[js.Any] },
        "serviceArn" -> serviceArn.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "loadBalancers" -> loadBalancers.map { x => x.asInstanceOf[js.Any] },
        "healthCheckGracePeriodSeconds" -> healthCheckGracePeriodSeconds.map { x => x.asInstanceOf[js.Any] },
        "propagateTags" -> propagateTags.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfiguration" -> deploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "createdBy" -> createdBy.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "clusterArn" -> clusterArn.map { x => x.asInstanceOf[js.Any] },
        "serviceRegistries" -> serviceRegistries.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "deployments" -> deployments.map { x => x.asInstanceOf[js.Any] },
        "pendingCount" -> pendingCount.map { x => x.asInstanceOf[js.Any] },
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "schedulingStrategy" -> schedulingStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }

  /**
   * <p>Details on an event associated with a service.</p>
   */
  @js.native
  trait ServiceEvent extends js.Object {
    var id: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var message: js.UndefOr[String]
  }

  object ServiceEvent {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      message: js.UndefOr[String] = js.undefined): ServiceEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceEvent]
    }
  }

  object ServiceFieldEnum {
    val TAGS = "TAGS"

    val values = IndexedSeq(TAGS)
  }

  /**
   * <p>Details of the service registry.</p>
   */
  @js.native
  trait ServiceRegistry extends js.Object {
    var registryArn: js.UndefOr[String]
    var port: js.UndefOr[BoxedInteger]
    var containerName: js.UndefOr[String]
    var containerPort: js.UndefOr[BoxedInteger]
  }

  object ServiceRegistry {
    def apply(
      registryArn: js.UndefOr[String] = js.undefined,
      port: js.UndefOr[BoxedInteger] = js.undefined,
      containerName: js.UndefOr[String] = js.undefined,
      containerPort: js.UndefOr[BoxedInteger] = js.undefined): ServiceRegistry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryArn" -> registryArn.map { x => x.asInstanceOf[js.Any] },
        "port" -> port.map { x => x.asInstanceOf[js.Any] },
        "containerName" -> containerName.map { x => x.asInstanceOf[js.Any] },
        "containerPort" -> containerPort.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceRegistry]
    }
  }

  /**
   * <p>The current account setting for a resource.</p>
   */
  @js.native
  trait Setting extends js.Object {
    var name: js.UndefOr[SettingName]
    var value: js.UndefOr[String]
    var principalArn: js.UndefOr[String]
  }

  object Setting {
    def apply(
      name: js.UndefOr[SettingName] = js.undefined,
      value: js.UndefOr[String] = js.undefined,
      principalArn: js.UndefOr[String] = js.undefined): Setting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
        "principalArn" -> principalArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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

  @js.native
  trait StartTaskRequest extends js.Object {
    var startedBy: js.UndefOr[String]
    var enableECSManagedTags: js.UndefOr[Boolean]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var tags: js.UndefOr[Tags]
    var overrides: js.UndefOr[TaskOverride]
    var cluster: js.UndefOr[String]
    var propagateTags: js.UndefOr[PropagateTags]
    var taskDefinition: js.UndefOr[String]
    var containerInstances: js.UndefOr[StringList]
    var group: js.UndefOr[String]
  }

  object StartTaskRequest {
    def apply(
      startedBy: js.UndefOr[String] = js.undefined,
      enableECSManagedTags: js.UndefOr[Boolean] = js.undefined,
      networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      propagateTags: js.UndefOr[PropagateTags] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined,
      containerInstances: js.UndefOr[StringList] = js.undefined,
      group: js.UndefOr[String] = js.undefined): StartTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] },
        "enableECSManagedTags" -> enableECSManagedTags.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "propagateTags" -> propagateTags.map { x => x.asInstanceOf[js.Any] },
        "taskDefinition" -> taskDefinition.map { x => x.asInstanceOf[js.Any] },
        "containerInstances" -> containerInstances.map { x => x.asInstanceOf[js.Any] },
        "group" -> group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskRequest]
    }
  }

  @js.native
  trait StartTaskResponse extends js.Object {
    var tasks: js.UndefOr[Tasks]
    var failures: js.UndefOr[Failures]
  }

  object StartTaskResponse {
    def apply(
      tasks: js.UndefOr[Tasks] = js.undefined,
      failures: js.UndefOr[Failures] = js.undefined): StartTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tasks" -> tasks.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskResponse]
    }
  }

  @js.native
  trait StopTaskRequest extends js.Object {
    var cluster: js.UndefOr[String]
    var task: js.UndefOr[String]
    var reason: js.UndefOr[String]
  }

  object StopTaskRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      task: js.UndefOr[String] = js.undefined,
      reason: js.UndefOr[String] = js.undefined): StopTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "task" -> task.map { x => x.asInstanceOf[js.Any] },
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
    var containerName: js.UndefOr[String]
    var task: js.UndefOr[String]
    var networkBindings: js.UndefOr[NetworkBindings]
    var exitCode: js.UndefOr[BoxedInteger]
    var reason: js.UndefOr[String]
    var cluster: js.UndefOr[String]
    var status: js.UndefOr[String]
  }

  object SubmitContainerStateChangeRequest {
    def apply(
      containerName: js.UndefOr[String] = js.undefined,
      task: js.UndefOr[String] = js.undefined,
      networkBindings: js.UndefOr[NetworkBindings] = js.undefined,
      exitCode: js.UndefOr[BoxedInteger] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined): SubmitContainerStateChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerName" -> containerName.map { x => x.asInstanceOf[js.Any] },
        "task" -> task.map { x => x.asInstanceOf[js.Any] },
        "networkBindings" -> networkBindings.map { x => x.asInstanceOf[js.Any] },
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var task: js.UndefOr[String]
    var pullStoppedAt: js.UndefOr[Timestamp]
    var reason: js.UndefOr[String]
    var cluster: js.UndefOr[String]
    var containers: js.UndefOr[ContainerStateChanges]
    var status: js.UndefOr[String]
    var attachments: js.UndefOr[AttachmentStateChanges]
    var executionStoppedAt: js.UndefOr[Timestamp]
    var pullStartedAt: js.UndefOr[Timestamp]
  }

  object SubmitTaskStateChangeRequest {
    def apply(
      task: js.UndefOr[String] = js.undefined,
      pullStoppedAt: js.UndefOr[Timestamp] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      containers: js.UndefOr[ContainerStateChanges] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      attachments: js.UndefOr[AttachmentStateChanges] = js.undefined,
      executionStoppedAt: js.UndefOr[Timestamp] = js.undefined,
      pullStartedAt: js.UndefOr[Timestamp] = js.undefined): SubmitTaskStateChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "task" -> task.map { x => x.asInstanceOf[js.Any] },
        "pullStoppedAt" -> pullStoppedAt.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containers" -> containers.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "attachments" -> attachments.map { x => x.asInstanceOf[js.Any] },
        "executionStoppedAt" -> executionStoppedAt.map { x => x.asInstanceOf[js.Any] },
        "pullStartedAt" -> pullStartedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--sysctl</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <p>It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network mode for the following reasons:</p> <ul> <li> <p>For tasks that use the <code>awsvpc</code> network mode, if you set <code>systemControls</code> for any container, it applies to all containers in the task. If you set different <code>systemControls</code> for multiple containers in a single task, the container that is started last determines which <code>systemControls</code> take effect.</p> </li> <li> <p>For tasks that use the <code>host</code> network mode, the <code>systemControls</code> parameter applies to the container instance's kernel parameter as well as that of all containers of any tasks running on that container instance.</p> </li> </ul>
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
   * <p>The metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.</p>
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
    var resourceArn: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Details on a task in a cluster.</p>
   */
  @js.native
  trait Task extends js.Object {
    var taskDefinitionArn: js.UndefOr[String]
    var startedBy: js.UndefOr[String]
    var lastStatus: js.UndefOr[String]
    var connectivityAt: js.UndefOr[Timestamp]
    var platformVersion: js.UndefOr[String]
    var pullStoppedAt: js.UndefOr[Timestamp]
    var stoppedAt: js.UndefOr[Timestamp]
    var tags: js.UndefOr[Tags]
    var desiredStatus: js.UndefOr[String]
    var healthStatus: js.UndefOr[HealthStatus]
    var launchType: js.UndefOr[LaunchType]
    var stoppedReason: js.UndefOr[String]
    var overrides: js.UndefOr[TaskOverride]
    var version: js.UndefOr[Double]
    var containers: js.UndefOr[Containers]
    var cpu: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var startedAt: js.UndefOr[Timestamp]
    var stoppingAt: js.UndefOr[Timestamp]
    var containerInstanceArn: js.UndefOr[String]
    var clusterArn: js.UndefOr[String]
    var attachments: js.UndefOr[Attachments]
    var stopCode: js.UndefOr[TaskStopCode]
    var group: js.UndefOr[String]
    var executionStoppedAt: js.UndefOr[Timestamp]
    var connectivity: js.UndefOr[Connectivity]
    var pullStartedAt: js.UndefOr[Timestamp]
    var memory: js.UndefOr[String]
  }

  object Task {
    def apply(
      taskDefinitionArn: js.UndefOr[String] = js.undefined,
      startedBy: js.UndefOr[String] = js.undefined,
      lastStatus: js.UndefOr[String] = js.undefined,
      connectivityAt: js.UndefOr[Timestamp] = js.undefined,
      platformVersion: js.UndefOr[String] = js.undefined,
      pullStoppedAt: js.UndefOr[Timestamp] = js.undefined,
      stoppedAt: js.UndefOr[Timestamp] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      desiredStatus: js.UndefOr[String] = js.undefined,
      healthStatus: js.UndefOr[HealthStatus] = js.undefined,
      launchType: js.UndefOr[LaunchType] = js.undefined,
      stoppedReason: js.UndefOr[String] = js.undefined,
      overrides: js.UndefOr[TaskOverride] = js.undefined,
      version: js.UndefOr[Double] = js.undefined,
      containers: js.UndefOr[Containers] = js.undefined,
      cpu: js.UndefOr[String] = js.undefined,
      taskArn: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      startedAt: js.UndefOr[Timestamp] = js.undefined,
      stoppingAt: js.UndefOr[Timestamp] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined,
      clusterArn: js.UndefOr[String] = js.undefined,
      attachments: js.UndefOr[Attachments] = js.undefined,
      stopCode: js.UndefOr[TaskStopCode] = js.undefined,
      group: js.UndefOr[String] = js.undefined,
      executionStoppedAt: js.UndefOr[Timestamp] = js.undefined,
      connectivity: js.UndefOr[Connectivity] = js.undefined,
      pullStartedAt: js.UndefOr[Timestamp] = js.undefined,
      memory: js.UndefOr[String] = js.undefined): Task = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinitionArn" -> taskDefinitionArn.map { x => x.asInstanceOf[js.Any] },
        "startedBy" -> startedBy.map { x => x.asInstanceOf[js.Any] },
        "lastStatus" -> lastStatus.map { x => x.asInstanceOf[js.Any] },
        "connectivityAt" -> connectivityAt.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "pullStoppedAt" -> pullStoppedAt.map { x => x.asInstanceOf[js.Any] },
        "stoppedAt" -> stoppedAt.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "desiredStatus" -> desiredStatus.map { x => x.asInstanceOf[js.Any] },
        "healthStatus" -> healthStatus.map { x => x.asInstanceOf[js.Any] },
        "launchType" -> launchType.map { x => x.asInstanceOf[js.Any] },
        "stoppedReason" -> stoppedReason.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "containers" -> containers.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "taskArn" -> taskArn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "stoppingAt" -> stoppingAt.map { x => x.asInstanceOf[js.Any] },
        "containerInstanceArn" -> containerInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "clusterArn" -> clusterArn.map { x => x.asInstanceOf[js.Any] },
        "attachments" -> attachments.map { x => x.asInstanceOf[js.Any] },
        "stopCode" -> stopCode.map { x => x.asInstanceOf[js.Any] },
        "group" -> group.map { x => x.asInstanceOf[js.Any] },
        "executionStoppedAt" -> executionStoppedAt.map { x => x.asInstanceOf[js.Any] },
        "connectivity" -> connectivity.map { x => x.asInstanceOf[js.Any] },
        "pullStartedAt" -> pullStartedAt.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Task]
    }
  }

  /**
   * <p>Details of a task definition.</p>
   */
  @js.native
  trait TaskDefinition extends js.Object {
    var taskDefinitionArn: js.UndefOr[String]
    var pidMode: js.UndefOr[PidMode]
    var requiresAttributes: js.UndefOr[RequiresAttributes]
    var taskRoleArn: js.UndefOr[String]
    var compatibilities: js.UndefOr[CompatibilityList]
    var volumes: js.UndefOr[VolumeList]
    var revision: js.UndefOr[Int]
    var ipcMode: js.UndefOr[IpcMode]
    var requiresCompatibilities: js.UndefOr[CompatibilityList]
    var status: js.UndefOr[TaskDefinitionStatus]
    var cpu: js.UndefOr[String]
    var executionRoleArn: js.UndefOr[String]
    var containerDefinitions: js.UndefOr[ContainerDefinitions]
    var networkMode: js.UndefOr[NetworkMode]
    var placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints]
    var family: js.UndefOr[String]
    var memory: js.UndefOr[String]
  }

  object TaskDefinition {
    def apply(
      taskDefinitionArn: js.UndefOr[String] = js.undefined,
      pidMode: js.UndefOr[PidMode] = js.undefined,
      requiresAttributes: js.UndefOr[RequiresAttributes] = js.undefined,
      taskRoleArn: js.UndefOr[String] = js.undefined,
      compatibilities: js.UndefOr[CompatibilityList] = js.undefined,
      volumes: js.UndefOr[VolumeList] = js.undefined,
      revision: js.UndefOr[Int] = js.undefined,
      ipcMode: js.UndefOr[IpcMode] = js.undefined,
      requiresCompatibilities: js.UndefOr[CompatibilityList] = js.undefined,
      status: js.UndefOr[TaskDefinitionStatus] = js.undefined,
      cpu: js.UndefOr[String] = js.undefined,
      executionRoleArn: js.UndefOr[String] = js.undefined,
      containerDefinitions: js.UndefOr[ContainerDefinitions] = js.undefined,
      networkMode: js.UndefOr[NetworkMode] = js.undefined,
      placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.undefined,
      family: js.UndefOr[String] = js.undefined,
      memory: js.UndefOr[String] = js.undefined): TaskDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskDefinitionArn" -> taskDefinitionArn.map { x => x.asInstanceOf[js.Any] },
        "pidMode" -> pidMode.map { x => x.asInstanceOf[js.Any] },
        "requiresAttributes" -> requiresAttributes.map { x => x.asInstanceOf[js.Any] },
        "taskRoleArn" -> taskRoleArn.map { x => x.asInstanceOf[js.Any] },
        "compatibilities" -> compatibilities.map { x => x.asInstanceOf[js.Any] },
        "volumes" -> volumes.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] },
        "ipcMode" -> ipcMode.map { x => x.asInstanceOf[js.Any] },
        "requiresCompatibilities" -> requiresCompatibilities.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "executionRoleArn" -> executionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "containerDefinitions" -> containerDefinitions.map { x => x.asInstanceOf[js.Any] },
        "networkMode" -> networkMode.map { x => x.asInstanceOf[js.Any] },
        "placementConstraints" -> placementConstraints.map { x => x.asInstanceOf[js.Any] },
        "family" -> family.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>An object representing a constraint on task placement in the task definition.</p> <p>If you are using the Fargate launch type, task placement constraints are not supported.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html">Task Placement Constraints</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
   */
  @js.native
  trait TaskDefinitionPlacementConstraint extends js.Object {
    var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType]
    var expression: js.UndefOr[String]
  }

  object TaskDefinitionPlacementConstraint {
    def apply(
      `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.undefined,
      expression: js.UndefOr[String] = js.undefined): TaskDefinitionPlacementConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "expression" -> expression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The overrides associated with a task.</p>
   */
  @js.native
  trait TaskOverride extends js.Object {
    var containerOverrides: js.UndefOr[ContainerOverrides]
    var taskRoleArn: js.UndefOr[String]
    var executionRoleArn: js.UndefOr[String]
  }

  object TaskOverride {
    def apply(
      containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined,
      taskRoleArn: js.UndefOr[String] = js.undefined,
      executionRoleArn: js.UndefOr[String] = js.undefined): TaskOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerOverrides" -> containerOverrides.map { x => x.asInstanceOf[js.Any] },
        "taskRoleArn" -> taskRoleArn.map { x => x.asInstanceOf[js.Any] },
        "executionRoleArn" -> executionRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskOverride]
    }
  }

  object TaskStopCodeEnum {
    val TaskFailedToStart = "TaskFailedToStart"
    val EssentialContainerExited = "EssentialContainerExited"
    val UserInitiated = "UserInitiated"

    val values = IndexedSeq(TaskFailedToStart, EssentialContainerExited, UserInitiated)
  }

  /**
   * <p>The container path, mount options, and size of the tmpfs mount.</p>
   */
  @js.native
  trait Tmpfs extends js.Object {
    var containerPath: js.UndefOr[String]
    var size: js.UndefOr[Int]
    var mountOptions: js.UndefOr[StringList]
  }

  object Tmpfs {
    def apply(
      containerPath: js.UndefOr[String] = js.undefined,
      size: js.UndefOr[Int] = js.undefined,
      mountOptions: js.UndefOr[StringList] = js.undefined): Tmpfs = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerPath" -> containerPath.map { x => x.asInstanceOf[js.Any] },
        "size" -> size.map { x => x.asInstanceOf[js.Any] },
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
   * <p>The <code>ulimit</code> settings to pass to the container.</p>
   */
  @js.native
  trait Ulimit extends js.Object {
    var name: js.UndefOr[UlimitName]
    var softLimit: js.UndefOr[Int]
    var hardLimit: js.UndefOr[Int]
  }

  object Ulimit {
    def apply(
      name: js.UndefOr[UlimitName] = js.undefined,
      softLimit: js.UndefOr[Int] = js.undefined,
      hardLimit: js.UndefOr[Int] = js.undefined): Ulimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "softLimit" -> softLimit.map { x => x.asInstanceOf[js.Any] },
        "hardLimit" -> hardLimit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var resourceArn: js.UndefOr[String]
    var tagKeys: js.UndefOr[TagKeys]
  }

  object UntagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[String] = js.undefined,
      tagKeys: js.UndefOr[TagKeys] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tagKeys" -> tagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var cluster: js.UndefOr[String]
    var containerInstance: js.UndefOr[String]
  }

  object UpdateContainerAgentRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      containerInstance: js.UndefOr[String] = js.undefined): UpdateContainerAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerInstance" -> containerInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var cluster: js.UndefOr[String]
    var containerInstances: js.UndefOr[StringList]
    var status: js.UndefOr[ContainerInstanceStatus]
  }

  object UpdateContainerInstancesStateRequest {
    def apply(
      cluster: js.UndefOr[String] = js.undefined,
      containerInstances: js.UndefOr[StringList] = js.undefined,
      status: js.UndefOr[ContainerInstanceStatus] = js.undefined): UpdateContainerInstancesStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "containerInstances" -> containerInstances.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var platformVersion: js.UndefOr[String]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var desiredCount: js.UndefOr[BoxedInteger]
    var forceNewDeployment: js.UndefOr[Boolean]
    var service: js.UndefOr[String]
    var cluster: js.UndefOr[String]
    var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger]
    var deploymentConfiguration: js.UndefOr[DeploymentConfiguration]
    var taskDefinition: js.UndefOr[String]
  }

  object UpdateServiceRequest {
    def apply(
      platformVersion: js.UndefOr[String] = js.undefined,
      networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
      desiredCount: js.UndefOr[BoxedInteger] = js.undefined,
      forceNewDeployment: js.UndefOr[Boolean] = js.undefined,
      service: js.UndefOr[String] = js.undefined,
      cluster: js.UndefOr[String] = js.undefined,
      healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.undefined,
      deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.undefined,
      taskDefinition: js.UndefOr[String] = js.undefined): UpdateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "networkConfiguration" -> networkConfiguration.map { x => x.asInstanceOf[js.Any] },
        "desiredCount" -> desiredCount.map { x => x.asInstanceOf[js.Any] },
        "forceNewDeployment" -> forceNewDeployment.map { x => x.asInstanceOf[js.Any] },
        "service" -> service.map { x => x.asInstanceOf[js.Any] },
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] },
        "healthCheckGracePeriodSeconds" -> healthCheckGracePeriodSeconds.map { x => x.asInstanceOf[js.Any] },
        "deploymentConfiguration" -> deploymentConfiguration.map { x => x.asInstanceOf[js.Any] },
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
   * <p>The Docker and Amazon ECS container agent version information about a container instance.</p>
   */
  @js.native
  trait VersionInfo extends js.Object {
    var agentVersion: js.UndefOr[String]
    var agentHash: js.UndefOr[String]
    var dockerVersion: js.UndefOr[String]
  }

  object VersionInfo {
    def apply(
      agentVersion: js.UndefOr[String] = js.undefined,
      agentHash: js.UndefOr[String] = js.undefined,
      dockerVersion: js.UndefOr[String] = js.undefined): VersionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentVersion" -> agentVersion.map { x => x.asInstanceOf[js.Any] },
        "agentHash" -> agentHash.map { x => x.asInstanceOf[js.Any] },
        "dockerVersion" -> dockerVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VersionInfo]
    }
  }

  /**
   * <p>A data volume used in a task definition. For tasks that use a Docker volume, specify a <code>DockerVolumeConfiguration</code>. For tasks that use a bind mount host volume, specify a <code>host</code> and optional <code>sourcePath</code>. For more information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguideusing_data_volumes.html">Using Data Volumes in Tasks</a>.</p>
   */
  @js.native
  trait Volume extends js.Object {
    var name: js.UndefOr[String]
    var host: js.UndefOr[HostVolumeProperties]
    var dockerVolumeConfiguration: js.UndefOr[DockerVolumeConfiguration]
  }

  object Volume {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      host: js.UndefOr[HostVolumeProperties] = js.undefined,
      dockerVolumeConfiguration: js.UndefOr[DockerVolumeConfiguration] = js.undefined): Volume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "host" -> host.map { x => x.asInstanceOf[js.Any] },
        "dockerVolumeConfiguration" -> dockerVolumeConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
    }
  }

  /**
   * <p>Details on a data volume from another container in the same task definition.</p>
   */
  @js.native
  trait VolumeFrom extends js.Object {
    var sourceContainer: js.UndefOr[String]
    var readOnly: js.UndefOr[BoxedBoolean]
  }

  object VolumeFrom {
    def apply(
      sourceContainer: js.UndefOr[String] = js.undefined,
      readOnly: js.UndefOr[BoxedBoolean] = js.undefined): VolumeFrom = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sourceContainer" -> sourceContainer.map { x => x.asInstanceOf[js.Any] },
        "readOnly" -> readOnly.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeFrom]
    }
  }
}
