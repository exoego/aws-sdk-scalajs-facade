package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object redshift {
  type AccountsWithRestoreAccessList      = js.Array[AccountWithRestoreAccess]
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
  type OrderableClusterOptionsList        = js.Array[OrderableClusterOption]
  type ParameterApplyType                 = String
  type ParameterGroupList                 = js.Array[ClusterParameterGroup]
  type ParametersList                     = js.Array[Parameter]
  type PendingActionsList                 = js.Array[String]
  type RecurringChargeList                = js.Array[RecurringCharge]
  type ReservedNodeList                   = js.Array[ReservedNode]
  type ReservedNodeOfferingList           = js.Array[ReservedNodeOffering]
  type ReservedNodeOfferingType           = String
  type RestorableNodeTypeList             = js.Array[String]
  type RevisionTargetsList                = js.Array[RevisionTarget]
  type ScheduleDefinitionList             = js.Array[String]
  type ScheduleState                      = String
  type ScheduledSnapshotTimeList          = js.Array[TStamp]
  type SensitiveString                    = String
  type SnapshotAttributeToSortBy          = String
  type SnapshotCopyGrantList              = js.Array[SnapshotCopyGrant]
  type SnapshotIdentifierList             = js.Array[String]
  type SnapshotList                       = js.Array[Snapshot]
  type SnapshotScheduleList               = js.Array[SnapshotSchedule]
  type SnapshotSortingEntityList          = js.Array[SnapshotSortingEntity]
  type SortByOrder                        = String
  type SourceIdsList                      = js.Array[String]
  type SourceType                         = String
  type SubnetIdentifierList               = js.Array[String]
  type SubnetList                         = js.Array[Subnet]
  type SupportedOperationList             = js.Array[SupportedOperation]
  type SupportedPlatformsList             = js.Array[SupportedPlatform]
  type TStamp                             = js.Date
  type TableRestoreStatusList             = js.Array[TableRestoreStatus]
  type TableRestoreStatusType             = String
  type TagKeyList                         = js.Array[String]
  type TagList                            = js.Array[Tag]
  type TagValueList                       = js.Array[String]
  type TaggedResourceList                 = js.Array[TaggedResource]
  type TrackList                          = js.Array[MaintenanceTrack]
  type VpcSecurityGroupIdList             = js.Array[String]
  type VpcSecurityGroupMembershipList     = js.Array[VpcSecurityGroupMembership]
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
    def describeOrderableClusterOptions(
        params: DescribeOrderableClusterOptionsMessage
    ): Request[OrderableClusterOptionsMessage] = js.native
    def describeReservedNodeOfferings(
        params: DescribeReservedNodeOfferingsMessage
    ): Request[ReservedNodeOfferingsMessage]                                                       = js.native
    def describeReservedNodes(params: DescribeReservedNodesMessage): Request[ReservedNodesMessage] = js.native
    def describeResize(params: DescribeResizeMessage): Request[ResizeProgressMessage]              = js.native
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
    def apply(ReservedNodeId: String, TargetReservedNodeOfferingId: String): AcceptReservedNodeExchangeInputMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeId"               -> ReservedNodeId.asInstanceOf[js.Any],
        "TargetReservedNodeOfferingId" -> TargetReservedNodeOfferingId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptReservedNodeExchangeInputMessage]
    }
  }

  @js.native
  trait AcceptReservedNodeExchangeOutputMessage extends js.Object {
    var ExchangedReservedNode: js.UndefOr[ReservedNode]
  }

  object AcceptReservedNodeExchangeOutputMessage {
    def apply(
        ExchangedReservedNode: js.UndefOr[ReservedNode] = js.undefined
    ): AcceptReservedNodeExchangeOutputMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ExchangedReservedNode" -> ExchangedReservedNode.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptReservedNodeExchangeOutputMessage]
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
    def apply(AttributeName: js.UndefOr[String] = js.undefined,
              AttributeValues: js.UndefOr[AttributeValueList] = js.undefined): AccountAttribute = {
      val _fields = IndexedSeq[(String, js.Any)]("AttributeName" -> AttributeName.map { x =>
        x.asInstanceOf[js.Any]
      }, "AttributeValues" -> AttributeValues.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttribute]
    }
  }

  @js.native
  trait AccountAttributeList extends js.Object {
    var AccountAttributes: js.UndefOr[AttributeList]
  }

  object AccountAttributeList {
    def apply(AccountAttributes: js.UndefOr[AttributeList] = js.undefined): AccountAttributeList = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountAttributes" -> AccountAttributes.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttributeList]
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
    def apply(AccountAlias: js.UndefOr[String] = js.undefined,
              AccountId: js.UndefOr[String] = js.undefined): AccountWithRestoreAccess = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountAlias" -> AccountAlias.map { x =>
        x.asInstanceOf[js.Any]
      }, "AccountId" -> AccountId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountWithRestoreAccess]
    }
  }

  /**
    * Describes an attribute value.
    */
  @js.native
  trait AttributeValueTarget extends js.Object {
    var AttributeValue: js.UndefOr[String]
  }

  object AttributeValueTarget {
    def apply(AttributeValue: js.UndefOr[String] = js.undefined): AttributeValueTarget = {
      val _fields = IndexedSeq[(String, js.Any)]("AttributeValue" -> AttributeValue.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValueTarget]
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
    def apply(
        ClusterSecurityGroupName: String,
        CIDRIP: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): AuthorizeClusterSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.asInstanceOf[js.Any],
        "CIDRIP" -> CIDRIP.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object AuthorizeClusterSecurityGroupIngressResult {
    def apply(
        ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): AuthorizeClusterSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterSecurityGroup" -> ClusterSecurityGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AuthorizeClusterSecurityGroupIngressResult]
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
    def apply(AccountWithRestoreAccess: String,
              SnapshotIdentifier: String,
              SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined): AuthorizeSnapshotAccessMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountWithRestoreAccess" -> AccountWithRestoreAccess.asInstanceOf[js.Any],
        "SnapshotIdentifier"       -> SnapshotIdentifier.asInstanceOf[js.Any],
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSnapshotAccessMessage]
    }
  }

  @js.native
  trait AuthorizeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object AuthorizeSnapshotAccessResult {
    def apply(Snapshot: js.UndefOr[Snapshot] = js.undefined): AuthorizeSnapshotAccessResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Snapshot" -> Snapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSnapshotAccessResult]
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
    def apply(Name: js.UndefOr[String] = js.undefined,
              SupportedPlatforms: js.UndefOr[SupportedPlatformsList] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "SupportedPlatforms" -> SupportedPlatforms.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  @js.native
  trait BatchDeleteClusterSnapshotsRequest extends js.Object {
    var Identifiers: DeleteClusterSnapshotMessageList
  }

  object BatchDeleteClusterSnapshotsRequest {
    def apply(Identifiers: DeleteClusterSnapshotMessageList): BatchDeleteClusterSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("Identifiers" -> Identifiers.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteClusterSnapshotsRequest]
    }
  }

  @js.native
  trait BatchDeleteClusterSnapshotsResult extends js.Object {
    var Errors: js.UndefOr[BatchSnapshotOperationErrorList]
    var Resources: js.UndefOr[SnapshotIdentifierList]
  }

  object BatchDeleteClusterSnapshotsResult {
    def apply(Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.undefined,
              Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined): BatchDeleteClusterSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Errors" -> Errors.map { x =>
        x.asInstanceOf[js.Any]
      }, "Resources" -> Resources.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteClusterSnapshotsResult]
    }
  }

  @js.native
  trait BatchModifyClusterSnapshotsMessage extends js.Object {
    var SnapshotIdentifierList: SnapshotIdentifierList
    var Force: js.UndefOr[Boolean]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object BatchModifyClusterSnapshotsMessage {
    def apply(
        SnapshotIdentifierList: SnapshotIdentifierList,
        Force: js.UndefOr[Boolean] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    ): BatchModifyClusterSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifierList" -> SnapshotIdentifierList.asInstanceOf[js.Any],
        "Force" -> Force.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchModifyClusterSnapshotsMessage]
    }
  }

  @js.native
  trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
    var Errors: js.UndefOr[BatchSnapshotOperationErrors]
    var Resources: js.UndefOr[SnapshotIdentifierList]
  }

  object BatchModifyClusterSnapshotsOutputMessage {
    def apply(
        Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.undefined,
        Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
    ): BatchModifyClusterSnapshotsOutputMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Errors" -> Errors.map { x =>
        x.asInstanceOf[js.Any]
      }, "Resources" -> Resources.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
    }
  }

  @js.native
  trait CancelResizeMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object CancelResizeMessage {
    def apply(ClusterIdentifier: String): CancelResizeMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelResizeMessage]
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
    var HsmStatus: js.UndefOr[HsmStatus]
    var IamRoles: js.UndefOr[ClusterIamRoleList]
    var KmsKeyId: js.UndefOr[String]
    var MaintenanceTrackName: js.UndefOr[String]
    var ManualSnapshotRetentionPeriod: js.UndefOr[Int]
    var MasterUsername: js.UndefOr[String]
    var ModifyStatus: js.UndefOr[String]
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
    def apply(AllowVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
              AutomatedSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
              AvailabilityZone: js.UndefOr[String] = js.undefined,
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
              HsmStatus: js.UndefOr[HsmStatus] = js.undefined,
              IamRoles: js.UndefOr[ClusterIamRoleList] = js.undefined,
              KmsKeyId: js.UndefOr[String] = js.undefined,
              MaintenanceTrackName: js.UndefOr[String] = js.undefined,
              ManualSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
              MasterUsername: js.UndefOr[String] = js.undefined,
              ModifyStatus: js.UndefOr[String] = js.undefined,
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
              VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowVersionUpgrade" -> AllowVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterCreateTime" -> ClusterCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterNodes" -> ClusterNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterParameterGroups" -> ClusterParameterGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterPublicKey" -> ClusterPublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterRevisionNumber" -> ClusterRevisionNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterSnapshotCopyStatus" -> ClusterSnapshotCopyStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterStatus" -> ClusterStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBName" -> DBName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DataTransferProgress" -> DataTransferProgress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeferredMaintenanceWindows" -> DeferredMaintenanceWindows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElasticIpStatus" -> ElasticIpStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElasticResizeNumberOfNodeOptions" -> ElasticResizeNumberOfNodeOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encrypted" -> Encrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Endpoint" -> Endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmStatus" -> HsmStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamRoles" -> IamRoles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ModifyStatus" -> ModifyStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfNodes" -> NumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PendingActions" -> PendingActions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PendingModifiedValues" -> PendingModifiedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResizeInfo" -> ResizeInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestoreStatus" -> RestoreStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotScheduleIdentifier" -> SnapshotScheduleIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotScheduleState" -> SnapshotScheduleState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
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
    def apply(DbPassword: js.UndefOr[SensitiveString] = js.undefined,
              DbUser: js.UndefOr[String] = js.undefined,
              Expiration: js.UndefOr[TStamp] = js.undefined): ClusterCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DbPassword" -> DbPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbUser" -> DbUser.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Expiration" -> Expiration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterCredentials]
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
    def apply(ClusterIdentifier: js.UndefOr[String] = js.undefined,
              CurrentDatabaseRevision: js.UndefOr[String] = js.undefined,
              DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined,
              RevisionTargets: js.UndefOr[RevisionTargetsList] = js.undefined): ClusterDbRevision = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentDatabaseRevision" -> CurrentDatabaseRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseRevisionReleaseDate" -> DatabaseRevisionReleaseDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionTargets" -> RevisionTargets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterDbRevision]
    }
  }

  @js.native
  trait ClusterDbRevisionsMessage extends js.Object {
    var ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList]
    var Marker: js.UndefOr[String]
  }

  object ClusterDbRevisionsMessage {
    def apply(ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): ClusterDbRevisionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterDbRevisions" -> ClusterDbRevisions.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterDbRevisionsMessage]
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
    def apply(ApplyStatus: js.UndefOr[String] = js.undefined,
              IamRoleArn: js.UndefOr[String] = js.undefined): ClusterIamRole = {
      val _fields = IndexedSeq[(String, js.Any)]("ApplyStatus" -> ApplyStatus.map { x =>
        x.asInstanceOf[js.Any]
      }, "IamRoleArn" -> IamRoleArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterIamRole]
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
    def apply(NodeRole: js.UndefOr[String] = js.undefined,
              PrivateIPAddress: js.UndefOr[String] = js.undefined,
              PublicIPAddress: js.UndefOr[String] = js.undefined): ClusterNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeRole" -> NodeRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateIPAddress" -> PrivateIPAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicIPAddress" -> PublicIPAddress.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterNode]
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
    def apply(Description: js.UndefOr[String] = js.undefined,
              ParameterGroupFamily: js.UndefOr[String] = js.undefined,
              ParameterGroupName: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): ClusterParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterGroupFamily" -> ParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterGroupName" -> ParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroup]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              Parameters: js.UndefOr[ParametersList] = js.undefined): ClusterParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "Parameters" -> Parameters.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupDetails]
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
    def apply(ParameterGroupName: js.UndefOr[String] = js.undefined,
              ParameterGroupStatus: js.UndefOr[String] = js.undefined): ClusterParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ParameterGroupName" -> ParameterGroupName.map { x =>
        x.asInstanceOf[js.Any]
      }, "ParameterGroupStatus" -> ParameterGroupStatus.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupNameMessage]
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
    def apply(ClusterParameterStatusList: js.UndefOr[ClusterParameterStatusList] = js.undefined,
              ParameterApplyStatus: js.UndefOr[String] = js.undefined,
              ParameterGroupName: js.UndefOr[String] = js.undefined): ClusterParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterParameterStatusList" -> ClusterParameterStatusList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterGroupName" -> ParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupStatus]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined): ClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "ParameterGroups" -> ParameterGroups.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupsMessage]
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
    def apply(ParameterApplyErrorDescription: js.UndefOr[String] = js.undefined,
              ParameterApplyStatus: js.UndefOr[String] = js.undefined,
              ParameterName: js.UndefOr[String] = js.undefined): ClusterParameterStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterApplyErrorDescription" -> ParameterApplyErrorDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterName" -> ParameterName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterStatus]
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
    def apply(ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
              IPRanges: js.UndefOr[IPRangeList] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): ClusterSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroups" -> EC2SecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IPRanges" -> IPRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroup]
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
    def apply(ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): ClusterSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x =>
        x.asInstanceOf[js.Any]
      }, "Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroupMembership]
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
    def apply(ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): ClusterSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterSecurityGroups" -> ClusterSecurityGroups.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroupMessage]
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
    def apply(DestinationRegion: js.UndefOr[String] = js.undefined,
              ManualSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
              RetentionPeriod: js.UndefOr[Double] = js.undefined,
              SnapshotCopyGrantName: js.UndefOr[String] = js.undefined): ClusterSnapshotCopyStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationRegion" -> DestinationRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RetentionPeriod" -> RetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSnapshotCopyStatus]
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
    def apply(ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              SubnetGroupStatus: js.UndefOr[String] = js.undefined,
              Subnets: js.UndefOr[SubnetList] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): ClusterSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetGroupStatus" -> SubnetGroupStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subnets" -> Subnets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSubnetGroup]
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
    def apply(ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): ClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterSubnetGroups" -> ClusterSubnetGroups.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSubnetGroupMessage]
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
    def apply(ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined,
              ClusterVersion: js.UndefOr[String] = js.undefined,
              Description: js.UndefOr[String] = js.undefined): ClusterVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterParameterGroupFamily" -> ClusterParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterVersion]
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
    def apply(ClusterVersions: js.UndefOr[ClusterVersionList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): ClusterVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterVersions" -> ClusterVersions.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterVersionsMessage]
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
    def apply(Clusters: js.UndefOr[ClusterList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): ClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Clusters" -> Clusters.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClustersMessage]
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
    def apply(SourceSnapshotIdentifier: String,
              TargetSnapshotIdentifier: String,
              ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.undefined): CopyClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceSnapshotIdentifier" -> SourceSnapshotIdentifier.asInstanceOf[js.Any],
        "TargetSnapshotIdentifier" -> TargetSnapshotIdentifier.asInstanceOf[js.Any],
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceSnapshotClusterIdentifier" -> SourceSnapshotClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyClusterSnapshotMessage]
    }
  }

  @js.native
  trait CopyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CopyClusterSnapshotResult {
    def apply(Snapshot: js.UndefOr[Snapshot] = js.undefined): CopyClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Snapshot" -> Snapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyClusterSnapshotResult]
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
    def apply(ClusterIdentifier: String,
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
              VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): CreateClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier"  -> ClusterIdentifier.asInstanceOf[js.Any],
        "MasterUserPassword" -> MasterUserPassword.asInstanceOf[js.Any],
        "MasterUsername"     -> MasterUsername.asInstanceOf[js.Any],
        "NodeType"           -> NodeType.asInstanceOf[js.Any],
        "AdditionalInfo" -> AdditionalInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowVersionUpgrade" -> AllowVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterParameterGroupName" -> ClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterType" -> ClusterType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBName" -> DBName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElasticIp" -> ElasticIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encrypted" -> Encrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamRoles" -> IamRoles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfNodes" -> NumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotScheduleIdentifier" -> SnapshotScheduleIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterMessage]
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
    def apply(Description: String,
              ParameterGroupFamily: String,
              ParameterGroupName: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description"          -> Description.asInstanceOf[js.Any],
        "ParameterGroupFamily" -> ParameterGroupFamily.asInstanceOf[js.Any],
        "ParameterGroupName"   -> ParameterGroupName.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CreateClusterParameterGroupResult extends js.Object {
    var ClusterParameterGroup: js.UndefOr[ClusterParameterGroup]
  }

  object CreateClusterParameterGroupResult {
    def apply(
        ClusterParameterGroup: js.UndefOr[ClusterParameterGroup] = js.undefined
    ): CreateClusterParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterParameterGroup" -> ClusterParameterGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterParameterGroupResult]
    }
  }

  @js.native
  trait CreateClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): CreateClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResult]
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
    def apply(ClusterSecurityGroupName: String,
              Description: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateClusterSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.asInstanceOf[js.Any],
        "Description"              -> Description.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateClusterSecurityGroupResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object CreateClusterSecurityGroupResult {
    def apply(
        ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): CreateClusterSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterSecurityGroup" -> ClusterSecurityGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSecurityGroupResult]
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
    def apply(ClusterIdentifier: String,
              SnapshotIdentifier: String,
              ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): CreateClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier"  -> ClusterIdentifier.asInstanceOf[js.Any],
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any],
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSnapshotMessage]
    }
  }

  @js.native
  trait CreateClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CreateClusterSnapshotResult {
    def apply(Snapshot: js.UndefOr[Snapshot] = js.undefined): CreateClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Snapshot" -> Snapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSnapshotResult]
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
    def apply(ClusterSubnetGroupName: String,
              Description: String,
              SubnetIds: SubnetIdentifierList,
              Tags: js.UndefOr[TagList] = js.undefined): CreateClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.asInstanceOf[js.Any],
        "Description"            -> Description.asInstanceOf[js.Any],
        "SubnetIds"              -> SubnetIds.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup]
  }

  object CreateClusterSubnetGroupResult {
    def apply(ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined): CreateClusterSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterSubnetGroup" -> ClusterSubnetGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSubnetGroupResult]
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
    def apply(SnsTopicArn: String,
              SubscriptionName: String,
              Enabled: js.UndefOr[BooleanOptional] = js.undefined,
              EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              Severity: js.UndefOr[String] = js.undefined,
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
        "Severity" -> Severity.map { x =>
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

  /**
    * <p/>
    */
  @js.native
  trait CreateHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: String
    var Tags: js.UndefOr[TagList]
  }

  object CreateHsmClientCertificateMessage {
    def apply(HsmClientCertificateIdentifier: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateHsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmClientCertificateMessage]
    }
  }

  @js.native
  trait CreateHsmClientCertificateResult extends js.Object {
    var HsmClientCertificate: js.UndefOr[HsmClientCertificate]
  }

  object CreateHsmClientCertificateResult {
    def apply(
        HsmClientCertificate: js.UndefOr[HsmClientCertificate] = js.undefined
    ): CreateHsmClientCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)]("HsmClientCertificate" -> HsmClientCertificate.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmClientCertificateResult]
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
    def apply(Description: String,
              HsmConfigurationIdentifier: String,
              HsmIpAddress: String,
              HsmPartitionName: String,
              HsmPartitionPassword: String,
              HsmServerPublicCertificate: String,
              Tags: js.UndefOr[TagList] = js.undefined): CreateHsmConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description"                -> Description.asInstanceOf[js.Any],
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.asInstanceOf[js.Any],
        "HsmIpAddress"               -> HsmIpAddress.asInstanceOf[js.Any],
        "HsmPartitionName"           -> HsmPartitionName.asInstanceOf[js.Any],
        "HsmPartitionPassword"       -> HsmPartitionPassword.asInstanceOf[js.Any],
        "HsmServerPublicCertificate" -> HsmServerPublicCertificate.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmConfigurationMessage]
    }
  }

  @js.native
  trait CreateHsmConfigurationResult extends js.Object {
    var HsmConfiguration: js.UndefOr[HsmConfiguration]
  }

  object CreateHsmConfigurationResult {
    def apply(HsmConfiguration: js.UndefOr[HsmConfiguration] = js.undefined): CreateHsmConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)]("HsmConfiguration" -> HsmConfiguration.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmConfigurationResult]
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
    def apply(SnapshotCopyGrantName: String,
              KmsKeyId: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): CreateSnapshotCopyGrantMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.asInstanceOf[js.Any],
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotCopyGrantMessage]
    }
  }

  @js.native
  trait CreateSnapshotCopyGrantResult extends js.Object {
    var SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant]
  }

  object CreateSnapshotCopyGrantResult {
    def apply(SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant] = js.undefined): CreateSnapshotCopyGrantResult = {
      val _fields = IndexedSeq[(String, js.Any)]("SnapshotCopyGrant" -> SnapshotCopyGrant.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotCopyGrantResult]
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
    def apply(DryRun: js.UndefOr[BooleanOptional] = js.undefined,
              NextInvocations: js.UndefOr[IntegerOptional] = js.undefined,
              ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined,
              ScheduleDescription: js.UndefOr[String] = js.undefined,
              ScheduleIdentifier: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): CreateSnapshotScheduleMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DryRun" -> DryRun.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextInvocations" -> NextInvocations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleDefinitions" -> ScheduleDefinitions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleDescription" -> ScheduleDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotScheduleMessage]
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
    def apply(ResourceName: String, Tags: TagList): CreateTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsMessage]
    }
  }

  @js.native
  trait CustomerStorageMessage extends js.Object {
    var TotalBackupSizeInMegaBytes: js.UndefOr[Double]
    var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double]
  }

  object CustomerStorageMessage {
    def apply(TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
              TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.undefined): CustomerStorageMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TotalBackupSizeInMegaBytes" -> TotalBackupSizeInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalProvisionedStorageInMegaBytes" -> TotalProvisionedStorageInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerStorageMessage]
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
    def apply(CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
              DataTransferredInMegaBytes: js.UndefOr[Double] = js.undefined,
              ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
              EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              TotalDataInMegaBytes: js.UndefOr[Double] = js.undefined): DataTransferProgress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentRateInMegaBytesPerSecond" -> CurrentRateInMegaBytesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DataTransferredInMegaBytes" -> DataTransferredInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EstimatedTimeToCompletionInSeconds" -> EstimatedTimeToCompletionInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalDataInMegaBytes" -> TotalDataInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataTransferProgress]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              ParameterGroupFamily: js.UndefOr[String] = js.undefined,
              Parameters: js.UndefOr[ParametersList] = js.undefined): DefaultClusterParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterGroupFamily" -> ParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultClusterParameters]
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
    def apply(DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined,
              DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined,
              DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined): DeferredMaintenanceWindow = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeferMaintenanceEndTime" -> DeferMaintenanceEndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeferMaintenanceIdentifier" -> DeferMaintenanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeferMaintenanceStartTime" -> DeferMaintenanceStartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeferredMaintenanceWindow]
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
    def apply(ClusterIdentifier: String,
              FinalClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined,
              FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              SkipFinalClusterSnapshot: js.UndefOr[Boolean] = js.undefined): DeleteClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "FinalClusterSnapshotIdentifier" -> FinalClusterSnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FinalClusterSnapshotRetentionPeriod" -> FinalClusterSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkipFinalClusterSnapshot" -> SkipFinalClusterSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterMessage]
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
    def apply(ParameterGroupName: String): DeleteClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterParameterGroupMessage]
    }
  }

  @js.native
  trait DeleteClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): DeleteClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResult]
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
    def apply(ClusterSecurityGroupName: String): DeleteClusterSecurityGroupMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("ClusterSecurityGroupName" -> ClusterSecurityGroupName.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSecurityGroupMessage]
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
    def apply(SnapshotIdentifier: String,
              SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined): DeleteClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any],
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSnapshotMessage]
    }
  }

  @js.native
  trait DeleteClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object DeleteClusterSnapshotResult {
    def apply(Snapshot: js.UndefOr[Snapshot] = js.undefined): DeleteClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Snapshot" -> Snapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSnapshotResult]
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
    def apply(ClusterSubnetGroupName: String): DeleteClusterSubnetGroupMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("ClusterSubnetGroupName" -> ClusterSubnetGroupName.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSubnetGroupMessage]
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

  /**
    * <p/>
    */
  @js.native
  trait DeleteHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: String
  }

  object DeleteHsmClientCertificateMessage {
    def apply(HsmClientCertificateIdentifier: String): DeleteHsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmClientCertificateMessage]
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
    def apply(HsmConfigurationIdentifier: String): DeleteHsmConfigurationMessage = {
      val _fields =
        IndexedSeq[(String, js.Any)]("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmConfigurationMessage]
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
    def apply(SnapshotCopyGrantName: String): DeleteSnapshotCopyGrantMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("SnapshotCopyGrantName" -> SnapshotCopyGrantName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotCopyGrantMessage]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleMessage extends js.Object {
    var ScheduleIdentifier: String
  }

  object DeleteSnapshotScheduleMessage {
    def apply(ScheduleIdentifier: String): DeleteSnapshotScheduleMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ScheduleIdentifier" -> ScheduleIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotScheduleMessage]
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
    def apply(ResourceName: String, TagKeys: TagKeyList): DeleteTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsMessage]
    }
  }

  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object DescribeAccountAttributesMessage {
    def apply(AttributeNames: js.UndefOr[AttributeNameList] = js.undefined): DescribeAccountAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("AttributeNames" -> AttributeNames.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesMessage]
    }
  }

  @js.native
  trait DescribeClusterDbRevisionsMessage extends js.Object {
    var ClusterIdentifier: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeClusterDbRevisionsMessage {
    def apply(ClusterIdentifier: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeClusterDbRevisionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterDbRevisionsMessage]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              ParameterGroupName: js.UndefOr[String] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParameterGroupName" -> ParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterParameterGroupsMessage]
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
    def apply(ParameterGroupName: String,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              Source: js.UndefOr[String] = js.undefined): DescribeClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any],
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

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterParametersMessage]
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
    def apply(ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeClusterSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSecurityGroupsMessage]
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
    def apply(ClusterExists: js.UndefOr[BooleanOptional] = js.undefined,
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
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeClusterSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterExists" -> ClusterExists.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OwnerAccount" -> OwnerAccount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotType" -> SnapshotType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortingEntities" -> SortingEntities.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSnapshotsMessage]
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
    def apply(ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeClusterSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSubnetGroupsMessage]
    }
  }

  @js.native
  trait DescribeClusterTracksMessage extends js.Object {
    var MaintenanceTrackName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeClusterTracksMessage {
    def apply(MaintenanceTrackName: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeClusterTracksMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterTracksMessage]
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
    def apply(ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined,
              ClusterVersion: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeClusterVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterParameterGroupFamily" -> ClusterParameterGroupFamily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterVersionsMessage]
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
    def apply(ClusterIdentifier: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersMessage]
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
    def apply(ParameterGroupFamily: String,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeDefaultClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupFamily" -> ParameterGroupFamily.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultClusterParametersMessage]
    }
  }

  @js.native
  trait DescribeDefaultClusterParametersResult extends js.Object {
    var DefaultClusterParameters: js.UndefOr[DefaultClusterParameters]
  }

  object DescribeDefaultClusterParametersResult {
    def apply(
        DefaultClusterParameters: js.UndefOr[DefaultClusterParameters] = js.undefined
    ): DescribeDefaultClusterParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DefaultClusterParameters" -> DefaultClusterParameters.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultClusterParametersResult]
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
    def apply(SourceType: js.UndefOr[String] = js.undefined): DescribeEventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("SourceType" -> SourceType.map { x =>
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
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
    var TagKeys: js.UndefOr[TagKeyList]
    var TagValues: js.UndefOr[TagValueList]
  }

  object DescribeEventSubscriptionsMessage {
    def apply(Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              SubscriptionName: js.UndefOr[String] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeEventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubscriptionName" -> SubscriptionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
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
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var StartTime: js.UndefOr[TStamp]
  }

  object DescribeEventsMessage {
    def apply(Duration: js.UndefOr[IntegerOptional] = js.undefined,
              EndTime: js.UndefOr[TStamp] = js.undefined,
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
    def apply(HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeHsmClientCertificatesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmClientCertificatesMessage]
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
    def apply(HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeHsmConfigurationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmConfigurationsMessage]
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
    def apply(ClusterIdentifier: String): DescribeLoggingStatusMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoggingStatusMessage]
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
    def apply(ClusterVersion: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              NodeType: js.UndefOr[String] = js.undefined): DescribeOrderableClusterOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrderableClusterOptionsMessage]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              ReservedNodeOfferingId: js.UndefOr[String] = js.undefined): DescribeReservedNodeOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedNodeOfferingsMessage]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              ReservedNodeId: js.UndefOr[String] = js.undefined): DescribeReservedNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedNodeId" -> ReservedNodeId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedNodesMessage]
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
    def apply(ClusterIdentifier: String): DescribeResizeMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResizeMessage]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              SnapshotCopyGrantName: js.UndefOr[String] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeSnapshotCopyGrantsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotCopyGrantsMessage]
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
    def apply(ClusterIdentifier: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              ScheduleIdentifier: js.UndefOr[String] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeSnapshotSchedulesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotSchedulesMessage]
    }
  }

  @js.native
  trait DescribeSnapshotSchedulesOutputMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var SnapshotSchedules: js.UndefOr[SnapshotScheduleList]
  }

  object DescribeSnapshotSchedulesOutputMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        SnapshotSchedules: js.UndefOr[SnapshotScheduleList] = js.undefined
    ): DescribeSnapshotSchedulesOutputMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "SnapshotSchedules" -> SnapshotSchedules.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotSchedulesOutputMessage]
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
    def apply(ClusterIdentifier: js.UndefOr[String] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              TableRestoreRequestId: js.UndefOr[String] = js.undefined): DescribeTableRestoreStatusMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableRestoreRequestId" -> TableRestoreRequestId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableRestoreStatusMessage]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
              ResourceName: js.UndefOr[String] = js.undefined,
              ResourceType: js.UndefOr[String] = js.undefined,
              TagKeys: js.UndefOr[TagKeyList] = js.undefined,
              TagValues: js.UndefOr[TagValueList] = js.undefined): DescribeTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceName" -> ResourceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagValues" -> TagValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsMessage]
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
    def apply(ClusterIdentifier: String): DisableLoggingMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableLoggingMessage]
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
    def apply(ClusterIdentifier: String): DisableSnapshotCopyMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSnapshotCopyMessage]
    }
  }

  @js.native
  trait DisableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DisableSnapshotCopyResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): DisableSnapshotCopyResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSnapshotCopyResult]
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
    def apply(EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
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
    def apply(ElasticIp: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): ElasticIpStatus = {
      val _fields = IndexedSeq[(String, js.Any)]("ElasticIp" -> ElasticIp.map { x =>
        x.asInstanceOf[js.Any]
      }, "Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticIpStatus]
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
    def apply(BucketName: String,
              ClusterIdentifier: String,
              S3KeyPrefix: js.UndefOr[String] = js.undefined): EnableLoggingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketName"        -> BucketName.asInstanceOf[js.Any],
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "S3KeyPrefix" -> S3KeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableLoggingMessage]
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
    def apply(ClusterIdentifier: String,
              DestinationRegion: String,
              ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              RetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              SnapshotCopyGrantName: js.UndefOr[String] = js.undefined): EnableSnapshotCopyMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "DestinationRegion" -> DestinationRegion.asInstanceOf[js.Any],
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RetentionPeriod" -> RetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSnapshotCopyMessage]
    }
  }

  @js.native
  trait EnableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object EnableSnapshotCopyResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): EnableSnapshotCopyResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSnapshotCopyResult]
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
    def apply(Address: js.UndefOr[String] = js.undefined, Port: js.UndefOr[Int] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)]("Address" -> Address.map { x =>
        x.asInstanceOf[js.Any]
      }, "Port" -> Port.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
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
    def apply(Date: js.UndefOr[TStamp] = js.undefined,
              EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              EventId: js.UndefOr[String] = js.undefined,
              Message: js.UndefOr[String] = js.undefined,
              Severity: js.UndefOr[String] = js.undefined,
              SourceIdentifier: js.UndefOr[String] = js.undefined,
              SourceType: js.UndefOr[SourceType] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventCategories" -> EventCategories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventId" -> EventId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Severity" -> Severity.map { x =>
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
    * Describes event categories.
    */
  @js.native
  trait EventCategoriesMap extends js.Object {
    var Events: js.UndefOr[EventInfoMapList]
    var SourceType: js.UndefOr[String]
  }

  object EventCategoriesMap {
    def apply(Events: js.UndefOr[EventInfoMapList] = js.undefined,
              SourceType: js.UndefOr[String] = js.undefined): EventCategoriesMap = {
      val _fields = IndexedSeq[(String, js.Any)]("Events" -> Events.map { x =>
        x.asInstanceOf[js.Any]
      }, "SourceType" -> SourceType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMap]
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
    def apply(EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined): EventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EventCategoriesMapList" -> EventCategoriesMapList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMessage]
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
    def apply(EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              EventDescription: js.UndefOr[String] = js.undefined,
              EventId: js.UndefOr[String] = js.undefined,
              Severity: js.UndefOr[String] = js.undefined): EventInfoMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventCategories" -> EventCategories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventDescription" -> EventDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventId" -> EventId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Severity" -> Severity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventInfoMap]
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
    def apply(CustSubscriptionId: js.UndefOr[String] = js.undefined,
              CustomerAwsId: js.UndefOr[String] = js.undefined,
              Enabled: js.UndefOr[Boolean] = js.undefined,
              EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
              Severity: js.UndefOr[String] = js.undefined,
              SnsTopicArn: js.UndefOr[String] = js.undefined,
              SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
              SourceType: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              SubscriptionCreationTime: js.UndefOr[TStamp] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): EventSubscription = {
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
        "Severity" -> Severity.map { x =>
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
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
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
    * <p/>
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
    def apply(ClusterIdentifier: String,
              DbUser: String,
              AutoCreate: js.UndefOr[BooleanOptional] = js.undefined,
              DbGroups: js.UndefOr[DbGroupList] = js.undefined,
              DbName: js.UndefOr[String] = js.undefined,
              DurationSeconds: js.UndefOr[IntegerOptional] = js.undefined): GetClusterCredentialsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "DbUser"            -> DbUser.asInstanceOf[js.Any],
        "AutoCreate" -> AutoCreate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbGroups" -> DbGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbName" -> DbName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DurationSeconds" -> DurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetClusterCredentialsMessage]
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
    def apply(ReservedNodeId: String,
              Marker: js.UndefOr[String] = js.undefined,
              MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): GetReservedNodeExchangeOfferingsInputMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeId" -> ReservedNodeId.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetReservedNodeExchangeOfferingsInputMessage]
    }
  }

  @js.native
  trait GetReservedNodeExchangeOfferingsOutputMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList]
  }

  object GetReservedNodeExchangeOfferingsOutputMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
    ): GetReservedNodeExchangeOfferingsOutputMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "ReservedNodeOfferings" -> ReservedNodeOfferings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetReservedNodeExchangeOfferingsOutputMessage]
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
    def apply(HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
              HsmClientCertificatePublicKey: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): HsmClientCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmClientCertificatePublicKey" -> HsmClientCertificatePublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmClientCertificate]
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
    def apply(HsmClientCertificates: js.UndefOr[HsmClientCertificateList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): HsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("HsmClientCertificates" -> HsmClientCertificates.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmClientCertificateMessage]
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
    def apply(Description: js.UndefOr[String] = js.undefined,
              HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
              HsmIpAddress: js.UndefOr[String] = js.undefined,
              HsmPartitionName: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): HsmConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmIpAddress" -> HsmIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmPartitionName" -> HsmPartitionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmConfiguration]
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
    def apply(HsmConfigurations: js.UndefOr[HsmConfigurationList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): HsmConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("HsmConfigurations" -> HsmConfigurations.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmConfigurationMessage]
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
    def apply(HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
              HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): HsmStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmStatus]
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
    def apply(CIDRIP: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): IPRange = {
      val _fields = IndexedSeq[(String, js.Any)]("CIDRIP" -> CIDRIP.map { x =>
        x.asInstanceOf[js.Any]
      }, "Status" -> Status.map { x =>
        x.asInstanceOf[js.Any]
      }, "Tags" -> Tags.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPRange]
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
    def apply(BucketName: js.UndefOr[String] = js.undefined,
              LastFailureMessage: js.UndefOr[String] = js.undefined,
              LastFailureTime: js.UndefOr[TStamp] = js.undefined,
              LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.undefined,
              LoggingEnabled: js.UndefOr[Boolean] = js.undefined,
              S3KeyPrefix: js.UndefOr[String] = js.undefined): LoggingStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketName" -> BucketName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastFailureMessage" -> LastFailureMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastFailureTime" -> LastFailureTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastSuccessfulDeliveryTime" -> LastSuccessfulDeliveryTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LoggingEnabled" -> LoggingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3KeyPrefix" -> S3KeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingStatus]
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
    def apply(DatabaseVersion: js.UndefOr[String] = js.undefined,
              MaintenanceTrackName: js.UndefOr[String] = js.undefined,
              UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.undefined): MaintenanceTrack = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseVersion" -> DatabaseVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateTargets" -> UpdateTargets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaintenanceTrack]
    }
  }

  @js.native
  trait ModifyClusterDbRevisionMessage extends js.Object {
    var ClusterIdentifier: String
    var RevisionTarget: String
  }

  object ModifyClusterDbRevisionMessage {
    def apply(ClusterIdentifier: String, RevisionTarget: String): ModifyClusterDbRevisionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "RevisionTarget"    -> RevisionTarget.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterDbRevisionMessage]
    }
  }

  @js.native
  trait ModifyClusterDbRevisionResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterDbRevisionResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): ModifyClusterDbRevisionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterDbRevisionResult]
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
    def apply(ClusterIdentifier: String,
              AddIamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
              RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.undefined): ModifyClusterIamRolesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "AddIamRoles" -> AddIamRoles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoveIamRoles" -> RemoveIamRoles.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterIamRolesMessage]
    }
  }

  @js.native
  trait ModifyClusterIamRolesResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterIamRolesResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): ModifyClusterIamRolesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterIamRolesResult]
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
    def apply(ClusterIdentifier: String,
              DeferMaintenance: js.UndefOr[BooleanOptional] = js.undefined,
              DeferMaintenanceDuration: js.UndefOr[IntegerOptional] = js.undefined,
              DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined,
              DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined,
              DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined): ModifyClusterMaintenanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "DeferMaintenance" -> DeferMaintenance.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeferMaintenanceDuration" -> DeferMaintenanceDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeferMaintenanceEndTime" -> DeferMaintenanceEndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeferMaintenanceIdentifier" -> DeferMaintenanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeferMaintenanceStartTime" -> DeferMaintenanceStartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterMaintenanceMessage]
    }
  }

  @js.native
  trait ModifyClusterMaintenanceResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterMaintenanceResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): ModifyClusterMaintenanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterMaintenanceResult]
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
    def apply(ClusterIdentifier: String,
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
              VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined): ModifyClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "AllowVersionUpgrade" -> AllowVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterParameterGroupName" -> ClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterType" -> ClusterType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElasticIp" -> ElasticIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encrypted" -> Encrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUserPassword" -> MasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewClusterIdentifier" -> NewClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfNodes" -> NumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterMessage]
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
    def apply(ParameterGroupName: String, Parameters: ParametersList): ModifyClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any],
        "Parameters"         -> Parameters.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ModifyClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifyClusterResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): ModifyClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterResult]
    }
  }

  @js.native
  trait ModifyClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: String
    var Force: js.UndefOr[Boolean]
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional]
  }

  object ModifyClusterSnapshotMessage {
    def apply(
        SnapshotIdentifier: String,
        Force: js.UndefOr[Boolean] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    ): ModifyClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any],
        "Force" -> Force.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSnapshotMessage]
    }
  }

  @js.native
  trait ModifyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object ModifyClusterSnapshotResult {
    def apply(Snapshot: js.UndefOr[Snapshot] = js.undefined): ModifyClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Snapshot" -> Snapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSnapshotResult]
    }
  }

  @js.native
  trait ModifyClusterSnapshotScheduleMessage extends js.Object {
    var ClusterIdentifier: String
    var DisassociateSchedule: js.UndefOr[BooleanOptional]
    var ScheduleIdentifier: js.UndefOr[String]
  }

  object ModifyClusterSnapshotScheduleMessage {
    def apply(ClusterIdentifier: String,
              DisassociateSchedule: js.UndefOr[BooleanOptional] = js.undefined,
              ScheduleIdentifier: js.UndefOr[String] = js.undefined): ModifyClusterSnapshotScheduleMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "DisassociateSchedule" -> DisassociateSchedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSnapshotScheduleMessage]
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
    def apply(ClusterSubnetGroupName: String,
              SubnetIds: SubnetIdentifierList,
              Description: js.UndefOr[String] = js.undefined): ModifyClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"              -> SubnetIds.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup]
  }

  object ModifyClusterSubnetGroupResult {
    def apply(ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined): ModifyClusterSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterSubnetGroup" -> ClusterSubnetGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSubnetGroupResult]
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
    def apply(SubscriptionName: String,
              Enabled: js.UndefOr[BooleanOptional] = js.undefined,
              EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
              Severity: js.UndefOr[String] = js.undefined,
              SnsTopicArn: js.UndefOr[String] = js.undefined,
              SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
              SourceType: js.UndefOr[String] = js.undefined): ModifyEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any],
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventCategories" -> EventCategories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Severity" -> Severity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicArn" -> SnsTopicArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceIds" -> SourceIds.map { x =>
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
    def apply(ClusterIdentifier: String,
              RetentionPeriod: Int,
              Manual: js.UndefOr[Boolean] = js.undefined): ModifySnapshotCopyRetentionPeriodMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "RetentionPeriod"   -> RetentionPeriod.asInstanceOf[js.Any],
        "Manual" -> Manual.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotCopyRetentionPeriodMessage]
    }
  }

  @js.native
  trait ModifySnapshotCopyRetentionPeriodResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ModifySnapshotCopyRetentionPeriodResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): ModifySnapshotCopyRetentionPeriodResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotCopyRetentionPeriodResult]
    }
  }

  @js.native
  trait ModifySnapshotScheduleMessage extends js.Object {
    var ScheduleDefinitions: ScheduleDefinitionList
    var ScheduleIdentifier: String
  }

  object ModifySnapshotScheduleMessage {
    def apply(ScheduleDefinitions: ScheduleDefinitionList,
              ScheduleIdentifier: String): ModifySnapshotScheduleMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleDefinitions" -> ScheduleDefinitions.asInstanceOf[js.Any],
        "ScheduleIdentifier"  -> ScheduleIdentifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotScheduleMessage]
    }
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
    def apply(AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
              ClusterType: js.UndefOr[String] = js.undefined,
              ClusterVersion: js.UndefOr[String] = js.undefined,
              NodeType: js.UndefOr[String] = js.undefined): OrderableClusterOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterType" -> ClusterType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableClusterOption]
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
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList] = js.undefined
    ): OrderableClusterOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "OrderableClusterOptions" -> OrderableClusterOptions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableClusterOptionsMessage]
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
    def apply(AllowedValues: js.UndefOr[String] = js.undefined,
              ApplyType: js.UndefOr[ParameterApplyType] = js.undefined,
              DataType: js.UndefOr[String] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              IsModifiable: js.UndefOr[Boolean] = js.undefined,
              MinimumEngineVersion: js.UndefOr[String] = js.undefined,
              ParameterName: js.UndefOr[String] = js.undefined,
              ParameterValue: js.UndefOr[String] = js.undefined,
              Source: js.UndefOr[String] = js.undefined): Parameter = {
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
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  object ParameterApplyTypeEnum {
    val static  = "static"
    val dynamic = "dynamic"

    val values = IndexedSeq(static, dynamic)
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
    def apply(AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
              ClusterIdentifier: js.UndefOr[String] = js.undefined,
              ClusterType: js.UndefOr[String] = js.undefined,
              ClusterVersion: js.UndefOr[String] = js.undefined,
              EncryptionType: js.UndefOr[String] = js.undefined,
              EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
              MaintenanceTrackName: js.UndefOr[String] = js.undefined,
              MasterUserPassword: js.UndefOr[String] = js.undefined,
              NodeType: js.UndefOr[String] = js.undefined,
              NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
              PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterType" -> ClusterType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncryptionType" -> EncryptionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUserPassword" -> MasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfNodes" -> NumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
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
    def apply(ReservedNodeOfferingId: String,
              NodeCount: js.UndefOr[IntegerOptional] = js.undefined): PurchaseReservedNodeOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.asInstanceOf[js.Any],
        "NodeCount" -> NodeCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedNodeOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedNodeOfferingResult extends js.Object {
    var ReservedNode: js.UndefOr[ReservedNode]
  }

  object PurchaseReservedNodeOfferingResult {
    def apply(ReservedNode: js.UndefOr[ReservedNode] = js.undefined): PurchaseReservedNodeOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ReservedNode" -> ReservedNode.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedNodeOfferingResult]
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
    def apply(ClusterIdentifier: String): RebootClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootClusterMessage]
    }
  }

  @js.native
  trait RebootClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RebootClusterResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): RebootClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootClusterResult]
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
    def apply(CurrencyCode: js.UndefOr[String] = js.undefined,
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
              UsagePrice: js.UndefOr[Double] = js.undefined): ReservedNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeCount" -> NodeCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecurringCharges" -> RecurringCharges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedNodeId" -> ReservedNodeId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedNodeOfferingType" -> ReservedNodeOfferingType.map { x =>
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

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNode]
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
    def apply(CurrencyCode: js.UndefOr[String] = js.undefined,
              Duration: js.UndefOr[Int] = js.undefined,
              FixedPrice: js.UndefOr[Double] = js.undefined,
              NodeType: js.UndefOr[String] = js.undefined,
              OfferingType: js.UndefOr[String] = js.undefined,
              RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
              ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
              ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType] = js.undefined,
              UsagePrice: js.UndefOr[Double] = js.undefined): ReservedNodeOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecurringCharges" -> RecurringCharges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservedNodeOfferingType" -> ReservedNodeOfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsagePrice" -> UsagePrice.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodeOffering]
    }
  }

  object ReservedNodeOfferingTypeEnum {
    val Regular    = "Regular"
    val Upgradable = "Upgradable"

    val values = IndexedSeq(Regular, Upgradable)
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
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
    ): ReservedNodeOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "ReservedNodeOfferings" -> ReservedNodeOfferings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodeOfferingsMessage]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              ReservedNodes: js.UndefOr[ReservedNodeList] = js.undefined): ReservedNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "ReservedNodes" -> ReservedNodes.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodesMessage]
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
    def apply(ParameterGroupName: String,
              Parameters: js.UndefOr[ParametersList] = js.undefined,
              ResetAllParameters: js.UndefOr[Boolean] = js.undefined): ResetClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any],
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResetAllParameters" -> ResetAllParameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ResizeClusterMessage extends js.Object {
    var ClusterIdentifier: String
    var NumberOfNodes: Int
    var Classic: js.UndefOr[BooleanOptional]
    var ClusterType: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
  }

  object ResizeClusterMessage {
    def apply(ClusterIdentifier: String,
              NumberOfNodes: Int,
              Classic: js.UndefOr[BooleanOptional] = js.undefined,
              ClusterType: js.UndefOr[String] = js.undefined,
              NodeType: js.UndefOr[String] = js.undefined): ResizeClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "NumberOfNodes"     -> NumberOfNodes.asInstanceOf[js.Any],
        "Classic" -> Classic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterType" -> ClusterType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeClusterMessage]
    }
  }

  @js.native
  trait ResizeClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object ResizeClusterResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): ResizeClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeClusterResult]
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
    def apply(AllowCancelResize: js.UndefOr[Boolean] = js.undefined,
              ResizeType: js.UndefOr[String] = js.undefined): ResizeInfo = {
      val _fields = IndexedSeq[(String, js.Any)]("AllowCancelResize" -> AllowCancelResize.map { x =>
        x.asInstanceOf[js.Any]
      }, "ResizeType" -> ResizeType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeInfo]
    }
  }

  /**
    * Describes the result of a cluster resize operation.
    */
  @js.native
  trait ResizeProgressMessage extends js.Object {
    var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional]
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
    def apply(AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
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
              TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined): ResizeProgressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvgResizeRateInMegaBytesPerSecond" -> AvgResizeRateInMegaBytesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EstimatedTimeToCompletionInSeconds" -> EstimatedTimeToCompletionInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImportTablesCompleted" -> ImportTablesCompleted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImportTablesInProgress" -> ImportTablesInProgress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImportTablesNotStarted" -> ImportTablesNotStarted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgressInMegaBytes" -> ProgressInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResizeType" -> ResizeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetClusterType" -> TargetClusterType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetEncryptionType" -> TargetEncryptionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetNodeType" -> TargetNodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetNumberOfNodes" -> TargetNumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalResizeDataInMegaBytes" -> TotalResizeDataInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeProgressMessage]
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
    var OwnerAccount: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var SnapshotClusterIdentifier: js.UndefOr[String]
    var SnapshotScheduleIdentifier: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object RestoreFromClusterSnapshotMessage {
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
        OwnerAccount: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
        SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): RestoreFromClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier"  -> ClusterIdentifier.asInstanceOf[js.Any],
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any],
        "AdditionalInfo" -> AdditionalInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowVersionUpgrade" -> AllowVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterParameterGroupName" -> ClusterParameterGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterSecurityGroups" -> ClusterSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElasticIp" -> ElasticIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamRoles" -> IamRoles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OwnerAccount" -> OwnerAccount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotScheduleIdentifier" -> SnapshotScheduleIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreFromClusterSnapshotMessage]
    }
  }

  @js.native
  trait RestoreFromClusterSnapshotResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RestoreFromClusterSnapshotResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): RestoreFromClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreFromClusterSnapshotResult]
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
    def apply(CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
              ElapsedTimeInSeconds: js.UndefOr[Double] = js.undefined,
              EstimatedTimeToCompletionInSeconds: js.UndefOr[Double] = js.undefined,
              ProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
              SnapshotSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): RestoreStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentRestoreRateInMegaBytesPerSecond" -> CurrentRestoreRateInMegaBytesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EstimatedTimeToCompletionInSeconds" -> EstimatedTimeToCompletionInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgressInMegaBytes" -> ProgressInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotSizeInMegaBytes" -> SnapshotSizeInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreStatus]
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
    def apply(ClusterIdentifier: String,
              NewTableName: String,
              SnapshotIdentifier: String,
              SourceDatabaseName: String,
              SourceTableName: String,
              SourceSchemaName: js.UndefOr[String] = js.undefined,
              TargetDatabaseName: js.UndefOr[String] = js.undefined,
              TargetSchemaName: js.UndefOr[String] = js.undefined): RestoreTableFromClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier"  -> ClusterIdentifier.asInstanceOf[js.Any],
        "NewTableName"       -> NewTableName.asInstanceOf[js.Any],
        "SnapshotIdentifier" -> SnapshotIdentifier.asInstanceOf[js.Any],
        "SourceDatabaseName" -> SourceDatabaseName.asInstanceOf[js.Any],
        "SourceTableName"    -> SourceTableName.asInstanceOf[js.Any],
        "SourceSchemaName" -> SourceSchemaName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetDatabaseName" -> TargetDatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetSchemaName" -> TargetSchemaName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableFromClusterSnapshotMessage]
    }
  }

  @js.native
  trait RestoreTableFromClusterSnapshotResult extends js.Object {
    var TableRestoreStatus: js.UndefOr[TableRestoreStatus]
  }

  object RestoreTableFromClusterSnapshotResult {
    def apply(
        TableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined
    ): RestoreTableFromClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)]("TableRestoreStatus" -> TableRestoreStatus.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableFromClusterSnapshotResult]
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
    def apply(DatabaseRevision: js.UndefOr[String] = js.undefined,
              DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined,
              Description: js.UndefOr[String] = js.undefined): RevisionTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseRevision" -> DatabaseRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseRevisionReleaseDate" -> DatabaseRevisionReleaseDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevisionTarget]
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
    def apply(ClusterSecurityGroupName: String,
              CIDRIP: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
              EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): RevokeClusterSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterSecurityGroupName" -> ClusterSecurityGroupName.asInstanceOf[js.Any],
        "CIDRIP" -> CIDRIP.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeClusterSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup]
  }

  object RevokeClusterSecurityGroupIngressResult {
    def apply(
        ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): RevokeClusterSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterSecurityGroup" -> ClusterSecurityGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeClusterSecurityGroupIngressResult]
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
    def apply(AccountWithRestoreAccess: String,
              SnapshotIdentifier: String,
              SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined): RevokeSnapshotAccessMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountWithRestoreAccess" -> AccountWithRestoreAccess.asInstanceOf[js.Any],
        "SnapshotIdentifier"       -> SnapshotIdentifier.asInstanceOf[js.Any],
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSnapshotAccessMessage]
    }
  }

  @js.native
  trait RevokeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object RevokeSnapshotAccessResult {
    def apply(Snapshot: js.UndefOr[Snapshot] = js.undefined): RevokeSnapshotAccessResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Snapshot" -> Snapshot.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSnapshotAccessResult]
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
    def apply(ClusterIdentifier: String): RotateEncryptionKeyMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateEncryptionKeyMessage]
    }
  }

  @js.native
  trait RotateEncryptionKeyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RotateEncryptionKeyResult {
    def apply(Cluster: js.UndefOr[Cluster] = js.undefined): RotateEncryptionKeyResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Cluster" -> Cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateEncryptionKeyResult]
    }
  }

  object ScheduleStateEnum {
    val MODIFYING = "MODIFYING"
    val ACTIVE    = "ACTIVE"
    val FAILED    = "FAILED"

    val values = IndexedSeq(MODIFYING, ACTIVE, FAILED)
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
    def apply(AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList] = js.undefined,
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
              VpcId: js.UndefOr[String] = js.undefined): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountsWithRestoreAccess" -> AccountsWithRestoreAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ActualIncrementalBackupSizeInMegaBytes" -> ActualIncrementalBackupSizeInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupProgressInMegaBytes" -> BackupProgressInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterCreateTime" -> ClusterCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterVersion" -> ClusterVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentBackupRateInMegaBytesPerSecond" -> CurrentBackupRateInMegaBytesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DBName" -> DBName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encrypted" -> Encrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncryptedWithHSM" -> EncryptedWithHSM.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedVpcRouting" -> EnhancedVpcRouting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EstimatedSecondsToCompletion" -> EstimatedSecondsToCompletion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRemainingDays" -> ManualSnapshotRemainingDays.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManualSnapshotRetentionPeriod" -> ManualSnapshotRetentionPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterUsername" -> MasterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfNodes" -> NumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OwnerAccount" -> OwnerAccount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestorableNodeTypes" -> RestorableNodeTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotRetentionStartTime" -> SnapshotRetentionStartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotType" -> SnapshotType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceRegion" -> SourceRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalBackupSizeInMegaBytes" -> TotalBackupSizeInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Snapshot]
    }
  }

  object SnapshotAttributeToSortByEnum {
    val SOURCE_TYPE = "SOURCE_TYPE"
    val TOTAL_SIZE  = "TOTAL_SIZE"
    val CREATE_TIME = "CREATE_TIME"

    val values = IndexedSeq(SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME)
  }

  /**
    * The snapshot copy grant that grants Amazon Redshift permission to encrypt copied snapshots with the specified customer master key (CMK) from AWS KMS in the destination region.
    *  For more information about managing snapshot copy grants, go to [[http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html|Amazon Redshift Database Encryption]] in the <i>Amazon Redshift Cluster Management Guide</i>.
    */
  @js.native
  trait SnapshotCopyGrant extends js.Object {
    var KmsKeyId: js.UndefOr[String]
    var SnapshotCopyGrantName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object SnapshotCopyGrant {
    def apply(KmsKeyId: js.UndefOr[String] = js.undefined,
              SnapshotCopyGrantName: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): SnapshotCopyGrant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotCopyGrantName" -> SnapshotCopyGrantName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotCopyGrant]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList] = js.undefined): SnapshotCopyGrantMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "SnapshotCopyGrants" -> SnapshotCopyGrants.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotCopyGrantMessage]
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
    def apply(FailureCode: js.UndefOr[String] = js.undefined,
              FailureReason: js.UndefOr[String] = js.undefined,
              SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
              SnapshotIdentifier: js.UndefOr[String] = js.undefined): SnapshotErrorMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailureCode" -> FailureCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailureReason" -> FailureReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotErrorMessage]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              Snapshots: js.UndefOr[SnapshotList] = js.undefined): SnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "Snapshots" -> Snapshots.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotMessage]
    }
  }

  /**
    * Describes a snapshot schedule. You can set a regular interval for creating snapshots of a cluster. You can also schedule snapshots for specific dates.
    */
  @js.native
  trait SnapshotSchedule extends js.Object {
    var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList]
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList]
    var ScheduleDescription: js.UndefOr[String]
    var ScheduleIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object SnapshotSchedule {
    def apply(NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.undefined,
              ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined,
              ScheduleDescription: js.UndefOr[String] = js.undefined,
              ScheduleIdentifier: js.UndefOr[String] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): SnapshotSchedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextInvocations" -> NextInvocations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleDefinitions" -> ScheduleDefinitions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleDescription" -> ScheduleDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleIdentifier" -> ScheduleIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotSchedule]
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
    def apply(Attribute: SnapshotAttributeToSortBy,
              SortOrder: js.UndefOr[SortByOrder] = js.undefined): SnapshotSortingEntity = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Attribute" -> Attribute.asInstanceOf[js.Any], "SortOrder" -> SortOrder.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotSortingEntity]
    }
  }

  object SortByOrderEnum {
    val ASC  = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
  }

  object SourceTypeEnum {
    val cluster                   = "cluster"
    val `cluster-parameter-group` = "cluster-parameter-group"
    val `cluster-security-group`  = "cluster-security-group"
    val `cluster-snapshot`        = "cluster-snapshot"

    val values = IndexedSeq(cluster, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`)
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
    * Describes the operations that are allowed on a maintenance track.
    */
  @js.native
  trait SupportedOperation extends js.Object {
    var OperationName: js.UndefOr[String]
  }

  object SupportedOperation {
    def apply(OperationName: js.UndefOr[String] = js.undefined): SupportedOperation = {
      val _fields = IndexedSeq[(String, js.Any)]("OperationName" -> OperationName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SupportedOperation]
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
    def apply(Name: js.UndefOr[String] = js.undefined): SupportedPlatform = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SupportedPlatform]
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
    def apply(ClusterIdentifier: js.UndefOr[String] = js.undefined,
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
              TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined): TableRestoreStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterIdentifier" -> ClusterIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewTableName" -> NewTableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgressInMegaBytes" -> ProgressInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestTime" -> RequestTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotIdentifier" -> SnapshotIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceDatabaseName" -> SourceDatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceSchemaName" -> SourceSchemaName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceTableName" -> SourceTableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableRestoreRequestId" -> TableRestoreRequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetDatabaseName" -> TargetDatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetSchemaName" -> TargetSchemaName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalDataInMegaBytes" -> TotalDataInMegaBytes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableRestoreStatus]
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
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.undefined
    ): TableRestoreStatusMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "TableRestoreStatusDetails" -> TableRestoreStatusDetails.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableRestoreStatusMessage]
    }
  }

  object TableRestoreStatusTypeEnum {
    val PENDING     = "PENDING"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"
    val CANCELED    = "CANCELED"

    val values = IndexedSeq(PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
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
    * A tag and its associated resource.
    */
  @js.native
  trait TaggedResource extends js.Object {
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
    var Tag: js.UndefOr[Tag]
  }

  object TaggedResource {
    def apply(ResourceName: js.UndefOr[String] = js.undefined,
              ResourceType: js.UndefOr[String] = js.undefined,
              Tag: js.UndefOr[Tag] = js.undefined): TaggedResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tag" -> Tag.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaggedResource]
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
    def apply(Marker: js.UndefOr[String] = js.undefined,
              TaggedResources: js.UndefOr[TaggedResourceList] = js.undefined): TaggedResourceListMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }, "TaggedResources" -> TaggedResources.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaggedResourceListMessage]
    }
  }

  @js.native
  trait TrackListMessage extends js.Object {
    var MaintenanceTracks: js.UndefOr[TrackList]
    var Marker: js.UndefOr[String]
  }

  object TrackListMessage {
    def apply(MaintenanceTracks: js.UndefOr[TrackList] = js.undefined,
              Marker: js.UndefOr[String] = js.undefined): TrackListMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("MaintenanceTracks" -> MaintenanceTracks.map { x =>
        x.asInstanceOf[js.Any]
      }, "Marker" -> Marker.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrackListMessage]
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
    def apply(DatabaseVersion: js.UndefOr[String] = js.undefined,
              MaintenanceTrackName: js.UndefOr[String] = js.undefined,
              SupportedOperations: js.UndefOr[SupportedOperationList] = js.undefined): UpdateTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseVersion" -> DatabaseVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceTrackName" -> MaintenanceTrackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedOperations" -> SupportedOperations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTarget]
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
