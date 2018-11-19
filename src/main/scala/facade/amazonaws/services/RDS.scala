package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object rds {
  type AccountQuotaList = js.Array[AccountQuota]
  type ApplyMethod = String
  type AttributeValueList = js.Array[String]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZones = js.Array[String]
  type AvailableProcessorFeatureList = js.Array[AvailableProcessorFeature]
  type BooleanOptional = Boolean
  type CertificateList = js.Array[Certificate]
  type DBClusterBacktrackList = js.Array[DBClusterBacktrack]
  type DBClusterEndpointList = js.Array[DBClusterEndpoint]
  type DBClusterList = js.Array[DBCluster]
  type DBClusterMemberList = js.Array[DBClusterMember]
  type DBClusterOptionGroupMemberships = js.Array[DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList = js.Array[DBClusterParameterGroup]
  type DBClusterRoles = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[DBClusterSnapshot]
  type DBEngineVersionList = js.Array[DBEngineVersion]
  type DBInstanceAutomatedBackupList = js.Array[DBInstanceAutomatedBackup]
  type DBInstanceList = js.Array[DBInstance]
  type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[DBParameterGroupStatus]
  type DBSecurityGroupMembershipList = js.Array[DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[String]
  type DBSecurityGroups = js.Array[DBSecurityGroup]
  type DBSnapshotAttributeList = js.Array[DBSnapshotAttribute]
  type DBSnapshotList = js.Array[DBSnapshot]
  type DBSubnetGroups = js.Array[DBSubnetGroup]
  type DescribeDBLogFilesList = js.Array[DescribeDBLogFilesDetails]
  type DomainMembershipList = js.Array[DomainMembership]
  type DoubleOptional = Double
  type DoubleRangeList = js.Array[DoubleRange]
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EngineModeList = js.Array[String]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type IPRangeList = js.Array[IPRange]
  type IntegerOptional = Int
  type KeyList = js.Array[String]
  type LogTypeList = js.Array[String]
  type LongOptional = Double
  type MinimumEngineVersionPerAllowedValueList = js.Array[MinimumEngineVersionPerAllowedValue]
  type OptionConfigurationList = js.Array[OptionConfiguration]
  type OptionGroupMembershipList = js.Array[OptionGroupMembership]
  type OptionGroupOptionSettingsList = js.Array[OptionGroupOptionSetting]
  type OptionGroupOptionVersionsList = js.Array[OptionVersion]
  type OptionGroupOptionsList = js.Array[OptionGroupOption]
  type OptionGroupsList = js.Array[OptionGroup]
  type OptionNamesList = js.Array[String]
  type OptionSettingConfigurationList = js.Array[OptionSetting]
  type OptionSettingsList = js.Array[OptionSetting]
  type OptionsConflictsWith = js.Array[String]
  type OptionsDependedOn = js.Array[String]
  type OptionsList = js.Array[Option]
  type OrderableDBInstanceOptionsList = js.Array[OrderableDBInstanceOption]
  type ParametersList = js.Array[Parameter]
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  type ProcessorFeatureList = js.Array[ProcessorFeature]
  type RangeList = js.Array[Range]
  type ReadReplicaDBClusterIdentifierList = js.Array[String]
  type ReadReplicaDBInstanceIdentifierList = js.Array[String]
  type ReadReplicaIdentifierList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservedDBInstanceList = js.Array[ReservedDBInstance]
  type ReservedDBInstancesOfferingList = js.Array[ReservedDBInstancesOffering]
  type SourceIdsList = js.Array[String]
  type SourceRegionList = js.Array[SourceRegion]
  type SourceType = String
  type StringList = js.Array[String]
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

package rds {
  @js.native
  @JSImport("aws-sdk", "RDS")
  class RDS(config: AWSConfig) extends js.Object {
    def addRoleToDBCluster(params: AddRoleToDBClusterMessage): Request[js.Object] = js.native
    def addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage): Request[AddSourceIdentifierToSubscriptionResult] = js.native
    def addTagsToResource(params: AddTagsToResourceMessage): Request[js.Object] = js.native
    def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): Request[ApplyPendingMaintenanceActionResult] = js.native
    def authorizeDBSecurityGroupIngress(params: AuthorizeDBSecurityGroupIngressMessage): Request[AuthorizeDBSecurityGroupIngressResult] = js.native
    def backtrackDBCluster(params: BacktrackDBClusterMessage): Request[DBClusterBacktrack] = js.native
    def copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage): Request[CopyDBClusterParameterGroupResult] = js.native
    def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): Request[CopyDBClusterSnapshotResult] = js.native
    def copyDBParameterGroup(params: CopyDBParameterGroupMessage): Request[CopyDBParameterGroupResult] = js.native
    def copyDBSnapshot(params: CopyDBSnapshotMessage): Request[CopyDBSnapshotResult] = js.native
    def copyOptionGroup(params: CopyOptionGroupMessage): Request[CopyOptionGroupResult] = js.native
    def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult] = js.native
    def createDBClusterEndpoint(params: CreateDBClusterEndpointMessage): Request[DBClusterEndpoint] = js.native
    def createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage): Request[CreateDBClusterParameterGroupResult] = js.native
    def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): Request[CreateDBClusterSnapshotResult] = js.native
    def createDBInstance(params: CreateDBInstanceMessage): Request[CreateDBInstanceResult] = js.native
    def createDBInstanceReadReplica(params: CreateDBInstanceReadReplicaMessage): Request[CreateDBInstanceReadReplicaResult] = js.native
    def createDBParameterGroup(params: CreateDBParameterGroupMessage): Request[CreateDBParameterGroupResult] = js.native
    def createDBSecurityGroup(params: CreateDBSecurityGroupMessage): Request[CreateDBSecurityGroupResult] = js.native
    def createDBSnapshot(params: CreateDBSnapshotMessage): Request[CreateDBSnapshotResult] = js.native
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] = js.native
    def createOptionGroup(params: CreateOptionGroupMessage): Request[CreateOptionGroupResult] = js.native
    def deleteDBCluster(params: DeleteDBClusterMessage): Request[DeleteDBClusterResult] = js.native
    def deleteDBClusterEndpoint(params: DeleteDBClusterEndpointMessage): Request[DBClusterEndpoint] = js.native
    def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): Request[js.Object] = js.native
    def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): Request[DeleteDBClusterSnapshotResult] = js.native
    def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult] = js.native
    def deleteDBInstanceAutomatedBackup(params: DeleteDBInstanceAutomatedBackupMessage): Request[DeleteDBInstanceAutomatedBackupResult] = js.native
    def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): Request[js.Object] = js.native
    def deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage): Request[js.Object] = js.native
    def deleteDBSnapshot(params: DeleteDBSnapshotMessage): Request[DeleteDBSnapshotResult] = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object] = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResult] = js.native
    def deleteOptionGroup(params: DeleteOptionGroupMessage): Request[js.Object] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[AccountAttributesMessage] = js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[CertificateMessage] = js.native
    def describeDBClusterBacktracks(params: DescribeDBClusterBacktracksMessage): Request[DBClusterBacktrackMessage] = js.native
    def describeDBClusterEndpoints(params: DescribeDBClusterEndpointsMessage): Request[DBClusterEndpointMessage] = js.native
    def describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage): Request[DBClusterParameterGroupsMessage] = js.native
    def describeDBClusterParameters(params: DescribeDBClusterParametersMessage): Request[DBClusterParameterGroupDetails] = js.native
    def describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage): Request[DescribeDBClusterSnapshotAttributesResult] = js.native
    def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): Request[DBClusterSnapshotMessage] = js.native
    def describeDBClusters(params: DescribeDBClustersMessage): Request[DBClusterMessage] = js.native
    def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage): Request[DBEngineVersionMessage] = js.native
    def describeDBInstanceAutomatedBackups(params: DescribeDBInstanceAutomatedBackupsMessage): Request[DBInstanceAutomatedBackupMessage] = js.native
    def describeDBInstances(params: DescribeDBInstancesMessage): Request[DBInstanceMessage] = js.native
    def describeDBLogFiles(params: DescribeDBLogFilesMessage): Request[DescribeDBLogFilesResponse] = js.native
    def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage): Request[DBParameterGroupsMessage] = js.native
    def describeDBParameters(params: DescribeDBParametersMessage): Request[DBParameterGroupDetails] = js.native
    def describeDBSecurityGroups(params: DescribeDBSecurityGroupsMessage): Request[DBSecurityGroupMessage] = js.native
    def describeDBSnapshotAttributes(params: DescribeDBSnapshotAttributesMessage): Request[DescribeDBSnapshotAttributesResult] = js.native
    def describeDBSnapshots(params: DescribeDBSnapshotsMessage): Request[DBSnapshotMessage] = js.native
    def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): Request[DBSubnetGroupMessage] = js.native
    def describeEngineDefaultClusterParameters(params: DescribeEngineDefaultClusterParametersMessage): Request[DescribeEngineDefaultClusterParametersResult] = js.native
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): Request[DescribeEngineDefaultParametersResult] = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage] = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeOptionGroupOptions(params: DescribeOptionGroupOptionsMessage): Request[OptionGroupOptionsMessage] = js.native
    def describeOptionGroups(params: DescribeOptionGroupsMessage): Request[OptionGroups] = js.native
    def describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage): Request[OrderableDBInstanceOptionsMessage] = js.native
    def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): Request[PendingMaintenanceActionsMessage] = js.native
    def describeReservedDBInstances(params: DescribeReservedDBInstancesMessage): Request[ReservedDBInstanceMessage] = js.native
    def describeReservedDBInstancesOfferings(params: DescribeReservedDBInstancesOfferingsMessage): Request[ReservedDBInstancesOfferingMessage] = js.native
    def describeSourceRegions(params: DescribeSourceRegionsMessage): Request[SourceRegionMessage] = js.native
    def describeValidDBInstanceModifications(params: DescribeValidDBInstanceModificationsMessage): Request[DescribeValidDBInstanceModificationsResult] = js.native
    def downloadDBLogFilePortion(params: DownloadDBLogFilePortionMessage): Request[DownloadDBLogFilePortionDetails] = js.native
    def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage] = js.native
    def modifyCurrentDBClusterCapacity(params: ModifyCurrentDBClusterCapacityMessage): Request[DBClusterCapacityInfo] = js.native
    def modifyDBCluster(params: ModifyDBClusterMessage): Request[ModifyDBClusterResult] = js.native
    def modifyDBClusterEndpoint(params: ModifyDBClusterEndpointMessage): Request[DBClusterEndpoint] = js.native
    def modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage] = js.native
    def modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage): Request[ModifyDBClusterSnapshotAttributeResult] = js.native
    def modifyDBInstance(params: ModifyDBInstanceMessage): Request[ModifyDBInstanceResult] = js.native
    def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def modifyDBSnapshot(params: ModifyDBSnapshotMessage): Request[ModifyDBSnapshotResult] = js.native
    def modifyDBSnapshotAttribute(params: ModifyDBSnapshotAttributeMessage): Request[ModifyDBSnapshotAttributeResult] = js.native
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): Request[ModifyDBSubnetGroupResult] = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult] = js.native
    def modifyOptionGroup(params: ModifyOptionGroupMessage): Request[ModifyOptionGroupResult] = js.native
    def promoteReadReplica(params: PromoteReadReplicaMessage): Request[PromoteReadReplicaResult] = js.native
    def promoteReadReplicaDBCluster(params: PromoteReadReplicaDBClusterMessage): Request[PromoteReadReplicaDBClusterResult] = js.native
    def purchaseReservedDBInstancesOffering(params: PurchaseReservedDBInstancesOfferingMessage): Request[PurchaseReservedDBInstancesOfferingResult] = js.native
    def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult] = js.native
    def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): Request[js.Object] = js.native
    def removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage): Request[RemoveSourceIdentifierFromSubscriptionResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object] = js.native
    def resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage] = js.native
    def resetDBParameterGroup(params: ResetDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def restoreDBClusterFromS3(params: RestoreDBClusterFromS3Message): Request[RestoreDBClusterFromS3Result] = js.native
    def restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage): Request[RestoreDBClusterFromSnapshotResult] = js.native
    def restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage): Request[RestoreDBClusterToPointInTimeResult] = js.native
    def restoreDBInstanceFromDBSnapshot(params: RestoreDBInstanceFromDBSnapshotMessage): Request[RestoreDBInstanceFromDBSnapshotResult] = js.native
    def restoreDBInstanceFromS3(params: RestoreDBInstanceFromS3Message): Request[RestoreDBInstanceFromS3Result] = js.native
    def restoreDBInstanceToPointInTime(params: RestoreDBInstanceToPointInTimeMessage): Request[RestoreDBInstanceToPointInTimeResult] = js.native
    def revokeDBSecurityGroupIngress(params: RevokeDBSecurityGroupIngressMessage): Request[RevokeDBSecurityGroupIngressResult] = js.native
    def startDBCluster(params: StartDBClusterMessage): Request[StartDBClusterResult] = js.native
    def startDBInstance(params: StartDBInstanceMessage): Request[StartDBInstanceResult] = js.native
    def stopDBCluster(params: StopDBClusterMessage): Request[StopDBClusterResult] = js.native
    def stopDBInstance(params: StopDBInstanceMessage): Request[StopDBInstanceResult] = js.native
  }

  /**
   * <p>Data returned by the <b>DescribeAccountAttributes</b> action.</p>
   */
  @js.native
  trait AccountAttributesMessage extends js.Object {
    var AccountQuotas: js.UndefOr[AccountQuotaList]
  }

  object AccountAttributesMessage {
    def apply(
      AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined): AccountAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountQuotas" -> AccountQuotas.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttributesMessage]
    }
  }

  /**
   * <p>Describes a quota for an AWS account, for example, the number of DB instances allowed.</p>
   */
  @js.native
  trait AccountQuota extends js.Object {
    var AccountQuotaName: js.UndefOr[String]
    var Used: js.UndefOr[Double]
    var Max: js.UndefOr[Double]
  }

  object AccountQuota {
    def apply(
      AccountQuotaName: js.UndefOr[String] = js.undefined,
      Used: js.UndefOr[Double] = js.undefined,
      Max: js.UndefOr[Double] = js.undefined): AccountQuota = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountQuotaName" -> AccountQuotaName.map { x => x.asInstanceOf[js.Any] },
        "Used" -> Used.map { x => x.asInstanceOf[js.Any] },
        "Max" -> Max.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountQuota]
    }
  }

  @js.native
  trait AddRoleToDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var RoleArn: js.UndefOr[String]
  }

  object AddRoleToDBClusterMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      RoleArn: js.UndefOr[String] = js.undefined): AddRoleToDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddRoleToDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddSourceIdentifierToSubscriptionMessage extends js.Object {
    var SubscriptionName: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
  }

  object AddSourceIdentifierToSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined): AddSourceIdentifierToSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsToResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): AddTagsToResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceIdentifier: js.UndefOr[String]
    var ApplyAction: js.UndefOr[String]
    var OptInType: js.UndefOr[String]
  }

  object ApplyPendingMaintenanceActionMessage {
    def apply(
      ResourceIdentifier: js.UndefOr[String] = js.undefined,
      ApplyAction: js.UndefOr[String] = js.undefined,
      OptInType: js.UndefOr[String] = js.undefined): ApplyPendingMaintenanceActionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIdentifier" -> ResourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ApplyAction" -> ApplyAction.map { x => x.asInstanceOf[js.Any] },
        "OptInType" -> OptInType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p/>
   */
  @js.native
  trait AuthorizeDBSecurityGroupIngressMessage extends js.Object {
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var DBSecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object AuthorizeDBSecurityGroupIngressMessage {
    def apply(
      CIDRIP: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): AuthorizeDBSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CIDRIP" -> CIDRIP.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupId" -> EC2SecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeDBSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object AuthorizeDBSecurityGroupIngressResult {
    def apply(
      DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined): AuthorizeDBSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroup" -> DBSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
    }
  }

  /**
   * <p>Contains Availability Zone information.</p> <p> This data type is used as an element in the following data type:</p> <ul> <li> <p> <a>OrderableDBInstanceOption</a> </p> </li> </ul>
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
   * <p>Contains the available processor feature information for the DB instance class of a DB instance.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor">Configuring the Processor of the DB Instance Class</a> in the <i>Amazon RDS User Guide. </i> </p>
   */
  @js.native
  trait AvailableProcessorFeature extends js.Object {
    var Name: js.UndefOr[String]
    var DefaultValue: js.UndefOr[String]
    var AllowedValues: js.UndefOr[String]
  }

  object AvailableProcessorFeature {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      DefaultValue: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined): AvailableProcessorFeature = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailableProcessorFeature]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait BacktrackDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var BacktrackTo: js.UndefOr[TStamp]
    var Force: js.UndefOr[BooleanOptional]
    var UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional]
  }

  object BacktrackDBClusterMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      BacktrackTo: js.UndefOr[TStamp] = js.undefined,
      Force: js.UndefOr[BooleanOptional] = js.undefined,
      UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional] = js.undefined): BacktrackDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BacktrackTo" -> BacktrackTo.map { x => x.asInstanceOf[js.Any] },
        "Force" -> Force.map { x => x.asInstanceOf[js.Any] },
        "UseEarliestTimeOnPointInTimeUnavailable" -> UseEarliestTimeOnPointInTimeUnavailable.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BacktrackDBClusterMessage]
    }
  }

  /**
   * <p>A CA certificate for an AWS account.</p>
   */
  @js.native
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var ValidTill: js.UndefOr[TStamp]
    var ValidFrom: js.UndefOr[TStamp]
    var Thumbprint: js.UndefOr[String]
    var CertificateIdentifier: js.UndefOr[String]
    var CertificateType: js.UndefOr[String]
  }

  object Certificate {
    def apply(
      CertificateArn: js.UndefOr[String] = js.undefined,
      ValidTill: js.UndefOr[TStamp] = js.undefined,
      ValidFrom: js.UndefOr[TStamp] = js.undefined,
      Thumbprint: js.UndefOr[String] = js.undefined,
      CertificateIdentifier: js.UndefOr[String] = js.undefined,
      CertificateType: js.UndefOr[String] = js.undefined): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "ValidTill" -> ValidTill.map { x => x.asInstanceOf[js.Any] },
        "ValidFrom" -> ValidFrom.map { x => x.asInstanceOf[js.Any] },
        "Thumbprint" -> Thumbprint.map { x => x.asInstanceOf[js.Any] },
        "CertificateIdentifier" -> CertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CertificateType" -> CertificateType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
    }
  }

  /**
   * <p>Data returned by the <b>DescribeCertificates</b> action.</p>
   */
  @js.native
  trait CertificateMessage extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var Marker: js.UndefOr[String]
  }

  object CertificateMessage {
    def apply(
      Certificates: js.UndefOr[CertificateList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): CertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateMessage]
    }
  }

  /**
   * <p> This data type is used as a response element in the action <a>DescribeDBEngineVersions</a>. </p>
   */
  @js.native
  trait CharacterSet extends js.Object {
    var CharacterSetName: js.UndefOr[String]
    var CharacterSetDescription: js.UndefOr[String]
  }

  object CharacterSet {
    def apply(
      CharacterSetName: js.UndefOr[String] = js.undefined,
      CharacterSetDescription: js.UndefOr[String] = js.undefined): CharacterSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetDescription" -> CharacterSetDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CharacterSet]
    }
  }

  /**
   * <p>The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance or DB cluster.</p> <p>The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which logs will be exported (or not exported) to CloudWatch Logs. The values within these arrays depend on the DB engine being used. For more information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch">Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.</p>
   */
  @js.native
  trait CloudwatchLogsExportConfiguration extends js.Object {
    var EnableLogTypes: js.UndefOr[LogTypeList]
    var DisableLogTypes: js.UndefOr[LogTypeList]
  }

  object CloudwatchLogsExportConfiguration {
    def apply(
      EnableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
      DisableLogTypes: js.UndefOr[LogTypeList] = js.undefined): CloudwatchLogsExportConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnableLogTypes" -> EnableLogTypes.map { x => x.asInstanceOf[js.Any] },
        "DisableLogTypes" -> DisableLogTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudwatchLogsExportConfiguration]
    }
  }

  @js.native
  trait CopyDBClusterParameterGroupMessage extends js.Object {
    var SourceDBClusterParameterGroupIdentifier: js.UndefOr[String]
    var TargetDBClusterParameterGroupIdentifier: js.UndefOr[String]
    var TargetDBClusterParameterGroupDescription: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBClusterParameterGroupMessage {
    def apply(
      SourceDBClusterParameterGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBClusterParameterGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBClusterParameterGroupDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CopyDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBClusterParameterGroupIdentifier" -> SourceDBClusterParameterGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetDBClusterParameterGroupIdentifier" -> TargetDBClusterParameterGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetDBClusterParameterGroupDescription" -> TargetDBClusterParameterGroupDescription.map { x => x.asInstanceOf[js.Any] },
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
    var SourceRegion: js.UndefOr[String]
    var SourceDBClusterSnapshotIdentifier: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var PreSignedUrl: js.UndefOr[String]
    var CopyTags: js.UndefOr[BooleanOptional]
    var Tags: js.UndefOr[TagList]
    var TargetDBClusterSnapshotIdentifier: js.UndefOr[String]
  }

  object CopyDBClusterSnapshotMessage {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      SourceDBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      PreSignedUrl: js.UndefOr[String] = js.undefined,
      CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      TargetDBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined): CopyDBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "SourceDBClusterSnapshotIdentifier" -> SourceDBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "PreSignedUrl" -> PreSignedUrl.map { x => x.asInstanceOf[js.Any] },
        "CopyTags" -> CopyTags.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TargetDBClusterSnapshotIdentifier" -> TargetDBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var SourceDBParameterGroupIdentifier: js.UndefOr[String]
    var TargetDBParameterGroupIdentifier: js.UndefOr[String]
    var TargetDBParameterGroupDescription: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBParameterGroupMessage {
    def apply(
      SourceDBParameterGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBParameterGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBParameterGroupDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CopyDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBParameterGroupIdentifier" -> SourceDBParameterGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetDBParameterGroupIdentifier" -> TargetDBParameterGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetDBParameterGroupDescription" -> TargetDBParameterGroupDescription.map { x => x.asInstanceOf[js.Any] },
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
  trait CopyDBSnapshotMessage extends js.Object {
    var SourceRegion: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var PreSignedUrl: js.UndefOr[String]
    var SourceDBSnapshotIdentifier: js.UndefOr[String]
    var TargetDBSnapshotIdentifier: js.UndefOr[String]
    var CopyTags: js.UndefOr[BooleanOptional]
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBSnapshotMessage {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      PreSignedUrl: js.UndefOr[String] = js.undefined,
      SourceDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CopyDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "PreSignedUrl" -> PreSignedUrl.map { x => x.asInstanceOf[js.Any] },
        "SourceDBSnapshotIdentifier" -> SourceDBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetDBSnapshotIdentifier" -> TargetDBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CopyTags" -> CopyTags.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBSnapshotMessage]
    }
  }

  @js.native
  trait CopyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object CopyDBSnapshotResult {
    def apply(
      DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined): CopyDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshot" -> DBSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CopyOptionGroupMessage extends js.Object {
    var SourceOptionGroupIdentifier: js.UndefOr[String]
    var TargetOptionGroupIdentifier: js.UndefOr[String]
    var TargetOptionGroupDescription: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CopyOptionGroupMessage {
    def apply(
      SourceOptionGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetOptionGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetOptionGroupDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CopyOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceOptionGroupIdentifier" -> SourceOptionGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetOptionGroupIdentifier" -> TargetOptionGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TargetOptionGroupDescription" -> TargetOptionGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyOptionGroupMessage]
    }
  }

  @js.native
  trait CopyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object CopyOptionGroupResult {
    def apply(
      OptionGroup: js.UndefOr[OptionGroup] = js.undefined): CopyOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroup" -> OptionGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyOptionGroupResult]
    }
  }

  @js.native
  trait CreateDBClusterEndpointMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var StaticMembers: js.UndefOr[StringList]
    var EndpointType: js.UndefOr[String]
    var DBClusterEndpointIdentifier: js.UndefOr[String]
    var ExcludedMembers: js.UndefOr[StringList]
  }

  object CreateDBClusterEndpointMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      StaticMembers: js.UndefOr[StringList] = js.undefined,
      EndpointType: js.UndefOr[String] = js.undefined,
      DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined,
      ExcludedMembers: js.UndefOr[StringList] = js.undefined): CreateDBClusterEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "StaticMembers" -> StaticMembers.map { x => x.asInstanceOf[js.Any] },
        "EndpointType" -> EndpointType.map { x => x.asInstanceOf[js.Any] },
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ExcludedMembers" -> ExcludedMembers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterEndpointMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateDBClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var SourceRegion: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var ReplicationSourceIdentifier: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var EngineMode: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var PreSignedUrl: js.UndefOr[String]
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var MasterUsername: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var MasterUserPassword: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object CreateDBClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      SourceRegion: js.UndefOr[String] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      EngineMode: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      PreSignedUrl: js.UndefOr[String] = js.undefined,
      ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined): CreateDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSourceIdentifier" -> ReplicationSourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "EngineMode" -> EngineMode.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "PreSignedUrl" -> PreSignedUrl.map { x => x.asInstanceOf[js.Any] },
        "ScalingConfiguration" -> ScalingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "BacktrackWindow" -> BacktrackWindow.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBClusterParameterGroupMessage {
    def apply(
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
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
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBClusterSnapshotMessage {
    def apply(
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
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
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var DBClusterIdentifier: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
    var Timezone: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList]
    var DBName: js.UndefOr[String]
    var MonitoringRoleArn: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var DBInstanceIdentifier: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var MasterUsername: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DomainIAMRoleName: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var MasterUserPassword: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var Domain: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object CreateDBInstanceMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
      PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      Timezone: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      MonitoringRoleArn: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
      DomainIAMRoleName: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
      PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined): CreateDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "MonitoringInterval" -> MonitoringInterval.map { x => x.asInstanceOf[js.Any] },
        "PromotionTier" -> PromotionTier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroups" -> DBSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceMessage]
    }
  }

  @js.native
  trait CreateDBInstanceReadReplicaMessage extends js.Object {
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var SourceRegion: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var MonitoringRoleArn: js.UndefOr[String]
    var SourceDBInstanceIdentifier: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var PreSignedUrl: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var DBInstanceIdentifier: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var Iops: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object CreateDBInstanceReadReplicaMessage {
    def apply(
      MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
      SourceRegion: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
      EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      MonitoringRoleArn: js.UndefOr[String] = js.undefined,
      SourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      PreSignedUrl: js.UndefOr[String] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
      PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined): CreateDBInstanceReadReplicaMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MonitoringInterval" -> MonitoringInterval.map { x => x.asInstanceOf[js.Any] },
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x => x.asInstanceOf[js.Any] },
        "SourceDBInstanceIdentifier" -> SourceDBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "PreSignedUrl" -> PreSignedUrl.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceReadReplicaMessage]
    }
  }

  @js.native
  trait CreateDBInstanceReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object CreateDBInstanceReadReplicaResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): CreateDBInstanceReadReplicaResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceReadReplicaResult]
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
    var DBParameterGroupName: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
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
  trait CreateDBSecurityGroupMessage extends js.Object {
    var DBSecurityGroupName: js.UndefOr[String]
    var DBSecurityGroupDescription: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBSecurityGroupMessage {
    def apply(
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      DBSecurityGroupDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroupDescription" -> DBSecurityGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateDBSecurityGroupResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object CreateDBSecurityGroupResult {
    def apply(
      DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined): CreateDBSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroup" -> DBSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSecurityGroupResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBSnapshotMessage {
    def apply(
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSnapshotMessage]
    }
  }

  @js.native
  trait CreateDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object CreateDBSnapshotResult {
    def apply(
      DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined): CreateDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshot" -> DBSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: js.UndefOr[String]
    var DBSubnetGroupDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBSubnetGroupMessage {
    def apply(
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
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
    var Enabled: js.UndefOr[BooleanOptional]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SubscriptionName: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Tags: js.UndefOr[TagList]
    var SourceType: js.UndefOr[String]
  }

  object CreateEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined): CreateEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SourceIds" -> SourceIds.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p/>
   */
  @js.native
  trait CreateOptionGroupMessage extends js.Object {
    var MajorEngineVersion: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var OptionGroupDescription: js.UndefOr[String]
  }

  object CreateOptionGroupMessage {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      OptionGroupDescription: js.UndefOr[String] = js.undefined): CreateOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MajorEngineVersion" -> MajorEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupDescription" -> OptionGroupDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOptionGroupMessage]
    }
  }

  @js.native
  trait CreateOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object CreateOptionGroupResult {
    def apply(
      OptionGroup: js.UndefOr[OptionGroup] = js.undefined): CreateOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroup" -> OptionGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOptionGroupResult]
    }
  }

  /**
   * <p>Contains the details of an Amazon Aurora DB cluster. </p> <p>This data type is used as a response element in the <a>DescribeDBClusters</a>, <a>StopDBCluster</a>, and <a>StartDBCluster</a> actions. </p>
   */
  @js.native
  trait DBCluster extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
    var AssociatedRoles: js.UndefOr[DBClusterRoles]
    var Engine: js.UndefOr[String]
    var CustomEndpoints: js.UndefOr[StringList]
    var MultiAZ: js.UndefOr[Boolean]
    var DBSubnetGroup: js.UndefOr[String]
    var Endpoint: js.UndefOr[String]
    var ReplicationSourceIdentifier: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var CloneGroupId: js.UndefOr[String]
    var PercentProgress: js.UndefOr[String]
    var EngineMode: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var BacktrackConsumedChangeRecords: js.UndefOr[LongOptional]
    var DbClusterResourceId: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var DBClusterArn: js.UndefOr[String]
    var EarliestRestorableTime: js.UndefOr[TStamp]
    var MasterUsername: js.UndefOr[String]
    var DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
    var ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList]
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var DBClusterMembers: js.UndefOr[DBClusterMemberList]
    var EngineVersion: js.UndefOr[String]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var LatestRestorableTime: js.UndefOr[TStamp]
    var ReaderEndpoint: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[Boolean]
    var DBClusterParameterGroup: js.UndefOr[String]
    var ScalingConfigurationInfo: js.UndefOr[ScalingConfigurationInfo]
    var EarliestBacktrackTime: js.UndefOr[TStamp]
    var StorageEncrypted: js.UndefOr[Boolean]
    var HostedZoneId: js.UndefOr[String]
    var Capacity: js.UndefOr[IntegerOptional]
    var Status: js.UndefOr[String]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object DBCluster {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      CustomEndpoints: js.UndefOr[StringList] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      DBSubnetGroup: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[String] = js.undefined,
      ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      CloneGroupId: js.UndefOr[String] = js.undefined,
      PercentProgress: js.UndefOr[String] = js.undefined,
      EngineMode: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      BacktrackConsumedChangeRecords: js.UndefOr[LongOptional] = js.undefined,
      DbClusterResourceId: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      DBClusterArn: js.UndefOr[String] = js.undefined,
      EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships] = js.undefined,
      VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
      ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList] = js.undefined,
      EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
      ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      LatestRestorableTime: js.UndefOr[TStamp] = js.undefined,
      ReaderEndpoint: js.UndefOr[String] = js.undefined,
      DeletionProtection: js.UndefOr[Boolean] = js.undefined,
      DBClusterParameterGroup: js.UndefOr[String] = js.undefined,
      ScalingConfigurationInfo: js.UndefOr[ScalingConfigurationInfo] = js.undefined,
      EarliestBacktrackTime: js.UndefOr[TStamp] = js.undefined,
      StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
      HostedZoneId: js.UndefOr[String] = js.undefined,
      Capacity: js.UndefOr[IntegerOptional] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined): DBCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "AssociatedRoles" -> AssociatedRoles.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "CustomEndpoints" -> CustomEndpoints.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroup" -> DBSubnetGroup.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSourceIdentifier" -> ReplicationSourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "CloneGroupId" -> CloneGroupId.map { x => x.asInstanceOf[js.Any] },
        "PercentProgress" -> PercentProgress.map { x => x.asInstanceOf[js.Any] },
        "EngineMode" -> EngineMode.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "BacktrackConsumedChangeRecords" -> BacktrackConsumedChangeRecords.map { x => x.asInstanceOf[js.Any] },
        "DbClusterResourceId" -> DbClusterResourceId.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "DBClusterArn" -> DBClusterArn.map { x => x.asInstanceOf[js.Any] },
        "EarliestRestorableTime" -> EarliestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "DBClusterOptionGroupMemberships" -> DBClusterOptionGroupMemberships.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaIdentifiers" -> ReadReplicaIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "EnabledCloudwatchLogsExports" -> EnabledCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "DBClusterMembers" -> DBClusterMembers.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "BacktrackWindow" -> BacktrackWindow.map { x => x.asInstanceOf[js.Any] },
        "ClusterCreateTime" -> ClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "LatestRestorableTime" -> LatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "ReaderEndpoint" -> ReaderEndpoint.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroup" -> DBClusterParameterGroup.map { x => x.asInstanceOf[js.Any] },
        "ScalingConfigurationInfo" -> ScalingConfigurationInfo.map { x => x.asInstanceOf[js.Any] },
        "EarliestBacktrackTime" -> EarliestBacktrackTime.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "Capacity" -> Capacity.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBCluster]
    }
  }

  /**
   * <p>This data type is used as a response element in the <a>DescribeDBClusterBacktracks</a> action.</p>
   */
  @js.native
  trait DBClusterBacktrack extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var BacktrackRequestCreationTime: js.UndefOr[TStamp]
    var BacktrackTo: js.UndefOr[TStamp]
    var BacktrackedFrom: js.UndefOr[TStamp]
    var BacktrackIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBClusterBacktrack {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      BacktrackRequestCreationTime: js.UndefOr[TStamp] = js.undefined,
      BacktrackTo: js.UndefOr[TStamp] = js.undefined,
      BacktrackedFrom: js.UndefOr[TStamp] = js.undefined,
      BacktrackIdentifier: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): DBClusterBacktrack = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BacktrackRequestCreationTime" -> BacktrackRequestCreationTime.map { x => x.asInstanceOf[js.Any] },
        "BacktrackTo" -> BacktrackTo.map { x => x.asInstanceOf[js.Any] },
        "BacktrackedFrom" -> BacktrackedFrom.map { x => x.asInstanceOf[js.Any] },
        "BacktrackIdentifier" -> BacktrackIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterBacktrack]
    }
  }

  /**
   * <p>Contains the result of a successful invocation of the <a>DescribeDBClusterBacktracks</a> action.</p>
   */
  @js.native
  trait DBClusterBacktrackMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList]
  }

  object DBClusterBacktrackMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList] = js.undefined): DBClusterBacktrackMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBClusterBacktracks" -> DBClusterBacktracks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterBacktrackMessage]
    }
  }

  @js.native
  trait DBClusterCapacityInfo extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var SecondsBeforeTimeout: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
    var PendingCapacity: js.UndefOr[IntegerOptional]
    var CurrentCapacity: js.UndefOr[IntegerOptional]
  }

  object DBClusterCapacityInfo {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
      TimeoutAction: js.UndefOr[String] = js.undefined,
      PendingCapacity: js.UndefOr[IntegerOptional] = js.undefined,
      CurrentCapacity: js.UndefOr[IntegerOptional] = js.undefined): DBClusterCapacityInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SecondsBeforeTimeout" -> SecondsBeforeTimeout.map { x => x.asInstanceOf[js.Any] },
        "TimeoutAction" -> TimeoutAction.map { x => x.asInstanceOf[js.Any] },
        "PendingCapacity" -> PendingCapacity.map { x => x.asInstanceOf[js.Any] },
        "CurrentCapacity" -> CurrentCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterCapacityInfo]
    }
  }

  /**
   * <p>This data type represents the information you need to connect to an Amazon Aurora DB cluster. This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>CreateDBClusterEndpoint</a> </p> </li> <li> <p> <a>DescribeDBClusterEndpoints</a> </p> </li> <li> <p> <a>ModifyDBClusterEndpoint</a> </p> </li> <li> <p> <a>DeleteDBClusterEndpoint</a> </p> </li> </ul> <p>For the data structure that represents Amazon RDS DB instance endpoints, see <a>Endpoint</a>.</p>
   */
  @js.native
  trait DBClusterEndpoint extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterEndpointArn: js.UndefOr[String]
    var StaticMembers: js.UndefOr[StringList]
    var Endpoint: js.UndefOr[String]
    var EndpointType: js.UndefOr[String]
    var DBClusterEndpointIdentifier: js.UndefOr[String]
    var DBClusterEndpointResourceIdentifier: js.UndefOr[String]
    var CustomEndpointType: js.UndefOr[String]
    var ExcludedMembers: js.UndefOr[StringList]
    var Status: js.UndefOr[String]
  }

  object DBClusterEndpoint {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterEndpointArn: js.UndefOr[String] = js.undefined,
      StaticMembers: js.UndefOr[StringList] = js.undefined,
      Endpoint: js.UndefOr[String] = js.undefined,
      EndpointType: js.UndefOr[String] = js.undefined,
      DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterEndpointResourceIdentifier: js.UndefOr[String] = js.undefined,
      CustomEndpointType: js.UndefOr[String] = js.undefined,
      ExcludedMembers: js.UndefOr[StringList] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): DBClusterEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterEndpointArn" -> DBClusterEndpointArn.map { x => x.asInstanceOf[js.Any] },
        "StaticMembers" -> StaticMembers.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "EndpointType" -> EndpointType.map { x => x.asInstanceOf[js.Any] },
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterEndpointResourceIdentifier" -> DBClusterEndpointResourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CustomEndpointType" -> CustomEndpointType.map { x => x.asInstanceOf[js.Any] },
        "ExcludedMembers" -> ExcludedMembers.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterEndpoint]
    }
  }

  @js.native
  trait DBClusterEndpointMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList]
  }

  object DBClusterEndpointMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBClusterEndpoints: js.UndefOr[DBClusterEndpointList] = js.undefined): DBClusterEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBClusterEndpoints" -> DBClusterEndpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterEndpointMessage]
    }
  }

  /**
   * <p>Contains information about an instance that is part of a DB cluster.</p>
   */
  @js.native
  trait DBClusterMember extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var IsClusterWriter: js.UndefOr[Boolean]
    var DBClusterParameterGroupStatus: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
  }

  object DBClusterMember {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      IsClusterWriter: js.UndefOr[Boolean] = js.undefined,
      DBClusterParameterGroupStatus: js.UndefOr[String] = js.undefined,
      PromotionTier: js.UndefOr[IntegerOptional] = js.undefined): DBClusterMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "IsClusterWriter" -> IsClusterWriter.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupStatus" -> DBClusterParameterGroupStatus.map { x => x.asInstanceOf[js.Any] },
        "PromotionTier" -> PromotionTier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterMember]
    }
  }

  /**
   * <p>Contains the result of a successful invocation of the <a>DescribeDBClusters</a> action.</p>
   */
  @js.native
  trait DBClusterMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBClusters: js.UndefOr[DBClusterList]
  }

  object DBClusterMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBClusters: js.UndefOr[DBClusterList] = js.undefined): DBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBClusters" -> DBClusters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterMessage]
    }
  }

  /**
   * <p>Contains status information for a DB cluster option group.</p>
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
   * <p>Contains the details of an Amazon RDS DB cluster parameter group. </p> <p>This data type is used as a response element in the <a>DescribeDBClusterParameterGroups</a> action. </p>
   */
  @js.native
  trait DBClusterParameterGroup extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DBClusterParameterGroupArn: js.UndefOr[String]
  }

  object DBClusterParameterGroup {
    def apply(
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DBClusterParameterGroupArn: js.UndefOr[String] = js.undefined): DBClusterParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupArn" -> DBClusterParameterGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterParameterGroup]
    }
  }

  /**
   * <p>Provides details about a DB cluster parameter group including the parameters in the DB cluster parameter group.</p>
   */
  @js.native
  trait DBClusterParameterGroupDetails extends js.Object {
    var Parameters: js.UndefOr[ParametersList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterParameterGroupDetails {
    def apply(
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBClusterParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p/>
   */
  @js.native
  trait DBClusterParameterGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList]
  }

  object DBClusterParameterGroupsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.undefined): DBClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroups" -> DBClusterParameterGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterParameterGroupsMessage]
    }
  }

  /**
   * <p>Describes an AWS Identity and Access Management (IAM) role that is associated with a DB cluster.</p>
   */
  @js.native
  trait DBClusterRole extends js.Object {
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var FeatureName: js.UndefOr[String]
  }

  object DBClusterRole {
    def apply(
      RoleArn: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      FeatureName: js.UndefOr[String] = js.undefined): DBClusterRole = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "FeatureName" -> FeatureName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterRole]
    }
  }

  /**
   * <p>Contains the details for an Amazon RDS DB cluster snapshot </p> <p>This data type is used as a response element in the <a>DescribeDBClusterSnapshots</a> action. </p>
   */
  @js.native
  trait DBClusterSnapshot extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var PercentProgress: js.UndefOr[Int]
    var KmsKeyId: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[Int]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
    var SourceDBClusterSnapshotArn: js.UndefOr[String]
    var SnapshotCreateTime: js.UndefOr[TStamp]
    var SnapshotType: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var Port: js.UndefOr[Int]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var LicenseModel: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[Boolean]
    var DBClusterSnapshotArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var VpcId: js.UndefOr[String]
  }

  object DBClusterSnapshot {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      PercentProgress: js.UndefOr[Int] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[Int] = js.undefined,
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SourceDBClusterSnapshotArn: js.UndefOr[String] = js.undefined,
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
      Port: js.UndefOr[Int] = js.undefined,
      ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
      DBClusterSnapshotArn: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DBClusterSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "PercentProgress" -> PercentProgress.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SourceDBClusterSnapshotArn" -> SourceDBClusterSnapshotArn.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x => x.asInstanceOf[js.Any] },
        "SnapshotType" -> SnapshotType.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "ClusterCreateTime" -> ClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshotArn" -> DBClusterSnapshotArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshot]
    }
  }

  /**
   * <p>Contains the name and values of a manual DB cluster snapshot attribute.</p> <p>Manual DB cluster snapshot attributes are used to authorize other AWS accounts to restore a manual DB cluster snapshot. For more information, see the <a>ModifyDBClusterSnapshotAttribute</a> API action.</p>
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
   * <p>Contains the results of a successful call to the <a>DescribeDBClusterSnapshotAttributes</a> API action.</p> <p>Manual DB cluster snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB cluster snapshot. For more information, see the <a>ModifyDBClusterSnapshotAttribute</a> API action.</p>
   */
  @js.native
  trait DBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
    var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList]
  }

  object DBClusterSnapshotAttributesResult {
    def apply(
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined): DBClusterSnapshotAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshotAttributes" -> DBClusterSnapshotAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshotAttributesResult]
    }
  }

  /**
   * <p> Provides a list of DB cluster snapshots for the user as the result of a call to the <a>DescribeDBClusterSnapshots</a> action. </p>
   */
  @js.native
  trait DBClusterSnapshotMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList]
  }

  object DBClusterSnapshotMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined): DBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshots" -> DBClusterSnapshots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshotMessage]
    }
  }

  /**
   * <p> This data type is used as a response element in the action <a>DescribeDBEngineVersions</a>. </p>
   */
  @js.native
  trait DBEngineVersion extends js.Object {
    var DefaultCharacterSet: js.UndefOr[CharacterSet]
    var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean]
    var Engine: js.UndefOr[String]
    var DBEngineVersionDescription: js.UndefOr[String]
    var SupportedTimezones: js.UndefOr[SupportedTimezonesList]
    var DBEngineDescription: js.UndefOr[String]
    var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList]
    var DBParameterGroupFamily: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var SupportsReadReplica: js.UndefOr[Boolean]
    var ExportableLogTypes: js.UndefOr[LogTypeList]
    var SupportedEngineModes: js.UndefOr[EngineModeList]
    var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList]
  }

  object DBEngineVersion {
    def apply(
      DefaultCharacterSet: js.UndefOr[CharacterSet] = js.undefined,
      SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      DBEngineVersionDescription: js.UndefOr[String] = js.undefined,
      SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.undefined,
      DBEngineDescription: js.UndefOr[String] = js.undefined,
      ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      SupportsReadReplica: js.UndefOr[Boolean] = js.undefined,
      ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
      SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined,
      SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined): DBEngineVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultCharacterSet" -> DefaultCharacterSet.map { x => x.asInstanceOf[js.Any] },
        "SupportsLogExportsToCloudwatchLogs" -> SupportsLogExportsToCloudwatchLogs.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "DBEngineVersionDescription" -> DBEngineVersionDescription.map { x => x.asInstanceOf[js.Any] },
        "SupportedTimezones" -> SupportedTimezones.map { x => x.asInstanceOf[js.Any] },
        "DBEngineDescription" -> DBEngineDescription.map { x => x.asInstanceOf[js.Any] },
        "ValidUpgradeTarget" -> ValidUpgradeTarget.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "SupportsReadReplica" -> SupportsReadReplica.map { x => x.asInstanceOf[js.Any] },
        "ExportableLogTypes" -> ExportableLogTypes.map { x => x.asInstanceOf[js.Any] },
        "SupportedEngineModes" -> SupportedEngineModes.map { x => x.asInstanceOf[js.Any] },
        "SupportedCharacterSets" -> SupportedCharacterSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBEngineVersion]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBEngineVersions</a> action. </p>
   */
  @js.native
  trait DBEngineVersionMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBEngineVersions: js.UndefOr[DBEngineVersionList]
  }

  object DBEngineVersionMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined): DBEngineVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBEngineVersions" -> DBEngineVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBEngineVersionMessage]
    }
  }

  /**
   * <p>Contains the details of an Amazon RDS DB instance. </p> <p>This data type is used as a response element in the <a>DescribeDBInstances</a> action. </p>
   */
  @js.native
  trait DBInstance extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var DomainMemberships: js.UndefOr[DomainMembershipList]
    var DBInstanceArn: js.UndefOr[String]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var DBClusterIdentifier: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
    var Timezone: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList]
    var MultiAZ: js.UndefOr[Boolean]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList]
    var DBName: js.UndefOr[String]
    var DbiResourceId: js.UndefOr[String]
    var StatusInfos: js.UndefOr[DBInstanceStatusInfoList]
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
    var Endpoint: js.UndefOr[Endpoint]
    var ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList]
    var MonitoringRoleArn: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[Int]
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList]
    var DBInstanceIdentifier: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[Int]
    var MasterUsername: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var CopyTagsToSnapshot: js.UndefOr[Boolean]
    var EngineVersion: js.UndefOr[String]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var PreferredBackupWindow: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var DBInstanceStatus: js.UndefOr[String]
    var StorageType: js.UndefOr[String]
    var LatestRestorableTime: js.UndefOr[TStamp]
    var ListenerEndpoint: js.UndefOr[Endpoint]
    var DeletionProtection: js.UndefOr[Boolean]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var SecondaryAvailabilityZone: js.UndefOr[String]
    var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String]
    var DBParameterGroups: js.UndefOr[DBParameterGroupStatusList]
    var DbInstancePort: js.UndefOr[Int]
    var CACertificateIdentifier: js.UndefOr[String]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional]
    var LicenseModel: js.UndefOr[String]
    var EnhancedMonitoringResourceArn: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[Boolean]
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object DBInstance {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
      DomainMemberships: js.UndefOr[DomainMembershipList] = js.undefined,
      DBInstanceArn: js.UndefOr[String] = js.undefined,
      PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      Timezone: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      DbiResourceId: js.UndefOr[String] = js.undefined,
      StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined,
      DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList] = js.undefined,
      MonitoringRoleArn: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[Int] = js.undefined,
      PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[Int] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
      IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      DBInstanceStatus: js.UndefOr[String] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      LatestRestorableTime: js.UndefOr[TStamp] = js.undefined,
      ListenerEndpoint: js.UndefOr[Endpoint] = js.undefined,
      DeletionProtection: js.UndefOr[Boolean] = js.undefined,
      PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
      SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined,
      ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.undefined,
      DbInstancePort: js.UndefOr[Int] = js.undefined,
      CACertificateIdentifier: js.UndefOr[String] = js.undefined,
      PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
      PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      EnhancedMonitoringResourceArn: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
      PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined): DBInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "MonitoringInterval" -> MonitoringInterval.map { x => x.asInstanceOf[js.Any] },
        "DomainMemberships" -> DomainMemberships.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceArn" -> DBInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "PromotionTier" -> PromotionTier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaDBInstanceIdentifiers" -> ReadReplicaDBInstanceIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroups" -> DBSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "DbiResourceId" -> DbiResourceId.map { x => x.asInstanceOf[js.Any] },
        "StatusInfos" -> StatusInfos.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroup" -> DBSubnetGroup.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaDBClusterIdentifiers" -> ReadReplicaDBClusterIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "PendingModifiedValues" -> PendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupMemberships" -> OptionGroupMemberships.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "EnabledCloudwatchLogsExports" -> EnabledCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceCreateTime" -> InstanceCreateTime.map { x => x.asInstanceOf[js.Any] },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceStatus" -> DBInstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "LatestRestorableTime" -> LatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "ListenerEndpoint" -> ListenerEndpoint.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "SecondaryAvailabilityZone" -> SecondaryAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaSourceDBInstanceIdentifier" -> ReadReplicaSourceDBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroups" -> DBParameterGroups.map { x => x.asInstanceOf[js.Any] },
        "DbInstancePort" -> DbInstancePort.map { x => x.asInstanceOf[js.Any] },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsEnabled" -> PerformanceInsightsEnabled.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "EnhancedMonitoringResourceArn" -> EnhancedMonitoringResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstance]
    }
  }

  /**
   * <p>An automated backup of a DB instance. It it consists of system backups, transaction logs, and the database instance properties that existed at the time you deleted the source instance. </p>
   */
  @js.native
  trait DBInstanceAutomatedBackup extends js.Object {
    var DBInstanceArn: js.UndefOr[String]
    var Timezone: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var DbiResourceId: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[Int]
    var RestoreWindow: js.UndefOr[RestoreWindow]
    var DBInstanceIdentifier: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var EngineVersion: js.UndefOr[String]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var Port: js.UndefOr[Int]
    var Iops: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DBInstanceAutomatedBackup {
    def apply(
      DBInstanceArn: js.UndefOr[String] = js.undefined,
      Timezone: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      DbiResourceId: js.UndefOr[String] = js.undefined,
      Region: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[Int] = js.undefined,
      RestoreWindow: js.UndefOr[RestoreWindow] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
      IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
      Port: js.UndefOr[Int] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DBInstanceAutomatedBackup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceArn" -> DBInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "DbiResourceId" -> DbiResourceId.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "RestoreWindow" -> RestoreWindow.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceCreateTime" -> InstanceCreateTime.map { x => x.asInstanceOf[js.Any] },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceAutomatedBackup]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBInstanceAutomatedBackups</a> action. </p>
   */
  @js.native
  trait DBInstanceAutomatedBackupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList]
  }

  object DBInstanceAutomatedBackupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList] = js.undefined): DBInstanceAutomatedBackupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceAutomatedBackups" -> DBInstanceAutomatedBackups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceAutomatedBackupMessage]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBInstances</a> action. </p>
   */
  @js.native
  trait DBInstanceMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBInstances: js.UndefOr[DBInstanceList]
  }

  object DBInstanceMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBInstances: js.UndefOr[DBInstanceList] = js.undefined): DBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBInstances" -> DBInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceMessage]
    }
  }

  /**
   * <p>Provides a list of status information for a DB instance.</p>
   */
  @js.native
  trait DBInstanceStatusInfo extends js.Object {
    var StatusType: js.UndefOr[String]
    var Normal: js.UndefOr[Boolean]
    var Status: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object DBInstanceStatusInfo {
    def apply(
      StatusType: js.UndefOr[String] = js.undefined,
      Normal: js.UndefOr[Boolean] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): DBInstanceStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusType" -> StatusType.map { x => x.asInstanceOf[js.Any] },
        "Normal" -> Normal.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceStatusInfo]
    }
  }

  /**
   * <p>Contains the details of an Amazon RDS DB parameter group. </p> <p>This data type is used as a response element in the <a>DescribeDBParameterGroups</a> action. </p>
   */
  @js.native
  trait DBParameterGroup extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DBParameterGroupArn: js.UndefOr[String]
  }

  object DBParameterGroup {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DBParameterGroupArn: js.UndefOr[String] = js.undefined): DBParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupArn" -> DBParameterGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroup]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBParameters</a> action. </p>
   */
  @js.native
  trait DBParameterGroupDetails extends js.Object {
    var Parameters: js.UndefOr[ParametersList]
    var Marker: js.UndefOr[String]
  }

  object DBParameterGroupDetails {
    def apply(
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DBParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupDetails]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>ModifyDBParameterGroup</a> or <a>ResetDBParameterGroup</a> action. </p>
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
   * <p>The status of the DB parameter group.</p> <p>This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>CreateDBInstance</a> </p> </li> <li> <p> <a>CreateDBInstanceReadReplica</a> </p> </li> <li> <p> <a>DeleteDBInstance</a> </p> </li> <li> <p> <a>ModifyDBInstance</a> </p> </li> <li> <p> <a>RebootDBInstance</a> </p> </li> <li> <p> <a>RestoreDBInstanceFromDBSnapshot</a> </p> </li> </ul>
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
   * <p> Contains the result of a successful invocation of the <a>DescribeDBParameterGroups</a> action. </p>
   */
  @js.native
  trait DBParameterGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBParameterGroups: js.UndefOr[DBParameterGroupList]
  }

  object DBParameterGroupsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.undefined): DBParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroups" -> DBParameterGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupsMessage]
    }
  }

  /**
   * <p>Contains the details for an Amazon RDS DB security group. </p> <p>This data type is used as a response element in the <a>DescribeDBSecurityGroups</a> action. </p>
   */
  @js.native
  trait DBSecurityGroup extends js.Object {
    var DBSecurityGroupDescription: js.UndefOr[String]
    var IPRanges: js.UndefOr[IPRangeList]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var OwnerId: js.UndefOr[String]
    var DBSecurityGroupName: js.UndefOr[String]
    var DBSecurityGroupArn: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DBSecurityGroup {
    def apply(
      DBSecurityGroupDescription: js.UndefOr[String] = js.undefined,
      IPRanges: js.UndefOr[IPRangeList] = js.undefined,
      EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      DBSecurityGroupArn: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DBSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupDescription" -> DBSecurityGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "IPRanges" -> IPRanges.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroups" -> EC2SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroupArn" -> DBSecurityGroupArn.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroup]
    }
  }

  /**
   * <p>This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>ModifyDBInstance</a> </p> </li> <li> <p> <a>RebootDBInstance</a> </p> </li> <li> <p> <a>RestoreDBInstanceFromDBSnapshot</a> </p> </li> <li> <p> <a>RestoreDBInstanceToPointInTime</a> </p> </li> </ul>
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
   * <p> Contains the result of a successful invocation of the <a>DescribeDBSecurityGroups</a> action. </p>
   */
  @js.native
  trait DBSecurityGroupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroups]
  }

  object DBSecurityGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroups] = js.undefined): DBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroups" -> DBSecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroupMessage]
    }
  }

  /**
   * <p>Contains the details of an Amazon RDS DB snapshot. </p> <p>This data type is used as a response element in the <a>DescribeDBSnapshots</a> action. </p>
   */
  @js.native
  trait DBSnapshot extends js.Object {
    var SourceRegion: js.UndefOr[String]
    var Timezone: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var DbiResourceId: js.UndefOr[String]
    var PercentProgress: js.UndefOr[Int]
    var DBSnapshotArn: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[Int]
    var SourceDBSnapshotIdentifier: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var DBInstanceIdentifier: js.UndefOr[String]
    var SnapshotCreateTime: js.UndefOr[TStamp]
    var SnapshotType: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var EngineVersion: js.UndefOr[String]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var Port: js.UndefOr[Int]
    var Iops: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var DBSnapshotIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DBSnapshot {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      Timezone: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      DbiResourceId: js.UndefOr[String] = js.undefined,
      PercentProgress: js.UndefOr[Int] = js.undefined,
      DBSnapshotArn: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[Int] = js.undefined,
      SourceDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
      IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
      Port: js.UndefOr[Int] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DBSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "DbiResourceId" -> DbiResourceId.map { x => x.asInstanceOf[js.Any] },
        "PercentProgress" -> PercentProgress.map { x => x.asInstanceOf[js.Any] },
        "DBSnapshotArn" -> DBSnapshotArn.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "SourceDBSnapshotIdentifier" -> SourceDBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x => x.asInstanceOf[js.Any] },
        "SnapshotType" -> SnapshotType.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceCreateTime" -> InstanceCreateTime.map { x => x.asInstanceOf[js.Any] },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshot]
    }
  }

  /**
   * <p>Contains the name and values of a manual DB snapshot attribute</p> <p>Manual DB snapshot attributes are used to authorize other AWS accounts to restore a manual DB snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a> API.</p>
   */
  @js.native
  trait DBSnapshotAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  object DBSnapshotAttribute {
    def apply(
      AttributeName: js.UndefOr[String] = js.undefined,
      AttributeValues: js.UndefOr[AttributeValueList] = js.undefined): DBSnapshotAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeValues" -> AttributeValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshotAttribute]
    }
  }

  /**
   * <p>Contains the results of a successful call to the <a>DescribeDBSnapshotAttributes</a> API action.</p> <p>Manual DB snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a> API action.</p>
   */
  @js.native
  trait DBSnapshotAttributesResult extends js.Object {
    var DBSnapshotIdentifier: js.UndefOr[String]
    var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList]
  }

  object DBSnapshotAttributesResult {
    def apply(
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList] = js.undefined): DBSnapshotAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBSnapshotAttributes" -> DBSnapshotAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshotAttributesResult]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBSnapshots</a> action. </p>
   */
  @js.native
  trait DBSnapshotMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBSnapshots: js.UndefOr[DBSnapshotList]
  }

  object DBSnapshotMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBSnapshots: js.UndefOr[DBSnapshotList] = js.undefined): DBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBSnapshots" -> DBSnapshots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshotMessage]
    }
  }

  /**
   * <p>Contains the details of an Amazon RDS DB subnet group. </p> <p>This data type is used as a response element in the <a>DescribeDBSubnetGroups</a> action. </p>
   */
  @js.native
  trait DBSubnetGroup extends js.Object {
    var DBSubnetGroupDescription: js.UndefOr[String]
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var DBSubnetGroupName: js.UndefOr[String]
    var DBSubnetGroupArn: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DBSubnetGroup {
    def apply(
      DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetGroupStatus: js.UndefOr[String] = js.undefined,
      Subnets: js.UndefOr[SubnetList] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      DBSubnetGroupArn: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): DBSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SubnetGroupStatus" -> SubnetGroupStatus.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupArn" -> DBSubnetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSubnetGroup]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBSubnetGroups</a> action. </p>
   */
  @js.native
  trait DBSubnetGroupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var DBSubnetGroups: js.UndefOr[DBSubnetGroups]
  }

  object DBSubnetGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBSubnetGroups: js.UndefOr[DBSubnetGroups] = js.undefined): DBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroups" -> DBSubnetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSubnetGroupMessage]
    }
  }

  @js.native
  trait DeleteDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: js.UndefOr[String]
  }

  object DeleteDBClusterEndpointMessage {
    def apply(
      DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined): DeleteDBClusterEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterEndpointMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
  }

  object DeleteDBClusterMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined,
      FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined): DeleteDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SkipFinalSnapshot" -> SkipFinalSnapshot.map { x => x.asInstanceOf[js.Any] },
        "FinalDBSnapshotIdentifier" -> FinalDBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
  }

  object DeleteDBClusterParameterGroupMessage {
    def apply(
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined): DeleteDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
  }

  object DeleteDBClusterSnapshotMessage {
    def apply(
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined): DeleteDBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation. </p>
   */
  @js.native
  trait DeleteDBInstanceAutomatedBackupMessage extends js.Object {
    var DbiResourceId: js.UndefOr[String]
  }

  object DeleteDBInstanceAutomatedBackupMessage {
    def apply(
      DbiResourceId: js.UndefOr[String] = js.undefined): DeleteDBInstanceAutomatedBackupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DbiResourceId" -> DbiResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceAutomatedBackupMessage]
    }
  }

  @js.native
  trait DeleteDBInstanceAutomatedBackupResult extends js.Object {
    var DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup]
  }

  object DeleteDBInstanceAutomatedBackupResult {
    def apply(
      DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup] = js.undefined): DeleteDBInstanceAutomatedBackupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceAutomatedBackup" -> DBInstanceAutomatedBackup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceAutomatedBackupResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var DeleteAutomatedBackups: js.UndefOr[BooleanOptional]
  }

  object DeleteDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined,
      FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      DeleteAutomatedBackups: js.UndefOr[BooleanOptional] = js.undefined): DeleteDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SkipFinalSnapshot" -> SkipFinalSnapshot.map { x => x.asInstanceOf[js.Any] },
        "FinalDBSnapshotIdentifier" -> FinalDBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DeleteAutomatedBackups" -> DeleteAutomatedBackups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DBParameterGroupName: js.UndefOr[String]
  }

  object DeleteDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined): DeleteDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBParameterGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBSecurityGroupMessage extends js.Object {
    var DBSecurityGroupName: js.UndefOr[String]
  }

  object DeleteDBSecurityGroupMessage {
    def apply(
      DBSecurityGroupName: js.UndefOr[String] = js.undefined): DeleteDBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSecurityGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  object DeleteDBSnapshotMessage {
    def apply(
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined): DeleteDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSnapshotMessage]
    }
  }

  @js.native
  trait DeleteDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object DeleteDBSnapshotResult {
    def apply(
      DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined): DeleteDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshot" -> DBSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: js.UndefOr[String]
  }

  object DeleteDBSubnetGroupMessage {
    def apply(
      DBSubnetGroupName: js.UndefOr[String] = js.undefined): DeleteDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSubnetGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: js.UndefOr[String]
  }

  object DeleteEventSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined): DeleteEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
  trait DeleteOptionGroupMessage extends js.Object {
    var OptionGroupName: js.UndefOr[String]
  }

  object DeleteOptionGroupMessage {
    def apply(
      OptionGroupName: js.UndefOr[String] = js.undefined): DeleteOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOptionGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {

  }

  object DescribeAccountAttributesMessage {
    def apply(): DescribeAccountAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeCertificatesMessage extends js.Object {
    var CertificateIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeCertificatesMessage {
    def apply(
      CertificateIdentifier: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeCertificatesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateIdentifier" -> CertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificatesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBClusterBacktracksMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Filters: js.UndefOr[FilterList]
    var BacktrackIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBClusterBacktracksMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      BacktrackIdentifier: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBClusterBacktracksMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "BacktrackIdentifier" -> BacktrackIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterBacktracksMessage]
    }
  }

  @js.native
  trait DescribeDBClusterEndpointsMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterEndpointIdentifier: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBClusterEndpointsMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBClusterEndpointsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterEndpointsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBClusterParameterGroupsMessage {
    def apply(
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterParameterGroupsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBClusterParametersMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBClusterParametersMessage {
    def apply(
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterParametersMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBClusterSnapshotAttributesMessage extends js.Object {
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
  }

  object DescribeDBClusterSnapshotAttributesMessage {
    def apply(
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined): DescribeDBClusterSnapshotAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IncludeShared: js.UndefOr[Boolean]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
    var SnapshotType: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var IncludePublic: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBClusterSnapshotsMessage {
    def apply(
      IncludeShared: js.UndefOr[Boolean] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      IncludePublic: js.UndefOr[Boolean] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBClusterSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IncludeShared" -> IncludeShared.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotType" -> SnapshotType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "IncludePublic" -> IncludePublic.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBClustersMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClustersMessage]
    }
  }

  @js.native
  trait DescribeDBEngineVersionsMessage extends js.Object {
    var Engine: js.UndefOr[String]
    var DefaultOnly: js.UndefOr[Boolean]
    var ListSupportedTimezones: js.UndefOr[BooleanOptional]
    var DBParameterGroupFamily: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ListSupportedCharacterSets: js.UndefOr[BooleanOptional]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBEngineVersionsMessage {
    def apply(
      Engine: js.UndefOr[String] = js.undefined,
      DefaultOnly: js.UndefOr[Boolean] = js.undefined,
      ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBEngineVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "DefaultOnly" -> DefaultOnly.map { x => x.asInstanceOf[js.Any] },
        "ListSupportedTimezones" -> ListSupportedTimezones.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ListSupportedCharacterSets" -> ListSupportedCharacterSets.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBEngineVersionsMessage]
    }
  }

  /**
   * <p>Parameter input for DescribeDBInstanceAutomatedBackups. </p>
   */
  @js.native
  trait DescribeDBInstanceAutomatedBackupsMessage extends js.Object {
    var DbiResourceId: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBInstanceAutomatedBackupsMessage {
    def apply(
      DbiResourceId: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBInstanceAutomatedBackupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DbiResourceId" -> DbiResourceId.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBInstanceAutomatedBackupsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBInstancesMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBInstancesMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBInstancesMessage]
    }
  }

  /**
   * <p>This data type is used as a response element to <a>DescribeDBLogFiles</a>.</p>
   */
  @js.native
  trait DescribeDBLogFilesDetails extends js.Object {
    var LogFileName: js.UndefOr[String]
    var LastWritten: js.UndefOr[Double]
    var Size: js.UndefOr[Double]
  }

  object DescribeDBLogFilesDetails {
    def apply(
      LogFileName: js.UndefOr[String] = js.undefined,
      LastWritten: js.UndefOr[Double] = js.undefined,
      Size: js.UndefOr[Double] = js.undefined): DescribeDBLogFilesDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogFileName" -> LogFileName.map { x => x.asInstanceOf[js.Any] },
        "LastWritten" -> LastWritten.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBLogFilesDetails]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBLogFilesMessage extends js.Object {
    var FileSize: js.UndefOr[Double]
    var FilenameContains: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var FileLastWritten: js.UndefOr[Double]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBLogFilesMessage {
    def apply(
      FileSize: js.UndefOr[Double] = js.undefined,
      FilenameContains: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      FileLastWritten: js.UndefOr[Double] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBLogFilesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSize" -> FileSize.map { x => x.asInstanceOf[js.Any] },
        "FilenameContains" -> FilenameContains.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "FileLastWritten" -> FileLastWritten.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBLogFilesMessage]
    }
  }

  /**
   * <p> The response from a call to <a>DescribeDBLogFiles</a>. </p>
   */
  @js.native
  trait DescribeDBLogFilesResponse extends js.Object {
    var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBLogFilesResponse {
    def apply(
      DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBLogFilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DescribeDBLogFiles" -> DescribeDBLogFiles.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBLogFilesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBParameterGroupsMessage extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBParameterGroupsMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBParameterGroupsMessage]
    }
  }

  @js.native
  trait DescribeDBParametersMessage extends js.Object {
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var DBParameterGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBParametersMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBParametersMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBSecurityGroupsMessage extends js.Object {
    var DBSecurityGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBSecurityGroupsMessage {
    def apply(
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSecurityGroupsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBSnapshotAttributesMessage extends js.Object {
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  object DescribeDBSnapshotAttributesMessage {
    def apply(
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined): DescribeDBSnapshotAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSnapshotAttributesMessage]
    }
  }

  @js.native
  trait DescribeDBSnapshotAttributesResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult]
  }

  object DescribeDBSnapshotAttributesResult {
    def apply(
      DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined): DescribeDBSnapshotAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotAttributesResult" -> DBSnapshotAttributesResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSnapshotAttributesResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBSnapshotsMessage extends js.Object {
    var IncludeShared: js.UndefOr[Boolean]
    var DbiResourceId: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var SnapshotType: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var IncludePublic: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var DBSnapshotIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBSnapshotsMessage {
    def apply(
      IncludeShared: js.UndefOr[Boolean] = js.undefined,
      DbiResourceId: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      IncludePublic: js.UndefOr[Boolean] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IncludeShared" -> IncludeShared.map { x => x.asInstanceOf[js.Any] },
        "DbiResourceId" -> DbiResourceId.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SnapshotType" -> SnapshotType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "IncludePublic" -> IncludePublic.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSnapshotsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeDBSubnetGroupsMessage extends js.Object {
    var DBSubnetGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBSubnetGroupsMessage {
    def apply(
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeDBSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSubnetGroupsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEngineDefaultClusterParametersMessage extends js.Object {
    var DBParameterGroupFamily: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeEngineDefaultClusterParametersMessage {
    def apply(
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEngineDefaultClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DBParameterGroupFamily: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeEngineDefaultParametersMessage {
    def apply(
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEngineDefaultParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var SourceType: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
  }

  object DescribeEventCategoriesMessage {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined): DescribeEventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var SubscriptionName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventsMessage extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var EndTime: js.UndefOr[TStamp]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[SourceType]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventsMessage {
    def apply(
      Duration: js.UndefOr[IntegerOptional] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeOptionGroupOptionsMessage extends js.Object {
    var MajorEngineVersion: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeOptionGroupOptionsMessage {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeOptionGroupOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MajorEngineVersion" -> MajorEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOptionGroupOptionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeOptionGroupsMessage extends js.Object {
    var MajorEngineVersion: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeOptionGroupsMessage {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeOptionGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MajorEngineVersion" -> MajorEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOptionGroupsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeOrderableDBInstanceOptionsMessage extends js.Object {
    var DBInstanceClass: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Vpc: js.UndefOr[BooleanOptional]
    var Filters: js.UndefOr[FilterList]
    var LicenseModel: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeOrderableDBInstanceOptionsMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Vpc: js.UndefOr[BooleanOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeOrderableDBInstanceOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Vpc" -> Vpc.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    var ResourceIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribePendingMaintenanceActionsMessage {
    def apply(
      ResourceIdentifier: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribePendingMaintenanceActionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIdentifier" -> ResourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePendingMaintenanceActionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReservedDBInstancesMessage extends js.Object {
    var DBInstanceClass: js.UndefOr[String]
    var Duration: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OfferingType: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
    var ReservedDBInstanceId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var ProductDescription: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeReservedDBInstancesMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReservedDBInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstanceId" -> ReservedDBInstanceId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedDBInstancesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReservedDBInstancesOfferingsMessage extends js.Object {
    var DBInstanceClass: js.UndefOr[String]
    var Duration: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OfferingType: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var ProductDescription: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeReservedDBInstancesOfferingsMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReservedDBInstancesOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedDBInstancesOfferingsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeSourceRegionsMessage extends js.Object {
    var RegionName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
  }

  object DescribeSourceRegionsMessage {
    def apply(
      RegionName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined): DescribeSourceRegionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSourceRegionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeValidDBInstanceModificationsMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
  }

  object DescribeValidDBInstanceModificationsMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined): DescribeValidDBInstanceModificationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>An Active Directory Domain membership record associated with the DB instance.</p>
   */
  @js.native
  trait DomainMembership extends js.Object {
    var Domain: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var FQDN: js.UndefOr[String]
    var IAMRoleName: js.UndefOr[String]
  }

  object DomainMembership {
    def apply(
      Domain: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      FQDN: js.UndefOr[String] = js.undefined,
      IAMRoleName: js.UndefOr[String] = js.undefined): DomainMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "FQDN" -> FQDN.map { x => x.asInstanceOf[js.Any] },
        "IAMRoleName" -> IAMRoleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainMembership]
    }
  }

  /**
   * <p>A range of double values.</p>
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
   * <p>This data type is used as a response element to <a>DownloadDBLogFilePortion</a>.</p>
   */
  @js.native
  trait DownloadDBLogFilePortionDetails extends js.Object {
    var LogFileData: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var AdditionalDataPending: js.UndefOr[Boolean]
  }

  object DownloadDBLogFilePortionDetails {
    def apply(
      LogFileData: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      AdditionalDataPending: js.UndefOr[Boolean] = js.undefined): DownloadDBLogFilePortionDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogFileData" -> LogFileData.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "AdditionalDataPending" -> AdditionalDataPending.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDBLogFilePortionDetails]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DownloadDBLogFilePortionMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var LogFileName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var NumberOfLines: js.UndefOr[Int]
  }

  object DownloadDBLogFilePortionMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      LogFileName: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      NumberOfLines: js.UndefOr[Int] = js.undefined): DownloadDBLogFilePortionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "LogFileName" -> LogFileName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "NumberOfLines" -> NumberOfLines.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDBLogFilePortionMessage]
    }
  }

  /**
   * <p>This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>AuthorizeDBSecurityGroupIngress</a> </p> </li> <li> <p> <a>DescribeDBSecurityGroups</a> </p> </li> <li> <p> <a>RevokeDBSecurityGroupIngress</a> </p> </li> </ul>
   */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var Status: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object EC2SecurityGroup {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupId" -> EC2SecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
   * <p>This data type represents the information you need to connect to an Amazon RDS DB instance. This data type is used as a response element in the following actions:</p> <ul> <li> <p> <a>CreateDBInstance</a> </p> </li> <li> <p> <a>DescribeDBInstances</a> </p> </li> <li> <p> <a>DeleteDBInstance</a> </p> </li> </ul> <p>For the data structure that represents Amazon Aurora DB cluster endpoints, see <a>DBClusterEndpoint</a>.</p>
   */
  @js.native
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[Int]
    var HostedZoneId: js.UndefOr[String]
  }

  object Endpoint {
    def apply(
      Address: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[Int] = js.undefined,
      HostedZoneId: js.UndefOr[String] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeEngineDefaultParameters</a> action. </p>
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
   * <p> This data type is used as a response element in the <a>DescribeEvents</a> action. </p>
   */
  @js.native
  trait Event extends js.Object {
    var SourceIdentifier: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Message: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var Date: js.UndefOr[TStamp]
    var SourceArn: js.UndefOr[String]
  }

  object Event {
    def apply(
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Date: js.UndefOr[TStamp] = js.undefined,
      SourceArn: js.UndefOr[String] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p>Contains the results of a successful invocation of the <a>DescribeEventCategories</a> action.</p>
   */
  @js.native
  trait EventCategoriesMap extends js.Object {
    var SourceType: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
  }

  object EventCategoriesMap {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined): EventCategoriesMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMap]
    }
  }

  /**
   * <p>Data returned from the <b>DescribeEventCategories</b> action.</p>
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
   * <p>Contains the results of a successful invocation of the <a>DescribeEventSubscriptions</a> action.</p>
   */
  @js.native
  trait EventSubscription extends js.Object {
    var CustomerAwsId: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var CustSubscriptionId: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var EventSubscriptionArn: js.UndefOr[String]
    var SourceType: js.UndefOr[String]
    var EventCategoriesList: js.UndefOr[EventCategoriesList]
    var SourceIdsList: js.UndefOr[SourceIdsList]
    var SubscriptionCreationTime: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object EventSubscription {
    def apply(
      CustomerAwsId: js.UndefOr[String] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined,
      CustSubscriptionId: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventSubscriptionArn: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionCreationTime: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): EventSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerAwsId" -> CustomerAwsId.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "CustSubscriptionId" -> CustSubscriptionId.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "EventSubscriptionArn" -> EventSubscriptionArn.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "EventCategoriesList" -> EventCategoriesList.map { x => x.asInstanceOf[js.Any] },
        "SourceIdsList" -> SourceIdsList.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionCreationTime" -> SubscriptionCreationTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
    }
  }

  /**
   * <p>Data returned by the <b>DescribeEventSubscriptions</b> action.</p>
   */
  @js.native
  trait EventSubscriptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
  }

  object EventSubscriptionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined): EventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "EventSubscriptionsList" -> EventSubscriptionsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscriptionsMessage]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeEvents</a> action. </p>
   */
  @js.native
  trait EventsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Events: js.UndefOr[EventList]
  }

  object EventsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined): EventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A filter name and value pair that is used to return a more specific list of results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as IDs. The filters supported by a describe operation are documented with the describe operation.</p> <note> <p>Currently, wildcards are not supported in filters.</p> </note> <p>The following actions can be filtered:</p> <ul> <li> <p> <a>DescribeDBClusterBacktracks</a> </p> </li> <li> <p> <a>DescribeDBClusterEndpoints</a> </p> </li> <li> <p> <a>DescribeDBClusters</a> </p> </li> <li> <p> <a>DescribeDBInstances</a> </p> </li> <li> <p> <a>DescribePendingMaintenanceActions</a> </p> </li> </ul>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[String]
    var Values: js.UndefOr[FilterValueList]
  }

  object Filter {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[FilterValueList] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeDBSecurityGroups</a> action. </p>
   */
  @js.native
  trait IPRange extends js.Object {
    var Status: js.UndefOr[String]
    var CIDRIP: js.UndefOr[String]
  }

  object IPRange {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      CIDRIP: js.UndefOr[String] = js.undefined): IPRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CIDRIP" -> CIDRIP.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPRange]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
  }

  object ListTagsForResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined): ListTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
   * <p>The minimum DB engine version required for each corresponding allowed value for an option setting.</p>
   */
  @js.native
  trait MinimumEngineVersionPerAllowedValue extends js.Object {
    var AllowedValue: js.UndefOr[String]
    var MinimumEngineVersion: js.UndefOr[String]
  }

  object MinimumEngineVersionPerAllowedValue {
    def apply(
      AllowedValue: js.UndefOr[String] = js.undefined,
      MinimumEngineVersion: js.UndefOr[String] = js.undefined): MinimumEngineVersionPerAllowedValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValue" -> AllowedValue.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MinimumEngineVersionPerAllowedValue]
    }
  }

  @js.native
  trait ModifyCurrentDBClusterCapacityMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var Capacity: js.UndefOr[IntegerOptional]
    var SecondsBeforeTimeout: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  object ModifyCurrentDBClusterCapacityMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      Capacity: js.UndefOr[IntegerOptional] = js.undefined,
      SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
      TimeoutAction: js.UndefOr[String] = js.undefined): ModifyCurrentDBClusterCapacityMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Capacity" -> Capacity.map { x => x.asInstanceOf[js.Any] },
        "SecondsBeforeTimeout" -> SecondsBeforeTimeout.map { x => x.asInstanceOf[js.Any] },
        "TimeoutAction" -> TimeoutAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCurrentDBClusterCapacityMessage]
    }
  }

  @js.native
  trait ModifyDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: js.UndefOr[String]
    var EndpointType: js.UndefOr[String]
    var StaticMembers: js.UndefOr[StringList]
    var ExcludedMembers: js.UndefOr[StringList]
  }

  object ModifyDBClusterEndpointMessage {
    def apply(
      DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined,
      EndpointType: js.UndefOr[String] = js.undefined,
      StaticMembers: js.UndefOr[StringList] = js.undefined,
      ExcludedMembers: js.UndefOr[StringList] = js.undefined): ModifyDBClusterEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.map { x => x.asInstanceOf[js.Any] },
        "EndpointType" -> EndpointType.map { x => x.asInstanceOf[js.Any] },
        "StaticMembers" -> StaticMembers.map { x => x.asInstanceOf[js.Any] },
        "ExcludedMembers" -> ExcludedMembers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterEndpointMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyDBClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration]
    var DBClusterIdentifier: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var NewDBClusterIdentifier: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var MasterUserPassword: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var ApplyImmediately: js.UndefOr[Boolean]
    var DeletionProtection: js.UndefOr[BooleanOptional]
  }

  object ModifyDBClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      NewDBClusterIdentifier: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined): ModifyDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "CloudwatchLogsExportConfiguration" -> CloudwatchLogsExportConfiguration.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ScalingConfiguration" -> ScalingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "NewDBClusterIdentifier" -> NewDBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "BacktrackWindow" -> BacktrackWindow.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object ModifyDBClusterParameterGroupMessage {
    def apply(
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): ModifyDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
    var AttributeName: js.UndefOr[String]
    var ValuesToAdd: js.UndefOr[AttributeValueList]
    var ValuesToRemove: js.UndefOr[AttributeValueList]
  }

  object ModifyDBClusterSnapshotAttributeMessage {
    def apply(
      DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      AttributeName: js.UndefOr[String] = js.undefined,
      ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined,
      ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined): ModifyDBClusterSnapshotAttributeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
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
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var DBInstanceClass: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean]
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList]
    var MonitoringRoleArn: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var DBPortNumber: js.UndefOr[IntegerOptional]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var DBInstanceIdentifier: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DomainIAMRoleName: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var MasterUserPassword: js.UndefOr[String]
    var NewDBInstanceIdentifier: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var ApplyImmediately: js.UndefOr[Boolean]
    var StorageType: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var CACertificateIdentifier: js.UndefOr[String]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var Domain: js.UndefOr[String]
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object ModifyDBInstanceMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined,
      MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
      PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
      AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
      MonitoringRoleArn: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      DBPortNumber: js.UndefOr[IntegerOptional] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
      DomainIAMRoleName: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      NewDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      CACertificateIdentifier: js.UndefOr[String] = js.undefined,
      PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[String] = js.undefined,
      PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined): ModifyDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "CloudwatchLogsExportConfiguration" -> CloudwatchLogsExportConfiguration.map { x => x.asInstanceOf[js.Any] },
        "MonitoringInterval" -> MonitoringInterval.map { x => x.asInstanceOf[js.Any] },
        "PromotionTier" -> PromotionTier.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x => x.asInstanceOf[js.Any] },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "AllowMajorVersionUpgrade" -> AllowMajorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroups" -> DBSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "DBPortNumber" -> DBPortNumber.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "NewDBInstanceIdentifier" -> NewDBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DBParameterGroupName: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object ModifyDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): ModifyDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBParameterGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyDBSnapshotAttributeMessage extends js.Object {
    var DBSnapshotIdentifier: js.UndefOr[String]
    var AttributeName: js.UndefOr[String]
    var ValuesToAdd: js.UndefOr[AttributeValueList]
    var ValuesToRemove: js.UndefOr[AttributeValueList]
  }

  object ModifyDBSnapshotAttributeMessage {
    def apply(
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      AttributeName: js.UndefOr[String] = js.undefined,
      ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined,
      ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined): ModifyDBSnapshotAttributeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "ValuesToAdd" -> ValuesToAdd.map { x => x.asInstanceOf[js.Any] },
        "ValuesToRemove" -> ValuesToRemove.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSnapshotAttributeMessage]
    }
  }

  @js.native
  trait ModifyDBSnapshotAttributeResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult]
  }

  object ModifyDBSnapshotAttributeResult {
    def apply(
      DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined): ModifyDBSnapshotAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotAttributesResult" -> DBSnapshotAttributesResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSnapshotAttributeResult]
    }
  }

  @js.native
  trait ModifyDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
  }

  object ModifyDBSnapshotMessage {
    def apply(
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined): ModifyDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSnapshotMessage]
    }
  }

  @js.native
  trait ModifyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object ModifyDBSnapshotResult {
    def apply(
      DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined): ModifyDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshot" -> DBSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSnapshotResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: js.UndefOr[String]
    var DBSubnetGroupDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  object ModifyDBSubnetGroupMessage {
    def apply(
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined): ModifyDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Enabled: js.UndefOr[BooleanOptional]
    var SubscriptionName: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  object ModifyEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined): ModifyEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
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
   * <p/>
   */
  @js.native
  trait ModifyOptionGroupMessage extends js.Object {
    var OptionGroupName: js.UndefOr[String]
    var OptionsToInclude: js.UndefOr[OptionConfigurationList]
    var OptionsToRemove: js.UndefOr[OptionNamesList]
    var ApplyImmediately: js.UndefOr[Boolean]
  }

  object ModifyOptionGroupMessage {
    def apply(
      OptionGroupName: js.UndefOr[String] = js.undefined,
      OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.undefined,
      OptionsToRemove: js.UndefOr[OptionNamesList] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined): ModifyOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "OptionsToInclude" -> OptionsToInclude.map { x => x.asInstanceOf[js.Any] },
        "OptionsToRemove" -> OptionsToRemove.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyOptionGroupMessage]
    }
  }

  @js.native
  trait ModifyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object ModifyOptionGroupResult {
    def apply(
      OptionGroup: js.UndefOr[OptionGroup] = js.undefined): ModifyOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroup" -> OptionGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyOptionGroupResult]
    }
  }

  /**
   * <p>Option details.</p>
   */
  @js.native
  trait Option extends js.Object {
    var OptionVersion: js.UndefOr[String]
    var Permanent: js.UndefOr[Boolean]
    var OptionName: js.UndefOr[String]
    var OptionDescription: js.UndefOr[String]
    var OptionSettings: js.UndefOr[OptionSettingConfigurationList]
    var Port: js.UndefOr[IntegerOptional]
    var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList]
    var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList]
    var Persistent: js.UndefOr[Boolean]
  }

  object Option {
    def apply(
      OptionVersion: js.UndefOr[String] = js.undefined,
      Permanent: js.UndefOr[Boolean] = js.undefined,
      OptionName: js.UndefOr[String] = js.undefined,
      OptionDescription: js.UndefOr[String] = js.undefined,
      OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
      DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined,
      Persistent: js.UndefOr[Boolean] = js.undefined): Option = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionVersion" -> OptionVersion.map { x => x.asInstanceOf[js.Any] },
        "Permanent" -> Permanent.map { x => x.asInstanceOf[js.Any] },
        "OptionName" -> OptionName.map { x => x.asInstanceOf[js.Any] },
        "OptionDescription" -> OptionDescription.map { x => x.asInstanceOf[js.Any] },
        "OptionSettings" -> OptionSettings.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupMemberships" -> VpcSecurityGroupMemberships.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroupMemberships" -> DBSecurityGroupMemberships.map { x => x.asInstanceOf[js.Any] },
        "Persistent" -> Persistent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Option]
    }
  }

  /**
   * <p>A list of all available options</p>
   */
  @js.native
  trait OptionConfiguration extends js.Object {
    var OptionVersion: js.UndefOr[String]
    var OptionName: js.UndefOr[String]
    var OptionSettings: js.UndefOr[OptionSettingsList]
    var Port: js.UndefOr[IntegerOptional]
    var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList]
    var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList]
  }

  object OptionConfiguration {
    def apply(
      OptionVersion: js.UndefOr[String] = js.undefined,
      OptionName: js.UndefOr[String] = js.undefined,
      OptionSettings: js.UndefOr[OptionSettingsList] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.undefined): OptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionVersion" -> OptionVersion.map { x => x.asInstanceOf[js.Any] },
        "OptionName" -> OptionName.map { x => x.asInstanceOf[js.Any] },
        "OptionSettings" -> OptionSettings.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupMemberships" -> VpcSecurityGroupMemberships.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroupMemberships" -> DBSecurityGroupMemberships.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionConfiguration]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait OptionGroup extends js.Object {
    var MajorEngineVersion: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var OptionGroupArn: js.UndefOr[String]
    var AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean]
    var Options: js.UndefOr[OptionsList]
    var OptionGroupDescription: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object OptionGroup {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      OptionGroupArn: js.UndefOr[String] = js.undefined,
      AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.undefined,
      Options: js.UndefOr[OptionsList] = js.undefined,
      OptionGroupDescription: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): OptionGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MajorEngineVersion" -> MajorEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupArn" -> OptionGroupArn.map { x => x.asInstanceOf[js.Any] },
        "AllowsVpcAndNonVpcInstanceMemberships" -> AllowsVpcAndNonVpcInstanceMemberships.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupDescription" -> OptionGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroup]
    }
  }

  /**
   * <p>Provides information on the option groups the DB instance is a member of.</p>
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

  /**
   * <p>Available option.</p>
   */
  @js.native
  trait OptionGroupOption extends js.Object {
    var MajorEngineVersion: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var VpcOnly: js.UndefOr[Boolean]
    var Permanent: js.UndefOr[Boolean]
    var OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList]
    var PortRequired: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList]
    var OptionsConflictsWith: js.UndefOr[OptionsConflictsWith]
    var EngineName: js.UndefOr[String]
    var OptionsDependedOn: js.UndefOr[OptionsDependedOn]
    var DefaultPort: js.UndefOr[IntegerOptional]
    var MinimumRequiredMinorEngineVersion: js.UndefOr[String]
    var SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional]
    var Persistent: js.UndefOr[Boolean]
    var RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean]
  }

  object OptionGroupOption {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      VpcOnly: js.UndefOr[Boolean] = js.undefined,
      Permanent: js.UndefOr[Boolean] = js.undefined,
      OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList] = js.undefined,
      PortRequired: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList] = js.undefined,
      OptionsConflictsWith: js.UndefOr[OptionsConflictsWith] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      OptionsDependedOn: js.UndefOr[OptionsDependedOn] = js.undefined,
      DefaultPort: js.UndefOr[IntegerOptional] = js.undefined,
      MinimumRequiredMinorEngineVersion: js.UndefOr[String] = js.undefined,
      SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional] = js.undefined,
      Persistent: js.UndefOr[Boolean] = js.undefined,
      RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean] = js.undefined): OptionGroupOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MajorEngineVersion" -> MajorEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VpcOnly" -> VpcOnly.map { x => x.asInstanceOf[js.Any] },
        "Permanent" -> Permanent.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupOptionSettings" -> OptionGroupOptionSettings.map { x => x.asInstanceOf[js.Any] },
        "PortRequired" -> PortRequired.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupOptionVersions" -> OptionGroupOptionVersions.map { x => x.asInstanceOf[js.Any] },
        "OptionsConflictsWith" -> OptionsConflictsWith.map { x => x.asInstanceOf[js.Any] },
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "OptionsDependedOn" -> OptionsDependedOn.map { x => x.asInstanceOf[js.Any] },
        "DefaultPort" -> DefaultPort.map { x => x.asInstanceOf[js.Any] },
        "MinimumRequiredMinorEngineVersion" -> MinimumRequiredMinorEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "SupportsOptionVersionDowngrade" -> SupportsOptionVersionDowngrade.map { x => x.asInstanceOf[js.Any] },
        "Persistent" -> Persistent.map { x => x.asInstanceOf[js.Any] },
        "RequiresAutoMinorEngineVersionUpgrade" -> RequiresAutoMinorEngineVersionUpgrade.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOption]
    }
  }

  /**
   * <p>Option group option settings are used to display settings available for each option with their default values and other information. These values are used with the DescribeOptionGroupOptions action.</p>
   */
  @js.native
  trait OptionGroupOptionSetting extends js.Object {
    var IsModifiable: js.UndefOr[Boolean]
    var MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList]
    var ApplyType: js.UndefOr[String]
    var IsRequired: js.UndefOr[Boolean]
    var SettingName: js.UndefOr[String]
    var SettingDescription: js.UndefOr[String]
    var AllowedValues: js.UndefOr[String]
    var DefaultValue: js.UndefOr[String]
  }

  object OptionGroupOptionSetting {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList] = js.undefined,
      ApplyType: js.UndefOr[String] = js.undefined,
      IsRequired: js.UndefOr[Boolean] = js.undefined,
      SettingName: js.UndefOr[String] = js.undefined,
      SettingDescription: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      DefaultValue: js.UndefOr[String] = js.undefined): OptionGroupOptionSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersionPerAllowedValue" -> MinimumEngineVersionPerAllowedValue.map { x => x.asInstanceOf[js.Any] },
        "ApplyType" -> ApplyType.map { x => x.asInstanceOf[js.Any] },
        "IsRequired" -> IsRequired.map { x => x.asInstanceOf[js.Any] },
        "SettingName" -> SettingName.map { x => x.asInstanceOf[js.Any] },
        "SettingDescription" -> SettingDescription.map { x => x.asInstanceOf[js.Any] },
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOptionSetting]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait OptionGroupOptionsMessage extends js.Object {
    var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList]
    var Marker: js.UndefOr[String]
  }

  object OptionGroupOptionsMessage {
    def apply(
      OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): OptionGroupOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroupOptions" -> OptionGroupOptions.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOptionsMessage]
    }
  }

  /**
   * <p>List of option groups.</p>
   */
  @js.native
  trait OptionGroups extends js.Object {
    var OptionGroupsList: js.UndefOr[OptionGroupsList]
    var Marker: js.UndefOr[String]
  }

  object OptionGroups {
    def apply(
      OptionGroupsList: js.UndefOr[OptionGroupsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): OptionGroups = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroupsList" -> OptionGroupsList.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroups]
    }
  }

  /**
   * <p>Option settings are the actual settings being applied or configured for that option. It is used when you modify an option group or describe option groups. For example, the NATIVE_NETWORK_ENCRYPTION option has a setting called SQLNET.ENCRYPTION_SERVER that can have several different values.</p>
   */
  @js.native
  trait OptionSetting extends js.Object {
    var IsModifiable: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var ApplyType: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var IsCollection: js.UndefOr[Boolean]
    var Value: js.UndefOr[String]
    var AllowedValues: js.UndefOr[String]
    var DefaultValue: js.UndefOr[String]
    var DataType: js.UndefOr[String]
  }

  object OptionSetting {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      ApplyType: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      IsCollection: js.UndefOr[Boolean] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      DefaultValue: js.UndefOr[String] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined): OptionSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ApplyType" -> ApplyType.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsCollection" -> IsCollection.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionSetting]
    }
  }

  /**
   * <p>The version for an option. Option group option versions are returned by the <a>DescribeOptionGroupOptions</a> action.</p>
   */
  @js.native
  trait OptionVersion extends js.Object {
    var Version: js.UndefOr[String]
    var IsDefault: js.UndefOr[Boolean]
  }

  object OptionVersion {
    def apply(
      Version: js.UndefOr[String] = js.undefined,
      IsDefault: js.UndefOr[Boolean] = js.undefined): OptionVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionVersion]
    }
  }

  /**
   * <p>Contains a list of available options for a DB instance.</p> <p> This data type is used as a response element in the <a>DescribeOrderableDBInstanceOptions</a> action. </p>
   */
  @js.native
  trait OrderableDBInstanceOption extends js.Object {
    var SupportsIops: js.UndefOr[Boolean]
    var DBInstanceClass: js.UndefOr[String]
    var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean]
    var Engine: js.UndefOr[String]
    var MaxStorageSize: js.UndefOr[IntegerOptional]
    var MultiAZCapable: js.UndefOr[Boolean]
    var MinIopsPerDbInstance: js.UndefOr[IntegerOptional]
    var MaxIopsPerGib: js.UndefOr[DoubleOptional]
    var AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList]
    var SupportsPerformanceInsights: js.UndefOr[Boolean]
    var SupportsEnhancedMonitoring: js.UndefOr[Boolean]
    var MinStorageSize: js.UndefOr[IntegerOptional]
    var EngineVersion: js.UndefOr[String]
    var ReadReplicaCapable: js.UndefOr[Boolean]
    var SupportsStorageEncryption: js.UndefOr[Boolean]
    var MinIopsPerGib: js.UndefOr[DoubleOptional]
    var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var Vpc: js.UndefOr[Boolean]
    var LicenseModel: js.UndefOr[String]
    var SupportedEngineModes: js.UndefOr[EngineModeList]
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  object OrderableDBInstanceOption {
    def apply(
      SupportsIops: js.UndefOr[Boolean] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      MaxStorageSize: js.UndefOr[IntegerOptional] = js.undefined,
      MultiAZCapable: js.UndefOr[Boolean] = js.undefined,
      MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined,
      MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined,
      AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined,
      SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined,
      SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined,
      MinStorageSize: js.UndefOr[IntegerOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined,
      SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined,
      MinIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined,
      MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Vpc: js.UndefOr[Boolean] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined): OrderableDBInstanceOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SupportsIops" -> SupportsIops.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "SupportsIAMDatabaseAuthentication" -> SupportsIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "MaxStorageSize" -> MaxStorageSize.map { x => x.asInstanceOf[js.Any] },
        "MultiAZCapable" -> MultiAZCapable.map { x => x.asInstanceOf[js.Any] },
        "MinIopsPerDbInstance" -> MinIopsPerDbInstance.map { x => x.asInstanceOf[js.Any] },
        "MaxIopsPerGib" -> MaxIopsPerGib.map { x => x.asInstanceOf[js.Any] },
        "AvailableProcessorFeatures" -> AvailableProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "SupportsPerformanceInsights" -> SupportsPerformanceInsights.map { x => x.asInstanceOf[js.Any] },
        "SupportsEnhancedMonitoring" -> SupportsEnhancedMonitoring.map { x => x.asInstanceOf[js.Any] },
        "MinStorageSize" -> MinStorageSize.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ReadReplicaCapable" -> ReadReplicaCapable.map { x => x.asInstanceOf[js.Any] },
        "SupportsStorageEncryption" -> SupportsStorageEncryption.map { x => x.asInstanceOf[js.Any] },
        "MinIopsPerGib" -> MinIopsPerGib.map { x => x.asInstanceOf[js.Any] },
        "MaxIopsPerDbInstance" -> MaxIopsPerDbInstance.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "Vpc" -> Vpc.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "SupportedEngineModes" -> SupportedEngineModes.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableDBInstanceOption]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeOrderableDBInstanceOptions</a> action. </p>
   */
  @js.native
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList]
    var Marker: js.UndefOr[String]
  }

  object OrderableDBInstanceOptionsMessage {
    def apply(
      OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): OrderableDBInstanceOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrderableDBInstanceOptions" -> OrderableDBInstanceOptions.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableDBInstanceOptionsMessage]
    }
  }

  /**
   * <p> This data type is used as a request parameter in the <a>ModifyDBParameterGroup</a> and <a>ResetDBParameterGroup</a> actions. </p> <p>This data type is used as a response element in the <a>DescribeEngineDefaultParameters</a> and <a>DescribeDBParameters</a> actions.</p>
   */
  @js.native
  trait Parameter extends js.Object {
    var IsModifiable: js.UndefOr[Boolean]
    var ApplyType: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var AllowedValues: js.UndefOr[String]
    var Source: js.UndefOr[String]
    var ApplyMethod: js.UndefOr[ApplyMethod]
    var MinimumEngineVersion: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
    var SupportedEngineModes: js.UndefOr[EngineModeList]
    var DataType: js.UndefOr[String]
  }

  object Parameter {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      ApplyType: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      ApplyMethod: js.UndefOr[ApplyMethod] = js.undefined,
      MinimumEngineVersion: js.UndefOr[String] = js.undefined,
      ParameterValue: js.UndefOr[String] = js.undefined,
      ParameterName: js.UndefOr[String] = js.undefined,
      SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "ApplyType" -> ApplyType.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "ApplyMethod" -> ApplyMethod.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] },
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "SupportedEngineModes" -> SupportedEngineModes.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * <p>A list of the log types whose configuration is still pending. In other words, these log types are in the process of being activated or deactivated.</p>
   */
  @js.native
  trait PendingCloudwatchLogsExports extends js.Object {
    var LogTypesToEnable: js.UndefOr[LogTypeList]
    var LogTypesToDisable: js.UndefOr[LogTypeList]
  }

  object PendingCloudwatchLogsExports {
    def apply(
      LogTypesToEnable: js.UndefOr[LogTypeList] = js.undefined,
      LogTypesToDisable: js.UndefOr[LogTypeList] = js.undefined): PendingCloudwatchLogsExports = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogTypesToEnable" -> LogTypesToEnable.map { x => x.asInstanceOf[js.Any] },
        "LogTypesToDisable" -> LogTypesToDisable.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingCloudwatchLogsExports]
    }
  }

  /**
   * <p>Provides information about a pending maintenance action for a resource.</p>
   */
  @js.native
  trait PendingMaintenanceAction extends js.Object {
    var Description: js.UndefOr[String]
    var OptInStatus: js.UndefOr[String]
    var AutoAppliedAfterDate: js.UndefOr[TStamp]
    var ForcedApplyDate: js.UndefOr[TStamp]
    var Action: js.UndefOr[String]
    var CurrentApplyDate: js.UndefOr[TStamp]
  }

  object PendingMaintenanceAction {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      OptInStatus: js.UndefOr[String] = js.undefined,
      AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined,
      ForcedApplyDate: js.UndefOr[TStamp] = js.undefined,
      Action: js.UndefOr[String] = js.undefined,
      CurrentApplyDate: js.UndefOr[TStamp] = js.undefined): PendingMaintenanceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "OptInStatus" -> OptInStatus.map { x => x.asInstanceOf[js.Any] },
        "AutoAppliedAfterDate" -> AutoAppliedAfterDate.map { x => x.asInstanceOf[js.Any] },
        "ForcedApplyDate" -> ForcedApplyDate.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplyDate" -> CurrentApplyDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceAction]
    }
  }

  /**
   * <p>Data returned from the <b>DescribePendingMaintenanceActions</b> action.</p>
   */
  @js.native
  trait PendingMaintenanceActionsMessage extends js.Object {
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
    var Marker: js.UndefOr[String]
  }

  object PendingMaintenanceActionsMessage {
    def apply(
      PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): PendingMaintenanceActionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PendingMaintenanceActions" -> PendingMaintenanceActions.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceActionsMessage]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>ModifyDBInstance</a> action. </p>
   */
  @js.native
  trait PendingModifiedValues extends js.Object {
    var DBInstanceClass: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var PendingCloudwatchLogsExports: js.UndefOr[PendingCloudwatchLogsExports]
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var DBInstanceIdentifier: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var EngineVersion: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var MasterUserPassword: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var CACertificateIdentifier: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
  }

  object PendingModifiedValues {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      PendingCloudwatchLogsExports: js.UndefOr[PendingCloudwatchLogsExports] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      CACertificateIdentifier: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "PendingCloudwatchLogsExports" -> PendingCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
    }
  }

  /**
   * <p>Contains the processor features of a DB instance class.</p> <p>To specify the number of CPU cores, use the <code>coreCount</code> feature name for the <code>Name</code> parameter. To specify the number of threads per core, use the <code>threadsPerCore</code> feature name for the <code>Name</code> parameter.</p> <p>You can set the processor features of the DB instance class for a DB instance when you call one of the following actions:</p> <ul> <li> <p> <a>CreateDBInstance</a> </p> </li> <li> <p> <a>ModifyDBInstance</a> </p> </li> <li> <p> <a>RestoreDBInstanceFromDBSnapshot</a> </p> </li> <li> <p> <a>RestoreDBInstanceFromS3</a> </p> </li> <li> <p> <a>RestoreDBInstanceToPointInTime</a> </p> </li> </ul> <p>You can view the valid processor values for a particular instance class by calling the <a>DescribeOrderableDBInstanceOptions</a> action and specifying the instance class for the <code>DBInstanceClass</code> parameter.</p> <p>In addition, you can use the following actions for DB instance class processor information:</p> <ul> <li> <p> <a>DescribeDBInstances</a> </p> </li> <li> <p> <a>DescribeDBSnapshots</a> </p> </li> <li> <p> <a>DescribeValidDBInstanceModifications</a> </p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor">Configuring the Processor of the DB Instance Class</a> in the <i>Amazon RDS User Guide. </i> </p>
   */
  @js.native
  trait ProcessorFeature extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object ProcessorFeature {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): ProcessorFeature = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessorFeature]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait PromoteReadReplicaDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
  }

  object PromoteReadReplicaDBClusterMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined): PromoteReadReplicaDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p/>
   */
  @js.native
  trait PromoteReadReplicaMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
  }

  object PromoteReadReplicaMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined): PromoteReadReplicaMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaMessage]
    }
  }

  @js.native
  trait PromoteReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object PromoteReadReplicaResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): PromoteReadReplicaResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
    var ReservedDBInstanceId: js.UndefOr[String]
    var DBInstanceCount: js.UndefOr[IntegerOptional]
    var Tags: js.UndefOr[TagList]
  }

  object PurchaseReservedDBInstancesOfferingMessage {
    def apply(
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
      DBInstanceCount: js.UndefOr[IntegerOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): PurchaseReservedDBInstancesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstanceId" -> ReservedDBInstanceId.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceCount" -> DBInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedDBInstancesOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
    var ReservedDBInstance: js.UndefOr[ReservedDBInstance]
  }

  object PurchaseReservedDBInstancesOfferingResult {
    def apply(
      ReservedDBInstance: js.UndefOr[ReservedDBInstance] = js.undefined): PurchaseReservedDBInstancesOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedDBInstance" -> ReservedDBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
    }
  }

  /**
   * <p>A range of integer values.</p>
   */
  @js.native
  trait Range extends js.Object {
    var From: js.UndefOr[Int]
    var To: js.UndefOr[Int]
    var Step: js.UndefOr[IntegerOptional]
  }

  object Range {
    def apply(
      From: js.UndefOr[Int] = js.undefined,
      To: js.UndefOr[Int] = js.undefined,
      Step: js.UndefOr[IntegerOptional] = js.undefined): Range = {
      val _fields = IndexedSeq[(String, js.Any)](
        "From" -> From.map { x => x.asInstanceOf[js.Any] },
        "To" -> To.map { x => x.asInstanceOf[js.Any] },
        "Step" -> Step.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Range]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RebootDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  object RebootDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      ForceFailover: js.UndefOr[BooleanOptional] = js.undefined): RebootDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
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

  /**
   * <p> This data type is used as a response element in the <a>DescribeReservedDBInstances</a> and <a>DescribeReservedDBInstancesOfferings</a> actions. </p>
   */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  object RecurringCharge {
    def apply(
      RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
      RecurringChargeFrequency: js.UndefOr[String] = js.undefined): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecurringChargeAmount" -> RecurringChargeAmount.map { x => x.asInstanceOf[js.Any] },
        "RecurringChargeFrequency" -> RecurringChargeFrequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }

  @js.native
  trait RemoveRoleFromDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var RoleArn: js.UndefOr[String]
  }

  object RemoveRoleFromDBClusterMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      RoleArn: js.UndefOr[String] = js.undefined): RemoveRoleFromDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveRoleFromDBClusterMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
    var SubscriptionName: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
  }

  object RemoveSourceIdentifierFromSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined): RemoveSourceIdentifierFromSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceName: js.UndefOr[String]
    var TagKeys: js.UndefOr[KeyList]
  }

  object RemoveTagsFromResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[KeyList] = js.undefined): RemoveTagsFromResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeReservedDBInstances</a> and <a>PurchaseReservedDBInstancesOffering</a> actions. </p>
   */
  @js.native
  trait ReservedDBInstance extends js.Object {
    var DBInstanceClass: js.UndefOr[String]
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var MultiAZ: js.UndefOr[Boolean]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var StartTime: js.UndefOr[TStamp]
    var OfferingType: js.UndefOr[String]
    var DBInstanceCount: js.UndefOr[Int]
    var UsagePrice: js.UndefOr[Double]
    var ReservedDBInstanceArn: js.UndefOr[String]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
    var ReservedDBInstanceId: js.UndefOr[String]
    var State: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
  }

  object ReservedDBInstance {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      DBInstanceCount: js.UndefOr[Int] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservedDBInstanceArn: js.UndefOr[String] = js.undefined,
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined): ReservedDBInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceCount" -> DBInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstanceArn" -> ReservedDBInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstanceId" -> ReservedDBInstanceId.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstance]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeReservedDBInstances</a> action. </p>
   */
  @js.native
  trait ReservedDBInstanceMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList]
  }

  object ReservedDBInstanceMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.undefined): ReservedDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstances" -> ReservedDBInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstanceMessage]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeReservedDBInstancesOfferings</a> action. </p>
   */
  @js.native
  trait ReservedDBInstancesOffering extends js.Object {
    var DBInstanceClass: js.UndefOr[String]
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var MultiAZ: js.UndefOr[Boolean]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var OfferingType: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
  }

  object ReservedDBInstancesOffering {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined): ReservedDBInstancesOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstancesOffering]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeReservedDBInstancesOfferings</a> action. </p>
   */
  @js.native
  trait ReservedDBInstancesOfferingMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList]
  }

  object ReservedDBInstancesOfferingMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.undefined): ReservedDBInstancesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReservedDBInstancesOfferings" -> ReservedDBInstancesOfferings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstancesOfferingMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ResetDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var ResetAllParameters: js.UndefOr[Boolean]
    var Parameters: js.UndefOr[ParametersList]
  }

  object ResetDBClusterParameterGroupMessage {
    def apply(
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): ResetDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ResetAllParameters" -> ResetAllParameters.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetDBClusterParameterGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ResetDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var ResetAllParameters: js.UndefOr[Boolean]
    var Parameters: js.UndefOr[ParametersList]
  }

  object ResetDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined): ResetDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ResetAllParameters" -> ResetAllParameters.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetDBParameterGroupMessage]
    }
  }

  /**
   * <p>Describes the pending maintenance actions for a resource.</p>
   */
  @js.native
  trait ResourcePendingMaintenanceActions extends js.Object {
    var ResourceIdentifier: js.UndefOr[String]
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails]
  }

  object ResourcePendingMaintenanceActions {
    def apply(
      ResourceIdentifier: js.UndefOr[String] = js.undefined,
      PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined): ResourcePendingMaintenanceActions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIdentifier" -> ResourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "PendingMaintenanceActionDetails" -> PendingMaintenanceActionDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourcePendingMaintenanceActions]
    }
  }

  @js.native
  trait RestoreDBClusterFromS3Message extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var SourceEngine: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var SourceEngineVersion: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var S3BucketName: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var S3IngestionRoleArn: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var S3Prefix: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var MasterUserPassword: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object RestoreDBClusterFromS3Message {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      SourceEngine: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      SourceEngineVersion: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      S3IngestionRoleArn: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      S3Prefix: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined): RestoreDBClusterFromS3Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CharacterSetName" -> CharacterSetName.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "SourceEngine" -> SourceEngine.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "SourceEngineVersion" -> SourceEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "S3IngestionRoleArn" -> S3IngestionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "S3Prefix" -> S3Prefix.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "BacktrackWindow" -> BacktrackWindow.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterFromS3Message]
    }
  }

  @js.native
  trait RestoreDBClusterFromS3Result extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterFromS3Result {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): RestoreDBClusterFromS3Result = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterFromS3Result]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RestoreDBClusterFromSnapshotMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var EngineMode: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var SnapshotIdentifier: js.UndefOr[String]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object RestoreDBClusterFromSnapshotMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      EngineMode: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined): RestoreDBClusterFromSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "EngineMode" -> EngineMode.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "ScalingConfiguration" -> ScalingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "BacktrackWindow" -> BacktrackWindow.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DBClusterIdentifier: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var RestoreType: js.UndefOr[String]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var UseLatestRestorableTime: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var SourceDBClusterIdentifier: js.UndefOr[String]
    var RestoreToTime: js.UndefOr[TStamp]
  }

  object RestoreDBClusterToPointInTimeMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      RestoreType: js.UndefOr[String] = js.undefined,
      BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
      UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      SourceDBClusterIdentifier: js.UndefOr[String] = js.undefined,
      RestoreToTime: js.UndefOr[TStamp] = js.undefined): RestoreDBClusterToPointInTimeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "RestoreType" -> RestoreType.map { x => x.asInstanceOf[js.Any] },
        "BacktrackWindow" -> BacktrackWindow.map { x => x.asInstanceOf[js.Any] },
        "UseLatestRestorableTime" -> UseLatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "SourceDBClusterIdentifier" -> SourceDBClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "RestoreToTime" -> RestoreToTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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

  /**
   * <p/>
   */
  @js.native
  trait RestoreDBInstanceFromDBSnapshotMessage extends js.Object {
    var DBInstanceClass: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var DBName: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var DBInstanceIdentifier: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DomainIAMRoleName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var Iops: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var LicenseModel: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var DBSnapshotIdentifier: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var Domain: js.UndefOr[String]
  }

  object RestoreDBInstanceFromDBSnapshotMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
      DomainIAMRoleName: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[String] = js.undefined): RestoreDBInstanceFromDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromDBSnapshotMessage]
    }
  }

  @js.native
  trait RestoreDBInstanceFromDBSnapshotResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceFromDBSnapshotResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): RestoreDBInstanceFromDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromDBSnapshotResult]
    }
  }

  @js.native
  trait RestoreDBInstanceFromS3Message extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var DBInstanceClass: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var SourceEngine: js.UndefOr[String]
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList]
    var DBName: js.UndefOr[String]
    var MonitoringRoleArn: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var SourceEngineVersion: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var DBInstanceIdentifier: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var S3BucketName: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var S3IngestionRoleArn: js.UndefOr[String]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var S3Prefix: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var MasterUserPassword: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object RestoreDBInstanceFromS3Message {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
      SourceEngine: js.UndefOr[String] = js.undefined,
      EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      MonitoringRoleArn: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      SourceEngineVersion: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      S3IngestionRoleArn: js.UndefOr[String] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      S3Prefix: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
      PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined): RestoreDBInstanceFromS3Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "MonitoringInterval" -> MonitoringInterval.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "SourceEngine" -> SourceEngine.map { x => x.asInstanceOf[js.Any] },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroups" -> DBSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "SourceEngineVersion" -> SourceEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "MasterUsername" -> MasterUsername.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "S3IngestionRoleArn" -> S3IngestionRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "S3Prefix" -> S3Prefix.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "MasterUserPassword" -> MasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "StorageEncrypted" -> StorageEncrypted.map { x => x.asInstanceOf[js.Any] },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromS3Message]
    }
  }

  @js.native
  trait RestoreDBInstanceFromS3Result extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceFromS3Result {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): RestoreDBInstanceFromS3Result = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromS3Result]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RestoreDBInstanceToPointInTimeMessage extends js.Object {
    var TargetDBInstanceIdentifier: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var RestoreTime: js.UndefOr[TStamp]
    var OptionGroupName: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var DBName: js.UndefOr[String]
    var SourceDBInstanceIdentifier: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var AvailabilityZone: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DomainIAMRoleName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var SourceDbiResourceId: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var StorageType: js.UndefOr[String]
    var UseLatestRestorableTime: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var LicenseModel: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var Domain: js.UndefOr[String]
  }

  object RestoreDBInstanceToPointInTimeMessage {
    def apply(
      TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
      RestoreTime: js.UndefOr[TStamp] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      SourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
      DomainIAMRoleName: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
      SourceDbiResourceId: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[String] = js.undefined): RestoreDBInstanceToPointInTimeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetDBInstanceIdentifier" -> TargetDBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBInstanceClass" -> DBInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "RestoreTime" -> RestoreTime.map { x => x.asInstanceOf[js.Any] },
        "OptionGroupName" -> OptionGroupName.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "DBName" -> DBName.map { x => x.asInstanceOf[js.Any] },
        "SourceDBInstanceIdentifier" -> SourceDBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ProcessorFeatures" -> ProcessorFeatures.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x => x.asInstanceOf[js.Any] },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x => x.asInstanceOf[js.Any] },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x => x.asInstanceOf[js.Any] },
        "SourceDbiResourceId" -> SourceDbiResourceId.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "UseLatestRestorableTime" -> UseLatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletionProtection" -> DeletionProtection.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x => x.asInstanceOf[js.Any] },
        "LicenseModel" -> LicenseModel.map { x => x.asInstanceOf[js.Any] },
        "TdeCredentialArn" -> TdeCredentialArn.map { x => x.asInstanceOf[js.Any] },
        "DBParameterGroupName" -> DBParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceToPointInTimeMessage]
    }
  }

  @js.native
  trait RestoreDBInstanceToPointInTimeResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceToPointInTimeResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): RestoreDBInstanceToPointInTimeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceToPointInTimeResult]
    }
  }

  /**
   * <p>Earliest and latest time an instance can be restored to:</p>
   */
  @js.native
  trait RestoreWindow extends js.Object {
    var EarliestTime: js.UndefOr[TStamp]
    var LatestTime: js.UndefOr[TStamp]
  }

  object RestoreWindow {
    def apply(
      EarliestTime: js.UndefOr[TStamp] = js.undefined,
      LatestTime: js.UndefOr[TStamp] = js.undefined): RestoreWindow = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EarliestTime" -> EarliestTime.map { x => x.asInstanceOf[js.Any] },
        "LatestTime" -> LatestTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreWindow]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RevokeDBSecurityGroupIngressMessage extends js.Object {
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var DBSecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object RevokeDBSecurityGroupIngressMessage {
    def apply(
      CIDRIP: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): RevokeDBSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CIDRIP" -> CIDRIP.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupId" -> EC2SecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeDBSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object RevokeDBSecurityGroupIngressResult {
    def apply(
      DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined): RevokeDBSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroup" -> DBSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeDBSecurityGroupIngressResult]
    }
  }

  /**
   * <p>Contains the scaling configuration of an Aurora Serverless DB cluster.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.</p>
   */
  @js.native
  trait ScalingConfiguration extends js.Object {
    var MinCapacity: js.UndefOr[IntegerOptional]
    var MaxCapacity: js.UndefOr[IntegerOptional]
    var AutoPause: js.UndefOr[BooleanOptional]
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional]
  }

  object ScalingConfiguration {
    def apply(
      MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
      MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
      AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
      SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined): ScalingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinCapacity" -> MinCapacity.map { x => x.asInstanceOf[js.Any] },
        "MaxCapacity" -> MaxCapacity.map { x => x.asInstanceOf[js.Any] },
        "AutoPause" -> AutoPause.map { x => x.asInstanceOf[js.Any] },
        "SecondsUntilAutoPause" -> SecondsUntilAutoPause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingConfiguration]
    }
  }

  /**
   * <p>Shows the scaling configuration for an Aurora DB cluster in <code>serverless</code> DB engine mode.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.</p>
   */
  @js.native
  trait ScalingConfigurationInfo extends js.Object {
    var MinCapacity: js.UndefOr[IntegerOptional]
    var MaxCapacity: js.UndefOr[IntegerOptional]
    var AutoPause: js.UndefOr[BooleanOptional]
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional]
  }

  object ScalingConfigurationInfo {
    def apply(
      MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
      MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
      AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
      SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined): ScalingConfigurationInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinCapacity" -> MinCapacity.map { x => x.asInstanceOf[js.Any] },
        "MaxCapacity" -> MaxCapacity.map { x => x.asInstanceOf[js.Any] },
        "AutoPause" -> AutoPause.map { x => x.asInstanceOf[js.Any] },
        "SecondsUntilAutoPause" -> SecondsUntilAutoPause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingConfigurationInfo]
    }
  }

  /**
   * <p>Contains an AWS Region name as the result of a successful call to the <a>DescribeSourceRegions</a> action.</p>
   */
  @js.native
  trait SourceRegion extends js.Object {
    var RegionName: js.UndefOr[String]
    var Endpoint: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object SourceRegion {
    def apply(
      RegionName: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): SourceRegion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceRegion]
    }
  }

  /**
   * <p>Contains the result of a successful invocation of the <a>DescribeSourceRegions</a> action.</p>
   */
  @js.native
  trait SourceRegionMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SourceRegions: js.UndefOr[SourceRegionList]
  }

  object SourceRegionMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      SourceRegions: js.UndefOr[SourceRegionList] = js.undefined): SourceRegionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "SourceRegions" -> SourceRegions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceRegionMessage]
    }
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

  @js.native
  trait StartDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
  }

  object StartDBClusterMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined): StartDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDBClusterMessage]
    }
  }

  @js.native
  trait StartDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object StartDBClusterResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): StartDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDBClusterResult]
    }
  }

  @js.native
  trait StartDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
  }

  object StartDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined): StartDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDBInstanceMessage]
    }
  }

  @js.native
  trait StartDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object StartDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): StartDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDBInstanceResult]
    }
  }

  @js.native
  trait StopDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
  }

  object StopDBClusterMessage {
    def apply(
      DBClusterIdentifier: js.UndefOr[String] = js.undefined): StopDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDBClusterMessage]
    }
  }

  @js.native
  trait StopDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object StopDBClusterResult {
    def apply(
      DBCluster: js.UndefOr[DBCluster] = js.undefined): StopDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBCluster" -> DBCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDBClusterResult]
    }
  }

  @js.native
  trait StopDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  object StopDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined): StopDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDBInstanceMessage]
    }
  }

  @js.native
  trait StopDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object StopDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined): StopDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstance" -> DBInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDBInstanceResult]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeDBSubnetGroups</a> action. </p>
   */
  @js.native
  trait Subnet extends js.Object {
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetStatus: js.UndefOr[String]
  }

  object Subnet {
    def apply(
      SubnetIdentifier: js.UndefOr[String] = js.undefined,
      SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      SubnetStatus: js.UndefOr[String] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIdentifier" -> SubnetIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SubnetStatus" -> SubnetStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p>Metadata assigned to an Amazon RDS resource consisting of a key-value pair.</p>
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
   * <p>A time zone associated with a <a>DBInstance</a> or a <a>DBSnapshot</a>. This data type is an element in the response to the <a>DescribeDBInstances</a>, the <a>DescribeDBSnapshots</a>, and the <a>DescribeDBEngineVersions</a> actions. </p>
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
   * <p>The version of the database engine that a DB instance can be upgraded to.</p>
   */
  @js.native
  trait UpgradeTarget extends js.Object {
    var Engine: js.UndefOr[String]
    var AutoUpgrade: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var IsMajorVersionUpgrade: js.UndefOr[Boolean]
  }

  object UpgradeTarget {
    def apply(
      Engine: js.UndefOr[String] = js.undefined,
      AutoUpgrade: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined): UpgradeTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "AutoUpgrade" -> AutoUpgrade.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "IsMajorVersionUpgrade" -> IsMajorVersionUpgrade.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeTarget]
    }
  }

  /**
   * <p>Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <a>DescribeValidDBInstanceModifications</a> action. You can use this information when you call <a>ModifyDBInstance</a>. </p>
   */
  @js.native
  trait ValidDBInstanceModificationsMessage extends js.Object {
    var Storage: js.UndefOr[ValidStorageOptionsList]
    var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList]
  }

  object ValidDBInstanceModificationsMessage {
    def apply(
      Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined,
      ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined): ValidDBInstanceModificationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Storage" -> Storage.map { x => x.asInstanceOf[js.Any] },
        "ValidProcessorFeatures" -> ValidProcessorFeatures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidDBInstanceModificationsMessage]
    }
  }

  /**
   * <p>Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <a>DescribeValidDBInstanceModifications</a> action. </p>
   */
  @js.native
  trait ValidStorageOptions extends js.Object {
    var StorageType: js.UndefOr[String]
    var StorageSize: js.UndefOr[RangeList]
    var ProvisionedIops: js.UndefOr[RangeList]
    var IopsToStorageRatio: js.UndefOr[DoubleRangeList]
  }

  object ValidStorageOptions {
    def apply(
      StorageType: js.UndefOr[String] = js.undefined,
      StorageSize: js.UndefOr[RangeList] = js.undefined,
      ProvisionedIops: js.UndefOr[RangeList] = js.undefined,
      IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.undefined): ValidStorageOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "StorageSize" -> StorageSize.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedIops" -> ProvisionedIops.map { x => x.asInstanceOf[js.Any] },
        "IopsToStorageRatio" -> IopsToStorageRatio.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidStorageOptions]
    }
  }

  /**
   * <p>This data type is used as a response element for queries on VPC security group membership.</p>
   */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var VpcSecurityGroupId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object VpcSecurityGroupMembership {
    def apply(
      VpcSecurityGroupId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): VpcSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcSecurityGroupId" -> VpcSecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
