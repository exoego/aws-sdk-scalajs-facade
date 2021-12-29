package facade.amazonaws.services.personalize

import scalajs._

type RecipeProvider = "SERVICE"
object RecipeProvider {
  val SERVICE: "SERVICE" = "SERVICE"

  @inline def values = js.Array[RecipeProvider](SERVICE)
}

type TrainingMode = "FULL" | "UPDATE"
object TrainingMode {
  val FULL: "FULL" = "FULL"
  val UPDATE: "UPDATE" = "UPDATE"

  @inline def values = js.Array[TrainingMode](FULL, UPDATE)
}
