package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object opsworkscm {
  type AWSOpsWorksCMResourceArn = String
  type AccountAttributes = js.Array[AccountAttribute]
  type AttributeName = String
  type AttributeValue = String
  type BackupId = String
  type BackupRetentionCountDefinition = Int
  type Backups = js.Array[Backup]
  type CustomCertificate = String
  type CustomDomain = String
  type CustomPrivateKey = String
  type EngineAttributeName = String
  type EngineAttributeValue = String
  type EngineAttributes = js.Array[EngineAttribute]
  type InstanceProfileArn = String
  type KeyPair = String
  type MaxResults = Int
  type NextToken = String
  type NodeAssociationStatusToken = String
  type NodeName = String
  type ServerEvents = js.Array[ServerEvent]
  type ServerName = String
  type Servers = js.Array[Server]
  type ServiceRoleArn = String
  type Strings = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimeWindowDefinition = String
  type Timestamp = js.Date

  implicit final class OpsWorksCMOps(private val service: OpsWorksCM) extends AnyVal {

    @inline def associateNodeFuture(params: AssociateNodeRequest): Future[AssociateNodeResponse] = service.associateNode(params).promise().toFuture
    @inline def createBackupFuture(params: CreateBackupRequest): Future[CreateBackupResponse] = service.createBackup(params).promise().toFuture
    @inline def createServerFuture(params: CreateServerRequest): Future[CreateServerResponse] = service.createServer(params).promise().toFuture
    @inline def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] = service.deleteBackup(params).promise().toFuture
    @inline def deleteServerFuture(params: DeleteServerRequest): Future[DeleteServerResponse] = service.deleteServer(params).promise().toFuture
    @inline def describeAccountAttributesFuture(params: DescribeAccountAttributesRequest): Future[DescribeAccountAttributesResponse] = service.describeAccountAttributes(params).promise().toFuture
    @inline def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] = service.describeBackups(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsRequest): Future[DescribeEventsResponse] = service.describeEvents(params).promise().toFuture
    @inline def describeNodeAssociationStatusFuture(params: DescribeNodeAssociationStatusRequest): Future[DescribeNodeAssociationStatusResponse] = service.describeNodeAssociationStatus(params).promise().toFuture
    @inline def describeServersFuture(params: DescribeServersRequest): Future[DescribeServersResponse] = service.describeServers(params).promise().toFuture
    @inline def disassociateNodeFuture(params: DisassociateNodeRequest): Future[DisassociateNodeResponse] = service.disassociateNode(params).promise().toFuture
    @inline def exportServerEngineAttributeFuture(params: ExportServerEngineAttributeRequest): Future[ExportServerEngineAttributeResponse] = service.exportServerEngineAttribute(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def restoreServerFuture(params: RestoreServerRequest): Future[RestoreServerResponse] = service.restoreServer(params).promise().toFuture
    @inline def startMaintenanceFuture(params: StartMaintenanceRequest): Future[StartMaintenanceResponse] = service.startMaintenance(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateServerEngineAttributesFuture(params: UpdateServerEngineAttributesRequest): Future[UpdateServerEngineAttributesResponse] = service.updateServerEngineAttributes(params).promise().toFuture
    @inline def updateServerFuture(params: UpdateServerRequest): Future[UpdateServerResponse] = service.updateServer(params).promise().toFuture
  }
}

package opsworkscm {
  @js.native
  @JSImport("aws-sdk", "OpsWorksCM", "AWS.OpsWorksCM")
  class OpsWorksCM() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateNode(params: AssociateNodeRequest): Request[AssociateNodeResponse] = js.native
    def createBackup(params: CreateBackupRequest): Request[CreateBackupResponse] = js.native
    def createServer(params: CreateServerRequest): Request[CreateServerResponse] = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse] = js.native
    def deleteServer(params: DeleteServerRequest): Request[DeleteServerResponse] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesRequest): Request[DescribeAccountAttributesResponse] = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse] = js.native
    def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse] = js.native
    def describeNodeAssociationStatus(params: DescribeNodeAssociationStatusRequest): Request[DescribeNodeAssociationStatusResponse] = js.native
    def describeServers(params: DescribeServersRequest): Request[DescribeServersResponse] = js.native
    def disassociateNode(params: DisassociateNodeRequest): Request[DisassociateNodeResponse] = js.native
    def exportServerEngineAttribute(params: ExportServerEngineAttributeRequest): Request[ExportServerEngineAttributeResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def restoreServer(params: RestoreServerRequest): Request[RestoreServerResponse] = js.native
    def startMaintenance(params: StartMaintenanceRequest): Request[StartMaintenanceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse] = js.native
    def updateServerEngineAttributes(params: UpdateServerEngineAttributesRequest): Request[UpdateServerEngineAttributesResponse] = js.native
  }

  /**
    * Stores account attributes.
    */
  @js.native
  trait AccountAttribute extends js.Object {
    var Maximum: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var Used: js.UndefOr[Int]
  }

  object AccountAttribute {
    @inline
    def apply(
        Maximum: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Used: js.UndefOr[Int] = js.undefined
    ): AccountAttribute = {
      val __obj = js.Dynamic.literal()
      Maximum.foreach(__v => __obj.updateDynamic("Maximum")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Used.foreach(__v => __obj.updateDynamic("Used")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAttribute]
    }
  }

  @js.native
  trait AssociateNodeRequest extends js.Object {
    var EngineAttributes: EngineAttributes
    var NodeName: NodeName
    var ServerName: ServerName
  }

  object AssociateNodeRequest {
    @inline
    def apply(
        EngineAttributes: EngineAttributes,
        NodeName: NodeName,
        ServerName: ServerName
    ): AssociateNodeRequest = {
      val __obj = js.Dynamic.literal(
        "EngineAttributes" -> EngineAttributes.asInstanceOf[js.Any],
        "NodeName" -> NodeName.asInstanceOf[js.Any],
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateNodeRequest]
    }
  }

  @js.native
  trait AssociateNodeResponse extends js.Object {
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken]
  }

  object AssociateNodeResponse {
    @inline
    def apply(
        NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken] = js.undefined
    ): AssociateNodeResponse = {
      val __obj = js.Dynamic.literal()
      NodeAssociationStatusToken.foreach(__v => __obj.updateDynamic("NodeAssociationStatusToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateNodeResponse]
    }
  }

  /**
    * Describes a single backup.
    */
  @js.native
  trait Backup extends js.Object {
    var BackupArn: js.UndefOr[String]
    var BackupId: js.UndefOr[BackupId]
    var BackupType: js.UndefOr[BackupType]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineModel: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var InstanceProfileArn: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var KeyPair: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
    var S3DataSize: js.UndefOr[Int]
    var S3DataUrl: js.UndefOr[String]
    var S3LogUrl: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[Strings]
    var ServerName: js.UndefOr[ServerName]
    var ServiceRoleArn: js.UndefOr[String]
    var Status: js.UndefOr[BackupStatus]
    var StatusDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[Strings]
    var ToolsVersion: js.UndefOr[String]
    var UserArn: js.UndefOr[String]
  }

  object Backup {
    @inline
    def apply(
        BackupArn: js.UndefOr[String] = js.undefined,
        BackupId: js.UndefOr[BackupId] = js.undefined,
        BackupType: js.UndefOr[BackupType] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineModel: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        InstanceProfileArn: js.UndefOr[String] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        KeyPair: js.UndefOr[String] = js.undefined,
        PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
        S3DataSize: js.UndefOr[Int] = js.undefined,
        S3DataUrl: js.UndefOr[String] = js.undefined,
        S3LogUrl: js.UndefOr[String] = js.undefined,
        SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
        ServerName: js.UndefOr[ServerName] = js.undefined,
        ServiceRoleArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[BackupStatus] = js.undefined,
        StatusDescription: js.UndefOr[String] = js.undefined,
        SubnetIds: js.UndefOr[Strings] = js.undefined,
        ToolsVersion: js.UndefOr[String] = js.undefined,
        UserArn: js.UndefOr[String] = js.undefined
    ): Backup = {
      val __obj = js.Dynamic.literal()
      BackupArn.foreach(__v => __obj.updateDynamic("BackupArn")(__v.asInstanceOf[js.Any]))
      BackupId.foreach(__v => __obj.updateDynamic("BackupId")(__v.asInstanceOf[js.Any]))
      BackupType.foreach(__v => __obj.updateDynamic("BackupType")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineModel.foreach(__v => __obj.updateDynamic("EngineModel")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      InstanceProfileArn.foreach(__v => __obj.updateDynamic("InstanceProfileArn")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      KeyPair.foreach(__v => __obj.updateDynamic("KeyPair")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      S3DataSize.foreach(__v => __obj.updateDynamic("S3DataSize")(__v.asInstanceOf[js.Any]))
      S3DataUrl.foreach(__v => __obj.updateDynamic("S3DataUrl")(__v.asInstanceOf[js.Any]))
      S3LogUrl.foreach(__v => __obj.updateDynamic("S3LogUrl")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDescription.foreach(__v => __obj.updateDynamic("StatusDescription")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      ToolsVersion.foreach(__v => __obj.updateDynamic("ToolsVersion")(__v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Backup]
    }
  }

  @js.native
  sealed trait BackupStatus extends js.Any
  object BackupStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[BackupStatus]
    val OK = "OK".asInstanceOf[BackupStatus]
    val FAILED = "FAILED".asInstanceOf[BackupStatus]
    val DELETING = "DELETING".asInstanceOf[BackupStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(IN_PROGRESS, OK, FAILED, DELETING))
  }

  @js.native
  sealed trait BackupType extends js.Any
  object BackupType {
    val AUTOMATED = "AUTOMATED".asInstanceOf[BackupType]
    val MANUAL = "MANUAL".asInstanceOf[BackupType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AUTOMATED, MANUAL))
  }

  @js.native
  trait CreateBackupRequest extends js.Object {
    var ServerName: ServerName
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateBackupRequest {
    @inline
    def apply(
        ServerName: ServerName,
        Description: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateBackupRequest = {
      val __obj = js.Dynamic.literal(
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupRequest]
    }
  }

  @js.native
  trait CreateBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object CreateBackupResponse {
    @inline
    def apply(
        Backup: js.UndefOr[Backup] = js.undefined
    ): CreateBackupResponse = {
      val __obj = js.Dynamic.literal()
      Backup.foreach(__v => __obj.updateDynamic("Backup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupResponse]
    }
  }

  @js.native
  trait CreateServerRequest extends js.Object {
    var Engine: String
    var InstanceProfileArn: InstanceProfileArn
    var InstanceType: String
    var ServerName: ServerName
    var ServiceRoleArn: ServiceRoleArn
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var BackupId: js.UndefOr[BackupId]
    var BackupRetentionCount: js.UndefOr[BackupRetentionCountDefinition]
    var CustomCertificate: js.UndefOr[CustomCertificate]
    var CustomDomain: js.UndefOr[CustomDomain]
    var CustomPrivateKey: js.UndefOr[CustomPrivateKey]
    var DisableAutomatedBackup: js.UndefOr[Boolean]
    var EngineAttributes: js.UndefOr[EngineAttributes]
    var EngineModel: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var KeyPair: js.UndefOr[KeyPair]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
    var SecurityGroupIds: js.UndefOr[Strings]
    var SubnetIds: js.UndefOr[Strings]
    var Tags: js.UndefOr[TagList]
  }

  object CreateServerRequest {
    @inline
    def apply(
        Engine: String,
        InstanceProfileArn: InstanceProfileArn,
        InstanceType: String,
        ServerName: ServerName,
        ServiceRoleArn: ServiceRoleArn,
        AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
        BackupId: js.UndefOr[BackupId] = js.undefined,
        BackupRetentionCount: js.UndefOr[BackupRetentionCountDefinition] = js.undefined,
        CustomCertificate: js.UndefOr[CustomCertificate] = js.undefined,
        CustomDomain: js.UndefOr[CustomDomain] = js.undefined,
        CustomPrivateKey: js.UndefOr[CustomPrivateKey] = js.undefined,
        DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined,
        EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined,
        EngineModel: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KeyPair: js.UndefOr[KeyPair] = js.undefined,
        PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
        SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
        SubnetIds: js.UndefOr[Strings] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateServerRequest = {
      val __obj = js.Dynamic.literal(
        "Engine" -> Engine.asInstanceOf[js.Any],
        "InstanceProfileArn" -> InstanceProfileArn.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "ServerName" -> ServerName.asInstanceOf[js.Any],
        "ServiceRoleArn" -> ServiceRoleArn.asInstanceOf[js.Any]
      )

      AssociatePublicIpAddress.foreach(__v => __obj.updateDynamic("AssociatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      BackupId.foreach(__v => __obj.updateDynamic("BackupId")(__v.asInstanceOf[js.Any]))
      BackupRetentionCount.foreach(__v => __obj.updateDynamic("BackupRetentionCount")(__v.asInstanceOf[js.Any]))
      CustomCertificate.foreach(__v => __obj.updateDynamic("CustomCertificate")(__v.asInstanceOf[js.Any]))
      CustomDomain.foreach(__v => __obj.updateDynamic("CustomDomain")(__v.asInstanceOf[js.Any]))
      CustomPrivateKey.foreach(__v => __obj.updateDynamic("CustomPrivateKey")(__v.asInstanceOf[js.Any]))
      DisableAutomatedBackup.foreach(__v => __obj.updateDynamic("DisableAutomatedBackup")(__v.asInstanceOf[js.Any]))
      EngineAttributes.foreach(__v => __obj.updateDynamic("EngineAttributes")(__v.asInstanceOf[js.Any]))
      EngineModel.foreach(__v => __obj.updateDynamic("EngineModel")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      KeyPair.foreach(__v => __obj.updateDynamic("KeyPair")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServerRequest]
    }
  }

  @js.native
  trait CreateServerResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  object CreateServerResponse {
    @inline
    def apply(
        Server: js.UndefOr[Server] = js.undefined
    ): CreateServerResponse = {
      val __obj = js.Dynamic.literal()
      Server.foreach(__v => __obj.updateDynamic("Server")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServerResponse]
    }
  }

  @js.native
  trait DeleteBackupRequest extends js.Object {
    var BackupId: BackupId
  }

  object DeleteBackupRequest {
    @inline
    def apply(
        BackupId: BackupId
    ): DeleteBackupRequest = {
      val __obj = js.Dynamic.literal(
        "BackupId" -> BackupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBackupRequest]
    }
  }

  @js.native
  trait DeleteBackupResponse extends js.Object {}

  object DeleteBackupResponse {
    @inline
    def apply(
    ): DeleteBackupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteBackupResponse]
    }
  }

  @js.native
  trait DeleteServerRequest extends js.Object {
    var ServerName: ServerName
  }

  object DeleteServerRequest {
    @inline
    def apply(
        ServerName: ServerName
    ): DeleteServerRequest = {
      val __obj = js.Dynamic.literal(
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteServerRequest]
    }
  }

  @js.native
  trait DeleteServerResponse extends js.Object {}

  object DeleteServerResponse {
    @inline
    def apply(
    ): DeleteServerResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteServerResponse]
    }
  }

  @js.native
  trait DescribeAccountAttributesRequest extends js.Object {}

  object DescribeAccountAttributesRequest {
    @inline
    def apply(
    ): DescribeAccountAttributesRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeAccountAttributesRequest]
    }
  }

  @js.native
  trait DescribeAccountAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AccountAttributes]
  }

  object DescribeAccountAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[AccountAttributes] = js.undefined
    ): DescribeAccountAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAttributesResponse]
    }
  }

  @js.native
  trait DescribeBackupsRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServerName: js.UndefOr[ServerName]
  }

  object DescribeBackupsRequest {
    @inline
    def apply(
        BackupId: js.UndefOr[BackupId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServerName: js.UndefOr[ServerName] = js.undefined
    ): DescribeBackupsRequest = {
      val __obj = js.Dynamic.literal()
      BackupId.foreach(__v => __obj.updateDynamic("BackupId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupsRequest]
    }
  }

  @js.native
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[String]
  }

  object DescribeBackupsResponse {
    @inline
    def apply(
        Backups: js.UndefOr[Backups] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeBackupsResponse = {
      val __obj = js.Dynamic.literal()
      Backups.foreach(__v => __obj.updateDynamic("Backups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupsResponse]
    }
  }

  @js.native
  trait DescribeEventsRequest extends js.Object {
    var ServerName: ServerName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeEventsRequest {
    @inline
    def apply(
        ServerName: ServerName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeEventsRequest = {
      val __obj = js.Dynamic.literal(
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsRequest]
    }
  }

  @js.native
  trait DescribeEventsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ServerEvents: js.UndefOr[ServerEvents]
  }

  object DescribeEventsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ServerEvents: js.UndefOr[ServerEvents] = js.undefined
    ): DescribeEventsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServerEvents.foreach(__v => __obj.updateDynamic("ServerEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsResponse]
    }
  }

  @js.native
  trait DescribeNodeAssociationStatusRequest extends js.Object {
    var NodeAssociationStatusToken: NodeAssociationStatusToken
    var ServerName: ServerName
  }

  object DescribeNodeAssociationStatusRequest {
    @inline
    def apply(
        NodeAssociationStatusToken: NodeAssociationStatusToken,
        ServerName: ServerName
    ): DescribeNodeAssociationStatusRequest = {
      val __obj = js.Dynamic.literal(
        "NodeAssociationStatusToken" -> NodeAssociationStatusToken.asInstanceOf[js.Any],
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeNodeAssociationStatusRequest]
    }
  }

  @js.native
  trait DescribeNodeAssociationStatusResponse extends js.Object {
    var EngineAttributes: js.UndefOr[EngineAttributes]
    var NodeAssociationStatus: js.UndefOr[NodeAssociationStatus]
  }

  object DescribeNodeAssociationStatusResponse {
    @inline
    def apply(
        EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined,
        NodeAssociationStatus: js.UndefOr[NodeAssociationStatus] = js.undefined
    ): DescribeNodeAssociationStatusResponse = {
      val __obj = js.Dynamic.literal()
      EngineAttributes.foreach(__v => __obj.updateDynamic("EngineAttributes")(__v.asInstanceOf[js.Any]))
      NodeAssociationStatus.foreach(__v => __obj.updateDynamic("NodeAssociationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNodeAssociationStatusResponse]
    }
  }

  @js.native
  trait DescribeServersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServerName: js.UndefOr[ServerName]
  }

  object DescribeServersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServerName: js.UndefOr[ServerName] = js.undefined
    ): DescribeServersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServersRequest]
    }
  }

  @js.native
  trait DescribeServersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Servers: js.UndefOr[Servers]
  }

  object DescribeServersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Servers: js.UndefOr[Servers] = js.undefined
    ): DescribeServersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Servers.foreach(__v => __obj.updateDynamic("Servers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServersResponse]
    }
  }

  @js.native
  trait DisassociateNodeRequest extends js.Object {
    var NodeName: NodeName
    var ServerName: ServerName
    var EngineAttributes: js.UndefOr[EngineAttributes]
  }

  object DisassociateNodeRequest {
    @inline
    def apply(
        NodeName: NodeName,
        ServerName: ServerName,
        EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined
    ): DisassociateNodeRequest = {
      val __obj = js.Dynamic.literal(
        "NodeName" -> NodeName.asInstanceOf[js.Any],
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      EngineAttributes.foreach(__v => __obj.updateDynamic("EngineAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateNodeRequest]
    }
  }

  @js.native
  trait DisassociateNodeResponse extends js.Object {
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken]
  }

  object DisassociateNodeResponse {
    @inline
    def apply(
        NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken] = js.undefined
    ): DisassociateNodeResponse = {
      val __obj = js.Dynamic.literal()
      NodeAssociationStatusToken.foreach(__v => __obj.updateDynamic("NodeAssociationStatusToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateNodeResponse]
    }
  }

  /**
    * A name and value pair that is specific to the engine of the server.
    */
  @js.native
  trait EngineAttribute extends js.Object {
    var Name: js.UndefOr[EngineAttributeName]
    var Value: js.UndefOr[EngineAttributeValue]
  }

  object EngineAttribute {
    @inline
    def apply(
        Name: js.UndefOr[EngineAttributeName] = js.undefined,
        Value: js.UndefOr[EngineAttributeValue] = js.undefined
    ): EngineAttribute = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineAttribute]
    }
  }

  @js.native
  trait ExportServerEngineAttributeRequest extends js.Object {
    var ExportAttributeName: String
    var ServerName: ServerName
    var InputAttributes: js.UndefOr[EngineAttributes]
  }

  object ExportServerEngineAttributeRequest {
    @inline
    def apply(
        ExportAttributeName: String,
        ServerName: ServerName,
        InputAttributes: js.UndefOr[EngineAttributes] = js.undefined
    ): ExportServerEngineAttributeRequest = {
      val __obj = js.Dynamic.literal(
        "ExportAttributeName" -> ExportAttributeName.asInstanceOf[js.Any],
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      InputAttributes.foreach(__v => __obj.updateDynamic("InputAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportServerEngineAttributeRequest]
    }
  }

  @js.native
  trait ExportServerEngineAttributeResponse extends js.Object {
    var EngineAttribute: js.UndefOr[EngineAttribute]
    var ServerName: js.UndefOr[ServerName]
  }

  object ExportServerEngineAttributeResponse {
    @inline
    def apply(
        EngineAttribute: js.UndefOr[EngineAttribute] = js.undefined,
        ServerName: js.UndefOr[ServerName] = js.undefined
    ): ExportServerEngineAttributeResponse = {
      val __obj = js.Dynamic.literal()
      EngineAttribute.foreach(__v => __obj.updateDynamic("EngineAttribute")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportServerEngineAttributeResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AWSOpsWorksCMResourceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AWSOpsWorksCMResourceArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait MaintenanceStatus extends js.Any
  object MaintenanceStatus {
    val SUCCESS = "SUCCESS".asInstanceOf[MaintenanceStatus]
    val FAILED = "FAILED".asInstanceOf[MaintenanceStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SUCCESS, FAILED))
  }

  /**
    * The status of the association or disassociation request.
    *  <p class="title"> ```Possible values:``` </p>* <code>SUCCESS</code>: The association or disassociation succeeded.
    *  * <code>FAILED</code>: The association or disassociation failed.
    *  * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
    */
  @js.native
  sealed trait NodeAssociationStatus extends js.Any
  object NodeAssociationStatus {
    val SUCCESS = "SUCCESS".asInstanceOf[NodeAssociationStatus]
    val FAILED = "FAILED".asInstanceOf[NodeAssociationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[NodeAssociationStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SUCCESS, FAILED, IN_PROGRESS))
  }

  @js.native
  trait RestoreServerRequest extends js.Object {
    var BackupId: BackupId
    var ServerName: ServerName
    var InstanceType: js.UndefOr[String]
    var KeyPair: js.UndefOr[KeyPair]
  }

  object RestoreServerRequest {
    @inline
    def apply(
        BackupId: BackupId,
        ServerName: ServerName,
        InstanceType: js.UndefOr[String] = js.undefined,
        KeyPair: js.UndefOr[KeyPair] = js.undefined
    ): RestoreServerRequest = {
      val __obj = js.Dynamic.literal(
        "BackupId" -> BackupId.asInstanceOf[js.Any],
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      KeyPair.foreach(__v => __obj.updateDynamic("KeyPair")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreServerRequest]
    }
  }

  @js.native
  trait RestoreServerResponse extends js.Object {}

  object RestoreServerResponse {
    @inline
    def apply(
    ): RestoreServerResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RestoreServerResponse]
    }
  }

  /**
    * Describes a configuration management server.
    */
  @js.native
  trait Server extends js.Object {
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var BackupRetentionCount: js.UndefOr[Int]
    var CloudFormationStackArn: js.UndefOr[String]
    var CreatedAt: js.UndefOr[Timestamp]
    var CustomDomain: js.UndefOr[CustomDomain]
    var DisableAutomatedBackup: js.UndefOr[Boolean]
    var Endpoint: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineAttributes: js.UndefOr[EngineAttributes]
    var EngineModel: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var InstanceProfileArn: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var KeyPair: js.UndefOr[String]
    var MaintenanceStatus: js.UndefOr[MaintenanceStatus]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
    var SecurityGroupIds: js.UndefOr[Strings]
    var ServerArn: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
    var ServiceRoleArn: js.UndefOr[String]
    var Status: js.UndefOr[ServerStatus]
    var StatusReason: js.UndefOr[String]
    var SubnetIds: js.UndefOr[Strings]
  }

  object Server {
    @inline
    def apply(
        AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
        BackupRetentionCount: js.UndefOr[Int] = js.undefined,
        CloudFormationStackArn: js.UndefOr[String] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        CustomDomain: js.UndefOr[CustomDomain] = js.undefined,
        DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined,
        Endpoint: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined,
        EngineModel: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        InstanceProfileArn: js.UndefOr[String] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        KeyPair: js.UndefOr[String] = js.undefined,
        MaintenanceStatus: js.UndefOr[MaintenanceStatus] = js.undefined,
        PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
        SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
        ServerArn: js.UndefOr[String] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServiceRoleArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ServerStatus] = js.undefined,
        StatusReason: js.UndefOr[String] = js.undefined,
        SubnetIds: js.UndefOr[Strings] = js.undefined
    ): Server = {
      val __obj = js.Dynamic.literal()
      AssociatePublicIpAddress.foreach(__v => __obj.updateDynamic("AssociatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      BackupRetentionCount.foreach(__v => __obj.updateDynamic("BackupRetentionCount")(__v.asInstanceOf[js.Any]))
      CloudFormationStackArn.foreach(__v => __obj.updateDynamic("CloudFormationStackArn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CustomDomain.foreach(__v => __obj.updateDynamic("CustomDomain")(__v.asInstanceOf[js.Any]))
      DisableAutomatedBackup.foreach(__v => __obj.updateDynamic("DisableAutomatedBackup")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineAttributes.foreach(__v => __obj.updateDynamic("EngineAttributes")(__v.asInstanceOf[js.Any]))
      EngineModel.foreach(__v => __obj.updateDynamic("EngineModel")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      InstanceProfileArn.foreach(__v => __obj.updateDynamic("InstanceProfileArn")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      KeyPair.foreach(__v => __obj.updateDynamic("KeyPair")(__v.asInstanceOf[js.Any]))
      MaintenanceStatus.foreach(__v => __obj.updateDynamic("MaintenanceStatus")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      ServerArn.foreach(__v => __obj.updateDynamic("ServerArn")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      ServiceRoleArn.foreach(__v => __obj.updateDynamic("ServiceRoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Server]
    }
  }

  /**
    * An event that is related to the server, such as the start of maintenance or backup.
    */
  @js.native
  trait ServerEvent extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var LogUrl: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
  }

  object ServerEvent {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        LogUrl: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined
    ): ServerEvent = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      LogUrl.foreach(__v => __obj.updateDynamic("LogUrl")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerEvent]
    }
  }

  @js.native
  sealed trait ServerStatus extends js.Any
  object ServerStatus {
    val BACKING_UP = "BACKING_UP".asInstanceOf[ServerStatus]
    val CONNECTION_LOST = "CONNECTION_LOST".asInstanceOf[ServerStatus]
    val CREATING = "CREATING".asInstanceOf[ServerStatus]
    val DELETING = "DELETING".asInstanceOf[ServerStatus]
    val MODIFYING = "MODIFYING".asInstanceOf[ServerStatus]
    val FAILED = "FAILED".asInstanceOf[ServerStatus]
    val HEALTHY = "HEALTHY".asInstanceOf[ServerStatus]
    val RUNNING = "RUNNING".asInstanceOf[ServerStatus]
    val RESTORING = "RESTORING".asInstanceOf[ServerStatus]
    val SETUP = "SETUP".asInstanceOf[ServerStatus]
    val UNDER_MAINTENANCE = "UNDER_MAINTENANCE".asInstanceOf[ServerStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[ServerStatus]
    val TERMINATED = "TERMINATED".asInstanceOf[ServerStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(BACKING_UP, CONNECTION_LOST, CREATING, DELETING, MODIFYING, FAILED, HEALTHY, RUNNING, RESTORING, SETUP, UNDER_MAINTENANCE, UNHEALTHY, TERMINATED))
  }

  @js.native
  trait StartMaintenanceRequest extends js.Object {
    var ServerName: ServerName
    var EngineAttributes: js.UndefOr[EngineAttributes]
  }

  object StartMaintenanceRequest {
    @inline
    def apply(
        ServerName: ServerName,
        EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined
    ): StartMaintenanceRequest = {
      val __obj = js.Dynamic.literal(
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      EngineAttributes.foreach(__v => __obj.updateDynamic("EngineAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMaintenanceRequest]
    }
  }

  @js.native
  trait StartMaintenanceResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  object StartMaintenanceResponse {
    @inline
    def apply(
        Server: js.UndefOr[Server] = js.undefined
    ): StartMaintenanceResponse = {
      val __obj = js.Dynamic.literal()
      Server.foreach(__v => __obj.updateDynamic("Server")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMaintenanceResponse]
    }
  }

  /**
    * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet Enterprise server. Leading and trailing white spaces are trimmed from both the key and value. A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AWSOpsWorksCMResourceArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AWSOpsWorksCMResourceArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AWSOpsWorksCMResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AWSOpsWorksCMResourceArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateServerEngineAttributesRequest extends js.Object {
    var AttributeName: AttributeName
    var ServerName: ServerName
    var AttributeValue: js.UndefOr[AttributeValue]
  }

  object UpdateServerEngineAttributesRequest {
    @inline
    def apply(
        AttributeName: AttributeName,
        ServerName: ServerName,
        AttributeValue: js.UndefOr[AttributeValue] = js.undefined
    ): UpdateServerEngineAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      AttributeValue.foreach(__v => __obj.updateDynamic("AttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServerEngineAttributesRequest]
    }
  }

  @js.native
  trait UpdateServerEngineAttributesResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  object UpdateServerEngineAttributesResponse {
    @inline
    def apply(
        Server: js.UndefOr[Server] = js.undefined
    ): UpdateServerEngineAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Server.foreach(__v => __obj.updateDynamic("Server")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServerEngineAttributesResponse]
    }
  }

  @js.native
  trait UpdateServerRequest extends js.Object {
    var ServerName: ServerName
    var BackupRetentionCount: js.UndefOr[Int]
    var DisableAutomatedBackup: js.UndefOr[Boolean]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
  }

  object UpdateServerRequest {
    @inline
    def apply(
        ServerName: ServerName,
        BackupRetentionCount: js.UndefOr[Int] = js.undefined,
        DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined,
        PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    ): UpdateServerRequest = {
      val __obj = js.Dynamic.literal(
        "ServerName" -> ServerName.asInstanceOf[js.Any]
      )

      BackupRetentionCount.foreach(__v => __obj.updateDynamic("BackupRetentionCount")(__v.asInstanceOf[js.Any]))
      DisableAutomatedBackup.foreach(__v => __obj.updateDynamic("DisableAutomatedBackup")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServerRequest]
    }
  }

  @js.native
  trait UpdateServerResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  object UpdateServerResponse {
    @inline
    def apply(
        Server: js.UndefOr[Server] = js.undefined
    ): UpdateServerResponse = {
      val __obj = js.Dynamic.literal()
      Server.foreach(__v => __obj.updateDynamic("Server")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServerResponse]
    }
  }
}
