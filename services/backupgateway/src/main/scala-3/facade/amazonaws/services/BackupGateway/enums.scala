package facade.amazonaws.services.backupgateway

import scalajs.js

type GatewayType = "BACKUP_VM"
object GatewayType {
  inline val BACKUP_VM: "BACKUP_VM" = "BACKUP_VM"

  inline def values: js.Array[GatewayType] = js.Array(BACKUP_VM)
}

type HypervisorState = "PENDING" | "ONLINE" | "OFFLINE" | "ERROR"
object HypervisorState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ONLINE: "ONLINE" = "ONLINE"
  inline val OFFLINE: "OFFLINE" = "OFFLINE"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[HypervisorState] = js.Array(PENDING, ONLINE, OFFLINE, ERROR)
}
