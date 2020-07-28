package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object elasticache {
  type AllowedNodeGroupId = String
  type AvailabilityZonesList = js.Array[String]
  type BooleanOptional = Boolean
  type CacheClusterIdList = js.Array[String]
  type CacheClusterList = js.Array[CacheCluster]
  type CacheEngineVersionList = js.Array[CacheEngineVersion]
  type CacheNodeIdsList = js.Array[String]
  type CacheNodeList = js.Array[CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList = js.Array[CacheNodeTypeSpecificValue]
  type CacheNodeUpdateStatusList = js.Array[CacheNodeUpdateStatus]
  type CacheParameterGroupList = js.Array[CacheParameterGroup]
  type CacheSecurityGroupMembershipList = js.Array[CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList = js.Array[String]
  type CacheSecurityGroups = js.Array[CacheSecurityGroup]
  type CacheSubnetGroups = js.Array[CacheSubnetGroup]
  type ClusterIdList = js.Array[String]
  type CustomerNodeEndpointList = js.Array[CustomerNodeEndpoint]
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EventList = js.Array[Event]
  type GlobalNodeGroupIdList = js.Array[String]
  type GlobalNodeGroupList = js.Array[GlobalNodeGroup]
  type GlobalReplicationGroupList = js.Array[GlobalReplicationGroup]
  type GlobalReplicationGroupMemberList = js.Array[GlobalReplicationGroupMember]
  type IntegerOptional = Int
  type KeyList = js.Array[String]
  type NodeGroupConfigurationList = js.Array[NodeGroupConfiguration]
  type NodeGroupList = js.Array[NodeGroup]
  type NodeGroupMemberList = js.Array[NodeGroupMember]
  type NodeGroupMemberUpdateStatusList = js.Array[NodeGroupMemberUpdateStatus]
  type NodeGroupUpdateStatusList = js.Array[NodeGroupUpdateStatus]
  type NodeGroupsToRemoveList = js.Array[AllowedNodeGroupId]
  type NodeGroupsToRetainList = js.Array[AllowedNodeGroupId]
  type NodeSnapshotList = js.Array[NodeSnapshot]
  type NodeTypeList = js.Array[String]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParametersList = js.Array[Parameter]
  type PreferredAvailabilityZoneList = js.Array[String]
  type ProcessedUpdateActionList = js.Array[ProcessedUpdateAction]
  type RecurringChargeList = js.Array[RecurringCharge]
  type RegionalConfigurationList = js.Array[RegionalConfiguration]
  type RemoveReplicasList = js.Array[String]
  type ReplicaConfigurationList = js.Array[ConfigureShard]
  type ReplicationGroupIdList = js.Array[String]
  type ReplicationGroupList = js.Array[ReplicationGroup]
  type ReservedCacheNodeList = js.Array[ReservedCacheNode]
  type ReservedCacheNodesOfferingList = js.Array[ReservedCacheNodesOffering]
  type ReshardingConfigurationList = js.Array[ReshardingConfiguration]
  type SecurityGroupIdsList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type ServiceUpdateList = js.Array[ServiceUpdate]
  type ServiceUpdateStatusList = js.Array[ServiceUpdateStatus]
  type SnapshotArnsList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = js.Date
  type TagList = js.Array[Tag]
  type UnprocessedUpdateActionList = js.Array[UnprocessedUpdateAction]
  type UpdateActionList = js.Array[UpdateAction]
  type UpdateActionStatusList = js.Array[UpdateActionStatus]

  implicit final class ElastiCacheOps(private val service: ElastiCache) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[TagListMessage] = service.addTagsToResource(params).promise().toFuture
    @inline def authorizeCacheSecurityGroupIngressFuture(params: AuthorizeCacheSecurityGroupIngressMessage): Future[AuthorizeCacheSecurityGroupIngressResult] = service.authorizeCacheSecurityGroupIngress(params).promise().toFuture
    @inline def batchApplyUpdateActionFuture(params: BatchApplyUpdateActionMessage): Future[UpdateActionResultsMessage] = service.batchApplyUpdateAction(params).promise().toFuture
    @inline def batchStopUpdateActionFuture(params: BatchStopUpdateActionMessage): Future[UpdateActionResultsMessage] = service.batchStopUpdateAction(params).promise().toFuture
    @inline def completeMigrationFuture(params: CompleteMigrationMessage): Future[CompleteMigrationResponse] = service.completeMigration(params).promise().toFuture
    @inline def copySnapshotFuture(params: CopySnapshotMessage): Future[CopySnapshotResult] = service.copySnapshot(params).promise().toFuture
    @inline def createCacheClusterFuture(params: CreateCacheClusterMessage): Future[CreateCacheClusterResult] = service.createCacheCluster(params).promise().toFuture
    @inline def createCacheParameterGroupFuture(params: CreateCacheParameterGroupMessage): Future[CreateCacheParameterGroupResult] = service.createCacheParameterGroup(params).promise().toFuture
    @inline def createCacheSecurityGroupFuture(params: CreateCacheSecurityGroupMessage): Future[CreateCacheSecurityGroupResult] = service.createCacheSecurityGroup(params).promise().toFuture
    @inline def createCacheSubnetGroupFuture(params: CreateCacheSubnetGroupMessage): Future[CreateCacheSubnetGroupResult] = service.createCacheSubnetGroup(params).promise().toFuture
    @inline def createGlobalReplicationGroupFuture(params: CreateGlobalReplicationGroupMessage): Future[CreateGlobalReplicationGroupResult] = service.createGlobalReplicationGroup(params).promise().toFuture
    @inline def createReplicationGroupFuture(params: CreateReplicationGroupMessage): Future[CreateReplicationGroupResult] = service.createReplicationGroup(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotMessage): Future[CreateSnapshotResult] = service.createSnapshot(params).promise().toFuture
    @inline def decreaseNodeGroupsInGlobalReplicationGroupFuture(params: DecreaseNodeGroupsInGlobalReplicationGroupMessage): Future[DecreaseNodeGroupsInGlobalReplicationGroupResult] = service.decreaseNodeGroupsInGlobalReplicationGroup(params).promise().toFuture
    @inline def decreaseReplicaCountFuture(params: DecreaseReplicaCountMessage): Future[DecreaseReplicaCountResult] = service.decreaseReplicaCount(params).promise().toFuture
    @inline def deleteCacheClusterFuture(params: DeleteCacheClusterMessage): Future[DeleteCacheClusterResult] = service.deleteCacheCluster(params).promise().toFuture
    @inline def deleteCacheParameterGroupFuture(params: DeleteCacheParameterGroupMessage): Future[js.Object] = service.deleteCacheParameterGroup(params).promise().toFuture
    @inline def deleteCacheSecurityGroupFuture(params: DeleteCacheSecurityGroupMessage): Future[js.Object] = service.deleteCacheSecurityGroup(params).promise().toFuture
    @inline def deleteCacheSubnetGroupFuture(params: DeleteCacheSubnetGroupMessage): Future[js.Object] = service.deleteCacheSubnetGroup(params).promise().toFuture
    @inline def deleteGlobalReplicationGroupFuture(params: DeleteGlobalReplicationGroupMessage): Future[DeleteGlobalReplicationGroupResult] = service.deleteGlobalReplicationGroup(params).promise().toFuture
    @inline def deleteReplicationGroupFuture(params: DeleteReplicationGroupMessage): Future[DeleteReplicationGroupResult] = service.deleteReplicationGroup(params).promise().toFuture
    @inline def deleteSnapshotFuture(params: DeleteSnapshotMessage): Future[DeleteSnapshotResult] = service.deleteSnapshot(params).promise().toFuture
    @inline def describeCacheClustersFuture(params: DescribeCacheClustersMessage): Future[CacheClusterMessage] = service.describeCacheClusters(params).promise().toFuture
    @inline def describeCacheEngineVersionsFuture(params: DescribeCacheEngineVersionsMessage): Future[CacheEngineVersionMessage] = service.describeCacheEngineVersions(params).promise().toFuture
    @inline def describeCacheParameterGroupsFuture(params: DescribeCacheParameterGroupsMessage): Future[CacheParameterGroupsMessage] = service.describeCacheParameterGroups(params).promise().toFuture
    @inline def describeCacheParametersFuture(params: DescribeCacheParametersMessage): Future[CacheParameterGroupDetails] = service.describeCacheParameters(params).promise().toFuture
    @inline def describeCacheSecurityGroupsFuture(params: DescribeCacheSecurityGroupsMessage): Future[CacheSecurityGroupMessage] = service.describeCacheSecurityGroups(params).promise().toFuture
    @inline def describeCacheSubnetGroupsFuture(params: DescribeCacheSubnetGroupsMessage): Future[CacheSubnetGroupMessage] = service.describeCacheSubnetGroups(params).promise().toFuture
    @inline def describeEngineDefaultParametersFuture(params: DescribeEngineDefaultParametersMessage): Future[DescribeEngineDefaultParametersResult] = service.describeEngineDefaultParameters(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[EventsMessage] = service.describeEvents(params).promise().toFuture
    @inline def describeGlobalReplicationGroupsFuture(params: DescribeGlobalReplicationGroupsMessage): Future[DescribeGlobalReplicationGroupsResult] = service.describeGlobalReplicationGroups(params).promise().toFuture
    @inline def describeReplicationGroupsFuture(params: DescribeReplicationGroupsMessage): Future[ReplicationGroupMessage] = service.describeReplicationGroups(params).promise().toFuture
    @inline def describeReservedCacheNodesFuture(params: DescribeReservedCacheNodesMessage): Future[ReservedCacheNodeMessage] = service.describeReservedCacheNodes(params).promise().toFuture
    @inline def describeReservedCacheNodesOfferingsFuture(params: DescribeReservedCacheNodesOfferingsMessage): Future[ReservedCacheNodesOfferingMessage] = service.describeReservedCacheNodesOfferings(params).promise().toFuture
    @inline def describeServiceUpdatesFuture(params: DescribeServiceUpdatesMessage): Future[ServiceUpdatesMessage] = service.describeServiceUpdates(params).promise().toFuture
    @inline def describeSnapshotsFuture(params: DescribeSnapshotsMessage): Future[DescribeSnapshotsListMessage] = service.describeSnapshots(params).promise().toFuture
    @inline def describeUpdateActionsFuture(params: DescribeUpdateActionsMessage): Future[UpdateActionsMessage] = service.describeUpdateActions(params).promise().toFuture
    @inline def disassociateGlobalReplicationGroupFuture(params: DisassociateGlobalReplicationGroupMessage): Future[DisassociateGlobalReplicationGroupResult] = service.disassociateGlobalReplicationGroup(params).promise().toFuture
    @inline def failoverGlobalReplicationGroupFuture(params: FailoverGlobalReplicationGroupMessage): Future[FailoverGlobalReplicationGroupResult] = service.failoverGlobalReplicationGroup(params).promise().toFuture
    @inline def increaseNodeGroupsInGlobalReplicationGroupFuture(params: IncreaseNodeGroupsInGlobalReplicationGroupMessage): Future[IncreaseNodeGroupsInGlobalReplicationGroupResult] = service.increaseNodeGroupsInGlobalReplicationGroup(params).promise().toFuture
    @inline def increaseReplicaCountFuture(params: IncreaseReplicaCountMessage): Future[IncreaseReplicaCountResult] = service.increaseReplicaCount(params).promise().toFuture
    @inline def listAllowedNodeTypeModificationsFuture(params: ListAllowedNodeTypeModificationsMessage): Future[AllowedNodeTypeModificationsMessage] = service.listAllowedNodeTypeModifications(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[TagListMessage] = service.listTagsForResource(params).promise().toFuture
    @inline def modifyCacheClusterFuture(params: ModifyCacheClusterMessage): Future[ModifyCacheClusterResult] = service.modifyCacheCluster(params).promise().toFuture
    @inline def modifyCacheParameterGroupFuture(params: ModifyCacheParameterGroupMessage): Future[CacheParameterGroupNameMessage] = service.modifyCacheParameterGroup(params).promise().toFuture
    @inline def modifyCacheSubnetGroupFuture(params: ModifyCacheSubnetGroupMessage): Future[ModifyCacheSubnetGroupResult] = service.modifyCacheSubnetGroup(params).promise().toFuture
    @inline def modifyGlobalReplicationGroupFuture(params: ModifyGlobalReplicationGroupMessage): Future[ModifyGlobalReplicationGroupResult] = service.modifyGlobalReplicationGroup(params).promise().toFuture
    @inline def modifyReplicationGroupFuture(params: ModifyReplicationGroupMessage): Future[ModifyReplicationGroupResult] = service.modifyReplicationGroup(params).promise().toFuture
    @inline def modifyReplicationGroupShardConfigurationFuture(params: ModifyReplicationGroupShardConfigurationMessage): Future[ModifyReplicationGroupShardConfigurationResult] = service.modifyReplicationGroupShardConfiguration(params).promise().toFuture
    @inline def purchaseReservedCacheNodesOfferingFuture(params: PurchaseReservedCacheNodesOfferingMessage): Future[PurchaseReservedCacheNodesOfferingResult] = service.purchaseReservedCacheNodesOffering(params).promise().toFuture
    @inline def rebalanceSlotsInGlobalReplicationGroupFuture(params: RebalanceSlotsInGlobalReplicationGroupMessage): Future[RebalanceSlotsInGlobalReplicationGroupResult] = service.rebalanceSlotsInGlobalReplicationGroup(params).promise().toFuture
    @inline def rebootCacheClusterFuture(params: RebootCacheClusterMessage): Future[RebootCacheClusterResult] = service.rebootCacheCluster(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[TagListMessage] = service.removeTagsFromResource(params).promise().toFuture
    @inline def resetCacheParameterGroupFuture(params: ResetCacheParameterGroupMessage): Future[CacheParameterGroupNameMessage] = service.resetCacheParameterGroup(params).promise().toFuture
    @inline def revokeCacheSecurityGroupIngressFuture(params: RevokeCacheSecurityGroupIngressMessage): Future[RevokeCacheSecurityGroupIngressResult] = service.revokeCacheSecurityGroupIngress(params).promise().toFuture
    @inline def startMigrationFuture(params: StartMigrationMessage): Future[StartMigrationResponse] = service.startMigration(params).promise().toFuture
    @inline def testFailoverFuture(params: TestFailoverMessage): Future[TestFailoverResult] = service.testFailover(params).promise().toFuture
  }
}

package elasticache {
  @js.native
  @JSImport("aws-sdk", "ElastiCache", "AWS.ElastiCache")
  class ElastiCache() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceMessage): Request[TagListMessage] = js.native
    def authorizeCacheSecurityGroupIngress(params: AuthorizeCacheSecurityGroupIngressMessage): Request[AuthorizeCacheSecurityGroupIngressResult] = js.native
    def batchApplyUpdateAction(params: BatchApplyUpdateActionMessage): Request[UpdateActionResultsMessage] = js.native
    def batchStopUpdateAction(params: BatchStopUpdateActionMessage): Request[UpdateActionResultsMessage] = js.native
    def completeMigration(params: CompleteMigrationMessage): Request[CompleteMigrationResponse] = js.native
    def copySnapshot(params: CopySnapshotMessage): Request[CopySnapshotResult] = js.native
    def createCacheCluster(params: CreateCacheClusterMessage): Request[CreateCacheClusterResult] = js.native
    def createCacheParameterGroup(params: CreateCacheParameterGroupMessage): Request[CreateCacheParameterGroupResult] = js.native
    def createCacheSecurityGroup(params: CreateCacheSecurityGroupMessage): Request[CreateCacheSecurityGroupResult] = js.native
    def createCacheSubnetGroup(params: CreateCacheSubnetGroupMessage): Request[CreateCacheSubnetGroupResult] = js.native
    def createGlobalReplicationGroup(params: CreateGlobalReplicationGroupMessage): Request[CreateGlobalReplicationGroupResult] = js.native
    def createReplicationGroup(params: CreateReplicationGroupMessage): Request[CreateReplicationGroupResult] = js.native
    def createSnapshot(params: CreateSnapshotMessage): Request[CreateSnapshotResult] = js.native
    def decreaseNodeGroupsInGlobalReplicationGroup(params: DecreaseNodeGroupsInGlobalReplicationGroupMessage): Request[DecreaseNodeGroupsInGlobalReplicationGroupResult] = js.native
    def decreaseReplicaCount(params: DecreaseReplicaCountMessage): Request[DecreaseReplicaCountResult] = js.native
    def deleteCacheCluster(params: DeleteCacheClusterMessage): Request[DeleteCacheClusterResult] = js.native
    def deleteCacheParameterGroup(params: DeleteCacheParameterGroupMessage): Request[js.Object] = js.native
    def deleteCacheSecurityGroup(params: DeleteCacheSecurityGroupMessage): Request[js.Object] = js.native
    def deleteCacheSubnetGroup(params: DeleteCacheSubnetGroupMessage): Request[js.Object] = js.native
    def deleteGlobalReplicationGroup(params: DeleteGlobalReplicationGroupMessage): Request[DeleteGlobalReplicationGroupResult] = js.native
    def deleteReplicationGroup(params: DeleteReplicationGroupMessage): Request[DeleteReplicationGroupResult] = js.native
    def deleteSnapshot(params: DeleteSnapshotMessage): Request[DeleteSnapshotResult] = js.native
    def describeCacheClusters(params: DescribeCacheClustersMessage): Request[CacheClusterMessage] = js.native
    def describeCacheEngineVersions(params: DescribeCacheEngineVersionsMessage): Request[CacheEngineVersionMessage] = js.native
    def describeCacheParameterGroups(params: DescribeCacheParameterGroupsMessage): Request[CacheParameterGroupsMessage] = js.native
    def describeCacheParameters(params: DescribeCacheParametersMessage): Request[CacheParameterGroupDetails] = js.native
    def describeCacheSecurityGroups(params: DescribeCacheSecurityGroupsMessage): Request[CacheSecurityGroupMessage] = js.native
    def describeCacheSubnetGroups(params: DescribeCacheSubnetGroupsMessage): Request[CacheSubnetGroupMessage] = js.native
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): Request[DescribeEngineDefaultParametersResult] = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeGlobalReplicationGroups(params: DescribeGlobalReplicationGroupsMessage): Request[DescribeGlobalReplicationGroupsResult] = js.native
    def describeReplicationGroups(params: DescribeReplicationGroupsMessage): Request[ReplicationGroupMessage] = js.native
    def describeReservedCacheNodes(params: DescribeReservedCacheNodesMessage): Request[ReservedCacheNodeMessage] = js.native
    def describeReservedCacheNodesOfferings(params: DescribeReservedCacheNodesOfferingsMessage): Request[ReservedCacheNodesOfferingMessage] = js.native
    def describeServiceUpdates(params: DescribeServiceUpdatesMessage): Request[ServiceUpdatesMessage] = js.native
    def describeSnapshots(params: DescribeSnapshotsMessage): Request[DescribeSnapshotsListMessage] = js.native
    def describeUpdateActions(params: DescribeUpdateActionsMessage): Request[UpdateActionsMessage] = js.native
    def disassociateGlobalReplicationGroup(params: DisassociateGlobalReplicationGroupMessage): Request[DisassociateGlobalReplicationGroupResult] = js.native
    def failoverGlobalReplicationGroup(params: FailoverGlobalReplicationGroupMessage): Request[FailoverGlobalReplicationGroupResult] = js.native
    def increaseNodeGroupsInGlobalReplicationGroup(params: IncreaseNodeGroupsInGlobalReplicationGroupMessage): Request[IncreaseNodeGroupsInGlobalReplicationGroupResult] = js.native
    def increaseReplicaCount(params: IncreaseReplicaCountMessage): Request[IncreaseReplicaCountResult] = js.native
    def listAllowedNodeTypeModifications(params: ListAllowedNodeTypeModificationsMessage): Request[AllowedNodeTypeModificationsMessage] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage] = js.native
    def modifyCacheCluster(params: ModifyCacheClusterMessage): Request[ModifyCacheClusterResult] = js.native
    def modifyCacheParameterGroup(params: ModifyCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage] = js.native
    def modifyCacheSubnetGroup(params: ModifyCacheSubnetGroupMessage): Request[ModifyCacheSubnetGroupResult] = js.native
    def modifyGlobalReplicationGroup(params: ModifyGlobalReplicationGroupMessage): Request[ModifyGlobalReplicationGroupResult] = js.native
    def modifyReplicationGroup(params: ModifyReplicationGroupMessage): Request[ModifyReplicationGroupResult] = js.native
    def modifyReplicationGroupShardConfiguration(params: ModifyReplicationGroupShardConfigurationMessage): Request[ModifyReplicationGroupShardConfigurationResult] = js.native
    def purchaseReservedCacheNodesOffering(params: PurchaseReservedCacheNodesOfferingMessage): Request[PurchaseReservedCacheNodesOfferingResult] = js.native
    def rebalanceSlotsInGlobalReplicationGroup(params: RebalanceSlotsInGlobalReplicationGroupMessage): Request[RebalanceSlotsInGlobalReplicationGroupResult] = js.native
    def rebootCacheCluster(params: RebootCacheClusterMessage): Request[RebootCacheClusterResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[TagListMessage] = js.native
    def resetCacheParameterGroup(params: ResetCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage] = js.native
    def revokeCacheSecurityGroupIngress(params: RevokeCacheSecurityGroupIngressMessage): Request[RevokeCacheSecurityGroupIngressResult] = js.native
    def startMigration(params: StartMigrationMessage): Request[StartMigrationResponse] = js.native
    def testFailover(params: TestFailoverMessage): Request[TestFailoverResult] = js.native
  }

  @js.native
  sealed trait AZMode extends js.Any
  object AZMode extends js.Object {
    val `single-az` = "single-az".asInstanceOf[AZMode]
    val `cross-az` = "cross-az".asInstanceOf[AZMode]

    val values = js.Object.freeze(js.Array(`single-az`, `cross-az`))
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
    @inline
    def apply(
        ResourceName: String,
        Tags: TagList
    ): AddTagsToResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceMessage]
    }
  }

  /**
    * Represents the allowed node types you can use to modify your cluster or replication group.
    */
  @js.native
  trait AllowedNodeTypeModificationsMessage extends js.Object {
    var ScaleDownModifications: js.UndefOr[NodeTypeList]
    var ScaleUpModifications: js.UndefOr[NodeTypeList]
  }

  object AllowedNodeTypeModificationsMessage {
    @inline
    def apply(
        ScaleDownModifications: js.UndefOr[NodeTypeList] = js.undefined,
        ScaleUpModifications: js.UndefOr[NodeTypeList] = js.undefined
    ): AllowedNodeTypeModificationsMessage = {
      val __obj = js.Dynamic.literal()
      ScaleDownModifications.foreach(__v => __obj.updateDynamic("ScaleDownModifications")(__v.asInstanceOf[js.Any]))
      ScaleUpModifications.foreach(__v => __obj.updateDynamic("ScaleUpModifications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllowedNodeTypeModificationsMessage]
    }
  }

  @js.native
  sealed trait AuthTokenUpdateStatus extends js.Any
  object AuthTokenUpdateStatus extends js.Object {
    val SETTING = "SETTING".asInstanceOf[AuthTokenUpdateStatus]
    val ROTATING = "ROTATING".asInstanceOf[AuthTokenUpdateStatus]

    val values = js.Object.freeze(js.Array(SETTING, ROTATING))
  }

  @js.native
  sealed trait AuthTokenUpdateStrategyType extends js.Any
  object AuthTokenUpdateStrategyType extends js.Object {
    val SET = "SET".asInstanceOf[AuthTokenUpdateStrategyType]
    val ROTATE = "ROTATE".asInstanceOf[AuthTokenUpdateStrategyType]

    val values = js.Object.freeze(js.Array(SET, ROTATE))
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
    @inline
    def apply(
        CacheSecurityGroupName: String,
        EC2SecurityGroupName: String,
        EC2SecurityGroupOwnerId: String
    ): AuthorizeCacheSecurityGroupIngressMessage = {
      val __obj = js.Dynamic.literal(
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupName" -> EC2SecurityGroupName.asInstanceOf[js.Any],
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
    @inline
    def apply(
        CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): AuthorizeCacheSecurityGroupIngressResult = {
      val __obj = js.Dynamic.literal()
      CacheSecurityGroup.foreach(__v => __obj.updateDynamic("CacheSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressResult]
    }
  }

  @js.native
  sealed trait AutomaticFailoverStatus extends js.Any
  object AutomaticFailoverStatus extends js.Object {
    val enabled = "enabled".asInstanceOf[AutomaticFailoverStatus]
    val disabled = "disabled".asInstanceOf[AutomaticFailoverStatus]
    val enabling = "enabling".asInstanceOf[AutomaticFailoverStatus]
    val disabling = "disabling".asInstanceOf[AutomaticFailoverStatus]

    val values = js.Object.freeze(js.Array(enabled, disabled, enabling, disabling))
  }

  /**
    * Describes an Availability Zone in which the cluster is launched.
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

  @js.native
  trait BatchApplyUpdateActionMessage extends js.Object {
    var ServiceUpdateName: String
    var CacheClusterIds: js.UndefOr[CacheClusterIdList]
    var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList]
  }

  object BatchApplyUpdateActionMessage {
    @inline
    def apply(
        ServiceUpdateName: String,
        CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.undefined,
        ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.undefined
    ): BatchApplyUpdateActionMessage = {
      val __obj = js.Dynamic.literal(
        "ServiceUpdateName" -> ServiceUpdateName.asInstanceOf[js.Any]
      )

      CacheClusterIds.foreach(__v => __obj.updateDynamic("CacheClusterIds")(__v.asInstanceOf[js.Any]))
      ReplicationGroupIds.foreach(__v => __obj.updateDynamic("ReplicationGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchApplyUpdateActionMessage]
    }
  }

  @js.native
  trait BatchStopUpdateActionMessage extends js.Object {
    var ServiceUpdateName: String
    var CacheClusterIds: js.UndefOr[CacheClusterIdList]
    var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList]
  }

  object BatchStopUpdateActionMessage {
    @inline
    def apply(
        ServiceUpdateName: String,
        CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.undefined,
        ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.undefined
    ): BatchStopUpdateActionMessage = {
      val __obj = js.Dynamic.literal(
        "ServiceUpdateName" -> ServiceUpdateName.asInstanceOf[js.Any]
      )

      CacheClusterIds.foreach(__v => __obj.updateDynamic("CacheClusterIds")(__v.asInstanceOf[js.Any]))
      ReplicationGroupIds.foreach(__v => __obj.updateDynamic("ReplicationGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchStopUpdateActionMessage]
    }
  }

  /**
    * Contains all of the attributes of a specific cluster.
    */
  @js.native
  trait CacheCluster extends js.Object {
    var ARN: js.UndefOr[String]
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

  object CacheCluster {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AuthTokenLastModifiedDate: js.UndefOr[TStamp] = js.undefined,
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
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      AtRestEncryptionEnabled.foreach(__v => __obj.updateDynamic("AtRestEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      AuthTokenEnabled.foreach(__v => __obj.updateDynamic("AuthTokenEnabled")(__v.asInstanceOf[js.Any]))
      AuthTokenLastModifiedDate.foreach(__v => __obj.updateDynamic("AuthTokenLastModifiedDate")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      CacheClusterCreateTime.foreach(__v => __obj.updateDynamic("CacheClusterCreateTime")(__v.asInstanceOf[js.Any]))
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      CacheClusterStatus.foreach(__v => __obj.updateDynamic("CacheClusterStatus")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      CacheNodes.foreach(__v => __obj.updateDynamic("CacheNodes")(__v.asInstanceOf[js.Any]))
      CacheParameterGroup.foreach(__v => __obj.updateDynamic("CacheParameterGroup")(__v.asInstanceOf[js.Any]))
      CacheSecurityGroups.foreach(__v => __obj.updateDynamic("CacheSecurityGroups")(__v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.updateDynamic("CacheSubnetGroupName")(__v.asInstanceOf[js.Any]))
      ClientDownloadLandingPage.foreach(__v => __obj.updateDynamic("ClientDownloadLandingPage")(__v.asInstanceOf[js.Any]))
      ConfigurationEndpoint.foreach(__v => __obj.updateDynamic("ConfigurationEndpoint")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      NotificationConfiguration.foreach(__v => __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.updateDynamic("NumCacheNodes")(__v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.updateDynamic("PendingModifiedValues")(__v.asInstanceOf[js.Any]))
      PreferredAvailabilityZone.foreach(__v => __obj.updateDynamic("PreferredAvailabilityZone")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      TransitEncryptionEnabled.foreach(__v => __obj.updateDynamic("TransitEncryptionEnabled")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheClusters: js.UndefOr[CacheClusterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheClusterMessage = {
      val __obj = js.Dynamic.literal()
      CacheClusters.foreach(__v => __obj.updateDynamic("CacheClusters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheEngineDescription: js.UndefOr[String] = js.undefined,
        CacheEngineVersionDescription: js.UndefOr[String] = js.undefined,
        CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined
    ): CacheEngineVersion = {
      val __obj = js.Dynamic.literal()
      CacheEngineDescription.foreach(__v => __obj.updateDynamic("CacheEngineDescription")(__v.asInstanceOf[js.Any]))
      CacheEngineVersionDescription.foreach(__v => __obj.updateDynamic("CacheEngineVersionDescription")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupFamily.foreach(__v => __obj.updateDynamic("CacheParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheEngineVersionMessage = {
      val __obj = js.Dynamic.literal()
      CacheEngineVersions.foreach(__v => __obj.updateDynamic("CacheEngineVersions")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheEngineVersionMessage]
    }
  }

  /**
    * Represents an individual cache node within a cluster. Each cache node runs its own instance of the cluster's protocol-compliant caching software - either Memcached or Redis.
    *  The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.
    * * General purpose:
    * <li> Current generation:
    *  ```M5 node types:``` <code>cache.m5.large</code>, <code>cache.m5.xlarge</code>, <code>cache.m5.2xlarge</code>, <code>cache.m5.4xlarge</code>, <code>cache.m5.12xlarge</code>, <code>cache.m5.24xlarge</code>
    *  ```M4 node types:``` <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
    *  ```T3 node types:``` <code>cache.t3.micro</code>, <code>cache.t3.small</code>, <code>cache.t3.medium</code>
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
    @inline
    def apply(
        CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined,
        CacheNodeId: js.UndefOr[String] = js.undefined,
        CacheNodeStatus: js.UndefOr[String] = js.undefined,
        CustomerAvailabilityZone: js.UndefOr[String] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        ParameterGroupStatus: js.UndefOr[String] = js.undefined,
        SourceCacheNodeId: js.UndefOr[String] = js.undefined
    ): CacheNode = {
      val __obj = js.Dynamic.literal()
      CacheNodeCreateTime.foreach(__v => __obj.updateDynamic("CacheNodeCreateTime")(__v.asInstanceOf[js.Any]))
      CacheNodeId.foreach(__v => __obj.updateDynamic("CacheNodeId")(__v.asInstanceOf[js.Any]))
      CacheNodeStatus.foreach(__v => __obj.updateDynamic("CacheNodeStatus")(__v.asInstanceOf[js.Any]))
      CustomerAvailabilityZone.foreach(__v => __obj.updateDynamic("CustomerAvailabilityZone")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      ParameterGroupStatus.foreach(__v => __obj.updateDynamic("ParameterGroupStatus")(__v.asInstanceOf[js.Any]))
      SourceCacheNodeId.foreach(__v => __obj.updateDynamic("SourceCacheNodeId")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      CacheNodeTypeSpecificValues.foreach(__v => __obj.updateDynamic("CacheNodeTypeSpecificValues")(__v.asInstanceOf[js.Any]))
      ChangeType.foreach(__v => __obj.updateDynamic("ChangeType")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsModifiable.foreach(__v => __obj.updateDynamic("IsModifiable")(__v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.updateDynamic("MinimumEngineVersion")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheNodeType: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): CacheNodeTypeSpecificValue = {
      val __obj = js.Dynamic.literal()
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheNodeTypeSpecificValue]
    }
  }

  /**
    * The status of the service update on the cache node
    */
  @js.native
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

  object CacheNodeUpdateStatus {
    @inline
    def apply(
        CacheNodeId: js.UndefOr[String] = js.undefined,
        NodeDeletionDate: js.UndefOr[TStamp] = js.undefined,
        NodeUpdateEndDate: js.UndefOr[TStamp] = js.undefined,
        NodeUpdateInitiatedBy: js.UndefOr[NodeUpdateInitiatedBy] = js.undefined,
        NodeUpdateInitiatedDate: js.UndefOr[TStamp] = js.undefined,
        NodeUpdateStartDate: js.UndefOr[TStamp] = js.undefined,
        NodeUpdateStatus: js.UndefOr[NodeUpdateStatus] = js.undefined,
        NodeUpdateStatusModifiedDate: js.UndefOr[TStamp] = js.undefined
    ): CacheNodeUpdateStatus = {
      val __obj = js.Dynamic.literal()
      CacheNodeId.foreach(__v => __obj.updateDynamic("CacheNodeId")(__v.asInstanceOf[js.Any]))
      NodeDeletionDate.foreach(__v => __obj.updateDynamic("NodeDeletionDate")(__v.asInstanceOf[js.Any]))
      NodeUpdateEndDate.foreach(__v => __obj.updateDynamic("NodeUpdateEndDate")(__v.asInstanceOf[js.Any]))
      NodeUpdateInitiatedBy.foreach(__v => __obj.updateDynamic("NodeUpdateInitiatedBy")(__v.asInstanceOf[js.Any]))
      NodeUpdateInitiatedDate.foreach(__v => __obj.updateDynamic("NodeUpdateInitiatedDate")(__v.asInstanceOf[js.Any]))
      NodeUpdateStartDate.foreach(__v => __obj.updateDynamic("NodeUpdateStartDate")(__v.asInstanceOf[js.Any]))
      NodeUpdateStatus.foreach(__v => __obj.updateDynamic("NodeUpdateStatus")(__v.asInstanceOf[js.Any]))
      NodeUpdateStatusModifiedDate.foreach(__v => __obj.updateDynamic("NodeUpdateStatusModifiedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheNodeUpdateStatus]
    }
  }

  /**
    * Represents the output of a <code>CreateCacheParameterGroup</code> operation.
    */
  @js.native
  trait CacheParameterGroup extends js.Object {
    var ARN: js.UndefOr[String]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var IsGlobal: js.UndefOr[Boolean]
  }

  object CacheParameterGroup {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IsGlobal: js.UndefOr[Boolean] = js.undefined
    ): CacheParameterGroup = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupFamily.foreach(__v => __obj.updateDynamic("CacheParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsGlobal.foreach(__v => __obj.updateDynamic("IsGlobal")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): CacheParameterGroupDetails = {
      val __obj = js.Dynamic.literal()
      CacheNodeTypeSpecificParameters.foreach(__v => __obj.updateDynamic("CacheNodeTypeSpecificParameters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupName: js.UndefOr[String] = js.undefined
    ): CacheParameterGroupNameMessage = {
      val __obj = js.Dynamic.literal()
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        ParameterApplyStatus: js.UndefOr[String] = js.undefined
    ): CacheParameterGroupStatus = {
      val __obj = js.Dynamic.literal()
      CacheNodeIdsToReboot.foreach(__v => __obj.updateDynamic("CacheNodeIdsToReboot")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
      ParameterApplyStatus.foreach(__v => __obj.updateDynamic("ParameterApplyStatus")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheParameterGroupsMessage = {
      val __obj = js.Dynamic.literal()
      CacheParameterGroups.foreach(__v => __obj.updateDynamic("CacheParameterGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
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
    var ARN: js.UndefOr[String]
    var CacheSecurityGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
    var OwnerId: js.UndefOr[String]
  }

  object CacheSecurityGroup {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
        OwnerId: js.UndefOr[String] = js.undefined
    ): CacheSecurityGroup = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      CacheSecurityGroupName.foreach(__v => __obj.updateDynamic("CacheSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroups.foreach(__v => __obj.updateDynamic("EC2SecurityGroups")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): CacheSecurityGroupMembership = {
      val __obj = js.Dynamic.literal()
      CacheSecurityGroupName.foreach(__v => __obj.updateDynamic("CacheSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheSecurityGroups: js.UndefOr[CacheSecurityGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheSecurityGroupMessage = {
      val __obj = js.Dynamic.literal()
      CacheSecurityGroups.foreach(__v => __obj.updateDynamic("CacheSecurityGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
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
    var ARN: js.UndefOr[String]
    var CacheSubnetGroupDescription: js.UndefOr[String]
    var CacheSubnetGroupName: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  object CacheSubnetGroup {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): CacheSubnetGroup = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      CacheSubnetGroupDescription.foreach(__v => __obj.updateDynamic("CacheSubnetGroupDescription")(__v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.updateDynamic("CacheSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheSubnetGroups: js.UndefOr[CacheSubnetGroups] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): CacheSubnetGroupMessage = {
      val __obj = js.Dynamic.literal()
      CacheSubnetGroups.foreach(__v => __obj.updateDynamic("CacheSubnetGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheSubnetGroupMessage]
    }
  }

  @js.native
  sealed trait ChangeType extends js.Any
  object ChangeType extends js.Object {
    val immediate = "immediate".asInstanceOf[ChangeType]
    val `requires-reboot` = "requires-reboot".asInstanceOf[ChangeType]

    val values = js.Object.freeze(js.Array(immediate, `requires-reboot`))
  }

  @js.native
  trait CompleteMigrationMessage extends js.Object {
    var ReplicationGroupId: String
    var Force: js.UndefOr[Boolean]
  }

  object CompleteMigrationMessage {
    @inline
    def apply(
        ReplicationGroupId: String,
        Force: js.UndefOr[Boolean] = js.undefined
    ): CompleteMigrationMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      Force.foreach(__v => __obj.updateDynamic("Force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteMigrationMessage]
    }
  }

  @js.native
  trait CompleteMigrationResponse extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object CompleteMigrationResponse {
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): CompleteMigrationResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteMigrationResponse]
    }
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
    @inline
    def apply(
        NewReplicaCount: Int,
        NodeGroupId: AllowedNodeGroupId,
        PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined
    ): ConfigureShard = {
      val __obj = js.Dynamic.literal(
        "NewReplicaCount" -> NewReplicaCount.asInstanceOf[js.Any],
        "NodeGroupId" -> NodeGroupId.asInstanceOf[js.Any]
      )

      PreferredAvailabilityZones.foreach(__v => __obj.updateDynamic("PreferredAvailabilityZones")(__v.asInstanceOf[js.Any]))
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
    var KmsKeyId: js.UndefOr[String]
    var TargetBucket: js.UndefOr[String]
  }

  object CopySnapshotMessage {
    @inline
    def apply(
        SourceSnapshotName: String,
        TargetSnapshotName: String,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        TargetBucket: js.UndefOr[String] = js.undefined
    ): CopySnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "SourceSnapshotName" -> SourceSnapshotName.asInstanceOf[js.Any],
        "TargetSnapshotName" -> TargetSnapshotName.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      TargetBucket.foreach(__v => __obj.updateDynamic("TargetBucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopySnapshotMessage]
    }
  }

  @js.native
  trait CopySnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CopySnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CopySnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any]
      )

      AZMode.foreach(__v => __obj.updateDynamic("AZMode")(__v.asInstanceOf[js.Any]))
      AuthToken.foreach(__v => __obj.updateDynamic("AuthToken")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
      CacheSecurityGroupNames.foreach(__v => __obj.updateDynamic("CacheSecurityGroupNames")(__v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.updateDynamic("CacheSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.updateDynamic("NotificationTopicArn")(__v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.updateDynamic("NumCacheNodes")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredAvailabilityZone.foreach(__v => __obj.updateDynamic("PreferredAvailabilityZone")(__v.asInstanceOf[js.Any]))
      PreferredAvailabilityZones.foreach(__v => __obj.updateDynamic("PreferredAvailabilityZones")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SnapshotArns.foreach(__v => __obj.updateDynamic("SnapshotArns")(__v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.updateDynamic("SnapshotName")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCacheClusterMessage]
    }
  }

  @js.native
  trait CreateCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object CreateCacheClusterResult {
    @inline
    def apply(
        CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): CreateCacheClusterResult = {
      val __obj = js.Dynamic.literal()
      CacheCluster.foreach(__v => __obj.updateDynamic("CacheCluster")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupFamily: String,
        CacheParameterGroupName: String,
        Description: String
    ): CreateCacheParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.asInstanceOf[js.Any],
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCacheParameterGroupMessage]
    }
  }

  @js.native
  trait CreateCacheParameterGroupResult extends js.Object {
    var CacheParameterGroup: js.UndefOr[CacheParameterGroup]
  }

  object CreateCacheParameterGroupResult {
    @inline
    def apply(
        CacheParameterGroup: js.UndefOr[CacheParameterGroup] = js.undefined
    ): CreateCacheParameterGroupResult = {
      val __obj = js.Dynamic.literal()
      CacheParameterGroup.foreach(__v => __obj.updateDynamic("CacheParameterGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheSecurityGroupName: String,
        Description: String
    ): CreateCacheSecurityGroupMessage = {
      val __obj = js.Dynamic.literal(
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCacheSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateCacheSecurityGroupResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  object CreateCacheSecurityGroupResult {
    @inline
    def apply(
        CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): CreateCacheSecurityGroupResult = {
      val __obj = js.Dynamic.literal()
      CacheSecurityGroup.foreach(__v => __obj.updateDynamic("CacheSecurityGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheSubnetGroupDescription: String,
        CacheSubnetGroupName: String,
        SubnetIds: SubnetIdentifierList
    ): CreateCacheSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.asInstanceOf[js.Any],
        "CacheSubnetGroupName" -> CacheSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup]
  }

  object CreateCacheSubnetGroupResult {
    @inline
    def apply(
        CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
    ): CreateCacheSubnetGroupResult = {
      val __obj = js.Dynamic.literal()
      CacheSubnetGroup.foreach(__v => __obj.updateDynamic("CacheSubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCacheSubnetGroupResult]
    }
  }

  @js.native
  trait CreateGlobalReplicationGroupMessage extends js.Object {
    var GlobalReplicationGroupIdSuffix: String
    var PrimaryReplicationGroupId: String
    var GlobalReplicationGroupDescription: js.UndefOr[String]
  }

  object CreateGlobalReplicationGroupMessage {
    @inline
    def apply(
        GlobalReplicationGroupIdSuffix: String,
        PrimaryReplicationGroupId: String,
        GlobalReplicationGroupDescription: js.UndefOr[String] = js.undefined
    ): CreateGlobalReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "GlobalReplicationGroupIdSuffix" -> GlobalReplicationGroupIdSuffix.asInstanceOf[js.Any],
        "PrimaryReplicationGroupId" -> PrimaryReplicationGroupId.asInstanceOf[js.Any]
      )

      GlobalReplicationGroupDescription.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGlobalReplicationGroupMessage]
    }
  }

  @js.native
  trait CreateGlobalReplicationGroupResult extends js.Object {
    var GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup]
  }

  object CreateGlobalReplicationGroupResult {
    @inline
    def apply(
        GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup] = js.undefined
    ): CreateGlobalReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroup.foreach(__v => __obj.updateDynamic("GlobalReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGlobalReplicationGroupResult]
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
    var GlobalReplicationGroupId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MultiAZEnabled: js.UndefOr[BooleanOptional]
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
    @inline
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
        GlobalReplicationGroupId: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MultiAZEnabled: js.UndefOr[BooleanOptional] = js.undefined,
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
      val __obj = js.Dynamic.literal(
        "ReplicationGroupDescription" -> ReplicationGroupDescription.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      AtRestEncryptionEnabled.foreach(__v => __obj.updateDynamic("AtRestEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      AuthToken.foreach(__v => __obj.updateDynamic("AuthToken")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AutomaticFailoverEnabled.foreach(__v => __obj.updateDynamic("AutomaticFailoverEnabled")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
      CacheSecurityGroupNames.foreach(__v => __obj.updateDynamic("CacheSecurityGroupNames")(__v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.updateDynamic("CacheSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      GlobalReplicationGroupId.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupId")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiAZEnabled.foreach(__v => __obj.updateDynamic("MultiAZEnabled")(__v.asInstanceOf[js.Any]))
      NodeGroupConfiguration.foreach(__v => __obj.updateDynamic("NodeGroupConfiguration")(__v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.updateDynamic("NotificationTopicArn")(__v.asInstanceOf[js.Any]))
      NumCacheClusters.foreach(__v => __obj.updateDynamic("NumCacheClusters")(__v.asInstanceOf[js.Any]))
      NumNodeGroups.foreach(__v => __obj.updateDynamic("NumNodeGroups")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredCacheClusterAZs.foreach(__v => __obj.updateDynamic("PreferredCacheClusterAZs")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      PrimaryClusterId.foreach(__v => __obj.updateDynamic("PrimaryClusterId")(__v.asInstanceOf[js.Any]))
      ReplicasPerNodeGroup.foreach(__v => __obj.updateDynamic("ReplicasPerNodeGroup")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SnapshotArns.foreach(__v => __obj.updateDynamic("SnapshotArns")(__v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.updateDynamic("SnapshotName")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TransitEncryptionEnabled.foreach(__v => __obj.updateDynamic("TransitEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationGroupMessage]
    }
  }

  @js.native
  trait CreateReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object CreateReplicationGroupResult {
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): CreateReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
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
    var KmsKeyId: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
  }

  object CreateSnapshotMessage {
    @inline
    def apply(
        SnapshotName: String,
        CacheClusterId: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined
    ): CreateSnapshotMessage = {
      val __obj = js.Dynamic.literal(
        "SnapshotName" -> SnapshotName.asInstanceOf[js.Any]
      )

      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotMessage]
    }
  }

  @js.native
  trait CreateSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CreateSnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CreateSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotResult]
    }
  }

  /**
    * The endpoint from which data should be migrated.
    */
  @js.native
  trait CustomerNodeEndpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
  }

  object CustomerNodeEndpoint {
    @inline
    def apply(
        Address: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined
    ): CustomerNodeEndpoint = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerNodeEndpoint]
    }
  }

  @js.native
  trait DecreaseNodeGroupsInGlobalReplicationGroupMessage extends js.Object {
    var ApplyImmediately: Boolean
    var GlobalReplicationGroupId: String
    var NodeGroupCount: Int
    var GlobalNodeGroupsToRemove: js.UndefOr[GlobalNodeGroupIdList]
    var GlobalNodeGroupsToRetain: js.UndefOr[GlobalNodeGroupIdList]
  }

  object DecreaseNodeGroupsInGlobalReplicationGroupMessage {
    @inline
    def apply(
        ApplyImmediately: Boolean,
        GlobalReplicationGroupId: String,
        NodeGroupCount: Int,
        GlobalNodeGroupsToRemove: js.UndefOr[GlobalNodeGroupIdList] = js.undefined,
        GlobalNodeGroupsToRetain: js.UndefOr[GlobalNodeGroupIdList] = js.undefined
    ): DecreaseNodeGroupsInGlobalReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "GlobalReplicationGroupId" -> GlobalReplicationGroupId.asInstanceOf[js.Any],
        "NodeGroupCount" -> NodeGroupCount.asInstanceOf[js.Any]
      )

      GlobalNodeGroupsToRemove.foreach(__v => __obj.updateDynamic("GlobalNodeGroupsToRemove")(__v.asInstanceOf[js.Any]))
      GlobalNodeGroupsToRetain.foreach(__v => __obj.updateDynamic("GlobalNodeGroupsToRetain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecreaseNodeGroupsInGlobalReplicationGroupMessage]
    }
  }

  @js.native
  trait DecreaseNodeGroupsInGlobalReplicationGroupResult extends js.Object {
    var GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup]
  }

  object DecreaseNodeGroupsInGlobalReplicationGroupResult {
    @inline
    def apply(
        GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup] = js.undefined
    ): DecreaseNodeGroupsInGlobalReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroup.foreach(__v => __obj.updateDynamic("GlobalReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecreaseNodeGroupsInGlobalReplicationGroupResult]
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
    @inline
    def apply(
        ApplyImmediately: Boolean,
        ReplicationGroupId: String,
        NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined,
        ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.undefined
    ): DecreaseReplicaCountMessage = {
      val __obj = js.Dynamic.literal(
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      NewReplicaCount.foreach(__v => __obj.updateDynamic("NewReplicaCount")(__v.asInstanceOf[js.Any]))
      ReplicaConfiguration.foreach(__v => __obj.updateDynamic("ReplicaConfiguration")(__v.asInstanceOf[js.Any]))
      ReplicasToRemove.foreach(__v => __obj.updateDynamic("ReplicasToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecreaseReplicaCountMessage]
    }
  }

  @js.native
  trait DecreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object DecreaseReplicaCountResult {
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): DecreaseReplicaCountResult = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheClusterId: String,
        FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteCacheClusterMessage = {
      val __obj = js.Dynamic.literal(
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any]
      )

      FinalSnapshotIdentifier.foreach(__v => __obj.updateDynamic("FinalSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCacheClusterMessage]
    }
  }

  @js.native
  trait DeleteCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object DeleteCacheClusterResult {
    @inline
    def apply(
        CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): DeleteCacheClusterResult = {
      val __obj = js.Dynamic.literal()
      CacheCluster.foreach(__v => __obj.updateDynamic("CacheCluster")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupName: String
    ): DeleteCacheParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        CacheSecurityGroupName: String
    ): DeleteCacheSecurityGroupMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        CacheSubnetGroupName: String
    ): DeleteCacheSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "CacheSubnetGroupName" -> CacheSubnetGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait DeleteGlobalReplicationGroupMessage extends js.Object {
    var GlobalReplicationGroupId: String
    var RetainPrimaryReplicationGroup: Boolean
  }

  object DeleteGlobalReplicationGroupMessage {
    @inline
    def apply(
        GlobalReplicationGroupId: String,
        RetainPrimaryReplicationGroup: Boolean
    ): DeleteGlobalReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "GlobalReplicationGroupId" -> GlobalReplicationGroupId.asInstanceOf[js.Any],
        "RetainPrimaryReplicationGroup" -> RetainPrimaryReplicationGroup.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGlobalReplicationGroupMessage]
    }
  }

  @js.native
  trait DeleteGlobalReplicationGroupResult extends js.Object {
    var GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup]
  }

  object DeleteGlobalReplicationGroupResult {
    @inline
    def apply(
        GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup] = js.undefined
    ): DeleteGlobalReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroup.foreach(__v => __obj.updateDynamic("GlobalReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGlobalReplicationGroupResult]
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
    @inline
    def apply(
        ReplicationGroupId: String,
        FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined,
        RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.undefined
    ): DeleteReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      FinalSnapshotIdentifier.foreach(__v => __obj.updateDynamic("FinalSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      RetainPrimaryCluster.foreach(__v => __obj.updateDynamic("RetainPrimaryCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReplicationGroupMessage]
    }
  }

  @js.native
  trait DeleteReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object DeleteReplicationGroupResult {
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): DeleteReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        SnapshotName: String
    ): DeleteSnapshotMessage = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): DeleteSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional] = js.undefined,
        ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.undefined
    ): DescribeCacheClustersMessage = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ShowCacheClustersNotInReplicationGroups.foreach(__v => __obj.updateDynamic("ShowCacheClustersNotInReplicationGroups")(__v.asInstanceOf[js.Any]))
      ShowCacheNodeInfo.foreach(__v => __obj.updateDynamic("ShowCacheNodeInfo")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
        DefaultOnly: js.UndefOr[Boolean] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCacheEngineVersionsMessage = {
      val __obj = js.Dynamic.literal()
      CacheParameterGroupFamily.foreach(__v => __obj.updateDynamic("CacheParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      DefaultOnly.foreach(__v => __obj.updateDynamic("DefaultOnly")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCacheParameterGroupsMessage = {
      val __obj = js.Dynamic.literal()
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupName: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): DescribeCacheParametersMessage = {
      val __obj = js.Dynamic.literal(
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCacheSecurityGroupsMessage = {
      val __obj = js.Dynamic.literal()
      CacheSecurityGroupName.foreach(__v => __obj.updateDynamic("CacheSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCacheSubnetGroupsMessage = {
      val __obj = js.Dynamic.literal()
      CacheSubnetGroupName.foreach(__v => __obj.updateDynamic("CacheSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupFamily: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEngineDefaultParametersMessage = {
      val __obj = js.Dynamic.literal(
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.asInstanceOf[js.Any]
      )

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

  @js.native
  trait DescribeGlobalReplicationGroupsMessage extends js.Object {
    var GlobalReplicationGroupId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ShowMemberInfo: js.UndefOr[BooleanOptional]
  }

  object DescribeGlobalReplicationGroupsMessage {
    @inline
    def apply(
        GlobalReplicationGroupId: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ShowMemberInfo: js.UndefOr[BooleanOptional] = js.undefined
    ): DescribeGlobalReplicationGroupsMessage = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroupId.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupId")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ShowMemberInfo.foreach(__v => __obj.updateDynamic("ShowMemberInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGlobalReplicationGroupsMessage]
    }
  }

  @js.native
  trait DescribeGlobalReplicationGroupsResult extends js.Object {
    var GlobalReplicationGroups: js.UndefOr[GlobalReplicationGroupList]
    var Marker: js.UndefOr[String]
  }

  object DescribeGlobalReplicationGroupsResult {
    @inline
    def apply(
        GlobalReplicationGroups: js.UndefOr[GlobalReplicationGroupList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeGlobalReplicationGroupsResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroups.foreach(__v => __obj.updateDynamic("GlobalReplicationGroups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGlobalReplicationGroupsResult]
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined
    ): DescribeReplicationGroupsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodeId.foreach(__v => __obj.updateDynamic("ReservedCacheNodeId")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferingId.foreach(__v => __obj.updateDynamic("ReservedCacheNodesOfferingId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheNodeType: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        OfferingType: js.UndefOr[String] = js.undefined,
        ProductDescription: js.UndefOr[String] = js.undefined,
        ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
    ): DescribeReservedCacheNodesOfferingsMessage = {
      val __obj = js.Dynamic.literal()
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferingId.foreach(__v => __obj.updateDynamic("ReservedCacheNodesOfferingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservedCacheNodesOfferingsMessage]
    }
  }

  @js.native
  trait DescribeServiceUpdatesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ServiceUpdateName: js.UndefOr[String]
    var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList]
  }

  object DescribeServiceUpdatesMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ServiceUpdateName: js.UndefOr[String] = js.undefined,
        ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.undefined
    ): DescribeServiceUpdatesMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      ServiceUpdateStatus.foreach(__v => __obj.updateDynamic("ServiceUpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceUpdatesMessage]
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Snapshots: js.UndefOr[SnapshotList] = js.undefined
    ): DescribeSnapshotsListMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Snapshots.foreach(__v => __obj.updateDynamic("Snapshots")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        ShowNodeGroupConfig: js.UndefOr[BooleanOptional] = js.undefined,
        SnapshotName: js.UndefOr[String] = js.undefined,
        SnapshotSource: js.UndefOr[String] = js.undefined
    ): DescribeSnapshotsMessage = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      ShowNodeGroupConfig.foreach(__v => __obj.updateDynamic("ShowNodeGroupConfig")(__v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.updateDynamic("SnapshotName")(__v.asInstanceOf[js.Any]))
      SnapshotSource.foreach(__v => __obj.updateDynamic("SnapshotSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsMessage]
    }
  }

  @js.native
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

  object DescribeUpdateActionsMessage {
    @inline
    def apply(
        CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.undefined,
        ServiceUpdateName: js.UndefOr[String] = js.undefined,
        ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.undefined,
        ServiceUpdateTimeRange: js.UndefOr[TimeRangeFilter] = js.undefined,
        ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional] = js.undefined,
        UpdateActionStatus: js.UndefOr[UpdateActionStatusList] = js.undefined
    ): DescribeUpdateActionsMessage = {
      val __obj = js.Dynamic.literal()
      CacheClusterIds.foreach(__v => __obj.updateDynamic("CacheClusterIds")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ReplicationGroupIds.foreach(__v => __obj.updateDynamic("ReplicationGroupIds")(__v.asInstanceOf[js.Any]))
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      ServiceUpdateStatus.foreach(__v => __obj.updateDynamic("ServiceUpdateStatus")(__v.asInstanceOf[js.Any]))
      ServiceUpdateTimeRange.foreach(__v => __obj.updateDynamic("ServiceUpdateTimeRange")(__v.asInstanceOf[js.Any]))
      ShowNodeLevelUpdateStatus.foreach(__v => __obj.updateDynamic("ShowNodeLevelUpdateStatus")(__v.asInstanceOf[js.Any]))
      UpdateActionStatus.foreach(__v => __obj.updateDynamic("UpdateActionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUpdateActionsMessage]
    }
  }

  @js.native
  trait DisassociateGlobalReplicationGroupMessage extends js.Object {
    var GlobalReplicationGroupId: String
    var ReplicationGroupId: String
    var ReplicationGroupRegion: String
  }

  object DisassociateGlobalReplicationGroupMessage {
    @inline
    def apply(
        GlobalReplicationGroupId: String,
        ReplicationGroupId: String,
        ReplicationGroupRegion: String
    ): DisassociateGlobalReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "GlobalReplicationGroupId" -> GlobalReplicationGroupId.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any],
        "ReplicationGroupRegion" -> ReplicationGroupRegion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateGlobalReplicationGroupMessage]
    }
  }

  @js.native
  trait DisassociateGlobalReplicationGroupResult extends js.Object {
    var GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup]
  }

  object DisassociateGlobalReplicationGroupResult {
    @inline
    def apply(
        GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup] = js.undefined
    ): DisassociateGlobalReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroup.foreach(__v => __obj.updateDynamic("GlobalReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateGlobalReplicationGroupResult]
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
    @inline
    def apply(
        EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
        EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): EC2SecurityGroup = {
      val __obj = js.Dynamic.literal()
      EC2SecurityGroupName.foreach(__v => __obj.updateDynamic("EC2SecurityGroupName")(__v.asInstanceOf[js.Any]))
      EC2SecurityGroupOwnerId.foreach(__v => __obj.updateDynamic("EC2SecurityGroupOwnerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined,
        CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): EngineDefaults = {
      val __obj = js.Dynamic.literal()
      CacheNodeTypeSpecificParameters.foreach(__v => __obj.updateDynamic("CacheNodeTypeSpecificParameters")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupFamily.foreach(__v => __obj.updateDynamic("CacheParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Date: js.UndefOr[TStamp] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.updateDynamic("SourceIdentifier")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
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
  trait FailoverGlobalReplicationGroupMessage extends js.Object {
    var GlobalReplicationGroupId: String
    var PrimaryRegion: String
    var PrimaryReplicationGroupId: String
  }

  object FailoverGlobalReplicationGroupMessage {
    @inline
    def apply(
        GlobalReplicationGroupId: String,
        PrimaryRegion: String,
        PrimaryReplicationGroupId: String
    ): FailoverGlobalReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "GlobalReplicationGroupId" -> GlobalReplicationGroupId.asInstanceOf[js.Any],
        "PrimaryRegion" -> PrimaryRegion.asInstanceOf[js.Any],
        "PrimaryReplicationGroupId" -> PrimaryReplicationGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FailoverGlobalReplicationGroupMessage]
    }
  }

  @js.native
  trait FailoverGlobalReplicationGroupResult extends js.Object {
    var GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup]
  }

  object FailoverGlobalReplicationGroupResult {
    @inline
    def apply(
        GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup] = js.undefined
    ): FailoverGlobalReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroup.foreach(__v => __obj.updateDynamic("GlobalReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailoverGlobalReplicationGroupResult]
    }
  }

  /**
    * Indicates the slot configuration and global identifier for a slice group.
    */
  @js.native
  trait GlobalNodeGroup extends js.Object {
    var GlobalNodeGroupId: js.UndefOr[String]
    var Slots: js.UndefOr[String]
  }

  object GlobalNodeGroup {
    @inline
    def apply(
        GlobalNodeGroupId: js.UndefOr[String] = js.undefined,
        Slots: js.UndefOr[String] = js.undefined
    ): GlobalNodeGroup = {
      val __obj = js.Dynamic.literal()
      GlobalNodeGroupId.foreach(__v => __obj.updateDynamic("GlobalNodeGroupId")(__v.asInstanceOf[js.Any]))
      Slots.foreach(__v => __obj.updateDynamic("Slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalNodeGroup]
    }
  }

  /**
    * Consists of a primary cluster that accepts writes and an associated secondary cluster that resides in a different AWS region. The secondary cluster accepts only reads. The primary cluster automatically replicates updates to the secondary cluster.
    * * The ```GlobalReplicationGroupIdSuffix``` represents the name of the Global Datastore, which is what you use to associate a secondary cluster.
    */
  @js.native
  trait GlobalReplicationGroup extends js.Object {
    var ARN: js.UndefOr[String]
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenEnabled: js.UndefOr[BooleanOptional]
    var CacheNodeType: js.UndefOr[String]
    var ClusterEnabled: js.UndefOr[BooleanOptional]
    var Engine: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var GlobalNodeGroups: js.UndefOr[GlobalNodeGroupList]
    var GlobalReplicationGroupDescription: js.UndefOr[String]
    var GlobalReplicationGroupId: js.UndefOr[String]
    var Members: js.UndefOr[GlobalReplicationGroupMemberList]
    var Status: js.UndefOr[String]
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional]
  }

  object GlobalReplicationGroup {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        GlobalNodeGroups: js.UndefOr[GlobalNodeGroupList] = js.undefined,
        GlobalReplicationGroupDescription: js.UndefOr[String] = js.undefined,
        GlobalReplicationGroupId: js.UndefOr[String] = js.undefined,
        Members: js.UndefOr[GlobalReplicationGroupMemberList] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
    ): GlobalReplicationGroup = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      AtRestEncryptionEnabled.foreach(__v => __obj.updateDynamic("AtRestEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      AuthTokenEnabled.foreach(__v => __obj.updateDynamic("AuthTokenEnabled")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      ClusterEnabled.foreach(__v => __obj.updateDynamic("ClusterEnabled")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      GlobalNodeGroups.foreach(__v => __obj.updateDynamic("GlobalNodeGroups")(__v.asInstanceOf[js.Any]))
      GlobalReplicationGroupDescription.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupDescription")(__v.asInstanceOf[js.Any]))
      GlobalReplicationGroupId.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupId")(__v.asInstanceOf[js.Any]))
      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TransitEncryptionEnabled.foreach(__v => __obj.updateDynamic("TransitEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalReplicationGroup]
    }
  }

  /**
    * The name of the Global Datastore and role of this replication group in the Global Datastore.
    */
  @js.native
  trait GlobalReplicationGroupInfo extends js.Object {
    var GlobalReplicationGroupId: js.UndefOr[String]
    var GlobalReplicationGroupMemberRole: js.UndefOr[String]
  }

  object GlobalReplicationGroupInfo {
    @inline
    def apply(
        GlobalReplicationGroupId: js.UndefOr[String] = js.undefined,
        GlobalReplicationGroupMemberRole: js.UndefOr[String] = js.undefined
    ): GlobalReplicationGroupInfo = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroupId.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupId")(__v.asInstanceOf[js.Any]))
      GlobalReplicationGroupMemberRole.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupMemberRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalReplicationGroupInfo]
    }
  }

  /**
    * A member of a Global Datastore. It contains the Replication Group Id, the AWS region and the role of the replication group.
    */
  @js.native
  trait GlobalReplicationGroupMember extends js.Object {
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus]
    var ReplicationGroupId: js.UndefOr[String]
    var ReplicationGroupRegion: js.UndefOr[String]
    var Role: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object GlobalReplicationGroupMember {
    @inline
    def apply(
        AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        ReplicationGroupRegion: js.UndefOr[String] = js.undefined,
        Role: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): GlobalReplicationGroupMember = {
      val __obj = js.Dynamic.literal()
      AutomaticFailover.foreach(__v => __obj.updateDynamic("AutomaticFailover")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      ReplicationGroupRegion.foreach(__v => __obj.updateDynamic("ReplicationGroupRegion")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalReplicationGroupMember]
    }
  }

  @js.native
  trait IncreaseNodeGroupsInGlobalReplicationGroupMessage extends js.Object {
    var ApplyImmediately: Boolean
    var GlobalReplicationGroupId: String
    var NodeGroupCount: Int
    var RegionalConfigurations: js.UndefOr[RegionalConfigurationList]
  }

  object IncreaseNodeGroupsInGlobalReplicationGroupMessage {
    @inline
    def apply(
        ApplyImmediately: Boolean,
        GlobalReplicationGroupId: String,
        NodeGroupCount: Int,
        RegionalConfigurations: js.UndefOr[RegionalConfigurationList] = js.undefined
    ): IncreaseNodeGroupsInGlobalReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "GlobalReplicationGroupId" -> GlobalReplicationGroupId.asInstanceOf[js.Any],
        "NodeGroupCount" -> NodeGroupCount.asInstanceOf[js.Any]
      )

      RegionalConfigurations.foreach(__v => __obj.updateDynamic("RegionalConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncreaseNodeGroupsInGlobalReplicationGroupMessage]
    }
  }

  @js.native
  trait IncreaseNodeGroupsInGlobalReplicationGroupResult extends js.Object {
    var GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup]
  }

  object IncreaseNodeGroupsInGlobalReplicationGroupResult {
    @inline
    def apply(
        GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup] = js.undefined
    ): IncreaseNodeGroupsInGlobalReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroup.foreach(__v => __obj.updateDynamic("GlobalReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncreaseNodeGroupsInGlobalReplicationGroupResult]
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
    @inline
    def apply(
        ApplyImmediately: Boolean,
        ReplicationGroupId: String,
        NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined
    ): IncreaseReplicaCountMessage = {
      val __obj = js.Dynamic.literal(
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      NewReplicaCount.foreach(__v => __obj.updateDynamic("NewReplicaCount")(__v.asInstanceOf[js.Any]))
      ReplicaConfiguration.foreach(__v => __obj.updateDynamic("ReplicaConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncreaseReplicaCountMessage]
    }
  }

  @js.native
  trait IncreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object IncreaseReplicaCountResult {
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): IncreaseReplicaCountResult = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined
    ): ListAllowedNodeTypeModificationsMessage = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ResourceName: String
    ): ListTagsForResourceMessage = {
      val __obj = js.Dynamic.literal(
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

  object ModifyCacheClusterMessage {
    @inline
    def apply(
        CacheClusterId: String,
        AZMode: js.UndefOr[AZMode] = js.undefined,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        AuthToken: js.UndefOr[String] = js.undefined,
        AuthTokenUpdateStrategy: js.UndefOr[AuthTokenUpdateStrategyType] = js.undefined,
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
      val __obj = js.Dynamic.literal(
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any]
      )

      AZMode.foreach(__v => __obj.updateDynamic("AZMode")(__v.asInstanceOf[js.Any]))
      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      AuthToken.foreach(__v => __obj.updateDynamic("AuthToken")(__v.asInstanceOf[js.Any]))
      AuthTokenUpdateStrategy.foreach(__v => __obj.updateDynamic("AuthTokenUpdateStrategy")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      CacheNodeIdsToRemove.foreach(__v => __obj.updateDynamic("CacheNodeIdsToRemove")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
      CacheSecurityGroupNames.foreach(__v => __obj.updateDynamic("CacheSecurityGroupNames")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      NewAvailabilityZones.foreach(__v => __obj.updateDynamic("NewAvailabilityZones")(__v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.updateDynamic("NotificationTopicArn")(__v.asInstanceOf[js.Any]))
      NotificationTopicStatus.foreach(__v => __obj.updateDynamic("NotificationTopicStatus")(__v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.updateDynamic("NumCacheNodes")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCacheClusterMessage]
    }
  }

  @js.native
  trait ModifyCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object ModifyCacheClusterResult {
    @inline
    def apply(
        CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): ModifyCacheClusterResult = {
      val __obj = js.Dynamic.literal()
      CacheCluster.foreach(__v => __obj.updateDynamic("CacheCluster")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupName: String,
        ParameterNameValues: ParameterNameValueList
    ): ModifyCacheParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any],
        "ParameterNameValues" -> ParameterNameValues.asInstanceOf[js.Any]
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
    @inline
    def apply(
        CacheSubnetGroupName: String,
        CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
    ): ModifyCacheSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "CacheSubnetGroupName" -> CacheSubnetGroupName.asInstanceOf[js.Any]
      )

      CacheSubnetGroupDescription.foreach(__v => __obj.updateDynamic("CacheSubnetGroupDescription")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup]
  }

  object ModifyCacheSubnetGroupResult {
    @inline
    def apply(
        CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
    ): ModifyCacheSubnetGroupResult = {
      val __obj = js.Dynamic.literal()
      CacheSubnetGroup.foreach(__v => __obj.updateDynamic("CacheSubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCacheSubnetGroupResult]
    }
  }

  @js.native
  trait ModifyGlobalReplicationGroupMessage extends js.Object {
    var ApplyImmediately: Boolean
    var GlobalReplicationGroupId: String
    var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional]
    var CacheNodeType: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var GlobalReplicationGroupDescription: js.UndefOr[String]
  }

  object ModifyGlobalReplicationGroupMessage {
    @inline
    def apply(
        ApplyImmediately: Boolean,
        GlobalReplicationGroupId: String,
        AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        GlobalReplicationGroupDescription: js.UndefOr[String] = js.undefined
    ): ModifyGlobalReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "GlobalReplicationGroupId" -> GlobalReplicationGroupId.asInstanceOf[js.Any]
      )

      AutomaticFailoverEnabled.foreach(__v => __obj.updateDynamic("AutomaticFailoverEnabled")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      GlobalReplicationGroupDescription.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyGlobalReplicationGroupMessage]
    }
  }

  @js.native
  trait ModifyGlobalReplicationGroupResult extends js.Object {
    var GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup]
  }

  object ModifyGlobalReplicationGroupResult {
    @inline
    def apply(
        GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup] = js.undefined
    ): ModifyGlobalReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroup.foreach(__v => __obj.updateDynamic("GlobalReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyGlobalReplicationGroupResult]
    }
  }

  /**
    * Represents the input of a <code>ModifyReplicationGroups</code> operation.
    */
  @js.native
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
    var MultiAZEnabled: js.UndefOr[BooleanOptional]
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
    @inline
    def apply(
        ReplicationGroupId: String,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        AuthToken: js.UndefOr[String] = js.undefined,
        AuthTokenUpdateStrategy: js.UndefOr[AuthTokenUpdateStrategyType] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MultiAZEnabled: js.UndefOr[BooleanOptional] = js.undefined,
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
      val __obj = js.Dynamic.literal(
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      AuthToken.foreach(__v => __obj.updateDynamic("AuthToken")(__v.asInstanceOf[js.Any]))
      AuthTokenUpdateStrategy.foreach(__v => __obj.updateDynamic("AuthTokenUpdateStrategy")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AutomaticFailoverEnabled.foreach(__v => __obj.updateDynamic("AutomaticFailoverEnabled")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
      CacheSecurityGroupNames.foreach(__v => __obj.updateDynamic("CacheSecurityGroupNames")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      MultiAZEnabled.foreach(__v => __obj.updateDynamic("MultiAZEnabled")(__v.asInstanceOf[js.Any]))
      NodeGroupId.foreach(__v => __obj.updateDynamic("NodeGroupId")(__v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.updateDynamic("NotificationTopicArn")(__v.asInstanceOf[js.Any]))
      NotificationTopicStatus.foreach(__v => __obj.updateDynamic("NotificationTopicStatus")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      PrimaryClusterId.foreach(__v => __obj.updateDynamic("PrimaryClusterId")(__v.asInstanceOf[js.Any]))
      ReplicationGroupDescription.foreach(__v => __obj.updateDynamic("ReplicationGroupDescription")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      SnapshottingClusterId.foreach(__v => __obj.updateDynamic("SnapshottingClusterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationGroupMessage]
    }
  }

  @js.native
  trait ModifyReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object ModifyReplicationGroupResult {
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): ModifyReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApplyImmediately: Boolean,
        NodeGroupCount: Int,
        ReplicationGroupId: String,
        NodeGroupsToRemove: js.UndefOr[NodeGroupsToRemoveList] = js.undefined,
        NodeGroupsToRetain: js.UndefOr[NodeGroupsToRetainList] = js.undefined,
        ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList] = js.undefined
    ): ModifyReplicationGroupShardConfigurationMessage = {
      val __obj = js.Dynamic.literal(
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "NodeGroupCount" -> NodeGroupCount.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      NodeGroupsToRemove.foreach(__v => __obj.updateDynamic("NodeGroupsToRemove")(__v.asInstanceOf[js.Any]))
      NodeGroupsToRetain.foreach(__v => __obj.updateDynamic("NodeGroupsToRetain")(__v.asInstanceOf[js.Any]))
      ReshardingConfiguration.foreach(__v => __obj.updateDynamic("ReshardingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationMessage]
    }
  }

  @js.native
  trait ModifyReplicationGroupShardConfigurationResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object ModifyReplicationGroupShardConfigurationResult {
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): ModifyReplicationGroupShardConfigurationResult = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
    }
  }

  @js.native
  sealed trait MultiAZStatus extends js.Any
  object MultiAZStatus extends js.Object {
    val enabled = "enabled".asInstanceOf[MultiAZStatus]
    val disabled = "disabled".asInstanceOf[MultiAZStatus]

    val values = js.Object.freeze(js.Array(enabled, disabled))
  }

  /**
    * Represents a collection of cache nodes in a replication group. One node in the node group is the read/write primary node. All the other nodes are read-only Replica nodes.
    */
  @js.native
  trait NodeGroup extends js.Object {
    var NodeGroupId: js.UndefOr[String]
    var NodeGroupMembers: js.UndefOr[NodeGroupMemberList]
    var PrimaryEndpoint: js.UndefOr[Endpoint]
    var ReaderEndpoint: js.UndefOr[Endpoint]
    var Slots: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object NodeGroup {
    @inline
    def apply(
        NodeGroupId: js.UndefOr[String] = js.undefined,
        NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.undefined,
        PrimaryEndpoint: js.UndefOr[Endpoint] = js.undefined,
        ReaderEndpoint: js.UndefOr[Endpoint] = js.undefined,
        Slots: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): NodeGroup = {
      val __obj = js.Dynamic.literal()
      NodeGroupId.foreach(__v => __obj.updateDynamic("NodeGroupId")(__v.asInstanceOf[js.Any]))
      NodeGroupMembers.foreach(__v => __obj.updateDynamic("NodeGroupMembers")(__v.asInstanceOf[js.Any]))
      PrimaryEndpoint.foreach(__v => __obj.updateDynamic("PrimaryEndpoint")(__v.asInstanceOf[js.Any]))
      ReaderEndpoint.foreach(__v => __obj.updateDynamic("ReaderEndpoint")(__v.asInstanceOf[js.Any]))
      Slots.foreach(__v => __obj.updateDynamic("Slots")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined,
        PrimaryAvailabilityZone: js.UndefOr[String] = js.undefined,
        ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined,
        ReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
        Slots: js.UndefOr[String] = js.undefined
    ): NodeGroupConfiguration = {
      val __obj = js.Dynamic.literal()
      NodeGroupId.foreach(__v => __obj.updateDynamic("NodeGroupId")(__v.asInstanceOf[js.Any]))
      PrimaryAvailabilityZone.foreach(__v => __obj.updateDynamic("PrimaryAvailabilityZone")(__v.asInstanceOf[js.Any]))
      ReplicaAvailabilityZones.foreach(__v => __obj.updateDynamic("ReplicaAvailabilityZones")(__v.asInstanceOf[js.Any]))
      ReplicaCount.foreach(__v => __obj.updateDynamic("ReplicaCount")(__v.asInstanceOf[js.Any]))
      Slots.foreach(__v => __obj.updateDynamic("Slots")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheNodeId: js.UndefOr[String] = js.undefined,
        CurrentRole: js.UndefOr[String] = js.undefined,
        PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
        ReadEndpoint: js.UndefOr[Endpoint] = js.undefined
    ): NodeGroupMember = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      CacheNodeId.foreach(__v => __obj.updateDynamic("CacheNodeId")(__v.asInstanceOf[js.Any]))
      CurrentRole.foreach(__v => __obj.updateDynamic("CurrentRole")(__v.asInstanceOf[js.Any]))
      PreferredAvailabilityZone.foreach(__v => __obj.updateDynamic("PreferredAvailabilityZone")(__v.asInstanceOf[js.Any]))
      ReadEndpoint.foreach(__v => __obj.updateDynamic("ReadEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeGroupMember]
    }
  }

  /**
    * The status of the service update on the node group member
    */
  @js.native
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

  object NodeGroupMemberUpdateStatus {
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheNodeId: js.UndefOr[String] = js.undefined,
        NodeDeletionDate: js.UndefOr[TStamp] = js.undefined,
        NodeUpdateEndDate: js.UndefOr[TStamp] = js.undefined,
        NodeUpdateInitiatedBy: js.UndefOr[NodeUpdateInitiatedBy] = js.undefined,
        NodeUpdateInitiatedDate: js.UndefOr[TStamp] = js.undefined,
        NodeUpdateStartDate: js.UndefOr[TStamp] = js.undefined,
        NodeUpdateStatus: js.UndefOr[NodeUpdateStatus] = js.undefined,
        NodeUpdateStatusModifiedDate: js.UndefOr[TStamp] = js.undefined
    ): NodeGroupMemberUpdateStatus = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      CacheNodeId.foreach(__v => __obj.updateDynamic("CacheNodeId")(__v.asInstanceOf[js.Any]))
      NodeDeletionDate.foreach(__v => __obj.updateDynamic("NodeDeletionDate")(__v.asInstanceOf[js.Any]))
      NodeUpdateEndDate.foreach(__v => __obj.updateDynamic("NodeUpdateEndDate")(__v.asInstanceOf[js.Any]))
      NodeUpdateInitiatedBy.foreach(__v => __obj.updateDynamic("NodeUpdateInitiatedBy")(__v.asInstanceOf[js.Any]))
      NodeUpdateInitiatedDate.foreach(__v => __obj.updateDynamic("NodeUpdateInitiatedDate")(__v.asInstanceOf[js.Any]))
      NodeUpdateStartDate.foreach(__v => __obj.updateDynamic("NodeUpdateStartDate")(__v.asInstanceOf[js.Any]))
      NodeUpdateStatus.foreach(__v => __obj.updateDynamic("NodeUpdateStatus")(__v.asInstanceOf[js.Any]))
      NodeUpdateStatusModifiedDate.foreach(__v => __obj.updateDynamic("NodeUpdateStatusModifiedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeGroupMemberUpdateStatus]
    }
  }

  /**
    * The status of the service update on the node group
    */
  @js.native
  trait NodeGroupUpdateStatus extends js.Object {
    var NodeGroupId: js.UndefOr[String]
    var NodeGroupMemberUpdateStatus: js.UndefOr[NodeGroupMemberUpdateStatusList]
  }

  object NodeGroupUpdateStatus {
    @inline
    def apply(
        NodeGroupId: js.UndefOr[String] = js.undefined,
        NodeGroupMemberUpdateStatus: js.UndefOr[NodeGroupMemberUpdateStatusList] = js.undefined
    ): NodeGroupUpdateStatus = {
      val __obj = js.Dynamic.literal()
      NodeGroupId.foreach(__v => __obj.updateDynamic("NodeGroupId")(__v.asInstanceOf[js.Any]))
      NodeGroupMemberUpdateStatus.foreach(__v => __obj.updateDynamic("NodeGroupMemberUpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeGroupUpdateStatus]
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
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined,
        CacheNodeId: js.UndefOr[String] = js.undefined,
        CacheSize: js.UndefOr[String] = js.undefined,
        NodeGroupConfiguration: js.UndefOr[NodeGroupConfiguration] = js.undefined,
        NodeGroupId: js.UndefOr[String] = js.undefined,
        SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
    ): NodeSnapshot = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      CacheNodeCreateTime.foreach(__v => __obj.updateDynamic("CacheNodeCreateTime")(__v.asInstanceOf[js.Any]))
      CacheNodeId.foreach(__v => __obj.updateDynamic("CacheNodeId")(__v.asInstanceOf[js.Any]))
      CacheSize.foreach(__v => __obj.updateDynamic("CacheSize")(__v.asInstanceOf[js.Any]))
      NodeGroupConfiguration.foreach(__v => __obj.updateDynamic("NodeGroupConfiguration")(__v.asInstanceOf[js.Any]))
      NodeGroupId.foreach(__v => __obj.updateDynamic("NodeGroupId")(__v.asInstanceOf[js.Any]))
      SnapshotCreateTime.foreach(__v => __obj.updateDynamic("SnapshotCreateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeSnapshot]
    }
  }

  @js.native
  sealed trait NodeUpdateInitiatedBy extends js.Any
  object NodeUpdateInitiatedBy extends js.Object {
    val system = "system".asInstanceOf[NodeUpdateInitiatedBy]
    val customer = "customer".asInstanceOf[NodeUpdateInitiatedBy]

    val values = js.Object.freeze(js.Array(system, customer))
  }

  @js.native
  sealed trait NodeUpdateStatus extends js.Any
  object NodeUpdateStatus extends js.Object {
    val `not-applied` = "not-applied".asInstanceOf[NodeUpdateStatus]
    val `waiting-to-start` = "waiting-to-start".asInstanceOf[NodeUpdateStatus]
    val `in-progress` = "in-progress".asInstanceOf[NodeUpdateStatus]
    val stopping = "stopping".asInstanceOf[NodeUpdateStatus]
    val stopped = "stopped".asInstanceOf[NodeUpdateStatus]
    val complete = "complete".asInstanceOf[NodeUpdateStatus]

    val values = js.Object.freeze(js.Array(`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete))
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
    @inline
    def apply(
        TopicArn: js.UndefOr[String] = js.undefined,
        TopicStatus: js.UndefOr[String] = js.undefined
    ): NotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      TopicStatus.foreach(__v => __obj.updateDynamic("TopicStatus")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      ChangeType.foreach(__v => __obj.updateDynamic("ChangeType")(__v.asInstanceOf[js.Any]))
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
    * Describes a name-value pair that is used to update the value of a parameter.
    */
  @js.native
  trait ParameterNameValue extends js.Object {
    var ParameterName: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
  }

  object ParameterNameValue {
    @inline
    def apply(
        ParameterName: js.UndefOr[String] = js.undefined,
        ParameterValue: js.UndefOr[String] = js.undefined
    ): ParameterNameValue = {
      val __obj = js.Dynamic.literal()
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      ParameterValue.foreach(__v => __obj.updateDynamic("ParameterValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterNameValue]
    }
  }

  @js.native
  sealed trait PendingAutomaticFailoverStatus extends js.Any
  object PendingAutomaticFailoverStatus extends js.Object {
    val enabled = "enabled".asInstanceOf[PendingAutomaticFailoverStatus]
    val disabled = "disabled".asInstanceOf[PendingAutomaticFailoverStatus]

    val values = js.Object.freeze(js.Array(enabled, disabled))
  }

  /**
    * A group of settings that are applied to the cluster in the future, or that are currently being applied.
    */
  @js.native
  trait PendingModifiedValues extends js.Object {
    var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus]
    var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList]
    var CacheNodeType: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
  }

  object PendingModifiedValues {
    @inline
    def apply(
        AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.undefined,
        CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
    ): PendingModifiedValues = {
      val __obj = js.Dynamic.literal()
      AuthTokenStatus.foreach(__v => __obj.updateDynamic("AuthTokenStatus")(__v.asInstanceOf[js.Any]))
      CacheNodeIdsToRemove.foreach(__v => __obj.updateDynamic("CacheNodeIdsToRemove")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.updateDynamic("NumCacheNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingModifiedValues]
    }
  }

  /**
    * Update action that has been processed for the corresponding apply/stop request
    */
  @js.native
  trait ProcessedUpdateAction extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var ServiceUpdateName: js.UndefOr[String]
    var UpdateActionStatus: js.UndefOr[UpdateActionStatus]
  }

  object ProcessedUpdateAction {
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        ServiceUpdateName: js.UndefOr[String] = js.undefined,
        UpdateActionStatus: js.UndefOr[UpdateActionStatus] = js.undefined
    ): ProcessedUpdateAction = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      UpdateActionStatus.foreach(__v => __obj.updateDynamic("UpdateActionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessedUpdateAction]
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
    @inline
    def apply(
        ReservedCacheNodesOfferingId: String,
        CacheNodeCount: js.UndefOr[IntegerOptional] = js.undefined,
        ReservedCacheNodeId: js.UndefOr[String] = js.undefined
    ): PurchaseReservedCacheNodesOfferingMessage = {
      val __obj = js.Dynamic.literal(
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.asInstanceOf[js.Any]
      )

      CacheNodeCount.foreach(__v => __obj.updateDynamic("CacheNodeCount")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodeId.foreach(__v => __obj.updateDynamic("ReservedCacheNodeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
    var ReservedCacheNode: js.UndefOr[ReservedCacheNode]
  }

  object PurchaseReservedCacheNodesOfferingResult {
    @inline
    def apply(
        ReservedCacheNode: js.UndefOr[ReservedCacheNode] = js.undefined
    ): PurchaseReservedCacheNodesOfferingResult = {
      val __obj = js.Dynamic.literal()
      ReservedCacheNode.foreach(__v => __obj.updateDynamic("ReservedCacheNode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
    }
  }

  @js.native
  trait RebalanceSlotsInGlobalReplicationGroupMessage extends js.Object {
    var ApplyImmediately: Boolean
    var GlobalReplicationGroupId: String
  }

  object RebalanceSlotsInGlobalReplicationGroupMessage {
    @inline
    def apply(
        ApplyImmediately: Boolean,
        GlobalReplicationGroupId: String
    ): RebalanceSlotsInGlobalReplicationGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "GlobalReplicationGroupId" -> GlobalReplicationGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebalanceSlotsInGlobalReplicationGroupMessage]
    }
  }

  @js.native
  trait RebalanceSlotsInGlobalReplicationGroupResult extends js.Object {
    var GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup]
  }

  object RebalanceSlotsInGlobalReplicationGroupResult {
    @inline
    def apply(
        GlobalReplicationGroup: js.UndefOr[GlobalReplicationGroup] = js.undefined
    ): RebalanceSlotsInGlobalReplicationGroupResult = {
      val __obj = js.Dynamic.literal()
      GlobalReplicationGroup.foreach(__v => __obj.updateDynamic("GlobalReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebalanceSlotsInGlobalReplicationGroupResult]
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
    @inline
    def apply(
        CacheClusterId: String,
        CacheNodeIdsToReboot: CacheNodeIdsList
    ): RebootCacheClusterMessage = {
      val __obj = js.Dynamic.literal(
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): RebootCacheClusterResult = {
      val __obj = js.Dynamic.literal()
      CacheCluster.foreach(__v => __obj.updateDynamic("CacheCluster")(__v.asInstanceOf[js.Any]))
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
    * A list of the replication groups
    */
  @js.native
  trait RegionalConfiguration extends js.Object {
    var ReplicationGroupId: String
    var ReplicationGroupRegion: String
    var ReshardingConfiguration: ReshardingConfigurationList
  }

  object RegionalConfiguration {
    @inline
    def apply(
        ReplicationGroupId: String,
        ReplicationGroupRegion: String,
        ReshardingConfiguration: ReshardingConfigurationList
    ): RegionalConfiguration = {
      val __obj = js.Dynamic.literal(
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any],
        "ReplicationGroupRegion" -> ReplicationGroupRegion.asInstanceOf[js.Any],
        "ReshardingConfiguration" -> ReshardingConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegionalConfiguration]
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
    @inline
    def apply(
        ResourceName: String,
        TagKeys: KeyList
    ): RemoveTagsFromResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
    * Contains all of the attributes of a specific Redis replication group.
    */
  @js.native
  trait ReplicationGroup extends js.Object {
    var ARN: js.UndefOr[String]
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenEnabled: js.UndefOr[BooleanOptional]
    var AuthTokenLastModifiedDate: js.UndefOr[TStamp]
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus]
    var CacheNodeType: js.UndefOr[String]
    var ClusterEnabled: js.UndefOr[BooleanOptional]
    var ConfigurationEndpoint: js.UndefOr[Endpoint]
    var Description: js.UndefOr[String]
    var GlobalReplicationGroupInfo: js.UndefOr[GlobalReplicationGroupInfo]
    var KmsKeyId: js.UndefOr[String]
    var MemberClusters: js.UndefOr[ClusterIdList]
    var MultiAZ: js.UndefOr[MultiAZStatus]
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
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        AuthTokenLastModifiedDate: js.UndefOr[TStamp] = js.undefined,
        AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        GlobalReplicationGroupInfo: js.UndefOr[GlobalReplicationGroupInfo] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MemberClusters: js.UndefOr[ClusterIdList] = js.undefined,
        MultiAZ: js.UndefOr[MultiAZStatus] = js.undefined,
        NodeGroups: js.UndefOr[NodeGroupList] = js.undefined,
        PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        SnapshottingClusterId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
    ): ReplicationGroup = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      AtRestEncryptionEnabled.foreach(__v => __obj.updateDynamic("AtRestEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      AuthTokenEnabled.foreach(__v => __obj.updateDynamic("AuthTokenEnabled")(__v.asInstanceOf[js.Any]))
      AuthTokenLastModifiedDate.foreach(__v => __obj.updateDynamic("AuthTokenLastModifiedDate")(__v.asInstanceOf[js.Any]))
      AutomaticFailover.foreach(__v => __obj.updateDynamic("AutomaticFailover")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      ClusterEnabled.foreach(__v => __obj.updateDynamic("ClusterEnabled")(__v.asInstanceOf[js.Any]))
      ConfigurationEndpoint.foreach(__v => __obj.updateDynamic("ConfigurationEndpoint")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalReplicationGroupInfo.foreach(__v => __obj.updateDynamic("GlobalReplicationGroupInfo")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MemberClusters.foreach(__v => __obj.updateDynamic("MemberClusters")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      NodeGroups.foreach(__v => __obj.updateDynamic("NodeGroups")(__v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.updateDynamic("PendingModifiedValues")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      SnapshottingClusterId.foreach(__v => __obj.updateDynamic("SnapshottingClusterId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TransitEncryptionEnabled.foreach(__v => __obj.updateDynamic("TransitEncryptionEnabled")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.undefined
    ): ReplicationGroupMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationGroups.foreach(__v => __obj.updateDynamic("ReplicationGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationGroupMessage]
    }
  }

  /**
    * The settings to be applied to the Redis replication group, either immediately or during the next maintenance window.
    */
  @js.native
  trait ReplicationGroupPendingModifiedValues extends js.Object {
    var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus]
    var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus]
    var PrimaryClusterId: js.UndefOr[String]
    var Resharding: js.UndefOr[ReshardingStatus]
  }

  object ReplicationGroupPendingModifiedValues {
    @inline
    def apply(
        AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.undefined,
        AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.undefined,
        PrimaryClusterId: js.UndefOr[String] = js.undefined,
        Resharding: js.UndefOr[ReshardingStatus] = js.undefined
    ): ReplicationGroupPendingModifiedValues = {
      val __obj = js.Dynamic.literal()
      AuthTokenStatus.foreach(__v => __obj.updateDynamic("AuthTokenStatus")(__v.asInstanceOf[js.Any]))
      AutomaticFailoverStatus.foreach(__v => __obj.updateDynamic("AutomaticFailoverStatus")(__v.asInstanceOf[js.Any]))
      PrimaryClusterId.foreach(__v => __obj.updateDynamic("PrimaryClusterId")(__v.asInstanceOf[js.Any]))
      Resharding.foreach(__v => __obj.updateDynamic("Resharding")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      CacheNodeCount.foreach(__v => __obj.updateDynamic("CacheNodeCount")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservationARN.foreach(__v => __obj.updateDynamic("ReservationARN")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodeId.foreach(__v => __obj.updateDynamic("ReservedCacheNodeId")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferingId.foreach(__v => __obj.updateDynamic("ReservedCacheNodesOfferingId")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.undefined
    ): ReservedCacheNodeMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodes.foreach(__v => __obj.updateDynamic("ReservedCacheNodes")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferingId.foreach(__v => __obj.updateDynamic("ReservedCacheNodesOfferingId")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.undefined
    ): ReservedCacheNodesOfferingMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReservedCacheNodesOfferings.foreach(__v => __obj.updateDynamic("ReservedCacheNodesOfferings")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheParameterGroupName: String,
        ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.undefined,
        ResetAllParameters: js.UndefOr[Boolean] = js.undefined
    ): ResetCacheParameterGroupMessage = {
      val __obj = js.Dynamic.literal(
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any]
      )

      ParameterNameValues.foreach(__v => __obj.updateDynamic("ParameterNameValues")(__v.asInstanceOf[js.Any]))
      ResetAllParameters.foreach(__v => __obj.updateDynamic("ResetAllParameters")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined,
        PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
    ): ReshardingConfiguration = {
      val __obj = js.Dynamic.literal()
      NodeGroupId.foreach(__v => __obj.updateDynamic("NodeGroupId")(__v.asInstanceOf[js.Any]))
      PreferredAvailabilityZones.foreach(__v => __obj.updateDynamic("PreferredAvailabilityZones")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        SlotMigration: js.UndefOr[SlotMigration] = js.undefined
    ): ReshardingStatus = {
      val __obj = js.Dynamic.literal()
      SlotMigration.foreach(__v => __obj.updateDynamic("SlotMigration")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CacheSecurityGroupName: String,
        EC2SecurityGroupName: String,
        EC2SecurityGroupOwnerId: String
    ): RevokeCacheSecurityGroupIngressMessage = {
      val __obj = js.Dynamic.literal(
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupName" -> EC2SecurityGroupName.asInstanceOf[js.Any],
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
    @inline
    def apply(
        CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): RevokeCacheSecurityGroupIngressResult = {
      val __obj = js.Dynamic.literal()
      CacheSecurityGroup.foreach(__v => __obj.updateDynamic("CacheSecurityGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        SecurityGroupId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): SecurityGroupMembership = {
      val __obj = js.Dynamic.literal()
      SecurityGroupId.foreach(__v => __obj.updateDynamic("SecurityGroupId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroupMembership]
    }
  }

  /**
    * An update that you can apply to your Redis clusters.
    */
  @js.native
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

  object ServiceUpdate {
    @inline
    def apply(
        AutoUpdateAfterRecommendedApplyByDate: js.UndefOr[BooleanOptional] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        EstimatedUpdateTime: js.UndefOr[String] = js.undefined,
        ServiceUpdateDescription: js.UndefOr[String] = js.undefined,
        ServiceUpdateEndDate: js.UndefOr[TStamp] = js.undefined,
        ServiceUpdateName: js.UndefOr[String] = js.undefined,
        ServiceUpdateRecommendedApplyByDate: js.UndefOr[TStamp] = js.undefined,
        ServiceUpdateReleaseDate: js.UndefOr[TStamp] = js.undefined,
        ServiceUpdateSeverity: js.UndefOr[ServiceUpdateSeverity] = js.undefined,
        ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatus] = js.undefined,
        ServiceUpdateType: js.UndefOr[ServiceUpdateType] = js.undefined
    ): ServiceUpdate = {
      val __obj = js.Dynamic.literal()
      AutoUpdateAfterRecommendedApplyByDate.foreach(__v => __obj.updateDynamic("AutoUpdateAfterRecommendedApplyByDate")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      EstimatedUpdateTime.foreach(__v => __obj.updateDynamic("EstimatedUpdateTime")(__v.asInstanceOf[js.Any]))
      ServiceUpdateDescription.foreach(__v => __obj.updateDynamic("ServiceUpdateDescription")(__v.asInstanceOf[js.Any]))
      ServiceUpdateEndDate.foreach(__v => __obj.updateDynamic("ServiceUpdateEndDate")(__v.asInstanceOf[js.Any]))
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      ServiceUpdateRecommendedApplyByDate.foreach(__v => __obj.updateDynamic("ServiceUpdateRecommendedApplyByDate")(__v.asInstanceOf[js.Any]))
      ServiceUpdateReleaseDate.foreach(__v => __obj.updateDynamic("ServiceUpdateReleaseDate")(__v.asInstanceOf[js.Any]))
      ServiceUpdateSeverity.foreach(__v => __obj.updateDynamic("ServiceUpdateSeverity")(__v.asInstanceOf[js.Any]))
      ServiceUpdateStatus.foreach(__v => __obj.updateDynamic("ServiceUpdateStatus")(__v.asInstanceOf[js.Any]))
      ServiceUpdateType.foreach(__v => __obj.updateDynamic("ServiceUpdateType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceUpdate]
    }
  }

  @js.native
  sealed trait ServiceUpdateSeverity extends js.Any
  object ServiceUpdateSeverity extends js.Object {
    val critical = "critical".asInstanceOf[ServiceUpdateSeverity]
    val important = "important".asInstanceOf[ServiceUpdateSeverity]
    val medium = "medium".asInstanceOf[ServiceUpdateSeverity]
    val low = "low".asInstanceOf[ServiceUpdateSeverity]

    val values = js.Object.freeze(js.Array(critical, important, medium, low))
  }

  @js.native
  sealed trait ServiceUpdateStatus extends js.Any
  object ServiceUpdateStatus extends js.Object {
    val available = "available".asInstanceOf[ServiceUpdateStatus]
    val cancelled = "cancelled".asInstanceOf[ServiceUpdateStatus]
    val expired = "expired".asInstanceOf[ServiceUpdateStatus]

    val values = js.Object.freeze(js.Array(available, cancelled, expired))
  }

  @js.native
  sealed trait ServiceUpdateType extends js.Any
  object ServiceUpdateType extends js.Object {
    val `security-update` = "security-update".asInstanceOf[ServiceUpdateType]

    val values = js.Object.freeze(js.Array(`security-update`))
  }

  @js.native
  trait ServiceUpdatesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var ServiceUpdates: js.UndefOr[ServiceUpdateList]
  }

  object ServiceUpdatesMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ServiceUpdates: js.UndefOr[ServiceUpdateList] = js.undefined
    ): ServiceUpdatesMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ServiceUpdates.foreach(__v => __obj.updateDynamic("ServiceUpdates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceUpdatesMessage]
    }
  }

  @js.native
  sealed trait SlaMet extends js.Any
  object SlaMet extends js.Object {
    val yes = "yes".asInstanceOf[SlaMet]
    val no = "no".asInstanceOf[SlaMet]
    val `n/a` = "n/a".asInstanceOf[SlaMet]

    val values = js.Object.freeze(js.Array(yes, no, `n/a`))
  }

  /**
    * Represents the progress of an online resharding operation.
    */
  @js.native
  trait SlotMigration extends js.Object {
    var ProgressPercentage: js.UndefOr[Double]
  }

  object SlotMigration {
    @inline
    def apply(
        ProgressPercentage: js.UndefOr[Double] = js.undefined
    ): SlotMigration = {
      val __obj = js.Dynamic.literal()
      ProgressPercentage.foreach(__v => __obj.updateDynamic("ProgressPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlotMigration]
    }
  }

  /**
    * Represents a copy of an entire Redis cluster as of the time when the snapshot was taken.
    */
  @js.native
  trait Snapshot extends js.Object {
    var ARN: js.UndefOr[String]
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

  object Snapshot {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined,
        CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheNodeType: js.UndefOr[String] = js.undefined,
        CacheParameterGroupName: js.UndefOr[String] = js.undefined,
        CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
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
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AutomaticFailover.foreach(__v => __obj.updateDynamic("AutomaticFailover")(__v.asInstanceOf[js.Any]))
      CacheClusterCreateTime.foreach(__v => __obj.updateDynamic("CacheClusterCreateTime")(__v.asInstanceOf[js.Any]))
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      CacheNodeType.foreach(__v => __obj.updateDynamic("CacheNodeType")(__v.asInstanceOf[js.Any]))
      CacheParameterGroupName.foreach(__v => __obj.updateDynamic("CacheParameterGroupName")(__v.asInstanceOf[js.Any]))
      CacheSubnetGroupName.foreach(__v => __obj.updateDynamic("CacheSubnetGroupName")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      NodeSnapshots.foreach(__v => __obj.updateDynamic("NodeSnapshots")(__v.asInstanceOf[js.Any]))
      NumCacheNodes.foreach(__v => __obj.updateDynamic("NumCacheNodes")(__v.asInstanceOf[js.Any]))
      NumNodeGroups.foreach(__v => __obj.updateDynamic("NumNodeGroups")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredAvailabilityZone.foreach(__v => __obj.updateDynamic("PreferredAvailabilityZone")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      ReplicationGroupDescription.foreach(__v => __obj.updateDynamic("ReplicationGroupDescription")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.updateDynamic("SnapshotName")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotSource.foreach(__v => __obj.updateDynamic("SnapshotSource")(__v.asInstanceOf[js.Any]))
      SnapshotStatus.foreach(__v => __obj.updateDynamic("SnapshotStatus")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Snapshot]
    }
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val `cache-cluster` = "cache-cluster".asInstanceOf[SourceType]
    val `cache-parameter-group` = "cache-parameter-group".asInstanceOf[SourceType]
    val `cache-security-group` = "cache-security-group".asInstanceOf[SourceType]
    val `cache-subnet-group` = "cache-subnet-group".asInstanceOf[SourceType]
    val `replication-group` = "replication-group".asInstanceOf[SourceType]

    val values = js.Object.freeze(js.Array(`cache-cluster`, `cache-parameter-group`, `cache-security-group`, `cache-subnet-group`, `replication-group`))
  }

  @js.native
  trait StartMigrationMessage extends js.Object {
    var CustomerNodeEndpointList: CustomerNodeEndpointList
    var ReplicationGroupId: String
  }

  object StartMigrationMessage {
    @inline
    def apply(
        CustomerNodeEndpointList: CustomerNodeEndpointList,
        ReplicationGroupId: String
    ): StartMigrationMessage = {
      val __obj = js.Dynamic.literal(
        "CustomerNodeEndpointList" -> CustomerNodeEndpointList.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartMigrationMessage]
    }
  }

  @js.native
  trait StartMigrationResponse extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object StartMigrationResponse {
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): StartMigrationResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMigrationResponse]
    }
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
    @inline
    def apply(
        SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        SubnetIdentifier: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dynamic.literal()
      SubnetAvailabilityZone.foreach(__v => __obj.updateDynamic("SubnetAvailabilityZone")(__v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.updateDynamic("SubnetIdentifier")(__v.asInstanceOf[js.Any]))
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
    * Represents the output from the <code>AddTagsToResource</code>, <code>ListTagsForResource</code>, and <code>RemoveTagsFromResource</code> operations.
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

  @js.native
  trait TestFailoverMessage extends js.Object {
    var NodeGroupId: AllowedNodeGroupId
    var ReplicationGroupId: String
  }

  object TestFailoverMessage {
    @inline
    def apply(
        NodeGroupId: AllowedNodeGroupId,
        ReplicationGroupId: String
    ): TestFailoverMessage = {
      val __obj = js.Dynamic.literal(
        "NodeGroupId" -> NodeGroupId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): TestFailoverResult = {
      val __obj = js.Dynamic.literal()
      ReplicationGroup.foreach(__v => __obj.updateDynamic("ReplicationGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestFailoverResult]
    }
  }

  /**
    * Filters update actions from the service updates that are in available status during the time range.
    */
  @js.native
  trait TimeRangeFilter extends js.Object {
    var EndTime: js.UndefOr[TStamp]
    var StartTime: js.UndefOr[TStamp]
  }

  object TimeRangeFilter {
    @inline
    def apply(
        EndTime: js.UndefOr[TStamp] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined
    ): TimeRangeFilter = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRangeFilter]
    }
  }

  /**
    * Update action that has failed to be processed for the corresponding apply/stop request
    */
  @js.native
  trait UnprocessedUpdateAction extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var ErrorType: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var ServiceUpdateName: js.UndefOr[String]
  }

  object UnprocessedUpdateAction {
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ErrorType: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        ServiceUpdateName: js.UndefOr[String] = js.undefined
    ): UnprocessedUpdateAction = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ErrorType.foreach(__v => __obj.updateDynamic("ErrorType")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedUpdateAction]
    }
  }

  /**
    * The status of the service update for a specific replication group
    */
  @js.native
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

  object UpdateAction {
    @inline
    def apply(
        CacheClusterId: js.UndefOr[String] = js.undefined,
        CacheNodeUpdateStatus: js.UndefOr[CacheNodeUpdateStatusList] = js.undefined,
        Engine: js.UndefOr[String] = js.undefined,
        EstimatedUpdateTime: js.UndefOr[String] = js.undefined,
        NodeGroupUpdateStatus: js.UndefOr[NodeGroupUpdateStatusList] = js.undefined,
        NodesUpdated: js.UndefOr[String] = js.undefined,
        ReplicationGroupId: js.UndefOr[String] = js.undefined,
        ServiceUpdateName: js.UndefOr[String] = js.undefined,
        ServiceUpdateRecommendedApplyByDate: js.UndefOr[TStamp] = js.undefined,
        ServiceUpdateReleaseDate: js.UndefOr[TStamp] = js.undefined,
        ServiceUpdateSeverity: js.UndefOr[ServiceUpdateSeverity] = js.undefined,
        ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatus] = js.undefined,
        ServiceUpdateType: js.UndefOr[ServiceUpdateType] = js.undefined,
        SlaMet: js.UndefOr[SlaMet] = js.undefined,
        UpdateActionAvailableDate: js.UndefOr[TStamp] = js.undefined,
        UpdateActionStatus: js.UndefOr[UpdateActionStatus] = js.undefined,
        UpdateActionStatusModifiedDate: js.UndefOr[TStamp] = js.undefined
    ): UpdateAction = {
      val __obj = js.Dynamic.literal()
      CacheClusterId.foreach(__v => __obj.updateDynamic("CacheClusterId")(__v.asInstanceOf[js.Any]))
      CacheNodeUpdateStatus.foreach(__v => __obj.updateDynamic("CacheNodeUpdateStatus")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EstimatedUpdateTime.foreach(__v => __obj.updateDynamic("EstimatedUpdateTime")(__v.asInstanceOf[js.Any]))
      NodeGroupUpdateStatus.foreach(__v => __obj.updateDynamic("NodeGroupUpdateStatus")(__v.asInstanceOf[js.Any]))
      NodesUpdated.foreach(__v => __obj.updateDynamic("NodesUpdated")(__v.asInstanceOf[js.Any]))
      ReplicationGroupId.foreach(__v => __obj.updateDynamic("ReplicationGroupId")(__v.asInstanceOf[js.Any]))
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      ServiceUpdateRecommendedApplyByDate.foreach(__v => __obj.updateDynamic("ServiceUpdateRecommendedApplyByDate")(__v.asInstanceOf[js.Any]))
      ServiceUpdateReleaseDate.foreach(__v => __obj.updateDynamic("ServiceUpdateReleaseDate")(__v.asInstanceOf[js.Any]))
      ServiceUpdateSeverity.foreach(__v => __obj.updateDynamic("ServiceUpdateSeverity")(__v.asInstanceOf[js.Any]))
      ServiceUpdateStatus.foreach(__v => __obj.updateDynamic("ServiceUpdateStatus")(__v.asInstanceOf[js.Any]))
      ServiceUpdateType.foreach(__v => __obj.updateDynamic("ServiceUpdateType")(__v.asInstanceOf[js.Any]))
      SlaMet.foreach(__v => __obj.updateDynamic("SlaMet")(__v.asInstanceOf[js.Any]))
      UpdateActionAvailableDate.foreach(__v => __obj.updateDynamic("UpdateActionAvailableDate")(__v.asInstanceOf[js.Any]))
      UpdateActionStatus.foreach(__v => __obj.updateDynamic("UpdateActionStatus")(__v.asInstanceOf[js.Any]))
      UpdateActionStatusModifiedDate.foreach(__v => __obj.updateDynamic("UpdateActionStatusModifiedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAction]
    }
  }

  @js.native
  trait UpdateActionResultsMessage extends js.Object {
    var ProcessedUpdateActions: js.UndefOr[ProcessedUpdateActionList]
    var UnprocessedUpdateActions: js.UndefOr[UnprocessedUpdateActionList]
  }

  object UpdateActionResultsMessage {
    @inline
    def apply(
        ProcessedUpdateActions: js.UndefOr[ProcessedUpdateActionList] = js.undefined,
        UnprocessedUpdateActions: js.UndefOr[UnprocessedUpdateActionList] = js.undefined
    ): UpdateActionResultsMessage = {
      val __obj = js.Dynamic.literal()
      ProcessedUpdateActions.foreach(__v => __obj.updateDynamic("ProcessedUpdateActions")(__v.asInstanceOf[js.Any]))
      UnprocessedUpdateActions.foreach(__v => __obj.updateDynamic("UnprocessedUpdateActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateActionResultsMessage]
    }
  }

  @js.native
  sealed trait UpdateActionStatus extends js.Any
  object UpdateActionStatus extends js.Object {
    val `not-applied` = "not-applied".asInstanceOf[UpdateActionStatus]
    val `waiting-to-start` = "waiting-to-start".asInstanceOf[UpdateActionStatus]
    val `in-progress` = "in-progress".asInstanceOf[UpdateActionStatus]
    val stopping = "stopping".asInstanceOf[UpdateActionStatus]
    val stopped = "stopped".asInstanceOf[UpdateActionStatus]
    val complete = "complete".asInstanceOf[UpdateActionStatus]
    val scheduling = "scheduling".asInstanceOf[UpdateActionStatus]
    val scheduled = "scheduled".asInstanceOf[UpdateActionStatus]
    val `not-applicable` = "not-applicable".asInstanceOf[UpdateActionStatus]

    val values = js.Object.freeze(js.Array(`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete, scheduling, scheduled, `not-applicable`))
  }

  @js.native
  trait UpdateActionsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var UpdateActions: js.UndefOr[UpdateActionList]
  }

  object UpdateActionsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        UpdateActions: js.UndefOr[UpdateActionList] = js.undefined
    ): UpdateActionsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      UpdateActions.foreach(__v => __obj.updateDynamic("UpdateActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateActionsMessage]
    }
  }
}
