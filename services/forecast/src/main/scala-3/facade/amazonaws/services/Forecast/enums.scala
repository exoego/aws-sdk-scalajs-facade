package facade.amazonaws.services.forecast

import scalajs.js

type AttributeType = "string" | "integer" | "float" | "timestamp" | "geolocation"
object AttributeType {
  inline val string: "string" = "string"
  inline val integer: "integer" = "integer"
  inline val float: "float" = "float"
  inline val timestamp: "timestamp" = "timestamp"
  inline val geolocation: "geolocation" = "geolocation"

  inline def values: js.Array[AttributeType] = js.Array(string, integer, float, timestamp, geolocation)
}

type DatasetType = "TARGET_TIME_SERIES" | "RELATED_TIME_SERIES" | "ITEM_METADATA"
object DatasetType {
  inline val TARGET_TIME_SERIES: "TARGET_TIME_SERIES" = "TARGET_TIME_SERIES"
  inline val RELATED_TIME_SERIES: "RELATED_TIME_SERIES" = "RELATED_TIME_SERIES"
  inline val ITEM_METADATA: "ITEM_METADATA" = "ITEM_METADATA"

  inline def values: js.Array[DatasetType] = js.Array(TARGET_TIME_SERIES, RELATED_TIME_SERIES, ITEM_METADATA)
}

type Domain = "RETAIL" | "CUSTOM" | "INVENTORY_PLANNING" | "EC2_CAPACITY" | "WORK_FORCE" | "WEB_TRAFFIC" | "METRICS"
object Domain {
  inline val RETAIL: "RETAIL" = "RETAIL"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val INVENTORY_PLANNING: "INVENTORY_PLANNING" = "INVENTORY_PLANNING"
  inline val EC2_CAPACITY: "EC2_CAPACITY" = "EC2_CAPACITY"
  inline val WORK_FORCE: "WORK_FORCE" = "WORK_FORCE"
  inline val WEB_TRAFFIC: "WEB_TRAFFIC" = "WEB_TRAFFIC"
  inline val METRICS: "METRICS" = "METRICS"

  inline def values: js.Array[Domain] = js.Array(RETAIL, CUSTOM, INVENTORY_PLANNING, EC2_CAPACITY, WORK_FORCE, WEB_TRAFFIC, METRICS)
}

type EvaluationType = "SUMMARY" | "COMPUTED"
object EvaluationType {
  inline val SUMMARY: "SUMMARY" = "SUMMARY"
  inline val COMPUTED: "COMPUTED" = "COMPUTED"

  inline def values: js.Array[EvaluationType] = js.Array(SUMMARY, COMPUTED)
}

type FeaturizationMethodName = "filling"
object FeaturizationMethodName {
  inline val filling: "filling" = "filling"

  inline def values: js.Array[FeaturizationMethodName] = js.Array(filling)
}

type FilterConditionString = "IS" | "IS_NOT"
object FilterConditionString {
  inline val IS: "IS" = "IS"
  inline val IS_NOT: "IS_NOT" = "IS_NOT"

  inline def values: js.Array[FilterConditionString] = js.Array(IS, IS_NOT)
}

type ScalingType = "Auto" | "Linear" | "Logarithmic" | "ReverseLogarithmic"
object ScalingType {
  inline val Auto: "Auto" = "Auto"
  inline val Linear: "Linear" = "Linear"
  inline val Logarithmic: "Logarithmic" = "Logarithmic"
  inline val ReverseLogarithmic: "ReverseLogarithmic" = "ReverseLogarithmic"

  inline def values: js.Array[ScalingType] = js.Array(Auto, Linear, Logarithmic, ReverseLogarithmic)
}
