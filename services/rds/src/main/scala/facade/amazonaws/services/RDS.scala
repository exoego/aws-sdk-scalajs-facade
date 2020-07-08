package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
  trait AccountAttributesMessage extends js.Object {
    var AccountQuotas: js.UndefOr[AccountQuotaList]
  }

  object AccountAttributesMessage {
    @inline
    def apply(
        AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined
    ): AccountAttributesMessage = {
      val __obj = js.Dynamic.literal()
      AccountQuotas.foreach(__v => __obj.updateDynamic("AccountQuotas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAttributesMessage]
    }
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
    *  * <code>ReadReplicasPerMaster</code> - The number of read replicas per DB instance. The used value is the highest number of read replicas for a DB instance in the account. Other DB instances in the account might have a lower number of read replicas.
    *  * <code>ReservedDBInstances</code> - The number of reserved DB instances per account. The used value is the count of the active reserved DB instances in the account.
    *  * <code>SubnetsPerDBSubnetGroup</code> - The number of subnets per DB subnet group. The used value is highest number of subnets for a DB subnet group in the account. Other DB subnet groups in the account might have a lower number of subnets.
    * For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html|Quotas for Amazon RDS]] in the <i>Amazon RDS User Guide</i> and [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Limits.html|Quotas for Amazon Aurora]] in the <i>Amazon Aurora User Guide</i>.
    */
  @js.native
  trait AccountQuota extends js.Object {
    var AccountQuotaName: js.UndefOr[String]
    var Max: js.UndefOr[Double]
    var Used: js.UndefOr[Double]
  }

  object AccountQuota {
    @inline
    def apply(
        AccountQuotaName: js.UndefOr[String] = js.undefined,
        Max: js.UndefOr[Double] = js.undefined,
        Used: js.UndefOr[Double] = js.undefined
    ): AccountQuota = {
      val __obj = js.Dynamic.literal()
      AccountQuotaName.foreach(__v => __obj.updateDynamic("AccountQuotaName")(__v.asInstanceOf[js.Any]))
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Used.foreach(__v => __obj.updateDynamic("Used")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountQuota]
    }
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
  trait AddRoleToDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
    var FeatureName: js.UndefOr[String]
  }

  object AddRoleToDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        RoleArn: String,
        FeatureName: js.UndefOr[String] = js.undefined
    ): AddRoleToDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "RoleArn"             -> RoleArn.asInstanceOf[js.Any]
      )

      FeatureName.foreach(__v => __obj.updateDynamic("FeatureName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddRoleToDBClusterMessage]
    }
  }

  @js.native
  trait AddRoleToDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var FeatureName: String
    var RoleArn: String
  }

  object AddRoleToDBInstanceMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String,
        FeatureName: String,
        RoleArn: String
    ): AddRoleToDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "FeatureName"          -> FeatureName.asInstanceOf[js.Any],
        "RoleArn"              -> RoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddRoleToDBInstanceMessage]
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

  /**
    * <p/>
    */
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
  trait AuthorizeDBSecurityGroupIngressMessage extends js.Object {
    var DBSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object AuthorizeDBSecurityGroupIngressMessage {
    @inline
    def apply(
        DBSecurityGroupName: String,
        CIDRIP: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): AuthorizeDBSecurityGroupIngressMessage = {
      val __obj = js.Dynamic.literal(
        "DBSecurityGroupName" -> DBSecurityGroupName.asInstanceOf[js.Any]
      )

      CIDRIP.foreach(__v => __obj.updateDynamic("CIDRIP")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupId")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupName.foreach(__v => __obj.updateDynamic("EC2SecurityGroupName")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupOwnerId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupOwnerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object AuthorizeDBSecurityGroupIngressResult {
    @inline
    def apply(
        DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
    ): AuthorizeDBSecurityGroupIngressResult = {
      val __obj = js.Dynamic.literal()
      DBSecurityGroup.foreach(__v => __obj.updateDynamic("DBSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
    }
  }

  /**
    * Contains Availability Zone information.
    *  This data type is used as an element in the <code>OrderableDBInstanceOption</code> data type.
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
    * Contains the available processor feature information for the DB instance class of a DB instance.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor|Configuring the Processor of the DB Instance Class]] in the <i>Amazon RDS User Guide. </i>
    */
  @js.native
  trait AvailableProcessorFeature extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var DefaultValue: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object AvailableProcessorFeature {
    @inline
    def apply(
        AllowedValues: js.UndefOr[String] = js.undefined,
        DefaultValue: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): AvailableProcessorFeature = {
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailableProcessorFeature]
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
    @inline
    def apply(
        BacktrackTo: TStamp,
        DBClusterIdentifier: String,
        Force: js.UndefOr[BooleanOptional] = js.undefined,
        UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional] = js.undefined
    ): BacktrackDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "BacktrackTo"         -> BacktrackTo.asInstanceOf[js.Any],
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      Force.foreach(__v => __obj.updateDynamic("Force")(__v.asInstanceOf[js.Any]))
      UseEarliestTimeOnPointInTimeUnavailable.foreach(__v =>
        __obj.updateDynamic("UseEarliestTimeOnPointInTimeUnavailable")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BacktrackDBClusterMessage]
    }
  }

  @js.native
  trait CancelExportTaskMessage extends js.Object {
    var ExportTaskIdentifier: String
  }

  object CancelExportTaskMessage {
    @inline
    def apply(
        ExportTaskIdentifier: String
    ): CancelExportTaskMessage = {
      val __obj = js.Dynamic.literal(
        "ExportTaskIdentifier" -> ExportTaskIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelExportTaskMessage]
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
    var CustomerOverride: js.UndefOr[BooleanOptional]
    var CustomerOverrideValidTill: js.UndefOr[TStamp]
    var Thumbprint: js.UndefOr[String]
    var ValidFrom: js.UndefOr[TStamp]
    var ValidTill: js.UndefOr[TStamp]
  }

  object Certificate {
    @inline
    def apply(
        CertificateArn: js.UndefOr[String] = js.undefined,
        CertificateIdentifier: js.UndefOr[String] = js.undefined,
        CertificateType: js.UndefOr[String] = js.undefined,
        CustomerOverride: js.UndefOr[BooleanOptional] = js.undefined,
        CustomerOverrideValidTill: js.UndefOr[TStamp] = js.undefined,
        Thumbprint: js.UndefOr[String] = js.undefined,
        ValidFrom: js.UndefOr[TStamp] = js.undefined,
        ValidTill: js.UndefOr[TStamp] = js.undefined
    ): Certificate = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      CertificateIdentifier.foreach(__v => __obj.updateDynamic("CertificateIdentifier")(__v.asInstanceOf[js.Any]))
      CertificateType.foreach(__v => __obj.updateDynamic("CertificateType")(__v.asInstanceOf[js.Any]))
      CustomerOverride.foreach(__v => __obj.updateDynamic("CustomerOverride")(__v.asInstanceOf[js.Any]))
      CustomerOverrideValidTill.foreach(__v =>
        __obj.updateDynamic("CustomerOverrideValidTill")(__v.asInstanceOf[js.Any])
      )
      Thumbprint.foreach(__v => __obj.updateDynamic("Thumbprint")(__v.asInstanceOf[js.Any]))
      ValidFrom.foreach(__v => __obj.updateDynamic("ValidFrom")(__v.asInstanceOf[js.Any]))
      ValidTill.foreach(__v => __obj.updateDynamic("ValidTill")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Certificate]
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
    @inline
    def apply(
        Certificates: js.UndefOr[CertificateList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CertificateMessage = {
      val __obj = js.Dynamic.literal()
      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateMessage]
    }
  }

  /**
    * This data type is used as a response element in the action <code>DescribeDBEngineVersions</code>.
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
    *  The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which logs will be exported (or not exported) to CloudWatch Logs. The values within these arrays depend on the DB engine being used. For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch|Publishing Database Logs to Amazon CloudWatch Logs ]] in the <i>Amazon RDS User Guide</i>.
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

  /**
    * Specifies the settings that control the size and behavior of the connection pool associated with a <code>DBProxyTargetGroup</code>.
    */
  @js.native
  trait ConnectionPoolConfiguration extends js.Object {
    var ConnectionBorrowTimeout: js.UndefOr[IntegerOptional]
    var InitQuery: js.UndefOr[String]
    var MaxConnectionsPercent: js.UndefOr[IntegerOptional]
    var MaxIdleConnectionsPercent: js.UndefOr[IntegerOptional]
    var SessionPinningFilters: js.UndefOr[StringList]
  }

  object ConnectionPoolConfiguration {
    @inline
    def apply(
        ConnectionBorrowTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        InitQuery: js.UndefOr[String] = js.undefined,
        MaxConnectionsPercent: js.UndefOr[IntegerOptional] = js.undefined,
        MaxIdleConnectionsPercent: js.UndefOr[IntegerOptional] = js.undefined,
        SessionPinningFilters: js.UndefOr[StringList] = js.undefined
    ): ConnectionPoolConfiguration = {
      val __obj = js.Dynamic.literal()
      ConnectionBorrowTimeout.foreach(__v => __obj.updateDynamic("ConnectionBorrowTimeout")(__v.asInstanceOf[js.Any]))
      InitQuery.foreach(__v => __obj.updateDynamic("InitQuery")(__v.asInstanceOf[js.Any]))
      MaxConnectionsPercent.foreach(__v => __obj.updateDynamic("MaxConnectionsPercent")(__v.asInstanceOf[js.Any]))
      MaxIdleConnectionsPercent.foreach(__v =>
        __obj.updateDynamic("MaxIdleConnectionsPercent")(__v.asInstanceOf[js.Any])
      )
      SessionPinningFilters.foreach(__v => __obj.updateDynamic("SessionPinningFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionPoolConfiguration]
    }
  }

  /**
    * Displays the settings that control the size and behavior of the connection pool associated with a <code>DBProxyTarget</code>.
    */
  @js.native
  trait ConnectionPoolConfigurationInfo extends js.Object {
    var ConnectionBorrowTimeout: js.UndefOr[Int]
    var InitQuery: js.UndefOr[String]
    var MaxConnectionsPercent: js.UndefOr[Int]
    var MaxIdleConnectionsPercent: js.UndefOr[Int]
    var SessionPinningFilters: js.UndefOr[StringList]
  }

  object ConnectionPoolConfigurationInfo {
    @inline
    def apply(
        ConnectionBorrowTimeout: js.UndefOr[Int] = js.undefined,
        InitQuery: js.UndefOr[String] = js.undefined,
        MaxConnectionsPercent: js.UndefOr[Int] = js.undefined,
        MaxIdleConnectionsPercent: js.UndefOr[Int] = js.undefined,
        SessionPinningFilters: js.UndefOr[StringList] = js.undefined
    ): ConnectionPoolConfigurationInfo = {
      val __obj = js.Dynamic.literal()
      ConnectionBorrowTimeout.foreach(__v => __obj.updateDynamic("ConnectionBorrowTimeout")(__v.asInstanceOf[js.Any]))
      InitQuery.foreach(__v => __obj.updateDynamic("InitQuery")(__v.asInstanceOf[js.Any]))
      MaxConnectionsPercent.foreach(__v => __obj.updateDynamic("MaxConnectionsPercent")(__v.asInstanceOf[js.Any]))
      MaxIdleConnectionsPercent.foreach(__v =>
        __obj.updateDynamic("MaxIdleConnectionsPercent")(__v.asInstanceOf[js.Any])
      )
      SessionPinningFilters.foreach(__v => __obj.updateDynamic("SessionPinningFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionPoolConfigurationInfo]
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
    @inline
    def apply(
        SourceDBClusterSnapshotIdentifier: String,
        TargetDBClusterSnapshotIdentifier: String,
        CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        PreSignedUrl: js.UndefOr[String] = js.undefined,
        SourceRegion: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "SourceDBClusterSnapshotIdentifier" -> SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetDBClusterSnapshotIdentifier" -> TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any]
      )

      CopyTags.foreach(__v => __obj.updateDynamic("CopyTags")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      PreSignedUrl.foreach(__v => __obj.updateDynamic("PreSignedUrl")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        SourceDBSnapshotIdentifier: String,
        TargetDBSnapshotIdentifier: String,
        CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        PreSignedUrl: js.UndefOr[String] = js.undefined,
        SourceRegion: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "SourceDBSnapshotIdentifier" -> SourceDBSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetDBSnapshotIdentifier" -> TargetDBSnapshotIdentifier.asInstanceOf[js.Any]
      )

      CopyTags.foreach(__v => __obj.updateDynamic("CopyTags")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      PreSignedUrl.foreach(__v => __obj.updateDynamic("PreSignedUrl")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBSnapshotMessage]
    }
  }

  @js.native
  trait CopyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object CopyDBSnapshotResult {
    @inline
    def apply(
        DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
    ): CopyDBSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBSnapshot.foreach(__v => __obj.updateDynamic("DBSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyDBSnapshotResult]
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
    @inline
    def apply(
        SourceOptionGroupIdentifier: String,
        TargetOptionGroupDescription: String,
        TargetOptionGroupIdentifier: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyOptionGroupMessage = {
      val __obj = js.Dynamic.literal(
        "SourceOptionGroupIdentifier"  -> SourceOptionGroupIdentifier.asInstanceOf[js.Any],
        "TargetOptionGroupDescription" -> TargetOptionGroupDescription.asInstanceOf[js.Any],
        "TargetOptionGroupIdentifier"  -> TargetOptionGroupIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyOptionGroupMessage]
    }
  }

  @js.native
  trait CopyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object CopyOptionGroupResult {
    @inline
    def apply(
        OptionGroup: js.UndefOr[OptionGroup] = js.undefined
    ): CopyOptionGroupResult = {
      val __obj = js.Dynamic.literal()
      OptionGroup.foreach(__v => __obj.updateDynamic("OptionGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyOptionGroupResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateCustomAvailabilityZoneMessage extends js.Object {
    var CustomAvailabilityZoneName: String
    var ExistingVpnId: js.UndefOr[String]
    var NewVpnTunnelName: js.UndefOr[String]
    var VpnTunnelOriginatorIP: js.UndefOr[String]
  }

  object CreateCustomAvailabilityZoneMessage {
    @inline
    def apply(
        CustomAvailabilityZoneName: String,
        ExistingVpnId: js.UndefOr[String] = js.undefined,
        NewVpnTunnelName: js.UndefOr[String] = js.undefined,
        VpnTunnelOriginatorIP: js.UndefOr[String] = js.undefined
    ): CreateCustomAvailabilityZoneMessage = {
      val __obj = js.Dynamic.literal(
        "CustomAvailabilityZoneName" -> CustomAvailabilityZoneName.asInstanceOf[js.Any]
      )

      ExistingVpnId.foreach(__v => __obj.updateDynamic("ExistingVpnId")(__v.asInstanceOf[js.Any]))
      NewVpnTunnelName.foreach(__v => __obj.updateDynamic("NewVpnTunnelName")(__v.asInstanceOf[js.Any]))
      VpnTunnelOriginatorIP.foreach(__v => __obj.updateDynamic("VpnTunnelOriginatorIP")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomAvailabilityZoneMessage]
    }
  }

  @js.native
  trait CreateCustomAvailabilityZoneResult extends js.Object {
    var CustomAvailabilityZone: js.UndefOr[CustomAvailabilityZone]
  }

  object CreateCustomAvailabilityZoneResult {
    @inline
    def apply(
        CustomAvailabilityZone: js.UndefOr[CustomAvailabilityZone] = js.undefined
    ): CreateCustomAvailabilityZoneResult = {
      val __obj = js.Dynamic.literal()
      CustomAvailabilityZone.foreach(__v => __obj.updateDynamic("CustomAvailabilityZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomAvailabilityZoneResult]
    }
  }

  @js.native
  trait CreateDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: String
    var DBClusterIdentifier: String
    var EndpointType: String
    var ExcludedMembers: js.UndefOr[StringList]
    var StaticMembers: js.UndefOr[StringList]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDBClusterEndpointMessage {
    @inline
    def apply(
        DBClusterEndpointIdentifier: String,
        DBClusterIdentifier: String,
        EndpointType: String,
        ExcludedMembers: js.UndefOr[StringList] = js.undefined,
        StaticMembers: js.UndefOr[StringList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBClusterEndpointMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.asInstanceOf[js.Any],
        "DBClusterIdentifier"         -> DBClusterIdentifier.asInstanceOf[js.Any],
        "EndpointType"                -> EndpointType.asInstanceOf[js.Any]
      )

      ExcludedMembers.foreach(__v => __obj.updateDynamic("ExcludedMembers")(__v.asInstanceOf[js.Any]))
      StaticMembers.foreach(__v => __obj.updateDynamic("StaticMembers")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterEndpointMessage]
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
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional]
    var DBClusterParameterGroupName: js.UndefOr[String]
    var DBSubnetGroupName: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var Domain: js.UndefOr[String]
    var DomainIAMRoleName: js.UndefOr[String]
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList]
    var EnableGlobalWriteForwarding: js.UndefOr[BooleanOptional]
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

  object CreateDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        Engine: String,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        CharacterSetName: js.UndefOr[String] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        DomainIAMRoleName: js.UndefOr[String] = js.undefined,
        EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        EnableGlobalWriteForwarding: js.UndefOr[BooleanOptional] = js.undefined,
        EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.undefined,
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
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BacktrackWindow.foreach(__v => __obj.updateDynamic("BacktrackWindow")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnableCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      EnableGlobalWriteForwarding.foreach(__v =>
        __obj.updateDynamic("EnableGlobalWriteForwarding")(__v.asInstanceOf[js.Any])
      )
      EnableHttpEndpoint.foreach(__v => __obj.updateDynamic("EnableHttpEndpoint")(__v.asInstanceOf[js.Any]))
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      EngineMode.foreach(__v => __obj.updateDynamic("EngineMode")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      GlobalClusterIdentifier.foreach(__v => __obj.updateDynamic("GlobalClusterIdentifier")(__v.asInstanceOf[js.Any]))
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
      ScalingConfiguration.foreach(__v => __obj.updateDynamic("ScalingConfiguration")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBClusterMessage]
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
        MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
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
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
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
      MaxAllocatedStorage.foreach(__v => __obj.updateDynamic("MaxAllocatedStorage")(__v.asInstanceOf[js.Any]))
      MonitoringInterval.foreach(__v => __obj.updateDynamic("MonitoringInterval")(__v.asInstanceOf[js.Any]))
      MonitoringRoleArn.foreach(__v => __obj.updateDynamic("MonitoringRoleArn")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsKMSKeyId.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsKMSKeyId")(__v.asInstanceOf[js.Any])
      )
      PerformanceInsightsRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
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

  object CreateDBInstanceReadReplicaMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String,
        SourceDBInstanceIdentifier: String,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        DBParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        DomainIAMRoleName: js.UndefOr[String] = js.undefined,
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
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier"       -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "SourceDBInstanceIdentifier" -> SourceDBInstanceIdentifier.asInstanceOf[js.Any]
      )

      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
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
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MonitoringInterval.foreach(__v => __obj.updateDynamic("MonitoringInterval")(__v.asInstanceOf[js.Any]))
      MonitoringRoleArn.foreach(__v => __obj.updateDynamic("MonitoringRoleArn")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsKMSKeyId.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsKMSKeyId")(__v.asInstanceOf[js.Any])
      )
      PerformanceInsightsRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreSignedUrl.foreach(__v => __obj.updateDynamic("PreSignedUrl")(__v.asInstanceOf[js.Any]))
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UseDefaultProcessorFeatures.foreach(__v =>
        __obj.updateDynamic("UseDefaultProcessorFeatures")(__v.asInstanceOf[js.Any])
      )
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBInstanceReadReplicaMessage]
    }
  }

  @js.native
  trait CreateDBInstanceReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object CreateDBInstanceReadReplicaResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): CreateDBInstanceReadReplicaResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBInstanceReadReplicaResult]
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

  object CreateDBProxyRequest {
    @inline
    def apply(
        Auth: UserAuthConfigList,
        DBProxyName: String,
        EngineFamily: EngineFamily,
        RoleArn: String,
        VpcSubnetIds: StringList,
        DebugLogging: js.UndefOr[Boolean] = js.undefined,
        IdleClientTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        RequireTLS: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
    ): CreateDBProxyRequest = {
      val __obj = js.Dynamic.literal(
        "Auth"         -> Auth.asInstanceOf[js.Any],
        "DBProxyName"  -> DBProxyName.asInstanceOf[js.Any],
        "EngineFamily" -> EngineFamily.asInstanceOf[js.Any],
        "RoleArn"      -> RoleArn.asInstanceOf[js.Any],
        "VpcSubnetIds" -> VpcSubnetIds.asInstanceOf[js.Any]
      )

      DebugLogging.foreach(__v => __obj.updateDynamic("DebugLogging")(__v.asInstanceOf[js.Any]))
      IdleClientTimeout.foreach(__v => __obj.updateDynamic("IdleClientTimeout")(__v.asInstanceOf[js.Any]))
      RequireTLS.foreach(__v => __obj.updateDynamic("RequireTLS")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBProxyRequest]
    }
  }

  @js.native
  trait CreateDBProxyResponse extends js.Object {
    var DBProxy: js.UndefOr[DBProxy]
  }

  object CreateDBProxyResponse {
    @inline
    def apply(
        DBProxy: js.UndefOr[DBProxy] = js.undefined
    ): CreateDBProxyResponse = {
      val __obj = js.Dynamic.literal()
      DBProxy.foreach(__v => __obj.updateDynamic("DBProxy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBProxyResponse]
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
    @inline
    def apply(
        DBSecurityGroupDescription: String,
        DBSecurityGroupName: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBSecurityGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBSecurityGroupDescription" -> DBSecurityGroupDescription.asInstanceOf[js.Any],
        "DBSecurityGroupName"        -> DBSecurityGroupName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateDBSecurityGroupResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object CreateDBSecurityGroupResult {
    @inline
    def apply(
        DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
    ): CreateDBSecurityGroupResult = {
      val __obj = js.Dynamic.literal()
      DBSecurityGroup.foreach(__v => __obj.updateDynamic("DBSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBSecurityGroupResult]
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
    @inline
    def apply(
        DBInstanceIdentifier: String,
        DBSnapshotIdentifier: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBSnapshotMessage]
    }
  }

  @js.native
  trait CreateDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object CreateDBSnapshotResult {
    @inline
    def apply(
        DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
    ): CreateDBSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBSnapshot.foreach(__v => __obj.updateDynamic("DBSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDBSnapshotResult]
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
    @inline
    def apply(
        DatabaseName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
        SourceDBClusterIdentifier: js.UndefOr[String] = js.undefined,
        StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
    ): CreateGlobalClusterMessage = {
      val __obj = js.Dynamic.literal()
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      GlobalClusterIdentifier.foreach(__v => __obj.updateDynamic("GlobalClusterIdentifier")(__v.asInstanceOf[js.Any]))
      SourceDBClusterIdentifier.foreach(__v =>
        __obj.updateDynamic("SourceDBClusterIdentifier")(__v.asInstanceOf[js.Any])
      )
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGlobalClusterMessage]
    }
  }

  @js.native
  trait CreateGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  object CreateGlobalClusterResult {
    @inline
    def apply(
        GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
    ): CreateGlobalClusterResult = {
      val __obj = js.Dynamic.literal()
      GlobalCluster.foreach(__v => __obj.updateDynamic("GlobalCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGlobalClusterResult]
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
    @inline
    def apply(
        EngineName: String,
        MajorEngineVersion: String,
        OptionGroupDescription: String,
        OptionGroupName: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateOptionGroupMessage = {
      val __obj = js.Dynamic.literal(
        "EngineName"             -> EngineName.asInstanceOf[js.Any],
        "MajorEngineVersion"     -> MajorEngineVersion.asInstanceOf[js.Any],
        "OptionGroupDescription" -> OptionGroupDescription.asInstanceOf[js.Any],
        "OptionGroupName"        -> OptionGroupName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOptionGroupMessage]
    }
  }

  @js.native
  trait CreateOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object CreateOptionGroupResult {
    @inline
    def apply(
        OptionGroup: js.UndefOr[OptionGroup] = js.undefined
    ): CreateOptionGroupResult = {
      val __obj = js.Dynamic.literal()
      OptionGroup.foreach(__v => __obj.updateDynamic("OptionGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOptionGroupResult]
    }
  }

  /**
    * A custom Availability Zone (AZ) is an on-premises AZ that is integrated with a VMware vSphere cluster.
    *  For more information about RDS on VMware, see the <a href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> <i>RDS on VMware User Guide.</i> </a>
    */
  @js.native
  trait CustomAvailabilityZone extends js.Object {
    var CustomAvailabilityZoneId: js.UndefOr[String]
    var CustomAvailabilityZoneName: js.UndefOr[String]
    var CustomAvailabilityZoneStatus: js.UndefOr[String]
    var VpnDetails: js.UndefOr[VpnDetails]
  }

  object CustomAvailabilityZone {
    @inline
    def apply(
        CustomAvailabilityZoneId: js.UndefOr[String] = js.undefined,
        CustomAvailabilityZoneName: js.UndefOr[String] = js.undefined,
        CustomAvailabilityZoneStatus: js.UndefOr[String] = js.undefined,
        VpnDetails: js.UndefOr[VpnDetails] = js.undefined
    ): CustomAvailabilityZone = {
      val __obj = js.Dynamic.literal()
      CustomAvailabilityZoneId.foreach(__v => __obj.updateDynamic("CustomAvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      CustomAvailabilityZoneName.foreach(__v =>
        __obj.updateDynamic("CustomAvailabilityZoneName")(__v.asInstanceOf[js.Any])
      )
      CustomAvailabilityZoneStatus.foreach(__v =>
        __obj.updateDynamic("CustomAvailabilityZoneStatus")(__v.asInstanceOf[js.Any])
      )
      VpnDetails.foreach(__v => __obj.updateDynamic("VpnDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomAvailabilityZone]
    }
  }

  @js.native
  trait CustomAvailabilityZoneMessage extends js.Object {
    var CustomAvailabilityZones: js.UndefOr[CustomAvailabilityZoneList]
    var Marker: js.UndefOr[String]
  }

  object CustomAvailabilityZoneMessage {
    @inline
    def apply(
        CustomAvailabilityZones: js.UndefOr[CustomAvailabilityZoneList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CustomAvailabilityZoneMessage = {
      val __obj = js.Dynamic.literal()
      CustomAvailabilityZones.foreach(__v => __obj.updateDynamic("CustomAvailabilityZones")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomAvailabilityZoneMessage]
    }
  }

  /**
    * Contains the details of an Amazon Aurora DB cluster.
    *  This data type is used as a response element in the <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and <code>StartDBCluster</code> actions.
    */
  @js.native
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
    var GlobalWriteForwardingRequested: js.UndefOr[BooleanOptional]
    var GlobalWriteForwardingStatus: js.UndefOr[WriteForwardingStatus]
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

  object DBCluster {
    @inline
    def apply(
        ActivityStreamKinesisStreamName: js.UndefOr[String] = js.undefined,
        ActivityStreamKmsKeyId: js.UndefOr[String] = js.undefined,
        ActivityStreamMode: js.UndefOr[ActivityStreamMode] = js.undefined,
        ActivityStreamStatus: js.UndefOr[ActivityStreamStatus] = js.undefined,
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        BacktrackConsumedChangeRecords: js.UndefOr[LongOptional] = js.undefined,
        BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        Capacity: js.UndefOr[IntegerOptional] = js.undefined,
        CharacterSetName: js.UndefOr[String] = js.undefined,
        CloneGroupId: js.UndefOr[String] = js.undefined,
        ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        CrossAccountClone: js.UndefOr[BooleanOptional] = js.undefined,
        CustomEndpoints: js.UndefOr[StringList] = js.undefined,
        DBClusterArn: js.UndefOr[String] = js.undefined,
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.undefined,
        DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships] = js.undefined,
        DBClusterParameterGroup: js.UndefOr[String] = js.undefined,
        DBSubnetGroup: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DbClusterResourceId: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        DomainMemberships: js.UndefOr[DomainMembershipList] = js.undefined,
        EarliestBacktrackTime: js.UndefOr[TStamp] = js.undefined,
        EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined,
        EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined,
        Endpoint: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineMode: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        GlobalWriteForwardingRequested: js.UndefOr[BooleanOptional] = js.undefined,
        GlobalWriteForwardingStatus: js.UndefOr[WriteForwardingStatus] = js.undefined,
        HostedZoneId: js.UndefOr[String] = js.undefined,
        HttpEndpointEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        IAMDatabaseAuthenticationEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LatestRestorableTime: js.UndefOr[TStamp] = js.undefined,
        MasterUsername: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
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
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): DBCluster = {
      val __obj = js.Dynamic.literal()
      ActivityStreamKinesisStreamName.foreach(__v =>
        __obj.updateDynamic("ActivityStreamKinesisStreamName")(__v.asInstanceOf[js.Any])
      )
      ActivityStreamKmsKeyId.foreach(__v => __obj.updateDynamic("ActivityStreamKmsKeyId")(__v.asInstanceOf[js.Any]))
      ActivityStreamMode.foreach(__v => __obj.updateDynamic("ActivityStreamMode")(__v.asInstanceOf[js.Any]))
      ActivityStreamStatus.foreach(__v => __obj.updateDynamic("ActivityStreamStatus")(__v.asInstanceOf[js.Any]))
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AssociatedRoles.foreach(__v => __obj.updateDynamic("AssociatedRoles")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BacktrackConsumedChangeRecords.foreach(__v =>
        __obj.updateDynamic("BacktrackConsumedChangeRecords")(__v.asInstanceOf[js.Any])
      )
      BacktrackWindow.foreach(__v => __obj.updateDynamic("BacktrackWindow")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      CloneGroupId.foreach(__v => __obj.updateDynamic("CloneGroupId")(__v.asInstanceOf[js.Any]))
      ClusterCreateTime.foreach(__v => __obj.updateDynamic("ClusterCreateTime")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      CrossAccountClone.foreach(__v => __obj.updateDynamic("CrossAccountClone")(__v.asInstanceOf[js.Any]))
      CustomEndpoints.foreach(__v => __obj.updateDynamic("CustomEndpoints")(__v.asInstanceOf[js.Any]))
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
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      DomainMemberships.foreach(__v => __obj.updateDynamic("DomainMemberships")(__v.asInstanceOf[js.Any]))
      EarliestBacktrackTime.foreach(__v => __obj.updateDynamic("EarliestBacktrackTime")(__v.asInstanceOf[js.Any]))
      EarliestRestorableTime.foreach(__v => __obj.updateDynamic("EarliestRestorableTime")(__v.asInstanceOf[js.Any]))
      EnabledCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnabledCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineMode.foreach(__v => __obj.updateDynamic("EngineMode")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      GlobalWriteForwardingRequested.foreach(__v =>
        __obj.updateDynamic("GlobalWriteForwardingRequested")(__v.asInstanceOf[js.Any])
      )
      GlobalWriteForwardingStatus.foreach(__v =>
        __obj.updateDynamic("GlobalWriteForwardingStatus")(__v.asInstanceOf[js.Any])
      )
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      HttpEndpointEnabled.foreach(__v => __obj.updateDynamic("HttpEndpointEnabled")(__v.asInstanceOf[js.Any]))
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
      ScalingConfigurationInfo.foreach(__v => __obj.updateDynamic("ScalingConfigurationInfo")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.updateDynamic("VpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBCluster]
    }
  }

  /**
    * This data type is used as a response element in the <code>DescribeDBClusterBacktracks</code> action.
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
    @inline
    def apply(
        BacktrackIdentifier: js.UndefOr[String] = js.undefined,
        BacktrackRequestCreationTime: js.UndefOr[TStamp] = js.undefined,
        BacktrackTo: js.UndefOr[TStamp] = js.undefined,
        BacktrackedFrom: js.UndefOr[TStamp] = js.undefined,
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DBClusterBacktrack = {
      val __obj = js.Dynamic.literal()
      BacktrackIdentifier.foreach(__v => __obj.updateDynamic("BacktrackIdentifier")(__v.asInstanceOf[js.Any]))
      BacktrackRequestCreationTime.foreach(__v =>
        __obj.updateDynamic("BacktrackRequestCreationTime")(__v.asInstanceOf[js.Any])
      )
      BacktrackTo.foreach(__v => __obj.updateDynamic("BacktrackTo")(__v.asInstanceOf[js.Any]))
      BacktrackedFrom.foreach(__v => __obj.updateDynamic("BacktrackedFrom")(__v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterBacktrack]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBClusterBacktracks</code> action.
    */
  @js.native
  trait DBClusterBacktrackMessage extends js.Object {
    var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterBacktrackMessage {
    @inline
    def apply(
        DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBClusterBacktrackMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterBacktracks.foreach(__v => __obj.updateDynamic("DBClusterBacktracks")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterBacktrackMessage]
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
    @inline
    def apply(
        CurrentCapacity: js.UndefOr[IntegerOptional] = js.undefined,
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        PendingCapacity: js.UndefOr[IntegerOptional] = js.undefined,
        SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        TimeoutAction: js.UndefOr[String] = js.undefined
    ): DBClusterCapacityInfo = {
      val __obj = js.Dynamic.literal()
      CurrentCapacity.foreach(__v => __obj.updateDynamic("CurrentCapacity")(__v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      PendingCapacity.foreach(__v => __obj.updateDynamic("PendingCapacity")(__v.asInstanceOf[js.Any]))
      SecondsBeforeTimeout.foreach(__v => __obj.updateDynamic("SecondsBeforeTimeout")(__v.asInstanceOf[js.Any]))
      TimeoutAction.foreach(__v => __obj.updateDynamic("TimeoutAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterCapacityInfo]
    }
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
    @inline
    def apply(
        CustomEndpointType: js.UndefOr[String] = js.undefined,
        DBClusterEndpointArn: js.UndefOr[String] = js.undefined,
        DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined,
        DBClusterEndpointResourceIdentifier: js.UndefOr[String] = js.undefined,
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        Endpoint: js.UndefOr[String] = js.undefined,
        EndpointType: js.UndefOr[String] = js.undefined,
        ExcludedMembers: js.UndefOr[StringList] = js.undefined,
        StaticMembers: js.UndefOr[StringList] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DBClusterEndpoint = {
      val __obj = js.Dynamic.literal()
      CustomEndpointType.foreach(__v => __obj.updateDynamic("CustomEndpointType")(__v.asInstanceOf[js.Any]))
      DBClusterEndpointArn.foreach(__v => __obj.updateDynamic("DBClusterEndpointArn")(__v.asInstanceOf[js.Any]))
      DBClusterEndpointIdentifier.foreach(__v =>
        __obj.updateDynamic("DBClusterEndpointIdentifier")(__v.asInstanceOf[js.Any])
      )
      DBClusterEndpointResourceIdentifier.foreach(__v =>
        __obj.updateDynamic("DBClusterEndpointResourceIdentifier")(__v.asInstanceOf[js.Any])
      )
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      ExcludedMembers.foreach(__v => __obj.updateDynamic("ExcludedMembers")(__v.asInstanceOf[js.Any]))
      StaticMembers.foreach(__v => __obj.updateDynamic("StaticMembers")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterEndpoint]
    }
  }

  @js.native
  trait DBClusterEndpointMessage extends js.Object {
    var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList]
    var Marker: js.UndefOr[String]
  }

  object DBClusterEndpointMessage {
    @inline
    def apply(
        DBClusterEndpoints: js.UndefOr[DBClusterEndpointList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBClusterEndpointMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterEndpoints.foreach(__v => __obj.updateDynamic("DBClusterEndpoints")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterEndpointMessage]
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

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBClusters</code> action.
    */
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
    * Contains the details of an Amazon RDS DB cluster parameter group.
    *  This data type is used as a response element in the <code>DescribeDBClusterParameterGroups</code> action.
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

  /**
    * Provides details about a DB cluster parameter group including the parameters in the DB cluster parameter group.
    */
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

  /**
    * <p/>
    */
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

  /**
    * <p/>
    */
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
    var FeatureName: js.UndefOr[String]
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBClusterRole {
    @inline
    def apply(
        FeatureName: js.UndefOr[String] = js.undefined,
        RoleArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DBClusterRole = {
      val __obj = js.Dynamic.literal()
      FeatureName.foreach(__v => __obj.updateDynamic("FeatureName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBClusterRole]
    }
  }

  /**
    * Contains the details for an Amazon RDS DB cluster snapshot
    *  This data type is used as a response element in the <code>DescribeDBClusterSnapshots</code> action.
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
    *  Manual DB cluster snapshot attributes are used to authorize other AWS accounts to restore a manual DB cluster snapshot. For more information, see the <code>ModifyDBClusterSnapshotAttribute</code> API action.
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
    * Contains the results of a successful call to the <code>DescribeDBClusterSnapshotAttributes</code> API action.
    *  Manual DB cluster snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB cluster snapshot. For more information, see the <code>ModifyDBClusterSnapshotAttribute</code> API action.
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

  /**
    * Provides a list of DB cluster snapshots for the user as the result of a call to the <code>DescribeDBClusterSnapshots</code> action.
    */
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
    * This data type is used as a response element in the action <code>DescribeDBEngineVersions</code>.
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
    var Status: js.UndefOr[String]
    var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList]
    var SupportedEngineModes: js.UndefOr[EngineModeList]
    var SupportedFeatureNames: js.UndefOr[FeatureNameList]
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
        Status: js.UndefOr[String] = js.undefined,
        SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined,
        SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined,
        SupportedFeatureNames: js.UndefOr[FeatureNameList] = js.undefined,
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
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SupportedCharacterSets.foreach(__v => __obj.updateDynamic("SupportedCharacterSets")(__v.asInstanceOf[js.Any]))
      SupportedEngineModes.foreach(__v => __obj.updateDynamic("SupportedEngineModes")(__v.asInstanceOf[js.Any]))
      SupportedFeatureNames.foreach(__v => __obj.updateDynamic("SupportedFeatureNames")(__v.asInstanceOf[js.Any]))
      SupportedTimezones.foreach(__v => __obj.updateDynamic("SupportedTimezones")(__v.asInstanceOf[js.Any]))
      SupportsLogExportsToCloudwatchLogs.foreach(__v =>
        __obj.updateDynamic("SupportsLogExportsToCloudwatchLogs")(__v.asInstanceOf[js.Any])
      )
      SupportsReadReplica.foreach(__v => __obj.updateDynamic("SupportsReadReplica")(__v.asInstanceOf[js.Any]))
      ValidUpgradeTarget.foreach(__v => __obj.updateDynamic("ValidUpgradeTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBEngineVersion]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBEngineVersions</code> action.
    */
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
    * Contains the details of an Amazon RDS DB instance.
    *  This data type is used as a response element in the <code>DescribeDBInstances</code> action.
    */
  @js.native
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

  object DBInstance {
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
        AssociatedRoles: js.UndefOr[DBInstanceRoles] = js.undefined,
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
        MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
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
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): DBInstance = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AssociatedRoles.foreach(__v => __obj.updateDynamic("AssociatedRoles")(__v.asInstanceOf[js.Any]))
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
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
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
      ListenerEndpoint.foreach(__v => __obj.updateDynamic("ListenerEndpoint")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      MaxAllocatedStorage.foreach(__v => __obj.updateDynamic("MaxAllocatedStorage")(__v.asInstanceOf[js.Any]))
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
      PerformanceInsightsRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
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
        VpcId: js.UndefOr[String] = js.undefined
    ): DBInstanceAutomatedBackup = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      DBInstanceArn.foreach(__v => __obj.updateDynamic("DBInstanceArn")(__v.asInstanceOf[js.Any]))
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DbiResourceId.foreach(__v => __obj.updateDynamic("DbiResourceId")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      IAMDatabaseAuthenticationEnabled.foreach(__v =>
        __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any])
      )
      InstanceCreateTime.foreach(__v => __obj.updateDynamic("InstanceCreateTime")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      RestoreWindow.foreach(__v => __obj.updateDynamic("RestoreWindow")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBInstanceAutomatedBackup]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBInstanceAutomatedBackups</code> action.
    */
  @js.native
  trait DBInstanceAutomatedBackupMessage extends js.Object {
    var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList]
    var Marker: js.UndefOr[String]
  }

  object DBInstanceAutomatedBackupMessage {
    @inline
    def apply(
        DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBInstanceAutomatedBackupMessage = {
      val __obj = js.Dynamic.literal()
      DBInstanceAutomatedBackups.foreach(__v =>
        __obj.updateDynamic("DBInstanceAutomatedBackups")(__v.asInstanceOf[js.Any])
      )
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBInstanceAutomatedBackupMessage]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBInstances</code> action.
    */
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
    * Describes an AWS Identity and Access Management (IAM) role that is associated with a DB instance.
    */
  @js.native
  trait DBInstanceRole extends js.Object {
    var FeatureName: js.UndefOr[String]
    var RoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object DBInstanceRole {
    @inline
    def apply(
        FeatureName: js.UndefOr[String] = js.undefined,
        RoleArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DBInstanceRole = {
      val __obj = js.Dynamic.literal()
      FeatureName.foreach(__v => __obj.updateDynamic("FeatureName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBInstanceRole]
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
    * Contains the details of an Amazon RDS DB parameter group.
    *  This data type is used as a response element in the <code>DescribeDBParameterGroups</code> action.
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

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBParameters</code> action.
    */
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

  /**
    * Contains the result of a successful invocation of the <code>ModifyDBParameterGroup</code> or <code>ResetDBParameterGroup</code> action.
    */
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
    * * <code>CreateDBInstance</code>
    *  * <code>CreateDBInstanceReadReplica</code>
    *  * <code>DeleteDBInstance</code>
    *  * <code>ModifyDBInstance</code>
    *  * <code>RebootDBInstance</code>
    *  * <code>RestoreDBInstanceFromDBSnapshot</code>
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

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBParameterGroups</code> action.
    */
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
    * The data structure representing a proxy managed by the RDS Proxy.
    *  This data type is used as a response element in the <code>DescribeDBProxies</code> action.
    */
  @js.native
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

  object DBProxy {
    @inline
    def apply(
        Auth: js.UndefOr[UserAuthConfigInfoList] = js.undefined,
        CreatedDate: js.UndefOr[TStamp] = js.undefined,
        DBProxyArn: js.UndefOr[String] = js.undefined,
        DBProxyName: js.UndefOr[String] = js.undefined,
        DebugLogging: js.UndefOr[Boolean] = js.undefined,
        Endpoint: js.UndefOr[String] = js.undefined,
        EngineFamily: js.UndefOr[String] = js.undefined,
        IdleClientTimeout: js.UndefOr[Int] = js.undefined,
        RequireTLS: js.UndefOr[Boolean] = js.undefined,
        RoleArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[DBProxyStatus] = js.undefined,
        UpdatedDate: js.UndefOr[TStamp] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        VpcSubnetIds: js.UndefOr[StringList] = js.undefined
    ): DBProxy = {
      val __obj = js.Dynamic.literal()
      Auth.foreach(__v => __obj.updateDynamic("Auth")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DBProxyArn.foreach(__v => __obj.updateDynamic("DBProxyArn")(__v.asInstanceOf[js.Any]))
      DBProxyName.foreach(__v => __obj.updateDynamic("DBProxyName")(__v.asInstanceOf[js.Any]))
      DebugLogging.foreach(__v => __obj.updateDynamic("DebugLogging")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      EngineFamily.foreach(__v => __obj.updateDynamic("EngineFamily")(__v.asInstanceOf[js.Any]))
      IdleClientTimeout.foreach(__v => __obj.updateDynamic("IdleClientTimeout")(__v.asInstanceOf[js.Any]))
      RequireTLS.foreach(__v => __obj.updateDynamic("RequireTLS")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedDate.foreach(__v => __obj.updateDynamic("UpdatedDate")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      VpcSubnetIds.foreach(__v => __obj.updateDynamic("VpcSubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBProxy]
    }
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
    val suspended                      = "suspended".asInstanceOf[DBProxyStatus]
    val suspending                     = "suspending".asInstanceOf[DBProxyStatus]
    val reactivating                   = "reactivating".asInstanceOf[DBProxyStatus]

    val values = js.Object.freeze(
      js.Array(
        available,
        modifying,
        `incompatible-network`,
        `insufficient-resource-limits`,
        creating,
        deleting,
        suspended,
        suspending,
        reactivating
      )
    )
  }

  /**
    * Contains the details for an RDS Proxy target. It represents an RDS DB instance or Aurora DB cluster that the proxy can connect to. One or more targets are associated with an RDS Proxy target group.
    *  This data type is used as a response element in the <code>DescribeDBProxyTargets</code> action.
    */
  @js.native
  trait DBProxyTarget extends js.Object {
    var Endpoint: js.UndefOr[String]
    var Port: js.UndefOr[Int]
    var RdsResourceId: js.UndefOr[String]
    var TargetArn: js.UndefOr[String]
    var TargetHealth: js.UndefOr[TargetHealth]
    var TrackedClusterId: js.UndefOr[String]
    var Type: js.UndefOr[TargetType]
  }

  object DBProxyTarget {
    @inline
    def apply(
        Endpoint: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined,
        RdsResourceId: js.UndefOr[String] = js.undefined,
        TargetArn: js.UndefOr[String] = js.undefined,
        TargetHealth: js.UndefOr[TargetHealth] = js.undefined,
        TrackedClusterId: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[TargetType] = js.undefined
    ): DBProxyTarget = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RdsResourceId.foreach(__v => __obj.updateDynamic("RdsResourceId")(__v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      TargetHealth.foreach(__v => __obj.updateDynamic("TargetHealth")(__v.asInstanceOf[js.Any]))
      TrackedClusterId.foreach(__v => __obj.updateDynamic("TrackedClusterId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBProxyTarget]
    }
  }

  /**
    * Represents a set of RDS DB instances, Aurora DB clusters, or both that a proxy can connect to. Currently, each target group is associated with exactly one RDS DB instance or Aurora DB cluster.
    *  This data type is used as a response element in the <code>DescribeDBProxyTargetGroups</code> action.
    */
  @js.native
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

  object DBProxyTargetGroup {
    @inline
    def apply(
        ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfigurationInfo] = js.undefined,
        CreatedDate: js.UndefOr[TStamp] = js.undefined,
        DBProxyName: js.UndefOr[String] = js.undefined,
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TargetGroupArn: js.UndefOr[String] = js.undefined,
        TargetGroupName: js.UndefOr[String] = js.undefined,
        UpdatedDate: js.UndefOr[TStamp] = js.undefined
    ): DBProxyTargetGroup = {
      val __obj = js.Dynamic.literal()
      ConnectionPoolConfig.foreach(__v => __obj.updateDynamic("ConnectionPoolConfig")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DBProxyName.foreach(__v => __obj.updateDynamic("DBProxyName")(__v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetGroupArn.foreach(__v => __obj.updateDynamic("TargetGroupArn")(__v.asInstanceOf[js.Any]))
      TargetGroupName.foreach(__v => __obj.updateDynamic("TargetGroupName")(__v.asInstanceOf[js.Any]))
      UpdatedDate.foreach(__v => __obj.updateDynamic("UpdatedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBProxyTargetGroup]
    }
  }

  /**
    * Contains the details for an Amazon RDS DB security group.
    *  This data type is used as a response element in the <code>DescribeDBSecurityGroups</code> action.
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
    @inline
    def apply(
        DBSecurityGroupArn: js.UndefOr[String] = js.undefined,
        DBSecurityGroupDescription: js.UndefOr[String] = js.undefined,
        DBSecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
        IPRanges: js.UndefOr[IPRangeList] = js.undefined,
        OwnerId: js.UndefOr[String] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): DBSecurityGroup = {
      val __obj = js.Dynamic.literal()
      DBSecurityGroupArn.foreach(__v => __obj.updateDynamic("DBSecurityGroupArn")(__v.asInstanceOf[js.Any]))
      DBSecurityGroupDescription.foreach(__v =>
        __obj.updateDynamic("DBSecurityGroupDescription")(__v.asInstanceOf[js.Any])
      )
      DBSecurityGroupName.foreach(__v => __obj.updateDynamic("DBSecurityGroupName")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroups.foreach(__v => __obj.updateDynamic("EC2SecurityGroups")(__v.asInstanceOf[js.Any]))
      IPRanges.foreach(__v => __obj.updateDynamic("IPRanges")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSecurityGroup]
    }
  }

  /**
    * This data type is used as a response element in the following actions:
    * * <code>ModifyDBInstance</code>
    *  * <code>RebootDBInstance</code>
    *  * <code>RestoreDBInstanceFromDBSnapshot</code>
    *  * <code>RestoreDBInstanceToPointInTime</code>
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
    * Contains the result of a successful invocation of the <code>DescribeDBSecurityGroups</code> action.
    */
  @js.native
  trait DBSecurityGroupMessage extends js.Object {
    var DBSecurityGroups: js.UndefOr[DBSecurityGroups]
    var Marker: js.UndefOr[String]
  }

  object DBSecurityGroupMessage {
    @inline
    def apply(
        DBSecurityGroups: js.UndefOr[DBSecurityGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBSecurityGroupMessage = {
      val __obj = js.Dynamic.literal()
      DBSecurityGroups.foreach(__v => __obj.updateDynamic("DBSecurityGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSecurityGroupMessage]
    }
  }

  /**
    * Contains the details of an Amazon RDS DB snapshot.
    *  This data type is used as a response element in the <code>DescribeDBSnapshots</code> action.
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
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
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
        VpcId: js.UndefOr[String] = js.undefined
    ): DBSnapshot = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DBSnapshotArn.foreach(__v => __obj.updateDynamic("DBSnapshotArn")(__v.asInstanceOf[js.Any]))
      DBSnapshotIdentifier.foreach(__v => __obj.updateDynamic("DBSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      DbiResourceId.foreach(__v => __obj.updateDynamic("DbiResourceId")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      IAMDatabaseAuthenticationEnabled.foreach(__v =>
        __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any])
      )
      InstanceCreateTime.foreach(__v => __obj.updateDynamic("InstanceCreateTime")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      PercentProgress.foreach(__v => __obj.updateDynamic("PercentProgress")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      SnapshotCreateTime.foreach(__v => __obj.updateDynamic("SnapshotCreateTime")(__v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.updateDynamic("SnapshotType")(__v.asInstanceOf[js.Any]))
      SourceDBSnapshotIdentifier.foreach(__v =>
        __obj.updateDynamic("SourceDBSnapshotIdentifier")(__v.asInstanceOf[js.Any])
      )
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSnapshot]
    }
  }

  /**
    * Contains the name and values of a manual DB snapshot attribute
    *  Manual DB snapshot attributes are used to authorize other AWS accounts to restore a manual DB snapshot. For more information, see the <code>ModifyDBSnapshotAttribute</code> API.
    */
  @js.native
  trait DBSnapshotAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  object DBSnapshotAttribute {
    @inline
    def apply(
        AttributeName: js.UndefOr[String] = js.undefined,
        AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
    ): DBSnapshotAttribute = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      AttributeValues.foreach(__v => __obj.updateDynamic("AttributeValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSnapshotAttribute]
    }
  }

  /**
    * Contains the results of a successful call to the <code>DescribeDBSnapshotAttributes</code> API action.
    *  Manual DB snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB snapshot. For more information, see the <code>ModifyDBSnapshotAttribute</code> API action.
    */
  @js.native
  trait DBSnapshotAttributesResult extends js.Object {
    var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList]
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  object DBSnapshotAttributesResult {
    @inline
    def apply(
        DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList] = js.undefined,
        DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DBSnapshotAttributesResult = {
      val __obj = js.Dynamic.literal()
      DBSnapshotAttributes.foreach(__v => __obj.updateDynamic("DBSnapshotAttributes")(__v.asInstanceOf[js.Any]))
      DBSnapshotIdentifier.foreach(__v => __obj.updateDynamic("DBSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSnapshotAttributesResult]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBSnapshots</code> action.
    */
  @js.native
  trait DBSnapshotMessage extends js.Object {
    var DBSnapshots: js.UndefOr[DBSnapshotList]
    var Marker: js.UndefOr[String]
  }

  object DBSnapshotMessage {
    @inline
    def apply(
        DBSnapshots: js.UndefOr[DBSnapshotList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DBSnapshotMessage = {
      val __obj = js.Dynamic.literal()
      DBSnapshots.foreach(__v => __obj.updateDynamic("DBSnapshots")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DBSnapshotMessage]
    }
  }

  /**
    * Contains the details of an Amazon RDS DB subnet group.
    *  This data type is used as a response element in the <code>DescribeDBSubnetGroups</code> action.
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

  /**
    * Contains the result of a successful invocation of the <code>DescribeDBSubnetGroups</code> action.
    */
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
  trait DeleteCustomAvailabilityZoneMessage extends js.Object {
    var CustomAvailabilityZoneId: String
  }

  object DeleteCustomAvailabilityZoneMessage {
    @inline
    def apply(
        CustomAvailabilityZoneId: String
    ): DeleteCustomAvailabilityZoneMessage = {
      val __obj = js.Dynamic.literal(
        "CustomAvailabilityZoneId" -> CustomAvailabilityZoneId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCustomAvailabilityZoneMessage]
    }
  }

  @js.native
  trait DeleteCustomAvailabilityZoneResult extends js.Object {
    var CustomAvailabilityZone: js.UndefOr[CustomAvailabilityZone]
  }

  object DeleteCustomAvailabilityZoneResult {
    @inline
    def apply(
        CustomAvailabilityZone: js.UndefOr[CustomAvailabilityZone] = js.undefined
    ): DeleteCustomAvailabilityZoneResult = {
      val __obj = js.Dynamic.literal()
      CustomAvailabilityZone.foreach(__v => __obj.updateDynamic("CustomAvailabilityZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCustomAvailabilityZoneResult]
    }
  }

  @js.native
  trait DeleteDBClusterEndpointMessage extends js.Object {
    var DBClusterEndpointIdentifier: String
  }

  object DeleteDBClusterEndpointMessage {
    @inline
    def apply(
        DBClusterEndpointIdentifier: String
    ): DeleteDBClusterEndpointMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBClusterEndpointMessage]
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

  /**
    * <p/>
    */
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

  /**
    * <p/>
    */
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

  /**
    * Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation.
    */
  @js.native
  trait DeleteDBInstanceAutomatedBackupMessage extends js.Object {
    var DbiResourceId: String
  }

  object DeleteDBInstanceAutomatedBackupMessage {
    @inline
    def apply(
        DbiResourceId: String
    ): DeleteDBInstanceAutomatedBackupMessage = {
      val __obj = js.Dynamic.literal(
        "DbiResourceId" -> DbiResourceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupMessage]
    }
  }

  @js.native
  trait DeleteDBInstanceAutomatedBackupResult extends js.Object {
    var DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup]
  }

  object DeleteDBInstanceAutomatedBackupResult {
    @inline
    def apply(
        DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup] = js.undefined
    ): DeleteDBInstanceAutomatedBackupResult = {
      val __obj = js.Dynamic.literal()
      DBInstanceAutomatedBackup.foreach(__v =>
        __obj.updateDynamic("DBInstanceAutomatedBackup")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupResult]
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
    @inline
    def apply(
        DBInstanceIdentifier: String,
        DeleteAutomatedBackups: js.UndefOr[BooleanOptional] = js.undefined,
        FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
    ): DeleteDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      DeleteAutomatedBackups.foreach(__v => __obj.updateDynamic("DeleteAutomatedBackups")(__v.asInstanceOf[js.Any]))
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

  /**
    * <p/>
    */
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
  trait DeleteDBProxyRequest extends js.Object {
    var DBProxyName: String
  }

  object DeleteDBProxyRequest {
    @inline
    def apply(
        DBProxyName: String
    ): DeleteDBProxyRequest = {
      val __obj = js.Dynamic.literal(
        "DBProxyName" -> DBProxyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBProxyRequest]
    }
  }

  @js.native
  trait DeleteDBProxyResponse extends js.Object {
    var DBProxy: js.UndefOr[DBProxy]
  }

  object DeleteDBProxyResponse {
    @inline
    def apply(
        DBProxy: js.UndefOr[DBProxy] = js.undefined
    ): DeleteDBProxyResponse = {
      val __obj = js.Dynamic.literal()
      DBProxy.foreach(__v => __obj.updateDynamic("DBProxy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBProxyResponse]
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
    @inline
    def apply(
        DBSecurityGroupName: String
    ): DeleteDBSecurityGroupMessage = {
      val __obj = js.Dynamic.literal(
        "DBSecurityGroupName" -> DBSecurityGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBSecurityGroupMessage]
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
    @inline
    def apply(
        DBSnapshotIdentifier: String
    ): DeleteDBSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDBSnapshotMessage]
    }
  }

  @js.native
  trait DeleteDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object DeleteDBSnapshotResult {
    @inline
    def apply(
        DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
    ): DeleteDBSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBSnapshot.foreach(__v => __obj.updateDynamic("DBSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDBSnapshotResult]
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

  /**
    * <p/>
    */
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
  trait DeleteGlobalClusterMessage extends js.Object {
    var GlobalClusterIdentifier: String
  }

  object DeleteGlobalClusterMessage {
    @inline
    def apply(
        GlobalClusterIdentifier: String
    ): DeleteGlobalClusterMessage = {
      val __obj = js.Dynamic.literal(
        "GlobalClusterIdentifier" -> GlobalClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGlobalClusterMessage]
    }
  }

  @js.native
  trait DeleteGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  object DeleteGlobalClusterResult {
    @inline
    def apply(
        GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
    ): DeleteGlobalClusterResult = {
      val __obj = js.Dynamic.literal()
      GlobalCluster.foreach(__v => __obj.updateDynamic("GlobalCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGlobalClusterResult]
    }
  }

  @js.native
  trait DeleteInstallationMediaMessage extends js.Object {
    var InstallationMediaId: String
  }

  object DeleteInstallationMediaMessage {
    @inline
    def apply(
        InstallationMediaId: String
    ): DeleteInstallationMediaMessage = {
      val __obj = js.Dynamic.literal(
        "InstallationMediaId" -> InstallationMediaId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInstallationMediaMessage]
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
    @inline
    def apply(
        OptionGroupName: String
    ): DeleteOptionGroupMessage = {
      val __obj = js.Dynamic.literal(
        "OptionGroupName" -> OptionGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteOptionGroupMessage]
    }
  }

  @js.native
  trait DeregisterDBProxyTargetsRequest extends js.Object {
    var DBProxyName: String
    var DBClusterIdentifiers: js.UndefOr[StringList]
    var DBInstanceIdentifiers: js.UndefOr[StringList]
    var TargetGroupName: js.UndefOr[String]
  }

  object DeregisterDBProxyTargetsRequest {
    @inline
    def apply(
        DBProxyName: String,
        DBClusterIdentifiers: js.UndefOr[StringList] = js.undefined,
        DBInstanceIdentifiers: js.UndefOr[StringList] = js.undefined,
        TargetGroupName: js.UndefOr[String] = js.undefined
    ): DeregisterDBProxyTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "DBProxyName" -> DBProxyName.asInstanceOf[js.Any]
      )

      DBClusterIdentifiers.foreach(__v => __obj.updateDynamic("DBClusterIdentifiers")(__v.asInstanceOf[js.Any]))
      DBInstanceIdentifiers.foreach(__v => __obj.updateDynamic("DBInstanceIdentifiers")(__v.asInstanceOf[js.Any]))
      TargetGroupName.foreach(__v => __obj.updateDynamic("TargetGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterDBProxyTargetsRequest]
    }
  }

  @js.native
  trait DeregisterDBProxyTargetsResponse extends js.Object {}

  object DeregisterDBProxyTargetsResponse {
    @inline
    def apply(
    ): DeregisterDBProxyTargetsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeregisterDBProxyTargetsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {}

  object DescribeAccountAttributesMessage {
    @inline
    def apply(
    ): DescribeAccountAttributesMessage = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeAccountAttributesMessage]
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
    @inline
    def apply(
        CertificateIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCertificatesMessage = {
      val __obj = js.Dynamic.literal()
      CertificateIdentifier.foreach(__v => __obj.updateDynamic("CertificateIdentifier")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificatesMessage]
    }
  }

  @js.native
  trait DescribeCustomAvailabilityZonesMessage extends js.Object {
    var CustomAvailabilityZoneId: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeCustomAvailabilityZonesMessage {
    @inline
    def apply(
        CustomAvailabilityZoneId: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCustomAvailabilityZonesMessage = {
      val __obj = js.Dynamic.literal()
      CustomAvailabilityZoneId.foreach(__v => __obj.updateDynamic("CustomAvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCustomAvailabilityZonesMessage]
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
    @inline
    def apply(
        DBClusterIdentifier: String,
        BacktrackIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBClusterBacktracksMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      BacktrackIdentifier.foreach(__v => __obj.updateDynamic("BacktrackIdentifier")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClusterBacktracksMessage]
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
    @inline
    def apply(
        DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined,
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBClusterEndpointsMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterEndpointIdentifier.foreach(__v =>
        __obj.updateDynamic("DBClusterEndpointIdentifier")(__v.asInstanceOf[js.Any])
      )
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBClusterEndpointsMessage]
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

  /**
    * <p/>
    */
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

  /**
    * <p/>
    */
  @js.native
  trait DescribeDBClustersMessage extends js.Object {
    var DBClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var IncludeShared: js.UndefOr[Boolean]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDBClustersMessage {
    @inline
    def apply(
        DBClusterIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        IncludeShared: js.UndefOr[Boolean] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBClustersMessage = {
      val __obj = js.Dynamic.literal()
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      IncludeShared.foreach(__v => __obj.updateDynamic("IncludeShared")(__v.asInstanceOf[js.Any]))
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
    var IncludeAll: js.UndefOr[BooleanOptional]
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
        IncludeAll: js.UndefOr[BooleanOptional] = js.undefined,
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
      IncludeAll.foreach(__v => __obj.updateDynamic("IncludeAll")(__v.asInstanceOf[js.Any]))
      ListSupportedCharacterSets.foreach(__v =>
        __obj.updateDynamic("ListSupportedCharacterSets")(__v.asInstanceOf[js.Any])
      )
      ListSupportedTimezones.foreach(__v => __obj.updateDynamic("ListSupportedTimezones")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBEngineVersionsMessage]
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
    @inline
    def apply(
        DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        DbiResourceId: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBInstanceAutomatedBackupsMessage = {
      val __obj = js.Dynamic.literal()
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DbiResourceId.foreach(__v => __obj.updateDynamic("DbiResourceId")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBInstanceAutomatedBackupsMessage]
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

  /**
    * This data type is used as a response element to <code>DescribeDBLogFiles</code>.
    */
  @js.native
  trait DescribeDBLogFilesDetails extends js.Object {
    var LastWritten: js.UndefOr[Double]
    var LogFileName: js.UndefOr[String]
    var Size: js.UndefOr[Double]
  }

  object DescribeDBLogFilesDetails {
    @inline
    def apply(
        LastWritten: js.UndefOr[Double] = js.undefined,
        LogFileName: js.UndefOr[String] = js.undefined,
        Size: js.UndefOr[Double] = js.undefined
    ): DescribeDBLogFilesDetails = {
      val __obj = js.Dynamic.literal()
      LastWritten.foreach(__v => __obj.updateDynamic("LastWritten")(__v.asInstanceOf[js.Any]))
      LogFileName.foreach(__v => __obj.updateDynamic("LogFileName")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBLogFilesDetails]
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
    @inline
    def apply(
        DBInstanceIdentifier: String,
        FileLastWritten: js.UndefOr[Double] = js.undefined,
        FileSize: js.UndefOr[Double] = js.undefined,
        FilenameContains: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBLogFilesMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      FileLastWritten.foreach(__v => __obj.updateDynamic("FileLastWritten")(__v.asInstanceOf[js.Any]))
      FileSize.foreach(__v => __obj.updateDynamic("FileSize")(__v.asInstanceOf[js.Any]))
      FilenameContains.foreach(__v => __obj.updateDynamic("FilenameContains")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBLogFilesMessage]
    }
  }

  /**
    * The response from a call to <code>DescribeDBLogFiles</code>.
    */
  @js.native
  trait DescribeDBLogFilesResponse extends js.Object {
    var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBLogFilesResponse {
    @inline
    def apply(
        DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBLogFilesResponse = {
      val __obj = js.Dynamic.literal()
      DescribeDBLogFiles.foreach(__v => __obj.updateDynamic("DescribeDBLogFiles")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBLogFilesResponse]
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
  trait DescribeDBProxiesRequest extends js.Object {
    var DBProxyName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[MaxRecords]
  }

  object DescribeDBProxiesRequest {
    @inline
    def apply(
        DBProxyName: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    ): DescribeDBProxiesRequest = {
      val __obj = js.Dynamic.literal()
      DBProxyName.foreach(__v => __obj.updateDynamic("DBProxyName")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBProxiesRequest]
    }
  }

  @js.native
  trait DescribeDBProxiesResponse extends js.Object {
    var DBProxies: js.UndefOr[DBProxyList]
    var Marker: js.UndefOr[String]
  }

  object DescribeDBProxiesResponse {
    @inline
    def apply(
        DBProxies: js.UndefOr[DBProxyList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBProxiesResponse = {
      val __obj = js.Dynamic.literal()
      DBProxies.foreach(__v => __obj.updateDynamic("DBProxies")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBProxiesResponse]
    }
  }

  @js.native
  trait DescribeDBProxyTargetGroupsRequest extends js.Object {
    var DBProxyName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[MaxRecords]
    var TargetGroupName: js.UndefOr[String]
  }

  object DescribeDBProxyTargetGroupsRequest {
    @inline
    def apply(
        DBProxyName: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        TargetGroupName: js.UndefOr[String] = js.undefined
    ): DescribeDBProxyTargetGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "DBProxyName" -> DBProxyName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      TargetGroupName.foreach(__v => __obj.updateDynamic("TargetGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBProxyTargetGroupsRequest]
    }
  }

  @js.native
  trait DescribeDBProxyTargetGroupsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var TargetGroups: js.UndefOr[TargetGroupList]
  }

  object DescribeDBProxyTargetGroupsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        TargetGroups: js.UndefOr[TargetGroupList] = js.undefined
    ): DescribeDBProxyTargetGroupsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      TargetGroups.foreach(__v => __obj.updateDynamic("TargetGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBProxyTargetGroupsResponse]
    }
  }

  @js.native
  trait DescribeDBProxyTargetsRequest extends js.Object {
    var DBProxyName: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[MaxRecords]
    var TargetGroupName: js.UndefOr[String]
  }

  object DescribeDBProxyTargetsRequest {
    @inline
    def apply(
        DBProxyName: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        TargetGroupName: js.UndefOr[String] = js.undefined
    ): DescribeDBProxyTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "DBProxyName" -> DBProxyName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      TargetGroupName.foreach(__v => __obj.updateDynamic("TargetGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBProxyTargetsRequest]
    }
  }

  @js.native
  trait DescribeDBProxyTargetsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Targets: js.UndefOr[TargetList]
  }

  object DescribeDBProxyTargetsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Targets: js.UndefOr[TargetList] = js.undefined
    ): DescribeDBProxyTargetsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBProxyTargetsResponse]
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
    @inline
    def apply(
        DBSecurityGroupName: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDBSecurityGroupsMessage = {
      val __obj = js.Dynamic.literal()
      DBSecurityGroupName.foreach(__v => __obj.updateDynamic("DBSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBSecurityGroupsMessage]
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
    @inline
    def apply(
        DBSnapshotIdentifier: String
    ): DescribeDBSnapshotAttributesMessage = {
      val __obj = js.Dynamic.literal(
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDBSnapshotAttributesMessage]
    }
  }

  @js.native
  trait DescribeDBSnapshotAttributesResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult]
  }

  object DescribeDBSnapshotAttributesResult {
    @inline
    def apply(
        DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined
    ): DescribeDBSnapshotAttributesResult = {
      val __obj = js.Dynamic.literal()
      DBSnapshotAttributesResult.foreach(__v =>
        __obj.updateDynamic("DBSnapshotAttributesResult")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeDBSnapshotAttributesResult]
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
    @inline
    def apply(
        DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
        DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        DbiResourceId: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        IncludePublic: js.UndefOr[Boolean] = js.undefined,
        IncludeShared: js.UndefOr[Boolean] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotType: js.UndefOr[String] = js.undefined
    ): DescribeDBSnapshotsMessage = {
      val __obj = js.Dynamic.literal()
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DBSnapshotIdentifier.foreach(__v => __obj.updateDynamic("DBSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      DbiResourceId.foreach(__v => __obj.updateDynamic("DbiResourceId")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      IncludePublic.foreach(__v => __obj.updateDynamic("IncludePublic")(__v.asInstanceOf[js.Any]))
      IncludeShared.foreach(__v => __obj.updateDynamic("IncludeShared")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.updateDynamic("SnapshotType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDBSnapshotsMessage]
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

  /**
    * <p/>
    */
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
  trait DescribeExportTasksMessage extends js.Object {
    var ExportTaskIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[MaxRecords]
    var SourceArn: js.UndefOr[String]
  }

  object DescribeExportTasksMessage {
    @inline
    def apply(
        ExportTaskIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        SourceArn: js.UndefOr[String] = js.undefined
    ): DescribeExportTasksMessage = {
      val __obj = js.Dynamic.literal()
      ExportTaskIdentifier.foreach(__v => __obj.updateDynamic("ExportTaskIdentifier")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExportTasksMessage]
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
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeGlobalClustersMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      GlobalClusterIdentifier.foreach(__v => __obj.updateDynamic("GlobalClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGlobalClustersMessage]
    }
  }

  @js.native
  trait DescribeInstallationMediaMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var InstallationMediaId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeInstallationMediaMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        InstallationMediaId: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeInstallationMediaMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      InstallationMediaId.foreach(__v => __obj.updateDynamic("InstallationMediaId")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstallationMediaMessage]
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
    @inline
    def apply(
        EngineName: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        MajorEngineVersion: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeOptionGroupOptionsMessage = {
      val __obj = js.Dynamic.literal(
        "EngineName" -> EngineName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MajorEngineVersion.foreach(__v => __obj.updateDynamic("MajorEngineVersion")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOptionGroupOptionsMessage]
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
    @inline
    def apply(
        EngineName: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        MajorEngineVersion: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined
    ): DescribeOptionGroupsMessage = {
      val __obj = js.Dynamic.literal()
      EngineName.foreach(__v => __obj.updateDynamic("EngineName")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MajorEngineVersion.foreach(__v => __obj.updateDynamic("MajorEngineVersion")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOptionGroupsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeOrderableDBInstanceOptionsMessage extends js.Object {
    var Engine: String
    var AvailabilityZoneGroup: js.UndefOr[String]
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
        AvailabilityZoneGroup: js.UndefOr[String] = js.undefined,
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

      AvailabilityZoneGroup.foreach(__v => __obj.updateDynamic("AvailabilityZoneGroup")(__v.asInstanceOf[js.Any]))
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

  /**
    * <p/>
    */
  @js.native
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

  object DescribeReservedDBInstancesMessage {
    @inline
    def apply(
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        LeaseId: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
        ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
    ): DescribeReservedDBInstancesMessage = {
      val __obj = js.Dynamic.literal()
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      LeaseId.foreach(__v => __obj.updateDynamic("LeaseId")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      ReservedDBInstanceId.foreach(__v => __obj.updateDynamic("ReservedDBInstanceId")(__v.asInstanceOf[js.Any]))
      ReservedDBInstancesOfferingId.foreach(__v =>
        __obj.updateDynamic("ReservedDBInstancesOfferingId")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedDBInstancesMessage]
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
    @inline
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
      val __obj = js.Dynamic.literal()
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      ReservedDBInstancesOfferingId.foreach(__v =>
        __obj.updateDynamic("ReservedDBInstancesOfferingId")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedDBInstancesOfferingsMessage]
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
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        RegionName: js.UndefOr[String] = js.undefined
    ): DescribeSourceRegionsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      RegionName.foreach(__v => __obj.updateDynamic("RegionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSourceRegionsMessage]
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
    * An Active Directory Domain membership record associated with the DB instance or cluster.
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
    * This data type is used as a response element to <code>DownloadDBLogFilePortion</code>.
    */
  @js.native
  trait DownloadDBLogFilePortionDetails extends js.Object {
    var AdditionalDataPending: js.UndefOr[Boolean]
    var LogFileData: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DownloadDBLogFilePortionDetails {
    @inline
    def apply(
        AdditionalDataPending: js.UndefOr[Boolean] = js.undefined,
        LogFileData: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DownloadDBLogFilePortionDetails = {
      val __obj = js.Dynamic.literal()
      AdditionalDataPending.foreach(__v => __obj.updateDynamic("AdditionalDataPending")(__v.asInstanceOf[js.Any]))
      LogFileData.foreach(__v => __obj.updateDynamic("LogFileData")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DownloadDBLogFilePortionDetails]
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
    @inline
    def apply(
        DBInstanceIdentifier: String,
        LogFileName: String,
        Marker: js.UndefOr[String] = js.undefined,
        NumberOfLines: js.UndefOr[Int] = js.undefined
    ): DownloadDBLogFilePortionMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "LogFileName"          -> LogFileName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      NumberOfLines.foreach(__v => __obj.updateDynamic("NumberOfLines")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DownloadDBLogFilePortionMessage]
    }
  }

  /**
    * This data type is used as a response element in the following actions:
    * * <code>AuthorizeDBSecurityGroupIngress</code>
    *  * <code>DescribeDBSecurityGroups</code>
    *  * <code>RevokeDBSecurityGroupIngress</code>
    */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var EC2SecurityGroupId: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object EC2SecurityGroup {
    @inline
    def apply(
        EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): EC2SecurityGroup = {
      val __obj = js.Dynamic.literal()
      EC2SecurityGroupId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupId")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupName.foreach(__v => __obj.updateDynamic("EC2SecurityGroupName")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupOwnerId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupOwnerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
    * This data type represents the information you need to connect to an Amazon RDS DB instance. This data type is used as a response element in the following actions:
    * * <code>CreateDBInstance</code>
    *  * <code>DescribeDBInstances</code>
    *  * <code>DeleteDBInstance</code>
    * For the data structure that represents Amazon Aurora DB cluster endpoints, see <code>DBClusterEndpoint</code>.
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
    * Contains the result of a successful invocation of the <code>DescribeEngineDefaultParameters</code> action.
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

  @js.native
  sealed trait EngineFamily extends js.Any
  object EngineFamily extends js.Object {
    val MYSQL      = "MYSQL".asInstanceOf[EngineFamily]
    val POSTGRESQL = "POSTGRESQL".asInstanceOf[EngineFamily]

    val values = js.Object.freeze(js.Array(MYSQL, POSTGRESQL))
  }

  /**
    * This data type is used as a response element in the <code>DescribeEvents</code> action.
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
    * Contains the results of a successful invocation of the <code>DescribeEventCategories</code> action.
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

  /**
    * Data returned from the ```DescribeEventCategories``` action.
    */
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
    * Contains the results of a successful invocation of the <code>DescribeEventSubscriptions</code> action.
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

  /**
    * Data returned by the ```DescribeEventSubscriptions``` action.
    */
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

  /**
    * Contains the result of a successful invocation of the <code>DescribeEvents</code> action.
    */
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

  /**
    * Contains the details of a snapshot export to Amazon S3.
    *  This data type is used as a response element in the <code>DescribeExportTasks</code> action.
    */
  @js.native
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

  object ExportTask {
    @inline
    def apply(
        ExportOnly: js.UndefOr[StringList] = js.undefined,
        ExportTaskIdentifier: js.UndefOr[String] = js.undefined,
        FailureCause: js.UndefOr[String] = js.undefined,
        IamRoleArn: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        PercentProgress: js.UndefOr[Int] = js.undefined,
        S3Bucket: js.UndefOr[String] = js.undefined,
        S3Prefix: js.UndefOr[String] = js.undefined,
        SnapshotTime: js.UndefOr[TStamp] = js.undefined,
        SourceArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TaskEndTime: js.UndefOr[TStamp] = js.undefined,
        TaskStartTime: js.UndefOr[TStamp] = js.undefined,
        TotalExtractedDataInGB: js.UndefOr[Int] = js.undefined,
        WarningMessage: js.UndefOr[String] = js.undefined
    ): ExportTask = {
      val __obj = js.Dynamic.literal()
      ExportOnly.foreach(__v => __obj.updateDynamic("ExportOnly")(__v.asInstanceOf[js.Any]))
      ExportTaskIdentifier.foreach(__v => __obj.updateDynamic("ExportTaskIdentifier")(__v.asInstanceOf[js.Any]))
      FailureCause.foreach(__v => __obj.updateDynamic("FailureCause")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      PercentProgress.foreach(__v => __obj.updateDynamic("PercentProgress")(__v.asInstanceOf[js.Any]))
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      S3Prefix.foreach(__v => __obj.updateDynamic("S3Prefix")(__v.asInstanceOf[js.Any]))
      SnapshotTime.foreach(__v => __obj.updateDynamic("SnapshotTime")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskEndTime.foreach(__v => __obj.updateDynamic("TaskEndTime")(__v.asInstanceOf[js.Any]))
      TaskStartTime.foreach(__v => __obj.updateDynamic("TaskStartTime")(__v.asInstanceOf[js.Any]))
      TotalExtractedDataInGB.foreach(__v => __obj.updateDynamic("TotalExtractedDataInGB")(__v.asInstanceOf[js.Any]))
      WarningMessage.foreach(__v => __obj.updateDynamic("WarningMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportTask]
    }
  }

  @js.native
  trait ExportTasksMessage extends js.Object {
    var ExportTasks: js.UndefOr[ExportTasksList]
    var Marker: js.UndefOr[String]
  }

  object ExportTasksMessage {
    @inline
    def apply(
        ExportTasks: js.UndefOr[ExportTasksList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): ExportTasksMessage = {
      val __obj = js.Dynamic.literal()
      ExportTasks.foreach(__v => __obj.updateDynamic("ExportTasks")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportTasksMessage]
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
    @inline
    def apply(
        DBClusterIdentifier: String,
        TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
    ): FailoverDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

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
    @inline
    def apply(
        DatabaseName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        GlobalClusterArn: js.UndefOr[String] = js.undefined,
        GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
        GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.undefined,
        GlobalClusterResourceId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
    ): GlobalCluster = {
      val __obj = js.Dynamic.literal()
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      GlobalClusterArn.foreach(__v => __obj.updateDynamic("GlobalClusterArn")(__v.asInstanceOf[js.Any]))
      GlobalClusterIdentifier.foreach(__v => __obj.updateDynamic("GlobalClusterIdentifier")(__v.asInstanceOf[js.Any]))
      GlobalClusterMembers.foreach(__v => __obj.updateDynamic("GlobalClusterMembers")(__v.asInstanceOf[js.Any]))
      GlobalClusterResourceId.foreach(__v => __obj.updateDynamic("GlobalClusterResourceId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalCluster]
    }
  }

  /**
    * A data structure with information about any primary and secondary clusters associated with an Aurora global database.
    */
  @js.native
  trait GlobalClusterMember extends js.Object {
    var DBClusterArn: js.UndefOr[String]
    var GlobalWriteForwardingStatus: js.UndefOr[WriteForwardingStatus]
    var IsWriter: js.UndefOr[Boolean]
    var Readers: js.UndefOr[ReadersArnList]
  }

  object GlobalClusterMember {
    @inline
    def apply(
        DBClusterArn: js.UndefOr[String] = js.undefined,
        GlobalWriteForwardingStatus: js.UndefOr[WriteForwardingStatus] = js.undefined,
        IsWriter: js.UndefOr[Boolean] = js.undefined,
        Readers: js.UndefOr[ReadersArnList] = js.undefined
    ): GlobalClusterMember = {
      val __obj = js.Dynamic.literal()
      DBClusterArn.foreach(__v => __obj.updateDynamic("DBClusterArn")(__v.asInstanceOf[js.Any]))
      GlobalWriteForwardingStatus.foreach(__v =>
        __obj.updateDynamic("GlobalWriteForwardingStatus")(__v.asInstanceOf[js.Any])
      )
      IsWriter.foreach(__v => __obj.updateDynamic("IsWriter")(__v.asInstanceOf[js.Any]))
      Readers.foreach(__v => __obj.updateDynamic("Readers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalClusterMember]
    }
  }

  @js.native
  trait GlobalClustersMessage extends js.Object {
    var GlobalClusters: js.UndefOr[GlobalClusterList]
    var Marker: js.UndefOr[String]
  }

  object GlobalClustersMessage {
    @inline
    def apply(
        GlobalClusters: js.UndefOr[GlobalClusterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): GlobalClustersMessage = {
      val __obj = js.Dynamic.literal()
      GlobalClusters.foreach(__v => __obj.updateDynamic("GlobalClusters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalClustersMessage]
    }
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
  trait IPRange extends js.Object {
    var CIDRIP: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object IPRange {
    @inline
    def apply(
        CIDRIP: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): IPRange = {
      val __obj = js.Dynamic.literal()
      CIDRIP.foreach(__v => __obj.updateDynamic("CIDRIP")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IPRange]
    }
  }

  @js.native
  trait ImportInstallationMediaMessage extends js.Object {
    var CustomAvailabilityZoneId: String
    var Engine: String
    var EngineInstallationMediaPath: String
    var EngineVersion: String
    var OSInstallationMediaPath: String
  }

  object ImportInstallationMediaMessage {
    @inline
    def apply(
        CustomAvailabilityZoneId: String,
        Engine: String,
        EngineInstallationMediaPath: String,
        EngineVersion: String,
        OSInstallationMediaPath: String
    ): ImportInstallationMediaMessage = {
      val __obj = js.Dynamic.literal(
        "CustomAvailabilityZoneId"    -> CustomAvailabilityZoneId.asInstanceOf[js.Any],
        "Engine"                      -> Engine.asInstanceOf[js.Any],
        "EngineInstallationMediaPath" -> EngineInstallationMediaPath.asInstanceOf[js.Any],
        "EngineVersion"               -> EngineVersion.asInstanceOf[js.Any],
        "OSInstallationMediaPath"     -> OSInstallationMediaPath.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportInstallationMediaMessage]
    }
  }

  /**
    * Contains the installation media for a DB engine that requires an on-premises customer provided license, such as Microsoft SQL Server.
    */
  @js.native
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

  object InstallationMedia {
    @inline
    def apply(
        CustomAvailabilityZoneId: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineInstallationMediaPath: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        FailureCause: js.UndefOr[InstallationMediaFailureCause] = js.undefined,
        InstallationMediaId: js.UndefOr[String] = js.undefined,
        OSInstallationMediaPath: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): InstallationMedia = {
      val __obj = js.Dynamic.literal()
      CustomAvailabilityZoneId.foreach(__v => __obj.updateDynamic("CustomAvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineInstallationMediaPath.foreach(__v =>
        __obj.updateDynamic("EngineInstallationMediaPath")(__v.asInstanceOf[js.Any])
      )
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      FailureCause.foreach(__v => __obj.updateDynamic("FailureCause")(__v.asInstanceOf[js.Any]))
      InstallationMediaId.foreach(__v => __obj.updateDynamic("InstallationMediaId")(__v.asInstanceOf[js.Any]))
      OSInstallationMediaPath.foreach(__v => __obj.updateDynamic("OSInstallationMediaPath")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstallationMedia]
    }
  }

  /**
    * Contains the cause of an installation media failure. Installation media is used for a DB engine that requires an on-premises customer provided license, such as Microsoft SQL Server.
    */
  @js.native
  trait InstallationMediaFailureCause extends js.Object {
    var Message: js.UndefOr[String]
  }

  object InstallationMediaFailureCause {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined
    ): InstallationMediaFailureCause = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstallationMediaFailureCause]
    }
  }

  @js.native
  trait InstallationMediaMessage extends js.Object {
    var InstallationMedia: js.UndefOr[InstallationMediaList]
    var Marker: js.UndefOr[String]
  }

  object InstallationMediaMessage {
    @inline
    def apply(
        InstallationMedia: js.UndefOr[InstallationMediaList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): InstallationMediaMessage = {
      val __obj = js.Dynamic.literal()
      InstallationMedia.foreach(__v => __obj.updateDynamic("InstallationMedia")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstallationMediaMessage]
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

  /**
    * The minimum DB engine version required for each corresponding allowed value for an option setting.
    */
  @js.native
  trait MinimumEngineVersionPerAllowedValue extends js.Object {
    var AllowedValue: js.UndefOr[String]
    var MinimumEngineVersion: js.UndefOr[String]
  }

  object MinimumEngineVersionPerAllowedValue {
    @inline
    def apply(
        AllowedValue: js.UndefOr[String] = js.undefined,
        MinimumEngineVersion: js.UndefOr[String] = js.undefined
    ): MinimumEngineVersionPerAllowedValue = {
      val __obj = js.Dynamic.literal()
      AllowedValue.foreach(__v => __obj.updateDynamic("AllowedValue")(__v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.updateDynamic("MinimumEngineVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MinimumEngineVersionPerAllowedValue]
    }
  }

  @js.native
  trait ModifyCertificatesMessage extends js.Object {
    var CertificateIdentifier: js.UndefOr[String]
    var RemoveCustomerOverride: js.UndefOr[BooleanOptional]
  }

  object ModifyCertificatesMessage {
    @inline
    def apply(
        CertificateIdentifier: js.UndefOr[String] = js.undefined,
        RemoveCustomerOverride: js.UndefOr[BooleanOptional] = js.undefined
    ): ModifyCertificatesMessage = {
      val __obj = js.Dynamic.literal()
      CertificateIdentifier.foreach(__v => __obj.updateDynamic("CertificateIdentifier")(__v.asInstanceOf[js.Any]))
      RemoveCustomerOverride.foreach(__v => __obj.updateDynamic("RemoveCustomerOverride")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCertificatesMessage]
    }
  }

  @js.native
  trait ModifyCertificatesResult extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  object ModifyCertificatesResult {
    @inline
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined
    ): ModifyCertificatesResult = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCertificatesResult]
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
    @inline
    def apply(
        DBClusterIdentifier: String,
        Capacity: js.UndefOr[IntegerOptional] = js.undefined,
        SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        TimeoutAction: js.UndefOr[String] = js.undefined
    ): ModifyCurrentDBClusterCapacityMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      SecondsBeforeTimeout.foreach(__v => __obj.updateDynamic("SecondsBeforeTimeout")(__v.asInstanceOf[js.Any]))
      TimeoutAction.foreach(__v => __obj.updateDynamic("TimeoutAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCurrentDBClusterCapacityMessage]
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
    @inline
    def apply(
        DBClusterEndpointIdentifier: String,
        EndpointType: js.UndefOr[String] = js.undefined,
        ExcludedMembers: js.UndefOr[StringList] = js.undefined,
        StaticMembers: js.UndefOr[StringList] = js.undefined
    ): ModifyDBClusterEndpointMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterEndpointIdentifier" -> DBClusterEndpointIdentifier.asInstanceOf[js.Any]
      )

      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      ExcludedMembers.foreach(__v => __obj.updateDynamic("ExcludedMembers")(__v.asInstanceOf[js.Any]))
      StaticMembers.foreach(__v => __obj.updateDynamic("StaticMembers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBClusterEndpointMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
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
    var EnableGlobalWriteForwarding: js.UndefOr[BooleanOptional]
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
    @inline
    def apply(
        DBClusterIdentifier: String,
        AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBInstanceParameterGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        DomainIAMRoleName: js.UndefOr[String] = js.undefined,
        EnableGlobalWriteForwarding: js.UndefOr[BooleanOptional] = js.undefined,
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
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): ModifyDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any]
      )

      AllowMajorVersionUpgrade.foreach(__v => __obj.updateDynamic("AllowMajorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      BacktrackWindow.foreach(__v => __obj.updateDynamic("BacktrackWindow")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CloudwatchLogsExportConfiguration.foreach(__v =>
        __obj.updateDynamic("CloudwatchLogsExportConfiguration")(__v.asInstanceOf[js.Any])
      )
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBInstanceParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBInstanceParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
      EnableGlobalWriteForwarding.foreach(__v =>
        __obj.updateDynamic("EnableGlobalWriteForwarding")(__v.asInstanceOf[js.Any])
      )
      EnableHttpEndpoint.foreach(__v => __obj.updateDynamic("EnableHttpEndpoint")(__v.asInstanceOf[js.Any]))
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
      ScalingConfiguration.foreach(__v => __obj.updateDynamic("ScalingConfiguration")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBClusterMessage]
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
        CertificateRotationRestart: js.UndefOr[BooleanOptional] = js.undefined,
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
        MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
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
      CertificateRotationRestart.foreach(__v =>
        __obj.updateDynamic("CertificateRotationRestart")(__v.asInstanceOf[js.Any])
      )
      CloudwatchLogsExportConfiguration.foreach(__v =>
        __obj.updateDynamic("CloudwatchLogsExportConfiguration")(__v.asInstanceOf[js.Any])
      )
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      DBPortNumber.foreach(__v => __obj.updateDynamic("DBPortNumber")(__v.asInstanceOf[js.Any]))
      DBSecurityGroups.foreach(__v => __obj.updateDynamic("DBSecurityGroups")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
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
      MaxAllocatedStorage.foreach(__v => __obj.updateDynamic("MaxAllocatedStorage")(__v.asInstanceOf[js.Any]))
      MonitoringInterval.foreach(__v => __obj.updateDynamic("MonitoringInterval")(__v.asInstanceOf[js.Any]))
      MonitoringRoleArn.foreach(__v => __obj.updateDynamic("MonitoringRoleArn")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      NewDBInstanceIdentifier.foreach(__v => __obj.updateDynamic("NewDBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsKMSKeyId.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsKMSKeyId")(__v.asInstanceOf[js.Any])
      )
      PerformanceInsightsRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      PromotionTier.foreach(__v => __obj.updateDynamic("PromotionTier")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      TdeCredentialPassword.foreach(__v => __obj.updateDynamic("TdeCredentialPassword")(__v.asInstanceOf[js.Any]))
      UseDefaultProcessorFeatures.foreach(__v =>
        __obj.updateDynamic("UseDefaultProcessorFeatures")(__v.asInstanceOf[js.Any])
      )
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

  /**
    * <p/>
    */
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

  object ModifyDBProxyRequest {
    @inline
    def apply(
        DBProxyName: String,
        Auth: js.UndefOr[UserAuthConfigList] = js.undefined,
        DebugLogging: js.UndefOr[BooleanOptional] = js.undefined,
        IdleClientTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        NewDBProxyName: js.UndefOr[String] = js.undefined,
        RequireTLS: js.UndefOr[BooleanOptional] = js.undefined,
        RoleArn: js.UndefOr[String] = js.undefined,
        SecurityGroups: js.UndefOr[StringList] = js.undefined
    ): ModifyDBProxyRequest = {
      val __obj = js.Dynamic.literal(
        "DBProxyName" -> DBProxyName.asInstanceOf[js.Any]
      )

      Auth.foreach(__v => __obj.updateDynamic("Auth")(__v.asInstanceOf[js.Any]))
      DebugLogging.foreach(__v => __obj.updateDynamic("DebugLogging")(__v.asInstanceOf[js.Any]))
      IdleClientTimeout.foreach(__v => __obj.updateDynamic("IdleClientTimeout")(__v.asInstanceOf[js.Any]))
      NewDBProxyName.foreach(__v => __obj.updateDynamic("NewDBProxyName")(__v.asInstanceOf[js.Any]))
      RequireTLS.foreach(__v => __obj.updateDynamic("RequireTLS")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBProxyRequest]
    }
  }

  @js.native
  trait ModifyDBProxyResponse extends js.Object {
    var DBProxy: js.UndefOr[DBProxy]
  }

  object ModifyDBProxyResponse {
    @inline
    def apply(
        DBProxy: js.UndefOr[DBProxy] = js.undefined
    ): ModifyDBProxyResponse = {
      val __obj = js.Dynamic.literal()
      DBProxy.foreach(__v => __obj.updateDynamic("DBProxy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBProxyResponse]
    }
  }

  @js.native
  trait ModifyDBProxyTargetGroupRequest extends js.Object {
    var DBProxyName: String
    var TargetGroupName: String
    var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfiguration]
    var NewName: js.UndefOr[String]
  }

  object ModifyDBProxyTargetGroupRequest {
    @inline
    def apply(
        DBProxyName: String,
        TargetGroupName: String,
        ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfiguration] = js.undefined,
        NewName: js.UndefOr[String] = js.undefined
    ): ModifyDBProxyTargetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "DBProxyName"     -> DBProxyName.asInstanceOf[js.Any],
        "TargetGroupName" -> TargetGroupName.asInstanceOf[js.Any]
      )

      ConnectionPoolConfig.foreach(__v => __obj.updateDynamic("ConnectionPoolConfig")(__v.asInstanceOf[js.Any]))
      NewName.foreach(__v => __obj.updateDynamic("NewName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBProxyTargetGroupRequest]
    }
  }

  @js.native
  trait ModifyDBProxyTargetGroupResponse extends js.Object {
    var DBProxyTargetGroup: js.UndefOr[DBProxyTargetGroup]
  }

  object ModifyDBProxyTargetGroupResponse {
    @inline
    def apply(
        DBProxyTargetGroup: js.UndefOr[DBProxyTargetGroup] = js.undefined
    ): ModifyDBProxyTargetGroupResponse = {
      val __obj = js.Dynamic.literal()
      DBProxyTargetGroup.foreach(__v => __obj.updateDynamic("DBProxyTargetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBProxyTargetGroupResponse]
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
    @inline
    def apply(
        AttributeName: String,
        DBSnapshotIdentifier: String,
        ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined,
        ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
    ): ModifyDBSnapshotAttributeMessage = {
      val __obj = js.Dynamic.literal(
        "AttributeName"        -> AttributeName.asInstanceOf[js.Any],
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any]
      )

      ValuesToAdd.foreach(__v => __obj.updateDynamic("ValuesToAdd")(__v.asInstanceOf[js.Any]))
      ValuesToRemove.foreach(__v => __obj.updateDynamic("ValuesToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBSnapshotAttributeMessage]
    }
  }

  @js.native
  trait ModifyDBSnapshotAttributeResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult]
  }

  object ModifyDBSnapshotAttributeResult {
    @inline
    def apply(
        DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined
    ): ModifyDBSnapshotAttributeResult = {
      val __obj = js.Dynamic.literal()
      DBSnapshotAttributesResult.foreach(__v =>
        __obj.updateDynamic("DBSnapshotAttributesResult")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ModifyDBSnapshotAttributeResult]
    }
  }

  @js.native
  trait ModifyDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: String
    var EngineVersion: js.UndefOr[String]
    var OptionGroupName: js.UndefOr[String]
  }

  object ModifyDBSnapshotMessage {
    @inline
    def apply(
        DBSnapshotIdentifier: String,
        EngineVersion: js.UndefOr[String] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined
    ): ModifyDBSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any]
      )

      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBSnapshotMessage]
    }
  }

  @js.native
  trait ModifyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot]
  }

  object ModifyDBSnapshotResult {
    @inline
    def apply(
        DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
    ): ModifyDBSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBSnapshot.foreach(__v => __obj.updateDynamic("DBSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyDBSnapshotResult]
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

  @js.native
  trait ModifyGlobalClusterMessage extends js.Object {
    var DeletionProtection: js.UndefOr[BooleanOptional]
    var GlobalClusterIdentifier: js.UndefOr[String]
    var NewGlobalClusterIdentifier: js.UndefOr[String]
  }

  object ModifyGlobalClusterMessage {
    @inline
    def apply(
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        GlobalClusterIdentifier: js.UndefOr[String] = js.undefined,
        NewGlobalClusterIdentifier: js.UndefOr[String] = js.undefined
    ): ModifyGlobalClusterMessage = {
      val __obj = js.Dynamic.literal()
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      GlobalClusterIdentifier.foreach(__v => __obj.updateDynamic("GlobalClusterIdentifier")(__v.asInstanceOf[js.Any]))
      NewGlobalClusterIdentifier.foreach(__v =>
        __obj.updateDynamic("NewGlobalClusterIdentifier")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ModifyGlobalClusterMessage]
    }
  }

  @js.native
  trait ModifyGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  object ModifyGlobalClusterResult {
    @inline
    def apply(
        GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
    ): ModifyGlobalClusterResult = {
      val __obj = js.Dynamic.literal()
      GlobalCluster.foreach(__v => __obj.updateDynamic("GlobalCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyGlobalClusterResult]
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
    @inline
    def apply(
        OptionGroupName: String,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.undefined,
        OptionsToRemove: js.UndefOr[OptionNamesList] = js.undefined
    ): ModifyOptionGroupMessage = {
      val __obj = js.Dynamic.literal(
        "OptionGroupName" -> OptionGroupName.asInstanceOf[js.Any]
      )

      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      OptionsToInclude.foreach(__v => __obj.updateDynamic("OptionsToInclude")(__v.asInstanceOf[js.Any]))
      OptionsToRemove.foreach(__v => __obj.updateDynamic("OptionsToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyOptionGroupMessage]
    }
  }

  @js.native
  trait ModifyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup]
  }

  object ModifyOptionGroupResult {
    @inline
    def apply(
        OptionGroup: js.UndefOr[OptionGroup] = js.undefined
    ): ModifyOptionGroupResult = {
      val __obj = js.Dynamic.literal()
      OptionGroup.foreach(__v => __obj.updateDynamic("OptionGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyOptionGroupResult]
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
    @inline
    def apply(
        DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined,
        OptionDescription: js.UndefOr[String] = js.undefined,
        OptionName: js.UndefOr[String] = js.undefined,
        OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.undefined,
        OptionVersion: js.UndefOr[String] = js.undefined,
        Permanent: js.UndefOr[Boolean] = js.undefined,
        Persistent: js.UndefOr[Boolean] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): Option = {
      val __obj = js.Dynamic.literal()
      DBSecurityGroupMemberships.foreach(__v =>
        __obj.updateDynamic("DBSecurityGroupMemberships")(__v.asInstanceOf[js.Any])
      )
      OptionDescription.foreach(__v => __obj.updateDynamic("OptionDescription")(__v.asInstanceOf[js.Any]))
      OptionName.foreach(__v => __obj.updateDynamic("OptionName")(__v.asInstanceOf[js.Any]))
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      OptionVersion.foreach(__v => __obj.updateDynamic("OptionVersion")(__v.asInstanceOf[js.Any]))
      Permanent.foreach(__v => __obj.updateDynamic("Permanent")(__v.asInstanceOf[js.Any]))
      Persistent.foreach(__v => __obj.updateDynamic("Persistent")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupMemberships.foreach(__v =>
        __obj.updateDynamic("VpcSecurityGroupMemberships")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[Option]
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
    @inline
    def apply(
        OptionName: String,
        DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
        OptionSettings: js.UndefOr[OptionSettingsList] = js.undefined,
        OptionVersion: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): OptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "OptionName" -> OptionName.asInstanceOf[js.Any]
      )

      DBSecurityGroupMemberships.foreach(__v =>
        __obj.updateDynamic("DBSecurityGroupMemberships")(__v.asInstanceOf[js.Any])
      )
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      OptionVersion.foreach(__v => __obj.updateDynamic("OptionVersion")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupMemberships.foreach(__v =>
        __obj.updateDynamic("VpcSecurityGroupMemberships")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[OptionConfiguration]
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
    @inline
    def apply(
        AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.undefined,
        EngineName: js.UndefOr[String] = js.undefined,
        MajorEngineVersion: js.UndefOr[String] = js.undefined,
        OptionGroupArn: js.UndefOr[String] = js.undefined,
        OptionGroupDescription: js.UndefOr[String] = js.undefined,
        OptionGroupName: js.UndefOr[String] = js.undefined,
        Options: js.UndefOr[OptionsList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): OptionGroup = {
      val __obj = js.Dynamic.literal()
      AllowsVpcAndNonVpcInstanceMemberships.foreach(__v =>
        __obj.updateDynamic("AllowsVpcAndNonVpcInstanceMemberships")(__v.asInstanceOf[js.Any])
      )
      EngineName.foreach(__v => __obj.updateDynamic("EngineName")(__v.asInstanceOf[js.Any]))
      MajorEngineVersion.foreach(__v => __obj.updateDynamic("MajorEngineVersion")(__v.asInstanceOf[js.Any]))
      OptionGroupArn.foreach(__v => __obj.updateDynamic("OptionGroupArn")(__v.asInstanceOf[js.Any]))
      OptionGroupDescription.foreach(__v => __obj.updateDynamic("OptionGroupDescription")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionGroup]
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
    @inline
    def apply(
        DefaultPort: js.UndefOr[IntegerOptional] = js.undefined,
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
        VpcOnly: js.UndefOr[Boolean] = js.undefined
    ): OptionGroupOption = {
      val __obj = js.Dynamic.literal()
      DefaultPort.foreach(__v => __obj.updateDynamic("DefaultPort")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EngineName.foreach(__v => __obj.updateDynamic("EngineName")(__v.asInstanceOf[js.Any]))
      MajorEngineVersion.foreach(__v => __obj.updateDynamic("MajorEngineVersion")(__v.asInstanceOf[js.Any]))
      MinimumRequiredMinorEngineVersion.foreach(__v =>
        __obj.updateDynamic("MinimumRequiredMinorEngineVersion")(__v.asInstanceOf[js.Any])
      )
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OptionGroupOptionSettings.foreach(__v =>
        __obj.updateDynamic("OptionGroupOptionSettings")(__v.asInstanceOf[js.Any])
      )
      OptionGroupOptionVersions.foreach(__v =>
        __obj.updateDynamic("OptionGroupOptionVersions")(__v.asInstanceOf[js.Any])
      )
      OptionsConflictsWith.foreach(__v => __obj.updateDynamic("OptionsConflictsWith")(__v.asInstanceOf[js.Any]))
      OptionsDependedOn.foreach(__v => __obj.updateDynamic("OptionsDependedOn")(__v.asInstanceOf[js.Any]))
      Permanent.foreach(__v => __obj.updateDynamic("Permanent")(__v.asInstanceOf[js.Any]))
      Persistent.foreach(__v => __obj.updateDynamic("Persistent")(__v.asInstanceOf[js.Any]))
      PortRequired.foreach(__v => __obj.updateDynamic("PortRequired")(__v.asInstanceOf[js.Any]))
      RequiresAutoMinorEngineVersionUpgrade.foreach(__v =>
        __obj.updateDynamic("RequiresAutoMinorEngineVersionUpgrade")(__v.asInstanceOf[js.Any])
      )
      SupportsOptionVersionDowngrade.foreach(__v =>
        __obj.updateDynamic("SupportsOptionVersionDowngrade")(__v.asInstanceOf[js.Any])
      )
      VpcOnly.foreach(__v => __obj.updateDynamic("VpcOnly")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionGroupOption]
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
    @inline
    def apply(
        AllowedValues: js.UndefOr[String] = js.undefined,
        ApplyType: js.UndefOr[String] = js.undefined,
        DefaultValue: js.UndefOr[String] = js.undefined,
        IsModifiable: js.UndefOr[Boolean] = js.undefined,
        IsRequired: js.UndefOr[Boolean] = js.undefined,
        MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList] = js.undefined,
        SettingDescription: js.UndefOr[String] = js.undefined,
        SettingName: js.UndefOr[String] = js.undefined
    ): OptionGroupOptionSetting = {
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      ApplyType.foreach(__v => __obj.updateDynamic("ApplyType")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      IsModifiable.foreach(__v => __obj.updateDynamic("IsModifiable")(__v.asInstanceOf[js.Any]))
      IsRequired.foreach(__v => __obj.updateDynamic("IsRequired")(__v.asInstanceOf[js.Any]))
      MinimumEngineVersionPerAllowedValue.foreach(__v =>
        __obj.updateDynamic("MinimumEngineVersionPerAllowedValue")(__v.asInstanceOf[js.Any])
      )
      SettingDescription.foreach(__v => __obj.updateDynamic("SettingDescription")(__v.asInstanceOf[js.Any]))
      SettingName.foreach(__v => __obj.updateDynamic("SettingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionGroupOptionSetting]
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.undefined
    ): OptionGroupOptionsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      OptionGroupOptions.foreach(__v => __obj.updateDynamic("OptionGroupOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionGroupOptionsMessage]
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        OptionGroupsList: js.UndefOr[OptionGroupsList] = js.undefined
    ): OptionGroups = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      OptionGroupsList.foreach(__v => __obj.updateDynamic("OptionGroupsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionGroups]
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
    @inline
    def apply(
        AllowedValues: js.UndefOr[String] = js.undefined,
        ApplyType: js.UndefOr[String] = js.undefined,
        DataType: js.UndefOr[String] = js.undefined,
        DefaultValue: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IsCollection: js.UndefOr[Boolean] = js.undefined,
        IsModifiable: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): OptionSetting = {
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      ApplyType.foreach(__v => __obj.updateDynamic("ApplyType")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsCollection.foreach(__v => __obj.updateDynamic("IsCollection")(__v.asInstanceOf[js.Any]))
      IsModifiable.foreach(__v => __obj.updateDynamic("IsModifiable")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionSetting]
    }
  }

  /**
    * The version for an option. Option group option versions are returned by the <code>DescribeOptionGroupOptions</code> action.
    */
  @js.native
  trait OptionVersion extends js.Object {
    var IsDefault: js.UndefOr[Boolean]
    var Version: js.UndefOr[String]
  }

  object OptionVersion {
    @inline
    def apply(
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): OptionVersion = {
      val __obj = js.Dynamic.literal()
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionVersion]
    }
  }

  /**
    * Contains a list of available options for a DB instance.
    *  This data type is used as a response element in the <code>DescribeOrderableDBInstanceOptions</code> action.
    */
  @js.native
  trait OrderableDBInstanceOption extends js.Object {
    var AvailabilityZoneGroup: js.UndefOr[String]
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
    var OutpostCapable: js.UndefOr[Boolean]
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

  object OrderableDBInstanceOption {
    @inline
    def apply(
        AvailabilityZoneGroup: js.UndefOr[String] = js.undefined,
        AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
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
        OutpostCapable: js.UndefOr[Boolean] = js.undefined,
        ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined,
        SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined,
        SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined,
        SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined,
        SupportsIops: js.UndefOr[Boolean] = js.undefined,
        SupportsKerberosAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
        SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined,
        SupportsStorageAutoscaling: js.UndefOr[BooleanOptional] = js.undefined,
        SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined,
        Vpc: js.UndefOr[Boolean] = js.undefined
    ): OrderableDBInstanceOption = {
      val __obj = js.Dynamic.literal()
      AvailabilityZoneGroup.foreach(__v => __obj.updateDynamic("AvailabilityZoneGroup")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      AvailableProcessorFeatures.foreach(__v =>
        __obj.updateDynamic("AvailableProcessorFeatures")(__v.asInstanceOf[js.Any])
      )
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
      OutpostCapable.foreach(__v => __obj.updateDynamic("OutpostCapable")(__v.asInstanceOf[js.Any]))
      ReadReplicaCapable.foreach(__v => __obj.updateDynamic("ReadReplicaCapable")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      SupportedEngineModes.foreach(__v => __obj.updateDynamic("SupportedEngineModes")(__v.asInstanceOf[js.Any]))
      SupportsEnhancedMonitoring.foreach(__v =>
        __obj.updateDynamic("SupportsEnhancedMonitoring")(__v.asInstanceOf[js.Any])
      )
      SupportsIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("SupportsIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      SupportsIops.foreach(__v => __obj.updateDynamic("SupportsIops")(__v.asInstanceOf[js.Any]))
      SupportsKerberosAuthentication.foreach(__v =>
        __obj.updateDynamic("SupportsKerberosAuthentication")(__v.asInstanceOf[js.Any])
      )
      SupportsPerformanceInsights.foreach(__v =>
        __obj.updateDynamic("SupportsPerformanceInsights")(__v.asInstanceOf[js.Any])
      )
      SupportsStorageAutoscaling.foreach(__v =>
        __obj.updateDynamic("SupportsStorageAutoscaling")(__v.asInstanceOf[js.Any])
      )
      SupportsStorageEncryption.foreach(__v =>
        __obj.updateDynamic("SupportsStorageEncryption")(__v.asInstanceOf[js.Any])
      )
      Vpc.foreach(__v => __obj.updateDynamic("Vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderableDBInstanceOption]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeOrderableDBInstanceOptions</code> action.
    */
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
    * A data type that represents an Outpost.
    *  For more information about RDS on Outposts, see [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html|Amazon RDS on AWS Outposts]] in the <i>Amazon RDS User Guide.</i>
    */
  @js.native
  trait Outpost extends js.Object {
    var Arn: js.UndefOr[String]
  }

  object Outpost {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined
    ): Outpost = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Outpost]
    }
  }

  /**
    * This data type is used as a request parameter in the <code>ModifyDBParameterGroup</code> and <code>ResetDBParameterGroup</code> actions.
    *  This data type is used as a response element in the <code>DescribeEngineDefaultParameters</code> and <code>DescribeDBParameters</code> actions.
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
        Source: js.UndefOr[String] = js.undefined,
        SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
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
      SupportedEngineModes.foreach(__v => __obj.updateDynamic("SupportedEngineModes")(__v.asInstanceOf[js.Any]))
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

  /**
    * Data returned from the ```DescribePendingMaintenanceActions``` action.
    */
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
    * This data type is used as a response element in the <code>ModifyDBInstance</code> action.
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
        ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined,
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
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingModifiedValues]
    }
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
  trait ProcessorFeature extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object ProcessorFeature {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): ProcessorFeature = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessorFeature]
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
    * <p/>
    */
  @js.native
  trait PromoteReadReplicaMessage extends js.Object {
    var DBInstanceIdentifier: String
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional]
    var PreferredBackupWindow: js.UndefOr[String]
  }

  object PromoteReadReplicaMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String,
        BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredBackupWindow: js.UndefOr[String] = js.undefined
    ): PromoteReadReplicaMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PromoteReadReplicaMessage]
    }
  }

  @js.native
  trait PromoteReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object PromoteReadReplicaResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): PromoteReadReplicaResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PromoteReadReplicaResult]
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
    @inline
    def apply(
        ReservedDBInstancesOfferingId: String,
        DBInstanceCount: js.UndefOr[IntegerOptional] = js.undefined,
        ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): PurchaseReservedDBInstancesOfferingMessage = {
      val __obj = js.Dynamic.literal(
        "ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.asInstanceOf[js.Any]
      )

      DBInstanceCount.foreach(__v => __obj.updateDynamic("DBInstanceCount")(__v.asInstanceOf[js.Any]))
      ReservedDBInstanceId.foreach(__v => __obj.updateDynamic("ReservedDBInstanceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
    var ReservedDBInstance: js.UndefOr[ReservedDBInstance]
  }

  object PurchaseReservedDBInstancesOfferingResult {
    @inline
    def apply(
        ReservedDBInstance: js.UndefOr[ReservedDBInstance] = js.undefined
    ): PurchaseReservedDBInstancesOfferingResult = {
      val __obj = js.Dynamic.literal()
      ReservedDBInstance.foreach(__v => __obj.updateDynamic("ReservedDBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
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

  /**
    * <p/>
    */
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

  /**
    * This data type is used as a response element in the <code>DescribeReservedDBInstances</code> and <code>DescribeReservedDBInstancesOfferings</code> actions.
    */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  object RecurringCharge {
    @inline
    def apply(
        RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
        RecurringChargeFrequency: js.UndefOr[String] = js.undefined
    ): RecurringCharge = {
      val __obj = js.Dynamic.literal()
      RecurringChargeAmount.foreach(__v => __obj.updateDynamic("RecurringChargeAmount")(__v.asInstanceOf[js.Any]))
      RecurringChargeFrequency.foreach(__v => __obj.updateDynamic("RecurringChargeFrequency")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecurringCharge]
    }
  }

  @js.native
  trait RegisterDBProxyTargetsRequest extends js.Object {
    var DBProxyName: String
    var DBClusterIdentifiers: js.UndefOr[StringList]
    var DBInstanceIdentifiers: js.UndefOr[StringList]
    var TargetGroupName: js.UndefOr[String]
  }

  object RegisterDBProxyTargetsRequest {
    @inline
    def apply(
        DBProxyName: String,
        DBClusterIdentifiers: js.UndefOr[StringList] = js.undefined,
        DBInstanceIdentifiers: js.UndefOr[StringList] = js.undefined,
        TargetGroupName: js.UndefOr[String] = js.undefined
    ): RegisterDBProxyTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "DBProxyName" -> DBProxyName.asInstanceOf[js.Any]
      )

      DBClusterIdentifiers.foreach(__v => __obj.updateDynamic("DBClusterIdentifiers")(__v.asInstanceOf[js.Any]))
      DBInstanceIdentifiers.foreach(__v => __obj.updateDynamic("DBInstanceIdentifiers")(__v.asInstanceOf[js.Any]))
      TargetGroupName.foreach(__v => __obj.updateDynamic("TargetGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterDBProxyTargetsRequest]
    }
  }

  @js.native
  trait RegisterDBProxyTargetsResponse extends js.Object {
    var DBProxyTargets: js.UndefOr[TargetList]
  }

  object RegisterDBProxyTargetsResponse {
    @inline
    def apply(
        DBProxyTargets: js.UndefOr[TargetList] = js.undefined
    ): RegisterDBProxyTargetsResponse = {
      val __obj = js.Dynamic.literal()
      DBProxyTargets.foreach(__v => __obj.updateDynamic("DBProxyTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterDBProxyTargetsResponse]
    }
  }

  @js.native
  trait RemoveFromGlobalClusterMessage extends js.Object {
    var DbClusterIdentifier: js.UndefOr[String]
    var GlobalClusterIdentifier: js.UndefOr[String]
  }

  object RemoveFromGlobalClusterMessage {
    @inline
    def apply(
        DbClusterIdentifier: js.UndefOr[String] = js.undefined,
        GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
    ): RemoveFromGlobalClusterMessage = {
      val __obj = js.Dynamic.literal()
      DbClusterIdentifier.foreach(__v => __obj.updateDynamic("DbClusterIdentifier")(__v.asInstanceOf[js.Any]))
      GlobalClusterIdentifier.foreach(__v => __obj.updateDynamic("GlobalClusterIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveFromGlobalClusterMessage]
    }
  }

  @js.native
  trait RemoveFromGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster]
  }

  object RemoveFromGlobalClusterResult {
    @inline
    def apply(
        GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
    ): RemoveFromGlobalClusterResult = {
      val __obj = js.Dynamic.literal()
      GlobalCluster.foreach(__v => __obj.updateDynamic("GlobalCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveFromGlobalClusterResult]
    }
  }

  @js.native
  trait RemoveRoleFromDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
    var RoleArn: String
    var FeatureName: js.UndefOr[String]
  }

  object RemoveRoleFromDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        RoleArn: String,
        FeatureName: js.UndefOr[String] = js.undefined
    ): RemoveRoleFromDBClusterMessage = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "RoleArn"             -> RoleArn.asInstanceOf[js.Any]
      )

      FeatureName.foreach(__v => __obj.updateDynamic("FeatureName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveRoleFromDBClusterMessage]
    }
  }

  @js.native
  trait RemoveRoleFromDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var FeatureName: String
    var RoleArn: String
  }

  object RemoveRoleFromDBInstanceMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String,
        FeatureName: String,
        RoleArn: String
    ): RemoveRoleFromDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "FeatureName"          -> FeatureName.asInstanceOf[js.Any],
        "RoleArn"              -> RoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveRoleFromDBInstanceMessage]
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

  /**
    * <p/>
    */
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

  /**
    * This data type is used as a response element in the <code>DescribeReservedDBInstances</code> and <code>PurchaseReservedDBInstancesOffering</code> actions.
    */
  @js.native
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

  object ReservedDBInstance {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        DBInstanceCount: js.UndefOr[Int] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        LeaseId: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[Boolean] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservedDBInstanceArn: js.UndefOr[String] = js.undefined,
        ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
        ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedDBInstance = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBInstanceCount.foreach(__v => __obj.updateDynamic("DBInstanceCount")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      LeaseId.foreach(__v => __obj.updateDynamic("LeaseId")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservedDBInstanceArn.foreach(__v => __obj.updateDynamic("ReservedDBInstanceArn")(__v.asInstanceOf[js.Any]))
      ReservedDBInstanceId.foreach(__v => __obj.updateDynamic("ReservedDBInstanceId")(__v.asInstanceOf[js.Any]))
      ReservedDBInstancesOfferingId.foreach(__v =>
        __obj.updateDynamic("ReservedDBInstancesOfferingId")(__v.asInstanceOf[js.Any])
      )
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedDBInstance]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeReservedDBInstances</code> action.
    */
  @js.native
  trait ReservedDBInstanceMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList]
  }

  object ReservedDBInstanceMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.undefined
    ): ReservedDBInstanceMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReservedDBInstances.foreach(__v => __obj.updateDynamic("ReservedDBInstances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedDBInstanceMessage]
    }
  }

  /**
    * This data type is used as a response element in the <code>DescribeReservedDBInstancesOfferings</code> action.
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
    @inline
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        DBInstanceClass: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        MultiAZ: js.UndefOr[Boolean] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedDBInstancesOffering = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservedDBInstancesOfferingId.foreach(__v =>
        __obj.updateDynamic("ReservedDBInstancesOfferingId")(__v.asInstanceOf[js.Any])
      )
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedDBInstancesOffering]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeReservedDBInstancesOfferings</code> action.
    */
  @js.native
  trait ReservedDBInstancesOfferingMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList]
  }

  object ReservedDBInstancesOfferingMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.undefined
    ): ReservedDBInstancesOfferingMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReservedDBInstancesOfferings.foreach(__v =>
        __obj.updateDynamic("ReservedDBInstancesOfferings")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ReservedDBInstancesOfferingMessage]
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

  object RestoreDBClusterFromS3Message {
    @inline
    def apply(
        DBClusterIdentifier: String,
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
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        DomainIAMRoleName: js.UndefOr[String] = js.undefined,
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
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreDBClusterFromS3Message = {
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any],
        "MasterUserPassword"  -> MasterUserPassword.asInstanceOf[js.Any],
        "MasterUsername"      -> MasterUsername.asInstanceOf[js.Any],
        "S3BucketName"        -> S3BucketName.asInstanceOf[js.Any],
        "S3IngestionRoleArn"  -> S3IngestionRoleArn.asInstanceOf[js.Any],
        "SourceEngine"        -> SourceEngine.asInstanceOf[js.Any],
        "SourceEngineVersion" -> SourceEngineVersion.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BacktrackWindow.foreach(__v => __obj.updateDynamic("BacktrackWindow")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
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
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      S3Prefix.foreach(__v => __obj.updateDynamic("S3Prefix")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterFromS3Message]
    }
  }

  @js.native
  trait RestoreDBClusterFromS3Result extends js.Object {
    var DBCluster: js.UndefOr[DBCluster]
  }

  object RestoreDBClusterFromS3Result {
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): RestoreDBClusterFromS3Result = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBClusterFromS3Result]
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

  object RestoreDBClusterFromSnapshotMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        Engine: String,
        SnapshotIdentifier: String,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        DomainIAMRoleName: js.UndefOr[String] = js.undefined,
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
      val __obj = js.Dynamic.literal(
        "DBClusterIdentifier" -> DBClusterIdentifier.asInstanceOf[js.Any],
        "Engine"              -> Engine.asInstanceOf[js.Any],
        "SnapshotIdentifier"  -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BacktrackWindow.foreach(__v => __obj.updateDynamic("BacktrackWindow")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnableCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      EngineMode.foreach(__v => __obj.updateDynamic("EngineMode")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ScalingConfiguration.foreach(__v => __obj.updateDynamic("ScalingConfiguration")(__v.asInstanceOf[js.Any]))
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

  /**
    * <p/>
    */
  @js.native
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

  object RestoreDBClusterToPointInTimeMessage {
    @inline
    def apply(
        DBClusterIdentifier: String,
        SourceDBClusterIdentifier: String,
        BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
        DBClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        DBSubnetGroupName: js.UndefOr[String] = js.undefined,
        DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        DomainIAMRoleName: js.UndefOr[String] = js.undefined,
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

      BacktrackWindow.foreach(__v => __obj.updateDynamic("BacktrackWindow")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("DBClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "DBSnapshotIdentifier" -> DBSnapshotIdentifier.asInstanceOf[js.Any]
      )

      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnableCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      TdeCredentialPassword.foreach(__v => __obj.updateDynamic("TdeCredentialPassword")(__v.asInstanceOf[js.Any]))
      UseDefaultProcessorFeatures.foreach(__v =>
        __obj.updateDynamic("UseDefaultProcessorFeatures")(__v.asInstanceOf[js.Any])
      )
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBInstanceFromDBSnapshotMessage]
    }
  }

  @js.native
  trait RestoreDBInstanceFromDBSnapshotResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceFromDBSnapshotResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): RestoreDBInstanceFromDBSnapshotResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBInstanceFromDBSnapshotResult]
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "DBInstanceClass"      -> DBInstanceClass.asInstanceOf[js.Any],
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "Engine"               -> Engine.asInstanceOf[js.Any],
        "S3BucketName"         -> S3BucketName.asInstanceOf[js.Any],
        "S3IngestionRoleArn"   -> S3IngestionRoleArn.asInstanceOf[js.Any],
        "SourceEngine"         -> SourceEngine.asInstanceOf[js.Any],
        "SourceEngineVersion"  -> SourceEngineVersion.asInstanceOf[js.Any]
      )

      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      DBSecurityGroups.foreach(__v => __obj.updateDynamic("DBSecurityGroups")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
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
      PerformanceInsightsRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      S3Prefix.foreach(__v => __obj.updateDynamic("S3Prefix")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UseDefaultProcessorFeatures.foreach(__v =>
        __obj.updateDynamic("UseDefaultProcessorFeatures")(__v.asInstanceOf[js.Any])
      )
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBInstanceFromS3Message]
    }
  }

  @js.native
  trait RestoreDBInstanceFromS3Result extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceFromS3Result {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): RestoreDBInstanceFromS3Result = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBInstanceFromS3Result]
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "TargetDBInstanceIdentifier" -> TargetDBInstanceIdentifier.asInstanceOf[js.Any]
      )

      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      DBParameterGroupName.foreach(__v => __obj.updateDynamic("DBParameterGroupName")(__v.asInstanceOf[js.Any]))
      DBSubnetGroupName.foreach(__v => __obj.updateDynamic("DBSubnetGroupName")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      DomainIAMRoleName.foreach(__v => __obj.updateDynamic("DomainIAMRoleName")(__v.asInstanceOf[js.Any]))
      EnableCloudwatchLogsExports.foreach(__v =>
        __obj.updateDynamic("EnableCloudwatchLogsExports")(__v.asInstanceOf[js.Any])
      )
      EnableIAMDatabaseAuthentication.foreach(__v =>
        __obj.updateDynamic("EnableIAMDatabaseAuthentication")(__v.asInstanceOf[js.Any])
      )
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      RestoreTime.foreach(__v => __obj.updateDynamic("RestoreTime")(__v.asInstanceOf[js.Any]))
      SourceDBInstanceIdentifier.foreach(__v =>
        __obj.updateDynamic("SourceDBInstanceIdentifier")(__v.asInstanceOf[js.Any])
      )
      SourceDbiResourceId.foreach(__v => __obj.updateDynamic("SourceDbiResourceId")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      TdeCredentialPassword.foreach(__v => __obj.updateDynamic("TdeCredentialPassword")(__v.asInstanceOf[js.Any]))
      UseDefaultProcessorFeatures.foreach(__v =>
        __obj.updateDynamic("UseDefaultProcessorFeatures")(__v.asInstanceOf[js.Any])
      )
      UseLatestRestorableTime.foreach(__v => __obj.updateDynamic("UseLatestRestorableTime")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBInstanceToPointInTimeMessage]
    }
  }

  @js.native
  trait RestoreDBInstanceToPointInTimeResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object RestoreDBInstanceToPointInTimeResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): RestoreDBInstanceToPointInTimeResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreDBInstanceToPointInTimeResult]
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
    @inline
    def apply(
        EarliestTime: js.UndefOr[TStamp] = js.undefined,
        LatestTime: js.UndefOr[TStamp] = js.undefined
    ): RestoreWindow = {
      val __obj = js.Dynamic.literal()
      EarliestTime.foreach(__v => __obj.updateDynamic("EarliestTime")(__v.asInstanceOf[js.Any]))
      LatestTime.foreach(__v => __obj.updateDynamic("LatestTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreWindow]
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
    @inline
    def apply(
        DBSecurityGroupName: String,
        CIDRIP: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): RevokeDBSecurityGroupIngressMessage = {
      val __obj = js.Dynamic.literal(
        "DBSecurityGroupName" -> DBSecurityGroupName.asInstanceOf[js.Any]
      )

      CIDRIP.foreach(__v => __obj.updateDynamic("CIDRIP")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupId")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupName.foreach(__v => __obj.updateDynamic("EC2SecurityGroupName")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupOwnerId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupOwnerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeDBSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup]
  }

  object RevokeDBSecurityGroupIngressResult {
    @inline
    def apply(
        DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
    ): RevokeDBSecurityGroupIngressResult = {
      val __obj = js.Dynamic.literal()
      DBSecurityGroup.foreach(__v => __obj.updateDynamic("DBSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeDBSecurityGroupIngressResult]
    }
  }

  /**
    * Contains the scaling configuration of an Aurora Serverless DB cluster.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html|Using Amazon Aurora Serverless]] in the <i>Amazon Aurora User Guide</i>.
    */
  @js.native
  trait ScalingConfiguration extends js.Object {
    var AutoPause: js.UndefOr[BooleanOptional]
    var MaxCapacity: js.UndefOr[IntegerOptional]
    var MinCapacity: js.UndefOr[IntegerOptional]
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  object ScalingConfiguration {
    @inline
    def apply(
        AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
        MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
        MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
        SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined,
        TimeoutAction: js.UndefOr[String] = js.undefined
    ): ScalingConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoPause.foreach(__v => __obj.updateDynamic("AutoPause")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MinCapacity.foreach(__v => __obj.updateDynamic("MinCapacity")(__v.asInstanceOf[js.Any]))
      SecondsUntilAutoPause.foreach(__v => __obj.updateDynamic("SecondsUntilAutoPause")(__v.asInstanceOf[js.Any]))
      TimeoutAction.foreach(__v => __obj.updateDynamic("TimeoutAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingConfiguration]
    }
  }

  /**
    * Shows the scaling configuration for an Aurora DB cluster in <code>serverless</code> DB engine mode.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html|Using Amazon Aurora Serverless]] in the <i>Amazon Aurora User Guide</i>.
    */
  @js.native
  trait ScalingConfigurationInfo extends js.Object {
    var AutoPause: js.UndefOr[BooleanOptional]
    var MaxCapacity: js.UndefOr[IntegerOptional]
    var MinCapacity: js.UndefOr[IntegerOptional]
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional]
    var TimeoutAction: js.UndefOr[String]
  }

  object ScalingConfigurationInfo {
    @inline
    def apply(
        AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
        MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
        MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
        SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined,
        TimeoutAction: js.UndefOr[String] = js.undefined
    ): ScalingConfigurationInfo = {
      val __obj = js.Dynamic.literal()
      AutoPause.foreach(__v => __obj.updateDynamic("AutoPause")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MinCapacity.foreach(__v => __obj.updateDynamic("MinCapacity")(__v.asInstanceOf[js.Any]))
      SecondsUntilAutoPause.foreach(__v => __obj.updateDynamic("SecondsUntilAutoPause")(__v.asInstanceOf[js.Any]))
      TimeoutAction.foreach(__v => __obj.updateDynamic("TimeoutAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingConfigurationInfo]
    }
  }

  /**
    * Contains an AWS Region name as the result of a successful call to the <code>DescribeSourceRegions</code> action.
    */
  @js.native
  trait SourceRegion extends js.Object {
    var Endpoint: js.UndefOr[String]
    var RegionName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object SourceRegion {
    @inline
    def apply(
        Endpoint: js.UndefOr[String] = js.undefined,
        RegionName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): SourceRegion = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      RegionName.foreach(__v => __obj.updateDynamic("RegionName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceRegion]
    }
  }

  /**
    * Contains the result of a successful invocation of the <code>DescribeSourceRegions</code> action.
    */
  @js.native
  trait SourceRegionMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SourceRegions: js.UndefOr[SourceRegionList]
  }

  object SourceRegionMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        SourceRegions: js.UndefOr[SourceRegionList] = js.undefined
    ): SourceRegionMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      SourceRegions.foreach(__v => __obj.updateDynamic("SourceRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceRegionMessage]
    }
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
  trait StartActivityStreamRequest extends js.Object {
    var KmsKeyId: String
    var Mode: ActivityStreamMode
    var ResourceArn: String
    var ApplyImmediately: js.UndefOr[BooleanOptional]
  }

  object StartActivityStreamRequest {
    @inline
    def apply(
        KmsKeyId: String,
        Mode: ActivityStreamMode,
        ResourceArn: String,
        ApplyImmediately: js.UndefOr[BooleanOptional] = js.undefined
    ): StartActivityStreamRequest = {
      val __obj = js.Dynamic.literal(
        "KmsKeyId"    -> KmsKeyId.asInstanceOf[js.Any],
        "Mode"        -> Mode.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartActivityStreamRequest]
    }
  }

  @js.native
  trait StartActivityStreamResponse extends js.Object {
    var ApplyImmediately: js.UndefOr[Boolean]
    var KinesisStreamName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Mode: js.UndefOr[ActivityStreamMode]
    var Status: js.UndefOr[ActivityStreamStatus]
  }

  object StartActivityStreamResponse {
    @inline
    def apply(
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        KinesisStreamName: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Mode: js.UndefOr[ActivityStreamMode] = js.undefined,
        Status: js.UndefOr[ActivityStreamStatus] = js.undefined
    ): StartActivityStreamResponse = {
      val __obj = js.Dynamic.literal()
      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      KinesisStreamName.foreach(__v => __obj.updateDynamic("KinesisStreamName")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartActivityStreamResponse]
    }
  }

  @js.native
  trait StartDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  object StartDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String
    ): StartDBClusterMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): StartDBClusterResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDBClusterResult]
    }
  }

  @js.native
  trait StartDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
  }

  object StartDBInstanceMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String
    ): StartDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartDBInstanceMessage]
    }
  }

  @js.native
  trait StartDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object StartDBInstanceResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): StartDBInstanceResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDBInstanceResult]
    }
  }

  @js.native
  trait StartExportTaskMessage extends js.Object {
    var ExportTaskIdentifier: String
    var IamRoleArn: String
    var KmsKeyId: String
    var S3BucketName: String
    var SourceArn: String
    var ExportOnly: js.UndefOr[StringList]
    var S3Prefix: js.UndefOr[String]
  }

  object StartExportTaskMessage {
    @inline
    def apply(
        ExportTaskIdentifier: String,
        IamRoleArn: String,
        KmsKeyId: String,
        S3BucketName: String,
        SourceArn: String,
        ExportOnly: js.UndefOr[StringList] = js.undefined,
        S3Prefix: js.UndefOr[String] = js.undefined
    ): StartExportTaskMessage = {
      val __obj = js.Dynamic.literal(
        "ExportTaskIdentifier" -> ExportTaskIdentifier.asInstanceOf[js.Any],
        "IamRoleArn"           -> IamRoleArn.asInstanceOf[js.Any],
        "KmsKeyId"             -> KmsKeyId.asInstanceOf[js.Any],
        "S3BucketName"         -> S3BucketName.asInstanceOf[js.Any],
        "SourceArn"            -> SourceArn.asInstanceOf[js.Any]
      )

      ExportOnly.foreach(__v => __obj.updateDynamic("ExportOnly")(__v.asInstanceOf[js.Any]))
      S3Prefix.foreach(__v => __obj.updateDynamic("S3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartExportTaskMessage]
    }
  }

  @js.native
  trait StopActivityStreamRequest extends js.Object {
    var ResourceArn: String
    var ApplyImmediately: js.UndefOr[BooleanOptional]
  }

  object StopActivityStreamRequest {
    @inline
    def apply(
        ResourceArn: String,
        ApplyImmediately: js.UndefOr[BooleanOptional] = js.undefined
    ): StopActivityStreamRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopActivityStreamRequest]
    }
  }

  @js.native
  trait StopActivityStreamResponse extends js.Object {
    var KinesisStreamName: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Status: js.UndefOr[ActivityStreamStatus]
  }

  object StopActivityStreamResponse {
    @inline
    def apply(
        KinesisStreamName: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ActivityStreamStatus] = js.undefined
    ): StopActivityStreamResponse = {
      val __obj = js.Dynamic.literal()
      KinesisStreamName.foreach(__v => __obj.updateDynamic("KinesisStreamName")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopActivityStreamResponse]
    }
  }

  @js.native
  trait StopDBClusterMessage extends js.Object {
    var DBClusterIdentifier: String
  }

  object StopDBClusterMessage {
    @inline
    def apply(
        DBClusterIdentifier: String
    ): StopDBClusterMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DBCluster: js.UndefOr[DBCluster] = js.undefined
    ): StopDBClusterResult = {
      val __obj = js.Dynamic.literal()
      DBCluster.foreach(__v => __obj.updateDynamic("DBCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDBClusterResult]
    }
  }

  @js.native
  trait StopDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var DBSnapshotIdentifier: js.UndefOr[String]
  }

  object StopDBInstanceMessage {
    @inline
    def apply(
        DBInstanceIdentifier: String,
        DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): StopDBInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any]
      )

      DBSnapshotIdentifier.foreach(__v => __obj.updateDynamic("DBSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDBInstanceMessage]
    }
  }

  @js.native
  trait StopDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance]
  }

  object StopDBInstanceResult {
    @inline
    def apply(
        DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): StopDBInstanceResult = {
      val __obj = js.Dynamic.literal()
      DBInstance.foreach(__v => __obj.updateDynamic("DBInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDBInstanceResult]
    }
  }

  /**
    * This data type is used as a response element for the <code>DescribeDBSubnetGroups</code> operation.
    */
  @js.native
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetOutpost: js.UndefOr[Outpost]
    var SubnetStatus: js.UndefOr[String]
  }

  object Subnet {
    @inline
    def apply(
        SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        SubnetIdentifier: js.UndefOr[String] = js.undefined,
        SubnetOutpost: js.UndefOr[Outpost] = js.undefined,
        SubnetStatus: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dynamic.literal()
      SubnetAvailabilityZone.foreach(__v => __obj.updateDynamic("SubnetAvailabilityZone")(__v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.updateDynamic("SubnetIdentifier")(__v.asInstanceOf[js.Any]))
      SubnetOutpost.foreach(__v => __obj.updateDynamic("SubnetOutpost")(__v.asInstanceOf[js.Any]))
      SubnetStatus.foreach(__v => __obj.updateDynamic("SubnetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subnet]
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

  /**
    * <p/>
    */
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
    * Information about the connection health of an RDS Proxy target.
    */
  @js.native
  trait TargetHealth extends js.Object {
    var Description: js.UndefOr[String]
    var Reason: js.UndefOr[TargetHealthReason]
    var State: js.UndefOr[TargetState]
  }

  object TargetHealth {
    @inline
    def apply(
        Description: js.UndefOr[String] = js.undefined,
        Reason: js.UndefOr[TargetHealthReason] = js.undefined,
        State: js.UndefOr[TargetState] = js.undefined
    ): TargetHealth = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetHealth]
    }
  }

  @js.native
  sealed trait TargetHealthReason extends js.Any
  object TargetHealthReason extends js.Object {
    val UNREACHABLE            = "UNREACHABLE".asInstanceOf[TargetHealthReason]
    val CONNECTION_FAILED      = "CONNECTION_FAILED".asInstanceOf[TargetHealthReason]
    val AUTH_FAILURE           = "AUTH_FAILURE".asInstanceOf[TargetHealthReason]
    val PENDING_PROXY_CAPACITY = "PENDING_PROXY_CAPACITY".asInstanceOf[TargetHealthReason]

    val values = js.Object.freeze(js.Array(UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE, PENDING_PROXY_CAPACITY))
  }

  @js.native
  sealed trait TargetState extends js.Any
  object TargetState extends js.Object {
    val REGISTERING = "REGISTERING".asInstanceOf[TargetState]
    val AVAILABLE   = "AVAILABLE".asInstanceOf[TargetState]
    val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[TargetState]

    val values = js.Object.freeze(js.Array(REGISTERING, AVAILABLE, UNAVAILABLE))
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
    * Specifies the details of authentication used by a proxy to log in as a specific database user.
    */
  @js.native
  trait UserAuthConfig extends js.Object {
    var AuthScheme: js.UndefOr[AuthScheme]
    var Description: js.UndefOr[String]
    var IAMAuth: js.UndefOr[IAMAuthMode]
    var SecretArn: js.UndefOr[String]
    var UserName: js.UndefOr[String]
  }

  object UserAuthConfig {
    @inline
    def apply(
        AuthScheme: js.UndefOr[AuthScheme] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IAMAuth: js.UndefOr[IAMAuthMode] = js.undefined,
        SecretArn: js.UndefOr[String] = js.undefined,
        UserName: js.UndefOr[String] = js.undefined
    ): UserAuthConfig = {
      val __obj = js.Dynamic.literal()
      AuthScheme.foreach(__v => __obj.updateDynamic("AuthScheme")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IAMAuth.foreach(__v => __obj.updateDynamic("IAMAuth")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserAuthConfig]
    }
  }

  /**
    * Returns the details of authentication used by a proxy to log in as a specific database user.
    */
  @js.native
  trait UserAuthConfigInfo extends js.Object {
    var AuthScheme: js.UndefOr[AuthScheme]
    var Description: js.UndefOr[String]
    var IAMAuth: js.UndefOr[IAMAuthMode]
    var SecretArn: js.UndefOr[String]
    var UserName: js.UndefOr[String]
  }

  object UserAuthConfigInfo {
    @inline
    def apply(
        AuthScheme: js.UndefOr[AuthScheme] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IAMAuth: js.UndefOr[IAMAuthMode] = js.undefined,
        SecretArn: js.UndefOr[String] = js.undefined,
        UserName: js.UndefOr[String] = js.undefined
    ): UserAuthConfigInfo = {
      val __obj = js.Dynamic.literal()
      AuthScheme.foreach(__v => __obj.updateDynamic("AuthScheme")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IAMAuth.foreach(__v => __obj.updateDynamic("IAMAuth")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserAuthConfigInfo]
    }
  }

  /**
    * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <code>DescribeValidDBInstanceModifications</code> action. You can use this information when you call <code>ModifyDBInstance</code>.
    */
  @js.native
  trait ValidDBInstanceModificationsMessage extends js.Object {
    var Storage: js.UndefOr[ValidStorageOptionsList]
    var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList]
  }

  object ValidDBInstanceModificationsMessage {
    @inline
    def apply(
        Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined,
        ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined
    ): ValidDBInstanceModificationsMessage = {
      val __obj = js.Dynamic.literal()
      Storage.foreach(__v => __obj.updateDynamic("Storage")(__v.asInstanceOf[js.Any]))
      ValidProcessorFeatures.foreach(__v => __obj.updateDynamic("ValidProcessorFeatures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidDBInstanceModificationsMessage]
    }
  }

  /**
    * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call to the <code>DescribeValidDBInstanceModifications</code> action.
    */
  @js.native
  trait ValidStorageOptions extends js.Object {
    var IopsToStorageRatio: js.UndefOr[DoubleRangeList]
    var ProvisionedIops: js.UndefOr[RangeList]
    var StorageSize: js.UndefOr[RangeList]
    var StorageType: js.UndefOr[String]
    var SupportsStorageAutoscaling: js.UndefOr[Boolean]
  }

  object ValidStorageOptions {
    @inline
    def apply(
        IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.undefined,
        ProvisionedIops: js.UndefOr[RangeList] = js.undefined,
        StorageSize: js.UndefOr[RangeList] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined,
        SupportsStorageAutoscaling: js.UndefOr[Boolean] = js.undefined
    ): ValidStorageOptions = {
      val __obj = js.Dynamic.literal()
      IopsToStorageRatio.foreach(__v => __obj.updateDynamic("IopsToStorageRatio")(__v.asInstanceOf[js.Any]))
      ProvisionedIops.foreach(__v => __obj.updateDynamic("ProvisionedIops")(__v.asInstanceOf[js.Any]))
      StorageSize.foreach(__v => __obj.updateDynamic("StorageSize")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      SupportsStorageAutoscaling.foreach(__v =>
        __obj.updateDynamic("SupportsStorageAutoscaling")(__v.asInstanceOf[js.Any])
      )
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

  /**
    * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
    *  For more information about RDS on VMware, see the <a href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> <i>RDS on VMware User Guide.</i> </a>
    */
  @js.native
  trait VpnDetails extends js.Object {
    var VpnGatewayIp: js.UndefOr[String]
    var VpnId: js.UndefOr[String]
    var VpnName: js.UndefOr[String]
    var VpnPSK: js.UndefOr[StringSensitive]
    var VpnState: js.UndefOr[String]
    var VpnTunnelOriginatorIP: js.UndefOr[String]
  }

  object VpnDetails {
    @inline
    def apply(
        VpnGatewayIp: js.UndefOr[String] = js.undefined,
        VpnId: js.UndefOr[String] = js.undefined,
        VpnName: js.UndefOr[String] = js.undefined,
        VpnPSK: js.UndefOr[StringSensitive] = js.undefined,
        VpnState: js.UndefOr[String] = js.undefined,
        VpnTunnelOriginatorIP: js.UndefOr[String] = js.undefined
    ): VpnDetails = {
      val __obj = js.Dynamic.literal()
      VpnGatewayIp.foreach(__v => __obj.updateDynamic("VpnGatewayIp")(__v.asInstanceOf[js.Any]))
      VpnId.foreach(__v => __obj.updateDynamic("VpnId")(__v.asInstanceOf[js.Any]))
      VpnName.foreach(__v => __obj.updateDynamic("VpnName")(__v.asInstanceOf[js.Any]))
      VpnPSK.foreach(__v => __obj.updateDynamic("VpnPSK")(__v.asInstanceOf[js.Any]))
      VpnState.foreach(__v => __obj.updateDynamic("VpnState")(__v.asInstanceOf[js.Any]))
      VpnTunnelOriginatorIP.foreach(__v => __obj.updateDynamic("VpnTunnelOriginatorIP")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpnDetails]
    }
  }

  @js.native
  sealed trait WriteForwardingStatus extends js.Any
  object WriteForwardingStatus extends js.Object {
    val enabled   = "enabled".asInstanceOf[WriteForwardingStatus]
    val disabled  = "disabled".asInstanceOf[WriteForwardingStatus]
    val enabling  = "enabling".asInstanceOf[WriteForwardingStatus]
    val disabling = "disabling".asInstanceOf[WriteForwardingStatus]
    val unknown   = "unknown".asInstanceOf[WriteForwardingStatus]

    val values = js.Object.freeze(js.Array(enabled, disabled, enabling, disabling, unknown))
  }
}
