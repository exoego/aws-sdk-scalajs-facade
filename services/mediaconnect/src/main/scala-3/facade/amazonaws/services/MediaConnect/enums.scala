package facade.amazonaws.services.mediaconnect

import scalajs.js

type Algorithm = "aes128" | "aes192" | "aes256"
object Algorithm {
  inline val aes128: "aes128" = "aes128"
  inline val aes192: "aes192" = "aes192"
  inline val aes256: "aes256" = "aes256"

  inline def values: js.Array[Algorithm] = js.Array(aes128, aes192, aes256)
}

type Colorimetry = "BT601" | "BT709" | "BT2020" | "BT2100" | "ST2065-1" | "ST2065-3" | "XYZ"
object Colorimetry {
  inline val BT601: "BT601" = "BT601"
  inline val BT709: "BT709" = "BT709"
  inline val BT2020: "BT2020" = "BT2020"
  inline val BT2100: "BT2100" = "BT2100"
  inline val `ST2065-1`: "ST2065-1" = "ST2065-1"
  inline val `ST2065-3`: "ST2065-3" = "ST2065-3"
  inline val XYZ: "XYZ" = "XYZ"

  inline def values: js.Array[Colorimetry] = js.Array(BT601, BT709, BT2020, BT2100, `ST2065-1`, `ST2065-3`, XYZ)
}

type DurationUnits = "MONTHS"
object DurationUnits {
  inline val MONTHS: "MONTHS" = "MONTHS"

  inline def values: js.Array[DurationUnits] = js.Array(MONTHS)
}

type EncoderProfile = "main" | "high"
object EncoderProfile {
  inline val main: "main" = "main"
  inline val high: "high" = "high"

  inline def values: js.Array[EncoderProfile] = js.Array(main, high)
}

type EncodingName = "jxsv" | "raw" | "smpte291" | "pcm"
object EncodingName {
  inline val jxsv: "jxsv" = "jxsv"
  inline val raw: "raw" = "raw"
  inline val smpte291: "smpte291" = "smpte291"
  inline val pcm: "pcm" = "pcm"

  inline def values: js.Array[EncodingName] = js.Array(jxsv, raw, smpte291, pcm)
}

type EntitlementStatus = "ENABLED" | "DISABLED"
object EntitlementStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EntitlementStatus] = js.Array(ENABLED, DISABLED)
}

type FailoverMode = "MERGE" | "FAILOVER"
object FailoverMode {
  inline val MERGE: "MERGE" = "MERGE"
  inline val FAILOVER: "FAILOVER" = "FAILOVER"

  inline def values: js.Array[FailoverMode] = js.Array(MERGE, FAILOVER)
}

type KeyType = "speke" | "static-key" | "srt-password"
object KeyType {
  inline val speke: "speke" = "speke"
  inline val `static-key`: "static-key" = "static-key"
  inline val `srt-password`: "srt-password" = "srt-password"

  inline def values: js.Array[KeyType] = js.Array(speke, `static-key`, `srt-password`)
}

type MediaStreamType = "video" | "audio" | "ancillary-data"
object MediaStreamType {
  inline val video: "video" = "video"
  inline val audio: "audio" = "audio"
  inline val `ancillary-data`: "ancillary-data" = "ancillary-data"

  inline def values: js.Array[MediaStreamType] = js.Array(video, audio, `ancillary-data`)
}

type NetworkInterfaceType = "ena" | "efa"
object NetworkInterfaceType {
  inline val ena: "ena" = "ena"
  inline val efa: "efa" = "efa"

  inline def values: js.Array[NetworkInterfaceType] = js.Array(ena, efa)
}

type PriceUnits = "HOURLY"
object PriceUnits {
  inline val HOURLY: "HOURLY" = "HOURLY"

  inline def values: js.Array[PriceUnits] = js.Array(HOURLY)
}

type Protocol = "zixi-push" | "rtp-fec" | "rtp" | "zixi-pull" | "rist" | "st2110-jpegxs" | "cdi" | "srt-listener" | "fujitsu-qos"
object Protocol {
  inline val `zixi-push`: "zixi-push" = "zixi-push"
  inline val `rtp-fec`: "rtp-fec" = "rtp-fec"
  inline val rtp: "rtp" = "rtp"
  inline val `zixi-pull`: "zixi-pull" = "zixi-pull"
  inline val rist: "rist" = "rist"
  inline val `st2110-jpegxs`: "st2110-jpegxs" = "st2110-jpegxs"
  inline val cdi: "cdi" = "cdi"
  inline val `srt-listener`: "srt-listener" = "srt-listener"
  inline val `fujitsu-qos`: "fujitsu-qos" = "fujitsu-qos"

  inline def values: js.Array[Protocol] = js.Array(`zixi-push`, `rtp-fec`, rtp, `zixi-pull`, rist, `st2110-jpegxs`, cdi, `srt-listener`, `fujitsu-qos`)
}

type Range = "NARROW" | "FULL" | "FULLPROTECT"
object Range {
  inline val NARROW: "NARROW" = "NARROW"
  inline val FULL: "FULL" = "FULL"
  inline val FULLPROTECT: "FULLPROTECT" = "FULLPROTECT"

  inline def values: js.Array[Range] = js.Array(NARROW, FULL, FULLPROTECT)
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

type ScanMode = "progressive" | "interlace" | "progressive-segmented-frame"
object ScanMode {
  inline val progressive: "progressive" = "progressive"
  inline val interlace: "interlace" = "interlace"
  inline val `progressive-segmented-frame`: "progressive-segmented-frame" = "progressive-segmented-frame"

  inline def values: js.Array[ScanMode] = js.Array(progressive, interlace, `progressive-segmented-frame`)
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

type Tcs = "SDR" | "PQ" | "HLG" | "LINEAR" | "BT2100LINPQ" | "BT2100LINHLG" | "ST2065-1" | "ST428-1" | "DENSITY"
object Tcs {
  inline val SDR: "SDR" = "SDR"
  inline val PQ: "PQ" = "PQ"
  inline val HLG: "HLG" = "HLG"
  inline val LINEAR: "LINEAR" = "LINEAR"
  inline val BT2100LINPQ: "BT2100LINPQ" = "BT2100LINPQ"
  inline val BT2100LINHLG: "BT2100LINHLG" = "BT2100LINHLG"
  inline val `ST2065-1`: "ST2065-1" = "ST2065-1"
  inline val `ST428-1`: "ST428-1" = "ST428-1"
  inline val DENSITY: "DENSITY" = "DENSITY"

  inline def values: js.Array[Tcs] = js.Array(SDR, PQ, HLG, LINEAR, BT2100LINPQ, BT2100LINHLG, `ST2065-1`, `ST428-1`, DENSITY)
}
