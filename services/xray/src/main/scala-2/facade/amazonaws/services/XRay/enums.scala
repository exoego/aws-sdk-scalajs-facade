package facade.amazonaws.services.xray

import scalajs.js

@js.native
sealed trait EncryptionStatus extends js.Any
object EncryptionStatus {
  val UPDATING = "UPDATING".asInstanceOf[EncryptionStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[EncryptionStatus]

  @inline def values: js.Array[EncryptionStatus] = js.Array(UPDATING, ACTIVE)
}

@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val NONE = "NONE".asInstanceOf[EncryptionType]
  val KMS = "KMS".asInstanceOf[EncryptionType]

  @inline def values: js.Array[EncryptionType] = js.Array(NONE, KMS)
}

@js.native
sealed trait InsightCategory extends js.Any
object InsightCategory {
  val FAULT = "FAULT".asInstanceOf[InsightCategory]

  @inline def values: js.Array[InsightCategory] = js.Array(FAULT)
}

@js.native
sealed trait InsightState extends js.Any
object InsightState {
  val ACTIVE = "ACTIVE".asInstanceOf[InsightState]
  val CLOSED = "CLOSED".asInstanceOf[InsightState]

  @inline def values: js.Array[InsightState] = js.Array(ACTIVE, CLOSED)
}

@js.native
sealed trait SamplingStrategyName extends js.Any
object SamplingStrategyName {
  val PartialScan = "PartialScan".asInstanceOf[SamplingStrategyName]
  val FixedRate = "FixedRate".asInstanceOf[SamplingStrategyName]

  @inline def values: js.Array[SamplingStrategyName] = js.Array(PartialScan, FixedRate)
}

@js.native
sealed trait TimeRangeType extends js.Any
object TimeRangeType {
  val TraceId = "TraceId".asInstanceOf[TimeRangeType]
  val Event = "Event".asInstanceOf[TimeRangeType]

  @inline def values: js.Array[TimeRangeType] = js.Array(TraceId, Event)
}
