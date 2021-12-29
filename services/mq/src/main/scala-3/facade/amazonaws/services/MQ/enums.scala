package facade.amazonaws.services.mq

import scalajs._

/** The authentication strategy used to secure the broker.
  */
type AuthenticationStrategy = "SIMPLE" | "LDAP"
object AuthenticationStrategy {
  inline val SIMPLE: "SIMPLE" = "SIMPLE"
  inline val LDAP: "LDAP" = "LDAP"

  inline def values: js.Array[AuthenticationStrategy] = js.Array(SIMPLE, LDAP)
}

/** The status of the broker.
  */
type BrokerState = "CREATION_IN_PROGRESS" | "CREATION_FAILED" | "DELETION_IN_PROGRESS" | "RUNNING" | "REBOOT_IN_PROGRESS"
object BrokerState {
  inline val CREATION_IN_PROGRESS: "CREATION_IN_PROGRESS" = "CREATION_IN_PROGRESS"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"
  inline val DELETION_IN_PROGRESS: "DELETION_IN_PROGRESS" = "DELETION_IN_PROGRESS"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val REBOOT_IN_PROGRESS: "REBOOT_IN_PROGRESS" = "REBOOT_IN_PROGRESS"

  inline def values: js.Array[BrokerState] = js.Array(CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING, REBOOT_IN_PROGRESS)
}

/** The broker's storage type. <important>EFS is currently not Supported for RabbitMQ engine type.</important>
  */
type BrokerStorageType = "EBS" | "EFS"
object BrokerStorageType {
  inline val EBS: "EBS" = "EBS"
  inline val EFS: "EFS" = "EFS"

  inline def values: js.Array[BrokerStorageType] = js.Array(EBS, EFS)
}

/** The type of change pending for the ActiveMQ user.
  */
type ChangeType = "CREATE" | "UPDATE" | "DELETE"
object ChangeType {
  inline val CREATE: "CREATE" = "CREATE"
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[ChangeType] = js.Array(CREATE, UPDATE, DELETE)
}

type DayOfWeek = "MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY" | "SUNDAY"
object DayOfWeek {
  inline val MONDAY: "MONDAY" = "MONDAY"
  inline val TUESDAY: "TUESDAY" = "TUESDAY"
  inline val WEDNESDAY: "WEDNESDAY" = "WEDNESDAY"
  inline val THURSDAY: "THURSDAY" = "THURSDAY"
  inline val FRIDAY: "FRIDAY" = "FRIDAY"
  inline val SATURDAY: "SATURDAY" = "SATURDAY"
  inline val SUNDAY: "SUNDAY" = "SUNDAY"

  inline def values: js.Array[DayOfWeek] = js.Array(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
}

/** The deployment mode of the broker.
  */
type DeploymentMode = "SINGLE_INSTANCE" | "ACTIVE_STANDBY_MULTI_AZ" | "CLUSTER_MULTI_AZ"
object DeploymentMode {
  inline val SINGLE_INSTANCE: "SINGLE_INSTANCE" = "SINGLE_INSTANCE"
  inline val ACTIVE_STANDBY_MULTI_AZ: "ACTIVE_STANDBY_MULTI_AZ" = "ACTIVE_STANDBY_MULTI_AZ"
  inline val CLUSTER_MULTI_AZ: "CLUSTER_MULTI_AZ" = "CLUSTER_MULTI_AZ"

  inline def values: js.Array[DeploymentMode] = js.Array(SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ, CLUSTER_MULTI_AZ)
}

/** The type of broker engine. Note: Currently, Amazon MQ supports ActiveMQ and RabbitMQ.
  */
type EngineType = "ACTIVEMQ" | "RABBITMQ"
object EngineType {
  inline val ACTIVEMQ: "ACTIVEMQ" = "ACTIVEMQ"
  inline val RABBITMQ: "RABBITMQ" = "RABBITMQ"

  inline def values: js.Array[EngineType] = js.Array(ACTIVEMQ, RABBITMQ)
}

/** The reason for which the XML elements or attributes were sanitized.
  */
type SanitizationWarningReason = "DISALLOWED_ELEMENT_REMOVED" | "DISALLOWED_ATTRIBUTE_REMOVED" | "INVALID_ATTRIBUTE_VALUE_REMOVED"
object SanitizationWarningReason {
  inline val DISALLOWED_ELEMENT_REMOVED: "DISALLOWED_ELEMENT_REMOVED" = "DISALLOWED_ELEMENT_REMOVED"
  inline val DISALLOWED_ATTRIBUTE_REMOVED: "DISALLOWED_ATTRIBUTE_REMOVED" = "DISALLOWED_ATTRIBUTE_REMOVED"
  inline val INVALID_ATTRIBUTE_VALUE_REMOVED: "INVALID_ATTRIBUTE_VALUE_REMOVED" = "INVALID_ATTRIBUTE_VALUE_REMOVED"

  inline def values: js.Array[SanitizationWarningReason] = js.Array(DISALLOWED_ELEMENT_REMOVED, DISALLOWED_ATTRIBUTE_REMOVED, INVALID_ATTRIBUTE_VALUE_REMOVED)
}
