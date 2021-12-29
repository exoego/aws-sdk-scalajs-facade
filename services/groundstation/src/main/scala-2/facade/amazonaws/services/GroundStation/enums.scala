package facade.amazonaws.services.groundstation

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AngleUnits extends js.Any
object AngleUnits {
  val DEGREE_ANGLE = "DEGREE_ANGLE".asInstanceOf[AngleUnits]
  val RADIAN = "RADIAN".asInstanceOf[AngleUnits]

  @inline def values = js.Array(DEGREE_ANGLE, RADIAN)
}

@js.native
sealed trait BandwidthUnits extends js.Any
object BandwidthUnits {
  val GHz = "GHz".asInstanceOf[BandwidthUnits]
  val MHz = "MHz".asInstanceOf[BandwidthUnits]
  val kHz = "kHz".asInstanceOf[BandwidthUnits]

  @inline def values = js.Array(GHz, MHz, kHz)
}

@js.native
sealed trait ConfigCapabilityType extends js.Any
object ConfigCapabilityType {
  val `antenna-downlink` = "antenna-downlink".asInstanceOf[ConfigCapabilityType]
  val `antenna-downlink-demod-decode` = "antenna-downlink-demod-decode".asInstanceOf[ConfigCapabilityType]
  val `antenna-uplink` = "antenna-uplink".asInstanceOf[ConfigCapabilityType]
  val `dataflow-endpoint` = "dataflow-endpoint".asInstanceOf[ConfigCapabilityType]
  val tracking = "tracking".asInstanceOf[ConfigCapabilityType]
  val `uplink-echo` = "uplink-echo".asInstanceOf[ConfigCapabilityType]
  val `s3-recording` = "s3-recording".asInstanceOf[ConfigCapabilityType]

  @inline def values = js.Array(`antenna-downlink`, `antenna-downlink-demod-decode`, `antenna-uplink`, `dataflow-endpoint`, tracking, `uplink-echo`, `s3-recording`)
}

@js.native
sealed trait ContactStatus extends js.Any
object ContactStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[ContactStatus]
  val AWS_CANCELLED = "AWS_CANCELLED".asInstanceOf[ContactStatus]
  val AWS_FAILED = "AWS_FAILED".asInstanceOf[ContactStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ContactStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[ContactStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ContactStatus]
  val FAILED = "FAILED".asInstanceOf[ContactStatus]
  val FAILED_TO_SCHEDULE = "FAILED_TO_SCHEDULE".asInstanceOf[ContactStatus]
  val PASS = "PASS".asInstanceOf[ContactStatus]
  val POSTPASS = "POSTPASS".asInstanceOf[ContactStatus]
  val PREPASS = "PREPASS".asInstanceOf[ContactStatus]
  val SCHEDULED = "SCHEDULED".asInstanceOf[ContactStatus]
  val SCHEDULING = "SCHEDULING".asInstanceOf[ContactStatus]

  @inline def values = js.Array(AVAILABLE, AWS_CANCELLED, AWS_FAILED, CANCELLED, CANCELLING, COMPLETED, FAILED, FAILED_TO_SCHEDULE, PASS, POSTPASS, PREPASS, SCHEDULED, SCHEDULING)
}

@js.native
sealed trait Criticality extends js.Any
object Criticality {
  val PREFERRED = "PREFERRED".asInstanceOf[Criticality]
  val REMOVED = "REMOVED".asInstanceOf[Criticality]
  val REQUIRED = "REQUIRED".asInstanceOf[Criticality]

  @inline def values = js.Array(PREFERRED, REMOVED, REQUIRED)
}

@js.native
sealed trait EirpUnits extends js.Any
object EirpUnits {
  val dBW = "dBW".asInstanceOf[EirpUnits]

  @inline def values = js.Array(dBW)
}

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val created = "created".asInstanceOf[EndpointStatus]
  val creating = "creating".asInstanceOf[EndpointStatus]
  val deleted = "deleted".asInstanceOf[EndpointStatus]
  val deleting = "deleting".asInstanceOf[EndpointStatus]
  val failed = "failed".asInstanceOf[EndpointStatus]

  @inline def values = js.Array(created, creating, deleted, deleting, failed)
}

@js.native
sealed trait FrequencyUnits extends js.Any
object FrequencyUnits {
  val GHz = "GHz".asInstanceOf[FrequencyUnits]
  val MHz = "MHz".asInstanceOf[FrequencyUnits]
  val kHz = "kHz".asInstanceOf[FrequencyUnits]

  @inline def values = js.Array(GHz, MHz, kHz)
}

@js.native
sealed trait Polarization extends js.Any
object Polarization {
  val LEFT_HAND = "LEFT_HAND".asInstanceOf[Polarization]
  val NONE = "NONE".asInstanceOf[Polarization]
  val RIGHT_HAND = "RIGHT_HAND".asInstanceOf[Polarization]

  @inline def values = js.Array(LEFT_HAND, NONE, RIGHT_HAND)
}

