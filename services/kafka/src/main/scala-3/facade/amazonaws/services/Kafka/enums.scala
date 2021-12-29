package facade.amazonaws.services.kafka

import scalajs._
import scala.scalajs.js.|

/** The distribution of broker nodes across Availability Zones. This is an optional parameter. If you don't specify it, Amazon MSK gives it the value DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No other values are currently allowed. Amazon MSK distributes the broker nodes evenly across the Availability Zones that correspond to the subnets you provide when you create the cluster.
  */
@js.native
sealed trait BrokerAZDistribution extends js.Any
object BrokerAZDistribution {
  val DEFAULT = "DEFAULT".asInstanceOf[BrokerAZDistribution]

  @inline def values = js.Array(DEFAULT)
}

/** Client-broker encryption in transit setting.
  */
@js.native
sealed trait ClientBroker extends js.Any
object ClientBroker {
  val TLS = "TLS".asInstanceOf[ClientBroker]
  val TLS_PLAINTEXT = "TLS_PLAINTEXT".asInstanceOf[ClientBroker]
  val PLAINTEXT = "PLAINTEXT".asInstanceOf[ClientBroker]

  @inline def values = js.Array(TLS, TLS_PLAINTEXT, PLAINTEXT)
}

/** The state of a Kafka cluster.
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

  @inline def values = js.Array(ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE, REBOOTING_BROKER, UPDATING)
}

/** The state of a configuration.
  */
@js.native
sealed trait ConfigurationState extends js.Any
object ConfigurationState {
  val ACTIVE = "ACTIVE".asInstanceOf[ConfigurationState]
  val DELETING = "DELETING".asInstanceOf[ConfigurationState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ConfigurationState]

  @inline def values = js.Array(ACTIVE, DELETING, DELETE_FAILED)
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

  @inline def values = js.Array(DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, PER_TOPIC_PER_PARTITION)
}

@js.native
sealed trait KafkaVersionStatus extends js.Any
object KafkaVersionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[KafkaVersionStatus]
  val DEPRECATED = "DEPRECATED".asInstanceOf[KafkaVersionStatus]

  @inline def values = js.Array(ACTIVE, DEPRECATED)
}

/** The broker or Zookeeper node.
  */
@js.native
sealed trait NodeType extends js.Any
object NodeType {
  val BROKER = "BROKER".asInstanceOf[NodeType]

  @inline def values = js.Array(BROKER)
}
