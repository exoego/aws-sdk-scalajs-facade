package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object kafka {
  type MaxResults = Int
  type __blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type __boolean = Boolean
  type __double = Double
  type __integer = Int
  type __integerMin1Max15 = Int
  type __integerMin1Max16384 = Int
  type __listOfBrokerEBSVolumeInfo = js.Array[BrokerEBSVolumeInfo]
  type __listOfCluster = js.Array[Cluster]
  type __listOfClusterInfo = js.Array[ClusterInfo]
  type __listOfClusterOperationInfo = js.Array[ClusterOperationInfo]
  type __listOfClusterOperationStep = js.Array[ClusterOperationStep]
  type __listOfCompatibleKafkaVersion = js.Array[CompatibleKafkaVersion]
  type __listOfConfiguration = js.Array[Configuration]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfKafkaVersion = js.Array[KafkaVersion]
  type __listOfNodeInfo = js.Array[NodeInfo]
  type __listOfUnprocessedScramSecret = js.Array[UnprocessedScramSecret]
  type __listOfVpcConfig = js.Array[VpcConfig]
  type __listOf__string = js.Array[__string]
  type __long = Double
  type __mapOf__string = js.Dictionary[__string]
  type __string = String
  type __stringMin1Max128 = String
  type __stringMin1Max64 = String
  type __stringMin5Max32 = String
  type __timestampIso8601 = js.Date

  final class KafkaOps(private val service: Kafka) extends AnyVal {

    @inline def batchAssociateScramSecretFuture(params: BatchAssociateScramSecretRequest): Future[BatchAssociateScramSecretResponse] = service.batchAssociateScramSecret(params).promise().toFuture
    @inline def batchDisassociateScramSecretFuture(params: BatchDisassociateScramSecretRequest): Future[BatchDisassociateScramSecretResponse] = service.batchDisassociateScramSecret(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] = service.createCluster(params).promise().toFuture
    @inline def createClusterV2Future(params: CreateClusterV2Request): Future[CreateClusterV2Response] = service.createClusterV2(params).promise().toFuture
    @inline def createConfigurationFuture(params: CreateConfigurationRequest): Future[CreateConfigurationResponse] = service.createConfiguration(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] = service.deleteCluster(params).promise().toFuture
    @inline def deleteConfigurationFuture(params: DeleteConfigurationRequest): Future[DeleteConfigurationResponse] = service.deleteConfiguration(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] = service.describeCluster(params).promise().toFuture
    @inline def describeClusterOperationFuture(params: DescribeClusterOperationRequest): Future[DescribeClusterOperationResponse] = service.describeClusterOperation(params).promise().toFuture
    @inline def describeClusterV2Future(params: DescribeClusterV2Request): Future[DescribeClusterV2Response] = service.describeClusterV2(params).promise().toFuture
    @inline def describeConfigurationFuture(params: DescribeConfigurationRequest): Future[DescribeConfigurationResponse] = service.describeConfiguration(params).promise().toFuture
    @inline def describeConfigurationRevisionFuture(params: DescribeConfigurationRevisionRequest): Future[DescribeConfigurationRevisionResponse] = service.describeConfigurationRevision(params).promise().toFuture
    @inline def getBootstrapBrokersFuture(params: GetBootstrapBrokersRequest): Future[GetBootstrapBrokersResponse] = service.getBootstrapBrokers(params).promise().toFuture
    @inline def getCompatibleKafkaVersionsFuture(params: GetCompatibleKafkaVersionsRequest): Future[GetCompatibleKafkaVersionsResponse] = service.getCompatibleKafkaVersions(params).promise().toFuture
    @inline def listClusterOperationsFuture(params: ListClusterOperationsRequest): Future[ListClusterOperationsResponse] = service.listClusterOperations(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] = service.listClusters(params).promise().toFuture
    @inline def listClustersV2Future(params: ListClustersV2Request): Future[ListClustersV2Response] = service.listClustersV2(params).promise().toFuture
    @inline def listConfigurationRevisionsFuture(params: ListConfigurationRevisionsRequest): Future[ListConfigurationRevisionsResponse] = service.listConfigurationRevisions(params).promise().toFuture
    @inline def listConfigurationsFuture(params: ListConfigurationsRequest): Future[ListConfigurationsResponse] = service.listConfigurations(params).promise().toFuture
    @inline def listKafkaVersionsFuture(params: ListKafkaVersionsRequest): Future[ListKafkaVersionsResponse] = service.listKafkaVersions(params).promise().toFuture
    @inline def listNodesFuture(params: ListNodesRequest): Future[ListNodesResponse] = service.listNodes(params).promise().toFuture
    @inline def listScramSecretsFuture(params: ListScramSecretsRequest): Future[ListScramSecretsResponse] = service.listScramSecrets(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def rebootBrokerFuture(params: RebootBrokerRequest): Future[RebootBrokerResponse] = service.rebootBroker(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateBrokerCountFuture(params: UpdateBrokerCountRequest): Future[UpdateBrokerCountResponse] = service.updateBrokerCount(params).promise().toFuture
    @inline def updateBrokerStorageFuture(params: UpdateBrokerStorageRequest): Future[UpdateBrokerStorageResponse] = service.updateBrokerStorage(params).promise().toFuture
    @inline def updateBrokerTypeFuture(params: UpdateBrokerTypeRequest): Future[UpdateBrokerTypeResponse] = service.updateBrokerType(params).promise().toFuture
    @inline def updateClusterConfigurationFuture(params: UpdateClusterConfigurationRequest): Future[UpdateClusterConfigurationResponse] = service.updateClusterConfiguration(params).promise().toFuture
    @inline def updateClusterKafkaVersionFuture(params: UpdateClusterKafkaVersionRequest): Future[UpdateClusterKafkaVersionResponse] = service.updateClusterKafkaVersion(params).promise().toFuture
    @inline def updateConfigurationFuture(params: UpdateConfigurationRequest): Future[UpdateConfigurationResponse] = service.updateConfiguration(params).promise().toFuture
    @inline def updateConnectivityFuture(params: UpdateConnectivityRequest): Future[UpdateConnectivityResponse] = service.updateConnectivity(params).promise().toFuture
    @inline def updateMonitoringFuture(params: UpdateMonitoringRequest): Future[UpdateMonitoringResponse] = service.updateMonitoring(params).promise().toFuture
    @inline def updateSecurityFuture(params: UpdateSecurityRequest): Future[UpdateSecurityResponse] = service.updateSecurity(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/kafka", JSImport.Namespace, "AWS.Kafka")
  class Kafka() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchAssociateScramSecret(params: BatchAssociateScramSecretRequest): Request[BatchAssociateScramSecretResponse] = js.native
    def batchDisassociateScramSecret(params: BatchDisassociateScramSecretRequest): Request[BatchDisassociateScramSecretResponse] = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createClusterV2(params: CreateClusterV2Request): Request[CreateClusterV2Response] = js.native
    def createConfiguration(params: CreateConfigurationRequest): Request[CreateConfigurationResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteConfiguration(params: DeleteConfigurationRequest): Request[DeleteConfigurationResponse] = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse] = js.native
    def describeClusterOperation(params: DescribeClusterOperationRequest): Request[DescribeClusterOperationResponse] = js.native
    def describeClusterV2(params: DescribeClusterV2Request): Request[DescribeClusterV2Response] = js.native
    def describeConfiguration(params: DescribeConfigurationRequest): Request[DescribeConfigurationResponse] = js.native
    def describeConfigurationRevision(params: DescribeConfigurationRevisionRequest): Request[DescribeConfigurationRevisionResponse] = js.native
    def getBootstrapBrokers(params: GetBootstrapBrokersRequest): Request[GetBootstrapBrokersResponse] = js.native
    def getCompatibleKafkaVersions(params: GetCompatibleKafkaVersionsRequest): Request[GetCompatibleKafkaVersionsResponse] = js.native
    def listClusterOperations(params: ListClusterOperationsRequest): Request[ListClusterOperationsResponse] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse] = js.native
    def listClustersV2(params: ListClustersV2Request): Request[ListClustersV2Response] = js.native
    def listConfigurationRevisions(params: ListConfigurationRevisionsRequest): Request[ListConfigurationRevisionsResponse] = js.native
    def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse] = js.native
    def listKafkaVersions(params: ListKafkaVersionsRequest): Request[ListKafkaVersionsResponse] = js.native
    def listNodes(params: ListNodesRequest): Request[ListNodesResponse] = js.native
    def listScramSecrets(params: ListScramSecretsRequest): Request[ListScramSecretsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def rebootBroker(params: RebootBrokerRequest): Request[RebootBrokerResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateBrokerCount(params: UpdateBrokerCountRequest): Request[UpdateBrokerCountResponse] = js.native
    def updateBrokerStorage(params: UpdateBrokerStorageRequest): Request[UpdateBrokerStorageResponse] = js.native
    def updateBrokerType(params: UpdateBrokerTypeRequest): Request[UpdateBrokerTypeResponse] = js.native
    def updateClusterConfiguration(params: UpdateClusterConfigurationRequest): Request[UpdateClusterConfigurationResponse] = js.native
    def updateClusterKafkaVersion(params: UpdateClusterKafkaVersionRequest): Request[UpdateClusterKafkaVersionResponse] = js.native
    def updateConfiguration(params: UpdateConfigurationRequest): Request[UpdateConfigurationResponse] = js.native
    def updateConnectivity(params: UpdateConnectivityRequest): Request[UpdateConnectivityResponse] = js.native
    def updateMonitoring(params: UpdateMonitoringRequest): Request[UpdateMonitoringResponse] = js.native
    def updateSecurity(params: UpdateSecurityRequest): Request[UpdateSecurityResponse] = js.native
  }
  object Kafka {
    @inline implicit def toOps(service: Kafka): KafkaOps = {
      new KafkaOps(service)
    }
  }

  /** Associates sasl scram secrets to cluster.
    */
  @js.native
  trait BatchAssociateScramSecretRequest extends js.Object {
    var ClusterArn: __string
    var SecretArnList: __listOf__string
  }

  object BatchAssociateScramSecretRequest {
    @inline
    def apply(
        ClusterArn: __string,
        SecretArnList: __listOf__string
    ): BatchAssociateScramSecretRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "SecretArnList" -> SecretArnList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchAssociateScramSecretRequest]
    }
  }

  @js.native
  trait BatchAssociateScramSecretResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var UnprocessedScramSecrets: js.UndefOr[__listOfUnprocessedScramSecret]
  }

  object BatchAssociateScramSecretResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        UnprocessedScramSecrets: js.UndefOr[__listOfUnprocessedScramSecret] = js.undefined
    ): BatchAssociateScramSecretResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      UnprocessedScramSecrets.foreach(__v => __obj.updateDynamic("UnprocessedScramSecrets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateScramSecretResponse]
    }
  }

  /** Disassociates sasl scram secrets to cluster.
    */
  @js.native
  trait BatchDisassociateScramSecretRequest extends js.Object {
    var ClusterArn: __string
    var SecretArnList: __listOf__string
  }

  object BatchDisassociateScramSecretRequest {
    @inline
    def apply(
        ClusterArn: __string,
        SecretArnList: __listOf__string
    ): BatchDisassociateScramSecretRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "SecretArnList" -> SecretArnList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDisassociateScramSecretRequest]
    }
  }

  @js.native
  trait BatchDisassociateScramSecretResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var UnprocessedScramSecrets: js.UndefOr[__listOfUnprocessedScramSecret]
  }

  object BatchDisassociateScramSecretResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        UnprocessedScramSecrets: js.UndefOr[__listOfUnprocessedScramSecret] = js.undefined
    ): BatchDisassociateScramSecretResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      UnprocessedScramSecrets.foreach(__v => __obj.updateDynamic("UnprocessedScramSecrets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateScramSecretResponse]
    }
  }

  /** Specifies the EBS volume upgrade information. The broker identifier must be set to the keyword ALL. This means the changes apply to all the brokers in the cluster.
    */
  @js.native
  trait BrokerEBSVolumeInfo extends js.Object {
    var KafkaBrokerNodeId: __string
    var VolumeSizeGB: __integer
  }

  object BrokerEBSVolumeInfo {
    @inline
    def apply(
        KafkaBrokerNodeId: __string,
        VolumeSizeGB: __integer
    ): BrokerEBSVolumeInfo = {
      val __obj = js.Dynamic.literal(
        "KafkaBrokerNodeId" -> KafkaBrokerNodeId.asInstanceOf[js.Any],
        "VolumeSizeGB" -> VolumeSizeGB.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BrokerEBSVolumeInfo]
    }
  }

  @js.native
  trait BrokerLogs extends js.Object {
    var CloudWatchLogs: js.UndefOr[CloudWatchLogs]
    var Firehose: js.UndefOr[Firehose]
    var S3: js.UndefOr[S3]
  }

  object BrokerLogs {
    @inline
    def apply(
        CloudWatchLogs: js.UndefOr[CloudWatchLogs] = js.undefined,
        Firehose: js.UndefOr[Firehose] = js.undefined,
        S3: js.UndefOr[S3] = js.undefined
    ): BrokerLogs = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogs.foreach(__v => __obj.updateDynamic("CloudWatchLogs")(__v.asInstanceOf[js.Any]))
      Firehose.foreach(__v => __obj.updateDynamic("Firehose")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerLogs]
    }
  }

  /** Describes the setup to be used for Apache Kafka broker nodes in the cluster.
    */
  @js.native
  trait BrokerNodeGroupInfo extends js.Object {
    var ClientSubnets: __listOf__string
    var InstanceType: __stringMin5Max32
    var BrokerAZDistribution: js.UndefOr[BrokerAZDistribution]
    var ConnectivityInfo: js.UndefOr[ConnectivityInfo]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var StorageInfo: js.UndefOr[StorageInfo]
  }

  object BrokerNodeGroupInfo {
    @inline
    def apply(
        ClientSubnets: __listOf__string,
        InstanceType: __stringMin5Max32,
        BrokerAZDistribution: js.UndefOr[BrokerAZDistribution] = js.undefined,
        ConnectivityInfo: js.UndefOr[ConnectivityInfo] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        StorageInfo: js.UndefOr[StorageInfo] = js.undefined
    ): BrokerNodeGroupInfo = {
      val __obj = js.Dynamic.literal(
        "ClientSubnets" -> ClientSubnets.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any]
      )

      BrokerAZDistribution.foreach(__v => __obj.updateDynamic("BrokerAZDistribution")(__v.asInstanceOf[js.Any]))
      ConnectivityInfo.foreach(__v => __obj.updateDynamic("ConnectivityInfo")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      StorageInfo.foreach(__v => __obj.updateDynamic("StorageInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerNodeGroupInfo]
    }
  }

  /** BrokerNodeInfo
    */
  @js.native
  trait BrokerNodeInfo extends js.Object {
    var AttachedENIId: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__double]
    var ClientSubnet: js.UndefOr[__string]
    var ClientVpcIpAddress: js.UndefOr[__string]
    var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo]
    var Endpoints: js.UndefOr[__listOf__string]
  }

  object BrokerNodeInfo {
    @inline
    def apply(
        AttachedENIId: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__double] = js.undefined,
        ClientSubnet: js.UndefOr[__string] = js.undefined,
        ClientVpcIpAddress: js.UndefOr[__string] = js.undefined,
        CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined,
        Endpoints: js.UndefOr[__listOf__string] = js.undefined
    ): BrokerNodeInfo = {
      val __obj = js.Dynamic.literal()
      AttachedENIId.foreach(__v => __obj.updateDynamic("AttachedENIId")(__v.asInstanceOf[js.Any]))
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      ClientSubnet.foreach(__v => __obj.updateDynamic("ClientSubnet")(__v.asInstanceOf[js.Any]))
      ClientVpcIpAddress.foreach(__v => __obj.updateDynamic("ClientVpcIpAddress")(__v.asInstanceOf[js.Any]))
      CurrentBrokerSoftwareInfo.foreach(__v => __obj.updateDynamic("CurrentBrokerSoftwareInfo")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerNodeInfo]
    }
  }

  /** Information about the current software installed on the cluster.
    */
  @js.native
  trait BrokerSoftwareInfo extends js.Object {
    var ConfigurationArn: js.UndefOr[__string]
    var ConfigurationRevision: js.UndefOr[__long]
    var KafkaVersion: js.UndefOr[__string]
  }

  object BrokerSoftwareInfo {
    @inline
    def apply(
        ConfigurationArn: js.UndefOr[__string] = js.undefined,
        ConfigurationRevision: js.UndefOr[__long] = js.undefined,
        KafkaVersion: js.UndefOr[__string] = js.undefined
    ): BrokerSoftwareInfo = {
      val __obj = js.Dynamic.literal()
      ConfigurationArn.foreach(__v => __obj.updateDynamic("ConfigurationArn")(__v.asInstanceOf[js.Any]))
      ConfigurationRevision.foreach(__v => __obj.updateDynamic("ConfigurationRevision")(__v.asInstanceOf[js.Any]))
      KafkaVersion.foreach(__v => __obj.updateDynamic("KafkaVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerSoftwareInfo]
    }
  }

  /** Includes all client authentication information.
    */
  @js.native
  trait ClientAuthentication extends js.Object {
    var Sasl: js.UndefOr[Sasl]
    var Tls: js.UndefOr[Tls]
    var Unauthenticated: js.UndefOr[Unauthenticated]
  }

  object ClientAuthentication {
    @inline
    def apply(
        Sasl: js.UndefOr[Sasl] = js.undefined,
        Tls: js.UndefOr[Tls] = js.undefined,
        Unauthenticated: js.UndefOr[Unauthenticated] = js.undefined
    ): ClientAuthentication = {
      val __obj = js.Dynamic.literal()
      Sasl.foreach(__v => __obj.updateDynamic("Sasl")(__v.asInstanceOf[js.Any]))
      Tls.foreach(__v => __obj.updateDynamic("Tls")(__v.asInstanceOf[js.Any]))
      Unauthenticated.foreach(__v => __obj.updateDynamic("Unauthenticated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientAuthentication]
    }
  }

  @js.native
  trait CloudWatchLogs extends js.Object {
    var Enabled: __boolean
    var LogGroup: js.UndefOr[__string]
  }

  object CloudWatchLogs {
    @inline
    def apply(
        Enabled: __boolean,
        LogGroup: js.UndefOr[__string] = js.undefined
    ): CloudWatchLogs = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      LogGroup.foreach(__v => __obj.updateDynamic("LogGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogs]
    }
  }

  /** Returns information about a cluster.
    */
  @js.native
  trait Cluster extends js.Object {
    var ActiveOperationArn: js.UndefOr[__string]
    var ClusterArn: js.UndefOr[__string]
    var ClusterName: js.UndefOr[__string]
    var ClusterType: js.UndefOr[ClusterType]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var CurrentVersion: js.UndefOr[__string]
    var Provisioned: js.UndefOr[Provisioned]
    var Serverless: js.UndefOr[Serverless]
    var State: js.UndefOr[ClusterState]
    var StateInfo: js.UndefOr[StateInfo]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object Cluster {
    @inline
    def apply(
        ActiveOperationArn: js.UndefOr[__string] = js.undefined,
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterName: js.UndefOr[__string] = js.undefined,
        ClusterType: js.UndefOr[ClusterType] = js.undefined,
        CreationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        CurrentVersion: js.UndefOr[__string] = js.undefined,
        Provisioned: js.UndefOr[Provisioned] = js.undefined,
        Serverless: js.UndefOr[Serverless] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined,
        StateInfo: js.UndefOr[StateInfo] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): Cluster = {
      val __obj = js.Dynamic.literal()
      ActiveOperationArn.foreach(__v => __obj.updateDynamic("ActiveOperationArn")(__v.asInstanceOf[js.Any]))
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      ClusterType.foreach(__v => __obj.updateDynamic("ClusterType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      Provisioned.foreach(__v => __obj.updateDynamic("Provisioned")(__v.asInstanceOf[js.Any]))
      Serverless.foreach(__v => __obj.updateDynamic("Serverless")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateInfo.foreach(__v => __obj.updateDynamic("StateInfo")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  /** Returns information about a cluster.
    */
  @js.native
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
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var NumberOfBrokerNodes: js.UndefOr[__integer]
    var OpenMonitoring: js.UndefOr[OpenMonitoring]
    var State: js.UndefOr[ClusterState]
    var StateInfo: js.UndefOr[StateInfo]
    var Tags: js.UndefOr[__mapOf__string]
    var ZookeeperConnectString: js.UndefOr[__string]
    var ZookeeperConnectStringTls: js.UndefOr[__string]
  }

  object ClusterInfo {
    @inline
    def apply(
        ActiveOperationArn: js.UndefOr[__string] = js.undefined,
        BrokerNodeGroupInfo: js.UndefOr[BrokerNodeGroupInfo] = js.undefined,
        ClientAuthentication: js.UndefOr[ClientAuthentication] = js.undefined,
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterName: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined,
        CurrentVersion: js.UndefOr[__string] = js.undefined,
        EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
        EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined,
        LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
        NumberOfBrokerNodes: js.UndefOr[__integer] = js.undefined,
        OpenMonitoring: js.UndefOr[OpenMonitoring] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined,
        StateInfo: js.UndefOr[StateInfo] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        ZookeeperConnectString: js.UndefOr[__string] = js.undefined,
        ZookeeperConnectStringTls: js.UndefOr[__string] = js.undefined
    ): ClusterInfo = {
      val __obj = js.Dynamic.literal()
      ActiveOperationArn.foreach(__v => __obj.updateDynamic("ActiveOperationArn")(__v.asInstanceOf[js.Any]))
      BrokerNodeGroupInfo.foreach(__v => __obj.updateDynamic("BrokerNodeGroupInfo")(__v.asInstanceOf[js.Any]))
      ClientAuthentication.foreach(__v => __obj.updateDynamic("ClientAuthentication")(__v.asInstanceOf[js.Any]))
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrentBrokerSoftwareInfo.foreach(__v => __obj.updateDynamic("CurrentBrokerSoftwareInfo")(__v.asInstanceOf[js.Any]))
      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      EncryptionInfo.foreach(__v => __obj.updateDynamic("EncryptionInfo")(__v.asInstanceOf[js.Any]))
      EnhancedMonitoring.foreach(__v => __obj.updateDynamic("EnhancedMonitoring")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      NumberOfBrokerNodes.foreach(__v => __obj.updateDynamic("NumberOfBrokerNodes")(__v.asInstanceOf[js.Any]))
      OpenMonitoring.foreach(__v => __obj.updateDynamic("OpenMonitoring")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateInfo.foreach(__v => __obj.updateDynamic("StateInfo")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      ZookeeperConnectString.foreach(__v => __obj.updateDynamic("ZookeeperConnectString")(__v.asInstanceOf[js.Any]))
      ZookeeperConnectStringTls.foreach(__v => __obj.updateDynamic("ZookeeperConnectStringTls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterInfo]
    }
  }

  /** Returns information about a cluster operation.
    */
  @js.native
  trait ClusterOperationInfo extends js.Object {
    var ClientRequestId: js.UndefOr[__string]
    var ClusterArn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var EndTime: js.UndefOr[__timestampIso8601]
    var ErrorInfo: js.UndefOr[ErrorInfo]
    var OperationArn: js.UndefOr[__string]
    var OperationState: js.UndefOr[__string]
    var OperationSteps: js.UndefOr[__listOfClusterOperationStep]
    var OperationType: js.UndefOr[__string]
    var SourceClusterInfo: js.UndefOr[MutableClusterInfo]
    var TargetClusterInfo: js.UndefOr[MutableClusterInfo]
  }

  object ClusterOperationInfo {
    @inline
    def apply(
        ClientRequestId: js.UndefOr[__string] = js.undefined,
        ClusterArn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        EndTime: js.UndefOr[__timestampIso8601] = js.undefined,
        ErrorInfo: js.UndefOr[ErrorInfo] = js.undefined,
        OperationArn: js.UndefOr[__string] = js.undefined,
        OperationState: js.UndefOr[__string] = js.undefined,
        OperationSteps: js.UndefOr[__listOfClusterOperationStep] = js.undefined,
        OperationType: js.UndefOr[__string] = js.undefined,
        SourceClusterInfo: js.UndefOr[MutableClusterInfo] = js.undefined,
        TargetClusterInfo: js.UndefOr[MutableClusterInfo] = js.undefined
    ): ClusterOperationInfo = {
      val __obj = js.Dynamic.literal()
      ClientRequestId.foreach(__v => __obj.updateDynamic("ClientRequestId")(__v.asInstanceOf[js.Any]))
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ErrorInfo.foreach(__v => __obj.updateDynamic("ErrorInfo")(__v.asInstanceOf[js.Any]))
      OperationArn.foreach(__v => __obj.updateDynamic("OperationArn")(__v.asInstanceOf[js.Any]))
      OperationState.foreach(__v => __obj.updateDynamic("OperationState")(__v.asInstanceOf[js.Any]))
      OperationSteps.foreach(__v => __obj.updateDynamic("OperationSteps")(__v.asInstanceOf[js.Any]))
      OperationType.foreach(__v => __obj.updateDynamic("OperationType")(__v.asInstanceOf[js.Any]))
      SourceClusterInfo.foreach(__v => __obj.updateDynamic("SourceClusterInfo")(__v.asInstanceOf[js.Any]))
      TargetClusterInfo.foreach(__v => __obj.updateDynamic("TargetClusterInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterOperationInfo]
    }
  }

  /** Step taken during a cluster operation.
    */
  @js.native
  trait ClusterOperationStep extends js.Object {
    var StepInfo: js.UndefOr[ClusterOperationStepInfo]
    var StepName: js.UndefOr[__string]
  }

  object ClusterOperationStep {
    @inline
    def apply(
        StepInfo: js.UndefOr[ClusterOperationStepInfo] = js.undefined,
        StepName: js.UndefOr[__string] = js.undefined
    ): ClusterOperationStep = {
      val __obj = js.Dynamic.literal()
      StepInfo.foreach(__v => __obj.updateDynamic("StepInfo")(__v.asInstanceOf[js.Any]))
      StepName.foreach(__v => __obj.updateDynamic("StepName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterOperationStep]
    }
  }

  /** State information about the operation step.
    */
  @js.native
  trait ClusterOperationStepInfo extends js.Object {
    var StepStatus: js.UndefOr[__string]
  }

  object ClusterOperationStepInfo {
    @inline
    def apply(
        StepStatus: js.UndefOr[__string] = js.undefined
    ): ClusterOperationStepInfo = {
      val __obj = js.Dynamic.literal()
      StepStatus.foreach(__v => __obj.updateDynamic("StepStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterOperationStepInfo]
    }
  }

  /** Contains source Apache Kafka versions and compatible target Apache Kafka versions.
    */
  @js.native
  trait CompatibleKafkaVersion extends js.Object {
    var SourceVersion: js.UndefOr[__string]
    var TargetVersions: js.UndefOr[__listOf__string]
  }

  object CompatibleKafkaVersion {
    @inline
    def apply(
        SourceVersion: js.UndefOr[__string] = js.undefined,
        TargetVersions: js.UndefOr[__listOf__string] = js.undefined
    ): CompatibleKafkaVersion = {
      val __obj = js.Dynamic.literal()
      SourceVersion.foreach(__v => __obj.updateDynamic("SourceVersion")(__v.asInstanceOf[js.Any]))
      TargetVersions.foreach(__v => __obj.updateDynamic("TargetVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompatibleKafkaVersion]
    }
  }

  /** Represents an MSK Configuration.
    */
  @js.native
  trait Configuration extends js.Object {
    var Arn: __string
    var CreationTime: __timestampIso8601
    var Description: __string
    var KafkaVersions: __listOf__string
    var LatestRevision: ConfigurationRevision
    var Name: __string
    var State: ConfigurationState
  }

  object Configuration {
    @inline
    def apply(
        Arn: __string,
        CreationTime: __timestampIso8601,
        Description: __string,
        KafkaVersions: __listOf__string,
        LatestRevision: ConfigurationRevision,
        Name: __string,
        State: ConfigurationState
    ): Configuration = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "KafkaVersions" -> KafkaVersions.asInstanceOf[js.Any],
        "LatestRevision" -> LatestRevision.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Configuration]
    }
  }

  /** Specifies the configuration to use for the brokers.
    */
  @js.native
  trait ConfigurationInfo extends js.Object {
    var Arn: __string
    var Revision: __long
  }

  object ConfigurationInfo {
    @inline
    def apply(
        Arn: __string,
        Revision: __long
    ): ConfigurationInfo = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Revision" -> Revision.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConfigurationInfo]
    }
  }

  /** Describes a configuration revision.
    */
  @js.native
  trait ConfigurationRevision extends js.Object {
    var CreationTime: __timestampIso8601
    var Revision: __long
    var Description: js.UndefOr[__string]
  }

  object ConfigurationRevision {
    @inline
    def apply(
        CreationTime: __timestampIso8601,
        Revision: __long,
        Description: js.UndefOr[__string] = js.undefined
    ): ConfigurationRevision = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "Revision" -> Revision.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationRevision]
    }
  }

  /** Information about the broker access configuration.
    */
  @js.native
  trait ConnectivityInfo extends js.Object {
    var PublicAccess: js.UndefOr[PublicAccess]
  }

  object ConnectivityInfo {
    @inline
    def apply(
        PublicAccess: js.UndefOr[PublicAccess] = js.undefined
    ): ConnectivityInfo = {
      val __obj = js.Dynamic.literal()
      PublicAccess.foreach(__v => __obj.updateDynamic("PublicAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectivityInfo]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var BrokerNodeGroupInfo: BrokerNodeGroupInfo
    var ClusterName: __stringMin1Max64
    var KafkaVersion: __stringMin1Max128
    var NumberOfBrokerNodes: __integerMin1Max15
    var ClientAuthentication: js.UndefOr[ClientAuthentication]
    var ConfigurationInfo: js.UndefOr[ConfigurationInfo]
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var OpenMonitoring: js.UndefOr[OpenMonitoringInfo]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateClusterRequest {
    @inline
    def apply(
        BrokerNodeGroupInfo: BrokerNodeGroupInfo,
        ClusterName: __stringMin1Max64,
        KafkaVersion: __stringMin1Max128,
        NumberOfBrokerNodes: __integerMin1Max15,
        ClientAuthentication: js.UndefOr[ClientAuthentication] = js.undefined,
        ConfigurationInfo: js.UndefOr[ConfigurationInfo] = js.undefined,
        EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
        EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined,
        LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
        OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerNodeGroupInfo" -> BrokerNodeGroupInfo.asInstanceOf[js.Any],
        "ClusterName" -> ClusterName.asInstanceOf[js.Any],
        "KafkaVersion" -> KafkaVersion.asInstanceOf[js.Any],
        "NumberOfBrokerNodes" -> NumberOfBrokerNodes.asInstanceOf[js.Any]
      )

      ClientAuthentication.foreach(__v => __obj.updateDynamic("ClientAuthentication")(__v.asInstanceOf[js.Any]))
      ConfigurationInfo.foreach(__v => __obj.updateDynamic("ConfigurationInfo")(__v.asInstanceOf[js.Any]))
      EncryptionInfo.foreach(__v => __obj.updateDynamic("EncryptionInfo")(__v.asInstanceOf[js.Any]))
      EnhancedMonitoring.foreach(__v => __obj.updateDynamic("EnhancedMonitoring")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      OpenMonitoring.foreach(__v => __obj.updateDynamic("OpenMonitoring")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterName: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait CreateClusterV2Request extends js.Object {
    var ClusterName: __stringMin1Max64
    var Provisioned: js.UndefOr[ProvisionedRequest]
    var Serverless: js.UndefOr[ServerlessRequest]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateClusterV2Request {
    @inline
    def apply(
        ClusterName: __stringMin1Max64,
        Provisioned: js.UndefOr[ProvisionedRequest] = js.undefined,
        Serverless: js.UndefOr[ServerlessRequest] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateClusterV2Request = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any]
      )

      Provisioned.foreach(__v => __obj.updateDynamic("Provisioned")(__v.asInstanceOf[js.Any]))
      Serverless.foreach(__v => __obj.updateDynamic("Serverless")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterV2Request]
    }
  }

  @js.native
  trait CreateClusterV2Response extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterName: js.UndefOr[__string]
    var ClusterType: js.UndefOr[ClusterType]
    var State: js.UndefOr[ClusterState]
  }

  object CreateClusterV2Response {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterName: js.UndefOr[__string] = js.undefined,
        ClusterType: js.UndefOr[ClusterType] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined
    ): CreateClusterV2Response = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      ClusterType.foreach(__v => __obj.updateDynamic("ClusterType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterV2Response]
    }
  }

  @js.native
  trait CreateConfigurationRequest extends js.Object {
    var Name: __string
    var ServerProperties: __blob
    var Description: js.UndefOr[__string]
    var KafkaVersions: js.UndefOr[__listOf__string]
  }

  object CreateConfigurationRequest {
    @inline
    def apply(
        Name: __string,
        ServerProperties: __blob,
        Description: js.UndefOr[__string] = js.undefined,
        KafkaVersions: js.UndefOr[__listOf__string] = js.undefined
    ): CreateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ServerProperties" -> ServerProperties.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KafkaVersions.foreach(__v => __obj.updateDynamic("KafkaVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationRequest]
    }
  }

  @js.native
  trait CreateConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
    var State: js.UndefOr[ConfigurationState]
  }

  object CreateConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ConfigurationState] = js.undefined
    ): CreateConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LatestRevision.foreach(__v => __obj.updateDynamic("LatestRevision")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: js.UndefOr[__string]
  }

  object DeleteClusterRequest {
    @inline
    def apply(
        ClusterArn: __string,
        CurrentVersion: js.UndefOr[__string] = js.undefined
    ): DeleteClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )

      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var State: js.UndefOr[ClusterState]
  }

  object DeleteClusterResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined
    ): DeleteClusterResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DeleteConfigurationRequest extends js.Object {
    var Arn: __string
  }

  object DeleteConfigurationRequest {
    @inline
    def apply(
        Arn: __string
    ): DeleteConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConfigurationRequest]
    }
  }

  @js.native
  trait DeleteConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var State: js.UndefOr[ConfigurationState]
  }

  object DeleteConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ConfigurationState] = js.undefined
    ): DeleteConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConfigurationResponse]
    }
  }

  @js.native
  trait DescribeClusterOperationRequest extends js.Object {
    var ClusterOperationArn: __string
  }

  object DescribeClusterOperationRequest {
    @inline
    def apply(
        ClusterOperationArn: __string
    ): DescribeClusterOperationRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterOperationArn" -> ClusterOperationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeClusterOperationRequest]
    }
  }

  @js.native
  trait DescribeClusterOperationResponse extends js.Object {
    var ClusterOperationInfo: js.UndefOr[ClusterOperationInfo]
  }

  object DescribeClusterOperationResponse {
    @inline
    def apply(
        ClusterOperationInfo: js.UndefOr[ClusterOperationInfo] = js.undefined
    ): DescribeClusterOperationResponse = {
      val __obj = js.Dynamic.literal()
      ClusterOperationInfo.foreach(__v => __obj.updateDynamic("ClusterOperationInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterOperationResponse]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var ClusterArn: __string
  }

  object DescribeClusterRequest {
    @inline
    def apply(
        ClusterArn: __string
    ): DescribeClusterRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ClusterInfo: js.UndefOr[ClusterInfo] = js.undefined
    ): DescribeClusterResponse = {
      val __obj = js.Dynamic.literal()
      ClusterInfo.foreach(__v => __obj.updateDynamic("ClusterInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterResponse]
    }
  }

  @js.native
  trait DescribeClusterV2Request extends js.Object {
    var ClusterArn: __string
  }

  object DescribeClusterV2Request {
    @inline
    def apply(
        ClusterArn: __string
    ): DescribeClusterV2Request = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeClusterV2Request]
    }
  }

  @js.native
  trait DescribeClusterV2Response extends js.Object {
    var ClusterInfo: js.UndefOr[Cluster]
  }

  object DescribeClusterV2Response {
    @inline
    def apply(
        ClusterInfo: js.UndefOr[Cluster] = js.undefined
    ): DescribeClusterV2Response = {
      val __obj = js.Dynamic.literal()
      ClusterInfo.foreach(__v => __obj.updateDynamic("ClusterInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterV2Response]
    }
  }

  @js.native
  trait DescribeConfigurationRequest extends js.Object {
    var Arn: __string
  }

  object DescribeConfigurationRequest {
    @inline
    def apply(
        Arn: __string
    ): DescribeConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConfigurationRequest]
    }
  }

  @js.native
  trait DescribeConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var KafkaVersions: js.UndefOr[__listOf__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
    var State: js.UndefOr[ConfigurationState]
  }

  object DescribeConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        KafkaVersions: js.UndefOr[__listOf__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ConfigurationState] = js.undefined
    ): DescribeConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KafkaVersions.foreach(__v => __obj.updateDynamic("KafkaVersions")(__v.asInstanceOf[js.Any]))
      LatestRevision.foreach(__v => __obj.updateDynamic("LatestRevision")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationResponse]
    }
  }

  @js.native
  trait DescribeConfigurationRevisionRequest extends js.Object {
    var Arn: __string
    var Revision: __long
  }

  object DescribeConfigurationRevisionRequest {
    @inline
    def apply(
        Arn: __string,
        Revision: __long
    ): DescribeConfigurationRevisionRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Revision" -> Revision.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
    }
  }

  @js.native
  trait DescribeConfigurationRevisionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var Revision: js.UndefOr[__long]
    var ServerProperties: js.UndefOr[__blob]
  }

  object DescribeConfigurationRevisionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Revision: js.UndefOr[__long] = js.undefined,
        ServerProperties: js.UndefOr[__blob] = js.undefined
    ): DescribeConfigurationRevisionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Revision.foreach(__v => __obj.updateDynamic("Revision")(__v.asInstanceOf[js.Any]))
      ServerProperties.foreach(__v => __obj.updateDynamic("ServerProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
    }
  }

  /** Contains information about the EBS storage volumes attached to Apache Kafka broker nodes.
    */
  @js.native
  trait EBSStorageInfo extends js.Object {
    var VolumeSize: js.UndefOr[__integerMin1Max16384]
  }

  object EBSStorageInfo {
    @inline
    def apply(
        VolumeSize: js.UndefOr[__integerMin1Max16384] = js.undefined
    ): EBSStorageInfo = {
      val __obj = js.Dynamic.literal()
      VolumeSize.foreach(__v => __obj.updateDynamic("VolumeSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EBSStorageInfo]
    }
  }

  /** The data-volume encryption details.
    */
  @js.native
  trait EncryptionAtRest extends js.Object {
    var DataVolumeKMSKeyId: __string
  }

  object EncryptionAtRest {
    @inline
    def apply(
        DataVolumeKMSKeyId: __string
    ): EncryptionAtRest = {
      val __obj = js.Dynamic.literal(
        "DataVolumeKMSKeyId" -> DataVolumeKMSKeyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncryptionAtRest]
    }
  }

  /** The settings for encrypting data in transit.
    */
  @js.native
  trait EncryptionInTransit extends js.Object {
    var ClientBroker: js.UndefOr[ClientBroker]
    var InCluster: js.UndefOr[__boolean]
  }

  object EncryptionInTransit {
    @inline
    def apply(
        ClientBroker: js.UndefOr[ClientBroker] = js.undefined,
        InCluster: js.UndefOr[__boolean] = js.undefined
    ): EncryptionInTransit = {
      val __obj = js.Dynamic.literal()
      ClientBroker.foreach(__v => __obj.updateDynamic("ClientBroker")(__v.asInstanceOf[js.Any]))
      InCluster.foreach(__v => __obj.updateDynamic("InCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionInTransit]
    }
  }

  /** Includes encryption-related information, such as the AWS KMS key used for encrypting data at rest and whether you want MSK to encrypt your data in transit.
    */
  @js.native
  trait EncryptionInfo extends js.Object {
    var EncryptionAtRest: js.UndefOr[EncryptionAtRest]
    var EncryptionInTransit: js.UndefOr[EncryptionInTransit]
  }

  object EncryptionInfo {
    @inline
    def apply(
        EncryptionAtRest: js.UndefOr[EncryptionAtRest] = js.undefined,
        EncryptionInTransit: js.UndefOr[EncryptionInTransit] = js.undefined
    ): EncryptionInfo = {
      val __obj = js.Dynamic.literal()
      EncryptionAtRest.foreach(__v => __obj.updateDynamic("EncryptionAtRest")(__v.asInstanceOf[js.Any]))
      EncryptionInTransit.foreach(__v => __obj.updateDynamic("EncryptionInTransit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionInfo]
    }
  }

  /** Returns information about an error state of the cluster.
    */
  @js.native
  trait ErrorInfo extends js.Object {
    var ErrorCode: js.UndefOr[__string]
    var ErrorString: js.UndefOr[__string]
  }

  object ErrorInfo {
    @inline
    def apply(
        ErrorCode: js.UndefOr[__string] = js.undefined,
        ErrorString: js.UndefOr[__string] = js.undefined
    ): ErrorInfo = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorString.foreach(__v => __obj.updateDynamic("ErrorString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorInfo]
    }
  }

  @js.native
  trait Firehose extends js.Object {
    var Enabled: __boolean
    var DeliveryStream: js.UndefOr[__string]
  }

  object Firehose {
    @inline
    def apply(
        Enabled: __boolean,
        DeliveryStream: js.UndefOr[__string] = js.undefined
    ): Firehose = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      DeliveryStream.foreach(__v => __obj.updateDynamic("DeliveryStream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Firehose]
    }
  }

  @js.native
  trait GetBootstrapBrokersRequest extends js.Object {
    var ClusterArn: __string
  }

  object GetBootstrapBrokersRequest {
    @inline
    def apply(
        ClusterArn: __string
    ): GetBootstrapBrokersRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBootstrapBrokersRequest]
    }
  }

  @js.native
  trait GetBootstrapBrokersResponse extends js.Object {
    var BootstrapBrokerString: js.UndefOr[__string]
    var BootstrapBrokerStringPublicSaslIam: js.UndefOr[__string]
    var BootstrapBrokerStringPublicSaslScram: js.UndefOr[__string]
    var BootstrapBrokerStringPublicTls: js.UndefOr[__string]
    var BootstrapBrokerStringSaslIam: js.UndefOr[__string]
    var BootstrapBrokerStringSaslScram: js.UndefOr[__string]
    var BootstrapBrokerStringTls: js.UndefOr[__string]
  }

  object GetBootstrapBrokersResponse {
    @inline
    def apply(
        BootstrapBrokerString: js.UndefOr[__string] = js.undefined,
        BootstrapBrokerStringPublicSaslIam: js.UndefOr[__string] = js.undefined,
        BootstrapBrokerStringPublicSaslScram: js.UndefOr[__string] = js.undefined,
        BootstrapBrokerStringPublicTls: js.UndefOr[__string] = js.undefined,
        BootstrapBrokerStringSaslIam: js.UndefOr[__string] = js.undefined,
        BootstrapBrokerStringSaslScram: js.UndefOr[__string] = js.undefined,
        BootstrapBrokerStringTls: js.UndefOr[__string] = js.undefined
    ): GetBootstrapBrokersResponse = {
      val __obj = js.Dynamic.literal()
      BootstrapBrokerString.foreach(__v => __obj.updateDynamic("BootstrapBrokerString")(__v.asInstanceOf[js.Any]))
      BootstrapBrokerStringPublicSaslIam.foreach(__v => __obj.updateDynamic("BootstrapBrokerStringPublicSaslIam")(__v.asInstanceOf[js.Any]))
      BootstrapBrokerStringPublicSaslScram.foreach(__v => __obj.updateDynamic("BootstrapBrokerStringPublicSaslScram")(__v.asInstanceOf[js.Any]))
      BootstrapBrokerStringPublicTls.foreach(__v => __obj.updateDynamic("BootstrapBrokerStringPublicTls")(__v.asInstanceOf[js.Any]))
      BootstrapBrokerStringSaslIam.foreach(__v => __obj.updateDynamic("BootstrapBrokerStringSaslIam")(__v.asInstanceOf[js.Any]))
      BootstrapBrokerStringSaslScram.foreach(__v => __obj.updateDynamic("BootstrapBrokerStringSaslScram")(__v.asInstanceOf[js.Any]))
      BootstrapBrokerStringTls.foreach(__v => __obj.updateDynamic("BootstrapBrokerStringTls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBootstrapBrokersResponse]
    }
  }

  @js.native
  trait GetCompatibleKafkaVersionsRequest extends js.Object {
    var ClusterArn: js.UndefOr[__string]
  }

  object GetCompatibleKafkaVersionsRequest {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined
    ): GetCompatibleKafkaVersionsRequest = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCompatibleKafkaVersionsRequest]
    }
  }

  @js.native
  trait GetCompatibleKafkaVersionsResponse extends js.Object {
    var CompatibleKafkaVersions: js.UndefOr[__listOfCompatibleKafkaVersion]
  }

  object GetCompatibleKafkaVersionsResponse {
    @inline
    def apply(
        CompatibleKafkaVersions: js.UndefOr[__listOfCompatibleKafkaVersion] = js.undefined
    ): GetCompatibleKafkaVersionsResponse = {
      val __obj = js.Dynamic.literal()
      CompatibleKafkaVersions.foreach(__v => __obj.updateDynamic("CompatibleKafkaVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCompatibleKafkaVersionsResponse]
    }
  }

  /** Details for IAM access control.
    */
  @js.native
  trait Iam extends js.Object {
    var Enabled: js.UndefOr[__boolean]
  }

  object Iam {
    @inline
    def apply(
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): Iam = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Iam]
    }
  }

  /** Indicates whether you want to turn on or turn off the JMX Exporter.
    */
  @js.native
  trait JmxExporter extends js.Object {
    var EnabledInBroker: __boolean
  }

  object JmxExporter {
    @inline
    def apply(
        EnabledInBroker: __boolean
    ): JmxExporter = {
      val __obj = js.Dynamic.literal(
        "EnabledInBroker" -> EnabledInBroker.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JmxExporter]
    }
  }

  /** Indicates whether you want to turn on or turn off the JMX Exporter.
    */
  @js.native
  trait JmxExporterInfo extends js.Object {
    var EnabledInBroker: __boolean
  }

  object JmxExporterInfo {
    @inline
    def apply(
        EnabledInBroker: __boolean
    ): JmxExporterInfo = {
      val __obj = js.Dynamic.literal(
        "EnabledInBroker" -> EnabledInBroker.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JmxExporterInfo]
    }
  }

  @js.native
  trait KafkaVersion extends js.Object {
    var Status: js.UndefOr[KafkaVersionStatus]
    var Version: js.UndefOr[__string]
  }

  object KafkaVersion {
    @inline
    def apply(
        Status: js.UndefOr[KafkaVersionStatus] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): KafkaVersion = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KafkaVersion]
    }
  }

  @js.native
  trait ListClusterOperationsRequest extends js.Object {
    var ClusterArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListClusterOperationsRequest {
    @inline
    def apply(
        ClusterArn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClusterOperationsRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClusterOperationsRequest]
    }
  }

  @js.native
  trait ListClusterOperationsResponse extends js.Object {
    var ClusterOperationInfoList: js.UndefOr[__listOfClusterOperationInfo]
    var NextToken: js.UndefOr[__string]
  }

  object ListClusterOperationsResponse {
    @inline
    def apply(
        ClusterOperationInfoList: js.UndefOr[__listOfClusterOperationInfo] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClusterOperationsResponse = {
      val __obj = js.Dynamic.literal()
      ClusterOperationInfoList.foreach(__v => __obj.updateDynamic("ClusterOperationInfoList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClusterOperationsResponse]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var ClusterNameFilter: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersRequest {
    @inline
    def apply(
        ClusterNameFilter: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClustersRequest = {
      val __obj = js.Dynamic.literal()
      ClusterNameFilter.foreach(__v => __obj.updateDynamic("ClusterNameFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var ClusterInfoList: js.UndefOr[__listOfClusterInfo]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersResponse {
    @inline
    def apply(
        ClusterInfoList: js.UndefOr[__listOfClusterInfo] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClustersResponse = {
      val __obj = js.Dynamic.literal()
      ClusterInfoList.foreach(__v => __obj.updateDynamic("ClusterInfoList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListClustersV2Request extends js.Object {
    var ClusterNameFilter: js.UndefOr[__string]
    var ClusterTypeFilter: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersV2Request {
    @inline
    def apply(
        ClusterNameFilter: js.UndefOr[__string] = js.undefined,
        ClusterTypeFilter: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClustersV2Request = {
      val __obj = js.Dynamic.literal()
      ClusterNameFilter.foreach(__v => __obj.updateDynamic("ClusterNameFilter")(__v.asInstanceOf[js.Any]))
      ClusterTypeFilter.foreach(__v => __obj.updateDynamic("ClusterTypeFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersV2Request]
    }
  }

  @js.native
  trait ListClustersV2Response extends js.Object {
    var ClusterInfoList: js.UndefOr[__listOfCluster]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersV2Response {
    @inline
    def apply(
        ClusterInfoList: js.UndefOr[__listOfCluster] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClustersV2Response = {
      val __obj = js.Dynamic.literal()
      ClusterInfoList.foreach(__v => __obj.updateDynamic("ClusterInfoList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersV2Response]
    }
  }

  @js.native
  trait ListConfigurationRevisionsRequest extends js.Object {
    var Arn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationRevisionsRequest {
    @inline
    def apply(
        Arn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationRevisionsRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationRevisionsRequest]
    }
  }

  @js.native
  trait ListConfigurationRevisionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Revisions: js.UndefOr[__listOfConfigurationRevision]
  }

  object ListConfigurationRevisionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Revisions: js.UndefOr[__listOfConfigurationRevision] = js.undefined
    ): ListConfigurationRevisionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Revisions.foreach(__v => __obj.updateDynamic("Revisions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationRevisionsResponse]
    }
  }

  @js.native
  trait ListConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationsRequest]
    }
  }

  @js.native
  trait ListConfigurationsResponse extends js.Object {
    var Configurations: js.UndefOr[__listOfConfiguration]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationsResponse {
    @inline
    def apply(
        Configurations: js.UndefOr[__listOfConfiguration] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationsResponse]
    }
  }

  @js.native
  trait ListKafkaVersionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListKafkaVersionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListKafkaVersionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKafkaVersionsRequest]
    }
  }

  @js.native
  trait ListKafkaVersionsResponse extends js.Object {
    var KafkaVersions: js.UndefOr[__listOfKafkaVersion]
    var NextToken: js.UndefOr[__string]
  }

  object ListKafkaVersionsResponse {
    @inline
    def apply(
        KafkaVersions: js.UndefOr[__listOfKafkaVersion] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListKafkaVersionsResponse = {
      val __obj = js.Dynamic.literal()
      KafkaVersions.foreach(__v => __obj.updateDynamic("KafkaVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKafkaVersionsResponse]
    }
  }

  @js.native
  trait ListNodesRequest extends js.Object {
    var ClusterArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListNodesRequest {
    @inline
    def apply(
        ClusterArn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListNodesRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesRequest]
    }
  }

  @js.native
  trait ListNodesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var NodeInfoList: js.UndefOr[__listOfNodeInfo]
  }

  object ListNodesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        NodeInfoList: js.UndefOr[__listOfNodeInfo] = js.undefined
    ): ListNodesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NodeInfoList.foreach(__v => __obj.updateDynamic("NodeInfoList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesResponse]
    }
  }

  @js.native
  trait ListScramSecretsRequest extends js.Object {
    var ClusterArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListScramSecretsRequest {
    @inline
    def apply(
        ClusterArn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListScramSecretsRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScramSecretsRequest]
    }
  }

  @js.native
  trait ListScramSecretsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var SecretArnList: js.UndefOr[__listOf__string]
  }

  object ListScramSecretsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        SecretArnList: js.UndefOr[__listOf__string] = js.undefined
    ): ListScramSecretsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SecretArnList.foreach(__v => __obj.updateDynamic("SecretArnList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScramSecretsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait LoggingInfo extends js.Object {
    var BrokerLogs: BrokerLogs
  }

  object LoggingInfo {
    @inline
    def apply(
        BrokerLogs: BrokerLogs
    ): LoggingInfo = {
      val __obj = js.Dynamic.literal(
        "BrokerLogs" -> BrokerLogs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LoggingInfo]
    }
  }

  /** Information about cluster attributes that can be updated via update APIs.
    */
  @js.native
  trait MutableClusterInfo extends js.Object {
    var BrokerEBSVolumeInfo: js.UndefOr[__listOfBrokerEBSVolumeInfo]
    var ClientAuthentication: js.UndefOr[ClientAuthentication]
    var ConfigurationInfo: js.UndefOr[ConfigurationInfo]
    var ConnectivityInfo: js.UndefOr[ConnectivityInfo]
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var InstanceType: js.UndefOr[__stringMin5Max32]
    var KafkaVersion: js.UndefOr[__string]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var NumberOfBrokerNodes: js.UndefOr[__integer]
    var OpenMonitoring: js.UndefOr[OpenMonitoring]
  }

  object MutableClusterInfo {
    @inline
    def apply(
        BrokerEBSVolumeInfo: js.UndefOr[__listOfBrokerEBSVolumeInfo] = js.undefined,
        ClientAuthentication: js.UndefOr[ClientAuthentication] = js.undefined,
        ConfigurationInfo: js.UndefOr[ConfigurationInfo] = js.undefined,
        ConnectivityInfo: js.UndefOr[ConnectivityInfo] = js.undefined,
        EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
        EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined,
        InstanceType: js.UndefOr[__stringMin5Max32] = js.undefined,
        KafkaVersion: js.UndefOr[__string] = js.undefined,
        LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
        NumberOfBrokerNodes: js.UndefOr[__integer] = js.undefined,
        OpenMonitoring: js.UndefOr[OpenMonitoring] = js.undefined
    ): MutableClusterInfo = {
      val __obj = js.Dynamic.literal()
      BrokerEBSVolumeInfo.foreach(__v => __obj.updateDynamic("BrokerEBSVolumeInfo")(__v.asInstanceOf[js.Any]))
      ClientAuthentication.foreach(__v => __obj.updateDynamic("ClientAuthentication")(__v.asInstanceOf[js.Any]))
      ConfigurationInfo.foreach(__v => __obj.updateDynamic("ConfigurationInfo")(__v.asInstanceOf[js.Any]))
      ConnectivityInfo.foreach(__v => __obj.updateDynamic("ConnectivityInfo")(__v.asInstanceOf[js.Any]))
      EncryptionInfo.foreach(__v => __obj.updateDynamic("EncryptionInfo")(__v.asInstanceOf[js.Any]))
      EnhancedMonitoring.foreach(__v => __obj.updateDynamic("EnhancedMonitoring")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      KafkaVersion.foreach(__v => __obj.updateDynamic("KafkaVersion")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      NumberOfBrokerNodes.foreach(__v => __obj.updateDynamic("NumberOfBrokerNodes")(__v.asInstanceOf[js.Any]))
      OpenMonitoring.foreach(__v => __obj.updateDynamic("OpenMonitoring")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MutableClusterInfo]
    }
  }

  /** Indicates whether you want to turn on or turn off the Node Exporter.
    */
  @js.native
  trait NodeExporter extends js.Object {
    var EnabledInBroker: __boolean
  }

  object NodeExporter {
    @inline
    def apply(
        EnabledInBroker: __boolean
    ): NodeExporter = {
      val __obj = js.Dynamic.literal(
        "EnabledInBroker" -> EnabledInBroker.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NodeExporter]
    }
  }

  /** Indicates whether you want to turn on or turn off the Node Exporter.
    */
  @js.native
  trait NodeExporterInfo extends js.Object {
    var EnabledInBroker: __boolean
  }

  object NodeExporterInfo {
    @inline
    def apply(
        EnabledInBroker: __boolean
    ): NodeExporterInfo = {
      val __obj = js.Dynamic.literal(
        "EnabledInBroker" -> EnabledInBroker.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NodeExporterInfo]
    }
  }

  /** The node information object.
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
    @inline
    def apply(
        AddedToClusterTime: js.UndefOr[__string] = js.undefined,
        BrokerNodeInfo: js.UndefOr[BrokerNodeInfo] = js.undefined,
        InstanceType: js.UndefOr[__string] = js.undefined,
        NodeARN: js.UndefOr[__string] = js.undefined,
        NodeType: js.UndefOr[NodeType] = js.undefined,
        ZookeeperNodeInfo: js.UndefOr[ZookeeperNodeInfo] = js.undefined
    ): NodeInfo = {
      val __obj = js.Dynamic.literal()
      AddedToClusterTime.foreach(__v => __obj.updateDynamic("AddedToClusterTime")(__v.asInstanceOf[js.Any]))
      BrokerNodeInfo.foreach(__v => __obj.updateDynamic("BrokerNodeInfo")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      NodeARN.foreach(__v => __obj.updateDynamic("NodeARN")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      ZookeeperNodeInfo.foreach(__v => __obj.updateDynamic("ZookeeperNodeInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeInfo]
    }
  }

  /** JMX and Node monitoring for the MSK cluster.
    */
  @js.native
  trait OpenMonitoring extends js.Object {
    var Prometheus: Prometheus
  }

  object OpenMonitoring {
    @inline
    def apply(
        Prometheus: Prometheus
    ): OpenMonitoring = {
      val __obj = js.Dynamic.literal(
        "Prometheus" -> Prometheus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpenMonitoring]
    }
  }

  /** JMX and Node monitoring for the MSK cluster.
    */
  @js.native
  trait OpenMonitoringInfo extends js.Object {
    var Prometheus: PrometheusInfo
  }

  object OpenMonitoringInfo {
    @inline
    def apply(
        Prometheus: PrometheusInfo
    ): OpenMonitoringInfo = {
      val __obj = js.Dynamic.literal(
        "Prometheus" -> Prometheus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpenMonitoringInfo]
    }
  }

  /** Prometheus settings.
    */
  @js.native
  trait Prometheus extends js.Object {
    var JmxExporter: js.UndefOr[JmxExporter]
    var NodeExporter: js.UndefOr[NodeExporter]
  }

  object Prometheus {
    @inline
    def apply(
        JmxExporter: js.UndefOr[JmxExporter] = js.undefined,
        NodeExporter: js.UndefOr[NodeExporter] = js.undefined
    ): Prometheus = {
      val __obj = js.Dynamic.literal()
      JmxExporter.foreach(__v => __obj.updateDynamic("JmxExporter")(__v.asInstanceOf[js.Any]))
      NodeExporter.foreach(__v => __obj.updateDynamic("NodeExporter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Prometheus]
    }
  }

  /** Prometheus settings.
    */
  @js.native
  trait PrometheusInfo extends js.Object {
    var JmxExporter: js.UndefOr[JmxExporterInfo]
    var NodeExporter: js.UndefOr[NodeExporterInfo]
  }

  object PrometheusInfo {
    @inline
    def apply(
        JmxExporter: js.UndefOr[JmxExporterInfo] = js.undefined,
        NodeExporter: js.UndefOr[NodeExporterInfo] = js.undefined
    ): PrometheusInfo = {
      val __obj = js.Dynamic.literal()
      JmxExporter.foreach(__v => __obj.updateDynamic("JmxExporter")(__v.asInstanceOf[js.Any]))
      NodeExporter.foreach(__v => __obj.updateDynamic("NodeExporter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrometheusInfo]
    }
  }

  /** Provisioned cluster.
    */
  @js.native
  trait Provisioned extends js.Object {
    var BrokerNodeGroupInfo: BrokerNodeGroupInfo
    var NumberOfBrokerNodes: __integerMin1Max15
    var ClientAuthentication: js.UndefOr[ClientAuthentication]
    var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo]
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var OpenMonitoring: js.UndefOr[OpenMonitoringInfo]
    var ZookeeperConnectString: js.UndefOr[__string]
    var ZookeeperConnectStringTls: js.UndefOr[__string]
  }

  object Provisioned {
    @inline
    def apply(
        BrokerNodeGroupInfo: BrokerNodeGroupInfo,
        NumberOfBrokerNodes: __integerMin1Max15,
        ClientAuthentication: js.UndefOr[ClientAuthentication] = js.undefined,
        CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined,
        EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
        EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined,
        LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
        OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.undefined,
        ZookeeperConnectString: js.UndefOr[__string] = js.undefined,
        ZookeeperConnectStringTls: js.UndefOr[__string] = js.undefined
    ): Provisioned = {
      val __obj = js.Dynamic.literal(
        "BrokerNodeGroupInfo" -> BrokerNodeGroupInfo.asInstanceOf[js.Any],
        "NumberOfBrokerNodes" -> NumberOfBrokerNodes.asInstanceOf[js.Any]
      )

      ClientAuthentication.foreach(__v => __obj.updateDynamic("ClientAuthentication")(__v.asInstanceOf[js.Any]))
      CurrentBrokerSoftwareInfo.foreach(__v => __obj.updateDynamic("CurrentBrokerSoftwareInfo")(__v.asInstanceOf[js.Any]))
      EncryptionInfo.foreach(__v => __obj.updateDynamic("EncryptionInfo")(__v.asInstanceOf[js.Any]))
      EnhancedMonitoring.foreach(__v => __obj.updateDynamic("EnhancedMonitoring")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      OpenMonitoring.foreach(__v => __obj.updateDynamic("OpenMonitoring")(__v.asInstanceOf[js.Any]))
      ZookeeperConnectString.foreach(__v => __obj.updateDynamic("ZookeeperConnectString")(__v.asInstanceOf[js.Any]))
      ZookeeperConnectStringTls.foreach(__v => __obj.updateDynamic("ZookeeperConnectStringTls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Provisioned]
    }
  }

  /** Provisioned cluster request.
    */
  @js.native
  trait ProvisionedRequest extends js.Object {
    var BrokerNodeGroupInfo: BrokerNodeGroupInfo
    var KafkaVersion: __stringMin1Max128
    var NumberOfBrokerNodes: __integerMin1Max15
    var ClientAuthentication: js.UndefOr[ClientAuthentication]
    var ConfigurationInfo: js.UndefOr[ConfigurationInfo]
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var OpenMonitoring: js.UndefOr[OpenMonitoringInfo]
  }

  object ProvisionedRequest {
    @inline
    def apply(
        BrokerNodeGroupInfo: BrokerNodeGroupInfo,
        KafkaVersion: __stringMin1Max128,
        NumberOfBrokerNodes: __integerMin1Max15,
        ClientAuthentication: js.UndefOr[ClientAuthentication] = js.undefined,
        ConfigurationInfo: js.UndefOr[ConfigurationInfo] = js.undefined,
        EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined,
        EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined,
        LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
        OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.undefined
    ): ProvisionedRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerNodeGroupInfo" -> BrokerNodeGroupInfo.asInstanceOf[js.Any],
        "KafkaVersion" -> KafkaVersion.asInstanceOf[js.Any],
        "NumberOfBrokerNodes" -> NumberOfBrokerNodes.asInstanceOf[js.Any]
      )

      ClientAuthentication.foreach(__v => __obj.updateDynamic("ClientAuthentication")(__v.asInstanceOf[js.Any]))
      ConfigurationInfo.foreach(__v => __obj.updateDynamic("ConfigurationInfo")(__v.asInstanceOf[js.Any]))
      EncryptionInfo.foreach(__v => __obj.updateDynamic("EncryptionInfo")(__v.asInstanceOf[js.Any]))
      EnhancedMonitoring.foreach(__v => __obj.updateDynamic("EnhancedMonitoring")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      OpenMonitoring.foreach(__v => __obj.updateDynamic("OpenMonitoring")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedRequest]
    }
  }

  /** Public access control for brokers.
    */
  @js.native
  trait PublicAccess extends js.Object {
    var Type: js.UndefOr[__string]
  }

  object PublicAccess {
    @inline
    def apply(
        Type: js.UndefOr[__string] = js.undefined
    ): PublicAccess = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicAccess]
    }
  }

  /** Reboots a node.
    */
  @js.native
  trait RebootBrokerRequest extends js.Object {
    var BrokerIds: __listOf__string
    var ClusterArn: __string
  }

  object RebootBrokerRequest {
    @inline
    def apply(
        BrokerIds: __listOf__string,
        ClusterArn: __string
    ): RebootBrokerRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerIds" -> BrokerIds.asInstanceOf[js.Any],
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RebootBrokerRequest]
    }
  }

  @js.native
  trait RebootBrokerResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object RebootBrokerResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): RebootBrokerResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootBrokerResponse]
    }
  }

  @js.native
  trait S3 extends js.Object {
    var Enabled: __boolean
    var Bucket: js.UndefOr[__string]
    var Prefix: js.UndefOr[__string]
  }

  object S3 {
    @inline
    def apply(
        Enabled: __boolean,
        Bucket: js.UndefOr[__string] = js.undefined,
        Prefix: js.UndefOr[__string] = js.undefined
    ): S3 = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3]
    }
  }

  /** Details for client authentication using SASL.
    */
  @js.native
  trait Sasl extends js.Object {
    var Iam: js.UndefOr[Iam]
    var Scram: js.UndefOr[Scram]
  }

  object Sasl {
    @inline
    def apply(
        Iam: js.UndefOr[Iam] = js.undefined,
        Scram: js.UndefOr[Scram] = js.undefined
    ): Sasl = {
      val __obj = js.Dynamic.literal()
      Iam.foreach(__v => __obj.updateDynamic("Iam")(__v.asInstanceOf[js.Any]))
      Scram.foreach(__v => __obj.updateDynamic("Scram")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Sasl]
    }
  }

  /** Details for SASL/SCRAM client authentication.
    */
  @js.native
  trait Scram extends js.Object {
    var Enabled: js.UndefOr[__boolean]
  }

  object Scram {
    @inline
    def apply(
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): Scram = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scram]
    }
  }

  /** Serverless cluster.
    */
  @js.native
  trait Serverless extends js.Object {
    var VpcConfigs: __listOfVpcConfig
    var ClientAuthentication: js.UndefOr[ServerlessClientAuthentication]
  }

  object Serverless {
    @inline
    def apply(
        VpcConfigs: __listOfVpcConfig,
        ClientAuthentication: js.UndefOr[ServerlessClientAuthentication] = js.undefined
    ): Serverless = {
      val __obj = js.Dynamic.literal(
        "VpcConfigs" -> VpcConfigs.asInstanceOf[js.Any]
      )

      ClientAuthentication.foreach(__v => __obj.updateDynamic("ClientAuthentication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Serverless]
    }
  }

  /** Includes all client authentication information.
    */
  @js.native
  trait ServerlessClientAuthentication extends js.Object {
    var Sasl: js.UndefOr[ServerlessSasl]
  }

  object ServerlessClientAuthentication {
    @inline
    def apply(
        Sasl: js.UndefOr[ServerlessSasl] = js.undefined
    ): ServerlessClientAuthentication = {
      val __obj = js.Dynamic.literal()
      Sasl.foreach(__v => __obj.updateDynamic("Sasl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerlessClientAuthentication]
    }
  }

  /** Serverless cluster request.
    */
  @js.native
  trait ServerlessRequest extends js.Object {
    var VpcConfigs: __listOfVpcConfig
    var ClientAuthentication: js.UndefOr[ServerlessClientAuthentication]
  }

  object ServerlessRequest {
    @inline
    def apply(
        VpcConfigs: __listOfVpcConfig,
        ClientAuthentication: js.UndefOr[ServerlessClientAuthentication] = js.undefined
    ): ServerlessRequest = {
      val __obj = js.Dynamic.literal(
        "VpcConfigs" -> VpcConfigs.asInstanceOf[js.Any]
      )

      ClientAuthentication.foreach(__v => __obj.updateDynamic("ClientAuthentication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerlessRequest]
    }
  }

  /** Details for client authentication using SASL.
    */
  @js.native
  trait ServerlessSasl extends js.Object {
    var Iam: js.UndefOr[Iam]
  }

  object ServerlessSasl {
    @inline
    def apply(
        Iam: js.UndefOr[Iam] = js.undefined
    ): ServerlessSasl = {
      val __obj = js.Dynamic.literal()
      Iam.foreach(__v => __obj.updateDynamic("Iam")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerlessSasl]
    }
  }

  @js.native
  trait StateInfo extends js.Object {
    var Code: js.UndefOr[__string]
    var Message: js.UndefOr[__string]
  }

  object StateInfo {
    @inline
    def apply(
        Code: js.UndefOr[__string] = js.undefined,
        Message: js.UndefOr[__string] = js.undefined
    ): StateInfo = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StateInfo]
    }
  }

  /** Contains information about storage volumes attached to MSK broker nodes.
    */
  @js.native
  trait StorageInfo extends js.Object {
    var EbsStorageInfo: js.UndefOr[EBSStorageInfo]
  }

  object StorageInfo {
    @inline
    def apply(
        EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.undefined
    ): StorageInfo = {
      val __obj = js.Dynamic.literal()
      EbsStorageInfo.foreach(__v => __obj.updateDynamic("EbsStorageInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageInfo]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** Details for client authentication using TLS.
    */
  @js.native
  trait Tls extends js.Object {
    var CertificateAuthorityArnList: js.UndefOr[__listOf__string]
    var Enabled: js.UndefOr[__boolean]
  }

  object Tls {
    @inline
    def apply(
        CertificateAuthorityArnList: js.UndefOr[__listOf__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): Tls = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorityArnList.foreach(__v => __obj.updateDynamic("CertificateAuthorityArnList")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tls]
    }
  }

  @js.native
  trait Unauthenticated extends js.Object {
    var Enabled: js.UndefOr[__boolean]
  }

  object Unauthenticated {
    @inline
    def apply(
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): Unauthenticated = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Unauthenticated]
    }
  }

  /** Error info for scram secret associate/disassociate failure.
    */
  @js.native
  trait UnprocessedScramSecret extends js.Object {
    var ErrorCode: js.UndefOr[__string]
    var ErrorMessage: js.UndefOr[__string]
    var SecretArn: js.UndefOr[__string]
  }

  object UnprocessedScramSecret {
    @inline
    def apply(
        ErrorCode: js.UndefOr[__string] = js.undefined,
        ErrorMessage: js.UndefOr[__string] = js.undefined,
        SecretArn: js.UndefOr[__string] = js.undefined
    ): UnprocessedScramSecret = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedScramSecret]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateBrokerCountRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var TargetNumberOfBrokerNodes: __integerMin1Max15
  }

  object UpdateBrokerCountRequest {
    @inline
    def apply(
        ClusterArn: __string,
        CurrentVersion: __string,
        TargetNumberOfBrokerNodes: __integerMin1Max15
    ): UpdateBrokerCountRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any],
        "TargetNumberOfBrokerNodes" -> TargetNumberOfBrokerNodes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateBrokerCountRequest]
    }
  }

  @js.native
  trait UpdateBrokerCountResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object UpdateBrokerCountResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): UpdateBrokerCountResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBrokerCountResponse]
    }
  }

  @js.native
  trait UpdateBrokerStorageRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var TargetBrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo
  }

  object UpdateBrokerStorageRequest {
    @inline
    def apply(
        ClusterArn: __string,
        CurrentVersion: __string,
        TargetBrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo
    ): UpdateBrokerStorageRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any],
        "TargetBrokerEBSVolumeInfo" -> TargetBrokerEBSVolumeInfo.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateBrokerStorageRequest]
    }
  }

  @js.native
  trait UpdateBrokerStorageResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object UpdateBrokerStorageResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): UpdateBrokerStorageResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBrokerStorageResponse]
    }
  }

  @js.native
  trait UpdateBrokerTypeRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var TargetInstanceType: __string
  }

  object UpdateBrokerTypeRequest {
    @inline
    def apply(
        ClusterArn: __string,
        CurrentVersion: __string,
        TargetInstanceType: __string
    ): UpdateBrokerTypeRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any],
        "TargetInstanceType" -> TargetInstanceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateBrokerTypeRequest]
    }
  }

  @js.native
  trait UpdateBrokerTypeResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object UpdateBrokerTypeResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): UpdateBrokerTypeResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBrokerTypeResponse]
    }
  }

  @js.native
  trait UpdateClusterConfigurationRequest extends js.Object {
    var ClusterArn: __string
    var ConfigurationInfo: ConfigurationInfo
    var CurrentVersion: __string
  }

  object UpdateClusterConfigurationRequest {
    @inline
    def apply(
        ClusterArn: __string,
        ConfigurationInfo: ConfigurationInfo,
        CurrentVersion: __string
    ): UpdateClusterConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "ConfigurationInfo" -> ConfigurationInfo.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateClusterConfigurationRequest]
    }
  }

  @js.native
  trait UpdateClusterConfigurationResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object UpdateClusterConfigurationResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): UpdateClusterConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterConfigurationResponse]
    }
  }

  @js.native
  trait UpdateClusterKafkaVersionRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var TargetKafkaVersion: __string
    var ConfigurationInfo: js.UndefOr[ConfigurationInfo]
  }

  object UpdateClusterKafkaVersionRequest {
    @inline
    def apply(
        ClusterArn: __string,
        CurrentVersion: __string,
        TargetKafkaVersion: __string,
        ConfigurationInfo: js.UndefOr[ConfigurationInfo] = js.undefined
    ): UpdateClusterKafkaVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any],
        "TargetKafkaVersion" -> TargetKafkaVersion.asInstanceOf[js.Any]
      )

      ConfigurationInfo.foreach(__v => __obj.updateDynamic("ConfigurationInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterKafkaVersionRequest]
    }
  }

  @js.native
  trait UpdateClusterKafkaVersionResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object UpdateClusterKafkaVersionResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): UpdateClusterKafkaVersionResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterKafkaVersionResponse]
    }
  }

  @js.native
  trait UpdateConfigurationRequest extends js.Object {
    var Arn: __string
    var ServerProperties: __blob
    var Description: js.UndefOr[__string]
  }

  object UpdateConfigurationRequest {
    @inline
    def apply(
        Arn: __string,
        ServerProperties: __blob,
        Description: js.UndefOr[__string] = js.undefined
    ): UpdateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ServerProperties" -> ServerProperties.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConfigurationRequest]
    }
  }

  @js.native
  trait UpdateConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
  }

  object UpdateConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
    ): UpdateConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      LatestRevision.foreach(__v => __obj.updateDynamic("LatestRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConfigurationResponse]
    }
  }

  /** Request body for UpdateConnectivity.
    */
  @js.native
  trait UpdateConnectivityRequest extends js.Object {
    var ClusterArn: __string
    var ConnectivityInfo: ConnectivityInfo
    var CurrentVersion: __string
  }

  object UpdateConnectivityRequest {
    @inline
    def apply(
        ClusterArn: __string,
        ConnectivityInfo: ConnectivityInfo,
        CurrentVersion: __string
    ): UpdateConnectivityRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "ConnectivityInfo" -> ConnectivityInfo.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateConnectivityRequest]
    }
  }

  @js.native
  trait UpdateConnectivityResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object UpdateConnectivityResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): UpdateConnectivityResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectivityResponse]
    }
  }

  /** Request body for UpdateMonitoring.
    */
  @js.native
  trait UpdateMonitoringRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring]
    var LoggingInfo: js.UndefOr[LoggingInfo]
    var OpenMonitoring: js.UndefOr[OpenMonitoringInfo]
  }

  object UpdateMonitoringRequest {
    @inline
    def apply(
        ClusterArn: __string,
        CurrentVersion: __string,
        EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined,
        LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined,
        OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.undefined
    ): UpdateMonitoringRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any]
      )

      EnhancedMonitoring.foreach(__v => __obj.updateDynamic("EnhancedMonitoring")(__v.asInstanceOf[js.Any]))
      LoggingInfo.foreach(__v => __obj.updateDynamic("LoggingInfo")(__v.asInstanceOf[js.Any]))
      OpenMonitoring.foreach(__v => __obj.updateDynamic("OpenMonitoring")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMonitoringRequest]
    }
  }

  @js.native
  trait UpdateMonitoringResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object UpdateMonitoringResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): UpdateMonitoringResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMonitoringResponse]
    }
  }

  @js.native
  trait UpdateSecurityRequest extends js.Object {
    var ClusterArn: __string
    var CurrentVersion: __string
    var ClientAuthentication: js.UndefOr[ClientAuthentication]
    var EncryptionInfo: js.UndefOr[EncryptionInfo]
  }

  object UpdateSecurityRequest {
    @inline
    def apply(
        ClusterArn: __string,
        CurrentVersion: __string,
        ClientAuthentication: js.UndefOr[ClientAuthentication] = js.undefined,
        EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
    ): UpdateSecurityRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any]
      )

      ClientAuthentication.foreach(__v => __obj.updateDynamic("ClientAuthentication")(__v.asInstanceOf[js.Any]))
      EncryptionInfo.foreach(__v => __obj.updateDynamic("EncryptionInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityRequest]
    }
  }

  @js.native
  trait UpdateSecurityResponse extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var ClusterOperationArn: js.UndefOr[__string]
  }

  object UpdateSecurityResponse {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        ClusterOperationArn: js.UndefOr[__string] = js.undefined
    ): UpdateSecurityResponse = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterOperationArn.foreach(__v => __obj.updateDynamic("ClusterOperationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityResponse]
    }
  }

  /** The configuration of the Amazon VPCs for the cluster.
    */
  @js.native
  trait VpcConfig extends js.Object {
    var SubnetIds: __listOf__string
    var SecurityGroupIds: js.UndefOr[__listOf__string]
  }

  object VpcConfig {
    @inline
    def apply(
        SubnetIds: __listOf__string,
        SecurityGroupIds: js.UndefOr[__listOf__string] = js.undefined
    ): VpcConfig = {
      val __obj = js.Dynamic.literal(
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfig]
    }
  }

  /** Zookeeper node information.
    */
  @js.native
  trait ZookeeperNodeInfo extends js.Object {
    var AttachedENIId: js.UndefOr[__string]
    var ClientVpcIpAddress: js.UndefOr[__string]
    var Endpoints: js.UndefOr[__listOf__string]
    var ZookeeperId: js.UndefOr[__double]
    var ZookeeperVersion: js.UndefOr[__string]
  }

  object ZookeeperNodeInfo {
    @inline
    def apply(
        AttachedENIId: js.UndefOr[__string] = js.undefined,
        ClientVpcIpAddress: js.UndefOr[__string] = js.undefined,
        Endpoints: js.UndefOr[__listOf__string] = js.undefined,
        ZookeeperId: js.UndefOr[__double] = js.undefined,
        ZookeeperVersion: js.UndefOr[__string] = js.undefined
    ): ZookeeperNodeInfo = {
      val __obj = js.Dynamic.literal()
      AttachedENIId.foreach(__v => __obj.updateDynamic("AttachedENIId")(__v.asInstanceOf[js.Any]))
      ClientVpcIpAddress.foreach(__v => __obj.updateDynamic("ClientVpcIpAddress")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      ZookeeperId.foreach(__v => __obj.updateDynamic("ZookeeperId")(__v.asInstanceOf[js.Any]))
      ZookeeperVersion.foreach(__v => __obj.updateDynamic("ZookeeperVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ZookeeperNodeInfo]
    }
  }
}
