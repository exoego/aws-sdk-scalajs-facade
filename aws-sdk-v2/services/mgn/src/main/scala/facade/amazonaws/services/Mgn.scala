package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object mgn {
  type ARN = String
  type ActionID = String
  type ActionIDs = js.Array[ActionID]
  type ActionName = String
  type ApplicationDescription = String
  type ApplicationID = String
  type ApplicationIDs = js.Array[ApplicationID]
  type ApplicationIDsFilter = js.Array[ApplicationID]
  type ApplicationName = String
  type ApplicationsList = js.Array[Application]
  type AssociateSourceServersRequestSourceServerIDs = js.Array[SourceServerID]
  type BoundedString = String
  type CloudWatchLogGroupName = String
  type Cpus = js.Array[CPU]
  type DataReplicationInfoReplicatedDisks = js.Array[DataReplicationInfoReplicatedDisk]
  type DataReplicationInitiationSteps = js.Array[DataReplicationInitiationStep]
  type DescribeJobsRequestFiltersJobIDs = js.Array[JobID]
  type DescribeSourceServersRequestApplicationIDs = js.Array[ApplicationID]
  type DescribeSourceServersRequestFiltersIDs = js.Array[SourceServerID]
  type DisassociateSourceServersRequestSourceServerIDs = js.Array[SourceServerID]
  type Disks = js.Array[Disk]
  type DocumentVersion = String
  type EC2InstanceID = String
  type EC2InstanceType = String
  type EC2LaunchConfigurationTemplateID = String
  type IPsList = js.Array[BoundedString]
  type ISO8601DatetimeString = String
  type ISO8601DurationString = String
  type JobID = String
  type JobLogs = js.Array[JobLog]
  type JobsList = js.Array[Job]
  type LargeBoundedString = String
  type LaunchConfigurationTemplateID = String
  type LaunchConfigurationTemplateIDs = js.Array[LaunchConfigurationTemplateID]
  type LaunchConfigurationTemplates = js.Array[LaunchConfigurationTemplate]
  type LifeCycleStates = js.Array[LifeCycleState]
  type MaxResultsType = Int
  type NetworkInterfaces = js.Array[NetworkInterface]
  type OperatingSystemString = String
  type OrderType = Int
  type PaginationToken = String
  type ParticipatingServers = js.Array[ParticipatingServer]
  type PositiveInteger = Double
  type PostLaunchActionsLaunchStatusList = js.Array[JobPostLaunchActionsLaunchStatus]
  type ReplicationConfigurationReplicatedDisks = js.Array[ReplicationConfigurationReplicatedDisk]
  type ReplicationConfigurationTemplateID = String
  type ReplicationConfigurationTemplateIDs = js.Array[ReplicationConfigurationTemplateID]
  type ReplicationConfigurationTemplates = js.Array[ReplicationConfigurationTemplate]
  type ReplicationServersSecurityGroupsIDs = js.Array[SecurityGroupID]
  type ReplicationTypes = js.Array[ReplicationType]
  type S3LogBucketName = String
  type SecurityGroupID = String
  type SmallBoundedString = String
  type SourceServerActionDocuments = js.Array[SourceServerActionDocument]
  type SourceServerID = String
  type SourceServersList = js.Array[SourceServer]
  type SsmDocumentName = String
  type SsmDocumentParameterName = String
  type SsmDocumentParameters = js.Dictionary[SsmParameterStoreParameters]
  type SsmDocuments = js.Array[SsmDocument]
  type SsmParameterStoreParameterName = String
  type SsmParameterStoreParameters = js.Array[SsmParameterStoreParameter]
  type StartCutoverRequestSourceServerIDs = js.Array[SourceServerID]
  type StartTestRequestSourceServerIDs = js.Array[SourceServerID]
  type StrictlyPositiveInteger = Int
  type SubnetID = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type TagsMap = js.Dictionary[TagValue]
  type TemplateActionDocuments = js.Array[TemplateActionDocument]
  type TerminateTargetInstancesRequestSourceServerIDs = js.Array[SourceServerID]
  type VcenterClientID = String
  type VcenterClientList = js.Array[VcenterClient]
  type WaveDescription = String
  type WaveID = String
  type WaveIDsFilter = js.Array[WaveID]
  type WaveName = String
  type WavesList = js.Array[Wave]

  final class MgnOps(private val service: Mgn) extends AnyVal {

    @inline def archiveApplicationFuture(params: ArchiveApplicationRequest): Future[Application] = service.archiveApplication(params).promise().toFuture
    @inline def archiveWaveFuture(params: ArchiveWaveRequest): Future[Wave] = service.archiveWave(params).promise().toFuture
    @inline def associateApplicationsFuture(params: AssociateApplicationsRequest): Future[AssociateApplicationsResponse] = service.associateApplications(params).promise().toFuture
    @inline def associateSourceServersFuture(params: AssociateSourceServersRequest): Future[AssociateSourceServersResponse] = service.associateSourceServers(params).promise().toFuture
    @inline def changeServerLifeCycleStateFuture(params: ChangeServerLifeCycleStateRequest): Future[SourceServer] = service.changeServerLifeCycleState(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[Application] = service.createApplication(params).promise().toFuture
    @inline def createLaunchConfigurationTemplateFuture(params: CreateLaunchConfigurationTemplateRequest): Future[LaunchConfigurationTemplate] = service.createLaunchConfigurationTemplate(params).promise().toFuture
    @inline def createReplicationConfigurationTemplateFuture(params: CreateReplicationConfigurationTemplateRequest): Future[ReplicationConfigurationTemplate] = service.createReplicationConfigurationTemplate(params).promise().toFuture
    @inline def createWaveFuture(params: CreateWaveRequest): Future[Wave] = service.createWave(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] = service.deleteApplication(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResponse] = service.deleteJob(params).promise().toFuture
    @inline def deleteLaunchConfigurationTemplateFuture(params: DeleteLaunchConfigurationTemplateRequest): Future[DeleteLaunchConfigurationTemplateResponse] = service.deleteLaunchConfigurationTemplate(params).promise().toFuture
    @inline def deleteReplicationConfigurationTemplateFuture(params: DeleteReplicationConfigurationTemplateRequest): Future[DeleteReplicationConfigurationTemplateResponse] = service.deleteReplicationConfigurationTemplate(params).promise().toFuture
    @inline def deleteSourceServerFuture(params: DeleteSourceServerRequest): Future[DeleteSourceServerResponse] = service.deleteSourceServer(params).promise().toFuture
    @inline def deleteVcenterClientFuture(params: DeleteVcenterClientRequest): Future[js.Object] = service.deleteVcenterClient(params).promise().toFuture
    @inline def deleteWaveFuture(params: DeleteWaveRequest): Future[DeleteWaveResponse] = service.deleteWave(params).promise().toFuture
    @inline def describeJobLogItemsFuture(params: DescribeJobLogItemsRequest): Future[DescribeJobLogItemsResponse] = service.describeJobLogItems(params).promise().toFuture
    @inline def describeJobsFuture(params: DescribeJobsRequest): Future[DescribeJobsResponse] = service.describeJobs(params).promise().toFuture
    @inline def describeLaunchConfigurationTemplatesFuture(params: DescribeLaunchConfigurationTemplatesRequest): Future[DescribeLaunchConfigurationTemplatesResponse] = service.describeLaunchConfigurationTemplates(params).promise().toFuture
    @inline def describeReplicationConfigurationTemplatesFuture(params: DescribeReplicationConfigurationTemplatesRequest): Future[DescribeReplicationConfigurationTemplatesResponse] = service.describeReplicationConfigurationTemplates(params).promise().toFuture
    @inline def describeSourceServersFuture(params: DescribeSourceServersRequest): Future[DescribeSourceServersResponse] = service.describeSourceServers(params).promise().toFuture
    @inline def describeVcenterClientsFuture(params: DescribeVcenterClientsRequest): Future[DescribeVcenterClientsResponse] = service.describeVcenterClients(params).promise().toFuture
    @inline def disassociateApplicationsFuture(params: DisassociateApplicationsRequest): Future[DisassociateApplicationsResponse] = service.disassociateApplications(params).promise().toFuture
    @inline def disassociateSourceServersFuture(params: DisassociateSourceServersRequest): Future[DisassociateSourceServersResponse] = service.disassociateSourceServers(params).promise().toFuture
    @inline def disconnectFromServiceFuture(params: DisconnectFromServiceRequest): Future[SourceServer] = service.disconnectFromService(params).promise().toFuture
    @inline def finalizeCutoverFuture(params: FinalizeCutoverRequest): Future[SourceServer] = service.finalizeCutover(params).promise().toFuture
    @inline def getLaunchConfigurationFuture(params: GetLaunchConfigurationRequest): Future[LaunchConfiguration] = service.getLaunchConfiguration(params).promise().toFuture
    @inline def getReplicationConfigurationFuture(params: GetReplicationConfigurationRequest): Future[ReplicationConfiguration] = service.getReplicationConfiguration(params).promise().toFuture
    @inline def initializeServiceFuture(params: InitializeServiceRequest): Future[InitializeServiceResponse] = service.initializeService(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] = service.listApplications(params).promise().toFuture
    @inline def listSourceServerActionsFuture(params: ListSourceServerActionsRequest): Future[ListSourceServerActionsResponse] = service.listSourceServerActions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTemplateActionsFuture(params: ListTemplateActionsRequest): Future[ListTemplateActionsResponse] = service.listTemplateActions(params).promise().toFuture
    @inline def listWavesFuture(params: ListWavesRequest): Future[ListWavesResponse] = service.listWaves(params).promise().toFuture
    @inline def markAsArchivedFuture(params: MarkAsArchivedRequest): Future[SourceServer] = service.markAsArchived(params).promise().toFuture
    @inline def putSourceServerActionFuture(params: PutSourceServerActionRequest): Future[SourceServerActionDocument] = service.putSourceServerAction(params).promise().toFuture
    @inline def putTemplateActionFuture(params: PutTemplateActionRequest): Future[TemplateActionDocument] = service.putTemplateAction(params).promise().toFuture
    @inline def removeSourceServerActionFuture(params: RemoveSourceServerActionRequest): Future[RemoveSourceServerActionResponse] = service.removeSourceServerAction(params).promise().toFuture
    @inline def removeTemplateActionFuture(params: RemoveTemplateActionRequest): Future[RemoveTemplateActionResponse] = service.removeTemplateAction(params).promise().toFuture
    @inline def retryDataReplicationFuture(params: RetryDataReplicationRequest): Future[SourceServer] = service.retryDataReplication(params).promise().toFuture
    @inline def startCutoverFuture(params: StartCutoverRequest): Future[StartCutoverResponse] = service.startCutover(params).promise().toFuture
    @inline def startReplicationFuture(params: StartReplicationRequest): Future[SourceServer] = service.startReplication(params).promise().toFuture
    @inline def startTestFuture(params: StartTestRequest): Future[StartTestResponse] = service.startTest(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def terminateTargetInstancesFuture(params: TerminateTargetInstancesRequest): Future[TerminateTargetInstancesResponse] = service.terminateTargetInstances(params).promise().toFuture
    @inline def unarchiveApplicationFuture(params: UnarchiveApplicationRequest): Future[Application] = service.unarchiveApplication(params).promise().toFuture
    @inline def unarchiveWaveFuture(params: UnarchiveWaveRequest): Future[Wave] = service.unarchiveWave(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[Application] = service.updateApplication(params).promise().toFuture
    @inline def updateLaunchConfigurationFuture(params: UpdateLaunchConfigurationRequest): Future[LaunchConfiguration] = service.updateLaunchConfiguration(params).promise().toFuture
    @inline def updateLaunchConfigurationTemplateFuture(params: UpdateLaunchConfigurationTemplateRequest): Future[LaunchConfigurationTemplate] = service.updateLaunchConfigurationTemplate(params).promise().toFuture
    @inline def updateReplicationConfigurationFuture(params: UpdateReplicationConfigurationRequest): Future[ReplicationConfiguration] = service.updateReplicationConfiguration(params).promise().toFuture
    @inline def updateReplicationConfigurationTemplateFuture(params: UpdateReplicationConfigurationTemplateRequest): Future[ReplicationConfigurationTemplate] = service.updateReplicationConfigurationTemplate(params).promise().toFuture
    @inline def updateSourceServerReplicationTypeFuture(params: UpdateSourceServerReplicationTypeRequest): Future[SourceServer] = service.updateSourceServerReplicationType(params).promise().toFuture
    @inline def updateWaveFuture(params: UpdateWaveRequest): Future[Wave] = service.updateWave(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/mgn", JSImport.Namespace, "AWS.Mgn")
  class Mgn() extends js.Object {
    def this(config: AWSConfig) = this()

    def archiveApplication(params: ArchiveApplicationRequest): Request[Application] = js.native
    def archiveWave(params: ArchiveWaveRequest): Request[Wave] = js.native
    def associateApplications(params: AssociateApplicationsRequest): Request[AssociateApplicationsResponse] = js.native
    def associateSourceServers(params: AssociateSourceServersRequest): Request[AssociateSourceServersResponse] = js.native
    def changeServerLifeCycleState(params: ChangeServerLifeCycleStateRequest): Request[SourceServer] = js.native
    def createApplication(params: CreateApplicationRequest): Request[Application] = js.native
    def createLaunchConfigurationTemplate(params: CreateLaunchConfigurationTemplateRequest): Request[LaunchConfigurationTemplate] = js.native
    def createReplicationConfigurationTemplate(params: CreateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate] = js.native
    def createWave(params: CreateWaveRequest): Request[Wave] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse] = js.native
    def deleteLaunchConfigurationTemplate(params: DeleteLaunchConfigurationTemplateRequest): Request[DeleteLaunchConfigurationTemplateResponse] = js.native
    def deleteReplicationConfigurationTemplate(params: DeleteReplicationConfigurationTemplateRequest): Request[DeleteReplicationConfigurationTemplateResponse] = js.native
    def deleteSourceServer(params: DeleteSourceServerRequest): Request[DeleteSourceServerResponse] = js.native
    def deleteVcenterClient(params: DeleteVcenterClientRequest): Request[js.Object] = js.native
    def deleteWave(params: DeleteWaveRequest): Request[DeleteWaveResponse] = js.native
    def describeJobLogItems(params: DescribeJobLogItemsRequest): Request[DescribeJobLogItemsResponse] = js.native
    def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse] = js.native
    def describeLaunchConfigurationTemplates(params: DescribeLaunchConfigurationTemplatesRequest): Request[DescribeLaunchConfigurationTemplatesResponse] = js.native
    def describeReplicationConfigurationTemplates(params: DescribeReplicationConfigurationTemplatesRequest): Request[DescribeReplicationConfigurationTemplatesResponse] = js.native
    def describeSourceServers(params: DescribeSourceServersRequest): Request[DescribeSourceServersResponse] = js.native
    def describeVcenterClients(params: DescribeVcenterClientsRequest): Request[DescribeVcenterClientsResponse] = js.native
    def disassociateApplications(params: DisassociateApplicationsRequest): Request[DisassociateApplicationsResponse] = js.native
    def disassociateSourceServers(params: DisassociateSourceServersRequest): Request[DisassociateSourceServersResponse] = js.native
    def disconnectFromService(params: DisconnectFromServiceRequest): Request[SourceServer] = js.native
    def finalizeCutover(params: FinalizeCutoverRequest): Request[SourceServer] = js.native
    def getLaunchConfiguration(params: GetLaunchConfigurationRequest): Request[LaunchConfiguration] = js.native
    def getReplicationConfiguration(params: GetReplicationConfigurationRequest): Request[ReplicationConfiguration] = js.native
    def initializeService(params: InitializeServiceRequest): Request[InitializeServiceResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listSourceServerActions(params: ListSourceServerActionsRequest): Request[ListSourceServerActionsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTemplateActions(params: ListTemplateActionsRequest): Request[ListTemplateActionsResponse] = js.native
    def listWaves(params: ListWavesRequest): Request[ListWavesResponse] = js.native
    def markAsArchived(params: MarkAsArchivedRequest): Request[SourceServer] = js.native
    def putSourceServerAction(params: PutSourceServerActionRequest): Request[SourceServerActionDocument] = js.native
    def putTemplateAction(params: PutTemplateActionRequest): Request[TemplateActionDocument] = js.native
    def removeSourceServerAction(params: RemoveSourceServerActionRequest): Request[RemoveSourceServerActionResponse] = js.native
    def removeTemplateAction(params: RemoveTemplateActionRequest): Request[RemoveTemplateActionResponse] = js.native
    def retryDataReplication(params: RetryDataReplicationRequest): Request[SourceServer] = js.native
    def startCutover(params: StartCutoverRequest): Request[StartCutoverResponse] = js.native
    def startReplication(params: StartReplicationRequest): Request[SourceServer] = js.native
    def startTest(params: StartTestRequest): Request[StartTestResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def terminateTargetInstances(params: TerminateTargetInstancesRequest): Request[TerminateTargetInstancesResponse] = js.native
    def unarchiveApplication(params: UnarchiveApplicationRequest): Request[Application] = js.native
    def unarchiveWave(params: UnarchiveWaveRequest): Request[Wave] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[Application] = js.native
    def updateLaunchConfiguration(params: UpdateLaunchConfigurationRequest): Request[LaunchConfiguration] = js.native
    def updateLaunchConfigurationTemplate(params: UpdateLaunchConfigurationTemplateRequest): Request[LaunchConfigurationTemplate] = js.native
    def updateReplicationConfiguration(params: UpdateReplicationConfigurationRequest): Request[ReplicationConfiguration] = js.native
    def updateReplicationConfigurationTemplate(params: UpdateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate] = js.native
    def updateSourceServerReplicationType(params: UpdateSourceServerReplicationTypeRequest): Request[SourceServer] = js.native
    def updateWave(params: UpdateWaveRequest): Request[Wave] = js.native
  }
  object Mgn {
    @inline implicit def toOps(service: Mgn): MgnOps = {
      new MgnOps(service)
    }
  }

  @js.native
  trait Application extends js.Object {
    var applicationAggregatedStatus: js.UndefOr[ApplicationAggregatedStatus]
    var applicationID: js.UndefOr[ApplicationID]
    var arn: js.UndefOr[ARN]
    var creationDateTime: js.UndefOr[ISO8601DatetimeString]
    var description: js.UndefOr[ApplicationDescription]
    var isArchived: js.UndefOr[Boolean]
    var lastModifiedDateTime: js.UndefOr[ISO8601DatetimeString]
    var name: js.UndefOr[ApplicationName]
    var tags: js.UndefOr[TagsMap]
    var waveID: js.UndefOr[WaveID]
  }

  object Application {
    @inline
    def apply(
        applicationAggregatedStatus: js.UndefOr[ApplicationAggregatedStatus] = js.undefined,
        applicationID: js.UndefOr[ApplicationID] = js.undefined,
        arn: js.UndefOr[ARN] = js.undefined,
        creationDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        description: js.UndefOr[ApplicationDescription] = js.undefined,
        isArchived: js.UndefOr[Boolean] = js.undefined,
        lastModifiedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        name: js.UndefOr[ApplicationName] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        waveID: js.UndefOr[WaveID] = js.undefined
    ): Application = {
      val __obj = js.Dynamic.literal()
      applicationAggregatedStatus.foreach(__v => __obj.updateDynamic("applicationAggregatedStatus")(__v.asInstanceOf[js.Any]))
      applicationID.foreach(__v => __obj.updateDynamic("applicationID")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      isArchived.foreach(__v => __obj.updateDynamic("isArchived")(__v.asInstanceOf[js.Any]))
      lastModifiedDateTime.foreach(__v => __obj.updateDynamic("lastModifiedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      waveID.foreach(__v => __obj.updateDynamic("waveID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Application]
    }
  }

  /** Application aggregated status.
    */
  @js.native
  trait ApplicationAggregatedStatus extends js.Object {
    var healthStatus: js.UndefOr[ApplicationHealthStatus]
    var lastUpdateDateTime: js.UndefOr[ISO8601DatetimeString]
    var progressStatus: js.UndefOr[ApplicationProgressStatus]
    var totalSourceServers: js.UndefOr[PositiveInteger]
  }

  object ApplicationAggregatedStatus {
    @inline
    def apply(
        healthStatus: js.UndefOr[ApplicationHealthStatus] = js.undefined,
        lastUpdateDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        progressStatus: js.UndefOr[ApplicationProgressStatus] = js.undefined,
        totalSourceServers: js.UndefOr[PositiveInteger] = js.undefined
    ): ApplicationAggregatedStatus = {
      val __obj = js.Dynamic.literal()
      healthStatus.foreach(__v => __obj.updateDynamic("healthStatus")(__v.asInstanceOf[js.Any]))
      lastUpdateDateTime.foreach(__v => __obj.updateDynamic("lastUpdateDateTime")(__v.asInstanceOf[js.Any]))
      progressStatus.foreach(__v => __obj.updateDynamic("progressStatus")(__v.asInstanceOf[js.Any]))
      totalSourceServers.foreach(__v => __obj.updateDynamic("totalSourceServers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationAggregatedStatus]
    }
  }

  @js.native
  trait ArchiveApplicationRequest extends js.Object {
    var applicationID: ApplicationID
  }

  object ArchiveApplicationRequest {
    @inline
    def apply(
        applicationID: ApplicationID
    ): ArchiveApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationID" -> applicationID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArchiveApplicationRequest]
    }
  }

  @js.native
  trait ArchiveWaveRequest extends js.Object {
    var waveID: WaveID
  }

  object ArchiveWaveRequest {
    @inline
    def apply(
        waveID: WaveID
    ): ArchiveWaveRequest = {
      val __obj = js.Dynamic.literal(
        "waveID" -> waveID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArchiveWaveRequest]
    }
  }

  @js.native
  trait AssociateApplicationsRequest extends js.Object {
    var applicationIDs: ApplicationIDs
    var waveID: WaveID
  }

  object AssociateApplicationsRequest {
    @inline
    def apply(
        applicationIDs: ApplicationIDs,
        waveID: WaveID
    ): AssociateApplicationsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationIDs" -> applicationIDs.asInstanceOf[js.Any],
        "waveID" -> waveID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateApplicationsRequest]
    }
  }

  @js.native
  trait AssociateApplicationsResponse extends js.Object

  object AssociateApplicationsResponse {
    @inline
    def apply(): AssociateApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateApplicationsResponse]
    }
  }

  @js.native
  trait AssociateSourceServersRequest extends js.Object {
    var applicationID: ApplicationID
    var sourceServerIDs: AssociateSourceServersRequestSourceServerIDs
  }

  object AssociateSourceServersRequest {
    @inline
    def apply(
        applicationID: ApplicationID,
        sourceServerIDs: AssociateSourceServersRequestSourceServerIDs
    ): AssociateSourceServersRequest = {
      val __obj = js.Dynamic.literal(
        "applicationID" -> applicationID.asInstanceOf[js.Any],
        "sourceServerIDs" -> sourceServerIDs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateSourceServersRequest]
    }
  }

  @js.native
  trait AssociateSourceServersResponse extends js.Object

  object AssociateSourceServersResponse {
    @inline
    def apply(): AssociateSourceServersResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateSourceServersResponse]
    }
  }

  /** Source server CPU information.
    */
  @js.native
  trait CPU extends js.Object {
    var cores: js.UndefOr[PositiveInteger]
    var modelName: js.UndefOr[BoundedString]
  }

  object CPU {
    @inline
    def apply(
        cores: js.UndefOr[PositiveInteger] = js.undefined,
        modelName: js.UndefOr[BoundedString] = js.undefined
    ): CPU = {
      val __obj = js.Dynamic.literal()
      cores.foreach(__v => __obj.updateDynamic("cores")(__v.asInstanceOf[js.Any]))
      modelName.foreach(__v => __obj.updateDynamic("modelName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CPU]
    }
  }

  @js.native
  trait ChangeServerLifeCycleStateRequest extends js.Object {
    var lifeCycle: ChangeServerLifeCycleStateSourceServerLifecycle
    var sourceServerID: SourceServerID
  }

  object ChangeServerLifeCycleStateRequest {
    @inline
    def apply(
        lifeCycle: ChangeServerLifeCycleStateSourceServerLifecycle,
        sourceServerID: SourceServerID
    ): ChangeServerLifeCycleStateRequest = {
      val __obj = js.Dynamic.literal(
        "lifeCycle" -> lifeCycle.asInstanceOf[js.Any],
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ChangeServerLifeCycleStateRequest]
    }
  }

  /** The request to change the source server migration lifecycle state.
    */
  @js.native
  trait ChangeServerLifeCycleStateSourceServerLifecycle extends js.Object {
    var state: ChangeServerLifeCycleStateSourceServerLifecycleState
  }

  object ChangeServerLifeCycleStateSourceServerLifecycle {
    @inline
    def apply(
        state: ChangeServerLifeCycleStateSourceServerLifecycleState
    ): ChangeServerLifeCycleStateSourceServerLifecycle = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ChangeServerLifeCycleStateSourceServerLifecycle]
    }
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var name: ApplicationName
    var description: js.UndefOr[ApplicationDescription]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        name: ApplicationName,
        description: js.UndefOr[ApplicationDescription] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateLaunchConfigurationTemplateRequest extends js.Object {
    var associatePublicIpAddress: js.UndefOr[Boolean]
    var bootMode: js.UndefOr[BootMode]
    var copyPrivateIp: js.UndefOr[Boolean]
    var copyTags: js.UndefOr[Boolean]
    var enableMapAutoTagging: js.UndefOr[Boolean]
    var largeVolumeConf: js.UndefOr[LaunchTemplateDiskConf]
    var launchDisposition: js.UndefOr[LaunchDisposition]
    var licensing: js.UndefOr[Licensing]
    var mapAutoTaggingMpeID: js.UndefOr[TagValue]
    var postLaunchActions: js.UndefOr[PostLaunchActions]
    var smallVolumeConf: js.UndefOr[LaunchTemplateDiskConf]
    var smallVolumeMaxSize: js.UndefOr[PositiveInteger]
    var tags: js.UndefOr[TagsMap]
    var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod]
  }

  object CreateLaunchConfigurationTemplateRequest {
    @inline
    def apply(
        associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
        bootMode: js.UndefOr[BootMode] = js.undefined,
        copyPrivateIp: js.UndefOr[Boolean] = js.undefined,
        copyTags: js.UndefOr[Boolean] = js.undefined,
        enableMapAutoTagging: js.UndefOr[Boolean] = js.undefined,
        largeVolumeConf: js.UndefOr[LaunchTemplateDiskConf] = js.undefined,
        launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined,
        licensing: js.UndefOr[Licensing] = js.undefined,
        mapAutoTaggingMpeID: js.UndefOr[TagValue] = js.undefined,
        postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined,
        smallVolumeConf: js.UndefOr[LaunchTemplateDiskConf] = js.undefined,
        smallVolumeMaxSize: js.UndefOr[PositiveInteger] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
    ): CreateLaunchConfigurationTemplateRequest = {
      val __obj = js.Dynamic.literal()
      associatePublicIpAddress.foreach(__v => __obj.updateDynamic("associatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      bootMode.foreach(__v => __obj.updateDynamic("bootMode")(__v.asInstanceOf[js.Any]))
      copyPrivateIp.foreach(__v => __obj.updateDynamic("copyPrivateIp")(__v.asInstanceOf[js.Any]))
      copyTags.foreach(__v => __obj.updateDynamic("copyTags")(__v.asInstanceOf[js.Any]))
      enableMapAutoTagging.foreach(__v => __obj.updateDynamic("enableMapAutoTagging")(__v.asInstanceOf[js.Any]))
      largeVolumeConf.foreach(__v => __obj.updateDynamic("largeVolumeConf")(__v.asInstanceOf[js.Any]))
      launchDisposition.foreach(__v => __obj.updateDynamic("launchDisposition")(__v.asInstanceOf[js.Any]))
      licensing.foreach(__v => __obj.updateDynamic("licensing")(__v.asInstanceOf[js.Any]))
      mapAutoTaggingMpeID.foreach(__v => __obj.updateDynamic("mapAutoTaggingMpeID")(__v.asInstanceOf[js.Any]))
      postLaunchActions.foreach(__v => __obj.updateDynamic("postLaunchActions")(__v.asInstanceOf[js.Any]))
      smallVolumeConf.foreach(__v => __obj.updateDynamic("smallVolumeConf")(__v.asInstanceOf[js.Any]))
      smallVolumeMaxSize.foreach(__v => __obj.updateDynamic("smallVolumeMaxSize")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targetInstanceTypeRightSizingMethod.foreach(__v => __obj.updateDynamic("targetInstanceTypeRightSizingMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLaunchConfigurationTemplateRequest]
    }
  }

  @js.native
  trait CreateReplicationConfigurationTemplateRequest extends js.Object {
    var associateDefaultSecurityGroup: Boolean
    var bandwidthThrottling: PositiveInteger
    var createPublicIP: Boolean
    var dataPlaneRouting: ReplicationConfigurationDataPlaneRouting
    var defaultLargeStagingDiskType: ReplicationConfigurationDefaultLargeStagingDiskType
    var ebsEncryption: ReplicationConfigurationEbsEncryption
    var replicationServerInstanceType: EC2InstanceType
    var replicationServersSecurityGroupsIDs: ReplicationServersSecurityGroupsIDs
    var stagingAreaSubnetId: SubnetID
    var stagingAreaTags: TagsMap
    var useDedicatedReplicationServer: Boolean
    var ebsEncryptionKeyArn: js.UndefOr[ARN]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateReplicationConfigurationTemplateRequest {
    @inline
    def apply(
        associateDefaultSecurityGroup: Boolean,
        bandwidthThrottling: PositiveInteger,
        createPublicIP: Boolean,
        dataPlaneRouting: ReplicationConfigurationDataPlaneRouting,
        defaultLargeStagingDiskType: ReplicationConfigurationDefaultLargeStagingDiskType,
        ebsEncryption: ReplicationConfigurationEbsEncryption,
        replicationServerInstanceType: EC2InstanceType,
        replicationServersSecurityGroupsIDs: ReplicationServersSecurityGroupsIDs,
        stagingAreaSubnetId: SubnetID,
        stagingAreaTags: TagsMap,
        useDedicatedReplicationServer: Boolean,
        ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateReplicationConfigurationTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "associateDefaultSecurityGroup" -> associateDefaultSecurityGroup.asInstanceOf[js.Any],
        "bandwidthThrottling" -> bandwidthThrottling.asInstanceOf[js.Any],
        "createPublicIP" -> createPublicIP.asInstanceOf[js.Any],
        "dataPlaneRouting" -> dataPlaneRouting.asInstanceOf[js.Any],
        "defaultLargeStagingDiskType" -> defaultLargeStagingDiskType.asInstanceOf[js.Any],
        "ebsEncryption" -> ebsEncryption.asInstanceOf[js.Any],
        "replicationServerInstanceType" -> replicationServerInstanceType.asInstanceOf[js.Any],
        "replicationServersSecurityGroupsIDs" -> replicationServersSecurityGroupsIDs.asInstanceOf[js.Any],
        "stagingAreaSubnetId" -> stagingAreaSubnetId.asInstanceOf[js.Any],
        "stagingAreaTags" -> stagingAreaTags.asInstanceOf[js.Any],
        "useDedicatedReplicationServer" -> useDedicatedReplicationServer.asInstanceOf[js.Any]
      )

      ebsEncryptionKeyArn.foreach(__v => __obj.updateDynamic("ebsEncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationConfigurationTemplateRequest]
    }
  }

  @js.native
  trait CreateWaveRequest extends js.Object {
    var name: WaveName
    var description: js.UndefOr[WaveDescription]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateWaveRequest {
    @inline
    def apply(
        name: WaveName,
        description: js.UndefOr[WaveDescription] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateWaveRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWaveRequest]
    }
  }

  /** Error in data replication.
    */
  @js.native
  trait DataReplicationError extends js.Object {
    var error: js.UndefOr[DataReplicationErrorString]
    var rawError: js.UndefOr[LargeBoundedString]
  }

  object DataReplicationError {
    @inline
    def apply(
        error: js.UndefOr[DataReplicationErrorString] = js.undefined,
        rawError: js.UndefOr[LargeBoundedString] = js.undefined
    ): DataReplicationError = {
      val __obj = js.Dynamic.literal()
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      rawError.foreach(__v => __obj.updateDynamic("rawError")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataReplicationError]
    }
  }

  /** Request data replication info.
    */
  @js.native
  trait DataReplicationInfo extends js.Object {
    var dataReplicationError: js.UndefOr[DataReplicationError]
    var dataReplicationInitiation: js.UndefOr[DataReplicationInitiation]
    var dataReplicationState: js.UndefOr[DataReplicationState]
    var etaDateTime: js.UndefOr[ISO8601DatetimeString]
    var lagDuration: js.UndefOr[ISO8601DurationString]
    var lastSnapshotDateTime: js.UndefOr[ISO8601DatetimeString]
    var replicatedDisks: js.UndefOr[DataReplicationInfoReplicatedDisks]
  }

  object DataReplicationInfo {
    @inline
    def apply(
        dataReplicationError: js.UndefOr[DataReplicationError] = js.undefined,
        dataReplicationInitiation: js.UndefOr[DataReplicationInitiation] = js.undefined,
        dataReplicationState: js.UndefOr[DataReplicationState] = js.undefined,
        etaDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        lagDuration: js.UndefOr[ISO8601DurationString] = js.undefined,
        lastSnapshotDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        replicatedDisks: js.UndefOr[DataReplicationInfoReplicatedDisks] = js.undefined
    ): DataReplicationInfo = {
      val __obj = js.Dynamic.literal()
      dataReplicationError.foreach(__v => __obj.updateDynamic("dataReplicationError")(__v.asInstanceOf[js.Any]))
      dataReplicationInitiation.foreach(__v => __obj.updateDynamic("dataReplicationInitiation")(__v.asInstanceOf[js.Any]))
      dataReplicationState.foreach(__v => __obj.updateDynamic("dataReplicationState")(__v.asInstanceOf[js.Any]))
      etaDateTime.foreach(__v => __obj.updateDynamic("etaDateTime")(__v.asInstanceOf[js.Any]))
      lagDuration.foreach(__v => __obj.updateDynamic("lagDuration")(__v.asInstanceOf[js.Any]))
      lastSnapshotDateTime.foreach(__v => __obj.updateDynamic("lastSnapshotDateTime")(__v.asInstanceOf[js.Any]))
      replicatedDisks.foreach(__v => __obj.updateDynamic("replicatedDisks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataReplicationInfo]
    }
  }

  /** Request to query disks replicated.
    */
  @js.native
  trait DataReplicationInfoReplicatedDisk extends js.Object {
    var backloggedStorageBytes: js.UndefOr[PositiveInteger]
    var deviceName: js.UndefOr[BoundedString]
    var replicatedStorageBytes: js.UndefOr[PositiveInteger]
    var rescannedStorageBytes: js.UndefOr[PositiveInteger]
    var totalStorageBytes: js.UndefOr[PositiveInteger]
  }

  object DataReplicationInfoReplicatedDisk {
    @inline
    def apply(
        backloggedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined,
        deviceName: js.UndefOr[BoundedString] = js.undefined,
        replicatedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined,
        rescannedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined,
        totalStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
    ): DataReplicationInfoReplicatedDisk = {
      val __obj = js.Dynamic.literal()
      backloggedStorageBytes.foreach(__v => __obj.updateDynamic("backloggedStorageBytes")(__v.asInstanceOf[js.Any]))
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      replicatedStorageBytes.foreach(__v => __obj.updateDynamic("replicatedStorageBytes")(__v.asInstanceOf[js.Any]))
      rescannedStorageBytes.foreach(__v => __obj.updateDynamic("rescannedStorageBytes")(__v.asInstanceOf[js.Any]))
      totalStorageBytes.foreach(__v => __obj.updateDynamic("totalStorageBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataReplicationInfoReplicatedDisk]
    }
  }

  /** Data replication initiation.
    */
  @js.native
  trait DataReplicationInitiation extends js.Object {
    var nextAttemptDateTime: js.UndefOr[ISO8601DatetimeString]
    var startDateTime: js.UndefOr[ISO8601DatetimeString]
    var steps: js.UndefOr[DataReplicationInitiationSteps]
  }

  object DataReplicationInitiation {
    @inline
    def apply(
        nextAttemptDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        startDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        steps: js.UndefOr[DataReplicationInitiationSteps] = js.undefined
    ): DataReplicationInitiation = {
      val __obj = js.Dynamic.literal()
      nextAttemptDateTime.foreach(__v => __obj.updateDynamic("nextAttemptDateTime")(__v.asInstanceOf[js.Any]))
      startDateTime.foreach(__v => __obj.updateDynamic("startDateTime")(__v.asInstanceOf[js.Any]))
      steps.foreach(__v => __obj.updateDynamic("steps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataReplicationInitiation]
    }
  }

  /** Data replication initiation step.
    */
  @js.native
  trait DataReplicationInitiationStep extends js.Object {
    var name: js.UndefOr[DataReplicationInitiationStepName]
    var status: js.UndefOr[DataReplicationInitiationStepStatus]
  }

  object DataReplicationInitiationStep {
    @inline
    def apply(
        name: js.UndefOr[DataReplicationInitiationStepName] = js.undefined,
        status: js.UndefOr[DataReplicationInitiationStepStatus] = js.undefined
    ): DataReplicationInitiationStep = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataReplicationInitiationStep]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var applicationID: ApplicationID
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        applicationID: ApplicationID
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationID" -> applicationID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResponse extends js.Object

  object DeleteApplicationResponse {
    @inline
    def apply(): DeleteApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationResponse]
    }
  }

  @js.native
  trait DeleteJobRequest extends js.Object {
    var jobID: JobID
  }

  object DeleteJobRequest {
    @inline
    def apply(
        jobID: JobID
    ): DeleteJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobID" -> jobID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJobRequest]
    }
  }

  @js.native
  trait DeleteJobResponse extends js.Object

  object DeleteJobResponse {
    @inline
    def apply(): DeleteJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteJobResponse]
    }
  }

  @js.native
  trait DeleteLaunchConfigurationTemplateRequest extends js.Object {
    var launchConfigurationTemplateID: LaunchConfigurationTemplateID
  }

  object DeleteLaunchConfigurationTemplateRequest {
    @inline
    def apply(
        launchConfigurationTemplateID: LaunchConfigurationTemplateID
    ): DeleteLaunchConfigurationTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "launchConfigurationTemplateID" -> launchConfigurationTemplateID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLaunchConfigurationTemplateRequest]
    }
  }

  @js.native
  trait DeleteLaunchConfigurationTemplateResponse extends js.Object

  object DeleteLaunchConfigurationTemplateResponse {
    @inline
    def apply(): DeleteLaunchConfigurationTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLaunchConfigurationTemplateResponse]
    }
  }

  @js.native
  trait DeleteReplicationConfigurationTemplateRequest extends js.Object {
    var replicationConfigurationTemplateID: ReplicationConfigurationTemplateID
  }

  object DeleteReplicationConfigurationTemplateRequest {
    @inline
    def apply(
        replicationConfigurationTemplateID: ReplicationConfigurationTemplateID
    ): DeleteReplicationConfigurationTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "replicationConfigurationTemplateID" -> replicationConfigurationTemplateID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReplicationConfigurationTemplateRequest]
    }
  }

  @js.native
  trait DeleteReplicationConfigurationTemplateResponse extends js.Object

  object DeleteReplicationConfigurationTemplateResponse {
    @inline
    def apply(): DeleteReplicationConfigurationTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteReplicationConfigurationTemplateResponse]
    }
  }

  @js.native
  trait DeleteSourceServerRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object DeleteSourceServerRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): DeleteSourceServerRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSourceServerRequest]
    }
  }

  @js.native
  trait DeleteSourceServerResponse extends js.Object

  object DeleteSourceServerResponse {
    @inline
    def apply(): DeleteSourceServerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSourceServerResponse]
    }
  }

  @js.native
  trait DeleteVcenterClientRequest extends js.Object {
    var vcenterClientID: VcenterClientID
  }

  object DeleteVcenterClientRequest {
    @inline
    def apply(
        vcenterClientID: VcenterClientID
    ): DeleteVcenterClientRequest = {
      val __obj = js.Dynamic.literal(
        "vcenterClientID" -> vcenterClientID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVcenterClientRequest]
    }
  }

  @js.native
  trait DeleteWaveRequest extends js.Object {
    var waveID: WaveID
  }

  object DeleteWaveRequest {
    @inline
    def apply(
        waveID: WaveID
    ): DeleteWaveRequest = {
      val __obj = js.Dynamic.literal(
        "waveID" -> waveID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWaveRequest]
    }
  }

  @js.native
  trait DeleteWaveResponse extends js.Object

  object DeleteWaveResponse {
    @inline
    def apply(): DeleteWaveResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWaveResponse]
    }
  }

  @js.native
  trait DescribeJobLogItemsRequest extends js.Object {
    var jobID: JobID
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeJobLogItemsRequest {
    @inline
    def apply(
        jobID: JobID,
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeJobLogItemsRequest = {
      val __obj = js.Dynamic.literal(
        "jobID" -> jobID.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobLogItemsRequest]
    }
  }

  @js.native
  trait DescribeJobLogItemsResponse extends js.Object {
    var items: js.UndefOr[JobLogs]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeJobLogItemsResponse {
    @inline
    def apply(
        items: js.UndefOr[JobLogs] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeJobLogItemsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobLogItemsResponse]
    }
  }

  @js.native
  trait DescribeJobsRequest extends js.Object {
    var filters: js.UndefOr[DescribeJobsRequestFilters]
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeJobsRequest {
    @inline
    def apply(
        filters: js.UndefOr[DescribeJobsRequestFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeJobsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobsRequest]
    }
  }

  /** Request to describe Job log filters.
    */
  @js.native
  trait DescribeJobsRequestFilters extends js.Object {
    var fromDate: js.UndefOr[ISO8601DatetimeString]
    var jobIDs: js.UndefOr[DescribeJobsRequestFiltersJobIDs]
    var toDate: js.UndefOr[ISO8601DatetimeString]
  }

  object DescribeJobsRequestFilters {
    @inline
    def apply(
        fromDate: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        jobIDs: js.UndefOr[DescribeJobsRequestFiltersJobIDs] = js.undefined,
        toDate: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): DescribeJobsRequestFilters = {
      val __obj = js.Dynamic.literal()
      fromDate.foreach(__v => __obj.updateDynamic("fromDate")(__v.asInstanceOf[js.Any]))
      jobIDs.foreach(__v => __obj.updateDynamic("jobIDs")(__v.asInstanceOf[js.Any]))
      toDate.foreach(__v => __obj.updateDynamic("toDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobsRequestFilters]
    }
  }

  @js.native
  trait DescribeJobsResponse extends js.Object {
    var items: js.UndefOr[JobsList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeJobsResponse {
    @inline
    def apply(
        items: js.UndefOr[JobsList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeJobsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobsResponse]
    }
  }

  @js.native
  trait DescribeLaunchConfigurationTemplatesRequest extends js.Object {
    var launchConfigurationTemplateIDs: js.UndefOr[LaunchConfigurationTemplateIDs]
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeLaunchConfigurationTemplatesRequest {
    @inline
    def apply(
        launchConfigurationTemplateIDs: js.UndefOr[LaunchConfigurationTemplateIDs] = js.undefined,
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeLaunchConfigurationTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      launchConfigurationTemplateIDs.foreach(__v => __obj.updateDynamic("launchConfigurationTemplateIDs")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLaunchConfigurationTemplatesRequest]
    }
  }

  @js.native
  trait DescribeLaunchConfigurationTemplatesResponse extends js.Object {
    var items: js.UndefOr[LaunchConfigurationTemplates]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeLaunchConfigurationTemplatesResponse {
    @inline
    def apply(
        items: js.UndefOr[LaunchConfigurationTemplates] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeLaunchConfigurationTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLaunchConfigurationTemplatesResponse]
    }
  }

  @js.native
  trait DescribeReplicationConfigurationTemplatesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
    var replicationConfigurationTemplateIDs: js.UndefOr[ReplicationConfigurationTemplateIDs]
  }

  object DescribeReplicationConfigurationTemplatesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        replicationConfigurationTemplateIDs: js.UndefOr[ReplicationConfigurationTemplateIDs] = js.undefined
    ): DescribeReplicationConfigurationTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      replicationConfigurationTemplateIDs.foreach(__v => __obj.updateDynamic("replicationConfigurationTemplateIDs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationConfigurationTemplatesRequest]
    }
  }

  @js.native
  trait DescribeReplicationConfigurationTemplatesResponse extends js.Object {
    var items: js.UndefOr[ReplicationConfigurationTemplates]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeReplicationConfigurationTemplatesResponse {
    @inline
    def apply(
        items: js.UndefOr[ReplicationConfigurationTemplates] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeReplicationConfigurationTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationConfigurationTemplatesResponse]
    }
  }

  @js.native
  trait DescribeSourceServersRequest extends js.Object {
    var filters: js.UndefOr[DescribeSourceServersRequestFilters]
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeSourceServersRequest {
    @inline
    def apply(
        filters: js.UndefOr[DescribeSourceServersRequestFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeSourceServersRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSourceServersRequest]
    }
  }

  /** Request to filter Source Servers list.
    */
  @js.native
  trait DescribeSourceServersRequestFilters extends js.Object {
    var applicationIDs: js.UndefOr[DescribeSourceServersRequestApplicationIDs]
    var isArchived: js.UndefOr[Boolean]
    var lifeCycleStates: js.UndefOr[LifeCycleStates]
    var replicationTypes: js.UndefOr[ReplicationTypes]
    var sourceServerIDs: js.UndefOr[DescribeSourceServersRequestFiltersIDs]
  }

  object DescribeSourceServersRequestFilters {
    @inline
    def apply(
        applicationIDs: js.UndefOr[DescribeSourceServersRequestApplicationIDs] = js.undefined,
        isArchived: js.UndefOr[Boolean] = js.undefined,
        lifeCycleStates: js.UndefOr[LifeCycleStates] = js.undefined,
        replicationTypes: js.UndefOr[ReplicationTypes] = js.undefined,
        sourceServerIDs: js.UndefOr[DescribeSourceServersRequestFiltersIDs] = js.undefined
    ): DescribeSourceServersRequestFilters = {
      val __obj = js.Dynamic.literal()
      applicationIDs.foreach(__v => __obj.updateDynamic("applicationIDs")(__v.asInstanceOf[js.Any]))
      isArchived.foreach(__v => __obj.updateDynamic("isArchived")(__v.asInstanceOf[js.Any]))
      lifeCycleStates.foreach(__v => __obj.updateDynamic("lifeCycleStates")(__v.asInstanceOf[js.Any]))
      replicationTypes.foreach(__v => __obj.updateDynamic("replicationTypes")(__v.asInstanceOf[js.Any]))
      sourceServerIDs.foreach(__v => __obj.updateDynamic("sourceServerIDs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSourceServersRequestFilters]
    }
  }

  @js.native
  trait DescribeSourceServersResponse extends js.Object {
    var items: js.UndefOr[SourceServersList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeSourceServersResponse {
    @inline
    def apply(
        items: js.UndefOr[SourceServersList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeSourceServersResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSourceServersResponse]
    }
  }

  @js.native
  trait DescribeVcenterClientsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeVcenterClientsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeVcenterClientsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVcenterClientsRequest]
    }
  }

  @js.native
  trait DescribeVcenterClientsResponse extends js.Object {
    var items: js.UndefOr[VcenterClientList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeVcenterClientsResponse {
    @inline
    def apply(
        items: js.UndefOr[VcenterClientList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeVcenterClientsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVcenterClientsResponse]
    }
  }

  @js.native
  trait DisassociateApplicationsRequest extends js.Object {
    var applicationIDs: ApplicationIDs
    var waveID: WaveID
  }

  object DisassociateApplicationsRequest {
    @inline
    def apply(
        applicationIDs: ApplicationIDs,
        waveID: WaveID
    ): DisassociateApplicationsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationIDs" -> applicationIDs.asInstanceOf[js.Any],
        "waveID" -> waveID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateApplicationsRequest]
    }
  }

  @js.native
  trait DisassociateApplicationsResponse extends js.Object

  object DisassociateApplicationsResponse {
    @inline
    def apply(): DisassociateApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateApplicationsResponse]
    }
  }

  @js.native
  trait DisassociateSourceServersRequest extends js.Object {
    var applicationID: ApplicationID
    var sourceServerIDs: DisassociateSourceServersRequestSourceServerIDs
  }

  object DisassociateSourceServersRequest {
    @inline
    def apply(
        applicationID: ApplicationID,
        sourceServerIDs: DisassociateSourceServersRequestSourceServerIDs
    ): DisassociateSourceServersRequest = {
      val __obj = js.Dynamic.literal(
        "applicationID" -> applicationID.asInstanceOf[js.Any],
        "sourceServerIDs" -> sourceServerIDs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateSourceServersRequest]
    }
  }

  @js.native
  trait DisassociateSourceServersResponse extends js.Object

  object DisassociateSourceServersResponse {
    @inline
    def apply(): DisassociateSourceServersResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateSourceServersResponse]
    }
  }

  @js.native
  trait DisconnectFromServiceRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object DisconnectFromServiceRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): DisconnectFromServiceRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisconnectFromServiceRequest]
    }
  }

  /** The disk identifier.
    */
  @js.native
  trait Disk extends js.Object {
    var bytes: js.UndefOr[PositiveInteger]
    var deviceName: js.UndefOr[BoundedString]
  }

  object Disk {
    @inline
    def apply(
        bytes: js.UndefOr[PositiveInteger] = js.undefined,
        deviceName: js.UndefOr[BoundedString] = js.undefined
    ): Disk = {
      val __obj = js.Dynamic.literal()
      bytes.foreach(__v => __obj.updateDynamic("bytes")(__v.asInstanceOf[js.Any]))
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Disk]
    }
  }

  @js.native
  trait FinalizeCutoverRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object FinalizeCutoverRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): FinalizeCutoverRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FinalizeCutoverRequest]
    }
  }

  @js.native
  trait GetLaunchConfigurationRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object GetLaunchConfigurationRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): GetLaunchConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLaunchConfigurationRequest]
    }
  }

  @js.native
  trait GetReplicationConfigurationRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object GetReplicationConfigurationRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): GetReplicationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReplicationConfigurationRequest]
    }
  }

  /** Identification hints.
    */
  @js.native
  trait IdentificationHints extends js.Object {
    var awsInstanceID: js.UndefOr[EC2InstanceID]
    var fqdn: js.UndefOr[BoundedString]
    var hostname: js.UndefOr[BoundedString]
    var vmPath: js.UndefOr[BoundedString]
    var vmWareUuid: js.UndefOr[BoundedString]
  }

  object IdentificationHints {
    @inline
    def apply(
        awsInstanceID: js.UndefOr[EC2InstanceID] = js.undefined,
        fqdn: js.UndefOr[BoundedString] = js.undefined,
        hostname: js.UndefOr[BoundedString] = js.undefined,
        vmPath: js.UndefOr[BoundedString] = js.undefined,
        vmWareUuid: js.UndefOr[BoundedString] = js.undefined
    ): IdentificationHints = {
      val __obj = js.Dynamic.literal()
      awsInstanceID.foreach(__v => __obj.updateDynamic("awsInstanceID")(__v.asInstanceOf[js.Any]))
      fqdn.foreach(__v => __obj.updateDynamic("fqdn")(__v.asInstanceOf[js.Any]))
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      vmPath.foreach(__v => __obj.updateDynamic("vmPath")(__v.asInstanceOf[js.Any]))
      vmWareUuid.foreach(__v => __obj.updateDynamic("vmWareUuid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentificationHints]
    }
  }

  @js.native
  trait InitializeServiceRequest extends js.Object

  object InitializeServiceRequest {
    @inline
    def apply(): InitializeServiceRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitializeServiceRequest]
    }
  }

  @js.native
  trait InitializeServiceResponse extends js.Object

  object InitializeServiceResponse {
    @inline
    def apply(): InitializeServiceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitializeServiceResponse]
    }
  }

  /** Job.
    */
  @js.native
  trait Job extends js.Object {
    var jobID: JobID
    var arn: js.UndefOr[ARN]
    var creationDateTime: js.UndefOr[ISO8601DatetimeString]
    var endDateTime: js.UndefOr[ISO8601DatetimeString]
    var initiatedBy: js.UndefOr[InitiatedBy]
    var participatingServers: js.UndefOr[ParticipatingServers]
    var status: js.UndefOr[JobStatus]
    var tags: js.UndefOr[TagsMap]
    var `type`: js.UndefOr[JobType]
  }

  object Job {
    @inline
    def apply(
        jobID: JobID,
        arn: js.UndefOr[ARN] = js.undefined,
        creationDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        endDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        initiatedBy: js.UndefOr[InitiatedBy] = js.undefined,
        participatingServers: js.UndefOr[ParticipatingServers] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        `type`: js.UndefOr[JobType] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal(
        "jobID" -> jobID.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      endDateTime.foreach(__v => __obj.updateDynamic("endDateTime")(__v.asInstanceOf[js.Any]))
      initiatedBy.foreach(__v => __obj.updateDynamic("initiatedBy")(__v.asInstanceOf[js.Any]))
      participatingServers.foreach(__v => __obj.updateDynamic("participatingServers")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /** Job log.
    */
  @js.native
  trait JobLog extends js.Object {
    var event: js.UndefOr[JobLogEvent]
    var eventData: js.UndefOr[JobLogEventData]
    var logDateTime: js.UndefOr[ISO8601DatetimeString]
  }

  object JobLog {
    @inline
    def apply(
        event: js.UndefOr[JobLogEvent] = js.undefined,
        eventData: js.UndefOr[JobLogEventData] = js.undefined,
        logDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): JobLog = {
      val __obj = js.Dynamic.literal()
      event.foreach(__v => __obj.updateDynamic("event")(__v.asInstanceOf[js.Any]))
      eventData.foreach(__v => __obj.updateDynamic("eventData")(__v.asInstanceOf[js.Any]))
      logDateTime.foreach(__v => __obj.updateDynamic("logDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobLog]
    }
  }

  /** Job log data
    */
  @js.native
  trait JobLogEventData extends js.Object {
    var conversionServerID: js.UndefOr[EC2InstanceID]
    var rawError: js.UndefOr[LargeBoundedString]
    var sourceServerID: js.UndefOr[SourceServerID]
    var targetInstanceID: js.UndefOr[EC2InstanceID]
  }

  object JobLogEventData {
    @inline
    def apply(
        conversionServerID: js.UndefOr[EC2InstanceID] = js.undefined,
        rawError: js.UndefOr[LargeBoundedString] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        targetInstanceID: js.UndefOr[EC2InstanceID] = js.undefined
    ): JobLogEventData = {
      val __obj = js.Dynamic.literal()
      conversionServerID.foreach(__v => __obj.updateDynamic("conversionServerID")(__v.asInstanceOf[js.Any]))
      rawError.foreach(__v => __obj.updateDynamic("rawError")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      targetInstanceID.foreach(__v => __obj.updateDynamic("targetInstanceID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobLogEventData]
    }
  }

  /** Launch Status of the Job Post Launch Actions.
    */
  @js.native
  trait JobPostLaunchActionsLaunchStatus extends js.Object {
    var executionID: js.UndefOr[BoundedString]
    var executionStatus: js.UndefOr[PostLaunchActionExecutionStatus]
    var failureReason: js.UndefOr[BoundedString]
    var ssmDocument: js.UndefOr[SsmDocument]
    var ssmDocumentType: js.UndefOr[SsmDocumentType]
  }

  object JobPostLaunchActionsLaunchStatus {
    @inline
    def apply(
        executionID: js.UndefOr[BoundedString] = js.undefined,
        executionStatus: js.UndefOr[PostLaunchActionExecutionStatus] = js.undefined,
        failureReason: js.UndefOr[BoundedString] = js.undefined,
        ssmDocument: js.UndefOr[SsmDocument] = js.undefined,
        ssmDocumentType: js.UndefOr[SsmDocumentType] = js.undefined
    ): JobPostLaunchActionsLaunchStatus = {
      val __obj = js.Dynamic.literal()
      executionID.foreach(__v => __obj.updateDynamic("executionID")(__v.asInstanceOf[js.Any]))
      executionStatus.foreach(__v => __obj.updateDynamic("executionStatus")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      ssmDocument.foreach(__v => __obj.updateDynamic("ssmDocument")(__v.asInstanceOf[js.Any]))
      ssmDocumentType.foreach(__v => __obj.updateDynamic("ssmDocumentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobPostLaunchActionsLaunchStatus]
    }
  }

  @js.native
  trait LaunchConfiguration extends js.Object {
    var bootMode: js.UndefOr[BootMode]
    var copyPrivateIp: js.UndefOr[Boolean]
    var copyTags: js.UndefOr[Boolean]
    var ec2LaunchTemplateID: js.UndefOr[BoundedString]
    var enableMapAutoTagging: js.UndefOr[Boolean]
    var launchDisposition: js.UndefOr[LaunchDisposition]
    var licensing: js.UndefOr[Licensing]
    var mapAutoTaggingMpeID: js.UndefOr[TagValue]
    var name: js.UndefOr[SmallBoundedString]
    var postLaunchActions: js.UndefOr[PostLaunchActions]
    var sourceServerID: js.UndefOr[SourceServerID]
    var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod]
  }

  object LaunchConfiguration {
    @inline
    def apply(
        bootMode: js.UndefOr[BootMode] = js.undefined,
        copyPrivateIp: js.UndefOr[Boolean] = js.undefined,
        copyTags: js.UndefOr[Boolean] = js.undefined,
        ec2LaunchTemplateID: js.UndefOr[BoundedString] = js.undefined,
        enableMapAutoTagging: js.UndefOr[Boolean] = js.undefined,
        launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined,
        licensing: js.UndefOr[Licensing] = js.undefined,
        mapAutoTaggingMpeID: js.UndefOr[TagValue] = js.undefined,
        name: js.UndefOr[SmallBoundedString] = js.undefined,
        postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
    ): LaunchConfiguration = {
      val __obj = js.Dynamic.literal()
      bootMode.foreach(__v => __obj.updateDynamic("bootMode")(__v.asInstanceOf[js.Any]))
      copyPrivateIp.foreach(__v => __obj.updateDynamic("copyPrivateIp")(__v.asInstanceOf[js.Any]))
      copyTags.foreach(__v => __obj.updateDynamic("copyTags")(__v.asInstanceOf[js.Any]))
      ec2LaunchTemplateID.foreach(__v => __obj.updateDynamic("ec2LaunchTemplateID")(__v.asInstanceOf[js.Any]))
      enableMapAutoTagging.foreach(__v => __obj.updateDynamic("enableMapAutoTagging")(__v.asInstanceOf[js.Any]))
      launchDisposition.foreach(__v => __obj.updateDynamic("launchDisposition")(__v.asInstanceOf[js.Any]))
      licensing.foreach(__v => __obj.updateDynamic("licensing")(__v.asInstanceOf[js.Any]))
      mapAutoTaggingMpeID.foreach(__v => __obj.updateDynamic("mapAutoTaggingMpeID")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      postLaunchActions.foreach(__v => __obj.updateDynamic("postLaunchActions")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      targetInstanceTypeRightSizingMethod.foreach(__v => __obj.updateDynamic("targetInstanceTypeRightSizingMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfiguration]
    }
  }

  @js.native
  trait LaunchConfigurationTemplate extends js.Object {
    var launchConfigurationTemplateID: LaunchConfigurationTemplateID
    var arn: js.UndefOr[ARN]
    var associatePublicIpAddress: js.UndefOr[Boolean]
    var bootMode: js.UndefOr[BootMode]
    var copyPrivateIp: js.UndefOr[Boolean]
    var copyTags: js.UndefOr[Boolean]
    var ec2LaunchTemplateID: js.UndefOr[EC2LaunchConfigurationTemplateID]
    var enableMapAutoTagging: js.UndefOr[Boolean]
    var largeVolumeConf: js.UndefOr[LaunchTemplateDiskConf]
    var launchDisposition: js.UndefOr[LaunchDisposition]
    var licensing: js.UndefOr[Licensing]
    var mapAutoTaggingMpeID: js.UndefOr[TagValue]
    var postLaunchActions: js.UndefOr[PostLaunchActions]
    var smallVolumeConf: js.UndefOr[LaunchTemplateDiskConf]
    var smallVolumeMaxSize: js.UndefOr[PositiveInteger]
    var tags: js.UndefOr[TagsMap]
    var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod]
  }

  object LaunchConfigurationTemplate {
    @inline
    def apply(
        launchConfigurationTemplateID: LaunchConfigurationTemplateID,
        arn: js.UndefOr[ARN] = js.undefined,
        associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
        bootMode: js.UndefOr[BootMode] = js.undefined,
        copyPrivateIp: js.UndefOr[Boolean] = js.undefined,
        copyTags: js.UndefOr[Boolean] = js.undefined,
        ec2LaunchTemplateID: js.UndefOr[EC2LaunchConfigurationTemplateID] = js.undefined,
        enableMapAutoTagging: js.UndefOr[Boolean] = js.undefined,
        largeVolumeConf: js.UndefOr[LaunchTemplateDiskConf] = js.undefined,
        launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined,
        licensing: js.UndefOr[Licensing] = js.undefined,
        mapAutoTaggingMpeID: js.UndefOr[TagValue] = js.undefined,
        postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined,
        smallVolumeConf: js.UndefOr[LaunchTemplateDiskConf] = js.undefined,
        smallVolumeMaxSize: js.UndefOr[PositiveInteger] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
    ): LaunchConfigurationTemplate = {
      val __obj = js.Dynamic.literal(
        "launchConfigurationTemplateID" -> launchConfigurationTemplateID.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      associatePublicIpAddress.foreach(__v => __obj.updateDynamic("associatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      bootMode.foreach(__v => __obj.updateDynamic("bootMode")(__v.asInstanceOf[js.Any]))
      copyPrivateIp.foreach(__v => __obj.updateDynamic("copyPrivateIp")(__v.asInstanceOf[js.Any]))
      copyTags.foreach(__v => __obj.updateDynamic("copyTags")(__v.asInstanceOf[js.Any]))
      ec2LaunchTemplateID.foreach(__v => __obj.updateDynamic("ec2LaunchTemplateID")(__v.asInstanceOf[js.Any]))
      enableMapAutoTagging.foreach(__v => __obj.updateDynamic("enableMapAutoTagging")(__v.asInstanceOf[js.Any]))
      largeVolumeConf.foreach(__v => __obj.updateDynamic("largeVolumeConf")(__v.asInstanceOf[js.Any]))
      launchDisposition.foreach(__v => __obj.updateDynamic("launchDisposition")(__v.asInstanceOf[js.Any]))
      licensing.foreach(__v => __obj.updateDynamic("licensing")(__v.asInstanceOf[js.Any]))
      mapAutoTaggingMpeID.foreach(__v => __obj.updateDynamic("mapAutoTaggingMpeID")(__v.asInstanceOf[js.Any]))
      postLaunchActions.foreach(__v => __obj.updateDynamic("postLaunchActions")(__v.asInstanceOf[js.Any]))
      smallVolumeConf.foreach(__v => __obj.updateDynamic("smallVolumeConf")(__v.asInstanceOf[js.Any]))
      smallVolumeMaxSize.foreach(__v => __obj.updateDynamic("smallVolumeMaxSize")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targetInstanceTypeRightSizingMethod.foreach(__v => __obj.updateDynamic("targetInstanceTypeRightSizingMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfigurationTemplate]
    }
  }

  /** Launch template disk configuration.
    */
  @js.native
  trait LaunchTemplateDiskConf extends js.Object {
    var iops: js.UndefOr[PositiveInteger]
    var throughput: js.UndefOr[PositiveInteger]
    var volumeType: js.UndefOr[VolumeType]
  }

  object LaunchTemplateDiskConf {
    @inline
    def apply(
        iops: js.UndefOr[PositiveInteger] = js.undefined,
        throughput: js.UndefOr[PositiveInteger] = js.undefined,
        volumeType: js.UndefOr[VolumeType] = js.undefined
    ): LaunchTemplateDiskConf = {
      val __obj = js.Dynamic.literal()
      iops.foreach(__v => __obj.updateDynamic("iops")(__v.asInstanceOf[js.Any]))
      throughput.foreach(__v => __obj.updateDynamic("throughput")(__v.asInstanceOf[js.Any]))
      volumeType.foreach(__v => __obj.updateDynamic("volumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplateDiskConf]
    }
  }

  /** Launched instance.
    */
  @js.native
  trait LaunchedInstance extends js.Object {
    var ec2InstanceID: js.UndefOr[EC2InstanceID]
    var firstBoot: js.UndefOr[FirstBoot]
    var jobID: js.UndefOr[JobID]
  }

  object LaunchedInstance {
    @inline
    def apply(
        ec2InstanceID: js.UndefOr[EC2InstanceID] = js.undefined,
        firstBoot: js.UndefOr[FirstBoot] = js.undefined,
        jobID: js.UndefOr[JobID] = js.undefined
    ): LaunchedInstance = {
      val __obj = js.Dynamic.literal()
      ec2InstanceID.foreach(__v => __obj.updateDynamic("ec2InstanceID")(__v.asInstanceOf[js.Any]))
      firstBoot.foreach(__v => __obj.updateDynamic("firstBoot")(__v.asInstanceOf[js.Any]))
      jobID.foreach(__v => __obj.updateDynamic("jobID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchedInstance]
    }
  }

  /** Configure Licensing.
    */
  @js.native
  trait Licensing extends js.Object {
    var osByol: js.UndefOr[Boolean]
  }

  object Licensing {
    @inline
    def apply(
        osByol: js.UndefOr[Boolean] = js.undefined
    ): Licensing = {
      val __obj = js.Dynamic.literal()
      osByol.foreach(__v => __obj.updateDynamic("osByol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Licensing]
    }
  }

  /** Lifecycle.
    */
  @js.native
  trait LifeCycle extends js.Object {
    var addedToServiceDateTime: js.UndefOr[ISO8601DatetimeString]
    var elapsedReplicationDuration: js.UndefOr[ISO8601DurationString]
    var firstByteDateTime: js.UndefOr[ISO8601DatetimeString]
    var lastCutover: js.UndefOr[LifeCycleLastCutover]
    var lastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString]
    var lastTest: js.UndefOr[LifeCycleLastTest]
    var state: js.UndefOr[LifeCycleState]
  }

  object LifeCycle {
    @inline
    def apply(
        addedToServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        elapsedReplicationDuration: js.UndefOr[ISO8601DurationString] = js.undefined,
        firstByteDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        lastCutover: js.UndefOr[LifeCycleLastCutover] = js.undefined,
        lastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        lastTest: js.UndefOr[LifeCycleLastTest] = js.undefined,
        state: js.UndefOr[LifeCycleState] = js.undefined
    ): LifeCycle = {
      val __obj = js.Dynamic.literal()
      addedToServiceDateTime.foreach(__v => __obj.updateDynamic("addedToServiceDateTime")(__v.asInstanceOf[js.Any]))
      elapsedReplicationDuration.foreach(__v => __obj.updateDynamic("elapsedReplicationDuration")(__v.asInstanceOf[js.Any]))
      firstByteDateTime.foreach(__v => __obj.updateDynamic("firstByteDateTime")(__v.asInstanceOf[js.Any]))
      lastCutover.foreach(__v => __obj.updateDynamic("lastCutover")(__v.asInstanceOf[js.Any]))
      lastSeenByServiceDateTime.foreach(__v => __obj.updateDynamic("lastSeenByServiceDateTime")(__v.asInstanceOf[js.Any]))
      lastTest.foreach(__v => __obj.updateDynamic("lastTest")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycle]
    }
  }

  /** Lifecycle last Cutover .
    */
  @js.native
  trait LifeCycleLastCutover extends js.Object {
    var finalized: js.UndefOr[LifeCycleLastCutoverFinalized]
    var initiated: js.UndefOr[LifeCycleLastCutoverInitiated]
    var reverted: js.UndefOr[LifeCycleLastCutoverReverted]
  }

  object LifeCycleLastCutover {
    @inline
    def apply(
        finalized: js.UndefOr[LifeCycleLastCutoverFinalized] = js.undefined,
        initiated: js.UndefOr[LifeCycleLastCutoverInitiated] = js.undefined,
        reverted: js.UndefOr[LifeCycleLastCutoverReverted] = js.undefined
    ): LifeCycleLastCutover = {
      val __obj = js.Dynamic.literal()
      finalized.foreach(__v => __obj.updateDynamic("finalized")(__v.asInstanceOf[js.Any]))
      initiated.foreach(__v => __obj.updateDynamic("initiated")(__v.asInstanceOf[js.Any]))
      reverted.foreach(__v => __obj.updateDynamic("reverted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastCutover]
    }
  }

  /** Lifecycle Cutover finalized
    */
  @js.native
  trait LifeCycleLastCutoverFinalized extends js.Object {
    var apiCallDateTime: js.UndefOr[ISO8601DatetimeString]
  }

  object LifeCycleLastCutoverFinalized {
    @inline
    def apply(
        apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): LifeCycleLastCutoverFinalized = {
      val __obj = js.Dynamic.literal()
      apiCallDateTime.foreach(__v => __obj.updateDynamic("apiCallDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastCutoverFinalized]
    }
  }

  /** Lifecycle last Cutover initiated.
    */
  @js.native
  trait LifeCycleLastCutoverInitiated extends js.Object {
    var apiCallDateTime: js.UndefOr[ISO8601DatetimeString]
    var jobID: js.UndefOr[JobID]
  }

  object LifeCycleLastCutoverInitiated {
    @inline
    def apply(
        apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        jobID: js.UndefOr[JobID] = js.undefined
    ): LifeCycleLastCutoverInitiated = {
      val __obj = js.Dynamic.literal()
      apiCallDateTime.foreach(__v => __obj.updateDynamic("apiCallDateTime")(__v.asInstanceOf[js.Any]))
      jobID.foreach(__v => __obj.updateDynamic("jobID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastCutoverInitiated]
    }
  }

  /** Lifecycle last Cutover reverted.
    */
  @js.native
  trait LifeCycleLastCutoverReverted extends js.Object {
    var apiCallDateTime: js.UndefOr[ISO8601DatetimeString]
  }

  object LifeCycleLastCutoverReverted {
    @inline
    def apply(
        apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): LifeCycleLastCutoverReverted = {
      val __obj = js.Dynamic.literal()
      apiCallDateTime.foreach(__v => __obj.updateDynamic("apiCallDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastCutoverReverted]
    }
  }

  /** Lifecycle last Test.
    */
  @js.native
  trait LifeCycleLastTest extends js.Object {
    var finalized: js.UndefOr[LifeCycleLastTestFinalized]
    var initiated: js.UndefOr[LifeCycleLastTestInitiated]
    var reverted: js.UndefOr[LifeCycleLastTestReverted]
  }

  object LifeCycleLastTest {
    @inline
    def apply(
        finalized: js.UndefOr[LifeCycleLastTestFinalized] = js.undefined,
        initiated: js.UndefOr[LifeCycleLastTestInitiated] = js.undefined,
        reverted: js.UndefOr[LifeCycleLastTestReverted] = js.undefined
    ): LifeCycleLastTest = {
      val __obj = js.Dynamic.literal()
      finalized.foreach(__v => __obj.updateDynamic("finalized")(__v.asInstanceOf[js.Any]))
      initiated.foreach(__v => __obj.updateDynamic("initiated")(__v.asInstanceOf[js.Any]))
      reverted.foreach(__v => __obj.updateDynamic("reverted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastTest]
    }
  }

  /** Lifecycle last Test finalized.
    */
  @js.native
  trait LifeCycleLastTestFinalized extends js.Object {
    var apiCallDateTime: js.UndefOr[ISO8601DatetimeString]
  }

  object LifeCycleLastTestFinalized {
    @inline
    def apply(
        apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): LifeCycleLastTestFinalized = {
      val __obj = js.Dynamic.literal()
      apiCallDateTime.foreach(__v => __obj.updateDynamic("apiCallDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastTestFinalized]
    }
  }

  /** Lifecycle last Test initiated.
    */
  @js.native
  trait LifeCycleLastTestInitiated extends js.Object {
    var apiCallDateTime: js.UndefOr[ISO8601DatetimeString]
    var jobID: js.UndefOr[JobID]
  }

  object LifeCycleLastTestInitiated {
    @inline
    def apply(
        apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        jobID: js.UndefOr[JobID] = js.undefined
    ): LifeCycleLastTestInitiated = {
      val __obj = js.Dynamic.literal()
      apiCallDateTime.foreach(__v => __obj.updateDynamic("apiCallDateTime")(__v.asInstanceOf[js.Any]))
      jobID.foreach(__v => __obj.updateDynamic("jobID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastTestInitiated]
    }
  }

  /** Lifecycle last Test reverted.
    */
  @js.native
  trait LifeCycleLastTestReverted extends js.Object {
    var apiCallDateTime: js.UndefOr[ISO8601DatetimeString]
  }

  object LifeCycleLastTestReverted {
    @inline
    def apply(
        apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): LifeCycleLastTestReverted = {
      val __obj = js.Dynamic.literal()
      apiCallDateTime.foreach(__v => __obj.updateDynamic("apiCallDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastTestReverted]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var filters: js.UndefOr[ListApplicationsRequestFilters]
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        filters: js.UndefOr[ListApplicationsRequestFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  /** Applications list filters.
    */
  @js.native
  trait ListApplicationsRequestFilters extends js.Object {
    var applicationIDs: js.UndefOr[ApplicationIDsFilter]
    var isArchived: js.UndefOr[Boolean]
    var waveIDs: js.UndefOr[WaveIDsFilter]
  }

  object ListApplicationsRequestFilters {
    @inline
    def apply(
        applicationIDs: js.UndefOr[ApplicationIDsFilter] = js.undefined,
        isArchived: js.UndefOr[Boolean] = js.undefined,
        waveIDs: js.UndefOr[WaveIDsFilter] = js.undefined
    ): ListApplicationsRequestFilters = {
      val __obj = js.Dynamic.literal()
      applicationIDs.foreach(__v => __obj.updateDynamic("applicationIDs")(__v.asInstanceOf[js.Any]))
      isArchived.foreach(__v => __obj.updateDynamic("isArchived")(__v.asInstanceOf[js.Any]))
      waveIDs.foreach(__v => __obj.updateDynamic("waveIDs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequestFilters]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var items: js.UndefOr[ApplicationsList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        items: js.UndefOr[ApplicationsList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  @js.native
  trait ListSourceServerActionsRequest extends js.Object {
    var sourceServerID: SourceServerID
    var filters: js.UndefOr[SourceServerActionsRequestFilters]
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSourceServerActionsRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID,
        filters: js.UndefOr[SourceServerActionsRequestFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSourceServerActionsRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceServerActionsRequest]
    }
  }

  @js.native
  trait ListSourceServerActionsResponse extends js.Object {
    var items: js.UndefOr[SourceServerActionDocuments]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSourceServerActionsResponse {
    @inline
    def apply(
        items: js.UndefOr[SourceServerActionDocuments] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSourceServerActionsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceServerActionsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTemplateActionsRequest extends js.Object {
    var launchConfigurationTemplateID: LaunchConfigurationTemplateID
    var filters: js.UndefOr[TemplateActionsRequestFilters]
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTemplateActionsRequest {
    @inline
    def apply(
        launchConfigurationTemplateID: LaunchConfigurationTemplateID,
        filters: js.UndefOr[TemplateActionsRequestFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTemplateActionsRequest = {
      val __obj = js.Dynamic.literal(
        "launchConfigurationTemplateID" -> launchConfigurationTemplateID.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateActionsRequest]
    }
  }

  @js.native
  trait ListTemplateActionsResponse extends js.Object {
    var items: js.UndefOr[TemplateActionDocuments]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTemplateActionsResponse {
    @inline
    def apply(
        items: js.UndefOr[TemplateActionDocuments] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTemplateActionsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateActionsResponse]
    }
  }

  @js.native
  trait ListWavesRequest extends js.Object {
    var filters: js.UndefOr[ListWavesRequestFilters]
    var maxResults: js.UndefOr[MaxResultsType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListWavesRequest {
    @inline
    def apply(
        filters: js.UndefOr[ListWavesRequestFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResultsType] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWavesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWavesRequest]
    }
  }

  /** Waves list filters.
    */
  @js.native
  trait ListWavesRequestFilters extends js.Object {
    var isArchived: js.UndefOr[Boolean]
    var waveIDs: js.UndefOr[WaveIDsFilter]
  }

  object ListWavesRequestFilters {
    @inline
    def apply(
        isArchived: js.UndefOr[Boolean] = js.undefined,
        waveIDs: js.UndefOr[WaveIDsFilter] = js.undefined
    ): ListWavesRequestFilters = {
      val __obj = js.Dynamic.literal()
      isArchived.foreach(__v => __obj.updateDynamic("isArchived")(__v.asInstanceOf[js.Any]))
      waveIDs.foreach(__v => __obj.updateDynamic("waveIDs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWavesRequestFilters]
    }
  }

  @js.native
  trait ListWavesResponse extends js.Object {
    var items: js.UndefOr[WavesList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListWavesResponse {
    @inline
    def apply(
        items: js.UndefOr[WavesList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWavesResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWavesResponse]
    }
  }

  @js.native
  trait MarkAsArchivedRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object MarkAsArchivedRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): MarkAsArchivedRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MarkAsArchivedRequest]
    }
  }

  /** Network interface.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var ips: js.UndefOr[IPsList]
    var isPrimary: js.UndefOr[Boolean]
    var macAddress: js.UndefOr[BoundedString]
  }

  object NetworkInterface {
    @inline
    def apply(
        ips: js.UndefOr[IPsList] = js.undefined,
        isPrimary: js.UndefOr[Boolean] = js.undefined,
        macAddress: js.UndefOr[BoundedString] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      ips.foreach(__v => __obj.updateDynamic("ips")(__v.asInstanceOf[js.Any]))
      isPrimary.foreach(__v => __obj.updateDynamic("isPrimary")(__v.asInstanceOf[js.Any]))
      macAddress.foreach(__v => __obj.updateDynamic("macAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  /** Operating System.
    */
  @js.native
  trait OS extends js.Object {
    var fullString: js.UndefOr[BoundedString]
  }

  object OS {
    @inline
    def apply(
        fullString: js.UndefOr[BoundedString] = js.undefined
    ): OS = {
      val __obj = js.Dynamic.literal()
      fullString.foreach(__v => __obj.updateDynamic("fullString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OS]
    }
  }

  /** Server participating in Job.
    */
  @js.native
  trait ParticipatingServer extends js.Object {
    var sourceServerID: SourceServerID
    var launchStatus: js.UndefOr[LaunchStatus]
    var launchedEc2InstanceID: js.UndefOr[EC2InstanceID]
    var postLaunchActionsStatus: js.UndefOr[PostLaunchActionsStatus]
  }

  object ParticipatingServer {
    @inline
    def apply(
        sourceServerID: SourceServerID,
        launchStatus: js.UndefOr[LaunchStatus] = js.undefined,
        launchedEc2InstanceID: js.UndefOr[EC2InstanceID] = js.undefined,
        postLaunchActionsStatus: js.UndefOr[PostLaunchActionsStatus] = js.undefined
    ): ParticipatingServer = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      launchStatus.foreach(__v => __obj.updateDynamic("launchStatus")(__v.asInstanceOf[js.Any]))
      launchedEc2InstanceID.foreach(__v => __obj.updateDynamic("launchedEc2InstanceID")(__v.asInstanceOf[js.Any]))
      postLaunchActionsStatus.foreach(__v => __obj.updateDynamic("postLaunchActionsStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParticipatingServer]
    }
  }

  /** Post Launch Actions to executed on the Test or Cutover instance.
    */
  @js.native
  trait PostLaunchActions extends js.Object {
    var cloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName]
    var deployment: js.UndefOr[PostLaunchActionsDeploymentType]
    var s3LogBucket: js.UndefOr[S3LogBucketName]
    var s3OutputKeyPrefix: js.UndefOr[BoundedString]
    var ssmDocuments: js.UndefOr[SsmDocuments]
  }

  object PostLaunchActions {
    @inline
    def apply(
        cloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName] = js.undefined,
        deployment: js.UndefOr[PostLaunchActionsDeploymentType] = js.undefined,
        s3LogBucket: js.UndefOr[S3LogBucketName] = js.undefined,
        s3OutputKeyPrefix: js.UndefOr[BoundedString] = js.undefined,
        ssmDocuments: js.UndefOr[SsmDocuments] = js.undefined
    ): PostLaunchActions = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogGroupName.foreach(__v => __obj.updateDynamic("cloudWatchLogGroupName")(__v.asInstanceOf[js.Any]))
      deployment.foreach(__v => __obj.updateDynamic("deployment")(__v.asInstanceOf[js.Any]))
      s3LogBucket.foreach(__v => __obj.updateDynamic("s3LogBucket")(__v.asInstanceOf[js.Any]))
      s3OutputKeyPrefix.foreach(__v => __obj.updateDynamic("s3OutputKeyPrefix")(__v.asInstanceOf[js.Any]))
      ssmDocuments.foreach(__v => __obj.updateDynamic("ssmDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostLaunchActions]
    }
  }

  /** Status of the Post Launch Actions running on the Test or Cutover instance.
    */
  @js.native
  trait PostLaunchActionsStatus extends js.Object {
    var postLaunchActionsLaunchStatusList: js.UndefOr[PostLaunchActionsLaunchStatusList]
    var ssmAgentDiscoveryDatetime: js.UndefOr[ISO8601DatetimeString]
  }

  object PostLaunchActionsStatus {
    @inline
    def apply(
        postLaunchActionsLaunchStatusList: js.UndefOr[PostLaunchActionsLaunchStatusList] = js.undefined,
        ssmAgentDiscoveryDatetime: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): PostLaunchActionsStatus = {
      val __obj = js.Dynamic.literal()
      postLaunchActionsLaunchStatusList.foreach(__v => __obj.updateDynamic("postLaunchActionsLaunchStatusList")(__v.asInstanceOf[js.Any]))
      ssmAgentDiscoveryDatetime.foreach(__v => __obj.updateDynamic("ssmAgentDiscoveryDatetime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostLaunchActionsStatus]
    }
  }

  @js.native
  trait PutSourceServerActionRequest extends js.Object {
    var actionID: ActionID
    var actionName: ActionName
    var documentIdentifier: BoundedString
    var order: OrderType
    var sourceServerID: SourceServerID
    var active: js.UndefOr[Boolean]
    var documentVersion: js.UndefOr[DocumentVersion]
    var mustSucceedForCutover: js.UndefOr[Boolean]
    var parameters: js.UndefOr[SsmDocumentParameters]
    var timeoutSeconds: js.UndefOr[StrictlyPositiveInteger]
  }

  object PutSourceServerActionRequest {
    @inline
    def apply(
        actionID: ActionID,
        actionName: ActionName,
        documentIdentifier: BoundedString,
        order: OrderType,
        sourceServerID: SourceServerID,
        active: js.UndefOr[Boolean] = js.undefined,
        documentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined,
        parameters: js.UndefOr[SsmDocumentParameters] = js.undefined,
        timeoutSeconds: js.UndefOr[StrictlyPositiveInteger] = js.undefined
    ): PutSourceServerActionRequest = {
      val __obj = js.Dynamic.literal(
        "actionID" -> actionID.asInstanceOf[js.Any],
        "actionName" -> actionName.asInstanceOf[js.Any],
        "documentIdentifier" -> documentIdentifier.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any],
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      active.foreach(__v => __obj.updateDynamic("active")(__v.asInstanceOf[js.Any]))
      documentVersion.foreach(__v => __obj.updateDynamic("documentVersion")(__v.asInstanceOf[js.Any]))
      mustSucceedForCutover.foreach(__v => __obj.updateDynamic("mustSucceedForCutover")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      timeoutSeconds.foreach(__v => __obj.updateDynamic("timeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSourceServerActionRequest]
    }
  }

  @js.native
  trait PutTemplateActionRequest extends js.Object {
    var actionID: ActionID
    var actionName: BoundedString
    var documentIdentifier: BoundedString
    var launchConfigurationTemplateID: LaunchConfigurationTemplateID
    var order: OrderType
    var active: js.UndefOr[Boolean]
    var documentVersion: js.UndefOr[DocumentVersion]
    var mustSucceedForCutover: js.UndefOr[Boolean]
    var operatingSystem: js.UndefOr[OperatingSystemString]
    var parameters: js.UndefOr[SsmDocumentParameters]
    var timeoutSeconds: js.UndefOr[StrictlyPositiveInteger]
  }

  object PutTemplateActionRequest {
    @inline
    def apply(
        actionID: ActionID,
        actionName: BoundedString,
        documentIdentifier: BoundedString,
        launchConfigurationTemplateID: LaunchConfigurationTemplateID,
        order: OrderType,
        active: js.UndefOr[Boolean] = js.undefined,
        documentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined,
        operatingSystem: js.UndefOr[OperatingSystemString] = js.undefined,
        parameters: js.UndefOr[SsmDocumentParameters] = js.undefined,
        timeoutSeconds: js.UndefOr[StrictlyPositiveInteger] = js.undefined
    ): PutTemplateActionRequest = {
      val __obj = js.Dynamic.literal(
        "actionID" -> actionID.asInstanceOf[js.Any],
        "actionName" -> actionName.asInstanceOf[js.Any],
        "documentIdentifier" -> documentIdentifier.asInstanceOf[js.Any],
        "launchConfigurationTemplateID" -> launchConfigurationTemplateID.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )

      active.foreach(__v => __obj.updateDynamic("active")(__v.asInstanceOf[js.Any]))
      documentVersion.foreach(__v => __obj.updateDynamic("documentVersion")(__v.asInstanceOf[js.Any]))
      mustSucceedForCutover.foreach(__v => __obj.updateDynamic("mustSucceedForCutover")(__v.asInstanceOf[js.Any]))
      operatingSystem.foreach(__v => __obj.updateDynamic("operatingSystem")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      timeoutSeconds.foreach(__v => __obj.updateDynamic("timeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTemplateActionRequest]
    }
  }

  @js.native
  trait RemoveSourceServerActionRequest extends js.Object {
    var actionID: ActionID
    var sourceServerID: SourceServerID
  }

  object RemoveSourceServerActionRequest {
    @inline
    def apply(
        actionID: ActionID,
        sourceServerID: SourceServerID
    ): RemoveSourceServerActionRequest = {
      val __obj = js.Dynamic.literal(
        "actionID" -> actionID.asInstanceOf[js.Any],
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveSourceServerActionRequest]
    }
  }

  @js.native
  trait RemoveSourceServerActionResponse extends js.Object

  object RemoveSourceServerActionResponse {
    @inline
    def apply(): RemoveSourceServerActionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveSourceServerActionResponse]
    }
  }

  @js.native
  trait RemoveTemplateActionRequest extends js.Object {
    var actionID: ActionID
    var launchConfigurationTemplateID: LaunchConfigurationTemplateID
  }

  object RemoveTemplateActionRequest {
    @inline
    def apply(
        actionID: ActionID,
        launchConfigurationTemplateID: LaunchConfigurationTemplateID
    ): RemoveTemplateActionRequest = {
      val __obj = js.Dynamic.literal(
        "actionID" -> actionID.asInstanceOf[js.Any],
        "launchConfigurationTemplateID" -> launchConfigurationTemplateID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveTemplateActionRequest]
    }
  }

  @js.native
  trait RemoveTemplateActionResponse extends js.Object

  object RemoveTemplateActionResponse {
    @inline
    def apply(): RemoveTemplateActionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveTemplateActionResponse]
    }
  }

  @js.native
  trait ReplicationConfiguration extends js.Object {
    var associateDefaultSecurityGroup: js.UndefOr[Boolean]
    var bandwidthThrottling: js.UndefOr[PositiveInteger]
    var createPublicIP: js.UndefOr[Boolean]
    var dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting]
    var defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType]
    var ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption]
    var ebsEncryptionKeyArn: js.UndefOr[ARN]
    var name: js.UndefOr[SmallBoundedString]
    var replicatedDisks: js.UndefOr[ReplicationConfigurationReplicatedDisks]
    var replicationServerInstanceType: js.UndefOr[EC2InstanceType]
    var replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs]
    var sourceServerID: js.UndefOr[SourceServerID]
    var stagingAreaSubnetId: js.UndefOr[SubnetID]
    var stagingAreaTags: js.UndefOr[TagsMap]
    var useDedicatedReplicationServer: js.UndefOr[Boolean]
  }

  object ReplicationConfiguration {
    @inline
    def apply(
        associateDefaultSecurityGroup: js.UndefOr[Boolean] = js.undefined,
        bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined,
        createPublicIP: js.UndefOr[Boolean] = js.undefined,
        dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting] = js.undefined,
        defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType] = js.undefined,
        ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption] = js.undefined,
        ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        name: js.UndefOr[SmallBoundedString] = js.undefined,
        replicatedDisks: js.UndefOr[ReplicationConfigurationReplicatedDisks] = js.undefined,
        replicationServerInstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
        replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        stagingAreaSubnetId: js.UndefOr[SubnetID] = js.undefined,
        stagingAreaTags: js.UndefOr[TagsMap] = js.undefined,
        useDedicatedReplicationServer: js.UndefOr[Boolean] = js.undefined
    ): ReplicationConfiguration = {
      val __obj = js.Dynamic.literal()
      associateDefaultSecurityGroup.foreach(__v => __obj.updateDynamic("associateDefaultSecurityGroup")(__v.asInstanceOf[js.Any]))
      bandwidthThrottling.foreach(__v => __obj.updateDynamic("bandwidthThrottling")(__v.asInstanceOf[js.Any]))
      createPublicIP.foreach(__v => __obj.updateDynamic("createPublicIP")(__v.asInstanceOf[js.Any]))
      dataPlaneRouting.foreach(__v => __obj.updateDynamic("dataPlaneRouting")(__v.asInstanceOf[js.Any]))
      defaultLargeStagingDiskType.foreach(__v => __obj.updateDynamic("defaultLargeStagingDiskType")(__v.asInstanceOf[js.Any]))
      ebsEncryption.foreach(__v => __obj.updateDynamic("ebsEncryption")(__v.asInstanceOf[js.Any]))
      ebsEncryptionKeyArn.foreach(__v => __obj.updateDynamic("ebsEncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      replicatedDisks.foreach(__v => __obj.updateDynamic("replicatedDisks")(__v.asInstanceOf[js.Any]))
      replicationServerInstanceType.foreach(__v => __obj.updateDynamic("replicationServerInstanceType")(__v.asInstanceOf[js.Any]))
      replicationServersSecurityGroupsIDs.foreach(__v => __obj.updateDynamic("replicationServersSecurityGroupsIDs")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      stagingAreaSubnetId.foreach(__v => __obj.updateDynamic("stagingAreaSubnetId")(__v.asInstanceOf[js.Any]))
      stagingAreaTags.foreach(__v => __obj.updateDynamic("stagingAreaTags")(__v.asInstanceOf[js.Any]))
      useDedicatedReplicationServer.foreach(__v => __obj.updateDynamic("useDedicatedReplicationServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationConfiguration]
    }
  }

  /** Replication Configuration replicated disk.
    */
  @js.native
  trait ReplicationConfigurationReplicatedDisk extends js.Object {
    var deviceName: js.UndefOr[BoundedString]
    var iops: js.UndefOr[PositiveInteger]
    var isBootDisk: js.UndefOr[Boolean]
    var stagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType]
    var throughput: js.UndefOr[PositiveInteger]
  }

  object ReplicationConfigurationReplicatedDisk {
    @inline
    def apply(
        deviceName: js.UndefOr[BoundedString] = js.undefined,
        iops: js.UndefOr[PositiveInteger] = js.undefined,
        isBootDisk: js.UndefOr[Boolean] = js.undefined,
        stagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.undefined,
        throughput: js.UndefOr[PositiveInteger] = js.undefined
    ): ReplicationConfigurationReplicatedDisk = {
      val __obj = js.Dynamic.literal()
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      iops.foreach(__v => __obj.updateDynamic("iops")(__v.asInstanceOf[js.Any]))
      isBootDisk.foreach(__v => __obj.updateDynamic("isBootDisk")(__v.asInstanceOf[js.Any]))
      stagingDiskType.foreach(__v => __obj.updateDynamic("stagingDiskType")(__v.asInstanceOf[js.Any]))
      throughput.foreach(__v => __obj.updateDynamic("throughput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationConfigurationReplicatedDisk]
    }
  }

  @js.native
  trait ReplicationConfigurationTemplate extends js.Object {
    var replicationConfigurationTemplateID: ReplicationConfigurationTemplateID
    var arn: js.UndefOr[ARN]
    var associateDefaultSecurityGroup: js.UndefOr[Boolean]
    var bandwidthThrottling: js.UndefOr[PositiveInteger]
    var createPublicIP: js.UndefOr[Boolean]
    var dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting]
    var defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType]
    var ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption]
    var ebsEncryptionKeyArn: js.UndefOr[ARN]
    var replicationServerInstanceType: js.UndefOr[EC2InstanceType]
    var replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs]
    var stagingAreaSubnetId: js.UndefOr[SubnetID]
    var stagingAreaTags: js.UndefOr[TagsMap]
    var tags: js.UndefOr[TagsMap]
    var useDedicatedReplicationServer: js.UndefOr[Boolean]
  }

  object ReplicationConfigurationTemplate {
    @inline
    def apply(
        replicationConfigurationTemplateID: ReplicationConfigurationTemplateID,
        arn: js.UndefOr[ARN] = js.undefined,
        associateDefaultSecurityGroup: js.UndefOr[Boolean] = js.undefined,
        bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined,
        createPublicIP: js.UndefOr[Boolean] = js.undefined,
        dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting] = js.undefined,
        defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType] = js.undefined,
        ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption] = js.undefined,
        ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        replicationServerInstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
        replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs] = js.undefined,
        stagingAreaSubnetId: js.UndefOr[SubnetID] = js.undefined,
        stagingAreaTags: js.UndefOr[TagsMap] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        useDedicatedReplicationServer: js.UndefOr[Boolean] = js.undefined
    ): ReplicationConfigurationTemplate = {
      val __obj = js.Dynamic.literal(
        "replicationConfigurationTemplateID" -> replicationConfigurationTemplateID.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      associateDefaultSecurityGroup.foreach(__v => __obj.updateDynamic("associateDefaultSecurityGroup")(__v.asInstanceOf[js.Any]))
      bandwidthThrottling.foreach(__v => __obj.updateDynamic("bandwidthThrottling")(__v.asInstanceOf[js.Any]))
      createPublicIP.foreach(__v => __obj.updateDynamic("createPublicIP")(__v.asInstanceOf[js.Any]))
      dataPlaneRouting.foreach(__v => __obj.updateDynamic("dataPlaneRouting")(__v.asInstanceOf[js.Any]))
      defaultLargeStagingDiskType.foreach(__v => __obj.updateDynamic("defaultLargeStagingDiskType")(__v.asInstanceOf[js.Any]))
      ebsEncryption.foreach(__v => __obj.updateDynamic("ebsEncryption")(__v.asInstanceOf[js.Any]))
      ebsEncryptionKeyArn.foreach(__v => __obj.updateDynamic("ebsEncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      replicationServerInstanceType.foreach(__v => __obj.updateDynamic("replicationServerInstanceType")(__v.asInstanceOf[js.Any]))
      replicationServersSecurityGroupsIDs.foreach(__v => __obj.updateDynamic("replicationServersSecurityGroupsIDs")(__v.asInstanceOf[js.Any]))
      stagingAreaSubnetId.foreach(__v => __obj.updateDynamic("stagingAreaSubnetId")(__v.asInstanceOf[js.Any]))
      stagingAreaTags.foreach(__v => __obj.updateDynamic("stagingAreaTags")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      useDedicatedReplicationServer.foreach(__v => __obj.updateDynamic("useDedicatedReplicationServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationConfigurationTemplate]
    }
  }

  @js.native
  trait RetryDataReplicationRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object RetryDataReplicationRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): RetryDataReplicationRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RetryDataReplicationRequest]
    }
  }

  /** Source server properties.
    */
  @js.native
  trait SourceProperties extends js.Object {
    var cpus: js.UndefOr[Cpus]
    var disks: js.UndefOr[Disks]
    var identificationHints: js.UndefOr[IdentificationHints]
    var lastUpdatedDateTime: js.UndefOr[ISO8601DatetimeString]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var os: js.UndefOr[OS]
    var ramBytes: js.UndefOr[PositiveInteger]
    var recommendedInstanceType: js.UndefOr[EC2InstanceType]
  }

  object SourceProperties {
    @inline
    def apply(
        cpus: js.UndefOr[Cpus] = js.undefined,
        disks: js.UndefOr[Disks] = js.undefined,
        identificationHints: js.UndefOr[IdentificationHints] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        os: js.UndefOr[OS] = js.undefined,
        ramBytes: js.UndefOr[PositiveInteger] = js.undefined,
        recommendedInstanceType: js.UndefOr[EC2InstanceType] = js.undefined
    ): SourceProperties = {
      val __obj = js.Dynamic.literal()
      cpus.foreach(__v => __obj.updateDynamic("cpus")(__v.asInstanceOf[js.Any]))
      disks.foreach(__v => __obj.updateDynamic("disks")(__v.asInstanceOf[js.Any]))
      identificationHints.foreach(__v => __obj.updateDynamic("identificationHints")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      os.foreach(__v => __obj.updateDynamic("os")(__v.asInstanceOf[js.Any]))
      ramBytes.foreach(__v => __obj.updateDynamic("ramBytes")(__v.asInstanceOf[js.Any]))
      recommendedInstanceType.foreach(__v => __obj.updateDynamic("recommendedInstanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceProperties]
    }
  }

  @js.native
  trait SourceServer extends js.Object {
    var applicationID: js.UndefOr[ApplicationID]
    var arn: js.UndefOr[ARN]
    var dataReplicationInfo: js.UndefOr[DataReplicationInfo]
    var isArchived: js.UndefOr[Boolean]
    var launchedInstance: js.UndefOr[LaunchedInstance]
    var lifeCycle: js.UndefOr[LifeCycle]
    var replicationType: js.UndefOr[ReplicationType]
    var sourceProperties: js.UndefOr[SourceProperties]
    var sourceServerID: js.UndefOr[SourceServerID]
    var tags: js.UndefOr[TagsMap]
    var vcenterClientID: js.UndefOr[VcenterClientID]
  }

  object SourceServer {
    @inline
    def apply(
        applicationID: js.UndefOr[ApplicationID] = js.undefined,
        arn: js.UndefOr[ARN] = js.undefined,
        dataReplicationInfo: js.UndefOr[DataReplicationInfo] = js.undefined,
        isArchived: js.UndefOr[Boolean] = js.undefined,
        launchedInstance: js.UndefOr[LaunchedInstance] = js.undefined,
        lifeCycle: js.UndefOr[LifeCycle] = js.undefined,
        replicationType: js.UndefOr[ReplicationType] = js.undefined,
        sourceProperties: js.UndefOr[SourceProperties] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        vcenterClientID: js.UndefOr[VcenterClientID] = js.undefined
    ): SourceServer = {
      val __obj = js.Dynamic.literal()
      applicationID.foreach(__v => __obj.updateDynamic("applicationID")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dataReplicationInfo.foreach(__v => __obj.updateDynamic("dataReplicationInfo")(__v.asInstanceOf[js.Any]))
      isArchived.foreach(__v => __obj.updateDynamic("isArchived")(__v.asInstanceOf[js.Any]))
      launchedInstance.foreach(__v => __obj.updateDynamic("launchedInstance")(__v.asInstanceOf[js.Any]))
      lifeCycle.foreach(__v => __obj.updateDynamic("lifeCycle")(__v.asInstanceOf[js.Any]))
      replicationType.foreach(__v => __obj.updateDynamic("replicationType")(__v.asInstanceOf[js.Any]))
      sourceProperties.foreach(__v => __obj.updateDynamic("sourceProperties")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vcenterClientID.foreach(__v => __obj.updateDynamic("vcenterClientID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceServer]
    }
  }

  @js.native
  trait SourceServerActionDocument extends js.Object {
    var actionID: js.UndefOr[ActionID]
    var actionName: js.UndefOr[ActionName]
    var active: js.UndefOr[Boolean]
    var documentIdentifier: js.UndefOr[BoundedString]
    var documentVersion: js.UndefOr[DocumentVersion]
    var mustSucceedForCutover: js.UndefOr[Boolean]
    var order: js.UndefOr[OrderType]
    var parameters: js.UndefOr[SsmDocumentParameters]
    var timeoutSeconds: js.UndefOr[StrictlyPositiveInteger]
  }

  object SourceServerActionDocument {
    @inline
    def apply(
        actionID: js.UndefOr[ActionID] = js.undefined,
        actionName: js.UndefOr[ActionName] = js.undefined,
        active: js.UndefOr[Boolean] = js.undefined,
        documentIdentifier: js.UndefOr[BoundedString] = js.undefined,
        documentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined,
        order: js.UndefOr[OrderType] = js.undefined,
        parameters: js.UndefOr[SsmDocumentParameters] = js.undefined,
        timeoutSeconds: js.UndefOr[StrictlyPositiveInteger] = js.undefined
    ): SourceServerActionDocument = {
      val __obj = js.Dynamic.literal()
      actionID.foreach(__v => __obj.updateDynamic("actionID")(__v.asInstanceOf[js.Any]))
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      active.foreach(__v => __obj.updateDynamic("active")(__v.asInstanceOf[js.Any]))
      documentIdentifier.foreach(__v => __obj.updateDynamic("documentIdentifier")(__v.asInstanceOf[js.Any]))
      documentVersion.foreach(__v => __obj.updateDynamic("documentVersion")(__v.asInstanceOf[js.Any]))
      mustSucceedForCutover.foreach(__v => __obj.updateDynamic("mustSucceedForCutover")(__v.asInstanceOf[js.Any]))
      order.foreach(__v => __obj.updateDynamic("order")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      timeoutSeconds.foreach(__v => __obj.updateDynamic("timeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceServerActionDocument]
    }
  }

  /** Source server post migration custom action filters.
    */
  @js.native
  trait SourceServerActionsRequestFilters extends js.Object {
    var actionIDs: js.UndefOr[ActionIDs]
  }

  object SourceServerActionsRequestFilters {
    @inline
    def apply(
        actionIDs: js.UndefOr[ActionIDs] = js.undefined
    ): SourceServerActionsRequestFilters = {
      val __obj = js.Dynamic.literal()
      actionIDs.foreach(__v => __obj.updateDynamic("actionIDs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceServerActionsRequestFilters]
    }
  }

  /** AWS Systems Manager Document.
    */
  @js.native
  trait SsmDocument extends js.Object {
    var actionName: BoundedString
    var ssmDocumentName: SsmDocumentName
    var mustSucceedForCutover: js.UndefOr[Boolean]
    var parameters: js.UndefOr[SsmDocumentParameters]
    var timeoutSeconds: js.UndefOr[StrictlyPositiveInteger]
  }

  object SsmDocument {
    @inline
    def apply(
        actionName: BoundedString,
        ssmDocumentName: SsmDocumentName,
        mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined,
        parameters: js.UndefOr[SsmDocumentParameters] = js.undefined,
        timeoutSeconds: js.UndefOr[StrictlyPositiveInteger] = js.undefined
    ): SsmDocument = {
      val __obj = js.Dynamic.literal(
        "actionName" -> actionName.asInstanceOf[js.Any],
        "ssmDocumentName" -> ssmDocumentName.asInstanceOf[js.Any]
      )

      mustSucceedForCutover.foreach(__v => __obj.updateDynamic("mustSucceedForCutover")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      timeoutSeconds.foreach(__v => __obj.updateDynamic("timeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SsmDocument]
    }
  }

  /** AWS Systems Manager Parameter Store parameter.
    */
  @js.native
  trait SsmParameterStoreParameter extends js.Object {
    var parameterName: SsmParameterStoreParameterName
    var parameterType: SsmParameterStoreParameterType
  }

  object SsmParameterStoreParameter {
    @inline
    def apply(
        parameterName: SsmParameterStoreParameterName,
        parameterType: SsmParameterStoreParameterType
    ): SsmParameterStoreParameter = {
      val __obj = js.Dynamic.literal(
        "parameterName" -> parameterName.asInstanceOf[js.Any],
        "parameterType" -> parameterType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SsmParameterStoreParameter]
    }
  }

  @js.native
  trait StartCutoverRequest extends js.Object {
    var sourceServerIDs: StartCutoverRequestSourceServerIDs
    var tags: js.UndefOr[TagsMap]
  }

  object StartCutoverRequest {
    @inline
    def apply(
        sourceServerIDs: StartCutoverRequestSourceServerIDs,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): StartCutoverRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerIDs" -> sourceServerIDs.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartCutoverRequest]
    }
  }

  @js.native
  trait StartCutoverResponse extends js.Object {
    var job: js.UndefOr[Job]
  }

  object StartCutoverResponse {
    @inline
    def apply(
        job: js.UndefOr[Job] = js.undefined
    ): StartCutoverResponse = {
      val __obj = js.Dynamic.literal()
      job.foreach(__v => __obj.updateDynamic("job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartCutoverResponse]
    }
  }

  @js.native
  trait StartReplicationRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object StartReplicationRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): StartReplicationRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartReplicationRequest]
    }
  }

  @js.native
  trait StartTestRequest extends js.Object {
    var sourceServerIDs: StartTestRequestSourceServerIDs
    var tags: js.UndefOr[TagsMap]
  }

  object StartTestRequest {
    @inline
    def apply(
        sourceServerIDs: StartTestRequestSourceServerIDs,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): StartTestRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerIDs" -> sourceServerIDs.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTestRequest]
    }
  }

  @js.native
  trait StartTestResponse extends js.Object {
    var job: js.UndefOr[Job]
  }

  object StartTestResponse {
    @inline
    def apply(
        job: js.UndefOr[Job] = js.undefined
    ): StartTestResponse = {
      val __obj = js.Dynamic.literal()
      job.foreach(__v => __obj.updateDynamic("job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTestResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tags: TagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tags: TagsMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TemplateActionDocument extends js.Object {
    var actionID: js.UndefOr[ActionID]
    var actionName: js.UndefOr[BoundedString]
    var active: js.UndefOr[Boolean]
    var documentIdentifier: js.UndefOr[BoundedString]
    var documentVersion: js.UndefOr[DocumentVersion]
    var mustSucceedForCutover: js.UndefOr[Boolean]
    var operatingSystem: js.UndefOr[OperatingSystemString]
    var order: js.UndefOr[OrderType]
    var parameters: js.UndefOr[SsmDocumentParameters]
    var timeoutSeconds: js.UndefOr[StrictlyPositiveInteger]
  }

  object TemplateActionDocument {
    @inline
    def apply(
        actionID: js.UndefOr[ActionID] = js.undefined,
        actionName: js.UndefOr[BoundedString] = js.undefined,
        active: js.UndefOr[Boolean] = js.undefined,
        documentIdentifier: js.UndefOr[BoundedString] = js.undefined,
        documentVersion: js.UndefOr[DocumentVersion] = js.undefined,
        mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined,
        operatingSystem: js.UndefOr[OperatingSystemString] = js.undefined,
        order: js.UndefOr[OrderType] = js.undefined,
        parameters: js.UndefOr[SsmDocumentParameters] = js.undefined,
        timeoutSeconds: js.UndefOr[StrictlyPositiveInteger] = js.undefined
    ): TemplateActionDocument = {
      val __obj = js.Dynamic.literal()
      actionID.foreach(__v => __obj.updateDynamic("actionID")(__v.asInstanceOf[js.Any]))
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      active.foreach(__v => __obj.updateDynamic("active")(__v.asInstanceOf[js.Any]))
      documentIdentifier.foreach(__v => __obj.updateDynamic("documentIdentifier")(__v.asInstanceOf[js.Any]))
      documentVersion.foreach(__v => __obj.updateDynamic("documentVersion")(__v.asInstanceOf[js.Any]))
      mustSucceedForCutover.foreach(__v => __obj.updateDynamic("mustSucceedForCutover")(__v.asInstanceOf[js.Any]))
      operatingSystem.foreach(__v => __obj.updateDynamic("operatingSystem")(__v.asInstanceOf[js.Any]))
      order.foreach(__v => __obj.updateDynamic("order")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      timeoutSeconds.foreach(__v => __obj.updateDynamic("timeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateActionDocument]
    }
  }

  /** Template post migration custom action filters.
    */
  @js.native
  trait TemplateActionsRequestFilters extends js.Object {
    var actionIDs: js.UndefOr[ActionIDs]
  }

  object TemplateActionsRequestFilters {
    @inline
    def apply(
        actionIDs: js.UndefOr[ActionIDs] = js.undefined
    ): TemplateActionsRequestFilters = {
      val __obj = js.Dynamic.literal()
      actionIDs.foreach(__v => __obj.updateDynamic("actionIDs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateActionsRequestFilters]
    }
  }

  @js.native
  trait TerminateTargetInstancesRequest extends js.Object {
    var sourceServerIDs: TerminateTargetInstancesRequestSourceServerIDs
    var tags: js.UndefOr[TagsMap]
  }

  object TerminateTargetInstancesRequest {
    @inline
    def apply(
        sourceServerIDs: TerminateTargetInstancesRequestSourceServerIDs,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): TerminateTargetInstancesRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerIDs" -> sourceServerIDs.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateTargetInstancesRequest]
    }
  }

  @js.native
  trait TerminateTargetInstancesResponse extends js.Object {
    var job: js.UndefOr[Job]
  }

  object TerminateTargetInstancesResponse {
    @inline
    def apply(
        job: js.UndefOr[Job] = js.undefined
    ): TerminateTargetInstancesResponse = {
      val __obj = js.Dynamic.literal()
      job.foreach(__v => __obj.updateDynamic("job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateTargetInstancesResponse]
    }
  }

  @js.native
  trait UnarchiveApplicationRequest extends js.Object {
    var applicationID: ApplicationID
  }

  object UnarchiveApplicationRequest {
    @inline
    def apply(
        applicationID: ApplicationID
    ): UnarchiveApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationID" -> applicationID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnarchiveApplicationRequest]
    }
  }

  @js.native
  trait UnarchiveWaveRequest extends js.Object {
    var waveID: WaveID
  }

  object UnarchiveWaveRequest {
    @inline
    def apply(
        waveID: WaveID
    ): UnarchiveWaveRequest = {
      val __obj = js.Dynamic.literal(
        "waveID" -> waveID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnarchiveWaveRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var applicationID: ApplicationID
    var description: js.UndefOr[ApplicationDescription]
    var name: js.UndefOr[ApplicationName]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        applicationID: ApplicationID,
        description: js.UndefOr[ApplicationDescription] = js.undefined,
        name: js.UndefOr[ApplicationName] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationID" -> applicationID.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateLaunchConfigurationRequest extends js.Object {
    var sourceServerID: SourceServerID
    var bootMode: js.UndefOr[BootMode]
    var copyPrivateIp: js.UndefOr[Boolean]
    var copyTags: js.UndefOr[Boolean]
    var enableMapAutoTagging: js.UndefOr[Boolean]
    var launchDisposition: js.UndefOr[LaunchDisposition]
    var licensing: js.UndefOr[Licensing]
    var mapAutoTaggingMpeID: js.UndefOr[TagValue]
    var name: js.UndefOr[SmallBoundedString]
    var postLaunchActions: js.UndefOr[PostLaunchActions]
    var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod]
  }

  object UpdateLaunchConfigurationRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID,
        bootMode: js.UndefOr[BootMode] = js.undefined,
        copyPrivateIp: js.UndefOr[Boolean] = js.undefined,
        copyTags: js.UndefOr[Boolean] = js.undefined,
        enableMapAutoTagging: js.UndefOr[Boolean] = js.undefined,
        launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined,
        licensing: js.UndefOr[Licensing] = js.undefined,
        mapAutoTaggingMpeID: js.UndefOr[TagValue] = js.undefined,
        name: js.UndefOr[SmallBoundedString] = js.undefined,
        postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined,
        targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
    ): UpdateLaunchConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      bootMode.foreach(__v => __obj.updateDynamic("bootMode")(__v.asInstanceOf[js.Any]))
      copyPrivateIp.foreach(__v => __obj.updateDynamic("copyPrivateIp")(__v.asInstanceOf[js.Any]))
      copyTags.foreach(__v => __obj.updateDynamic("copyTags")(__v.asInstanceOf[js.Any]))
      enableMapAutoTagging.foreach(__v => __obj.updateDynamic("enableMapAutoTagging")(__v.asInstanceOf[js.Any]))
      launchDisposition.foreach(__v => __obj.updateDynamic("launchDisposition")(__v.asInstanceOf[js.Any]))
      licensing.foreach(__v => __obj.updateDynamic("licensing")(__v.asInstanceOf[js.Any]))
      mapAutoTaggingMpeID.foreach(__v => __obj.updateDynamic("mapAutoTaggingMpeID")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      postLaunchActions.foreach(__v => __obj.updateDynamic("postLaunchActions")(__v.asInstanceOf[js.Any]))
      targetInstanceTypeRightSizingMethod.foreach(__v => __obj.updateDynamic("targetInstanceTypeRightSizingMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLaunchConfigurationRequest]
    }
  }

  @js.native
  trait UpdateLaunchConfigurationTemplateRequest extends js.Object {
    var launchConfigurationTemplateID: LaunchConfigurationTemplateID
    var associatePublicIpAddress: js.UndefOr[Boolean]
    var bootMode: js.UndefOr[BootMode]
    var copyPrivateIp: js.UndefOr[Boolean]
    var copyTags: js.UndefOr[Boolean]
    var enableMapAutoTagging: js.UndefOr[Boolean]
    var largeVolumeConf: js.UndefOr[LaunchTemplateDiskConf]
    var launchDisposition: js.UndefOr[LaunchDisposition]
    var licensing: js.UndefOr[Licensing]
    var mapAutoTaggingMpeID: js.UndefOr[TagValue]
    var postLaunchActions: js.UndefOr[PostLaunchActions]
    var smallVolumeConf: js.UndefOr[LaunchTemplateDiskConf]
    var smallVolumeMaxSize: js.UndefOr[PositiveInteger]
    var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod]
  }

  object UpdateLaunchConfigurationTemplateRequest {
    @inline
    def apply(
        launchConfigurationTemplateID: LaunchConfigurationTemplateID,
        associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
        bootMode: js.UndefOr[BootMode] = js.undefined,
        copyPrivateIp: js.UndefOr[Boolean] = js.undefined,
        copyTags: js.UndefOr[Boolean] = js.undefined,
        enableMapAutoTagging: js.UndefOr[Boolean] = js.undefined,
        largeVolumeConf: js.UndefOr[LaunchTemplateDiskConf] = js.undefined,
        launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined,
        licensing: js.UndefOr[Licensing] = js.undefined,
        mapAutoTaggingMpeID: js.UndefOr[TagValue] = js.undefined,
        postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined,
        smallVolumeConf: js.UndefOr[LaunchTemplateDiskConf] = js.undefined,
        smallVolumeMaxSize: js.UndefOr[PositiveInteger] = js.undefined,
        targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
    ): UpdateLaunchConfigurationTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "launchConfigurationTemplateID" -> launchConfigurationTemplateID.asInstanceOf[js.Any]
      )

      associatePublicIpAddress.foreach(__v => __obj.updateDynamic("associatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      bootMode.foreach(__v => __obj.updateDynamic("bootMode")(__v.asInstanceOf[js.Any]))
      copyPrivateIp.foreach(__v => __obj.updateDynamic("copyPrivateIp")(__v.asInstanceOf[js.Any]))
      copyTags.foreach(__v => __obj.updateDynamic("copyTags")(__v.asInstanceOf[js.Any]))
      enableMapAutoTagging.foreach(__v => __obj.updateDynamic("enableMapAutoTagging")(__v.asInstanceOf[js.Any]))
      largeVolumeConf.foreach(__v => __obj.updateDynamic("largeVolumeConf")(__v.asInstanceOf[js.Any]))
      launchDisposition.foreach(__v => __obj.updateDynamic("launchDisposition")(__v.asInstanceOf[js.Any]))
      licensing.foreach(__v => __obj.updateDynamic("licensing")(__v.asInstanceOf[js.Any]))
      mapAutoTaggingMpeID.foreach(__v => __obj.updateDynamic("mapAutoTaggingMpeID")(__v.asInstanceOf[js.Any]))
      postLaunchActions.foreach(__v => __obj.updateDynamic("postLaunchActions")(__v.asInstanceOf[js.Any]))
      smallVolumeConf.foreach(__v => __obj.updateDynamic("smallVolumeConf")(__v.asInstanceOf[js.Any]))
      smallVolumeMaxSize.foreach(__v => __obj.updateDynamic("smallVolumeMaxSize")(__v.asInstanceOf[js.Any]))
      targetInstanceTypeRightSizingMethod.foreach(__v => __obj.updateDynamic("targetInstanceTypeRightSizingMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLaunchConfigurationTemplateRequest]
    }
  }

  @js.native
  trait UpdateReplicationConfigurationRequest extends js.Object {
    var sourceServerID: SourceServerID
    var associateDefaultSecurityGroup: js.UndefOr[Boolean]
    var bandwidthThrottling: js.UndefOr[PositiveInteger]
    var createPublicIP: js.UndefOr[Boolean]
    var dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting]
    var defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType]
    var ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption]
    var ebsEncryptionKeyArn: js.UndefOr[ARN]
    var name: js.UndefOr[SmallBoundedString]
    var replicatedDisks: js.UndefOr[ReplicationConfigurationReplicatedDisks]
    var replicationServerInstanceType: js.UndefOr[EC2InstanceType]
    var replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs]
    var stagingAreaSubnetId: js.UndefOr[SubnetID]
    var stagingAreaTags: js.UndefOr[TagsMap]
    var useDedicatedReplicationServer: js.UndefOr[Boolean]
  }

  object UpdateReplicationConfigurationRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID,
        associateDefaultSecurityGroup: js.UndefOr[Boolean] = js.undefined,
        bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined,
        createPublicIP: js.UndefOr[Boolean] = js.undefined,
        dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting] = js.undefined,
        defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType] = js.undefined,
        ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption] = js.undefined,
        ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        name: js.UndefOr[SmallBoundedString] = js.undefined,
        replicatedDisks: js.UndefOr[ReplicationConfigurationReplicatedDisks] = js.undefined,
        replicationServerInstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
        replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs] = js.undefined,
        stagingAreaSubnetId: js.UndefOr[SubnetID] = js.undefined,
        stagingAreaTags: js.UndefOr[TagsMap] = js.undefined,
        useDedicatedReplicationServer: js.UndefOr[Boolean] = js.undefined
    ): UpdateReplicationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      associateDefaultSecurityGroup.foreach(__v => __obj.updateDynamic("associateDefaultSecurityGroup")(__v.asInstanceOf[js.Any]))
      bandwidthThrottling.foreach(__v => __obj.updateDynamic("bandwidthThrottling")(__v.asInstanceOf[js.Any]))
      createPublicIP.foreach(__v => __obj.updateDynamic("createPublicIP")(__v.asInstanceOf[js.Any]))
      dataPlaneRouting.foreach(__v => __obj.updateDynamic("dataPlaneRouting")(__v.asInstanceOf[js.Any]))
      defaultLargeStagingDiskType.foreach(__v => __obj.updateDynamic("defaultLargeStagingDiskType")(__v.asInstanceOf[js.Any]))
      ebsEncryption.foreach(__v => __obj.updateDynamic("ebsEncryption")(__v.asInstanceOf[js.Any]))
      ebsEncryptionKeyArn.foreach(__v => __obj.updateDynamic("ebsEncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      replicatedDisks.foreach(__v => __obj.updateDynamic("replicatedDisks")(__v.asInstanceOf[js.Any]))
      replicationServerInstanceType.foreach(__v => __obj.updateDynamic("replicationServerInstanceType")(__v.asInstanceOf[js.Any]))
      replicationServersSecurityGroupsIDs.foreach(__v => __obj.updateDynamic("replicationServersSecurityGroupsIDs")(__v.asInstanceOf[js.Any]))
      stagingAreaSubnetId.foreach(__v => __obj.updateDynamic("stagingAreaSubnetId")(__v.asInstanceOf[js.Any]))
      stagingAreaTags.foreach(__v => __obj.updateDynamic("stagingAreaTags")(__v.asInstanceOf[js.Any]))
      useDedicatedReplicationServer.foreach(__v => __obj.updateDynamic("useDedicatedReplicationServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReplicationConfigurationRequest]
    }
  }

  @js.native
  trait UpdateReplicationConfigurationTemplateRequest extends js.Object {
    var replicationConfigurationTemplateID: ReplicationConfigurationTemplateID
    var arn: js.UndefOr[ARN]
    var associateDefaultSecurityGroup: js.UndefOr[Boolean]
    var bandwidthThrottling: js.UndefOr[PositiveInteger]
    var createPublicIP: js.UndefOr[Boolean]
    var dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting]
    var defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType]
    var ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption]
    var ebsEncryptionKeyArn: js.UndefOr[ARN]
    var replicationServerInstanceType: js.UndefOr[EC2InstanceType]
    var replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs]
    var stagingAreaSubnetId: js.UndefOr[SubnetID]
    var stagingAreaTags: js.UndefOr[TagsMap]
    var useDedicatedReplicationServer: js.UndefOr[Boolean]
  }

  object UpdateReplicationConfigurationTemplateRequest {
    @inline
    def apply(
        replicationConfigurationTemplateID: ReplicationConfigurationTemplateID,
        arn: js.UndefOr[ARN] = js.undefined,
        associateDefaultSecurityGroup: js.UndefOr[Boolean] = js.undefined,
        bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined,
        createPublicIP: js.UndefOr[Boolean] = js.undefined,
        dataPlaneRouting: js.UndefOr[ReplicationConfigurationDataPlaneRouting] = js.undefined,
        defaultLargeStagingDiskType: js.UndefOr[ReplicationConfigurationDefaultLargeStagingDiskType] = js.undefined,
        ebsEncryption: js.UndefOr[ReplicationConfigurationEbsEncryption] = js.undefined,
        ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        replicationServerInstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
        replicationServersSecurityGroupsIDs: js.UndefOr[ReplicationServersSecurityGroupsIDs] = js.undefined,
        stagingAreaSubnetId: js.UndefOr[SubnetID] = js.undefined,
        stagingAreaTags: js.UndefOr[TagsMap] = js.undefined,
        useDedicatedReplicationServer: js.UndefOr[Boolean] = js.undefined
    ): UpdateReplicationConfigurationTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "replicationConfigurationTemplateID" -> replicationConfigurationTemplateID.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      associateDefaultSecurityGroup.foreach(__v => __obj.updateDynamic("associateDefaultSecurityGroup")(__v.asInstanceOf[js.Any]))
      bandwidthThrottling.foreach(__v => __obj.updateDynamic("bandwidthThrottling")(__v.asInstanceOf[js.Any]))
      createPublicIP.foreach(__v => __obj.updateDynamic("createPublicIP")(__v.asInstanceOf[js.Any]))
      dataPlaneRouting.foreach(__v => __obj.updateDynamic("dataPlaneRouting")(__v.asInstanceOf[js.Any]))
      defaultLargeStagingDiskType.foreach(__v => __obj.updateDynamic("defaultLargeStagingDiskType")(__v.asInstanceOf[js.Any]))
      ebsEncryption.foreach(__v => __obj.updateDynamic("ebsEncryption")(__v.asInstanceOf[js.Any]))
      ebsEncryptionKeyArn.foreach(__v => __obj.updateDynamic("ebsEncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      replicationServerInstanceType.foreach(__v => __obj.updateDynamic("replicationServerInstanceType")(__v.asInstanceOf[js.Any]))
      replicationServersSecurityGroupsIDs.foreach(__v => __obj.updateDynamic("replicationServersSecurityGroupsIDs")(__v.asInstanceOf[js.Any]))
      stagingAreaSubnetId.foreach(__v => __obj.updateDynamic("stagingAreaSubnetId")(__v.asInstanceOf[js.Any]))
      stagingAreaTags.foreach(__v => __obj.updateDynamic("stagingAreaTags")(__v.asInstanceOf[js.Any]))
      useDedicatedReplicationServer.foreach(__v => __obj.updateDynamic("useDedicatedReplicationServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReplicationConfigurationTemplateRequest]
    }
  }

  @js.native
  trait UpdateSourceServerReplicationTypeRequest extends js.Object {
    var replicationType: ReplicationType
    var sourceServerID: SourceServerID
  }

  object UpdateSourceServerReplicationTypeRequest {
    @inline
    def apply(
        replicationType: ReplicationType,
        sourceServerID: SourceServerID
    ): UpdateSourceServerReplicationTypeRequest = {
      val __obj = js.Dynamic.literal(
        "replicationType" -> replicationType.asInstanceOf[js.Any],
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSourceServerReplicationTypeRequest]
    }
  }

  @js.native
  trait UpdateWaveRequest extends js.Object {
    var waveID: WaveID
    var description: js.UndefOr[WaveDescription]
    var name: js.UndefOr[WaveName]
  }

  object UpdateWaveRequest {
    @inline
    def apply(
        waveID: WaveID,
        description: js.UndefOr[WaveDescription] = js.undefined,
        name: js.UndefOr[WaveName] = js.undefined
    ): UpdateWaveRequest = {
      val __obj = js.Dynamic.literal(
        "waveID" -> waveID.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWaveRequest]
    }
  }

  /** vCenter client.
    */
  @js.native
  trait VcenterClient extends js.Object {
    var arn: js.UndefOr[ARN]
    var datacenterName: js.UndefOr[BoundedString]
    var hostname: js.UndefOr[BoundedString]
    var lastSeenDatetime: js.UndefOr[ISO8601DatetimeString]
    var sourceServerTags: js.UndefOr[TagsMap]
    var tags: js.UndefOr[TagsMap]
    var vcenterClientID: js.UndefOr[VcenterClientID]
    var vcenterUUID: js.UndefOr[BoundedString]
  }

  object VcenterClient {
    @inline
    def apply(
        arn: js.UndefOr[ARN] = js.undefined,
        datacenterName: js.UndefOr[BoundedString] = js.undefined,
        hostname: js.UndefOr[BoundedString] = js.undefined,
        lastSeenDatetime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        sourceServerTags: js.UndefOr[TagsMap] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        vcenterClientID: js.UndefOr[VcenterClientID] = js.undefined,
        vcenterUUID: js.UndefOr[BoundedString] = js.undefined
    ): VcenterClient = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      datacenterName.foreach(__v => __obj.updateDynamic("datacenterName")(__v.asInstanceOf[js.Any]))
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      lastSeenDatetime.foreach(__v => __obj.updateDynamic("lastSeenDatetime")(__v.asInstanceOf[js.Any]))
      sourceServerTags.foreach(__v => __obj.updateDynamic("sourceServerTags")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vcenterClientID.foreach(__v => __obj.updateDynamic("vcenterClientID")(__v.asInstanceOf[js.Any]))
      vcenterUUID.foreach(__v => __obj.updateDynamic("vcenterUUID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VcenterClient]
    }
  }

  @js.native
  trait Wave extends js.Object {
    var arn: js.UndefOr[ARN]
    var creationDateTime: js.UndefOr[ISO8601DatetimeString]
    var description: js.UndefOr[WaveDescription]
    var isArchived: js.UndefOr[Boolean]
    var lastModifiedDateTime: js.UndefOr[ISO8601DatetimeString]
    var name: js.UndefOr[WaveName]
    var tags: js.UndefOr[TagsMap]
    var waveAggregatedStatus: js.UndefOr[WaveAggregatedStatus]
    var waveID: js.UndefOr[WaveID]
  }

  object Wave {
    @inline
    def apply(
        arn: js.UndefOr[ARN] = js.undefined,
        creationDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        description: js.UndefOr[WaveDescription] = js.undefined,
        isArchived: js.UndefOr[Boolean] = js.undefined,
        lastModifiedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        name: js.UndefOr[WaveName] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        waveAggregatedStatus: js.UndefOr[WaveAggregatedStatus] = js.undefined,
        waveID: js.UndefOr[WaveID] = js.undefined
    ): Wave = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      isArchived.foreach(__v => __obj.updateDynamic("isArchived")(__v.asInstanceOf[js.Any]))
      lastModifiedDateTime.foreach(__v => __obj.updateDynamic("lastModifiedDateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      waveAggregatedStatus.foreach(__v => __obj.updateDynamic("waveAggregatedStatus")(__v.asInstanceOf[js.Any]))
      waveID.foreach(__v => __obj.updateDynamic("waveID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Wave]
    }
  }

  /** Wave aggregated status.
    */
  @js.native
  trait WaveAggregatedStatus extends js.Object {
    var healthStatus: js.UndefOr[WaveHealthStatus]
    var lastUpdateDateTime: js.UndefOr[ISO8601DatetimeString]
    var progressStatus: js.UndefOr[WaveProgressStatus]
    var replicationStartedDateTime: js.UndefOr[ISO8601DatetimeString]
    var totalApplications: js.UndefOr[PositiveInteger]
  }

  object WaveAggregatedStatus {
    @inline
    def apply(
        healthStatus: js.UndefOr[WaveHealthStatus] = js.undefined,
        lastUpdateDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        progressStatus: js.UndefOr[WaveProgressStatus] = js.undefined,
        replicationStartedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        totalApplications: js.UndefOr[PositiveInteger] = js.undefined
    ): WaveAggregatedStatus = {
      val __obj = js.Dynamic.literal()
      healthStatus.foreach(__v => __obj.updateDynamic("healthStatus")(__v.asInstanceOf[js.Any]))
      lastUpdateDateTime.foreach(__v => __obj.updateDynamic("lastUpdateDateTime")(__v.asInstanceOf[js.Any]))
      progressStatus.foreach(__v => __obj.updateDynamic("progressStatus")(__v.asInstanceOf[js.Any]))
      replicationStartedDateTime.foreach(__v => __obj.updateDynamic("replicationStartedDateTime")(__v.asInstanceOf[js.Any]))
      totalApplications.foreach(__v => __obj.updateDynamic("totalApplications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaveAggregatedStatus]
    }
  }
}
