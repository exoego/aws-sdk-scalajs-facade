package facade.amazonaws.services.dlm

import scalajs._

type EventSourceValues = "MANAGED_CWE"
object EventSourceValues {
  val MANAGED_CWE: "MANAGED_CWE" = "MANAGED_CWE"

  @inline def values = js.Array[EventSourceValues](MANAGED_CWE)
}

type EventTypeValues = "shareSnapshot"
object EventTypeValues {
  val shareSnapshot: "shareSnapshot" = "shareSnapshot"

  @inline def values = js.Array[EventTypeValues](shareSnapshot)
}

type GettablePolicyStateValues = "ENABLED" | "DISABLED" | "ERROR"
object GettablePolicyStateValues {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[GettablePolicyStateValues](ENABLED, DISABLED, ERROR)
}

type IntervalUnitValues = "HOURS"
object IntervalUnitValues {
  val HOURS: "HOURS" = "HOURS"

  @inline def values = js.Array[IntervalUnitValues](HOURS)
}

type LocationValues = "CLOUD" | "OUTPOST_LOCAL"
object LocationValues {
  val CLOUD: "CLOUD" = "CLOUD"
  val OUTPOST_LOCAL: "OUTPOST_LOCAL" = "OUTPOST_LOCAL"

  @inline def values = js.Array[LocationValues](CLOUD, OUTPOST_LOCAL)
}

type PolicyTypeValues = "EBS_SNAPSHOT_MANAGEMENT" | "IMAGE_MANAGEMENT" | "EVENT_BASED_POLICY"
object PolicyTypeValues {
  val EBS_SNAPSHOT_MANAGEMENT: "EBS_SNAPSHOT_MANAGEMENT" = "EBS_SNAPSHOT_MANAGEMENT"
  val IMAGE_MANAGEMENT: "IMAGE_MANAGEMENT" = "IMAGE_MANAGEMENT"
  val EVENT_BASED_POLICY: "EVENT_BASED_POLICY" = "EVENT_BASED_POLICY"

  @inline def values = js.Array[PolicyTypeValues](EBS_SNAPSHOT_MANAGEMENT, IMAGE_MANAGEMENT, EVENT_BASED_POLICY)
}

type ResourceLocationValues = "CLOUD" | "OUTPOST"
object ResourceLocationValues {
  val CLOUD: "CLOUD" = "CLOUD"
  val OUTPOST: "OUTPOST" = "OUTPOST"

  @inline def values = js.Array[ResourceLocationValues](CLOUD, OUTPOST)
}

type ResourceTypeValues = "VOLUME" | "INSTANCE"
object ResourceTypeValues {
  val VOLUME: "VOLUME" = "VOLUME"
  val INSTANCE: "INSTANCE" = "INSTANCE"

  @inline def values = js.Array[ResourceTypeValues](VOLUME, INSTANCE)
}

type RetentionIntervalUnitValues = "DAYS" | "WEEKS" | "MONTHS" | "YEARS"
object RetentionIntervalUnitValues {
  val DAYS: "DAYS" = "DAYS"
  val WEEKS: "WEEKS" = "WEEKS"
  val MONTHS: "MONTHS" = "MONTHS"
  val YEARS: "YEARS" = "YEARS"

  @inline def values = js.Array[RetentionIntervalUnitValues](DAYS, WEEKS, MONTHS, YEARS)
}

type SettablePolicyStateValues = "ENABLED" | "DISABLED"
object SettablePolicyStateValues {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[SettablePolicyStateValues](ENABLED, DISABLED)
}
