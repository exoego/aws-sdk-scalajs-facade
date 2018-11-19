package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object sms {
  type AmiId = String
  type ConnectorCapability = String
  type ConnectorCapabilityList = js.Array[ConnectorCapability]
  type ConnectorId = String
  type ConnectorList = js.Array[Connector]
  type ConnectorStatus = String
  type ConnectorVersion = String
  type Description = String
  type ErrorMessage = String
  type Frequency = Int
  type IpAddress = String
  type LicenseType = String
  type MacAddress = String
  type MaxResults = Int
  type NextToken = String
  type ReplicationJobId = String
  type ReplicationJobList = js.Array[ReplicationJob]
  type ReplicationJobState = String
  type ReplicationJobStatusMessage = String
  type ReplicationJobTerminated = Boolean
  type ReplicationRunId = String
  type ReplicationRunList = js.Array[ReplicationRun]
  type ReplicationRunState = String
  type ReplicationRunStatusMessage = String
  type ReplicationRunType = String
  type RoleName = String
  type ServerCatalogStatus = String
  type ServerId = String
  type ServerList = js.Array[Server]
  type ServerType = String
  type Timestamp = js.Date
  type VmId = String
  type VmManagerId = String
  type VmManagerName = String
  type VmManagerType = String
  type VmName = String
  type VmPath = String
}

package sms {
  @js.native
  @JSImport("aws-sdk", "SMS")
  class SMS(config: AWSConfig) extends js.Object {
    def createReplicationJob(params: CreateReplicationJobRequest): Request[CreateReplicationJobResponse] = js.native
    def deleteReplicationJob(params: DeleteReplicationJobRequest): Request[DeleteReplicationJobResponse] = js.native
    def deleteServerCatalog(params: DeleteServerCatalogRequest): Request[DeleteServerCatalogResponse] = js.native
    def disassociateConnector(params: DisassociateConnectorRequest): Request[DisassociateConnectorResponse] = js.native
    def getConnectors(params: GetConnectorsRequest): Request[GetConnectorsResponse] = js.native
    def getReplicationJobs(params: GetReplicationJobsRequest): Request[GetReplicationJobsResponse] = js.native
    def getReplicationRuns(params: GetReplicationRunsRequest): Request[GetReplicationRunsResponse] = js.native
    def getServers(params: GetServersRequest): Request[GetServersResponse] = js.native
    def importServerCatalog(params: ImportServerCatalogRequest): Request[ImportServerCatalogResponse] = js.native
    def startOnDemandReplicationRun(params: StartOnDemandReplicationRunRequest): Request[StartOnDemandReplicationRunResponse] = js.native
    def updateReplicationJob(params: UpdateReplicationJobRequest): Request[UpdateReplicationJobResponse] = js.native
  }

  /**
   * Object representing a Connector
   */
  @js.native
  trait Connector extends js.Object {
    var macAddress: js.UndefOr[MacAddress]
    var associatedOn: js.UndefOr[Timestamp]
    var connectorId: js.UndefOr[ConnectorId]
    var vmManagerType: js.UndefOr[VmManagerType]
    var version: js.UndefOr[ConnectorVersion]
    var ipAddress: js.UndefOr[IpAddress]
    var status: js.UndefOr[ConnectorStatus]
    var vmManagerId: js.UndefOr[VmManagerId]
    var capabilityList: js.UndefOr[ConnectorCapabilityList]
    var vmManagerName: js.UndefOr[VmManagerName]
  }

  object Connector {
    def apply(
      macAddress: js.UndefOr[MacAddress] = js.undefined,
      associatedOn: js.UndefOr[Timestamp] = js.undefined,
      connectorId: js.UndefOr[ConnectorId] = js.undefined,
      vmManagerType: js.UndefOr[VmManagerType] = js.undefined,
      version: js.UndefOr[ConnectorVersion] = js.undefined,
      ipAddress: js.UndefOr[IpAddress] = js.undefined,
      status: js.UndefOr[ConnectorStatus] = js.undefined,
      vmManagerId: js.UndefOr[VmManagerId] = js.undefined,
      capabilityList: js.UndefOr[ConnectorCapabilityList] = js.undefined,
      vmManagerName: js.UndefOr[VmManagerName] = js.undefined): Connector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "macAddress" -> macAddress.map { x => x.asInstanceOf[js.Any] },
        "associatedOn" -> associatedOn.map { x => x.asInstanceOf[js.Any] },
        "connectorId" -> connectorId.map { x => x.asInstanceOf[js.Any] },
        "vmManagerType" -> vmManagerType.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "ipAddress" -> ipAddress.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "vmManagerId" -> vmManagerId.map { x => x.asInstanceOf[js.Any] },
        "capabilityList" -> capabilityList.map { x => x.asInstanceOf[js.Any] },
        "vmManagerName" -> vmManagerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connector]
    }
  }

  /**
   * Capabilities for a Connector
   */
  object ConnectorCapabilityEnum {
    val VSPHERE = "VSPHERE"

    val values = IndexedSeq(VSPHERE)
  }

  /**
   * Status of on-premise Connector
   */
  object ConnectorStatusEnum {
    val HEALTHY = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"

    val values = IndexedSeq(HEALTHY, UNHEALTHY)
  }

  @js.native
  trait CreateReplicationJobRequest extends js.Object {
    var licenseType: js.UndefOr[LicenseType]
    var description: js.UndefOr[Description]
    var roleName: js.UndefOr[RoleName]
    var serverId: js.UndefOr[ServerId]
    var seedReplicationTime: js.UndefOr[Timestamp]
    var frequency: js.UndefOr[Frequency]
  }

  object CreateReplicationJobRequest {
    def apply(
      licenseType: js.UndefOr[LicenseType] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      serverId: js.UndefOr[ServerId] = js.undefined,
      seedReplicationTime: js.UndefOr[Timestamp] = js.undefined,
      frequency: js.UndefOr[Frequency] = js.undefined): CreateReplicationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "licenseType" -> licenseType.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "serverId" -> serverId.map { x => x.asInstanceOf[js.Any] },
        "seedReplicationTime" -> seedReplicationTime.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationJobRequest]
    }
  }

  @js.native
  trait CreateReplicationJobResponse extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  object CreateReplicationJobResponse {
    def apply(
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined): CreateReplicationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationJobResponse]
    }
  }

  @js.native
  trait DeleteReplicationJobRequest extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
  }

  object DeleteReplicationJobRequest {
    def apply(
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined): DeleteReplicationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationJobRequest]
    }
  }

  @js.native
  trait DeleteReplicationJobResponse extends js.Object {

  }

  object DeleteReplicationJobResponse {
    def apply(): DeleteReplicationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationJobResponse]
    }
  }

  @js.native
  trait DeleteServerCatalogRequest extends js.Object {

  }

  object DeleteServerCatalogRequest {
    def apply(): DeleteServerCatalogRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerCatalogRequest]
    }
  }

  @js.native
  trait DeleteServerCatalogResponse extends js.Object {

  }

  object DeleteServerCatalogResponse {
    def apply(): DeleteServerCatalogResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerCatalogResponse]
    }
  }

  @js.native
  trait DisassociateConnectorRequest extends js.Object {
    var connectorId: js.UndefOr[ConnectorId]
  }

  object DisassociateConnectorRequest {
    def apply(
      connectorId: js.UndefOr[ConnectorId] = js.undefined): DisassociateConnectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectorId" -> connectorId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateConnectorRequest]
    }
  }

  @js.native
  trait DisassociateConnectorResponse extends js.Object {

  }

  object DisassociateConnectorResponse {
    def apply(): DisassociateConnectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateConnectorResponse]
    }
  }

  @js.native
  trait GetConnectorsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetConnectorsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetConnectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectorsRequest]
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
      nextToken: js.UndefOr[NextToken] = js.undefined): GetConnectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectorList" -> connectorList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectorsResponse]
    }
  }

  @js.native
  trait GetReplicationJobsRequest extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetReplicationJobsRequest {
    def apply(
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetReplicationJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReplicationJobsRequest]
    }
  }

  @js.native
  trait GetReplicationJobsResponse extends js.Object {
    var replicationJobList: js.UndefOr[ReplicationJobList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetReplicationJobsResponse {
    def apply(
      replicationJobList: js.UndefOr[ReplicationJobList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetReplicationJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobList" -> replicationJobList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReplicationJobsResponse]
    }
  }

  @js.native
  trait GetReplicationRunsRequest extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetReplicationRunsRequest {
    def apply(
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetReplicationRunsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReplicationRunsRequest]
    }
  }

  @js.native
  trait GetReplicationRunsResponse extends js.Object {
    var replicationJob: js.UndefOr[ReplicationJob]
    var replicationRunList: js.UndefOr[ReplicationRunList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetReplicationRunsResponse {
    def apply(
      replicationJob: js.UndefOr[ReplicationJob] = js.undefined,
      replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetReplicationRunsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJob" -> replicationJob.map { x => x.asInstanceOf[js.Any] },
        "replicationRunList" -> replicationRunList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReplicationRunsResponse]
    }
  }

  @js.native
  trait GetServersRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetServersRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetServersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServersRequest]
    }
  }

  @js.native
  trait GetServersResponse extends js.Object {
    var lastModifiedOn: js.UndefOr[Timestamp]
    var serverCatalogStatus: js.UndefOr[ServerCatalogStatus]
    var serverList: js.UndefOr[ServerList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetServersResponse {
    def apply(
      lastModifiedOn: js.UndefOr[Timestamp] = js.undefined,
      serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.undefined,
      serverList: js.UndefOr[ServerList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetServersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastModifiedOn" -> lastModifiedOn.map { x => x.asInstanceOf[js.Any] },
        "serverCatalogStatus" -> serverCatalogStatus.map { x => x.asInstanceOf[js.Any] },
        "serverList" -> serverList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServersResponse]
    }
  }

  @js.native
  trait ImportServerCatalogRequest extends js.Object {

  }

  object ImportServerCatalogRequest {
    def apply(): ImportServerCatalogRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportServerCatalogRequest]
    }
  }

  @js.native
  trait ImportServerCatalogResponse extends js.Object {

  }

  object ImportServerCatalogResponse {
    def apply(): ImportServerCatalogResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportServerCatalogResponse]
    }
  }

  /**
   * An internal error has occured.
   */
  @js.native
  trait InternalErrorException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * A parameter specified in the request is not valid, is unsupported, or cannot be used.
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The license type to be used for the Amazon Machine Image (AMI) created after a successful ReplicationRun.
   */
  object LicenseTypeEnum {
    val AWS = "AWS"
    val BYOL = "BYOL"

    val values = IndexedSeq(AWS, BYOL)
  }

  /**
   * The request is missing a required parameter. Ensure that you have supplied all the required parameters for the request.
   */
  @js.native
  trait MissingRequiredParameterExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * No connectors are available to handle this request. Please associate connector(s) and verify any existing connectors are healthy and can respond to requests.
   */
  @js.native
  trait NoConnectorsAvailableExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The specified operation is not allowed. This error can occur for a number of reasons; for example, you might be trying to start a Replication Run before seed Replication Run.
   */
  @js.native
  trait OperationNotPermittedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Object representing a Replication Job
   */
  @js.native
  trait ReplicationJob extends js.Object {
    var nextReplicationRunStartTime: js.UndefOr[Timestamp]
    var latestAmiId: js.UndefOr[AmiId]
    var licenseType: js.UndefOr[LicenseType]
    var state: js.UndefOr[ReplicationJobState]
    var description: js.UndefOr[Description]
    var roleName: js.UndefOr[RoleName]
    var vmServer: js.UndefOr[VmServer]
    var serverId: js.UndefOr[ServerId]
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var serverType: js.UndefOr[ServerType]
    var seedReplicationTime: js.UndefOr[Timestamp]
    var frequency: js.UndefOr[Frequency]
    var statusMessage: js.UndefOr[ReplicationJobStatusMessage]
    var replicationRunList: js.UndefOr[ReplicationRunList]
  }

  object ReplicationJob {
    def apply(
      nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined,
      latestAmiId: js.UndefOr[AmiId] = js.undefined,
      licenseType: js.UndefOr[LicenseType] = js.undefined,
      state: js.UndefOr[ReplicationJobState] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      vmServer: js.UndefOr[VmServer] = js.undefined,
      serverId: js.UndefOr[ServerId] = js.undefined,
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
      serverType: js.UndefOr[ServerType] = js.undefined,
      seedReplicationTime: js.UndefOr[Timestamp] = js.undefined,
      frequency: js.UndefOr[Frequency] = js.undefined,
      statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.undefined,
      replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined): ReplicationJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextReplicationRunStartTime" -> nextReplicationRunStartTime.map { x => x.asInstanceOf[js.Any] },
        "latestAmiId" -> latestAmiId.map { x => x.asInstanceOf[js.Any] },
        "licenseType" -> licenseType.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "vmServer" -> vmServer.map { x => x.asInstanceOf[js.Any] },
        "serverId" -> serverId.map { x => x.asInstanceOf[js.Any] },
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] },
        "serverType" -> serverType.map { x => x.asInstanceOf[js.Any] },
        "seedReplicationTime" -> seedReplicationTime.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] },
        "replicationRunList" -> replicationRunList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationJob]
    }
  }

  /**
   * An active Replication Job already exists for the specified server.
   */
  @js.native
  trait ReplicationJobAlreadyExistsExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The specified Replication Job cannot be found.
   */
  @js.native
  trait ReplicationJobNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Current state of Replication Job
   */
  object ReplicationJobStateEnum {
    val PENDING = "PENDING"
    val ACTIVE = "ACTIVE"
    val FAILED = "FAILED"
    val DELETING = "DELETING"
    val DELETED = "DELETED"

    val values = IndexedSeq(PENDING, ACTIVE, FAILED, DELETING, DELETED)
  }

  /**
   * Object representing a Replication Run
   */
  @js.native
  trait ReplicationRun extends js.Object {
    var replicationRunId: js.UndefOr[ReplicationRunId]
    var state: js.UndefOr[ReplicationRunState]
    var description: js.UndefOr[Description]
    var scheduledStartTime: js.UndefOr[Timestamp]
    var amiId: js.UndefOr[AmiId]
    var `type`: js.UndefOr[ReplicationRunType]
    var statusMessage: js.UndefOr[ReplicationRunStatusMessage]
    var completedTime: js.UndefOr[Timestamp]
  }

  object ReplicationRun {
    def apply(
      replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined,
      state: js.UndefOr[ReplicationRunState] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      scheduledStartTime: js.UndefOr[Timestamp] = js.undefined,
      amiId: js.UndefOr[AmiId] = js.undefined,
      `type`: js.UndefOr[ReplicationRunType] = js.undefined,
      statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.undefined,
      completedTime: js.UndefOr[Timestamp] = js.undefined): ReplicationRun = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationRunId" -> replicationRunId.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "scheduledStartTime" -> scheduledStartTime.map { x => x.asInstanceOf[js.Any] },
        "amiId" -> amiId.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] },
        "completedTime" -> completedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationRun]
    }
  }

  /**
   * This user has exceeded the maximum allowed Replication Run limit.
   */
  @js.native
  trait ReplicationRunLimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Current state of Replication Run
   */
  object ReplicationRunStateEnum {
    val PENDING = "PENDING"
    val MISSED = "MISSED"
    val ACTIVE = "ACTIVE"
    val FAILED = "FAILED"
    val COMPLETED = "COMPLETED"
    val DELETING = "DELETING"
    val DELETED = "DELETED"

    val values = IndexedSeq(PENDING, MISSED, ACTIVE, FAILED, COMPLETED, DELETING, DELETED)
  }

  /**
   * Type of Replication Run
   */
  object ReplicationRunTypeEnum {
    val ON_DEMAND = "ON_DEMAND"
    val AUTOMATIC = "AUTOMATIC"

    val values = IndexedSeq(ON_DEMAND, AUTOMATIC)
  }

  /**
   * Object representing a server
   */
  @js.native
  trait Server extends js.Object {
    var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated]
    var vmServer: js.UndefOr[VmServer]
    var serverId: js.UndefOr[ServerId]
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var serverType: js.UndefOr[ServerType]
  }

  object Server {
    def apply(
      replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.undefined,
      vmServer: js.UndefOr[VmServer] = js.undefined,
      serverId: js.UndefOr[ServerId] = js.undefined,
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
      serverType: js.UndefOr[ServerType] = js.undefined): Server = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobTerminated" -> replicationJobTerminated.map { x => x.asInstanceOf[js.Any] },
        "vmServer" -> vmServer.map { x => x.asInstanceOf[js.Any] },
        "serverId" -> serverId.map { x => x.asInstanceOf[js.Any] },
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] },
        "serverType" -> serverType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Server]
    }
  }

  /**
   * The provided server cannot be replicated.
   */
  @js.native
  trait ServerCannotBeReplicatedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Status of Server catalog
   */
  object ServerCatalogStatusEnum {
    val NOT_IMPORTED = "NOT_IMPORTED"
    val IMPORTING = "IMPORTING"
    val AVAILABLE = "AVAILABLE"
    val DELETED = "DELETED"
    val EXPIRED = "EXPIRED"

    val values = IndexedSeq(NOT_IMPORTED, IMPORTING, AVAILABLE, DELETED, EXPIRED)
  }

  /**
   * Type of server.
   */
  object ServerTypeEnum {
    val VIRTUAL_MACHINE = "VIRTUAL_MACHINE"

    val values = IndexedSeq(VIRTUAL_MACHINE)
  }

  @js.native
  trait StartOnDemandReplicationRunRequest extends js.Object {
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var description: js.UndefOr[Description]
  }

  object StartOnDemandReplicationRunRequest {
    def apply(
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
      description: js.UndefOr[Description] = js.undefined): StartOnDemandReplicationRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOnDemandReplicationRunRequest]
    }
  }

  @js.native
  trait StartOnDemandReplicationRunResponse extends js.Object {
    var replicationRunId: js.UndefOr[ReplicationRunId]
  }

  object StartOnDemandReplicationRunResponse {
    def apply(
      replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined): StartOnDemandReplicationRunResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "replicationRunId" -> replicationRunId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOnDemandReplicationRunResponse]
    }
  }

  /**
   * This user does not have permissions to perform this operation.
   */
  @js.native
  trait UnauthorizedOperationExceptionException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait UpdateReplicationJobRequest extends js.Object {
    var nextReplicationRunStartTime: js.UndefOr[Timestamp]
    var licenseType: js.UndefOr[LicenseType]
    var description: js.UndefOr[Description]
    var roleName: js.UndefOr[RoleName]
    var replicationJobId: js.UndefOr[ReplicationJobId]
    var frequency: js.UndefOr[Frequency]
  }

  object UpdateReplicationJobRequest {
    def apply(
      nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined,
      licenseType: js.UndefOr[LicenseType] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      roleName: js.UndefOr[RoleName] = js.undefined,
      replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined,
      frequency: js.UndefOr[Frequency] = js.undefined): UpdateReplicationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextReplicationRunStartTime" -> nextReplicationRunStartTime.map { x => x.asInstanceOf[js.Any] },
        "licenseType" -> licenseType.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "roleName" -> roleName.map { x => x.asInstanceOf[js.Any] },
        "replicationJobId" -> replicationJobId.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReplicationJobRequest]
    }
  }

  @js.native
  trait UpdateReplicationJobResponse extends js.Object {

  }

  object UpdateReplicationJobResponse {
    def apply(): UpdateReplicationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReplicationJobResponse]
    }
  }

  /**
   * VM Management Product
   */
  object VmManagerTypeEnum {
    val VSPHERE = "VSPHERE"

    val values = IndexedSeq(VSPHERE)
  }

  /**
   * Object representing a VM server
   */
  @js.native
  trait VmServer extends js.Object {
    var vmServerAddress: js.UndefOr[VmServerAddress]
    var vmManagerType: js.UndefOr[VmManagerType]
    var vmPath: js.UndefOr[VmPath]
    var vmName: js.UndefOr[VmName]
    var vmManagerName: js.UndefOr[VmManagerName]
  }

  object VmServer {
    def apply(
      vmServerAddress: js.UndefOr[VmServerAddress] = js.undefined,
      vmManagerType: js.UndefOr[VmManagerType] = js.undefined,
      vmPath: js.UndefOr[VmPath] = js.undefined,
      vmName: js.UndefOr[VmName] = js.undefined,
      vmManagerName: js.UndefOr[VmManagerName] = js.undefined): VmServer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vmServerAddress" -> vmServerAddress.map { x => x.asInstanceOf[js.Any] },
        "vmManagerType" -> vmManagerType.map { x => x.asInstanceOf[js.Any] },
        "vmPath" -> vmPath.map { x => x.asInstanceOf[js.Any] },
        "vmName" -> vmName.map { x => x.asInstanceOf[js.Any] },
        "vmManagerName" -> vmManagerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VmServer]
    }
  }

  /**
   * Object representing a server's location
   */
  @js.native
  trait VmServerAddress extends js.Object {
    var vmManagerId: js.UndefOr[VmManagerId]
    var vmId: js.UndefOr[VmId]
  }

  object VmServerAddress {
    def apply(
      vmManagerId: js.UndefOr[VmManagerId] = js.undefined,
      vmId: js.UndefOr[VmId] = js.undefined): VmServerAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vmManagerId" -> vmManagerId.map { x => x.asInstanceOf[js.Any] },
        "vmId" -> vmId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VmServerAddress]
    }
  }
}
