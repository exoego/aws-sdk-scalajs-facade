package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object kafka {
  type BrokerAZDistribution  = String
  type ClusterState          = String
  type EnhancedMonitoring    = String
  type MaxResults            = Int
  type NodeType              = String
  type __double              = Double
  type __integer             = Int
  type __integerMin1Max15    = Int
  type __integerMin1Max16384 = Int
  type __listOfClusterInfo   = js.Array[ClusterInfo]
  type __listOfNodeInfo      = js.Array[NodeInfo]
  type __listOf__string      = js.Array[__string]
  type __string              = String
  type __stringMin1Max128    = String
  type __stringMin1Max64     = String
  type __stringMin5Max32     = String
  type __timestampIso8601    = js.Date

  implicit final class KafkaOps(val service: Kafka) extends AnyVal {

    def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise.toFuture
    def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise.toFuture
    def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] =
      service.describeCluster(params).promise.toFuture
    def getBootstrapBrokersFuture(params: GetBootstrapBrokersRequest): Future[GetBootstrapBrokersResponse] =
      service.getBootstrapBrokers(params).promise.toFuture
    def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] =
      service.listClusters(params).promise.toFuture
    def listNodesFuture(params: ListNodesRequest): Future[ListNodesResponse] =
      service.listNodes(params).promise.toFuture
  }
}

package kafka {
  @js.native
  @JSImport("aws-sdk", "Kafka")
  class Kafka() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse]                   = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse]                   = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse]             = js.native
    def getBootstrapBrokers(params: GetBootstrapBrokersRequest): Request[GetBootstrapBrokersResponse] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse]                      = js.native
    def listNodes(params: ListNodesRequest): Request[ListNodesResponse]                               = js.native
  }

  /**
    * The distribution of broker nodes across Availability Zones. By default, broker nodes are distributed among three Availability Zones. Currently, the only supported value is DEFAULT. You can either specify this value explicitly or leave it out.
    */
  object BrokerAZDistributionEnum {
    val DEFAULT = "DEFAULT"

    val values = IndexedSeq(DEFAULT)
  }

  /**
    * Describes the setup to be used for Kafka broker nodes in the cluster.
    */
  @js.native
  trait BrokerNodeGroupInfo extends js.Object {
    var ClientSubnets: __listOf__string
    var InstanceType: __stringMin5Max32
    var BrokerAZDistribution: js.UndefOr[BrokerAZDistribution]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var StorageInfo: js.UndefOr[StorageInfo]
  }

  object BrokerNodeGroupInfo {
    def apply(
        ClientSubnets: __listOf__string,
        InstanceType: __stringMin5Max32,
        BrokerAZDistribution: js.UndefOr[BrokerAZDistribution] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        StorageInfo: js.UndefOr[StorageInfo] = js.undefined
    ): BrokerNodeGroupInfo = {
      val __obj = js.Dictionary[js.Any](
        "ClientSubnets" -> ClientSubnets.asInstanceOf[js.Any],
        "InstanceType"  -> InstanceType.asInstanceOf[js.Any]
      )

      BrokerAZDistribution.foreach(__v => __obj.update("BrokerAZDistribution", __v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.update("SecurityGroups", __v.asInstanceOf[js.Any]))
      StorageInfo.foreach(__v => __obj.update("StorageInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerNodeGroupInfo]
    }
  }

  @js.native
  trait BrokerNodeInfo extends js.Object {
    var AttachedENIId: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__double]
    var ClientSubnet: js.UndefOr[__string]
    var ClientVpcIpAddress: js.UndefOr[__string]
    var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo]
  }

  object BrokerNodeInfo {
    def apply(
        AttachedENIId: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__double] = js.undefined,
        ClientSubnet: js.UndefOr[__string] = js.undefined,
        ClientVpcIpAddress: js.UndefOr[__string] = js.undefined,
        CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined
    ): BrokerNodeInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      AttachedENIId.foreach(__v => __obj.update("AttachedENIId", __v.asInstanceOf[js.Any]))
      BrokerId.foreach(__v => __obj.update("BrokerId", __v.asInstanceOf[js.Any]))
      ClientSubnet.foreach(__v => __obj.update("ClientSubnet", __v.asInstanceOf[js.Any]))
      ClientVpcIpAddress.foreach(__v => __obj.update("ClientVpcIpAddress", __v.asInstanceOf[js.Any]))
      CurrentBrokerSoftwareInfo.foreach(__v => __obj.update("CurrentBrokerSoftwareInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerNodeInfo]
    }
  }

  /**
    * Information about the current software installed on the cluster.
    */
  @js.native
  trait BrokerSoftwareInfo extends js.Object {
    var ConfigurationArn: js.UndefOr[__string]
    var ConfigurationRevision: js.UndefOr[__string]
    var KafkaVersion: js.UndefOr[__string]
  }

  object BrokerSoftwareInfo {
    def apply(
        ConfigurationArn: js.UndefOr[__string] = js.undefined,
        ConfigurationRevision: js.UndefOr[__string] = js.undefined,
        KafkaVersion: js.UndefOr[__string] = js.undefined
    ): BrokerSoftwareInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationArn.foreach(__v => __obj.update("ConfigurationArn", __v.asInstanceOf[js.Any]))
      ConfigurationRevision.foreach(__v => __obj.update("ConfigurationRevision", __v.asInstanceOf[js.Any]))
      KafkaVersion.foreach(__v => __obj.update("KafkaVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerSoftwareInfo]
    }
  }

  /**
    * Returns information about a cluster.
    */
  @js.native
  trait ClusterInfo extends js.Object {
    var BrokerNodeGroupInfo: js.UndefOr[BrokerNodeGroupInfo]
    var ClusterArn: js.UndefOr[__string]
    var ClusterName: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo]
    var CurrentVersion: js.UndefOr[__string]
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var NumberOfBrokerNodes: js.UndefOr[__integer]
    var State: js.UndefOr[ClusterState]
    var ZookeeperConnectString: js.UndefOr[__string]
  }

  object ClusterInfo {
    def apply(
        BrokerNodeGroupInfo: js.UndefOr[BrokerNodeGroupInfo] = js.undefined,
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterName: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined,
        CurrentVersion: js.UndefOr[__string] = js.undefined,
        EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
        EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined,
        NumberOfBrokerNodes: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined,
        ZookeeperConnectString: js.UndefOr[__string] = js.undefined
    ): ClusterInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      BrokerNodeGroupInfo.foreach(__v => __obj.update("BrokerNodeGroupInfo", __v.asInstanceOf[js.Any]))
      ClusterArn.foreach(__v => __obj.update("ClusterArn", __v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.update("ClusterName", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      CurrentBrokerSoftwareInfo.foreach(__v => __obj.update("CurrentBrokerSoftwareInfo", __v.asInstanceOf[js.Any]))
      CurrentVersion.foreach(__v => __obj.update("CurrentVersion", __v.asInstanceOf[js.Any]))
      EncryptionInfo.foreach(__v => __obj.update("EncryptionInfo", __v.asInstanceOf[js.Any]))
      EnhancedMonitoring.foreach(__v => __obj.update("EnhancedMonitoring", __v.asInstanceOf[js.Any]))
      NumberOfBrokerNodes.foreach(__v => __obj.update("NumberOfBrokerNodes", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      ZookeeperConnectString.foreach(__v => __obj.update("ZookeeperConnectString", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterInfo]
    }
  }

  /**
    * The state of a Kafka cluster.
    */
  object ClusterStateEnum {
    val ACTIVE   = "ACTIVE"
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val FAILED   = "FAILED"

    val values = IndexedSeq(ACTIVE, CREATING, DELETING, FAILED)
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var BrokerNodeGroupInfo: BrokerNodeGroupInfo
    var ClusterName: __stringMin1Max64
    var KafkaVersion: __stringMin1Max128
    var NumberOfBrokerNodes: __integerMin1Max15
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
  }

  object CreateClusterRequest {
    def apply(
        BrokerNodeGroupInfo: BrokerNodeGroupInfo,
        ClusterName: __stringMin1Max64,
        KafkaVersion: __stringMin1Max128,
        NumberOfBrokerNodes: __integerMin1Max15,
        EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
        EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "BrokerNodeGroupInfo" -> BrokerNodeGroupInfo.asInstanceOf[js.Any],
        "ClusterName"         -> ClusterName.asInstanceOf[js.Any],
        "KafkaVersion"        -> KafkaVersion.asInstanceOf[js.Any],
        "NumberOfBrokerNodes" -> NumberOfBrokerNodes.asInstanceOf[js.Any]
      )

      EncryptionInfo.foreach(__v => __obj.update("EncryptionInfo", __v.asInstanceOf[js.Any]))
      EnhancedMonitoring.foreach(__v => __obj.update("EnhancedMonitoring", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterName: js.UndefOr[__string]
    var State: js.UndefOr[ClusterState]
  }

  object CreateClusterResponse {
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterName: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterArn.foreach(__v => __obj.update("ClusterArn", __v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.update("ClusterName", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: js.UndefOr[__string]
  }

  object DeleteClusterRequest {
    def apply(
        ClusterArn: __string,
        CurrentVersion: js.UndefOr[__string] = js.undefined
    ): DeleteClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )

      CurrentVersion.foreach(__v => __obj.update("CurrentVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var State: js.UndefOr[ClusterState]
  }

  object DeleteClusterResponse {
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined
    ): DeleteClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterArn.foreach(__v => __obj.update("ClusterArn", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var ClusterArn: __string
  }

  object DescribeClusterRequest {
    def apply(
        ClusterArn: __string
    ): DescribeClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResponse extends js.Object {
    var ClusterInfo: js.UndefOr[ClusterInfo]
  }

  object DescribeClusterResponse {
    def apply(
        ClusterInfo: js.UndefOr[ClusterInfo] = js.undefined
    ): DescribeClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterInfo.foreach(__v => __obj.update("ClusterInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterResponse]
    }
  }

  /**
    * Contains information about the EBS storage volumes attached to Kafka broker nodes.
    */
  @js.native
  trait EBSStorageInfo extends js.Object {
    var VolumeSize: js.UndefOr[__integerMin1Max16384]
  }

  object EBSStorageInfo {
    def apply(
        VolumeSize: js.UndefOr[__integerMin1Max16384] = js.undefined
    ): EBSStorageInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      VolumeSize.foreach(__v => __obj.update("VolumeSize", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EBSStorageInfo]
    }
  }

  /**
    * The data volume encryption details.
    */
  @js.native
  trait EncryptionAtRest extends js.Object {
    var DataVolumeKMSKeyId: __string
  }

  object EncryptionAtRest {
    def apply(
        DataVolumeKMSKeyId: __string
    ): EncryptionAtRest = {
      val __obj = js.Dictionary[js.Any](
        "DataVolumeKMSKeyId" -> DataVolumeKMSKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EncryptionAtRest]
    }
  }

  /**
    * Includes encryption-related information, such as the AWS KMS key used for encrypting data at rest.
    */
  @js.native
  trait EncryptionInfo extends js.Object {
    var EncryptionAtRest: js.UndefOr[EncryptionAtRest]
  }

  object EncryptionInfo {
    def apply(
        EncryptionAtRest: js.UndefOr[EncryptionAtRest] = js.undefined
    ): EncryptionInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      EncryptionAtRest.foreach(__v => __obj.update("EncryptionAtRest", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionInfo]
    }
  }

  /**
    * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
    */
  object EnhancedMonitoringEnum {
    val DEFAULT              = "DEFAULT"
    val PER_BROKER           = "PER_BROKER"
    val PER_TOPIC_PER_BROKER = "PER_TOPIC_PER_BROKER"

    val values = IndexedSeq(DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER)
  }

  @js.native
  trait GetBootstrapBrokersRequest extends js.Object {
    var ClusterArn: __string
  }

  object GetBootstrapBrokersRequest {
    def apply(
        ClusterArn: __string
    ): GetBootstrapBrokersRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBootstrapBrokersRequest]
    }
  }

  @js.native
  trait GetBootstrapBrokersResponse extends js.Object {
    var BootstrapBrokerString: js.UndefOr[__string]
  }

  object GetBootstrapBrokersResponse {
    def apply(
        BootstrapBrokerString: js.UndefOr[__string] = js.undefined
    ): GetBootstrapBrokersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      BootstrapBrokerString.foreach(__v => __obj.update("BootstrapBrokerString", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBootstrapBrokersResponse]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var ClusterNameFilter: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersRequest {
    def apply(
        ClusterNameFilter: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClustersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterNameFilter.foreach(__v => __obj.update("ClusterNameFilter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var ClusterInfoList: js.UndefOr[__listOfClusterInfo]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersResponse {
    def apply(
        ClusterInfoList: js.UndefOr[__listOfClusterInfo] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClustersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ClusterInfoList.foreach(__v => __obj.update("ClusterInfoList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListNodesRequest extends js.Object {
    var ClusterArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListNodesRequest {
    def apply(
        ClusterArn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListNodesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesRequest]
    }
  }

  @js.native
  trait ListNodesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var NodeInfoList: js.UndefOr[__listOfNodeInfo]
  }

  object ListNodesResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        NodeInfoList: js.UndefOr[__listOfNodeInfo] = js.undefined
    ): ListNodesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      NodeInfoList.foreach(__v => __obj.update("NodeInfoList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesResponse]
    }
  }

  /**
    * The node information object.
    */
  @js.native
  trait NodeInfo extends js.Object {
    var AddedToClusterTime: js.UndefOr[__string]
    var BrokerNodeInfo: js.UndefOr[BrokerNodeInfo]
    var InstanceType: js.UndefOr[__string]
    var NodeARN: js.UndefOr[__string]
    var NodeType: js.UndefOr[NodeType]
    var ZookeeperNodeInfo: js.UndefOr[ZookeeperNodeInfo]
  }

  object NodeInfo {
    def apply(
        AddedToClusterTime: js.UndefOr[__string] = js.undefined,
        BrokerNodeInfo: js.UndefOr[BrokerNodeInfo] = js.undefined,
        InstanceType: js.UndefOr[__string] = js.undefined,
        NodeARN: js.UndefOr[__string] = js.undefined,
        NodeType: js.UndefOr[NodeType] = js.undefined,
        ZookeeperNodeInfo: js.UndefOr[ZookeeperNodeInfo] = js.undefined
    ): NodeInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      AddedToClusterTime.foreach(__v => __obj.update("AddedToClusterTime", __v.asInstanceOf[js.Any]))
      BrokerNodeInfo.foreach(__v => __obj.update("BrokerNodeInfo", __v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      NodeARN.foreach(__v => __obj.update("NodeARN", __v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.update("NodeType", __v.asInstanceOf[js.Any]))
      ZookeeperNodeInfo.foreach(__v => __obj.update("ZookeeperNodeInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeInfo]
    }
  }

  /**
    * The broker or Zookeeper node.
    */
  object NodeTypeEnum {
    val BROKER = "BROKER"

    val values = IndexedSeq(BROKER)
  }

  /**
    * Contains information about storage volumes attached to MSK broker nodes.
    */
  @js.native
  trait StorageInfo extends js.Object {
    var EbsStorageInfo: js.UndefOr[EBSStorageInfo]
  }

  object StorageInfo {
    def apply(
        EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.undefined
    ): StorageInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      EbsStorageInfo.foreach(__v => __obj.update("EbsStorageInfo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageInfo]
    }
  }

  /**
    * Zookeeper node information.
    */
  @js.native
  trait ZookeeperNodeInfo extends js.Object {
    var AttachedENIId: js.UndefOr[__string]
    var ClientVpcIpAddress: js.UndefOr[__string]
    var ZookeeperId: js.UndefOr[__double]
    var ZookeeperVersion: js.UndefOr[__string]
  }

  object ZookeeperNodeInfo {
    def apply(
        AttachedENIId: js.UndefOr[__string] = js.undefined,
        ClientVpcIpAddress: js.UndefOr[__string] = js.undefined,
        ZookeeperId: js.UndefOr[__double] = js.undefined,
        ZookeeperVersion: js.UndefOr[__string] = js.undefined
    ): ZookeeperNodeInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      AttachedENIId.foreach(__v => __obj.update("AttachedENIId", __v.asInstanceOf[js.Any]))
      ClientVpcIpAddress.foreach(__v => __obj.update("ClientVpcIpAddress", __v.asInstanceOf[js.Any]))
      ZookeeperId.foreach(__v => __obj.update("ZookeeperId", __v.asInstanceOf[js.Any]))
      ZookeeperVersion.foreach(__v => __obj.update("ZookeeperVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ZookeeperNodeInfo]
    }
  }
}
