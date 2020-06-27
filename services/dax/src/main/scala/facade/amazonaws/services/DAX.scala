package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object dax {
  type AvailabilityZoneList        = js.Array[String]
  type ClusterList                 = js.Array[Cluster]
  type ClusterNameList             = js.Array[String]
  type EventList                   = js.Array[Event]
  type IntegerOptional             = Int
  type KeyList                     = js.Array[String]
  type NodeIdentifierList          = js.Array[String]
  type NodeList                    = js.Array[Node]
  type NodeTypeSpecificValueList   = js.Array[NodeTypeSpecificValue]
  type ParameterGroupList          = js.Array[ParameterGroup]
  type ParameterGroupNameList      = js.Array[String]
  type ParameterList               = js.Array[Parameter]
  type ParameterNameValueList      = js.Array[ParameterNameValue]
  type SSEEnabled                  = Boolean
  type SecurityGroupIdentifierList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type SubnetGroupList             = js.Array[SubnetGroup]
  type SubnetGroupNameList         = js.Array[String]
  type SubnetIdentifierList        = js.Array[String]
  type SubnetList                  = js.Array[Subnet]
  type TStamp                      = js.Date
  type TagList                     = js.Array[Tag]

  implicit final class DAXOps(private val service: DAX) extends AnyVal {

    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise().toFuture
    @inline def createParameterGroupFuture(params: CreateParameterGroupRequest): Future[CreateParameterGroupResponse] =
      service.createParameterGroup(params).promise().toFuture
    @inline def createSubnetGroupFuture(params: CreateSubnetGroupRequest): Future[CreateSubnetGroupResponse] =
      service.createSubnetGroup(params).promise().toFuture
    @inline def decreaseReplicationFactorFuture(
        params: DecreaseReplicationFactorRequest
    ): Future[DecreaseReplicationFactorResponse] = service.decreaseReplicationFactor(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise().toFuture
    @inline def deleteParameterGroupFuture(params: DeleteParameterGroupRequest): Future[DeleteParameterGroupResponse] =
      service.deleteParameterGroup(params).promise().toFuture
    @inline def deleteSubnetGroupFuture(params: DeleteSubnetGroupRequest): Future[DeleteSubnetGroupResponse] =
      service.deleteSubnetGroup(params).promise().toFuture
    @inline def describeClustersFuture(params: DescribeClustersRequest): Future[DescribeClustersResponse] =
      service.describeClusters(params).promise().toFuture
    @inline def describeDefaultParametersFuture(
        params: DescribeDefaultParametersRequest
    ): Future[DescribeDefaultParametersResponse] = service.describeDefaultParameters(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsRequest): Future[DescribeEventsResponse] =
      service.describeEvents(params).promise().toFuture
    @inline def describeParameterGroupsFuture(
        params: DescribeParameterGroupsRequest
    ): Future[DescribeParameterGroupsResponse] = service.describeParameterGroups(params).promise().toFuture
    @inline def describeParametersFuture(params: DescribeParametersRequest): Future[DescribeParametersResponse] =
      service.describeParameters(params).promise().toFuture
    @inline def describeSubnetGroupsFuture(params: DescribeSubnetGroupsRequest): Future[DescribeSubnetGroupsResponse] =
      service.describeSubnetGroups(params).promise().toFuture
    @inline def increaseReplicationFactorFuture(
        params: IncreaseReplicationFactorRequest
    ): Future[IncreaseReplicationFactorResponse] = service.increaseReplicationFactor(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def rebootNodeFuture(params: RebootNodeRequest): Future[RebootNodeResponse] =
      service.rebootNode(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateClusterFuture(params: UpdateClusterRequest): Future[UpdateClusterResponse] =
      service.updateCluster(params).promise().toFuture
    @inline def updateParameterGroupFuture(params: UpdateParameterGroupRequest): Future[UpdateParameterGroupResponse] =
      service.updateParameterGroup(params).promise().toFuture
    @inline def updateSubnetGroupFuture(params: UpdateSubnetGroupRequest): Future[UpdateSubnetGroupResponse] =
      service.updateSubnetGroup(params).promise().toFuture
  }
}

package dax {
  @js.native
  @JSImport("aws-sdk", "DAX")
  class DAX() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse]                      = js.native
    def createParameterGroup(params: CreateParameterGroupRequest): Request[CreateParameterGroupResponse] = js.native
    def createSubnetGroup(params: CreateSubnetGroupRequest): Request[CreateSubnetGroupResponse]          = js.native
    def decreaseReplicationFactor(
        params: DecreaseReplicationFactorRequest
    ): Request[DecreaseReplicationFactorResponse]                                                        = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse]                      = js.native
    def deleteParameterGroup(params: DeleteParameterGroupRequest): Request[DeleteParameterGroupResponse] = js.native
    def deleteSubnetGroup(params: DeleteSubnetGroupRequest): Request[DeleteSubnetGroupResponse]          = js.native
    def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse]             = js.native
    def describeDefaultParameters(
        params: DescribeDefaultParametersRequest
    ): Request[DescribeDefaultParametersResponse]                                      = js.native
    def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse] = js.native
    def describeParameterGroups(params: DescribeParameterGroupsRequest): Request[DescribeParameterGroupsResponse] =
      js.native
    def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResponse]       = js.native
    def describeSubnetGroups(params: DescribeSubnetGroupsRequest): Request[DescribeSubnetGroupsResponse] = js.native
    def increaseReplicationFactor(
        params: IncreaseReplicationFactorRequest
    ): Request[IncreaseReplicationFactorResponse]                                                        = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse]                                     = js.native
    def rebootNode(params: RebootNodeRequest): Request[RebootNodeResponse]                               = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
    def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResponse]                      = js.native
    def updateParameterGroup(params: UpdateParameterGroupRequest): Request[UpdateParameterGroupResponse] = js.native
    def updateSubnetGroup(params: UpdateSubnetGroupRequest): Request[UpdateSubnetGroupResponse]          = js.native
  }

  @js.native
  sealed trait ChangeType extends js.Any
  object ChangeType extends js.Object {
    val IMMEDIATE       = "IMMEDIATE".asInstanceOf[ChangeType]
    val REQUIRES_REBOOT = "REQUIRES_REBOOT".asInstanceOf[ChangeType]

    val values = js.Object.freeze(js.Array(IMMEDIATE, REQUIRES_REBOOT))
  }

  /**
    * Contains all of the attributes of a specific DAX cluster.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait CreateParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
    var Description: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateParameterGroupResponse extends js.Object {
    var ParameterGroup: js.UndefOr[ParameterGroup]
  }

  @js.native
  @Factory
  trait CreateSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
    var SubnetIds: SubnetIdentifierList
    var Description: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateSubnetGroupResponse extends js.Object {
    var SubnetGroup: js.UndefOr[SubnetGroup]
  }

  @js.native
  @Factory
  trait DecreaseReplicationFactorRequest extends js.Object {
    var ClusterName: String
    var NewReplicationFactor: Int
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var NodeIdsToRemove: js.UndefOr[NodeIdentifierList]
  }

  @js.native
  @Factory
  trait DecreaseReplicationFactorResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait DeleteClusterRequest extends js.Object {
    var ClusterName: String
  }

  @js.native
  @Factory
  trait DeleteClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait DeleteParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
  }

  @js.native
  @Factory
  trait DeleteParameterGroupResponse extends js.Object {
    var DeletionMessage: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
  }

  @js.native
  @Factory
  trait DeleteSubnetGroupResponse extends js.Object {
    var DeletionMessage: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeClustersRequest extends js.Object {
    var ClusterNames: js.UndefOr[ClusterNameList]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeClustersResponse extends js.Object {
    var Clusters: js.UndefOr[ClusterList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDefaultParametersRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDefaultParametersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Parameters: js.UndefOr[ParameterList]
  }

  @js.native
  @Factory
  trait DescribeEventsRequest extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var EndTime: js.UndefOr[TStamp]
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var SourceName: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var StartTime: js.UndefOr[TStamp]
  }

  @js.native
  @Factory
  trait DescribeEventsResponse extends js.Object {
    var Events: js.UndefOr[EventList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeParameterGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var ParameterGroupNames: js.UndefOr[ParameterGroupNameList]
  }

  @js.native
  @Factory
  trait DescribeParameterGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ParameterGroups: js.UndefOr[ParameterGroupList]
  }

  @js.native
  @Factory
  trait DescribeParametersRequest extends js.Object {
    var ParameterGroupName: String
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var Source: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeParametersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Parameters: js.UndefOr[ParameterList]
  }

  @js.native
  @Factory
  trait DescribeSubnetGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerOptional]
    var NextToken: js.UndefOr[String]
    var SubnetGroupNames: js.UndefOr[SubnetGroupNameList]
  }

  @js.native
  @Factory
  trait DescribeSubnetGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SubnetGroups: js.UndefOr[SubnetGroupList]
  }

  /**
    * Represents the information required for client programs to connect to the configuration endpoint for a DAX cluster, or to an individual node within the cluster.
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var Port: js.UndefOr[Int]
  }

  /**
    * Represents a single occurrence of something interesting within the system. Some examples of events are creating a DAX cluster, adding or removing a node, or rebooting a node.
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var Message: js.UndefOr[String]
    var SourceName: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  @js.native
  @Factory
  trait IncreaseReplicationFactorRequest extends js.Object {
    var ClusterName: String
    var NewReplicationFactor: Int
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  @js.native
  @Factory
  trait IncreaseReplicationFactorResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  sealed trait IsModifiable extends js.Any
  object IsModifiable extends js.Object {
    val TRUE        = "TRUE".asInstanceOf[IsModifiable]
    val FALSE       = "FALSE".asInstanceOf[IsModifiable]
    val CONDITIONAL = "CONDITIONAL".asInstanceOf[IsModifiable]

    val values = js.Object.freeze(js.Array(TRUE, FALSE, CONDITIONAL))
  }

  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var ResourceName: String
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Represents an individual node within a DAX cluster.
    */
  @js.native
  @Factory
  trait Node extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var Endpoint: js.UndefOr[Endpoint]
    var NodeCreateTime: js.UndefOr[TStamp]
    var NodeId: js.UndefOr[String]
    var NodeStatus: js.UndefOr[String]
    var ParameterGroupStatus: js.UndefOr[String]
  }

  /**
    * Represents a parameter value that is applicable to a particular node type.
    */
  @js.native
  @Factory
  trait NodeTypeSpecificValue extends js.Object {
    var NodeType: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * Describes a notification topic and its status. Notification topics are used for publishing DAX events to subscribers using Amazon Simple Notification Service (SNS).
    */
  @js.native
  @Factory
  trait NotificationConfiguration extends js.Object {
    var TopicArn: js.UndefOr[String]
    var TopicStatus: js.UndefOr[String]
  }

  /**
    * Describes an individual setting that controls some aspect of DAX behavior.
    */
  @js.native
  @Factory
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

  /**
    * A named set of parameters that are applied to all of the nodes in a DAX cluster.
    */
  @js.native
  @Factory
  trait ParameterGroup extends js.Object {
    var Description: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
  }

  /**
    * The status of a parameter group.
    */
  @js.native
  @Factory
  trait ParameterGroupStatus extends js.Object {
    var NodeIdsToReboot: js.UndefOr[NodeIdentifierList]
    var ParameterApplyStatus: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
  }

  /**
    * An individual DAX parameter.
    */
  @js.native
  @Factory
  trait ParameterNameValue extends js.Object {
    var ParameterName: js.UndefOr[String]
    var ParameterValue: js.UndefOr[String]
  }

  @js.native
  sealed trait ParameterType extends js.Any
  object ParameterType extends js.Object {
    val DEFAULT            = "DEFAULT".asInstanceOf[ParameterType]
    val NODE_TYPE_SPECIFIC = "NODE_TYPE_SPECIFIC".asInstanceOf[ParameterType]

    val values = js.Object.freeze(js.Array(DEFAULT, NODE_TYPE_SPECIFIC))
  }

  @js.native
  @Factory
  trait RebootNodeRequest extends js.Object {
    var ClusterName: String
    var NodeId: String
  }

  @js.native
  @Factory
  trait RebootNodeResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  /**
    * The description of the server-side encryption status on the specified DAX cluster.
    */
  @js.native
  @Factory
  trait SSEDescription extends js.Object {
    var Status: js.UndefOr[SSEStatus]
  }

  /**
    * Represents the settings used to enable server-side encryption.
    */
  @js.native
  @Factory
  trait SSESpecification extends js.Object {
    var Enabled: SSEEnabled
  }

  @js.native
  sealed trait SSEStatus extends js.Any
  object SSEStatus extends js.Object {
    val ENABLING  = "ENABLING".asInstanceOf[SSEStatus]
    val ENABLED   = "ENABLED".asInstanceOf[SSEStatus]
    val DISABLING = "DISABLING".asInstanceOf[SSEStatus]
    val DISABLED  = "DISABLED".asInstanceOf[SSEStatus]

    val values = js.Object.freeze(js.Array(ENABLING, ENABLED, DISABLING, DISABLED))
  }

  /**
    * An individual VPC security group and its status.
    */
  @js.native
  @Factory
  trait SecurityGroupMembership extends js.Object {
    var SecurityGroupIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val CLUSTER         = "CLUSTER".asInstanceOf[SourceType]
    val PARAMETER_GROUP = "PARAMETER_GROUP".asInstanceOf[SourceType]
    val SUBNET_GROUP    = "SUBNET_GROUP".asInstanceOf[SourceType]

    val values = js.Object.freeze(js.Array(CLUSTER, PARAMETER_GROUP, SUBNET_GROUP))
  }

  /**
    * Represents the subnet associated with a DAX cluster. This parameter refers to subnets defined in Amazon Virtual Private Cloud (Amazon VPC) and used with DAX.
    */
  @js.native
  @Factory
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[String]
    var SubnetIdentifier: js.UndefOr[String]
  }

  /**
    * Represents the output of one of the following actions:
    * * <i>CreateSubnetGroup</i>
    *  * <i>ModifySubnetGroup</i>
    */
  @js.native
  @Factory
  trait SubnetGroup extends js.Object {
    var Description: js.UndefOr[String]
    var SubnetGroupName: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * A description of a tag. Every tag is a key-value pair. You can add up to 50 tags to a single DAX cluster.
    *  AWS-assigned tag names and values are automatically assigned the <code>aws:</code> prefix, which the user cannot assign. AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix <code>user:</code>.
    *  You cannot backdate the application of a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait UpdateClusterRequest extends js.Object {
    var ClusterName: String
    var Description: js.UndefOr[String]
    var NotificationTopicArn: js.UndefOr[String]
    var NotificationTopicStatus: js.UndefOr[String]
    var ParameterGroupName: js.UndefOr[String]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList]
  }

  @js.native
  @Factory
  trait UpdateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait UpdateParameterGroupRequest extends js.Object {
    var ParameterGroupName: String
    var ParameterNameValues: ParameterNameValueList
  }

  @js.native
  @Factory
  trait UpdateParameterGroupResponse extends js.Object {
    var ParameterGroup: js.UndefOr[ParameterGroup]
  }

  @js.native
  @Factory
  trait UpdateSubnetGroupRequest extends js.Object {
    var SubnetGroupName: String
    var Description: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  @js.native
  @Factory
  trait UpdateSubnetGroupResponse extends js.Object {
    var SubnetGroup: js.UndefOr[SubnetGroup]
  }
}
