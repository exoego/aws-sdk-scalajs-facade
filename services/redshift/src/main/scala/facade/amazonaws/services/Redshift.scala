package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object redshift {
  type AccountsWithRestoreAccessList      = js.Array[AccountWithRestoreAccess]
  type AssociatedClusterList              = js.Array[ClusterAssociatedToSchedule]
  type AttributeList                      = js.Array[AccountAttribute]
  type AttributeNameList                  = js.Array[String]
  type AttributeValueList                 = js.Array[AttributeValueTarget]
  type AvailabilityZoneList               = js.Array[AvailabilityZone]
  type BatchSnapshotOperationErrorList    = js.Array[SnapshotErrorMessage]
  type BatchSnapshotOperationErrors       = js.Array[SnapshotErrorMessage]
  type BooleanOptional                    = Boolean
  type ClusterDbRevisionsList             = js.Array[ClusterDbRevision]
  type ClusterIamRoleList                 = js.Array[ClusterIamRole]
  type ClusterList                        = js.Array[Cluster]
  type ClusterNodesList                   = js.Array[ClusterNode]
  type ClusterParameterGroupStatusList    = js.Array[ClusterParameterGroupStatus]
  type ClusterParameterStatusList         = js.Array[ClusterParameterStatus]
  type ClusterSecurityGroupMembershipList = js.Array[ClusterSecurityGroupMembership]
  type ClusterSecurityGroupNameList       = js.Array[String]
  type ClusterSecurityGroups              = js.Array[ClusterSecurityGroup]
  type ClusterSubnetGroups                = js.Array[ClusterSubnetGroup]
  type ClusterVersionList                 = js.Array[ClusterVersion]
  type DbGroupList                        = js.Array[String]
  type DeferredMaintenanceWindowsList     = js.Array[DeferredMaintenanceWindow]
  type DeleteClusterSnapshotMessageList   = js.Array[DeleteClusterSnapshotMessage]
  type DoubleOptional                     = Double
  type EC2SecurityGroupList               = js.Array[EC2SecurityGroup]
  type EligibleTracksToUpdateList         = js.Array[UpdateTarget]
  type EventCategoriesList                = js.Array[String]
  type EventCategoriesMapList             = js.Array[EventCategoriesMap]
  type EventInfoMapList                   = js.Array[EventInfoMap]
  type EventList                          = js.Array[Event]
  type EventSubscriptionsList             = js.Array[EventSubscription]
  type HsmClientCertificateList           = js.Array[HsmClientCertificate]
  type HsmConfigurationList               = js.Array[HsmConfiguration]
  type IPRangeList                        = js.Array[IPRange]
  type IamRoleArnList                     = js.Array[String]
  type ImportTablesCompleted              = js.Array[String]
  type ImportTablesInProgress             = js.Array[String]
  type ImportTablesNotStarted             = js.Array[String]
  type IntegerOptional                    = Int
  type LongOptional                       = Double
  type NodeConfigurationOptionList        = js.Array[NodeConfigurationOption]
  type NodeConfigurationOptionsFilterList = js.Array[NodeConfigurationOptionsFilter]
  type OrderableClusterOptionsList        = js.Array[OrderableClusterOption]
  type ParameterGroupList                 = js.Array[ClusterParameterGroup]
  type ParametersList                     = js.Array[Parameter]
  type PendingActionsList                 = js.Array[String]
  type RecurringChargeList                = js.Array[RecurringCharge]
  type ReservedNodeList                   = js.Array[ReservedNode]
  type ReservedNodeOfferingList           = js.Array[ReservedNodeOffering]
  type RestorableNodeTypeList             = js.Array[String]
  type RevisionTargetsList                = js.Array[RevisionTarget]
  type ScheduleDefinitionList             = js.Array[String]
  type ScheduledActionFilterList          = js.Array[ScheduledActionFilter]
  type ScheduledActionList                = js.Array[ScheduledAction]
  type ScheduledActionTimeList            = js.Array[TStamp]
  type ScheduledSnapshotTimeList          = js.Array[TStamp]
  type SensitiveString                    = String
  type SnapshotCopyGrantList              = js.Array[SnapshotCopyGrant]
  type SnapshotIdentifierList             = js.Array[String]
  type SnapshotList                       = js.Array[Snapshot]
  type SnapshotScheduleList               = js.Array[SnapshotSchedule]
  type SnapshotSortingEntityList          = js.Array[SnapshotSortingEntity]
  type SourceIdsList                      = js.Array[String]
  type SubnetIdentifierList               = js.Array[String]
  type SubnetList                         = js.Array[Subnet]
  type SupportedOperationList             = js.Array[SupportedOperation]
  type SupportedPlatformsList             = js.Array[SupportedPlatform]
  type TStamp                             = js.Date
  type TableRestoreStatusList             = js.Array[TableRestoreStatus]
  type TagKeyList                         = js.Array[String]
  type TagList                            = js.Array[Tag]
  type TagValueList                       = js.Array[String]
  type TaggedResourceList                 = js.Array[TaggedResource]
  type TrackList                          = js.Array[MaintenanceTrack]
  type ValueStringList                    = js.Array[String]
  type VpcSecurityGroupIdList             = js.Array[String]
  type VpcSecurityGroupMembershipList     = js.Array[VpcSecurityGroupMembership]

  implicit final class RedshiftOps(private val service: Redshift) extends AnyVal {

    @inline def acceptReservedNodeExchangeFuture(
        params: AcceptReservedNodeExchangeInputMessage
    ): Future[AcceptReservedNodeExchangeOutputMessage] = service.acceptReservedNodeExchange(params).promise().toFuture
    @inline def authorizeClusterSecurityGroupIngressFuture(
        params: AuthorizeClusterSecurityGroupIngressMessage
    ): Future[AuthorizeClusterSecurityGroupIngressResult] =
      service.authorizeClusterSecurityGroupIngress(params).promise().toFuture
    @inline def authorizeSnapshotAccessFuture(
        params: AuthorizeSnapshotAccessMessage
    ): Future[AuthorizeSnapshotAccessResult] = service.authorizeSnapshotAccess(params).promise().toFuture
    @inline def batchDeleteClusterSnapshotsFuture(
        params: BatchDeleteClusterSnapshotsRequest
    ): Future[BatchDeleteClusterSnapshotsResult] = service.batchDeleteClusterSnapshots(params).promise().toFuture
    @inline def batchModifyClusterSnapshotsFuture(
        params: BatchModifyClusterSnapshotsMessage
    ): Future[BatchModifyClusterSnapshotsOutputMessage] = service.batchModifyClusterSnapshots(params).promise().toFuture
    @inline def cancelResizeFuture(params: CancelResizeMessage): Future[ResizeProgressMessage] =
      service.cancelResize(params).promise().toFuture
    @inline def copyClusterSnapshotFuture(params: CopyClusterSnapshotMessage): Future[CopyClusterSnapshotResult] =
      service.copyClusterSnapshot(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterMessage): Future[CreateClusterResult] =
      service.createCluster(params).promise().toFuture
    @inline def createClusterParameterGroupFuture(
        params: CreateClusterParameterGroupMessage
    ): Future[CreateClusterParameterGroupResult] = service.createClusterParameterGroup(params).promise().toFuture
    @inline def createClusterSecurityGroupFuture(
        params: CreateClusterSecurityGroupMessage
    ): Future[CreateClusterSecurityGroupResult] = service.createClusterSecurityGroup(params).promise().toFuture
    @inline def createClusterSnapshotFuture(params: CreateClusterSnapshotMessage): Future[CreateClusterSnapshotResult] =
      service.createClusterSnapshot(params).promise().toFuture
    @inline def createClusterSubnetGroupFuture(
        params: CreateClusterSubnetGroupMessage
    ): Future[CreateClusterSubnetGroupResult] = service.createClusterSubnetGroup(params).promise().toFuture
    @inline def createEventSubscriptionFuture(
        params: CreateEventSubscriptionMessage
    ): Future[CreateEventSubscriptionResult] = service.createEventSubscription(params).promise().toFuture
    @inline def createHsmClientCertificateFuture(
        params: CreateHsmClientCertificateMessage
    ): Future[CreateHsmClientCertificateResult] = service.createHsmClientCertificate(params).promise().toFuture
    @inline def createHsmConfigurationFuture(
        params: CreateHsmConfigurationMessage
    ): Future[CreateHsmConfigurationResult] = service.createHsmConfiguration(params).promise().toFuture
    @inline def createScheduledActionFuture(params: CreateScheduledActionMessage): Future[ScheduledAction] =
      service.createScheduledAction(params).promise().toFuture
    @inline def createSnapshotCopyGrantFuture(
        params: CreateSnapshotCopyGrantMessage
    ): Future[CreateSnapshotCopyGrantResult] = service.createSnapshotCopyGrant(params).promise().toFuture
    @inline def createSnapshotScheduleFuture(params: CreateSnapshotScheduleMessage): Future[SnapshotSchedule] =
      service.createSnapshotSchedule(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsMessage): Future[js.Object] =
      service.createTags(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterMessage): Future[DeleteClusterResult] =
      service.deleteCluster(params).promise().toFuture
    @inline def deleteClusterParameterGroupFuture(params: DeleteClusterParameterGroupMessage): Future[js.Object] =
      service.deleteClusterParameterGroup(params).promise().toFuture
    @inline def deleteClusterSecurityGroupFuture(params: DeleteClusterSecurityGroupMessage): Future[js.Object] =
      service.deleteClusterSecurityGroup(params).promise().toFuture
    @inline def deleteClusterSnapshotFuture(params: DeleteClusterSnapshotMessage): Future[DeleteClusterSnapshotResult] =
      service.deleteClusterSnapshot(params).promise().toFuture
    @inline def deleteClusterSubnetGroupFuture(params: DeleteClusterSubnetGroupMessage): Future[js.Object] =
      service.deleteClusterSubnetGroup(params).promise().toFuture
    @inline def deleteEventSubscriptionFuture(params: DeleteEventSubscriptionMessage): Future[js.Object] =
      service.deleteEventSubscription(params).promise().toFuture
    @inline def deleteHsmClientCertificateFuture(params: DeleteHsmClientCertificateMessage): Future[js.Object] =
      service.deleteHsmClientCertificate(params).promise().toFuture
    @inline def deleteHsmConfigurationFuture(params: DeleteHsmConfigurationMessage): Future[js.Object] =
      service.deleteHsmConfiguration(params).promise().toFuture
    @inline def deleteScheduledActionFuture(params: DeleteScheduledActionMessage): Future[js.Object] =
      service.deleteScheduledAction(params).promise().toFuture
    @inline def deleteSnapshotCopyGrantFuture(params: DeleteSnapshotCopyGrantMessage): Future[js.Object] =
      service.deleteSnapshotCopyGrant(params).promise().toFuture
    @inline def deleteSnapshotScheduleFuture(params: DeleteSnapshotScheduleMessage): Future[js.Object] =
      service.deleteSnapshotSchedule(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsMessage): Future[js.Object] =
      service.deleteTags(params).promise().toFuture
    @inline def describeAccountAttributesFuture(
        params: DescribeAccountAttributesMessage
    ): Future[AccountAttributeList] = service.describeAccountAttributes(params).promise().toFuture
    @inline def describeClusterDbRevisionsFuture(
        params: DescribeClusterDbRevisionsMessage
    ): Future[ClusterDbRevisionsMessage] = service.describeClusterDbRevisions(params).promise().toFuture
    @inline def describeClusterParameterGroupsFuture(
        params: DescribeClusterParameterGroupsMessage
    ): Future[ClusterParameterGroupsMessage] = service.describeClusterParameterGroups(params).promise().toFuture
    @inline def describeClusterParametersFuture(
        params: DescribeClusterParametersMessage
    ): Future[ClusterParameterGroupDetails] = service.describeClusterParameters(params).promise().toFuture
    @inline def describeClusterSecurityGroupsFuture(
        params: DescribeClusterSecurityGroupsMessage
    ): Future[ClusterSecurityGroupMessage] = service.describeClusterSecurityGroups(params).promise().toFuture
    @inline def describeClusterSnapshotsFuture(params: DescribeClusterSnapshotsMessage): Future[SnapshotMessage] =
      service.describeClusterSnapshots(params).promise().toFuture
    @inline def describeClusterSubnetGroupsFuture(
        params: DescribeClusterSubnetGroupsMessage
    ): Future[ClusterSubnetGroupMessage] = service.describeClusterSubnetGroups(params).promise().toFuture
    @inline def describeClusterTracksFuture(params: DescribeClusterTracksMessage): Future[TrackListMessage] =
      service.describeClusterTracks(params).promise().toFuture
    @inline def describeClusterVersionsFuture(params: DescribeClusterVersionsMessage): Future[ClusterVersionsMessage] =
      service.describeClusterVersions(params).promise().toFuture
    @inline def describeClustersFuture(params: DescribeClustersMessage): Future[ClustersMessage] =
      service.describeClusters(params).promise().toFuture
    @inline def describeDefaultClusterParametersFuture(
        params: DescribeDefaultClusterParametersMessage
    ): Future[DescribeDefaultClusterParametersResult] =
      service.describeDefaultClusterParameters(params).promise().toFuture
    @inline def describeEventCategoriesFuture(params: DescribeEventCategoriesMessage): Future[EventCategoriesMessage] =
      service.describeEventCategories(params).promise().toFuture
    @inline def describeEventSubscriptionsFuture(
        params: DescribeEventSubscriptionsMessage
    ): Future[EventSubscriptionsMessage] = service.describeEventSubscriptions(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] =
      service.describeEvents(params).promise().toFuture
    @inline def describeHsmClientCertificatesFuture(
        params: DescribeHsmClientCertificatesMessage
    ): Future[HsmClientCertificateMessage] = service.describeHsmClientCertificates(params).promise().toFuture
    @inline def describeHsmConfigurationsFuture(
        params: DescribeHsmConfigurationsMessage
    ): Future[HsmConfigurationMessage] = service.describeHsmConfigurations(params).promise().toFuture
    @inline def describeLoggingStatusFuture(params: DescribeLoggingStatusMessage): Future[LoggingStatus] =
      service.describeLoggingStatus(params).promise().toFuture
    @inline def describeNodeConfigurationOptionsFuture(
        params: DescribeNodeConfigurationOptionsMessage
    ): Future[NodeConfigurationOptionsMessage] = service.describeNodeConfigurationOptions(params).promise().toFuture
    @inline def describeOrderableClusterOptionsFuture(
        params: DescribeOrderableClusterOptionsMessage
    ): Future[OrderableClusterOptionsMessage] = service.describeOrderableClusterOptions(params).promise().toFuture
    @inline def describeReservedNodeOfferingsFuture(
        params: DescribeReservedNodeOfferingsMessage
    ): Future[ReservedNodeOfferingsMessage] = service.describeReservedNodeOfferings(params).promise().toFuture
    @inline def describeReservedNodesFuture(params: DescribeReservedNodesMessage): Future[ReservedNodesMessage] =
      service.describeReservedNodes(params).promise().toFuture
    @inline def describeResizeFuture(params: DescribeResizeMessage): Future[ResizeProgressMessage] =
      service.describeResize(params).promise().toFuture
    @inline def describeScheduledActionsFuture(
        params: DescribeScheduledActionsMessage
    ): Future[ScheduledActionsMessage] = service.describeScheduledActions(params).promise().toFuture
    @inline def describeSnapshotCopyGrantsFuture(
        params: DescribeSnapshotCopyGrantsMessage
    ): Future[SnapshotCopyGrantMessage] = service.describeSnapshotCopyGrants(params).promise().toFuture
    @inline def describeSnapshotSchedulesFuture(
        params: DescribeSnapshotSchedulesMessage
    ): Future[DescribeSnapshotSchedulesOutputMessage]                   = service.describeSnapshotSchedules(params).promise().toFuture
    @inline def describeStorageFuture(): Future[CustomerStorageMessage] = service.describeStorage().promise().toFuture
    @inline def describeTableRestoreStatusFuture(
        params: DescribeTableRestoreStatusMessage
    ): Future[TableRestoreStatusMessage] = service.describeTableRestoreStatus(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsMessage): Future[TaggedResourceListMessage] =
      service.describeTags(params).promise().toFuture
    @inline def disableLoggingFuture(params: DisableLoggingMessage): Future[LoggingStatus] =
      service.disableLogging(params).promise().toFuture
    @inline def disableSnapshotCopyFuture(params: DisableSnapshotCopyMessage): Future[DisableSnapshotCopyResult] =
      service.disableSnapshotCopy(params).promise().toFuture
    @inline def enableLoggingFuture(params: EnableLoggingMessage): Future[LoggingStatus] =
      service.enableLogging(params).promise().toFuture
    @inline def enableSnapshotCopyFuture(params: EnableSnapshotCopyMessage): Future[EnableSnapshotCopyResult] =
      service.enableSnapshotCopy(params).promise().toFuture
    @inline def getClusterCredentialsFuture(params: GetClusterCredentialsMessage): Future[ClusterCredentials] =
      service.getClusterCredentials(params).promise().toFuture
    @inline def getReservedNodeExchangeOfferingsFuture(
        params: GetReservedNodeExchangeOfferingsInputMessage
    ): Future[GetReservedNodeExchangeOfferingsOutputMessage] =
      service.getReservedNodeExchangeOfferings(params).promise().toFuture
    @inline def modifyClusterDbRevisionFuture(
        params: ModifyClusterDbRevisionMessage
    ): Future[ModifyClusterDbRevisionResult] = service.modifyClusterDbRevision(params).promise().toFuture
    @inline def modifyClusterFuture(params: ModifyClusterMessage): Future[ModifyClusterResult] =
      service.modifyCluster(params).promise().toFuture
    @inline def modifyClusterIamRolesFuture(params: ModifyClusterIamRolesMessage): Future[ModifyClusterIamRolesResult] =
      service.modifyClusterIamRoles(params).promise().toFuture
    @inline def modifyClusterMaintenanceFuture(
        params: ModifyClusterMaintenanceMessage
    ): Future[ModifyClusterMaintenanceResult] = service.modifyClusterMaintenance(params).promise().toFuture
    @inline def modifyClusterParameterGroupFuture(
        params: ModifyClusterParameterGroupMessage
    ): Future[ClusterParameterGroupNameMessage] = service.modifyClusterParameterGroup(params).promise().toFuture
    @inline def modifyClusterSnapshotFuture(params: ModifyClusterSnapshotMessage): Future[ModifyClusterSnapshotResult] =
      service.modifyClusterSnapshot(params).promise().toFuture
    @inline def modifyClusterSnapshotScheduleFuture(params: ModifyClusterSnapshotScheduleMessage): Future[js.Object] =
      service.modifyClusterSnapshotSchedule(params).promise().toFuture
    @inline def modifyClusterSubnetGroupFuture(
        params: ModifyClusterSubnetGroupMessage
    ): Future[ModifyClusterSubnetGroupResult] = service.modifyClusterSubnetGroup(params).promise().toFuture
    @inline def modifyEventSubscriptionFuture(
        params: ModifyEventSubscriptionMessage
    ): Future[ModifyEventSubscriptionResult] = service.modifyEventSubscription(params).promise().toFuture
    @inline def modifyScheduledActionFuture(params: ModifyScheduledActionMessage): Future[ScheduledAction] =
      service.modifyScheduledAction(params).promise().toFuture
    @inline def modifySnapshotCopyRetentionPeriodFuture(
        params: ModifySnapshotCopyRetentionPeriodMessage
    ): Future[ModifySnapshotCopyRetentionPeriodResult] =
      service.modifySnapshotCopyRetentionPeriod(params).promise().toFuture
    @inline def modifySnapshotScheduleFuture(params: ModifySnapshotScheduleMessage): Future[SnapshotSchedule] =
      service.modifySnapshotSchedule(params).promise().toFuture
    @inline def purchaseReservedNodeOfferingFuture(
        params: PurchaseReservedNodeOfferingMessage
    ): Future[PurchaseReservedNodeOfferingResult] = service.purchaseReservedNodeOffering(params).promise().toFuture
    @inline def rebootClusterFuture(params: RebootClusterMessage): Future[RebootClusterResult] =
      service.rebootCluster(params).promise().toFuture
    @inline def resetClusterParameterGroupFuture(
        params: ResetClusterParameterGroupMessage
    ): Future[ClusterParameterGroupNameMessage] = service.resetClusterParameterGroup(params).promise().toFuture
    @inline def resizeClusterFuture(params: ResizeClusterMessage): Future[ResizeClusterResult] =
      service.resizeCluster(params).promise().toFuture
    @inline def restoreFromClusterSnapshotFuture(
        params: RestoreFromClusterSnapshotMessage
    ): Future[RestoreFromClusterSnapshotResult] = service.restoreFromClusterSnapshot(params).promise().toFuture
    @inline def restoreTableFromClusterSnapshotFuture(
        params: RestoreTableFromClusterSnapshotMessage
    ): Future[RestoreTableFromClusterSnapshotResult] =
      service.restoreTableFromClusterSnapshot(params).promise().toFuture
    @inline def revokeClusterSecurityGroupIngressFuture(
        params: RevokeClusterSecurityGroupIngressMessage
    ): Future[RevokeClusterSecurityGroupIngressResult] =
      service.revokeClusterSecurityGroupIngress(params).promise().toFuture
    @inline def revokeSnapshotAccessFuture(params: RevokeSnapshotAccessMessage): Future[RevokeSnapshotAccessResult] =
      service.revokeSnapshotAccess(params).promise().toFuture
    @inline def rotateEncryptionKeyFuture(params: RotateEncryptionKeyMessage): Future[RotateEncryptionKeyResult] =
      service.rotateEncryptionKey(params).promise().toFuture
  }
}

package redshift {
  @js.native
  @JSImport("aws-sdk", "Redshift")
  class Redshift() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptReservedNodeExchange(
        params: AcceptReservedNodeExchangeInputMessage
    ): Request[AcceptReservedNodeExchangeOutputMessage] = js.native
    def authorizeClusterSecurityGroupIngress(
        params: AuthorizeClusterSecurityGroupIngressMessage
    ): Request[AuthorizeClusterSecurityGroupIngressResult] = js.native
    def authorizeSnapshotAccess(params: AuthorizeSnapshotAccessMessage): Request[AuthorizeSnapshotAccessResult] =
      js.native
    def batchDeleteClusterSnapshots(
        params: BatchDeleteClusterSnapshotsRequest
    ): Request[BatchDeleteClusterSnapshotsResult] = js.native
    def batchModifyClusterSnapshots(
        params: BatchModifyClusterSnapshotsMessage
    ): Request[BatchModifyClusterSnapshotsOutputMessage]                                            = js.native
    def cancelResize(params: CancelResizeMessage): Request[ResizeProgressMessage]                   = js.native
    def copyClusterSnapshot(params: CopyClusterSnapshotMessage): Request[CopyClusterSnapshotResult] = js.native
    def createCluster(params: CreateClusterMessage): Request[CreateClusterResult]                   = js.native
    def createClusterParameterGroup(
        params: CreateClusterParameterGroupMessage
    ): Request[CreateClusterParameterGroupResult] = js.native
    def createClusterSecurityGroup(
        params: CreateClusterSecurityGroupMessage
    ): Request[CreateClusterSecurityGroupResult]                                                          = js.native
    def createClusterSnapshot(params: CreateClusterSnapshotMessage): Request[CreateClusterSnapshotResult] = js.native
    def createClusterSubnetGroup(params: CreateClusterSubnetGroupMessage): Request[CreateClusterSubnetGroupResult] =
      js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] =
      js.native
    def createHsmClientCertificate(
        params: CreateHsmClientCertificateMessage
    ): Request[CreateHsmClientCertificateResult]                                                             = js.native
    def createHsmConfiguration(params: CreateHsmConfigurationMessage): Request[CreateHsmConfigurationResult] = js.native
    def createScheduledAction(params: CreateScheduledActionMessage): Request[ScheduledAction]                = js.native
    def createSnapshotCopyGrant(params: CreateSnapshotCopyGrantMessage): Request[CreateSnapshotCopyGrantResult] =
      js.native
    def createSnapshotSchedule(params: CreateSnapshotScheduleMessage): Request[SnapshotSchedule]           = js.native
    def createTags(params: CreateTagsMessage): Request[js.Object]                                          = js.native
    def deleteCluster(params: DeleteClusterMessage): Request[DeleteClusterResult]                          = js.native
    def deleteClusterParameterGroup(params: DeleteClusterParameterGroupMessage): Request[js.Object]        = js.native
    def deleteClusterSecurityGroup(params: DeleteClusterSecurityGroupMessage): Request[js.Object]          = js.native
    def deleteClusterSnapshot(params: DeleteClusterSnapshotMessage): Request[DeleteClusterSnapshotResult]  = js.native
    def deleteClusterSubnetGroup(params: DeleteClusterSubnetGroupMessage): Request[js.Object]              = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[js.Object]                = js.native
    def deleteHsmClientCertificate(params: DeleteHsmClientCertificateMessage): Request[js.Object]          = js.native
    def deleteHsmConfiguration(params: DeleteHsmConfigurationMessage): Request[js.Object]                  = js.native
    def deleteScheduledAction(params: DeleteScheduledActionMessage): Request[js.Object]                    = js.native
    def deleteSnapshotCopyGrant(params: DeleteSnapshotCopyGrantMessage): Request[js.Object]                = js.native
    def deleteSnapshotSchedule(params: DeleteSnapshotScheduleMessage): Request[js.Object]                  = js.native
    def deleteTags(params: DeleteTagsMessage): Request[js.Object]                                          = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[AccountAttributeList] = js.native
    def describeClusterDbRevisions(params: DescribeClusterDbRevisionsMessage): Request[ClusterDbRevisionsMessage] =
      js.native
    def describeClusterParameterGroups(
        params: DescribeClusterParameterGroupsMessage
    ): Request[ClusterParameterGroupsMessage] = js.native
    def describeClusterParameters(params: DescribeClusterParametersMessage): Request[ClusterParameterGroupDetails] =
      js.native
    def describeClusterSecurityGroups(
        params: DescribeClusterSecurityGroupsMessage
    ): Request[ClusterSecurityGroupMessage]                                                         = js.native
    def describeClusterSnapshots(params: DescribeClusterSnapshotsMessage): Request[SnapshotMessage] = js.native
    def describeClusterSubnetGroups(params: DescribeClusterSubnetGroupsMessage): Request[ClusterSubnetGroupMessage] =
      js.native
    def describeClusterTracks(params: DescribeClusterTracksMessage): Request[TrackListMessage]           = js.native
    def describeClusterVersions(params: DescribeClusterVersionsMessage): Request[ClusterVersionsMessage] = js.native
    def describeClusters(params: DescribeClustersMessage): Request[ClustersMessage]                      = js.native
    def describeDefaultClusterParameters(
        params: DescribeDefaultClusterParametersMessage
    ): Request[DescribeDefaultClusterParametersResult]                                                   = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage] =
      js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeHsmClientCertificates(
        params: DescribeHsmClientCertificatesMessage
    ): Request[HsmClientCertificateMessage] = js.native
    def describeHsmConfigurations(params: DescribeHsmConfigurationsMessage): Request[HsmConfigurationMessage] =
      js.native
    def describeLoggingStatus(params: DescribeLoggingStatusMessage): Request[LoggingStatus] = js.native
    def describeNodeConfigurationOptions(
        params: DescribeNodeConfigurationOptionsMessage
    ): Request[NodeConfigurationOptionsMessage] = js.native
    def describeOrderableClusterOptions(
        params: DescribeOrderableClusterOptionsMessage
    ): Request[OrderableClusterOptionsMessage] = js.native
    def describeReservedNodeOfferings(
        params: DescribeReservedNodeOfferingsMessage
    ): Request[ReservedNodeOfferingsMessage]                                                                = js.native
    def describeReservedNodes(params: DescribeReservedNodesMessage): Request[ReservedNodesMessage]          = js.native
    def describeResize(params: DescribeResizeMessage): Request[ResizeProgressMessage]                       = js.native
    def describeScheduledActions(params: DescribeScheduledActionsMessage): Request[ScheduledActionsMessage] = js.native
    def describeSnapshotCopyGrants(params: DescribeSnapshotCopyGrantsMessage): Request[SnapshotCopyGrantMessage] =
      js.native
    def describeSnapshotSchedules(
        params: DescribeSnapshotSchedulesMessage
    ): Request[DescribeSnapshotSchedulesOutputMessage]     = js.native
    def describeStorage(): Request[CustomerStorageMessage] = js.native
    def describeTableRestoreStatus(params: DescribeTableRestoreStatusMessage): Request[TableRestoreStatusMessage] =
      js.native
    def describeTags(params: DescribeTagsMessage): Request[TaggedResourceListMessage]               = js.native
    def disableLogging(params: DisableLoggingMessage): Request[LoggingStatus]                       = js.native
    def disableSnapshotCopy(params: DisableSnapshotCopyMessage): Request[DisableSnapshotCopyResult] = js.native
    def enableLogging(params: EnableLoggingMessage): Request[LoggingStatus]                         = js.native
    def enableSnapshotCopy(params: EnableSnapshotCopyMessage): Request[EnableSnapshotCopyResult]    = js.native
    def getClusterCredentials(params: GetClusterCredentialsMessage): Request[ClusterCredentials]    = js.native
    def getReservedNodeExchangeOfferings(
        params: GetReservedNodeExchangeOfferingsInputMessage
    ): Request[GetReservedNodeExchangeOfferingsOutputMessage]                     = js.native
    def modifyCluster(params: ModifyClusterMessage): Request[ModifyClusterResult] = js.native
    def modifyClusterDbRevision(params: ModifyClusterDbRevisionMessage): Request[ModifyClusterDbRevisionResult] =
      js.native
    def modifyClusterIamRoles(params: ModifyClusterIamRolesMessage): Request[ModifyClusterIamRolesResult] = js.native
    def modifyClusterMaintenance(params: ModifyClusterMaintenanceMessage): Request[ModifyClusterMaintenanceResult] =
      js.native
    def modifyClusterParameterGroup(
        params: ModifyClusterParameterGroupMessage
    ): Request[ClusterParameterGroupNameMessage]                                                          = js.native
    def modifyClusterSnapshot(params: ModifyClusterSnapshotMessage): Request[ModifyClusterSnapshotResult] = js.native
    def modifyClusterSnapshotSchedule(params: ModifyClusterSnapshotScheduleMessage): Request[js.Object]   = js.native
    def modifyClusterSubnetGroup(params: ModifyClusterSubnetGroupMessage): Request[ModifyClusterSubnetGroupResult] =
      js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult] =
      js.native
    def modifyScheduledAction(params: ModifyScheduledActionMessage): Request[ScheduledAction] = js.native
    def modifySnapshotCopyRetentionPeriod(
        params: ModifySnapshotCopyRetentionPeriodMessage
    ): Request[ModifySnapshotCopyRetentionPeriodResult]                                          = js.native
    def modifySnapshotSchedule(params: ModifySnapshotScheduleMessage): Request[SnapshotSchedule] = js.native
    def purchaseReservedNodeOffering(
        params: PurchaseReservedNodeOfferingMessage
    ): Request[PurchaseReservedNodeOfferingResult]                                = js.native
    def rebootCluster(params: RebootClusterMessage): Request[RebootClusterResult] = js.native
    def resetClusterParameterGroup(
        params: ResetClusterParameterGroupMessage
    ): Request[ClusterParameterGroupNameMessage]                                  = js.native
    def resizeCluster(params: ResizeClusterMessage): Request[ResizeClusterResult] = js.native
    def restoreFromClusterSnapshot(
        params: RestoreFromClusterSnapshotMessage
    ): Request[RestoreFromClusterSnapshotResult] = js.native
    def restoreTableFromClusterSnapshot(
        params: RestoreTableFromClusterSnapshotMessage
    ): Request[RestoreTableFromClusterSnapshotResult] = js.native
    def revokeClusterSecurityGroupIngress(
        params: RevokeClusterSecurityGroupIngressMessage
    ): Request[RevokeClusterSecurityGroupIngressResult]                                                = js.native
    def revokeSnapshotAccess(params: RevokeSnapshotAccessMessage): Request[RevokeSnapshotAccessResult] = js.native
    def rotateEncryptionKey(params: RotateEncryptionKeyMessage): Request[RotateEncryptionKeyResult]    = js.native
  }

  @js.native
  @Factory
  trait AcceptReservedNodeExchangeInputMessage extends js.Object {
    var ReservedNodeId: String
    var TargetReservedNodeOfferingId: String
  }

  @js.native
  @Factory
  trait AcceptReservedNodeExchangeOutputMessage extends js.Object {
    var ExchangedReservedNode: js.UndefOr[ReservedNode]
  }

  /**
    * A name value pair that describes an aspect of an account.
    */
  @js.native
  @Factory
  trait AccountAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  @js.native
  @Factory
  trait AccountAttributeList extends js.Object {
    var AccountAttributes: js.UndefOr[AttributeList]
  }

  /**
    * Describes an AWS customer account authorized to restore a snapshot.
    */
  @js.native
  @Factory
  trait AccountWithRestoreAccess extends js.Object {
    var AccountAlias: js.UndefOr[String]
    var AccountId: js.UndefOr[String]
  }

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType extends js.Object {
    val `restore-cluster`       = "restore-cluster".asInstanceOf[ActionType]
    val `recommend-node-config` = "recommend-node-config".asInstanceOf[ActionType]
    val `resize-cluster`        = "resize-cluster".asInstanceOf[ActionType]

    val values = js.Object.freeze(js.Array(`restore-cluster`, `recommend-node-config`, `resize-cluster`))
  }

  /**
    * Describes an attribute value.
    */
  @js.native
  @Factory
  trait AttributeValueTarget extends js.Object {
    var AttributeValue: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AuthorizeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AuthorizeSnapshotAccessMessage extends js.Object {
    var AccountWithRestoreAccess: String
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AuthorizeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  /**
    * Describes an availability zone.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
    var SupportedPlatforms: js.UndefOr[SupportedPlatformsList]
  }

  @js.native
  @Factory
  trait BatchDeleteClusterSnapshotsRequest extends js.Object {
    var Identifiers: DeleteClusterSnapshotMessageList
  }

  @js.native
  @Factory
  trait BatchDeleteClusterSnapshotsResult extends js.Object {
    var Errors: js.UndefOr[BatchSnapshotOperationErrorList]
    var Resources: js.UndefOr[SnapshotIdentifierList]
  }

  @js.native
  @Factory
  trait BatchModifyClusterSnapshotsMessage extends js.Object {
    var SnapshotIdentifierList: SnapshotIdentifierList
    var Force: js.UndefOr[Boolean]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
    var Errors: js.UndefOr[BatchSnapshotOperationErrors]
    var Resources: js.UndefOr[SnapshotIdentifierList]
  }

  @js.native
  @Factory
  trait CancelResizeMessage extends js.Object {
    var ClusterIdentifier: String
  }

  /**
    * Describes a cluster.
    */
  @js.native
  @Factory
  trait Cluster extends js.Object {
    var AllowVersionUpgrade: js.UndefOr[Boolean]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[Int]
    var AvailabilityZone: js.UndefOr[String]
    var ClusterAvailabilityStatus: js.UndefOr[String]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var ClusterIdentifier: js.UndefOr[String]
    var ClusterNodes: js.UndefOr[ClusterNodesList]
    var ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList]
    var ClusterPublicKey: js.UndefOr[String]
    var ClusterRevisionNumber: js.UndefOr[String]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList]
    var ClusterSnapshotCopyStatus: js.UndefOr[ClusterSnapshotCopyStatus]
    var ClusterStatus: js.UndefOr[String]
    var ClusterSubnetGroupName: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var DataTransferProgress: js.UndefOr[DataTransferProgress]
    var DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList]
    var ElasticIpStatus: js.UndefOr[ElasticIpStatus]
    var ElasticResizeNumberOfNodeOptions: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var Endpoint: js.UndefOr[Endpoint]
    var EnhancedVpcRouting: js.UndefOr[Boolean]
    var ExpectedNextSnapshotScheduleTime: js.UndefOr[TStamp]
    var ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[String]
    var HsmStatus: js.UndefOr[HsmStatus]
    var IamRoles: js.UndefOr[ClusterIamRoleList]
    var KmsKeyId: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[Int]
    var MasterUsername: js.UndefOr[String]
    var ModifyStatus: js.UndefOr[String]
    var NextMaintenanceWindowStartTime: js.UndefOr[TStamp]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[Int]
    var PendingActions: js.UndefOr[PendingActionsList]
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var ResizeInfo: js.UndefOr[ResizeInfo]
    var RestoreStatus: js.UndefOr[RestoreStatus]
    var SnapshotScheduleIdentifier: js.UndefOr[String]
    var SnapshotScheduleState: js.UndefOr[ScheduleState]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ClusterAssociatedToSchedule extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var ScheduleAssociationState: js.UndefOr[ScheduleState]
  }

  /**
    * Temporary credentials with authorization to log on to an Amazon Redshift database.
    */
  @js.native
  @Factory
  trait ClusterCredentials extends js.Object {
    var DbPassword: js.UndefOr[SensitiveString]
    var DbUser: js.UndefOr[String]
    var Expiration: js.UndefOr[TStamp]
  }

  /**
    * Describes a <code>ClusterDbRevision</code>.
    */
  @js.native
  @Factory
  trait ClusterDbRevision extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var CurrentDatabaseRevision: js.UndefOr[String]
    var DatabaseRevisionReleaseDate: js.UndefOr[TStamp]
    var RevisionTargets: js.UndefOr[RevisionTargetsList]
  }

  @js.native
  @Factory
  trait ClusterDbRevisionsMessage extends js.Object {
    var ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList]
    var Marker: js.UndefOr[String]
  }

  /**
    * An AWS Identity and Access Management (IAM) role that can be used by the associated Amazon Redshift cluster to access other AWS services.
    */
  @js.native
  @Factory
  trait ClusterIamRole extends js.Object {
    var ApplyStatus: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[String]
  }

  /**
    * The identifier of a node in a cluster.
    */
  @js.native
  @Factory
  trait ClusterNode extends js.Object {
    var NodeRole: js.UndefOr[String]
    var PrivateIPAddress: js.UndefOr[String]
    var PublicIPAddress: js.UndefOr[String]
  }

  /**
    * Describes a parameter group.
    */
  @js.native
  @Factory
  trait ClusterParameterGroup extends js.Object {
    var Description: js.UndefOr[String]
    var ParameterGroupFamily: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Contains the output from the <a>DescribeClusterParameters</a> action.
    */
  @js.native
  @Factory
  trait ClusterParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ClusterParameterGroupNameMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var ParameterGroupStatus: js.UndefOr[String]
  }

  /**
    * Describes the status of a parameter group.
    */
  @js.native
  @Factory
  trait ClusterParameterGroupStatus extends js.Object {
    var ClusterParameterStatusList: js.UndefOr[ClusterParameterStatusList]
    var ParameterApplyStatus: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
  }

  /**
    * Contains the output from the <a>DescribeClusterParameterGroups</a> action.
    */
  @js.native
  @Factory
  trait ClusterParameterGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ParameterGroups: js.UndefOr[ParameterGroupList]
  }

  /**
    * Describes the status of a parameter group.
    */
  @js.native
  @Factory
  trait ClusterParameterStatus extends js.Object {
    var ParameterApplyErrorDescription: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
  }

  /**
    * Describes a security group.
    */
  @js.native
  @Factory
  trait ClusterSecurityGroup extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var IPRanges: js.UndefOr[IPRangeList]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes a cluster security group.
    */
  @js.native
  @Factory
  trait ClusterSecurityGroupMembership extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups]
    var Marker: js.UndefOr[String]
  }

  /**
    * Returns the destination region and retention period that are configured for cross-region snapshot copy.
    */
  @js.native
  @Factory
  trait ClusterSnapshotCopyStatus extends js.Object {
    var DestinationRegion: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[Int]
    var RetentionPeriod: js.UndefOr[Double]
    var SnapshotCopyGrantName: js.UndefOr[String]
  }

  /**
    * Describes a subnet group.
    */
  @js.native
  @Factory
  trait ClusterSubnetGroup extends js.Object {
    var ClusterSubnetGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Contains the output from the <a>DescribeClusterSubnetGroups</a> action.
    */
  @js.native
  @Factory
  trait ClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  /**
    * Describes a cluster version, including the parameter group family and description of the version.
    */
  @js.native
  @Factory
  trait ClusterVersion extends js.Object {
    var ClusterParameterGroupFamily: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  /**
    * Contains the output from the <a>DescribeClusterVersions</a> action.
    */
  @js.native
  @Factory
  trait ClusterVersionsMessage extends js.Object {
    var ClusterVersions: js.UndefOr[ClusterVersionList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Contains the output from the <a>DescribeClusters</a> action.
    */
  @js.native
  @Factory
  trait ClustersMessage extends js.Object {
    var Clusters: js.UndefOr[ClusterList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CopyClusterSnapshotMessage extends js.Object {
    var SourceSnapshotIdentifier: String
    var TargetSnapshotIdentifier: String
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var SourceSnapshotClusterIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CopyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateClusterMessage extends js.Object {
    var ClusterIdentifier: String
    var MasterUserPassword: String
    var MasterUsername: String
    var NodeType: String
    var AdditionalInfo: js.UndefOr[String]
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var AvailabilityZone: js.UndefOr[String]
    var ClusterParameterGroupName: js.UndefOr[String]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList]
    var ClusterSubnetGroupName: js.UndefOr[String]
    var ClusterType: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var DBName: js.UndefOr[String]
    var ElasticIp: js.UndefOr[String]
    var Encrypted: js.UndefOr[BooleanOptional]
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional]
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var IamRoles: js.UndefOr[IamRoleArnList]
    var KmsKeyId: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var NumberOfNodes: js.UndefOr[IntegerOptional]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var SnapshotScheduleIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateClusterParameterGroupMessage extends js.Object {
    var Description: String
    var ParameterGroupFamily: String
    var ParameterGroupName: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateClusterParameterGroupResult extends js.Object {
    var ClusterParameterGroup: js.UndefOr[ClusterParameterGroup]
  }

  @js.native
  @Factory
  trait CreateClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var Description: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateClusterSecurityGroupResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateClusterSnapshotMessage extends js.Object {
    var ClusterIdentifier: String
    var SnapshotIdentifier: String
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
    var Description: String
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup]
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
    var Severity: js.UndefOr[String]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateHsmClientCertificateResult extends js.Object {
    var HsmClientCertificate: js.UndefOr[HsmClientCertificate]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateHsmConfigurationMessage extends js.Object {
    var Description: String
    var HsmConfigurationIdentifier: String
    var HsmIpAddress: String
    var HsmPartitionName: String
    var HsmPartitionPassword: String
    var HsmServerPublicCertificate: String
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateHsmConfigurationResult extends js.Object {
    var HsmConfiguration: js.UndefOr[HsmConfiguration]
  }

  @js.native
  @Factory
  trait CreateScheduledActionMessage extends js.Object {
    var IamRole: String
    var Schedule: String
    var ScheduledActionName: String
    var TargetAction: ScheduledActionType
    var Enable: js.UndefOr[BooleanOptional]
    var EndTime: js.UndefOr[TStamp]
    var ScheduledActionDescription: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
  }

  /**
    * The result of the <code>CreateSnapshotCopyGrant</code> action.
    */
  @js.native
  @Factory
  trait CreateSnapshotCopyGrantMessage extends js.Object {
    var SnapshotCopyGrantName: String
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateSnapshotCopyGrantResult extends js.Object {
    var SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant]
  }

  @js.native
  @Factory
  trait CreateSnapshotScheduleMessage extends js.Object {
    var DryRun: js.UndefOr[BooleanOptional]
    var NextInvocations: js.UndefOr[IntegerOptional]
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList]
    var ScheduleDescription: js.UndefOr[String]
    var ScheduleIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Contains the output from the <code>CreateTags</code> action.
    */
  @js.native
  @Factory
  trait CreateTagsMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  @js.native
  @Factory
  trait CustomerStorageMessage extends js.Object {
    var TotalBackupSizeInMegaBytes: js.UndefOr[Double]
    var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double]
  }

  /**
    * Describes the status of a cluster while it is in the process of resizing with an incremental resize.
    */
  @js.native
  @Factory
  trait DataTransferProgress extends js.Object {
    var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional]
    var DataTransferredInMegaBytes: js.UndefOr[Double]
    var ElapsedTimeInSeconds: js.UndefOr[LongOptional]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional]
    var Status: js.UndefOr[String]
    var TotalDataInMegaBytes: js.UndefOr[Double]
  }

  /**
    * Describes the default cluster parameters for a parameter group family.
    */
  @js.native
  @Factory
  trait DefaultClusterParameters extends js.Object {
    var Marker: js.UndefOr[String]
    var ParameterGroupFamily: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  /**
    * Describes a deferred maintenance window
    */
  @js.native
  @Factory
  trait DeferredMaintenanceWindow extends js.Object {
    var DeferMaintenanceEndTime: js.UndefOr[TStamp]
    var DeferMaintenanceIdentifier: js.UndefOr[String]
    var DeferMaintenanceStartTime: js.UndefOr[TStamp]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteClusterMessage extends js.Object {
    var ClusterIdentifier: String
    var FinalClusterSnapshotIdentifier: js.UndefOr[String]
    var FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var SkipFinalClusterSnapshot: js.UndefOr[Boolean]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
  }

  @js.native
  @Factory
  trait DeleteClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroupName: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteHsmConfigurationMessage extends js.Object {
    var HsmConfigurationIdentifier: String
  }

  @js.native
  @Factory
  trait DeleteScheduledActionMessage extends js.Object {
    var ScheduledActionName: String
  }

  /**
    * The result of the <code>DeleteSnapshotCopyGrant</code> action.
    */
  @js.native
  @Factory
  trait DeleteSnapshotCopyGrantMessage extends js.Object {
    var SnapshotCopyGrantName: String
  }

  @js.native
  @Factory
  trait DeleteSnapshotScheduleMessage extends js.Object {
    var ScheduleIdentifier: String
  }

  /**
    * Contains the output from the <code>DeleteTags</code> action.
    */
  @js.native
  @Factory
  trait DeleteTagsMessage extends js.Object {
    var ResourceName: String
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait DescribeAccountAttributesMessage extends js.Object {
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  @js.native
  @Factory
  trait DescribeClusterDbRevisionsMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeClusterParameterGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ParameterGroupName: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeClusterParametersMessage extends js.Object {
    var ParameterGroupName: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeClusterSecurityGroupsMessage extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeClusterSnapshotsMessage extends js.Object {
    var ClusterExists: js.UndefOr[BooleanOptional]
    var ClusterIdentifier: js.UndefOr[String]
    var EndTime: js.UndefOr[TStamp]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var OwnerAccount: js.UndefOr[String]
    var SnapshotIdentifier: js.UndefOr[String]
    var SnapshotType: js.UndefOr[String]
    var SortingEntities: js.UndefOr[SnapshotSortingEntityList]
    var StartTime: js.UndefOr[TStamp]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeClusterSubnetGroupsMessage extends js.Object {
    var ClusterSubnetGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  @js.native
  @Factory
  trait DescribeClusterTracksMessage extends js.Object {
    var MaintenanceTrackName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeClusterVersionsMessage extends js.Object {
    var ClusterParameterGroupFamily: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeClustersMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeDefaultClusterParametersMessage extends js.Object {
    var ParameterGroupFamily: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeDefaultClusterParametersResult extends js.Object {
    var DefaultClusterParameters: js.UndefOr[DefaultClusterParameters]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventCategoriesMessage extends js.Object {
    var SourceType: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventsMessage extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var EndTime: js.UndefOr[TStamp]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var StartTime: js.UndefOr[TStamp]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeHsmClientCertificatesMessage extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeHsmConfigurationsMessage extends js.Object {
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeLoggingStatusMessage extends js.Object {
    var ClusterIdentifier: String
  }

  @js.native
  @Factory
  trait DescribeNodeConfigurationOptionsMessage extends js.Object {
    var ActionType: ActionType
    var ClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[NodeConfigurationOptionsFilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var OwnerAccount: js.UndefOr[String]
    var SnapshotIdentifier: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeOrderableClusterOptionsMessage extends js.Object {
    var ClusterVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var NodeType: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReservedNodeOfferingsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReservedNodeOfferingId: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReservedNodesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReservedNodeId: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeResizeMessage extends js.Object {
    var ClusterIdentifier: String
  }

  @js.native
  @Factory
  trait DescribeScheduledActionsMessage extends js.Object {
    var Active: js.UndefOr[BooleanOptional]
    var EndTime: js.UndefOr[TStamp]
    var Filters: js.UndefOr[ScheduledActionFilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ScheduledActionName: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var TargetActionType: js.UndefOr[ScheduledActionTypeValues]
  }

  /**
    * The result of the <code>DescribeSnapshotCopyGrants</code> action.
    */
  @js.native
  @Factory
  trait DescribeSnapshotCopyGrantsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SnapshotCopyGrantName: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  @js.native
  @Factory
  trait DescribeSnapshotSchedulesMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ScheduleIdentifier: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  @js.native
  @Factory
  trait DescribeSnapshotSchedulesOutputMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SnapshotSchedules: js.UndefOr[SnapshotScheduleList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTableRestoreStatusMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TableRestoreRequestId: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTagsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DisableLoggingMessage extends js.Object {
    var ClusterIdentifier: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DisableSnapshotCopyMessage extends js.Object {
    var ClusterIdentifier: String
  }

  @js.native
  @Factory
  trait DisableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * Describes an Amazon EC2 security group.
    */
  @js.native
  @Factory
  trait EC2SecurityGroup extends js.Object {
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes the status of the elastic IP (EIP) address.
    */
  @js.native
  @Factory
  trait ElasticIpStatus extends js.Object {
    var ElasticIp: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait EnableLoggingMessage extends js.Object {
    var BucketName: String
    var ClusterIdentifier: String
    var S3KeyPrefix: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait EnableSnapshotCopyMessage extends js.Object {
    var ClusterIdentifier: String
    var DestinationRegion: String
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var RetentionPeriod: js.UndefOr[IntegerOptional]
    var SnapshotCopyGrantName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait EnableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * Describes a connection endpoint.
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  /**
    * Describes an event.
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var EventId: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var Severity: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  /**
    * Describes event categories.
    */
  @js.native
  @Factory
  trait EventCategoriesMap extends js.Object {
    var Events: js.UndefOr[EventInfoMapList]
    var SourceType: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList]
  }

  /**
    * Describes event information.
    */
  @js.native
  @Factory
  trait EventInfoMap extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var EventDescription: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var Severity: js.UndefOr[String]
  }

  /**
    * Describes event subscriptions.
    */
  @js.native
  @Factory
  trait EventSubscription extends js.Object {
    var CustSubscriptionId: js.UndefOr[String]
    var CustomerAwsId: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var EventCategoriesList: js.UndefOr[EventCategoriesList]
    var Severity: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var SourceIdsList: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var SubscriptionCreationTime: js.UndefOr[TStamp]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait EventSubscriptionsMessage extends js.Object {
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait EventsMessage extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  /**
    * The request parameters to get cluster credentials.
    */
  @js.native
  @Factory
  trait GetClusterCredentialsMessage extends js.Object {
    var ClusterIdentifier: String
    var DbUser: String
    var AutoCreate: js.UndefOr[BooleanOptional]
    var DbGroups: js.UndefOr[DbGroupList]
    var DbName: js.UndefOr[String]
    var DurationSeconds: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetReservedNodeExchangeOfferingsInputMessage extends js.Object {
    var ReservedNodeId: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait GetReservedNodeExchangeOfferingsOutputMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList]
  }

  /**
    * Returns information about an HSM client certificate. The certificate is stored in a secure Hardware Storage Module (HSM), and used by the Amazon Redshift cluster to encrypt data files.
    */
  @js.native
  @Factory
  trait HsmClientCertificate extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmClientCertificatePublicKey: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait HsmClientCertificateMessage extends js.Object {
    var HsmClientCertificates: js.UndefOr[HsmClientCertificateList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Returns information about an HSM configuration, which is an object that describes to Amazon Redshift clusters the information they require to connect to an HSM where they can store database encryption keys.
    */
  @js.native
  @Factory
  trait HsmConfiguration extends js.Object {
    var Description: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var HsmIpAddress: js.UndefOr[String]
    var HsmPartitionName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait HsmConfigurationMessage extends js.Object {
    var HsmConfigurations: js.UndefOr[HsmConfigurationList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Describes the status of changes to HSM settings.
    */
  @js.native
  @Factory
  trait HsmStatus extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Describes an IP range used in a security group.
    */
  @js.native
  @Factory
  trait IPRange extends js.Object {
    var CIDRIP: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes the status of logging for a cluster.
    */
  @js.native
  @Factory
  trait LoggingStatus extends js.Object {
    var BucketName: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var LastFailureTime: js.UndefOr[TStamp]
    var LastSuccessfulDeliveryTime: js.UndefOr[TStamp]
    var LoggingEnabled: js.UndefOr[Boolean]
    var S3KeyPrefix: js.UndefOr[String]
  }

  /**
    * Defines a maintenance track that determines which Amazon Redshift version to apply during a maintenance window. If the value for <code>MaintenanceTrack</code> is <code>current</code>, the cluster is updated to the most recently certified maintenance release. If the value is <code>trailing</code>, the cluster is updated to the previously certified maintenance release.
    */
  @js.native
  @Factory
  trait MaintenanceTrack extends js.Object {
    var DatabaseVersion: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList]
  }

  @js.native
  sealed trait Mode extends js.Any
  object Mode extends js.Object {
    val standard           = "standard".asInstanceOf[Mode]
    val `high-performance` = "high-performance".asInstanceOf[Mode]

    val values = js.Object.freeze(js.Array(standard, `high-performance`))
  }

  @js.native
  @Factory
  trait ModifyClusterDbRevisionMessage extends js.Object {
    var ClusterIdentifier: String
    var RevisionTarget: String
  }

  @js.native
  @Factory
  trait ModifyClusterDbRevisionResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyClusterIamRolesMessage extends js.Object {
    var ClusterIdentifier: String
    var AddIamRoles: js.UndefOr[IamRoleArnList]
    var RemoveIamRoles: js.UndefOr[IamRoleArnList]
  }

  @js.native
  @Factory
  trait ModifyClusterIamRolesResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait ModifyClusterMaintenanceMessage extends js.Object {
    var ClusterIdentifier: String
    var DeferMaintenance: js.UndefOr[BooleanOptional]
    var DeferMaintenanceDuration: js.UndefOr[IntegerOptional]
    var DeferMaintenanceEndTime: js.UndefOr[TStamp]
    var DeferMaintenanceIdentifier: js.UndefOr[String]
    var DeferMaintenanceStartTime: js.UndefOr[TStamp]
  }

  @js.native
  @Factory
  trait ModifyClusterMaintenanceResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyClusterMessage extends js.Object {
    var ClusterIdentifier: String
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var ClusterParameterGroupName: js.UndefOr[String]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList]
    var ClusterType: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var ElasticIp: js.UndefOr[String]
    var Encrypted: js.UndefOr[BooleanOptional]
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional]
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var MasterUserPassword: js.UndefOr[String]
    var NewClusterIdentifier: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[IntegerOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
    var Parameters: ParametersList
  }

  @js.native
  @Factory
  trait ModifyClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait ModifyClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: String
    var Force: js.UndefOr[Boolean]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait ModifyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  @js.native
  @Factory
  trait ModifyClusterSnapshotScheduleMessage extends js.Object {
    var ClusterIdentifier: String
    var DisassociateSchedule: js.UndefOr[BooleanOptional]
    var ScheduleIdentifier: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Description: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup]
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
    var Severity: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  @js.native
  @Factory
  trait ModifyScheduledActionMessage extends js.Object {
    var ScheduledActionName: String
    var Enable: js.UndefOr[BooleanOptional]
    var EndTime: js.UndefOr[TStamp]
    var IamRole: js.UndefOr[String]
    var Schedule: js.UndefOr[String]
    var ScheduledActionDescription: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var TargetAction: js.UndefOr[ScheduledActionType]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifySnapshotCopyRetentionPeriodMessage extends js.Object {
    var ClusterIdentifier: String
    var RetentionPeriod: Int
    var Manual: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifySnapshotCopyRetentionPeriodResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait ModifySnapshotScheduleMessage extends js.Object {
    var ScheduleDefinitions: ScheduleDefinitionList
    var ScheduleIdentifier: String
  }

  /**
    * A list of node configurations.
    */
  @js.native
  @Factory
  trait NodeConfigurationOption extends js.Object {
    var EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional]
    var Mode: js.UndefOr[Mode]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[Int]
  }

  /**
    * A set of elements to filter the returned node configurations.
    */
  @js.native
  @Factory
  trait NodeConfigurationOptionsFilter extends js.Object {
    var Name: js.UndefOr[NodeConfigurationOptionsFilterName]
    var Operator: js.UndefOr[OperatorType]
    var Values: js.UndefOr[ValueStringList]
  }

  @js.native
  sealed trait NodeConfigurationOptionsFilterName extends js.Any
  object NodeConfigurationOptionsFilterName extends js.Object {
    val NodeType      = "NodeType".asInstanceOf[NodeConfigurationOptionsFilterName]
    val NumberOfNodes = "NumberOfNodes".asInstanceOf[NodeConfigurationOptionsFilterName]
    val EstimatedDiskUtilizationPercent =
      "EstimatedDiskUtilizationPercent".asInstanceOf[NodeConfigurationOptionsFilterName]
    val Mode = "Mode".asInstanceOf[NodeConfigurationOptionsFilterName]

    val values = js.Object.freeze(js.Array(NodeType, NumberOfNodes, EstimatedDiskUtilizationPercent, Mode))
  }

  @js.native
  @Factory
  trait NodeConfigurationOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var NodeConfigurationOptionList: js.UndefOr[NodeConfigurationOptionList]
  }

  @js.native
  sealed trait OperatorType extends js.Any
  object OperatorType extends js.Object {
    val eq      = "eq".asInstanceOf[OperatorType]
    val lt      = "lt".asInstanceOf[OperatorType]
    val gt      = "gt".asInstanceOf[OperatorType]
    val le      = "le".asInstanceOf[OperatorType]
    val ge      = "ge".asInstanceOf[OperatorType]
    val in      = "in".asInstanceOf[OperatorType]
    val between = "between".asInstanceOf[OperatorType]

    val values = js.Object.freeze(js.Array(eq, lt, gt, le, ge, in, between))
  }

  /**
    * Describes an orderable cluster option.
    */
  @js.native
  @Factory
  trait OrderableClusterOption extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var ClusterType: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
  }

  /**
    * Contains the output from the <a>DescribeOrderableClusterOptions</a> action.
    */
  @js.native
  @Factory
  trait OrderableClusterOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList]
  }

  /**
    * Describes a parameter in a cluster parameter group.
    */
  @js.native
  @Factory
  trait Parameter extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var ApplyType: js.UndefOr[ParameterApplyType]
    var DataType: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var IsModifiable: js.UndefOr[Boolean]
    var MinimumEngineVersion: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
    var Source: js.UndefOr[String]
  }

  @js.native
  sealed trait ParameterApplyType extends js.Any
  object ParameterApplyType extends js.Object {
    val static  = "static".asInstanceOf[ParameterApplyType]
    val dynamic = "dynamic".asInstanceOf[ParameterApplyType]

    val values = js.Object.freeze(js.Array(static, dynamic))
  }

  /**
    * Describes cluster attributes that are in a pending state. A change to one or more the attributes was requested and is in progress or will be applied.
    */
  @js.native
  @Factory
  trait PendingModifiedValues extends js.Object {
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var ClusterIdentifier: js.UndefOr[String]
    var ClusterType: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var EncryptionType: js.UndefOr[String]
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional]
    var MaintenanceTrackName: js.UndefOr[String]
    var MasterUserPassword: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[IntegerOptional]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait PurchaseReservedNodeOfferingMessage extends js.Object {
    var ReservedNodeOfferingId: String
    var NodeCount: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait PurchaseReservedNodeOfferingResult extends js.Object {
    var ReservedNode: js.UndefOr[ReservedNode]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RebootClusterMessage extends js.Object {
    var ClusterIdentifier: String
  }

  @js.native
  @Factory
  trait RebootClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * Describes a recurring charge.
    */
  @js.native
  @Factory
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  /**
    * Describes a reserved node. You can call the <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved node offerings.
    */
  @js.native
  @Factory
  trait ReservedNode extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var NodeCount: js.UndefOr[Int]
    var NodeType: js.UndefOr[String]
    var OfferingType: js.UndefOr[String]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedNodeId: js.UndefOr[String]
    var ReservedNodeOfferingId: js.UndefOr[String]
    var ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType]
    var StartTime: js.UndefOr[TStamp]
    var State: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
  }

  /**
    * Describes a reserved node offering.
    */
  @js.native
  @Factory
  trait ReservedNodeOffering extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var NodeType: js.UndefOr[String]
    var OfferingType: js.UndefOr[String]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedNodeOfferingId: js.UndefOr[String]
    var ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType]
    var UsagePrice: js.UndefOr[Double]
  }

  @js.native
  sealed trait ReservedNodeOfferingType extends js.Any
  object ReservedNodeOfferingType extends js.Object {
    val Regular    = "Regular".asInstanceOf[ReservedNodeOfferingType]
    val Upgradable = "Upgradable".asInstanceOf[ReservedNodeOfferingType]

    val values = js.Object.freeze(js.Array(Regular, Upgradable))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReservedNodeOfferingsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReservedNodesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodes: js.UndefOr[ReservedNodeList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ResetClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ResizeClusterMessage extends js.Object {
    var ClusterIdentifier: String
    var Classic: js.UndefOr[BooleanOptional]
    var ClusterType: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ResizeClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * Describes a resize operation.
    */
  @js.native
  @Factory
  trait ResizeInfo extends js.Object {
    var AllowCancelResize: js.UndefOr[Boolean]
    var ResizeType: js.UndefOr[String]
  }

  /**
    * Describes the result of a cluster resize operation.
    */
  @js.native
  @Factory
  trait ResizeProgressMessage extends js.Object {
    var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional]
    var DataTransferProgressPercent: js.UndefOr[DoubleOptional]
    var ElapsedTimeInSeconds: js.UndefOr[LongOptional]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional]
    var ImportTablesCompleted: js.UndefOr[ImportTablesCompleted]
    var ImportTablesInProgress: js.UndefOr[ImportTablesInProgress]
    var ImportTablesNotStarted: js.UndefOr[ImportTablesNotStarted]
    var Message: js.UndefOr[String]
    var ProgressInMegaBytes: js.UndefOr[LongOptional]
    var ResizeType: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var TargetClusterType: js.UndefOr[String]
    var TargetEncryptionType: js.UndefOr[String]
    var TargetNodeType: js.UndefOr[String]
    var TargetNumberOfNodes: js.UndefOr[IntegerOptional]
    var TotalResizeDataInMegaBytes: js.UndefOr[LongOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RestoreFromClusterSnapshotMessage extends js.Object {
    var ClusterIdentifier: String
    var SnapshotIdentifier: String
    var AdditionalInfo: js.UndefOr[String]
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var AvailabilityZone: js.UndefOr[String]
    var ClusterParameterGroupName: js.UndefOr[String]
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList]
    var ClusterSubnetGroupName: js.UndefOr[String]
    var ElasticIp: js.UndefOr[String]
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional]
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var IamRoles: js.UndefOr[IamRoleArnList]
    var KmsKeyId: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[IntegerOptional]
    var OwnerAccount: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var SnapshotClusterIdentifier: js.UndefOr[String]
    var SnapshotScheduleIdentifier: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  @js.native
  @Factory
  trait RestoreFromClusterSnapshotResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * Describes the status of a cluster restore action. Returns null if the cluster was not created by restoring a snapshot.
    */
  @js.native
  @Factory
  trait RestoreStatus extends js.Object {
    var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double]
    var ElapsedTimeInSeconds: js.UndefOr[Double]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[Double]
    var ProgressInMegaBytes: js.UndefOr[Double]
    var SnapshotSizeInMegaBytes: js.UndefOr[Double]
    var Status: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RestoreTableFromClusterSnapshotMessage extends js.Object {
    var ClusterIdentifier: String
    var NewTableName: String
    var SnapshotIdentifier: String
    var SourceDatabaseName: String
    var SourceTableName: String
    var SourceSchemaName: js.UndefOr[String]
    var TargetDatabaseName: js.UndefOr[String]
    var TargetSchemaName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RestoreTableFromClusterSnapshotResult extends js.Object {
    var TableRestoreStatus: js.UndefOr[TableRestoreStatus]
  }

  /**
    * Describes a <code>RevisionTarget</code>.
    */
  @js.native
  @Factory
  trait RevisionTarget extends js.Object {
    var DatabaseRevision: js.UndefOr[String]
    var DatabaseRevisionReleaseDate: js.UndefOr[TStamp]
    var Description: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RevokeClusterSecurityGroupIngressMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RevokeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RevokeSnapshotAccessMessage extends js.Object {
    var AccountWithRestoreAccess: String
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RevokeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RotateEncryptionKeyMessage extends js.Object {
    var ClusterIdentifier: String
  }

  @js.native
  @Factory
  trait RotateEncryptionKeyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  sealed trait ScheduleState extends js.Any
  object ScheduleState extends js.Object {
    val MODIFYING = "MODIFYING".asInstanceOf[ScheduleState]
    val ACTIVE    = "ACTIVE".asInstanceOf[ScheduleState]
    val FAILED    = "FAILED".asInstanceOf[ScheduleState]

    val values = js.Object.freeze(js.Array(MODIFYING, ACTIVE, FAILED))
  }

  /**
    * Describes a scheduled action. You can use a scheduled action to trigger some Amazon Redshift API operations on a schedule. For information about which API operations can be scheduled, see <a>ScheduledActionType</a>.
    */
  @js.native
  @Factory
  trait ScheduledAction extends js.Object {
    var EndTime: js.UndefOr[TStamp]
    var IamRole: js.UndefOr[String]
    var NextInvocations: js.UndefOr[ScheduledActionTimeList]
    var Schedule: js.UndefOr[String]
    var ScheduledActionDescription: js.UndefOr[String]
    var ScheduledActionName: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var State: js.UndefOr[ScheduledActionState]
    var TargetAction: js.UndefOr[ScheduledActionType]
  }

  /**
    * A set of elements to filter the returned scheduled actions.
    */
  @js.native
  @Factory
  trait ScheduledActionFilter extends js.Object {
    var Name: ScheduledActionFilterName
    var Values: ValueStringList
  }

  @js.native
  sealed trait ScheduledActionFilterName extends js.Any
  object ScheduledActionFilterName extends js.Object {
    val `cluster-identifier` = "cluster-identifier".asInstanceOf[ScheduledActionFilterName]
    val `iam-role`           = "iam-role".asInstanceOf[ScheduledActionFilterName]

    val values = js.Object.freeze(js.Array(`cluster-identifier`, `iam-role`))
  }

  @js.native
  sealed trait ScheduledActionState extends js.Any
  object ScheduledActionState extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[ScheduledActionState]
    val DISABLED = "DISABLED".asInstanceOf[ScheduledActionState]

    val values = js.Object.freeze(js.Array(ACTIVE, DISABLED))
  }

  /**
    * The action type that specifies an Amazon Redshift API operation that is supported by the Amazon Redshift scheduler.
    */
  @js.native
  @Factory
  trait ScheduledActionType extends js.Object {
    var ResizeCluster: js.UndefOr[ResizeClusterMessage]
  }

  @js.native
  sealed trait ScheduledActionTypeValues extends js.Any
  object ScheduledActionTypeValues extends js.Object {
    val ResizeCluster = "ResizeCluster".asInstanceOf[ScheduledActionTypeValues]

    val values = js.Object.freeze(js.Array(ResizeCluster))
  }

  @js.native
  @Factory
  trait ScheduledActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ScheduledActions: js.UndefOr[ScheduledActionList]
  }

  /**
    * Describes a snapshot.
    */
  @js.native
  @Factory
  trait Snapshot extends js.Object {
    var AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList]
    var ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double]
    var AvailabilityZone: js.UndefOr[String]
    var BackupProgressInMegaBytes: js.UndefOr[Double]
    var ClusterCreateTime: js.UndefOr[TStamp]
    var ClusterIdentifier: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double]
    var DBName: js.UndefOr[String]
    var ElapsedTimeInSeconds: js.UndefOr[Double]
    var Encrypted: js.UndefOr[Boolean]
    var EncryptedWithHSM: js.UndefOr[Boolean]
    var EnhancedVpcRouting: js.UndefOr[Boolean]
    var EstimatedSecondsToCompletion: js.UndefOr[Double]
    var KmsKeyId: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var MasterUsername: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[Int]
    var OwnerAccount: js.UndefOr[String]
    var Port: js.UndefOr[Int]
    var RestorableNodeTypes: js.UndefOr[RestorableNodeTypeList]
    var SnapshotCreateTime: js.UndefOr[TStamp]
    var SnapshotIdentifier: js.UndefOr[String]
    var SnapshotRetentionStartTime: js.UndefOr[TStamp]
    var SnapshotType: js.UndefOr[String]
    var SourceRegion: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TotalBackupSizeInMegaBytes: js.UndefOr[Double]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  sealed trait SnapshotAttributeToSortBy extends js.Any
  object SnapshotAttributeToSortBy extends js.Object {
    val SOURCE_TYPE = "SOURCE_TYPE".asInstanceOf[SnapshotAttributeToSortBy]
    val TOTAL_SIZE  = "TOTAL_SIZE".asInstanceOf[SnapshotAttributeToSortBy]
    val CREATE_TIME = "CREATE_TIME".asInstanceOf[SnapshotAttributeToSortBy]

    val values = js.Object.freeze(js.Array(SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME))
  }

  /**
    * The snapshot copy grant that grants Amazon Redshift permission to encrypt copied snapshots with the specified customer master key (CMK) from AWS KMS in the destination region.
    *  For more information about managing snapshot copy grants, go to [[https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html|Amazon Redshift Database Encryption]] in the <i>Amazon Redshift Cluster Management Guide</i>.
    */
  @js.native
  @Factory
  trait SnapshotCopyGrant extends js.Object {
    var KmsKeyId: js.UndefOr[String]
    var SnapshotCopyGrantName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait SnapshotCopyGrantMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList]
  }

  /**
    * Describes the errors returned by a snapshot.
    */
  @js.native
  @Factory
  trait SnapshotErrorMessage extends js.Object {
    var FailureCode: js.UndefOr[String]
    var FailureReason: js.UndefOr[String]
    var SnapshotClusterIdentifier: js.UndefOr[String]
    var SnapshotIdentifier: js.UndefOr[String]
  }

  /**
    * Contains the output from the <a>DescribeClusterSnapshots</a> action.
    */
  @js.native
  @Factory
  trait SnapshotMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Snapshots: js.UndefOr[SnapshotList]
  }

  /**
    * Describes a snapshot schedule. You can set a regular interval for creating snapshots of a cluster. You can also schedule snapshots for specific dates.
    */
  @js.native
  @Factory
  trait SnapshotSchedule extends js.Object {
    var AssociatedClusterCount: js.UndefOr[IntegerOptional]
    var AssociatedClusters: js.UndefOr[AssociatedClusterList]
    var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList]
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList]
    var ScheduleDescription: js.UndefOr[String]
    var ScheduleIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes a sorting entity
    */
  @js.native
  @Factory
  trait SnapshotSortingEntity extends js.Object {
    var Attribute: SnapshotAttributeToSortBy
    var SortOrder: js.UndefOr[SortByOrder]
  }

  @js.native
  sealed trait SortByOrder extends js.Any
  object SortByOrder extends js.Object {
    val ASC  = "ASC".asInstanceOf[SortByOrder]
    val DESC = "DESC".asInstanceOf[SortByOrder]

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val cluster                   = "cluster".asInstanceOf[SourceType]
    val `cluster-parameter-group` = "cluster-parameter-group".asInstanceOf[SourceType]
    val `cluster-security-group`  = "cluster-security-group".asInstanceOf[SourceType]
    val `cluster-snapshot`        = "cluster-snapshot".asInstanceOf[SourceType]
    val `scheduled-action`        = "scheduled-action".asInstanceOf[SourceType]

    val values = js.Object.freeze(
      js.Array(cluster, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, `scheduled-action`)
    )
  }

  /**
    * Describes a subnet.
    */
  @js.native
  @Factory
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetStatus: js.UndefOr[String]
  }

  /**
    * Describes the operations that are allowed on a maintenance track.
    */
  @js.native
  @Factory
  trait SupportedOperation extends js.Object {
    var OperationName: js.UndefOr[String]
  }

  /**
    * A list of supported platforms for orderable clusters.
    */
  @js.native
  @Factory
  trait SupportedPlatform extends js.Object {
    var Name: js.UndefOr[String]
  }

  /**
    * Describes the status of a <a>RestoreTableFromClusterSnapshot</a> operation.
    */
  @js.native
  @Factory
  trait TableRestoreStatus extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var NewTableName: js.UndefOr[String]
    var ProgressInMegaBytes: js.UndefOr[LongOptional]
    var RequestTime: js.UndefOr[TStamp]
    var SnapshotIdentifier: js.UndefOr[String]
    var SourceDatabaseName: js.UndefOr[String]
    var SourceSchemaName: js.UndefOr[String]
    var SourceTableName: js.UndefOr[String]
    var Status: js.UndefOr[TableRestoreStatusType]
    var TableRestoreRequestId: js.UndefOr[String]
    var TargetDatabaseName: js.UndefOr[String]
    var TargetSchemaName: js.UndefOr[String]
    var TotalDataInMegaBytes: js.UndefOr[LongOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TableRestoreStatusMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList]
  }

  @js.native
  sealed trait TableRestoreStatusType extends js.Any
  object TableRestoreStatusType extends js.Object {
    val PENDING     = "PENDING".asInstanceOf[TableRestoreStatusType]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TableRestoreStatusType]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[TableRestoreStatusType]
    val FAILED      = "FAILED".asInstanceOf[TableRestoreStatusType]
    val CANCELED    = "CANCELED".asInstanceOf[TableRestoreStatusType]

    val values = js.Object.freeze(js.Array(PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED))
  }

  /**
    * A tag consisting of a name/value pair for a resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * A tag and its associated resource.
    */
  @js.native
  @Factory
  trait TaggedResource extends js.Object {
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
    var Tag: js.UndefOr[Tag]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TaggedResourceListMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var TaggedResources: js.UndefOr[TaggedResourceList]
  }

  @js.native
  @Factory
  trait TrackListMessage extends js.Object {
    var MaintenanceTracks: js.UndefOr[TrackList]
    var Marker: js.UndefOr[String]
  }

  /**
    * A maintenance track that you can switch the current track to.
    */
  @js.native
  @Factory
  trait UpdateTarget extends js.Object {
    var DatabaseVersion: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var SupportedOperations: js.UndefOr[SupportedOperationList]
  }

  /**
    * Describes the members of a VPC security group.
    */
  @js.native
  @Factory
  trait VpcSecurityGroupMembership extends js.Object {
    var Status: js.UndefOr[String]
    var VpcSecurityGroupId: js.UndefOr[String]
  }
}
