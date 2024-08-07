package facade.amazonaws.services.kafka

import scalajs.js

/** The distribution of broker nodes across Availability Zones. This is an optional parameter. If you don't specify it, Amazon MSK gives it the value DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No other values are currently allowed. Amazon MSK distributes the broker nodes evenly across the Availability Zones that correspond to the subnets you provide when you create the cluster.
  */
@js.native
sealed trait BrokerAZDistribution extends js.Any
object BrokerAZDistribution {
  val DEFAULT = "DEFAULT".asInstanceOf[BrokerAZDistribution]

  @inline def values: js.Array[BrokerAZDistribution] = js.Array(DEFAULT)
}

/** Client-broker encryption in transit setting.
  */
@js.native
sealed trait ClientBroker extends js.Any
object ClientBroker {
  val TLS = "TLS".asInstanceOf[ClientBroker]
  val TLS_PLAINTEXT = "TLS_PLAINTEXT".asInstanceOf[ClientBroker]
  val PLAINTEXT = "PLAINTEXT".asInstanceOf[ClientBroker]

  @inline def values: js.Array[ClientBroker] = js.Array(TLS, TLS_PLAINTEXT, PLAINTEXT)
}

/** The state of the Apache Kafka cluster.
  */
@js.native
sealed trait ClusterState extends js.Any
object ClusterState {
  val ACTIVE = "ACTIVE".asInstanceOf[ClusterState]
  val CREATING = "CREATING".asInstanceOf[ClusterState]
  val DELETING = "DELETING".asInstanceOf[ClusterState]
  val FAILED = "FAILED".asInstanceOf[ClusterState]
  val HEALING = "HEALING".asInstanceOf[ClusterState]
  val MAINTENANCE = "MAINTENANCE".asInstanceOf[ClusterState]
  val REBOOTING_BROKER = "REBOOTING_BROKER".asInstanceOf[ClusterState]
  val UPDATING = "UPDATING".asInstanceOf[ClusterState]

  @inline def values: js.Array[ClusterState] = js.Array(ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE, REBOOTING_BROKER, UPDATING)
}

/** The type of cluster.
  */
@js.native
sealed trait ClusterType extends js.Any
object ClusterType {
  val PROVISIONED = "PROVISIONED".asInstanceOf[ClusterType]
  val SERVERLESS = "SERVERLESS".asInstanceOf[ClusterType]

  @inline def values: js.Array[ClusterType] = js.Array(PROVISIONED, SERVERLESS)
}

/** The state of a configuration.
  */
@js.native
sealed trait ConfigurationState extends js.Any
object ConfigurationState {
  val ACTIVE = "ACTIVE".asInstanceOf[ConfigurationState]
  val DELETING = "DELETING".asInstanceOf[ConfigurationState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ConfigurationState]

  @inline def values: js.Array[ConfigurationState] = js.Array(ACTIVE, DELETING, DELETE_FAILED)
}

/** Specifies which metrics are gathered for the MSK cluster. This property has the following possible values: DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION. For a list of the metrics associated with each of these levels of monitoring, see [[https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html|Monitoring]].
  */
@js.native
sealed trait EnhancedMonitoring extends js.Any
object EnhancedMonitoring {
  val DEFAULT = "DEFAULT".asInstanceOf[EnhancedMonitoring]
  val PER_BROKER = "PER_BROKER".asInstanceOf[EnhancedMonitoring]
  val PER_TOPIC_PER_BROKER = "PER_TOPIC_PER_BROKER".asInstanceOf[EnhancedMonitoring]
  val PER_TOPIC_PER_PARTITION = "PER_TOPIC_PER_PARTITION".asInstanceOf[EnhancedMonitoring]

  @inline def values: js.Array[EnhancedMonitoring] = js.Array(DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, PER_TOPIC_PER_PARTITION)
}

@js.native
sealed trait KafkaVersionStatus extends js.Any
object KafkaVersionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[KafkaVersionStatus]
  val DEPRECATED = "DEPRECATED".asInstanceOf[KafkaVersionStatus]

  @inline def values: js.Array[KafkaVersionStatus] = js.Array(ACTIVE, DEPRECATED)
}

/** The broker or Zookeeper node.
  */
@js.native
sealed trait NodeType extends js.Any
object NodeType {
  val BROKER = "BROKER".asInstanceOf[NodeType]

  @inline def values: js.Array[NodeType] = js.Array(BROKER)
}
