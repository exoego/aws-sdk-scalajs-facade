package facade.amazonaws.services.health

import scalajs._

type entityStatusCode = "IMPAIRED" | "UNIMPAIRED" | "UNKNOWN"
object entityStatusCode {
  inline val IMPAIRED: "IMPAIRED" = "IMPAIRED"
  inline val UNIMPAIRED: "UNIMPAIRED" = "UNIMPAIRED"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[entityStatusCode] = js.Array(IMPAIRED, UNIMPAIRED, UNKNOWN)
}

type eventAggregateField = "eventTypeCategory"
object eventAggregateField {
  inline val eventTypeCategory: "eventTypeCategory" = "eventTypeCategory"

  inline def values: js.Array[eventAggregateField] = js.Array(eventTypeCategory)
}

type eventScopeCode = "PUBLIC" | "ACCOUNT_SPECIFIC" | "NONE"
object eventScopeCode {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val ACCOUNT_SPECIFIC: "ACCOUNT_SPECIFIC" = "ACCOUNT_SPECIFIC"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[eventScopeCode] = js.Array(PUBLIC, ACCOUNT_SPECIFIC, NONE)
}

type eventStatusCode = "open" | "closed" | "upcoming"
object eventStatusCode {
  inline val open: "open" = "open"
  inline val closed: "closed" = "closed"
  inline val upcoming: "upcoming" = "upcoming"

  inline def values: js.Array[eventStatusCode] = js.Array(open, closed, upcoming)
}

type eventTypeCategory = "issue" | "accountNotification" | "scheduledChange" | "investigation"
object eventTypeCategory {
  inline val issue: "issue" = "issue"
  inline val accountNotification: "accountNotification" = "accountNotification"
  inline val scheduledChange: "scheduledChange" = "scheduledChange"
  inline val investigation: "investigation" = "investigation"

  inline def values: js.Array[eventTypeCategory] = js.Array(issue, accountNotification, scheduledChange, investigation)
}
