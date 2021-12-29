package facade.amazonaws.services.dms

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AuthMechanismValue extends js.Any
object AuthMechanismValue {
  val default = "default".asInstanceOf[AuthMechanismValue]
  val mongodb_cr = "mongodb_cr".asInstanceOf[AuthMechanismValue]
  val scram_sha_1 = "scram_sha_1".asInstanceOf[AuthMechanismValue]

  @inline def values = js.Array(default, mongodb_cr, scram_sha_1)
}

@js.native
sealed trait AuthTypeValue extends js.Any
object AuthTypeValue {
  val no = "no".asInstanceOf[AuthTypeValue]
  val password = "password".asInstanceOf[AuthTypeValue]

  @inline def values = js.Array(no, password)
}

@js.native
sealed trait CharLengthSemantics extends js.Any
object CharLengthSemantics {
  val default = "default".asInstanceOf[CharLengthSemantics]
  val char = "char".asInstanceOf[CharLengthSemantics]
  val byte = "byte".asInstanceOf[CharLengthSemantics]

  @inline def values = js.Array(default, char, byte)
}

@js.native
sealed trait CompressionTypeValue extends js.Any
object CompressionTypeValue {
  val none = "none".asInstanceOf[CompressionTypeValue]
  val gzip = "gzip".asInstanceOf[CompressionTypeValue]

  @inline def values = js.Array(none, gzip)
}

@js.native
sealed trait DataFormatValue extends js.Any
object DataFormatValue {
  val csv = "csv".asInstanceOf[DataFormatValue]
  val parquet = "parquet".asInstanceOf[DataFormatValue]

  @inline def values = js.Array(csv, parquet)
}

@js.native
sealed trait DatePartitionDelimiterValue extends js.Any
object DatePartitionDelimiterValue {
  val SLASH = "SLASH".asInstanceOf[DatePartitionDelimiterValue]
  val UNDERSCORE = "UNDERSCORE".asInstanceOf[DatePartitionDelimiterValue]
  val DASH = "DASH".asInstanceOf[DatePartitionDelimiterValue]
  val NONE = "NONE".asInstanceOf[DatePartitionDelimiterValue]

  @inline def values = js.Array(SLASH, UNDERSCORE, DASH, NONE)
}

@js.native
sealed trait DatePartitionSequenceValue extends js.Any
object DatePartitionSequenceValue {
  val YYYYMMDD = "YYYYMMDD".asInstanceOf[DatePartitionSequenceValue]
  val YYYYMMDDHH = "YYYYMMDDHH".asInstanceOf[DatePartitionSequenceValue]
  val YYYYMM = "YYYYMM".asInstanceOf[DatePartitionSequenceValue]
  val MMYYYYDD = "MMYYYYDD".asInstanceOf[DatePartitionSequenceValue]
  val DDMMYYYY = "DDMMYYYY".asInstanceOf[DatePartitionSequenceValue]

  @inline def values = js.Array(YYYYMMDD, YYYYMMDDHH, YYYYMM, MMYYYYDD, DDMMYYYY)
}

@js.native
sealed trait DmsSslModeValue extends js.Any
object DmsSslModeValue {
  val none = "none".asInstanceOf[DmsSslModeValue]
  val require = "require".asInstanceOf[DmsSslModeValue]
  val `verify-ca` = "verify-ca".asInstanceOf[DmsSslModeValue]
  val `verify-full` = "verify-full".asInstanceOf[DmsSslModeValue]

  @inline def values = js.Array(none, require, `verify-ca`, `verify-full`)
}

@js.native
sealed trait EncodingTypeValue extends js.Any
object EncodingTypeValue {
  val plain = "plain".asInstanceOf[EncodingTypeValue]
  val `plain-dictionary` = "plain-dictionary".asInstanceOf[EncodingTypeValue]
  val `rle-dictionary` = "rle-dictionary".asInstanceOf[EncodingTypeValue]

  @inline def values = js.Array(plain, `plain-dictionary`, `rle-dictionary`)
}

@js.native
sealed trait EncryptionModeValue extends js.Any
object EncryptionModeValue {
  val `sse-s3` = "sse-s3".asInstanceOf[EncryptionModeValue]
  val `sse-kms` = "sse-kms".asInstanceOf[EncryptionModeValue]

  @inline def values = js.Array(`sse-s3`, `sse-kms`)
}

@js.native
sealed trait EndpointSettingTypeValue extends js.Any
object EndpointSettingTypeValue {
  val string = "string".asInstanceOf[EndpointSettingTypeValue]
  val boolean = "boolean".asInstanceOf[EndpointSettingTypeValue]
  val integer = "integer".asInstanceOf[EndpointSettingTypeValue]
  val `enum` = "enum".asInstanceOf[EndpointSettingTypeValue]

  @inline def values = js.Array(string, boolean, integer, `enum`)
}

@js.native
sealed trait KafkaSecurityProtocol extends js.Any
object KafkaSecurityProtocol {
  val plaintext = "plaintext".asInstanceOf[KafkaSecurityProtocol]
  val `ssl-authentication` = "ssl-authentication".asInstanceOf[KafkaSecurityProtocol]
  val `ssl-encryption` = "ssl-encryption".asInstanceOf[KafkaSecurityProtocol]
  val `sasl-ssl` = "sasl-ssl".asInstanceOf[KafkaSecurityProtocol]

  @inline def values = js.Array(plaintext, `ssl-authentication`, `ssl-encryption`, `sasl-ssl`)
}

@js.native
sealed trait MessageFormatValue extends js.Any
object MessageFormatValue {
  val json = "json".asInstanceOf[MessageFormatValue]
  val `json-unformatted` = "json-unformatted".asInstanceOf[MessageFormatValue]

  @inline def values = js.Array(json, `json-unformatted`)
}

@js.native
sealed trait MigrationTypeValue extends js.Any
object MigrationTypeValue {
  val `full-load` = "full-load".asInstanceOf[MigrationTypeValue]
  val cdc = "cdc".asInstanceOf[MigrationTypeValue]
  val `full-load-and-cdc` = "full-load-and-cdc".asInstanceOf[MigrationTypeValue]

  @inline def values = js.Array(`full-load`, cdc, `full-load-and-cdc`)
}

@js.native
sealed trait NestingLevelValue extends js.Any
object NestingLevelValue {
  val none = "none".asInstanceOf[NestingLevelValue]
  val one = "one".asInstanceOf[NestingLevelValue]

  @inline def values = js.Array(none, one)
}

@js.native
sealed trait ParquetVersionValue extends js.Any
object ParquetVersionValue {
  val `parquet-1-0` = "parquet-1-0".asInstanceOf[ParquetVersionValue]
  val `parquet-2-0` = "parquet-2-0".asInstanceOf[ParquetVersionValue]

  @inline def values = js.Array(`parquet-1-0`, `parquet-2-0`)
}

@js.native
sealed trait RefreshSchemasStatusTypeValue extends js.Any
object RefreshSchemasStatusTypeValue {
  val successful = "successful".asInstanceOf[RefreshSchemasStatusTypeValue]
  val failed = "failed".asInstanceOf[RefreshSchemasStatusTypeValue]
  val refreshing = "refreshing".asInstanceOf[RefreshSchemasStatusTypeValue]

  @inline def values = js.Array(successful, failed, refreshing)
}

@js.native
sealed trait ReleaseStatusValues extends js.Any
object ReleaseStatusValues {
  val beta = "beta".asInstanceOf[ReleaseStatusValues]

  @inline def values = js.Array(beta)
}

@js.native
sealed trait ReloadOptionValue extends js.Any
object ReloadOptionValue {
  val `data-reload` = "data-reload".asInstanceOf[ReloadOptionValue]
  val `validate-only` = "validate-only".asInstanceOf[ReloadOptionValue]

  @inline def values = js.Array(`data-reload`, `validate-only`)
}

@js.native
sealed trait ReplicationEndpointTypeValue extends js.Any
object ReplicationEndpointTypeValue {
  val source = "source".asInstanceOf[ReplicationEndpointTypeValue]
  val target = "target".asInstanceOf[ReplicationEndpointTypeValue]

  @inline def values = js.Array(source, target)
}

@js.native
sealed trait SafeguardPolicy extends js.Any
object SafeguardPolicy {
  val `rely-on-sql-server-replication-agent` = "rely-on-sql-server-replication-agent".asInstanceOf[SafeguardPolicy]
  val `exclusive-automatic-truncation` = "exclusive-automatic-truncation".asInstanceOf[SafeguardPolicy]
  val `shared-automatic-truncation` = "shared-automatic-truncation".asInstanceOf[SafeguardPolicy]

  @inline def values = js.Array(`rely-on-sql-server-replication-agent`, `exclusive-automatic-truncation`, `shared-automatic-truncation`)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val `replication-instance` = "replication-instance".asInstanceOf[SourceType]

  @inline def values = js.Array(`replication-instance`)
}

@js.native
sealed trait StartReplicationTaskTypeValue extends js.Any
object StartReplicationTaskTypeValue {
  val `start-replication` = "start-replication".asInstanceOf[StartReplicationTaskTypeValue]
  val `resume-processing` = "resume-processing".asInstanceOf[StartReplicationTaskTypeValue]
  val `reload-target` = "reload-target".asInstanceOf[StartReplicationTaskTypeValue]

  @inline def values = js.Array(`start-replication`, `resume-processing`, `reload-target`)
}

@js.native
sealed trait TargetDbType extends js.Any
object TargetDbType {
  val `specific-database` = "specific-database".asInstanceOf[TargetDbType]
  val `multiple-databases` = "multiple-databases".asInstanceOf[TargetDbType]

  @inline def values = js.Array(`specific-database`, `multiple-databases`)
}

