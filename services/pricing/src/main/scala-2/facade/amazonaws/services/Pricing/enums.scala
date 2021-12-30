package facade.amazonaws.services.pricing

import scalajs.js

@js.native
sealed trait FilterType extends js.Any
object FilterType {
  val TERM_MATCH = "TERM_MATCH".asInstanceOf[FilterType]

  @inline def values: js.Array[FilterType] = js.Array(TERM_MATCH)
}
