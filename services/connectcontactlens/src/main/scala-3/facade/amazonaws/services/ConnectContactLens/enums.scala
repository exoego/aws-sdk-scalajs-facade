package facade.amazonaws.services.connectcontactlens

import scalajs._

type SentimentValue = "POSITIVE" | "NEUTRAL" | "NEGATIVE"
object SentimentValue {
  val POSITIVE: "POSITIVE" = "POSITIVE"
  val NEUTRAL: "NEUTRAL" = "NEUTRAL"
  val NEGATIVE: "NEGATIVE" = "NEGATIVE"

  @inline def values = js.Array[SentimentValue](POSITIVE, NEUTRAL, NEGATIVE)
}
