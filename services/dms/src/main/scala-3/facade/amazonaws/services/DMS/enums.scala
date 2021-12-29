package facade.amazonaws.services.dms

import scalajs._

type AuthMechanismValue = "default" | "mongodb_cr" | "scram_sha_1"
object AuthMechanismValue {
  val default: "default" = "default"
  val mongodb_cr: "mongodb_cr" = "mongodb_cr"
  val scram_sha_1: "scram_sha_1" = "scram_sha_1"

  @inline def values = js.Array[AuthMechanismValue](default, mongodb_cr, scram_sha_1)
}

type AuthTypeValue = "no" | "password"
object AuthTypeValue {
  val no: "no" = "no"
  val password: "password" = "password"

  @inline def values = js.Array[AuthTypeValue](no, password)
}

type CharLengthSemantics = "default" | "char" | "byte"
object CharLengthSemantics {
  val default: "default" = "default"
  val char: "char" = "char"
  val byte: "byte" = "byte"

  @inline def values = js.Array[CharLengthSemantics](default, char, byte)
}

type CompressionTypeValue = "none" | "gzip"
object CompressionTypeValue {
  val none: "none" = "none"
  val gzip: "gzip" = "gzip"

  @inline def values = js.Array[CompressionTypeValue](none, gzip)
}

type DataFormatValue = "csv" | "parquet"
object DataFormatValue {
  val csv: "csv" = "csv"
  val parquet: "parquet" = "parquet"

  @inline def values = js.Array[DataFormatValue](csv, parquet)
}

type DatePartitionDelimiterValue = "SLASH" | "UNDERSCORE" | "DASH" | "NONE"
object DatePartitionDelimiterValue {
  val SLASH: "SLASH" = "SLASH"
  val UNDERSCORE: "UNDERSCORE" = "UNDERSCORE"
  val DASH: "DASH" = "DASH"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[DatePartitionDelimiterValue](SLASH, UNDERSCORE, DASH, NONE)
}

type DatePartitionSequenceValue = "YYYYMMDD" | "YYYYMMDDHH" | "YYYYMM" | "MMYYYYDD" | "DDMMYYYY"
object DatePartitionSequenceValue {
  val YYYYMMDD: "YYYYMMDD" = "YYYYMMDD"
  val YYYYMMDDHH: "YYYYMMDDHH" = "YYYYMMDDHH"
  val YYYYMM: "YYYYMM" = "YYYYMM"
  val MMYYYYDD: "MMYYYYDD" = "MMYYYYDD"
  val DDMMYYYY: "DDMMYYYY" = "DDMMYYYY"

  @inline def values = js.Array[DatePartitionSequenceValue](YYYYMMDD, YYYYMMDDHH, YYYYMM, MMYYYYDD, DDMMYYYY)
}

type DmsSslModeValue = "none" | "require" | "verify-ca" | "verify-full"
object DmsSslModeValue {
  val none: "none" = "none"
  val require: "require" = "require"
  val `verify-ca`: "verify-ca" = "verify-ca"
  val `verify-full`: "verify-full" = "verify-full"

  @inline def values = js.Array[DmsSslModeValue](none, require, `verify-ca`, `verify-full`)
}

type EncodingTypeValue = "plain" | "plain-dictionary" | "rle-dictionary"
object EncodingTypeValue {
  val plain: "plain" = "plain"
  val `plain-dictionary`: "plain-dictionary" = "plain-dictionary"
  val `rle-dictionary`: "rle-dictionary" = "rle-dictionary"

  @inline def values = js.Array[EncodingTypeValue](plain, `plain-dictionary`, `rle-dictionary`)
}

type EncryptionModeValue = "sse-s3" | "sse-kms"
object EncryptionModeValue {
  val `sse-s3`: "sse-s3" = "sse-s3"
  val `sse-kms`: "sse-kms" = "sse-kms"

  @inline def values = js.Array[EncryptionModeValue](`sse-s3`, `sse-kms`)
}

type EndpointSettingTypeValue = "string" | "boolean" | "integer" | "enum"
object EndpointSettingTypeValue {
  val string: "string" = "string"
  val boolean: "boolean" = "boolean"
  val integer: "integer" = "integer"
  val `enum`: "enum" = "enum"

  @inline def values = js.Array[EndpointSettingTypeValue](string, boolean, integer, `enum`)
}

type KafkaSecurityProtocol = "plaintext" | "ssl-authentication" | "ssl-encryption" | "sasl-ssl"
object KafkaSecurityProtocol {
  val plaintext: "plaintext" = "plaintext"
  val `ssl-authentication`: "ssl-authentication" = "ssl-authentication"
  val `ssl-encryption`: "ssl-encryption" = "ssl-encryption"
  val `sasl-ssl`: "sasl-ssl" = "sasl-ssl"

  @inline def values = js.Array[KafkaSecurityProtocol](plaintext, `ssl-authentication`, `ssl-encryption`, `sasl-ssl`)
}

type MessageFormatValue = "json" | "json-unformatted"
object MessageFormatValue {
  val json: "json" = "json"
  val `json-unformatted`: "json-unformatted" = "json-unformatted"

  @inline def values = js.Array[MessageFormatValue](json, `json-unformatted`)
}

type MigrationTypeValue = "full-load" | "cdc" | "full-load-and-cdc"
object MigrationTypeValue {
  val `full-load`: "full-load" = "full-load"
  val cdc: "cdc" = "cdc"
  val `full-load-and-cdc`: "full-load-and-cdc" = "full-load-and-cdc"

  @inline def values = js.Array[MigrationTypeValue](`full-load`, cdc, `full-load-and-cdc`)
}

type NestingLevelValue = "none" | "one"
object NestingLevelValue {
  val none: "none" = "none"
  val one: "one" = "one"

  @inline def values = js.Array[NestingLevelValue](none, one)
}

type ParquetVersionValue = "parquet-1-0" | "parquet-2-0"
object ParquetVersionValue {
  val `parquet-1-0`: "parquet-1-0" = "parquet-1-0"
  val `parquet-2-0`: "parquet-2-0" = "parquet-2-0"

  @inline def values = js.Array[ParquetVersionValue](`parquet-1-0`, `parquet-2-0`)
}

type RefreshSchemasStatusTypeValue = "successful" | "failed" | "refreshing"
object RefreshSchemasStatusTypeValue {
  val successful: "successful" = "successful"
  val failed: "failed" = "failed"
  val refreshing: "refreshing" = "refreshing"

  @inline def values = js.Array[RefreshSchemasStatusTypeValue](successful, failed, refreshing)
}

type ReleaseStatusValues = "beta"
object ReleaseStatusValues {
  val beta: "beta" = "beta"

  @inline def values = js.Array[ReleaseStatusValues](beta)
}

type ReloadOptionValue = "data-reload" | "validate-only"
object ReloadOptionValue {
  val `data-reload`: "data-reload" = "data-reload"
  val `validate-only`: "validate-only" = "validate-only"

  @inline def values = js.Array[ReloadOptionValue](`data-reload`, `validate-only`)
}

type ReplicationEndpointTypeValue = "source" | "target"
object ReplicationEndpointTypeValue {
  val source: "source" = "source"
  val target: "target" = "target"

  @inline def values = js.Array[ReplicationEndpointTypeValue](source, target)
}

type SafeguardPolicy = "rely-on-sql-server-replication-agent" | "exclusive-automatic-truncation" | "shared-automatic-truncation"
object SafeguardPolicy {
  val `rely-on-sql-server-replication-agent`: "rely-on-sql-server-replication-agent" = "rely-on-sql-server-replication-agent"
  val `exclusive-automatic-truncation`: "exclusive-automatic-truncation" = "exclusive-automatic-truncation"
  val `shared-automatic-truncation`: "shared-automatic-truncation" = "shared-automatic-truncation"

  @inline def values = js.Array[SafeguardPolicy](`rely-on-sql-server-replication-agent`, `exclusive-automatic-truncation`, `shared-automatic-truncation`)
}

type SourceType = "replication-instance"
object SourceType {
  val `replication-instance`: "replication-instance" = "replication-instance"

  @inline def values = js.Array[SourceType](`replication-instance`)
}

type StartReplicationTaskTypeValue = "start-replication" | "resume-processing" | "reload-target"
object StartReplicationTaskTypeValue {
  val `start-replication`: "start-replication" = "start-replication"
  val `resume-processing`: "resume-processing" = "resume-processing"
  val `reload-target`: "reload-target" = "reload-target"

  @inline def values = js.Array[StartReplicationTaskTypeValue](`start-replication`, `resume-processing`, `reload-target`)
}

type TargetDbType = "specific-database" | "multiple-databases"
object TargetDbType {
  val `specific-database`: "specific-database" = "specific-database"
  val `multiple-databases`: "multiple-databases" = "multiple-databases"

  @inline def values = js.Array[TargetDbType](`specific-database`, `multiple-databases`)
}
