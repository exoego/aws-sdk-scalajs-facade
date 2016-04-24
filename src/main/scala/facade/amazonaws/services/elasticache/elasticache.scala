package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object elasticache {
  type AZMode = String
  type AutomaticFailoverStatus = String
  type AvailabilityZonesList = js.Array[String]
  type AwsQueryErrorMessage = String
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
  type ClusterIdList = js.Array[String]
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EventList = js.Array[Event]
  type IntegerOptional = Integer
  type KeyList = js.Array[String]
  type NodeGroupList = js.Array[NodeGroup]
  type NodeGroupMemberList = js.Array[NodeGroupMember]
  type NodeSnapshotList = js.Array[NodeSnapshot]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParametersList = js.Array[Parameter]
  type PendingAutomaticFailoverStatus = String
  type PreferredAvailabilityZoneList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReplicationGroupList = js.Array[ReplicationGroup]
  type ReservedCacheNodeList = js.Array[ReservedCacheNode]
  type ReservedCacheNodesOfferingList = js.Array[ReservedCacheNodesOffering]
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
  trait Elasticache extends js.Object {
    def addTagsToResource(params: AddTagsToResourceMessage, callback: Callback[TagListMessage]): Unit = js.native
    def addTagsToResource(params: AddTagsToResourceMessage): Request[TagListMessage] = js.native
    def authorizeCacheSecurityGroupIngress(params: AuthorizeCacheSecurityGroupIngressMessage, callback: Callback[AuthorizeCacheSecurityGroupIngressResult]): Unit = js.native
    def authorizeCacheSecurityGroupIngress(params: AuthorizeCacheSecurityGroupIngressMessage): Request[AuthorizeCacheSecurityGroupIngressResult] = js.native
    def copySnapshot(params: CopySnapshotMessage, callback: Callback[CopySnapshotResult]): Unit = js.native
    def copySnapshot(params: CopySnapshotMessage): Request[CopySnapshotResult] = js.native
    def createCacheCluster(params: CreateCacheClusterMessage, callback: Callback[CreateCacheClusterResult]): Unit = js.native
    def createCacheCluster(params: CreateCacheClusterMessage): Request[CreateCacheClusterResult] = js.native
    def createCacheParameterGroup(params: CreateCacheParameterGroupMessage, callback: Callback[CreateCacheParameterGroupResult]): Unit = js.native
    def createCacheParameterGroup(params: CreateCacheParameterGroupMessage): Request[CreateCacheParameterGroupResult] = js.native
    def createCacheSecurityGroup(params: CreateCacheSecurityGroupMessage, callback: Callback[CreateCacheSecurityGroupResult]): Unit = js.native
    def createCacheSecurityGroup(params: CreateCacheSecurityGroupMessage): Request[CreateCacheSecurityGroupResult] = js.native
    def createCacheSubnetGroup(params: CreateCacheSubnetGroupMessage, callback: Callback[CreateCacheSubnetGroupResult]): Unit = js.native
    def createCacheSubnetGroup(params: CreateCacheSubnetGroupMessage): Request[CreateCacheSubnetGroupResult] = js.native
    def createReplicationGroup(params: CreateReplicationGroupMessage, callback: Callback[CreateReplicationGroupResult]): Unit = js.native
    def createReplicationGroup(params: CreateReplicationGroupMessage): Request[CreateReplicationGroupResult] = js.native
    def createSnapshot(params: CreateSnapshotMessage, callback: Callback[CreateSnapshotResult]): Unit = js.native
    def createSnapshot(params: CreateSnapshotMessage): Request[CreateSnapshotResult] = js.native
    def deleteCacheCluster(params: DeleteCacheClusterMessage, callback: Callback[DeleteCacheClusterResult]): Unit = js.native
    def deleteCacheCluster(params: DeleteCacheClusterMessage): Request[DeleteCacheClusterResult] = js.native
    def deleteCacheParameterGroup(params: DeleteCacheParameterGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteCacheParameterGroup(params: DeleteCacheParameterGroupMessage): Request[js.Object] = js.native
    def deleteCacheSecurityGroup(params: DeleteCacheSecurityGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteCacheSecurityGroup(params: DeleteCacheSecurityGroupMessage): Request[js.Object] = js.native
    def deleteCacheSubnetGroup(params: DeleteCacheSubnetGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteCacheSubnetGroup(params: DeleteCacheSubnetGroupMessage): Request[js.Object] = js.native
    def deleteReplicationGroup(params: DeleteReplicationGroupMessage, callback: Callback[DeleteReplicationGroupResult]): Unit = js.native
    def deleteReplicationGroup(params: DeleteReplicationGroupMessage): Request[DeleteReplicationGroupResult] = js.native
    def deleteSnapshot(params: DeleteSnapshotMessage, callback: Callback[DeleteSnapshotResult]): Unit = js.native
    def deleteSnapshot(params: DeleteSnapshotMessage): Request[DeleteSnapshotResult] = js.native
    def describeCacheClusters(params: DescribeCacheClustersMessage, callback: Callback[CacheClusterMessage]): Unit = js.native
    def describeCacheClusters(params: DescribeCacheClustersMessage): Request[CacheClusterMessage] = js.native
    def describeCacheEngineVersions(params: DescribeCacheEngineVersionsMessage, callback: Callback[CacheEngineVersionMessage]): Unit = js.native
    def describeCacheEngineVersions(params: DescribeCacheEngineVersionsMessage): Request[CacheEngineVersionMessage] = js.native
    def describeCacheParameterGroups(params: DescribeCacheParameterGroupsMessage, callback: Callback[CacheParameterGroupsMessage]): Unit = js.native
    def describeCacheParameterGroups(params: DescribeCacheParameterGroupsMessage): Request[CacheParameterGroupsMessage] = js.native
    def describeCacheParameters(params: DescribeCacheParametersMessage, callback: Callback[CacheParameterGroupDetails]): Unit = js.native
    def describeCacheParameters(params: DescribeCacheParametersMessage): Request[CacheParameterGroupDetails] = js.native
    def describeCacheSecurityGroups(params: DescribeCacheSecurityGroupsMessage, callback: Callback[CacheSecurityGroupMessage]): Unit = js.native
    def describeCacheSecurityGroups(params: DescribeCacheSecurityGroupsMessage): Request[CacheSecurityGroupMessage] = js.native
    def describeCacheSubnetGroups(params: DescribeCacheSubnetGroupsMessage, callback: Callback[CacheSubnetGroupMessage]): Unit = js.native
    def describeCacheSubnetGroups(params: DescribeCacheSubnetGroupsMessage): Request[CacheSubnetGroupMessage] = js.native
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage, callback: Callback[DescribeEngineDefaultParametersResult]): Unit = js.native
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): Request[DescribeEngineDefaultParametersResult] = js.native
    def describeEvents(params: DescribeEventsMessage, callback: Callback[EventsMessage]): Unit = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeReplicationGroups(params: DescribeReplicationGroupsMessage, callback: Callback[ReplicationGroupMessage]): Unit = js.native
    def describeReplicationGroups(params: DescribeReplicationGroupsMessage): Request[ReplicationGroupMessage] = js.native
    def describeReservedCacheNodes(params: DescribeReservedCacheNodesMessage, callback: Callback[ReservedCacheNodeMessage]): Unit = js.native
    def describeReservedCacheNodes(params: DescribeReservedCacheNodesMessage): Request[ReservedCacheNodeMessage] = js.native
    def describeReservedCacheNodesOfferings(params: DescribeReservedCacheNodesOfferingsMessage, callback: Callback[ReservedCacheNodesOfferingMessage]): Unit = js.native
    def describeReservedCacheNodesOfferings(params: DescribeReservedCacheNodesOfferingsMessage): Request[ReservedCacheNodesOfferingMessage] = js.native
    def describeSnapshots(params: DescribeSnapshotsMessage, callback: Callback[DescribeSnapshotsListMessage]): Unit = js.native
    def describeSnapshots(params: DescribeSnapshotsMessage): Request[DescribeSnapshotsListMessage] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage, callback: Callback[TagListMessage]): Unit = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage] = js.native
    def modifyCacheCluster(params: ModifyCacheClusterMessage, callback: Callback[ModifyCacheClusterResult]): Unit = js.native
    def modifyCacheCluster(params: ModifyCacheClusterMessage): Request[ModifyCacheClusterResult] = js.native
    def modifyCacheParameterGroup(params: ModifyCacheParameterGroupMessage, callback: Callback[CacheParameterGroupNameMessage]): Unit = js.native
    def modifyCacheParameterGroup(params: ModifyCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage] = js.native
    def modifyCacheSubnetGroup(params: ModifyCacheSubnetGroupMessage, callback: Callback[ModifyCacheSubnetGroupResult]): Unit = js.native
    def modifyCacheSubnetGroup(params: ModifyCacheSubnetGroupMessage): Request[ModifyCacheSubnetGroupResult] = js.native
    def modifyReplicationGroup(params: ModifyReplicationGroupMessage, callback: Callback[ModifyReplicationGroupResult]): Unit = js.native
    def modifyReplicationGroup(params: ModifyReplicationGroupMessage): Request[ModifyReplicationGroupResult] = js.native
    def purchaseReservedCacheNodesOffering(params: PurchaseReservedCacheNodesOfferingMessage, callback: Callback[PurchaseReservedCacheNodesOfferingResult]): Unit = js.native
    def purchaseReservedCacheNodesOffering(params: PurchaseReservedCacheNodesOfferingMessage): Request[PurchaseReservedCacheNodesOfferingResult] = js.native
    def rebootCacheCluster(params: RebootCacheClusterMessage, callback: Callback[RebootCacheClusterResult]): Unit = js.native
    def rebootCacheCluster(params: RebootCacheClusterMessage): Request[RebootCacheClusterResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage, callback: Callback[TagListMessage]): Unit = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[TagListMessage] = js.native
    def resetCacheParameterGroup(params: ResetCacheParameterGroupMessage, callback: Callback[CacheParameterGroupNameMessage]): Unit = js.native
    def resetCacheParameterGroup(params: ResetCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage] = js.native
    def revokeCacheSecurityGroupIngress(params: RevokeCacheSecurityGroupIngressMessage, callback: Callback[RevokeCacheSecurityGroupIngressResult]): Unit = js.native
    def revokeCacheSecurityGroupIngress(params: RevokeCacheSecurityGroupIngressMessage): Request[RevokeCacheSecurityGroupIngressResult] = js.native
  }


  object AZModeEnum {
    val `single-az` = "single-az"
    val `cross-az` = "cross-az"

    val values = IndexedSeq(`single-az`, `cross-az`)
  }

  /**
   * <p>Represents the input of an <i>AddTagsToResource</i> action.</p>
   */
  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object AddTagsToResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): AddTagsToResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceMessage]
    }
  }

  /**
   * <p>The specified Amazon EC2 security group is already authorized for the specified cache security group.</p>
   */
  @js.native
  trait AuthorizationAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>The specified Amazon EC2 security group is not authorized for the specified cache security group.</p>
   */
  @js.native
  trait AuthorizationNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Represents the input of an <i>AuthorizeCacheSecurityGroupIngress</i> action.</p>
   */
  @js.native
  trait AuthorizeCacheSecurityGroupIngressMessage extends js.Object {
    var CacheSecurityGroupName: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object AuthorizeCacheSecurityGroupIngressMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): AuthorizeCacheSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeCacheSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: CacheSecurityGroup
  }

  object AuthorizeCacheSecurityGroupIngressResult {
    def apply(
      CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): AuthorizeCacheSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroup" -> CacheSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
   * <p>Describes an Availability Zone in which the cache cluster is launched.</p>
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
   * <p>Contains all of the attributes of a specific cache cluster.</p>
   */
  @js.native
  trait CacheCluster extends js.Object {
    var PreferredMaintenanceWindow: String
    var ReplicationGroupId: String
    var NotificationConfiguration: NotificationConfiguration
    var Engine: String
    var ConfigurationEndpoint: Endpoint
    var ClientDownloadLandingPage: String
    var PreferredAvailabilityZone: String
    var SecurityGroups: SecurityGroupMembershipList
    var CacheClusterStatus: String
    var CacheNodes: CacheNodeList
    var CacheClusterId: String
    var CacheClusterCreateTime: TStamp
    var CacheParameterGroup: CacheParameterGroupStatus
    var PendingModifiedValues: PendingModifiedValues
    var CacheNodeType: String
    var SnapshotWindow: String
    var AutoMinorVersionUpgrade: Boolean
    var EngineVersion: String
    var CacheSecurityGroups: CacheSecurityGroupMembershipList
    var CacheSubnetGroupName: String
    var NumCacheNodes: IntegerOptional
    var SnapshotRetentionLimit: IntegerOptional
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
      CacheNodes: js.UndefOr[CacheNodeList] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus] = js.undefined,
      PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList] = js.undefined,
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    ): CacheCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("ReplicationGroupId" -> ReplicationGroupId.map { x => x: js.Any }),
        ("NotificationConfiguration" -> NotificationConfiguration.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("ConfigurationEndpoint" -> ConfigurationEndpoint.map { x => x: js.Any }),
        ("ClientDownloadLandingPage" -> ClientDownloadLandingPage.map { x => x: js.Any }),
        ("PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("CacheClusterStatus" -> CacheClusterStatus.map { x => x: js.Any }),
        ("CacheNodes" -> CacheNodes.map { x => x: js.Any }),
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("CacheClusterCreateTime" -> CacheClusterCreateTime.map { x => x: js.Any }),
        ("CacheParameterGroup" -> CacheParameterGroup.map { x => x: js.Any }),
        ("PendingModifiedValues" -> PendingModifiedValues.map { x => x: js.Any }),
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("SnapshotWindow" -> SnapshotWindow.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("CacheSecurityGroups" -> CacheSecurityGroups.map { x => x: js.Any }),
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any }),
        ("NumCacheNodes" -> NumCacheNodes.map { x => x: js.Any }),
        ("SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheCluster]
    }
  }

  /**
   * <p>You already have a cache cluster with the given identifier.</p>
   */
  @js.native
  trait CacheClusterAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>Represents the output of a <i>DescribeCacheClusters</i> action.</p>
   */
  @js.native
  trait CacheClusterMessage extends js.Object {
    var Marker: String
    var CacheClusters: CacheClusterList
  }

  object CacheClusterMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheClusters: js.UndefOr[CacheClusterList] = js.undefined
    ): CacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("CacheClusters" -> CacheClusters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheClusterMessage]
    }
  }

  /**
   * <p>The requested cache cluster ID does not refer to an existing cache cluster.</p>
   */
  @js.native
  trait CacheClusterNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Provides all of the details about a particular cache engine version.</p>
   */
  @js.native
  trait CacheEngineVersion extends js.Object {
    var Engine: String
    var CacheEngineDescription: String
    var CacheEngineVersionDescription: String
    var CacheParameterGroupFamily: String
    var EngineVersion: String
  }

  object CacheEngineVersion {
    def apply(
      Engine: js.UndefOr[String] = js.undefined,
      CacheEngineDescription: js.UndefOr[String] = js.undefined,
      CacheEngineVersionDescription: js.UndefOr[String] = js.undefined,
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined
    ): CacheEngineVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("CacheEngineDescription" -> CacheEngineDescription.map { x => x: js.Any }),
        ("CacheEngineVersionDescription" -> CacheEngineVersionDescription.map { x => x: js.Any }),
        ("CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheEngineVersion]
    }
  }

  /**
   * <p>Represents the output of a <a>DescribeCacheEngineVersions</a> action.</p>
   */
  @js.native
  trait CacheEngineVersionMessage extends js.Object {
    var Marker: String
    var CacheEngineVersions: CacheEngineVersionList
  }

  object CacheEngineVersionMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.undefined
    ): CacheEngineVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("CacheEngineVersions" -> CacheEngineVersions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheEngineVersionMessage]
    }
  }

  /**
   * <p>Represents an individual cache node within a cache cluster. Each cache node runs its own instance of the cluster's protocol-compliant caching software - either Memcached or Redis.</p> <p>Valid node types are as follows:</p> <ul> <li>General purpose: <ul> <li>Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>, <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code></li> <li>Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code></li> </ul></li> <li>Compute optimized: <code>cache.c1.xlarge</code></li> <li>Memory optimized <ul> <li>Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code></li> <li>Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code></li> </ul></li> </ul> <p><b>Notes:</b></p> <ul> <li>All t2 instances are created in an Amazon Virtual Private Cloud (VPC).</li> <li>Redis backup/restore is not supported for t2 instances.</li> <li>Redis Append-only files (AOF) functionality is not supported for t1 or t2 instances.</li> </ul> <p>For a complete listing of cache node types and specifications, see <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific">Cache Node Type-Specific Parameters for Memcached</a> or <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific">Cache Node Type-Specific Parameters for Redis</a>. </p>
   */
  @js.native
  trait CacheNode extends js.Object {
    var CacheNodeCreateTime: TStamp
    var CacheNodeId: String
    var SourceCacheNodeId: String
    var Endpoint: Endpoint
    var CacheNodeStatus: String
    var ParameterGroupStatus: String
    var CustomerAvailabilityZone: String
  }

  object CacheNode {
    def apply(
      CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined,
      CacheNodeId: js.UndefOr[String] = js.undefined,
      SourceCacheNodeId: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      CacheNodeStatus: js.UndefOr[String] = js.undefined,
      ParameterGroupStatus: js.UndefOr[String] = js.undefined,
      CustomerAvailabilityZone: js.UndefOr[String] = js.undefined
    ): CacheNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheNodeCreateTime" -> CacheNodeCreateTime.map { x => x: js.Any }),
        ("CacheNodeId" -> CacheNodeId.map { x => x: js.Any }),
        ("SourceCacheNodeId" -> SourceCacheNodeId.map { x => x: js.Any }),
        ("Endpoint" -> Endpoint.map { x => x: js.Any }),
        ("CacheNodeStatus" -> CacheNodeStatus.map { x => x: js.Any }),
        ("ParameterGroupStatus" -> ParameterGroupStatus.map { x => x: js.Any }),
        ("CustomerAvailabilityZone" -> CustomerAvailabilityZone.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheNode]
    }
  }

  /**
   * <p>A parameter that has a different value for each cache node type it is applied to. For example, in a Redis cache cluster, a <i>cache.m1.large</i> cache node type would have a larger <i>maxmemory</i> value than a <i>cache.m1.small</i> type.</p>
   */
  @js.native
  trait CacheNodeTypeSpecificParameter extends js.Object {
    var IsModifiable: Boolean
    var CacheNodeTypeSpecificValues: CacheNodeTypeSpecificValueList
    var Description: String
    var AllowedValues: String
    var Source: String
    var MinimumEngineVersion: String
    var ParameterName: String
    var DataType: String
  }

  object CacheNodeTypeSpecificParameter {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      CacheNodeTypeSpecificValues: js.UndefOr[CacheNodeTypeSpecificValueList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MinimumEngineVersion: js.UndefOr[String] = js.undefined,
      ParameterName: js.UndefOr[String] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined
    ): CacheNodeTypeSpecificParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsModifiable" -> IsModifiable.map { x => x: js.Any }),
        ("CacheNodeTypeSpecificValues" -> CacheNodeTypeSpecificValues.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("AllowedValues" -> AllowedValues.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("MinimumEngineVersion" -> MinimumEngineVersion.map { x => x: js.Any }),
        ("ParameterName" -> ParameterName.map { x => x: js.Any }),
        ("DataType" -> DataType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheNodeTypeSpecificParameter]
    }
  }

  /**
   * <p>A value that applies only to a certain cache node type.</p>
   */
  @js.native
  trait CacheNodeTypeSpecificValue extends js.Object {
    var CacheNodeType: String
    var Value: String
  }

  object CacheNodeTypeSpecificValue {
    def apply(
      CacheNodeType: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
    ): CacheNodeTypeSpecificValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheNodeTypeSpecificValue]
    }
  }

  /**
   * <p>Represents the output of a <i>CreateCacheParameterGroup</i> action.</p>
   */
  @js.native
  trait CacheParameterGroup extends js.Object {
    var CacheParameterGroupName: String
    var CacheParameterGroupFamily: String
    var Description: String
  }

  object CacheParameterGroup {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): CacheParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroup]
    }
  }

  /**
   * <p>A cache parameter group with the requested name already exists.</p>
   */
  @js.native
  trait CacheParameterGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>Represents the output of a <i>DescribeCacheParameters</i> action.</p>
   */
  @js.native
  trait CacheParameterGroupDetails extends js.Object {
    var Marker: String
    var Parameters: ParametersList
    var CacheNodeTypeSpecificParameters: CacheNodeTypeSpecificParametersList
  }

  object CacheParameterGroupDetails {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined
    ): CacheParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("CacheNodeTypeSpecificParameters" -> CacheNodeTypeSpecificParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupDetails]
    }
  }

  /**
   * <p>Represents the output of one of the following actions:</p> <ul> <li> <i>ModifyCacheParameterGroup</i> </li> <li> <i>ResetCacheParameterGroup</i> </li> </ul>
   */
  @js.native
  trait CacheParameterGroupNameMessage extends js.Object {
    var CacheParameterGroupName: String
  }

  object CacheParameterGroupNameMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined
    ): CacheParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupNameMessage]
    }
  }

  /**
   * <p> The requested cache parameter group name does not refer to an existing cache parameter group.</p>
   */
  @js.native
  trait CacheParameterGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would exceed the maximum number of cache security groups.</p>
   */
  @js.native
  trait CacheParameterGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>The status of the cache parameter group.</p>
   */
  @js.native
  trait CacheParameterGroupStatus extends js.Object {
    var CacheParameterGroupName: String
    var ParameterApplyStatus: String
    var CacheNodeIdsToReboot: CacheNodeIdsList
  }

  object CacheParameterGroupStatus {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterApplyStatus: js.UndefOr[String] = js.undefined,
      CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined
    ): CacheParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("ParameterApplyStatus" -> ParameterApplyStatus.map { x => x: js.Any }),
        ("CacheNodeIdsToReboot" -> CacheNodeIdsToReboot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupStatus]
    }
  }

  /**
   * <p>Represents the output of a <i>DescribeCacheParameterGroups</i> action.</p>
   */
  @js.native
  trait CacheParameterGroupsMessage extends js.Object {
    var Marker: String
    var CacheParameterGroups: CacheParameterGroupList
  }

  object CacheParameterGroupsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.undefined
    ): CacheParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("CacheParameterGroups" -> CacheParameterGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheParameterGroupsMessage]
    }
  }

  /**
   * <p>Represents the output of one of the following actions:</p> <ul> <li> <i>AuthorizeCacheSecurityGroupIngress</i> </li> <li> <i>CreateCacheSecurityGroup</i> </li> <li> <i>RevokeCacheSecurityGroupIngress</i> </li> </ul>
   */
  @js.native
  trait CacheSecurityGroup extends js.Object {
    var OwnerId: String
    var CacheSecurityGroupName: String
    var Description: String
    var EC2SecurityGroups: EC2SecurityGroupList
  }

  object CacheSecurityGroup {
    def apply(
      OwnerId: js.UndefOr[String] = js.undefined,
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
    ): CacheSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EC2SecurityGroups" -> EC2SecurityGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSecurityGroup]
    }
  }

  /**
   * <p>A cache security group with the specified name already exists.</p>
   */
  @js.native
  trait CacheSecurityGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>Represents a cache cluster's status within a particular cache security group.</p>
   */
  @js.native
  trait CacheSecurityGroupMembership extends js.Object {
    var CacheSecurityGroupName: String
    var Status: String
  }

  object CacheSecurityGroupMembership {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): CacheSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSecurityGroupMembership]
    }
  }

  /**
   * <p>Represents the output of a <i>DescribeCacheSecurityGroups</i> action.</p>
   */
  @js.native
  trait CacheSecurityGroupMessage extends js.Object {
    var Marker: String
    var CacheSecurityGroups: CacheSecurityGroups
  }

  object CacheSecurityGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheSecurityGroups: js.UndefOr[CacheSecurityGroups] = js.undefined
    ): CacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("CacheSecurityGroups" -> CacheSecurityGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSecurityGroupMessage]
    }
  }

  /**
   * <p> The requested cache security group name does not refer to an existing cache security group.</p>
   */
  @js.native
  trait CacheSecurityGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would exceed the allowed number of cache security groups.</p>
   */
  @js.native
  trait CacheSecurityGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>Represents the output of one of the following actions:</p> <ul> <li> <i>CreateCacheSubnetGroup</i> </li> <li> <i>ModifyCacheSubnetGroup</i> </li> </ul>
   */
  @js.native
  trait CacheSubnetGroup extends js.Object {
    var CacheSubnetGroupName: String
    var CacheSubnetGroupDescription: String
    var VpcId: String
    var Subnets: SubnetList
  }

  object CacheSubnetGroup {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      Subnets: js.UndefOr[SubnetList] = js.undefined
    ): CacheSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any }),
        ("CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("Subnets" -> Subnets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSubnetGroup]
    }
  }

  /**
   * <p> The requested cache subnet group name is already in use by an existing cache subnet group.</p>
   */
  @js.native
  trait CacheSubnetGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>The requested cache subnet group is currently in use.</p>
   */
  @js.native
  trait CacheSubnetGroupInUseException extends js.Object {

  }

  /**
   * <p>Represents the output of a <i>DescribeCacheSubnetGroups</i> action.</p>
   */
  @js.native
  trait CacheSubnetGroupMessage extends js.Object {
    var Marker: String
    var CacheSubnetGroups: CacheSubnetGroups
  }

  object CacheSubnetGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      CacheSubnetGroups: js.UndefOr[CacheSubnetGroups] = js.undefined
    ): CacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("CacheSubnetGroups" -> CacheSubnetGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheSubnetGroupMessage]
    }
  }

  /**
   * <p>The requested cache subnet group name does not refer to an existing cache subnet group.</p>
   */
  @js.native
  trait CacheSubnetGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would exceed the allowed number of cache subnet groups.</p>
   */
  @js.native
  trait CacheSubnetGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would exceed the allowed number of subnets in a cache subnet group.</p>
   */
  @js.native
  trait CacheSubnetQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would exceed the allowed number of cache clusters per customer.</p>
   */
  @js.native
  trait ClusterQuotaForCustomerExceededFaultException extends js.Object {

  }

  /**
   * <p>Represents the input of a <i>CopySnapshotMessage</i> action.</p>
   */
  @js.native
  trait CopySnapshotMessage extends js.Object {
    var SourceSnapshotName: String
    var TargetSnapshotName: String
  }

  object CopySnapshotMessage {
    def apply(
      SourceSnapshotName: js.UndefOr[String] = js.undefined,
      TargetSnapshotName: js.UndefOr[String] = js.undefined
    ): CopySnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceSnapshotName" -> SourceSnapshotName.map { x => x: js.Any }),
        ("TargetSnapshotName" -> TargetSnapshotName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotMessage]
    }
  }

  @js.native
  trait CopySnapshotResult extends js.Object {
    var Snapshot: Snapshot
  }

  object CopySnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CopySnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshot" -> Snapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotResult]
    }
  }

  /**
   * <p>Represents the input of a <i>CreateCacheCluster</i> action.</p>
   */
  @js.native
  trait CreateCacheClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var AZMode: AZMode
    var CacheParameterGroupName: String
    var ReplicationGroupId: String
    var Engine: String
    var PreferredAvailabilityZones: PreferredAvailabilityZoneList
    var PreferredAvailabilityZone: String
    var CacheClusterId: String
    var CacheNodeType: String
    var SnapshotName: String
    var SnapshotWindow: String
    var CacheSecurityGroupNames: CacheSecurityGroupNameList
    var AutoMinorVersionUpgrade: BooleanOptional
    var SecurityGroupIds: SecurityGroupIdsList
    var EngineVersion: String
    var NotificationTopicArn: String
    var Port: IntegerOptional
    var CacheSubnetGroupName: String
    var Tags: TagList
    var NumCacheNodes: IntegerOptional
    var SnapshotArns: SnapshotArnsList
    var SnapshotRetentionLimit: IntegerOptional
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
      SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    ): CreateCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("AZMode" -> AZMode.map { x => x: js.Any }),
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("ReplicationGroupId" -> ReplicationGroupId.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("PreferredAvailabilityZones" -> PreferredAvailabilityZones.map { x => x: js.Any }),
        ("PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x: js.Any }),
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("SnapshotName" -> SnapshotName.map { x => x: js.Any }),
        ("SnapshotWindow" -> SnapshotWindow.map { x => x: js.Any }),
        ("CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("NotificationTopicArn" -> NotificationTopicArn.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("NumCacheNodes" -> NumCacheNodes.map { x => x: js.Any }),
        ("SnapshotArns" -> SnapshotArns.map { x => x: js.Any }),
        ("SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheClusterMessage]
    }
  }

  @js.native
  trait CreateCacheClusterResult extends js.Object {
    var CacheCluster: CacheCluster
  }

  object CreateCacheClusterResult {
    def apply(
      CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): CreateCacheClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheCluster" -> CacheCluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheClusterResult]
    }
  }

  /**
   * <p>Represents the input of a <i>CreateCacheParameterGroup</i> action.</p>
   */
  @js.native
  trait CreateCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
    var CacheParameterGroupFamily: String
    var Description: String
  }

  object CreateCacheParameterGroupMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): CreateCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheParameterGroupMessage]
    }
  }

  @js.native
  trait CreateCacheParameterGroupResult extends js.Object {
    var CacheParameterGroup: CacheParameterGroup
  }

  object CreateCacheParameterGroupResult {
    def apply(
      CacheParameterGroup: js.UndefOr[CacheParameterGroup] = js.undefined
    ): CreateCacheParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroup" -> CacheParameterGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheParameterGroupResult]
    }
  }

  /**
   * <p>Represents the input of a <i>CreateCacheSecurityGroup</i> action.</p>
   */
  @js.native
  trait CreateCacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroupName: String
    var Description: String
  }

  object CreateCacheSecurityGroupMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): CreateCacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateCacheSecurityGroupResult extends js.Object {
    var CacheSecurityGroup: CacheSecurityGroup
  }

  object CreateCacheSecurityGroupResult {
    def apply(
      CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): CreateCacheSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroup" -> CacheSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheSecurityGroupResult]
    }
  }

  /**
   * <p>Represents the input of a <i>CreateCacheSubnetGroup</i> action.</p>
   */
  @js.native
  trait CreateCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: String
    var CacheSubnetGroupDescription: String
    var SubnetIds: SubnetIdentifierList
  }

  object CreateCacheSubnetGroupMessage {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
    ): CreateCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any }),
        ("CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: CacheSubnetGroup
  }

  object CreateCacheSubnetGroupResult {
    def apply(
      CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
    ): CreateCacheSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSubnetGroup" -> CacheSubnetGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCacheSubnetGroupResult]
    }
  }

  /**
   * <p>Represents the input of a <i>CreateReplicationGroup</i> action.</p>
   */
  @js.native
  trait CreateReplicationGroupMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var CacheParameterGroupName: String
    var ReplicationGroupId: String
    var Engine: String
    var CacheNodeType: String
    var SnapshotName: String
    var SnapshotWindow: String
    var NumCacheClusters: IntegerOptional
    var CacheSecurityGroupNames: CacheSecurityGroupNameList
    var AutomaticFailoverEnabled: BooleanOptional
    var PreferredCacheClusterAZs: AvailabilityZonesList
    var AutoMinorVersionUpgrade: BooleanOptional
    var SecurityGroupIds: SecurityGroupIdsList
    var EngineVersion: String
    var NotificationTopicArn: String
    var Port: IntegerOptional
    var CacheSubnetGroupName: String
    var PrimaryClusterId: String
    var Tags: TagList
    var ReplicationGroupDescription: String
    var SnapshotArns: SnapshotArnsList
    var SnapshotRetentionLimit: IntegerOptional
  }

  object CreateReplicationGroupMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      NumCacheClusters: js.UndefOr[IntegerOptional] = js.undefined,
      CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
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
      SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    ): CreateReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("ReplicationGroupId" -> ReplicationGroupId.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("SnapshotName" -> SnapshotName.map { x => x: js.Any }),
        ("SnapshotWindow" -> SnapshotWindow.map { x => x: js.Any }),
        ("NumCacheClusters" -> NumCacheClusters.map { x => x: js.Any }),
        ("CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x: js.Any }),
        ("AutomaticFailoverEnabled" -> AutomaticFailoverEnabled.map { x => x: js.Any }),
        ("PreferredCacheClusterAZs" -> PreferredCacheClusterAZs.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("NotificationTopicArn" -> NotificationTopicArn.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any }),
        ("PrimaryClusterId" -> PrimaryClusterId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ReplicationGroupDescription" -> ReplicationGroupDescription.map { x => x: js.Any }),
        ("SnapshotArns" -> SnapshotArns.map { x => x: js.Any }),
        ("SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationGroupMessage]
    }
  }

  @js.native
  trait CreateReplicationGroupResult extends js.Object {
    var ReplicationGroup: ReplicationGroup
  }

  object CreateReplicationGroupResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): CreateReplicationGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplicationGroup" -> ReplicationGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationGroupResult]
    }
  }

  /**
   * <p>Represents the input of a <i>CreateSnapshot</i> action.</p>
   */
  @js.native
  trait CreateSnapshotMessage extends js.Object {
    var CacheClusterId: String
    var SnapshotName: String
  }

  object CreateSnapshotMessage {
    def apply(
      CacheClusterId: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined
    ): CreateSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("SnapshotName" -> SnapshotName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotMessage]
    }
  }

  @js.native
  trait CreateSnapshotResult extends js.Object {
    var Snapshot: Snapshot
  }

  object CreateSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CreateSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshot" -> Snapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotResult]
    }
  }

  /**
   * <p>Represents the input of a <i>DeleteCacheCluster</i> action.</p>
   */
  @js.native
  trait DeleteCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var FinalSnapshotIdentifier: String
  }

  object DeleteCacheClusterMessage {
    def apply(
      CacheClusterId: js.UndefOr[String] = js.undefined,
      FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("FinalSnapshotIdentifier" -> FinalSnapshotIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheClusterMessage]
    }
  }

  @js.native
  trait DeleteCacheClusterResult extends js.Object {
    var CacheCluster: CacheCluster
  }

  object DeleteCacheClusterResult {
    def apply(
      CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): DeleteCacheClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheCluster" -> CacheCluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheClusterResult]
    }
  }

  /**
   * <p>Represents the input of a <i>DeleteCacheParameterGroup</i> action.</p>
   */
  @js.native
  trait DeleteCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
  }

  object DeleteCacheParameterGroupMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined
    ): DeleteCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheParameterGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DeleteCacheSecurityGroup</i> action.</p>
   */
  @js.native
  trait DeleteCacheSecurityGroupMessage extends js.Object {
    var CacheSecurityGroupName: String
  }

  object DeleteCacheSecurityGroupMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined
    ): DeleteCacheSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheSecurityGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DeleteCacheSubnetGroup</i> action.</p>
   */
  @js.native
  trait DeleteCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: String
  }

  object DeleteCacheSubnetGroupMessage {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined
    ): DeleteCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCacheSubnetGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DeleteReplicationGroup</i> action.</p>
   */
  @js.native
  trait DeleteReplicationGroupMessage extends js.Object {
    var ReplicationGroupId: String
    var RetainPrimaryCluster: BooleanOptional
    var FinalSnapshotIdentifier: String
  }

  object DeleteReplicationGroupMessage {
    def apply(
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.undefined,
      FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplicationGroupId" -> ReplicationGroupId.map { x => x: js.Any }),
        ("RetainPrimaryCluster" -> RetainPrimaryCluster.map { x => x: js.Any }),
        ("FinalSnapshotIdentifier" -> FinalSnapshotIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationGroupMessage]
    }
  }

  @js.native
  trait DeleteReplicationGroupResult extends js.Object {
    var ReplicationGroup: ReplicationGroup
  }

  object DeleteReplicationGroupResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): DeleteReplicationGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplicationGroup" -> ReplicationGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationGroupResult]
    }
  }

  /**
   * <p>Represents the input of a <i>DeleteSnapshot</i> action.</p>
   */
  @js.native
  trait DeleteSnapshotMessage extends js.Object {
    var SnapshotName: String
  }

  object DeleteSnapshotMessage {
    def apply(
      SnapshotName: js.UndefOr[String] = js.undefined
    ): DeleteSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotName" -> SnapshotName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotMessage]
    }
  }

  @js.native
  trait DeleteSnapshotResult extends js.Object {
    var Snapshot: Snapshot
  }

  object DeleteSnapshotResult {
    def apply(
      Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): DeleteSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshot" -> Snapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotResult]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeCacheClusters</i> action.</p>
   */
  @js.native
  trait DescribeCacheClustersMessage extends js.Object {
    var CacheClusterId: String
    var MaxRecords: IntegerOptional
    var Marker: String
    var ShowCacheNodeInfo: BooleanOptional
  }

  object DescribeCacheClustersMessage {
    def apply(
      CacheClusterId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.undefined
    ): DescribeCacheClustersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ShowCacheNodeInfo" -> ShowCacheNodeInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheClustersMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeCacheEngineVersions</i> action.</p>
   */
  @js.native
  trait DescribeCacheEngineVersionsMessage extends js.Object {
    var Engine: String
    var DefaultOnly: Boolean
    var CacheParameterGroupFamily: String
    var EngineVersion: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeCacheEngineVersionsMessage {
    def apply(
      Engine: js.UndefOr[String] = js.undefined,
      DefaultOnly: js.UndefOr[Boolean] = js.undefined,
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeCacheEngineVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("DefaultOnly" -> DefaultOnly.map { x => x: js.Any }),
        ("CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheEngineVersionsMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeCacheParameterGroups</i> action.</p>
   */
  @js.native
  trait DescribeCacheParameterGroupsMessage extends js.Object {
    var CacheParameterGroupName: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeCacheParameterGroupsMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeCacheParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheParameterGroupsMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeCacheParameters</i> action.</p>
   */
  @js.native
  trait DescribeCacheParametersMessage extends js.Object {
    var CacheParameterGroupName: String
    var Source: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeCacheParametersMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeCacheParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheParametersMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeCacheSecurityGroups</i> action.</p>
   */
  @js.native
  trait DescribeCacheSecurityGroupsMessage extends js.Object {
    var CacheSecurityGroupName: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeCacheSecurityGroupsMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeCacheSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheSecurityGroupsMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeCacheSubnetGroups</i> action.</p>
   */
  @js.native
  trait DescribeCacheSubnetGroupsMessage extends js.Object {
    var CacheSubnetGroupName: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeCacheSubnetGroupsMessage {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeCacheSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheSubnetGroupsMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeEngineDefaultParameters</i> action.</p>
   */
  @js.native
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    var CacheParameterGroupFamily: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeEngineDefaultParametersMessage {
    def apply(
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeEngineDefaultParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: EngineDefaults
  }

  object DescribeEngineDefaultParametersResult {
    def apply(
      EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
    ): DescribeEngineDefaultParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EngineDefaults" -> EngineDefaults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersResult]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeEvents</i> action.</p>
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
   * <p>Represents the input of a <i>DescribeReplicationGroups</i> action.</p>
   */
  @js.native
  trait DescribeReplicationGroupsMessage extends js.Object {
    var ReplicationGroupId: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeReplicationGroupsMessage {
    def apply(
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeReplicationGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplicationGroupId" -> ReplicationGroupId.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationGroupsMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeReservedCacheNodes</i> action.</p>
   */
  @js.native
  trait DescribeReservedCacheNodesMessage extends js.Object {
    var Duration: String
    var CacheNodeType: String
    var OfferingType: String
    var MaxRecords: IntegerOptional
    var ProductDescription: String
    var ReservedCacheNodeId: String
    var ReservedCacheNodesOfferingId: String
    var Marker: String
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
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeReservedCacheNodesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x: js.Any }),
        ("ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedCacheNodesMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeReservedCacheNodesOfferings</i> action.</p>
   */
  @js.native
  trait DescribeReservedCacheNodesOfferingsMessage extends js.Object {
    var Duration: String
    var CacheNodeType: String
    var OfferingType: String
    var MaxRecords: IntegerOptional
    var ProductDescription: String
    var ReservedCacheNodesOfferingId: String
    var Marker: String
  }

  object DescribeReservedCacheNodesOfferingsMessage {
    def apply(
      Duration: js.UndefOr[String] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeReservedCacheNodesOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedCacheNodesOfferingsMessage]
    }
  }

  /**
   * <p>Represents the output of a <i>DescribeSnapshots</i> action.</p>
   */
  @js.native
  trait DescribeSnapshotsListMessage extends js.Object {
    var Marker: String
    var Snapshots: SnapshotList
  }

  object DescribeSnapshotsListMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Snapshots: js.UndefOr[SnapshotList] = js.undefined
    ): DescribeSnapshotsListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Snapshots" -> Snapshots.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsListMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeSnapshotsMessage</i> action.</p>
   */
  @js.native
  trait DescribeSnapshotsMessage extends js.Object {
    var SnapshotSource: String
    var CacheClusterId: String
    var SnapshotName: String
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeSnapshotsMessage {
    def apply(
      SnapshotSource: js.UndefOr[String] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotSource" -> SnapshotSource.map { x => x: js.Any }),
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("SnapshotName" -> SnapshotName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsMessage]
    }
  }

  /**
   * <p>Provides ownership and status information for an Amazon EC2 security group.</p>
   */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var Status: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object EC2SecurityGroup {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
   * <p>Represents the information required for client programs to connect to a cache node.</p>
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
   * <p>Represents the output of a <i>DescribeEngineDefaultParameters</i> action.</p>
   */
  @js.native
  trait EngineDefaults extends js.Object {
    var CacheParameterGroupFamily: String
    var Marker: String
    var Parameters: ParametersList
    var CacheNodeTypeSpecificParameters: CacheNodeTypeSpecificParametersList
  }

  object EngineDefaults {
    def apply(
      CacheParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined
    ): EngineDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupFamily" -> CacheParameterGroupFamily.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("CacheNodeTypeSpecificParameters" -> CacheNodeTypeSpecificParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EngineDefaults]
    }
  }

  /**
   * <p>Represents a single occurrence of something interesting within the system. Some examples of events are creating a cache cluster, adding or removing a cache node, or rebooting a node.</p>
   */
  @js.native
  trait Event extends js.Object {
    var SourceIdentifier: String
    var SourceType: SourceType
    var Message: String
    var Date: TStamp
  }

  object Event {
    def apply(
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      Date: js.UndefOr[TStamp] = js.undefined
    ): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceIdentifier" -> SourceIdentifier.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("Date" -> Date.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p>Represents the output of a <i>DescribeEvents</i> action.</p>
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
   * <p>The requested cache node type is not available in the specified Availability Zone.</p>
   */
  @js.native
  trait InsufficientCacheClusterCapacityFaultException extends js.Object {

  }

  /**
   * <p>The requested Amazon Resource Name (ARN) does not refer to an existing resource.</p>
   */
  @js.native
  trait InvalidARNFaultException extends js.Object {

  }

  /**
   * <p>The requested cache cluster is not in the <i>available</i> state.</p>
   */
  @js.native
  trait InvalidCacheClusterStateFaultException extends js.Object {

  }

  /**
   * <p>The current state of the cache parameter group does not allow the requested action to occur. </p>
   */
  @js.native
  trait InvalidCacheParameterGroupStateFaultException extends js.Object {

  }

  /**
   * <p>The current state of the cache security group does not allow deletion.</p>
   */
  @js.native
  trait InvalidCacheSecurityGroupStateFaultException extends js.Object {

  }

  /**
   * <p>Two or more incompatible parameters were specified.</p>
   */
  @js.native
  trait InvalidParameterCombinationExceptionException extends js.Object {
    var message: AwsQueryErrorMessage
  }

  /**
   * <p>The value for a parameter is invalid.</p>
   */
  @js.native
  trait InvalidParameterValueExceptionException extends js.Object {
    var message: AwsQueryErrorMessage
  }

  /**
   * <p>The requested replication group is not in the <i>available</i> state.</p>
   */
  @js.native
  trait InvalidReplicationGroupStateFaultException extends js.Object {

  }

  /**
   * <p>The current state of the snapshot does not allow the requested action to occur.</p>
   */
  @js.native
  trait InvalidSnapshotStateFaultException extends js.Object {

  }

  /**
   * <p>An invalid subnet identifier was specified.</p>
   */
  @js.native
  trait InvalidSubnetException extends js.Object {

  }

  /**
   * <p>The VPC network is in an invalid state.</p>
   */
  @js.native
  trait InvalidVPCNetworkStateFaultException extends js.Object {

  }

  /**
   * <p>The input parameters for the <i>ListTagsForResource</i> action.</p>
   */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
  }

  object ListTagsForResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>ModifyCacheCluster</i> action.</p>
   */
  @js.native
  trait ModifyCacheClusterMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var AZMode: AZMode
    var CacheParameterGroupName: String
    var CacheNodeIdsToRemove: CacheNodeIdsList
    var CacheClusterId: String
    var SnapshotWindow: String
    var CacheSecurityGroupNames: CacheSecurityGroupNameList
    var AutoMinorVersionUpgrade: BooleanOptional
    var SecurityGroupIds: SecurityGroupIdsList
    var EngineVersion: String
    var NotificationTopicArn: String
    var ApplyImmediately: Boolean
    var NumCacheNodes: IntegerOptional
    var SnapshotRetentionLimit: IntegerOptional
    var NotificationTopicStatus: String
    var NewAvailabilityZones: PreferredAvailabilityZoneList
  }

  object ModifyCacheClusterMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      AZMode: js.UndefOr[AZMode] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
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
      NewAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined
    ): ModifyCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("AZMode" -> AZMode.map { x => x: js.Any }),
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("CacheNodeIdsToRemove" -> CacheNodeIdsToRemove.map { x => x: js.Any }),
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("SnapshotWindow" -> SnapshotWindow.map { x => x: js.Any }),
        ("CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("NotificationTopicArn" -> NotificationTopicArn.map { x => x: js.Any }),
        ("ApplyImmediately" -> ApplyImmediately.map { x => x: js.Any }),
        ("NumCacheNodes" -> NumCacheNodes.map { x => x: js.Any }),
        ("SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x: js.Any }),
        ("NotificationTopicStatus" -> NotificationTopicStatus.map { x => x: js.Any }),
        ("NewAvailabilityZones" -> NewAvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheClusterMessage]
    }
  }

  @js.native
  trait ModifyCacheClusterResult extends js.Object {
    var CacheCluster: CacheCluster
  }

  object ModifyCacheClusterResult {
    def apply(
      CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): ModifyCacheClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheCluster" -> CacheCluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheClusterResult]
    }
  }

  /**
   * <p>Represents the input of a <i>ModifyCacheParameterGroup</i> action.</p>
   */
  @js.native
  trait ModifyCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
    var ParameterNameValues: ParameterNameValueList
  }

  object ModifyCacheParameterGroupMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.undefined
    ): ModifyCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("ParameterNameValues" -> ParameterNameValues.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheParameterGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>ModifyCacheSubnetGroup</i> action.</p>
   */
  @js.native
  trait ModifyCacheSubnetGroupMessage extends js.Object {
    var CacheSubnetGroupName: String
    var CacheSubnetGroupDescription: String
    var SubnetIds: SubnetIdentifierList
  }

  object ModifyCacheSubnetGroupMessage {
    def apply(
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
    ): ModifyCacheSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any }),
        ("CacheSubnetGroupDescription" -> CacheSubnetGroupDescription.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: CacheSubnetGroup
  }

  object ModifyCacheSubnetGroupResult {
    def apply(
      CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
    ): ModifyCacheSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSubnetGroup" -> CacheSubnetGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyCacheSubnetGroupResult]
    }
  }

  /**
   * <p>Represents the input of a <i>ModifyReplicationGroups</i> action.</p>
   */
  @js.native
  trait ModifyReplicationGroupMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var CacheParameterGroupName: String
    var ReplicationGroupId: String
    var SnapshotWindow: String
    var CacheSecurityGroupNames: CacheSecurityGroupNameList
    var AutomaticFailoverEnabled: BooleanOptional
    var AutoMinorVersionUpgrade: BooleanOptional
    var SecurityGroupIds: SecurityGroupIdsList
    var EngineVersion: String
    var NotificationTopicArn: String
    var ApplyImmediately: Boolean
    var PrimaryClusterId: String
    var ReplicationGroupDescription: String
    var SnapshotRetentionLimit: IntegerOptional
    var NotificationTopicStatus: String
    var SnapshottingClusterId: String
  }

  object ModifyReplicationGroupMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined,
      AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      NotificationTopicArn: js.UndefOr[String] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
      PrimaryClusterId: js.UndefOr[String] = js.undefined,
      ReplicationGroupDescription: js.UndefOr[String] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
      NotificationTopicStatus: js.UndefOr[String] = js.undefined,
      SnapshottingClusterId: js.UndefOr[String] = js.undefined
    ): ModifyReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("ReplicationGroupId" -> ReplicationGroupId.map { x => x: js.Any }),
        ("SnapshotWindow" -> SnapshotWindow.map { x => x: js.Any }),
        ("CacheSecurityGroupNames" -> CacheSecurityGroupNames.map { x => x: js.Any }),
        ("AutomaticFailoverEnabled" -> AutomaticFailoverEnabled.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("NotificationTopicArn" -> NotificationTopicArn.map { x => x: js.Any }),
        ("ApplyImmediately" -> ApplyImmediately.map { x => x: js.Any }),
        ("PrimaryClusterId" -> PrimaryClusterId.map { x => x: js.Any }),
        ("ReplicationGroupDescription" -> ReplicationGroupDescription.map { x => x: js.Any }),
        ("SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x: js.Any }),
        ("NotificationTopicStatus" -> NotificationTopicStatus.map { x => x: js.Any }),
        ("SnapshottingClusterId" -> SnapshottingClusterId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationGroupMessage]
    }
  }

  @js.native
  trait ModifyReplicationGroupResult extends js.Object {
    var ReplicationGroup: ReplicationGroup
  }

  object ModifyReplicationGroupResult {
    def apply(
      ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
    ): ModifyReplicationGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplicationGroup" -> ReplicationGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationGroupResult]
    }
  }

  /**
   * <p>Represents a collection of cache nodes in a replication group.</p>
   */
  @js.native
  trait NodeGroup extends js.Object {
    var NodeGroupId: String
    var Status: String
    var PrimaryEndpoint: Endpoint
    var NodeGroupMembers: NodeGroupMemberList
  }

  object NodeGroup {
    def apply(
      NodeGroupId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      PrimaryEndpoint: js.UndefOr[Endpoint] = js.undefined,
      NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.undefined
    ): NodeGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NodeGroupId" -> NodeGroupId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("PrimaryEndpoint" -> PrimaryEndpoint.map { x => x: js.Any }),
        ("NodeGroupMembers" -> NodeGroupMembers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeGroup]
    }
  }

  /**
   * <p>Represents a single node within a node group.</p>
   */
  @js.native
  trait NodeGroupMember extends js.Object {
    var CacheNodeId: String
    var PreferredAvailabilityZone: String
    var ReadEndpoint: Endpoint
    var CurrentRole: String
    var CacheClusterId: String
  }

  object NodeGroupMember {
    def apply(
      CacheNodeId: js.UndefOr[String] = js.undefined,
      PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
      ReadEndpoint: js.UndefOr[Endpoint] = js.undefined,
      CurrentRole: js.UndefOr[String] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined
    ): NodeGroupMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheNodeId" -> CacheNodeId.map { x => x: js.Any }),
        ("PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x: js.Any }),
        ("ReadEndpoint" -> ReadEndpoint.map { x => x: js.Any }),
        ("CurrentRole" -> CurrentRole.map { x => x: js.Any }),
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeGroupMember]
    }
  }

  /**
   * <p>The request cannot be processed because it would exceed the allowed number of cache nodes in a single cache cluster.</p>
   */
  @js.native
  trait NodeQuotaForClusterExceededFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would exceed the allowed number of cache nodes per customer. </p>
   */
  @js.native
  trait NodeQuotaForCustomerExceededFaultException extends js.Object {

  }

  /**
   * <p>Represents an individual cache node in a snapshot of a cache cluster.</p>
   */
  @js.native
  trait NodeSnapshot extends js.Object {
    var CacheNodeId: String
    var CacheSize: String
    var CacheNodeCreateTime: TStamp
    var SnapshotCreateTime: TStamp
  }

  object NodeSnapshot {
    def apply(
      CacheNodeId: js.UndefOr[String] = js.undefined,
      CacheSize: js.UndefOr[String] = js.undefined,
      CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined,
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
    ): NodeSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheNodeId" -> CacheNodeId.map { x => x: js.Any }),
        ("CacheSize" -> CacheSize.map { x => x: js.Any }),
        ("CacheNodeCreateTime" -> CacheNodeCreateTime.map { x => x: js.Any }),
        ("SnapshotCreateTime" -> SnapshotCreateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeSnapshot]
    }
  }

  /**
   * <p>Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to subscribers using Amazon Simple Notification Service (SNS).</p>
   */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var TopicArn: String
    var TopicStatus: String
  }

  object NotificationConfiguration {
    def apply(
      TopicArn: js.UndefOr[String] = js.undefined,
      TopicStatus: js.UndefOr[String] = js.undefined
    ): NotificationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("TopicStatus" -> TopicStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfiguration]
    }
  }

  /**
   * <p>Describes an individual setting that controls some aspect of ElastiCache behavior.</p>
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
   * <p>Describes a name-value pair that is used to update the value of a parameter.</p>
   */
  @js.native
  trait ParameterNameValue extends js.Object {
    var ParameterName: String
    var ParameterValue: String
  }

  object ParameterNameValue {
    def apply(
      ParameterName: js.UndefOr[String] = js.undefined,
      ParameterValue: js.UndefOr[String] = js.undefined
    ): ParameterNameValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ParameterName" -> ParameterName.map { x => x: js.Any }),
        ("ParameterValue" -> ParameterValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterNameValue]
    }
  }


  object PendingAutomaticFailoverStatusEnum {
    val enabled = "enabled"
    val disabled = "disabled"

    val values = IndexedSeq(enabled, disabled)
  }

  /**
   * <p>A group of settings that will be applied to the cache cluster in the future, or that are currently being applied.</p>
   */
  @js.native
  trait PendingModifiedValues extends js.Object {
    var NumCacheNodes: IntegerOptional
    var CacheNodeIdsToRemove: CacheNodeIdsList
    var EngineVersion: String
  }

  object PendingModifiedValues {
    def apply(
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
      CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined
    ): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NumCacheNodes" -> NumCacheNodes.map { x => x: js.Any }),
        ("CacheNodeIdsToRemove" -> CacheNodeIdsToRemove.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
    }
  }

  /**
   * <p>Represents the input of a <i>PurchaseReservedCacheNodesOffering</i> action.</p>
   */
  @js.native
  trait PurchaseReservedCacheNodesOfferingMessage extends js.Object {
    var ReservedCacheNodesOfferingId: String
    var ReservedCacheNodeId: String
    var CacheNodeCount: IntegerOptional
  }

  object PurchaseReservedCacheNodesOfferingMessage {
    def apply(
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined,
      ReservedCacheNodeId: js.UndefOr[String] = js.undefined,
      CacheNodeCount: js.UndefOr[IntegerOptional] = js.undefined
    ): PurchaseReservedCacheNodesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x: js.Any }),
        ("ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x: js.Any }),
        ("CacheNodeCount" -> CacheNodeCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedCacheNodesOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
    var ReservedCacheNode: ReservedCacheNode
  }

  object PurchaseReservedCacheNodesOfferingResult {
    def apply(
      ReservedCacheNode: js.UndefOr[ReservedCacheNode] = js.undefined
    ): PurchaseReservedCacheNodesOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedCacheNode" -> ReservedCacheNode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
    }
  }

  /**
   * <p>Represents the input of a <i>RebootCacheCluster</i> action.</p>
   */
  @js.native
  trait RebootCacheClusterMessage extends js.Object {
    var CacheClusterId: String
    var CacheNodeIdsToReboot: CacheNodeIdsList
  }

  object RebootCacheClusterMessage {
    def apply(
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined
    ): RebootCacheClusterMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("CacheNodeIdsToReboot" -> CacheNodeIdsToReboot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootCacheClusterMessage]
    }
  }

  @js.native
  trait RebootCacheClusterResult extends js.Object {
    var CacheCluster: CacheCluster
  }

  object RebootCacheClusterResult {
    def apply(
      CacheCluster: js.UndefOr[CacheCluster] = js.undefined
    ): RebootCacheClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheCluster" -> CacheCluster.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootCacheClusterResult]
    }
  }

  /**
   * <p>Contains the specific price and frequency of a recurring charges for a reserved cache node, or for a reserved cache node offering.</p>
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
   * <p>Represents the input of a <i>RemoveTagsFromResource</i> action.</p>
   */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[KeyList] = js.undefined
    ): RemoveTagsFromResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
   * <p>Contains all of the attributes of a specific replication group.</p>
   */
  @js.native
  trait ReplicationGroup extends js.Object {
    var AutomaticFailover: AutomaticFailoverStatus
    var ReplicationGroupId: String
    var Description: String
    var PendingModifiedValues: ReplicationGroupPendingModifiedValues
    var MemberClusters: ClusterIdList
    var NodeGroups: NodeGroupList
    var Status: String
    var SnapshottingClusterId: String
  }

  object ReplicationGroup {
    def apply(
      AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined,
      ReplicationGroupId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.undefined,
      MemberClusters: js.UndefOr[ClusterIdList] = js.undefined,
      NodeGroups: js.UndefOr[NodeGroupList] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      SnapshottingClusterId: js.UndefOr[String] = js.undefined
    ): ReplicationGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutomaticFailover" -> AutomaticFailover.map { x => x: js.Any }),
        ("ReplicationGroupId" -> ReplicationGroupId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("PendingModifiedValues" -> PendingModifiedValues.map { x => x: js.Any }),
        ("MemberClusters" -> MemberClusters.map { x => x: js.Any }),
        ("NodeGroups" -> NodeGroups.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("SnapshottingClusterId" -> SnapshottingClusterId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationGroup]
    }
  }

  /**
   * <p>The specified replication group already exists.</p>
   */
  @js.native
  trait ReplicationGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>Represents the output of a <i>DescribeReplicationGroups</i> action.</p>
   */
  @js.native
  trait ReplicationGroupMessage extends js.Object {
    var Marker: String
    var ReplicationGroups: ReplicationGroupList
  }

  object ReplicationGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.undefined
    ): ReplicationGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ReplicationGroups" -> ReplicationGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationGroupMessage]
    }
  }

  /**
   * <p>The specified replication group does not exist.</p>
   */
  @js.native
  trait ReplicationGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The settings to be applied to the replication group, either immediately or during the next maintenance window.</p>
   */
  @js.native
  trait ReplicationGroupPendingModifiedValues extends js.Object {
    var PrimaryClusterId: String
    var AutomaticFailoverStatus: PendingAutomaticFailoverStatus
  }

  object ReplicationGroupPendingModifiedValues {
    def apply(
      PrimaryClusterId: js.UndefOr[String] = js.undefined,
      AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.undefined
    ): ReplicationGroupPendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrimaryClusterId" -> PrimaryClusterId.map { x => x: js.Any }),
        ("AutomaticFailoverStatus" -> AutomaticFailoverStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationGroupPendingModifiedValues]
    }
  }

  /**
   * <p>Represents the output of a <i>PurchaseReservedCacheNodesOffering</i> action.</p>
   */
  @js.native
  trait ReservedCacheNode extends js.Object {
    var Duration: Integer
    var FixedPrice: Double
    var RecurringCharges: RecurringChargeList
    var CacheNodeType: String
    var StartTime: TStamp
    var OfferingType: String
    var CacheNodeCount: Integer
    var UsagePrice: Double
    var State: String
    var ProductDescription: String
    var ReservedCacheNodeId: String
    var ReservedCacheNodesOfferingId: String
  }

  object ReservedCacheNode {
    def apply(
      Duration: js.UndefOr[Integer] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      CacheNodeCount: js.UndefOr[Integer] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      ReservedCacheNodeId: js.UndefOr[String] = js.undefined,
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
    ): ReservedCacheNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("FixedPrice" -> FixedPrice.map { x => x: js.Any }),
        ("RecurringCharges" -> RecurringCharges.map { x => x: js.Any }),
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("CacheNodeCount" -> CacheNodeCount.map { x => x: js.Any }),
        ("UsagePrice" -> UsagePrice.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("ReservedCacheNodeId" -> ReservedCacheNodeId.map { x => x: js.Any }),
        ("ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNode]
    }
  }

  /**
   * <p>You already have a reservation with the given identifier.</p>
   */
  @js.native
  trait ReservedCacheNodeAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>Represents the output of a <i>DescribeReservedCacheNodes</i> action.</p>
   */
  @js.native
  trait ReservedCacheNodeMessage extends js.Object {
    var Marker: String
    var ReservedCacheNodes: ReservedCacheNodeList
  }

  object ReservedCacheNodeMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.undefined
    ): ReservedCacheNodeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ReservedCacheNodes" -> ReservedCacheNodes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNodeMessage]
    }
  }

  /**
   * <p>The requested reserved cache node was not found.</p>
   */
  @js.native
  trait ReservedCacheNodeNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would exceed the user's cache node quota.</p>
   */
  @js.native
  trait ReservedCacheNodeQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>Describes all of the attributes of a reserved cache node offering.</p>
   */
  @js.native
  trait ReservedCacheNodesOffering extends js.Object {
    var Duration: Integer
    var FixedPrice: Double
    var RecurringCharges: RecurringChargeList
    var CacheNodeType: String
    var OfferingType: String
    var UsagePrice: Double
    var ProductDescription: String
    var ReservedCacheNodesOfferingId: String
  }

  object ReservedCacheNodesOffering {
    def apply(
      Duration: js.UndefOr[Integer] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
    ): ReservedCacheNodesOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("FixedPrice" -> FixedPrice.map { x => x: js.Any }),
        ("RecurringCharges" -> RecurringCharges.map { x => x: js.Any }),
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("UsagePrice" -> UsagePrice.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("ReservedCacheNodesOfferingId" -> ReservedCacheNodesOfferingId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNodesOffering]
    }
  }

  /**
   * <p>Represents the output of a <i>DescribeReservedCacheNodesOfferings</i> action.</p>
   */
  @js.native
  trait ReservedCacheNodesOfferingMessage extends js.Object {
    var Marker: String
    var ReservedCacheNodesOfferings: ReservedCacheNodesOfferingList
  }

  object ReservedCacheNodesOfferingMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.undefined
    ): ReservedCacheNodesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ReservedCacheNodesOfferings" -> ReservedCacheNodesOfferings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedCacheNodesOfferingMessage]
    }
  }

  /**
   * <p>The requested cache node offering does not exist.</p>
   */
  @js.native
  trait ReservedCacheNodesOfferingNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Represents the input of a <i>ResetCacheParameterGroup</i> action.</p>
   */
  @js.native
  trait ResetCacheParameterGroupMessage extends js.Object {
    var CacheParameterGroupName: String
    var ResetAllParameters: Boolean
    var ParameterNameValues: ParameterNameValueList
  }

  object ResetCacheParameterGroupMessage {
    def apply(
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined,
      ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.undefined
    ): ResetCacheParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("ResetAllParameters" -> ResetAllParameters.map { x => x: js.Any }),
        ("ParameterNameValues" -> ParameterNameValues.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetCacheParameterGroupMessage]
    }
  }

  /**
   * <p>Represents the input of a <i>RevokeCacheSecurityGroupIngress</i> action.</p>
   */
  @js.native
  trait RevokeCacheSecurityGroupIngressMessage extends js.Object {
    var CacheSecurityGroupName: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object RevokeCacheSecurityGroupIngressMessage {
    def apply(
      CacheSecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): RevokeCacheSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroupName" -> CacheSecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeCacheSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: CacheSecurityGroup
  }

  object RevokeCacheSecurityGroupIngressResult {
    def apply(
      CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
    ): RevokeCacheSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheSecurityGroup" -> CacheSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeCacheSecurityGroupIngressResult]
    }
  }

  /**
   * <p>Represents a single cache security group and its status.</p>
   */
  @js.native
  trait SecurityGroupMembership extends js.Object {
    var SecurityGroupId: String
    var Status: String
  }

  object SecurityGroupMembership {
    def apply(
      SecurityGroupId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): SecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SecurityGroupId" -> SecurityGroupId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroupMembership]
    }
  }

  /**
   * <p>Represents a copy of an entire cache cluster as of the time when the snapshot was taken.</p>
   */
  @js.native
  trait Snapshot extends js.Object {
    var PreferredMaintenanceWindow: String
    var SnapshotSource: String
    var CacheParameterGroupName: String
    var Engine: String
    var SnapshotStatus: String
    var PreferredAvailabilityZone: String
    var NodeSnapshots: NodeSnapshotList
    var CacheClusterId: String
    var CacheClusterCreateTime: TStamp
    var CacheNodeType: String
    var SnapshotName: String
    var SnapshotWindow: String
    var AutoMinorVersionUpgrade: Boolean
    var EngineVersion: String
    var Port: IntegerOptional
    var CacheSubnetGroupName: String
    var NumCacheNodes: IntegerOptional
    var SnapshotRetentionLimit: IntegerOptional
    var TopicArn: String
    var VpcId: String
  }

  object Snapshot {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      SnapshotSource: js.UndefOr[String] = js.undefined,
      CacheParameterGroupName: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      SnapshotStatus: js.UndefOr[String] = js.undefined,
      PreferredAvailabilityZone: js.UndefOr[String] = js.undefined,
      NodeSnapshots: js.UndefOr[NodeSnapshotList] = js.undefined,
      CacheClusterId: js.UndefOr[String] = js.undefined,
      CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined,
      CacheNodeType: js.UndefOr[String] = js.undefined,
      SnapshotName: js.UndefOr[String] = js.undefined,
      SnapshotWindow: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      CacheSubnetGroupName: js.UndefOr[String] = js.undefined,
      NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
      SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
      TopicArn: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("SnapshotSource" -> SnapshotSource.map { x => x: js.Any }),
        ("CacheParameterGroupName" -> CacheParameterGroupName.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("SnapshotStatus" -> SnapshotStatus.map { x => x: js.Any }),
        ("PreferredAvailabilityZone" -> PreferredAvailabilityZone.map { x => x: js.Any }),
        ("NodeSnapshots" -> NodeSnapshots.map { x => x: js.Any }),
        ("CacheClusterId" -> CacheClusterId.map { x => x: js.Any }),
        ("CacheClusterCreateTime" -> CacheClusterCreateTime.map { x => x: js.Any }),
        ("CacheNodeType" -> CacheNodeType.map { x => x: js.Any }),
        ("SnapshotName" -> SnapshotName.map { x => x: js.Any }),
        ("SnapshotWindow" -> SnapshotWindow.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("CacheSubnetGroupName" -> CacheSubnetGroupName.map { x => x: js.Any }),
        ("NumCacheNodes" -> NumCacheNodes.map { x => x: js.Any }),
        ("SnapshotRetentionLimit" -> SnapshotRetentionLimit.map { x => x: js.Any }),
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Snapshot]
    }
  }

  /**
   * <p>You already have a snapshot with the given name.</p>
   */
  @js.native
  trait SnapshotAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p>You attempted one of the following actions:</p> <ul> <li> <p>Creating a snapshot of a Redis cache cluster running on a <i>t1.micro</i> cache node.</p> </li> <li> <p>Creating a snapshot of a cache cluster that is running Memcached rather than Redis.</p> </li> </ul> <p>Neither of these are supported by ElastiCache.</p>
   */
  @js.native
  trait SnapshotFeatureNotSupportedFaultException extends js.Object {

  }

  /**
   * <p>The requested snapshot name does not refer to an existing snapshot.</p>
   */
  @js.native
  trait SnapshotNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would exceed the maximum number of snapshots.</p>
   */
  @js.native
  trait SnapshotQuotaExceededFaultException extends js.Object {

  }


  object SourceTypeEnum {
    val `cache-cluster` = "cache-cluster"
    val `cache-parameter-group` = "cache-parameter-group"
    val `cache-security-group` = "cache-security-group"
    val `cache-subnet-group` = "cache-subnet-group"

    val values = IndexedSeq(`cache-cluster`, `cache-parameter-group`, `cache-security-group`, `cache-subnet-group`)
  }

  /**
   * <p>Represents the subnet associated with a cache cluster. This parameter refers to subnets defined in Amazon Virtual Private Cloud (Amazon VPC) and used with ElastiCache.</p>
   */
  @js.native
  trait Subnet extends js.Object {
    var SubnetIdentifier: String
    var SubnetAvailabilityZone: AvailabilityZone
  }

  object Subnet {
    def apply(
      SubnetIdentifier: js.UndefOr[String] = js.undefined,
      SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    ): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetIdentifier" -> SubnetIdentifier.map { x => x: js.Any }),
        ("SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p>The requested subnet is being used by another cache subnet group.</p>
   */
  @js.native
  trait SubnetInUseException extends js.Object {

  }

  /**
   * <p>A cost allocation Tag that can be added to an ElastiCache cluster or replication group. Tags are composed of a Key/Value pair. A tag with a null Value is permitted.</p>
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
   * <p>Represents the output from the <i>AddTagsToResource</i>, <i>ListTagsOnResource</i>, and <i>RemoveTagsFromResource</i> actions.</p>
   */
  @js.native
  trait TagListMessage extends js.Object {
    var TagList: TagList
  }

  object TagListMessage {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined
    ): TagListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagList" -> TagList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagListMessage]
    }
  }

  /**
   * <p>The requested tag was not found on this resource.</p>
   */
  @js.native
  trait TagNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The request cannot be processed because it would cause the resource to have more than the allowed number of tags. The maximum number of tags permitted on a resource is 10.</p>
   */
  @js.native
  trait TagQuotaPerResourceExceededException extends js.Object {

  }
}
