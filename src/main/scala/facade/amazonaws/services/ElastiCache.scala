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
  class ElastiCache(config: AWSConfig) extends js.Object {
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
   * <p>Represents the input of an AddTagsToResource operation.</p>
   */
  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsToResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): AddTagsToResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceMessage]
    }
  }

  /**
   * <p>Represents the allowed node types you can use to modify your cluster or replication group.</p>
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
   * <p>Represents the input of an AuthorizeCacheSecurityGroupIngress operation.</p>
   */
  @js.native
  trait AuthorizeCacheSecurityGroupIngressMessage extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object AuthorizeCacheSecurityGroupIngressMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): AuthorizeCacheSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Describes an Availability Zone in which the cluster is launched.</p>
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
   * <p>Contains all of the attributes of a specific cluster.</p>
   */
  @js.native
  trait CacheCluster extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
    var Engine: js.UndefOr[String]
    var ConfigurationEndpoint: js.UndefOr[Endpoint]
    var ClientDownloadLandingPage: js.UndefOr[String]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[SecurityGroupMembershipList]
    var CacheClusterStatus: js.UndefOr[String]
    var AuthTokenEnabled: js.UndefOr[BooleanOptional]
    var CacheNodes: js.UndefOr[CacheNodeList]
    var CacheClusterId: js.UndefOr[String]
    var CacheClusterCreateTime: js.UndefOr[TStamp]
    var CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus]
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues]
    var CacheNodeType: js.UndefOr[String]
    var SnapshotWindow: js.UndefOr[String]
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var EngineVersion: js.UndefOr[String]
    var CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList]
    var CacheSubnetGroupName: js.UndefOr[String]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
  }

  object CacheCluster {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined,
      ClientDownloadLandingPage: js.UndefOr[String] = js.undefined,
      PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined,
      CacheClusterStatus: js.UndefOr[String] = js.undefined,
      AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      CacheNodes: js.UndefOr[CacheNodeList] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus] = js.undefined,
      PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList] = js.undefined,
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
      AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined): CacheCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfiguration" -> NotificationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationEndpoint" -> ConfigurationEndpoint.map { x => x.asInstanceOf[js.Any] },
        "ClientDownloadLandingPage" -> ClientDownloadLandingPage.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterStatus" -> CacheClusterStatus.map { x => x.asInstanceOf[js.Any] },
        "AuthTokenEnabled" -> AuthTokenEnabled.map { x => x.asInstanceOf[js.Any] },
        "CacheNodes" -> CacheNodes.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterCreateTime" -> CacheClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroup" -> CacheParameterGroup.map { x => x.asInstanceOf[js.Any] },
        "PendingModifiedValues" -> PendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "TransitEncryptionEnabled" -> TransitEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroups" -> CacheSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "AtRestEncryptionEnabled" -> AtRestEncryptionEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheCluster]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeCacheClusters</code> operation.</p>
   */
  @js.native
  trait CacheClusterMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var CacheClusters: js.UndefOr[CacheClusterList]
  }

  object CacheClusterMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheClusters: js.UndefOr[CacheClusterList] = js.undefined): CacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "CacheClusters" -> CacheClusters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheClusterMessage]
    }
  }

  /**
   * <p>Provides all of the details about a particular cache engine version.</p>
   */
  @js.native
  trait CacheEngineVersion extends js.Object {
    var Engine: js.UndefOr[String]
    var CacheEngineDescription: js.UndefOr[String]
    var CacheEngineVersionDescription: js.UndefOr[String]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
  }

  object CacheEngineVersion {
    def apply(
      Engine: js.UndefOr[String] = js.undefined,
      CacheEngineDescription: js.UndefOr[String] = js.undefined,
      CacheEngineVersionDescription: js.UndefOr[String] = js.undefined,
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined): CacheEngineVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "CacheEngineDescription" -> CacheEngineDescription.map { x => x.asInstanceOf[js.Any] },
        "CacheEngineVersionDescription" -> CacheEngineVersionDescription.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheEngineVersion]
    }
  }

  /**
   * <p>Represents the output of a <a>DescribeCacheEngineVersions</a> operation.</p>
   */
  @js.native
  trait CacheEngineVersionMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var CacheEngineVersions: js.UndefOr[CacheEngineVersionList]
  }

  object CacheEngineVersionMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.undefined): CacheEngineVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "CacheEngineVersions" -> CacheEngineVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheEngineVersionMessage]
    }
  }

  /**
   * <p>Represents an individual cache node within a cluster. Each cache node runs its own instance of the cluster's protocol-compliant caching software - either Memcached or Redis.</p> <p>The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.</p> <ul> <li> <p>General purpose:</p> <ul> <li> <p>Current generation: </p> <p> <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code> </p> <p> <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code> </p> <p> <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code> </p> </li> <li> <p>Previous generation: (not recommended)</p> <p> <b>T1 node types:</b> <code>cache.t1.micro</code> </p> <p> <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code> </p> </li> </ul> </li> <li> <p>Compute optimized:</p> <ul> <li> <p>Previous generation: (not recommended)</p> <p> <b>C1 node types:</b> <code>cache.c1.xlarge</code> </p> </li> </ul> </li> <li> <p>Memory optimized:</p> <ul> <li> <p>Current generation: </p> <p> <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code> </p> <p> <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code> </p> </li> <li> <p>Previous generation: (not recommended)</p> <p> <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code> </p> </li> </ul> </li> </ul> <p> <b>Notes:</b> </p> <ul> <li> <p>All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).</p> </li> <li> <p>Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances. </p> </li> <li> <p>Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.</p> </li> <li> <p>Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.</p> </li> </ul> <p>For a complete listing of node types and specifications, see:</p> <ul> <li> <p> <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> </p> </li> <li> <p> <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific">Cache Node Type-Specific Parameters for Memcached</a> </p> </li> <li> <p> <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific">Cache Node Type-Specific Parameters for Redis</a> </p> </li> </ul>
   */
  @js.native
  trait CacheNode extends js.Object {
    var CacheNodeCreateTime: js.UndefOr[TStamp]
    var CacheNodeId: js.UndefOr[String]
    var SourceCacheNodeId: js.UndefOr[String]
    var Endpoint: js.UndefOr[Endpoint]
    var CacheNodeStatus: js.UndefOr[String]
    var ParameterGroupStatus: js.UndefOr[String]
    var CustomerAvailabilityZone: js.UndefOr[String]
  }

  object CacheNode {
    def apply(
      CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined,
      CacheNodeId: js.UndefOr[String] = js.undefined,
      SourceCacheNodeId: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      CacheNodeStatus: js.UndefOr[String] = js.undefined,
      ParameterGroupStatus: js.UndefOr[String] = js.undefined,
      CustomerAvailabilityZone: js.UndefOr[String] = js.undefined): CacheNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeCreateTime" -> CacheNodeCreateTime.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeId" -> CacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "SourceCacheNodeId" -> SourceCacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeStatus" -> CacheNodeStatus.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupStatus" -> ParameterGroupStatus.map { x => x.asInstanceOf[js.Any] },
        "CustomerAvailabilityZone" -> CustomerAvailabilityZone.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheNode]
    }
  }

  /**
   * <p>A parameter that has a different value for each cache node type it is applied to. For example, in a Redis cluster, a <code>cache.m1.large</code> cache node type would have a larger <code>maxmemory</code> value than a <code>cache.m1.small</code> type.</p>
   */
  @js.native
  trait CacheNodeTypeSpecificParameter extends js.Object {
    var IsModifiable: js.UndefOr[Boolean]
    var CacheNodeTypeSpecificValues: js.UndefOr[CacheNodeTypeSpecificValueList]
    var Description: js.UndefOr[String]
    var ChangeType: js.UndefOr[ChangeType]
    var AllowedValues: js.UndefOr[String]
    var Source: js.UndefOr[String]
    var MinimumEngineVersion: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
    var DataType: js.UndefOr[String]
  }

  object CacheNodeTypeSpecificParameter {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      CacheNodeTypeSpecificValues: js.UndefOr[CacheNodeTypeSpecificValueList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ChangeType: js.UndefOr[ChangeType] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MinimumEngineVersion: js.UndefOr[String] = js.undefined,
      ParameterName: js.UndefOr[String] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined): CacheNodeTypeSpecificParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeTypeSpecificValues" -> CacheNodeTypeSpecificValues.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ChangeType" -> ChangeType.map { x => x.asInstanceOf[js.Any] },
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheNodeTypeSpecificParameter]
    }
  }

  /**
   * <p>A value that applies only to a certain cache node type.</p>
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
   * <p>Represents the output of a <code>CreateCacheParameterGroup</code> operation.</p>
   */
  @js.native
  trait CacheParameterGroup extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object CacheParameterGroup {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): CacheParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroup]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeCacheParameters</code> operation.</p>
   */
  @js.native
  trait CacheParameterGroupDetails extends js.Object {
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
    var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList]
  }

  object CacheParameterGroupDetails {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined): CacheParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeTypeSpecificParameters" -> CacheNodeTypeSpecificParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupDetails]
    }
  }

  /**
   * <p>Represents the output of one of the following operations:</p> <ul> <li> <p> <code>ModifyCacheParameterGroup</code> </p> </li> <li> <p> <code>ResetCacheParameterGroup</code> </p> </li> </ul>
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
   * <p>Status of the cache parameter group.</p>
   */
  @js.native
  trait CacheParameterGroupStatus extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var ParameterApplyStatus: js.UndefOr[String]
    var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList]
  }

  object CacheParameterGroupStatus {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterApplyStatus: js.UndefOr[String] = js.undefined,
      CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined): CacheParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeIdsToReboot" -> CacheNodeIdsToReboot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupStatus]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeCacheParameterGroups</code> operation.</p>
   */
  @js.native
  trait CacheParameterGroupsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var CacheParameterGroups: js.UndefOr[CacheParameterGroupList]
  }

  object CacheParameterGroupsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.undefined): CacheParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroups" -> CacheParameterGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupsMessage]
    }
  }

  /**
   * <p>Represents the output of one of the following operations:</p> <ul> <li> <p> <code>AuthorizeCacheSecurityGroupIngress</code> </p> </li> <li> <p> <code>CreateCacheSecurityGroup</code> </p> </li> <li> <p> <code>RevokeCacheSecurityGroupIngress</code> </p> </li> </ul>
   */
  @js.native
  trait CacheSecurityGroup extends js.Object {
    var OwnerId: js.UndefOr[String]
    var CacheSecurityGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList]
  }

  object CacheSecurityGroup {
    def apply(
      OwnerId: js.UndefOr[String] = js.undefined,
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined): CacheSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroups" -> EC2SecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSecurityGroup]
    }
  }

  /**
   * <p>Represents a cluster's status within a particular cache security group.</p>
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
   * <p>Represents the output of a <code>DescribeCacheSecurityGroups</code> operation.</p>
   */
  @js.native
  trait CacheSecurityGroupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var CacheSecurityGroups: js.UndefOr[CacheSecurityGroups]
  }

  object CacheSecurityGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheSecurityGroups: js.UndefOr[CacheSecurityGroups] = js.undefined): CacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroups" -> CacheSecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSecurityGroupMessage]
    }
  }

  /**
   * <p>Represents the output of one of the following operations:</p> <ul> <li> <p> <code>CreateCacheSubnetGroup</code> </p> </li> <li> <p> <code>ModifyCacheSubnetGroup</code> </p> </li> </ul>
   */
  @js.native
  trait CacheSubnetGroup extends js.Object {
    var CacheSubnetGroupName: js.UndefOr[String]
    var CacheSubnetGroupDescription: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
  }

  object CacheSubnetGroup {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      Subnets: js.UndefOr[SubnetList] = js.undefined): CacheSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSubnetGroup]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeCacheSubnetGroups</code> operation.</p>
   */
  @js.native
  trait CacheSubnetGroupMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var CacheSubnetGroups: js.UndefOr[CacheSubnetGroups]
  }

  object CacheSubnetGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheSubnetGroups: js.UndefOr[CacheSubnetGroups] = js.undefined): CacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroups" -> CacheSubnetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSubnetGroupMessage]
    }
  }

  object ChangeTypeEnum {
    val immediate = "immediate"
    val `requires-reboot` = "requires-reboot"

    val values = IndexedSeq(immediate, `requires-reboot`)
  }

  /**
   * <p>Node group (shard) configuration options when adding or removing replicas. Each node group (shard) configuration has the following members: NodeGroupId, NewReplicaCount, and PreferredAvailabilityZones. </p>
   */
  @js.native
  trait ConfigureShard extends js.Object {
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId]
    var NewReplicaCount: js.UndefOr[Int]
    var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList]
  }

  object ConfigureShard {
    def apply(
      NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined,
      NewReplicaCount: js.UndefOr[Int] = js.undefined,
      PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined): ConfigureShard = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] },
        "NewReplicaCount" -> NewReplicaCount.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZones" -> PreferredAvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigureShard]
    }
  }

  /**
   * <p>Represents the input of a <code>CopySnapshotMessage</code> operation.</p>
   */
  @js.native
  trait CopySnapshotMessage extends js.Object {
    var SourceSnapshotName: js.UndefOr[String]
    var TargetSnapshotName: js.UndefOr[String]
    var TargetBucket: js.UndefOr[String]
  }

  object CopySnapshotMessage {
    def apply(
      SourceSnapshotName: js.UndefOr[String] = js.undefined,
      TargetSnapshotName: js.UndefOr[String] = js.undefined,
      TargetBucket: js.UndefOr[String] = js.undefined): CopySnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceSnapshotName" -> SourceSnapshotName.map { x => x.asInstanceOf[js.Any] },
        "TargetSnapshotName" -> TargetSnapshotName.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Represents the input of a CreateCacheCluster operation.</p>
   */
  @js.native
  trait CreateCacheClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var AZMode: js.UndefOr[AZMode]
    var CacheParameterGroupName: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeType: js.UndefOr[String]
    var SnapshotName: js.UndefOr[String]
    var SnapshotWindow: js.UndefOr[String]
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var EngineVersion: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var CacheSubnetGroupName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var AuthToken: js.UndefOr[String]
    var SnapshotArns: js.UndefOr[SnapshotArnsList]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
  }

  object CreateCacheClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      AZMode: js.UndefOr[AZMode] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined,
      PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      NotificationTopicArn: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
      AuthToken: js.UndefOr[String] = js.undefined,
      SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined): CreateCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "AZMode" -> AZMode.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZones" -> PreferredAvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "AuthToken" -> AuthToken.map { x => x.asInstanceOf[js.Any] },
        "SnapshotArns" -> SnapshotArns.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>CreateCacheParameterGroup</code> operation.</p>
   */
  @js.native
  trait CreateCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object CreateCacheParameterGroupMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): CreateCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>CreateCacheSecurityGroup</code> operation.</p>
   */
  @js.native
  trait CreateCacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  object CreateCacheSecurityGroupMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): CreateCacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>CreateCacheSubnetGroup</code> operation.</p>
   */
  @js.native
  trait CreateCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: js.UndefOr[String]
    var CacheSubnetGroupDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  object CreateCacheSubnetGroupMessage {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined): CreateCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>CreateReplicationGroup</code> operation.</p>
   */
  @js.native
  trait CreateReplicationGroupMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var ReplicasPerNodeGroup: js.UndefOr[IntegerOptional]
    var NumNodeGroups: js.UndefOr[IntegerOptional]
    var CacheNodeType: js.UndefOr[String]
    var SnapshotName: js.UndefOr[String]
    var NodeGroupConfiguration: js.UndefOr[NodeGroupConfigurationList]
    var SnapshotWindow: js.UndefOr[String]
    var NumCacheClusters: js.UndefOr[IntegerOptional]
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList]
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional]
    var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional]
    var PreferredCacheClusterAZs: js.UndefOr[AvailabilityZonesList]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var EngineVersion: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var CacheSubnetGroupName: js.UndefOr[String]
    var PrimaryClusterId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var ReplicationGroupDescription: js.UndefOr[String]
    var AuthToken: js.UndefOr[String]
    var SnapshotArns: js.UndefOr[SnapshotArnsList]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
  }

  object CreateReplicationGroupMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      ReplicasPerNodeGroup: js.UndefOr[IntegerOptional] = js.undefined,
      NumNodeGroups: js.UndefOr[IntegerOptional] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined,
      NodeGroupConfiguration: js.UndefOr[NodeGroupConfigurationList] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      NumCacheClusters: js.UndefOr[IntegerOptional] = js.undefined,
      CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
      TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      PreferredCacheClusterAZs: js.UndefOr[AvailabilityZonesList] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      NotificationTopicArn: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      PrimaryClusterId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ReplicationGroupDescription: js.UndefOr[String] = js.undefined,
      AuthToken: js.UndefOr[String] = js.undefined,
      SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
      AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined): CreateReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "ReplicasPerNodeGroup" -> ReplicasPerNodeGroup.map { x => x.asInstanceOf[js.Any] },
        "NumNodeGroups" -> NumNodeGroups.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupConfiguration" -> NodeGroupConfiguration.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "NumCacheClusters" -> NumCacheClusters.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x.asInstanceOf[js.Any] },
        "TransitEncryptionEnabled" -> TransitEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "AutomaticFailoverEnabled" -> AutomaticFailoverEnabled.map { x => x.asInstanceOf[js.Any] },
        "PreferredCacheClusterAZs" -> PreferredCacheClusterAZs.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "PrimaryClusterId" -> PrimaryClusterId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupDescription" -> ReplicationGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "AuthToken" -> AuthToken.map { x => x.asInstanceOf[js.Any] },
        "SnapshotArns" -> SnapshotArns.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "AtRestEncryptionEnabled" -> AtRestEncryptionEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>CreateSnapshot</code> operation.</p>
   */
  @js.native
  trait CreateSnapshotMessage extends js.Object {
    var ReplicationGroupId: js.UndefOr[String]
    var CacheClusterId: js.UndefOr[String]
    var SnapshotName: js.UndefOr[String]
  }

  object CreateSnapshotMessage {
    def apply(
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined): CreateSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NewReplicaCount: js.UndefOr[IntegerOptional]
    var ReplicationGroupId: js.UndefOr[String]
    var ReplicasToRemove: js.UndefOr[RemoveReplicasList]
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList]
    var ApplyImmediately: js.UndefOr[Boolean]
  }

  object DecreaseReplicaCountMessage {
    def apply(
      NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.undefined,
      ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined): DecreaseReplicaCountMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NewReplicaCount" -> NewReplicaCount.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "ReplicasToRemove" -> ReplicasToRemove.map { x => x.asInstanceOf[js.Any] },
        "ReplicaConfiguration" -> ReplicaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>DeleteCacheCluster</code> operation.</p>
   */
  @js.native
  trait DeleteCacheClusterMessage extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var FinalSnapshotIdentifier: js.UndefOr[String]
  }

  object DeleteCacheClusterMessage {
    def apply(
      CacheClusterId: js.UndefOr[String] = js.undefined,
      FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined): DeleteCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Represents the input of a <code>DeleteCacheParameterGroup</code> operation.</p>
   */
  @js.native
  trait DeleteCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
  }

  object DeleteCacheParameterGroupMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined): DeleteCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheParameterGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DeleteCacheSecurityGroup</code> operation.</p>
   */
  @js.native
  trait DeleteCacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
  }

  object DeleteCacheSecurityGroupMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined): DeleteCacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheSecurityGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.</p>
   */
  @js.native
  trait DeleteCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: js.UndefOr[String]
  }

  object DeleteCacheSubnetGroupMessage {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined): DeleteCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheSubnetGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DeleteReplicationGroup</code> operation.</p>
   */
  @js.native
  trait DeleteReplicationGroupMessage extends js.Object {
    var ReplicationGroupId: js.UndefOr[String]
    var RetainPrimaryCluster: js.UndefOr[BooleanOptional]
    var FinalSnapshotIdentifier: js.UndefOr[String]
  }

  object DeleteReplicationGroupMessage {
    def apply(
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.undefined,
      FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined): DeleteReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "RetainPrimaryCluster" -> RetainPrimaryCluster.map { x => x.asInstanceOf[js.Any] },
        "FinalSnapshotIdentifier" -> FinalSnapshotIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>DeleteSnapshot</code> operation.</p>
   */
  @js.native
  trait DeleteSnapshotMessage extends js.Object {
    var SnapshotName: js.UndefOr[String]
  }

  object DeleteSnapshotMessage {
    def apply(
      SnapshotName: js.UndefOr[String] = js.undefined): DeleteSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>DescribeCacheClusters</code> operation.</p>
   */
  @js.native
  trait DescribeCacheClustersMessage extends js.Object {
    var ShowCacheNodeInfo: js.UndefOr[BooleanOptional]
    var ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional]
    var CacheClusterId: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeCacheClustersMessage {
    def apply(
      ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.undefined,
      ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeCacheClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShowCacheNodeInfo" -> ShowCacheNodeInfo.map { x => x.asInstanceOf[js.Any] },
        "ShowCacheClustersNotInReplicationGroups" -> ShowCacheClustersNotInReplicationGroups.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheClustersMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeCacheEngineVersions</code> operation.</p>
   */
  @js.native
  trait DescribeCacheEngineVersionsMessage extends js.Object {
    var Engine: js.UndefOr[String]
    var DefaultOnly: js.UndefOr[Boolean]
    var CacheParameterGroupFamily: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeCacheEngineVersionsMessage {
    def apply(
      Engine: js.UndefOr[String] = js.undefined,
      DefaultOnly: js.UndefOr[Boolean] = js.undefined,
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeCacheEngineVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "DefaultOnly" -> DefaultOnly.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheEngineVersionsMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeCacheParameterGroups</code> operation.</p>
   */
  @js.native
  trait DescribeCacheParameterGroupsMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeCacheParameterGroupsMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeCacheParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheParameterGroupsMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeCacheParameters</code> operation.</p>
   */
  @js.native
  trait DescribeCacheParametersMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var Source: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeCacheParametersMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeCacheParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheParametersMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeCacheSecurityGroups</code> operation.</p>
   */
  @js.native
  trait DescribeCacheSecurityGroupsMessage extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeCacheSecurityGroupsMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeCacheSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheSecurityGroupsMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeCacheSubnetGroups</code> operation.</p>
   */
  @js.native
  trait DescribeCacheSubnetGroupsMessage extends js.Object {
    var CacheSubnetGroupName: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeCacheSubnetGroupsMessage {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeCacheSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheSubnetGroupsMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeEngineDefaultParameters</code> operation.</p>
   */
  @js.native
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    var CacheParameterGroupFamily: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeEngineDefaultParametersMessage {
    def apply(
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEngineDefaultParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>DescribeEvents</code> operation.</p>
   */
  @js.native
  trait DescribeEventsMessage extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var EndTime: js.UndefOr[TStamp]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SourceType: js.UndefOr[SourceType]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventsMessage {
    def apply(
      Duration: js.UndefOr[IntegerOptional] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeReplicationGroups</code> operation.</p>
   */
  @js.native
  trait DescribeReplicationGroupsMessage extends js.Object {
    var ReplicationGroupId: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeReplicationGroupsMessage {
    def apply(
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReplicationGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationGroupsMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeReservedCacheNodes</code> operation.</p>
   */
  @js.native
  trait DescribeReservedCacheNodesMessage extends js.Object {
    var Duration: js.UndefOr[String]
    var CacheNodeType: js.UndefOr[String]
    var OfferingType: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ProductDescription: js.UndefOr[String]
    var ReservedCacheNodeId: js.UndefOr[String]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeReservedCacheNodesMessage {
    def apply(
      Duration: js.UndefOr[String] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      ReservedCacheNodeId: js.UndefOr[String] = js.undefined,
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReservedCacheNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedCacheNodesMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.</p>
   */
  @js.native
  trait DescribeReservedCacheNodesOfferingsMessage extends js.Object {
    var Duration: js.UndefOr[String]
    var CacheNodeType: js.UndefOr[String]
    var OfferingType: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ProductDescription: js.UndefOr[String]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
    var Marker: js.UndefOr[String]
  }

  object DescribeReservedCacheNodesOfferingsMessage {
    def apply(
      Duration: js.UndefOr[String] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReservedCacheNodesOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedCacheNodesOfferingsMessage]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeSnapshots</code> operation.</p>
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
   * <p>Represents the input of a <code>DescribeSnapshotsMessage</code> operation.</p>
   */
  @js.native
  trait DescribeSnapshotsMessage extends js.Object {
    var SnapshotSource: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var CacheClusterId: js.UndefOr[String]
    var SnapshotName: js.UndefOr[String]
    var ShowNodeGroupConfig: js.UndefOr[BooleanOptional]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeSnapshotsMessage {
    def apply(
      SnapshotSource: js.UndefOr[String] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined,
      ShowNodeGroupConfig: js.UndefOr[BooleanOptional] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotSource" -> SnapshotSource.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "ShowNodeGroupConfig" -> ShowNodeGroupConfig.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsMessage]
    }
  }

  /**
   * <p>Provides ownership and status information for an Amazon EC2 security group.</p>
   */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var Status: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object EC2SecurityGroup {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
   * <p>Represents the information required for client programs to connect to a cache node.</p>
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
   * <p>Represents the output of a <code>DescribeEngineDefaultParameters</code> operation.</p>
   */
  @js.native
  trait EngineDefaults extends js.Object {
    var CacheParameterGroupFamily: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
    var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList]
  }

  object EngineDefaults {
    def apply(
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined): EngineDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeTypeSpecificParameters" -> CacheNodeTypeSpecificParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EngineDefaults]
    }
  }

  /**
   * <p>Represents a single occurrence of something interesting within the system. Some examples of events are creating a cluster, adding or removing a cache node, or rebooting a node.</p>
   */
  @js.native
  trait Event extends js.Object {
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var Message: js.UndefOr[String]
    var Date: js.UndefOr[TStamp]
  }

  object Event {
    def apply(
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      Date: js.UndefOr[TStamp] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeEvents</code> operation.</p>
   */
  @js.native
  trait EventsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var Events: js.UndefOr[EventList]
  }

  object EventsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined): EventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsMessage]
    }
  }

  @js.native
  trait IncreaseReplicaCountMessage extends js.Object {
    var ReplicationGroupId: js.UndefOr[String]
    var NewReplicaCount: js.UndefOr[IntegerOptional]
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList]
    var ApplyImmediately: js.UndefOr[Boolean]
  }

  object IncreaseReplicaCountMessage {
    def apply(
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
      ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined): IncreaseReplicaCountMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "NewReplicaCount" -> NewReplicaCount.map { x => x.asInstanceOf[js.Any] },
        "ReplicaConfiguration" -> ReplicaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.</p>
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
   * <p>The input parameters for the <code>ListTagsForResource</code> operation.</p>
   */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: js.UndefOr[String]
  }

  object ListTagsForResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined): ListTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>ModifyCacheCluster</code> operation.</p>
   */
  @js.native
  trait ModifyCacheClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var AZMode: js.UndefOr[AZMode]
    var CacheParameterGroupName: js.UndefOr[String]
    var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList]
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeType: js.UndefOr[String]
    var SnapshotWindow: js.UndefOr[String]
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var EngineVersion: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var ApplyImmediately: js.UndefOr[Boolean]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var NotificationTopicStatus: js.UndefOr[String]
    var NewAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList]
  }

  object ModifyCacheClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      AZMode: js.UndefOr[AZMode] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      NotificationTopicArn: js.UndefOr[String] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
      NotificationTopicStatus: js.UndefOr[String] = js.undefined,
      NewAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined): ModifyCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "AZMode" -> AZMode.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeIdsToRemove" -> CacheNodeIdsToRemove.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicStatus" -> NotificationTopicStatus.map { x => x.asInstanceOf[js.Any] },
        "NewAvailabilityZones" -> NewAvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>ModifyCacheParameterGroup</code> operation.</p>
   */
  @js.native
  trait ModifyCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var ParameterNameValues: js.UndefOr[ParameterNameValueList]
  }

  object ModifyCacheParameterGroupMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.undefined): ModifyCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ParameterNameValues" -> ParameterNameValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheParameterGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <code>ModifyCacheSubnetGroup</code> operation.</p>
   */
  @js.native
  trait ModifyCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: js.UndefOr[String]
    var CacheSubnetGroupDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  object ModifyCacheSubnetGroupMessage {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined): ModifyCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Represents the input of a <code>ModifyReplicationGroups</code> operation.</p>
   */
  @js.native
  trait ModifyReplicationGroupMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var ReplicationGroupId: js.UndefOr[String]
    var CacheNodeType: js.UndefOr[String]
    var SnapshotWindow: js.UndefOr[String]
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList]
    var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var NodeGroupId: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var EngineVersion: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var ApplyImmediately: js.UndefOr[Boolean]
    var PrimaryClusterId: js.UndefOr[String]
    var ReplicationGroupDescription: js.UndefOr[String]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var NotificationTopicStatus: js.UndefOr[String]
    var SnapshottingClusterId: js.UndefOr[String]
  }

  object ModifyReplicationGroupMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
      AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      NodeGroupId: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      NotificationTopicArn: js.UndefOr[String] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
      PrimaryClusterId: js.UndefOr[String] = js.undefined,
      ReplicationGroupDescription: js.UndefOr[String] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
      NotificationTopicStatus: js.UndefOr[String] = js.undefined,
      SnapshottingClusterId: js.UndefOr[String] = js.undefined): ModifyReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x.asInstanceOf[js.Any] },
        "AutomaticFailoverEnabled" -> AutomaticFailoverEnabled.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "PrimaryClusterId" -> PrimaryClusterId.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupDescription" -> ReplicationGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicStatus" -> NotificationTopicStatus.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Represents the input for a <code>ModifyReplicationGroupShardConfiguration</code> operation.</p>
   */
  @js.native
  trait ModifyReplicationGroupShardConfigurationMessage extends js.Object {
    var NodeGroupsToRetain: js.UndefOr[NodeGroupsToRetainList]
    var ReplicationGroupId: js.UndefOr[String]
    var NodeGroupsToRemove: js.UndefOr[NodeGroupsToRemoveList]
    var NodeGroupCount: js.UndefOr[Int]
    var ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList]
    var ApplyImmediately: js.UndefOr[Boolean]
  }

  object ModifyReplicationGroupShardConfigurationMessage {
    def apply(
      NodeGroupsToRetain: js.UndefOr[NodeGroupsToRetainList] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      NodeGroupsToRemove: js.UndefOr[NodeGroupsToRemoveList] = js.undefined,
      NodeGroupCount: js.UndefOr[Int] = js.undefined,
      ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined): ModifyReplicationGroupShardConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeGroupsToRetain" -> NodeGroupsToRetain.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupsToRemove" -> NodeGroupsToRemove.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupCount" -> NodeGroupCount.map { x => x.asInstanceOf[js.Any] },
        "ReshardingConfiguration" -> ReshardingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents a collection of cache nodes in a replication group. One node in the node group is the read/write primary node. All the other nodes are read-only Replica nodes.</p>
   */
  @js.native
  trait NodeGroup extends js.Object {
    var Slots: js.UndefOr[String]
    var PrimaryEndpoint: js.UndefOr[Endpoint]
    var NodeGroupId: js.UndefOr[String]
    var NodeGroupMembers: js.UndefOr[NodeGroupMemberList]
    var Status: js.UndefOr[String]
  }

  object NodeGroup {
    def apply(
      Slots: js.UndefOr[String] = js.undefined,
      PrimaryEndpoint: js.UndefOr[Endpoint] = js.undefined,
      NodeGroupId: js.UndefOr[String] = js.undefined,
      NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): NodeGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Slots" -> Slots.map { x => x.asInstanceOf[js.Any] },
        "PrimaryEndpoint" -> PrimaryEndpoint.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupMembers" -> NodeGroupMembers.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeGroup]
    }
  }

  /**
   * <p>Node group (shard) configuration options. Each node group (shard) configuration has the following: <code>Slots</code>, <code>PrimaryAvailabilityZone</code>, <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>.</p>
   */
  @js.native
  trait NodeGroupConfiguration extends js.Object {
    var PrimaryAvailabilityZone: js.UndefOr[String]
    var ReplicaCount: js.UndefOr[IntegerOptional]
    var ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList]
    var Slots: js.UndefOr[String]
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId]
  }

  object NodeGroupConfiguration {
    def apply(
      PrimaryAvailabilityZone: js.UndefOr[String] = js.undefined,
      ReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
      ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined,
      Slots: js.UndefOr[String] = js.undefined,
      NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined): NodeGroupConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrimaryAvailabilityZone" -> PrimaryAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ReplicaCount" -> ReplicaCount.map { x => x.asInstanceOf[js.Any] },
        "ReplicaAvailabilityZones" -> ReplicaAvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "Slots" -> Slots.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeGroupConfiguration]
    }
  }

  /**
   * <p>Represents a single node within a node group (shard).</p>
   */
  @js.native
  trait NodeGroupMember extends js.Object {
    var CacheNodeId: js.UndefOr[String]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var ReadEndpoint: js.UndefOr[Endpoint]
    var CurrentRole: js.UndefOr[String]
    var CacheClusterId: js.UndefOr[String]
  }

  object NodeGroupMember {
    def apply(
      CacheNodeId: js.UndefOr[String] = js.undefined,
      PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
      ReadEndpoint: js.UndefOr[Endpoint] = js.undefined,
      CurrentRole: js.UndefOr[String] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined): NodeGroupMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeId" -> CacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "ReadEndpoint" -> ReadEndpoint.map { x => x.asInstanceOf[js.Any] },
        "CurrentRole" -> CurrentRole.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeGroupMember]
    }
  }

  /**
   * <p>Represents an individual cache node in a snapshot of a cluster.</p>
   */
  @js.native
  trait NodeSnapshot extends js.Object {
    var CacheNodeCreateTime: js.UndefOr[TStamp]
    var CacheNodeId: js.UndefOr[String]
    var CacheClusterId: js.UndefOr[String]
    var CacheSize: js.UndefOr[String]
    var SnapshotCreateTime: js.UndefOr[TStamp]
    var NodeGroupConfiguration: js.UndefOr[NodeGroupConfiguration]
    var NodeGroupId: js.UndefOr[String]
  }

  object NodeSnapshot {
    def apply(
      CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined,
      CacheNodeId: js.UndefOr[String] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheSize: js.UndefOr[String] = js.undefined,
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
      NodeGroupConfiguration: js.UndefOr[NodeGroupConfiguration] = js.undefined,
      NodeGroupId: js.UndefOr[String] = js.undefined): NodeSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheNodeCreateTime" -> CacheNodeCreateTime.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeId" -> CacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheSize" -> CacheSize.map { x => x.asInstanceOf[js.Any] },
        "SnapshotCreateTime" -> SnapshotCreateTime.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupConfiguration" -> NodeGroupConfiguration.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeSnapshot]
    }
  }

  /**
   * <p>Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to subscribers using Amazon Simple Notification Service (SNS).</p>
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
   * <p>Describes an individual setting that controls some aspect of ElastiCache behavior.</p>
   */
  @js.native
  trait Parameter extends js.Object {
    var IsModifiable: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var ChangeType: js.UndefOr[ChangeType]
    var AllowedValues: js.UndefOr[String]
    var Source: js.UndefOr[String]
    var MinimumEngineVersion: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
    var ParameterName: js.UndefOr[String]
    var DataType: js.UndefOr[String]
  }

  object Parameter {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ChangeType: js.UndefOr[ChangeType] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MinimumEngineVersion: js.UndefOr[String] = js.undefined,
      ParameterValue: js.UndefOr[String] = js.undefined,
      ParameterName: js.UndefOr[String] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ChangeType" -> ChangeType.map { x => x.asInstanceOf[js.Any] },
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "MinimumEngineVersion" -> MinimumEngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] },
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * <p>Describes a name-value pair that is used to update the value of a parameter.</p>
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
   * <p>A group of settings that are applied to the cluster in the future, or that are currently being applied.</p>
   */
  @js.native
  trait PendingModifiedValues extends js.Object {
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList]
    var EngineVersion: js.UndefOr[String]
    var CacheNodeType: js.UndefOr[String]
  }

  object PendingModifiedValues {
    def apply(
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
      CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeIdsToRemove" -> CacheNodeIdsToRemove.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
    }
  }

  /**
   * <p>Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.</p>
   */
  @js.native
  trait PurchaseReservedCacheNodesOfferingMessage extends js.Object {
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
    var ReservedCacheNodeId: js.UndefOr[String]
    var CacheNodeCount: js.UndefOr[IntegerOptional]
  }

  object PurchaseReservedCacheNodesOfferingMessage {
    def apply(
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined,
      ReservedCacheNodeId: js.UndefOr[String] = js.undefined,
      CacheNodeCount: js.UndefOr[IntegerOptional] = js.undefined): PurchaseReservedCacheNodesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeCount" -> CacheNodeCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input of a <code>RebootCacheCluster</code> operation.</p>
   */
  @js.native
  trait RebootCacheClusterMessage extends js.Object {
    var CacheClusterId: js.UndefOr[String]
    var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList]
  }

  object RebootCacheClusterMessage {
    def apply(
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined): RebootCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeIdsToReboot" -> CacheNodeIdsToReboot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Contains the specific price and frequency of a recurring charges for a reserved cache node, or for a reserved cache node offering.</p>
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
   * <p>Represents the input of a <code>RemoveTagsFromResource</code> operation.</p>
   */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: js.UndefOr[String]
    var TagKeys: js.UndefOr[KeyList]
  }

  object RemoveTagsFromResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[KeyList] = js.undefined): RemoveTagsFromResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
   * <p>Contains all of the attributes of a specific Redis replication group.</p>
   */
  @js.native
  trait ReplicationGroup extends js.Object {
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus]
    var ReplicationGroupId: js.UndefOr[String]
    var ConfigurationEndpoint: js.UndefOr[Endpoint]
    var Description: js.UndefOr[String]
    var AuthTokenEnabled: js.UndefOr[BooleanOptional]
    var PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues]
    var CacheNodeType: js.UndefOr[String]
    var SnapshotWindow: js.UndefOr[String]
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional]
    var MemberClusters: js.UndefOr[ClusterIdList]
    var ClusterEnabled: js.UndefOr[BooleanOptional]
    var NodeGroups: js.UndefOr[NodeGroupList]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional]
    var Status: js.UndefOr[String]
    var SnapshottingClusterId: js.UndefOr[String]
  }

  object ReplicationGroup {
    def apply(
      AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      MemberClusters: js.UndefOr[ClusterIdList] = js.undefined,
      ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      NodeGroups: js.UndefOr[NodeGroupList] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
      AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      SnapshottingClusterId: js.UndefOr[String] = js.undefined): ReplicationGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomaticFailover" -> AutomaticFailover.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationEndpoint" -> ConfigurationEndpoint.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AuthTokenEnabled" -> AuthTokenEnabled.map { x => x.asInstanceOf[js.Any] },
        "PendingModifiedValues" -> PendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "TransitEncryptionEnabled" -> TransitEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "MemberClusters" -> MemberClusters.map { x => x.asInstanceOf[js.Any] },
        "ClusterEnabled" -> ClusterEnabled.map { x => x.asInstanceOf[js.Any] },
        "NodeGroups" -> NodeGroups.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
        "AtRestEncryptionEnabled" -> AtRestEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SnapshottingClusterId" -> SnapshottingClusterId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationGroup]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeReplicationGroups</code> operation.</p>
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
   * <p>The settings to be applied to the Redis replication group, either immediately or during the next maintenance window.</p>
   */
  @js.native
  trait ReplicationGroupPendingModifiedValues extends js.Object {
    var PrimaryClusterId: js.UndefOr[String]
    var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus]
    var Resharding: js.UndefOr[ReshardingStatus]
  }

  object ReplicationGroupPendingModifiedValues {
    def apply(
      PrimaryClusterId: js.UndefOr[String] = js.undefined,
      AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.undefined,
      Resharding: js.UndefOr[ReshardingStatus] = js.undefined): ReplicationGroupPendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrimaryClusterId" -> PrimaryClusterId.map { x => x.asInstanceOf[js.Any] },
        "AutomaticFailoverStatus" -> AutomaticFailoverStatus.map { x => x.asInstanceOf[js.Any] },
        "Resharding" -> Resharding.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationGroupPendingModifiedValues]
    }
  }

  /**
   * <p>Represents the output of a <code>PurchaseReservedCacheNodesOffering</code> operation.</p>
   */
  @js.native
  trait ReservedCacheNode extends js.Object {
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var CacheNodeType: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var OfferingType: js.UndefOr[String]
    var CacheNodeCount: js.UndefOr[Int]
    var UsagePrice: js.UndefOr[Double]
    var ReservationARN: js.UndefOr[String]
    var State: js.UndefOr[String]
    var ProductDescription: js.UndefOr[String]
    var ReservedCacheNodeId: js.UndefOr[String]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
  }

  object ReservedCacheNode {
    def apply(
      Duration: js.UndefOr[Int] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      CacheNodeCount: js.UndefOr[Int] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservationARN: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      ReservedCacheNodeId: js.UndefOr[String] = js.undefined,
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined): ReservedCacheNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeCount" -> CacheNodeCount.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "ReservationARN" -> ReservationARN.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNode]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeReservedCacheNodes</code> operation.</p>
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
   * <p>Describes all of the attributes of a reserved cache node offering.</p>
   */
  @js.native
  trait ReservedCacheNodesOffering extends js.Object {
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var CacheNodeType: js.UndefOr[String]
    var OfferingType: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
    var ProductDescription: js.UndefOr[String]
    var ReservedCacheNodesOfferingId: js.UndefOr[String]
  }

  object ReservedCacheNodesOffering {
    def apply(
      Duration: js.UndefOr[Int] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined): ReservedCacheNodesOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "OfferingType" -> OfferingType.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNodesOffering]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeReservedCacheNodesOfferings</code> operation.</p>
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
   * <p>Represents the input of a <code>ResetCacheParameterGroup</code> operation.</p>
   */
  @js.native
  trait ResetCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: js.UndefOr[String]
    var ResetAllParameters: js.UndefOr[Boolean]
    var ParameterNameValues: js.UndefOr[ParameterNameValueList]
  }

  object ResetCacheParameterGroupMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined,
      ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.undefined): ResetCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "ResetAllParameters" -> ResetAllParameters.map { x => x.asInstanceOf[js.Any] },
        "ParameterNameValues" -> ParameterNameValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetCacheParameterGroupMessage]
    }
  }

  /**
   * <p>A list of <code>PreferredAvailabilityZones</code> objects that specifies the configuration of a node group in the resharded cluster.</p>
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
   * <p>The status of an online resharding operation.</p>
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
   * <p>Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.</p>
   */
  @js.native
  trait RevokeCacheSecurityGroupIngressMessage extends js.Object {
    var CacheSecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupName: js.UndefOr[String]
    var EC2SecurityGroupOwnerId: js.UndefOr[String]
  }

  object RevokeCacheSecurityGroupIngressMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined): RevokeCacheSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x.asInstanceOf[js.Any] },
        "EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents a single cache security group and its status.</p>
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
   * <p>Represents the progress of an online resharding operation.</p>
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
   * <p>Represents a copy of an entire Redis cluster as of the time when the snapshot was taken.</p>
   */
  @js.native
  trait Snapshot extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var SnapshotSource: js.UndefOr[String]
    var CacheParameterGroupName: js.UndefOr[String]
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus]
    var ReplicationGroupId: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var SnapshotStatus: js.UndefOr[String]
    var PreferredAvailabilityZone: js.UndefOr[String]
    var NodeSnapshots: js.UndefOr[NodeSnapshotList]
    var NumNodeGroups: js.UndefOr[IntegerOptional]
    var CacheClusterId: js.UndefOr[String]
    var CacheClusterCreateTime: js.UndefOr[TStamp]
    var CacheNodeType: js.UndefOr[String]
    var SnapshotName: js.UndefOr[String]
    var SnapshotWindow: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var EngineVersion: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var CacheSubnetGroupName: js.UndefOr[String]
    var ReplicationGroupDescription: js.UndefOr[String]
    var NumCacheNodes: js.UndefOr[IntegerOptional]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var TopicArn: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object Snapshot {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      SnapshotSource: js.UndefOr[String] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      SnapshotStatus: js.UndefOr[String] = js.undefined,
      PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
      NodeSnapshots: js.UndefOr[NodeSnapshotList] = js.undefined,
      NumNodeGroups: js.UndefOr[IntegerOptional] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      ReplicationGroupDescription: js.UndefOr[String] = js.undefined,
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
      TopicArn: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "SnapshotSource" -> SnapshotSource.map { x => x.asInstanceOf[js.Any] },
        "CacheParameterGroupName" -> CacheParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "AutomaticFailover" -> AutomaticFailover.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "Engine" -> Engine.map { x => x.asInstanceOf[js.Any] },
        "SnapshotStatus" -> SnapshotStatus.map { x => x.asInstanceOf[js.Any] },
        "PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "NodeSnapshots" -> NodeSnapshots.map { x => x.asInstanceOf[js.Any] },
        "NumNodeGroups" -> NumNodeGroups.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterId" -> CacheClusterId.map { x => x.asInstanceOf[js.Any] },
        "CacheClusterCreateTime" -> CacheClusterCreateTime.map { x => x.asInstanceOf[js.Any] },
        "CacheNodeType" -> CacheNodeType.map { x => x.asInstanceOf[js.Any] },
        "SnapshotName" -> SnapshotName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotWindow" -> SnapshotWindow.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroupDescription" -> ReplicationGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "NumCacheNodes" -> NumCacheNodes.map { x => x.asInstanceOf[js.Any] },
        "SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Represents the subnet associated with a cluster. This parameter refers to subnets defined in Amazon Virtual Private Cloud (Amazon VPC) and used with ElastiCache.</p>
   */
  @js.native
  trait Subnet extends js.Object {
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
  }

  object Subnet {
    def apply(
      SubnetIdentifier: js.UndefOr[String] = js.undefined,
      SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIdentifier" -> SubnetIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p>A cost allocation Tag that can be added to an ElastiCache cluster or replication group. Tags are composed of a Key/Value pair. A tag with a null Value is permitted.</p>
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
   * <p>Represents the output from the <code>AddTagsToResource</code>, <code>ListTagsForResource</code>, and <code>RemoveTagsFromResource</code> operations.</p>
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
    var ReplicationGroupId: js.UndefOr[String]
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId]
  }

  object TestFailoverMessage {
    def apply(
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined): TestFailoverMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationGroupId" -> ReplicationGroupId.map { x => x.asInstanceOf[js.Any] },
        "NodeGroupId" -> NodeGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
