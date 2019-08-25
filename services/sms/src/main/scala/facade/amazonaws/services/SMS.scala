package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object sms {
  type AmiId                                = String
  type AppDescription                       = String
  type AppId                                = String
  type AppIds                               = js.Array[AppId]
  type AppLaunchStatus                      = String
  type AppLaunchStatusMessage               = String
  type AppName                              = String
  type AppReplicationStatus                 = String
  type AppReplicationStatusMessage          = String
  type AppStatus                            = String
  type AppStatusMessage                     = String
  type Apps                                 = js.Array[AppSummary]
  type AssociatePublicIpAddress             = Boolean
  type BucketName                           = String
  type ClientToken                          = String
  type ConnectorCapability                  = String
  type ConnectorCapabilityList              = js.Array[ConnectorCapability]
  type ConnectorId                          = String
  type ConnectorList                        = js.Array[Connector]
  type ConnectorStatus                      = String
  type ConnectorVersion                     = String
  type Description                          = String
  type EC2KeyName                           = String
  type Encrypted                            = Boolean
  type ForceStopAppReplication              = Boolean
  type ForceTerminateApp                    = Boolean
  type Frequency                            = Int
  type InstanceType                         = String
  type IpAddress                            = String
  type KeyName                              = String
  type KmsKeyId                             = String
  type LaunchOrder                          = Int
  type LicenseType                          = String
  type LogicalId                            = String
  type MacAddress                           = String
  type MaxResults                           = Int
  type NextToken                            = String
  type NumberOfRecentAmisToKeep             = Int
  type OutputFormat                         = String
  type ReplicationJobId                     = String
  type ReplicationJobList                   = js.Array[ReplicationJob]
  type ReplicationJobState                  = String
  type ReplicationJobStatusMessage          = String
  type ReplicationJobTerminated             = Boolean
  type ReplicationRunId                     = String
  type ReplicationRunList                   = js.Array[ReplicationRun]
  type ReplicationRunStage                  = String
  type ReplicationRunStageProgress          = String
  type ReplicationRunState                  = String
  type ReplicationRunStatusMessage          = String
  type ReplicationRunType                   = String
  type RoleName                             = String
  type RunOnce                              = Boolean
  type SecurityGroup                        = String
  type ServerCatalogStatus                  = String
  type ServerGroupId                        = String
  type ServerGroupLaunchConfigurations      = js.Array[ServerGroupLaunchConfiguration]
  type ServerGroupName                      = String
  type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]
  type ServerGroups                         = js.Array[ServerGroup]
  type ServerId                             = String
  type ServerLaunchConfigurations           = js.Array[ServerLaunchConfiguration]
  type ServerList                           = js.Array[Server]
  type ServerReplicationConfigurations      = js.Array[ServerReplicationConfiguration]
  type ServerType                           = String
  type StackId                              = String
  type StackName                            = String
  type Subnet                               = String
  type TagKey                               = String
  type TagValue                             = String
  type Tags                                 = js.Array[Tag]
  type Timestamp                            = js.Date
  type TotalServerGroups                    = Int
  type TotalServers                         = Int
  type VPC                                  = String
  type VmId                                 = String
  type VmManagerId                          = String
  type VmManagerName                        = String
  type VmManagerType                        = String
  type VmName                               = String
  type VmPath                               = String
  type VmServerAddressList                  = js.Array[VmServerAddress]

  implicit final class SMSOps(val service: SMS) extends AnyVal {

    def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] =
      service.createApp(params).promise.toFuture
    def createReplicationJobFuture(params: CreateReplicationJobRequest): Future[CreateReplicationJobResponse] =
      service.createReplicationJob(params).promise.toFuture
    def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResponse] =
      service.deleteApp(params).promise.toFuture
    def deleteAppLaunchConfigurationFuture(
        params: DeleteAppLaunchConfigurationRequest
    ): Future[DeleteAppLaunchConfigurationResponse] = service.deleteAppLaunchConfiguration(params).promise.toFuture
    def deleteAppReplicationConfigurationFuture(
        params: DeleteAppReplicationConfigurationRequest
    ): Future[DeleteAppReplicationConfigurationResponse] =
      service.deleteAppReplicationConfiguration(params).promise.toFuture
    def deleteReplicationJobFuture(params: DeleteReplicationJobRequest): Future[DeleteReplicationJobResponse] =
      service.deleteReplicationJob(params).promise.toFuture
    def deleteServerCatalogFuture(params: DeleteServerCatalogRequest): Future[DeleteServerCatalogResponse] =
      service.deleteServerCatalog(params).promise.toFuture
    def disassociateConnectorFuture(params: DisassociateConnectorRequest): Future[DisassociateConnectorResponse] =
      service.disassociateConnector(params).promise.toFuture
    def generateChangeSetFuture(params: GenerateChangeSetRequest): Future[GenerateChangeSetResponse] =
      service.generateChangeSet(params).promise.toFuture
    def generateTemplateFuture(params: GenerateTemplateRequest): Future[GenerateTemplateResponse] =
      service.generateTemplate(params).promise.toFuture
    def getAppFuture(params: GetAppRequest): Future[GetAppResponse] = service.getApp(params).promise.toFuture
    def getAppLaunchConfigurationFuture(
        params: GetAppLaunchConfigurationRequest
    ): Future[GetAppLaunchConfigurationResponse] = service.getAppLaunchConfiguration(params).promise.toFuture
    def getAppReplicationConfigurationFuture(
        params: GetAppReplicationConfigurationRequest
    ): Future[GetAppReplicationConfigurationResponse] = service.getAppReplicationConfiguration(params).promise.toFuture
    def getConnectorsFuture(params: GetConnectorsRequest): Future[GetConnectorsResponse] =
      service.getConnectors(params).promise.toFuture
    def getReplicationJobsFuture(params: GetReplicationJobsRequest): Future[GetReplicationJobsResponse] =
      service.getReplicationJobs(params).promise.toFuture
    def getReplicationRunsFuture(params: GetReplicationRunsRequest): Future[GetReplicationRunsResponse] =
      service.getReplicationRuns(params).promise.toFuture
    def getServersFuture(params: GetServersRequest): Future[GetServersResponse] =
      service.getServers(params).promise.toFuture
    def importServerCatalogFuture(params: ImportServerCatalogRequest): Future[ImportServerCatalogResponse] =
      service.importServerCatalog(params).promise.toFuture
    def launchAppFuture(params: LaunchAppRequest): Future[LaunchAppResponse] =
      service.launchApp(params).promise.toFuture
    def listAppsFuture(params: ListAppsRequest): Future[ListAppsResponse] = service.listApps(params).promise.toFuture
    def putAppLaunchConfigurationFuture(
        params: PutAppLaunchConfigurationRequest
    ): Future[PutAppLaunchConfigurationResponse] = service.putAppLaunchConfiguration(params).promise.toFuture
    def putAppReplicationConfigurationFuture(
        params: PutAppReplicationConfigurationRequest
    ): Future[PutAppReplicationConfigurationResponse] = service.putAppReplicationConfiguration(params).promise.toFuture
    def startAppReplicationFuture(params: StartAppReplicationRequest): Future[StartAppReplicationResponse] =
      service.startAppReplication(params).promise.toFuture
    def startOnDemandReplicationRunFuture(
        params: StartOnDemandReplicationRunRequest
    ): Future[StartOnDemandReplicationRunResponse] = service.startOnDemandReplicationRun(params).promise.toFuture
    def stopAppReplicationFuture(params: StopAppReplicationRequest): Future[StopAppReplicationResponse] =
      service.stopAppReplication(params).promise.toFuture
    def terminateAppFuture(params: TerminateAppRequest): Future[TerminateAppResponse] =
      service.terminateApp(params).promise.toFuture
    def updateAppFuture(params: UpdateAppRequest): Future[UpdateAppResponse] =
      service.updateApp(params).promise.toFuture
    def updateReplicationJobFuture(params: UpdateReplicationJobRequest): Future[UpdateReplicationJobResponse] =
      service.updateReplicationJob(params).promise.toFuture
  }
}

package sms {
  @js.native
  @JSImport("aws-sdk", "SMS")
  class SMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResponse]                                  = js.native
    def createReplicationJob(params: CreateReplicationJobRequest): Request[CreateReplicationJobResponse] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse]                                  = js.native
    def deleteAppLaunchConfiguration(
        params: DeleteAppLaunchConfigurationRequest
    ): Request[DeleteAppLaunchConfigurationResponse] = js.native
    def deleteAppReplicationConfiguration(
        params: DeleteAppReplicationConfigurationRequest
    ): Request[DeleteAppReplicationConfigurationResponse]                                                   = js.native
    def deleteReplicationJob(params: DeleteReplicationJobRequest): Request[DeleteReplicationJobResponse]    = js.native
    def deleteServerCatalog(params: DeleteServerCatalogRequest): Request[DeleteServerCatalogResponse]       = js.native
    def disassociateConnector(params: DisassociateConnectorRequest): Request[DisassociateConnectorResponse] = js.native
    def generateChangeSet(params: GenerateChangeSetRequest): Request[GenerateChangeSetResponse]             = js.native
    def generateTemplate(params: GenerateTemplateRequest): Request[GenerateTemplateResponse]                = js.native
    def getApp(params: GetAppRequest): Request[GetAppResponse]                                              = js.native
    def getAppLaunchConfiguration(
        params: GetAppLaunchConfigurationRequest
    ): Request[GetAppLaunchConfigurationResponse] = js.native
    def getAppReplicationConfiguration(
        params: GetAppReplicationConfigurationRequest
    ): Request[GetAppReplicationConfigurationResponse]                                                = js.native
    def getConnectors(params: GetConnectorsRequest): Request[GetConnectorsResponse]                   = js.native
    def getReplicationJobs(params: GetReplicationJobsRequest): Request[GetReplicationJobsResponse]    = js.native
    def getReplicationRuns(params: GetReplicationRunsRequest): Request[GetReplicationRunsResponse]    = js.native
    def getServers(params: GetServersRequest): Request[GetServersResponse]                            = js.native
    def importServerCatalog(params: ImportServerCatalogRequest): Request[ImportServerCatalogResponse] = js.native
    def launchApp(params: LaunchAppRequest): Request[LaunchAppResponse]                               = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResponse]                                  = js.native
    def putAppLaunchConfiguration(
        params: PutAppLaunchConfigurationRequest
    ): Request[PutAppLaunchConfigurationResponse] = js.native
    def putAppReplicationConfiguration(
        params: PutAppReplicationConfigurationRequest
    ): Request[PutAppReplicationConfigurationResponse]                                                = js.native
    def startAppReplication(params: StartAppReplicationRequest): Request[StartAppReplicationResponse] = js.native
    def startOnDemandReplicationRun(
        params: StartOnDemandReplicationRunRequest
    ): Request[StartOnDemandReplicationRunResponse]                                                      = js.native
    def stopAppReplication(params: StopAppReplicationRequest): Request[StopAppReplicationResponse]       = js.native
    def terminateApp(params: TerminateAppRequest): Request[TerminateAppResponse]                         = js.native
    def updateApp(params: UpdateAppRequest): Request[UpdateAppResponse]                                  = js.native
    def updateReplicationJob(params: UpdateReplicationJobRequest): Request[UpdateReplicationJobResponse] = js.native
  }

  object AppLaunchStatusEnum {
    val READY_FOR_CONFIGURATION   = "READY_FOR_CONFIGURATION"
    val CONFIGURATION_IN_PROGRESS = "CONFIGURATION_IN_PROGRESS"
    val CONFIGURATION_INVALID     = "CONFIGURATION_INVALID"
    val READY_FOR_LAUNCH          = "READY_FOR_LAUNCH"
    val VALIDATION_IN_PROGRESS    = "VALIDATION_IN_PROGRESS"
    val LAUNCH_PENDING            = "LAUNCH_PENDING"
    val LAUNCH_IN_PROGRESS        = "LAUNCH_IN_PROGRESS"
    val LAUNCHED                  = "LAUNCHED"
    val DELTA_LAUNCH_IN_PROGRESS  = "DELTA_LAUNCH_IN_PROGRESS"
    val DELTA_LAUNCH_FAILED       = "DELTA_LAUNCH_FAILED"
    val LAUNCH_FAILED             = "LAUNCH_FAILED"
    val TERMINATE_IN_PROGRESS     = "TERMINATE_IN_PROGRESS"
    val TERMINATE_FAILED          = "TERMINATE_FAILED"
    val TERMINATED                = "TERMINATED"

    val values = IndexedSeq(
      READY_FOR_CONFIGURATION,
      CONFIGURATION_IN_PROGRESS,
      CONFIGURATION_INVALID,
      READY_FOR_LAUNCH,
      VALIDATION_IN_PROGRESS,
      LAUNCH_PENDING,
      LAUNCH_IN_PROGRESS,
      LAUNCHED,
      DELTA_LAUNCH_IN_PROGRESS,
      DELTA_LAUNCH_FAILED,
      LAUNCH_FAILED,
      TERMINATE_IN_PROGRESS,
      TERMINATE_FAILED,
      TERMINATED
    )
  }

  object AppReplicationStatusEnum {
    val READY_FOR_CONFIGURATION       = "READY_FOR_CONFIGURATION"
    val CONFIGURATION_IN_PROGRESS     = "CONFIGURATION_IN_PROGRESS"
    val CONFIGURATION_INVALID         = "CONFIGURATION_INVALID"
    val READY_FOR_REPLICATION         = "READY_FOR_REPLICATION"
    val VALIDATION_IN_PROGRESS        = "VALIDATION_IN_PROGRESS"
    val REPLICATION_PENDING           = "REPLICATION_PENDING"
    val REPLICATION_IN_PROGRESS       = "REPLICATION_IN_PROGRESS"
    val REPLICATED                    = "REPLICATED"
    val DELTA_REPLICATION_IN_PROGRESS = "DELTA_REPLICATION_IN_PROGRESS"
    val DELTA_REPLICATED              = "DELTA_REPLICATED"
    val DELTA_REPLICATION_FAILED      = "DELTA_REPLICATION_FAILED"
    val REPLICATION_FAILED            = "REPLICATION_FAILED"
    val REPLICATION_STOPPING          = "REPLICATION_STOPPING"
    val REPLICATION_STOP_FAILED       = "REPLICATION_STOP_FAILED"
    val REPLICATION_STOPPED           = "REPLICATION_STOPPED"

    val values = IndexedSeq(
      READY_FOR_CONFIGURATION,
      CONFIGURATION_IN_PROGRESS,
      CONFIGURATION_INVALID,
      READY_FOR_REPLICATION,
      VALIDATION_IN_PROGRESS,
      REPLICATION_PENDING,
      REPLICATION_IN_PROGRESS,
      REPLICATED,
      DELTA_REPLICATION_IN_PROGRESS,
      DELTA_REPLICATED,
      DELTA_REPLICATION_FAILED,
      REPLICATION_FAILED,
      REPLICATION_STOPPING,
      REPLICATION_STOP_FAILED,
      REPLICATION_STOPPED
    )
  }

  object AppStatusEnum {
    val CREATING      = "CREATING"
    val ACTIVE        = "ACTIVE"
    val UPDATING      = "UPDATING"
    val DELETING      = "DELETING"
    val DELETED       = "DELETED"
    val DELETE_FAILED = "DELETE_FAILED"

    val values = IndexedSeq(CREATING, ACTIVE, UPDATING, DELETING, DELETED, DELETE_FAILED)
  }

  /**
    * Information about the application.
    */
  @js.native
  trait AppSummary extends js.Object {
    var appId: js.UndefOr[AppId]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[AppDescription]
    var lastModified: js.UndefOr[Timestamp]
    var latestReplicationTime: js.UndefOr[Timestamp]
    var launchDetails: js.UndefOr[LaunchDetails]
    var launchStatus: js.UndefOr[AppLaunchStatus]
    var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage]
    var name: js.UndefOr[AppName]
    var replicationStatus: js.UndefOr[AppReplicationStatus]
    var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage]
    var roleName: js.UndefOr[RoleName]
    var status: js.UndefOr[AppStatus]
    var statusMessage: js.UndefOr[AppStatusMessage]
    var totalServerGroups: js.UndefOr[TotalServerGroups]
    var totalServers: js.UndefOr[TotalServers]
  }

  object AppSummary {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[AppDescription] = js.undefined,
        lastModified: js.UndefOr[Timestamp] = js.undefined,
        latestReplicationTime: js.UndefOr[Timestamp] = js.undefined,
        launchDetails: js.UndefOr[LaunchDetails] = js.undefined,
        launchStatus: js.UndefOr[AppLaunchStatus] = js.undefined,
        launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.undefined,
        name: js.UndefOr[AppName] = js.undefined,
        replicationStatus: js.UndefOr[AppReplicationStatus] = js.undefined,
        replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        status: js.UndefOr[AppStatus] = js.undefined,
        statusMessage: js.UndefOr[AppStatusMessage] = js.undefined,
        totalServerGroups: js.UndefOr[TotalServerGroups] = js.undefined,
        totalServers: js.UndefOr[TotalServers] = js.undefined
    ): AppSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      lastModified.foreach(__v => __obj.update("lastModified", __v.asInstanceOf[js.Any]))
      latestReplicationTime.foreach(__v => __obj.update("latestReplicationTime", __v.asInstanceOf[js.Any]))
      launchDetails.foreach(__v => __obj.update("launchDetails", __v.asInstanceOf[js.Any]))
      launchStatus.foreach(__v => __obj.update("launchStatus", __v.asInstanceOf[js.Any]))
      launchStatusMessage.foreach(__v => __obj.update("launchStatusMessage", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      replicationStatus.foreach(__v => __obj.update("replicationStatus", __v.asInstanceOf[js.Any]))
      replicationStatusMessage.foreach(__v => __obj.update("replicationStatusMessage", __v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.update("roleName", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.update("statusMessage", __v.asInstanceOf[js.Any]))
      totalServerGroups.foreach(__v => __obj.update("totalServerGroups", __v.asInstanceOf[js.Any]))
      totalServers.foreach(__v => __obj.update("totalServers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppSummary]
    }
  }

  /**
    * Represents a connector.
    */
  @js.native
  trait Connector extends js.Object {
    var associatedOn: js.UndefOr[Timestamp]
    var capabilityList: js.UndefOr[ConnectorCapabilityList]
    var connectorId: js.UndefOr[ConnectorId]
    var ipAddress: js.UndefOr[IpAddress]
    var macAddress: js.UndefOr[MacAddress]
    var status: js.UndefOr[ConnectorStatus]
    var version: js.UndefOr[ConnectorVersion]
    var vmManagerId: js.UndefOr[VmManagerId]
    var vmManagerName: js.UndefOr[VmManagerName]
    var vmManagerType: js.UndefOr[VmManagerType]
  }

  object Connector {
    def apply(
        associatedOn: js.UndefOr[Timestamp] = js.undefined,
        capabilityList: js.UndefOr[ConnectorCapabilityList] = js.undefined,
        connectorId: js.UndefOr[ConnectorId] = js.undefined,
        ipAddress: js.UndefOr[IpAddress] = js.undefined,
        macAddress: js.UndefOr[MacAddress] = js.undefined,
        status: js.UndefOr[ConnectorStatus] = js.undefined,
        version: js.UndefOr[ConnectorVersion] = js.undefined,
        vmManagerId: js.UndefOr[VmManagerId] = js.undefined,
        vmManagerName: js.UndefOr[VmManagerName] = js.undefined,
        vmManagerType: js.UndefOr[VmManagerType] = js.undefined
    ): Connector = {
      val __obj = js.Dictionary.empty[js.Any]
      associatedOn.foreach(__v => __obj.update("associatedOn", __v.asInstanceOf[js.Any]))
      capabilityList.foreach(__v => __obj.update("capabilityList", __v.asInstanceOf[js.Any]))
      connectorId.foreach(__v => __obj.update("connectorId", __v.asInstanceOf[js.Any]))
      ipAddress.foreach(__v => __obj.update("ipAddress", __v.asInstanceOf[js.Any]))
      macAddress.foreach(__v => __obj.update("macAddress", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      vmManagerId.foreach(__v => __obj.update("vmManagerId", __v.asInstanceOf[js.Any]))
      vmManagerName.foreach(__v => __obj.update("vmManagerName", __v.asInstanceOf[js.Any]))
      vmManagerType.foreach(__v => __obj.update("vmManagerType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connector]
    }
  }

  object ConnectorCapabilityEnum {
    val VSPHERE           = "VSPHERE"
    val SCVMM             = "SCVMM"
    val `HYPERV-MANAGER`  = "HYPERV-MANAGER"
    val SNAPSHOT_BATCHING = "SNAPSHOT_BATCHING"

    val values = IndexedSeq(VSPHERE, SCVMM, `HYPERV-MANAGER`, SNAPSHOT_BATCHING)
  }

  object ConnectorStatusEnum {
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"

    val values = IndexedSeq(HEALTHY, UNHEALTHY)
  }

  @js.native
  trait CreateAppRequest extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[AppDescription]
    var name: js.UndefOr[AppName]
    var roleName: js.UndefOr[RoleName]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object CreateAppRequest {
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[AppDescription] = js.undefined,
        name: js.UndefOr[AppName] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAppRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.update("roleName", __v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.update("serverGroups", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppRequest]
    }
  }

  @js.native
  trait CreateAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object CreateAppResponse {
    def apply(
        appSummary: js.UndefOr[AppSummary] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAppResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      appSummary.foreach(__v => __obj.update("appSummary", __v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.update("serverGroups", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppResponse]
    }
  }

  @js.native
  trait CreateReplicationJobRequest extends js.Object {
    var seedReplicationTime: Timestamp
    var serverId: ServerId
    var description: js.UndefOr[Description]
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var licenseType: js.UndefOr[LicenseType]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var roleName: js.UndefOr[RoleName]
    var runOnce: js.UndefOr[RunOnce]
  }

  object CreateReplicationJobRequest {
    def apply(
        seedReplicationTime: Timestamp,
        serverId: ServerId,
        description: js.UndefOr[Description] = js.undefined,
        encrypted: js.UndefOr[Encrypted] = js.undefined,
        frequency: js.UndefOr[Frequency] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        licenseType: js.UndefOr[LicenseType] = js.undefined,
        numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        runOnce: js.UndefOr[RunOnce] = js.undefined
    ): CreateReplicationJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "seedReplicationTime" -> seedReplicationTime.asInstanceOf[js.Any],
        "serverId"            -> serverId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.update("encrypted", __v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.update("frequency", __v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.update("kmsKeyId", __v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.update("licenseType", __v.asInstanceOf[js.Any]))
      numberOfRecentAmisToKeep.foreach(__v => __obj.update("numberOfRecentAmisToKeep", __v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.update("roleName", __v.asInstanceOf[js.Any]))
      runOnce.foreach(__v => __obj.update("runOnce", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationJobRequest]
    }
  }

  @js.native
  trait CreateReplicationJobResponse extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  object CreateReplicationJobResponse {
    def apply(
        replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
    ): CreateReplicationJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      replicationJobId.foreach(__v => __obj.update("replicationJobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationJobResponse]
    }
  }

  @js.native
  trait DeleteAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object DeleteAppLaunchConfigurationRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): DeleteAppLaunchConfigurationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAppLaunchConfigurationResponse extends js.Object {}

  object DeleteAppLaunchConfigurationResponse {
    def apply(
        ): DeleteAppLaunchConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object DeleteAppReplicationConfigurationRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): DeleteAppReplicationConfigurationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAppReplicationConfigurationResponse extends js.Object {}

  object DeleteAppReplicationConfigurationResponse {
    def apply(
        ): DeleteAppReplicationConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteAppReplicationConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var forceStopAppReplication: js.UndefOr[ForceStopAppReplication]
    var forceTerminateApp: js.UndefOr[ForceTerminateApp]
  }

  object DeleteAppRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.undefined,
        forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.undefined
    ): DeleteAppRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      forceStopAppReplication.foreach(__v => __obj.update("forceStopAppReplication", __v.asInstanceOf[js.Any]))
      forceTerminateApp.foreach(__v => __obj.update("forceTerminateApp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteAppResponse extends js.Object {}

  object DeleteAppResponse {
    def apply(
        ): DeleteAppResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteAppResponse]
    }
  }

  @js.native
  trait DeleteReplicationJobRequest extends js.Object {
    var replicationJobId: ReplicationJobId
  }

  object DeleteReplicationJobRequest {
    def apply(
        replicationJobId: ReplicationJobId
    ): DeleteReplicationJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReplicationJobRequest]
    }
  }

  @js.native
  trait DeleteReplicationJobResponse extends js.Object {}

  object DeleteReplicationJobResponse {
    def apply(
        ): DeleteReplicationJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteReplicationJobResponse]
    }
  }

  @js.native
  trait DeleteServerCatalogRequest extends js.Object {}

  object DeleteServerCatalogRequest {
    def apply(
        ): DeleteServerCatalogRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteServerCatalogRequest]
    }
  }

  @js.native
  trait DeleteServerCatalogResponse extends js.Object {}

  object DeleteServerCatalogResponse {
    def apply(
        ): DeleteServerCatalogResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteServerCatalogResponse]
    }
  }

  @js.native
  trait DisassociateConnectorRequest extends js.Object {
    var connectorId: ConnectorId
  }

  object DisassociateConnectorRequest {
    def apply(
        connectorId: ConnectorId
    ): DisassociateConnectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "connectorId" -> connectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateConnectorRequest]
    }
  }

  @js.native
  trait DisassociateConnectorResponse extends js.Object {}

  object DisassociateConnectorResponse {
    def apply(
        ): DisassociateConnectorResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateConnectorResponse]
    }
  }

  @js.native
  trait GenerateChangeSetRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var changesetFormat: js.UndefOr[OutputFormat]
  }

  object GenerateChangeSetRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        changesetFormat: js.UndefOr[OutputFormat] = js.undefined
    ): GenerateChangeSetRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      changesetFormat.foreach(__v => __obj.update("changesetFormat", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateChangeSetRequest]
    }
  }

  @js.native
  trait GenerateChangeSetResponse extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object GenerateChangeSetResponse {
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): GenerateChangeSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      s3Location.foreach(__v => __obj.update("s3Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateChangeSetResponse]
    }
  }

  @js.native
  trait GenerateTemplateRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var templateFormat: js.UndefOr[OutputFormat]
  }

  object GenerateTemplateRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        templateFormat: js.UndefOr[OutputFormat] = js.undefined
    ): GenerateTemplateRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      templateFormat.foreach(__v => __obj.update("templateFormat", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateTemplateRequest]
    }
  }

  @js.native
  trait GenerateTemplateResponse extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object GenerateTemplateResponse {
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): GenerateTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      s3Location.foreach(__v => __obj.update("s3Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateTemplateResponse]
    }
  }

  @js.native
  trait GetAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppLaunchConfigurationRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): GetAppLaunchConfigurationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait GetAppLaunchConfigurationResponse extends js.Object {
    var appId: js.UndefOr[AppId]
    var roleName: js.UndefOr[RoleName]
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations]
  }

  object GetAppLaunchConfigurationResponse {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined
    ): GetAppLaunchConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.update("roleName", __v.asInstanceOf[js.Any]))
      serverGroupLaunchConfigurations.foreach(
        __v => __obj.update("serverGroupLaunchConfigurations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait GetAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppReplicationConfigurationRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): GetAppReplicationConfigurationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait GetAppReplicationConfigurationResponse extends js.Object {
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations]
  }

  object GetAppReplicationConfigurationResponse {
    def apply(
        serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
    ): GetAppReplicationConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      serverGroupReplicationConfigurations.foreach(
        __v => __obj.update("serverGroupReplicationConfigurations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetAppReplicationConfigurationResponse]
    }
  }

  @js.native
  trait GetAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): GetAppRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppRequest]
    }
  }

  @js.native
  trait GetAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object GetAppResponse {
    def apply(
        appSummary: js.UndefOr[AppSummary] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetAppResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      appSummary.foreach(__v => __obj.update("appSummary", __v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.update("serverGroups", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppResponse]
    }
  }

  @js.native
  trait GetConnectorsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetConnectorsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetConnectorsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectorsRequest]
    }
  }

  @js.native
  trait GetConnectorsResponse extends js.Object {
    var connectorList: js.UndefOr[ConnectorList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetConnectorsResponse {
    def apply(
        connectorList: js.UndefOr[ConnectorList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetConnectorsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      connectorList.foreach(__v => __obj.update("connectorList", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectorsResponse]
    }
  }

  @js.native
  trait GetReplicationJobsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  object GetReplicationJobsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
    ): GetReplicationJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      replicationJobId.foreach(__v => __obj.update("replicationJobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReplicationJobsRequest]
    }
  }

  @js.native
  trait GetReplicationJobsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var replicationJobList: js.UndefOr[ReplicationJobList]
  }

  object GetReplicationJobsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        replicationJobList: js.UndefOr[ReplicationJobList] = js.undefined
    ): GetReplicationJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      replicationJobList.foreach(__v => __obj.update("replicationJobList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReplicationJobsResponse]
    }
  }

  @js.native
  trait GetReplicationRunsRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetReplicationRunsRequest {
    def apply(
        replicationJobId: ReplicationJobId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetReplicationRunsRequest = {
      val __obj = js.Dictionary[js.Any](
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReplicationRunsRequest]
    }
  }

  @js.native
  trait GetReplicationRunsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var replicationJob: js.UndefOr[ReplicationJob]
    var replicationRunList: js.UndefOr[ReplicationRunList]
  }

  object GetReplicationRunsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        replicationJob: js.UndefOr[ReplicationJob] = js.undefined,
        replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
    ): GetReplicationRunsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      replicationJob.foreach(__v => __obj.update("replicationJob", __v.asInstanceOf[js.Any]))
      replicationRunList.foreach(__v => __obj.update("replicationRunList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReplicationRunsResponse]
    }
  }

  @js.native
  trait GetServersRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var vmServerAddressList: js.UndefOr[VmServerAddressList]
  }

  object GetServersRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        vmServerAddressList: js.UndefOr[VmServerAddressList] = js.undefined
    ): GetServersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      vmServerAddressList.foreach(__v => __obj.update("vmServerAddressList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServersRequest]
    }
  }

  @js.native
  trait GetServersResponse extends js.Object {
    var lastModifiedOn: js.UndefOr[Timestamp]
    var nextToken: js.UndefOr[NextToken]
    var serverCatalogStatus: js.UndefOr[ServerCatalogStatus]
    var serverList: js.UndefOr[ServerList]
  }

  object GetServersResponse {
    def apply(
        lastModifiedOn: js.UndefOr[Timestamp] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.undefined,
        serverList: js.UndefOr[ServerList] = js.undefined
    ): GetServersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      lastModifiedOn.foreach(__v => __obj.update("lastModifiedOn", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      serverCatalogStatus.foreach(__v => __obj.update("serverCatalogStatus", __v.asInstanceOf[js.Any]))
      serverList.foreach(__v => __obj.update("serverList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServersResponse]
    }
  }

  @js.native
  trait ImportServerCatalogRequest extends js.Object {}

  object ImportServerCatalogRequest {
    def apply(
        ): ImportServerCatalogRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ImportServerCatalogRequest]
    }
  }

  @js.native
  trait ImportServerCatalogResponse extends js.Object {}

  object ImportServerCatalogResponse {
    def apply(
        ): ImportServerCatalogResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ImportServerCatalogResponse]
    }
  }

  @js.native
  trait LaunchAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object LaunchAppRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): LaunchAppRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchAppRequest]
    }
  }

  @js.native
  trait LaunchAppResponse extends js.Object {}

  object LaunchAppResponse {
    def apply(
        ): LaunchAppResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[LaunchAppResponse]
    }
  }

  /**
    * Details about the latest launch of an application.
    */
  @js.native
  trait LaunchDetails extends js.Object {
    var latestLaunchTime: js.UndefOr[Timestamp]
    var stackId: js.UndefOr[StackId]
    var stackName: js.UndefOr[StackName]
  }

  object LaunchDetails {
    def apply(
        latestLaunchTime: js.UndefOr[Timestamp] = js.undefined,
        stackId: js.UndefOr[StackId] = js.undefined,
        stackName: js.UndefOr[StackName] = js.undefined
    ): LaunchDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      latestLaunchTime.foreach(__v => __obj.update("latestLaunchTime", __v.asInstanceOf[js.Any]))
      stackId.foreach(__v => __obj.update("stackId", __v.asInstanceOf[js.Any]))
      stackName.foreach(__v => __obj.update("stackName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchDetails]
    }
  }

  object LicenseTypeEnum {
    val AWS  = "AWS"
    val BYOL = "BYOL"

    val values = IndexedSeq(AWS, BYOL)
  }

  @js.native
  trait ListAppsRequest extends js.Object {
    var appIds: js.UndefOr[AppIds]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsRequest {
    def apply(
        appIds: js.UndefOr[AppIds] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appIds.foreach(__v => __obj.update("appIds", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsRequest]
    }
  }

  @js.native
  trait ListAppsResponse extends js.Object {
    var apps: js.UndefOr[Apps]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsResponse {
    def apply(
        apps: js.UndefOr[Apps] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      apps.foreach(__v => __obj.update("apps", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsResponse]
    }
  }

  object OutputFormatEnum {
    val JSON = "JSON"
    val YAML = "YAML"

    val values = IndexedSeq(JSON, YAML)
  }

  @js.native
  trait PutAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var roleName: js.UndefOr[RoleName]
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations]
  }

  object PutAppLaunchConfigurationRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined
    ): PutAppLaunchConfigurationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.update("roleName", __v.asInstanceOf[js.Any]))
      serverGroupLaunchConfigurations.foreach(
        __v => __obj.update("serverGroupLaunchConfigurations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait PutAppLaunchConfigurationResponse extends js.Object {}

  object PutAppLaunchConfigurationResponse {
    def apply(
        ): PutAppLaunchConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait PutAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations]
  }

  object PutAppReplicationConfigurationRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
    ): PutAppReplicationConfigurationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      serverGroupReplicationConfigurations.foreach(
        __v => __obj.update("serverGroupReplicationConfigurations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait PutAppReplicationConfigurationResponse extends js.Object {}

  object PutAppReplicationConfigurationResponse {
    def apply(
        ): PutAppReplicationConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutAppReplicationConfigurationResponse]
    }
  }

  /**
    * Represents a replication job.
    */
  @js.native
  trait ReplicationJob extends js.Object {
    var description: js.UndefOr[Description]
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var latestAmiId: js.UndefOr[AmiId]
    var licenseType: js.UndefOr[LicenseType]
    var nextReplicationRunStartTime: js.UndefOr[Timestamp]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var replicationRunList: js.UndefOr[ReplicationRunList]
    var roleName: js.UndefOr[RoleName]
    var runOnce: js.UndefOr[RunOnce]
    var seedReplicationTime: js.UndefOr[Timestamp]
    var serverId: js.UndefOr[ServerId]
    var serverType: js.UndefOr[ServerType]
    var state: js.UndefOr[ReplicationJobState]
    var statusMessage: js.UndefOr[ReplicationJobStatusMessage]
    var vmServer: js.UndefOr[VmServer]
  }

  object ReplicationJob {
    def apply(
        description: js.UndefOr[Description] = js.undefined,
        encrypted: js.UndefOr[Encrypted] = js.undefined,
        frequency: js.UndefOr[Frequency] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        latestAmiId: js.UndefOr[AmiId] = js.undefined,
        licenseType: js.UndefOr[LicenseType] = js.undefined,
        nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined,
        numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
        replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
        replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        runOnce: js.UndefOr[RunOnce] = js.undefined,
        seedReplicationTime: js.UndefOr[Timestamp] = js.undefined,
        serverId: js.UndefOr[ServerId] = js.undefined,
        serverType: js.UndefOr[ServerType] = js.undefined,
        state: js.UndefOr[ReplicationJobState] = js.undefined,
        statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.undefined,
        vmServer: js.UndefOr[VmServer] = js.undefined
    ): ReplicationJob = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.update("encrypted", __v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.update("frequency", __v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.update("kmsKeyId", __v.asInstanceOf[js.Any]))
      latestAmiId.foreach(__v => __obj.update("latestAmiId", __v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.update("licenseType", __v.asInstanceOf[js.Any]))
      nextReplicationRunStartTime.foreach(__v => __obj.update("nextReplicationRunStartTime", __v.asInstanceOf[js.Any]))
      numberOfRecentAmisToKeep.foreach(__v => __obj.update("numberOfRecentAmisToKeep", __v.asInstanceOf[js.Any]))
      replicationJobId.foreach(__v => __obj.update("replicationJobId", __v.asInstanceOf[js.Any]))
      replicationRunList.foreach(__v => __obj.update("replicationRunList", __v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.update("roleName", __v.asInstanceOf[js.Any]))
      runOnce.foreach(__v => __obj.update("runOnce", __v.asInstanceOf[js.Any]))
      seedReplicationTime.foreach(__v => __obj.update("seedReplicationTime", __v.asInstanceOf[js.Any]))
      serverId.foreach(__v => __obj.update("serverId", __v.asInstanceOf[js.Any]))
      serverType.foreach(__v => __obj.update("serverType", __v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.update("state", __v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.update("statusMessage", __v.asInstanceOf[js.Any]))
      vmServer.foreach(__v => __obj.update("vmServer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationJob]
    }
  }

  object ReplicationJobStateEnum {
    val PENDING           = "PENDING"
    val ACTIVE            = "ACTIVE"
    val FAILED            = "FAILED"
    val DELETING          = "DELETING"
    val DELETED           = "DELETED"
    val COMPLETED         = "COMPLETED"
    val PAUSED_ON_FAILURE = "PAUSED_ON_FAILURE"
    val FAILING           = "FAILING"

    val values = IndexedSeq(PENDING, ACTIVE, FAILED, DELETING, DELETED, COMPLETED, PAUSED_ON_FAILURE, FAILING)
  }

  /**
    * Represents a replication run.
    */
  @js.native
  trait ReplicationRun extends js.Object {
    var amiId: js.UndefOr[AmiId]
    var completedTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var encrypted: js.UndefOr[Encrypted]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var replicationRunId: js.UndefOr[ReplicationRunId]
    var scheduledStartTime: js.UndefOr[Timestamp]
    var stageDetails: js.UndefOr[ReplicationRunStageDetails]
    var state: js.UndefOr[ReplicationRunState]
    var statusMessage: js.UndefOr[ReplicationRunStatusMessage]
    var `type`: js.UndefOr[ReplicationRunType]
  }

  object ReplicationRun {
    def apply(
        amiId: js.UndefOr[AmiId] = js.undefined,
        completedTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        encrypted: js.UndefOr[Encrypted] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined,
        scheduledStartTime: js.UndefOr[Timestamp] = js.undefined,
        stageDetails: js.UndefOr[ReplicationRunStageDetails] = js.undefined,
        state: js.UndefOr[ReplicationRunState] = js.undefined,
        statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.undefined,
        `type`: js.UndefOr[ReplicationRunType] = js.undefined
    ): ReplicationRun = {
      val __obj = js.Dictionary.empty[js.Any]
      amiId.foreach(__v => __obj.update("amiId", __v.asInstanceOf[js.Any]))
      completedTime.foreach(__v => __obj.update("completedTime", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.update("encrypted", __v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.update("kmsKeyId", __v.asInstanceOf[js.Any]))
      replicationRunId.foreach(__v => __obj.update("replicationRunId", __v.asInstanceOf[js.Any]))
      scheduledStartTime.foreach(__v => __obj.update("scheduledStartTime", __v.asInstanceOf[js.Any]))
      stageDetails.foreach(__v => __obj.update("stageDetails", __v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.update("state", __v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.update("statusMessage", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationRun]
    }
  }

  /**
    * Details of the current stage of a replication run.
    */
  @js.native
  trait ReplicationRunStageDetails extends js.Object {
    var stage: js.UndefOr[ReplicationRunStage]
    var stageProgress: js.UndefOr[ReplicationRunStageProgress]
  }

  object ReplicationRunStageDetails {
    def apply(
        stage: js.UndefOr[ReplicationRunStage] = js.undefined,
        stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.undefined
    ): ReplicationRunStageDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      stage.foreach(__v => __obj.update("stage", __v.asInstanceOf[js.Any]))
      stageProgress.foreach(__v => __obj.update("stageProgress", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationRunStageDetails]
    }
  }

  object ReplicationRunStateEnum {
    val PENDING   = "PENDING"
    val MISSED    = "MISSED"
    val ACTIVE    = "ACTIVE"
    val FAILED    = "FAILED"
    val COMPLETED = "COMPLETED"
    val DELETING  = "DELETING"
    val DELETED   = "DELETED"

    val values = IndexedSeq(PENDING, MISSED, ACTIVE, FAILED, COMPLETED, DELETING, DELETED)
  }

  object ReplicationRunTypeEnum {
    val ON_DEMAND = "ON_DEMAND"
    val AUTOMATIC = "AUTOMATIC"

    val values = IndexedSeq(ON_DEMAND, AUTOMATIC)
  }

  /**
    * Location of the Amazon S3 object in the customer's account.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[BucketName]
    var key: js.UndefOr[KeyName]
  }

  object S3Location {
    def apply(
        bucket: js.UndefOr[BucketName] = js.undefined,
        key: js.UndefOr[KeyName] = js.undefined
    ): S3Location = {
      val __obj = js.Dictionary.empty[js.Any]
      bucket.foreach(__v => __obj.update("bucket", __v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.update("key", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /**
    * Represents a server.
    */
  @js.native
  trait Server extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated]
    var serverId: js.UndefOr[ServerId]
    var serverType: js.UndefOr[ServerType]
    var vmServer: js.UndefOr[VmServer]
  }

  object Server {
    def apply(
        replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
        replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.undefined,
        serverId: js.UndefOr[ServerId] = js.undefined,
        serverType: js.UndefOr[ServerType] = js.undefined,
        vmServer: js.UndefOr[VmServer] = js.undefined
    ): Server = {
      val __obj = js.Dictionary.empty[js.Any]
      replicationJobId.foreach(__v => __obj.update("replicationJobId", __v.asInstanceOf[js.Any]))
      replicationJobTerminated.foreach(__v => __obj.update("replicationJobTerminated", __v.asInstanceOf[js.Any]))
      serverId.foreach(__v => __obj.update("serverId", __v.asInstanceOf[js.Any]))
      serverType.foreach(__v => __obj.update("serverType", __v.asInstanceOf[js.Any]))
      vmServer.foreach(__v => __obj.update("vmServer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Server]
    }
  }

  object ServerCatalogStatusEnum {
    val NOT_IMPORTED = "NOT_IMPORTED"
    val IMPORTING    = "IMPORTING"
    val AVAILABLE    = "AVAILABLE"
    val DELETED      = "DELETED"
    val EXPIRED      = "EXPIRED"

    val values = IndexedSeq(NOT_IMPORTED, IMPORTING, AVAILABLE, DELETED, EXPIRED)
  }

  /**
    * A logical grouping of servers.
    */
  @js.native
  trait ServerGroup extends js.Object {
    var name: js.UndefOr[ServerGroupName]
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverList: js.UndefOr[ServerList]
  }

  object ServerGroup {
    def apply(
        name: js.UndefOr[ServerGroupName] = js.undefined,
        serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
        serverList: js.UndefOr[ServerList] = js.undefined
    ): ServerGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      serverGroupId.foreach(__v => __obj.update("serverGroupId", __v.asInstanceOf[js.Any]))
      serverList.foreach(__v => __obj.update("serverList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerGroup]
    }
  }

  /**
    * Launch configuration for a server group.
    */
  @js.native
  trait ServerGroupLaunchConfiguration extends js.Object {
    var launchOrder: js.UndefOr[LaunchOrder]
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations]
  }

  object ServerGroupLaunchConfiguration {
    def apply(
        launchOrder: js.UndefOr[LaunchOrder] = js.undefined,
        serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
        serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.undefined
    ): ServerGroupLaunchConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      launchOrder.foreach(__v => __obj.update("launchOrder", __v.asInstanceOf[js.Any]))
      serverGroupId.foreach(__v => __obj.update("serverGroupId", __v.asInstanceOf[js.Any]))
      serverLaunchConfigurations.foreach(__v => __obj.update("serverLaunchConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerGroupLaunchConfiguration]
    }
  }

  /**
    * Replication configuration for a server group.
    */
  @js.native
  trait ServerGroupReplicationConfiguration extends js.Object {
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations]
  }

  object ServerGroupReplicationConfiguration {
    def apply(
        serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
        serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.undefined
    ): ServerGroupReplicationConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      serverGroupId.foreach(__v => __obj.update("serverGroupId", __v.asInstanceOf[js.Any]))
      serverReplicationConfigurations.foreach(
        __v => __obj.update("serverReplicationConfigurations", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ServerGroupReplicationConfiguration]
    }
  }

  /**
    * Launch configuration for a server.
    */
  @js.native
  trait ServerLaunchConfiguration extends js.Object {
    var associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress]
    var ec2KeyName: js.UndefOr[EC2KeyName]
    var instanceType: js.UndefOr[InstanceType]
    var logicalId: js.UndefOr[LogicalId]
    var securityGroup: js.UndefOr[SecurityGroup]
    var server: js.UndefOr[Server]
    var subnet: js.UndefOr[Subnet]
    var userData: js.UndefOr[UserData]
    var vpc: js.UndefOr[VPC]
  }

  object ServerLaunchConfiguration {
    def apply(
        associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
        ec2KeyName: js.UndefOr[EC2KeyName] = js.undefined,
        instanceType: js.UndefOr[InstanceType] = js.undefined,
        logicalId: js.UndefOr[LogicalId] = js.undefined,
        securityGroup: js.UndefOr[SecurityGroup] = js.undefined,
        server: js.UndefOr[Server] = js.undefined,
        subnet: js.UndefOr[Subnet] = js.undefined,
        userData: js.UndefOr[UserData] = js.undefined,
        vpc: js.UndefOr[VPC] = js.undefined
    ): ServerLaunchConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      associatePublicIpAddress.foreach(__v => __obj.update("associatePublicIpAddress", __v.asInstanceOf[js.Any]))
      ec2KeyName.foreach(__v => __obj.update("ec2KeyName", __v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.update("instanceType", __v.asInstanceOf[js.Any]))
      logicalId.foreach(__v => __obj.update("logicalId", __v.asInstanceOf[js.Any]))
      securityGroup.foreach(__v => __obj.update("securityGroup", __v.asInstanceOf[js.Any]))
      server.foreach(__v => __obj.update("server", __v.asInstanceOf[js.Any]))
      subnet.foreach(__v => __obj.update("subnet", __v.asInstanceOf[js.Any]))
      userData.foreach(__v => __obj.update("userData", __v.asInstanceOf[js.Any]))
      vpc.foreach(__v => __obj.update("vpc", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerLaunchConfiguration]
    }
  }

  /**
    * Replication configuration of a server.
    */
  @js.native
  trait ServerReplicationConfiguration extends js.Object {
    var server: js.UndefOr[Server]
    var serverReplicationParameters: js.UndefOr[ServerReplicationParameters]
  }

  object ServerReplicationConfiguration {
    def apply(
        server: js.UndefOr[Server] = js.undefined,
        serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.undefined
    ): ServerReplicationConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      server.foreach(__v => __obj.update("server", __v.asInstanceOf[js.Any]))
      serverReplicationParameters.foreach(__v => __obj.update("serverReplicationParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerReplicationConfiguration]
    }
  }

  /**
    * Replication parameters for replicating a server.
    */
  @js.native
  trait ServerReplicationParameters extends js.Object {
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var licenseType: js.UndefOr[LicenseType]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var runOnce: js.UndefOr[RunOnce]
    var seedTime: js.UndefOr[Timestamp]
  }

  object ServerReplicationParameters {
    def apply(
        encrypted: js.UndefOr[Encrypted] = js.undefined,
        frequency: js.UndefOr[Frequency] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        licenseType: js.UndefOr[LicenseType] = js.undefined,
        numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
        runOnce: js.UndefOr[RunOnce] = js.undefined,
        seedTime: js.UndefOr[Timestamp] = js.undefined
    ): ServerReplicationParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      encrypted.foreach(__v => __obj.update("encrypted", __v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.update("frequency", __v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.update("kmsKeyId", __v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.update("licenseType", __v.asInstanceOf[js.Any]))
      numberOfRecentAmisToKeep.foreach(__v => __obj.update("numberOfRecentAmisToKeep", __v.asInstanceOf[js.Any]))
      runOnce.foreach(__v => __obj.update("runOnce", __v.asInstanceOf[js.Any]))
      seedTime.foreach(__v => __obj.update("seedTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerReplicationParameters]
    }
  }

  object ServerTypeEnum {
    val VIRTUAL_MACHINE = "VIRTUAL_MACHINE"

    val values = IndexedSeq(VIRTUAL_MACHINE)
  }

  @js.native
  trait StartAppReplicationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object StartAppReplicationRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): StartAppReplicationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAppReplicationRequest]
    }
  }

  @js.native
  trait StartAppReplicationResponse extends js.Object {}

  object StartAppReplicationResponse {
    def apply(
        ): StartAppReplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StartAppReplicationResponse]
    }
  }

  @js.native
  trait StartOnDemandReplicationRunRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var description: js.UndefOr[Description]
  }

  object StartOnDemandReplicationRunRequest {
    def apply(
        replicationJobId: ReplicationJobId,
        description: js.UndefOr[Description] = js.undefined
    ): StartOnDemandReplicationRunRequest = {
      val __obj = js.Dictionary[js.Any](
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOnDemandReplicationRunRequest]
    }
  }

  @js.native
  trait StartOnDemandReplicationRunResponse extends js.Object {
    var replicationRunId: js.UndefOr[ReplicationRunId]
  }

  object StartOnDemandReplicationRunResponse {
    def apply(
        replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
    ): StartOnDemandReplicationRunResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      replicationRunId.foreach(__v => __obj.update("replicationRunId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOnDemandReplicationRunResponse]
    }
  }

  @js.native
  trait StopAppReplicationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object StopAppReplicationRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): StopAppReplicationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopAppReplicationRequest]
    }
  }

  @js.native
  trait StopAppReplicationResponse extends js.Object {}

  object StopAppReplicationResponse {
    def apply(
        ): StopAppReplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopAppReplicationResponse]
    }
  }

  /**
    * A label that can be assigned to an application.
    */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      key.foreach(__v => __obj.update("key", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TerminateAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object TerminateAppRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): TerminateAppRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateAppRequest]
    }
  }

  @js.native
  trait TerminateAppResponse extends js.Object {}

  object TerminateAppResponse {
    def apply(
        ): TerminateAppResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TerminateAppResponse]
    }
  }

  @js.native
  trait UpdateAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var description: js.UndefOr[AppDescription]
    var name: js.UndefOr[AppName]
    var roleName: js.UndefOr[RoleName]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object UpdateAppRequest {
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        description: js.UndefOr[AppDescription] = js.undefined,
        name: js.UndefOr[AppName] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): UpdateAppRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      appId.foreach(__v => __obj.update("appId", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.update("roleName", __v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.update("serverGroups", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppRequest]
    }
  }

  @js.native
  trait UpdateAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  object UpdateAppResponse {
    def apply(
        appSummary: js.UndefOr[AppSummary] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): UpdateAppResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      appSummary.foreach(__v => __obj.update("appSummary", __v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.update("serverGroups", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppResponse]
    }
  }

  @js.native
  trait UpdateReplicationJobRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var description: js.UndefOr[Description]
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var licenseType: js.UndefOr[LicenseType]
    var nextReplicationRunStartTime: js.UndefOr[Timestamp]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var roleName: js.UndefOr[RoleName]
  }

  object UpdateReplicationJobRequest {
    def apply(
        replicationJobId: ReplicationJobId,
        description: js.UndefOr[Description] = js.undefined,
        encrypted: js.UndefOr[Encrypted] = js.undefined,
        frequency: js.UndefOr[Frequency] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        licenseType: js.UndefOr[LicenseType] = js.undefined,
        nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined,
        numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined
    ): UpdateReplicationJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.update("encrypted", __v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.update("frequency", __v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.update("kmsKeyId", __v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.update("licenseType", __v.asInstanceOf[js.Any]))
      nextReplicationRunStartTime.foreach(__v => __obj.update("nextReplicationRunStartTime", __v.asInstanceOf[js.Any]))
      numberOfRecentAmisToKeep.foreach(__v => __obj.update("numberOfRecentAmisToKeep", __v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.update("roleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReplicationJobRequest]
    }
  }

  @js.native
  trait UpdateReplicationJobResponse extends js.Object {}

  object UpdateReplicationJobResponse {
    def apply(
        ): UpdateReplicationJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateReplicationJobResponse]
    }
  }

  /**
    * A script that runs on first launch of an Amazon EC2 instance. Used for configuring the server during launch.
    */
  @js.native
  trait UserData extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object UserData {
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): UserData = {
      val __obj = js.Dictionary.empty[js.Any]
      s3Location.foreach(__v => __obj.update("s3Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserData]
    }
  }

  object VmManagerTypeEnum {
    val VSPHERE          = "VSPHERE"
    val SCVMM            = "SCVMM"
    val `HYPERV-MANAGER` = "HYPERV-MANAGER"

    val values = IndexedSeq(VSPHERE, SCVMM, `HYPERV-MANAGER`)
  }

  /**
    * Represents a VM server.
    */
  @js.native
  trait VmServer extends js.Object {
    var vmManagerName: js.UndefOr[VmManagerName]
    var vmManagerType: js.UndefOr[VmManagerType]
    var vmName: js.UndefOr[VmName]
    var vmPath: js.UndefOr[VmPath]
    var vmServerAddress: js.UndefOr[VmServerAddress]
  }

  object VmServer {
    def apply(
        vmManagerName: js.UndefOr[VmManagerName] = js.undefined,
        vmManagerType: js.UndefOr[VmManagerType] = js.undefined,
        vmName: js.UndefOr[VmName] = js.undefined,
        vmPath: js.UndefOr[VmPath] = js.undefined,
        vmServerAddress: js.UndefOr[VmServerAddress] = js.undefined
    ): VmServer = {
      val __obj = js.Dictionary.empty[js.Any]
      vmManagerName.foreach(__v => __obj.update("vmManagerName", __v.asInstanceOf[js.Any]))
      vmManagerType.foreach(__v => __obj.update("vmManagerType", __v.asInstanceOf[js.Any]))
      vmName.foreach(__v => __obj.update("vmName", __v.asInstanceOf[js.Any]))
      vmPath.foreach(__v => __obj.update("vmPath", __v.asInstanceOf[js.Any]))
      vmServerAddress.foreach(__v => __obj.update("vmServerAddress", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VmServer]
    }
  }

  /**
    * Represents a VM server location.
    */
  @js.native
  trait VmServerAddress extends js.Object {
    var vmId: js.UndefOr[VmId]
    var vmManagerId: js.UndefOr[VmManagerId]
  }

  object VmServerAddress {
    def apply(
        vmId: js.UndefOr[VmId] = js.undefined,
        vmManagerId: js.UndefOr[VmManagerId] = js.undefined
    ): VmServerAddress = {
      val __obj = js.Dictionary.empty[js.Any]
      vmId.foreach(__v => __obj.update("vmId", __v.asInstanceOf[js.Any]))
      vmManagerId.foreach(__v => __obj.update("vmManagerId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VmServerAddress]
    }
  }
}
