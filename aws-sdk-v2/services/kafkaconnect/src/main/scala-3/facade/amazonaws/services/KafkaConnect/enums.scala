package facade.amazonaws.services.kafkaconnect

import scalajs.js

type ConnectorState = "RUNNING" | "CREATING" | "UPDATING" | "DELETING" | "FAILED"
object ConnectorState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ConnectorState] = js.Array(RUNNING, CREATING, UPDATING, DELETING, FAILED)
}

type CustomPluginContentType = "JAR" | "ZIP"
object CustomPluginContentType {
  inline val JAR: "JAR" = "JAR"
  inline val ZIP: "ZIP" = "ZIP"

  inline def values: js.Array[CustomPluginContentType] = js.Array(JAR, ZIP)
}

type CustomPluginState = "CREATING" | "CREATE_FAILED" | "ACTIVE" | "UPDATING" | "UPDATE_FAILED" | "DELETING"
object CustomPluginState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[CustomPluginState] = js.Array(CREATING, CREATE_FAILED, ACTIVE, UPDATING, UPDATE_FAILED, DELETING)
}

type KafkaClusterClientAuthenticationType = "NONE" | "IAM"
object KafkaClusterClientAuthenticationType {
  inline val NONE: "NONE" = "NONE"
  inline val IAM: "IAM" = "IAM"

  inline def values: js.Array[KafkaClusterClientAuthenticationType] = js.Array(NONE, IAM)
}

type KafkaClusterEncryptionInTransitType = "PLAINTEXT" | "TLS"
object KafkaClusterEncryptionInTransitType {
  inline val PLAINTEXT: "PLAINTEXT" = "PLAINTEXT"
  inline val TLS: "TLS" = "TLS"

  inline def values: js.Array[KafkaClusterEncryptionInTransitType] = js.Array(PLAINTEXT, TLS)
}
