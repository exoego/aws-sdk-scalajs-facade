package facade.amazonaws.services.mediastore

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ContainerLevelMetrics extends js.Any
object ContainerLevelMetrics {
  val ENABLED = "ENABLED".asInstanceOf[ContainerLevelMetrics]
  val DISABLED = "DISABLED".asInstanceOf[ContainerLevelMetrics]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ContainerStatus extends js.Any
object ContainerStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ContainerStatus]
  val CREATING = "CREATING".asInstanceOf[ContainerStatus]
  val DELETING = "DELETING".asInstanceOf[ContainerStatus]

  @inline def values = js.Array(ACTIVE, CREATING, DELETING)
}

@js.native
sealed trait MethodName extends js.Any
object MethodName {
  val PUT = "PUT".asInstanceOf[MethodName]
  val GET = "GET".asInstanceOf[MethodName]
  val DELETE = "DELETE".asInstanceOf[MethodName]
  val HEAD = "HEAD".asInstanceOf[MethodName]

  @inline def values = js.Array(PUT, GET, DELETE, HEAD)
}

