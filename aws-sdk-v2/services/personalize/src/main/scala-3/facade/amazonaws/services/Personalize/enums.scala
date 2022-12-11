package facade.amazonaws.services.personalize

import scalajs.js

type Domain = "ECOMMERCE" | "VIDEO_ON_DEMAND"
object Domain {
  inline val ECOMMERCE: "ECOMMERCE" = "ECOMMERCE"
  inline val VIDEO_ON_DEMAND: "VIDEO_ON_DEMAND" = "VIDEO_ON_DEMAND"

  inline def values: js.Array[Domain] = js.Array(ECOMMERCE, VIDEO_ON_DEMAND)
}

type ImportMode = "FULL" | "INCREMENTAL"
object ImportMode {
  inline val FULL: "FULL" = "FULL"
  inline val INCREMENTAL: "INCREMENTAL" = "INCREMENTAL"

  inline def values: js.Array[ImportMode] = js.Array(FULL, INCREMENTAL)
}

type IngestionMode = "BULK" | "PUT" | "ALL"
object IngestionMode {
  inline val BULK: "BULK" = "BULK"
  inline val PUT: "PUT" = "PUT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[IngestionMode] = js.Array(BULK, PUT, ALL)
}

type ObjectiveSensitivity = "LOW" | "MEDIUM" | "HIGH" | "OFF"
object ObjectiveSensitivity {
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[ObjectiveSensitivity] = js.Array(LOW, MEDIUM, HIGH, OFF)
}

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
