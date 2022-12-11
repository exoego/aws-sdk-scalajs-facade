package facade.amazonaws.services.iotdata

import scalajs.js

@js.native
sealed trait PayloadFormatIndicator extends js.Any
object PayloadFormatIndicator {
  val UNSPECIFIED_BYTES = "UNSPECIFIED_BYTES".asInstanceOf[PayloadFormatIndicator]
  val UTF8_DATA = "UTF8_DATA".asInstanceOf[PayloadFormatIndicator]

  @inline def values: js.Array[PayloadFormatIndicator] = js.Array(UNSPECIFIED_BYTES, UTF8_DATA)
}
