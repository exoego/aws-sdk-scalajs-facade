package facade.amazonaws.services.health

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait entityStatusCode extends js.Any
object entityStatusCode {
  val IMPAIRED = "IMPAIRED".asInstanceOf[entityStatusCode]
  val UNIMPAIRED = "UNIMPAIRED".asInstanceOf[entityStatusCode]
  val UNKNOWN = "UNKNOWN".asInstanceOf[entityStatusCode]

  @inline def values = js.Array(IMPAIRED, UNIMPAIRED, UNKNOWN)
}

@js.native
sealed trait eventAggregateField extends js.Any
object eventAggregateField {
  val eventTypeCategory = "eventTypeCategory".asInstanceOf[eventAggregateField]

  @inline def values = js.Array(eventTypeCategory)
}

@js.native
sealed trait eventScopeCode extends js.Any
object eventScopeCode {
  val PUBLIC = "PUBLIC".asInstanceOf[eventScopeCode]
  val ACCOUNT_SPECIFIC = "ACCOUNT_SPECIFIC".asInstanceOf[eventScopeCode]
  val NONE = "NONE".asInstanceOf[eventScopeCode]

  @inline def values = js.Array(PUBLIC, ACCOUNT_SPECIFIC, NONE)
}

@js.native
sealed trait eventStatusCode extends js.Any
object eventStatusCode {
  val open = "open".asInstanceOf[eventStatusCode]
  val closed = "closed".asInstanceOf[eventStatusCode]
  val upcoming = "upcoming".asInstanceOf[eventStatusCode]

  @inline def values = js.Array(open, closed, upcoming)
}

@js.native
sealed trait eventTypeCategory extends js.Any
object eventTypeCategory {
  val issue = "issue".asInstanceOf[eventTypeCategory]
  val accountNotification = "accountNotification".asInstanceOf[eventTypeCategory]
  val scheduledChange = "scheduledChange".asInstanceOf[eventTypeCategory]
  val investigation = "investigation".asInstanceOf[eventTypeCategory]

  @inline def values = js.Array(issue, accountNotification, scheduledChange, investigation)
}

