package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object drs {
  type ARN = String
  type AccountID = String
  type AccountIDs = js.Array[AccountID]
  type Accounts = js.Array[Account]
  type AwsAvailabilityZone = String
  type AwsRegion = String
  type BoundedString = String
  type ConversionMap = js.Dictionary[ebsSnapshot]
  type Cpus = js.Array[CPU]
  type DataReplicationInfoReplicatedDisks = js.Array[DataReplicationInfoReplicatedDisk]
  type DataReplicationInitiationSteps = js.Array[DataReplicationInitiationStep]
  type DescribeJobsRequestFiltersJobIDs = js.Array[JobID]
  type DescribeRecoveryInstancesItems = js.Array[RecoveryInstance]
  type DescribeSourceServersRequestFiltersIDs = js.Array[SourceServerID]
  type Disks = js.Array[Disk]
  type EC2InstanceID = String
  type EC2InstanceType = String
  type EbsSnapshotsList = js.Array[ebsSnapshot]
  type EbsVolumeID = String
  type IPsList = js.Array[BoundedString]
  type ISO8601DatetimeString = String
  type ISO8601DurationString = String
  type JobID = String
  type JobLogs = js.Array[JobLog]
  type JobsList = js.Array[Job]
  type LargeBoundedString = String
  type ListStagingAccountsRequestMaxResultsInteger = Int
  type MaxResultsReplicatingSourceServers = Int
  type NetworkInterfaces = js.Array[NetworkInterface]
  type PITPolicy = js.Array[PITPolicyRule]
  type PaginationToken = String
  type ParticipatingServers = js.Array[ParticipatingServer]
  type PositiveInteger = Double
  type RecoveryInstanceDataReplicationInfoReplicatedDisks = js.Array[RecoveryInstanceDataReplicationInfoReplicatedDisk]
  type RecoveryInstanceDataReplicationInitiationSteps = js.Array[RecoveryInstanceDataReplicationInitiationStep]
  type RecoveryInstanceDisks = js.Array[RecoveryInstanceDisk]
  type RecoveryInstanceID = String
  type RecoveryInstanceIDs = js.Array[RecoveryInstanceID]
  type RecoveryInstancesForTerminationRequest = js.Array[RecoveryInstanceID]
  type RecoverySnapshotID = String
  type RecoverySnapshotsList = js.Array[RecoverySnapshot]
  type ReplicationConfigurationReplicatedDisks = js.Array[ReplicationConfigurationReplicatedDisk]
  type ReplicationConfigurationTemplateID = String
  type ReplicationConfigurationTemplateIDs = js.Array[ReplicationConfigurationTemplateID]
  type ReplicationConfigurationTemplates = js.Array[ReplicationConfigurationTemplate]
  type ReplicationServersSecurityGroupsIDs = js.Array[SecurityGroupID]
  type SecurityGroupID = String
  type SmallBoundedString = String
  type SourceServerARN = String
  type SourceServerID = String
  type SourceServerIDs = js.Array[SourceServerID]
  type SourceServersList = js.Array[SourceServer]
  type StagingSourceServersList = js.Array[StagingSourceServer]
  type StartFailbackRequestRecoveryInstanceIDs = js.Array[RecoveryInstanceID]
  type StartRecoveryRequestSourceServers = js.Array[StartRecoveryRequestSourceServer]
  type StrictlyPositiveInteger = Int
  type SubnetID = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type TagsMap = js.Dictionary[TagValue]
  type VolumeToConversionMap = js.Dictionary[ConversionMap]
  type VolumeToSizeMap = js.Dictionary[PositiveInteger]
  type ebsSnapshot = String

  final class DRSOps(private val service: DRS) extends AnyVal {

    @inline def createExtendedSourceServerFuture(params: CreateExtendedSourceServerRequest): Future[CreateExtendedSourceServerResponse] = service.createExtendedSourceServer(params).promise().toFuture
    @inline def createReplicationConfigurationTemplateFuture(params: CreateReplicationConfigurationTemplateRequest): Future[ReplicationConfigurationTemplate] = service.createReplicationConfigurationTemplate(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResponse] = service.deleteJob(params).promise().toFuture
    @inline def deleteRecoveryInstanceFuture(params: DeleteRecoveryInstanceRequest): Future[js.Object] = service.deleteRecoveryInstance(params).promise().toFuture
    @inline def deleteReplicationConfigurationTemplateFuture(params: DeleteReplicationConfigurationTemplateRequest): Future[DeleteReplicationConfigurationTemplateResponse] = service.deleteReplicationConfigurationTemplate(params).promise().toFuture
    @inline def deleteSourceServerFuture(params: DeleteSourceServerRequest): Future[DeleteSourceServerResponse] = service.deleteSourceServer(params).promise().toFuture
    @inline def describeJobLogItemsFuture(params: DescribeJobLogItemsRequest): Future[DescribeJobLogItemsResponse] = service.describeJobLogItems(params).promise().toFuture
    @inline def describeJobsFuture(params: DescribeJobsRequest): Future[DescribeJobsResponse] = service.describeJobs(params).promise().toFuture
    @inline def describeRecoveryInstancesFuture(params: DescribeRecoveryInstancesRequest): Future[DescribeRecoveryInstancesResponse] = service.describeRecoveryInstances(params).promise().toFuture
    @inline def describeRecoverySnapshotsFuture(params: DescribeRecoverySnapshotsRequest): Future[DescribeRecoverySnapshotsResponse] = service.describeRecoverySnapshots(params).promise().toFuture
    @inline def describeReplicationConfigurationTemplatesFuture(params: DescribeReplicationConfigurationTemplatesRequest): Future[DescribeReplicationConfigurationTemplatesResponse] = service.describeReplicationConfigurationTemplates(params).promise().toFuture
    @inline def describeSourceServersFuture(params: DescribeSourceServersRequest): Future[DescribeSourceServersResponse] = service.describeSourceServers(params).promise().toFuture
    @inline def disconnectRecoveryInstanceFuture(params: DisconnectRecoveryInstanceRequest): Future[js.Object] = service.disconnectRecoveryInstance(params).promise().toFuture
    @inline def disconnectSourceServerFuture(params: DisconnectSourceServerRequest): Future[SourceServer] = service.disconnectSourceServer(params).promise().toFuture
    @inline def getFailbackReplicationConfigurationFuture(params: GetFailbackReplicationConfigurationRequest): Future[GetFailbackReplicationConfigurationResponse] = service.getFailbackReplicationConfiguration(params).promise().toFuture
    @inline def getLaunchConfigurationFuture(params: GetLaunchConfigurationRequest): Future[LaunchConfiguration] = service.getLaunchConfiguration(params).promise().toFuture
    @inline def getReplicationConfigurationFuture(params: GetReplicationConfigurationRequest): Future[ReplicationConfiguration] = service.getReplicationConfiguration(params).promise().toFuture
    @inline def initializeServiceFuture(params: InitializeServiceRequest): Future[InitializeServiceResponse] = service.initializeService(params).promise().toFuture
    @inline def listExtensibleSourceServersFuture(params: ListExtensibleSourceServersRequest): Future[ListExtensibleSourceServersResponse] = service.listExtensibleSourceServers(params).promise().toFuture
    @inline def listStagingAccountsFuture(params: ListStagingAccountsRequest): Future[ListStagingAccountsResponse] = service.listStagingAccounts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def retryDataReplicationFuture(params: RetryDataReplicationRequest): Future[SourceServer] = service.retryDataReplication(params).promise().toFuture
    @inline def reverseReplicationFuture(params: ReverseReplicationRequest): Future[ReverseReplicationResponse] = service.reverseReplication(params).promise().toFuture
    @inline def startFailbackLaunchFuture(params: StartFailbackLaunchRequest): Future[StartFailbackLaunchResponse] = service.startFailbackLaunch(params).promise().toFuture
    @inline def startRecoveryFuture(params: StartRecoveryRequest): Future[StartRecoveryResponse] = service.startRecovery(params).promise().toFuture
    @inline def startReplicationFuture(params: StartReplicationRequest): Future[StartReplicationResponse] = service.startReplication(params).promise().toFuture
    @inline def stopFailbackFuture(params: StopFailbackRequest): Future[js.Object] = service.stopFailback(params).promise().toFuture
    @inline def stopReplicationFuture(params: StopReplicationRequest): Future[StopReplicationResponse] = service.stopReplication(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def terminateRecoveryInstancesFuture(params: TerminateRecoveryInstancesRequest): Future[TerminateRecoveryInstancesResponse] = service.terminateRecoveryInstances(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateFailbackReplicationConfigurationFuture(params: UpdateFailbackReplicationConfigurationRequest): Future[js.Object] = service.updateFailbackReplicationConfiguration(params).promise().toFuture
    @inline def updateLaunchConfigurationFuture(params: UpdateLaunchConfigurationRequest): Future[LaunchConfiguration] = service.updateLaunchConfiguration(params).promise().toFuture
    @inline def updateReplicationConfigurationFuture(params: UpdateReplicationConfigurationRequest): Future[ReplicationConfiguration] = service.updateReplicationConfiguration(params).promise().toFuture
    @inline def updateReplicationConfigurationTemplateFuture(params: UpdateReplicationConfigurationTemplateRequest): Future[ReplicationConfigurationTemplate] = service.updateReplicationConfigurationTemplate(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/drs", JSImport.Namespace, "AWS.Drs")
  class DRS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createExtendedSourceServer(params: CreateExtendedSourceServerRequest): Request[CreateExtendedSourceServerResponse] = js.native
    def createReplicationConfigurationTemplate(params: CreateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate] = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse] = js.native
    def deleteRecoveryInstance(params: DeleteRecoveryInstanceRequest): Request[js.Object] = js.native
    def deleteReplicationConfigurationTemplate(params: DeleteReplicationConfigurationTemplateRequest): Request[DeleteReplicationConfigurationTemplateResponse] = js.native
    def deleteSourceServer(params: DeleteSourceServerRequest): Request[DeleteSourceServerResponse] = js.native
    def describeJobLogItems(params: DescribeJobLogItemsRequest): Request[DescribeJobLogItemsResponse] = js.native
    def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse] = js.native
    def describeRecoveryInstances(params: DescribeRecoveryInstancesRequest): Request[DescribeRecoveryInstancesResponse] = js.native
    def describeRecoverySnapshots(params: DescribeRecoverySnapshotsRequest): Request[DescribeRecoverySnapshotsResponse] = js.native
    def describeReplicationConfigurationTemplates(params: DescribeReplicationConfigurationTemplatesRequest): Request[DescribeReplicationConfigurationTemplatesResponse] = js.native
    def describeSourceServers(params: DescribeSourceServersRequest): Request[DescribeSourceServersResponse] = js.native
    def disconnectRecoveryInstance(params: DisconnectRecoveryInstanceRequest): Request[js.Object] = js.native
    def disconnectSourceServer(params: DisconnectSourceServerRequest): Request[SourceServer] = js.native
    def getFailbackReplicationConfiguration(params: GetFailbackReplicationConfigurationRequest): Request[GetFailbackReplicationConfigurationResponse] = js.native
    def getLaunchConfiguration(params: GetLaunchConfigurationRequest): Request[LaunchConfiguration] = js.native
    def getReplicationConfiguration(params: GetReplicationConfigurationRequest): Request[ReplicationConfiguration] = js.native
    def initializeService(params: InitializeServiceRequest): Request[InitializeServiceResponse] = js.native
    def listExtensibleSourceServers(params: ListExtensibleSourceServersRequest): Request[ListExtensibleSourceServersResponse] = js.native
    def listStagingAccounts(params: ListStagingAccountsRequest): Request[ListStagingAccountsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def retryDataReplication(params: RetryDataReplicationRequest): Request[SourceServer] = js.native
    def reverseReplication(params: ReverseReplicationRequest): Request[ReverseReplicationResponse] = js.native
    def startFailbackLaunch(params: StartFailbackLaunchRequest): Request[StartFailbackLaunchResponse] = js.native
    def startRecovery(params: StartRecoveryRequest): Request[StartRecoveryResponse] = js.native
    def startReplication(params: StartReplicationRequest): Request[StartReplicationResponse] = js.native
    def stopFailback(params: StopFailbackRequest): Request[js.Object] = js.native
    def stopReplication(params: StopReplicationRequest): Request[StopReplicationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def terminateRecoveryInstances(params: TerminateRecoveryInstancesRequest): Request[TerminateRecoveryInstancesResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateFailbackReplicationConfiguration(params: UpdateFailbackReplicationConfigurationRequest): Request[js.Object] = js.native
    def updateLaunchConfiguration(params: UpdateLaunchConfigurationRequest): Request[LaunchConfiguration] = js.native
    def updateReplicationConfiguration(params: UpdateReplicationConfigurationRequest): Request[ReplicationConfiguration] = js.native
    def updateReplicationConfigurationTemplate(params: UpdateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate] = js.native
  }
  object DRS {
    @inline implicit def toOps(service: DRS): DRSOps = {
      new DRSOps(service)
    }
  }

  /** AWS account.
    */
  @js.native
  trait Account extends js.Object {
    var accountID: js.UndefOr[AccountID]
  }

  object Account {
    @inline
    def apply(
        accountID: js.UndefOr[AccountID] = js.undefined
    ): Account = {
      val __obj = js.Dynamic.literal()
      accountID.foreach(__v => __obj.updateDynamic("accountID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Account]
    }
  }

  /** Information about a server's CPU.
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

  /** Properties of a conversion job
    */
  @js.native
  trait ConversionProperties extends js.Object {
    var dataTimestamp: js.UndefOr[LargeBoundedString]
    var forceUefi: js.UndefOr[Boolean]
    var rootVolumeName: js.UndefOr[LargeBoundedString]
    var volumeToConversionMap: js.UndefOr[VolumeToConversionMap]
    var volumeToVolumeSize: js.UndefOr[VolumeToSizeMap]
  }

  object ConversionProperties {
    @inline
    def apply(
        dataTimestamp: js.UndefOr[LargeBoundedString] = js.undefined,
        forceUefi: js.UndefOr[Boolean] = js.undefined,
        rootVolumeName: js.UndefOr[LargeBoundedString] = js.undefined,
        volumeToConversionMap: js.UndefOr[VolumeToConversionMap] = js.undefined,
        volumeToVolumeSize: js.UndefOr[VolumeToSizeMap] = js.undefined
    ): ConversionProperties = {
      val __obj = js.Dynamic.literal()
      dataTimestamp.foreach(__v => __obj.updateDynamic("dataTimestamp")(__v.asInstanceOf[js.Any]))
      forceUefi.foreach(__v => __obj.updateDynamic("forceUefi")(__v.asInstanceOf[js.Any]))
      rootVolumeName.foreach(__v => __obj.updateDynamic("rootVolumeName")(__v.asInstanceOf[js.Any]))
      volumeToConversionMap.foreach(__v => __obj.updateDynamic("volumeToConversionMap")(__v.asInstanceOf[js.Any]))
      volumeToVolumeSize.foreach(__v => __obj.updateDynamic("volumeToVolumeSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConversionProperties]
    }
  }

  @js.native
  trait CreateExtendedSourceServerRequest extends js.Object {
    var sourceServerArn: SourceServerARN
    var tags: js.UndefOr[TagsMap]
  }

  object CreateExtendedSourceServerRequest {
    @inline
    def apply(
        sourceServerArn: SourceServerARN,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateExtendedSourceServerRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerArn" -> sourceServerArn.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExtendedSourceServerRequest]
    }
  }

  @js.native
  trait CreateExtendedSourceServerResponse extends js.Object {
    var sourceServer: js.UndefOr[SourceServer]
  }

  object CreateExtendedSourceServerResponse {
    @inline
    def apply(
        sourceServer: js.UndefOr[SourceServer] = js.undefined
    ): CreateExtendedSourceServerResponse = {
      val __obj = js.Dynamic.literal()
      sourceServer.foreach(__v => __obj.updateDynamic("sourceServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExtendedSourceServerResponse]
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
    var pitPolicy: PITPolicy
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
        pitPolicy: PITPolicy,
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
        "pitPolicy" -> pitPolicy.asInstanceOf[js.Any],
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

  /** Information about Data Replication
    */
  @js.native
  trait DataReplicationInfo extends js.Object {
    var dataReplicationError: js.UndefOr[DataReplicationError]
    var dataReplicationInitiation: js.UndefOr[DataReplicationInitiation]
    var dataReplicationState: js.UndefOr[DataReplicationState]
    var etaDateTime: js.UndefOr[ISO8601DatetimeString]
    var lagDuration: js.UndefOr[ISO8601DurationString]
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

  /** A disk that should be replicated.
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
  trait DeleteRecoveryInstanceRequest extends js.Object {
    var recoveryInstanceID: RecoveryInstanceID
  }

  object DeleteRecoveryInstanceRequest {
    @inline
    def apply(
        recoveryInstanceID: RecoveryInstanceID
    ): DeleteRecoveryInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceID" -> recoveryInstanceID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRecoveryInstanceRequest]
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
    var filters: js.UndefOr[DescribeJobsRequestFilters]
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeJobsRequest {
    @inline
    def apply(
        filters: js.UndefOr[DescribeJobsRequestFilters] = js.undefined,
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeJobsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobsRequest]
    }
  }

  /** A set of filters by which to return Jobs.
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
  trait DescribeRecoveryInstancesRequest extends js.Object {
    var filters: js.UndefOr[DescribeRecoveryInstancesRequestFilters]
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeRecoveryInstancesRequest {
    @inline
    def apply(
        filters: js.UndefOr[DescribeRecoveryInstancesRequestFilters] = js.undefined,
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeRecoveryInstancesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecoveryInstancesRequest]
    }
  }

  /** A set of filters by which to return Recovery Instances.
    */
  @js.native
  trait DescribeRecoveryInstancesRequestFilters extends js.Object {
    var recoveryInstanceIDs: js.UndefOr[RecoveryInstanceIDs]
    var sourceServerIDs: js.UndefOr[SourceServerIDs]
  }

  object DescribeRecoveryInstancesRequestFilters {
    @inline
    def apply(
        recoveryInstanceIDs: js.UndefOr[RecoveryInstanceIDs] = js.undefined,
        sourceServerIDs: js.UndefOr[SourceServerIDs] = js.undefined
    ): DescribeRecoveryInstancesRequestFilters = {
      val __obj = js.Dynamic.literal()
      recoveryInstanceIDs.foreach(__v => __obj.updateDynamic("recoveryInstanceIDs")(__v.asInstanceOf[js.Any]))
      sourceServerIDs.foreach(__v => __obj.updateDynamic("sourceServerIDs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecoveryInstancesRequestFilters]
    }
  }

  @js.native
  trait DescribeRecoveryInstancesResponse extends js.Object {
    var items: js.UndefOr[DescribeRecoveryInstancesItems]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeRecoveryInstancesResponse {
    @inline
    def apply(
        items: js.UndefOr[DescribeRecoveryInstancesItems] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeRecoveryInstancesResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecoveryInstancesResponse]
    }
  }

  @js.native
  trait DescribeRecoverySnapshotsRequest extends js.Object {
    var sourceServerID: SourceServerID
    var filters: js.UndefOr[DescribeRecoverySnapshotsRequestFilters]
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
    var order: js.UndefOr[RecoverySnapshotsOrder]
  }

  object DescribeRecoverySnapshotsRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID,
        filters: js.UndefOr[DescribeRecoverySnapshotsRequestFilters] = js.undefined,
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        order: js.UndefOr[RecoverySnapshotsOrder] = js.undefined
    ): DescribeRecoverySnapshotsRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      order.foreach(__v => __obj.updateDynamic("order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecoverySnapshotsRequest]
    }
  }

  /** A set of filters by which to return Recovery Snapshots.
    */
  @js.native
  trait DescribeRecoverySnapshotsRequestFilters extends js.Object {
    var fromDateTime: js.UndefOr[ISO8601DatetimeString]
    var toDateTime: js.UndefOr[ISO8601DatetimeString]
  }

  object DescribeRecoverySnapshotsRequestFilters {
    @inline
    def apply(
        fromDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        toDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): DescribeRecoverySnapshotsRequestFilters = {
      val __obj = js.Dynamic.literal()
      fromDateTime.foreach(__v => __obj.updateDynamic("fromDateTime")(__v.asInstanceOf[js.Any]))
      toDateTime.foreach(__v => __obj.updateDynamic("toDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecoverySnapshotsRequestFilters]
    }
  }

  @js.native
  trait DescribeRecoverySnapshotsResponse extends js.Object {
    var items: js.UndefOr[RecoverySnapshotsList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeRecoverySnapshotsResponse {
    @inline
    def apply(
        items: js.UndefOr[RecoverySnapshotsList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeRecoverySnapshotsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecoverySnapshotsResponse]
    }
  }

  @js.native
  trait DescribeReplicationConfigurationTemplatesRequest extends js.Object {
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
    var replicationConfigurationTemplateIDs: js.UndefOr[ReplicationConfigurationTemplateIDs]
  }

  object DescribeReplicationConfigurationTemplatesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
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
    var maxResults: js.UndefOr[StrictlyPositiveInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeSourceServersRequest {
    @inline
    def apply(
        filters: js.UndefOr[DescribeSourceServersRequestFilters] = js.undefined,
        maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeSourceServersRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSourceServersRequest]
    }
  }

  /** A set of filters by which to return Source Servers.
    */
  @js.native
  trait DescribeSourceServersRequestFilters extends js.Object {
    var hardwareId: js.UndefOr[BoundedString]
    var sourceServerIDs: js.UndefOr[DescribeSourceServersRequestFiltersIDs]
    var stagingAccountIDs: js.UndefOr[AccountIDs]
  }

  object DescribeSourceServersRequestFilters {
    @inline
    def apply(
        hardwareId: js.UndefOr[BoundedString] = js.undefined,
        sourceServerIDs: js.UndefOr[DescribeSourceServersRequestFiltersIDs] = js.undefined,
        stagingAccountIDs: js.UndefOr[AccountIDs] = js.undefined
    ): DescribeSourceServersRequestFilters = {
      val __obj = js.Dynamic.literal()
      hardwareId.foreach(__v => __obj.updateDynamic("hardwareId")(__v.asInstanceOf[js.Any]))
      sourceServerIDs.foreach(__v => __obj.updateDynamic("sourceServerIDs")(__v.asInstanceOf[js.Any]))
      stagingAccountIDs.foreach(__v => __obj.updateDynamic("stagingAccountIDs")(__v.asInstanceOf[js.Any]))
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
  trait DisconnectRecoveryInstanceRequest extends js.Object {
    var recoveryInstanceID: RecoveryInstanceID
  }

  object DisconnectRecoveryInstanceRequest {
    @inline
    def apply(
        recoveryInstanceID: RecoveryInstanceID
    ): DisconnectRecoveryInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceID" -> recoveryInstanceID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisconnectRecoveryInstanceRequest]
    }
  }

  @js.native
  trait DisconnectSourceServerRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object DisconnectSourceServerRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): DisconnectSourceServerRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisconnectSourceServerRequest]
    }
  }

  /** An object representing a data storage device on a server.
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
  trait GetFailbackReplicationConfigurationRequest extends js.Object {
    var recoveryInstanceID: RecoveryInstanceID
  }

  object GetFailbackReplicationConfigurationRequest {
    @inline
    def apply(
        recoveryInstanceID: RecoveryInstanceID
    ): GetFailbackReplicationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceID" -> recoveryInstanceID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFailbackReplicationConfigurationRequest]
    }
  }

  @js.native
  trait GetFailbackReplicationConfigurationResponse extends js.Object {
    var recoveryInstanceID: RecoveryInstanceID
    var bandwidthThrottling: js.UndefOr[PositiveInteger]
    var name: js.UndefOr[BoundedString]
    var usePrivateIP: js.UndefOr[Boolean]
  }

  object GetFailbackReplicationConfigurationResponse {
    @inline
    def apply(
        recoveryInstanceID: RecoveryInstanceID,
        bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined,
        name: js.UndefOr[BoundedString] = js.undefined,
        usePrivateIP: js.UndefOr[Boolean] = js.undefined
    ): GetFailbackReplicationConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceID" -> recoveryInstanceID.asInstanceOf[js.Any]
      )

      bandwidthThrottling.foreach(__v => __obj.updateDynamic("bandwidthThrottling")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      usePrivateIP.foreach(__v => __obj.updateDynamic("usePrivateIP")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFailbackReplicationConfigurationResponse]
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

  /** Hints used to uniquely identify a machine.
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

  /** A job is an asynchronous workflow.
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

  /** A log outputted by a Job.
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

  /** Metadata associated with a Job log.
    */
  @js.native
  trait JobLogEventData extends js.Object {
    var conversionProperties: js.UndefOr[ConversionProperties]
    var conversionServerID: js.UndefOr[EC2InstanceID]
    var rawError: js.UndefOr[LargeBoundedString]
    var sourceServerID: js.UndefOr[SourceServerID]
    var targetInstanceID: js.UndefOr[EC2InstanceID]
  }

  object JobLogEventData {
    @inline
    def apply(
        conversionProperties: js.UndefOr[ConversionProperties] = js.undefined,
        conversionServerID: js.UndefOr[EC2InstanceID] = js.undefined,
        rawError: js.UndefOr[LargeBoundedString] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        targetInstanceID: js.UndefOr[EC2InstanceID] = js.undefined
    ): JobLogEventData = {
      val __obj = js.Dynamic.literal()
      conversionProperties.foreach(__v => __obj.updateDynamic("conversionProperties")(__v.asInstanceOf[js.Any]))
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

  /** Configuration of a machine's license.
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

  /** An object representing the Source Server Lifecycle.
    */
  @js.native
  trait LifeCycle extends js.Object {
    var addedToServiceDateTime: js.UndefOr[ISO8601DatetimeString]
    var elapsedReplicationDuration: js.UndefOr[ISO8601DurationString]
    var firstByteDateTime: js.UndefOr[ISO8601DatetimeString]
    var lastLaunch: js.UndefOr[LifeCycleLastLaunch]
    var lastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString]
  }

  object LifeCycle {
    @inline
    def apply(
        addedToServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        elapsedReplicationDuration: js.UndefOr[ISO8601DurationString] = js.undefined,
        firstByteDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        lastLaunch: js.UndefOr[LifeCycleLastLaunch] = js.undefined,
        lastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): LifeCycle = {
      val __obj = js.Dynamic.literal()
      addedToServiceDateTime.foreach(__v => __obj.updateDynamic("addedToServiceDateTime")(__v.asInstanceOf[js.Any]))
      elapsedReplicationDuration.foreach(__v => __obj.updateDynamic("elapsedReplicationDuration")(__v.asInstanceOf[js.Any]))
      firstByteDateTime.foreach(__v => __obj.updateDynamic("firstByteDateTime")(__v.asInstanceOf[js.Any]))
      lastLaunch.foreach(__v => __obj.updateDynamic("lastLaunch")(__v.asInstanceOf[js.Any]))
      lastSeenByServiceDateTime.foreach(__v => __obj.updateDynamic("lastSeenByServiceDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycle]
    }
  }

  /** An object containing information regarding the last launch of a Source Server.
    */
  @js.native
  trait LifeCycleLastLaunch extends js.Object {
    var initiated: js.UndefOr[LifeCycleLastLaunchInitiated]
  }

  object LifeCycleLastLaunch {
    @inline
    def apply(
        initiated: js.UndefOr[LifeCycleLastLaunchInitiated] = js.undefined
    ): LifeCycleLastLaunch = {
      val __obj = js.Dynamic.literal()
      initiated.foreach(__v => __obj.updateDynamic("initiated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastLaunch]
    }
  }

  /** An object containing information regarding the initiation of the last launch of a Source Server.
    */
  @js.native
  trait LifeCycleLastLaunchInitiated extends js.Object {
    var apiCallDateTime: js.UndefOr[ISO8601DatetimeString]
    var jobID: js.UndefOr[JobID]
    var `type`: js.UndefOr[LastLaunchType]
  }

  object LifeCycleLastLaunchInitiated {
    @inline
    def apply(
        apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        jobID: js.UndefOr[JobID] = js.undefined,
        `type`: js.UndefOr[LastLaunchType] = js.undefined
    ): LifeCycleLastLaunchInitiated = {
      val __obj = js.Dynamic.literal()
      apiCallDateTime.foreach(__v => __obj.updateDynamic("apiCallDateTime")(__v.asInstanceOf[js.Any]))
      jobID.foreach(__v => __obj.updateDynamic("jobID")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifeCycleLastLaunchInitiated]
    }
  }

  @js.native
  trait ListExtensibleSourceServersRequest extends js.Object {
    var stagingAccountID: AccountID
    var maxResults: js.UndefOr[MaxResultsReplicatingSourceServers]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListExtensibleSourceServersRequest {
    @inline
    def apply(
        stagingAccountID: AccountID,
        maxResults: js.UndefOr[MaxResultsReplicatingSourceServers] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListExtensibleSourceServersRequest = {
      val __obj = js.Dynamic.literal(
        "stagingAccountID" -> stagingAccountID.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExtensibleSourceServersRequest]
    }
  }

  @js.native
  trait ListExtensibleSourceServersResponse extends js.Object {
    var items: js.UndefOr[StagingSourceServersList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListExtensibleSourceServersResponse {
    @inline
    def apply(
        items: js.UndefOr[StagingSourceServersList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListExtensibleSourceServersResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExtensibleSourceServersResponse]
    }
  }

  @js.native
  trait ListStagingAccountsRequest extends js.Object {
    var maxResults: js.UndefOr[ListStagingAccountsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStagingAccountsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListStagingAccountsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStagingAccountsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStagingAccountsRequest]
    }
  }

  @js.native
  trait ListStagingAccountsResponse extends js.Object {
    var accounts: js.UndefOr[Accounts]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStagingAccountsResponse {
    @inline
    def apply(
        accounts: js.UndefOr[Accounts] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStagingAccountsResponse = {
      val __obj = js.Dynamic.literal()
      accounts.foreach(__v => __obj.updateDynamic("accounts")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStagingAccountsResponse]
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

  /** A rule in the Point in Time (PIT) policy representing when to take snapshots and how long to retain them for.
    */
  @js.native
  trait PITPolicyRule extends js.Object {
    var interval: StrictlyPositiveInteger
    var retentionDuration: StrictlyPositiveInteger
    var units: PITPolicyRuleUnits
    var enabled: js.UndefOr[Boolean]
    var ruleID: js.UndefOr[PositiveInteger]
  }

  object PITPolicyRule {
    @inline
    def apply(
        interval: StrictlyPositiveInteger,
        retentionDuration: StrictlyPositiveInteger,
        units: PITPolicyRuleUnits,
        enabled: js.UndefOr[Boolean] = js.undefined,
        ruleID: js.UndefOr[PositiveInteger] = js.undefined
    ): PITPolicyRule = {
      val __obj = js.Dynamic.literal(
        "interval" -> interval.asInstanceOf[js.Any],
        "retentionDuration" -> retentionDuration.asInstanceOf[js.Any],
        "units" -> units.asInstanceOf[js.Any]
      )

      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      ruleID.foreach(__v => __obj.updateDynamic("ruleID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PITPolicyRule]
    }
  }

  /** Represents a server participating in an asynchronous Job.
    */
  @js.native
  trait ParticipatingServer extends js.Object {
    var launchStatus: js.UndefOr[LaunchStatus]
    var recoveryInstanceID: js.UndefOr[RecoveryInstanceID]
    var sourceServerID: js.UndefOr[SourceServerID]
  }

  object ParticipatingServer {
    @inline
    def apply(
        launchStatus: js.UndefOr[LaunchStatus] = js.undefined,
        recoveryInstanceID: js.UndefOr[RecoveryInstanceID] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined
    ): ParticipatingServer = {
      val __obj = js.Dynamic.literal()
      launchStatus.foreach(__v => __obj.updateDynamic("launchStatus")(__v.asInstanceOf[js.Any]))
      recoveryInstanceID.foreach(__v => __obj.updateDynamic("recoveryInstanceID")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParticipatingServer]
    }
  }

  /** A Recovery Instance is a replica of a Source Server running on EC2.
    */
  @js.native
  trait RecoveryInstance extends js.Object {
    var arn: js.UndefOr[ARN]
    var dataReplicationInfo: js.UndefOr[RecoveryInstanceDataReplicationInfo]
    var ec2InstanceID: js.UndefOr[EC2InstanceID]
    var ec2InstanceState: js.UndefOr[EC2InstanceState]
    var failback: js.UndefOr[RecoveryInstanceFailback]
    var isDrill: js.UndefOr[Boolean]
    var jobID: js.UndefOr[JobID]
    var originEnvironment: js.UndefOr[OriginEnvironment]
    var pointInTimeSnapshotDateTime: js.UndefOr[ISO8601DatetimeString]
    var recoveryInstanceID: js.UndefOr[RecoveryInstanceID]
    var recoveryInstanceProperties: js.UndefOr[RecoveryInstanceProperties]
    var sourceServerID: js.UndefOr[SourceServerID]
    var tags: js.UndefOr[TagsMap]
  }

  object RecoveryInstance {
    @inline
    def apply(
        arn: js.UndefOr[ARN] = js.undefined,
        dataReplicationInfo: js.UndefOr[RecoveryInstanceDataReplicationInfo] = js.undefined,
        ec2InstanceID: js.UndefOr[EC2InstanceID] = js.undefined,
        ec2InstanceState: js.UndefOr[EC2InstanceState] = js.undefined,
        failback: js.UndefOr[RecoveryInstanceFailback] = js.undefined,
        isDrill: js.UndefOr[Boolean] = js.undefined,
        jobID: js.UndefOr[JobID] = js.undefined,
        originEnvironment: js.UndefOr[OriginEnvironment] = js.undefined,
        pointInTimeSnapshotDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        recoveryInstanceID: js.UndefOr[RecoveryInstanceID] = js.undefined,
        recoveryInstanceProperties: js.UndefOr[RecoveryInstanceProperties] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): RecoveryInstance = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dataReplicationInfo.foreach(__v => __obj.updateDynamic("dataReplicationInfo")(__v.asInstanceOf[js.Any]))
      ec2InstanceID.foreach(__v => __obj.updateDynamic("ec2InstanceID")(__v.asInstanceOf[js.Any]))
      ec2InstanceState.foreach(__v => __obj.updateDynamic("ec2InstanceState")(__v.asInstanceOf[js.Any]))
      failback.foreach(__v => __obj.updateDynamic("failback")(__v.asInstanceOf[js.Any]))
      isDrill.foreach(__v => __obj.updateDynamic("isDrill")(__v.asInstanceOf[js.Any]))
      jobID.foreach(__v => __obj.updateDynamic("jobID")(__v.asInstanceOf[js.Any]))
      originEnvironment.foreach(__v => __obj.updateDynamic("originEnvironment")(__v.asInstanceOf[js.Any]))
      pointInTimeSnapshotDateTime.foreach(__v => __obj.updateDynamic("pointInTimeSnapshotDateTime")(__v.asInstanceOf[js.Any]))
      recoveryInstanceID.foreach(__v => __obj.updateDynamic("recoveryInstanceID")(__v.asInstanceOf[js.Any]))
      recoveryInstanceProperties.foreach(__v => __obj.updateDynamic("recoveryInstanceProperties")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstance]
    }
  }

  /** Error in data replication.
    */
  @js.native
  trait RecoveryInstanceDataReplicationError extends js.Object {
    var error: js.UndefOr[FailbackReplicationError]
    var rawError: js.UndefOr[LargeBoundedString]
  }

  object RecoveryInstanceDataReplicationError {
    @inline
    def apply(
        error: js.UndefOr[FailbackReplicationError] = js.undefined,
        rawError: js.UndefOr[LargeBoundedString] = js.undefined
    ): RecoveryInstanceDataReplicationError = {
      val __obj = js.Dynamic.literal()
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      rawError.foreach(__v => __obj.updateDynamic("rawError")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstanceDataReplicationError]
    }
  }

  /** Information about Data Replication
    */
  @js.native
  trait RecoveryInstanceDataReplicationInfo extends js.Object {
    var dataReplicationError: js.UndefOr[RecoveryInstanceDataReplicationError]
    var dataReplicationInitiation: js.UndefOr[RecoveryInstanceDataReplicationInitiation]
    var dataReplicationState: js.UndefOr[RecoveryInstanceDataReplicationState]
    var etaDateTime: js.UndefOr[ISO8601DatetimeString]
    var lagDuration: js.UndefOr[ISO8601DatetimeString]
    var replicatedDisks: js.UndefOr[RecoveryInstanceDataReplicationInfoReplicatedDisks]
  }

  object RecoveryInstanceDataReplicationInfo {
    @inline
    def apply(
        dataReplicationError: js.UndefOr[RecoveryInstanceDataReplicationError] = js.undefined,
        dataReplicationInitiation: js.UndefOr[RecoveryInstanceDataReplicationInitiation] = js.undefined,
        dataReplicationState: js.UndefOr[RecoveryInstanceDataReplicationState] = js.undefined,
        etaDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        lagDuration: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        replicatedDisks: js.UndefOr[RecoveryInstanceDataReplicationInfoReplicatedDisks] = js.undefined
    ): RecoveryInstanceDataReplicationInfo = {
      val __obj = js.Dynamic.literal()
      dataReplicationError.foreach(__v => __obj.updateDynamic("dataReplicationError")(__v.asInstanceOf[js.Any]))
      dataReplicationInitiation.foreach(__v => __obj.updateDynamic("dataReplicationInitiation")(__v.asInstanceOf[js.Any]))
      dataReplicationState.foreach(__v => __obj.updateDynamic("dataReplicationState")(__v.asInstanceOf[js.Any]))
      etaDateTime.foreach(__v => __obj.updateDynamic("etaDateTime")(__v.asInstanceOf[js.Any]))
      lagDuration.foreach(__v => __obj.updateDynamic("lagDuration")(__v.asInstanceOf[js.Any]))
      replicatedDisks.foreach(__v => __obj.updateDynamic("replicatedDisks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstanceDataReplicationInfo]
    }
  }

  /** A disk that should be replicated.
    */
  @js.native
  trait RecoveryInstanceDataReplicationInfoReplicatedDisk extends js.Object {
    var backloggedStorageBytes: js.UndefOr[PositiveInteger]
    var deviceName: js.UndefOr[BoundedString]
    var replicatedStorageBytes: js.UndefOr[PositiveInteger]
    var rescannedStorageBytes: js.UndefOr[PositiveInteger]
    var totalStorageBytes: js.UndefOr[PositiveInteger]
  }

  object RecoveryInstanceDataReplicationInfoReplicatedDisk {
    @inline
    def apply(
        backloggedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined,
        deviceName: js.UndefOr[BoundedString] = js.undefined,
        replicatedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined,
        rescannedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined,
        totalStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
    ): RecoveryInstanceDataReplicationInfoReplicatedDisk = {
      val __obj = js.Dynamic.literal()
      backloggedStorageBytes.foreach(__v => __obj.updateDynamic("backloggedStorageBytes")(__v.asInstanceOf[js.Any]))
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      replicatedStorageBytes.foreach(__v => __obj.updateDynamic("replicatedStorageBytes")(__v.asInstanceOf[js.Any]))
      rescannedStorageBytes.foreach(__v => __obj.updateDynamic("rescannedStorageBytes")(__v.asInstanceOf[js.Any]))
      totalStorageBytes.foreach(__v => __obj.updateDynamic("totalStorageBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstanceDataReplicationInfoReplicatedDisk]
    }
  }

  /** Data replication initiation.
    */
  @js.native
  trait RecoveryInstanceDataReplicationInitiation extends js.Object {
    var startDateTime: js.UndefOr[ISO8601DatetimeString]
    var steps: js.UndefOr[RecoveryInstanceDataReplicationInitiationSteps]
  }

  object RecoveryInstanceDataReplicationInitiation {
    @inline
    def apply(
        startDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        steps: js.UndefOr[RecoveryInstanceDataReplicationInitiationSteps] = js.undefined
    ): RecoveryInstanceDataReplicationInitiation = {
      val __obj = js.Dynamic.literal()
      startDateTime.foreach(__v => __obj.updateDynamic("startDateTime")(__v.asInstanceOf[js.Any]))
      steps.foreach(__v => __obj.updateDynamic("steps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstanceDataReplicationInitiation]
    }
  }

  /** Data replication initiation step.
    */
  @js.native
  trait RecoveryInstanceDataReplicationInitiationStep extends js.Object {
    var name: js.UndefOr[RecoveryInstanceDataReplicationInitiationStepName]
    var status: js.UndefOr[RecoveryInstanceDataReplicationInitiationStepStatus]
  }

  object RecoveryInstanceDataReplicationInitiationStep {
    @inline
    def apply(
        name: js.UndefOr[RecoveryInstanceDataReplicationInitiationStepName] = js.undefined,
        status: js.UndefOr[RecoveryInstanceDataReplicationInitiationStepStatus] = js.undefined
    ): RecoveryInstanceDataReplicationInitiationStep = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstanceDataReplicationInitiationStep]
    }
  }

  /** An object representing a block storage device on the Recovery Instance.
    */
  @js.native
  trait RecoveryInstanceDisk extends js.Object {
    var bytes: js.UndefOr[PositiveInteger]
    var ebsVolumeID: js.UndefOr[EbsVolumeID]
    var internalDeviceName: js.UndefOr[BoundedString]
  }

  object RecoveryInstanceDisk {
    @inline
    def apply(
        bytes: js.UndefOr[PositiveInteger] = js.undefined,
        ebsVolumeID: js.UndefOr[EbsVolumeID] = js.undefined,
        internalDeviceName: js.UndefOr[BoundedString] = js.undefined
    ): RecoveryInstanceDisk = {
      val __obj = js.Dynamic.literal()
      bytes.foreach(__v => __obj.updateDynamic("bytes")(__v.asInstanceOf[js.Any]))
      ebsVolumeID.foreach(__v => __obj.updateDynamic("ebsVolumeID")(__v.asInstanceOf[js.Any]))
      internalDeviceName.foreach(__v => __obj.updateDynamic("internalDeviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstanceDisk]
    }
  }

  /** An object representing failback related information of the Recovery Instance.
    */
  @js.native
  trait RecoveryInstanceFailback extends js.Object {
    var agentLastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString]
    var elapsedReplicationDuration: js.UndefOr[ISO8601DatetimeString]
    var failbackClientID: js.UndefOr[BoundedString]
    var failbackClientLastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString]
    var failbackInitiationTime: js.UndefOr[ISO8601DatetimeString]
    var failbackJobID: js.UndefOr[JobID]
    var failbackLaunchType: js.UndefOr[FailbackLaunchType]
    var failbackToOriginalServer: js.UndefOr[Boolean]
    var firstByteDateTime: js.UndefOr[ISO8601DatetimeString]
    var state: js.UndefOr[FailbackState]
  }

  object RecoveryInstanceFailback {
    @inline
    def apply(
        agentLastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        elapsedReplicationDuration: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        failbackClientID: js.UndefOr[BoundedString] = js.undefined,
        failbackClientLastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        failbackInitiationTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        failbackJobID: js.UndefOr[JobID] = js.undefined,
        failbackLaunchType: js.UndefOr[FailbackLaunchType] = js.undefined,
        failbackToOriginalServer: js.UndefOr[Boolean] = js.undefined,
        firstByteDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        state: js.UndefOr[FailbackState] = js.undefined
    ): RecoveryInstanceFailback = {
      val __obj = js.Dynamic.literal()
      agentLastSeenByServiceDateTime.foreach(__v => __obj.updateDynamic("agentLastSeenByServiceDateTime")(__v.asInstanceOf[js.Any]))
      elapsedReplicationDuration.foreach(__v => __obj.updateDynamic("elapsedReplicationDuration")(__v.asInstanceOf[js.Any]))
      failbackClientID.foreach(__v => __obj.updateDynamic("failbackClientID")(__v.asInstanceOf[js.Any]))
      failbackClientLastSeenByServiceDateTime.foreach(__v => __obj.updateDynamic("failbackClientLastSeenByServiceDateTime")(__v.asInstanceOf[js.Any]))
      failbackInitiationTime.foreach(__v => __obj.updateDynamic("failbackInitiationTime")(__v.asInstanceOf[js.Any]))
      failbackJobID.foreach(__v => __obj.updateDynamic("failbackJobID")(__v.asInstanceOf[js.Any]))
      failbackLaunchType.foreach(__v => __obj.updateDynamic("failbackLaunchType")(__v.asInstanceOf[js.Any]))
      failbackToOriginalServer.foreach(__v => __obj.updateDynamic("failbackToOriginalServer")(__v.asInstanceOf[js.Any]))
      firstByteDateTime.foreach(__v => __obj.updateDynamic("firstByteDateTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstanceFailback]
    }
  }

  /** Properties of the Recovery Instance machine.
    */
  @js.native
  trait RecoveryInstanceProperties extends js.Object {
    var cpus: js.UndefOr[Cpus]
    var disks: js.UndefOr[RecoveryInstanceDisks]
    var identificationHints: js.UndefOr[IdentificationHints]
    var lastUpdatedDateTime: js.UndefOr[ISO8601DatetimeString]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var os: js.UndefOr[OS]
    var ramBytes: js.UndefOr[PositiveInteger]
  }

  object RecoveryInstanceProperties {
    @inline
    def apply(
        cpus: js.UndefOr[Cpus] = js.undefined,
        disks: js.UndefOr[RecoveryInstanceDisks] = js.undefined,
        identificationHints: js.UndefOr[IdentificationHints] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined,
        networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        os: js.UndefOr[OS] = js.undefined,
        ramBytes: js.UndefOr[PositiveInteger] = js.undefined
    ): RecoveryInstanceProperties = {
      val __obj = js.Dynamic.literal()
      cpus.foreach(__v => __obj.updateDynamic("cpus")(__v.asInstanceOf[js.Any]))
      disks.foreach(__v => __obj.updateDynamic("disks")(__v.asInstanceOf[js.Any]))
      identificationHints.foreach(__v => __obj.updateDynamic("identificationHints")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      os.foreach(__v => __obj.updateDynamic("os")(__v.asInstanceOf[js.Any]))
      ramBytes.foreach(__v => __obj.updateDynamic("ramBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryInstanceProperties]
    }
  }

  /** A snapshot of a Source Server used during recovery.
    */
  @js.native
  trait RecoverySnapshot extends js.Object {
    var expectedTimestamp: ISO8601DatetimeString
    var snapshotID: RecoverySnapshotID
    var sourceServerID: SourceServerID
    var ebsSnapshots: js.UndefOr[EbsSnapshotsList]
    var timestamp: js.UndefOr[ISO8601DatetimeString]
  }

  object RecoverySnapshot {
    @inline
    def apply(
        expectedTimestamp: ISO8601DatetimeString,
        snapshotID: RecoverySnapshotID,
        sourceServerID: SourceServerID,
        ebsSnapshots: js.UndefOr[EbsSnapshotsList] = js.undefined,
        timestamp: js.UndefOr[ISO8601DatetimeString] = js.undefined
    ): RecoverySnapshot = {
      val __obj = js.Dynamic.literal(
        "expectedTimestamp" -> expectedTimestamp.asInstanceOf[js.Any],
        "snapshotID" -> snapshotID.asInstanceOf[js.Any],
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      ebsSnapshots.foreach(__v => __obj.updateDynamic("ebsSnapshots")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoverySnapshot]
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
    var pitPolicy: js.UndefOr[PITPolicy]
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
        pitPolicy: js.UndefOr[PITPolicy] = js.undefined,
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
      pitPolicy.foreach(__v => __obj.updateDynamic("pitPolicy")(__v.asInstanceOf[js.Any]))
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

  /** The configuration of a disk of the Source Server to be replicated.
    */
  @js.native
  trait ReplicationConfigurationReplicatedDisk extends js.Object {
    var deviceName: js.UndefOr[BoundedString]
    var iops: js.UndefOr[PositiveInteger]
    var isBootDisk: js.UndefOr[Boolean]
    var optimizedStagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType]
    var stagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType]
    var throughput: js.UndefOr[PositiveInteger]
  }

  object ReplicationConfigurationReplicatedDisk {
    @inline
    def apply(
        deviceName: js.UndefOr[BoundedString] = js.undefined,
        iops: js.UndefOr[PositiveInteger] = js.undefined,
        isBootDisk: js.UndefOr[Boolean] = js.undefined,
        optimizedStagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.undefined,
        stagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.undefined,
        throughput: js.UndefOr[PositiveInteger] = js.undefined
    ): ReplicationConfigurationReplicatedDisk = {
      val __obj = js.Dynamic.literal()
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      iops.foreach(__v => __obj.updateDynamic("iops")(__v.asInstanceOf[js.Any]))
      isBootDisk.foreach(__v => __obj.updateDynamic("isBootDisk")(__v.asInstanceOf[js.Any]))
      optimizedStagingDiskType.foreach(__v => __obj.updateDynamic("optimizedStagingDiskType")(__v.asInstanceOf[js.Any]))
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
    var pitPolicy: js.UndefOr[PITPolicy]
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
        pitPolicy: js.UndefOr[PITPolicy] = js.undefined,
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
      pitPolicy.foreach(__v => __obj.updateDynamic("pitPolicy")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait ReverseReplicationRequest extends js.Object {
    var recoveryInstanceID: RecoveryInstanceID
  }

  object ReverseReplicationRequest {
    @inline
    def apply(
        recoveryInstanceID: RecoveryInstanceID
    ): ReverseReplicationRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceID" -> recoveryInstanceID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReverseReplicationRequest]
    }
  }

  @js.native
  trait ReverseReplicationResponse extends js.Object {
    var reversedDirectionSourceServerArn: js.UndefOr[SourceServerARN]
  }

  object ReverseReplicationResponse {
    @inline
    def apply(
        reversedDirectionSourceServerArn: js.UndefOr[SourceServerARN] = js.undefined
    ): ReverseReplicationResponse = {
      val __obj = js.Dynamic.literal()
      reversedDirectionSourceServerArn.foreach(__v => __obj.updateDynamic("reversedDirectionSourceServerArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReverseReplicationResponse]
    }
  }

  /** Properties of the cloud environment where this Source Server originated from.
    */
  @js.native
  trait SourceCloudProperties extends js.Object {
    var originAccountID: js.UndefOr[AccountID]
    var originAvailabilityZone: js.UndefOr[AwsAvailabilityZone]
    var originRegion: js.UndefOr[AwsRegion]
  }

  object SourceCloudProperties {
    @inline
    def apply(
        originAccountID: js.UndefOr[AccountID] = js.undefined,
        originAvailabilityZone: js.UndefOr[AwsAvailabilityZone] = js.undefined,
        originRegion: js.UndefOr[AwsRegion] = js.undefined
    ): SourceCloudProperties = {
      val __obj = js.Dynamic.literal()
      originAccountID.foreach(__v => __obj.updateDynamic("originAccountID")(__v.asInstanceOf[js.Any]))
      originAvailabilityZone.foreach(__v => __obj.updateDynamic("originAvailabilityZone")(__v.asInstanceOf[js.Any]))
      originRegion.foreach(__v => __obj.updateDynamic("originRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceCloudProperties]
    }
  }

  /** Properties of the Source Server machine.
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
    var lastLaunchResult: js.UndefOr[LastLaunchResult]
    var lifeCycle: js.UndefOr[LifeCycle]
    var recoveryInstanceId: js.UndefOr[RecoveryInstanceID]
    var replicationDirection: js.UndefOr[ReplicationDirection]
    var reversedDirectionSourceServerArn: js.UndefOr[SourceServerARN]
    var sourceCloudProperties: js.UndefOr[SourceCloudProperties]
    var sourceProperties: js.UndefOr[SourceProperties]
    var sourceServerID: js.UndefOr[SourceServerID]
    var stagingArea: js.UndefOr[StagingArea]
    var tags: js.UndefOr[TagsMap]
  }

  object SourceServer {
    @inline
    def apply(
        arn: js.UndefOr[ARN] = js.undefined,
        dataReplicationInfo: js.UndefOr[DataReplicationInfo] = js.undefined,
        lastLaunchResult: js.UndefOr[LastLaunchResult] = js.undefined,
        lifeCycle: js.UndefOr[LifeCycle] = js.undefined,
        recoveryInstanceId: js.UndefOr[RecoveryInstanceID] = js.undefined,
        replicationDirection: js.UndefOr[ReplicationDirection] = js.undefined,
        reversedDirectionSourceServerArn: js.UndefOr[SourceServerARN] = js.undefined,
        sourceCloudProperties: js.UndefOr[SourceCloudProperties] = js.undefined,
        sourceProperties: js.UndefOr[SourceProperties] = js.undefined,
        sourceServerID: js.UndefOr[SourceServerID] = js.undefined,
        stagingArea: js.UndefOr[StagingArea] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): SourceServer = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dataReplicationInfo.foreach(__v => __obj.updateDynamic("dataReplicationInfo")(__v.asInstanceOf[js.Any]))
      lastLaunchResult.foreach(__v => __obj.updateDynamic("lastLaunchResult")(__v.asInstanceOf[js.Any]))
      lifeCycle.foreach(__v => __obj.updateDynamic("lifeCycle")(__v.asInstanceOf[js.Any]))
      recoveryInstanceId.foreach(__v => __obj.updateDynamic("recoveryInstanceId")(__v.asInstanceOf[js.Any]))
      replicationDirection.foreach(__v => __obj.updateDynamic("replicationDirection")(__v.asInstanceOf[js.Any]))
      reversedDirectionSourceServerArn.foreach(__v => __obj.updateDynamic("reversedDirectionSourceServerArn")(__v.asInstanceOf[js.Any]))
      sourceCloudProperties.foreach(__v => __obj.updateDynamic("sourceCloudProperties")(__v.asInstanceOf[js.Any]))
      sourceProperties.foreach(__v => __obj.updateDynamic("sourceProperties")(__v.asInstanceOf[js.Any]))
      sourceServerID.foreach(__v => __obj.updateDynamic("sourceServerID")(__v.asInstanceOf[js.Any]))
      stagingArea.foreach(__v => __obj.updateDynamic("stagingArea")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceServer]
    }
  }

  /** Staging information related to source server.
    */
  @js.native
  trait StagingArea extends js.Object {
    var errorMessage: js.UndefOr[LargeBoundedString]
    var stagingAccountID: js.UndefOr[AccountID]
    var stagingSourceServerArn: js.UndefOr[ARN]
    var status: js.UndefOr[ExtensionStatus]
  }

  object StagingArea {
    @inline
    def apply(
        errorMessage: js.UndefOr[LargeBoundedString] = js.undefined,
        stagingAccountID: js.UndefOr[AccountID] = js.undefined,
        stagingSourceServerArn: js.UndefOr[ARN] = js.undefined,
        status: js.UndefOr[ExtensionStatus] = js.undefined
    ): StagingArea = {
      val __obj = js.Dynamic.literal()
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      stagingAccountID.foreach(__v => __obj.updateDynamic("stagingAccountID")(__v.asInstanceOf[js.Any]))
      stagingSourceServerArn.foreach(__v => __obj.updateDynamic("stagingSourceServerArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StagingArea]
    }
  }

  /** Source server in staging account that extended source server connected to.
    */
  @js.native
  trait StagingSourceServer extends js.Object {
    var arn: js.UndefOr[SourceServerARN]
    var hostname: js.UndefOr[BoundedString]
    var tags: js.UndefOr[TagsMap]
  }

  object StagingSourceServer {
    @inline
    def apply(
        arn: js.UndefOr[SourceServerARN] = js.undefined,
        hostname: js.UndefOr[BoundedString] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): StagingSourceServer = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StagingSourceServer]
    }
  }

  @js.native
  trait StartFailbackLaunchRequest extends js.Object {
    var recoveryInstanceIDs: StartFailbackRequestRecoveryInstanceIDs
    var tags: js.UndefOr[TagsMap]
  }

  object StartFailbackLaunchRequest {
    @inline
    def apply(
        recoveryInstanceIDs: StartFailbackRequestRecoveryInstanceIDs,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): StartFailbackLaunchRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceIDs" -> recoveryInstanceIDs.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFailbackLaunchRequest]
    }
  }

  @js.native
  trait StartFailbackLaunchResponse extends js.Object {
    var job: js.UndefOr[Job]
  }

  object StartFailbackLaunchResponse {
    @inline
    def apply(
        job: js.UndefOr[Job] = js.undefined
    ): StartFailbackLaunchResponse = {
      val __obj = js.Dynamic.literal()
      job.foreach(__v => __obj.updateDynamic("job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFailbackLaunchResponse]
    }
  }

  @js.native
  trait StartRecoveryRequest extends js.Object {
    var sourceServers: StartRecoveryRequestSourceServers
    var isDrill: js.UndefOr[Boolean]
    var tags: js.UndefOr[TagsMap]
  }

  object StartRecoveryRequest {
    @inline
    def apply(
        sourceServers: StartRecoveryRequestSourceServers,
        isDrill: js.UndefOr[Boolean] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): StartRecoveryRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServers" -> sourceServers.asInstanceOf[js.Any]
      )

      isDrill.foreach(__v => __obj.updateDynamic("isDrill")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRecoveryRequest]
    }
  }

  /** An object representing the Source Server to recover.
    */
  @js.native
  trait StartRecoveryRequestSourceServer extends js.Object {
    var sourceServerID: SourceServerID
    var recoverySnapshotID: js.UndefOr[RecoverySnapshotID]
  }

  object StartRecoveryRequestSourceServer {
    @inline
    def apply(
        sourceServerID: SourceServerID,
        recoverySnapshotID: js.UndefOr[RecoverySnapshotID] = js.undefined
    ): StartRecoveryRequestSourceServer = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )

      recoverySnapshotID.foreach(__v => __obj.updateDynamic("recoverySnapshotID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRecoveryRequestSourceServer]
    }
  }

  @js.native
  trait StartRecoveryResponse extends js.Object {
    var job: js.UndefOr[Job]
  }

  object StartRecoveryResponse {
    @inline
    def apply(
        job: js.UndefOr[Job] = js.undefined
    ): StartRecoveryResponse = {
      val __obj = js.Dynamic.literal()
      job.foreach(__v => __obj.updateDynamic("job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRecoveryResponse]
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
  trait StartReplicationResponse extends js.Object {
    var sourceServer: js.UndefOr[SourceServer]
  }

  object StartReplicationResponse {
    @inline
    def apply(
        sourceServer: js.UndefOr[SourceServer] = js.undefined
    ): StartReplicationResponse = {
      val __obj = js.Dynamic.literal()
      sourceServer.foreach(__v => __obj.updateDynamic("sourceServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationResponse]
    }
  }

  @js.native
  trait StopFailbackRequest extends js.Object {
    var recoveryInstanceID: RecoveryInstanceID
  }

  object StopFailbackRequest {
    @inline
    def apply(
        recoveryInstanceID: RecoveryInstanceID
    ): StopFailbackRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceID" -> recoveryInstanceID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopFailbackRequest]
    }
  }

  @js.native
  trait StopReplicationRequest extends js.Object {
    var sourceServerID: SourceServerID
  }

  object StopReplicationRequest {
    @inline
    def apply(
        sourceServerID: SourceServerID
    ): StopReplicationRequest = {
      val __obj = js.Dynamic.literal(
        "sourceServerID" -> sourceServerID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopReplicationRequest]
    }
  }

  @js.native
  trait StopReplicationResponse extends js.Object {
    var sourceServer: js.UndefOr[SourceServer]
  }

  object StopReplicationResponse {
    @inline
    def apply(
        sourceServer: js.UndefOr[SourceServer] = js.undefined
    ): StopReplicationResponse = {
      val __obj = js.Dynamic.literal()
      sourceServer.foreach(__v => __obj.updateDynamic("sourceServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopReplicationResponse]
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
  trait TerminateRecoveryInstancesRequest extends js.Object {
    var recoveryInstanceIDs: RecoveryInstancesForTerminationRequest
  }

  object TerminateRecoveryInstancesRequest {
    @inline
    def apply(
        recoveryInstanceIDs: RecoveryInstancesForTerminationRequest
    ): TerminateRecoveryInstancesRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceIDs" -> recoveryInstanceIDs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TerminateRecoveryInstancesRequest]
    }
  }

  @js.native
  trait TerminateRecoveryInstancesResponse extends js.Object {
    var job: js.UndefOr[Job]
  }

  object TerminateRecoveryInstancesResponse {
    @inline
    def apply(
        job: js.UndefOr[Job] = js.undefined
    ): TerminateRecoveryInstancesResponse = {
      val __obj = js.Dynamic.literal()
      job.foreach(__v => __obj.updateDynamic("job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateRecoveryInstancesResponse]
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
  trait UpdateFailbackReplicationConfigurationRequest extends js.Object {
    var recoveryInstanceID: RecoveryInstanceID
    var bandwidthThrottling: js.UndefOr[PositiveInteger]
    var name: js.UndefOr[BoundedString]
    var usePrivateIP: js.UndefOr[Boolean]
  }

  object UpdateFailbackReplicationConfigurationRequest {
    @inline
    def apply(
        recoveryInstanceID: RecoveryInstanceID,
        bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined,
        name: js.UndefOr[BoundedString] = js.undefined,
        usePrivateIP: js.UndefOr[Boolean] = js.undefined
    ): UpdateFailbackReplicationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryInstanceID" -> recoveryInstanceID.asInstanceOf[js.Any]
      )

      bandwidthThrottling.foreach(__v => __obj.updateDynamic("bandwidthThrottling")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      usePrivateIP.foreach(__v => __obj.updateDynamic("usePrivateIP")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFailbackReplicationConfigurationRequest]
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
    var pitPolicy: js.UndefOr[PITPolicy]
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
        pitPolicy: js.UndefOr[PITPolicy] = js.undefined,
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
      pitPolicy.foreach(__v => __obj.updateDynamic("pitPolicy")(__v.asInstanceOf[js.Any]))
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
    var pitPolicy: js.UndefOr[PITPolicy]
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
        pitPolicy: js.UndefOr[PITPolicy] = js.undefined,
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
      pitPolicy.foreach(__v => __obj.updateDynamic("pitPolicy")(__v.asInstanceOf[js.Any]))
      replicationServerInstanceType.foreach(__v => __obj.updateDynamic("replicationServerInstanceType")(__v.asInstanceOf[js.Any]))
      replicationServersSecurityGroupsIDs.foreach(__v => __obj.updateDynamic("replicationServersSecurityGroupsIDs")(__v.asInstanceOf[js.Any]))
      stagingAreaSubnetId.foreach(__v => __obj.updateDynamic("stagingAreaSubnetId")(__v.asInstanceOf[js.Any]))
      stagingAreaTags.foreach(__v => __obj.updateDynamic("stagingAreaTags")(__v.asInstanceOf[js.Any]))
      useDedicatedReplicationServer.foreach(__v => __obj.updateDynamic("useDedicatedReplicationServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReplicationConfigurationTemplateRequest]
    }
  }
}
