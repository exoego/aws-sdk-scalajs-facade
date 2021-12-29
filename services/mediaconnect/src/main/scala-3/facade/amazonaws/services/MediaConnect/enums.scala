package facade.amazonaws.services.mediaconnect

import scalajs._

type Algorithm = "aes128" | "aes192" | "aes256"
object Algorithm {
  val aes128: "aes128" = "aes128"
  val aes192: "aes192" = "aes192"
  val aes256: "aes256" = "aes256"

  @inline def values = js.Array[Algorithm](aes128, aes192, aes256)
}

type DurationUnits = "MONTHS"
object DurationUnits {
  val MONTHS: "MONTHS" = "MONTHS"

  @inline def values = js.Array[DurationUnits](MONTHS)
}

type EntitlementStatus = "ENABLED" | "DISABLED"
object EntitlementStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[EntitlementStatus](ENABLED, DISABLED)
}

type KeyType = "speke" | "static-key" | "srt-password"
object KeyType {
  val speke: "speke" = "speke"
  val `static-key`: "static-key" = "static-key"
  val `srt-password`: "srt-password" = "srt-password"

  @inline def values = js.Array[KeyType](speke, `static-key`, `srt-password`)
}

type PriceUnits = "HOURLY"
object PriceUnits {
  val HOURLY: "HOURLY" = "HOURLY"

  @inline def values = js.Array[PriceUnits](HOURLY)
}

type Protocol = "zixi-push" | "rtp-fec" | "rtp" | "zixi-pull" | "rist" | "srt-listener"
object Protocol {
  val `zixi-push`: "zixi-push" = "zixi-push"
  val `rtp-fec`: "rtp-fec" = "rtp-fec"
  val rtp: "rtp" = "rtp"
  val `zixi-pull`: "zixi-pull" = "zixi-pull"
  val rist: "rist" = "rist"
  val `srt-listener`: "srt-listener" = "srt-listener"

  @inline def values = js.Array[Protocol](`zixi-push`, `rtp-fec`, rtp, `zixi-pull`, rist, `srt-listener`)
}

type ReservationState = "ACTIVE" | "EXPIRED" | "PROCESSING" | "CANCELED"
object ReservationState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val EXPIRED: "EXPIRED" = "EXPIRED"
  val PROCESSING: "PROCESSING" = "PROCESSING"
  val CANCELED: "CANCELED" = "CANCELED"

  @inline def values = js.Array[ReservationState](ACTIVE, EXPIRED, PROCESSING, CANCELED)
}

type ResourceType = "Mbps_Outbound_Bandwidth"
object ResourceType {
  val Mbps_Outbound_Bandwidth: "Mbps_Outbound_Bandwidth" = "Mbps_Outbound_Bandwidth"

  @inline def values = js.Array[ResourceType](Mbps_Outbound_Bandwidth)
}

type SourceType = "OWNED" | "ENTITLED"
object SourceType {
  val OWNED: "OWNED" = "OWNED"
  val ENTITLED: "ENTITLED" = "ENTITLED"

  @inline def values = js.Array[SourceType](OWNED, ENTITLED)
}

type State = "ENABLED" | "DISABLED"
object State {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[State](ENABLED, DISABLED)
}

type Status = "STANDBY" | "ACTIVE" | "UPDATING" | "DELETING" | "STARTING" | "STOPPING" | "ERROR"
object Status {
  val STANDBY: "STANDBY" = "STANDBY"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val STARTING: "STARTING" = "STARTING"
  val STOPPING: "STOPPING" = "STOPPING"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[Status](STANDBY, ACTIVE, UPDATING, DELETING, STARTING, STOPPING, ERROR)
}
