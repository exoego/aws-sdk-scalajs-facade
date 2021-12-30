package facade.amazonaws.services.dms

import scalajs.js

type AuthMechanismValue = "default" | "mongodb_cr" | "scram_sha_1"
object AuthMechanismValue {
  inline val default: "default" = "default"
  inline val mongodb_cr: "mongodb_cr" = "mongodb_cr"
  inline val scram_sha_1: "scram_sha_1" = "scram_sha_1"

  inline def values: js.Array[AuthMechanismValue] = js.Array(default, mongodb_cr, scram_sha_1)
}

type AuthTypeValue = "no" | "password"
object AuthTypeValue {
  inline val no: "no" = "no"
  inline val password: "password" = "password"

  inline def values: js.Array[AuthTypeValue] = js.Array(no, password)
}

type CharLengthSemantics = "default" | "char" | "byte"
object CharLengthSemantics {
  inline val default: "default" = "default"
  inline val char: "char" = "char"
  inline val byte: "byte" = "byte"

  inline def values: js.Array[CharLengthSemantics] = js.Array(default, char, byte)
}

type CompressionTypeValue = "none" | "gzip"
object CompressionTypeValue {
  inline val none: "none" = "none"
  inline val gzip: "gzip" = "gzip"

  inline def values: js.Array[CompressionTypeValue] = js.Array(none, gzip)
}

type DataFormatValue = "csv" | "parquet"
object DataFormatValue {
  inline val csv: "csv" = "csv"
  inline val parquet: "parquet" = "parquet"

  inline def values: js.Array[DataFormatValue] = js.Array(csv, parquet)
}

type DatePartitionDelimiterValue = "SLASH" | "UNDERSCORE" | "DASH" | "NONE"
object DatePartitionDelimiterValue {
  inline val SLASH: "SLASH" = "SLASH"
  inline val UNDERSCORE: "UNDERSCORE" = "UNDERSCORE"
  inline val DASH: "DASH" = "DASH"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[DatePartitionDelimiterValue] = js.Array(SLASH, UNDERSCORE, DASH, NONE)
}

type DatePartitionSequenceValue = "YYYYMMDD" | "YYYYMMDDHH" | "YYYYMM" | "MMYYYYDD" | "DDMMYYYY"
object DatePartitionSequenceValue {
  inline val YYYYMMDD: "YYYYMMDD" = "YYYYMMDD"
  inline val YYYYMMDDHH: "YYYYMMDDHH" = "YYYYMMDDHH"
  inline val YYYYMM: "YYYYMM" = "YYYYMM"
  inline val MMYYYYDD: "MMYYYYDD" = "MMYYYYDD"
  inline val DDMMYYYY: "DDMMYYYY" = "DDMMYYYY"

  inline def values: js.Array[DatePartitionSequenceValue] = js.Array(YYYYMMDD, YYYYMMDDHH, YYYYMM, MMYYYYDD, DDMMYYYY)
}

type DmsSslModeValue = "none" | "require" | "verify-ca" | "verify-full"
object DmsSslModeValue {
  inline val none: "none" = "none"
  inline val require: "require" = "require"
  inline val `verify-ca`: "verify-ca" = "verify-ca"
  inline val `verify-full`: "verify-full" = "verify-full"

  inline def values: js.Array[DmsSslModeValue] = js.Array(none, require, `verify-ca`, `verify-full`)
}

type EncodingTypeValue = "plain" | "plain-dictionary" | "rle-dictionary"
object EncodingTypeValue {
  inline val plain: "plain" = "plain"
  inline val `plain-dictionary`: "plain-dictionary" = "plain-dictionary"
  inline val `rle-dictionary`: "rle-dictionary" = "rle-dictionary"

  inline def values: js.Array[EncodingTypeValue] = js.Array(plain, `plain-dictionary`, `rle-dictionary`)
}

type EncryptionModeValue = "sse-s3" | "sse-kms"
object EncryptionModeValue {
  inline val `sse-s3`: "sse-s3" = "sse-s3"
  inline val `sse-kms`: "sse-kms" = "sse-kms"

  inline def values: js.Array[EncryptionModeValue] = js.Array(`sse-s3`, `sse-kms`)
}

type EndpointSettingTypeValue = "string" | "boolean" | "integer" | "enum"
object EndpointSettingTypeValue {
  inline val string: "string" = "string"
  inline val boolean: "boolean" = "boolean"
  inline val integer: "integer" = "integer"
  inline val `enum`: "enum" = "enum"

  inline def values: js.Array[EndpointSettingTypeValue] = js.Array(string, boolean, integer, `enum`)
}

type KafkaSecurityProtocol = "plaintext" | "ssl-authentication" | "ssl-encryption" | "sasl-ssl"
object KafkaSecurityProtocol {
  inline val plaintext: "plaintext" = "plaintext"
  inline val `ssl-authentication`: "ssl-authentication" = "ssl-authentication"
  inline val `ssl-encryption`: "ssl-encryption" = "ssl-encryption"
  inline val `sasl-ssl`: "sasl-ssl" = "sasl-ssl"

  inline def values: js.Array[KafkaSecurityProtocol] = js.Array(plaintext, `ssl-authentication`, `ssl-encryption`, `sasl-ssl`)
}

type MessageFormatValue = "json" | "json-unformatted"
object MessageFormatValue {
  inline val json: "json" = "json"
  inline val `json-unformatted`: "json-unformatted" = "json-unformatted"

  inline def values: js.Array[MessageFormatValue] = js.Array(json, `json-unformatted`)
}

type MigrationTypeValue = "full-load" | "cdc" | "full-load-and-cdc"
object MigrationTypeValue {
  inline val `full-load`: "full-load" = "full-load"
  inline val cdc: "cdc" = "cdc"
  inline val `full-load-and-cdc`: "full-load-and-cdc" = "full-load-and-cdc"

  inline def values: js.Array[MigrationTypeValue] = js.Array(`full-load`, cdc, `full-load-and-cdc`)
}

type NestingLevelValue = "none" | "one"
object NestingLevelValue {
  inline val none: "none" = "none"
  inline val one: "one" = "one"

  inline def values: js.Array[NestingLevelValue] = js.Array(none, one)
}

type ParquetVersionValue = "parquet-1-0" | "parquet-2-0"
object ParquetVersionValue {
  inline val `parquet-1-0`: "parquet-1-0" = "parquet-1-0"
  inline val `parquet-2-0`: "parquet-2-0" = "parquet-2-0"

  inline def values: js.Array[ParquetVersionValue] = js.Array(`parquet-1-0`, `parquet-2-0`)
}

type RefreshSchemasStatusTypeValue = "successful" | "failed" | "refreshing"
object RefreshSchemasStatusTypeValue {
  inline val successful: "successful" = "successful"
  inline val failed: "failed" = "failed"
  inline val refreshing: "refreshing" = "refreshing"

  inline def values: js.Array[RefreshSchemasStatusTypeValue] = js.Array(successful, failed, refreshing)
}

type ReleaseStatusValues = "beta"
object ReleaseStatusValues {
  inline val beta: "beta" = "beta"

  inline def values: js.Array[ReleaseStatusValues] = js.Array(beta)
}

type ReloadOptionValue = "data-reload" | "validate-only"
object ReloadOptionValue {
  inline val `data-reload`: "data-reload" = "data-reload"
  inline val `validate-only`: "validate-only" = "validate-only"

  inline def values: js.Array[ReloadOptionValue] = js.Array(`data-reload`, `validate-only`)
}

type ReplicationEndpointTypeValue = "source" | "target"
object ReplicationEndpointTypeValue {
  inline val source: "source" = "source"
  inline val target: "target" = "target"

  inline def values: js.Array[ReplicationEndpointTypeValue] = js.Array(source, target)
}

type SafeguardPolicy = "rely-on-sql-server-replication-agent" | "exclusive-automatic-truncation" | "shared-automatic-truncation"
object SafeguardPolicy {
  inline val `rely-on-sql-server-replication-agent`: "rely-on-sql-server-replication-agent" = "rely-on-sql-server-replication-agent"
  inline val `exclusive-automatic-truncation`: "exclusive-automatic-truncation" = "exclusive-automatic-truncation"
  inline val `shared-automatic-truncation`: "shared-automatic-truncation" = "shared-automatic-truncation"

  inline def values: js.Array[SafeguardPolicy] = js.Array(`rely-on-sql-server-replication-agent`, `exclusive-automatic-truncation`, `shared-automatic-truncation`)
}

type SourceType = "replication-instance"
object SourceType {
  inline val `replication-instance`: "replication-instance" = "replication-instance"

  inline def values: js.Array[SourceType] = js.Array(`replication-instance`)
}

type StartReplicationTaskTypeValue = "start-replication" | "resume-processing" | "reload-target"
object StartReplicationTaskTypeValue {
  inline val `start-replication`: "start-replication" = "start-replication"
  inline val `resume-processing`: "resume-processing" = "resume-processing"
  inline val `reload-target`: "reload-target" = "reload-target"

  inline def values: js.Array[StartReplicationTaskTypeValue] = js.Array(`start-replication`, `resume-processing`, `reload-target`)
}

type TargetDbType = "specific-database" | "multiple-databases"
object TargetDbType {
  inline val `specific-database`: "specific-database" = "specific-database"
  inline val `multiple-databases`: "multiple-databases" = "multiple-databases"

  inline def values: js.Array[TargetDbType] = js.Array(`specific-database`, `multiple-databases`)
}
