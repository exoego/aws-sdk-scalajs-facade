package facade.amazonaws.services.forecast

import scalajs.js

@js.native
sealed trait AttributeType extends js.Any
object AttributeType {
  val string = "string".asInstanceOf[AttributeType]
  val integer = "integer".asInstanceOf[AttributeType]
  val float = "float".asInstanceOf[AttributeType]
  val timestamp = "timestamp".asInstanceOf[AttributeType]
  val geolocation = "geolocation".asInstanceOf[AttributeType]

  @inline def values: js.Array[AttributeType] = js.Array(string, integer, float, timestamp, geolocation)
}

@js.native
sealed trait AutoMLOverrideStrategy extends js.Any
object AutoMLOverrideStrategy {
  val LatencyOptimized = "LatencyOptimized".asInstanceOf[AutoMLOverrideStrategy]
  val AccuracyOptimized = "AccuracyOptimized".asInstanceOf[AutoMLOverrideStrategy]

  @inline def values: js.Array[AutoMLOverrideStrategy] = js.Array(LatencyOptimized, AccuracyOptimized)
}

@js.native
sealed trait DatasetType extends js.Any
object DatasetType {
  val TARGET_TIME_SERIES = "TARGET_TIME_SERIES".asInstanceOf[DatasetType]
  val RELATED_TIME_SERIES = "RELATED_TIME_SERIES".asInstanceOf[DatasetType]
  val ITEM_METADATA = "ITEM_METADATA".asInstanceOf[DatasetType]

  @inline def values: js.Array[DatasetType] = js.Array(TARGET_TIME_SERIES, RELATED_TIME_SERIES, ITEM_METADATA)
}

@js.native
sealed trait Domain extends js.Any
object Domain {
  val RETAIL = "RETAIL".asInstanceOf[Domain]
  val CUSTOM = "CUSTOM".asInstanceOf[Domain]
  val INVENTORY_PLANNING = "INVENTORY_PLANNING".asInstanceOf[Domain]
  val EC2_CAPACITY = "EC2_CAPACITY".asInstanceOf[Domain]
  val WORK_FORCE = "WORK_FORCE".asInstanceOf[Domain]
  val WEB_TRAFFIC = "WEB_TRAFFIC".asInstanceOf[Domain]
  val METRICS = "METRICS".asInstanceOf[Domain]

  @inline def values: js.Array[Domain] = js.Array(RETAIL, CUSTOM, INVENTORY_PLANNING, EC2_CAPACITY, WORK_FORCE, WEB_TRAFFIC, METRICS)
}

@js.native
sealed trait EvaluationType extends js.Any
object EvaluationType {
  val SUMMARY = "SUMMARY".asInstanceOf[EvaluationType]
  val COMPUTED = "COMPUTED".asInstanceOf[EvaluationType]

  @inline def values: js.Array[EvaluationType] = js.Array(SUMMARY, COMPUTED)
}

@js.native
sealed trait FeaturizationMethodName extends js.Any
object FeaturizationMethodName {
  val filling = "filling".asInstanceOf[FeaturizationMethodName]

  @inline def values: js.Array[FeaturizationMethodName] = js.Array(filling)
}

@js.native
sealed trait FilterConditionString extends js.Any
object FilterConditionString {
  val IS = "IS".asInstanceOf[FilterConditionString]
  val IS_NOT = "IS_NOT".asInstanceOf[FilterConditionString]

  @inline def values: js.Array[FilterConditionString] = js.Array(IS, IS_NOT)
}

@js.native
sealed trait OptimizationMetric extends js.Any
object OptimizationMetric {
  val WAPE = "WAPE".asInstanceOf[OptimizationMetric]
  val RMSE = "RMSE".asInstanceOf[OptimizationMetric]
  val AverageWeightedQuantileLoss = "AverageWeightedQuantileLoss".asInstanceOf[OptimizationMetric]
  val MASE = "MASE".asInstanceOf[OptimizationMetric]
  val MAPE = "MAPE".asInstanceOf[OptimizationMetric]

  @inline def values: js.Array[OptimizationMetric] = js.Array(WAPE, RMSE, AverageWeightedQuantileLoss, MASE, MAPE)
}

@js.native
sealed trait ScalingType extends js.Any
object ScalingType {
  val Auto = "Auto".asInstanceOf[ScalingType]
  val Linear = "Linear".asInstanceOf[ScalingType]
  val Logarithmic = "Logarithmic".asInstanceOf[ScalingType]
  val ReverseLogarithmic = "ReverseLogarithmic".asInstanceOf[ScalingType]

  @inline def values: js.Array[ScalingType] = js.Array(Auto, Linear, Logarithmic, ReverseLogarithmic)
}

@js.native
sealed trait State extends js.Any
object State {
  val Active = "Active".asInstanceOf[State]
  val Deleted = "Deleted".asInstanceOf[State]

  @inline def values: js.Array[State] = js.Array(Active, Deleted)
}

@js.native
sealed trait TimePointGranularity extends js.Any
object TimePointGranularity {
  val ALL = "ALL".asInstanceOf[TimePointGranularity]
  val SPECIFIC = "SPECIFIC".asInstanceOf[TimePointGranularity]

  @inline def values: js.Array[TimePointGranularity] = js.Array(ALL, SPECIFIC)
}

@js.native
sealed trait TimeSeriesGranularity extends js.Any
object TimeSeriesGranularity {
  val ALL = "ALL".asInstanceOf[TimeSeriesGranularity]
  val SPECIFIC = "SPECIFIC".asInstanceOf[TimeSeriesGranularity]

  @inline def values: js.Array[TimeSeriesGranularity] = js.Array(ALL, SPECIFIC)
}
