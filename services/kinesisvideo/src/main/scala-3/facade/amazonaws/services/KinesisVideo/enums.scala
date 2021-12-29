package facade.amazonaws.services.kinesisvideo

import scalajs._

type APIName = "PUT_MEDIA" | "GET_MEDIA" | "LIST_FRAGMENTS" | "GET_MEDIA_FOR_FRAGMENT_LIST" | "GET_HLS_STREAMING_SESSION_URL" | "GET_DASH_STREAMING_SESSION_URL" | "GET_CLIP"
object APIName {
  val PUT_MEDIA: "PUT_MEDIA" = "PUT_MEDIA"
  val GET_MEDIA: "GET_MEDIA" = "GET_MEDIA"
  val LIST_FRAGMENTS: "LIST_FRAGMENTS" = "LIST_FRAGMENTS"
  val GET_MEDIA_FOR_FRAGMENT_LIST: "GET_MEDIA_FOR_FRAGMENT_LIST" = "GET_MEDIA_FOR_FRAGMENT_LIST"
  val GET_HLS_STREAMING_SESSION_URL: "GET_HLS_STREAMING_SESSION_URL" = "GET_HLS_STREAMING_SESSION_URL"
  val GET_DASH_STREAMING_SESSION_URL: "GET_DASH_STREAMING_SESSION_URL" = "GET_DASH_STREAMING_SESSION_URL"
  val GET_CLIP: "GET_CLIP" = "GET_CLIP"

  @inline def values = js.Array[APIName](PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS, GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL, GET_DASH_STREAMING_SESSION_URL, GET_CLIP)
}

type ChannelProtocol = "WSS" | "HTTPS"
object ChannelProtocol {
  val WSS: "WSS" = "WSS"
  val HTTPS: "HTTPS" = "HTTPS"

  @inline def values = js.Array[ChannelProtocol](WSS, HTTPS)
}

type ChannelRole = "MASTER" | "VIEWER"
object ChannelRole {
  val MASTER: "MASTER" = "MASTER"
  val VIEWER: "VIEWER" = "VIEWER"

  @inline def values = js.Array[ChannelRole](MASTER, VIEWER)
}

type ChannelType = "SINGLE_MASTER"
object ChannelType {
  val SINGLE_MASTER: "SINGLE_MASTER" = "SINGLE_MASTER"

  @inline def values = js.Array[ChannelType](SINGLE_MASTER)
}

type ComparisonOperator = "BEGINS_WITH"
object ComparisonOperator {
  val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"

  @inline def values = js.Array[ComparisonOperator](BEGINS_WITH)
}

type Status = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING"
object Status {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[Status](CREATING, ACTIVE, UPDATING, DELETING)
}

type UpdateDataRetentionOperation = "INCREASE_DATA_RETENTION" | "DECREASE_DATA_RETENTION"
object UpdateDataRetentionOperation {
  val INCREASE_DATA_RETENTION: "INCREASE_DATA_RETENTION" = "INCREASE_DATA_RETENTION"
  val DECREASE_DATA_RETENTION: "DECREASE_DATA_RETENTION" = "DECREASE_DATA_RETENTION"

  @inline def values = js.Array[UpdateDataRetentionOperation](INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION)
}
