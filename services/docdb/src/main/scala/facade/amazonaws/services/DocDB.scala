package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object docdb {
  type ApplyMethod                     = String
  type AttributeValueList              = js.Array[String]
  type AvailabilityZoneList            = js.Array[AvailabilityZone]
  type AvailabilityZones               = js.Array[String]
  type BooleanOptional                 = Boolean
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
  type SourceType                      = String
  type SubnetIdentifierList            = js.Array[String]
  type SubnetList                      = js.Array[Subnet]
  type TStamp                          = js.Date
  type TagList                         = js.Array[Tag]
  type ValidUpgradeTargetList          = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList          = js.Array[String]
  type VpcSecurityGroupMembershipList  = js.Array[VpcSecurityGroupMembership]

  implicit final class DocDBOps(val service: DocDB) extends AnyVal {

    def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[js.Object] =
      service.addTagsToResource(params).promise.toFuture
    def applyPendingMaintenanceActionFuture(
        params: ApplyPendingMaintenanceActionMessage
    ): Future[ApplyPendingMaintenanceActionResult] = service.applyPendingMaintenanceAction(params).promise.toFuture
    def copyDBClusterParameterGroupFuture(
        params: CopyDBClusterParameterGroupMessage
    ): Future[CopyDBClusterParameterGroupResult] = service.copyDBClusterParameterGroup(params).promise.toFuture
    def copyDBClusterSnapshotFuture(params: CopyDBClusterSnapshotMessage): Future[CopyDBClusterSnapshotResult] =
      service.copyDBClusterSnapshot(params).promise.toFuture
    def createDBClusterFuture(params: CreateDBClusterMessage): Future[CreateDBClusterResult] =
      service.createDBCluster(params).promise.toFuture
    def createDBClusterParameterGroupFuture(
        params: CreateDBClusterParameterGroupMessage
    ): Future[CreateDBClusterParameterGroupResult] = service.createDBClusterParameterGroup(params).promise.toFuture
    def createDBClusterSnapshotFuture(params: CreateDBClusterSnapshotMessage): Future[CreateDBClusterSnapshotResult] =
      service.createDBClusterSnapshot(params).promise.toFuture
    def createDBInstanceFuture(params: CreateDBInstanceMessage): Future[CreateDBInstanceResult] =
      service.createDBInstance(params).promise.toFuture
    def createDBSubnetGroupFuture(params: CreateDBSubnetGroupMessage): Future[CreateDBSubnetGroupResult] =
      service.createDBSubnetGroup(params).promise.toFuture
    def deleteDBClusterFuture(params: DeleteDBClusterMessage): Future[DeleteDBClusterResult] =
      service.deleteDBCluster(params).promise.toFuture
    def deleteDBClusterParameterGroupFuture(params: DeleteDBClusterParameterGroupMessage): Future[js.Object] =
      service.deleteDBClusterParameterGroup(params).promise.toFuture
    def deleteDBClusterSnapshotFuture(params: DeleteDBClusterSnapshotMessage): Future[DeleteDBClusterSnapshotResult] =
      service.deleteDBClusterSnapshot(params).promise.toFuture
    def deleteDBInstanceFuture(params: DeleteDBInstanceMessage): Future[DeleteDBInstanceResult] =
      service.deleteDBInstance(params).promise.toFuture
    def deleteDBSubnetGroupFuture(params: DeleteDBSubnetGroupMessage): Future[js.Object] =
      service.deleteDBSubnetGroup(params).promise.toFuture
    def describeDBClusterParameterGroupsFuture(
        params: DescribeDBClusterParameterGroupsMessage
    ): Future[DBClusterParameterGroupsMessage] = service.describeDBClusterParameterGroups(params).promise.toFuture
    def describeDBClusterParametersFuture(
        params: DescribeDBClusterParametersMessage
    ): Future[DBClusterParameterGroupDetails] = service.describeDBClusterParameters(params).promise.toFuture
    def describeDBClusterSnapshotAttributesFuture(
        params: DescribeDBClusterSnapshotAttributesMessage
    ): Future[DescribeDBClusterSnapshotAttributesResult] =
      service.describeDBClusterSnapshotAttributes(params).promise.toFuture
    def describeDBClusterSnapshotsFuture(params: DescribeDBClusterSnapshotsMessage): Future[DBClusterSnapshotMessage] =
      service.describeDBClusterSnapshots(params).promise.toFuture
    def describeDBClustersFuture(params: DescribeDBClustersMessage): Future[DBClusterMessage] =
      service.describeDBClusters(params).promise.toFuture
    def describeDBEngineVersionsFuture(params: DescribeDBEngineVersionsMessage): Future[DBEngineVersionMessage] =
      service.describeDBEngineVersions(params).promise.toFuture
    def describeDBInstancesFuture(params: DescribeDBInstancesMessage): Future[DBInstanceMessage] =
      service.describeDBInstances(params).promise.toFuture
    def describeDBSubnetGroupsFuture(params: DescribeDBSubnetGroupsMessage): Future[DBSubnetGroupMessage] =
      service.describeDBSubnetGroups(params).promise.toFuture
    def describeEngineDefaultClusterParametersFuture(
        params: DescribeEngineDefaultClusterParametersMessage
    ): Future[DescribeEngineDefaultClusterParametersResult] =
      service.describeEngineDefaultClusterParameters(params).promise.toFuture
    def describeEventCategoriesFuture(params: DescribeEventCategoriesMessage): Future[EventCategoriesMessage] =
      service.describeEventCategories(params).promise.toFuture
    def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] =
      service.describeEvents(params).promise.toFuture
    def describeOrderableDBInstanceOptionsFuture(
        params: DescribeOrderableDBInstanceOptionsMessage
    ): Future[OrderableDBInstanceOptionsMessage] = service.describeOrderableDBInstanceOptions(params).promise.toFuture
    def describePendingMaintenanceActionsFuture(
        params: DescribePendingMaintenanceActionsMessage
    ): Future[PendingMaintenanceActionsMessage] = service.describePendingMaintenanceActions(params).promise.toFuture
    def failoverDBClusterFuture(params: FailoverDBClusterMessage): Future[FailoverDBClusterResult] =
      service.failoverDBCluster(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[TagListMessage] =
      service.listTagsForResource(params).promise.toFuture
    def modifyDBClusterFuture(params: ModifyDBClusterMessage): Future[ModifyDBClusterResult] =
      service.modifyDBCluster(params).promise.toFuture
    def modifyDBClusterParameterGroupFuture(
        params: ModifyDBClusterParameterGroupMessage
    ): Future[DBClusterParameterGroupNameMessage] = service.modifyDBClusterParameterGroup(params).promise.toFuture
    def modifyDBClusterSnapshotAttributeFuture(
        params: ModifyDBClusterSnapshotAttributeMessage
    ): Future[ModifyDBClusterSnapshotAttributeResult] =
      service.modifyDBClusterSnapshotAttribute(params).promise.toFuture
    def modifyDBInstanceFuture(params: ModifyDBInstanceMessage): Future[ModifyDBInstanceResult] =
      service.modifyDBInstance(params).promise.toFuture
    def modifyDBSubnetGroupFuture(params: ModifyDBSubnetGroupMessage): Future[ModifyDBSubnetGroupResult] =
      service.modifyDBSubnetGroup(params).promise.toFuture
    def rebootDBInstanceFuture(params: RebootDBInstanceMessage): Future[RebootDBInstanceResult] =
      service.rebootDBInstance(params).promise.toFuture
    def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[js.Object] =
      service.removeTagsFromResource(params).promise.toFuture
    def resetDBClusterParameterGroupFuture(
        params: ResetDBClusterParameterGroupMessage
    ): Future[DBClusterParameterGroupNameMessage] = service.resetDBClusterParameterGroup(params).promise.toFuture
    def restoreDBClusterFromSnapshotFuture(
        params: RestoreDBClusterFromSnapshotMessage
    ): Future[RestoreDBClusterFromSnapshotResult] = service.restoreDBClusterFromSnapshot(params).promise.toFuture
    def restoreDBClusterToPointInTimeFuture(
        params: RestoreDBClusterToPointInTimeMessage
    ): Future[RestoreDBClusterToPointInTimeResult] = service.restoreDBClusterToPointInTime(params).promise.toFuture
    def startDBClusterFuture(params: StartDBClusterMessage): Future[StartDBClusterResult] =
      service.startDBCluster(params).promise.toFuture
    def stopDBClusterFuture(params: StopDBClusterMessage): Future[StopDBClusterResult] =
      service.stopDBCluster(params).promise.toFuture
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
    def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult] = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object]        = js.native
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
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object AddTagsToResourceMessage {
    def apply(
        ResourceName: String,
        Tags: TagList
    ): AddTagsToResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceMessage]
    }
  }

  object ApplyMethodEnum {
    val immediate        = "immediate"
    val `pending-reboot` = "pending-reboot"

    val values = js.Object.freeze(js.Array(immediate, `pending-reboot`))
  }

  /**
    * Represents the input to <a>ApplyPendingMaintenanceAction</a>.
    */
  @js.native
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    var ApplyAction: String
    var OptInType: String
    var ResourceIdentifier: String
  }

  object ApplyPendingMaintenanceActionMessage {
    def apply(
        ApplyAction: String,
        OptInType: String,
        ResourceIdentifier: String
    ): ApplyPendingMaintenanceActionMessage = {
      val __obj = js.Dictionary[js.Any](
        "ApplyAction"        -> ApplyAction.asInstanceOf[js.Any],
        "OptInType"          -> OptInType.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
    }
  }

  @js.native
  trait ApplyPendingMaintenanceActionResult extends js.Object {
    var ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions]
  }

  object ApplyPendingMaintenanceActionResult {
    def apply(
        ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions] = js.undefined
    ): ApplyPendingMaintenanceActionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourcePendingMaintenanceActions.foreach(
        __v => __obj.update("ResourcePendingMaintenanceActions", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ApplyPendingMaintenanceActionResult]
    }
  }

  /**
    * Information about an Availability Zone.
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZone {
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /**
    * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific DB instance or DB cluster.
    *  The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which logs are exported (or not exported) to CloudWatch Logs. The values within these arrays depend on the DB engine that is being used.
    */
  @js.native
  trait CloudwatchLogsExportConfiguration extends js.Object {
    var DisableLogTypes: js.UndefOr[LogTypeList]
    var EnableLogTypes: js.UndefOr[LogTypeList]
  }

  object CloudwatchLogsExportConfiguration {
    def apply(
        DisableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
        EnableLogTypes: js.UndefOr[LogTypeList] = js.undefined
    ): CloudwatchLogsExportConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      DisableLogTypes.foreach(__v => __obj.update("DisableLogTypes", __v.asInstanceOf[js.Any]))
      EnableLogTypes.foreach(__v => __obj.update("EnableLogTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudwatchLogsExportConfiguration]
    }
  }

  /**
    * Represents the input to <a>CopyDBClusterParameterGroup</a>.
    */
  @js.native
  trait CopyDBClusterParameterGroupMessage extends js.Object {
    var SourceDBClusterParameterGroupIdentifier: String
    var TargetDBClusterParameterGroupDescription: String
    var TargetDBClusterParameterGroupIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBClusterParameterGroupMessage {
    def apply(
        SourceDBClusterParameterGroupIdentifier: String,
        TargetDBClusterParameterGroupDescription: String,
        TargetDBClusterParameterGroupIdentifier: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBClusterParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "SourceDBClusterParameterGroupIdentifier"  -> SourceDBClusterParameterGroupIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterParameterGroupDescription" -> TargetDBClusterParameterGroupDescription.asInstanceOf[js.Any],
        "TargetDBClusterParameterGroupIdentifier"  -> TargetDBClusterParameterGroupIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CopyDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup]
  }

  object CopyDBClusterParameterGroupResult {
    def apply(
        DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined
    ): CopyDBClusterParameterGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterParameterGroup.foreach(__v => __obj.update("DBClusterParameterGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBClusterParameterGroupResult]
    }
  }

  /**
    * Represents the input to <a>CopyDBClusterSnapshot</a>.
    */
  @js.native
  trait CopyDBClusterSnapshotMessage extends js.Object {
    var SourceDBClusterSnapshotIdentifier: String
    var TargetDBClusterSnapshotIdentifier: String
    var CopyTags: js.UndefOr[BooleanOptional]
    var KmsKeyId: js.UndefOr[String]
    var PreSignedUrl: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBClusterSnapshotMessage {
    def apply(
        SourceDBClusterSnapshotIdentifier: String,
        TargetDBClusterSnapshotIdentifier: String,
        CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        PreSignedUrl: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBClusterSnapshotMessage = {
      val __obj = js.Dictionary[js.Any](
        "SourceDBClusterSnapshotIdentifier" -> SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterSnapshotIdentifier" -> TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      CopyTags.foreach(__v => __obj.update("CopyTags", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      PreSignedUrl.foreach(__v => __obj.update("PreSignedUrl", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait CopyDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object CopyDBClusterSnapshotResult {
    def apply(
        DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
    ): CopyDBClusterSnapshotResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterSnapshot.foreach(__v => __obj.update("DBClusterSnapshot", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBClusterSnapshotResult]
    }
  }

  /**
    * Represents the input to <a>CreateDBCluster</a>.
    */
  @js.native
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

  object CreateDBClusterMessage {
    def apply(
        DBClusterIdentifier: String,
        Engine: String,
        MasterUserPassword: String,
        MasterUsername: String,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredBackupWindow: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateDBClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any],
        "MasterUserPassword"  -> MasterUserPassword.asInstanceOf[js.Any],
        "MasterUsername"      -> MasterUsername.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.update("BackupRetentionPeriod", __v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v => __obj.update("DBClusterParameterGroupName", __v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.update("DBSubnetGroupName", __v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.update("DeletionProtection", __v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v => __obj.update("EnableCloudwatchLogsExports", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.update("PreferredBackupWindow", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.update("StorageEncrypted", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.update("VpcSecurityGroupIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterMessage]
    }
  }

  /**
    * Represents the input of <a>CreateDBClusterParameterGroup</a>.
    */
  @js.native
  trait CreateDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var DBParameterGroupFamily: String
    var Description: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBClusterParameterGroupMessage {
    def apply(
        DBClusterParameterGroupName: String,
        DBParameterGroupFamily: String,
        Description: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBClusterParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "DBParameterGroupFamily"      -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "Description"                 -> Description.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CreateDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup]
  }

  object CreateDBClusterParameterGroupResult {
    def apply(
        DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined
    ): CreateDBClusterParameterGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterParameterGroup.foreach(__v => __obj.update("DBClusterParameterGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterParameterGroupResult]
    }
  }

  @js.native
  trait CreateDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object CreateDBClusterResult {
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): CreateDBClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBCluster.foreach(__v => __obj.update("DBCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterResult]
    }
  }

  /**
    * Represents the input of <a>CreateDBClusterSnapshot</a>.
    */
  @js.native
  trait CreateDBClusterSnapshotMessage extends js.Object {
    var DBClusterIdentifier: String
    var DBClusterSnapshotIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBClusterSnapshotMessage {
    def apply(
        DBClusterIdentifier: String,
        DBClusterSnapshotIdentifier: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBClusterSnapshotMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier"         -> DBClusterIdentifier.asInstanceOf[js.Any],
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait CreateDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object CreateDBClusterSnapshotResult {
    def apply(
        DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
    ): CreateDBClusterSnapshotResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterSnapshot.foreach(__v => __obj.update("DBClusterSnapshot", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterSnapshotResult]
    }
  }

  /**
    * Represents the input to <a>CreateDBInstance</a>.
    */
  @js.native
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

  object CreateDBInstanceMessage {
    def apply(
        DBClusterIdentifier: String,
        DBInstanceClass: String,
        DBInstanceIdentifier: String,
        Engine: String,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBInstanceMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier"  -> DBClusterIdentifier.asInstanceOf[js.Any],
        "DBInstanceClass"      -> DBInstanceClass.asInstanceOf[js.Any],
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "Engine"               -> Engine.asInstanceOf[js.Any]
      )

      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      PromotionTier.foreach(__v => __obj.update("PromotionTier", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBInstanceMessage]
    }
  }

  @js.native
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object CreateDBInstanceResult {
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): CreateDBInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBInstance.foreach(__v => __obj.update("DBInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBInstanceResult]
    }
  }

  /**
    * Represents the input to <a>CreateDBSubnetGroup</a>.
    */
  @js.native
  trait CreateDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupDescription: String
    var DBSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBSubnetGroupMessage {
    def apply(
        DBSubnetGroupDescription: String,
        DBSubnetGroupName: String,
        SubnetIds: SubnetIdentifierList,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.asInstanceOf[js.Any],
        "DBSubnetGroupName"        -> DBSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"                -> SubnetIds.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  object CreateDBSubnetGroupResult {
    def apply(
        DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
    ): CreateDBSubnetGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBSubnetGroup.foreach(__v => __obj.update("DBSubnetGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBSubnetGroupResult]
    }
  }

  /**
    * Detailed information about a DB cluster.
    */
  @js.native
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

  object DBCluster {
    def apply(
        AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
        DBClusterArn: js.UndefOr[String] = js.undefined,
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.undefined,
        DBClusterParameterGroup: js.UndefOr[String] = js.undefined,
        DBSubnetGroup: js.UndefOr[String] = js.undefined,
        DbClusterResourceId: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[Boolean] = js.undefined,
        EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined,
        EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        Endpoint: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        HostedZoneId: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LatestRestorableTime: js.UndefOr[TStamp] = js.undefined,
        MasterUsername: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[Boolean] = js.undefined,
        PercentProgress: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredBackupWindow: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        ReaderEndpoint: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): DBCluster = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociatedRoles.foreach(__v => __obj.update("AssociatedRoles", __v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.update("BackupRetentionPeriod", __v.asInstanceOf[js.Any]))
      ClusterCreateTime.foreach(__v => __obj.update("ClusterCreateTime", __v.asInstanceOf[js.Any]))
      DBClusterArn.foreach(__v => __obj.update("DBClusterArn", __v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.update("DBClusterIdentifier", __v.asInstanceOf[js.Any]))
      DBClusterMembers.foreach(__v => __obj.update("DBClusterMembers", __v.asInstanceOf[js.Any]))
      DBClusterParameterGroup.foreach(__v => __obj.update("DBClusterParameterGroup", __v.asInstanceOf[js.Any]))
      DBSubnetGroup.foreach(__v => __obj.update("DBSubnetGroup", __v.asInstanceOf[js.Any]))
      DbClusterResourceId.foreach(__v => __obj.update("DbClusterResourceId", __v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.update("DeletionProtection", __v.asInstanceOf[js.Any]))
      EarliestRestorableTime.foreach(__v => __obj.update("EarliestRestorableTime", __v.asInstanceOf[js.Any]))
      EnabledCloudwatchLogsExports.foreach(
        __v => __obj.update("EnabledCloudwatchLogsExports", __v.asInstanceOf[js.Any])
      )
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.update("HostedZoneId", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      LatestRestorableTime.foreach(__v => __obj.update("LatestRestorableTime", __v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.update("MasterUsername", __v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.update("MultiAZ", __v.asInstanceOf[js.Any]))
      PercentProgress.foreach(__v => __obj.update("PercentProgress", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.update("PreferredBackupWindow", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      ReaderEndpoint.foreach(__v => __obj.update("ReaderEndpoint", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.update("StorageEncrypted", __v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.update("VpcSecurityGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBCluster]
    }
  }

  /**
    * Contains information about an instance that is part of a DB cluster.
    */
  @js.native
  trait DBClusterMember extends js.Object {
    var DBClusterParameterGroupStatus: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var IsClusterWriter: js.UndefOr[Boolean]
    var PromotionTier: js.UndefOr[IntegerOptional]
  }

  object DBClusterMember {
    def apply(
        DBClusterParameterGroupStatus: js.UndefOr[String] = js.undefined,
        DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        IsClusterWriter: js.UndefOr[Boolean] = js.undefined,
        PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
    ): DBClusterMember = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterParameterGroupStatus.foreach(
        __v => __obj.update("DBClusterParameterGroupStatus", __v.asInstanceOf[js.Any])
      )
      DBInstanceIdentifier.foreach(__v => __obj.update("DBInstanceIdentifier", __v.asInstanceOf[js.Any]))
      IsClusterWriter.foreach(__v => __obj.update("IsClusterWriter", __v.asInstanceOf[js.Any]))
      PromotionTier.foreach(__v => __obj.update("PromotionTier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterMember]
    }
  }

  /**
    * Represents the output of <a>DescribeDBClusters</a>.
    */
  @js.native
  trait DBClusterMessage extends js.Object {
    var DBClusters: js.UndefOr[DBClusterList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterMessage {
    def apply(
        DBClusters: js.UndefOr[DBClusterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBClusterMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusters.foreach(__v => __obj.update("DBClusters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterMessage]
    }
  }

  /**
    * Detailed information about a DB cluster parameter group.
    */
  @js.native
  trait DBClusterParameterGroup extends js.Object {
    var DBClusterParameterGroupArn: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object DBClusterParameterGroup {
    def apply(
        DBClusterParameterGroupArn: js.UndefOr[String] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined
    ): DBClusterParameterGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterParameterGroupArn.foreach(__v => __obj.update("DBClusterParameterGroupArn", __v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v => __obj.update("DBClusterParameterGroupName", __v.asInstanceOf[js.Any]))
      DBParameterGroupFamily.foreach(__v => __obj.update("DBParameterGroupFamily", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterParameterGroup]
    }
  }

  /**
    * Represents the output of <a>DBClusterParameterGroup</a>.
    */
  @js.native
  trait DBClusterParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object DBClusterParameterGroupDetails {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): DBClusterParameterGroupDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterParameterGroupDetails]
    }
  }

  /**
    * Contains the name of a DB cluster parameter group.
    */
  @js.native
  trait DBClusterParameterGroupNameMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
  }

  object DBClusterParameterGroupNameMessage {
    def apply(
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    ): DBClusterParameterGroupNameMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterParameterGroupName.foreach(__v => __obj.update("DBClusterParameterGroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterParameterGroupNameMessage]
    }
  }

  /**
    * Represents the output of <a>DBClusterParameterGroups</a>.
    */
  @js.native
  trait DBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterParameterGroupsMessage {
    def apply(
        DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBClusterParameterGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterParameterGroups.foreach(__v => __obj.update("DBClusterParameterGroups", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterParameterGroupsMessage]
    }
  }

  /**
    * Describes an AWS Identity and Access Management (IAM) role that is associated with a DB cluster.
    */
  @js.native
  trait DBClusterRole extends js.Object {
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBClusterRole {
    def apply(
        RoleArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DBClusterRole = {
      val __obj = js.Dictionary.empty[js.Any]
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterRole]
    }
  }

  /**
    * Detailed information about a DB cluster snapshot.
    */
  @js.native
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

  object DBClusterSnapshot {
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        DBClusterSnapshotArn: js.UndefOr[String] = js.undefined,
        DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MasterUsername: js.UndefOr[String] = js.undefined,
        PercentProgress: js.UndefOr[Int] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined,
        SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
        SnapshotType: js.UndefOr[String] = js.undefined,
        SourceDBClusterSnapshotArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): DBClusterSnapshot = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      ClusterCreateTime.foreach(__v => __obj.update("ClusterCreateTime", __v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.update("DBClusterIdentifier", __v.asInstanceOf[js.Any]))
      DBClusterSnapshotArn.foreach(__v => __obj.update("DBClusterSnapshotArn", __v.asInstanceOf[js.Any]))
      DBClusterSnapshotIdentifier.foreach(__v => __obj.update("DBClusterSnapshotIdentifier", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.update("MasterUsername", __v.asInstanceOf[js.Any]))
      PercentProgress.foreach(__v => __obj.update("PercentProgress", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      SnapshotCreateTime.foreach(__v => __obj.update("SnapshotCreateTime", __v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.update("SnapshotType", __v.asInstanceOf[js.Any]))
      SourceDBClusterSnapshotArn.foreach(__v => __obj.update("SourceDBClusterSnapshotArn", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.update("StorageEncrypted", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterSnapshot]
    }
  }

  /**
    * Contains the name and values of a manual DB cluster snapshot attribute.
    *  Manual DB cluster snapshot attributes are used to authorize other AWS accounts to restore a manual DB cluster snapshot.
    */
  @js.native
  trait DBClusterSnapshotAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  object DBClusterSnapshotAttribute {
    def apply(
        AttributeName: js.UndefOr[String] = js.undefined,
        AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
    ): DBClusterSnapshotAttribute = {
      val __obj = js.Dictionary.empty[js.Any]
      AttributeName.foreach(__v => __obj.update("AttributeName", __v.asInstanceOf[js.Any]))
      AttributeValues.foreach(__v => __obj.update("AttributeValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterSnapshotAttribute]
    }
  }

  /**
    * Detailed information about the attributes that are associated with a DB cluster snapshot.
    */
  @js.native
  trait DBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
  }

  object DBClusterSnapshotAttributesResult {
    def apply(
        DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined,
        DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DBClusterSnapshotAttributesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterSnapshotAttributes.foreach(__v => __obj.update("DBClusterSnapshotAttributes", __v.asInstanceOf[js.Any]))
      DBClusterSnapshotIdentifier.foreach(__v => __obj.update("DBClusterSnapshotIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterSnapshotAttributesResult]
    }
  }

  /**
    * Represents the output of <a>DescribeDBClusterSnapshots</a>.
    */
  @js.native
  trait DBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterSnapshotMessage {
    def apply(
        DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBClusterSnapshotMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterSnapshots.foreach(__v => __obj.update("DBClusterSnapshots", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterSnapshotMessage]
    }
  }

  /**
    * Detailed information about a DB engine version.
    */
  @js.native
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

  object DBEngineVersion {
    def apply(
        DBEngineDescription: js.UndefOr[String] = js.undefined,
        DBEngineVersionDescription: js.UndefOr[String] = js.undefined,
        DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
        SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined,
        ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined
    ): DBEngineVersion = {
      val __obj = js.Dictionary.empty[js.Any]
      DBEngineDescription.foreach(__v => __obj.update("DBEngineDescription", __v.asInstanceOf[js.Any]))
      DBEngineVersionDescription.foreach(__v => __obj.update("DBEngineVersionDescription", __v.asInstanceOf[js.Any]))
      DBParameterGroupFamily.foreach(__v => __obj.update("DBParameterGroupFamily", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      ExportableLogTypes.foreach(__v => __obj.update("ExportableLogTypes", __v.asInstanceOf[js.Any]))
      SupportsLogExportsToCloudwatchLogs.foreach(
        __v => __obj.update("SupportsLogExportsToCloudwatchLogs", __v.asInstanceOf[js.Any])
      )
      ValidUpgradeTarget.foreach(__v => __obj.update("ValidUpgradeTarget", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBEngineVersion]
    }
  }

  /**
    * Represents the output of <a>DescribeDBEngineVersions</a>.
    */
  @js.native
  trait DBEngineVersionMessage extends js.Object {
    var DBEngineVersions: js.UndefOr[DBEngineVersionList]
    var Marker: js.UndefOr[String]
  }

  object DBEngineVersionMessage {
    def apply(
        DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBEngineVersionMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBEngineVersions.foreach(__v => __obj.update("DBEngineVersions", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBEngineVersionMessage]
    }
  }

  /**
    * Detailed information about a DB instance.
    */
  @js.native
  trait DBInstance extends js.Object {
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[Int]
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

  object DBInstance {
    def apply(
        AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[Int] = js.undefined,
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        DBInstanceArn: js.UndefOr[String] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        DBInstanceStatus: js.UndefOr[String] = js.undefined,
        DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined,
        DbiResourceId: js.UndefOr[String] = js.undefined,
        EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LatestRestorableTime: js.UndefOr[TStamp] = js.undefined,
        PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
        PreferredBackupWindow: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
        PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
        StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined,
        StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): DBInstance = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.update("BackupRetentionPeriod", __v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.update("DBClusterIdentifier", __v.asInstanceOf[js.Any]))
      DBInstanceArn.foreach(__v => __obj.update("DBInstanceArn", __v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.update("DBInstanceClass", __v.asInstanceOf[js.Any]))
      DBInstanceIdentifier.foreach(__v => __obj.update("DBInstanceIdentifier", __v.asInstanceOf[js.Any]))
      DBInstanceStatus.foreach(__v => __obj.update("DBInstanceStatus", __v.asInstanceOf[js.Any]))
      DBSubnetGroup.foreach(__v => __obj.update("DBSubnetGroup", __v.asInstanceOf[js.Any]))
      DbiResourceId.foreach(__v => __obj.update("DbiResourceId", __v.asInstanceOf[js.Any]))
      EnabledCloudwatchLogsExports.foreach(
        __v => __obj.update("EnabledCloudwatchLogsExports", __v.asInstanceOf[js.Any])
      )
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      InstanceCreateTime.foreach(__v => __obj.update("InstanceCreateTime", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      LatestRestorableTime.foreach(__v => __obj.update("LatestRestorableTime", __v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.update("PendingModifiedValues", __v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.update("PreferredBackupWindow", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      PromotionTier.foreach(__v => __obj.update("PromotionTier", __v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.update("PubliclyAccessible", __v.asInstanceOf[js.Any]))
      StatusInfos.foreach(__v => __obj.update("StatusInfos", __v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.update("StorageEncrypted", __v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.update("VpcSecurityGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBInstance]
    }
  }

  /**
    * Represents the output of <a>DescribeDBInstances</a>.
    */
  @js.native
  trait DBInstanceMessage extends js.Object {
    var DBInstances: js.UndefOr[DBInstanceList]
    var Marker: js.UndefOr[String]
  }

  object DBInstanceMessage {
    def apply(
        DBInstances: js.UndefOr[DBInstanceList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBInstanceMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBInstances.foreach(__v => __obj.update("DBInstances", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBInstanceMessage]
    }
  }

  /**
    * Provides a list of status information for a DB instance.
    */
  @js.native
  trait DBInstanceStatusInfo extends js.Object {
    var Message: js.UndefOr[String]
    var Normal: js.UndefOr[Boolean]
    var Status: js.UndefOr[String]
    var StatusType: js.UndefOr[String]
  }

  object DBInstanceStatusInfo {
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Normal: js.UndefOr[Boolean] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        StatusType: js.UndefOr[String] = js.undefined
    ): DBInstanceStatusInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      Normal.foreach(__v => __obj.update("Normal", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusType.foreach(__v => __obj.update("StatusType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBInstanceStatusInfo]
    }
  }

  /**
    * Detailed information about a DB subnet group.
    */
  @js.native
  trait DBSubnetGroup extends js.Object {
    var DBSubnetGroupArn: js.UndefOr[String]
    var DBSubnetGroupDescription: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  object DBSubnetGroup {
    def apply(
        DBSubnetGroupArn: js.UndefOr[String] = js.undefined,
        DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        SubnetGroupStatus: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): DBSubnetGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      DBSubnetGroupArn.foreach(__v => __obj.update("DBSubnetGroupArn", __v.asInstanceOf[js.Any]))
      DBSubnetGroupDescription.foreach(__v => __obj.update("DBSubnetGroupDescription", __v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.update("DBSubnetGroupName", __v.asInstanceOf[js.Any]))
      SubnetGroupStatus.foreach(__v => __obj.update("SubnetGroupStatus", __v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.update("Subnets", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSubnetGroup]
    }
  }

  /**
    * Represents the output of <a>DescribeDBSubnetGroups</a>.
    */
  @js.native
  trait DBSubnetGroupMessage extends js.Object {
    var DBSubnetGroups: js.UndefOr[DBSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  object DBSubnetGroupMessage {
    def apply(
        DBSubnetGroups: js.UndefOr[DBSubnetGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBSubnetGroupMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBSubnetGroups.foreach(__v => __obj.update("DBSubnetGroups", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSubnetGroupMessage]
    }
  }

  /**
    * Represents the input to <a>DeleteDBCluster</a>.
    */
  @js.native
  trait DeleteDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
  }

  object DeleteDBClusterMessage {
    def apply(
        DBClusterIdentifier: String,
        FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
    ): DeleteDBClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      FinalDBSnapshotIdentifier.foreach(__v => __obj.update("FinalDBSnapshotIdentifier", __v.asInstanceOf[js.Any]))
      SkipFinalSnapshot.foreach(__v => __obj.update("SkipFinalSnapshot", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBClusterMessage]
    }
  }

  /**
    * Represents the input to <a>DeleteDBClusterParameterGroup</a>.
    */
  @js.native
  trait DeleteDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
  }

  object DeleteDBClusterParameterGroupMessage {
    def apply(
        DBClusterParameterGroupName: String
    ): DeleteDBClusterParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait DeleteDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object DeleteDBClusterResult {
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): DeleteDBClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBCluster.foreach(__v => __obj.update("DBCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBClusterResult]
    }
  }

  /**
    * Represents the input to <a>DeleteDBClusterSnapshot</a>.
    */
  @js.native
  trait DeleteDBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshotIdentifier: String
  }

  object DeleteDBClusterSnapshotMessage {
    def apply(
        DBClusterSnapshotIdentifier: String
    ): DeleteDBClusterSnapshotMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait DeleteDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object DeleteDBClusterSnapshotResult {
    def apply(
        DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
    ): DeleteDBClusterSnapshotResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterSnapshot.foreach(__v => __obj.update("DBClusterSnapshot", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBClusterSnapshotResult]
    }
  }

  /**
    * Represents the input to <a>DeleteDBInstance</a>.
    */
  @js.native
  trait DeleteDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
  }

  object DeleteDBInstanceMessage {
    def apply(
        DBInstanceIdentifier: String
    ): DeleteDBInstanceMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBInstanceMessage]
    }
  }

  @js.native
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object DeleteDBInstanceResult {
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): DeleteDBInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBInstance.foreach(__v => __obj.update("DBInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBInstanceResult]
    }
  }

  /**
    * Represents the input to <a>DeleteDBSubnetGroup</a>.
    */
  @js.native
  trait DeleteDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
  }

  object DeleteDBSubnetGroupMessage {
    def apply(
        DBSubnetGroupName: String
    ): DeleteDBSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBSubnetGroupMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeDBClusterParameterGroups</a>.
    */
  @js.native
  trait DescribeDBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBClusterParameterGroupsMessage {
    def apply(
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBClusterParameterGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterParameterGroupName.foreach(__v => __obj.update("DBClusterParameterGroupName", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClusterParameterGroupsMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeDBClusterParameters</a>.
    */
  @js.native
  trait DescribeDBClusterParametersMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  object DescribeDBClusterParametersMessage {
    def apply(
        DBClusterParameterGroupName: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): DescribeDBClusterParametersMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClusterParametersMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeDBClusterSnapshotAttributes</a>.
    */
  @js.native
  trait DescribeDBClusterSnapshotAttributesMessage extends js.Object {
    var DBClusterSnapshotIdentifier: String
  }

  object DescribeDBClusterSnapshotAttributesMessage {
    def apply(
        DBClusterSnapshotIdentifier: String
    ): DescribeDBClusterSnapshotAttributesMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesMessage]
    }
  }

  @js.native
  trait DescribeDBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult]
  }

  object DescribeDBClusterSnapshotAttributesResult {
    def apply(
        DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined
    ): DescribeDBClusterSnapshotAttributesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterSnapshotAttributesResult.foreach(
        __v => __obj.update("DBClusterSnapshotAttributesResult", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesResult]
    }
  }

  /**
    * Represents the input to <a>DescribeDBClusterSnapshots</a>.
    */
  @js.native
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

  object DescribeDBClusterSnapshotsMessage {
    def apply(
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        IncludePublic: js.UndefOr[Boolean] = js.undefined,
        IncludeShared: js.UndefOr[Boolean] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotType: js.UndefOr[String] = js.undefined
    ): DescribeDBClusterSnapshotsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterIdentifier.foreach(__v => __obj.update("DBClusterIdentifier", __v.asInstanceOf[js.Any]))
      DBClusterSnapshotIdentifier.foreach(__v => __obj.update("DBClusterSnapshotIdentifier", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      IncludePublic.foreach(__v => __obj.update("IncludePublic", __v.asInstanceOf[js.Any]))
      IncludeShared.foreach(__v => __obj.update("IncludeShared", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.update("SnapshotType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClusterSnapshotsMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeDBClusters</a>.
    */
  @js.native
  trait DescribeDBClustersMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBClustersMessage {
    def apply(
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBClustersMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterIdentifier.foreach(__v => __obj.update("DBClusterIdentifier", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClustersMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeDBEngineVersions</a>.
    */
  @js.native
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

  object DescribeDBEngineVersionsMessage {
    def apply(
        DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
        DefaultOnly: js.UndefOr[Boolean] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.undefined,
        ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBEngineVersionsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBParameterGroupFamily.foreach(__v => __obj.update("DBParameterGroupFamily", __v.asInstanceOf[js.Any]))
      DefaultOnly.foreach(__v => __obj.update("DefaultOnly", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      ListSupportedCharacterSets.foreach(__v => __obj.update("ListSupportedCharacterSets", __v.asInstanceOf[js.Any]))
      ListSupportedTimezones.foreach(__v => __obj.update("ListSupportedTimezones", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBEngineVersionsMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeDBInstances</a>.
    */
  @js.native
  trait DescribeDBInstancesMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBInstancesMessage {
    def apply(
        DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBInstancesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBInstanceIdentifier.foreach(__v => __obj.update("DBInstanceIdentifier", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBInstancesMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeDBSubnetGroups</a>.
    */
  @js.native
  trait DescribeDBSubnetGroupsMessage extends js.Object {
    var DBSubnetGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBSubnetGroupsMessage {
    def apply(
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBSubnetGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBSubnetGroupName.foreach(__v => __obj.update("DBSubnetGroupName", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBSubnetGroupsMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeEngineDefaultClusterParameters</a>.
    */
  @js.native
  trait DescribeEngineDefaultClusterParametersMessage extends js.Object {
    var DBParameterGroupFamily: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEngineDefaultClusterParametersMessage {
    def apply(
        DBParameterGroupFamily: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEngineDefaultClusterParametersMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineDefaultClusterParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultClusterParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  object DescribeEngineDefaultClusterParametersResult {
    def apply(
        EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
    ): DescribeEngineDefaultClusterParametersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      EngineDefaults.foreach(__v => __obj.update("EngineDefaults", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineDefaultClusterParametersResult]
    }
  }

  /**
    * Represents the input to <a>DescribeEventCategories</a>.
    */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SourceType: js.UndefOr[String]
  }

  object DescribeEventCategoriesMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): DescribeEventCategoriesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeEvents</a>.
    */
  @js.native
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

  object DescribeEventsMessage {
    def apply(
        Duration: js.UndefOr[IntegerOptional] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined
    ): DescribeEventsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.update("EventCategories", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.update("SourceIdentifier", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
    * Represents the input to <a>DescribeOrderableDBInstanceOptions</a>.
    */
  @js.native
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

  object DescribeOrderableDBInstanceOptionsMessage {
    def apply(
        Engine: String,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        LicenseModel: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        Vpc: js.UndefOr[BooleanOptional] = js.undefined
    ): DescribeOrderableDBInstanceOptionsMessage = {
      val __obj = js.Dictionary[js.Any](
        "Engine" -> Engine.asInstanceOf[js.Any]
      )

      DBInstanceClass.foreach(__v => __obj.update("DBInstanceClass", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.update("LicenseModel", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      Vpc.foreach(__v => __obj.update("Vpc", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
    }
  }

  /**
    * Represents the input to <a>DescribePendingMaintenanceActions</a>.
    */
  @js.native
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ResourceIdentifier: js.UndefOr[String]
  }

  object DescribePendingMaintenanceActionsMessage {
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined
    ): DescribePendingMaintenanceActionsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.update("ResourceIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingMaintenanceActionsMessage]
    }
  }

  /**
    * Network information for accessing a DB cluster or DB instance. Client programs must specify a valid endpoint to access these Amazon DocumentDB resources.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  object Endpoint {
    def apply(
        Address: js.UndefOr[String] = js.undefined,
        HostedZoneId: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined
    ): Endpoint = {
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.update("HostedZoneId", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeEngineDefaultClusterParameters</code> operation.
    */
  @js.native
  trait EngineDefaults extends js.Object {
    var DBParameterGroupFamily: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object EngineDefaults {
    def apply(
        DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): EngineDefaults = {
      val __obj = js.Dictionary.empty[js.Any]
      DBParameterGroupFamily.foreach(__v => __obj.update("DBParameterGroupFamily", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineDefaults]
    }
  }

  /**
    * Detailed information about an event.
    */
  @js.native
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Message: js.UndefOr[String]
    var SourceArn: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  object Event {
    def apply(
        Date: js.UndefOr[TStamp] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        SourceArn: js.UndefOr[String] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): Event = {
      val __obj = js.Dictionary.empty[js.Any]
      Date.foreach(__v => __obj.update("Date", __v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.update("EventCategories", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.update("SourceIdentifier", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /**
    * An event source type, accompanied by one or more event category names.
    */
  @js.native
  trait EventCategoriesMap extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  object EventCategoriesMap {
    def apply(
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): EventCategoriesMap = {
      val __obj = js.Dictionary.empty[js.Any]
      EventCategories.foreach(__v => __obj.update("EventCategories", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventCategoriesMap]
    }
  }

  /**
    * Represents the output of <a>DescribeEventCategories</a>.
    */
  @js.native
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList]
  }

  object EventCategoriesMessage {
    def apply(
        EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined
    ): EventCategoriesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      EventCategoriesMapList.foreach(__v => __obj.update("EventCategoriesMapList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventCategoriesMessage]
    }
  }

  /**
    * Represents the output of <a>DescribeEvents</a>.
    */
  @js.native
  trait EventsMessage extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  object EventsMessage {
    def apply(
        Events: js.UndefOr[EventList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): EventsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Events.foreach(__v => __obj.update("Events", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsMessage]
    }
  }

  /**
    * Represents the input to <a>FailoverDBCluster</a>.
    */
  @js.native
  trait FailoverDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var TargetDBInstanceIdentifier: js.UndefOr[String]
  }

  object FailoverDBClusterMessage {
    def apply(
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
    ): FailoverDBClusterMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterIdentifier.foreach(__v => __obj.update("DBClusterIdentifier", __v.asInstanceOf[js.Any]))
      TargetDBInstanceIdentifier.foreach(__v => __obj.update("TargetDBInstanceIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailoverDBClusterMessage]
    }
  }

  @js.native
  trait FailoverDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object FailoverDBClusterResult {
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): FailoverDBClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBCluster.foreach(__v => __obj.update("DBCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailoverDBClusterResult]
    }
  }

  /**
    * A named set of filter values, used to return a more specific list of results. You can use a filter to match a set of resources by specific criteria, such as IDs.
    *  Wildcards are not supported in filters.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  object Filter {
    def apply(
        Name: String,
        Values: FilterValueList
    ): Filter = {
      val __obj = js.Dictionary[js.Any](
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Filter]
    }
  }

  /**
    * Represents the input to <a>ListTagsForResource</a>.
    */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
    var Filters: js.UndefOr[FilterList]
  }

  object ListTagsForResourceMessage {
    def apply(
        ResourceName: String,
        Filters: js.UndefOr[FilterList] = js.undefined
    ): ListTagsForResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
    * Represents the input to <a>ModifyDBCluster</a>.
    */
  @js.native
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

  object ModifyDBClusterMessage {
    def apply(
        DBClusterIdentifier: String,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MasterUserPassword: js.UndefOr[String] = js.undefined,
        NewDBClusterIdentifier: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredBackupWindow: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): ModifyDBClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      ApplyImmediately.foreach(__v => __obj.update("ApplyImmediately", __v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.update("BackupRetentionPeriod", __v.asInstanceOf[js.Any]))
      CloudwatchLogsExportConfiguration.foreach(
        __v => __obj.update("CloudwatchLogsExportConfiguration", __v.asInstanceOf[js.Any])
      )
      DBClusterParameterGroupName.foreach(__v => __obj.update("DBClusterParameterGroupName", __v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.update("DeletionProtection", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.update("MasterUserPassword", __v.asInstanceOf[js.Any]))
      NewDBClusterIdentifier.foreach(__v => __obj.update("NewDBClusterIdentifier", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.update("PreferredBackupWindow", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.update("VpcSecurityGroupIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBClusterMessage]
    }
  }

  /**
    * Represents the input to <a>ModifyDBClusterParameterGroup</a>.
    */
  @js.native
  trait ModifyDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Parameters: ParametersList
  }

  object ModifyDBClusterParameterGroupMessage {
    def apply(
        DBClusterParameterGroupName: String,
        Parameters: ParametersList
    ): ModifyDBClusterParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "Parameters"                  -> Parameters.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ModifyDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object ModifyDBClusterResult {
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): ModifyDBClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBCluster.foreach(__v => __obj.update("DBCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBClusterResult]
    }
  }

  /**
    * Represents the input to <a>ModifyDBClusterSnapshotAttribute</a>.
    */
  @js.native
  trait ModifyDBClusterSnapshotAttributeMessage extends js.Object {
    var AttributeName: String
    var DBClusterSnapshotIdentifier: String
    var ValuesToAdd: js.UndefOr[AttributeValueList]
    var ValuesToRemove: js.UndefOr[AttributeValueList]
  }

  object ModifyDBClusterSnapshotAttributeMessage {
    def apply(
        AttributeName: String,
        DBClusterSnapshotIdentifier: String,
        ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined,
        ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
    ): ModifyDBClusterSnapshotAttributeMessage = {
      val __obj = js.Dictionary[js.Any](
        "AttributeName"               -> AttributeName.asInstanceOf[js.Any],
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      ValuesToAdd.foreach(__v => __obj.update("ValuesToAdd", __v.asInstanceOf[js.Any]))
      ValuesToRemove.foreach(__v => __obj.update("ValuesToRemove", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeMessage]
    }
  }

  @js.native
  trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult]
  }

  object ModifyDBClusterSnapshotAttributeResult {
    def apply(
        DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined
    ): ModifyDBClusterSnapshotAttributeResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBClusterSnapshotAttributesResult.foreach(
        __v => __obj.update("DBClusterSnapshotAttributesResult", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
    }
  }

  /**
    * Represents the input to <a>ModifyDBInstance</a>.
    */
  @js.native
  trait ModifyDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var DBInstanceClass: js.UndefOr[String]
    var NewDBInstanceIdentifier: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
  }

  object ModifyDBInstanceMessage {
    def apply(
        DBInstanceIdentifier: String,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        NewDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
    ): ModifyDBInstanceMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      ApplyImmediately.foreach(__v => __obj.update("ApplyImmediately", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.update("DBInstanceClass", __v.asInstanceOf[js.Any]))
      NewDBInstanceIdentifier.foreach(__v => __obj.update("NewDBInstanceIdentifier", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      PromotionTier.foreach(__v => __obj.update("PromotionTier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBInstanceMessage]
    }
  }

  @js.native
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object ModifyDBInstanceResult {
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): ModifyDBInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBInstance.foreach(__v => __obj.update("DBInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBInstanceResult]
    }
  }

  /**
    * Represents the input to <a>ModifyDBSubnetGroup</a>.
    */
  @js.native
  trait ModifyDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var DBSubnetGroupDescription: js.UndefOr[String]
  }

  object ModifyDBSubnetGroupMessage {
    def apply(
        DBSubnetGroupName: String,
        SubnetIds: SubnetIdentifierList,
        DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
    ): ModifyDBSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"         -> SubnetIds.asInstanceOf[js.Any]
      )

      DBSubnetGroupDescription.foreach(__v => __obj.update("DBSubnetGroupDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  object ModifyDBSubnetGroupResult {
    def apply(
        DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
    ): ModifyDBSubnetGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBSubnetGroup.foreach(__v => __obj.update("DBSubnetGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBSubnetGroupResult]
    }
  }

  /**
    * The options that are available for a DB instance.
    */
  @js.native
  trait OrderableDBInstanceOption extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var DBInstanceClass: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var Vpc: js.UndefOr[Boolean]
  }

  object OrderableDBInstanceOption {
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        LicenseModel: js.UndefOr[String] = js.undefined,
        Vpc: js.UndefOr[Boolean] = js.undefined
    ): OrderableDBInstanceOption = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.update("DBInstanceClass", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.update("LicenseModel", __v.asInstanceOf[js.Any]))
      Vpc.foreach(__v => __obj.update("Vpc", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderableDBInstanceOption]
    }
  }

  /**
    * Represents the output of <a>DescribeOrderableDBInstanceOptions</a>.
    */
  @js.native
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList]
  }

  object OrderableDBInstanceOptionsMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined
    ): OrderableDBInstanceOptionsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      OrderableDBInstanceOptions.foreach(__v => __obj.update("OrderableDBInstanceOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderableDBInstanceOptionsMessage]
    }
  }

  /**
    * Detailed information about an individual parameter.
    */
  @js.native
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

  object Parameter {
    def apply(
        AllowedValues: js.UndefOr[String] = js.undefined,
        ApplyMethod: js.UndefOr[ApplyMethod] = js.undefined,
        ApplyType: js.UndefOr[String] = js.undefined,
        DataType: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IsModifiable: js.UndefOr[Boolean] = js.undefined,
        MinimumEngineVersion: js.UndefOr[String] = js.undefined,
        ParameterName: js.UndefOr[String] = js.undefined,
        ParameterValue: js.UndefOr[String] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): Parameter = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowedValues.foreach(__v => __obj.update("AllowedValues", __v.asInstanceOf[js.Any]))
      ApplyMethod.foreach(__v => __obj.update("ApplyMethod", __v.asInstanceOf[js.Any]))
      ApplyType.foreach(__v => __obj.update("ApplyType", __v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.update("DataType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IsModifiable.foreach(__v => __obj.update("IsModifiable", __v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.update("MinimumEngineVersion", __v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.update("ParameterName", __v.asInstanceOf[js.Any]))
      ParameterValue.foreach(__v => __obj.update("ParameterValue", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
    }
  }

  /**
    * A list of the log types whose configuration is still pending. These log types are in the process of being activated or deactivated.
    */
  @js.native
  trait PendingCloudwatchLogsExports extends js.Object {
    var LogTypesToDisable: js.UndefOr[LogTypeList]
    var LogTypesToEnable: js.UndefOr[LogTypeList]
  }

  object PendingCloudwatchLogsExports {
    def apply(
        LogTypesToDisable: js.UndefOr[LogTypeList] = js.undefined,
        LogTypesToEnable: js.UndefOr[LogTypeList] = js.undefined
    ): PendingCloudwatchLogsExports = {
      val __obj = js.Dictionary.empty[js.Any]
      LogTypesToDisable.foreach(__v => __obj.update("LogTypesToDisable", __v.asInstanceOf[js.Any]))
      LogTypesToEnable.foreach(__v => __obj.update("LogTypesToEnable", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingCloudwatchLogsExports]
    }
  }

  /**
    * Provides information about a pending maintenance action for a resource.
    */
  @js.native
  trait PendingMaintenanceAction extends js.Object {
    var Action: js.UndefOr[String]
    var AutoAppliedAfterDate: js.UndefOr[TStamp]
    var CurrentApplyDate: js.UndefOr[TStamp]
    var Description: js.UndefOr[String]
    var ForcedApplyDate: js.UndefOr[TStamp]
    var OptInStatus: js.UndefOr[String]
  }

  object PendingMaintenanceAction {
    def apply(
        Action: js.UndefOr[String] = js.undefined,
        AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined,
        CurrentApplyDate: js.UndefOr[TStamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForcedApplyDate: js.UndefOr[TStamp] = js.undefined,
        OptInStatus: js.UndefOr[String] = js.undefined
    ): PendingMaintenanceAction = {
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      AutoAppliedAfterDate.foreach(__v => __obj.update("AutoAppliedAfterDate", __v.asInstanceOf[js.Any]))
      CurrentApplyDate.foreach(__v => __obj.update("CurrentApplyDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ForcedApplyDate.foreach(__v => __obj.update("ForcedApplyDate", __v.asInstanceOf[js.Any]))
      OptInStatus.foreach(__v => __obj.update("OptInStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingMaintenanceAction]
    }
  }

  /**
    * Represents the output of <a>DescribePendingMaintenanceActions</a>.
    */
  @js.native
  trait PendingMaintenanceActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
  }

  object PendingMaintenanceActionsMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined
    ): PendingMaintenanceActionsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      PendingMaintenanceActions.foreach(__v => __obj.update("PendingMaintenanceActions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingMaintenanceActionsMessage]
    }
  }

  /**
    * One or more modified settings for a DB instance. These modified settings have been requested, but haven't been applied yet.
    */
  @js.native
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

  object PendingModifiedValues {
    def apply(
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        CACertificateIdentifier: js.UndefOr[String] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        Iops: js.UndefOr[IntegerOptional] = js.undefined,
        LicenseModel: js.UndefOr[String] = js.undefined,
        MasterUserPassword: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        PendingCloudwatchLogsExports: js.UndefOr[PendingCloudwatchLogsExports] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined
    ): PendingModifiedValues = {
      val __obj = js.Dictionary.empty[js.Any]
      AllocatedStorage.foreach(__v => __obj.update("AllocatedStorage", __v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.update("BackupRetentionPeriod", __v.asInstanceOf[js.Any]))
      CACertificateIdentifier.foreach(__v => __obj.update("CACertificateIdentifier", __v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.update("DBInstanceClass", __v.asInstanceOf[js.Any]))
      DBInstanceIdentifier.foreach(__v => __obj.update("DBInstanceIdentifier", __v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.update("DBSubnetGroupName", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.update("Iops", __v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.update("LicenseModel", __v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.update("MasterUserPassword", __v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.update("MultiAZ", __v.asInstanceOf[js.Any]))
      PendingCloudwatchLogsExports.foreach(
        __v => __obj.update("PendingCloudwatchLogsExports", __v.asInstanceOf[js.Any])
      )
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.update("StorageType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingModifiedValues]
    }
  }

  /**
    * Represents the input to <a>RebootDBInstance</a>.
    */
  @js.native
  trait RebootDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  object RebootDBInstanceMessage {
    def apply(
        DBInstanceIdentifier: String,
        ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
    ): RebootDBInstanceMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      ForceFailover.foreach(__v => __obj.update("ForceFailover", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootDBInstanceMessage]
    }
  }

  @js.native
  trait RebootDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RebootDBInstanceResult {
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): RebootDBInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBInstance.foreach(__v => __obj.update("DBInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootDBInstanceResult]
    }
  }

  /**
    * Represents the input to <a>RemoveTagsFromResource</a>.
    */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceMessage {
    def apply(
        ResourceName: String,
        TagKeys: KeyList
    ): RemoveTagsFromResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
    * Represents the input to <a>ResetDBClusterParameterGroup</a>.
    */
  @js.native
  trait ResetDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  object ResetDBClusterParameterGroupMessage {
    def apply(
        DBClusterParameterGroupName: String,
        Parameters: js.UndefOr[ParametersList] = js.undefined,
        ResetAllParameters: js.UndefOr[Boolean] = js.undefined
    ): ResetDBClusterParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      ResetAllParameters.foreach(__v => __obj.update("ResetAllParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetDBClusterParameterGroupMessage]
    }
  }

  /**
    * Represents the output of <a>ApplyPendingMaintenanceAction</a>.
    */
  @js.native
  trait ResourcePendingMaintenanceActions extends js.Object {
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails]
    var ResourceIdentifier: js.UndefOr[String]
  }

  object ResourcePendingMaintenanceActions {
    def apply(
        PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined
    ): ResourcePendingMaintenanceActions = {
      val __obj = js.Dictionary.empty[js.Any]
      PendingMaintenanceActionDetails.foreach(
        __v => __obj.update("PendingMaintenanceActionDetails", __v.asInstanceOf[js.Any])
      )
      ResourceIdentifier.foreach(__v => __obj.update("ResourceIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePendingMaintenanceActions]
    }
  }

  /**
    * Represents the input to <a>RestoreDBClusterFromSnapshot</a>.
    */
  @js.native
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

  object RestoreDBClusterFromSnapshotMessage {
    def apply(
        DBClusterIdentifier: String,
        Engine: String,
        SnapshotIdentifier: String,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBClusterFromSnapshotMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any],
        "SnapshotIdentifier"  -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.update("DBSubnetGroupName", __v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.update("DeletionProtection", __v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v => __obj.update("EnableCloudwatchLogsExports", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.update("VpcSecurityGroupIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterFromSnapshotMessage]
    }
  }

  @js.native
  trait RestoreDBClusterFromSnapshotResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterFromSnapshotResult {
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): RestoreDBClusterFromSnapshotResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBCluster.foreach(__v => __obj.update("DBCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterFromSnapshotResult]
    }
  }

  /**
    * Represents the input to <a>RestoreDBClusterToPointInTime</a>.
    */
  @js.native
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

  object RestoreDBClusterToPointInTimeMessage {
    def apply(
        DBClusterIdentifier: String,
        SourceDBClusterIdentifier: String,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        RestoreToTime: js.UndefOr[TStamp] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBClusterToPointInTimeMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier"       -> DBClusterIdentifier.asInstanceOf[js.Any],
        "SourceDBClusterIdentifier" -> SourceDBClusterIdentifier.asInstanceOf[js.Any]
      )

      DBSubnetGroupName.foreach(__v => __obj.update("DBSubnetGroupName", __v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.update("DeletionProtection", __v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v => __obj.update("EnableCloudwatchLogsExports", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      RestoreToTime.foreach(__v => __obj.update("RestoreToTime", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      UseLatestRestorableTime.foreach(__v => __obj.update("UseLatestRestorableTime", __v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.update("VpcSecurityGroupIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterToPointInTimeMessage]
    }
  }

  @js.native
  trait RestoreDBClusterToPointInTimeResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterToPointInTimeResult {
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): RestoreDBClusterToPointInTimeResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBCluster.foreach(__v => __obj.update("DBCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterToPointInTimeResult]
    }
  }

  object SourceTypeEnum {
    val `db-instance`         = "db-instance"
    val `db-parameter-group`  = "db-parameter-group"
    val `db-security-group`   = "db-security-group"
    val `db-snapshot`         = "db-snapshot"
    val `db-cluster`          = "db-cluster"
    val `db-cluster-snapshot` = "db-cluster-snapshot"

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
  trait StartDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  object StartDBClusterMessage {
    def apply(
        DBClusterIdentifier: String
    ): StartDBClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartDBClusterMessage]
    }
  }

  @js.native
  trait StartDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object StartDBClusterResult {
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): StartDBClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBCluster.foreach(__v => __obj.update("DBCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDBClusterResult]
    }
  }

  @js.native
  trait StopDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  object StopDBClusterMessage {
    def apply(
        DBClusterIdentifier: String
    ): StopDBClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopDBClusterMessage]
    }
  }

  @js.native
  trait StopDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object StopDBClusterResult {
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): StopDBClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DBCluster.foreach(__v => __obj.update("DBCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDBClusterResult]
    }
  }

  /**
    * Detailed information about a subnet.
    */
  @js.native
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetStatus: js.UndefOr[String]
  }

  object Subnet {
    def apply(
        SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        SubnetIdentifier: js.UndefOr[String] = js.undefined,
        SubnetStatus: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dictionary.empty[js.Any]
      SubnetAvailabilityZone.foreach(__v => __obj.update("SubnetAvailabilityZone", __v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.update("SubnetIdentifier", __v.asInstanceOf[js.Any]))
      SubnetStatus.foreach(__v => __obj.update("SubnetStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subnet]
    }
  }

  /**
    * Metadata assigned to an Amazon DocumentDB resource consisting of a key-value pair.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * Represents the output of <a>ListTagsForResource</a>.
    */
  @js.native
  trait TagListMessage extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object TagListMessage {
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): TagListMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      TagList.foreach(__v => __obj.update("TagList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagListMessage]
    }
  }

  /**
    * The version of the database engine that a DB instance can be upgraded to.
    */
  @js.native
  trait UpgradeTarget extends js.Object {
    var AutoUpgrade: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var IsMajorVersionUpgrade: js.UndefOr[Boolean]
  }

  object UpgradeTarget {
    def apply(
        AutoUpgrade: js.UndefOr[Boolean] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    ): UpgradeTarget = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoUpgrade.foreach(__v => __obj.update("AutoUpgrade", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      IsMajorVersionUpgrade.foreach(__v => __obj.update("IsMajorVersionUpgrade", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeTarget]
    }
  }

  /**
    * Used as a response element for queries on virtual private cloud (VPC) security group membership.
    */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var Status: js.UndefOr[String]
    var VpcSecurityGroupId: js.UndefOr[String]
  }

  object VpcSecurityGroupMembership {
    def apply(
        Status: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupId: js.UndefOr[String] = js.undefined
    ): VpcSecurityGroupMembership = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      VpcSecurityGroupId.foreach(__v => __obj.update("VpcSecurityGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
