package facade.amazonaws.services.cloudtrail

import scalajs._

type EventCategory = "insight"
object EventCategory {
  val insight: "insight" = "insight"

  @inline def values = js.Array[EventCategory](insight)
}

type InsightType = "ApiCallRateInsight"
object InsightType {
  val ApiCallRateInsight: "ApiCallRateInsight" = "ApiCallRateInsight"

  @inline def values = js.Array[InsightType](ApiCallRateInsight)
}

type LookupAttributeKey = "EventId" | "EventName" | "ReadOnly" | "Username" | "ResourceType" | "ResourceName" | "EventSource" | "AccessKeyId"
object LookupAttributeKey {
  val EventId: "EventId" = "EventId"
  val EventName: "EventName" = "EventName"
  val ReadOnly: "ReadOnly" = "ReadOnly"
  val Username: "Username" = "Username"
  val ResourceType: "ResourceType" = "ResourceType"
  val ResourceName: "ResourceName" = "ResourceName"
  val EventSource: "EventSource" = "EventSource"
  val AccessKeyId: "AccessKeyId" = "AccessKeyId"

  @inline def values = js.Array[LookupAttributeKey](EventId, EventName, ReadOnly, Username, ResourceType, ResourceName, EventSource, AccessKeyId)
}

type ReadWriteType = "ReadOnly" | "WriteOnly" | "All"
object ReadWriteType {
  val ReadOnly: "ReadOnly" = "ReadOnly"
  val WriteOnly: "WriteOnly" = "WriteOnly"
  val All: "All" = "All"

  @inline def values = js.Array[ReadWriteType](ReadOnly, WriteOnly, All)
}
