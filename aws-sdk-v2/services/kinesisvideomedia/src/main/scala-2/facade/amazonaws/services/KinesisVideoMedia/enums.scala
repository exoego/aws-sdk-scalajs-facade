package facade.amazonaws.services.kinesisvideomedia

import scalajs.js

@js.native
sealed trait StartSelectorType extends js.Any
object StartSelectorType {
  val FRAGMENT_NUMBER = "FRAGMENT_NUMBER".asInstanceOf[StartSelectorType]
  val SERVER_TIMESTAMP = "SERVER_TIMESTAMP".asInstanceOf[StartSelectorType]
  val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[StartSelectorType]
  val NOW = "NOW".asInstanceOf[StartSelectorType]
  val EARLIEST = "EARLIEST".asInstanceOf[StartSelectorType]
  val CONTINUATION_TOKEN = "CONTINUATION_TOKEN".asInstanceOf[StartSelectorType]

  @inline def values: js.Array[StartSelectorType] = js.Array(FRAGMENT_NUMBER, SERVER_TIMESTAMP, PRODUCER_TIMESTAMP, NOW, EARLIEST, CONTINUATION_TOKEN)
}
