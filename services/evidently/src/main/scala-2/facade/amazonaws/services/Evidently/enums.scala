package facade.amazonaws.services.evidently

import scalajs.js

@js.native
sealed trait ChangeDirectionEnum extends js.Any
object ChangeDirectionEnum {
  val INCREASE = "INCREASE".asInstanceOf[ChangeDirectionEnum]
  val DECREASE = "DECREASE".asInstanceOf[ChangeDirectionEnum]

  @inline def values: js.Array[ChangeDirectionEnum] = js.Array(INCREASE, DECREASE)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val `aws.evidently.evaluation` = "aws.evidently.evaluation".asInstanceOf[EventType]
  val `aws.evidently.custom` = "aws.evidently.custom".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(`aws.evidently.evaluation`, `aws.evidently.custom`)
}

@js.native
sealed trait ExperimentBaseStat extends js.Any
object ExperimentBaseStat {
  val Mean = "Mean".asInstanceOf[ExperimentBaseStat]

  @inline def values: js.Array[ExperimentBaseStat] = js.Array(Mean)
}

@js.native
sealed trait ExperimentReportName extends js.Any
object ExperimentReportName {
  val BayesianInference = "BayesianInference".asInstanceOf[ExperimentReportName]

  @inline def values: js.Array[ExperimentReportName] = js.Array(BayesianInference)
}

@js.native
sealed trait ExperimentResultRequestType extends js.Any
object ExperimentResultRequestType {
  val BaseStat = "BaseStat".asInstanceOf[ExperimentResultRequestType]
  val TreatmentEffect = "TreatmentEffect".asInstanceOf[ExperimentResultRequestType]
  val ConfidenceInterval = "ConfidenceInterval".asInstanceOf[ExperimentResultRequestType]
  val PValue = "PValue".asInstanceOf[ExperimentResultRequestType]

  @inline def values: js.Array[ExperimentResultRequestType] = js.Array(BaseStat, TreatmentEffect, ConfidenceInterval, PValue)
}

@js.native
sealed trait ExperimentResultResponseType extends js.Any
object ExperimentResultResponseType {
  val Mean = "Mean".asInstanceOf[ExperimentResultResponseType]
  val TreatmentEffect = "TreatmentEffect".asInstanceOf[ExperimentResultResponseType]
  val ConfidenceIntervalUpperBound = "ConfidenceIntervalUpperBound".asInstanceOf[ExperimentResultResponseType]
  val ConfidenceIntervalLowerBound = "ConfidenceIntervalLowerBound".asInstanceOf[ExperimentResultResponseType]
  val PValue = "PValue".asInstanceOf[ExperimentResultResponseType]

  @inline def values: js.Array[ExperimentResultResponseType] = js.Array(Mean, TreatmentEffect, ConfidenceIntervalUpperBound, ConfidenceIntervalLowerBound, PValue)
}

@js.native
sealed trait ExperimentStatus extends js.Any
object ExperimentStatus {
  val CREATED = "CREATED".asInstanceOf[ExperimentStatus]
  val UPDATING = "UPDATING".asInstanceOf[ExperimentStatus]
  val RUNNING = "RUNNING".asInstanceOf[ExperimentStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ExperimentStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ExperimentStatus]

  @inline def values: js.Array[ExperimentStatus] = js.Array(CREATED, UPDATING, RUNNING, COMPLETED, CANCELLED)
}

@js.native
sealed trait ExperimentStopDesiredState extends js.Any
object ExperimentStopDesiredState {
  val COMPLETED = "COMPLETED".asInstanceOf[ExperimentStopDesiredState]
  val CANCELLED = "CANCELLED".asInstanceOf[ExperimentStopDesiredState]

  @inline def values: js.Array[ExperimentStopDesiredState] = js.Array(COMPLETED, CANCELLED)
}

@js.native
sealed trait ExperimentType extends js.Any
object ExperimentType {
  val `aws.evidently.onlineab` = "aws.evidently.onlineab".asInstanceOf[ExperimentType]

  @inline def values: js.Array[ExperimentType] = js.Array(`aws.evidently.onlineab`)
}

@js.native
sealed trait FeatureEvaluationStrategy extends js.Any
object FeatureEvaluationStrategy {
  val ALL_RULES = "ALL_RULES".asInstanceOf[FeatureEvaluationStrategy]
  val DEFAULT_VARIATION = "DEFAULT_VARIATION".asInstanceOf[FeatureEvaluationStrategy]

  @inline def values: js.Array[FeatureEvaluationStrategy] = js.Array(ALL_RULES, DEFAULT_VARIATION)
}

@js.native
sealed trait FeatureStatus extends js.Any
object FeatureStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[FeatureStatus]
  val UPDATING = "UPDATING".asInstanceOf[FeatureStatus]

  @inline def values: js.Array[FeatureStatus] = js.Array(AVAILABLE, UPDATING)
}

@js.native
sealed trait LaunchStatus extends js.Any
object LaunchStatus {
  val CREATED = "CREATED".asInstanceOf[LaunchStatus]
  val UPDATING = "UPDATING".asInstanceOf[LaunchStatus]
  val RUNNING = "RUNNING".asInstanceOf[LaunchStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[LaunchStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[LaunchStatus]

  @inline def values: js.Array[LaunchStatus] = js.Array(CREATED, UPDATING, RUNNING, COMPLETED, CANCELLED)
}

@js.native
sealed trait LaunchStopDesiredState extends js.Any
object LaunchStopDesiredState {
  val COMPLETED = "COMPLETED".asInstanceOf[LaunchStopDesiredState]
  val CANCELLED = "CANCELLED".asInstanceOf[LaunchStopDesiredState]

  @inline def values: js.Array[LaunchStopDesiredState] = js.Array(COMPLETED, CANCELLED)
}

@js.native
sealed trait LaunchType extends js.Any
object LaunchType {
  val `aws.evidently.splits` = "aws.evidently.splits".asInstanceOf[LaunchType]

  @inline def values: js.Array[LaunchType] = js.Array(`aws.evidently.splits`)
}

@js.native
sealed trait ProjectStatus extends js.Any
object ProjectStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[ProjectStatus]
  val UPDATING = "UPDATING".asInstanceOf[ProjectStatus]

  @inline def values: js.Array[ProjectStatus] = js.Array(AVAILABLE, UPDATING)
}

@js.native
sealed trait VariationValueType extends js.Any
object VariationValueType {
  val STRING = "STRING".asInstanceOf[VariationValueType]
  val LONG = "LONG".asInstanceOf[VariationValueType]
  val DOUBLE = "DOUBLE".asInstanceOf[VariationValueType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[VariationValueType]

  @inline def values: js.Array[VariationValueType] = js.Array(STRING, LONG, DOUBLE, BOOLEAN)
}
