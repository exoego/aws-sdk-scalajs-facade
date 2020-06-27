package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object elasticache {
  type AllowedNodeGroupId                  = String
  type AvailabilityZonesList               = js.Array[String]
  type BooleanOptional                     = Boolean
  type CacheClusterIdList                  = js.Array[String]
  type CacheClusterList                    = js.Array[CacheCluster]
  type CacheEngineVersionList              = js.Array[CacheEngineVersion]
  type CacheNodeIdsList                    = js.Array[String]
  type CacheNodeList                       = js.Array[CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList      = js.Array[CacheNodeTypeSpecificValue]
  type CacheNodeUpdateStatusList           = js.Array[CacheNodeUpdateStatus]
  type CacheParameterGroupList             = js.Array[CacheParameterGroup]
  type CacheSecurityGroupMembershipList    = js.Array[CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList          = js.Array[String]
  type CacheSecurityGroups                 = js.Array[CacheSecurityGroup]
  type CacheSubnetGroups                   = js.Array[CacheSubnetGroup]
  type ClusterIdList                       = js.Array[String]
  type CustomerNodeEndpointList            = js.Array[CustomerNodeEndpoint]
  type EC2SecurityGroupList                = js.Array[EC2SecurityGroup]
  type EventList                           = js.Array[Event]
  type IntegerOptional                     = Int
  type KeyList                             = js.Array[String]
  type NodeGroupConfigurationList          = js.Array[NodeGroupConfiguration]
  type NodeGroupList                       = js.Array[NodeGroup]
  type NodeGroupMemberList                 = js.Array[NodeGroupMember]
  type NodeGroupMemberUpdateStatusList     = js.Array[NodeGroupMemberUpdateStatus]
  type NodeGroupUpdateStatusList           = js.Array[NodeGroupUpdateStatus]
  type NodeGroupsToRemoveList              = js.Array[AllowedNodeGroupId]
  type NodeGroupsToRetainList              = js.Array[AllowedNodeGroupId]
  type NodeSnapshotList                    = js.Array[NodeSnapshot]
  type NodeTypeList                        = js.Array[String]
  type ParameterNameValueList              = js.Array[ParameterNameValue]
  type ParametersList                      = js.Array[Parameter]
  type PreferredAvailabilityZoneList       = js.Array[String]
  type ProcessedUpdateActionList           = js.Array[ProcessedUpdateAction]
  type RecurringChargeList                 = js.Array[RecurringCharge]
  type RemoveReplicasList                  = js.Array[String]
  type ReplicaConfigurationList            = js.Array[ConfigureShard]
  type ReplicationGroupIdList              = js.Array[String]
  type ReplicationGroupList                = js.Array[ReplicationGroup]
  type ReservedCacheNodeList               = js.Array[ReservedCacheNode]
  type ReservedCacheNodesOfferingList      = js.Array[ReservedCacheNodesOffering]
  type ReshardingConfigurationList         = js.Array[ReshardingConfiguration]
  type SecurityGroupIdsList                = js.Array[String]
  type SecurityGroupMembershipList         = js.Array[SecurityGroupMembership]
  type ServiceUpdateList                   = js.Array[ServiceUpdate]
  type ServiceUpdateStatusList             = js.Array[ServiceUpdateStatus]
  type SnapshotArnsList                    = js.Array[String]
  type SnapshotList                        = js.Array[Snapshot]
  type SubnetIdentifierList                = js.Array[String]
  type SubnetList                          = js.Array[Subnet]
  type TStamp                              = js.Date
  type TagList                             = js.Array[Tag]
  type UnprocessedUpdateActionList         = js.Array[UnprocessedUpdateAction]
  type UpdateActionList                    = js.Array[UpdateAction]
  type UpdateActionStatusList              = js.Array[UpdateActionStatus]

  implicit final class ElastiCacheOps(private val service: ElastiCache) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[TagListMessage] =
      service.addTagsToResource(params).promise().toFuture
    @inline def authorizeCacheSecurityGroupIngressFuture(
        params: AuthorizeCacheSecurityGroupIngressMessage
    ): Future[AuthorizeCacheSecurityGroupIngressResult] =
      service.authorizeCacheSecurityGroupIngress(params).promise().toFuture
    @inline def batchApplyUpdateActionFuture(
        params: BatchApplyUpdateActionMessage
    ): Future[UpdateActionResultsMessage] = service.batchApplyUpdateAction(params).promise().toFuture
    @inline def batchStopUpdateActionFuture(params: BatchStopUpdateActionMessage): Future[UpdateActionResultsMessage] =
      service.batchStopUpdateAction(params).promise().toFuture
    @inline def completeMigrationFuture(params: CompleteMigrationMessage): Future[CompleteMigrationResponse] =
      service.completeMigration(params).promise().toFuture
    @inline def copySnapshotFuture(params: CopySnapshotMessage): Future[CopySnapshotResult] =
      service.copySnapshot(params).promise().toFuture
    @inline def createCacheClusterFuture(params: CreateCacheClusterMessage): Future[CreateCacheClusterResult] =
      service.createCacheCluster(params).promise().toFuture
    @inline def createCacheParameterGroupFuture(
        params: CreateCacheParameterGroupMessage
    ): Future[CreateCacheParameterGroupResult] = service.createCacheParameterGroup(params).promise().toFuture
    @inline def createCacheSecurityGroupFuture(
        params: CreateCacheSecurityGroupMessage
    ): Future[CreateCacheSecurityGroupResult] = service.createCacheSecurityGroup(params).promise().toFuture
    @inline def createCacheSubnetGroupFuture(
        params: CreateCacheSubnetGroupMessage
    ): Future[CreateCacheSubnetGroupResult] = service.createCacheSubnetGroup(params).promise().toFuture
    @inline def createReplicationGroupFuture(
        params: CreateReplicationGroupMessage
    ): Future[CreateReplicationGroupResult] = service.createReplicationGroup(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotMessage): Future[CreateSnapshotResult] =
      service.createSnapshot(params).promise().toFuture
    @inline def decreaseReplicaCountFuture(params: DecreaseReplicaCountMessage): Future[DecreaseReplicaCountResult] =
      service.decreaseReplicaCount(params).promise().toFuture
    @inline def deleteCacheClusterFuture(params: DeleteCacheClusterMessage): Future[DeleteCacheClusterResult] =
      service.deleteCacheCluster(params).promise().toFuture
    @inline def deleteCacheParameterGroupFuture(params: DeleteCacheParameterGroupMessage): Future[js.Object] =
      service.deleteCacheParameterGroup(params).promise().toFuture
    @inline def deleteCacheSecurityGroupFuture(params: DeleteCacheSecurityGroupMessage): Future[js.Object] =
      service.deleteCacheSecurityGroup(params).promise().toFuture
    @inline def deleteCacheSubnetGroupFuture(params: DeleteCacheSubnetGroupMessage): Future[js.Object] =
      service.deleteCacheSubnetGroup(params).promise().toFuture
    @inline def deleteReplicationGroupFuture(
        params: DeleteReplicationGroupMessage
    ): Future[DeleteReplicationGroupResult] = service.deleteReplicationGroup(params).promise().toFuture
    @inline def deleteSnapshotFuture(params: DeleteSnapshotMessage): Future[DeleteSnapshotResult] =
      service.deleteSnapshot(params).promise().toFuture
    @inline def describeCacheClustersFuture(params: DescribeCacheClustersMessage): Future[CacheClusterMessage] =
      service.describeCacheClusters(params).promise().toFuture
    @inline def describeCacheEngineVersionsFuture(
        params: DescribeCacheEngineVersionsMessage
    ): Future[CacheEngineVersionMessage] = service.describeCacheEngineVersions(params).promise().toFuture
    @inline def describeCacheParameterGroupsFuture(
        params: DescribeCacheParameterGroupsMessage
    ): Future[CacheParameterGroupsMessage] = service.describeCacheParameterGroups(params).promise().toFuture
    @inline def describeCacheParametersFuture(
        params: DescribeCacheParametersMessage
    ): Future[CacheParameterGroupDetails] = service.describeCacheParameters(params).promise().toFuture
    @inline def describeCacheSecurityGroupsFuture(
        params: DescribeCacheSecurityGroupsMessage
    ): Future[CacheSecurityGroupMessage] = service.describeCacheSecurityGroups(params).promise().toFuture
    @inline def describeCacheSubnetGroupsFuture(
        params: DescribeCacheSubnetGroupsMessage
    ): Future[CacheSubnetGroupMessage] = service.describeCacheSubnetGroups(params).promise().toFuture
    @inline def describeEngineDefaultParametersFuture(
        params: DescribeEngineDefaultParametersMessage
    ): Future[DescribeEngineDefaultParametersResult] =
      service.describeEngineDefaultParameters(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] =
      service.describeEvents(params).promise().toFuture
    @inline def describeReplicationGroupsFuture(
        params: DescribeReplicationGroupsMessage
    ): Future[ReplicationGroupMessage] = service.describeReplicationGroups(params).promise().toFuture
    @inline def describeReservedCacheNodesFuture(
        params: DescribeReservedCacheNodesMessage
    ): Future[ReservedCacheNodeMessage] = service.describeReservedCacheNodes(params).promise().toFuture
    @inline def describeReservedCacheNodesOfferingsFuture(
        params: DescribeReservedCacheNodesOfferingsMessage
    ): Future[ReservedCacheNodesOfferingMessage] =
      service.describeReservedCacheNodesOfferings(params).promise().toFuture
    @inline def describeServiceUpdatesFuture(params: DescribeServiceUpdatesMessage): Future[ServiceUpdatesMessage] =
      service.describeServiceUpdates(params).promise().toFuture
    @inline def describeSnapshotsFuture(params: DescribeSnapshotsMessage): Future[DescribeSnapshotsListMessage] =
      service.describeSnapshots(params).promise().toFuture
    @inline def describeUpdateActionsFuture(params: DescribeUpdateActionsMessage): Future[UpdateActionsMessage] =
      service.describeUpdateActions(params).promise().toFuture
    @inline def increaseReplicaCountFuture(params: IncreaseReplicaCountMessage): Future[IncreaseReplicaCountResult] =
      service.increaseReplicaCount(params).promise().toFuture
    @inline def listAllowedNodeTypeModificationsFuture(
        params: ListAllowedNodeTypeModificationsMessage
    ): Future[AllowedNodeTypeModificationsMessage] = service.listAllowedNodeTypeModifications(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[TagListMessage] =
      service.listTagsForResource(params).promise().toFuture
    @inline def modifyCacheClusterFuture(params: ModifyCacheClusterMessage): Future[ModifyCacheClusterResult] =
      service.modifyCacheCluster(params).promise().toFuture
    @inline def modifyCacheParameterGroupFuture(
        params: ModifyCacheParameterGroupMessage
    ): Future[CacheParameterGroupNameMessage] = service.modifyCacheParameterGroup(params).promise().toFuture
    @inline def modifyCacheSubnetGroupFuture(
        params: ModifyCacheSubnetGroupMessage
    ): Future[ModifyCacheSubnetGroupResult] = service.modifyCacheSubnetGroup(params).promise().toFuture
    @inline def modifyReplicationGroupFuture(
        params: ModifyReplicationGroupMessage
    ): Future[ModifyReplicationGroupResult] = service.modifyReplicationGroup(params).promise().toFuture
    @inline def modifyReplicationGroupShardConfigurationFuture(
        params: ModifyReplicationGroupShardConfigurationMessage
    ): Future[ModifyReplicationGroupShardConfigurationResult] =
      service.modifyReplicationGroupShardConfiguration(params).promise().toFuture
    @inline def purchaseReservedCacheNodesOfferingFuture(
        params: PurchaseReservedCacheNodesOfferingMessage
    ): Future[PurchaseReservedCacheNodesOfferingResult] =
      service.purchaseReservedCacheNodesOffering(params).promise().toFuture
    @inline def rebootCacheClusterFuture(params: RebootCacheClusterMessage): Future[RebootCacheClusterResult] =
      service.rebootCacheCluster(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[TagListMessage] =
      service.removeTagsFromResource(params).promise().toFuture
    @inline def resetCacheParameterGroupFuture(
        params: ResetCacheParameterGroupMessage
    ): Future[CacheParameterGroupNameMessage] = service.resetCacheParameterGroup(params).promise().toFuture
    @inline def revokeCacheSecurityGroupIngressFuture(
        params: RevokeCacheSecurityGroupIngressMessage
    ): Future[RevokeCacheSecurityGroupIngressResult] =
      service.revokeCacheSecurityGroupIngress(params).promise().toFuture
    @inline def startMigrationFuture(params: StartMigrationMessage): Future[StartMigrationResponse] =
      service.startMigration(params).promise().toFuture
    @inline def testFailoverFuture(params: TestFailoverMessage): Future[TestFailoverResult] =
      service.testFailover(params).promise().toFuture
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
    ): Request[AuthorizeCacheSecurityGroupIngressResult]                                                   = js.native
    def batchApplyUpdateAction(params: BatchApplyUpdateActionMessage): Request[UpdateActionResultsMessage] = js.native
    def batchStopUpdateAction(params: BatchStopUpdateActionMessage): Request[UpdateActionResultsMessage]   = js.native
    def completeMigration(params: CompleteMigrationMessage): Request[CompleteMigrationResponse]            = js.native
    def copySnapshot(params: CopySnapshotMessage): Request[CopySnapshotResult]                             = js.native
    def createCacheCluster(params: CreateCacheClusterMessage): Request[CreateCacheClusterResult]           = js.native
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
    def describeServiceUpdates(params: DescribeServiceUpdatesMessage): Request[ServiceUpdatesMessage]  = js.native
    def describeSnapshots(params: DescribeSnapshotsMessage): Request[DescribeSnapshotsListMessage]     = js.native
    def describeUpdateActions(params: DescribeUpdateActionsMessage): Request[UpdateActionsMessage]     = js.native
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
    ): Request[RevokeCacheSecurityGroupIngressResult]                                  = js.native
    def startMigration(params: StartMigrationMessage): Request[StartMigrationResponse] = js.native
    def testFailover(params: TestFailoverMessage): Request[TestFailoverResult]         = js.native
  }

  @js.native
  sealed trait AZMode extends js.Any
  object AZMode extends js.Object {
    val `single-az` = "single-az".asInstanceOf[AZMode]
    val `cross-az`  = "cross-az".asInstanceOf[AZMode]

    val values = js.Object.freeze(js.Array(`single-az`, `cross-az`))
  }

  /**
    * Represents the input of an AddTagsToResource operation.
    */
  @js.native
  @Factory
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  /**
    * Represents the allowed node types you can use to modify your cluster or replication group.
    */
  @js.native
  @Factory
  trait AllowedNodeTypeModificationsMessage extends js.Object {
    var ScaleDownModifications: js.UndefOr[NodeTypeList]
    var ScaleUpModifications: js.UndefOr[NodeTypeList]
  }

  @js.native
  sealed trait AuthTokenUpdateStatus extends js.Any
  object AuthTokenUpdateStatus extends js.Object {
    val SETTING  = "SETTING".asInstanceOf[AuthTokenUpdateStatus]
    val ROTATING = "ROTATING".asInstanceOf[AuthTokenUpdateStatus]

    val values = js.Object.freeze(js.Array(SETTING, ROTATING))
  }

  @js.native
  sealed trait AuthTokenUpdateStrategyType extends js.Any
  object AuthTokenUpdateStrategyType extends js.Object {
    val SET    = "SET".asInstanceOf[AuthTokenUpdateStrategyType]
    val ROTATE = "ROTATE".asInstanceOf[AuthTokenUpdateStrategyType]

    val values = js.Object.freeze(js.Array(SET, ROTATE))
  }

  /**
    * Represents the input of an AuthorizeCacheSecurityGroupIngress operation.
    */
  @js.native
  @Factory
  trait AuthorizeCacheSecurityGroupIngressMessage extends js.Object {
    var CacheSecurityGroupName: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  @js.native
  @Factory
  trait AuthorizeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  @js.native
  sealed trait AutomaticFailoverStatus extends js.Any
  object AutomaticFailoverStatus extends js.Object {
    val enabled   = "enabled".asInstanceOf[AutomaticFailoverStatus]
    val disabled  = "disabled".asInstanceOf[AutomaticFailoverStatus]
    val enabling  = "enabling".asInstanceOf[AutomaticFailoverStatus]
    val disabling = "disabling".asInstanceOf[AutomaticFailoverStatus]

    val values = js.Object.freeze(js.Array(enabled, disabled, enabling, disabling))
  }

  /**
    * Describes an Availability Zone in which the cluster is launched.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait BatchApplyUpdateActionMessage extends js.Object {
    var ServiceUpdateName: String
    var CacheClusterIds: js.UndefOr[CacheClusterIdList]
    var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList]
  }

  @js.native
  @Factory
  trait BatchStopUpdateActionMessage extends js.Object {
    var ServiceUpdateName: String
    var CacheClusterIds: js.UndefOr[CacheClusterIdList]
    var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList]
  }

  /**
    * Contains all of the attributes of a specific cluster.
    */
  @js.native
  @Factory
  trait CacheCluster extends js.Object {
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenLastModifiedDate: js.UndefOr[TStamp]
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

  /**
    * Represents the output of a <code>DescribeCacheClusters</code> operation.
    */
  @js.native
  @Factory
  trait CacheClusterMessage extends js.Object {
    var CacheClusters: js.UndefOr[CacheClusterList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Provides all of the details about a particular cache engine version.
    */
  @js.native
  @Factory
  trait CacheEngineVersion extends js.Object {
    var CacheEngineDescription: js.UndefOr[String]
    var CacheEngineVersionDescription: js.UndefOr[String]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
  }

  /**
    * Represents the output of a <a>DescribeCacheEngineVersions</a> operation.
    */
  @js.native
  @Factory
  trait CacheEngineVersionMessage extends js.Object {
    var CacheEngineVersions: js.UndefOr[CacheEngineVersionList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Represents an individual cache node within a cluster. Each cache node runs its own instance of the cluster's protocol-compliant caching software - either Memcached or Redis.
    *  The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.
    * * General purpose:
    * <li> Current generation:
    *  ```M5 node types:``` <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>, <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>, <code>cache.m5.24xlarge</code>
    *  ```M4 node types:``` <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
    *  ```T2 node types:``` <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
    *  * Previous generation: (not recommended)
    *  ```T1 node types:``` <code>cache.t1.micro</code>
    *  ```M1 node types:``` <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
    *  ```M3 node types:``` <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
    * </li> * Compute optimized:
    * <li> Previous generation: (not recommended)
    *  ```C1 node types:``` <code>cache.c1.xlarge</code>
    * </li> * Memory optimized:
    * <li> Current generation:
    *  ```R5 node types:``` <code>cache.r5.large</code>, <code>cache.r5.xlarge</code>, <code>cache.r5.2xlarge</code>, <code>cache.r5.4xlarge</code>, <code>cache.r5.12xlarge</code>, <code>cache.r5.24xlarge</code>
    *  ```R4 node types:``` <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
    *  * Previous generation: (not recommended)
    *  ```M2 node types:``` <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
    *  ```R3 node types:``` <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
    * </li>```Additional node type info```
    * * All current generation instance types are created in Amazon VPC by default.
    *  * Redis append-only files (AOF) are not supported for T1 or T2 instances.
    *  * Redis Multi-AZ with automatic failover is not supported on T1 instances.
    *  * Redis configuration variables <code>appendonly</code> and <code>appendfsync</code> are not supported on Redis version 2.8.22 and later.
    */
  @js.native
  @Factory
  trait CacheNode extends js.Object {
    var CacheNodeCreateTime: js.UndefOr[TStamp]
    var CacheNodeId: js.UndefOr[String]
    var CacheNodeStatus: js.UndefOr[String]
    var CustomerAvailabilityZone: js.UndefOr[String]
    var Endpoint: js.UndefOr[Endpoint]
    var ParameterGroupStatus: js.UndefOr[String]
    var SourceCacheNodeId: js.UndefOr[String]
  }

  /**
    * A parameter that has a different value for each cache node type it is applied to. For example, in a Redis cluster, a <code>cache.m1.large</code> cache node type would have a larger <code>maxmemory</code> value than a <code>cache.m1.small</code> type.
    */
  @js.native
  @Factory
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

  /**
    * A value that applies only to a certain cache node type.
    */
  @js.native
  @Factory
  trait CacheNodeTypeSpecificValue extends js.Object {
    var CacheNodeType: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * The status of the service update on the cache node
    */
  @js.native
  @Factory
  trait CacheNodeUpdateStatus extends js.Object {
    var CacheNodeId: js.UndefOr[String]
    var NodeDeletionDate: js.UndefOr[TStamp]
    var NodeUpdateEndDate: js.UndefOr[TStamp]
    var NodeUpdateInitiatedBy: js.UndefOr[NodeUpdateInitiatedBy]
    var NodeUpdateInitiatedDate: js.UndefOr[TStamp]
    var NodeUpdateStartDate: js.UndefOr[TStamp]
    var NodeUpdateStatus: js.UndefOr[NodeUpdateStatus]
    var NodeUpdateStatusModifiedDate: js.UndefOr[TStamp]
  }

  /**
    * Represents the output of a <code>CreateCacheParameterGroup</code> operation.
    */
  @js.native
  @Factory
  trait CacheParameterGroup extends js.Object {
    var CacheParameterGroupFamily: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  /**
    * Represents the output of a <code>DescribeCacheParameters</code> operation.
    */
  @js.native
  @Factory
  trait CacheParameterGroupDetails extends js.Object {
    var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  /**
    * Represents the output of one of the following operations:
    * * <code>ModifyCacheParameterGroup</code>
    *  * <code>ResetCacheParameterGroup</code>
    */
  @js.native
  @Factory
  trait CacheParameterGroupNameMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
  }

  /**
    * Status of the cache parameter group.
    */
  @js.native
  @Factory
  trait CacheParameterGroupStatus extends js.Object {
    var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList]
    var CacheParameterGroupName: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
  }

  /**
    * Represents the output of a <code>DescribeCacheParameterGroups</code> operation.
    */
  @js.native
  @Factory
  trait CacheParameterGroupsMessage extends js.Object {
    var CacheParameterGroups: js.UndefOr[CacheParameterGroupList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Represents the output of one of the following operations:
    * * <code>AuthorizeCacheSecurityGroupIngress</code>
    *  * <code>CreateCacheSecurityGroup</code>
    *  * <code>RevokeCacheSecurityGroupIngress</code>
    */
  @js.native
  @Factory
  trait CacheSecurityGroup extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var OwnerId: js.UndefOr[String]
  }

  /**
    * Represents a cluster's status within a particular cache security group.
    */
  @js.native
  @Factory
  trait CacheSecurityGroupMembership extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Represents the output of a <code>DescribeCacheSecurityGroups</code> operation.
    */
  @js.native
  @Factory
  trait CacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroups: js.UndefOr[CacheSecurityGroups]
    var Marker: js.UndefOr[String]
  }

  /**
    * Represents the output of one of the following operations:
    * * <code>CreateCacheSubnetGroup</code>
    *  * <code>ModifyCacheSubnetGroup</code>
    */
  @js.native
  @Factory
  trait CacheSubnetGroup extends js.Object {
    var CacheSubnetGroupDescription: js.UndefOr[String]
    var CacheSubnetGroupName: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Represents the output of a <code>DescribeCacheSubnetGroups</code> operation.
    */
  @js.native
  @Factory
  trait CacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroups: js.UndefOr[CacheSubnetGroups]
    var Marker: js.UndefOr[String]
  }

  @js.native
  sealed trait ChangeType extends js.Any
  object ChangeType extends js.Object {
    val immediate         = "immediate".asInstanceOf[ChangeType]
    val `requires-reboot` = "requires-reboot".asInstanceOf[ChangeType]

    val values = js.Object.freeze(js.Array(immediate, `requires-reboot`))
  }

  @js.native
  @Factory
  trait CompleteMigrationMessage extends js.Object {
    var ReplicationGroupId: String
    var Force: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CompleteMigrationResponse extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * Node group (shard) configuration options when adding or removing replicas. Each node group (shard) configuration has the following members: NodeGroupId, NewReplicaCount, and PreferredAvailabilityZones.
    */
  @js.native
  @Factory
  trait ConfigureShard extends js.Object {
    var NewReplicaCount: Int
    var NodeGroupId: AllowedNodeGroupId
    var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList]
  }

  /**
    * Represents the input of a <code>CopySnapshotMessage</code> operation.
    */
  @js.native
  @Factory
  trait CopySnapshotMessage extends js.Object {
    var SourceSnapshotName: String
    var TargetSnapshotName: String
    var KmsKeyId: js.UndefOr[String]
    var TargetBucket: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CopySnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  /**
    * Represents the input of a CreateCacheCluster operation.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  /**
    * Represents the input of a <code>CreateCacheParameterGroup</code> operation.
    */
  @js.native
  @Factory
  trait CreateCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupFamily: String
    var CacheParameterGroupName: String
    var Description: String
  }

  @js.native
  @Factory
  trait CreateCacheParameterGroupResult extends js.Object {
    var CacheParameterGroup: js.UndefOr[CacheParameterGroup]
  }

  /**
    * Represents the input of a <code>CreateCacheSecurityGroup</code> operation.
    */
  @js.native
  @Factory
  trait CreateCacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroupName: String
    var Description: String
  }

  @js.native
  @Factory
  trait CreateCacheSecurityGroupResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  /**
    * Represents the input of a <code>CreateCacheSubnetGroup</code> operation.
    */
  @js.native
  @Factory
  trait CreateCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupDescription: String
    var CacheSubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
  }

  @js.native
  @Factory
  trait CreateCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup]
  }

  /**
    * Represents the input of a <code>CreateReplicationGroup</code> operation.
    */
  @js.native
  @Factory
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
    var KmsKeyId: js.UndefOr[String]
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

  @js.native
  @Factory
  trait CreateReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * Represents the input of a <code>CreateSnapshot</code> operation.
    */
  @js.native
  @Factory
  trait CreateSnapshotMessage extends js.Object {
    var SnapshotName: String
    var CacheClusterId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  /**
    * The endpoint from which data should be migrated.
    */
  @js.native
  @Factory
  trait CustomerNodeEndpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DecreaseReplicaCountMessage extends js.Object {
    var ApplyImmediately: Boolean
    var ReplicationGroupId: String
    var NewReplicaCount: js.UndefOr[IntegerOptional]
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList]
    var ReplicasToRemove: js.UndefOr[RemoveReplicasList]
  }

  @js.native
  @Factory
  trait DecreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * Represents the input of a <code>DeleteCacheCluster</code> operation.
    */
  @js.native
  @Factory
  trait DeleteCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var FinalSnapshotIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  /**
    * Represents the input of a <code>DeleteCacheParameterGroup</code> operation.
    */
  @js.native
  @Factory
  trait DeleteCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
  }

  /**
    * Represents the input of a <code>DeleteCacheSecurityGroup</code> operation.
    */
  @js.native
  @Factory
  trait DeleteCacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroupName: String
  }

  /**
    * Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.
    */
  @js.native
  @Factory
  trait DeleteCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: String
  }

  /**
    * Represents the input of a <code>DeleteReplicationGroup</code> operation.
    */
  @js.native
  @Factory
  trait DeleteReplicationGroupMessage extends js.Object {
    var ReplicationGroupId: String
    var FinalSnapshotIdentifier: js.UndefOr[String]
    var RetainPrimaryCluster: js.UndefOr[BooleanOptional]
  }

  @js.native
  @Factory
  trait DeleteReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * Represents the input of a <code>DeleteSnapshot</code> operation.
    */
  @js.native
  @Factory
  trait DeleteSnapshotMessage extends js.Object {
    var SnapshotName: String
  }

  @js.native
  @Factory
  trait DeleteSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  /**
    * Represents the input of a <code>DescribeCacheClusters</code> operation.
    */
  @js.native
  @Factory
  trait DescribeCacheClustersMessage extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional]
    var ShowCacheNodeInfo: js.UndefOr[BooleanOptional]
  }

  /**
    * Represents the input of a <code>DescribeCacheEngineVersions</code> operation.
    */
  @js.native
  @Factory
  trait DescribeCacheEngineVersionsMessage extends js.Object {
    var CacheParameterGroupFamily: js.UndefOr[String]
    var DefaultOnly: js.UndefOr[Boolean]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input of a <code>DescribeCacheParameterGroups</code> operation.
    */
  @js.native
  @Factory
  trait DescribeCacheParameterGroupsMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input of a <code>DescribeCacheParameters</code> operation.
    */
  @js.native
  @Factory
  trait DescribeCacheParametersMessage extends js.Object {
    var CacheParameterGroupName: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Source: js.UndefOr[String]
  }

  /**
    * Represents the input of a <code>DescribeCacheSecurityGroups</code> operation.
    */
  @js.native
  @Factory
  trait DescribeCacheSecurityGroupsMessage extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input of a <code>DescribeCacheSubnetGroups</code> operation.
    */
  @js.native
  @Factory
  trait DescribeCacheSubnetGroupsMessage extends js.Object {
    var CacheSubnetGroupName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * Represents the input of a <code>DescribeEngineDefaultParameters</code> operation.
    */
  @js.native
  @Factory
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    var CacheParameterGroupFamily: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  /**
    * Represents the input of a <code>DescribeEvents</code> operation.
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
    * Represents the input of a <code>DescribeReplicationGroups</code> operation.
    */
  @js.native
  @Factory
  trait DescribeReplicationGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationGroupId: js.UndefOr[String]
  }

  /**
    * Represents the input of a <code>DescribeReservedCacheNodes</code> operation.
    */
  @js.native
  @Factory
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

  /**
    * Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.
    */
  @js.native
  @Factory
  trait DescribeReservedCacheNodesOfferingsMessage extends js.Object {
    var CacheNodeType: js.UndefOr[String]
    var Duration: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var OfferingType: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeServiceUpdatesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ServiceUpdateName: js.UndefOr[String]
    var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList]
  }

  /**
    * Represents the output of a <code>DescribeSnapshots</code> operation.
    */
  @js.native
  @Factory
  trait DescribeSnapshotsListMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Snapshots: js.UndefOr[SnapshotList]
  }

  /**
    * Represents the input of a <code>DescribeSnapshotsMessage</code> operation.
    */
  @js.native
  @Factory
  trait DescribeSnapshotsMessage extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationGroupId: js.UndefOr[String]
    var ShowNodeGroupConfig: js.UndefOr[BooleanOptional]
    var SnapshotName: js.UndefOr[String]
    var SnapshotSource: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeUpdateActionsMessage extends js.Object {
    var CacheClusterIds: js.UndefOr[CacheClusterIdList]
    var Engine: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList]
    var ServiceUpdateName: js.UndefOr[String]
    var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList]
    var ServiceUpdateTimeRange: js.UndefOr[TimeRangeFilter]
    var ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional]
    var UpdateActionStatus: js.UndefOr[UpdateActionStatusList]
  }

  /**
    * Provides ownership and status information for an Amazon EC2 security group.
    */
  @js.native
  @Factory
  trait EC2SecurityGroup extends js.Object {
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Represents the information required for client programs to connect to a cache node.
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  /**
    * Represents the output of a <code>DescribeEngineDefaultParameters</code> operation.
    */
  @js.native
  @Factory
  trait EngineDefaults extends js.Object {
    var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  /**
    * Represents a single occurrence of something interesting within the system. Some examples of events are creating a cluster, adding or removing a cache node, or rebooting a node.
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var Message: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  /**
    * Represents the output of a <code>DescribeEvents</code> operation.
    */
  @js.native
  @Factory
  trait EventsMessage extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait IncreaseReplicaCountMessage extends js.Object {
    var ApplyImmediately: Boolean
    var ReplicationGroupId: String
    var NewReplicaCount: js.UndefOr[IntegerOptional]
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList]
  }

  @js.native
  @Factory
  trait IncreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.
    */
  @js.native
  @Factory
  trait ListAllowedNodeTypeModificationsMessage extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
  }

  /**
    * The input parameters for the <code>ListTagsForResource</code> operation.
    */
  @js.native
  @Factory
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
  }

  /**
    * Represents the input of a <code>ModifyCacheCluster</code> operation.
    */
  @js.native
  @Factory
  trait ModifyCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var AZMode: js.UndefOr[AZMode]
    var ApplyImmediately: js.UndefOr[Boolean]
    var AuthToken: js.UndefOr[String]
    var AuthTokenUpdateStrategy: js.UndefOr[AuthTokenUpdateStrategyType]
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

  @js.native
  @Factory
  trait ModifyCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  /**
    * Represents the input of a <code>ModifyCacheParameterGroup</code> operation.
    */
  @js.native
  @Factory
  trait ModifyCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
    var ParameterNameValues: ParameterNameValueList
  }

  /**
    * Represents the input of a <code>ModifyCacheSubnetGroup</code> operation.
    */
  @js.native
  @Factory
  trait ModifyCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: String
    var CacheSubnetGroupDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  @js.native
  @Factory
  trait ModifyCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup]
  }

  /**
    * Represents the input of a <code>ModifyReplicationGroups</code> operation.
    */
  @js.native
  @Factory
  trait ModifyReplicationGroupMessage extends js.Object {
    var ReplicationGroupId: String
    var ApplyImmediately: js.UndefOr[Boolean]
    var AuthToken: js.UndefOr[String]
    var AuthTokenUpdateStrategy: js.UndefOr[AuthTokenUpdateStrategyType]
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

  @js.native
  @Factory
  trait ModifyReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * Represents the input for a <code>ModifyReplicationGroupShardConfiguration</code> operation.
    */
  @js.native
  @Factory
  trait ModifyReplicationGroupShardConfigurationMessage extends js.Object {
    var ApplyImmediately: Boolean
    var NodeGroupCount: Int
    var ReplicationGroupId: String
    var NodeGroupsToRemove: js.UndefOr[NodeGroupsToRemoveList]
    var NodeGroupsToRetain: js.UndefOr[NodeGroupsToRetainList]
    var ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList]
  }

  @js.native
  @Factory
  trait ModifyReplicationGroupShardConfigurationResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * Represents a collection of cache nodes in a replication group. One node in the node group is the read/write primary node. All the other nodes are read-only Replica nodes.
    */
  @js.native
  @Factory
  trait NodeGroup extends js.Object {
    var NodeGroupId: js.UndefOr[String]
    var NodeGroupMembers: js.UndefOr[NodeGroupMemberList]
    var PrimaryEndpoint: js.UndefOr[Endpoint]
    var ReaderEndpoint: js.UndefOr[Endpoint]
    var Slots: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Node group (shard) configuration options. Each node group (shard) configuration has the following: <code>Slots</code>, <code>PrimaryAvailabilityZone</code>, <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>.
    */
  @js.native
  @Factory
  trait NodeGroupConfiguration extends js.Object {
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId]
    var PrimaryAvailabilityZone: js.UndefOr[String]
    var ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList]
    var ReplicaCount: js.UndefOr[IntegerOptional]
    var Slots: js.UndefOr[String]
  }

  /**
    * Represents a single node within a node group (shard).
    */
  @js.native
  @Factory
  trait NodeGroupMember extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeId: js.UndefOr[String]
    var CurrentRole: js.UndefOr[String]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var ReadEndpoint: js.UndefOr[Endpoint]
  }

  /**
    * The status of the service update on the node group member
    */
  @js.native
  @Factory
  trait NodeGroupMemberUpdateStatus extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeId: js.UndefOr[String]
    var NodeDeletionDate: js.UndefOr[TStamp]
    var NodeUpdateEndDate: js.UndefOr[TStamp]
    var NodeUpdateInitiatedBy: js.UndefOr[NodeUpdateInitiatedBy]
    var NodeUpdateInitiatedDate: js.UndefOr[TStamp]
    var NodeUpdateStartDate: js.UndefOr[TStamp]
    var NodeUpdateStatus: js.UndefOr[NodeUpdateStatus]
    var NodeUpdateStatusModifiedDate: js.UndefOr[TStamp]
  }

  /**
    * The status of the service update on the node group
    */
  @js.native
  @Factory
  trait NodeGroupUpdateStatus extends js.Object {
    var NodeGroupId: js.UndefOr[String]
    var NodeGroupMemberUpdateStatus: js.UndefOr[NodeGroupMemberUpdateStatusList]
  }

  /**
    * Represents an individual cache node in a snapshot of a cluster.
    */
  @js.native
  @Factory
  trait NodeSnapshot extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeCreateTime: js.UndefOr[TStamp]
    var CacheNodeId: js.UndefOr[String]
    var CacheSize: js.UndefOr[String]
    var NodeGroupConfiguration: js.UndefOr[NodeGroupConfiguration]
    var NodeGroupId: js.UndefOr[String]
    var SnapshotCreateTime: js.UndefOr[TStamp]
  }

  @js.native
  sealed trait NodeUpdateInitiatedBy extends js.Any
  object NodeUpdateInitiatedBy extends js.Object {
    val system   = "system".asInstanceOf[NodeUpdateInitiatedBy]
    val customer = "customer".asInstanceOf[NodeUpdateInitiatedBy]

    val values = js.Object.freeze(js.Array(system, customer))
  }

  @js.native
  sealed trait NodeUpdateStatus extends js.Any
  object NodeUpdateStatus extends js.Object {
    val `not-applied`      = "not-applied".asInstanceOf[NodeUpdateStatus]
    val `waiting-to-start` = "waiting-to-start".asInstanceOf[NodeUpdateStatus]
    val `in-progress`      = "in-progress".asInstanceOf[NodeUpdateStatus]
    val stopping           = "stopping".asInstanceOf[NodeUpdateStatus]
    val stopped            = "stopped".asInstanceOf[NodeUpdateStatus]
    val complete           = "complete".asInstanceOf[NodeUpdateStatus]

    val values =
      js.Object.freeze(js.Array(`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete))
  }

  /**
    * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to subscribers using Amazon Simple Notification Service (SNS).
    */
  @js.native
  @Factory
  trait NotificationConfiguration extends js.Object {
    var TopicArn: js.UndefOr[String]
    var TopicStatus: js.UndefOr[String]
  }

  /**
    * Describes an individual setting that controls some aspect of ElastiCache behavior.
    */
  @js.native
  @Factory
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

  /**
    * Describes a name-value pair that is used to update the value of a parameter.
    */
  @js.native
  @Factory
  trait ParameterNameValue extends js.Object {
    var ParameterName: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
  }

  @js.native
  sealed trait PendingAutomaticFailoverStatus extends js.Any
  object PendingAutomaticFailoverStatus extends js.Object {
    val enabled  = "enabled".asInstanceOf[PendingAutomaticFailoverStatus]
    val disabled = "disabled".asInstanceOf[PendingAutomaticFailoverStatus]

    val values = js.Object.freeze(js.Array(enabled, disabled))
  }

  /**
    * A group of settings that are applied to the cluster in the future, or that are currently being applied.
    */
  @js.native
  @Factory
  trait PendingModifiedValues extends js.Object {
    var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus]
    var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList]
    var CacheNodeType: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
  }

  /**
    * Update action that has been processed for the corresponding apply/stop request
    */
  @js.native
  @Factory
  trait ProcessedUpdateAction extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var ServiceUpdateName: js.UndefOr[String]
    var UpdateActionStatus: js.UndefOr[UpdateActionStatus]
  }

  /**
    * Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.
    */
  @js.native
  @Factory
  trait PurchaseReservedCacheNodesOfferingMessage extends js.Object {
    var ReservedCacheNodesOfferingId: String
    var CacheNodeCount: js.UndefOr[IntegerOptional]
    var ReservedCacheNodeId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
    var ReservedCacheNode: js.UndefOr[ReservedCacheNode]
  }

  /**
    * Represents the input of a <code>RebootCacheCluster</code> operation.
    */
  @js.native
  @Factory
  trait RebootCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var CacheNodeIdsToReboot: CacheNodeIdsList
  }

  @js.native
  @Factory
  trait RebootCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  /**
    * Contains the specific price and frequency of a recurring charges for a reserved cache node, or for a reserved cache node offering.
    */
  @js.native
  @Factory
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  /**
    * Represents the input of a <code>RemoveTagsFromResource</code> operation.
    */
  @js.native
  @Factory
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  /**
    * Contains all of the attributes of a specific Redis replication group.
    */
  @js.native
  @Factory
  trait ReplicationGroup extends js.Object {
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenLastModifiedDate: js.UndefOr[TStamp]
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus]
    var CacheNodeType: js.UndefOr[String]
    var ClusterEnabled: js.UndefOr[BooleanOptional]
    var ConfigurationEndpoint: js.UndefOr[Endpoint]
    var Description: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
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

  /**
    * Represents the output of a <code>DescribeReplicationGroups</code> operation.
    */
  @js.native
  @Factory
  trait ReplicationGroupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationGroups: js.UndefOr[ReplicationGroupList]
  }

  /**
    * The settings to be applied to the Redis replication group, either immediately or during the next maintenance window.
    */
  @js.native
  @Factory
  trait ReplicationGroupPendingModifiedValues extends js.Object {
    var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus]
    var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus]
    var PrimaryClusterId: js.UndefOr[String]
    var Resharding: js.UndefOr[ReshardingStatus]
  }

  /**
    * Represents the output of a <code>PurchaseReservedCacheNodesOffering</code> operation.
    */
  @js.native
  @Factory
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

  /**
    * Represents the output of a <code>DescribeReservedCacheNodes</code> operation.
    */
  @js.native
  @Factory
  trait ReservedCacheNodeMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList]
  }

  /**
    * Describes all of the attributes of a reserved cache node offering.
    */
  @js.native
  @Factory
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

  /**
    * Represents the output of a <code>DescribeReservedCacheNodesOfferings</code> operation.
    */
  @js.native
  @Factory
  trait ReservedCacheNodesOfferingMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList]
  }

  /**
    * Represents the input of a <code>ResetCacheParameterGroup</code> operation.
    */
  @js.native
  @Factory
  trait ResetCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
    var ParameterNameValues: js.UndefOr[ParameterNameValueList]
    var ResetAllParameters: js.UndefOr[Boolean]
  }

  /**
    * A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the resharded cluster.
    */
  @js.native
  @Factory
  trait ReshardingConfiguration extends js.Object {
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId]
    var PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList]
  }

  /**
    * The status of an online resharding operation.
    */
  @js.native
  @Factory
  trait ReshardingStatus extends js.Object {
    var SlotMigration: js.UndefOr[SlotMigration]
  }

  /**
    * Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.
    */
  @js.native
  @Factory
  trait RevokeCacheSecurityGroupIngressMessage extends js.Object {
    var CacheSecurityGroupName: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  @js.native
  @Factory
  trait RevokeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  /**
    * Represents a single cache security group and its status.
    */
  @js.native
  @Factory
  trait SecurityGroupMembership extends js.Object {
    var SecurityGroupId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * An update that you can apply to your Redis clusters.
    */
  @js.native
  @Factory
  trait ServiceUpdate extends js.Object {
    var AutoUpdateAfterRecommendedApplyByDate: js.UndefOr[BooleanOptional]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var EstimatedUpdateTime: js.UndefOr[String]
    var ServiceUpdateDescription: js.UndefOr[String]
    var ServiceUpdateEndDate: js.UndefOr[TStamp]
    var ServiceUpdateName: js.UndefOr[String]
    var ServiceUpdateRecommendedApplyByDate: js.UndefOr[TStamp]
    var ServiceUpdateReleaseDate: js.UndefOr[TStamp]
    var ServiceUpdateSeverity: js.UndefOr[ServiceUpdateSeverity]
    var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatus]
    var ServiceUpdateType: js.UndefOr[ServiceUpdateType]
  }

  @js.native
  sealed trait ServiceUpdateSeverity extends js.Any
  object ServiceUpdateSeverity extends js.Object {
    val critical  = "critical".asInstanceOf[ServiceUpdateSeverity]
    val important = "important".asInstanceOf[ServiceUpdateSeverity]
    val medium    = "medium".asInstanceOf[ServiceUpdateSeverity]
    val low       = "low".asInstanceOf[ServiceUpdateSeverity]

    val values = js.Object.freeze(js.Array(critical, important, medium, low))
  }

  @js.native
  sealed trait ServiceUpdateStatus extends js.Any
  object ServiceUpdateStatus extends js.Object {
    val available = "available".asInstanceOf[ServiceUpdateStatus]
    val cancelled = "cancelled".asInstanceOf[ServiceUpdateStatus]
    val expired   = "expired".asInstanceOf[ServiceUpdateStatus]

    val values = js.Object.freeze(js.Array(available, cancelled, expired))
  }

  @js.native
  sealed trait ServiceUpdateType extends js.Any
  object ServiceUpdateType extends js.Object {
    val `security-update` = "security-update".asInstanceOf[ServiceUpdateType]

    val values = js.Object.freeze(js.Array(`security-update`))
  }

  @js.native
  @Factory
  trait ServiceUpdatesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ServiceUpdates: js.UndefOr[ServiceUpdateList]
  }

  @js.native
  sealed trait SlaMet extends js.Any
  object SlaMet extends js.Object {
    val yes   = "yes".asInstanceOf[SlaMet]
    val no    = "no".asInstanceOf[SlaMet]
    val `n/a` = "n/a".asInstanceOf[SlaMet]

    val values = js.Object.freeze(js.Array(yes, no, `n/a`))
  }

  /**
    * Represents the progress of an online resharding operation.
    */
  @js.native
  @Factory
  trait SlotMigration extends js.Object {
    var ProgressPercentage: js.UndefOr[Double]
  }

  /**
    * Represents a copy of an entire Redis cluster as of the time when the snapshot was taken.
    */
  @js.native
  @Factory
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
    var KmsKeyId: js.UndefOr[String]
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

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val `cache-cluster`         = "cache-cluster".asInstanceOf[SourceType]
    val `cache-parameter-group` = "cache-parameter-group".asInstanceOf[SourceType]
    val `cache-security-group`  = "cache-security-group".asInstanceOf[SourceType]
    val `cache-subnet-group`    = "cache-subnet-group".asInstanceOf[SourceType]
    val `replication-group`     = "replication-group".asInstanceOf[SourceType]

    val values = js.Object.freeze(
      js.Array(
        `cache-cluster`,
        `cache-parameter-group`,
        `cache-security-group`,
        `cache-subnet-group`,
        `replication-group`
      )
    )
  }

  @js.native
  @Factory
  trait StartMigrationMessage extends js.Object {
    var CustomerNodeEndpointList: CustomerNodeEndpointList
    var ReplicationGroupId: String
  }

  @js.native
  @Factory
  trait StartMigrationResponse extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * Represents the subnet associated with a cluster. This parameter refers to subnets defined in Amazon Virtual Private Cloud (Amazon VPC) and used with ElastiCache.
    */
  @js.native
  @Factory
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
  }

  /**
    * A cost allocation Tag that can be added to an ElastiCache cluster or replication group. Tags are composed of a Key/Value pair. A tag with a null Value is permitted.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * Represents the output from the <code>AddTagsToResource</code>, <code>ListTagsForResource</code>, and <code>RemoveTagsFromResource</code> operations.
    */
  @js.native
  @Factory
  trait TagListMessage extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait TestFailoverMessage extends js.Object {
    var NodeGroupId: AllowedNodeGroupId
    var ReplicationGroupId: String
  }

  @js.native
  @Factory
  trait TestFailoverResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  /**
    * Filters update actions from the service updates that are in available status during the time range.
    */
  @js.native
  @Factory
  trait TimeRangeFilter extends js.Object {
    var EndTime: js.UndefOr[TStamp]
    var StartTime: js.UndefOr[TStamp]
  }

  /**
    * Update action that has failed to be processed for the corresponding apply/stop request
    */
  @js.native
  @Factory
  trait UnprocessedUpdateAction extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var ErrorType: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var ServiceUpdateName: js.UndefOr[String]
  }

  /**
    * The status of the service update for a specific replication group
    */
  @js.native
  @Factory
  trait UpdateAction extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeUpdateStatus: js.UndefOr[CacheNodeUpdateStatusList]
    var Engine: js.UndefOr[String]
    var EstimatedUpdateTime: js.UndefOr[String]
    var NodeGroupUpdateStatus: js.UndefOr[NodeGroupUpdateStatusList]
    var NodesUpdated: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var ServiceUpdateName: js.UndefOr[String]
    var ServiceUpdateRecommendedApplyByDate: js.UndefOr[TStamp]
    var ServiceUpdateReleaseDate: js.UndefOr[TStamp]
    var ServiceUpdateSeverity: js.UndefOr[ServiceUpdateSeverity]
    var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatus]
    var ServiceUpdateType: js.UndefOr[ServiceUpdateType]
    var SlaMet: js.UndefOr[SlaMet]
    var UpdateActionAvailableDate: js.UndefOr[TStamp]
    var UpdateActionStatus: js.UndefOr[UpdateActionStatus]
    var UpdateActionStatusModifiedDate: js.UndefOr[TStamp]
  }

  @js.native
  @Factory
  trait UpdateActionResultsMessage extends js.Object {
    var ProcessedUpdateActions: js.UndefOr[ProcessedUpdateActionList]
    var UnprocessedUpdateActions: js.UndefOr[UnprocessedUpdateActionList]
  }

  @js.native
  sealed trait UpdateActionStatus extends js.Any
  object UpdateActionStatus extends js.Object {
    val `not-applied`      = "not-applied".asInstanceOf[UpdateActionStatus]
    val `waiting-to-start` = "waiting-to-start".asInstanceOf[UpdateActionStatus]
    val `in-progress`      = "in-progress".asInstanceOf[UpdateActionStatus]
    val stopping           = "stopping".asInstanceOf[UpdateActionStatus]
    val stopped            = "stopped".asInstanceOf[UpdateActionStatus]
    val complete           = "complete".asInstanceOf[UpdateActionStatus]

    val values =
      js.Object.freeze(js.Array(`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete))
  }

  @js.native
  @Factory
  trait UpdateActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var UpdateActions: js.UndefOr[UpdateActionList]
  }
}
