package facade.amazonaws.services.mediatailor

import scalajs.js

type AccessType = "S3_SIGV4" | "SECRETS_MANAGER_ACCESS_TOKEN"
object AccessType {
  inline val S3_SIGV4: "S3_SIGV4" = "S3_SIGV4"
  inline val SECRETS_MANAGER_ACCESS_TOKEN: "SECRETS_MANAGER_ACCESS_TOKEN" = "SECRETS_MANAGER_ACCESS_TOKEN"

  inline def values: js.Array[AccessType] = js.Array(S3_SIGV4, SECRETS_MANAGER_ACCESS_TOKEN)
}

type ChannelState = "RUNNING" | "STOPPED"
object ChannelState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[ChannelState] = js.Array(RUNNING, STOPPED)
}

type MessageType = "SPLICE_INSERT" | "TIME_SIGNAL"
object MessageType {
  inline val SPLICE_INSERT: "SPLICE_INSERT" = "SPLICE_INSERT"
  inline val TIME_SIGNAL: "TIME_SIGNAL" = "TIME_SIGNAL"

  inline def values: js.Array[MessageType] = js.Array(SPLICE_INSERT, TIME_SIGNAL)
}

type Mode = "OFF" | "BEHIND_LIVE_EDGE"
object Mode {
  inline val OFF: "OFF" = "OFF"
  inline val BEHIND_LIVE_EDGE: "BEHIND_LIVE_EDGE" = "BEHIND_LIVE_EDGE"

  inline def values: js.Array[Mode] = js.Array(OFF, BEHIND_LIVE_EDGE)
}

type Operator = "EQUALS"
object Operator {
  inline val EQUALS: "EQUALS" = "EQUALS"

  inline def values: js.Array[Operator] = js.Array(EQUALS)
}

type OriginManifestType = "SINGLE_PERIOD" | "MULTI_PERIOD"
object OriginManifestType {
  inline val SINGLE_PERIOD: "SINGLE_PERIOD" = "SINGLE_PERIOD"
  inline val MULTI_PERIOD: "MULTI_PERIOD" = "MULTI_PERIOD"

  inline def values: js.Array[OriginManifestType] = js.Array(SINGLE_PERIOD, MULTI_PERIOD)
}

type PlaybackMode = "LOOP" | "LINEAR"
object PlaybackMode {
  inline val LOOP: "LOOP" = "LOOP"
  inline val LINEAR: "LINEAR" = "LINEAR"

  inline def values: js.Array[PlaybackMode] = js.Array(LOOP, LINEAR)
}

type RelativePosition = "BEFORE_PROGRAM" | "AFTER_PROGRAM"
object RelativePosition {
  inline val BEFORE_PROGRAM: "BEFORE_PROGRAM" = "BEFORE_PROGRAM"
  inline val AFTER_PROGRAM: "AFTER_PROGRAM" = "AFTER_PROGRAM"

  inline def values: js.Array[RelativePosition] = js.Array(BEFORE_PROGRAM, AFTER_PROGRAM)
}

type ScheduleEntryType = "PROGRAM" | "FILLER_SLATE"
object ScheduleEntryType {
  inline val PROGRAM: "PROGRAM" = "PROGRAM"
  inline val FILLER_SLATE: "FILLER_SLATE" = "FILLER_SLATE"

  inline def values: js.Array[ScheduleEntryType] = js.Array(PROGRAM, FILLER_SLATE)
}

type Tier = "BASIC" | "STANDARD"
object Tier {
  inline val BASIC: "BASIC" = "BASIC"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[Tier] = js.Array(BASIC, STANDARD)
}

type Type = "DASH" | "HLS"
object Type {
  inline val DASH: "DASH" = "DASH"
  inline val HLS: "HLS" = "HLS"

  inline def values: js.Array[Type] = js.Array(DASH, HLS)
}
