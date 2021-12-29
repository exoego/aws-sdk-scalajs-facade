package facade.amazonaws.services.mediaconnect

import scalajs._

type Algorithm = "aes128" | "aes192" | "aes256"
object Algorithm {
  inline val aes128: "aes128" = "aes128"
  inline val aes192: "aes192" = "aes192"
  inline val aes256: "aes256" = "aes256"

  inline def values: js.Array[Algorithm] = js.Array(aes128, aes192, aes256)
}

type DurationUnits = "MONTHS"
object DurationUnits {
  inline val MONTHS: "MONTHS" = "MONTHS"

  inline def values: js.Array[DurationUnits] = js.Array(MONTHS)
}

type EntitlementStatus = "ENABLED" | "DISABLED"
object EntitlementStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EntitlementStatus] = js.Array(ENABLED, DISABLED)
}

type KeyType = "speke" | "static-key" | "srt-password"
object KeyType {
  inline val speke: "speke" = "speke"
  inline val `static-key`: "static-key" = "static-key"
  inline val `srt-password`: "srt-password" = "srt-password"

  inline def values: js.Array[KeyType] = js.Array(speke, `static-key`, `srt-password`)
}

type PriceUnits = "HOURLY"
object PriceUnits {
  inline val HOURLY: "HOURLY" = "HOURLY"

  inline def values: js.Array[PriceUnits] = js.Array(HOURLY)
}

type Protocol = "zixi-push" | "rtp-fec" | "rtp" | "zixi-pull" | "rist" | "srt-listener"
object Protocol {
  inline val `zixi-push`: "zixi-push" = "zixi-push"
  inline val `rtp-fec`: "rtp-fec" = "rtp-fec"
  inline val rtp: "rtp" = "rtp"
  inline val `zixi-pull`: "zixi-pull" = "zixi-pull"
  inline val rist: "rist" = "rist"
  inline val `srt-listener`: "srt-listener" = "srt-listener"

  inline def values: js.Array[Protocol] = js.Array(`zixi-push`, `rtp-fec`, rtp, `zixi-pull`, rist, `srt-listener`)
}

type ReservationState = "ACTIVE" | "EXPIRED" | "PROCESSING" | "CANCELED"
object ReservationState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[ReservationState] = js.Array(ACTIVE, EXPIRED, PROCESSING, CANCELED)
}

type ResourceType = "Mbps_Outbound_Bandwidth"
object ResourceType {
  inline val Mbps_Outbound_Bandwidth: "Mbps_Outbound_Bandwidth" = "Mbps_Outbound_Bandwidth"

  inline def values: js.Array[ResourceType] = js.Array(Mbps_Outbound_Bandwidth)
}

type SourceType = "OWNED" | "ENTITLED"
object SourceType {
  inline val OWNED: "OWNED" = "OWNED"
  inline val ENTITLED: "ENTITLED" = "ENTITLED"

  inline def values: js.Array[SourceType] = js.Array(OWNED, ENTITLED)
}

type State = "ENABLED" | "DISABLED"
object State {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[State] = js.Array(ENABLED, DISABLED)
}

type Status = "STANDBY" | "ACTIVE" | "UPDATING" | "DELETING" | "STARTING" | "STOPPING" | "ERROR"
object Status {
  inline val STANDBY: "STANDBY" = "STANDBY"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[Status] = js.Array(STANDBY, ACTIVE, UPDATING, DELETING, STARTING, STOPPING, ERROR)
}
