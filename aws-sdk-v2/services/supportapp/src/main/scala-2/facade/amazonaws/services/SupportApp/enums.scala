package facade.amazonaws.services.supportapp

import scalajs.js

@js.native
sealed trait AccountType extends js.Any
object AccountType {
  val management = "management".asInstanceOf[AccountType]
  val member = "member".asInstanceOf[AccountType]

  @inline def values: js.Array[AccountType] = js.Array(management, member)
}

@js.native
sealed trait NotificationSeverityLevel extends js.Any
object NotificationSeverityLevel {
  val none = "none".asInstanceOf[NotificationSeverityLevel]
  val all = "all".asInstanceOf[NotificationSeverityLevel]
  val high = "high".asInstanceOf[NotificationSeverityLevel]

  @inline def values: js.Array[NotificationSeverityLevel] = js.Array(none, all, high)
}
