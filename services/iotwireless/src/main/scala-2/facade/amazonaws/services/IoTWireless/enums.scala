package facade.amazonaws.services.iotwireless

import scalajs._
import scala.scalajs.js.|

/** Sidewalk device battery level.
  */
@js.native
sealed trait BatteryLevel extends js.Any
object BatteryLevel {
  val normal = "normal".asInstanceOf[BatteryLevel]
  val low = "low".asInstanceOf[BatteryLevel]
  val critical = "critical".asInstanceOf[BatteryLevel]

  @inline def values = js.Array(normal, low, critical)
}

@js.native
sealed trait ConnectionStatus extends js.Any
object ConnectionStatus {
  val Connected = "Connected".asInstanceOf[ConnectionStatus]
  val Disconnected = "Disconnected".asInstanceOf[ConnectionStatus]

  @inline def values = js.Array(Connected, Disconnected)
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

  @inline def values = js.Array(Provisioned, RegisteredNotSeen, RegisteredReachable, RegisteredUnreachable)
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

  @inline def values = js.Array(discovered, lost, ack, nack, passthrough)
}

@js.native
sealed trait ExpressionType extends js.Any
object ExpressionType {
  val RuleName = "RuleName".asInstanceOf[ExpressionType]
  val MqttTopic = "MqttTopic".asInstanceOf[ExpressionType]

  @inline def values = js.Array(RuleName, MqttTopic)
}

@js.native
sealed trait PartnerType extends js.Any
object PartnerType {
  val Sidewalk = "Sidewalk".asInstanceOf[PartnerType]

  @inline def values = js.Array(Sidewalk)
}

/** The certificate chain algorithm provided by sidewalk.
  */
@js.native
sealed trait SigningAlg extends js.Any
object SigningAlg {
  val Ed25519 = "Ed25519".asInstanceOf[SigningAlg]
  val P256r1 = "P256r1".asInstanceOf[SigningAlg]

  @inline def values = js.Array(Ed25519, P256r1)
}

@js.native
sealed trait WirelessDeviceIdType extends js.Any
object WirelessDeviceIdType {
  val WirelessDeviceId = "WirelessDeviceId".asInstanceOf[WirelessDeviceIdType]
  val DevEui = "DevEui".asInstanceOf[WirelessDeviceIdType]
  val ThingName = "ThingName".asInstanceOf[WirelessDeviceIdType]

  @inline def values = js.Array(WirelessDeviceId, DevEui, ThingName)
}

@js.native
sealed trait WirelessDeviceType extends js.Any
object WirelessDeviceType {
  val Sidewalk = "Sidewalk".asInstanceOf[WirelessDeviceType]
  val LoRaWAN = "LoRaWAN".asInstanceOf[WirelessDeviceType]

  @inline def values = js.Array(Sidewalk, LoRaWAN)
}

@js.native
sealed trait WirelessGatewayIdType extends js.Any
object WirelessGatewayIdType {
  val GatewayEui = "GatewayEui".asInstanceOf[WirelessGatewayIdType]
  val WirelessGatewayId = "WirelessGatewayId".asInstanceOf[WirelessGatewayIdType]
  val ThingName = "ThingName".asInstanceOf[WirelessGatewayIdType]

  @inline def values = js.Array(GatewayEui, WirelessGatewayId, ThingName)
}

@js.native
sealed trait WirelessGatewayServiceType extends js.Any
object WirelessGatewayServiceType {
  val CUPS = "CUPS".asInstanceOf[WirelessGatewayServiceType]
  val LNS = "LNS".asInstanceOf[WirelessGatewayServiceType]

  @inline def values = js.Array(CUPS, LNS)
}

@js.native
sealed trait WirelessGatewayTaskDefinitionType extends js.Any
object WirelessGatewayTaskDefinitionType {
  val UPDATE = "UPDATE".asInstanceOf[WirelessGatewayTaskDefinitionType]

  @inline def values = js.Array(UPDATE)
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

  @inline def values = js.Array(PENDING, IN_PROGRESS, FIRST_RETRY, SECOND_RETRY, COMPLETED, FAILED)
}

