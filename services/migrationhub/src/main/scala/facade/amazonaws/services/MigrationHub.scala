package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object migrationhub {
  type ApplicationId                   = String
  type ApplicationIds                  = js.Array[ApplicationId]
  type ApplicationStateList            = js.Array[ApplicationState]
  type ApplicationStatus               = String
  type ConfigurationId                 = String
  type CreatedArtifactDescription      = String
  type CreatedArtifactList             = js.Array[CreatedArtifact]
  type CreatedArtifactName             = String
  type DiscoveredResourceDescription   = String
  type DiscoveredResourceList          = js.Array[DiscoveredResource]
  type DryRun                          = Boolean
  type LatestResourceAttributeList     = js.Array[ResourceAttribute]
  type MaxResults                      = Int
  type MaxResultsCreatedArtifacts      = Int
  type MaxResultsResources             = Int
  type MigrationTaskName               = String
  type MigrationTaskSummaryList        = js.Array[MigrationTaskSummary]
  type NextUpdateSeconds               = Int
  type ProgressPercent                 = Int
  type ProgressUpdateStream            = String
  type ProgressUpdateStreamSummaryList = js.Array[ProgressUpdateStreamSummary]
  type ResourceAttributeList           = js.Array[ResourceAttribute]
  type ResourceAttributeType           = String
  type ResourceAttributeValue          = String
  type ResourceName                    = String
  type Status                          = String
  type StatusDetail                    = String
  type Token                           = String
  type UpdateDateTime                  = js.Date

  implicit final class MigrationHubOps(private val service: MigrationHub) extends AnyVal {

    @inline def associateCreatedArtifactFuture(
        params: AssociateCreatedArtifactRequest
    ): Future[AssociateCreatedArtifactResult] = service.associateCreatedArtifact(params).promise.toFuture
    @inline def associateDiscoveredResourceFuture(
        params: AssociateDiscoveredResourceRequest
    ): Future[AssociateDiscoveredResourceResult] = service.associateDiscoveredResource(params).promise.toFuture
    @inline def createProgressUpdateStreamFuture(
        params: CreateProgressUpdateStreamRequest
    ): Future[CreateProgressUpdateStreamResult] = service.createProgressUpdateStream(params).promise.toFuture
    @inline def deleteProgressUpdateStreamFuture(
        params: DeleteProgressUpdateStreamRequest
    ): Future[DeleteProgressUpdateStreamResult] = service.deleteProgressUpdateStream(params).promise.toFuture
    @inline def describeApplicationStateFuture(
        params: DescribeApplicationStateRequest
    ): Future[DescribeApplicationStateResult] = service.describeApplicationState(params).promise.toFuture
    @inline def describeMigrationTaskFuture(params: DescribeMigrationTaskRequest): Future[DescribeMigrationTaskResult] =
      service.describeMigrationTask(params).promise.toFuture
    @inline def disassociateCreatedArtifactFuture(
        params: DisassociateCreatedArtifactRequest
    ): Future[DisassociateCreatedArtifactResult] = service.disassociateCreatedArtifact(params).promise.toFuture
    @inline def disassociateDiscoveredResourceFuture(
        params: DisassociateDiscoveredResourceRequest
    ): Future[DisassociateDiscoveredResourceResult] = service.disassociateDiscoveredResource(params).promise.toFuture
    @inline def importMigrationTaskFuture(params: ImportMigrationTaskRequest): Future[ImportMigrationTaskResult] =
      service.importMigrationTask(params).promise.toFuture
    @inline def listApplicationStatesFuture(params: ListApplicationStatesRequest): Future[ListApplicationStatesResult] =
      service.listApplicationStates(params).promise.toFuture
    @inline def listCreatedArtifactsFuture(params: ListCreatedArtifactsRequest): Future[ListCreatedArtifactsResult] =
      service.listCreatedArtifacts(params).promise.toFuture
    @inline def listDiscoveredResourcesFuture(
        params: ListDiscoveredResourcesRequest
    ): Future[ListDiscoveredResourcesResult] = service.listDiscoveredResources(params).promise.toFuture
    @inline def listMigrationTasksFuture(params: ListMigrationTasksRequest): Future[ListMigrationTasksResult] =
      service.listMigrationTasks(params).promise.toFuture
    @inline def listProgressUpdateStreamsFuture(
        params: ListProgressUpdateStreamsRequest
    ): Future[ListProgressUpdateStreamsResult] = service.listProgressUpdateStreams(params).promise.toFuture
    @inline def notifyApplicationStateFuture(
        params: NotifyApplicationStateRequest
    ): Future[NotifyApplicationStateResult] = service.notifyApplicationState(params).promise.toFuture
    @inline def notifyMigrationTaskStateFuture(
        params: NotifyMigrationTaskStateRequest
    ): Future[NotifyMigrationTaskStateResult] = service.notifyMigrationTaskState(params).promise.toFuture
    @inline def putResourceAttributesFuture(params: PutResourceAttributesRequest): Future[PutResourceAttributesResult] =
      service.putResourceAttributes(params).promise.toFuture
  }
}

package migrationhub {
  @js.native
  @JSImport("aws-sdk", "MigrationHub")
  class MigrationHub() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateCreatedArtifact(params: AssociateCreatedArtifactRequest): Request[AssociateCreatedArtifactResult] =
      js.native
    def associateDiscoveredResource(
        params: AssociateDiscoveredResourceRequest
    ): Request[AssociateDiscoveredResourceResult] = js.native
    def createProgressUpdateStream(
        params: CreateProgressUpdateStreamRequest
    ): Request[CreateProgressUpdateStreamResult] = js.native
    def deleteProgressUpdateStream(
        params: DeleteProgressUpdateStreamRequest
    ): Request[DeleteProgressUpdateStreamResult] = js.native
    def describeApplicationState(params: DescribeApplicationStateRequest): Request[DescribeApplicationStateResult] =
      js.native
    def describeMigrationTask(params: DescribeMigrationTaskRequest): Request[DescribeMigrationTaskResult] = js.native
    def disassociateCreatedArtifact(
        params: DisassociateCreatedArtifactRequest
    ): Request[DisassociateCreatedArtifactResult] = js.native
    def disassociateDiscoveredResource(
        params: DisassociateDiscoveredResourceRequest
    ): Request[DisassociateDiscoveredResourceResult]                                                      = js.native
    def importMigrationTask(params: ImportMigrationTaskRequest): Request[ImportMigrationTaskResult]       = js.native
    def listApplicationStates(params: ListApplicationStatesRequest): Request[ListApplicationStatesResult] = js.native
    def listCreatedArtifacts(params: ListCreatedArtifactsRequest): Request[ListCreatedArtifactsResult]    = js.native
    def listDiscoveredResources(params: ListDiscoveredResourcesRequest): Request[ListDiscoveredResourcesResult] =
      js.native
    def listMigrationTasks(params: ListMigrationTasksRequest): Request[ListMigrationTasksResult] = js.native
    def listProgressUpdateStreams(params: ListProgressUpdateStreamsRequest): Request[ListProgressUpdateStreamsResult] =
      js.native
    def notifyApplicationState(params: NotifyApplicationStateRequest): Request[NotifyApplicationStateResult] = js.native
    def notifyMigrationTaskState(params: NotifyMigrationTaskStateRequest): Request[NotifyMigrationTaskStateResult] =
      js.native
    def putResourceAttributes(params: PutResourceAttributesRequest): Request[PutResourceAttributesResult] = js.native
  }

  /**
    * The state of an application discovered through Migration Hub import, the AWS Agentless Discovery Connector, or the AWS Application Discovery Agent.
    */
  @js.native
  trait ApplicationState extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
    var LastUpdatedTime: js.UndefOr[UpdateDateTime]
  }

  object ApplicationState {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        ApplicationStatus: js.UndefOr[ApplicationStatus] = js.undefined,
        LastUpdatedTime: js.UndefOr[UpdateDateTime] = js.undefined
    ): ApplicationState = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ApplicationStatus.foreach(__v => __obj.updateDynamic("ApplicationStatus")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationState]
    }
  }

  object ApplicationStatusEnum {
    val NOT_STARTED = "NOT_STARTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED   = "COMPLETED"

    val values = js.Object.freeze(js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED))
  }

  @js.native
  trait AssociateCreatedArtifactRequest extends js.Object {
    var CreatedArtifact: CreatedArtifact
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  object AssociateCreatedArtifactRequest {
    @inline
    def apply(
        CreatedArtifact: CreatedArtifact,
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): AssociateCreatedArtifactRequest = {
      val __obj = js.Dynamic.literal(
        "CreatedArtifact"      -> CreatedArtifact.asInstanceOf[js.Any],
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateCreatedArtifactRequest]
    }
  }

  @js.native
  trait AssociateCreatedArtifactResult extends js.Object {}

  object AssociateCreatedArtifactResult {
    @inline
    def apply(
        ): AssociateCreatedArtifactResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateCreatedArtifactResult]
    }
  }

  @js.native
  trait AssociateDiscoveredResourceRequest extends js.Object {
    var DiscoveredResource: DiscoveredResource
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  object AssociateDiscoveredResourceRequest {
    @inline
    def apply(
        DiscoveredResource: DiscoveredResource,
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): AssociateDiscoveredResourceRequest = {
      val __obj = js.Dynamic.literal(
        "DiscoveredResource"   -> DiscoveredResource.asInstanceOf[js.Any],
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateDiscoveredResourceRequest]
    }
  }

  @js.native
  trait AssociateDiscoveredResourceResult extends js.Object {}

  object AssociateDiscoveredResourceResult {
    @inline
    def apply(
        ): AssociateDiscoveredResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateDiscoveredResourceResult]
    }
  }

  @js.native
  trait CreateProgressUpdateStreamRequest extends js.Object {
    var ProgressUpdateStreamName: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  object CreateProgressUpdateStreamRequest {
    @inline
    def apply(
        ProgressUpdateStreamName: ProgressUpdateStream,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): CreateProgressUpdateStreamRequest = {
      val __obj = js.Dynamic.literal(
        "ProgressUpdateStreamName" -> ProgressUpdateStreamName.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProgressUpdateStreamRequest]
    }
  }

  @js.native
  trait CreateProgressUpdateStreamResult extends js.Object {}

  object CreateProgressUpdateStreamResult {
    @inline
    def apply(
        ): CreateProgressUpdateStreamResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateProgressUpdateStreamResult]
    }
  }

  /**
    * An ARN of the AWS cloud resource target receiving the migration (e.g., AMI, EC2 instance, RDS instance, etc.).
    */
  @js.native
  trait CreatedArtifact extends js.Object {
    var Name: CreatedArtifactName
    var Description: js.UndefOr[CreatedArtifactDescription]
  }

  object CreatedArtifact {
    @inline
    def apply(
        Name: CreatedArtifactName,
        Description: js.UndefOr[CreatedArtifactDescription] = js.undefined
    ): CreatedArtifact = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatedArtifact]
    }
  }

  @js.native
  trait DeleteProgressUpdateStreamRequest extends js.Object {
    var ProgressUpdateStreamName: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  object DeleteProgressUpdateStreamRequest {
    @inline
    def apply(
        ProgressUpdateStreamName: ProgressUpdateStream,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): DeleteProgressUpdateStreamRequest = {
      val __obj = js.Dynamic.literal(
        "ProgressUpdateStreamName" -> ProgressUpdateStreamName.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProgressUpdateStreamRequest]
    }
  }

  @js.native
  trait DeleteProgressUpdateStreamResult extends js.Object {}

  object DeleteProgressUpdateStreamResult {
    @inline
    def apply(
        ): DeleteProgressUpdateStreamResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteProgressUpdateStreamResult]
    }
  }

  @js.native
  trait DescribeApplicationStateRequest extends js.Object {
    var ApplicationId: ApplicationId
  }

  object DescribeApplicationStateRequest {
    @inline
    def apply(
        ApplicationId: ApplicationId
    ): DescribeApplicationStateRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeApplicationStateRequest]
    }
  }

  @js.native
  trait DescribeApplicationStateResult extends js.Object {
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
    var LastUpdatedTime: js.UndefOr[UpdateDateTime]
  }

  object DescribeApplicationStateResult {
    @inline
    def apply(
        ApplicationStatus: js.UndefOr[ApplicationStatus] = js.undefined,
        LastUpdatedTime: js.UndefOr[UpdateDateTime] = js.undefined
    ): DescribeApplicationStateResult = {
      val __obj = js.Dynamic.literal()
      ApplicationStatus.foreach(__v => __obj.updateDynamic("ApplicationStatus")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationStateResult]
    }
  }

  @js.native
  trait DescribeMigrationTaskRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
  }

  object DescribeMigrationTaskRequest {
    @inline
    def apply(
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream
    ): DescribeMigrationTaskRequest = {
      val __obj = js.Dynamic.literal(
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeMigrationTaskRequest]
    }
  }

  @js.native
  trait DescribeMigrationTaskResult extends js.Object {
    var MigrationTask: js.UndefOr[MigrationTask]
  }

  object DescribeMigrationTaskResult {
    @inline
    def apply(
        MigrationTask: js.UndefOr[MigrationTask] = js.undefined
    ): DescribeMigrationTaskResult = {
      val __obj = js.Dynamic.literal()
      MigrationTask.foreach(__v => __obj.updateDynamic("MigrationTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMigrationTaskResult]
    }
  }

  @js.native
  trait DisassociateCreatedArtifactRequest extends js.Object {
    var CreatedArtifactName: CreatedArtifactName
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  object DisassociateCreatedArtifactRequest {
    @inline
    def apply(
        CreatedArtifactName: CreatedArtifactName,
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): DisassociateCreatedArtifactRequest = {
      val __obj = js.Dynamic.literal(
        "CreatedArtifactName"  -> CreatedArtifactName.asInstanceOf[js.Any],
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateCreatedArtifactRequest]
    }
  }

  @js.native
  trait DisassociateCreatedArtifactResult extends js.Object {}

  object DisassociateCreatedArtifactResult {
    @inline
    def apply(
        ): DisassociateCreatedArtifactResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateCreatedArtifactResult]
    }
  }

  @js.native
  trait DisassociateDiscoveredResourceRequest extends js.Object {
    var ConfigurationId: ConfigurationId
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  object DisassociateDiscoveredResourceRequest {
    @inline
    def apply(
        ConfigurationId: ConfigurationId,
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): DisassociateDiscoveredResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationId"      -> ConfigurationId.asInstanceOf[js.Any],
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateDiscoveredResourceRequest]
    }
  }

  @js.native
  trait DisassociateDiscoveredResourceResult extends js.Object {}

  object DisassociateDiscoveredResourceResult {
    @inline
    def apply(
        ): DisassociateDiscoveredResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateDiscoveredResourceResult]
    }
  }

  /**
    * Object representing the on-premises resource being migrated.
    */
  @js.native
  trait DiscoveredResource extends js.Object {
    var ConfigurationId: ConfigurationId
    var Description: js.UndefOr[DiscoveredResourceDescription]
  }

  object DiscoveredResource {
    @inline
    def apply(
        ConfigurationId: ConfigurationId,
        Description: js.UndefOr[DiscoveredResourceDescription] = js.undefined
    ): DiscoveredResource = {
      val __obj = js.Dynamic.literal(
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoveredResource]
    }
  }

  @js.native
  trait ImportMigrationTaskRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  object ImportMigrationTaskRequest {
    @inline
    def apply(
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): ImportMigrationTaskRequest = {
      val __obj = js.Dynamic.literal(
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportMigrationTaskRequest]
    }
  }

  @js.native
  trait ImportMigrationTaskResult extends js.Object {}

  object ImportMigrationTaskResult {
    @inline
    def apply(
        ): ImportMigrationTaskResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ImportMigrationTaskResult]
    }
  }

  @js.native
  trait ListApplicationStatesRequest extends js.Object {
    var ApplicationIds: js.UndefOr[ApplicationIds]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListApplicationStatesRequest {
    @inline
    def apply(
        ApplicationIds: js.UndefOr[ApplicationIds] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListApplicationStatesRequest = {
      val __obj = js.Dynamic.literal()
      ApplicationIds.foreach(__v => __obj.updateDynamic("ApplicationIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationStatesRequest]
    }
  }

  @js.native
  trait ListApplicationStatesResult extends js.Object {
    var ApplicationStateList: js.UndefOr[ApplicationStateList]
    var NextToken: js.UndefOr[Token]
  }

  object ListApplicationStatesResult {
    @inline
    def apply(
        ApplicationStateList: js.UndefOr[ApplicationStateList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListApplicationStatesResult = {
      val __obj = js.Dynamic.literal()
      ApplicationStateList.foreach(__v => __obj.updateDynamic("ApplicationStateList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationStatesResult]
    }
  }

  @js.native
  trait ListCreatedArtifactsRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var MaxResults: js.UndefOr[MaxResultsCreatedArtifacts]
    var NextToken: js.UndefOr[Token]
  }

  object ListCreatedArtifactsRequest {
    @inline
    def apply(
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream,
        MaxResults: js.UndefOr[MaxResultsCreatedArtifacts] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCreatedArtifactsRequest = {
      val __obj = js.Dynamic.literal(
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCreatedArtifactsRequest]
    }
  }

  @js.native
  trait ListCreatedArtifactsResult extends js.Object {
    var CreatedArtifactList: js.UndefOr[CreatedArtifactList]
    var NextToken: js.UndefOr[Token]
  }

  object ListCreatedArtifactsResult {
    @inline
    def apply(
        CreatedArtifactList: js.UndefOr[CreatedArtifactList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCreatedArtifactsResult = {
      val __obj = js.Dynamic.literal()
      CreatedArtifactList.foreach(__v => __obj.updateDynamic("CreatedArtifactList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCreatedArtifactsResult]
    }
  }

  @js.native
  trait ListDiscoveredResourcesRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var MaxResults: js.UndefOr[MaxResultsResources]
    var NextToken: js.UndefOr[Token]
  }

  object ListDiscoveredResourcesRequest {
    @inline
    def apply(
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream,
        MaxResults: js.UndefOr[MaxResultsResources] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDiscoveredResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDiscoveredResourcesRequest]
    }
  }

  @js.native
  trait ListDiscoveredResourcesResult extends js.Object {
    var DiscoveredResourceList: js.UndefOr[DiscoveredResourceList]
    var NextToken: js.UndefOr[Token]
  }

  object ListDiscoveredResourcesResult {
    @inline
    def apply(
        DiscoveredResourceList: js.UndefOr[DiscoveredResourceList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDiscoveredResourcesResult = {
      val __obj = js.Dynamic.literal()
      DiscoveredResourceList.foreach(__v => __obj.updateDynamic("DiscoveredResourceList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDiscoveredResourcesResult]
    }
  }

  @js.native
  trait ListMigrationTasksRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
    var ResourceName: js.UndefOr[ResourceName]
  }

  object ListMigrationTasksRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ResourceName: js.UndefOr[ResourceName] = js.undefined
    ): ListMigrationTasksRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMigrationTasksRequest]
    }
  }

  @js.native
  trait ListMigrationTasksResult extends js.Object {
    var MigrationTaskSummaryList: js.UndefOr[MigrationTaskSummaryList]
    var NextToken: js.UndefOr[Token]
  }

  object ListMigrationTasksResult {
    @inline
    def apply(
        MigrationTaskSummaryList: js.UndefOr[MigrationTaskSummaryList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListMigrationTasksResult = {
      val __obj = js.Dynamic.literal()
      MigrationTaskSummaryList.foreach(__v => __obj.updateDynamic("MigrationTaskSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMigrationTasksResult]
    }
  }

  @js.native
  trait ListProgressUpdateStreamsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListProgressUpdateStreamsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListProgressUpdateStreamsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProgressUpdateStreamsRequest]
    }
  }

  @js.native
  trait ListProgressUpdateStreamsResult extends js.Object {
    var NextToken: js.UndefOr[Token]
    var ProgressUpdateStreamSummaryList: js.UndefOr[ProgressUpdateStreamSummaryList]
  }

  object ListProgressUpdateStreamsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        ProgressUpdateStreamSummaryList: js.UndefOr[ProgressUpdateStreamSummaryList] = js.undefined
    ): ListProgressUpdateStreamsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProgressUpdateStreamSummaryList.foreach(__v =>
        __obj.updateDynamic("ProgressUpdateStreamSummaryList")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListProgressUpdateStreamsResult]
    }
  }

  /**
    * Represents a migration task in a migration tool.
    */
  @js.native
  trait MigrationTask extends js.Object {
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var ResourceAttributeList: js.UndefOr[LatestResourceAttributeList]
    var Task: js.UndefOr[Task]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
  }

  object MigrationTask {
    @inline
    def apply(
        MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
        ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
        ResourceAttributeList: js.UndefOr[LatestResourceAttributeList] = js.undefined,
        Task: js.UndefOr[Task] = js.undefined,
        UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined
    ): MigrationTask = {
      val __obj = js.Dynamic.literal()
      MigrationTaskName.foreach(__v => __obj.updateDynamic("MigrationTaskName")(__v.asInstanceOf[js.Any]))
      ProgressUpdateStream.foreach(__v => __obj.updateDynamic("ProgressUpdateStream")(__v.asInstanceOf[js.Any]))
      ResourceAttributeList.foreach(__v => __obj.updateDynamic("ResourceAttributeList")(__v.asInstanceOf[js.Any]))
      Task.foreach(__v => __obj.updateDynamic("Task")(__v.asInstanceOf[js.Any]))
      UpdateDateTime.foreach(__v => __obj.updateDynamic("UpdateDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MigrationTask]
    }
  }

  /**
    * MigrationTaskSummary includes <code>MigrationTaskName</code>, <code>ProgressPercent</code>, <code>ProgressUpdateStream</code>, <code>Status</code>, and <code>UpdateDateTime</code> for each task.
    */
  @js.native
  trait MigrationTaskSummary extends js.Object {
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var Status: js.UndefOr[Status]
    var StatusDetail: js.UndefOr[StatusDetail]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
  }

  object MigrationTaskSummary {
    @inline
    def apply(
        MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
        ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
        ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        StatusDetail: js.UndefOr[StatusDetail] = js.undefined,
        UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined
    ): MigrationTaskSummary = {
      val __obj = js.Dynamic.literal()
      MigrationTaskName.foreach(__v => __obj.updateDynamic("MigrationTaskName")(__v.asInstanceOf[js.Any]))
      ProgressPercent.foreach(__v => __obj.updateDynamic("ProgressPercent")(__v.asInstanceOf[js.Any]))
      ProgressUpdateStream.foreach(__v => __obj.updateDynamic("ProgressUpdateStream")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetail.foreach(__v => __obj.updateDynamic("StatusDetail")(__v.asInstanceOf[js.Any]))
      UpdateDateTime.foreach(__v => __obj.updateDynamic("UpdateDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MigrationTaskSummary]
    }
  }

  @js.native
  trait NotifyApplicationStateRequest extends js.Object {
    var ApplicationId: ApplicationId
    var Status: ApplicationStatus
    var DryRun: js.UndefOr[DryRun]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
  }

  object NotifyApplicationStateRequest {
    @inline
    def apply(
        ApplicationId: ApplicationId,
        Status: ApplicationStatus,
        DryRun: js.UndefOr[DryRun] = js.undefined,
        UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined
    ): NotifyApplicationStateRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "Status"        -> Status.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      UpdateDateTime.foreach(__v => __obj.updateDynamic("UpdateDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyApplicationStateRequest]
    }
  }

  @js.native
  trait NotifyApplicationStateResult extends js.Object {}

  object NotifyApplicationStateResult {
    @inline
    def apply(
        ): NotifyApplicationStateResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[NotifyApplicationStateResult]
    }
  }

  @js.native
  trait NotifyMigrationTaskStateRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var NextUpdateSeconds: NextUpdateSeconds
    var ProgressUpdateStream: ProgressUpdateStream
    var Task: Task
    var UpdateDateTime: UpdateDateTime
    var DryRun: js.UndefOr[DryRun]
  }

  object NotifyMigrationTaskStateRequest {
    @inline
    def apply(
        MigrationTaskName: MigrationTaskName,
        NextUpdateSeconds: NextUpdateSeconds,
        ProgressUpdateStream: ProgressUpdateStream,
        Task: Task,
        UpdateDateTime: UpdateDateTime,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): NotifyMigrationTaskStateRequest = {
      val __obj = js.Dynamic.literal(
        "MigrationTaskName"    -> MigrationTaskName.asInstanceOf[js.Any],
        "NextUpdateSeconds"    -> NextUpdateSeconds.asInstanceOf[js.Any],
        "ProgressUpdateStream" -> ProgressUpdateStream.asInstanceOf[js.Any],
        "Task"                 -> Task.asInstanceOf[js.Any],
        "UpdateDateTime"       -> UpdateDateTime.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyMigrationTaskStateRequest]
    }
  }

  @js.native
  trait NotifyMigrationTaskStateResult extends js.Object {}

  object NotifyMigrationTaskStateResult {
    @inline
    def apply(
        ): NotifyMigrationTaskStateResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[NotifyMigrationTaskStateResult]
    }
  }

  /**
    * Summary of the AWS resource used for access control that is implicitly linked to your AWS account.
    */
  @js.native
  trait ProgressUpdateStreamSummary extends js.Object {
    var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream]
  }

  object ProgressUpdateStreamSummary {
    @inline
    def apply(
        ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.undefined
    ): ProgressUpdateStreamSummary = {
      val __obj = js.Dynamic.literal()
      ProgressUpdateStreamName.foreach(__v => __obj.updateDynamic("ProgressUpdateStreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProgressUpdateStreamSummary]
    }
  }

  @js.native
  trait PutResourceAttributesRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var ResourceAttributeList: ResourceAttributeList
    var DryRun: js.UndefOr[DryRun]
  }

  object PutResourceAttributesRequest {
    @inline
    def apply(
        MigrationTaskName: MigrationTaskName,
        ProgressUpdateStream: ProgressUpdateStream,
        ResourceAttributeList: ResourceAttributeList,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): PutResourceAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "MigrationTaskName"     -> MigrationTaskName.asInstanceOf[js.Any],
        "ProgressUpdateStream"  -> ProgressUpdateStream.asInstanceOf[js.Any],
        "ResourceAttributeList" -> ResourceAttributeList.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourceAttributesRequest]
    }
  }

  @js.native
  trait PutResourceAttributesResult extends js.Object {}

  object PutResourceAttributesResult {
    @inline
    def apply(
        ): PutResourceAttributesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutResourceAttributesResult]
    }
  }

  /**
    * Attribute associated with a resource.
    *  Note the corresponding format required per type listed below:
    *  <dl> <dt>IPV4</dt> <dd> <code>x.x.x.x</code>
    *  <i>where x is an integer in the range [0,255]</i>
    *  </dd> <dt>IPV6</dt> <dd> <code>y : y : y : y : y : y : y : y</code>
    *  <i>where y is a hexadecimal between 0 and FFFF. [0, FFFF]</i>
    *  </dd> <dt>MAC_ADDRESS</dt> <dd> <code>^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})</code>
    *  </dd> <dt>FQDN</dt> <dd> <code>^[^&lt;&gt;{}\\/?,=\p{Cntrl}]{1,256}</code>
    *  </dd> </dl>
    */
  @js.native
  trait ResourceAttribute extends js.Object {
    var Type: ResourceAttributeType
    var Value: ResourceAttributeValue
  }

  object ResourceAttribute {
    @inline
    def apply(
        Type: ResourceAttributeType,
        Value: ResourceAttributeValue
    ): ResourceAttribute = {
      val __obj = js.Dynamic.literal(
        "Type"  -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceAttribute]
    }
  }

  object ResourceAttributeTypeEnum {
    val IPV4_ADDRESS                = "IPV4_ADDRESS"
    val IPV6_ADDRESS                = "IPV6_ADDRESS"
    val MAC_ADDRESS                 = "MAC_ADDRESS"
    val FQDN                        = "FQDN"
    val VM_MANAGER_ID               = "VM_MANAGER_ID"
    val VM_MANAGED_OBJECT_REFERENCE = "VM_MANAGED_OBJECT_REFERENCE"
    val VM_NAME                     = "VM_NAME"
    val VM_PATH                     = "VM_PATH"
    val BIOS_ID                     = "BIOS_ID"
    val MOTHERBOARD_SERIAL_NUMBER   = "MOTHERBOARD_SERIAL_NUMBER"

    val values = js.Object.freeze(
      js.Array(
        IPV4_ADDRESS,
        IPV6_ADDRESS,
        MAC_ADDRESS,
        FQDN,
        VM_MANAGER_ID,
        VM_MANAGED_OBJECT_REFERENCE,
        VM_NAME,
        VM_PATH,
        BIOS_ID,
        MOTHERBOARD_SERIAL_NUMBER
      )
    )
  }

  object StatusEnum {
    val NOT_STARTED = "NOT_STARTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED      = "FAILED"
    val COMPLETED   = "COMPLETED"

    val values = js.Object.freeze(js.Array(NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED))
  }

  /**
    * Task object encapsulating task information.
    */
  @js.native
  trait Task extends js.Object {
    var Status: Status
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var StatusDetail: js.UndefOr[StatusDetail]
  }

  object Task {
    @inline
    def apply(
        Status: Status,
        ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
        StatusDetail: js.UndefOr[StatusDetail] = js.undefined
    ): Task = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      ProgressPercent.foreach(__v => __obj.updateDynamic("ProgressPercent")(__v.asInstanceOf[js.Any]))
      StatusDetail.foreach(__v => __obj.updateDynamic("StatusDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Task]
    }
  }
}
