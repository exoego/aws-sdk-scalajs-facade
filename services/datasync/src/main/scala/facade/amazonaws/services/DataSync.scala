package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object datasync {
  type ActivationKey           = String
  type AgentArn                = String
  type AgentArnList            = js.Array[AgentArn]
  type AgentList               = js.Array[AgentListEntry]
  type AgentStatus             = String
  type Atime                   = String
  type BytesPerSecond          = Double
  type Duration                = Double
  type Ec2SecurityGroupArn     = String
  type Ec2SecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type Ec2SubnetArn            = String
  type EfsFilesystemArn        = String
  type Gid                     = String
  type IamRoleArn              = String
  type LocationArn             = String
  type LocationList            = js.Array[LocationListEntry]
  type LocationUri             = String
  type LogGroupArn             = String
  type MaxResults              = Int
  type Mtime                   = String
  type NextToken               = String
  type PhaseStatus             = String
  type PosixPermissions        = String
  type PreserveDeletedFiles    = String
  type PreserveDevices         = String
  type S3BucketArn             = String
  type ServerHostname          = String
  type Subdirectory            = String
  type TagKey                  = String
  type TagKeyList              = js.Array[TagKey]
  type TagList                 = js.Array[TagListEntry]
  type TagValue                = String
  type TaggableResourceArn     = String
  type TaskArn                 = String
  type TaskExecutionArn        = String
  type TaskExecutionList       = js.Array[TaskExecutionListEntry]
  type TaskExecutionStatus     = String
  type TaskList                = js.Array[TaskListEntry]
  type TaskStatus              = String
  type Time                    = js.Date
  type Uid                     = String
  type VerifyMode              = String

  implicit final class DataSyncOps(val service: DataSync) extends AnyVal {

    def cancelTaskExecutionFuture(params: CancelTaskExecutionRequest): Future[CancelTaskExecutionResponse] =
      service.cancelTaskExecution(params).promise.toFuture
    def createAgentFuture(params: CreateAgentRequest): Future[CreateAgentResponse] =
      service.createAgent(params).promise.toFuture
    def createLocationEfsFuture(params: CreateLocationEfsRequest): Future[CreateLocationEfsResponse] =
      service.createLocationEfs(params).promise.toFuture
    def createLocationNfsFuture(params: CreateLocationNfsRequest): Future[CreateLocationNfsResponse] =
      service.createLocationNfs(params).promise.toFuture
    def createLocationS3Future(params: CreateLocationS3Request): Future[CreateLocationS3Response] =
      service.createLocationS3(params).promise.toFuture
    def createTaskFuture(params: CreateTaskRequest): Future[CreateTaskResponse] =
      service.createTask(params).promise.toFuture
    def deleteAgentFuture(params: DeleteAgentRequest): Future[DeleteAgentResponse] =
      service.deleteAgent(params).promise.toFuture
    def deleteLocationFuture(params: DeleteLocationRequest): Future[DeleteLocationResponse] =
      service.deleteLocation(params).promise.toFuture
    def deleteTaskFuture(params: DeleteTaskRequest): Future[DeleteTaskResponse] =
      service.deleteTask(params).promise.toFuture
    def describeAgentFuture(params: DescribeAgentRequest): Future[DescribeAgentResponse] =
      service.describeAgent(params).promise.toFuture
    def describeLocationEfsFuture(params: DescribeLocationEfsRequest): Future[DescribeLocationEfsResponse] =
      service.describeLocationEfs(params).promise.toFuture
    def describeLocationNfsFuture(params: DescribeLocationNfsRequest): Future[DescribeLocationNfsResponse] =
      service.describeLocationNfs(params).promise.toFuture
    def describeLocationS3Future(params: DescribeLocationS3Request): Future[DescribeLocationS3Response] =
      service.describeLocationS3(params).promise.toFuture
    def describeTaskExecutionFuture(params: DescribeTaskExecutionRequest): Future[DescribeTaskExecutionResponse] =
      service.describeTaskExecution(params).promise.toFuture
    def describeTaskFuture(params: DescribeTaskRequest): Future[DescribeTaskResponse] =
      service.describeTask(params).promise.toFuture
    def listAgentsFuture(params: ListAgentsRequest): Future[ListAgentsResponse] =
      service.listAgents(params).promise.toFuture
    def listLocationsFuture(params: ListLocationsRequest): Future[ListLocationsResponse] =
      service.listLocations(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listTaskExecutionsFuture(params: ListTaskExecutionsRequest): Future[ListTaskExecutionsResponse] =
      service.listTaskExecutions(params).promise.toFuture
    def listTasksFuture(params: ListTasksRequest): Future[ListTasksResponse] =
      service.listTasks(params).promise.toFuture
    def startTaskExecutionFuture(params: StartTaskExecutionRequest): Future[StartTaskExecutionResponse] =
      service.startTaskExecution(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateAgentFuture(params: UpdateAgentRequest): Future[UpdateAgentResponse] =
      service.updateAgent(params).promise.toFuture
    def updateTaskFuture(params: UpdateTaskRequest): Future[UpdateTaskResponse] =
      service.updateTask(params).promise.toFuture
  }
}

package datasync {
  @js.native
  @JSImport("aws-sdk", "DataSync")
  class DataSync() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelTaskExecution(params: CancelTaskExecutionRequest): Request[CancelTaskExecutionResponse]       = js.native
    def createAgent(params: CreateAgentRequest): Request[CreateAgentResponse]                               = js.native
    def createLocationEfs(params: CreateLocationEfsRequest): Request[CreateLocationEfsResponse]             = js.native
    def createLocationNfs(params: CreateLocationNfsRequest): Request[CreateLocationNfsResponse]             = js.native
    def createLocationS3(params: CreateLocationS3Request): Request[CreateLocationS3Response]                = js.native
    def createTask(params: CreateTaskRequest): Request[CreateTaskResponse]                                  = js.native
    def deleteAgent(params: DeleteAgentRequest): Request[DeleteAgentResponse]                               = js.native
    def deleteLocation(params: DeleteLocationRequest): Request[DeleteLocationResponse]                      = js.native
    def deleteTask(params: DeleteTaskRequest): Request[DeleteTaskResponse]                                  = js.native
    def describeAgent(params: DescribeAgentRequest): Request[DescribeAgentResponse]                         = js.native
    def describeLocationEfs(params: DescribeLocationEfsRequest): Request[DescribeLocationEfsResponse]       = js.native
    def describeLocationNfs(params: DescribeLocationNfsRequest): Request[DescribeLocationNfsResponse]       = js.native
    def describeLocationS3(params: DescribeLocationS3Request): Request[DescribeLocationS3Response]          = js.native
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
  trait AgentListEntry extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var Name: js.UndefOr[TagValue]
    var Status: js.UndefOr[AgentStatus]
  }

  object AgentListEntry {
    def apply(
        AgentArn: js.UndefOr[AgentArn] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        Status: js.UndefOr[AgentStatus] = js.undefined
    ): AgentListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentListEntry]
    }
  }

  object AgentStatusEnum {
    val ONLINE  = "ONLINE"
    val OFFLINE = "OFFLINE"

    val values = IndexedSeq(ONLINE, OFFLINE)
  }

  object AtimeEnum {
    val NONE        = "NONE"
    val BEST_EFFORT = "BEST_EFFORT"

    val values = IndexedSeq(NONE, BEST_EFFORT)
  }

  @js.native
  trait CancelTaskExecutionRequest extends js.Object {
    var TaskExecutionArn: TaskExecutionArn
  }

  object CancelTaskExecutionRequest {
    def apply(
        TaskExecutionArn: TaskExecutionArn
    ): CancelTaskExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskExecutionArn" -> TaskExecutionArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTaskExecutionRequest]
    }
  }

  @js.native
  trait CancelTaskExecutionResponse extends js.Object {}

  object CancelTaskExecutionResponse {
    def apply(
        ): CancelTaskExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTaskExecutionResponse]
    }
  }

  @js.native
  trait CreateAgentRequest extends js.Object {
    var ActivationKey: ActivationKey
    var AgentName: js.UndefOr[TagValue]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAgentRequest {
    def apply(
        ActivationKey: ActivationKey,
        AgentName: js.UndefOr[TagValue] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationKey" -> ActivationKey.asInstanceOf[js.Any],
        "AgentName" -> AgentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAgentRequest]
    }
  }

  @js.native
  trait CreateAgentResponse extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
  }

  object CreateAgentResponse {
    def apply(
        AgentArn: js.UndefOr[AgentArn] = js.undefined
    ): CreateAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAgentResponse]
    }
  }

  @js.native
  trait CreateLocationEfsRequest extends js.Object {
    var Ec2Config: Ec2Config
    var EfsFilesystemArn: EfsFilesystemArn
    var Subdirectory: Subdirectory
    var Tags: js.UndefOr[TagList]
  }

  object CreateLocationEfsRequest {
    def apply(
        Ec2Config: Ec2Config,
        EfsFilesystemArn: EfsFilesystemArn,
        Subdirectory: Subdirectory,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateLocationEfsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ec2Config"        -> Ec2Config.asInstanceOf[js.Any],
        "EfsFilesystemArn" -> EfsFilesystemArn.asInstanceOf[js.Any],
        "Subdirectory"     -> Subdirectory.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationEfsRequest]
    }
  }

  /**
    * CreateLocationEfs
    */
  @js.native
  trait CreateLocationEfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationEfsResponse {
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationEfsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationEfsResponse]
    }
  }

  @js.native
  trait CreateLocationNfsRequest extends js.Object {
    var OnPremConfig: OnPremConfig
    var ServerHostname: ServerHostname
    var Subdirectory: Subdirectory
    var Tags: js.UndefOr[TagList]
  }

  object CreateLocationNfsRequest {
    def apply(
        OnPremConfig: OnPremConfig,
        ServerHostname: ServerHostname,
        Subdirectory: Subdirectory,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateLocationNfsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OnPremConfig"   -> OnPremConfig.asInstanceOf[js.Any],
        "ServerHostname" -> ServerHostname.asInstanceOf[js.Any],
        "Subdirectory"   -> Subdirectory.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationNfsRequest]
    }
  }

  @js.native
  trait CreateLocationNfsResponse extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationNfsResponse {
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationNfsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationNfsResponse]
    }
  }

  @js.native
  trait CreateLocationS3Request extends js.Object {
    var S3BucketArn: S3BucketArn
    var S3Config: S3Config
    var Subdirectory: Subdirectory
    var Tags: js.UndefOr[TagList]
  }

  object CreateLocationS3Request {
    def apply(
        S3BucketArn: S3BucketArn,
        S3Config: S3Config,
        Subdirectory: Subdirectory,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateLocationS3Request = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3BucketArn"  -> S3BucketArn.asInstanceOf[js.Any],
        "S3Config"     -> S3Config.asInstanceOf[js.Any],
        "Subdirectory" -> Subdirectory.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationS3Request]
    }
  }

  @js.native
  trait CreateLocationS3Response extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
  }

  object CreateLocationS3Response {
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined
    ): CreateLocationS3Response = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLocationS3Response]
    }
  }

  @js.native
  trait CreateTaskRequest extends js.Object {
    var DestinationLocationArn: LocationArn
    var SourceLocationArn: LocationArn
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTaskRequest {
    def apply(
        DestinationLocationArn: LocationArn,
        SourceLocationArn: LocationArn,
        CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        Options: js.UndefOr[Options] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationLocationArn" -> DestinationLocationArn.asInstanceOf[js.Any],
        "SourceLocationArn"      -> SourceLocationArn.asInstanceOf[js.Any],
        "CloudWatchLogGroupArn" -> CloudWatchLogGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Options" -> Options.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTaskRequest]
    }
  }

  @js.native
  trait CreateTaskResponse extends js.Object {
    var TaskArn: js.UndefOr[TaskArn]
  }

  object CreateTaskResponse {
    def apply(
        TaskArn: js.UndefOr[TaskArn] = js.undefined
    ): CreateTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTaskResponse]
    }
  }

  @js.native
  trait DeleteAgentRequest extends js.Object {
    var AgentArn: AgentArn
  }

  object DeleteAgentRequest {
    def apply(
        AgentArn: AgentArn
    ): DeleteAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAgentRequest]
    }
  }

  @js.native
  trait DeleteAgentResponse extends js.Object {}

  object DeleteAgentResponse {
    def apply(
        ): DeleteAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAgentResponse]
    }
  }

  /**
    * DeleteLocation
    */
  @js.native
  trait DeleteLocationRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DeleteLocationRequest {
    def apply(
        LocationArn: LocationArn
    ): DeleteLocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLocationRequest]
    }
  }

  @js.native
  trait DeleteLocationResponse extends js.Object {}

  object DeleteLocationResponse {
    def apply(
        ): DeleteLocationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLocationResponse]
    }
  }

  /**
    * DeleteTask
    */
  @js.native
  trait DeleteTaskRequest extends js.Object {
    var TaskArn: TaskArn
  }

  object DeleteTaskRequest {
    def apply(
        TaskArn: TaskArn
    ): DeleteTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTaskRequest]
    }
  }

  @js.native
  trait DeleteTaskResponse extends js.Object {}

  object DeleteTaskResponse {
    def apply(
        ): DeleteTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTaskResponse]
    }
  }

  /**
    * DescribeAgent
    */
  @js.native
  trait DescribeAgentRequest extends js.Object {
    var AgentArn: AgentArn
  }

  object DescribeAgentRequest {
    def apply(
        AgentArn: AgentArn
    ): DescribeAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentRequest]
    }
  }

  @js.native
  trait DescribeAgentResponse extends js.Object {
    var AgentArn: js.UndefOr[AgentArn]
    var CreationTime: js.UndefOr[Time]
    var LastConnectionTime: js.UndefOr[Time]
    var Name: js.UndefOr[TagValue]
    var Status: js.UndefOr[AgentStatus]
  }

  object DescribeAgentResponse {
    def apply(
        AgentArn: js.UndefOr[AgentArn] = js.undefined,
        CreationTime: js.UndefOr[Time] = js.undefined,
        LastConnectionTime: js.UndefOr[Time] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        Status: js.UndefOr[AgentStatus] = js.undefined
    ): DescribeAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastConnectionTime" -> LastConnectionTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentResponse]
    }
  }

  @js.native
  trait DescribeLocationEfsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationEfsRequest {
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationEfsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationEfsRequest]
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
    def apply(
        CreationTime: js.UndefOr[Time] = js.undefined,
        Ec2Config: js.UndefOr[Ec2Config] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined
    ): DescribeLocationEfsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2Config" -> Ec2Config.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationArn" -> LocationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationUri" -> LocationUri.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationEfsResponse]
    }
  }

  @js.native
  trait DescribeLocationNfsRequest extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationNfsRequest {
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationNfsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationNfsRequest]
    }
  }

  @js.native
  trait DescribeLocationNfsResponse extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var OnPremConfig: js.UndefOr[OnPremConfig]
  }

  object DescribeLocationNfsResponse {
    def apply(
        CreationTime: js.UndefOr[Time] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        OnPremConfig: js.UndefOr[OnPremConfig] = js.undefined
    ): DescribeLocationNfsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationArn" -> LocationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationUri" -> LocationUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OnPremConfig" -> OnPremConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationNfsResponse]
    }
  }

  @js.native
  trait DescribeLocationS3Request extends js.Object {
    var LocationArn: LocationArn
  }

  object DescribeLocationS3Request {
    def apply(
        LocationArn: LocationArn
    ): DescribeLocationS3Request = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationS3Request]
    }
  }

  @js.native
  trait DescribeLocationS3Response extends js.Object {
    var CreationTime: js.UndefOr[Time]
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
    var S3Config: js.UndefOr[S3Config]
  }

  object DescribeLocationS3Response {
    def apply(
        CreationTime: js.UndefOr[Time] = js.undefined,
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined,
        S3Config: js.UndefOr[S3Config] = js.undefined
    ): DescribeLocationS3Response = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationArn" -> LocationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationUri" -> LocationUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Config" -> S3Config.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLocationS3Response]
    }
  }

  @js.native
  trait DescribeTaskExecutionRequest extends js.Object {
    var TaskExecutionArn: TaskExecutionArn
  }

  object DescribeTaskExecutionRequest {
    def apply(
        TaskExecutionArn: TaskExecutionArn
    ): DescribeTaskExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskExecutionArn" -> TaskExecutionArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskExecutionRequest]
    }
  }

  @js.native
  trait DescribeTaskExecutionResponse extends js.Object {
    var BytesTransferred: js.UndefOr[Double]
    var BytesWritten: js.UndefOr[Double]
    var EstimatedBytesToTransfer: js.UndefOr[Double]
    var EstimatedFilesToTransfer: js.UndefOr[Double]
    var FilesTransferred: js.UndefOr[Double]
    var Options: js.UndefOr[Options]
    var Result: js.UndefOr[TaskExecutionResultDetail]
    var StartTime: js.UndefOr[Time]
    var Status: js.UndefOr[TaskExecutionStatus]
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object DescribeTaskExecutionResponse {
    def apply(
        BytesTransferred: js.UndefOr[Double] = js.undefined,
        BytesWritten: js.UndefOr[Double] = js.undefined,
        EstimatedBytesToTransfer: js.UndefOr[Double] = js.undefined,
        EstimatedFilesToTransfer: js.UndefOr[Double] = js.undefined,
        FilesTransferred: js.UndefOr[Double] = js.undefined,
        Options: js.UndefOr[Options] = js.undefined,
        Result: js.UndefOr[TaskExecutionResultDetail] = js.undefined,
        StartTime: js.UndefOr[Time] = js.undefined,
        Status: js.UndefOr[TaskExecutionStatus] = js.undefined,
        TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
    ): DescribeTaskExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesTransferred" -> BytesTransferred.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BytesWritten" -> BytesWritten.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EstimatedBytesToTransfer" -> EstimatedBytesToTransfer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EstimatedFilesToTransfer" -> EstimatedFilesToTransfer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilesTransferred" -> FilesTransferred.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Options" -> Options.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Result" -> Result.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TaskExecutionArn" -> TaskExecutionArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskExecutionResponse]
    }
  }

  @js.native
  trait DescribeTaskRequest extends js.Object {
    var TaskArn: TaskArn
  }

  object DescribeTaskRequest {
    def apply(
        TaskArn: TaskArn
    ): DescribeTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskRequest]
    }
  }

  @js.native
  trait DescribeTaskResponse extends js.Object {
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn]
    var CreationTime: js.UndefOr[Time]
    var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn]
    var DestinationLocationArn: js.UndefOr[LocationArn]
    var ErrorCode: js.UndefOr[String]
    var ErrorDetail: js.UndefOr[String]
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
    var SourceLocationArn: js.UndefOr[LocationArn]
    var Status: js.UndefOr[TaskStatus]
    var TaskArn: js.UndefOr[TaskArn]
  }

  object DescribeTaskResponse {
    def apply(
        CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined,
        CreationTime: js.UndefOr[Time] = js.undefined,
        CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined,
        DestinationLocationArn: js.UndefOr[LocationArn] = js.undefined,
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorDetail: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        Options: js.UndefOr[Options] = js.undefined,
        SourceLocationArn: js.UndefOr[LocationArn] = js.undefined,
        Status: js.UndefOr[TaskStatus] = js.undefined,
        TaskArn: js.UndefOr[TaskArn] = js.undefined
    ): DescribeTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogGroupArn" -> CloudWatchLogGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentTaskExecutionArn" -> CurrentTaskExecutionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DestinationLocationArn" -> DestinationLocationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorDetail" -> ErrorDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Options" -> Options.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceLocationArn" -> SourceLocationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TaskArn" -> TaskArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTaskResponse]
    }
  }

  /**
    * The subnet and the security group that the target Amazon EFS file system uses. The subnet must have at least one mount target for that file system. The security group that you provide needs to be able to communicate with the security group on the mount target in the subnet specified.
    *  The exact relationship between security group M (of the mount target) and security group S (which you provide for DataSync to use at this stage) is as follows:
    * * Security group M (which you associate with the mount target) must allow inbound access for the Transmission Control Protocol (TCP) on the NFS port (2049) from security group S. You can enable inbound connections either by IP address (CIDR range) or security group.
    *  * Security group S (provided to DataSync to access EFS) should have a rule that enables outbound connections to the NFS port on one of the file system’s mount targets. You can enable outbound connections either by IP address (CIDR range) or security group. For information about security groups and mount targets, see [[https://docs.aws.amazon.com/efs/latest/ug/security-considerations.html#network-access|Security Groups for Amazon EC2 Instances and Mount Targets]] in the <i>Amazon EFS User Guide.</i>
    */
  @js.native
  trait Ec2Config extends js.Object {
    var SecurityGroupArns: Ec2SecurityGroupArnList
    var SubnetArn: Ec2SubnetArn
  }

  object Ec2Config {
    def apply(
        SecurityGroupArns: Ec2SecurityGroupArnList,
        SubnetArn: Ec2SubnetArn
    ): Ec2Config = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupArns" -> SecurityGroupArns.asInstanceOf[js.Any],
        "SubnetArn"         -> SubnetArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ec2Config]
    }
  }

  object GidEnum {
    val NONE      = "NONE"
    val INT_VALUE = "INT_VALUE"
    val NAME      = "NAME"
    val BOTH      = "BOTH"

    val values = IndexedSeq(NONE, INT_VALUE, NAME, BOTH)
  }

  @js.native
  trait ListAgentsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgentsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAgentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAgentsRequest]
    }
  }

  @js.native
  trait ListAgentsResponse extends js.Object {
    var Agents: js.UndefOr[AgentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgentsResponse {
    def apply(
        Agents: js.UndefOr[AgentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAgentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Agents" -> Agents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAgentsResponse]
    }
  }

  @js.native
  trait ListLocationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLocationsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocationsRequest]
    }
  }

  @js.native
  trait ListLocationsResponse extends js.Object {
    var Locations: js.UndefOr[LocationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLocationsResponse {
    def apply(
        Locations: js.UndefOr[LocationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLocationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Locations" -> Locations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: TaggableResourceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: TaggableResourceArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * ListTaskExecutions
    */
  @js.native
  trait ListTaskExecutionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TaskArn: js.UndefOr[TaskArn]
  }

  object ListTaskExecutionsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TaskArn: js.UndefOr[TaskArn] = js.undefined
    ): ListTaskExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TaskArn" -> TaskArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskExecutionsRequest]
    }
  }

  @js.native
  trait ListTaskExecutionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TaskExecutions: js.UndefOr[TaskExecutionList]
  }

  object ListTaskExecutionsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TaskExecutions: js.UndefOr[TaskExecutionList] = js.undefined
    ): ListTaskExecutionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TaskExecutions" -> TaskExecutions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTaskExecutionsResponse]
    }
  }

  @js.native
  trait ListTasksRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTasksRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksRequest]
    }
  }

  @js.native
  trait ListTasksResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tasks: js.UndefOr[TaskList]
  }

  object ListTasksResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tasks: js.UndefOr[TaskList] = js.undefined
    ): ListTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tasks" -> Tasks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTasksResponse]
    }
  }

  /**
    * Represents a single entry in a list of locations. <code>LocationListEntry</code> returns an array that contains a list of locations when the <a>ListLocations</a> operation is called.
    */
  @js.native
  trait LocationListEntry extends js.Object {
    var LocationArn: js.UndefOr[LocationArn]
    var LocationUri: js.UndefOr[LocationUri]
  }

  object LocationListEntry {
    def apply(
        LocationArn: js.UndefOr[LocationArn] = js.undefined,
        LocationUri: js.UndefOr[LocationUri] = js.undefined
    ): LocationListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationArn" -> LocationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationUri" -> LocationUri.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocationListEntry]
    }
  }

  object MtimeEnum {
    val NONE     = "NONE"
    val PRESERVE = "PRESERVE"

    val values = IndexedSeq(NONE, PRESERVE)
  }

  /**
    * A list of Amazon Resource Names (ARNs) of agents to use for a Network File System (NFS) location.
    */
  @js.native
  trait OnPremConfig extends js.Object {
    var AgentArns: AgentArnList
  }

  object OnPremConfig {
    def apply(
        AgentArns: AgentArnList
    ): OnPremConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArns" -> AgentArns.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OnPremConfig]
    }
  }

  /**
    * Represents the options that are available to control the behavior of a <a>StartTaskExecution</a> operation. Behavior includes preserving metadata such as user ID (UID), group ID (GID), and file permissions, and also overwriting files in the destination, data integrity verification, and so on.
    *  A task has a set of default options associated with it. If you don't specify an option in <a>StartTaskExecution</a>, the default value is used. You can override the defaults options on each task execution by specifying an overriding <code>Options</code> value to <a>StartTaskExecution</a>.
    */
  @js.native
  trait Options extends js.Object {
    var Atime: js.UndefOr[Atime]
    var BytesPerSecond: js.UndefOr[BytesPerSecond]
    var Gid: js.UndefOr[Gid]
    var Mtime: js.UndefOr[Mtime]
    var PosixPermissions: js.UndefOr[PosixPermissions]
    var PreserveDeletedFiles: js.UndefOr[PreserveDeletedFiles]
    var PreserveDevices: js.UndefOr[PreserveDevices]
    var Uid: js.UndefOr[Uid]
    var VerifyMode: js.UndefOr[VerifyMode]
  }

  object Options {
    def apply(
        Atime: js.UndefOr[Atime] = js.undefined,
        BytesPerSecond: js.UndefOr[BytesPerSecond] = js.undefined,
        Gid: js.UndefOr[Gid] = js.undefined,
        Mtime: js.UndefOr[Mtime] = js.undefined,
        PosixPermissions: js.UndefOr[PosixPermissions] = js.undefined,
        PreserveDeletedFiles: js.UndefOr[PreserveDeletedFiles] = js.undefined,
        PreserveDevices: js.UndefOr[PreserveDevices] = js.undefined,
        Uid: js.UndefOr[Uid] = js.undefined,
        VerifyMode: js.UndefOr[VerifyMode] = js.undefined
    ): Options = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Atime" -> Atime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BytesPerSecond" -> BytesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Gid" -> Gid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Mtime" -> Mtime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PosixPermissions" -> PosixPermissions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreserveDeletedFiles" -> PreserveDeletedFiles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreserveDevices" -> PreserveDevices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Uid" -> Uid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerifyMode" -> VerifyMode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Options]
    }
  }

  object PhaseStatusEnum {
    val PENDING = "PENDING"
    val SUCCESS = "SUCCESS"
    val ERROR   = "ERROR"

    val values = IndexedSeq(PENDING, SUCCESS, ERROR)
  }

  object PosixPermissionsEnum {
    val NONE        = "NONE"
    val BEST_EFFORT = "BEST_EFFORT"
    val PRESERVE    = "PRESERVE"

    val values = IndexedSeq(NONE, BEST_EFFORT, PRESERVE)
  }

  object PreserveDeletedFilesEnum {
    val PRESERVE = "PRESERVE"
    val REMOVE   = "REMOVE"

    val values = IndexedSeq(PRESERVE, REMOVE)
  }

  object PreserveDevicesEnum {
    val NONE     = "NONE"
    val PRESERVE = "PRESERVE"

    val values = IndexedSeq(NONE, PRESERVE)
  }

  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is used to access an Amazon S3 bucket. For detailed information about using such a role, see [[https://alpha-aws-docs.aws.amazon.com/sync-service/latest/userguide/create-locations-cli.html#create-location-s3-cli|Components and Terminology]] in the <i>AWS DataSync User Guide</i>.
    */
  @js.native
  trait S3Config extends js.Object {
    var BucketAccessRoleArn: IamRoleArn
  }

  object S3Config {
    def apply(
        BucketAccessRoleArn: IamRoleArn
    ): S3Config = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketAccessRoleArn" -> BucketAccessRoleArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Config]
    }
  }

  @js.native
  trait StartTaskExecutionRequest extends js.Object {
    var TaskArn: TaskArn
    var OverrideOptions: js.UndefOr[Options]
  }

  object StartTaskExecutionRequest {
    def apply(
        TaskArn: TaskArn,
        OverrideOptions: js.UndefOr[Options] = js.undefined
    ): StartTaskExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.asInstanceOf[js.Any],
        "OverrideOptions" -> OverrideOptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskExecutionRequest]
    }
  }

  @js.native
  trait StartTaskExecutionResponse extends js.Object {
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object StartTaskExecutionResponse {
    def apply(
        TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
    ): StartTaskExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskExecutionArn" -> TaskExecutionArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTaskExecutionResponse]
    }
  }

  /**
    * Represents a single entry in a list of AWS resource tags. <code>TagListEntry</code> returns an array that contains a list of tasks when the <a>ListTagsForResource</a> operation is called.
    */
  @js.native
  trait TagListEntry extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object TagListEntry {
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): TagListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagListEntry]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: TaggableResourceArn
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: TaggableResourceArn,
        Tags: TagList
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Represents a single entry in a list of task executions. <code>TaskExecutionListEntry</code> returns an array that contains a list of specific invocations of a task when <a>ListTaskExecutions</a> operation is called.
    */
  @js.native
  trait TaskExecutionListEntry extends js.Object {
    var Status: js.UndefOr[TaskExecutionStatus]
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn]
  }

  object TaskExecutionListEntry {
    def apply(
        Status: js.UndefOr[TaskExecutionStatus] = js.undefined,
        TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
    ): TaskExecutionListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TaskExecutionArn" -> TaskExecutionArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskExecutionListEntry]
    }
  }

  /**
    * Describes the detailed result of a <code>TaskExecution</code> operation. This result includes the time in milliseconds spent in each phase, the status of the task execution, and the errors encountered.
    */
  @js.native
  trait TaskExecutionResultDetail extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorDetail: js.UndefOr[String]
    var PrepareDuration: js.UndefOr[Duration]
    var PrepareStatus: js.UndefOr[PhaseStatus]
    var TransferDuration: js.UndefOr[Duration]
    var TransferStatus: js.UndefOr[PhaseStatus]
    var VerifyDuration: js.UndefOr[Duration]
    var VerifyStatus: js.UndefOr[PhaseStatus]
  }

  object TaskExecutionResultDetail {
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorDetail: js.UndefOr[String] = js.undefined,
        PrepareDuration: js.UndefOr[Duration] = js.undefined,
        PrepareStatus: js.UndefOr[PhaseStatus] = js.undefined,
        TransferDuration: js.UndefOr[Duration] = js.undefined,
        TransferStatus: js.UndefOr[PhaseStatus] = js.undefined,
        VerifyDuration: js.UndefOr[Duration] = js.undefined,
        VerifyStatus: js.UndefOr[PhaseStatus] = js.undefined
    ): TaskExecutionResultDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorDetail" -> ErrorDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrepareDuration" -> PrepareDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrepareStatus" -> PrepareStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TransferDuration" -> TransferDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TransferStatus" -> TransferStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerifyDuration" -> VerifyDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerifyStatus" -> VerifyStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskExecutionResultDetail]
    }
  }

  object TaskExecutionStatusEnum {
    val LAUNCHING    = "LAUNCHING"
    val PREPARING    = "PREPARING"
    val TRANSFERRING = "TRANSFERRING"
    val VERIFYING    = "VERIFYING"
    val SUCCESS      = "SUCCESS"
    val ERROR        = "ERROR"

    val values = IndexedSeq(LAUNCHING, PREPARING, TRANSFERRING, VERIFYING, SUCCESS, ERROR)
  }

  /**
    * Represents a single entry in a list of tasks. <code>TaskListEntry</code> returns an array that contains a list of tasks when the <a>ListTasks</a> operation is called. A task includes the source and destination file systems to sync and the options to use for the tasks.
    */
  @js.native
  trait TaskListEntry extends js.Object {
    var Name: js.UndefOr[TagValue]
    var Status: js.UndefOr[TaskStatus]
    var TaskArn: js.UndefOr[TaskArn]
  }

  object TaskListEntry {
    def apply(
        Name: js.UndefOr[TagValue] = js.undefined,
        Status: js.UndefOr[TaskStatus] = js.undefined,
        TaskArn: js.UndefOr[TaskArn] = js.undefined
    ): TaskListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TaskArn" -> TaskArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskListEntry]
    }
  }

  object TaskStatusEnum {
    val AVAILABLE   = "AVAILABLE"
    val CREATING    = "CREATING"
    val RUNNING     = "RUNNING"
    val UNAVAILABLE = "UNAVAILABLE"

    val values = IndexedSeq(AVAILABLE, CREATING, RUNNING, UNAVAILABLE)
  }

  object UidEnum {
    val NONE      = "NONE"
    val INT_VALUE = "INT_VALUE"
    val NAME      = "NAME"
    val BOTH      = "BOTH"

    val values = IndexedSeq(NONE, INT_VALUE, NAME, BOTH)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Keys: TagKeyList
    var ResourceArn: TaggableResourceArn
  }

  object UntagResourceRequest {
    def apply(
        Keys: TagKeyList,
        ResourceArn: TaggableResourceArn
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Keys"        -> Keys.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAgentRequest extends js.Object {
    var AgentArn: AgentArn
    var Name: js.UndefOr[TagValue]
  }

  object UpdateAgentRequest {
    def apply(
        AgentArn: AgentArn,
        Name: js.UndefOr[TagValue] = js.undefined
    ): UpdateAgentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentArn" -> AgentArn.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAgentRequest]
    }
  }

  @js.native
  trait UpdateAgentResponse extends js.Object {}

  object UpdateAgentResponse {
    def apply(
        ): UpdateAgentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAgentResponse]
    }
  }

  /**
    * UpdateTaskResponse
    */
  @js.native
  trait UpdateTaskRequest extends js.Object {
    var TaskArn: TaskArn
    var Name: js.UndefOr[TagValue]
    var Options: js.UndefOr[Options]
  }

  object UpdateTaskRequest {
    def apply(
        TaskArn: TaskArn,
        Name: js.UndefOr[TagValue] = js.undefined,
        Options: js.UndefOr[Options] = js.undefined
    ): UpdateTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskArn" -> TaskArn.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Options" -> Options.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTaskRequest]
    }
  }

  @js.native
  trait UpdateTaskResponse extends js.Object {}

  object UpdateTaskResponse {
    def apply(
        ): UpdateTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTaskResponse]
    }
  }

  object VerifyModeEnum {
    val POINT_IN_TIME_CONSISTENT = "POINT_IN_TIME_CONSISTENT"
    val NONE                     = "NONE"

    val values = IndexedSeq(POINT_IN_TIME_CONSISTENT, NONE)
  }
}
