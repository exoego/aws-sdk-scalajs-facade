package facade.amazonaws.services.rdsdataservice

import scalajs._

type DecimalReturnType = "STRING" | "DOUBLE_OR_LONG"
object DecimalReturnType {
  val STRING: "STRING" = "STRING"
  val DOUBLE_OR_LONG: "DOUBLE_OR_LONG" = "DOUBLE_OR_LONG"

  @inline def values = js.Array[DecimalReturnType](STRING, DOUBLE_OR_LONG)
}

type TypeHint = "JSON" | "UUID" | "TIMESTAMP" | "DATE" | "TIME" | "DECIMAL"
object TypeHint {
  val JSON: "JSON" = "JSON"
  val UUID: "UUID" = "UUID"
  val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"
  val DATE: "DATE" = "DATE"
  val TIME: "TIME" = "TIME"
  val DECIMAL: "DECIMAL" = "DECIMAL"

  @inline def values = js.Array[TypeHint](JSON, UUID, TIMESTAMP, DATE, TIME, DECIMAL)
}
