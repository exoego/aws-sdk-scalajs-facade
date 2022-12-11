package facade.amazonaws.services.redshiftserverless

import scalajs.js

type LogExport = "useractivitylog" | "userlog" | "connectionlog"
object LogExport {
  inline val useractivitylog: "useractivitylog" = "useractivitylog"
  inline val userlog: "userlog" = "userlog"
  inline val connectionlog: "connectionlog" = "connectionlog"

  inline def values: js.Array[LogExport] = js.Array(useractivitylog, userlog, connectionlog)
}

type NamespaceStatus = "AVAILABLE" | "MODIFYING" | "DELETING"
object NamespaceStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val MODIFYING: "MODIFYING" = "MODIFYING"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[NamespaceStatus] = js.Array(AVAILABLE, MODIFYING, DELETING)
}

type SnapshotStatus = "AVAILABLE" | "CREATING" | "DELETED" | "CANCELLED" | "FAILED" | "COPYING"
object SnapshotStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COPYING: "COPYING" = "COPYING"

  inline def values: js.Array[SnapshotStatus] = js.Array(AVAILABLE, CREATING, DELETED, CANCELLED, FAILED, COPYING)
}

type UsageLimitBreachAction = "log" | "emit-metric" | "deactivate"
object UsageLimitBreachAction {
  inline val log: "log" = "log"
  inline val `emit-metric`: "emit-metric" = "emit-metric"
  inline val deactivate: "deactivate" = "deactivate"

  inline def values: js.Array[UsageLimitBreachAction] = js.Array(log, `emit-metric`, deactivate)
}

type UsageLimitPeriod = "daily" | "weekly" | "monthly"
object UsageLimitPeriod {
  inline val daily: "daily" = "daily"
  inline val weekly: "weekly" = "weekly"
  inline val monthly: "monthly" = "monthly"

  inline def values: js.Array[UsageLimitPeriod] = js.Array(daily, weekly, monthly)
}

type UsageLimitUsageType = "serverless-compute" | "cross-region-datasharing"
object UsageLimitUsageType {
  inline val `serverless-compute`: "serverless-compute" = "serverless-compute"
  inline val `cross-region-datasharing`: "cross-region-datasharing" = "cross-region-datasharing"

  inline def values: js.Array[UsageLimitUsageType] = js.Array(`serverless-compute`, `cross-region-datasharing`)
}

type WorkgroupStatus = "CREATING" | "AVAILABLE" | "MODIFYING" | "DELETING"
object WorkgroupStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val MODIFYING: "MODIFYING" = "MODIFYING"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[WorkgroupStatus] = js.Array(CREATING, AVAILABLE, MODIFYING, DELETING)
}
