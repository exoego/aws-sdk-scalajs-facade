package facade.amazonaws.services.dlm

import scalajs.js

@js.native
sealed trait EventSourceValues extends js.Any
object EventSourceValues {
  val MANAGED_CWE = "MANAGED_CWE".asInstanceOf[EventSourceValues]

  @inline def values: js.Array[EventSourceValues] = js.Array(MANAGED_CWE)
}

@js.native
sealed trait EventTypeValues extends js.Any
object EventTypeValues {
  val shareSnapshot = "shareSnapshot".asInstanceOf[EventTypeValues]

  @inline def values: js.Array[EventTypeValues] = js.Array(shareSnapshot)
}

@js.native
sealed trait GettablePolicyStateValues extends js.Any
object GettablePolicyStateValues {
  val ENABLED = "ENABLED".asInstanceOf[GettablePolicyStateValues]
  val DISABLED = "DISABLED".asInstanceOf[GettablePolicyStateValues]
  val ERROR = "ERROR".asInstanceOf[GettablePolicyStateValues]

  @inline def values: js.Array[GettablePolicyStateValues] = js.Array(ENABLED, DISABLED, ERROR)
}

@js.native
sealed trait IntervalUnitValues extends js.Any
object IntervalUnitValues {
  val HOURS = "HOURS".asInstanceOf[IntervalUnitValues]

  @inline def values: js.Array[IntervalUnitValues] = js.Array(HOURS)
}

@js.native
sealed trait LocationValues extends js.Any
object LocationValues {
  val CLOUD = "CLOUD".asInstanceOf[LocationValues]
  val OUTPOST_LOCAL = "OUTPOST_LOCAL".asInstanceOf[LocationValues]

  @inline def values: js.Array[LocationValues] = js.Array(CLOUD, OUTPOST_LOCAL)
}

@js.native
sealed trait PolicyTypeValues extends js.Any
object PolicyTypeValues {
  val EBS_SNAPSHOT_MANAGEMENT = "EBS_SNAPSHOT_MANAGEMENT".asInstanceOf[PolicyTypeValues]
  val IMAGE_MANAGEMENT = "IMAGE_MANAGEMENT".asInstanceOf[PolicyTypeValues]
  val EVENT_BASED_POLICY = "EVENT_BASED_POLICY".asInstanceOf[PolicyTypeValues]

  @inline def values: js.Array[PolicyTypeValues] = js.Array(EBS_SNAPSHOT_MANAGEMENT, IMAGE_MANAGEMENT, EVENT_BASED_POLICY)
}

@js.native
sealed trait ResourceLocationValues extends js.Any
object ResourceLocationValues {
  val CLOUD = "CLOUD".asInstanceOf[ResourceLocationValues]
  val OUTPOST = "OUTPOST".asInstanceOf[ResourceLocationValues]

  @inline def values: js.Array[ResourceLocationValues] = js.Array(CLOUD, OUTPOST)
}

@js.native
sealed trait ResourceTypeValues extends js.Any
object ResourceTypeValues {
  val VOLUME = "VOLUME".asInstanceOf[ResourceTypeValues]
  val INSTANCE = "INSTANCE".asInstanceOf[ResourceTypeValues]

  @inline def values: js.Array[ResourceTypeValues] = js.Array(VOLUME, INSTANCE)
}

@js.native
sealed trait RetentionIntervalUnitValues extends js.Any
object RetentionIntervalUnitValues {
  val DAYS = "DAYS".asInstanceOf[RetentionIntervalUnitValues]
  val WEEKS = "WEEKS".asInstanceOf[RetentionIntervalUnitValues]
  val MONTHS = "MONTHS".asInstanceOf[RetentionIntervalUnitValues]
  val YEARS = "YEARS".asInstanceOf[RetentionIntervalUnitValues]

  @inline def values: js.Array[RetentionIntervalUnitValues] = js.Array(DAYS, WEEKS, MONTHS, YEARS)
}

@js.native
sealed trait SettablePolicyStateValues extends js.Any
object SettablePolicyStateValues {
  val ENABLED = "ENABLED".asInstanceOf[SettablePolicyStateValues]
  val DISABLED = "DISABLED".asInstanceOf[SettablePolicyStateValues]

  @inline def values: js.Array[SettablePolicyStateValues] = js.Array(ENABLED, DISABLED)
}
