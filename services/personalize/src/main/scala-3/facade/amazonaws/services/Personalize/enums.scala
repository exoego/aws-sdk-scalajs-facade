package facade.amazonaws.services.personalize

import scalajs.js

type RecipeProvider = "SERVICE"
object RecipeProvider {
  inline val SERVICE: "SERVICE" = "SERVICE"

  inline def values: js.Array[RecipeProvider] = js.Array(SERVICE)
}

type TrainingMode = "FULL" | "UPDATE"
object TrainingMode {
  inline val FULL: "FULL" = "FULL"
  inline val UPDATE: "UPDATE" = "UPDATE"

  inline def values: js.Array[TrainingMode] = js.Array(FULL, UPDATE)
}
