package facade.amazonaws.services.macie

import scalajs.js

@js.native
sealed trait S3ContinuousClassificationType extends js.Any
object S3ContinuousClassificationType {
  val FULL = "FULL".asInstanceOf[S3ContinuousClassificationType]

  @inline def values: js.Array[S3ContinuousClassificationType] = js.Array(FULL)
}

@js.native
sealed trait S3OneTimeClassificationType extends js.Any
object S3OneTimeClassificationType {
  val FULL = "FULL".asInstanceOf[S3OneTimeClassificationType]
  val NONE = "NONE".asInstanceOf[S3OneTimeClassificationType]

  @inline def values: js.Array[S3OneTimeClassificationType] = js.Array(FULL, NONE)
}
