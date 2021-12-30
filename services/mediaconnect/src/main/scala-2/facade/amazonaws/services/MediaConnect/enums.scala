package facade.amazonaws.services.mediaconnect

import scalajs.js

@js.native
sealed trait Algorithm extends js.Any
object Algorithm {
  val aes128 = "aes128".asInstanceOf[Algorithm]
  val aes192 = "aes192".asInstanceOf[Algorithm]
  val aes256 = "aes256".asInstanceOf[Algorithm]

  @inline def values: js.Array[Algorithm] = js.Array(aes128, aes192, aes256)
}

@js.native
sealed trait DurationUnits extends js.Any
object DurationUnits {
  val MONTHS = "MONTHS".asInstanceOf[DurationUnits]

  @inline def values: js.Array[DurationUnits] = js.Array(MONTHS)
}

@js.native
sealed trait EntitlementStatus extends js.Any
object EntitlementStatus {
  val ENABLED = "ENABLED".asInstanceOf[EntitlementStatus]
  val DISABLED = "DISABLED".asInstanceOf[EntitlementStatus]

  @inline def values: js.Array[EntitlementStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait KeyType extends js.Any
object KeyType {
  val speke = "speke".asInstanceOf[KeyType]
  val `static-key` = "static-key".asInstanceOf[KeyType]
  val `srt-password` = "srt-password".asInstanceOf[KeyType]

  @inline def values: js.Array[KeyType] = js.Array(speke, `static-key`, `srt-password`)
}

@js.native
sealed trait PriceUnits extends js.Any
object PriceUnits {
  val HOURLY = "HOURLY".asInstanceOf[PriceUnits]

  @inline def values: js.Array[PriceUnits] = js.Array(HOURLY)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val `zixi-push` = "zixi-push".asInstanceOf[Protocol]
  val `rtp-fec` = "rtp-fec".asInstanceOf[Protocol]
  val rtp = "rtp".asInstanceOf[Protocol]
  val `zixi-pull` = "zixi-pull".asInstanceOf[Protocol]
  val rist = "rist".asInstanceOf[Protocol]
  val `srt-listener` = "srt-listener".asInstanceOf[Protocol]

  @inline def values: js.Array[Protocol] = js.Array(`zixi-push`, `rtp-fec`, rtp, `zixi-pull`, rist, `srt-listener`)
}

@js.native
sealed trait ReservationState extends js.Any
object ReservationState {
  val ACTIVE = "ACTIVE".asInstanceOf[ReservationState]
  val EXPIRED = "EXPIRED".asInstanceOf[ReservationState]
  val PROCESSING = "PROCESSING".asInstanceOf[ReservationState]
  val CANCELED = "CANCELED".asInstanceOf[ReservationState]

  @inline def values: js.Array[ReservationState] = js.Array(ACTIVE, EXPIRED, PROCESSING, CANCELED)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val Mbps_Outbound_Bandwidth = "Mbps_Outbound_Bandwidth".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(Mbps_Outbound_Bandwidth)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val OWNED = "OWNED".asInstanceOf[SourceType]
  val ENTITLED = "ENTITLED".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(OWNED, ENTITLED)
}

@js.native
sealed trait State extends js.Any
object State {
  val ENABLED = "ENABLED".asInstanceOf[State]
  val DISABLED = "DISABLED".asInstanceOf[State]

  @inline def values: js.Array[State] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val STANDBY = "STANDBY".asInstanceOf[Status]
  val ACTIVE = "ACTIVE".asInstanceOf[Status]
  val UPDATING = "UPDATING".asInstanceOf[Status]
  val DELETING = "DELETING".asInstanceOf[Status]
  val STARTING = "STARTING".asInstanceOf[Status]
  val STOPPING = "STOPPING".asInstanceOf[Status]
  val ERROR = "ERROR".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(STANDBY, ACTIVE, UPDATING, DELETING, STARTING, STOPPING, ERROR)
}
