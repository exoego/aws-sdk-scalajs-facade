package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object kafka {
  type MaxResults                    = Int
  type __blob                        = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type __boolean                     = Boolean
  type __double                      = Double
  type __integer                     = Int
  type __integerMin1Max15            = Int
  type __integerMin1Max16384         = Int
  type __listOfBrokerEBSVolumeInfo   = js.Array[BrokerEBSVolumeInfo]
  type __listOfClusterInfo           = js.Array[ClusterInfo]
  type __listOfClusterOperationInfo  = js.Array[ClusterOperationInfo]
  type __listOfConfiguration         = js.Array[Configuration]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfKafkaVersion          = js.Array[KafkaVersion]
  type __listOfNodeInfo              = js.Array[NodeInfo]
  type __listOf__string              = js.Array[__string]
  type __long                        = Double
  type __mapOf__string               = js.Dictionary[__string]
  type __string                      = String
  type __stringMin1Max128            = String
  type __stringMin1Max64             = String
  type __stringMin5Max32             = String
  type __timestampIso8601            = js.Date

  implicit final class KafkaOps(private val service: Kafka) extends AnyVal {

    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise().toFuture
    @inline def createConfigurationFuture(params: CreateConfigurationRequest): Future[CreateConfigurationResponse] =
      service.createConfiguration(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] =
      service.describeCluster(params).promise().toFuture
    @inline def describeClusterOperationFuture(
        params: DescribeClusterOperationRequest
    ): Future[DescribeClusterOperationResponse] = service.describeClusterOperation(params).promise().toFuture
    @inline def describeConfigurationFuture(
        params: DescribeConfigurationRequest
    ): Future[DescribeConfigurationResponse] = service.describeConfiguration(params).promise().toFuture
    @inline def describeConfigurationRevisionFuture(
        params: DescribeConfigurationRevisionRequest
    ): Future[DescribeConfigurationRevisionResponse] = service.describeConfigurationRevision(params).promise().toFuture
    @inline def getBootstrapBrokersFuture(params: GetBootstrapBrokersRequest): Future[GetBootstrapBrokersResponse] =
      service.getBootstrapBrokers(params).promise().toFuture
    @inline def listClusterOperationsFuture(
        params: ListClusterOperationsRequest
    ): Future[ListClusterOperationsResponse] = service.listClusterOperations(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] =
      service.listClusters(params).promise().toFuture
    @inline def listConfigurationRevisionsFuture(
        params: ListConfigurationRevisionsRequest
    ): Future[ListConfigurationRevisionsResponse] = service.listConfigurationRevisions(params).promise().toFuture
    @inline def listConfigurationsFuture(params: ListConfigurationsRequest): Future[ListConfigurationsResponse] =
      service.listConfigurations(params).promise().toFuture
    @inline def listKafkaVersionsFuture(params: ListKafkaVersionsRequest): Future[ListKafkaVersionsResponse] =
      service.listKafkaVersions(params).promise().toFuture
    @inline def listNodesFuture(params: ListNodesRequest): Future[ListNodesResponse] =
      service.listNodes(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateBrokerCountFuture(params: UpdateBrokerCountRequest): Future[UpdateBrokerCountResponse] =
      service.updateBrokerCount(params).promise().toFuture
    @inline def updateBrokerStorageFuture(params: UpdateBrokerStorageRequest): Future[UpdateBrokerStorageResponse] =
      service.updateBrokerStorage(params).promise().toFuture
    @inline def updateClusterConfigurationFuture(
        params: UpdateClusterConfigurationRequest
    ): Future[UpdateClusterConfigurationResponse] = service.updateClusterConfiguration(params).promise().toFuture
    @inline def updateMonitoringFuture(params: UpdateMonitoringRequest): Future[UpdateMonitoringResponse] =
      service.updateMonitoring(params).promise().toFuture
  }
}

package kafka {
  @js.native
  @JSImport("aws-sdk", "Kafka")
  class Kafka() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse]                   = js.native
    def createConfiguration(params: CreateConfigurationRequest): Request[CreateConfigurationResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse]                   = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse]             = js.native
    def describeClusterOperation(params: DescribeClusterOperationRequest): Request[DescribeClusterOperationResponse] =
      js.native
    def describeConfiguration(params: DescribeConfigurationRequest): Request[DescribeConfigurationResponse] = js.native
    def describeConfigurationRevision(
        params: DescribeConfigurationRevisionRequest
    ): Request[DescribeConfigurationRevisionResponse]                                                       = js.native
    def getBootstrapBrokers(params: GetBootstrapBrokersRequest): Request[GetBootstrapBrokersResponse]       = js.native
    def listClusterOperations(params: ListClusterOperationsRequest): Request[ListClusterOperationsResponse] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse]                            = js.native
    def listConfigurationRevisions(
        params: ListConfigurationRevisionsRequest
    ): Request[ListConfigurationRevisionsResponse]                                                    = js.native
    def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse]    = js.native
    def listKafkaVersions(params: ListKafkaVersionsRequest): Request[ListKafkaVersionsResponse]       = js.native
    def listNodes(params: ListNodesRequest): Request[ListNodesResponse]                               = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                   = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                               = js.native
    def updateBrokerCount(params: UpdateBrokerCountRequest): Request[UpdateBrokerCountResponse]       = js.native
    def updateBrokerStorage(params: UpdateBrokerStorageRequest): Request[UpdateBrokerStorageResponse] = js.native
    def updateClusterConfiguration(
        params: UpdateClusterConfigurationRequest
    ): Request[UpdateClusterConfigurationResponse]                                           = js.native
    def updateMonitoring(params: UpdateMonitoringRequest): Request[UpdateMonitoringResponse] = js.native
  }

  /**
    *             The distribution of broker nodes across Availability Zones. This is an optional parameter. If you don't specify it, Amazon MSK gives it the value DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No other values are currently allowed.
    *          Amazon MSK distributes the broker nodes evenly across the Availability Zones that correspond to the subnets you provide when you create the cluster.
    */
  @js.native
  sealed trait BrokerAZDistribution extends js.Any
  object BrokerAZDistribution extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[BrokerAZDistribution]

    val values = js.Object.freeze(js.Array(DEFAULT))
  }

  /**
    *             Specifies the EBS volume upgrade information. The broker identifier must be set to the keyword ALL. This means the changes apply to all the brokers in the cluster.
    */
  @js.native
  @Factory
  trait BrokerEBSVolumeInfo extends js.Object {
    var KafkaBrokerNodeId: __string
    var VolumeSizeGB: __integer
  }

  /**
    *             Describes the setup to be used for Kafka broker nodes in the cluster.
    */
  @js.native
  @Factory
  trait BrokerNodeGroupInfo extends js.Object {
    var ClientSubnets: __listOf__string
    var InstanceType: __stringMin5Max32
    var BrokerAZDistribution: js.UndefOr[BrokerAZDistribution]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var StorageInfo: js.UndefOr[StorageInfo]
  }

  /**
    *             BrokerNodeInfo
    */
  @js.native
  @Factory
  trait BrokerNodeInfo extends js.Object {
    var AttachedENIId: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__double]
    var ClientSubnet: js.UndefOr[__string]
    var ClientVpcIpAddress: js.UndefOr[__string]
    var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo]
    var Endpoints: js.UndefOr[__listOf__string]
  }

  /**
    *             Information about the current software installed on the cluster.
    */
  @js.native
  @Factory
  trait BrokerSoftwareInfo extends js.Object {
    var ConfigurationArn: js.UndefOr[__string]
    var ConfigurationRevision: js.UndefOr[__long]
    var KafkaVersion: js.UndefOr[__string]
  }

  /**
    *             Includes all client authentication information.
    */
  @js.native
  @Factory
  trait ClientAuthentication extends js.Object {
    var Tls: js.UndefOr[Tls]
  }

  /**
    *             Client-broker encryption in transit setting.
    */
  @js.native
  sealed trait ClientBroker extends js.Any
  object ClientBroker extends js.Object {
    val TLS           = "TLS".asInstanceOf[ClientBroker]
    val TLS_PLAINTEXT = "TLS_PLAINTEXT".asInstanceOf[ClientBroker]
    val PLAINTEXT     = "PLAINTEXT".asInstanceOf[ClientBroker]

    val values = js.Object.freeze(js.Array(TLS, TLS_PLAINTEXT, PLAINTEXT))
  }

  /**
    *             Returns information about a cluster.
    */
  @js.native
  @Factory
  trait ClusterInfo extends js.Object {
    var ActiveOperationArn: js.UndefOr[__string]
    var BrokerNodeGroupInfo: js.UndefOr[BrokerNodeGroupInfo]
    var ClientAuthentication: js.UndefOr[ClientAuthentication]
    var ClusterArn: js.UndefOr[__string]
    var ClusterName: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo]
    var CurrentVersion: js.UndefOr[__string]
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var NumberOfBrokerNodes: js.UndefOr[__integer]
    var OpenMonitoring: js.UndefOr[OpenMonitoring]
    var State: js.UndefOr[ClusterState]
    var StateInfo: js.UndefOr[StateInfo]
    var Tags: js.UndefOr[__mapOf__string]
    var ZookeeperConnectString: js.UndefOr[__string]
  }

  /**
    *             Returns information about a cluster operation.
    */
  @js.native
  @Factory
  trait ClusterOperationInfo extends js.Object {
    var ClientRequestId: js.UndefOr[__string]
    var ClusterArn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var EndTime: js.UndefOr[__timestampIso8601]
    var ErrorInfo: js.UndefOr[ErrorInfo]
    var OperationArn: js.UndefOr[__string]
    var OperationState: js.UndefOr[__string]
    var OperationType: js.UndefOr[__string]
    var SourceClusterInfo: js.UndefOr[MutableClusterInfo]
    var TargetClusterInfo: js.UndefOr[MutableClusterInfo]
  }

  /**
    *             The state of a Kafka cluster.
    */
  @js.native
  sealed trait ClusterState extends js.Any
  object ClusterState extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[ClusterState]
    val CREATING = "CREATING".asInstanceOf[ClusterState]
    val UPDATING = "UPDATING".asInstanceOf[ClusterState]
    val DELETING = "DELETING".asInstanceOf[ClusterState]
    val FAILED   = "FAILED".asInstanceOf[ClusterState]

    val values = js.Object.freeze(js.Array(ACTIVE, CREATING, UPDATING, DELETING, FAILED))
  }

  /**
    *             Represents an MSK Configuration.
    */
  @js.native
  @Factory
  trait Configuration extends js.Object {
    var Arn: __string
    var CreationTime: __timestampIso8601
    var Description: __string
    var KafkaVersions: __listOf__string
    var LatestRevision: ConfigurationRevision
    var Name: __string
  }

  /**
    *             Specifies the configuration to use for the brokers.
    */
  @js.native
  @Factory
  trait ConfigurationInfo extends js.Object {
    var Arn: __string
    var Revision: __long
  }

  /**
    *             Describes a configuration revision.
    */
  @js.native
  @Factory
  trait ConfigurationRevision extends js.Object {
    var CreationTime: __timestampIso8601
    var Revision: __long
    var Description: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateClusterRequest extends js.Object {
    var BrokerNodeGroupInfo: BrokerNodeGroupInfo
    var ClusterName: __stringMin1Max64
    var KafkaVersion: __stringMin1Max128
    var NumberOfBrokerNodes: __integerMin1Max15
    var ClientAuthentication: js.UndefOr[ClientAuthentication]
    var ConfigurationInfo: js.UndefOr[ConfigurationInfo]
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var OpenMonitoring: js.UndefOr[OpenMonitoringInfo]
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait CreateClusterResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterName: js.UndefOr[__string]
    var State: js.UndefOr[ClusterState]
  }

  @js.native
  @Factory
  trait CreateConfigurationRequest extends js.Object {
    var KafkaVersions: __listOf__string
    var Name: __string
    var ServerProperties: __blob
    var Description: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeleteClusterRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeleteClusterResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var State: js.UndefOr[ClusterState]
  }

  @js.native
  @Factory
  trait DescribeClusterOperationRequest extends js.Object {
    var ClusterOperationArn: __string
  }

  @js.native
  @Factory
  trait DescribeClusterOperationResponse extends js.Object {
    var ClusterOperationInfo: js.UndefOr[ClusterOperationInfo]
  }

  @js.native
  @Factory
  trait DescribeClusterRequest extends js.Object {
    var ClusterArn: __string
  }

  @js.native
  @Factory
  trait DescribeClusterResponse extends js.Object {
    var ClusterInfo: js.UndefOr[ClusterInfo]
  }

  @js.native
  @Factory
  trait DescribeConfigurationRequest extends js.Object {
    var Arn: __string
  }

  @js.native
  @Factory
  trait DescribeConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var KafkaVersions: js.UndefOr[__listOf__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeConfigurationRevisionRequest extends js.Object {
    var Arn: __string
    var Revision: __long
  }

  @js.native
  @Factory
  trait DescribeConfigurationRevisionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var Revision: js.UndefOr[__long]
    var ServerProperties: js.UndefOr[__blob]
  }

  /**
    *             Contains information about the EBS storage volumes attached to Kafka broker nodes.
    */
  @js.native
  @Factory
  trait EBSStorageInfo extends js.Object {
    var VolumeSize: js.UndefOr[__integerMin1Max16384]
  }

  /**
    *             The data-volume encryption details.
    */
  @js.native
  @Factory
  trait EncryptionAtRest extends js.Object {
    var DataVolumeKMSKeyId: __string
  }

  /**
    *             The settings for encrypting data in transit.
    */
  @js.native
  @Factory
  trait EncryptionInTransit extends js.Object {
    var ClientBroker: js.UndefOr[ClientBroker]
    var InCluster: js.UndefOr[__boolean]
  }

  /**
    *             Includes encryption-related information, such as the AWS KMS key used for encrypting data at rest and whether you want MSK to encrypt your data in transit.
    */
  @js.native
  @Factory
  trait EncryptionInfo extends js.Object {
    var EncryptionAtRest: js.UndefOr[EncryptionAtRest]
    var EncryptionInTransit: js.UndefOr[EncryptionInTransit]
  }

  /**
    *             Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of monitoring, see [[https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html|Monitoring]].
    */
  @js.native
  sealed trait EnhancedMonitoring extends js.Any
  object EnhancedMonitoring extends js.Object {
    val DEFAULT              = "DEFAULT".asInstanceOf[EnhancedMonitoring]
    val PER_BROKER           = "PER_BROKER".asInstanceOf[EnhancedMonitoring]
    val PER_TOPIC_PER_BROKER = "PER_TOPIC_PER_BROKER".asInstanceOf[EnhancedMonitoring]

    val values = js.Object.freeze(js.Array(DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER))
  }

  /**
    *             Returns information about an error state of the cluster.
    */
  @js.native
  @Factory
  trait ErrorInfo extends js.Object {
    var ErrorCode: js.UndefOr[__string]
    var ErrorString: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetBootstrapBrokersRequest extends js.Object {
    var ClusterArn: __string
  }

  @js.native
  @Factory
  trait GetBootstrapBrokersResponse extends js.Object {
    var BootstrapBrokerString: js.UndefOr[__string]
    var BootstrapBrokerStringTls: js.UndefOr[__string]
  }

  /**
    *             Indicates whether you want to enable or disable the JMX Exporter.
    */
  @js.native
  @Factory
  trait JmxExporter extends js.Object {
    var EnabledInBroker: __boolean
  }

  /**
    *             Indicates whether you want to enable or disable the JMX Exporter.
    */
  @js.native
  @Factory
  trait JmxExporterInfo extends js.Object {
    var EnabledInBroker: __boolean
  }

  @js.native
  @Factory
  trait KafkaVersion extends js.Object {
    var Status: js.UndefOr[KafkaVersionStatus]
    var Version: js.UndefOr[__string]
  }

  @js.native
  sealed trait KafkaVersionStatus extends js.Any
  object KafkaVersionStatus extends js.Object {
    val ACTIVE     = "ACTIVE".asInstanceOf[KafkaVersionStatus]
    val DEPRECATED = "DEPRECATED".asInstanceOf[KafkaVersionStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, DEPRECATED))
  }

  @js.native
  @Factory
  trait ListClusterOperationsRequest extends js.Object {
    var ClusterArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListClusterOperationsResponse extends js.Object {
    var ClusterOperationInfoList: js.UndefOr[__listOfClusterOperationInfo]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListClustersRequest extends js.Object {
    var ClusterNameFilter: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListClustersResponse extends js.Object {
    var ClusterInfoList: js.UndefOr[__listOfClusterInfo]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConfigurationRevisionsRequest extends js.Object {
    var Arn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConfigurationRevisionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Revisions: js.UndefOr[__listOfConfigurationRevision]
  }

  @js.native
  @Factory
  trait ListConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConfigurationsResponse extends js.Object {
    var Configurations: js.UndefOr[__listOfConfiguration]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListKafkaVersionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListKafkaVersionsResponse extends js.Object {
    var KafkaVersions: js.UndefOr[__listOfKafkaVersion]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListNodesRequest extends js.Object {
    var ClusterArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListNodesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var NodeInfoList: js.UndefOr[__listOfNodeInfo]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  /**
    *             Information about cluster attributes that can be updated via update APIs.
    */
  @js.native
  @Factory
  trait MutableClusterInfo extends js.Object {
    var BrokerEBSVolumeInfo: js.UndefOr[__listOfBrokerEBSVolumeInfo]
    var ConfigurationInfo: js.UndefOr[ConfigurationInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var NumberOfBrokerNodes: js.UndefOr[__integer]
    var OpenMonitoring: js.UndefOr[OpenMonitoring]
  }

  /**
    *             Indicates whether you want to enable or disable the Node Exporter.
    */
  @js.native
  @Factory
  trait NodeExporter extends js.Object {
    var EnabledInBroker: __boolean
  }

  /**
    *             Indicates whether you want to enable or disable the Node Exporter.
    */
  @js.native
  @Factory
  trait NodeExporterInfo extends js.Object {
    var EnabledInBroker: __boolean
  }

  /**
    *             The node information object.
    */
  @js.native
  @Factory
  trait NodeInfo extends js.Object {
    var AddedToClusterTime: js.UndefOr[__string]
    var BrokerNodeInfo: js.UndefOr[BrokerNodeInfo]
    var InstanceType: js.UndefOr[__string]
    var NodeARN: js.UndefOr[__string]
    var NodeType: js.UndefOr[NodeType]
    var ZookeeperNodeInfo: js.UndefOr[ZookeeperNodeInfo]
  }

  /**
    *             The broker or Zookeeper node.
    */
  @js.native
  sealed trait NodeType extends js.Any
  object NodeType extends js.Object {
    val BROKER = "BROKER".asInstanceOf[NodeType]

    val values = js.Object.freeze(js.Array(BROKER))
  }

  /**
    *             JMX and Node monitoring for the MSK cluster.
    */
  @js.native
  @Factory
  trait OpenMonitoring extends js.Object {
    var Prometheus: Prometheus
  }

  /**
    *             JMX and Node monitoring for the MSK cluster.
    */
  @js.native
  @Factory
  trait OpenMonitoringInfo extends js.Object {
    var Prometheus: PrometheusInfo
  }

  /**
    *             Prometheus settings.
    */
  @js.native
  @Factory
  trait Prometheus extends js.Object {
    var JmxExporter: js.UndefOr[JmxExporter]
    var NodeExporter: js.UndefOr[NodeExporter]
  }

  /**
    *             Prometheus settings.
    */
  @js.native
  @Factory
  trait PrometheusInfo extends js.Object {
    var JmxExporter: js.UndefOr[JmxExporterInfo]
    var NodeExporter: js.UndefOr[NodeExporterInfo]
  }

  @js.native
  @Factory
  trait StateInfo extends js.Object {
    var Code: js.UndefOr[__string]
    var Message: js.UndefOr[__string]
  }

  /**
    *             Contains information about storage volumes attached to MSK broker nodes.
    */
  @js.native
  @Factory
  trait StorageInfo extends js.Object {
    var EbsStorageInfo: js.UndefOr[EBSStorageInfo]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  /**
    *             Details for client authentication using TLS.
    */
  @js.native
  @Factory
  trait Tls extends js.Object {
    var CertificateAuthorityArnList: js.UndefOr[__listOf__string]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  @js.native
  @Factory
  trait UpdateBrokerCountRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var TargetNumberOfBrokerNodes: __integerMin1Max15
  }

  @js.native
  @Factory
  trait UpdateBrokerCountResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateBrokerStorageRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var TargetBrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo
  }

  @js.native
  @Factory
  trait UpdateBrokerStorageResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateClusterConfigurationRequest extends js.Object {
    var ClusterArn: __string
    var ConfigurationInfo: ConfigurationInfo
    var CurrentVersion: __string
  }

  @js.native
  @Factory
  trait UpdateClusterConfigurationResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  /**
    * Request body for UpdateMonitoring.
    */
  @js.native
  @Factory
  trait UpdateMonitoringRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var OpenMonitoring: js.UndefOr[OpenMonitoringInfo]
  }

  @js.native
  @Factory
  trait UpdateMonitoringResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  /**
    *             Zookeeper node information.
    */
  @js.native
  @Factory
  trait ZookeeperNodeInfo extends js.Object {
    var AttachedENIId: js.UndefOr[__string]
    var ClientVpcIpAddress: js.UndefOr[__string]
    var Endpoints: js.UndefOr[__listOf__string]
    var ZookeeperId: js.UndefOr[__double]
    var ZookeeperVersion: js.UndefOr[__string]
  }
}
