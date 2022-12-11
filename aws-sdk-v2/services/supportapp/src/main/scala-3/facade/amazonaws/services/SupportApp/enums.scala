package facade.amazonaws.services.supportapp

import scalajs.js

type AccountType = "management" | "member"
object AccountType {
  inline val management: "management" = "management"
  inline val member: "member" = "member"

  inline def values: js.Array[AccountType] = js.Array(management, member)
}

type NotificationSeverityLevel = "none" | "all" | "high"
object NotificationSeverityLevel {
  inline val none: "none" = "none"
  inline val all: "all" = "all"
  inline val high: "high" = "high"

  inline def values: js.Array[NotificationSeverityLevel] = js.Array(none, all, high)
}
