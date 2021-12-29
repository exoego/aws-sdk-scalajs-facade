package facade.amazonaws.services.connectcontactlens

import scalajs._

type SentimentValue = "POSITIVE" | "NEUTRAL" | "NEGATIVE"
object SentimentValue {
  inline val POSITIVE: "POSITIVE" = "POSITIVE"
  inline val NEUTRAL: "NEUTRAL" = "NEUTRAL"
  inline val NEGATIVE: "NEGATIVE" = "NEGATIVE"

  inline def values: js.Array[SentimentValue] = js.Array(POSITIVE, NEUTRAL, NEGATIVE)
}
