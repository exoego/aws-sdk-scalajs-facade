package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object datasync {
  type ActivationKey = String
  type AgentArn = String
  type AgentArnList = js.Array[AgentArn]
  type AgentList = js.Array[AgentListEntry]
  type AgentStatus = String
  type Atime = String
  type BytesPerSecond = Double
  type Duration = Double
  type Ec2SecurityGroupArn = String
  type Ec2SecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type Ec2SubnetArn = String
  type EfsFilesystemArn = String
  type Gid = String
  type IamRoleArn = String
  type LocationArn = String
  type LocationList = js.Array[LocationListEntry]
  type LocationUri = String
  type LogGroupArn = String
  type MaxResults = Int
  type Mtime = String
  type NextToken = String
  type PhaseStatus = String
  type PosixPermissions = String
  type PreserveDeletedFiles = String
  type PreserveDevices = String
  type S3BucketArn = String
  type ServerHostname = String
  type Subdirectory = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[TagListEntry]
  type TagValue = String
  type TaggableResourceArn = String
  type TaskArn = String
  type TaskExecutionArn = String
  type TaskExecutionList = js.Array[TaskExecutionListEntry]
  type TaskExecutionStatus = String
  type TaskList = js.Array[TaskListEntry]
  type TaskStatus = String
  type Time = js.Date
  type Uid = String
  type VerifyMode = String
  type long = Double
  type string = String
}

package datasync {
  @js.native
  @JSImport("aws-sdk", "DataSync")
  class DataSync(config: AWSConfig) extends js.Object {
    def cancelTaskExecution(params: CancelTaskExecutionRequest): Request[CancelTaskExecutionResponse] = js.native
    def createAgent(params: CreateAgentRequest): Request[CreateAgentResponse] = js.native
    def createLocationEfs(params: CreateLocationEfsRequest): Request[CreateLocationEfsResponse] = js.native
    def createLocationNfs(params: CreateLocationNfsRequest): Request[CreateLocationNfsResponse] = js.native
    def createLocationS3(params: CreateLocationS3Request): Request[CreateLocationS3Response] = js.native
    def createTask(params: CreateTaskRequest): Request[CreateTaskResponse] = js.native
    def deleteAgent(params: DeleteAgentRequest): Request[DeleteAgentResponse] = js.native
    def deleteLocation(params: DeleteLocationRequest): Request[DeleteLocationResponse] = js.native
    def deleteTask(params: DeleteTaskRequest): Request[DeleteTaskResponse] = js.native
    def describeAgent(params: DescribeAgentRequest): Request[DescribeAgentResponse] = js.native
    def describeLocationEfs(params: DescribeLocationEfsRequest): Request[DescribeLocationEfsResponse] = js.native
    def describeLocationNfs(params: DescribeLocationNfsRequest): Request[DescribeLocationNfsResponse] = js.native
    def describeLocationS3(params: DescribeLocationS3Request): Request[DescribeLocationS3Response] = js.native
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
    def updateTask(params: UpdateTaskRequest): Request[UpdateTaskResponse] = js.native
  }

  /**
   * <p>Represents a single entry in a list of agents. <code>AgentListEntry</code> returns an array that contains a list of agents when the <a>ListAgents</a> operation is called.</p>
   */
  @js.native
  trait AgentListEntry extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var Name: js.UndefOr[TagValue]
    var Status: js.UndefOr[AgentStatus]
  }

  object AgentListEntry {
    def apply(
      AgentArn: js.UndefOr[AgentArn] = js.undefined,
      Name: js.UndefOr[TagValue] = js.undefined,
      Status: js.UndefOr[AgentStatus] = js.undefined): AgentListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentListEntry]
    }
  }

  object AgentStatusEnum {
    val ONLINE = "ONLINE"
    val OFFLINE = "OFFLINE"

    val values = IndexedSeq(ONLINE, OFFLINE)
  }

  object AtimeEnum {
    val NONE = "NONE"
    val BEST_EFFORT = "BEST_EFFORT"

    val values = IndexedSeq(NONE, BEST_EFFORT)
  }

  /**
   * <p>CancelTaskExecutionRequest</p>
   */
  @js.native
  trait CancelTaskExecutionRequest extends js.Object {
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object CancelTaskExecutionRequest {
    def apply(
      TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined): CancelTaskExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskExecutionArn" -> TaskExecutionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTaskExecutionRequest]
    }
  }

  @js.native
  trait CancelTaskExecutionResponse extends js.Object {

  }

  object CancelTaskExecutionResponse {
    def apply(): CancelTaskExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTaskExecutionResponse]
    }
  }

  /**
   * <p>CreateAgentRequest</p>
   */
  @js.native
  trait CreateAgentRequest extends js.Object {
    var ActivationKey: js.UndefOr[ActivationKey]
    var AgentName: js.UndefOr[TagValue]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAgentRequest {
    def apply(
      ActivationKey: js.UndefOr[ActivationKey] = js.undefined,
      AgentName: js.UndefOr[TagValue] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationKey" -> ActivationKey.map { x => x.asInstanceOf[js.Any] },
        "AgentName" -> AgentName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAgentRequest]
    }
  }

  /**
   * <p>CreateAgentResponse</p>
   */
  @js.native
  trait CreateAgentResponse extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
  }

  object CreateAgentResponse {
    def apply(
      AgentArn: js.UndefOr[AgentArn] = js.undefined): CreateAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAgentResponse]
    }
  }

  /**
   * <p>CreateLocationEfsRequest</p>
   */
  @js.native
  trait CreateLocationEfsRequest extends js.Object {
    var Subdirectory: js.UndefOr[Subdirectory]
    var EfsFilesystemArn: js.UndefOr[EfsFilesystemArn]
    var Ec2Config: js.UndefOr[Ec2Config]
    var Tags: js.UndefOr[TagList]
  }

  object CreateLocationEfsRequest {
    def apply(
      Subdirectory: js.UndefOr[Subdirectory] = js.undefined,
      EfsFilesystemArn: js.UndefOr[EfsFilesystemArn] = js.undefined,
      Ec2Config: js.UndefOr[Ec2Config] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateLocationEfsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subdirectory" -> Subdirectory.map { x => x.asInstanceOf[js.Any] },
        "EfsFilesystemArn" -> EfsFilesystemArn.map { x => x.asInstanceOf[js.Any] },
        "Ec2Config" -> Ec2Config.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationEfsRequest]
    }
  }

  /**
   * <p>CreateLocationEfs</p>
   */
  @js.native
  trait CreateLocationEfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationEfsResponse {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined): CreateLocationEfsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationEfsResponse]
    }
  }

  /**
   * <p>CreateLocationNfsRequest</p>
   */
  @js.native
  trait CreateLocationNfsRequest extends js.Object {
    var Subdirectory: js.UndefOr[Subdirectory]
    var ServerHostname: js.UndefOr[ServerHostname]
    var OnPremConfig: js.UndefOr[OnPremConfig]
    var Tags: js.UndefOr[TagList]
  }

  object CreateLocationNfsRequest {
    def apply(
      Subdirectory: js.UndefOr[Subdirectory] = js.undefined,
      ServerHostname: js.UndefOr[ServerHostname] = js.undefined,
      OnPremConfig: js.UndefOr[OnPremConfig] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateLocationNfsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subdirectory" -> Subdirectory.map { x => x.asInstanceOf[js.Any] },
        "ServerHostname" -> ServerHostname.map { x => x.asInstanceOf[js.Any] },
        "OnPremConfig" -> OnPremConfig.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationNfsRequest]
    }
  }

  /**
   * <p>CreateLocationNfsResponse</p>
   */
  @js.native
  trait CreateLocationNfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationNfsResponse {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined): CreateLocationNfsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationNfsResponse]
    }
  }

  /**
   * <p>CreateLocationS3Request</p>
   */
  @js.native
  trait CreateLocationS3Request extends js.Object {
    var Subdirectory: js.UndefOr[Subdirectory]
    var S3BucketArn: js.UndefOr[S3BucketArn]
    var S3Config: js.UndefOr[S3Config]
    var Tags: js.UndefOr[TagList]
  }

  object CreateLocationS3Request {
    def apply(
      Subdirectory: js.UndefOr[Subdirectory] = js.undefined,
      S3BucketArn: js.UndefOr[S3BucketArn] = js.undefined,
      S3Config: js.UndefOr[S3Config] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateLocationS3Request = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subdirectory" -> Subdirectory.map { x => x.asInstanceOf[js.Any] },
        "S3BucketArn" -> S3BucketArn.map { x => x.asInstanceOf[js.Any] },
        "S3Config" -> S3Config.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationS3Request]
    }
  }

  /**
   * <p>CreateLocationS3Response</p>
   */
  @js.native
  trait CreateLocationS3Response extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationS3Response {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined): CreateLocationS3Response = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationS3Response]
    }
  }

  /**
   * <p>CreateTaskRequest</p>
   */
  @js.native
  trait CreateTaskRequest extends js.Object {
    var Name: js.UndefOr[TagValue]
    var DestinationLocationArn: js.UndefOr[LocationArn]
    var Tags: js.UndefOr[TagList]
    var Options: js.UndefOr[Options]
    var SourceLocationArn: js.UndefOr[LocationArn]
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
  }

  object CreateTaskRequest {
    def apply(
      Name: js.UndefOr[TagValue] = js.undefined,
      DestinationLocationArn: js.UndefOr[LocationArn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Options: js.UndefOr[Options] = js.undefined,
      SourceLocationArn: js.UndefOr[LocationArn] = js.undefined,
      CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined): CreateTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DestinationLocationArn" -> DestinationLocationArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "SourceLocationArn" -> SourceLocationArn.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogGroupArn" -> CloudWatchLogGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTaskRequest]
    }
  }

  /**
   * <p>CreateTaskResponse</p>
   */
  @js.native
  trait CreateTaskResponse extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
  }

  object CreateTaskResponse {
    def apply(
      TaskArn: js.UndefOr[TaskArn] = js.undefined): CreateTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTaskResponse]
    }
  }

  /**
   * <p>DeleteAgentRequest</p>
   */
  @js.native
  trait DeleteAgentRequest extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
  }

  object DeleteAgentRequest {
    def apply(
      AgentArn: js.UndefOr[AgentArn] = js.undefined): DeleteAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAgentRequest]
    }
  }

  @js.native
  trait DeleteAgentResponse extends js.Object {

  }

  object DeleteAgentResponse {
    def apply(): DeleteAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAgentResponse]
    }
  }

  /**
   * <p>DeleteLocation</p>
   */
  @js.native
  trait DeleteLocationRequest extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object DeleteLocationRequest {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined): DeleteLocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLocationRequest]
    }
  }

  @js.native
  trait DeleteLocationResponse extends js.Object {

  }

  object DeleteLocationResponse {
    def apply(): DeleteLocationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLocationResponse]
    }
  }

  /**
   * <p>DeleteTask</p>
   */
  @js.native
  trait DeleteTaskRequest extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
  }

  object DeleteTaskRequest {
    def apply(
      TaskArn: js.UndefOr[TaskArn] = js.undefined): DeleteTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTaskRequest]
    }
  }

  @js.native
  trait DeleteTaskResponse extends js.Object {

  }

  object DeleteTaskResponse {
    def apply(): DeleteTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTaskResponse]
    }
  }

  /**
   * <p>DescribeAgent</p>
   */
  @js.native
  trait DescribeAgentRequest extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
  }

  object DescribeAgentRequest {
    def apply(
      AgentArn: js.UndefOr[AgentArn] = js.undefined): DescribeAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentRequest]
    }
  }

  /**
   * <p>DescribeAgentResponse</p>
   */
  @js.native
  trait DescribeAgentResponse extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var Name: js.UndefOr[TagValue]
    var LastConnectionTime: js.UndefOr[Time]
    var Status: js.UndefOr[AgentStatus]
    var CreationTime: js.UndefOr[Time]
  }

  object DescribeAgentResponse {
    def apply(
      AgentArn: js.UndefOr[AgentArn] = js.undefined,
      Name: js.UndefOr[TagValue] = js.undefined,
      LastConnectionTime: js.UndefOr[Time] = js.undefined,
      Status: js.UndefOr[AgentStatus] = js.undefined,
      CreationTime: js.UndefOr[Time] = js.undefined): DescribeAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastConnectionTime" -> LastConnectionTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentResponse]
    }
  }

  /**
   * <p>DescribeLocationEfsRequest</p>
   */
  @js.native
  trait DescribeLocationEfsRequest extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object DescribeLocationEfsRequest {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined): DescribeLocationEfsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationEfsRequest]
    }
  }

  /**
   * <p>DescribeLocationEfsResponse</p>
   */
  @js.native
  trait DescribeLocationEfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var Ec2Config: js.UndefOr[Ec2Config]
    var CreationTime: js.UndefOr[Time]
  }

  object DescribeLocationEfsResponse {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined,
      LocationUri: js.UndefOr[LocationUri] = js.undefined,
      Ec2Config: js.UndefOr[Ec2Config] = js.undefined,
      CreationTime: js.UndefOr[Time] = js.undefined): DescribeLocationEfsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] },
        "LocationUri" -> LocationUri.map { x => x.asInstanceOf[js.Any] },
        "Ec2Config" -> Ec2Config.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationEfsResponse]
    }
  }

  /**
   * <p>DescribeLocationNfsRequest</p>
   */
  @js.native
  trait DescribeLocationNfsRequest extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object DescribeLocationNfsRequest {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined): DescribeLocationNfsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationNfsRequest]
    }
  }

  /**
   * <p>DescribeLocationNfsResponse</p>
   */
  @js.native
  trait DescribeLocationNfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var OnPremConfig: js.UndefOr[OnPremConfig]
    var CreationTime: js.UndefOr[Time]
  }

  object DescribeLocationNfsResponse {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined,
      LocationUri: js.UndefOr[LocationUri] = js.undefined,
      OnPremConfig: js.UndefOr[OnPremConfig] = js.undefined,
      CreationTime: js.UndefOr[Time] = js.undefined): DescribeLocationNfsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] },
        "LocationUri" -> LocationUri.map { x => x.asInstanceOf[js.Any] },
        "OnPremConfig" -> OnPremConfig.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationNfsResponse]
    }
  }

  /**
   * <p>DescribeLocationS3Request</p>
   */
  @js.native
  trait DescribeLocationS3Request extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object DescribeLocationS3Request {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined): DescribeLocationS3Request = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationS3Request]
    }
  }

  /**
   * <p>DescribeLocationS3Response</p>
   */
  @js.native
  trait DescribeLocationS3Response extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var S3Config: js.UndefOr[S3Config]
    var CreationTime: js.UndefOr[Time]
  }

  object DescribeLocationS3Response {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined,
      LocationUri: js.UndefOr[LocationUri] = js.undefined,
      S3Config: js.UndefOr[S3Config] = js.undefined,
      CreationTime: js.UndefOr[Time] = js.undefined): DescribeLocationS3Response = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] },
        "LocationUri" -> LocationUri.map { x => x.asInstanceOf[js.Any] },
        "S3Config" -> S3Config.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationS3Response]
    }
  }

  /**
   * <p>DescribeTaskExecutionRequest</p>
   */
  @js.native
  trait DescribeTaskExecutionRequest extends js.Object {
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object DescribeTaskExecutionRequest {
    def apply(
      TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined): DescribeTaskExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskExecutionArn" -> TaskExecutionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskExecutionRequest]
    }
  }

  /**
   * <p>DescribeTaskExecutionResponse</p>
   */
  @js.native
  trait DescribeTaskExecutionResponse extends js.Object {
    var BytesTransferred: js.UndefOr[long]
    var FilesTransferred: js.UndefOr[long]
    var BytesWritten: js.UndefOr[long]
    var StartTime: js.UndefOr[Time]
    var EstimatedBytesToTransfer: js.UndefOr[long]
    var Options: js.UndefOr[Options]
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
    var Result: js.UndefOr[TaskExecutionResultDetail]
    var EstimatedFilesToTransfer: js.UndefOr[long]
    var Status: js.UndefOr[TaskExecutionStatus]
  }

  object DescribeTaskExecutionResponse {
    def apply(
      BytesTransferred: js.UndefOr[long] = js.undefined,
      FilesTransferred: js.UndefOr[long] = js.undefined,
      BytesWritten: js.UndefOr[long] = js.undefined,
      StartTime: js.UndefOr[Time] = js.undefined,
      EstimatedBytesToTransfer: js.UndefOr[long] = js.undefined,
      Options: js.UndefOr[Options] = js.undefined,
      TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined,
      Result: js.UndefOr[TaskExecutionResultDetail] = js.undefined,
      EstimatedFilesToTransfer: js.UndefOr[long] = js.undefined,
      Status: js.UndefOr[TaskExecutionStatus] = js.undefined): DescribeTaskExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesTransferred" -> BytesTransferred.map { x => x.asInstanceOf[js.Any] },
        "FilesTransferred" -> FilesTransferred.map { x => x.asInstanceOf[js.Any] },
        "BytesWritten" -> BytesWritten.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EstimatedBytesToTransfer" -> EstimatedBytesToTransfer.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "TaskExecutionArn" -> TaskExecutionArn.map { x => x.asInstanceOf[js.Any] },
        "Result" -> Result.map { x => x.asInstanceOf[js.Any] },
        "EstimatedFilesToTransfer" -> EstimatedFilesToTransfer.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskExecutionResponse]
    }
  }

  /**
   * <p>DescribeTaskRequest</p>
   */
  @js.native
  trait DescribeTaskRequest extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
  }

  object DescribeTaskRequest {
    def apply(
      TaskArn: js.UndefOr[TaskArn] = js.undefined): DescribeTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskRequest]
    }
  }

  /**
   * <p>DescribeTaskResponse</p>
   */
  @js.native
  trait DescribeTaskResponse extends js.Object {
    var Name: js.UndefOr[TagValue]
    var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn]
    var DestinationLocationArn: js.UndefOr[LocationArn]
    var ErrorCode: js.UndefOr[string]
    var TaskArn: js.UndefOr[TaskArn]
    var ErrorDetail: js.UndefOr[string]
    var Options: js.UndefOr[Options]
    var SourceLocationArn: js.UndefOr[LocationArn]
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var Status: js.UndefOr[TaskStatus]
    var CreationTime: js.UndefOr[Time]
  }

  object DescribeTaskResponse {
    def apply(
      Name: js.UndefOr[TagValue] = js.undefined,
      CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined,
      DestinationLocationArn: js.UndefOr[LocationArn] = js.undefined,
      ErrorCode: js.UndefOr[string] = js.undefined,
      TaskArn: js.UndefOr[TaskArn] = js.undefined,
      ErrorDetail: js.UndefOr[string] = js.undefined,
      Options: js.UndefOr[Options] = js.undefined,
      SourceLocationArn: js.UndefOr[LocationArn] = js.undefined,
      CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined,
      Status: js.UndefOr[TaskStatus] = js.undefined,
      CreationTime: js.UndefOr[Time] = js.undefined): DescribeTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CurrentTaskExecutionArn" -> CurrentTaskExecutionArn.map { x => x.asInstanceOf[js.Any] },
        "DestinationLocationArn" -> DestinationLocationArn.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "ErrorDetail" -> ErrorDetail.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "SourceLocationArn" -> SourceLocationArn.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogGroupArn" -> CloudWatchLogGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskResponse]
    }
  }

  /**
   * <p>The subnet and the security group that the target Amazon EFS file system uses. The subnet must have at least one mount target for that file system. The security group that you provide needs to be able to communicate with the security group on the mount target in the subnet specified. </p> <p>The exact relationship between security group M (of the mount target) and security group S (which you provide for DataSync to use at this stage) is as follows: </p> <ul> <li> <p> Security group M (which you associate with the mount target) must allow inbound access for the Transmission Control Protocol (TCP) on the NFS port (2049) from security group S. You can enable inbound connections either by IP address (CIDR range) or security group. </p> </li> <li> <p>Security group S (provided to DataSync to access EFS) should have a rule that enables outbound connections to the NFS port on one of the file system�fs mount targets. You can enable outbound connections either by IP address (CIDR range) or security group. For information about security groups and mount targets, see <a href="https://docs.aws.amazon.com/efs/latest/ug/security-considerations.html#network-access">Security Groups for Amazon EC2 Instances and Mount Targets</a> in the <i>Amazon EFS User Guide.</i> </p> </li> </ul>
   */
  @js.native
  trait Ec2Config extends js.Object {
    var SubnetArn: js.UndefOr[Ec2SubnetArn]
    var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList]
  }

  object Ec2Config {
    def apply(
      SubnetArn: js.UndefOr[Ec2SubnetArn] = js.undefined,
      SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.undefined): Ec2Config = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetArn" -> SubnetArn.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupArns" -> SecurityGroupArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ec2Config]
    }
  }

  object GidEnum {
    val NONE = "NONE"
    val INT_VALUE = "INT_VALUE"
    val NAME = "NAME"
    val BOTH = "BOTH"

    val values = IndexedSeq(NONE, INT_VALUE, NAME, BOTH)
  }

  /**
   * <p>ListAgentsRequest</p>
   */
  @js.native
  trait ListAgentsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgentsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAgentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAgentsRequest]
    }
  }

  /**
   * <p>ListAgentsResponse</p>
   */
  @js.native
  trait ListAgentsResponse extends js.Object {
    var Agents: js.UndefOr[AgentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgentsResponse {
    def apply(
      Agents: js.UndefOr[AgentList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAgentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Agents" -> Agents.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAgentsResponse]
    }
  }

  /**
   * <p>ListLocationsRequest</p>
   */
  @js.native
  trait ListLocationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLocationsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocationsRequest]
    }
  }

  /**
   * <p>ListLocationsResponse</p>
   */
  @js.native
  trait ListLocationsResponse extends js.Object {
    var Locations: js.UndefOr[LocationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLocationsResponse {
    def apply(
      Locations: js.UndefOr[LocationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLocationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Locations" -> Locations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocationsResponse]
    }
  }

  /**
   * <p>ListTagsForResourceRequest</p>
   */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[TaggableResourceArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[TaggableResourceArn] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
   * <p>ListTagsForResourceResponse</p>
   */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
   * <p>ListTaskExecutions</p>
   */
  @js.native
  trait ListTaskExecutionsRequest extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTaskExecutionsRequest {
    def apply(
      TaskArn: js.UndefOr[TaskArn] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTaskExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskExecutionsRequest]
    }
  }

  /**
   * <p>ListTaskExecutionsResponse</p>
   */
  @js.native
  trait ListTaskExecutionsResponse extends js.Object {
    var TaskExecutions: js.UndefOr[TaskExecutionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTaskExecutionsResponse {
    def apply(
      TaskExecutions: js.UndefOr[TaskExecutionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTaskExecutionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskExecutions" -> TaskExecutions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskExecutionsResponse]
    }
  }

  /**
   * <p>ListTasksRequest</p>
   */
  @js.native
  trait ListTasksRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTasksRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksRequest]
    }
  }

  /**
   * <p>ListTasksResponse</p>
   */
  @js.native
  trait ListTasksResponse extends js.Object {
    var Tasks: js.UndefOr[TaskList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTasksResponse {
    def apply(
      Tasks: js.UndefOr[TaskList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tasks" -> Tasks.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksResponse]
    }
  }

  /**
   * <p>Represents a single entry in a list of locations. <code>LocationListEntry</code> returns an array that contains a list of locations when the <a>ListLocations</a> operation is called.</p>
   */
  @js.native
  trait LocationListEntry extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
  }

  object LocationListEntry {
    def apply(
      LocationArn: js.UndefOr[LocationArn] = js.undefined,
      LocationUri: js.UndefOr[LocationUri] = js.undefined): LocationListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x => x.asInstanceOf[js.Any] },
        "LocationUri" -> LocationUri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocationListEntry]
    }
  }

  object MtimeEnum {
    val NONE = "NONE"
    val PRESERVE = "PRESERVE"

    val values = IndexedSeq(NONE, PRESERVE)
  }

  /**
   * <p>A list of Amazon Resource Names (ARNs) of agents to use for a Network File System (NFS) location.</p>
   */
  @js.native
  trait OnPremConfig extends js.Object {
    var AgentArns: js.UndefOr[AgentArnList]
  }

  object OnPremConfig {
    def apply(
      AgentArns: js.UndefOr[AgentArnList] = js.undefined): OnPremConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArns" -> AgentArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OnPremConfig]
    }
  }

  /**
   * <p>Represents the options that are available to control the behavior of a <a>StartTaskExecution</a> operation. Behavior includes preserving metadata such as user ID (UID), group ID (GID), and file permissions, and also overwriting files in the destination, data integrity verification, and so on.</p> <p>A task has a set of default options associated with it. If you don't specify an option in <a>StartTaskExecution</a>, the default value is used. You can override the defaults options on each task execution by specifying an overriding <code>Options</code> value to <a>StartTaskExecution</a>.</p>
   */
  @js.native
  trait Options extends js.Object {
    var Uid: js.UndefOr[Uid]
    var Atime: js.UndefOr[Atime]
    var BytesPerSecond: js.UndefOr[BytesPerSecond]
    var Mtime: js.UndefOr[Mtime]
    var VerifyMode: js.UndefOr[VerifyMode]
    var PreserveDeletedFiles: js.UndefOr[PreserveDeletedFiles]
    var Gid: js.UndefOr[Gid]
    var PreserveDevices: js.UndefOr[PreserveDevices]
    var PosixPermissions: js.UndefOr[PosixPermissions]
  }

  object Options {
    def apply(
      Uid: js.UndefOr[Uid] = js.undefined,
      Atime: js.UndefOr[Atime] = js.undefined,
      BytesPerSecond: js.UndefOr[BytesPerSecond] = js.undefined,
      Mtime: js.UndefOr[Mtime] = js.undefined,
      VerifyMode: js.UndefOr[VerifyMode] = js.undefined,
      PreserveDeletedFiles: js.UndefOr[PreserveDeletedFiles] = js.undefined,
      Gid: js.UndefOr[Gid] = js.undefined,
      PreserveDevices: js.UndefOr[PreserveDevices] = js.undefined,
      PosixPermissions: js.UndefOr[PosixPermissions] = js.undefined): Options = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Uid" -> Uid.map { x => x.asInstanceOf[js.Any] },
        "Atime" -> Atime.map { x => x.asInstanceOf[js.Any] },
        "BytesPerSecond" -> BytesPerSecond.map { x => x.asInstanceOf[js.Any] },
        "Mtime" -> Mtime.map { x => x.asInstanceOf[js.Any] },
        "VerifyMode" -> VerifyMode.map { x => x.asInstanceOf[js.Any] },
        "PreserveDeletedFiles" -> PreserveDeletedFiles.map { x => x.asInstanceOf[js.Any] },
        "Gid" -> Gid.map { x => x.asInstanceOf[js.Any] },
        "PreserveDevices" -> PreserveDevices.map { x => x.asInstanceOf[js.Any] },
        "PosixPermissions" -> PosixPermissions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Options]
    }
  }

  object PhaseStatusEnum {
    val PENDING = "PENDING"
    val SUCCESS = "SUCCESS"
    val ERROR = "ERROR"

    val values = IndexedSeq(PENDING, SUCCESS, ERROR)
  }

  object PosixPermissionsEnum {
    val NONE = "NONE"
    val BEST_EFFORT = "BEST_EFFORT"
    val PRESERVE = "PRESERVE"

    val values = IndexedSeq(NONE, BEST_EFFORT, PRESERVE)
  }

  object PreserveDeletedFilesEnum {
    val PRESERVE = "PRESERVE"
    val REMOVE = "REMOVE"

    val values = IndexedSeq(PRESERVE, REMOVE)
  }

  object PreserveDevicesEnum {
    val NONE = "NONE"
    val PRESERVE = "PRESERVE"

    val values = IndexedSeq(NONE, PRESERVE)
  }

  /**
   * <p>The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is used to access an Amazon S3 bucket. For detailed information about using such a role, see <a href="https://alpha-aws-docs.aws.amazon.com/sync-service/latest/userguide/create-locations-cli.html#create-location-s3-cli">Components and Terminology</a> in the <i>AWS DataSync User Guide</i>.</p>
   */
  @js.native
  trait S3Config extends js.Object {
    var BucketAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object S3Config {
    def apply(
      BucketAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): S3Config = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketAccessRoleArn" -> BucketAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Config]
    }
  }

  /**
   * <p>StartTaskExecutionRequest</p>
   */
  @js.native
  trait StartTaskExecutionRequest extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
    var OverrideOptions: js.UndefOr[Options]
  }

  object StartTaskExecutionRequest {
    def apply(
      TaskArn: js.UndefOr[TaskArn] = js.undefined,
      OverrideOptions: js.UndefOr[Options] = js.undefined): StartTaskExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "OverrideOptions" -> OverrideOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskExecutionRequest]
    }
  }

  /**
   * <p>StartTaskExecutionResponse</p>
   */
  @js.native
  trait StartTaskExecutionResponse extends js.Object {
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object StartTaskExecutionResponse {
    def apply(
      TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined): StartTaskExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskExecutionArn" -> TaskExecutionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskExecutionResponse]
    }
  }

  /**
   * <p>Represents a single entry in a list of AWS resource tags. <code>TagListEntry</code> returns an array that contains a list of tasks when the <a>ListTagsForResource</a> operation is called.</p>
   */
  @js.native
  trait TagListEntry extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object TagListEntry {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): TagListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagListEntry]
    }
  }

  /**
   * <p>TagResourceRequest</p>
   */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[TaggableResourceArn]
    var Tags: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[TaggableResourceArn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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

  /**
   * <p>Represents a single entry in a list of task executions. <code>TaskExecutionListEntry</code> returns an array that contains a list of specific invocations of a task when <a>ListTaskExecutions</a> operation is called.</p>
   */
  @js.native
  trait TaskExecutionListEntry extends js.Object {
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
    var Status: js.UndefOr[TaskExecutionStatus]
  }

  object TaskExecutionListEntry {
    def apply(
      TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined,
      Status: js.UndefOr[TaskExecutionStatus] = js.undefined): TaskExecutionListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskExecutionArn" -> TaskExecutionArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskExecutionListEntry]
    }
  }

  /**
   * <p>Describes the detailed result of a <code>TaskExecution</code> operation. This result includes the time in milliseconds spent in each phase, the status of the task execution, and the errors encountered.</p>
   */
  @js.native
  trait TaskExecutionResultDetail extends js.Object {
    var TransferStatus: js.UndefOr[PhaseStatus]
    var VerifyDuration: js.UndefOr[Duration]
    var ErrorCode: js.UndefOr[string]
    var VerifyStatus: js.UndefOr[PhaseStatus]
    var PrepareStatus: js.UndefOr[PhaseStatus]
    var ErrorDetail: js.UndefOr[string]
    var PrepareDuration: js.UndefOr[Duration]
    var TransferDuration: js.UndefOr[Duration]
  }

  object TaskExecutionResultDetail {
    def apply(
      TransferStatus: js.UndefOr[PhaseStatus] = js.undefined,
      VerifyDuration: js.UndefOr[Duration] = js.undefined,
      ErrorCode: js.UndefOr[string] = js.undefined,
      VerifyStatus: js.UndefOr[PhaseStatus] = js.undefined,
      PrepareStatus: js.UndefOr[PhaseStatus] = js.undefined,
      ErrorDetail: js.UndefOr[string] = js.undefined,
      PrepareDuration: js.UndefOr[Duration] = js.undefined,
      TransferDuration: js.UndefOr[Duration] = js.undefined): TaskExecutionResultDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransferStatus" -> TransferStatus.map { x => x.asInstanceOf[js.Any] },
        "VerifyDuration" -> VerifyDuration.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "VerifyStatus" -> VerifyStatus.map { x => x.asInstanceOf[js.Any] },
        "PrepareStatus" -> PrepareStatus.map { x => x.asInstanceOf[js.Any] },
        "ErrorDetail" -> ErrorDetail.map { x => x.asInstanceOf[js.Any] },
        "PrepareDuration" -> PrepareDuration.map { x => x.asInstanceOf[js.Any] },
        "TransferDuration" -> TransferDuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskExecutionResultDetail]
    }
  }

  object TaskExecutionStatusEnum {
    val LAUNCHING = "LAUNCHING"
    val PREPARING = "PREPARING"
    val TRANSFERRING = "TRANSFERRING"
    val VERIFYING = "VERIFYING"
    val SUCCESS = "SUCCESS"
    val ERROR = "ERROR"

    val values = IndexedSeq(LAUNCHING, PREPARING, TRANSFERRING, VERIFYING, SUCCESS, ERROR)
  }

  /**
   * <p>Represents a single entry in a list of tasks. <code>TaskListEntry</code> returns an array that contains a list of tasks when the <a>ListTasks</a> operation is called. A task includes the source and destination file systems to sync and the options to use for the tasks.</p>
   */
  @js.native
  trait TaskListEntry extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
    var Status: js.UndefOr[TaskStatus]
    var Name: js.UndefOr[TagValue]
  }

  object TaskListEntry {
    def apply(
      TaskArn: js.UndefOr[TaskArn] = js.undefined,
      Status: js.UndefOr[TaskStatus] = js.undefined,
      Name: js.UndefOr[TagValue] = js.undefined): TaskListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskListEntry]
    }
  }

  object TaskStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val CREATING = "CREATING"
    val RUNNING = "RUNNING"
    val UNAVAILABLE = "UNAVAILABLE"

    val values = IndexedSeq(AVAILABLE, CREATING, RUNNING, UNAVAILABLE)
  }

  object UidEnum {
    val NONE = "NONE"
    val INT_VALUE = "INT_VALUE"
    val NAME = "NAME"
    val BOTH = "BOTH"

    val values = IndexedSeq(NONE, INT_VALUE, NAME, BOTH)
  }

  /**
   * <p>UntagResourceRequest</p>
   */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[TaggableResourceArn]
    var Keys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[TaggableResourceArn] = js.undefined,
      Keys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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

  /**
   * <p>UpdateAgentRequest</p>
   */
  @js.native
  trait UpdateAgentRequest extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var Name: js.UndefOr[TagValue]
  }

  object UpdateAgentRequest {
    def apply(
      AgentArn: js.UndefOr[AgentArn] = js.undefined,
      Name: js.UndefOr[TagValue] = js.undefined): UpdateAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAgentRequest]
    }
  }

  @js.native
  trait UpdateAgentResponse extends js.Object {

  }

  object UpdateAgentResponse {
    def apply(): UpdateAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAgentResponse]
    }
  }

  /**
   * <p>UpdateTaskResponse</p>
   */
  @js.native
  trait UpdateTaskRequest extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
    var Options: js.UndefOr[Options]
    var Name: js.UndefOr[TagValue]
  }

  object UpdateTaskRequest {
    def apply(
      TaskArn: js.UndefOr[TaskArn] = js.undefined,
      Options: js.UndefOr[Options] = js.undefined,
      Name: js.UndefOr[TagValue] = js.undefined): UpdateTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTaskRequest]
    }
  }

  @js.native
  trait UpdateTaskResponse extends js.Object {

  }

  object UpdateTaskResponse {
    def apply(): UpdateTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTaskResponse]
    }
  }

  object VerifyModeEnum {
    val POINT_IN_TIME_CONSISTENT = "POINT_IN_TIME_CONSISTENT"
    val NONE = "NONE"

    val values = IndexedSeq(POINT_IN_TIME_CONSISTENT, NONE)
  }
}
