package facade.amazonaws.services.iotfleetwise

import scalajs.js

@js.native
sealed trait CampaignStatus extends js.Any
object CampaignStatus {
  val CREATING = "CREATING".asInstanceOf[CampaignStatus]
  val WAITING_FOR_APPROVAL = "WAITING_FOR_APPROVAL".asInstanceOf[CampaignStatus]
  val RUNNING = "RUNNING".asInstanceOf[CampaignStatus]
  val SUSPENDED = "SUSPENDED".asInstanceOf[CampaignStatus]

  @inline def values: js.Array[CampaignStatus] = js.Array(CREATING, WAITING_FOR_APPROVAL, RUNNING, SUSPENDED)
}

@js.native
sealed trait Compression extends js.Any
object Compression {
  val OFF = "OFF".asInstanceOf[Compression]
  val SNAPPY = "SNAPPY".asInstanceOf[Compression]

  @inline def values: js.Array[Compression] = js.Array(OFF, SNAPPY)
}

@js.native
sealed trait DiagnosticsMode extends js.Any
object DiagnosticsMode {
  val OFF = "OFF".asInstanceOf[DiagnosticsMode]
  val SEND_ACTIVE_DTCS = "SEND_ACTIVE_DTCS".asInstanceOf[DiagnosticsMode]

  @inline def values: js.Array[DiagnosticsMode] = js.Array(OFF, SEND_ACTIVE_DTCS)
}

@js.native
sealed trait LogType extends js.Any
object LogType {
  val OFF = "OFF".asInstanceOf[LogType]
  val ERROR = "ERROR".asInstanceOf[LogType]

  @inline def values: js.Array[LogType] = js.Array(OFF, ERROR)
}

@js.native
sealed trait ManifestStatus extends js.Any
object ManifestStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ManifestStatus]
  val DRAFT = "DRAFT".asInstanceOf[ManifestStatus]

  @inline def values: js.Array[ManifestStatus] = js.Array(ACTIVE, DRAFT)
}

@js.native
sealed trait NetworkInterfaceType extends js.Any
object NetworkInterfaceType {
  val CAN_INTERFACE = "CAN_INTERFACE".asInstanceOf[NetworkInterfaceType]
  val OBD_INTERFACE = "OBD_INTERFACE".asInstanceOf[NetworkInterfaceType]

  @inline def values: js.Array[NetworkInterfaceType] = js.Array(CAN_INTERFACE, OBD_INTERFACE)
}

@js.native
sealed trait NodeDataType extends js.Any
object NodeDataType {
  val INT8 = "INT8".asInstanceOf[NodeDataType]
  val UINT8 = "UINT8".asInstanceOf[NodeDataType]
  val INT16 = "INT16".asInstanceOf[NodeDataType]
  val UINT16 = "UINT16".asInstanceOf[NodeDataType]
  val INT32 = "INT32".asInstanceOf[NodeDataType]
  val UINT32 = "UINT32".asInstanceOf[NodeDataType]
  val INT64 = "INT64".asInstanceOf[NodeDataType]
  val UINT64 = "UINT64".asInstanceOf[NodeDataType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[NodeDataType]
  val FLOAT = "FLOAT".asInstanceOf[NodeDataType]
  val DOUBLE = "DOUBLE".asInstanceOf[NodeDataType]
  val STRING = "STRING".asInstanceOf[NodeDataType]
  val UNIX_TIMESTAMP = "UNIX_TIMESTAMP".asInstanceOf[NodeDataType]
  val INT8_ARRAY = "INT8_ARRAY".asInstanceOf[NodeDataType]
  val UINT8_ARRAY = "UINT8_ARRAY".asInstanceOf[NodeDataType]
  val INT16_ARRAY = "INT16_ARRAY".asInstanceOf[NodeDataType]
  val UINT16_ARRAY = "UINT16_ARRAY".asInstanceOf[NodeDataType]
  val INT32_ARRAY = "INT32_ARRAY".asInstanceOf[NodeDataType]
  val UINT32_ARRAY = "UINT32_ARRAY".asInstanceOf[NodeDataType]
  val INT64_ARRAY = "INT64_ARRAY".asInstanceOf[NodeDataType]
  val UINT64_ARRAY = "UINT64_ARRAY".asInstanceOf[NodeDataType]
  val BOOLEAN_ARRAY = "BOOLEAN_ARRAY".asInstanceOf[NodeDataType]
  val FLOAT_ARRAY = "FLOAT_ARRAY".asInstanceOf[NodeDataType]
  val DOUBLE_ARRAY = "DOUBLE_ARRAY".asInstanceOf[NodeDataType]
  val STRING_ARRAY = "STRING_ARRAY".asInstanceOf[NodeDataType]
  val UNIX_TIMESTAMP_ARRAY = "UNIX_TIMESTAMP_ARRAY".asInstanceOf[NodeDataType]
  val UNKNOWN = "UNKNOWN".asInstanceOf[NodeDataType]

  @inline def values: js.Array[NodeDataType] = js.Array(
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

@js.native
sealed trait RegistrationStatus extends js.Any
object RegistrationStatus {
  val REGISTRATION_PENDING = "REGISTRATION_PENDING".asInstanceOf[RegistrationStatus]
  val REGISTRATION_SUCCESS = "REGISTRATION_SUCCESS".asInstanceOf[RegistrationStatus]
  val REGISTRATION_FAILURE = "REGISTRATION_FAILURE".asInstanceOf[RegistrationStatus]

  @inline def values: js.Array[RegistrationStatus] = js.Array(REGISTRATION_PENDING, REGISTRATION_SUCCESS, REGISTRATION_FAILURE)
}

@js.native
sealed trait SignalDecoderType extends js.Any
object SignalDecoderType {
  val CAN_SIGNAL = "CAN_SIGNAL".asInstanceOf[SignalDecoderType]
  val OBD_SIGNAL = "OBD_SIGNAL".asInstanceOf[SignalDecoderType]

  @inline def values: js.Array[SignalDecoderType] = js.Array(CAN_SIGNAL, OBD_SIGNAL)
}

@js.native
sealed trait SpoolingMode extends js.Any
object SpoolingMode {
  val OFF = "OFF".asInstanceOf[SpoolingMode]
  val TO_DISK = "TO_DISK".asInstanceOf[SpoolingMode]

  @inline def values: js.Array[SpoolingMode] = js.Array(OFF, TO_DISK)
}

@js.native
sealed trait TriggerMode extends js.Any
object TriggerMode {
  val ALWAYS = "ALWAYS".asInstanceOf[TriggerMode]
  val RISING_EDGE = "RISING_EDGE".asInstanceOf[TriggerMode]

  @inline def values: js.Array[TriggerMode] = js.Array(ALWAYS, RISING_EDGE)
}

@js.native
sealed trait UpdateCampaignAction extends js.Any
object UpdateCampaignAction {
  val APPROVE = "APPROVE".asInstanceOf[UpdateCampaignAction]
  val SUSPEND = "SUSPEND".asInstanceOf[UpdateCampaignAction]
  val RESUME = "RESUME".asInstanceOf[UpdateCampaignAction]
  val UPDATE = "UPDATE".asInstanceOf[UpdateCampaignAction]

  @inline def values: js.Array[UpdateCampaignAction] = js.Array(APPROVE, SUSPEND, RESUME, UPDATE)
}

@js.native
sealed trait UpdateMode extends js.Any
object UpdateMode {
  val Overwrite = "Overwrite".asInstanceOf[UpdateMode]
  val Merge = "Merge".asInstanceOf[UpdateMode]

  @inline def values: js.Array[UpdateMode] = js.Array(Overwrite, Merge)
}

@js.native
sealed trait VehicleAssociationBehavior extends js.Any
object VehicleAssociationBehavior {
  val CreateIotThing = "CreateIotThing".asInstanceOf[VehicleAssociationBehavior]
  val ValidateIotThingExists = "ValidateIotThingExists".asInstanceOf[VehicleAssociationBehavior]

  @inline def values: js.Array[VehicleAssociationBehavior] = js.Array(CreateIotThing, ValidateIotThingExists)
}

@js.native
sealed trait VehicleState extends js.Any
object VehicleState {
  val CREATED = "CREATED".asInstanceOf[VehicleState]
  val READY = "READY".asInstanceOf[VehicleState]
  val HEALTHY = "HEALTHY".asInstanceOf[VehicleState]
  val SUSPENDED = "SUSPENDED".asInstanceOf[VehicleState]
  val DELETING = "DELETING".asInstanceOf[VehicleState]

  @inline def values: js.Array[VehicleState] = js.Array(CREATED, READY, HEALTHY, SUSPENDED, DELETING)
}
