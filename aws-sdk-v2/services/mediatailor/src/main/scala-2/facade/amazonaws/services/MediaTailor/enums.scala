package facade.amazonaws.services.mediatailor

import scalajs.js

@js.native
sealed trait AccessType extends js.Any
object AccessType {
  val S3_SIGV4 = "S3_SIGV4".asInstanceOf[AccessType]
  val SECRETS_MANAGER_ACCESS_TOKEN = "SECRETS_MANAGER_ACCESS_TOKEN".asInstanceOf[AccessType]

  @inline def values: js.Array[AccessType] = js.Array(S3_SIGV4, SECRETS_MANAGER_ACCESS_TOKEN)
}

@js.native
sealed trait ChannelState extends js.Any
object ChannelState {
  val RUNNING = "RUNNING".asInstanceOf[ChannelState]
  val STOPPED = "STOPPED".asInstanceOf[ChannelState]

  @inline def values: js.Array[ChannelState] = js.Array(RUNNING, STOPPED)
}

@js.native
sealed trait MessageType extends js.Any
object MessageType {
  val SPLICE_INSERT = "SPLICE_INSERT".asInstanceOf[MessageType]
  val TIME_SIGNAL = "TIME_SIGNAL".asInstanceOf[MessageType]

  @inline def values: js.Array[MessageType] = js.Array(SPLICE_INSERT, TIME_SIGNAL)
}

@js.native
sealed trait Mode extends js.Any
object Mode {
  val OFF = "OFF".asInstanceOf[Mode]
  val BEHIND_LIVE_EDGE = "BEHIND_LIVE_EDGE".asInstanceOf[Mode]

  @inline def values: js.Array[Mode] = js.Array(OFF, BEHIND_LIVE_EDGE)
}

@js.native
sealed trait Operator extends js.Any
object Operator {
  val EQUALS = "EQUALS".asInstanceOf[Operator]

  @inline def values: js.Array[Operator] = js.Array(EQUALS)
}

@js.native
sealed trait OriginManifestType extends js.Any
object OriginManifestType {
  val SINGLE_PERIOD = "SINGLE_PERIOD".asInstanceOf[OriginManifestType]
  val MULTI_PERIOD = "MULTI_PERIOD".asInstanceOf[OriginManifestType]

  @inline def values: js.Array[OriginManifestType] = js.Array(SINGLE_PERIOD, MULTI_PERIOD)
}

@js.native
sealed trait PlaybackMode extends js.Any
object PlaybackMode {
  val LOOP = "LOOP".asInstanceOf[PlaybackMode]
  val LINEAR = "LINEAR".asInstanceOf[PlaybackMode]

  @inline def values: js.Array[PlaybackMode] = js.Array(LOOP, LINEAR)
}

@js.native
sealed trait RelativePosition extends js.Any
object RelativePosition {
  val BEFORE_PROGRAM = "BEFORE_PROGRAM".asInstanceOf[RelativePosition]
  val AFTER_PROGRAM = "AFTER_PROGRAM".asInstanceOf[RelativePosition]

  @inline def values: js.Array[RelativePosition] = js.Array(BEFORE_PROGRAM, AFTER_PROGRAM)
}

@js.native
sealed trait ScheduleEntryType extends js.Any
object ScheduleEntryType {
  val PROGRAM = "PROGRAM".asInstanceOf[ScheduleEntryType]
  val FILLER_SLATE = "FILLER_SLATE".asInstanceOf[ScheduleEntryType]

  @inline def values: js.Array[ScheduleEntryType] = js.Array(PROGRAM, FILLER_SLATE)
}

@js.native
sealed trait Tier extends js.Any
object Tier {
  val BASIC = "BASIC".asInstanceOf[Tier]
  val STANDARD = "STANDARD".asInstanceOf[Tier]

  @inline def values: js.Array[Tier] = js.Array(BASIC, STANDARD)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val DASH = "DASH".asInstanceOf[Type]
  val HLS = "HLS".asInstanceOf[Type]

  @inline def values: js.Array[Type] = js.Array(DASH, HLS)
}
