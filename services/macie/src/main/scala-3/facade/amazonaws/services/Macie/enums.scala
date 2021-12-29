package facade.amazonaws.services.macie

import scalajs._

type S3ContinuousClassificationType = "FULL"
object S3ContinuousClassificationType {
  val FULL: "FULL" = "FULL"

  @inline def values = js.Array[S3ContinuousClassificationType](FULL)
}

type S3OneTimeClassificationType = "FULL" | "NONE"
object S3OneTimeClassificationType {
  val FULL: "FULL" = "FULL"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[S3OneTimeClassificationType](FULL, NONE)
}
