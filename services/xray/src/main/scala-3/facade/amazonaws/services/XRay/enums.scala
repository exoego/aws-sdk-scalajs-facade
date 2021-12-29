package facade.amazonaws.services.xray

import scalajs._

type EncryptionStatus = "UPDATING" | "ACTIVE"
object EncryptionStatus {
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[EncryptionStatus] = js.Array(UPDATING, ACTIVE)
}

type EncryptionType = "NONE" | "KMS"
object EncryptionType {
  inline val NONE: "NONE" = "NONE"
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[EncryptionType] = js.Array(NONE, KMS)
}

type InsightCategory = "FAULT"
object InsightCategory {
  inline val FAULT: "FAULT" = "FAULT"

  inline def values: js.Array[InsightCategory] = js.Array(FAULT)
}

type InsightState = "ACTIVE" | "CLOSED"
object InsightState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[InsightState] = js.Array(ACTIVE, CLOSED)
}

type SamplingStrategyName = "PartialScan" | "FixedRate"
object SamplingStrategyName {
  inline val PartialScan: "PartialScan" = "PartialScan"
  inline val FixedRate: "FixedRate" = "FixedRate"

  inline def values: js.Array[SamplingStrategyName] = js.Array(PartialScan, FixedRate)
}

type TimeRangeType = "TraceId" | "Event"
object TimeRangeType {
  inline val TraceId: "TraceId" = "TraceId"
  inline val Event: "Event" = "Event"

  inline def values: js.Array[TimeRangeType] = js.Array(TraceId, Event)
}
