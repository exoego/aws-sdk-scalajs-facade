package facade.amazonaws.services.kinesisvideo

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait APIName extends js.Any
object APIName {
  val PUT_MEDIA = "PUT_MEDIA".asInstanceOf[APIName]
  val GET_MEDIA = "GET_MEDIA".asInstanceOf[APIName]
  val LIST_FRAGMENTS = "LIST_FRAGMENTS".asInstanceOf[APIName]
  val GET_MEDIA_FOR_FRAGMENT_LIST = "GET_MEDIA_FOR_FRAGMENT_LIST".asInstanceOf[APIName]
  val GET_HLS_STREAMING_SESSION_URL = "GET_HLS_STREAMING_SESSION_URL".asInstanceOf[APIName]
  val GET_DASH_STREAMING_SESSION_URL = "GET_DASH_STREAMING_SESSION_URL".asInstanceOf[APIName]
  val GET_CLIP = "GET_CLIP".asInstanceOf[APIName]

  @inline def values = js.Array(PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS, GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL, GET_DASH_STREAMING_SESSION_URL, GET_CLIP)
}

@js.native
sealed trait ChannelProtocol extends js.Any
object ChannelProtocol {
  val WSS = "WSS".asInstanceOf[ChannelProtocol]
  val HTTPS = "HTTPS".asInstanceOf[ChannelProtocol]

  @inline def values = js.Array(WSS, HTTPS)
}

@js.native
sealed trait ChannelRole extends js.Any
object ChannelRole {
  val MASTER = "MASTER".asInstanceOf[ChannelRole]
  val VIEWER = "VIEWER".asInstanceOf[ChannelRole]

  @inline def values = js.Array(MASTER, VIEWER)
}

@js.native
sealed trait ChannelType extends js.Any
object ChannelType {
  val SINGLE_MASTER = "SINGLE_MASTER".asInstanceOf[ChannelType]

  @inline def values = js.Array(SINGLE_MASTER)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[ComparisonOperator]

  @inline def values = js.Array(BEGINS_WITH)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val CREATING = "CREATING".asInstanceOf[Status]
  val ACTIVE = "ACTIVE".asInstanceOf[Status]
  val UPDATING = "UPDATING".asInstanceOf[Status]
  val DELETING = "DELETING".asInstanceOf[Status]

  @inline def values = js.Array(CREATING, ACTIVE, UPDATING, DELETING)
}

@js.native
sealed trait UpdateDataRetentionOperation extends js.Any
object UpdateDataRetentionOperation {
  val INCREASE_DATA_RETENTION = "INCREASE_DATA_RETENTION".asInstanceOf[UpdateDataRetentionOperation]
  val DECREASE_DATA_RETENTION = "DECREASE_DATA_RETENTION".asInstanceOf[UpdateDataRetentionOperation]

  @inline def values = js.Array(INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION)
}

