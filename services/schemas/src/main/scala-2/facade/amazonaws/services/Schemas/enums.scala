package facade.amazonaws.services.schemas

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait CodeGenerationStatus extends js.Any
object CodeGenerationStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[CodeGenerationStatus]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[CodeGenerationStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[CodeGenerationStatus]

  @inline def values = js.Array(CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
}

@js.native
sealed trait DiscovererState extends js.Any
object DiscovererState {
  val STARTED = "STARTED".asInstanceOf[DiscovererState]
  val STOPPED = "STOPPED".asInstanceOf[DiscovererState]

  @inline def values = js.Array(STARTED, STOPPED)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val OpenApi3 = "OpenApi3".asInstanceOf[Type]
  val JSONSchemaDraft4 = "JSONSchemaDraft4".asInstanceOf[Type]

  @inline def values = js.Array(OpenApi3, JSONSchemaDraft4)
}

