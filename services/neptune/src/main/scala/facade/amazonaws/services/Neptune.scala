package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object neptune {
  type ApplyMethod                         = String
  type AttributeValueList                  = js.Array[String]
  type AvailabilityZoneList                = js.Array[AvailabilityZone]
  type AvailabilityZones                   = js.Array[String]
  type BooleanOptional                     = Boolean
  type DBClusterList                       = js.Array[DBCluster]
  type DBClusterMemberList                 = js.Array[DBClusterMember]
  type DBClusterOptionGroupMemberships     = js.Array[DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList         = js.Array[DBClusterParameterGroup]
  type DBClusterRoles                      = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList      = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList               = js.Array[DBClusterSnapshot]
  type DBEngineVersionList                 = js.Array[DBEngineVersion]
  type DBInstanceList                      = js.Array[DBInstance]
  type DBInstanceStatusInfoList            = js.Array[DBInstanceStatusInfo]
  type DBParameterGroupList                = js.Array[DBParameterGroup]
  type DBParameterGroupStatusList          = js.Array[DBParameterGroupStatus]
  type DBSecurityGroupMembershipList       = js.Array[DBSecurityGroupMembership]
  type DBSecurityGroupNameList             = js.Array[String]
  type DBSubnetGroups                      = js.Array[DBSubnetGroup]
  type DomainMembershipList                = js.Array[DomainMembership]
  type DoubleOptional                      = Double
  type DoubleRangeList                     = js.Array[DoubleRange]
  type EventCategoriesList                 = js.Array[String]
  type EventCategoriesMapList              = js.Array[EventCategoriesMap]
  type EventList                           = js.Array[Event]
  type EventSubscriptionsList              = js.Array[EventSubscription]
  type FilterList                          = js.Array[Filter]
  type FilterValueList                     = js.Array[String]
  type IntegerOptional                     = Int
  type KeyList                             = js.Array[String]
  type LogTypeList                         = js.Array[String]
  type OptionGroupMembershipList           = js.Array[OptionGroupMembership]
  type OrderableDBInstanceOptionsList      = js.Array[OrderableDBInstanceOption]
  type ParametersList                      = js.Array[Parameter]
  type PendingMaintenanceActionDetails     = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions           = js.Array[ResourcePendingMaintenanceActions]
  type RangeList                           = js.Array[Range]
  type ReadReplicaDBClusterIdentifierList  = js.Array[String]
  type ReadReplicaDBInstanceIdentifierList = js.Array[String]
  type ReadReplicaIdentifierList           = js.Array[String]
  type SourceIdsList                       = js.Array[String]
  type SourceType                          = String
  type SubnetIdentifierList                = js.Array[String]
  type SubnetList                          = js.Array[Subnet]
  type SupportedCharacterSetsList          = js.Array[CharacterSet]
  type SupportedTimezonesList              = js.Array[Timezone]
  type TStamp                              = js.Date
  type TagList                             = js.Array[Tag]
  type ValidStorageOptionsList             = js.Array[ValidStorageOptions]
  type ValidUpgradeTargetList              = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList              = js.Array[String]
  type VpcSecurityGroupMembershipList      = js.Array[VpcSecurityGroupMembership]

  implicit final class NeptuneOps(private val service: Neptune) extends AnyVal {

    @inline def addRoleToDBClusterFuture(params: AddRoleToDBClusterMessage): Future[js.Object] =
      service.addRoleToDBCluster(params).promise.toFuture
    @inline def addSourceIdentifierToSubscriptionFuture(
        params: AddSourceIdentifierToSubscriptionMessage
    ): Future[AddSourceIdentifierToSubscriptionResult] =
      service.addSourceIdentifierToSubscription(params).promise.toFuture
    @inline def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[js.Object] =
      service.addTagsToResource(params).promise.toFuture
    @inline def applyPendingMaintenanceActionFuture(
        params: ApplyPendingMaintenanceActionMessage
    ): Future[ApplyPendingMaintenanceActionResult] = service.applyPendingMaintenanceAction(params).promise.toFuture
    @inline def copyDBClusterParameterGroupFuture(
        params: CopyDBClusterParameterGroupMessage
    ): Future[CopyDBClusterParameterGroupResult] = service.copyDBClusterParameterGroup(params).promise.toFuture
    @inline def copyDBClusterSnapshotFuture(params: CopyDBClusterSnapshotMessage): Future[CopyDBClusterSnapshotResult] =
      service.copyDBClusterSnapshot(params).promise.toFuture
    @inline def copyDBParameterGroupFuture(params: CopyDBParameterGroupMessage): Future[CopyDBParameterGroupResult] =
      service.copyDBParameterGroup(params).promise.toFuture
    @inline def createDBClusterFuture(params: CreateDBClusterMessage): Future[CreateDBClusterResult] =
      service.createDBCluster(params).promise.toFuture
    @inline def createDBClusterParameterGroupFuture(
        params: CreateDBClusterParameterGroupMessage
    ): Future[CreateDBClusterParameterGroupResult] = service.createDBClusterParameterGroup(params).promise.toFuture
    @inline def createDBClusterSnapshotFuture(
        params: CreateDBClusterSnapshotMessage
    ): Future[CreateDBClusterSnapshotResult] = service.createDBClusterSnapshot(params).promise.toFuture
    @inline def createDBInstanceFuture(params: CreateDBInstanceMessage): Future[CreateDBInstanceResult] =
      service.createDBInstance(params).promise.toFuture
    @inline def createDBParameterGroupFuture(
        params: CreateDBParameterGroupMessage
    ): Future[CreateDBParameterGroupResult] = service.createDBParameterGroup(params).promise.toFuture
    @inline def createDBSubnetGroupFuture(params: CreateDBSubnetGroupMessage): Future[CreateDBSubnetGroupResult] =
      service.createDBSubnetGroup(params).promise.toFuture
    @inline def createEventSubscriptionFuture(
        params: CreateEventSubscriptionMessage
    ): Future[CreateEventSubscriptionResult] = service.createEventSubscription(params).promise.toFuture
    @inline def deleteDBClusterFuture(params: DeleteDBClusterMessage): Future[DeleteDBClusterResult] =
      service.deleteDBCluster(params).promise.toFuture
    @inline def deleteDBClusterParameterGroupFuture(params: DeleteDBClusterParameterGroupMessage): Future[js.Object] =
      service.deleteDBClusterParameterGroup(params).promise.toFuture
    @inline def deleteDBClusterSnapshotFuture(
        params: DeleteDBClusterSnapshotMessage
    ): Future[DeleteDBClusterSnapshotResult] = service.deleteDBClusterSnapshot(params).promise.toFuture
    @inline def deleteDBInstanceFuture(params: DeleteDBInstanceMessage): Future[DeleteDBInstanceResult] =
      service.deleteDBInstance(params).promise.toFuture
    @inline def deleteDBParameterGroupFuture(params: DeleteDBParameterGroupMessage): Future[js.Object] =
      service.deleteDBParameterGroup(params).promise.toFuture
    @inline def deleteDBSubnetGroupFuture(params: DeleteDBSubnetGroupMessage): Future[js.Object] =
      service.deleteDBSubnetGroup(params).promise.toFuture
    @inline def deleteEventSubscriptionFuture(
        params: DeleteEventSubscriptionMessage
    ): Future[DeleteEventSubscriptionResult] = service.deleteEventSubscription(params).promise.toFuture
    @inline def describeDBClusterParameterGroupsFuture(
        params: DescribeDBClusterParameterGroupsMessage
    ): Future[DBClusterParameterGroupsMessage] = service.describeDBClusterParameterGroups(params).promise.toFuture
    @inline def describeDBClusterParametersFuture(
        params: DescribeDBClusterParametersMessage
    ): Future[DBClusterParameterGroupDetails] = service.describeDBClusterParameters(params).promise.toFuture
    @inline def describeDBClusterSnapshotAttributesFuture(
        params: DescribeDBClusterSnapshotAttributesMessage
    ): Future[DescribeDBClusterSnapshotAttributesResult] =
      service.describeDBClusterSnapshotAttributes(params).promise.toFuture
    @inline def describeDBClusterSnapshotsFuture(
        params: DescribeDBClusterSnapshotsMessage
    ): Future[DBClusterSnapshotMessage] = service.describeDBClusterSnapshots(params).promise.toFuture
    @inline def describeDBClustersFuture(params: DescribeDBClustersMessage): Future[DBClusterMessage] =
      service.describeDBClusters(params).promise.toFuture
    @inline def describeDBEngineVersionsFuture(
        params: DescribeDBEngineVersionsMessage
    ): Future[DBEngineVersionMessage] = service.describeDBEngineVersions(params).promise.toFuture
    @inline def describeDBInstancesFuture(params: DescribeDBInstancesMessage): Future[DBInstanceMessage] =
      service.describeDBInstances(params).promise.toFuture
    @inline def describeDBParameterGroupsFuture(
        params: DescribeDBParameterGroupsMessage
    ): Future[DBParameterGroupsMessage] = service.describeDBParameterGroups(params).promise.toFuture
    @inline def describeDBParametersFuture(params: DescribeDBParametersMessage): Future[DBParameterGroupDetails] =
      service.describeDBParameters(params).promise.toFuture
    @inline def describeDBSubnetGroupsFuture(params: DescribeDBSubnetGroupsMessage): Future[DBSubnetGroupMessage] =
      service.describeDBSubnetGroups(params).promise.toFuture
    @inline def describeEngineDefaultClusterParametersFuture(
        params: DescribeEngineDefaultClusterParametersMessage
    ): Future[DescribeEngineDefaultClusterParametersResult] =
      service.describeEngineDefaultClusterParameters(params).promise.toFuture
    @inline def describeEngineDefaultParametersFuture(
        params: DescribeEngineDefaultParametersMessage
    ): Future[DescribeEngineDefaultParametersResult] = service.describeEngineDefaultParameters(params).promise.toFuture
    @inline def describeEventCategoriesFuture(params: DescribeEventCategoriesMessage): Future[EventCategoriesMessage] =
      service.describeEventCategories(params).promise.toFuture
    @inline def describeEventSubscriptionsFuture(
        params: DescribeEventSubscriptionsMessage
    ): Future[EventSubscriptionsMessage] = service.describeEventSubscriptions(params).promise.toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] =
      service.describeEvents(params).promise.toFuture
    @inline def describeOrderableDBInstanceOptionsFuture(
        params: DescribeOrderableDBInstanceOptionsMessage
    ): Future[OrderableDBInstanceOptionsMessage] = service.describeOrderableDBInstanceOptions(params).promise.toFuture
    @inline def describePendingMaintenanceActionsFuture(
        params: DescribePendingMaintenanceActionsMessage
    ): Future[PendingMaintenanceActionsMessage] = service.describePendingMaintenanceActions(params).promise.toFuture
    @inline def describeValidDBInstanceModificationsFuture(
        params: DescribeValidDBInstanceModificationsMessage
    ): Future[DescribeValidDBInstanceModificationsResult] =
      service.describeValidDBInstanceModifications(params).promise.toFuture
    @inline def failoverDBClusterFuture(params: FailoverDBClusterMessage): Future[FailoverDBClusterResult] =
      service.failoverDBCluster(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[TagListMessage] =
      service.listTagsForResource(params).promise.toFuture
    @inline def modifyDBClusterFuture(params: ModifyDBClusterMessage): Future[ModifyDBClusterResult] =
      service.modifyDBCluster(params).promise.toFuture
    @inline def modifyDBClusterParameterGroupFuture(
        params: ModifyDBClusterParameterGroupMessage
    ): Future[DBClusterParameterGroupNameMessage] = service.modifyDBClusterParameterGroup(params).promise.toFuture
    @inline def modifyDBClusterSnapshotAttributeFuture(
        params: ModifyDBClusterSnapshotAttributeMessage
    ): Future[ModifyDBClusterSnapshotAttributeResult] =
      service.modifyDBClusterSnapshotAttribute(params).promise.toFuture
    @inline def modifyDBInstanceFuture(params: ModifyDBInstanceMessage): Future[ModifyDBInstanceResult] =
      service.modifyDBInstance(params).promise.toFuture
    @inline def modifyDBParameterGroupFuture(
        params: ModifyDBParameterGroupMessage
    ): Future[DBParameterGroupNameMessage] = service.modifyDBParameterGroup(params).promise.toFuture
    @inline def modifyDBSubnetGroupFuture(params: ModifyDBSubnetGroupMessage): Future[ModifyDBSubnetGroupResult] =
      service.modifyDBSubnetGroup(params).promise.toFuture
    @inline def modifyEventSubscriptionFuture(
        params: ModifyEventSubscriptionMessage
    ): Future[ModifyEventSubscriptionResult] = service.modifyEventSubscription(params).promise.toFuture
    @inline def promoteReadReplicaDBClusterFuture(
        params: PromoteReadReplicaDBClusterMessage
    ): Future[PromoteReadReplicaDBClusterResult] = service.promoteReadReplicaDBCluster(params).promise.toFuture
    @inline def rebootDBInstanceFuture(params: RebootDBInstanceMessage): Future[RebootDBInstanceResult] =
      service.rebootDBInstance(params).promise.toFuture
    @inline def removeRoleFromDBClusterFuture(params: RemoveRoleFromDBClusterMessage): Future[js.Object] =
      service.removeRoleFromDBCluster(params).promise.toFuture
    @inline def removeSourceIdentifierFromSubscriptionFuture(
        params: RemoveSourceIdentifierFromSubscriptionMessage
    ): Future[RemoveSourceIdentifierFromSubscriptionResult] =
      service.removeSourceIdentifierFromSubscription(params).promise.toFuture
    @inline def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[js.Object] =
      service.removeTagsFromResource(params).promise.toFuture
    @inline def resetDBClusterParameterGroupFuture(
        params: ResetDBClusterParameterGroupMessage
    ): Future[DBClusterParameterGroupNameMessage] = service.resetDBClusterParameterGroup(params).promise.toFuture
    @inline def resetDBParameterGroupFuture(params: ResetDBParameterGroupMessage): Future[DBParameterGroupNameMessage] =
      service.resetDBParameterGroup(params).promise.toFuture
    @inline def restoreDBClusterFromSnapshotFuture(
        params: RestoreDBClusterFromSnapshotMessage
    ): Future[RestoreDBClusterFromSnapshotResult] = service.restoreDBClusterFromSnapshot(params).promise.toFuture
    @inline def restoreDBClusterToPointInTimeFuture(
        params: RestoreDBClusterToPointInTimeMessage
    ): Future[RestoreDBClusterToPointInTimeResult] = service.restoreDBClusterToPointInTime(params).promise.toFuture
  }
}

package neptune {
  @js.native
  @JSImport("aws-sdk", "Neptune")
  class Neptune() extends js.Object {
    def this(config: AWSConfig) = this()

    def addRoleToDBCluster(params: AddRoleToDBClusterMessage): Request[js.Object] = js.native
    def addSourceIdentifierToSubscription(
        params: AddSourceIdentifierToSubscriptionMessage
    ): Request[AddSourceIdentifierToSubscriptionResult]                         = js.native
    def addTagsToResource(params: AddTagsToResourceMessage): Request[js.Object] = js.native
    def applyPendingMaintenanceAction(
        params: ApplyPendingMaintenanceActionMessage
    ): Request[ApplyPendingMaintenanceActionResult] = js.native
    def copyDBClusterParameterGroup(
        params: CopyDBClusterParameterGroupMessage
    ): Request[CopyDBClusterParameterGroupResult]                                                         = js.native
    def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): Request[CopyDBClusterSnapshotResult] = js.native
    def copyDBParameterGroup(params: CopyDBParameterGroupMessage): Request[CopyDBParameterGroupResult]    = js.native
    def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult]                   = js.native
    def createDBClusterParameterGroup(
        params: CreateDBClusterParameterGroupMessage
    ): Request[CreateDBClusterParameterGroupResult] = js.native
    def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): Request[CreateDBClusterSnapshotResult] =
      js.native
    def createDBInstance(params: CreateDBInstanceMessage): Request[CreateDBInstanceResult]                   = js.native
    def createDBParameterGroup(params: CreateDBParameterGroupMessage): Request[CreateDBParameterGroupResult] = js.native
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult]          = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] =
      js.native
    def deleteDBCluster(params: DeleteDBClusterMessage): Request[DeleteDBClusterResult]                 = js.native
    def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): Request[js.Object] = js.native
    def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): Request[DeleteDBClusterSnapshotResult] =
      js.native
    def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult] = js.native
    def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): Request[js.Object]  = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object]        = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResult] =
      js.native
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
    def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage): Request[DBParameterGroupsMessage] =
      js.native
    def describeDBParameters(params: DescribeDBParametersMessage): Request[DBParameterGroupDetails]  = js.native
    def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): Request[DBSubnetGroupMessage] = js.native
    def describeEngineDefaultClusterParameters(
        params: DescribeEngineDefaultClusterParametersMessage
    ): Request[DescribeEngineDefaultClusterParametersResult] = js.native
    def describeEngineDefaultParameters(
        params: DescribeEngineDefaultParametersMessage
    ): Request[DescribeEngineDefaultParametersResult]                                                    = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage] =
      js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeOrderableDBInstanceOptions(
        params: DescribeOrderableDBInstanceOptionsMessage
    ): Request[OrderableDBInstanceOptionsMessage] = js.native
    def describePendingMaintenanceActions(
        params: DescribePendingMaintenanceActionsMessage
    ): Request[PendingMaintenanceActionsMessage] = js.native
    def describeValidDBInstanceModifications(
        params: DescribeValidDBInstanceModificationsMessage
    ): Request[DescribeValidDBInstanceModificationsResult]                                    = js.native
    def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage]      = js.native
    def modifyDBCluster(params: ModifyDBClusterMessage): Request[ModifyDBClusterResult]       = js.native
    def modifyDBClusterParameterGroup(
        params: ModifyDBClusterParameterGroupMessage
    ): Request[DBClusterParameterGroupNameMessage] = js.native
    def modifyDBClusterSnapshotAttribute(
        params: ModifyDBClusterSnapshotAttributeMessage
    ): Request[ModifyDBClusterSnapshotAttributeResult]                                                      = js.native
    def modifyDBInstance(params: ModifyDBInstanceMessage): Request[ModifyDBInstanceResult]                  = js.native
    def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): Request[ModifyDBSubnetGroupResult]         = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult] =
      js.native
    def promoteReadReplicaDBCluster(
        params: PromoteReadReplicaDBClusterMessage
    ): Request[PromoteReadReplicaDBClusterResult]                                           = js.native
    def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult]  = js.native
    def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): Request[js.Object] = js.native
    def removeSourceIdentifierFromSubscription(
        params: RemoveSourceIdentifierFromSubscriptionMessage
    ): Request[RemoveSourceIdentifierFromSubscriptionResult]                              = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object] = js.native
    def resetDBClusterParameterGroup(
        params: ResetDBClusterParameterGroupMessage
    ): Request[DBClusterParameterGroupNameMessage]                                                        = js.native
    def resetDBParameterGroup(params: ResetDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def restoreDBClusterFromSnapshot(
        params: RestoreDBClusterFromSnapshotMessage
    ): Request[RestoreDBClusterFromSnapshotResult] = js.native
    def restoreDBClusterToPointInTime(
        params: RestoreDBClusterToPointInTimeMessage
    ): Request[RestoreDBClusterToPointInTimeResult] = js.native
  }

  @js.native
  trait AddRoleToDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
  }

  object AddRoleToDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        RoleArn: String
    ): AddRoleToDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "RoleArn"             -> RoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddRoleToDBClusterMessage]
    }
  }

  @js.native
  trait AddSourceIdentifierToSubscriptionMessage extends js.Object {
    var SourceIdentifier: String
    var SubscriptionName: String
  }

  object AddSourceIdentifierToSubscriptionMessage {
    @inline
    def apply(
        SourceIdentifier: String,
        SubscriptionName: String
    ): AddSourceIdentifierToSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddSourceIdentifierToSubscriptionMessage]
    }
  }

  @js.native
  trait AddSourceIdentifierToSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object AddSourceIdentifierToSubscriptionResult {
    @inline
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): AddSourceIdentifierToSubscriptionResult = {
      val __obj = js.Dynamic.literal()
      EventSubscription.foreach(__v => __obj.updateDynamic("EventSubscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddSourceIdentifierToSubscriptionResult]
    }
  }

  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object AddTagsToResourceMessage {
    @inline
    def apply(
        ResourceName: String,
        Tags: TagList
    ): AddTagsToResourceMessage = {
      val __obj = js.Dynamic.literal(
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

  @js.native
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    var ApplyAction: String
    var OptInType: String
    var ResourceIdentifier: String
  }

  object ApplyPendingMaintenanceActionMessage {
    @inline
    def apply(
        ApplyAction: String,
        OptInType: String,
        ResourceIdentifier: String
    ): ApplyPendingMaintenanceActionMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions] = js.undefined
    ): ApplyPendingMaintenanceActionResult = {
      val __obj = js.Dynamic.literal()
      ResourcePendingMaintenanceActions.foreach(__v =>
        __obj.updateDynamic("ResourcePendingMaintenanceActions")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ApplyPendingMaintenanceActionResult]
    }
  }

  /**
    * Specifies an Availability Zone.
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZone {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /**
    * Specifies a character set.
    */
  @js.native
  trait CharacterSet extends js.Object {
    var CharacterSetDescription: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
  }

  object CharacterSet {
    @inline
    def apply(
        CharacterSetDescription: js.UndefOr[String] = js.undefined,
        CharacterSetName: js.UndefOr[String] = js.undefined
    ): CharacterSet = {
      val __obj = js.Dynamic.literal()
      CharacterSetDescription.foreach(__v => __obj.updateDynamic("CharacterSetDescription")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CharacterSet]
    }
  }

  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance or DB cluster.
    *  The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which logs will be exported (or not exported) to CloudWatch Logs.
    */
  @js.native
  trait CloudwatchLogsExportConfiguration extends js.Object {
    var DisableLogTypes: js.UndefOr[LogTypeList]
    var EnableLogTypes: js.UndefOr[LogTypeList]
  }

  object CloudwatchLogsExportConfiguration {
    @inline
    def apply(
        DisableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
        EnableLogTypes: js.UndefOr[LogTypeList] = js.undefined
    ): CloudwatchLogsExportConfiguration = {
      val __obj = js.Dynamic.literal()
      DisableLogTypes.foreach(__v => __obj.updateDynamic("DisableLogTypes")(__v.asInstanceOf[js.Any]))
      EnableLogTypes.foreach(__v => __obj.updateDynamic("EnableLogTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudwatchLogsExportConfiguration]
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
    @inline
    def apply(
        SourceDBClusterParameterGroupIdentifier: String,
        TargetDBClusterParameterGroupDescription: String,
        TargetDBClusterParameterGroupIdentifier: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "SourceDBClusterParameterGroupIdentifier"  -> SourceDBClusterParameterGroupIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterParameterGroupDescription" -> TargetDBClusterParameterGroupDescription.asInstanceOf[js.Any],
        "TargetDBClusterParameterGroupIdentifier"  -> TargetDBClusterParameterGroupIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CopyDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup]
  }

  object CopyDBClusterParameterGroupResult {
    @inline
    def apply(
        DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined
    ): CopyDBClusterParameterGroupResult = {
      val __obj = js.Dynamic.literal()
      DBClusterParameterGroup.foreach(__v => __obj.updateDynamic("DBClusterParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBClusterParameterGroupResult]
    }
  }

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
    @inline
    def apply(
        SourceDBClusterSnapshotIdentifier: String,
        TargetDBClusterSnapshotIdentifier: String,
        CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        PreSignedUrl: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "SourceDBClusterSnapshotIdentifier" -> SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterSnapshotIdentifier" -> TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      CopyTags.foreach(__v => __obj.updateDynamic("CopyTags")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      PreSignedUrl.foreach(__v => __obj.updateDynamic("PreSignedUrl")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait CopyDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object CopyDBClusterSnapshotResult {
    @inline
    def apply(
        DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
    ): CopyDBClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBClusterSnapshot.foreach(__v => __obj.updateDynamic("DBClusterSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBClusterSnapshotResult]
    }
  }

  @js.native
  trait CopyDBParameterGroupMessage extends js.Object {
    var SourceDBParameterGroupIdentifier: String
    var TargetDBParameterGroupDescription: String
    var TargetDBParameterGroupIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBParameterGroupMessage {
    @inline
    def apply(
        SourceDBParameterGroupIdentifier: String,
        TargetDBParameterGroupDescription: String,
        TargetDBParameterGroupIdentifier: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "SourceDBParameterGroupIdentifier"  -> SourceDBParameterGroupIdentifier.asInstanceOf[js.Any],
        "TargetDBParameterGroupDescription" -> TargetDBParameterGroupDescription.asInstanceOf[js.Any],
        "TargetDBParameterGroupIdentifier"  -> TargetDBParameterGroupIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBParameterGroupMessage]
    }
  }

  @js.native
  trait CopyDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup]
  }

  object CopyDBParameterGroupResult {
    @inline
    def apply(
        DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined
    ): CopyDBParameterGroupResult = {
      val __obj = js.Dynamic.literal()
      DBParameterGroup.foreach(__v => __obj.updateDynamic("DBParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBParameterGroupResult]
    }
  }

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
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
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
    @inline
    def apply(
        DBClusterIdentifier: String,
        Engine: String,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        CharacterSetName: js.UndefOr[String] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
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
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnableCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreSignedUrl.foreach(__v => __obj.updateDynamic("PreSignedUrl")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      ReplicationSourceIdentifier.foreach(__v =>
        __obj.updateDynamic("ReplicationSourceIdentifier")(__v.asInstanceOf[js.Any])
      )
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterMessage]
    }
  }

  @js.native
  trait CreateDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var DBParameterGroupFamily: String
    var Description: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBClusterParameterGroupMessage {
    @inline
    def apply(
        DBClusterParameterGroupName: String,
        DBParameterGroupFamily: String,
        Description: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "DBParameterGroupFamily"      -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "Description"                 -> Description.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CreateDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup]
  }

  object CreateDBClusterParameterGroupResult {
    @inline
    def apply(
        DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined
    ): CreateDBClusterParameterGroupResult = {
      val __obj = js.Dynamic.literal()
      DBClusterParameterGroup.foreach(__v => __obj.updateDynamic("DBClusterParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterParameterGroupResult]
    }
  }

  @js.native
  trait CreateDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object CreateDBClusterResult {
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): CreateDBClusterResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterResult]
    }
  }

  @js.native
  trait CreateDBClusterSnapshotMessage extends js.Object {
    var DBClusterIdentifier: String
    var DBClusterSnapshotIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBClusterSnapshotMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        DBClusterSnapshotIdentifier: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier"         -> DBClusterIdentifier.asInstanceOf[js.Any],
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait CreateDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object CreateDBClusterSnapshotResult {
    @inline
    def apply(
        DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
    ): CreateDBClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBClusterSnapshot.foreach(__v => __obj.updateDynamic("DBClusterSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterSnapshotResult]
    }
  }

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
    @inline
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
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceClass"      -> DBInstanceClass.asInstanceOf[js.Any],
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "Engine"               -> Engine.asInstanceOf[js.Any]
      )

      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      DBSecurityGroups.foreach(__v => __obj.updateDynamic("DBSecurityGroups")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnableCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      EnablePerformanceInsights.foreach(__v =>
        __obj.updateDynamic("EnablePerformanceInsights")(__v.asInstanceOf[js.Any])
      )
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      MonitoringInterval.foreach(__v => __obj.updateDynamic("MonitoringInterval")(__v.asInstanceOf[js.Any]))
      MonitoringRoleArn.foreach(__v => __obj.updateDynamic("MonitoringRoleArn")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsKMSKeyId.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsKMSKeyId")(__v.asInstanceOf[js.Any])
      )
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      PromotionTier.foreach(__v => __obj.updateDynamic("PromotionTier")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      TdeCredentialPassword.foreach(__v => __obj.updateDynamic("TdeCredentialPassword")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBInstanceMessage]
    }
  }

  @js.native
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object CreateDBInstanceResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): CreateDBInstanceResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBInstanceResult]
    }
  }

  @js.native
  trait CreateDBParameterGroupMessage extends js.Object {
    var DBParameterGroupFamily: String
    var DBParameterGroupName: String
    var Description: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBParameterGroupMessage {
    @inline
    def apply(
        DBParameterGroupFamily: String,
        DBParameterGroupName: String,
        Description: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "DBParameterGroupName"   -> DBParameterGroupName.asInstanceOf[js.Any],
        "Description"            -> Description.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBParameterGroupMessage]
    }
  }

  @js.native
  trait CreateDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup]
  }

  object CreateDBParameterGroupResult {
    @inline
    def apply(
        DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined
    ): CreateDBParameterGroupResult = {
      val __obj = js.Dynamic.literal()
      DBParameterGroup.foreach(__v => __obj.updateDynamic("DBParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBParameterGroupResult]
    }
  }

  @js.native
  trait CreateDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupDescription: String
    var DBSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBSubnetGroupMessage {
    @inline
    def apply(
        DBSubnetGroupDescription: String,
        DBSubnetGroupName: String,
        SubnetIds: SubnetIdentifierList,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.asInstanceOf[js.Any],
        "DBSubnetGroupName"        -> DBSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"                -> SubnetIds.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  object CreateDBSubnetGroupResult {
    @inline
    def apply(
        DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
    ): CreateDBSubnetGroupResult = {
      val __obj = js.Dynamic.literal()
      DBSubnetGroup.foreach(__v => __obj.updateDynamic("DBSubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBSubnetGroupResult]
    }
  }

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
    @inline
    def apply(
        SnsTopicArn: String,
        SubscriptionName: String,
        Enabled: js.UndefOr[BooleanOptional] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEventSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SnsTopicArn"      -> SnsTopicArn.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      SourceIds.foreach(__v => __obj.updateDynamic("SourceIds")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  @js.native
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object CreateEventSubscriptionResult {
    @inline
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): CreateEventSubscriptionResult = {
      val __obj = js.Dynamic.literal()
      EventSubscription.foreach(__v => __obj.updateDynamic("EventSubscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventSubscriptionResult]
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
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList]
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
    @inline
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
        EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
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
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): DBCluster = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AssociatedRoles.foreach(__v => __obj.updateDynamic("AssociatedRoles")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      CloneGroupId.foreach(__v => __obj.updateDynamic("CloneGroupId")(__v.asInstanceOf[js.Any]))
      ClusterCreateTime.foreach(__v => __obj.updateDynamic("ClusterCreateTime")(__v.asInstanceOf[js.Any]))
      DBClusterArn.foreach(__v => __obj.updateDynamic("DBClusterArn")(__v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      DBClusterMembers.foreach(__v => __obj.updateDynamic("DBClusterMembers")(__v.asInstanceOf[js.Any]))
      DBClusterOptionGroupMemberships.foreach(__v =>
        __obj.updateDynamic("DBClusterOptionGroupMemberships")(__v.asInstanceOf[js.Any])
      )
      DBClusterParameterGroup.foreach(__v => __obj.updateDynamic("DBClusterParameterGroup")(__v.asInstanceOf[js.Any]))
      DBSubnetGroup.foreach(__v => __obj.updateDynamic("DBSubnetGroup")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DbClusterResourceId.foreach(__v => __obj.updateDynamic("DbClusterResourceId")(__v.asInstanceOf[js.Any]))
      EarliestRestorableTime.foreach(__v => __obj.updateDynamic("EarliestRestorableTime")(__v.asInstanceOf[js.Any]))
      EnabledCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnabledCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      IAMDatabaseAuthenticationEnabled.foreach(__v =>
        __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any])
      )
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LatestRestorableTime.foreach(__v => __obj.updateDynamic("LatestRestorableTime")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      PercentProgress.foreach(__v => __obj.updateDynamic("PercentProgress")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      ReadReplicaIdentifiers.foreach(__v => __obj.updateDynamic("ReadReplicaIdentifiers")(__v.asInstanceOf[js.Any]))
      ReaderEndpoint.foreach(__v => __obj.updateDynamic("ReaderEndpoint")(__v.asInstanceOf[js.Any]))
      ReplicationSourceIdentifier.foreach(__v =>
        __obj.updateDynamic("ReplicationSourceIdentifier")(__v.asInstanceOf[js.Any])
      )
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.updateDynamic("VpcSecurityGroups")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DBClusterParameterGroupStatus: js.UndefOr[String] = js.undefined,
        DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        IsClusterWriter: js.UndefOr[Boolean] = js.undefined,
        PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
    ): DBClusterMember = {
      val __obj = js.Dynamic.literal()
      DBClusterParameterGroupStatus.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupStatus")(__v.asInstanceOf[js.Any])
      )
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      IsClusterWriter.foreach(__v => __obj.updateDynamic("IsClusterWriter")(__v.asInstanceOf[js.Any]))
      PromotionTier.foreach(__v => __obj.updateDynamic("PromotionTier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterMember]
    }
  }

  @js.native
  trait DBClusterMessage extends js.Object {
    var DBClusters: js.UndefOr[DBClusterList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterMessage {
    @inline
    def apply(
        DBClusters: js.UndefOr[DBClusterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBClusterMessage = {
      val __obj = js.Dynamic.literal()
      DBClusters.foreach(__v => __obj.updateDynamic("DBClusters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterMessage]
    }
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
    @inline
    def apply(
        DBClusterOptionGroupName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DBClusterOptionGroupStatus = {
      val __obj = js.Dynamic.literal()
      DBClusterOptionGroupName.foreach(__v => __obj.updateDynamic("DBClusterOptionGroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterOptionGroupStatus]
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
    @inline
    def apply(
        DBClusterParameterGroupArn: js.UndefOr[String] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined
    ): DBClusterParameterGroup = {
      val __obj = js.Dynamic.literal()
      DBClusterParameterGroupArn.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupArn")(__v.asInstanceOf[js.Any])
      )
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBParameterGroupFamily.foreach(__v => __obj.updateDynamic("DBParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterParameterGroup]
    }
  }

  @js.native
  trait DBClusterParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object DBClusterParameterGroupDetails {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): DBClusterParameterGroupDetails = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterParameterGroupDetails]
    }
  }

  @js.native
  trait DBClusterParameterGroupNameMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
  }

  object DBClusterParameterGroupNameMessage {
    @inline
    def apply(
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    ): DBClusterParameterGroupNameMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DBClusterParameterGroupNameMessage]
    }
  }

  @js.native
  trait DBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterParameterGroupsMessage {
    @inline
    def apply(
        DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBClusterParameterGroupsMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterParameterGroups.foreach(__v => __obj.updateDynamic("DBClusterParameterGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        RoleArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DBClusterRole = {
      val __obj = js.Dynamic.literal()
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterRole]
    }
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
    @inline
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
        VpcId: js.UndefOr[String] = js.undefined
    ): DBClusterSnapshot = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      ClusterCreateTime.foreach(__v => __obj.updateDynamic("ClusterCreateTime")(__v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      DBClusterSnapshotArn.foreach(__v => __obj.updateDynamic("DBClusterSnapshotArn")(__v.asInstanceOf[js.Any]))
      DBClusterSnapshotIdentifier.foreach(__v =>
        __obj.updateDynamic("DBClusterSnapshotIdentifier")(__v.asInstanceOf[js.Any])
      )
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      IAMDatabaseAuthenticationEnabled.foreach(__v =>
        __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any])
      )
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      PercentProgress.foreach(__v => __obj.updateDynamic("PercentProgress")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      SnapshotCreateTime.foreach(__v => __obj.updateDynamic("SnapshotCreateTime")(__v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.updateDynamic("SnapshotType")(__v.asInstanceOf[js.Any]))
      SourceDBClusterSnapshotArn.foreach(__v =>
        __obj.updateDynamic("SourceDBClusterSnapshotArn")(__v.asInstanceOf[js.Any])
      )
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterSnapshot]
    }
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
    @inline
    def apply(
        AttributeName: js.UndefOr[String] = js.undefined,
        AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
    ): DBClusterSnapshotAttribute = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      AttributeValues.foreach(__v => __obj.updateDynamic("AttributeValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterSnapshotAttribute]
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
    @inline
    def apply(
        DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined,
        DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DBClusterSnapshotAttributesResult = {
      val __obj = js.Dynamic.literal()
      DBClusterSnapshotAttributes.foreach(__v =>
        __obj.updateDynamic("DBClusterSnapshotAttributes")(__v.asInstanceOf[js.Any])
      )
      DBClusterSnapshotIdentifier.foreach(__v =>
        __obj.updateDynamic("DBClusterSnapshotIdentifier")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DBClusterSnapshotAttributesResult]
    }
  }

  @js.native
  trait DBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterSnapshotMessage {
    @inline
    def apply(
        DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterSnapshots.foreach(__v => __obj.updateDynamic("DBClusterSnapshots")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterSnapshotMessage]
    }
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
    @inline
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
        ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined
    ): DBEngineVersion = {
      val __obj = js.Dynamic.literal()
      DBEngineDescription.foreach(__v => __obj.updateDynamic("DBEngineDescription")(__v.asInstanceOf[js.Any]))
      DBEngineVersionDescription.foreach(__v =>
        __obj.updateDynamic("DBEngineVersionDescription")(__v.asInstanceOf[js.Any])
      )
      DBParameterGroupFamily.foreach(__v => __obj.updateDynamic("DBParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      DefaultCharacterSet.foreach(__v => __obj.updateDynamic("DefaultCharacterSet")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      ExportableLogTypes.foreach(__v => __obj.updateDynamic("ExportableLogTypes")(__v.asInstanceOf[js.Any]))
      SupportedCharacterSets.foreach(__v => __obj.updateDynamic("SupportedCharacterSets")(__v.asInstanceOf[js.Any]))
      SupportedTimezones.foreach(__v => __obj.updateDynamic("SupportedTimezones")(__v.asInstanceOf[js.Any]))
      SupportsLogExportsToCloudwatchLogs.foreach(__v =>
        __obj.updateDynamic("SupportsLogExportsToCloudwatchLogs")(__v.asInstanceOf[js.Any])
      )
      SupportsReadReplica.foreach(__v => __obj.updateDynamic("SupportsReadReplica")(__v.asInstanceOf[js.Any]))
      ValidUpgradeTarget.foreach(__v => __obj.updateDynamic("ValidUpgradeTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBEngineVersion]
    }
  }

  @js.native
  trait DBEngineVersionMessage extends js.Object {
    var DBEngineVersions: js.UndefOr[DBEngineVersionList]
    var Marker: js.UndefOr[String]
  }

  object DBEngineVersionMessage {
    @inline
    def apply(
        DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBEngineVersionMessage = {
      val __obj = js.Dynamic.literal()
      DBEngineVersions.foreach(__v => __obj.updateDynamic("DBEngineVersions")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBEngineVersionMessage]
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
    @inline
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
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): DBInstance = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CACertificateIdentifier.foreach(__v => __obj.updateDynamic("CACertificateIdentifier")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      DBInstanceArn.foreach(__v => __obj.updateDynamic("DBInstanceArn")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DBInstanceStatus.foreach(__v => __obj.updateDynamic("DBInstanceStatus")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      DBParameterGroups.foreach(__v => __obj.updateDynamic("DBParameterGroups")(__v.asInstanceOf[js.Any]))
      DBSecurityGroups.foreach(__v => __obj.updateDynamic("DBSecurityGroups")(__v.asInstanceOf[js.Any]))
      DBSubnetGroup.foreach(__v => __obj.updateDynamic("DBSubnetGroup")(__v.asInstanceOf[js.Any]))
      DbInstancePort.foreach(__v => __obj.updateDynamic("DbInstancePort")(__v.asInstanceOf[js.Any]))
      DbiResourceId.foreach(__v => __obj.updateDynamic("DbiResourceId")(__v.asInstanceOf[js.Any]))
      DomainMemberships.foreach(__v => __obj.updateDynamic("DomainMemberships")(__v.asInstanceOf[js.Any]))
      EnabledCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnabledCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      EnhancedMonitoringResourceArn.foreach(__v =>
        __obj.updateDynamic("EnhancedMonitoringResourceArn")(__v.asInstanceOf[js.Any])
      )
      IAMDatabaseAuthenticationEnabled.foreach(__v =>
        __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any])
      )
      InstanceCreateTime.foreach(__v => __obj.updateDynamic("InstanceCreateTime")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LatestRestorableTime.foreach(__v => __obj.updateDynamic("LatestRestorableTime")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      MonitoringInterval.foreach(__v => __obj.updateDynamic("MonitoringInterval")(__v.asInstanceOf[js.Any]))
      MonitoringRoleArn.foreach(__v => __obj.updateDynamic("MonitoringRoleArn")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OptionGroupMemberships.foreach(__v => __obj.updateDynamic("OptionGroupMemberships")(__v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.updateDynamic("PendingModifiedValues")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsEnabled.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsEnabled")(__v.asInstanceOf[js.Any])
      )
      PerformanceInsightsKMSKeyId.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsKMSKeyId")(__v.asInstanceOf[js.Any])
      )
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      PromotionTier.foreach(__v => __obj.updateDynamic("PromotionTier")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      ReadReplicaDBClusterIdentifiers.foreach(__v =>
        __obj.updateDynamic("ReadReplicaDBClusterIdentifiers")(__v.asInstanceOf[js.Any])
      )
      ReadReplicaDBInstanceIdentifiers.foreach(__v =>
        __obj.updateDynamic("ReadReplicaDBInstanceIdentifiers")(__v.asInstanceOf[js.Any])
      )
      ReadReplicaSourceDBInstanceIdentifier.foreach(__v =>
        __obj.updateDynamic("ReadReplicaSourceDBInstanceIdentifier")(__v.asInstanceOf[js.Any])
      )
      SecondaryAvailabilityZone.foreach(__v =>
        __obj.updateDynamic("SecondaryAvailabilityZone")(__v.asInstanceOf[js.Any])
      )
      StatusInfos.foreach(__v => __obj.updateDynamic("StatusInfos")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.updateDynamic("VpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBInstance]
    }
  }

  @js.native
  trait DBInstanceMessage extends js.Object {
    var DBInstances: js.UndefOr[DBInstanceList]
    var Marker: js.UndefOr[String]
  }

  object DBInstanceMessage {
    @inline
    def apply(
        DBInstances: js.UndefOr[DBInstanceList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBInstanceMessage = {
      val __obj = js.Dynamic.literal()
      DBInstances.foreach(__v => __obj.updateDynamic("DBInstances")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Normal: js.UndefOr[Boolean] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        StatusType: js.UndefOr[String] = js.undefined
    ): DBInstanceStatusInfo = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Normal.foreach(__v => __obj.updateDynamic("Normal")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusType.foreach(__v => __obj.updateDynamic("StatusType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBInstanceStatusInfo]
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
    @inline
    def apply(
        DBParameterGroupArn: js.UndefOr[String] = js.undefined,
        DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
        DBParameterGroupName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined
    ): DBParameterGroup = {
      val __obj = js.Dynamic.literal()
      DBParameterGroupArn.foreach(__v => __obj.updateDynamic("DBParameterGroupArn")(__v.asInstanceOf[js.Any]))
      DBParameterGroupFamily.foreach(__v => __obj.updateDynamic("DBParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBParameterGroup]
    }
  }

  @js.native
  trait DBParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object DBParameterGroupDetails {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): DBParameterGroupDetails = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBParameterGroupDetails]
    }
  }

  @js.native
  trait DBParameterGroupNameMessage extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
  }

  object DBParameterGroupNameMessage {
    @inline
    def apply(
        DBParameterGroupName: js.UndefOr[String] = js.undefined
    ): DBParameterGroupNameMessage = {
      val __obj = js.Dynamic.literal()
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBParameterGroupNameMessage]
    }
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
    @inline
    def apply(
        DBParameterGroupName: js.UndefOr[String] = js.undefined,
        ParameterApplyStatus: js.UndefOr[String] = js.undefined
    ): DBParameterGroupStatus = {
      val __obj = js.Dynamic.literal()
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      ParameterApplyStatus.foreach(__v => __obj.updateDynamic("ParameterApplyStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBParameterGroupStatus]
    }
  }

  @js.native
  trait DBParameterGroupsMessage extends js.Object {
    var DBParameterGroups: js.UndefOr[DBParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  object DBParameterGroupsMessage {
    @inline
    def apply(
        DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBParameterGroupsMessage = {
      val __obj = js.Dynamic.literal()
      DBParameterGroups.foreach(__v => __obj.updateDynamic("DBParameterGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBParameterGroupsMessage]
    }
  }

  /**
    * Specifies membership in a designated DB security group.
    */
  @js.native
  trait DBSecurityGroupMembership extends js.Object {
    var DBSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBSecurityGroupMembership {
    @inline
    def apply(
        DBSecurityGroupName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DBSecurityGroupMembership = {
      val __obj = js.Dynamic.literal()
      DBSecurityGroupName.foreach(__v => __obj.updateDynamic("DBSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSecurityGroupMembership]
    }
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
    @inline
    def apply(
        DBSubnetGroupArn: js.UndefOr[String] = js.undefined,
        DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        SubnetGroupStatus: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): DBSubnetGroup = {
      val __obj = js.Dynamic.literal()
      DBSubnetGroupArn.foreach(__v => __obj.updateDynamic("DBSubnetGroupArn")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupDescription.foreach(__v => __obj.updateDynamic("DBSubnetGroupDescription")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      SubnetGroupStatus.foreach(__v => __obj.updateDynamic("SubnetGroupStatus")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSubnetGroup]
    }
  }

  @js.native
  trait DBSubnetGroupMessage extends js.Object {
    var DBSubnetGroups: js.UndefOr[DBSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  object DBSubnetGroupMessage {
    @inline
    def apply(
        DBSubnetGroups: js.UndefOr[DBSubnetGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBSubnetGroupMessage = {
      val __obj = js.Dynamic.literal()
      DBSubnetGroups.foreach(__v => __obj.updateDynamic("DBSubnetGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSubnetGroupMessage]
    }
  }

  @js.native
  trait DeleteDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
  }

  object DeleteDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
    ): DeleteDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      FinalDBSnapshotIdentifier.foreach(__v =>
        __obj.updateDynamic("FinalDBSnapshotIdentifier")(__v.asInstanceOf[js.Any])
      )
      SkipFinalSnapshot.foreach(__v => __obj.updateDynamic("SkipFinalSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBClusterMessage]
    }
  }

  @js.native
  trait DeleteDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
  }

  object DeleteDBClusterParameterGroupMessage {
    @inline
    def apply(
        DBClusterParameterGroupName: String
    ): DeleteDBClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): DeleteDBClusterResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBClusterResult]
    }
  }

  @js.native
  trait DeleteDBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshotIdentifier: String
  }

  object DeleteDBClusterSnapshotMessage {
    @inline
    def apply(
        DBClusterSnapshotIdentifier: String
    ): DeleteDBClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
    ): DeleteDBClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBClusterSnapshot.foreach(__v => __obj.updateDynamic("DBClusterSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBClusterSnapshotResult]
    }
  }

  @js.native
  trait DeleteDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
  }

  object DeleteDBInstanceMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String,
        FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
    ): DeleteDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      FinalDBSnapshotIdentifier.foreach(__v =>
        __obj.updateDynamic("FinalDBSnapshotIdentifier")(__v.asInstanceOf[js.Any])
      )
      SkipFinalSnapshot.foreach(__v => __obj.updateDynamic("SkipFinalSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBInstanceMessage]
    }
  }

  @js.native
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object DeleteDBInstanceResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): DeleteDBInstanceResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBInstanceResult]
    }
  }

  @js.native
  trait DeleteDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
  }

  object DeleteDBParameterGroupMessage {
    @inline
    def apply(
        DBParameterGroupName: String
    ): DeleteDBParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBParameterGroupMessage]
    }
  }

  @js.native
  trait DeleteDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
  }

  object DeleteDBSubnetGroupMessage {
    @inline
    def apply(
        DBSubnetGroupName: String
    ): DeleteDBSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBSubnetGroupMessage]
    }
  }

  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  object DeleteEventSubscriptionMessage {
    @inline
    def apply(
        SubscriptionName: String
    ): DeleteEventSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  @js.native
  trait DeleteEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object DeleteEventSubscriptionResult {
    @inline
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): DeleteEventSubscriptionResult = {
      val __obj = js.Dynamic.literal()
      EventSubscription.foreach(__v => __obj.updateDynamic("EventSubscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEventSubscriptionResult]
    }
  }

  @js.native
  trait DescribeDBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBClusterParameterGroupsMessage {
    @inline
    def apply(
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBClusterParameterGroupsMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClusterParameterGroupsMessage]
    }
  }

  @js.native
  trait DescribeDBClusterParametersMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  object DescribeDBClusterParametersMessage {
    @inline
    def apply(
        DBClusterParameterGroupName: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): DescribeDBClusterParametersMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClusterParametersMessage]
    }
  }

  @js.native
  trait DescribeDBClusterSnapshotAttributesMessage extends js.Object {
    var DBClusterSnapshotIdentifier: String
  }

  object DescribeDBClusterSnapshotAttributesMessage {
    @inline
    def apply(
        DBClusterSnapshotIdentifier: String
    ): DescribeDBClusterSnapshotAttributesMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined
    ): DescribeDBClusterSnapshotAttributesResult = {
      val __obj = js.Dynamic.literal()
      DBClusterSnapshotAttributesResult.foreach(__v =>
        __obj.updateDynamic("DBClusterSnapshotAttributesResult")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesResult]
    }
  }

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
    @inline
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
      val __obj = js.Dynamic.literal()
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      DBClusterSnapshotIdentifier.foreach(__v =>
        __obj.updateDynamic("DBClusterSnapshotIdentifier")(__v.asInstanceOf[js.Any])
      )
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      IncludePublic.foreach(__v => __obj.updateDynamic("IncludePublic")(__v.asInstanceOf[js.Any]))
      IncludeShared.foreach(__v => __obj.updateDynamic("IncludeShared")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.updateDynamic("SnapshotType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClusterSnapshotsMessage]
    }
  }

  @js.native
  trait DescribeDBClustersMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBClustersMessage {
    @inline
    def apply(
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBClustersMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClustersMessage]
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
    @inline
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
      val __obj = js.Dynamic.literal()
      DBParameterGroupFamily.foreach(__v => __obj.updateDynamic("DBParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      DefaultOnly.foreach(__v => __obj.updateDynamic("DefaultOnly")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      ListSupportedCharacterSets.foreach(__v =>
        __obj.updateDynamic("ListSupportedCharacterSets")(__v.asInstanceOf[js.Any])
      )
      ListSupportedTimezones.foreach(__v => __obj.updateDynamic("ListSupportedTimezones")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBEngineVersionsMessage]
    }
  }

  @js.native
  trait DescribeDBInstancesMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBInstancesMessage {
    @inline
    def apply(
        DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBInstancesMessage = {
      val __obj = js.Dynamic.literal()
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBInstancesMessage]
    }
  }

  @js.native
  trait DescribeDBParameterGroupsMessage extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBParameterGroupsMessage {
    @inline
    def apply(
        DBParameterGroupName: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBParameterGroupsMessage = {
      val __obj = js.Dynamic.literal()
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBParameterGroupsMessage]
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
    @inline
    def apply(
        DBParameterGroupName: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): DescribeDBParametersMessage = {
      val __obj = js.Dynamic.literal(
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBParametersMessage]
    }
  }

  @js.native
  trait DescribeDBSubnetGroupsMessage extends js.Object {
    var DBSubnetGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBSubnetGroupsMessage {
    @inline
    def apply(
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBSubnetGroupsMessage = {
      val __obj = js.Dynamic.literal()
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBSubnetGroupsMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultClusterParametersMessage extends js.Object {
    var DBParameterGroupFamily: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEngineDefaultClusterParametersMessage {
    @inline
    def apply(
        DBParameterGroupFamily: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEngineDefaultClusterParametersMessage = {
      val __obj = js.Dynamic.literal(
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineDefaultClusterParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultClusterParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  object DescribeEngineDefaultClusterParametersResult {
    @inline
    def apply(
        EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
    ): DescribeEngineDefaultClusterParametersResult = {
      val __obj = js.Dynamic.literal()
      EngineDefaults.foreach(__v => __obj.updateDynamic("EngineDefaults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineDefaultClusterParametersResult]
    }
  }

  @js.native
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    var DBParameterGroupFamily: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEngineDefaultParametersMessage {
    @inline
    def apply(
        DBParameterGroupFamily: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEngineDefaultParametersMessage = {
      val __obj = js.Dynamic.literal(
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineDefaultParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  object DescribeEngineDefaultParametersResult {
    @inline
    def apply(
        EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
    ): DescribeEngineDefaultParametersResult = {
      val __obj = js.Dynamic.literal()
      EngineDefaults.foreach(__v => __obj.updateDynamic("EngineDefaults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineDefaultParametersResult]
    }
  }

  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SourceType: js.UndefOr[String]
  }

  object DescribeEventCategoriesMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): DescribeEventCategoriesMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SubscriptionName: js.UndefOr[String] = js.undefined
    ): DescribeEventSubscriptionsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SubscriptionName.foreach(__v => __obj.updateDynamic("SubscriptionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

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
    @inline
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
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.updateDynamic("SourceIdentifier")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsMessage]
    }
  }

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
    @inline
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
      val __obj = js.Dynamic.literal(
        "Engine" -> Engine.asInstanceOf[js.Any]
      )

      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      Vpc.foreach(__v => __obj.updateDynamic("Vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
    }
  }

  @js.native
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ResourceIdentifier: js.UndefOr[String]
  }

  object DescribePendingMaintenanceActionsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined
    ): DescribePendingMaintenanceActionsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingMaintenanceActionsMessage]
    }
  }

  @js.native
  trait DescribeValidDBInstanceModificationsMessage extends js.Object {
    var DBInstanceIdentifier: String
  }

  object DescribeValidDBInstanceModificationsMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String
    ): DescribeValidDBInstanceModificationsMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeValidDBInstanceModificationsMessage]
    }
  }

  @js.native
  trait DescribeValidDBInstanceModificationsResult extends js.Object {
    var ValidDBInstanceModificationsMessage: js.UndefOr[ValidDBInstanceModificationsMessage]
  }

  object DescribeValidDBInstanceModificationsResult {
    @inline
    def apply(
        ValidDBInstanceModificationsMessage: js.UndefOr[ValidDBInstanceModificationsMessage] = js.undefined
    ): DescribeValidDBInstanceModificationsResult = {
      val __obj = js.Dynamic.literal()
      ValidDBInstanceModificationsMessage.foreach(__v =>
        __obj.updateDynamic("ValidDBInstanceModificationsMessage")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeValidDBInstanceModificationsResult]
    }
  }

  /**
    * An Active Directory Domain membership record associated with a DB instance.
    */
  @js.native
  trait DomainMembership extends js.Object {
    var Domain: js.UndefOr[String]
    var FQDN: js.UndefOr[String]
    var IAMRoleName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DomainMembership {
    @inline
    def apply(
        Domain: js.UndefOr[String] = js.undefined,
        FQDN: js.UndefOr[String] = js.undefined,
        IAMRoleName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DomainMembership = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      FQDN.foreach(__v => __obj.updateDynamic("FQDN")(__v.asInstanceOf[js.Any]))
      IAMRoleName.foreach(__v => __obj.updateDynamic("IAMRoleName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainMembership]
    }
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
    @inline
    def apply(
        From: js.UndefOr[Double] = js.undefined,
        To: js.UndefOr[Double] = js.undefined
    ): DoubleRange = {
      val __obj = js.Dynamic.literal()
      From.foreach(__v => __obj.updateDynamic("From")(__v.asInstanceOf[js.Any]))
      To.foreach(__v => __obj.updateDynamic("To")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DoubleRange]
    }
  }

  /**
    * Specifies a connection endpoint.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  object Endpoint {
    @inline
    def apply(
        Address: js.UndefOr[String] = js.undefined,
        HostedZoneId: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
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
    @inline
    def apply(
        DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): EngineDefaults = {
      val __obj = js.Dynamic.literal()
      DBParameterGroupFamily.foreach(__v => __obj.updateDynamic("DBParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineDefaults]
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
    @inline
    def apply(
        Date: js.UndefOr[TStamp] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        SourceArn: js.UndefOr[String] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.updateDynamic("SourceIdentifier")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
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
    @inline
    def apply(
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): EventCategoriesMap = {
      val __obj = js.Dynamic.literal()
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventCategoriesMap]
    }
  }

  @js.native
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList]
  }

  object EventCategoriesMessage {
    @inline
    def apply(
        EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined
    ): EventCategoriesMessage = {
      val __obj = js.Dynamic.literal()
      EventCategoriesMapList.foreach(__v => __obj.updateDynamic("EventCategoriesMapList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventCategoriesMessage]
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
    @inline
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
        SubscriptionCreationTime: js.UndefOr[String] = js.undefined
    ): EventSubscription = {
      val __obj = js.Dynamic.literal()
      CustSubscriptionId.foreach(__v => __obj.updateDynamic("CustSubscriptionId")(__v.asInstanceOf[js.Any]))
      CustomerAwsId.foreach(__v => __obj.updateDynamic("CustomerAwsId")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategoriesList.foreach(__v => __obj.updateDynamic("EventCategoriesList")(__v.asInstanceOf[js.Any]))
      EventSubscriptionArn.foreach(__v => __obj.updateDynamic("EventSubscriptionArn")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SourceIdsList.foreach(__v => __obj.updateDynamic("SourceIdsList")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubscriptionCreationTime.foreach(__v => __obj.updateDynamic("SubscriptionCreationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSubscription]
    }
  }

  @js.native
  trait EventSubscriptionsMessage extends js.Object {
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
    var Marker: js.UndefOr[String]
  }

  object EventSubscriptionsMessage {
    @inline
    def apply(
        EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): EventSubscriptionsMessage = {
      val __obj = js.Dynamic.literal()
      EventSubscriptionsList.foreach(__v => __obj.updateDynamic("EventSubscriptionsList")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSubscriptionsMessage]
    }
  }

  @js.native
  trait EventsMessage extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  object EventsMessage {
    @inline
    def apply(
        Events: js.UndefOr[EventList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): EventsMessage = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsMessage]
    }
  }

  @js.native
  trait FailoverDBClusterMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var TargetDBInstanceIdentifier: js.UndefOr[String]
  }

  object FailoverDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
    ): FailoverDBClusterMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      TargetDBInstanceIdentifier.foreach(__v =>
        __obj.updateDynamic("TargetDBInstanceIdentifier")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[FailoverDBClusterMessage]
    }
  }

  @js.native
  trait FailoverDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object FailoverDBClusterResult {
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): FailoverDBClusterResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailoverDBClusterResult]
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
    @inline
    def apply(
        Name: String,
        Values: FilterValueList
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
    var Filters: js.UndefOr[FilterList]
  }

  object ListTagsForResourceMessage {
    @inline
    def apply(
        ResourceName: String,
        Filters: js.UndefOr[FilterList] = js.undefined
    ): ListTagsForResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceMessage]
    }
  }

  @js.native
  trait ModifyDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration]
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
    @inline
    def apply(
        DBClusterIdentifier: String,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MasterUserPassword: js.UndefOr[String] = js.undefined,
        NewDBClusterIdentifier: js.UndefOr[String] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredBackupWindow: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): ModifyDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CloudwatchLogsExportConfiguration.foreach(__v =>
        __obj.updateDynamic("CloudwatchLogsExportConfiguration")(__v.asInstanceOf[js.Any])
      )
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      NewDBClusterIdentifier.foreach(__v => __obj.updateDynamic("NewDBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBClusterMessage]
    }
  }

  @js.native
  trait ModifyDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Parameters: ParametersList
  }

  object ModifyDBClusterParameterGroupMessage {
    @inline
    def apply(
        DBClusterParameterGroupName: String,
        Parameters: ParametersList
    ): ModifyDBClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): ModifyDBClusterResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBClusterResult]
    }
  }

  @js.native
  trait ModifyDBClusterSnapshotAttributeMessage extends js.Object {
    var AttributeName: String
    var DBClusterSnapshotIdentifier: String
    var ValuesToAdd: js.UndefOr[AttributeValueList]
    var ValuesToRemove: js.UndefOr[AttributeValueList]
  }

  object ModifyDBClusterSnapshotAttributeMessage {
    @inline
    def apply(
        AttributeName: String,
        DBClusterSnapshotIdentifier: String,
        ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined,
        ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
    ): ModifyDBClusterSnapshotAttributeMessage = {
      val __obj = js.Dynamic.literal(
        "AttributeName"               -> AttributeName.asInstanceOf[js.Any],
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      ValuesToAdd.foreach(__v => __obj.updateDynamic("ValuesToAdd")(__v.asInstanceOf[js.Any]))
      ValuesToRemove.foreach(__v => __obj.updateDynamic("ValuesToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeMessage]
    }
  }

  @js.native
  trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult]
  }

  object ModifyDBClusterSnapshotAttributeResult {
    @inline
    def apply(
        DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined
    ): ModifyDBClusterSnapshotAttributeResult = {
      val __obj = js.Dynamic.literal()
      DBClusterSnapshotAttributesResult.foreach(__v =>
        __obj.updateDynamic("DBClusterSnapshotAttributesResult")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
    }
  }

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
    @inline
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
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): ModifyDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AllowMajorVersionUpgrade.foreach(__v => __obj.updateDynamic("AllowMajorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CACertificateIdentifier.foreach(__v => __obj.updateDynamic("CACertificateIdentifier")(__v.asInstanceOf[js.Any]))
      CloudwatchLogsExportConfiguration.foreach(__v =>
        __obj.updateDynamic("CloudwatchLogsExportConfiguration")(__v.asInstanceOf[js.Any])
      )
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      DBPortNumber.foreach(__v => __obj.updateDynamic("DBPortNumber")(__v.asInstanceOf[js.Any]))
      DBSecurityGroups.foreach(__v => __obj.updateDynamic("DBSecurityGroups")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      EnablePerformanceInsights.foreach(__v =>
        __obj.updateDynamic("EnablePerformanceInsights")(__v.asInstanceOf[js.Any])
      )
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      MonitoringInterval.foreach(__v => __obj.updateDynamic("MonitoringInterval")(__v.asInstanceOf[js.Any]))
      MonitoringRoleArn.foreach(__v => __obj.updateDynamic("MonitoringRoleArn")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      NewDBInstanceIdentifier.foreach(__v => __obj.updateDynamic("NewDBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsKMSKeyId.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsKMSKeyId")(__v.asInstanceOf[js.Any])
      )
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      PromotionTier.foreach(__v => __obj.updateDynamic("PromotionTier")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      TdeCredentialPassword.foreach(__v => __obj.updateDynamic("TdeCredentialPassword")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBInstanceMessage]
    }
  }

  @js.native
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object ModifyDBInstanceResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): ModifyDBInstanceResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBInstanceResult]
    }
  }

  @js.native
  trait ModifyDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var Parameters: ParametersList
  }

  object ModifyDBParameterGroupMessage {
    @inline
    def apply(
        DBParameterGroupName: String,
        Parameters: ParametersList
    ): ModifyDBParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any],
        "Parameters"           -> Parameters.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyDBParameterGroupMessage]
    }
  }

  @js.native
  trait ModifyDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var DBSubnetGroupDescription: js.UndefOr[String]
  }

  object ModifyDBSubnetGroupMessage {
    @inline
    def apply(
        DBSubnetGroupName: String,
        SubnetIds: SubnetIdentifierList,
        DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
    ): ModifyDBSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"         -> SubnetIds.asInstanceOf[js.Any]
      )

      DBSubnetGroupDescription.foreach(__v => __obj.updateDynamic("DBSubnetGroupDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  object ModifyDBSubnetGroupResult {
    @inline
    def apply(
        DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
    ): ModifyDBSubnetGroupResult = {
      val __obj = js.Dynamic.literal()
      DBSubnetGroup.foreach(__v => __obj.updateDynamic("DBSubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBSubnetGroupResult]
    }
  }

  @js.native
  trait ModifyEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SnsTopicArn: js.UndefOr[String]
    var SourceType: js.UndefOr[String]
  }

  object ModifyEventSubscriptionMessage {
    @inline
    def apply(
        SubscriptionName: String,
        Enabled: js.UndefOr[BooleanOptional] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): ModifyEventSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  @js.native
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object ModifyEventSubscriptionResult {
    @inline
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): ModifyEventSubscriptionResult = {
      val __obj = js.Dynamic.literal()
      EventSubscription.foreach(__v => __obj.updateDynamic("EventSubscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEventSubscriptionResult]
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
    @inline
    def apply(
        OptionGroupName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): OptionGroupMembership = {
      val __obj = js.Dynamic.literal()
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionGroupMembership]
    }
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
    @inline
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
        Vpc: js.UndefOr[Boolean] = js.undefined
    ): OrderableDBInstanceOption = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MaxIopsPerDbInstance.foreach(__v => __obj.updateDynamic("MaxIopsPerDbInstance")(__v.asInstanceOf[js.Any]))
      MaxIopsPerGib.foreach(__v => __obj.updateDynamic("MaxIopsPerGib")(__v.asInstanceOf[js.Any]))
      MaxStorageSize.foreach(__v => __obj.updateDynamic("MaxStorageSize")(__v.asInstanceOf[js.Any]))
      MinIopsPerDbInstance.foreach(__v => __obj.updateDynamic("MinIopsPerDbInstance")(__v.asInstanceOf[js.Any]))
      MinIopsPerGib.foreach(__v => __obj.updateDynamic("MinIopsPerGib")(__v.asInstanceOf[js.Any]))
      MinStorageSize.foreach(__v => __obj.updateDynamic("MinStorageSize")(__v.asInstanceOf[js.Any]))
      MultiAZCapable.foreach(__v => __obj.updateDynamic("MultiAZCapable")(__v.asInstanceOf[js.Any]))
      ReadReplicaCapable.foreach(__v => __obj.updateDynamic("ReadReplicaCapable")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      SupportsEnhancedMonitoring.foreach(__v =>
        __obj.updateDynamic("SupportsEnhancedMonitoring")(__v.asInstanceOf[js.Any])
      )
      SupportsIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("SupportsIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      SupportsIops.foreach(__v => __obj.updateDynamic("SupportsIops")(__v.asInstanceOf[js.Any]))
      SupportsPerformanceInsights.foreach(__v =>
        __obj.updateDynamic("SupportsPerformanceInsights")(__v.asInstanceOf[js.Any])
      )
      SupportsStorageEncryption.foreach(__v =>
        __obj.updateDynamic("SupportsStorageEncryption")(__v.asInstanceOf[js.Any])
      )
      Vpc.foreach(__v => __obj.updateDynamic("Vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderableDBInstanceOption]
    }
  }

  @js.native
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList]
  }

  object OrderableDBInstanceOptionsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined
    ): OrderableDBInstanceOptionsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      OrderableDBInstanceOptions.foreach(__v =>
        __obj.updateDynamic("OrderableDBInstanceOptions")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[OrderableDBInstanceOptionsMessage]
    }
  }

  /**
    * Specifies a parameter.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      ApplyMethod.foreach(__v => __obj.updateDynamic("ApplyMethod")(__v.asInstanceOf[js.Any]))
      ApplyType.foreach(__v => __obj.updateDynamic("ApplyType")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsModifiable.foreach(__v => __obj.updateDynamic("IsModifiable")(__v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.updateDynamic("MinimumEngineVersion")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      ParameterValue.foreach(__v => __obj.updateDynamic("ParameterValue")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
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
    @inline
    def apply(
        LogTypesToDisable: js.UndefOr[LogTypeList] = js.undefined,
        LogTypesToEnable: js.UndefOr[LogTypeList] = js.undefined
    ): PendingCloudwatchLogsExports = {
      val __obj = js.Dynamic.literal()
      LogTypesToDisable.foreach(__v => __obj.updateDynamic("LogTypesToDisable")(__v.asInstanceOf[js.Any]))
      LogTypesToEnable.foreach(__v => __obj.updateDynamic("LogTypesToEnable")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Action: js.UndefOr[String] = js.undefined,
        AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined,
        CurrentApplyDate: js.UndefOr[TStamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForcedApplyDate: js.UndefOr[TStamp] = js.undefined,
        OptInStatus: js.UndefOr[String] = js.undefined
    ): PendingMaintenanceAction = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      AutoAppliedAfterDate.foreach(__v => __obj.updateDynamic("AutoAppliedAfterDate")(__v.asInstanceOf[js.Any]))
      CurrentApplyDate.foreach(__v => __obj.updateDynamic("CurrentApplyDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ForcedApplyDate.foreach(__v => __obj.updateDynamic("ForcedApplyDate")(__v.asInstanceOf[js.Any]))
      OptInStatus.foreach(__v => __obj.updateDynamic("OptInStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingMaintenanceAction]
    }
  }

  @js.native
  trait PendingMaintenanceActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
  }

  object PendingMaintenanceActionsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined
    ): PendingMaintenanceActionsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      PendingMaintenanceActions.foreach(__v =>
        __obj.updateDynamic("PendingMaintenanceActions")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PendingMaintenanceActionsMessage]
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
    @inline
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
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CACertificateIdentifier.foreach(__v => __obj.updateDynamic("CACertificateIdentifier")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      PendingCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("PendingCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingModifiedValues]
    }
  }

  @js.native
  trait PromoteReadReplicaDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  object PromoteReadReplicaDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String
    ): PromoteReadReplicaDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PromoteReadReplicaDBClusterMessage]
    }
  }

  @js.native
  trait PromoteReadReplicaDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object PromoteReadReplicaDBClusterResult {
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): PromoteReadReplicaDBClusterResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PromoteReadReplicaDBClusterResult]
    }
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
    @inline
    def apply(
        From: js.UndefOr[Int] = js.undefined,
        Step: js.UndefOr[IntegerOptional] = js.undefined,
        To: js.UndefOr[Int] = js.undefined
    ): Range = {
      val __obj = js.Dynamic.literal()
      From.foreach(__v => __obj.updateDynamic("From")(__v.asInstanceOf[js.Any]))
      Step.foreach(__v => __obj.updateDynamic("Step")(__v.asInstanceOf[js.Any]))
      To.foreach(__v => __obj.updateDynamic("To")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Range]
    }
  }

  @js.native
  trait RebootDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  object RebootDBInstanceMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String,
        ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
    ): RebootDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      ForceFailover.foreach(__v => __obj.updateDynamic("ForceFailover")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootDBInstanceMessage]
    }
  }

  @js.native
  trait RebootDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RebootDBInstanceResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): RebootDBInstanceResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootDBInstanceResult]
    }
  }

  @js.native
  trait RemoveRoleFromDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
  }

  object RemoveRoleFromDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        RoleArn: String
    ): RemoveRoleFromDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "RoleArn"             -> RoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveRoleFromDBClusterMessage]
    }
  }

  @js.native
  trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
    var SourceIdentifier: String
    var SubscriptionName: String
  }

  object RemoveSourceIdentifierFromSubscriptionMessage {
    @inline
    def apply(
        SourceIdentifier: String,
        SubscriptionName: String
    ): RemoveSourceIdentifierFromSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionMessage]
    }
  }

  @js.native
  trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object RemoveSourceIdentifierFromSubscriptionResult {
    @inline
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): RemoveSourceIdentifierFromSubscriptionResult = {
      val __obj = js.Dynamic.literal()
      EventSubscription.foreach(__v => __obj.updateDynamic("EventSubscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
    }
  }

  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceMessage {
    @inline
    def apply(
        ResourceName: String,
        TagKeys: KeyList
    ): RemoveTagsFromResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  @js.native
  trait ResetDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  object ResetDBClusterParameterGroupMessage {
    @inline
    def apply(
        DBClusterParameterGroupName: String,
        Parameters: js.UndefOr[ParametersList] = js.undefined,
        ResetAllParameters: js.UndefOr[Boolean] = js.undefined
    ): ResetDBClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResetAllParameters.foreach(__v => __obj.updateDynamic("ResetAllParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ResetDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  object ResetDBParameterGroupMessage {
    @inline
    def apply(
        DBParameterGroupName: String,
        Parameters: js.UndefOr[ParametersList] = js.undefined,
        ResetAllParameters: js.UndefOr[Boolean] = js.undefined
    ): ResetDBParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResetAllParameters.foreach(__v => __obj.updateDynamic("ResetAllParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetDBParameterGroupMessage]
    }
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
    @inline
    def apply(
        PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined
    ): ResourcePendingMaintenanceActions = {
      val __obj = js.Dynamic.literal()
      PendingMaintenanceActionDetails.foreach(__v =>
        __obj.updateDynamic("PendingMaintenanceActionDetails")(__v.asInstanceOf[js.Any])
      )
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePendingMaintenanceActions]
    }
  }

  @js.native
  trait RestoreDBClusterFromSnapshotMessage extends js.Object {
    var DBClusterIdentifier: String
    var Engine: String
    var SnapshotIdentifier: String
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object RestoreDBClusterFromSnapshotMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        Engine: String,
        SnapshotIdentifier: String,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBClusterFromSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any],
        "SnapshotIdentifier"  -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnableCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterFromSnapshotMessage]
    }
  }

  @js.native
  trait RestoreDBClusterFromSnapshotResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterFromSnapshotResult {
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): RestoreDBClusterFromSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterFromSnapshotResult]
    }
  }

  @js.native
  trait RestoreDBClusterToPointInTimeMessage extends js.Object {
    var DBClusterIdentifier: String
    var SourceDBClusterIdentifier: String
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
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
    @inline
    def apply(
        DBClusterIdentifier: String,
        SourceDBClusterIdentifier: String,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        RestoreToTime: js.UndefOr[TStamp] = js.undefined,
        RestoreType: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBClusterToPointInTimeMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier"       -> DBClusterIdentifier.asInstanceOf[js.Any],
        "SourceDBClusterIdentifier" -> SourceDBClusterIdentifier.asInstanceOf[js.Any]
      )

      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnableCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RestoreToTime.foreach(__v => __obj.updateDynamic("RestoreToTime")(__v.asInstanceOf[js.Any]))
      RestoreType.foreach(__v => __obj.updateDynamic("RestoreType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UseLatestRestorableTime.foreach(__v => __obj.updateDynamic("UseLatestRestorableTime")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterToPointInTimeMessage]
    }
  }

  @js.native
  trait RestoreDBClusterToPointInTimeResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterToPointInTimeResult {
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): RestoreDBClusterToPointInTimeResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
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

  /**
    * Specifies a subnet.
    *  This data type is used as a response element in the <a>DescribeDBSubnetGroups</a> action.
    */
  @js.native
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetStatus: js.UndefOr[String]
  }

  object Subnet {
    @inline
    def apply(
        SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        SubnetIdentifier: js.UndefOr[String] = js.undefined,
        SubnetStatus: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dynamic.literal()
      SubnetAvailabilityZone.foreach(__v => __obj.updateDynamic("SubnetAvailabilityZone")(__v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.updateDynamic("SubnetIdentifier")(__v.asInstanceOf[js.Any]))
      SubnetStatus.foreach(__v => __obj.updateDynamic("SubnetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subnet]
    }
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
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagListMessage extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object TagListMessage {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): TagListMessage = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagListMessage]
    }
  }

  /**
    * A time zone associated with a <a>DBInstance</a>.
    */
  @js.native
  trait Timezone extends js.Object {
    var TimezoneName: js.UndefOr[String]
  }

  object Timezone {
    @inline
    def apply(
        TimezoneName: js.UndefOr[String] = js.undefined
    ): Timezone = {
      val __obj = js.Dynamic.literal()
      TimezoneName.foreach(__v => __obj.updateDynamic("TimezoneName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Timezone]
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
    @inline
    def apply(
        AutoUpgrade: js.UndefOr[Boolean] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    ): UpgradeTarget = {
      val __obj = js.Dynamic.literal()
      AutoUpgrade.foreach(__v => __obj.updateDynamic("AutoUpgrade")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      IsMajorVersionUpgrade.foreach(__v => __obj.updateDynamic("IsMajorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeTarget]
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
    @inline
    def apply(
        Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined
    ): ValidDBInstanceModificationsMessage = {
      val __obj = js.Dynamic.literal()
      Storage.foreach(__v => __obj.updateDynamic("Storage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidDBInstanceModificationsMessage]
    }
  }

  /**
    * Information about valid modifications that you can make to your DB instance.
    *  Contains the result of a successful call to the <a>DescribeValidDBInstanceModifications</a> action.
    */
  @js.native
  trait ValidStorageOptions extends js.Object {
    var IopsToStorageRatio: js.UndefOr[DoubleRangeList]
    var ProvisionedIops: js.UndefOr[RangeList]
    var StorageSize: js.UndefOr[RangeList]
    var StorageType: js.UndefOr[String]
  }

  object ValidStorageOptions {
    @inline
    def apply(
        IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.undefined,
        ProvisionedIops: js.UndefOr[RangeList] = js.undefined,
        StorageSize: js.UndefOr[RangeList] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined
    ): ValidStorageOptions = {
      val __obj = js.Dynamic.literal()
      IopsToStorageRatio.foreach(__v => __obj.updateDynamic("IopsToStorageRatio")(__v.asInstanceOf[js.Any]))
      ProvisionedIops.foreach(__v => __obj.updateDynamic("ProvisionedIops")(__v.asInstanceOf[js.Any]))
      StorageSize.foreach(__v => __obj.updateDynamic("StorageSize")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidStorageOptions]
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
    @inline
    def apply(
        Status: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupId: js.UndefOr[String] = js.undefined
    ): VpcSecurityGroupMembership = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupId.foreach(__v => __obj.updateDynamic("VpcSecurityGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
