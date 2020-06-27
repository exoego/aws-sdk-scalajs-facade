package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object opsworkscm {
  type AWSOpsWorksCMResourceArn       = String
  type AccountAttributes              = js.Array[AccountAttribute]
  type AttributeName                  = String
  type AttributeValue                 = String
  type BackupId                       = String
  type BackupRetentionCountDefinition = Int
  type Backups                        = js.Array[Backup]
  type CustomCertificate              = String
  type CustomDomain                   = String
  type CustomPrivateKey               = String
  type EngineAttributeName            = String
  type EngineAttributeValue           = String
  type EngineAttributes               = js.Array[EngineAttribute]
  type InstanceProfileArn             = String
  type KeyPair                        = String
  type MaxResults                     = Int
  type NextToken                      = String
  type NodeAssociationStatusToken     = String
  type NodeName                       = String
  type ServerEvents                   = js.Array[ServerEvent]
  type ServerName                     = String
  type Servers                        = js.Array[Server]
  type ServiceRoleArn                 = String
  type Strings                        = js.Array[String]
  type TagKey                         = String
  type TagKeyList                     = js.Array[TagKey]
  type TagList                        = js.Array[Tag]
  type TagValue                       = String
  type TimeWindowDefinition           = String
  type Timestamp                      = js.Date

  implicit final class OpsWorksCMOps(private val service: OpsWorksCM) extends AnyVal {

    @inline def associateNodeFuture(params: AssociateNodeRequest): Future[AssociateNodeResponse] =
      service.associateNode(params).promise().toFuture
    @inline def createBackupFuture(params: CreateBackupRequest): Future[CreateBackupResponse] =
      service.createBackup(params).promise().toFuture
    @inline def createServerFuture(params: CreateServerRequest): Future[CreateServerResponse] =
      service.createServer(params).promise().toFuture
    @inline def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] =
      service.deleteBackup(params).promise().toFuture
    @inline def deleteServerFuture(params: DeleteServerRequest): Future[DeleteServerResponse] =
      service.deleteServer(params).promise().toFuture
    @inline def describeAccountAttributesFuture(
        params: DescribeAccountAttributesRequest
    ): Future[DescribeAccountAttributesResponse] = service.describeAccountAttributes(params).promise().toFuture
    @inline def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] =
      service.describeBackups(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsRequest): Future[DescribeEventsResponse] =
      service.describeEvents(params).promise().toFuture
    @inline def describeNodeAssociationStatusFuture(
        params: DescribeNodeAssociationStatusRequest
    ): Future[DescribeNodeAssociationStatusResponse] = service.describeNodeAssociationStatus(params).promise().toFuture
    @inline def describeServersFuture(params: DescribeServersRequest): Future[DescribeServersResponse] =
      service.describeServers(params).promise().toFuture
    @inline def disassociateNodeFuture(params: DisassociateNodeRequest): Future[DisassociateNodeResponse] =
      service.disassociateNode(params).promise().toFuture
    @inline def exportServerEngineAttributeFuture(
        params: ExportServerEngineAttributeRequest
    ): Future[ExportServerEngineAttributeResponse] = service.exportServerEngineAttribute(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def restoreServerFuture(params: RestoreServerRequest): Future[RestoreServerResponse] =
      service.restoreServer(params).promise().toFuture
    @inline def startMaintenanceFuture(params: StartMaintenanceRequest): Future[StartMaintenanceResponse] =
      service.startMaintenance(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateServerEngineAttributesFuture(
        params: UpdateServerEngineAttributesRequest
    ): Future[UpdateServerEngineAttributesResponse] = service.updateServerEngineAttributes(params).promise().toFuture
    @inline def updateServerFuture(params: UpdateServerRequest): Future[UpdateServerResponse] =
      service.updateServer(params).promise().toFuture
  }
}

package opsworkscm {
  @js.native
  @JSImport("aws-sdk", "OpsWorksCM")
  class OpsWorksCM() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateNode(params: AssociateNodeRequest): Request[AssociateNodeResponse] = js.native
    def createBackup(params: CreateBackupRequest): Request[CreateBackupResponse]    = js.native
    def createServer(params: CreateServerRequest): Request[CreateServerResponse]    = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse]    = js.native
    def deleteServer(params: DeleteServerRequest): Request[DeleteServerResponse]    = js.native
    def describeAccountAttributes(
        params: DescribeAccountAttributesRequest
    ): Request[DescribeAccountAttributesResponse]                                         = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse] = js.native
    def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse]    = js.native
    def describeNodeAssociationStatus(
        params: DescribeNodeAssociationStatusRequest
    ): Request[DescribeNodeAssociationStatusResponse]                                        = js.native
    def describeServers(params: DescribeServersRequest): Request[DescribeServersResponse]    = js.native
    def disassociateNode(params: DisassociateNodeRequest): Request[DisassociateNodeResponse] = js.native
    def exportServerEngineAttribute(
        params: ExportServerEngineAttributeRequest
    ): Request[ExportServerEngineAttributeResponse]                                                   = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def restoreServer(params: RestoreServerRequest): Request[RestoreServerResponse]                   = js.native
    def startMaintenance(params: StartMaintenanceRequest): Request[StartMaintenanceResponse]          = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse]                      = js.native
    def updateServerEngineAttributes(
        params: UpdateServerEngineAttributesRequest
    ): Request[UpdateServerEngineAttributesResponse] = js.native
  }

  /**
    * Stores account attributes.
    */
  @js.native
  @Factory
  trait AccountAttribute extends js.Object {
    var Maximum: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var Used: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait AssociateNodeRequest extends js.Object {
    var EngineAttributes: EngineAttributes
    var NodeName: NodeName
    var ServerName: ServerName
  }

  @js.native
  @Factory
  trait AssociateNodeResponse extends js.Object {
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken]
  }

  /**
    * Describes a single backup.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait BackupStatus extends js.Any
  object BackupStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[BackupStatus]
    val OK          = "OK".asInstanceOf[BackupStatus]
    val FAILED      = "FAILED".asInstanceOf[BackupStatus]
    val DELETING    = "DELETING".asInstanceOf[BackupStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, OK, FAILED, DELETING))
  }

  @js.native
  sealed trait BackupType extends js.Any
  object BackupType extends js.Object {
    val AUTOMATED = "AUTOMATED".asInstanceOf[BackupType]
    val MANUAL    = "MANUAL".asInstanceOf[BackupType]

    val values = js.Object.freeze(js.Array(AUTOMATED, MANUAL))
  }

  @js.native
  @Factory
  trait CreateBackupRequest extends js.Object {
    var ServerName: ServerName
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  @js.native
  @Factory
  trait CreateServerRequest extends js.Object {
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
    var Engine: js.UndefOr[String]
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

  @js.native
  @Factory
  trait CreateServerResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  @js.native
  @Factory
  trait DeleteBackupRequest extends js.Object {
    var BackupId: BackupId
  }

  @js.native
  @Factory
  trait DeleteBackupResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteServerRequest extends js.Object {
    var ServerName: ServerName
  }

  @js.native
  @Factory
  trait DeleteServerResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeAccountAttributesRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeAccountAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AccountAttributes]
  }

  @js.native
  @Factory
  trait DescribeBackupsRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServerName: js.UndefOr[ServerName]
  }

  @js.native
  @Factory
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeEventsRequest extends js.Object {
    var ServerName: ServerName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeEventsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ServerEvents: js.UndefOr[ServerEvents]
  }

  @js.native
  @Factory
  trait DescribeNodeAssociationStatusRequest extends js.Object {
    var NodeAssociationStatusToken: NodeAssociationStatusToken
    var ServerName: ServerName
  }

  @js.native
  @Factory
  trait DescribeNodeAssociationStatusResponse extends js.Object {
    var EngineAttributes: js.UndefOr[EngineAttributes]
    var NodeAssociationStatus: js.UndefOr[NodeAssociationStatus]
  }

  @js.native
  @Factory
  trait DescribeServersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServerName: js.UndefOr[ServerName]
  }

  @js.native
  @Factory
  trait DescribeServersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Servers: js.UndefOr[Servers]
  }

  @js.native
  @Factory
  trait DisassociateNodeRequest extends js.Object {
    var NodeName: NodeName
    var ServerName: ServerName
    var EngineAttributes: js.UndefOr[EngineAttributes]
  }

  @js.native
  @Factory
  trait DisassociateNodeResponse extends js.Object {
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken]
  }

  /**
    * A name and value pair that is specific to the engine of the server.
    */
  @js.native
  @Factory
  trait EngineAttribute extends js.Object {
    var Name: js.UndefOr[EngineAttributeName]
    var Value: js.UndefOr[EngineAttributeValue]
  }

  @js.native
  @Factory
  trait ExportServerEngineAttributeRequest extends js.Object {
    var ExportAttributeName: String
    var ServerName: ServerName
    var InputAttributes: js.UndefOr[EngineAttributes]
  }

  @js.native
  @Factory
  trait ExportServerEngineAttributeResponse extends js.Object {
    var EngineAttribute: js.UndefOr[EngineAttribute]
    var ServerName: js.UndefOr[ServerName]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AWSOpsWorksCMResourceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait MaintenanceStatus extends js.Any
  object MaintenanceStatus extends js.Object {
    val SUCCESS = "SUCCESS".asInstanceOf[MaintenanceStatus]
    val FAILED  = "FAILED".asInstanceOf[MaintenanceStatus]

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
  object NodeAssociationStatus extends js.Object {
    val SUCCESS     = "SUCCESS".asInstanceOf[NodeAssociationStatus]
    val FAILED      = "FAILED".asInstanceOf[NodeAssociationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[NodeAssociationStatus]

    val values = js.Object.freeze(js.Array(SUCCESS, FAILED, IN_PROGRESS))
  }

  @js.native
  @Factory
  trait RestoreServerRequest extends js.Object {
    var BackupId: BackupId
    var ServerName: ServerName
    var InstanceType: js.UndefOr[String]
    var KeyPair: js.UndefOr[KeyPair]
  }

  @js.native
  @Factory
  trait RestoreServerResponse extends js.Object {}

  /**
    * Describes a configuration management server.
    */
  @js.native
  @Factory
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

  /**
    * An event that is related to the server, such as the start of maintenance or backup.
    */
  @js.native
  @Factory
  trait ServerEvent extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var LogUrl: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
  }

  @js.native
  sealed trait ServerStatus extends js.Any
  object ServerStatus extends js.Object {
    val BACKING_UP        = "BACKING_UP".asInstanceOf[ServerStatus]
    val CONNECTION_LOST   = "CONNECTION_LOST".asInstanceOf[ServerStatus]
    val CREATING          = "CREATING".asInstanceOf[ServerStatus]
    val DELETING          = "DELETING".asInstanceOf[ServerStatus]
    val MODIFYING         = "MODIFYING".asInstanceOf[ServerStatus]
    val FAILED            = "FAILED".asInstanceOf[ServerStatus]
    val HEALTHY           = "HEALTHY".asInstanceOf[ServerStatus]
    val RUNNING           = "RUNNING".asInstanceOf[ServerStatus]
    val RESTORING         = "RESTORING".asInstanceOf[ServerStatus]
    val SETUP             = "SETUP".asInstanceOf[ServerStatus]
    val UNDER_MAINTENANCE = "UNDER_MAINTENANCE".asInstanceOf[ServerStatus]
    val UNHEALTHY         = "UNHEALTHY".asInstanceOf[ServerStatus]
    val TERMINATED        = "TERMINATED".asInstanceOf[ServerStatus]

    val values = js.Object.freeze(
      js.Array(
        BACKING_UP,
        CONNECTION_LOST,
        CREATING,
        DELETING,
        MODIFYING,
        FAILED,
        HEALTHY,
        RUNNING,
        RESTORING,
        SETUP,
        UNDER_MAINTENANCE,
        UNHEALTHY,
        TERMINATED
      )
    )
  }

  @js.native
  @Factory
  trait StartMaintenanceRequest extends js.Object {
    var ServerName: ServerName
    var EngineAttributes: js.UndefOr[EngineAttributes]
  }

  @js.native
  @Factory
  trait StartMaintenanceResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  /**
    * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet Enterprise server. Leading and trailing white spaces are trimmed from both the key and value. A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AWSOpsWorksCMResourceArn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AWSOpsWorksCMResourceArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateServerEngineAttributesRequest extends js.Object {
    var AttributeName: AttributeName
    var ServerName: ServerName
    var AttributeValue: js.UndefOr[AttributeValue]
  }

  @js.native
  @Factory
  trait UpdateServerEngineAttributesResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }

  @js.native
  @Factory
  trait UpdateServerRequest extends js.Object {
    var ServerName: ServerName
    var BackupRetentionCount: js.UndefOr[Int]
    var DisableAutomatedBackup: js.UndefOr[Boolean]
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition]
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition]
  }

  @js.native
  @Factory
  trait UpdateServerResponse extends js.Object {
    var Server: js.UndefOr[Server]
  }
}
