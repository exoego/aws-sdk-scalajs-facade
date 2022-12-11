package facade.amazonaws.services.cloudwatch

import scalajs.js

type ActionsSuppressedBy = "WaitPeriod" | "ExtensionPeriod" | "Alarm"
object ActionsSuppressedBy {
  inline val WaitPeriod: "WaitPeriod" = "WaitPeriod"
  inline val ExtensionPeriod: "ExtensionPeriod" = "ExtensionPeriod"
  inline val Alarm: "Alarm" = "Alarm"

  inline def values: js.Array[ActionsSuppressedBy] = js.Array(WaitPeriod, ExtensionPeriod, Alarm)
}

type AlarmType = "CompositeAlarm" | "MetricAlarm"
object AlarmType {
  inline val CompositeAlarm: "CompositeAlarm" = "CompositeAlarm"
  inline val MetricAlarm: "MetricAlarm" = "MetricAlarm"

  inline def values: js.Array[AlarmType] = js.Array(CompositeAlarm, MetricAlarm)
}

type AnomalyDetectorStateValue = "PENDING_TRAINING" | "TRAINED_INSUFFICIENT_DATA" | "TRAINED"
object AnomalyDetectorStateValue {
  inline val PENDING_TRAINING: "PENDING_TRAINING" = "PENDING_TRAINING"
  inline val TRAINED_INSUFFICIENT_DATA: "TRAINED_INSUFFICIENT_DATA" = "TRAINED_INSUFFICIENT_DATA"
  inline val TRAINED: "TRAINED" = "TRAINED"

  inline def values: js.Array[AnomalyDetectorStateValue] = js.Array(PENDING_TRAINING, TRAINED_INSUFFICIENT_DATA, TRAINED)
}

type AnomalyDetectorType = "SINGLE_METRIC" | "METRIC_MATH"
object AnomalyDetectorType {
  inline val SINGLE_METRIC: "SINGLE_METRIC" = "SINGLE_METRIC"
  inline val METRIC_MATH: "METRIC_MATH" = "METRIC_MATH"

  inline def values: js.Array[AnomalyDetectorType] = js.Array(SINGLE_METRIC, METRIC_MATH)
}

type ComparisonOperator = "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | "LessThanLowerOrGreaterThanUpperThreshold" | "LessThanLowerThreshold" | "GreaterThanUpperThreshold"
object ComparisonOperator {
  inline val GreaterThanOrEqualToThreshold: "GreaterThanOrEqualToThreshold" = "GreaterThanOrEqualToThreshold"
  inline val GreaterThanThreshold: "GreaterThanThreshold" = "GreaterThanThreshold"
  inline val LessThanThreshold: "LessThanThreshold" = "LessThanThreshold"
  inline val LessThanOrEqualToThreshold: "LessThanOrEqualToThreshold" = "LessThanOrEqualToThreshold"
  inline val LessThanLowerOrGreaterThanUpperThreshold: "LessThanLowerOrGreaterThanUpperThreshold" = "LessThanLowerOrGreaterThanUpperThreshold"
  inline val LessThanLowerThreshold: "LessThanLowerThreshold" = "LessThanLowerThreshold"
  inline val GreaterThanUpperThreshold: "GreaterThanUpperThreshold" = "GreaterThanUpperThreshold"

  inline def values: js.Array[ComparisonOperator] = js.Array(
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
  inline val ConfigurationUpdate: "ConfigurationUpdate" = "ConfigurationUpdate"
  inline val StateUpdate: "StateUpdate" = "StateUpdate"
  inline val Action: "Action" = "Action"

  inline def values: js.Array[HistoryItemType] = js.Array(ConfigurationUpdate, StateUpdate, Action)
}

type MetricStreamOutputFormat = "json" | "opentelemetry0.7"
object MetricStreamOutputFormat {
  inline val json: "json" = "json"
  inline val `opentelemetry0.7`: "opentelemetry0.7" = "opentelemetry0.7"

  inline def values: js.Array[MetricStreamOutputFormat] = js.Array(json, `opentelemetry0.7`)
}

type RecentlyActive = "PT3H"
object RecentlyActive {
  inline val PT3H: "PT3H" = "PT3H"

  inline def values: js.Array[RecentlyActive] = js.Array(PT3H)
}

type ScanBy = "TimestampDescending" | "TimestampAscending"
object ScanBy {
  inline val TimestampDescending: "TimestampDescending" = "TimestampDescending"
  inline val TimestampAscending: "TimestampAscending" = "TimestampAscending"

  inline def values: js.Array[ScanBy] = js.Array(TimestampDescending, TimestampAscending)
}

type StandardUnit = "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None"
object StandardUnit {
  inline val Seconds: "Seconds" = "Seconds"
  inline val Microseconds: "Microseconds" = "Microseconds"
  inline val Milliseconds: "Milliseconds" = "Milliseconds"
  inline val Bytes: "Bytes" = "Bytes"
  inline val Kilobytes: "Kilobytes" = "Kilobytes"
  inline val Megabytes: "Megabytes" = "Megabytes"
  inline val Gigabytes: "Gigabytes" = "Gigabytes"
  inline val Terabytes: "Terabytes" = "Terabytes"
  inline val Bits: "Bits" = "Bits"
  inline val Kilobits: "Kilobits" = "Kilobits"
  inline val Megabits: "Megabits" = "Megabits"
  inline val Gigabits: "Gigabits" = "Gigabits"
  inline val Terabits: "Terabits" = "Terabits"
  inline val Percent: "Percent" = "Percent"
  inline val Count: "Count" = "Count"
  inline val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  inline val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  inline val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  inline val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  inline val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  inline val `Bits/Second`: "Bits/Second" = "Bits/Second"
  inline val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  inline val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  inline val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  inline val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  inline val `Count/Second`: "Count/Second" = "Count/Second"
  inline val None: "None" = "None"

  inline def values: js.Array[StandardUnit] = js.Array(
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
  inline val OK: "OK" = "OK"
  inline val ALARM: "ALARM" = "ALARM"
  inline val INSUFFICIENT_DATA: "INSUFFICIENT_DATA" = "INSUFFICIENT_DATA"

  inline def values: js.Array[StateValue] = js.Array(OK, ALARM, INSUFFICIENT_DATA)
}

type Statistic = "SampleCount" | "Average" | "Sum" | "Minimum" | "Maximum"
object Statistic {
  inline val SampleCount: "SampleCount" = "SampleCount"
  inline val Average: "Average" = "Average"
  inline val Sum: "Sum" = "Sum"
  inline val Minimum: "Minimum" = "Minimum"
  inline val Maximum: "Maximum" = "Maximum"

  inline def values: js.Array[Statistic] = js.Array(SampleCount, Average, Sum, Minimum, Maximum)
}

type StatusCode = "Complete" | "InternalError" | "PartialData" | "Forbidden"
object StatusCode {
  inline val Complete: "Complete" = "Complete"
  inline val InternalError: "InternalError" = "InternalError"
  inline val PartialData: "PartialData" = "PartialData"
  inline val Forbidden: "Forbidden" = "Forbidden"

  inline def values: js.Array[StatusCode] = js.Array(Complete, InternalError, PartialData, Forbidden)
}
