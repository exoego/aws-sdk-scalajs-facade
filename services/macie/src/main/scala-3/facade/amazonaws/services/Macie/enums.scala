package facade.amazonaws.services.macie

import scalajs._

type S3ContinuousClassificationType = "FULL"
object S3ContinuousClassificationType {
  inline val FULL: "FULL" = "FULL"

  inline def values: js.Array[S3ContinuousClassificationType] = js.Array(FULL)
}

type S3OneTimeClassificationType = "FULL" | "NONE"
object S3OneTimeClassificationType {
  inline val FULL: "FULL" = "FULL"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[S3OneTimeClassificationType] = js.Array(FULL, NONE)
}
