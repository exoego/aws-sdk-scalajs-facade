package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object opsworkscm {
  type AccountAttributes = js.Array[AccountAttribute]
  type AttributeName = String
  type AttributeValue = String
  type BackupId = String
  type BackupRetentionCountDefinition = Int
  type BackupStatus = String
  type BackupType = String
  type Backups = js.Array[Backup]
  type EngineAttributeName = String
  type EngineAttributeValue = String
  type EngineAttributes = js.Array[EngineAttribute]
  type InstanceProfileArn = String
  type KeyPair = String
  type MaintenanceStatus = String
  type MaxResults = Int
  type NextToken = String
  type NodeAssociationStatus = String
  type NodeAssociationStatusToken = String
  type NodeName = String
  type ServerEvents = js.Array[ServerEvent]
  type ServerName = String
  type ServerStatus = String
  type Servers = js.Array[Server]
  type ServiceRoleArn = String
  type Strings = js.Array[String]
  type TimeWindowDefinition = String
  type Timestamp = js.Date
}

package opsworkscm {
  @js.native
  @JSImport("aws-sdk", "OpsWorksCM")
  class OpsWorksCM(config: AWSConfig) extends js.Object {
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
    def restoreServer(params: RestoreServerRequest): Request[RestoreServerResponse] = js.native
    def startMaintenance(params: StartMaintenanceRequest): Request[StartMaintenanceResponse] = js.native
    def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse] = js.native
    def updateServerEngineAttributes(params: UpdateServerEngineAttributesRequest): Request[UpdateServerEngineAttributesResponse] = js.native
  }

  /**
   * <p>Stores account attributes. </p>
   */
  @js.native
  trait AccountAttribute extends js.Object {
    var Name: js.UndefOr[String]
    var Maximum: js.UndefOr[Int]
    var Used: js.UndefOr[Int]
  }

  object AccountAttribute {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Maximum: js.UndefOr[Int] = js.undefined,
      Used: js.UndefOr[Int] = js.undefined): AccountAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Maximum" -> Maximum.map { x => x.asInstanceOf[js.Any] },
        "Used" -> Used.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttribute]
    }
  }

  @js.native
  trait AssociateNodeRequest extends js.Object {
    var ServerName: js.UndefOr[ServerName]
    var NodeName: js.UndefOr[NodeName]
    var EngineAttributes: js.UndefOr[EngineAttributes]
  }

  object AssociateNodeRequest {
    def apply(
      ServerName: js.UndefOr[ServerName] = js.undefined,
      NodeName: js.UndefOr[NodeName] = js.undefined,
      EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined): AssociateNodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "NodeName" -> NodeName.map { x => x.asInstanceOf[js.Any] },
        "EngineAttributes" -> EngineAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateNodeRequest]
    }
  }

  @js.native
  trait AssociateNodeResponse extends js.Object {
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken]
  }

  object AssociateNodeResponse {
    def apply(
      NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken] = js.undefined): AssociateNodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeAssociationStatusToken" -> NodeAssociationStatusToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateNodeResponse]
    }
  }

  /**
   * <p>Describes a single backup. </p>
   */
  @js.native
  trait Backup extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
    var S3DataUrl: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var KeyPair: js.UndefOr[String]
    var InstanceProfileArn: js.UndefOr[String]
    var S3LogUrl: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var ServerName: js.UndefOr[ServerName]
    var S3DataSize: js.UndefOr[Int]
    var ServiceRoleArn: js.UndefOr[String]
    var BackupId: js.UndefOr[BackupId]
    var SecurityGroupIds: js.UndefOr[Strings]
    var EngineVersion: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var InstanceType: js.UndefOr[String]
    var StatusDescription: js.UndefOr[String]
    var CreatedAt: js.UndefOr[Timestamp]
    var SubnetIds: js.UndefOr[Strings]
    var BackupType: js.UndefOr[BackupType]
    var BackupArn: js.UndefOr[String]
    var ToolsVersion: js.UndefOr[String]
    var EngineModel: js.UndefOr[String]
    var UserArn: js.UndefOr[String]
    var Status: js.UndefOr[BackupStatus]
  }

  object Backup {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
      S3DataUrl: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      KeyPair: js.UndefOr[String] = js.undefined,
      InstanceProfileArn: js.UndefOr[String] = js.undefined,
      S3LogUrl: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ServerName: js.UndefOr[ServerName] = js.undefined,
      S3DataSize: js.UndefOr[Int] = js.undefined,
      ServiceRoleArn: js.UndefOr[String] = js.undefined,
      BackupId: js.UndefOr[BackupId] = js.undefined,
      SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      StatusDescription: js.UndefOr[String] = js.undefined,
      CreatedAt: js.UndefOr[Timestamp] = js.undefined,
      SubnetIds: js.UndefOr[Strings] = js.undefined,
      BackupType: js.UndefOr[BackupType] = js.undefined,
      BackupArn: js.UndefOr[String] = js.undefined,
      ToolsVersion: js.UndefOr[String] = js.undefined,
      EngineModel: js.UndefOr[String] = js.undefined,
      UserArn: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[BackupStatus] = js.undefined): Backup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "S3DataUrl" -> S3DataUrl.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "KeyPair" -> KeyPair.map { x => x.asInstanceOf[js.Any] },
        "InstanceProfileArn" -> InstanceProfileArn.map { x => x.asInstanceOf[js.Any] },
        "S3LogUrl" -> S3LogUrl.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "S3DataSize" -> S3DataSize.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "StatusDescription" -> StatusDescription.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "BackupType" -> BackupType.map { x => x.asInstanceOf[js.Any] },
        "BackupArn" -> BackupArn.map { x => x.asInstanceOf[js.Any] },
        "ToolsVersion" -> ToolsVersion.map { x => x.asInstanceOf[js.Any] },
        "EngineModel" -> EngineModel.map { x => x.asInstanceOf[js.Any] },
        "UserArn" -> UserArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Backup]
    }
  }

  object BackupStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val OK = "OK"
    val FAILED = "FAILED"
    val DELETING = "DELETING"

    val values = IndexedSeq(IN_PROGRESS, OK, FAILED, DELETING)
  }

  object BackupTypeEnum {
    val AUTOMATED = "AUTOMATED"
    val MANUAL = "MANUAL"

    val values = IndexedSeq(AUTOMATED, MANUAL)
  }

  @js.native
  trait CreateBackupRequest extends js.Object {
    var ServerName: js.UndefOr[ServerName]
    var Description: js.UndefOr[String]
  }

  object CreateBackupRequest {
    def apply(
      ServerName: js.UndefOr[ServerName] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): CreateBackupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBackupRequest]
    }
  }

  @js.native
  trait CreateBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object CreateBackupResponse {
    def apply(
      Backup: js.UndefOr[Backup] = js.undefined): CreateBackupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backup" -> Backup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBackupResponse]
    }
  }

  @js.native
  trait CreateServerRequest extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
    var Engine: js.UndefOr[String]
    var KeyPair: js.UndefOr[KeyPair]
    var InstanceProfileArn: js.UndefOr[InstanceProfileArn]
    var EngineAttributes: js.UndefOr[EngineAttributes]
    var ServerName: js.UndefOr[ServerName]
    var ServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var BackupId: js.UndefOr[BackupId]
    var SecurityGroupIds: js.UndefOr[Strings]
    var EngineVersion: js.UndefOr[String]
    var DisableAutomatedBackup: js.UndefOr[Boolean]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var InstanceType: js.UndefOr[String]
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var BackupRetentionCount: js.UndefOr[BackupRetentionCountDefinition]
    var SubnetIds: js.UndefOr[Strings]
    var EngineModel: js.UndefOr[String]
  }

  object CreateServerRequest {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      KeyPair: js.UndefOr[KeyPair] = js.undefined,
      InstanceProfileArn: js.UndefOr[InstanceProfileArn] = js.undefined,
      EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined,
      ServerName: js.UndefOr[ServerName] = js.undefined,
      ServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
      BackupId: js.UndefOr[BackupId] = js.undefined,
      SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined,
      PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
      BackupRetentionCount: js.UndefOr[BackupRetentionCountDefinition] = js.undefined,
      SubnetIds: js.UndefOr[Strings] = js.undefined,
      EngineModel: js.UndefOr[String] = js.undefined): CreateServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "KeyPair" -> KeyPair.map { x => x.asInstanceOf[js.Any] },
        "InstanceProfileArn" -> InstanceProfileArn.map { x => x.asInstanceOf[js.Any] },
        "EngineAttributes" -> EngineAttributes.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "DisableAutomatedBackup" -> DisableAutomatedBackup.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionCount" -> BackupRetentionCount.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "EngineModel" -> EngineModel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServerRequest]
    }
  }

  @js.native
  trait CreateServerResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  object CreateServerResponse {
    def apply(
      Server: js.UndefOr[Server] = js.undefined): CreateServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Server" -> Server.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServerResponse]
    }
  }

  @js.native
  trait DeleteBackupRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
  }

  object DeleteBackupRequest {
    def apply(
      BackupId: js.UndefOr[BackupId] = js.undefined): DeleteBackupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupRequest]
    }
  }

  @js.native
  trait DeleteBackupResponse extends js.Object {

  }

  object DeleteBackupResponse {
    def apply(): DeleteBackupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupResponse]
    }
  }

  @js.native
  trait DeleteServerRequest extends js.Object {
    var ServerName: js.UndefOr[ServerName]
  }

  object DeleteServerRequest {
    def apply(
      ServerName: js.UndefOr[ServerName] = js.undefined): DeleteServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerRequest]
    }
  }

  @js.native
  trait DeleteServerResponse extends js.Object {

  }

  object DeleteServerResponse {
    def apply(): DeleteServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerResponse]
    }
  }

  @js.native
  trait DescribeAccountAttributesRequest extends js.Object {

  }

  object DescribeAccountAttributesRequest {
    def apply(): DescribeAccountAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesRequest]
    }
  }

  @js.native
  trait DescribeAccountAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AccountAttributes]
  }

  object DescribeAccountAttributesResponse {
    def apply(
      Attributes: js.UndefOr[AccountAttributes] = js.undefined): DescribeAccountAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesResponse]
    }
  }

  @js.native
  trait DescribeBackupsRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var ServerName: js.UndefOr[ServerName]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object DescribeBackupsRequest {
    def apply(
      BackupId: js.UndefOr[BackupId] = js.undefined,
      ServerName: js.UndefOr[ServerName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): DescribeBackupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupsRequest]
    }
  }

  @js.native
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[String]
  }

  object DescribeBackupsResponse {
    def apply(
      Backups: js.UndefOr[Backups] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeBackupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backups" -> Backups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupsResponse]
    }
  }

  @js.native
  trait DescribeEventsRequest extends js.Object {
    var ServerName: js.UndefOr[ServerName]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object DescribeEventsRequest {
    def apply(
      ServerName: js.UndefOr[ServerName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): DescribeEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsRequest]
    }
  }

  @js.native
  trait DescribeEventsResponse extends js.Object {
    var ServerEvents: js.UndefOr[ServerEvents]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEventsResponse {
    def apply(
      ServerEvents: js.UndefOr[ServerEvents] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerEvents" -> ServerEvents.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsResponse]
    }
  }

  @js.native
  trait DescribeNodeAssociationStatusRequest extends js.Object {
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken]
    var ServerName: js.UndefOr[ServerName]
  }

  object DescribeNodeAssociationStatusRequest {
    def apply(
      NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken] = js.undefined,
      ServerName: js.UndefOr[ServerName] = js.undefined): DescribeNodeAssociationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeAssociationStatusToken" -> NodeAssociationStatusToken.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNodeAssociationStatusRequest]
    }
  }

  @js.native
  trait DescribeNodeAssociationStatusResponse extends js.Object {
    var NodeAssociationStatus: js.UndefOr[NodeAssociationStatus]
    var EngineAttributes: js.UndefOr[EngineAttributes]
  }

  object DescribeNodeAssociationStatusResponse {
    def apply(
      NodeAssociationStatus: js.UndefOr[NodeAssociationStatus] = js.undefined,
      EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined): DescribeNodeAssociationStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeAssociationStatus" -> NodeAssociationStatus.map { x => x.asInstanceOf[js.Any] },
        "EngineAttributes" -> EngineAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNodeAssociationStatusResponse]
    }
  }

  @js.native
  trait DescribeServersRequest extends js.Object {
    var ServerName: js.UndefOr[ServerName]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object DescribeServersRequest {
    def apply(
      ServerName: js.UndefOr[ServerName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): DescribeServersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServersRequest]
    }
  }

  @js.native
  trait DescribeServersResponse extends js.Object {
    var Servers: js.UndefOr[Servers]
    var NextToken: js.UndefOr[String]
  }

  object DescribeServersResponse {
    def apply(
      Servers: js.UndefOr[Servers] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeServersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Servers" -> Servers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServersResponse]
    }
  }

  @js.native
  trait DisassociateNodeRequest extends js.Object {
    var ServerName: js.UndefOr[ServerName]
    var NodeName: js.UndefOr[NodeName]
    var EngineAttributes: js.UndefOr[EngineAttributes]
  }

  object DisassociateNodeRequest {
    def apply(
      ServerName: js.UndefOr[ServerName] = js.undefined,
      NodeName: js.UndefOr[NodeName] = js.undefined,
      EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined): DisassociateNodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "NodeName" -> NodeName.map { x => x.asInstanceOf[js.Any] },
        "EngineAttributes" -> EngineAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateNodeRequest]
    }
  }

  @js.native
  trait DisassociateNodeResponse extends js.Object {
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken]
  }

  object DisassociateNodeResponse {
    def apply(
      NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken] = js.undefined): DisassociateNodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeAssociationStatusToken" -> NodeAssociationStatusToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateNodeResponse]
    }
  }

  /**
   * <p>A name and value pair that is specific to the engine of the server. </p>
   */
  @js.native
  trait EngineAttribute extends js.Object {
    var Name: js.UndefOr[EngineAttributeName]
    var Value: js.UndefOr[EngineAttributeValue]
  }

  object EngineAttribute {
    def apply(
      Name: js.UndefOr[EngineAttributeName] = js.undefined,
      Value: js.UndefOr[EngineAttributeValue] = js.undefined): EngineAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EngineAttribute]
    }
  }

  @js.native
  trait ExportServerEngineAttributeRequest extends js.Object {
    var ExportAttributeName: js.UndefOr[String]
    var ServerName: js.UndefOr[ServerName]
    var InputAttributes: js.UndefOr[EngineAttributes]
  }

  object ExportServerEngineAttributeRequest {
    def apply(
      ExportAttributeName: js.UndefOr[String] = js.undefined,
      ServerName: js.UndefOr[ServerName] = js.undefined,
      InputAttributes: js.UndefOr[EngineAttributes] = js.undefined): ExportServerEngineAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportAttributeName" -> ExportAttributeName.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "InputAttributes" -> InputAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportServerEngineAttributeRequest]
    }
  }

  @js.native
  trait ExportServerEngineAttributeResponse extends js.Object {
    var EngineAttribute: js.UndefOr[EngineAttribute]
    var ServerName: js.UndefOr[ServerName]
  }

  object ExportServerEngineAttributeResponse {
    def apply(
      EngineAttribute: js.UndefOr[EngineAttribute] = js.undefined,
      ServerName: js.UndefOr[ServerName] = js.undefined): ExportServerEngineAttributeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineAttribute" -> EngineAttribute.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportServerEngineAttributeResponse]
    }
  }

  object MaintenanceStatusEnum {
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"

    val values = IndexedSeq(SUCCESS, FAILED)
  }

  /**
   * <p>The status of the association or disassociation request. </p> <p class="title"> <b>Possible values:</b> </p> <ul> <li> <p> <code>SUCCESS</code>: The association or disassociation succeeded. </p> </li> <li> <p> <code>FAILED</code>: The association or disassociation failed. </p> </li> <li> <p> <code>IN_PROGRESS</code>: The association or disassociation is still in progress. </p> </li> </ul>
   */
  object NodeAssociationStatusEnum {
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"
    val IN_PROGRESS = "IN_PROGRESS"

    val values = IndexedSeq(SUCCESS, FAILED, IN_PROGRESS)
  }

  @js.native
  trait RestoreServerRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var ServerName: js.UndefOr[ServerName]
    var InstanceType: js.UndefOr[String]
    var KeyPair: js.UndefOr[KeyPair]
  }

  object RestoreServerRequest {
    def apply(
      BackupId: js.UndefOr[BackupId] = js.undefined,
      ServerName: js.UndefOr[ServerName] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      KeyPair: js.UndefOr[KeyPair] = js.undefined): RestoreServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "KeyPair" -> KeyPair.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreServerRequest]
    }
  }

  @js.native
  trait RestoreServerResponse extends js.Object {

  }

  object RestoreServerResponse {
    def apply(): RestoreServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreServerResponse]
    }
  }

  /**
   * <p>Describes a configuration management server. </p>
   */
  @js.native
  trait Server extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
    var Engine: js.UndefOr[String]
    var KeyPair: js.UndefOr[String]
    var Endpoint: js.UndefOr[String]
    var InstanceProfileArn: js.UndefOr[String]
    var EngineAttributes: js.UndefOr[EngineAttributes]
    var CloudFormationStackArn: js.UndefOr[String]
    var MaintenanceStatus: js.UndefOr[MaintenanceStatus]
    var ServerName: js.UndefOr[String]
    var ServiceRoleArn: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[Strings]
    var EngineVersion: js.UndefOr[String]
    var DisableAutomatedBackup: js.UndefOr[Boolean]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var InstanceType: js.UndefOr[String]
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var ServerArn: js.UndefOr[String]
    var CreatedAt: js.UndefOr[Timestamp]
    var BackupRetentionCount: js.UndefOr[Int]
    var StatusReason: js.UndefOr[String]
    var SubnetIds: js.UndefOr[Strings]
    var EngineModel: js.UndefOr[String]
    var Status: js.UndefOr[ServerStatus]
  }

  object Server {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      KeyPair: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[String] = js.undefined,
      InstanceProfileArn: js.UndefOr[String] = js.undefined,
      EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined,
      CloudFormationStackArn: js.UndefOr[String] = js.undefined,
      MaintenanceStatus: js.UndefOr[MaintenanceStatus] = js.undefined,
      ServerName: js.UndefOr[String] = js.undefined,
      ServiceRoleArn: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined,
      PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
      ServerArn: js.UndefOr[String] = js.undefined,
      CreatedAt: js.UndefOr[Timestamp] = js.undefined,
      BackupRetentionCount: js.UndefOr[Int] = js.undefined,
      StatusReason: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[Strings] = js.undefined,
      EngineModel: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[ServerStatus] = js.undefined): Server = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "KeyPair" -> KeyPair.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "InstanceProfileArn" -> InstanceProfileArn.map { x => x.asInstanceOf[js.Any] },
        "EngineAttributes" -> EngineAttributes.map { x => x.asInstanceOf[js.Any] },
        "CloudFormationStackArn" -> CloudFormationStackArn.map { x => x.asInstanceOf[js.Any] },
        "MaintenanceStatus" -> MaintenanceStatus.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "ServiceRoleArn" -> ServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "DisableAutomatedBackup" -> DisableAutomatedBackup.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "ServerArn" -> ServerArn.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionCount" -> BackupRetentionCount.map { x => x.asInstanceOf[js.Any] },
        "StatusReason" -> StatusReason.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "EngineModel" -> EngineModel.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Server]
    }
  }

  /**
   * <p>An event that is related to the server, such as the start of maintenance or backup. </p>
   */
  @js.native
  trait ServerEvent extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var ServerName: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var LogUrl: js.UndefOr[String]
  }

  object ServerEvent {
    def apply(
      CreatedAt: js.UndefOr[Timestamp] = js.undefined,
      ServerName: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      LogUrl: js.UndefOr[String] = js.undefined): ServerEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "LogUrl" -> LogUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerEvent]
    }
  }

  object ServerStatusEnum {
    val BACKING_UP = "BACKING_UP"
    val CONNECTION_LOST = "CONNECTION_LOST"
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val MODIFYING = "MODIFYING"
    val FAILED = "FAILED"
    val HEALTHY = "HEALTHY"
    val RUNNING = "RUNNING"
    val RESTORING = "RESTORING"
    val SETUP = "SETUP"
    val UNDER_MAINTENANCE = "UNDER_MAINTENANCE"
    val UNHEALTHY = "UNHEALTHY"
    val TERMINATED = "TERMINATED"

    val values = IndexedSeq(BACKING_UP, CONNECTION_LOST, CREATING, DELETING, MODIFYING, FAILED, HEALTHY, RUNNING, RESTORING, SETUP, UNDER_MAINTENANCE, UNHEALTHY, TERMINATED)
  }

  @js.native
  trait StartMaintenanceRequest extends js.Object {
    var ServerName: js.UndefOr[ServerName]
    var EngineAttributes: js.UndefOr[EngineAttributes]
  }

  object StartMaintenanceRequest {
    def apply(
      ServerName: js.UndefOr[ServerName] = js.undefined,
      EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined): StartMaintenanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "EngineAttributes" -> EngineAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMaintenanceRequest]
    }
  }

  @js.native
  trait StartMaintenanceResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  object StartMaintenanceResponse {
    def apply(
      Server: js.UndefOr[Server] = js.undefined): StartMaintenanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Server" -> Server.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMaintenanceResponse]
    }
  }

  @js.native
  trait UpdateServerEngineAttributesRequest extends js.Object {
    var ServerName: js.UndefOr[ServerName]
    var AttributeName: js.UndefOr[AttributeName]
    var AttributeValue: js.UndefOr[AttributeValue]
  }

  object UpdateServerEngineAttributesRequest {
    def apply(
      ServerName: js.UndefOr[ServerName] = js.undefined,
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      AttributeValue: js.UndefOr[AttributeValue] = js.undefined): UpdateServerEngineAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeValue" -> AttributeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServerEngineAttributesRequest]
    }
  }

  @js.native
  trait UpdateServerEngineAttributesResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  object UpdateServerEngineAttributesResponse {
    def apply(
      Server: js.UndefOr[Server] = js.undefined): UpdateServerEngineAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Server" -> Server.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServerEngineAttributesResponse]
    }
  }

  @js.native
  trait UpdateServerRequest extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
    var ServerName: js.UndefOr[ServerName]
    var DisableAutomatedBackup: js.UndefOr[Boolean]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var BackupRetentionCount: js.UndefOr[Int]
  }

  object UpdateServerRequest {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
      ServerName: js.UndefOr[ServerName] = js.undefined,
      DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined,
      PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined,
      BackupRetentionCount: js.UndefOr[Int] = js.undefined): UpdateServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "DisableAutomatedBackup" -> DisableAutomatedBackup.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionCount" -> BackupRetentionCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServerRequest]
    }
  }

  @js.native
  trait UpdateServerResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  object UpdateServerResponse {
    def apply(
      Server: js.UndefOr[Server] = js.undefined): UpdateServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Server" -> Server.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServerResponse]
    }
  }
}
