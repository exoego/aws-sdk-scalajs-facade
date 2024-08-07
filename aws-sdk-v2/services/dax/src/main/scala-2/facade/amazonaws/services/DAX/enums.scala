package facade.amazonaws.services.dax

import scalajs.js

@js.native
sealed trait ChangeType extends js.Any
object ChangeType {
  val IMMEDIATE = "IMMEDIATE".asInstanceOf[ChangeType]
  val REQUIRES_REBOOT = "REQUIRES_REBOOT".asInstanceOf[ChangeType]

  @inline def values: js.Array[ChangeType] = js.Array(IMMEDIATE, REQUIRES_REBOOT)
}

@js.native
sealed trait ClusterEndpointEncryptionType extends js.Any
object ClusterEndpointEncryptionType {
  val NONE = "NONE".asInstanceOf[ClusterEndpointEncryptionType]
  val TLS = "TLS".asInstanceOf[ClusterEndpointEncryptionType]

  @inline def values: js.Array[ClusterEndpointEncryptionType] = js.Array(NONE, TLS)
}

@js.native
sealed trait IsModifiable extends js.Any
object IsModifiable {
  val TRUE = "TRUE".asInstanceOf[IsModifiable]
  val FALSE = "FALSE".asInstanceOf[IsModifiable]
  val CONDITIONAL = "CONDITIONAL".asInstanceOf[IsModifiable]

  @inline def values: js.Array[IsModifiable] = js.Array(TRUE, FALSE, CONDITIONAL)
}

@js.native
sealed trait ParameterType extends js.Any
object ParameterType {
  val DEFAULT = "DEFAULT".asInstanceOf[ParameterType]
  val NODE_TYPE_SPECIFIC = "NODE_TYPE_SPECIFIC".asInstanceOf[ParameterType]

  @inline def values: js.Array[ParameterType] = js.Array(DEFAULT, NODE_TYPE_SPECIFIC)
}

@js.native
sealed trait SSEStatus extends js.Any
object SSEStatus {
  val ENABLING = "ENABLING".asInstanceOf[SSEStatus]
  val ENABLED = "ENABLED".asInstanceOf[SSEStatus]
  val DISABLING = "DISABLING".asInstanceOf[SSEStatus]
  val DISABLED = "DISABLED".asInstanceOf[SSEStatus]

  @inline def values: js.Array[SSEStatus] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val CLUSTER = "CLUSTER".asInstanceOf[SourceType]
  val PARAMETER_GROUP = "PARAMETER_GROUP".asInstanceOf[SourceType]
  val SUBNET_GROUP = "SUBNET_GROUP".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(CLUSTER, PARAMETER_GROUP, SUBNET_GROUP)
}
