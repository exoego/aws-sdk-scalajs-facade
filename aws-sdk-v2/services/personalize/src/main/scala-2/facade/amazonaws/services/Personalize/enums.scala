package facade.amazonaws.services.personalize

import scalajs.js

@js.native
sealed trait Domain extends js.Any
object Domain {
  val ECOMMERCE = "ECOMMERCE".asInstanceOf[Domain]
  val VIDEO_ON_DEMAND = "VIDEO_ON_DEMAND".asInstanceOf[Domain]

  @inline def values: js.Array[Domain] = js.Array(ECOMMERCE, VIDEO_ON_DEMAND)
}

@js.native
sealed trait ImportMode extends js.Any
object ImportMode {
  val FULL = "FULL".asInstanceOf[ImportMode]
  val INCREMENTAL = "INCREMENTAL".asInstanceOf[ImportMode]

  @inline def values: js.Array[ImportMode] = js.Array(FULL, INCREMENTAL)
}

@js.native
sealed trait IngestionMode extends js.Any
object IngestionMode {
  val BULK = "BULK".asInstanceOf[IngestionMode]
  val PUT = "PUT".asInstanceOf[IngestionMode]
  val ALL = "ALL".asInstanceOf[IngestionMode]

  @inline def values: js.Array[IngestionMode] = js.Array(BULK, PUT, ALL)
}

@js.native
sealed trait ObjectiveSensitivity extends js.Any
object ObjectiveSensitivity {
  val LOW = "LOW".asInstanceOf[ObjectiveSensitivity]
  val MEDIUM = "MEDIUM".asInstanceOf[ObjectiveSensitivity]
  val HIGH = "HIGH".asInstanceOf[ObjectiveSensitivity]
  val OFF = "OFF".asInstanceOf[ObjectiveSensitivity]

  @inline def values: js.Array[ObjectiveSensitivity] = js.Array(LOW, MEDIUM, HIGH, OFF)
}

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
