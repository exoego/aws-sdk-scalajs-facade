package facade.amazonaws.services.pricing

import scalajs._

type FilterType = "TERM_MATCH"
object FilterType {
  val TERM_MATCH: "TERM_MATCH" = "TERM_MATCH"

  @inline def values = js.Array[FilterType](TERM_MATCH)
}
