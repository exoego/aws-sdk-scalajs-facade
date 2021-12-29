package facade.amazonaws.services.firehose

import scalajs._

type CompressionFormat = "UNCOMPRESSED" | "GZIP" | "ZIP" | "Snappy" | "HADOOP_SNAPPY"
object CompressionFormat {
  val UNCOMPRESSED: "UNCOMPRESSED" = "UNCOMPRESSED"
  val GZIP: "GZIP" = "GZIP"
  val ZIP: "ZIP" = "ZIP"
  val Snappy: "Snappy" = "Snappy"
  val HADOOP_SNAPPY: "HADOOP_SNAPPY" = "HADOOP_SNAPPY"

  @inline def values = js.Array[CompressionFormat](UNCOMPRESSED, GZIP, ZIP, Snappy, HADOOP_SNAPPY)
}

type ContentEncoding = "NONE" | "GZIP"
object ContentEncoding {
  val NONE: "NONE" = "NONE"
  val GZIP: "GZIP" = "GZIP"

  @inline def values = js.Array[ContentEncoding](NONE, GZIP)
}

type DeliveryStreamEncryptionStatus = "ENABLED" | "ENABLING" | "ENABLING_FAILED" | "DISABLED" | "DISABLING" | "DISABLING_FAILED"
object DeliveryStreamEncryptionStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val ENABLING: "ENABLING" = "ENABLING"
  val ENABLING_FAILED: "ENABLING_FAILED" = "ENABLING_FAILED"
  val DISABLED: "DISABLED" = "DISABLED"
  val DISABLING: "DISABLING" = "DISABLING"
  val DISABLING_FAILED: "DISABLING_FAILED" = "DISABLING_FAILED"

  @inline def values = js.Array[DeliveryStreamEncryptionStatus](ENABLED, ENABLING, ENABLING_FAILED, DISABLED, DISABLING, DISABLING_FAILED)
}

type DeliveryStreamFailureType = "RETIRE_KMS_GRANT_FAILED" | "CREATE_KMS_GRANT_FAILED" | "KMS_ACCESS_DENIED" | "DISABLED_KMS_KEY" | "INVALID_KMS_KEY" | "KMS_KEY_NOT_FOUND" | "KMS_OPT_IN_REQUIRED" | "CREATE_ENI_FAILED" | "DELETE_ENI_FAILED" | "SUBNET_NOT_FOUND" | "SECURITY_GROUP_NOT_FOUND" | "ENI_ACCESS_DENIED" | "SUBNET_ACCESS_DENIED" | "SECURITY_GROUP_ACCESS_DENIED" | "UNKNOWN_ERROR"
object DeliveryStreamFailureType {
  val RETIRE_KMS_GRANT_FAILED: "RETIRE_KMS_GRANT_FAILED" = "RETIRE_KMS_GRANT_FAILED"
  val CREATE_KMS_GRANT_FAILED: "CREATE_KMS_GRANT_FAILED" = "CREATE_KMS_GRANT_FAILED"
  val KMS_ACCESS_DENIED: "KMS_ACCESS_DENIED" = "KMS_ACCESS_DENIED"
  val DISABLED_KMS_KEY: "DISABLED_KMS_KEY" = "DISABLED_KMS_KEY"
  val INVALID_KMS_KEY: "INVALID_KMS_KEY" = "INVALID_KMS_KEY"
  val KMS_KEY_NOT_FOUND: "KMS_KEY_NOT_FOUND" = "KMS_KEY_NOT_FOUND"
  val KMS_OPT_IN_REQUIRED: "KMS_OPT_IN_REQUIRED" = "KMS_OPT_IN_REQUIRED"
  val CREATE_ENI_FAILED: "CREATE_ENI_FAILED" = "CREATE_ENI_FAILED"
  val DELETE_ENI_FAILED: "DELETE_ENI_FAILED" = "DELETE_ENI_FAILED"
  val SUBNET_NOT_FOUND: "SUBNET_NOT_FOUND" = "SUBNET_NOT_FOUND"
  val SECURITY_GROUP_NOT_FOUND: "SECURITY_GROUP_NOT_FOUND" = "SECURITY_GROUP_NOT_FOUND"
  val ENI_ACCESS_DENIED: "ENI_ACCESS_DENIED" = "ENI_ACCESS_DENIED"
  val SUBNET_ACCESS_DENIED: "SUBNET_ACCESS_DENIED" = "SUBNET_ACCESS_DENIED"
  val SECURITY_GROUP_ACCESS_DENIED: "SECURITY_GROUP_ACCESS_DENIED" = "SECURITY_GROUP_ACCESS_DENIED"
  val UNKNOWN_ERROR: "UNKNOWN_ERROR" = "UNKNOWN_ERROR"

  @inline def values = js.Array[DeliveryStreamFailureType](
    RETIRE_KMS_GRANT_FAILED,
    CREATE_KMS_GRANT_FAILED,
    KMS_ACCESS_DENIED,
    DISABLED_KMS_KEY,
    INVALID_KMS_KEY,
    KMS_KEY_NOT_FOUND,
    KMS_OPT_IN_REQUIRED,
    CREATE_ENI_FAILED,
    DELETE_ENI_FAILED,
    SUBNET_NOT_FOUND,
    SECURITY_GROUP_NOT_FOUND,
    ENI_ACCESS_DENIED,
    SUBNET_ACCESS_DENIED,
    SECURITY_GROUP_ACCESS_DENIED,
    UNKNOWN_ERROR
  )
}

type DeliveryStreamStatus = "CREATING" | "CREATING_FAILED" | "DELETING" | "DELETING_FAILED" | "ACTIVE"
object DeliveryStreamStatus {
  val CREATING: "CREATING" = "CREATING"
  val CREATING_FAILED: "CREATING_FAILED" = "CREATING_FAILED"
  val DELETING: "DELETING" = "DELETING"
  val DELETING_FAILED: "DELETING_FAILED" = "DELETING_FAILED"
  val ACTIVE: "ACTIVE" = "ACTIVE"

  @inline def values = js.Array[DeliveryStreamStatus](CREATING, CREATING_FAILED, DELETING, DELETING_FAILED, ACTIVE)
}

type DeliveryStreamType = "DirectPut" | "KinesisStreamAsSource"
object DeliveryStreamType {
  val DirectPut: "DirectPut" = "DirectPut"
  val KinesisStreamAsSource: "KinesisStreamAsSource" = "KinesisStreamAsSource"

  @inline def values = js.Array[DeliveryStreamType](DirectPut, KinesisStreamAsSource)
}

type ElasticsearchIndexRotationPeriod = "NoRotation" | "OneHour" | "OneDay" | "OneWeek" | "OneMonth"
object ElasticsearchIndexRotationPeriod {
  val NoRotation: "NoRotation" = "NoRotation"
  val OneHour: "OneHour" = "OneHour"
  val OneDay: "OneDay" = "OneDay"
  val OneWeek: "OneWeek" = "OneWeek"
  val OneMonth: "OneMonth" = "OneMonth"

  @inline def values = js.Array[ElasticsearchIndexRotationPeriod](NoRotation, OneHour, OneDay, OneWeek, OneMonth)
}

type ElasticsearchS3BackupMode = "FailedDocumentsOnly" | "AllDocuments"
object ElasticsearchS3BackupMode {
  val FailedDocumentsOnly: "FailedDocumentsOnly" = "FailedDocumentsOnly"
  val AllDocuments: "AllDocuments" = "AllDocuments"

  @inline def values = js.Array[ElasticsearchS3BackupMode](FailedDocumentsOnly, AllDocuments)
}

type HECEndpointType = "Raw" | "Event"
object HECEndpointType {
  val Raw: "Raw" = "Raw"
  val Event: "Event" = "Event"

  @inline def values = js.Array[HECEndpointType](Raw, Event)
}

type HttpEndpointS3BackupMode = "FailedDataOnly" | "AllData"
object HttpEndpointS3BackupMode {
  val FailedDataOnly: "FailedDataOnly" = "FailedDataOnly"
  val AllData: "AllData" = "AllData"

  @inline def values = js.Array[HttpEndpointS3BackupMode](FailedDataOnly, AllData)
}

type KeyType = "AWS_OWNED_CMK" | "CUSTOMER_MANAGED_CMK"
object KeyType {
  val AWS_OWNED_CMK: "AWS_OWNED_CMK" = "AWS_OWNED_CMK"
  val CUSTOMER_MANAGED_CMK: "CUSTOMER_MANAGED_CMK" = "CUSTOMER_MANAGED_CMK"

  @inline def values = js.Array[KeyType](AWS_OWNED_CMK, CUSTOMER_MANAGED_CMK)
}

type NoEncryptionConfig = "NoEncryption"
object NoEncryptionConfig {
  val NoEncryption: "NoEncryption" = "NoEncryption"

  @inline def values = js.Array[NoEncryptionConfig](NoEncryption)
}

type OrcCompression = "NONE" | "ZLIB" | "SNAPPY"
object OrcCompression {
  val NONE: "NONE" = "NONE"
  val ZLIB: "ZLIB" = "ZLIB"
  val SNAPPY: "SNAPPY" = "SNAPPY"

  @inline def values = js.Array[OrcCompression](NONE, ZLIB, SNAPPY)
}

type OrcFormatVersion = "V0_11" | "V0_12"
object OrcFormatVersion {
  val V0_11: "V0_11" = "V0_11"
  val V0_12: "V0_12" = "V0_12"

  @inline def values = js.Array[OrcFormatVersion](V0_11, V0_12)
}

type ParquetCompression = "UNCOMPRESSED" | "GZIP" | "SNAPPY"
object ParquetCompression {
  val UNCOMPRESSED: "UNCOMPRESSED" = "UNCOMPRESSED"
  val GZIP: "GZIP" = "GZIP"
  val SNAPPY: "SNAPPY" = "SNAPPY"

  @inline def values = js.Array[ParquetCompression](UNCOMPRESSED, GZIP, SNAPPY)
}

type ParquetWriterVersion = "V1" | "V2"
object ParquetWriterVersion {
  val V1: "V1" = "V1"
  val V2: "V2" = "V2"

  @inline def values = js.Array[ParquetWriterVersion](V1, V2)
}

type ProcessorParameterName = "LambdaArn" | "NumberOfRetries" | "RoleArn" | "BufferSizeInMBs" | "BufferIntervalInSeconds"
object ProcessorParameterName {
  val LambdaArn: "LambdaArn" = "LambdaArn"
  val NumberOfRetries: "NumberOfRetries" = "NumberOfRetries"
  val RoleArn: "RoleArn" = "RoleArn"
  val BufferSizeInMBs: "BufferSizeInMBs" = "BufferSizeInMBs"
  val BufferIntervalInSeconds: "BufferIntervalInSeconds" = "BufferIntervalInSeconds"

  @inline def values = js.Array[ProcessorParameterName](LambdaArn, NumberOfRetries, RoleArn, BufferSizeInMBs, BufferIntervalInSeconds)
}

type ProcessorType = "Lambda"
object ProcessorType {
  val Lambda: "Lambda" = "Lambda"

  @inline def values = js.Array[ProcessorType](Lambda)
}

type RedshiftS3BackupMode = "Disabled" | "Enabled"
object RedshiftS3BackupMode {
  val Disabled: "Disabled" = "Disabled"
  val Enabled: "Enabled" = "Enabled"

  @inline def values = js.Array[RedshiftS3BackupMode](Disabled, Enabled)
}

type S3BackupMode = "Disabled" | "Enabled"
object S3BackupMode {
  val Disabled: "Disabled" = "Disabled"
  val Enabled: "Enabled" = "Enabled"

  @inline def values = js.Array[S3BackupMode](Disabled, Enabled)
}

type SplunkS3BackupMode = "FailedEventsOnly" | "AllEvents"
object SplunkS3BackupMode {
  val FailedEventsOnly: "FailedEventsOnly" = "FailedEventsOnly"
  val AllEvents: "AllEvents" = "AllEvents"

  @inline def values = js.Array[SplunkS3BackupMode](FailedEventsOnly, AllEvents)
}
