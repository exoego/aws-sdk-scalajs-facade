package facade.amazonaws.services.rdsdataservice

import scalajs.js

@js.native
sealed trait DecimalReturnType extends js.Any
object DecimalReturnType {
  val STRING = "STRING".asInstanceOf[DecimalReturnType]
  val DOUBLE_OR_LONG = "DOUBLE_OR_LONG".asInstanceOf[DecimalReturnType]

  @inline def values: js.Array[DecimalReturnType] = js.Array(STRING, DOUBLE_OR_LONG)
}

@js.native
sealed trait LongReturnType extends js.Any
object LongReturnType {
  val STRING = "STRING".asInstanceOf[LongReturnType]
  val LONG = "LONG".asInstanceOf[LongReturnType]

  @inline def values: js.Array[LongReturnType] = js.Array(STRING, LONG)
}

@js.native
sealed trait RecordsFormatType extends js.Any
object RecordsFormatType {
  val NONE = "NONE".asInstanceOf[RecordsFormatType]
  val JSON = "JSON".asInstanceOf[RecordsFormatType]

  @inline def values: js.Array[RecordsFormatType] = js.Array(NONE, JSON)
}

@js.native
sealed trait TypeHint extends js.Any
object TypeHint {
  val JSON = "JSON".asInstanceOf[TypeHint]
  val UUID = "UUID".asInstanceOf[TypeHint]
  val TIMESTAMP = "TIMESTAMP".asInstanceOf[TypeHint]
  val DATE = "DATE".asInstanceOf[TypeHint]
  val TIME = "TIME".asInstanceOf[TypeHint]
  val DECIMAL = "DECIMAL".asInstanceOf[TypeHint]

  @inline def values: js.Array[TypeHint] = js.Array(JSON, UUID, TIMESTAMP, DATE, TIME, DECIMAL)
}
