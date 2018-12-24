package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object elasticache {
  type AZMode = String
  type AllowedNodeGroupId = String
  type AutomaticFailoverStatus = String
  type AvailabilityZonesList = js.Array[String]
  type BooleanOptional = Boolean
  type CacheClusterList = js.Array[CacheCluster]
  type CacheEngineVersionList = js.Array[CacheEngineVersion]
  type CacheNodeIdsList = js.Array[String]
  type CacheNodeList = js.Array[CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList = js.Array[CacheNodeTypeSpecificValue]
  type CacheParameterGroupList = js.Array[CacheParameterGroup]
  type CacheSecurityGroupMembershipList = js.Array[CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList = js.Array[String]
  type CacheSecurityGroups = js.Array[CacheSecurityGroup]
  type CacheSubnetGroups = js.Array[CacheSubnetGroup]
  type ChangeType = String
  type ClusterIdList = js.Array[String]
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EventList = js.Array[Event]
  type IntegerOptional = Int
  type KeyList = js.Array[String]
  type NodeGroupConfigurationList = js.Array[NodeGroupConfiguration]
  type NodeGroupList = js.Array[NodeGroup]
  type NodeGroupMemberList = js.Array[NodeGroupMember]
  type NodeGroupsToRemoveList = js.Array[AllowedNodeGroupId]
  type NodeGroupsToRetainList = js.Array[AllowedNodeGroupId]
  type NodeSnapshotList = js.Array[NodeSnapshot]
  type NodeTypeList = js.Array[String]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParametersList = js.Array[Parameter]
  type PendingAutomaticFailoverStatus = String
  type PreferredAvailabilityZoneList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type RemoveReplicasList = js.Array[String]
  type ReplicaConfigurationList = js.Array[ConfigureShard]
  type ReplicationGroupList = js.Array[ReplicationGroup]
  type ReservedCacheNodeList = js.Array[ReservedCacheNode]
  type ReservedCacheNodesOfferingList = js.Array[ReservedCacheNodesOffering]
  type ReshardingConfigurationList = js.Array[ReshardingConfiguration]
  type SecurityGroupIdsList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type SnapshotArnsList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SourceType = String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = js.Date
  type TagList = js.Array[Tag]
}

package elasticache {
  @js.native
  @JSImport("aws-sdk", "ElastiCache")
  class ElastiCache() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceMessage): Request[TagListMessage] = js.native
    def authorizeCacheSecurityGroupIngress(params: AuthorizeCacheSecurityGroupIngressMessage): Request[AuthorizeCacheSecurityGroupIngressResult] = js.native
    def copySnapshot(params: CopySnapshotMessage): Request[CopySnapshotResult] = js.native
    def createCacheCluster(params: CreateCacheClusterMessage): Request[CreateCacheClusterResult] = js.native
    def createCacheParameterGroup(params: CreateCacheParameterGroupMessage): Request[CreateCacheParameterGroupResult] = js.native
    def createCacheSecurityGroup(params: CreateCacheSecurityGroupMessage): Request[CreateCacheSecurityGroupResult] = js.native
    def createCacheSubnetGroup(params: CreateCacheSubnetGroupMessage): Request[CreateCacheSubnetGroupResult] = js.native
    def createReplicationGroup(params: CreateReplicationGroupMessage): Request[CreateReplicationGroupResult] = js.native
    def createSnapshot(params: CreateSnapshotMessage): Request[CreateSnapshotResult] = js.native
    def decreaseReplicaCount(params: DecreaseReplicaCountMessage): Request[DecreaseReplicaCountResult] = js.native
    def deleteCacheCluster(params: DeleteCacheClusterMessage): Request[DeleteCacheClusterResult] = js.native
    def deleteCacheParameterGroup(params: DeleteCacheParameterGroupMessage): Request[js.Object] = js.native
    def deleteCacheSecurityGroup(params: DeleteCacheSecurityGroupMessage): Request[js.Object] = js.native
    def deleteCacheSubnetGroup(params: DeleteCacheSubnetGroupMessage): Request[js.Object] = js.native
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
    def describeReplicationGroups(params: DescribeReplicationGroupsMessage): Request[ReplicationGroupMessage] = js.native
    def describeReservedCacheNodes(params: DescribeReservedCacheNodesMessage): Request[ReservedCacheNodeMessage] = js.native
    def describeReservedCacheNodesOfferings(params: DescribeReservedCacheNodesOfferingsMessage): Request[ReservedCacheNodesOfferingMessage] = js.native
    def describeSnapshots(params: DescribeSnapshotsMessage): Request[DescribeSnapshotsListMessage] = js.native
    def increaseReplicaCount(params: IncreaseReplicaCountMessage): Request[IncreaseReplicaCountResult] = js.native
    def listAllowedNodeTypeModifications(params: ListAllowedNodeTypeModificationsMessage): Request[AllowedNodeTypeModificationsMessage] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage] = js.native
    def modifyCacheCluster(params: ModifyCacheClusterMessage): Request[ModifyCacheClusterResult] = js.native
    def modifyCacheParameterGroup(params: ModifyCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage] = js.native
    def modifyCacheSubnetGroup(params: ModifyCacheSubnetGroupMessage): Request[ModifyCacheSubnetGroupResult] = js.native
    def modifyReplicationGroup(params: ModifyReplicationGroupMessage): Request[ModifyReplicationGroupResult] = js.native
    def modifyReplicationGroupShardConfiguration(params: ModifyReplicationGroupShardConfigurationMessage): Request[ModifyReplicationGroupShardConfigurationResult] = js.native
    def purchaseReservedCacheNodesOffering(params: PurchaseReservedCacheNodesOfferingMessage): Request[PurchaseReservedCacheNodesOfferingResult] = js.native
    def rebootCacheCluster(params: RebootCacheClusterMessage): Request[RebootCacheClusterResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[TagListMessage] = js.native
    def resetCacheParameterGroup(params: ResetCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage] = js.native
    def revokeCacheSecurityGroupIngress(params: RevokeCacheSecurityGroupIngressMessage): Request[RevokeCacheSecurityGroupIngressResult] = js.native
    def testFailover(params: TestFailoverMessage): Request[TestFailoverResult] = js.native
  }

  object AZModeEnum {
    val `single-az` = "single-az"
    val `cross-az` = "cross-az"

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
      Tags: TagList): AddTagsToResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceMessage]
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
      ScaleUpModifications: js.UndefOr[NodeTypeList] = js.undefined): AllowedNodeTypeModificationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScaleUpModifications" -> ScaleUpModifications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllowedNodeTypeModificationsMessage]
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
      EC2SecurityGroupOwnerId: String): AuthorizeCacheSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupName" -> EC2SecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeCacheSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  object AuthorizeCacheSecurityGroupIngressResult {
    def apply(
      CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined): AuthorizeCacheSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroup" -> CacheSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeCacheSecurityGroupIngressResult]
    }
  }

  object AutomaticFailoverStatusEnum {
    val enabled = "enabled"
    val disabled = "disabled"
    val enabling = "enabling"
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
      Name: js.UndefOr[String] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
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
      TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined): CacheCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AtRestEncryptionEnabled" -> AtRestEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "AuthTokenEnabled" -> AuthTokenEnabled.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterCreateTime" -> CacheClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterStatus" -> CacheClusterStatus.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "CacheNodes" -> CacheNodes.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroup" -> CacheParameterGroup.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroups" -> CacheSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "ClientDownloadLandingPage" -> ClientDownloadLandingPage.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationEndpoint" -> ConfigurationEndpoint.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfiguration" -> NotificationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "PendingModifiedValues" -> PendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "TransitEncryptionEnabled" -> TransitEncryptionEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheCluster]
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
      Marker: js.UndefOr[String] = js.undefined): CacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusters" -> CacheClusters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheClusterMessage]
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
      EngineVersion: js.UndefOr[String] = js.undefined): CacheEngineVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheEngineDescription" -> CacheEngineDescription.map { x => x.asInstanceOf[js.Any] },
        "CacheEngineVersionDescription" -> CacheEngineVersionDescription.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheEngineVersion]
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
      Marker: js.UndefOr[String] = js.undefined): CacheEngineVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheEngineVersions" -> CacheEngineVersions.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheEngineVersionMessage]
    }
  }

  /**
   * Represents an individual cache node within a cluster. Each cache node runs its own instance of the cluster's protocol-compliant caching software - either Memcached or Redis.
   *  The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.
   * * General purpose:
   * <li> Current generation:
   *  <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
   *  <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
   *  <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
   *  * Previous generation: (not recommended)
   *  <b>T1 node types:</b> <code>cache.t1.micro</code>
   *  <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
   * </li> * Compute optimized:
   * <li> Previous generation: (not recommended)
   *  <b>C1 node types:</b> <code>cache.c1.xlarge</code>
   * </li> * Memory optimized:
   * <li> Current generation:
   *  <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
   *  <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
   *  * Previous generation: (not recommended)
   *  <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
   * </li><b>Notes:</b>
   * * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
   *  * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
   *  * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
   *  * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
   * For a complete listing of node types and specifications, see:
   * * <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a>
   *  * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific">Cache Node Type-Specific Parameters for Memcached</a>
   *  * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific">Cache Node Type-Specific Parameters for Redis</a>
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
      SourceCacheNodeId: js.UndefOr[String] = js.undefined): CacheNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeCreateTime" -> CacheNodeCreateTime.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeId" -> CacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeStatus" -> CacheNodeStatus.map { x => x.asInstanceOf[js.Any] },
        "CustomerAvailabilityZone" -> CustomerAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupStatus" -> ParameterGroupStatus.map { x => x.asInstanceOf[js.Any] },
        "SourceCacheNodeId" -> SourceCacheNodeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheNode]
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
      Source: js.UndefOr[String] = js.undefined): CacheNodeTypeSpecificParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeTypeSpecificValues" -> CacheNodeTypeSpecificValues.map { x => x.asInstanceOf[js.Any] },
        "ChangeType" -> ChangeType.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheNodeTypeSpecificParameter]
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
      Value: js.UndefOr[String] = js.undefined): CacheNodeTypeSpecificValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheNodeTypeSpecificValue]
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
      Description: js.UndefOr[String] = js.undefined): CacheParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroup]
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
      Parameters: js.UndefOr[ParametersList] = js.undefined): CacheParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeTypeSpecificParameters" -> CacheNodeTypeSpecificParameters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupDetails]
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
      CacheParameterGroupName: js.UndefOr[String] = js.undefined): CacheParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupNameMessage]
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
      ParameterApplyStatus: js.UndefOr[String] = js.undefined): CacheParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeIdsToReboot" -> CacheNodeIdsToReboot.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupStatus]
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
      Marker: js.UndefOr[String] = js.undefined): CacheParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroups" -> CacheParameterGroups.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupsMessage]
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
      OwnerId: js.UndefOr[String] = js.undefined): CacheSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroups" -> EC2SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSecurityGroup]
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
      Status: js.UndefOr[String] = js.undefined): CacheSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSecurityGroupMembership]
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
      Marker: js.UndefOr[String] = js.undefined): CacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroups" -> CacheSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSecurityGroupMessage]
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
      VpcId: js.UndefOr[String] = js.undefined): CacheSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSubnetGroup]
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
      Marker: js.UndefOr[String] = js.undefined): CacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroups" -> CacheSubnetGroups.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSubnetGroupMessage]
    }
  }

  object ChangeTypeEnum {
    val immediate = "immediate"
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
      PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined): ConfigureShard = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NewReplicaCount" -> NewReplicaCount.asInstanceOf[js.Any],
        "NodeGroupId" -> NodeGroupId.asInstanceOf[js.Any],
        "PreferredAvailabilityZones" -> PreferredAvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigureShard]
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
      TargetBucket: js.UndefOr[String] = js.undefined): CopySnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceSnapshotName" -> SourceSnapshotName.asInstanceOf[js.Any],
        "TargetSnapshotName" -> TargetSnapshotName.asInstanceOf[js.Any],
        "TargetBucket" -> TargetBucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotMessage]
    }
  }

  @js.native
  trait CopySnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CopySnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): CopySnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotResult]
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
      Tags: js.UndefOr[TagList] = js.undefined): CreateCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any],
        "AZMode" -> AZMode.map { x => x.asInstanceOf[js.Any] },
        "AuthToken" -> AuthToken.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZones" -> PreferredAvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "SnapshotArns" -> SnapshotArns.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheClusterMessage]
    }
  }

  @js.native
  trait CreateCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object CreateCacheClusterResult {
    def apply(
      CacheCluster: js.UndefOr[CacheCluster] = js.undefined): CreateCacheClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheCluster" -> CacheCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheClusterResult]
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
      Description: String): CreateCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.asInstanceOf[js.Any],
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheParameterGroupMessage]
    }
  }

  @js.native
  trait CreateCacheParameterGroupResult extends js.Object {
    var CacheParameterGroup: js.UndefOr[CacheParameterGroup]
  }

  object CreateCacheParameterGroupResult {
    def apply(
      CacheParameterGroup: js.UndefOr[CacheParameterGroup] = js.undefined): CreateCacheParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroup" -> CacheParameterGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheParameterGroupResult]
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
      Description: String): CreateCacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateCacheSecurityGroupResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  object CreateCacheSecurityGroupResult {
    def apply(
      CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined): CreateCacheSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroup" -> CacheSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheSecurityGroupResult]
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
      SubnetIds: SubnetIdentifierList): CreateCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.asInstanceOf[js.Any],
        "CacheSubnetGroupName" -> CacheSubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup]
  }

  object CreateCacheSubnetGroupResult {
    def apply(
      CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined): CreateCacheSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroup" -> CacheSubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheSubnetGroupResult]
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
      TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined): CreateReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroupDescription" -> ReplicationGroupDescription.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any],
        "AtRestEncryptionEnabled" -> AtRestEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "AuthToken" -> AuthToken.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "AutomaticFailoverEnabled" -> AutomaticFailoverEnabled.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupConfiguration" -> NodeGroupConfiguration.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "NumCacheClusters" -> NumCacheClusters.map { x => x.asInstanceOf[js.Any] },
        "NumNodeGroups" -> NumNodeGroups.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PreferredCacheClusterAZs" -> PreferredCacheClusterAZs.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "PrimaryClusterId" -> PrimaryClusterId.map { x => x.asInstanceOf[js.Any] },
        "ReplicasPerNodeGroup" -> ReplicasPerNodeGroup.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "SnapshotArns" -> SnapshotArns.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TransitEncryptionEnabled" -> TransitEncryptionEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationGroupMessage]
    }
  }

  @js.native
  trait CreateReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object CreateReplicationGroupResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined): CreateReplicationGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationGroupResult]
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
      ReplicationGroupId: js.UndefOr[String] = js.undefined): CreateSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotName" -> SnapshotName.asInstanceOf[js.Any],
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotMessage]
    }
  }

  @js.native
  trait CreateSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CreateSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): CreateSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotResult]
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
      ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.undefined): DecreaseReplicaCountMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any],
        "NewReplicaCount" -> NewReplicaCount.map { x => x.asInstanceOf[js.Any] },
        "ReplicaConfiguration" -> ReplicaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ReplicasToRemove" -> ReplicasToRemove.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecreaseReplicaCountMessage]
    }
  }

  @js.native
  trait DecreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object DecreaseReplicaCountResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined): DecreaseReplicaCountResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecreaseReplicaCountResult]
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
      FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined): DeleteCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any],
        "FinalSnapshotIdentifier" -> FinalSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheClusterMessage]
    }
  }

  @js.native
  trait DeleteCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object DeleteCacheClusterResult {
    def apply(
      CacheCluster: js.UndefOr[CacheCluster] = js.undefined): DeleteCacheClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheCluster" -> CacheCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheClusterResult]
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
      CacheParameterGroupName: String): DeleteCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheParameterGroupMessage]
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
      CacheSecurityGroupName: String): DeleteCacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheSecurityGroupMessage]
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
      CacheSubnetGroupName: String): DeleteCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheSubnetGroupMessage]
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
      RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.undefined): DeleteReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any],
        "FinalSnapshotIdentifier" -> FinalSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] },
        "RetainPrimaryCluster" -> RetainPrimaryCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationGroupMessage]
    }
  }

  @js.native
  trait DeleteReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object DeleteReplicationGroupResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined): DeleteReplicationGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationGroupResult]
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
      SnapshotName: String): DeleteSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotName" -> SnapshotName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotMessage]
    }
  }

  @js.native
  trait DeleteSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object DeleteSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined): DeleteSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Snapshot" -> Snapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotResult]
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
      ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.undefined): DescribeCacheClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ShowCacheClustersNotInReplicationGroups" -> ShowCacheClustersNotInReplicationGroups.map { x => x.asInstanceOf[js.Any] },
        "ShowCacheNodeInfo" -> ShowCacheNodeInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheClustersMessage]
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeCacheEngineVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "DefaultOnly" -> DefaultOnly.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheEngineVersionsMessage]
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeCacheParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheParameterGroupsMessage]
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
      Source: js.UndefOr[String] = js.undefined): DescribeCacheParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheParametersMessage]
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeCacheSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheSecurityGroupsMessage]
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeCacheSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheSubnetGroupsMessage]
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
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined): DescribeEngineDefaultParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults]
  }

  object DescribeEngineDefaultParametersResult {
    def apply(
      EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined): DescribeEngineDefaultParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineDefaults" -> EngineDefaults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersResult]
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
      StartTime: js.UndefOr[TStamp] = js.undefined): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
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
      ReplicationGroupId: js.UndefOr[String] = js.undefined): DescribeReplicationGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationGroupsMessage]
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
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined): DescribeReservedCacheNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedCacheNodesMessage]
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
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined): DescribeReservedCacheNodesOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedCacheNodesOfferingsMessage]
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
      Snapshots: js.UndefOr[SnapshotList] = js.undefined): DescribeSnapshotsListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Snapshots" -> Snapshots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsListMessage]
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
      SnapshotSource: js.UndefOr[String] = js.undefined): DescribeSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "ShowNodeGroupConfig" -> ShowNodeGroupConfig.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotSource" -> SnapshotSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsMessage]
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
      Status: js.UndefOr[String] = js.undefined): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
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
      Port: js.UndefOr[Int] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
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
      Parameters: js.UndefOr[ParametersList] = js.undefined): EngineDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeTypeSpecificParameters" -> CacheNodeTypeSpecificParameters.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EngineDefaults]
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
      SourceType: js.UndefOr[SourceType] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
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
      Marker: js.UndefOr[String] = js.undefined): EventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsMessage]
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
      ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined): IncreaseReplicaCountMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any],
        "NewReplicaCount" -> NewReplicaCount.map { x => x.asInstanceOf[js.Any] },
        "ReplicaConfiguration" -> ReplicaConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IncreaseReplicaCountMessage]
    }
  }

  @js.native
  trait IncreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object IncreaseReplicaCountResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined): IncreaseReplicaCountResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IncreaseReplicaCountResult]
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
      ReplicationGroupId: js.UndefOr[String] = js.undefined): ListAllowedNodeTypeModificationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAllowedNodeTypeModificationsMessage]
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
      ResourceName: String): ListTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
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
      SnapshotWindow: js.UndefOr[String] = js.undefined): ModifyCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any],
        "AZMode" -> AZMode.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeIdsToRemove" -> CacheNodeIdsToRemove.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NewAvailabilityZones" -> NewAvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicStatus" -> NotificationTopicStatus.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheClusterMessage]
    }
  }

  @js.native
  trait ModifyCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object ModifyCacheClusterResult {
    def apply(
      CacheCluster: js.UndefOr[CacheCluster] = js.undefined): ModifyCacheClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheCluster" -> CacheCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheClusterResult]
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
      ParameterNameValues: ParameterNameValueList): ModifyCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any],
        "ParameterNameValues" -> ParameterNameValues.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheParameterGroupMessage]
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
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined): ModifyCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.asInstanceOf[js.Any],
        "CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup]
  }

  object ModifyCacheSubnetGroupResult {
    def apply(
      CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined): ModifyCacheSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroup" -> CacheSubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheSubnetGroupResult]
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
      SnapshottingClusterId: js.UndefOr[String] = js.undefined): ModifyReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any],
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "AutomaticFailoverEnabled" -> AutomaticFailoverEnabled.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicStatus" -> NotificationTopicStatus.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "PrimaryClusterId" -> PrimaryClusterId.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupDescription" -> ReplicationGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "SnapshottingClusterId" -> SnapshottingClusterId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationGroupMessage]
    }
  }

  @js.native
  trait ModifyReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object ModifyReplicationGroupResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined): ModifyReplicationGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationGroupResult]
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
      ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList] = js.undefined): ModifyReplicationGroupShardConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplyImmediately" -> ApplyImmediately.asInstanceOf[js.Any],
        "NodeGroupCount" -> NodeGroupCount.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any],
        "NodeGroupsToRemove" -> NodeGroupsToRemove.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupsToRetain" -> NodeGroupsToRetain.map { x => x.asInstanceOf[js.Any] },
        "ReshardingConfiguration" -> ReshardingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationGroupShardConfigurationMessage]
    }
  }

  @js.native
  trait ModifyReplicationGroupShardConfigurationResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object ModifyReplicationGroupShardConfigurationResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined): ModifyReplicationGroupShardConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
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
      Status: js.UndefOr[String] = js.undefined): NodeGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupMembers" -> NodeGroupMembers.map { x => x.asInstanceOf[js.Any] },
        "PrimaryEndpoint" -> PrimaryEndpoint.map { x => x.asInstanceOf[js.Any] },
        "Slots" -> Slots.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeGroup]
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
      Slots: js.UndefOr[String] = js.undefined): NodeGroupConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] },
        "PrimaryAvailabilityZone" -> PrimaryAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ReplicaAvailabilityZones" -> ReplicaAvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "ReplicaCount" -> ReplicaCount.map { x => x.asInstanceOf[js.Any] },
        "Slots" -> Slots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeGroupConfiguration]
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
      ReadEndpoint: js.UndefOr[Endpoint] = js.undefined): NodeGroupMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeId" -> CacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "CurrentRole" -> CurrentRole.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ReadEndpoint" -> ReadEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeGroupMember]
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
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined): NodeSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeCreateTime" -> CacheNodeCreateTime.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeId" -> CacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "CacheSize" -> CacheSize.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupConfiguration" -> NodeGroupConfiguration.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeSnapshot]
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
      TopicStatus: js.UndefOr[String] = js.undefined): NotificationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] },
        "TopicStatus" -> TopicStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfiguration]
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
      Source: js.UndefOr[String] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "ChangeType" -> ChangeType.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
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
      ParameterValue: js.UndefOr[String] = js.undefined): ParameterNameValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterNameValue]
    }
  }

  object PendingAutomaticFailoverStatusEnum {
    val enabled = "enabled"
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
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeIdsToRemove" -> CacheNodeIdsToRemove.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
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
      ReservedCacheNodeId: js.UndefOr[String] = js.undefined): PurchaseReservedCacheNodesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.asInstanceOf[js.Any],
        "CacheNodeCount" -> CacheNodeCount.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedCacheNodesOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
    var ReservedCacheNode: js.UndefOr[ReservedCacheNode]
  }

  object PurchaseReservedCacheNodesOfferingResult {
    def apply(
      ReservedCacheNode: js.UndefOr[ReservedCacheNode] = js.undefined): PurchaseReservedCacheNodesOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedCacheNode" -> ReservedCacheNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
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
      CacheNodeIdsToReboot: CacheNodeIdsList): RebootCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.asInstanceOf[js.Any],
        "CacheNodeIdsToReboot" -> CacheNodeIdsToReboot.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootCacheClusterMessage]
    }
  }

  @js.native
  trait RebootCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster]
  }

  object RebootCacheClusterResult {
    def apply(
      CacheCluster: js.UndefOr[CacheCluster] = js.undefined): RebootCacheClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheCluster" -> CacheCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootCacheClusterResult]
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
      RecurringChargeFrequency: js.UndefOr[String] = js.undefined): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecurringChargeAmount" -> RecurringChargeAmount.map { x => x.asInstanceOf[js.Any] },
        "RecurringChargeFrequency" -> RecurringChargeFrequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
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
      TagKeys: KeyList): RemoveTagsFromResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceMessage]
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
      TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined): ReplicationGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AtRestEncryptionEnabled" -> AtRestEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "AuthTokenEnabled" -> AuthTokenEnabled.map { x => x.asInstanceOf[js.Any] },
        "AutomaticFailover" -> AutomaticFailover.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "ClusterEnabled" -> ClusterEnabled.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationEndpoint" -> ConfigurationEndpoint.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "MemberClusters" -> MemberClusters.map { x => x.asInstanceOf[js.Any] },
        "NodeGroups" -> NodeGroups.map { x => x.asInstanceOf[js.Any] },
        "PendingModifiedValues" -> PendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "SnapshottingClusterId" -> SnapshottingClusterId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "TransitEncryptionEnabled" -> TransitEncryptionEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationGroup]
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
      ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.undefined): ReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroups" -> ReplicationGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationGroupMessage]
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
      Resharding: js.UndefOr[ReshardingStatus] = js.undefined): ReplicationGroupPendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomaticFailoverStatus" -> AutomaticFailoverStatus.map { x => x.asInstanceOf[js.Any] },
        "PrimaryClusterId" -> PrimaryClusterId.map { x => x.asInstanceOf[js.Any] },
        "Resharding" -> Resharding.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationGroupPendingModifiedValues]
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
      UsagePrice: js.UndefOr[Double] = js.undefined): ReservedCacheNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeCount" -> CacheNodeCount.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "ReservationARN" -> ReservationARN.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNode]
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
      ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.undefined): ReservedCacheNodeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodes" -> ReservedCacheNodes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNodeMessage]
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
      UsagePrice: js.UndefOr[Double] = js.undefined): ReservedCacheNodesOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNodesOffering]
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
      ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.undefined): ReservedCacheNodesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferings" -> ReservedCacheNodesOfferings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNodesOfferingMessage]
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
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined): ResetCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.asInstanceOf[js.Any],
        "ParameterNameValues" -> ParameterNameValues.map { x => x.asInstanceOf[js.Any] },
        "ResetAllParameters" -> ResetAllParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetCacheParameterGroupMessage]
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
      PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined): ReshardingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZones" -> PreferredAvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReshardingConfiguration]
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
      SlotMigration: js.UndefOr[SlotMigration] = js.undefined): ReshardingStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SlotMigration" -> SlotMigration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReshardingStatus]
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
      EC2SecurityGroupOwnerId: String): RevokeCacheSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupName" -> EC2SecurityGroupName.asInstanceOf[js.Any],
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeCacheSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup]
  }

  object RevokeCacheSecurityGroupIngressResult {
    def apply(
      CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined): RevokeCacheSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroup" -> CacheSecurityGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeCacheSecurityGroupIngressResult]
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
      Status: js.UndefOr[String] = js.undefined): SecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupId" -> SecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroupMembership]
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
      ProgressPercentage: js.UndefOr[Double] = js.undefined): SlotMigration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgressPercentage" -> ProgressPercentage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SlotMigration]
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
      VpcId: js.UndefOr[String] = js.undefined): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "AutomaticFailover" -> AutomaticFailover.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterCreateTime" -> CacheClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NodeSnapshots" -> NodeSnapshots.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "NumNodeGroups" -> NumNodeGroups.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupDescription" -> ReplicationGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "SnapshotSource" -> SnapshotSource.map { x => x.asInstanceOf[js.Any] },
        "SnapshotStatus" -> SnapshotStatus.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Snapshot]
    }
  }

  object SourceTypeEnum {
    val `cache-cluster` = "cache-cluster"
    val `cache-parameter-group` = "cache-parameter-group"
    val `cache-security-group` = "cache-security-group"
    val `cache-subnet-group` = "cache-subnet-group"
    val `replication-group` = "replication-group"

    val values = IndexedSeq(`cache-cluster`, `cache-parameter-group`, `cache-security-group`, `cache-subnet-group`, `replication-group`)
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
      SubnetIdentifier: js.UndefOr[String] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SubnetIdentifier" -> SubnetIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
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
      Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
      TagList: js.UndefOr[TagList] = js.undefined): TagListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagListMessage]
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
      ReplicationGroupId: String): TestFailoverMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeGroupId" -> NodeGroupId.asInstanceOf[js.Any],
        "ReplicationGroupId" -> ReplicationGroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestFailoverMessage]
    }
  }

  @js.native
  trait TestFailoverResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup]
  }

  object TestFailoverResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined): TestFailoverResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestFailoverResult]
    }
  }
}
