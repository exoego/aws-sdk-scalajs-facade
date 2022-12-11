package facade.amazonaws.services.kafka

import scalajs.js

/** The distribution of broker nodes across Availability Zones. This is an optional parameter. If you don't specify it, Amazon MSK gives it the value DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No other values are currently allowed. Amazon MSK distributes the broker nodes evenly across the Availability Zones that correspond to the subnets you provide when you create the cluster.
  */
type BrokerAZDistribution = "DEFAULT"
object BrokerAZDistribution {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"

  inline def values: js.Array[BrokerAZDistribution] = js.Array(DEFAULT)
}

/** Client-broker encryption in transit setting.
  */
type ClientBroker = "TLS" | "TLS_PLAINTEXT" | "PLAINTEXT"
object ClientBroker {
  inline val TLS: "TLS" = "TLS"
  inline val TLS_PLAINTEXT: "TLS_PLAINTEXT" = "TLS_PLAINTEXT"
  inline val PLAINTEXT: "PLAINTEXT" = "PLAINTEXT"

  inline def values: js.Array[ClientBroker] = js.Array(TLS, TLS_PLAINTEXT, PLAINTEXT)
}

/** The state of the Apache Kafka cluster.
  */
type ClusterState = "ACTIVE" | "CREATING" | "DELETING" | "FAILED" | "HEALING" | "MAINTENANCE" | "REBOOTING_BROKER" | "UPDATING"
object ClusterState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val HEALING: "HEALING" = "HEALING"
  inline val MAINTENANCE: "MAINTENANCE" = "MAINTENANCE"
  inline val REBOOTING_BROKER: "REBOOTING_BROKER" = "REBOOTING_BROKER"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[ClusterState] = js.Array(ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE, REBOOTING_BROKER, UPDATING)
}

/** The type of cluster.
  */
type ClusterType = "PROVISIONED" | "SERVERLESS"
object ClusterType {
  inline val PROVISIONED: "PROVISIONED" = "PROVISIONED"
  inline val SERVERLESS: "SERVERLESS" = "SERVERLESS"

  inline def values: js.Array[ClusterType] = js.Array(PROVISIONED, SERVERLESS)
}

/** The state of a configuration.
  */
type ConfigurationState = "ACTIVE" | "DELETING" | "DELETE_FAILED"
object ConfigurationState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[ConfigurationState] = js.Array(ACTIVE, DELETING, DELETE_FAILED)
}

/** Specifies which metrics are gathered for the MSK cluster. This property has the following possible values: DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION. For a list of the metrics associated with each of these levels of monitoring, see [[https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html|Monitoring]].
  */
type EnhancedMonitoring = "DEFAULT" | "PER_BROKER" | "PER_TOPIC_PER_BROKER" | "PER_TOPIC_PER_PARTITION"
object EnhancedMonitoring {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val PER_BROKER: "PER_BROKER" = "PER_BROKER"
  inline val PER_TOPIC_PER_BROKER: "PER_TOPIC_PER_BROKER" = "PER_TOPIC_PER_BROKER"
  inline val PER_TOPIC_PER_PARTITION: "PER_TOPIC_PER_PARTITION" = "PER_TOPIC_PER_PARTITION"

  inline def values: js.Array[EnhancedMonitoring] = js.Array(DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, PER_TOPIC_PER_PARTITION)
}

type KafkaVersionStatus = "ACTIVE" | "DEPRECATED"
object KafkaVersionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  inline def values: js.Array[KafkaVersionStatus] = js.Array(ACTIVE, DEPRECATED)
}

/** The broker or Zookeeper node.
  */
type NodeType = "BROKER"
object NodeType {
  inline val BROKER: "BROKER" = "BROKER"

  inline def values: js.Array[NodeType] = js.Array(BROKER)
}

/** Controls storage mode for various supported storage tiers.
  */
type StorageMode = "LOCAL" | "TIERED"
object StorageMode {
  inline val LOCAL: "LOCAL" = "LOCAL"
  inline val TIERED: "TIERED" = "TIERED"

  inline def values: js.Array[StorageMode] = js.Array(LOCAL, TIERED)
}
