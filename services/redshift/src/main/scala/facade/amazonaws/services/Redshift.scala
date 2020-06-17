package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
    ): Future[AcceptReservedNodeExchangeOutputMessage] = service.acceptReservedNodeExchange(params).promise.toFuture
    @inline def authorizeClusterSecurityGroupIngressFuture(
        params: AuthorizeClusterSecurityGroupIngressMessage
    ): Future[AuthorizeClusterSecurityGroupIngressResult] =
      service.authorizeClusterSecurityGroupIngress(params).promise.toFuture
    @inline def authorizeSnapshotAccessFuture(
        params: AuthorizeSnapshotAccessMessage
    ): Future[AuthorizeSnapshotAccessResult] = service.authorizeSnapshotAccess(params).promise.toFuture
    @inline def batchDeleteClusterSnapshotsFuture(
        params: BatchDeleteClusterSnapshotsRequest
    ): Future[BatchDeleteClusterSnapshotsResult] = service.batchDeleteClusterSnapshots(params).promise.toFuture
    @inline def batchModifyClusterSnapshotsFuture(
        params: BatchModifyClusterSnapshotsMessage
    ): Future[BatchModifyClusterSnapshotsOutputMessage] = service.batchModifyClusterSnapshots(params).promise.toFuture
    @inline def cancelResizeFuture(params: CancelResizeMessage): Future[ResizeProgressMessage] =
      service.cancelResize(params).promise.toFuture
    @inline def copyClusterSnapshotFuture(params: CopyClusterSnapshotMessage): Future[CopyClusterSnapshotResult] =
      service.copyClusterSnapshot(params).promise.toFuture
    @inline def createClusterFuture(params: CreateClusterMessage): Future[CreateClusterResult] =
      service.createCluster(params).promise.toFuture
    @inline def createClusterParameterGroupFuture(
        params: CreateClusterParameterGroupMessage
    ): Future[CreateClusterParameterGroupResult] = service.createClusterParameterGroup(params).promise.toFuture
    @inline def createClusterSecurityGroupFuture(
        params: CreateClusterSecurityGroupMessage
    ): Future[CreateClusterSecurityGroupResult] = service.createClusterSecurityGroup(params).promise.toFuture
    @inline def createClusterSnapshotFuture(params: CreateClusterSnapshotMessage): Future[CreateClusterSnapshotResult] =
      service.createClusterSnapshot(params).promise.toFuture
    @inline def createClusterSubnetGroupFuture(
        params: CreateClusterSubnetGroupMessage
    ): Future[CreateClusterSubnetGroupResult] = service.createClusterSubnetGroup(params).promise.toFuture
    @inline def createEventSubscriptionFuture(
        params: CreateEventSubscriptionMessage
    ): Future[CreateEventSubscriptionResult] = service.createEventSubscription(params).promise.toFuture
    @inline def createHsmClientCertificateFuture(
        params: CreateHsmClientCertificateMessage
    ): Future[CreateHsmClientCertificateResult] = service.createHsmClientCertificate(params).promise.toFuture
    @inline def createHsmConfigurationFuture(
        params: CreateHsmConfigurationMessage
    ): Future[CreateHsmConfigurationResult] = service.createHsmConfiguration(params).promise.toFuture
    @inline def createScheduledActionFuture(params: CreateScheduledActionMessage): Future[ScheduledAction] =
      service.createScheduledAction(params).promise.toFuture
    @inline def createSnapshotCopyGrantFuture(
        params: CreateSnapshotCopyGrantMessage
    ): Future[CreateSnapshotCopyGrantResult] = service.createSnapshotCopyGrant(params).promise.toFuture
    @inline def createSnapshotScheduleFuture(params: CreateSnapshotScheduleMessage): Future[SnapshotSchedule] =
      service.createSnapshotSchedule(params).promise.toFuture
    @inline def createTagsFuture(params: CreateTagsMessage): Future[js.Object] =
      service.createTags(params).promise.toFuture
    @inline def deleteClusterFuture(params: DeleteClusterMessage): Future[DeleteClusterResult] =
      service.deleteCluster(params).promise.toFuture
    @inline def deleteClusterParameterGroupFuture(params: DeleteClusterParameterGroupMessage): Future[js.Object] =
      service.deleteClusterParameterGroup(params).promise.toFuture
    @inline def deleteClusterSecurityGroupFuture(params: DeleteClusterSecurityGroupMessage): Future[js.Object] =
      service.deleteClusterSecurityGroup(params).promise.toFuture
    @inline def deleteClusterSnapshotFuture(params: DeleteClusterSnapshotMessage): Future[DeleteClusterSnapshotResult] =
      service.deleteClusterSnapshot(params).promise.toFuture
    @inline def deleteClusterSubnetGroupFuture(params: DeleteClusterSubnetGroupMessage): Future[js.Object] =
      service.deleteClusterSubnetGroup(params).promise.toFuture
    @inline def deleteEventSubscriptionFuture(params: DeleteEventSubscriptionMessage): Future[js.Object] =
      service.deleteEventSubscription(params).promise.toFuture
    @inline def deleteHsmClientCertificateFuture(params: DeleteHsmClientCertificateMessage): Future[js.Object] =
      service.deleteHsmClientCertificate(params).promise.toFuture
    @inline def deleteHsmConfigurationFuture(params: DeleteHsmConfigurationMessage): Future[js.Object] =
      service.deleteHsmConfiguration(params).promise.toFuture
    @inline def deleteScheduledActionFuture(params: DeleteScheduledActionMessage): Future[js.Object] =
      service.deleteScheduledAction(params).promise.toFuture
    @inline def deleteSnapshotCopyGrantFuture(params: DeleteSnapshotCopyGrantMessage): Future[js.Object] =
      service.deleteSnapshotCopyGrant(params).promise.toFuture
    @inline def deleteSnapshotScheduleFuture(params: DeleteSnapshotScheduleMessage): Future[js.Object] =
      service.deleteSnapshotSchedule(params).promise.toFuture
    @inline def deleteTagsFuture(params: DeleteTagsMessage): Future[js.Object] =
      service.deleteTags(params).promise.toFuture
    @inline def describeAccountAttributesFuture(
        params: DescribeAccountAttributesMessage
    ): Future[AccountAttributeList] = service.describeAccountAttributes(params).promise.toFuture
    @inline def describeClusterDbRevisionsFuture(
        params: DescribeClusterDbRevisionsMessage
    ): Future[ClusterDbRevisionsMessage] = service.describeClusterDbRevisions(params).promise.toFuture
    @inline def describeClusterParameterGroupsFuture(
        params: DescribeClusterParameterGroupsMessage
    ): Future[ClusterParameterGroupsMessage] = service.describeClusterParameterGroups(params).promise.toFuture
    @inline def describeClusterParametersFuture(
        params: DescribeClusterParametersMessage
    ): Future[ClusterParameterGroupDetails] = service.describeClusterParameters(params).promise.toFuture
    @inline def describeClusterSecurityGroupsFuture(
        params: DescribeClusterSecurityGroupsMessage
    ): Future[ClusterSecurityGroupMessage] = service.describeClusterSecurityGroups(params).promise.toFuture
    @inline def describeClusterSnapshotsFuture(params: DescribeClusterSnapshotsMessage): Future[SnapshotMessage] =
      service.describeClusterSnapshots(params).promise.toFuture
    @inline def describeClusterSubnetGroupsFuture(
        params: DescribeClusterSubnetGroupsMessage
    ): Future[ClusterSubnetGroupMessage] = service.describeClusterSubnetGroups(params).promise.toFuture
    @inline def describeClusterTracksFuture(params: DescribeClusterTracksMessage): Future[TrackListMessage] =
      service.describeClusterTracks(params).promise.toFuture
    @inline def describeClusterVersionsFuture(params: DescribeClusterVersionsMessage): Future[ClusterVersionsMessage] =
      service.describeClusterVersions(params).promise.toFuture
    @inline def describeClustersFuture(params: DescribeClustersMessage): Future[ClustersMessage] =
      service.describeClusters(params).promise.toFuture
    @inline def describeDefaultClusterParametersFuture(
        params: DescribeDefaultClusterParametersMessage
    ): Future[DescribeDefaultClusterParametersResult] =
      service.describeDefaultClusterParameters(params).promise.toFuture
    @inline def describeEventCategoriesFuture(params: DescribeEventCategoriesMessage): Future[EventCategoriesMessage] =
      service.describeEventCategories(params).promise.toFuture
    @inline def describeEventSubscriptionsFuture(
        params: DescribeEventSubscriptionsMessage
    ): Future[EventSubscriptionsMessage] = service.describeEventSubscriptions(params).promise.toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] =
      service.describeEvents(params).promise.toFuture
    @inline def describeHsmClientCertificatesFuture(
        params: DescribeHsmClientCertificatesMessage
    ): Future[HsmClientCertificateMessage] = service.describeHsmClientCertificates(params).promise.toFuture
    @inline def describeHsmConfigurationsFuture(
        params: DescribeHsmConfigurationsMessage
    ): Future[HsmConfigurationMessage] = service.describeHsmConfigurations(params).promise.toFuture
    @inline def describeLoggingStatusFuture(params: DescribeLoggingStatusMessage): Future[LoggingStatus] =
      service.describeLoggingStatus(params).promise.toFuture
    @inline def describeNodeConfigurationOptionsFuture(
        params: DescribeNodeConfigurationOptionsMessage
    ): Future[NodeConfigurationOptionsMessage] = service.describeNodeConfigurationOptions(params).promise.toFuture
    @inline def describeOrderableClusterOptionsFuture(
        params: DescribeOrderableClusterOptionsMessage
    ): Future[OrderableClusterOptionsMessage] = service.describeOrderableClusterOptions(params).promise.toFuture
    @inline def describeReservedNodeOfferingsFuture(
        params: DescribeReservedNodeOfferingsMessage
    ): Future[ReservedNodeOfferingsMessage] = service.describeReservedNodeOfferings(params).promise.toFuture
    @inline def describeReservedNodesFuture(params: DescribeReservedNodesMessage): Future[ReservedNodesMessage] =
      service.describeReservedNodes(params).promise.toFuture
    @inline def describeResizeFuture(params: DescribeResizeMessage): Future[ResizeProgressMessage] =
      service.describeResize(params).promise.toFuture
    @inline def describeScheduledActionsFuture(
        params: DescribeScheduledActionsMessage
    ): Future[ScheduledActionsMessage] = service.describeScheduledActions(params).promise.toFuture
    @inline def describeSnapshotCopyGrantsFuture(
        params: DescribeSnapshotCopyGrantsMessage
    ): Future[SnapshotCopyGrantMessage] = service.describeSnapshotCopyGrants(params).promise.toFuture
    @inline def describeSnapshotSchedulesFuture(
        params: DescribeSnapshotSchedulesMessage
    ): Future[DescribeSnapshotSchedulesOutputMessage]                   = service.describeSnapshotSchedules(params).promise.toFuture
    @inline def describeStorageFuture(): Future[CustomerStorageMessage] = service.describeStorage().promise.toFuture
    @inline def describeTableRestoreStatusFuture(
        params: DescribeTableRestoreStatusMessage
    ): Future[TableRestoreStatusMessage] = service.describeTableRestoreStatus(params).promise.toFuture
    @inline def describeTagsFuture(params: DescribeTagsMessage): Future[TaggedResourceListMessage] =
      service.describeTags(params).promise.toFuture
    @inline def disableLoggingFuture(params: DisableLoggingMessage): Future[LoggingStatus] =
      service.disableLogging(params).promise.toFuture
    @inline def disableSnapshotCopyFuture(params: DisableSnapshotCopyMessage): Future[DisableSnapshotCopyResult] =
      service.disableSnapshotCopy(params).promise.toFuture
    @inline def enableLoggingFuture(params: EnableLoggingMessage): Future[LoggingStatus] =
      service.enableLogging(params).promise.toFuture
    @inline def enableSnapshotCopyFuture(params: EnableSnapshotCopyMessage): Future[EnableSnapshotCopyResult] =
      service.enableSnapshotCopy(params).promise.toFuture
    @inline def getClusterCredentialsFuture(params: GetClusterCredentialsMessage): Future[ClusterCredentials] =
      service.getClusterCredentials(params).promise.toFuture
    @inline def getReservedNodeExchangeOfferingsFuture(
        params: GetReservedNodeExchangeOfferingsInputMessage
    ): Future[GetReservedNodeExchangeOfferingsOutputMessage] =
      service.getReservedNodeExchangeOfferings(params).promise.toFuture
    @inline def modifyClusterDbRevisionFuture(
        params: ModifyClusterDbRevisionMessage
    ): Future[ModifyClusterDbRevisionResult] = service.modifyClusterDbRevision(params).promise.toFuture
    @inline def modifyClusterFuture(params: ModifyClusterMessage): Future[ModifyClusterResult] =
      service.modifyCluster(params).promise.toFuture
    @inline def modifyClusterIamRolesFuture(params: ModifyClusterIamRolesMessage): Future[ModifyClusterIamRolesResult] =
      service.modifyClusterIamRoles(params).promise.toFuture
    @inline def modifyClusterMaintenanceFuture(
        params: ModifyClusterMaintenanceMessage
    ): Future[ModifyClusterMaintenanceResult] = service.modifyClusterMaintenance(params).promise.toFuture
    @inline def modifyClusterParameterGroupFuture(
        params: ModifyClusterParameterGroupMessage
    ): Future[ClusterParameterGroupNameMessage] = service.modifyClusterParameterGroup(params).promise.toFuture
    @inline def modifyClusterSnapshotFuture(params: ModifyClusterSnapshotMessage): Future[ModifyClusterSnapshotResult] =
      service.modifyClusterSnapshot(params).promise.toFuture
    @inline def modifyClusterSnapshotScheduleFuture(params: ModifyClusterSnapshotScheduleMessage): Future[js.Object] =
      service.modifyClusterSnapshotSchedule(params).promise.toFuture
    @inline def modifyClusterSubnetGroupFuture(
        params: ModifyClusterSubnetGroupMessage
    ): Future[ModifyClusterSubnetGroupResult] = service.modifyClusterSubnetGroup(params).promise.toFuture
    @inline def modifyEventSubscriptionFuture(
        params: ModifyEventSubscriptionMessage
    ): Future[ModifyEventSubscriptionResult] = service.modifyEventSubscription(params).promise.toFuture
    @inline def modifyScheduledActionFuture(params: ModifyScheduledActionMessage): Future[ScheduledAction] =
      service.modifyScheduledAction(params).promise.toFuture
    @inline def modifySnapshotCopyRetentionPeriodFuture(
        params: ModifySnapshotCopyRetentionPeriodMessage
    ): Future[ModifySnapshotCopyRetentionPeriodResult] =
      service.modifySnapshotCopyRetentionPeriod(params).promise.toFuture
    @inline def modifySnapshotScheduleFuture(params: ModifySnapshotScheduleMessage): Future[SnapshotSchedule] =
      service.modifySnapshotSchedule(params).promise.toFuture
    @inline def purchaseReservedNodeOfferingFuture(
        params: PurchaseReservedNodeOfferingMessage
    ): Future[PurchaseReservedNodeOfferingResult] = service.purchaseReservedNodeOffering(params).promise.toFuture
    @inline def rebootClusterFuture(params: RebootClusterMessage): Future[RebootClusterResult] =
      service.rebootCluster(params).promise.toFuture
    @inline def resetClusterParameterGroupFuture(
        params: ResetClusterParameterGroupMessage
    ): Future[ClusterParameterGroupNameMessage] = service.resetClusterParameterGroup(params).promise.toFuture
    @inline def resizeClusterFuture(params: ResizeClusterMessage): Future[ResizeClusterResult] =
      service.resizeCluster(params).promise.toFuture
    @inline def restoreFromClusterSnapshotFuture(
        params: RestoreFromClusterSnapshotMessage
    ): Future[RestoreFromClusterSnapshotResult] = service.restoreFromClusterSnapshot(params).promise.toFuture
    @inline def restoreTableFromClusterSnapshotFuture(
        params: RestoreTableFromClusterSnapshotMessage
    ): Future[RestoreTableFromClusterSnapshotResult] = service.restoreTableFromClusterSnapshot(params).promise.toFuture
    @inline def revokeClusterSecurityGroupIngressFuture(
        params: RevokeClusterSecurityGroupIngressMessage
    ): Future[RevokeClusterSecurityGroupIngressResult] =
      service.revokeClusterSecurityGroupIngress(params).promise.toFuture
    @inline def revokeSnapshotAccessFuture(params: RevokeSnapshotAccessMessage): Future[RevokeSnapshotAccessResult] =
      service.revokeSnapshotAccess(params).promise.toFuture
    @inline def rotateEncryptionKeyFuture(params: RotateEncryptionKeyMessage): Future[RotateEncryptionKeyResult] =
      service.rotateEncryptionKey(params).promise.toFuture
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
  trait AcceptReservedNodeExchangeInputMessage extends js.Object {
    var ReservedNodeId: String
    var TargetReservedNodeOfferingId: String
  }

  object AcceptReservedNodeExchangeInputMessage {
    @inline
    def apply(
        ReservedNodeId: String,
        TargetReservedNodeOfferingId: String
    ): AcceptReservedNodeExchangeInputMessage = {
      val __obj = js.Dynamic.literal(
        "ReservedNodeId"               -> ReservedNodeId.asInstanceOf[js.Any],
        "TargetReservedNodeOfferingId" -> TargetReservedNodeOfferingId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcceptReservedNodeExchangeInputMessage]
    }
  }

  @js.native
  trait AcceptReservedNodeExchangeOutputMessage extends js.Object {
    var ExchangedReservedNode: js.UndefOr[ReservedNode]
  }

  object AcceptReservedNodeExchangeOutputMessage {
    @inline
    def apply(
        ExchangedReservedNode: js.UndefOr[ReservedNode] = js.undefined
    ): AcceptReservedNodeExchangeOutputMessage = {
      val __obj = js.Dynamic.literal()
      ExchangedReservedNode.foreach(__v => __obj.updateDynamic("ExchangedReservedNode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptReservedNodeExchangeOutputMessage]
    }
  }

  /**
    * A name value pair that describes an aspect of an account.
    */
  @js.native
  trait AccountAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AttributeValueList]
  }

  object AccountAttribute {
    @inline
    def apply(
        AttributeName: js.UndefOr[String] = js.undefined,
        AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
    ): AccountAttribute = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      AttributeValues.foreach(__v => __obj.updateDynamic("AttributeValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAttribute]
    }
  }

  @js.native
  trait AccountAttributeList extends js.Object {
    var AccountAttributes: js.UndefOr[AttributeList]
  }

  object AccountAttributeList {
    @inline
    def apply(
        AccountAttributes: js.UndefOr[AttributeList] = js.undefined
    ): AccountAttributeList = {
      val __obj = js.Dynamic.literal()
      AccountAttributes.foreach(__v => __obj.updateDynamic("AccountAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAttributeList]
    }
  }

  /**
    * Describes an AWS customer account authorized to restore a snapshot.
    */
  @js.native
  trait AccountWithRestoreAccess extends js.Object {
    var AccountAlias: js.UndefOr[String]
    var AccountId: js.UndefOr[String]
  }

  object AccountWithRestoreAccess {
    @inline
    def apply(
        AccountAlias: js.UndefOr[String] = js.undefined,
        AccountId: js.UndefOr[String] = js.undefined
    ): AccountWithRestoreAccess = {
      val __obj = js.Dynamic.literal()
      AccountAlias.foreach(__v => __obj.updateDynamic("AccountAlias")(__v.asInstanceOf[js.Any]))
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountWithRestoreAccess]
    }
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
  trait AttributeValueTarget extends js.Object {
    var AttributeValue: js.UndefOr[String]
  }

  object AttributeValueTarget {
    @inline
    def apply(
        AttributeValue: js.UndefOr[String] = js.undefined
    ): AttributeValueTarget = {
      val __obj = js.Dynamic.literal()
      AttributeValue.foreach(__v => __obj.updateDynamic("AttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeValueTarget]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object AuthorizeClusterSecurityGroupIngressMessage {
    @inline
    def apply(
        ClusterSecurityGroupName: String,
        CIDRIP: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): AuthorizeClusterSecurityGroupIngressMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.asInstanceOf[js.Any]
      )

      CIDRIP.foreach(__v => __obj.updateDynamic("CIDRIP")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupName.foreach(__v => __obj.updateDynamic("EC2SecurityGroupName")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupOwnerId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupOwnerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object AuthorizeClusterSecurityGroupIngressResult {
    @inline
    def apply(
        ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): AuthorizeClusterSecurityGroupIngressResult = {
      val __obj = js.Dynamic.literal()
      ClusterSecurityGroup.foreach(__v => __obj.updateDynamic("ClusterSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AuthorizeSnapshotAccessMessage extends js.Object {
    var AccountWithRestoreAccess: String
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: js.UndefOr[String]
  }

  object AuthorizeSnapshotAccessMessage {
    @inline
    def apply(
        AccountWithRestoreAccess: String,
        SnapshotIdentifier: String,
        SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    ): AuthorizeSnapshotAccessMessage = {
      val __obj = js.Dynamic.literal(
        "AccountWithRestoreAccess" -> AccountWithRestoreAccess.asInstanceOf[js.Any],
        "SnapshotIdentifier"       -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      SnapshotClusterIdentifier.foreach(__v =>
        __obj.updateDynamic("SnapshotClusterIdentifier")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AuthorizeSnapshotAccessMessage]
    }
  }

  @js.native
  trait AuthorizeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object AuthorizeSnapshotAccessResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): AuthorizeSnapshotAccessResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizeSnapshotAccessResult]
    }
  }

  /**
    * Describes an availability zone.
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
    var SupportedPlatforms: js.UndefOr[SupportedPlatformsList]
  }

  object AvailabilityZone {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        SupportedPlatforms: js.UndefOr[SupportedPlatformsList] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SupportedPlatforms.foreach(__v => __obj.updateDynamic("SupportedPlatforms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  @js.native
  trait BatchDeleteClusterSnapshotsRequest extends js.Object {
    var Identifiers: DeleteClusterSnapshotMessageList
  }

  object BatchDeleteClusterSnapshotsRequest {
    @inline
    def apply(
        Identifiers: DeleteClusterSnapshotMessageList
    ): BatchDeleteClusterSnapshotsRequest = {
      val __obj = js.Dynamic.literal(
        "Identifiers" -> Identifiers.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDeleteClusterSnapshotsRequest]
    }
  }

  @js.native
  trait BatchDeleteClusterSnapshotsResult extends js.Object {
    var Errors: js.UndefOr[BatchSnapshotOperationErrorList]
    var Resources: js.UndefOr[SnapshotIdentifierList]
  }

  object BatchDeleteClusterSnapshotsResult {
    @inline
    def apply(
        Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.undefined,
        Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
    ): BatchDeleteClusterSnapshotsResult = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteClusterSnapshotsResult]
    }
  }

  @js.native
  trait BatchModifyClusterSnapshotsMessage extends js.Object {
    var SnapshotIdentifierList: SnapshotIdentifierList
    var Force: js.UndefOr[Boolean]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object BatchModifyClusterSnapshotsMessage {
    @inline
    def apply(
        SnapshotIdentifierList: SnapshotIdentifierList,
        Force: js.UndefOr[Boolean] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    ): BatchModifyClusterSnapshotsMessage = {
      val __obj = js.Dynamic.literal(
        "SnapshotIdentifierList" -> SnapshotIdentifierList.asInstanceOf[js.Any]
      )

      Force.foreach(__v => __obj.updateDynamic("Force")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchModifyClusterSnapshotsMessage]
    }
  }

  @js.native
  trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
    var Errors: js.UndefOr[BatchSnapshotOperationErrors]
    var Resources: js.UndefOr[SnapshotIdentifierList]
  }

  object BatchModifyClusterSnapshotsOutputMessage {
    @inline
    def apply(
        Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.undefined,
        Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
    ): BatchModifyClusterSnapshotsOutputMessage = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
    }
  }

  @js.native
  trait CancelResizeMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object CancelResizeMessage {
    @inline
    def apply(
        ClusterIdentifier: String
    ): CancelResizeMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelResizeMessage]
    }
  }

  /**
    * Describes a cluster.
    */
  @js.native
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

  object Cluster {
    @inline
    def apply(
        AllowVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        AutomatedSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        ClusterAvailabilityStatus: js.UndefOr[String] = js.undefined,
        ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        ClusterNodes: js.UndefOr[ClusterNodesList] = js.undefined,
        ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList] = js.undefined,
        ClusterPublicKey: js.UndefOr[String] = js.undefined,
        ClusterRevisionNumber: js.UndefOr[String] = js.undefined,
        ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList] = js.undefined,
        ClusterSnapshotCopyStatus: js.UndefOr[ClusterSnapshotCopyStatus] = js.undefined,
        ClusterStatus: js.UndefOr[String] = js.undefined,
        ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
        ClusterVersion: js.UndefOr[String] = js.undefined,
        DBName: js.UndefOr[String] = js.undefined,
        DataTransferProgress: js.UndefOr[DataTransferProgress] = js.undefined,
        DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList] = js.undefined,
        ElasticIpStatus: js.UndefOr[ElasticIpStatus] = js.undefined,
        ElasticResizeNumberOfNodeOptions: js.UndefOr[String] = js.undefined,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
        ExpectedNextSnapshotScheduleTime: js.UndefOr[TStamp] = js.undefined,
        ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[String] = js.undefined,
        HsmStatus: js.UndefOr[HsmStatus] = js.undefined,
        IamRoles: js.UndefOr[ClusterIamRoleList] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
        MasterUsername: js.UndefOr[String] = js.undefined,
        ModifyStatus: js.UndefOr[String] = js.undefined,
        NextMaintenanceWindowStartTime: js.UndefOr[TStamp] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumberOfNodes: js.UndefOr[Int] = js.undefined,
        PendingActions: js.UndefOr[PendingActionsList] = js.undefined,
        PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
        ResizeInfo: js.UndefOr[ResizeInfo] = js.undefined,
        RestoreStatus: js.UndefOr[RestoreStatus] = js.undefined,
        SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined,
        SnapshotScheduleState: js.UndefOr[ScheduleState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined,
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): Cluster = {
      val __obj = js.Dynamic.literal()
      AllowVersionUpgrade.foreach(__v => __obj.updateDynamic("AllowVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AutomatedSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      ClusterAvailabilityStatus.foreach(__v =>
        __obj.updateDynamic("ClusterAvailabilityStatus")(__v.asInstanceOf[js.Any])
      )
      ClusterCreateTime.foreach(__v => __obj.updateDynamic("ClusterCreateTime")(__v.asInstanceOf[js.Any]))
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      ClusterNodes.foreach(__v => __obj.updateDynamic("ClusterNodes")(__v.asInstanceOf[js.Any]))
      ClusterParameterGroups.foreach(__v => __obj.updateDynamic("ClusterParameterGroups")(__v.asInstanceOf[js.Any]))
      ClusterPublicKey.foreach(__v => __obj.updateDynamic("ClusterPublicKey")(__v.asInstanceOf[js.Any]))
      ClusterRevisionNumber.foreach(__v => __obj.updateDynamic("ClusterRevisionNumber")(__v.asInstanceOf[js.Any]))
      ClusterSecurityGroups.foreach(__v => __obj.updateDynamic("ClusterSecurityGroups")(__v.asInstanceOf[js.Any]))
      ClusterSnapshotCopyStatus.foreach(__v =>
        __obj.updateDynamic("ClusterSnapshotCopyStatus")(__v.asInstanceOf[js.Any])
      )
      ClusterStatus.foreach(__v => __obj.updateDynamic("ClusterStatus")(__v.asInstanceOf[js.Any]))
      ClusterSubnetGroupName.foreach(__v => __obj.updateDynamic("ClusterSubnetGroupName")(__v.asInstanceOf[js.Any]))
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      DataTransferProgress.foreach(__v => __obj.updateDynamic("DataTransferProgress")(__v.asInstanceOf[js.Any]))
      DeferredMaintenanceWindows.foreach(__v =>
        __obj.updateDynamic("DeferredMaintenanceWindows")(__v.asInstanceOf[js.Any])
      )
      ElasticIpStatus.foreach(__v => __obj.updateDynamic("ElasticIpStatus")(__v.asInstanceOf[js.Any]))
      ElasticResizeNumberOfNodeOptions.foreach(__v =>
        __obj.updateDynamic("ElasticResizeNumberOfNodeOptions")(__v.asInstanceOf[js.Any])
      )
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      EnhancedVpcRouting.foreach(__v => __obj.updateDynamic("EnhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      ExpectedNextSnapshotScheduleTime.foreach(__v =>
        __obj.updateDynamic("ExpectedNextSnapshotScheduleTime")(__v.asInstanceOf[js.Any])
      )
      ExpectedNextSnapshotScheduleTimeStatus.foreach(__v =>
        __obj.updateDynamic("ExpectedNextSnapshotScheduleTimeStatus")(__v.asInstanceOf[js.Any])
      )
      HsmStatus.foreach(__v => __obj.updateDynamic("HsmStatus")(__v.asInstanceOf[js.Any]))
      IamRoles.foreach(__v => __obj.updateDynamic("IamRoles")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      ModifyStatus.foreach(__v => __obj.updateDynamic("ModifyStatus")(__v.asInstanceOf[js.Any]))
      NextMaintenanceWindowStartTime.foreach(__v =>
        __obj.updateDynamic("NextMaintenanceWindowStartTime")(__v.asInstanceOf[js.Any])
      )
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      PendingActions.foreach(__v => __obj.updateDynamic("PendingActions")(__v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.updateDynamic("PendingModifiedValues")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      ResizeInfo.foreach(__v => __obj.updateDynamic("ResizeInfo")(__v.asInstanceOf[js.Any]))
      RestoreStatus.foreach(__v => __obj.updateDynamic("RestoreStatus")(__v.asInstanceOf[js.Any]))
      SnapshotScheduleIdentifier.foreach(__v =>
        __obj.updateDynamic("SnapshotScheduleIdentifier")(__v.asInstanceOf[js.Any])
      )
      SnapshotScheduleState.foreach(__v => __obj.updateDynamic("SnapshotScheduleState")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.updateDynamic("VpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ClusterAssociatedToSchedule extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var ScheduleAssociationState: js.UndefOr[ScheduleState]
  }

  object ClusterAssociatedToSchedule {
    @inline
    def apply(
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        ScheduleAssociationState: js.UndefOr[ScheduleState] = js.undefined
    ): ClusterAssociatedToSchedule = {
      val __obj = js.Dynamic.literal()
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      ScheduleAssociationState.foreach(__v => __obj.updateDynamic("ScheduleAssociationState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterAssociatedToSchedule]
    }
  }

  /**
    * Temporary credentials with authorization to log on to an Amazon Redshift database.
    */
  @js.native
  trait ClusterCredentials extends js.Object {
    var DbPassword: js.UndefOr[SensitiveString]
    var DbUser: js.UndefOr[String]
    var Expiration: js.UndefOr[TStamp]
  }

  object ClusterCredentials {
    @inline
    def apply(
        DbPassword: js.UndefOr[SensitiveString] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        Expiration: js.UndefOr[TStamp] = js.undefined
    ): ClusterCredentials = {
      val __obj = js.Dynamic.literal()
      DbPassword.foreach(__v => __obj.updateDynamic("DbPassword")(__v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.updateDynamic("Expiration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterCredentials]
    }
  }

  /**
    * Describes a <code>ClusterDbRevision</code>.
    */
  @js.native
  trait ClusterDbRevision extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var CurrentDatabaseRevision: js.UndefOr[String]
    var DatabaseRevisionReleaseDate: js.UndefOr[TStamp]
    var RevisionTargets: js.UndefOr[RevisionTargetsList]
  }

  object ClusterDbRevision {
    @inline
    def apply(
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        CurrentDatabaseRevision: js.UndefOr[String] = js.undefined,
        DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined,
        RevisionTargets: js.UndefOr[RevisionTargetsList] = js.undefined
    ): ClusterDbRevision = {
      val __obj = js.Dynamic.literal()
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      CurrentDatabaseRevision.foreach(__v => __obj.updateDynamic("CurrentDatabaseRevision")(__v.asInstanceOf[js.Any]))
      DatabaseRevisionReleaseDate.foreach(__v =>
        __obj.updateDynamic("DatabaseRevisionReleaseDate")(__v.asInstanceOf[js.Any])
      )
      RevisionTargets.foreach(__v => __obj.updateDynamic("RevisionTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterDbRevision]
    }
  }

  @js.native
  trait ClusterDbRevisionsMessage extends js.Object {
    var ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList]
    var Marker: js.UndefOr[String]
  }

  object ClusterDbRevisionsMessage {
    @inline
    def apply(
        ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): ClusterDbRevisionsMessage = {
      val __obj = js.Dynamic.literal()
      ClusterDbRevisions.foreach(__v => __obj.updateDynamic("ClusterDbRevisions")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterDbRevisionsMessage]
    }
  }

  /**
    * An AWS Identity and Access Management (IAM) role that can be used by the associated Amazon Redshift cluster to access other AWS services.
    */
  @js.native
  trait ClusterIamRole extends js.Object {
    var ApplyStatus: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[String]
  }

  object ClusterIamRole {
    @inline
    def apply(
        ApplyStatus: js.UndefOr[String] = js.undefined,
        IamRoleArn: js.UndefOr[String] = js.undefined
    ): ClusterIamRole = {
      val __obj = js.Dynamic.literal()
      ApplyStatus.foreach(__v => __obj.updateDynamic("ApplyStatus")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterIamRole]
    }
  }

  /**
    * The identifier of a node in a cluster.
    */
  @js.native
  trait ClusterNode extends js.Object {
    var NodeRole: js.UndefOr[String]
    var PrivateIPAddress: js.UndefOr[String]
    var PublicIPAddress: js.UndefOr[String]
  }

  object ClusterNode {
    @inline
    def apply(
        NodeRole: js.UndefOr[String] = js.undefined,
        PrivateIPAddress: js.UndefOr[String] = js.undefined,
        PublicIPAddress: js.UndefOr[String] = js.undefined
    ): ClusterNode = {
      val __obj = js.Dynamic.literal()
      NodeRole.foreach(__v => __obj.updateDynamic("NodeRole")(__v.asInstanceOf[js.Any]))
      PrivateIPAddress.foreach(__v => __obj.updateDynamic("PrivateIPAddress")(__v.asInstanceOf[js.Any]))
      PublicIPAddress.foreach(__v => __obj.updateDynamic("PublicIPAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterNode]
    }
  }

  /**
    * Describes a parameter group.
    */
  @js.native
  trait ClusterParameterGroup extends js.Object {
    var Description: js.UndefOr[String]
    var ParameterGroupFamily: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object ClusterParameterGroup {
    @inline
    def apply(
        Description: js.UndefOr[String] = js.undefined,
        ParameterGroupFamily: js.UndefOr[String] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ClusterParameterGroup = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ParameterGroupFamily.foreach(__v => __obj.updateDynamic("ParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterParameterGroup]
    }
  }

  /**
    * Contains the output from the <a>DescribeClusterParameters</a> action.
    */
  @js.native
  trait ClusterParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object ClusterParameterGroupDetails {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): ClusterParameterGroupDetails = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterParameterGroupDetails]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ClusterParameterGroupNameMessage extends js.Object {
    var ParameterGroupName: js.UndefOr[String]
    var ParameterGroupStatus: js.UndefOr[String]
  }

  object ClusterParameterGroupNameMessage {
    @inline
    def apply(
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        ParameterGroupStatus: js.UndefOr[String] = js.undefined
    ): ClusterParameterGroupNameMessage = {
      val __obj = js.Dynamic.literal()
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      ParameterGroupStatus.foreach(__v => __obj.updateDynamic("ParameterGroupStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterParameterGroupNameMessage]
    }
  }

  /**
    * Describes the status of a parameter group.
    */
  @js.native
  trait ClusterParameterGroupStatus extends js.Object {
    var ClusterParameterStatusList: js.UndefOr[ClusterParameterStatusList]
    var ParameterApplyStatus: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
  }

  object ClusterParameterGroupStatus {
    @inline
    def apply(
        ClusterParameterStatusList: js.UndefOr[ClusterParameterStatusList] = js.undefined,
        ParameterApplyStatus: js.UndefOr[String] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined
    ): ClusterParameterGroupStatus = {
      val __obj = js.Dynamic.literal()
      ClusterParameterStatusList.foreach(__v =>
        __obj.updateDynamic("ClusterParameterStatusList")(__v.asInstanceOf[js.Any])
      )
      ParameterApplyStatus.foreach(__v => __obj.updateDynamic("ParameterApplyStatus")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterParameterGroupStatus]
    }
  }

  /**
    * Contains the output from the <a>DescribeClusterParameterGroups</a> action.
    */
  @js.native
  trait ClusterParameterGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ParameterGroups: js.UndefOr[ParameterGroupList]
  }

  object ClusterParameterGroupsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
    ): ClusterParameterGroupsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ParameterGroups.foreach(__v => __obj.updateDynamic("ParameterGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterParameterGroupsMessage]
    }
  }

  /**
    * Describes the status of a parameter group.
    */
  @js.native
  trait ClusterParameterStatus extends js.Object {
    var ParameterApplyErrorDescription: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
  }

  object ClusterParameterStatus {
    @inline
    def apply(
        ParameterApplyErrorDescription: js.UndefOr[String] = js.undefined,
        ParameterApplyStatus: js.UndefOr[String] = js.undefined,
        ParameterName: js.UndefOr[String] = js.undefined
    ): ClusterParameterStatus = {
      val __obj = js.Dynamic.literal()
      ParameterApplyErrorDescription.foreach(__v =>
        __obj.updateDynamic("ParameterApplyErrorDescription")(__v.asInstanceOf[js.Any])
      )
      ParameterApplyStatus.foreach(__v => __obj.updateDynamic("ParameterApplyStatus")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterParameterStatus]
    }
  }

  /**
    * Describes a security group.
    */
  @js.native
  trait ClusterSecurityGroup extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var IPRanges: js.UndefOr[IPRangeList]
    var Tags: js.UndefOr[TagList]
  }

  object ClusterSecurityGroup {
    @inline
    def apply(
        ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
        IPRanges: js.UndefOr[IPRangeList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ClusterSecurityGroup = {
      val __obj = js.Dynamic.literal()
      ClusterSecurityGroupName.foreach(__v => __obj.updateDynamic("ClusterSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroups.foreach(__v => __obj.updateDynamic("EC2SecurityGroups")(__v.asInstanceOf[js.Any]))
      IPRanges.foreach(__v => __obj.updateDynamic("IPRanges")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterSecurityGroup]
    }
  }

  /**
    * Describes a cluster security group.
    */
  @js.native
  trait ClusterSecurityGroupMembership extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object ClusterSecurityGroupMembership {
    @inline
    def apply(
        ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): ClusterSecurityGroupMembership = {
      val __obj = js.Dynamic.literal()
      ClusterSecurityGroupName.foreach(__v => __obj.updateDynamic("ClusterSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterSecurityGroupMembership]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups]
    var Marker: js.UndefOr[String]
  }

  object ClusterSecurityGroupMessage {
    @inline
    def apply(
        ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): ClusterSecurityGroupMessage = {
      val __obj = js.Dynamic.literal()
      ClusterSecurityGroups.foreach(__v => __obj.updateDynamic("ClusterSecurityGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterSecurityGroupMessage]
    }
  }

  /**
    * Returns the destination region and retention period that are configured for cross-region snapshot copy.
    */
  @js.native
  trait ClusterSnapshotCopyStatus extends js.Object {
    var DestinationRegion: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[Int]
    var RetentionPeriod: js.UndefOr[Double]
    var SnapshotCopyGrantName: js.UndefOr[String]
  }

  object ClusterSnapshotCopyStatus {
    @inline
    def apply(
        DestinationRegion: js.UndefOr[String] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
        RetentionPeriod: js.UndefOr[Double] = js.undefined,
        SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
    ): ClusterSnapshotCopyStatus = {
      val __obj = js.Dynamic.literal()
      DestinationRegion.foreach(__v => __obj.updateDynamic("DestinationRegion")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      SnapshotCopyGrantName.foreach(__v => __obj.updateDynamic("SnapshotCopyGrantName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterSnapshotCopyStatus]
    }
  }

  /**
    * Describes a subnet group.
    */
  @js.native
  trait ClusterSubnetGroup extends js.Object {
    var ClusterSubnetGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  object ClusterSubnetGroup {
    @inline
    def apply(
        ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        SubnetGroupStatus: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): ClusterSubnetGroup = {
      val __obj = js.Dynamic.literal()
      ClusterSubnetGroupName.foreach(__v => __obj.updateDynamic("ClusterSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SubnetGroupStatus.foreach(__v => __obj.updateDynamic("SubnetGroupStatus")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterSubnetGroup]
    }
  }

  /**
    * Contains the output from the <a>DescribeClusterSubnetGroups</a> action.
    */
  @js.native
  trait ClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  object ClusterSubnetGroupMessage {
    @inline
    def apply(
        ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): ClusterSubnetGroupMessage = {
      val __obj = js.Dynamic.literal()
      ClusterSubnetGroups.foreach(__v => __obj.updateDynamic("ClusterSubnetGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterSubnetGroupMessage]
    }
  }

  /**
    * Describes a cluster version, including the parameter group family and description of the version.
    */
  @js.native
  trait ClusterVersion extends js.Object {
    var ClusterParameterGroupFamily: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object ClusterVersion {
    @inline
    def apply(
        ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined,
        ClusterVersion: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined
    ): ClusterVersion = {
      val __obj = js.Dynamic.literal()
      ClusterParameterGroupFamily.foreach(__v =>
        __obj.updateDynamic("ClusterParameterGroupFamily")(__v.asInstanceOf[js.Any])
      )
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterVersion]
    }
  }

  /**
    * Contains the output from the <a>DescribeClusterVersions</a> action.
    */
  @js.native
  trait ClusterVersionsMessage extends js.Object {
    var ClusterVersions: js.UndefOr[ClusterVersionList]
    var Marker: js.UndefOr[String]
  }

  object ClusterVersionsMessage {
    @inline
    def apply(
        ClusterVersions: js.UndefOr[ClusterVersionList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): ClusterVersionsMessage = {
      val __obj = js.Dynamic.literal()
      ClusterVersions.foreach(__v => __obj.updateDynamic("ClusterVersions")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterVersionsMessage]
    }
  }

  /**
    * Contains the output from the <a>DescribeClusters</a> action.
    */
  @js.native
  trait ClustersMessage extends js.Object {
    var Clusters: js.UndefOr[ClusterList]
    var Marker: js.UndefOr[String]
  }

  object ClustersMessage {
    @inline
    def apply(
        Clusters: js.UndefOr[ClusterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): ClustersMessage = {
      val __obj = js.Dynamic.literal()
      Clusters.foreach(__v => __obj.updateDynamic("Clusters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClustersMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CopyClusterSnapshotMessage extends js.Object {
    var SourceSnapshotIdentifier: String
    var TargetSnapshotIdentifier: String
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var SourceSnapshotClusterIdentifier: js.UndefOr[String]
  }

  object CopyClusterSnapshotMessage {
    @inline
    def apply(
        SourceSnapshotIdentifier: String,
        TargetSnapshotIdentifier: String,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    ): CopyClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "SourceSnapshotIdentifier" -> SourceSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetSnapshotIdentifier" -> TargetSnapshotIdentifier.asInstanceOf[js.Any]
      )

      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      SourceSnapshotClusterIdentifier.foreach(__v =>
        __obj.updateDynamic("SourceSnapshotClusterIdentifier")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CopyClusterSnapshotMessage]
    }
  }

  @js.native
  trait CopyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CopyClusterSnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CopyClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyClusterSnapshotResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
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

  object CreateClusterMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        MasterUserPassword: String,
        MasterUsername: String,
        NodeType: String,
        AdditionalInfo: js.UndefOr[String] = js.undefined,
        AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
        ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
        ClusterType: js.UndefOr[String] = js.undefined,
        ClusterVersion: js.UndefOr[String] = js.undefined,
        DBName: js.UndefOr[String] = js.undefined,
        ElasticIp: js.UndefOr[String] = js.undefined,
        Encrypted: js.UndefOr[BooleanOptional] = js.undefined,
        EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
        HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
        HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
        IamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateClusterMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier"  -> ClusterIdentifier.asInstanceOf[js.Any],
        "MasterUserPassword" -> MasterUserPassword.asInstanceOf[js.Any],
        "MasterUsername"     -> MasterUsername.asInstanceOf[js.Any],
        "NodeType"           -> NodeType.asInstanceOf[js.Any]
      )

      AdditionalInfo.foreach(__v => __obj.updateDynamic("AdditionalInfo")(__v.asInstanceOf[js.Any]))
      AllowVersionUpgrade.foreach(__v => __obj.updateDynamic("AllowVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AutomatedSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      ClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("ClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      ClusterSecurityGroups.foreach(__v => __obj.updateDynamic("ClusterSecurityGroups")(__v.asInstanceOf[js.Any]))
      ClusterSubnetGroupName.foreach(__v => __obj.updateDynamic("ClusterSubnetGroupName")(__v.asInstanceOf[js.Any]))
      ClusterType.foreach(__v => __obj.updateDynamic("ClusterType")(__v.asInstanceOf[js.Any]))
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      ElasticIp.foreach(__v => __obj.updateDynamic("ElasticIp")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      EnhancedVpcRouting.foreach(__v => __obj.updateDynamic("EnhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      HsmClientCertificateIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmClientCertificateIdentifier")(__v.asInstanceOf[js.Any])
      )
      HsmConfigurationIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmConfigurationIdentifier")(__v.asInstanceOf[js.Any])
      )
      IamRoles.foreach(__v => __obj.updateDynamic("IamRoles")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      SnapshotScheduleIdentifier.foreach(__v =>
        __obj.updateDynamic("SnapshotScheduleIdentifier")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateClusterParameterGroupMessage extends js.Object {
    var Description: String
    var ParameterGroupFamily: String
    var ParameterGroupName: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterParameterGroupMessage {
    @inline
    def apply(
        Description: String,
        ParameterGroupFamily: String,
        ParameterGroupName: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "Description"          -> Description.asInstanceOf[js.Any],
        "ParameterGroupFamily" -> ParameterGroupFamily.asInstanceOf[js.Any],
        "ParameterGroupName"   -> ParameterGroupName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CreateClusterParameterGroupResult extends js.Object {
    var ClusterParameterGroup: js.UndefOr[ClusterParameterGroup]
  }

  object CreateClusterParameterGroupResult {
    @inline
    def apply(
        ClusterParameterGroup: js.UndefOr[ClusterParameterGroup] = js.undefined
    ): CreateClusterParameterGroupResult = {
      val __obj = js.Dynamic.literal()
      ClusterParameterGroup.foreach(__v => __obj.updateDynamic("ClusterParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterParameterGroupResult]
    }
  }

  @js.native
  trait CreateClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var Description: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterSecurityGroupMessage {
    @inline
    def apply(
        ClusterSecurityGroupName: String,
        Description: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterSecurityGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.asInstanceOf[js.Any],
        "Description"              -> Description.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateClusterSecurityGroupResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object CreateClusterSecurityGroupResult {
    @inline
    def apply(
        ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): CreateClusterSecurityGroupResult = {
      val __obj = js.Dynamic.literal()
      ClusterSecurityGroup.foreach(__v => __obj.updateDynamic("ClusterSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterSecurityGroupResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateClusterSnapshotMessage extends js.Object {
    var ClusterIdentifier: String
    var SnapshotIdentifier: String
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterSnapshotMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        SnapshotIdentifier: String,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier"  -> ClusterIdentifier.asInstanceOf[js.Any],
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterSnapshotMessage]
    }
  }

  @js.native
  trait CreateClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CreateClusterSnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CreateClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterSnapshotResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
    var Description: String
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterSubnetGroupMessage {
    @inline
    def apply(
        ClusterSubnetGroupName: String,
        Description: String,
        SubnetIds: SubnetIdentifierList,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.asInstanceOf[js.Any],
        "Description"            -> Description.asInstanceOf[js.Any],
        "SubnetIds"              -> SubnetIds.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup]
  }

  object CreateClusterSubnetGroupResult {
    @inline
    def apply(
        ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined
    ): CreateClusterSubnetGroupResult = {
      val __obj = js.Dynamic.literal()
      ClusterSubnetGroup.foreach(__v => __obj.updateDynamic("ClusterSubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterSubnetGroupResult]
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
    var Severity: js.UndefOr[String]
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
        Severity: js.UndefOr[String] = js.undefined,
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
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
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
    * <p/>
    */
  @js.native
  trait CreateHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateHsmClientCertificateMessage {
    @inline
    def apply(
        HsmClientCertificateIdentifier: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateHsmClientCertificateMessage = {
      val __obj = js.Dynamic.literal(
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmClientCertificateMessage]
    }
  }

  @js.native
  trait CreateHsmClientCertificateResult extends js.Object {
    var HsmClientCertificate: js.UndefOr[HsmClientCertificate]
  }

  object CreateHsmClientCertificateResult {
    @inline
    def apply(
        HsmClientCertificate: js.UndefOr[HsmClientCertificate] = js.undefined
    ): CreateHsmClientCertificateResult = {
      val __obj = js.Dynamic.literal()
      HsmClientCertificate.foreach(__v => __obj.updateDynamic("HsmClientCertificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmClientCertificateResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateHsmConfigurationMessage extends js.Object {
    var Description: String
    var HsmConfigurationIdentifier: String
    var HsmIpAddress: String
    var HsmPartitionName: String
    var HsmPartitionPassword: String
    var HsmServerPublicCertificate: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateHsmConfigurationMessage {
    @inline
    def apply(
        Description: String,
        HsmConfigurationIdentifier: String,
        HsmIpAddress: String,
        HsmPartitionName: String,
        HsmPartitionPassword: String,
        HsmServerPublicCertificate: String,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateHsmConfigurationMessage = {
      val __obj = js.Dynamic.literal(
        "Description"                -> Description.asInstanceOf[js.Any],
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.asInstanceOf[js.Any],
        "HsmIpAddress"               -> HsmIpAddress.asInstanceOf[js.Any],
        "HsmPartitionName"           -> HsmPartitionName.asInstanceOf[js.Any],
        "HsmPartitionPassword"       -> HsmPartitionPassword.asInstanceOf[js.Any],
        "HsmServerPublicCertificate" -> HsmServerPublicCertificate.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmConfigurationMessage]
    }
  }

  @js.native
  trait CreateHsmConfigurationResult extends js.Object {
    var HsmConfiguration: js.UndefOr[HsmConfiguration]
  }

  object CreateHsmConfigurationResult {
    @inline
    def apply(
        HsmConfiguration: js.UndefOr[HsmConfiguration] = js.undefined
    ): CreateHsmConfigurationResult = {
      val __obj = js.Dynamic.literal()
      HsmConfiguration.foreach(__v => __obj.updateDynamic("HsmConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmConfigurationResult]
    }
  }

  @js.native
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

  object CreateScheduledActionMessage {
    @inline
    def apply(
        IamRole: String,
        Schedule: String,
        ScheduledActionName: String,
        TargetAction: ScheduledActionType,
        Enable: js.UndefOr[BooleanOptional] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        ScheduledActionDescription: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined
    ): CreateScheduledActionMessage = {
      val __obj = js.Dynamic.literal(
        "IamRole"             -> IamRole.asInstanceOf[js.Any],
        "Schedule"            -> Schedule.asInstanceOf[js.Any],
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any],
        "TargetAction"        -> TargetAction.asInstanceOf[js.Any]
      )

      Enable.foreach(__v => __obj.updateDynamic("Enable")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ScheduledActionDescription.foreach(__v =>
        __obj.updateDynamic("ScheduledActionDescription")(__v.asInstanceOf[js.Any])
      )
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScheduledActionMessage]
    }
  }

  /**
    * The result of the <code>CreateSnapshotCopyGrant</code> action.
    */
  @js.native
  trait CreateSnapshotCopyGrantMessage extends js.Object {
    var SnapshotCopyGrantName: String
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSnapshotCopyGrantMessage {
    @inline
    def apply(
        SnapshotCopyGrantName: String,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateSnapshotCopyGrantMessage = {
      val __obj = js.Dynamic.literal(
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotCopyGrantMessage]
    }
  }

  @js.native
  trait CreateSnapshotCopyGrantResult extends js.Object {
    var SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant]
  }

  object CreateSnapshotCopyGrantResult {
    @inline
    def apply(
        SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant] = js.undefined
    ): CreateSnapshotCopyGrantResult = {
      val __obj = js.Dynamic.literal()
      SnapshotCopyGrant.foreach(__v => __obj.updateDynamic("SnapshotCopyGrant")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotCopyGrantResult]
    }
  }

  @js.native
  trait CreateSnapshotScheduleMessage extends js.Object {
    var DryRun: js.UndefOr[BooleanOptional]
    var NextInvocations: js.UndefOr[IntegerOptional]
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList]
    var ScheduleDescription: js.UndefOr[String]
    var ScheduleIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSnapshotScheduleMessage {
    @inline
    def apply(
        DryRun: js.UndefOr[BooleanOptional] = js.undefined,
        NextInvocations: js.UndefOr[IntegerOptional] = js.undefined,
        ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined,
        ScheduleDescription: js.UndefOr[String] = js.undefined,
        ScheduleIdentifier: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateSnapshotScheduleMessage = {
      val __obj = js.Dynamic.literal()
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      NextInvocations.foreach(__v => __obj.updateDynamic("NextInvocations")(__v.asInstanceOf[js.Any]))
      ScheduleDefinitions.foreach(__v => __obj.updateDynamic("ScheduleDefinitions")(__v.asInstanceOf[js.Any]))
      ScheduleDescription.foreach(__v => __obj.updateDynamic("ScheduleDescription")(__v.asInstanceOf[js.Any]))
      ScheduleIdentifier.foreach(__v => __obj.updateDynamic("ScheduleIdentifier")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotScheduleMessage]
    }
  }

  /**
    * Contains the output from the <code>CreateTags</code> action.
    */
  @js.native
  trait CreateTagsMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object CreateTagsMessage {
    @inline
    def apply(
        ResourceName: String,
        Tags: TagList
    ): CreateTagsMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTagsMessage]
    }
  }

  @js.native
  trait CustomerStorageMessage extends js.Object {
    var TotalBackupSizeInMegaBytes: js.UndefOr[Double]
    var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double]
  }

  object CustomerStorageMessage {
    @inline
    def apply(
        TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
        TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.undefined
    ): CustomerStorageMessage = {
      val __obj = js.Dynamic.literal()
      TotalBackupSizeInMegaBytes.foreach(__v =>
        __obj.updateDynamic("TotalBackupSizeInMegaBytes")(__v.asInstanceOf[js.Any])
      )
      TotalProvisionedStorageInMegaBytes.foreach(__v =>
        __obj.updateDynamic("TotalProvisionedStorageInMegaBytes")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CustomerStorageMessage]
    }
  }

  /**
    * Describes the status of a cluster while it is in the process of resizing with an incremental resize.
    */
  @js.native
  trait DataTransferProgress extends js.Object {
    var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional]
    var DataTransferredInMegaBytes: js.UndefOr[Double]
    var ElapsedTimeInSeconds: js.UndefOr[LongOptional]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional]
    var Status: js.UndefOr[String]
    var TotalDataInMegaBytes: js.UndefOr[Double]
  }

  object DataTransferProgress {
    @inline
    def apply(
        CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
        DataTransferredInMegaBytes: js.UndefOr[Double] = js.undefined,
        ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
        EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TotalDataInMegaBytes: js.UndefOr[Double] = js.undefined
    ): DataTransferProgress = {
      val __obj = js.Dynamic.literal()
      CurrentRateInMegaBytesPerSecond.foreach(__v =>
        __obj.updateDynamic("CurrentRateInMegaBytesPerSecond")(__v.asInstanceOf[js.Any])
      )
      DataTransferredInMegaBytes.foreach(__v =>
        __obj.updateDynamic("DataTransferredInMegaBytes")(__v.asInstanceOf[js.Any])
      )
      ElapsedTimeInSeconds.foreach(__v => __obj.updateDynamic("ElapsedTimeInSeconds")(__v.asInstanceOf[js.Any]))
      EstimatedTimeToCompletionInSeconds.foreach(__v =>
        __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(__v.asInstanceOf[js.Any])
      )
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TotalDataInMegaBytes.foreach(__v => __obj.updateDynamic("TotalDataInMegaBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataTransferProgress]
    }
  }

  /**
    * Describes the default cluster parameters for a parameter group family.
    */
  @js.native
  trait DefaultClusterParameters extends js.Object {
    var Marker: js.UndefOr[String]
    var ParameterGroupFamily: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object DefaultClusterParameters {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): DefaultClusterParameters = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ParameterGroupFamily.foreach(__v => __obj.updateDynamic("ParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultClusterParameters]
    }
  }

  /**
    * Describes a deferred maintenance window
    */
  @js.native
  trait DeferredMaintenanceWindow extends js.Object {
    var DeferMaintenanceEndTime: js.UndefOr[TStamp]
    var DeferMaintenanceIdentifier: js.UndefOr[String]
    var DeferMaintenanceStartTime: js.UndefOr[TStamp]
  }

  object DeferredMaintenanceWindow {
    @inline
    def apply(
        DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined,
        DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined,
        DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined
    ): DeferredMaintenanceWindow = {
      val __obj = js.Dynamic.literal()
      DeferMaintenanceEndTime.foreach(__v => __obj.updateDynamic("DeferMaintenanceEndTime")(__v.asInstanceOf[js.Any]))
      DeferMaintenanceIdentifier.foreach(__v =>
        __obj.updateDynamic("DeferMaintenanceIdentifier")(__v.asInstanceOf[js.Any])
      )
      DeferMaintenanceStartTime.foreach(__v =>
        __obj.updateDynamic("DeferMaintenanceStartTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeferredMaintenanceWindow]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteClusterMessage extends js.Object {
    var ClusterIdentifier: String
    var FinalClusterSnapshotIdentifier: js.UndefOr[String]
    var FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var SkipFinalClusterSnapshot: js.UndefOr[Boolean]
  }

  object DeleteClusterMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        FinalClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        SkipFinalClusterSnapshot: js.UndefOr[Boolean] = js.undefined
    ): DeleteClusterMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      FinalClusterSnapshotIdentifier.foreach(__v =>
        __obj.updateDynamic("FinalClusterSnapshotIdentifier")(__v.asInstanceOf[js.Any])
      )
      FinalClusterSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("FinalClusterSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      SkipFinalClusterSnapshot.foreach(__v => __obj.updateDynamic("SkipFinalClusterSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
  }

  object DeleteClusterParameterGroupMessage {
    @inline
    def apply(
        ParameterGroupName: String
    ): DeleteClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteClusterParameterGroupMessage]
    }
  }

  @js.native
  trait DeleteClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroupName: String
  }

  object DeleteClusterSecurityGroupMessage {
    @inline
    def apply(
        ClusterSecurityGroupName: String
    ): DeleteClusterSecurityGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteClusterSecurityGroupMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: js.UndefOr[String]
  }

  object DeleteClusterSnapshotMessage {
    @inline
    def apply(
        SnapshotIdentifier: String,
        SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      SnapshotClusterIdentifier.foreach(__v =>
        __obj.updateDynamic("SnapshotClusterIdentifier")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeleteClusterSnapshotMessage]
    }
  }

  @js.native
  trait DeleteClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object DeleteClusterSnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): DeleteClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterSnapshotResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
  }

  object DeleteClusterSubnetGroupMessage {
    @inline
    def apply(
        ClusterSubnetGroupName: String
    ): DeleteClusterSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteClusterSubnetGroupMessage]
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

  /**
    * <p/>
    */
  @js.native
  trait DeleteHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: String
  }

  object DeleteHsmClientCertificateMessage {
    @inline
    def apply(
        HsmClientCertificateIdentifier: String
    ): DeleteHsmClientCertificateMessage = {
      val __obj = js.Dynamic.literal(
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHsmClientCertificateMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteHsmConfigurationMessage extends js.Object {
    var HsmConfigurationIdentifier: String
  }

  object DeleteHsmConfigurationMessage {
    @inline
    def apply(
        HsmConfigurationIdentifier: String
    ): DeleteHsmConfigurationMessage = {
      val __obj = js.Dynamic.literal(
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHsmConfigurationMessage]
    }
  }

  @js.native
  trait DeleteScheduledActionMessage extends js.Object {
    var ScheduledActionName: String
  }

  object DeleteScheduledActionMessage {
    @inline
    def apply(
        ScheduledActionName: String
    ): DeleteScheduledActionMessage = {
      val __obj = js.Dynamic.literal(
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteScheduledActionMessage]
    }
  }

  /**
    * The result of the <code>DeleteSnapshotCopyGrant</code> action.
    */
  @js.native
  trait DeleteSnapshotCopyGrantMessage extends js.Object {
    var SnapshotCopyGrantName: String
  }

  object DeleteSnapshotCopyGrantMessage {
    @inline
    def apply(
        SnapshotCopyGrantName: String
    ): DeleteSnapshotCopyGrantMessage = {
      val __obj = js.Dynamic.literal(
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSnapshotCopyGrantMessage]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleMessage extends js.Object {
    var ScheduleIdentifier: String
  }

  object DeleteSnapshotScheduleMessage {
    @inline
    def apply(
        ScheduleIdentifier: String
    ): DeleteSnapshotScheduleMessage = {
      val __obj = js.Dynamic.literal(
        "ScheduleIdentifier" -> ScheduleIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSnapshotScheduleMessage]
    }
  }

  /**
    * Contains the output from the <code>DeleteTags</code> action.
    */
  @js.native
  trait DeleteTagsMessage extends js.Object {
    var ResourceName: String
    var TagKeys: TagKeyList
  }

  object DeleteTagsMessage {
    @inline
    def apply(
        ResourceName: String,
        TagKeys: TagKeyList
    ): DeleteTagsMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsMessage]
    }
  }

  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object DescribeAccountAttributesMessage {
    @inline
    def apply(
        AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
    ): DescribeAccountAttributesMessage = {
      val __obj = js.Dynamic.literal()
      AttributeNames.foreach(__v => __obj.updateDynamic("AttributeNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAttributesMessage]
    }
  }

  @js.native
  trait DescribeClusterDbRevisionsMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeClusterDbRevisionsMessage {
    @inline
    def apply(
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeClusterDbRevisionsMessage = {
      val __obj = js.Dynamic.literal()
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterDbRevisionsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeClusterParameterGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ParameterGroupName: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeClusterParameterGroupsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeClusterParameterGroupsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterParameterGroupsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeClusterParametersMessage extends js.Object {
    var ParameterGroupName: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  object DescribeClusterParametersMessage {
    @inline
    def apply(
        ParameterGroupName: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): DescribeClusterParametersMessage = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterParametersMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeClusterSecurityGroupsMessage extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeClusterSecurityGroupsMessage {
    @inline
    def apply(
        ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeClusterSecurityGroupsMessage = {
      val __obj = js.Dynamic.literal()
      ClusterSecurityGroupName.foreach(__v => __obj.updateDynamic("ClusterSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterSecurityGroupsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
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

  object DescribeClusterSnapshotsMessage {
    @inline
    def apply(
        ClusterExists: js.UndefOr[BooleanOptional] = js.undefined,
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        OwnerAccount: js.UndefOr[String] = js.undefined,
        SnapshotIdentifier: js.UndefOr[String] = js.undefined,
        SnapshotType: js.UndefOr[String] = js.undefined,
        SortingEntities: js.UndefOr[SnapshotSortingEntityList] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeClusterSnapshotsMessage = {
      val __obj = js.Dynamic.literal()
      ClusterExists.foreach(__v => __obj.updateDynamic("ClusterExists")(__v.asInstanceOf[js.Any]))
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      SnapshotIdentifier.foreach(__v => __obj.updateDynamic("SnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.updateDynamic("SnapshotType")(__v.asInstanceOf[js.Any]))
      SortingEntities.foreach(__v => __obj.updateDynamic("SortingEntities")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterSnapshotsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeClusterSubnetGroupsMessage extends js.Object {
    var ClusterSubnetGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeClusterSubnetGroupsMessage {
    @inline
    def apply(
        ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeClusterSubnetGroupsMessage = {
      val __obj = js.Dynamic.literal()
      ClusterSubnetGroupName.foreach(__v => __obj.updateDynamic("ClusterSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterSubnetGroupsMessage]
    }
  }

  @js.native
  trait DescribeClusterTracksMessage extends js.Object {
    var MaintenanceTrackName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeClusterTracksMessage {
    @inline
    def apply(
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeClusterTracksMessage = {
      val __obj = js.Dynamic.literal()
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterTracksMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeClusterVersionsMessage extends js.Object {
    var ClusterParameterGroupFamily: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeClusterVersionsMessage {
    @inline
    def apply(
        ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined,
        ClusterVersion: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeClusterVersionsMessage = {
      val __obj = js.Dynamic.literal()
      ClusterParameterGroupFamily.foreach(__v =>
        __obj.updateDynamic("ClusterParameterGroupFamily")(__v.asInstanceOf[js.Any])
      )
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterVersionsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeClustersMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeClustersMessage {
    @inline
    def apply(
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeClustersMessage = {
      val __obj = js.Dynamic.literal()
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeDefaultClusterParametersMessage extends js.Object {
    var ParameterGroupFamily: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeDefaultClusterParametersMessage {
    @inline
    def apply(
        ParameterGroupFamily: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeDefaultClusterParametersMessage = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupFamily" -> ParameterGroupFamily.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDefaultClusterParametersMessage]
    }
  }

  @js.native
  trait DescribeDefaultClusterParametersResult extends js.Object {
    var DefaultClusterParameters: js.UndefOr[DefaultClusterParameters]
  }

  object DescribeDefaultClusterParametersResult {
    @inline
    def apply(
        DefaultClusterParameters: js.UndefOr[DefaultClusterParameters] = js.undefined
    ): DescribeDefaultClusterParametersResult = {
      val __obj = js.Dynamic.literal()
      DefaultClusterParameters.foreach(__v => __obj.updateDynamic("DefaultClusterParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDefaultClusterParametersResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var SourceType: js.UndefOr[String]
  }

  object DescribeEventCategoriesMessage {
    @inline
    def apply(
        SourceType: js.UndefOr[String] = js.undefined
    ): DescribeEventCategoriesMessage = {
      val __obj = js.Dynamic.literal()
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeEventSubscriptionsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SubscriptionName: js.UndefOr[String] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeEventSubscriptionsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SubscriptionName.foreach(__v => __obj.updateDynamic("SubscriptionName")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
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
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined
    ): DescribeEventsMessage = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.updateDynamic("SourceIdentifier")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeHsmClientCertificatesMessage extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeHsmClientCertificatesMessage {
    @inline
    def apply(
        HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeHsmClientCertificatesMessage = {
      val __obj = js.Dynamic.literal()
      HsmClientCertificateIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmClientCertificateIdentifier")(__v.asInstanceOf[js.Any])
      )
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHsmClientCertificatesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeHsmConfigurationsMessage extends js.Object {
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeHsmConfigurationsMessage {
    @inline
    def apply(
        HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeHsmConfigurationsMessage = {
      val __obj = js.Dynamic.literal()
      HsmConfigurationIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmConfigurationIdentifier")(__v.asInstanceOf[js.Any])
      )
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHsmConfigurationsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeLoggingStatusMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object DescribeLoggingStatusMessage {
    @inline
    def apply(
        ClusterIdentifier: String
    ): DescribeLoggingStatusMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLoggingStatusMessage]
    }
  }

  @js.native
  trait DescribeNodeConfigurationOptionsMessage extends js.Object {
    var ActionType: ActionType
    var ClusterIdentifier: js.UndefOr[String]
    var Filters: js.UndefOr[NodeConfigurationOptionsFilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var OwnerAccount: js.UndefOr[String]
    var SnapshotIdentifier: js.UndefOr[String]
  }

  object DescribeNodeConfigurationOptionsMessage {
    @inline
    def apply(
        ActionType: ActionType,
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        Filters: js.UndefOr[NodeConfigurationOptionsFilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        OwnerAccount: js.UndefOr[String] = js.undefined,
        SnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DescribeNodeConfigurationOptionsMessage = {
      val __obj = js.Dynamic.literal(
        "ActionType" -> ActionType.asInstanceOf[js.Any]
      )

      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      SnapshotIdentifier.foreach(__v => __obj.updateDynamic("SnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNodeConfigurationOptionsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeOrderableClusterOptionsMessage extends js.Object {
    var ClusterVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var NodeType: js.UndefOr[String]
  }

  object DescribeOrderableClusterOptionsMessage {
    @inline
    def apply(
        ClusterVersion: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined
    ): DescribeOrderableClusterOptionsMessage = {
      val __obj = js.Dynamic.literal()
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrderableClusterOptionsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReservedNodeOfferingsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReservedNodeOfferingId: js.UndefOr[String]
  }

  object DescribeReservedNodeOfferingsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReservedNodeOfferingId: js.UndefOr[String] = js.undefined
    ): DescribeReservedNodeOfferingsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ReservedNodeOfferingId.foreach(__v => __obj.updateDynamic("ReservedNodeOfferingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservedNodeOfferingsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeReservedNodesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReservedNodeId: js.UndefOr[String]
  }

  object DescribeReservedNodesMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReservedNodeId: js.UndefOr[String] = js.undefined
    ): DescribeReservedNodesMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ReservedNodeId.foreach(__v => __obj.updateDynamic("ReservedNodeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservedNodesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeResizeMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object DescribeResizeMessage {
    @inline
    def apply(
        ClusterIdentifier: String
    ): DescribeResizeMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeResizeMessage]
    }
  }

  @js.native
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

  object DescribeScheduledActionsMessage {
    @inline
    def apply(
        Active: js.UndefOr[BooleanOptional] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        Filters: js.UndefOr[ScheduledActionFilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ScheduledActionName: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined,
        TargetActionType: js.UndefOr[ScheduledActionTypeValues] = js.undefined
    ): DescribeScheduledActionsMessage = {
      val __obj = js.Dynamic.literal()
      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ScheduledActionName.foreach(__v => __obj.updateDynamic("ScheduledActionName")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      TargetActionType.foreach(__v => __obj.updateDynamic("TargetActionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScheduledActionsMessage]
    }
  }

  /**
    * The result of the <code>DescribeSnapshotCopyGrants</code> action.
    */
  @js.native
  trait DescribeSnapshotCopyGrantsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SnapshotCopyGrantName: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeSnapshotCopyGrantsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotCopyGrantName: js.UndefOr[String] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeSnapshotCopyGrantsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SnapshotCopyGrantName.foreach(__v => __obj.updateDynamic("SnapshotCopyGrantName")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotCopyGrantsMessage]
    }
  }

  @js.native
  trait DescribeSnapshotSchedulesMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ScheduleIdentifier: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeSnapshotSchedulesMessage {
    @inline
    def apply(
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ScheduleIdentifier: js.UndefOr[String] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeSnapshotSchedulesMessage = {
      val __obj = js.Dynamic.literal()
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ScheduleIdentifier.foreach(__v => __obj.updateDynamic("ScheduleIdentifier")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotSchedulesMessage]
    }
  }

  @js.native
  trait DescribeSnapshotSchedulesOutputMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SnapshotSchedules: js.UndefOr[SnapshotScheduleList]
  }

  object DescribeSnapshotSchedulesOutputMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        SnapshotSchedules: js.UndefOr[SnapshotScheduleList] = js.undefined
    ): DescribeSnapshotSchedulesOutputMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      SnapshotSchedules.foreach(__v => __obj.updateDynamic("SnapshotSchedules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotSchedulesOutputMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeTableRestoreStatusMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var TableRestoreRequestId: js.UndefOr[String]
  }

  object DescribeTableRestoreStatusMessage {
    @inline
    def apply(
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        TableRestoreRequestId: js.UndefOr[String] = js.undefined
    ): DescribeTableRestoreStatusMessage = {
      val __obj = js.Dynamic.literal()
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      TableRestoreRequestId.foreach(__v => __obj.updateDynamic("TableRestoreRequestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTableRestoreStatusMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeTagsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeTagsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ResourceName: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): DescribeTagsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DisableLoggingMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object DisableLoggingMessage {
    @inline
    def apply(
        ClusterIdentifier: String
    ): DisableLoggingMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableLoggingMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DisableSnapshotCopyMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object DisableSnapshotCopyMessage {
    @inline
    def apply(
        ClusterIdentifier: String
    ): DisableSnapshotCopyMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableSnapshotCopyMessage]
    }
  }

  @js.native
  trait DisableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DisableSnapshotCopyResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): DisableSnapshotCopyResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableSnapshotCopyResult]
    }
  }

  /**
    * Describes an Amazon EC2 security group.
    */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object EC2SecurityGroup {
    @inline
    def apply(
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): EC2SecurityGroup = {
      val __obj = js.Dynamic.literal()
      EC2SecurityGroupName.foreach(__v => __obj.updateDynamic("EC2SecurityGroupName")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupOwnerId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupOwnerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
    * Describes the status of the elastic IP (EIP) address.
    */
  @js.native
  trait ElasticIpStatus extends js.Object {
    var ElasticIp: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object ElasticIpStatus {
    @inline
    def apply(
        ElasticIp: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): ElasticIpStatus = {
      val __obj = js.Dynamic.literal()
      ElasticIp.foreach(__v => __obj.updateDynamic("ElasticIp")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticIpStatus]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait EnableLoggingMessage extends js.Object {
    var BucketName: String
    var ClusterIdentifier: String
    var S3KeyPrefix: js.UndefOr[String]
  }

  object EnableLoggingMessage {
    @inline
    def apply(
        BucketName: String,
        ClusterIdentifier: String,
        S3KeyPrefix: js.UndefOr[String] = js.undefined
    ): EnableLoggingMessage = {
      val __obj = js.Dynamic.literal(
        "BucketName"        -> BucketName.asInstanceOf[js.Any],
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableLoggingMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait EnableSnapshotCopyMessage extends js.Object {
    var ClusterIdentifier: String
    var DestinationRegion: String
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
    var RetentionPeriod: js.UndefOr[IntegerOptional]
    var SnapshotCopyGrantName: js.UndefOr[String]
  }

  object EnableSnapshotCopyMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        DestinationRegion: String,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        RetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
    ): EnableSnapshotCopyMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "DestinationRegion" -> DestinationRegion.asInstanceOf[js.Any]
      )

      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      SnapshotCopyGrantName.foreach(__v => __obj.updateDynamic("SnapshotCopyGrantName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableSnapshotCopyMessage]
    }
  }

  @js.native
  trait EnableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object EnableSnapshotCopyResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): EnableSnapshotCopyResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableSnapshotCopyResult]
    }
  }

  /**
    * Describes a connection endpoint.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  object Endpoint {
    @inline
    def apply(
        Address: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /**
    * Describes an event.
    */
  @js.native
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var EventId: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var Severity: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  object Event {
    @inline
    def apply(
        Date: js.UndefOr[TStamp] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        EventId: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        Severity: js.UndefOr[String] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.updateDynamic("SourceIdentifier")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /**
    * Describes event categories.
    */
  @js.native
  trait EventCategoriesMap extends js.Object {
    var Events: js.UndefOr[EventInfoMapList]
    var SourceType: js.UndefOr[String]
  }

  object EventCategoriesMap {
    @inline
    def apply(
        Events: js.UndefOr[EventInfoMapList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): EventCategoriesMap = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventCategoriesMap]
    }
  }

  /**
    * <p/>
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
    * Describes event information.
    */
  @js.native
  trait EventInfoMap extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var EventDescription: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var Severity: js.UndefOr[String]
  }

  object EventInfoMap {
    @inline
    def apply(
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        EventDescription: js.UndefOr[String] = js.undefined,
        EventId: js.UndefOr[String] = js.undefined,
        Severity: js.UndefOr[String] = js.undefined
    ): EventInfoMap = {
      val __obj = js.Dynamic.literal()
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      EventDescription.foreach(__v => __obj.updateDynamic("EventDescription")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventInfoMap]
    }
  }

  /**
    * Describes event subscriptions.
    */
  @js.native
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

  object EventSubscription {
    @inline
    def apply(
        CustSubscriptionId: js.UndefOr[String] = js.undefined,
        CustomerAwsId: js.UndefOr[String] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
        Severity: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        SubscriptionCreationTime: js.UndefOr[TStamp] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): EventSubscription = {
      val __obj = js.Dynamic.literal()
      CustSubscriptionId.foreach(__v => __obj.updateDynamic("CustSubscriptionId")(__v.asInstanceOf[js.Any]))
      CustomerAwsId.foreach(__v => __obj.updateDynamic("CustomerAwsId")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategoriesList.foreach(__v => __obj.updateDynamic("EventCategoriesList")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SourceIdsList.foreach(__v => __obj.updateDynamic("SourceIdsList")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubscriptionCreationTime.foreach(__v => __obj.updateDynamic("SubscriptionCreationTime")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSubscription]
    }
  }

  /**
    * <p/>
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
    * <p/>
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
    * The request parameters to get cluster credentials.
    */
  @js.native
  trait GetClusterCredentialsMessage extends js.Object {
    var ClusterIdentifier: String
    var DbUser: String
    var AutoCreate: js.UndefOr[BooleanOptional]
    var DbGroups: js.UndefOr[DbGroupList]
    var DbName: js.UndefOr[String]
    var DurationSeconds: js.UndefOr[IntegerOptional]
  }

  object GetClusterCredentialsMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        DbUser: String,
        AutoCreate: js.UndefOr[BooleanOptional] = js.undefined,
        DbGroups: js.UndefOr[DbGroupList] = js.undefined,
        DbName: js.UndefOr[String] = js.undefined,
        DurationSeconds: js.UndefOr[IntegerOptional] = js.undefined
    ): GetClusterCredentialsMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "DbUser"            -> DbUser.asInstanceOf[js.Any]
      )

      AutoCreate.foreach(__v => __obj.updateDynamic("AutoCreate")(__v.asInstanceOf[js.Any]))
      DbGroups.foreach(__v => __obj.updateDynamic("DbGroups")(__v.asInstanceOf[js.Any]))
      DbName.foreach(__v => __obj.updateDynamic("DbName")(__v.asInstanceOf[js.Any]))
      DurationSeconds.foreach(__v => __obj.updateDynamic("DurationSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClusterCredentialsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GetReservedNodeExchangeOfferingsInputMessage extends js.Object {
    var ReservedNodeId: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object GetReservedNodeExchangeOfferingsInputMessage {
    @inline
    def apply(
        ReservedNodeId: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): GetReservedNodeExchangeOfferingsInputMessage = {
      val __obj = js.Dynamic.literal(
        "ReservedNodeId" -> ReservedNodeId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReservedNodeExchangeOfferingsInputMessage]
    }
  }

  @js.native
  trait GetReservedNodeExchangeOfferingsOutputMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList]
  }

  object GetReservedNodeExchangeOfferingsOutputMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
    ): GetReservedNodeExchangeOfferingsOutputMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReservedNodeOfferings.foreach(__v => __obj.updateDynamic("ReservedNodeOfferings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReservedNodeExchangeOfferingsOutputMessage]
    }
  }

  /**
    * Returns information about an HSM client certificate. The certificate is stored in a secure Hardware Storage Module (HSM), and used by the Amazon Redshift cluster to encrypt data files.
    */
  @js.native
  trait HsmClientCertificate extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmClientCertificatePublicKey: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object HsmClientCertificate {
    @inline
    def apply(
        HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
        HsmClientCertificatePublicKey: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): HsmClientCertificate = {
      val __obj = js.Dynamic.literal()
      HsmClientCertificateIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmClientCertificateIdentifier")(__v.asInstanceOf[js.Any])
      )
      HsmClientCertificatePublicKey.foreach(__v =>
        __obj.updateDynamic("HsmClientCertificatePublicKey")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HsmClientCertificate]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait HsmClientCertificateMessage extends js.Object {
    var HsmClientCertificates: js.UndefOr[HsmClientCertificateList]
    var Marker: js.UndefOr[String]
  }

  object HsmClientCertificateMessage {
    @inline
    def apply(
        HsmClientCertificates: js.UndefOr[HsmClientCertificateList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): HsmClientCertificateMessage = {
      val __obj = js.Dynamic.literal()
      HsmClientCertificates.foreach(__v => __obj.updateDynamic("HsmClientCertificates")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HsmClientCertificateMessage]
    }
  }

  /**
    * Returns information about an HSM configuration, which is an object that describes to Amazon Redshift clusters the information they require to connect to an HSM where they can store database encryption keys.
    */
  @js.native
  trait HsmConfiguration extends js.Object {
    var Description: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var HsmIpAddress: js.UndefOr[String]
    var HsmPartitionName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object HsmConfiguration {
    @inline
    def apply(
        Description: js.UndefOr[String] = js.undefined,
        HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
        HsmIpAddress: js.UndefOr[String] = js.undefined,
        HsmPartitionName: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): HsmConfiguration = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HsmConfigurationIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmConfigurationIdentifier")(__v.asInstanceOf[js.Any])
      )
      HsmIpAddress.foreach(__v => __obj.updateDynamic("HsmIpAddress")(__v.asInstanceOf[js.Any]))
      HsmPartitionName.foreach(__v => __obj.updateDynamic("HsmPartitionName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HsmConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait HsmConfigurationMessage extends js.Object {
    var HsmConfigurations: js.UndefOr[HsmConfigurationList]
    var Marker: js.UndefOr[String]
  }

  object HsmConfigurationMessage {
    @inline
    def apply(
        HsmConfigurations: js.UndefOr[HsmConfigurationList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): HsmConfigurationMessage = {
      val __obj = js.Dynamic.literal()
      HsmConfigurations.foreach(__v => __obj.updateDynamic("HsmConfigurations")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HsmConfigurationMessage]
    }
  }

  /**
    * Describes the status of changes to HSM settings.
    */
  @js.native
  trait HsmStatus extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[String]
    var HsmConfigurationIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object HsmStatus {
    @inline
    def apply(
        HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
        HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): HsmStatus = {
      val __obj = js.Dynamic.literal()
      HsmClientCertificateIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmClientCertificateIdentifier")(__v.asInstanceOf[js.Any])
      )
      HsmConfigurationIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmConfigurationIdentifier")(__v.asInstanceOf[js.Any])
      )
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HsmStatus]
    }
  }

  /**
    * Describes an IP range used in a security group.
    */
  @js.native
  trait IPRange extends js.Object {
    var CIDRIP: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object IPRange {
    @inline
    def apply(
        CIDRIP: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): IPRange = {
      val __obj = js.Dynamic.literal()
      CIDRIP.foreach(__v => __obj.updateDynamic("CIDRIP")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IPRange]
    }
  }

  /**
    * Describes the status of logging for a cluster.
    */
  @js.native
  trait LoggingStatus extends js.Object {
    var BucketName: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var LastFailureTime: js.UndefOr[TStamp]
    var LastSuccessfulDeliveryTime: js.UndefOr[TStamp]
    var LoggingEnabled: js.UndefOr[Boolean]
    var S3KeyPrefix: js.UndefOr[String]
  }

  object LoggingStatus {
    @inline
    def apply(
        BucketName: js.UndefOr[String] = js.undefined,
        LastFailureMessage: js.UndefOr[String] = js.undefined,
        LastFailureTime: js.UndefOr[TStamp] = js.undefined,
        LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.undefined,
        LoggingEnabled: js.UndefOr[Boolean] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined
    ): LoggingStatus = {
      val __obj = js.Dynamic.literal()
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.updateDynamic("LastFailureMessage")(__v.asInstanceOf[js.Any]))
      LastFailureTime.foreach(__v => __obj.updateDynamic("LastFailureTime")(__v.asInstanceOf[js.Any]))
      LastSuccessfulDeliveryTime.foreach(__v =>
        __obj.updateDynamic("LastSuccessfulDeliveryTime")(__v.asInstanceOf[js.Any])
      )
      LoggingEnabled.foreach(__v => __obj.updateDynamic("LoggingEnabled")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingStatus]
    }
  }

  /**
    * Defines a maintenance track that determines which Amazon Redshift version to apply during a maintenance window. If the value for <code>MaintenanceTrack</code> is <code>current</code>, the cluster is updated to the most recently certified maintenance release. If the value is <code>trailing</code>, the cluster is updated to the previously certified maintenance release.
    */
  @js.native
  trait MaintenanceTrack extends js.Object {
    var DatabaseVersion: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList]
  }

  object MaintenanceTrack {
    @inline
    def apply(
        DatabaseVersion: js.UndefOr[String] = js.undefined,
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.undefined
    ): MaintenanceTrack = {
      val __obj = js.Dynamic.literal()
      DatabaseVersion.foreach(__v => __obj.updateDynamic("DatabaseVersion")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      UpdateTargets.foreach(__v => __obj.updateDynamic("UpdateTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceTrack]
    }
  }

  @js.native
  sealed trait Mode extends js.Any
  object Mode extends js.Object {
    val standard           = "standard".asInstanceOf[Mode]
    val `high-performance` = "high-performance".asInstanceOf[Mode]

    val values = js.Object.freeze(js.Array(standard, `high-performance`))
  }

  @js.native
  trait ModifyClusterDbRevisionMessage extends js.Object {
    var ClusterIdentifier: String
    var RevisionTarget: String
  }

  object ModifyClusterDbRevisionMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        RevisionTarget: String
    ): ModifyClusterDbRevisionMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "RevisionTarget"    -> RevisionTarget.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyClusterDbRevisionMessage]
    }
  }

  @js.native
  trait ModifyClusterDbRevisionResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterDbRevisionResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): ModifyClusterDbRevisionResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterDbRevisionResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyClusterIamRolesMessage extends js.Object {
    var ClusterIdentifier: String
    var AddIamRoles: js.UndefOr[IamRoleArnList]
    var RemoveIamRoles: js.UndefOr[IamRoleArnList]
  }

  object ModifyClusterIamRolesMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        AddIamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
        RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.undefined
    ): ModifyClusterIamRolesMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      AddIamRoles.foreach(__v => __obj.updateDynamic("AddIamRoles")(__v.asInstanceOf[js.Any]))
      RemoveIamRoles.foreach(__v => __obj.updateDynamic("RemoveIamRoles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterIamRolesMessage]
    }
  }

  @js.native
  trait ModifyClusterIamRolesResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterIamRolesResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): ModifyClusterIamRolesResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterIamRolesResult]
    }
  }

  @js.native
  trait ModifyClusterMaintenanceMessage extends js.Object {
    var ClusterIdentifier: String
    var DeferMaintenance: js.UndefOr[BooleanOptional]
    var DeferMaintenanceDuration: js.UndefOr[IntegerOptional]
    var DeferMaintenanceEndTime: js.UndefOr[TStamp]
    var DeferMaintenanceIdentifier: js.UndefOr[String]
    var DeferMaintenanceStartTime: js.UndefOr[TStamp]
  }

  object ModifyClusterMaintenanceMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        DeferMaintenance: js.UndefOr[BooleanOptional] = js.undefined,
        DeferMaintenanceDuration: js.UndefOr[IntegerOptional] = js.undefined,
        DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined,
        DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined,
        DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined
    ): ModifyClusterMaintenanceMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      DeferMaintenance.foreach(__v => __obj.updateDynamic("DeferMaintenance")(__v.asInstanceOf[js.Any]))
      DeferMaintenanceDuration.foreach(__v => __obj.updateDynamic("DeferMaintenanceDuration")(__v.asInstanceOf[js.Any]))
      DeferMaintenanceEndTime.foreach(__v => __obj.updateDynamic("DeferMaintenanceEndTime")(__v.asInstanceOf[js.Any]))
      DeferMaintenanceIdentifier.foreach(__v =>
        __obj.updateDynamic("DeferMaintenanceIdentifier")(__v.asInstanceOf[js.Any])
      )
      DeferMaintenanceStartTime.foreach(__v =>
        __obj.updateDynamic("DeferMaintenanceStartTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ModifyClusterMaintenanceMessage]
    }
  }

  @js.native
  trait ModifyClusterMaintenanceResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterMaintenanceResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): ModifyClusterMaintenanceResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterMaintenanceResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
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

  object ModifyClusterMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
        ClusterType: js.UndefOr[String] = js.undefined,
        ClusterVersion: js.UndefOr[String] = js.undefined,
        ElasticIp: js.UndefOr[String] = js.undefined,
        Encrypted: js.UndefOr[BooleanOptional] = js.undefined,
        EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
        HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
        HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        MasterUserPassword: js.UndefOr[String] = js.undefined,
        NewClusterIdentifier: js.UndefOr[String] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): ModifyClusterMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      AllowVersionUpgrade.foreach(__v => __obj.updateDynamic("AllowVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AutomatedSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      ClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("ClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      ClusterSecurityGroups.foreach(__v => __obj.updateDynamic("ClusterSecurityGroups")(__v.asInstanceOf[js.Any]))
      ClusterType.foreach(__v => __obj.updateDynamic("ClusterType")(__v.asInstanceOf[js.Any]))
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      ElasticIp.foreach(__v => __obj.updateDynamic("ElasticIp")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      EnhancedVpcRouting.foreach(__v => __obj.updateDynamic("EnhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      HsmClientCertificateIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmClientCertificateIdentifier")(__v.asInstanceOf[js.Any])
      )
      HsmConfigurationIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmConfigurationIdentifier")(__v.asInstanceOf[js.Any])
      )
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      NewClusterIdentifier.foreach(__v => __obj.updateDynamic("NewClusterIdentifier")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
    var Parameters: ParametersList
  }

  object ModifyClusterParameterGroupMessage {
    @inline
    def apply(
        ParameterGroupName: String,
        Parameters: ParametersList
    ): ModifyClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any],
        "Parameters"         -> Parameters.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ModifyClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): ModifyClusterResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterResult]
    }
  }

  @js.native
  trait ModifyClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: String
    var Force: js.UndefOr[Boolean]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object ModifyClusterSnapshotMessage {
    @inline
    def apply(
        SnapshotIdentifier: String,
        Force: js.UndefOr[Boolean] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    ): ModifyClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      Force.foreach(__v => __obj.updateDynamic("Force")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ModifyClusterSnapshotMessage]
    }
  }

  @js.native
  trait ModifyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object ModifyClusterSnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): ModifyClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterSnapshotResult]
    }
  }

  @js.native
  trait ModifyClusterSnapshotScheduleMessage extends js.Object {
    var ClusterIdentifier: String
    var DisassociateSchedule: js.UndefOr[BooleanOptional]
    var ScheduleIdentifier: js.UndefOr[String]
  }

  object ModifyClusterSnapshotScheduleMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        DisassociateSchedule: js.UndefOr[BooleanOptional] = js.undefined,
        ScheduleIdentifier: js.UndefOr[String] = js.undefined
    ): ModifyClusterSnapshotScheduleMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      DisassociateSchedule.foreach(__v => __obj.updateDynamic("DisassociateSchedule")(__v.asInstanceOf[js.Any]))
      ScheduleIdentifier.foreach(__v => __obj.updateDynamic("ScheduleIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterSnapshotScheduleMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Description: js.UndefOr[String]
  }

  object ModifyClusterSubnetGroupMessage {
    @inline
    def apply(
        ClusterSubnetGroupName: String,
        SubnetIds: SubnetIdentifierList,
        Description: js.UndefOr[String] = js.undefined
    ): ModifyClusterSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"              -> SubnetIds.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup]
  }

  object ModifyClusterSubnetGroupResult {
    @inline
    def apply(
        ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined
    ): ModifyClusterSubnetGroupResult = {
      val __obj = js.Dynamic.literal()
      ClusterSubnetGroup.foreach(__v => __obj.updateDynamic("ClusterSubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyClusterSubnetGroupResult]
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
    var Severity: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
  }

  object ModifyEventSubscriptionMessage {
    @inline
    def apply(
        SubscriptionName: String,
        Enabled: js.UndefOr[BooleanOptional] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        Severity: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): ModifyEventSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SourceIds.foreach(__v => __obj.updateDynamic("SourceIds")(__v.asInstanceOf[js.Any]))
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

  object ModifyScheduledActionMessage {
    @inline
    def apply(
        ScheduledActionName: String,
        Enable: js.UndefOr[BooleanOptional] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        IamRole: js.UndefOr[String] = js.undefined,
        Schedule: js.UndefOr[String] = js.undefined,
        ScheduledActionDescription: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined,
        TargetAction: js.UndefOr[ScheduledActionType] = js.undefined
    ): ModifyScheduledActionMessage = {
      val __obj = js.Dynamic.literal(
        "ScheduledActionName" -> ScheduledActionName.asInstanceOf[js.Any]
      )

      Enable.foreach(__v => __obj.updateDynamic("Enable")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      IamRole.foreach(__v => __obj.updateDynamic("IamRole")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      ScheduledActionDescription.foreach(__v =>
        __obj.updateDynamic("ScheduledActionDescription")(__v.asInstanceOf[js.Any])
      )
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      TargetAction.foreach(__v => __obj.updateDynamic("TargetAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyScheduledActionMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifySnapshotCopyRetentionPeriodMessage extends js.Object {
    var ClusterIdentifier: String
    var RetentionPeriod: Int
    var Manual: js.UndefOr[Boolean]
  }

  object ModifySnapshotCopyRetentionPeriodMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        RetentionPeriod: Int,
        Manual: js.UndefOr[Boolean] = js.undefined
    ): ModifySnapshotCopyRetentionPeriodMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "RetentionPeriod"   -> RetentionPeriod.asInstanceOf[js.Any]
      )

      Manual.foreach(__v => __obj.updateDynamic("Manual")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifySnapshotCopyRetentionPeriodMessage]
    }
  }

  @js.native
  trait ModifySnapshotCopyRetentionPeriodResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifySnapshotCopyRetentionPeriodResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): ModifySnapshotCopyRetentionPeriodResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifySnapshotCopyRetentionPeriodResult]
    }
  }

  @js.native
  trait ModifySnapshotScheduleMessage extends js.Object {
    var ScheduleDefinitions: ScheduleDefinitionList
    var ScheduleIdentifier: String
  }

  object ModifySnapshotScheduleMessage {
    @inline
    def apply(
        ScheduleDefinitions: ScheduleDefinitionList,
        ScheduleIdentifier: String
    ): ModifySnapshotScheduleMessage = {
      val __obj = js.Dynamic.literal(
        "ScheduleDefinitions" -> ScheduleDefinitions.asInstanceOf[js.Any],
        "ScheduleIdentifier"  -> ScheduleIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifySnapshotScheduleMessage]
    }
  }

  /**
    * A list of node configurations.
    */
  @js.native
  trait NodeConfigurationOption extends js.Object {
    var EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional]
    var Mode: js.UndefOr[Mode]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[Int]
  }

  object NodeConfigurationOption {
    @inline
    def apply(
        EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional] = js.undefined,
        Mode: js.UndefOr[Mode] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumberOfNodes: js.UndefOr[Int] = js.undefined
    ): NodeConfigurationOption = {
      val __obj = js.Dynamic.literal()
      EstimatedDiskUtilizationPercent.foreach(__v =>
        __obj.updateDynamic("EstimatedDiskUtilizationPercent")(__v.asInstanceOf[js.Any])
      )
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeConfigurationOption]
    }
  }

  /**
    * A set of elements to filter the returned node configurations.
    */
  @js.native
  trait NodeConfigurationOptionsFilter extends js.Object {
    var Name: js.UndefOr[NodeConfigurationOptionsFilterName]
    var Operator: js.UndefOr[OperatorType]
    var Values: js.UndefOr[ValueStringList]
  }

  object NodeConfigurationOptionsFilter {
    @inline
    def apply(
        Name: js.UndefOr[NodeConfigurationOptionsFilterName] = js.undefined,
        Operator: js.UndefOr[OperatorType] = js.undefined,
        Values: js.UndefOr[ValueStringList] = js.undefined
    ): NodeConfigurationOptionsFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Operator.foreach(__v => __obj.updateDynamic("Operator")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeConfigurationOptionsFilter]
    }
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
  trait NodeConfigurationOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var NodeConfigurationOptionList: js.UndefOr[NodeConfigurationOptionList]
  }

  object NodeConfigurationOptionsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        NodeConfigurationOptionList: js.UndefOr[NodeConfigurationOptionList] = js.undefined
    ): NodeConfigurationOptionsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      NodeConfigurationOptionList.foreach(__v =>
        __obj.updateDynamic("NodeConfigurationOptionList")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[NodeConfigurationOptionsMessage]
    }
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
  trait OrderableClusterOption extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var ClusterType: js.UndefOr[String]
    var ClusterVersion: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
  }

  object OrderableClusterOption {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
        ClusterType: js.UndefOr[String] = js.undefined,
        ClusterVersion: js.UndefOr[String] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined
    ): OrderableClusterOption = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      ClusterType.foreach(__v => __obj.updateDynamic("ClusterType")(__v.asInstanceOf[js.Any]))
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderableClusterOption]
    }
  }

  /**
    * Contains the output from the <a>DescribeOrderableClusterOptions</a> action.
    */
  @js.native
  trait OrderableClusterOptionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList]
  }

  object OrderableClusterOptionsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList] = js.undefined
    ): OrderableClusterOptionsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      OrderableClusterOptions.foreach(__v => __obj.updateDynamic("OrderableClusterOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderableClusterOptionsMessage]
    }
  }

  /**
    * Describes a parameter in a cluster parameter group.
    */
  @js.native
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

  object Parameter {
    @inline
    def apply(
        AllowedValues: js.UndefOr[String] = js.undefined,
        ApplyType: js.UndefOr[ParameterApplyType] = js.undefined,
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

  object PendingModifiedValues {
    @inline
    def apply(
        AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        ClusterType: js.UndefOr[String] = js.undefined,
        ClusterVersion: js.UndefOr[String] = js.undefined,
        EncryptionType: js.UndefOr[String] = js.undefined,
        EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        MasterUserPassword: js.UndefOr[String] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    ): PendingModifiedValues = {
      val __obj = js.Dynamic.literal()
      AutomatedSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      ClusterType.foreach(__v => __obj.updateDynamic("ClusterType")(__v.asInstanceOf[js.Any]))
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      EnhancedVpcRouting.foreach(__v => __obj.updateDynamic("EnhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingModifiedValues]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait PurchaseReservedNodeOfferingMessage extends js.Object {
    var ReservedNodeOfferingId: String
    var NodeCount: js.UndefOr[IntegerOptional]
  }

  object PurchaseReservedNodeOfferingMessage {
    @inline
    def apply(
        ReservedNodeOfferingId: String,
        NodeCount: js.UndefOr[IntegerOptional] = js.undefined
    ): PurchaseReservedNodeOfferingMessage = {
      val __obj = js.Dynamic.literal(
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.asInstanceOf[js.Any]
      )

      NodeCount.foreach(__v => __obj.updateDynamic("NodeCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedNodeOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedNodeOfferingResult extends js.Object {
    var ReservedNode: js.UndefOr[ReservedNode]
  }

  object PurchaseReservedNodeOfferingResult {
    @inline
    def apply(
        ReservedNode: js.UndefOr[ReservedNode] = js.undefined
    ): PurchaseReservedNodeOfferingResult = {
      val __obj = js.Dynamic.literal()
      ReservedNode.foreach(__v => __obj.updateDynamic("ReservedNode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedNodeOfferingResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RebootClusterMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object RebootClusterMessage {
    @inline
    def apply(
        ClusterIdentifier: String
    ): RebootClusterMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebootClusterMessage]
    }
  }

  @js.native
  trait RebootClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RebootClusterResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): RebootClusterResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootClusterResult]
    }
  }

  /**
    * Describes a recurring charge.
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

  /**
    * Describes a reserved node. You can call the <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved node offerings.
    */
  @js.native
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

  object ReservedNode {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        NodeCount: js.UndefOr[Int] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservedNodeId: js.UndefOr[String] = js.undefined,
        ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
        ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedNode = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      NodeCount.foreach(__v => __obj.updateDynamic("NodeCount")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservedNodeId.foreach(__v => __obj.updateDynamic("ReservedNodeId")(__v.asInstanceOf[js.Any]))
      ReservedNodeOfferingId.foreach(__v => __obj.updateDynamic("ReservedNodeOfferingId")(__v.asInstanceOf[js.Any]))
      ReservedNodeOfferingType.foreach(__v => __obj.updateDynamic("ReservedNodeOfferingType")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedNode]
    }
  }

  /**
    * Describes a reserved node offering.
    */
  @js.native
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

  object ReservedNodeOffering {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
        ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedNodeOffering = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservedNodeOfferingId.foreach(__v => __obj.updateDynamic("ReservedNodeOfferingId")(__v.asInstanceOf[js.Any]))
      ReservedNodeOfferingType.foreach(__v => __obj.updateDynamic("ReservedNodeOfferingType")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedNodeOffering]
    }
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
  trait ReservedNodeOfferingsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList]
  }

  object ReservedNodeOfferingsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
    ): ReservedNodeOfferingsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReservedNodeOfferings.foreach(__v => __obj.updateDynamic("ReservedNodeOfferings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedNodeOfferingsMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ReservedNodesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodes: js.UndefOr[ReservedNodeList]
  }

  object ReservedNodesMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedNodes: js.UndefOr[ReservedNodeList] = js.undefined
    ): ReservedNodesMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReservedNodes.foreach(__v => __obj.updateDynamic("ReservedNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedNodesMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ResetClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
    var Parameters: js.UndefOr[ParametersList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  object ResetClusterParameterGroupMessage {
    @inline
    def apply(
        ParameterGroupName: String,
        Parameters: js.UndefOr[ParametersList] = js.undefined,
        ResetAllParameters: js.UndefOr[Boolean] = js.undefined
    ): ResetClusterParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResetAllParameters.foreach(__v => __obj.updateDynamic("ResetAllParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ResizeClusterMessage extends js.Object {
    var ClusterIdentifier: String
    var Classic: js.UndefOr[BooleanOptional]
    var ClusterType: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var NumberOfNodes: js.UndefOr[Int]
  }

  object ResizeClusterMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        Classic: js.UndefOr[BooleanOptional] = js.undefined,
        ClusterType: js.UndefOr[String] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumberOfNodes: js.UndefOr[Int] = js.undefined
    ): ResizeClusterMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      Classic.foreach(__v => __obj.updateDynamic("Classic")(__v.asInstanceOf[js.Any]))
      ClusterType.foreach(__v => __obj.updateDynamic("ClusterType")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResizeClusterMessage]
    }
  }

  @js.native
  trait ResizeClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ResizeClusterResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): ResizeClusterResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResizeClusterResult]
    }
  }

  /**
    * Describes a resize operation.
    */
  @js.native
  trait ResizeInfo extends js.Object {
    var AllowCancelResize: js.UndefOr[Boolean]
    var ResizeType: js.UndefOr[String]
  }

  object ResizeInfo {
    @inline
    def apply(
        AllowCancelResize: js.UndefOr[Boolean] = js.undefined,
        ResizeType: js.UndefOr[String] = js.undefined
    ): ResizeInfo = {
      val __obj = js.Dynamic.literal()
      AllowCancelResize.foreach(__v => __obj.updateDynamic("AllowCancelResize")(__v.asInstanceOf[js.Any]))
      ResizeType.foreach(__v => __obj.updateDynamic("ResizeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResizeInfo]
    }
  }

  /**
    * Describes the result of a cluster resize operation.
    */
  @js.native
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

  object ResizeProgressMessage {
    @inline
    def apply(
        AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
        DataTransferProgressPercent: js.UndefOr[DoubleOptional] = js.undefined,
        ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
        EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
        ImportTablesCompleted: js.UndefOr[ImportTablesCompleted] = js.undefined,
        ImportTablesInProgress: js.UndefOr[ImportTablesInProgress] = js.undefined,
        ImportTablesNotStarted: js.UndefOr[ImportTablesNotStarted] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
        ResizeType: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TargetClusterType: js.UndefOr[String] = js.undefined,
        TargetEncryptionType: js.UndefOr[String] = js.undefined,
        TargetNodeType: js.UndefOr[String] = js.undefined,
        TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
        TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
    ): ResizeProgressMessage = {
      val __obj = js.Dynamic.literal()
      AvgResizeRateInMegaBytesPerSecond.foreach(__v =>
        __obj.updateDynamic("AvgResizeRateInMegaBytesPerSecond")(__v.asInstanceOf[js.Any])
      )
      DataTransferProgressPercent.foreach(__v =>
        __obj.updateDynamic("DataTransferProgressPercent")(__v.asInstanceOf[js.Any])
      )
      ElapsedTimeInSeconds.foreach(__v => __obj.updateDynamic("ElapsedTimeInSeconds")(__v.asInstanceOf[js.Any]))
      EstimatedTimeToCompletionInSeconds.foreach(__v =>
        __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(__v.asInstanceOf[js.Any])
      )
      ImportTablesCompleted.foreach(__v => __obj.updateDynamic("ImportTablesCompleted")(__v.asInstanceOf[js.Any]))
      ImportTablesInProgress.foreach(__v => __obj.updateDynamic("ImportTablesInProgress")(__v.asInstanceOf[js.Any]))
      ImportTablesNotStarted.foreach(__v => __obj.updateDynamic("ImportTablesNotStarted")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ProgressInMegaBytes.foreach(__v => __obj.updateDynamic("ProgressInMegaBytes")(__v.asInstanceOf[js.Any]))
      ResizeType.foreach(__v => __obj.updateDynamic("ResizeType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetClusterType.foreach(__v => __obj.updateDynamic("TargetClusterType")(__v.asInstanceOf[js.Any]))
      TargetEncryptionType.foreach(__v => __obj.updateDynamic("TargetEncryptionType")(__v.asInstanceOf[js.Any]))
      TargetNodeType.foreach(__v => __obj.updateDynamic("TargetNodeType")(__v.asInstanceOf[js.Any]))
      TargetNumberOfNodes.foreach(__v => __obj.updateDynamic("TargetNumberOfNodes")(__v.asInstanceOf[js.Any]))
      TotalResizeDataInMegaBytes.foreach(__v =>
        __obj.updateDynamic("TotalResizeDataInMegaBytes")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ResizeProgressMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
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

  object RestoreFromClusterSnapshotMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        SnapshotIdentifier: String,
        AdditionalInfo: js.UndefOr[String] = js.undefined,
        AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
        ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
        ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
        ElasticIp: js.UndefOr[String] = js.undefined,
        EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
        HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
        HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
        IamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
        OwnerAccount: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
        SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreFromClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier"  -> ClusterIdentifier.asInstanceOf[js.Any],
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      AdditionalInfo.foreach(__v => __obj.updateDynamic("AdditionalInfo")(__v.asInstanceOf[js.Any]))
      AllowVersionUpgrade.foreach(__v => __obj.updateDynamic("AllowVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AutomatedSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      ClusterParameterGroupName.foreach(__v =>
        __obj.updateDynamic("ClusterParameterGroupName")(__v.asInstanceOf[js.Any])
      )
      ClusterSecurityGroups.foreach(__v => __obj.updateDynamic("ClusterSecurityGroups")(__v.asInstanceOf[js.Any]))
      ClusterSubnetGroupName.foreach(__v => __obj.updateDynamic("ClusterSubnetGroupName")(__v.asInstanceOf[js.Any]))
      ElasticIp.foreach(__v => __obj.updateDynamic("ElasticIp")(__v.asInstanceOf[js.Any]))
      EnhancedVpcRouting.foreach(__v => __obj.updateDynamic("EnhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      HsmClientCertificateIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmClientCertificateIdentifier")(__v.asInstanceOf[js.Any])
      )
      HsmConfigurationIdentifier.foreach(__v =>
        __obj.updateDynamic("HsmConfigurationIdentifier")(__v.asInstanceOf[js.Any])
      )
      IamRoles.foreach(__v => __obj.updateDynamic("IamRoles")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      SnapshotClusterIdentifier.foreach(__v =>
        __obj.updateDynamic("SnapshotClusterIdentifier")(__v.asInstanceOf[js.Any])
      )
      SnapshotScheduleIdentifier.foreach(__v =>
        __obj.updateDynamic("SnapshotScheduleIdentifier")(__v.asInstanceOf[js.Any])
      )
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreFromClusterSnapshotMessage]
    }
  }

  @js.native
  trait RestoreFromClusterSnapshotResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RestoreFromClusterSnapshotResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): RestoreFromClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreFromClusterSnapshotResult]
    }
  }

  /**
    * Describes the status of a cluster restore action. Returns null if the cluster was not created by restoring a snapshot.
    */
  @js.native
  trait RestoreStatus extends js.Object {
    var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double]
    var ElapsedTimeInSeconds: js.UndefOr[Double]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[Double]
    var ProgressInMegaBytes: js.UndefOr[Double]
    var SnapshotSizeInMegaBytes: js.UndefOr[Double]
    var Status: js.UndefOr[String]
  }

  object RestoreStatus {
    @inline
    def apply(
        CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
        ElapsedTimeInSeconds: js.UndefOr[Double] = js.undefined,
        EstimatedTimeToCompletionInSeconds: js.UndefOr[Double] = js.undefined,
        ProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
        SnapshotSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): RestoreStatus = {
      val __obj = js.Dynamic.literal()
      CurrentRestoreRateInMegaBytesPerSecond.foreach(__v =>
        __obj.updateDynamic("CurrentRestoreRateInMegaBytesPerSecond")(__v.asInstanceOf[js.Any])
      )
      ElapsedTimeInSeconds.foreach(__v => __obj.updateDynamic("ElapsedTimeInSeconds")(__v.asInstanceOf[js.Any]))
      EstimatedTimeToCompletionInSeconds.foreach(__v =>
        __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(__v.asInstanceOf[js.Any])
      )
      ProgressInMegaBytes.foreach(__v => __obj.updateDynamic("ProgressInMegaBytes")(__v.asInstanceOf[js.Any]))
      SnapshotSizeInMegaBytes.foreach(__v => __obj.updateDynamic("SnapshotSizeInMegaBytes")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreStatus]
    }
  }

  /**
    * <p/>
    */
  @js.native
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

  object RestoreTableFromClusterSnapshotMessage {
    @inline
    def apply(
        ClusterIdentifier: String,
        NewTableName: String,
        SnapshotIdentifier: String,
        SourceDatabaseName: String,
        SourceTableName: String,
        SourceSchemaName: js.UndefOr[String] = js.undefined,
        TargetDatabaseName: js.UndefOr[String] = js.undefined,
        TargetSchemaName: js.UndefOr[String] = js.undefined
    ): RestoreTableFromClusterSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier"  -> ClusterIdentifier.asInstanceOf[js.Any],
        "NewTableName"       -> NewTableName.asInstanceOf[js.Any],
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any],
        "SourceDatabaseName" -> SourceDatabaseName.asInstanceOf[js.Any],
        "SourceTableName"    -> SourceTableName.asInstanceOf[js.Any]
      )

      SourceSchemaName.foreach(__v => __obj.updateDynamic("SourceSchemaName")(__v.asInstanceOf[js.Any]))
      TargetDatabaseName.foreach(__v => __obj.updateDynamic("TargetDatabaseName")(__v.asInstanceOf[js.Any]))
      TargetSchemaName.foreach(__v => __obj.updateDynamic("TargetSchemaName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreTableFromClusterSnapshotMessage]
    }
  }

  @js.native
  trait RestoreTableFromClusterSnapshotResult extends js.Object {
    var TableRestoreStatus: js.UndefOr[TableRestoreStatus]
  }

  object RestoreTableFromClusterSnapshotResult {
    @inline
    def apply(
        TableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined
    ): RestoreTableFromClusterSnapshotResult = {
      val __obj = js.Dynamic.literal()
      TableRestoreStatus.foreach(__v => __obj.updateDynamic("TableRestoreStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreTableFromClusterSnapshotResult]
    }
  }

  /**
    * Describes a <code>RevisionTarget</code>.
    */
  @js.native
  trait RevisionTarget extends js.Object {
    var DatabaseRevision: js.UndefOr[String]
    var DatabaseRevisionReleaseDate: js.UndefOr[TStamp]
    var Description: js.UndefOr[String]
  }

  object RevisionTarget {
    @inline
    def apply(
        DatabaseRevision: js.UndefOr[String] = js.undefined,
        DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined
    ): RevisionTarget = {
      val __obj = js.Dynamic.literal()
      DatabaseRevision.foreach(__v => __obj.updateDynamic("DatabaseRevision")(__v.asInstanceOf[js.Any]))
      DatabaseRevisionReleaseDate.foreach(__v =>
        __obj.updateDynamic("DatabaseRevisionReleaseDate")(__v.asInstanceOf[js.Any])
      )
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevisionTarget]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RevokeClusterSecurityGroupIngressMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var CIDRIP: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object RevokeClusterSecurityGroupIngressMessage {
    @inline
    def apply(
        ClusterSecurityGroupName: String,
        CIDRIP: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): RevokeClusterSecurityGroupIngressMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.asInstanceOf[js.Any]
      )

      CIDRIP.foreach(__v => __obj.updateDynamic("CIDRIP")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupName.foreach(__v => __obj.updateDynamic("EC2SecurityGroupName")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupOwnerId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupOwnerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeClusterSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object RevokeClusterSecurityGroupIngressResult {
    @inline
    def apply(
        ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): RevokeClusterSecurityGroupIngressResult = {
      val __obj = js.Dynamic.literal()
      ClusterSecurityGroup.foreach(__v => __obj.updateDynamic("ClusterSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeClusterSecurityGroupIngressResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RevokeSnapshotAccessMessage extends js.Object {
    var AccountWithRestoreAccess: String
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: js.UndefOr[String]
  }

  object RevokeSnapshotAccessMessage {
    @inline
    def apply(
        AccountWithRestoreAccess: String,
        SnapshotIdentifier: String,
        SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    ): RevokeSnapshotAccessMessage = {
      val __obj = js.Dynamic.literal(
        "AccountWithRestoreAccess" -> AccountWithRestoreAccess.asInstanceOf[js.Any],
        "SnapshotIdentifier"       -> SnapshotIdentifier.asInstanceOf[js.Any]
      )

      SnapshotClusterIdentifier.foreach(__v =>
        __obj.updateDynamic("SnapshotClusterIdentifier")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RevokeSnapshotAccessMessage]
    }
  }

  @js.native
  trait RevokeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object RevokeSnapshotAccessResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): RevokeSnapshotAccessResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeSnapshotAccessResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RotateEncryptionKeyMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object RotateEncryptionKeyMessage {
    @inline
    def apply(
        ClusterIdentifier: String
    ): RotateEncryptionKeyMessage = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RotateEncryptionKeyMessage]
    }
  }

  @js.native
  trait RotateEncryptionKeyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RotateEncryptionKeyResult {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): RotateEncryptionKeyResult = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RotateEncryptionKeyResult]
    }
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

  object ScheduledAction {
    @inline
    def apply(
        EndTime: js.UndefOr[TStamp] = js.undefined,
        IamRole: js.UndefOr[String] = js.undefined,
        NextInvocations: js.UndefOr[ScheduledActionTimeList] = js.undefined,
        Schedule: js.UndefOr[String] = js.undefined,
        ScheduledActionDescription: js.UndefOr[String] = js.undefined,
        ScheduledActionName: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined,
        State: js.UndefOr[ScheduledActionState] = js.undefined,
        TargetAction: js.UndefOr[ScheduledActionType] = js.undefined
    ): ScheduledAction = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      IamRole.foreach(__v => __obj.updateDynamic("IamRole")(__v.asInstanceOf[js.Any]))
      NextInvocations.foreach(__v => __obj.updateDynamic("NextInvocations")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      ScheduledActionDescription.foreach(__v =>
        __obj.updateDynamic("ScheduledActionDescription")(__v.asInstanceOf[js.Any])
      )
      ScheduledActionName.foreach(__v => __obj.updateDynamic("ScheduledActionName")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TargetAction.foreach(__v => __obj.updateDynamic("TargetAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledAction]
    }
  }

  /**
    * A set of elements to filter the returned scheduled actions.
    */
  @js.native
  trait ScheduledActionFilter extends js.Object {
    var Name: ScheduledActionFilterName
    var Values: ValueStringList
  }

  object ScheduledActionFilter {
    @inline
    def apply(
        Name: ScheduledActionFilterName,
        Values: ValueStringList
    ): ScheduledActionFilter = {
      val __obj = js.Dynamic.literal(
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ScheduledActionFilter]
    }
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
  trait ScheduledActionType extends js.Object {
    var ResizeCluster: js.UndefOr[ResizeClusterMessage]
  }

  object ScheduledActionType {
    @inline
    def apply(
        ResizeCluster: js.UndefOr[ResizeClusterMessage] = js.undefined
    ): ScheduledActionType = {
      val __obj = js.Dynamic.literal()
      ResizeCluster.foreach(__v => __obj.updateDynamic("ResizeCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledActionType]
    }
  }

  @js.native
  sealed trait ScheduledActionTypeValues extends js.Any
  object ScheduledActionTypeValues extends js.Object {
    val ResizeCluster = "ResizeCluster".asInstanceOf[ScheduledActionTypeValues]

    val values = js.Object.freeze(js.Array(ResizeCluster))
  }

  @js.native
  trait ScheduledActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ScheduledActions: js.UndefOr[ScheduledActionList]
  }

  object ScheduledActionsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ScheduledActions: js.UndefOr[ScheduledActionList] = js.undefined
    ): ScheduledActionsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ScheduledActions.foreach(__v => __obj.updateDynamic("ScheduledActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledActionsMessage]
    }
  }

  /**
    * Describes a snapshot.
    */
  @js.native
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

  object Snapshot {
    @inline
    def apply(
        AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList] = js.undefined,
        ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        BackupProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
        ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        ClusterVersion: js.UndefOr[String] = js.undefined,
        CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
        DBName: js.UndefOr[String] = js.undefined,
        ElapsedTimeInSeconds: js.UndefOr[Double] = js.undefined,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        EncryptedWithHSM: js.UndefOr[Boolean] = js.undefined,
        EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
        EstimatedSecondsToCompletion: js.UndefOr[Double] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
        MasterUsername: js.UndefOr[String] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumberOfNodes: js.UndefOr[Int] = js.undefined,
        OwnerAccount: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined,
        RestorableNodeTypes: js.UndefOr[RestorableNodeTypeList] = js.undefined,
        SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
        SnapshotIdentifier: js.UndefOr[String] = js.undefined,
        SnapshotRetentionStartTime: js.UndefOr[TStamp] = js.undefined,
        SnapshotType: js.UndefOr[String] = js.undefined,
        SourceRegion: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): Snapshot = {
      val __obj = js.Dynamic.literal()
      AccountsWithRestoreAccess.foreach(__v =>
        __obj.updateDynamic("AccountsWithRestoreAccess")(__v.asInstanceOf[js.Any])
      )
      ActualIncrementalBackupSizeInMegaBytes.foreach(__v =>
        __obj.updateDynamic("ActualIncrementalBackupSizeInMegaBytes")(__v.asInstanceOf[js.Any])
      )
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      BackupProgressInMegaBytes.foreach(__v =>
        __obj.updateDynamic("BackupProgressInMegaBytes")(__v.asInstanceOf[js.Any])
      )
      ClusterCreateTime.foreach(__v => __obj.updateDynamic("ClusterCreateTime")(__v.asInstanceOf[js.Any]))
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      CurrentBackupRateInMegaBytesPerSecond.foreach(__v =>
        __obj.updateDynamic("CurrentBackupRateInMegaBytesPerSecond")(__v.asInstanceOf[js.Any])
      )
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      ElapsedTimeInSeconds.foreach(__v => __obj.updateDynamic("ElapsedTimeInSeconds")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      EncryptedWithHSM.foreach(__v => __obj.updateDynamic("EncryptedWithHSM")(__v.asInstanceOf[js.Any]))
      EnhancedVpcRouting.foreach(__v => __obj.updateDynamic("EnhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      EstimatedSecondsToCompletion.foreach(__v =>
        __obj.updateDynamic("EstimatedSecondsToCompletion")(__v.asInstanceOf[js.Any])
      )
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRemainingDays.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRemainingDays")(__v.asInstanceOf[js.Any])
      )
      ManualSnapshotRetentionPeriod.foreach(__v =>
        __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any])
      )
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RestorableNodeTypes.foreach(__v => __obj.updateDynamic("RestorableNodeTypes")(__v.asInstanceOf[js.Any]))
      SnapshotCreateTime.foreach(__v => __obj.updateDynamic("SnapshotCreateTime")(__v.asInstanceOf[js.Any]))
      SnapshotIdentifier.foreach(__v => __obj.updateDynamic("SnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionStartTime.foreach(__v =>
        __obj.updateDynamic("SnapshotRetentionStartTime")(__v.asInstanceOf[js.Any])
      )
      SnapshotType.foreach(__v => __obj.updateDynamic("SnapshotType")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TotalBackupSizeInMegaBytes.foreach(__v =>
        __obj.updateDynamic("TotalBackupSizeInMegaBytes")(__v.asInstanceOf[js.Any])
      )
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Snapshot]
    }
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
  trait SnapshotCopyGrant extends js.Object {
    var KmsKeyId: js.UndefOr[String]
    var SnapshotCopyGrantName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object SnapshotCopyGrant {
    @inline
    def apply(
        KmsKeyId: js.UndefOr[String] = js.undefined,
        SnapshotCopyGrantName: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): SnapshotCopyGrant = {
      val __obj = js.Dynamic.literal()
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      SnapshotCopyGrantName.foreach(__v => __obj.updateDynamic("SnapshotCopyGrantName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotCopyGrant]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait SnapshotCopyGrantMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList]
  }

  object SnapshotCopyGrantMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList] = js.undefined
    ): SnapshotCopyGrantMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      SnapshotCopyGrants.foreach(__v => __obj.updateDynamic("SnapshotCopyGrants")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotCopyGrantMessage]
    }
  }

  /**
    * Describes the errors returned by a snapshot.
    */
  @js.native
  trait SnapshotErrorMessage extends js.Object {
    var FailureCode: js.UndefOr[String]
    var FailureReason: js.UndefOr[String]
    var SnapshotClusterIdentifier: js.UndefOr[String]
    var SnapshotIdentifier: js.UndefOr[String]
  }

  object SnapshotErrorMessage {
    @inline
    def apply(
        FailureCode: js.UndefOr[String] = js.undefined,
        FailureReason: js.UndefOr[String] = js.undefined,
        SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
        SnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): SnapshotErrorMessage = {
      val __obj = js.Dynamic.literal()
      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      SnapshotClusterIdentifier.foreach(__v =>
        __obj.updateDynamic("SnapshotClusterIdentifier")(__v.asInstanceOf[js.Any])
      )
      SnapshotIdentifier.foreach(__v => __obj.updateDynamic("SnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotErrorMessage]
    }
  }

  /**
    * Contains the output from the <a>DescribeClusterSnapshots</a> action.
    */
  @js.native
  trait SnapshotMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Snapshots: js.UndefOr[SnapshotList]
  }

  object SnapshotMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Snapshots: js.UndefOr[SnapshotList] = js.undefined
    ): SnapshotMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Snapshots.foreach(__v => __obj.updateDynamic("Snapshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotMessage]
    }
  }

  /**
    * Describes a snapshot schedule. You can set a regular interval for creating snapshots of a cluster. You can also schedule snapshots for specific dates.
    */
  @js.native
  trait SnapshotSchedule extends js.Object {
    var AssociatedClusterCount: js.UndefOr[IntegerOptional]
    var AssociatedClusters: js.UndefOr[AssociatedClusterList]
    var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList]
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList]
    var ScheduleDescription: js.UndefOr[String]
    var ScheduleIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object SnapshotSchedule {
    @inline
    def apply(
        AssociatedClusterCount: js.UndefOr[IntegerOptional] = js.undefined,
        AssociatedClusters: js.UndefOr[AssociatedClusterList] = js.undefined,
        NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.undefined,
        ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined,
        ScheduleDescription: js.UndefOr[String] = js.undefined,
        ScheduleIdentifier: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): SnapshotSchedule = {
      val __obj = js.Dynamic.literal()
      AssociatedClusterCount.foreach(__v => __obj.updateDynamic("AssociatedClusterCount")(__v.asInstanceOf[js.Any]))
      AssociatedClusters.foreach(__v => __obj.updateDynamic("AssociatedClusters")(__v.asInstanceOf[js.Any]))
      NextInvocations.foreach(__v => __obj.updateDynamic("NextInvocations")(__v.asInstanceOf[js.Any]))
      ScheduleDefinitions.foreach(__v => __obj.updateDynamic("ScheduleDefinitions")(__v.asInstanceOf[js.Any]))
      ScheduleDescription.foreach(__v => __obj.updateDynamic("ScheduleDescription")(__v.asInstanceOf[js.Any]))
      ScheduleIdentifier.foreach(__v => __obj.updateDynamic("ScheduleIdentifier")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotSchedule]
    }
  }

  /**
    * Describes a sorting entity
    */
  @js.native
  trait SnapshotSortingEntity extends js.Object {
    var Attribute: SnapshotAttributeToSortBy
    var SortOrder: js.UndefOr[SortByOrder]
  }

  object SnapshotSortingEntity {
    @inline
    def apply(
        Attribute: SnapshotAttributeToSortBy,
        SortOrder: js.UndefOr[SortByOrder] = js.undefined
    ): SnapshotSortingEntity = {
      val __obj = js.Dynamic.literal(
        "Attribute" -> Attribute.asInstanceOf[js.Any]
      )

      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotSortingEntity]
    }
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
    * Describes the operations that are allowed on a maintenance track.
    */
  @js.native
  trait SupportedOperation extends js.Object {
    var OperationName: js.UndefOr[String]
  }

  object SupportedOperation {
    @inline
    def apply(
        OperationName: js.UndefOr[String] = js.undefined
    ): SupportedOperation = {
      val __obj = js.Dynamic.literal()
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SupportedOperation]
    }
  }

  /**
    * A list of supported platforms for orderable clusters.
    */
  @js.native
  trait SupportedPlatform extends js.Object {
    var Name: js.UndefOr[String]
  }

  object SupportedPlatform {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): SupportedPlatform = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SupportedPlatform]
    }
  }

  /**
    * Describes the status of a <a>RestoreTableFromClusterSnapshot</a> operation.
    */
  @js.native
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

  object TableRestoreStatus {
    @inline
    def apply(
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        NewTableName: js.UndefOr[String] = js.undefined,
        ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
        RequestTime: js.UndefOr[TStamp] = js.undefined,
        SnapshotIdentifier: js.UndefOr[String] = js.undefined,
        SourceDatabaseName: js.UndefOr[String] = js.undefined,
        SourceSchemaName: js.UndefOr[String] = js.undefined,
        SourceTableName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[TableRestoreStatusType] = js.undefined,
        TableRestoreRequestId: js.UndefOr[String] = js.undefined,
        TargetDatabaseName: js.UndefOr[String] = js.undefined,
        TargetSchemaName: js.UndefOr[String] = js.undefined,
        TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
    ): TableRestoreStatus = {
      val __obj = js.Dynamic.literal()
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      NewTableName.foreach(__v => __obj.updateDynamic("NewTableName")(__v.asInstanceOf[js.Any]))
      ProgressInMegaBytes.foreach(__v => __obj.updateDynamic("ProgressInMegaBytes")(__v.asInstanceOf[js.Any]))
      RequestTime.foreach(__v => __obj.updateDynamic("RequestTime")(__v.asInstanceOf[js.Any]))
      SnapshotIdentifier.foreach(__v => __obj.updateDynamic("SnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      SourceDatabaseName.foreach(__v => __obj.updateDynamic("SourceDatabaseName")(__v.asInstanceOf[js.Any]))
      SourceSchemaName.foreach(__v => __obj.updateDynamic("SourceSchemaName")(__v.asInstanceOf[js.Any]))
      SourceTableName.foreach(__v => __obj.updateDynamic("SourceTableName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TableRestoreRequestId.foreach(__v => __obj.updateDynamic("TableRestoreRequestId")(__v.asInstanceOf[js.Any]))
      TargetDatabaseName.foreach(__v => __obj.updateDynamic("TargetDatabaseName")(__v.asInstanceOf[js.Any]))
      TargetSchemaName.foreach(__v => __obj.updateDynamic("TargetSchemaName")(__v.asInstanceOf[js.Any]))
      TotalDataInMegaBytes.foreach(__v => __obj.updateDynamic("TotalDataInMegaBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableRestoreStatus]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TableRestoreStatusMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList]
  }

  object TableRestoreStatusMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.undefined
    ): TableRestoreStatusMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      TableRestoreStatusDetails.foreach(__v =>
        __obj.updateDynamic("TableRestoreStatusDetails")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[TableRestoreStatusMessage]
    }
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
    * A tag and its associated resource.
    */
  @js.native
  trait TaggedResource extends js.Object {
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
    var Tag: js.UndefOr[Tag]
  }

  object TaggedResource {
    @inline
    def apply(
        ResourceName: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined,
        Tag: js.UndefOr[Tag] = js.undefined
    ): TaggedResource = {
      val __obj = js.Dynamic.literal()
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.updateDynamic("Tag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaggedResource]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TaggedResourceListMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var TaggedResources: js.UndefOr[TaggedResourceList]
  }

  object TaggedResourceListMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        TaggedResources: js.UndefOr[TaggedResourceList] = js.undefined
    ): TaggedResourceListMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      TaggedResources.foreach(__v => __obj.updateDynamic("TaggedResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaggedResourceListMessage]
    }
  }

  @js.native
  trait TrackListMessage extends js.Object {
    var MaintenanceTracks: js.UndefOr[TrackList]
    var Marker: js.UndefOr[String]
  }

  object TrackListMessage {
    @inline
    def apply(
        MaintenanceTracks: js.UndefOr[TrackList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): TrackListMessage = {
      val __obj = js.Dynamic.literal()
      MaintenanceTracks.foreach(__v => __obj.updateDynamic("MaintenanceTracks")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrackListMessage]
    }
  }

  /**
    * A maintenance track that you can switch the current track to.
    */
  @js.native
  trait UpdateTarget extends js.Object {
    var DatabaseVersion: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var SupportedOperations: js.UndefOr[SupportedOperationList]
  }

  object UpdateTarget {
    @inline
    def apply(
        DatabaseVersion: js.UndefOr[String] = js.undefined,
        MaintenanceTrackName: js.UndefOr[String] = js.undefined,
        SupportedOperations: js.UndefOr[SupportedOperationList] = js.undefined
    ): UpdateTarget = {
      val __obj = js.Dynamic.literal()
      DatabaseVersion.foreach(__v => __obj.updateDynamic("DatabaseVersion")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      SupportedOperations.foreach(__v => __obj.updateDynamic("SupportedOperations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTarget]
    }
  }

  /**
    * Describes the members of a VPC security group.
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
