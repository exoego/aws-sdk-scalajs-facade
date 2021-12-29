package facade.amazonaws.services.cloudwatch

import scalajs._

type AlarmType = "CompositeAlarm" | "MetricAlarm"
object AlarmType {
  val CompositeAlarm: "CompositeAlarm" = "CompositeAlarm"
  val MetricAlarm: "MetricAlarm" = "MetricAlarm"

  @inline def values = js.Array[AlarmType](CompositeAlarm, MetricAlarm)
}

type AnomalyDetectorStateValue = "PENDING_TRAINING" | "TRAINED_INSUFFICIENT_DATA" | "TRAINED"
object AnomalyDetectorStateValue {
  val PENDING_TRAINING: "PENDING_TRAINING" = "PENDING_TRAINING"
  val TRAINED_INSUFFICIENT_DATA: "TRAINED_INSUFFICIENT_DATA" = "TRAINED_INSUFFICIENT_DATA"
  val TRAINED: "TRAINED" = "TRAINED"

  @inline def values = js.Array[AnomalyDetectorStateValue](PENDING_TRAINING, TRAINED_INSUFFICIENT_DATA, TRAINED)
}

type ComparisonOperator = "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | "LessThanLowerOrGreaterThanUpperThreshold" | "LessThanLowerThreshold" | "GreaterThanUpperThreshold"
object ComparisonOperator {
  val GreaterThanOrEqualToThreshold: "GreaterThanOrEqualToThreshold" = "GreaterThanOrEqualToThreshold"
  val GreaterThanThreshold: "GreaterThanThreshold" = "GreaterThanThreshold"
  val LessThanThreshold: "LessThanThreshold" = "LessThanThreshold"
  val LessThanOrEqualToThreshold: "LessThanOrEqualToThreshold" = "LessThanOrEqualToThreshold"
  val LessThanLowerOrGreaterThanUpperThreshold: "LessThanLowerOrGreaterThanUpperThreshold" = "LessThanLowerOrGreaterThanUpperThreshold"
  val LessThanLowerThreshold: "LessThanLowerThreshold" = "LessThanLowerThreshold"
  val GreaterThanUpperThreshold: "GreaterThanUpperThreshold" = "GreaterThanUpperThreshold"

  @inline def values = js.Array[ComparisonOperator](
    GreaterThanOrEqualToThreshold,
    GreaterThanThreshold,
    LessThanThreshold,
    LessThanOrEqualToThreshold,
    LessThanLowerOrGreaterThanUpperThreshold,
    LessThanLowerThreshold,
    GreaterThanUpperThreshold
  )
}

type HistoryItemType = "ConfigurationUpdate" | "StateUpdate" | "Action"
object HistoryItemType {
  val ConfigurationUpdate: "ConfigurationUpdate" = "ConfigurationUpdate"
  val StateUpdate: "StateUpdate" = "StateUpdate"
  val Action: "Action" = "Action"

  @inline def values = js.Array[HistoryItemType](ConfigurationUpdate, StateUpdate, Action)
}

type MetricStreamOutputFormat = "json" | "opentelemetry0.7"
object MetricStreamOutputFormat {
  val json: "json" = "json"
  val `opentelemetry0.7`: "opentelemetry0.7" = "opentelemetry0.7"

  @inline def values = js.Array[MetricStreamOutputFormat](json, `opentelemetry0.7`)
}

type RecentlyActive = "PT3H"
object RecentlyActive {
  val PT3H: "PT3H" = "PT3H"

  @inline def values = js.Array[RecentlyActive](PT3H)
}

type ScanBy = "TimestampDescending" | "TimestampAscending"
object ScanBy {
  val TimestampDescending: "TimestampDescending" = "TimestampDescending"
  val TimestampAscending: "TimestampAscending" = "TimestampAscending"

  @inline def values = js.Array[ScanBy](TimestampDescending, TimestampAscending)
}

type StandardUnit = "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None"
object StandardUnit {
  val Seconds: "Seconds" = "Seconds"
  val Microseconds: "Microseconds" = "Microseconds"
  val Milliseconds: "Milliseconds" = "Milliseconds"
  val Bytes: "Bytes" = "Bytes"
  val Kilobytes: "Kilobytes" = "Kilobytes"
  val Megabytes: "Megabytes" = "Megabytes"
  val Gigabytes: "Gigabytes" = "Gigabytes"
  val Terabytes: "Terabytes" = "Terabytes"
  val Bits: "Bits" = "Bits"
  val Kilobits: "Kilobits" = "Kilobits"
  val Megabits: "Megabits" = "Megabits"
  val Gigabits: "Gigabits" = "Gigabits"
  val Terabits: "Terabits" = "Terabits"
  val Percent: "Percent" = "Percent"
  val Count: "Count" = "Count"
  val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  val `Bits/Second`: "Bits/Second" = "Bits/Second"
  val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  val `Count/Second`: "Count/Second" = "Count/Second"
  val None: "None" = "None"

  @inline def values = js.Array[StandardUnit](
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

type StateValue = "OK" | "ALARM" | "INSUFFICIENT_DATA"
object StateValue {
  val OK: "OK" = "OK"
  val ALARM: "ALARM" = "ALARM"
  val INSUFFICIENT_DATA: "INSUFFICIENT_DATA" = "INSUFFICIENT_DATA"

  @inline def values = js.Array[StateValue](OK, ALARM, INSUFFICIENT_DATA)
}

type Statistic = "SampleCount" | "Average" | "Sum" | "Minimum" | "Maximum"
object Statistic {
  val SampleCount: "SampleCount" = "SampleCount"
  val Average: "Average" = "Average"
  val Sum: "Sum" = "Sum"
  val Minimum: "Minimum" = "Minimum"
  val Maximum: "Maximum" = "Maximum"

  @inline def values = js.Array[Statistic](SampleCount, Average, Sum, Minimum, Maximum)
}

type StatusCode = "Complete" | "InternalError" | "PartialData"
object StatusCode {
  val Complete: "Complete" = "Complete"
  val InternalError: "InternalError" = "InternalError"
  val PartialData: "PartialData" = "PartialData"

  @inline def values = js.Array[StatusCode](Complete, InternalError, PartialData)
}
