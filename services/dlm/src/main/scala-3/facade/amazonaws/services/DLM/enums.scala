package facade.amazonaws.services.dlm

import scalajs._

type EventSourceValues = "MANAGED_CWE"
object EventSourceValues {
  inline val MANAGED_CWE: "MANAGED_CWE" = "MANAGED_CWE"

  inline def values: js.Array[EventSourceValues] = js.Array(MANAGED_CWE)
}

type EventTypeValues = "shareSnapshot"
object EventTypeValues {
  inline val shareSnapshot: "shareSnapshot" = "shareSnapshot"

  inline def values: js.Array[EventTypeValues] = js.Array(shareSnapshot)
}

type GettablePolicyStateValues = "ENABLED" | "DISABLED" | "ERROR"
object GettablePolicyStateValues {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[GettablePolicyStateValues] = js.Array(ENABLED, DISABLED, ERROR)
}

type IntervalUnitValues = "HOURS"
object IntervalUnitValues {
  inline val HOURS: "HOURS" = "HOURS"

  inline def values: js.Array[IntervalUnitValues] = js.Array(HOURS)
}

type LocationValues = "CLOUD" | "OUTPOST_LOCAL"
object LocationValues {
  inline val CLOUD: "CLOUD" = "CLOUD"
  inline val OUTPOST_LOCAL: "OUTPOST_LOCAL" = "OUTPOST_LOCAL"

  inline def values: js.Array[LocationValues] = js.Array(CLOUD, OUTPOST_LOCAL)
}

type PolicyTypeValues = "EBS_SNAPSHOT_MANAGEMENT" | "IMAGE_MANAGEMENT" | "EVENT_BASED_POLICY"
object PolicyTypeValues {
  inline val EBS_SNAPSHOT_MANAGEMENT: "EBS_SNAPSHOT_MANAGEMENT" = "EBS_SNAPSHOT_MANAGEMENT"
  inline val IMAGE_MANAGEMENT: "IMAGE_MANAGEMENT" = "IMAGE_MANAGEMENT"
  inline val EVENT_BASED_POLICY: "EVENT_BASED_POLICY" = "EVENT_BASED_POLICY"

  inline def values: js.Array[PolicyTypeValues] = js.Array(EBS_SNAPSHOT_MANAGEMENT, IMAGE_MANAGEMENT, EVENT_BASED_POLICY)
}

type ResourceLocationValues = "CLOUD" | "OUTPOST"
object ResourceLocationValues {
  inline val CLOUD: "CLOUD" = "CLOUD"
  inline val OUTPOST: "OUTPOST" = "OUTPOST"

  inline def values: js.Array[ResourceLocationValues] = js.Array(CLOUD, OUTPOST)
}

type ResourceTypeValues = "VOLUME" | "INSTANCE"
object ResourceTypeValues {
  inline val VOLUME: "VOLUME" = "VOLUME"
  inline val INSTANCE: "INSTANCE" = "INSTANCE"

  inline def values: js.Array[ResourceTypeValues] = js.Array(VOLUME, INSTANCE)
}

type RetentionIntervalUnitValues = "DAYS" | "WEEKS" | "MONTHS" | "YEARS"
object RetentionIntervalUnitValues {
  inline val DAYS: "DAYS" = "DAYS"
  inline val WEEKS: "WEEKS" = "WEEKS"
  inline val MONTHS: "MONTHS" = "MONTHS"
  inline val YEARS: "YEARS" = "YEARS"

  inline def values: js.Array[RetentionIntervalUnitValues] = js.Array(DAYS, WEEKS, MONTHS, YEARS)
}

type SettablePolicyStateValues = "ENABLED" | "DISABLED"
object SettablePolicyStateValues {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[SettablePolicyStateValues] = js.Array(ENABLED, DISABLED)
}
