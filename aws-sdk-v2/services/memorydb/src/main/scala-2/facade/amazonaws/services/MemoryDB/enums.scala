package facade.amazonaws.services.memorydb

import scalajs.js

@js.native
sealed trait AZStatus extends js.Any
object AZStatus {
  val singleaz = "singleaz".asInstanceOf[AZStatus]
  val multiaz = "multiaz".asInstanceOf[AZStatus]

  @inline def values: js.Array[AZStatus] = js.Array(singleaz, multiaz)
}

@js.native
sealed trait AuthenticationType extends js.Any
object AuthenticationType {
  val password = "password".asInstanceOf[AuthenticationType]
  val `no-password` = "no-password".asInstanceOf[AuthenticationType]

  @inline def values: js.Array[AuthenticationType] = js.Array(password, `no-password`)
}

@js.native
sealed trait DataTieringStatus extends js.Any
object DataTieringStatus {
  val `true` = "true".asInstanceOf[DataTieringStatus]
  val `false` = "false".asInstanceOf[DataTieringStatus]

  @inline def values: js.Array[DataTieringStatus] = js.Array(`true`, `false`)
}

@js.native
sealed trait InputAuthenticationType extends js.Any
object InputAuthenticationType {
  val password = "password".asInstanceOf[InputAuthenticationType]

  @inline def values: js.Array[InputAuthenticationType] = js.Array(password)
}

@js.native
sealed trait ServiceUpdateStatus extends js.Any
object ServiceUpdateStatus {
  val available = "available".asInstanceOf[ServiceUpdateStatus]
  val `in-progress` = "in-progress".asInstanceOf[ServiceUpdateStatus]
  val complete = "complete".asInstanceOf[ServiceUpdateStatus]
  val scheduled = "scheduled".asInstanceOf[ServiceUpdateStatus]

  @inline def values: js.Array[ServiceUpdateStatus] = js.Array(available, `in-progress`, complete, scheduled)
}

@js.native
sealed trait ServiceUpdateType extends js.Any
object ServiceUpdateType {
  val `security-update` = "security-update".asInstanceOf[ServiceUpdateType]

  @inline def values: js.Array[ServiceUpdateType] = js.Array(`security-update`)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val node = "node".asInstanceOf[SourceType]
  val `parameter-group` = "parameter-group".asInstanceOf[SourceType]
  val `subnet-group` = "subnet-group".asInstanceOf[SourceType]
  val cluster = "cluster".asInstanceOf[SourceType]
  val user = "user".asInstanceOf[SourceType]
  val acl = "acl".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(node, `parameter-group`, `subnet-group`, cluster, user, acl)
}
