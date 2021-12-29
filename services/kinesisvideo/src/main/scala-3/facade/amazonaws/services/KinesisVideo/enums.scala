package facade.amazonaws.services.kinesisvideo

import scalajs._

type APIName = "PUT_MEDIA" | "GET_MEDIA" | "LIST_FRAGMENTS" | "GET_MEDIA_FOR_FRAGMENT_LIST" | "GET_HLS_STREAMING_SESSION_URL" | "GET_DASH_STREAMING_SESSION_URL" | "GET_CLIP"
object APIName {
  inline val PUT_MEDIA: "PUT_MEDIA" = "PUT_MEDIA"
  inline val GET_MEDIA: "GET_MEDIA" = "GET_MEDIA"
  inline val LIST_FRAGMENTS: "LIST_FRAGMENTS" = "LIST_FRAGMENTS"
  inline val GET_MEDIA_FOR_FRAGMENT_LIST: "GET_MEDIA_FOR_FRAGMENT_LIST" = "GET_MEDIA_FOR_FRAGMENT_LIST"
  inline val GET_HLS_STREAMING_SESSION_URL: "GET_HLS_STREAMING_SESSION_URL" = "GET_HLS_STREAMING_SESSION_URL"
  inline val GET_DASH_STREAMING_SESSION_URL: "GET_DASH_STREAMING_SESSION_URL" = "GET_DASH_STREAMING_SESSION_URL"
  inline val GET_CLIP: "GET_CLIP" = "GET_CLIP"

  inline def values: js.Array[APIName] = js.Array(PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS, GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL, GET_DASH_STREAMING_SESSION_URL, GET_CLIP)
}

type ChannelProtocol = "WSS" | "HTTPS"
object ChannelProtocol {
  inline val WSS: "WSS" = "WSS"
  inline val HTTPS: "HTTPS" = "HTTPS"

  inline def values: js.Array[ChannelProtocol] = js.Array(WSS, HTTPS)
}

type ChannelRole = "MASTER" | "VIEWER"
object ChannelRole {
  inline val MASTER: "MASTER" = "MASTER"
  inline val VIEWER: "VIEWER" = "VIEWER"

  inline def values: js.Array[ChannelRole] = js.Array(MASTER, VIEWER)
}

type ChannelType = "SINGLE_MASTER"
object ChannelType {
  inline val SINGLE_MASTER: "SINGLE_MASTER" = "SINGLE_MASTER"

  inline def values: js.Array[ChannelType] = js.Array(SINGLE_MASTER)
}

type ComparisonOperator = "BEGINS_WITH"
object ComparisonOperator {
  inline val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"

  inline def values: js.Array[ComparisonOperator] = js.Array(BEGINS_WITH)
}

type Status = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING"
object Status {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[Status] = js.Array(CREATING, ACTIVE, UPDATING, DELETING)
}

type UpdateDataRetentionOperation = "INCREASE_DATA_RETENTION" | "DECREASE_DATA_RETENTION"
object UpdateDataRetentionOperation {
  inline val INCREASE_DATA_RETENTION: "INCREASE_DATA_RETENTION" = "INCREASE_DATA_RETENTION"
  inline val DECREASE_DATA_RETENTION: "DECREASE_DATA_RETENTION" = "DECREASE_DATA_RETENTION"

  inline def values: js.Array[UpdateDataRetentionOperation] = js.Array(INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION)
}
