package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object sms {
  type AmiId = String
  type AppDescription = String
  type AppId = String
  type AppIdWithValidation = String
  type AppIds = js.Array[AppId]
  type AppLaunchStatusMessage = String
  type AppName = String
  type AppReplicationStatusMessage = String
  type AppStatusMessage = String
  type AppValidationConfigurations = js.Array[AppValidationConfiguration]
  type Apps = js.Array[AppSummary]
  type AssociatePublicIpAddress = Boolean
  type AutoLaunch = Boolean
  type BucketName = String
  type ClientToken = String
  type Command = String
  type ConnectorCapabilityList = js.Array[ConnectorCapability]
  type ConnectorId = String
  type ConnectorList = js.Array[Connector]
  type ConnectorVersion = String
  type Description = String
  type EC2KeyName = String
  type Encrypted = Boolean
  type ExecutionTimeoutSeconds = Int
  type ForceStopAppReplication = Boolean
  type ForceTerminateApp = Boolean
  type Frequency = Int
  type ImportedAppId = String
  type InstanceId = String
  type InstanceType = String
  type IpAddress = String
  type KmsKeyId = String
  type LaunchOrder = Int
  type LogicalId = String
  type MacAddress = String
  type MaxResults = Int
  type NextToken = String
  type NonEmptyStringWithMaxLen255 = String
  type NumberOfRecentAmisToKeep = Int
  type ReplicationJobId = String
  type ReplicationJobList = js.Array[ReplicationJob]
  type ReplicationJobStatusMessage = String
  type ReplicationJobTerminated = Boolean
  type ReplicationRunId = String
  type ReplicationRunList = js.Array[ReplicationRun]
  type ReplicationRunStage = String
  type ReplicationRunStageProgress = String
  type ReplicationRunStatusMessage = String
  type RoleName = String
  type RunOnce = Boolean
  type S3BucketName = String
  type S3KeyName = String
  type SecurityGroup = String
  type ServerGroupId = String
  type ServerGroupLaunchConfigurations = js.Array[ServerGroupLaunchConfiguration]
  type ServerGroupName = String
  type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]
  type ServerGroupValidationConfigurations = js.Array[ServerGroupValidationConfiguration]
  type ServerGroups = js.Array[ServerGroup]
  type ServerId = String
  type ServerLaunchConfigurations = js.Array[ServerLaunchConfiguration]
  type ServerList = js.Array[Server]
  type ServerReplicationConfigurations = js.Array[ServerReplicationConfiguration]
  type ServerValidationConfigurations = js.Array[ServerValidationConfiguration]
  type StackId = String
  type StackName = String
  type Subnet = String
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type Timestamp = js.Date
  type TotalServerGroups = Int
  type TotalServers = Int
  type VPC = String
  type ValidationId = String
  type ValidationOutputList = js.Array[ValidationOutput]
  type ValidationStatusMessage = String
  type VmId = String
  type VmManagerId = String
  type VmManagerName = String
  type VmName = String
  type VmPath = String
  type VmServerAddressList = js.Array[VmServerAddress]

  final class SMSOps(private val service: SMS) extends AnyVal {

    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] = service.createApp(params).promise().toFuture
    @inline def createReplicationJobFuture(params: CreateReplicationJobRequest): Future[CreateReplicationJobResponse] = service.createReplicationJob(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResponse] = service.deleteApp(params).promise().toFuture
    @inline def deleteAppLaunchConfigurationFuture(params: DeleteAppLaunchConfigurationRequest): Future[DeleteAppLaunchConfigurationResponse] = service.deleteAppLaunchConfiguration(params).promise().toFuture
    @inline def deleteAppReplicationConfigurationFuture(params: DeleteAppReplicationConfigurationRequest): Future[DeleteAppReplicationConfigurationResponse] = service.deleteAppReplicationConfiguration(params).promise().toFuture
    @inline def deleteAppValidationConfigurationFuture(params: DeleteAppValidationConfigurationRequest): Future[DeleteAppValidationConfigurationResponse] = service.deleteAppValidationConfiguration(params).promise().toFuture
    @inline def deleteReplicationJobFuture(params: DeleteReplicationJobRequest): Future[DeleteReplicationJobResponse] = service.deleteReplicationJob(params).promise().toFuture
    @inline def deleteServerCatalogFuture(params: DeleteServerCatalogRequest): Future[DeleteServerCatalogResponse] = service.deleteServerCatalog(params).promise().toFuture
    @inline def disassociateConnectorFuture(params: DisassociateConnectorRequest): Future[DisassociateConnectorResponse] = service.disassociateConnector(params).promise().toFuture
    @inline def generateChangeSetFuture(params: GenerateChangeSetRequest): Future[GenerateChangeSetResponse] = service.generateChangeSet(params).promise().toFuture
    @inline def generateTemplateFuture(params: GenerateTemplateRequest): Future[GenerateTemplateResponse] = service.generateTemplate(params).promise().toFuture
    @inline def getAppFuture(params: GetAppRequest): Future[GetAppResponse] = service.getApp(params).promise().toFuture
    @inline def getAppLaunchConfigurationFuture(params: GetAppLaunchConfigurationRequest): Future[GetAppLaunchConfigurationResponse] = service.getAppLaunchConfiguration(params).promise().toFuture
    @inline def getAppReplicationConfigurationFuture(params: GetAppReplicationConfigurationRequest): Future[GetAppReplicationConfigurationResponse] = service.getAppReplicationConfiguration(params).promise().toFuture
    @inline def getAppValidationConfigurationFuture(params: GetAppValidationConfigurationRequest): Future[GetAppValidationConfigurationResponse] = service.getAppValidationConfiguration(params).promise().toFuture
    @inline def getAppValidationOutputFuture(params: GetAppValidationOutputRequest): Future[GetAppValidationOutputResponse] = service.getAppValidationOutput(params).promise().toFuture
    @inline def getConnectorsFuture(params: GetConnectorsRequest): Future[GetConnectorsResponse] = service.getConnectors(params).promise().toFuture
    @inline def getReplicationJobsFuture(params: GetReplicationJobsRequest): Future[GetReplicationJobsResponse] = service.getReplicationJobs(params).promise().toFuture
    @inline def getReplicationRunsFuture(params: GetReplicationRunsRequest): Future[GetReplicationRunsResponse] = service.getReplicationRuns(params).promise().toFuture
    @inline def getServersFuture(params: GetServersRequest): Future[GetServersResponse] = service.getServers(params).promise().toFuture
    @inline def importAppCatalogFuture(params: ImportAppCatalogRequest): Future[ImportAppCatalogResponse] = service.importAppCatalog(params).promise().toFuture
    @inline def importServerCatalogFuture(params: ImportServerCatalogRequest): Future[ImportServerCatalogResponse] = service.importServerCatalog(params).promise().toFuture
    @inline def launchAppFuture(params: LaunchAppRequest): Future[LaunchAppResponse] = service.launchApp(params).promise().toFuture
    @inline def listAppsFuture(params: ListAppsRequest): Future[ListAppsResponse] = service.listApps(params).promise().toFuture
    @inline def notifyAppValidationOutputFuture(params: NotifyAppValidationOutputRequest): Future[NotifyAppValidationOutputResponse] = service.notifyAppValidationOutput(params).promise().toFuture
    @inline def putAppLaunchConfigurationFuture(params: PutAppLaunchConfigurationRequest): Future[PutAppLaunchConfigurationResponse] = service.putAppLaunchConfiguration(params).promise().toFuture
    @inline def putAppReplicationConfigurationFuture(params: PutAppReplicationConfigurationRequest): Future[PutAppReplicationConfigurationResponse] = service.putAppReplicationConfiguration(params).promise().toFuture
    @inline def putAppValidationConfigurationFuture(params: PutAppValidationConfigurationRequest): Future[PutAppValidationConfigurationResponse] = service.putAppValidationConfiguration(params).promise().toFuture
    @inline def startAppReplicationFuture(params: StartAppReplicationRequest): Future[StartAppReplicationResponse] = service.startAppReplication(params).promise().toFuture
    @inline def startOnDemandAppReplicationFuture(params: StartOnDemandAppReplicationRequest): Future[StartOnDemandAppReplicationResponse] = service.startOnDemandAppReplication(params).promise().toFuture
    @inline def startOnDemandReplicationRunFuture(params: StartOnDemandReplicationRunRequest): Future[StartOnDemandReplicationRunResponse] = service.startOnDemandReplicationRun(params).promise().toFuture
    @inline def stopAppReplicationFuture(params: StopAppReplicationRequest): Future[StopAppReplicationResponse] = service.stopAppReplication(params).promise().toFuture
    @inline def terminateAppFuture(params: TerminateAppRequest): Future[TerminateAppResponse] = service.terminateApp(params).promise().toFuture
    @inline def updateAppFuture(params: UpdateAppRequest): Future[UpdateAppResponse] = service.updateApp(params).promise().toFuture
    @inline def updateReplicationJobFuture(params: UpdateReplicationJobRequest): Future[UpdateReplicationJobResponse] = service.updateReplicationJob(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sms", JSImport.Namespace, "AWS.SMS")
  class SMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResponse] = js.native
    def createReplicationJob(params: CreateReplicationJobRequest): Request[CreateReplicationJobResponse] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse] = js.native
    def deleteAppLaunchConfiguration(params: DeleteAppLaunchConfigurationRequest): Request[DeleteAppLaunchConfigurationResponse] = js.native
    def deleteAppReplicationConfiguration(params: DeleteAppReplicationConfigurationRequest): Request[DeleteAppReplicationConfigurationResponse] = js.native
    def deleteAppValidationConfiguration(params: DeleteAppValidationConfigurationRequest): Request[DeleteAppValidationConfigurationResponse] = js.native
    def deleteReplicationJob(params: DeleteReplicationJobRequest): Request[DeleteReplicationJobResponse] = js.native
    def deleteServerCatalog(params: DeleteServerCatalogRequest): Request[DeleteServerCatalogResponse] = js.native
    def disassociateConnector(params: DisassociateConnectorRequest): Request[DisassociateConnectorResponse] = js.native
    def generateChangeSet(params: GenerateChangeSetRequest): Request[GenerateChangeSetResponse] = js.native
    def generateTemplate(params: GenerateTemplateRequest): Request[GenerateTemplateResponse] = js.native
    def getApp(params: GetAppRequest): Request[GetAppResponse] = js.native
    def getAppLaunchConfiguration(params: GetAppLaunchConfigurationRequest): Request[GetAppLaunchConfigurationResponse] = js.native
    def getAppReplicationConfiguration(params: GetAppReplicationConfigurationRequest): Request[GetAppReplicationConfigurationResponse] = js.native
    def getAppValidationConfiguration(params: GetAppValidationConfigurationRequest): Request[GetAppValidationConfigurationResponse] = js.native
    def getAppValidationOutput(params: GetAppValidationOutputRequest): Request[GetAppValidationOutputResponse] = js.native
    def getConnectors(params: GetConnectorsRequest): Request[GetConnectorsResponse] = js.native
    def getReplicationJobs(params: GetReplicationJobsRequest): Request[GetReplicationJobsResponse] = js.native
    def getReplicationRuns(params: GetReplicationRunsRequest): Request[GetReplicationRunsResponse] = js.native
    def getServers(params: GetServersRequest): Request[GetServersResponse] = js.native
    def importAppCatalog(params: ImportAppCatalogRequest): Request[ImportAppCatalogResponse] = js.native
    def importServerCatalog(params: ImportServerCatalogRequest): Request[ImportServerCatalogResponse] = js.native
    def launchApp(params: LaunchAppRequest): Request[LaunchAppResponse] = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResponse] = js.native
    def notifyAppValidationOutput(params: NotifyAppValidationOutputRequest): Request[NotifyAppValidationOutputResponse] = js.native
    def putAppLaunchConfiguration(params: PutAppLaunchConfigurationRequest): Request[PutAppLaunchConfigurationResponse] = js.native
    def putAppReplicationConfiguration(params: PutAppReplicationConfigurationRequest): Request[PutAppReplicationConfigurationResponse] = js.native
    def putAppValidationConfiguration(params: PutAppValidationConfigurationRequest): Request[PutAppValidationConfigurationResponse] = js.native
    def startAppReplication(params: StartAppReplicationRequest): Request[StartAppReplicationResponse] = js.native
    def startOnDemandAppReplication(params: StartOnDemandAppReplicationRequest): Request[StartOnDemandAppReplicationResponse] = js.native
    def startOnDemandReplicationRun(params: StartOnDemandReplicationRunRequest): Request[StartOnDemandReplicationRunResponse] = js.native
    def stopAppReplication(params: StopAppReplicationRequest): Request[StopAppReplicationResponse] = js.native
    def terminateApp(params: TerminateAppRequest): Request[TerminateAppResponse] = js.native
    def updateApp(params: UpdateAppRequest): Request[UpdateAppResponse] = js.native
    def updateReplicationJob(params: UpdateReplicationJobRequest): Request[UpdateReplicationJobResponse] = js.native
  }
  object SMS {
    @inline implicit def toOps(service: SMS): SMSOps = {
      new SMSOps(service)
    }
  }

  /** Information about the application.
    */
  @js.native
  trait AppSummary extends js.Object {
    var appId: js.UndefOr[AppId]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[AppDescription]
    var importedAppId: js.UndefOr[ImportedAppId]
    var lastModified: js.UndefOr[Timestamp]
    var latestReplicationTime: js.UndefOr[Timestamp]
    var launchConfigurationStatus: js.UndefOr[AppLaunchConfigurationStatus]
    var launchDetails: js.UndefOr[LaunchDetails]
    var launchStatus: js.UndefOr[AppLaunchStatus]
    var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage]
    var name: js.UndefOr[AppName]
    var replicationConfigurationStatus: js.UndefOr[AppReplicationConfigurationStatus]
    var replicationStatus: js.UndefOr[AppReplicationStatus]
    var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage]
    var roleName: js.UndefOr[RoleName]
    var status: js.UndefOr[AppStatus]
    var statusMessage: js.UndefOr[AppStatusMessage]
    var totalServerGroups: js.UndefOr[TotalServerGroups]
    var totalServers: js.UndefOr[TotalServers]
  }

  object AppSummary {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[AppDescription] = js.undefined,
        importedAppId: js.UndefOr[ImportedAppId] = js.undefined,
        lastModified: js.UndefOr[Timestamp] = js.undefined,
        latestReplicationTime: js.UndefOr[Timestamp] = js.undefined,
        launchConfigurationStatus: js.UndefOr[AppLaunchConfigurationStatus] = js.undefined,
        launchDetails: js.UndefOr[LaunchDetails] = js.undefined,
        launchStatus: js.UndefOr[AppLaunchStatus] = js.undefined,
        launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.undefined,
        name: js.UndefOr[AppName] = js.undefined,
        replicationConfigurationStatus: js.UndefOr[AppReplicationConfigurationStatus] = js.undefined,
        replicationStatus: js.UndefOr[AppReplicationStatus] = js.undefined,
        replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        status: js.UndefOr[AppStatus] = js.undefined,
        statusMessage: js.UndefOr[AppStatusMessage] = js.undefined,
        totalServerGroups: js.UndefOr[TotalServerGroups] = js.undefined,
        totalServers: js.UndefOr[TotalServers] = js.undefined
    ): AppSummary = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      importedAppId.foreach(__v => __obj.updateDynamic("importedAppId")(__v.asInstanceOf[js.Any]))
      lastModified.foreach(__v => __obj.updateDynamic("lastModified")(__v.asInstanceOf[js.Any]))
      latestReplicationTime.foreach(__v => __obj.updateDynamic("latestReplicationTime")(__v.asInstanceOf[js.Any]))
      launchConfigurationStatus.foreach(__v => __obj.updateDynamic("launchConfigurationStatus")(__v.asInstanceOf[js.Any]))
      launchDetails.foreach(__v => __obj.updateDynamic("launchDetails")(__v.asInstanceOf[js.Any]))
      launchStatus.foreach(__v => __obj.updateDynamic("launchStatus")(__v.asInstanceOf[js.Any]))
      launchStatusMessage.foreach(__v => __obj.updateDynamic("launchStatusMessage")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      replicationConfigurationStatus.foreach(__v => __obj.updateDynamic("replicationConfigurationStatus")(__v.asInstanceOf[js.Any]))
      replicationStatus.foreach(__v => __obj.updateDynamic("replicationStatus")(__v.asInstanceOf[js.Any]))
      replicationStatusMessage.foreach(__v => __obj.updateDynamic("replicationStatusMessage")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      totalServerGroups.foreach(__v => __obj.updateDynamic("totalServerGroups")(__v.asInstanceOf[js.Any]))
      totalServers.foreach(__v => __obj.updateDynamic("totalServers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppSummary]
    }
  }

  /** Configuration for validating an application.
    */
  @js.native
  trait AppValidationConfiguration extends js.Object {
    var appValidationStrategy: js.UndefOr[AppValidationStrategy]
    var name: js.UndefOr[NonEmptyStringWithMaxLen255]
    var ssmValidationParameters: js.UndefOr[SSMValidationParameters]
    var validationId: js.UndefOr[ValidationId]
  }

  object AppValidationConfiguration {
    @inline
    def apply(
        appValidationStrategy: js.UndefOr[AppValidationStrategy] = js.undefined,
        name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.undefined,
        ssmValidationParameters: js.UndefOr[SSMValidationParameters] = js.undefined,
        validationId: js.UndefOr[ValidationId] = js.undefined
    ): AppValidationConfiguration = {
      val __obj = js.Dynamic.literal()
      appValidationStrategy.foreach(__v => __obj.updateDynamic("appValidationStrategy")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      ssmValidationParameters.foreach(__v => __obj.updateDynamic("ssmValidationParameters")(__v.asInstanceOf[js.Any]))
      validationId.foreach(__v => __obj.updateDynamic("validationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppValidationConfiguration]
    }
  }

  /** Output from validating an application.
    */
  @js.native
  trait AppValidationOutput extends js.Object {
    var ssmOutput: js.UndefOr[SSMOutput]
  }

  object AppValidationOutput {
    @inline
    def apply(
        ssmOutput: js.UndefOr[SSMOutput] = js.undefined
    ): AppValidationOutput = {
      val __obj = js.Dynamic.literal()
      ssmOutput.foreach(__v => __obj.updateDynamic("ssmOutput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppValidationOutput]
    }
  }

  /** Represents a connector.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      associatedOn.foreach(__v => __obj.updateDynamic("associatedOn")(__v.asInstanceOf[js.Any]))
      capabilityList.foreach(__v => __obj.updateDynamic("capabilityList")(__v.asInstanceOf[js.Any]))
      connectorId.foreach(__v => __obj.updateDynamic("connectorId")(__v.asInstanceOf[js.Any]))
      ipAddress.foreach(__v => __obj.updateDynamic("ipAddress")(__v.asInstanceOf[js.Any]))
      macAddress.foreach(__v => __obj.updateDynamic("macAddress")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      vmManagerId.foreach(__v => __obj.updateDynamic("vmManagerId")(__v.asInstanceOf[js.Any]))
      vmManagerName.foreach(__v => __obj.updateDynamic("vmManagerName")(__v.asInstanceOf[js.Any]))
      vmManagerType.foreach(__v => __obj.updateDynamic("vmManagerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connector]
    }
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
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[AppDescription] = js.undefined,
        name: js.UndefOr[AppName] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAppRequest = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.updateDynamic("serverGroups")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        appSummary: js.UndefOr[AppSummary] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAppResponse = {
      val __obj = js.Dynamic.literal()
      appSummary.foreach(__v => __obj.updateDynamic("appSummary")(__v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.updateDynamic("serverGroups")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "seedReplicationTime" -> seedReplicationTime.asInstanceOf[js.Any],
        "serverId" -> serverId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.updateDynamic("encrypted")(__v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.updateDynamic("frequency")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.updateDynamic("licenseType")(__v.asInstanceOf[js.Any]))
      numberOfRecentAmisToKeep.foreach(__v => __obj.updateDynamic("numberOfRecentAmisToKeep")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      runOnce.foreach(__v => __obj.updateDynamic("runOnce")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationJobRequest]
    }
  }

  @js.native
  trait CreateReplicationJobResponse extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  object CreateReplicationJobResponse {
    @inline
    def apply(
        replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
    ): CreateReplicationJobResponse = {
      val __obj = js.Dynamic.literal()
      replicationJobId.foreach(__v => __obj.updateDynamic("replicationJobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationJobResponse]
    }
  }

  @js.native
  trait DeleteAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object DeleteAppLaunchConfigurationRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): DeleteAppLaunchConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAppLaunchConfigurationResponse extends js.Object

  object DeleteAppLaunchConfigurationResponse {
    @inline
    def apply(): DeleteAppLaunchConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object DeleteAppReplicationConfigurationRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): DeleteAppReplicationConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAppReplicationConfigurationResponse extends js.Object

  object DeleteAppReplicationConfigurationResponse {
    @inline
    def apply(): DeleteAppReplicationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
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
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.undefined,
        forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.undefined
    ): DeleteAppRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      forceStopAppReplication.foreach(__v => __obj.updateDynamic("forceStopAppReplication")(__v.asInstanceOf[js.Any]))
      forceTerminateApp.foreach(__v => __obj.updateDynamic("forceTerminateApp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteAppResponse extends js.Object

  object DeleteAppResponse {
    @inline
    def apply(): DeleteAppResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAppResponse]
    }
  }

  @js.native
  trait DeleteAppValidationConfigurationRequest extends js.Object {
    var appId: AppIdWithValidation
  }

  object DeleteAppValidationConfigurationRequest {
    @inline
    def apply(
        appId: AppIdWithValidation
    ): DeleteAppValidationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppValidationConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAppValidationConfigurationResponse extends js.Object

  object DeleteAppValidationConfigurationResponse {
    @inline
    def apply(): DeleteAppValidationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAppValidationConfigurationResponse]
    }
  }

  @js.native
  trait DeleteReplicationJobRequest extends js.Object {
    var replicationJobId: ReplicationJobId
  }

  object DeleteReplicationJobRequest {
    @inline
    def apply(
        replicationJobId: ReplicationJobId
    ): DeleteReplicationJobRequest = {
      val __obj = js.Dynamic.literal(
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReplicationJobRequest]
    }
  }

  @js.native
  trait DeleteReplicationJobResponse extends js.Object

  object DeleteReplicationJobResponse {
    @inline
    def apply(): DeleteReplicationJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteReplicationJobResponse]
    }
  }

  @js.native
  trait DeleteServerCatalogRequest extends js.Object

  object DeleteServerCatalogRequest {
    @inline
    def apply(): DeleteServerCatalogRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteServerCatalogRequest]
    }
  }

  @js.native
  trait DeleteServerCatalogResponse extends js.Object

  object DeleteServerCatalogResponse {
    @inline
    def apply(): DeleteServerCatalogResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteServerCatalogResponse]
    }
  }

  @js.native
  trait DisassociateConnectorRequest extends js.Object {
    var connectorId: ConnectorId
  }

  object DisassociateConnectorRequest {
    @inline
    def apply(
        connectorId: ConnectorId
    ): DisassociateConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "connectorId" -> connectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateConnectorRequest]
    }
  }

  @js.native
  trait DisassociateConnectorResponse extends js.Object

  object DisassociateConnectorResponse {
    @inline
    def apply(): DisassociateConnectorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateConnectorResponse]
    }
  }

  @js.native
  trait GenerateChangeSetRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var changesetFormat: js.UndefOr[OutputFormat]
  }

  object GenerateChangeSetRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        changesetFormat: js.UndefOr[OutputFormat] = js.undefined
    ): GenerateChangeSetRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      changesetFormat.foreach(__v => __obj.updateDynamic("changesetFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateChangeSetRequest]
    }
  }

  @js.native
  trait GenerateChangeSetResponse extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object GenerateChangeSetResponse {
    @inline
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): GenerateChangeSetResponse = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateChangeSetResponse]
    }
  }

  @js.native
  trait GenerateTemplateRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var templateFormat: js.UndefOr[OutputFormat]
  }

  object GenerateTemplateRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        templateFormat: js.UndefOr[OutputFormat] = js.undefined
    ): GenerateTemplateRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      templateFormat.foreach(__v => __obj.updateDynamic("templateFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateTemplateRequest]
    }
  }

  @js.native
  trait GenerateTemplateResponse extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object GenerateTemplateResponse {
    @inline
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): GenerateTemplateResponse = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateTemplateResponse]
    }
  }

  @js.native
  trait GetAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppLaunchConfigurationRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): GetAppLaunchConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait GetAppLaunchConfigurationResponse extends js.Object {
    var appId: js.UndefOr[AppId]
    var autoLaunch: js.UndefOr[AutoLaunch]
    var roleName: js.UndefOr[RoleName]
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations]
  }

  object GetAppLaunchConfigurationResponse {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        autoLaunch: js.UndefOr[AutoLaunch] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined
    ): GetAppLaunchConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      autoLaunch.foreach(__v => __obj.updateDynamic("autoLaunch")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      serverGroupLaunchConfigurations.foreach(__v => __obj.updateDynamic("serverGroupLaunchConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait GetAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppReplicationConfigurationRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): GetAppReplicationConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait GetAppReplicationConfigurationResponse extends js.Object {
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations]
  }

  object GetAppReplicationConfigurationResponse {
    @inline
    def apply(
        serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
    ): GetAppReplicationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      serverGroupReplicationConfigurations.foreach(__v => __obj.updateDynamic("serverGroupReplicationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppReplicationConfigurationResponse]
    }
  }

  @js.native
  trait GetAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): GetAppRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        appSummary: js.UndefOr[AppSummary] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetAppResponse = {
      val __obj = js.Dynamic.literal()
      appSummary.foreach(__v => __obj.updateDynamic("appSummary")(__v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.updateDynamic("serverGroups")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppResponse]
    }
  }

  @js.native
  trait GetAppValidationConfigurationRequest extends js.Object {
    var appId: AppIdWithValidation
  }

  object GetAppValidationConfigurationRequest {
    @inline
    def apply(
        appId: AppIdWithValidation
    ): GetAppValidationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppValidationConfigurationRequest]
    }
  }

  @js.native
  trait GetAppValidationConfigurationResponse extends js.Object {
    var appValidationConfigurations: js.UndefOr[AppValidationConfigurations]
    var serverGroupValidationConfigurations: js.UndefOr[ServerGroupValidationConfigurations]
  }

  object GetAppValidationConfigurationResponse {
    @inline
    def apply(
        appValidationConfigurations: js.UndefOr[AppValidationConfigurations] = js.undefined,
        serverGroupValidationConfigurations: js.UndefOr[ServerGroupValidationConfigurations] = js.undefined
    ): GetAppValidationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      appValidationConfigurations.foreach(__v => __obj.updateDynamic("appValidationConfigurations")(__v.asInstanceOf[js.Any]))
      serverGroupValidationConfigurations.foreach(__v => __obj.updateDynamic("serverGroupValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppValidationConfigurationResponse]
    }
  }

  @js.native
  trait GetAppValidationOutputRequest extends js.Object {
    var appId: AppIdWithValidation
  }

  object GetAppValidationOutputRequest {
    @inline
    def apply(
        appId: AppIdWithValidation
    ): GetAppValidationOutputRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppValidationOutputRequest]
    }
  }

  @js.native
  trait GetAppValidationOutputResponse extends js.Object {
    var validationOutputList: js.UndefOr[ValidationOutputList]
  }

  object GetAppValidationOutputResponse {
    @inline
    def apply(
        validationOutputList: js.UndefOr[ValidationOutputList] = js.undefined
    ): GetAppValidationOutputResponse = {
      val __obj = js.Dynamic.literal()
      validationOutputList.foreach(__v => __obj.updateDynamic("validationOutputList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppValidationOutputResponse]
    }
  }

  @js.native
  trait GetConnectorsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetConnectorsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetConnectorsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectorsRequest]
    }
  }

  @js.native
  trait GetConnectorsResponse extends js.Object {
    var connectorList: js.UndefOr[ConnectorList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetConnectorsResponse {
    @inline
    def apply(
        connectorList: js.UndefOr[ConnectorList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetConnectorsResponse = {
      val __obj = js.Dynamic.literal()
      connectorList.foreach(__v => __obj.updateDynamic("connectorList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
    ): GetReplicationJobsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      replicationJobId.foreach(__v => __obj.updateDynamic("replicationJobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReplicationJobsRequest]
    }
  }

  @js.native
  trait GetReplicationJobsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var replicationJobList: js.UndefOr[ReplicationJobList]
  }

  object GetReplicationJobsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        replicationJobList: js.UndefOr[ReplicationJobList] = js.undefined
    ): GetReplicationJobsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      replicationJobList.foreach(__v => __obj.updateDynamic("replicationJobList")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        replicationJobId: ReplicationJobId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetReplicationRunsRequest = {
      val __obj = js.Dynamic.literal(
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        replicationJob: js.UndefOr[ReplicationJob] = js.undefined,
        replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
    ): GetReplicationRunsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      replicationJob.foreach(__v => __obj.updateDynamic("replicationJob")(__v.asInstanceOf[js.Any]))
      replicationRunList.foreach(__v => __obj.updateDynamic("replicationRunList")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        vmServerAddressList: js.UndefOr[VmServerAddressList] = js.undefined
    ): GetServersRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      vmServerAddressList.foreach(__v => __obj.updateDynamic("vmServerAddressList")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        lastModifiedOn: js.UndefOr[Timestamp] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.undefined,
        serverList: js.UndefOr[ServerList] = js.undefined
    ): GetServersResponse = {
      val __obj = js.Dynamic.literal()
      lastModifiedOn.foreach(__v => __obj.updateDynamic("lastModifiedOn")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      serverCatalogStatus.foreach(__v => __obj.updateDynamic("serverCatalogStatus")(__v.asInstanceOf[js.Any]))
      serverList.foreach(__v => __obj.updateDynamic("serverList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServersResponse]
    }
  }

  @js.native
  trait ImportAppCatalogRequest extends js.Object {
    var roleName: js.UndefOr[RoleName]
  }

  object ImportAppCatalogRequest {
    @inline
    def apply(
        roleName: js.UndefOr[RoleName] = js.undefined
    ): ImportAppCatalogRequest = {
      val __obj = js.Dynamic.literal()
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportAppCatalogRequest]
    }
  }

  @js.native
  trait ImportAppCatalogResponse extends js.Object

  object ImportAppCatalogResponse {
    @inline
    def apply(): ImportAppCatalogResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportAppCatalogResponse]
    }
  }

  @js.native
  trait ImportServerCatalogRequest extends js.Object

  object ImportServerCatalogRequest {
    @inline
    def apply(): ImportServerCatalogRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportServerCatalogRequest]
    }
  }

  @js.native
  trait ImportServerCatalogResponse extends js.Object

  object ImportServerCatalogResponse {
    @inline
    def apply(): ImportServerCatalogResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportServerCatalogResponse]
    }
  }

  @js.native
  trait LaunchAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object LaunchAppRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): LaunchAppRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchAppRequest]
    }
  }

  @js.native
  trait LaunchAppResponse extends js.Object

  object LaunchAppResponse {
    @inline
    def apply(): LaunchAppResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchAppResponse]
    }
  }

  /** Details about the latest launch of an application.
    */
  @js.native
  trait LaunchDetails extends js.Object {
    var latestLaunchTime: js.UndefOr[Timestamp]
    var stackId: js.UndefOr[StackId]
    var stackName: js.UndefOr[StackName]
  }

  object LaunchDetails {
    @inline
    def apply(
        latestLaunchTime: js.UndefOr[Timestamp] = js.undefined,
        stackId: js.UndefOr[StackId] = js.undefined,
        stackName: js.UndefOr[StackName] = js.undefined
    ): LaunchDetails = {
      val __obj = js.Dynamic.literal()
      latestLaunchTime.foreach(__v => __obj.updateDynamic("latestLaunchTime")(__v.asInstanceOf[js.Any]))
      stackId.foreach(__v => __obj.updateDynamic("stackId")(__v.asInstanceOf[js.Any]))
      stackName.foreach(__v => __obj.updateDynamic("stackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchDetails]
    }
  }

  @js.native
  trait ListAppsRequest extends js.Object {
    var appIds: js.UndefOr[AppIds]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsRequest {
    @inline
    def apply(
        appIds: js.UndefOr[AppIds] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsRequest = {
      val __obj = js.Dynamic.literal()
      appIds.foreach(__v => __obj.updateDynamic("appIds")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsRequest]
    }
  }

  @js.native
  trait ListAppsResponse extends js.Object {
    var apps: js.UndefOr[Apps]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsResponse {
    @inline
    def apply(
        apps: js.UndefOr[Apps] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsResponse = {
      val __obj = js.Dynamic.literal()
      apps.foreach(__v => __obj.updateDynamic("apps")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsResponse]
    }
  }

  /** Contains the status of validating an application.
    */
  @js.native
  trait NotificationContext extends js.Object {
    var status: js.UndefOr[ValidationStatus]
    var statusMessage: js.UndefOr[ValidationStatusMessage]
    var validationId: js.UndefOr[ValidationId]
  }

  object NotificationContext {
    @inline
    def apply(
        status: js.UndefOr[ValidationStatus] = js.undefined,
        statusMessage: js.UndefOr[ValidationStatusMessage] = js.undefined,
        validationId: js.UndefOr[ValidationId] = js.undefined
    ): NotificationContext = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      validationId.foreach(__v => __obj.updateDynamic("validationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationContext]
    }
  }

  @js.native
  trait NotifyAppValidationOutputRequest extends js.Object {
    var appId: AppIdWithValidation
    var notificationContext: js.UndefOr[NotificationContext]
  }

  object NotifyAppValidationOutputRequest {
    @inline
    def apply(
        appId: AppIdWithValidation,
        notificationContext: js.UndefOr[NotificationContext] = js.undefined
    ): NotifyAppValidationOutputRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )

      notificationContext.foreach(__v => __obj.updateDynamic("notificationContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyAppValidationOutputRequest]
    }
  }

  @js.native
  trait NotifyAppValidationOutputResponse extends js.Object

  object NotifyAppValidationOutputResponse {
    @inline
    def apply(): NotifyAppValidationOutputResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyAppValidationOutputResponse]
    }
  }

  @js.native
  trait PutAppLaunchConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var autoLaunch: js.UndefOr[AutoLaunch]
    var roleName: js.UndefOr[RoleName]
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations]
  }

  object PutAppLaunchConfigurationRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        autoLaunch: js.UndefOr[AutoLaunch] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined
    ): PutAppLaunchConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      autoLaunch.foreach(__v => __obj.updateDynamic("autoLaunch")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      serverGroupLaunchConfigurations.foreach(__v => __obj.updateDynamic("serverGroupLaunchConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAppLaunchConfigurationRequest]
    }
  }

  @js.native
  trait PutAppLaunchConfigurationResponse extends js.Object

  object PutAppLaunchConfigurationResponse {
    @inline
    def apply(): PutAppLaunchConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAppLaunchConfigurationResponse]
    }
  }

  @js.native
  trait PutAppReplicationConfigurationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations]
  }

  object PutAppReplicationConfigurationRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
    ): PutAppReplicationConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      serverGroupReplicationConfigurations.foreach(__v => __obj.updateDynamic("serverGroupReplicationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAppReplicationConfigurationRequest]
    }
  }

  @js.native
  trait PutAppReplicationConfigurationResponse extends js.Object

  object PutAppReplicationConfigurationResponse {
    @inline
    def apply(): PutAppReplicationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAppReplicationConfigurationResponse]
    }
  }

  @js.native
  trait PutAppValidationConfigurationRequest extends js.Object {
    var appId: AppIdWithValidation
    var appValidationConfigurations: js.UndefOr[AppValidationConfigurations]
    var serverGroupValidationConfigurations: js.UndefOr[ServerGroupValidationConfigurations]
  }

  object PutAppValidationConfigurationRequest {
    @inline
    def apply(
        appId: AppIdWithValidation,
        appValidationConfigurations: js.UndefOr[AppValidationConfigurations] = js.undefined,
        serverGroupValidationConfigurations: js.UndefOr[ServerGroupValidationConfigurations] = js.undefined
    ): PutAppValidationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )

      appValidationConfigurations.foreach(__v => __obj.updateDynamic("appValidationConfigurations")(__v.asInstanceOf[js.Any]))
      serverGroupValidationConfigurations.foreach(__v => __obj.updateDynamic("serverGroupValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAppValidationConfigurationRequest]
    }
  }

  @js.native
  trait PutAppValidationConfigurationResponse extends js.Object

  object PutAppValidationConfigurationResponse {
    @inline
    def apply(): PutAppValidationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAppValidationConfigurationResponse]
    }
  }

  /** Represents a replication job.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.updateDynamic("encrypted")(__v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.updateDynamic("frequency")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      latestAmiId.foreach(__v => __obj.updateDynamic("latestAmiId")(__v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.updateDynamic("licenseType")(__v.asInstanceOf[js.Any]))
      nextReplicationRunStartTime.foreach(__v => __obj.updateDynamic("nextReplicationRunStartTime")(__v.asInstanceOf[js.Any]))
      numberOfRecentAmisToKeep.foreach(__v => __obj.updateDynamic("numberOfRecentAmisToKeep")(__v.asInstanceOf[js.Any]))
      replicationJobId.foreach(__v => __obj.updateDynamic("replicationJobId")(__v.asInstanceOf[js.Any]))
      replicationRunList.foreach(__v => __obj.updateDynamic("replicationRunList")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      runOnce.foreach(__v => __obj.updateDynamic("runOnce")(__v.asInstanceOf[js.Any]))
      seedReplicationTime.foreach(__v => __obj.updateDynamic("seedReplicationTime")(__v.asInstanceOf[js.Any]))
      serverId.foreach(__v => __obj.updateDynamic("serverId")(__v.asInstanceOf[js.Any]))
      serverType.foreach(__v => __obj.updateDynamic("serverType")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      vmServer.foreach(__v => __obj.updateDynamic("vmServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationJob]
    }
  }

  /** Represents a replication run.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      amiId.foreach(__v => __obj.updateDynamic("amiId")(__v.asInstanceOf[js.Any]))
      completedTime.foreach(__v => __obj.updateDynamic("completedTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.updateDynamic("encrypted")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      replicationRunId.foreach(__v => __obj.updateDynamic("replicationRunId")(__v.asInstanceOf[js.Any]))
      scheduledStartTime.foreach(__v => __obj.updateDynamic("scheduledStartTime")(__v.asInstanceOf[js.Any]))
      stageDetails.foreach(__v => __obj.updateDynamic("stageDetails")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationRun]
    }
  }

  /** Details of the current stage of a replication run.
    */
  @js.native
  trait ReplicationRunStageDetails extends js.Object {
    var stage: js.UndefOr[ReplicationRunStage]
    var stageProgress: js.UndefOr[ReplicationRunStageProgress]
  }

  object ReplicationRunStageDetails {
    @inline
    def apply(
        stage: js.UndefOr[ReplicationRunStage] = js.undefined,
        stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.undefined
    ): ReplicationRunStageDetails = {
      val __obj = js.Dynamic.literal()
      stage.foreach(__v => __obj.updateDynamic("stage")(__v.asInstanceOf[js.Any]))
      stageProgress.foreach(__v => __obj.updateDynamic("stageProgress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationRunStageDetails]
    }
  }

  /** Location of an Amazon S3 object.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3BucketName]
    var key: js.UndefOr[S3KeyName]
  }

  object S3Location {
    @inline
    def apply(
        bucket: js.UndefOr[S3BucketName] = js.undefined,
        key: js.UndefOr[S3KeyName] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Contains the location of validation output.
    */
  @js.native
  trait SSMOutput extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object SSMOutput {
    @inline
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): SSMOutput = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SSMOutput]
    }
  }

  /** Contains validation parameters.
    */
  @js.native
  trait SSMValidationParameters extends js.Object {
    var command: js.UndefOr[Command]
    var executionTimeoutSeconds: js.UndefOr[ExecutionTimeoutSeconds]
    var instanceId: js.UndefOr[InstanceId]
    var outputS3BucketName: js.UndefOr[BucketName]
    var scriptType: js.UndefOr[ScriptType]
    var source: js.UndefOr[Source]
  }

  object SSMValidationParameters {
    @inline
    def apply(
        command: js.UndefOr[Command] = js.undefined,
        executionTimeoutSeconds: js.UndefOr[ExecutionTimeoutSeconds] = js.undefined,
        instanceId: js.UndefOr[InstanceId] = js.undefined,
        outputS3BucketName: js.UndefOr[BucketName] = js.undefined,
        scriptType: js.UndefOr[ScriptType] = js.undefined,
        source: js.UndefOr[Source] = js.undefined
    ): SSMValidationParameters = {
      val __obj = js.Dynamic.literal()
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      executionTimeoutSeconds.foreach(__v => __obj.updateDynamic("executionTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      instanceId.foreach(__v => __obj.updateDynamic("instanceId")(__v.asInstanceOf[js.Any]))
      outputS3BucketName.foreach(__v => __obj.updateDynamic("outputS3BucketName")(__v.asInstanceOf[js.Any]))
      scriptType.foreach(__v => __obj.updateDynamic("scriptType")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SSMValidationParameters]
    }
  }

  /** Represents a server.
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
    @inline
    def apply(
        replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
        replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.undefined,
        serverId: js.UndefOr[ServerId] = js.undefined,
        serverType: js.UndefOr[ServerType] = js.undefined,
        vmServer: js.UndefOr[VmServer] = js.undefined
    ): Server = {
      val __obj = js.Dynamic.literal()
      replicationJobId.foreach(__v => __obj.updateDynamic("replicationJobId")(__v.asInstanceOf[js.Any]))
      replicationJobTerminated.foreach(__v => __obj.updateDynamic("replicationJobTerminated")(__v.asInstanceOf[js.Any]))
      serverId.foreach(__v => __obj.updateDynamic("serverId")(__v.asInstanceOf[js.Any]))
      serverType.foreach(__v => __obj.updateDynamic("serverType")(__v.asInstanceOf[js.Any]))
      vmServer.foreach(__v => __obj.updateDynamic("vmServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Server]
    }
  }

  /** Logical grouping of servers.
    */
  @js.native
  trait ServerGroup extends js.Object {
    var name: js.UndefOr[ServerGroupName]
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverList: js.UndefOr[ServerList]
  }

  object ServerGroup {
    @inline
    def apply(
        name: js.UndefOr[ServerGroupName] = js.undefined,
        serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
        serverList: js.UndefOr[ServerList] = js.undefined
    ): ServerGroup = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      serverGroupId.foreach(__v => __obj.updateDynamic("serverGroupId")(__v.asInstanceOf[js.Any]))
      serverList.foreach(__v => __obj.updateDynamic("serverList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerGroup]
    }
  }

  /** Launch configuration for a server group.
    */
  @js.native
  trait ServerGroupLaunchConfiguration extends js.Object {
    var launchOrder: js.UndefOr[LaunchOrder]
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations]
  }

  object ServerGroupLaunchConfiguration {
    @inline
    def apply(
        launchOrder: js.UndefOr[LaunchOrder] = js.undefined,
        serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
        serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.undefined
    ): ServerGroupLaunchConfiguration = {
      val __obj = js.Dynamic.literal()
      launchOrder.foreach(__v => __obj.updateDynamic("launchOrder")(__v.asInstanceOf[js.Any]))
      serverGroupId.foreach(__v => __obj.updateDynamic("serverGroupId")(__v.asInstanceOf[js.Any]))
      serverLaunchConfigurations.foreach(__v => __obj.updateDynamic("serverLaunchConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerGroupLaunchConfiguration]
    }
  }

  /** Replication configuration for a server group.
    */
  @js.native
  trait ServerGroupReplicationConfiguration extends js.Object {
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations]
  }

  object ServerGroupReplicationConfiguration {
    @inline
    def apply(
        serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
        serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.undefined
    ): ServerGroupReplicationConfiguration = {
      val __obj = js.Dynamic.literal()
      serverGroupId.foreach(__v => __obj.updateDynamic("serverGroupId")(__v.asInstanceOf[js.Any]))
      serverReplicationConfigurations.foreach(__v => __obj.updateDynamic("serverReplicationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerGroupReplicationConfiguration]
    }
  }

  /** Configuration for validating an instance.
    */
  @js.native
  trait ServerGroupValidationConfiguration extends js.Object {
    var serverGroupId: js.UndefOr[ServerGroupId]
    var serverValidationConfigurations: js.UndefOr[ServerValidationConfigurations]
  }

  object ServerGroupValidationConfiguration {
    @inline
    def apply(
        serverGroupId: js.UndefOr[ServerGroupId] = js.undefined,
        serverValidationConfigurations: js.UndefOr[ServerValidationConfigurations] = js.undefined
    ): ServerGroupValidationConfiguration = {
      val __obj = js.Dynamic.literal()
      serverGroupId.foreach(__v => __obj.updateDynamic("serverGroupId")(__v.asInstanceOf[js.Any]))
      serverValidationConfigurations.foreach(__v => __obj.updateDynamic("serverValidationConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerGroupValidationConfiguration]
    }
  }

  /** Launch configuration for a server.
    */
  @js.native
  trait ServerLaunchConfiguration extends js.Object {
    var associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress]
    var configureScript: js.UndefOr[S3Location]
    var configureScriptType: js.UndefOr[ScriptType]
    var ec2KeyName: js.UndefOr[EC2KeyName]
    var iamInstanceProfileName: js.UndefOr[RoleName]
    var instanceType: js.UndefOr[InstanceType]
    var logicalId: js.UndefOr[LogicalId]
    var securityGroup: js.UndefOr[SecurityGroup]
    var server: js.UndefOr[Server]
    var subnet: js.UndefOr[Subnet]
    var userData: js.UndefOr[UserData]
    var vpc: js.UndefOr[VPC]
  }

  object ServerLaunchConfiguration {
    @inline
    def apply(
        associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
        configureScript: js.UndefOr[S3Location] = js.undefined,
        configureScriptType: js.UndefOr[ScriptType] = js.undefined,
        ec2KeyName: js.UndefOr[EC2KeyName] = js.undefined,
        iamInstanceProfileName: js.UndefOr[RoleName] = js.undefined,
        instanceType: js.UndefOr[InstanceType] = js.undefined,
        logicalId: js.UndefOr[LogicalId] = js.undefined,
        securityGroup: js.UndefOr[SecurityGroup] = js.undefined,
        server: js.UndefOr[Server] = js.undefined,
        subnet: js.UndefOr[Subnet] = js.undefined,
        userData: js.UndefOr[UserData] = js.undefined,
        vpc: js.UndefOr[VPC] = js.undefined
    ): ServerLaunchConfiguration = {
      val __obj = js.Dynamic.literal()
      associatePublicIpAddress.foreach(__v => __obj.updateDynamic("associatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      configureScript.foreach(__v => __obj.updateDynamic("configureScript")(__v.asInstanceOf[js.Any]))
      configureScriptType.foreach(__v => __obj.updateDynamic("configureScriptType")(__v.asInstanceOf[js.Any]))
      ec2KeyName.foreach(__v => __obj.updateDynamic("ec2KeyName")(__v.asInstanceOf[js.Any]))
      iamInstanceProfileName.foreach(__v => __obj.updateDynamic("iamInstanceProfileName")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      logicalId.foreach(__v => __obj.updateDynamic("logicalId")(__v.asInstanceOf[js.Any]))
      securityGroup.foreach(__v => __obj.updateDynamic("securityGroup")(__v.asInstanceOf[js.Any]))
      server.foreach(__v => __obj.updateDynamic("server")(__v.asInstanceOf[js.Any]))
      subnet.foreach(__v => __obj.updateDynamic("subnet")(__v.asInstanceOf[js.Any]))
      userData.foreach(__v => __obj.updateDynamic("userData")(__v.asInstanceOf[js.Any]))
      vpc.foreach(__v => __obj.updateDynamic("vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerLaunchConfiguration]
    }
  }

  /** Replication configuration of a server.
    */
  @js.native
  trait ServerReplicationConfiguration extends js.Object {
    var server: js.UndefOr[Server]
    var serverReplicationParameters: js.UndefOr[ServerReplicationParameters]
  }

  object ServerReplicationConfiguration {
    @inline
    def apply(
        server: js.UndefOr[Server] = js.undefined,
        serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.undefined
    ): ServerReplicationConfiguration = {
      val __obj = js.Dynamic.literal()
      server.foreach(__v => __obj.updateDynamic("server")(__v.asInstanceOf[js.Any]))
      serverReplicationParameters.foreach(__v => __obj.updateDynamic("serverReplicationParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerReplicationConfiguration]
    }
  }

  /** The replication parameters for replicating a server.
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
    @inline
    def apply(
        encrypted: js.UndefOr[Encrypted] = js.undefined,
        frequency: js.UndefOr[Frequency] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        licenseType: js.UndefOr[LicenseType] = js.undefined,
        numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
        runOnce: js.UndefOr[RunOnce] = js.undefined,
        seedTime: js.UndefOr[Timestamp] = js.undefined
    ): ServerReplicationParameters = {
      val __obj = js.Dynamic.literal()
      encrypted.foreach(__v => __obj.updateDynamic("encrypted")(__v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.updateDynamic("frequency")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.updateDynamic("licenseType")(__v.asInstanceOf[js.Any]))
      numberOfRecentAmisToKeep.foreach(__v => __obj.updateDynamic("numberOfRecentAmisToKeep")(__v.asInstanceOf[js.Any]))
      runOnce.foreach(__v => __obj.updateDynamic("runOnce")(__v.asInstanceOf[js.Any]))
      seedTime.foreach(__v => __obj.updateDynamic("seedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerReplicationParameters]
    }
  }

  /** Configuration for validating an instance.
    */
  @js.native
  trait ServerValidationConfiguration extends js.Object {
    var name: js.UndefOr[NonEmptyStringWithMaxLen255]
    var server: js.UndefOr[Server]
    var serverValidationStrategy: js.UndefOr[ServerValidationStrategy]
    var userDataValidationParameters: js.UndefOr[UserDataValidationParameters]
    var validationId: js.UndefOr[ValidationId]
  }

  object ServerValidationConfiguration {
    @inline
    def apply(
        name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.undefined,
        server: js.UndefOr[Server] = js.undefined,
        serverValidationStrategy: js.UndefOr[ServerValidationStrategy] = js.undefined,
        userDataValidationParameters: js.UndefOr[UserDataValidationParameters] = js.undefined,
        validationId: js.UndefOr[ValidationId] = js.undefined
    ): ServerValidationConfiguration = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      server.foreach(__v => __obj.updateDynamic("server")(__v.asInstanceOf[js.Any]))
      serverValidationStrategy.foreach(__v => __obj.updateDynamic("serverValidationStrategy")(__v.asInstanceOf[js.Any]))
      userDataValidationParameters.foreach(__v => __obj.updateDynamic("userDataValidationParameters")(__v.asInstanceOf[js.Any]))
      validationId.foreach(__v => __obj.updateDynamic("validationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerValidationConfiguration]
    }
  }

  /** Contains output from validating an instance.
    */
  @js.native
  trait ServerValidationOutput extends js.Object {
    var server: js.UndefOr[Server]
  }

  object ServerValidationOutput {
    @inline
    def apply(
        server: js.UndefOr[Server] = js.undefined
    ): ServerValidationOutput = {
      val __obj = js.Dynamic.literal()
      server.foreach(__v => __obj.updateDynamic("server")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerValidationOutput]
    }
  }

  /** Contains the location of a validation script.
    */
  @js.native
  trait Source extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object Source {
    @inline
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): Source = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  @js.native
  trait StartAppReplicationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object StartAppReplicationRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): StartAppReplicationRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAppReplicationRequest]
    }
  }

  @js.native
  trait StartAppReplicationResponse extends js.Object

  object StartAppReplicationResponse {
    @inline
    def apply(): StartAppReplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartAppReplicationResponse]
    }
  }

  @js.native
  trait StartOnDemandAppReplicationRequest extends js.Object {
    var appId: AppId
    var description: js.UndefOr[Description]
  }

  object StartOnDemandAppReplicationRequest {
    @inline
    def apply(
        appId: AppId,
        description: js.UndefOr[Description] = js.undefined
    ): StartOnDemandAppReplicationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOnDemandAppReplicationRequest]
    }
  }

  @js.native
  trait StartOnDemandAppReplicationResponse extends js.Object

  object StartOnDemandAppReplicationResponse {
    @inline
    def apply(): StartOnDemandAppReplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOnDemandAppReplicationResponse]
    }
  }

  @js.native
  trait StartOnDemandReplicationRunRequest extends js.Object {
    var replicationJobId: ReplicationJobId
    var description: js.UndefOr[Description]
  }

  object StartOnDemandReplicationRunRequest {
    @inline
    def apply(
        replicationJobId: ReplicationJobId,
        description: js.UndefOr[Description] = js.undefined
    ): StartOnDemandReplicationRunRequest = {
      val __obj = js.Dynamic.literal(
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOnDemandReplicationRunRequest]
    }
  }

  @js.native
  trait StartOnDemandReplicationRunResponse extends js.Object {
    var replicationRunId: js.UndefOr[ReplicationRunId]
  }

  object StartOnDemandReplicationRunResponse {
    @inline
    def apply(
        replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
    ): StartOnDemandReplicationRunResponse = {
      val __obj = js.Dynamic.literal()
      replicationRunId.foreach(__v => __obj.updateDynamic("replicationRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOnDemandReplicationRunResponse]
    }
  }

  @js.native
  trait StopAppReplicationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object StopAppReplicationRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): StopAppReplicationRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopAppReplicationRequest]
    }
  }

  @js.native
  trait StopAppReplicationResponse extends js.Object

  object StopAppReplicationResponse {
    @inline
    def apply(): StopAppReplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopAppReplicationResponse]
    }
  }

  /** Key/value pair that can be assigned to an application.
    */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TerminateAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object TerminateAppRequest {
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined
    ): TerminateAppRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateAppRequest]
    }
  }

  @js.native
  trait TerminateAppResponse extends js.Object

  object TerminateAppResponse {
    @inline
    def apply(): TerminateAppResponse = {
      val __obj = js.Dynamic.literal()
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
    @inline
    def apply(
        appId: js.UndefOr[AppId] = js.undefined,
        description: js.UndefOr[AppDescription] = js.undefined,
        name: js.UndefOr[AppName] = js.undefined,
        roleName: js.UndefOr[RoleName] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): UpdateAppRequest = {
      val __obj = js.Dynamic.literal()
      appId.foreach(__v => __obj.updateDynamic("appId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.updateDynamic("serverGroups")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        appSummary: js.UndefOr[AppSummary] = js.undefined,
        serverGroups: js.UndefOr[ServerGroups] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): UpdateAppResponse = {
      val __obj = js.Dynamic.literal()
      appSummary.foreach(__v => __obj.updateDynamic("appSummary")(__v.asInstanceOf[js.Any]))
      serverGroups.foreach(__v => __obj.updateDynamic("serverGroups")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "replicationJobId" -> replicationJobId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.updateDynamic("encrypted")(__v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.updateDynamic("frequency")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.updateDynamic("licenseType")(__v.asInstanceOf[js.Any]))
      nextReplicationRunStartTime.foreach(__v => __obj.updateDynamic("nextReplicationRunStartTime")(__v.asInstanceOf[js.Any]))
      numberOfRecentAmisToKeep.foreach(__v => __obj.updateDynamic("numberOfRecentAmisToKeep")(__v.asInstanceOf[js.Any]))
      roleName.foreach(__v => __obj.updateDynamic("roleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReplicationJobRequest]
    }
  }

  @js.native
  trait UpdateReplicationJobResponse extends js.Object

  object UpdateReplicationJobResponse {
    @inline
    def apply(): UpdateReplicationJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateReplicationJobResponse]
    }
  }

  /** A script that runs on first launch of an Amazon EC2 instance. Used for configuring the server during launch.
    */
  @js.native
  trait UserData extends js.Object {
    var s3Location: js.UndefOr[S3Location]
  }

  object UserData {
    @inline
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): UserData = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserData]
    }
  }

  /** Contains validation parameters.
    */
  @js.native
  trait UserDataValidationParameters extends js.Object {
    var scriptType: js.UndefOr[ScriptType]
    var source: js.UndefOr[Source]
  }

  object UserDataValidationParameters {
    @inline
    def apply(
        scriptType: js.UndefOr[ScriptType] = js.undefined,
        source: js.UndefOr[Source] = js.undefined
    ): UserDataValidationParameters = {
      val __obj = js.Dynamic.literal()
      scriptType.foreach(__v => __obj.updateDynamic("scriptType")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDataValidationParameters]
    }
  }

  /** Contains validation output.
    */
  @js.native
  trait ValidationOutput extends js.Object {
    var appValidationOutput: js.UndefOr[AppValidationOutput]
    var latestValidationTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[NonEmptyStringWithMaxLen255]
    var serverValidationOutput: js.UndefOr[ServerValidationOutput]
    var status: js.UndefOr[ValidationStatus]
    var statusMessage: js.UndefOr[ValidationStatusMessage]
    var validationId: js.UndefOr[ValidationId]
  }

  object ValidationOutput {
    @inline
    def apply(
        appValidationOutput: js.UndefOr[AppValidationOutput] = js.undefined,
        latestValidationTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.undefined,
        serverValidationOutput: js.UndefOr[ServerValidationOutput] = js.undefined,
        status: js.UndefOr[ValidationStatus] = js.undefined,
        statusMessage: js.UndefOr[ValidationStatusMessage] = js.undefined,
        validationId: js.UndefOr[ValidationId] = js.undefined
    ): ValidationOutput = {
      val __obj = js.Dynamic.literal()
      appValidationOutput.foreach(__v => __obj.updateDynamic("appValidationOutput")(__v.asInstanceOf[js.Any]))
      latestValidationTime.foreach(__v => __obj.updateDynamic("latestValidationTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      serverValidationOutput.foreach(__v => __obj.updateDynamic("serverValidationOutput")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      validationId.foreach(__v => __obj.updateDynamic("validationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidationOutput]
    }
  }

  /** Represents a VM server.
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
    @inline
    def apply(
        vmManagerName: js.UndefOr[VmManagerName] = js.undefined,
        vmManagerType: js.UndefOr[VmManagerType] = js.undefined,
        vmName: js.UndefOr[VmName] = js.undefined,
        vmPath: js.UndefOr[VmPath] = js.undefined,
        vmServerAddress: js.UndefOr[VmServerAddress] = js.undefined
    ): VmServer = {
      val __obj = js.Dynamic.literal()
      vmManagerName.foreach(__v => __obj.updateDynamic("vmManagerName")(__v.asInstanceOf[js.Any]))
      vmManagerType.foreach(__v => __obj.updateDynamic("vmManagerType")(__v.asInstanceOf[js.Any]))
      vmName.foreach(__v => __obj.updateDynamic("vmName")(__v.asInstanceOf[js.Any]))
      vmPath.foreach(__v => __obj.updateDynamic("vmPath")(__v.asInstanceOf[js.Any]))
      vmServerAddress.foreach(__v => __obj.updateDynamic("vmServerAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VmServer]
    }
  }

  /** Represents a VM server location.
    */
  @js.native
  trait VmServerAddress extends js.Object {
    var vmId: js.UndefOr[VmId]
    var vmManagerId: js.UndefOr[VmManagerId]
  }

  object VmServerAddress {
    @inline
    def apply(
        vmId: js.UndefOr[VmId] = js.undefined,
        vmManagerId: js.UndefOr[VmManagerId] = js.undefined
    ): VmServerAddress = {
      val __obj = js.Dynamic.literal()
      vmId.foreach(__v => __obj.updateDynamic("vmId")(__v.asInstanceOf[js.Any]))
      vmManagerId.foreach(__v => __obj.updateDynamic("vmManagerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VmServerAddress]
    }
  }
}
