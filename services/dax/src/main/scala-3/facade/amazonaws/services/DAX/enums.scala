package facade.amazonaws.services.dax

import scalajs._

type ChangeType = "IMMEDIATE" | "REQUIRES_REBOOT"
object ChangeType {
  val IMMEDIATE: "IMMEDIATE" = "IMMEDIATE"
  val REQUIRES_REBOOT: "REQUIRES_REBOOT" = "REQUIRES_REBOOT"

  @inline def values = js.Array[ChangeType](IMMEDIATE, REQUIRES_REBOOT)
}

type IsModifiable = "TRUE" | "FALSE" | "CONDITIONAL"
object IsModifiable {
  val TRUE: "TRUE" = "TRUE"
  val FALSE: "FALSE" = "FALSE"
  val CONDITIONAL: "CONDITIONAL" = "CONDITIONAL"

  @inline def values = js.Array[IsModifiable](TRUE, FALSE, CONDITIONAL)
}

type ParameterType = "DEFAULT" | "NODE_TYPE_SPECIFIC"
object ParameterType {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val NODE_TYPE_SPECIFIC: "NODE_TYPE_SPECIFIC" = "NODE_TYPE_SPECIFIC"

  @inline def values = js.Array[ParameterType](DEFAULT, NODE_TYPE_SPECIFIC)
}

type SSEStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED"
object SSEStatus {
  val ENABLING: "ENABLING" = "ENABLING"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLING: "DISABLING" = "DISABLING"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[SSEStatus](ENABLING, ENABLED, DISABLING, DISABLED)
}

type SourceType = "CLUSTER" | "PARAMETER_GROUP" | "SUBNET_GROUP"
object SourceType {
  val CLUSTER: "CLUSTER" = "CLUSTER"
  val PARAMETER_GROUP: "PARAMETER_GROUP" = "PARAMETER_GROUP"
  val SUBNET_GROUP: "SUBNET_GROUP" = "SUBNET_GROUP"

  @inline def values = js.Array[SourceType](CLUSTER, PARAMETER_GROUP, SUBNET_GROUP)
}
