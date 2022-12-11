package facade.amazonaws.services.kinesisvideo

import scalajs.js

type APIName = "PUT_MEDIA" | "GET_MEDIA" | "LIST_FRAGMENTS" | "GET_MEDIA_FOR_FRAGMENT_LIST" | "GET_HLS_STREAMING_SESSION_URL" | "GET_DASH_STREAMING_SESSION_URL" | "GET_CLIP" | "GET_IMAGES"
object APIName {
  inline val PUT_MEDIA: "PUT_MEDIA" = "PUT_MEDIA"
  inline val GET_MEDIA: "GET_MEDIA" = "GET_MEDIA"
  inline val LIST_FRAGMENTS: "LIST_FRAGMENTS" = "LIST_FRAGMENTS"
  inline val GET_MEDIA_FOR_FRAGMENT_LIST: "GET_MEDIA_FOR_FRAGMENT_LIST" = "GET_MEDIA_FOR_FRAGMENT_LIST"
  inline val GET_HLS_STREAMING_SESSION_URL: "GET_HLS_STREAMING_SESSION_URL" = "GET_HLS_STREAMING_SESSION_URL"
  inline val GET_DASH_STREAMING_SESSION_URL: "GET_DASH_STREAMING_SESSION_URL" = "GET_DASH_STREAMING_SESSION_URL"
  inline val GET_CLIP: "GET_CLIP" = "GET_CLIP"
  inline val GET_IMAGES: "GET_IMAGES" = "GET_IMAGES"

  inline def values: js.Array[APIName] = js.Array(PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS, GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL, GET_DASH_STREAMING_SESSION_URL, GET_CLIP, GET_IMAGES)
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

type ChannelType = "SINGLE_MASTER" | "FULL_MESH"
object ChannelType {
  inline val SINGLE_MASTER: "SINGLE_MASTER" = "SINGLE_MASTER"
  inline val FULL_MESH: "FULL_MESH" = "FULL_MESH"

  inline def values: js.Array[ChannelType] = js.Array(SINGLE_MASTER, FULL_MESH)
}

type ComparisonOperator = "BEGINS_WITH"
object ComparisonOperator {
  inline val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"

  inline def values: js.Array[ComparisonOperator] = js.Array(BEGINS_WITH)
}

type ConfigurationStatus = "ENABLED" | "DISABLED"
object ConfigurationStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ConfigurationStatus] = js.Array(ENABLED, DISABLED)
}

type Format = "JPEG" | "PNG"
object Format {
  inline val JPEG: "JPEG" = "JPEG"
  inline val PNG: "PNG" = "PNG"

  inline def values: js.Array[Format] = js.Array(JPEG, PNG)
}

type FormatConfigKey = "JPEGQuality"
object FormatConfigKey {
  inline val JPEGQuality: "JPEGQuality" = "JPEGQuality"

  inline def values: js.Array[FormatConfigKey] = js.Array(JPEGQuality)
}

type ImageSelectorType = "SERVER_TIMESTAMP" | "PRODUCER_TIMESTAMP"
object ImageSelectorType {
  inline val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"
  inline val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"

  inline def values: js.Array[ImageSelectorType] = js.Array(SERVER_TIMESTAMP, PRODUCER_TIMESTAMP)
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
