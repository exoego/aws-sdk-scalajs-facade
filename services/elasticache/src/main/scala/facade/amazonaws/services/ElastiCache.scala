package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object elasticache {
  type AZMode                              = String
  type AllowedNodeGroupId                  = String
  type AutomaticFailoverStatus             = String
  type AvailabilityZonesList               = js.Array[String]
  type BooleanOptional                     = Boolean
  type CacheClusterList                    = js.Array[CacheCluster]
  type CacheEngineVersionList              = js.Array[CacheEngineVersion]
  type CacheNodeIdsList                    = js.Array[String]
  type CacheNodeList                       = js.Array[CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList      = js.Array[CacheNodeTypeSpecificValue]
  type CacheParameterGroupList             = js.Array[CacheParameterGroup]
  type CacheSecurityGroupMembershipList    = js.Array[CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList          = js.Array[String]
  type CacheSecurityGroups                 = js.Array[CacheSecurityGroup]
  type CacheSubnetGroups                   = js.Array[CacheSubnetGroup]
  type ChangeType                          = String
  type ClusterIdList                       = js.Array[String]
  type EC2SecurityGroupList                = js.Array[EC2SecurityGroup]
  type EventList                           = js.Array[Event]
  type IntegerOptional                     = Int
  type KeyList                             = js.Array[String]
  type NodeGroupConfigurationList          = js.Array[NodeGroupConfiguration]
  type NodeGroupList                       = js.Array[NodeGroup]
  type NodeGroupMemberList                 = js.Array[NodeGroupMember]
  type NodeGroupsToRemoveList              = js.Array[AllowedNodeGroupId]
  type NodeGroupsToRetainList              = js.Array[AllowedNodeGroupId]
  type NodeSnapshotList                    = js.Array[NodeSnapshot]
  type NodeTypeList                        = js.Array[String]
  type ParameterNameValueList              = js.Array[ParameterNameValue]
  type ParametersList                      = js.Array[Parameter]
  type PendingAutomaticFailoverStatus      = String
  type PreferredAvailabilityZoneList       = js.Array[String]
  type RecurringChargeList                 = js.Array[RecurringCharge]
  type RemoveReplicasList                  = js.Array[String]
  type ReplicaConfigurationList            = js.Array[ConfigureShard]
  type ReplicationGroupList                = js.Array[ReplicationGroup]
  type ReservedCacheNodeList               = js.Array[ReservedCacheNode]
  type ReservedCacheNodesOfferingList      = js.Array[ReservedCacheNodesOffering]
  type ReshardingConfigurationList         = js.Array[ReshardingConfiguration]
  type SecurityGroupIdsList                = js.Array[String]
  type SecurityGroupMembershipList         = js.Array[SecurityGroupMembership]
  type SnapshotArnsList                    = js.Array[String]
  type SnapshotList                        = js.Array[Snapshot]
  type SourceType                          = String
  type SubnetIdentifierList                = js.Array[String]
  type SubnetList                          = js.Array[Subnet]
  type TStamp                              = js.Date
  type TagList                             = js.Array[Tag]

  implicit final class ElastiCacheOps(val service: ElastiCache) extends AnyVal {

    def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[TagListMessage] =
      service.addTagsToResource(params).promise.toFuture
    def authorizeCacheSecurityGroupIngressFuture(
        params: AuthorizeCacheSecurityGroupIngressMessage
    ): Future[AuthorizeCacheSecurityGroupIngressResult] =
      service.authorizeCacheSecurityGroupIngress(params).promise.toFuture
    def copySnapshotFuture(params: CopySnapshotMessage): Future[CopySnapshotResult] =
      service.copySnapshot(params).promise.toFuture
    def createCacheClusterFuture(params: CreateCacheClusterMessage): Future[CreateCacheClusterResult] =
      service.createCacheCluster(params).promise.toFuture
    def createCacheParameterGroupFuture(
        params: CreateCacheParameterGroupMessage
    ): Future[CreateCacheParameterGroupResult] = service.createCacheParameterGroup(params).promise.toFuture
    def createCacheSecurityGroupFuture(
        params: CreateCacheSecurityGroupMessage
    ): Future[CreateCacheSecurityGroupResult] = service.createCacheSecurityGroup(params).promise.toFuture
    def createCacheSubnetGroupFuture(params: CreateCacheSubnetGroupMessage): Future[CreateCacheSubnetGroupResult] =
      service.createCacheSubnetGroup(params).promise.toFuture
    def createReplicationGroupFuture(params: CreateReplicationGroupMessage): Future[CreateReplicationGroupResult] =
      service.createReplicationGroup(params).promise.toFuture
    def createSnapshotFuture(params: CreateSnapshotMessage): Future[CreateSnapshotResult] =
      service.createSnapshot(params).promise.toFuture
    def decreaseReplicaCountFuture(params: DecreaseReplicaCountMessage): Future[DecreaseReplicaCountResult] =
      service.decreaseReplicaCount(params).promise.toFuture
    def deleteCacheClusterFuture(params: DeleteCacheClusterMessage): Future[DeleteCacheClusterResult] =
      service.deleteCacheCluster(params).promise.toFuture
    def deleteCacheParameterGroupFuture(params: DeleteCacheParameterGroupMessage): Future[js.Object] =
      service.deleteCacheParameterGroup(params).promise.toFuture
    def deleteCacheSecurityGroupFuture(params: DeleteCacheSecurityGroupMessage): Future[js.Object] =
      service.deleteCacheSecurityGroup(params).promise.toFuture
    def deleteCacheSubnetGroupFuture(params: DeleteCacheSubnetGroupMessage): Future[js.Object] =
      service.deleteCacheSubnetGroup(params).promise.toFuture
    def deleteReplicationGroupFuture(params: DeleteReplicationGroupMessage): Future[DeleteReplicationGroupResult] =
      service.deleteReplicationGroup(params).promise.toFuture
    def deleteSnapshotFuture(params: DeleteSnapshotMessage): Future[DeleteSnapshotResult] =
      service.deleteSnapshot(params).promise.toFuture
    def describeCacheClustersFuture(params: DescribeCacheClustersMessage): Future[CacheClusterMessage] =
      service.describeCacheClusters(params).promise.toFuture
    def describeCacheEngineVersionsFuture(
        params: DescribeCacheEngineVersionsMessage
    ): Future[CacheEngineVersionMessage] = service.describeCacheEngineVersions(params).promise.toFuture
    def describeCacheParameterGroupsFuture(
        params: DescribeCacheParameterGroupsMessage
    ): Future[CacheParameterGroupsMessage] = service.describeCacheParameterGroups(params).promise.toFuture
    def describeCacheParametersFuture(params: DescribeCacheParametersMessage): Future[CacheParameterGroupDetails] =
      service.describeCacheParameters(params).promise.toFuture
    def describeCacheSecurityGroupsFuture(
        params: DescribeCacheSecurityGroupsMessage
    ): Future[CacheSecurityGroupMessage] = service.describeCacheSecurityGroups(params).promise.toFuture
    def describeCacheSubnetGroupsFuture(params: DescribeCacheSubnetGroupsMessage): Future[CacheSubnetGroupMessage] =
      service.describeCacheSubnetGroups(params).promise.toFuture
    def describeEngineDefaultParametersFuture(
        params: DescribeEngineDefaultParametersMessage
    ): Future[DescribeEngineDefaultParametersResult] = service.describeEngineDefaultParameters(params).promise.toFuture
    def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] =
      service.describeEvents(params).promise.toFuture
    def describeReplicationGroupsFuture(params: DescribeReplicationGroupsMessage): Future[ReplicationGroupMessage] =
      service.describeReplicationGroups(params).promise.toFuture
    def describeReservedCacheNodesFuture(params: DescribeReservedCacheNodesMessage): Future[ReservedCacheNodeMessage] =
      service.describeReservedCacheNodes(params).promise.toFuture
    def describeReservedCacheNodesOfferingsFuture(
        params: DescribeReservedCacheNodesOfferingsMessage
    ): Future[ReservedCacheNodesOfferingMessage] = service.describeReservedCacheNodesOfferings(params).promise.toFuture
    def describeSnapshotsFuture(params: DescribeSnapshotsMessage): Future[DescribeSnapshotsListMessage] =
      service.describeSnapshots(params).promise.toFuture
    def increaseReplicaCountFuture(params: IncreaseReplicaCountMessage): Future[IncreaseReplicaCountResult] =
      service.increaseReplicaCount(params).promise.toFuture
    def listAllowedNodeTypeModificationsFuture(
        params: ListAllowedNodeTypeModificationsMessage
    ): Future[AllowedNodeTypeModificationsMessage] = service.listAllowedNodeTypeModifications(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[TagListMessage] =
      service.listTagsForResource(params).promise.toFuture
    def modifyCacheClusterFuture(params: ModifyCacheClusterMessage): Future[ModifyCacheClusterResult] =
      service.modifyCacheCluster(params).promise.toFuture
    def modifyCacheParameterGroupFuture(
        params: ModifyCacheParameterGroupMessage
    ): Future[CacheParameterGroupNameMessage] = service.modifyCacheParameterGroup(params).promise.toFuture
    def modifyCacheSubnetGroupFuture(params: ModifyCacheSubnetGroupMessage): Future[ModifyCacheSubnetGroupResult] =
      service.modifyCacheSubnetGroup(params).promise.toFuture
    def modifyReplicationGroupFuture(params: ModifyReplicationGroupMessage): Future[ModifyReplicationGroupResult] =
      service.modifyReplicationGroup(params).promise.toFuture
    def modifyReplicationGroupShardConfigurationFuture(
        params: ModifyReplicationGroupShardConfigurationMessage
    ): Future[ModifyReplicationGroupShardConfigurationResult] =
      service.modifyReplicationGroupShardConfiguration(params).promise.toFuture
    def purchaseReservedCacheNodesOfferingFuture(
        params: PurchaseReservedCacheNodesOfferingMessage
    ): Future[PurchaseReservedCacheNodesOfferingResult] =
      service.purchaseReservedCacheNodesOffering(params).promise.toFuture
    def rebootCacheClusterFuture(params: RebootCacheClusterMessage): Future[RebootCacheClusterResult] =
      service.rebootCacheCluster(params).promise.toFuture
    def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[TagListMessage] =
      service.removeTagsFromResource(params).promise.toFuture
    def resetCacheParameterGroupFuture(
        params: ResetCacheParameterGroupMessage
    ): Future[CacheParameterGroupNameMessage] = service.resetCacheParameterGroup(params).promise.toFuture
    def revokeCacheSecurityGroupIngressFuture(
        params: RevokeCacheSecurityGroupIngressMessage
    ): Future[RevokeCacheSecurityGroupIngressResult] = service.revokeCacheSecurityGroupIngress(params).promise.toFuture
    def testFailoverFuture(params: TestFailoverMessage): Future[TestFailoverResult] =
      service.testFailover(params).promise.toFuture
  }
}

package elasticache {
  @js.native
  @JSImport("aws-sdk", "ElastiCache")
  class ElastiCache() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceMessage): Request[TagListMessage] = js.native
    def authorizeCacheSecurityGroupIngress(
        params: AuthorizeCacheSecurityGroupIngressMessage
    ): Request[AuthorizeCacheSecurityGroupIngressResult]                                         = js.native
    def copySnapshot(params: CopySnapshotMessage): Request[CopySnapshotResult]                   = js.native
    def createCacheCluster(params: CreateCacheClusterMessage): Request[CreateCacheClusterResult] = js.native
    def createCacheParameterGroup(params: CreateCacheParameterGroupMessage): Request[CreateCacheParameterGroupResult] =
      js.native
    def createCacheSecurityGroup(params: CreateCacheSecurityGroupMessage): Request[CreateCacheSecurityGroupResult] =
      js.native
    def createCacheSubnetGroup(params: CreateCacheSubnetGroupMessage): Request[CreateCacheSubnetGroupResult] = js.native
    def createReplicationGroup(params: CreateReplicationGroupMessage): Request[CreateReplicationGroupResult] = js.native
    def createSnapshot(params: CreateSnapshotMessage): Request[CreateSnapshotResult]                         = js.native
    def decreaseReplicaCount(params: DecreaseReplicaCountMessage): Request[DecreaseReplicaCountResult]       = js.native
    def deleteCacheCluster(params: DeleteCacheClusterMessage): Request[DeleteCacheClusterResult]             = js.native
    def deleteCacheParameterGroup(params: DeleteCacheParameterGroupMessage): Request[js.Object]              = js.native
    def deleteCacheSecurityGroup(params: DeleteCacheSecurityGroupMessage): Request[js.Object]                = js.native
    def deleteCacheSubnetGroup(params: DeleteCacheSubnetGroupMessage): Request[js.Object]                    = js.native
    def deleteReplicationGroup(params: DeleteReplicationGroupMessage): Request[DeleteReplicationGroupResult] = js.native
    def deleteSnapshot(params: DeleteSnapshotMessage): Request[DeleteSnapshotResult]                         = js.native
    def describeCacheClusters(params: DescribeCacheClustersMessage): Request[CacheClusterMessage]            = js.native
    def describeCacheEngineVersions(params: DescribeCacheEngineVersionsMessage): Request[CacheEngineVersionMessage] =
      js.native
    def describeCacheParameterGroups(
        params: DescribeCacheParameterGroupsMessage
    ): Request[CacheParameterGroupsMessage]                                                                  = js.native
    def describeCacheParameters(params: DescribeCacheParametersMessage): Request[CacheParameterGroupDetails] = js.native
    def describeCacheSecurityGroups(params: DescribeCacheSecurityGroupsMessage): Request[CacheSecurityGroupMessage] =
      js.native
    def describeCacheSubnetGroups(params: DescribeCacheSubnetGroupsMessage): Request[CacheSubnetGroupMessage] =
      js.native
    def describeEngineDefaultParameters(
        params: DescribeEngineDefaultParametersMessage
    ): Request[DescribeEngineDefaultParametersResult]                         = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeReplicationGroups(params: DescribeReplicationGroupsMessage): Request[ReplicationGroupMessage] =
      js.native
    def describeReservedCacheNodes(params: DescribeReservedCacheNodesMessage): Request[ReservedCacheNodeMessage] =
      js.native
    def describeReservedCacheNodesOfferings(
        params: DescribeReservedCacheNodesOfferingsMessage
    ): Request[ReservedCacheNodesOfferingMessage]                                                      = js.native
    def describeSnapshots(params: DescribeSnapshotsMessage): Request[DescribeSnapshotsListMessage]     = js.native
    def increaseReplicaCount(params: IncreaseReplicaCountMessage): Request[IncreaseReplicaCountResult] = js.native
    def listAllowedNodeTypeModifications(
        params: ListAllowedNodeTypeModificationsMessage
    ): Request[AllowedNodeTypeModificationsMessage]                                              = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage]         = js.native
    def modifyCacheCluster(params: ModifyCacheClusterMessage): Request[ModifyCacheClusterResult] = js.native
    def modifyCacheParameterGroup(params: ModifyCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage] =
      js.native
    def modifyCacheSubnetGroup(params: ModifyCacheSubnetGroupMessage): Request[ModifyCacheSubnetGroupResult] = js.native
    def modifyReplicationGroup(params: ModifyReplicationGroupMessage): Request[ModifyReplicationGroupResult] = js.native
    def modifyReplicationGroupShardConfiguration(
        params: ModifyReplicationGroupShardConfigurationMessage
    ): Request[ModifyReplicationGroupShardConfigurationResult] = js.native
    def purchaseReservedCacheNodesOffering(
        params: PurchaseReservedCacheNodesOfferingMessage
    ): Request[PurchaseReservedCacheNodesOfferingResult]                                         = js.native
    def rebootCacheCluster(params: RebootCacheClusterMessage): Request[RebootCacheClusterResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[TagListMessage]   = js.native
    def resetCacheParameterGroup(params: ResetCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage] =
      js.native
    def revokeCacheSecurityGroupIngress(
        params: RevokeCacheSecurityGroupIngressMessage
    ): Request[RevokeCacheSecurityGroupIngressResult]                          = js.native
    def testFailover(params: TestFailoverMessage): Request[TestFailoverResult] = js.native
  }

  object AZModeEnum {
    val `single-az` = "single-az"
    val `cross-az`  = "cross-az"

    val values = IndexedSeq(`single-az`, `cross-az`)
  }

  /**
    * Represents the input of an AddTagsToResource operation.
    */
  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object AddTagsToResourceMessage {
    def apply(
        ResourceName: String,
        Tags: TagList
    ): AddTagsToResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceMessage]
    }
  }

  /**
    * Represents the allowed node types you can use to modify your cluster or replication group.
    */
  @js.native
  trait AllowedNodeTypeModificationsMessage extends js.Object {
    var ScaleUpModifications: js.UndefOr[NodeTypeList]
  }

  object AllowedNodeTypeModificationsMessage {
    def apply(
        ScaleUpModifications: js.UndefOr[NodeTypeList] = js.undefined
    ): AllowedNodeTypeModificationsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      ScaleUpModifications.foreach(__v => __obj.update("ScaleUpModifications", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllowedNodeTypeModificationsMessage]
    }
  }

  /**
    * Represents the input of an AuthorizeCacheSecurityGroupIngress operation.
    */
  @js.native
  trait AuthorizeCacheSecurityGroupIngressMessage extends js.Object {
    var CacheSecurityGroupName: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object AuthorizeCacheSecurityGroupIngressMessage {
    def apply(
        CacheSecurityGroupName: String,
        EC2SecurityGroupName: String,
        EC2SecurityGroupOwnerId: String
    ): AuthorizeCacheSecurityGroupIngressMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheSecurityGroupName"  -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupName"    -> EC2SecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  object AuthorizeCacheSecurityGroupIngressResult {
    def apply(
        CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): AuthorizeCacheSecurityGroupIngressResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSecurityGroup.foreach(__v => __obj.update("CacheSecurityGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressResult]
    }
  }

  object AutomaticFailoverStatusEnum {
    val enabled   = "enabled"
    val disabled  = "disabled"
    val enabling  = "enabling"
    val disabling = "disabling"

    val values = IndexedSeq(enabled, disabled, enabling, disabling)
  }

  /**
    * Describes an Availability Zone in which the cluster is launched.
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZone {
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /**
    * Contains all of the attributes of a specific cluster.
    */
  @js.native
  trait CacheCluster extends js.Object {
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenEnabled: js.UndefOr[BooleanOptional]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var CacheClusterCreateTime: js.UndefOr[TStamp]
    var CacheClusterId: js.UndefOr[String]
    var CacheClusterStatus: js.UndefOr[String]
    var CacheNodeType: js.UndefOr[String]
    var CacheNodes: js.UndefOr[CacheNodeList]
    var CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus]
    var CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList]
    var CacheSubnetGroupName: js.UndefOr[String]
    var ClientDownloadLandingPage: js.UndefOr[String]
    var ConfigurationEndpoint: js.UndefOr[Endpoint]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[SecurityGroupMembershipList]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional]
  }

  object CacheCluster {
    def apply(
        AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheClusterStatus: js.UndefOr[String] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        CacheNodes: js.UndefOr[CacheNodeList] = js.undefined,
        CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus] = js.undefined,
        CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList] = js.undefined,
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        ClientDownloadLandingPage: js.UndefOr[String] = js.undefined,
        ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined,
        NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
        PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
        PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
    ): CacheCluster = {
      val __obj = js.Dictionary.empty[js.Any]
      AtRestEncryptionEnabled.foreach(__v => __obj.update("AtRestEncryptionEnabled", __v.asInstanceOf[js.Any]))
      AuthTokenEnabled.foreach(__v => __obj.update("AuthTokenEnabled", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      CacheClusterCreateTime.foreach(__v => __obj.update("CacheClusterCreateTime", __v.asInstanceOf[js.Any]))
      CacheClusterId.foreach(__v => __obj.update("CacheClusterId", __v.asInstanceOf[js.Any]))
      CacheClusterStatus.foreach(__v => __obj.update("CacheClusterStatus", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      CacheNodes.foreach(__v => __obj.update("CacheNodes", __v.asInstanceOf[js.Any]))
      CacheParameterGroup.foreach(__v => __obj.update("CacheParameterGroup", __v.asInstanceOf[js.Any]))
      CacheSecurityGroups.foreach(__v => __obj.update("CacheSecurityGroups", __v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.update("CacheSubnetGroupName", __v.asInstanceOf[js.Any]))
      ClientDownloadLandingPage.foreach(__v => __obj.update("ClientDownloadLandingPage", __v.asInstanceOf[js.Any]))
      ConfigurationEndpoint.foreach(__v => __obj.update("ConfigurationEndpoint", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      NotificationConfiguration.foreach(__v => __obj.update("NotificationConfiguration", __v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.update("NumCacheNodes", __v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.update("PendingModifiedValues", __v.asInstanceOf[js.Any]))
      PreferredAvailabilityZone.foreach(__v => __obj.update("PreferredAvailabilityZone", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.update("ReplicationGroupId", __v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.update("SecurityGroups", __v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.update("SnapshotRetentionLimit", __v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.update("SnapshotWindow", __v.asInstanceOf[js.Any]))
      TransitEncryptionEnabled.foreach(__v => __obj.update("TransitEncryptionEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheCluster]
    }
  }

  /**
    * Represents the output of a <code>DescribeCacheClusters</code> operation.
    */
  @js.native
  trait CacheClusterMessage extends js.Object {
    var CacheClusters: js.UndefOr[CacheClusterList]
    var Marker: js.UndefOr[String]
  }

  object CacheClusterMessage {
    def apply(
        CacheClusters: js.UndefOr[CacheClusterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheClusterMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheClusters.foreach(__v => __obj.update("CacheClusters", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheClusterMessage]
    }
  }

  /**
    * Provides all of the details about a particular cache engine version.
    */
  @js.native
  trait CacheEngineVersion extends js.Object {
    var CacheEngineDescription: js.UndefOr[String]
    var CacheEngineVersionDescription: js.UndefOr[String]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
  }

  object CacheEngineVersion {
    def apply(
        CacheEngineDescription: js.UndefOr[String] = js.undefined,
        CacheEngineVersionDescription: js.UndefOr[String] = js.undefined,
        CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined
    ): CacheEngineVersion = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheEngineDescription.foreach(__v => __obj.update("CacheEngineDescription", __v.asInstanceOf[js.Any]))
      CacheEngineVersionDescription.foreach(
        __v => __obj.update("CacheEngineVersionDescription", __v.asInstanceOf[js.Any])
      )
      CacheParameterGroupFamily.foreach(__v => __obj.update("CacheParameterGroupFamily", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheEngineVersion]
    }
  }

  /**
    * Represents the output of a <a>DescribeCacheEngineVersions</a> operation.
    */
  @js.native
  trait CacheEngineVersionMessage extends js.Object {
    var CacheEngineVersions: js.UndefOr[CacheEngineVersionList]
    var Marker: js.UndefOr[String]
  }

  object CacheEngineVersionMessage {
    def apply(
        CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheEngineVersionMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheEngineVersions.foreach(__v => __obj.update("CacheEngineVersions", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheEngineVersionMessage]
    }
  }

  /**
    * Represents an individual cache node within a cluster. Each cache node runs its own instance of the cluster's protocol-compliant caching software - either Memcached or Redis.
    *  The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.
    * * General purpose:
    * <li> Current generation:
    *  ```T2 node types:``` <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
    *  ```M3 node types:``` <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
    *  ```M4 node types:``` <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
    *  * Previous generation: (not recommended)
    *  ```T1 node types:``` <code>cache.t1.micro</code>
    *  ```M1 node types:``` <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
    * </li> * Compute optimized:
    * <li> Previous generation: (not recommended)
    *  ```C1 node types:``` <code>cache.c1.xlarge</code>
    * </li> * Memory optimized:
    * <li> Current generation:
    *  ```R3 node types:``` <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
    *  ```R4 node types;``` <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
    *  * Previous generation: (not recommended)
    *  ```M2 node types:``` <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
    * </li>```Notes:```
    * * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
    *  * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
    *  * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
    *  * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
    * For a complete listing of node types and specifications, see:
    * * [[http://aws.amazon.com/elasticache/details|Amazon ElastiCache Product Features and Details]]
    *  * [[http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific|Cache Node Type-Specific Parameters for Memcached]]
    *  * [[http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific|Cache Node Type-Specific Parameters for Redis]]
    */
  @js.native
  trait CacheNode extends js.Object {
    var CacheNodeCreateTime: js.UndefOr[TStamp]
    var CacheNodeId: js.UndefOr[String]
    var CacheNodeStatus: js.UndefOr[String]
    var CustomerAvailabilityZone: js.UndefOr[String]
    var Endpoint: js.UndefOr[Endpoint]
    var ParameterGroupStatus: js.UndefOr[String]
    var SourceCacheNodeId: js.UndefOr[String]
  }

  object CacheNode {
    def apply(
        CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined,
        CacheNodeId: js.UndefOr[String] = js.undefined,
        CacheNodeStatus: js.UndefOr[String] = js.undefined,
        CustomerAvailabilityZone: js.UndefOr[String] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        ParameterGroupStatus: js.UndefOr[String] = js.undefined,
        SourceCacheNodeId: js.UndefOr[String] = js.undefined
    ): CacheNode = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeCreateTime.foreach(__v => __obj.update("CacheNodeCreateTime", __v.asInstanceOf[js.Any]))
      CacheNodeId.foreach(__v => __obj.update("CacheNodeId", __v.asInstanceOf[js.Any]))
      CacheNodeStatus.foreach(__v => __obj.update("CacheNodeStatus", __v.asInstanceOf[js.Any]))
      CustomerAvailabilityZone.foreach(__v => __obj.update("CustomerAvailabilityZone", __v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      ParameterGroupStatus.foreach(__v => __obj.update("ParameterGroupStatus", __v.asInstanceOf[js.Any]))
      SourceCacheNodeId.foreach(__v => __obj.update("SourceCacheNodeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheNode]
    }
  }

  /**
    * A parameter that has a different value for each cache node type it is applied to. For example, in a Redis cluster, a <code>cache.m1.large</code> cache node type would have a larger <code>maxmemory</code> value than a <code>cache.m1.small</code> type.
    */
  @js.native
  trait CacheNodeTypeSpecificParameter extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var CacheNodeTypeSpecificValues: js.UndefOr[CacheNodeTypeSpecificValueList]
    var ChangeType: js.UndefOr[ChangeType]
    var DataType: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var IsModifiable: js.UndefOr[Boolean]
    var MinimumEngineVersion: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
    var Source: js.UndefOr[String]
  }

  object CacheNodeTypeSpecificParameter {
    def apply(
        AllowedValues: js.UndefOr[String] = js.undefined,
        CacheNodeTypeSpecificValues: js.UndefOr[CacheNodeTypeSpecificValueList] = js.undefined,
        ChangeType: js.UndefOr[ChangeType] = js.undefined,
        DataType: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IsModifiable: js.UndefOr[Boolean] = js.undefined,
        MinimumEngineVersion: js.UndefOr[String] = js.undefined,
        ParameterName: js.UndefOr[String] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): CacheNodeTypeSpecificParameter = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowedValues.foreach(__v => __obj.update("AllowedValues", __v.asInstanceOf[js.Any]))
      CacheNodeTypeSpecificValues.foreach(__v => __obj.update("CacheNodeTypeSpecificValues", __v.asInstanceOf[js.Any]))
      ChangeType.foreach(__v => __obj.update("ChangeType", __v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.update("DataType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IsModifiable.foreach(__v => __obj.update("IsModifiable", __v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.update("MinimumEngineVersion", __v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.update("ParameterName", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheNodeTypeSpecificParameter]
    }
  }

  /**
    * A value that applies only to a certain cache node type.
    */
  @js.native
  trait CacheNodeTypeSpecificValue extends js.Object {
    var CacheNodeType: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object CacheNodeTypeSpecificValue {
    def apply(
        CacheNodeType: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): CacheNodeTypeSpecificValue = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheNodeTypeSpecificValue]
    }
  }

  /**
    * Represents the output of a <code>CreateCacheParameterGroup</code> operation.
    */
  @js.native
  trait CacheParameterGroup extends js.Object {
    var CacheParameterGroupFamily: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object CacheParameterGroup {
    def apply(
        CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined
    ): CacheParameterGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheParameterGroupFamily.foreach(__v => __obj.update("CacheParameterGroupFamily", __v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheParameterGroup]
    }
  }

  /**
    * Represents the output of a <code>DescribeCacheParameters</code> operation.
    */
  @js.native
  trait CacheParameterGroupDetails extends js.Object {
    var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object CacheParameterGroupDetails {
    def apply(
        CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): CacheParameterGroupDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeTypeSpecificParameters.foreach(
        __v => __obj.update("CacheNodeTypeSpecificParameters", __v.asInstanceOf[js.Any])
      )
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheParameterGroupDetails]
    }
  }

  /**
    * Represents the output of one of the following operations:
    * * <code>ModifyCacheParameterGroup</code>
    *  * <code>ResetCacheParameterGroup</code>
    */
  @js.native
  trait CacheParameterGroupNameMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
  }

  object CacheParameterGroupNameMessage {
    def apply(
        CacheParameterGroupName: js.UndefOr[String] = js.undefined
    ): CacheParameterGroupNameMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheParameterGroupNameMessage]
    }
  }

  /**
    * Status of the cache parameter group.
    */
  @js.native
  trait CacheParameterGroupStatus extends js.Object {
    var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList]
    var CacheParameterGroupName: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
  }

  object CacheParameterGroupStatus {
    def apply(
        CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        ParameterApplyStatus: js.UndefOr[String] = js.undefined
    ): CacheParameterGroupStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeIdsToReboot.foreach(__v => __obj.update("CacheNodeIdsToReboot", __v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      ParameterApplyStatus.foreach(__v => __obj.update("ParameterApplyStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheParameterGroupStatus]
    }
  }

  /**
    * Represents the output of a <code>DescribeCacheParameterGroups</code> operation.
    */
  @js.native
  trait CacheParameterGroupsMessage extends js.Object {
    var CacheParameterGroups: js.UndefOr[CacheParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  object CacheParameterGroupsMessage {
    def apply(
        CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheParameterGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheParameterGroups.foreach(__v => __obj.update("CacheParameterGroups", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheParameterGroupsMessage]
    }
  }

  /**
    * Represents the output of one of the following operations:
    * * <code>AuthorizeCacheSecurityGroupIngress</code>
    *  * <code>CreateCacheSecurityGroup</code>
    *  * <code>RevokeCacheSecurityGroupIngress</code>
    */
  @js.native
  trait CacheSecurityGroup extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var OwnerId: js.UndefOr[String]
  }

  object CacheSecurityGroup {
    def apply(
        CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
        OwnerId: js.UndefOr[String] = js.undefined
    ): CacheSecurityGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSecurityGroupName.foreach(__v => __obj.update("CacheSecurityGroupName", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      EC2SecurityGroups.foreach(__v => __obj.update("EC2SecurityGroups", __v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.update("OwnerId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheSecurityGroup]
    }
  }

  /**
    * Represents a cluster's status within a particular cache security group.
    */
  @js.native
  trait CacheSecurityGroupMembership extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object CacheSecurityGroupMembership {
    def apply(
        CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): CacheSecurityGroupMembership = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSecurityGroupName.foreach(__v => __obj.update("CacheSecurityGroupName", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheSecurityGroupMembership]
    }
  }

  /**
    * Represents the output of a <code>DescribeCacheSecurityGroups</code> operation.
    */
  @js.native
  trait CacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroups: js.UndefOr[CacheSecurityGroups]
    var Marker: js.UndefOr[String]
  }

  object CacheSecurityGroupMessage {
    def apply(
        CacheSecurityGroups: js.UndefOr[CacheSecurityGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheSecurityGroupMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSecurityGroups.foreach(__v => __obj.update("CacheSecurityGroups", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheSecurityGroupMessage]
    }
  }

  /**
    * Represents the output of one of the following operations:
    * * <code>CreateCacheSubnetGroup</code>
    *  * <code>ModifyCacheSubnetGroup</code>
    */
  @js.native
  trait CacheSubnetGroup extends js.Object {
    var CacheSubnetGroupDescription: js.UndefOr[String]
    var CacheSubnetGroupName: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  object CacheSubnetGroup {
    def apply(
        CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): CacheSubnetGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSubnetGroupDescription.foreach(__v => __obj.update("CacheSubnetGroupDescription", __v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.update("CacheSubnetGroupName", __v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.update("Subnets", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheSubnetGroup]
    }
  }

  /**
    * Represents the output of a <code>DescribeCacheSubnetGroups</code> operation.
    */
  @js.native
  trait CacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroups: js.UndefOr[CacheSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  object CacheSubnetGroupMessage {
    def apply(
        CacheSubnetGroups: js.UndefOr[CacheSubnetGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheSubnetGroupMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSubnetGroups.foreach(__v => __obj.update("CacheSubnetGroups", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheSubnetGroupMessage]
    }
  }

  object ChangeTypeEnum {
    val immediate         = "immediate"
    val `requires-reboot` = "requires-reboot"

    val values = IndexedSeq(immediate, `requires-reboot`)
  }

  /**
    * Node group (shard) configuration options when adding or removing replicas. Each node group (shard) configuration has the following members: NodeGroupId, NewReplicaCount, and PreferredAvailabilityZones.
    */
  @js.native
  trait ConfigureShard extends js.Object {
    var NewReplicaCount: Int
    var NodeGroupId: AllowedNodeGroupId
    var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList]
  }

  object ConfigureShard {
    def apply(
        NewReplicaCount: Int,
        NodeGroupId: AllowedNodeGroupId,
        PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined
    ): ConfigureShard = {
      val __obj = js.Dictionary[js.Any](
        "NewReplicaCount" -> NewReplicaCount.asInstanceOf[js.Any],
        "NodeGroupId"     -> NodeGroupId.asInstanceOf[js.Any]
      )

      PreferredAvailabilityZones.foreach(__v => __obj.update("PreferredAvailabilityZones", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigureShard]
    }
  }

  /**
    * Represents the input of a <code>CopySnapshotMessage</code> operation.
    */
  @js.native
  trait CopySnapshotMessage extends js.Object {
    var SourceSnapshotName: String
    var TargetSnapshotName: String
    var TargetBucket: js.UndefOr[String]
  }

  object CopySnapshotMessage {
    def apply(
        SourceSnapshotName: String,
        TargetSnapshotName: String,
        TargetBucket: js.UndefOr[String] = js.undefined
    ): CopySnapshotMessage = {
      val __obj = js.Dictionary[js.Any](
        "SourceSnapshotName" -> SourceSnapshotName.asInstanceOf[js.Any],
        "TargetSnapshotName" -> TargetSnapshotName.asInstanceOf[js.Any]
      )

      TargetBucket.foreach(__v => __obj.update("TargetBucket", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopySnapshotMessage]
    }
  }

  @js.native
  trait CopySnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CopySnapshotResult {
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CopySnapshotResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Snapshot.foreach(__v => __obj.update("Snapshot", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopySnapshotResult]
    }
  }

  /**
    * Represents the input of a CreateCacheCluster operation.
    */
  @js.native
  trait CreateCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var AZMode: js.UndefOr[AZMode]
    var AuthToken: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var CacheNodeType: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList]
    var CacheSubnetGroupName: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var SnapshotArns: js.UndefOr[SnapshotArnsList]
    var SnapshotName: js.UndefOr[String]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateCacheClusterMessage {
    def apply(
        CacheClusterId: String,
        AZMode: js.UndefOr[AZMode] = js.undefined,
        AuthToken: js.UndefOr[String] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        NotificationTopicArn: js.UndefOr[String] = js.undefined,
        NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
        PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
        SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined,
        SnapshotName: js.UndefOr[String] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateCacheClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any]
      )

      AZMode.foreach(__v => __obj.update("AZMode", __v.asInstanceOf[js.Any]))
      AuthToken.foreach(__v => __obj.update("AuthToken", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      CacheSecurityGroupNames.foreach(__v => __obj.update("CacheSecurityGroupNames", __v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.update("CacheSubnetGroupName", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.update("NotificationTopicArn", __v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.update("NumCacheNodes", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PreferredAvailabilityZone.foreach(__v => __obj.update("PreferredAvailabilityZone", __v.asInstanceOf[js.Any]))
      PreferredAvailabilityZones.foreach(__v => __obj.update("PreferredAvailabilityZones", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.update("ReplicationGroupId", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SnapshotArns.foreach(__v => __obj.update("SnapshotArns", __v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.update("SnapshotName", __v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.update("SnapshotRetentionLimit", __v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.update("SnapshotWindow", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCacheClusterMessage]
    }
  }

  @js.native
  trait CreateCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object CreateCacheClusterResult {
    def apply(
        CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): CreateCacheClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheCluster.foreach(__v => __obj.update("CacheCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCacheClusterResult]
    }
  }

  /**
    * Represents the input of a <code>CreateCacheParameterGroup</code> operation.
    */
  @js.native
  trait CreateCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupFamily: String
    var CacheParameterGroupName: String
    var Description: String
  }

  object CreateCacheParameterGroupMessage {
    def apply(
        CacheParameterGroupFamily: String,
        CacheParameterGroupName: String,
        Description: String
    ): CreateCacheParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.asInstanceOf[js.Any],
        "CacheParameterGroupName"   -> CacheParameterGroupName.asInstanceOf[js.Any],
        "Description"               -> Description.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCacheParameterGroupMessage]
    }
  }

  @js.native
  trait CreateCacheParameterGroupResult extends js.Object {
    var CacheParameterGroup: js.UndefOr[CacheParameterGroup]
  }

  object CreateCacheParameterGroupResult {
    def apply(
        CacheParameterGroup: js.UndefOr[CacheParameterGroup] = js.undefined
    ): CreateCacheParameterGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheParameterGroup.foreach(__v => __obj.update("CacheParameterGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCacheParameterGroupResult]
    }
  }

  /**
    * Represents the input of a <code>CreateCacheSecurityGroup</code> operation.
    */
  @js.native
  trait CreateCacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroupName: String
    var Description: String
  }

  object CreateCacheSecurityGroupMessage {
    def apply(
        CacheSecurityGroupName: String,
        Description: String
    ): CreateCacheSecurityGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "Description"            -> Description.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCacheSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateCacheSecurityGroupResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  object CreateCacheSecurityGroupResult {
    def apply(
        CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): CreateCacheSecurityGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSecurityGroup.foreach(__v => __obj.update("CacheSecurityGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCacheSecurityGroupResult]
    }
  }

  /**
    * Represents the input of a <code>CreateCacheSubnetGroup</code> operation.
    */
  @js.native
  trait CreateCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupDescription: String
    var CacheSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
  }

  object CreateCacheSubnetGroupMessage {
    def apply(
        CacheSubnetGroupDescription: String,
        CacheSubnetGroupName: String,
        SubnetIds: SubnetIdentifierList
    ): CreateCacheSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.asInstanceOf[js.Any],
        "CacheSubnetGroupName"        -> CacheSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds"                   -> SubnetIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup]
  }

  object CreateCacheSubnetGroupResult {
    def apply(
        CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
    ): CreateCacheSubnetGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSubnetGroup.foreach(__v => __obj.update("CacheSubnetGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCacheSubnetGroupResult]
    }
  }

  /**
    * Represents the input of a <code>CreateReplicationGroup</code> operation.
    */
  @js.native
  trait CreateReplicationGroupMessage extends js.Object {
    var ReplicationGroupDescription: String
    var ReplicationGroupId: String
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AuthToken: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional]
    var CacheNodeType: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList]
    var CacheSubnetGroupName: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var NodeGroupConfiguration: js.UndefOr[NodeGroupConfigurationList]
    var NotificationTopicArn: js.UndefOr[String]
    var NumCacheClusters: js.UndefOr[IntegerOptional]
    var NumNodeGroups: js.UndefOr[IntegerOptional]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredCacheClusterAZs: js.UndefOr[AvailabilityZonesList]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PrimaryClusterId: js.UndefOr[String]
    var ReplicasPerNodeGroup: js.UndefOr[IntegerOptional]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var SnapshotArns: js.UndefOr[SnapshotArnsList]
    var SnapshotName: js.UndefOr[String]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional]
  }

  object CreateReplicationGroupMessage {
    def apply(
        ReplicationGroupDescription: String,
        ReplicationGroupId: String,
        AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AuthToken: js.UndefOr[String] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        NodeGroupConfiguration: js.UndefOr[NodeGroupConfigurationList] = js.undefined,
        NotificationTopicArn: js.UndefOr[String] = js.undefined,
        NumCacheClusters: js.UndefOr[IntegerOptional] = js.undefined,
        NumNodeGroups: js.UndefOr[IntegerOptional] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredCacheClusterAZs: js.UndefOr[AvailabilityZonesList] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PrimaryClusterId: js.UndefOr[String] = js.undefined,
        ReplicasPerNodeGroup: js.UndefOr[IntegerOptional] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
        SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined,
        SnapshotName: js.UndefOr[String] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
    ): CreateReplicationGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationGroupDescription" -> ReplicationGroupDescription.asInstanceOf[js.Any],
        "ReplicationGroupId"          -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      AtRestEncryptionEnabled.foreach(__v => __obj.update("AtRestEncryptionEnabled", __v.asInstanceOf[js.Any]))
      AuthToken.foreach(__v => __obj.update("AuthToken", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      AutomaticFailoverEnabled.foreach(__v => __obj.update("AutomaticFailoverEnabled", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      CacheSecurityGroupNames.foreach(__v => __obj.update("CacheSecurityGroupNames", __v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.update("CacheSubnetGroupName", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      NodeGroupConfiguration.foreach(__v => __obj.update("NodeGroupConfiguration", __v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.update("NotificationTopicArn", __v.asInstanceOf[js.Any]))
      NumCacheClusters.foreach(__v => __obj.update("NumCacheClusters", __v.asInstanceOf[js.Any]))
      NumNodeGroups.foreach(__v => __obj.update("NumNodeGroups", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PreferredCacheClusterAZs.foreach(__v => __obj.update("PreferredCacheClusterAZs", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      PrimaryClusterId.foreach(__v => __obj.update("PrimaryClusterId", __v.asInstanceOf[js.Any]))
      ReplicasPerNodeGroup.foreach(__v => __obj.update("ReplicasPerNodeGroup", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SnapshotArns.foreach(__v => __obj.update("SnapshotArns", __v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.update("SnapshotName", __v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.update("SnapshotRetentionLimit", __v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.update("SnapshotWindow", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TransitEncryptionEnabled.foreach(__v => __obj.update("TransitEncryptionEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationGroupMessage]
    }
  }

  @js.native
  trait CreateReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object CreateReplicationGroupResult {
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): CreateReplicationGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationGroup.foreach(__v => __obj.update("ReplicationGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationGroupResult]
    }
  }

  /**
    * Represents the input of a <code>CreateSnapshot</code> operation.
    */
  @js.native
  trait CreateSnapshotMessage extends js.Object {
    var SnapshotName: String
    var CacheClusterId: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
  }

  object CreateSnapshotMessage {
    def apply(
        SnapshotName: String,
        CacheClusterId: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined
    ): CreateSnapshotMessage = {
      val __obj = js.Dictionary[js.Any](
        "SnapshotName" -> SnapshotName.asInstanceOf[js.Any]
      )

      CacheClusterId.foreach(__v => __obj.update("CacheClusterId", __v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.update("ReplicationGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotMessage]
    }
  }

  @js.native
  trait CreateSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CreateSnapshotResult {
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CreateSnapshotResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Snapshot.foreach(__v => __obj.update("Snapshot", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotResult]
    }
  }

  @js.native
  trait DecreaseReplicaCountMessage extends js.Object {
    var ApplyImmediately: Boolean
    var ReplicationGroupId: String
    var NewReplicaCount: js.UndefOr[IntegerOptional]
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList]
    var ReplicasToRemove: js.UndefOr[RemoveReplicasList]
  }

  object DecreaseReplicaCountMessage {
    def apply(
        ApplyImmediately: Boolean,
        ReplicationGroupId: String,
        NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined,
        ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.undefined
    ): DecreaseReplicaCountMessage = {
      val __obj = js.Dictionary[js.Any](
        "ApplyImmediately"   -> ApplyImmediately.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      NewReplicaCount.foreach(__v => __obj.update("NewReplicaCount", __v.asInstanceOf[js.Any]))
      ReplicaConfiguration.foreach(__v => __obj.update("ReplicaConfiguration", __v.asInstanceOf[js.Any]))
      ReplicasToRemove.foreach(__v => __obj.update("ReplicasToRemove", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecreaseReplicaCountMessage]
    }
  }

  @js.native
  trait DecreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object DecreaseReplicaCountResult {
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): DecreaseReplicaCountResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationGroup.foreach(__v => __obj.update("ReplicationGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecreaseReplicaCountResult]
    }
  }

  /**
    * Represents the input of a <code>DeleteCacheCluster</code> operation.
    */
  @js.native
  trait DeleteCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var FinalSnapshotIdentifier: js.UndefOr[String]
  }

  object DeleteCacheClusterMessage {
    def apply(
        CacheClusterId: String,
        FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteCacheClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any]
      )

      FinalSnapshotIdentifier.foreach(__v => __obj.update("FinalSnapshotIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCacheClusterMessage]
    }
  }

  @js.native
  trait DeleteCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object DeleteCacheClusterResult {
    def apply(
        CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): DeleteCacheClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheCluster.foreach(__v => __obj.update("CacheCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCacheClusterResult]
    }
  }

  /**
    * Represents the input of a <code>DeleteCacheParameterGroup</code> operation.
    */
  @js.native
  trait DeleteCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
  }

  object DeleteCacheParameterGroupMessage {
    def apply(
        CacheParameterGroupName: String
    ): DeleteCacheParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCacheParameterGroupMessage]
    }
  }

  /**
    * Represents the input of a <code>DeleteCacheSecurityGroup</code> operation.
    */
  @js.native
  trait DeleteCacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroupName: String
  }

  object DeleteCacheSecurityGroupMessage {
    def apply(
        CacheSecurityGroupName: String
    ): DeleteCacheSecurityGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCacheSecurityGroupMessage]
    }
  }

  /**
    * Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.
    */
  @js.native
  trait DeleteCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: String
  }

  object DeleteCacheSubnetGroupMessage {
    def apply(
        CacheSubnetGroupName: String
    ): DeleteCacheSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCacheSubnetGroupMessage]
    }
  }

  /**
    * Represents the input of a <code>DeleteReplicationGroup</code> operation.
    */
  @js.native
  trait DeleteReplicationGroupMessage extends js.Object {
    var ReplicationGroupId: String
    var FinalSnapshotIdentifier: js.UndefOr[String]
    var RetainPrimaryCluster: js.UndefOr[BooleanOptional]
  }

  object DeleteReplicationGroupMessage {
    def apply(
        ReplicationGroupId: String,
        FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.undefined
    ): DeleteReplicationGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      FinalSnapshotIdentifier.foreach(__v => __obj.update("FinalSnapshotIdentifier", __v.asInstanceOf[js.Any]))
      RetainPrimaryCluster.foreach(__v => __obj.update("RetainPrimaryCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReplicationGroupMessage]
    }
  }

  @js.native
  trait DeleteReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object DeleteReplicationGroupResult {
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): DeleteReplicationGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationGroup.foreach(__v => __obj.update("ReplicationGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReplicationGroupResult]
    }
  }

  /**
    * Represents the input of a <code>DeleteSnapshot</code> operation.
    */
  @js.native
  trait DeleteSnapshotMessage extends js.Object {
    var SnapshotName: String
  }

  object DeleteSnapshotMessage {
    def apply(
        SnapshotName: String
    ): DeleteSnapshotMessage = {
      val __obj = js.Dictionary[js.Any](
        "SnapshotName" -> SnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSnapshotMessage]
    }
  }

  @js.native
  trait DeleteSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object DeleteSnapshotResult {
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): DeleteSnapshotResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Snapshot.foreach(__v => __obj.update("Snapshot", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSnapshotResult]
    }
  }

  /**
    * Represents the input of a <code>DescribeCacheClusters</code> operation.
    */
  @js.native
  trait DescribeCacheClustersMessage extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional]
    var ShowCacheNodeInfo: js.UndefOr[BooleanOptional]
  }

  object DescribeCacheClustersMessage {
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional] = js.undefined,
        ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.undefined
    ): DescribeCacheClustersMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheClusterId.foreach(__v => __obj.update("CacheClusterId", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      ShowCacheClustersNotInReplicationGroups.foreach(
        __v => __obj.update("ShowCacheClustersNotInReplicationGroups", __v.asInstanceOf[js.Any])
      )
      ShowCacheNodeInfo.foreach(__v => __obj.update("ShowCacheNodeInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCacheClustersMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeCacheEngineVersions</code> operation.
    */
  @js.native
  trait DescribeCacheEngineVersionsMessage extends js.Object {
    var CacheParameterGroupFamily: js.UndefOr[String]
    var DefaultOnly: js.UndefOr[Boolean]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeCacheEngineVersionsMessage {
    def apply(
        CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
        DefaultOnly: js.UndefOr[Boolean] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCacheEngineVersionsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheParameterGroupFamily.foreach(__v => __obj.update("CacheParameterGroupFamily", __v.asInstanceOf[js.Any]))
      DefaultOnly.foreach(__v => __obj.update("DefaultOnly", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCacheEngineVersionsMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeCacheParameterGroups</code> operation.
    */
  @js.native
  trait DescribeCacheParameterGroupsMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeCacheParameterGroupsMessage {
    def apply(
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCacheParameterGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCacheParameterGroupsMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeCacheParameters</code> operation.
    */
  @js.native
  trait DescribeCacheParametersMessage extends js.Object {
    var CacheParameterGroupName: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  object DescribeCacheParametersMessage {
    def apply(
        CacheParameterGroupName: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): DescribeCacheParametersMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCacheParametersMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeCacheSecurityGroups</code> operation.
    */
  @js.native
  trait DescribeCacheSecurityGroupsMessage extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeCacheSecurityGroupsMessage {
    def apply(
        CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCacheSecurityGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSecurityGroupName.foreach(__v => __obj.update("CacheSecurityGroupName", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCacheSecurityGroupsMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeCacheSubnetGroups</code> operation.
    */
  @js.native
  trait DescribeCacheSubnetGroupsMessage extends js.Object {
    var CacheSubnetGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeCacheSubnetGroupsMessage {
    def apply(
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCacheSubnetGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSubnetGroupName.foreach(__v => __obj.update("CacheSubnetGroupName", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCacheSubnetGroupsMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeEngineDefaultParameters</code> operation.
    */
  @js.native
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    var CacheParameterGroupFamily: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEngineDefaultParametersMessage {
    def apply(
        CacheParameterGroupFamily: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEngineDefaultParametersMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineDefaultParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  object DescribeEngineDefaultParametersResult {
    def apply(
        EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
    ): DescribeEngineDefaultParametersResult = {
      val __obj = js.Dictionary.empty[js.Any]
      EngineDefaults.foreach(__v => __obj.update("EngineDefaults", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineDefaultParametersResult]
    }
  }

  /**
    * Represents the input of a <code>DescribeEvents</code> operation.
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
    def apply(
        Duration: js.UndefOr[IntegerOptional] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined
    ): DescribeEventsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.update("SourceIdentifier", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeReplicationGroups</code> operation.
    */
  @js.native
  trait DescribeReplicationGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationGroupId: js.UndefOr[String]
  }

  object DescribeReplicationGroupsMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined
    ): DescribeReplicationGroupsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.update("ReplicationGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationGroupsMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeReservedCacheNodes</code> operation.
    */
  @js.native
  trait DescribeReservedCacheNodesMessage extends js.Object {
    var CacheNodeType: js.UndefOr[String]
    var Duration: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var ReservedCacheNodeId: js.UndefOr[String]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
  }

  object DescribeReservedCacheNodesMessage {
    def apply(
        CacheNodeType: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        ReservedCacheNodeId: js.UndefOr[String] = js.undefined,
        ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
    ): DescribeReservedCacheNodesMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.update("OfferingType", __v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.update("ProductDescription", __v.asInstanceOf[js.Any]))
      ReservedCacheNodeId.foreach(__v => __obj.update("ReservedCacheNodeId", __v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferingId.foreach(
        __v => __obj.update("ReservedCacheNodesOfferingId", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedCacheNodesMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.
    */
  @js.native
  trait DescribeReservedCacheNodesOfferingsMessage extends js.Object {
    var CacheNodeType: js.UndefOr[String]
    var Duration: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
  }

  object DescribeReservedCacheNodesOfferingsMessage {
    def apply(
        CacheNodeType: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
    ): DescribeReservedCacheNodesOfferingsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.update("OfferingType", __v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.update("ProductDescription", __v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferingId.foreach(
        __v => __obj.update("ReservedCacheNodesOfferingId", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedCacheNodesOfferingsMessage]
    }
  }

  /**
    * Represents the output of a <code>DescribeSnapshots</code> operation.
    */
  @js.native
  trait DescribeSnapshotsListMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Snapshots: js.UndefOr[SnapshotList]
  }

  object DescribeSnapshotsListMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Snapshots: js.UndefOr[SnapshotList] = js.undefined
    ): DescribeSnapshotsListMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Snapshots.foreach(__v => __obj.update("Snapshots", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsListMessage]
    }
  }

  /**
    * Represents the input of a <code>DescribeSnapshotsMessage</code> operation.
    */
  @js.native
  trait DescribeSnapshotsMessage extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationGroupId: js.UndefOr[String]
    var ShowNodeGroupConfig: js.UndefOr[BooleanOptional]
    var SnapshotName: js.UndefOr[String]
    var SnapshotSource: js.UndefOr[String]
  }

  object DescribeSnapshotsMessage {
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        ShowNodeGroupConfig: js.UndefOr[BooleanOptional] = js.undefined,
        SnapshotName: js.UndefOr[String] = js.undefined,
        SnapshotSource: js.UndefOr[String] = js.undefined
    ): DescribeSnapshotsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheClusterId.foreach(__v => __obj.update("CacheClusterId", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.update("MaxRecords", __v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.update("ReplicationGroupId", __v.asInstanceOf[js.Any]))
      ShowNodeGroupConfig.foreach(__v => __obj.update("ShowNodeGroupConfig", __v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.update("SnapshotName", __v.asInstanceOf[js.Any]))
      SnapshotSource.foreach(__v => __obj.update("SnapshotSource", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsMessage]
    }
  }

  /**
    * Provides ownership and status information for an Amazon EC2 security group.
    */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object EC2SecurityGroup {
    def apply(
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): EC2SecurityGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      EC2SecurityGroupName.foreach(__v => __obj.update("EC2SecurityGroupName", __v.asInstanceOf[js.Any]))
      EC2SecurityGroupOwnerId.foreach(__v => __obj.update("EC2SecurityGroupOwnerId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
    * Represents the information required for client programs to connect to a cache node.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  object Endpoint {
    def apply(
        Address: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined
    ): Endpoint = {
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /**
    * Represents the output of a <code>DescribeEngineDefaultParameters</code> operation.
    */
  @js.native
  trait EngineDefaults extends js.Object {
    var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object EngineDefaults {
    def apply(
        CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined,
        CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): EngineDefaults = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeTypeSpecificParameters.foreach(
        __v => __obj.update("CacheNodeTypeSpecificParameters", __v.asInstanceOf[js.Any])
      )
      CacheParameterGroupFamily.foreach(__v => __obj.update("CacheParameterGroupFamily", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineDefaults]
    }
  }

  /**
    * Represents a single occurrence of something interesting within the system. Some examples of events are creating a cluster, adding or removing a cache node, or rebooting a node.
    */
  @js.native
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var Message: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  object Event {
    def apply(
        Date: js.UndefOr[TStamp] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): Event = {
      val __obj = js.Dictionary.empty[js.Any]
      Date.foreach(__v => __obj.update("Date", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.update("SourceIdentifier", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /**
    * Represents the output of a <code>DescribeEvents</code> operation.
    */
  @js.native
  trait EventsMessage extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  object EventsMessage {
    def apply(
        Events: js.UndefOr[EventList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): EventsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Events.foreach(__v => __obj.update("Events", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsMessage]
    }
  }

  @js.native
  trait IncreaseReplicaCountMessage extends js.Object {
    var ApplyImmediately: Boolean
    var ReplicationGroupId: String
    var NewReplicaCount: js.UndefOr[IntegerOptional]
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList]
  }

  object IncreaseReplicaCountMessage {
    def apply(
        ApplyImmediately: Boolean,
        ReplicationGroupId: String,
        NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined
    ): IncreaseReplicaCountMessage = {
      val __obj = js.Dictionary[js.Any](
        "ApplyImmediately"   -> ApplyImmediately.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      NewReplicaCount.foreach(__v => __obj.update("NewReplicaCount", __v.asInstanceOf[js.Any]))
      ReplicaConfiguration.foreach(__v => __obj.update("ReplicaConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncreaseReplicaCountMessage]
    }
  }

  @js.native
  trait IncreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object IncreaseReplicaCountResult {
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): IncreaseReplicaCountResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationGroup.foreach(__v => __obj.update("ReplicationGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncreaseReplicaCountResult]
    }
  }

  /**
    * The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.
    */
  @js.native
  trait ListAllowedNodeTypeModificationsMessage extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
  }

  object ListAllowedNodeTypeModificationsMessage {
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined
    ): ListAllowedNodeTypeModificationsMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheClusterId.foreach(__v => __obj.update("CacheClusterId", __v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.update("ReplicationGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAllowedNodeTypeModificationsMessage]
    }
  }

  /**
    * The input parameters for the <code>ListTagsForResource</code> operation.
    */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
  }

  object ListTagsForResourceMessage {
    def apply(
        ResourceName: String
    ): ListTagsForResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
    * Represents the input of a <code>ModifyCacheCluster</code> operation.
    */
  @js.native
  trait ModifyCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var AZMode: js.UndefOr[AZMode]
    var ApplyImmediately: js.UndefOr[Boolean]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList]
    var CacheNodeType: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList]
    var EngineVersion: js.UndefOr[String]
    var NewAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList]
    var NotificationTopicArn: js.UndefOr[String]
    var NotificationTopicStatus: js.UndefOr[String]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
  }

  object ModifyCacheClusterMessage {
    def apply(
        CacheClusterId: String,
        AZMode: js.UndefOr[AZMode] = js.undefined,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        NewAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined,
        NotificationTopicArn: js.UndefOr[String] = js.undefined,
        NotificationTopicStatus: js.UndefOr[String] = js.undefined,
        NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined
    ): ModifyCacheClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any]
      )

      AZMode.foreach(__v => __obj.update("AZMode", __v.asInstanceOf[js.Any]))
      ApplyImmediately.foreach(__v => __obj.update("ApplyImmediately", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      CacheNodeIdsToRemove.foreach(__v => __obj.update("CacheNodeIdsToRemove", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      CacheSecurityGroupNames.foreach(__v => __obj.update("CacheSecurityGroupNames", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      NewAvailabilityZones.foreach(__v => __obj.update("NewAvailabilityZones", __v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.update("NotificationTopicArn", __v.asInstanceOf[js.Any]))
      NotificationTopicStatus.foreach(__v => __obj.update("NotificationTopicStatus", __v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.update("NumCacheNodes", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.update("SnapshotRetentionLimit", __v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.update("SnapshotWindow", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCacheClusterMessage]
    }
  }

  @js.native
  trait ModifyCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object ModifyCacheClusterResult {
    def apply(
        CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): ModifyCacheClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheCluster.foreach(__v => __obj.update("CacheCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCacheClusterResult]
    }
  }

  /**
    * Represents the input of a <code>ModifyCacheParameterGroup</code> operation.
    */
  @js.native
  trait ModifyCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
    var ParameterNameValues: ParameterNameValueList
  }

  object ModifyCacheParameterGroupMessage {
    def apply(
        CacheParameterGroupName: String,
        ParameterNameValues: ParameterNameValueList
    ): ModifyCacheParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any],
        "ParameterNameValues"     -> ParameterNameValues.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyCacheParameterGroupMessage]
    }
  }

  /**
    * Represents the input of a <code>ModifyCacheSubnetGroup</code> operation.
    */
  @js.native
  trait ModifyCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: String
    var CacheSubnetGroupDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  object ModifyCacheSubnetGroupMessage {
    def apply(
        CacheSubnetGroupName: String,
        CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
    ): ModifyCacheSubnetGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.asInstanceOf[js.Any]
      )

      CacheSubnetGroupDescription.foreach(__v => __obj.update("CacheSubnetGroupDescription", __v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.update("SubnetIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup]
  }

  object ModifyCacheSubnetGroupResult {
    def apply(
        CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
    ): ModifyCacheSubnetGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSubnetGroup.foreach(__v => __obj.update("CacheSubnetGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCacheSubnetGroupResult]
    }
  }

  /**
    * Represents the input of a <code>ModifyReplicationGroups</code> operation.
    */
  @js.native
  trait ModifyReplicationGroupMessage extends js.Object {
    var ReplicationGroupId: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional]
    var CacheNodeType: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList]
    var EngineVersion: js.UndefOr[String]
    var NodeGroupId: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var NotificationTopicStatus: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PrimaryClusterId: js.UndefOr[String]
    var ReplicationGroupDescription: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var SnapshottingClusterId: js.UndefOr[String]
  }

  object ModifyReplicationGroupMessage {
    def apply(
        ReplicationGroupId: String,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        NodeGroupId: js.UndefOr[String] = js.undefined,
        NotificationTopicArn: js.UndefOr[String] = js.undefined,
        NotificationTopicStatus: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PrimaryClusterId: js.UndefOr[String] = js.undefined,
        ReplicationGroupDescription: js.UndefOr[String] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        SnapshottingClusterId: js.UndefOr[String] = js.undefined
    ): ModifyReplicationGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      ApplyImmediately.foreach(__v => __obj.update("ApplyImmediately", __v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      AutomaticFailoverEnabled.foreach(__v => __obj.update("AutomaticFailoverEnabled", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      CacheSecurityGroupNames.foreach(__v => __obj.update("CacheSecurityGroupNames", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      NodeGroupId.foreach(__v => __obj.update("NodeGroupId", __v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.update("NotificationTopicArn", __v.asInstanceOf[js.Any]))
      NotificationTopicStatus.foreach(__v => __obj.update("NotificationTopicStatus", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      PrimaryClusterId.foreach(__v => __obj.update("PrimaryClusterId", __v.asInstanceOf[js.Any]))
      ReplicationGroupDescription.foreach(__v => __obj.update("ReplicationGroupDescription", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.update("SnapshotRetentionLimit", __v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.update("SnapshotWindow", __v.asInstanceOf[js.Any]))
      SnapshottingClusterId.foreach(__v => __obj.update("SnapshottingClusterId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationGroupMessage]
    }
  }

  @js.native
  trait ModifyReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object ModifyReplicationGroupResult {
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): ModifyReplicationGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationGroup.foreach(__v => __obj.update("ReplicationGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationGroupResult]
    }
  }

  /**
    * Represents the input for a <code>ModifyReplicationGroupShardConfiguration</code> operation.
    */
  @js.native
  trait ModifyReplicationGroupShardConfigurationMessage extends js.Object {
    var ApplyImmediately: Boolean
    var NodeGroupCount: Int
    var ReplicationGroupId: String
    var NodeGroupsToRemove: js.UndefOr[NodeGroupsToRemoveList]
    var NodeGroupsToRetain: js.UndefOr[NodeGroupsToRetainList]
    var ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList]
  }

  object ModifyReplicationGroupShardConfigurationMessage {
    def apply(
        ApplyImmediately: Boolean,
        NodeGroupCount: Int,
        ReplicationGroupId: String,
        NodeGroupsToRemove: js.UndefOr[NodeGroupsToRemoveList] = js.undefined,
        NodeGroupsToRetain: js.UndefOr[NodeGroupsToRetainList] = js.undefined,
        ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList] = js.undefined
    ): ModifyReplicationGroupShardConfigurationMessage = {
      val __obj = js.Dictionary[js.Any](
        "ApplyImmediately"   -> ApplyImmediately.asInstanceOf[js.Any],
        "NodeGroupCount"     -> NodeGroupCount.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      NodeGroupsToRemove.foreach(__v => __obj.update("NodeGroupsToRemove", __v.asInstanceOf[js.Any]))
      NodeGroupsToRetain.foreach(__v => __obj.update("NodeGroupsToRetain", __v.asInstanceOf[js.Any]))
      ReshardingConfiguration.foreach(__v => __obj.update("ReshardingConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationMessage]
    }
  }

  @js.native
  trait ModifyReplicationGroupShardConfigurationResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object ModifyReplicationGroupShardConfigurationResult {
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): ModifyReplicationGroupShardConfigurationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationGroup.foreach(__v => __obj.update("ReplicationGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
    }
  }

  /**
    * Represents a collection of cache nodes in a replication group. One node in the node group is the read/write primary node. All the other nodes are read-only Replica nodes.
    */
  @js.native
  trait NodeGroup extends js.Object {
    var NodeGroupId: js.UndefOr[String]
    var NodeGroupMembers: js.UndefOr[NodeGroupMemberList]
    var PrimaryEndpoint: js.UndefOr[Endpoint]
    var Slots: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object NodeGroup {
    def apply(
        NodeGroupId: js.UndefOr[String] = js.undefined,
        NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.undefined,
        PrimaryEndpoint: js.UndefOr[Endpoint] = js.undefined,
        Slots: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): NodeGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      NodeGroupId.foreach(__v => __obj.update("NodeGroupId", __v.asInstanceOf[js.Any]))
      NodeGroupMembers.foreach(__v => __obj.update("NodeGroupMembers", __v.asInstanceOf[js.Any]))
      PrimaryEndpoint.foreach(__v => __obj.update("PrimaryEndpoint", __v.asInstanceOf[js.Any]))
      Slots.foreach(__v => __obj.update("Slots", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeGroup]
    }
  }

  /**
    * Node group (shard) configuration options. Each node group (shard) configuration has the following: <code>Slots</code>, <code>PrimaryAvailabilityZone</code>, <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>.
    */
  @js.native
  trait NodeGroupConfiguration extends js.Object {
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId]
    var PrimaryAvailabilityZone: js.UndefOr[String]
    var ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList]
    var ReplicaCount: js.UndefOr[IntegerOptional]
    var Slots: js.UndefOr[String]
  }

  object NodeGroupConfiguration {
    def apply(
        NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined,
        PrimaryAvailabilityZone: js.UndefOr[String] = js.undefined,
        ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined,
        ReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
        Slots: js.UndefOr[String] = js.undefined
    ): NodeGroupConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      NodeGroupId.foreach(__v => __obj.update("NodeGroupId", __v.asInstanceOf[js.Any]))
      PrimaryAvailabilityZone.foreach(__v => __obj.update("PrimaryAvailabilityZone", __v.asInstanceOf[js.Any]))
      ReplicaAvailabilityZones.foreach(__v => __obj.update("ReplicaAvailabilityZones", __v.asInstanceOf[js.Any]))
      ReplicaCount.foreach(__v => __obj.update("ReplicaCount", __v.asInstanceOf[js.Any]))
      Slots.foreach(__v => __obj.update("Slots", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeGroupConfiguration]
    }
  }

  /**
    * Represents a single node within a node group (shard).
    */
  @js.native
  trait NodeGroupMember extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeId: js.UndefOr[String]
    var CurrentRole: js.UndefOr[String]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var ReadEndpoint: js.UndefOr[Endpoint]
  }

  object NodeGroupMember {
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheNodeId: js.UndefOr[String] = js.undefined,
        CurrentRole: js.UndefOr[String] = js.undefined,
        PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
        ReadEndpoint: js.UndefOr[Endpoint] = js.undefined
    ): NodeGroupMember = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheClusterId.foreach(__v => __obj.update("CacheClusterId", __v.asInstanceOf[js.Any]))
      CacheNodeId.foreach(__v => __obj.update("CacheNodeId", __v.asInstanceOf[js.Any]))
      CurrentRole.foreach(__v => __obj.update("CurrentRole", __v.asInstanceOf[js.Any]))
      PreferredAvailabilityZone.foreach(__v => __obj.update("PreferredAvailabilityZone", __v.asInstanceOf[js.Any]))
      ReadEndpoint.foreach(__v => __obj.update("ReadEndpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeGroupMember]
    }
  }

  /**
    * Represents an individual cache node in a snapshot of a cluster.
    */
  @js.native
  trait NodeSnapshot extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeCreateTime: js.UndefOr[TStamp]
    var CacheNodeId: js.UndefOr[String]
    var CacheSize: js.UndefOr[String]
    var NodeGroupConfiguration: js.UndefOr[NodeGroupConfiguration]
    var NodeGroupId: js.UndefOr[String]
    var SnapshotCreateTime: js.UndefOr[TStamp]
  }

  object NodeSnapshot {
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined,
        CacheNodeId: js.UndefOr[String] = js.undefined,
        CacheSize: js.UndefOr[String] = js.undefined,
        NodeGroupConfiguration: js.UndefOr[NodeGroupConfiguration] = js.undefined,
        NodeGroupId: js.UndefOr[String] = js.undefined,
        SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
    ): NodeSnapshot = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheClusterId.foreach(__v => __obj.update("CacheClusterId", __v.asInstanceOf[js.Any]))
      CacheNodeCreateTime.foreach(__v => __obj.update("CacheNodeCreateTime", __v.asInstanceOf[js.Any]))
      CacheNodeId.foreach(__v => __obj.update("CacheNodeId", __v.asInstanceOf[js.Any]))
      CacheSize.foreach(__v => __obj.update("CacheSize", __v.asInstanceOf[js.Any]))
      NodeGroupConfiguration.foreach(__v => __obj.update("NodeGroupConfiguration", __v.asInstanceOf[js.Any]))
      NodeGroupId.foreach(__v => __obj.update("NodeGroupId", __v.asInstanceOf[js.Any]))
      SnapshotCreateTime.foreach(__v => __obj.update("SnapshotCreateTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeSnapshot]
    }
  }

  /**
    * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to subscribers using Amazon Simple Notification Service (SNS).
    */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var TopicArn: js.UndefOr[String]
    var TopicStatus: js.UndefOr[String]
  }

  object NotificationConfiguration {
    def apply(
        TopicArn: js.UndefOr[String] = js.undefined,
        TopicStatus: js.UndefOr[String] = js.undefined
    ): NotificationConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      TopicStatus.foreach(__v => __obj.update("TopicStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfiguration]
    }
  }

  /**
    * Describes an individual setting that controls some aspect of ElastiCache behavior.
    */
  @js.native
  trait Parameter extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var ChangeType: js.UndefOr[ChangeType]
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
        ChangeType: js.UndefOr[ChangeType] = js.undefined,
        DataType: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IsModifiable: js.UndefOr[Boolean] = js.undefined,
        MinimumEngineVersion: js.UndefOr[String] = js.undefined,
        ParameterName: js.UndefOr[String] = js.undefined,
        ParameterValue: js.UndefOr[String] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): Parameter = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowedValues.foreach(__v => __obj.update("AllowedValues", __v.asInstanceOf[js.Any]))
      ChangeType.foreach(__v => __obj.update("ChangeType", __v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.update("DataType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IsModifiable.foreach(__v => __obj.update("IsModifiable", __v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.update("MinimumEngineVersion", __v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.update("ParameterName", __v.asInstanceOf[js.Any]))
      ParameterValue.foreach(__v => __obj.update("ParameterValue", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
    }
  }

  /**
    * Describes a name-value pair that is used to update the value of a parameter.
    */
  @js.native
  trait ParameterNameValue extends js.Object {
    var ParameterName: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
  }

  object ParameterNameValue {
    def apply(
        ParameterName: js.UndefOr[String] = js.undefined,
        ParameterValue: js.UndefOr[String] = js.undefined
    ): ParameterNameValue = {
      val __obj = js.Dictionary.empty[js.Any]
      ParameterName.foreach(__v => __obj.update("ParameterName", __v.asInstanceOf[js.Any]))
      ParameterValue.foreach(__v => __obj.update("ParameterValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterNameValue]
    }
  }

  object PendingAutomaticFailoverStatusEnum {
    val enabled  = "enabled"
    val disabled = "disabled"

    val values = IndexedSeq(enabled, disabled)
  }

  /**
    * A group of settings that are applied to the cluster in the future, or that are currently being applied.
    */
  @js.native
  trait PendingModifiedValues extends js.Object {
    var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList]
    var CacheNodeType: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
  }

  object PendingModifiedValues {
    def apply(
        CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
    ): PendingModifiedValues = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeIdsToRemove.foreach(__v => __obj.update("CacheNodeIdsToRemove", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.update("NumCacheNodes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingModifiedValues]
    }
  }

  /**
    * Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.
    */
  @js.native
  trait PurchaseReservedCacheNodesOfferingMessage extends js.Object {
    var ReservedCacheNodesOfferingId: String
    var CacheNodeCount: js.UndefOr[IntegerOptional]
    var ReservedCacheNodeId: js.UndefOr[String]
  }

  object PurchaseReservedCacheNodesOfferingMessage {
    def apply(
        ReservedCacheNodesOfferingId: String,
        CacheNodeCount: js.UndefOr[IntegerOptional] = js.undefined,
        ReservedCacheNodeId: js.UndefOr[String] = js.undefined
    ): PurchaseReservedCacheNodesOfferingMessage = {
      val __obj = js.Dictionary[js.Any](
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.asInstanceOf[js.Any]
      )

      CacheNodeCount.foreach(__v => __obj.update("CacheNodeCount", __v.asInstanceOf[js.Any]))
      ReservedCacheNodeId.foreach(__v => __obj.update("ReservedCacheNodeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
    var ReservedCacheNode: js.UndefOr[ReservedCacheNode]
  }

  object PurchaseReservedCacheNodesOfferingResult {
    def apply(
        ReservedCacheNode: js.UndefOr[ReservedCacheNode] = js.undefined
    ): PurchaseReservedCacheNodesOfferingResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ReservedCacheNode.foreach(__v => __obj.update("ReservedCacheNode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
    }
  }

  /**
    * Represents the input of a <code>RebootCacheCluster</code> operation.
    */
  @js.native
  trait RebootCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var CacheNodeIdsToReboot: CacheNodeIdsList
  }

  object RebootCacheClusterMessage {
    def apply(
        CacheClusterId: String,
        CacheNodeIdsToReboot: CacheNodeIdsList
    ): RebootCacheClusterMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheClusterId"       -> CacheClusterId.asInstanceOf[js.Any],
        "CacheNodeIdsToReboot" -> CacheNodeIdsToReboot.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebootCacheClusterMessage]
    }
  }

  @js.native
  trait RebootCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object RebootCacheClusterResult {
    def apply(
        CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): RebootCacheClusterResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheCluster.foreach(__v => __obj.update("CacheCluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootCacheClusterResult]
    }
  }

  /**
    * Contains the specific price and frequency of a recurring charges for a reserved cache node, or for a reserved cache node offering.
    */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  object RecurringCharge {
    def apply(
        RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
        RecurringChargeFrequency: js.UndefOr[String] = js.undefined
    ): RecurringCharge = {
      val __obj = js.Dictionary.empty[js.Any]
      RecurringChargeAmount.foreach(__v => __obj.update("RecurringChargeAmount", __v.asInstanceOf[js.Any]))
      RecurringChargeFrequency.foreach(__v => __obj.update("RecurringChargeFrequency", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecurringCharge]
    }
  }

  /**
    * Represents the input of a <code>RemoveTagsFromResource</code> operation.
    */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceMessage {
    def apply(
        ResourceName: String,
        TagKeys: KeyList
    ): RemoveTagsFromResourceMessage = {
      val __obj = js.Dictionary[js.Any](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
    * Contains all of the attributes of a specific Redis replication group.
    */
  @js.native
  trait ReplicationGroup extends js.Object {
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenEnabled: js.UndefOr[BooleanOptional]
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus]
    var CacheNodeType: js.UndefOr[String]
    var ClusterEnabled: js.UndefOr[BooleanOptional]
    var ConfigurationEndpoint: js.UndefOr[Endpoint]
    var Description: js.UndefOr[String]
    var MemberClusters: js.UndefOr[ClusterIdList]
    var NodeGroups: js.UndefOr[NodeGroupList]
    var PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues]
    var ReplicationGroupId: js.UndefOr[String]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var SnapshottingClusterId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional]
  }

  object ReplicationGroup {
    def apply(
        AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        MemberClusters: js.UndefOr[ClusterIdList] = js.undefined,
        NodeGroups: js.UndefOr[NodeGroupList] = js.undefined,
        PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        SnapshottingClusterId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
    ): ReplicationGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      AtRestEncryptionEnabled.foreach(__v => __obj.update("AtRestEncryptionEnabled", __v.asInstanceOf[js.Any]))
      AuthTokenEnabled.foreach(__v => __obj.update("AuthTokenEnabled", __v.asInstanceOf[js.Any]))
      AutomaticFailover.foreach(__v => __obj.update("AutomaticFailover", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      ClusterEnabled.foreach(__v => __obj.update("ClusterEnabled", __v.asInstanceOf[js.Any]))
      ConfigurationEndpoint.foreach(__v => __obj.update("ConfigurationEndpoint", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      MemberClusters.foreach(__v => __obj.update("MemberClusters", __v.asInstanceOf[js.Any]))
      NodeGroups.foreach(__v => __obj.update("NodeGroups", __v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.update("PendingModifiedValues", __v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.update("ReplicationGroupId", __v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.update("SnapshotRetentionLimit", __v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.update("SnapshotWindow", __v.asInstanceOf[js.Any]))
      SnapshottingClusterId.foreach(__v => __obj.update("SnapshottingClusterId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      TransitEncryptionEnabled.foreach(__v => __obj.update("TransitEncryptionEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationGroup]
    }
  }

  /**
    * Represents the output of a <code>DescribeReplicationGroups</code> operation.
    */
  @js.native
  trait ReplicationGroupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationGroups: js.UndefOr[ReplicationGroupList]
  }

  object ReplicationGroupMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.undefined
    ): ReplicationGroupMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReplicationGroups.foreach(__v => __obj.update("ReplicationGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationGroupMessage]
    }
  }

  /**
    * The settings to be applied to the Redis replication group, either immediately or during the next maintenance window.
    */
  @js.native
  trait ReplicationGroupPendingModifiedValues extends js.Object {
    var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus]
    var PrimaryClusterId: js.UndefOr[String]
    var Resharding: js.UndefOr[ReshardingStatus]
  }

  object ReplicationGroupPendingModifiedValues {
    def apply(
        AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.undefined,
        PrimaryClusterId: js.UndefOr[String] = js.undefined,
        Resharding: js.UndefOr[ReshardingStatus] = js.undefined
    ): ReplicationGroupPendingModifiedValues = {
      val __obj = js.Dictionary.empty[js.Any]
      AutomaticFailoverStatus.foreach(__v => __obj.update("AutomaticFailoverStatus", __v.asInstanceOf[js.Any]))
      PrimaryClusterId.foreach(__v => __obj.update("PrimaryClusterId", __v.asInstanceOf[js.Any]))
      Resharding.foreach(__v => __obj.update("Resharding", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationGroupPendingModifiedValues]
    }
  }

  /**
    * Represents the output of a <code>PurchaseReservedCacheNodesOffering</code> operation.
    */
  @js.native
  trait ReservedCacheNode extends js.Object {
    var CacheNodeCount: js.UndefOr[Int]
    var CacheNodeType: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservationARN: js.UndefOr[String]
    var ReservedCacheNodeId: js.UndefOr[String]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var State: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
  }

  object ReservedCacheNode {
    def apply(
        CacheNodeCount: js.UndefOr[Int] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservationARN: js.UndefOr[String] = js.undefined,
        ReservedCacheNodeId: js.UndefOr[String] = js.undefined,
        ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedCacheNode = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeCount.foreach(__v => __obj.update("CacheNodeCount", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.update("FixedPrice", __v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.update("OfferingType", __v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.update("ProductDescription", __v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.update("RecurringCharges", __v.asInstanceOf[js.Any]))
      ReservationARN.foreach(__v => __obj.update("ReservationARN", __v.asInstanceOf[js.Any]))
      ReservedCacheNodeId.foreach(__v => __obj.update("ReservedCacheNodeId", __v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferingId.foreach(
        __v => __obj.update("ReservedCacheNodesOfferingId", __v.asInstanceOf[js.Any])
      )
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.update("UsagePrice", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedCacheNode]
    }
  }

  /**
    * Represents the output of a <code>DescribeReservedCacheNodes</code> operation.
    */
  @js.native
  trait ReservedCacheNodeMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList]
  }

  object ReservedCacheNodeMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.undefined
    ): ReservedCacheNodeMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReservedCacheNodes.foreach(__v => __obj.update("ReservedCacheNodes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedCacheNodeMessage]
    }
  }

  /**
    * Describes all of the attributes of a reserved cache node offering.
    */
  @js.native
  trait ReservedCacheNodesOffering extends js.Object {
    var CacheNodeType: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
  }

  object ReservedCacheNodesOffering {
    def apply(
        CacheNodeType: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedCacheNodesOffering = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.update("FixedPrice", __v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.update("OfferingType", __v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.update("ProductDescription", __v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.update("RecurringCharges", __v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferingId.foreach(
        __v => __obj.update("ReservedCacheNodesOfferingId", __v.asInstanceOf[js.Any])
      )
      UsagePrice.foreach(__v => __obj.update("UsagePrice", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedCacheNodesOffering]
    }
  }

  /**
    * Represents the output of a <code>DescribeReservedCacheNodesOfferings</code> operation.
    */
  @js.native
  trait ReservedCacheNodesOfferingMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList]
  }

  object ReservedCacheNodesOfferingMessage {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.undefined
    ): ReservedCacheNodesOfferingMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferings.foreach(__v => __obj.update("ReservedCacheNodesOfferings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedCacheNodesOfferingMessage]
    }
  }

  /**
    * Represents the input of a <code>ResetCacheParameterGroup</code> operation.
    */
  @js.native
  trait ResetCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
    var ParameterNameValues: js.UndefOr[ParameterNameValueList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  object ResetCacheParameterGroupMessage {
    def apply(
        CacheParameterGroupName: String,
        ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.undefined,
        ResetAllParameters: js.UndefOr[Boolean] = js.undefined
    ): ResetCacheParameterGroupMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any]
      )

      ParameterNameValues.foreach(__v => __obj.update("ParameterNameValues", __v.asInstanceOf[js.Any]))
      ResetAllParameters.foreach(__v => __obj.update("ResetAllParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetCacheParameterGroupMessage]
    }
  }

  /**
    * A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the resharded cluster.
    */
  @js.native
  trait ReshardingConfiguration extends js.Object {
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId]
    var PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList]
  }

  object ReshardingConfiguration {
    def apply(
        NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined,
        PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
    ): ReshardingConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      NodeGroupId.foreach(__v => __obj.update("NodeGroupId", __v.asInstanceOf[js.Any]))
      PreferredAvailabilityZones.foreach(__v => __obj.update("PreferredAvailabilityZones", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReshardingConfiguration]
    }
  }

  /**
    * The status of an online resharding operation.
    */
  @js.native
  trait ReshardingStatus extends js.Object {
    var SlotMigration: js.UndefOr[SlotMigration]
  }

  object ReshardingStatus {
    def apply(
        SlotMigration: js.UndefOr[SlotMigration] = js.undefined
    ): ReshardingStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      SlotMigration.foreach(__v => __obj.update("SlotMigration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReshardingStatus]
    }
  }

  /**
    * Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.
    */
  @js.native
  trait RevokeCacheSecurityGroupIngressMessage extends js.Object {
    var CacheSecurityGroupName: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object RevokeCacheSecurityGroupIngressMessage {
    def apply(
        CacheSecurityGroupName: String,
        EC2SecurityGroupName: String,
        EC2SecurityGroupOwnerId: String
    ): RevokeCacheSecurityGroupIngressMessage = {
      val __obj = js.Dictionary[js.Any](
        "CacheSecurityGroupName"  -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupName"    -> EC2SecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RevokeCacheSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  object RevokeCacheSecurityGroupIngressResult {
    def apply(
        CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): RevokeCacheSecurityGroupIngressResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheSecurityGroup.foreach(__v => __obj.update("CacheSecurityGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeCacheSecurityGroupIngressResult]
    }
  }

  /**
    * Represents a single cache security group and its status.
    */
  @js.native
  trait SecurityGroupMembership extends js.Object {
    var SecurityGroupId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object SecurityGroupMembership {
    def apply(
        SecurityGroupId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): SecurityGroupMembership = {
      val __obj = js.Dictionary.empty[js.Any]
      SecurityGroupId.foreach(__v => __obj.update("SecurityGroupId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroupMembership]
    }
  }

  /**
    * Represents the progress of an online resharding operation.
    */
  @js.native
  trait SlotMigration extends js.Object {
    var ProgressPercentage: js.UndefOr[Double]
  }

  object SlotMigration {
    def apply(
        ProgressPercentage: js.UndefOr[Double] = js.undefined
    ): SlotMigration = {
      val __obj = js.Dictionary.empty[js.Any]
      ProgressPercentage.foreach(__v => __obj.update("ProgressPercentage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlotMigration]
    }
  }

  /**
    * Represents a copy of an entire Redis cluster as of the time when the snapshot was taken.
    */
  @js.native
  trait Snapshot extends js.Object {
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus]
    var CacheClusterCreateTime: js.UndefOr[TStamp]
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeType: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var CacheSubnetGroupName: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var NodeSnapshots: js.UndefOr[NodeSnapshotList]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var NumNodeGroups: js.UndefOr[IntegerOptional]
    var Port: js.UndefOr[IntegerOptional]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationGroupDescription: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var SnapshotName: js.UndefOr[String]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotSource: js.UndefOr[String]
    var SnapshotStatus: js.UndefOr[String]
    var SnapshotWindow: js.UndefOr[String]
    var TopicArn: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object Snapshot {
    def apply(
        AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined,
        CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        NodeSnapshots: js.UndefOr[NodeSnapshotList] = js.undefined,
        NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
        NumNodeGroups: js.UndefOr[IntegerOptional] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        ReplicationGroupDescription: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        SnapshotName: js.UndefOr[String] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotSource: js.UndefOr[String] = js.undefined,
        SnapshotStatus: js.UndefOr[String] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        TopicArn: js.UndefOr[String] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): Snapshot = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoMinorVersionUpgrade.foreach(__v => __obj.update("AutoMinorVersionUpgrade", __v.asInstanceOf[js.Any]))
      AutomaticFailover.foreach(__v => __obj.update("AutomaticFailover", __v.asInstanceOf[js.Any]))
      CacheClusterCreateTime.foreach(__v => __obj.update("CacheClusterCreateTime", __v.asInstanceOf[js.Any]))
      CacheClusterId.foreach(__v => __obj.update("CacheClusterId", __v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.update("CacheNodeType", __v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.update("CacheParameterGroupName", __v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.update("CacheSubnetGroupName", __v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.update("Engine", __v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.update("EngineVersion", __v.asInstanceOf[js.Any]))
      NodeSnapshots.foreach(__v => __obj.update("NodeSnapshots", __v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.update("NumCacheNodes", __v.asInstanceOf[js.Any]))
      NumNodeGroups.foreach(__v => __obj.update("NumNodeGroups", __v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PreferredAvailabilityZone.foreach(__v => __obj.update("PreferredAvailabilityZone", __v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.update("PreferredMaintenanceWindow", __v.asInstanceOf[js.Any]))
      ReplicationGroupDescription.foreach(__v => __obj.update("ReplicationGroupDescription", __v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.update("ReplicationGroupId", __v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.update("SnapshotName", __v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.update("SnapshotRetentionLimit", __v.asInstanceOf[js.Any]))
      SnapshotSource.foreach(__v => __obj.update("SnapshotSource", __v.asInstanceOf[js.Any]))
      SnapshotStatus.foreach(__v => __obj.update("SnapshotStatus", __v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.update("SnapshotWindow", __v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Snapshot]
    }
  }

  object SourceTypeEnum {
    val `cache-cluster`         = "cache-cluster"
    val `cache-parameter-group` = "cache-parameter-group"
    val `cache-security-group`  = "cache-security-group"
    val `cache-subnet-group`    = "cache-subnet-group"
    val `replication-group`     = "replication-group"

    val values = IndexedSeq(
      `cache-cluster`,
      `cache-parameter-group`,
      `cache-security-group`,
      `cache-subnet-group`,
      `replication-group`
    )
  }

  /**
    * Represents the subnet associated with a cluster. This parameter refers to subnets defined in Amazon Virtual Private Cloud (Amazon VPC) and used with ElastiCache.
    */
  @js.native
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
  }

  object Subnet {
    def apply(
        SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        SubnetIdentifier: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dictionary.empty[js.Any]
      SubnetAvailabilityZone.foreach(__v => __obj.update("SubnetAvailabilityZone", __v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.update("SubnetIdentifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subnet]
    }
  }

  /**
    * A cost allocation Tag that can be added to an ElastiCache cluster or replication group. Tags are composed of a Key/Value pair. A tag with a null Value is permitted.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * Represents the output from the <code>AddTagsToResource</code>, <code>ListTagsForResource</code>, and <code>RemoveTagsFromResource</code> operations.
    */
  @js.native
  trait TagListMessage extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object TagListMessage {
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): TagListMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      TagList.foreach(__v => __obj.update("TagList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagListMessage]
    }
  }

  @js.native
  trait TestFailoverMessage extends js.Object {
    var NodeGroupId: AllowedNodeGroupId
    var ReplicationGroupId: String
  }

  object TestFailoverMessage {
    def apply(
        NodeGroupId: AllowedNodeGroupId,
        ReplicationGroupId: String
    ): TestFailoverMessage = {
      val __obj = js.Dictionary[js.Any](
        "NodeGroupId"        -> NodeGroupId.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestFailoverMessage]
    }
  }

  @js.native
  trait TestFailoverResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object TestFailoverResult {
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): TestFailoverResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationGroup.foreach(__v => __obj.update("ReplicationGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestFailoverResult]
    }
  }
}
