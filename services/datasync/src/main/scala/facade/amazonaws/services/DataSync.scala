package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object datasync {
  type ActivationKey                   = String
  type AgentArn                        = String
  type AgentArnList                    = js.Array[AgentArn]
  type AgentList                       = js.Array[AgentListEntry]
  type BytesPerSecond                  = Double
  type DestinationNetworkInterfaceArns = js.Array[NetworkInterfaceArn]
  type Duration                        = Double
  type Ec2SecurityGroupArn             = String
  type Ec2SecurityGroupArnList         = js.Array[Ec2SecurityGroupArn]
  type Ec2SubnetArn                    = String
  type EfsFilesystemArn                = String
  type EfsSubdirectory                 = String
  type Endpoint                        = String
  type FilterList                      = js.Array[FilterRule]
  type FilterValue                     = String
  type FsxFilesystemArn                = String
  type FsxWindowsSubdirectory          = String
  type IamRoleArn                      = String
  type LocationArn                     = String
  type LocationList                    = js.Array[LocationListEntry]
  type LocationUri                     = String
  type LogGroupArn                     = String
  type MaxResults                      = Int
  type NetworkInterfaceArn             = String
  type NextToken                       = String
  type NfsSubdirectory                 = String
  type PLSecurityGroupArnList          = js.Array[Ec2SecurityGroupArn]
  type PLSubnetArnList                 = js.Array[Ec2SubnetArn]
  type S3BucketArn                     = String
  type S3Subdirectory                  = String
  type ScheduleExpressionCron          = String
  type ServerHostname                  = String
  type SmbDomain                       = String
  type SmbPassword                     = String
  type SmbSubdirectory                 = String
  type SmbUser                         = String
  type SourceNetworkInterfaceArns      = js.Array[NetworkInterfaceArn]
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagList                         = js.Array[TagListEntry]
  type TagValue                        = String
  type TaggableResourceArn             = String
  type TaskArn                         = String
  type TaskExecutionArn                = String
  type TaskExecutionList               = js.Array[TaskExecutionListEntry]
  type TaskList                        = js.Array[TaskListEntry]
  type Time                            = js.Date
  type VpcEndpointId                   = String

  implicit final class DataSyncOps(private val service: DataSync) extends AnyVal {

    @inline def cancelTaskExecutionFuture(params: CancelTaskExecutionRequest): Future[CancelTaskExecutionResponse] =
      service.cancelTaskExecution(params).promise().toFuture
    @inline def createAgentFuture(params: CreateAgentRequest): Future[CreateAgentResponse] =
      service.createAgent(params).promise().toFuture
    @inline def createLocationEfsFuture(params: CreateLocationEfsRequest): Future[CreateLocationEfsResponse] =
      service.createLocationEfs(params).promise().toFuture
    @inline def createLocationFsxWindowsFuture(
        params: CreateLocationFsxWindowsRequest
    ): Future[CreateLocationFsxWindowsResponse] = service.createLocationFsxWindows(params).promise().toFuture
    @inline def createLocationNfsFuture(params: CreateLocationNfsRequest): Future[CreateLocationNfsResponse] =
      service.createLocationNfs(params).promise().toFuture
    @inline def createLocationS3Future(params: CreateLocationS3Request): Future[CreateLocationS3Response] =
      service.createLocationS3(params).promise().toFuture
    @inline def createLocationSmbFuture(params: CreateLocationSmbRequest): Future[CreateLocationSmbResponse] =
      service.createLocationSmb(params).promise().toFuture
    @inline def createTaskFuture(params: CreateTaskRequest): Future[CreateTaskResponse] =
      service.createTask(params).promise().toFuture
    @inline def deleteAgentFuture(params: DeleteAgentRequest): Future[DeleteAgentResponse] =
      service.deleteAgent(params).promise().toFuture
    @inline def deleteLocationFuture(params: DeleteLocationRequest): Future[DeleteLocationResponse] =
      service.deleteLocation(params).promise().toFuture
    @inline def deleteTaskFuture(params: DeleteTaskRequest): Future[DeleteTaskResponse] =
      service.deleteTask(params).promise().toFuture
    @inline def describeAgentFuture(params: DescribeAgentRequest): Future[DescribeAgentResponse] =
      service.describeAgent(params).promise().toFuture
    @inline def describeLocationEfsFuture(params: DescribeLocationEfsRequest): Future[DescribeLocationEfsResponse] =
      service.describeLocationEfs(params).promise().toFuture
    @inline def describeLocationFsxWindowsFuture(
        params: DescribeLocationFsxWindowsRequest
    ): Future[DescribeLocationFsxWindowsResponse] = service.describeLocationFsxWindows(params).promise().toFuture
    @inline def describeLocationNfsFuture(params: DescribeLocationNfsRequest): Future[DescribeLocationNfsResponse] =
      service.describeLocationNfs(params).promise().toFuture
    @inline def describeLocationS3Future(params: DescribeLocationS3Request): Future[DescribeLocationS3Response] =
      service.describeLocationS3(params).promise().toFuture
    @inline def describeLocationSmbFuture(params: DescribeLocationSmbRequest): Future[DescribeLocationSmbResponse] =
      service.describeLocationSmb(params).promise().toFuture
    @inline def describeTaskExecutionFuture(
        params: DescribeTaskExecutionRequest
    ): Future[DescribeTaskExecutionResponse] = service.describeTaskExecution(params).promise().toFuture
    @inline def describeTaskFuture(params: DescribeTaskRequest): Future[DescribeTaskResponse] =
      service.describeTask(params).promise().toFuture
    @inline def listAgentsFuture(params: ListAgentsRequest): Future[ListAgentsResponse] =
      service.listAgents(params).promise().toFuture
    @inline def listLocationsFuture(params: ListLocationsRequest): Future[ListLocationsResponse] =
      service.listLocations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTaskExecutionsFuture(params: ListTaskExecutionsRequest): Future[ListTaskExecutionsResponse] =
      service.listTaskExecutions(params).promise().toFuture
    @inline def listTasksFuture(params: ListTasksRequest): Future[ListTasksResponse] =
      service.listTasks(params).promise().toFuture
    @inline def startTaskExecutionFuture(params: StartTaskExecutionRequest): Future[StartTaskExecutionResponse] =
      service.startTaskExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateAgentFuture(params: UpdateAgentRequest): Future[UpdateAgentResponse] =
      service.updateAgent(params).promise().toFuture
    @inline def updateTaskFuture(params: UpdateTaskRequest): Future[UpdateTaskResponse] =
      service.updateTask(params).promise().toFuture
  }
}

package datasync {
  @js.native
  @JSImport("aws-sdk", "DataSync")
  class DataSync() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelTaskExecution(params: CancelTaskExecutionRequest): Request[CancelTaskExecutionResponse] = js.native
    def createAgent(params: CreateAgentRequest): Request[CreateAgentResponse]                         = js.native
    def createLocationEfs(params: CreateLocationEfsRequest): Request[CreateLocationEfsResponse]       = js.native
    def createLocationFsxWindows(params: CreateLocationFsxWindowsRequest): Request[CreateLocationFsxWindowsResponse] =
      js.native
    def createLocationNfs(params: CreateLocationNfsRequest): Request[CreateLocationNfsResponse]       = js.native
    def createLocationS3(params: CreateLocationS3Request): Request[CreateLocationS3Response]          = js.native
    def createLocationSmb(params: CreateLocationSmbRequest): Request[CreateLocationSmbResponse]       = js.native
    def createTask(params: CreateTaskRequest): Request[CreateTaskResponse]                            = js.native
    def deleteAgent(params: DeleteAgentRequest): Request[DeleteAgentResponse]                         = js.native
    def deleteLocation(params: DeleteLocationRequest): Request[DeleteLocationResponse]                = js.native
    def deleteTask(params: DeleteTaskRequest): Request[DeleteTaskResponse]                            = js.native
    def describeAgent(params: DescribeAgentRequest): Request[DescribeAgentResponse]                   = js.native
    def describeLocationEfs(params: DescribeLocationEfsRequest): Request[DescribeLocationEfsResponse] = js.native
    def describeLocationFsxWindows(
        params: DescribeLocationFsxWindowsRequest
    ): Request[DescribeLocationFsxWindowsResponse]                                                          = js.native
    def describeLocationNfs(params: DescribeLocationNfsRequest): Request[DescribeLocationNfsResponse]       = js.native
    def describeLocationS3(params: DescribeLocationS3Request): Request[DescribeLocationS3Response]          = js.native
    def describeLocationSmb(params: DescribeLocationSmbRequest): Request[DescribeLocationSmbResponse]       = js.native
    def describeTask(params: DescribeTaskRequest): Request[DescribeTaskResponse]                            = js.native
    def describeTaskExecution(params: DescribeTaskExecutionRequest): Request[DescribeTaskExecutionResponse] = js.native
    def listAgents(params: ListAgentsRequest): Request[ListAgentsResponse]                                  = js.native
    def listLocations(params: ListLocationsRequest): Request[ListLocationsResponse]                         = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listTaskExecutions(params: ListTaskExecutionsRequest): Request[ListTaskExecutionsResponse]          = js.native
    def listTasks(params: ListTasksRequest): Request[ListTasksResponse]                                     = js.native
    def startTaskExecution(params: StartTaskExecutionRequest): Request[StartTaskExecutionResponse]          = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateAgent(params: UpdateAgentRequest): Request[UpdateAgentResponse]                               = js.native
    def updateTask(params: UpdateTaskRequest): Request[UpdateTaskResponse]                                  = js.native
  }

  /**
    * Represents a single entry in a list of agents. <code>AgentListEntry</code> returns an array that contains a list of agents when the <a>ListAgents</a> operation is called.
    */
  @js.native
  @Factory
  trait AgentListEntry extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var Name: js.UndefOr[TagValue]
    var Status: js.UndefOr[AgentStatus]
  }

  @js.native
  sealed trait AgentStatus extends js.Any
  object AgentStatus extends js.Object {
    val ONLINE  = "ONLINE".asInstanceOf[AgentStatus]
    val OFFLINE = "OFFLINE".asInstanceOf[AgentStatus]

    val values = js.Object.freeze(js.Array(ONLINE, OFFLINE))
  }

  @js.native
  sealed trait Atime extends js.Any
  object Atime extends js.Object {
    val NONE        = "NONE".asInstanceOf[Atime]
    val BEST_EFFORT = "BEST_EFFORT".asInstanceOf[Atime]

    val values = js.Object.freeze(js.Array(NONE, BEST_EFFORT))
  }

  @js.native
  @Factory
  trait CancelTaskExecutionRequest extends js.Object {
    var TaskExecutionArn: TaskExecutionArn
  }

  @js.native
  @Factory
  trait CancelTaskExecutionResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateAgentRequest extends js.Object {
    var ActivationKey: ActivationKey
    var AgentName: js.UndefOr[TagValue]
    var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList]
    var SubnetArns: js.UndefOr[PLSubnetArnList]
    var Tags: js.UndefOr[TagList]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
  }

  @js.native
  @Factory
  trait CreateAgentResponse extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
  }

  @js.native
  @Factory
  trait CreateLocationEfsRequest extends js.Object {
    var Ec2Config: Ec2Config
    var EfsFilesystemArn: EfsFilesystemArn
    var Subdirectory: js.UndefOr[EfsSubdirectory]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * CreateLocationEfs
    */
  @js.native
  @Factory
  trait CreateLocationEfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  @js.native
  @Factory
  trait CreateLocationFsxWindowsRequest extends js.Object {
    var FsxFilesystemArn: FsxFilesystemArn
    var Password: SmbPassword
    var SecurityGroupArns: Ec2SecurityGroupArnList
    var User: SmbUser
    var Domain: js.UndefOr[SmbDomain]
    var Subdirectory: js.UndefOr[FsxWindowsSubdirectory]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateLocationFsxWindowsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  @js.native
  @Factory
  trait CreateLocationNfsRequest extends js.Object {
    var OnPremConfig: OnPremConfig
    var ServerHostname: ServerHostname
    var Subdirectory: NfsSubdirectory
    var MountOptions: js.UndefOr[NfsMountOptions]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateLocationNfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  @js.native
  @Factory
  trait CreateLocationS3Request extends js.Object {
    var S3BucketArn: S3BucketArn
    var S3Config: S3Config
    var S3StorageClass: js.UndefOr[S3StorageClass]
    var Subdirectory: js.UndefOr[S3Subdirectory]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateLocationS3Response extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  @js.native
  @Factory
  trait CreateLocationSmbRequest extends js.Object {
    var AgentArns: AgentArnList
    var Password: SmbPassword
    var ServerHostname: ServerHostname
    var Subdirectory: SmbSubdirectory
    var User: SmbUser
    var Domain: js.UndefOr[SmbDomain]
    var MountOptions: js.UndefOr[SmbMountOptions]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateLocationSmbResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  @js.native
  @Factory
  trait CreateTaskRequest extends js.Object {
    var DestinationLocationArn: LocationArn
    var SourceLocationArn: LocationArn
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var Excludes: js.UndefOr[FilterList]
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
    var Schedule: js.UndefOr[TaskSchedule]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateTaskResponse extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
  }

  @js.native
  @Factory
  trait DeleteAgentRequest extends js.Object {
    var AgentArn: AgentArn
  }

  @js.native
  @Factory
  trait DeleteAgentResponse extends js.Object {}

  /**
    * DeleteLocation
    */
  @js.native
  @Factory
  trait DeleteLocationRequest extends js.Object {
    var LocationArn: LocationArn
  }

  @js.native
  @Factory
  trait DeleteLocationResponse extends js.Object {}

  /**
    * DeleteTask
    */
  @js.native
  @Factory
  trait DeleteTaskRequest extends js.Object {
    var TaskArn: TaskArn
  }

  @js.native
  @Factory
  trait DeleteTaskResponse extends js.Object {}

  /**
    * DescribeAgent
    */
  @js.native
  @Factory
  trait DescribeAgentRequest extends js.Object {
    var AgentArn: AgentArn
  }

  @js.native
  @Factory
  trait DescribeAgentResponse extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var CreationTime: js.UndefOr[Time]
    var EndpointType: js.UndefOr[EndpointType]
    var LastConnectionTime: js.UndefOr[Time]
    var Name: js.UndefOr[TagValue]
    var PrivateLinkConfig: js.UndefOr[PrivateLinkConfig]
    var Status: js.UndefOr[AgentStatus]
  }

  @js.native
  @Factory
  trait DescribeLocationEfsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  @js.native
  @Factory
  trait DescribeLocationEfsResponse extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var Ec2Config: js.UndefOr[Ec2Config]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
  }

  @js.native
  @Factory
  trait DescribeLocationFsxWindowsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  @js.native
  @Factory
  trait DescribeLocationFsxWindowsResponse extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var Domain: js.UndefOr[SmbDomain]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList]
    var User: js.UndefOr[SmbUser]
  }

  @js.native
  @Factory
  trait DescribeLocationNfsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  @js.native
  @Factory
  trait DescribeLocationNfsResponse extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var MountOptions: js.UndefOr[NfsMountOptions]
    var OnPremConfig: js.UndefOr[OnPremConfig]
  }

  @js.native
  @Factory
  trait DescribeLocationS3Request extends js.Object {
    var LocationArn: LocationArn
  }

  @js.native
  @Factory
  trait DescribeLocationS3Response extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var S3Config: js.UndefOr[S3Config]
    var S3StorageClass: js.UndefOr[S3StorageClass]
  }

  @js.native
  @Factory
  trait DescribeLocationSmbRequest extends js.Object {
    var LocationArn: LocationArn
  }

  @js.native
  @Factory
  trait DescribeLocationSmbResponse extends js.Object {
    var AgentArns: js.UndefOr[AgentArnList]
    var CreationTime: js.UndefOr[Time]
    var Domain: js.UndefOr[SmbDomain]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var MountOptions: js.UndefOr[SmbMountOptions]
    var User: js.UndefOr[SmbUser]
  }

  @js.native
  @Factory
  trait DescribeTaskExecutionRequest extends js.Object {
    var TaskExecutionArn: TaskExecutionArn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeTaskRequest extends js.Object {
    var TaskArn: TaskArn
  }

  @js.native
  @Factory
  trait DescribeTaskResponse extends js.Object {
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var CreationTime: js.UndefOr[Time]
    var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn]
    var DestinationLocationArn: js.UndefOr[LocationArn]
    var DestinationNetworkInterfaceArns: js.UndefOr[DestinationNetworkInterfaceArns]
    var ErrorCode: js.UndefOr[String]
    var ErrorDetail: js.UndefOr[String]
    var Excludes: js.UndefOr[FilterList]
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
    var Schedule: js.UndefOr[TaskSchedule]
    var SourceLocationArn: js.UndefOr[LocationArn]
    var SourceNetworkInterfaceArns: js.UndefOr[SourceNetworkInterfaceArns]
    var Status: js.UndefOr[TaskStatus]
    var TaskArn: js.UndefOr[TaskArn]
  }

  /**
    * The subnet and the security group that DataSync uses to access target EFS file system. The subnet must have at least one mount target for that file system. The security group that you provide needs to be able to communicate with the security group on the mount target in the subnet specified.
    */
  @js.native
  @Factory
  trait Ec2Config extends js.Object {
    var SecurityGroupArns: Ec2SecurityGroupArnList
    var SubnetArn: Ec2SubnetArn
  }

  @js.native
  sealed trait EndpointType extends js.Any
  object EndpointType extends js.Object {
    val PUBLIC       = "PUBLIC".asInstanceOf[EndpointType]
    val PRIVATE_LINK = "PRIVATE_LINK".asInstanceOf[EndpointType]
    val FIPS         = "FIPS".asInstanceOf[EndpointType]

    val values = js.Object.freeze(js.Array(PUBLIC, PRIVATE_LINK, FIPS))
  }

  /**
    * Specifies which files, folders and objects to include or exclude when transferring files from source to destination.
    */
  @js.native
  @Factory
  trait FilterRule extends js.Object {
    var FilterType: js.UndefOr[FilterType]
    var Value: js.UndefOr[FilterValue]
  }

  @js.native
  sealed trait FilterType extends js.Any
  object FilterType extends js.Object {
    val SIMPLE_PATTERN = "SIMPLE_PATTERN".asInstanceOf[FilterType]

    val values = js.Object.freeze(js.Array(SIMPLE_PATTERN))
  }

  @js.native
  sealed trait Gid extends js.Any
  object Gid extends js.Object {
    val NONE      = "NONE".asInstanceOf[Gid]
    val INT_VALUE = "INT_VALUE".asInstanceOf[Gid]
    val NAME      = "NAME".asInstanceOf[Gid]
    val BOTH      = "BOTH".asInstanceOf[Gid]

    val values = js.Object.freeze(js.Array(NONE, INT_VALUE, NAME, BOTH))
  }

  @js.native
  @Factory
  trait ListAgentsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAgentsResponse extends js.Object {
    var Agents: js.UndefOr[AgentList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListLocationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListLocationsResponse extends js.Object {
    var Locations: js.UndefOr[LocationList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: TaggableResourceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * ListTaskExecutions
    */
  @js.native
  @Factory
  trait ListTaskExecutionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TaskArn: js.UndefOr[TaskArn]
  }

  @js.native
  @Factory
  trait ListTaskExecutionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TaskExecutions: js.UndefOr[TaskExecutionList]
  }

  @js.native
  @Factory
  trait ListTasksRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTasksResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tasks: js.UndefOr[TaskList]
  }

  /**
    * Represents a single entry in a list of locations. <code>LocationListEntry</code> returns an array that contains a list of locations when the <a>ListLocations</a> operation is called.
    */
  @js.native
  @Factory
  trait LocationListEntry extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
  }

  @js.native
  sealed trait LogLevel extends js.Any
  object LogLevel extends js.Object {
    val OFF      = "OFF".asInstanceOf[LogLevel]
    val BASIC    = "BASIC".asInstanceOf[LogLevel]
    val TRANSFER = "TRANSFER".asInstanceOf[LogLevel]

    val values = js.Object.freeze(js.Array(OFF, BASIC, TRANSFER))
  }

  @js.native
  sealed trait Mtime extends js.Any
  object Mtime extends js.Object {
    val NONE     = "NONE".asInstanceOf[Mtime]
    val PRESERVE = "PRESERVE".asInstanceOf[Mtime]

    val values = js.Object.freeze(js.Array(NONE, PRESERVE))
  }

  /**
    * Represents the mount options that are available for DataSync to access an NFS location.
    */
  @js.native
  @Factory
  trait NfsMountOptions extends js.Object {
    var Version: js.UndefOr[NfsVersion]
  }

  @js.native
  sealed trait NfsVersion extends js.Any
  object NfsVersion extends js.Object {
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[NfsVersion]
    val NFS3      = "NFS3".asInstanceOf[NfsVersion]
    val NFS4_0    = "NFS4_0".asInstanceOf[NfsVersion]
    val NFS4_1    = "NFS4_1".asInstanceOf[NfsVersion]

    val values = js.Object.freeze(js.Array(AUTOMATIC, NFS3, NFS4_0, NFS4_1))
  }

  /**
    * A list of Amazon Resource Names (ARNs) of agents to use for a Network File System (NFS) location.
    */
  @js.native
  @Factory
  trait OnPremConfig extends js.Object {
    var AgentArns: AgentArnList
  }

  /**
    * Represents the options that are available to control the behavior of a <a>StartTaskExecution</a> operation. Behavior includes preserving metadata such as user ID (UID), group ID (GID), and file permissions, and also overwriting files in the destination, data integrity verification, and so on.
    *  A task has a set of default options associated with it. If you don't specify an option in <a>StartTaskExecution</a>, the default value is used. You can override the defaults options on each task execution by specifying an overriding <code>Options</code> value to <a>StartTaskExecution</a>.
    */
  @js.native
  @Factory
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
    var TaskQueueing: js.UndefOr[TaskQueueing]
    var Uid: js.UndefOr[Uid]
    var VerifyMode: js.UndefOr[VerifyMode]
  }

  @js.native
  sealed trait OverwriteMode extends js.Any
  object OverwriteMode extends js.Object {
    val ALWAYS = "ALWAYS".asInstanceOf[OverwriteMode]
    val NEVER  = "NEVER".asInstanceOf[OverwriteMode]

    val values = js.Object.freeze(js.Array(ALWAYS, NEVER))
  }

  @js.native
  sealed trait PhaseStatus extends js.Any
  object PhaseStatus extends js.Object {
    val PENDING = "PENDING".asInstanceOf[PhaseStatus]
    val SUCCESS = "SUCCESS".asInstanceOf[PhaseStatus]
    val ERROR   = "ERROR".asInstanceOf[PhaseStatus]

    val values = js.Object.freeze(js.Array(PENDING, SUCCESS, ERROR))
  }

  @js.native
  sealed trait PosixPermissions extends js.Any
  object PosixPermissions extends js.Object {
    val NONE     = "NONE".asInstanceOf[PosixPermissions]
    val PRESERVE = "PRESERVE".asInstanceOf[PosixPermissions]

    val values = js.Object.freeze(js.Array(NONE, PRESERVE))
  }

  @js.native
  sealed trait PreserveDeletedFiles extends js.Any
  object PreserveDeletedFiles extends js.Object {
    val PRESERVE = "PRESERVE".asInstanceOf[PreserveDeletedFiles]
    val REMOVE   = "REMOVE".asInstanceOf[PreserveDeletedFiles]

    val values = js.Object.freeze(js.Array(PRESERVE, REMOVE))
  }

  @js.native
  sealed trait PreserveDevices extends js.Any
  object PreserveDevices extends js.Object {
    val NONE     = "NONE".asInstanceOf[PreserveDevices]
    val PRESERVE = "PRESERVE".asInstanceOf[PreserveDevices]

    val values = js.Object.freeze(js.Array(NONE, PRESERVE))
  }

  /**
    * The VPC endpoint, subnet and security group that an agent uses to access IP addresses in a VPC (Virtual Private Cloud).
    */
  @js.native
  @Factory
  trait PrivateLinkConfig extends js.Object {
    var PrivateLinkEndpoint: js.UndefOr[Endpoint]
    var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList]
    var SubnetArns: js.UndefOr[PLSubnetArnList]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
  }

  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is used to access an Amazon S3 bucket.
    *  For detailed information about using such a role, see Creating a Location for Amazon S3 in the <i>AWS DataSync User Guide</i>.
    */
  @js.native
  @Factory
  trait S3Config extends js.Object {
    var BucketAccessRoleArn: IamRoleArn
  }

  @js.native
  sealed trait S3StorageClass extends js.Any
  object S3StorageClass extends js.Object {
    val STANDARD            = "STANDARD".asInstanceOf[S3StorageClass]
    val STANDARD_IA         = "STANDARD_IA".asInstanceOf[S3StorageClass]
    val ONEZONE_IA          = "ONEZONE_IA".asInstanceOf[S3StorageClass]
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[S3StorageClass]
    val GLACIER             = "GLACIER".asInstanceOf[S3StorageClass]
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE".asInstanceOf[S3StorageClass]

    val values =
      js.Object.freeze(js.Array(STANDARD, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE))
  }

  /**
    * Represents the mount options that are available for DataSync to access an SMB location.
    */
  @js.native
  @Factory
  trait SmbMountOptions extends js.Object {
    var Version: js.UndefOr[SmbVersion]
  }

  @js.native
  sealed trait SmbVersion extends js.Any
  object SmbVersion extends js.Object {
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[SmbVersion]
    val SMB2      = "SMB2".asInstanceOf[SmbVersion]
    val SMB3      = "SMB3".asInstanceOf[SmbVersion]

    val values = js.Object.freeze(js.Array(AUTOMATIC, SMB2, SMB3))
  }

  @js.native
  @Factory
  trait StartTaskExecutionRequest extends js.Object {
    var TaskArn: TaskArn
    var Includes: js.UndefOr[FilterList]
    var OverrideOptions: js.UndefOr[Options]
  }

  @js.native
  @Factory
  trait StartTaskExecutionResponse extends js.Object {
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  /**
    * Represents a single entry in a list of AWS resource tags. <code>TagListEntry</code> returns an array that contains a list of tasks when the <a>ListTagsForResource</a> operation is called.
    */
  @js.native
  @Factory
  trait TagListEntry extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: TaggableResourceArn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Represents a single entry in a list of task executions. <code>TaskExecutionListEntry</code> returns an array that contains a list of specific invocations of a task when <a>ListTaskExecutions</a> operation is called.
    */
  @js.native
  @Factory
  trait TaskExecutionListEntry extends js.Object {
    var Status: js.UndefOr[TaskExecutionStatus]
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  /**
    * Describes the detailed result of a <code>TaskExecution</code> operation. This result includes the time in milliseconds spent in each phase, the status of the task execution, and the errors encountered.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait TaskExecutionStatus extends js.Any
  object TaskExecutionStatus extends js.Object {
    val QUEUED       = "QUEUED".asInstanceOf[TaskExecutionStatus]
    val LAUNCHING    = "LAUNCHING".asInstanceOf[TaskExecutionStatus]
    val PREPARING    = "PREPARING".asInstanceOf[TaskExecutionStatus]
    val TRANSFERRING = "TRANSFERRING".asInstanceOf[TaskExecutionStatus]
    val VERIFYING    = "VERIFYING".asInstanceOf[TaskExecutionStatus]
    val SUCCESS      = "SUCCESS".asInstanceOf[TaskExecutionStatus]
    val ERROR        = "ERROR".asInstanceOf[TaskExecutionStatus]

    val values = js.Object.freeze(js.Array(QUEUED, LAUNCHING, PREPARING, TRANSFERRING, VERIFYING, SUCCESS, ERROR))
  }

  /**
    * Represents a single entry in a list of tasks. <code>TaskListEntry</code> returns an array that contains a list of tasks when the <a>ListTasks</a> operation is called. A task includes the source and destination file systems to sync and the options to use for the tasks.
    */
  @js.native
  @Factory
  trait TaskListEntry extends js.Object {
    var Name: js.UndefOr[TagValue]
    var Status: js.UndefOr[TaskStatus]
    var TaskArn: js.UndefOr[TaskArn]
  }

  @js.native
  sealed trait TaskQueueing extends js.Any
  object TaskQueueing extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[TaskQueueing]
    val DISABLED = "DISABLED".asInstanceOf[TaskQueueing]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specifies the schedule you want your task to use for repeated executions. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html|Schedule Expressions for Rules]].
    */
  @js.native
  @Factory
  trait TaskSchedule extends js.Object {
    var ScheduleExpression: ScheduleExpressionCron
  }

  @js.native
  sealed trait TaskStatus extends js.Any
  object TaskStatus extends js.Object {
    val AVAILABLE   = "AVAILABLE".asInstanceOf[TaskStatus]
    val CREATING    = "CREATING".asInstanceOf[TaskStatus]
    val QUEUED      = "QUEUED".asInstanceOf[TaskStatus]
    val RUNNING     = "RUNNING".asInstanceOf[TaskStatus]
    val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[TaskStatus]

    val values = js.Object.freeze(js.Array(AVAILABLE, CREATING, QUEUED, RUNNING, UNAVAILABLE))
  }

  @js.native
  sealed trait Uid extends js.Any
  object Uid extends js.Object {
    val NONE      = "NONE".asInstanceOf[Uid]
    val INT_VALUE = "INT_VALUE".asInstanceOf[Uid]
    val NAME      = "NAME".asInstanceOf[Uid]
    val BOTH      = "BOTH".asInstanceOf[Uid]

    val values = js.Object.freeze(js.Array(NONE, INT_VALUE, NAME, BOTH))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var Keys: TagKeyList
    var ResourceArn: TaggableResourceArn
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateAgentRequest extends js.Object {
    var AgentArn: AgentArn
    var Name: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait UpdateAgentResponse extends js.Object {}

  /**
    * UpdateTaskResponse
    */
  @js.native
  @Factory
  trait UpdateTaskRequest extends js.Object {
    var TaskArn: TaskArn
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var Excludes: js.UndefOr[FilterList]
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
    var Schedule: js.UndefOr[TaskSchedule]
  }

  @js.native
  @Factory
  trait UpdateTaskResponse extends js.Object {}

  @js.native
  sealed trait VerifyMode extends js.Any
  object VerifyMode extends js.Object {
    val POINT_IN_TIME_CONSISTENT = "POINT_IN_TIME_CONSISTENT".asInstanceOf[VerifyMode]
    val ONLY_FILES_TRANSFERRED   = "ONLY_FILES_TRANSFERRED".asInstanceOf[VerifyMode]
    val NONE                     = "NONE".asInstanceOf[VerifyMode]

    val values = js.Object.freeze(js.Array(POINT_IN_TIME_CONSISTENT, ONLY_FILES_TRANSFERRED, NONE))
  }
}
