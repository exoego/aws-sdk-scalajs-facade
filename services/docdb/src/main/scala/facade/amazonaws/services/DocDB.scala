package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object docdb {
  type AttributeValueList              = js.Array[String]
  type AvailabilityZoneList            = js.Array[AvailabilityZone]
  type AvailabilityZones               = js.Array[String]
  type BooleanOptional                 = Boolean
  type CertificateList                 = js.Array[Certificate]
  type DBClusterList                   = js.Array[DBCluster]
  type DBClusterMemberList             = js.Array[DBClusterMember]
  type DBClusterParameterGroupList     = js.Array[DBClusterParameterGroup]
  type DBClusterRoles                  = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList  = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList           = js.Array[DBClusterSnapshot]
  type DBEngineVersionList             = js.Array[DBEngineVersion]
  type DBInstanceList                  = js.Array[DBInstance]
  type DBInstanceStatusInfoList        = js.Array[DBInstanceStatusInfo]
  type DBSubnetGroups                  = js.Array[DBSubnetGroup]
  type EventCategoriesList             = js.Array[String]
  type EventCategoriesMapList          = js.Array[EventCategoriesMap]
  type EventList                       = js.Array[Event]
  type FilterList                      = js.Array[Filter]
  type FilterValueList                 = js.Array[String]
  type IntegerOptional                 = Int
  type KeyList                         = js.Array[String]
  type LogTypeList                     = js.Array[String]
  type OrderableDBInstanceOptionsList  = js.Array[OrderableDBInstanceOption]
  type ParametersList                  = js.Array[Parameter]
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions       = js.Array[ResourcePendingMaintenanceActions]
  type SubnetIdentifierList            = js.Array[String]
  type SubnetList                      = js.Array[Subnet]
  type TStamp                          = js.Date
  type TagList                         = js.Array[Tag]
  type ValidUpgradeTargetList          = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList          = js.Array[String]
  type VpcSecurityGroupMembershipList  = js.Array[VpcSecurityGroupMembership]

  implicit final class DocDBOps(private val service: DocDB) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[js.Object] =
      service.addTagsToResource(params).promise().toFuture
    @inline def applyPendingMaintenanceActionFuture(
        params: ApplyPendingMaintenanceActionMessage
    ): Future[ApplyPendingMaintenanceActionResult] = service.applyPendingMaintenanceAction(params).promise().toFuture
    @inline def copyDBClusterParameterGroupFuture(
        params: CopyDBClusterParameterGroupMessage
    ): Future[CopyDBClusterParameterGroupResult] = service.copyDBClusterParameterGroup(params).promise().toFuture
    @inline def copyDBClusterSnapshotFuture(params: CopyDBClusterSnapshotMessage): Future[CopyDBClusterSnapshotResult] =
      service.copyDBClusterSnapshot(params).promise().toFuture
    @inline def createDBClusterFuture(params: CreateDBClusterMessage): Future[CreateDBClusterResult] =
      service.createDBCluster(params).promise().toFuture
    @inline def createDBClusterParameterGroupFuture(
        params: CreateDBClusterParameterGroupMessage
    ): Future[CreateDBClusterParameterGroupResult] = service.createDBClusterParameterGroup(params).promise().toFuture
    @inline def createDBClusterSnapshotFuture(
        params: CreateDBClusterSnapshotMessage
    ): Future[CreateDBClusterSnapshotResult] = service.createDBClusterSnapshot(params).promise().toFuture
    @inline def createDBInstanceFuture(params: CreateDBInstanceMessage): Future[CreateDBInstanceResult] =
      service.createDBInstance(params).promise().toFuture
    @inline def createDBSubnetGroupFuture(params: CreateDBSubnetGroupMessage): Future[CreateDBSubnetGroupResult] =
      service.createDBSubnetGroup(params).promise().toFuture
    @inline def deleteDBClusterFuture(params: DeleteDBClusterMessage): Future[DeleteDBClusterResult] =
      service.deleteDBCluster(params).promise().toFuture
    @inline def deleteDBClusterParameterGroupFuture(params: DeleteDBClusterParameterGroupMessage): Future[js.Object] =
      service.deleteDBClusterParameterGroup(params).promise().toFuture
    @inline def deleteDBClusterSnapshotFuture(
        params: DeleteDBClusterSnapshotMessage
    ): Future[DeleteDBClusterSnapshotResult] = service.deleteDBClusterSnapshot(params).promise().toFuture
    @inline def deleteDBInstanceFuture(params: DeleteDBInstanceMessage): Future[DeleteDBInstanceResult] =
      service.deleteDBInstance(params).promise().toFuture
    @inline def deleteDBSubnetGroupFuture(params: DeleteDBSubnetGroupMessage): Future[js.Object] =
      service.deleteDBSubnetGroup(params).promise().toFuture
    @inline def describeCertificatesFuture(params: DescribeCertificatesMessage): Future[CertificateMessage] =
      service.describeCertificates(params).promise().toFuture
    @inline def describeDBClusterParameterGroupsFuture(
        params: DescribeDBClusterParameterGroupsMessage
    ): Future[DBClusterParameterGroupsMessage] = service.describeDBClusterParameterGroups(params).promise().toFuture
    @inline def describeDBClusterParametersFuture(
        params: DescribeDBClusterParametersMessage
    ): Future[DBClusterParameterGroupDetails] = service.describeDBClusterParameters(params).promise().toFuture
    @inline def describeDBClusterSnapshotAttributesFuture(
        params: DescribeDBClusterSnapshotAttributesMessage
    ): Future[DescribeDBClusterSnapshotAttributesResult] =
      service.describeDBClusterSnapshotAttributes(params).promise().toFuture
    @inline def describeDBClusterSnapshotsFuture(
        params: DescribeDBClusterSnapshotsMessage
    ): Future[DBClusterSnapshotMessage] = service.describeDBClusterSnapshots(params).promise().toFuture
    @inline def describeDBClustersFuture(params: DescribeDBClustersMessage): Future[DBClusterMessage] =
      service.describeDBClusters(params).promise().toFuture
    @inline def describeDBEngineVersionsFuture(
        params: DescribeDBEngineVersionsMessage
    ): Future[DBEngineVersionMessage] = service.describeDBEngineVersions(params).promise().toFuture
    @inline def describeDBInstancesFuture(params: DescribeDBInstancesMessage): Future[DBInstanceMessage] =
      service.describeDBInstances(params).promise().toFuture
    @inline def describeDBSubnetGroupsFuture(params: DescribeDBSubnetGroupsMessage): Future[DBSubnetGroupMessage] =
      service.describeDBSubnetGroups(params).promise().toFuture
    @inline def describeEngineDefaultClusterParametersFuture(
        params: DescribeEngineDefaultClusterParametersMessage
    ): Future[DescribeEngineDefaultClusterParametersResult] =
      service.describeEngineDefaultClusterParameters(params).promise().toFuture
    @inline def describeEventCategoriesFuture(params: DescribeEventCategoriesMessage): Future[EventCategoriesMessage] =
      service.describeEventCategories(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] =
      service.describeEvents(params).promise().toFuture
    @inline def describeOrderableDBInstanceOptionsFuture(
        params: DescribeOrderableDBInstanceOptionsMessage
    ): Future[OrderableDBInstanceOptionsMessage] = service.describeOrderableDBInstanceOptions(params).promise().toFuture
    @inline def describePendingMaintenanceActionsFuture(
        params: DescribePendingMaintenanceActionsMessage
    ): Future[PendingMaintenanceActionsMessage] = service.describePendingMaintenanceActions(params).promise().toFuture
    @inline def failoverDBClusterFuture(params: FailoverDBClusterMessage): Future[FailoverDBClusterResult] =
      service.failoverDBCluster(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[TagListMessage] =
      service.listTagsForResource(params).promise().toFuture
    @inline def modifyDBClusterFuture(params: ModifyDBClusterMessage): Future[ModifyDBClusterResult] =
      service.modifyDBCluster(params).promise().toFuture
    @inline def modifyDBClusterParameterGroupFuture(
        params: ModifyDBClusterParameterGroupMessage
    ): Future[DBClusterParameterGroupNameMessage] = service.modifyDBClusterParameterGroup(params).promise().toFuture
    @inline def modifyDBClusterSnapshotAttributeFuture(
        params: ModifyDBClusterSnapshotAttributeMessage
    ): Future[ModifyDBClusterSnapshotAttributeResult] =
      service.modifyDBClusterSnapshotAttribute(params).promise().toFuture
    @inline def modifyDBInstanceFuture(params: ModifyDBInstanceMessage): Future[ModifyDBInstanceResult] =
      service.modifyDBInstance(params).promise().toFuture
    @inline def modifyDBSubnetGroupFuture(params: ModifyDBSubnetGroupMessage): Future[ModifyDBSubnetGroupResult] =
      service.modifyDBSubnetGroup(params).promise().toFuture
    @inline def rebootDBInstanceFuture(params: RebootDBInstanceMessage): Future[RebootDBInstanceResult] =
      service.rebootDBInstance(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[js.Object] =
      service.removeTagsFromResource(params).promise().toFuture
    @inline def resetDBClusterParameterGroupFuture(
        params: ResetDBClusterParameterGroupMessage
    ): Future[DBClusterParameterGroupNameMessage] = service.resetDBClusterParameterGroup(params).promise().toFuture
    @inline def restoreDBClusterFromSnapshotFuture(
        params: RestoreDBClusterFromSnapshotMessage
    ): Future[RestoreDBClusterFromSnapshotResult] = service.restoreDBClusterFromSnapshot(params).promise().toFuture
    @inline def restoreDBClusterToPointInTimeFuture(
        params: RestoreDBClusterToPointInTimeMessage
    ): Future[RestoreDBClusterToPointInTimeResult] = service.restoreDBClusterToPointInTime(params).promise().toFuture
    @inline def startDBClusterFuture(params: StartDBClusterMessage): Future[StartDBClusterResult] =
      service.startDBCluster(params).promise().toFuture
    @inline def stopDBClusterFuture(params: StopDBClusterMessage): Future[StopDBClusterResult] =
      service.stopDBCluster(params).promise().toFuture
  }
}

package docdb {
  @js.native
  @JSImport("aws-sdk", "DocDB")
  class DocDB() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceMessage): Request[js.Object] = js.native
    def applyPendingMaintenanceAction(
        params: ApplyPendingMaintenanceActionMessage
    ): Request[ApplyPendingMaintenanceActionResult] = js.native
    def copyDBClusterParameterGroup(
        params: CopyDBClusterParameterGroupMessage
    ): Request[CopyDBClusterParameterGroupResult]                                                         = js.native
    def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): Request[CopyDBClusterSnapshotResult] = js.native
    def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult]                   = js.native
    def createDBClusterParameterGroup(
        params: CreateDBClusterParameterGroupMessage
    ): Request[CreateDBClusterParameterGroupResult] = js.native
    def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): Request[CreateDBClusterSnapshotResult] =
      js.native
    def createDBInstance(params: CreateDBInstanceMessage): Request[CreateDBInstanceResult]              = js.native
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult]     = js.native
    def deleteDBCluster(params: DeleteDBClusterMessage): Request[DeleteDBClusterResult]                 = js.native
    def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): Request[js.Object] = js.native
    def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): Request[DeleteDBClusterSnapshotResult] =
      js.native
    def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult]     = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object]            = js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[CertificateMessage] = js.native
    def describeDBClusterParameterGroups(
        params: DescribeDBClusterParameterGroupsMessage
    ): Request[DBClusterParameterGroupsMessage] = js.native
    def describeDBClusterParameters(
        params: DescribeDBClusterParametersMessage
    ): Request[DBClusterParameterGroupDetails] = js.native
    def describeDBClusterSnapshotAttributes(
        params: DescribeDBClusterSnapshotAttributesMessage
    ): Request[DescribeDBClusterSnapshotAttributesResult] = js.native
    def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): Request[DBClusterSnapshotMessage] =
      js.native
    def describeDBClusters(params: DescribeDBClustersMessage): Request[DBClusterMessage]                   = js.native
    def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage): Request[DBEngineVersionMessage] = js.native
    def describeDBInstances(params: DescribeDBInstancesMessage): Request[DBInstanceMessage]                = js.native
    def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): Request[DBSubnetGroupMessage]       = js.native
    def describeEngineDefaultClusterParameters(
        params: DescribeEngineDefaultClusterParametersMessage
    ): Request[DescribeEngineDefaultClusterParametersResult]                                             = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage] = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage]                            = js.native
    def describeOrderableDBInstanceOptions(
        params: DescribeOrderableDBInstanceOptionsMessage
    ): Request[OrderableDBInstanceOptionsMessage] = js.native
    def describePendingMaintenanceActions(
        params: DescribePendingMaintenanceActionsMessage
    ): Request[PendingMaintenanceActionsMessage]                                              = js.native
    def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage]      = js.native
    def modifyDBCluster(params: ModifyDBClusterMessage): Request[ModifyDBClusterResult]       = js.native
    def modifyDBClusterParameterGroup(
        params: ModifyDBClusterParameterGroupMessage
    ): Request[DBClusterParameterGroupNameMessage] = js.native
    def modifyDBClusterSnapshotAttribute(
        params: ModifyDBClusterSnapshotAttributeMessage
    ): Request[ModifyDBClusterSnapshotAttributeResult]                                              = js.native
    def modifyDBInstance(params: ModifyDBInstanceMessage): Request[ModifyDBInstanceResult]          = js.native
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): Request[ModifyDBSubnetGroupResult] = js.native
    def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult]          = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object]           = js.native
    def resetDBClusterParameterGroup(
        params: ResetDBClusterParameterGroupMessage
    ): Request[DBClusterParameterGroupNameMessage] = js.native
    def restoreDBClusterFromSnapshot(
        params: RestoreDBClusterFromSnapshotMessage
    ): Request[RestoreDBClusterFromSnapshotResult] = js.native
    def restoreDBClusterToPointInTime(
        params: RestoreDBClusterToPointInTimeMessage
    ): Request[RestoreDBClusterToPointInTimeResult]                                  = js.native
    def startDBCluster(params: StartDBClusterMessage): Request[StartDBClusterResult] = js.native
    def stopDBCluster(params: StopDBClusterMessage): Request[StopDBClusterResult]    = js.native
  }

  /**
    * Represents the input to <a>AddTagsToResource</a>.
    */
  @js.native
  @Factory
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  @js.native
  sealed trait ApplyMethod extends js.Any
  object ApplyMethod extends js.Object {
    val immediate        = "immediate".asInstanceOf[ApplyMethod]
    val `pending-reboot` = "pending-reboot".asInstanceOf[ApplyMethod]

    val values = js.Object.freeze(js.Array(immediate, `pending-reboot`))
  }

  /**
    * Represents the input to <a>ApplyPendingMaintenanceAction</a>.
    */
  @js.native
  @Factory
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    var ApplyAction: String
    var OptInType: String
    var ResourceIdentifier: String
  }

  @js.native
  @Factory
  trait ApplyPendingMaintenanceActionResult extends js.Object {
    var ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions]
  }

  /**
    * Information about an Availability Zone.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  /**
    * A certificate authority (CA) certificate for an AWS account.
    */
  @js.native
  @Factory
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var CertificateIdentifier: js.UndefOr[String]
    var CertificateType: js.UndefOr[String]
    var Thumbprint: js.UndefOr[String]
    var ValidFrom: js.UndefOr[TStamp]
    var ValidTill: js.UndefOr[TStamp]
  }

  @js.native
  @Factory
  trait CertificateMessage extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var Marker: js.UndefOr[String]
  }

  /**
    * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific instance or cluster.
    *  The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which logs are exported (or not exported) to CloudWatch Logs. The values within these arrays depend on the engine that is being used.
    */
  @js.native
  @Factory
  trait CloudwatchLogsExportConfiguration extends js.Object {
    var DisableLogTypes: js.UndefOr[LogTypeList]
    var EnableLogTypes: js.UndefOr[LogTypeList]
  }

  /**
    * Represents the input to <a>CopyDBClusterParameterGroup</a>.
    */
  @js.native
  @Factory
  trait CopyDBClusterParameterGroupMessage extends js.Object {
    var SourceDBClusterParameterGroupIdentifier: String
    var TargetDBClusterParameterGroupDescription: String
    var TargetDBClusterParameterGroupIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CopyDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup]
  }

  /**
    * Represents the input to <a>CopyDBClusterSnapshot</a>.
    */
  @js.native
  @Factory
  trait CopyDBClusterSnapshotMessage extends js.Object {
    var SourceDBClusterSnapshotIdentifier: String
    var TargetDBClusterSnapshotIdentifier: String
    var CopyTags: js.UndefOr[BooleanOptional]
    var KmsKeyId: js.UndefOr[String]
    var PreSignedUrl: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CopyDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  /**
    * Represents the input to <a>CreateDBCluster</a>.
    */
  @js.native
  @Factory
  trait CreateDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var Engine: String
    var MasterUserPassword: String
    var MasterUsername: String
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  /**
    * Represents the input of <a>CreateDBClusterParameterGroup</a>.
    */
  @js.native
  @Factory
  trait CreateDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var DBParameterGroupFamily: String
    var Description: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup]
  }

  @js.native
  @Factory
  trait CreateDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * Represents the input of <a>CreateDBClusterSnapshot</a>.
    */
  @js.native
  @Factory
  trait CreateDBClusterSnapshotMessage extends js.Object {
    var DBClusterIdentifier: String
    var DBClusterSnapshotIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  /**
    * Represents the input to <a>CreateDBInstance</a>.
    */
  @js.native
  @Factory
  trait CreateDBInstanceMessage extends js.Object {
    var DBClusterIdentifier: String
    var DBInstanceClass: String
    var DBInstanceIdentifier: String
    var Engine: String
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * Represents the input to <a>CreateDBSubnetGroup</a>.
    */
  @js.native
  @Factory
  trait CreateDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupDescription: String
    var DBSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  /**
    * Detailed information about a cluster.
    */
  @js.native
  @Factory
  trait DBCluster extends js.Object {
    var AssociatedRoles: js.UndefOr[DBClusterRoles]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var DBClusterArn: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterMembers: js.UndefOr[DBClusterMemberList]
    var DBClusterParameterGroup: js.UndefOr[String]
    var DBSubnetGroup: js.UndefOr[String]
    var DbClusterResourceId: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[Boolean]
    var EarliestRestorableTime: js.UndefOr[TStamp]
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var Endpoint: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var LatestRestorableTime: js.UndefOr[TStamp]
    var MasterUsername: js.UndefOr[String]
    var MultiAZ: js.UndefOr[Boolean]
    var PercentProgress: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReaderEndpoint: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[Boolean]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  /**
    * Contains information about an instance that is part of a cluster.
    */
  @js.native
  @Factory
  trait DBClusterMember extends js.Object {
    var DBClusterParameterGroupStatus: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var IsClusterWriter: js.UndefOr[Boolean]
    var PromotionTier: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the output of <a>DescribeDBClusters</a>.
    */
  @js.native
  @Factory
  trait DBClusterMessage extends js.Object {
    var DBClusters: js.UndefOr[DBClusterList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Detailed information about a cluster parameter group.
    */
  @js.native
  @Factory
  trait DBClusterParameterGroup extends js.Object {
    var DBClusterParameterGroupArn: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  /**
    * Represents the output of <a>DBClusterParameterGroup</a>.
    */
  @js.native
  @Factory
  trait DBClusterParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  /**
    * Contains the name of a cluster parameter group.
    */
  @js.native
  @Factory
  trait DBClusterParameterGroupNameMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
  }

  /**
    * Represents the output of <a>DBClusterParameterGroups</a>.
    */
  @js.native
  @Factory
  trait DBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Describes an AWS Identity and Access Management (IAM) role that is associated with a cluster.
    */
  @js.native
  @Factory
  trait DBClusterRole extends js.Object {
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Detailed information about a cluster snapshot.
    */
  @js.native
  @Factory
  trait DBClusterSnapshot extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterSnapshotArn: js.UndefOr[String]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var PercentProgress: js.UndefOr[Int]
    var Port: js.UndefOr[Int]
    var SnapshotCreateTime: js.UndefOr[TStamp]
    var SnapshotType: js.UndefOr[String]
    var SourceDBClusterSnapshotArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Contains the name and values of a manual cluster snapshot attribute.
    *  Manual cluster snapshot attributes are used to authorize other AWS accounts to restore a manual cluster snapshot.
    */
  @js.native
  @Factory
  trait DBClusterSnapshotAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  /**
    * Detailed information about the attributes that are associated with a cluster snapshot.
    */
  @js.native
  @Factory
  trait DBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
  }

  /**
    * Represents the output of <a>DescribeDBClusterSnapshots</a>.
    */
  @js.native
  @Factory
  trait DBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Detailed information about an engine version.
    */
  @js.native
  @Factory
  trait DBEngineVersion extends js.Object {
    var DBEngineDescription: js.UndefOr[String]
    var DBEngineVersionDescription: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var ExportableLogTypes: js.UndefOr[LogTypeList]
    var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean]
    var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList]
  }

  /**
    * Represents the output of <a>DescribeDBEngineVersions</a>.
    */
  @js.native
  @Factory
  trait DBEngineVersionMessage extends js.Object {
    var DBEngineVersions: js.UndefOr[DBEngineVersionList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Detailed information about an instance.
    */
  @js.native
  @Factory
  trait DBInstance extends js.Object {
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[Int]
    var CACertificateIdentifier: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBInstanceArn: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var DBInstanceStatus: js.UndefOr[String]
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
    var DbiResourceId: js.UndefOr[String]
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var Endpoint: js.UndefOr[Endpoint]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var KmsKeyId: js.UndefOr[String]
    var LatestRestorableTime: js.UndefOr[TStamp]
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var StatusInfos: js.UndefOr[DBInstanceStatusInfoList]
    var StorageEncrypted: js.UndefOr[Boolean]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  /**
    * Represents the output of <a>DescribeDBInstances</a>.
    */
  @js.native
  @Factory
  trait DBInstanceMessage extends js.Object {
    var DBInstances: js.UndefOr[DBInstanceList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Provides a list of status information for an instance.
    */
  @js.native
  @Factory
  trait DBInstanceStatusInfo extends js.Object {
    var Message: js.UndefOr[String]
    var Normal: js.UndefOr[Boolean]
    var Status: js.UndefOr[String]
    var StatusType: js.UndefOr[String]
  }

  /**
    * Detailed information about a subnet group.
    */
  @js.native
  @Factory
  trait DBSubnetGroup extends js.Object {
    var DBSubnetGroupArn: js.UndefOr[String]
    var DBSubnetGroupDescription: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Represents the output of <a>DescribeDBSubnetGroups</a>.
    */
  @js.native
  @Factory
  trait DBSubnetGroupMessage extends js.Object {
    var DBSubnetGroups: js.UndefOr[DBSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  /**
    * Represents the input to <a>DeleteDBCluster</a>.
    */
  @js.native
  @Factory
  trait DeleteDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
  }

  /**
    * Represents the input to <a>DeleteDBClusterParameterGroup</a>.
    */
  @js.native
  @Factory
  trait DeleteDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
  }

  @js.native
  @Factory
  trait DeleteDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * Represents the input to <a>DeleteDBClusterSnapshot</a>.
    */
  @js.native
  @Factory
  trait DeleteDBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshotIdentifier: String
  }

  @js.native
  @Factory
  trait DeleteDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  /**
    * Represents the input to <a>DeleteDBInstance</a>.
    */
  @js.native
  @Factory
  trait DeleteDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
  }

  @js.native
  @Factory
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * Represents the input to <a>DeleteDBSubnetGroup</a>.
    */
  @js.native
  @Factory
  trait DeleteDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
  }

  @js.native
  @Factory
  trait DescribeCertificatesMessage extends js.Object {
    var CertificateIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input to <a>DescribeDBClusterParameterGroups</a>.
    */
  @js.native
  @Factory
  trait DescribeDBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input to <a>DescribeDBClusterParameters</a>.
    */
  @js.native
  @Factory
  trait DescribeDBClusterParametersMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  /**
    * Represents the input to <a>DescribeDBClusterSnapshotAttributes</a>.
    */
  @js.native
  @Factory
  trait DescribeDBClusterSnapshotAttributesMessage extends js.Object {
    var DBClusterSnapshotIdentifier: String
  }

  @js.native
  @Factory
  trait DescribeDBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult]
  }

  /**
    * Represents the input to <a>DescribeDBClusterSnapshots</a>.
    */
  @js.native
  @Factory
  trait DescribeDBClusterSnapshotsMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var IncludePublic: js.UndefOr[Boolean]
    var IncludeShared: js.UndefOr[Boolean]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SnapshotType: js.UndefOr[String]
  }

  /**
    * Represents the input to <a>DescribeDBClusters</a>.
    */
  @js.native
  @Factory
  trait DescribeDBClustersMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input to <a>DescribeDBEngineVersions</a>.
    */
  @js.native
  @Factory
  trait DescribeDBEngineVersionsMessage extends js.Object {
    var DBParameterGroupFamily: js.UndefOr[String]
    var DefaultOnly: js.UndefOr[Boolean]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var ListSupportedCharacterSets: js.UndefOr[BooleanOptional]
    var ListSupportedTimezones: js.UndefOr[BooleanOptional]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input to <a>DescribeDBInstances</a>.
    */
  @js.native
  @Factory
  trait DescribeDBInstancesMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input to <a>DescribeDBSubnetGroups</a>.
    */
  @js.native
  @Factory
  trait DescribeDBSubnetGroupsMessage extends js.Object {
    var DBSubnetGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input to <a>DescribeEngineDefaultClusterParameters</a>.
    */
  @js.native
  @Factory
  trait DescribeEngineDefaultClusterParametersMessage extends js.Object {
    var DBParameterGroupFamily: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeEngineDefaultClusterParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  /**
    * Represents the input to <a>DescribeEventCategories</a>.
    */
  @js.native
  @Factory
  trait DescribeEventCategoriesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SourceType: js.UndefOr[String]
  }

  /**
    * Represents the input to <a>DescribeEvents</a>.
    */
  @js.native
  @Factory
  trait DescribeEventsMessage extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var EndTime: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var StartTime: js.UndefOr[TStamp]
  }

  /**
    * Represents the input to <a>DescribeOrderableDBInstanceOptions</a>.
    */
  @js.native
  @Factory
  trait DescribeOrderableDBInstanceOptionsMessage extends js.Object {
    var Engine: String
    var DBInstanceClass: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var LicenseModel: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Vpc: js.UndefOr[BooleanOptional]
  }

  /**
    * Represents the input to <a>DescribePendingMaintenanceActions</a>.
    */
  @js.native
  @Factory
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ResourceIdentifier: js.UndefOr[String]
  }

  /**
    * Network information for accessing a cluster or instance. Client programs must specify a valid endpoint to access these Amazon DocumentDB resources.
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeEngineDefaultClusterParameters</code> operation.
    */
  @js.native
  @Factory
  trait EngineDefaults extends js.Object {
    var DBParameterGroupFamily: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  /**
    * Detailed information about an event.
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Message: js.UndefOr[String]
    var SourceArn: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  /**
    * An event source type, accompanied by one or more event category names.
    */
  @js.native
  @Factory
  trait EventCategoriesMap extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  /**
    * Represents the output of <a>DescribeEventCategories</a>.
    */
  @js.native
  @Factory
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList]
  }

  /**
    * Represents the output of <a>DescribeEvents</a>.
    */
  @js.native
  @Factory
  trait EventsMessage extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Represents the input to <a>FailoverDBCluster</a>.
    */
  @js.native
  @Factory
  trait FailoverDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var TargetDBInstanceIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait FailoverDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * A named set of filter values, used to return a more specific list of results. You can use a filter to match a set of resources by specific criteria, such as IDs.
    *  Wildcards are not supported in filters.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  /**
    * Represents the input to <a>ListTagsForResource</a>.
    */
  @js.native
  @Factory
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
    var Filters: js.UndefOr[FilterList]
  }

  /**
    * Represents the input to <a>ModifyDBCluster</a>.
    */
  @js.native
  @Factory
  trait ModifyDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var NewDBClusterIdentifier: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  /**
    * Represents the input to <a>ModifyDBClusterParameterGroup</a>.
    */
  @js.native
  @Factory
  trait ModifyDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Parameters: ParametersList
  }

  @js.native
  @Factory
  trait ModifyDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * Represents the input to <a>ModifyDBClusterSnapshotAttribute</a>.
    */
  @js.native
  @Factory
  trait ModifyDBClusterSnapshotAttributeMessage extends js.Object {
    var AttributeName: String
    var DBClusterSnapshotIdentifier: String
    var ValuesToAdd: js.UndefOr[AttributeValueList]
    var ValuesToRemove: js.UndefOr[AttributeValueList]
  }

  @js.native
  @Factory
  trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult]
  }

  /**
    * Represents the input to <a>ModifyDBInstance</a>.
    */
  @js.native
  @Factory
  trait ModifyDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var CACertificateIdentifier: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var NewDBInstanceIdentifier: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * Represents the input to <a>ModifyDBSubnetGroup</a>.
    */
  @js.native
  @Factory
  trait ModifyDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var DBSubnetGroupDescription: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  /**
    * The options that are available for an instance.
    */
  @js.native
  @Factory
  trait OrderableDBInstanceOption extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var DBInstanceClass: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var Vpc: js.UndefOr[Boolean]
  }

  /**
    * Represents the output of <a>DescribeOrderableDBInstanceOptions</a>.
    */
  @js.native
  @Factory
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList]
  }

  /**
    * Detailed information about an individual parameter.
    */
  @js.native
  @Factory
  trait Parameter extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var ApplyMethod: js.UndefOr[ApplyMethod]
    var ApplyType: js.UndefOr[String]
    var DataType: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var IsModifiable: js.UndefOr[Boolean]
    var MinimumEngineVersion: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
    var Source: js.UndefOr[String]
  }

  /**
    * A list of the log types whose configuration is still pending. These log types are in the process of being activated or deactivated.
    */
  @js.native
  @Factory
  trait PendingCloudwatchLogsExports extends js.Object {
    var LogTypesToDisable: js.UndefOr[LogTypeList]
    var LogTypesToEnable: js.UndefOr[LogTypeList]
  }

  /**
    * Provides information about a pending maintenance action for a resource.
    */
  @js.native
  @Factory
  trait PendingMaintenanceAction extends js.Object {
    var Action: js.UndefOr[String]
    var AutoAppliedAfterDate: js.UndefOr[TStamp]
    var CurrentApplyDate: js.UndefOr[TStamp]
    var Description: js.UndefOr[String]
    var ForcedApplyDate: js.UndefOr[TStamp]
    var OptInStatus: js.UndefOr[String]
  }

  /**
    * Represents the output of <a>DescribePendingMaintenanceActions</a>.
    */
  @js.native
  @Factory
  trait PendingMaintenanceActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
  }

  /**
    * One or more modified settings for an instance. These modified settings have been requested, but haven't been applied yet.
    */
  @js.native
  @Factory
  trait PendingModifiedValues extends js.Object {
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CACertificateIdentifier: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var LicenseModel: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var PendingCloudwatchLogsExports: js.UndefOr[PendingCloudwatchLogsExports]
    var Port: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
  }

  /**
    * Represents the input to <a>RebootDBInstance</a>.
    */
  @js.native
  @Factory
  trait RebootDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  @js.native
  @Factory
  trait RebootDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * Represents the input to <a>RemoveTagsFromResource</a>.
    */
  @js.native
  @Factory
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  /**
    * Represents the input to <a>ResetDBClusterParameterGroup</a>.
    */
  @js.native
  @Factory
  trait ResetDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  /**
    * Represents the output of <a>ApplyPendingMaintenanceAction</a>.
    */
  @js.native
  @Factory
  trait ResourcePendingMaintenanceActions extends js.Object {
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails]
    var ResourceIdentifier: js.UndefOr[String]
  }

  /**
    * Represents the input to <a>RestoreDBClusterFromSnapshot</a>.
    */
  @js.native
  @Factory
  trait RestoreDBClusterFromSnapshotMessage extends js.Object {
    var DBClusterIdentifier: String
    var Engine: String
    var SnapshotIdentifier: String
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  @js.native
  @Factory
  trait RestoreDBClusterFromSnapshotResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * Represents the input to <a>RestoreDBClusterToPointInTime</a>.
    */
  @js.native
  @Factory
  trait RestoreDBClusterToPointInTimeMessage extends js.Object {
    var DBClusterIdentifier: String
    var SourceDBClusterIdentifier: String
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var KmsKeyId: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var RestoreToTime: js.UndefOr[TStamp]
    var Tags: js.UndefOr[TagList]
    var UseLatestRestorableTime: js.UndefOr[Boolean]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  @js.native
  @Factory
  trait RestoreDBClusterToPointInTimeResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val `db-instance`         = "db-instance".asInstanceOf[SourceType]
    val `db-parameter-group`  = "db-parameter-group".asInstanceOf[SourceType]
    val `db-security-group`   = "db-security-group".asInstanceOf[SourceType]
    val `db-snapshot`         = "db-snapshot".asInstanceOf[SourceType]
    val `db-cluster`          = "db-cluster".asInstanceOf[SourceType]
    val `db-cluster-snapshot` = "db-cluster-snapshot".asInstanceOf[SourceType]

    val values = js.Object.freeze(
      js.Array(
        `db-instance`,
        `db-parameter-group`,
        `db-security-group`,
        `db-snapshot`,
        `db-cluster`,
        `db-cluster-snapshot`
      )
    )
  }

  @js.native
  @Factory
  trait StartDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  @js.native
  @Factory
  trait StartDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  @js.native
  @Factory
  trait StopDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  @js.native
  @Factory
  trait StopDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * Detailed information about a subnet.
    */
  @js.native
  @Factory
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetStatus: js.UndefOr[String]
  }

  /**
    * Metadata assigned to an Amazon DocumentDB resource consisting of a key-value pair.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * Represents the output of <a>ListTagsForResource</a>.
    */
  @js.native
  @Factory
  trait TagListMessage extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  /**
    * The version of the database engine that an instance can be upgraded to.
    */
  @js.native
  @Factory
  trait UpgradeTarget extends js.Object {
    var AutoUpgrade: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var IsMajorVersionUpgrade: js.UndefOr[Boolean]
  }

  /**
    * Used as a response element for queries on virtual private cloud (VPC) security group membership.
    */
  @js.native
  @Factory
  trait VpcSecurityGroupMembership extends js.Object {
    var Status: js.UndefOr[String]
    var VpcSecurityGroupId: js.UndefOr[String]
  }
}
