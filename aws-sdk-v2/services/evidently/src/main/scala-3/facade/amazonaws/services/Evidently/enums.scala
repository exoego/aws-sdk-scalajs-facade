package facade.amazonaws.services.evidently

import scalajs.js

type ChangeDirectionEnum = "INCREASE" | "DECREASE"
object ChangeDirectionEnum {
  inline val INCREASE: "INCREASE" = "INCREASE"
  inline val DECREASE: "DECREASE" = "DECREASE"

  inline def values: js.Array[ChangeDirectionEnum] = js.Array(INCREASE, DECREASE)
}

type EventType = "aws.evidently.evaluation" | "aws.evidently.custom"
object EventType {
  inline val `aws.evidently.evaluation`: "aws.evidently.evaluation" = "aws.evidently.evaluation"
  inline val `aws.evidently.custom`: "aws.evidently.custom" = "aws.evidently.custom"

  inline def values: js.Array[EventType] = js.Array(`aws.evidently.evaluation`, `aws.evidently.custom`)
}

type ExperimentBaseStat = "Mean"
object ExperimentBaseStat {
  inline val Mean: "Mean" = "Mean"

  inline def values: js.Array[ExperimentBaseStat] = js.Array(Mean)
}

type ExperimentReportName = "BayesianInference"
object ExperimentReportName {
  inline val BayesianInference: "BayesianInference" = "BayesianInference"

  inline def values: js.Array[ExperimentReportName] = js.Array(BayesianInference)
}

type ExperimentResultRequestType = "BaseStat" | "TreatmentEffect" | "ConfidenceInterval" | "PValue"
object ExperimentResultRequestType {
  inline val BaseStat: "BaseStat" = "BaseStat"
  inline val TreatmentEffect: "TreatmentEffect" = "TreatmentEffect"
  inline val ConfidenceInterval: "ConfidenceInterval" = "ConfidenceInterval"
  inline val PValue: "PValue" = "PValue"

  inline def values: js.Array[ExperimentResultRequestType] = js.Array(BaseStat, TreatmentEffect, ConfidenceInterval, PValue)
}

type ExperimentResultResponseType = "Mean" | "TreatmentEffect" | "ConfidenceIntervalUpperBound" | "ConfidenceIntervalLowerBound" | "PValue"
object ExperimentResultResponseType {
  inline val Mean: "Mean" = "Mean"
  inline val TreatmentEffect: "TreatmentEffect" = "TreatmentEffect"
  inline val ConfidenceIntervalUpperBound: "ConfidenceIntervalUpperBound" = "ConfidenceIntervalUpperBound"
  inline val ConfidenceIntervalLowerBound: "ConfidenceIntervalLowerBound" = "ConfidenceIntervalLowerBound"
  inline val PValue: "PValue" = "PValue"

  inline def values: js.Array[ExperimentResultResponseType] = js.Array(Mean, TreatmentEffect, ConfidenceIntervalUpperBound, ConfidenceIntervalLowerBound, PValue)
}

type ExperimentStatus = "CREATED" | "UPDATING" | "RUNNING" | "COMPLETED" | "CANCELLED"
object ExperimentStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[ExperimentStatus] = js.Array(CREATED, UPDATING, RUNNING, COMPLETED, CANCELLED)
}

type ExperimentStopDesiredState = "COMPLETED" | "CANCELLED"
object ExperimentStopDesiredState {
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[ExperimentStopDesiredState] = js.Array(COMPLETED, CANCELLED)
}

type ExperimentType = "aws.evidently.onlineab"
object ExperimentType {
  inline val `aws.evidently.onlineab`: "aws.evidently.onlineab" = "aws.evidently.onlineab"

  inline def values: js.Array[ExperimentType] = js.Array(`aws.evidently.onlineab`)
}

type FeatureEvaluationStrategy = "ALL_RULES" | "DEFAULT_VARIATION"
object FeatureEvaluationStrategy {
  inline val ALL_RULES: "ALL_RULES" = "ALL_RULES"
  inline val DEFAULT_VARIATION: "DEFAULT_VARIATION" = "DEFAULT_VARIATION"

  inline def values: js.Array[FeatureEvaluationStrategy] = js.Array(ALL_RULES, DEFAULT_VARIATION)
}

type FeatureStatus = "AVAILABLE" | "UPDATING"
object FeatureStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[FeatureStatus] = js.Array(AVAILABLE, UPDATING)
}

type LaunchStatus = "CREATED" | "UPDATING" | "RUNNING" | "COMPLETED" | "CANCELLED"
object LaunchStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[LaunchStatus] = js.Array(CREATED, UPDATING, RUNNING, COMPLETED, CANCELLED)
}

type LaunchStopDesiredState = "COMPLETED" | "CANCELLED"
object LaunchStopDesiredState {
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[LaunchStopDesiredState] = js.Array(COMPLETED, CANCELLED)
}

type LaunchType = "aws.evidently.splits"
object LaunchType {
  inline val `aws.evidently.splits`: "aws.evidently.splits" = "aws.evidently.splits"

  inline def values: js.Array[LaunchType] = js.Array(`aws.evidently.splits`)
}

type ProjectStatus = "AVAILABLE" | "UPDATING"
object ProjectStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[ProjectStatus] = js.Array(AVAILABLE, UPDATING)
}

type SegmentReferenceResourceType = "EXPERIMENT" | "LAUNCH"
object SegmentReferenceResourceType {
  inline val EXPERIMENT: "EXPERIMENT" = "EXPERIMENT"
  inline val LAUNCH: "LAUNCH" = "LAUNCH"

  inline def values: js.Array[SegmentReferenceResourceType] = js.Array(EXPERIMENT, LAUNCH)
}

type VariationValueType = "STRING" | "LONG" | "DOUBLE" | "BOOLEAN"
object VariationValueType {
  inline val STRING: "STRING" = "STRING"
  inline val LONG: "LONG" = "LONG"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"

  inline def values: js.Array[VariationValueType] = js.Array(STRING, LONG, DOUBLE, BOOLEAN)
}
