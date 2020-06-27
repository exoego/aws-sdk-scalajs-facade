package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object migrationhub {
  type ApplicationId                   = String
  type ApplicationIds                  = js.Array[ApplicationId]
  type ApplicationStateList            = js.Array[ApplicationState]
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
  type ResourceAttributeValue          = String
  type ResourceName                    = String
  type StatusDetail                    = String
  type Token                           = String
  type UpdateDateTime                  = js.Date

  implicit final class MigrationHubOps(private val service: MigrationHub) extends AnyVal {

    @inline def associateCreatedArtifactFuture(
        params: AssociateCreatedArtifactRequest
    ): Future[AssociateCreatedArtifactResult] = service.associateCreatedArtifact(params).promise().toFuture
    @inline def associateDiscoveredResourceFuture(
        params: AssociateDiscoveredResourceRequest
    ): Future[AssociateDiscoveredResourceResult] = service.associateDiscoveredResource(params).promise().toFuture
    @inline def createProgressUpdateStreamFuture(
        params: CreateProgressUpdateStreamRequest
    ): Future[CreateProgressUpdateStreamResult] = service.createProgressUpdateStream(params).promise().toFuture
    @inline def deleteProgressUpdateStreamFuture(
        params: DeleteProgressUpdateStreamRequest
    ): Future[DeleteProgressUpdateStreamResult] = service.deleteProgressUpdateStream(params).promise().toFuture
    @inline def describeApplicationStateFuture(
        params: DescribeApplicationStateRequest
    ): Future[DescribeApplicationStateResult] = service.describeApplicationState(params).promise().toFuture
    @inline def describeMigrationTaskFuture(params: DescribeMigrationTaskRequest): Future[DescribeMigrationTaskResult] =
      service.describeMigrationTask(params).promise().toFuture
    @inline def disassociateCreatedArtifactFuture(
        params: DisassociateCreatedArtifactRequest
    ): Future[DisassociateCreatedArtifactResult] = service.disassociateCreatedArtifact(params).promise().toFuture
    @inline def disassociateDiscoveredResourceFuture(
        params: DisassociateDiscoveredResourceRequest
    ): Future[DisassociateDiscoveredResourceResult] = service.disassociateDiscoveredResource(params).promise().toFuture
    @inline def importMigrationTaskFuture(params: ImportMigrationTaskRequest): Future[ImportMigrationTaskResult] =
      service.importMigrationTask(params).promise().toFuture
    @inline def listApplicationStatesFuture(params: ListApplicationStatesRequest): Future[ListApplicationStatesResult] =
      service.listApplicationStates(params).promise().toFuture
    @inline def listCreatedArtifactsFuture(params: ListCreatedArtifactsRequest): Future[ListCreatedArtifactsResult] =
      service.listCreatedArtifacts(params).promise().toFuture
    @inline def listDiscoveredResourcesFuture(
        params: ListDiscoveredResourcesRequest
    ): Future[ListDiscoveredResourcesResult] = service.listDiscoveredResources(params).promise().toFuture
    @inline def listMigrationTasksFuture(params: ListMigrationTasksRequest): Future[ListMigrationTasksResult] =
      service.listMigrationTasks(params).promise().toFuture
    @inline def listProgressUpdateStreamsFuture(
        params: ListProgressUpdateStreamsRequest
    ): Future[ListProgressUpdateStreamsResult] = service.listProgressUpdateStreams(params).promise().toFuture
    @inline def notifyApplicationStateFuture(
        params: NotifyApplicationStateRequest
    ): Future[NotifyApplicationStateResult] = service.notifyApplicationState(params).promise().toFuture
    @inline def notifyMigrationTaskStateFuture(
        params: NotifyMigrationTaskStateRequest
    ): Future[NotifyMigrationTaskStateResult] = service.notifyMigrationTaskState(params).promise().toFuture
    @inline def putResourceAttributesFuture(params: PutResourceAttributesRequest): Future[PutResourceAttributesResult] =
      service.putResourceAttributes(params).promise().toFuture
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
  @Factory
  trait ApplicationState extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
    var LastUpdatedTime: js.UndefOr[UpdateDateTime]
  }

  @js.native
  sealed trait ApplicationStatus extends js.Any
  object ApplicationStatus extends js.Object {
    val NOT_STARTED = "NOT_STARTED".asInstanceOf[ApplicationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ApplicationStatus]
    val COMPLETED   = "COMPLETED".asInstanceOf[ApplicationStatus]

    val values = js.Object.freeze(js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED))
  }

  @js.native
  @Factory
  trait AssociateCreatedArtifactRequest extends js.Object {
    var CreatedArtifact: CreatedArtifact
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait AssociateCreatedArtifactResult extends js.Object {}

  @js.native
  @Factory
  trait AssociateDiscoveredResourceRequest extends js.Object {
    var DiscoveredResource: DiscoveredResource
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait AssociateDiscoveredResourceResult extends js.Object {}

  @js.native
  @Factory
  trait CreateProgressUpdateStreamRequest extends js.Object {
    var ProgressUpdateStreamName: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait CreateProgressUpdateStreamResult extends js.Object {}

  /**
    * An ARN of the AWS cloud resource target receiving the migration (e.g., AMI, EC2 instance, RDS instance, etc.).
    */
  @js.native
  @Factory
  trait CreatedArtifact extends js.Object {
    var Name: CreatedArtifactName
    var Description: js.UndefOr[CreatedArtifactDescription]
  }

  @js.native
  @Factory
  trait DeleteProgressUpdateStreamRequest extends js.Object {
    var ProgressUpdateStreamName: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait DeleteProgressUpdateStreamResult extends js.Object {}

  @js.native
  @Factory
  trait DescribeApplicationStateRequest extends js.Object {
    var ApplicationId: ApplicationId
  }

  @js.native
  @Factory
  trait DescribeApplicationStateResult extends js.Object {
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
    var LastUpdatedTime: js.UndefOr[UpdateDateTime]
  }

  @js.native
  @Factory
  trait DescribeMigrationTaskRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
  }

  @js.native
  @Factory
  trait DescribeMigrationTaskResult extends js.Object {
    var MigrationTask: js.UndefOr[MigrationTask]
  }

  @js.native
  @Factory
  trait DisassociateCreatedArtifactRequest extends js.Object {
    var CreatedArtifactName: CreatedArtifactName
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait DisassociateCreatedArtifactResult extends js.Object {}

  @js.native
  @Factory
  trait DisassociateDiscoveredResourceRequest extends js.Object {
    var ConfigurationId: ConfigurationId
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait DisassociateDiscoveredResourceResult extends js.Object {}

  /**
    * Object representing the on-premises resource being migrated.
    */
  @js.native
  @Factory
  trait DiscoveredResource extends js.Object {
    var ConfigurationId: ConfigurationId
    var Description: js.UndefOr[DiscoveredResourceDescription]
  }

  @js.native
  @Factory
  trait ImportMigrationTaskRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait ImportMigrationTaskResult extends js.Object {}

  @js.native
  @Factory
  trait ListApplicationStatesRequest extends js.Object {
    var ApplicationIds: js.UndefOr[ApplicationIds]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListApplicationStatesResult extends js.Object {
    var ApplicationStateList: js.UndefOr[ApplicationStateList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListCreatedArtifactsRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var MaxResults: js.UndefOr[MaxResultsCreatedArtifacts]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListCreatedArtifactsResult extends js.Object {
    var CreatedArtifactList: js.UndefOr[CreatedArtifactList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListDiscoveredResourcesRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var MaxResults: js.UndefOr[MaxResultsResources]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListDiscoveredResourcesResult extends js.Object {
    var DiscoveredResourceList: js.UndefOr[DiscoveredResourceList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListMigrationTasksRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
    var ResourceName: js.UndefOr[ResourceName]
  }

  @js.native
  @Factory
  trait ListMigrationTasksResult extends js.Object {
    var MigrationTaskSummaryList: js.UndefOr[MigrationTaskSummaryList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListProgressUpdateStreamsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListProgressUpdateStreamsResult extends js.Object {
    var NextToken: js.UndefOr[Token]
    var ProgressUpdateStreamSummaryList: js.UndefOr[ProgressUpdateStreamSummaryList]
  }

  /**
    * Represents a migration task in a migration tool.
    */
  @js.native
  @Factory
  trait MigrationTask extends js.Object {
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var ResourceAttributeList: js.UndefOr[LatestResourceAttributeList]
    var Task: js.UndefOr[Task]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
  }

  /**
    * MigrationTaskSummary includes <code>MigrationTaskName</code>, <code>ProgressPercent</code>, <code>ProgressUpdateStream</code>, <code>Status</code>, and <code>UpdateDateTime</code> for each task.
    */
  @js.native
  @Factory
  trait MigrationTaskSummary extends js.Object {
    var MigrationTaskName: js.UndefOr[MigrationTaskName]
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var ProgressUpdateStream: js.UndefOr[ProgressUpdateStream]
    var Status: js.UndefOr[Status]
    var StatusDetail: js.UndefOr[StatusDetail]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
  }

  @js.native
  @Factory
  trait NotifyApplicationStateRequest extends js.Object {
    var ApplicationId: ApplicationId
    var Status: ApplicationStatus
    var DryRun: js.UndefOr[DryRun]
    var UpdateDateTime: js.UndefOr[UpdateDateTime]
  }

  @js.native
  @Factory
  trait NotifyApplicationStateResult extends js.Object {}

  @js.native
  @Factory
  trait NotifyMigrationTaskStateRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var NextUpdateSeconds: NextUpdateSeconds
    var ProgressUpdateStream: ProgressUpdateStream
    var Task: Task
    var UpdateDateTime: UpdateDateTime
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait NotifyMigrationTaskStateResult extends js.Object {}

  /**
    * Summary of the AWS resource used for access control that is implicitly linked to your AWS account.
    */
  @js.native
  @Factory
  trait ProgressUpdateStreamSummary extends js.Object {
    var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream]
  }

  @js.native
  @Factory
  trait PutResourceAttributesRequest extends js.Object {
    var MigrationTaskName: MigrationTaskName
    var ProgressUpdateStream: ProgressUpdateStream
    var ResourceAttributeList: ResourceAttributeList
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait PutResourceAttributesResult extends js.Object {}

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
  @Factory
  trait ResourceAttribute extends js.Object {
    var Type: ResourceAttributeType
    var Value: ResourceAttributeValue
  }

  @js.native
  sealed trait ResourceAttributeType extends js.Any
  object ResourceAttributeType extends js.Object {
    val IPV4_ADDRESS                = "IPV4_ADDRESS".asInstanceOf[ResourceAttributeType]
    val IPV6_ADDRESS                = "IPV6_ADDRESS".asInstanceOf[ResourceAttributeType]
    val MAC_ADDRESS                 = "MAC_ADDRESS".asInstanceOf[ResourceAttributeType]
    val FQDN                        = "FQDN".asInstanceOf[ResourceAttributeType]
    val VM_MANAGER_ID               = "VM_MANAGER_ID".asInstanceOf[ResourceAttributeType]
    val VM_MANAGED_OBJECT_REFERENCE = "VM_MANAGED_OBJECT_REFERENCE".asInstanceOf[ResourceAttributeType]
    val VM_NAME                     = "VM_NAME".asInstanceOf[ResourceAttributeType]
    val VM_PATH                     = "VM_PATH".asInstanceOf[ResourceAttributeType]
    val BIOS_ID                     = "BIOS_ID".asInstanceOf[ResourceAttributeType]
    val MOTHERBOARD_SERIAL_NUMBER   = "MOTHERBOARD_SERIAL_NUMBER".asInstanceOf[ResourceAttributeType]

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

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val NOT_STARTED = "NOT_STARTED".asInstanceOf[Status]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[Status]
    val FAILED      = "FAILED".asInstanceOf[Status]
    val COMPLETED   = "COMPLETED".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED))
  }

  /**
    * Task object encapsulating task information.
    */
  @js.native
  @Factory
  trait Task extends js.Object {
    var Status: Status
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var StatusDetail: js.UndefOr[StatusDetail]
  }
}
