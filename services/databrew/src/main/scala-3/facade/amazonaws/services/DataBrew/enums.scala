package facade.amazonaws.services.databrew

import scalajs._

type CompressionFormat = "GZIP" | "LZ4" | "SNAPPY" | "BZIP2" | "DEFLATE" | "LZO" | "BROTLI" | "ZSTD" | "ZLIB"
object CompressionFormat {
  inline val GZIP: "GZIP" = "GZIP"
  inline val LZ4: "LZ4" = "LZ4"
  inline val SNAPPY: "SNAPPY" = "SNAPPY"
  inline val BZIP2: "BZIP2" = "BZIP2"
  inline val DEFLATE: "DEFLATE" = "DEFLATE"
  inline val LZO: "LZO" = "LZO"
  inline val BROTLI: "BROTLI" = "BROTLI"
  inline val ZSTD: "ZSTD" = "ZSTD"
  inline val ZLIB: "ZLIB" = "ZLIB"

  inline def values: js.Array[CompressionFormat] = js.Array(GZIP, LZ4, SNAPPY, BZIP2, DEFLATE, LZO, BROTLI, ZSTD, ZLIB)
}

type EncryptionMode = "SSE-KMS" | "SSE-S3"
object EncryptionMode {
  inline val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"
  inline val `SSE-S3`: "SSE-S3" = "SSE-S3"

  inline def values: js.Array[EncryptionMode] = js.Array(`SSE-KMS`, `SSE-S3`)
}

type InputFormat = "CSV" | "JSON" | "PARQUET" | "EXCEL"
object InputFormat {
  inline val CSV: "CSV" = "CSV"
  inline val JSON: "JSON" = "JSON"
  inline val PARQUET: "PARQUET" = "PARQUET"
  inline val EXCEL: "EXCEL" = "EXCEL"

  inline def values: js.Array[InputFormat] = js.Array(CSV, JSON, PARQUET, EXCEL)
}

type JobRunState = "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT"
object JobRunState {
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"

  inline def values: js.Array[JobRunState] = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

type JobType = "PROFILE" | "RECIPE"
object JobType {
  inline val PROFILE: "PROFILE" = "PROFILE"
  inline val RECIPE: "RECIPE" = "RECIPE"

  inline def values: js.Array[JobType] = js.Array(PROFILE, RECIPE)
}

type LogSubscription = "ENABLE" | "DISABLE"
object LogSubscription {
  inline val ENABLE: "ENABLE" = "ENABLE"
  inline val DISABLE: "DISABLE" = "DISABLE"

  inline def values: js.Array[LogSubscription] = js.Array(ENABLE, DISABLE)
}

type Order = "DESCENDING" | "ASCENDING"
object Order {
  inline val DESCENDING: "DESCENDING" = "DESCENDING"
  inline val ASCENDING: "ASCENDING" = "ASCENDING"

  inline def values: js.Array[Order] = js.Array(DESCENDING, ASCENDING)
}

type OrderedBy = "LAST_MODIFIED_DATE"
object OrderedBy {
  inline val LAST_MODIFIED_DATE: "LAST_MODIFIED_DATE" = "LAST_MODIFIED_DATE"

  inline def values: js.Array[OrderedBy] = js.Array(LAST_MODIFIED_DATE)
}

type OutputFormat = "CSV" | "JSON" | "PARQUET" | "GLUEPARQUET" | "AVRO" | "ORC" | "XML"
object OutputFormat {
  inline val CSV: "CSV" = "CSV"
  inline val JSON: "JSON" = "JSON"
  inline val PARQUET: "PARQUET" = "PARQUET"
  inline val GLUEPARQUET: "GLUEPARQUET" = "GLUEPARQUET"
  inline val AVRO: "AVRO" = "AVRO"
  inline val ORC: "ORC" = "ORC"
  inline val XML: "XML" = "XML"

  inline def values: js.Array[OutputFormat] = js.Array(CSV, JSON, PARQUET, GLUEPARQUET, AVRO, ORC, XML)
}

type ParameterType = "Datetime" | "Number" | "String"
object ParameterType {
  inline val Datetime: "Datetime" = "Datetime"
  inline val Number: "Number" = "Number"
  inline val String: "String" = "String"

  inline def values: js.Array[ParameterType] = js.Array(Datetime, Number, String)
}

type SampleMode = "FULL_DATASET" | "CUSTOM_ROWS"
object SampleMode {
  inline val FULL_DATASET: "FULL_DATASET" = "FULL_DATASET"
  inline val CUSTOM_ROWS: "CUSTOM_ROWS" = "CUSTOM_ROWS"

  inline def values: js.Array[SampleMode] = js.Array(FULL_DATASET, CUSTOM_ROWS)
}

type SampleType = "FIRST_N" | "LAST_N" | "RANDOM"
object SampleType {
  inline val FIRST_N: "FIRST_N" = "FIRST_N"
  inline val LAST_N: "LAST_N" = "LAST_N"
  inline val RANDOM: "RANDOM" = "RANDOM"

  inline def values: js.Array[SampleType] = js.Array(FIRST_N, LAST_N, RANDOM)
}

type SessionStatus = "ASSIGNED" | "FAILED" | "INITIALIZING" | "PROVISIONING" | "READY" | "RECYCLING" | "ROTATING" | "TERMINATED" | "TERMINATING" | "UPDATING"
object SessionStatus {
  inline val ASSIGNED: "ASSIGNED" = "ASSIGNED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val READY: "READY" = "READY"
  inline val RECYCLING: "RECYCLING" = "RECYCLING"
  inline val ROTATING: "ROTATING" = "ROTATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[SessionStatus] = js.Array(ASSIGNED, FAILED, INITIALIZING, PROVISIONING, READY, RECYCLING, ROTATING, TERMINATED, TERMINATING, UPDATING)
}

type Source = "S3" | "DATA-CATALOG" | "DATABASE"
object Source {
  inline val S3: "S3" = "S3"
  inline val `DATA-CATALOG`: "DATA-CATALOG" = "DATA-CATALOG"
  inline val DATABASE: "DATABASE" = "DATABASE"

  inline def values: js.Array[Source] = js.Array(S3, `DATA-CATALOG`, DATABASE)
}
