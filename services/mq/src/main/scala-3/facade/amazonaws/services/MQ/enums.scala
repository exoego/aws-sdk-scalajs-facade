package facade.amazonaws.services.mq

import scalajs._

/** The authentication strategy used to secure the broker.
  */
type AuthenticationStrategy = "SIMPLE" | "LDAP"
object AuthenticationStrategy {
  val SIMPLE: "SIMPLE" = "SIMPLE"
  val LDAP: "LDAP" = "LDAP"

  @inline def values = js.Array[AuthenticationStrategy](SIMPLE, LDAP)
}

/** The status of the broker.
  */
type BrokerState = "CREATION_IN_PROGRESS" | "CREATION_FAILED" | "DELETION_IN_PROGRESS" | "RUNNING" | "REBOOT_IN_PROGRESS"
object BrokerState {
  val CREATION_IN_PROGRESS: "CREATION_IN_PROGRESS" = "CREATION_IN_PROGRESS"
  val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"
  val DELETION_IN_PROGRESS: "DELETION_IN_PROGRESS" = "DELETION_IN_PROGRESS"
  val RUNNING: "RUNNING" = "RUNNING"
  val REBOOT_IN_PROGRESS: "REBOOT_IN_PROGRESS" = "REBOOT_IN_PROGRESS"

  @inline def values = js.Array[BrokerState](CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING, REBOOT_IN_PROGRESS)
}

/** The broker's storage type. <important>EFS is currently not Supported for RabbitMQ engine type.</important>
  */
type BrokerStorageType = "EBS" | "EFS"
object BrokerStorageType {
  val EBS: "EBS" = "EBS"
  val EFS: "EFS" = "EFS"

  @inline def values = js.Array[BrokerStorageType](EBS, EFS)
}

/** The type of change pending for the ActiveMQ user.
  */
type ChangeType = "CREATE" | "UPDATE" | "DELETE"
object ChangeType {
  val CREATE: "CREATE" = "CREATE"
  val UPDATE: "UPDATE" = "UPDATE"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[ChangeType](CREATE, UPDATE, DELETE)
}

type DayOfWeek = "MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY" | "SUNDAY"
object DayOfWeek {
  val MONDAY: "MONDAY" = "MONDAY"
  val TUESDAY: "TUESDAY" = "TUESDAY"
  val WEDNESDAY: "WEDNESDAY" = "WEDNESDAY"
  val THURSDAY: "THURSDAY" = "THURSDAY"
  val FRIDAY: "FRIDAY" = "FRIDAY"
  val SATURDAY: "SATURDAY" = "SATURDAY"
  val SUNDAY: "SUNDAY" = "SUNDAY"

  @inline def values = js.Array[DayOfWeek](MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
}

/** The deployment mode of the broker.
  */
type DeploymentMode = "SINGLE_INSTANCE" | "ACTIVE_STANDBY_MULTI_AZ" | "CLUSTER_MULTI_AZ"
object DeploymentMode {
  val SINGLE_INSTANCE: "SINGLE_INSTANCE" = "SINGLE_INSTANCE"
  val ACTIVE_STANDBY_MULTI_AZ: "ACTIVE_STANDBY_MULTI_AZ" = "ACTIVE_STANDBY_MULTI_AZ"
  val CLUSTER_MULTI_AZ: "CLUSTER_MULTI_AZ" = "CLUSTER_MULTI_AZ"

  @inline def values = js.Array[DeploymentMode](SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ, CLUSTER_MULTI_AZ)
}

/** The type of broker engine. Note: Currently, Amazon MQ supports ActiveMQ and RabbitMQ.
  */
type EngineType = "ACTIVEMQ" | "RABBITMQ"
object EngineType {
  val ACTIVEMQ: "ACTIVEMQ" = "ACTIVEMQ"
  val RABBITMQ: "RABBITMQ" = "RABBITMQ"

  @inline def values = js.Array[EngineType](ACTIVEMQ, RABBITMQ)
}

/** The reason for which the XML elements or attributes were sanitized.
  */
type SanitizationWarningReason = "DISALLOWED_ELEMENT_REMOVED" | "DISALLOWED_ATTRIBUTE_REMOVED" | "INVALID_ATTRIBUTE_VALUE_REMOVED"
object SanitizationWarningReason {
  val DISALLOWED_ELEMENT_REMOVED: "DISALLOWED_ELEMENT_REMOVED" = "DISALLOWED_ELEMENT_REMOVED"
  val DISALLOWED_ATTRIBUTE_REMOVED: "DISALLOWED_ATTRIBUTE_REMOVED" = "DISALLOWED_ATTRIBUTE_REMOVED"
  val INVALID_ATTRIBUTE_VALUE_REMOVED: "INVALID_ATTRIBUTE_VALUE_REMOVED" = "INVALID_ATTRIBUTE_VALUE_REMOVED"

  @inline def values = js.Array[SanitizationWarningReason](DISALLOWED_ELEMENT_REMOVED, DISALLOWED_ATTRIBUTE_REMOVED, INVALID_ATTRIBUTE_VALUE_REMOVED)
}
