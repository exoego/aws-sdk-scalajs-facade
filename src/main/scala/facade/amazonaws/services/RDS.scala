package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object rds {
  type AccountQuotaList                        = js.Array[AccountQuota]
  type ApplyMethod                             = String
  type AttributeValueList                      = js.Array[String]
  type AvailabilityZoneList                    = js.Array[AvailabilityZone]
  type AvailabilityZones                       = js.Array[String]
  type AvailableProcessorFeatureList           = js.Array[AvailableProcessorFeature]
  type BooleanOptional                         = Boolean
  type CertificateList                         = js.Array[Certificate]
  type DBClusterBacktrackList                  = js.Array[DBClusterBacktrack]
  type DBClusterEndpointList                   = js.Array[DBClusterEndpoint]
  type DBClusterList                           = js.Array[DBCluster]
  type DBClusterMemberList                     = js.Array[DBClusterMember]
  type DBClusterOptionGroupMemberships         = js.Array[DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList             = js.Array[DBClusterParameterGroup]
  type DBClusterRoles                          = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList          = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList                   = js.Array[DBClusterSnapshot]
  type DBEngineVersionList                     = js.Array[DBEngineVersion]
  type DBInstanceAutomatedBackupList           = js.Array[DBInstanceAutomatedBackup]
  type DBInstanceList                          = js.Array[DBInstance]
  type DBInstanceStatusInfoList                = js.Array[DBInstanceStatusInfo]
  type DBParameterGroupList                    = js.Array[DBParameterGroup]
  type DBParameterGroupStatusList              = js.Array[DBParameterGroupStatus]
  type DBSecurityGroupMembershipList           = js.Array[DBSecurityGroupMembership]
  type DBSecurityGroupNameList                 = js.Array[String]
  type DBSecurityGroups                        = js.Array[DBSecurityGroup]
  type DBSnapshotAttributeList                 = js.Array[DBSnapshotAttribute]
  type DBSnapshotList                          = js.Array[DBSnapshot]
  type DBSubnetGroups                          = js.Array[DBSubnetGroup]
  type DescribeDBLogFilesList                  = js.Array[DescribeDBLogFilesDetails]
  type DomainMembershipList                    = js.Array[DomainMembership]
  type DoubleOptional                          = Double
  type DoubleRangeList                         = js.Array[DoubleRange]
  type EC2SecurityGroupList                    = js.Array[EC2SecurityGroup]
  type EngineModeList                          = js.Array[String]
  type EventCategoriesList                     = js.Array[String]
  type EventCategoriesMapList                  = js.Array[EventCategoriesMap]
  type EventList                               = js.Array[Event]
  type EventSubscriptionsList                  = js.Array[EventSubscription]
  type FilterList                              = js.Array[Filter]
  type FilterValueList                         = js.Array[String]
  type GlobalClusterList                       = js.Array[GlobalCluster]
  type GlobalClusterMemberList                 = js.Array[GlobalClusterMember]
  type IPRangeList                             = js.Array[IPRange]
  type IntegerOptional                         = Int
  type KeyList                                 = js.Array[String]
  type LogTypeList                             = js.Array[String]
  type LongOptional                            = Double
  type MinimumEngineVersionPerAllowedValueList = js.Array[MinimumEngineVersionPerAllowedValue]
  type OptionConfigurationList                 = js.Array[OptionConfiguration]
  type OptionGroupMembershipList               = js.Array[OptionGroupMembership]
  type OptionGroupOptionSettingsList           = js.Array[OptionGroupOptionSetting]
  type OptionGroupOptionVersionsList           = js.Array[OptionVersion]
  type OptionGroupOptionsList                  = js.Array[OptionGroupOption]
  type OptionGroupsList                        = js.Array[OptionGroup]
  type OptionNamesList                         = js.Array[String]
  type OptionSettingConfigurationList          = js.Array[OptionSetting]
  type OptionSettingsList                      = js.Array[OptionSetting]
  type OptionsConflictsWith                    = js.Array[String]
  type OptionsDependedOn                       = js.Array[String]
  type OptionsList                             = js.Array[Option]
  type OrderableDBInstanceOptionsList          = js.Array[OrderableDBInstanceOption]
  type ParametersList                          = js.Array[Parameter]
  type PendingMaintenanceActionDetails         = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions               = js.Array[ResourcePendingMaintenanceActions]
  type ProcessorFeatureList                    = js.Array[ProcessorFeature]
  type RangeList                               = js.Array[Range]
  type ReadReplicaDBClusterIdentifierList      = js.Array[String]
  type ReadReplicaDBInstanceIdentifierList     = js.Array[String]
  type ReadReplicaIdentifierList               = js.Array[String]
  type ReadersArnList                          = js.Array[String]
  type RecurringChargeList                     = js.Array[RecurringCharge]
  type ReservedDBInstanceList                  = js.Array[ReservedDBInstance]
  type ReservedDBInstancesOfferingList         = js.Array[ReservedDBInstancesOffering]
  type SourceIdsList                           = js.Array[String]
  type SourceRegionList                        = js.Array[SourceRegion]
  type SourceType                              = String
  type StringList                              = js.Array[String]
  type SubnetIdentifierList                    = js.Array[String]
  type SubnetList                              = js.Array[Subnet]
  type SupportedCharacterSetsList              = js.Array[CharacterSet]
  type SupportedTimezonesList                  = js.Array[Timezone]
  type TStamp                                  = js.Date
  type TagList                                 = js.Array[Tag]
  type ValidStorageOptionsList                 = js.Array[ValidStorageOptions]
  type ValidUpgradeTargetList                  = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList                  = js.Array[String]
  type VpcSecurityGroupMembershipList          = js.Array[VpcSecurityGroupMembership]
}

package rds {
  @js.native
  @JSImport("aws-sdk", "RDS")
  class RDS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addRoleToDBCluster(params: AddRoleToDBClusterMessage): Request[js.Object] = js.native
    def addSourceIdentifierToSubscription(
        params: AddSourceIdentifierToSubscriptionMessage
    ): Request[AddSourceIdentifierToSubscriptionResult]                         = js.native
    def addTagsToResource(params: AddTagsToResourceMessage): Request[js.Object] = js.native
    def applyPendingMaintenanceAction(
        params: ApplyPendingMaintenanceActionMessage
    ): Request[ApplyPendingMaintenanceActionResult] = js.native
    def authorizeDBSecurityGroupIngress(
        params: AuthorizeDBSecurityGroupIngressMessage
    ): Request[AuthorizeDBSecurityGroupIngressResult]                                      = js.native
    def backtrackDBCluster(params: BacktrackDBClusterMessage): Request[DBClusterBacktrack] = js.native
    def copyDBClusterParameterGroup(
        params: CopyDBClusterParameterGroupMessage
    ): Request[CopyDBClusterParameterGroupResult]                                                         = js.native
    def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): Request[CopyDBClusterSnapshotResult] = js.native
    def copyDBParameterGroup(params: CopyDBParameterGroupMessage): Request[CopyDBParameterGroupResult]    = js.native
    def copyDBSnapshot(params: CopyDBSnapshotMessage): Request[CopyDBSnapshotResult]                      = js.native
    def copyOptionGroup(params: CopyOptionGroupMessage): Request[CopyOptionGroupResult]                   = js.native
    def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult]                   = js.native
    def createDBClusterEndpoint(params: CreateDBClusterEndpointMessage): Request[DBClusterEndpoint]       = js.native
    def createDBClusterParameterGroup(
        params: CreateDBClusterParameterGroupMessage
    ): Request[CreateDBClusterParameterGroupResult] = js.native
    def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): Request[CreateDBClusterSnapshotResult] =
      js.native
    def createDBInstance(params: CreateDBInstanceMessage): Request[CreateDBInstanceResult] = js.native
    def createDBInstanceReadReplica(
        params: CreateDBInstanceReadReplicaMessage
    ): Request[CreateDBInstanceReadReplicaResult]                                                            = js.native
    def createDBParameterGroup(params: CreateDBParameterGroupMessage): Request[CreateDBParameterGroupResult] = js.native
    def createDBSecurityGroup(params: CreateDBSecurityGroupMessage): Request[CreateDBSecurityGroupResult]    = js.native
    def createDBSnapshot(params: CreateDBSnapshotMessage): Request[CreateDBSnapshotResult]                   = js.native
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult]          = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] =
      js.native
    def createGlobalCluster(params: CreateGlobalClusterMessage): Request[CreateGlobalClusterResult]     = js.native
    def createOptionGroup(params: CreateOptionGroupMessage): Request[CreateOptionGroupResult]           = js.native
    def deleteDBCluster(params: DeleteDBClusterMessage): Request[DeleteDBClusterResult]                 = js.native
    def deleteDBClusterEndpoint(params: DeleteDBClusterEndpointMessage): Request[DBClusterEndpoint]     = js.native
    def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): Request[js.Object] = js.native
    def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): Request[DeleteDBClusterSnapshotResult] =
      js.native
    def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult] = js.native
    def deleteDBInstanceAutomatedBackup(
        params: DeleteDBInstanceAutomatedBackupMessage
    ): Request[DeleteDBInstanceAutomatedBackupResult]                                      = js.native
    def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): Request[js.Object]  = js.native
    def deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage): Request[js.Object]    = js.native
    def deleteDBSnapshot(params: DeleteDBSnapshotMessage): Request[DeleteDBSnapshotResult] = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object]        = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResult] =
      js.native
    def deleteGlobalCluster(params: DeleteGlobalClusterMessage): Request[DeleteGlobalClusterResult] = js.native
    def deleteOptionGroup(params: DeleteOptionGroupMessage): Request[js.Object]                     = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[AccountAttributesMessage] =
      js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[CertificateMessage] = js.native
    def describeDBClusterBacktracks(params: DescribeDBClusterBacktracksMessage): Request[DBClusterBacktrackMessage] =
      js.native
    def describeDBClusterEndpoints(params: DescribeDBClusterEndpointsMessage): Request[DBClusterEndpointMessage] =
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
    def describeDBInstanceAutomatedBackups(
        params: DescribeDBInstanceAutomatedBackupsMessage
    ): Request[DBInstanceAutomatedBackupMessage]                                                   = js.native
    def describeDBInstances(params: DescribeDBInstancesMessage): Request[DBInstanceMessage]        = js.native
    def describeDBLogFiles(params: DescribeDBLogFilesMessage): Request[DescribeDBLogFilesResponse] = js.native
    def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage): Request[DBParameterGroupsMessage] =
      js.native
    def describeDBParameters(params: DescribeDBParametersMessage): Request[DBParameterGroupDetails]        = js.native
    def describeDBSecurityGroups(params: DescribeDBSecurityGroupsMessage): Request[DBSecurityGroupMessage] = js.native
    def describeDBSnapshotAttributes(
        params: DescribeDBSnapshotAttributesMessage
    ): Request[DescribeDBSnapshotAttributesResult]                                                   = js.native
    def describeDBSnapshots(params: DescribeDBSnapshotsMessage): Request[DBSnapshotMessage]          = js.native
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
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage]                         = js.native
    def describeGlobalClusters(params: DescribeGlobalClustersMessage): Request[GlobalClustersMessage] = js.native
    def describeOptionGroupOptions(params: DescribeOptionGroupOptionsMessage): Request[OptionGroupOptionsMessage] =
      js.native
    def describeOptionGroups(params: DescribeOptionGroupsMessage): Request[OptionGroups] = js.native
    def describeOrderableDBInstanceOptions(
        params: DescribeOrderableDBInstanceOptionsMessage
    ): Request[OrderableDBInstanceOptionsMessage] = js.native
    def describePendingMaintenanceActions(
        params: DescribePendingMaintenanceActionsMessage
    ): Request[PendingMaintenanceActionsMessage] = js.native
    def describeReservedDBInstances(params: DescribeReservedDBInstancesMessage): Request[ReservedDBInstanceMessage] =
      js.native
    def describeReservedDBInstancesOfferings(
        params: DescribeReservedDBInstancesOfferingsMessage
    ): Request[ReservedDBInstancesOfferingMessage]                                                = js.native
    def describeSourceRegions(params: DescribeSourceRegionsMessage): Request[SourceRegionMessage] = js.native
    def describeValidDBInstanceModifications(
        params: DescribeValidDBInstanceModificationsMessage
    ): Request[DescribeValidDBInstanceModificationsResult] = js.native
    def downloadDBLogFilePortion(params: DownloadDBLogFilePortionMessage): Request[DownloadDBLogFilePortionDetails] =
      js.native
    def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage]      = js.native
    def modifyCurrentDBClusterCapacity(params: ModifyCurrentDBClusterCapacityMessage): Request[DBClusterCapacityInfo] =
      js.native
    def modifyDBCluster(params: ModifyDBClusterMessage): Request[ModifyDBClusterResult]             = js.native
    def modifyDBClusterEndpoint(params: ModifyDBClusterEndpointMessage): Request[DBClusterEndpoint] = js.native
    def modifyDBClusterParameterGroup(
        params: ModifyDBClusterParameterGroupMessage
    ): Request[DBClusterParameterGroupNameMessage] = js.native
    def modifyDBClusterSnapshotAttribute(
        params: ModifyDBClusterSnapshotAttributeMessage
    ): Request[ModifyDBClusterSnapshotAttributeResult]                                                      = js.native
    def modifyDBInstance(params: ModifyDBInstanceMessage): Request[ModifyDBInstanceResult]                  = js.native
    def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def modifyDBSnapshot(params: ModifyDBSnapshotMessage): Request[ModifyDBSnapshotResult]                  = js.native
    def modifyDBSnapshotAttribute(params: ModifyDBSnapshotAttributeMessage): Request[ModifyDBSnapshotAttributeResult] =
      js.native
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): Request[ModifyDBSubnetGroupResult] = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult] =
      js.native
    def modifyGlobalCluster(params: ModifyGlobalClusterMessage): Request[ModifyGlobalClusterResult] = js.native
    def modifyOptionGroup(params: ModifyOptionGroupMessage): Request[ModifyOptionGroupResult]       = js.native
    def promoteReadReplica(params: PromoteReadReplicaMessage): Request[PromoteReadReplicaResult]    = js.native
    def promoteReadReplicaDBCluster(
        params: PromoteReadReplicaDBClusterMessage
    ): Request[PromoteReadReplicaDBClusterResult] = js.native
    def purchaseReservedDBInstancesOffering(
        params: PurchaseReservedDBInstancesOfferingMessage
    ): Request[PurchaseReservedDBInstancesOfferingResult]                                  = js.native
    def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult] = js.native
    def removeFromGlobalCluster(params: RemoveFromGlobalClusterMessage): Request[RemoveFromGlobalClusterResult] =
      js.native
    def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): Request[js.Object] = js.native
    def removeSourceIdentifierFromSubscription(
        params: RemoveSourceIdentifierFromSubscriptionMessage
    ): Request[RemoveSourceIdentifierFromSubscriptionResult]                              = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object] = js.native
    def resetDBClusterParameterGroup(
        params: ResetDBClusterParameterGroupMessage
    ): Request[DBClusterParameterGroupNameMessage]                                                           = js.native
    def resetDBParameterGroup(params: ResetDBParameterGroupMessage): Request[DBParameterGroupNameMessage]    = js.native
    def restoreDBClusterFromS3(params: RestoreDBClusterFromS3Message): Request[RestoreDBClusterFromS3Result] = js.native
    def restoreDBClusterFromSnapshot(
        params: RestoreDBClusterFromSnapshotMessage
    ): Request[RestoreDBClusterFromSnapshotResult] = js.native
    def restoreDBClusterToPointInTime(
        params: RestoreDBClusterToPointInTimeMessage
    ): Request[RestoreDBClusterToPointInTimeResult] = js.native
    def restoreDBInstanceFromDBSnapshot(
        params: RestoreDBInstanceFromDBSnapshotMessage
    ): Request[RestoreDBInstanceFromDBSnapshotResult] = js.native
    def restoreDBInstanceFromS3(params: RestoreDBInstanceFromS3Message): Request[RestoreDBInstanceFromS3Result] =
      js.native
    def restoreDBInstanceToPointInTime(
        params: RestoreDBInstanceToPointInTimeMessage
    ): Request[RestoreDBInstanceToPointInTimeResult] = js.native
    def revokeDBSecurityGroupIngress(
        params: RevokeDBSecurityGroupIngressMessage
    ): Request[RevokeDBSecurityGroupIngressResult]                                      = js.native
    def startDBCluster(params: StartDBClusterMessage): Request[StartDBClusterResult]    = js.native
    def startDBInstance(params: StartDBInstanceMessage): Request[StartDBInstanceResult] = js.native
    def stopDBCluster(params: StopDBClusterMessage): Request[StopDBClusterResult]       = js.native
    def stopDBInstance(params: StopDBInstanceMessage): Request[StopDBInstanceResult]    = js.native
  }

  /**
    * Data returned by the ```DescribeAccountAttributes``` action.
    */
  @js.native
  trait AccountAttributesMessage extends js.Object {
    var AccountQuotas: js.UndefOr[AccountQuotaList]
  }

  object AccountAttributesMessage {
    def apply(AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined): AccountAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountQuotas" -> AccountQuotas.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttributesMessage]
    }
  }

  /**
    * Describes a quota for an AWS account, for example, the number of DB instances allowed.
    */
  @js.native
  trait AccountQuota extends js.Object {
    var AccountQuotaName: js.UndefOr[String]
    var Max: js.UndefOr[Double]
    var Used: js.UndefOr[Double]
  }

  object AccountQuota {
    def apply(AccountQuotaName: js.UndefOr[String] = js.undefined,
              Max: js.UndefOr[Double] = js.undefined,
              Used: js.UndefOr[Double] = js.undefined): AccountQuota = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountQuotaName" -> AccountQuotaName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Max" -> Max.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Used" -> Used.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountQuota]
    }
  }

  @js.native
  trait AddRoleToDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
  }

  object AddRoleToDBClusterMessage {
    def apply(DBClusterIdentifier: String, RoleArn: String): AddRoleToDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "RoleArn"             -> RoleArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(SourceIdentifier: String, SubscriptionName: String): AddSourceIdentifierToSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddSourceIdentifierToSubscriptionMessage]
    }
  }

  @js.native
  trait AddSourceIdentifierToSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object AddSourceIdentifierToSubscriptionResult {
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): AddSourceIdentifierToSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("EventSubscription" -> EventSubscription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(ResourceName: String, Tags: TagList): AddTagsToResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceMessage]
    }
  }

  object ApplyMethodEnum {
    val immediate        = "immediate"
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
    def apply(ApplyAction: String,
              OptInType: String,
              ResourceIdentifier: String): ApplyPendingMaintenanceActionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplyAction"        -> ApplyAction.asInstanceOf[js.Any],
        "OptInType"          -> OptInType.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplyPendingMaintenanceActionMessage]
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
      val _fields =
        IndexedSeq[(String, js.Any)]("ResourcePendingMaintenanceActions" -> ResourcePendingMaintenanceActions.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplyPendingMaintenanceActionResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AuthorizeDBSecurityGroupIngressMessage extends js.Object {
    var DBSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object AuthorizeDBSecurityGroupIngressMessage {
    def apply(DBSecurityGroupName: String,
              CIDRIP: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): AuthorizeDBSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupName" -> DBSecurityGroupName.asInstanceOf[js.Any],
        "CIDRIP" -> CIDRIP.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupId" -> EC2SecurityGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeDBSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object AuthorizeDBSecurityGroupIngressResult {
    def apply(DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined): AuthorizeDBSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSecurityGroup" -> DBSecurityGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
    }
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
    def apply(Name: js.UndefOr[String] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
    * Contains the available processor feature information for the DB instance class of a DB instance.
    *  For more information, see [[http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor|Configuring the Processor of the DB Instance Class]] in the <i>Amazon RDS User Guide. </i>
    */
  @js.native
  trait AvailableProcessorFeature extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var DefaultValue: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object AvailableProcessorFeature {
    def apply(AllowedValues: js.UndefOr[String] = js.undefined,
              DefaultValue: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined): AvailableProcessorFeature = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultValue" -> DefaultValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailableProcessorFeature]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait BacktrackDBClusterMessage extends js.Object {
    var BacktrackTo: TStamp
    var DBClusterIdentifier: String
    var Force: js.UndefOr[BooleanOptional]
    var UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional]
  }

  object BacktrackDBClusterMessage {
    def apply(
        BacktrackTo: TStamp,
        DBClusterIdentifier: String,
        Force: js.UndefOr[BooleanOptional] = js.undefined,
        UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional] = js.undefined
    ): BacktrackDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BacktrackTo"         -> BacktrackTo.asInstanceOf[js.Any],
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Force" -> Force.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseEarliestTimeOnPointInTimeUnavailable" -> UseEarliestTimeOnPointInTimeUnavailable.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BacktrackDBClusterMessage]
    }
  }

  /**
    * A CA certificate for an AWS account.
    */
  @js.native
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var CertificateIdentifier: js.UndefOr[String]
    var CertificateType: js.UndefOr[String]
    var Thumbprint: js.UndefOr[String]
    var ValidFrom: js.UndefOr[TStamp]
    var ValidTill: js.UndefOr[TStamp]
  }

  object Certificate {
    def apply(CertificateArn: js.UndefOr[String] = js.undefined,
              CertificateIdentifier: js.UndefOr[String] = js.undefined,
              CertificateType: js.UndefOr[String] = js.undefined,
              Thumbprint: js.UndefOr[String] = js.undefined,
              ValidFrom: js.UndefOr[TStamp] = js.undefined,
              ValidTill: js.UndefOr[TStamp] = js.undefined): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CertificateIdentifier" -> CertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CertificateType" -> CertificateType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Thumbprint" -> Thumbprint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValidFrom" -> ValidFrom.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValidTill" -> ValidTill.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
    }
  }

  /**
    * Data returned by the ```DescribeCertificates``` action.
    */
  @js.native
  trait CertificateMessage extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var Marker: js.UndefOr[String]
  }

  object CertificateMessage {
    def apply(Certificates: js.UndefOr[CertificateList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): CertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Certificates" -> Certificates.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateMessage]
    }
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
    def apply(CharacterSetDescription: js.UndefOr[String] = js.undefined,
              CharacterSetName: js.UndefOr[String] = js.undefined): CharacterSet = {
      val _fields = IndexedSeq[(String, js.Any)]("CharacterSetDescription" -> CharacterSetDescription.map { x =>
        x.asInstanceOf[js.Any]
      }, "CharacterSetName" -> CharacterSetName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CharacterSet]
    }
  }

  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance or DB cluster.
    *  The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which logs will be exported (or not exported) to CloudWatch Logs. The values within these arrays depend on the DB engine being used. For more information, see [[http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch|Publishing Database Logs to Amazon CloudWatch Logs ]] in the <i>Amazon RDS User Guide</i>.
    */
  @js.native
  trait CloudwatchLogsExportConfiguration extends js.Object {
    var DisableLogTypes: js.UndefOr[LogTypeList]
    var EnableLogTypes: js.UndefOr[LogTypeList]
  }

  object CloudwatchLogsExportConfiguration {
    def apply(DisableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
              EnableLogTypes: js.UndefOr[LogTypeList] = js.undefined): CloudwatchLogsExportConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("DisableLogTypes" -> DisableLogTypes.map { x =>
        x.asInstanceOf[js.Any]
      }, "EnableLogTypes" -> EnableLogTypes.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(SourceDBClusterParameterGroupIdentifier: String,
              TargetDBClusterParameterGroupDescription: String,
              TargetDBClusterParameterGroupIdentifier: String,
              Tags: js.UndefOr[TagList] = js.undefined): CopyDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBClusterParameterGroupIdentifier"  -> SourceDBClusterParameterGroupIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterParameterGroupDescription" -> TargetDBClusterParameterGroupDescription.asInstanceOf[js.Any],
        "TargetDBClusterParameterGroupIdentifier"  -> TargetDBClusterParameterGroupIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBClusterParameterGroupMessage]
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
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterParameterGroup" -> DBClusterParameterGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    var SourceRegion: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBClusterSnapshotMessage {
    def apply(SourceDBClusterSnapshotIdentifier: String,
              TargetDBClusterSnapshotIdentifier: String,
              CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
              KmsKeyId: js.UndefOr[String] = js.undefined,
              PreSignedUrl: js.UndefOr[String] = js.undefined,
              SourceRegion: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): CopyDBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBClusterSnapshotIdentifier" -> SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterSnapshotIdentifier" -> TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "CopyTags" -> CopyTags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreSignedUrl" -> PreSignedUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceRegion" -> SourceRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait CopyDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object CopyDBClusterSnapshotResult {
    def apply(DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined): CopyDBClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterSnapshot" -> DBClusterSnapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(SourceDBParameterGroupIdentifier: String,
              TargetDBParameterGroupDescription: String,
              TargetDBParameterGroupIdentifier: String,
              Tags: js.UndefOr[TagList] = js.undefined): CopyDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBParameterGroupIdentifier"  -> SourceDBParameterGroupIdentifier.asInstanceOf[js.Any],
        "TargetDBParameterGroupDescription" -> TargetDBParameterGroupDescription.asInstanceOf[js.Any],
        "TargetDBParameterGroupIdentifier"  -> TargetDBParameterGroupIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBParameterGroupMessage]
    }
  }

  @js.native
  trait CopyDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup]
  }

  object CopyDBParameterGroupResult {
    def apply(DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined): CopyDBParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBParameterGroup" -> DBParameterGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBParameterGroupResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CopyDBSnapshotMessage extends js.Object {
    var SourceDBSnapshotIdentifier: String
    var TargetDBSnapshotIdentifier: String
    var CopyTags: js.UndefOr[BooleanOptional]
    var KmsKeyId: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var PreSignedUrl: js.UndefOr[String]
    var SourceRegion: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CopyDBSnapshotMessage {
    def apply(SourceDBSnapshotIdentifier: String,
              TargetDBSnapshotIdentifier: String,
              CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
              KmsKeyId: js.UndefOr[String] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined,
              PreSignedUrl: js.UndefOr[String] = js.undefined,
              SourceRegion: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): CopyDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceDBSnapshotIdentifier" -> SourceDBSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetDBSnapshotIdentifier" -> TargetDBSnapshotIdentifier.asInstanceOf[js.Any],
        "CopyTags" -> CopyTags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreSignedUrl" -> PreSignedUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceRegion" -> SourceRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBSnapshotMessage]
    }
  }

  @js.native
  trait CopyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object CopyDBSnapshotResult {
    def apply(DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined): CopyDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshot" -> DBSnapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBSnapshotResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CopyOptionGroupMessage extends js.Object {
    var SourceOptionGroupIdentifier: String
    var TargetOptionGroupDescription: String
    var TargetOptionGroupIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CopyOptionGroupMessage {
    def apply(SourceOptionGroupIdentifier: String,
              TargetOptionGroupDescription: String,
              TargetOptionGroupIdentifier: String,
              Tags: js.UndefOr[TagList] = js.undefined): CopyOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceOptionGroupIdentifier"  -> SourceOptionGroupIdentifier.asInstanceOf[js.Any],
        "TargetOptionGroupDescription" -> TargetOptionGroupDescription.asInstanceOf[js.Any],
        "TargetOptionGroupIdentifier"  -> TargetOptionGroupIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyOptionGroupMessage]
    }
  }

  @js.native
  trait CopyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object CopyOptionGroupResult {
    def apply(OptionGroup: js.UndefOr[OptionGroup] = js.undefined): CopyOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("OptionGroup" -> OptionGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyOptionGroupResult]
    }
  }

  @js.native
  trait CreateDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: String
    var DBClusterIdentifier: String
    var EndpointType: String
    var ExcludedMembers: js.UndefOr[StringList]
    var StaticMembers: js.UndefOr[StringList]
  }

  object CreateDBClusterEndpointMessage {
    def apply(DBClusterEndpointIdentifier: String,
              DBClusterIdentifier: String,
              EndpointType: String,
              ExcludedMembers: js.UndefOr[StringList] = js.undefined,
              StaticMembers: js.UndefOr[StringList] = js.undefined): CreateDBClusterEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.asInstanceOf[js.Any],
        "DBClusterIdentifier"         -> DBClusterIdentifier.asInstanceOf[js.Any],
        "EndpointType"                -> EndpointType.asInstanceOf[js.Any],
        "ExcludedMembers" -> ExcludedMembers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StaticMembers" -> StaticMembers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterEndpointMessage]
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
    var BacktrackWindow: js.UndefOr[LongOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CharacterSetName: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EngineMode: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreSignedUrl: js.UndefOr[String]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationSourceIdentifier: js.UndefOr[String]
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration]
    var SourceRegion: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object CreateDBClusterMessage {
    def apply(DBClusterIdentifier: String,
              Engine: String,
              AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
              BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
              BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              CharacterSetName: js.UndefOr[String] = js.undefined,
              DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
              DBSubnetGroupName: js.UndefOr[String] = js.undefined,
              DatabaseName: js.UndefOr[String] = js.undefined,
              DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
              EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
              EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
              EngineMode: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
              KmsKeyId: js.UndefOr[String] = js.undefined,
              MasterUserPassword: js.UndefOr[String] = js.undefined,
              MasterUsername: js.UndefOr[String] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined,
              Port: js.UndefOr[IntegerOptional] = js.undefined,
              PreSignedUrl: js.UndefOr[String] = js.undefined,
              PreferredBackupWindow: js.UndefOr[String] = js.undefined,
              PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
              ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined,
              ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined,
              SourceRegion: js.UndefOr[String] = js.undefined,
              StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined,
              VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): CreateDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackWindow" -> BacktrackWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CharacterSetName" -> CharacterSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineMode" -> EngineMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterIdentifier" -> GlobalClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUserPassword" -> MasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreSignedUrl" -> PreSignedUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicationSourceIdentifier" -> ReplicationSourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingConfiguration" -> ScalingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceRegion" -> SourceRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterParameterGroupName: String,
              DBParameterGroupFamily: String,
              Description: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "DBParameterGroupFamily"      -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "Description"                 -> Description.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterParameterGroupMessage]
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
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterParameterGroup" -> DBClusterParameterGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterParameterGroupResult]
    }
  }

  @js.native
  trait CreateDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object CreateDBClusterResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): CreateDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterIdentifier: String,
              DBClusterSnapshotIdentifier: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateDBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier"         -> DBClusterIdentifier.asInstanceOf[js.Any],
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait CreateDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object CreateDBClusterSnapshotResult {
    def apply(DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined): CreateDBClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterSnapshot" -> DBClusterSnapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    var DeletionProtection: js.UndefOr[BooleanOptional]
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
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
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
    def apply(DBInstanceClass: String,
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
              DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
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
              PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              Port: js.UndefOr[IntegerOptional] = js.undefined,
              PreferredBackupWindow: js.UndefOr[String] = js.undefined,
              PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
              ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
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
        "DBInstanceClass"      -> DBInstanceClass.asInstanceOf[js.Any],
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "Engine"               -> Engine.asInstanceOf[js.Any],
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CharacterSetName" -> CharacterSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBName" -> DBName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupName" -> DBParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSecurityGroups" -> DBSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUserPassword" -> MasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringInterval" -> MonitoringInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PromotionTier" -> PromotionTier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialArn" -> TdeCredentialArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timezone" -> Timezone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceMessage]
    }
  }

  @js.native
  trait CreateDBInstanceReadReplicaMessage extends js.Object {
    var DBInstanceIdentifier: String
    var SourceDBInstanceIdentifier: String
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBInstanceClass: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional]
    var Iops: js.UndefOr[IntegerOptional]
    var KmsKeyId: js.UndefOr[String]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var MonitoringRoleArn: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
    var Port: js.UndefOr[IntegerOptional]
    var PreSignedUrl: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var SourceRegion: js.UndefOr[String]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object CreateDBInstanceReadReplicaMessage {
    def apply(
        DBInstanceIdentifier: String,
        SourceDBInstanceIdentifier: String,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
        EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
        Iops: js.UndefOr[IntegerOptional] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
        MonitoringRoleArn: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
        PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreSignedUrl: js.UndefOr[String] = js.undefined,
        ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        SourceRegion: js.UndefOr[String] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateDBInstanceReadReplicaMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier"       -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "SourceDBInstanceIdentifier" -> SourceDBInstanceIdentifier.asInstanceOf[js.Any],
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringInterval" -> MonitoringInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreSignedUrl" -> PreSignedUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceRegion" -> SourceRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceReadReplicaMessage]
    }
  }

  @js.native
  trait CreateDBInstanceReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object CreateDBInstanceReadReplicaResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): CreateDBInstanceReadReplicaResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceReadReplicaResult]
    }
  }

  @js.native
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object CreateDBInstanceResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): CreateDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupFamily: String,
              DBParameterGroupName: String,
              Description: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "DBParameterGroupName"   -> DBParameterGroupName.asInstanceOf[js.Any],
        "Description"            -> Description.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBParameterGroupMessage]
    }
  }

  @js.native
  trait CreateDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup]
  }

  object CreateDBParameterGroupResult {
    def apply(DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined): CreateDBParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBParameterGroup" -> DBParameterGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBParameterGroupResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateDBSecurityGroupMessage extends js.Object {
    var DBSecurityGroupDescription: String
    var DBSecurityGroupName: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBSecurityGroupMessage {
    def apply(DBSecurityGroupDescription: String,
              DBSecurityGroupName: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateDBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupDescription" -> DBSecurityGroupDescription.asInstanceOf[js.Any],
        "DBSecurityGroupName"        -> DBSecurityGroupName.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateDBSecurityGroupResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object CreateDBSecurityGroupResult {
    def apply(DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined): CreateDBSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSecurityGroup" -> DBSecurityGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSecurityGroupResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateDBSnapshotMessage extends js.Object {
    var DBInstanceIdentifier: String
    var DBSnapshotIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBSnapshotMessage {
    def apply(DBInstanceIdentifier: String,
              DBSnapshotIdentifier: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSnapshotMessage]
    }
  }

  @js.native
  trait CreateDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object CreateDBSnapshotResult {
    def apply(DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined): CreateDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshot" -> DBSnapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSnapshotResult]
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
    def apply(DBSubnetGroupDescription: String,
              DBSubnetGroupName: String,
              SubnetIds: SubnetIdentifierList,
              Tags: js.UndefOr[TagList] = js.undefined): CreateDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.asInstanceOf[js.Any],
        "DBSubnetGroupName"        -> DBSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"                -> SubnetIds.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  object CreateDBSubnetGroupResult {
    def apply(DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined): CreateDBSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSubnetGroup" -> DBSubnetGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(SnsTopicArn: String,
              SubscriptionName: String,
              Enabled: js.UndefOr[BooleanOptional] = js.undefined,
              EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
              SourceType: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): CreateEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnsTopicArn"      -> SnsTopicArn.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any],
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventCategories" -> EventCategories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceIds" -> SourceIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceType" -> SourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  @js.native
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object CreateEventSubscriptionResult {
    def apply(EventSubscription: js.UndefOr[EventSubscription] = js.undefined): CreateEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("EventSubscription" -> EventSubscription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionResult]
    }
  }

  @js.native
  trait CreateGlobalClusterMessage extends js.Object {
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var SourceDBClusterIdentifier: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
  }

  object CreateGlobalClusterMessage {
    def apply(DatabaseName: js.UndefOr[String] = js.undefined,
              DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
              SourceDBClusterIdentifier: js.UndefOr[String] = js.undefined,
              StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined): CreateGlobalClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterIdentifier" -> GlobalClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceDBClusterIdentifier" -> SourceDBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalClusterMessage]
    }
  }

  @js.native
  trait CreateGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  object CreateGlobalClusterResult {
    def apply(GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined): CreateGlobalClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalCluster" -> GlobalCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalClusterResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateOptionGroupMessage extends js.Object {
    var EngineName: String
    var MajorEngineVersion: String
    var OptionGroupDescription: String
    var OptionGroupName: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateOptionGroupMessage {
    def apply(EngineName: String,
              MajorEngineVersion: String,
              OptionGroupDescription: String,
              OptionGroupName: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineName"             -> EngineName.asInstanceOf[js.Any],
        "MajorEngineVersion"     -> MajorEngineVersion.asInstanceOf[js.Any],
        "OptionGroupDescription" -> OptionGroupDescription.asInstanceOf[js.Any],
        "OptionGroupName"        -> OptionGroupName.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOptionGroupMessage]
    }
  }

  @js.native
  trait CreateOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object CreateOptionGroupResult {
    def apply(OptionGroup: js.UndefOr[OptionGroup] = js.undefined): CreateOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("OptionGroup" -> OptionGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOptionGroupResult]
    }
  }

  /**
    * Contains the details of an Amazon Aurora DB cluster.
    *  This data type is used as a response element in the <a>DescribeDBClusters</a>, <a>StopDBCluster</a>, and <a>StartDBCluster</a> actions.
    */
  @js.native
  trait DBCluster extends js.Object {
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AssociatedRoles: js.UndefOr[DBClusterRoles]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BacktrackConsumedChangeRecords: js.UndefOr[LongOptional]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var Capacity: js.UndefOr[IntegerOptional]
    var CharacterSetName: js.UndefOr[String]
    var CloneGroupId: js.UndefOr[String]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var CustomEndpoints: js.UndefOr[StringList]
    var DBClusterArn: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterMembers: js.UndefOr[DBClusterMemberList]
    var DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships]
    var DBClusterParameterGroup: js.UndefOr[String]
    var DBSubnetGroup: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DbClusterResourceId: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[Boolean]
    var EarliestBacktrackTime: js.UndefOr[TStamp]
    var EarliestRestorableTime: js.UndefOr[TStamp]
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var Endpoint: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineMode: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var HttpEndpointEnabled: js.UndefOr[Boolean]
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
    var ScalingConfigurationInfo: js.UndefOr[ScalingConfigurationInfo]
    var Status: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[Boolean]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  object DBCluster {
    def apply(AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
              AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined,
              AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
              BacktrackConsumedChangeRecords: js.UndefOr[LongOptional] = js.undefined,
              BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
              BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              Capacity: js.UndefOr[IntegerOptional] = js.undefined,
              CharacterSetName: js.UndefOr[String] = js.undefined,
              CloneGroupId: js.UndefOr[String] = js.undefined,
              ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
              CustomEndpoints: js.UndefOr[StringList] = js.undefined,
              DBClusterArn: js.UndefOr[String] = js.undefined,
              DBClusterIdentifier: js.UndefOr[String] = js.undefined,
              DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.undefined,
              DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships] = js.undefined,
              DBClusterParameterGroup: js.UndefOr[String] = js.undefined,
              DBSubnetGroup: js.UndefOr[String] = js.undefined,
              DatabaseName: js.UndefOr[String] = js.undefined,
              DbClusterResourceId: js.UndefOr[String] = js.undefined,
              DeletionProtection: js.UndefOr[Boolean] = js.undefined,
              EarliestBacktrackTime: js.UndefOr[TStamp] = js.undefined,
              EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined,
              EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
              Endpoint: js.UndefOr[String] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              EngineMode: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              HostedZoneId: js.UndefOr[String] = js.undefined,
              HttpEndpointEnabled: js.UndefOr[Boolean] = js.undefined,
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
              ScalingConfigurationInfo: js.UndefOr[ScalingConfigurationInfo] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
              VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined): DBCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AssociatedRoles" -> AssociatedRoles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZones" -> AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackConsumedChangeRecords" -> BacktrackConsumedChangeRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackWindow" -> BacktrackWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Capacity" -> Capacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CharacterSetName" -> CharacterSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloneGroupId" -> CloneGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterCreateTime" -> ClusterCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomEndpoints" -> CustomEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterArn" -> DBClusterArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterMembers" -> DBClusterMembers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterOptionGroupMemberships" -> DBClusterOptionGroupMemberships.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterParameterGroup" -> DBClusterParameterGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroup" -> DBSubnetGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbClusterResourceId" -> DbClusterResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EarliestBacktrackTime" -> EarliestBacktrackTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EarliestRestorableTime" -> EarliestRestorableTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledCloudwatchLogsExports" -> EnabledCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Endpoint" -> Endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineMode" -> EngineMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostedZoneId" -> HostedZoneId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HttpEndpointEnabled" -> HttpEndpointEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestRestorableTime" -> LatestRestorableTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PercentProgress" -> PercentProgress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadReplicaIdentifiers" -> ReadReplicaIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReaderEndpoint" -> ReaderEndpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicationSourceIdentifier" -> ReplicationSourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingConfigurationInfo" -> ScalingConfigurationInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBCluster]
    }
  }

  /**
    * This data type is used as a response element in the <a>DescribeDBClusterBacktracks</a> action.
    */
  @js.native
  trait DBClusterBacktrack extends js.Object {
    var BacktrackIdentifier: js.UndefOr[String]
    var BacktrackRequestCreationTime: js.UndefOr[TStamp]
    var BacktrackTo: js.UndefOr[TStamp]
    var BacktrackedFrom: js.UndefOr[TStamp]
    var DBClusterIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBClusterBacktrack {
    def apply(BacktrackIdentifier: js.UndefOr[String] = js.undefined,
              BacktrackRequestCreationTime: js.UndefOr[TStamp] = js.undefined,
              BacktrackTo: js.UndefOr[TStamp] = js.undefined,
              BacktrackedFrom: js.UndefOr[TStamp] = js.undefined,
              DBClusterIdentifier: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): DBClusterBacktrack = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BacktrackIdentifier" -> BacktrackIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackRequestCreationTime" -> BacktrackRequestCreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackTo" -> BacktrackTo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackedFrom" -> BacktrackedFrom.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterBacktrack]
    }
  }

  /**
    * Contains the result of a successful invocation of the <a>DescribeDBClusterBacktracks</a> action.
    */
  @js.native
  trait DBClusterBacktrackMessage extends js.Object {
    var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterBacktrackMessage {
    def apply(DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBClusterBacktrackMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterBacktracks" -> DBClusterBacktracks.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterBacktrackMessage]
    }
  }

  @js.native
  trait DBClusterCapacityInfo extends js.Object {
    var CurrentCapacity: js.UndefOr[IntegerOptional]
    var DBClusterIdentifier: js.UndefOr[String]
    var PendingCapacity: js.UndefOr[IntegerOptional]
    var SecondsBeforeTimeout: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  object DBClusterCapacityInfo {
    def apply(CurrentCapacity: js.UndefOr[IntegerOptional] = js.undefined,
              DBClusterIdentifier: js.UndefOr[String] = js.undefined,
              PendingCapacity: js.UndefOr[IntegerOptional] = js.undefined,
              SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
              TimeoutAction: js.UndefOr[String] = js.undefined): DBClusterCapacityInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentCapacity" -> CurrentCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PendingCapacity" -> PendingCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecondsBeforeTimeout" -> SecondsBeforeTimeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeoutAction" -> TimeoutAction.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterCapacityInfo]
    }
  }

  /**
    * This data type represents the information you need to connect to an Amazon Aurora DB cluster. This data type is used as a response element in the following actions:
    * * <a>CreateDBClusterEndpoint</a>
    *  * <a>DescribeDBClusterEndpoints</a>
    *  * <a>ModifyDBClusterEndpoint</a>
    *  * <a>DeleteDBClusterEndpoint</a>
    * For the data structure that represents Amazon RDS DB instance endpoints, see <a>Endpoint</a>.
    */
  @js.native
  trait DBClusterEndpoint extends js.Object {
    var CustomEndpointType: js.UndefOr[String]
    var DBClusterEndpointArn: js.UndefOr[String]
    var DBClusterEndpointIdentifier: js.UndefOr[String]
    var DBClusterEndpointResourceIdentifier: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var Endpoint: js.UndefOr[String]
    var EndpointType: js.UndefOr[String]
    var ExcludedMembers: js.UndefOr[StringList]
    var StaticMembers: js.UndefOr[StringList]
    var Status: js.UndefOr[String]
  }

  object DBClusterEndpoint {
    def apply(CustomEndpointType: js.UndefOr[String] = js.undefined,
              DBClusterEndpointArn: js.UndefOr[String] = js.undefined,
              DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined,
              DBClusterEndpointResourceIdentifier: js.UndefOr[String] = js.undefined,
              DBClusterIdentifier: js.UndefOr[String] = js.undefined,
              Endpoint: js.UndefOr[String] = js.undefined,
              EndpointType: js.UndefOr[String] = js.undefined,
              ExcludedMembers: js.UndefOr[StringList] = js.undefined,
              StaticMembers: js.UndefOr[StringList] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): DBClusterEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomEndpointType" -> CustomEndpointType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterEndpointArn" -> DBClusterEndpointArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterEndpointResourceIdentifier" -> DBClusterEndpointResourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Endpoint" -> Endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointType" -> EndpointType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExcludedMembers" -> ExcludedMembers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StaticMembers" -> StaticMembers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterEndpoint]
    }
  }

  @js.native
  trait DBClusterEndpointMessage extends js.Object {
    var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterEndpointMessage {
    def apply(DBClusterEndpoints: js.UndefOr[DBClusterEndpointList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBClusterEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterEndpoints" -> DBClusterEndpoints.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterEndpointMessage]
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
    def apply(DBClusterParameterGroupStatus: js.UndefOr[String] = js.undefined,
              DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
              IsClusterWriter: js.UndefOr[Boolean] = js.undefined,
              PromotionTier: js.UndefOr[IntegerOptional] = js.undefined): DBClusterMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupStatus" -> DBClusterParameterGroupStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsClusterWriter" -> IsClusterWriter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PromotionTier" -> PromotionTier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusters: js.UndefOr[DBClusterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusters" -> DBClusters.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterMessage]
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
    def apply(DBClusterOptionGroupName: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): DBClusterOptionGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterOptionGroupName" -> DBClusterOptionGroupName.map { x =>
        x.asInstanceOf[js.Any]
      }, "Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterOptionGroupStatus]
    }
  }

  /**
    * Contains the details of an Amazon RDS DB cluster parameter group.
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
    def apply(DBClusterParameterGroupArn: js.UndefOr[String] = js.undefined,
              DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
              DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
              Description: js.UndefOr[String] = js.undefined): DBClusterParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupArn" -> DBClusterParameterGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              Parameters: js.UndefOr[ParametersList] = js.undefined): DBClusterParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "Parameters" -> Parameters.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterParameterGroupName: js.UndefOr[String] = js.undefined): DBClusterParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterParameterGroupNameMessage]
    }
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
    def apply(DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterParameterGroups" -> DBClusterParameterGroups.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterParameterGroupsMessage]
    }
  }

  /**
    * Describes an AWS Identity and Access Management (IAM) role that is associated with a DB cluster.
    */
  @js.native
  trait DBClusterRole extends js.Object {
    var FeatureName: js.UndefOr[String]
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBClusterRole {
    def apply(FeatureName: js.UndefOr[String] = js.undefined,
              RoleArn: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): DBClusterRole = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FeatureName" -> FeatureName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterRole]
    }
  }

  /**
    * Contains the details for an Amazon RDS DB cluster snapshot
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
    def apply(AllocatedStorage: js.UndefOr[Int] = js.undefined,
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
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZones" -> AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterCreateTime" -> ClusterCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterSnapshotArn" -> DBClusterSnapshotArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PercentProgress" -> PercentProgress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotType" -> SnapshotType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceDBClusterSnapshotArn" -> SourceDBClusterSnapshotArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshot]
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
    def apply(AttributeName: js.UndefOr[String] = js.undefined,
              AttributeValues: js.UndefOr[AttributeValueList] = js.undefined): DBClusterSnapshotAttribute = {
      val _fields = IndexedSeq[(String, js.Any)]("AttributeName" -> AttributeName.map { x =>
        x.asInstanceOf[js.Any]
      }, "AttributeValues" -> AttributeValues.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined,
              DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined): DBClusterSnapshotAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterSnapshotAttributes" -> DBClusterSnapshotAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterSnapshots" -> DBClusterSnapshots.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBClusterSnapshotMessage]
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
    var SupportedEngineModes: js.UndefOr[EngineModeList]
    var SupportedTimezones: js.UndefOr[SupportedTimezonesList]
    var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean]
    var SupportsReadReplica: js.UndefOr[Boolean]
    var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList]
  }

  object DBEngineVersion {
    def apply(DBEngineDescription: js.UndefOr[String] = js.undefined,
              DBEngineVersionDescription: js.UndefOr[String] = js.undefined,
              DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
              DefaultCharacterSet: js.UndefOr[CharacterSet] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined,
              SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined,
              SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined,
              SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.undefined,
              SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined,
              SupportsReadReplica: js.UndefOr[Boolean] = js.undefined,
              ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined): DBEngineVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBEngineDescription" -> DBEngineDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBEngineVersionDescription" -> DBEngineVersionDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultCharacterSet" -> DefaultCharacterSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExportableLogTypes" -> ExportableLogTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedCharacterSets" -> SupportedCharacterSets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedEngineModes" -> SupportedEngineModes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedTimezones" -> SupportedTimezones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportsLogExportsToCloudwatchLogs" -> SupportsLogExportsToCloudwatchLogs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportsReadReplica" -> SupportsReadReplica.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValidUpgradeTarget" -> ValidUpgradeTarget.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBEngineVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBEngineVersions" -> DBEngineVersions.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBEngineVersionMessage]
    }
  }

  /**
    * Contains the details of an Amazon RDS DB instance.
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
    var DeletionProtection: js.UndefOr[Boolean]
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
    var ListenerEndpoint: js.UndefOr[Endpoint]
    var MasterUsername: js.UndefOr[String]
    var MonitoringInterval: js.UndefOr[IntegerOptional]
    var MonitoringRoleArn: js.UndefOr[String]
    var MultiAZ: js.UndefOr[Boolean]
    var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList]
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues]
    var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional]
    var PerformanceInsightsKMSKeyId: js.UndefOr[String]
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
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
    def apply(AllocatedStorage: js.UndefOr[Int] = js.undefined,
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
              DeletionProtection: js.UndefOr[Boolean] = js.undefined,
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
              ListenerEndpoint: js.UndefOr[Endpoint] = js.undefined,
              MasterUsername: js.UndefOr[String] = js.undefined,
              MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
              MonitoringRoleArn: js.UndefOr[String] = js.undefined,
              MultiAZ: js.UndefOr[Boolean] = js.undefined,
              OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.undefined,
              PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
              PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined,
              PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined,
              PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              PreferredBackupWindow: js.UndefOr[String] = js.undefined,
              PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
              ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
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
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CharacterSetName" -> CharacterSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceArn" -> DBInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceStatus" -> DBInstanceStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBName" -> DBName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroups" -> DBParameterGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSecurityGroups" -> DBSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroup" -> DBSubnetGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbInstancePort" -> DbInstancePort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbiResourceId" -> DbiResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainMemberships" -> DomainMemberships.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnabledCloudwatchLogsExports" -> EnabledCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Endpoint" -> Endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedMonitoringResourceArn" -> EnhancedMonitoringResourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceCreateTime" -> InstanceCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestRestorableTime" -> LatestRestorableTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListenerEndpoint" -> ListenerEndpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringInterval" -> MonitoringInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupMemberships" -> OptionGroupMemberships.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PendingModifiedValues" -> PendingModifiedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsEnabled" -> PerformanceInsightsEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PromotionTier" -> PromotionTier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadReplicaDBClusterIdentifiers" -> ReadReplicaDBClusterIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadReplicaDBInstanceIdentifiers" -> ReadReplicaDBInstanceIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadReplicaSourceDBInstanceIdentifier" -> ReadReplicaSourceDBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecondaryAvailabilityZone" -> SecondaryAvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusInfos" -> StatusInfos.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialArn" -> TdeCredentialArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timezone" -> Timezone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstance]
    }
  }

  /**
    * An automated backup of a DB instance. It it consists of system backups, transaction logs, and the database instance properties that existed at the time you deleted the source instance.
    */
  @js.native
  trait DBInstanceAutomatedBackup extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AvailabilityZone: js.UndefOr[String]
    var DBInstanceArn: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var DbiResourceId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var Iops: js.UndefOr[IntegerOptional]
    var KmsKeyId: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[Int]
    var Region: js.UndefOr[String]
    var RestoreWindow: js.UndefOr[RestoreWindow]
    var Status: js.UndefOr[String]
    var StorageType: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var Timezone: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DBInstanceAutomatedBackup {
    def apply(AllocatedStorage: js.UndefOr[Int] = js.undefined,
              AvailabilityZone: js.UndefOr[String] = js.undefined,
              DBInstanceArn: js.UndefOr[String] = js.undefined,
              DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
              DbiResourceId: js.UndefOr[String] = js.undefined,
              Encrypted: js.UndefOr[Boolean] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
              InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
              Iops: js.UndefOr[IntegerOptional] = js.undefined,
              KmsKeyId: js.UndefOr[String] = js.undefined,
              LicenseModel: js.UndefOr[String] = js.undefined,
              MasterUsername: js.UndefOr[String] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined,
              Port: js.UndefOr[Int] = js.undefined,
              Region: js.UndefOr[String] = js.undefined,
              RestoreWindow: js.UndefOr[RestoreWindow] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              StorageType: js.UndefOr[String] = js.undefined,
              TdeCredentialArn: js.UndefOr[String] = js.undefined,
              Timezone: js.UndefOr[String] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): DBInstanceAutomatedBackup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceArn" -> DBInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbiResourceId" -> DbiResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encrypted" -> Encrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceCreateTime" -> InstanceCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestoreWindow" -> RestoreWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialArn" -> TdeCredentialArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timezone" -> Timezone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceAutomatedBackup]
    }
  }

  /**
    * Contains the result of a successful invocation of the <a>DescribeDBInstanceAutomatedBackups</a> action.
    */
  @js.native
  trait DBInstanceAutomatedBackupMessage extends js.Object {
    var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList]
    var Marker: js.UndefOr[String]
  }

  object DBInstanceAutomatedBackupMessage {
    def apply(DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBInstanceAutomatedBackupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstanceAutomatedBackups" -> DBInstanceAutomatedBackups.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceAutomatedBackupMessage]
    }
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
    def apply(DBInstances: js.UndefOr[DBInstanceList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstances" -> DBInstances.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceMessage]
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
    def apply(Message: js.UndefOr[String] = js.undefined,
              Normal: js.UndefOr[Boolean] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              StatusType: js.UndefOr[String] = js.undefined): DBInstanceStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Normal" -> Normal.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusType" -> StatusType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceStatusInfo]
    }
  }

  /**
    * Contains the details of an Amazon RDS DB parameter group.
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
    def apply(DBParameterGroupArn: js.UndefOr[String] = js.undefined,
              DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
              DBParameterGroupName: js.UndefOr[String] = js.undefined,
              Description: js.UndefOr[String] = js.undefined): DBParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupArn" -> DBParameterGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupName" -> DBParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroup]
    }
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              Parameters: js.UndefOr[ParametersList] = js.undefined): DBParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "Parameters" -> Parameters.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupName: js.UndefOr[String] = js.undefined): DBParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBParameterGroupName" -> DBParameterGroupName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupNameMessage]
    }
  }

  /**
    * The status of the DB parameter group.
    *  This data type is used as a response element in the following actions:
    * * <a>CreateDBInstance</a>
    *  * <a>CreateDBInstanceReadReplica</a>
    *  * <a>DeleteDBInstance</a>
    *  * <a>ModifyDBInstance</a>
    *  * <a>RebootDBInstance</a>
    *  * <a>RestoreDBInstanceFromDBSnapshot</a>
    */
  @js.native
  trait DBParameterGroupStatus extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
  }

  object DBParameterGroupStatus {
    def apply(DBParameterGroupName: js.UndefOr[String] = js.undefined,
              ParameterApplyStatus: js.UndefOr[String] = js.undefined): DBParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBParameterGroups" -> DBParameterGroups.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupsMessage]
    }
  }

  /**
    * Contains the details for an Amazon RDS DB security group.
    *  This data type is used as a response element in the <a>DescribeDBSecurityGroups</a> action.
    */
  @js.native
  trait DBSecurityGroup extends js.Object {
    var DBSecurityGroupArn: js.UndefOr[String]
    var DBSecurityGroupDescription: js.UndefOr[String]
    var DBSecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var IPRanges: js.UndefOr[IPRangeList]
    var OwnerId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DBSecurityGroup {
    def apply(DBSecurityGroupArn: js.UndefOr[String] = js.undefined,
              DBSecurityGroupDescription: js.UndefOr[String] = js.undefined,
              DBSecurityGroupName: js.UndefOr[String] = js.undefined,
              EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
              IPRanges: js.UndefOr[IPRangeList] = js.undefined,
              OwnerId: js.UndefOr[String] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): DBSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupArn" -> DBSecurityGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSecurityGroupDescription" -> DBSecurityGroupDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroups" -> EC2SecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IPRanges" -> IPRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OwnerId" -> OwnerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroup]
    }
  }

  /**
    * This data type is used as a response element in the following actions:
    * * <a>ModifyDBInstance</a>
    *  * <a>RebootDBInstance</a>
    *  * <a>RestoreDBInstanceFromDBSnapshot</a>
    *  * <a>RestoreDBInstanceToPointInTime</a>
    */
  @js.native
  trait DBSecurityGroupMembership extends js.Object {
    var DBSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBSecurityGroupMembership {
    def apply(DBSecurityGroupName: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): DBSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSecurityGroupName" -> DBSecurityGroupName.map { x =>
        x.asInstanceOf[js.Any]
      }, "Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroupMembership]
    }
  }

  /**
    * Contains the result of a successful invocation of the <a>DescribeDBSecurityGroups</a> action.
    */
  @js.native
  trait DBSecurityGroupMessage extends js.Object {
    var DBSecurityGroups: js.UndefOr[DBSecurityGroups]
    var Marker: js.UndefOr[String]
  }

  object DBSecurityGroupMessage {
    def apply(DBSecurityGroups: js.UndefOr[DBSecurityGroups] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSecurityGroups" -> DBSecurityGroups.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroupMessage]
    }
  }

  /**
    * Contains the details of an Amazon RDS DB snapshot.
    *  This data type is used as a response element in the <a>DescribeDBSnapshots</a> action.
    */
  @js.native
  trait DBSnapshot extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AvailabilityZone: js.UndefOr[String]
    var DBInstanceIdentifier: js.UndefOr[String]
    var DBSnapshotArn: js.UndefOr[String]
    var DBSnapshotIdentifier: js.UndefOr[String]
    var DbiResourceId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var Iops: js.UndefOr[IntegerOptional]
    var KmsKeyId: js.UndefOr[String]
    var LicenseModel: js.UndefOr[String]
    var MasterUsername: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var PercentProgress: js.UndefOr[Int]
    var Port: js.UndefOr[Int]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var SnapshotCreateTime: js.UndefOr[TStamp]
    var SnapshotType: js.UndefOr[String]
    var SourceDBSnapshotIdentifier: js.UndefOr[String]
    var SourceRegion: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StorageType: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var Timezone: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object DBSnapshot {
    def apply(AllocatedStorage: js.UndefOr[Int] = js.undefined,
              AvailabilityZone: js.UndefOr[String] = js.undefined,
              DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
              DBSnapshotArn: js.UndefOr[String] = js.undefined,
              DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
              DbiResourceId: js.UndefOr[String] = js.undefined,
              Encrypted: js.UndefOr[Boolean] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
              InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
              Iops: js.UndefOr[IntegerOptional] = js.undefined,
              KmsKeyId: js.UndefOr[String] = js.undefined,
              LicenseModel: js.UndefOr[String] = js.undefined,
              MasterUsername: js.UndefOr[String] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined,
              PercentProgress: js.UndefOr[Int] = js.undefined,
              Port: js.UndefOr[Int] = js.undefined,
              ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
              SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
              SnapshotType: js.UndefOr[String] = js.undefined,
              SourceDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
              SourceRegion: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              StorageType: js.UndefOr[String] = js.undefined,
              TdeCredentialArn: js.UndefOr[String] = js.undefined,
              Timezone: js.UndefOr[String] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): DBSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSnapshotArn" -> DBSnapshotArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbiResourceId" -> DbiResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encrypted" -> Encrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IAMDatabaseAuthenticationEnabled" -> IAMDatabaseAuthenticationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceCreateTime" -> InstanceCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PercentProgress" -> PercentProgress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotType" -> SnapshotType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceDBSnapshotIdentifier" -> SourceDBSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceRegion" -> SourceRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialArn" -> TdeCredentialArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timezone" -> Timezone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshot]
    }
  }

  /**
    * Contains the name and values of a manual DB snapshot attribute
    *  Manual DB snapshot attributes are used to authorize other AWS accounts to restore a manual DB snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a> API.
    */
  @js.native
  trait DBSnapshotAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  object DBSnapshotAttribute {
    def apply(AttributeName: js.UndefOr[String] = js.undefined,
              AttributeValues: js.UndefOr[AttributeValueList] = js.undefined): DBSnapshotAttribute = {
      val _fields = IndexedSeq[(String, js.Any)]("AttributeName" -> AttributeName.map { x =>
        x.asInstanceOf[js.Any]
      }, "AttributeValues" -> AttributeValues.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshotAttribute]
    }
  }

  /**
    * Contains the results of a successful call to the <a>DescribeDBSnapshotAttributes</a> API action.
    *  Manual DB snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a> API action.
    */
  @js.native
  trait DBSnapshotAttributesResult extends js.Object {
    var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList]
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  object DBSnapshotAttributesResult {
    def apply(DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList] = js.undefined,
              DBSnapshotIdentifier: js.UndefOr[String] = js.undefined): DBSnapshotAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotAttributes" -> DBSnapshotAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshotAttributesResult]
    }
  }

  /**
    * Contains the result of a successful invocation of the <a>DescribeDBSnapshots</a> action.
    */
  @js.native
  trait DBSnapshotMessage extends js.Object {
    var DBSnapshots: js.UndefOr[DBSnapshotList]
    var Marker: js.UndefOr[String]
  }

  object DBSnapshotMessage {
    def apply(DBSnapshots: js.UndefOr[DBSnapshotList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshots" -> DBSnapshots.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshotMessage]
    }
  }

  /**
    * Contains the details of an Amazon RDS DB subnet group.
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
    def apply(DBSubnetGroupArn: js.UndefOr[String] = js.undefined,
              DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
              DBSubnetGroupName: js.UndefOr[String] = js.undefined,
              SubnetGroupStatus: js.UndefOr[String] = js.undefined,
              Subnets: js.UndefOr[SubnetList] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): DBSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupArn" -> DBSubnetGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetGroupStatus" -> SubnetGroupStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subnets" -> Subnets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSubnetGroup]
    }
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
    def apply(DBSubnetGroups: js.UndefOr[DBSubnetGroups] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSubnetGroups" -> DBSubnetGroups.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSubnetGroupMessage]
    }
  }

  @js.native
  trait DeleteDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: String
  }

  object DeleteDBClusterEndpointMessage {
    def apply(DBClusterEndpointIdentifier: String): DeleteDBClusterEndpointMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterEndpointMessage]
    }
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
    def apply(DBClusterIdentifier: String,
              FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
              SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined): DeleteDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "FinalDBSnapshotIdentifier" -> FinalDBSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkipFinalSnapshot" -> SkipFinalSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterParameterGroupName: String): DeleteDBClusterParameterGroupMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait DeleteDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object DeleteDBClusterResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): DeleteDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterSnapshotIdentifier: String): DeleteDBClusterSnapshotMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterSnapshotMessage]
    }
  }

  @js.native
  trait DeleteDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  object DeleteDBClusterSnapshotResult {
    def apply(DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined): DeleteDBClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterSnapshot" -> DBClusterSnapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBClusterSnapshotResult]
    }
  }

  /**
    * Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation.
    */
  @js.native
  trait DeleteDBInstanceAutomatedBackupMessage extends js.Object {
    var DbiResourceId: String
  }

  object DeleteDBInstanceAutomatedBackupMessage {
    def apply(DbiResourceId: String): DeleteDBInstanceAutomatedBackupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DbiResourceId" -> DbiResourceId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceAutomatedBackupMessage]
    }
  }

  @js.native
  trait DeleteDBInstanceAutomatedBackupResult extends js.Object {
    var DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup]
  }

  object DeleteDBInstanceAutomatedBackupResult {
    def apply(
        DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup] = js.undefined
    ): DeleteDBInstanceAutomatedBackupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstanceAutomatedBackup" -> DBInstanceAutomatedBackup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceAutomatedBackupResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var DeleteAutomatedBackups: js.UndefOr[BooleanOptional]
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
  }

  object DeleteDBInstanceMessage {
    def apply(DBInstanceIdentifier: String,
              DeleteAutomatedBackups: js.UndefOr[BooleanOptional] = js.undefined,
              FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
              SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined): DeleteDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "DeleteAutomatedBackups" -> DeleteAutomatedBackups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FinalDBSnapshotIdentifier" -> FinalDBSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkipFinalSnapshot" -> SkipFinalSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceMessage]
    }
  }

  @js.native
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object DeleteDBInstanceResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): DeleteDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupName: String): DeleteDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBParameterGroupMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteDBSecurityGroupMessage extends js.Object {
    var DBSecurityGroupName: String
  }

  object DeleteDBSecurityGroupMessage {
    def apply(DBSecurityGroupName: String): DeleteDBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSecurityGroupName" -> DBSecurityGroupName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSecurityGroupMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: String
  }

  object DeleteDBSnapshotMessage {
    def apply(DBSnapshotIdentifier: String): DeleteDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSnapshotMessage]
    }
  }

  @js.native
  trait DeleteDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object DeleteDBSnapshotResult {
    def apply(DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined): DeleteDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshot" -> DBSnapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSnapshotResult]
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
    def apply(DBSubnetGroupName: String): DeleteDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

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
    def apply(SubscriptionName: String): DeleteEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  @js.native
  trait DeleteEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object DeleteEventSubscriptionResult {
    def apply(EventSubscription: js.UndefOr[EventSubscription] = js.undefined): DeleteEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("EventSubscription" -> EventSubscription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionResult]
    }
  }

  @js.native
  trait DeleteGlobalClusterMessage extends js.Object {
    var GlobalClusterIdentifier: String
  }

  object DeleteGlobalClusterMessage {
    def apply(GlobalClusterIdentifier: String): DeleteGlobalClusterMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GlobalClusterIdentifier" -> GlobalClusterIdentifier.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGlobalClusterMessage]
    }
  }

  @js.native
  trait DeleteGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  object DeleteGlobalClusterResult {
    def apply(GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined): DeleteGlobalClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalCluster" -> GlobalCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGlobalClusterResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteOptionGroupMessage extends js.Object {
    var OptionGroupName: String
  }

  object DeleteOptionGroupMessage {
    def apply(OptionGroupName: String): DeleteOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("OptionGroupName" -> OptionGroupName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOptionGroupMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {}

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
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeCertificatesMessage {
    def apply(CertificateIdentifier: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeCertificatesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateIdentifier" -> CertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificatesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeDBClusterBacktracksMessage extends js.Object {
    var DBClusterIdentifier: String
    var BacktrackIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBClusterBacktracksMessage {
    def apply(DBClusterIdentifier: String,
              BacktrackIdentifier: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBClusterBacktracksMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "BacktrackIdentifier" -> BacktrackIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBClusterBacktracksMessage]
    }
  }

  @js.native
  trait DescribeDBClusterEndpointsMessage extends js.Object {
    var DBClusterEndpointIdentifier: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBClusterEndpointsMessage {
    def apply(DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined,
              DBClusterIdentifier: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBClusterEndpointsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBClusterParameterGroupsMessage {
    def apply(DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterParameterGroupName: String,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              Source: js.UndefOr[String] = js.undefined): DescribeDBClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Source" -> Source.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterSnapshotIdentifier: String): DescribeDBClusterSnapshotAttributesMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeDBClusterSnapshotAttributesMessage]
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
      val _fields =
        IndexedSeq[(String, js.Any)]("DBClusterSnapshotAttributesResult" -> DBClusterSnapshotAttributesResult.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterIdentifier: js.UndefOr[String] = js.undefined,
              DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              IncludePublic: js.UndefOr[Boolean] = js.undefined,
              IncludeShared: js.UndefOr[Boolean] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              SnapshotType: js.UndefOr[String] = js.undefined): DescribeDBClusterSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludePublic" -> IncludePublic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeShared" -> IncludeShared.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotType" -> SnapshotType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterIdentifier: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
              DefaultOnly: js.UndefOr[Boolean] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.undefined,
              ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBEngineVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultOnly" -> DefaultOnly.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListSupportedCharacterSets" -> ListSupportedCharacterSets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListSupportedTimezones" -> ListSupportedTimezones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBEngineVersionsMessage]
    }
  }

  /**
    * Parameter input for DescribeDBInstanceAutomatedBackups.
    */
  @js.native
  trait DescribeDBInstanceAutomatedBackupsMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var DbiResourceId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBInstanceAutomatedBackupsMessage {
    def apply(DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
              DbiResourceId: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBInstanceAutomatedBackupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbiResourceId" -> DbiResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBInstancesMessage {
    def apply(DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBInstancesMessage]
    }
  }

  /**
    * This data type is used as a response element to <a>DescribeDBLogFiles</a>.
    */
  @js.native
  trait DescribeDBLogFilesDetails extends js.Object {
    var LastWritten: js.UndefOr[Double]
    var LogFileName: js.UndefOr[String]
    var Size: js.UndefOr[Double]
  }

  object DescribeDBLogFilesDetails {
    def apply(LastWritten: js.UndefOr[Double] = js.undefined,
              LogFileName: js.UndefOr[String] = js.undefined,
              Size: js.UndefOr[Double] = js.undefined): DescribeDBLogFilesDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastWritten" -> LastWritten.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogFileName" -> LogFileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Size" -> Size.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBLogFilesDetails]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeDBLogFilesMessage extends js.Object {
    var DBInstanceIdentifier: String
    var FileLastWritten: js.UndefOr[Double]
    var FileSize: js.UndefOr[Double]
    var FilenameContains: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBLogFilesMessage {
    def apply(DBInstanceIdentifier: String,
              FileLastWritten: js.UndefOr[Double] = js.undefined,
              FileSize: js.UndefOr[Double] = js.undefined,
              FilenameContains: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBLogFilesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "FileLastWritten" -> FileLastWritten.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FileSize" -> FileSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilenameContains" -> FilenameContains.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBLogFilesMessage]
    }
  }

  /**
    * The response from a call to <a>DescribeDBLogFiles</a>.
    */
  @js.native
  trait DescribeDBLogFilesResponse extends js.Object {
    var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBLogFilesResponse {
    def apply(DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DescribeDBLogFilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DescribeDBLogFiles" -> DescribeDBLogFiles.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBParameterGroupsMessage {
    def apply(DBParameterGroupName: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupName: String,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              Source: js.UndefOr[String] = js.undefined): DescribeDBParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Source" -> Source.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBSecurityGroupsMessage {
    def apply(DBSecurityGroupName: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupName" -> DBSecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSecurityGroupsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeDBSnapshotAttributesMessage extends js.Object {
    var DBSnapshotIdentifier: String
  }

  object DescribeDBSnapshotAttributesMessage {
    def apply(DBSnapshotIdentifier: String): DescribeDBSnapshotAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSnapshotAttributesMessage]
    }
  }

  @js.native
  trait DescribeDBSnapshotAttributesResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult]
  }

  object DescribeDBSnapshotAttributesResult {
    def apply(
        DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined
    ): DescribeDBSnapshotAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshotAttributesResult" -> DBSnapshotAttributesResult.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSnapshotAttributesResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeDBSnapshotsMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var DBSnapshotIdentifier: js.UndefOr[String]
    var DbiResourceId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var IncludePublic: js.UndefOr[Boolean]
    var IncludeShared: js.UndefOr[Boolean]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SnapshotType: js.UndefOr[String]
  }

  object DescribeDBSnapshotsMessage {
    def apply(DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
              DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
              DbiResourceId: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              IncludePublic: js.UndefOr[Boolean] = js.undefined,
              IncludeShared: js.UndefOr[Boolean] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              SnapshotType: js.UndefOr[String] = js.undefined): DescribeDBSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbiResourceId" -> DbiResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludePublic" -> IncludePublic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeShared" -> IncludeShared.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotType" -> SnapshotType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBSubnetGroupsMessage {
    def apply(DBSubnetGroupName: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDBSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupFamily: String,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeEngineDefaultClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeEngineDefaultClusterParametersMessage]
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
      val _fields = IndexedSeq[(String, js.Any)]("EngineDefaults" -> EngineDefaults.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeEngineDefaultClusterParametersResult]
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
    def apply(DBParameterGroupFamily: String,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeEngineDefaultParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  object DescribeEngineDefaultParametersResult {
    def apply(EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined): DescribeEngineDefaultParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)]("EngineDefaults" -> EngineDefaults.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Filters: js.UndefOr[FilterList] = js.undefined,
              SourceType: js.UndefOr[String] = js.undefined): DescribeEventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Filters" -> Filters.map { x =>
        x.asInstanceOf[js.Any]
      }, "SourceType" -> SourceType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              SubscriptionName: js.UndefOr[String] = js.undefined): DescribeEventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubscriptionName" -> SubscriptionName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Duration: js.UndefOr[IntegerOptional] = js.undefined,
              EndTime: js.UndefOr[TStamp] = js.undefined,
              EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              SourceIdentifier: js.UndefOr[String] = js.undefined,
              SourceType: js.UndefOr[SourceType] = js.undefined,
              StartTime: js.UndefOr[TStamp] = js.undefined): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventCategories" -> EventCategories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceIdentifier" -> SourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceType" -> SourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  @js.native
  trait DescribeGlobalClustersMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeGlobalClustersMessage {
    def apply(Filters: js.UndefOr[FilterList] = js.undefined,
              GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeGlobalClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterIdentifier" -> GlobalClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGlobalClustersMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeOptionGroupOptionsMessage extends js.Object {
    var EngineName: String
    var Filters: js.UndefOr[FilterList]
    var MajorEngineVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeOptionGroupOptionsMessage {
    def apply(EngineName: String,
              Filters: js.UndefOr[FilterList] = js.undefined,
              MajorEngineVersion: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeOptionGroupOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineName" -> EngineName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MajorEngineVersion" -> MajorEngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOptionGroupOptionsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeOptionGroupsMessage extends js.Object {
    var EngineName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MajorEngineVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var OptionGroupName: js.UndefOr[String]
  }

  object DescribeOptionGroupsMessage {
    def apply(EngineName: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              MajorEngineVersion: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined): DescribeOptionGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineName" -> EngineName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MajorEngineVersion" -> MajorEngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOptionGroupsMessage]
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
    def apply(Engine: String,
              DBInstanceClass: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              LicenseModel: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              Vpc: js.UndefOr[BooleanOptional] = js.undefined): DescribeOrderableDBInstanceOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Engine" -> Engine.asInstanceOf[js.Any],
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Vpc" -> Vpc.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              ResourceIdentifier: js.UndefOr[String] = js.undefined): DescribePendingMaintenanceActionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceIdentifier" -> ResourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var ReservedDBInstanceId: js.UndefOr[String]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
  }

  object DescribeReservedDBInstancesMessage {
    def apply(DBInstanceClass: js.UndefOr[String] = js.undefined,
              Duration: js.UndefOr[String] = js.undefined,
              Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
              OfferingType: js.UndefOr[String] = js.undefined,
              ProductDescription: js.UndefOr[String] = js.undefined,
              ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
              ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined): DescribeReservedDBInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductDescription" -> ProductDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedDBInstanceId" -> ReservedDBInstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
  }

  object DescribeReservedDBInstancesOfferingsMessage {
    def apply(
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
    ): DescribeReservedDBInstancesOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductDescription" -> ProductDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeReservedDBInstancesOfferingsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeSourceRegionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var RegionName: js.UndefOr[String]
  }

  object DescribeSourceRegionsMessage {
    def apply(Filters: js.UndefOr[FilterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              RegionName: js.UndefOr[String] = js.undefined): DescribeSourceRegionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegionName" -> RegionName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSourceRegionsMessage]
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
    def apply(DBInstanceIdentifier: String): DescribeValidDBInstanceModificationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeValidDBInstanceModificationsMessage]
    }
  }

  @js.native
  trait DescribeValidDBInstanceModificationsResult extends js.Object {
    var ValidDBInstanceModificationsMessage: js.UndefOr[ValidDBInstanceModificationsMessage]
  }

  object DescribeValidDBInstanceModificationsResult {
    def apply(
        ValidDBInstanceModificationsMessage: js.UndefOr[ValidDBInstanceModificationsMessage] = js.undefined
    ): DescribeValidDBInstanceModificationsResult = {
      val _fields =
        IndexedSeq[(String, js.Any)]("ValidDBInstanceModificationsMessage" -> ValidDBInstanceModificationsMessage.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeValidDBInstanceModificationsResult]
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
    def apply(Domain: js.UndefOr[String] = js.undefined,
              FQDN: js.UndefOr[String] = js.undefined,
              IAMRoleName: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): DomainMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FQDN" -> FQDN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IAMRoleName" -> IAMRoleName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainMembership]
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
    def apply(From: js.UndefOr[Double] = js.undefined, To: js.UndefOr[Double] = js.undefined): DoubleRange = {
      val _fields = IndexedSeq[(String, js.Any)]("From" -> From.map { x =>
        x.asInstanceOf[js.Any]
      }, "To" -> To.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DoubleRange]
    }
  }

  /**
    * This data type is used as a response element to <a>DownloadDBLogFilePortion</a>.
    */
  @js.native
  trait DownloadDBLogFilePortionDetails extends js.Object {
    var AdditionalDataPending: js.UndefOr[Boolean]
    var LogFileData: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DownloadDBLogFilePortionDetails {
    def apply(AdditionalDataPending: js.UndefOr[Boolean] = js.undefined,
              LogFileData: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): DownloadDBLogFilePortionDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalDataPending" -> AdditionalDataPending.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogFileData" -> LogFileData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDBLogFilePortionDetails]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DownloadDBLogFilePortionMessage extends js.Object {
    var DBInstanceIdentifier: String
    var LogFileName: String
    var Marker: js.UndefOr[String]
    var NumberOfLines: js.UndefOr[Int]
  }

  object DownloadDBLogFilePortionMessage {
    def apply(DBInstanceIdentifier: String,
              LogFileName: String,
              Marker: js.UndefOr[String] = js.undefined,
              NumberOfLines: js.UndefOr[Int] = js.undefined): DownloadDBLogFilePortionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "LogFileName"          -> LogFileName.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfLines" -> NumberOfLines.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDBLogFilePortionMessage]
    }
  }

  /**
    * This data type is used as a response element in the following actions:
    * * <a>AuthorizeDBSecurityGroupIngress</a>
    *  * <a>DescribeDBSecurityGroups</a>
    *  * <a>RevokeDBSecurityGroupIngress</a>
    */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object EC2SecurityGroup {
    def apply(EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2SecurityGroupId" -> EC2SecurityGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
    * This data type represents the information you need to connect to an Amazon RDS DB instance. This data type is used as a response element in the following actions:
    * * <a>CreateDBInstance</a>
    *  * <a>DescribeDBInstances</a>
    *  * <a>DeleteDBInstance</a>
    * For the data structure that represents Amazon Aurora DB cluster endpoints, see <a>DBClusterEndpoint</a>.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  object Endpoint {
    def apply(Address: js.UndefOr[String] = js.undefined,
              HostedZoneId: js.UndefOr[String] = js.undefined,
              Port: js.UndefOr[Int] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostedZoneId" -> HostedZoneId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              Parameters: js.UndefOr[ParametersList] = js.undefined): EngineDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupFamily" -> DBParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Date: js.UndefOr[TStamp] = js.undefined,
              EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              Message: js.UndefOr[String] = js.undefined,
              SourceArn: js.UndefOr[String] = js.undefined,
              SourceIdentifier: js.UndefOr[String] = js.undefined,
              SourceType: js.UndefOr[SourceType] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventCategories" -> EventCategories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceArn" -> SourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceIdentifier" -> SourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceType" -> SourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              SourceType: js.UndefOr[String] = js.undefined): EventCategoriesMap = {
      val _fields = IndexedSeq[(String, js.Any)]("EventCategories" -> EventCategories.map { x =>
        x.asInstanceOf[js.Any]
      }, "SourceType" -> SourceType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMap]
    }
  }

  /**
    * Data returned from the ```DescribeEventCategories``` action.
    */
  @js.native
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList]
  }

  object EventCategoriesMessage {
    def apply(EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined): EventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EventCategoriesMapList" -> EventCategoriesMapList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(CustSubscriptionId: js.UndefOr[String] = js.undefined,
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
        "CustSubscriptionId" -> CustSubscriptionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomerAwsId" -> CustomerAwsId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventCategoriesList" -> EventCategoriesList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventSubscriptionArn" -> EventSubscriptionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicArn" -> SnsTopicArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceIdsList" -> SourceIdsList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceType" -> SourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubscriptionCreationTime" -> SubscriptionCreationTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
    }
  }

  /**
    * Data returned by the ```DescribeEventSubscriptions``` action.
    */
  @js.native
  trait EventSubscriptionsMessage extends js.Object {
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
    var Marker: js.UndefOr[String]
  }

  object EventSubscriptionsMessage {
    def apply(EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): EventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EventSubscriptionsList" -> EventSubscriptionsList.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Events: js.UndefOr[EventList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): EventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Events" -> Events.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait FailoverDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var TargetDBInstanceIdentifier: js.UndefOr[String]
  }

  object FailoverDBClusterMessage {
    def apply(DBClusterIdentifier: String,
              TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined): FailoverDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "TargetDBInstanceIdentifier" -> TargetDBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailoverDBClusterMessage]
    }
  }

  @js.native
  trait FailoverDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object FailoverDBClusterResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): FailoverDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailoverDBClusterResult]
    }
  }

  /**
    * A filter name and value pair that is used to return a more specific list of results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as IDs. The filters supported by a describe operation are documented with the describe operation.
    *
    * '''Note:'''Currently, wildcards are not supported in filters.
    * The following actions can be filtered:
    * * <a>DescribeDBClusterBacktracks</a>
    *  * <a>DescribeDBClusterEndpoints</a>
    *  * <a>DescribeDBClusters</a>
    *  * <a>DescribeDBInstances</a>
    *  * <a>DescribePendingMaintenanceActions</a>
    */
  @js.native
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  object Filter {
    def apply(Name: String, Values: FilterValueList): Filter = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any], "Values" -> Values.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
    * A data type representing an Aurora global database.
    */
  @js.native
  trait GlobalCluster extends js.Object {
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var GlobalClusterArn: js.UndefOr[String]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList]
    var GlobalClusterResourceId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
  }

  object GlobalCluster {
    def apply(DatabaseName: js.UndefOr[String] = js.undefined,
              DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              GlobalClusterArn: js.UndefOr[String] = js.undefined,
              GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
              GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.undefined,
              GlobalClusterResourceId: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined): GlobalCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterArn" -> GlobalClusterArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterIdentifier" -> GlobalClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterMembers" -> GlobalClusterMembers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterResourceId" -> GlobalClusterResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalCluster]
    }
  }

  /**
    * A data structure with information about any primary and secondary clusters associated with an Aurora global database.
    */
  @js.native
  trait GlobalClusterMember extends js.Object {
    var DBClusterArn: js.UndefOr[String]
    var IsWriter: js.UndefOr[Boolean]
    var Readers: js.UndefOr[ReadersArnList]
  }

  object GlobalClusterMember {
    def apply(DBClusterArn: js.UndefOr[String] = js.undefined,
              IsWriter: js.UndefOr[Boolean] = js.undefined,
              Readers: js.UndefOr[ReadersArnList] = js.undefined): GlobalClusterMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterArn" -> DBClusterArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsWriter" -> IsWriter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Readers" -> Readers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalClusterMember]
    }
  }

  @js.native
  trait GlobalClustersMessage extends js.Object {
    var GlobalClusters: js.UndefOr[GlobalClusterList]
    var Marker: js.UndefOr[String]
  }

  object GlobalClustersMessage {
    def apply(GlobalClusters: js.UndefOr[GlobalClusterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): GlobalClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalClusters" -> GlobalClusters.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalClustersMessage]
    }
  }

  /**
    * This data type is used as a response element in the <a>DescribeDBSecurityGroups</a> action.
    */
  @js.native
  trait IPRange extends js.Object {
    var CIDRIP: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object IPRange {
    def apply(CIDRIP: js.UndefOr[String] = js.undefined, Status: js.UndefOr[String] = js.undefined): IPRange = {
      val _fields = IndexedSeq[(String, js.Any)]("CIDRIP" -> CIDRIP.map { x =>
        x.asInstanceOf[js.Any]
      }, "Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPRange]
    }
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
    def apply(ResourceName: String, Filters: js.UndefOr[FilterList] = js.undefined): ListTagsForResourceMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("ResourceName" -> ResourceName.asInstanceOf[js.Any], "Filters" -> Filters.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
    * The minimum DB engine version required for each corresponding allowed value for an option setting.
    */
  @js.native
  trait MinimumEngineVersionPerAllowedValue extends js.Object {
    var AllowedValue: js.UndefOr[String]
    var MinimumEngineVersion: js.UndefOr[String]
  }

  object MinimumEngineVersionPerAllowedValue {
    def apply(AllowedValue: js.UndefOr[String] = js.undefined,
              MinimumEngineVersion: js.UndefOr[String] = js.undefined): MinimumEngineVersionPerAllowedValue = {
      val _fields = IndexedSeq[(String, js.Any)]("AllowedValue" -> AllowedValue.map { x =>
        x.asInstanceOf[js.Any]
      }, "MinimumEngineVersion" -> MinimumEngineVersion.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MinimumEngineVersionPerAllowedValue]
    }
  }

  @js.native
  trait ModifyCurrentDBClusterCapacityMessage extends js.Object {
    var DBClusterIdentifier: String
    var Capacity: js.UndefOr[IntegerOptional]
    var SecondsBeforeTimeout: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  object ModifyCurrentDBClusterCapacityMessage {
    def apply(DBClusterIdentifier: String,
              Capacity: js.UndefOr[IntegerOptional] = js.undefined,
              SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
              TimeoutAction: js.UndefOr[String] = js.undefined): ModifyCurrentDBClusterCapacityMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Capacity" -> Capacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecondsBeforeTimeout" -> SecondsBeforeTimeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeoutAction" -> TimeoutAction.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCurrentDBClusterCapacityMessage]
    }
  }

  @js.native
  trait ModifyDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: String
    var EndpointType: js.UndefOr[String]
    var ExcludedMembers: js.UndefOr[StringList]
    var StaticMembers: js.UndefOr[StringList]
  }

  object ModifyDBClusterEndpointMessage {
    def apply(DBClusterEndpointIdentifier: String,
              EndpointType: js.UndefOr[String] = js.undefined,
              ExcludedMembers: js.UndefOr[StringList] = js.undefined,
              StaticMembers: js.UndefOr[StringList] = js.undefined): ModifyDBClusterEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.asInstanceOf[js.Any],
        "EndpointType" -> EndpointType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExcludedMembers" -> ExcludedMembers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StaticMembers" -> StaticMembers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterEndpointMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableHttpEndpoint: js.UndefOr[BooleanOptional]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var NewDBClusterIdentifier: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object ModifyDBClusterMessage {
    def apply(DBClusterIdentifier: String,
              ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
              BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
              BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined,
              DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
              DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
              EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.undefined,
              EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              MasterUserPassword: js.UndefOr[String] = js.undefined,
              NewDBClusterIdentifier: js.UndefOr[String] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined,
              Port: js.UndefOr[IntegerOptional] = js.undefined,
              PreferredBackupWindow: js.UndefOr[String] = js.undefined,
              PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
              ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined,
              VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): ModifyDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "ApplyImmediately" -> ApplyImmediately.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackWindow" -> BacktrackWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudwatchLogsExportConfiguration" -> CloudwatchLogsExportConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableHttpEndpoint" -> EnableHttpEndpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUserPassword" -> MasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewDBClusterIdentifier" -> NewDBClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingConfiguration" -> ScalingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBClusterParameterGroupName: String, Parameters: ParametersList): ModifyDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "Parameters"                  -> Parameters.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ModifyDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object ModifyDBClusterResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): ModifyDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
        ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
    ): ModifyDBClusterSnapshotAttributeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName"               -> AttributeName.asInstanceOf[js.Any],
        "DBClusterSnapshotIdentifier" -> DBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "ValuesToAdd" -> ValuesToAdd.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValuesToRemove" -> ValuesToRemove.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBClusterSnapshotAttributeMessage]
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
      val _fields =
        IndexedSeq[(String, js.Any)]("DBClusterSnapshotAttributesResult" -> DBClusterSnapshotAttributesResult.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

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
    var DeletionProtection: js.UndefOr[BooleanOptional]
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
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var PromotionTier: js.UndefOr[IntegerOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var StorageType: js.UndefOr[String]
    var TdeCredentialArn: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object ModifyDBInstanceMessage {
    def apply(DBInstanceIdentifier: String,
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
              DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
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
              PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              PreferredBackupWindow: js.UndefOr[String] = js.undefined,
              PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
              ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
              PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
              PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
              StorageType: js.UndefOr[String] = js.undefined,
              TdeCredentialArn: js.UndefOr[String] = js.undefined,
              TdeCredentialPassword: js.UndefOr[String] = js.undefined,
              UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
              VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): ModifyDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowMajorVersionUpgrade" -> AllowMajorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplyImmediately" -> ApplyImmediately.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudwatchLogsExportConfiguration" -> CloudwatchLogsExportConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupName" -> DBParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBPortNumber" -> DBPortNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSecurityGroups" -> DBSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUserPassword" -> MasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringInterval" -> MonitoringInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewDBInstanceIdentifier" -> NewDBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PromotionTier" -> PromotionTier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialArn" -> TdeCredentialArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBInstanceMessage]
    }
  }

  @js.native
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object ModifyDBInstanceResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): ModifyDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupName: String, Parameters: ParametersList): ModifyDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any],
        "Parameters"           -> Parameters.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBParameterGroupMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyDBSnapshotAttributeMessage extends js.Object {
    var AttributeName: String
    var DBSnapshotIdentifier: String
    var ValuesToAdd: js.UndefOr[AttributeValueList]
    var ValuesToRemove: js.UndefOr[AttributeValueList]
  }

  object ModifyDBSnapshotAttributeMessage {
    def apply(AttributeName: String,
              DBSnapshotIdentifier: String,
              ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined,
              ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined): ModifyDBSnapshotAttributeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName"        -> AttributeName.asInstanceOf[js.Any],
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any],
        "ValuesToAdd" -> ValuesToAdd.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValuesToRemove" -> ValuesToRemove.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSnapshotAttributeMessage]
    }
  }

  @js.native
  trait ModifyDBSnapshotAttributeResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult]
  }

  object ModifyDBSnapshotAttributeResult {
    def apply(
        DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined
    ): ModifyDBSnapshotAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshotAttributesResult" -> DBSnapshotAttributesResult.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSnapshotAttributeResult]
    }
  }

  @js.native
  trait ModifyDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: String
    var EngineVersion: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
  }

  object ModifyDBSnapshotMessage {
    def apply(DBSnapshotIdentifier: String,
              EngineVersion: js.UndefOr[String] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined): ModifyDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any],
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSnapshotMessage]
    }
  }

  @js.native
  trait ModifyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object ModifyDBSnapshotResult {
    def apply(DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined): ModifyDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSnapshot" -> DBSnapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSnapshotResult]
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
    def apply(DBSubnetGroupName: String,
              SubnetIds: SubnetIdentifierList,
              DBSubnetGroupDescription: js.UndefOr[String] = js.undefined): ModifyDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSubnetGroupName" -> DBSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"         -> SubnetIds.asInstanceOf[js.Any],
        "DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup]
  }

  object ModifyDBSubnetGroupResult {
    def apply(DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined): ModifyDBSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSubnetGroup" -> DBSubnetGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(SubscriptionName: String,
              Enabled: js.UndefOr[BooleanOptional] = js.undefined,
              EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              SnsTopicArn: js.UndefOr[String] = js.undefined,
              SourceType: js.UndefOr[String] = js.undefined): ModifyEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any],
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventCategories" -> EventCategories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicArn" -> SnsTopicArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceType" -> SourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  @js.native
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object ModifyEventSubscriptionResult {
    def apply(EventSubscription: js.UndefOr[EventSubscription] = js.undefined): ModifyEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("EventSubscription" -> EventSubscription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionResult]
    }
  }

  @js.native
  trait ModifyGlobalClusterMessage extends js.Object {
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var NewGlobalClusterIdentifier: js.UndefOr[String]
  }

  object ModifyGlobalClusterMessage {
    def apply(DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
              GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
              NewGlobalClusterIdentifier: js.UndefOr[String] = js.undefined): ModifyGlobalClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterIdentifier" -> GlobalClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewGlobalClusterIdentifier" -> NewGlobalClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyGlobalClusterMessage]
    }
  }

  @js.native
  trait ModifyGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  object ModifyGlobalClusterResult {
    def apply(GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined): ModifyGlobalClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalCluster" -> GlobalCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyGlobalClusterResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyOptionGroupMessage extends js.Object {
    var OptionGroupName: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var OptionsToInclude: js.UndefOr[OptionConfigurationList]
    var OptionsToRemove: js.UndefOr[OptionNamesList]
  }

  object ModifyOptionGroupMessage {
    def apply(OptionGroupName: String,
              ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
              OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.undefined,
              OptionsToRemove: js.UndefOr[OptionNamesList] = js.undefined): ModifyOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionGroupName" -> OptionGroupName.asInstanceOf[js.Any],
        "ApplyImmediately" -> ApplyImmediately.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionsToInclude" -> OptionsToInclude.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionsToRemove" -> OptionsToRemove.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyOptionGroupMessage]
    }
  }

  @js.native
  trait ModifyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object ModifyOptionGroupResult {
    def apply(OptionGroup: js.UndefOr[OptionGroup] = js.undefined): ModifyOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("OptionGroup" -> OptionGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyOptionGroupResult]
    }
  }

  /**
    * Option details.
    */
  @js.native
  trait Option extends js.Object {
    var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList]
    var OptionDescription: js.UndefOr[String]
    var OptionName: js.UndefOr[String]
    var OptionSettings: js.UndefOr[OptionSettingConfigurationList]
    var OptionVersion: js.UndefOr[String]
    var Permanent: js.UndefOr[Boolean]
    var Persistent: js.UndefOr[Boolean]
    var Port: js.UndefOr[IntegerOptional]
    var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  object Option {
    def apply(DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined,
              OptionDescription: js.UndefOr[String] = js.undefined,
              OptionName: js.UndefOr[String] = js.undefined,
              OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.undefined,
              OptionVersion: js.UndefOr[String] = js.undefined,
              Permanent: js.UndefOr[Boolean] = js.undefined,
              Persistent: js.UndefOr[Boolean] = js.undefined,
              Port: js.UndefOr[IntegerOptional] = js.undefined,
              VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined): Option = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupMemberships" -> DBSecurityGroupMemberships.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionDescription" -> OptionDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionName" -> OptionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionSettings" -> OptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionVersion" -> OptionVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Permanent" -> Permanent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Persistent" -> Persistent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupMemberships" -> VpcSecurityGroupMemberships.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Option]
    }
  }

  /**
    * A list of all available options
    */
  @js.native
  trait OptionConfiguration extends js.Object {
    var OptionName: String
    var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList]
    var OptionSettings: js.UndefOr[OptionSettingsList]
    var OptionVersion: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList]
  }

  object OptionConfiguration {
    def apply(OptionName: String,
              DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
              OptionSettings: js.UndefOr[OptionSettingsList] = js.undefined,
              OptionVersion: js.UndefOr[String] = js.undefined,
              Port: js.UndefOr[IntegerOptional] = js.undefined,
              VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): OptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OptionName" -> OptionName.asInstanceOf[js.Any],
        "DBSecurityGroupMemberships" -> DBSecurityGroupMemberships.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionSettings" -> OptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionVersion" -> OptionVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupMemberships" -> VpcSecurityGroupMemberships.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait OptionGroup extends js.Object {
    var AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean]
    var EngineName: js.UndefOr[String]
    var MajorEngineVersion: js.UndefOr[String]
    var OptionGroupArn: js.UndefOr[String]
    var OptionGroupDescription: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Options: js.UndefOr[OptionsList]
    var VpcId: js.UndefOr[String]
  }

  object OptionGroup {
    def apply(AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.undefined,
              EngineName: js.UndefOr[String] = js.undefined,
              MajorEngineVersion: js.UndefOr[String] = js.undefined,
              OptionGroupArn: js.UndefOr[String] = js.undefined,
              OptionGroupDescription: js.UndefOr[String] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined,
              Options: js.UndefOr[OptionsList] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): OptionGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowsVpcAndNonVpcInstanceMemberships" -> AllowsVpcAndNonVpcInstanceMemberships.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineName" -> EngineName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MajorEngineVersion" -> MajorEngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupArn" -> OptionGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupDescription" -> OptionGroupDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Options" -> Options.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroup]
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
    def apply(OptionGroupName: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): OptionGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)]("OptionGroupName" -> OptionGroupName.map { x =>
        x.asInstanceOf[js.Any]
      }, "Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupMembership]
    }
  }

  /**
    * Available option.
    */
  @js.native
  trait OptionGroupOption extends js.Object {
    var DefaultPort: js.UndefOr[IntegerOptional]
    var Description: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var MajorEngineVersion: js.UndefOr[String]
    var MinimumRequiredMinorEngineVersion: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList]
    var OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList]
    var OptionsConflictsWith: js.UndefOr[OptionsConflictsWith]
    var OptionsDependedOn: js.UndefOr[OptionsDependedOn]
    var Permanent: js.UndefOr[Boolean]
    var Persistent: js.UndefOr[Boolean]
    var PortRequired: js.UndefOr[Boolean]
    var RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean]
    var SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional]
    var VpcOnly: js.UndefOr[Boolean]
  }

  object OptionGroupOption {
    def apply(DefaultPort: js.UndefOr[IntegerOptional] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              EngineName: js.UndefOr[String] = js.undefined,
              MajorEngineVersion: js.UndefOr[String] = js.undefined,
              MinimumRequiredMinorEngineVersion: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList] = js.undefined,
              OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList] = js.undefined,
              OptionsConflictsWith: js.UndefOr[OptionsConflictsWith] = js.undefined,
              OptionsDependedOn: js.UndefOr[OptionsDependedOn] = js.undefined,
              Permanent: js.UndefOr[Boolean] = js.undefined,
              Persistent: js.UndefOr[Boolean] = js.undefined,
              PortRequired: js.UndefOr[Boolean] = js.undefined,
              RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
              SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional] = js.undefined,
              VpcOnly: js.UndefOr[Boolean] = js.undefined): OptionGroupOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultPort" -> DefaultPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineName" -> EngineName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MajorEngineVersion" -> MajorEngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinimumRequiredMinorEngineVersion" -> MinimumRequiredMinorEngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupOptionSettings" -> OptionGroupOptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupOptionVersions" -> OptionGroupOptionVersions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionsConflictsWith" -> OptionsConflictsWith.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionsDependedOn" -> OptionsDependedOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Permanent" -> Permanent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Persistent" -> Persistent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PortRequired" -> PortRequired.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequiresAutoMinorEngineVersionUpgrade" -> RequiresAutoMinorEngineVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportsOptionVersionDowngrade" -> SupportsOptionVersionDowngrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcOnly" -> VpcOnly.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOption]
    }
  }

  /**
    * Option group option settings are used to display settings available for each option with their default values and other information. These values are used with the DescribeOptionGroupOptions action.
    */
  @js.native
  trait OptionGroupOptionSetting extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var ApplyType: js.UndefOr[String]
    var DefaultValue: js.UndefOr[String]
    var IsModifiable: js.UndefOr[Boolean]
    var IsRequired: js.UndefOr[Boolean]
    var MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList]
    var SettingDescription: js.UndefOr[String]
    var SettingName: js.UndefOr[String]
  }

  object OptionGroupOptionSetting {
    def apply(AllowedValues: js.UndefOr[String] = js.undefined,
              ApplyType: js.UndefOr[String] = js.undefined,
              DefaultValue: js.UndefOr[String] = js.undefined,
              IsModifiable: js.UndefOr[Boolean] = js.undefined,
              IsRequired: js.UndefOr[Boolean] = js.undefined,
              MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList] = js.undefined,
              SettingDescription: js.UndefOr[String] = js.undefined,
              SettingName: js.UndefOr[String] = js.undefined): OptionGroupOptionSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplyType" -> ApplyType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultValue" -> DefaultValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsModifiable" -> IsModifiable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsRequired" -> IsRequired.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinimumEngineVersionPerAllowedValue" -> MinimumEngineVersionPerAllowedValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SettingDescription" -> SettingDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SettingName" -> SettingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOptionSetting]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait OptionGroupOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList]
  }

  object OptionGroupOptionsMessage {
    def apply(Marker: js.UndefOr[String] = js.undefined,
              OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.undefined): OptionGroupOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "OptionGroupOptions" -> OptionGroupOptions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOptionsMessage]
    }
  }

  /**
    * List of option groups.
    */
  @js.native
  trait OptionGroups extends js.Object {
    var Marker: js.UndefOr[String]
    var OptionGroupsList: js.UndefOr[OptionGroupsList]
  }

  object OptionGroups {
    def apply(Marker: js.UndefOr[String] = js.undefined,
              OptionGroupsList: js.UndefOr[OptionGroupsList] = js.undefined): OptionGroups = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "OptionGroupsList" -> OptionGroupsList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroups]
    }
  }

  /**
    * Option settings are the actual settings being applied or configured for that option. It is used when you modify an option group or describe option groups. For example, the NATIVE_NETWORK_ENCRYPTION option has a setting called SQLNET.ENCRYPTION_SERVER that can have several different values.
    */
  @js.native
  trait OptionSetting extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var ApplyType: js.UndefOr[String]
    var DataType: js.UndefOr[String]
    var DefaultValue: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var IsCollection: js.UndefOr[Boolean]
    var IsModifiable: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object OptionSetting {
    def apply(AllowedValues: js.UndefOr[String] = js.undefined,
              ApplyType: js.UndefOr[String] = js.undefined,
              DataType: js.UndefOr[String] = js.undefined,
              DefaultValue: js.UndefOr[String] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              IsCollection: js.UndefOr[Boolean] = js.undefined,
              IsModifiable: js.UndefOr[Boolean] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Value: js.UndefOr[String] = js.undefined): OptionSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplyType" -> ApplyType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DataType" -> DataType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultValue" -> DefaultValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsCollection" -> IsCollection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsModifiable" -> IsModifiable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionSetting]
    }
  }

  /**
    * The version for an option. Option group option versions are returned by the <a>DescribeOptionGroupOptions</a> action.
    */
  @js.native
  trait OptionVersion extends js.Object {
    var IsDefault: js.UndefOr[Boolean]
    var Version: js.UndefOr[String]
  }

  object OptionVersion {
    def apply(IsDefault: js.UndefOr[Boolean] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): OptionVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("IsDefault" -> IsDefault.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionVersion]
    }
  }

  /**
    * Contains a list of available options for a DB instance.
    *  This data type is used as a response element in the <a>DescribeOrderableDBInstanceOptions</a> action.
    */
  @js.native
  trait OrderableDBInstanceOption extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList]
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
    var SupportedEngineModes: js.UndefOr[EngineModeList]
    var SupportsEnhancedMonitoring: js.UndefOr[Boolean]
    var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean]
    var SupportsIops: js.UndefOr[Boolean]
    var SupportsPerformanceInsights: js.UndefOr[Boolean]
    var SupportsStorageEncryption: js.UndefOr[Boolean]
    var Vpc: js.UndefOr[Boolean]
  }

  object OrderableDBInstanceOption {
    def apply(AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
              AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined,
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
              SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined,
              SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined,
              SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined,
              SupportsIops: js.UndefOr[Boolean] = js.undefined,
              SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined,
              SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined,
              Vpc: js.UndefOr[Boolean] = js.undefined): OrderableDBInstanceOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailableProcessorFeatures" -> AvailableProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxIopsPerDbInstance" -> MaxIopsPerDbInstance.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxIopsPerGib" -> MaxIopsPerGib.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxStorageSize" -> MaxStorageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinIopsPerDbInstance" -> MinIopsPerDbInstance.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinIopsPerGib" -> MinIopsPerGib.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinStorageSize" -> MinStorageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZCapable" -> MultiAZCapable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadReplicaCapable" -> ReadReplicaCapable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedEngineModes" -> SupportedEngineModes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportsEnhancedMonitoring" -> SupportsEnhancedMonitoring.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportsIAMDatabaseAuthentication" -> SupportsIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportsIops" -> SupportsIops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportsPerformanceInsights" -> SupportsPerformanceInsights.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportsStorageEncryption" -> SupportsStorageEncryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Vpc" -> Vpc.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined
    ): OrderableDBInstanceOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "OrderableDBInstanceOptions" -> OrderableDBInstanceOptions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    var SupportedEngineModes: js.UndefOr[EngineModeList]
  }

  object Parameter {
    def apply(AllowedValues: js.UndefOr[String] = js.undefined,
              ApplyMethod: js.UndefOr[ApplyMethod] = js.undefined,
              ApplyType: js.UndefOr[String] = js.undefined,
              DataType: js.UndefOr[String] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              IsModifiable: js.UndefOr[Boolean] = js.undefined,
              MinimumEngineVersion: js.UndefOr[String] = js.undefined,
              ParameterName: js.UndefOr[String] = js.undefined,
              ParameterValue: js.UndefOr[String] = js.undefined,
              Source: js.UndefOr[String] = js.undefined,
              SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplyMethod" -> ApplyMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplyType" -> ApplyType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DataType" -> DataType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsModifiable" -> IsModifiable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterName" -> ParameterName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterValue" -> ParameterValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Source" -> Source.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedEngineModes" -> SupportedEngineModes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(LogTypesToDisable: js.UndefOr[LogTypeList] = js.undefined,
              LogTypesToEnable: js.UndefOr[LogTypeList] = js.undefined): PendingCloudwatchLogsExports = {
      val _fields = IndexedSeq[(String, js.Any)]("LogTypesToDisable" -> LogTypesToDisable.map { x =>
        x.asInstanceOf[js.Any]
      }, "LogTypesToEnable" -> LogTypesToEnable.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Action: js.UndefOr[String] = js.undefined,
              AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined,
              CurrentApplyDate: js.UndefOr[TStamp] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              ForcedApplyDate: js.UndefOr[TStamp] = js.undefined,
              OptInStatus: js.UndefOr[String] = js.undefined): PendingMaintenanceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoAppliedAfterDate" -> AutoAppliedAfterDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentApplyDate" -> CurrentApplyDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ForcedApplyDate" -> ForcedApplyDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptInStatus" -> OptInStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceAction]
    }
  }

  /**
    * Data returned from the ```DescribePendingMaintenanceActions``` action.
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
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "PendingMaintenanceActions" -> PendingMaintenanceActions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var StorageType: js.UndefOr[String]
  }

  object PendingModifiedValues {
    def apply(AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
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
              ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
              StorageType: js.UndefOr[String] = js.undefined): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CACertificateIdentifier" -> CACertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceIdentifier" -> DBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUserPassword" -> MasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PendingCloudwatchLogsExports" -> PendingCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
    }
  }

  /**
    * Contains the processor features of a DB instance class.
    *  To specify the number of CPU cores, use the <code>coreCount</code> feature name for the <code>Name</code> parameter. To specify the number of threads per core, use the <code>threadsPerCore</code> feature name for the <code>Name</code> parameter.
    *  You can set the processor features of the DB instance class for a DB instance when you call one of the following actions:
    * * <a>CreateDBInstance</a>
    *  * <a>ModifyDBInstance</a>
    *  * <a>RestoreDBInstanceFromDBSnapshot</a>
    *  * <a>RestoreDBInstanceFromS3</a>
    *  * <a>RestoreDBInstanceToPointInTime</a>
    * You can view the valid processor values for a particular instance class by calling the <a>DescribeOrderableDBInstanceOptions</a> action and specifying the instance class for the <code>DBInstanceClass</code> parameter.
    *  In addition, you can use the following actions for DB instance class processor information:
    * * <a>DescribeDBInstances</a>
    *  * <a>DescribeDBSnapshots</a>
    *  * <a>DescribeValidDBInstanceModifications</a>
    * For more information, see [[http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor|Configuring the Processor of the DB Instance Class]] in the <i>Amazon RDS User Guide. </i>
    */
  @js.native
  trait ProcessorFeature extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object ProcessorFeature {
    def apply(Name: js.UndefOr[String] = js.undefined, Value: js.UndefOr[String] = js.undefined): ProcessorFeature = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessorFeature]
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
    def apply(DBClusterIdentifier: String): PromoteReadReplicaDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaDBClusterMessage]
    }
  }

  @js.native
  trait PromoteReadReplicaDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object PromoteReadReplicaDBClusterResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): PromoteReadReplicaDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaDBClusterResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait PromoteReadReplicaMessage extends js.Object {
    var DBInstanceIdentifier: String
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
  }

  object PromoteReadReplicaMessage {
    def apply(DBInstanceIdentifier: String,
              BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              PreferredBackupWindow: js.UndefOr[String] = js.undefined): PromoteReadReplicaMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaMessage]
    }
  }

  @js.native
  trait PromoteReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object PromoteReadReplicaResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): PromoteReadReplicaResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
    var ReservedDBInstancesOfferingId: String
    var DBInstanceCount: js.UndefOr[IntegerOptional]
    var ReservedDBInstanceId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object PurchaseReservedDBInstancesOfferingMessage {
    def apply(ReservedDBInstancesOfferingId: String,
              DBInstanceCount: js.UndefOr[IntegerOptional] = js.undefined,
              ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): PurchaseReservedDBInstancesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.asInstanceOf[js.Any],
        "DBInstanceCount" -> DBInstanceCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedDBInstanceId" -> ReservedDBInstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PurchaseReservedDBInstancesOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
    var ReservedDBInstance: js.UndefOr[ReservedDBInstance]
  }

  object PurchaseReservedDBInstancesOfferingResult {
    def apply(
        ReservedDBInstance: js.UndefOr[ReservedDBInstance] = js.undefined
    ): PurchaseReservedDBInstancesOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ReservedDBInstance" -> ReservedDBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
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
    def apply(From: js.UndefOr[Int] = js.undefined,
              Step: js.UndefOr[IntegerOptional] = js.undefined,
              To: js.UndefOr[Int] = js.undefined): Range = {
      val _fields = IndexedSeq[(String, js.Any)]("From" -> From.map { x =>
        x.asInstanceOf[js.Any]
      }, "Step" -> Step.map { x =>
        x.asInstanceOf[js.Any]
      }, "To" -> To.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBInstanceIdentifier: String,
              ForceFailover: js.UndefOr[BooleanOptional] = js.undefined): RebootDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "ForceFailover" -> ForceFailover.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootDBInstanceMessage]
    }
  }

  @js.native
  trait RebootDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RebootDBInstanceResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): RebootDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootDBInstanceResult]
    }
  }

  /**
    * This data type is used as a response element in the <a>DescribeReservedDBInstances</a> and <a>DescribeReservedDBInstancesOfferings</a> actions.
    */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  object RecurringCharge {
    def apply(RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
              RecurringChargeFrequency: js.UndefOr[String] = js.undefined): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecurringChargeAmount" -> RecurringChargeAmount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecurringChargeFrequency" -> RecurringChargeFrequency.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }

  @js.native
  trait RemoveFromGlobalClusterMessage extends js.Object {
    var DbClusterIdentifier: js.UndefOr[String]
    var GlobalClusterIdentifier: js.UndefOr[String]
  }

  object RemoveFromGlobalClusterMessage {
    def apply(DbClusterIdentifier: js.UndefOr[String] = js.undefined,
              GlobalClusterIdentifier: js.UndefOr[String] = js.undefined): RemoveFromGlobalClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DbClusterIdentifier" -> DbClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalClusterIdentifier" -> GlobalClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveFromGlobalClusterMessage]
    }
  }

  @js.native
  trait RemoveFromGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  object RemoveFromGlobalClusterResult {
    def apply(GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined): RemoveFromGlobalClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalCluster" -> GlobalCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveFromGlobalClusterResult]
    }
  }

  @js.native
  trait RemoveRoleFromDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
  }

  object RemoveRoleFromDBClusterMessage {
    def apply(DBClusterIdentifier: String, RoleArn: String): RemoveRoleFromDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "RoleArn"             -> RoleArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(SourceIdentifier: String, SubscriptionName: String): RemoveSourceIdentifierFromSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIdentifier" -> SourceIdentifier.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[RemoveSourceIdentifierFromSubscriptionMessage]
    }
  }

  @js.native
  trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object RemoveSourceIdentifierFromSubscriptionResult {
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): RemoveSourceIdentifierFromSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("EventSubscription" -> EventSubscription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
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
    def apply(ResourceName: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
    * This data type is used as a response element in the <a>DescribeReservedDBInstances</a> and <a>PurchaseReservedDBInstancesOffering</a> actions.
    */
  @js.native
  trait ReservedDBInstance extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var DBInstanceCount: js.UndefOr[Int]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var MultiAZ: js.UndefOr[Boolean]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedDBInstanceArn: js.UndefOr[String]
    var ReservedDBInstanceId: js.UndefOr[String]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var State: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
  }

  object ReservedDBInstance {
    def apply(CurrencyCode: js.UndefOr[String] = js.undefined,
              DBInstanceClass: js.UndefOr[String] = js.undefined,
              DBInstanceCount: js.UndefOr[Int] = js.undefined,
              Duration: js.UndefOr[Int] = js.undefined,
              FixedPrice: js.UndefOr[Double] = js.undefined,
              MultiAZ: js.UndefOr[Boolean] = js.undefined,
              OfferingType: js.UndefOr[String] = js.undefined,
              ProductDescription: js.UndefOr[String] = js.undefined,
              RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
              ReservedDBInstanceArn: js.UndefOr[String] = js.undefined,
              ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
              ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
              StartTime: js.UndefOr[TStamp] = js.undefined,
              State: js.UndefOr[String] = js.undefined,
              UsagePrice: js.UndefOr[Double] = js.undefined): ReservedDBInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceCount" -> DBInstanceCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductDescription" -> ProductDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecurringCharges" -> RecurringCharges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedDBInstanceArn" -> ReservedDBInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedDBInstanceId" -> ReservedDBInstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsagePrice" -> UsagePrice.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstance]
    }
  }

  /**
    * Contains the result of a successful invocation of the <a>DescribeReservedDBInstances</a> action.
    */
  @js.native
  trait ReservedDBInstanceMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList]
  }

  object ReservedDBInstanceMessage {
    def apply(Marker: js.UndefOr[String] = js.undefined,
              ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.undefined): ReservedDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "ReservedDBInstances" -> ReservedDBInstances.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstanceMessage]
    }
  }

  /**
    * This data type is used as a response element in the <a>DescribeReservedDBInstancesOfferings</a> action.
    */
  @js.native
  trait ReservedDBInstancesOffering extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var MultiAZ: js.UndefOr[Boolean]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
  }

  object ReservedDBInstancesOffering {
    def apply(CurrencyCode: js.UndefOr[String] = js.undefined,
              DBInstanceClass: js.UndefOr[String] = js.undefined,
              Duration: js.UndefOr[Int] = js.undefined,
              FixedPrice: js.UndefOr[Double] = js.undefined,
              MultiAZ: js.UndefOr[Boolean] = js.undefined,
              OfferingType: js.UndefOr[String] = js.undefined,
              ProductDescription: js.UndefOr[String] = js.undefined,
              RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
              ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
              UsagePrice: js.UndefOr[Double] = js.undefined): ReservedDBInstancesOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductDescription" -> ProductDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecurringCharges" -> RecurringCharges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsagePrice" -> UsagePrice.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstancesOffering]
    }
  }

  /**
    * Contains the result of a successful invocation of the <a>DescribeReservedDBInstancesOfferings</a> action.
    */
  @js.native
  trait ReservedDBInstancesOfferingMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList]
  }

  object ReservedDBInstancesOfferingMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.undefined
    ): ReservedDBInstancesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "ReservedDBInstancesOfferings" -> ReservedDBInstancesOfferings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstancesOfferingMessage]
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
    def apply(DBClusterParameterGroupName: String,
              Parameters: js.UndefOr[ParametersList] = js.undefined,
              ResetAllParameters: js.UndefOr[Boolean] = js.undefined): ResetDBClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.asInstanceOf[js.Any],
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResetAllParameters" -> ResetAllParameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(DBParameterGroupName: String,
              Parameters: js.UndefOr[ParametersList] = js.undefined,
              ResetAllParameters: js.UndefOr[Boolean] = js.undefined): ResetDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBParameterGroupName" -> DBParameterGroupName.asInstanceOf[js.Any],
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResetAllParameters" -> ResetAllParameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetDBParameterGroupMessage]
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
    def apply(PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined,
              ResourceIdentifier: js.UndefOr[String] = js.undefined): ResourcePendingMaintenanceActions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PendingMaintenanceActionDetails" -> PendingMaintenanceActionDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceIdentifier" -> ResourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourcePendingMaintenanceActions]
    }
  }

  @js.native
  trait RestoreDBClusterFromS3Message extends js.Object {
    var DBClusterIdentifier: String
    var Engine: String
    var MasterUserPassword: String
    var MasterUsername: String
    var S3BucketName: String
    var S3IngestionRoleArn: String
    var SourceEngine: String
    var SourceEngineVersion: String
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CharacterSetName: js.UndefOr[String]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var S3Prefix: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object RestoreDBClusterFromS3Message {
    def apply(DBClusterIdentifier: String,
              Engine: String,
              MasterUserPassword: String,
              MasterUsername: String,
              S3BucketName: String,
              S3IngestionRoleArn: String,
              SourceEngine: String,
              SourceEngineVersion: String,
              AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
              BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
              BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              CharacterSetName: js.UndefOr[String] = js.undefined,
              DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
              DBSubnetGroupName: js.UndefOr[String] = js.undefined,
              DatabaseName: js.UndefOr[String] = js.undefined,
              DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
              EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
              EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              KmsKeyId: js.UndefOr[String] = js.undefined,
              OptionGroupName: js.UndefOr[String] = js.undefined,
              Port: js.UndefOr[IntegerOptional] = js.undefined,
              PreferredBackupWindow: js.UndefOr[String] = js.undefined,
              PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
              S3Prefix: js.UndefOr[String] = js.undefined,
              StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined,
              VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): RestoreDBClusterFromS3Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any],
        "MasterUserPassword"  -> MasterUserPassword.asInstanceOf[js.Any],
        "MasterUsername"      -> MasterUsername.asInstanceOf[js.Any],
        "S3BucketName"        -> S3BucketName.asInstanceOf[js.Any],
        "S3IngestionRoleArn"  -> S3IngestionRoleArn.asInstanceOf[js.Any],
        "SourceEngine"        -> SourceEngine.asInstanceOf[js.Any],
        "SourceEngineVersion" -> SourceEngineVersion.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackWindow" -> BacktrackWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CharacterSetName" -> CharacterSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Prefix" -> S3Prefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterFromS3Message]
    }
  }

  @js.native
  trait RestoreDBClusterFromS3Result extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterFromS3Result {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): RestoreDBClusterFromS3Result = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterFromS3Result]
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
    var BacktrackWindow: js.UndefOr[LongOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var EngineMode: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object RestoreDBClusterFromSnapshotMessage {
    def apply(
        DBClusterIdentifier: String,
        Engine: String,
        SnapshotIdentifier: String,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
        EngineMode: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBClusterFromSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any],
        "SnapshotIdentifier"  -> SnapshotIdentifier.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BacktrackWindow" -> BacktrackWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineMode" -> EngineMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingConfiguration" -> ScalingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterFromSnapshotMessage]
    }
  }

  @js.native
  trait RestoreDBClusterFromSnapshotResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterFromSnapshotResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): RestoreDBClusterFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    var BacktrackWindow: js.UndefOr[LongOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
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
    def apply(
        DBClusterIdentifier: String,
        SourceDBClusterIdentifier: String,
        BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DBClusterIdentifier"       -> DBClusterIdentifier.asInstanceOf[js.Any],
        "SourceDBClusterIdentifier" -> SourceDBClusterIdentifier.asInstanceOf[js.Any],
        "BacktrackWindow" -> BacktrackWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBClusterParameterGroupName" -> DBClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestoreToTime" -> RestoreToTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestoreType" -> RestoreType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseLatestRestorableTime" -> UseLatestRestorableTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterToPointInTimeMessage]
    }
  }

  @js.native
  trait RestoreDBClusterToPointInTimeResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterToPointInTimeResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): RestoreDBClusterToPointInTimeResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBClusterToPointInTimeResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RestoreDBInstanceFromDBSnapshotMessage extends js.Object {
    var DBInstanceIdentifier: String
    var DBSnapshotIdentifier: String
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBInstanceClass: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var Engine: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var LicenseModel: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TdeCredentialArn: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object RestoreDBInstanceFromDBSnapshotMessage {
    def apply(
        DBInstanceIdentifier: String,
        DBSnapshotIdentifier: String,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        DBName: js.UndefOr[String] = js.undefined,
        DBParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        DomainIAMRoleName: js.UndefOr[String] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        Iops: js.UndefOr[IntegerOptional] = js.undefined,
        LicenseModel: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TdeCredentialArn: js.UndefOr[String] = js.undefined,
        TdeCredentialPassword: js.UndefOr[String] = js.undefined,
        UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBInstanceFromDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any],
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBName" -> DBName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupName" -> DBParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialArn" -> TdeCredentialArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromDBSnapshotMessage]
    }
  }

  @js.native
  trait RestoreDBInstanceFromDBSnapshotResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceFromDBSnapshotResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): RestoreDBInstanceFromDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromDBSnapshotResult]
    }
  }

  @js.native
  trait RestoreDBInstanceFromS3Message extends js.Object {
    var DBInstanceClass: String
    var DBInstanceIdentifier: String
    var Engine: String
    var S3BucketName: String
    var S3IngestionRoleArn: String
    var SourceEngine: String
    var SourceEngineVersion: String
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBName: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
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
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var S3Prefix: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object RestoreDBInstanceFromS3Message {
    def apply(
        DBInstanceClass: String,
        DBInstanceIdentifier: String,
        Engine: String,
        S3BucketName: String,
        S3IngestionRoleArn: String,
        SourceEngine: String,
        SourceEngineVersion: String,
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBName: js.UndefOr[String] = js.undefined,
        DBParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
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
        PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredBackupWindow: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        S3Prefix: js.UndefOr[String] = js.undefined,
        StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBInstanceFromS3Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceClass"      -> DBInstanceClass.asInstanceOf[js.Any],
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "Engine"               -> Engine.asInstanceOf[js.Any],
        "S3BucketName"         -> S3BucketName.asInstanceOf[js.Any],
        "S3IngestionRoleArn"   -> S3IngestionRoleArn.asInstanceOf[js.Any],
        "SourceEngine"         -> SourceEngine.asInstanceOf[js.Any],
        "SourceEngineVersion"  -> SourceEngineVersion.asInstanceOf[js.Any],
        "AllocatedStorage" -> AllocatedStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupRetentionPeriod" -> BackupRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBName" -> DBName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupName" -> DBParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSecurityGroups" -> DBSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnablePerformanceInsights" -> EnablePerformanceInsights.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUserPassword" -> MasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringInterval" -> MonitoringInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MonitoringRoleArn" -> MonitoringRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsKMSKeyId" -> PerformanceInsightsKMSKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PerformanceInsightsRetentionPeriod" -> PerformanceInsightsRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredBackupWindow" -> PreferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Prefix" -> S3Prefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageEncrypted" -> StorageEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromS3Message]
    }
  }

  @js.native
  trait RestoreDBInstanceFromS3Result extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceFromS3Result {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): RestoreDBInstanceFromS3Result = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromS3Result]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RestoreDBInstanceToPointInTimeMessage extends js.Object {
    var TargetDBInstanceIdentifier: String
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBInstanceClass: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional]
    var Engine: js.UndefOr[String]
    var Iops: js.UndefOr[IntegerOptional]
    var LicenseModel: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OptionGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var RestoreTime: js.UndefOr[TStamp]
    var SourceDBInstanceIdentifier: js.UndefOr[String]
    var SourceDbiResourceId: js.UndefOr[String]
    var StorageType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TdeCredentialArn: js.UndefOr[String]
    var TdeCredentialPassword: js.UndefOr[String]
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional]
    var UseLatestRestorableTime: js.UndefOr[Boolean]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object RestoreDBInstanceToPointInTimeMessage {
    def apply(
        TargetDBInstanceIdentifier: String,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        DBName: js.UndefOr[String] = js.undefined,
        DBParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        DomainIAMRoleName: js.UndefOr[String] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        Iops: js.UndefOr[IntegerOptional] = js.undefined,
        LicenseModel: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        RestoreTime: js.UndefOr[TStamp] = js.undefined,
        SourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        SourceDbiResourceId: js.UndefOr[String] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TdeCredentialArn: js.UndefOr[String] = js.undefined,
        TdeCredentialPassword: js.UndefOr[String] = js.undefined,
        UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
        UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBInstanceToPointInTimeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetDBInstanceIdentifier" -> TargetDBInstanceIdentifier.asInstanceOf[js.Any],
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CopyTagsToSnapshot" -> CopyTagsToSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBInstanceClass" -> DBInstanceClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBName" -> DBName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBParameterGroupName" -> DBParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBSubnetGroupName" -> DBSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionProtection" -> DeletionProtection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainIAMRoleName" -> DomainIAMRoleName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableCloudwatchLogsExports" -> EnableCloudwatchLogsExports.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableIAMDatabaseAuthentication" -> EnableIAMDatabaseAuthentication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseModel" -> LicenseModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiAZ" -> MultiAZ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionGroupName" -> OptionGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProcessorFeatures" -> ProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestoreTime" -> RestoreTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceDBInstanceIdentifier" -> SourceDBInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceDbiResourceId" -> SourceDbiResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialArn" -> TdeCredentialArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TdeCredentialPassword" -> TdeCredentialPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseDefaultProcessorFeatures" -> UseDefaultProcessorFeatures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseLatestRestorableTime" -> UseLatestRestorableTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceToPointInTimeMessage]
    }
  }

  @js.native
  trait RestoreDBInstanceToPointInTimeResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceToPointInTimeResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): RestoreDBInstanceToPointInTimeResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceToPointInTimeResult]
    }
  }

  /**
    * Earliest and latest time an instance can be restored to:
    */
  @js.native
  trait RestoreWindow extends js.Object {
    var EarliestTime: js.UndefOr[TStamp]
    var LatestTime: js.UndefOr[TStamp]
  }

  object RestoreWindow {
    def apply(EarliestTime: js.UndefOr[TStamp] = js.undefined,
              LatestTime: js.UndefOr[TStamp] = js.undefined): RestoreWindow = {
      val _fields = IndexedSeq[(String, js.Any)]("EarliestTime" -> EarliestTime.map { x =>
        x.asInstanceOf[js.Any]
      }, "LatestTime" -> LatestTime.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreWindow]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RevokeDBSecurityGroupIngressMessage extends js.Object {
    var DBSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object RevokeDBSecurityGroupIngressMessage {
    def apply(DBSecurityGroupName: String,
              CIDRIP: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): RevokeDBSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBSecurityGroupName" -> DBSecurityGroupName.asInstanceOf[js.Any],
        "CIDRIP" -> CIDRIP.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupId" -> EC2SecurityGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeDBSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object RevokeDBSecurityGroupIngressResult {
    def apply(DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined): RevokeDBSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBSecurityGroup" -> DBSecurityGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeDBSecurityGroupIngressResult]
    }
  }

  /**
    * Contains the scaling configuration of an Aurora Serverless DB cluster.
    *  For more information, see [[http://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html|Using Amazon Aurora Serverless]] in the <i>Amazon Aurora User Guide</i>.
    */
  @js.native
  trait ScalingConfiguration extends js.Object {
    var AutoPause: js.UndefOr[BooleanOptional]
    var MaxCapacity: js.UndefOr[IntegerOptional]
    var MinCapacity: js.UndefOr[IntegerOptional]
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional]
  }

  object ScalingConfiguration {
    def apply(AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
              MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
              MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
              SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined): ScalingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoPause" -> AutoPause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxCapacity" -> MaxCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinCapacity" -> MinCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecondsUntilAutoPause" -> SecondsUntilAutoPause.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingConfiguration]
    }
  }

  /**
    * Shows the scaling configuration for an Aurora DB cluster in <code>serverless</code> DB engine mode.
    *  For more information, see [[http://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html|Using Amazon Aurora Serverless]] in the <i>Amazon Aurora User Guide</i>.
    */
  @js.native
  trait ScalingConfigurationInfo extends js.Object {
    var AutoPause: js.UndefOr[BooleanOptional]
    var MaxCapacity: js.UndefOr[IntegerOptional]
    var MinCapacity: js.UndefOr[IntegerOptional]
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional]
  }

  object ScalingConfigurationInfo {
    def apply(AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
              MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
              MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
              SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined): ScalingConfigurationInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoPause" -> AutoPause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxCapacity" -> MaxCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinCapacity" -> MinCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecondsUntilAutoPause" -> SecondsUntilAutoPause.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingConfigurationInfo]
    }
  }

  /**
    * Contains an AWS Region name as the result of a successful call to the <a>DescribeSourceRegions</a> action.
    */
  @js.native
  trait SourceRegion extends js.Object {
    var Endpoint: js.UndefOr[String]
    var RegionName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object SourceRegion {
    def apply(Endpoint: js.UndefOr[String] = js.undefined,
              RegionName: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): SourceRegion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoint" -> Endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegionName" -> RegionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceRegion]
    }
  }

  /**
    * Contains the result of a successful invocation of the <a>DescribeSourceRegions</a> action.
    */
  @js.native
  trait SourceRegionMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SourceRegions: js.UndefOr[SourceRegionList]
  }

  object SourceRegionMessage {
    def apply(Marker: js.UndefOr[String] = js.undefined,
              SourceRegions: js.UndefOr[SourceRegionList] = js.undefined): SourceRegionMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "SourceRegions" -> SourceRegions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceRegionMessage]
    }
  }

  object SourceTypeEnum {
    val `db-instance`         = "db-instance"
    val `db-parameter-group`  = "db-parameter-group"
    val `db-security-group`   = "db-security-group"
    val `db-snapshot`         = "db-snapshot"
    val `db-cluster`          = "db-cluster"
    val `db-cluster-snapshot` = "db-cluster-snapshot"

    val values = IndexedSeq(
      `db-instance`,
      `db-parameter-group`,
      `db-security-group`,
      `db-snapshot`,
      `db-cluster`,
      `db-cluster-snapshot`
    )
  }

  @js.native
  trait StartDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  object StartDBClusterMessage {
    def apply(DBClusterIdentifier: String): StartDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDBClusterMessage]
    }
  }

  @js.native
  trait StartDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object StartDBClusterResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): StartDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDBClusterResult]
    }
  }

  @js.native
  trait StartDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
  }

  object StartDBInstanceMessage {
    def apply(DBInstanceIdentifier: String): StartDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDBInstanceMessage]
    }
  }

  @js.native
  trait StartDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object StartDBInstanceResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): StartDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDBInstanceResult]
    }
  }

  @js.native
  trait StopDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  object StopDBClusterMessage {
    def apply(DBClusterIdentifier: String): StopDBClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDBClusterMessage]
    }
  }

  @js.native
  trait StopDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object StopDBClusterResult {
    def apply(DBCluster: js.UndefOr[DBCluster] = js.undefined): StopDBClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBCluster" -> DBCluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDBClusterResult]
    }
  }

  @js.native
  trait StopDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  object StopDBInstanceMessage {
    def apply(DBInstanceIdentifier: String,
              DBSnapshotIdentifier: js.UndefOr[String] = js.undefined): StopDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDBInstanceMessage]
    }
  }

  @js.native
  trait StopDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object StopDBInstanceResult {
    def apply(DBInstance: js.UndefOr[DBInstance] = js.undefined): StopDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DBInstance" -> DBInstance.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDBInstanceResult]
    }
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
    def apply(SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
              SubnetIdentifier: js.UndefOr[String] = js.undefined,
              SubnetStatus: js.UndefOr[String] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetIdentifier" -> SubnetIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetStatus" -> SubnetStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
    * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(Key: js.UndefOr[String] = js.undefined, Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(TagList: js.UndefOr[TagList] = js.undefined): TagListMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("TagList" -> TagList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagListMessage]
    }
  }

  /**
    * A time zone associated with a <a>DBInstance</a> or a <a>DBSnapshot</a>. This data type is an element in the response to the <a>DescribeDBInstances</a>, the <a>DescribeDBSnapshots</a>, and the <a>DescribeDBEngineVersions</a> actions.
    */
  @js.native
  trait Timezone extends js.Object {
    var TimezoneName: js.UndefOr[String]
  }

  object Timezone {
    def apply(TimezoneName: js.UndefOr[String] = js.undefined): Timezone = {
      val _fields = IndexedSeq[(String, js.Any)]("TimezoneName" -> TimezoneName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(AutoUpgrade: js.UndefOr[Boolean] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              EngineVersion: js.UndefOr[String] = js.undefined,
              IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined): UpgradeTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoUpgrade" -> AutoUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsMajorVersionUpgrade" -> IsMajorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeTarget]
    }
  }

  /**
    * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <a>DescribeValidDBInstanceModifications</a> action. You can use this information when you call <a>ModifyDBInstance</a>.
    */
  @js.native
  trait ValidDBInstanceModificationsMessage extends js.Object {
    var Storage: js.UndefOr[ValidStorageOptionsList]
    var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList]
  }

  object ValidDBInstanceModificationsMessage {
    def apply(
        Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined,
        ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined
    ): ValidDBInstanceModificationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Storage" -> Storage.map { x =>
        x.asInstanceOf[js.Any]
      }, "ValidProcessorFeatures" -> ValidProcessorFeatures.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.undefined,
              ProvisionedIops: js.UndefOr[RangeList] = js.undefined,
              StorageSize: js.UndefOr[RangeList] = js.undefined,
              StorageType: js.UndefOr[String] = js.undefined): ValidStorageOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IopsToStorageRatio" -> IopsToStorageRatio.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedIops" -> ProvisionedIops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageSize" -> StorageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageType" -> StorageType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    def apply(Status: js.UndefOr[String] = js.undefined,
              VpcSecurityGroupId: js.UndefOr[String] = js.undefined): VpcSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)]("Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }, "VpcSecurityGroupId" -> VpcSecurityGroupId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
