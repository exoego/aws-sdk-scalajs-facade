package facade.amazonaws.services.mediatailor

import scalajs._

type AccessType = "S3_SIGV4"
object AccessType {
  val S3_SIGV4: "S3_SIGV4" = "S3_SIGV4"

  @inline def values = js.Array[AccessType](S3_SIGV4)
}

type ChannelState = "RUNNING" | "STOPPED"
object ChannelState {
  val RUNNING: "RUNNING" = "RUNNING"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[ChannelState](RUNNING, STOPPED)
}

type MessageType = "SPLICE_INSERT"
object MessageType {
  val SPLICE_INSERT: "SPLICE_INSERT" = "SPLICE_INSERT"

  @inline def values = js.Array[MessageType](SPLICE_INSERT)
}

type Mode = "OFF" | "BEHIND_LIVE_EDGE"
object Mode {
  val OFF: "OFF" = "OFF"
  val BEHIND_LIVE_EDGE: "BEHIND_LIVE_EDGE" = "BEHIND_LIVE_EDGE"

  @inline def values = js.Array[Mode](OFF, BEHIND_LIVE_EDGE)
}

type OriginManifestType = "SINGLE_PERIOD" | "MULTI_PERIOD"
object OriginManifestType {
  val SINGLE_PERIOD: "SINGLE_PERIOD" = "SINGLE_PERIOD"
  val MULTI_PERIOD: "MULTI_PERIOD" = "MULTI_PERIOD"

  @inline def values = js.Array[OriginManifestType](SINGLE_PERIOD, MULTI_PERIOD)
}

type PlaybackMode = "LOOP"
object PlaybackMode {
  val LOOP: "LOOP" = "LOOP"

  @inline def values = js.Array[PlaybackMode](LOOP)
}

type RelativePosition = "BEFORE_PROGRAM" | "AFTER_PROGRAM"
object RelativePosition {
  val BEFORE_PROGRAM: "BEFORE_PROGRAM" = "BEFORE_PROGRAM"
  val AFTER_PROGRAM: "AFTER_PROGRAM" = "AFTER_PROGRAM"

  @inline def values = js.Array[RelativePosition](BEFORE_PROGRAM, AFTER_PROGRAM)
}

type Type = "DASH" | "HLS"
object Type {
  val DASH: "DASH" = "DASH"
  val HLS: "HLS" = "HLS"

  @inline def values = js.Array[Type](DASH, HLS)
}
