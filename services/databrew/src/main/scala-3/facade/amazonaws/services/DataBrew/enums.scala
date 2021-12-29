package facade.amazonaws.services.databrew

import scalajs._

type CompressionFormat = "GZIP" | "LZ4" | "SNAPPY" | "BZIP2" | "DEFLATE" | "LZO" | "BROTLI" | "ZSTD" | "ZLIB"
object CompressionFormat {
  val GZIP: "GZIP" = "GZIP"
  val LZ4: "LZ4" = "LZ4"
  val SNAPPY: "SNAPPY" = "SNAPPY"
  val BZIP2: "BZIP2" = "BZIP2"
  val DEFLATE: "DEFLATE" = "DEFLATE"
  val LZO: "LZO" = "LZO"
  val BROTLI: "BROTLI" = "BROTLI"
  val ZSTD: "ZSTD" = "ZSTD"
  val ZLIB: "ZLIB" = "ZLIB"

  @inline def values = js.Array[CompressionFormat](GZIP, LZ4, SNAPPY, BZIP2, DEFLATE, LZO, BROTLI, ZSTD, ZLIB)
}

type EncryptionMode = "SSE-KMS" | "SSE-S3"
object EncryptionMode {
  val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"
  val `SSE-S3`: "SSE-S3" = "SSE-S3"

  @inline def values = js.Array[EncryptionMode](`SSE-KMS`, `SSE-S3`)
}

type InputFormat = "CSV" | "JSON" | "PARQUET" | "EXCEL"
object InputFormat {
  val CSV: "CSV" = "CSV"
  val JSON: "JSON" = "JSON"
  val PARQUET: "PARQUET" = "PARQUET"
  val EXCEL: "EXCEL" = "EXCEL"

  @inline def values = js.Array[InputFormat](CSV, JSON, PARQUET, EXCEL)
}

type JobRunState = "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT"
object JobRunState {
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val TIMEOUT: "TIMEOUT" = "TIMEOUT"

  @inline def values = js.Array[JobRunState](STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

type JobType = "PROFILE" | "RECIPE"
object JobType {
  val PROFILE: "PROFILE" = "PROFILE"
  val RECIPE: "RECIPE" = "RECIPE"

  @inline def values = js.Array[JobType](PROFILE, RECIPE)
}

type LogSubscription = "ENABLE" | "DISABLE"
object LogSubscription {
  val ENABLE: "ENABLE" = "ENABLE"
  val DISABLE: "DISABLE" = "DISABLE"

  @inline def values = js.Array[LogSubscription](ENABLE, DISABLE)
}

type Order = "DESCENDING" | "ASCENDING"
object Order {
  val DESCENDING: "DESCENDING" = "DESCENDING"
  val ASCENDING: "ASCENDING" = "ASCENDING"

  @inline def values = js.Array[Order](DESCENDING, ASCENDING)
}

type OrderedBy = "LAST_MODIFIED_DATE"
object OrderedBy {
  val LAST_MODIFIED_DATE: "LAST_MODIFIED_DATE" = "LAST_MODIFIED_DATE"

  @inline def values = js.Array[OrderedBy](LAST_MODIFIED_DATE)
}

type OutputFormat = "CSV" | "JSON" | "PARQUET" | "GLUEPARQUET" | "AVRO" | "ORC" | "XML"
object OutputFormat {
  val CSV: "CSV" = "CSV"
  val JSON: "JSON" = "JSON"
  val PARQUET: "PARQUET" = "PARQUET"
  val GLUEPARQUET: "GLUEPARQUET" = "GLUEPARQUET"
  val AVRO: "AVRO" = "AVRO"
  val ORC: "ORC" = "ORC"
  val XML: "XML" = "XML"

  @inline def values = js.Array[OutputFormat](CSV, JSON, PARQUET, GLUEPARQUET, AVRO, ORC, XML)
}

type ParameterType = "Datetime" | "Number" | "String"
object ParameterType {
  val Datetime: "Datetime" = "Datetime"
  val Number: "Number" = "Number"
  val String: "String" = "String"

  @inline def values = js.Array[ParameterType](Datetime, Number, String)
}

type SampleMode = "FULL_DATASET" | "CUSTOM_ROWS"
object SampleMode {
  val FULL_DATASET: "FULL_DATASET" = "FULL_DATASET"
  val CUSTOM_ROWS: "CUSTOM_ROWS" = "CUSTOM_ROWS"

  @inline def values = js.Array[SampleMode](FULL_DATASET, CUSTOM_ROWS)
}

type SampleType = "FIRST_N" | "LAST_N" | "RANDOM"
object SampleType {
  val FIRST_N: "FIRST_N" = "FIRST_N"
  val LAST_N: "LAST_N" = "LAST_N"
  val RANDOM: "RANDOM" = "RANDOM"

  @inline def values = js.Array[SampleType](FIRST_N, LAST_N, RANDOM)
}

type SessionStatus = "ASSIGNED" | "FAILED" | "INITIALIZING" | "PROVISIONING" | "READY" | "RECYCLING" | "ROTATING" | "TERMINATED" | "TERMINATING" | "UPDATING"
object SessionStatus {
  val ASSIGNED: "ASSIGNED" = "ASSIGNED"
  val FAILED: "FAILED" = "FAILED"
  val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  val READY: "READY" = "READY"
  val RECYCLING: "RECYCLING" = "RECYCLING"
  val ROTATING: "ROTATING" = "ROTATING"
  val TERMINATED: "TERMINATED" = "TERMINATED"
  val TERMINATING: "TERMINATING" = "TERMINATING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[SessionStatus](ASSIGNED, FAILED, INITIALIZING, PROVISIONING, READY, RECYCLING, ROTATING, TERMINATED, TERMINATING, UPDATING)
}

type Source = "S3" | "DATA-CATALOG" | "DATABASE"
object Source {
  val S3: "S3" = "S3"
  val `DATA-CATALOG`: "DATA-CATALOG" = "DATA-CATALOG"
  val DATABASE: "DATABASE" = "DATABASE"

  @inline def values = js.Array[Source](S3, `DATA-CATALOG`, DATABASE)
}
