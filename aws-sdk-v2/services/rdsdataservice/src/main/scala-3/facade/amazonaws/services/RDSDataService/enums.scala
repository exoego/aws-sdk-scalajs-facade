package facade.amazonaws.services.rdsdataservice

import scalajs.js

type DecimalReturnType = "STRING" | "DOUBLE_OR_LONG"
object DecimalReturnType {
  inline val STRING: "STRING" = "STRING"
  inline val DOUBLE_OR_LONG: "DOUBLE_OR_LONG" = "DOUBLE_OR_LONG"

  inline def values: js.Array[DecimalReturnType] = js.Array(STRING, DOUBLE_OR_LONG)
}

type TypeHint = "JSON" | "UUID" | "TIMESTAMP" | "DATE" | "TIME" | "DECIMAL"
object TypeHint {
  inline val JSON: "JSON" = "JSON"
  inline val UUID: "UUID" = "UUID"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"
  inline val DATE: "DATE" = "DATE"
  inline val TIME: "TIME" = "TIME"
  inline val DECIMAL: "DECIMAL" = "DECIMAL"

  inline def values: js.Array[TypeHint] = js.Array(JSON, UUID, TIMESTAMP, DATE, TIME, DECIMAL)
}
