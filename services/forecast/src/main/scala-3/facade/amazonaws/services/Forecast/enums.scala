package facade.amazonaws.services.forecast

import scalajs._

type AttributeType = "string" | "integer" | "float" | "timestamp" | "geolocation"
object AttributeType {
  val string: "string" = "string"
  val integer: "integer" = "integer"
  val float: "float" = "float"
  val timestamp: "timestamp" = "timestamp"
  val geolocation: "geolocation" = "geolocation"

  @inline def values = js.Array[AttributeType](string, integer, float, timestamp, geolocation)
}

type DatasetType = "TARGET_TIME_SERIES" | "RELATED_TIME_SERIES" | "ITEM_METADATA"
object DatasetType {
  val TARGET_TIME_SERIES: "TARGET_TIME_SERIES" = "TARGET_TIME_SERIES"
  val RELATED_TIME_SERIES: "RELATED_TIME_SERIES" = "RELATED_TIME_SERIES"
  val ITEM_METADATA: "ITEM_METADATA" = "ITEM_METADATA"

  @inline def values = js.Array[DatasetType](TARGET_TIME_SERIES, RELATED_TIME_SERIES, ITEM_METADATA)
}

type Domain = "RETAIL" | "CUSTOM" | "INVENTORY_PLANNING" | "EC2_CAPACITY" | "WORK_FORCE" | "WEB_TRAFFIC" | "METRICS"
object Domain {
  val RETAIL: "RETAIL" = "RETAIL"
  val CUSTOM: "CUSTOM" = "CUSTOM"
  val INVENTORY_PLANNING: "INVENTORY_PLANNING" = "INVENTORY_PLANNING"
  val EC2_CAPACITY: "EC2_CAPACITY" = "EC2_CAPACITY"
  val WORK_FORCE: "WORK_FORCE" = "WORK_FORCE"
  val WEB_TRAFFIC: "WEB_TRAFFIC" = "WEB_TRAFFIC"
  val METRICS: "METRICS" = "METRICS"

  @inline def values = js.Array[Domain](RETAIL, CUSTOM, INVENTORY_PLANNING, EC2_CAPACITY, WORK_FORCE, WEB_TRAFFIC, METRICS)
}

type EvaluationType = "SUMMARY" | "COMPUTED"
object EvaluationType {
  val SUMMARY: "SUMMARY" = "SUMMARY"
  val COMPUTED: "COMPUTED" = "COMPUTED"

  @inline def values = js.Array[EvaluationType](SUMMARY, COMPUTED)
}

type FeaturizationMethodName = "filling"
object FeaturizationMethodName {
  val filling: "filling" = "filling"

  @inline def values = js.Array[FeaturizationMethodName](filling)
}

type FilterConditionString = "IS" | "IS_NOT"
object FilterConditionString {
  val IS: "IS" = "IS"
  val IS_NOT: "IS_NOT" = "IS_NOT"

  @inline def values = js.Array[FilterConditionString](IS, IS_NOT)
}

type ScalingType = "Auto" | "Linear" | "Logarithmic" | "ReverseLogarithmic"
object ScalingType {
  val Auto: "Auto" = "Auto"
  val Linear: "Linear" = "Linear"
  val Logarithmic: "Logarithmic" = "Logarithmic"
  val ReverseLogarithmic: "ReverseLogarithmic" = "ReverseLogarithmic"

  @inline def values = js.Array[ScalingType](Auto, Linear, Logarithmic, ReverseLogarithmic)
}
