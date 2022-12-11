package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object kafkaconnect {
  type MaxResults = Int
  type SyntheticCreateConnectorRequest__mapOf__string = js.Dictionary[__string]
  type SyntheticCreateWorkerConfigurationRequest__string = String
  type SyntheticDescribeConnectorResponse__mapOf__string = js.Dictionary[__string]
  type SyntheticWorkerConfigurationRevisionDescription__string = String
  type __boolean = Boolean
  type __integer = Int
  type __integerMin1Max10 = Int
  type __integerMin1Max100 = Int
  type __integerMin1Max8 = Int
  type __listOfConnectorSummary = js.Array[ConnectorSummary]
  type __listOfCustomPluginSummary = js.Array[CustomPluginSummary]
  type __listOfPlugin = js.Array[Plugin]
  type __listOfPluginDescription = js.Array[PluginDescription]
  type __listOfWorkerConfigurationSummary = js.Array[WorkerConfigurationSummary]
  type __listOf__string = js.Array[__string]
  type __long = Double
  type __longMin1 = Double
  type __string = String
  type __stringMax1024 = String
  type __stringMin1Max128 = String
  type __timestampIso8601 = js.Date

  final class KafkaConnectOps(private val service: KafkaConnect) extends AnyVal {

    @inline def createConnectorFuture(params: CreateConnectorRequest): Future[CreateConnectorResponse] = service.createConnector(params).promise().toFuture
    @inline def createCustomPluginFuture(params: CreateCustomPluginRequest): Future[CreateCustomPluginResponse] = service.createCustomPlugin(params).promise().toFuture
    @inline def createWorkerConfigurationFuture(params: CreateWorkerConfigurationRequest): Future[CreateWorkerConfigurationResponse] = service.createWorkerConfiguration(params).promise().toFuture
    @inline def deleteConnectorFuture(params: DeleteConnectorRequest): Future[DeleteConnectorResponse] = service.deleteConnector(params).promise().toFuture
    @inline def deleteCustomPluginFuture(params: DeleteCustomPluginRequest): Future[DeleteCustomPluginResponse] = service.deleteCustomPlugin(params).promise().toFuture
    @inline def describeConnectorFuture(params: DescribeConnectorRequest): Future[DescribeConnectorResponse] = service.describeConnector(params).promise().toFuture
    @inline def describeCustomPluginFuture(params: DescribeCustomPluginRequest): Future[DescribeCustomPluginResponse] = service.describeCustomPlugin(params).promise().toFuture
    @inline def describeWorkerConfigurationFuture(params: DescribeWorkerConfigurationRequest): Future[DescribeWorkerConfigurationResponse] = service.describeWorkerConfiguration(params).promise().toFuture
    @inline def listConnectorsFuture(params: ListConnectorsRequest): Future[ListConnectorsResponse] = service.listConnectors(params).promise().toFuture
    @inline def listCustomPluginsFuture(params: ListCustomPluginsRequest): Future[ListCustomPluginsResponse] = service.listCustomPlugins(params).promise().toFuture
    @inline def listWorkerConfigurationsFuture(params: ListWorkerConfigurationsRequest): Future[ListWorkerConfigurationsResponse] = service.listWorkerConfigurations(params).promise().toFuture
    @inline def updateConnectorFuture(params: UpdateConnectorRequest): Future[UpdateConnectorResponse] = service.updateConnector(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/kafkaconnect", JSImport.Namespace, "AWS.KafkaConnect")
  class KafkaConnect() extends js.Object {
    def this(config: AWSConfig) = this()

    def createConnector(params: CreateConnectorRequest): Request[CreateConnectorResponse] = js.native
    def createCustomPlugin(params: CreateCustomPluginRequest): Request[CreateCustomPluginResponse] = js.native
    def createWorkerConfiguration(params: CreateWorkerConfigurationRequest): Request[CreateWorkerConfigurationResponse] = js.native
    def deleteConnector(params: DeleteConnectorRequest): Request[DeleteConnectorResponse] = js.native
    def deleteCustomPlugin(params: DeleteCustomPluginRequest): Request[DeleteCustomPluginResponse] = js.native
    def describeConnector(params: DescribeConnectorRequest): Request[DescribeConnectorResponse] = js.native
    def describeCustomPlugin(params: DescribeCustomPluginRequest): Request[DescribeCustomPluginResponse] = js.native
    def describeWorkerConfiguration(params: DescribeWorkerConfigurationRequest): Request[DescribeWorkerConfigurationResponse] = js.native
    def listConnectors(params: ListConnectorsRequest): Request[ListConnectorsResponse] = js.native
    def listCustomPlugins(params: ListCustomPluginsRequest): Request[ListCustomPluginsResponse] = js.native
    def listWorkerConfigurations(params: ListWorkerConfigurationsRequest): Request[ListWorkerConfigurationsResponse] = js.native
    def updateConnector(params: UpdateConnectorRequest): Request[UpdateConnectorResponse] = js.native
  }
  object KafkaConnect {
    @inline implicit def toOps(service: KafkaConnect): KafkaConnectOps = {
      new KafkaConnectOps(service)
    }
  }

  /** The details of the Apache Kafka cluster to which the connector is connected.
    */
  @js.native
  trait ApacheKafkaCluster extends js.Object {
    var bootstrapServers: __string
    var vpc: Vpc
  }

  object ApacheKafkaCluster {
    @inline
    def apply(
        bootstrapServers: __string,
        vpc: Vpc
    ): ApacheKafkaCluster = {
      val __obj = js.Dynamic.literal(
        "bootstrapServers" -> bootstrapServers.asInstanceOf[js.Any],
        "vpc" -> vpc.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ApacheKafkaCluster]
    }
  }

  /** The description of the Apache Kafka cluster to which the connector is connected.
    */
  @js.native
  trait ApacheKafkaClusterDescription extends js.Object {
    var bootstrapServers: js.UndefOr[__string]
    var vpc: js.UndefOr[VpcDescription]
  }

  object ApacheKafkaClusterDescription {
    @inline
    def apply(
        bootstrapServers: js.UndefOr[__string] = js.undefined,
        vpc: js.UndefOr[VpcDescription] = js.undefined
    ): ApacheKafkaClusterDescription = {
      val __obj = js.Dynamic.literal()
      bootstrapServers.foreach(__v => __obj.updateDynamic("bootstrapServers")(__v.asInstanceOf[js.Any]))
      vpc.foreach(__v => __obj.updateDynamic("vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApacheKafkaClusterDescription]
    }
  }

  /** Specifies how the connector scales.
    */
  @js.native
  trait AutoScaling extends js.Object {
    var maxWorkerCount: __integerMin1Max10
    var mcuCount: __integerMin1Max8
    var minWorkerCount: __integerMin1Max10
    var scaleInPolicy: js.UndefOr[ScaleInPolicy]
    var scaleOutPolicy: js.UndefOr[ScaleOutPolicy]
  }

  object AutoScaling {
    @inline
    def apply(
        maxWorkerCount: __integerMin1Max10,
        mcuCount: __integerMin1Max8,
        minWorkerCount: __integerMin1Max10,
        scaleInPolicy: js.UndefOr[ScaleInPolicy] = js.undefined,
        scaleOutPolicy: js.UndefOr[ScaleOutPolicy] = js.undefined
    ): AutoScaling = {
      val __obj = js.Dynamic.literal(
        "maxWorkerCount" -> maxWorkerCount.asInstanceOf[js.Any],
        "mcuCount" -> mcuCount.asInstanceOf[js.Any],
        "minWorkerCount" -> minWorkerCount.asInstanceOf[js.Any]
      )

      scaleInPolicy.foreach(__v => __obj.updateDynamic("scaleInPolicy")(__v.asInstanceOf[js.Any]))
      scaleOutPolicy.foreach(__v => __obj.updateDynamic("scaleOutPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScaling]
    }
  }

  /** Information about the auto scaling parameters for the connector.
    */
  @js.native
  trait AutoScalingDescription extends js.Object {
    var maxWorkerCount: js.UndefOr[__integer]
    var mcuCount: js.UndefOr[__integer]
    var minWorkerCount: js.UndefOr[__integer]
    var scaleInPolicy: js.UndefOr[ScaleInPolicyDescription]
    var scaleOutPolicy: js.UndefOr[ScaleOutPolicyDescription]
  }

  object AutoScalingDescription {
    @inline
    def apply(
        maxWorkerCount: js.UndefOr[__integer] = js.undefined,
        mcuCount: js.UndefOr[__integer] = js.undefined,
        minWorkerCount: js.UndefOr[__integer] = js.undefined,
        scaleInPolicy: js.UndefOr[ScaleInPolicyDescription] = js.undefined,
        scaleOutPolicy: js.UndefOr[ScaleOutPolicyDescription] = js.undefined
    ): AutoScalingDescription = {
      val __obj = js.Dynamic.literal()
      maxWorkerCount.foreach(__v => __obj.updateDynamic("maxWorkerCount")(__v.asInstanceOf[js.Any]))
      mcuCount.foreach(__v => __obj.updateDynamic("mcuCount")(__v.asInstanceOf[js.Any]))
      minWorkerCount.foreach(__v => __obj.updateDynamic("minWorkerCount")(__v.asInstanceOf[js.Any]))
      scaleInPolicy.foreach(__v => __obj.updateDynamic("scaleInPolicy")(__v.asInstanceOf[js.Any]))
      scaleOutPolicy.foreach(__v => __obj.updateDynamic("scaleOutPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingDescription]
    }
  }

  /** The updates to the auto scaling parameters for the connector.
    */
  @js.native
  trait AutoScalingUpdate extends js.Object {
    var maxWorkerCount: __integerMin1Max10
    var mcuCount: __integerMin1Max8
    var minWorkerCount: __integerMin1Max10
    var scaleInPolicy: ScaleInPolicyUpdate
    var scaleOutPolicy: ScaleOutPolicyUpdate
  }

  object AutoScalingUpdate {
    @inline
    def apply(
        maxWorkerCount: __integerMin1Max10,
        mcuCount: __integerMin1Max8,
        minWorkerCount: __integerMin1Max10,
        scaleInPolicy: ScaleInPolicyUpdate,
        scaleOutPolicy: ScaleOutPolicyUpdate
    ): AutoScalingUpdate = {
      val __obj = js.Dynamic.literal(
        "maxWorkerCount" -> maxWorkerCount.asInstanceOf[js.Any],
        "mcuCount" -> mcuCount.asInstanceOf[js.Any],
        "minWorkerCount" -> minWorkerCount.asInstanceOf[js.Any],
        "scaleInPolicy" -> scaleInPolicy.asInstanceOf[js.Any],
        "scaleOutPolicy" -> scaleOutPolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AutoScalingUpdate]
    }
  }

  /** Information about the capacity of the connector, whether it is auto scaled or provisioned.
    */
  @js.native
  trait Capacity extends js.Object {
    var autoScaling: js.UndefOr[AutoScaling]
    var provisionedCapacity: js.UndefOr[ProvisionedCapacity]
  }

  object Capacity {
    @inline
    def apply(
        autoScaling: js.UndefOr[AutoScaling] = js.undefined,
        provisionedCapacity: js.UndefOr[ProvisionedCapacity] = js.undefined
    ): Capacity = {
      val __obj = js.Dynamic.literal()
      autoScaling.foreach(__v => __obj.updateDynamic("autoScaling")(__v.asInstanceOf[js.Any]))
      provisionedCapacity.foreach(__v => __obj.updateDynamic("provisionedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Capacity]
    }
  }

  /** A description of the connector's capacity.
    */
  @js.native
  trait CapacityDescription extends js.Object {
    var autoScaling: js.UndefOr[AutoScalingDescription]
    var provisionedCapacity: js.UndefOr[ProvisionedCapacityDescription]
  }

  object CapacityDescription {
    @inline
    def apply(
        autoScaling: js.UndefOr[AutoScalingDescription] = js.undefined,
        provisionedCapacity: js.UndefOr[ProvisionedCapacityDescription] = js.undefined
    ): CapacityDescription = {
      val __obj = js.Dynamic.literal()
      autoScaling.foreach(__v => __obj.updateDynamic("autoScaling")(__v.asInstanceOf[js.Any]))
      provisionedCapacity.foreach(__v => __obj.updateDynamic("provisionedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CapacityDescription]
    }
  }

  /** The target capacity for the connector. The capacity can be auto scaled or provisioned.
    */
  @js.native
  trait CapacityUpdate extends js.Object {
    var autoScaling: js.UndefOr[AutoScalingUpdate]
    var provisionedCapacity: js.UndefOr[ProvisionedCapacityUpdate]
  }

  object CapacityUpdate {
    @inline
    def apply(
        autoScaling: js.UndefOr[AutoScalingUpdate] = js.undefined,
        provisionedCapacity: js.UndefOr[ProvisionedCapacityUpdate] = js.undefined
    ): CapacityUpdate = {
      val __obj = js.Dynamic.literal()
      autoScaling.foreach(__v => __obj.updateDynamic("autoScaling")(__v.asInstanceOf[js.Any]))
      provisionedCapacity.foreach(__v => __obj.updateDynamic("provisionedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CapacityUpdate]
    }
  }

  /** The settings for delivering connector logs to Amazon CloudWatch Logs.
    */
  @js.native
  trait CloudWatchLogsLogDelivery extends js.Object {
    var enabled: __boolean
    var logGroup: js.UndefOr[__string]
  }

  object CloudWatchLogsLogDelivery {
    @inline
    def apply(
        enabled: __boolean,
        logGroup: js.UndefOr[__string] = js.undefined
    ): CloudWatchLogsLogDelivery = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )

      logGroup.foreach(__v => __obj.updateDynamic("logGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsLogDelivery]
    }
  }

  /** A description of the log delivery settings.
    */
  @js.native
  trait CloudWatchLogsLogDeliveryDescription extends js.Object {
    var enabled: js.UndefOr[__boolean]
    var logGroup: js.UndefOr[__string]
  }

  object CloudWatchLogsLogDeliveryDescription {
    @inline
    def apply(
        enabled: js.UndefOr[__boolean] = js.undefined,
        logGroup: js.UndefOr[__string] = js.undefined
    ): CloudWatchLogsLogDeliveryDescription = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      logGroup.foreach(__v => __obj.updateDynamic("logGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsLogDeliveryDescription]
    }
  }

  /** Summary of a connector.
    */
  @js.native
  trait ConnectorSummary extends js.Object {
    var capacity: js.UndefOr[CapacityDescription]
    var connectorArn: js.UndefOr[__string]
    var connectorDescription: js.UndefOr[__string]
    var connectorName: js.UndefOr[__string]
    var connectorState: js.UndefOr[ConnectorState]
    var creationTime: js.UndefOr[__timestampIso8601]
    var currentVersion: js.UndefOr[__string]
    var kafkaCluster: js.UndefOr[KafkaClusterDescription]
    var kafkaClusterClientAuthentication: js.UndefOr[KafkaClusterClientAuthenticationDescription]
    var kafkaClusterEncryptionInTransit: js.UndefOr[KafkaClusterEncryptionInTransitDescription]
    var kafkaConnectVersion: js.UndefOr[__string]
    var logDelivery: js.UndefOr[LogDeliveryDescription]
    var plugins: js.UndefOr[__listOfPluginDescription]
    var serviceExecutionRoleArn: js.UndefOr[__string]
    var workerConfiguration: js.UndefOr[WorkerConfigurationDescription]
  }

  object ConnectorSummary {
    @inline
    def apply(
        capacity: js.UndefOr[CapacityDescription] = js.undefined,
        connectorArn: js.UndefOr[__string] = js.undefined,
        connectorDescription: js.UndefOr[__string] = js.undefined,
        connectorName: js.UndefOr[__string] = js.undefined,
        connectorState: js.UndefOr[ConnectorState] = js.undefined,
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        currentVersion: js.UndefOr[__string] = js.undefined,
        kafkaCluster: js.UndefOr[KafkaClusterDescription] = js.undefined,
        kafkaClusterClientAuthentication: js.UndefOr[KafkaClusterClientAuthenticationDescription] = js.undefined,
        kafkaClusterEncryptionInTransit: js.UndefOr[KafkaClusterEncryptionInTransitDescription] = js.undefined,
        kafkaConnectVersion: js.UndefOr[__string] = js.undefined,
        logDelivery: js.UndefOr[LogDeliveryDescription] = js.undefined,
        plugins: js.UndefOr[__listOfPluginDescription] = js.undefined,
        serviceExecutionRoleArn: js.UndefOr[__string] = js.undefined,
        workerConfiguration: js.UndefOr[WorkerConfigurationDescription] = js.undefined
    ): ConnectorSummary = {
      val __obj = js.Dynamic.literal()
      capacity.foreach(__v => __obj.updateDynamic("capacity")(__v.asInstanceOf[js.Any]))
      connectorArn.foreach(__v => __obj.updateDynamic("connectorArn")(__v.asInstanceOf[js.Any]))
      connectorDescription.foreach(__v => __obj.updateDynamic("connectorDescription")(__v.asInstanceOf[js.Any]))
      connectorName.foreach(__v => __obj.updateDynamic("connectorName")(__v.asInstanceOf[js.Any]))
      connectorState.foreach(__v => __obj.updateDynamic("connectorState")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      currentVersion.foreach(__v => __obj.updateDynamic("currentVersion")(__v.asInstanceOf[js.Any]))
      kafkaCluster.foreach(__v => __obj.updateDynamic("kafkaCluster")(__v.asInstanceOf[js.Any]))
      kafkaClusterClientAuthentication.foreach(__v => __obj.updateDynamic("kafkaClusterClientAuthentication")(__v.asInstanceOf[js.Any]))
      kafkaClusterEncryptionInTransit.foreach(__v => __obj.updateDynamic("kafkaClusterEncryptionInTransit")(__v.asInstanceOf[js.Any]))
      kafkaConnectVersion.foreach(__v => __obj.updateDynamic("kafkaConnectVersion")(__v.asInstanceOf[js.Any]))
      logDelivery.foreach(__v => __obj.updateDynamic("logDelivery")(__v.asInstanceOf[js.Any]))
      plugins.foreach(__v => __obj.updateDynamic("plugins")(__v.asInstanceOf[js.Any]))
      serviceExecutionRoleArn.foreach(__v => __obj.updateDynamic("serviceExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      workerConfiguration.foreach(__v => __obj.updateDynamic("workerConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorSummary]
    }
  }

  @js.native
  trait CreateConnectorRequest extends js.Object {
    var capacity: Capacity
    var connectorConfiguration: SyntheticCreateConnectorRequest__mapOf__string
    var connectorName: __stringMin1Max128
    var kafkaCluster: KafkaCluster
    var kafkaClusterClientAuthentication: KafkaClusterClientAuthentication
    var kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransit
    var kafkaConnectVersion: __string
    var plugins: __listOfPlugin
    var serviceExecutionRoleArn: __string
    var connectorDescription: js.UndefOr[__stringMax1024]
    var logDelivery: js.UndefOr[LogDelivery]
    var workerConfiguration: js.UndefOr[WorkerConfiguration]
  }

  object CreateConnectorRequest {
    @inline
    def apply(
        capacity: Capacity,
        connectorConfiguration: SyntheticCreateConnectorRequest__mapOf__string,
        connectorName: __stringMin1Max128,
        kafkaCluster: KafkaCluster,
        kafkaClusterClientAuthentication: KafkaClusterClientAuthentication,
        kafkaClusterEncryptionInTransit: KafkaClusterEncryptionInTransit,
        kafkaConnectVersion: __string,
        plugins: __listOfPlugin,
        serviceExecutionRoleArn: __string,
        connectorDescription: js.UndefOr[__stringMax1024] = js.undefined,
        logDelivery: js.UndefOr[LogDelivery] = js.undefined,
        workerConfiguration: js.UndefOr[WorkerConfiguration] = js.undefined
    ): CreateConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "capacity" -> capacity.asInstanceOf[js.Any],
        "connectorConfiguration" -> connectorConfiguration.asInstanceOf[js.Any],
        "connectorName" -> connectorName.asInstanceOf[js.Any],
        "kafkaCluster" -> kafkaCluster.asInstanceOf[js.Any],
        "kafkaClusterClientAuthentication" -> kafkaClusterClientAuthentication.asInstanceOf[js.Any],
        "kafkaClusterEncryptionInTransit" -> kafkaClusterEncryptionInTransit.asInstanceOf[js.Any],
        "kafkaConnectVersion" -> kafkaConnectVersion.asInstanceOf[js.Any],
        "plugins" -> plugins.asInstanceOf[js.Any],
        "serviceExecutionRoleArn" -> serviceExecutionRoleArn.asInstanceOf[js.Any]
      )

      connectorDescription.foreach(__v => __obj.updateDynamic("connectorDescription")(__v.asInstanceOf[js.Any]))
      logDelivery.foreach(__v => __obj.updateDynamic("logDelivery")(__v.asInstanceOf[js.Any]))
      workerConfiguration.foreach(__v => __obj.updateDynamic("workerConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorRequest]
    }
  }

  @js.native
  trait CreateConnectorResponse extends js.Object {
    var connectorArn: js.UndefOr[__string]
    var connectorName: js.UndefOr[__string]
    var connectorState: js.UndefOr[ConnectorState]
  }

  object CreateConnectorResponse {
    @inline
    def apply(
        connectorArn: js.UndefOr[__string] = js.undefined,
        connectorName: js.UndefOr[__string] = js.undefined,
        connectorState: js.UndefOr[ConnectorState] = js.undefined
    ): CreateConnectorResponse = {
      val __obj = js.Dynamic.literal()
      connectorArn.foreach(__v => __obj.updateDynamic("connectorArn")(__v.asInstanceOf[js.Any]))
      connectorName.foreach(__v => __obj.updateDynamic("connectorName")(__v.asInstanceOf[js.Any]))
      connectorState.foreach(__v => __obj.updateDynamic("connectorState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorResponse]
    }
  }

  @js.native
  trait CreateCustomPluginRequest extends js.Object {
    var contentType: CustomPluginContentType
    var location: CustomPluginLocation
    var name: __stringMin1Max128
    var description: js.UndefOr[__stringMax1024]
  }

  object CreateCustomPluginRequest {
    @inline
    def apply(
        contentType: CustomPluginContentType,
        location: CustomPluginLocation,
        name: __stringMin1Max128,
        description: js.UndefOr[__stringMax1024] = js.undefined
    ): CreateCustomPluginRequest = {
      val __obj = js.Dynamic.literal(
        "contentType" -> contentType.asInstanceOf[js.Any],
        "location" -> location.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomPluginRequest]
    }
  }

  @js.native
  trait CreateCustomPluginResponse extends js.Object {
    var customPluginArn: js.UndefOr[__string]
    var customPluginState: js.UndefOr[CustomPluginState]
    var name: js.UndefOr[__string]
    var revision: js.UndefOr[__long]
  }

  object CreateCustomPluginResponse {
    @inline
    def apply(
        customPluginArn: js.UndefOr[__string] = js.undefined,
        customPluginState: js.UndefOr[CustomPluginState] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        revision: js.UndefOr[__long] = js.undefined
    ): CreateCustomPluginResponse = {
      val __obj = js.Dynamic.literal()
      customPluginArn.foreach(__v => __obj.updateDynamic("customPluginArn")(__v.asInstanceOf[js.Any]))
      customPluginState.foreach(__v => __obj.updateDynamic("customPluginState")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomPluginResponse]
    }
  }

  @js.native
  trait CreateWorkerConfigurationRequest extends js.Object {
    var name: __stringMin1Max128
    var propertiesFileContent: SyntheticCreateWorkerConfigurationRequest__string
    var description: js.UndefOr[__stringMax1024]
  }

  object CreateWorkerConfigurationRequest {
    @inline
    def apply(
        name: __stringMin1Max128,
        propertiesFileContent: SyntheticCreateWorkerConfigurationRequest__string,
        description: js.UndefOr[__stringMax1024] = js.undefined
    ): CreateWorkerConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "propertiesFileContent" -> propertiesFileContent.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkerConfigurationRequest]
    }
  }

  @js.native
  trait CreateWorkerConfigurationResponse extends js.Object {
    var creationTime: js.UndefOr[__timestampIso8601]
    var latestRevision: js.UndefOr[WorkerConfigurationRevisionSummary]
    var name: js.UndefOr[__string]
    var workerConfigurationArn: js.UndefOr[__string]
  }

  object CreateWorkerConfigurationResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        latestRevision: js.UndefOr[WorkerConfigurationRevisionSummary] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        workerConfigurationArn: js.UndefOr[__string] = js.undefined
    ): CreateWorkerConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      latestRevision.foreach(__v => __obj.updateDynamic("latestRevision")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      workerConfigurationArn.foreach(__v => __obj.updateDynamic("workerConfigurationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkerConfigurationResponse]
    }
  }

  /** A plugin is an AWS resource that contains the code that defines a connector's logic.
    */
  @js.native
  trait CustomPlugin extends js.Object {
    var customPluginArn: __string
    var revision: __longMin1
  }

  object CustomPlugin {
    @inline
    def apply(
        customPluginArn: __string,
        revision: __longMin1
    ): CustomPlugin = {
      val __obj = js.Dynamic.literal(
        "customPluginArn" -> customPluginArn.asInstanceOf[js.Any],
        "revision" -> revision.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomPlugin]
    }
  }

  /** Details about a custom plugin.
    */
  @js.native
  trait CustomPluginDescription extends js.Object {
    var customPluginArn: js.UndefOr[__string]
    var revision: js.UndefOr[__long]
  }

  object CustomPluginDescription {
    @inline
    def apply(
        customPluginArn: js.UndefOr[__string] = js.undefined,
        revision: js.UndefOr[__long] = js.undefined
    ): CustomPluginDescription = {
      val __obj = js.Dynamic.literal()
      customPluginArn.foreach(__v => __obj.updateDynamic("customPluginArn")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomPluginDescription]
    }
  }

  /** Details about a custom plugin file.
    */
  @js.native
  trait CustomPluginFileDescription extends js.Object {
    var fileMd5: js.UndefOr[__string]
    var fileSize: js.UndefOr[__long]
  }

  object CustomPluginFileDescription {
    @inline
    def apply(
        fileMd5: js.UndefOr[__string] = js.undefined,
        fileSize: js.UndefOr[__long] = js.undefined
    ): CustomPluginFileDescription = {
      val __obj = js.Dynamic.literal()
      fileMd5.foreach(__v => __obj.updateDynamic("fileMd5")(__v.asInstanceOf[js.Any]))
      fileSize.foreach(__v => __obj.updateDynamic("fileSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomPluginFileDescription]
    }
  }

  /** Information about the location of a custom plugin.
    */
  @js.native
  trait CustomPluginLocation extends js.Object {
    var s3Location: S3Location
  }

  object CustomPluginLocation {
    @inline
    def apply(
        s3Location: S3Location
    ): CustomPluginLocation = {
      val __obj = js.Dynamic.literal(
        "s3Location" -> s3Location.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomPluginLocation]
    }
  }

  /** Information about the location of a custom plugin.
    */
  @js.native
  trait CustomPluginLocationDescription extends js.Object {
    var s3Location: js.UndefOr[S3LocationDescription]
  }

  object CustomPluginLocationDescription {
    @inline
    def apply(
        s3Location: js.UndefOr[S3LocationDescription] = js.undefined
    ): CustomPluginLocationDescription = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomPluginLocationDescription]
    }
  }

  /** Details about the revision of a custom plugin.
    */
  @js.native
  trait CustomPluginRevisionSummary extends js.Object {
    var contentType: js.UndefOr[CustomPluginContentType]
    var creationTime: js.UndefOr[__timestampIso8601]
    var description: js.UndefOr[__string]
    var fileDescription: js.UndefOr[CustomPluginFileDescription]
    var location: js.UndefOr[CustomPluginLocationDescription]
    var revision: js.UndefOr[__long]
  }

  object CustomPluginRevisionSummary {
    @inline
    def apply(
        contentType: js.UndefOr[CustomPluginContentType] = js.undefined,
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        fileDescription: js.UndefOr[CustomPluginFileDescription] = js.undefined,
        location: js.UndefOr[CustomPluginLocationDescription] = js.undefined,
        revision: js.UndefOr[__long] = js.undefined
    ): CustomPluginRevisionSummary = {
      val __obj = js.Dynamic.literal()
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      fileDescription.foreach(__v => __obj.updateDynamic("fileDescription")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomPluginRevisionSummary]
    }
  }

  /** A summary of the custom plugin.
    */
  @js.native
  trait CustomPluginSummary extends js.Object {
    var creationTime: js.UndefOr[__timestampIso8601]
    var customPluginArn: js.UndefOr[__string]
    var customPluginState: js.UndefOr[CustomPluginState]
    var description: js.UndefOr[__string]
    var latestRevision: js.UndefOr[CustomPluginRevisionSummary]
    var name: js.UndefOr[__string]
  }

  object CustomPluginSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        customPluginArn: js.UndefOr[__string] = js.undefined,
        customPluginState: js.UndefOr[CustomPluginState] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        latestRevision: js.UndefOr[CustomPluginRevisionSummary] = js.undefined,
        name: js.UndefOr[__string] = js.undefined
    ): CustomPluginSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      customPluginArn.foreach(__v => __obj.updateDynamic("customPluginArn")(__v.asInstanceOf[js.Any]))
      customPluginState.foreach(__v => __obj.updateDynamic("customPluginState")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      latestRevision.foreach(__v => __obj.updateDynamic("latestRevision")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomPluginSummary]
    }
  }

  @js.native
  trait DeleteConnectorRequest extends js.Object {
    var connectorArn: __string
    var currentVersion: js.UndefOr[__string]
  }

  object DeleteConnectorRequest {
    @inline
    def apply(
        connectorArn: __string,
        currentVersion: js.UndefOr[__string] = js.undefined
    ): DeleteConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "connectorArn" -> connectorArn.asInstanceOf[js.Any]
      )

      currentVersion.foreach(__v => __obj.updateDynamic("currentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectorRequest]
    }
  }

  @js.native
  trait DeleteConnectorResponse extends js.Object {
    var connectorArn: js.UndefOr[__string]
    var connectorState: js.UndefOr[ConnectorState]
  }

  object DeleteConnectorResponse {
    @inline
    def apply(
        connectorArn: js.UndefOr[__string] = js.undefined,
        connectorState: js.UndefOr[ConnectorState] = js.undefined
    ): DeleteConnectorResponse = {
      val __obj = js.Dynamic.literal()
      connectorArn.foreach(__v => __obj.updateDynamic("connectorArn")(__v.asInstanceOf[js.Any]))
      connectorState.foreach(__v => __obj.updateDynamic("connectorState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectorResponse]
    }
  }

  @js.native
  trait DeleteCustomPluginRequest extends js.Object {
    var customPluginArn: __string
  }

  object DeleteCustomPluginRequest {
    @inline
    def apply(
        customPluginArn: __string
    ): DeleteCustomPluginRequest = {
      val __obj = js.Dynamic.literal(
        "customPluginArn" -> customPluginArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCustomPluginRequest]
    }
  }

  @js.native
  trait DeleteCustomPluginResponse extends js.Object {
    var customPluginArn: js.UndefOr[__string]
    var customPluginState: js.UndefOr[CustomPluginState]
  }

  object DeleteCustomPluginResponse {
    @inline
    def apply(
        customPluginArn: js.UndefOr[__string] = js.undefined,
        customPluginState: js.UndefOr[CustomPluginState] = js.undefined
    ): DeleteCustomPluginResponse = {
      val __obj = js.Dynamic.literal()
      customPluginArn.foreach(__v => __obj.updateDynamic("customPluginArn")(__v.asInstanceOf[js.Any]))
      customPluginState.foreach(__v => __obj.updateDynamic("customPluginState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCustomPluginResponse]
    }
  }

  @js.native
  trait DescribeConnectorRequest extends js.Object {
    var connectorArn: __string
  }

  object DescribeConnectorRequest {
    @inline
    def apply(
        connectorArn: __string
    ): DescribeConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "connectorArn" -> connectorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConnectorRequest]
    }
  }

  @js.native
  trait DescribeConnectorResponse extends js.Object {
    var capacity: js.UndefOr[CapacityDescription]
    var connectorArn: js.UndefOr[__string]
    var connectorConfiguration: js.UndefOr[SyntheticDescribeConnectorResponse__mapOf__string]
    var connectorDescription: js.UndefOr[__string]
    var connectorName: js.UndefOr[__string]
    var connectorState: js.UndefOr[ConnectorState]
    var creationTime: js.UndefOr[__timestampIso8601]
    var currentVersion: js.UndefOr[__string]
    var kafkaCluster: js.UndefOr[KafkaClusterDescription]
    var kafkaClusterClientAuthentication: js.UndefOr[KafkaClusterClientAuthenticationDescription]
    var kafkaClusterEncryptionInTransit: js.UndefOr[KafkaClusterEncryptionInTransitDescription]
    var kafkaConnectVersion: js.UndefOr[__string]
    var logDelivery: js.UndefOr[LogDeliveryDescription]
    var plugins: js.UndefOr[__listOfPluginDescription]
    var serviceExecutionRoleArn: js.UndefOr[__string]
    var stateDescription: js.UndefOr[StateDescription]
    var workerConfiguration: js.UndefOr[WorkerConfigurationDescription]
  }

  object DescribeConnectorResponse {
    @inline
    def apply(
        capacity: js.UndefOr[CapacityDescription] = js.undefined,
        connectorArn: js.UndefOr[__string] = js.undefined,
        connectorConfiguration: js.UndefOr[SyntheticDescribeConnectorResponse__mapOf__string] = js.undefined,
        connectorDescription: js.UndefOr[__string] = js.undefined,
        connectorName: js.UndefOr[__string] = js.undefined,
        connectorState: js.UndefOr[ConnectorState] = js.undefined,
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        currentVersion: js.UndefOr[__string] = js.undefined,
        kafkaCluster: js.UndefOr[KafkaClusterDescription] = js.undefined,
        kafkaClusterClientAuthentication: js.UndefOr[KafkaClusterClientAuthenticationDescription] = js.undefined,
        kafkaClusterEncryptionInTransit: js.UndefOr[KafkaClusterEncryptionInTransitDescription] = js.undefined,
        kafkaConnectVersion: js.UndefOr[__string] = js.undefined,
        logDelivery: js.UndefOr[LogDeliveryDescription] = js.undefined,
        plugins: js.UndefOr[__listOfPluginDescription] = js.undefined,
        serviceExecutionRoleArn: js.UndefOr[__string] = js.undefined,
        stateDescription: js.UndefOr[StateDescription] = js.undefined,
        workerConfiguration: js.UndefOr[WorkerConfigurationDescription] = js.undefined
    ): DescribeConnectorResponse = {
      val __obj = js.Dynamic.literal()
      capacity.foreach(__v => __obj.updateDynamic("capacity")(__v.asInstanceOf[js.Any]))
      connectorArn.foreach(__v => __obj.updateDynamic("connectorArn")(__v.asInstanceOf[js.Any]))
      connectorConfiguration.foreach(__v => __obj.updateDynamic("connectorConfiguration")(__v.asInstanceOf[js.Any]))
      connectorDescription.foreach(__v => __obj.updateDynamic("connectorDescription")(__v.asInstanceOf[js.Any]))
      connectorName.foreach(__v => __obj.updateDynamic("connectorName")(__v.asInstanceOf[js.Any]))
      connectorState.foreach(__v => __obj.updateDynamic("connectorState")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      currentVersion.foreach(__v => __obj.updateDynamic("currentVersion")(__v.asInstanceOf[js.Any]))
      kafkaCluster.foreach(__v => __obj.updateDynamic("kafkaCluster")(__v.asInstanceOf[js.Any]))
      kafkaClusterClientAuthentication.foreach(__v => __obj.updateDynamic("kafkaClusterClientAuthentication")(__v.asInstanceOf[js.Any]))
      kafkaClusterEncryptionInTransit.foreach(__v => __obj.updateDynamic("kafkaClusterEncryptionInTransit")(__v.asInstanceOf[js.Any]))
      kafkaConnectVersion.foreach(__v => __obj.updateDynamic("kafkaConnectVersion")(__v.asInstanceOf[js.Any]))
      logDelivery.foreach(__v => __obj.updateDynamic("logDelivery")(__v.asInstanceOf[js.Any]))
      plugins.foreach(__v => __obj.updateDynamic("plugins")(__v.asInstanceOf[js.Any]))
      serviceExecutionRoleArn.foreach(__v => __obj.updateDynamic("serviceExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      stateDescription.foreach(__v => __obj.updateDynamic("stateDescription")(__v.asInstanceOf[js.Any]))
      workerConfiguration.foreach(__v => __obj.updateDynamic("workerConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectorResponse]
    }
  }

  @js.native
  trait DescribeCustomPluginRequest extends js.Object {
    var customPluginArn: __string
  }

  object DescribeCustomPluginRequest {
    @inline
    def apply(
        customPluginArn: __string
    ): DescribeCustomPluginRequest = {
      val __obj = js.Dynamic.literal(
        "customPluginArn" -> customPluginArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCustomPluginRequest]
    }
  }

  @js.native
  trait DescribeCustomPluginResponse extends js.Object {
    var creationTime: js.UndefOr[__timestampIso8601]
    var customPluginArn: js.UndefOr[__string]
    var customPluginState: js.UndefOr[CustomPluginState]
    var description: js.UndefOr[__string]
    var latestRevision: js.UndefOr[CustomPluginRevisionSummary]
    var name: js.UndefOr[__string]
    var stateDescription: js.UndefOr[StateDescription]
  }

  object DescribeCustomPluginResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        customPluginArn: js.UndefOr[__string] = js.undefined,
        customPluginState: js.UndefOr[CustomPluginState] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        latestRevision: js.UndefOr[CustomPluginRevisionSummary] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        stateDescription: js.UndefOr[StateDescription] = js.undefined
    ): DescribeCustomPluginResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      customPluginArn.foreach(__v => __obj.updateDynamic("customPluginArn")(__v.asInstanceOf[js.Any]))
      customPluginState.foreach(__v => __obj.updateDynamic("customPluginState")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      latestRevision.foreach(__v => __obj.updateDynamic("latestRevision")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      stateDescription.foreach(__v => __obj.updateDynamic("stateDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCustomPluginResponse]
    }
  }

  @js.native
  trait DescribeWorkerConfigurationRequest extends js.Object {
    var workerConfigurationArn: __string
  }

  object DescribeWorkerConfigurationRequest {
    @inline
    def apply(
        workerConfigurationArn: __string
    ): DescribeWorkerConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "workerConfigurationArn" -> workerConfigurationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkerConfigurationRequest]
    }
  }

  @js.native
  trait DescribeWorkerConfigurationResponse extends js.Object {
    var creationTime: js.UndefOr[__timestampIso8601]
    var description: js.UndefOr[__string]
    var latestRevision: js.UndefOr[WorkerConfigurationRevisionDescription]
    var name: js.UndefOr[__string]
    var workerConfigurationArn: js.UndefOr[__string]
  }

  object DescribeWorkerConfigurationResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        latestRevision: js.UndefOr[WorkerConfigurationRevisionDescription] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        workerConfigurationArn: js.UndefOr[__string] = js.undefined
    ): DescribeWorkerConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      latestRevision.foreach(__v => __obj.updateDynamic("latestRevision")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      workerConfigurationArn.foreach(__v => __obj.updateDynamic("workerConfigurationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkerConfigurationResponse]
    }
  }

  /** The settings for delivering logs to Amazon Kinesis Data Firehose.
    */
  @js.native
  trait FirehoseLogDelivery extends js.Object {
    var enabled: __boolean
    var deliveryStream: js.UndefOr[__string]
  }

  object FirehoseLogDelivery {
    @inline
    def apply(
        enabled: __boolean,
        deliveryStream: js.UndefOr[__string] = js.undefined
    ): FirehoseLogDelivery = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )

      deliveryStream.foreach(__v => __obj.updateDynamic("deliveryStream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirehoseLogDelivery]
    }
  }

  /** A description of the settings for delivering logs to Amazon Kinesis Data Firehose.
    */
  @js.native
  trait FirehoseLogDeliveryDescription extends js.Object {
    var deliveryStream: js.UndefOr[__string]
    var enabled: js.UndefOr[__boolean]
  }

  object FirehoseLogDeliveryDescription {
    @inline
    def apply(
        deliveryStream: js.UndefOr[__string] = js.undefined,
        enabled: js.UndefOr[__boolean] = js.undefined
    ): FirehoseLogDeliveryDescription = {
      val __obj = js.Dynamic.literal()
      deliveryStream.foreach(__v => __obj.updateDynamic("deliveryStream")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirehoseLogDeliveryDescription]
    }
  }

  /** The details of the Apache Kafka cluster to which the connector is connected.
    */
  @js.native
  trait KafkaCluster extends js.Object {
    var apacheKafkaCluster: ApacheKafkaCluster
  }

  object KafkaCluster {
    @inline
    def apply(
        apacheKafkaCluster: ApacheKafkaCluster
    ): KafkaCluster = {
      val __obj = js.Dynamic.literal(
        "apacheKafkaCluster" -> apacheKafkaCluster.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KafkaCluster]
    }
  }

  /** The client authentication information used in order to authenticate with the Apache Kafka cluster.
    */
  @js.native
  trait KafkaClusterClientAuthentication extends js.Object {
    var authenticationType: KafkaClusterClientAuthenticationType
  }

  object KafkaClusterClientAuthentication {
    @inline
    def apply(
        authenticationType: KafkaClusterClientAuthenticationType
    ): KafkaClusterClientAuthentication = {
      val __obj = js.Dynamic.literal(
        "authenticationType" -> authenticationType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KafkaClusterClientAuthentication]
    }
  }

  /** The client authentication information used in order to authenticate with the Apache Kafka cluster.
    */
  @js.native
  trait KafkaClusterClientAuthenticationDescription extends js.Object {
    var authenticationType: js.UndefOr[KafkaClusterClientAuthenticationType]
  }

  object KafkaClusterClientAuthenticationDescription {
    @inline
    def apply(
        authenticationType: js.UndefOr[KafkaClusterClientAuthenticationType] = js.undefined
    ): KafkaClusterClientAuthenticationDescription = {
      val __obj = js.Dynamic.literal()
      authenticationType.foreach(__v => __obj.updateDynamic("authenticationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KafkaClusterClientAuthenticationDescription]
    }
  }

  /** Details of how to connect to the Apache Kafka cluster.
    */
  @js.native
  trait KafkaClusterDescription extends js.Object {
    var apacheKafkaCluster: js.UndefOr[ApacheKafkaClusterDescription]
  }

  object KafkaClusterDescription {
    @inline
    def apply(
        apacheKafkaCluster: js.UndefOr[ApacheKafkaClusterDescription] = js.undefined
    ): KafkaClusterDescription = {
      val __obj = js.Dynamic.literal()
      apacheKafkaCluster.foreach(__v => __obj.updateDynamic("apacheKafkaCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KafkaClusterDescription]
    }
  }

  /** Details of encryption in transit to the Apache Kafka cluster.
    */
  @js.native
  trait KafkaClusterEncryptionInTransit extends js.Object {
    var encryptionType: KafkaClusterEncryptionInTransitType
  }

  object KafkaClusterEncryptionInTransit {
    @inline
    def apply(
        encryptionType: KafkaClusterEncryptionInTransitType
    ): KafkaClusterEncryptionInTransit = {
      val __obj = js.Dynamic.literal(
        "encryptionType" -> encryptionType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KafkaClusterEncryptionInTransit]
    }
  }

  /** The description of the encryption in transit to the Apache Kafka cluster.
    */
  @js.native
  trait KafkaClusterEncryptionInTransitDescription extends js.Object {
    var encryptionType: js.UndefOr[KafkaClusterEncryptionInTransitType]
  }

  object KafkaClusterEncryptionInTransitDescription {
    @inline
    def apply(
        encryptionType: js.UndefOr[KafkaClusterEncryptionInTransitType] = js.undefined
    ): KafkaClusterEncryptionInTransitDescription = {
      val __obj = js.Dynamic.literal()
      encryptionType.foreach(__v => __obj.updateDynamic("encryptionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KafkaClusterEncryptionInTransitDescription]
    }
  }

  @js.native
  trait ListConnectorsRequest extends js.Object {
    var connectorNamePrefix: js.UndefOr[__string]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[__string]
  }

  object ListConnectorsRequest {
    @inline
    def apply(
        connectorNamePrefix: js.UndefOr[__string] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListConnectorsRequest = {
      val __obj = js.Dynamic.literal()
      connectorNamePrefix.foreach(__v => __obj.updateDynamic("connectorNamePrefix")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorsRequest]
    }
  }

  @js.native
  trait ListConnectorsResponse extends js.Object {
    var connectors: js.UndefOr[__listOfConnectorSummary]
    var nextToken: js.UndefOr[__string]
  }

  object ListConnectorsResponse {
    @inline
    def apply(
        connectors: js.UndefOr[__listOfConnectorSummary] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListConnectorsResponse = {
      val __obj = js.Dynamic.literal()
      connectors.foreach(__v => __obj.updateDynamic("connectors")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorsResponse]
    }
  }

  @js.native
  trait ListCustomPluginsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[__string]
  }

  object ListCustomPluginsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListCustomPluginsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomPluginsRequest]
    }
  }

  @js.native
  trait ListCustomPluginsResponse extends js.Object {
    var customPlugins: js.UndefOr[__listOfCustomPluginSummary]
    var nextToken: js.UndefOr[__string]
  }

  object ListCustomPluginsResponse {
    @inline
    def apply(
        customPlugins: js.UndefOr[__listOfCustomPluginSummary] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListCustomPluginsResponse = {
      val __obj = js.Dynamic.literal()
      customPlugins.foreach(__v => __obj.updateDynamic("customPlugins")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomPluginsResponse]
    }
  }

  @js.native
  trait ListWorkerConfigurationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[__string]
  }

  object ListWorkerConfigurationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListWorkerConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkerConfigurationsRequest]
    }
  }

  @js.native
  trait ListWorkerConfigurationsResponse extends js.Object {
    var nextToken: js.UndefOr[__string]
    var workerConfigurations: js.UndefOr[__listOfWorkerConfigurationSummary]
  }

  object ListWorkerConfigurationsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[__string] = js.undefined,
        workerConfigurations: js.UndefOr[__listOfWorkerConfigurationSummary] = js.undefined
    ): ListWorkerConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      workerConfigurations.foreach(__v => __obj.updateDynamic("workerConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkerConfigurationsResponse]
    }
  }

  /** Details about log delivery.
    */
  @js.native
  trait LogDelivery extends js.Object {
    var workerLogDelivery: WorkerLogDelivery
  }

  object LogDelivery {
    @inline
    def apply(
        workerLogDelivery: WorkerLogDelivery
    ): LogDelivery = {
      val __obj = js.Dynamic.literal(
        "workerLogDelivery" -> workerLogDelivery.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LogDelivery]
    }
  }

  /** The description of the log delivery settings.
    */
  @js.native
  trait LogDeliveryDescription extends js.Object {
    var workerLogDelivery: js.UndefOr[WorkerLogDeliveryDescription]
  }

  object LogDeliveryDescription {
    @inline
    def apply(
        workerLogDelivery: js.UndefOr[WorkerLogDeliveryDescription] = js.undefined
    ): LogDeliveryDescription = {
      val __obj = js.Dynamic.literal()
      workerLogDelivery.foreach(__v => __obj.updateDynamic("workerLogDelivery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogDeliveryDescription]
    }
  }

  /** A plugin is an AWS resource that contains the code that defines your connector logic.
    */
  @js.native
  trait Plugin extends js.Object {
    var customPlugin: CustomPlugin
  }

  object Plugin {
    @inline
    def apply(
        customPlugin: CustomPlugin
    ): Plugin = {
      val __obj = js.Dynamic.literal(
        "customPlugin" -> customPlugin.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Plugin]
    }
  }

  /** The description of the plugin.
    */
  @js.native
  trait PluginDescription extends js.Object {
    var customPlugin: js.UndefOr[CustomPluginDescription]
  }

  object PluginDescription {
    @inline
    def apply(
        customPlugin: js.UndefOr[CustomPluginDescription] = js.undefined
    ): PluginDescription = {
      val __obj = js.Dynamic.literal()
      customPlugin.foreach(__v => __obj.updateDynamic("customPlugin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PluginDescription]
    }
  }

  /** Details about a connector's provisioned capacity.
    */
  @js.native
  trait ProvisionedCapacity extends js.Object {
    var mcuCount: __integerMin1Max8
    var workerCount: __integerMin1Max10
  }

  object ProvisionedCapacity {
    @inline
    def apply(
        mcuCount: __integerMin1Max8,
        workerCount: __integerMin1Max10
    ): ProvisionedCapacity = {
      val __obj = js.Dynamic.literal(
        "mcuCount" -> mcuCount.asInstanceOf[js.Any],
        "workerCount" -> workerCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProvisionedCapacity]
    }
  }

  /** The description of a connector's provisioned capacity.
    */
  @js.native
  trait ProvisionedCapacityDescription extends js.Object {
    var mcuCount: js.UndefOr[__integer]
    var workerCount: js.UndefOr[__integer]
  }

  object ProvisionedCapacityDescription {
    @inline
    def apply(
        mcuCount: js.UndefOr[__integer] = js.undefined,
        workerCount: js.UndefOr[__integer] = js.undefined
    ): ProvisionedCapacityDescription = {
      val __obj = js.Dynamic.literal()
      mcuCount.foreach(__v => __obj.updateDynamic("mcuCount")(__v.asInstanceOf[js.Any]))
      workerCount.foreach(__v => __obj.updateDynamic("workerCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedCapacityDescription]
    }
  }

  /** An update to a connector's fixed capacity.
    */
  @js.native
  trait ProvisionedCapacityUpdate extends js.Object {
    var mcuCount: __integerMin1Max8
    var workerCount: __integerMin1Max10
  }

  object ProvisionedCapacityUpdate {
    @inline
    def apply(
        mcuCount: __integerMin1Max8,
        workerCount: __integerMin1Max10
    ): ProvisionedCapacityUpdate = {
      val __obj = js.Dynamic.literal(
        "mcuCount" -> mcuCount.asInstanceOf[js.Any],
        "workerCount" -> workerCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProvisionedCapacityUpdate]
    }
  }

  /** The location of an object in Amazon S3.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucketArn: __string
    var fileKey: __string
    var objectVersion: js.UndefOr[__string]
  }

  object S3Location {
    @inline
    def apply(
        bucketArn: __string,
        fileKey: __string,
        objectVersion: js.UndefOr[__string] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal(
        "bucketArn" -> bucketArn.asInstanceOf[js.Any],
        "fileKey" -> fileKey.asInstanceOf[js.Any]
      )

      objectVersion.foreach(__v => __obj.updateDynamic("objectVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /** The description of the location of an object in Amazon S3.
    */
  @js.native
  trait S3LocationDescription extends js.Object {
    var bucketArn: js.UndefOr[__string]
    var fileKey: js.UndefOr[__string]
    var objectVersion: js.UndefOr[__string]
  }

  object S3LocationDescription {
    @inline
    def apply(
        bucketArn: js.UndefOr[__string] = js.undefined,
        fileKey: js.UndefOr[__string] = js.undefined,
        objectVersion: js.UndefOr[__string] = js.undefined
    ): S3LocationDescription = {
      val __obj = js.Dynamic.literal()
      bucketArn.foreach(__v => __obj.updateDynamic("bucketArn")(__v.asInstanceOf[js.Any]))
      fileKey.foreach(__v => __obj.updateDynamic("fileKey")(__v.asInstanceOf[js.Any]))
      objectVersion.foreach(__v => __obj.updateDynamic("objectVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3LocationDescription]
    }
  }

  /** Details about delivering logs to Amazon S3.
    */
  @js.native
  trait S3LogDelivery extends js.Object {
    var enabled: __boolean
    var bucket: js.UndefOr[__string]
    var prefix: js.UndefOr[__string]
  }

  object S3LogDelivery {
    @inline
    def apply(
        enabled: __boolean,
        bucket: js.UndefOr[__string] = js.undefined,
        prefix: js.UndefOr[__string] = js.undefined
    ): S3LogDelivery = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )

      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3LogDelivery]
    }
  }

  /** The description of the details about delivering logs to Amazon S3.
    */
  @js.native
  trait S3LogDeliveryDescription extends js.Object {
    var bucket: js.UndefOr[__string]
    var enabled: js.UndefOr[__boolean]
    var prefix: js.UndefOr[__string]
  }

  object S3LogDeliveryDescription {
    @inline
    def apply(
        bucket: js.UndefOr[__string] = js.undefined,
        enabled: js.UndefOr[__boolean] = js.undefined,
        prefix: js.UndefOr[__string] = js.undefined
    ): S3LogDeliveryDescription = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3LogDeliveryDescription]
    }
  }

  /** The scale-in policy for the connector.
    */
  @js.native
  trait ScaleInPolicy extends js.Object {
    var cpuUtilizationPercentage: __integerMin1Max100
  }

  object ScaleInPolicy {
    @inline
    def apply(
        cpuUtilizationPercentage: __integerMin1Max100
    ): ScaleInPolicy = {
      val __obj = js.Dynamic.literal(
        "cpuUtilizationPercentage" -> cpuUtilizationPercentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScaleInPolicy]
    }
  }

  /** The description of the scale-in policy for the connector.
    */
  @js.native
  trait ScaleInPolicyDescription extends js.Object {
    var cpuUtilizationPercentage: js.UndefOr[__integer]
  }

  object ScaleInPolicyDescription {
    @inline
    def apply(
        cpuUtilizationPercentage: js.UndefOr[__integer] = js.undefined
    ): ScaleInPolicyDescription = {
      val __obj = js.Dynamic.literal()
      cpuUtilizationPercentage.foreach(__v => __obj.updateDynamic("cpuUtilizationPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScaleInPolicyDescription]
    }
  }

  /** An update to the connector's scale-in policy.
    */
  @js.native
  trait ScaleInPolicyUpdate extends js.Object {
    var cpuUtilizationPercentage: __integerMin1Max100
  }

  object ScaleInPolicyUpdate {
    @inline
    def apply(
        cpuUtilizationPercentage: __integerMin1Max100
    ): ScaleInPolicyUpdate = {
      val __obj = js.Dynamic.literal(
        "cpuUtilizationPercentage" -> cpuUtilizationPercentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScaleInPolicyUpdate]
    }
  }

  /** The scale-out policy for the connector.
    */
  @js.native
  trait ScaleOutPolicy extends js.Object {
    var cpuUtilizationPercentage: __integerMin1Max100
  }

  object ScaleOutPolicy {
    @inline
    def apply(
        cpuUtilizationPercentage: __integerMin1Max100
    ): ScaleOutPolicy = {
      val __obj = js.Dynamic.literal(
        "cpuUtilizationPercentage" -> cpuUtilizationPercentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScaleOutPolicy]
    }
  }

  /** The description of the scale-out policy for the connector.
    */
  @js.native
  trait ScaleOutPolicyDescription extends js.Object {
    var cpuUtilizationPercentage: js.UndefOr[__integer]
  }

  object ScaleOutPolicyDescription {
    @inline
    def apply(
        cpuUtilizationPercentage: js.UndefOr[__integer] = js.undefined
    ): ScaleOutPolicyDescription = {
      val __obj = js.Dynamic.literal()
      cpuUtilizationPercentage.foreach(__v => __obj.updateDynamic("cpuUtilizationPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScaleOutPolicyDescription]
    }
  }

  /** An update to the connector's scale-out policy.
    */
  @js.native
  trait ScaleOutPolicyUpdate extends js.Object {
    var cpuUtilizationPercentage: __integerMin1Max100
  }

  object ScaleOutPolicyUpdate {
    @inline
    def apply(
        cpuUtilizationPercentage: __integerMin1Max100
    ): ScaleOutPolicyUpdate = {
      val __obj = js.Dynamic.literal(
        "cpuUtilizationPercentage" -> cpuUtilizationPercentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScaleOutPolicyUpdate]
    }
  }

  /** Details about the state of a resource.
    */
  @js.native
  trait StateDescription extends js.Object {
    var code: js.UndefOr[__string]
    var message: js.UndefOr[__string]
  }

  object StateDescription {
    @inline
    def apply(
        code: js.UndefOr[__string] = js.undefined,
        message: js.UndefOr[__string] = js.undefined
    ): StateDescription = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StateDescription]
    }
  }

  @js.native
  trait UpdateConnectorRequest extends js.Object {
    var capacity: CapacityUpdate
    var connectorArn: __string
    var currentVersion: __string
  }

  object UpdateConnectorRequest {
    @inline
    def apply(
        capacity: CapacityUpdate,
        connectorArn: __string,
        currentVersion: __string
    ): UpdateConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "capacity" -> capacity.asInstanceOf[js.Any],
        "connectorArn" -> connectorArn.asInstanceOf[js.Any],
        "currentVersion" -> currentVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateConnectorRequest]
    }
  }

  @js.native
  trait UpdateConnectorResponse extends js.Object {
    var connectorArn: js.UndefOr[__string]
    var connectorState: js.UndefOr[ConnectorState]
  }

  object UpdateConnectorResponse {
    @inline
    def apply(
        connectorArn: js.UndefOr[__string] = js.undefined,
        connectorState: js.UndefOr[ConnectorState] = js.undefined
    ): UpdateConnectorResponse = {
      val __obj = js.Dynamic.literal()
      connectorArn.foreach(__v => __obj.updateDynamic("connectorArn")(__v.asInstanceOf[js.Any]))
      connectorState.foreach(__v => __obj.updateDynamic("connectorState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectorResponse]
    }
  }

  /** Information about the VPC in which the connector resides.
    */
  @js.native
  trait Vpc extends js.Object {
    var subnets: __listOf__string
    var securityGroups: js.UndefOr[__listOf__string]
  }

  object Vpc {
    @inline
    def apply(
        subnets: __listOf__string,
        securityGroups: js.UndefOr[__listOf__string] = js.undefined
    ): Vpc = {
      val __obj = js.Dynamic.literal(
        "subnets" -> subnets.asInstanceOf[js.Any]
      )

      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Vpc]
    }
  }

  /** The description of the VPC in which the connector resides.
    */
  @js.native
  trait VpcDescription extends js.Object {
    var securityGroups: js.UndefOr[__listOf__string]
    var subnets: js.UndefOr[__listOf__string]
  }

  object VpcDescription {
    @inline
    def apply(
        securityGroups: js.UndefOr[__listOf__string] = js.undefined,
        subnets: js.UndefOr[__listOf__string] = js.undefined
    ): VpcDescription = {
      val __obj = js.Dynamic.literal()
      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      subnets.foreach(__v => __obj.updateDynamic("subnets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcDescription]
    }
  }

  /** The configuration of the workers, which are the processes that run the connector logic.
    */
  @js.native
  trait WorkerConfiguration extends js.Object {
    var revision: __longMin1
    var workerConfigurationArn: __string
  }

  object WorkerConfiguration {
    @inline
    def apply(
        revision: __longMin1,
        workerConfigurationArn: __string
    ): WorkerConfiguration = {
      val __obj = js.Dynamic.literal(
        "revision" -> revision.asInstanceOf[js.Any],
        "workerConfigurationArn" -> workerConfigurationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WorkerConfiguration]
    }
  }

  /** The description of the worker configuration.
    */
  @js.native
  trait WorkerConfigurationDescription extends js.Object {
    var revision: js.UndefOr[__long]
    var workerConfigurationArn: js.UndefOr[__string]
  }

  object WorkerConfigurationDescription {
    @inline
    def apply(
        revision: js.UndefOr[__long] = js.undefined,
        workerConfigurationArn: js.UndefOr[__string] = js.undefined
    ): WorkerConfigurationDescription = {
      val __obj = js.Dynamic.literal()
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      workerConfigurationArn.foreach(__v => __obj.updateDynamic("workerConfigurationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerConfigurationDescription]
    }
  }

  /** The description of the worker configuration revision.
    */
  @js.native
  trait WorkerConfigurationRevisionDescription extends js.Object {
    var creationTime: js.UndefOr[__timestampIso8601]
    var description: js.UndefOr[__string]
    var propertiesFileContent: js.UndefOr[SyntheticWorkerConfigurationRevisionDescription__string]
    var revision: js.UndefOr[__long]
  }

  object WorkerConfigurationRevisionDescription {
    @inline
    def apply(
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        propertiesFileContent: js.UndefOr[SyntheticWorkerConfigurationRevisionDescription__string] = js.undefined,
        revision: js.UndefOr[__long] = js.undefined
    ): WorkerConfigurationRevisionDescription = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      propertiesFileContent.foreach(__v => __obj.updateDynamic("propertiesFileContent")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerConfigurationRevisionDescription]
    }
  }

  /** The summary of a worker configuration revision.
    */
  @js.native
  trait WorkerConfigurationRevisionSummary extends js.Object {
    var creationTime: js.UndefOr[__timestampIso8601]
    var description: js.UndefOr[__string]
    var revision: js.UndefOr[__long]
  }

  object WorkerConfigurationRevisionSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        revision: js.UndefOr[__long] = js.undefined
    ): WorkerConfigurationRevisionSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerConfigurationRevisionSummary]
    }
  }

  /** The summary of a worker configuration.
    */
  @js.native
  trait WorkerConfigurationSummary extends js.Object {
    var creationTime: js.UndefOr[__timestampIso8601]
    var description: js.UndefOr[__string]
    var latestRevision: js.UndefOr[WorkerConfigurationRevisionSummary]
    var name: js.UndefOr[__string]
    var workerConfigurationArn: js.UndefOr[__string]
  }

  object WorkerConfigurationSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[__timestampIso8601] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        latestRevision: js.UndefOr[WorkerConfigurationRevisionSummary] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        workerConfigurationArn: js.UndefOr[__string] = js.undefined
    ): WorkerConfigurationSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      latestRevision.foreach(__v => __obj.updateDynamic("latestRevision")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      workerConfigurationArn.foreach(__v => __obj.updateDynamic("workerConfigurationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerConfigurationSummary]
    }
  }

  /** Workers can send worker logs to different destination types. This configuration specifies the details of these destinations.
    */
  @js.native
  trait WorkerLogDelivery extends js.Object {
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsLogDelivery]
    var firehose: js.UndefOr[FirehoseLogDelivery]
    var s3: js.UndefOr[S3LogDelivery]
  }

  object WorkerLogDelivery {
    @inline
    def apply(
        cloudWatchLogs: js.UndefOr[CloudWatchLogsLogDelivery] = js.undefined,
        firehose: js.UndefOr[FirehoseLogDelivery] = js.undefined,
        s3: js.UndefOr[S3LogDelivery] = js.undefined
    ): WorkerLogDelivery = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogs.foreach(__v => __obj.updateDynamic("cloudWatchLogs")(__v.asInstanceOf[js.Any]))
      firehose.foreach(__v => __obj.updateDynamic("firehose")(__v.asInstanceOf[js.Any]))
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerLogDelivery]
    }
  }

  /** Workers can send worker logs to different destination types. This configuration specifies the details of these destinations.
    */
  @js.native
  trait WorkerLogDeliveryDescription extends js.Object {
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsLogDeliveryDescription]
    var firehose: js.UndefOr[FirehoseLogDeliveryDescription]
    var s3: js.UndefOr[S3LogDeliveryDescription]
  }

  object WorkerLogDeliveryDescription {
    @inline
    def apply(
        cloudWatchLogs: js.UndefOr[CloudWatchLogsLogDeliveryDescription] = js.undefined,
        firehose: js.UndefOr[FirehoseLogDeliveryDescription] = js.undefined,
        s3: js.UndefOr[S3LogDeliveryDescription] = js.undefined
    ): WorkerLogDeliveryDescription = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogs.foreach(__v => __obj.updateDynamic("cloudWatchLogs")(__v.asInstanceOf[js.Any]))
      firehose.foreach(__v => __obj.updateDynamic("firehose")(__v.asInstanceOf[js.Any]))
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerLogDeliveryDescription]
    }
  }
}
