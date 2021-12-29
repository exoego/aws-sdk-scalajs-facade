package facade.amazonaws.services.schemas

import scalajs._

type CodeGenerationStatus = "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED"
object CodeGenerationStatus {
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"

  @inline def values = js.Array[CodeGenerationStatus](CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
}

type DiscovererState = "STARTED" | "STOPPED"
object DiscovererState {
  val STARTED: "STARTED" = "STARTED"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[DiscovererState](STARTED, STOPPED)
}

type Type = "OpenApi3" | "JSONSchemaDraft4"
object Type {
  val OpenApi3: "OpenApi3" = "OpenApi3"
  val JSONSchemaDraft4: "JSONSchemaDraft4" = "JSONSchemaDraft4"

  @inline def values = js.Array[Type](OpenApi3, JSONSchemaDraft4)
}
