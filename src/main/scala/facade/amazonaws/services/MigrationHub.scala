package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object migrationhub {
  type ApplicationId = String
  type ApplicationStatus = String
  type ConfigurationId = String
  type CreatedArtifactDescription = String
  type CreatedArtifactList = js.Array[CreatedArtifact]
  type CreatedArtifactName = String
  type DiscoveredResourceDescription = String
  type DiscoveredResourceList = js.Array[DiscoveredResource]
  type DryRun = Boolean
  type ErrorMessage = String
  type LatestResourceAttributeList = js.Array[ResourceAttribute]
  type MaxResults = Int
  type MaxResultsCreatedArtifacts = Int
  type MaxResultsResources = Int
  type MigrationTaskName = String
  type MigrationTaskSummaryList = js.Array[MigrationTaskSummary]
  type NextUpdateSeconds = Int
  type ProgressPercent = Int
  type ProgressUpdateStream = String
  type ProgressUpdateStreamSummaryList = js.Array[ProgressUpdateStreamSummary]
  type ResourceAttributeList = js.Array[ResourceAttribute]
  type ResourceAttributeType = String
  type ResourceAttributeValue = String
  type ResourceName = String
  type Status = String
  type StatusDetail = String
  type Token = String
  type UpdateDateTime = js.Date
}

package migrationhub {
  @js.native
  @JSImport("aws-sdk", "MigrationHub")
  class MigrationHub(config: AWSConfig) extends js.Object {
    def associateCreatedArtifact(params: AssociateCreatedArtifactRequest): Request[AssociateCreatedArtifactResult] = js.native
    def associateDiscoveredResource(params: AssociateDiscoveredResourceRequest): Request[AssociateDiscoveredResourceResult] = js.native
    def createProgressUpdateStream(params: CreateProgressUpdateStreamRequest): Request[CreateProgressUpdateStreamResult] = js.native
    def deleteProgressUpdateStream(params: DeleteProgressUpdateStreamRequest): Request[DeleteProgressUpdateStreamResult] = js.native
    def describeApplicationState(params: DescribeApplicationStateRequest): Request[DescribeApplicationStateResult] = js.native
    def describeMigrationTask(params: DescribeMigrationTaskRequest): Request[DescribeMigrationTaskResult] = js.native
    def disassociateCreatedArtifact(params: DisassociateCreatedArtifactRequest): Request[DisassociateCreatedArtifactResult] = js.native
    def disassociateDiscoveredResource(params: DisassociateDiscoveredResourceRequest): Request[DisassociateDiscoveredResourceResult] = js.native
    def importMigrationTask(params: ImportMigrationTaskRequest): Request[ImportMigrationTaskResult] = js.native
    def listCreatedArtifacts(params: ListCreatedArtifactsRequest): Request[ListCreatedArtifactsResult] = js.native
    def listDiscoveredResources(params: ListDiscoveredResourcesRequest): Request[ListDiscoveredResourcesResult] = js.native
    def listMigrationTasks(params: ListMigrationTasksRequest): Request[ListMigrationTasksResult] = js.native
    def listProgressUpdateStreams(params: ListProgressUpdateStreamsRequest): Request[ListProgressUpdateStreamsResult] = js.native
    def notifyApplicationState(params: NotifyApplicationStateRequest): Request[NotifyApplicationStateResult] = js.native
    def notifyMigrationTaskState(params: NotifyMigrationTaskStateRequest): Request[NotifyMigrationTaskStateResult] = js.native
    def putResourceAttributes(params: PutResourceAttributesRequest): Request[PutResourceAttributesResult] = js.native
  }

  /**
   * <p>You do not have sufficient access to perform this action.</p>
   */
  @js.native
  trait AccessDeniedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object ApplicationStatusEnum {
    val NOT_STARTED = "NOT_STARTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED = "COMPLETED"

    val values = IndexedSeq(NOT_STARTED, IN_PROGRESS, COMPLETED)
  }

  @js.native
  trait AssociateCreatedArtifactRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var CreatedArtifact: js.UndefOr[CreatedArtifact]
    var DryRun: js.UndefOr[DryRun]
  }

  object AssociateCreatedArtifactRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      CreatedArtifact: js.UndefOr[CreatedArtifact] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): AssociateCreatedArtifactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "CreatedArtifact" -> CreatedArtifact.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateCreatedArtifactRequest]
    }
  }

  @js.native
  trait AssociateCreatedArtifactResult extends js.Object {

  }

  object AssociateCreatedArtifactResult {
    def apply(): AssociateCreatedArtifactResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateCreatedArtifactResult]
    }
  }

  @js.native
  trait AssociateDiscoveredResourceRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var DiscoveredResource: js.UndefOr[DiscoveredResource]
    var DryRun: js.UndefOr[DryRun]
  }

  object AssociateDiscoveredResourceRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      DiscoveredResource: js.UndefOr[DiscoveredResource] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): AssociateDiscoveredResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "DiscoveredResource" -> DiscoveredResource.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDiscoveredResourceRequest]
    }
  }

  @js.native
  trait AssociateDiscoveredResourceResult extends js.Object {

  }

  object AssociateDiscoveredResourceResult {
    def apply(): AssociateDiscoveredResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDiscoveredResourceResult]
    }
  }

  @js.native
  trait CreateProgressUpdateStreamRequest extends js.Object {
    var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream]
    var DryRun: js.UndefOr[DryRun]
  }

  object CreateProgressUpdateStreamRequest {
    def apply(
      ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): CreateProgressUpdateStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStreamName" -> ProgressUpdateStreamName.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProgressUpdateStreamRequest]
    }
  }

  @js.native
  trait CreateProgressUpdateStreamResult extends js.Object {

  }

  object CreateProgressUpdateStreamResult {
    def apply(): CreateProgressUpdateStreamResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProgressUpdateStreamResult]
    }
  }

  /**
   * <p>An ARN of the AWS cloud resource target receiving the migration (e.g., AMI, EC2 instance, RDS instance, etc.).</p>
   */
  @js.native
  trait CreatedArtifact extends js.Object {
    var Name: js.UndefOr[CreatedArtifactName]
    var Description: js.UndefOr[CreatedArtifactDescription]
  }

  object CreatedArtifact {
    def apply(
      Name: js.UndefOr[CreatedArtifactName] = js.undefined,
      Description: js.UndefOr[CreatedArtifactDescription] = js.undefined): CreatedArtifact = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatedArtifact]
    }
  }

  @js.native
  trait DeleteProgressUpdateStreamRequest extends js.Object {
    var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream]
    var DryRun: js.UndefOr[DryRun]
  }

  object DeleteProgressUpdateStreamRequest {
    def apply(
      ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): DeleteProgressUpdateStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStreamName" -> ProgressUpdateStreamName.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProgressUpdateStreamRequest]
    }
  }

  @js.native
  trait DeleteProgressUpdateStreamResult extends js.Object {

  }

  object DeleteProgressUpdateStreamResult {
    def apply(): DeleteProgressUpdateStreamResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProgressUpdateStreamResult]
    }
  }

  @js.native
  trait DescribeApplicationStateRequest extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
  }

  object DescribeApplicationStateRequest {
    def apply(
      ApplicationId: js.UndefOr[ApplicationId] = js.undefined): DescribeApplicationStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationStateRequest]
    }
  }

  @js.native
  trait DescribeApplicationStateResult extends js.Object {
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
    var LastUpdatedTime: js.UndefOr[UpdateDateTime]
  }

  object DescribeApplicationStateResult {
    def apply(
      ApplicationStatus: js.UndefOr[ApplicationStatus] = js.undefined,
      LastUpdatedTime: js.UndefOr[UpdateDateTime] = js.undefined): DescribeApplicationStateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationStatus" -> ApplicationStatus.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedTime" -> LastUpdatedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationStateResult]
    }
  }

  @js.native
  trait DescribeMigrationTaskRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
  }

  object DescribeMigrationTaskRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined): DescribeMigrationTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMigrationTaskRequest]
    }
  }

  @js.native
  trait DescribeMigrationTaskResult extends js.Object {
    var MigrationTask: js.UndefOr[MigrationTask]
  }

  object DescribeMigrationTaskResult {
    def apply(
      MigrationTask: js.UndefOr[MigrationTask] = js.undefined): DescribeMigrationTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MigrationTask" -> MigrationTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMigrationTaskResult]
    }
  }

  @js.native
  trait DisassociateCreatedArtifactRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var CreatedArtifactName: js.UndefOr[CreatedArtifactName]
    var DryRun: js.UndefOr[DryRun]
  }

  object DisassociateCreatedArtifactRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      CreatedArtifactName: js.UndefOr[CreatedArtifactName] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): DisassociateCreatedArtifactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "CreatedArtifactName" -> CreatedArtifactName.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateCreatedArtifactRequest]
    }
  }

  @js.native
  trait DisassociateCreatedArtifactResult extends js.Object {

  }

  object DisassociateCreatedArtifactResult {
    def apply(): DisassociateCreatedArtifactResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateCreatedArtifactResult]
    }
  }

  @js.native
  trait DisassociateDiscoveredResourceRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ConfigurationId: js.UndefOr[ConfigurationId]
    var DryRun: js.UndefOr[DryRun]
  }

  object DisassociateDiscoveredResourceRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      ConfigurationId: js.UndefOr[ConfigurationId] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): DisassociateDiscoveredResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationId" -> ConfigurationId.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDiscoveredResourceRequest]
    }
  }

  @js.native
  trait DisassociateDiscoveredResourceResult extends js.Object {

  }

  object DisassociateDiscoveredResourceResult {
    def apply(): DisassociateDiscoveredResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDiscoveredResourceResult]
    }
  }

  /**
   * <p>Object representing the on-premises resource being migrated.</p>
   */
  @js.native
  trait DiscoveredResource extends js.Object {
    var ConfigurationId: js.UndefOr[ConfigurationId]
    var Description: js.UndefOr[DiscoveredResourceDescription]
  }

  object DiscoveredResource {
    def apply(
      ConfigurationId: js.UndefOr[ConfigurationId] = js.undefined,
      Description: js.UndefOr[DiscoveredResourceDescription] = js.undefined): DiscoveredResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationId" -> ConfigurationId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoveredResource]
    }
  }

  /**
   * <p>Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to "true".</p>
   */
  @js.native
  trait DryRunOperationException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait ImportMigrationTaskRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var DryRun: js.UndefOr[DryRun]
  }

  object ImportMigrationTaskRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): ImportMigrationTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportMigrationTaskRequest]
    }
  }

  @js.native
  trait ImportMigrationTaskResult extends js.Object {

  }

  object ImportMigrationTaskResult {
    def apply(): ImportMigrationTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportMigrationTaskResult]
    }
  }

  /**
   * <p>Exception raised when there is an internal, configuration, or dependency error encountered.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Exception raised when the provided input violates a policy constraint or is entered in the wrong format or data type.</p>
   */
  @js.native
  trait InvalidInputExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait ListCreatedArtifactsRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var NextToken: js.UndefOr[Token]
    var MaxResults: js.UndefOr[MaxResultsCreatedArtifacts]
  }

  object ListCreatedArtifactsRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsCreatedArtifacts] = js.undefined): ListCreatedArtifactsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCreatedArtifactsRequest]
    }
  }

  @js.native
  trait ListCreatedArtifactsResult extends js.Object {
    var NextToken: js.UndefOr[Token]
    var CreatedArtifactList: js.UndefOr[CreatedArtifactList]
  }

  object ListCreatedArtifactsResult {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      CreatedArtifactList: js.UndefOr[CreatedArtifactList] = js.undefined): ListCreatedArtifactsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "CreatedArtifactList" -> CreatedArtifactList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCreatedArtifactsResult]
    }
  }

  @js.native
  trait ListDiscoveredResourcesRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var NextToken: js.UndefOr[Token]
    var MaxResults: js.UndefOr[MaxResultsResources]
  }

  object ListDiscoveredResourcesRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsResources] = js.undefined): ListDiscoveredResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDiscoveredResourcesRequest]
    }
  }

  @js.native
  trait ListDiscoveredResourcesResult extends js.Object {
    var NextToken: js.UndefOr[Token]
    var DiscoveredResourceList: js.UndefOr[DiscoveredResourceList]
  }

  object ListDiscoveredResourcesResult {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      DiscoveredResourceList: js.UndefOr[DiscoveredResourceList] = js.undefined): ListDiscoveredResourcesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "DiscoveredResourceList" -> DiscoveredResourceList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDiscoveredResourcesResult]
    }
  }

  @js.native
  trait ListMigrationTasksRequest extends js.Object {
    var NextToken: js.UndefOr[Token]
    var MaxResults: js.UndefOr[MaxResults]
    var ResourceName: js.UndefOr[ResourceName]
  }

  object ListMigrationTasksRequest {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      ResourceName: js.UndefOr[ResourceName] = js.undefined): ListMigrationTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMigrationTasksRequest]
    }
  }

  @js.native
  trait ListMigrationTasksResult extends js.Object {
    var NextToken: js.UndefOr[Token]
    var MigrationTaskSummaryList: js.UndefOr[MigrationTaskSummaryList]
  }

  object ListMigrationTasksResult {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      MigrationTaskSummaryList: js.UndefOr[MigrationTaskSummaryList] = js.undefined): ListMigrationTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskSummaryList" -> MigrationTaskSummaryList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMigrationTasksResult]
    }
  }

  @js.native
  trait ListProgressUpdateStreamsRequest extends js.Object {
    var NextToken: js.UndefOr[Token]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListProgressUpdateStreamsRequest {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListProgressUpdateStreamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProgressUpdateStreamsRequest]
    }
  }

  @js.native
  trait ListProgressUpdateStreamsResult extends js.Object {
    var ProgressUpdateStreamSummaryList: js.UndefOr[ProgressUpdateStreamSummaryList]
    var NextToken: js.UndefOr[Token]
  }

  object ListProgressUpdateStreamsResult {
    def apply(
      ProgressUpdateStreamSummaryList: js.UndefOr[ProgressUpdateStreamSummaryList] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): ListProgressUpdateStreamsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStreamSummaryList" -> ProgressUpdateStreamSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProgressUpdateStreamsResult]
    }
  }

  /**
   * <p>Represents a migration task in a migration tool.</p>
   */
  @js.native
  trait MigrationTask extends js.Object {
    var ResourceAttributeList: js.UndefOr[LatestResourceAttributeList]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var Task: js.UndefOr[Task]
  }

  object MigrationTask {
    def apply(
      ResourceAttributeList: js.UndefOr[LatestResourceAttributeList] = js.undefined,
      UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      Task: js.UndefOr[Task] = js.undefined): MigrationTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceAttributeList" -> ResourceAttributeList.map { x => x.asInstanceOf[js.Any] },
        "UpdateDateTime" -> UpdateDateTime.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "Task" -> Task.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MigrationTask]
    }
  }

  /**
   * <p>MigrationTaskSummary includes <code>MigrationTaskName</code>, <code>ProgressPercent</code>, <code>ProgressUpdateStream</code>, <code>Status</code>, and <code>UpdateDateTime</code> for each task.</p>
   */
  @js.native
  trait MigrationTaskSummary extends js.Object {
    var StatusDetail: js.UndefOr[StatusDetail]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var Status: js.UndefOr[Status]
  }

  object MigrationTaskSummary {
    def apply(
      StatusDetail: js.UndefOr[StatusDetail] = js.undefined,
      UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): MigrationTaskSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetail" -> StatusDetail.map { x => x.asInstanceOf[js.Any] },
        "UpdateDateTime" -> UpdateDateTime.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "ProgressPercent" -> ProgressPercent.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MigrationTaskSummary]
    }
  }

  @js.native
  trait NotifyApplicationStateRequest extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Status: js.UndefOr[ApplicationStatus]
    var DryRun: js.UndefOr[DryRun]
  }

  object NotifyApplicationStateRequest {
    def apply(
      ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
      Status: js.UndefOr[ApplicationStatus] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): NotifyApplicationStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyApplicationStateRequest]
    }
  }

  @js.native
  trait NotifyApplicationStateResult extends js.Object {

  }

  object NotifyApplicationStateResult {
    def apply(): NotifyApplicationStateResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyApplicationStateResult]
    }
  }

  @js.native
  trait NotifyMigrationTaskStateRequest extends js.Object {
    var DryRun: js.UndefOr[DryRun]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var Task: js.UndefOr[Task]
    var NextUpdateSeconds: js.UndefOr[NextUpdateSeconds]
  }

  object NotifyMigrationTaskStateRequest {
    def apply(
      DryRun: js.UndefOr[DryRun] = js.undefined,
      UpdateDateTime: js.UndefOr[UpdateDateTime] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      Task: js.UndefOr[Task] = js.undefined,
      NextUpdateSeconds: js.UndefOr[NextUpdateSeconds] = js.undefined): NotifyMigrationTaskStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "UpdateDateTime" -> UpdateDateTime.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "Task" -> Task.map { x => x.asInstanceOf[js.Any] },
        "NextUpdateSeconds" -> NextUpdateSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyMigrationTaskStateRequest]
    }
  }

  @js.native
  trait NotifyMigrationTaskStateResult extends js.Object {

  }

  object NotifyMigrationTaskStateResult {
    def apply(): NotifyMigrationTaskStateResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyMigrationTaskStateResult]
    }
  }

  /**
   * <p>Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured correctly.</p>
   */
  @js.native
  trait PolicyErrorExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Summary of the AWS resource used for access control that is implicitly linked to your AWS account.</p>
   */
  @js.native
  trait ProgressUpdateStreamSummary extends js.Object {
    var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream]
  }

  object ProgressUpdateStreamSummary {
    def apply(
      ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.undefined): ProgressUpdateStreamSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStreamName" -> ProgressUpdateStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProgressUpdateStreamSummary]
    }
  }

  @js.native
  trait PutResourceAttributesRequest extends js.Object {
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ResourceAttributeList: js.UndefOr[ResourceAttributeList]
    var DryRun: js.UndefOr[DryRun]
  }

  object PutResourceAttributesRequest {
    def apply(
      ProgressUpdateStream: js.UndefOr[ProgressUpdateStream] = js.undefined,
      MigrationTaskName: js.UndefOr[MigrationTaskName] = js.undefined,
      ResourceAttributeList: js.UndefOr[ResourceAttributeList] = js.undefined,
      DryRun: js.UndefOr[DryRun] = js.undefined): PutResourceAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressUpdateStream" -> ProgressUpdateStream.map { x => x.asInstanceOf[js.Any] },
        "MigrationTaskName" -> MigrationTaskName.map { x => x.asInstanceOf[js.Any] },
        "ResourceAttributeList" -> ResourceAttributeList.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourceAttributesRequest]
    }
  }

  @js.native
  trait PutResourceAttributesResult extends js.Object {

  }

  object PutResourceAttributesResult {
    def apply(): PutResourceAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourceAttributesResult]
    }
  }

  /**
   * <p>Attribute associated with a resource.</p> <p>Note the corresponding format required per type listed below:</p> <dl> <dt>IPV4</dt> <dd> <p> <code>x.x.x.x</code> </p> <p> <i>where x is an integer in the range [0,255]</i> </p> </dd> <dt>IPV6</dt> <dd> <p> <code>y : y : y : y : y : y : y : y</code> </p> <p> <i>where y is a hexadecimal between 0 and FFFF. [0, FFFF]</i> </p> </dd> <dt>MAC_ADDRESS</dt> <dd> <p> <code>^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$</code> </p> </dd> <dt>FQDN</dt> <dd> <p> <code>^[^&lt;&gt;{}\\\\/?,=\\p{Cntrl}]{1,256}$</code> </p> </dd> </dl>
   */
  @js.native
  trait ResourceAttribute extends js.Object {
    var Type: js.UndefOr[ResourceAttributeType]
    var Value: js.UndefOr[ResourceAttributeValue]
  }

  object ResourceAttribute {
    def apply(
      Type: js.UndefOr[ResourceAttributeType] = js.undefined,
      Value: js.UndefOr[ResourceAttributeValue] = js.undefined): ResourceAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceAttribute]
    }
  }

  object ResourceAttributeTypeEnum {
    val IPV4_ADDRESS = "IPV4_ADDRESS"
    val IPV6_ADDRESS = "IPV6_ADDRESS"
    val MAC_ADDRESS = "MAC_ADDRESS"
    val FQDN = "FQDN"
    val VM_MANAGER_ID = "VM_MANAGER_ID"
    val VM_MANAGED_OBJECT_REFERENCE = "VM_MANAGED_OBJECT_REFERENCE"
    val VM_NAME = "VM_NAME"
    val VM_PATH = "VM_PATH"
    val BIOS_ID = "BIOS_ID"
    val MOTHERBOARD_SERIAL_NUMBER = "MOTHERBOARD_SERIAL_NUMBER"

    val values = IndexedSeq(IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN, VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID, MOTHERBOARD_SERIAL_NUMBER)
  }

  /**
   * <p>Exception raised when the request references a resource (ADS configuration, update stream, migration task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Exception raised when there is an internal, configuration, or dependency error encountered.</p>
   */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object StatusEnum {
    val NOT_STARTED = "NOT_STARTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED = "FAILED"
    val COMPLETED = "COMPLETED"

    val values = IndexedSeq(NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED)
  }

  /**
   * <p>Task object encapsulating task information.</p>
   */
  @js.native
  trait Task extends js.Object {
    var Status: js.UndefOr[Status]
    var StatusDetail: js.UndefOr[StatusDetail]
    var ProgressPercent: js.UndefOr[ProgressPercent]
  }

  object Task {
    def apply(
      Status: js.UndefOr[Status] = js.undefined,
      StatusDetail: js.UndefOr[StatusDetail] = js.undefined,
      ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined): Task = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetail" -> StatusDetail.map { x => x.asInstanceOf[js.Any] },
        "ProgressPercent" -> ProgressPercent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Task]
    }
  }

  /**
   * <p>Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to "true".</p>
   */
  @js.native
  trait UnauthorizedOperationException extends js.Object {
    val Message: ErrorMessage
  }
}
