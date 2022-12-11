package facade.amazonaws.services.firehose

import scalajs.js

type AmazonOpenSearchServerlessS3BackupMode = "FailedDocumentsOnly" | "AllDocuments"
object AmazonOpenSearchServerlessS3BackupMode {
  inline val FailedDocumentsOnly: "FailedDocumentsOnly" = "FailedDocumentsOnly"
  inline val AllDocuments: "AllDocuments" = "AllDocuments"

  inline def values: js.Array[AmazonOpenSearchServerlessS3BackupMode] = js.Array(FailedDocumentsOnly, AllDocuments)
}

type AmazonopensearchserviceIndexRotationPeriod = "NoRotation" | "OneHour" | "OneDay" | "OneWeek" | "OneMonth"
object AmazonopensearchserviceIndexRotationPeriod {
  inline val NoRotation: "NoRotation" = "NoRotation"
  inline val OneHour: "OneHour" = "OneHour"
  inline val OneDay: "OneDay" = "OneDay"
  inline val OneWeek: "OneWeek" = "OneWeek"
  inline val OneMonth: "OneMonth" = "OneMonth"

  inline def values: js.Array[AmazonopensearchserviceIndexRotationPeriod] = js.Array(NoRotation, OneHour, OneDay, OneWeek, OneMonth)
}

type AmazonopensearchserviceS3BackupMode = "FailedDocumentsOnly" | "AllDocuments"
object AmazonopensearchserviceS3BackupMode {
  inline val FailedDocumentsOnly: "FailedDocumentsOnly" = "FailedDocumentsOnly"
  inline val AllDocuments: "AllDocuments" = "AllDocuments"

  inline def values: js.Array[AmazonopensearchserviceS3BackupMode] = js.Array(FailedDocumentsOnly, AllDocuments)
}

type CompressionFormat = "UNCOMPRESSED" | "GZIP" | "ZIP" | "Snappy" | "HADOOP_SNAPPY"
object CompressionFormat {
  inline val UNCOMPRESSED: "UNCOMPRESSED" = "UNCOMPRESSED"
  inline val GZIP: "GZIP" = "GZIP"
  inline val ZIP: "ZIP" = "ZIP"
  inline val Snappy: "Snappy" = "Snappy"
  inline val HADOOP_SNAPPY: "HADOOP_SNAPPY" = "HADOOP_SNAPPY"

  inline def values: js.Array[CompressionFormat] = js.Array(UNCOMPRESSED, GZIP, ZIP, Snappy, HADOOP_SNAPPY)
}

type ContentEncoding = "NONE" | "GZIP"
object ContentEncoding {
  inline val NONE: "NONE" = "NONE"
  inline val GZIP: "GZIP" = "GZIP"

  inline def values: js.Array[ContentEncoding] = js.Array(NONE, GZIP)
}

type DeliveryStreamEncryptionStatus = "ENABLED" | "ENABLING" | "ENABLING_FAILED" | "DISABLED" | "DISABLING" | "DISABLING_FAILED"
object DeliveryStreamEncryptionStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ENABLING_FAILED: "ENABLING_FAILED" = "ENABLING_FAILED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLING_FAILED: "DISABLING_FAILED" = "DISABLING_FAILED"

  inline def values: js.Array[DeliveryStreamEncryptionStatus] = js.Array(ENABLED, ENABLING, ENABLING_FAILED, DISABLED, DISABLING, DISABLING_FAILED)
}

type DeliveryStreamFailureType = "RETIRE_KMS_GRANT_FAILED" | "CREATE_KMS_GRANT_FAILED" | "KMS_ACCESS_DENIED" | "DISABLED_KMS_KEY" | "INVALID_KMS_KEY" | "KMS_KEY_NOT_FOUND" | "KMS_OPT_IN_REQUIRED" | "CREATE_ENI_FAILED" | "DELETE_ENI_FAILED" | "SUBNET_NOT_FOUND" | "SECURITY_GROUP_NOT_FOUND" | "ENI_ACCESS_DENIED" | "SUBNET_ACCESS_DENIED" | "SECURITY_GROUP_ACCESS_DENIED" | "UNKNOWN_ERROR"
object DeliveryStreamFailureType {
  inline val RETIRE_KMS_GRANT_FAILED: "RETIRE_KMS_GRANT_FAILED" = "RETIRE_KMS_GRANT_FAILED"
  inline val CREATE_KMS_GRANT_FAILED: "CREATE_KMS_GRANT_FAILED" = "CREATE_KMS_GRANT_FAILED"
  inline val KMS_ACCESS_DENIED: "KMS_ACCESS_DENIED" = "KMS_ACCESS_DENIED"
  inline val DISABLED_KMS_KEY: "DISABLED_KMS_KEY" = "DISABLED_KMS_KEY"
  inline val INVALID_KMS_KEY: "INVALID_KMS_KEY" = "INVALID_KMS_KEY"
  inline val KMS_KEY_NOT_FOUND: "KMS_KEY_NOT_FOUND" = "KMS_KEY_NOT_FOUND"
  inline val KMS_OPT_IN_REQUIRED: "KMS_OPT_IN_REQUIRED" = "KMS_OPT_IN_REQUIRED"
  inline val CREATE_ENI_FAILED: "CREATE_ENI_FAILED" = "CREATE_ENI_FAILED"
  inline val DELETE_ENI_FAILED: "DELETE_ENI_FAILED" = "DELETE_ENI_FAILED"
  inline val SUBNET_NOT_FOUND: "SUBNET_NOT_FOUND" = "SUBNET_NOT_FOUND"
  inline val SECURITY_GROUP_NOT_FOUND: "SECURITY_GROUP_NOT_FOUND" = "SECURITY_GROUP_NOT_FOUND"
  inline val ENI_ACCESS_DENIED: "ENI_ACCESS_DENIED" = "ENI_ACCESS_DENIED"
  inline val SUBNET_ACCESS_DENIED: "SUBNET_ACCESS_DENIED" = "SUBNET_ACCESS_DENIED"
  inline val SECURITY_GROUP_ACCESS_DENIED: "SECURITY_GROUP_ACCESS_DENIED" = "SECURITY_GROUP_ACCESS_DENIED"
  inline val UNKNOWN_ERROR: "UNKNOWN_ERROR" = "UNKNOWN_ERROR"

  inline def values: js.Array[DeliveryStreamFailureType] = js.Array(
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
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATING_FAILED: "CREATING_FAILED" = "CREATING_FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETING_FAILED: "DELETING_FAILED" = "DELETING_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[DeliveryStreamStatus] = js.Array(CREATING, CREATING_FAILED, DELETING, DELETING_FAILED, ACTIVE)
}

type DeliveryStreamType = "DirectPut" | "KinesisStreamAsSource"
object DeliveryStreamType {
  inline val DirectPut: "DirectPut" = "DirectPut"
  inline val KinesisStreamAsSource: "KinesisStreamAsSource" = "KinesisStreamAsSource"

  inline def values: js.Array[DeliveryStreamType] = js.Array(DirectPut, KinesisStreamAsSource)
}

type ElasticsearchIndexRotationPeriod = "NoRotation" | "OneHour" | "OneDay" | "OneWeek" | "OneMonth"
object ElasticsearchIndexRotationPeriod {
  inline val NoRotation: "NoRotation" = "NoRotation"
  inline val OneHour: "OneHour" = "OneHour"
  inline val OneDay: "OneDay" = "OneDay"
  inline val OneWeek: "OneWeek" = "OneWeek"
  inline val OneMonth: "OneMonth" = "OneMonth"

  inline def values: js.Array[ElasticsearchIndexRotationPeriod] = js.Array(NoRotation, OneHour, OneDay, OneWeek, OneMonth)
}

type ElasticsearchS3BackupMode = "FailedDocumentsOnly" | "AllDocuments"
object ElasticsearchS3BackupMode {
  inline val FailedDocumentsOnly: "FailedDocumentsOnly" = "FailedDocumentsOnly"
  inline val AllDocuments: "AllDocuments" = "AllDocuments"

  inline def values: js.Array[ElasticsearchS3BackupMode] = js.Array(FailedDocumentsOnly, AllDocuments)
}

type HECEndpointType = "Raw" | "Event"
object HECEndpointType {
  inline val Raw: "Raw" = "Raw"
  inline val Event: "Event" = "Event"

  inline def values: js.Array[HECEndpointType] = js.Array(Raw, Event)
}

type HttpEndpointS3BackupMode = "FailedDataOnly" | "AllData"
object HttpEndpointS3BackupMode {
  inline val FailedDataOnly: "FailedDataOnly" = "FailedDataOnly"
  inline val AllData: "AllData" = "AllData"

  inline def values: js.Array[HttpEndpointS3BackupMode] = js.Array(FailedDataOnly, AllData)
}

type KeyType = "AWS_OWNED_CMK" | "CUSTOMER_MANAGED_CMK"
object KeyType {
  inline val AWS_OWNED_CMK: "AWS_OWNED_CMK" = "AWS_OWNED_CMK"
  inline val CUSTOMER_MANAGED_CMK: "CUSTOMER_MANAGED_CMK" = "CUSTOMER_MANAGED_CMK"

  inline def values: js.Array[KeyType] = js.Array(AWS_OWNED_CMK, CUSTOMER_MANAGED_CMK)
}

type NoEncryptionConfig = "NoEncryption"
object NoEncryptionConfig {
  inline val NoEncryption: "NoEncryption" = "NoEncryption"

  inline def values: js.Array[NoEncryptionConfig] = js.Array(NoEncryption)
}

type OrcCompression = "NONE" | "ZLIB" | "SNAPPY"
object OrcCompression {
  inline val NONE: "NONE" = "NONE"
  inline val ZLIB: "ZLIB" = "ZLIB"
  inline val SNAPPY: "SNAPPY" = "SNAPPY"

  inline def values: js.Array[OrcCompression] = js.Array(NONE, ZLIB, SNAPPY)
}

type OrcFormatVersion = "V0_11" | "V0_12"
object OrcFormatVersion {
  inline val V0_11: "V0_11" = "V0_11"
  inline val V0_12: "V0_12" = "V0_12"

  inline def values: js.Array[OrcFormatVersion] = js.Array(V0_11, V0_12)
}

type ParquetCompression = "UNCOMPRESSED" | "GZIP" | "SNAPPY"
object ParquetCompression {
  inline val UNCOMPRESSED: "UNCOMPRESSED" = "UNCOMPRESSED"
  inline val GZIP: "GZIP" = "GZIP"
  inline val SNAPPY: "SNAPPY" = "SNAPPY"

  inline def values: js.Array[ParquetCompression] = js.Array(UNCOMPRESSED, GZIP, SNAPPY)
}

type ParquetWriterVersion = "V1" | "V2"
object ParquetWriterVersion {
  inline val V1: "V1" = "V1"
  inline val V2: "V2" = "V2"

  inline def values: js.Array[ParquetWriterVersion] = js.Array(V1, V2)
}

type ProcessorParameterName = "LambdaArn" | "NumberOfRetries" | "MetadataExtractionQuery" | "JsonParsingEngine" | "RoleArn" | "BufferSizeInMBs" | "BufferIntervalInSeconds" | "SubRecordType" | "Delimiter"
object ProcessorParameterName {
  inline val LambdaArn: "LambdaArn" = "LambdaArn"
  inline val NumberOfRetries: "NumberOfRetries" = "NumberOfRetries"
  inline val MetadataExtractionQuery: "MetadataExtractionQuery" = "MetadataExtractionQuery"
  inline val JsonParsingEngine: "JsonParsingEngine" = "JsonParsingEngine"
  inline val RoleArn: "RoleArn" = "RoleArn"
  inline val BufferSizeInMBs: "BufferSizeInMBs" = "BufferSizeInMBs"
  inline val BufferIntervalInSeconds: "BufferIntervalInSeconds" = "BufferIntervalInSeconds"
  inline val SubRecordType: "SubRecordType" = "SubRecordType"
  inline val Delimiter: "Delimiter" = "Delimiter"

  inline def values: js.Array[ProcessorParameterName] = js.Array(LambdaArn, NumberOfRetries, MetadataExtractionQuery, JsonParsingEngine, RoleArn, BufferSizeInMBs, BufferIntervalInSeconds, SubRecordType, Delimiter)
}

type ProcessorType = "RecordDeAggregation" | "Lambda" | "MetadataExtraction" | "AppendDelimiterToRecord"
object ProcessorType {
  inline val RecordDeAggregation: "RecordDeAggregation" = "RecordDeAggregation"
  inline val Lambda: "Lambda" = "Lambda"
  inline val MetadataExtraction: "MetadataExtraction" = "MetadataExtraction"
  inline val AppendDelimiterToRecord: "AppendDelimiterToRecord" = "AppendDelimiterToRecord"

  inline def values: js.Array[ProcessorType] = js.Array(RecordDeAggregation, Lambda, MetadataExtraction, AppendDelimiterToRecord)
}

type RedshiftS3BackupMode = "Disabled" | "Enabled"
object RedshiftS3BackupMode {
  inline val Disabled: "Disabled" = "Disabled"
  inline val Enabled: "Enabled" = "Enabled"

  inline def values: js.Array[RedshiftS3BackupMode] = js.Array(Disabled, Enabled)
}

type S3BackupMode = "Disabled" | "Enabled"
object S3BackupMode {
  inline val Disabled: "Disabled" = "Disabled"
  inline val Enabled: "Enabled" = "Enabled"

  inline def values: js.Array[S3BackupMode] = js.Array(Disabled, Enabled)
}

type SplunkS3BackupMode = "FailedEventsOnly" | "AllEvents"
object SplunkS3BackupMode {
  inline val FailedEventsOnly: "FailedEventsOnly" = "FailedEventsOnly"
  inline val AllEvents: "AllEvents" = "AllEvents"

  inline def values: js.Array[SplunkS3BackupMode] = js.Array(FailedEventsOnly, AllEvents)
}
