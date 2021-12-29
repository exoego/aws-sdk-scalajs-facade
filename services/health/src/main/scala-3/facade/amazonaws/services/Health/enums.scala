package facade.amazonaws.services.health

import scalajs._

type entityStatusCode = "IMPAIRED" | "UNIMPAIRED" | "UNKNOWN"
object entityStatusCode {
  val IMPAIRED: "IMPAIRED" = "IMPAIRED"
  val UNIMPAIRED: "UNIMPAIRED" = "UNIMPAIRED"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[entityStatusCode](IMPAIRED, UNIMPAIRED, UNKNOWN)
}

type eventAggregateField = "eventTypeCategory"
object eventAggregateField {
  val eventTypeCategory: "eventTypeCategory" = "eventTypeCategory"

  @inline def values = js.Array[eventAggregateField](eventTypeCategory)
}

type eventScopeCode = "PUBLIC" | "ACCOUNT_SPECIFIC" | "NONE"
object eventScopeCode {
  val PUBLIC: "PUBLIC" = "PUBLIC"
  val ACCOUNT_SPECIFIC: "ACCOUNT_SPECIFIC" = "ACCOUNT_SPECIFIC"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[eventScopeCode](PUBLIC, ACCOUNT_SPECIFIC, NONE)
}

type eventStatusCode = "open" | "closed" | "upcoming"
object eventStatusCode {
  val open: "open" = "open"
  val closed: "closed" = "closed"
  val upcoming: "upcoming" = "upcoming"

  @inline def values = js.Array[eventStatusCode](open, closed, upcoming)
}

type eventTypeCategory = "issue" | "accountNotification" | "scheduledChange" | "investigation"
object eventTypeCategory {
  val issue: "issue" = "issue"
  val accountNotification: "accountNotification" = "accountNotification"
  val scheduledChange: "scheduledChange" = "scheduledChange"
  val investigation: "investigation" = "investigation"

  @inline def values = js.Array[eventTypeCategory](issue, accountNotification, scheduledChange, investigation)
}
