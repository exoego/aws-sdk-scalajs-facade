package facade.amazonaws.services.firehose

import scalajs.js

@js.native
sealed trait AmazonOpenSearchServerlessS3BackupMode extends js.Any
object AmazonOpenSearchServerlessS3BackupMode {
  val FailedDocumentsOnly = "FailedDocumentsOnly".asInstanceOf[AmazonOpenSearchServerlessS3BackupMode]
  val AllDocuments = "AllDocuments".asInstanceOf[AmazonOpenSearchServerlessS3BackupMode]

  @inline def values: js.Array[AmazonOpenSearchServerlessS3BackupMode] = js.Array(FailedDocumentsOnly, AllDocuments)
}

@js.native
sealed trait AmazonopensearchserviceIndexRotationPeriod extends js.Any
object AmazonopensearchserviceIndexRotationPeriod {
  val NoRotation = "NoRotation".asInstanceOf[AmazonopensearchserviceIndexRotationPeriod]
  val OneHour = "OneHour".asInstanceOf[AmazonopensearchserviceIndexRotationPeriod]
  val OneDay = "OneDay".asInstanceOf[AmazonopensearchserviceIndexRotationPeriod]
  val OneWeek = "OneWeek".asInstanceOf[AmazonopensearchserviceIndexRotationPeriod]
  val OneMonth = "OneMonth".asInstanceOf[AmazonopensearchserviceIndexRotationPeriod]

  @inline def values: js.Array[AmazonopensearchserviceIndexRotationPeriod] = js.Array(NoRotation, OneHour, OneDay, OneWeek, OneMonth)
}

@js.native
sealed trait AmazonopensearchserviceS3BackupMode extends js.Any
object AmazonopensearchserviceS3BackupMode {
  val FailedDocumentsOnly = "FailedDocumentsOnly".asInstanceOf[AmazonopensearchserviceS3BackupMode]
  val AllDocuments = "AllDocuments".asInstanceOf[AmazonopensearchserviceS3BackupMode]

  @inline def values: js.Array[AmazonopensearchserviceS3BackupMode] = js.Array(FailedDocumentsOnly, AllDocuments)
}

@js.native
sealed trait CompressionFormat extends js.Any
object CompressionFormat {
  val UNCOMPRESSED = "UNCOMPRESSED".asInstanceOf[CompressionFormat]
  val GZIP = "GZIP".asInstanceOf[CompressionFormat]
  val ZIP = "ZIP".asInstanceOf[CompressionFormat]
  val Snappy = "Snappy".asInstanceOf[CompressionFormat]
  val HADOOP_SNAPPY = "HADOOP_SNAPPY".asInstanceOf[CompressionFormat]

  @inline def values: js.Array[CompressionFormat] = js.Array(UNCOMPRESSED, GZIP, ZIP, Snappy, HADOOP_SNAPPY)
}

@js.native
sealed trait ContentEncoding extends js.Any
object ContentEncoding {
  val NONE = "NONE".asInstanceOf[ContentEncoding]
  val GZIP = "GZIP".asInstanceOf[ContentEncoding]

  @inline def values: js.Array[ContentEncoding] = js.Array(NONE, GZIP)
}

@js.native
sealed trait DeliveryStreamEncryptionStatus extends js.Any
object DeliveryStreamEncryptionStatus {
  val ENABLED = "ENABLED".asInstanceOf[DeliveryStreamEncryptionStatus]
  val ENABLING = "ENABLING".asInstanceOf[DeliveryStreamEncryptionStatus]
  val ENABLING_FAILED = "ENABLING_FAILED".asInstanceOf[DeliveryStreamEncryptionStatus]
  val DISABLED = "DISABLED".asInstanceOf[DeliveryStreamEncryptionStatus]
  val DISABLING = "DISABLING".asInstanceOf[DeliveryStreamEncryptionStatus]
  val DISABLING_FAILED = "DISABLING_FAILED".asInstanceOf[DeliveryStreamEncryptionStatus]

  @inline def values: js.Array[DeliveryStreamEncryptionStatus] = js.Array(ENABLED, ENABLING, ENABLING_FAILED, DISABLED, DISABLING, DISABLING_FAILED)
}

@js.native
sealed trait DeliveryStreamFailureType extends js.Any
object DeliveryStreamFailureType {
  val RETIRE_KMS_GRANT_FAILED = "RETIRE_KMS_GRANT_FAILED".asInstanceOf[DeliveryStreamFailureType]
  val CREATE_KMS_GRANT_FAILED = "CREATE_KMS_GRANT_FAILED".asInstanceOf[DeliveryStreamFailureType]
  val KMS_ACCESS_DENIED = "KMS_ACCESS_DENIED".asInstanceOf[DeliveryStreamFailureType]
  val DISABLED_KMS_KEY = "DISABLED_KMS_KEY".asInstanceOf[DeliveryStreamFailureType]
  val INVALID_KMS_KEY = "INVALID_KMS_KEY".asInstanceOf[DeliveryStreamFailureType]
  val KMS_KEY_NOT_FOUND = "KMS_KEY_NOT_FOUND".asInstanceOf[DeliveryStreamFailureType]
  val KMS_OPT_IN_REQUIRED = "KMS_OPT_IN_REQUIRED".asInstanceOf[DeliveryStreamFailureType]
  val CREATE_ENI_FAILED = "CREATE_ENI_FAILED".asInstanceOf[DeliveryStreamFailureType]
  val DELETE_ENI_FAILED = "DELETE_ENI_FAILED".asInstanceOf[DeliveryStreamFailureType]
  val SUBNET_NOT_FOUND = "SUBNET_NOT_FOUND".asInstanceOf[DeliveryStreamFailureType]
  val SECURITY_GROUP_NOT_FOUND = "SECURITY_GROUP_NOT_FOUND".asInstanceOf[DeliveryStreamFailureType]
  val ENI_ACCESS_DENIED = "ENI_ACCESS_DENIED".asInstanceOf[DeliveryStreamFailureType]
  val SUBNET_ACCESS_DENIED = "SUBNET_ACCESS_DENIED".asInstanceOf[DeliveryStreamFailureType]
  val SECURITY_GROUP_ACCESS_DENIED = "SECURITY_GROUP_ACCESS_DENIED".asInstanceOf[DeliveryStreamFailureType]
  val UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[DeliveryStreamFailureType]

  @inline def values: js.Array[DeliveryStreamFailureType] = js.Array(
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

@js.native
sealed trait DeliveryStreamStatus extends js.Any
object DeliveryStreamStatus {
  val CREATING = "CREATING".asInstanceOf[DeliveryStreamStatus]
  val CREATING_FAILED = "CREATING_FAILED".asInstanceOf[DeliveryStreamStatus]
  val DELETING = "DELETING".asInstanceOf[DeliveryStreamStatus]
  val DELETING_FAILED = "DELETING_FAILED".asInstanceOf[DeliveryStreamStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DeliveryStreamStatus]

  @inline def values: js.Array[DeliveryStreamStatus] = js.Array(CREATING, CREATING_FAILED, DELETING, DELETING_FAILED, ACTIVE)
}

@js.native
sealed trait DeliveryStreamType extends js.Any
object DeliveryStreamType {
  val DirectPut = "DirectPut".asInstanceOf[DeliveryStreamType]
  val KinesisStreamAsSource = "KinesisStreamAsSource".asInstanceOf[DeliveryStreamType]

  @inline def values: js.Array[DeliveryStreamType] = js.Array(DirectPut, KinesisStreamAsSource)
}

@js.native
sealed trait ElasticsearchIndexRotationPeriod extends js.Any
object ElasticsearchIndexRotationPeriod {
  val NoRotation = "NoRotation".asInstanceOf[ElasticsearchIndexRotationPeriod]
  val OneHour = "OneHour".asInstanceOf[ElasticsearchIndexRotationPeriod]
  val OneDay = "OneDay".asInstanceOf[ElasticsearchIndexRotationPeriod]
  val OneWeek = "OneWeek".asInstanceOf[ElasticsearchIndexRotationPeriod]
  val OneMonth = "OneMonth".asInstanceOf[ElasticsearchIndexRotationPeriod]

  @inline def values: js.Array[ElasticsearchIndexRotationPeriod] = js.Array(NoRotation, OneHour, OneDay, OneWeek, OneMonth)
}

@js.native
sealed trait ElasticsearchS3BackupMode extends js.Any
object ElasticsearchS3BackupMode {
  val FailedDocumentsOnly = "FailedDocumentsOnly".asInstanceOf[ElasticsearchS3BackupMode]
  val AllDocuments = "AllDocuments".asInstanceOf[ElasticsearchS3BackupMode]

  @inline def values: js.Array[ElasticsearchS3BackupMode] = js.Array(FailedDocumentsOnly, AllDocuments)
}

@js.native
sealed trait HECEndpointType extends js.Any
object HECEndpointType {
  val Raw = "Raw".asInstanceOf[HECEndpointType]
  val Event = "Event".asInstanceOf[HECEndpointType]

  @inline def values: js.Array[HECEndpointType] = js.Array(Raw, Event)
}

@js.native
sealed trait HttpEndpointS3BackupMode extends js.Any
object HttpEndpointS3BackupMode {
  val FailedDataOnly = "FailedDataOnly".asInstanceOf[HttpEndpointS3BackupMode]
  val AllData = "AllData".asInstanceOf[HttpEndpointS3BackupMode]

  @inline def values: js.Array[HttpEndpointS3BackupMode] = js.Array(FailedDataOnly, AllData)
}

@js.native
sealed trait KeyType extends js.Any
object KeyType {
  val AWS_OWNED_CMK = "AWS_OWNED_CMK".asInstanceOf[KeyType]
  val CUSTOMER_MANAGED_CMK = "CUSTOMER_MANAGED_CMK".asInstanceOf[KeyType]

  @inline def values: js.Array[KeyType] = js.Array(AWS_OWNED_CMK, CUSTOMER_MANAGED_CMK)
}

@js.native
sealed trait NoEncryptionConfig extends js.Any
object NoEncryptionConfig {
  val NoEncryption = "NoEncryption".asInstanceOf[NoEncryptionConfig]

  @inline def values: js.Array[NoEncryptionConfig] = js.Array(NoEncryption)
}

@js.native
sealed trait OrcCompression extends js.Any
object OrcCompression {
  val NONE = "NONE".asInstanceOf[OrcCompression]
  val ZLIB = "ZLIB".asInstanceOf[OrcCompression]
  val SNAPPY = "SNAPPY".asInstanceOf[OrcCompression]

  @inline def values: js.Array[OrcCompression] = js.Array(NONE, ZLIB, SNAPPY)
}

@js.native
sealed trait OrcFormatVersion extends js.Any
object OrcFormatVersion {
  val V0_11 = "V0_11".asInstanceOf[OrcFormatVersion]
  val V0_12 = "V0_12".asInstanceOf[OrcFormatVersion]

  @inline def values: js.Array[OrcFormatVersion] = js.Array(V0_11, V0_12)
}

@js.native
sealed trait ParquetCompression extends js.Any
object ParquetCompression {
  val UNCOMPRESSED = "UNCOMPRESSED".asInstanceOf[ParquetCompression]
  val GZIP = "GZIP".asInstanceOf[ParquetCompression]
  val SNAPPY = "SNAPPY".asInstanceOf[ParquetCompression]

  @inline def values: js.Array[ParquetCompression] = js.Array(UNCOMPRESSED, GZIP, SNAPPY)
}

@js.native
sealed trait ParquetWriterVersion extends js.Any
object ParquetWriterVersion {
  val V1 = "V1".asInstanceOf[ParquetWriterVersion]
  val V2 = "V2".asInstanceOf[ParquetWriterVersion]

  @inline def values: js.Array[ParquetWriterVersion] = js.Array(V1, V2)
}

@js.native
sealed trait ProcessorParameterName extends js.Any
object ProcessorParameterName {
  val LambdaArn = "LambdaArn".asInstanceOf[ProcessorParameterName]
  val NumberOfRetries = "NumberOfRetries".asInstanceOf[ProcessorParameterName]
  val MetadataExtractionQuery = "MetadataExtractionQuery".asInstanceOf[ProcessorParameterName]
  val JsonParsingEngine = "JsonParsingEngine".asInstanceOf[ProcessorParameterName]
  val RoleArn = "RoleArn".asInstanceOf[ProcessorParameterName]
  val BufferSizeInMBs = "BufferSizeInMBs".asInstanceOf[ProcessorParameterName]
  val BufferIntervalInSeconds = "BufferIntervalInSeconds".asInstanceOf[ProcessorParameterName]
  val SubRecordType = "SubRecordType".asInstanceOf[ProcessorParameterName]
  val Delimiter = "Delimiter".asInstanceOf[ProcessorParameterName]

  @inline def values: js.Array[ProcessorParameterName] = js.Array(LambdaArn, NumberOfRetries, MetadataExtractionQuery, JsonParsingEngine, RoleArn, BufferSizeInMBs, BufferIntervalInSeconds, SubRecordType, Delimiter)
}

@js.native
sealed trait ProcessorType extends js.Any
object ProcessorType {
  val RecordDeAggregation = "RecordDeAggregation".asInstanceOf[ProcessorType]
  val Lambda = "Lambda".asInstanceOf[ProcessorType]
  val MetadataExtraction = "MetadataExtraction".asInstanceOf[ProcessorType]
  val AppendDelimiterToRecord = "AppendDelimiterToRecord".asInstanceOf[ProcessorType]

  @inline def values: js.Array[ProcessorType] = js.Array(RecordDeAggregation, Lambda, MetadataExtraction, AppendDelimiterToRecord)
}

@js.native
sealed trait RedshiftS3BackupMode extends js.Any
object RedshiftS3BackupMode {
  val Disabled = "Disabled".asInstanceOf[RedshiftS3BackupMode]
  val Enabled = "Enabled".asInstanceOf[RedshiftS3BackupMode]

  @inline def values: js.Array[RedshiftS3BackupMode] = js.Array(Disabled, Enabled)
}

@js.native
sealed trait S3BackupMode extends js.Any
object S3BackupMode {
  val Disabled = "Disabled".asInstanceOf[S3BackupMode]
  val Enabled = "Enabled".asInstanceOf[S3BackupMode]

  @inline def values: js.Array[S3BackupMode] = js.Array(Disabled, Enabled)
}

@js.native
sealed trait SplunkS3BackupMode extends js.Any
object SplunkS3BackupMode {
  val FailedEventsOnly = "FailedEventsOnly".asInstanceOf[SplunkS3BackupMode]
  val AllEvents = "AllEvents".asInstanceOf[SplunkS3BackupMode]

  @inline def values: js.Array[SplunkS3BackupMode] = js.Array(FailedEventsOnly, AllEvents)
}
