package facade.amazonaws.services.iotwireless

import scalajs.js

/** Sidewalk device battery level.
  */
type BatteryLevel = "normal" | "low" | "critical"
object BatteryLevel {
  inline val normal: "normal" = "normal"
  inline val low: "low" = "low"
  inline val critical: "critical" = "critical"

  inline def values: js.Array[BatteryLevel] = js.Array(normal, low, critical)
}

type ConnectionStatus = "Connected" | "Disconnected"
object ConnectionStatus {
  inline val Connected: "Connected" = "Connected"
  inline val Disconnected: "Disconnected" = "Disconnected"

  inline def values: js.Array[ConnectionStatus] = js.Array(Connected, Disconnected)
}

/** Device state defines the device status of sidewalk device.
  */
type DeviceState = "Provisioned" | "RegisteredNotSeen" | "RegisteredReachable" | "RegisteredUnreachable"
object DeviceState {
  inline val Provisioned: "Provisioned" = "Provisioned"
  inline val RegisteredNotSeen: "RegisteredNotSeen" = "RegisteredNotSeen"
  inline val RegisteredReachable: "RegisteredReachable" = "RegisteredReachable"
  inline val RegisteredUnreachable: "RegisteredUnreachable" = "RegisteredUnreachable"

  inline def values: js.Array[DeviceState] = js.Array(Provisioned, RegisteredNotSeen, RegisteredReachable, RegisteredUnreachable)
}

/** DlClass for LoRaWAM, valid values are ClassB and ClassC.
  */
type DlClass = "ClassB" | "ClassC"
object DlClass {
  inline val ClassB: "ClassB" = "ClassB"
  inline val ClassC: "ClassC" = "ClassC"

  inline def values: js.Array[DlClass] = js.Array(ClassB, ClassC)
}

/** Sidewalk device status notification.
  */
type Event = "discovered" | "lost" | "ack" | "nack" | "passthrough"
object Event {
  inline val discovered: "discovered" = "discovered"
  inline val lost: "lost" = "lost"
  inline val ack: "ack" = "ack"
  inline val nack: "nack" = "nack"
  inline val passthrough: "passthrough" = "passthrough"

  inline def values: js.Array[Event] = js.Array(discovered, lost, ack, nack, passthrough)
}

type EventNotificationPartnerType = "Sidewalk"
object EventNotificationPartnerType {
  inline val Sidewalk: "Sidewalk" = "Sidewalk"

  inline def values: js.Array[EventNotificationPartnerType] = js.Array(Sidewalk)
}

type EventNotificationTopicStatus = "Enabled" | "Disabled"
object EventNotificationTopicStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[EventNotificationTopicStatus] = js.Array(Enabled, Disabled)
}

type ExpressionType = "RuleName" | "MqttTopic"
object ExpressionType {
  inline val RuleName: "RuleName" = "RuleName"
  inline val MqttTopic: "MqttTopic" = "MqttTopic"

  inline def values: js.Array[ExpressionType] = js.Array(RuleName, MqttTopic)
}

/** The status of a wireless device in a FUOTA task.
  */
type FuotaDeviceStatus = "Initial" | "Package_Not_Supported" | "FragAlgo_unsupported" | "Not_enough_memory" | "FragIndex_unsupported" | "Wrong_descriptor" | "SessionCnt_replay" | "MissingFrag" | "MemoryError" | "MICError" | "Successful"
object FuotaDeviceStatus {
  inline val Initial: "Initial" = "Initial"
  inline val Package_Not_Supported: "Package_Not_Supported" = "Package_Not_Supported"
  inline val FragAlgo_unsupported: "FragAlgo_unsupported" = "FragAlgo_unsupported"
  inline val Not_enough_memory: "Not_enough_memory" = "Not_enough_memory"
  inline val FragIndex_unsupported: "FragIndex_unsupported" = "FragIndex_unsupported"
  inline val Wrong_descriptor: "Wrong_descriptor" = "Wrong_descriptor"
  inline val SessionCnt_replay: "SessionCnt_replay" = "SessionCnt_replay"
  inline val MissingFrag: "MissingFrag" = "MissingFrag"
  inline val MemoryError: "MemoryError" = "MemoryError"
  inline val MICError: "MICError" = "MICError"
  inline val Successful: "Successful" = "Successful"

  inline def values: js.Array[FuotaDeviceStatus] = js.Array(
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
type FuotaTaskStatus = "Pending" | "FuotaSession_Waiting" | "In_FuotaSession" | "FuotaDone" | "Delete_Waiting"
object FuotaTaskStatus {
  inline val Pending: "Pending" = "Pending"
  inline val FuotaSession_Waiting: "FuotaSession_Waiting" = "FuotaSession_Waiting"
  inline val In_FuotaSession: "In_FuotaSession" = "In_FuotaSession"
  inline val FuotaDone: "FuotaDone" = "FuotaDone"
  inline val Delete_Waiting: "Delete_Waiting" = "Delete_Waiting"

  inline def values: js.Array[FuotaTaskStatus] = js.Array(Pending, FuotaSession_Waiting, In_FuotaSession, FuotaDone, Delete_Waiting)
}

type IdentifierType = "PartnerAccountId"
object IdentifierType {
  inline val PartnerAccountId: "PartnerAccountId" = "PartnerAccountId"

  inline def values: js.Array[IdentifierType] = js.Array(PartnerAccountId)
}

/** The log level for a log message.
  */
type LogLevel = "INFO" | "ERROR" | "DISABLED"
object LogLevel {
  inline val INFO: "INFO" = "INFO"
  inline val ERROR: "ERROR" = "ERROR"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[LogLevel] = js.Array(INFO, ERROR, DISABLED)
}

/** Sidewalk device message type. Default value is <code>CUSTOM_COMMAND_ID_NOTIFY</code>.
  */
type MessageType = "CUSTOM_COMMAND_ID_NOTIFY" | "CUSTOM_COMMAND_ID_GET" | "CUSTOM_COMMAND_ID_SET" | "CUSTOM_COMMAND_ID_RESP"
object MessageType {
  inline val CUSTOM_COMMAND_ID_NOTIFY: "CUSTOM_COMMAND_ID_NOTIFY" = "CUSTOM_COMMAND_ID_NOTIFY"
  inline val CUSTOM_COMMAND_ID_GET: "CUSTOM_COMMAND_ID_GET" = "CUSTOM_COMMAND_ID_GET"
  inline val CUSTOM_COMMAND_ID_SET: "CUSTOM_COMMAND_ID_SET" = "CUSTOM_COMMAND_ID_SET"
  inline val CUSTOM_COMMAND_ID_RESP: "CUSTOM_COMMAND_ID_RESP" = "CUSTOM_COMMAND_ID_RESP"

  inline def values: js.Array[MessageType] = js.Array(CUSTOM_COMMAND_ID_NOTIFY, CUSTOM_COMMAND_ID_GET, CUSTOM_COMMAND_ID_SET, CUSTOM_COMMAND_ID_RESP)
}

type PartnerType = "Sidewalk"
object PartnerType {
  inline val Sidewalk: "Sidewalk" = "Sidewalk"

  inline def values: js.Array[PartnerType] = js.Array(Sidewalk)
}

/** The certificate chain algorithm provided by sidewalk.
  */
type SigningAlg = "Ed25519" | "P256r1"
object SigningAlg {
  inline val Ed25519: "Ed25519" = "Ed25519"
  inline val P256r1: "P256r1" = "P256r1"

  inline def values: js.Array[SigningAlg] = js.Array(Ed25519, P256r1)
}

/** Supported RfRegions
  */
type SupportedRfRegion = "EU868" | "US915" | "AU915" | "AS923-1"
object SupportedRfRegion {
  inline val EU868: "EU868" = "EU868"
  inline val US915: "US915" = "US915"
  inline val AU915: "AU915" = "AU915"
  inline val `AS923-1`: "AS923-1" = "AS923-1"

  inline def values: js.Array[SupportedRfRegion] = js.Array(EU868, US915, AU915, `AS923-1`)
}

/** The event for a log message, if the log message is tied to a wireless device.
  */
type WirelessDeviceEvent = "Join" | "Rejoin" | "Uplink_Data" | "Downlink_Data" | "Registration"
object WirelessDeviceEvent {
  inline val Join: "Join" = "Join"
  inline val Rejoin: "Rejoin" = "Rejoin"
  inline val Uplink_Data: "Uplink_Data" = "Uplink_Data"
  inline val Downlink_Data: "Downlink_Data" = "Downlink_Data"
  inline val Registration: "Registration" = "Registration"

  inline def values: js.Array[WirelessDeviceEvent] = js.Array(Join, Rejoin, Uplink_Data, Downlink_Data, Registration)
}

/** WirelessDevice FrameInfo for trace content.
  */
type WirelessDeviceFrameInfo = "ENABLED" | "DISABLED"
object WirelessDeviceFrameInfo {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[WirelessDeviceFrameInfo] = js.Array(ENABLED, DISABLED)
}

type WirelessDeviceIdType = "WirelessDeviceId" | "DevEui" | "ThingName" | "SidewalkManufacturingSn"
object WirelessDeviceIdType {
  inline val WirelessDeviceId: "WirelessDeviceId" = "WirelessDeviceId"
  inline val DevEui: "DevEui" = "DevEui"
  inline val ThingName: "ThingName" = "ThingName"
  inline val SidewalkManufacturingSn: "SidewalkManufacturingSn" = "SidewalkManufacturingSn"

  inline def values: js.Array[WirelessDeviceIdType] = js.Array(WirelessDeviceId, DevEui, ThingName, SidewalkManufacturingSn)
}

type WirelessDeviceType = "Sidewalk" | "LoRaWAN"
object WirelessDeviceType {
  inline val Sidewalk: "Sidewalk" = "Sidewalk"
  inline val LoRaWAN: "LoRaWAN" = "LoRaWAN"

  inline def values: js.Array[WirelessDeviceType] = js.Array(Sidewalk, LoRaWAN)
}

/** The event for a log message, if the log message is tied to a wireless gateway.
  */
type WirelessGatewayEvent = "CUPS_Request" | "Certificate"
object WirelessGatewayEvent {
  inline val CUPS_Request: "CUPS_Request" = "CUPS_Request"
  inline val Certificate: "Certificate" = "Certificate"

  inline def values: js.Array[WirelessGatewayEvent] = js.Array(CUPS_Request, Certificate)
}

type WirelessGatewayIdType = "GatewayEui" | "WirelessGatewayId" | "ThingName"
object WirelessGatewayIdType {
  inline val GatewayEui: "GatewayEui" = "GatewayEui"
  inline val WirelessGatewayId: "WirelessGatewayId" = "WirelessGatewayId"
  inline val ThingName: "ThingName" = "ThingName"

  inline def values: js.Array[WirelessGatewayIdType] = js.Array(GatewayEui, WirelessGatewayId, ThingName)
}

type WirelessGatewayServiceType = "CUPS" | "LNS"
object WirelessGatewayServiceType {
  inline val CUPS: "CUPS" = "CUPS"
  inline val LNS: "LNS" = "LNS"

  inline def values: js.Array[WirelessGatewayServiceType] = js.Array(CUPS, LNS)
}

type WirelessGatewayTaskDefinitionType = "UPDATE"
object WirelessGatewayTaskDefinitionType {
  inline val UPDATE: "UPDATE" = "UPDATE"

  inline def values: js.Array[WirelessGatewayTaskDefinitionType] = js.Array(UPDATE)
}

type WirelessGatewayTaskStatus = "PENDING" | "IN_PROGRESS" | "FIRST_RETRY" | "SECOND_RETRY" | "COMPLETED" | "FAILED"
object WirelessGatewayTaskStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FIRST_RETRY: "FIRST_RETRY" = "FIRST_RETRY"
  inline val SECOND_RETRY: "SECOND_RETRY" = "SECOND_RETRY"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[WirelessGatewayTaskStatus] = js.Array(PENDING, IN_PROGRESS, FIRST_RETRY, SECOND_RETRY, COMPLETED, FAILED)
}

/** The wireless gateway type.
  */
type WirelessGatewayType = "LoRaWAN"
object WirelessGatewayType {
  inline val LoRaWAN: "LoRaWAN" = "LoRaWAN"

  inline def values: js.Array[WirelessGatewayType] = js.Array(LoRaWAN)
}
