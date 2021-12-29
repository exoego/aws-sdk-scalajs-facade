package facade.amazonaws.services.kafka

import scalajs._

/** The distribution of broker nodes across Availability Zones. This is an optional parameter. If you don't specify it, Amazon MSK gives it the value DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No other values are currently allowed. Amazon MSK distributes the broker nodes evenly across the Availability Zones that correspond to the subnets you provide when you create the cluster.
  */
type BrokerAZDistribution = "DEFAULT"
object BrokerAZDistribution {
  val DEFAULT: "DEFAULT" = "DEFAULT"

  @inline def values = js.Array[BrokerAZDistribution](DEFAULT)
}

/** Client-broker encryption in transit setting.
  */
type ClientBroker = "TLS" | "TLS_PLAINTEXT" | "PLAINTEXT"
object ClientBroker {
  val TLS: "TLS" = "TLS"
  val TLS_PLAINTEXT: "TLS_PLAINTEXT" = "TLS_PLAINTEXT"
  val PLAINTEXT: "PLAINTEXT" = "PLAINTEXT"

  @inline def values = js.Array[ClientBroker](TLS, TLS_PLAINTEXT, PLAINTEXT)
}

/** The state of a Kafka cluster.
  */
type ClusterState = "ACTIVE" | "CREATING" | "DELETING" | "FAILED" | "HEALING" | "MAINTENANCE" | "REBOOTING_BROKER" | "UPDATING"
object ClusterState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val HEALING: "HEALING" = "HEALING"
  val MAINTENANCE: "MAINTENANCE" = "MAINTENANCE"
  val REBOOTING_BROKER: "REBOOTING_BROKER" = "REBOOTING_BROKER"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[ClusterState](ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE, REBOOTING_BROKER, UPDATING)
}

/** The state of a configuration.
  */
type ConfigurationState = "ACTIVE" | "DELETING" | "DELETE_FAILED"
object ConfigurationState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  @inline def values = js.Array[ConfigurationState](ACTIVE, DELETING, DELETE_FAILED)
}

/** Specifies which metrics are gathered for the MSK cluster. This property has the following possible values: DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION. For a list of the metrics associated with each of these levels of monitoring, see [[https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html|Monitoring]].
  */
type EnhancedMonitoring = "DEFAULT" | "PER_BROKER" | "PER_TOPIC_PER_BROKER" | "PER_TOPIC_PER_PARTITION"
object EnhancedMonitoring {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val PER_BROKER: "PER_BROKER" = "PER_BROKER"
  val PER_TOPIC_PER_BROKER: "PER_TOPIC_PER_BROKER" = "PER_TOPIC_PER_BROKER"
  val PER_TOPIC_PER_PARTITION: "PER_TOPIC_PER_PARTITION" = "PER_TOPIC_PER_PARTITION"

  @inline def values = js.Array[EnhancedMonitoring](DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, PER_TOPIC_PER_PARTITION)
}

type KafkaVersionStatus = "ACTIVE" | "DEPRECATED"
object KafkaVersionStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  @inline def values = js.Array[KafkaVersionStatus](ACTIVE, DEPRECATED)
}

/** The broker or Zookeeper node.
  */
type NodeType = "BROKER"
object NodeType {
  val BROKER: "BROKER" = "BROKER"

  @inline def values = js.Array[NodeType](BROKER)
}
