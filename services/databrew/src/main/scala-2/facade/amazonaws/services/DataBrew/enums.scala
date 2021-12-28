package facade.amazonaws.services.databrew

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait CompressionFormat extends js.Any
object CompressionFormat {
  val GZIP = "GZIP".asInstanceOf[CompressionFormat]
  val LZ4 = "LZ4".asInstanceOf[CompressionFormat]
  val SNAPPY = "SNAPPY".asInstanceOf[CompressionFormat]
  val BZIP2 = "BZIP2".asInstanceOf[CompressionFormat]
  val DEFLATE = "DEFLATE".asInstanceOf[CompressionFormat]
  val LZO = "LZO".asInstanceOf[CompressionFormat]
  val BROTLI = "BROTLI".asInstanceOf[CompressionFormat]
  val ZSTD = "ZSTD".asInstanceOf[CompressionFormat]
  val ZLIB = "ZLIB".asInstanceOf[CompressionFormat]

  @inline def values = js.Array(GZIP, LZ4, SNAPPY, BZIP2, DEFLATE, LZO, BROTLI, ZSTD, ZLIB)
}

@js.native
sealed trait EncryptionMode extends js.Any
object EncryptionMode {
  val `SSE-KMS` = "SSE-KMS".asInstanceOf[EncryptionMode]
  val `SSE-S3` = "SSE-S3".asInstanceOf[EncryptionMode]

  @inline def values = js.Array(`SSE-KMS`, `SSE-S3`)
}

@js.native
sealed trait InputFormat extends js.Any
object InputFormat {
  val CSV = "CSV".asInstanceOf[InputFormat]
  val JSON = "JSON".asInstanceOf[InputFormat]
  val PARQUET = "PARQUET".asInstanceOf[InputFormat]
  val EXCEL = "EXCEL".asInstanceOf[InputFormat]

  @inline def values = js.Array(CSV, JSON, PARQUET, EXCEL)
}

@js.native
sealed trait JobRunState extends js.Any
object JobRunState {
  val STARTING = "STARTING".asInstanceOf[JobRunState]
  val RUNNING = "RUNNING".asInstanceOf[JobRunState]
  val STOPPING = "STOPPING".asInstanceOf[JobRunState]
  val STOPPED = "STOPPED".asInstanceOf[JobRunState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobRunState]
  val FAILED = "FAILED".asInstanceOf[JobRunState]
  val TIMEOUT = "TIMEOUT".asInstanceOf[JobRunState]

  @inline def values = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

@js.native
sealed trait JobType extends js.Any
object JobType {
  val PROFILE = "PROFILE".asInstanceOf[JobType]
  val RECIPE = "RECIPE".asInstanceOf[JobType]

  @inline def values = js.Array(PROFILE, RECIPE)
}

@js.native
sealed trait LogSubscription extends js.Any
object LogSubscription {
  val ENABLE = "ENABLE".asInstanceOf[LogSubscription]
  val DISABLE = "DISABLE".asInstanceOf[LogSubscription]

  @inline def values = js.Array(ENABLE, DISABLE)
}

@js.native
sealed trait Order extends js.Any
object Order {
  val DESCENDING = "DESCENDING".asInstanceOf[Order]
  val ASCENDING = "ASCENDING".asInstanceOf[Order]

  @inline def values = js.Array(DESCENDING, ASCENDING)
}

@js.native
sealed trait OrderedBy extends js.Any
object OrderedBy {
  val LAST_MODIFIED_DATE = "LAST_MODIFIED_DATE".asInstanceOf[OrderedBy]

  @inline def values = js.Array(LAST_MODIFIED_DATE)
}

@js.native
sealed trait OutputFormat extends js.Any
object OutputFormat {
  val CSV = "CSV".asInstanceOf[OutputFormat]
  val JSON = "JSON".asInstanceOf[OutputFormat]
  val PARQUET = "PARQUET".asInstanceOf[OutputFormat]
  val GLUEPARQUET = "GLUEPARQUET".asInstanceOf[OutputFormat]
  val AVRO = "AVRO".asInstanceOf[OutputFormat]
  val ORC = "ORC".asInstanceOf[OutputFormat]
  val XML = "XML".asInstanceOf[OutputFormat]

  @inline def values = js.Array(CSV, JSON, PARQUET, GLUEPARQUET, AVRO, ORC, XML)
}

@js.native
sealed trait ParameterType extends js.Any
object ParameterType {
  val Datetime = "Datetime".asInstanceOf[ParameterType]
  val Number = "Number".asInstanceOf[ParameterType]
  val String = "String".asInstanceOf[ParameterType]

  @inline def values = js.Array(Datetime, Number, String)
}

@js.native
sealed trait SampleMode extends js.Any
object SampleMode {
  val FULL_DATASET = "FULL_DATASET".asInstanceOf[SampleMode]
  val CUSTOM_ROWS = "CUSTOM_ROWS".asInstanceOf[SampleMode]

  @inline def values = js.Array(FULL_DATASET, CUSTOM_ROWS)
}

@js.native
sealed trait SampleType extends js.Any
object SampleType {
  val FIRST_N = "FIRST_N".asInstanceOf[SampleType]
  val LAST_N = "LAST_N".asInstanceOf[SampleType]
  val RANDOM = "RANDOM".asInstanceOf[SampleType]

  @inline def values = js.Array(FIRST_N, LAST_N, RANDOM)
}

@js.native
sealed trait SessionStatus extends js.Any
object SessionStatus {
  val ASSIGNED = "ASSIGNED".asInstanceOf[SessionStatus]
  val FAILED = "FAILED".asInstanceOf[SessionStatus]
  val INITIALIZING = "INITIALIZING".asInstanceOf[SessionStatus]
  val PROVISIONING = "PROVISIONING".asInstanceOf[SessionStatus]
  val READY = "READY".asInstanceOf[SessionStatus]
  val RECYCLING = "RECYCLING".asInstanceOf[SessionStatus]
  val ROTATING = "ROTATING".asInstanceOf[SessionStatus]
  val TERMINATED = "TERMINATED".asInstanceOf[SessionStatus]
  val TERMINATING = "TERMINATING".asInstanceOf[SessionStatus]
  val UPDATING = "UPDATING".asInstanceOf[SessionStatus]

  @inline def values = js.Array(ASSIGNED, FAILED, INITIALIZING, PROVISIONING, READY, RECYCLING, ROTATING, TERMINATED, TERMINATING, UPDATING)
}

@js.native
sealed trait Source extends js.Any
object Source {
  val S3 = "S3".asInstanceOf[Source]
  val `DATA-CATALOG` = "DATA-CATALOG".asInstanceOf[Source]
  val DATABASE = "DATABASE".asInstanceOf[Source]

  @inline def values = js.Array(S3, `DATA-CATALOG`, DATABASE)
}
