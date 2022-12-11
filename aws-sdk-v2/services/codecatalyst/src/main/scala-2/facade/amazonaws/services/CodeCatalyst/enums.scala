package facade.amazonaws.services.codecatalyst

import scalajs.js

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val EQ = "EQ".asInstanceOf[ComparisonOperator]
  val GT = "GT".asInstanceOf[ComparisonOperator]
  val GE = "GE".asInstanceOf[ComparisonOperator]
  val LT = "LT".asInstanceOf[ComparisonOperator]
  val LE = "LE".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(EQ, GT, GE, LT, LE)
}

@js.native
sealed trait DevEnvironmentSessionType extends js.Any
object DevEnvironmentSessionType {
  val SSM = "SSM".asInstanceOf[DevEnvironmentSessionType]
  val SSH = "SSH".asInstanceOf[DevEnvironmentSessionType]

  @inline def values: js.Array[DevEnvironmentSessionType] = js.Array(SSM, SSH)
}

@js.native
sealed trait DevEnvironmentStatus extends js.Any
object DevEnvironmentStatus {
  val PENDING = "PENDING".asInstanceOf[DevEnvironmentStatus]
  val RUNNING = "RUNNING".asInstanceOf[DevEnvironmentStatus]
  val STARTING = "STARTING".asInstanceOf[DevEnvironmentStatus]
  val STOPPING = "STOPPING".asInstanceOf[DevEnvironmentStatus]
  val STOPPED = "STOPPED".asInstanceOf[DevEnvironmentStatus]
  val FAILED = "FAILED".asInstanceOf[DevEnvironmentStatus]
  val DELETING = "DELETING".asInstanceOf[DevEnvironmentStatus]
  val DELETED = "DELETED".asInstanceOf[DevEnvironmentStatus]

  @inline def values: js.Array[DevEnvironmentStatus] = js.Array(PENDING, RUNNING, STARTING, STOPPING, STOPPED, FAILED, DELETING, DELETED)
}

@js.native
sealed trait FilterKey extends js.Any
object FilterKey {
  val hasAccessTo = "hasAccessTo".asInstanceOf[FilterKey]

  @inline def values: js.Array[FilterKey] = js.Array(hasAccessTo)
}

@js.native
sealed trait InstanceType extends js.Any
object InstanceType {
  val `dev.standard1.small` = "dev.standard1.small".asInstanceOf[InstanceType]
  val `dev.standard1.medium` = "dev.standard1.medium".asInstanceOf[InstanceType]
  val `dev.standard1.large` = "dev.standard1.large".asInstanceOf[InstanceType]
  val `dev.standard1.xlarge` = "dev.standard1.xlarge".asInstanceOf[InstanceType]

  @inline def values: js.Array[InstanceType] = js.Array(`dev.standard1.small`, `dev.standard1.medium`, `dev.standard1.large`, `dev.standard1.xlarge`)
}

@js.native
sealed trait OperationType extends js.Any
object OperationType {
  val READONLY = "READONLY".asInstanceOf[OperationType]
  val MUTATION = "MUTATION".asInstanceOf[OperationType]

  @inline def values: js.Array[OperationType] = js.Array(READONLY, MUTATION)
}

@js.native
sealed trait UserType extends js.Any
object UserType {
  val USER = "USER".asInstanceOf[UserType]
  val AWS_ACCOUNT = "AWS_ACCOUNT".asInstanceOf[UserType]
  val UNKNOWN = "UNKNOWN".asInstanceOf[UserType]

  @inline def values: js.Array[UserType] = js.Array(USER, AWS_ACCOUNT, UNKNOWN)
}
