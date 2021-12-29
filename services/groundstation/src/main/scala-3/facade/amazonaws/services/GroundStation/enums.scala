package facade.amazonaws.services.groundstation

import scalajs._

type AngleUnits = "DEGREE_ANGLE" | "RADIAN"
object AngleUnits {
  val DEGREE_ANGLE: "DEGREE_ANGLE" = "DEGREE_ANGLE"
  val RADIAN: "RADIAN" = "RADIAN"

  @inline def values = js.Array[AngleUnits](DEGREE_ANGLE, RADIAN)
}

type BandwidthUnits = "GHz" | "MHz" | "kHz"
object BandwidthUnits {
  val GHz: "GHz" = "GHz"
  val MHz: "MHz" = "MHz"
  val kHz: "kHz" = "kHz"

  @inline def values = js.Array[BandwidthUnits](GHz, MHz, kHz)
}

type ConfigCapabilityType = "antenna-downlink" | "antenna-downlink-demod-decode" | "antenna-uplink" | "dataflow-endpoint" | "tracking" | "uplink-echo" | "s3-recording"
object ConfigCapabilityType {
  val `antenna-downlink`: "antenna-downlink" = "antenna-downlink"
  val `antenna-downlink-demod-decode`: "antenna-downlink-demod-decode" = "antenna-downlink-demod-decode"
  val `antenna-uplink`: "antenna-uplink" = "antenna-uplink"
  val `dataflow-endpoint`: "dataflow-endpoint" = "dataflow-endpoint"
  val tracking: "tracking" = "tracking"
  val `uplink-echo`: "uplink-echo" = "uplink-echo"
  val `s3-recording`: "s3-recording" = "s3-recording"

  @inline def values = js.Array[ConfigCapabilityType](`antenna-downlink`, `antenna-downlink-demod-decode`, `antenna-uplink`, `dataflow-endpoint`, tracking, `uplink-echo`, `s3-recording`)
}

type ContactStatus = "AVAILABLE" | "AWS_CANCELLED" | "AWS_FAILED" | "CANCELLED" | "CANCELLING" | "COMPLETED" | "FAILED" | "FAILED_TO_SCHEDULE" | "PASS" | "POSTPASS" | "PREPASS" | "SCHEDULED" | "SCHEDULING"
object ContactStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val AWS_CANCELLED: "AWS_CANCELLED" = "AWS_CANCELLED"
  val AWS_FAILED: "AWS_FAILED" = "AWS_FAILED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val CANCELLING: "CANCELLING" = "CANCELLING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val FAILED_TO_SCHEDULE: "FAILED_TO_SCHEDULE" = "FAILED_TO_SCHEDULE"
  val PASS: "PASS" = "PASS"
  val POSTPASS: "POSTPASS" = "POSTPASS"
  val PREPASS: "PREPASS" = "PREPASS"
  val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  val SCHEDULING: "SCHEDULING" = "SCHEDULING"

  @inline def values = js.Array[ContactStatus](AVAILABLE, AWS_CANCELLED, AWS_FAILED, CANCELLED, CANCELLING, COMPLETED, FAILED, FAILED_TO_SCHEDULE, PASS, POSTPASS, PREPASS, SCHEDULED, SCHEDULING)
}

type Criticality = "PREFERRED" | "REMOVED" | "REQUIRED"
object Criticality {
  val PREFERRED: "PREFERRED" = "PREFERRED"
  val REMOVED: "REMOVED" = "REMOVED"
  val REQUIRED: "REQUIRED" = "REQUIRED"

  @inline def values = js.Array[Criticality](PREFERRED, REMOVED, REQUIRED)
}

type EirpUnits = "dBW"
object EirpUnits {
  val dBW: "dBW" = "dBW"

  @inline def values = js.Array[EirpUnits](dBW)
}

type EndpointStatus = "created" | "creating" | "deleted" | "deleting" | "failed"
object EndpointStatus {
  val created: "created" = "created"
  val creating: "creating" = "creating"
  val deleted: "deleted" = "deleted"
  val deleting: "deleting" = "deleting"
  val failed: "failed" = "failed"

  @inline def values = js.Array[EndpointStatus](created, creating, deleted, deleting, failed)
}

type FrequencyUnits = "GHz" | "MHz" | "kHz"
object FrequencyUnits {
  val GHz: "GHz" = "GHz"
  val MHz: "MHz" = "MHz"
  val kHz: "kHz" = "kHz"

  @inline def values = js.Array[FrequencyUnits](GHz, MHz, kHz)
}

type Polarization = "LEFT_HAND" | "NONE" | "RIGHT_HAND"
object Polarization {
  val LEFT_HAND: "LEFT_HAND" = "LEFT_HAND"
  val NONE: "NONE" = "NONE"
  val RIGHT_HAND: "RIGHT_HAND" = "RIGHT_HAND"

  @inline def values = js.Array[Polarization](LEFT_HAND, NONE, RIGHT_HAND)
}
