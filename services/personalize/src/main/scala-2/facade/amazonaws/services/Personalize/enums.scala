package facade.amazonaws.services.personalize

import scalajs.js

@js.native
sealed trait RecipeProvider extends js.Any
object RecipeProvider {
  val SERVICE = "SERVICE".asInstanceOf[RecipeProvider]

  @inline def values: js.Array[RecipeProvider] = js.Array(SERVICE)
}

@js.native
sealed trait TrainingMode extends js.Any
object TrainingMode {
  val FULL = "FULL".asInstanceOf[TrainingMode]
  val UPDATE = "UPDATE".asInstanceOf[TrainingMode]

  @inline def values: js.Array[TrainingMode] = js.Array(FULL, UPDATE)
}
