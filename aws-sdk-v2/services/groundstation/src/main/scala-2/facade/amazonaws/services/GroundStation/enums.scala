package facade.amazonaws.services.groundstation

import scalajs.js

@js.native
sealed trait AngleUnits extends js.Any
object AngleUnits {
  val DEGREE_ANGLE = "DEGREE_ANGLE".asInstanceOf[AngleUnits]
  val RADIAN = "RADIAN".asInstanceOf[AngleUnits]

  @inline def values: js.Array[AngleUnits] = js.Array(DEGREE_ANGLE, RADIAN)
}

@js.native
sealed trait BandwidthUnits extends js.Any
object BandwidthUnits {
  val GHz = "GHz".asInstanceOf[BandwidthUnits]
  val MHz = "MHz".asInstanceOf[BandwidthUnits]
  val kHz = "kHz".asInstanceOf[BandwidthUnits]

  @inline def values: js.Array[BandwidthUnits] = js.Array(GHz, MHz, kHz)
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

  @inline def values: js.Array[ConfigCapabilityType] = js.Array(`antenna-downlink`, `antenna-downlink-demod-decode`, `antenna-uplink`, `dataflow-endpoint`, tracking, `uplink-echo`, `s3-recording`)
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

  @inline def values: js.Array[ContactStatus] = js.Array(AVAILABLE, AWS_CANCELLED, AWS_FAILED, CANCELLED, CANCELLING, COMPLETED, FAILED, FAILED_TO_SCHEDULE, PASS, POSTPASS, PREPASS, SCHEDULED, SCHEDULING)
}

@js.native
sealed trait Criticality extends js.Any
object Criticality {
  val PREFERRED = "PREFERRED".asInstanceOf[Criticality]
  val REMOVED = "REMOVED".asInstanceOf[Criticality]
  val REQUIRED = "REQUIRED".asInstanceOf[Criticality]

  @inline def values: js.Array[Criticality] = js.Array(PREFERRED, REMOVED, REQUIRED)
}

@js.native
sealed trait EirpUnits extends js.Any
object EirpUnits {
  val dBW = "dBW".asInstanceOf[EirpUnits]

  @inline def values: js.Array[EirpUnits] = js.Array(dBW)
}

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val created = "created".asInstanceOf[EndpointStatus]
  val creating = "creating".asInstanceOf[EndpointStatus]
  val deleted = "deleted".asInstanceOf[EndpointStatus]
  val deleting = "deleting".asInstanceOf[EndpointStatus]
  val failed = "failed".asInstanceOf[EndpointStatus]

  @inline def values: js.Array[EndpointStatus] = js.Array(created, creating, deleted, deleting, failed)
}

@js.native
sealed trait EphemerisInvalidReason extends js.Any
object EphemerisInvalidReason {
  val METADATA_INVALID = "METADATA_INVALID".asInstanceOf[EphemerisInvalidReason]
  val TIME_RANGE_INVALID = "TIME_RANGE_INVALID".asInstanceOf[EphemerisInvalidReason]
  val TRAJECTORY_INVALID = "TRAJECTORY_INVALID".asInstanceOf[EphemerisInvalidReason]
  val KMS_KEY_INVALID = "KMS_KEY_INVALID".asInstanceOf[EphemerisInvalidReason]
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[EphemerisInvalidReason]

  @inline def values: js.Array[EphemerisInvalidReason] = js.Array(METADATA_INVALID, TIME_RANGE_INVALID, TRAJECTORY_INVALID, KMS_KEY_INVALID, VALIDATION_ERROR)
}

@js.native
sealed trait EphemerisSource extends js.Any
object EphemerisSource {
  val CUSTOMER_PROVIDED = "CUSTOMER_PROVIDED".asInstanceOf[EphemerisSource]
  val SPACE_TRACK = "SPACE_TRACK".asInstanceOf[EphemerisSource]

  @inline def values: js.Array[EphemerisSource] = js.Array(CUSTOMER_PROVIDED, SPACE_TRACK)
}

@js.native
sealed trait EphemerisStatus extends js.Any
object EphemerisStatus {
  val VALIDATING = "VALIDATING".asInstanceOf[EphemerisStatus]
  val INVALID = "INVALID".asInstanceOf[EphemerisStatus]
  val ERROR = "ERROR".asInstanceOf[EphemerisStatus]
  val ENABLED = "ENABLED".asInstanceOf[EphemerisStatus]
  val DISABLED = "DISABLED".asInstanceOf[EphemerisStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[EphemerisStatus]

  @inline def values: js.Array[EphemerisStatus] = js.Array(VALIDATING, INVALID, ERROR, ENABLED, DISABLED, EXPIRED)
}

@js.native
sealed trait FrequencyUnits extends js.Any
object FrequencyUnits {
  val GHz = "GHz".asInstanceOf[FrequencyUnits]
  val MHz = "MHz".asInstanceOf[FrequencyUnits]
  val kHz = "kHz".asInstanceOf[FrequencyUnits]

  @inline def values: js.Array[FrequencyUnits] = js.Array(GHz, MHz, kHz)
}

@js.native
sealed trait Polarization extends js.Any
object Polarization {
  val LEFT_HAND = "LEFT_HAND".asInstanceOf[Polarization]
  val NONE = "NONE".asInstanceOf[Polarization]
  val RIGHT_HAND = "RIGHT_HAND".asInstanceOf[Polarization]

  @inline def values: js.Array[Polarization] = js.Array(LEFT_HAND, NONE, RIGHT_HAND)
}
