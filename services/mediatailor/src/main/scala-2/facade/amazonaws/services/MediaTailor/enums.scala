package facade.amazonaws.services.mediatailor

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AccessType extends js.Any
object AccessType {
  val S3_SIGV4 = "S3_SIGV4".asInstanceOf[AccessType]

  @inline def values = js.Array(S3_SIGV4)
}

@js.native
sealed trait ChannelState extends js.Any
object ChannelState {
  val RUNNING = "RUNNING".asInstanceOf[ChannelState]
  val STOPPED = "STOPPED".asInstanceOf[ChannelState]

  @inline def values = js.Array(RUNNING, STOPPED)
}

@js.native
sealed trait MessageType extends js.Any
object MessageType {
  val SPLICE_INSERT = "SPLICE_INSERT".asInstanceOf[MessageType]

  @inline def values = js.Array(SPLICE_INSERT)
}

@js.native
sealed trait Mode extends js.Any
object Mode {
  val OFF = "OFF".asInstanceOf[Mode]
  val BEHIND_LIVE_EDGE = "BEHIND_LIVE_EDGE".asInstanceOf[Mode]

  @inline def values = js.Array(OFF, BEHIND_LIVE_EDGE)
}

@js.native
sealed trait OriginManifestType extends js.Any
object OriginManifestType {
  val SINGLE_PERIOD = "SINGLE_PERIOD".asInstanceOf[OriginManifestType]
  val MULTI_PERIOD = "MULTI_PERIOD".asInstanceOf[OriginManifestType]

  @inline def values = js.Array(SINGLE_PERIOD, MULTI_PERIOD)
}

@js.native
sealed trait PlaybackMode extends js.Any
object PlaybackMode {
  val LOOP = "LOOP".asInstanceOf[PlaybackMode]

  @inline def values = js.Array(LOOP)
}

@js.native
sealed trait RelativePosition extends js.Any
object RelativePosition {
  val BEFORE_PROGRAM = "BEFORE_PROGRAM".asInstanceOf[RelativePosition]
  val AFTER_PROGRAM = "AFTER_PROGRAM".asInstanceOf[RelativePosition]

  @inline def values = js.Array(BEFORE_PROGRAM, AFTER_PROGRAM)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val DASH = "DASH".asInstanceOf[Type]
  val HLS = "HLS".asInstanceOf[Type]

  @inline def values = js.Array(DASH, HLS)
}
