package facade.amazonaws.services.mq

import scalajs.js

/** Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
  */
@js.native
sealed trait AuthenticationStrategy extends js.Any
object AuthenticationStrategy {
  val SIMPLE = "SIMPLE".asInstanceOf[AuthenticationStrategy]
  val LDAP = "LDAP".asInstanceOf[AuthenticationStrategy]

  @inline def values: js.Array[AuthenticationStrategy] = js.Array(SIMPLE, LDAP)
}

/** The broker's status.
  */
@js.native
sealed trait BrokerState extends js.Any
object BrokerState {
  val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[BrokerState]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[BrokerState]
  val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS".asInstanceOf[BrokerState]
  val RUNNING = "RUNNING".asInstanceOf[BrokerState]
  val REBOOT_IN_PROGRESS = "REBOOT_IN_PROGRESS".asInstanceOf[BrokerState]

  @inline def values: js.Array[BrokerState] = js.Array(CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING, REBOOT_IN_PROGRESS)
}

/** The broker's storage type. <important>EFS is not supported for RabbitMQ engine type. </important>
  */
@js.native
sealed trait BrokerStorageType extends js.Any
object BrokerStorageType {
  val EBS = "EBS".asInstanceOf[BrokerStorageType]
  val EFS = "EFS".asInstanceOf[BrokerStorageType]

  @inline def values: js.Array[BrokerStorageType] = js.Array(EBS, EFS)
}

/** The type of change pending for the ActiveMQ user.
  */
@js.native
sealed trait ChangeType extends js.Any
object ChangeType {
  val CREATE = "CREATE".asInstanceOf[ChangeType]
  val UPDATE = "UPDATE".asInstanceOf[ChangeType]
  val DELETE = "DELETE".asInstanceOf[ChangeType]

  @inline def values: js.Array[ChangeType] = js.Array(CREATE, UPDATE, DELETE)
}

@js.native
sealed trait DayOfWeek extends js.Any
object DayOfWeek {
  val MONDAY = "MONDAY".asInstanceOf[DayOfWeek]
  val TUESDAY = "TUESDAY".asInstanceOf[DayOfWeek]
  val WEDNESDAY = "WEDNESDAY".asInstanceOf[DayOfWeek]
  val THURSDAY = "THURSDAY".asInstanceOf[DayOfWeek]
  val FRIDAY = "FRIDAY".asInstanceOf[DayOfWeek]
  val SATURDAY = "SATURDAY".asInstanceOf[DayOfWeek]
  val SUNDAY = "SUNDAY".asInstanceOf[DayOfWeek]

  @inline def values: js.Array[DayOfWeek] = js.Array(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
}

/** The broker's deployment mode.
  */
@js.native
sealed trait DeploymentMode extends js.Any
object DeploymentMode {
  val SINGLE_INSTANCE = "SINGLE_INSTANCE".asInstanceOf[DeploymentMode]
  val ACTIVE_STANDBY_MULTI_AZ = "ACTIVE_STANDBY_MULTI_AZ".asInstanceOf[DeploymentMode]
  val CLUSTER_MULTI_AZ = "CLUSTER_MULTI_AZ".asInstanceOf[DeploymentMode]

  @inline def values: js.Array[DeploymentMode] = js.Array(SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ, CLUSTER_MULTI_AZ)
}

/** The type of broker engine. Amazon MQ supports ActiveMQ and RabbitMQ.
  */
@js.native
sealed trait EngineType extends js.Any
object EngineType {
  val ACTIVEMQ = "ACTIVEMQ".asInstanceOf[EngineType]
  val RABBITMQ = "RABBITMQ".asInstanceOf[EngineType]

  @inline def values: js.Array[EngineType] = js.Array(ACTIVEMQ, RABBITMQ)
}

/** The reason for which the XML elements or attributes were sanitized.
  */
@js.native
sealed trait SanitizationWarningReason extends js.Any
object SanitizationWarningReason {
  val DISALLOWED_ELEMENT_REMOVED = "DISALLOWED_ELEMENT_REMOVED".asInstanceOf[SanitizationWarningReason]
  val DISALLOWED_ATTRIBUTE_REMOVED = "DISALLOWED_ATTRIBUTE_REMOVED".asInstanceOf[SanitizationWarningReason]
  val INVALID_ATTRIBUTE_VALUE_REMOVED = "INVALID_ATTRIBUTE_VALUE_REMOVED".asInstanceOf[SanitizationWarningReason]

  @inline def values: js.Array[SanitizationWarningReason] = js.Array(DISALLOWED_ELEMENT_REMOVED, DISALLOWED_ATTRIBUTE_REMOVED, INVALID_ATTRIBUTE_VALUE_REMOVED)
}
