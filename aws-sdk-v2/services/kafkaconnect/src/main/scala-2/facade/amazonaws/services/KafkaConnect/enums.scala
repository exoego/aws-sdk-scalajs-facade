package facade.amazonaws.services.kafkaconnect

import scalajs.js

@js.native
sealed trait ConnectorState extends js.Any
object ConnectorState {
  val RUNNING = "RUNNING".asInstanceOf[ConnectorState]
  val CREATING = "CREATING".asInstanceOf[ConnectorState]
  val UPDATING = "UPDATING".asInstanceOf[ConnectorState]
  val DELETING = "DELETING".asInstanceOf[ConnectorState]
  val FAILED = "FAILED".asInstanceOf[ConnectorState]

  @inline def values: js.Array[ConnectorState] = js.Array(RUNNING, CREATING, UPDATING, DELETING, FAILED)
}

@js.native
sealed trait CustomPluginContentType extends js.Any
object CustomPluginContentType {
  val JAR = "JAR".asInstanceOf[CustomPluginContentType]
  val ZIP = "ZIP".asInstanceOf[CustomPluginContentType]

  @inline def values: js.Array[CustomPluginContentType] = js.Array(JAR, ZIP)
}

@js.native
sealed trait CustomPluginState extends js.Any
object CustomPluginState {
  val CREATING = "CREATING".asInstanceOf[CustomPluginState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[CustomPluginState]
  val ACTIVE = "ACTIVE".asInstanceOf[CustomPluginState]
  val UPDATING = "UPDATING".asInstanceOf[CustomPluginState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[CustomPluginState]
  val DELETING = "DELETING".asInstanceOf[CustomPluginState]

  @inline def values: js.Array[CustomPluginState] = js.Array(CREATING, CREATE_FAILED, ACTIVE, UPDATING, UPDATE_FAILED, DELETING)
}

@js.native
sealed trait KafkaClusterClientAuthenticationType extends js.Any
object KafkaClusterClientAuthenticationType {
  val NONE = "NONE".asInstanceOf[KafkaClusterClientAuthenticationType]
  val IAM = "IAM".asInstanceOf[KafkaClusterClientAuthenticationType]

  @inline def values: js.Array[KafkaClusterClientAuthenticationType] = js.Array(NONE, IAM)
}

@js.native
sealed trait KafkaClusterEncryptionInTransitType extends js.Any
object KafkaClusterEncryptionInTransitType {
  val PLAINTEXT = "PLAINTEXT".asInstanceOf[KafkaClusterEncryptionInTransitType]
  val TLS = "TLS".asInstanceOf[KafkaClusterEncryptionInTransitType]

  @inline def values: js.Array[KafkaClusterEncryptionInTransitType] = js.Array(PLAINTEXT, TLS)
}
