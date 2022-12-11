package facade.amazonaws.services.iotdata

import scalajs.js

type PayloadFormatIndicator = "UNSPECIFIED_BYTES" | "UTF8_DATA"
object PayloadFormatIndicator {
  inline val UNSPECIFIED_BYTES: "UNSPECIFIED_BYTES" = "UNSPECIFIED_BYTES"
  inline val UTF8_DATA: "UTF8_DATA" = "UTF8_DATA"

  inline def values: js.Array[PayloadFormatIndicator] = js.Array(UNSPECIFIED_BYTES, UTF8_DATA)
}
