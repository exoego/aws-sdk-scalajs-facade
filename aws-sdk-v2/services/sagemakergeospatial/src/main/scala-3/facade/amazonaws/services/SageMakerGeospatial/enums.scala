package facade.amazonaws.services.sagemakergeospatial

import scalajs.js

type AlgorithmNameCloudRemoval = "INTERPOLATION"
object AlgorithmNameCloudRemoval {
  inline val INTERPOLATION: "INTERPOLATION" = "INTERPOLATION"

  inline def values: js.Array[AlgorithmNameCloudRemoval] = js.Array(INTERPOLATION)
}

type AlgorithmNameGeoMosaic = "NEAR" | "BILINEAR" | "CUBIC" | "CUBICSPLINE" | "LANCZOS" | "AVERAGE" | "RMS" | "MODE" | "MAX" | "MIN" | "MED" | "Q1" | "Q3" | "SUM"
object AlgorithmNameGeoMosaic {
  inline val NEAR: "NEAR" = "NEAR"
  inline val BILINEAR: "BILINEAR" = "BILINEAR"
  inline val CUBIC: "CUBIC" = "CUBIC"
  inline val CUBICSPLINE: "CUBICSPLINE" = "CUBICSPLINE"
  inline val LANCZOS: "LANCZOS" = "LANCZOS"
  inline val AVERAGE: "AVERAGE" = "AVERAGE"
  inline val RMS: "RMS" = "RMS"
  inline val MODE: "MODE" = "MODE"
  inline val MAX: "MAX" = "MAX"
  inline val MIN: "MIN" = "MIN"
  inline val MED: "MED" = "MED"
  inline val Q1: "Q1" = "Q1"
  inline val Q3: "Q3" = "Q3"
  inline val SUM: "SUM" = "SUM"

  inline def values: js.Array[AlgorithmNameGeoMosaic] = js.Array(NEAR, BILINEAR, CUBIC, CUBICSPLINE, LANCZOS, AVERAGE, RMS, MODE, MAX, MIN, MED, Q1, Q3, SUM)
}

type AlgorithmNameResampling = "NEAR" | "BILINEAR" | "CUBIC" | "CUBICSPLINE" | "LANCZOS" | "AVERAGE" | "RMS" | "MODE" | "MAX" | "MIN" | "MED" | "Q1" | "Q3" | "SUM"
object AlgorithmNameResampling {
  inline val NEAR: "NEAR" = "NEAR"
  inline val BILINEAR: "BILINEAR" = "BILINEAR"
  inline val CUBIC: "CUBIC" = "CUBIC"
  inline val CUBICSPLINE: "CUBICSPLINE" = "CUBICSPLINE"
  inline val LANCZOS: "LANCZOS" = "LANCZOS"
  inline val AVERAGE: "AVERAGE" = "AVERAGE"
  inline val RMS: "RMS" = "RMS"
  inline val MODE: "MODE" = "MODE"
  inline val MAX: "MAX" = "MAX"
  inline val MIN: "MIN" = "MIN"
  inline val MED: "MED" = "MED"
  inline val Q1: "Q1" = "Q1"
  inline val Q3: "Q3" = "Q3"
  inline val SUM: "SUM" = "SUM"

  inline def values: js.Array[AlgorithmNameResampling] = js.Array(NEAR, BILINEAR, CUBIC, CUBICSPLINE, LANCZOS, AVERAGE, RMS, MODE, MAX, MIN, MED, Q1, Q3, SUM)
}

type ComparisonOperator = "EQUALS" | "NOT_EQUALS" | "STARTS_WITH"
object ComparisonOperator {
  inline val EQUALS: "EQUALS" = "EQUALS"
  inline val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"
  inline val STARTS_WITH: "STARTS_WITH" = "STARTS_WITH"

  inline def values: js.Array[ComparisonOperator] = js.Array(EQUALS, NOT_EQUALS, STARTS_WITH)
}

type DataCollectionType = "PUBLIC" | "PREMIUM" | "USER"
object DataCollectionType {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val PREMIUM: "PREMIUM" = "PREMIUM"
  inline val USER: "USER" = "USER"

  inline def values: js.Array[DataCollectionType] = js.Array(PUBLIC, PREMIUM, USER)
}

type EarthObservationJobErrorType = "CLIENT_ERROR" | "SERVER_ERROR"
object EarthObservationJobErrorType {
  inline val CLIENT_ERROR: "CLIENT_ERROR" = "CLIENT_ERROR"
  inline val SERVER_ERROR: "SERVER_ERROR" = "SERVER_ERROR"

  inline def values: js.Array[EarthObservationJobErrorType] = js.Array(CLIENT_ERROR, SERVER_ERROR)
}

type EarthObservationJobExportStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object EarthObservationJobExportStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[EarthObservationJobExportStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

type EarthObservationJobStatus = "INITIALIZING" | "IN_PROGRESS" | "STOPPING" | "COMPLETED" | "STOPPED" | "FAILED" | "DELETING" | "DELETED"
object EarthObservationJobStatus {
  inline val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[EarthObservationJobStatus] = js.Array(INITIALIZING, IN_PROGRESS, STOPPING, COMPLETED, STOPPED, FAILED, DELETING, DELETED)
}

type ExportErrorType = "CLIENT_ERROR" | "SERVER_ERROR"
object ExportErrorType {
  inline val CLIENT_ERROR: "CLIENT_ERROR" = "CLIENT_ERROR"
  inline val SERVER_ERROR: "SERVER_ERROR" = "SERVER_ERROR"

  inline def values: js.Array[ExportErrorType] = js.Array(CLIENT_ERROR, SERVER_ERROR)
}

type GroupBy = "ALL" | "YEARLY"
object GroupBy {
  inline val ALL: "ALL" = "ALL"
  inline val YEARLY: "YEARLY" = "YEARLY"

  inline def values: js.Array[GroupBy] = js.Array(ALL, YEARLY)
}

type LogicalOperator = "AND"
object LogicalOperator {
  inline val AND: "AND" = "AND"

  inline def values: js.Array[LogicalOperator] = js.Array(AND)
}

type MetadataProvider = "PLANET_ORDER"
object MetadataProvider {
  inline val PLANET_ORDER: "PLANET_ORDER" = "PLANET_ORDER"

  inline def values: js.Array[MetadataProvider] = js.Array(PLANET_ORDER)
}

type OutputType = "INT32" | "FLOAT32" | "INT16" | "FLOAT64" | "UINT16"
object OutputType {
  inline val INT32: "INT32" = "INT32"
  inline val FLOAT32: "FLOAT32" = "FLOAT32"
  inline val INT16: "INT16" = "INT16"
  inline val FLOAT64: "FLOAT64" = "FLOAT64"
  inline val UINT16: "UINT16" = "UINT16"

  inline def values: js.Array[OutputType] = js.Array(INT32, FLOAT32, INT16, FLOAT64, UINT16)
}

type PredefinedResolution = "HIGHEST" | "LOWEST" | "AVERAGE"
object PredefinedResolution {
  inline val HIGHEST: "HIGHEST" = "HIGHEST"
  inline val LOWEST: "LOWEST" = "LOWEST"
  inline val AVERAGE: "AVERAGE" = "AVERAGE"

  inline def values: js.Array[PredefinedResolution] = js.Array(HIGHEST, LOWEST, AVERAGE)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

type TargetOptions = "INPUT" | "OUTPUT"
object TargetOptions {
  inline val INPUT: "INPUT" = "INPUT"
  inline val OUTPUT: "OUTPUT" = "OUTPUT"

  inline def values: js.Array[TargetOptions] = js.Array(INPUT, OUTPUT)
}

type TemporalStatistics = "MEAN" | "MEDIAN" | "STANDARD_DEVIATION"
object TemporalStatistics {
  inline val MEAN: "MEAN" = "MEAN"
  inline val MEDIAN: "MEDIAN" = "MEDIAN"
  inline val STANDARD_DEVIATION: "STANDARD_DEVIATION" = "STANDARD_DEVIATION"

  inline def values: js.Array[TemporalStatistics] = js.Array(MEAN, MEDIAN, STANDARD_DEVIATION)
}

type Unit = "METERS"
object Unit {
  inline val METERS: "METERS" = "METERS"

  inline def values: js.Array[Unit] = js.Array(METERS)
}

type VectorEnrichmentJobDocumentType = "CSV"
object VectorEnrichmentJobDocumentType {
  inline val CSV: "CSV" = "CSV"

  inline def values: js.Array[VectorEnrichmentJobDocumentType] = js.Array(CSV)
}

type VectorEnrichmentJobErrorType = "CLIENT_ERROR" | "SERVER_ERROR"
object VectorEnrichmentJobErrorType {
  inline val CLIENT_ERROR: "CLIENT_ERROR" = "CLIENT_ERROR"
  inline val SERVER_ERROR: "SERVER_ERROR" = "SERVER_ERROR"

  inline def values: js.Array[VectorEnrichmentJobErrorType] = js.Array(CLIENT_ERROR, SERVER_ERROR)
}

type VectorEnrichmentJobExportErrorType = "CLIENT_ERROR" | "SERVER_ERROR"
object VectorEnrichmentJobExportErrorType {
  inline val CLIENT_ERROR: "CLIENT_ERROR" = "CLIENT_ERROR"
  inline val SERVER_ERROR: "SERVER_ERROR" = "SERVER_ERROR"

  inline def values: js.Array[VectorEnrichmentJobExportErrorType] = js.Array(CLIENT_ERROR, SERVER_ERROR)
}

type VectorEnrichmentJobExportStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object VectorEnrichmentJobExportStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[VectorEnrichmentJobExportStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

type VectorEnrichmentJobStatus = "INITIALIZING" | "IN_PROGRESS" | "STOPPING" | "STOPPED" | "COMPLETED" | "FAILED" | "DELETING" | "DELETED"
object VectorEnrichmentJobStatus {
  inline val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[VectorEnrichmentJobStatus] = js.Array(INITIALIZING, IN_PROGRESS, STOPPING, STOPPED, COMPLETED, FAILED, DELETING, DELETED)
}

type VectorEnrichmentJobType = "REVERSE_GEOCODING" | "MAP_MATCHING"
object VectorEnrichmentJobType {
  inline val REVERSE_GEOCODING: "REVERSE_GEOCODING" = "REVERSE_GEOCODING"
  inline val MAP_MATCHING: "MAP_MATCHING" = "MAP_MATCHING"

  inline def values: js.Array[VectorEnrichmentJobType] = js.Array(REVERSE_GEOCODING, MAP_MATCHING)
}

type ZonalStatistics = "MEAN" | "MEDIAN" | "STANDARD_DEVIATION" | "MAX" | "MIN" | "SUM"
object ZonalStatistics {
  inline val MEAN: "MEAN" = "MEAN"
  inline val MEDIAN: "MEDIAN" = "MEDIAN"
  inline val STANDARD_DEVIATION: "STANDARD_DEVIATION" = "STANDARD_DEVIATION"
  inline val MAX: "MAX" = "MAX"
  inline val MIN: "MIN" = "MIN"
  inline val SUM: "SUM" = "SUM"

  inline def values: js.Array[ZonalStatistics] = js.Array(MEAN, MEDIAN, STANDARD_DEVIATION, MAX, MIN, SUM)
}
