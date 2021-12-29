package facade.amazonaws.services.connectcontactlens

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait SentimentValue extends js.Any
object SentimentValue {
  val POSITIVE = "POSITIVE".asInstanceOf[SentimentValue]
  val NEUTRAL = "NEUTRAL".asInstanceOf[SentimentValue]
  val NEGATIVE = "NEGATIVE".asInstanceOf[SentimentValue]

  @inline def values = js.Array(POSITIVE, NEUTRAL, NEGATIVE)
}

