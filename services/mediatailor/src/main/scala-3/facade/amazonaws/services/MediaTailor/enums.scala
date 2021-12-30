package facade.amazonaws.services.mediatailor

import scalajs.js

type AccessType = "S3_SIGV4"
object AccessType {
  inline val S3_SIGV4: "S3_SIGV4" = "S3_SIGV4"

  inline def values: js.Array[AccessType] = js.Array(S3_SIGV4)
}

type ChannelState = "RUNNING" | "STOPPED"
object ChannelState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[ChannelState] = js.Array(RUNNING, STOPPED)
}

type MessageType = "SPLICE_INSERT"
object MessageType {
  inline val SPLICE_INSERT: "SPLICE_INSERT" = "SPLICE_INSERT"

  inline def values: js.Array[MessageType] = js.Array(SPLICE_INSERT)
}

type Mode = "OFF" | "BEHIND_LIVE_EDGE"
object Mode {
  inline val OFF: "OFF" = "OFF"
  inline val BEHIND_LIVE_EDGE: "BEHIND_LIVE_EDGE" = "BEHIND_LIVE_EDGE"

  inline def values: js.Array[Mode] = js.Array(OFF, BEHIND_LIVE_EDGE)
}

type OriginManifestType = "SINGLE_PERIOD" | "MULTI_PERIOD"
object OriginManifestType {
  inline val SINGLE_PERIOD: "SINGLE_PERIOD" = "SINGLE_PERIOD"
  inline val MULTI_PERIOD: "MULTI_PERIOD" = "MULTI_PERIOD"

  inline def values: js.Array[OriginManifestType] = js.Array(SINGLE_PERIOD, MULTI_PERIOD)
}

type PlaybackMode = "LOOP"
object PlaybackMode {
  inline val LOOP: "LOOP" = "LOOP"

  inline def values: js.Array[PlaybackMode] = js.Array(LOOP)
}

type RelativePosition = "BEFORE_PROGRAM" | "AFTER_PROGRAM"
object RelativePosition {
  inline val BEFORE_PROGRAM: "BEFORE_PROGRAM" = "BEFORE_PROGRAM"
  inline val AFTER_PROGRAM: "AFTER_PROGRAM" = "AFTER_PROGRAM"

  inline def values: js.Array[RelativePosition] = js.Array(BEFORE_PROGRAM, AFTER_PROGRAM)
}

type Type = "DASH" | "HLS"
object Type {
  inline val DASH: "DASH" = "DASH"
  inline val HLS: "HLS" = "HLS"

  inline def values: js.Array[Type] = js.Array(DASH, HLS)
}
