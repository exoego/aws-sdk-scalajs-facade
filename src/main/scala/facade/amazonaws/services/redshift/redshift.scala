package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object redshift {
  type AccountsWithRestoreAccessList = js.Array[AccountWithRestoreAccess]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type BooleanOptional = Boolean
  type ClusterList = js.Array[Cluster]
  type ClusterNodesList = js.Array[ClusterNode]
  type ClusterParameterGroupStatusList = js.Array[ClusterParameterGroupStatus]
  type ClusterSecurityGroupMembershipList = js.Array[ClusterSecurityGroupMembership]
  type ClusterSecurityGroupNameList = js.Array[String]
  type ClusterSecurityGroups = js.Array[ClusterSecurityGroup]
  type ClusterSubnetGroups = js.Array[ClusterSubnetGroup]
  type ClusterVersionList = js.Array[ClusterVersion]
  type DoubleOptional = Double
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventInfoMapList = js.Array[EventInfoMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type HsmClientCertificateList = js.Array[HsmClientCertificate]
  type HsmConfigurationList = js.Array[HsmConfiguration]
  type IPRangeList = js.Array[IPRange]
  type ImportTablesCompleted = js.Array[String]
  type ImportTablesInProgress = js.Array[String]
  type ImportTablesNotStarted = js.Array[String]
  type IntegerOptional = Integer
  type LongOptional = Long
  type OrderableClusterOptionsList = js.Array[OrderableClusterOption]
  type ParameterGroupList = js.Array[ClusterParameterGroup]
  type ParametersList = js.Array[Parameter]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservedNodeList = js.Array[ReservedNode]
  type ReservedNodeOfferingList = js.Array[ReservedNodeOffering]
  type SnapshotList = js.Array[Snapshot]
  type SourceIdsList = js.Array[String]
  type SourceType = String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = js.Date
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
  type TagValueList = js.Array[String]
  type TaggedResourceList = js.Array[TaggedResource]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
}

package redshift {
  @js.native
  trait Redshift extends js.Object {
    def authorizeClusterSecurityGroupIngress(params: AuthorizeClusterSecurityGroupIngressMessage, callback: Callback[AuthorizeClusterSecurityGroupIngressResult]): Unit = js.native
    def authorizeClusterSecurityGroupIngress(params: AuthorizeClusterSecurityGroupIngressMessage): Request[AuthorizeClusterSecurityGroupIngressResult] = js.native
    def authorizeSnapshotAccess(params: AuthorizeSnapshotAccessMessage, callback: Callback[AuthorizeSnapshotAccessResult]): Unit = js.native
    def authorizeSnapshotAccess(params: AuthorizeSnapshotAccessMessage): Request[AuthorizeSnapshotAccessResult] = js.native
    def copyClusterSnapshot(params: CopyClusterSnapshotMessage, callback: Callback[CopyClusterSnapshotResult]): Unit = js.native
    def copyClusterSnapshot(params: CopyClusterSnapshotMessage): Request[CopyClusterSnapshotResult] = js.native
    def createCluster(params: CreateClusterMessage, callback: Callback[CreateClusterResult]): Unit = js.native
    def createCluster(params: CreateClusterMessage): Request[CreateClusterResult] = js.native
    def createClusterParameterGroup(params: CreateClusterParameterGroupMessage, callback: Callback[CreateClusterParameterGroupResult]): Unit = js.native
    def createClusterParameterGroup(params: CreateClusterParameterGroupMessage): Request[CreateClusterParameterGroupResult] = js.native
    def createClusterSecurityGroup(params: CreateClusterSecurityGroupMessage, callback: Callback[CreateClusterSecurityGroupResult]): Unit = js.native
    def createClusterSecurityGroup(params: CreateClusterSecurityGroupMessage): Request[CreateClusterSecurityGroupResult] = js.native
    def createClusterSnapshot(params: CreateClusterSnapshotMessage, callback: Callback[CreateClusterSnapshotResult]): Unit = js.native
    def createClusterSnapshot(params: CreateClusterSnapshotMessage): Request[CreateClusterSnapshotResult] = js.native
    def createClusterSubnetGroup(params: CreateClusterSubnetGroupMessage, callback: Callback[CreateClusterSubnetGroupResult]): Unit = js.native
    def createClusterSubnetGroup(params: CreateClusterSubnetGroupMessage): Request[CreateClusterSubnetGroupResult] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage, callback: Callback[CreateEventSubscriptionResult]): Unit = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] = js.native
    def createHsmClientCertificate(params: CreateHsmClientCertificateMessage, callback: Callback[CreateHsmClientCertificateResult]): Unit = js.native
    def createHsmClientCertificate(params: CreateHsmClientCertificateMessage): Request[CreateHsmClientCertificateResult] = js.native
    def createHsmConfiguration(params: CreateHsmConfigurationMessage, callback: Callback[CreateHsmConfigurationResult]): Unit = js.native
    def createHsmConfiguration(params: CreateHsmConfigurationMessage): Request[CreateHsmConfigurationResult] = js.native
    def createTags(params: CreateTagsMessage, callback: Callback[js.Object]): Unit = js.native
    def createTags(params: CreateTagsMessage): Request[js.Object] = js.native
    def deleteCluster(params: DeleteClusterMessage, callback: Callback[DeleteClusterResult]): Unit = js.native
    def deleteCluster(params: DeleteClusterMessage): Request[DeleteClusterResult] = js.native
    def deleteClusterParameterGroup(params: DeleteClusterParameterGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteClusterParameterGroup(params: DeleteClusterParameterGroupMessage): Request[js.Object] = js.native
    def deleteClusterSecurityGroup(params: DeleteClusterSecurityGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteClusterSecurityGroup(params: DeleteClusterSecurityGroupMessage): Request[js.Object] = js.native
    def deleteClusterSnapshot(params: DeleteClusterSnapshotMessage, callback: Callback[DeleteClusterSnapshotResult]): Unit = js.native
    def deleteClusterSnapshot(params: DeleteClusterSnapshotMessage): Request[DeleteClusterSnapshotResult] = js.native
    def deleteClusterSubnetGroup(params: DeleteClusterSubnetGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteClusterSubnetGroup(params: DeleteClusterSubnetGroupMessage): Request[js.Object] = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[js.Object] = js.native
    def deleteHsmClientCertificate(params: DeleteHsmClientCertificateMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteHsmClientCertificate(params: DeleteHsmClientCertificateMessage): Request[js.Object] = js.native
    def deleteHsmConfiguration(params: DeleteHsmConfigurationMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteHsmConfiguration(params: DeleteHsmConfigurationMessage): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteTags(params: DeleteTagsMessage): Request[js.Object] = js.native
    def describeClusterParameterGroups(params: DescribeClusterParameterGroupsMessage, callback: Callback[ClusterParameterGroupsMessage]): Unit = js.native
    def describeClusterParameterGroups(params: DescribeClusterParameterGroupsMessage): Request[ClusterParameterGroupsMessage] = js.native
    def describeClusterParameters(params: DescribeClusterParametersMessage, callback: Callback[ClusterParameterGroupDetails]): Unit = js.native
    def describeClusterParameters(params: DescribeClusterParametersMessage): Request[ClusterParameterGroupDetails] = js.native
    def describeClusterSecurityGroups(params: DescribeClusterSecurityGroupsMessage, callback: Callback[ClusterSecurityGroupMessage]): Unit = js.native
    def describeClusterSecurityGroups(params: DescribeClusterSecurityGroupsMessage): Request[ClusterSecurityGroupMessage] = js.native
    def describeClusterSnapshots(params: DescribeClusterSnapshotsMessage, callback: Callback[SnapshotMessage]): Unit = js.native
    def describeClusterSnapshots(params: DescribeClusterSnapshotsMessage): Request[SnapshotMessage] = js.native
    def describeClusterSubnetGroups(params: DescribeClusterSubnetGroupsMessage, callback: Callback[ClusterSubnetGroupMessage]): Unit = js.native
    def describeClusterSubnetGroups(params: DescribeClusterSubnetGroupsMessage): Request[ClusterSubnetGroupMessage] = js.native
    def describeClusterVersions(params: DescribeClusterVersionsMessage, callback: Callback[ClusterVersionsMessage]): Unit = js.native
    def describeClusterVersions(params: DescribeClusterVersionsMessage): Request[ClusterVersionsMessage] = js.native
    def describeClusters(params: DescribeClustersMessage, callback: Callback[ClustersMessage]): Unit = js.native
    def describeClusters(params: DescribeClustersMessage): Request[ClustersMessage] = js.native
    def describeDefaultClusterParameters(params: DescribeDefaultClusterParametersMessage, callback: Callback[DescribeDefaultClusterParametersResult]): Unit = js.native
    def describeDefaultClusterParameters(params: DescribeDefaultClusterParametersMessage): Request[DescribeDefaultClusterParametersResult] = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage, callback: Callback[EventCategoriesMessage]): Unit = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage, callback: Callback[EventSubscriptionsMessage]): Unit = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage] = js.native
    def describeEvents(params: DescribeEventsMessage, callback: Callback[EventsMessage]): Unit = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeHsmClientCertificates(params: DescribeHsmClientCertificatesMessage, callback: Callback[HsmClientCertificateMessage]): Unit = js.native
    def describeHsmClientCertificates(params: DescribeHsmClientCertificatesMessage): Request[HsmClientCertificateMessage] = js.native
    def describeHsmConfigurations(params: DescribeHsmConfigurationsMessage, callback: Callback[HsmConfigurationMessage]): Unit = js.native
    def describeHsmConfigurations(params: DescribeHsmConfigurationsMessage): Request[HsmConfigurationMessage] = js.native
    def describeLoggingStatus(params: DescribeLoggingStatusMessage, callback: Callback[LoggingStatus]): Unit = js.native
    def describeLoggingStatus(params: DescribeLoggingStatusMessage): Request[LoggingStatus] = js.native
    def describeOrderableClusterOptions(params: DescribeOrderableClusterOptionsMessage, callback: Callback[OrderableClusterOptionsMessage]): Unit = js.native
    def describeOrderableClusterOptions(params: DescribeOrderableClusterOptionsMessage): Request[OrderableClusterOptionsMessage] = js.native
    def describeReservedNodeOfferings(params: DescribeReservedNodeOfferingsMessage, callback: Callback[ReservedNodeOfferingsMessage]): Unit = js.native
    def describeReservedNodeOfferings(params: DescribeReservedNodeOfferingsMessage): Request[ReservedNodeOfferingsMessage] = js.native
    def describeReservedNodes(params: DescribeReservedNodesMessage, callback: Callback[ReservedNodesMessage]): Unit = js.native
    def describeReservedNodes(params: DescribeReservedNodesMessage): Request[ReservedNodesMessage] = js.native
    def describeResize(params: DescribeResizeMessage, callback: Callback[ResizeProgressMessage]): Unit = js.native
    def describeResize(params: DescribeResizeMessage): Request[ResizeProgressMessage] = js.native
    def describeTags(params: DescribeTagsMessage, callback: Callback[TaggedResourceListMessage]): Unit = js.native
    def describeTags(params: DescribeTagsMessage): Request[TaggedResourceListMessage] = js.native
    def disableLogging(params: DisableLoggingMessage, callback: Callback[LoggingStatus]): Unit = js.native
    def disableLogging(params: DisableLoggingMessage): Request[LoggingStatus] = js.native
    def disableSnapshotCopy(params: DisableSnapshotCopyMessage, callback: Callback[DisableSnapshotCopyResult]): Unit = js.native
    def disableSnapshotCopy(params: DisableSnapshotCopyMessage): Request[DisableSnapshotCopyResult] = js.native
    def enableLogging(params: EnableLoggingMessage, callback: Callback[LoggingStatus]): Unit = js.native
    def enableLogging(params: EnableLoggingMessage): Request[LoggingStatus] = js.native
    def enableSnapshotCopy(params: EnableSnapshotCopyMessage, callback: Callback[EnableSnapshotCopyResult]): Unit = js.native
    def enableSnapshotCopy(params: EnableSnapshotCopyMessage): Request[EnableSnapshotCopyResult] = js.native
    def modifyCluster(params: ModifyClusterMessage, callback: Callback[ModifyClusterResult]): Unit = js.native
    def modifyCluster(params: ModifyClusterMessage): Request[ModifyClusterResult] = js.native
    def modifyClusterParameterGroup(params: ModifyClusterParameterGroupMessage, callback: Callback[ClusterParameterGroupNameMessage]): Unit = js.native
    def modifyClusterParameterGroup(params: ModifyClusterParameterGroupMessage): Request[ClusterParameterGroupNameMessage] = js.native
    def modifyClusterSubnetGroup(params: ModifyClusterSubnetGroupMessage, callback: Callback[ModifyClusterSubnetGroupResult]): Unit = js.native
    def modifyClusterSubnetGroup(params: ModifyClusterSubnetGroupMessage): Request[ModifyClusterSubnetGroupResult] = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage, callback: Callback[ModifyEventSubscriptionResult]): Unit = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult] = js.native
    def modifySnapshotCopyRetentionPeriod(params: ModifySnapshotCopyRetentionPeriodMessage, callback: Callback[ModifySnapshotCopyRetentionPeriodResult]): Unit = js.native
    def modifySnapshotCopyRetentionPeriod(params: ModifySnapshotCopyRetentionPeriodMessage): Request[ModifySnapshotCopyRetentionPeriodResult] = js.native
    def purchaseReservedNodeOffering(params: PurchaseReservedNodeOfferingMessage, callback: Callback[PurchaseReservedNodeOfferingResult]): Unit = js.native
    def purchaseReservedNodeOffering(params: PurchaseReservedNodeOfferingMessage): Request[PurchaseReservedNodeOfferingResult] = js.native
    def rebootCluster(params: RebootClusterMessage, callback: Callback[RebootClusterResult]): Unit = js.native
    def rebootCluster(params: RebootClusterMessage): Request[RebootClusterResult] = js.native
    def resetClusterParameterGroup(params: ResetClusterParameterGroupMessage, callback: Callback[ClusterParameterGroupNameMessage]): Unit = js.native
    def resetClusterParameterGroup(params: ResetClusterParameterGroupMessage): Request[ClusterParameterGroupNameMessage] = js.native
    def restoreFromClusterSnapshot(params: RestoreFromClusterSnapshotMessage, callback: Callback[RestoreFromClusterSnapshotResult]): Unit = js.native
    def restoreFromClusterSnapshot(params: RestoreFromClusterSnapshotMessage): Request[RestoreFromClusterSnapshotResult] = js.native
    def revokeClusterSecurityGroupIngress(params: RevokeClusterSecurityGroupIngressMessage, callback: Callback[RevokeClusterSecurityGroupIngressResult]): Unit = js.native
    def revokeClusterSecurityGroupIngress(params: RevokeClusterSecurityGroupIngressMessage): Request[RevokeClusterSecurityGroupIngressResult] = js.native
    def revokeSnapshotAccess(params: RevokeSnapshotAccessMessage, callback: Callback[RevokeSnapshotAccessResult]): Unit = js.native
    def revokeSnapshotAccess(params: RevokeSnapshotAccessMessage): Request[RevokeSnapshotAccessResult] = js.native
    def rotateEncryptionKey(params: RotateEncryptionKeyMessage, callback: Callback[RotateEncryptionKeyResult]): Unit = js.native
    def rotateEncryptionKey(params: RotateEncryptionKeyMessage): Request[RotateEncryptionKeyResult] = js.native
  }

  /**
   * <p> The owner of the specified snapshot has not authorized your account to access the snapshot. </p>
   */
  @js.native
  trait AccessToSnapshotDeniedFaultException extends js.Object {

  }

  /**
   * <p> Describes an AWS customer account authorized to restore a snapshot. </p>
   */
  @js.native
  trait AccountWithRestoreAccess extends js.Object {
    var AccountId: String
  }

  object AccountWithRestoreAccess {
    def apply(
      AccountId: js.UndefOr[String] = js.undefined
    ): AccountWithRestoreAccess = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountId" -> AccountId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountWithRestoreAccess]
    }
  }

  /**
   * <p> The specified CIDR block or EC2 security group is already authorized for the specified cluster security group. </p>
   */
  @js.native
  trait AuthorizationAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> The specified CIDR IP range or EC2 security group is not authorized for the specified cluster security group. </p>
   */
  @js.native
  trait AuthorizationNotFoundFaultException extends js.Object {

  }

  /**
   * <p> The authorization quota for the cluster security group has been reached. </p>
   */
  @js.native
  trait AuthorizationQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> ??? </p>
   */
  @js.native
  trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var CIDRIP: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object AuthorizeClusterSecurityGroupIngressMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      CIDRIP: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): AuthorizeClusterSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x: js.Any }),
        ("CIDRIP" -> CIDRIP.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: ClusterSecurityGroup
  }

  object AuthorizeClusterSecurityGroupIngressResult {
    def apply(
      ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): AuthorizeClusterSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroup" -> ClusterSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeClusterSecurityGroupIngressResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait AuthorizeSnapshotAccessMessage extends js.Object {
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: String
    var AccountWithRestoreAccess: String
  }

  object AuthorizeSnapshotAccessMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      AccountWithRestoreAccess: js.UndefOr[String] = js.undefined
    ): AuthorizeSnapshotAccessMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotIdentifier" -> SnapshotIdentifier.map { x => x: js.Any }),
        ("SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x: js.Any }),
        ("AccountWithRestoreAccess" -> AccountWithRestoreAccess.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSnapshotAccessMessage]
    }
  }

  @js.native
  trait AuthorizeSnapshotAccessResult extends js.Object {
    var Snapshot: Snapshot
  }

  object AuthorizeSnapshotAccessResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): AuthorizeSnapshotAccessResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshot" -> Snapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSnapshotAccessResult]
    }
  }

  /**
   * <p> Describes an availability zone. </p>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: String
  }

  object AvailabilityZone {
    def apply(
      Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
   * <p> Could not find the specified S3 bucket. </p>
   */
  @js.native
  trait BucketNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Describes a cluster.</p>
   */
  @js.native
  trait Cluster extends js.Object {
    var PreferredMaintenanceWindow: String
    var AllowVersionUpgrade: Boolean
    var ClusterIdentifier: String
    var ModifyStatus: String
    var DBName: String
    var Endpoint: Endpoint
    var ClusterPublicKey: String
    var ElasticIpStatus: ElasticIpStatus
    var ClusterStatus: String
    var ClusterVersion: String
    var KmsKeyId: String
    var NodeType: String
    var PendingModifiedValues: PendingModifiedValues
    var ClusterNodes: ClusterNodesList
    var AutomatedSnapshotRetentionPeriod: Integer
    var MasterUsername: String
    var AvailabilityZone: String
    var ClusterSecurityGroups: ClusterSecurityGroupMembershipList
    var VpcSecurityGroups: VpcSecurityGroupMembershipList
    var Encrypted: Boolean
    var NumberOfNodes: Integer
    var ClusterCreateTime: TStamp
    var HsmStatus: HsmStatus
    var Tags: TagList
    var ClusterSubnetGroupName: String
    var ClusterParameterGroups: ClusterParameterGroupStatusList
    var ClusterSnapshotCopyStatus: ClusterSnapshotCopyStatus
    var PubliclyAccessible: Boolean
    var ClusterRevisionNumber: String
    var RestoreStatus: RestoreStatus
    var VpcId: String
  }

  object Cluster {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      AllowVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      ModifyStatus: js.UndefOr[String] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      ClusterPublicKey: js.UndefOr[String] = js.undefined,
      ElasticIpStatus: js.UndefOr[ElasticIpStatus] = js.undefined,
      ClusterStatus: js.UndefOr[String] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
      ClusterNodes: js.UndefOr[ClusterNodesList] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList] = js.undefined,
      VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      NumberOfNodes: js.UndefOr[Integer] = js.undefined,
      ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      HsmStatus: js.UndefOr[HsmStatus] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList] = js.undefined,
      ClusterSnapshotCopyStatus: js.UndefOr[ClusterSnapshotCopyStatus] = js.undefined,
      PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
      ClusterRevisionNumber: js.UndefOr[String] = js.undefined,
      RestoreStatus: js.UndefOr[RestoreStatus] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("AllowVersionUpgrade" -> AllowVersionUpgrade.map { x => x: js.Any }),
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("ModifyStatus" -> ModifyStatus.map { x => x: js.Any }),
        ("DBName" -> DBName.map { x => x: js.Any }),
        ("Endpoint" -> Endpoint.map { x => x: js.Any }),
        ("ClusterPublicKey" -> ClusterPublicKey.map { x => x: js.Any }),
        ("ElasticIpStatus" -> ElasticIpStatus.map { x => x: js.Any }),
        ("ClusterStatus" -> ClusterStatus.map { x => x: js.Any }),
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("PendingModifiedValues" -> PendingModifiedValues.map { x => x: js.Any }),
        ("ClusterNodes" -> ClusterNodes.map { x => x: js.Any }),
        ("AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x: js.Any }),
        ("MasterUsername" -> MasterUsername.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x: js.Any }),
        ("VpcSecurityGroups" -> VpcSecurityGroups.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("NumberOfNodes" -> NumberOfNodes.map { x => x: js.Any }),
        ("ClusterCreateTime" -> ClusterCreateTime.map { x => x: js.Any }),
        ("HsmStatus" -> HsmStatus.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x: js.Any }),
        ("ClusterParameterGroups" -> ClusterParameterGroups.map { x => x: js.Any }),
        ("ClusterSnapshotCopyStatus" -> ClusterSnapshotCopyStatus.map { x => x: js.Any }),
        ("PubliclyAccessible" -> PubliclyAccessible.map { x => x: js.Any }),
        ("ClusterRevisionNumber" -> ClusterRevisionNumber.map { x => x: js.Any }),
        ("RestoreStatus" -> RestoreStatus.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
    }
  }

  /**
   * <p> The account already has a cluster with the given identifier. </p>
   */
  @js.native
  trait ClusterAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>The identifier of a node in a cluster.</p>
   */
  @js.native
  trait ClusterNode extends js.Object {
    var NodeRole: String
    var PrivateIPAddress: String
    var PublicIPAddress: String
  }

  object ClusterNode {
    def apply(
      NodeRole: js.UndefOr[String] = js.undefined,
      PrivateIPAddress: js.UndefOr[String] = js.undefined,
      PublicIPAddress: js.UndefOr[String] = js.undefined
    ): ClusterNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NodeRole" -> NodeRole.map { x => x: js.Any }),
        ("PrivateIPAddress" -> PrivateIPAddress.map { x => x: js.Any }),
        ("PublicIPAddress" -> PublicIPAddress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterNode]
    }
  }

  /**
   * <p> The <i>ClusterIdentifier</i> parameter does not refer to an existing cluster. </p>
   */
  @js.native
  trait ClusterNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Describes a parameter group.</p>
   */
  @js.native
  trait ClusterParameterGroup extends js.Object {
    var ParameterGroupName: String
    var ParameterGroupFamily: String
    var Description: String
    var Tags: TagList
  }

  object ClusterParameterGroup {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): ClusterParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any }),
        ("ParameterGroupFamily" -> ParameterGroupFamily.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroup]
    }
  }

  /**
   * <p> A cluster parameter group with the same name already exists. </p>
   */
  @js.native
  trait ClusterParameterGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Contains the output from the <a>DescribeClusterParameters</a> action. </p>
   */
  @js.native
  trait ClusterParameterGroupDetails extends js.Object {
    var Parameters: ParametersList
    var Marker: String
  }

  object ClusterParameterGroupDetails {
    def apply(
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): ClusterParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupDetails]
    }
  }

  /**
   * <p> Contains the output from the <a>ModifyClusterParameterGroup</a> and <a>ResetClusterParameterGroup</a> actions and indicate the parameter group involved and the status of the operation on the parameter group. </p>
   */
  @js.native
  trait ClusterParameterGroupNameMessage extends js.Object {
    var ParameterGroupName: String
    var ParameterGroupStatus: String
  }

  object ClusterParameterGroupNameMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterGroupStatus: js.UndefOr[String] = js.undefined
    ): ClusterParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any }),
        ("ParameterGroupStatus" -> ParameterGroupStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupNameMessage]
    }
  }

  /**
   * <p> The parameter group name does not refer to an existing parameter group. </p>
   */
  @js.native
  trait ClusterParameterGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p> The request would result in the user exceeding the allowed number of cluster parameter groups. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait ClusterParameterGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> Describes the status of a parameter group. </p>
   */
  @js.native
  trait ClusterParameterGroupStatus extends js.Object {
    var ParameterGroupName: String
    var ParameterApplyStatus: String
  }

  object ClusterParameterGroupStatus {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterApplyStatus: js.UndefOr[String] = js.undefined
    ): ClusterParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any }),
        ("ParameterApplyStatus" -> ParameterApplyStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupStatus]
    }
  }

  /**
   * <p> Contains the output from the <a>DescribeClusterParameterGroups</a> action. </p>
   */
  @js.native
  trait ClusterParameterGroupsMessage extends js.Object {
    var Marker: String
    var ParameterGroups: ParameterGroupList
  }

  object ClusterParameterGroupsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
    ): ClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ParameterGroups" -> ParameterGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterParameterGroupsMessage]
    }
  }

  /**
   * <p> The request would exceed the allowed number of cluster instances for this account. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait ClusterQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>Describes a security group.</p>
   */
  @js.native
  trait ClusterSecurityGroup extends js.Object {
    var ClusterSecurityGroupName: String
    var IPRanges: IPRangeList
    var Description: String
    var EC2SecurityGroups: EC2SecurityGroupList
    var Tags: TagList
  }

  object ClusterSecurityGroup {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      IPRanges: js.UndefOr[IPRangeList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): ClusterSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x: js.Any }),
        ("IPRanges" -> IPRanges.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EC2SecurityGroups" -> EC2SecurityGroups.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroup]
    }
  }

  /**
   * <p> A cluster security group with the same name already exists. </p>
   */
  @js.native
  trait ClusterSecurityGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>Describes a security group.</p>
   */
  @js.native
  trait ClusterSecurityGroupMembership extends js.Object {
    var ClusterSecurityGroupName: String
    var Status: String
  }

  object ClusterSecurityGroupMembership {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): ClusterSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroupMembership]
    }
  }

  /**
   * <p> Contains the output from the <a>DescribeClusterSecurityGroups</a> action. </p>
   */
  @js.native
  trait ClusterSecurityGroupMessage extends js.Object {
    var Marker: String
    var ClusterSecurityGroups: ClusterSecurityGroups
  }

  object ClusterSecurityGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups] = js.undefined
    ): ClusterSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSecurityGroupMessage]
    }
  }

  /**
   * <p> The cluster security group name does not refer to an existing cluster security group. </p>
   */
  @js.native
  trait ClusterSecurityGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p> The request would result in the user exceeding the allowed number of cluster security groups. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait ClusterSecurityGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> The value specified as a snapshot identifier is already used by an existing snapshot. </p>
   */
  @js.native
  trait ClusterSnapshotAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Returns the destination region and retention period that are configured for cross-region snapshot copy. </p>
   */
  @js.native
  trait ClusterSnapshotCopyStatus extends js.Object {
    var DestinationRegion: String
    var RetentionPeriod: Long
  }

  object ClusterSnapshotCopyStatus {
    def apply(
      DestinationRegion: js.UndefOr[String] = js.undefined,
      RetentionPeriod: js.UndefOr[Long] = js.undefined
    ): ClusterSnapshotCopyStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DestinationRegion" -> DestinationRegion.map { x => x: js.Any }),
        ("RetentionPeriod" -> RetentionPeriod.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSnapshotCopyStatus]
    }
  }

  /**
   * <p> The snapshot identifier does not refer to an existing cluster snapshot. </p>
   */
  @js.native
  trait ClusterSnapshotNotFoundFaultException extends js.Object {

  }

  /**
   * <p> The request would result in the user exceeding the allowed number of cluster snapshots. </p>
   */
  @js.native
  trait ClusterSnapshotQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>Describes a subnet group.</p>
   */
  @js.native
  trait ClusterSubnetGroup extends js.Object {
    var SubnetGroupStatus: String
    var Subnets: SubnetList
    var Description: String
    var Tags: TagList
    var ClusterSubnetGroupName: String
    var VpcId: String
  }

  object ClusterSubnetGroup {
    def apply(
      SubnetGroupStatus: js.UndefOr[String] = js.undefined,
      Subnets: js.UndefOr[SubnetList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): ClusterSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetGroupStatus" -> SubnetGroupStatus.map { x => x: js.Any }),
        ("Subnets" -> Subnets.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSubnetGroup]
    }
  }

  /**
   * <p> A <i>ClusterSubnetGroupName</i> is already used by an existing cluster subnet group. </p>
   */
  @js.native
  trait ClusterSubnetGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Contains the output from the <a>DescribeClusterSubnetGroups</a> action. </p>
   */
  @js.native
  trait ClusterSubnetGroupMessage extends js.Object {
    var Marker: String
    var ClusterSubnetGroups: ClusterSubnetGroups
  }

  object ClusterSubnetGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups] = js.undefined
    ): ClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ClusterSubnetGroups" -> ClusterSubnetGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterSubnetGroupMessage]
    }
  }

  /**
   * <p> The cluster subnet group name does not refer to an existing cluster subnet group. </p>
   */
  @js.native
  trait ClusterSubnetGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p> The request would result in user exceeding the allowed number of cluster subnet groups. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait ClusterSubnetGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> The request would result in user exceeding the allowed number of subnets in a cluster subnet groups. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait ClusterSubnetQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>Describes a cluster version, including the parameter group family and description of the version.</p>
   */
  @js.native
  trait ClusterVersion extends js.Object {
    var ClusterVersion: String
    var ClusterParameterGroupFamily: String
    var Description: String
  }

  object ClusterVersion {
    def apply(
      ClusterVersion: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): ClusterVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("ClusterParameterGroupFamily" -> ClusterParameterGroupFamily.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterVersion]
    }
  }

  /**
   * <p> Contains the output from the <a>DescribeClusterVersions</a> action. </p>
   */
  @js.native
  trait ClusterVersionsMessage extends js.Object {
    var Marker: String
    var ClusterVersions: ClusterVersionList
  }

  object ClusterVersionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ClusterVersions: js.UndefOr[ClusterVersionList] = js.undefined
    ): ClusterVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ClusterVersions" -> ClusterVersions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterVersionsMessage]
    }
  }

  /**
   * <p> Contains the output from the <a>DescribeClusters</a> action. </p>
   */
  @js.native
  trait ClustersMessage extends js.Object {
    var Marker: String
    var Clusters: ClusterList
  }

  object ClustersMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Clusters: js.UndefOr[ClusterList] = js.undefined
    ): ClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Clusters" -> Clusters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClustersMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait CopyClusterSnapshotMessage extends js.Object {
    var SourceSnapshotIdentifier: String
    var SourceSnapshotClusterIdentifier: String
    var TargetSnapshotIdentifier: String
  }

  object CopyClusterSnapshotMessage {
    def apply(
      SourceSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      TargetSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): CopyClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceSnapshotIdentifier" -> SourceSnapshotIdentifier.map { x => x: js.Any }),
        ("SourceSnapshotClusterIdentifier" -> SourceSnapshotClusterIdentifier.map { x => x: js.Any }),
        ("TargetSnapshotIdentifier" -> TargetSnapshotIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyClusterSnapshotMessage]
    }
  }

  @js.native
  trait CopyClusterSnapshotResult extends js.Object {
    var Snapshot: Snapshot
  }

  object CopyClusterSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CopyClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshot" -> Snapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyClusterSnapshotResult]
    }
  }

  /**
   * <p> Cross-region snapshot copy was temporarily disabled. Try your request again. </p>
   */
  @js.native
  trait CopyToRegionDisabledFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var ClusterParameterGroupName: String
    var AllowVersionUpgrade: BooleanOptional
    var ClusterIdentifier: String
    var DBName: String
    var ClusterType: String
    var ClusterVersion: String
    var KmsKeyId: String
    var NodeType: String
    var ElasticIp: String
    var AutomatedSnapshotRetentionPeriod: IntegerOptional
    var MasterUsername: String
    var AvailabilityZone: String
    var ClusterSecurityGroups: ClusterSecurityGroupNameList
    var Encrypted: BooleanOptional
    var VpcSecurityGroupIds: VpcSecurityGroupIdList
    var Port: IntegerOptional
    var NumberOfNodes: IntegerOptional
    var MasterUserPassword: String
    var HsmConfigurationIdentifier: String
    var Tags: TagList
    var ClusterSubnetGroupName: String
    var PubliclyAccessible: BooleanOptional
    var HsmClientCertificateIdentifier: String
  }

  object CreateClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      ElasticIp: js.UndefOr[String] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
      Encrypted: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    ): CreateClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("ClusterParameterGroupName" -> ClusterParameterGroupName.map { x => x: js.Any }),
        ("AllowVersionUpgrade" -> AllowVersionUpgrade.map { x => x: js.Any }),
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("DBName" -> DBName.map { x => x: js.Any }),
        ("ClusterType" -> ClusterType.map { x => x: js.Any }),
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any }),
        ("AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x: js.Any }),
        ("MasterUsername" -> MasterUsername.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("NumberOfNodes" -> NumberOfNodes.map { x => x: js.Any }),
        ("MasterUserPassword" -> MasterUserPassword.map { x => x: js.Any }),
        ("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x: js.Any }),
        ("PubliclyAccessible" -> PubliclyAccessible.map { x => x: js.Any }),
        ("HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait CreateClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
    var ParameterGroupFamily: String
    var Description: String
    var Tags: TagList
  }

  object CreateClusterParameterGroupMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any }),
        ("ParameterGroupFamily" -> ParameterGroupFamily.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterParameterGroupMessage]
    }
  }

  @js.native
  trait CreateClusterParameterGroupResult extends js.Object {
    var ClusterParameterGroup: ClusterParameterGroup
  }

  object CreateClusterParameterGroupResult {
    def apply(
      ClusterParameterGroup: js.UndefOr[ClusterParameterGroup] = js.undefined
    ): CreateClusterParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterParameterGroup" -> ClusterParameterGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterParameterGroupResult]
    }
  }

  @js.native
  trait CreateClusterResult extends js.Object {
    var Cluster: Cluster
  }

  object CreateClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResult]
    }
  }

  /**
   * <p>???</p>
   */
  @js.native
  trait CreateClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var Description: String
    var Tags: TagList
  }

  object CreateClusterSecurityGroupMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateClusterSecurityGroupResult extends js.Object {
    var ClusterSecurityGroup: ClusterSecurityGroup
  }

  object CreateClusterSecurityGroupResult {
    def apply(
      ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): CreateClusterSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroup" -> ClusterSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSecurityGroupResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait CreateClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: String
    var ClusterIdentifier: String
    var Tags: TagList
  }

  object CreateClusterSnapshotMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotIdentifier" -> SnapshotIdentifier.map { x => x: js.Any }),
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSnapshotMessage]
    }
  }

  @js.native
  trait CreateClusterSnapshotResult extends js.Object {
    var Snapshot: Snapshot
  }

  object CreateClusterSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CreateClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshot" -> Snapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSnapshotResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait CreateClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
    var Description: String
    var SubnetIds: SubnetIdentifierList
    var Tags: TagList
  }

  object CreateClusterSubnetGroupMessage {
    def apply(
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: ClusterSubnetGroup
  }

  object CreateClusterSubnetGroupResult {
    def apply(
      ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined
    ): CreateClusterSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSubnetGroup" -> ClusterSubnetGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterSubnetGroupResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateEventSubscriptionMessage extends js.Object {
    var Enabled: BooleanOptional
    var SourceIds: SourceIdsList
    var SubscriptionName: String
    var SnsTopicArn: String
    var EventCategories: EventCategoriesList
    var Tags: TagList
    var SourceType: String
    var Severity: String
  }

  object CreateEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined
    ): CreateEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("SourceIds" -> SourceIds.map { x => x: js.Any }),
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any }),
        ("SnsTopicArn" -> SnsTopicArn.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  @js.native
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: EventSubscription
  }

  object CreateEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): CreateEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSubscription" -> EventSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: String
    var Tags: TagList
  }

  object CreateHsmClientCertificateMessage {
    def apply(
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateHsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmClientCertificateMessage]
    }
  }

  @js.native
  trait CreateHsmClientCertificateResult extends js.Object {
    var HsmClientCertificate: HsmClientCertificate
  }

  object CreateHsmClientCertificateResult {
    def apply(
      HsmClientCertificate: js.UndefOr[HsmClientCertificate] = js.undefined
    ): CreateHsmClientCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmClientCertificate" -> HsmClientCertificate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmClientCertificateResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateHsmConfigurationMessage extends js.Object {
    var HsmPartitionName: String
    var HsmIpAddress: String
    var Description: String
    var HsmServerPublicCertificate: String
    var HsmConfigurationIdentifier: String
    var Tags: TagList
    var HsmPartitionPassword: String
  }

  object CreateHsmConfigurationMessage {
    def apply(
      HsmPartitionName: js.UndefOr[String] = js.undefined,
      HsmIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      HsmServerPublicCertificate: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      HsmPartitionPassword: js.UndefOr[String] = js.undefined
    ): CreateHsmConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmPartitionName" -> HsmPartitionName.map { x => x: js.Any }),
        ("HsmIpAddress" -> HsmIpAddress.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("HsmServerPublicCertificate" -> HsmServerPublicCertificate.map { x => x: js.Any }),
        ("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("HsmPartitionPassword" -> HsmPartitionPassword.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmConfigurationMessage]
    }
  }

  @js.native
  trait CreateHsmConfigurationResult extends js.Object {
    var HsmConfiguration: HsmConfiguration
  }

  object CreateHsmConfigurationResult {
    def apply(
      HsmConfiguration: js.UndefOr[HsmConfiguration] = js.undefined
    ): CreateHsmConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmConfiguration" -> HsmConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmConfigurationResult]
    }
  }

  /**
   * <p> Contains the output from the <code>CreateTags</code> action. </p>
   */
  @js.native
  trait CreateTagsMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object CreateTagsMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsMessage]
    }
  }

  /**
   * <p>Describes the default cluster parameters for a parameter group family. </p>
   */
  @js.native
  trait DefaultClusterParameters extends js.Object {
    var ParameterGroupFamily: String
    var Marker: String
    var Parameters: ParametersList
  }

  object DefaultClusterParameters {
    def apply(
      ParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined
    ): DefaultClusterParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupFamily" -> ParameterGroupFamily.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultClusterParameters]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DeleteClusterMessage extends js.Object {
    var ClusterIdentifier: String
    var SkipFinalClusterSnapshot: Boolean
    var FinalClusterSnapshotIdentifier: String
  }

  object DeleteClusterMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      SkipFinalClusterSnapshot: js.UndefOr[Boolean] = js.undefined,
      FinalClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("SkipFinalClusterSnapshot" -> SkipFinalClusterSnapshot.map { x => x: js.Any }),
        ("FinalClusterSnapshotIdentifier" -> FinalClusterSnapshotIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DeleteClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
  }

  object DeleteClusterParameterGroupMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined
    ): DeleteClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterParameterGroupMessage]
    }
  }

  @js.native
  trait DeleteClusterResult extends js.Object {
    var Cluster: Cluster
  }

  object DeleteClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DeleteClusterSecurityGroupMessage extends js.Object {
    var ClusterSecurityGroupName: String
  }

  object DeleteClusterSecurityGroupMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined
    ): DeleteClusterSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSecurityGroupMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DeleteClusterSnapshotMessage extends js.Object {
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: String
  }

  object DeleteClusterSnapshotMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotIdentifier" -> SnapshotIdentifier.map { x => x: js.Any }),
        ("SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSnapshotMessage]
    }
  }

  @js.native
  trait DeleteClusterSnapshotResult extends js.Object {
    var Snapshot: Snapshot
  }

  object DeleteClusterSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): DeleteClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshot" -> Snapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSnapshotResult]
    }
  }

  @js.native
  trait DeleteClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
  }

  object DeleteClusterSubnetGroupMessage {
    def apply(
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
    ): DeleteClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterSubnetGroupMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  object DeleteEventSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined
    ): DeleteEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteHsmClientCertificateMessage extends js.Object {
    var HsmClientCertificateIdentifier: String
  }

  object DeleteHsmClientCertificateMessage {
    def apply(
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteHsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmClientCertificateMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteHsmConfigurationMessage extends js.Object {
    var HsmConfigurationIdentifier: String
  }

  object DeleteHsmConfigurationMessage {
    def apply(
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteHsmConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmConfigurationMessage]
    }
  }

  /**
   * <p> Contains the output from the <code>DeleteTags</code> action. </p>
   */
  @js.native
  trait DeleteTagsMessage extends js.Object {
    var ResourceName: String
    var TagKeys: TagKeyList
  }

  object DeleteTagsMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): DeleteTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeClusterParameterGroupsMessage extends js.Object {
    var ParameterGroupName: String
    var MaxRecords: IntegerOptional
    var TagValues: TagValueList
    var TagKeys: TagKeyList
    var Marker: String
  }

  object DescribeClusterParameterGroupsMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeClusterParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("TagValues" -> TagValues.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterParameterGroupsMessage]
    }
  }

  @js.native
  trait DescribeClusterParametersMessage extends js.Object {
    var ParameterGroupName: String
    var Source: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeClusterParametersMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterParametersMessage]
    }
  }

  /**
   * <p>???</p>
   */
  @js.native
  trait DescribeClusterSecurityGroupsMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var MaxRecords: IntegerOptional
    var TagValues: TagValueList
    var TagKeys: TagKeyList
    var Marker: String
  }

  object DescribeClusterSecurityGroupsMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeClusterSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("TagValues" -> TagValues.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSecurityGroupsMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeClusterSnapshotsMessage extends js.Object {
    var ClusterIdentifier: String
    var SnapshotType: String
    var StartTime: TStamp
    var EndTime: TStamp
    var MaxRecords: IntegerOptional
    var TagValues: TagValueList
    var OwnerAccount: String
    var TagKeys: TagKeyList
    var SnapshotIdentifier: String
    var Marker: String
  }

  object DescribeClusterSnapshotsMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      OwnerAccount: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeClusterSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("SnapshotType" -> SnapshotType.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("TagValues" -> TagValues.map { x => x: js.Any }),
        ("OwnerAccount" -> OwnerAccount.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any }),
        ("SnapshotIdentifier" -> SnapshotIdentifier.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSnapshotsMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeClusterSubnetGroupsMessage extends js.Object {
    var MaxRecords: IntegerOptional
    var ClusterSubnetGroupName: String
    var TagValues: TagValueList
    var TagKeys: TagKeyList
    var Marker: String
  }

  object DescribeClusterSubnetGroupsMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeClusterSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x: js.Any }),
        ("TagValues" -> TagValues.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterSubnetGroupsMessage]
    }
  }

  @js.native
  trait DescribeClusterVersionsMessage extends js.Object {
    var ClusterVersion: String
    var ClusterParameterGroupFamily: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeClusterVersionsMessage {
    def apply(
      ClusterVersion: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeClusterVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("ClusterParameterGroupFamily" -> ClusterParameterGroupFamily.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterVersionsMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeClustersMessage extends js.Object {
    var ClusterIdentifier: String
    var MaxRecords: IntegerOptional
    var TagValues: TagValueList
    var TagKeys: TagKeyList
    var Marker: String
  }

  object DescribeClustersMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("TagValues" -> TagValues.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeDefaultClusterParametersMessage extends js.Object {
    var ParameterGroupFamily: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeDefaultClusterParametersMessage {
    def apply(
      ParameterGroupFamily: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDefaultClusterParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupFamily" -> ParameterGroupFamily.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultClusterParametersMessage]
    }
  }

  @js.native
  trait DescribeDefaultClusterParametersResult extends js.Object {
    var DefaultClusterParameters: DefaultClusterParameters
  }

  object DescribeDefaultClusterParametersResult {
    def apply(
      DefaultClusterParameters: js.UndefOr[DefaultClusterParameters] = js.undefined
    ): DescribeDefaultClusterParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultClusterParameters" -> DefaultClusterParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultClusterParametersResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var SourceType: String
  }

  object DescribeEventCategoriesMessage {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined
    ): DescribeEventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceType" -> SourceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var SubscriptionName: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeEventSubscriptionsMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeEventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeEventsMessage extends js.Object {
    var Duration: IntegerOptional
    var SourceIdentifier: String
    var StartTime: TStamp
    var EndTime: TStamp
    var MaxRecords: IntegerOptional
    var SourceType: SourceType
    var Marker: String
  }

  object DescribeEventsMessage {
    def apply(
      Duration: js.UndefOr[IntegerOptional] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("SourceIdentifier" -> SourceIdentifier.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeHsmClientCertificatesMessage extends js.Object {
    var MaxRecords: IntegerOptional
    var TagValues: TagValueList
    var HsmClientCertificateIdentifier: String
    var TagKeys: TagKeyList
    var Marker: String
  }

  object DescribeHsmClientCertificatesMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeHsmClientCertificatesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("TagValues" -> TagValues.map { x => x: js.Any }),
        ("HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmClientCertificatesMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeHsmConfigurationsMessage extends js.Object {
    var MaxRecords: IntegerOptional
    var HsmConfigurationIdentifier: String
    var TagValues: TagValueList
    var TagKeys: TagKeyList
    var Marker: String
  }

  object DescribeHsmConfigurationsMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeHsmConfigurationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x: js.Any }),
        ("TagValues" -> TagValues.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmConfigurationsMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeLoggingStatusMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object DescribeLoggingStatusMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined
    ): DescribeLoggingStatusMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoggingStatusMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeOrderableClusterOptionsMessage extends js.Object {
    var ClusterVersion: String
    var NodeType: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeOrderableClusterOptionsMessage {
    def apply(
      ClusterVersion: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeOrderableClusterOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrderableClusterOptionsMessage]
    }
  }

  /**
   * <p>to be provided.</p>
   */
  @js.native
  trait DescribeReservedNodeOfferingsMessage extends js.Object {
    var ReservedNodeOfferingId: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeReservedNodeOfferingsMessage {
    def apply(
      ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeReservedNodeOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedNodeOfferingsMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeReservedNodesMessage extends js.Object {
    var ReservedNodeId: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeReservedNodesMessage {
    def apply(
      ReservedNodeId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeReservedNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedNodeId" -> ReservedNodeId.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedNodesMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DescribeResizeMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object DescribeResizeMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined
    ): DescribeResizeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResizeMessage]
    }
  }

  /**
   * <p> Contains the output from the <code>DescribeTags</code> action. </p>
   */
  @js.native
  trait DescribeTagsMessage extends js.Object {
    var ResourceName: String
    var ResourceType: String
    var MaxRecords: IntegerOptional
    var TagValues: TagValueList
    var TagKeys: TagKeyList
    var Marker: String
  }

  object DescribeTagsMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      ResourceType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      TagValues: js.UndefOr[TagValueList] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeTagsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("TagValues" -> TagValues.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DisableLoggingMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object DisableLoggingMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined
    ): DisableLoggingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableLoggingMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DisableSnapshotCopyMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object DisableSnapshotCopyMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined
    ): DisableSnapshotCopyMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSnapshotCopyMessage]
    }
  }

  @js.native
  trait DisableSnapshotCopyResult extends js.Object {
    var Cluster: Cluster
  }

  object DisableSnapshotCopyResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): DisableSnapshotCopyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSnapshotCopyResult]
    }
  }

  /**
   * <p>Describes an Amazon EC2 security group.</p>
   */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var Status: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
    var Tags: TagList
  }

  object EC2SecurityGroup {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
   * <p>Describes the status of the elastic IP (EIP) address.</p>
   */
  @js.native
  trait ElasticIpStatus extends js.Object {
    var ElasticIp: String
    var Status: String
  }

  object ElasticIpStatus {
    def apply(
      ElasticIp: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): ElasticIpStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticIpStatus]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait EnableLoggingMessage extends js.Object {
    var ClusterIdentifier: String
    var BucketName: String
    var S3KeyPrefix: String
  }

  object EnableLoggingMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      BucketName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined
    ): EnableLoggingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("BucketName" -> BucketName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableLoggingMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait EnableSnapshotCopyMessage extends js.Object {
    var ClusterIdentifier: String
    var DestinationRegion: String
    var RetentionPeriod: IntegerOptional
  }

  object EnableSnapshotCopyMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      DestinationRegion: js.UndefOr[String] = js.undefined,
      RetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    ): EnableSnapshotCopyMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("DestinationRegion" -> DestinationRegion.map { x => x: js.Any }),
        ("RetentionPeriod" -> RetentionPeriod.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSnapshotCopyMessage]
    }
  }

  @js.native
  trait EnableSnapshotCopyResult extends js.Object {
    var Cluster: Cluster
  }

  object EnableSnapshotCopyResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): EnableSnapshotCopyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSnapshotCopyResult]
    }
  }

  /**
   * <p>Describes a connection endpoint.</p>
   */
  @js.native
  trait Endpoint extends js.Object {
    var Address: String
    var Port: Integer
  }

  object Endpoint {
    def apply(
      Address: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[Integer] = js.undefined
    ): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Address" -> Address.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * <p> Describes an event. </p>
   */
  @js.native
  trait Event extends js.Object {
    var SourceIdentifier: String
    var EventId: String
    var EventCategories: EventCategoriesList
    var Message: String
    var SourceType: SourceType
    var Date: TStamp
    var Severity: String
  }

  object Event {
    def apply(
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Date: js.UndefOr[TStamp] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined
    ): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceIdentifier" -> SourceIdentifier.map { x => x: js.Any }),
        ("EventId" -> EventId.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Date" -> Date.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  @js.native
  trait EventCategoriesMap extends js.Object {
    var SourceType: String
    var Events: EventInfoMapList
  }

  object EventCategoriesMap {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[EventInfoMapList] = js.undefined
    ): EventCategoriesMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMap]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: EventCategoriesMapList
  }

  object EventCategoriesMessage {
    def apply(
      EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined
    ): EventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventCategoriesMapList" -> EventCategoriesMapList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMessage]
    }
  }

  @js.native
  trait EventInfoMap extends js.Object {
    var EventId: String
    var EventCategories: EventCategoriesList
    var EventDescription: String
    var Severity: String
  }

  object EventInfoMap {
    def apply(
      EventId: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      EventDescription: js.UndefOr[String] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined
    ): EventInfoMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventId" -> EventId.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any }),
        ("EventDescription" -> EventDescription.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventInfoMap]
    }
  }

  @js.native
  trait EventSubscription extends js.Object {
    var CustomerAwsId: String
    var Enabled: Boolean
    var CustSubscriptionId: String
    var SnsTopicArn: String
    var Tags: TagList
    var SourceType: String
    var EventCategoriesList: EventCategoriesList
    var SourceIdsList: SourceIdsList
    var SubscriptionCreationTime: TStamp
    var Severity: String
    var Status: String
  }

  object EventSubscription {
    def apply(
      CustomerAwsId: js.UndefOr[String] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined,
      CustSubscriptionId: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionCreationTime: js.UndefOr[TStamp] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): EventSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CustomerAwsId" -> CustomerAwsId.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("CustSubscriptionId" -> CustSubscriptionId.map { x => x: js.Any }),
        ("SnsTopicArn" -> SnsTopicArn.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("EventCategoriesList" -> EventCategoriesList.map { x => x: js.Any }),
        ("SourceIdsList" -> SourceIdsList.map { x => x: js.Any }),
        ("SubscriptionCreationTime" -> SubscriptionCreationTime.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
    }
  }

  /**
   * <p> The request would exceed the allowed number of event subscriptions for this account. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait EventSubscriptionQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait EventSubscriptionsMessage extends js.Object {
    var Marker: String
    var EventSubscriptionsList: EventSubscriptionsList
  }

  object EventSubscriptionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined
    ): EventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("EventSubscriptionsList" -> EventSubscriptionsList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscriptionsMessage]
    }
  }

  /**
   * <p> Contains the output from the <a>DescribeEvents</a> action. </p>
   */
  @js.native
  trait EventsMessage extends js.Object {
    var Marker: String
    var Events: EventList
  }

  object EventsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined
    ): EventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsMessage]
    }
  }

  /**
   * <p>Returns information about an HSM client certificate. The certificate is stored in a secure Hardware Storage Module (HSM), and used by the Amazon Redshift cluster to encrypt data files.</p>
   */
  @js.native
  trait HsmClientCertificate extends js.Object {
    var HsmClientCertificateIdentifier: String
    var HsmClientCertificatePublicKey: String
    var Tags: TagList
  }

  object HsmClientCertificate {
    def apply(
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      HsmClientCertificatePublicKey: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): HsmClientCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x: js.Any }),
        ("HsmClientCertificatePublicKey" -> HsmClientCertificatePublicKey.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmClientCertificate]
    }
  }

  /**
   * <p>There is already an existing Amazon Redshift HSM client certificate with the specified identifier.</p>
   */
  @js.native
  trait HsmClientCertificateAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait HsmClientCertificateMessage extends js.Object {
    var Marker: String
    var HsmClientCertificates: HsmClientCertificateList
  }

  object HsmClientCertificateMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      HsmClientCertificates: js.UndefOr[HsmClientCertificateList] = js.undefined
    ): HsmClientCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("HsmClientCertificates" -> HsmClientCertificates.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmClientCertificateMessage]
    }
  }

  /**
   * <p>There is no Amazon Redshift HSM client certificate with the specified identifier.</p>
   */
  @js.native
  trait HsmClientCertificateNotFoundFaultException extends js.Object {

  }

  /**
   * <p> The quota for HSM client certificates has been reached. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait HsmClientCertificateQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>Returns information about an HSM configuration, which is an object that describes to Amazon Redshift clusters the information they require to connect to an HSM where they can store database encryption keys.</p>
   */
  @js.native
  trait HsmConfiguration extends js.Object {
    var HsmPartitionName: String
    var HsmIpAddress: String
    var Description: String
    var HsmConfigurationIdentifier: String
    var Tags: TagList
  }

  object HsmConfiguration {
    def apply(
      HsmPartitionName: js.UndefOr[String] = js.undefined,
      HsmIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): HsmConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmPartitionName" -> HsmPartitionName.map { x => x: js.Any }),
        ("HsmIpAddress" -> HsmIpAddress.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmConfiguration]
    }
  }

  /**
   * <p>There is already an existing Amazon Redshift HSM configuration with the specified identifier.</p>
   */
  @js.native
  trait HsmConfigurationAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait HsmConfigurationMessage extends js.Object {
    var Marker: String
    var HsmConfigurations: HsmConfigurationList
  }

  object HsmConfigurationMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      HsmConfigurations: js.UndefOr[HsmConfigurationList] = js.undefined
    ): HsmConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("HsmConfigurations" -> HsmConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmConfigurationMessage]
    }
  }

  /**
   * <p>There is no Amazon Redshift HSM configuration with the specified identifier.</p>
   */
  @js.native
  trait HsmConfigurationNotFoundFaultException extends js.Object {

  }

  /**
   * <p> The quota for HSM configurations has been reached. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait HsmConfigurationQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait HsmStatus extends js.Object {
    var HsmClientCertificateIdentifier: String
    var HsmConfigurationIdentifier: String
    var Status: String
  }

  object HsmStatus {
    def apply(
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): HsmStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x: js.Any }),
        ("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HsmStatus]
    }
  }

  /**
   * <p> Describes an IP range used in a security group. </p>
   */
  @js.native
  trait IPRange extends js.Object {
    var Status: String
    var CIDRIP: String
    var Tags: TagList
  }

  object IPRange {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      CIDRIP: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): IPRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("CIDRIP" -> CIDRIP.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPRange]
    }
  }

  /**
   * <p> The specified options are incompatible. </p>
   */
  @js.native
  trait IncompatibleOrderableOptionsException extends js.Object {

  }

  /**
   * <p> The number of nodes specified exceeds the allotted capacity of the cluster. </p>
   */
  @js.native
  trait InsufficientClusterCapacityFaultException extends js.Object {

  }

  /**
   * <p> The cluster does not have read bucket or put object permissions on the S3 bucket specified when enabling logging. </p>
   */
  @js.native
  trait InsufficientS3BucketPolicyFaultException extends js.Object {

  }

  /**
   * <p> The cluster parameter group action can not be completed because another task is in progress that involves the parameter group. Wait a few moments and try the operation again. </p>
   */
  @js.native
  trait InvalidClusterParameterGroupStateFaultException extends js.Object {

  }

  /**
   * <p> The state of the cluster security group is not <code>available</code>. </p>
   */
  @js.native
  trait InvalidClusterSecurityGroupStateFaultException extends js.Object {

  }

  /**
   * <p> The state of the cluster snapshot is not <code>available</code>, or other accounts are authorized to access the snapshot. </p>
   */
  @js.native
  trait InvalidClusterSnapshotStateFaultException extends js.Object {

  }

  /**
   * <p> The specified cluster is not in the <code>available</code> state. </p>
   */
  @js.native
  trait InvalidClusterStateFaultException extends js.Object {

  }

  /**
   * <p> The cluster subnet group cannot be deleted because it is in use. </p>
   */
  @js.native
  trait InvalidClusterSubnetGroupStateFaultException extends js.Object {

  }

  /**
   * <p>The state of the subnet is invalid.</p>
   */
  @js.native
  trait InvalidClusterSubnetStateFaultException extends js.Object {

  }

  /**
   * <p>The Elastic IP (EIP) is invalid or cannot be found.</p>
   */
  @js.native
  trait InvalidElasticIpFaultException extends js.Object {

  }

  /**
   * <p>The specified HSM client certificate is not in the <code>available</code> state, or it is still in use by one or more Amazon Redshift clusters.</p>
   */
  @js.native
  trait InvalidHsmClientCertificateStateFaultException extends js.Object {

  }

  /**
   * <p>The specified HSM configuration is not in the <code>available</code> state, or it is still in use by one or more Amazon Redshift clusters.</p>
   */
  @js.native
  trait InvalidHsmConfigurationStateFaultException extends js.Object {

  }

  /**
   * <p>The restore is invalid.</p>
   */
  @js.native
  trait InvalidRestoreFaultException extends js.Object {

  }

  /**
   * <p>The S3 bucket name is invalid. For more information about naming rules, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and Limitations</a> in the Amazon Simple Storage Service (S3) Developer Guide.</p>
   */
  @js.native
  trait InvalidS3BucketNameFaultException extends js.Object {

  }

  /**
   * <p> The string specified for the logging S3 key prefix does not comply with the documented constraints. </p>
   */
  @js.native
  trait InvalidS3KeyPrefixFaultException extends js.Object {

  }

  /**
   * <p> The requested subnet is not valid, or not all of the subnets are in the same VPC. </p>
   */
  @js.native
  trait InvalidSubnetException extends js.Object {

  }

  /**
   * <p> The subscription request is invalid because it is a duplicate request. This subscription request is already in progress. </p>
   */
  @js.native
  trait InvalidSubscriptionStateFaultException extends js.Object {

  }

  /**
   * <p> The tag is invalid. </p>
   */
  @js.native
  trait InvalidTagFaultException extends js.Object {

  }

  /**
   * <p> The cluster subnet group does not cover all Availability Zones. </p>
   */
  @js.native
  trait InvalidVPCNetworkStateFaultException extends js.Object {

  }

  /**
   * <p>Describes the status of logging for a cluster.</p>
   */
  @js.native
  trait LoggingStatus extends js.Object {
    var LastFailureMessage: String
    var BucketName: String
    var LastSuccessfulDeliveryTime: TStamp
    var S3KeyPrefix: String
    var LoggingEnabled: Boolean
    var LastFailureTime: TStamp
  }

  object LoggingStatus {
    def apply(
      LastFailureMessage: js.UndefOr[String] = js.undefined,
      BucketName: js.UndefOr[String] = js.undefined,
      LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      LoggingEnabled: js.UndefOr[Boolean] = js.undefined,
      LastFailureTime: js.UndefOr[TStamp] = js.undefined
    ): LoggingStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastFailureMessage" -> LastFailureMessage.map { x => x: js.Any }),
        ("BucketName" -> BucketName.map { x => x: js.Any }),
        ("LastSuccessfulDeliveryTime" -> LastSuccessfulDeliveryTime.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("LoggingEnabled" -> LoggingEnabled.map { x => x: js.Any }),
        ("LastFailureTime" -> LastFailureTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingStatus]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ModifyClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var ClusterParameterGroupName: String
    var AllowVersionUpgrade: BooleanOptional
    var ClusterIdentifier: String
    var NewClusterIdentifier: String
    var ClusterType: String
    var ClusterVersion: String
    var NodeType: String
    var AutomatedSnapshotRetentionPeriod: IntegerOptional
    var ClusterSecurityGroups: ClusterSecurityGroupNameList
    var VpcSecurityGroupIds: VpcSecurityGroupIdList
    var NumberOfNodes: IntegerOptional
    var MasterUserPassword: String
    var HsmConfigurationIdentifier: String
    var HsmClientCertificateIdentifier: String
  }

  object ModifyClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      NewClusterIdentifier: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    ): ModifyClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("ClusterParameterGroupName" -> ClusterParameterGroupName.map { x => x: js.Any }),
        ("AllowVersionUpgrade" -> AllowVersionUpgrade.map { x => x: js.Any }),
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("NewClusterIdentifier" -> NewClusterIdentifier.map { x => x: js.Any }),
        ("ClusterType" -> ClusterType.map { x => x: js.Any }),
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x: js.Any }),
        ("ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x: js.Any }),
        ("VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x: js.Any }),
        ("NumberOfNodes" -> NumberOfNodes.map { x => x: js.Any }),
        ("MasterUserPassword" -> MasterUserPassword.map { x => x: js.Any }),
        ("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x: js.Any }),
        ("HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait ModifyClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
    var Parameters: ParametersList
  }

  object ModifyClusterParameterGroupMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined
    ): ModifyClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterParameterGroupMessage]
    }
  }

  @js.native
  trait ModifyClusterResult extends js.Object {
    var Cluster: Cluster
  }

  object ModifyClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): ModifyClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait ModifyClusterSubnetGroupMessage extends js.Object {
    var ClusterSubnetGroupName: String
    var Description: String
    var SubnetIds: SubnetIdentifierList
  }

  object ModifyClusterSubnetGroupMessage {
    def apply(
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
    ): ModifyClusterSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: ClusterSubnetGroup
  }

  object ModifyClusterSubnetGroupResult {
    def apply(
      ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined
    ): ModifyClusterSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSubnetGroup" -> ClusterSubnetGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClusterSubnetGroupResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ModifyEventSubscriptionMessage extends js.Object {
    var Enabled: BooleanOptional
    var SourceIds: SourceIdsList
    var SubscriptionName: String
    var SnsTopicArn: String
    var EventCategories: EventCategoriesList
    var SourceType: String
    var Severity: String
  }

  object ModifyEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      Severity: js.UndefOr[String] = js.undefined
    ): ModifyEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("SourceIds" -> SourceIds.map { x => x: js.Any }),
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any }),
        ("SnsTopicArn" -> SnsTopicArn.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  @js.native
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: EventSubscription
  }

  object ModifyEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): ModifyEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSubscription" -> EventSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait ModifySnapshotCopyRetentionPeriodMessage extends js.Object {
    var ClusterIdentifier: String
    var RetentionPeriod: Integer
  }

  object ModifySnapshotCopyRetentionPeriodMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      RetentionPeriod: js.UndefOr[Integer] = js.undefined
    ): ModifySnapshotCopyRetentionPeriodMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("RetentionPeriod" -> RetentionPeriod.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotCopyRetentionPeriodMessage]
    }
  }

  @js.native
  trait ModifySnapshotCopyRetentionPeriodResult extends js.Object {
    var Cluster: Cluster
  }

  object ModifySnapshotCopyRetentionPeriodResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): ModifySnapshotCopyRetentionPeriodResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotCopyRetentionPeriodResult]
    }
  }

  /**
   * <p>The operation would exceed the number of nodes allowed for a cluster.</p>
   */
  @js.native
  trait NumberOfNodesPerClusterLimitExceededFaultException extends js.Object {

  }

  /**
   * <p>The operation would exceed the number of nodes allotted to the account. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait NumberOfNodesQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> Describes an orderable cluster option. </p>
   */
  @js.native
  trait OrderableClusterOption extends js.Object {
    var ClusterVersion: String
    var ClusterType: String
    var NodeType: String
    var AvailabilityZones: AvailabilityZoneList
  }

  object OrderableClusterOption {
    def apply(
      ClusterVersion: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    ): OrderableClusterOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("ClusterType" -> ClusterType.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableClusterOption]
    }
  }

  /**
   * <p> Contains the output from the <a>DescribeOrderableClusterOptions</a> action. </p>
   */
  @js.native
  trait OrderableClusterOptionsMessage extends js.Object {
    var OrderableClusterOptions: OrderableClusterOptionsList
    var Marker: String
  }

  object OrderableClusterOptionsMessage {
    def apply(
      OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): OrderableClusterOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OrderableClusterOptions" -> OrderableClusterOptions.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableClusterOptionsMessage]
    }
  }

  /**
   * <p> Describes a parameter in a cluster parameter group. </p>
   */
  @js.native
  trait Parameter extends js.Object {
    var IsModifiable: Boolean
    var Description: String
    var AllowedValues: String
    var Source: String
    var MinimumEngineVersion: String
    var ParameterValue: String
    var ParameterName: String
    var DataType: String
  }

  object Parameter {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MinimumEngineVersion: js.UndefOr[String] = js.undefined,
      ParameterValue: js.UndefOr[String] = js.undefined,
      ParameterName: js.UndefOr[String] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined
    ): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsModifiable" -> IsModifiable.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("AllowedValues" -> AllowedValues.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("MinimumEngineVersion" -> MinimumEngineVersion.map { x => x: js.Any }),
        ("ParameterValue" -> ParameterValue.map { x => x: js.Any }),
        ("ParameterName" -> ParameterName.map { x => x: js.Any }),
        ("DataType" -> DataType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * <p> Describes cluster attributes that are in a pending state. A change to one or more the attributes was requested and is in progress or will be applied. </p>
   */
  @js.native
  trait PendingModifiedValues extends js.Object {
    var ClusterIdentifier: String
    var ClusterType: String
    var ClusterVersion: String
    var NodeType: String
    var AutomatedSnapshotRetentionPeriod: IntegerOptional
    var NumberOfNodes: IntegerOptional
    var MasterUserPassword: String
  }

  object PendingModifiedValues {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      ClusterType: js.UndefOr[String] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined
    ): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("ClusterType" -> ClusterType.map { x => x: js.Any }),
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x: js.Any }),
        ("NumberOfNodes" -> NumberOfNodes.map { x => x: js.Any }),
        ("MasterUserPassword" -> MasterUserPassword.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait PurchaseReservedNodeOfferingMessage extends js.Object {
    var ReservedNodeOfferingId: String
    var NodeCount: IntegerOptional
  }

  object PurchaseReservedNodeOfferingMessage {
    def apply(
      ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
      NodeCount: js.UndefOr[IntegerOptional] = js.undefined
    ): PurchaseReservedNodeOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x => x: js.Any }),
        ("NodeCount" -> NodeCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedNodeOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedNodeOfferingResult extends js.Object {
    var ReservedNode: ReservedNode
  }

  object PurchaseReservedNodeOfferingResult {
    def apply(
      ReservedNode: js.UndefOr[ReservedNode] = js.undefined
    ): PurchaseReservedNodeOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedNode" -> ReservedNode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedNodeOfferingResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait RebootClusterMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object RebootClusterMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined
    ): RebootClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootClusterMessage]
    }
  }

  @js.native
  trait RebootClusterResult extends js.Object {
    var Cluster: Cluster
  }

  object RebootClusterResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): RebootClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootClusterResult]
    }
  }

  /**
   * <p>Describes a recurring charge.</p>
   */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: Double
    var RecurringChargeFrequency: String
  }

  object RecurringCharge {
    def apply(
      RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
      RecurringChargeFrequency: js.UndefOr[String] = js.undefined
    ): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RecurringChargeAmount" -> RecurringChargeAmount.map { x => x: js.Any }),
        ("RecurringChargeFrequency" -> RecurringChargeFrequency.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }

  /**
   * <p> Describes a reserved node. </p>
   */
  @js.native
  trait ReservedNode extends js.Object {
    var ReservedNodeId: String
    var CurrencyCode: String
    var Duration: Integer
    var FixedPrice: Double
    var NodeCount: Integer
    var RecurringCharges: RecurringChargeList
    var NodeType: String
    var StartTime: TStamp
    var OfferingType: String
    var UsagePrice: Double
    var ReservedNodeOfferingId: String
    var State: String
  }

  object ReservedNode {
    def apply(
      ReservedNodeId: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Integer] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      NodeCount: js.UndefOr[Integer] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservedNodeOfferingId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined
    ): ReservedNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedNodeId" -> ReservedNodeId.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("FixedPrice" -> FixedPrice.map { x => x: js.Any }),
        ("NodeCount" -> NodeCount.map { x => x: js.Any }),
        ("RecurringCharges" -> RecurringCharges.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("UsagePrice" -> UsagePrice.map { x => x: js.Any }),
        ("ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNode]
    }
  }

  /**
   * <p> User already has a reservation with the given identifier. </p>
   */
  @js.native
  trait ReservedNodeAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> The specified reserved compute node not found. </p>
   */
  @js.native
  trait ReservedNodeNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Describes a reserved node offering.</p>
   */
  @js.native
  trait ReservedNodeOffering extends js.Object {
    var CurrencyCode: String
    var Duration: Integer
    var FixedPrice: Double
    var RecurringCharges: RecurringChargeList
    var NodeType: String
    var OfferingType: String
    var UsagePrice: Double
    var ReservedNodeOfferingId: String
  }

  object ReservedNodeOffering {
    def apply(
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Integer] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservedNodeOfferingId: js.UndefOr[String] = js.undefined
    ): ReservedNodeOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("FixedPrice" -> FixedPrice.map { x => x: js.Any }),
        ("RecurringCharges" -> RecurringCharges.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("UsagePrice" -> UsagePrice.map { x => x: js.Any }),
        ("ReservedNodeOfferingId" -> ReservedNodeOfferingId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodeOffering]
    }
  }

  /**
   * <p> Specified offering does not exist. </p>
   */
  @js.native
  trait ReservedNodeOfferingNotFoundFaultException extends js.Object {

  }

  /**
   * <p> Contains the output from the <a>DescribeReservedNodeOfferings</a> action. </p>
   */
  @js.native
  trait ReservedNodeOfferingsMessage extends js.Object {
    var Marker: String
    var ReservedNodeOfferings: ReservedNodeOfferingList
  }

  object ReservedNodeOfferingsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
    ): ReservedNodeOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ReservedNodeOfferings" -> ReservedNodeOfferings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodeOfferingsMessage]
    }
  }

  /**
   * <p> Request would exceed the user's compute node quota. For information about increasing your quota, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
   */
  @js.native
  trait ReservedNodeQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>Contains the output from the <a>DescribeReservedNodes</a> action.</p>
   */
  @js.native
  trait ReservedNodesMessage extends js.Object {
    var Marker: String
    var ReservedNodes: ReservedNodeList
  }

  object ReservedNodesMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedNodes: js.UndefOr[ReservedNodeList] = js.undefined
    ): ReservedNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ReservedNodes" -> ReservedNodes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedNodesMessage]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait ResetClusterParameterGroupMessage extends js.Object {
    var ParameterGroupName: String
    var ResetAllParameters: Boolean
    var Parameters: ParametersList
  }

  object ResetClusterParameterGroupMessage {
    def apply(
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined
    ): ResetClusterParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterGroupName" -> ParameterGroupName.map { x => x: js.Any }),
        ("ResetAllParameters" -> ResetAllParameters.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetClusterParameterGroupMessage]
    }
  }

  /**
   * <p>A resize operation for the specified cluster is not found.</p>
   */
  @js.native
  trait ResizeNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Describes the result of a cluster resize operation.</p>
   */
  @js.native
  trait ResizeProgressMessage extends js.Object {
    var TargetNumberOfNodes: IntegerOptional
    var ElapsedTimeInSeconds: LongOptional
    var TargetClusterType: String
    var TargetNodeType: String
    var AvgResizeRateInMegaBytesPerSecond: DoubleOptional
    var EstimatedTimeToCompletionInSeconds: LongOptional
    var ProgressInMegaBytes: LongOptional
    var TotalResizeDataInMegaBytes: LongOptional
    var ImportTablesCompleted: ImportTablesCompleted
    var ImportTablesInProgress: ImportTablesInProgress
    var Status: String
    var ImportTablesNotStarted: ImportTablesNotStarted
  }

  object ResizeProgressMessage {
    def apply(
      TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
      ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
      TargetClusterType: js.UndefOr[String] = js.undefined,
      TargetNodeType: js.UndefOr[String] = js.undefined,
      AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
      EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
      ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
      TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
      ImportTablesCompleted: js.UndefOr[ImportTablesCompleted] = js.undefined,
      ImportTablesInProgress: js.UndefOr[ImportTablesInProgress] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      ImportTablesNotStarted: js.UndefOr[ImportTablesNotStarted] = js.undefined
    ): ResizeProgressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetNumberOfNodes" -> TargetNumberOfNodes.map { x => x: js.Any }),
        ("ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x => x: js.Any }),
        ("TargetClusterType" -> TargetClusterType.map { x => x: js.Any }),
        ("TargetNodeType" -> TargetNodeType.map { x => x: js.Any }),
        ("AvgResizeRateInMegaBytesPerSecond" -> AvgResizeRateInMegaBytesPerSecond.map { x => x: js.Any }),
        ("EstimatedTimeToCompletionInSeconds" -> EstimatedTimeToCompletionInSeconds.map { x => x: js.Any }),
        ("ProgressInMegaBytes" -> ProgressInMegaBytes.map { x => x: js.Any }),
        ("TotalResizeDataInMegaBytes" -> TotalResizeDataInMegaBytes.map { x => x: js.Any }),
        ("ImportTablesCompleted" -> ImportTablesCompleted.map { x => x: js.Any }),
        ("ImportTablesInProgress" -> ImportTablesInProgress.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("ImportTablesNotStarted" -> ImportTablesNotStarted.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResizeProgressMessage]
    }
  }

  /**
   * <p> The resource could not be found. </p>
   */
  @js.native
  trait ResourceNotFoundFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait RestoreFromClusterSnapshotMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var ClusterParameterGroupName: String
    var AllowVersionUpgrade: BooleanOptional
    var ClusterIdentifier: String
    var KmsKeyId: String
    var ElasticIp: String
    var AutomatedSnapshotRetentionPeriod: IntegerOptional
    var AvailabilityZone: String
    var ClusterSecurityGroups: ClusterSecurityGroupNameList
    var VpcSecurityGroupIds: VpcSecurityGroupIdList
    var Port: IntegerOptional
    var HsmConfigurationIdentifier: String
    var ClusterSubnetGroupName: String
    var PubliclyAccessible: BooleanOptional
    var OwnerAccount: String
    var SnapshotClusterIdentifier: String
    var HsmClientCertificateIdentifier: String
    var SnapshotIdentifier: String
  }

  object RestoreFromClusterSnapshotMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ClusterParameterGroupName: js.UndefOr[String] = js.undefined,
      AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      ElasticIp: js.UndefOr[String] = js.undefined,
      AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined,
      ClusterSubnetGroupName: js.UndefOr[String] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      OwnerAccount: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): RestoreFromClusterSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("ClusterParameterGroupName" -> ClusterParameterGroupName.map { x => x: js.Any }),
        ("AllowVersionUpgrade" -> AllowVersionUpgrade.map { x => x: js.Any }),
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any }),
        ("AutomatedSnapshotRetentionPeriod" -> AutomatedSnapshotRetentionPeriod.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("ClusterSecurityGroups" -> ClusterSecurityGroups.map { x => x: js.Any }),
        ("VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("HsmConfigurationIdentifier" -> HsmConfigurationIdentifier.map { x => x: js.Any }),
        ("ClusterSubnetGroupName" -> ClusterSubnetGroupName.map { x => x: js.Any }),
        ("PubliclyAccessible" -> PubliclyAccessible.map { x => x: js.Any }),
        ("OwnerAccount" -> OwnerAccount.map { x => x: js.Any }),
        ("SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x: js.Any }),
        ("HsmClientCertificateIdentifier" -> HsmClientCertificateIdentifier.map { x => x: js.Any }),
        ("SnapshotIdentifier" -> SnapshotIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreFromClusterSnapshotMessage]
    }
  }

  @js.native
  trait RestoreFromClusterSnapshotResult extends js.Object {
    var Cluster: Cluster
  }

  object RestoreFromClusterSnapshotResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): RestoreFromClusterSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreFromClusterSnapshotResult]
    }
  }

  /**
   * <p>Describes the status of a cluster restore action. Returns null if the cluster was not created by restoring a snapshot.</p>
   */
  @js.native
  trait RestoreStatus extends js.Object {
    var ElapsedTimeInSeconds: Long
    var EstimatedTimeToCompletionInSeconds: Long
    var ProgressInMegaBytes: Long
    var CurrentRestoreRateInMegaBytesPerSecond: Double
    var SnapshotSizeInMegaBytes: Long
    var Status: String
  }

  object RestoreStatus {
    def apply(
      ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined,
      EstimatedTimeToCompletionInSeconds: js.UndefOr[Long] = js.undefined,
      ProgressInMegaBytes: js.UndefOr[Long] = js.undefined,
      CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
      SnapshotSizeInMegaBytes: js.UndefOr[Long] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): RestoreStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x => x: js.Any }),
        ("EstimatedTimeToCompletionInSeconds" -> EstimatedTimeToCompletionInSeconds.map { x => x: js.Any }),
        ("ProgressInMegaBytes" -> ProgressInMegaBytes.map { x => x: js.Any }),
        ("CurrentRestoreRateInMegaBytesPerSecond" -> CurrentRestoreRateInMegaBytesPerSecond.map { x => x: js.Any }),
        ("SnapshotSizeInMegaBytes" -> SnapshotSizeInMegaBytes.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreStatus]
    }
  }

  /**
   * <p> ??? </p>
   */
  @js.native
  trait RevokeClusterSecurityGroupIngressMessage extends js.Object {
    var ClusterSecurityGroupName: String
    var CIDRIP: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object RevokeClusterSecurityGroupIngressMessage {
    def apply(
      ClusterSecurityGroupName: js.UndefOr[String] = js.undefined,
      CIDRIP: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): RevokeClusterSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroupName" -> ClusterSecurityGroupName.map { x => x: js.Any }),
        ("CIDRIP" -> CIDRIP.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeClusterSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: ClusterSecurityGroup
  }

  object RevokeClusterSecurityGroupIngressResult {
    def apply(
      ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
    ): RevokeClusterSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterSecurityGroup" -> ClusterSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeClusterSecurityGroupIngressResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait RevokeSnapshotAccessMessage extends js.Object {
    var SnapshotIdentifier: String
    var SnapshotClusterIdentifier: String
    var AccountWithRestoreAccess: String
  }

  object RevokeSnapshotAccessMessage {
    def apply(
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined,
      AccountWithRestoreAccess: js.UndefOr[String] = js.undefined
    ): RevokeSnapshotAccessMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotIdentifier" -> SnapshotIdentifier.map { x => x: js.Any }),
        ("SnapshotClusterIdentifier" -> SnapshotClusterIdentifier.map { x => x: js.Any }),
        ("AccountWithRestoreAccess" -> AccountWithRestoreAccess.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSnapshotAccessMessage]
    }
  }

  @js.native
  trait RevokeSnapshotAccessResult extends js.Object {
    var Snapshot: Snapshot
  }

  object RevokeSnapshotAccessResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): RevokeSnapshotAccessResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshot" -> Snapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSnapshotAccessResult]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait RotateEncryptionKeyMessage extends js.Object {
    var ClusterIdentifier: String
  }

  object RotateEncryptionKeyMessage {
    def apply(
      ClusterIdentifier: js.UndefOr[String] = js.undefined
    ): RotateEncryptionKeyMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateEncryptionKeyMessage]
    }
  }

  @js.native
  trait RotateEncryptionKeyResult extends js.Object {
    var Cluster: Cluster
  }

  object RotateEncryptionKeyResult {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined
    ): RotateEncryptionKeyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Cluster" -> Cluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateEncryptionKeyResult]
    }
  }

  /**
   * <p>Amazon SNS has responded that there is a problem with the specified Amazon SNS topic.</p>
   */
  @js.native
  trait SNSInvalidTopicFaultException extends js.Object {

  }

  /**
   * <p>You do not have permission to publish to the specified Amazon SNS topic.</p>
   */
  @js.native
  trait SNSNoAuthorizationFaultException extends js.Object {

  }

  /**
   * <p>An Amazon SNS topic with the specified Amazon Resource Name (ARN) does not exist.</p>
   */
  @js.native
  trait SNSTopicArnNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Describes a snapshot.</p>
   */
  @js.native
  trait Snapshot extends js.Object {
    var EstimatedSecondsToCompletion: Long
    var SourceRegion: String
    var ElapsedTimeInSeconds: Long
    var ClusterIdentifier: String
    var DBName: String
    var CurrentBackupRateInMegaBytesPerSecond: Double
    var ActualIncrementalBackupSizeInMegaBytes: Double
    var TotalBackupSizeInMegaBytes: Double
    var ClusterVersion: String
    var KmsKeyId: String
    var NodeType: String
    var SnapshotCreateTime: TStamp
    var SnapshotType: String
    var MasterUsername: String
    var AvailabilityZone: String
    var BackupProgressInMegaBytes: Double
    var Encrypted: Boolean
    var AccountsWithRestoreAccess: AccountsWithRestoreAccessList
    var Port: Integer
    var NumberOfNodes: Integer
    var ClusterCreateTime: TStamp
    var EncryptedWithHSM: Boolean
    var Tags: TagList
    var OwnerAccount: String
    var Status: String
    var SnapshotIdentifier: String
    var VpcId: String
  }

  object Snapshot {
    def apply(
      EstimatedSecondsToCompletion: js.UndefOr[Long] = js.undefined,
      SourceRegion: js.UndefOr[String] = js.undefined,
      ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined,
      ClusterIdentifier: js.UndefOr[String] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
      ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
      TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
      ClusterVersion: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      NodeType: js.UndefOr[String] = js.undefined,
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      BackupProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList] = js.undefined,
      Port: js.UndefOr[Integer] = js.undefined,
      NumberOfNodes: js.UndefOr[Integer] = js.undefined,
      ClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      EncryptedWithHSM: js.UndefOr[Boolean] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      OwnerAccount: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      SnapshotIdentifier: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EstimatedSecondsToCompletion" -> EstimatedSecondsToCompletion.map { x => x: js.Any }),
        ("SourceRegion" -> SourceRegion.map { x => x: js.Any }),
        ("ElapsedTimeInSeconds" -> ElapsedTimeInSeconds.map { x => x: js.Any }),
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any }),
        ("DBName" -> DBName.map { x => x: js.Any }),
        ("CurrentBackupRateInMegaBytesPerSecond" -> CurrentBackupRateInMegaBytesPerSecond.map { x => x: js.Any }),
        ("ActualIncrementalBackupSizeInMegaBytes" -> ActualIncrementalBackupSizeInMegaBytes.map { x => x: js.Any }),
        ("TotalBackupSizeInMegaBytes" -> TotalBackupSizeInMegaBytes.map { x => x: js.Any }),
        ("ClusterVersion" -> ClusterVersion.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("NodeType" -> NodeType.map { x => x: js.Any }),
        ("SnapshotCreateTime" -> SnapshotCreateTime.map { x => x: js.Any }),
        ("SnapshotType" -> SnapshotType.map { x => x: js.Any }),
        ("MasterUsername" -> MasterUsername.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("BackupProgressInMegaBytes" -> BackupProgressInMegaBytes.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("AccountsWithRestoreAccess" -> AccountsWithRestoreAccess.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("NumberOfNodes" -> NumberOfNodes.map { x => x: js.Any }),
        ("ClusterCreateTime" -> ClusterCreateTime.map { x => x: js.Any }),
        ("EncryptedWithHSM" -> EncryptedWithHSM.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("OwnerAccount" -> OwnerAccount.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("SnapshotIdentifier" -> SnapshotIdentifier.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Snapshot]
    }
  }

  /**
   * <p> The cluster already has cross-region snapshot copy disabled. </p>
   */
  @js.native
  trait SnapshotCopyAlreadyDisabledFaultException extends js.Object {

  }

  /**
   * <p> The cluster already has cross-region snapshot copy enabled. </p>
   */
  @js.native
  trait SnapshotCopyAlreadyEnabledFaultException extends js.Object {

  }

  /**
   * <p> Cross-region snapshot copy was temporarily disabled. Try your request again. </p>
   */
  @js.native
  trait SnapshotCopyDisabledFaultException extends js.Object {

  }

  /**
   * <p> Contains the output from the <a>DescribeClusterSnapshots</a> action. </p>
   */
  @js.native
  trait SnapshotMessage extends js.Object {
    var Marker: String
    var Snapshots: SnapshotList
  }

  object SnapshotMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Snapshots: js.UndefOr[SnapshotList] = js.undefined
    ): SnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Snapshots" -> Snapshots.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotMessage]
    }
  }

  /**
   * <p>The specified Amazon Redshift event source could not be found.</p>
   */
  @js.native
  trait SourceNotFoundFaultException extends js.Object {

  }


  object SourceTypeEnum {
    val cluster = "cluster"
    val `cluster-parameter-group` = "cluster-parameter-group"
    val `cluster-security-group` = "cluster-security-group"
    val `cluster-snapshot` = "cluster-snapshot"

    val values = IndexedSeq(cluster, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`)
  }

  /**
   * <p> Describes a subnet. </p>
   */
  @js.native
  trait Subnet extends js.Object {
    var SubnetIdentifier: String
    var SubnetAvailabilityZone: AvailabilityZone
    var SubnetStatus: String
  }

  object Subnet {
    def apply(
      SubnetIdentifier: js.UndefOr[String] = js.undefined,
      SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      SubnetStatus: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetIdentifier" -> SubnetIdentifier.map { x => x: js.Any }),
        ("SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x: js.Any }),
        ("SubnetStatus" -> SubnetStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p> A specified subnet is already in use by another cluster. </p>
   */
  @js.native
  trait SubnetAlreadyInUseException extends js.Object {

  }

  /**
   * <p>There is already an existing event notification subscription with the specified name.</p>
   */
  @js.native
  trait SubscriptionAlreadyExistFaultException extends js.Object {

  }

  /**
   * <p>The value specified for the event category was not one of the allowed values, or it specified a category that does not apply to the specified source type. The allowed values are Configuration, Management, Monitoring, and Security.</p>
   */
  @js.native
  trait SubscriptionCategoryNotFoundFaultException extends js.Object {

  }

  /**
   * <p>An Amazon Redshift event with the specified event ID does not exist.</p>
   */
  @js.native
  trait SubscriptionEventIdNotFoundFaultException extends js.Object {

  }

  /**
   * <p>An Amazon Redshift event notification subscription with the specified name does not exist.</p>
   */
  @js.native
  trait SubscriptionNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The value specified for the event severity was not one of the allowed values, or it specified a severity that does not apply to the specified source type. The allowed values are ERROR and INFO.</p>
   */
  @js.native
  trait SubscriptionSeverityNotFoundFaultException extends js.Object {

  }

  /**
   * <p>A tag consisting of a name/value pair for a resource.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: String
    var Value: String
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p> The request exceeds the limit of 10 tags for the resource. </p>
   */
  @js.native
  trait TagLimitExceededFaultException extends js.Object {

  }

  /**
   * <p>A tag and its associated resource. </p>
   */
  @js.native
  trait TaggedResource extends js.Object {
    var Tag: Tag
    var ResourceName: String
    var ResourceType: String
  }

  object TaggedResource {
    def apply(
      Tag: js.UndefOr[Tag] = js.undefined,
      ResourceName: js.UndefOr[String] = js.undefined,
      ResourceType: js.UndefOr[String] = js.undefined
    ): TaggedResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tag" -> Tag.map { x => x: js.Any }),
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaggedResource]
    }
  }

  /**
   * <p> Contains the output from the <code>DescribeTags</code> action. </p>
   */
  @js.native
  trait TaggedResourceListMessage extends js.Object {
    var TaggedResources: TaggedResourceList
    var Marker: String
  }

  object TaggedResourceListMessage {
    def apply(
      TaggedResources: js.UndefOr[TaggedResourceList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): TaggedResourceListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TaggedResources" -> TaggedResources.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaggedResourceListMessage]
    }
  }

  /**
   * <p> Your account is not authorized to perform the requested operation. </p>
   */
  @js.native
  trait UnauthorizedOperationException extends js.Object {

  }

  /**
   * <p> The specified region is incorrect or does not exist. </p>
   */
  @js.native
  trait UnknownSnapshotCopyRegionFaultException extends js.Object {

  }

  /**
   * <p> A request option was specified that is not supported. </p>
   */
  @js.native
  trait UnsupportedOptionFaultException extends js.Object {

  }

  /**
   * <p>Describes the members of a VPC security group.</p>
   */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var VpcSecurityGroupId: String
    var Status: String
  }

  object VpcSecurityGroupMembership {
    def apply(
      VpcSecurityGroupId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): VpcSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcSecurityGroupId" -> VpcSecurityGroupId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
