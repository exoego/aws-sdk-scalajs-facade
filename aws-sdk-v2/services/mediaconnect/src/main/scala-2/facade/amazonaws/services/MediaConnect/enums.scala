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
sealed trait Colorimetry extends js.Any
object Colorimetry {
  val BT601 = "BT601".asInstanceOf[Colorimetry]
  val BT709 = "BT709".asInstanceOf[Colorimetry]
  val BT2020 = "BT2020".asInstanceOf[Colorimetry]
  val BT2100 = "BT2100".asInstanceOf[Colorimetry]
  val `ST2065-1` = "ST2065-1".asInstanceOf[Colorimetry]
  val `ST2065-3` = "ST2065-3".asInstanceOf[Colorimetry]
  val XYZ = "XYZ".asInstanceOf[Colorimetry]

  @inline def values: js.Array[Colorimetry] = js.Array(BT601, BT709, BT2020, BT2100, `ST2065-1`, `ST2065-3`, XYZ)
}

@js.native
sealed trait DurationUnits extends js.Any
object DurationUnits {
  val MONTHS = "MONTHS".asInstanceOf[DurationUnits]

  @inline def values: js.Array[DurationUnits] = js.Array(MONTHS)
}

@js.native
sealed trait EncoderProfile extends js.Any
object EncoderProfile {
  val main = "main".asInstanceOf[EncoderProfile]
  val high = "high".asInstanceOf[EncoderProfile]

  @inline def values: js.Array[EncoderProfile] = js.Array(main, high)
}

@js.native
sealed trait EncodingName extends js.Any
object EncodingName {
  val jxsv = "jxsv".asInstanceOf[EncodingName]
  val raw = "raw".asInstanceOf[EncodingName]
  val smpte291 = "smpte291".asInstanceOf[EncodingName]
  val pcm = "pcm".asInstanceOf[EncodingName]

  @inline def values: js.Array[EncodingName] = js.Array(jxsv, raw, smpte291, pcm)
}

@js.native
sealed trait EntitlementStatus extends js.Any
object EntitlementStatus {
  val ENABLED = "ENABLED".asInstanceOf[EntitlementStatus]
  val DISABLED = "DISABLED".asInstanceOf[EntitlementStatus]

  @inline def values: js.Array[EntitlementStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait FailoverMode extends js.Any
object FailoverMode {
  val MERGE = "MERGE".asInstanceOf[FailoverMode]
  val FAILOVER = "FAILOVER".asInstanceOf[FailoverMode]

  @inline def values: js.Array[FailoverMode] = js.Array(MERGE, FAILOVER)
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
sealed trait MaintenanceDay extends js.Any
object MaintenanceDay {
  val Monday = "Monday".asInstanceOf[MaintenanceDay]
  val Tuesday = "Tuesday".asInstanceOf[MaintenanceDay]
  val Wednesday = "Wednesday".asInstanceOf[MaintenanceDay]
  val Thursday = "Thursday".asInstanceOf[MaintenanceDay]
  val Friday = "Friday".asInstanceOf[MaintenanceDay]
  val Saturday = "Saturday".asInstanceOf[MaintenanceDay]
  val Sunday = "Sunday".asInstanceOf[MaintenanceDay]

  @inline def values: js.Array[MaintenanceDay] = js.Array(Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
}

@js.native
sealed trait MediaStreamType extends js.Any
object MediaStreamType {
  val video = "video".asInstanceOf[MediaStreamType]
  val audio = "audio".asInstanceOf[MediaStreamType]
  val `ancillary-data` = "ancillary-data".asInstanceOf[MediaStreamType]

  @inline def values: js.Array[MediaStreamType] = js.Array(video, audio, `ancillary-data`)
}

@js.native
sealed trait NetworkInterfaceType extends js.Any
object NetworkInterfaceType {
  val ena = "ena".asInstanceOf[NetworkInterfaceType]
  val efa = "efa".asInstanceOf[NetworkInterfaceType]

  @inline def values: js.Array[NetworkInterfaceType] = js.Array(ena, efa)
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
  val `st2110-jpegxs` = "st2110-jpegxs".asInstanceOf[Protocol]
  val cdi = "cdi".asInstanceOf[Protocol]
  val `srt-listener` = "srt-listener".asInstanceOf[Protocol]
  val `srt-caller` = "srt-caller".asInstanceOf[Protocol]
  val `fujitsu-qos` = "fujitsu-qos".asInstanceOf[Protocol]

  @inline def values: js.Array[Protocol] = js.Array(`zixi-push`, `rtp-fec`, rtp, `zixi-pull`, rist, `st2110-jpegxs`, cdi, `srt-listener`, `srt-caller`, `fujitsu-qos`)
}

@js.native
sealed trait Range extends js.Any
object Range {
  val NARROW = "NARROW".asInstanceOf[Range]
  val FULL = "FULL".asInstanceOf[Range]
  val FULLPROTECT = "FULLPROTECT".asInstanceOf[Range]

  @inline def values: js.Array[Range] = js.Array(NARROW, FULL, FULLPROTECT)
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
sealed trait ScanMode extends js.Any
object ScanMode {
  val progressive = "progressive".asInstanceOf[ScanMode]
  val interlace = "interlace".asInstanceOf[ScanMode]
  val `progressive-segmented-frame` = "progressive-segmented-frame".asInstanceOf[ScanMode]

  @inline def values: js.Array[ScanMode] = js.Array(progressive, interlace, `progressive-segmented-frame`)
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

@js.native
sealed trait Tcs extends js.Any
object Tcs {
  val SDR = "SDR".asInstanceOf[Tcs]
  val PQ = "PQ".asInstanceOf[Tcs]
  val HLG = "HLG".asInstanceOf[Tcs]
  val LINEAR = "LINEAR".asInstanceOf[Tcs]
  val BT2100LINPQ = "BT2100LINPQ".asInstanceOf[Tcs]
  val BT2100LINHLG = "BT2100LINHLG".asInstanceOf[Tcs]
  val `ST2065-1` = "ST2065-1".asInstanceOf[Tcs]
  val `ST428-1` = "ST428-1".asInstanceOf[Tcs]
  val DENSITY = "DENSITY".asInstanceOf[Tcs]

  @inline def values: js.Array[Tcs] = js.Array(SDR, PQ, HLG, LINEAR, BT2100LINPQ, BT2100LINHLG, `ST2065-1`, `ST428-1`, DENSITY)
}
