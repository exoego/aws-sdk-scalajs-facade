package facade.amazonaws.services.groundstation

import scalajs.js

type AngleUnits = "DEGREE_ANGLE" | "RADIAN"
object AngleUnits {
  inline val DEGREE_ANGLE: "DEGREE_ANGLE" = "DEGREE_ANGLE"
  inline val RADIAN: "RADIAN" = "RADIAN"

  inline def values: js.Array[AngleUnits] = js.Array(DEGREE_ANGLE, RADIAN)
}

type BandwidthUnits = "GHz" | "MHz" | "kHz"
object BandwidthUnits {
  inline val GHz: "GHz" = "GHz"
  inline val MHz: "MHz" = "MHz"
  inline val kHz: "kHz" = "kHz"

  inline def values: js.Array[BandwidthUnits] = js.Array(GHz, MHz, kHz)
}

type ConfigCapabilityType = "antenna-downlink" | "antenna-downlink-demod-decode" | "antenna-uplink" | "dataflow-endpoint" | "tracking" | "uplink-echo" | "s3-recording"
object ConfigCapabilityType {
  inline val `antenna-downlink`: "antenna-downlink" = "antenna-downlink"
  inline val `antenna-downlink-demod-decode`: "antenna-downlink-demod-decode" = "antenna-downlink-demod-decode"
  inline val `antenna-uplink`: "antenna-uplink" = "antenna-uplink"
  inline val `dataflow-endpoint`: "dataflow-endpoint" = "dataflow-endpoint"
  inline val tracking: "tracking" = "tracking"
  inline val `uplink-echo`: "uplink-echo" = "uplink-echo"
  inline val `s3-recording`: "s3-recording" = "s3-recording"

  inline def values: js.Array[ConfigCapabilityType] = js.Array(`antenna-downlink`, `antenna-downlink-demod-decode`, `antenna-uplink`, `dataflow-endpoint`, tracking, `uplink-echo`, `s3-recording`)
}

type ContactStatus = "AVAILABLE" | "AWS_CANCELLED" | "AWS_FAILED" | "CANCELLED" | "CANCELLING" | "COMPLETED" | "FAILED" | "FAILED_TO_SCHEDULE" | "PASS" | "POSTPASS" | "PREPASS" | "SCHEDULED" | "SCHEDULING"
object ContactStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val AWS_CANCELLED: "AWS_CANCELLED" = "AWS_CANCELLED"
  inline val AWS_FAILED: "AWS_FAILED" = "AWS_FAILED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val FAILED_TO_SCHEDULE: "FAILED_TO_SCHEDULE" = "FAILED_TO_SCHEDULE"
  inline val PASS: "PASS" = "PASS"
  inline val POSTPASS: "POSTPASS" = "POSTPASS"
  inline val PREPASS: "PREPASS" = "PREPASS"
  inline val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  inline val SCHEDULING: "SCHEDULING" = "SCHEDULING"

  inline def values: js.Array[ContactStatus] = js.Array(AVAILABLE, AWS_CANCELLED, AWS_FAILED, CANCELLED, CANCELLING, COMPLETED, FAILED, FAILED_TO_SCHEDULE, PASS, POSTPASS, PREPASS, SCHEDULED, SCHEDULING)
}

type Criticality = "PREFERRED" | "REMOVED" | "REQUIRED"
object Criticality {
  inline val PREFERRED: "PREFERRED" = "PREFERRED"
  inline val REMOVED: "REMOVED" = "REMOVED"
  inline val REQUIRED: "REQUIRED" = "REQUIRED"

  inline def values: js.Array[Criticality] = js.Array(PREFERRED, REMOVED, REQUIRED)
}

type EirpUnits = "dBW"
object EirpUnits {
  inline val dBW: "dBW" = "dBW"

  inline def values: js.Array[EirpUnits] = js.Array(dBW)
}

type EndpointStatus = "created" | "creating" | "deleted" | "deleting" | "failed"
object EndpointStatus {
  inline val created: "created" = "created"
  inline val creating: "creating" = "creating"
  inline val deleted: "deleted" = "deleted"
  inline val deleting: "deleting" = "deleting"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[EndpointStatus] = js.Array(created, creating, deleted, deleting, failed)
}

type FrequencyUnits = "GHz" | "MHz" | "kHz"
object FrequencyUnits {
  inline val GHz: "GHz" = "GHz"
  inline val MHz: "MHz" = "MHz"
  inline val kHz: "kHz" = "kHz"

  inline def values: js.Array[FrequencyUnits] = js.Array(GHz, MHz, kHz)
}

type Polarization = "LEFT_HAND" | "NONE" | "RIGHT_HAND"
object Polarization {
  inline val LEFT_HAND: "LEFT_HAND" = "LEFT_HAND"
  inline val NONE: "NONE" = "NONE"
  inline val RIGHT_HAND: "RIGHT_HAND" = "RIGHT_HAND"

  inline def values: js.Array[Polarization] = js.Array(LEFT_HAND, NONE, RIGHT_HAND)
}
