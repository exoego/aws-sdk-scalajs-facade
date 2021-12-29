package facade.amazonaws.services.cloudtrail

import scalajs._

type EventCategory = "insight"
object EventCategory {
  inline val insight: "insight" = "insight"

  inline def values: js.Array[EventCategory] = js.Array(insight)
}

type InsightType = "ApiCallRateInsight"
object InsightType {
  inline val ApiCallRateInsight: "ApiCallRateInsight" = "ApiCallRateInsight"

  inline def values: js.Array[InsightType] = js.Array(ApiCallRateInsight)
}

type LookupAttributeKey = "EventId" | "EventName" | "ReadOnly" | "Username" | "ResourceType" | "ResourceName" | "EventSource" | "AccessKeyId"
object LookupAttributeKey {
  inline val EventId: "EventId" = "EventId"
  inline val EventName: "EventName" = "EventName"
  inline val ReadOnly: "ReadOnly" = "ReadOnly"
  inline val Username: "Username" = "Username"
  inline val ResourceType: "ResourceType" = "ResourceType"
  inline val ResourceName: "ResourceName" = "ResourceName"
  inline val EventSource: "EventSource" = "EventSource"
  inline val AccessKeyId: "AccessKeyId" = "AccessKeyId"

  inline def values: js.Array[LookupAttributeKey] = js.Array(EventId, EventName, ReadOnly, Username, ResourceType, ResourceName, EventSource, AccessKeyId)
}

type ReadWriteType = "ReadOnly" | "WriteOnly" | "All"
object ReadWriteType {
  inline val ReadOnly: "ReadOnly" = "ReadOnly"
  inline val WriteOnly: "WriteOnly" = "WriteOnly"
  inline val All: "All" = "All"

  inline def values: js.Array[ReadWriteType] = js.Array(ReadOnly, WriteOnly, All)
}
