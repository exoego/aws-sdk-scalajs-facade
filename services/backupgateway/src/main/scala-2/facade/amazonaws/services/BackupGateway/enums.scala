package facade.amazonaws.services.backupgateway

import scalajs.js

@js.native
sealed trait GatewayType extends js.Any
object GatewayType {
  val BACKUP_VM = "BACKUP_VM".asInstanceOf[GatewayType]

  @inline def values: js.Array[GatewayType] = js.Array(BACKUP_VM)
}

@js.native
sealed trait HypervisorState extends js.Any
object HypervisorState {
  val PENDING = "PENDING".asInstanceOf[HypervisorState]
  val ONLINE = "ONLINE".asInstanceOf[HypervisorState]
  val OFFLINE = "OFFLINE".asInstanceOf[HypervisorState]
  val ERROR = "ERROR".asInstanceOf[HypervisorState]

  @inline def values: js.Array[HypervisorState] = js.Array(PENDING, ONLINE, OFFLINE, ERROR)
}
