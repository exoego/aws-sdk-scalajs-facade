package facade.amazonaws.services.cloudtrail

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait EventCategory extends js.Any
object EventCategory {
  val insight = "insight".asInstanceOf[EventCategory]

  @inline def values = js.Array(insight)
}

@js.native
sealed trait InsightType extends js.Any
object InsightType {
  val ApiCallRateInsight = "ApiCallRateInsight".asInstanceOf[InsightType]

  @inline def values = js.Array(ApiCallRateInsight)
}

@js.native
sealed trait LookupAttributeKey extends js.Any
object LookupAttributeKey {
  val EventId = "EventId".asInstanceOf[LookupAttributeKey]
  val EventName = "EventName".asInstanceOf[LookupAttributeKey]
  val ReadOnly = "ReadOnly".asInstanceOf[LookupAttributeKey]
  val Username = "Username".asInstanceOf[LookupAttributeKey]
  val ResourceType = "ResourceType".asInstanceOf[LookupAttributeKey]
  val ResourceName = "ResourceName".asInstanceOf[LookupAttributeKey]
  val EventSource = "EventSource".asInstanceOf[LookupAttributeKey]
  val AccessKeyId = "AccessKeyId".asInstanceOf[LookupAttributeKey]

  @inline def values = js.Array(EventId, EventName, ReadOnly, Username, ResourceType, ResourceName, EventSource, AccessKeyId)
}

@js.native
sealed trait ReadWriteType extends js.Any
object ReadWriteType {
  val ReadOnly = "ReadOnly".asInstanceOf[ReadWriteType]
  val WriteOnly = "WriteOnly".asInstanceOf[ReadWriteType]
  val All = "All".asInstanceOf[ReadWriteType]

  @inline def values = js.Array(ReadOnly, WriteOnly, All)
}

