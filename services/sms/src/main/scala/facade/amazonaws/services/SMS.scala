package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object sms {
  type AmiId                                = String
  type AppDescription                       = String
  type AppId                                = String
  type AppIds                               = js.Array[AppId]
  type AppLaunchStatusMessage               = String
  type AppName                              = String
  type AppReplicationStatusMessage          = String
  type AppStatusMessage                     = String
  type Apps                                 = js.Array[AppSummary]
  type AssociatePublicIpAddress             = Boolean
  type BucketName                           = String
  type ClientToken                          = String
  type ConnectorCapabilityList              = js.Array[ConnectorCapability]
  type ConnectorId                          = String
  type ConnectorList                        = js.Array[Connector]
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
  type LogicalId                            = String
  type MacAddress                           = String
  type MaxResults                           = Int
  type NextToken                            = String
  type NumberOfRecentAmisToKeep             = Int
  type ReplicationJobId                     = String
  type ReplicationJobList                   = js.Array[ReplicationJob]
  type ReplicationJobStatusMessage          = String
  type ReplicationJobTerminated             = Boolean
  type ReplicationRunId                     = String
  type ReplicationRunList                   = js.Array[ReplicationRun]
  type ReplicationRunStage                  = String
  type ReplicationRunStageProgress          = String
  type ReplicationRunStatusMessage          = String
  type RoleName                             = String
  type RunOnce                              = Boolean
  type SecurityGroup                        = String
  type ServerGroupId                        = String
  type ServerGroupLaunchConfigurations      = js.Array[ServerGroupLaunchConfiguration]
  type ServerGroupName                      = String
  type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]
  type ServerGroups                         = js.Array[ServerGroup]
  type ServerId                             = String
  type ServerLaunchConfigurations           = js.Array[ServerLaunchConfiguration]
  type ServerList                           = js.Array[Server]
  type ServerReplicationConfigurations      = js.Array[ServerReplicationConfiguration]
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
  type VmName                               = String
  type VmPath                               = String
  type VmServerAddressList                  = js.Array[VmServerAddress]

  implicit final class SMSOps(private val service: SMS) extends AnyVal {

    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] =
      service.createApp(params).promise().toFuture
    @inline def createReplicationJobFuture(params: CreateReplicationJobRequest): Future[CreateReplicationJobResponse] =
      service.createReplicationJob(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResponse] =
      service.deleteApp(params).promise().toFuture
    @inline def deleteAppLaunchConfigurationFuture(
        params: DeleteAppLaunchConfigurationRequest
    ): Future[DeleteAppLaunchConfigurationResponse] = service.deleteAppLaunchConfiguration(params).promise().toFuture
    @inline def deleteAppReplicationConfigurationFuture(
        params: DeleteAppReplicationConfigurationRequest
    ): Future[DeleteAppReplicationConfigurationResponse] =
      service.deleteAppReplicationConfiguration(params).promise().toFuture
    @inline def deleteReplicationJobFuture(params: DeleteReplicationJobRequest): Future[DeleteReplicationJobResponse] =
      service.deleteReplicationJob(params).promise().toFuture
    @inline def deleteServerCatalogFuture(params: DeleteServerCatalogRequest): Future[DeleteServerCatalogResponse] =
      service.deleteServerCatalog(params).promise().toFuture
    @inline def disassociateConnectorFuture(
        params: DisassociateConnectorRequest
    ): Future[DisassociateConnectorResponse] = service.disassociateConnector(params).promise().toFuture
    @inline def generateChangeSetFuture(params: GenerateChangeSetRequest): Future[GenerateChangeSetResponse] =
      service.generateChangeSet(params).promise().toFuture
    @inline def generateTemplateFuture(params: GenerateTemplateRequest): Future[GenerateTemplateResponse] =
      service.generateTemplate(params).promise().toFuture
    @inline def getAppFuture(params: GetAppRequest): Future[GetAppResponse] = service.getApp(params).promise().toFuture
    @inline def getAppLaunchConfigurationFuture(
        params: GetAppLaunchConfigurationRequest
    ): Future[GetAppLaunchConfigurationResponse] = service.getAppLaunchConfiguration(params).promise().toFuture
    @inline def getAppReplicationConfigurationFuture(
        params: GetAppReplicationConfigurationRequest
    ): Future[GetAppReplicationConfigurationResponse] =
      service.getAppReplicationConfiguration(params).promise().toFuture
    @inline def getConnectorsFuture(params: GetConnectorsRequest): Future[GetConnectorsResponse] =
      service.getConnectors(params).promise().toFuture
    @inline def getReplicationJobsFuture(params: GetReplicationJobsRequest): Future[GetReplicationJobsResponse] =
      service.getReplicationJobs(params).promise().toFuture
    @inline def getReplicationRunsFuture(params: GetReplicationRunsRequest): Future[GetReplicationRunsResponse] =
      service.getReplicationRuns(params).promise().toFuture
    @inline def getServersFuture(params: GetServersRequest): Future[GetServersResponse] =
      service.getServers(params).promise().toFuture
    @inline def importServerCatalogFuture(params: ImportServerCatalogRequest): Future[ImportServerCatalogResponse] =
      service.importServerCatalog(params).promise().toFuture
    @inline def launchAppFuture(params: LaunchAppRequest): Future[LaunchAppResponse] =
      service.launchApp(params).promise().toFuture
    @inline def listAppsFuture(params: ListAppsRequest): Future[ListAppsResponse] =
      service.listApps(params).promise().toFuture
    @inline def putAppLaunchConfigurationFuture(
        params: PutAppLaunchConfigurationRequest
    ): Future[PutAppLaunchConfigurationResponse] = service.putAppLaunchConfiguration(params).promise().toFuture
    @inline def putAppReplicationConfigurationFuture(
        params: PutAppReplicationConfigurationRequest
    ): Future[PutAppReplicationConfigurationResponse] =
      service.putAppReplicationConfiguration(params).promise().toFuture
    @inline def startAppReplicationFuture(params: StartAppReplicationRequest): Future[StartAppReplicationResponse] =
      service.startAppReplication(params).promise().toFuture
    @inline def startOnDemandReplicationRunFuture(
        params: StartOnDemandReplicationRunRequest
    ): Future[StartOnDemandReplicationRunResponse] = service.startOnDemandReplicationRun(params).promise().toFuture
    @inline def stopAppReplicationFuture(params: StopAppReplicationRequest): Future[StopAppReplicationResponse] =
      service.stopAppReplication(params).promise().toFuture
    @inline def terminateAppFuture(params: TerminateAppRequest): Future[TerminateAppResponse] =
      service.terminateApp(params).promise().toFuture
    @inline def updateAppFuture(params: UpdateAppRequest): Future[UpdateAppResponse] =
      service.updateApp(params).promise().toFuture
    @inline def updateReplicationJobFuture(params: UpdateReplicationJobRequest): Future[UpdateReplicationJobResponse] =
      service.updateReplicationJob(params).promise().toFuture
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

  @js.native
  sealed trait AppLaunchStatus extends js.Any
  object AppLaunchStatus extends js.Object {
    val READY_FOR_CONFIGURATION   = "READY_FOR_CONFIGURATION".asInstanceOf[AppLaunchStatus]
    val CONFIGURATION_IN_PROGRESS = "CONFIGURATION_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
    val CONFIGURATION_INVALID     = "CONFIGURATION_INVALID".asInstanceOf[AppLaunchStatus]
    val READY_FOR_LAUNCH          = "READY_FOR_LAUNCH".asInstanceOf[AppLaunchStatus]
    val VALIDATION_IN_PROGRESS    = "VALIDATION_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
    val LAUNCH_PENDING            = "LAUNCH_PENDING".asInstanceOf[AppLaunchStatus]
    val LAUNCH_IN_PROGRESS        = "LAUNCH_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
    val LAUNCHED                  = "LAUNCHED".asInstanceOf[AppLaunchStatus]
    val DELTA_LAUNCH_IN_PROGRESS  = "DELTA_LAUNCH_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
    val DELTA_LAUNCH_FAILED       = "DELTA_LAUNCH_FAILED".asInstanceOf[AppLaunchStatus]
    val LAUNCH_FAILED             = "LAUNCH_FAILED".asInstanceOf[AppLaunchStatus]
    val TERMINATE_IN_PROGRESS     = "TERMINATE_IN_PROGRESS".asInstanceOf[AppLaunchStatus]
    val TERMINATE_FAILED          = "TERMINATE_FAILED".asInstanceOf[AppLaunchStatus]
    val TERMINATED                = "TERMINATED".asInstanceOf[AppLaunchStatus]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  sealed trait AppReplicationStatus extends js.Any
  object AppReplicationStatus extends js.Object {
    val READY_FOR_CONFIGURATION       = "READY_FOR_CONFIGURATION".asInstanceOf[AppReplicationStatus]
    val CONFIGURATION_IN_PROGRESS     = "CONFIGURATION_IN_PROGRESS".asInstanceOf[AppReplicationStatus]
    val CONFIGURATION_INVALID         = "CONFIGURATION_INVALID".asInstanceOf[AppReplicationStatus]
    val READY_FOR_REPLICATION         = "READY_FOR_REPLICATION".asInstanceOf[AppReplicationStatus]
    val VALIDATION_IN_PROGRESS        = "VALIDATION_IN_PROGRESS".asInstanceOf[AppReplicationStatus]
    val REPLICATION_PENDING           = "REPLICATION_PENDING".asInstanceOf[AppReplicationStatus]
    val REPLICATION_IN_PROGRESS       = "REPLICATION_IN_PROGRESS".asInstanceOf[AppReplicationStatus]
    val REPLICATED                    = "REPLICATED".asInstanceOf[AppReplicationStatus]
    val DELTA_REPLICATION_IN_PROGRESS = "DELTA_REPLICATION_IN_PROGRESS".asInstanceOf[AppReplicationStatus]
    val DELTA_REPLICATED              = "DELTA_REPLICATED".asInstanceOf[AppReplicationStatus]
    val DELTA_REPLICATION_FAILED      = "DELTA_REPLICATION_FAILED".asInstanceOf[AppReplicationStatus]
    val REPLICATION_FAILED            = "REPLICATION_FAILED".asInstanceOf[AppReplicationStatus]
    val REPLICATION_STOPPING          = "REPLICATION_STOPPING".asInstanceOf[AppReplicationStatus]
    val REPLICATION_STOP_FAILED       = "REPLICATION_STOP_FAILED".asInstanceOf[AppReplicationStatus]
    val REPLICATION_STOPPED           = "REPLICATION_STOPPED".asInstanceOf[AppReplicationStatus]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  sealed trait AppStatus extends js.Any
  object AppStatus extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[AppStatus]
    val ACTIVE        = "ACTIVE".asInstanceOf[AppStatus]
    val UPDATING      = "UPDATING".asInstanceOf[AppStatus]
    val DELETING      = "DELETING".asInstanceOf[AppStatus]
    val DELETED       = "DELETED".asInstanceOf[AppStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[AppStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, UPDATING, DELETING, DELETED, DELETE_FAILED))
  }

  /**
    * Information about the application.
    */
  @js.native
  @Factory
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

  /**
    * Represents a connector.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ConnectorCapability extends js.Any
  object ConnectorCapability extends js.Object {
    val VSPHERE           = "VSPHERE".asInstanceOf[ConnectorCapability]
    val SCVMM             = "SCVMM".asInstanceOf[ConnectorCapability]
    val `HYPERV-MANAGER`  = "HYPERV-MANAGER".asInstanceOf[ConnectorCapability]
    val SNAPSHOT_BATCHING = "SNAPSHOT_BATCHING".asInstanceOf[ConnectorCapability]

    val values = js.Object.freeze(js.Array(VSPHERE, SCVMM, `HYPERV-MANAGER`, SNAPSHOT_BATCHING))
  }

  @js.native
  sealed trait ConnectorStatus extends js.Any
  object ConnectorStatus extends js.Object {
    val HEALTHY   = "HEALTHY".asInstanceOf[ConnectorStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[ConnectorStatus]

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY))
  }

  @js.native
  @Factory
  trait CreateAppRequest extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[AppDescription]
    var name: js.UndefOr[AppName]
    var roleName: js.UndefOr[RoleName]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateReplicationJobResponse extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  @js.native
  @Factory
  trait DeleteAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait DeleteAppLaunchConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait DeleteAppReplicationConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var forceStopAppReplication: js.UndefOr[ForceStopAppReplication]
    var forceTerminateApp: js.UndefOr[ForceTerminateApp]
  }

  @js.native
  @Factory
  trait DeleteAppResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteReplicationJobRequest extends js.Object {
    var replicationJobId: ReplicationJobId
  }

  @js.native
  @Factory
  trait DeleteReplicationJobResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteServerCatalogRequest extends js.Object {}

  @js.native
  @Factory
  trait DeleteServerCatalogResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateConnectorRequest extends js.Object {
    var connectorId: ConnectorId
  }

  @js.native
  @Factory
  trait DisassociateConnectorResponse extends js.Object {}

  @js.native
  @Factory
  trait GenerateChangeSetRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var changesetFormat: js.UndefOr[OutputFormat]
  }

  @js.native
  @Factory
  trait GenerateChangeSetResponse extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  @js.native
  @Factory
  trait GenerateTemplateRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var templateFormat: js.UndefOr[OutputFormat]
  }

  @js.native
  @Factory
  trait GenerateTemplateResponse extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  @js.native
  @Factory
  trait GetAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait GetAppLaunchConfigurationResponse extends js.Object {
    var appId: js.UndefOr[AppId]
    var roleName: js.UndefOr[RoleName]
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations]
  }

  @js.native
  @Factory
  trait GetAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait GetAppReplicationConfigurationResponse extends js.Object {
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations]
  }

  @js.native
  @Factory
  trait GetAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait GetAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait GetConnectorsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetConnectorsResponse extends js.Object {
    var connectorList: js.UndefOr[ConnectorList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetReplicationJobsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  @js.native
  @Factory
  trait GetReplicationJobsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var replicationJobList: js.UndefOr[ReplicationJobList]
  }

  @js.native
  @Factory
  trait GetReplicationRunsRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetReplicationRunsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var replicationJob: js.UndefOr[ReplicationJob]
    var replicationRunList: js.UndefOr[ReplicationRunList]
  }

  @js.native
  @Factory
  trait GetServersRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var vmServerAddressList: js.UndefOr[VmServerAddressList]
  }

  @js.native
  @Factory
  trait GetServersResponse extends js.Object {
    var lastModifiedOn: js.UndefOr[Timestamp]
    var nextToken: js.UndefOr[NextToken]
    var serverCatalogStatus: js.UndefOr[ServerCatalogStatus]
    var serverList: js.UndefOr[ServerList]
  }

  @js.native
  @Factory
  trait ImportServerCatalogRequest extends js.Object {}

  @js.native
  @Factory
  trait ImportServerCatalogResponse extends js.Object {}

  @js.native
  @Factory
  trait LaunchAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait LaunchAppResponse extends js.Object {}

  /**
    * Details about the latest launch of an application.
    */
  @js.native
  @Factory
  trait LaunchDetails extends js.Object {
    var latestLaunchTime: js.UndefOr[Timestamp]
    var stackId: js.UndefOr[StackId]
    var stackName: js.UndefOr[StackName]
  }

  @js.native
  sealed trait LicenseType extends js.Any
  object LicenseType extends js.Object {
    val AWS  = "AWS".asInstanceOf[LicenseType]
    val BYOL = "BYOL".asInstanceOf[LicenseType]

    val values = js.Object.freeze(js.Array(AWS, BYOL))
  }

  @js.native
  @Factory
  trait ListAppsRequest extends js.Object {
    var appIds: js.UndefOr[AppIds]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAppsResponse extends js.Object {
    var apps: js.UndefOr[Apps]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  sealed trait OutputFormat extends js.Any
  object OutputFormat extends js.Object {
    val JSON = "JSON".asInstanceOf[OutputFormat]
    val YAML = "YAML".asInstanceOf[OutputFormat]

    val values = js.Object.freeze(js.Array(JSON, YAML))
  }

  @js.native
  @Factory
  trait PutAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var roleName: js.UndefOr[RoleName]
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations]
  }

  @js.native
  @Factory
  trait PutAppLaunchConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait PutAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations]
  }

  @js.native
  @Factory
  trait PutAppReplicationConfigurationResponse extends js.Object {}

  /**
    * Represents a replication job.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ReplicationJobState extends js.Any
  object ReplicationJobState extends js.Object {
    val PENDING           = "PENDING".asInstanceOf[ReplicationJobState]
    val ACTIVE            = "ACTIVE".asInstanceOf[ReplicationJobState]
    val FAILED            = "FAILED".asInstanceOf[ReplicationJobState]
    val DELETING          = "DELETING".asInstanceOf[ReplicationJobState]
    val DELETED           = "DELETED".asInstanceOf[ReplicationJobState]
    val COMPLETED         = "COMPLETED".asInstanceOf[ReplicationJobState]
    val PAUSED_ON_FAILURE = "PAUSED_ON_FAILURE".asInstanceOf[ReplicationJobState]
    val FAILING           = "FAILING".asInstanceOf[ReplicationJobState]

    val values =
      js.Object.freeze(js.Array(PENDING, ACTIVE, FAILED, DELETING, DELETED, COMPLETED, PAUSED_ON_FAILURE, FAILING))
  }

  /**
    * Represents a replication run.
    */
  @js.native
  @Factory
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

  /**
    * Details of the current stage of a replication run.
    */
  @js.native
  @Factory
  trait ReplicationRunStageDetails extends js.Object {
    var stage: js.UndefOr[ReplicationRunStage]
    var stageProgress: js.UndefOr[ReplicationRunStageProgress]
  }

  @js.native
  sealed trait ReplicationRunState extends js.Any
  object ReplicationRunState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[ReplicationRunState]
    val MISSED    = "MISSED".asInstanceOf[ReplicationRunState]
    val ACTIVE    = "ACTIVE".asInstanceOf[ReplicationRunState]
    val FAILED    = "FAILED".asInstanceOf[ReplicationRunState]
    val COMPLETED = "COMPLETED".asInstanceOf[ReplicationRunState]
    val DELETING  = "DELETING".asInstanceOf[ReplicationRunState]
    val DELETED   = "DELETED".asInstanceOf[ReplicationRunState]

    val values = js.Object.freeze(js.Array(PENDING, MISSED, ACTIVE, FAILED, COMPLETED, DELETING, DELETED))
  }

  @js.native
  sealed trait ReplicationRunType extends js.Any
  object ReplicationRunType extends js.Object {
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[ReplicationRunType]
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[ReplicationRunType]

    val values = js.Object.freeze(js.Array(ON_DEMAND, AUTOMATIC))
  }

  /**
    * Location of the Amazon S3 object in the customer's account.
    */
  @js.native
  @Factory
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[BucketName]
    var key: js.UndefOr[KeyName]
  }

  /**
    * Represents a server.
    */
  @js.native
  @Factory
  trait Server extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated]
    var serverId: js.UndefOr[ServerId]
    var serverType: js.UndefOr[ServerType]
    var vmServer: js.UndefOr[VmServer]
  }

  @js.native
  sealed trait ServerCatalogStatus extends js.Any
  object ServerCatalogStatus extends js.Object {
    val NOT_IMPORTED = "NOT_IMPORTED".asInstanceOf[ServerCatalogStatus]
    val IMPORTING    = "IMPORTING".asInstanceOf[ServerCatalogStatus]
    val AVAILABLE    = "AVAILABLE".asInstanceOf[ServerCatalogStatus]
    val DELETED      = "DELETED".asInstanceOf[ServerCatalogStatus]
    val EXPIRED      = "EXPIRED".asInstanceOf[ServerCatalogStatus]

    val values = js.Object.freeze(js.Array(NOT_IMPORTED, IMPORTING, AVAILABLE, DELETED, EXPIRED))
  }

  /**
    * A logical grouping of servers.
    */
  @js.native
  @Factory
  trait ServerGroup extends js.Object {
    var name: js.UndefOr[ServerGroupName]
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverList: js.UndefOr[ServerList]
  }

  /**
    * Launch configuration for a server group.
    */
  @js.native
  @Factory
  trait ServerGroupLaunchConfiguration extends js.Object {
    var launchOrder: js.UndefOr[LaunchOrder]
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations]
  }

  /**
    * Replication configuration for a server group.
    */
  @js.native
  @Factory
  trait ServerGroupReplicationConfiguration extends js.Object {
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations]
  }

  /**
    * Launch configuration for a server.
    */
  @js.native
  @Factory
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

  /**
    * Replication configuration of a server.
    */
  @js.native
  @Factory
  trait ServerReplicationConfiguration extends js.Object {
    var server: js.UndefOr[Server]
    var serverReplicationParameters: js.UndefOr[ServerReplicationParameters]
  }

  /**
    * Replication parameters for replicating a server.
    */
  @js.native
  @Factory
  trait ServerReplicationParameters extends js.Object {
    var encrypted: js.UndefOr[Encrypted]
    var frequency: js.UndefOr[Frequency]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var licenseType: js.UndefOr[LicenseType]
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep]
    var runOnce: js.UndefOr[RunOnce]
    var seedTime: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait ServerType extends js.Any
  object ServerType extends js.Object {
    val VIRTUAL_MACHINE = "VIRTUAL_MACHINE".asInstanceOf[ServerType]

    val values = js.Object.freeze(js.Array(VIRTUAL_MACHINE))
  }

  @js.native
  @Factory
  trait StartAppReplicationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait StartAppReplicationResponse extends js.Object {}

  @js.native
  @Factory
  trait StartOnDemandReplicationRunRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var description: js.UndefOr[Description]
  }

  @js.native
  @Factory
  trait StartOnDemandReplicationRunResponse extends js.Object {
    var replicationRunId: js.UndefOr[ReplicationRunId]
  }

  @js.native
  @Factory
  trait StopAppReplicationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait StopAppReplicationResponse extends js.Object {}

  /**
    * A label that can be assigned to an application.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TerminateAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  @js.native
  @Factory
  trait TerminateAppResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var description: js.UndefOr[AppDescription]
    var name: js.UndefOr[AppName]
    var roleName: js.UndefOr[RoleName]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait UpdateAppResponse extends js.Object {
    var appSummary: js.UndefOr[AppSummary]
    var serverGroups: js.UndefOr[ServerGroups]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateReplicationJobResponse extends js.Object {}

  /**
    * A script that runs on first launch of an Amazon EC2 instance. Used for configuring the server during launch.
    */
  @js.native
  @Factory
  trait UserData extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  @js.native
  sealed trait VmManagerType extends js.Any
  object VmManagerType extends js.Object {
    val VSPHERE          = "VSPHERE".asInstanceOf[VmManagerType]
    val SCVMM            = "SCVMM".asInstanceOf[VmManagerType]
    val `HYPERV-MANAGER` = "HYPERV-MANAGER".asInstanceOf[VmManagerType]

    val values = js.Object.freeze(js.Array(VSPHERE, SCVMM, `HYPERV-MANAGER`))
  }

  /**
    * Represents a VM server.
    */
  @js.native
  @Factory
  trait VmServer extends js.Object {
    var vmManagerName: js.UndefOr[VmManagerName]
    var vmManagerType: js.UndefOr[VmManagerType]
    var vmName: js.UndefOr[VmName]
    var vmPath: js.UndefOr[VmPath]
    var vmServerAddress: js.UndefOr[VmServerAddress]
  }

  /**
    * Represents a VM server location.
    */
  @js.native
  @Factory
  trait VmServerAddress extends js.Object {
    var vmId: js.UndefOr[VmId]
    var vmManagerId: js.UndefOr[VmManagerId]
  }
}
