package facade.amazonaws.services.iotwireless

import scalajs._

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

type ExpressionType = "RuleName" | "MqttTopic"
object ExpressionType {
  inline val RuleName: "RuleName" = "RuleName"
  inline val MqttTopic: "MqttTopic" = "MqttTopic"

  inline def values: js.Array[ExpressionType] = js.Array(RuleName, MqttTopic)
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

type WirelessDeviceIdType = "WirelessDeviceId" | "DevEui" | "ThingName"
object WirelessDeviceIdType {
  inline val WirelessDeviceId: "WirelessDeviceId" = "WirelessDeviceId"
  inline val DevEui: "DevEui" = "DevEui"
  inline val ThingName: "ThingName" = "ThingName"

  inline def values: js.Array[WirelessDeviceIdType] = js.Array(WirelessDeviceId, DevEui, ThingName)
}

type WirelessDeviceType = "Sidewalk" | "LoRaWAN"
object WirelessDeviceType {
  inline val Sidewalk: "Sidewalk" = "Sidewalk"
  inline val LoRaWAN: "LoRaWAN" = "LoRaWAN"

  inline def values: js.Array[WirelessDeviceType] = js.Array(Sidewalk, LoRaWAN)
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
