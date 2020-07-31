package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object dax {
  type AvailabilityZoneList = js.Array[String]
  type ClusterList = js.Array[Cluster]
  type ClusterNameList = js.Array[String]
  type EventList = js.Array[Event]
  type IntegerOptional = Int
  type KeyList = js.Array[String]
  type NodeIdentifierList = js.Array[String]
  type NodeList = js.Array[Node]
  type NodeTypeSpecificValueList = js.Array[NodeTypeSpecificValue]
  type ParameterGroupList = js.Array[ParameterGroup]
  type ParameterGroupNameList = js.Array[String]
  type ParameterList = js.Array[Parameter]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type SSEEnabled = Boolean
  type SecurityGroupIdentifierList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type SubnetGroupList = js.Array[SubnetGroup]
  type SubnetGroupNameList = js.Array[String]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = js.Date
  type TagList = js.Array[Tag]

  implicit final class DAXOps(private val service: DAX) extends AnyVal {

    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] = service.createCluster(params).promise().toFuture
    @inline def createParameterGroupFuture(params: CreateParameterGroupRequest): Future[CreateParameterGroupResponse] = service.createParameterGroup(params).promise().toFuture
    @inline def createSubnetGroupFuture(params: CreateSubnetGroupRequest): Future[CreateSubnetGroupResponse] = service.createSubnetGroup(params).promise().toFuture
    @inline def decreaseReplicationFactorFuture(params: DecreaseReplicationFactorRequest): Future[DecreaseReplicationFactorResponse] = service.decreaseReplicationFactor(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] = service.deleteCluster(params).promise().toFuture
    @inline def deleteParameterGroupFuture(params: DeleteParameterGroupRequest): Future[DeleteParameterGroupResponse] = service.deleteParameterGroup(params).promise().toFuture
    @inline def deleteSubnetGroupFuture(params: DeleteSubnetGroupRequest): Future[DeleteSubnetGroupResponse] = service.deleteSubnetGroup(params).promise().toFuture
    @inline def describeClustersFuture(params: DescribeClustersRequest): Future[DescribeClustersResponse] = service.describeClusters(params).promise().toFuture
    @inline def describeDefaultParametersFuture(params: DescribeDefaultParametersRequest): Future[DescribeDefaultParametersResponse] = service.describeDefaultParameters(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsRequest): Future[DescribeEventsResponse] = service.describeEvents(params).promise().toFuture
    @inline def describeParameterGroupsFuture(params: DescribeParameterGroupsRequest): Future[DescribeParameterGroupsResponse] = service.describeParameterGroups(params).promise().toFuture
    @inline def describeParametersFuture(params: DescribeParametersRequest): Future[DescribeParametersResponse] = service.describeParameters(params).promise().toFuture
    @inline def describeSubnetGroupsFuture(params: DescribeSubnetGroupsRequest): Future[DescribeSubnetGroupsResponse] = service.describeSubnetGroups(params).promise().toFuture
    @inline def increaseReplicationFactorFuture(params: IncreaseReplicationFactorRequest): Future[IncreaseReplicationFactorResponse] = service.increaseReplicationFactor(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise().toFuture
    @inline def rebootNodeFuture(params: RebootNodeRequest): Future[RebootNodeResponse] = service.rebootNode(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateClusterFuture(params: UpdateClusterRequest): Future[UpdateClusterResponse] = service.updateCluster(params).promise().toFuture
    @inline def updateParameterGroupFuture(params: UpdateParameterGroupRequest): Future[UpdateParameterGroupResponse] = service.updateParameterGroup(params).promise().toFuture
    @inline def updateSubnetGroupFuture(params: UpdateSubnetGroupRequest): Future[UpdateSubnetGroupResponse] = service.updateSubnetGroup(params).promise().toFuture
  }
}

package dax {
  @js.native
  @JSImport("aws-sdk", "DAX", "AWS.DAX")
  class DAX() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createParameterGroup(params: CreateParameterGroupRequest): Request[CreateParameterGroupResponse] = js.native
    def createSubnetGroup(params: CreateSubnetGroupRequest): Request[CreateSubnetGroupResponse] = js.native
    def decreaseReplicationFactor(params: DecreaseReplicationFactorRequest): Request[DecreaseReplicationFactorResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteParameterGroup(params: DeleteParameterGroupRequest): Request[DeleteParameterGroupResponse] = js.native
    def deleteSubnetGroup(params: DeleteSubnetGroupRequest): Request[DeleteSubnetGroupResponse] = js.native
    def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse] = js.native
    def describeDefaultParameters(params: DescribeDefaultParametersRequest): Request[DescribeDefaultParametersResponse] = js.native
    def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse] = js.native
    def describeParameterGroups(params: DescribeParameterGroupsRequest): Request[DescribeParameterGroupsResponse] = js.native
    def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResponse] = js.native
    def describeSubnetGroups(params: DescribeSubnetGroupsRequest): Request[DescribeSubnetGroupsResponse] = js.native
    def increaseReplicationFactor(params: IncreaseReplicationFactorRequest): Request[IncreaseReplicationFactorResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def rebootNode(params: RebootNodeRequest): Request[RebootNodeResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResponse] = js.native
    def updateParameterGroup(params: UpdateParameterGroupRequest): Request[UpdateParameterGroupResponse] = js.native
    def updateSubnetGroup(params: UpdateSubnetGroupRequest): Request[UpdateSubnetGroupResponse] = js.native
  }

  @js.native
  sealed trait ChangeType extends js.Any
  object ChangeType {
    @inline def IMMEDIATE = "IMMEDIATE".asInstanceOf[ChangeType]
    @inline def REQUIRES_REBOOT = "REQUIRES_REBOOT".asInstanceOf[ChangeType]

    @inline def values = js.Object.freeze(js.Array(IMMEDIATE, REQUIRES_REBOOT))
  }

  /**
    * Contains all of the attributes of a specific DAX cluster.
    */
  @js.native
  trait Cluster extends js.Object {
    var ActiveNodes: js.UndefOr[IntegerOptional]
    var ClusterArn: js.UndefOr[String]
    var ClusterDiscoveryEndpoint: js.UndefOr[Endpoint]
    var ClusterName: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[String]
    var NodeIdsToRemove: js.UndefOr[NodeIdentifierList]
    var NodeType: js.UndefOr[String]
    var Nodes: js.UndefOr[NodeList]
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
    var ParameterGroup: js.UndefOr[ParameterGroupStatus]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var SSEDescription: js.UndefOr[SSEDescription]
    var SecurityGroups: js.UndefOr[SecurityGroupMembershipList]
    var Status: js.UndefOr[String]
    var SubnetGroup: js.UndefOr[String]
    var TotalNodes: js.UndefOr[IntegerOptional]
  }

  object Cluster {
    @inline
    def apply(
        ActiveNodes: js.UndefOr[IntegerOptional] = js.undefined,
        ClusterArn: js.UndefOr[String] = js.undefined,
        ClusterDiscoveryEndpoint: js.UndefOr[Endpoint] = js.undefined,
        ClusterName: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IamRoleArn: js.UndefOr[String] = js.undefined,
        NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined,
        NodeType: js.UndefOr[String] = js.undefined,
        Nodes: js.UndefOr[NodeList] = js.undefined,
        NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined,
        ParameterGroup: js.UndefOr[ParameterGroupStatus] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        SSEDescription: js.UndefOr[SSEDescription] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        SubnetGroup: js.UndefOr[String] = js.undefined,
        TotalNodes: js.UndefOr[IntegerOptional] = js.undefined
    ): Cluster = {
      val __obj = js.Dynamic.literal()
      ActiveNodes.foreach(__v => __obj.updateDynamic("ActiveNodes")(__v.asInstanceOf[js.Any]))
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterDiscoveryEndpoint.foreach(__v => __obj.updateDynamic("ClusterDiscoveryEndpoint")(__v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      NodeIdsToRemove.foreach(__v => __obj.updateDynamic("NodeIdsToRemove")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      Nodes.foreach(__v => __obj.updateDynamic("Nodes")(__v.asInstanceOf[js.Any]))
      NotificationConfiguration.foreach(__v => __obj.updateDynamic("NotificationConfiguration")(__v.asInstanceOf[js.Any]))
      ParameterGroup.foreach(__v => __obj.updateDynamic("ParameterGroup")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      SSEDescription.foreach(__v => __obj.updateDynamic("SSEDescription")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubnetGroup.foreach(__v => __obj.updateDynamic("SubnetGroup")(__v.asInstanceOf[js.Any]))
      TotalNodes.foreach(__v => __obj.updateDynamic("TotalNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var ClusterName: String
    var IamRoleArn: String
    var NodeType: String
    var ReplicationFactor: Int
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var Description: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var SSESpecification: js.UndefOr[SSESpecification]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList]
    var SubnetGroupName: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateClusterRequest {
    @inline
    def apply(
        ClusterName: String,
        IamRoleArn: String,
        NodeType: String,
        ReplicationFactor: Int,
        AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        NotificationTopicArn: js.UndefOr[String] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        SSESpecification: js.UndefOr[SSESpecification] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList] = js.undefined,
        SubnetGroupName: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "IamRoleArn" -> IamRoleArn.asInstanceOf[js.Any],
        "NodeType" -> NodeType.asInstanceOf[js.Any],
        "ReplicationFactor" -> ReplicationFactor.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.updateDynamic("NotificationTopicArn")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      SSESpecification.foreach(__v => __obj.updateDynamic("SSESpecification")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetGroupName.foreach(__v => __obj.updateDynamic("SubnetGroupName")(__v.asInstanceOf[js.Any]))
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
    var ParameterGroupName: String
    var Description: js.UndefOr[String]
  }

  object CreateParameterGroupRequest {
    @inline
    def apply(
        ParameterGroupName: String,
        Description: js.UndefOr[String] = js.undefined
    ): CreateParameterGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
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
  trait CreateSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Description: js.UndefOr[String]
  }

  object CreateSubnetGroupRequest {
    @inline
    def apply(
        SubnetGroupName: String,
        SubnetIds: SubnetIdentifierList,
        Description: js.UndefOr[String] = js.undefined
    ): CreateSubnetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetGroupName" -> SubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
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
  trait DecreaseReplicationFactorRequest extends js.Object {
    var ClusterName: String
    var NewReplicationFactor: Int
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var NodeIdsToRemove: js.UndefOr[NodeIdentifierList]
  }

  object DecreaseReplicationFactorRequest {
    @inline
    def apply(
        ClusterName: String,
        NewReplicationFactor: Int,
        AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
        NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined
    ): DecreaseReplicationFactorRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "NewReplicationFactor" -> NewReplicationFactor.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      NodeIdsToRemove.foreach(__v => __obj.updateDynamic("NodeIdsToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecreaseReplicationFactorRequest]
    }
  }

  @js.native
  trait DecreaseReplicationFactorResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DecreaseReplicationFactorResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): DecreaseReplicationFactorResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecreaseReplicationFactorResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterName: String
  }

  object DeleteClusterRequest {
    @inline
    def apply(
        ClusterName: String
    ): DeleteClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any]
      )

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
    var DeletionMessage: js.UndefOr[String]
  }

  object DeleteParameterGroupResponse {
    @inline
    def apply(
        DeletionMessage: js.UndefOr[String] = js.undefined
    ): DeleteParameterGroupResponse = {
      val __obj = js.Dynamic.literal()
      DeletionMessage.foreach(__v => __obj.updateDynamic("DeletionMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteParameterGroupResponse]
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
    var DeletionMessage: js.UndefOr[String]
  }

  object DeleteSubnetGroupResponse {
    @inline
    def apply(
        DeletionMessage: js.UndefOr[String] = js.undefined
    ): DeleteSubnetGroupResponse = {
      val __obj = js.Dynamic.literal()
      DeletionMessage.foreach(__v => __obj.updateDynamic("DeletionMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSubnetGroupResponse]
    }
  }

  @js.native
  trait DescribeClustersRequest extends js.Object {
    var ClusterNames: js.UndefOr[ClusterNameList]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
  }

  object DescribeClustersRequest {
    @inline
    def apply(
        ClusterNames: js.UndefOr[ClusterNameList] = js.undefined,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeClustersRequest = {
      val __obj = js.Dynamic.literal()
      ClusterNames.foreach(__v => __obj.updateDynamic("ClusterNames")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
  trait DescribeDefaultParametersRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDefaultParametersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeDefaultParametersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDefaultParametersRequest]
    }
  }

  @js.native
  trait DescribeDefaultParametersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Parameters: js.UndefOr[ParameterList]
  }

  object DescribeDefaultParametersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParameterList] = js.undefined
    ): DescribeDefaultParametersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDefaultParametersResponse]
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
    var ParameterGroupNames: js.UndefOr[ParameterGroupNameList]
  }

  object DescribeParameterGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ParameterGroupNames: js.UndefOr[ParameterGroupNameList] = js.undefined
    ): DescribeParameterGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParameterGroupNames.foreach(__v => __obj.updateDynamic("ParameterGroupNames")(__v.asInstanceOf[js.Any]))
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
    var Source: js.UndefOr[String]
  }

  object DescribeParametersRequest {
    @inline
    def apply(
        ParameterGroupName: String,
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): DescribeParametersRequest = {
      val __obj = js.Dynamic.literal(
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParametersRequest]
    }
  }

  @js.native
  trait DescribeParametersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Parameters: js.UndefOr[ParameterList]
  }

  object DescribeParametersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Parameters: js.UndefOr[ParameterList] = js.undefined
    ): DescribeParametersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeParametersResponse]
    }
  }

  @js.native
  trait DescribeSubnetGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var SubnetGroupNames: js.UndefOr[SubnetGroupNameList]
  }

  object DescribeSubnetGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SubnetGroupNames: js.UndefOr[SubnetGroupNameList] = js.undefined
    ): DescribeSubnetGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SubnetGroupNames.foreach(__v => __obj.updateDynamic("SubnetGroupNames")(__v.asInstanceOf[js.Any]))
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

  /**
    * Represents the information required for client programs to connect to the configuration endpoint for a DAX cluster, or to an individual node within the cluster.
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
    * Represents a single occurrence of something interesting within the system. Some examples of events are creating a DAX cluster, adding or removing a node, or rebooting a node.
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
  trait IncreaseReplicationFactorRequest extends js.Object {
    var ClusterName: String
    var NewReplicationFactor: Int
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  object IncreaseReplicationFactorRequest {
    @inline
    def apply(
        ClusterName: String,
        NewReplicationFactor: Int,
        AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    ): IncreaseReplicationFactorRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "NewReplicationFactor" -> NewReplicationFactor.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncreaseReplicationFactorRequest]
    }
  }

  @js.native
  trait IncreaseReplicationFactorResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object IncreaseReplicationFactorResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): IncreaseReplicationFactorResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncreaseReplicationFactorResponse]
    }
  }

  @js.native
  sealed trait IsModifiable extends js.Any
  object IsModifiable {
    @inline def TRUE = "TRUE".asInstanceOf[IsModifiable]
    @inline def FALSE = "FALSE".asInstanceOf[IsModifiable]
    @inline def CONDITIONAL = "CONDITIONAL".asInstanceOf[IsModifiable]

    @inline def values = js.Object.freeze(js.Array(TRUE, FALSE, CONDITIONAL))
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceName: String
    var NextToken: js.UndefOr[String]
  }

  object ListTagsRequest {
    @inline
    def apply(
        ResourceName: String,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  /**
    * Represents an individual node within a DAX cluster.
    */
  @js.native
  trait Node extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var Endpoint: js.UndefOr[Endpoint]
    var NodeCreateTime: js.UndefOr[TStamp]
    var NodeId: js.UndefOr[String]
    var NodeStatus: js.UndefOr[String]
    var ParameterGroupStatus: js.UndefOr[String]
  }

  object Node {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        NodeCreateTime: js.UndefOr[TStamp] = js.undefined,
        NodeId: js.UndefOr[String] = js.undefined,
        NodeStatus: js.UndefOr[String] = js.undefined,
        ParameterGroupStatus: js.UndefOr[String] = js.undefined
    ): Node = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      NodeCreateTime.foreach(__v => __obj.updateDynamic("NodeCreateTime")(__v.asInstanceOf[js.Any]))
      NodeId.foreach(__v => __obj.updateDynamic("NodeId")(__v.asInstanceOf[js.Any]))
      NodeStatus.foreach(__v => __obj.updateDynamic("NodeStatus")(__v.asInstanceOf[js.Any]))
      ParameterGroupStatus.foreach(__v => __obj.updateDynamic("ParameterGroupStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Node]
    }
  }

  /**
    * Represents a parameter value that is applicable to a particular node type.
    */
  @js.native
  trait NodeTypeSpecificValue extends js.Object {
    var NodeType: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object NodeTypeSpecificValue {
    @inline
    def apply(
        NodeType: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): NodeTypeSpecificValue = {
      val __obj = js.Dynamic.literal()
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeTypeSpecificValue]
    }
  }

  /**
    * Describes a notification topic and its status. Notification topics are used for publishing DAX events to subscribers using Amazon Simple Notification Service (SNS).
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
    * Describes an individual setting that controls some aspect of DAX behavior.
    */
  @js.native
  trait Parameter extends js.Object {
    var AllowedValues: js.UndefOr[String]
    var ChangeType: js.UndefOr[ChangeType]
    var DataType: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var IsModifiable: js.UndefOr[IsModifiable]
    var NodeTypeSpecificValues: js.UndefOr[NodeTypeSpecificValueList]
    var ParameterName: js.UndefOr[String]
    var ParameterType: js.UndefOr[ParameterType]
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
        IsModifiable: js.UndefOr[IsModifiable] = js.undefined,
        NodeTypeSpecificValues: js.UndefOr[NodeTypeSpecificValueList] = js.undefined,
        ParameterName: js.UndefOr[String] = js.undefined,
        ParameterType: js.UndefOr[ParameterType] = js.undefined,
        ParameterValue: js.UndefOr[String] = js.undefined,
        Source: js.UndefOr[String] = js.undefined
    ): Parameter = {
      val __obj = js.Dynamic.literal()
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      ChangeType.foreach(__v => __obj.updateDynamic("ChangeType")(__v.asInstanceOf[js.Any]))
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsModifiable.foreach(__v => __obj.updateDynamic("IsModifiable")(__v.asInstanceOf[js.Any]))
      NodeTypeSpecificValues.foreach(__v => __obj.updateDynamic("NodeTypeSpecificValues")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      ParameterType.foreach(__v => __obj.updateDynamic("ParameterType")(__v.asInstanceOf[js.Any]))
      ParameterValue.foreach(__v => __obj.updateDynamic("ParameterValue")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
    }
  }

  /**
    * A named set of parameters that are applied to all of the nodes in a DAX cluster.
    */
  @js.native
  trait ParameterGroup extends js.Object {
    var Description: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
  }

  object ParameterGroup {
    @inline
    def apply(
        Description: js.UndefOr[String] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined
    ): ParameterGroup = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterGroup]
    }
  }

  /**
    * The status of a parameter group.
    */
  @js.native
  trait ParameterGroupStatus extends js.Object {
    var NodeIdsToReboot: js.UndefOr[NodeIdentifierList]
    var ParameterApplyStatus: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
  }

  object ParameterGroupStatus {
    @inline
    def apply(
        NodeIdsToReboot: js.UndefOr[NodeIdentifierList] = js.undefined,
        ParameterApplyStatus: js.UndefOr[String] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined
    ): ParameterGroupStatus = {
      val __obj = js.Dynamic.literal()
      NodeIdsToReboot.foreach(__v => __obj.updateDynamic("NodeIdsToReboot")(__v.asInstanceOf[js.Any]))
      ParameterApplyStatus.foreach(__v => __obj.updateDynamic("ParameterApplyStatus")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterGroupStatus]
    }
  }

  /**
    * An individual DAX parameter.
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
  sealed trait ParameterType extends js.Any
  object ParameterType {
    @inline def DEFAULT = "DEFAULT".asInstanceOf[ParameterType]
    @inline def NODE_TYPE_SPECIFIC = "NODE_TYPE_SPECIFIC".asInstanceOf[ParameterType]

    @inline def values = js.Object.freeze(js.Array(DEFAULT, NODE_TYPE_SPECIFIC))
  }

  @js.native
  trait RebootNodeRequest extends js.Object {
    var ClusterName: String
    var NodeId: String
  }

  object RebootNodeRequest {
    @inline
    def apply(
        ClusterName: String,
        NodeId: String
    ): RebootNodeRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "NodeId" -> NodeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebootNodeRequest]
    }
  }

  @js.native
  trait RebootNodeResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RebootNodeResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): RebootNodeResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootNodeResponse]
    }
  }

  /**
    * The description of the server-side encryption status on the specified DAX cluster.
    */
  @js.native
  trait SSEDescription extends js.Object {
    var Status: js.UndefOr[SSEStatus]
  }

  object SSEDescription {
    @inline
    def apply(
        Status: js.UndefOr[SSEStatus] = js.undefined
    ): SSEDescription = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SSEDescription]
    }
  }

  /**
    * Represents the settings used to enable server-side encryption.
    */
  @js.native
  trait SSESpecification extends js.Object {
    var Enabled: SSEEnabled
  }

  object SSESpecification {
    @inline
    def apply(
        Enabled: SSEEnabled
    ): SSESpecification = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SSESpecification]
    }
  }

  @js.native
  sealed trait SSEStatus extends js.Any
  object SSEStatus {
    @inline def ENABLING = "ENABLING".asInstanceOf[SSEStatus]
    @inline def ENABLED = "ENABLED".asInstanceOf[SSEStatus]
    @inline def DISABLING = "DISABLING".asInstanceOf[SSEStatus]
    @inline def DISABLED = "DISABLED".asInstanceOf[SSEStatus]

    @inline def values = js.Object.freeze(js.Array(ENABLING, ENABLED, DISABLING, DISABLED))
  }

  /**
    * An individual VPC security group and its status.
    */
  @js.native
  trait SecurityGroupMembership extends js.Object {
    var SecurityGroupIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object SecurityGroupMembership {
    @inline
    def apply(
        SecurityGroupIdentifier: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): SecurityGroupMembership = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIdentifier.foreach(__v => __obj.updateDynamic("SecurityGroupIdentifier")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroupMembership]
    }
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType {
    @inline def CLUSTER = "CLUSTER".asInstanceOf[SourceType]
    @inline def PARAMETER_GROUP = "PARAMETER_GROUP".asInstanceOf[SourceType]
    @inline def SUBNET_GROUP = "SUBNET_GROUP".asInstanceOf[SourceType]

    @inline def values = js.Object.freeze(js.Array(CLUSTER, PARAMETER_GROUP, SUBNET_GROUP))
  }

  /**
    * Represents the subnet associated with a DAX cluster. This parameter refers to subnets defined in Amazon Virtual Private Cloud (Amazon VPC) and used with DAX.
    */
  @js.native
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[String]
    var SubnetIdentifier: js.UndefOr[String]
  }

  object Subnet {
    @inline
    def apply(
        SubnetAvailabilityZone: js.UndefOr[String] = js.undefined,
        SubnetIdentifier: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dynamic.literal()
      SubnetAvailabilityZone.foreach(__v => __obj.updateDynamic("SubnetAvailabilityZone")(__v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.updateDynamic("SubnetIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subnet]
    }
  }

  /**
    * Represents the output of one of the following actions:
    * * <i>CreateSubnetGroup</i>
    *  * <i>ModifySubnetGroup</i>
    */
  @js.native
  trait SubnetGroup extends js.Object {
    var Description: js.UndefOr[String]
    var SubnetGroupName: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  object SubnetGroup {
    @inline
    def apply(
        Description: js.UndefOr[String] = js.undefined,
        SubnetGroupName: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): SubnetGroup = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SubnetGroupName.foreach(__v => __obj.updateDynamic("SubnetGroupName")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubnetGroup]
    }
  }

  /**
    * A description of a tag. Every tag is a key-value pair. You can add up to 50 tags to a single DAX cluster.
    *  AWS-assigned tag names and values are automatically assigned the <code>aws:</code> prefix, which the user cannot assign. AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix <code>user:</code>.
    *  You cannot backdate the application of a tag.
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
    var ResourceName: String
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceName: String,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object TagResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceName: String,
        TagKeys: KeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object UntagResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateClusterRequest extends js.Object {
    var ClusterName: String
    var Description: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var NotificationTopicStatus: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList]
  }

  object UpdateClusterRequest {
    @inline
    def apply(
        ClusterName: String,
        Description: js.UndefOr[String] = js.undefined,
        NotificationTopicArn: js.UndefOr[String] = js.undefined,
        NotificationTopicStatus: js.UndefOr[String] = js.undefined,
        ParameterGroupName: js.UndefOr[String] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList] = js.undefined
    ): UpdateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NotificationTopicArn.foreach(__v => __obj.updateDynamic("NotificationTopicArn")(__v.asInstanceOf[js.Any]))
      NotificationTopicStatus.foreach(__v => __obj.updateDynamic("NotificationTopicStatus")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
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
}
