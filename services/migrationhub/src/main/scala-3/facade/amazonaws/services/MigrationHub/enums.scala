package facade.amazonaws.services.migrationhub

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ApplicationStatus extends js.Any
object ApplicationStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[ApplicationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ApplicationStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ApplicationStatus]

  @inline def values = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED)
}

@js.native
sealed trait ResourceAttributeType extends js.Any
object ResourceAttributeType {
  val IPV4_ADDRESS = "IPV4_ADDRESS".asInstanceOf[ResourceAttributeType]
  val IPV6_ADDRESS = "IPV6_ADDRESS".asInstanceOf[ResourceAttributeType]
  val MAC_ADDRESS = "MAC_ADDRESS".asInstanceOf[ResourceAttributeType]
  val FQDN = "FQDN".asInstanceOf[ResourceAttributeType]
  val VM_MANAGER_ID = "VM_MANAGER_ID".asInstanceOf[ResourceAttributeType]
  val VM_MANAGED_OBJECT_REFERENCE = "VM_MANAGED_OBJECT_REFERENCE".asInstanceOf[ResourceAttributeType]
  val VM_NAME = "VM_NAME".asInstanceOf[ResourceAttributeType]
  val VM_PATH = "VM_PATH".asInstanceOf[ResourceAttributeType]
  val BIOS_ID = "BIOS_ID".asInstanceOf[ResourceAttributeType]
  val MOTHERBOARD_SERIAL_NUMBER = "MOTHERBOARD_SERIAL_NUMBER".asInstanceOf[ResourceAttributeType]

  @inline def values = js.Array(IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN, VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID, MOTHERBOARD_SERIAL_NUMBER)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[Status]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[Status]
  val FAILED = "FAILED".asInstanceOf[Status]
  val COMPLETED = "COMPLETED".asInstanceOf[Status]

  @inline def values = js.Array(NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED)
}
