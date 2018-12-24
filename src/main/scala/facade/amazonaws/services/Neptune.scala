package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object neptune {
  type ApplyMethod = String
  type AttributeValueList = js.Array[String]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZones = js.Array[String]
  type BooleanOptional = Boolean
  type DBClusterList = js.Array[DBCluster]
  type DBClusterMemberList = js.Array[DBClusterMember]
  type DBClusterOptionGroupMemberships = js.Array[DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList = js.Array[DBClusterParameterGroup]
  type DBClusterRoles = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[DBClusterSnapshot]
  type DBEngineVersionList = js.Array[DBEngineVersion]
  type DBInstanceList = js.Array[DBInstance]
  type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[DBParameterGroupStatus]
  type DBSecurityGroupMembershipList = js.Array[DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[String]
  type DBSubnetGroups = js.Array[DBSubnetGroup]
  type DomainMembershipList = js.Array[DomainMembership]
  type DoubleOptional = Double
  type DoubleRangeList = js.Array[DoubleRange]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type IntegerOptional = Int
  type KeyList = js.Array[String]
  type LogTypeList = js.Array[String]
  type OptionGroupMembershipList = js.Array[OptionGroupMembership]
  type OrderableDBInstanceOptionsList = js.Array[OrderableDBInstanceOption]
  type ParametersList = js.Array[Parameter]
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  type RangeList = js.Array[Range]
  type ReadReplicaDBClusterIdentifierList = js.Array[String]
  type ReadReplicaDBInstanceIdentifierList = js.Array[String]
  type ReadReplicaIdentifierList = js.Array[String]
  type SourceIdsList = js.Array[String]
  type SourceType = String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedCharacterSetsList = js.Array[CharacterSet]
  type SupportedTimezonesList = js.Array[Timezone]
  type TStamp = js.Date
  type TagList = js.Array[Tag]
  type ValidStorageOptionsList = js.Array[ValidStorageOptions]
  type ValidUpgradeTargetList = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
}

package neptune {
  @js.native
  @JSImport("aws-sdk", "Neptune")
  class Neptune() extends js.Object {
    def this(config: AWSConfig) = this()

    def addRoleToDBCluster(params: AddRoleToDBClusterMessage): Request[js.Object] = js.native
    def addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage): Request[AddSourceIdentifierToSubscriptionResult] = js.native
    def addTagsToResource(params: AddTagsToResourceMessage): Request[js.Object] = js.native
    def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): Request[ApplyPendingMaintenanceActionResult] = js.native
    def copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage): Request[CopyDBClusterParameterGroupResult] = js.native
    def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): Request[CopyDBClusterSnapshotResult] = js.native
    def copyDBParameterGroup(params: CopyDBParameterGroupMessage): Request[CopyDBParameterGroupResult] = js.native
    def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult] = js.native
    def createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage): Request[CreateDBClusterParameterGroupResult] = js.native
    def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): Request[CreateDBClusterSnapshotResult] = js.native
    def createDBInstance(params: CreateDBInstanceMessage): Request[CreateDBInstanceResult] = js.native
    def createDBParameterGroup(params: CreateDBParameterGroupMessage): Request[CreateDBParameterGroupResult] = js.native
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] = js.native
    def deleteDBCluster(params: DeleteDBClusterMessage): Request[DeleteDBClusterResult] = js.native
    def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): Request[js.Object] = js.native
    def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): Request[DeleteDBClusterSnapshotResult] = js.native
    def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult] = js.native
    def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): Request[js.Object] = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object] = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResult] = js.native
    def describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage): Request[DBClusterParameterGroupsMessage] = js.native
    def describeDBClusterParameters(params: DescribeDBClusterParametersMessage): Request[DBClusterParameterGroupDetails] = js.native
    def describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage): Request[DescribeDBClusterSnapshotAttributesResult] = js.native
    def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): Request[DBClusterSnapshotMessage] = js.native
    def describeDBClusters(params: DescribeDBClustersMessage): Request[DBClusterMessage] = js.native
    def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage): Request[DBEngineVersionMessage] = js.native
    def describeDBInstances(params: DescribeDBInstancesMessage): Request[DBInstanceMessage] = js.native
    def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage): Request[DBParameterGroupsMessage] = js.native
    def describeDBParameters(params: DescribeDBParametersMessage): Request[DBParameterGroupDetails] = js.native
    def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): Request[DBSubnetGroupMessage] = js.native
    def describeEngineDefaultClusterParameters(params: DescribeEngineDefaultClusterParametersMessage): Request[DescribeEngineDefaultClusterParametersResult] = js.native
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): Request[DescribeEngineDefaultParametersResult] = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage] = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage): Request[OrderableDBInstanceOptionsMessage] = js.native
    def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): Request[PendingMaintenanceActionsMessage] = js.native
    def describeValidDBInstanceModifications(params: DescribeValidDBInstanceModificationsMessage): Request[DescribeValidDBInstanceModificationsResult] = js.native
    def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage] = js.native
    def modifyDBCluster(params: ModifyDBClusterMessage): Request[ModifyDBClusterResult] = js.native
    def modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage] = js.native
    def modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage): Request[ModifyDBClusterSnapshotAttributeResult] = js.native
    def modifyDBInstance(params: ModifyDBInstanceMessage): Request[ModifyDBInstanceResult] = js.native
    def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): Request[ModifyDBSubnetGroupResult] = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult] = js.native
    def promoteReadReplicaDBCluster(params: PromoteReadReplicaDBClusterMessage): Request[PromoteReadReplicaDBClusterResult] = js.native
    def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult] = js.native
    def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): Request[js.Object] = js.native
    def removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage): Request[RemoveSourceIdentifierFromSubscriptionResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object] = js.native
    def resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage] = js.native
    def resetDBParameterGroup(params: ResetDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage): Request[RestoreDBClusterFromSnapshotResult] = js.native
    def restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage): Request[RestoreDBClusterToPointInTimeResult] = js.native
  }

  @js.native
  trait AddRoleToDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
  }

  object AddRoleToDBClusterMessage {
    def apply(
      DBClusterIdentifier: String,
      RoleArn: String): AddRoleToDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddRoleToDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddSourceIdentifierToSubscriptionMessage extends js.Object {
    var SourceIdentifier: String
    var SubscriptionName: String
  }

  object AddSourceIdentifierToSubscriptionMessage {
    def apply(
      SourceIdentifier: String,
      SubscriptionName: String): AddSourceIdentifierToSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddSourceIdentifierToSubscriptionMessage]
    }
  }

  @js.native
  trait AddSourceIdentifierToSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object AddSourceIdentifierToSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): AddSourceIdentifierToSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddSourceIdentifierToSubscriptionResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object AddTagsToResourceMessage {
    def apply(
      ResourceName: String,
      Tags: TagList): AddTagsToResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceMessage]
    }
  }

  object ApplyMethodEnum {
    val immediate = "immediate"
    val `pending-reboot` = "pending-reboot"

    val values = IndexedSeq(immediate, `pending-reboot`)
  }

  /**
   * <p/>
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
      ResourceIdentifier: String): ApplyPendingMaintenanceActionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplyAction" -> ApplyAction.asInstanceOf[js.Any],
        "OptInType" -> OptInType.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplyPendingMaintenanceActionMessage]
    }
  }

  @js.native
  trait ApplyPendingMaintenanceActionResult extends js.Object {
    var ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions]
  }

  object ApplyPendingMaintenanceActionResult {
    def apply(
      ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions] = js.undefined): ApplyPendingMaintenanceActionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourcePendingMaintenanceActions" -> ResourcePendingMaintenanceActions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplyPendingMaintenanceActionResult]
    }
  }

  /**
   * Specified CIDRIP or EC2 security group is not authorized for the specified DB security group.
   *  Neptune may not also be authorized via IAM to perform necessary actions on your behalf.
   */
  @js.native
  trait AuthorizationNotFoundFaultException extends js.Object {

  }

  /**
   * Contains Availability Zone information.
   *  This data type is used as an element in the following data type:
   * * <a>OrderableDBInstanceOption</a>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZone {
    def apply(
      Name: js.UndefOr[String] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
   * <i>CertificateIdentifier</i> does not refer to an existing certificate.
   */
  @js.native
  trait CertificateNotFoundFaultException extends js.Object {

  }

  /**
   * This data type is used as a response element in the action <a>DescribeDBEngineVersions</a>.
   */
  @js.native
  trait CharacterSet extends js.Object {
    var CharacterSetDescription: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
  }

  object CharacterSet {
    def apply(
      CharacterSetDescription: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined): CharacterSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CharacterSetDescription" -> CharacterSetDescription.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CharacterSet]
    }
  }

  /**
   * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance or DB cluster.
   */
  @js.native
  trait CloudwatchLogsExportConfiguration extends js.Object {
    var DisableLogTypes: js.UndefOr[LogTypeList]
    var EnableLogTypes: js.UndefOr[LogTypeList]
  }

  object CloudwatchLogsExportConfiguration {
    def apply(
      DisableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
      EnableLogTypes: js.UndefOr[LogTypeList] = js.undefined): CloudwatchLogsExportConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisableLogTypes" -> DisableLogTypes.map { x => x.asInstanceOf[js.Any] },
        "EnableLogTypes" -> EnableLogTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudwatchLogsExportConfiguration]
    }
  }

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
      Tags: js.UndefOr[TagList] = js.undefined): CopyDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBClusterParameterGroupIdentifier" -> SourceDBClusterParameterGroupIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterParameterGroupDescription" -> TargetDBClusterParameterGroupDescription.asInstanceOf[js.Any],
        "TargetDBClusterParameterGroupIdentifier" -> TargetDBClusterParameterGroupIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CopyDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup]
  }

  object CopyDBClusterParameterGroupResult {
    def apply(
      DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined): CopyDBClusterParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroup" -> DBClusterParameterGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBClusterParameterGroupResult]
    }
  }

  /**
   * <p/>
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
      Tags: js.UndefOr[TagList] = js.undefined): CopyDBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBClusterSnapshotIdentifier" -> SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterSnapshotIdentifier" -> TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "CopyTags" -> CopyTags.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "PreSignedUrl" -> PreSignedUrl.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait CopyDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object CopyDBClusterSnapshotResult {
    def apply(
      DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined): CopyDBClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshot" -> DBClusterSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBClusterSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CopyDBParameterGroupMessage extends js.Object {
    var SourceDBParameterGroupIdentifier: String
    var TargetDBParameterGroupDescription: String
    var TargetDBParameterGroupIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBParameterGroupMessage {
    def apply(
      SourceDBParameterGroupIdentifier: String,
      TargetDBParameterGroupDescription: String,
      TargetDBParameterGroupIdentifier: String,
      Tags: js.UndefOr[TagList] = js.undefined): CopyDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBParameterGroupIdentifier" -> SourceDBParameterGroupIdentifier.asInstanceOf[js.Any],
        "TargetDBParameterGroupDescription" -> TargetDBParameterGroupDescription.asInstanceOf[js.Any],
        "TargetDBParameterGroupIdentifier" -> TargetDBParameterGroupIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBParameterGroupMessage]
    }
  }

  @js.native
  trait CopyDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup]
  }

  object CopyDBParameterGroupResult {
    def apply(
      DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined): CopyDBParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroup" -> DBParameterGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBParameterGroupResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var Engine: String
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CharacterSetName: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreSignedUrl: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationSourceIdentifier: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object CreateDBClusterMessage {
    def apply(
      DBClusterIdentifier: String,
      Engine: String,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      PreSignedUrl: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): CreateDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine" -> Engine.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PreSignedUrl" -> PreSignedUrl.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSourceIdentifier" -> ReplicationSourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterMessage]
    }
  }

  /**
   * <p/>
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
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CreateDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup]
  }

  object CreateDBClusterParameterGroupResult {
    def apply(
      DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined): CreateDBClusterParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroup" -> DBClusterParameterGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterParameterGroupResult]
    }
  }

  @js.native
  trait CreateDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object CreateDBClusterResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): CreateDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterResult]
    }
  }

  /**
   * <p/>
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
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait CreateDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object CreateDBClusterSnapshotResult {
    def apply(
      DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined): CreateDBClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshot" -> DBClusterSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateDBInstanceMessage extends js.Object {
    var DBInstanceClass: String
    var DBInstanceIdentifier: String
    var Engine: String
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CharacterSetName: js.UndefOr[String]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList]
    var DBSubnetGroupName: js.UndefOr[String]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var KmsKeyId: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var MonitoringRoleArn: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TdeCredentialArn: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var Timezone: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object CreateDBInstanceMessage {
    def apply(
      DBInstanceClass: String,
      DBInstanceIdentifier: String,
      Engine: String,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[String] = js.undefined,
      DomainIAMRoleName: js.UndefOr[String] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
      MonitoringRoleArn: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      Timezone: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): CreateDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.asInstanceOf[js.Any],
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "Engine" -> Engine.asInstanceOf[js.Any],
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroups" -> DBSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "MonitoringInterval" -> MonitoringInterval.map { x => x.asInstanceOf[js.Any] },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "PromotionTier" -> PromotionTier.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceMessage]
    }
  }

  @js.native
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object CreateDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): CreateDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateDBParameterGroupMessage extends js.Object {
    var DBParameterGroupFamily: String
    var DBParameterGroupName: String
    var Description: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBParameterGroupMessage {
    def apply(
      DBParameterGroupFamily: String,
      DBParameterGroupName: String,
      Description: String,
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBParameterGroupMessage]
    }
  }

  @js.native
  trait CreateDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup]
  }

  object CreateDBParameterGroupResult {
    def apply(
      DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined): CreateDBParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroup" -> DBParameterGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBParameterGroupResult]
    }
  }

  /**
   * <p/>
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
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.asInstanceOf[js.Any],
        "DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  object CreateDBSubnetGroupResult {
    def apply(
      DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined): CreateDBSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroup" -> DBSubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSubnetGroupResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateEventSubscriptionMessage extends js.Object {
    var SnsTopicArn: String
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEventSubscriptionMessage {
    def apply(
      SnsTopicArn: String,
      SubscriptionName: String,
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnsTopicArn" -> SnsTopicArn.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any],
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "SourceIds" -> SourceIds.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  @js.native
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object CreateEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): CreateEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionResult]
    }
  }

  /**
   * Contains the details of an Amazon Neptune DB cluster.
   *  This data type is used as a response element in the <a>DescribeDBClusters</a> action.
   */
  @js.native
  trait DBCluster extends js.Object {
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AssociatedRoles: js.UndefOr[DBClusterRoles]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CharacterSetName: js.UndefOr[String]
    var CloneGroupId: js.UndefOr[String]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var DBClusterArn: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterMembers: js.UndefOr[DBClusterMemberList]
    var DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships]
    var DBClusterParameterGroup: js.UndefOr[String]
    var DBSubnetGroup: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DbClusterResourceId: js.UndefOr[String]
    var EarliestRestorableTime: js.UndefOr[TStamp]
    var Endpoint: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var LatestRestorableTime: js.UndefOr[TStamp]
    var MasterUsername: js.UndefOr[String]
    var MultiAZ: js.UndefOr[Boolean]
    var PercentProgress: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList]
    var ReaderEndpoint: js.UndefOr[String]
    var ReplicationSourceIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[Boolean]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  object DBCluster {
    def apply(
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      CloneGroupId: js.UndefOr[String] = js.undefined,
      ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      DBClusterArn: js.UndefOr[String] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.undefined,
      DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships] = js.undefined,
      DBClusterParameterGroup: js.UndefOr[String] = js.undefined,
      DBSubnetGroup: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      DbClusterResourceId: js.UndefOr[String] = js.undefined,
      EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined,
      Endpoint: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      HostedZoneId: js.UndefOr[String] = js.undefined,
      IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      LatestRestorableTime: js.UndefOr[TStamp] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      PercentProgress: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList] = js.undefined,
      ReaderEndpoint: js.UndefOr[String] = js.undefined,
      ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
      VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined): DBCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "AssociatedRoles" -> AssociatedRoles.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "CloneGroupId" -> CloneGroupId.map { x => x.asInstanceOf[js.Any] },
        "ClusterCreateTime" -> ClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "DBClusterArn" -> DBClusterArn.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterMembers" -> DBClusterMembers.map { x => x.asInstanceOf[js.Any] },
        "DBClusterOptionGroupMemberships" -> DBClusterOptionGroupMemberships.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroup" -> DBClusterParameterGroup.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroup" -> DBSubnetGroup.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "DbClusterResourceId" -> DbClusterResourceId.map { x => x.asInstanceOf[js.Any] },
        "EarliestRestorableTime" -> EarliestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "LatestRestorableTime" -> LatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "PercentProgress" -> PercentProgress.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaIdentifiers" -> ReadReplicaIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "ReaderEndpoint" -> ReaderEndpoint.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSourceIdentifier" -> ReplicationSourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBCluster]
    }
  }

  /**
   * User already has a DB cluster with the given identifier.
   */
  @js.native
  trait DBClusterAlreadyExistsFaultException extends js.Object {

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
      PromotionTier: js.UndefOr[IntegerOptional] = js.undefined): DBClusterMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupStatus" -> DBClusterParameterGroupStatus.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "IsClusterWriter" -> IsClusterWriter.map { x => x.asInstanceOf[js.Any] },
        "PromotionTier" -> PromotionTier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterMember]
    }
  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeDBClusters</a> action.
   */
  @js.native
  trait DBClusterMessage extends js.Object {
    var DBClusters: js.UndefOr[DBClusterList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterMessage {
    def apply(
      DBClusters: js.UndefOr[DBClusterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusters" -> DBClusters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterMessage]
    }
  }

  /**
   * <i>DBClusterIdentifier</i> does not refer to an existing DB cluster.
   */
  @js.native
  trait DBClusterNotFoundFaultException extends js.Object {

  }

  /**
   * Contains status information for a DB cluster option group.
   */
  @js.native
  trait DBClusterOptionGroupStatus extends js.Object {
    var DBClusterOptionGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBClusterOptionGroupStatus {
    def apply(
      DBClusterOptionGroupName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): DBClusterOptionGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterOptionGroupName" -> DBClusterOptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterOptionGroupStatus]
    }
  }

  /**
   * Contains the details of an Amazon Neptune DB cluster parameter group.
   *  This data type is used as a response element in the <a>DescribeDBClusterParameterGroups</a> action.
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
      Description: js.UndefOr[String] = js.undefined): DBClusterParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupArn" -> DBClusterParameterGroupArn.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterParameterGroup]
    }
  }

  /**
   * Provides details about a DB cluster parameter group including the parameters in the DB cluster parameter group.
   */
  @js.native
  trait DBClusterParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object DBClusterParameterGroupDetails {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): DBClusterParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterParameterGroupDetails]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DBClusterParameterGroupNameMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
  }

  object DBClusterParameterGroupNameMessage {
    def apply(
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined): DBClusterParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterParameterGroupNameMessage]
    }
  }

  /**
   * <i>DBClusterParameterGroupName</i> does not refer to an existing DB Cluster parameter group.
   */
  @js.native
  trait DBClusterParameterGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p/>
   */
  @js.native
  trait DBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterParameterGroupsMessage {
    def apply(
      DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroups" -> DBClusterParameterGroups.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterParameterGroupsMessage]
    }
  }

  /**
   * User attempted to create a new DB cluster and the user has already reached the maximum allowed DB cluster quota.
   */
  @js.native
  trait DBClusterQuotaExceededFaultException extends js.Object {

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
      Status: js.UndefOr[String] = js.undefined): DBClusterRole = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterRole]
    }
  }

  /**
   * The specified IAM role Amazon Resource Name (ARN) is already associated with the specified DB cluster.
   */
  @js.native
  trait DBClusterRoleAlreadyExistsFaultException extends js.Object {

  }

  /**
   * The specified IAM role Amazon Resource Name (ARN) is not associated with the specified DB cluster.
   */
  @js.native
  trait DBClusterRoleNotFoundFaultException extends js.Object {

  }

  /**
   * You have exceeded the maximum number of IAM roles that can be associated with the specified DB cluster.
   */
  @js.native
  trait DBClusterRoleQuotaExceededFaultException extends js.Object {

  }

  /**
   * Contains the details for an Amazon Neptune DB cluster snapshot
   *  This data type is used as a response element in the <a>DescribeDBClusterSnapshots</a> action.
   */
  @js.native
  trait DBClusterSnapshot extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterSnapshotArn: js.UndefOr[String]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
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
      AllocatedStorage: js.UndefOr[Int] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterSnapshotArn: js.UndefOr[String] = js.undefined,
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      PercentProgress: js.UndefOr[Int] = js.undefined,
      Port: js.UndefOr[Int] = js.undefined,
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      SourceDBClusterSnapshotArn: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DBClusterSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "ClusterCreateTime" -> ClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshotArn" -> DBClusterSnapshotArn.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "PercentProgress" -> PercentProgress.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x => x.asInstanceOf[js.Any] },
        "SnapshotType" -> SnapshotType.map { x => x.asInstanceOf[js.Any] },
        "SourceDBClusterSnapshotArn" -> SourceDBClusterSnapshotArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshot]
    }
  }

  /**
   * User already has a DB cluster snapshot with the given identifier.
   */
  @js.native
  trait DBClusterSnapshotAlreadyExistsFaultException extends js.Object {

  }

  /**
   * Contains the name and values of a manual DB cluster snapshot attribute.
   *  Manual DB cluster snapshot attributes are used to authorize other AWS accounts to restore a manual DB cluster snapshot. For more information, see the <a>ModifyDBClusterSnapshotAttribute</a> API action.
   */
  @js.native
  trait DBClusterSnapshotAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  object DBClusterSnapshotAttribute {
    def apply(
      AttributeName: js.UndefOr[String] = js.undefined,
      AttributeValues: js.UndefOr[AttributeValueList] = js.undefined): DBClusterSnapshotAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeValues" -> AttributeValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshotAttribute]
    }
  }

  /**
   * Contains the results of a successful call to the <a>DescribeDBClusterSnapshotAttributes</a> API action.
   *  Manual DB cluster snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB cluster snapshot. For more information, see the <a>ModifyDBClusterSnapshotAttribute</a> API action.
   */
  @js.native
  trait DBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
  }

  object DBClusterSnapshotAttributesResult {
    def apply(
      DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined,
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined): DBClusterSnapshotAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotAttributes" -> DBClusterSnapshotAttributes.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshotAttributesResult]
    }
  }

  /**
   * Provides a list of DB cluster snapshots for the user as the result of a call to the <a>DescribeDBClusterSnapshots</a> action.
   */
  @js.native
  trait DBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterSnapshotMessage {
    def apply(
      DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshots" -> DBClusterSnapshots.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshotMessage]
    }
  }

  /**
   * <i>DBClusterSnapshotIdentifier</i> does not refer to an existing DB cluster snapshot.
   */
  @js.native
  trait DBClusterSnapshotNotFoundFaultException extends js.Object {

  }

  /**
   * This data type is used as a response element in the action <a>DescribeDBEngineVersions</a>.
   */
  @js.native
  trait DBEngineVersion extends js.Object {
    var DBEngineDescription: js.UndefOr[String]
    var DBEngineVersionDescription: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var DefaultCharacterSet: js.UndefOr[CharacterSet]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var ExportableLogTypes: js.UndefOr[LogTypeList]
    var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList]
    var SupportedTimezones: js.UndefOr[SupportedTimezonesList]
    var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean]
    var SupportsReadReplica: js.UndefOr[Boolean]
    var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList]
  }

  object DBEngineVersion {
    def apply(
      DBEngineDescription: js.UndefOr[String] = js.undefined,
      DBEngineVersionDescription: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      DefaultCharacterSet: js.UndefOr[CharacterSet] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
      SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined,
      SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.undefined,
      SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined,
      SupportsReadReplica: js.UndefOr[Boolean] = js.undefined,
      ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined): DBEngineVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBEngineDescription" -> DBEngineDescription.map { x => x.asInstanceOf[js.Any] },
        "DBEngineVersionDescription" -> DBEngineVersionDescription.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "DefaultCharacterSet" -> DefaultCharacterSet.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ExportableLogTypes" -> ExportableLogTypes.map { x => x.asInstanceOf[js.Any] },
        "SupportedCharacterSets" -> SupportedCharacterSets.map { x => x.asInstanceOf[js.Any] },
        "SupportedTimezones" -> SupportedTimezones.map { x => x.asInstanceOf[js.Any] },
        "SupportsLogExportsToCloudwatchLogs" -> SupportsLogExportsToCloudwatchLogs.map { x => x.asInstanceOf[js.Any] },
        "SupportsReadReplica" -> SupportsReadReplica.map { x => x.asInstanceOf[js.Any] },
        "ValidUpgradeTarget" -> ValidUpgradeTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBEngineVersion]
    }
  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeDBEngineVersions</a> action.
   */
  @js.native
  trait DBEngineVersionMessage extends js.Object {
    var DBEngineVersions: js.UndefOr[DBEngineVersionList]
    var Marker: js.UndefOr[String]
  }

  object DBEngineVersionMessage {
    def apply(
      DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBEngineVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBEngineVersions" -> DBEngineVersions.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBEngineVersionMessage]
    }
  }

  /**
   * Contains the details of an Amazon Neptune DB instance.
   *  This data type is used as a response element in the <a>DescribeDBInstances</a> action.
   */
  @js.native
  trait DBInstance extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[Int]
    var CACertificateIdentifier: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
    var CopyTagsToSnapshot: js.UndefOr[Boolean]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBInstanceArn: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var DBInstanceStatus: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var DBParameterGroups: js.UndefOr[DBParameterGroupStatusList]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList]
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
    var DbInstancePort: js.UndefOr[Int]
    var DbiResourceId: js.UndefOr[String]
    var DomainMemberships: js.UndefOr[DomainMembershipList]
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var Endpoint: js.UndefOr[Endpoint]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var EnhancedMonitoringResourceArn: js.UndefOr[String]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var Iops: js.UndefOr[IntegerOptional]
    var KmsKeyId: js.UndefOr[String]
    var LatestRestorableTime: js.UndefOr[TStamp]
    var LicenseModel: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var MonitoringRoleArn: js.UndefOr[String]
    var MultiAZ: js.UndefOr[Boolean]
    var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList]
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues]
    var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList]
    var ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList]
    var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String]
    var SecondaryAvailabilityZone: js.UndefOr[String]
    var StatusInfos: js.UndefOr[DBInstanceStatusInfoList]
    var StorageEncrypted: js.UndefOr[Boolean]
    var StorageType: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var Timezone: js.UndefOr[String]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  object DBInstance {
    def apply(
      AllocatedStorage: js.UndefOr[Int] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[Int] = js.undefined,
      CACertificateIdentifier: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBInstanceArn: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      DBInstanceStatus: js.UndefOr[String] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined,
      DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined,
      DbInstancePort: js.UndefOr[Int] = js.undefined,
      DbiResourceId: js.UndefOr[String] = js.undefined,
      DomainMemberships: js.UndefOr[DomainMembershipList] = js.undefined,
      EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      EnhancedMonitoringResourceArn: js.UndefOr[String] = js.undefined,
      IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
      InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      LatestRestorableTime: js.UndefOr[TStamp] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
      MonitoringRoleArn: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.undefined,
      PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
      PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
      ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList] = js.undefined,
      ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.undefined,
      ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined,
      StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined,
      StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      Timezone: js.UndefOr[String] = js.undefined,
      VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined): DBInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceArn" -> DBInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceStatus" -> DBInstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroups" -> DBParameterGroups.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroups" -> DBSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroup" -> DBSubnetGroup.map { x => x.asInstanceOf[js.Any] },
        "DbInstancePort" -> DbInstancePort.map { x => x.asInstanceOf[js.Any] },
        "DbiResourceId" -> DbiResourceId.map { x => x.asInstanceOf[js.Any] },
        "DomainMemberships" -> DomainMemberships.map { x => x.asInstanceOf[js.Any] },
        "EnabledCloudwatchLogsExports" -> EnabledCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "EnhancedMonitoringResourceArn" -> EnhancedMonitoringResourceArn.map { x => x.asInstanceOf[js.Any] },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x => x.asInstanceOf[js.Any] },
        "InstanceCreateTime" -> InstanceCreateTime.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "LatestRestorableTime" -> LatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "MonitoringInterval" -> MonitoringInterval.map { x => x.asInstanceOf[js.Any] },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupMemberships" -> OptionGroupMemberships.map { x => x.asInstanceOf[js.Any] },
        "PendingModifiedValues" -> PendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsEnabled" -> PerformanceInsightsEnabled.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "PromotionTier" -> PromotionTier.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaDBClusterIdentifiers" -> ReadReplicaDBClusterIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaDBInstanceIdentifiers" -> ReadReplicaDBInstanceIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaSourceDBInstanceIdentifier" -> ReadReplicaSourceDBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SecondaryAvailabilityZone" -> SecondaryAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "StatusInfos" -> StatusInfos.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstance]
    }
  }

  /**
   * User already has a DB instance with the given identifier.
   */
  @js.native
  trait DBInstanceAlreadyExistsFaultException extends js.Object {

  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeDBInstances</a> action.
   */
  @js.native
  trait DBInstanceMessage extends js.Object {
    var DBInstances: js.UndefOr[DBInstanceList]
    var Marker: js.UndefOr[String]
  }

  object DBInstanceMessage {
    def apply(
      DBInstances: js.UndefOr[DBInstanceList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstances" -> DBInstances.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceMessage]
    }
  }

  /**
   * <i>DBInstanceIdentifier</i> does not refer to an existing DB instance.
   */
  @js.native
  trait DBInstanceNotFoundFaultException extends js.Object {

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
      StatusType: js.UndefOr[String] = js.undefined): DBInstanceStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "Normal" -> Normal.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusType" -> StatusType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceStatusInfo]
    }
  }

  /**
   * Contains the details of an Amazon Neptune DB parameter group.
   *  This data type is used as a response element in the <a>DescribeDBParameterGroups</a> action.
   */
  @js.native
  trait DBParameterGroup extends js.Object {
    var DBParameterGroupArn: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object DBParameterGroup {
    def apply(
      DBParameterGroupArn: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): DBParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupArn" -> DBParameterGroupArn.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroup]
    }
  }

  /**
   * A DB parameter group with the same name exists.
   */
  @js.native
  trait DBParameterGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeDBParameters</a> action.
   */
  @js.native
  trait DBParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object DBParameterGroupDetails {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): DBParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupDetails]
    }
  }

  /**
   * Contains the result of a successful invocation of the <a>ModifyDBParameterGroup</a> or <a>ResetDBParameterGroup</a> action.
   */
  @js.native
  trait DBParameterGroupNameMessage extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
  }

  object DBParameterGroupNameMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined): DBParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupNameMessage]
    }
  }

  /**
   * <i>DBParameterGroupName</i> does not refer to an existing DB parameter group.
   */
  @js.native
  trait DBParameterGroupNotFoundFaultException extends js.Object {

  }

  /**
   * Request would result in user exceeding the allowed number of DB parameter groups.
   */
  @js.native
  trait DBParameterGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * The status of the DB parameter group.
   *  This data type is used as a response element in the following actions:
   * * <a>CreateDBInstance</a>
   *  * <a>DeleteDBInstance</a>
   *  * <a>ModifyDBInstance</a>
   *  * <a>RebootDBInstance</a>
   */
  @js.native
  trait DBParameterGroupStatus extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
  }

  object DBParameterGroupStatus {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterApplyStatus: js.UndefOr[String] = js.undefined): DBParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupStatus]
    }
  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeDBParameterGroups</a> action.
   */
  @js.native
  trait DBParameterGroupsMessage extends js.Object {
    var DBParameterGroups: js.UndefOr[DBParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  object DBParameterGroupsMessage {
    def apply(
      DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroups" -> DBParameterGroups.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupsMessage]
    }
  }

  /**
   * This data type is used as a response element in the following actions:
   * * <a>ModifyDBInstance</a>
   *  * <a>RebootDBInstance</a>
   */
  @js.native
  trait DBSecurityGroupMembership extends js.Object {
    var DBSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBSecurityGroupMembership {
    def apply(
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): DBSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroupMembership]
    }
  }

  /**
   * <i>DBSecurityGroupName</i> does not refer to an existing DB security group.
   */
  @js.native
  trait DBSecurityGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <i>DBSnapshotIdentifier</i> is already used by an existing snapshot.
   */
  @js.native
  trait DBSnapshotAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot.
   */
  @js.native
  trait DBSnapshotNotFoundFaultException extends js.Object {

  }

  /**
   * Contains the details of an Amazon Neptune DB subnet group.
   *  This data type is used as a response element in the <a>DescribeDBSubnetGroups</a> action.
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
      VpcId: js.UndefOr[String] = js.undefined): DBSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupArn" -> DBSubnetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "SubnetGroupStatus" -> SubnetGroupStatus.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSubnetGroup]
    }
  }

  /**
   * <i>DBSubnetGroupName</i> is already used by an existing DB subnet group.
   */
  @js.native
  trait DBSubnetGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one Availability Zone.
   */
  @js.native
  trait DBSubnetGroupDoesNotCoverEnoughAZsException extends js.Object {

  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeDBSubnetGroups</a> action.
   */
  @js.native
  trait DBSubnetGroupMessage extends js.Object {
    var DBSubnetGroups: js.UndefOr[DBSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  object DBSubnetGroupMessage {
    def apply(
      DBSubnetGroups: js.UndefOr[DBSubnetGroups] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroups" -> DBSubnetGroups.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSubnetGroupMessage]
    }
  }

  /**
   * <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
   */
  @js.native
  trait DBSubnetGroupNotFoundFaultException extends js.Object {

  }

  /**
   * Request would result in user exceeding the allowed number of DB subnet groups.
   */
  @js.native
  trait DBSubnetGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * Request would result in user exceeding the allowed number of subnets in a DB subnet groups.
   */
  @js.native
  trait DBSubnetQuotaExceededFaultException extends js.Object {

  }

  /**
   * The DB upgrade failed because a resource the DB depends on could not be modified.
   */
  @js.native
  trait DBUpgradeDependencyFailureFaultException extends js.Object {

  }

  /**
   * <p/>
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
      SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined): DeleteDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "FinalDBSnapshotIdentifier" -> FinalDBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SkipFinalSnapshot" -> SkipFinalSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
  }

  object DeleteDBClusterParameterGroupMessage {
    def apply(
      DBClusterParameterGroupName: String): DeleteDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait DeleteDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object DeleteDBClusterResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): DeleteDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshotIdentifier: String
  }

  object DeleteDBClusterSnapshotMessage {
    def apply(
      DBClusterSnapshotIdentifier: String): DeleteDBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait DeleteDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object DeleteDBClusterSnapshotResult {
    def apply(
      DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined): DeleteDBClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshot" -> DBClusterSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
  }

  object DeleteDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: String,
      FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined): DeleteDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "FinalDBSnapshotIdentifier" -> FinalDBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SkipFinalSnapshot" -> SkipFinalSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceMessage]
    }
  }

  @js.native
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object DeleteDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): DeleteDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
  }

  object DeleteDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: String): DeleteDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBParameterGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
  }

  object DeleteDBSubnetGroupMessage {
    def apply(
      DBSubnetGroupName: String): DeleteDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSubnetGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  object DeleteEventSubscriptionMessage {
    def apply(
      SubscriptionName: String): DeleteEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  @js.native
  trait DeleteEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object DeleteEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): DeleteEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionResult]
    }
  }

  /**
   * <p/>
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterParameterGroupsMessage]
    }
  }

  /**
   * <p/>
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
      Source: js.UndefOr[String] = js.undefined): DescribeDBClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterParametersMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBClusterSnapshotAttributesMessage extends js.Object {
    var DBClusterSnapshotIdentifier: String
  }

  object DescribeDBClusterSnapshotAttributesMessage {
    def apply(
      DBClusterSnapshotIdentifier: String): DescribeDBClusterSnapshotAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterSnapshotAttributesMessage]
    }
  }

  @js.native
  trait DescribeDBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult]
  }

  object DescribeDBClusterSnapshotAttributesResult {
    def apply(
      DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined): DescribeDBClusterSnapshotAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotAttributesResult" -> DBClusterSnapshotAttributesResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterSnapshotAttributesResult]
    }
  }

  /**
   * <p/>
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
      SnapshotType: js.UndefOr[String] = js.undefined): DescribeDBClusterSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "IncludePublic" -> IncludePublic.map { x => x.asInstanceOf[js.Any] },
        "IncludeShared" -> IncludeShared.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "SnapshotType" -> SnapshotType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterSnapshotsMessage]
    }
  }

  /**
   * <p/>
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClustersMessage]
    }
  }

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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBEngineVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "DefaultOnly" -> DefaultOnly.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ListSupportedCharacterSets" -> ListSupportedCharacterSets.map { x => x.asInstanceOf[js.Any] },
        "ListSupportedTimezones" -> ListSupportedTimezones.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBEngineVersionsMessage]
    }
  }

  /**
   * <p/>
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBInstancesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBParameterGroupsMessage extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBParameterGroupsMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBParameterGroupsMessage]
    }
  }

  @js.native
  trait DescribeDBParametersMessage extends js.Object {
    var DBParameterGroupName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  object DescribeDBParametersMessage {
    def apply(
      DBParameterGroupName: String,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Source: js.UndefOr[String] = js.undefined): DescribeDBParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBParametersMessage]
    }
  }

  /**
   * <p/>
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSubnetGroupsMessage]
    }
  }

  /**
   * <p/>
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeEngineDefaultClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultClusterParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultClusterParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  object DescribeEngineDefaultClusterParametersResult {
    def apply(
      EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined): DescribeEngineDefaultClusterParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineDefaults" -> EngineDefaults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultClusterParametersResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    var DBParameterGroupFamily: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEngineDefaultParametersMessage {
    def apply(
      DBParameterGroupFamily: String,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeEngineDefaultParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  object DescribeEngineDefaultParametersResult {
    def apply(
      EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined): DescribeEngineDefaultParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineDefaults" -> EngineDefaults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SourceType: js.UndefOr[String]
  }

  object DescribeEventCategoriesMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined): DescribeEventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined): DescribeEventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

  /**
   * <p/>
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
      StartTime: js.UndefOr[TStamp] = js.undefined): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
   * <p/>
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
      Vpc: js.UndefOr[BooleanOptional] = js.undefined): DescribeOrderableDBInstanceOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Engine" -> Engine.asInstanceOf[js.Any],
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Vpc" -> Vpc.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
    }
  }

  /**
   * <p/>
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
      ResourceIdentifier: js.UndefOr[String] = js.undefined): DescribePendingMaintenanceActionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ResourceIdentifier" -> ResourceIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePendingMaintenanceActionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeValidDBInstanceModificationsMessage extends js.Object {
    var DBInstanceIdentifier: String
  }

  object DescribeValidDBInstanceModificationsMessage {
    def apply(
      DBInstanceIdentifier: String): DescribeValidDBInstanceModificationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeValidDBInstanceModificationsMessage]
    }
  }

  @js.native
  trait DescribeValidDBInstanceModificationsResult extends js.Object {
    var ValidDBInstanceModificationsMessage: js.UndefOr[ValidDBInstanceModificationsMessage]
  }

  object DescribeValidDBInstanceModificationsResult {
    def apply(
      ValidDBInstanceModificationsMessage: js.UndefOr[ValidDBInstanceModificationsMessage] = js.undefined): DescribeValidDBInstanceModificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidDBInstanceModificationsMessage" -> ValidDBInstanceModificationsMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeValidDBInstanceModificationsResult]
    }
  }

  /**
   * An Active Directory Domain membership record associated with the DB instance.
   */
  @js.native
  trait DomainMembership extends js.Object {
    var Domain: js.UndefOr[String]
    var FQDN: js.UndefOr[String]
    var IAMRoleName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DomainMembership {
    def apply(
      Domain: js.UndefOr[String] = js.undefined,
      FQDN: js.UndefOr[String] = js.undefined,
      IAMRoleName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): DomainMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "FQDN" -> FQDN.map { x => x.asInstanceOf[js.Any] },
        "IAMRoleName" -> IAMRoleName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainMembership]
    }
  }

  /**
   * <i>Domain</i> does not refer to an existing Active Directory Domain.
   */
  @js.native
  trait DomainNotFoundFaultException extends js.Object {

  }

  /**
   * A range of double values.
   */
  @js.native
  trait DoubleRange extends js.Object {
    var From: js.UndefOr[Double]
    var To: js.UndefOr[Double]
  }

  object DoubleRange {
    def apply(
      From: js.UndefOr[Double] = js.undefined,
      To: js.UndefOr[Double] = js.undefined): DoubleRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "From" -> From.map { x => x.asInstanceOf[js.Any] },
        "To" -> To.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DoubleRange]
    }
  }

  /**
   * This data type is used as a response element in the following actions:
   * * <a>CreateDBInstance</a>
   *  * <a>DescribeDBInstances</a>
   *  * <a>DeleteDBInstance</a>
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
      Port: js.UndefOr[Int] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeEngineDefaultParameters</a> action.
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
      Parameters: js.UndefOr[ParametersList] = js.undefined): EngineDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EngineDefaults]
    }
  }

  /**
   * This data type is used as a response element in the <a>DescribeEvents</a> action.
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
      SourceType: js.UndefOr[SourceType] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * Contains the results of a successful invocation of the <a>DescribeEventCategories</a> action.
   */
  @js.native
  trait EventCategoriesMap extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  object EventCategoriesMap {
    def apply(
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined): EventCategoriesMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMap]
    }
  }

  /**
   * Data returned from the <b>DescribeEventCategories</b> action.
   */
  @js.native
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList]
  }

  object EventCategoriesMessage {
    def apply(
      EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined): EventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventCategoriesMapList" -> EventCategoriesMapList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMessage]
    }
  }

  /**
   * Contains the results of a successful invocation of the <a>DescribeEventSubscriptions</a> action.
   */
  @js.native
  trait EventSubscription extends js.Object {
    var CustSubscriptionId: js.UndefOr[String]
    var CustomerAwsId: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var EventCategoriesList: js.UndefOr[EventCategoriesList]
    var EventSubscriptionArn: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var SourceIdsList: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var SubscriptionCreationTime: js.UndefOr[String]
  }

  object EventSubscription {
    def apply(
      CustSubscriptionId: js.UndefOr[String] = js.undefined,
      CustomerAwsId: js.UndefOr[String] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined,
      EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
      EventSubscriptionArn: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      SubscriptionCreationTime: js.UndefOr[String] = js.undefined): EventSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustSubscriptionId" -> CustSubscriptionId.map { x => x.asInstanceOf[js.Any] },
        "CustomerAwsId" -> CustomerAwsId.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "EventCategoriesList" -> EventCategoriesList.map { x => x.asInstanceOf[js.Any] },
        "EventSubscriptionArn" -> EventSubscriptionArn.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "SourceIdsList" -> SourceIdsList.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionCreationTime" -> SubscriptionCreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
    }
  }

  @js.native
  trait EventSubscriptionQuotaExceededFaultException extends js.Object {

  }

  /**
   * Data returned by the <b>DescribeEventSubscriptions</b> action.
   */
  @js.native
  trait EventSubscriptionsMessage extends js.Object {
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
    var Marker: js.UndefOr[String]
  }

  object EventSubscriptionsMessage {
    def apply(
      EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): EventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscriptionsList" -> EventSubscriptionsList.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscriptionsMessage]
    }
  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeEvents</a> action.
   */
  @js.native
  trait EventsMessage extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  object EventsMessage {
    def apply(
      Events: js.UndefOr[EventList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): EventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait FailoverDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var TargetDBInstanceIdentifier: js.UndefOr[String]
  }

  object FailoverDBClusterMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined): FailoverDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetDBInstanceIdentifier" -> TargetDBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailoverDBClusterMessage]
    }
  }

  @js.native
  trait FailoverDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object FailoverDBClusterResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): FailoverDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailoverDBClusterResult]
    }
  }

  /**
   * This type is not currently supported.
   */
  @js.native
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  object Filter {
    def apply(
      Name: String,
      Values: FilterValueList): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
   * Request would result in user exceeding the allowed number of DB instances.
   */
  @js.native
  trait InstanceQuotaExceededFaultException extends js.Object {

  }

  /**
   * The DB cluster does not have enough capacity for the current operation.
   */
  @js.native
  trait InsufficientDBClusterCapacityFaultException extends js.Object {

  }

  /**
   * Specified DB instance class is not available in the specified Availability Zone.
   */
  @js.native
  trait InsufficientDBInstanceCapacityFaultException extends js.Object {

  }

  /**
   * There is insufficient storage available for the current action. You may be able to resolve this error by updating your subnet group to use different Availability Zones that have more storage available.
   */
  @js.native
  trait InsufficientStorageClusterCapacityFaultException extends js.Object {

  }

  /**
   * The supplied value is not a valid DB cluster snapshot state.
   */
  @js.native
  trait InvalidDBClusterSnapshotStateFaultException extends js.Object {

  }

  /**
   * The DB cluster is not in a valid state.
   */
  @js.native
  trait InvalidDBClusterStateFaultException extends js.Object {

  }

  /**
   * The specified DB instance is not in the <i>available</i> state.
   */
  @js.native
  trait InvalidDBInstanceStateFaultException extends js.Object {

  }

  /**
   * The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter group, you cannot delete it when the parameter group is in this state.
   */
  @js.native
  trait InvalidDBParameterGroupStateFaultException extends js.Object {

  }

  /**
   * The state of the DB security group does not allow deletion.
   */
  @js.native
  trait InvalidDBSecurityGroupStateFaultException extends js.Object {

  }

  /**
   * The state of the DB snapshot does not allow deletion.
   */
  @js.native
  trait InvalidDBSnapshotStateFaultException extends js.Object {

  }

  /**
   * The DB subnet group cannot be deleted because it is in use.
   */
  @js.native
  trait InvalidDBSubnetGroupStateFaultException extends js.Object {

  }

  /**
   * The DB subnet is not in the <i>available</i> state.
   */
  @js.native
  trait InvalidDBSubnetStateFaultException extends js.Object {

  }

  @js.native
  trait InvalidEventSubscriptionStateFaultException extends js.Object {

  }

  /**
   * Cannot restore from vpc backup to non-vpc DB instance.
   */
  @js.native
  trait InvalidRestoreFaultException extends js.Object {

  }

  /**
   * The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
   */
  @js.native
  trait InvalidSubnetException extends js.Object {

  }

  /**
   * DB subnet group does not cover all Availability Zones after it is created because users' change.
   */
  @js.native
  trait InvalidVPCNetworkStateFaultException extends js.Object {

  }

  /**
   * Error accessing KMS key.
   */
  @js.native
  trait KMSKeyNotAccessibleFaultException extends js.Object {

  }

  /**
   * <p/>
   */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
    var Filters: js.UndefOr[FilterList]
  }

  object ListTagsForResourceMessage {
    def apply(
      ResourceName: String,
      Filters: js.UndefOr[FilterList] = js.undefined): ListTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var NewDBClusterIdentifier: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
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
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      NewDBClusterIdentifier: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): ModifyDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "NewDBClusterIdentifier" -> NewDBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Parameters: ParametersList
  }

  object ModifyDBClusterParameterGroupMessage {
    def apply(
      DBClusterParameterGroupName: String,
      Parameters: ParametersList): ModifyDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ModifyDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object ModifyDBClusterResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): ModifyDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterResult]
    }
  }

  /**
   * <p/>
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
      ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined): ModifyDBClusterSnapshotAttributeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "ValuesToAdd" -> ValuesToAdd.map { x => x.asInstanceOf[js.Any] },
        "ValuesToRemove" -> ValuesToRemove.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterSnapshotAttributeMessage]
    }
  }

  @js.native
  trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult]
  }

  object ModifyDBClusterSnapshotAttributeResult {
    def apply(
      DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined): ModifyDBClusterSnapshotAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotAttributesResult" -> DBClusterSnapshotAttributesResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean]
    var ApplyImmediately: js.UndefOr[Boolean]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CACertificateIdentifier: js.UndefOr[String]
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBInstanceClass: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var DBPortNumber: js.UndefOr[IntegerOptional]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList]
    var DBSubnetGroupName: js.UndefOr[String]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var LicenseModel: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var MonitoringRoleArn: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var NewDBInstanceIdentifier: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var StorageType: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object ModifyDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: String,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      CACertificateIdentifier: js.UndefOr[String] = js.undefined,
      CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      DBPortNumber: js.UndefOr[IntegerOptional] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[String] = js.undefined,
      DomainIAMRoleName: js.UndefOr[String] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
      MonitoringRoleArn: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      NewDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): ModifyDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "AllowMajorVersionUpgrade" -> AllowMajorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CloudwatchLogsExportConfiguration" -> CloudwatchLogsExportConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBPortNumber" -> DBPortNumber.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroups" -> DBSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "MonitoringInterval" -> MonitoringInterval.map { x => x.asInstanceOf[js.Any] },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "NewDBInstanceIdentifier" -> NewDBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "PromotionTier" -> PromotionTier.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBInstanceMessage]
    }
  }

  @js.native
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object ModifyDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): ModifyDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBInstanceResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var Parameters: ParametersList
  }

  object ModifyDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: String,
      Parameters: ParametersList): ModifyDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBParameterGroupMessage]
    }
  }

  /**
   * <p/>
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
      DBSubnetGroupDescription: js.UndefOr[String] = js.undefined): ModifyDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any],
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  object ModifyDBSubnetGroupResult {
    def apply(
      DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined): ModifyDBSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroup" -> DBSubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSubnetGroupResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SnsTopicArn: js.UndefOr[String]
    var SourceType: js.UndefOr[String]
  }

  object ModifyEventSubscriptionMessage {
    def apply(
      SubscriptionName: String,
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined): ModifyEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any],
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  @js.native
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object ModifyEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): ModifyEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionResult]
    }
  }

  /**
   * Provides information on the option groups the DB instance is a member of.
   */
  @js.native
  trait OptionGroupMembership extends js.Object {
    var OptionGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object OptionGroupMembership {
    def apply(
      OptionGroupName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): OptionGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupMembership]
    }
  }

  @js.native
  trait OptionGroupNotFoundFaultException extends js.Object {

  }

  /**
   * Contains a list of available options for a DB instance.
   *  This data type is used as a response element in the <a>DescribeOrderableDBInstanceOptions</a> action.
   */
  @js.native
  trait OrderableDBInstanceOption extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var DBInstanceClass: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional]
    var MaxIopsPerGib: js.UndefOr[DoubleOptional]
    var MaxStorageSize: js.UndefOr[IntegerOptional]
    var MinIopsPerDbInstance: js.UndefOr[IntegerOptional]
    var MinIopsPerGib: js.UndefOr[DoubleOptional]
    var MinStorageSize: js.UndefOr[IntegerOptional]
    var MultiAZCapable: js.UndefOr[Boolean]
    var ReadReplicaCapable: js.UndefOr[Boolean]
    var StorageType: js.UndefOr[String]
    var SupportsEnhancedMonitoring: js.UndefOr[Boolean]
    var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean]
    var SupportsIops: js.UndefOr[Boolean]
    var SupportsPerformanceInsights: js.UndefOr[Boolean]
    var SupportsStorageEncryption: js.UndefOr[Boolean]
    var Vpc: js.UndefOr[Boolean]
  }

  object OrderableDBInstanceOption {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined,
      MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined,
      MaxStorageSize: js.UndefOr[IntegerOptional] = js.undefined,
      MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined,
      MinIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined,
      MinStorageSize: js.UndefOr[IntegerOptional] = js.undefined,
      MultiAZCapable: js.UndefOr[Boolean] = js.undefined,
      ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined,
      SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined,
      SupportsIops: js.UndefOr[Boolean] = js.undefined,
      SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined,
      SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined,
      Vpc: js.UndefOr[Boolean] = js.undefined): OrderableDBInstanceOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "MaxIopsPerDbInstance" -> MaxIopsPerDbInstance.map { x => x.asInstanceOf[js.Any] },
        "MaxIopsPerGib" -> MaxIopsPerGib.map { x => x.asInstanceOf[js.Any] },
        "MaxStorageSize" -> MaxStorageSize.map { x => x.asInstanceOf[js.Any] },
        "MinIopsPerDbInstance" -> MinIopsPerDbInstance.map { x => x.asInstanceOf[js.Any] },
        "MinIopsPerGib" -> MinIopsPerGib.map { x => x.asInstanceOf[js.Any] },
        "MinStorageSize" -> MinStorageSize.map { x => x.asInstanceOf[js.Any] },
        "MultiAZCapable" -> MultiAZCapable.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaCapable" -> ReadReplicaCapable.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "SupportsEnhancedMonitoring" -> SupportsEnhancedMonitoring.map { x => x.asInstanceOf[js.Any] },
        "SupportsIAMDatabaseAuthentication" -> SupportsIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "SupportsIops" -> SupportsIops.map { x => x.asInstanceOf[js.Any] },
        "SupportsPerformanceInsights" -> SupportsPerformanceInsights.map { x => x.asInstanceOf[js.Any] },
        "SupportsStorageEncryption" -> SupportsStorageEncryption.map { x => x.asInstanceOf[js.Any] },
        "Vpc" -> Vpc.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableDBInstanceOption]
    }
  }

  /**
   * Contains the result of a successful invocation of the <a>DescribeOrderableDBInstanceOptions</a> action.
   */
  @js.native
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList]
  }

  object OrderableDBInstanceOptionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined): OrderableDBInstanceOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "OrderableDBInstanceOptions" -> OrderableDBInstanceOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableDBInstanceOptionsMessage]
    }
  }

  /**
   * This data type is used as a request parameter in the <a>ModifyDBParameterGroup</a> and <a>ResetDBParameterGroup</a> actions.
   *  This data type is used as a response element in the <a>DescribeEngineDefaultParameters</a> and <a>DescribeDBParameters</a> actions.
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
      Source: js.UndefOr[String] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "ApplyMethod" -> ApplyMethod.map { x => x.asInstanceOf[js.Any] },
        "ApplyType" -> ApplyType.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * A list of the log types whose configuration is still pending. In other words, these log types are in the process of being activated or deactivated.
   */
  @js.native
  trait PendingCloudwatchLogsExports extends js.Object {
    var LogTypesToDisable: js.UndefOr[LogTypeList]
    var LogTypesToEnable: js.UndefOr[LogTypeList]
  }

  object PendingCloudwatchLogsExports {
    def apply(
      LogTypesToDisable: js.UndefOr[LogTypeList] = js.undefined,
      LogTypesToEnable: js.UndefOr[LogTypeList] = js.undefined): PendingCloudwatchLogsExports = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogTypesToDisable" -> LogTypesToDisable.map { x => x.asInstanceOf[js.Any] },
        "LogTypesToEnable" -> LogTypesToEnable.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingCloudwatchLogsExports]
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
      OptInStatus: js.UndefOr[String] = js.undefined): PendingMaintenanceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "AutoAppliedAfterDate" -> AutoAppliedAfterDate.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplyDate" -> CurrentApplyDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ForcedApplyDate" -> ForcedApplyDate.map { x => x.asInstanceOf[js.Any] },
        "OptInStatus" -> OptInStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceAction]
    }
  }

  /**
   * Data returned from the <b>DescribePendingMaintenanceActions</b> action.
   */
  @js.native
  trait PendingMaintenanceActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
  }

  object PendingMaintenanceActionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined): PendingMaintenanceActionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PendingMaintenanceActions" -> PendingMaintenanceActions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceActionsMessage]
    }
  }

  /**
   * This data type is used as a response element in the <a>ModifyDBInstance</a> action.
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
      StorageType: js.UndefOr[String] = js.undefined): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "PendingCloudwatchLogsExports" -> PendingCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait PromoteReadReplicaDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  object PromoteReadReplicaDBClusterMessage {
    def apply(
      DBClusterIdentifier: String): PromoteReadReplicaDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaDBClusterMessage]
    }
  }

  @js.native
  trait PromoteReadReplicaDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object PromoteReadReplicaDBClusterResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): PromoteReadReplicaDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaDBClusterResult]
    }
  }

  /**
   * Provisioned IOPS not available in the specified Availability Zone.
   */
  @js.native
  trait ProvisionedIopsNotAvailableInAZFaultException extends js.Object {

  }

  /**
   * A range of integer values.
   */
  @js.native
  trait Range extends js.Object {
    var From: js.UndefOr[Int]
    var Step: js.UndefOr[IntegerOptional]
    var To: js.UndefOr[Int]
  }

  object Range {
    def apply(
      From: js.UndefOr[Int] = js.undefined,
      Step: js.UndefOr[IntegerOptional] = js.undefined,
      To: js.UndefOr[Int] = js.undefined): Range = {
      val _fields = IndexedSeq[(String, js.Any)](
        "From" -> From.map { x => x.asInstanceOf[js.Any] },
        "Step" -> Step.map { x => x.asInstanceOf[js.Any] },
        "To" -> To.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Range]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RebootDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  object RebootDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: String,
      ForceFailover: js.UndefOr[BooleanOptional] = js.undefined): RebootDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "ForceFailover" -> ForceFailover.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootDBInstanceMessage]
    }
  }

  @js.native
  trait RebootDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RebootDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): RebootDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootDBInstanceResult]
    }
  }

  @js.native
  trait RemoveRoleFromDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
  }

  object RemoveRoleFromDBClusterMessage {
    def apply(
      DBClusterIdentifier: String,
      RoleArn: String): RemoveRoleFromDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveRoleFromDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
    var SourceIdentifier: String
    var SubscriptionName: String
  }

  object RemoveSourceIdentifierFromSubscriptionMessage {
    def apply(
      SourceIdentifier: String,
      SubscriptionName: String): RemoveSourceIdentifierFromSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveSourceIdentifierFromSubscriptionMessage]
    }
  }

  @js.native
  trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object RemoveSourceIdentifierFromSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): RemoveSourceIdentifierFromSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceMessage {
    def apply(
      ResourceName: String,
      TagKeys: KeyList): RemoveTagsFromResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
   * <p/>
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
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined): ResetDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ResetAllParameters" -> ResetAllParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetDBClusterParameterGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ResetDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  object ResetDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: String,
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined): ResetDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any],
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "ResetAllParameters" -> ResetAllParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetDBParameterGroupMessage]
    }
  }

  /**
   * The specified resource ID was not found.
   */
  @js.native
  trait ResourceNotFoundFaultException extends js.Object {

  }

  /**
   * Describes the pending maintenance actions for a resource.
   */
  @js.native
  trait ResourcePendingMaintenanceActions extends js.Object {
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails]
    var ResourceIdentifier: js.UndefOr[String]
  }

  object ResourcePendingMaintenanceActions {
    def apply(
      PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined,
      ResourceIdentifier: js.UndefOr[String] = js.undefined): ResourcePendingMaintenanceActions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PendingMaintenanceActionDetails" -> PendingMaintenanceActionDetails.map { x => x.asInstanceOf[js.Any] },
        "ResourceIdentifier" -> ResourceIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourcePendingMaintenanceActions]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RestoreDBClusterFromSnapshotMessage extends js.Object {
    var DBClusterIdentifier: String
    var Engine: String
    var SnapshotIdentifier: String
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
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
      DatabaseName: js.UndefOr[String] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): RestoreDBClusterFromSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine" -> Engine.asInstanceOf[js.Any],
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterFromSnapshotMessage]
    }
  }

  @js.native
  trait RestoreDBClusterFromSnapshotResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterFromSnapshotResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): RestoreDBClusterFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterFromSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RestoreDBClusterToPointInTimeMessage extends js.Object {
    var DBClusterIdentifier: String
    var SourceDBClusterIdentifier: String
    var DBSubnetGroupName: js.UndefOr[String]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var KmsKeyId: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var RestoreToTime: js.UndefOr[TStamp]
    var RestoreType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var UseLatestRestorableTime: js.UndefOr[Boolean]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object RestoreDBClusterToPointInTimeMessage {
    def apply(
      DBClusterIdentifier: String,
      SourceDBClusterIdentifier: String,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      RestoreToTime: js.UndefOr[TStamp] = js.undefined,
      RestoreType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): RestoreDBClusterToPointInTimeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "SourceDBClusterIdentifier" -> SourceDBClusterIdentifier.asInstanceOf[js.Any],
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "RestoreToTime" -> RestoreToTime.map { x => x.asInstanceOf[js.Any] },
        "RestoreType" -> RestoreType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "UseLatestRestorableTime" -> UseLatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterToPointInTimeMessage]
    }
  }

  @js.native
  trait RestoreDBClusterToPointInTimeResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterToPointInTimeResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): RestoreDBClusterToPointInTimeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterToPointInTimeResult]
    }
  }

  @js.native
  trait SNSInvalidTopicFaultException extends js.Object {

  }

  @js.native
  trait SNSNoAuthorizationFaultException extends js.Object {

  }

  @js.native
  trait SNSTopicArnNotFoundFaultException extends js.Object {

  }

  /**
   * You have exceeded the maximum number of accounts that you can share a manual DB snapshot with.
   */
  @js.native
  trait SharedSnapshotQuotaExceededFaultException extends js.Object {

  }

  /**
   * Request would result in user exceeding the allowed number of DB snapshots.
   */
  @js.native
  trait SnapshotQuotaExceededFaultException extends js.Object {

  }

  @js.native
  trait SourceNotFoundFaultException extends js.Object {

  }

  object SourceTypeEnum {
    val `db-instance` = "db-instance"
    val `db-parameter-group` = "db-parameter-group"
    val `db-security-group` = "db-security-group"
    val `db-snapshot` = "db-snapshot"
    val `db-cluster` = "db-cluster"
    val `db-cluster-snapshot` = "db-cluster-snapshot"

    val values = IndexedSeq(`db-instance`, `db-parameter-group`, `db-security-group`, `db-snapshot`, `db-cluster`, `db-cluster-snapshot`)
  }

  /**
   * Request would result in user exceeding the allowed amount of storage available across all DB instances.
   */
  @js.native
  trait StorageQuotaExceededFaultException extends js.Object {

  }

  /**
   * <i>StorageType</i> specified cannot be associated with the DB Instance.
   */
  @js.native
  trait StorageTypeNotSupportedFaultException extends js.Object {

  }

  /**
   * This data type is used as a response element in the <a>DescribeDBSubnetGroups</a> action.
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
      SubnetStatus: js.UndefOr[String] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SubnetIdentifier" -> SubnetIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SubnetStatus" -> SubnetStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * The DB subnet is already in use in the Availability Zone.
   */
  @js.native
  trait SubnetAlreadyInUseException extends js.Object {

  }

  @js.native
  trait SubscriptionAlreadyExistFaultException extends js.Object {

  }

  @js.native
  trait SubscriptionCategoryNotFoundFaultException extends js.Object {

  }

  @js.native
  trait SubscriptionNotFoundFaultException extends js.Object {

  }

  /**
   * Metadata assigned to an Amazon Neptune resource consisting of a key-value pair.
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait TagListMessage extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object TagListMessage {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined): TagListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagListMessage]
    }
  }

  /**
   * A time zone associated with a <a>DBInstance</a>. This data type is an element in the response to the <a>DescribeDBInstances</a>, and the <a>DescribeDBEngineVersions</a> actions.
   */
  @js.native
  trait Timezone extends js.Object {
    var TimezoneName: js.UndefOr[String]
  }

  object Timezone {
    def apply(
      TimezoneName: js.UndefOr[String] = js.undefined): Timezone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimezoneName" -> TimezoneName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Timezone]
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
      IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined): UpgradeTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoUpgrade" -> AutoUpgrade.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "IsMajorVersionUpgrade" -> IsMajorVersionUpgrade.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeTarget]
    }
  }

  /**
   * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <a>DescribeValidDBInstanceModifications</a> action. You can use this information when you call <a>ModifyDBInstance</a>.
   */
  @js.native
  trait ValidDBInstanceModificationsMessage extends js.Object {
    var Storage: js.UndefOr[ValidStorageOptionsList]
  }

  object ValidDBInstanceModificationsMessage {
    def apply(
      Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined): ValidDBInstanceModificationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Storage" -> Storage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidDBInstanceModificationsMessage]
    }
  }

  /**
   * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <a>DescribeValidDBInstanceModifications</a> action.
   */
  @js.native
  trait ValidStorageOptions extends js.Object {
    var IopsToStorageRatio: js.UndefOr[DoubleRangeList]
    var ProvisionedIops: js.UndefOr[RangeList]
    var StorageSize: js.UndefOr[RangeList]
    var StorageType: js.UndefOr[String]
  }

  object ValidStorageOptions {
    def apply(
      IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.undefined,
      ProvisionedIops: js.UndefOr[RangeList] = js.undefined,
      StorageSize: js.UndefOr[RangeList] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined): ValidStorageOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IopsToStorageRatio" -> IopsToStorageRatio.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedIops" -> ProvisionedIops.map { x => x.asInstanceOf[js.Any] },
        "StorageSize" -> StorageSize.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidStorageOptions]
    }
  }

  /**
   * This data type is used as a response element for queries on VPC security group membership.
   */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var Status: js.UndefOr[String]
    var VpcSecurityGroupId: js.UndefOr[String]
  }

  object VpcSecurityGroupMembership {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupId: js.UndefOr[String] = js.undefined): VpcSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupId" -> VpcSecurityGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
