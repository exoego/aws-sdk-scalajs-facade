package facade.amazonaws.services.xray

import scalajs._

type EncryptionStatus = "UPDATING" | "ACTIVE"
object EncryptionStatus {
  val UPDATING: "UPDATING" = "UPDATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"

  @inline def values = js.Array[EncryptionStatus](UPDATING, ACTIVE)
}

type EncryptionType = "NONE" | "KMS"
object EncryptionType {
  val NONE: "NONE" = "NONE"
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[EncryptionType](NONE, KMS)
}

type InsightCategory = "FAULT"
object InsightCategory {
  val FAULT: "FAULT" = "FAULT"

  @inline def values = js.Array[InsightCategory](FAULT)
}

type InsightState = "ACTIVE" | "CLOSED"
object InsightState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val CLOSED: "CLOSED" = "CLOSED"

  @inline def values = js.Array[InsightState](ACTIVE, CLOSED)
}

type SamplingStrategyName = "PartialScan" | "FixedRate"
object SamplingStrategyName {
  val PartialScan: "PartialScan" = "PartialScan"
  val FixedRate: "FixedRate" = "FixedRate"

  @inline def values = js.Array[SamplingStrategyName](PartialScan, FixedRate)
}

type TimeRangeType = "TraceId" | "Event"
object TimeRangeType {
  val TraceId: "TraceId" = "TraceId"
  val Event: "Event" = "Event"

  @inline def values = js.Array[TimeRangeType](TraceId, Event)
}
