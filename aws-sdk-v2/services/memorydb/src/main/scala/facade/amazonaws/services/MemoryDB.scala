package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object memorydb {
  type ACLClusterNameList = js.Array[String]
  type ACLList = js.Array[ACL]
  type ACLName = String
  type ACLNameList = js.Array[ACLName]
  type AccessString = String
  type BooleanOptional = Boolean
  type ClusterList = js.Array[Cluster]
  type ClusterNameList = js.Array[String]
  type EngineVersionInfoList = js.Array[EngineVersionInfo]
  type EventList = js.Array[Event]
  type FilterList = js.Array[Filter]
  type FilterName = String
  type FilterValue = String
  type FilterValueList = js.Array[FilterValue]
  type IntegerOptional = Int
  type KeyList = js.Array[String]
  type KmsKeyId = String
  type NodeList = js.Array[Node]
  type NodeTypeList = js.Array[String]
  type ParameterGroupList = js.Array[ParameterGroup]
  type ParameterNameList = js.Array[String]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParametersList = js.Array[Parameter]
  type PasswordListInput = js.Array[String]
  type PendingModifiedServiceUpdateList = js.Array[PendingModifiedServiceUpdate]
  type SecurityGroupIdsList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type ServiceUpdateList = js.Array[ServiceUpdate]
  type ServiceUpdateStatusList = js.Array[ServiceUpdateStatus]
  type ShardDetails = js.Array[ShardDetail]
  type ShardList = js.Array[Shard]
  type SnapshotArnsList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SubnetGroupList = js.Array[SubnetGroup]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = js.Date
  type TagList = js.Array[Tag]
  type TargetBucket = String
  type UnprocessedClusterList = js.Array[UnprocessedCluster]
  type UserList = js.Array[User]
  type UserName = String
  type UserNameList = js.Array[UserName]
  type UserNameListInput = js.Array[UserName]

  final class MemoryDBOps(private val service: MemoryDB) extends AnyVal {

    @inline def batchUpdateClusterFuture(params: BatchUpdateClusterRequest): Future[BatchUpdateClusterResponse] = service.batchUpdateCluster(params).promise().toFuture
    @inline def copySnapshotFuture(params: CopySnapshotRequest): Future[CopySnapshotResponse] = service.copySnapshot(params).promise().toFuture
    @inline def createACLFuture(params: CreateACLRequest): Future[CreateACLResponse] = service.createACL(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] = service.createCluster(params).promise().toFuture
    @inline def createParameterGroupFuture(params: CreateParameterGroupRequest): Future[CreateParameterGroupResponse] = service.createParameterGroup(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotRequest): Future[CreateSnapshotResponse] = service.createSnapshot(params).promise().toFuture
    @inline def createSubnetGroupFuture(params: CreateSubnetGroupRequest): Future[CreateSubnetGroupResponse] = service.createSubnetGroup(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def deleteACLFuture(params: DeleteACLRequest): Future[DeleteACLResponse] = service.deleteACL(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] = service.deleteCluster(params).promise().toFuture
    @inline def deleteParameterGroupFuture(params: DeleteParameterGroupRequest): Future[DeleteParameterGroupResponse] = service.deleteParameterGroup(params).promise().toFuture
    @inline def deleteSnapshotFuture(params: DeleteSnapshotRequest): Future[DeleteSnapshotResponse] = service.deleteSnapshot(params).promise().toFuture
    @inline def deleteSubnetGroupFuture(params: DeleteSubnetGroupRequest): Future[DeleteSubnetGroupResponse] = service.deleteSubnetGroup(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] = service.deleteUser(params).promise().toFuture
    @inline def describeACLsFuture(params: DescribeACLsRequest): Future[DescribeACLsResponse] = service.describeACLs(params).promise().toFuture
    @inline def describeClustersFuture(params: DescribeClustersRequest): Future[DescribeClustersResponse] = service.describeClusters(params).promise().toFuture
    @inline def describeEngineVersionsFuture(params: DescribeEngineVersionsRequest): Future[DescribeEngineVersionsResponse] = service.describeEngineVersions(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsRequest): Future[DescribeEventsResponse] = service.describeEvents(params).promise().toFuture
    @inline def describeParameterGroupsFuture(params: DescribeParameterGroupsRequest): Future[DescribeParameterGroupsResponse] = service.describeParameterGroups(params).promise().toFuture
    @inline def describeParametersFuture(params: DescribeParametersRequest): Future[DescribeParametersResponse] = service.describeParameters(params).promise().toFuture
    @inline def describeServiceUpdatesFuture(params: DescribeServiceUpdatesRequest): Future[DescribeServiceUpdatesResponse] = service.describeServiceUpdates(params).promise().toFuture
    @inline def describeSnapshotsFuture(params: DescribeSnapshotsRequest): Future[DescribeSnapshotsResponse] = service.describeSnapshots(params).promise().toFuture
    @inline def describeSubnetGroupsFuture(params: DescribeSubnetGroupsRequest): Future[DescribeSubnetGroupsResponse] = service.describeSubnetGroups(params).promise().toFuture
    @inline def describeUsersFuture(params: DescribeUsersRequest): Future[DescribeUsersResponse] = service.describeUsers(params).promise().toFuture
    @inline def failoverShardFuture(params: FailoverShardRequest): Future[FailoverShardResponse] = service.failoverShard(params).promise().toFuture
    @inline def listAllowedNodeTypeUpdatesFuture(params: ListAllowedNodeTypeUpdatesRequest): Future[ListAllowedNodeTypeUpdatesResponse] = service.listAllowedNodeTypeUpdates(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise().toFuture
    @inline def resetParameterGroupFuture(params: ResetParameterGroupRequest): Future[ResetParameterGroupResponse] = service.resetParameterGroup(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateACLFuture(params: UpdateACLRequest): Future[UpdateACLResponse] = service.updateACL(params).promise().toFuture
    @inline def updateClusterFuture(params: UpdateClusterRequest): Future[UpdateClusterResponse] = service.updateCluster(params).promise().toFuture
    @inline def updateParameterGroupFuture(params: UpdateParameterGroupRequest): Future[UpdateParameterGroupResponse] = service.updateParameterGroup(params).promise().toFuture
    @inline def updateSubnetGroupFuture(params: UpdateSubnetGroupRequest): Future[UpdateSubnetGroupResponse] = service.updateSubnetGroup(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/memorydb", JSImport.Namespace, "AWS.MemoryDB")
  class MemoryDB() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchUpdateCluster(params: BatchUpdateClusterRequest): Request[BatchUpdateClusterResponse] = js.native
    def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResponse] = js.native
    def createACL(params: CreateACLRequest): Request[CreateACLResponse] = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createParameterGroup(params: CreateParameterGroupRequest): Request[CreateParameterGroupResponse] = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResponse] = js.native
    def createSubnetGroup(params: CreateSubnetGroupRequest): Request[CreateSubnetGroupResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteACL(params: DeleteACLRequest): Request[DeleteACLResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteParameterGroup(params: DeleteParameterGroupRequest): Request[DeleteParameterGroupResponse] = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResponse] = js.native
    def deleteSubnetGroup(params: DeleteSubnetGroupRequest): Request[DeleteSubnetGroupResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse] = js.native
    def describeACLs(params: DescribeACLsRequest): Request[DescribeACLsResponse] = js.native
    def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse] = js.native
    def describeEngineVersions(params: DescribeEngineVersionsRequest): Request[DescribeEngineVersionsResponse] = js.native
    def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse] = js.native
    def describeParameterGroups(params: DescribeParameterGroupsRequest): Request[DescribeParameterGroupsResponse] = js.native
    def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResponse] = js.native
    def describeServiceUpdates(params: DescribeServiceUpdatesRequest): Request[DescribeServiceUpdatesResponse] = js.native
    def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResponse] = js.native
    def describeSubnetGroups(params: DescribeSubnetGroupsRequest): Request[DescribeSubnetGroupsResponse] = js.native
    def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResponse] = js.native
    def failoverShard(params: FailoverShardRequest): Request[FailoverShardResponse] = js.native
    def listAllowedNodeTypeUpdates(params: ListAllowedNodeTypeUpdatesRequest): Request[ListAllowedNodeTypeUpdatesResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def resetParameterGroup(params: ResetParameterGroupRequest): Request[ResetParameterGroupResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateACL(params: UpdateACLRequest): Request[UpdateACLResponse] = js.native
    def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResponse] = js.native
    def updateParameterGroup(params: UpdateParameterGroupRequest): Request[UpdateParameterGroupResponse] = js.native
    def updateSubnetGroup(params: UpdateSubnetGroupRequest): Request[UpdateSubnetGroupResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }
  object MemoryDB {
    @inline implicit def toOps(service: MemoryDB): MemoryDBOps = {
      new MemoryDBOps(service)
    }
  }

  /** An Access Control List. You can authenticate users with Access Contol Lists. ACLs enable you to control cluster access by grouping users. These Access control lists are designed as a way to organize access to clusters.
    */
  @js.native
  trait ACL extends js.Object {
    var ARN: js.UndefOr[String]
    var Clusters: js.UndefOr[ACLClusterNameList]
    var MinimumEngineVersion: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var PendingChanges: js.UndefOr[ACLPendingChanges]
    var Status: js.UndefOr[String]
    var UserNames: js.UndefOr[UserNameList]
  }

  object ACL {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        Clusters: js.UndefOr[ACLClusterNameList] = js.undefined,
        MinimumEngineVersion: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        PendingChanges: js.UndefOr[ACLPendingChanges] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        UserNames: js.UndefOr[UserNameList] = js.undefined
    ): ACL = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Clusters.foreach(__v => __obj.updateDynamic("Clusters")(__v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.updateDynamic("MinimumEngineVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PendingChanges.foreach(__v => __obj.updateDynamic("PendingChanges")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserNames.foreach(__v => __obj.updateDynamic("UserNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ACL]
    }
  }

  /** Returns the updates being applied to the ACL.
    */
  @js.native
  trait ACLPendingChanges extends js.Object {
    var UserNamesToAdd: js.UndefOr[UserNameList]
    var UserNamesToRemove: js.UndefOr[UserNameList]
  }

  object ACLPendingChanges {
    @inline
    def apply(
        UserNamesToAdd: js.UndefOr[UserNameList] = js.undefined,
        UserNamesToRemove: js.UndefOr[UserNameList] = js.undefined
    ): ACLPendingChanges = {
      val __obj = js.Dynamic.literal()
      UserNamesToAdd.foreach(__v => __obj.updateDynamic("UserNamesToAdd")(__v.asInstanceOf[js.Any]))
      UserNamesToRemove.foreach(__v => __obj.updateDynamic("UserNamesToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ACLPendingChanges]
    }
  }

  /** The status of the ACL update
    */
  @js.native
  trait ACLsUpdateStatus extends js.Object {
    var ACLToApply: js.UndefOr[ACLName]
  }

  object ACLsUpdateStatus {
    @inline
    def apply(
        ACLToApply: js.UndefOr[ACLName] = js.undefined
    ): ACLsUpdateStatus = {
      val __obj = js.Dynamic.literal()
      ACLToApply.foreach(__v => __obj.updateDynamic("ACLToApply")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ACLsUpdateStatus]
    }
  }

  /** Denotes the user's authentication properties, such as whether it requires a password to authenticate. Used in output responses.
    */
  @js.native
  trait Authentication extends js.Object {
    var PasswordCount: js.UndefOr[IntegerOptional]
    var Type: js.UndefOr[AuthenticationType]
  }

  object Authentication {
    @inline
    def apply(
        PasswordCount: js.UndefOr[IntegerOptional] = js.undefined,
        Type: js.UndefOr[AuthenticationType] = js.undefined
    ): Authentication = {
      val __obj = js.Dynamic.literal()
      PasswordCount.foreach(__v => __obj.updateDynamic("PasswordCount")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Authentication]
    }
  }

  /** Denotes the user's authentication properties, such as whether it requires a password to authenticate. Used in output responses.
    */
  @js.native
  trait AuthenticationMode extends js.Object {
    var Passwords: js.UndefOr[PasswordListInput]
    var Type: js.UndefOr[InputAuthenticationType]
  }

  object AuthenticationMode {
    @inline
    def apply(
        Passwords: js.UndefOr[PasswordListInput] = js.undefined,
        Type: js.UndefOr[InputAuthenticationType] = js.undefined
    ): AuthenticationMode = {
      val __obj = js.Dynamic.literal()
      Passwords.foreach(__v => __obj.updateDynamic("Passwords")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticationMode]
    }
  }

  /** Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
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
  trait BatchUpdateClusterRequest extends js.Object {
    var ClusterNames: ClusterNameList
    var ServiceUpdate: js.UndefOr[ServiceUpdateRequest]
  }

  object BatchUpdateClusterRequest {
    @inline
    def apply(
        ClusterNames: ClusterNameList,
        ServiceUpdate: js.UndefOr[ServiceUpdateRequest] = js.undefined
    ): BatchUpdateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterNames" -> ClusterNames.asInstanceOf[js.Any]
      )

      ServiceUpdate.foreach(__v => __obj.updateDynamic("ServiceUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateClusterRequest]
    }
  }

  @js.native
  trait BatchUpdateClusterResponse extends js.Object {
    var ProcessedClusters: js.UndefOr[ClusterList]
    var UnprocessedClusters: js.UndefOr[UnprocessedClusterList]
  }

  object BatchUpdateClusterResponse {
    @inline
    def apply(
        ProcessedClusters: js.UndefOr[ClusterList] = js.undefined,
        UnprocessedClusters: js.UndefOr[UnprocessedClusterList] = js.undefined
    ): BatchUpdateClusterResponse = {
      val __obj = js.Dynamic.literal()
      ProcessedClusters.foreach(__v => __obj.updateDynamic("ProcessedClusters")(__v.asInstanceOf[js.Any]))
      UnprocessedClusters.foreach(__v => __obj.updateDynamic("UnprocessedClusters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateClusterResponse]
    }
  }

  /** Contains all of the attributes of a specific cluster.
    */
  @js.native
  trait Cluster extends js.Object {
    var ACLName: js.UndefOr[ACLName]
    var ARN: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityMode: js.UndefOr[AZStatus]
    var ClusterEndpoint: js.UndefOr[Endpoint]
    var Description: js.UndefOr[String]
    var EnginePatchVersion: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MaintenanceWindow: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var NumberOfShards: js.UndefOr[IntegerOptional]
    var ParameterGroupName: js.UndefOr[String]
    var ParameterGroupStatus: js.UndefOr[String]
    var PendingUpdates: js.UndefOr[ClusterPendingUpdates]
    var SecurityGroups: js.UndefOr[SecurityGroupMembershipList]
    var Shards: js.UndefOr[ShardList]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var SnsTopicStatus: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var SubnetGroupName: js.UndefOr[String]
    var TLSEnabled: js.UndefOr[BooleanOptional]
  }

  object Cluster {
    @inline
    def apply(
        ACLName: js.UndefOr[ACLName] = js.undefined,
        ARN: js.UndefOr[String] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityMode: js.UndefOr[AZStatus] = js.undefined,
        ClusterEndpoint: js.UndefOr[Endpoint] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        EnginePatchVersion: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MaintenanceWindow: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumberOfShards: js.UndefOr[IntegerOptional] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        ParameterGroupStatus: js.UndefOr[String] = js.undefined,
        PendingUpdates: js.UndefOr[ClusterPendingUpdates] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined,
        Shards: js.UndefOr[ShardList] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SnsTopicStatus: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        SubnetGroupName: js.UndefOr[String] = js.undefined,
        TLSEnabled: js.UndefOr[BooleanOptional] = js.undefined
    ): Cluster = {
      val __obj = js.Dynamic.literal()
      ACLName.foreach(__v => __obj.updateDynamic("ACLName")(__v.asInstanceOf[js.Any]))
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityMode.foreach(__v => __obj.updateDynamic("AvailabilityMode")(__v.asInstanceOf[js.Any]))
      ClusterEndpoint.foreach(__v => __obj.updateDynamic("ClusterEndpoint")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnginePatchVersion.foreach(__v => __obj.updateDynamic("EnginePatchVersion")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MaintenanceWindow.foreach(__v => __obj.updateDynamic("MaintenanceWindow")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfShards.foreach(__v => __obj.updateDynamic("NumberOfShards")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      ParameterGroupStatus.foreach(__v => __obj.updateDynamic("ParameterGroupStatus")(__v.asInstanceOf[js.Any]))
      PendingUpdates.foreach(__v => __obj.updateDynamic("PendingUpdates")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      Shards.foreach(__v => __obj.updateDynamic("Shards")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SnsTopicStatus.foreach(__v => __obj.updateDynamic("SnsTopicStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubnetGroupName.foreach(__v => __obj.updateDynamic("SubnetGroupName")(__v.asInstanceOf[js.Any]))
      TLSEnabled.foreach(__v => __obj.updateDynamic("TLSEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  /** A list of cluster configuration options.
    */
  @js.native
  trait ClusterConfiguration extends js.Object {
    var Description: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var MaintenanceWindow: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var NumShards: js.UndefOr[IntegerOptional]
    var ParameterGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var Shards: js.UndefOr[ShardDetails]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var SubnetGroupName: js.UndefOr[String]
    var TopicArn: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object ClusterConfiguration {
    @inline
    def apply(
        Description: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MaintenanceWindow: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        NumShards: js.UndefOr[IntegerOptional] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        Shards: js.UndefOr[ShardDetails] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        SubnetGroupName: js.UndefOr[String] = js.undefined,
        TopicArn: js.UndefOr[String] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): ClusterConfiguration = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      MaintenanceWindow.foreach(__v => __obj.updateDynamic("MaintenanceWindow")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumShards.foreach(__v => __obj.updateDynamic("NumShards")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Shards.foreach(__v => __obj.updateDynamic("Shards")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      SubnetGroupName.foreach(__v => __obj.updateDynamic("SubnetGroupName")(__v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterConfiguration]
    }
  }

  /** A list of updates being applied to the cluster
    */
  @js.native
  trait ClusterPendingUpdates extends js.Object {
    var ACLs: js.UndefOr[ACLsUpdateStatus]
    var Resharding: js.UndefOr[ReshardingStatus]
    var ServiceUpdates: js.UndefOr[PendingModifiedServiceUpdateList]
  }

  object ClusterPendingUpdates {
    @inline
    def apply(
        ACLs: js.UndefOr[ACLsUpdateStatus] = js.undefined,
        Resharding: js.UndefOr[ReshardingStatus] = js.undefined,
        ServiceUpdates: js.UndefOr[PendingModifiedServiceUpdateList] = js.undefined
    ): ClusterPendingUpdates = {
      val __obj = js.Dynamic.literal()
      ACLs.foreach(__v => __obj.updateDynamic("ACLs")(__v.asInstanceOf[js.Any]))
      Resharding.foreach(__v => __obj.updateDynamic("Resharding")(__v.asInstanceOf[js.Any]))
      ServiceUpdates.foreach(__v => __obj.updateDynamic("ServiceUpdates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterPendingUpdates]
    }
  }

  @js.native
  trait CopySnapshotRequest extends js.Object {
    var SourceSnapshotName: String
    var TargetSnapshotName: String
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagList]
    var TargetBucket: js.UndefOr[TargetBucket]
  }

  object CopySnapshotRequest {
    @inline
    def apply(
        SourceSnapshotName: String,
        TargetSnapshotName: String,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TargetBucket: js.UndefOr[TargetBucket] = js.undefined
    ): CopySnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "SourceSnapshotName" -> SourceSnapshotName.asInstanceOf[js.Any],
        "TargetSnapshotName" -> TargetSnapshotName.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetBucket.foreach(__v => __obj.updateDynamic("TargetBucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopySnapshotRequest]
    }
  }

  @js.native
  trait CopySnapshotResponse extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CopySnapshotResponse {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CopySnapshotResponse = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopySnapshotResponse]
    }
  }

  @js.native
  trait CreateACLRequest extends js.Object {
    var ACLName: String
    var Tags: js.UndefOr[TagList]
    var UserNames: js.UndefOr[UserNameListInput]
  }

  object CreateACLRequest {
    @inline
    def apply(
        ACLName: String,
        Tags: js.UndefOr[TagList] = js.undefined,
        UserNames: js.UndefOr[UserNameListInput] = js.undefined
    ): CreateACLRequest = {
      val __obj = js.Dynamic.literal(
        "ACLName" -> ACLName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserNames.foreach(__v => __obj.updateDynamic("UserNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateACLRequest]
    }
  }

  @js.native
  trait CreateACLResponse extends js.Object {
    var ACL: js.UndefOr[ACL]
  }

  object CreateACLResponse {
    @inline
    def apply(
        ACL: js.UndefOr[ACL] = js.undefined
    ): CreateACLResponse = {
      val __obj = js.Dynamic.literal()
      ACL.foreach(__v => __obj.updateDynamic("ACL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateACLResponse]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var ACLName: ACLName
    var ClusterName: String
    var NodeType: String
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var Description: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MaintenanceWindow: js.UndefOr[String]
    var NumReplicasPerShard: js.UndefOr[IntegerOptional]
    var NumShards: js.UndefOr[IntegerOptional]
    var ParameterGroupName: js.UndefOr[String]
    var Port: js.UndefOr[IntegerOptional]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var SnapshotArns: js.UndefOr[SnapshotArnsList]
    var SnapshotName: js.UndefOr[String]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var SubnetGroupName: js.UndefOr[String]
    var TLSEnabled: js.UndefOr[BooleanOptional]
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterRequest {
    @inline
    def apply(
        ACLName: ACLName,
        ClusterName: String,
        NodeType: String,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MaintenanceWindow: js.UndefOr[String] = js.undefined,
        NumReplicasPerShard: js.UndefOr[IntegerOptional] = js.undefined,
        NumShards: js.UndefOr[IntegerOptional] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
        SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined,
        SnapshotName: js.UndefOr[String] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SubnetGroupName: js.UndefOr[String] = js.undefined,
        TLSEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ACLName" -> ACLName.asInstanceOf[js.Any],
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "NodeType" -> NodeType.asInstanceOf[js.Any]
      )

      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MaintenanceWindow.foreach(__v => __obj.updateDynamic("MaintenanceWindow")(__v.asInstanceOf[js.Any]))
      NumReplicasPerShard.foreach(__v => __obj.updateDynamic("NumReplicasPerShard")(__v.asInstanceOf[js.Any]))
      NumShards.foreach(__v => __obj.updateDynamic("NumShards")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SnapshotArns.foreach(__v => __obj.updateDynamic("SnapshotArns")(__v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.updateDynamic("SnapshotName")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SubnetGroupName.foreach(__v => __obj.updateDynamic("SubnetGroupName")(__v.asInstanceOf[js.Any]))
      TLSEnabled.foreach(__v => __obj.updateDynamic("TLSEnabled")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait CreateParameterGroupRequest extends js.Object {
    var Family: String
    var ParameterGroupName: String
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateParameterGroupRequest {
    @inline
    def apply(
        Family: String,
        ParameterGroupName: String,
        Description: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateParameterGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Family" -> Family.asInstanceOf[js.Any],
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateParameterGroupRequest]
    }
  }

  @js.native
  trait CreateParameterGroupResponse extends js.Object {
    var ParameterGroup: js.UndefOr[ParameterGroup]
  }

  object CreateParameterGroupResponse {
    @inline
    def apply(
        ParameterGroup: js.UndefOr[ParameterGroup] = js.undefined
    ): CreateParameterGroupResponse = {
      val __obj = js.Dynamic.literal()
      ParameterGroup.foreach(__v => __obj.updateDynamic("ParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateParameterGroupResponse]
    }
  }

  @js.native
  trait CreateSnapshotRequest extends js.Object {
    var ClusterName: String
    var SnapshotName: String
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSnapshotRequest {
    @inline
    def apply(
        ClusterName: String,
        SnapshotName: String,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "SnapshotName" -> SnapshotName.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotRequest]
    }
  }

  @js.native
  trait CreateSnapshotResponse extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CreateSnapshotResponse {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CreateSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotResponse]
    }
  }

  @js.native
  trait CreateSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSubnetGroupRequest {
    @inline
    def apply(
        SubnetGroupName: String,
        SubnetIds: SubnetIdentifierList,
        Description: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateSubnetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetGroupName" -> SubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubnetGroupRequest]
    }
  }

  @js.native
  trait CreateSubnetGroupResponse extends js.Object {
    var SubnetGroup: js.UndefOr[SubnetGroup]
  }

  object CreateSubnetGroupResponse {
    @inline
    def apply(
        SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined
    ): CreateSubnetGroupResponse = {
      val __obj = js.Dynamic.literal()
      SubnetGroup.foreach(__v => __obj.updateDynamic("SubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubnetGroupResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var AccessString: AccessString
    var AuthenticationMode: AuthenticationMode
    var UserName: UserName
    var Tags: js.UndefOr[TagList]
  }

  object CreateUserRequest {
    @inline
    def apply(
        AccessString: AccessString,
        AuthenticationMode: AuthenticationMode,
        UserName: UserName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccessString" -> AccessString.asInstanceOf[js.Any],
        "AuthenticationMode" -> AuthenticationMode.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object CreateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteACLRequest extends js.Object {
    var ACLName: String
  }

  object DeleteACLRequest {
    @inline
    def apply(
        ACLName: String
    ): DeleteACLRequest = {
      val __obj = js.Dynamic.literal(
        "ACLName" -> ACLName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteACLRequest]
    }
  }

  @js.native
  trait DeleteACLResponse extends js.Object {
    var ACL: js.UndefOr[ACL]
  }

  object DeleteACLResponse {
    @inline
    def apply(
        ACL: js.UndefOr[ACL] = js.undefined
    ): DeleteACLResponse = {
      val __obj = js.Dynamic.literal()
      ACL.foreach(__v => __obj.updateDynamic("ACL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteACLResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterName: String
    var FinalSnapshotName: js.UndefOr[String]
  }

  object DeleteClusterRequest {
    @inline
    def apply(
        ClusterName: String,
        FinalSnapshotName: js.UndefOr[String] = js.undefined
    ): DeleteClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any]
      )

      FinalSnapshotName.foreach(__v => __obj.updateDynamic("FinalSnapshotName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DeleteParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
  }

  object DeleteParameterGroupRequest {
    @inline
    def apply(
        ParameterGroupName: String
    ): DeleteParameterGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteParameterGroupRequest]
    }
  }

  @js.native
  trait DeleteParameterGroupResponse extends js.Object {
    var ParameterGroup: js.UndefOr[ParameterGroup]
  }

  object DeleteParameterGroupResponse {
    @inline
    def apply(
        ParameterGroup: js.UndefOr[ParameterGroup] = js.undefined
    ): DeleteParameterGroupResponse = {
      val __obj = js.Dynamic.literal()
      ParameterGroup.foreach(__v => __obj.updateDynamic("ParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteParameterGroupResponse]
    }
  }

  @js.native
  trait DeleteSnapshotRequest extends js.Object {
    var SnapshotName: String
  }

  object DeleteSnapshotRequest {
    @inline
    def apply(
        SnapshotName: String
    ): DeleteSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "SnapshotName" -> SnapshotName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSnapshotRequest]
    }
  }

  @js.native
  trait DeleteSnapshotResponse extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object DeleteSnapshotResponse {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): DeleteSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSnapshotResponse]
    }
  }

  @js.native
  trait DeleteSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
  }

  object DeleteSubnetGroupRequest {
    @inline
    def apply(
        SubnetGroupName: String
    ): DeleteSubnetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetGroupName" -> SubnetGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSubnetGroupRequest]
    }
  }

  @js.native
  trait DeleteSubnetGroupResponse extends js.Object {
    var SubnetGroup: js.UndefOr[SubnetGroup]
  }

  object DeleteSubnetGroupResponse {
    @inline
    def apply(
        SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined
    ): DeleteSubnetGroupResponse = {
      val __obj = js.Dynamic.literal()
      SubnetGroup.foreach(__v => __obj.updateDynamic("SubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSubnetGroupResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var UserName: UserName
  }

  object DeleteUserRequest {
    @inline
    def apply(
        UserName: UserName
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object DeleteUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): DeleteUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserResponse]
    }
  }

  @js.native
  trait DescribeACLsRequest extends js.Object {
    var ACLName: js.UndefOr[String]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
  }

  object DescribeACLsRequest {
    @inline
    def apply(
        ACLName: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeACLsRequest = {
      val __obj = js.Dynamic.literal()
      ACLName.foreach(__v => __obj.updateDynamic("ACLName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeACLsRequest]
    }
  }

  @js.native
  trait DescribeACLsResponse extends js.Object {
    var ACLs: js.UndefOr[ACLList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeACLsResponse {
    @inline
    def apply(
        ACLs: js.UndefOr[ACLList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeACLsResponse = {
      val __obj = js.Dynamic.literal()
      ACLs.foreach(__v => __obj.updateDynamic("ACLs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeACLsResponse]
    }
  }

  @js.native
  trait DescribeClustersRequest extends js.Object {
    var ClusterName: js.UndefOr[String]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var ShowShardDetails: js.UndefOr[BooleanOptional]
  }

  object DescribeClustersRequest {
    @inline
    def apply(
        ClusterName: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ShowShardDetails: js.UndefOr[BooleanOptional] = js.undefined
    ): DescribeClustersRequest = {
      val __obj = js.Dynamic.literal()
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ShowShardDetails.foreach(__v => __obj.updateDynamic("ShowShardDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersRequest]
    }
  }

  @js.native
  trait DescribeClustersResponse extends js.Object {
    var Clusters: js.UndefOr[ClusterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeClustersResponse {
    @inline
    def apply(
        Clusters: js.UndefOr[ClusterList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeClustersResponse = {
      val __obj = js.Dynamic.literal()
      Clusters.foreach(__v => __obj.updateDynamic("Clusters")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersResponse]
    }
  }

  @js.native
  trait DescribeEngineVersionsRequest extends js.Object {
    var DefaultOnly: js.UndefOr[Boolean]
    var EngineVersion: js.UndefOr[String]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var ParameterGroupFamily: js.UndefOr[String]
  }

  object DescribeEngineVersionsRequest {
    @inline
    def apply(
        DefaultOnly: js.UndefOr[Boolean] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ParameterGroupFamily: js.UndefOr[String] = js.undefined
    ): DescribeEngineVersionsRequest = {
      val __obj = js.Dynamic.literal()
      DefaultOnly.foreach(__v => __obj.updateDynamic("DefaultOnly")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParameterGroupFamily.foreach(__v => __obj.updateDynamic("ParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineVersionsRequest]
    }
  }

  @js.native
  trait DescribeEngineVersionsResponse extends js.Object {
    var EngineVersions: js.UndefOr[EngineVersionInfoList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEngineVersionsResponse {
    @inline
    def apply(
        EngineVersions: js.UndefOr[EngineVersionInfoList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeEngineVersionsResponse = {
      val __obj = js.Dynamic.literal()
      EngineVersions.foreach(__v => __obj.updateDynamic("EngineVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngineVersionsResponse]
    }
  }

  @js.native
  trait DescribeEventsRequest extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var EndTime: js.UndefOr[TStamp]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var SourceName: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var StartTime: js.UndefOr[TStamp]
  }

  object DescribeEventsRequest {
    @inline
    def apply(
        Duration: js.UndefOr[IntegerOptional] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SourceName: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined
    ): DescribeEventsRequest = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SourceName.foreach(__v => __obj.updateDynamic("SourceName")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsRequest]
    }
  }

  @js.native
  trait DescribeEventsResponse extends js.Object {
    var Events: js.UndefOr[EventList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEventsResponse {
    @inline
    def apply(
        Events: js.UndefOr[EventList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeEventsResponse = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsResponse]
    }
  }

  @js.native
  trait DescribeParameterGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
  }

  object DescribeParameterGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined
    ): DescribeParameterGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParameterGroupsRequest]
    }
  }

  @js.native
  trait DescribeParameterGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ParameterGroups: js.UndefOr[ParameterGroupList]
  }

  object DescribeParameterGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
    ): DescribeParameterGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParameterGroups.foreach(__v => __obj.updateDynamic("ParameterGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParameterGroupsResponse]
    }
  }

  @js.native
  trait DescribeParametersRequest extends js.Object {
    var ParameterGroupName: String
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
  }

  object DescribeParametersRequest {
    @inline
    def apply(
        ParameterGroupName: String,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeParametersRequest = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParametersRequest]
    }
  }

  @js.native
  trait DescribeParametersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Parameters: js.UndefOr[ParametersList]
  }

  object DescribeParametersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParametersList] = js.undefined
    ): DescribeParametersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParametersResponse]
    }
  }

  @js.native
  trait DescribeServiceUpdatesRequest extends js.Object {
    var ClusterNames: js.UndefOr[ClusterNameList]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var ServiceUpdateName: js.UndefOr[String]
    var Status: js.UndefOr[ServiceUpdateStatusList]
  }

  object DescribeServiceUpdatesRequest {
    @inline
    def apply(
        ClusterNames: js.UndefOr[ClusterNameList] = js.undefined,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ServiceUpdateName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ServiceUpdateStatusList] = js.undefined
    ): DescribeServiceUpdatesRequest = {
      val __obj = js.Dynamic.literal()
      ClusterNames.foreach(__v => __obj.updateDynamic("ClusterNames")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceUpdatesRequest]
    }
  }

  @js.native
  trait DescribeServiceUpdatesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ServiceUpdates: js.UndefOr[ServiceUpdateList]
  }

  object DescribeServiceUpdatesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ServiceUpdates: js.UndefOr[ServiceUpdateList] = js.undefined
    ): DescribeServiceUpdatesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceUpdates.foreach(__v => __obj.updateDynamic("ServiceUpdates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceUpdatesResponse]
    }
  }

  @js.native
  trait DescribeSnapshotsRequest extends js.Object {
    var ClusterName: js.UndefOr[String]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var ShowDetail: js.UndefOr[BooleanOptional]
    var SnapshotName: js.UndefOr[String]
    var Source: js.UndefOr[String]
  }

  object DescribeSnapshotsRequest {
    @inline
    def apply(
        ClusterName: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ShowDetail: js.UndefOr[BooleanOptional] = js.undefined,
        SnapshotName: js.UndefOr[String] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): DescribeSnapshotsRequest = {
      val __obj = js.Dynamic.literal()
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ShowDetail.foreach(__v => __obj.updateDynamic("ShowDetail")(__v.asInstanceOf[js.Any]))
      SnapshotName.foreach(__v => __obj.updateDynamic("SnapshotName")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsRequest]
    }
  }

  @js.native
  trait DescribeSnapshotsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Snapshots: js.UndefOr[SnapshotList]
  }

  object DescribeSnapshotsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Snapshots: js.UndefOr[SnapshotList] = js.undefined
    ): DescribeSnapshotsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Snapshots.foreach(__v => __obj.updateDynamic("Snapshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsResponse]
    }
  }

  @js.native
  trait DescribeSubnetGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var SubnetGroupName: js.UndefOr[String]
  }

  object DescribeSubnetGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SubnetGroupName: js.UndefOr[String] = js.undefined
    ): DescribeSubnetGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SubnetGroupName.foreach(__v => __obj.updateDynamic("SubnetGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubnetGroupsRequest]
    }
  }

  @js.native
  trait DescribeSubnetGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SubnetGroups: js.UndefOr[SubnetGroupList]
  }

  object DescribeSubnetGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        SubnetGroups: js.UndefOr[SubnetGroupList] = js.undefined
    ): DescribeSubnetGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SubnetGroups.foreach(__v => __obj.updateDynamic("SubnetGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubnetGroupsResponse]
    }
  }

  @js.native
  trait DescribeUsersRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var UserName: js.UndefOr[UserName]
  }

  object DescribeUsersRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): DescribeUsersRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUsersRequest]
    }
  }

  @js.native
  trait DescribeUsersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Users: js.UndefOr[UserList]
  }

  object DescribeUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Users: js.UndefOr[UserList] = js.undefined
    ): DescribeUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUsersResponse]
    }
  }

  /** Represents the information required for client programs to connect to the cluster and its nodes.
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

  /** Provides details of the Redis engine version
    */
  @js.native
  trait EngineVersionInfo extends js.Object {
    var EnginePatchVersion: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var ParameterGroupFamily: js.UndefOr[String]
  }

  object EngineVersionInfo {
    @inline
    def apply(
        EnginePatchVersion: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        ParameterGroupFamily: js.UndefOr[String] = js.undefined
    ): EngineVersionInfo = {
      val __obj = js.Dynamic.literal()
      EnginePatchVersion.foreach(__v => __obj.updateDynamic("EnginePatchVersion")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      ParameterGroupFamily.foreach(__v => __obj.updateDynamic("ParameterGroupFamily")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineVersionInfo]
    }
  }

  /** Represents a single occurrence of something interesting within the system. Some examples of events are creating a cluster or adding or removing a node.
    */
  @js.native
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var Message: js.UndefOr[String]
    var SourceName: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  object Event {
    @inline
    def apply(
        Date: js.UndefOr[TStamp] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        SourceName: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      SourceName.foreach(__v => __obj.updateDynamic("SourceName")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  @js.native
  trait FailoverShardRequest extends js.Object {
    var ClusterName: String
    var ShardName: String
  }

  object FailoverShardRequest {
    @inline
    def apply(
        ClusterName: String,
        ShardName: String
    ): FailoverShardRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "ShardName" -> ShardName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FailoverShardRequest]
    }
  }

  @js.native
  trait FailoverShardResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object FailoverShardResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): FailoverShardResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailoverShardResponse]
    }
  }

  /** Used to streamline results of a search based on the property being filtered.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: FilterName
    var Values: FilterValueList
  }

  object Filter {
    @inline
    def apply(
        Name: FilterName,
        Values: FilterValueList
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait ListAllowedNodeTypeUpdatesRequest extends js.Object {
    var ClusterName: String
  }

  object ListAllowedNodeTypeUpdatesRequest {
    @inline
    def apply(
        ClusterName: String
    ): ListAllowedNodeTypeUpdatesRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListAllowedNodeTypeUpdatesRequest]
    }
  }

  @js.native
  trait ListAllowedNodeTypeUpdatesResponse extends js.Object {
    var ScaleDownNodeTypes: js.UndefOr[NodeTypeList]
    var ScaleUpNodeTypes: js.UndefOr[NodeTypeList]
  }

  object ListAllowedNodeTypeUpdatesResponse {
    @inline
    def apply(
        ScaleDownNodeTypes: js.UndefOr[NodeTypeList] = js.undefined,
        ScaleUpNodeTypes: js.UndefOr[NodeTypeList] = js.undefined
    ): ListAllowedNodeTypeUpdatesResponse = {
      val __obj = js.Dynamic.literal()
      ScaleDownNodeTypes.foreach(__v => __obj.updateDynamic("ScaleDownNodeTypes")(__v.asInstanceOf[js.Any]))
      ScaleUpNodeTypes.foreach(__v => __obj.updateDynamic("ScaleUpNodeTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAllowedNodeTypeUpdatesResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsRequest {
    @inline
    def apply(
        ResourceArn: String
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  /** Represents an individual node within a cluster. Each node runs its own instance of the cluster's protocol-compliant caching software.
    */
  @js.native
  trait Node extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var CreateTime: js.UndefOr[TStamp]
    var Endpoint: js.UndefOr[Endpoint]
    var Name: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object Node {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        CreateTime: js.UndefOr[TStamp] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): Node = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Node]
    }
  }

  /** Describes an individual setting that controls some aspect of MemoryDB behavior.
    */
  @js.native
  trait Parameter extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var DataType: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var MinimumEngineVersion: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Parameter {
    @inline
    def apply(
        AllowedValues: js.UndefOr[String] = js.undefined,
        DataType: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        MinimumEngineVersion: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Parameter = {
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.updateDynamic("MinimumEngineVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
    }
  }

  /** Represents the output of a CreateParameterGroup operation. A parameter group represents a combination of specific values for the parameters that are passed to the engine software during startup.
    */
  @js.native
  trait ParameterGroup extends js.Object {
    var ARN: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Family: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object ParameterGroup {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Family: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): ParameterGroup = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Family.foreach(__v => __obj.updateDynamic("Family")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterGroup]
    }
  }

  /** Describes a name-value pair that is used to update the value of a parameter.
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

  /** Update action that has yet to be processed for the corresponding apply/stop request
    */
  @js.native
  trait PendingModifiedServiceUpdate extends js.Object {
    var ServiceUpdateName: js.UndefOr[String]
    var Status: js.UndefOr[ServiceUpdateStatus]
  }

  object PendingModifiedServiceUpdate {
    @inline
    def apply(
        ServiceUpdateName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ServiceUpdateStatus] = js.undefined
    ): PendingModifiedServiceUpdate = {
      val __obj = js.Dynamic.literal()
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingModifiedServiceUpdate]
    }
  }

  /** A request to configure the number of replicas in a shard
    */
  @js.native
  trait ReplicaConfigurationRequest extends js.Object {
    var ReplicaCount: js.UndefOr[Int]
  }

  object ReplicaConfigurationRequest {
    @inline
    def apply(
        ReplicaCount: js.UndefOr[Int] = js.undefined
    ): ReplicaConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      ReplicaCount.foreach(__v => __obj.updateDynamic("ReplicaCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicaConfigurationRequest]
    }
  }

  @js.native
  trait ResetParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
    var AllParameters: js.UndefOr[Boolean]
    var ParameterNames: js.UndefOr[ParameterNameList]
  }

  object ResetParameterGroupRequest {
    @inline
    def apply(
        ParameterGroupName: String,
        AllParameters: js.UndefOr[Boolean] = js.undefined,
        ParameterNames: js.UndefOr[ParameterNameList] = js.undefined
    ): ResetParameterGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )

      AllParameters.foreach(__v => __obj.updateDynamic("AllParameters")(__v.asInstanceOf[js.Any]))
      ParameterNames.foreach(__v => __obj.updateDynamic("ParameterNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetParameterGroupRequest]
    }
  }

  @js.native
  trait ResetParameterGroupResponse extends js.Object {
    var ParameterGroup: js.UndefOr[ParameterGroup]
  }

  object ResetParameterGroupResponse {
    @inline
    def apply(
        ParameterGroup: js.UndefOr[ParameterGroup] = js.undefined
    ): ResetParameterGroupResponse = {
      val __obj = js.Dynamic.literal()
      ParameterGroup.foreach(__v => __obj.updateDynamic("ParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetParameterGroupResponse]
    }
  }

  /** The status of the online resharding
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

  /** Represents a single security group and its status.
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

  /** An update that you can apply to your MemoryDB clusters.
    */
  @js.native
  trait ServiceUpdate extends js.Object {
    var AutoUpdateStartDate: js.UndefOr[TStamp]
    var ClusterName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var NodesUpdated: js.UndefOr[String]
    var ReleaseDate: js.UndefOr[TStamp]
    var ServiceUpdateName: js.UndefOr[String]
    var Status: js.UndefOr[ServiceUpdateStatus]
    var Type: js.UndefOr[ServiceUpdateType]
  }

  object ServiceUpdate {
    @inline
    def apply(
        AutoUpdateStartDate: js.UndefOr[TStamp] = js.undefined,
        ClusterName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        NodesUpdated: js.UndefOr[String] = js.undefined,
        ReleaseDate: js.UndefOr[TStamp] = js.undefined,
        ServiceUpdateName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ServiceUpdateStatus] = js.undefined,
        Type: js.UndefOr[ServiceUpdateType] = js.undefined
    ): ServiceUpdate = {
      val __obj = js.Dynamic.literal()
      AutoUpdateStartDate.foreach(__v => __obj.updateDynamic("AutoUpdateStartDate")(__v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NodesUpdated.foreach(__v => __obj.updateDynamic("NodesUpdated")(__v.asInstanceOf[js.Any]))
      ReleaseDate.foreach(__v => __obj.updateDynamic("ReleaseDate")(__v.asInstanceOf[js.Any]))
      ServiceUpdateName.foreach(__v => __obj.updateDynamic("ServiceUpdateName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceUpdate]
    }
  }

  /** A request to apply a service update
    */
  @js.native
  trait ServiceUpdateRequest extends js.Object {
    var ServiceUpdateNameToApply: js.UndefOr[String]
  }

  object ServiceUpdateRequest {
    @inline
    def apply(
        ServiceUpdateNameToApply: js.UndefOr[String] = js.undefined
    ): ServiceUpdateRequest = {
      val __obj = js.Dynamic.literal()
      ServiceUpdateNameToApply.foreach(__v => __obj.updateDynamic("ServiceUpdateNameToApply")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceUpdateRequest]
    }
  }

  /** Represents a collection of nodes in a cluster. One node in the node group is the read/write primary node. All the other nodes are read-only Replica nodes.
    */
  @js.native
  trait Shard extends js.Object {
    var Name: js.UndefOr[String]
    var Nodes: js.UndefOr[NodeList]
    var NumberOfNodes: js.UndefOr[IntegerOptional]
    var Slots: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object Shard {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Nodes: js.UndefOr[NodeList] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
        Slots: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): Shard = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Nodes.foreach(__v => __obj.updateDynamic("Nodes")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      Slots.foreach(__v => __obj.updateDynamic("Slots")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Shard]
    }
  }

  /** Shard configuration options. Each shard configuration has the following: Slots and ReplicaCount.
    */
  @js.native
  trait ShardConfiguration extends js.Object {
    var ReplicaCount: js.UndefOr[IntegerOptional]
    var Slots: js.UndefOr[String]
  }

  object ShardConfiguration {
    @inline
    def apply(
        ReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
        Slots: js.UndefOr[String] = js.undefined
    ): ShardConfiguration = {
      val __obj = js.Dynamic.literal()
      ReplicaCount.foreach(__v => __obj.updateDynamic("ReplicaCount")(__v.asInstanceOf[js.Any]))
      Slots.foreach(__v => __obj.updateDynamic("Slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShardConfiguration]
    }
  }

  /** A request to configure the sharding properties of a cluster
    */
  @js.native
  trait ShardConfigurationRequest extends js.Object {
    var ShardCount: js.UndefOr[Int]
  }

  object ShardConfigurationRequest {
    @inline
    def apply(
        ShardCount: js.UndefOr[Int] = js.undefined
    ): ShardConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      ShardCount.foreach(__v => __obj.updateDynamic("ShardCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShardConfigurationRequest]
    }
  }

  /** Provides details of a shard in a snapshot
    */
  @js.native
  trait ShardDetail extends js.Object {
    var Configuration: js.UndefOr[ShardConfiguration]
    var Name: js.UndefOr[String]
    var Size: js.UndefOr[String]
    var SnapshotCreationTime: js.UndefOr[TStamp]
  }

  object ShardDetail {
    @inline
    def apply(
        Configuration: js.UndefOr[ShardConfiguration] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Size: js.UndefOr[String] = js.undefined,
        SnapshotCreationTime: js.UndefOr[TStamp] = js.undefined
    ): ShardDetail = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      SnapshotCreationTime.foreach(__v => __obj.updateDynamic("SnapshotCreationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShardDetail]
    }
  }

  /** Represents the progress of an online resharding operation.
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

  /** Represents a copy of an entire cluster as of the time when the snapshot was taken.
    */
  @js.native
  trait Snapshot extends js.Object {
    var ARN: js.UndefOr[String]
    var ClusterConfiguration: js.UndefOr[ClusterConfiguration]
    var KmsKeyId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Source: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object Snapshot {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        ClusterConfiguration: js.UndefOr[ClusterConfiguration] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Source: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): Snapshot = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      ClusterConfiguration.foreach(__v => __obj.updateDynamic("ClusterConfiguration")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Snapshot]
    }
  }

  /** Represents the subnet associated with a cluster. This parameter refers to subnets defined in Amazon Virtual Private Cloud (Amazon VPC) and used with MemoryDB.
    */
  @js.native
  trait Subnet extends js.Object {
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var Identifier: js.UndefOr[String]
  }

  object Subnet {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        Identifier: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subnet]
    }
  }

  /** Represents the output of one of the following operations: * CreateSubnetGroup * UpdateSubnetGroup A subnet group is a collection of subnets (typically private) that you can designate for your clusters running in an Amazon Virtual Private Cloud (VPC) environment.
    */
  @js.native
  trait SubnetGroup extends js.Object {
    var ARN: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  object SubnetGroup {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): SubnetGroup = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubnetGroup]
    }
  }

  /** A tag that can be added to an MemoryDB resource. Tags are composed of a Key/Value pair. You can use tags to categorize and track all your MemoryDB resources. When you add or remove tags on clusters, those actions will be replicated to all nodes in the cluster. A tag with a null Value is permitted. For more information, see [[https://docs.aws.amazon.com/MemoryDB/latest/devguide/tagging-resources.html|Tagging your MemoryDB resources]]
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

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: String
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object TagResourceResponse {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** A cluster whose updates have failed
    */
  @js.native
  trait UnprocessedCluster extends js.Object {
    var ClusterName: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var ErrorType: js.UndefOr[String]
  }

  object UnprocessedCluster {
    @inline
    def apply(
        ClusterName: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ErrorType: js.UndefOr[String] = js.undefined
    ): UnprocessedCluster = {
      val __obj = js.Dynamic.literal()
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ErrorType.foreach(__v => __obj.updateDynamic("ErrorType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedCluster]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: String
    var TagKeys: KeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        TagKeys: KeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object UntagResourceResponse {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateACLRequest extends js.Object {
    var ACLName: String
    var UserNamesToAdd: js.UndefOr[UserNameListInput]
    var UserNamesToRemove: js.UndefOr[UserNameListInput]
  }

  object UpdateACLRequest {
    @inline
    def apply(
        ACLName: String,
        UserNamesToAdd: js.UndefOr[UserNameListInput] = js.undefined,
        UserNamesToRemove: js.UndefOr[UserNameListInput] = js.undefined
    ): UpdateACLRequest = {
      val __obj = js.Dynamic.literal(
        "ACLName" -> ACLName.asInstanceOf[js.Any]
      )

      UserNamesToAdd.foreach(__v => __obj.updateDynamic("UserNamesToAdd")(__v.asInstanceOf[js.Any]))
      UserNamesToRemove.foreach(__v => __obj.updateDynamic("UserNamesToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateACLRequest]
    }
  }

  @js.native
  trait UpdateACLResponse extends js.Object {
    var ACL: js.UndefOr[ACL]
  }

  object UpdateACLResponse {
    @inline
    def apply(
        ACL: js.UndefOr[ACL] = js.undefined
    ): UpdateACLResponse = {
      val __obj = js.Dynamic.literal()
      ACL.foreach(__v => __obj.updateDynamic("ACL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateACLResponse]
    }
  }

  @js.native
  trait UpdateClusterRequest extends js.Object {
    var ClusterName: String
    var ACLName: js.UndefOr[ACLName]
    var Description: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var MaintenanceWindow: js.UndefOr[String]
    var NodeType: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationRequest]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList]
    var ShardConfiguration: js.UndefOr[ShardConfigurationRequest]
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional]
    var SnapshotWindow: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var SnsTopicStatus: js.UndefOr[String]
  }

  object UpdateClusterRequest {
    @inline
    def apply(
        ClusterName: String,
        ACLName: js.UndefOr[ACLName] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MaintenanceWindow: js.UndefOr[String] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        ReplicaConfiguration: js.UndefOr[ReplicaConfigurationRequest] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined,
        ShardConfiguration: js.UndefOr[ShardConfigurationRequest] = js.undefined,
        SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
        SnapshotWindow: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SnsTopicStatus: js.UndefOr[String] = js.undefined
    ): UpdateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any]
      )

      ACLName.foreach(__v => __obj.updateDynamic("ACLName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      MaintenanceWindow.foreach(__v => __obj.updateDynamic("MaintenanceWindow")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      ReplicaConfiguration.foreach(__v => __obj.updateDynamic("ReplicaConfiguration")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      ShardConfiguration.foreach(__v => __obj.updateDynamic("ShardConfiguration")(__v.asInstanceOf[js.Any]))
      SnapshotRetentionLimit.foreach(__v => __obj.updateDynamic("SnapshotRetentionLimit")(__v.asInstanceOf[js.Any]))
      SnapshotWindow.foreach(__v => __obj.updateDynamic("SnapshotWindow")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SnsTopicStatus.foreach(__v => __obj.updateDynamic("SnsTopicStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterRequest]
    }
  }

  @js.native
  trait UpdateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object UpdateClusterResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): UpdateClusterResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterResponse]
    }
  }

  @js.native
  trait UpdateParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
    var ParameterNameValues: ParameterNameValueList
  }

  object UpdateParameterGroupRequest {
    @inline
    def apply(
        ParameterGroupName: String,
        ParameterNameValues: ParameterNameValueList
    ): UpdateParameterGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any],
        "ParameterNameValues" -> ParameterNameValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateParameterGroupRequest]
    }
  }

  @js.native
  trait UpdateParameterGroupResponse extends js.Object {
    var ParameterGroup: js.UndefOr[ParameterGroup]
  }

  object UpdateParameterGroupResponse {
    @inline
    def apply(
        ParameterGroup: js.UndefOr[ParameterGroup] = js.undefined
    ): UpdateParameterGroupResponse = {
      val __obj = js.Dynamic.literal()
      ParameterGroup.foreach(__v => __obj.updateDynamic("ParameterGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateParameterGroupResponse]
    }
  }

  @js.native
  trait UpdateSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
    var Description: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  object UpdateSubnetGroupRequest {
    @inline
    def apply(
        SubnetGroupName: String,
        Description: js.UndefOr[String] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
    ): UpdateSubnetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetGroupName" -> SubnetGroupName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubnetGroupRequest]
    }
  }

  @js.native
  trait UpdateSubnetGroupResponse extends js.Object {
    var SubnetGroup: js.UndefOr[SubnetGroup]
  }

  object UpdateSubnetGroupResponse {
    @inline
    def apply(
        SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined
    ): UpdateSubnetGroupResponse = {
      val __obj = js.Dynamic.literal()
      SubnetGroup.foreach(__v => __obj.updateDynamic("SubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubnetGroupResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var UserName: UserName
    var AccessString: js.UndefOr[AccessString]
    var AuthenticationMode: js.UndefOr[AuthenticationMode]
  }

  object UpdateUserRequest {
    @inline
    def apply(
        UserName: UserName,
        AccessString: js.UndefOr[AccessString] = js.undefined,
        AuthenticationMode: js.UndefOr[AuthenticationMode] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      AccessString.foreach(__v => __obj.updateDynamic("AccessString")(__v.asInstanceOf[js.Any]))
      AuthenticationMode.foreach(__v => __obj.updateDynamic("AuthenticationMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  /** You create users and assign them specific permissions by using an access string. You assign the users to Access Control Lists aligned with a specific role (administrators, human resources) that are then deployed to one or more MemoryDB clusters.
    */
  @js.native
  trait User extends js.Object {
    var ACLNames: js.UndefOr[ACLNameList]
    var ARN: js.UndefOr[String]
    var AccessString: js.UndefOr[String]
    var Authentication: js.UndefOr[Authentication]
    var MinimumEngineVersion: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object User {
    @inline
    def apply(
        ACLNames: js.UndefOr[ACLNameList] = js.undefined,
        ARN: js.UndefOr[String] = js.undefined,
        AccessString: js.UndefOr[String] = js.undefined,
        Authentication: js.UndefOr[Authentication] = js.undefined,
        MinimumEngineVersion: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal()
      ACLNames.foreach(__v => __obj.updateDynamic("ACLNames")(__v.asInstanceOf[js.Any]))
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      AccessString.foreach(__v => __obj.updateDynamic("AccessString")(__v.asInstanceOf[js.Any]))
      Authentication.foreach(__v => __obj.updateDynamic("Authentication")(__v.asInstanceOf[js.Any]))
      MinimumEngineVersion.foreach(__v => __obj.updateDynamic("MinimumEngineVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }
}
