package facade.amazonaws.services.migrationhub

import scalajs.js

type ApplicationStatus = "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED"
object ApplicationStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[ApplicationStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED)
}

type ResourceAttributeType = "IPV4_ADDRESS" | "IPV6_ADDRESS" | "MAC_ADDRESS" | "FQDN" | "VM_MANAGER_ID" | "VM_MANAGED_OBJECT_REFERENCE" | "VM_NAME" | "VM_PATH" | "BIOS_ID" | "MOTHERBOARD_SERIAL_NUMBER"
object ResourceAttributeType {
  inline val IPV4_ADDRESS: "IPV4_ADDRESS" = "IPV4_ADDRESS"
  inline val IPV6_ADDRESS: "IPV6_ADDRESS" = "IPV6_ADDRESS"
  inline val MAC_ADDRESS: "MAC_ADDRESS" = "MAC_ADDRESS"
  inline val FQDN: "FQDN" = "FQDN"
  inline val VM_MANAGER_ID: "VM_MANAGER_ID" = "VM_MANAGER_ID"
  inline val VM_MANAGED_OBJECT_REFERENCE: "VM_MANAGED_OBJECT_REFERENCE" = "VM_MANAGED_OBJECT_REFERENCE"
  inline val VM_NAME: "VM_NAME" = "VM_NAME"
  inline val VM_PATH: "VM_PATH" = "VM_PATH"
  inline val BIOS_ID: "BIOS_ID" = "BIOS_ID"
  inline val MOTHERBOARD_SERIAL_NUMBER: "MOTHERBOARD_SERIAL_NUMBER" = "MOTHERBOARD_SERIAL_NUMBER"

  inline def values: js.Array[ResourceAttributeType] = js.Array(IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN, VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID, MOTHERBOARD_SERIAL_NUMBER)
}

type Status = "NOT_STARTED" | "IN_PROGRESS" | "FAILED" | "COMPLETED"
object Status {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[Status] = js.Array(NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED)
}
