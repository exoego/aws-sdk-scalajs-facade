package facade.amazonaws.services.iotwireless

import scalajs._

/** Sidewalk device battery level.
  */
type BatteryLevel = "normal" | "low" | "critical"
object BatteryLevel {
  val normal: "normal" = "normal"
  val low: "low" = "low"
  val critical: "critical" = "critical"

  @inline def values = js.Array[BatteryLevel](normal, low, critical)
}

type ConnectionStatus = "Connected" | "Disconnected"
object ConnectionStatus {
  val Connected: "Connected" = "Connected"
  val Disconnected: "Disconnected" = "Disconnected"

  @inline def values = js.Array[ConnectionStatus](Connected, Disconnected)
}

/** Device state defines the device status of sidewalk device.
  */
type DeviceState = "Provisioned" | "RegisteredNotSeen" | "RegisteredReachable" | "RegisteredUnreachable"
object DeviceState {
  val Provisioned: "Provisioned" = "Provisioned"
  val RegisteredNotSeen: "RegisteredNotSeen" = "RegisteredNotSeen"
  val RegisteredReachable: "RegisteredReachable" = "RegisteredReachable"
  val RegisteredUnreachable: "RegisteredUnreachable" = "RegisteredUnreachable"

  @inline def values = js.Array[DeviceState](Provisioned, RegisteredNotSeen, RegisteredReachable, RegisteredUnreachable)
}

/** Sidewalk device status notification.
  */
type Event = "discovered" | "lost" | "ack" | "nack" | "passthrough"
object Event {
  val discovered: "discovered" = "discovered"
  val lost: "lost" = "lost"
  val ack: "ack" = "ack"
  val nack: "nack" = "nack"
  val passthrough: "passthrough" = "passthrough"

  @inline def values = js.Array[Event](discovered, lost, ack, nack, passthrough)
}

type ExpressionType = "RuleName" | "MqttTopic"
object ExpressionType {
  val RuleName: "RuleName" = "RuleName"
  val MqttTopic: "MqttTopic" = "MqttTopic"

  @inline def values = js.Array[ExpressionType](RuleName, MqttTopic)
}

type PartnerType = "Sidewalk"
object PartnerType {
  val Sidewalk: "Sidewalk" = "Sidewalk"

  @inline def values = js.Array[PartnerType](Sidewalk)
}

/** The certificate chain algorithm provided by sidewalk.
  */
type SigningAlg = "Ed25519" | "P256r1"
object SigningAlg {
  val Ed25519: "Ed25519" = "Ed25519"
  val P256r1: "P256r1" = "P256r1"

  @inline def values = js.Array[SigningAlg](Ed25519, P256r1)
}

type WirelessDeviceIdType = "WirelessDeviceId" | "DevEui" | "ThingName"
object WirelessDeviceIdType {
  val WirelessDeviceId: "WirelessDeviceId" = "WirelessDeviceId"
  val DevEui: "DevEui" = "DevEui"
  val ThingName: "ThingName" = "ThingName"

  @inline def values = js.Array[WirelessDeviceIdType](WirelessDeviceId, DevEui, ThingName)
}

type WirelessDeviceType = "Sidewalk" | "LoRaWAN"
object WirelessDeviceType {
  val Sidewalk: "Sidewalk" = "Sidewalk"
  val LoRaWAN: "LoRaWAN" = "LoRaWAN"

  @inline def values = js.Array[WirelessDeviceType](Sidewalk, LoRaWAN)
}

type WirelessGatewayIdType = "GatewayEui" | "WirelessGatewayId" | "ThingName"
object WirelessGatewayIdType {
  val GatewayEui: "GatewayEui" = "GatewayEui"
  val WirelessGatewayId: "WirelessGatewayId" = "WirelessGatewayId"
  val ThingName: "ThingName" = "ThingName"

  @inline def values = js.Array[WirelessGatewayIdType](GatewayEui, WirelessGatewayId, ThingName)
}

type WirelessGatewayServiceType = "CUPS" | "LNS"
object WirelessGatewayServiceType {
  val CUPS: "CUPS" = "CUPS"
  val LNS: "LNS" = "LNS"

  @inline def values = js.Array[WirelessGatewayServiceType](CUPS, LNS)
}

type WirelessGatewayTaskDefinitionType = "UPDATE"
object WirelessGatewayTaskDefinitionType {
  val UPDATE: "UPDATE" = "UPDATE"

  @inline def values = js.Array[WirelessGatewayTaskDefinitionType](UPDATE)
}

type WirelessGatewayTaskStatus = "PENDING" | "IN_PROGRESS" | "FIRST_RETRY" | "SECOND_RETRY" | "COMPLETED" | "FAILED"
object WirelessGatewayTaskStatus {
  val PENDING: "PENDING" = "PENDING"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FIRST_RETRY: "FIRST_RETRY" = "FIRST_RETRY"
  val SECOND_RETRY: "SECOND_RETRY" = "SECOND_RETRY"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[WirelessGatewayTaskStatus](PENDING, IN_PROGRESS, FIRST_RETRY, SECOND_RETRY, COMPLETED, FAILED)
}
