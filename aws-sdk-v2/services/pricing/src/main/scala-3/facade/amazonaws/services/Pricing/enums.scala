package facade.amazonaws.services.pricing

import scalajs.js

type FilterType = "TERM_MATCH"
object FilterType {
  inline val TERM_MATCH: "TERM_MATCH" = "TERM_MATCH"

  inline def values: js.Array[FilterType] = js.Array(TERM_MATCH)
}
