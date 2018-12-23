package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object dax {
  type AvailabilityZoneList = js.Array[String]
  type ChangeType = String
  type ClusterList = js.Array[Cluster]
  type ClusterNameList = js.Array[String]
  type EventList = js.Array[Event]
  type IntegerOptional = Int
  type IsModifiable = String
  type KeyList = js.Array[String]
  type NodeIdentifierList = js.Array[String]
  type NodeList = js.Array[Node]
  type NodeTypeSpecificValueList = js.Array[NodeTypeSpecificValue]
  type ParameterGroupList = js.Array[ParameterGroup]
  type ParameterGroupNameList = js.Array[String]
  type ParameterList = js.Array[Parameter]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParameterType = String
  type SSEEnabled = Boolean
  type SSEStatus = String
  type SecurityGroupIdentifierList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type SourceType = String
  type SubnetGroupList = js.Array[SubnetGroup]
  type SubnetGroupNameList = js.Array[String]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = js.Date
  type TagList = js.Array[Tag]
}

package dax {
  @js.native
  @JSImport("aws-sdk", "DAX")
  class DAX(config: AWSConfig) extends js.Object {
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

  object ChangeTypeEnum {
    val IMMEDIATE = "IMMEDIATE"
    val REQUIRES_REBOOT = "REQUIRES_REBOOT"

    val values = IndexedSeq(IMMEDIATE, REQUIRES_REBOOT)
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
      TotalNodes: js.UndefOr[IntegerOptional] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActiveNodes" -> ActiveNodes.map { x => x.asInstanceOf[js.Any] },
        "ClusterArn" -> ClusterArn.map { x => x.asInstanceOf[js.Any] },
        "ClusterDiscoveryEndpoint" -> ClusterDiscoveryEndpoint.map { x => x.asInstanceOf[js.Any] },
        "ClusterName" -> ClusterName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IamRoleArn" -> IamRoleArn.map { x => x.asInstanceOf[js.Any] },
        "NodeIdsToRemove" -> NodeIdsToRemove.map { x => x.asInstanceOf[js.Any] },
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "Nodes" -> Nodes.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfiguration" -> NotificationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroup" -> ParameterGroup.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "SSEDescription" -> SSEDescription.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SubnetGroup" -> SubnetGroup.map { x => x.asInstanceOf[js.Any] },
        "TotalNodes" -> TotalNodes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
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
      Tags: js.UndefOr[TagList] = js.undefined): CreateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "IamRoleArn" -> IamRoleArn.asInstanceOf[js.Any],
        "NodeType" -> NodeType.asInstanceOf[js.Any],
        "ReplicationFactor" -> ReplicationFactor.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "SSESpecification" -> SSESpecification.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "SubnetGroupName" -> SubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): CreateClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait CreateParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
    var Description: js.UndefOr[String]
  }

  object CreateParameterGroupRequest {
    def apply(
      ParameterGroupName: String,
      Description: js.UndefOr[String] = js.undefined): CreateParameterGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateParameterGroupRequest]
    }
  }

  @js.native
  trait CreateParameterGroupResponse extends js.Object {
    var ParameterGroup: js.UndefOr[ParameterGroup]
  }

  object CreateParameterGroupResponse {
    def apply(
      ParameterGroup: js.UndefOr[ParameterGroup] = js.undefined): CreateParameterGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroup" -> ParameterGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateParameterGroupResponse]
    }
  }

  @js.native
  trait CreateSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Description: js.UndefOr[String]
  }

  object CreateSubnetGroupRequest {
    def apply(
      SubnetGroupName: String,
      SubnetIds: SubnetIdentifierList,
      Description: js.UndefOr[String] = js.undefined): CreateSubnetGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetGroupName" -> SubnetGroupName.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubnetGroupRequest]
    }
  }

  @js.native
  trait CreateSubnetGroupResponse extends js.Object {
    var SubnetGroup: js.UndefOr[SubnetGroup]
  }

  object CreateSubnetGroupResponse {
    def apply(
      SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined): CreateSubnetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetGroup" -> SubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubnetGroupResponse]
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
    def apply(
      ClusterName: String,
      NewReplicationFactor: Int,
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
      NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined): DecreaseReplicationFactorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "NewReplicationFactor" -> NewReplicationFactor.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "NodeIdsToRemove" -> NodeIdsToRemove.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecreaseReplicationFactorRequest]
    }
  }

  @js.native
  trait DecreaseReplicationFactorResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DecreaseReplicationFactorResponse {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): DecreaseReplicationFactorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecreaseReplicationFactorResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterName: String
  }

  object DeleteClusterRequest {
    def apply(
      ClusterName: String): DeleteClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterName" -> ClusterName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): DeleteClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DeleteParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
  }

  object DeleteParameterGroupRequest {
    def apply(
      ParameterGroupName: String): DeleteParameterGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteParameterGroupRequest]
    }
  }

  @js.native
  trait DeleteParameterGroupResponse extends js.Object {
    var DeletionMessage: js.UndefOr[String]
  }

  object DeleteParameterGroupResponse {
    def apply(
      DeletionMessage: js.UndefOr[String] = js.undefined): DeleteParameterGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionMessage" -> DeletionMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteParameterGroupResponse]
    }
  }

  @js.native
  trait DeleteSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
  }

  object DeleteSubnetGroupRequest {
    def apply(
      SubnetGroupName: String): DeleteSubnetGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetGroupName" -> SubnetGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubnetGroupRequest]
    }
  }

  @js.native
  trait DeleteSubnetGroupResponse extends js.Object {
    var DeletionMessage: js.UndefOr[String]
  }

  object DeleteSubnetGroupResponse {
    def apply(
      DeletionMessage: js.UndefOr[String] = js.undefined): DeleteSubnetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletionMessage" -> DeletionMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubnetGroupResponse]
    }
  }

  @js.native
  trait DescribeClustersRequest extends js.Object {
    var ClusterNames: js.UndefOr[ClusterNameList]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
  }

  object DescribeClustersRequest {
    def apply(
      ClusterNames: js.UndefOr[ClusterNameList] = js.undefined,
      MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterNames" -> ClusterNames.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersRequest]
    }
  }

  @js.native
  trait DescribeClustersResponse extends js.Object {
    var Clusters: js.UndefOr[ClusterList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeClustersResponse {
    def apply(
      Clusters: js.UndefOr[ClusterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Clusters" -> Clusters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersResponse]
    }
  }

  @js.native
  trait DescribeDefaultParametersRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDefaultParametersRequest {
    def apply(
      MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeDefaultParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultParametersRequest]
    }
  }

  @js.native
  trait DescribeDefaultParametersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Parameters: js.UndefOr[ParameterList]
  }

  object DescribeDefaultParametersResponse {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParameterList] = js.undefined): DescribeDefaultParametersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultParametersResponse]
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
    def apply(
      Duration: js.UndefOr[IntegerOptional] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      SourceName: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined): DescribeEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SourceName" -> SourceName.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsRequest]
    }
  }

  @js.native
  trait DescribeEventsResponse extends js.Object {
    var Events: js.UndefOr[EventList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEventsResponse {
    def apply(
      Events: js.UndefOr[EventList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsResponse]
    }
  }

  @js.native
  trait DescribeParameterGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var ParameterGroupNames: js.UndefOr[ParameterGroupNameList]
  }

  object DescribeParameterGroupsRequest {
    def apply(
      MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      ParameterGroupNames: js.UndefOr[ParameterGroupNameList] = js.undefined): DescribeParameterGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupNames" -> ParameterGroupNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParameterGroupsRequest]
    }
  }

  @js.native
  trait DescribeParameterGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ParameterGroups: js.UndefOr[ParameterGroupList]
  }

  object DescribeParameterGroupsResponse {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined): DescribeParameterGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroups" -> ParameterGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParameterGroupsResponse]
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
    def apply(
      ParameterGroupName: String,
      MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined): DescribeParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParametersRequest]
    }
  }

  @js.native
  trait DescribeParametersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Parameters: js.UndefOr[ParameterList]
  }

  object DescribeParametersResponse {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParameterList] = js.undefined): DescribeParametersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeParametersResponse]
    }
  }

  @js.native
  trait DescribeSubnetGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var SubnetGroupNames: js.UndefOr[SubnetGroupNameList]
  }

  object DescribeSubnetGroupsRequest {
    def apply(
      MaxResults: js.UndefOr[IntegerOptional] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      SubnetGroupNames: js.UndefOr[SubnetGroupNameList] = js.undefined): DescribeSubnetGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SubnetGroupNames" -> SubnetGroupNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubnetGroupsRequest]
    }
  }

  @js.native
  trait DescribeSubnetGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SubnetGroups: js.UndefOr[SubnetGroupList]
  }

  object DescribeSubnetGroupsResponse {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      SubnetGroups: js.UndefOr[SubnetGroupList] = js.undefined): DescribeSubnetGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SubnetGroups" -> SubnetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubnetGroupsResponse]
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
    def apply(
      Date: js.UndefOr[TStamp] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      SourceName: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "SourceName" -> SourceName.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  @js.native
  trait IncreaseReplicationFactorRequest extends js.Object {
    var ClusterName: String
    var NewReplicationFactor: Int
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  object IncreaseReplicationFactorRequest {
    def apply(
      ClusterName: String,
      NewReplicationFactor: Int,
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined): IncreaseReplicationFactorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "NewReplicationFactor" -> NewReplicationFactor.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IncreaseReplicationFactorRequest]
    }
  }

  @js.native
  trait IncreaseReplicationFactorResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object IncreaseReplicationFactorResponse {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): IncreaseReplicationFactorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IncreaseReplicationFactorResponse]
    }
  }

  object IsModifiableEnum {
    val TRUE = "TRUE"
    val FALSE = "FALSE"
    val CONDITIONAL = "CONDITIONAL"

    val values = IndexedSeq(TRUE, FALSE, CONDITIONAL)
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceName: String
    var NextToken: js.UndefOr[String]
  }

  object ListTagsRequest {
    def apply(
      ResourceName: String,
      NextToken: js.UndefOr[String] = js.undefined): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
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
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      NodeCreateTime: js.UndefOr[TStamp] = js.undefined,
      NodeId: js.UndefOr[String] = js.undefined,
      NodeStatus: js.UndefOr[String] = js.undefined,
      ParameterGroupStatus: js.UndefOr[String] = js.undefined): Node = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "NodeCreateTime" -> NodeCreateTime.map { x => x.asInstanceOf[js.Any] },
        "NodeId" -> NodeId.map { x => x.asInstanceOf[js.Any] },
        "NodeStatus" -> NodeStatus.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupStatus" -> ParameterGroupStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Node]
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
    def apply(
      NodeType: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): NodeTypeSpecificValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeType" -> NodeType.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeTypeSpecificValue]
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
      Source: js.UndefOr[String] = js.undefined): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] },
        "ChangeType" -> ChangeType.map { x => x.asInstanceOf[js.Any] },
        "DataType" -> DataType.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsModifiable" -> IsModifiable.map { x => x.asInstanceOf[js.Any] },
        "NodeTypeSpecificValues" -> NodeTypeSpecificValues.map { x => x.asInstanceOf[js.Any] },
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "ParameterType" -> ParameterType.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
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
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      ParameterGroupName: js.UndefOr[String] = js.undefined): ParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterGroup]
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
    def apply(
      NodeIdsToReboot: js.UndefOr[NodeIdentifierList] = js.undefined,
      ParameterApplyStatus: js.UndefOr[String] = js.undefined,
      ParameterGroupName: js.UndefOr[String] = js.undefined): ParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NodeIdsToReboot" -> NodeIdsToReboot.map { x => x.asInstanceOf[js.Any] },
        "ParameterApplyStatus" -> ParameterApplyStatus.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterGroupStatus]
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
    def apply(
      ParameterName: js.UndefOr[String] = js.undefined,
      ParameterValue: js.UndefOr[String] = js.undefined): ParameterNameValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterNameValue]
    }
  }

  object ParameterTypeEnum {
    val DEFAULT = "DEFAULT"
    val NODE_TYPE_SPECIFIC = "NODE_TYPE_SPECIFIC"

    val values = IndexedSeq(DEFAULT, NODE_TYPE_SPECIFIC)
  }

  @js.native
  trait RebootNodeRequest extends js.Object {
    var ClusterName: String
    var NodeId: String
  }

  object RebootNodeRequest {
    def apply(
      ClusterName: String,
      NodeId: String): RebootNodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "NodeId" -> NodeId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootNodeRequest]
    }
  }

  @js.native
  trait RebootNodeResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object RebootNodeResponse {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): RebootNodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootNodeResponse]
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
    def apply(
      Status: js.UndefOr[SSEStatus] = js.undefined): SSEDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSEDescription]
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
    def apply(
      Enabled: SSEEnabled): SSESpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSESpecification]
    }
  }

  object SSEStatusEnum {
    val ENABLING = "ENABLING"
    val ENABLED = "ENABLED"
    val DISABLING = "DISABLING"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLING, ENABLED, DISABLING, DISABLED)
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
    def apply(
      SecurityGroupIdentifier: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): SecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupIdentifier" -> SecurityGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroupMembership]
    }
  }

  object SourceTypeEnum {
    val CLUSTER = "CLUSTER"
    val PARAMETER_GROUP = "PARAMETER_GROUP"
    val SUBNET_GROUP = "SUBNET_GROUP"

    val values = IndexedSeq(CLUSTER, PARAMETER_GROUP, SUBNET_GROUP)
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
    def apply(
      SubnetAvailabilityZone: js.UndefOr[String] = js.undefined,
      SubnetIdentifier: js.UndefOr[String] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SubnetIdentifier" -> SubnetIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
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
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      SubnetGroupName: js.UndefOr[String] = js.undefined,
      Subnets: js.UndefOr[SubnetList] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): SubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SubnetGroupName" -> SubnetGroupName.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubnetGroup]
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
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
      ResourceName: String,
      Tags: TagList): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object TagResourceResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  object UntagResourceRequest {
    def apply(
      ResourceName: String,
      TagKeys: KeyList): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object UntagResourceResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
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
    def apply(
      ClusterName: String,
      Description: js.UndefOr[String] = js.undefined,
      NotificationTopicArn: js.UndefOr[String] = js.undefined,
      NotificationTopicStatus: js.UndefOr[String] = js.undefined,
      ParameterGroupName: js.UndefOr[String] = js.undefined,
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList] = js.undefined): UpdateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicArn" -> NotificationTopicArn.map { x => x.asInstanceOf[js.Any] },
        "NotificationTopicStatus" -> NotificationTopicStatus.map { x => x.asInstanceOf[js.Any] },
        "ParameterGroupName" -> ParameterGroupName.map { x => x.asInstanceOf[js.Any] },
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClusterRequest]
    }
  }

  @js.native
  trait UpdateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object UpdateClusterResponse {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): UpdateClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClusterResponse]
    }
  }

  @js.native
  trait UpdateParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
    var ParameterNameValues: ParameterNameValueList
  }

  object UpdateParameterGroupRequest {
    def apply(
      ParameterGroupName: String,
      ParameterNameValues: ParameterNameValueList): UpdateParameterGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroupName" -> ParameterGroupName.asInstanceOf[js.Any],
        "ParameterNameValues" -> ParameterNameValues.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateParameterGroupRequest]
    }
  }

  @js.native
  trait UpdateParameterGroupResponse extends js.Object {
    var ParameterGroup: js.UndefOr[ParameterGroup]
  }

  object UpdateParameterGroupResponse {
    def apply(
      ParameterGroup: js.UndefOr[ParameterGroup] = js.undefined): UpdateParameterGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterGroup" -> ParameterGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateParameterGroupResponse]
    }
  }

  @js.native
  trait UpdateSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
    var Description: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  object UpdateSubnetGroupRequest {
    def apply(
      SubnetGroupName: String,
      Description: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined): UpdateSubnetGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetGroupName" -> SubnetGroupName.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubnetGroupRequest]
    }
  }

  @js.native
  trait UpdateSubnetGroupResponse extends js.Object {
    var SubnetGroup: js.UndefOr[SubnetGroup]
  }

  object UpdateSubnetGroupResponse {
    def apply(
      SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined): UpdateSubnetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetGroup" -> SubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubnetGroupResponse]
    }
  }
}
