package facade.amazonaws.services.dax

import scalajs._

type ChangeType = "IMMEDIATE" | "REQUIRES_REBOOT"
object ChangeType {
  inline val IMMEDIATE: "IMMEDIATE" = "IMMEDIATE"
  inline val REQUIRES_REBOOT: "REQUIRES_REBOOT" = "REQUIRES_REBOOT"

  inline def values: js.Array[ChangeType] = js.Array(IMMEDIATE, REQUIRES_REBOOT)
}

type IsModifiable = "TRUE" | "FALSE" | "CONDITIONAL"
object IsModifiable {
  inline val TRUE: "TRUE" = "TRUE"
  inline val FALSE: "FALSE" = "FALSE"
  inline val CONDITIONAL: "CONDITIONAL" = "CONDITIONAL"

  inline def values: js.Array[IsModifiable] = js.Array(TRUE, FALSE, CONDITIONAL)
}

type ParameterType = "DEFAULT" | "NODE_TYPE_SPECIFIC"
object ParameterType {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val NODE_TYPE_SPECIFIC: "NODE_TYPE_SPECIFIC" = "NODE_TYPE_SPECIFIC"

  inline def values: js.Array[ParameterType] = js.Array(DEFAULT, NODE_TYPE_SPECIFIC)
}

type SSEStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED"
object SSEStatus {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[SSEStatus] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED)
}

type SourceType = "CLUSTER" | "PARAMETER_GROUP" | "SUBNET_GROUP"
object SourceType {
  inline val CLUSTER: "CLUSTER" = "CLUSTER"
  inline val PARAMETER_GROUP: "PARAMETER_GROUP" = "PARAMETER_GROUP"
  inline val SUBNET_GROUP: "SUBNET_GROUP" = "SUBNET_GROUP"

  inline def values: js.Array[SourceType] = js.Array(CLUSTER, PARAMETER_GROUP, SUBNET_GROUP)
}
