package facade.amazonaws.services.iotfleetwise

import scalajs.js

type CampaignStatus = "CREATING" | "WAITING_FOR_APPROVAL" | "RUNNING" | "SUSPENDED"
object CampaignStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val WAITING_FOR_APPROVAL: "WAITING_FOR_APPROVAL" = "WAITING_FOR_APPROVAL"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"

  inline def values: js.Array[CampaignStatus] = js.Array(CREATING, WAITING_FOR_APPROVAL, RUNNING, SUSPENDED)
}

type Compression = "OFF" | "SNAPPY"
object Compression {
  inline val OFF: "OFF" = "OFF"
  inline val SNAPPY: "SNAPPY" = "SNAPPY"

  inline def values: js.Array[Compression] = js.Array(OFF, SNAPPY)
}

type DiagnosticsMode = "OFF" | "SEND_ACTIVE_DTCS"
object DiagnosticsMode {
  inline val OFF: "OFF" = "OFF"
  inline val SEND_ACTIVE_DTCS: "SEND_ACTIVE_DTCS" = "SEND_ACTIVE_DTCS"

  inline def values: js.Array[DiagnosticsMode] = js.Array(OFF, SEND_ACTIVE_DTCS)
}

type LogType = "OFF" | "ERROR"
object LogType {
  inline val OFF: "OFF" = "OFF"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[LogType] = js.Array(OFF, ERROR)
}

type ManifestStatus = "ACTIVE" | "DRAFT"
object ManifestStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DRAFT: "DRAFT" = "DRAFT"

  inline def values: js.Array[ManifestStatus] = js.Array(ACTIVE, DRAFT)
}

type NetworkInterfaceType = "CAN_INTERFACE" | "OBD_INTERFACE"
object NetworkInterfaceType {
  inline val CAN_INTERFACE: "CAN_INTERFACE" = "CAN_INTERFACE"
  inline val OBD_INTERFACE: "OBD_INTERFACE" = "OBD_INTERFACE"

  inline def values: js.Array[NetworkInterfaceType] = js.Array(CAN_INTERFACE, OBD_INTERFACE)
}

type NodeDataType = "INT8" | "UINT8" | "INT16" | "UINT16" | "INT32" | "UINT32" | "INT64" | "UINT64" | "BOOLEAN" | "FLOAT" | "DOUBLE" | "STRING" | "UNIX_TIMESTAMP" | "INT8_ARRAY" | "UINT8_ARRAY" | "INT16_ARRAY" | "UINT16_ARRAY" | "INT32_ARRAY" | "UINT32_ARRAY" | "INT64_ARRAY" | "UINT64_ARRAY" | "BOOLEAN_ARRAY" | "FLOAT_ARRAY" | "DOUBLE_ARRAY" | "STRING_ARRAY" | "UNIX_TIMESTAMP_ARRAY" | "UNKNOWN"
object NodeDataType {
  inline val INT8: "INT8" = "INT8"
  inline val UINT8: "UINT8" = "UINT8"
  inline val INT16: "INT16" = "INT16"
  inline val UINT16: "UINT16" = "UINT16"
  inline val INT32: "INT32" = "INT32"
  inline val UINT32: "UINT32" = "UINT32"
  inline val INT64: "INT64" = "INT64"
  inline val UINT64: "UINT64" = "UINT64"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val FLOAT: "FLOAT" = "FLOAT"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val STRING: "STRING" = "STRING"
  inline val UNIX_TIMESTAMP: "UNIX_TIMESTAMP" = "UNIX_TIMESTAMP"
  inline val INT8_ARRAY: "INT8_ARRAY" = "INT8_ARRAY"
  inline val UINT8_ARRAY: "UINT8_ARRAY" = "UINT8_ARRAY"
  inline val INT16_ARRAY: "INT16_ARRAY" = "INT16_ARRAY"
  inline val UINT16_ARRAY: "UINT16_ARRAY" = "UINT16_ARRAY"
  inline val INT32_ARRAY: "INT32_ARRAY" = "INT32_ARRAY"
  inline val UINT32_ARRAY: "UINT32_ARRAY" = "UINT32_ARRAY"
  inline val INT64_ARRAY: "INT64_ARRAY" = "INT64_ARRAY"
  inline val UINT64_ARRAY: "UINT64_ARRAY" = "UINT64_ARRAY"
  inline val BOOLEAN_ARRAY: "BOOLEAN_ARRAY" = "BOOLEAN_ARRAY"
  inline val FLOAT_ARRAY: "FLOAT_ARRAY" = "FLOAT_ARRAY"
  inline val DOUBLE_ARRAY: "DOUBLE_ARRAY" = "DOUBLE_ARRAY"
  inline val STRING_ARRAY: "STRING_ARRAY" = "STRING_ARRAY"
  inline val UNIX_TIMESTAMP_ARRAY: "UNIX_TIMESTAMP_ARRAY" = "UNIX_TIMESTAMP_ARRAY"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[NodeDataType] = js.Array(
    INT8,
    UINT8,
    INT16,
    UINT16,
    INT32,
    UINT32,
    INT64,
    UINT64,
    BOOLEAN,
    FLOAT,
    DOUBLE,
    STRING,
    UNIX_TIMESTAMP,
    INT8_ARRAY,
    UINT8_ARRAY,
    INT16_ARRAY,
    UINT16_ARRAY,
    INT32_ARRAY,
    UINT32_ARRAY,
    INT64_ARRAY,
    UINT64_ARRAY,
    BOOLEAN_ARRAY,
    FLOAT_ARRAY,
    DOUBLE_ARRAY,
    STRING_ARRAY,
    UNIX_TIMESTAMP_ARRAY,
    UNKNOWN
  )
}

type RegistrationStatus = "REGISTRATION_PENDING" | "REGISTRATION_SUCCESS" | "REGISTRATION_FAILURE"
object RegistrationStatus {
  inline val REGISTRATION_PENDING: "REGISTRATION_PENDING" = "REGISTRATION_PENDING"
  inline val REGISTRATION_SUCCESS: "REGISTRATION_SUCCESS" = "REGISTRATION_SUCCESS"
  inline val REGISTRATION_FAILURE: "REGISTRATION_FAILURE" = "REGISTRATION_FAILURE"

  inline def values: js.Array[RegistrationStatus] = js.Array(REGISTRATION_PENDING, REGISTRATION_SUCCESS, REGISTRATION_FAILURE)
}

type SignalDecoderType = "CAN_SIGNAL" | "OBD_SIGNAL"
object SignalDecoderType {
  inline val CAN_SIGNAL: "CAN_SIGNAL" = "CAN_SIGNAL"
  inline val OBD_SIGNAL: "OBD_SIGNAL" = "OBD_SIGNAL"

  inline def values: js.Array[SignalDecoderType] = js.Array(CAN_SIGNAL, OBD_SIGNAL)
}

type SpoolingMode = "OFF" | "TO_DISK"
object SpoolingMode {
  inline val OFF: "OFF" = "OFF"
  inline val TO_DISK: "TO_DISK" = "TO_DISK"

  inline def values: js.Array[SpoolingMode] = js.Array(OFF, TO_DISK)
}

type TriggerMode = "ALWAYS" | "RISING_EDGE"
object TriggerMode {
  inline val ALWAYS: "ALWAYS" = "ALWAYS"
  inline val RISING_EDGE: "RISING_EDGE" = "RISING_EDGE"

  inline def values: js.Array[TriggerMode] = js.Array(ALWAYS, RISING_EDGE)
}

type UpdateCampaignAction = "APPROVE" | "SUSPEND" | "RESUME" | "UPDATE"
object UpdateCampaignAction {
  inline val APPROVE: "APPROVE" = "APPROVE"
  inline val SUSPEND: "SUSPEND" = "SUSPEND"
  inline val RESUME: "RESUME" = "RESUME"
  inline val UPDATE: "UPDATE" = "UPDATE"

  inline def values: js.Array[UpdateCampaignAction] = js.Array(APPROVE, SUSPEND, RESUME, UPDATE)
}

type UpdateMode = "Overwrite" | "Merge"
object UpdateMode {
  inline val Overwrite: "Overwrite" = "Overwrite"
  inline val Merge: "Merge" = "Merge"

  inline def values: js.Array[UpdateMode] = js.Array(Overwrite, Merge)
}

type VehicleAssociationBehavior = "CreateIotThing" | "ValidateIotThingExists"
object VehicleAssociationBehavior {
  inline val CreateIotThing: "CreateIotThing" = "CreateIotThing"
  inline val ValidateIotThingExists: "ValidateIotThingExists" = "ValidateIotThingExists"

  inline def values: js.Array[VehicleAssociationBehavior] = js.Array(CreateIotThing, ValidateIotThingExists)
}

type VehicleState = "CREATED" | "READY" | "HEALTHY" | "SUSPENDED" | "DELETING"
object VehicleState {
  inline val CREATED: "CREATED" = "CREATED"
  inline val READY: "READY" = "READY"
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[VehicleState] = js.Array(CREATED, READY, HEALTHY, SUSPENDED, DELETING)
}
