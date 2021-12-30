package facade.amazonaws.services.cloudwatch

import scalajs.js

@js.native
sealed trait AlarmType extends js.Any
object AlarmType {
  val CompositeAlarm = "CompositeAlarm".asInstanceOf[AlarmType]
  val MetricAlarm = "MetricAlarm".asInstanceOf[AlarmType]

  @inline def values: js.Array[AlarmType] = js.Array(CompositeAlarm, MetricAlarm)
}

@js.native
sealed trait AnomalyDetectorStateValue extends js.Any
object AnomalyDetectorStateValue {
  val PENDING_TRAINING = "PENDING_TRAINING".asInstanceOf[AnomalyDetectorStateValue]
  val TRAINED_INSUFFICIENT_DATA = "TRAINED_INSUFFICIENT_DATA".asInstanceOf[AnomalyDetectorStateValue]
  val TRAINED = "TRAINED".asInstanceOf[AnomalyDetectorStateValue]

  @inline def values: js.Array[AnomalyDetectorStateValue] = js.Array(PENDING_TRAINING, TRAINED_INSUFFICIENT_DATA, TRAINED)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]
  val GreaterThanThreshold = "GreaterThanThreshold".asInstanceOf[ComparisonOperator]
  val LessThanThreshold = "LessThanThreshold".asInstanceOf[ComparisonOperator]
  val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]
  val LessThanLowerOrGreaterThanUpperThreshold = "LessThanLowerOrGreaterThanUpperThreshold".asInstanceOf[ComparisonOperator]
  val LessThanLowerThreshold = "LessThanLowerThreshold".asInstanceOf[ComparisonOperator]
  val GreaterThanUpperThreshold = "GreaterThanUpperThreshold".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(
    GreaterThanOrEqualToThreshold,
    GreaterThanThreshold,
    LessThanThreshold,
    LessThanOrEqualToThreshold,
    LessThanLowerOrGreaterThanUpperThreshold,
    LessThanLowerThreshold,
    GreaterThanUpperThreshold
  )
}

@js.native
sealed trait HistoryItemType extends js.Any
object HistoryItemType {
  val ConfigurationUpdate = "ConfigurationUpdate".asInstanceOf[HistoryItemType]
  val StateUpdate = "StateUpdate".asInstanceOf[HistoryItemType]
  val Action = "Action".asInstanceOf[HistoryItemType]

  @inline def values: js.Array[HistoryItemType] = js.Array(ConfigurationUpdate, StateUpdate, Action)
}

@js.native
sealed trait MetricStreamOutputFormat extends js.Any
object MetricStreamOutputFormat {
  val json = "json".asInstanceOf[MetricStreamOutputFormat]
  val `opentelemetry0.7` = "opentelemetry0.7".asInstanceOf[MetricStreamOutputFormat]

  @inline def values: js.Array[MetricStreamOutputFormat] = js.Array(json, `opentelemetry0.7`)
}

@js.native
sealed trait RecentlyActive extends js.Any
object RecentlyActive {
  val PT3H = "PT3H".asInstanceOf[RecentlyActive]

  @inline def values: js.Array[RecentlyActive] = js.Array(PT3H)
}

@js.native
sealed trait ScanBy extends js.Any
object ScanBy {
  val TimestampDescending = "TimestampDescending".asInstanceOf[ScanBy]
  val TimestampAscending = "TimestampAscending".asInstanceOf[ScanBy]

  @inline def values: js.Array[ScanBy] = js.Array(TimestampDescending, TimestampAscending)
}

@js.native
sealed trait StandardUnit extends js.Any
object StandardUnit {
  val Seconds = "Seconds".asInstanceOf[StandardUnit]
  val Microseconds = "Microseconds".asInstanceOf[StandardUnit]
  val Milliseconds = "Milliseconds".asInstanceOf[StandardUnit]
  val Bytes = "Bytes".asInstanceOf[StandardUnit]
  val Kilobytes = "Kilobytes".asInstanceOf[StandardUnit]
  val Megabytes = "Megabytes".asInstanceOf[StandardUnit]
  val Gigabytes = "Gigabytes".asInstanceOf[StandardUnit]
  val Terabytes = "Terabytes".asInstanceOf[StandardUnit]
  val Bits = "Bits".asInstanceOf[StandardUnit]
  val Kilobits = "Kilobits".asInstanceOf[StandardUnit]
  val Megabits = "Megabits".asInstanceOf[StandardUnit]
  val Gigabits = "Gigabits".asInstanceOf[StandardUnit]
  val Terabits = "Terabits".asInstanceOf[StandardUnit]
  val Percent = "Percent".asInstanceOf[StandardUnit]
  val Count = "Count".asInstanceOf[StandardUnit]
  val `Bytes/Second` = "Bytes/Second".asInstanceOf[StandardUnit]
  val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[StandardUnit]
  val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[StandardUnit]
  val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[StandardUnit]
  val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[StandardUnit]
  val `Bits/Second` = "Bits/Second".asInstanceOf[StandardUnit]
  val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[StandardUnit]
  val `Megabits/Second` = "Megabits/Second".asInstanceOf[StandardUnit]
  val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[StandardUnit]
  val `Terabits/Second` = "Terabits/Second".asInstanceOf[StandardUnit]
  val `Count/Second` = "Count/Second".asInstanceOf[StandardUnit]
  val None = "None".asInstanceOf[StandardUnit]

  @inline def values: js.Array[StandardUnit] = js.Array(
    Seconds,
    Microseconds,
    Milliseconds,
    Bytes,
    Kilobytes,
    Megabytes,
    Gigabytes,
    Terabytes,
    Bits,
    Kilobits,
    Megabits,
    Gigabits,
    Terabits,
    Percent,
    Count,
    `Bytes/Second`,
    `Kilobytes/Second`,
    `Megabytes/Second`,
    `Gigabytes/Second`,
    `Terabytes/Second`,
    `Bits/Second`,
    `Kilobits/Second`,
    `Megabits/Second`,
    `Gigabits/Second`,
    `Terabits/Second`,
    `Count/Second`,
    None
  )
}

@js.native
sealed trait StateValue extends js.Any
object StateValue {
  val OK = "OK".asInstanceOf[StateValue]
  val ALARM = "ALARM".asInstanceOf[StateValue]
  val INSUFFICIENT_DATA = "INSUFFICIENT_DATA".asInstanceOf[StateValue]

  @inline def values: js.Array[StateValue] = js.Array(OK, ALARM, INSUFFICIENT_DATA)
}

@js.native
sealed trait Statistic extends js.Any
object Statistic {
  val SampleCount = "SampleCount".asInstanceOf[Statistic]
  val Average = "Average".asInstanceOf[Statistic]
  val Sum = "Sum".asInstanceOf[Statistic]
  val Minimum = "Minimum".asInstanceOf[Statistic]
  val Maximum = "Maximum".asInstanceOf[Statistic]

  @inline def values: js.Array[Statistic] = js.Array(SampleCount, Average, Sum, Minimum, Maximum)
}

@js.native
sealed trait StatusCode extends js.Any
object StatusCode {
  val Complete = "Complete".asInstanceOf[StatusCode]
  val InternalError = "InternalError".asInstanceOf[StatusCode]
  val PartialData = "PartialData".asInstanceOf[StatusCode]

  @inline def values: js.Array[StatusCode] = js.Array(Complete, InternalError, PartialData)
}
