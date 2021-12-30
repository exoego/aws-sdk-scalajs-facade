package facade.amazonaws.services.connectcontactlens

import scalajs.js

@js.native
sealed trait SentimentValue extends js.Any
object SentimentValue {
  val POSITIVE = "POSITIVE".asInstanceOf[SentimentValue]
  val NEUTRAL = "NEUTRAL".asInstanceOf[SentimentValue]
  val NEGATIVE = "NEGATIVE".asInstanceOf[SentimentValue]

  @inline def values: js.Array[SentimentValue] = js.Array(POSITIVE, NEUTRAL, NEGATIVE)
}
