package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
    def apply(ClientSubnets: __listOf__string,
              InstanceType: __stringMin5Max32,
              BrokerAZDistribution: js.UndefOr[BrokerAZDistribution] = js.undefined,
              SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
              StorageInfo: js.UndefOr[StorageInfo] = js.undefined): BrokerNodeGroupInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientSubnets" -> ClientSubnets.asInstanceOf[js.Any],
        "InstanceType"  -> InstanceType.asInstanceOf[js.Any],
        "BrokerAZDistribution" -> BrokerAZDistribution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroups" -> SecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageInfo" -> StorageInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BrokerNodeGroupInfo]
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
    def apply(AttachedENIId: js.UndefOr[__string] = js.undefined,
              BrokerId: js.UndefOr[__double] = js.undefined,
              ClientSubnet: js.UndefOr[__string] = js.undefined,
              ClientVpcIpAddress: js.UndefOr[__string] = js.undefined,
              CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined): BrokerNodeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedENIId" -> AttachedENIId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerId" -> BrokerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientSubnet" -> ClientSubnet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientVpcIpAddress" -> ClientVpcIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentBrokerSoftwareInfo" -> CurrentBrokerSoftwareInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BrokerNodeInfo]
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
    def apply(ConfigurationArn: js.UndefOr[__string] = js.undefined,
              ConfigurationRevision: js.UndefOr[__string] = js.undefined,
              KafkaVersion: js.UndefOr[__string] = js.undefined): BrokerSoftwareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationArn" -> ConfigurationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationRevision" -> ConfigurationRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KafkaVersion" -> KafkaVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BrokerSoftwareInfo]
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
    def apply(BrokerNodeGroupInfo: js.UndefOr[BrokerNodeGroupInfo] = js.undefined,
              ClusterArn: js.UndefOr[__string] = js.undefined,
              ClusterName: js.UndefOr[__string] = js.undefined,
              CreationTime: js.UndefOr[__timestampIso8601] = js.undefined,
              CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined,
              CurrentVersion: js.UndefOr[__string] = js.undefined,
              EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
              EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined,
              NumberOfBrokerNodes: js.UndefOr[__integer] = js.undefined,
              State: js.UndefOr[ClusterState] = js.undefined,
              ZookeeperConnectString: js.UndefOr[__string] = js.undefined): ClusterInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerNodeGroupInfo" -> BrokerNodeGroupInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterArn" -> ClusterArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterName" -> ClusterName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentBrokerSoftwareInfo" -> CurrentBrokerSoftwareInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentVersion" -> CurrentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncryptionInfo" -> EncryptionInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedMonitoring" -> EnhancedMonitoring.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfBrokerNodes" -> NumberOfBrokerNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZookeeperConnectString" -> ZookeeperConnectString.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterInfo]
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
    def apply(BrokerNodeGroupInfo: BrokerNodeGroupInfo,
              ClusterName: __stringMin1Max64,
              KafkaVersion: __stringMin1Max128,
              NumberOfBrokerNodes: __integerMin1Max15,
              EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
              EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined): CreateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerNodeGroupInfo" -> BrokerNodeGroupInfo.asInstanceOf[js.Any],
        "ClusterName"         -> ClusterName.asInstanceOf[js.Any],
        "KafkaVersion"        -> KafkaVersion.asInstanceOf[js.Any],
        "NumberOfBrokerNodes" -> NumberOfBrokerNodes.asInstanceOf[js.Any],
        "EncryptionInfo" -> EncryptionInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnhancedMonitoring" -> EnhancedMonitoring.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterName: js.UndefOr[__string]
    var State: js.UndefOr[ClusterState]
  }

  object CreateClusterResponse {
    def apply(ClusterArn: js.UndefOr[__string] = js.undefined,
              ClusterName: js.UndefOr[__string] = js.undefined,
              State: js.UndefOr[ClusterState] = js.undefined): CreateClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterArn" -> ClusterArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClusterName" -> ClusterName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: js.UndefOr[__string]
  }

  object DeleteClusterRequest {
    def apply(ClusterArn: __string, CurrentVersion: js.UndefOr[__string] = js.undefined): DeleteClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var State: js.UndefOr[ClusterState]
  }

  object DeleteClusterResponse {
    def apply(ClusterArn: js.UndefOr[__string] = js.undefined,
              State: js.UndefOr[ClusterState] = js.undefined): DeleteClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterArn" -> ClusterArn.map { x =>
        x.asInstanceOf[js.Any]
      }, "State" -> State.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var ClusterArn: __string
  }

  object DescribeClusterRequest {
    def apply(ClusterArn: __string): DescribeClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterArn" -> ClusterArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResponse extends js.Object {
    var ClusterInfo: js.UndefOr[ClusterInfo]
  }

  object DescribeClusterResponse {
    def apply(ClusterInfo: js.UndefOr[ClusterInfo] = js.undefined): DescribeClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterInfo" -> ClusterInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterResponse]
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
    def apply(VolumeSize: js.UndefOr[__integerMin1Max16384] = js.undefined): EBSStorageInfo = {
      val _fields = IndexedSeq[(String, js.Any)]("VolumeSize" -> VolumeSize.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EBSStorageInfo]
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
    def apply(DataVolumeKMSKeyId: __string): EncryptionAtRest = {
      val _fields = IndexedSeq[(String, js.Any)]("DataVolumeKMSKeyId" -> DataVolumeKMSKeyId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionAtRest]
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
    def apply(EncryptionAtRest: js.UndefOr[EncryptionAtRest] = js.undefined): EncryptionInfo = {
      val _fields = IndexedSeq[(String, js.Any)]("EncryptionAtRest" -> EncryptionAtRest.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionInfo]
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
    def apply(ClusterArn: __string): GetBootstrapBrokersRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterArn" -> ClusterArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBootstrapBrokersRequest]
    }
  }

  @js.native
  trait GetBootstrapBrokersResponse extends js.Object {
    var BootstrapBrokerString: js.UndefOr[__string]
  }

  object GetBootstrapBrokersResponse {
    def apply(BootstrapBrokerString: js.UndefOr[__string] = js.undefined): GetBootstrapBrokersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("BootstrapBrokerString" -> BootstrapBrokerString.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBootstrapBrokersResponse]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var ClusterNameFilter: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersRequest {
    def apply(ClusterNameFilter: js.UndefOr[__string] = js.undefined,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterNameFilter" -> ClusterNameFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var ClusterInfoList: js.UndefOr[__listOfClusterInfo]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersResponse {
    def apply(ClusterInfoList: js.UndefOr[__listOfClusterInfo] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("ClusterInfoList" -> ClusterInfoList.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListNodesRequest extends js.Object {
    var ClusterArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListNodesRequest {
    def apply(ClusterArn: __string,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListNodesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNodesRequest]
    }
  }

  @js.native
  trait ListNodesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var NodeInfoList: js.UndefOr[__listOfNodeInfo]
  }

  object ListNodesResponse {
    def apply(NextToken: js.UndefOr[__string] = js.undefined,
              NodeInfoList: js.UndefOr[__listOfNodeInfo] = js.undefined): ListNodesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "NodeInfoList" -> NodeInfoList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNodesResponse]
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
    def apply(AddedToClusterTime: js.UndefOr[__string] = js.undefined,
              BrokerNodeInfo: js.UndefOr[BrokerNodeInfo] = js.undefined,
              InstanceType: js.UndefOr[__string] = js.undefined,
              NodeARN: js.UndefOr[__string] = js.undefined,
              NodeType: js.UndefOr[NodeType] = js.undefined,
              ZookeeperNodeInfo: js.UndefOr[ZookeeperNodeInfo] = js.undefined): NodeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddedToClusterTime" -> AddedToClusterTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerNodeInfo" -> BrokerNodeInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeARN" -> NodeARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NodeType" -> NodeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZookeeperNodeInfo" -> ZookeeperNodeInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeInfo]
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
    def apply(EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.undefined): StorageInfo = {
      val _fields = IndexedSeq[(String, js.Any)]("EbsStorageInfo" -> EbsStorageInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageInfo]
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
    def apply(AttachedENIId: js.UndefOr[__string] = js.undefined,
              ClientVpcIpAddress: js.UndefOr[__string] = js.undefined,
              ZookeeperId: js.UndefOr[__double] = js.undefined,
              ZookeeperVersion: js.UndefOr[__string] = js.undefined): ZookeeperNodeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedENIId" -> AttachedENIId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientVpcIpAddress" -> ClientVpcIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZookeeperId" -> ZookeeperId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZookeeperVersion" -> ZookeeperVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ZookeeperNodeInfo]
    }
  }
}
