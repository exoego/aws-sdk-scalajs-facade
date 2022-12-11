package facade.amazonaws.services.kinesisvideo

import scalajs.js

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
  val GET_IMAGES = "GET_IMAGES".asInstanceOf[APIName]

  @inline def values: js.Array[APIName] = js.Array(PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS, GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL, GET_DASH_STREAMING_SESSION_URL, GET_CLIP, GET_IMAGES)
}

@js.native
sealed trait ChannelProtocol extends js.Any
object ChannelProtocol {
  val WSS = "WSS".asInstanceOf[ChannelProtocol]
  val HTTPS = "HTTPS".asInstanceOf[ChannelProtocol]

  @inline def values: js.Array[ChannelProtocol] = js.Array(WSS, HTTPS)
}

@js.native
sealed trait ChannelRole extends js.Any
object ChannelRole {
  val MASTER = "MASTER".asInstanceOf[ChannelRole]
  val VIEWER = "VIEWER".asInstanceOf[ChannelRole]

  @inline def values: js.Array[ChannelRole] = js.Array(MASTER, VIEWER)
}

@js.native
sealed trait ChannelType extends js.Any
object ChannelType {
  val SINGLE_MASTER = "SINGLE_MASTER".asInstanceOf[ChannelType]
  val FULL_MESH = "FULL_MESH".asInstanceOf[ChannelType]

  @inline def values: js.Array[ChannelType] = js.Array(SINGLE_MASTER, FULL_MESH)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(BEGINS_WITH)
}

@js.native
sealed trait ConfigurationStatus extends js.Any
object ConfigurationStatus {
  val ENABLED = "ENABLED".asInstanceOf[ConfigurationStatus]
  val DISABLED = "DISABLED".asInstanceOf[ConfigurationStatus]

  @inline def values: js.Array[ConfigurationStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait Format extends js.Any
object Format {
  val JPEG = "JPEG".asInstanceOf[Format]
  val PNG = "PNG".asInstanceOf[Format]

  @inline def values: js.Array[Format] = js.Array(JPEG, PNG)
}

@js.native
sealed trait FormatConfigKey extends js.Any
object FormatConfigKey {
  val JPEGQuality = "JPEGQuality".asInstanceOf[FormatConfigKey]

  @inline def values: js.Array[FormatConfigKey] = js.Array(JPEGQuality)
}

@js.native
sealed trait ImageSelectorType extends js.Any
object ImageSelectorType {
  val SERVER_TIMESTAMP = "SERVER_TIMESTAMP".asInstanceOf[ImageSelectorType]
  val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[ImageSelectorType]

  @inline def values: js.Array[ImageSelectorType] = js.Array(SERVER_TIMESTAMP, PRODUCER_TIMESTAMP)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val CREATING = "CREATING".asInstanceOf[Status]
  val ACTIVE = "ACTIVE".asInstanceOf[Status]
  val UPDATING = "UPDATING".asInstanceOf[Status]
  val DELETING = "DELETING".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(CREATING, ACTIVE, UPDATING, DELETING)
}

@js.native
sealed trait UpdateDataRetentionOperation extends js.Any
object UpdateDataRetentionOperation {
  val INCREASE_DATA_RETENTION = "INCREASE_DATA_RETENTION".asInstanceOf[UpdateDataRetentionOperation]
  val DECREASE_DATA_RETENTION = "DECREASE_DATA_RETENTION".asInstanceOf[UpdateDataRetentionOperation]

  @inline def values: js.Array[UpdateDataRetentionOperation] = js.Array(INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION)
}
