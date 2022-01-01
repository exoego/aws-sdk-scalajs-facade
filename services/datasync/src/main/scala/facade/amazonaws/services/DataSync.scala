package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object datasync {
  type ActivationKey = String
  type AgentArn = String
  type AgentArnList = js.Array[AgentArn]
  type AgentList = js.Array[AgentListEntry]
  type BytesPerSecond = Double
  type DestinationNetworkInterfaceArns = js.Array[NetworkInterfaceArn]
  type Duration = Double
  type Ec2SecurityGroupArn = String
  type Ec2SecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type Ec2SubnetArn = String
  type EfsFilesystemArn = String
  type EfsSubdirectory = String
  type Endpoint = String
  type FilterAttributeValue = String
  type FilterList = js.Array[FilterRule]
  type FilterValue = String
  type FilterValues = js.Array[FilterAttributeValue]
  type FsxFilesystemArn = String
  type FsxLustreSubdirectory = String
  type FsxWindowsSubdirectory = String
  type HdfsBlockSize = Int
  type HdfsNameNodeList = js.Array[HdfsNameNode]
  type HdfsReplicationFactor = Int
  type HdfsServerHostname = String
  type HdfsServerPort = Int
  type HdfsSubdirectory = String
  type HdfsUser = String
  type IamRoleArn = String
  type InputTagList = js.Array[TagListEntry]
  type KerberosKeytabFile = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type KerberosKrb5ConfFile = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type KerberosPrincipal = String
  type KmsKeyProviderUri = String
  type LocationArn = String
  type LocationFilters = js.Array[LocationFilter]
  type LocationList = js.Array[LocationListEntry]
  type LocationUri = String
  type LogGroupArn = String
  type MaxResults = Int
  type NetworkInterfaceArn = String
  type NextToken = String
  type NfsSubdirectory = String
  type ObjectStorageAccessKey = String
  type ObjectStorageBucketName = String
  type ObjectStorageSecretKey = String
  type ObjectStorageServerPort = Int
  type OutputTagList = js.Array[TagListEntry]
  type PLSecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type PLSubnetArnList = js.Array[Ec2SubnetArn]
  type S3BucketArn = String
  type S3Subdirectory = String
  type ScheduleExpressionCron = String
  type ServerHostname = String
  type SmbDomain = String
  type SmbPassword = String
  type SmbSubdirectory = String
  type SmbUser = String
  type SourceNetworkInterfaceArns = js.Array[NetworkInterfaceArn]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type TaggableResourceArn = String
  type TaskArn = String
  type TaskExecutionArn = String
  type TaskExecutionList = js.Array[TaskExecutionListEntry]
  type TaskFilters = js.Array[TaskFilter]
  type TaskList = js.Array[TaskListEntry]
  type Time = js.Date
  type VpcEndpointId = String

  final class DataSyncOps(private val service: DataSync) extends AnyVal {

    @inline def cancelTaskExecutionFuture(params: CancelTaskExecutionRequest): Future[CancelTaskExecutionResponse] = service.cancelTaskExecution(params).promise().toFuture
    @inline def createAgentFuture(params: CreateAgentRequest): Future[CreateAgentResponse] = service.createAgent(params).promise().toFuture
    @inline def createLocationEfsFuture(params: CreateLocationEfsRequest): Future[CreateLocationEfsResponse] = service.createLocationEfs(params).promise().toFuture
    @inline def createLocationFsxLustreFuture(params: CreateLocationFsxLustreRequest): Future[CreateLocationFsxLustreResponse] = service.createLocationFsxLustre(params).promise().toFuture
    @inline def createLocationFsxWindowsFuture(params: CreateLocationFsxWindowsRequest): Future[CreateLocationFsxWindowsResponse] = service.createLocationFsxWindows(params).promise().toFuture
    @inline def createLocationHdfsFuture(params: CreateLocationHdfsRequest): Future[CreateLocationHdfsResponse] = service.createLocationHdfs(params).promise().toFuture
    @inline def createLocationNfsFuture(params: CreateLocationNfsRequest): Future[CreateLocationNfsResponse] = service.createLocationNfs(params).promise().toFuture
    @inline def createLocationObjectStorageFuture(params: CreateLocationObjectStorageRequest): Future[CreateLocationObjectStorageResponse] = service.createLocationObjectStorage(params).promise().toFuture
    @inline def createLocationS3Future(params: CreateLocationS3Request): Future[CreateLocationS3Response] = service.createLocationS3(params).promise().toFuture
    @inline def createLocationSmbFuture(params: CreateLocationSmbRequest): Future[CreateLocationSmbResponse] = service.createLocationSmb(params).promise().toFuture
    @inline def createTaskFuture(params: CreateTaskRequest): Future[CreateTaskResponse] = service.createTask(params).promise().toFuture
    @inline def deleteAgentFuture(params: DeleteAgentRequest): Future[DeleteAgentResponse] = service.deleteAgent(params).promise().toFuture
    @inline def deleteLocationFuture(params: DeleteLocationRequest): Future[DeleteLocationResponse] = service.deleteLocation(params).promise().toFuture
    @inline def deleteTaskFuture(params: DeleteTaskRequest): Future[DeleteTaskResponse] = service.deleteTask(params).promise().toFuture
    @inline def describeAgentFuture(params: DescribeAgentRequest): Future[DescribeAgentResponse] = service.describeAgent(params).promise().toFuture
    @inline def describeLocationEfsFuture(params: DescribeLocationEfsRequest): Future[DescribeLocationEfsResponse] = service.describeLocationEfs(params).promise().toFuture
    @inline def describeLocationFsxLustreFuture(params: DescribeLocationFsxLustreRequest): Future[DescribeLocationFsxLustreResponse] = service.describeLocationFsxLustre(params).promise().toFuture
    @inline def describeLocationFsxWindowsFuture(params: DescribeLocationFsxWindowsRequest): Future[DescribeLocationFsxWindowsResponse] = service.describeLocationFsxWindows(params).promise().toFuture
    @inline def describeLocationHdfsFuture(params: DescribeLocationHdfsRequest): Future[DescribeLocationHdfsResponse] = service.describeLocationHdfs(params).promise().toFuture
    @inline def describeLocationNfsFuture(params: DescribeLocationNfsRequest): Future[DescribeLocationNfsResponse] = service.describeLocationNfs(params).promise().toFuture
    @inline def describeLocationObjectStorageFuture(params: DescribeLocationObjectStorageRequest): Future[DescribeLocationObjectStorageResponse] = service.describeLocationObjectStorage(params).promise().toFuture
    @inline def describeLocationS3Future(params: DescribeLocationS3Request): Future[DescribeLocationS3Response] = service.describeLocationS3(params).promise().toFuture
    @inline def describeLocationSmbFuture(params: DescribeLocationSmbRequest): Future[DescribeLocationSmbResponse] = service.describeLocationSmb(params).promise().toFuture
    @inline def describeTaskExecutionFuture(params: DescribeTaskExecutionRequest): Future[DescribeTaskExecutionResponse] = service.describeTaskExecution(params).promise().toFuture
    @inline def describeTaskFuture(params: DescribeTaskRequest): Future[DescribeTaskResponse] = service.describeTask(params).promise().toFuture
    @inline def listAgentsFuture(params: ListAgentsRequest): Future[ListAgentsResponse] = service.listAgents(params).promise().toFuture
    @inline def listLocationsFuture(params: ListLocationsRequest): Future[ListLocationsResponse] = service.listLocations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTaskExecutionsFuture(params: ListTaskExecutionsRequest): Future[ListTaskExecutionsResponse] = service.listTaskExecutions(params).promise().toFuture
    @inline def listTasksFuture(params: ListTasksRequest): Future[ListTasksResponse] = service.listTasks(params).promise().toFuture
    @inline def startTaskExecutionFuture(params: StartTaskExecutionRequest): Future[StartTaskExecutionResponse] = service.startTaskExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAgentFuture(params: UpdateAgentRequest): Future[UpdateAgentResponse] = service.updateAgent(params).promise().toFuture
    @inline def updateLocationHdfsFuture(params: UpdateLocationHdfsRequest): Future[UpdateLocationHdfsResponse] = service.updateLocationHdfs(params).promise().toFuture
    @inline def updateLocationNfsFuture(params: UpdateLocationNfsRequest): Future[UpdateLocationNfsResponse] = service.updateLocationNfs(params).promise().toFuture
    @inline def updateLocationObjectStorageFuture(params: UpdateLocationObjectStorageRequest): Future[UpdateLocationObjectStorageResponse] = service.updateLocationObjectStorage(params).promise().toFuture
    @inline def updateLocationSmbFuture(params: UpdateLocationSmbRequest): Future[UpdateLocationSmbResponse] = service.updateLocationSmb(params).promise().toFuture
    @inline def updateTaskExecutionFuture(params: UpdateTaskExecutionRequest): Future[UpdateTaskExecutionResponse] = service.updateTaskExecution(params).promise().toFuture
    @inline def updateTaskFuture(params: UpdateTaskRequest): Future[UpdateTaskResponse] = service.updateTask(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/datasync", JSImport.Namespace, "AWS.DataSync")
  class DataSync() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelTaskExecution(params: CancelTaskExecutionRequest): Request[CancelTaskExecutionResponse] = js.native
    def createAgent(params: CreateAgentRequest): Request[CreateAgentResponse] = js.native
    def createLocationEfs(params: CreateLocationEfsRequest): Request[CreateLocationEfsResponse] = js.native
    def createLocationFsxLustre(params: CreateLocationFsxLustreRequest): Request[CreateLocationFsxLustreResponse] = js.native
    def createLocationFsxWindows(params: CreateLocationFsxWindowsRequest): Request[CreateLocationFsxWindowsResponse] = js.native
    def createLocationHdfs(params: CreateLocationHdfsRequest): Request[CreateLocationHdfsResponse] = js.native
    def createLocationNfs(params: CreateLocationNfsRequest): Request[CreateLocationNfsResponse] = js.native
    def createLocationObjectStorage(params: CreateLocationObjectStorageRequest): Request[CreateLocationObjectStorageResponse] = js.native
    def createLocationS3(params: CreateLocationS3Request): Request[CreateLocationS3Response] = js.native
    def createLocationSmb(params: CreateLocationSmbRequest): Request[CreateLocationSmbResponse] = js.native
    def createTask(params: CreateTaskRequest): Request[CreateTaskResponse] = js.native
    def deleteAgent(params: DeleteAgentRequest): Request[DeleteAgentResponse] = js.native
    def deleteLocation(params: DeleteLocationRequest): Request[DeleteLocationResponse] = js.native
    def deleteTask(params: DeleteTaskRequest): Request[DeleteTaskResponse] = js.native
    def describeAgent(params: DescribeAgentRequest): Request[DescribeAgentResponse] = js.native
    def describeLocationEfs(params: DescribeLocationEfsRequest): Request[DescribeLocationEfsResponse] = js.native
    def describeLocationFsxLustre(params: DescribeLocationFsxLustreRequest): Request[DescribeLocationFsxLustreResponse] = js.native
    def describeLocationFsxWindows(params: DescribeLocationFsxWindowsRequest): Request[DescribeLocationFsxWindowsResponse] = js.native
    def describeLocationHdfs(params: DescribeLocationHdfsRequest): Request[DescribeLocationHdfsResponse] = js.native
    def describeLocationNfs(params: DescribeLocationNfsRequest): Request[DescribeLocationNfsResponse] = js.native
    def describeLocationObjectStorage(params: DescribeLocationObjectStorageRequest): Request[DescribeLocationObjectStorageResponse] = js.native
    def describeLocationS3(params: DescribeLocationS3Request): Request[DescribeLocationS3Response] = js.native
    def describeLocationSmb(params: DescribeLocationSmbRequest): Request[DescribeLocationSmbResponse] = js.native
    def describeTask(params: DescribeTaskRequest): Request[DescribeTaskResponse] = js.native
    def describeTaskExecution(params: DescribeTaskExecutionRequest): Request[DescribeTaskExecutionResponse] = js.native
    def listAgents(params: ListAgentsRequest): Request[ListAgentsResponse] = js.native
    def listLocations(params: ListLocationsRequest): Request[ListLocationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTaskExecutions(params: ListTaskExecutionsRequest): Request[ListTaskExecutionsResponse] = js.native
    def listTasks(params: ListTasksRequest): Request[ListTasksResponse] = js.native
    def startTaskExecution(params: StartTaskExecutionRequest): Request[StartTaskExecutionResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAgent(params: UpdateAgentRequest): Request[UpdateAgentResponse] = js.native
    def updateLocationHdfs(params: UpdateLocationHdfsRequest): Request[UpdateLocationHdfsResponse] = js.native
    def updateLocationNfs(params: UpdateLocationNfsRequest): Request[UpdateLocationNfsResponse] = js.native
    def updateLocationObjectStorage(params: UpdateLocationObjectStorageRequest): Request[UpdateLocationObjectStorageResponse] = js.native
    def updateLocationSmb(params: UpdateLocationSmbRequest): Request[UpdateLocationSmbResponse] = js.native
    def updateTask(params: UpdateTaskRequest): Request[UpdateTaskResponse] = js.native
    def updateTaskExecution(params: UpdateTaskExecutionRequest): Request[UpdateTaskExecutionResponse] = js.native
  }
  object DataSync {
    @inline implicit def toOps(service: DataSync): DataSyncOps = {
      new DataSyncOps(service)
    }
  }

  /** Represents a single entry in a list of agents. <code>AgentListEntry</code> returns an array that contains a list of agents when the [[https://docs.aws.amazon.com/datasync/latest/userguide/API_ListAgents.html|ListAgents]] operation is called.
    */
  @js.native
  trait AgentListEntry extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var Name: js.UndefOr[TagValue]
    var Status: js.UndefOr[AgentStatus]
  }

  object AgentListEntry {
    @inline
    def apply(
        AgentArn: js.UndefOr[AgentArn] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        Status: js.UndefOr[AgentStatus] = js.undefined
    ): AgentListEntry = {
      val __obj = js.Dynamic.literal()
      AgentArn.foreach(__v => __obj.updateDynamic("AgentArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentListEntry]
    }
  }

  @js.native
  trait CancelTaskExecutionRequest extends js.Object {
    var TaskExecutionArn: TaskExecutionArn
  }

  object CancelTaskExecutionRequest {
    @inline
    def apply(
        TaskExecutionArn: TaskExecutionArn
    ): CancelTaskExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "TaskExecutionArn" -> TaskExecutionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelTaskExecutionRequest]
    }
  }

  @js.native
  trait CancelTaskExecutionResponse extends js.Object

  object CancelTaskExecutionResponse {
    @inline
    def apply(): CancelTaskExecutionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelTaskExecutionResponse]
    }
  }

  @js.native
  trait CreateAgentRequest extends js.Object {
    var ActivationKey: ActivationKey
    var AgentName: js.UndefOr[TagValue]
    var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList]
    var SubnetArns: js.UndefOr[PLSubnetArnList]
    var Tags: js.UndefOr[InputTagList]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
  }

  object CreateAgentRequest {
    @inline
    def apply(
        ActivationKey: ActivationKey,
        AgentName: js.UndefOr[TagValue] = js.undefined,
        SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.undefined,
        SubnetArns: js.UndefOr[PLSubnetArnList] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined,
        VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined
    ): CreateAgentRequest = {
      val __obj = js.Dynamic.literal(
        "ActivationKey" -> ActivationKey.asInstanceOf[js.Any]
      )

      AgentName.foreach(__v => __obj.updateDynamic("AgentName")(__v.asInstanceOf[js.Any]))
      SecurityGroupArns.foreach(__v => __obj.updateDynamic("SecurityGroupArns")(__v.asInstanceOf[js.Any]))
      SubnetArns.foreach(__v => __obj.updateDynamic("SubnetArns")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcEndpointId.foreach(__v => __obj.updateDynamic("VpcEndpointId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAgentRequest]
    }
  }

  @js.native
  trait CreateAgentResponse extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
  }

  object CreateAgentResponse {
    @inline
    def apply(
        AgentArn: js.UndefOr[AgentArn] = js.undefined
    ): CreateAgentResponse = {
      val __obj = js.Dynamic.literal()
      AgentArn.foreach(__v => __obj.updateDynamic("AgentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAgentResponse]
    }
  }

  @js.native
  trait CreateLocationEfsRequest extends js.Object {
    var Ec2Config: Ec2Config
    var EfsFilesystemArn: EfsFilesystemArn
    var Subdirectory: js.UndefOr[EfsSubdirectory]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateLocationEfsRequest {
    @inline
    def apply(
        Ec2Config: Ec2Config,
        EfsFilesystemArn: EfsFilesystemArn,
        Subdirectory: js.UndefOr[EfsSubdirectory] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateLocationEfsRequest = {
      val __obj = js.Dynamic.literal(
        "Ec2Config" -> Ec2Config.asInstanceOf[js.Any],
        "EfsFilesystemArn" -> EfsFilesystemArn.asInstanceOf[js.Any]
      )

      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationEfsRequest]
    }
  }

  /** CreateLocationEfs
    */
  @js.native
  trait CreateLocationEfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationEfsResponse {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationEfsResponse = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationEfsResponse]
    }
  }

  @js.native
  trait CreateLocationFsxLustreRequest extends js.Object {
    var FsxFilesystemArn: FsxFilesystemArn
    var SecurityGroupArns: Ec2SecurityGroupArnList
    var Subdirectory: js.UndefOr[FsxLustreSubdirectory]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateLocationFsxLustreRequest {
    @inline
    def apply(
        FsxFilesystemArn: FsxFilesystemArn,
        SecurityGroupArns: Ec2SecurityGroupArnList,
        Subdirectory: js.UndefOr[FsxLustreSubdirectory] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateLocationFsxLustreRequest = {
      val __obj = js.Dynamic.literal(
        "FsxFilesystemArn" -> FsxFilesystemArn.asInstanceOf[js.Any],
        "SecurityGroupArns" -> SecurityGroupArns.asInstanceOf[js.Any]
      )

      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationFsxLustreRequest]
    }
  }

  @js.native
  trait CreateLocationFsxLustreResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationFsxLustreResponse {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationFsxLustreResponse = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationFsxLustreResponse]
    }
  }

  @js.native
  trait CreateLocationFsxWindowsRequest extends js.Object {
    var FsxFilesystemArn: FsxFilesystemArn
    var Password: SmbPassword
    var SecurityGroupArns: Ec2SecurityGroupArnList
    var User: SmbUser
    var Domain: js.UndefOr[SmbDomain]
    var Subdirectory: js.UndefOr[FsxWindowsSubdirectory]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateLocationFsxWindowsRequest {
    @inline
    def apply(
        FsxFilesystemArn: FsxFilesystemArn,
        Password: SmbPassword,
        SecurityGroupArns: Ec2SecurityGroupArnList,
        User: SmbUser,
        Domain: js.UndefOr[SmbDomain] = js.undefined,
        Subdirectory: js.UndefOr[FsxWindowsSubdirectory] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateLocationFsxWindowsRequest = {
      val __obj = js.Dynamic.literal(
        "FsxFilesystemArn" -> FsxFilesystemArn.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "SecurityGroupArns" -> SecurityGroupArns.asInstanceOf[js.Any],
        "User" -> User.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationFsxWindowsRequest]
    }
  }

  @js.native
  trait CreateLocationFsxWindowsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationFsxWindowsResponse {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationFsxWindowsResponse = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationFsxWindowsResponse]
    }
  }

  @js.native
  trait CreateLocationHdfsRequest extends js.Object {
    var AgentArns: AgentArnList
    var AuthenticationType: HdfsAuthenticationType
    var NameNodes: HdfsNameNodeList
    var BlockSize: js.UndefOr[HdfsBlockSize]
    var KerberosKeytab: js.UndefOr[KerberosKeytabFile]
    var KerberosKrb5Conf: js.UndefOr[KerberosKrb5ConfFile]
    var KerberosPrincipal: js.UndefOr[KerberosPrincipal]
    var KmsKeyProviderUri: js.UndefOr[KmsKeyProviderUri]
    var QopConfiguration: js.UndefOr[QopConfiguration]
    var ReplicationFactor: js.UndefOr[HdfsReplicationFactor]
    var SimpleUser: js.UndefOr[HdfsUser]
    var Subdirectory: js.UndefOr[HdfsSubdirectory]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateLocationHdfsRequest {
    @inline
    def apply(
        AgentArns: AgentArnList,
        AuthenticationType: HdfsAuthenticationType,
        NameNodes: HdfsNameNodeList,
        BlockSize: js.UndefOr[HdfsBlockSize] = js.undefined,
        KerberosKeytab: js.UndefOr[KerberosKeytabFile] = js.undefined,
        KerberosKrb5Conf: js.UndefOr[KerberosKrb5ConfFile] = js.undefined,
        KerberosPrincipal: js.UndefOr[KerberosPrincipal] = js.undefined,
        KmsKeyProviderUri: js.UndefOr[KmsKeyProviderUri] = js.undefined,
        QopConfiguration: js.UndefOr[QopConfiguration] = js.undefined,
        ReplicationFactor: js.UndefOr[HdfsReplicationFactor] = js.undefined,
        SimpleUser: js.UndefOr[HdfsUser] = js.undefined,
        Subdirectory: js.UndefOr[HdfsSubdirectory] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateLocationHdfsRequest = {
      val __obj = js.Dynamic.literal(
        "AgentArns" -> AgentArns.asInstanceOf[js.Any],
        "AuthenticationType" -> AuthenticationType.asInstanceOf[js.Any],
        "NameNodes" -> NameNodes.asInstanceOf[js.Any]
      )

      BlockSize.foreach(__v => __obj.updateDynamic("BlockSize")(__v.asInstanceOf[js.Any]))
      KerberosKeytab.foreach(__v => __obj.updateDynamic("KerberosKeytab")(__v.asInstanceOf[js.Any]))
      KerberosKrb5Conf.foreach(__v => __obj.updateDynamic("KerberosKrb5Conf")(__v.asInstanceOf[js.Any]))
      KerberosPrincipal.foreach(__v => __obj.updateDynamic("KerberosPrincipal")(__v.asInstanceOf[js.Any]))
      KmsKeyProviderUri.foreach(__v => __obj.updateDynamic("KmsKeyProviderUri")(__v.asInstanceOf[js.Any]))
      QopConfiguration.foreach(__v => __obj.updateDynamic("QopConfiguration")(__v.asInstanceOf[js.Any]))
      ReplicationFactor.foreach(__v => __obj.updateDynamic("ReplicationFactor")(__v.asInstanceOf[js.Any]))
      SimpleUser.foreach(__v => __obj.updateDynamic("SimpleUser")(__v.asInstanceOf[js.Any]))
      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationHdfsRequest]
    }
  }

  @js.native
  trait CreateLocationHdfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationHdfsResponse {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationHdfsResponse = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationHdfsResponse]
    }
  }

  @js.native
  trait CreateLocationNfsRequest extends js.Object {
    var OnPremConfig: OnPremConfig
    var ServerHostname: ServerHostname
    var Subdirectory: NfsSubdirectory
    var MountOptions: js.UndefOr[NfsMountOptions]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateLocationNfsRequest {
    @inline
    def apply(
        OnPremConfig: OnPremConfig,
        ServerHostname: ServerHostname,
        Subdirectory: NfsSubdirectory,
        MountOptions: js.UndefOr[NfsMountOptions] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateLocationNfsRequest = {
      val __obj = js.Dynamic.literal(
        "OnPremConfig" -> OnPremConfig.asInstanceOf[js.Any],
        "ServerHostname" -> ServerHostname.asInstanceOf[js.Any],
        "Subdirectory" -> Subdirectory.asInstanceOf[js.Any]
      )

      MountOptions.foreach(__v => __obj.updateDynamic("MountOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationNfsRequest]
    }
  }

  @js.native
  trait CreateLocationNfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationNfsResponse {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationNfsResponse = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationNfsResponse]
    }
  }

  @js.native
  trait CreateLocationObjectStorageRequest extends js.Object {
    var AgentArns: AgentArnList
    var BucketName: ObjectStorageBucketName
    var ServerHostname: ServerHostname
    var AccessKey: js.UndefOr[ObjectStorageAccessKey]
    var SecretKey: js.UndefOr[ObjectStorageSecretKey]
    var ServerPort: js.UndefOr[ObjectStorageServerPort]
    var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol]
    var Subdirectory: js.UndefOr[S3Subdirectory]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateLocationObjectStorageRequest {
    @inline
    def apply(
        AgentArns: AgentArnList,
        BucketName: ObjectStorageBucketName,
        ServerHostname: ServerHostname,
        AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.undefined,
        SecretKey: js.UndefOr[ObjectStorageSecretKey] = js.undefined,
        ServerPort: js.UndefOr[ObjectStorageServerPort] = js.undefined,
        ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.undefined,
        Subdirectory: js.UndefOr[S3Subdirectory] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateLocationObjectStorageRequest = {
      val __obj = js.Dynamic.literal(
        "AgentArns" -> AgentArns.asInstanceOf[js.Any],
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "ServerHostname" -> ServerHostname.asInstanceOf[js.Any]
      )

      AccessKey.foreach(__v => __obj.updateDynamic("AccessKey")(__v.asInstanceOf[js.Any]))
      SecretKey.foreach(__v => __obj.updateDynamic("SecretKey")(__v.asInstanceOf[js.Any]))
      ServerPort.foreach(__v => __obj.updateDynamic("ServerPort")(__v.asInstanceOf[js.Any]))
      ServerProtocol.foreach(__v => __obj.updateDynamic("ServerProtocol")(__v.asInstanceOf[js.Any]))
      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationObjectStorageRequest]
    }
  }

  @js.native
  trait CreateLocationObjectStorageResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationObjectStorageResponse {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationObjectStorageResponse = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationObjectStorageResponse]
    }
  }

  @js.native
  trait CreateLocationS3Request extends js.Object {
    var S3BucketArn: S3BucketArn
    var S3Config: S3Config
    var AgentArns: js.UndefOr[AgentArnList]
    var S3StorageClass: js.UndefOr[S3StorageClass]
    var Subdirectory: js.UndefOr[S3Subdirectory]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateLocationS3Request {
    @inline
    def apply(
        S3BucketArn: S3BucketArn,
        S3Config: S3Config,
        AgentArns: js.UndefOr[AgentArnList] = js.undefined,
        S3StorageClass: js.UndefOr[S3StorageClass] = js.undefined,
        Subdirectory: js.UndefOr[S3Subdirectory] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateLocationS3Request = {
      val __obj = js.Dynamic.literal(
        "S3BucketArn" -> S3BucketArn.asInstanceOf[js.Any],
        "S3Config" -> S3Config.asInstanceOf[js.Any]
      )

      AgentArns.foreach(__v => __obj.updateDynamic("AgentArns")(__v.asInstanceOf[js.Any]))
      S3StorageClass.foreach(__v => __obj.updateDynamic("S3StorageClass")(__v.asInstanceOf[js.Any]))
      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationS3Request]
    }
  }

  @js.native
  trait CreateLocationS3Response extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationS3Response {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationS3Response = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationS3Response]
    }
  }

  @js.native
  trait CreateLocationSmbRequest extends js.Object {
    var AgentArns: AgentArnList
    var Password: SmbPassword
    var ServerHostname: ServerHostname
    var Subdirectory: SmbSubdirectory
    var User: SmbUser
    var Domain: js.UndefOr[SmbDomain]
    var MountOptions: js.UndefOr[SmbMountOptions]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateLocationSmbRequest {
    @inline
    def apply(
        AgentArns: AgentArnList,
        Password: SmbPassword,
        ServerHostname: ServerHostname,
        Subdirectory: SmbSubdirectory,
        User: SmbUser,
        Domain: js.UndefOr[SmbDomain] = js.undefined,
        MountOptions: js.UndefOr[SmbMountOptions] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateLocationSmbRequest = {
      val __obj = js.Dynamic.literal(
        "AgentArns" -> AgentArns.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "ServerHostname" -> ServerHostname.asInstanceOf[js.Any],
        "Subdirectory" -> Subdirectory.asInstanceOf[js.Any],
        "User" -> User.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      MountOptions.foreach(__v => __obj.updateDynamic("MountOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationSmbRequest]
    }
  }

  @js.native
  trait CreateLocationSmbResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationSmbResponse {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationSmbResponse = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLocationSmbResponse]
    }
  }

  @js.native
  trait CreateTaskRequest extends js.Object {
    var DestinationLocationArn: LocationArn
    var SourceLocationArn: LocationArn
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var Excludes: js.UndefOr[FilterList]
    var Includes: js.UndefOr[FilterList]
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
    var Schedule: js.UndefOr[TaskSchedule]
    var Tags: js.UndefOr[InputTagList]
  }

  object CreateTaskRequest {
    @inline
    def apply(
        DestinationLocationArn: LocationArn,
        SourceLocationArn: LocationArn,
        CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined,
        Excludes: js.UndefOr[FilterList] = js.undefined,
        Includes: js.UndefOr[FilterList] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        Options: js.UndefOr[Options] = js.undefined,
        Schedule: js.UndefOr[TaskSchedule] = js.undefined,
        Tags: js.UndefOr[InputTagList] = js.undefined
    ): CreateTaskRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationLocationArn" -> DestinationLocationArn.asInstanceOf[js.Any],
        "SourceLocationArn" -> SourceLocationArn.asInstanceOf[js.Any]
      )

      CloudWatchLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogGroupArn")(__v.asInstanceOf[js.Any]))
      Excludes.foreach(__v => __obj.updateDynamic("Excludes")(__v.asInstanceOf[js.Any]))
      Includes.foreach(__v => __obj.updateDynamic("Includes")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTaskRequest]
    }
  }

  @js.native
  trait CreateTaskResponse extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
  }

  object CreateTaskResponse {
    @inline
    def apply(
        TaskArn: js.UndefOr[TaskArn] = js.undefined
    ): CreateTaskResponse = {
      val __obj = js.Dynamic.literal()
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTaskResponse]
    }
  }

  @js.native
  trait DeleteAgentRequest extends js.Object {
    var AgentArn: AgentArn
  }

  object DeleteAgentRequest {
    @inline
    def apply(
        AgentArn: AgentArn
    ): DeleteAgentRequest = {
      val __obj = js.Dynamic.literal(
        "AgentArn" -> AgentArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAgentRequest]
    }
  }

  @js.native
  trait DeleteAgentResponse extends js.Object

  object DeleteAgentResponse {
    @inline
    def apply(): DeleteAgentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAgentResponse]
    }
  }

  /** DeleteLocation
    */
  @js.native
  trait DeleteLocationRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DeleteLocationRequest {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DeleteLocationRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLocationRequest]
    }
  }

  @js.native
  trait DeleteLocationResponse extends js.Object

  object DeleteLocationResponse {
    @inline
    def apply(): DeleteLocationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLocationResponse]
    }
  }

  /** DeleteTask
    */
  @js.native
  trait DeleteTaskRequest extends js.Object {
    var TaskArn: TaskArn
  }

  object DeleteTaskRequest {
    @inline
    def apply(
        TaskArn: TaskArn
    ): DeleteTaskRequest = {
      val __obj = js.Dynamic.literal(
        "TaskArn" -> TaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTaskRequest]
    }
  }

  @js.native
  trait DeleteTaskResponse extends js.Object

  object DeleteTaskResponse {
    @inline
    def apply(): DeleteTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTaskResponse]
    }
  }

  /** DescribeAgent
    */
  @js.native
  trait DescribeAgentRequest extends js.Object {
    var AgentArn: AgentArn
  }

  object DescribeAgentRequest {
    @inline
    def apply(
        AgentArn: AgentArn
    ): DescribeAgentRequest = {
      val __obj = js.Dynamic.literal(
        "AgentArn" -> AgentArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAgentRequest]
    }
  }

  @js.native
  trait DescribeAgentResponse extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var CreationTime: js.UndefOr[Time]
    var EndpointType: js.UndefOr[EndpointType]
    var LastConnectionTime: js.UndefOr[Time]
    var Name: js.UndefOr[TagValue]
    var PrivateLinkConfig: js.UndefOr[PrivateLinkConfig]
    var Status: js.UndefOr[AgentStatus]
  }

  object DescribeAgentResponse {
    @inline
    def apply(
        AgentArn: js.UndefOr[AgentArn] = js.undefined,
        CreationTime: js.UndefOr[Time] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        LastConnectionTime: js.UndefOr[Time] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        PrivateLinkConfig: js.UndefOr[PrivateLinkConfig] = js.undefined,
        Status: js.UndefOr[AgentStatus] = js.undefined
    ): DescribeAgentResponse = {
      val __obj = js.Dynamic.literal()
      AgentArn.foreach(__v => __obj.updateDynamic("AgentArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      LastConnectionTime.foreach(__v => __obj.updateDynamic("LastConnectionTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PrivateLinkConfig.foreach(__v => __obj.updateDynamic("PrivateLinkConfig")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAgentResponse]
    }
  }

  @js.native
  trait DescribeLocationEfsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationEfsRequest {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationEfsRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLocationEfsRequest]
    }
  }

  @js.native
  trait DescribeLocationEfsResponse extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var Ec2Config: js.UndefOr[Ec2Config]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
  }

  object DescribeLocationEfsResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Time] = js.undefined,
        Ec2Config: js.UndefOr[Ec2Config] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined
    ): DescribeLocationEfsResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Ec2Config.foreach(__v => __obj.updateDynamic("Ec2Config")(__v.asInstanceOf[js.Any]))
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLocationEfsResponse]
    }
  }

  @js.native
  trait DescribeLocationFsxLustreRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationFsxLustreRequest {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationFsxLustreRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLocationFsxLustreRequest]
    }
  }

  @js.native
  trait DescribeLocationFsxLustreResponse extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList]
  }

  object DescribeLocationFsxLustreResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Time] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.undefined
    ): DescribeLocationFsxLustreResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      SecurityGroupArns.foreach(__v => __obj.updateDynamic("SecurityGroupArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLocationFsxLustreResponse]
    }
  }

  @js.native
  trait DescribeLocationFsxWindowsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationFsxWindowsRequest {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationFsxWindowsRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLocationFsxWindowsRequest]
    }
  }

  @js.native
  trait DescribeLocationFsxWindowsResponse extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var Domain: js.UndefOr[SmbDomain]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList]
    var User: js.UndefOr[SmbUser]
  }

  object DescribeLocationFsxWindowsResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Time] = js.undefined,
        Domain: js.UndefOr[SmbDomain] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.undefined,
        User: js.UndefOr[SmbUser] = js.undefined
    ): DescribeLocationFsxWindowsResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      SecurityGroupArns.foreach(__v => __obj.updateDynamic("SecurityGroupArns")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLocationFsxWindowsResponse]
    }
  }

  @js.native
  trait DescribeLocationHdfsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationHdfsRequest {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationHdfsRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLocationHdfsRequest]
    }
  }

  @js.native
  trait DescribeLocationHdfsResponse extends js.Object {
    var AgentArns: js.UndefOr[AgentArnList]
    var AuthenticationType: js.UndefOr[HdfsAuthenticationType]
    var BlockSize: js.UndefOr[HdfsBlockSize]
    var CreationTime: js.UndefOr[Time]
    var KerberosPrincipal: js.UndefOr[KerberosPrincipal]
    var KmsKeyProviderUri: js.UndefOr[KmsKeyProviderUri]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var NameNodes: js.UndefOr[HdfsNameNodeList]
    var QopConfiguration: js.UndefOr[QopConfiguration]
    var ReplicationFactor: js.UndefOr[HdfsReplicationFactor]
    var SimpleUser: js.UndefOr[HdfsUser]
  }

  object DescribeLocationHdfsResponse {
    @inline
    def apply(
        AgentArns: js.UndefOr[AgentArnList] = js.undefined,
        AuthenticationType: js.UndefOr[HdfsAuthenticationType] = js.undefined,
        BlockSize: js.UndefOr[HdfsBlockSize] = js.undefined,
        CreationTime: js.UndefOr[Time] = js.undefined,
        KerberosPrincipal: js.UndefOr[KerberosPrincipal] = js.undefined,
        KmsKeyProviderUri: js.UndefOr[KmsKeyProviderUri] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        NameNodes: js.UndefOr[HdfsNameNodeList] = js.undefined,
        QopConfiguration: js.UndefOr[QopConfiguration] = js.undefined,
        ReplicationFactor: js.UndefOr[HdfsReplicationFactor] = js.undefined,
        SimpleUser: js.UndefOr[HdfsUser] = js.undefined
    ): DescribeLocationHdfsResponse = {
      val __obj = js.Dynamic.literal()
      AgentArns.foreach(__v => __obj.updateDynamic("AgentArns")(__v.asInstanceOf[js.Any]))
      AuthenticationType.foreach(__v => __obj.updateDynamic("AuthenticationType")(__v.asInstanceOf[js.Any]))
      BlockSize.foreach(__v => __obj.updateDynamic("BlockSize")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      KerberosPrincipal.foreach(__v => __obj.updateDynamic("KerberosPrincipal")(__v.asInstanceOf[js.Any]))
      KmsKeyProviderUri.foreach(__v => __obj.updateDynamic("KmsKeyProviderUri")(__v.asInstanceOf[js.Any]))
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      NameNodes.foreach(__v => __obj.updateDynamic("NameNodes")(__v.asInstanceOf[js.Any]))
      QopConfiguration.foreach(__v => __obj.updateDynamic("QopConfiguration")(__v.asInstanceOf[js.Any]))
      ReplicationFactor.foreach(__v => __obj.updateDynamic("ReplicationFactor")(__v.asInstanceOf[js.Any]))
      SimpleUser.foreach(__v => __obj.updateDynamic("SimpleUser")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLocationHdfsResponse]
    }
  }

  @js.native
  trait DescribeLocationNfsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationNfsRequest {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationNfsRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLocationNfsRequest]
    }
  }

  @js.native
  trait DescribeLocationNfsResponse extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var MountOptions: js.UndefOr[NfsMountOptions]
    var OnPremConfig: js.UndefOr[OnPremConfig]
  }

  object DescribeLocationNfsResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Time] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        MountOptions: js.UndefOr[NfsMountOptions] = js.undefined,
        OnPremConfig: js.UndefOr[OnPremConfig] = js.undefined
    ): DescribeLocationNfsResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      MountOptions.foreach(__v => __obj.updateDynamic("MountOptions")(__v.asInstanceOf[js.Any]))
      OnPremConfig.foreach(__v => __obj.updateDynamic("OnPremConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLocationNfsResponse]
    }
  }

  @js.native
  trait DescribeLocationObjectStorageRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationObjectStorageRequest {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationObjectStorageRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLocationObjectStorageRequest]
    }
  }

  @js.native
  trait DescribeLocationObjectStorageResponse extends js.Object {
    var AccessKey: js.UndefOr[ObjectStorageAccessKey]
    var AgentArns: js.UndefOr[AgentArnList]
    var CreationTime: js.UndefOr[Time]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var ServerPort: js.UndefOr[ObjectStorageServerPort]
    var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol]
  }

  object DescribeLocationObjectStorageResponse {
    @inline
    def apply(
        AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.undefined,
        AgentArns: js.UndefOr[AgentArnList] = js.undefined,
        CreationTime: js.UndefOr[Time] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        ServerPort: js.UndefOr[ObjectStorageServerPort] = js.undefined,
        ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.undefined
    ): DescribeLocationObjectStorageResponse = {
      val __obj = js.Dynamic.literal()
      AccessKey.foreach(__v => __obj.updateDynamic("AccessKey")(__v.asInstanceOf[js.Any]))
      AgentArns.foreach(__v => __obj.updateDynamic("AgentArns")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      ServerPort.foreach(__v => __obj.updateDynamic("ServerPort")(__v.asInstanceOf[js.Any]))
      ServerProtocol.foreach(__v => __obj.updateDynamic("ServerProtocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLocationObjectStorageResponse]
    }
  }

  @js.native
  trait DescribeLocationS3Request extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationS3Request {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationS3Request = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLocationS3Request]
    }
  }

  @js.native
  trait DescribeLocationS3Response extends js.Object {
    var AgentArns: js.UndefOr[AgentArnList]
    var CreationTime: js.UndefOr[Time]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var S3Config: js.UndefOr[S3Config]
    var S3StorageClass: js.UndefOr[S3StorageClass]
  }

  object DescribeLocationS3Response {
    @inline
    def apply(
        AgentArns: js.UndefOr[AgentArnList] = js.undefined,
        CreationTime: js.UndefOr[Time] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        S3Config: js.UndefOr[S3Config] = js.undefined,
        S3StorageClass: js.UndefOr[S3StorageClass] = js.undefined
    ): DescribeLocationS3Response = {
      val __obj = js.Dynamic.literal()
      AgentArns.foreach(__v => __obj.updateDynamic("AgentArns")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      S3Config.foreach(__v => __obj.updateDynamic("S3Config")(__v.asInstanceOf[js.Any]))
      S3StorageClass.foreach(__v => __obj.updateDynamic("S3StorageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLocationS3Response]
    }
  }

  @js.native
  trait DescribeLocationSmbRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationSmbRequest {
    @inline
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationSmbRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLocationSmbRequest]
    }
  }

  @js.native
  trait DescribeLocationSmbResponse extends js.Object {
    var AgentArns: js.UndefOr[AgentArnList]
    var CreationTime: js.UndefOr[Time]
    var Domain: js.UndefOr[SmbDomain]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var MountOptions: js.UndefOr[SmbMountOptions]
    var User: js.UndefOr[SmbUser]
  }

  object DescribeLocationSmbResponse {
    @inline
    def apply(
        AgentArns: js.UndefOr[AgentArnList] = js.undefined,
        CreationTime: js.UndefOr[Time] = js.undefined,
        Domain: js.UndefOr[SmbDomain] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        MountOptions: js.UndefOr[SmbMountOptions] = js.undefined,
        User: js.UndefOr[SmbUser] = js.undefined
    ): DescribeLocationSmbResponse = {
      val __obj = js.Dynamic.literal()
      AgentArns.foreach(__v => __obj.updateDynamic("AgentArns")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      MountOptions.foreach(__v => __obj.updateDynamic("MountOptions")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLocationSmbResponse]
    }
  }

  @js.native
  trait DescribeTaskExecutionRequest extends js.Object {
    var TaskExecutionArn: TaskExecutionArn
  }

  object DescribeTaskExecutionRequest {
    @inline
    def apply(
        TaskExecutionArn: TaskExecutionArn
    ): DescribeTaskExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "TaskExecutionArn" -> TaskExecutionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTaskExecutionRequest]
    }
  }

  @js.native
  trait DescribeTaskExecutionResponse extends js.Object {
    var BytesTransferred: js.UndefOr[Double]
    var BytesWritten: js.UndefOr[Double]
    var EstimatedBytesToTransfer: js.UndefOr[Double]
    var EstimatedFilesToTransfer: js.UndefOr[Double]
    var Excludes: js.UndefOr[FilterList]
    var FilesTransferred: js.UndefOr[Double]
    var Includes: js.UndefOr[FilterList]
    var Options: js.UndefOr[Options]
    var Result: js.UndefOr[TaskExecutionResultDetail]
    var StartTime: js.UndefOr[Time]
    var Status: js.UndefOr[TaskExecutionStatus]
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object DescribeTaskExecutionResponse {
    @inline
    def apply(
        BytesTransferred: js.UndefOr[Double] = js.undefined,
        BytesWritten: js.UndefOr[Double] = js.undefined,
        EstimatedBytesToTransfer: js.UndefOr[Double] = js.undefined,
        EstimatedFilesToTransfer: js.UndefOr[Double] = js.undefined,
        Excludes: js.UndefOr[FilterList] = js.undefined,
        FilesTransferred: js.UndefOr[Double] = js.undefined,
        Includes: js.UndefOr[FilterList] = js.undefined,
        Options: js.UndefOr[Options] = js.undefined,
        Result: js.UndefOr[TaskExecutionResultDetail] = js.undefined,
        StartTime: js.UndefOr[Time] = js.undefined,
        Status: js.UndefOr[TaskExecutionStatus] = js.undefined,
        TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
    ): DescribeTaskExecutionResponse = {
      val __obj = js.Dynamic.literal()
      BytesTransferred.foreach(__v => __obj.updateDynamic("BytesTransferred")(__v.asInstanceOf[js.Any]))
      BytesWritten.foreach(__v => __obj.updateDynamic("BytesWritten")(__v.asInstanceOf[js.Any]))
      EstimatedBytesToTransfer.foreach(__v => __obj.updateDynamic("EstimatedBytesToTransfer")(__v.asInstanceOf[js.Any]))
      EstimatedFilesToTransfer.foreach(__v => __obj.updateDynamic("EstimatedFilesToTransfer")(__v.asInstanceOf[js.Any]))
      Excludes.foreach(__v => __obj.updateDynamic("Excludes")(__v.asInstanceOf[js.Any]))
      FilesTransferred.foreach(__v => __obj.updateDynamic("FilesTransferred")(__v.asInstanceOf[js.Any]))
      Includes.foreach(__v => __obj.updateDynamic("Includes")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskExecutionArn.foreach(__v => __obj.updateDynamic("TaskExecutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTaskExecutionResponse]
    }
  }

  @js.native
  trait DescribeTaskRequest extends js.Object {
    var TaskArn: TaskArn
  }

  object DescribeTaskRequest {
    @inline
    def apply(
        TaskArn: TaskArn
    ): DescribeTaskRequest = {
      val __obj = js.Dynamic.literal(
        "TaskArn" -> TaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTaskRequest]
    }
  }

  @js.native
  trait DescribeTaskResponse extends js.Object {
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var CreationTime: js.UndefOr[Time]
    var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn]
    var DestinationLocationArn: js.UndefOr[LocationArn]
    var DestinationNetworkInterfaceArns: js.UndefOr[DestinationNetworkInterfaceArns]
    var ErrorCode: js.UndefOr[String]
    var ErrorDetail: js.UndefOr[String]
    var Excludes: js.UndefOr[FilterList]
    var Includes: js.UndefOr[FilterList]
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
    var Schedule: js.UndefOr[TaskSchedule]
    var SourceLocationArn: js.UndefOr[LocationArn]
    var SourceNetworkInterfaceArns: js.UndefOr[SourceNetworkInterfaceArns]
    var Status: js.UndefOr[TaskStatus]
    var TaskArn: js.UndefOr[TaskArn]
  }

  object DescribeTaskResponse {
    @inline
    def apply(
        CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined,
        CreationTime: js.UndefOr[Time] = js.undefined,
        CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined,
        DestinationLocationArn: js.UndefOr[LocationArn] = js.undefined,
        DestinationNetworkInterfaceArns: js.UndefOr[DestinationNetworkInterfaceArns] = js.undefined,
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorDetail: js.UndefOr[String] = js.undefined,
        Excludes: js.UndefOr[FilterList] = js.undefined,
        Includes: js.UndefOr[FilterList] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        Options: js.UndefOr[Options] = js.undefined,
        Schedule: js.UndefOr[TaskSchedule] = js.undefined,
        SourceLocationArn: js.UndefOr[LocationArn] = js.undefined,
        SourceNetworkInterfaceArns: js.UndefOr[SourceNetworkInterfaceArns] = js.undefined,
        Status: js.UndefOr[TaskStatus] = js.undefined,
        TaskArn: js.UndefOr[TaskArn] = js.undefined
    ): DescribeTaskResponse = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogGroupArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentTaskExecutionArn.foreach(__v => __obj.updateDynamic("CurrentTaskExecutionArn")(__v.asInstanceOf[js.Any]))
      DestinationLocationArn.foreach(__v => __obj.updateDynamic("DestinationLocationArn")(__v.asInstanceOf[js.Any]))
      DestinationNetworkInterfaceArns.foreach(__v => __obj.updateDynamic("DestinationNetworkInterfaceArns")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorDetail.foreach(__v => __obj.updateDynamic("ErrorDetail")(__v.asInstanceOf[js.Any]))
      Excludes.foreach(__v => __obj.updateDynamic("Excludes")(__v.asInstanceOf[js.Any]))
      Includes.foreach(__v => __obj.updateDynamic("Includes")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SourceLocationArn.foreach(__v => __obj.updateDynamic("SourceLocationArn")(__v.asInstanceOf[js.Any]))
      SourceNetworkInterfaceArns.foreach(__v => __obj.updateDynamic("SourceNetworkInterfaceArns")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTaskResponse]
    }
  }

  /** The subnet and the security group that DataSync uses to access target EFS file system. The subnet must have at least one mount target for that file system. The security group that you provide needs to be able to communicate with the security group on the mount target in the subnet specified.
    */
  @js.native
  trait Ec2Config extends js.Object {
    var SecurityGroupArns: Ec2SecurityGroupArnList
    var SubnetArn: Ec2SubnetArn
  }

  object Ec2Config {
    @inline
    def apply(
        SecurityGroupArns: Ec2SecurityGroupArnList,
        SubnetArn: Ec2SubnetArn
    ): Ec2Config = {
      val __obj = js.Dynamic.literal(
        "SecurityGroupArns" -> SecurityGroupArns.asInstanceOf[js.Any],
        "SubnetArn" -> SubnetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Ec2Config]
    }
  }

  /** Specifies which files, folders, and objects to include or exclude when transferring files from source to destination.
    */
  @js.native
  trait FilterRule extends js.Object {
    var FilterType: js.UndefOr[FilterType]
    var Value: js.UndefOr[FilterValue]
  }

  object FilterRule {
    @inline
    def apply(
        FilterType: js.UndefOr[FilterType] = js.undefined,
        Value: js.UndefOr[FilterValue] = js.undefined
    ): FilterRule = {
      val __obj = js.Dynamic.literal()
      FilterType.foreach(__v => __obj.updateDynamic("FilterType")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterRule]
    }
  }

  /** The NameNode of the Hadoop Distributed File System (HDFS). The NameNode manages the file system's namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes.
    */
  @js.native
  trait HdfsNameNode extends js.Object {
    var Hostname: HdfsServerHostname
    var Port: HdfsServerPort
  }

  object HdfsNameNode {
    @inline
    def apply(
        Hostname: HdfsServerHostname,
        Port: HdfsServerPort
    ): HdfsNameNode = {
      val __obj = js.Dynamic.literal(
        "Hostname" -> Hostname.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HdfsNameNode]
    }
  }

  @js.native
  trait ListAgentsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgentsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAgentsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAgentsRequest]
    }
  }

  @js.native
  trait ListAgentsResponse extends js.Object {
    var Agents: js.UndefOr[AgentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgentsResponse {
    @inline
    def apply(
        Agents: js.UndefOr[AgentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAgentsResponse = {
      val __obj = js.Dynamic.literal()
      Agents.foreach(__v => __obj.updateDynamic("Agents")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAgentsResponse]
    }
  }

  @js.native
  trait ListLocationsRequest extends js.Object {
    var Filters: js.UndefOr[LocationFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLocationsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[LocationFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLocationsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLocationsRequest]
    }
  }

  @js.native
  trait ListLocationsResponse extends js.Object {
    var Locations: js.UndefOr[LocationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLocationsResponse {
    @inline
    def apply(
        Locations: js.UndefOr[LocationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLocationsResponse = {
      val __obj = js.Dynamic.literal()
      Locations.foreach(__v => __obj.updateDynamic("Locations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLocationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: TaggableResourceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: TaggableResourceArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[OutputTagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[OutputTagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** ListTaskExecutions
    */
  @js.native
  trait ListTaskExecutionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TaskArn: js.UndefOr[TaskArn]
  }

  object ListTaskExecutionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TaskArn: js.UndefOr[TaskArn] = js.undefined
    ): ListTaskExecutionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTaskExecutionsRequest]
    }
  }

  @js.native
  trait ListTaskExecutionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TaskExecutions: js.UndefOr[TaskExecutionList]
  }

  object ListTaskExecutionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TaskExecutions: js.UndefOr[TaskExecutionList] = js.undefined
    ): ListTaskExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TaskExecutions.foreach(__v => __obj.updateDynamic("TaskExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTaskExecutionsResponse]
    }
  }

  @js.native
  trait ListTasksRequest extends js.Object {
    var Filters: js.UndefOr[TaskFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTasksRequest {
    @inline
    def apply(
        Filters: js.UndefOr[TaskFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTasksRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTasksRequest]
    }
  }

  @js.native
  trait ListTasksResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tasks: js.UndefOr[TaskList]
  }

  object ListTasksResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tasks: js.UndefOr[TaskList] = js.undefined
    ): ListTasksResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tasks.foreach(__v => __obj.updateDynamic("Tasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTasksResponse]
    }
  }

  /** You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For example, to retrieve all your Amazon S3 locations, you can use <code>ListLocations</code> with filter name <code>LocationType S3</code> and <code>Operator Equals</code>.
    */
  @js.native
  trait LocationFilter extends js.Object {
    var Name: LocationFilterName
    var Operator: Operator
    var Values: FilterValues
  }

  object LocationFilter {
    @inline
    def apply(
        Name: LocationFilterName,
        Operator: Operator,
        Values: FilterValues
    ): LocationFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LocationFilter]
    }
  }

  /** Represents a single entry in a list of locations. <code>LocationListEntry</code> returns an array that contains a list of locations when the [[https://docs.aws.amazon.com/datasync/latest/userguide/API_ListLocations.html|ListLocations]] operation is called.
    */
  @js.native
  trait LocationListEntry extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
  }

  object LocationListEntry {
    @inline
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined
    ): LocationListEntry = {
      val __obj = js.Dynamic.literal()
      LocationArn.foreach(__v => __obj.updateDynamic("LocationArn")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LocationListEntry]
    }
  }

  /** Represents the mount options that are available for DataSync to access an NFS location.
    */
  @js.native
  trait NfsMountOptions extends js.Object {
    var Version: js.UndefOr[NfsVersion]
  }

  object NfsMountOptions {
    @inline
    def apply(
        Version: js.UndefOr[NfsVersion] = js.undefined
    ): NfsMountOptions = {
      val __obj = js.Dynamic.literal()
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NfsMountOptions]
    }
  }

  /** A list of Amazon Resource Names (ARNs) of agents to use for a Network File System (NFS) location.
    */
  @js.native
  trait OnPremConfig extends js.Object {
    var AgentArns: AgentArnList
  }

  object OnPremConfig {
    @inline
    def apply(
        AgentArns: AgentArnList
    ): OnPremConfig = {
      val __obj = js.Dynamic.literal(
        "AgentArns" -> AgentArns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OnPremConfig]
    }
  }

  /** Represents the options that are available to control the behavior of a [[https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html|StartTaskExecution]] operation. Behavior includes preserving metadata such as user ID (UID), group ID (GID), and file permissions, and also overwriting files in the destination, data integrity verification, and so on. A task has a set of default options associated with it. If you don't specify an option in [[https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html|StartTaskExecution]], the default value is used. You can override the defaults options on each task execution by specifying an overriding <code>Options</code> value to [[https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html|StartTaskExecution]].
    */
  @js.native
  trait Options extends js.Object {
    var Atime: js.UndefOr[Atime]
    var BytesPerSecond: js.UndefOr[BytesPerSecond]
    var Gid: js.UndefOr[Gid]
    var LogLevel: js.UndefOr[LogLevel]
    var Mtime: js.UndefOr[Mtime]
    var OverwriteMode: js.UndefOr[OverwriteMode]
    var PosixPermissions: js.UndefOr[PosixPermissions]
    var PreserveDeletedFiles: js.UndefOr[PreserveDeletedFiles]
    var PreserveDevices: js.UndefOr[PreserveDevices]
    var SecurityDescriptorCopyFlags: js.UndefOr[SmbSecurityDescriptorCopyFlags]
    var TaskQueueing: js.UndefOr[TaskQueueing]
    var TransferMode: js.UndefOr[TransferMode]
    var Uid: js.UndefOr[Uid]
    var VerifyMode: js.UndefOr[VerifyMode]
  }

  object Options {
    @inline
    def apply(
        Atime: js.UndefOr[Atime] = js.undefined,
        BytesPerSecond: js.UndefOr[BytesPerSecond] = js.undefined,
        Gid: js.UndefOr[Gid] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Mtime: js.UndefOr[Mtime] = js.undefined,
        OverwriteMode: js.UndefOr[OverwriteMode] = js.undefined,
        PosixPermissions: js.UndefOr[PosixPermissions] = js.undefined,
        PreserveDeletedFiles: js.UndefOr[PreserveDeletedFiles] = js.undefined,
        PreserveDevices: js.UndefOr[PreserveDevices] = js.undefined,
        SecurityDescriptorCopyFlags: js.UndefOr[SmbSecurityDescriptorCopyFlags] = js.undefined,
        TaskQueueing: js.UndefOr[TaskQueueing] = js.undefined,
        TransferMode: js.UndefOr[TransferMode] = js.undefined,
        Uid: js.UndefOr[Uid] = js.undefined,
        VerifyMode: js.UndefOr[VerifyMode] = js.undefined
    ): Options = {
      val __obj = js.Dynamic.literal()
      Atime.foreach(__v => __obj.updateDynamic("Atime")(__v.asInstanceOf[js.Any]))
      BytesPerSecond.foreach(__v => __obj.updateDynamic("BytesPerSecond")(__v.asInstanceOf[js.Any]))
      Gid.foreach(__v => __obj.updateDynamic("Gid")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Mtime.foreach(__v => __obj.updateDynamic("Mtime")(__v.asInstanceOf[js.Any]))
      OverwriteMode.foreach(__v => __obj.updateDynamic("OverwriteMode")(__v.asInstanceOf[js.Any]))
      PosixPermissions.foreach(__v => __obj.updateDynamic("PosixPermissions")(__v.asInstanceOf[js.Any]))
      PreserveDeletedFiles.foreach(__v => __obj.updateDynamic("PreserveDeletedFiles")(__v.asInstanceOf[js.Any]))
      PreserveDevices.foreach(__v => __obj.updateDynamic("PreserveDevices")(__v.asInstanceOf[js.Any]))
      SecurityDescriptorCopyFlags.foreach(__v => __obj.updateDynamic("SecurityDescriptorCopyFlags")(__v.asInstanceOf[js.Any]))
      TaskQueueing.foreach(__v => __obj.updateDynamic("TaskQueueing")(__v.asInstanceOf[js.Any]))
      TransferMode.foreach(__v => __obj.updateDynamic("TransferMode")(__v.asInstanceOf[js.Any]))
      Uid.foreach(__v => __obj.updateDynamic("Uid")(__v.asInstanceOf[js.Any]))
      VerifyMode.foreach(__v => __obj.updateDynamic("VerifyMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Options]
    }
  }

  /** The VPC endpoint, subnet, and security group that an agent uses to access IP addresses in a VPC (Virtual Private Cloud).
    */
  @js.native
  trait PrivateLinkConfig extends js.Object {
    var PrivateLinkEndpoint: js.UndefOr[Endpoint]
    var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList]
    var SubnetArns: js.UndefOr[PLSubnetArnList]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
  }

  object PrivateLinkConfig {
    @inline
    def apply(
        PrivateLinkEndpoint: js.UndefOr[Endpoint] = js.undefined,
        SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.undefined,
        SubnetArns: js.UndefOr[PLSubnetArnList] = js.undefined,
        VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined
    ): PrivateLinkConfig = {
      val __obj = js.Dynamic.literal()
      PrivateLinkEndpoint.foreach(__v => __obj.updateDynamic("PrivateLinkEndpoint")(__v.asInstanceOf[js.Any]))
      SecurityGroupArns.foreach(__v => __obj.updateDynamic("SecurityGroupArns")(__v.asInstanceOf[js.Any]))
      SubnetArns.foreach(__v => __obj.updateDynamic("SubnetArns")(__v.asInstanceOf[js.Any]))
      VpcEndpointId.foreach(__v => __obj.updateDynamic("VpcEndpointId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrivateLinkConfig]
    }
  }

  /** The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer privacy settings configured on the Hadoop Distributed File System (HDFS) cluster.
    */
  @js.native
  trait QopConfiguration extends js.Object {
    var DataTransferProtection: js.UndefOr[HdfsDataTransferProtection]
    var RpcProtection: js.UndefOr[HdfsRpcProtection]
  }

  object QopConfiguration {
    @inline
    def apply(
        DataTransferProtection: js.UndefOr[HdfsDataTransferProtection] = js.undefined,
        RpcProtection: js.UndefOr[HdfsRpcProtection] = js.undefined
    ): QopConfiguration = {
      val __obj = js.Dynamic.literal()
      DataTransferProtection.foreach(__v => __obj.updateDynamic("DataTransferProtection")(__v.asInstanceOf[js.Any]))
      RpcProtection.foreach(__v => __obj.updateDynamic("RpcProtection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QopConfiguration]
    }
  }

  /** The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that is used to access an Amazon S3 bucket. For detailed information about using such a role, see Creating a Location for Amazon S3 in the <i>DataSync User Guide</i>.
    */
  @js.native
  trait S3Config extends js.Object {
    var BucketAccessRoleArn: IamRoleArn
  }

  object S3Config {
    @inline
    def apply(
        BucketAccessRoleArn: IamRoleArn
    ): S3Config = {
      val __obj = js.Dynamic.literal(
        "BucketAccessRoleArn" -> BucketAccessRoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Config]
    }
  }

  /** Represents the mount options that are available for DataSync to access an SMB location.
    */
  @js.native
  trait SmbMountOptions extends js.Object {
    var Version: js.UndefOr[SmbVersion]
  }

  object SmbMountOptions {
    @inline
    def apply(
        Version: js.UndefOr[SmbVersion] = js.undefined
    ): SmbMountOptions = {
      val __obj = js.Dynamic.literal()
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SmbMountOptions]
    }
  }

  @js.native
  trait StartTaskExecutionRequest extends js.Object {
    var TaskArn: TaskArn
    var Excludes: js.UndefOr[FilterList]
    var Includes: js.UndefOr[FilterList]
    var OverrideOptions: js.UndefOr[Options]
  }

  object StartTaskExecutionRequest {
    @inline
    def apply(
        TaskArn: TaskArn,
        Excludes: js.UndefOr[FilterList] = js.undefined,
        Includes: js.UndefOr[FilterList] = js.undefined,
        OverrideOptions: js.UndefOr[Options] = js.undefined
    ): StartTaskExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "TaskArn" -> TaskArn.asInstanceOf[js.Any]
      )

      Excludes.foreach(__v => __obj.updateDynamic("Excludes")(__v.asInstanceOf[js.Any]))
      Includes.foreach(__v => __obj.updateDynamic("Includes")(__v.asInstanceOf[js.Any]))
      OverrideOptions.foreach(__v => __obj.updateDynamic("OverrideOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTaskExecutionRequest]
    }
  }

  @js.native
  trait StartTaskExecutionResponse extends js.Object {
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object StartTaskExecutionResponse {
    @inline
    def apply(
        TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
    ): StartTaskExecutionResponse = {
      val __obj = js.Dynamic.literal()
      TaskExecutionArn.foreach(__v => __obj.updateDynamic("TaskExecutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTaskExecutionResponse]
    }
  }

  /** Represents a single entry in a list of Amazon Web Services resource tags. <code>TagListEntry</code> returns an array that contains a list of tasks when the [[https://docs.aws.amazon.com/datasync/latest/userguide/API_ListTagsForResource.html|ListTagsForResource]] operation is called.
    */
  @js.native
  trait TagListEntry extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object TagListEntry {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): TagListEntry = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagListEntry]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: TaggableResourceArn
    var Tags: InputTagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: TaggableResourceArn,
        Tags: InputTagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Represents a single entry in a list of task executions. <code>TaskExecutionListEntry</code> returns an array that contains a list of specific invocations of a task when the [[https://docs.aws.amazon.com/datasync/latest/userguide/API_ListTaskExecutions.html|ListTaskExecutions]] operation is called.
    */
  @js.native
  trait TaskExecutionListEntry extends js.Object {
    var Status: js.UndefOr[TaskExecutionStatus]
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object TaskExecutionListEntry {
    @inline
    def apply(
        Status: js.UndefOr[TaskExecutionStatus] = js.undefined,
        TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
    ): TaskExecutionListEntry = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskExecutionArn.foreach(__v => __obj.updateDynamic("TaskExecutionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskExecutionListEntry]
    }
  }

  /** Describes the detailed result of a <code>TaskExecution</code> operation. This result includes the time in milliseconds spent in each phase, the status of the task execution, and the errors encountered.
    */
  @js.native
  trait TaskExecutionResultDetail extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorDetail: js.UndefOr[String]
    var PrepareDuration: js.UndefOr[Duration]
    var PrepareStatus: js.UndefOr[PhaseStatus]
    var TotalDuration: js.UndefOr[Duration]
    var TransferDuration: js.UndefOr[Duration]
    var TransferStatus: js.UndefOr[PhaseStatus]
    var VerifyDuration: js.UndefOr[Duration]
    var VerifyStatus: js.UndefOr[PhaseStatus]
  }

  object TaskExecutionResultDetail {
    @inline
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorDetail: js.UndefOr[String] = js.undefined,
        PrepareDuration: js.UndefOr[Duration] = js.undefined,
        PrepareStatus: js.UndefOr[PhaseStatus] = js.undefined,
        TotalDuration: js.UndefOr[Duration] = js.undefined,
        TransferDuration: js.UndefOr[Duration] = js.undefined,
        TransferStatus: js.UndefOr[PhaseStatus] = js.undefined,
        VerifyDuration: js.UndefOr[Duration] = js.undefined,
        VerifyStatus: js.UndefOr[PhaseStatus] = js.undefined
    ): TaskExecutionResultDetail = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorDetail.foreach(__v => __obj.updateDynamic("ErrorDetail")(__v.asInstanceOf[js.Any]))
      PrepareDuration.foreach(__v => __obj.updateDynamic("PrepareDuration")(__v.asInstanceOf[js.Any]))
      PrepareStatus.foreach(__v => __obj.updateDynamic("PrepareStatus")(__v.asInstanceOf[js.Any]))
      TotalDuration.foreach(__v => __obj.updateDynamic("TotalDuration")(__v.asInstanceOf[js.Any]))
      TransferDuration.foreach(__v => __obj.updateDynamic("TransferDuration")(__v.asInstanceOf[js.Any]))
      TransferStatus.foreach(__v => __obj.updateDynamic("TransferStatus")(__v.asInstanceOf[js.Any]))
      VerifyDuration.foreach(__v => __obj.updateDynamic("VerifyDuration")(__v.asInstanceOf[js.Any]))
      VerifyStatus.foreach(__v => __obj.updateDynamic("VerifyStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskExecutionResultDetail]
    }
  }

  /** You can use API filters to narrow down the list of resources returned by <code>ListTasks</code>. For example, to retrieve all tasks on a source location, you can use <code>ListTasks</code> with filter name <code>LocationId</code> and <code>Operator Equals</code> with the ARN for the location.
    */
  @js.native
  trait TaskFilter extends js.Object {
    var Name: TaskFilterName
    var Operator: Operator
    var Values: FilterValues
  }

  object TaskFilter {
    @inline
    def apply(
        Name: TaskFilterName,
        Operator: Operator,
        Values: FilterValues
    ): TaskFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TaskFilter]
    }
  }

  /** Represents a single entry in a list of tasks. <code>TaskListEntry</code> returns an array that contains a list of tasks when the [[https://docs.aws.amazon.com/datasync/latest/userguide/API_ListTasks.html|ListTasks]] operation is called. A task includes the source and destination file systems to sync and the options to use for the tasks.
    */
  @js.native
  trait TaskListEntry extends js.Object {
    var Name: js.UndefOr[TagValue]
    var Status: js.UndefOr[TaskStatus]
    var TaskArn: js.UndefOr[TaskArn]
  }

  object TaskListEntry {
    @inline
    def apply(
        Name: js.UndefOr[TagValue] = js.undefined,
        Status: js.UndefOr[TaskStatus] = js.undefined,
        TaskArn: js.UndefOr[TaskArn] = js.undefined
    ): TaskListEntry = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskArn.foreach(__v => __obj.updateDynamic("TaskArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskListEntry]
    }
  }

  /** Specifies the schedule you want your task to use for repeated executions. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html|Schedule Expressions for Rules]].
    */
  @js.native
  trait TaskSchedule extends js.Object {
    var ScheduleExpression: ScheduleExpressionCron
  }

  object TaskSchedule {
    @inline
    def apply(
        ScheduleExpression: ScheduleExpressionCron
    ): TaskSchedule = {
      val __obj = js.Dynamic.literal(
        "ScheduleExpression" -> ScheduleExpression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TaskSchedule]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Keys: TagKeyList
    var ResourceArn: TaggableResourceArn
  }

  object UntagResourceRequest {
    @inline
    def apply(
        Keys: TagKeyList,
        ResourceArn: TaggableResourceArn
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Keys" -> Keys.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAgentRequest extends js.Object {
    var AgentArn: AgentArn
    var Name: js.UndefOr[TagValue]
  }

  object UpdateAgentRequest {
    @inline
    def apply(
        AgentArn: AgentArn,
        Name: js.UndefOr[TagValue] = js.undefined
    ): UpdateAgentRequest = {
      val __obj = js.Dynamic.literal(
        "AgentArn" -> AgentArn.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAgentRequest]
    }
  }

  @js.native
  trait UpdateAgentResponse extends js.Object

  object UpdateAgentResponse {
    @inline
    def apply(): UpdateAgentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAgentResponse]
    }
  }

  @js.native
  trait UpdateLocationHdfsRequest extends js.Object {
    var LocationArn: LocationArn
    var AgentArns: js.UndefOr[AgentArnList]
    var AuthenticationType: js.UndefOr[HdfsAuthenticationType]
    var BlockSize: js.UndefOr[HdfsBlockSize]
    var KerberosKeytab: js.UndefOr[KerberosKeytabFile]
    var KerberosKrb5Conf: js.UndefOr[KerberosKrb5ConfFile]
    var KerberosPrincipal: js.UndefOr[KerberosPrincipal]
    var KmsKeyProviderUri: js.UndefOr[KmsKeyProviderUri]
    var NameNodes: js.UndefOr[HdfsNameNodeList]
    var QopConfiguration: js.UndefOr[QopConfiguration]
    var ReplicationFactor: js.UndefOr[HdfsReplicationFactor]
    var SimpleUser: js.UndefOr[HdfsUser]
    var Subdirectory: js.UndefOr[HdfsSubdirectory]
  }

  object UpdateLocationHdfsRequest {
    @inline
    def apply(
        LocationArn: LocationArn,
        AgentArns: js.UndefOr[AgentArnList] = js.undefined,
        AuthenticationType: js.UndefOr[HdfsAuthenticationType] = js.undefined,
        BlockSize: js.UndefOr[HdfsBlockSize] = js.undefined,
        KerberosKeytab: js.UndefOr[KerberosKeytabFile] = js.undefined,
        KerberosKrb5Conf: js.UndefOr[KerberosKrb5ConfFile] = js.undefined,
        KerberosPrincipal: js.UndefOr[KerberosPrincipal] = js.undefined,
        KmsKeyProviderUri: js.UndefOr[KmsKeyProviderUri] = js.undefined,
        NameNodes: js.UndefOr[HdfsNameNodeList] = js.undefined,
        QopConfiguration: js.UndefOr[QopConfiguration] = js.undefined,
        ReplicationFactor: js.UndefOr[HdfsReplicationFactor] = js.undefined,
        SimpleUser: js.UndefOr[HdfsUser] = js.undefined,
        Subdirectory: js.UndefOr[HdfsSubdirectory] = js.undefined
    ): UpdateLocationHdfsRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )

      AgentArns.foreach(__v => __obj.updateDynamic("AgentArns")(__v.asInstanceOf[js.Any]))
      AuthenticationType.foreach(__v => __obj.updateDynamic("AuthenticationType")(__v.asInstanceOf[js.Any]))
      BlockSize.foreach(__v => __obj.updateDynamic("BlockSize")(__v.asInstanceOf[js.Any]))
      KerberosKeytab.foreach(__v => __obj.updateDynamic("KerberosKeytab")(__v.asInstanceOf[js.Any]))
      KerberosKrb5Conf.foreach(__v => __obj.updateDynamic("KerberosKrb5Conf")(__v.asInstanceOf[js.Any]))
      KerberosPrincipal.foreach(__v => __obj.updateDynamic("KerberosPrincipal")(__v.asInstanceOf[js.Any]))
      KmsKeyProviderUri.foreach(__v => __obj.updateDynamic("KmsKeyProviderUri")(__v.asInstanceOf[js.Any]))
      NameNodes.foreach(__v => __obj.updateDynamic("NameNodes")(__v.asInstanceOf[js.Any]))
      QopConfiguration.foreach(__v => __obj.updateDynamic("QopConfiguration")(__v.asInstanceOf[js.Any]))
      ReplicationFactor.foreach(__v => __obj.updateDynamic("ReplicationFactor")(__v.asInstanceOf[js.Any]))
      SimpleUser.foreach(__v => __obj.updateDynamic("SimpleUser")(__v.asInstanceOf[js.Any]))
      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLocationHdfsRequest]
    }
  }

  @js.native
  trait UpdateLocationHdfsResponse extends js.Object

  object UpdateLocationHdfsResponse {
    @inline
    def apply(): UpdateLocationHdfsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLocationHdfsResponse]
    }
  }

  @js.native
  trait UpdateLocationNfsRequest extends js.Object {
    var LocationArn: LocationArn
    var MountOptions: js.UndefOr[NfsMountOptions]
    var OnPremConfig: js.UndefOr[OnPremConfig]
    var Subdirectory: js.UndefOr[NfsSubdirectory]
  }

  object UpdateLocationNfsRequest {
    @inline
    def apply(
        LocationArn: LocationArn,
        MountOptions: js.UndefOr[NfsMountOptions] = js.undefined,
        OnPremConfig: js.UndefOr[OnPremConfig] = js.undefined,
        Subdirectory: js.UndefOr[NfsSubdirectory] = js.undefined
    ): UpdateLocationNfsRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )

      MountOptions.foreach(__v => __obj.updateDynamic("MountOptions")(__v.asInstanceOf[js.Any]))
      OnPremConfig.foreach(__v => __obj.updateDynamic("OnPremConfig")(__v.asInstanceOf[js.Any]))
      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLocationNfsRequest]
    }
  }

  @js.native
  trait UpdateLocationNfsResponse extends js.Object

  object UpdateLocationNfsResponse {
    @inline
    def apply(): UpdateLocationNfsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLocationNfsResponse]
    }
  }

  @js.native
  trait UpdateLocationObjectStorageRequest extends js.Object {
    var LocationArn: LocationArn
    var AccessKey: js.UndefOr[ObjectStorageAccessKey]
    var AgentArns: js.UndefOr[AgentArnList]
    var SecretKey: js.UndefOr[ObjectStorageSecretKey]
    var ServerPort: js.UndefOr[ObjectStorageServerPort]
    var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol]
    var Subdirectory: js.UndefOr[S3Subdirectory]
  }

  object UpdateLocationObjectStorageRequest {
    @inline
    def apply(
        LocationArn: LocationArn,
        AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.undefined,
        AgentArns: js.UndefOr[AgentArnList] = js.undefined,
        SecretKey: js.UndefOr[ObjectStorageSecretKey] = js.undefined,
        ServerPort: js.UndefOr[ObjectStorageServerPort] = js.undefined,
        ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.undefined,
        Subdirectory: js.UndefOr[S3Subdirectory] = js.undefined
    ): UpdateLocationObjectStorageRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )

      AccessKey.foreach(__v => __obj.updateDynamic("AccessKey")(__v.asInstanceOf[js.Any]))
      AgentArns.foreach(__v => __obj.updateDynamic("AgentArns")(__v.asInstanceOf[js.Any]))
      SecretKey.foreach(__v => __obj.updateDynamic("SecretKey")(__v.asInstanceOf[js.Any]))
      ServerPort.foreach(__v => __obj.updateDynamic("ServerPort")(__v.asInstanceOf[js.Any]))
      ServerProtocol.foreach(__v => __obj.updateDynamic("ServerProtocol")(__v.asInstanceOf[js.Any]))
      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLocationObjectStorageRequest]
    }
  }

  @js.native
  trait UpdateLocationObjectStorageResponse extends js.Object

  object UpdateLocationObjectStorageResponse {
    @inline
    def apply(): UpdateLocationObjectStorageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLocationObjectStorageResponse]
    }
  }

  @js.native
  trait UpdateLocationSmbRequest extends js.Object {
    var LocationArn: LocationArn
    var AgentArns: js.UndefOr[AgentArnList]
    var Domain: js.UndefOr[SmbDomain]
    var MountOptions: js.UndefOr[SmbMountOptions]
    var Password: js.UndefOr[SmbPassword]
    var Subdirectory: js.UndefOr[SmbSubdirectory]
    var User: js.UndefOr[SmbUser]
  }

  object UpdateLocationSmbRequest {
    @inline
    def apply(
        LocationArn: LocationArn,
        AgentArns: js.UndefOr[AgentArnList] = js.undefined,
        Domain: js.UndefOr[SmbDomain] = js.undefined,
        MountOptions: js.UndefOr[SmbMountOptions] = js.undefined,
        Password: js.UndefOr[SmbPassword] = js.undefined,
        Subdirectory: js.UndefOr[SmbSubdirectory] = js.undefined,
        User: js.UndefOr[SmbUser] = js.undefined
    ): UpdateLocationSmbRequest = {
      val __obj = js.Dynamic.literal(
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      )

      AgentArns.foreach(__v => __obj.updateDynamic("AgentArns")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      MountOptions.foreach(__v => __obj.updateDynamic("MountOptions")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Subdirectory.foreach(__v => __obj.updateDynamic("Subdirectory")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLocationSmbRequest]
    }
  }

  @js.native
  trait UpdateLocationSmbResponse extends js.Object

  object UpdateLocationSmbResponse {
    @inline
    def apply(): UpdateLocationSmbResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLocationSmbResponse]
    }
  }

  @js.native
  trait UpdateTaskExecutionRequest extends js.Object {
    var Options: Options
    var TaskExecutionArn: TaskExecutionArn
  }

  object UpdateTaskExecutionRequest {
    @inline
    def apply(
        Options: Options,
        TaskExecutionArn: TaskExecutionArn
    ): UpdateTaskExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "TaskExecutionArn" -> TaskExecutionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTaskExecutionRequest]
    }
  }

  @js.native
  trait UpdateTaskExecutionResponse extends js.Object

  object UpdateTaskExecutionResponse {
    @inline
    def apply(): UpdateTaskExecutionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTaskExecutionResponse]
    }
  }

  /** UpdateTaskResponse
    */
  @js.native
  trait UpdateTaskRequest extends js.Object {
    var TaskArn: TaskArn
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var Excludes: js.UndefOr[FilterList]
    var Includes: js.UndefOr[FilterList]
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
    var Schedule: js.UndefOr[TaskSchedule]
  }

  object UpdateTaskRequest {
    @inline
    def apply(
        TaskArn: TaskArn,
        CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined,
        Excludes: js.UndefOr[FilterList] = js.undefined,
        Includes: js.UndefOr[FilterList] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        Options: js.UndefOr[Options] = js.undefined,
        Schedule: js.UndefOr[TaskSchedule] = js.undefined
    ): UpdateTaskRequest = {
      val __obj = js.Dynamic.literal(
        "TaskArn" -> TaskArn.asInstanceOf[js.Any]
      )

      CloudWatchLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogGroupArn")(__v.asInstanceOf[js.Any]))
      Excludes.foreach(__v => __obj.updateDynamic("Excludes")(__v.asInstanceOf[js.Any]))
      Includes.foreach(__v => __obj.updateDynamic("Includes")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTaskRequest]
    }
  }

  @js.native
  trait UpdateTaskResponse extends js.Object

  object UpdateTaskResponse {
    @inline
    def apply(): UpdateTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTaskResponse]
    }
  }
}
