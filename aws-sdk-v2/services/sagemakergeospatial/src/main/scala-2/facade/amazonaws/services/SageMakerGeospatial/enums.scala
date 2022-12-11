package facade.amazonaws.services.sagemakergeospatial

import scalajs.js

@js.native
sealed trait AlgorithmNameCloudRemoval extends js.Any
object AlgorithmNameCloudRemoval {
  val INTERPOLATION = "INTERPOLATION".asInstanceOf[AlgorithmNameCloudRemoval]

  @inline def values: js.Array[AlgorithmNameCloudRemoval] = js.Array(INTERPOLATION)
}

@js.native
sealed trait AlgorithmNameGeoMosaic extends js.Any
object AlgorithmNameGeoMosaic {
  val NEAR = "NEAR".asInstanceOf[AlgorithmNameGeoMosaic]
  val BILINEAR = "BILINEAR".asInstanceOf[AlgorithmNameGeoMosaic]
  val CUBIC = "CUBIC".asInstanceOf[AlgorithmNameGeoMosaic]
  val CUBICSPLINE = "CUBICSPLINE".asInstanceOf[AlgorithmNameGeoMosaic]
  val LANCZOS = "LANCZOS".asInstanceOf[AlgorithmNameGeoMosaic]
  val AVERAGE = "AVERAGE".asInstanceOf[AlgorithmNameGeoMosaic]
  val RMS = "RMS".asInstanceOf[AlgorithmNameGeoMosaic]
  val MODE = "MODE".asInstanceOf[AlgorithmNameGeoMosaic]
  val MAX = "MAX".asInstanceOf[AlgorithmNameGeoMosaic]
  val MIN = "MIN".asInstanceOf[AlgorithmNameGeoMosaic]
  val MED = "MED".asInstanceOf[AlgorithmNameGeoMosaic]
  val Q1 = "Q1".asInstanceOf[AlgorithmNameGeoMosaic]
  val Q3 = "Q3".asInstanceOf[AlgorithmNameGeoMosaic]
  val SUM = "SUM".asInstanceOf[AlgorithmNameGeoMosaic]

  @inline def values: js.Array[AlgorithmNameGeoMosaic] = js.Array(NEAR, BILINEAR, CUBIC, CUBICSPLINE, LANCZOS, AVERAGE, RMS, MODE, MAX, MIN, MED, Q1, Q3, SUM)
}

@js.native
sealed trait AlgorithmNameResampling extends js.Any
object AlgorithmNameResampling {
  val NEAR = "NEAR".asInstanceOf[AlgorithmNameResampling]
  val BILINEAR = "BILINEAR".asInstanceOf[AlgorithmNameResampling]
  val CUBIC = "CUBIC".asInstanceOf[AlgorithmNameResampling]
  val CUBICSPLINE = "CUBICSPLINE".asInstanceOf[AlgorithmNameResampling]
  val LANCZOS = "LANCZOS".asInstanceOf[AlgorithmNameResampling]
  val AVERAGE = "AVERAGE".asInstanceOf[AlgorithmNameResampling]
  val RMS = "RMS".asInstanceOf[AlgorithmNameResampling]
  val MODE = "MODE".asInstanceOf[AlgorithmNameResampling]
  val MAX = "MAX".asInstanceOf[AlgorithmNameResampling]
  val MIN = "MIN".asInstanceOf[AlgorithmNameResampling]
  val MED = "MED".asInstanceOf[AlgorithmNameResampling]
  val Q1 = "Q1".asInstanceOf[AlgorithmNameResampling]
  val Q3 = "Q3".asInstanceOf[AlgorithmNameResampling]
  val SUM = "SUM".asInstanceOf[AlgorithmNameResampling]

  @inline def values: js.Array[AlgorithmNameResampling] = js.Array(NEAR, BILINEAR, CUBIC, CUBICSPLINE, LANCZOS, AVERAGE, RMS, MODE, MAX, MIN, MED, Q1, Q3, SUM)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val EQUALS = "EQUALS".asInstanceOf[ComparisonOperator]
  val NOT_EQUALS = "NOT_EQUALS".asInstanceOf[ComparisonOperator]
  val STARTS_WITH = "STARTS_WITH".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(EQUALS, NOT_EQUALS, STARTS_WITH)
}

@js.native
sealed trait DataCollectionType extends js.Any
object DataCollectionType {
  val PUBLIC = "PUBLIC".asInstanceOf[DataCollectionType]
  val PREMIUM = "PREMIUM".asInstanceOf[DataCollectionType]
  val USER = "USER".asInstanceOf[DataCollectionType]

  @inline def values: js.Array[DataCollectionType] = js.Array(PUBLIC, PREMIUM, USER)
}

@js.native
sealed trait EarthObservationJobErrorType extends js.Any
object EarthObservationJobErrorType {
  val CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[EarthObservationJobErrorType]
  val SERVER_ERROR = "SERVER_ERROR".asInstanceOf[EarthObservationJobErrorType]

  @inline def values: js.Array[EarthObservationJobErrorType] = js.Array(CLIENT_ERROR, SERVER_ERROR)
}

@js.native
sealed trait EarthObservationJobExportStatus extends js.Any
object EarthObservationJobExportStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[EarthObservationJobExportStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[EarthObservationJobExportStatus]
  val FAILED = "FAILED".asInstanceOf[EarthObservationJobExportStatus]

  @inline def values: js.Array[EarthObservationJobExportStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

@js.native
sealed trait EarthObservationJobStatus extends js.Any
object EarthObservationJobStatus {
  val INITIALIZING = "INITIALIZING".asInstanceOf[EarthObservationJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[EarthObservationJobStatus]
  val STOPPING = "STOPPING".asInstanceOf[EarthObservationJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[EarthObservationJobStatus]
  val STOPPED = "STOPPED".asInstanceOf[EarthObservationJobStatus]
  val FAILED = "FAILED".asInstanceOf[EarthObservationJobStatus]
  val DELETING = "DELETING".asInstanceOf[EarthObservationJobStatus]
  val DELETED = "DELETED".asInstanceOf[EarthObservationJobStatus]

  @inline def values: js.Array[EarthObservationJobStatus] = js.Array(INITIALIZING, IN_PROGRESS, STOPPING, COMPLETED, STOPPED, FAILED, DELETING, DELETED)
}

@js.native
sealed trait ExportErrorType extends js.Any
object ExportErrorType {
  val CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[ExportErrorType]
  val SERVER_ERROR = "SERVER_ERROR".asInstanceOf[ExportErrorType]

  @inline def values: js.Array[ExportErrorType] = js.Array(CLIENT_ERROR, SERVER_ERROR)
}

@js.native
sealed trait GroupBy extends js.Any
object GroupBy {
  val ALL = "ALL".asInstanceOf[GroupBy]
  val YEARLY = "YEARLY".asInstanceOf[GroupBy]

  @inline def values: js.Array[GroupBy] = js.Array(ALL, YEARLY)
}

@js.native
sealed trait LogicalOperator extends js.Any
object LogicalOperator {
  val AND = "AND".asInstanceOf[LogicalOperator]

  @inline def values: js.Array[LogicalOperator] = js.Array(AND)
}

@js.native
sealed trait MetadataProvider extends js.Any
object MetadataProvider {
  val PLANET_ORDER = "PLANET_ORDER".asInstanceOf[MetadataProvider]

  @inline def values: js.Array[MetadataProvider] = js.Array(PLANET_ORDER)
}

@js.native
sealed trait OutputType extends js.Any
object OutputType {
  val INT32 = "INT32".asInstanceOf[OutputType]
  val FLOAT32 = "FLOAT32".asInstanceOf[OutputType]
  val INT16 = "INT16".asInstanceOf[OutputType]
  val FLOAT64 = "FLOAT64".asInstanceOf[OutputType]
  val UINT16 = "UINT16".asInstanceOf[OutputType]

  @inline def values: js.Array[OutputType] = js.Array(INT32, FLOAT32, INT16, FLOAT64, UINT16)
}

@js.native
sealed trait PredefinedResolution extends js.Any
object PredefinedResolution {
  val HIGHEST = "HIGHEST".asInstanceOf[PredefinedResolution]
  val LOWEST = "LOWEST".asInstanceOf[PredefinedResolution]
  val AVERAGE = "AVERAGE".asInstanceOf[PredefinedResolution]

  @inline def values: js.Array[PredefinedResolution] = js.Array(HIGHEST, LOWEST, AVERAGE)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait TargetOptions extends js.Any
object TargetOptions {
  val INPUT = "INPUT".asInstanceOf[TargetOptions]
  val OUTPUT = "OUTPUT".asInstanceOf[TargetOptions]

  @inline def values: js.Array[TargetOptions] = js.Array(INPUT, OUTPUT)
}

@js.native
sealed trait TemporalStatistics extends js.Any
object TemporalStatistics {
  val MEAN = "MEAN".asInstanceOf[TemporalStatistics]
  val MEDIAN = "MEDIAN".asInstanceOf[TemporalStatistics]
  val STANDARD_DEVIATION = "STANDARD_DEVIATION".asInstanceOf[TemporalStatistics]

  @inline def values: js.Array[TemporalStatistics] = js.Array(MEAN, MEDIAN, STANDARD_DEVIATION)
}

@js.native
sealed trait Unit extends js.Any
object Unit {
  val METERS = "METERS".asInstanceOf[Unit]

  @inline def values: js.Array[Unit] = js.Array(METERS)
}

@js.native
sealed trait VectorEnrichmentJobDocumentType extends js.Any
object VectorEnrichmentJobDocumentType {
  val CSV = "CSV".asInstanceOf[VectorEnrichmentJobDocumentType]

  @inline def values: js.Array[VectorEnrichmentJobDocumentType] = js.Array(CSV)
}

@js.native
sealed trait VectorEnrichmentJobErrorType extends js.Any
object VectorEnrichmentJobErrorType {
  val CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[VectorEnrichmentJobErrorType]
  val SERVER_ERROR = "SERVER_ERROR".asInstanceOf[VectorEnrichmentJobErrorType]

  @inline def values: js.Array[VectorEnrichmentJobErrorType] = js.Array(CLIENT_ERROR, SERVER_ERROR)
}

@js.native
sealed trait VectorEnrichmentJobExportErrorType extends js.Any
object VectorEnrichmentJobExportErrorType {
  val CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[VectorEnrichmentJobExportErrorType]
  val SERVER_ERROR = "SERVER_ERROR".asInstanceOf[VectorEnrichmentJobExportErrorType]

  @inline def values: js.Array[VectorEnrichmentJobExportErrorType] = js.Array(CLIENT_ERROR, SERVER_ERROR)
}

@js.native
sealed trait VectorEnrichmentJobExportStatus extends js.Any
object VectorEnrichmentJobExportStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[VectorEnrichmentJobExportStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[VectorEnrichmentJobExportStatus]
  val FAILED = "FAILED".asInstanceOf[VectorEnrichmentJobExportStatus]

  @inline def values: js.Array[VectorEnrichmentJobExportStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

@js.native
sealed trait VectorEnrichmentJobStatus extends js.Any
object VectorEnrichmentJobStatus {
  val INITIALIZING = "INITIALIZING".asInstanceOf[VectorEnrichmentJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[VectorEnrichmentJobStatus]
  val STOPPING = "STOPPING".asInstanceOf[VectorEnrichmentJobStatus]
  val STOPPED = "STOPPED".asInstanceOf[VectorEnrichmentJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[VectorEnrichmentJobStatus]
  val FAILED = "FAILED".asInstanceOf[VectorEnrichmentJobStatus]
  val DELETING = "DELETING".asInstanceOf[VectorEnrichmentJobStatus]
  val DELETED = "DELETED".asInstanceOf[VectorEnrichmentJobStatus]

  @inline def values: js.Array[VectorEnrichmentJobStatus] = js.Array(INITIALIZING, IN_PROGRESS, STOPPING, STOPPED, COMPLETED, FAILED, DELETING, DELETED)
}

@js.native
sealed trait VectorEnrichmentJobType extends js.Any
object VectorEnrichmentJobType {
  val REVERSE_GEOCODING = "REVERSE_GEOCODING".asInstanceOf[VectorEnrichmentJobType]
  val MAP_MATCHING = "MAP_MATCHING".asInstanceOf[VectorEnrichmentJobType]

  @inline def values: js.Array[VectorEnrichmentJobType] = js.Array(REVERSE_GEOCODING, MAP_MATCHING)
}

@js.native
sealed trait ZonalStatistics extends js.Any
object ZonalStatistics {
  val MEAN = "MEAN".asInstanceOf[ZonalStatistics]
  val MEDIAN = "MEDIAN".asInstanceOf[ZonalStatistics]
  val STANDARD_DEVIATION = "STANDARD_DEVIATION".asInstanceOf[ZonalStatistics]
  val MAX = "MAX".asInstanceOf[ZonalStatistics]
  val MIN = "MIN".asInstanceOf[ZonalStatistics]
  val SUM = "SUM".asInstanceOf[ZonalStatistics]

  @inline def values: js.Array[ZonalStatistics] = js.Array(MEAN, MEDIAN, STANDARD_DEVIATION, MAX, MIN, SUM)
}
