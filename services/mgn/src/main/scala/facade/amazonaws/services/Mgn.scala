package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mgn {
  type ARN = String
  type BoundedString = String
  type Cpus = js.Array[CPU]
  type DataReplicationInfoReplicatedDisks = js.Array[DataReplicationInfoReplicatedDisk]
  type DataReplicationInitiationSteps = js.Array[DataReplicationInitiationStep]
  type DescribeJobsRequestFiltersJobIDs = js.Array[JobID]
  type DescribeSourceServersRequestFiltersIDs = js.Array[SourceServerID]
  type Disks = js.Array[Disk]
  type EC2InstanceID = String
  type EC2InstanceType = String
  type IPsList = js.Array[BoundedString]
  type ISO8601DatetimeString = String
  type JobID = String
  type JobLogs = js.Array[JobLog]
  type JobsList = js.Array[Job]
  type LargeBoundedString = String
  type NetworkInterfaces = js.Array[NetworkInterface]
  type PaginationToken = String
  type ParticipatingServers = js.Array[ParticipatingServer]
  type PositiveInteger = Double
  type ReplicationConfigurationReplicatedDisks = js.Array[ReplicationConfigurationReplicatedDisk]
  type ReplicationConfigurationTemplateID = String
  type ReplicationConfigurationTemplateIDs = js.Array[ReplicationConfigurationTemplateID]
  type ReplicationConfigurationTemplates = js.Array[ReplicationConfigurationTemplate]
  type ReplicationServersSecurityGroupsIDs = js.Array[SecurityGroupID]
  type SecurityGroupID = String
  type SmallBoundedString = String
  type SourceServerID = String
  type SourceServersList = js.Array[SourceServer]
  type StartCutoverRequestSourceServerIDs = js.Array[SourceServerID]
  type StartTestRequestSourceServerIDs = js.Array[SourceServerID]
  type StrictlyPositiveInteger = Int
  type SubnetID = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type TagsMap = js.Dictionary[TagValue]
  type TerminateTargetInstancesRequestSourceServerIDs = js.Array[SourceServerID]

  final class MgnOps(private val service: Mgn) extends AnyVal {

    @inline def changeServerLifeCycleStateFuture(params: ChangeServerLifeCycleStateRequest): Future[SourceServer] = service.changeServerLifeCycleState(params).promise().toFuture
    @inline def createReplicationConfigurationTemplateFuture(params: CreateReplicationConfigurationTemplateRequest): Future[ReplicationConfigurationTemplate] = service.createReplicationConfigurationTemplate(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResponse] = service.deleteJob(params).promise().toFuture
    @inline def deleteReplicationConfigurationTemplateFuture(params: DeleteReplicationConfigurationTemplateRequest): Future[DeleteReplicationConfigurationTemplateResponse] = service.deleteReplicationConfigurationTemplate(params).promise().toFuture
    @inline def deleteSourceServerFuture(params: DeleteSourceServerRequest): Future[DeleteSourceServerResponse] = service.deleteSourceServer(params).promise().toFuture
    @inline def describeJobLogItemsFuture(params: DescribeJobLogItemsRequest): Future[DescribeJobLogItemsResponse] = service.describeJobLogItems(params).promise().toFuture
    @inline def describeJobsFuture(params: DescribeJobsRequest): Future[DescribeJobsResponse] = service.describeJobs(params).promise().toFuture
    @inline def describeReplicationConfigurationTemplatesFuture(params: DescribeReplicationConfigurationTemplatesRequest): Future[DescribeReplicationConfigurationTemplatesResponse] = service.describeReplicationConfigurationTemplates(params).promise().toFuture
    @inline def describeSourceServersFuture(params: DescribeSourceServersRequest): Future[DescribeSourceServersResponse] = service.describeSourceServers(params).promise().toFuture
    @inline def disconnectFromServiceFuture(params: DisconnectFromServiceRequest): Future[SourceServer] = service.disconnectFromService(params).promise().toFuture
    @inline def finalizeCutoverFuture(params: FinalizeCutoverRequest): Future[SourceServer] = service.finalizeCutover(params).promise().toFuture
    @inline def getLaunchConfigurationFuture(params: GetLaunchConfigurationRequest): Future[LaunchConfiguration] = service.getLaunchConfiguration(params).promise().toFuture
    @inline def getReplicationConfigurationFuture(params: GetReplicationConfigurationRequest): Future[ReplicationConfiguration] = service.getReplicationConfiguration(params).promise().toFuture
    @inline def initializeServiceFuture(params: InitializeServiceRequest): Future[InitializeServiceResponse] = service.initializeService(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def markAsArchivedFuture(params: MarkAsArchivedRequest): Future[SourceServer] = service.markAsArchived(params).promise().toFuture
    @inline def retryDataReplicationFuture(params: RetryDataReplicationRequest): Future[SourceServer] = service.retryDataReplication(params).promise().toFuture
    @inline def startCutoverFuture(params: StartCutoverRequest): Future[StartCutoverResponse] = service.startCutover(params).promise().toFuture
    @inline def startTestFuture(params: StartTestRequest): Future[StartTestResponse] = service.startTest(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def terminateTargetInstancesFuture(params: TerminateTargetInstancesRequest): Future[TerminateTargetInstancesResponse] = service.terminateTargetInstances(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateLaunchConfigurationFuture(params: UpdateLaunchConfigurationRequest): Future[LaunchConfiguration] = service.updateLaunchConfiguration(params).promise().toFuture
    @inline def updateReplicationConfigurationFuture(params: UpdateReplicationConfigurationRequest): Future[ReplicationConfiguration] = service.updateReplicationConfiguration(params).promise().toFuture
    @inline def updateReplicationConfigurationTemplateFuture(params: UpdateReplicationConfigurationTemplateRequest): Future[ReplicationConfigurationTemplate] = service.updateReplicationConfigurationTemplate(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/mgn", JSImport.Namespace, "AWS.Mgn")
  class Mgn() extends js.Object {
    def this(config: AWSConfig) = this()

    def changeServerLifeCycleState(params: ChangeServerLifeCycleStateRequest): Request[SourceServer] = js.native
    def createReplicationConfigurationTemplate(params: CreateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate] = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse] = js.native
    def deleteReplicationConfigurationTemplate(params: DeleteReplicationConfigurationTemplateRequest): Request[DeleteReplicationConfigurationTemplateResponse] = js.native
    def deleteSourceServer(params: DeleteSourceServerRequest): Request[DeleteSourceServerResponse] = js.native
    def describeJobLogItems(params: DescribeJobLogItemsRequest): Request[DescribeJobLogItemsResponse] = js.native
    def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse] = js.native
    def describeReplicationConfigurationTemplates(params: DescribeReplicationConfigurationTemplatesRequest): Request[DescribeReplicationConfigurationTemplatesResponse] = js.native
    def describeSourceServers(params: DescribeSourceServersRequest): Request[DescribeSourceServersResponse] = js.native
    def disconnectFromService(params: DisconnectFromServiceRequest): Request[SourceServer] = js.native
    def finalizeCutover(params: FinalizeCutoverRequest): Request[SourceServer] = js.native
    def getLaunchConfiguration(params: GetLaunchConfigurationRequest): Request[LaunchConfiguration] = js.native
    def getReplicationConfiguration(params: GetReplicationConfigurationRequest): Request[ReplicationConfiguration] = js.native
    def initializeService(params: InitializeServiceRequest): Request[InitializeServiceResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def markAsArchived(params: MarkAsArchivedRequest): Request[SourceServer] = js.native
    def retryDataReplication(params: RetryDataReplicationRequest): Request[SourceServer] = js.native
    def startCutover(params: StartCutoverRequest): Request[StartCutoverResponse] = js.native
    def startTest(params: StartTestRequest): Request[StartTestResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def terminateTargetInstances(params: TerminateTargetInstancesRequest): Request[TerminateTargetInstancesResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateLaunchConfiguration(params: UpdateLaunchConfigurationRequest): Request[LaunchConfiguration] = js.native
    def updateReplicationConfiguration(params: UpdateReplicationConfigurationRequest): Request[ReplicationConfiguration] = js.native
    def updateReplicationConfigurationTemplate(params: UpdateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate] = js.native
  }
  object Mgn {
    @inline implicit def toOps(service: Mgn): MgnOps = {
      new MgnOps(service)
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
    var lagDuration: js.UndefOr[ISO8601DatetimeString]
    var replicatedDisks: js.UndefOr[DataReplicationInfoReplicatedDisks]
  }

  object DataReplicationInfo {
    @inline
    def apply(
        dataReplicationError: js.UndefOr[DataReplicationError] = js.undefined,
        dataReplicationInitiation: js.UndefOr[DataReplicationInitiation] = js.undefined,
        dataReplicationState: js.UndefOr[DataReplicationState] = js.undefined,
        etaDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        lagDuration: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        replicatedDisks: js.UndefOr[DataReplicationInfoReplicatedDisks] = js.undefined
    ): DataReplicationInfo = {
      val __obj = js.Dynamic.literal()
      dataReplicationError.foreach(__v => __obj.updateDynamic("dataReplicationError")(__v.asInstanceOf[js.Any]))
      dataReplicationInitiation.foreach(__v => __obj.updateDynamic("dataReplicationInitiation")(__v.asInstanceOf[js.Any]))
      dataReplicationState.foreach(__v => __obj.updateDynamic("dataReplicationState")(__v.asInstanceOf[js.Any]))
      etaDateTime.foreach(__v => __obj.updateDynamic("etaDateTime")(__v.asInstanceOf[js.Any]))
      lagDuration.foreach(__v => __obj.updateDynamic("lagDuration")(__v.asInstanceOf[js.Any]))
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

  /** Data replication intiation step.
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
  trait DescribeJobLogItemsRequest extends js.Object {
    var jobID: JobID
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeJobLogItemsRequest {
    @inline
    def apply(
        jobID: JobID,
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
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
    var filters: DescribeJobsRequestFilters
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeJobsRequest {
    @inline
    def apply(
        filters: DescribeJobsRequestFilters,
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeJobsRequest = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )

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
  trait DescribeReplicationConfigurationTemplatesRequest extends js.Object {
    var replicationConfigurationTemplateIDs: ReplicationConfigurationTemplateIDs
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeReplicationConfigurationTemplatesRequest {
    @inline
    def apply(
        replicationConfigurationTemplateIDs: ReplicationConfigurationTemplateIDs,
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeReplicationConfigurationTemplatesRequest = {
      val __obj = js.Dynamic.literal(
        "replicationConfigurationTemplateIDs" -> replicationConfigurationTemplateIDs.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
    var filters: DescribeSourceServersRequestFilters
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeSourceServersRequest {
    @inline
    def apply(
        filters: DescribeSourceServersRequestFilters,
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeSourceServersRequest = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSourceServersRequest]
    }
  }

  /** Request to filter Source Servers list.
    */
  @js.native
  trait DescribeSourceServersRequestFilters extends js.Object {
    var isArchived: js.UndefOr[Boolean]
    var sourceServerIDs: js.UndefOr[DescribeSourceServersRequestFiltersIDs]
  }

  object DescribeSourceServersRequestFilters {
    @inline
    def apply(
        isArchived: js.UndefOr[Boolean] = js.undefined,
        sourceServerIDs: js.UndefOr[DescribeSourceServersRequestFiltersIDs] = js.undefined
    ): DescribeSourceServersRequestFilters = {
      val __obj = js.Dynamic.literal()
      isArchived.foreach(__v => __obj.updateDynamic("isArchived")(__v.asInstanceOf[js.Any]))
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
    var vmWareUuid: js.UndefOr[BoundedString]
  }

  object IdentificationHints {
    @inline
    def apply(
        awsInstanceID: js.UndefOr[EC2InstanceID] = js.undefined,
        fqdn: js.UndefOr[BoundedString] = js.undefined,
        hostname: js.UndefOr[BoundedString] = js.undefined,
        vmWareUuid: js.UndefOr[BoundedString] = js.undefined
    ): IdentificationHints = {
      val __obj = js.Dynamic.literal()
      awsInstanceID.foreach(__v => __obj.updateDynamic("awsInstanceID")(__v.asInstanceOf[js.Any]))
      fqdn.foreach(__v => __obj.updateDynamic("fqdn")(__v.asInstanceOf[js.Any]))
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait LaunchConfiguration extends js.Object {
    var copyPrivateIp: js.UndefOr[Boolean]
    var copyTags: js.UndefOr[Boolean]
    var ec2LaunchTemplateID: js.UndefOr[BoundedString]
    var launchDisposition: js.UndefOr[LaunchDisposition]
    var licensing: js.UndefOr[Licensing]
    var name: js.UndefOr[SmallBoundedString]
    var sourceServerID: js.UndefOr[SourceServerID]
    var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod]
  }

  object LaunchConfiguration {
    @inline
    def apply(
        copyPrivateIp: js.UndefOr[Boolean] = js.undefined,
        copyTags: js.UndefOr[Boolean] = js.undefined,
        ec2LaunchTemplateID: js.UndefOr[BoundedString] = js.undefined,
        launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined,
        licensing: js.UndefOr[Licensing] = js.undefined,
        name: js.UndefOr[SmallBoundedString] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
    ): LaunchConfiguration = {
      val __obj = js.Dynamic.literal()
      copyPrivateIp.foreach(__v => __obj.updateDynamic("copyPrivateIp")(__v.asInstanceOf[js.Any]))
      copyTags.foreach(__v => __obj.updateDynamic("copyTags")(__v.asInstanceOf[js.Any]))
      ec2LaunchTemplateID.foreach(__v => __obj.updateDynamic("ec2LaunchTemplateID")(__v.asInstanceOf[js.Any]))
      launchDisposition.foreach(__v => __obj.updateDynamic("launchDisposition")(__v.asInstanceOf[js.Any]))
      licensing.foreach(__v => __obj.updateDynamic("licensing")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      targetInstanceTypeRightSizingMethod.foreach(__v => __obj.updateDynamic("targetInstanceTypeRightSizingMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfiguration]
    }
  }

  /** Configure launced instance.
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
    var elapsedReplicationDuration: js.UndefOr[ISO8601DatetimeString]
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
        elapsedReplicationDuration: js.UndefOr[ISO8601DatetimeString] = js.undefined,
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

  /** Lifecycle last Test finlized.
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
    var launchStatus: js.UndefOr[LaunchStatus]
    var sourceServerID: js.UndefOr[SourceServerID]
  }

  object ParticipatingServer {
    @inline
    def apply(
        launchStatus: js.UndefOr[LaunchStatus] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined
    ): ParticipatingServer = {
      val __obj = js.Dynamic.literal()
      launchStatus.foreach(__v => __obj.updateDynamic("launchStatus")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParticipatingServer]
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
  }

  object ReplicationConfigurationReplicatedDisk {
    @inline
    def apply(
        deviceName: js.UndefOr[BoundedString] = js.undefined,
        iops: js.UndefOr[PositiveInteger] = js.undefined,
        isBootDisk: js.UndefOr[Boolean] = js.undefined,
        stagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.undefined
    ): ReplicationConfigurationReplicatedDisk = {
      val __obj = js.Dynamic.literal()
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      iops.foreach(__v => __obj.updateDynamic("iops")(__v.asInstanceOf[js.Any]))
      isBootDisk.foreach(__v => __obj.updateDynamic("isBootDisk")(__v.asInstanceOf[js.Any]))
      stagingDiskType.foreach(__v => __obj.updateDynamic("stagingDiskType")(__v.asInstanceOf[js.Any]))
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
    var arn: js.UndefOr[ARN]
    var dataReplicationInfo: js.UndefOr[DataReplicationInfo]
    var isArchived: js.UndefOr[Boolean]
    var launchedInstance: js.UndefOr[LaunchedInstance]
    var lifeCycle: js.UndefOr[LifeCycle]
    var sourceProperties: js.UndefOr[SourceProperties]
    var sourceServerID: js.UndefOr[SourceServerID]
    var tags: js.UndefOr[TagsMap]
  }

  object SourceServer {
    @inline
    def apply(
        arn: js.UndefOr[ARN] = js.undefined,
        dataReplicationInfo: js.UndefOr[DataReplicationInfo] = js.undefined,
        isArchived: js.UndefOr[Boolean] = js.undefined,
        launchedInstance: js.UndefOr[LaunchedInstance] = js.undefined,
        lifeCycle: js.UndefOr[LifeCycle] = js.undefined,
        sourceProperties: js.UndefOr[SourceProperties] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): SourceServer = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dataReplicationInfo.foreach(__v => __obj.updateDynamic("dataReplicationInfo")(__v.asInstanceOf[js.Any]))
      isArchived.foreach(__v => __obj.updateDynamic("isArchived")(__v.asInstanceOf[js.Any]))
      launchedInstance.foreach(__v => __obj.updateDynamic("launchedInstance")(__v.asInstanceOf[js.Any]))
      lifeCycle.foreach(__v => __obj.updateDynamic("lifeCycle")(__v.asInstanceOf[js.Any]))
      sourceProperties.foreach(__v => __obj.updateDynamic("sourceProperties")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceServer]
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
  trait UpdateLaunchConfigurationRequest extends js.Object {
    var sourceServerID: SourceServerID
    var copyPrivateIp: js.UndefOr[Boolean]
    var copyTags: js.UndefOr[Boolean]
    var launchDisposition: js.UndefOr[LaunchDisposition]
    var licensing: js.UndefOr[Licensing]
    var name: js.UndefOr[SmallBoundedString]
    var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod]
  }

  object UpdateLaunchConfigurationRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID,
        copyPrivateIp: js.UndefOr[Boolean] = js.undefined,
        copyTags: js.UndefOr[Boolean] = js.undefined,
        launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined,
        licensing: js.UndefOr[Licensing] = js.undefined,
        name: js.UndefOr[SmallBoundedString] = js.undefined,
        targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
    ): UpdateLaunchConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      copyPrivateIp.foreach(__v => __obj.updateDynamic("copyPrivateIp")(__v.asInstanceOf[js.Any]))
      copyTags.foreach(__v => __obj.updateDynamic("copyTags")(__v.asInstanceOf[js.Any]))
      launchDisposition.foreach(__v => __obj.updateDynamic("launchDisposition")(__v.asInstanceOf[js.Any]))
      licensing.foreach(__v => __obj.updateDynamic("licensing")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      targetInstanceTypeRightSizingMethod.foreach(__v => __obj.updateDynamic("targetInstanceTypeRightSizingMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLaunchConfigurationRequest]
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
}
