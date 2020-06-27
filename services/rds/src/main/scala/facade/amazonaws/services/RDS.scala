package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object rds {
  type AccountQuotaList                        = js.Array[AccountQuota]
  type AttributeValueList                      = js.Array[String]
  type AvailabilityZoneList                    = js.Array[AvailabilityZone]
  type AvailabilityZones                       = js.Array[String]
  type AvailableProcessorFeatureList           = js.Array[AvailableProcessorFeature]
  type BooleanOptional                         = Boolean
  type CertificateList                         = js.Array[Certificate]
  type CustomAvailabilityZoneList              = js.Array[CustomAvailabilityZone]
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
  type DBInstanceRoles                         = js.Array[DBInstanceRole]
  type DBInstanceStatusInfoList                = js.Array[DBInstanceStatusInfo]
  type DBParameterGroupList                    = js.Array[DBParameterGroup]
  type DBParameterGroupStatusList              = js.Array[DBParameterGroupStatus]
  type DBProxyList                             = js.Array[DBProxy]
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
  type ExportTasksList                         = js.Array[ExportTask]
  type FeatureNameList                         = js.Array[String]
  type FilterList                              = js.Array[Filter]
  type FilterValueList                         = js.Array[String]
  type GlobalClusterList                       = js.Array[GlobalCluster]
  type GlobalClusterMemberList                 = js.Array[GlobalClusterMember]
  type IPRangeList                             = js.Array[IPRange]
  type InstallationMediaList                   = js.Array[InstallationMedia]
  type IntegerOptional                         = Int
  type KeyList                                 = js.Array[String]
  type LogTypeList                             = js.Array[String]
  type LongOptional                            = Double
  type MaxRecords                              = Int
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
  type StringList                              = js.Array[String]
  type StringSensitive                         = String
  type SubnetIdentifierList                    = js.Array[String]
  type SubnetList                              = js.Array[Subnet]
  type SupportedCharacterSetsList              = js.Array[CharacterSet]
  type SupportedTimezonesList                  = js.Array[Timezone]
  type TStamp                                  = js.Date
  type TagList                                 = js.Array[Tag]
  type TargetGroupList                         = js.Array[DBProxyTargetGroup]
  type TargetList                              = js.Array[DBProxyTarget]
  type UserAuthConfigInfoList                  = js.Array[UserAuthConfigInfo]
  type UserAuthConfigList                      = js.Array[UserAuthConfig]
  type ValidStorageOptionsList                 = js.Array[ValidStorageOptions]
  type ValidUpgradeTargetList                  = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList                  = js.Array[String]
  type VpcSecurityGroupMembershipList          = js.Array[VpcSecurityGroupMembership]

  implicit final class RDSOps(private val service: RDS) extends AnyVal {

    @inline def addRoleToDBClusterFuture(params: AddRoleToDBClusterMessage): Future[js.Object] =
      service.addRoleToDBCluster(params).promise().toFuture
    @inline def addRoleToDBInstanceFuture(params: AddRoleToDBInstanceMessage): Future[js.Object] =
      service.addRoleToDBInstance(params).promise().toFuture
    @inline def addSourceIdentifierToSubscriptionFuture(
        params: AddSourceIdentifierToSubscriptionMessage
    ): Future[AddSourceIdentifierToSubscriptionResult] =
      service.addSourceIdentifierToSubscription(params).promise().toFuture
    @inline def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[js.Object] =
      service.addTagsToResource(params).promise().toFuture
    @inline def applyPendingMaintenanceActionFuture(
        params: ApplyPendingMaintenanceActionMessage
    ): Future[ApplyPendingMaintenanceActionResult] = service.applyPendingMaintenanceAction(params).promise().toFuture
    @inline def authorizeDBSecurityGroupIngressFuture(
        params: AuthorizeDBSecurityGroupIngressMessage
    ): Future[AuthorizeDBSecurityGroupIngressResult] =
      service.authorizeDBSecurityGroupIngress(params).promise().toFuture
    @inline def backtrackDBClusterFuture(params: BacktrackDBClusterMessage): Future[DBClusterBacktrack] =
      service.backtrackDBCluster(params).promise().toFuture
    @inline def cancelExportTaskFuture(params: CancelExportTaskMessage): Future[ExportTask] =
      service.cancelExportTask(params).promise().toFuture
    @inline def copyDBClusterParameterGroupFuture(
        params: CopyDBClusterParameterGroupMessage
    ): Future[CopyDBClusterParameterGroupResult] = service.copyDBClusterParameterGroup(params).promise().toFuture
    @inline def copyDBClusterSnapshotFuture(params: CopyDBClusterSnapshotMessage): Future[CopyDBClusterSnapshotResult] =
      service.copyDBClusterSnapshot(params).promise().toFuture
    @inline def copyDBParameterGroupFuture(params: CopyDBParameterGroupMessage): Future[CopyDBParameterGroupResult] =
      service.copyDBParameterGroup(params).promise().toFuture
    @inline def copyDBSnapshotFuture(params: CopyDBSnapshotMessage): Future[CopyDBSnapshotResult] =
      service.copyDBSnapshot(params).promise().toFuture
    @inline def copyOptionGroupFuture(params: CopyOptionGroupMessage): Future[CopyOptionGroupResult] =
      service.copyOptionGroup(params).promise().toFuture
    @inline def createCustomAvailabilityZoneFuture(
        params: CreateCustomAvailabilityZoneMessage
    ): Future[CreateCustomAvailabilityZoneResult] = service.createCustomAvailabilityZone(params).promise().toFuture
    @inline def createDBClusterEndpointFuture(params: CreateDBClusterEndpointMessage): Future[DBClusterEndpoint] =
      service.createDBClusterEndpoint(params).promise().toFuture
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
    @inline def createDBInstanceReadReplicaFuture(
        params: CreateDBInstanceReadReplicaMessage
    ): Future[CreateDBInstanceReadReplicaResult] = service.createDBInstanceReadReplica(params).promise().toFuture
    @inline def createDBParameterGroupFuture(
        params: CreateDBParameterGroupMessage
    ): Future[CreateDBParameterGroupResult] = service.createDBParameterGroup(params).promise().toFuture
    @inline def createDBProxyFuture(params: CreateDBProxyRequest): Future[CreateDBProxyResponse] =
      service.createDBProxy(params).promise().toFuture
    @inline def createDBSecurityGroupFuture(params: CreateDBSecurityGroupMessage): Future[CreateDBSecurityGroupResult] =
      service.createDBSecurityGroup(params).promise().toFuture
    @inline def createDBSnapshotFuture(params: CreateDBSnapshotMessage): Future[CreateDBSnapshotResult] =
      service.createDBSnapshot(params).promise().toFuture
    @inline def createDBSubnetGroupFuture(params: CreateDBSubnetGroupMessage): Future[CreateDBSubnetGroupResult] =
      service.createDBSubnetGroup(params).promise().toFuture
    @inline def createEventSubscriptionFuture(
        params: CreateEventSubscriptionMessage
    ): Future[CreateEventSubscriptionResult] = service.createEventSubscription(params).promise().toFuture
    @inline def createGlobalClusterFuture(params: CreateGlobalClusterMessage): Future[CreateGlobalClusterResult] =
      service.createGlobalCluster(params).promise().toFuture
    @inline def createOptionGroupFuture(params: CreateOptionGroupMessage): Future[CreateOptionGroupResult] =
      service.createOptionGroup(params).promise().toFuture
    @inline def deleteCustomAvailabilityZoneFuture(
        params: DeleteCustomAvailabilityZoneMessage
    ): Future[DeleteCustomAvailabilityZoneResult] = service.deleteCustomAvailabilityZone(params).promise().toFuture
    @inline def deleteDBClusterEndpointFuture(params: DeleteDBClusterEndpointMessage): Future[DBClusterEndpoint] =
      service.deleteDBClusterEndpoint(params).promise().toFuture
    @inline def deleteDBClusterFuture(params: DeleteDBClusterMessage): Future[DeleteDBClusterResult] =
      service.deleteDBCluster(params).promise().toFuture
    @inline def deleteDBClusterParameterGroupFuture(params: DeleteDBClusterParameterGroupMessage): Future[js.Object] =
      service.deleteDBClusterParameterGroup(params).promise().toFuture
    @inline def deleteDBClusterSnapshotFuture(
        params: DeleteDBClusterSnapshotMessage
    ): Future[DeleteDBClusterSnapshotResult] = service.deleteDBClusterSnapshot(params).promise().toFuture
    @inline def deleteDBInstanceAutomatedBackupFuture(
        params: DeleteDBInstanceAutomatedBackupMessage
    ): Future[DeleteDBInstanceAutomatedBackupResult] =
      service.deleteDBInstanceAutomatedBackup(params).promise().toFuture
    @inline def deleteDBInstanceFuture(params: DeleteDBInstanceMessage): Future[DeleteDBInstanceResult] =
      service.deleteDBInstance(params).promise().toFuture
    @inline def deleteDBParameterGroupFuture(params: DeleteDBParameterGroupMessage): Future[js.Object] =
      service.deleteDBParameterGroup(params).promise().toFuture
    @inline def deleteDBProxyFuture(params: DeleteDBProxyRequest): Future[DeleteDBProxyResponse] =
      service.deleteDBProxy(params).promise().toFuture
    @inline def deleteDBSecurityGroupFuture(params: DeleteDBSecurityGroupMessage): Future[js.Object] =
      service.deleteDBSecurityGroup(params).promise().toFuture
    @inline def deleteDBSnapshotFuture(params: DeleteDBSnapshotMessage): Future[DeleteDBSnapshotResult] =
      service.deleteDBSnapshot(params).promise().toFuture
    @inline def deleteDBSubnetGroupFuture(params: DeleteDBSubnetGroupMessage): Future[js.Object] =
      service.deleteDBSubnetGroup(params).promise().toFuture
    @inline def deleteEventSubscriptionFuture(
        params: DeleteEventSubscriptionMessage
    ): Future[DeleteEventSubscriptionResult] = service.deleteEventSubscription(params).promise().toFuture
    @inline def deleteGlobalClusterFuture(params: DeleteGlobalClusterMessage): Future[DeleteGlobalClusterResult] =
      service.deleteGlobalCluster(params).promise().toFuture
    @inline def deleteInstallationMediaFuture(params: DeleteInstallationMediaMessage): Future[InstallationMedia] =
      service.deleteInstallationMedia(params).promise().toFuture
    @inline def deleteOptionGroupFuture(params: DeleteOptionGroupMessage): Future[js.Object] =
      service.deleteOptionGroup(params).promise().toFuture
    @inline def deregisterDBProxyTargetsFuture(
        params: DeregisterDBProxyTargetsRequest
    ): Future[DeregisterDBProxyTargetsResponse] = service.deregisterDBProxyTargets(params).promise().toFuture
    @inline def describeAccountAttributesFuture(
        params: DescribeAccountAttributesMessage
    ): Future[AccountAttributesMessage] = service.describeAccountAttributes(params).promise().toFuture
    @inline def describeCertificatesFuture(params: DescribeCertificatesMessage): Future[CertificateMessage] =
      service.describeCertificates(params).promise().toFuture
    @inline def describeCustomAvailabilityZonesFuture(
        params: DescribeCustomAvailabilityZonesMessage
    ): Future[CustomAvailabilityZoneMessage] = service.describeCustomAvailabilityZones(params).promise().toFuture
    @inline def describeDBClusterBacktracksFuture(
        params: DescribeDBClusterBacktracksMessage
    ): Future[DBClusterBacktrackMessage] = service.describeDBClusterBacktracks(params).promise().toFuture
    @inline def describeDBClusterEndpointsFuture(
        params: DescribeDBClusterEndpointsMessage
    ): Future[DBClusterEndpointMessage] = service.describeDBClusterEndpoints(params).promise().toFuture
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
    @inline def describeDBInstanceAutomatedBackupsFuture(
        params: DescribeDBInstanceAutomatedBackupsMessage
    ): Future[DBInstanceAutomatedBackupMessage] = service.describeDBInstanceAutomatedBackups(params).promise().toFuture
    @inline def describeDBInstancesFuture(params: DescribeDBInstancesMessage): Future[DBInstanceMessage] =
      service.describeDBInstances(params).promise().toFuture
    @inline def describeDBLogFilesFuture(params: DescribeDBLogFilesMessage): Future[DescribeDBLogFilesResponse] =
      service.describeDBLogFiles(params).promise().toFuture
    @inline def describeDBParameterGroupsFuture(
        params: DescribeDBParameterGroupsMessage
    ): Future[DBParameterGroupsMessage] = service.describeDBParameterGroups(params).promise().toFuture
    @inline def describeDBParametersFuture(params: DescribeDBParametersMessage): Future[DBParameterGroupDetails] =
      service.describeDBParameters(params).promise().toFuture
    @inline def describeDBProxiesFuture(params: DescribeDBProxiesRequest): Future[DescribeDBProxiesResponse] =
      service.describeDBProxies(params).promise().toFuture
    @inline def describeDBProxyTargetGroupsFuture(
        params: DescribeDBProxyTargetGroupsRequest
    ): Future[DescribeDBProxyTargetGroupsResponse] = service.describeDBProxyTargetGroups(params).promise().toFuture
    @inline def describeDBProxyTargetsFuture(
        params: DescribeDBProxyTargetsRequest
    ): Future[DescribeDBProxyTargetsResponse] = service.describeDBProxyTargets(params).promise().toFuture
    @inline def describeDBSecurityGroupsFuture(
        params: DescribeDBSecurityGroupsMessage
    ): Future[DBSecurityGroupMessage] = service.describeDBSecurityGroups(params).promise().toFuture
    @inline def describeDBSnapshotAttributesFuture(
        params: DescribeDBSnapshotAttributesMessage
    ): Future[DescribeDBSnapshotAttributesResult] = service.describeDBSnapshotAttributes(params).promise().toFuture
    @inline def describeDBSnapshotsFuture(params: DescribeDBSnapshotsMessage): Future[DBSnapshotMessage] =
      service.describeDBSnapshots(params).promise().toFuture
    @inline def describeDBSubnetGroupsFuture(params: DescribeDBSubnetGroupsMessage): Future[DBSubnetGroupMessage] =
      service.describeDBSubnetGroups(params).promise().toFuture
    @inline def describeEngineDefaultClusterParametersFuture(
        params: DescribeEngineDefaultClusterParametersMessage
    ): Future[DescribeEngineDefaultClusterParametersResult] =
      service.describeEngineDefaultClusterParameters(params).promise().toFuture
    @inline def describeEngineDefaultParametersFuture(
        params: DescribeEngineDefaultParametersMessage
    ): Future[DescribeEngineDefaultParametersResult] =
      service.describeEngineDefaultParameters(params).promise().toFuture
    @inline def describeEventCategoriesFuture(params: DescribeEventCategoriesMessage): Future[EventCategoriesMessage] =
      service.describeEventCategories(params).promise().toFuture
    @inline def describeEventSubscriptionsFuture(
        params: DescribeEventSubscriptionsMessage
    ): Future[EventSubscriptionsMessage] = service.describeEventSubscriptions(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] =
      service.describeEvents(params).promise().toFuture
    @inline def describeExportTasksFuture(params: DescribeExportTasksMessage): Future[ExportTasksMessage] =
      service.describeExportTasks(params).promise().toFuture
    @inline def describeGlobalClustersFuture(params: DescribeGlobalClustersMessage): Future[GlobalClustersMessage] =
      service.describeGlobalClusters(params).promise().toFuture
    @inline def describeInstallationMediaFuture(
        params: DescribeInstallationMediaMessage
    ): Future[InstallationMediaMessage] = service.describeInstallationMedia(params).promise().toFuture
    @inline def describeOptionGroupOptionsFuture(
        params: DescribeOptionGroupOptionsMessage
    ): Future[OptionGroupOptionsMessage] = service.describeOptionGroupOptions(params).promise().toFuture
    @inline def describeOptionGroupsFuture(params: DescribeOptionGroupsMessage): Future[OptionGroups] =
      service.describeOptionGroups(params).promise().toFuture
    @inline def describeOrderableDBInstanceOptionsFuture(
        params: DescribeOrderableDBInstanceOptionsMessage
    ): Future[OrderableDBInstanceOptionsMessage] = service.describeOrderableDBInstanceOptions(params).promise().toFuture
    @inline def describePendingMaintenanceActionsFuture(
        params: DescribePendingMaintenanceActionsMessage
    ): Future[PendingMaintenanceActionsMessage] = service.describePendingMaintenanceActions(params).promise().toFuture
    @inline def describeReservedDBInstancesFuture(
        params: DescribeReservedDBInstancesMessage
    ): Future[ReservedDBInstanceMessage] = service.describeReservedDBInstances(params).promise().toFuture
    @inline def describeReservedDBInstancesOfferingsFuture(
        params: DescribeReservedDBInstancesOfferingsMessage
    ): Future[ReservedDBInstancesOfferingMessage] =
      service.describeReservedDBInstancesOfferings(params).promise().toFuture
    @inline def describeSourceRegionsFuture(params: DescribeSourceRegionsMessage): Future[SourceRegionMessage] =
      service.describeSourceRegions(params).promise().toFuture
    @inline def describeValidDBInstanceModificationsFuture(
        params: DescribeValidDBInstanceModificationsMessage
    ): Future[DescribeValidDBInstanceModificationsResult] =
      service.describeValidDBInstanceModifications(params).promise().toFuture
    @inline def downloadDBLogFilePortionFuture(
        params: DownloadDBLogFilePortionMessage
    ): Future[DownloadDBLogFilePortionDetails] = service.downloadDBLogFilePortion(params).promise().toFuture
    @inline def failoverDBClusterFuture(params: FailoverDBClusterMessage): Future[FailoverDBClusterResult] =
      service.failoverDBCluster(params).promise().toFuture
    @inline def importInstallationMediaFuture(params: ImportInstallationMediaMessage): Future[InstallationMedia] =
      service.importInstallationMedia(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[TagListMessage] =
      service.listTagsForResource(params).promise().toFuture
    @inline def modifyCertificatesFuture(params: ModifyCertificatesMessage): Future[ModifyCertificatesResult] =
      service.modifyCertificates(params).promise().toFuture
    @inline def modifyCurrentDBClusterCapacityFuture(
        params: ModifyCurrentDBClusterCapacityMessage
    ): Future[DBClusterCapacityInfo] = service.modifyCurrentDBClusterCapacity(params).promise().toFuture
    @inline def modifyDBClusterEndpointFuture(params: ModifyDBClusterEndpointMessage): Future[DBClusterEndpoint] =
      service.modifyDBClusterEndpoint(params).promise().toFuture
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
    @inline def modifyDBParameterGroupFuture(
        params: ModifyDBParameterGroupMessage
    ): Future[DBParameterGroupNameMessage] = service.modifyDBParameterGroup(params).promise().toFuture
    @inline def modifyDBProxyFuture(params: ModifyDBProxyRequest): Future[ModifyDBProxyResponse] =
      service.modifyDBProxy(params).promise().toFuture
    @inline def modifyDBProxyTargetGroupFuture(
        params: ModifyDBProxyTargetGroupRequest
    ): Future[ModifyDBProxyTargetGroupResponse] = service.modifyDBProxyTargetGroup(params).promise().toFuture
    @inline def modifyDBSnapshotAttributeFuture(
        params: ModifyDBSnapshotAttributeMessage
    ): Future[ModifyDBSnapshotAttributeResult] = service.modifyDBSnapshotAttribute(params).promise().toFuture
    @inline def modifyDBSnapshotFuture(params: ModifyDBSnapshotMessage): Future[ModifyDBSnapshotResult] =
      service.modifyDBSnapshot(params).promise().toFuture
    @inline def modifyDBSubnetGroupFuture(params: ModifyDBSubnetGroupMessage): Future[ModifyDBSubnetGroupResult] =
      service.modifyDBSubnetGroup(params).promise().toFuture
    @inline def modifyEventSubscriptionFuture(
        params: ModifyEventSubscriptionMessage
    ): Future[ModifyEventSubscriptionResult] = service.modifyEventSubscription(params).promise().toFuture
    @inline def modifyGlobalClusterFuture(params: ModifyGlobalClusterMessage): Future[ModifyGlobalClusterResult] =
      service.modifyGlobalCluster(params).promise().toFuture
    @inline def modifyOptionGroupFuture(params: ModifyOptionGroupMessage): Future[ModifyOptionGroupResult] =
      service.modifyOptionGroup(params).promise().toFuture
    @inline def promoteReadReplicaDBClusterFuture(
        params: PromoteReadReplicaDBClusterMessage
    ): Future[PromoteReadReplicaDBClusterResult] = service.promoteReadReplicaDBCluster(params).promise().toFuture
    @inline def promoteReadReplicaFuture(params: PromoteReadReplicaMessage): Future[PromoteReadReplicaResult] =
      service.promoteReadReplica(params).promise().toFuture
    @inline def purchaseReservedDBInstancesOfferingFuture(
        params: PurchaseReservedDBInstancesOfferingMessage
    ): Future[PurchaseReservedDBInstancesOfferingResult] =
      service.purchaseReservedDBInstancesOffering(params).promise().toFuture
    @inline def rebootDBInstanceFuture(params: RebootDBInstanceMessage): Future[RebootDBInstanceResult] =
      service.rebootDBInstance(params).promise().toFuture
    @inline def registerDBProxyTargetsFuture(
        params: RegisterDBProxyTargetsRequest
    ): Future[RegisterDBProxyTargetsResponse] = service.registerDBProxyTargets(params).promise().toFuture
    @inline def removeFromGlobalClusterFuture(
        params: RemoveFromGlobalClusterMessage
    ): Future[RemoveFromGlobalClusterResult] = service.removeFromGlobalCluster(params).promise().toFuture
    @inline def removeRoleFromDBClusterFuture(params: RemoveRoleFromDBClusterMessage): Future[js.Object] =
      service.removeRoleFromDBCluster(params).promise().toFuture
    @inline def removeRoleFromDBInstanceFuture(params: RemoveRoleFromDBInstanceMessage): Future[js.Object] =
      service.removeRoleFromDBInstance(params).promise().toFuture
    @inline def removeSourceIdentifierFromSubscriptionFuture(
        params: RemoveSourceIdentifierFromSubscriptionMessage
    ): Future[RemoveSourceIdentifierFromSubscriptionResult] =
      service.removeSourceIdentifierFromSubscription(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[js.Object] =
      service.removeTagsFromResource(params).promise().toFuture
    @inline def resetDBClusterParameterGroupFuture(
        params: ResetDBClusterParameterGroupMessage
    ): Future[DBClusterParameterGroupNameMessage] = service.resetDBClusterParameterGroup(params).promise().toFuture
    @inline def resetDBParameterGroupFuture(params: ResetDBParameterGroupMessage): Future[DBParameterGroupNameMessage] =
      service.resetDBParameterGroup(params).promise().toFuture
    @inline def restoreDBClusterFromS3Future(
        params: RestoreDBClusterFromS3Message
    ): Future[RestoreDBClusterFromS3Result] = service.restoreDBClusterFromS3(params).promise().toFuture
    @inline def restoreDBClusterFromSnapshotFuture(
        params: RestoreDBClusterFromSnapshotMessage
    ): Future[RestoreDBClusterFromSnapshotResult] = service.restoreDBClusterFromSnapshot(params).promise().toFuture
    @inline def restoreDBClusterToPointInTimeFuture(
        params: RestoreDBClusterToPointInTimeMessage
    ): Future[RestoreDBClusterToPointInTimeResult] = service.restoreDBClusterToPointInTime(params).promise().toFuture
    @inline def restoreDBInstanceFromDBSnapshotFuture(
        params: RestoreDBInstanceFromDBSnapshotMessage
    ): Future[RestoreDBInstanceFromDBSnapshotResult] =
      service.restoreDBInstanceFromDBSnapshot(params).promise().toFuture
    @inline def restoreDBInstanceFromS3Future(
        params: RestoreDBInstanceFromS3Message
    ): Future[RestoreDBInstanceFromS3Result] = service.restoreDBInstanceFromS3(params).promise().toFuture
    @inline def restoreDBInstanceToPointInTimeFuture(
        params: RestoreDBInstanceToPointInTimeMessage
    ): Future[RestoreDBInstanceToPointInTimeResult] = service.restoreDBInstanceToPointInTime(params).promise().toFuture
    @inline def revokeDBSecurityGroupIngressFuture(
        params: RevokeDBSecurityGroupIngressMessage
    ): Future[RevokeDBSecurityGroupIngressResult] = service.revokeDBSecurityGroupIngress(params).promise().toFuture
    @inline def startActivityStreamFuture(params: StartActivityStreamRequest): Future[StartActivityStreamResponse] =
      service.startActivityStream(params).promise().toFuture
    @inline def startDBClusterFuture(params: StartDBClusterMessage): Future[StartDBClusterResult] =
      service.startDBCluster(params).promise().toFuture
    @inline def startDBInstanceFuture(params: StartDBInstanceMessage): Future[StartDBInstanceResult] =
      service.startDBInstance(params).promise().toFuture
    @inline def startExportTaskFuture(params: StartExportTaskMessage): Future[ExportTask] =
      service.startExportTask(params).promise().toFuture
    @inline def stopActivityStreamFuture(params: StopActivityStreamRequest): Future[StopActivityStreamResponse] =
      service.stopActivityStream(params).promise().toFuture
    @inline def stopDBClusterFuture(params: StopDBClusterMessage): Future[StopDBClusterResult] =
      service.stopDBCluster(params).promise().toFuture
    @inline def stopDBInstanceFuture(params: StopDBInstanceMessage): Future[StopDBInstanceResult] =
      service.stopDBInstance(params).promise().toFuture
  }
}

package rds {
  @js.native
  @JSImport("aws-sdk", "RDS")
  class RDS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addRoleToDBCluster(params: AddRoleToDBClusterMessage): Request[js.Object]   = js.native
    def addRoleToDBInstance(params: AddRoleToDBInstanceMessage): Request[js.Object] = js.native
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
    def cancelExportTask(params: CancelExportTaskMessage): Request[ExportTask]             = js.native
    def copyDBClusterParameterGroup(
        params: CopyDBClusterParameterGroupMessage
    ): Request[CopyDBClusterParameterGroupResult]                                                         = js.native
    def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): Request[CopyDBClusterSnapshotResult] = js.native
    def copyDBParameterGroup(params: CopyDBParameterGroupMessage): Request[CopyDBParameterGroupResult]    = js.native
    def copyDBSnapshot(params: CopyDBSnapshotMessage): Request[CopyDBSnapshotResult]                      = js.native
    def copyOptionGroup(params: CopyOptionGroupMessage): Request[CopyOptionGroupResult]                   = js.native
    def createCustomAvailabilityZone(
        params: CreateCustomAvailabilityZoneMessage
    ): Request[CreateCustomAvailabilityZoneResult]                                                  = js.native
    def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult]             = js.native
    def createDBClusterEndpoint(params: CreateDBClusterEndpointMessage): Request[DBClusterEndpoint] = js.native
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
    def createDBProxy(params: CreateDBProxyRequest): Request[CreateDBProxyResponse]                          = js.native
    def createDBSecurityGroup(params: CreateDBSecurityGroupMessage): Request[CreateDBSecurityGroupResult]    = js.native
    def createDBSnapshot(params: CreateDBSnapshotMessage): Request[CreateDBSnapshotResult]                   = js.native
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult]          = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] =
      js.native
    def createGlobalCluster(params: CreateGlobalClusterMessage): Request[CreateGlobalClusterResult] = js.native
    def createOptionGroup(params: CreateOptionGroupMessage): Request[CreateOptionGroupResult]       = js.native
    def deleteCustomAvailabilityZone(
        params: DeleteCustomAvailabilityZoneMessage
    ): Request[DeleteCustomAvailabilityZoneResult]                                                      = js.native
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
    def deleteDBProxy(params: DeleteDBProxyRequest): Request[DeleteDBProxyResponse]        = js.native
    def deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage): Request[js.Object]    = js.native
    def deleteDBSnapshot(params: DeleteDBSnapshotMessage): Request[DeleteDBSnapshotResult] = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object]        = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResult] =
      js.native
    def deleteGlobalCluster(params: DeleteGlobalClusterMessage): Request[DeleteGlobalClusterResult] = js.native
    def deleteInstallationMedia(params: DeleteInstallationMediaMessage): Request[InstallationMedia] = js.native
    def deleteOptionGroup(params: DeleteOptionGroupMessage): Request[js.Object]                     = js.native
    def deregisterDBProxyTargets(params: DeregisterDBProxyTargetsRequest): Request[DeregisterDBProxyTargetsResponse] =
      js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[AccountAttributesMessage] =
      js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[CertificateMessage] = js.native
    def describeCustomAvailabilityZones(
        params: DescribeCustomAvailabilityZonesMessage
    ): Request[CustomAvailabilityZoneMessage] = js.native
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
    def describeDBParameters(params: DescribeDBParametersMessage): Request[DBParameterGroupDetails] = js.native
    def describeDBProxies(params: DescribeDBProxiesRequest): Request[DescribeDBProxiesResponse]     = js.native
    def describeDBProxyTargetGroups(
        params: DescribeDBProxyTargetGroupsRequest
    ): Request[DescribeDBProxyTargetGroupsResponse] = js.native
    def describeDBProxyTargets(params: DescribeDBProxyTargetsRequest): Request[DescribeDBProxyTargetsResponse] =
      js.native
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
    def describeExportTasks(params: DescribeExportTasksMessage): Request[ExportTasksMessage]          = js.native
    def describeGlobalClusters(params: DescribeGlobalClustersMessage): Request[GlobalClustersMessage] = js.native
    def describeInstallationMedia(params: DescribeInstallationMediaMessage): Request[InstallationMediaMessage] =
      js.native
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
    def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult]       = js.native
    def importInstallationMedia(params: ImportInstallationMediaMessage): Request[InstallationMedia] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage]            = js.native
    def modifyCertificates(params: ModifyCertificatesMessage): Request[ModifyCertificatesResult]    = js.native
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
    def modifyDBProxy(params: ModifyDBProxyRequest): Request[ModifyDBProxyResponse]                         = js.native
    def modifyDBProxyTargetGroup(params: ModifyDBProxyTargetGroupRequest): Request[ModifyDBProxyTargetGroupResponse] =
      js.native
    def modifyDBSnapshot(params: ModifyDBSnapshotMessage): Request[ModifyDBSnapshotResult] = js.native
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
    def registerDBProxyTargets(params: RegisterDBProxyTargetsRequest): Request[RegisterDBProxyTargetsResponse] =
      js.native
    def removeFromGlobalCluster(params: RemoveFromGlobalClusterMessage): Request[RemoveFromGlobalClusterResult] =
      js.native
    def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): Request[js.Object]   = js.native
    def removeRoleFromDBInstance(params: RemoveRoleFromDBInstanceMessage): Request[js.Object] = js.native
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
    ): Request[RevokeDBSecurityGroupIngressResult]                                                    = js.native
    def startActivityStream(params: StartActivityStreamRequest): Request[StartActivityStreamResponse] = js.native
    def startDBCluster(params: StartDBClusterMessage): Request[StartDBClusterResult]                  = js.native
    def startDBInstance(params: StartDBInstanceMessage): Request[StartDBInstanceResult]               = js.native
    def startExportTask(params: StartExportTaskMessage): Request[ExportTask]                          = js.native
    def stopActivityStream(params: StopActivityStreamRequest): Request[StopActivityStreamResponse]    = js.native
    def stopDBCluster(params: StopDBClusterMessage): Request[StopDBClusterResult]                     = js.native
    def stopDBInstance(params: StopDBInstanceMessage): Request[StopDBInstanceResult]                  = js.native
  }

  /**
    * Data returned by the ```DescribeAccountAttributes``` action.
    */
  @js.native
  @Factory
  trait AccountAttributesMessage extends js.Object {
    var AccountQuotas: js.UndefOr[AccountQuotaList]
  }

  /**
    * Describes a quota for an AWS account.
    *  The following are account quotas:
    * * <code>AllocatedStorage</code> - The total allocated storage per account, in GiB. The used value is the total allocated storage in the account, in GiB.
    *  * <code>AuthorizationsPerDBSecurityGroup</code> - The number of ingress rules per DB security group. The used value is the highest number of ingress rules in a DB security group in the account. Other DB security groups in the account might have a lower number of ingress rules.
    *  * <code>CustomEndpointsPerDBCluster</code> - The number of custom endpoints per DB cluster. The used value is the highest number of custom endpoints in a DB clusters in the account. Other DB clusters in the account might have a lower number of custom endpoints.
    *  * <code>DBClusterParameterGroups</code> - The number of DB cluster parameter groups per account, excluding default parameter groups. The used value is the count of nondefault DB cluster parameter groups in the account.
    *  * <code>DBClusterRoles</code> - The number of associated AWS Identity and Access Management (IAM) roles per DB cluster. The used value is the highest number of associated IAM roles for a DB cluster in the account. Other DB clusters in the account might have a lower number of associated IAM roles.
    *  * <code>DBClusters</code> - The number of DB clusters per account. The used value is the count of DB clusters in the account.
    *  * <code>DBInstanceRoles</code> - The number of associated IAM roles per DB instance. The used value is the highest number of associated IAM roles for a DB instance in the account. Other DB instances in the account might have a lower number of associated IAM roles.
    *  * <code>DBInstances</code> - The number of DB instances per account. The used value is the count of the DB instances in the account.
    *  Amazon RDS DB instances, Amazon Aurora DB instances, Amazon Neptune instances, and Amazon DocumentDB instances apply to this quota.
    *  * <code>DBParameterGroups</code> - The number of DB parameter groups per account, excluding default parameter groups. The used value is the count of nondefault DB parameter groups in the account.
    *  * <code>DBSecurityGroups</code> - The number of DB security groups (not VPC security groups) per account, excluding the default security group. The used value is the count of nondefault DB security groups in the account.
    *  * <code>DBSubnetGroups</code> - The number of DB subnet groups per account. The used value is the count of the DB subnet groups in the account.
    *  * <code>EventSubscriptions</code> - The number of event subscriptions per account. The used value is the count of the event subscriptions in the account.
    *  * <code>ManualSnapshots</code> - The number of manual DB snapshots per account. The used value is the count of the manual DB snapshots in the account.
    *  * <code>OptionGroups</code> - The number of DB option groups per account, excluding default option groups. The used value is the count of nondefault DB option groups in the account.
    *  * <code>ReadReplicasPerMaster</code> - The number of Read Replicas per DB instance. The used value is the highest number of Read Replicas for a DB instance in the account. Other DB instances in the account might have a lower number of Read Replicas.
    *  * <code>ReservedDBInstances</code> - The number of reserved DB instances per account. The used value is the count of the active reserved DB instances in the account.
    *  * <code>SubnetsPerDBSubnetGroup</code> - The number of subnets per DB subnet group. The used value is highest number of subnets for a DB subnet group in the account. Other DB subnet groups in the account might have a lower number of subnets.
    * For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html|Quotas for Amazon RDS]] in the <i>Amazon RDS User Guide</i> and [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Limits.html|Quotas for Amazon Aurora]] in the <i>Amazon Aurora User Guide</i>.
    */
  @js.native
  @Factory
  trait AccountQuota extends js.Object {
    var AccountQuotaName: js.UndefOr[String]
    var Max: js.UndefOr[Double]
    var Used: js.UndefOr[Double]
  }

  @js.native
  sealed trait ActivityStreamMode extends js.Any
  object ActivityStreamMode extends js.Object {
    val sync  = "sync".asInstanceOf[ActivityStreamMode]
    val async = "async".asInstanceOf[ActivityStreamMode]

    val values = js.Object.freeze(js.Array(sync, async))
  }

  @js.native
  sealed trait ActivityStreamStatus extends js.Any
  object ActivityStreamStatus extends js.Object {
    val stopped  = "stopped".asInstanceOf[ActivityStreamStatus]
    val starting = "starting".asInstanceOf[ActivityStreamStatus]
    val started  = "started".asInstanceOf[ActivityStreamStatus]
    val stopping = "stopping".asInstanceOf[ActivityStreamStatus]

    val values = js.Object.freeze(js.Array(stopped, starting, started, stopping))
  }

  @js.native
  @Factory
  trait AddRoleToDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
    var FeatureName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AddRoleToDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var FeatureName: String
    var RoleArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddSourceIdentifierToSubscriptionMessage extends js.Object {
    var SourceIdentifier: String
    var SubscriptionName: String
  }

  @js.native
  @Factory
  trait AddSourceIdentifierToSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  /**
    * <p/>
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
    * <p/>
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

  @js.native
  sealed trait AuthScheme extends js.Any
  object AuthScheme extends js.Object {
    val SECRETS = "SECRETS".asInstanceOf[AuthScheme]

    val values = js.Object.freeze(js.Array(SECRETS))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AuthorizeDBSecurityGroupIngressMessage extends js.Object {
    var DBSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  /**
    * Contains Availability Zone information.
    *  This data type is used as an element in the <code>OrderableDBInstanceOption</code> data type.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  /**
    * Contains the available processor feature information for the DB instance class of a DB instance.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor|Configuring the Processor of the DB Instance Class]] in the <i>Amazon RDS User Guide. </i>
    */
  @js.native
  @Factory
  trait AvailableProcessorFeature extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var DefaultValue: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait BacktrackDBClusterMessage extends js.Object {
    var BacktrackTo: TStamp
    var DBClusterIdentifier: String
    var Force: js.UndefOr[BooleanOptional]
    var UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional]
  }

  @js.native
  @Factory
  trait CancelExportTaskMessage extends js.Object {
    var ExportTaskIdentifier: String
  }

  /**
    * A CA certificate for an AWS account.
    */
  @js.native
  @Factory
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var CertificateIdentifier: js.UndefOr[String]
    var CertificateType: js.UndefOr[String]
    var CustomerOverride: js.UndefOr[BooleanOptional]
    var CustomerOverrideValidTill: js.UndefOr[TStamp]
    var Thumbprint: js.UndefOr[String]
    var ValidFrom: js.UndefOr[TStamp]
    var ValidTill: js.UndefOr[TStamp]
  }

  /**
    * Data returned by the ```DescribeCertificates``` action.
    */
  @js.native
  @Factory
  trait CertificateMessage extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var Marker: js.UndefOr[String]
  }

  /**
    * This data type is used as a response element in the action <code>DescribeDBEngineVersions</code>.
    */
  @js.native
  @Factory
  trait CharacterSet extends js.Object {
    var CharacterSetDescription: js.UndefOr[String]
    var CharacterSetName: js.UndefOr[String]
  }

  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance or DB cluster.
    *  The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which logs will be exported (or not exported) to CloudWatch Logs. The values within these arrays depend on the DB engine being used. For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch|Publishing Database Logs to Amazon CloudWatch Logs ]] in the <i>Amazon RDS User Guide</i>.
    */
  @js.native
  @Factory
  trait CloudwatchLogsExportConfiguration extends js.Object {
    var DisableLogTypes: js.UndefOr[LogTypeList]
    var EnableLogTypes: js.UndefOr[LogTypeList]
  }

  /**
    * '''Note:'''This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
    * Specifies the settings that control the size and behavior of the connection pool associated with a <code>DBProxyTargetGroup</code>.
    */
  @js.native
  @Factory
  trait ConnectionPoolConfiguration extends js.Object {
    var ConnectionBorrowTimeout: js.UndefOr[IntegerOptional]
    var InitQuery: js.UndefOr[String]
    var MaxConnectionsPercent: js.UndefOr[IntegerOptional]
    var MaxIdleConnectionsPercent: js.UndefOr[IntegerOptional]
    var SessionPinningFilters: js.UndefOr[StringList]
  }

  /**
    * '''Note:'''This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
    * Displays the settings that control the size and behavior of the connection pool associated with a <code>DBProxyTarget</code>.
    */
  @js.native
  @Factory
  trait ConnectionPoolConfigurationInfo extends js.Object {
    var ConnectionBorrowTimeout: js.UndefOr[Int]
    var InitQuery: js.UndefOr[String]
    var MaxConnectionsPercent: js.UndefOr[Int]
    var MaxIdleConnectionsPercent: js.UndefOr[Int]
    var SessionPinningFilters: js.UndefOr[StringList]
  }

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
    * <p/>
    */
  @js.native
  @Factory
  trait CopyDBClusterSnapshotMessage extends js.Object {
    var SourceDBClusterSnapshotIdentifier: String
    var TargetDBClusterSnapshotIdentifier: String
    var CopyTags: js.UndefOr[BooleanOptional]
    var KmsKeyId: js.UndefOr[String]
    var PreSignedUrl: js.UndefOr[String]
    var SourceRegion: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CopyDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CopyDBParameterGroupMessage extends js.Object {
    var SourceDBParameterGroupIdentifier: String
    var TargetDBParameterGroupDescription: String
    var TargetDBParameterGroupIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CopyDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CopyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CopyOptionGroupMessage extends js.Object {
    var SourceOptionGroupIdentifier: String
    var TargetOptionGroupDescription: String
    var TargetOptionGroupIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CopyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateCustomAvailabilityZoneMessage extends js.Object {
    var CustomAvailabilityZoneName: String
    var ExistingVpnId: js.UndefOr[String]
    var NewVpnTunnelName: js.UndefOr[String]
    var VpnTunnelOriginatorIP: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateCustomAvailabilityZoneResult extends js.Object {
    var CustomAvailabilityZone: js.UndefOr[CustomAvailabilityZone]
  }

  @js.native
  @Factory
  trait CreateDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: String
    var DBClusterIdentifier: String
    var EndpointType: String
    var ExcludedMembers: js.UndefOr[StringList]
    var StaticMembers: js.UndefOr[StringList]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var Engine: String
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CharacterSetName: js.UndefOr[String]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableHttpEndpoint: js.UndefOr[BooleanOptional]
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

  /**
    * <p/>
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
    * <p/>
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
    * <p/>
    */
  @js.native
  @Factory
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
    var MaxAllocatedStorage: js.UndefOr[IntegerOptional]
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

  @js.native
  @Factory
  trait CreateDBInstanceReadReplicaMessage extends js.Object {
    var DBInstanceIdentifier: String
    var SourceDBInstanceIdentifier: String
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBInstanceClass: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
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

  @js.native
  @Factory
  trait CreateDBInstanceReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  @js.native
  @Factory
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateDBParameterGroupMessage extends js.Object {
    var DBParameterGroupFamily: String
    var DBParameterGroupName: String
    var Description: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup]
  }

  @js.native
  @Factory
  trait CreateDBProxyRequest extends js.Object {
    var Auth: UserAuthConfigList
    var DBProxyName: String
    var EngineFamily: EngineFamily
    var RoleArn: String
    var VpcSubnetIds: StringList
    var DebugLogging: js.UndefOr[Boolean]
    var IdleClientTimeout: js.UndefOr[IntegerOptional]
    var RequireTLS: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait CreateDBProxyResponse extends js.Object {
    var DBProxy: js.UndefOr[DBProxy]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateDBSecurityGroupMessage extends js.Object {
    var DBSecurityGroupDescription: String
    var DBSecurityGroupName: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDBSecurityGroupResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateDBSnapshotMessage extends js.Object {
    var DBInstanceIdentifier: String
    var DBSnapshotIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  /**
    * <p/>
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
    * <p/>
    */
  @js.native
  @Factory
  trait CreateEventSubscriptionMessage extends js.Object {
    var SnsTopicArn: String
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  @js.native
  @Factory
  trait CreateGlobalClusterMessage extends js.Object {
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var SourceDBClusterIdentifier: js.UndefOr[String]
    var StorageEncrypted: js.UndefOr[BooleanOptional]
  }

  @js.native
  @Factory
  trait CreateGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateOptionGroupMessage extends js.Object {
    var EngineName: String
    var MajorEngineVersion: String
    var OptionGroupDescription: String
    var OptionGroupName: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  /**
    * A custom Availability Zone (AZ) is an on-premises AZ that is integrated with a VMware vSphere cluster.
    *  For more information about RDS on VMware, see the <a href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> <i>RDS on VMware User Guide.</i> </a>
    */
  @js.native
  @Factory
  trait CustomAvailabilityZone extends js.Object {
    var CustomAvailabilityZoneId: js.UndefOr[String]
    var CustomAvailabilityZoneName: js.UndefOr[String]
    var CustomAvailabilityZoneStatus: js.UndefOr[String]
    var VpnDetails: js.UndefOr[VpnDetails]
  }

  @js.native
  @Factory
  trait CustomAvailabilityZoneMessage extends js.Object {
    var CustomAvailabilityZones: js.UndefOr[CustomAvailabilityZoneList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains the details of an Amazon Aurora DB cluster.
    *  This data type is used as a response element in the <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and <code>StartDBCluster</code> actions.
    */
  @js.native
  @Factory
  trait DBCluster extends js.Object {
    var ActivityStreamKinesisStreamName: js.UndefOr[String]
    var ActivityStreamKmsKeyId: js.UndefOr[String]
    var ActivityStreamMode: js.UndefOr[ActivityStreamMode]
    var ActivityStreamStatus: js.UndefOr[ActivityStreamStatus]
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
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var CrossAccountClone: js.UndefOr[BooleanOptional]
    var CustomEndpoints: js.UndefOr[StringList]
    var DBClusterArn: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var DBClusterMembers: js.UndefOr[DBClusterMemberList]
    var DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships]
    var DBClusterParameterGroup: js.UndefOr[String]
    var DBSubnetGroup: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DbClusterResourceId: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var DomainMemberships: js.UndefOr[DomainMembershipList]
    var EarliestBacktrackTime: js.UndefOr[TStamp]
    var EarliestRestorableTime: js.UndefOr[TStamp]
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var Endpoint: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineMode: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var HttpEndpointEnabled: js.UndefOr[BooleanOptional]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[BooleanOptional]
    var KmsKeyId: js.UndefOr[String]
    var LatestRestorableTime: js.UndefOr[TStamp]
    var MasterUsername: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
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

  /**
    * This data type is used as a response element in the <code>DescribeDBClusterBacktracks</code> action.
    */
  @js.native
  @Factory
  trait DBClusterBacktrack extends js.Object {
    var BacktrackIdentifier: js.UndefOr[String]
    var BacktrackRequestCreationTime: js.UndefOr[TStamp]
    var BacktrackTo: js.UndefOr[TStamp]
    var BacktrackedFrom: js.UndefOr[TStamp]
    var DBClusterIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBClusterBacktracks</code> action.
    */
  @js.native
  @Factory
  trait DBClusterBacktrackMessage extends js.Object {
    var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList]
    var Marker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DBClusterCapacityInfo extends js.Object {
    var CurrentCapacity: js.UndefOr[IntegerOptional]
    var DBClusterIdentifier: js.UndefOr[String]
    var PendingCapacity: js.UndefOr[IntegerOptional]
    var SecondsBeforeTimeout: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  /**
    * This data type represents the information you need to connect to an Amazon Aurora DB cluster. This data type is used as a response element in the following actions:
    * * <code>CreateDBClusterEndpoint</code>
    *  * <code>DescribeDBClusterEndpoints</code>
    *  * <code>ModifyDBClusterEndpoint</code>
    *  * <code>DeleteDBClusterEndpoint</code>
    * For the data structure that represents Amazon RDS DB instance endpoints, see <code>Endpoint</code>.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DBClusterEndpointMessage extends js.Object {
    var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains information about an instance that is part of a DB cluster.
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
    * Contains the result of a successful invocation of the <code>DescribeDBClusters</code> action.
    */
  @js.native
  @Factory
  trait DBClusterMessage extends js.Object {
    var DBClusters: js.UndefOr[DBClusterList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains status information for a DB cluster option group.
    */
  @js.native
  @Factory
  trait DBClusterOptionGroupStatus extends js.Object {
    var DBClusterOptionGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Contains the details of an Amazon RDS DB cluster parameter group.
    *  This data type is used as a response element in the <code>DescribeDBClusterParameterGroups</code> action.
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
    * Provides details about a DB cluster parameter group including the parameters in the DB cluster parameter group.
    */
  @js.native
  @Factory
  trait DBClusterParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DBClusterParameterGroupNameMessage extends js.Object {
    var DBClusterParameterGroupName: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DBClusterParameterGroupsMessage extends js.Object {
    var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Describes an AWS Identity and Access Management (IAM) role that is associated with a DB cluster.
    */
  @js.native
  @Factory
  trait DBClusterRole extends js.Object {
    var FeatureName: js.UndefOr[String]
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Contains the details for an Amazon RDS DB cluster snapshot
    *  This data type is used as a response element in the <code>DescribeDBClusterSnapshots</code> action.
    */
  @js.native
  @Factory
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

  /**
    * Contains the name and values of a manual DB cluster snapshot attribute.
    *  Manual DB cluster snapshot attributes are used to authorize other AWS accounts to restore a manual DB cluster snapshot. For more information, see the <code>ModifyDBClusterSnapshotAttribute</code> API action.
    */
  @js.native
  @Factory
  trait DBClusterSnapshotAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  /**
    * Contains the results of a successful call to the <code>DescribeDBClusterSnapshotAttributes</code> API action.
    *  Manual DB cluster snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB cluster snapshot. For more information, see the <code>ModifyDBClusterSnapshotAttribute</code> API action.
    */
  @js.native
  @Factory
  trait DBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList]
    var DBClusterSnapshotIdentifier: js.UndefOr[String]
  }

  /**
    * Provides a list of DB cluster snapshots for the user as the result of a call to the <code>DescribeDBClusterSnapshots</code> action.
    */
  @js.native
  @Factory
  trait DBClusterSnapshotMessage extends js.Object {
    var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList]
    var Marker: js.UndefOr[String]
  }

  /**
    * This data type is used as a response element in the action <code>DescribeDBEngineVersions</code>.
    */
  @js.native
  @Factory
  trait DBEngineVersion extends js.Object {
    var DBEngineDescription: js.UndefOr[String]
    var DBEngineVersionDescription: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var DefaultCharacterSet: js.UndefOr[CharacterSet]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var ExportableLogTypes: js.UndefOr[LogTypeList]
    var Status: js.UndefOr[String]
    var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList]
    var SupportedEngineModes: js.UndefOr[EngineModeList]
    var SupportedFeatureNames: js.UndefOr[FeatureNameList]
    var SupportedTimezones: js.UndefOr[SupportedTimezonesList]
    var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean]
    var SupportsReadReplica: js.UndefOr[Boolean]
    var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBEngineVersions</code> action.
    */
  @js.native
  @Factory
  trait DBEngineVersionMessage extends js.Object {
    var DBEngineVersions: js.UndefOr[DBEngineVersionList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains the details of an Amazon RDS DB instance.
    *  This data type is used as a response element in the <code>DescribeDBInstances</code> action.
    */
  @js.native
  @Factory
  trait DBInstance extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AssociatedRoles: js.UndefOr[DBInstanceRoles]
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
    var MaxAllocatedStorage: js.UndefOr[IntegerOptional]
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

  /**
    * An automated backup of a DB instance. It it consists of system backups, transaction logs, and the database instance properties that existed at the time you deleted the source instance.
    */
  @js.native
  @Factory
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

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBInstanceAutomatedBackups</code> action.
    */
  @js.native
  @Factory
  trait DBInstanceAutomatedBackupMessage extends js.Object {
    var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBInstances</code> action.
    */
  @js.native
  @Factory
  trait DBInstanceMessage extends js.Object {
    var DBInstances: js.UndefOr[DBInstanceList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Describes an AWS Identity and Access Management (IAM) role that is associated with a DB instance.
    */
  @js.native
  @Factory
  trait DBInstanceRole extends js.Object {
    var FeatureName: js.UndefOr[String]
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Provides a list of status information for a DB instance.
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
    * Contains the details of an Amazon RDS DB parameter group.
    *  This data type is used as a response element in the <code>DescribeDBParameterGroups</code> action.
    */
  @js.native
  @Factory
  trait DBParameterGroup extends js.Object {
    var DBParameterGroupArn: js.UndefOr[String]
    var DBParameterGroupFamily: js.UndefOr[String]
    var DBParameterGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBParameters</code> action.
    */
  @js.native
  @Factory
  trait DBParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  /**
    * Contains the result of a successful invocation of the <code>ModifyDBParameterGroup</code> or <code>ResetDBParameterGroup</code> action.
    */
  @js.native
  @Factory
  trait DBParameterGroupNameMessage extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
  }

  /**
    * The status of the DB parameter group.
    *  This data type is used as a response element in the following actions:
    * * <code>CreateDBInstance</code>
    *  * <code>CreateDBInstanceReadReplica</code>
    *  * <code>DeleteDBInstance</code>
    *  * <code>ModifyDBInstance</code>
    *  * <code>RebootDBInstance</code>
    *  * <code>RestoreDBInstanceFromDBSnapshot</code>
    */
  @js.native
  @Factory
  trait DBParameterGroupStatus extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBParameterGroups</code> action.
    */
  @js.native
  @Factory
  trait DBParameterGroupsMessage extends js.Object {
    var DBParameterGroups: js.UndefOr[DBParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  /**
    * '''Note:'''This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
    * The data structure representing a proxy managed by the RDS Proxy.
    *  This data type is used as a response element in the <code>DescribeDBProxies</code> action.
    */
  @js.native
  @Factory
  trait DBProxy extends js.Object {
    var Auth: js.UndefOr[UserAuthConfigInfoList]
    var CreatedDate: js.UndefOr[TStamp]
    var DBProxyArn: js.UndefOr[String]
    var DBProxyName: js.UndefOr[String]
    var DebugLogging: js.UndefOr[Boolean]
    var Endpoint: js.UndefOr[String]
    var EngineFamily: js.UndefOr[String]
    var IdleClientTimeout: js.UndefOr[Int]
    var RequireTLS: js.UndefOr[Boolean]
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[DBProxyStatus]
    var UpdatedDate: js.UndefOr[TStamp]
    var VpcSecurityGroupIds: js.UndefOr[StringList]
    var VpcSubnetIds: js.UndefOr[StringList]
  }

  @js.native
  sealed trait DBProxyStatus extends js.Any
  object DBProxyStatus extends js.Object {
    val available                      = "available".asInstanceOf[DBProxyStatus]
    val modifying                      = "modifying".asInstanceOf[DBProxyStatus]
    val `incompatible-network`         = "incompatible-network".asInstanceOf[DBProxyStatus]
    val `insufficient-resource-limits` = "insufficient-resource-limits".asInstanceOf[DBProxyStatus]
    val creating                       = "creating".asInstanceOf[DBProxyStatus]
    val deleting                       = "deleting".asInstanceOf[DBProxyStatus]

    val values = js.Object.freeze(
      js.Array(available, modifying, `incompatible-network`, `insufficient-resource-limits`, creating, deleting)
    )
  }

  /**
    * '''Note:'''This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
    * Contains the details for an RDS Proxy target. It represents an RDS DB instance or Aurora DB cluster that the proxy can connect to. One or more targets are associated with an RDS Proxy target group.
    *  This data type is used as a response element in the <code>DescribeDBProxyTargets</code> action.
    */
  @js.native
  @Factory
  trait DBProxyTarget extends js.Object {
    var Endpoint: js.UndefOr[String]
    var Port: js.UndefOr[Int]
    var RdsResourceId: js.UndefOr[String]
    var TargetArn: js.UndefOr[String]
    var TrackedClusterId: js.UndefOr[String]
    var Type: js.UndefOr[TargetType]
  }

  /**
    * '''Note:'''This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
    * Represents a set of RDS DB instances, Aurora DB clusters, or both that a proxy can connect to. Currently, each target group is associated with exactly one RDS DB instance or Aurora DB cluster.
    *  This data type is used as a response element in the <code>DescribeDBProxyTargetGroups</code> action.
    */
  @js.native
  @Factory
  trait DBProxyTargetGroup extends js.Object {
    var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfigurationInfo]
    var CreatedDate: js.UndefOr[TStamp]
    var DBProxyName: js.UndefOr[String]
    var IsDefault: js.UndefOr[Boolean]
    var Status: js.UndefOr[String]
    var TargetGroupArn: js.UndefOr[String]
    var TargetGroupName: js.UndefOr[String]
    var UpdatedDate: js.UndefOr[TStamp]
  }

  /**
    * Contains the details for an Amazon RDS DB security group.
    *  This data type is used as a response element in the <code>DescribeDBSecurityGroups</code> action.
    */
  @js.native
  @Factory
  trait DBSecurityGroup extends js.Object {
    var DBSecurityGroupArn: js.UndefOr[String]
    var DBSecurityGroupDescription: js.UndefOr[String]
    var DBSecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var IPRanges: js.UndefOr[IPRangeList]
    var OwnerId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  /**
    * This data type is used as a response element in the following actions:
    * * <code>ModifyDBInstance</code>
    *  * <code>RebootDBInstance</code>
    *  * <code>RestoreDBInstanceFromDBSnapshot</code>
    *  * <code>RestoreDBInstanceToPointInTime</code>
    */
  @js.native
  @Factory
  trait DBSecurityGroupMembership extends js.Object {
    var DBSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBSecurityGroups</code> action.
    */
  @js.native
  @Factory
  trait DBSecurityGroupMessage extends js.Object {
    var DBSecurityGroups: js.UndefOr[DBSecurityGroups]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains the details of an Amazon RDS DB snapshot.
    *  This data type is used as a response element in the <code>DescribeDBSnapshots</code> action.
    */
  @js.native
  @Factory
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

  /**
    * Contains the name and values of a manual DB snapshot attribute
    *  Manual DB snapshot attributes are used to authorize other AWS accounts to restore a manual DB snapshot. For more information, see the <code>ModifyDBSnapshotAttribute</code> API.
    */
  @js.native
  @Factory
  trait DBSnapshotAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  /**
    * Contains the results of a successful call to the <code>DescribeDBSnapshotAttributes</code> API action.
    *  Manual DB snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB snapshot. For more information, see the <code>ModifyDBSnapshotAttribute</code> API action.
    */
  @js.native
  @Factory
  trait DBSnapshotAttributesResult extends js.Object {
    var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList]
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBSnapshots</code> action.
    */
  @js.native
  @Factory
  trait DBSnapshotMessage extends js.Object {
    var DBSnapshots: js.UndefOr[DBSnapshotList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains the details of an Amazon RDS DB subnet group.
    *  This data type is used as a response element in the <code>DescribeDBSubnetGroups</code> action.
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
    * Contains the result of a successful invocation of the <code>DescribeDBSubnetGroups</code> action.
    */
  @js.native
  @Factory
  trait DBSubnetGroupMessage extends js.Object {
    var DBSubnetGroups: js.UndefOr[DBSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteCustomAvailabilityZoneMessage extends js.Object {
    var CustomAvailabilityZoneId: String
  }

  @js.native
  @Factory
  trait DeleteCustomAvailabilityZoneResult extends js.Object {
    var CustomAvailabilityZone: js.UndefOr[CustomAvailabilityZone]
  }

  @js.native
  @Factory
  trait DeleteDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
  }

  /**
    * <p/>
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
    * <p/>
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
    * Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation.
    */
  @js.native
  @Factory
  trait DeleteDBInstanceAutomatedBackupMessage extends js.Object {
    var DbiResourceId: String
  }

  @js.native
  @Factory
  trait DeleteDBInstanceAutomatedBackupResult extends js.Object {
    var DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var DeleteAutomatedBackups: js.UndefOr[BooleanOptional]
    var FinalDBSnapshotIdentifier: js.UndefOr[String]
    var SkipFinalSnapshot: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
  }

  @js.native
  @Factory
  trait DeleteDBProxyRequest extends js.Object {
    var DBProxyName: String
  }

  @js.native
  @Factory
  trait DeleteDBProxyResponse extends js.Object {
    var DBProxy: js.UndefOr[DBProxy]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteDBSecurityGroupMessage extends js.Object {
    var DBSecurityGroupName: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: String
  }

  @js.native
  @Factory
  trait DeleteDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  @js.native
  @Factory
  trait DeleteEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  @js.native
  @Factory
  trait DeleteGlobalClusterMessage extends js.Object {
    var GlobalClusterIdentifier: String
  }

  @js.native
  @Factory
  trait DeleteGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  @js.native
  @Factory
  trait DeleteInstallationMediaMessage extends js.Object {
    var InstallationMediaId: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteOptionGroupMessage extends js.Object {
    var OptionGroupName: String
  }

  @js.native
  @Factory
  trait DeregisterDBProxyTargetsRequest extends js.Object {
    var DBProxyName: String
    var DBClusterIdentifiers: js.UndefOr[StringList]
    var DBInstanceIdentifiers: js.UndefOr[StringList]
    var TargetGroupName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeregisterDBProxyTargetsResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeAccountAttributesMessage extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeCertificatesMessage extends js.Object {
    var CertificateIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeCustomAvailabilityZonesMessage extends js.Object {
    var CustomAvailabilityZoneId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeDBClusterBacktracksMessage extends js.Object {
    var DBClusterIdentifier: String
    var BacktrackIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeDBClusterEndpointsMessage extends js.Object {
    var DBClusterEndpointIdentifier: js.UndefOr[String]
    var DBClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
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
    * <p/>
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
    * <p/>
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
    * <p/>
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
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeDBClustersMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var IncludeShared: js.UndefOr[Boolean]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeDBEngineVersionsMessage extends js.Object {
    var DBParameterGroupFamily: js.UndefOr[String]
    var DefaultOnly: js.UndefOr[Boolean]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var IncludeAll: js.UndefOr[BooleanOptional]
    var ListSupportedCharacterSets: js.UndefOr[BooleanOptional]
    var ListSupportedTimezones: js.UndefOr[BooleanOptional]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Parameter input for DescribeDBInstanceAutomatedBackups.
    */
  @js.native
  @Factory
  trait DescribeDBInstanceAutomatedBackupsMessage extends js.Object {
    var DBInstanceIdentifier: js.UndefOr[String]
    var DbiResourceId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
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
    * This data type is used as a response element to <code>DescribeDBLogFiles</code>.
    */
  @js.native
  @Factory
  trait DescribeDBLogFilesDetails extends js.Object {
    var LastWritten: js.UndefOr[Double]
    var LogFileName: js.UndefOr[String]
    var Size: js.UndefOr[Double]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeDBLogFilesMessage extends js.Object {
    var DBInstanceIdentifier: String
    var FileLastWritten: js.UndefOr[Double]
    var FileSize: js.UndefOr[Double]
    var FilenameContains: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * The response from a call to <code>DescribeDBLogFiles</code>.
    */
  @js.native
  @Factory
  trait DescribeDBLogFilesResponse extends js.Object {
    var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeDBParameterGroupsMessage extends js.Object {
    var DBParameterGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeDBParametersMessage extends js.Object {
    var DBParameterGroupName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDBProxiesRequest extends js.Object {
    var DBProxyName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[MaxRecords]
  }

  @js.native
  @Factory
  trait DescribeDBProxiesResponse extends js.Object {
    var DBProxies: js.UndefOr[DBProxyList]
    var Marker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDBProxyTargetGroupsRequest extends js.Object {
    var DBProxyName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[MaxRecords]
    var TargetGroupName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDBProxyTargetGroupsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var TargetGroups: js.UndefOr[TargetGroupList]
  }

  @js.native
  @Factory
  trait DescribeDBProxyTargetsRequest extends js.Object {
    var DBProxyName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[MaxRecords]
    var TargetGroupName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDBProxyTargetsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Targets: js.UndefOr[TargetList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeDBSecurityGroupsMessage extends js.Object {
    var DBSecurityGroupName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeDBSnapshotAttributesMessage extends js.Object {
    var DBSnapshotIdentifier: String
  }

  @js.native
  @Factory
  trait DescribeDBSnapshotAttributesResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
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

  /**
    * <p/>
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
    * <p/>
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
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    var DBParameterGroupFamily: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventCategoriesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SourceType: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
  }

  /**
    * <p/>
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

  @js.native
  @Factory
  trait DescribeExportTasksMessage extends js.Object {
    var ExportTaskIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[String]
    var SourceArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeGlobalClustersMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeInstallationMediaMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var InstallationMediaId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeOptionGroupOptionsMessage extends js.Object {
    var EngineName: String
    var Filters: js.UndefOr[FilterList]
    var MajorEngineVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeOptionGroupsMessage extends js.Object {
    var EngineName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MajorEngineVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var OptionGroupName: js.UndefOr[String]
  }

  /**
    * <p/>
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
    * <p/>
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
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReservedDBInstancesMessage extends js.Object {
    var DBInstanceClass: js.UndefOr[String]
    var Duration: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var LeaseId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var ReservedDBInstanceId: js.UndefOr[String]
    var ReservedDBInstancesOfferingId: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
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

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeSourceRegionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var RegionName: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeValidDBInstanceModificationsMessage extends js.Object {
    var DBInstanceIdentifier: String
  }

  @js.native
  @Factory
  trait DescribeValidDBInstanceModificationsResult extends js.Object {
    var ValidDBInstanceModificationsMessage: js.UndefOr[ValidDBInstanceModificationsMessage]
  }

  /**
    * An Active Directory Domain membership record associated with the DB instance or cluster.
    */
  @js.native
  @Factory
  trait DomainMembership extends js.Object {
    var Domain: js.UndefOr[String]
    var FQDN: js.UndefOr[String]
    var IAMRoleName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * A range of double values.
    */
  @js.native
  @Factory
  trait DoubleRange extends js.Object {
    var From: js.UndefOr[Double]
    var To: js.UndefOr[Double]
  }

  /**
    * This data type is used as a response element to <code>DownloadDBLogFilePortion</code>.
    */
  @js.native
  @Factory
  trait DownloadDBLogFilePortionDetails extends js.Object {
    var AdditionalDataPending: js.UndefOr[Boolean]
    var LogFileData: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DownloadDBLogFilePortionMessage extends js.Object {
    var DBInstanceIdentifier: String
    var LogFileName: String
    var Marker: js.UndefOr[String]
    var NumberOfLines: js.UndefOr[Int]
  }

  /**
    * This data type is used as a response element in the following actions:
    * * <code>AuthorizeDBSecurityGroupIngress</code>
    *  * <code>DescribeDBSecurityGroups</code>
    *  * <code>RevokeDBSecurityGroupIngress</code>
    */
  @js.native
  @Factory
  trait EC2SecurityGroup extends js.Object {
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * This data type represents the information you need to connect to an Amazon RDS DB instance. This data type is used as a response element in the following actions:
    * * <code>CreateDBInstance</code>
    *  * <code>DescribeDBInstances</code>
    *  * <code>DeleteDBInstance</code>
    * For the data structure that represents Amazon Aurora DB cluster endpoints, see <code>DBClusterEndpoint</code>.
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeEngineDefaultParameters</code> action.
    */
  @js.native
  @Factory
  trait EngineDefaults extends js.Object {
    var DBParameterGroupFamily: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  @js.native
  sealed trait EngineFamily extends js.Any
  object EngineFamily extends js.Object {
    val MYSQL = "MYSQL".asInstanceOf[EngineFamily]

    val values = js.Object.freeze(js.Array(MYSQL))
  }

  /**
    * This data type is used as a response element in the <code>DescribeEvents</code> action.
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
    * Contains the results of a successful invocation of the <code>DescribeEventCategories</code> action.
    */
  @js.native
  @Factory
  trait EventCategoriesMap extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  /**
    * Data returned from the ```DescribeEventCategories``` action.
    */
  @js.native
  @Factory
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList]
  }

  /**
    * Contains the results of a successful invocation of the <code>DescribeEventSubscriptions</code> action.
    */
  @js.native
  @Factory
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

  /**
    * Data returned by the ```DescribeEventSubscriptions``` action.
    */
  @js.native
  @Factory
  trait EventSubscriptionsMessage extends js.Object {
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeEvents</code> action.
    */
  @js.native
  @Factory
  trait EventsMessage extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains the details of a snapshot export to Amazon S3.
    *  This data type is used as a response element in the <code>DescribeExportTasks</code> action.
    */
  @js.native
  @Factory
  trait ExportTask extends js.Object {
    var ExportOnly: js.UndefOr[StringList]
    var ExportTaskIdentifier: js.UndefOr[String]
    var FailureCause: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var PercentProgress: js.UndefOr[Int]
    var S3Bucket: js.UndefOr[String]
    var S3Prefix: js.UndefOr[String]
    var SnapshotTime: js.UndefOr[TStamp]
    var SourceArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var TaskEndTime: js.UndefOr[TStamp]
    var TaskStartTime: js.UndefOr[TStamp]
    var TotalExtractedDataInGB: js.UndefOr[Int]
    var WarningMessage: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ExportTasksMessage extends js.Object {
    var ExportTasks: js.UndefOr[ExportTasksList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait FailoverDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var TargetDBInstanceIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait FailoverDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * A filter name and value pair that is used to return a more specific list of results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as IDs. The filters supported by a describe operation are documented with the describe operation.
    *
    * '''Note:'''Currently, wildcards are not supported in filters.
    * The following actions can be filtered:
    * * <code>DescribeDBClusterBacktracks</code>
    *  * <code>DescribeDBClusterEndpoints</code>
    *  * <code>DescribeDBClusters</code>
    *  * <code>DescribeDBInstances</code>
    *  * <code>DescribePendingMaintenanceActions</code>
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  /**
    * A data type representing an Aurora global database.
    */
  @js.native
  @Factory
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

  /**
    * A data structure with information about any primary and secondary clusters associated with an Aurora global database.
    */
  @js.native
  @Factory
  trait GlobalClusterMember extends js.Object {
    var DBClusterArn: js.UndefOr[String]
    var IsWriter: js.UndefOr[Boolean]
    var Readers: js.UndefOr[ReadersArnList]
  }

  @js.native
  @Factory
  trait GlobalClustersMessage extends js.Object {
    var GlobalClusters: js.UndefOr[GlobalClusterList]
    var Marker: js.UndefOr[String]
  }

  @js.native
  sealed trait IAMAuthMode extends js.Any
  object IAMAuthMode extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[IAMAuthMode]
    val REQUIRED = "REQUIRED".asInstanceOf[IAMAuthMode]

    val values = js.Object.freeze(js.Array(DISABLED, REQUIRED))
  }

  /**
    * This data type is used as a response element in the <code>DescribeDBSecurityGroups</code> action.
    */
  @js.native
  @Factory
  trait IPRange extends js.Object {
    var CIDRIP: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ImportInstallationMediaMessage extends js.Object {
    var CustomAvailabilityZoneId: String
    var Engine: String
    var EngineInstallationMediaPath: String
    var EngineVersion: String
    var OSInstallationMediaPath: String
  }

  /**
    * Contains the installation media for a DB engine that requires an on-premises customer provided license, such as Microsoft SQL Server.
    */
  @js.native
  @Factory
  trait InstallationMedia extends js.Object {
    var CustomAvailabilityZoneId: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineInstallationMediaPath: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var FailureCause: js.UndefOr[InstallationMediaFailureCause]
    var InstallationMediaId: js.UndefOr[String]
    var OSInstallationMediaPath: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Contains the cause of an installation media failure. Installation media is used for a DB engine that requires an on-premises customer provided license, such as Microsoft SQL Server.
    */
  @js.native
  @Factory
  trait InstallationMediaFailureCause extends js.Object {
    var Message: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait InstallationMediaMessage extends js.Object {
    var InstallationMedia: js.UndefOr[InstallationMediaList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
    var Filters: js.UndefOr[FilterList]
  }

  /**
    * The minimum DB engine version required for each corresponding allowed value for an option setting.
    */
  @js.native
  @Factory
  trait MinimumEngineVersionPerAllowedValue extends js.Object {
    var AllowedValue: js.UndefOr[String]
    var MinimumEngineVersion: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyCertificatesMessage extends js.Object {
    var CertificateIdentifier: js.UndefOr[String]
    var RemoveCustomerOverride: js.UndefOr[BooleanOptional]
  }

  @js.native
  @Factory
  trait ModifyCertificatesResult extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  @js.native
  @Factory
  trait ModifyCurrentDBClusterCapacityMessage extends js.Object {
    var DBClusterIdentifier: String
    var Capacity: js.UndefOr[IntegerOptional]
    var SecondsBeforeTimeout: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: String
    var EndpointType: js.UndefOr[String]
    var ExcludedMembers: js.UndefOr[StringList]
    var StaticMembers: js.UndefOr[StringList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean]
    var ApplyImmediately: js.UndefOr[Boolean]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBInstanceParameterGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
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

  /**
    * <p/>
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
    * <p/>
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
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean]
    var ApplyImmediately: js.UndefOr[Boolean]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var CACertificateIdentifier: js.UndefOr[String]
    var CertificateRotationRestart: js.UndefOr[BooleanOptional]
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
    var MaxAllocatedStorage: js.UndefOr[IntegerOptional]
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

  @js.native
  @Factory
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var Parameters: ParametersList
  }

  @js.native
  @Factory
  trait ModifyDBProxyRequest extends js.Object {
    var DBProxyName: String
    var Auth: js.UndefOr[UserAuthConfigList]
    var DebugLogging: js.UndefOr[BooleanOptional]
    var IdleClientTimeout: js.UndefOr[IntegerOptional]
    var NewDBProxyName: js.UndefOr[String]
    var RequireTLS: js.UndefOr[BooleanOptional]
    var RoleArn: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait ModifyDBProxyResponse extends js.Object {
    var DBProxy: js.UndefOr[DBProxy]
  }

  @js.native
  @Factory
  trait ModifyDBProxyTargetGroupRequest extends js.Object {
    var DBProxyName: String
    var TargetGroupName: String
    var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfiguration]
    var NewName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyDBProxyTargetGroupResponse extends js.Object {
    var DBProxyTargetGroup: js.UndefOr[DBProxyTargetGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyDBSnapshotAttributeMessage extends js.Object {
    var AttributeName: String
    var DBSnapshotIdentifier: String
    var ValuesToAdd: js.UndefOr[AttributeValueList]
    var ValuesToRemove: js.UndefOr[AttributeValueList]
  }

  @js.native
  @Factory
  trait ModifyDBSnapshotAttributeResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult]
  }

  @js.native
  @Factory
  trait ModifyDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: String
    var EngineVersion: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  /**
    * <p/>
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
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SnsTopicArn: js.UndefOr[String]
    var SourceType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  @js.native
  @Factory
  trait ModifyGlobalClusterMessage extends js.Object {
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var NewGlobalClusterIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyOptionGroupMessage extends js.Object {
    var OptionGroupName: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var OptionsToInclude: js.UndefOr[OptionConfigurationList]
    var OptionsToRemove: js.UndefOr[OptionNamesList]
  }

  @js.native
  @Factory
  trait ModifyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  /**
    * Option details.
    */
  @js.native
  @Factory
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

  /**
    * A list of all available options
    */
  @js.native
  @Factory
  trait OptionConfiguration extends js.Object {
    var OptionName: String
    var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList]
    var OptionSettings: js.UndefOr[OptionSettingsList]
    var OptionVersion: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
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

  /**
    * Provides information on the option groups the DB instance is a member of.
    */
  @js.native
  @Factory
  trait OptionGroupMembership extends js.Object {
    var OptionGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Available option.
    */
  @js.native
  @Factory
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

  /**
    * Option group option settings are used to display settings available for each option with their default values and other information. These values are used with the DescribeOptionGroupOptions action.
    */
  @js.native
  @Factory
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

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait OptionGroupOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList]
  }

  /**
    * List of option groups.
    */
  @js.native
  @Factory
  trait OptionGroups extends js.Object {
    var Marker: js.UndefOr[String]
    var OptionGroupsList: js.UndefOr[OptionGroupsList]
  }

  /**
    * Option settings are the actual settings being applied or configured for that option. It is used when you modify an option group or describe option groups. For example, the NATIVE_NETWORK_ENCRYPTION option has a setting called SQLNET.ENCRYPTION_SERVER that can have several different values.
    */
  @js.native
  @Factory
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

  /**
    * The version for an option. Option group option versions are returned by the <code>DescribeOptionGroupOptions</code> action.
    */
  @js.native
  @Factory
  trait OptionVersion extends js.Object {
    var IsDefault: js.UndefOr[Boolean]
    var Version: js.UndefOr[String]
  }

  /**
    * Contains a list of available options for a DB instance.
    *  This data type is used as a response element in the <code>DescribeOrderableDBInstanceOptions</code> action.
    */
  @js.native
  @Factory
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
    var SupportsKerberosAuthentication: js.UndefOr[BooleanOptional]
    var SupportsPerformanceInsights: js.UndefOr[Boolean]
    var SupportsStorageAutoscaling: js.UndefOr[BooleanOptional]
    var SupportsStorageEncryption: js.UndefOr[Boolean]
    var Vpc: js.UndefOr[Boolean]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeOrderableDBInstanceOptions</code> action.
    */
  @js.native
  @Factory
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList]
  }

  /**
    * This data type is used as a request parameter in the <code>ModifyDBParameterGroup</code> and <code>ResetDBParameterGroup</code> actions.
    *  This data type is used as a response element in the <code>DescribeEngineDefaultParameters</code> and <code>DescribeDBParameters</code> actions.
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
    var SupportedEngineModes: js.UndefOr[EngineModeList]
  }

  /**
    * A list of the log types whose configuration is still pending. In other words, these log types are in the process of being activated or deactivated.
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
    * Data returned from the ```DescribePendingMaintenanceActions``` action.
    */
  @js.native
  @Factory
  trait PendingMaintenanceActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
  }

  /**
    * This data type is used as a response element in the <code>ModifyDBInstance</code> action.
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
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList]
    var StorageType: js.UndefOr[String]
  }

  /**
    * Contains the processor features of a DB instance class.
    *  To specify the number of CPU cores, use the <code>coreCount</code> feature name for the <code>Name</code> parameter. To specify the number of threads per core, use the <code>threadsPerCore</code> feature name for the <code>Name</code> parameter.
    *  You can set the processor features of the DB instance class for a DB instance when you call one of the following actions:
    * * <code>CreateDBInstance</code>
    *  * <code>ModifyDBInstance</code>
    *  * <code>RestoreDBInstanceFromDBSnapshot</code>
    *  * <code>RestoreDBInstanceFromS3</code>
    *  * <code>RestoreDBInstanceToPointInTime</code>
    * You can view the valid processor values for a particular instance class by calling the <code>DescribeOrderableDBInstanceOptions</code> action and specifying the instance class for the <code>DBInstanceClass</code> parameter.
    *  In addition, you can use the following actions for DB instance class processor information:
    * * <code>DescribeDBInstances</code>
    *  * <code>DescribeDBSnapshots</code>
    *  * <code>DescribeValidDBInstanceModifications</code>
    * For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor|Configuring the Processor of the DB Instance Class]] in the <i>Amazon RDS User Guide. </i>
    */
  @js.native
  @Factory
  trait ProcessorFeature extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait PromoteReadReplicaDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  @js.native
  @Factory
  trait PromoteReadReplicaDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait PromoteReadReplicaMessage extends js.Object {
    var DBInstanceIdentifier: String
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PromoteReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
    var ReservedDBInstancesOfferingId: String
    var DBInstanceCount: js.UndefOr[IntegerOptional]
    var ReservedDBInstanceId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
    var ReservedDBInstance: js.UndefOr[ReservedDBInstance]
  }

  /**
    * A range of integer values.
    */
  @js.native
  @Factory
  trait Range extends js.Object {
    var From: js.UndefOr[Int]
    var Step: js.UndefOr[IntegerOptional]
    var To: js.UndefOr[Int]
  }

  /**
    * <p/>
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
    * This data type is used as a response element in the <code>DescribeReservedDBInstances</code> and <code>DescribeReservedDBInstancesOfferings</code> actions.
    */
  @js.native
  @Factory
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RegisterDBProxyTargetsRequest extends js.Object {
    var DBProxyName: String
    var DBClusterIdentifiers: js.UndefOr[StringList]
    var DBInstanceIdentifiers: js.UndefOr[StringList]
    var TargetGroupName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RegisterDBProxyTargetsResponse extends js.Object {
    var DBProxyTargets: js.UndefOr[TargetList]
  }

  @js.native
  @Factory
  trait RemoveFromGlobalClusterMessage extends js.Object {
    var DbClusterIdentifier: js.UndefOr[String]
    var GlobalClusterIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RemoveFromGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  @js.native
  @Factory
  trait RemoveRoleFromDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
    var FeatureName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RemoveRoleFromDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var FeatureName: String
    var RoleArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
    var SourceIdentifier: String
    var SubscriptionName: String
  }

  @js.native
  @Factory
  trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  /**
    * This data type is used as a response element in the <code>DescribeReservedDBInstances</code> and <code>PurchaseReservedDBInstancesOffering</code> actions.
    */
  @js.native
  @Factory
  trait ReservedDBInstance extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var DBInstanceClass: js.UndefOr[String]
    var DBInstanceCount: js.UndefOr[Int]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var LeaseId: js.UndefOr[String]
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

  /**
    * Contains the result of a successful invocation of the <code>DescribeReservedDBInstances</code> action.
    */
  @js.native
  @Factory
  trait ReservedDBInstanceMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList]
  }

  /**
    * This data type is used as a response element in the <code>DescribeReservedDBInstancesOfferings</code> action.
    */
  @js.native
  @Factory
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

  /**
    * Contains the result of a successful invocation of the <code>DescribeReservedDBInstancesOfferings</code> action.
    */
  @js.native
  @Factory
  trait ReservedDBInstancesOfferingMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ResetDBClusterParameterGroupMessage extends js.Object {
    var DBClusterParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ResetDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  /**
    * Describes the pending maintenance actions for a resource.
    */
  @js.native
  @Factory
  trait ResourcePendingMaintenanceActions extends js.Object {
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails]
    var ResourceIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
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
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
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

  @js.native
  @Factory
  trait RestoreDBClusterFromS3Result extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RestoreDBClusterFromSnapshotMessage extends js.Object {
    var DBClusterIdentifier: String
    var Engine: String
    var SnapshotIdentifier: String
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BacktrackWindow: js.UndefOr[LongOptional]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
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

  @js.native
  @Factory
  trait RestoreDBClusterFromSnapshotResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RestoreDBClusterToPointInTimeMessage extends js.Object {
    var DBClusterIdentifier: String
    var SourceDBClusterIdentifier: String
    var BacktrackWindow: js.UndefOr[LongOptional]
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
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

  @js.native
  @Factory
  trait RestoreDBClusterToPointInTimeResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait RestoreDBInstanceFromDBSnapshotResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait RestoreDBInstanceFromS3Result extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait RestoreDBInstanceToPointInTimeResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * Earliest and latest time an instance can be restored to:
    */
  @js.native
  @Factory
  trait RestoreWindow extends js.Object {
    var EarliestTime: js.UndefOr[TStamp]
    var LatestTime: js.UndefOr[TStamp]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RevokeDBSecurityGroupIngressMessage extends js.Object {
    var DBSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RevokeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  /**
    * Contains the scaling configuration of an Aurora Serverless DB cluster.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html|Using Amazon Aurora Serverless]] in the <i>Amazon Aurora User Guide</i>.
    */
  @js.native
  @Factory
  trait ScalingConfiguration extends js.Object {
    var AutoPause: js.UndefOr[BooleanOptional]
    var MaxCapacity: js.UndefOr[IntegerOptional]
    var MinCapacity: js.UndefOr[IntegerOptional]
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  /**
    * Shows the scaling configuration for an Aurora DB cluster in <code>serverless</code> DB engine mode.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html|Using Amazon Aurora Serverless]] in the <i>Amazon Aurora User Guide</i>.
    */
  @js.native
  @Factory
  trait ScalingConfigurationInfo extends js.Object {
    var AutoPause: js.UndefOr[BooleanOptional]
    var MaxCapacity: js.UndefOr[IntegerOptional]
    var MinCapacity: js.UndefOr[IntegerOptional]
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  /**
    * Contains an AWS Region name as the result of a successful call to the <code>DescribeSourceRegions</code> action.
    */
  @js.native
  @Factory
  trait SourceRegion extends js.Object {
    var Endpoint: js.UndefOr[String]
    var RegionName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeSourceRegions</code> action.
    */
  @js.native
  @Factory
  trait SourceRegionMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SourceRegions: js.UndefOr[SourceRegionList]
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
  trait StartActivityStreamRequest extends js.Object {
    var KmsKeyId: String
    var Mode: ActivityStreamMode
    var ResourceArn: String
    var ApplyImmediately: js.UndefOr[BooleanOptional]
  }

  @js.native
  @Factory
  trait StartActivityStreamResponse extends js.Object {
    var ApplyImmediately: js.UndefOr[Boolean]
    var KinesisStreamName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Mode: js.UndefOr[ActivityStreamMode]
    var Status: js.UndefOr[ActivityStreamStatus]
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
  trait StartDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
  }

  @js.native
  @Factory
  trait StartDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  @js.native
  @Factory
  trait StartExportTaskMessage extends js.Object {
    var ExportTaskIdentifier: String
    var IamRoleArn: String
    var KmsKeyId: String
    var S3BucketName: String
    var SourceArn: String
    var ExportOnly: js.UndefOr[StringList]
    var S3Prefix: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait StopActivityStreamRequest extends js.Object {
    var ResourceArn: String
    var ApplyImmediately: js.UndefOr[BooleanOptional]
  }

  @js.native
  @Factory
  trait StopActivityStreamResponse extends js.Object {
    var KinesisStreamName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Status: js.UndefOr[ActivityStreamStatus]
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

  @js.native
  @Factory
  trait StopDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait StopDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  /**
    * This data type is used as a response element in the <code>DescribeDBSubnetGroups</code> action.
    */
  @js.native
  @Factory
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetStatus: js.UndefOr[String]
  }

  /**
    * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TagListMessage extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  sealed trait TargetType extends js.Any
  object TargetType extends js.Object {
    val RDS_INSTANCE            = "RDS_INSTANCE".asInstanceOf[TargetType]
    val RDS_SERVERLESS_ENDPOINT = "RDS_SERVERLESS_ENDPOINT".asInstanceOf[TargetType]
    val TRACKED_CLUSTER         = "TRACKED_CLUSTER".asInstanceOf[TargetType]

    val values = js.Object.freeze(js.Array(RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT, TRACKED_CLUSTER))
  }

  /**
    * A time zone associated with a <code>DBInstance</code> or a <code>DBSnapshot</code>. This data type is an element in the response to the <code>DescribeDBInstances</code>, the <code>DescribeDBSnapshots</code>, and the <code>DescribeDBEngineVersions</code> actions.
    */
  @js.native
  @Factory
  trait Timezone extends js.Object {
    var TimezoneName: js.UndefOr[String]
  }

  /**
    * The version of the database engine that a DB instance can be upgraded to.
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
    * '''Note:'''This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
    * Specifies the details of authentication used by a proxy to log in as a specific database user.
    */
  @js.native
  @Factory
  trait UserAuthConfig extends js.Object {
    var AuthScheme: js.UndefOr[AuthScheme]
    var Description: js.UndefOr[String]
    var IAMAuth: js.UndefOr[IAMAuthMode]
    var SecretArn: js.UndefOr[String]
    var UserName: js.UndefOr[String]
  }

  /**
    * '''Note:'''This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
    * Returns the details of authentication used by a proxy to log in as a specific database user.
    */
  @js.native
  @Factory
  trait UserAuthConfigInfo extends js.Object {
    var AuthScheme: js.UndefOr[AuthScheme]
    var Description: js.UndefOr[String]
    var IAMAuth: js.UndefOr[IAMAuthMode]
    var SecretArn: js.UndefOr[String]
    var UserName: js.UndefOr[String]
  }

  /**
    * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <code>DescribeValidDBInstanceModifications</code> action. You can use this information when you call <code>ModifyDBInstance</code>.
    */
  @js.native
  @Factory
  trait ValidDBInstanceModificationsMessage extends js.Object {
    var Storage: js.UndefOr[ValidStorageOptionsList]
    var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList]
  }

  /**
    * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <code>DescribeValidDBInstanceModifications</code> action.
    */
  @js.native
  @Factory
  trait ValidStorageOptions extends js.Object {
    var IopsToStorageRatio: js.UndefOr[DoubleRangeList]
    var ProvisionedIops: js.UndefOr[RangeList]
    var StorageSize: js.UndefOr[RangeList]
    var StorageType: js.UndefOr[String]
    var SupportsStorageAutoscaling: js.UndefOr[Boolean]
  }

  /**
    * This data type is used as a response element for queries on VPC security group membership.
    */
  @js.native
  @Factory
  trait VpcSecurityGroupMembership extends js.Object {
    var Status: js.UndefOr[String]
    var VpcSecurityGroupId: js.UndefOr[String]
  }

  /**
    * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
    *  For more information about RDS on VMware, see the <a href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> <i>RDS on VMware User Guide.</i> </a>
    */
  @js.native
  @Factory
  trait VpnDetails extends js.Object {
    var VpnGatewayIp: js.UndefOr[String]
    var VpnId: js.UndefOr[String]
    var VpnName: js.UndefOr[String]
    var VpnPSK: js.UndefOr[StringSensitive]
    var VpnState: js.UndefOr[String]
    var VpnTunnelOriginatorIP: js.UndefOr[String]
  }
}
