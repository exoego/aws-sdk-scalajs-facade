package facade.amazonaws.services.schemas

import scalajs._

type CodeGenerationStatus = "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED"
object CodeGenerationStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"

  inline def values: js.Array[CodeGenerationStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
}

type DiscovererState = "STARTED" | "STOPPED"
object DiscovererState {
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[DiscovererState] = js.Array(STARTED, STOPPED)
}

type Type = "OpenApi3" | "JSONSchemaDraft4"
object Type {
  inline val OpenApi3: "OpenApi3" = "OpenApi3"
  inline val JSONSchemaDraft4: "JSONSchemaDraft4" = "JSONSchemaDraft4"

  inline def values: js.Array[Type] = js.Array(OpenApi3, JSONSchemaDraft4)
}
