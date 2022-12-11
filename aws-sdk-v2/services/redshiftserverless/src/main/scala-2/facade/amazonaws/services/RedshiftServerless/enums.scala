package facade.amazonaws.services.redshiftserverless

import scalajs.js

@js.native
sealed trait LogExport extends js.Any
object LogExport {
  val useractivitylog = "useractivitylog".asInstanceOf[LogExport]
  val userlog = "userlog".asInstanceOf[LogExport]
  val connectionlog = "connectionlog".asInstanceOf[LogExport]

  @inline def values: js.Array[LogExport] = js.Array(useractivitylog, userlog, connectionlog)
}

@js.native
sealed trait NamespaceStatus extends js.Any
object NamespaceStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[NamespaceStatus]
  val MODIFYING = "MODIFYING".asInstanceOf[NamespaceStatus]
  val DELETING = "DELETING".asInstanceOf[NamespaceStatus]

  @inline def values: js.Array[NamespaceStatus] = js.Array(AVAILABLE, MODIFYING, DELETING)
}

@js.native
sealed trait SnapshotStatus extends js.Any
object SnapshotStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[SnapshotStatus]
  val CREATING = "CREATING".asInstanceOf[SnapshotStatus]
  val DELETED = "DELETED".asInstanceOf[SnapshotStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[SnapshotStatus]
  val FAILED = "FAILED".asInstanceOf[SnapshotStatus]
  val COPYING = "COPYING".asInstanceOf[SnapshotStatus]

  @inline def values: js.Array[SnapshotStatus] = js.Array(AVAILABLE, CREATING, DELETED, CANCELLED, FAILED, COPYING)
}

@js.native
sealed trait UsageLimitBreachAction extends js.Any
object UsageLimitBreachAction {
  val log = "log".asInstanceOf[UsageLimitBreachAction]
  val `emit-metric` = "emit-metric".asInstanceOf[UsageLimitBreachAction]
  val deactivate = "deactivate".asInstanceOf[UsageLimitBreachAction]

  @inline def values: js.Array[UsageLimitBreachAction] = js.Array(log, `emit-metric`, deactivate)
}

@js.native
sealed trait UsageLimitPeriod extends js.Any
object UsageLimitPeriod {
  val daily = "daily".asInstanceOf[UsageLimitPeriod]
  val weekly = "weekly".asInstanceOf[UsageLimitPeriod]
  val monthly = "monthly".asInstanceOf[UsageLimitPeriod]

  @inline def values: js.Array[UsageLimitPeriod] = js.Array(daily, weekly, monthly)
}

@js.native
sealed trait UsageLimitUsageType extends js.Any
object UsageLimitUsageType {
  val `serverless-compute` = "serverless-compute".asInstanceOf[UsageLimitUsageType]
  val `cross-region-datasharing` = "cross-region-datasharing".asInstanceOf[UsageLimitUsageType]

  @inline def values: js.Array[UsageLimitUsageType] = js.Array(`serverless-compute`, `cross-region-datasharing`)
}

@js.native
sealed trait WorkgroupStatus extends js.Any
object WorkgroupStatus {
  val CREATING = "CREATING".asInstanceOf[WorkgroupStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[WorkgroupStatus]
  val MODIFYING = "MODIFYING".asInstanceOf[WorkgroupStatus]
  val DELETING = "DELETING".asInstanceOf[WorkgroupStatus]

  @inline def values: js.Array[WorkgroupStatus] = js.Array(CREATING, AVAILABLE, MODIFYING, DELETING)
}
