package facade.amazonaws.services.iotwireless

import scalajs.js

/** Sidewalk device battery level.
  */
@js.native
sealed trait BatteryLevel extends js.Any
object BatteryLevel {
  val normal = "normal".asInstanceOf[BatteryLevel]
  val low = "low".asInstanceOf[BatteryLevel]
  val critical = "critical".asInstanceOf[BatteryLevel]

  @inline def values: js.Array[BatteryLevel] = js.Array(normal, low, critical)
}

@js.native
sealed trait ConnectionStatus extends js.Any
object ConnectionStatus {
  val Connected = "Connected".asInstanceOf[ConnectionStatus]
  val Disconnected = "Disconnected".asInstanceOf[ConnectionStatus]

  @inline def values: js.Array[ConnectionStatus] = js.Array(Connected, Disconnected)
}

/** Device state defines the device status of sidewalk device.
  */
@js.native
sealed trait DeviceState extends js.Any
object DeviceState {
  val Provisioned = "Provisioned".asInstanceOf[DeviceState]
  val RegisteredNotSeen = "RegisteredNotSeen".asInstanceOf[DeviceState]
  val RegisteredReachable = "RegisteredReachable".asInstanceOf[DeviceState]
  val RegisteredUnreachable = "RegisteredUnreachable".asInstanceOf[DeviceState]

  @inline def values: js.Array[DeviceState] = js.Array(Provisioned, RegisteredNotSeen, RegisteredReachable, RegisteredUnreachable)
}

/** DlClass for LoRaWAM, valid values are ClassB and ClassC.
  */
@js.native
sealed trait DlClass extends js.Any
object DlClass {
  val ClassB = "ClassB".asInstanceOf[DlClass]
  val ClassC = "ClassC".asInstanceOf[DlClass]

  @inline def values: js.Array[DlClass] = js.Array(ClassB, ClassC)
}

/** Sidewalk device status notification.
  */
@js.native
sealed trait Event extends js.Any
object Event {
  val discovered = "discovered".asInstanceOf[Event]
  val lost = "lost".asInstanceOf[Event]
  val ack = "ack".asInstanceOf[Event]
  val nack = "nack".asInstanceOf[Event]
  val passthrough = "passthrough".asInstanceOf[Event]

  @inline def values: js.Array[Event] = js.Array(discovered, lost, ack, nack, passthrough)
}

@js.native
sealed trait EventNotificationPartnerType extends js.Any
object EventNotificationPartnerType {
  val Sidewalk = "Sidewalk".asInstanceOf[EventNotificationPartnerType]

  @inline def values: js.Array[EventNotificationPartnerType] = js.Array(Sidewalk)
}

@js.native
sealed trait EventNotificationTopicStatus extends js.Any
object EventNotificationTopicStatus {
  val Enabled = "Enabled".asInstanceOf[EventNotificationTopicStatus]
  val Disabled = "Disabled".asInstanceOf[EventNotificationTopicStatus]

  @inline def values: js.Array[EventNotificationTopicStatus] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ExpressionType extends js.Any
object ExpressionType {
  val RuleName = "RuleName".asInstanceOf[ExpressionType]
  val MqttTopic = "MqttTopic".asInstanceOf[ExpressionType]

  @inline def values: js.Array[ExpressionType] = js.Array(RuleName, MqttTopic)
}

/** The status of a wireless device in a FUOTA task.
  */
@js.native
sealed trait FuotaDeviceStatus extends js.Any
object FuotaDeviceStatus {
  val Initial = "Initial".asInstanceOf[FuotaDeviceStatus]
  val Package_Not_Supported = "Package_Not_Supported".asInstanceOf[FuotaDeviceStatus]
  val FragAlgo_unsupported = "FragAlgo_unsupported".asInstanceOf[FuotaDeviceStatus]
  val Not_enough_memory = "Not_enough_memory".asInstanceOf[FuotaDeviceStatus]
  val FragIndex_unsupported = "FragIndex_unsupported".asInstanceOf[FuotaDeviceStatus]
  val Wrong_descriptor = "Wrong_descriptor".asInstanceOf[FuotaDeviceStatus]
  val SessionCnt_replay = "SessionCnt_replay".asInstanceOf[FuotaDeviceStatus]
  val MissingFrag = "MissingFrag".asInstanceOf[FuotaDeviceStatus]
  val MemoryError = "MemoryError".asInstanceOf[FuotaDeviceStatus]
  val MICError = "MICError".asInstanceOf[FuotaDeviceStatus]
  val Successful = "Successful".asInstanceOf[FuotaDeviceStatus]

  @inline def values: js.Array[FuotaDeviceStatus] = js.Array(
    Initial,
    Package_Not_Supported,
    FragAlgo_unsupported,
    Not_enough_memory,
    FragIndex_unsupported,
    Wrong_descriptor,
    SessionCnt_replay,
    MissingFrag,
    MemoryError,
    MICError,
    Successful
  )
}

/** The status of a FUOTA task.
  */
@js.native
sealed trait FuotaTaskStatus extends js.Any
object FuotaTaskStatus {
  val Pending = "Pending".asInstanceOf[FuotaTaskStatus]
  val FuotaSession_Waiting = "FuotaSession_Waiting".asInstanceOf[FuotaTaskStatus]
  val In_FuotaSession = "In_FuotaSession".asInstanceOf[FuotaTaskStatus]
  val FuotaDone = "FuotaDone".asInstanceOf[FuotaTaskStatus]
  val Delete_Waiting = "Delete_Waiting".asInstanceOf[FuotaTaskStatus]

  @inline def values: js.Array[FuotaTaskStatus] = js.Array(Pending, FuotaSession_Waiting, In_FuotaSession, FuotaDone, Delete_Waiting)
}

@js.native
sealed trait IdentifierType extends js.Any
object IdentifierType {
  val PartnerAccountId = "PartnerAccountId".asInstanceOf[IdentifierType]

  @inline def values: js.Array[IdentifierType] = js.Array(PartnerAccountId)
}

/** The log level for a log message.
  */
@js.native
sealed trait LogLevel extends js.Any
object LogLevel {
  val INFO = "INFO".asInstanceOf[LogLevel]
  val ERROR = "ERROR".asInstanceOf[LogLevel]
  val DISABLED = "DISABLED".asInstanceOf[LogLevel]

  @inline def values: js.Array[LogLevel] = js.Array(INFO, ERROR, DISABLED)
}

/** Sidewalk device message type. Default value is <code>CUSTOM_COMMAND_ID_NOTIFY</code>.
  */
@js.native
sealed trait MessageType extends js.Any
object MessageType {
  val CUSTOM_COMMAND_ID_NOTIFY = "CUSTOM_COMMAND_ID_NOTIFY".asInstanceOf[MessageType]
  val CUSTOM_COMMAND_ID_GET = "CUSTOM_COMMAND_ID_GET".asInstanceOf[MessageType]
  val CUSTOM_COMMAND_ID_SET = "CUSTOM_COMMAND_ID_SET".asInstanceOf[MessageType]
  val CUSTOM_COMMAND_ID_RESP = "CUSTOM_COMMAND_ID_RESP".asInstanceOf[MessageType]

  @inline def values: js.Array[MessageType] = js.Array(CUSTOM_COMMAND_ID_NOTIFY, CUSTOM_COMMAND_ID_GET, CUSTOM_COMMAND_ID_SET, CUSTOM_COMMAND_ID_RESP)
}

@js.native
sealed trait PartnerType extends js.Any
object PartnerType {
  val Sidewalk = "Sidewalk".asInstanceOf[PartnerType]

  @inline def values: js.Array[PartnerType] = js.Array(Sidewalk)
}

/** The certificate chain algorithm provided by sidewalk.
  */
@js.native
sealed trait SigningAlg extends js.Any
object SigningAlg {
  val Ed25519 = "Ed25519".asInstanceOf[SigningAlg]
  val P256r1 = "P256r1".asInstanceOf[SigningAlg]

  @inline def values: js.Array[SigningAlg] = js.Array(Ed25519, P256r1)
}

/** Supported RfRegions
  */
@js.native
sealed trait SupportedRfRegion extends js.Any
object SupportedRfRegion {
  val EU868 = "EU868".asInstanceOf[SupportedRfRegion]
  val US915 = "US915".asInstanceOf[SupportedRfRegion]
  val AU915 = "AU915".asInstanceOf[SupportedRfRegion]
  val `AS923-1` = "AS923-1".asInstanceOf[SupportedRfRegion]

  @inline def values: js.Array[SupportedRfRegion] = js.Array(EU868, US915, AU915, `AS923-1`)
}

/** The event for a log message, if the log message is tied to a wireless device.
  */
@js.native
sealed trait WirelessDeviceEvent extends js.Any
object WirelessDeviceEvent {
  val Join = "Join".asInstanceOf[WirelessDeviceEvent]
  val Rejoin = "Rejoin".asInstanceOf[WirelessDeviceEvent]
  val Uplink_Data = "Uplink_Data".asInstanceOf[WirelessDeviceEvent]
  val Downlink_Data = "Downlink_Data".asInstanceOf[WirelessDeviceEvent]
  val Registration = "Registration".asInstanceOf[WirelessDeviceEvent]

  @inline def values: js.Array[WirelessDeviceEvent] = js.Array(Join, Rejoin, Uplink_Data, Downlink_Data, Registration)
}

/** WirelessDevice FrameInfo for trace content.
  */
@js.native
sealed trait WirelessDeviceFrameInfo extends js.Any
object WirelessDeviceFrameInfo {
  val ENABLED = "ENABLED".asInstanceOf[WirelessDeviceFrameInfo]
  val DISABLED = "DISABLED".asInstanceOf[WirelessDeviceFrameInfo]

  @inline def values: js.Array[WirelessDeviceFrameInfo] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait WirelessDeviceIdType extends js.Any
object WirelessDeviceIdType {
  val WirelessDeviceId = "WirelessDeviceId".asInstanceOf[WirelessDeviceIdType]
  val DevEui = "DevEui".asInstanceOf[WirelessDeviceIdType]
  val ThingName = "ThingName".asInstanceOf[WirelessDeviceIdType]
  val SidewalkManufacturingSn = "SidewalkManufacturingSn".asInstanceOf[WirelessDeviceIdType]

  @inline def values: js.Array[WirelessDeviceIdType] = js.Array(WirelessDeviceId, DevEui, ThingName, SidewalkManufacturingSn)
}

@js.native
sealed trait WirelessDeviceType extends js.Any
object WirelessDeviceType {
  val Sidewalk = "Sidewalk".asInstanceOf[WirelessDeviceType]
  val LoRaWAN = "LoRaWAN".asInstanceOf[WirelessDeviceType]

  @inline def values: js.Array[WirelessDeviceType] = js.Array(Sidewalk, LoRaWAN)
}

/** The event for a log message, if the log message is tied to a wireless gateway.
  */
@js.native
sealed trait WirelessGatewayEvent extends js.Any
object WirelessGatewayEvent {
  val CUPS_Request = "CUPS_Request".asInstanceOf[WirelessGatewayEvent]
  val Certificate = "Certificate".asInstanceOf[WirelessGatewayEvent]

  @inline def values: js.Array[WirelessGatewayEvent] = js.Array(CUPS_Request, Certificate)
}

@js.native
sealed trait WirelessGatewayIdType extends js.Any
object WirelessGatewayIdType {
  val GatewayEui = "GatewayEui".asInstanceOf[WirelessGatewayIdType]
  val WirelessGatewayId = "WirelessGatewayId".asInstanceOf[WirelessGatewayIdType]
  val ThingName = "ThingName".asInstanceOf[WirelessGatewayIdType]

  @inline def values: js.Array[WirelessGatewayIdType] = js.Array(GatewayEui, WirelessGatewayId, ThingName)
}

@js.native
sealed trait WirelessGatewayServiceType extends js.Any
object WirelessGatewayServiceType {
  val CUPS = "CUPS".asInstanceOf[WirelessGatewayServiceType]
  val LNS = "LNS".asInstanceOf[WirelessGatewayServiceType]

  @inline def values: js.Array[WirelessGatewayServiceType] = js.Array(CUPS, LNS)
}

@js.native
sealed trait WirelessGatewayTaskDefinitionType extends js.Any
object WirelessGatewayTaskDefinitionType {
  val UPDATE = "UPDATE".asInstanceOf[WirelessGatewayTaskDefinitionType]

  @inline def values: js.Array[WirelessGatewayTaskDefinitionType] = js.Array(UPDATE)
}

@js.native
sealed trait WirelessGatewayTaskStatus extends js.Any
object WirelessGatewayTaskStatus {
  val PENDING = "PENDING".asInstanceOf[WirelessGatewayTaskStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[WirelessGatewayTaskStatus]
  val FIRST_RETRY = "FIRST_RETRY".asInstanceOf[WirelessGatewayTaskStatus]
  val SECOND_RETRY = "SECOND_RETRY".asInstanceOf[WirelessGatewayTaskStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[WirelessGatewayTaskStatus]
  val FAILED = "FAILED".asInstanceOf[WirelessGatewayTaskStatus]

  @inline def values: js.Array[WirelessGatewayTaskStatus] = js.Array(PENDING, IN_PROGRESS, FIRST_RETRY, SECOND_RETRY, COMPLETED, FAILED)
}

/** The wireless gateway type.
  */
@js.native
sealed trait WirelessGatewayType extends js.Any
object WirelessGatewayType {
  val LoRaWAN = "LoRaWAN".asInstanceOf[WirelessGatewayType]

  @inline def values: js.Array[WirelessGatewayType] = js.Array(LoRaWAN)
}
