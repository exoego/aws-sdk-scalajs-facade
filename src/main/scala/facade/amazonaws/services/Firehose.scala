package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object firehose {
  type AWSKMSKeyARN = String
  type BlockSizeBytes = Int
  type BooleanObject = Boolean
  type BucketARN = String
  type ClusterJDBCURL = String
  type ColumnToJsonKeyMappings = js.Dictionary[NonEmptyString]
  type CompressionFormat = String
  type CopyOptions = String
  type Data = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DataTableColumns = String
  type DataTableName = String
  type DeliveryStartTimestamp = js.Date
  type DeliveryStreamARN = String
  type DeliveryStreamEncryptionStatus = String
  type DeliveryStreamName = String
  type DeliveryStreamNameList = js.Array[DeliveryStreamName]
  type DeliveryStreamStatus = String
  type DeliveryStreamType = String
  type DeliveryStreamVersionId = String
  type DescribeDeliveryStreamInputLimit = Int
  type DestinationDescriptionList = js.Array[DestinationDescription]
  type DestinationId = String
  type ElasticsearchBufferingIntervalInSeconds = Int
  type ElasticsearchBufferingSizeInMBs = Int
  type ElasticsearchDomainARN = String
  type ElasticsearchIndexName = String
  type ElasticsearchIndexRotationPeriod = String
  type ElasticsearchRetryDurationInSeconds = Int
  type ElasticsearchS3BackupMode = String
  type ElasticsearchTypeName = String
  type ErrorCode = String
  type ErrorMessage = String
  type ErrorOutputPrefix = String
  type HECAcknowledgmentTimeoutInSeconds = Int
  type HECEndpoint = String
  type HECEndpointType = String
  type HECToken = String
  type IntervalInSeconds = Int
  type KinesisStreamARN = String
  type ListDeliveryStreamsInputLimit = Int
  type ListOfNonEmptyStrings = js.Array[NonEmptyString]
  type ListOfNonEmptyStringsWithoutWhitespace = js.Array[NonEmptyStringWithoutWhitespace]
  type ListTagsForDeliveryStreamInputLimit = Int
  type ListTagsForDeliveryStreamOutputTagList = js.Array[Tag]
  type LogGroupName = String
  type LogStreamName = String
  type NoEncryptionConfig = String
  type NonEmptyString = String
  type NonEmptyStringWithoutWhitespace = String
  type NonNegativeIntegerObject = Int
  type OrcCompression = String
  type OrcFormatVersion = String
  type OrcRowIndexStride = Int
  type OrcStripeSizeBytes = Int
  type ParquetCompression = String
  type ParquetPageSizeBytes = Int
  type ParquetWriterVersion = String
  type Password = String
  type Prefix = String
  type ProcessorList = js.Array[Processor]
  type ProcessorParameterList = js.Array[ProcessorParameter]
  type ProcessorParameterName = String
  type ProcessorParameterValue = String
  type ProcessorType = String
  type Proportion = Double
  type PutRecordBatchRequestEntryList = js.Array[Record]
  type PutRecordBatchResponseEntryList = js.Array[PutRecordBatchResponseEntry]
  type PutResponseRecordId = String
  type RedshiftRetryDurationInSeconds = Int
  type RedshiftS3BackupMode = String
  type RoleARN = String
  type S3BackupMode = String
  type SizeInMBs = Int
  type SplunkRetryDurationInSeconds = Int
  type SplunkS3BackupMode = String
  type TagDeliveryStreamInputTagList = js.Array[Tag]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Timestamp = js.Date
  type Username = String
}

package firehose {
  @js.native
  @JSImport("aws-sdk", "Firehose")
  class Firehose() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDeliveryStream(params: CreateDeliveryStreamInput): Request[CreateDeliveryStreamOutput] = js.native
    def deleteDeliveryStream(params: DeleteDeliveryStreamInput): Request[DeleteDeliveryStreamOutput] = js.native
    def describeDeliveryStream(params: DescribeDeliveryStreamInput): Request[DescribeDeliveryStreamOutput] = js.native
    def listDeliveryStreams(params: ListDeliveryStreamsInput): Request[ListDeliveryStreamsOutput] = js.native
    def listTagsForDeliveryStream(params: ListTagsForDeliveryStreamInput): Request[ListTagsForDeliveryStreamOutput] = js.native
    def putRecord(params: PutRecordInput): Request[PutRecordOutput] = js.native
    def putRecordBatch(params: PutRecordBatchInput): Request[PutRecordBatchOutput] = js.native
    def startDeliveryStreamEncryption(params: StartDeliveryStreamEncryptionInput): Request[StartDeliveryStreamEncryptionOutput] = js.native
    def stopDeliveryStreamEncryption(params: StopDeliveryStreamEncryptionInput): Request[StopDeliveryStreamEncryptionOutput] = js.native
    def tagDeliveryStream(params: TagDeliveryStreamInput): Request[TagDeliveryStreamOutput] = js.native
    def untagDeliveryStream(params: UntagDeliveryStreamInput): Request[UntagDeliveryStreamOutput] = js.native
    def updateDestination(params: UpdateDestinationInput): Request[UpdateDestinationOutput] = js.native
  }

  /**
   * Describes hints for the buffering to perform before delivering data to the destination. These options are treated as hints, and therefore Kinesis Data Firehose might choose to use different values when it is optimal.
   */
  @js.native
  trait BufferingHints extends js.Object {
    var IntervalInSeconds: js.UndefOr[IntervalInSeconds]
    var SizeInMBs: js.UndefOr[SizeInMBs]
  }

  object BufferingHints {
    def apply(
      IntervalInSeconds: js.UndefOr[IntervalInSeconds] = js.undefined,
      SizeInMBs: js.UndefOr[SizeInMBs] = js.undefined): BufferingHints = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IntervalInSeconds" -> IntervalInSeconds.map { x => x.asInstanceOf[js.Any] },
        "SizeInMBs" -> SizeInMBs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BufferingHints]
    }
  }

  /**
   * Describes the Amazon CloudWatch logging options for your delivery stream.
   */
  @js.native
  trait CloudWatchLoggingOptions extends js.Object {
    var Enabled: js.UndefOr[BooleanObject]
    var LogGroupName: js.UndefOr[LogGroupName]
    var LogStreamName: js.UndefOr[LogStreamName]
  }

  object CloudWatchLoggingOptions {
    def apply(
      Enabled: js.UndefOr[BooleanObject] = js.undefined,
      LogGroupName: js.UndefOr[LogGroupName] = js.undefined,
      LogStreamName: js.UndefOr[LogStreamName] = js.undefined): CloudWatchLoggingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "LogGroupName" -> LogGroupName.map { x => x.asInstanceOf[js.Any] },
        "LogStreamName" -> LogStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOptions]
    }
  }

  object CompressionFormatEnum {
    val UNCOMPRESSED = "UNCOMPRESSED"
    val GZIP = "GZIP"
    val ZIP = "ZIP"
    val Snappy = "Snappy"

    val values = IndexedSeq(UNCOMPRESSED, GZIP, ZIP, Snappy)
  }

  /**
   * Describes a <code>COPY</code> command for Amazon Redshift.
   */
  @js.native
  trait CopyCommand extends js.Object {
    var DataTableName: DataTableName
    var CopyOptions: js.UndefOr[CopyOptions]
    var DataTableColumns: js.UndefOr[DataTableColumns]
  }

  object CopyCommand {
    def apply(
      DataTableName: DataTableName,
      CopyOptions: js.UndefOr[CopyOptions] = js.undefined,
      DataTableColumns: js.UndefOr[DataTableColumns] = js.undefined): CopyCommand = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataTableName" -> DataTableName.asInstanceOf[js.Any],
        "CopyOptions" -> CopyOptions.map { x => x.asInstanceOf[js.Any] },
        "DataTableColumns" -> DataTableColumns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyCommand]
    }
  }

  @js.native
  trait CreateDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType]
    var ElasticsearchDestinationConfiguration: js.UndefOr[ElasticsearchDestinationConfiguration]
    var ExtendedS3DestinationConfiguration: js.UndefOr[ExtendedS3DestinationConfiguration]
    var KinesisStreamSourceConfiguration: js.UndefOr[KinesisStreamSourceConfiguration]
    var RedshiftDestinationConfiguration: js.UndefOr[RedshiftDestinationConfiguration]
    var S3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration]
    var SplunkDestinationConfiguration: js.UndefOr[SplunkDestinationConfiguration]
    var Tags: js.UndefOr[TagDeliveryStreamInputTagList]
  }

  object CreateDeliveryStreamInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName,
      DeliveryStreamType: js.UndefOr[DeliveryStreamType] = js.undefined,
      ElasticsearchDestinationConfiguration: js.UndefOr[ElasticsearchDestinationConfiguration] = js.undefined,
      ExtendedS3DestinationConfiguration: js.UndefOr[ExtendedS3DestinationConfiguration] = js.undefined,
      KinesisStreamSourceConfiguration: js.UndefOr[KinesisStreamSourceConfiguration] = js.undefined,
      RedshiftDestinationConfiguration: js.UndefOr[RedshiftDestinationConfiguration] = js.undefined,
      S3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined,
      SplunkDestinationConfiguration: js.UndefOr[SplunkDestinationConfiguration] = js.undefined,
      Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.undefined): CreateDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "DeliveryStreamType" -> DeliveryStreamType.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchDestinationConfiguration" -> ElasticsearchDestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ExtendedS3DestinationConfiguration" -> ExtendedS3DestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamSourceConfiguration" -> KinesisStreamSourceConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RedshiftDestinationConfiguration" -> RedshiftDestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationConfiguration" -> S3DestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "SplunkDestinationConfiguration" -> SplunkDestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeliveryStreamInput]
    }
  }

  @js.native
  trait CreateDeliveryStreamOutput extends js.Object {
    var DeliveryStreamARN: js.UndefOr[DeliveryStreamARN]
  }

  object CreateDeliveryStreamOutput {
    def apply(
      DeliveryStreamARN: js.UndefOr[DeliveryStreamARN] = js.undefined): CreateDeliveryStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamARN" -> DeliveryStreamARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeliveryStreamOutput]
    }
  }

  /**
   * Specifies that you want Kinesis Data Firehose to convert data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. Kinesis Data Firehose uses the serializer and deserializer that you specify, in addition to the column information from the AWS Glue table, to deserialize your input data from JSON and then serialize it to the Parquet or ORC format. For more information, see [[https://docs.aws.amazon.com/firehose/latest/dev/record-format-conversion.html|Kinesis Data Firehose Record Format Conversion]].
   */
  @js.native
  trait DataFormatConversionConfiguration extends js.Object {
    var Enabled: js.UndefOr[BooleanObject]
    var InputFormatConfiguration: js.UndefOr[InputFormatConfiguration]
    var OutputFormatConfiguration: js.UndefOr[OutputFormatConfiguration]
    var SchemaConfiguration: js.UndefOr[SchemaConfiguration]
  }

  object DataFormatConversionConfiguration {
    def apply(
      Enabled: js.UndefOr[BooleanObject] = js.undefined,
      InputFormatConfiguration: js.UndefOr[InputFormatConfiguration] = js.undefined,
      OutputFormatConfiguration: js.UndefOr[OutputFormatConfiguration] = js.undefined,
      SchemaConfiguration: js.UndefOr[SchemaConfiguration] = js.undefined): DataFormatConversionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "InputFormatConfiguration" -> InputFormatConfiguration.map { x => x.asInstanceOf[js.Any] },
        "OutputFormatConfiguration" -> OutputFormatConfiguration.map { x => x.asInstanceOf[js.Any] },
        "SchemaConfiguration" -> SchemaConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataFormatConversionConfiguration]
    }
  }

  @js.native
  trait DeleteDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
  }

  object DeleteDeliveryStreamInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName): DeleteDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeliveryStreamInput]
    }
  }

  @js.native
  trait DeleteDeliveryStreamOutput extends js.Object {

  }

  object DeleteDeliveryStreamOutput {
    def apply(): DeleteDeliveryStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeliveryStreamOutput]
    }
  }

  /**
   * Contains information about a delivery stream.
   */
  @js.native
  trait DeliveryStreamDescription extends js.Object {
    var DeliveryStreamARN: DeliveryStreamARN
    var DeliveryStreamName: DeliveryStreamName
    var DeliveryStreamStatus: DeliveryStreamStatus
    var DeliveryStreamType: DeliveryStreamType
    var Destinations: DestinationDescriptionList
    var HasMoreDestinations: BooleanObject
    var VersionId: DeliveryStreamVersionId
    var CreateTimestamp: js.UndefOr[Timestamp]
    var DeliveryStreamEncryptionConfiguration: js.UndefOr[DeliveryStreamEncryptionConfiguration]
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var Source: js.UndefOr[SourceDescription]
  }

  object DeliveryStreamDescription {
    def apply(
      DeliveryStreamARN: DeliveryStreamARN,
      DeliveryStreamName: DeliveryStreamName,
      DeliveryStreamStatus: DeliveryStreamStatus,
      DeliveryStreamType: DeliveryStreamType,
      Destinations: DestinationDescriptionList,
      HasMoreDestinations: BooleanObject,
      VersionId: DeliveryStreamVersionId,
      CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      DeliveryStreamEncryptionConfiguration: js.UndefOr[DeliveryStreamEncryptionConfiguration] = js.undefined,
      LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      Source: js.UndefOr[SourceDescription] = js.undefined): DeliveryStreamDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamARN" -> DeliveryStreamARN.asInstanceOf[js.Any],
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "DeliveryStreamStatus" -> DeliveryStreamStatus.asInstanceOf[js.Any],
        "DeliveryStreamType" -> DeliveryStreamType.asInstanceOf[js.Any],
        "Destinations" -> Destinations.asInstanceOf[js.Any],
        "HasMoreDestinations" -> HasMoreDestinations.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any],
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamEncryptionConfiguration" -> DeliveryStreamEncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateTimestamp" -> LastUpdateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryStreamDescription]
    }
  }

  /**
   * Indicates the server-side encryption (SSE) status for the delivery stream.
   */
  @js.native
  trait DeliveryStreamEncryptionConfiguration extends js.Object {
    var Status: js.UndefOr[DeliveryStreamEncryptionStatus]
  }

  object DeliveryStreamEncryptionConfiguration {
    def apply(
      Status: js.UndefOr[DeliveryStreamEncryptionStatus] = js.undefined): DeliveryStreamEncryptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryStreamEncryptionConfiguration]
    }
  }

  object DeliveryStreamEncryptionStatusEnum {
    val ENABLED = "ENABLED"
    val ENABLING = "ENABLING"
    val DISABLED = "DISABLED"
    val DISABLING = "DISABLING"

    val values = IndexedSeq(ENABLED, ENABLING, DISABLED, DISABLING)
  }

  object DeliveryStreamStatusEnum {
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(CREATING, DELETING, ACTIVE)
  }

  object DeliveryStreamTypeEnum {
    val DirectPut = "DirectPut"
    val KinesisStreamAsSource = "KinesisStreamAsSource"

    val values = IndexedSeq(DirectPut, KinesisStreamAsSource)
  }

  @js.native
  trait DescribeDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var ExclusiveStartDestinationId: js.UndefOr[DestinationId]
    var Limit: js.UndefOr[DescribeDeliveryStreamInputLimit]
  }

  object DescribeDeliveryStreamInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName,
      ExclusiveStartDestinationId: js.UndefOr[DestinationId] = js.undefined,
      Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.undefined): DescribeDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "ExclusiveStartDestinationId" -> ExclusiveStartDestinationId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryStreamInput]
    }
  }

  @js.native
  trait DescribeDeliveryStreamOutput extends js.Object {
    var DeliveryStreamDescription: DeliveryStreamDescription
  }

  object DescribeDeliveryStreamOutput {
    def apply(
      DeliveryStreamDescription: DeliveryStreamDescription): DescribeDeliveryStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamDescription" -> DeliveryStreamDescription.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryStreamOutput]
    }
  }

  /**
   * The deserializer you want Kinesis Data Firehose to use for converting the input data from JSON. Kinesis Data Firehose then serializes the data to its final format using the <a>Serializer</a>. Kinesis Data Firehose supports two types of deserializers: the [[https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL#LanguageManualDDL-JSON|Apache Hive JSON SerDe]] and the [[https://github.com/rcongiu/Hive-JSON-Serde|OpenX JSON SerDe]].
   */
  @js.native
  trait Deserializer extends js.Object {
    var HiveJsonSerDe: js.UndefOr[HiveJsonSerDe]
    var OpenXJsonSerDe: js.UndefOr[OpenXJsonSerDe]
  }

  object Deserializer {
    def apply(
      HiveJsonSerDe: js.UndefOr[HiveJsonSerDe] = js.undefined,
      OpenXJsonSerDe: js.UndefOr[OpenXJsonSerDe] = js.undefined): Deserializer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HiveJsonSerDe" -> HiveJsonSerDe.map { x => x.asInstanceOf[js.Any] },
        "OpenXJsonSerDe" -> OpenXJsonSerDe.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deserializer]
    }
  }

  /**
   * Describes the destination for a delivery stream.
   */
  @js.native
  trait DestinationDescription extends js.Object {
    var DestinationId: DestinationId
    var ElasticsearchDestinationDescription: js.UndefOr[ElasticsearchDestinationDescription]
    var ExtendedS3DestinationDescription: js.UndefOr[ExtendedS3DestinationDescription]
    var RedshiftDestinationDescription: js.UndefOr[RedshiftDestinationDescription]
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription]
    var SplunkDestinationDescription: js.UndefOr[SplunkDestinationDescription]
  }

  object DestinationDescription {
    def apply(
      DestinationId: DestinationId,
      ElasticsearchDestinationDescription: js.UndefOr[ElasticsearchDestinationDescription] = js.undefined,
      ExtendedS3DestinationDescription: js.UndefOr[ExtendedS3DestinationDescription] = js.undefined,
      RedshiftDestinationDescription: js.UndefOr[RedshiftDestinationDescription] = js.undefined,
      S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      SplunkDestinationDescription: js.UndefOr[SplunkDestinationDescription] = js.undefined): DestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationId" -> DestinationId.asInstanceOf[js.Any],
        "ElasticsearchDestinationDescription" -> ElasticsearchDestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "ExtendedS3DestinationDescription" -> ExtendedS3DestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "RedshiftDestinationDescription" -> RedshiftDestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationDescription" -> S3DestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "SplunkDestinationDescription" -> SplunkDestinationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DestinationDescription]
    }
  }

  /**
   * Describes the buffering to perform before delivering data to the Amazon ES destination.
   */
  @js.native
  trait ElasticsearchBufferingHints extends js.Object {
    var IntervalInSeconds: js.UndefOr[ElasticsearchBufferingIntervalInSeconds]
    var SizeInMBs: js.UndefOr[ElasticsearchBufferingSizeInMBs]
  }

  object ElasticsearchBufferingHints {
    def apply(
      IntervalInSeconds: js.UndefOr[ElasticsearchBufferingIntervalInSeconds] = js.undefined,
      SizeInMBs: js.UndefOr[ElasticsearchBufferingSizeInMBs] = js.undefined): ElasticsearchBufferingHints = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IntervalInSeconds" -> IntervalInSeconds.map { x => x.asInstanceOf[js.Any] },
        "SizeInMBs" -> SizeInMBs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchBufferingHints]
    }
  }

  /**
   * Describes the configuration of a destination in Amazon ES.
   */
  @js.native
  trait ElasticsearchDestinationConfiguration extends js.Object {
    var DomainARN: ElasticsearchDomainARN
    var IndexName: ElasticsearchIndexName
    var RoleARN: RoleARN
    var S3Configuration: S3DestinationConfiguration
    var TypeName: ElasticsearchTypeName
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions]
    var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode]
  }

  object ElasticsearchDestinationConfiguration {
    def apply(
      DomainARN: ElasticsearchDomainARN,
      IndexName: ElasticsearchIndexName,
      RoleARN: RoleARN,
      S3Configuration: S3DestinationConfiguration,
      TypeName: ElasticsearchTypeName,
      BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined,
      S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.undefined): ElasticsearchDestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainARN" -> DomainARN.asInstanceOf[js.Any],
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "S3Configuration" -> S3Configuration.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any],
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "IndexRotationPeriod" -> IndexRotationPeriod.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchDestinationConfiguration]
    }
  }

  /**
   * The destination description in Amazon ES.
   */
  @js.native
  trait ElasticsearchDestinationDescription extends js.Object {
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var DomainARN: js.UndefOr[ElasticsearchDomainARN]
    var IndexName: js.UndefOr[ElasticsearchIndexName]
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode]
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription]
    var TypeName: js.UndefOr[ElasticsearchTypeName]
  }

  object ElasticsearchDestinationDescription {
    def apply(
      BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined,
      IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined,
      IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.undefined,
      S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined): ElasticsearchDestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "DomainARN" -> DomainARN.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "IndexRotationPeriod" -> IndexRotationPeriod.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationDescription" -> S3DestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchDestinationDescription]
    }
  }

  /**
   * Describes an update for a destination in Amazon ES.
   */
  @js.native
  trait ElasticsearchDestinationUpdate extends js.Object {
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var DomainARN: js.UndefOr[ElasticsearchDomainARN]
    var IndexName: js.UndefOr[ElasticsearchIndexName]
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3Update: js.UndefOr[S3DestinationUpdate]
    var TypeName: js.UndefOr[ElasticsearchTypeName]
  }

  object ElasticsearchDestinationUpdate {
    def apply(
      BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined,
      IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined,
      IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined,
      TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined): ElasticsearchDestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "DomainARN" -> DomainARN.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "IndexRotationPeriod" -> IndexRotationPeriod.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3Update" -> S3Update.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchDestinationUpdate]
    }
  }

  object ElasticsearchIndexRotationPeriodEnum {
    val NoRotation = "NoRotation"
    val OneHour = "OneHour"
    val OneDay = "OneDay"
    val OneWeek = "OneWeek"
    val OneMonth = "OneMonth"

    val values = IndexedSeq(NoRotation, OneHour, OneDay, OneWeek, OneMonth)
  }

  /**
   * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES.
   */
  @js.native
  trait ElasticsearchRetryOptions extends js.Object {
    var DurationInSeconds: js.UndefOr[ElasticsearchRetryDurationInSeconds]
  }

  object ElasticsearchRetryOptions {
    def apply(
      DurationInSeconds: js.UndefOr[ElasticsearchRetryDurationInSeconds] = js.undefined): ElasticsearchRetryOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DurationInSeconds" -> DurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchRetryOptions]
    }
  }

  object ElasticsearchS3BackupModeEnum {
    val FailedDocumentsOnly = "FailedDocumentsOnly"
    val AllDocuments = "AllDocuments"

    val values = IndexedSeq(FailedDocumentsOnly, AllDocuments)
  }

  /**
   * Describes the encryption for a destination in Amazon S3.
   */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var KMSEncryptionConfig: js.UndefOr[KMSEncryptionConfig]
    var NoEncryptionConfig: js.UndefOr[NoEncryptionConfig]
  }

  object EncryptionConfiguration {
    def apply(
      KMSEncryptionConfig: js.UndefOr[KMSEncryptionConfig] = js.undefined,
      NoEncryptionConfig: js.UndefOr[NoEncryptionConfig] = js.undefined): EncryptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KMSEncryptionConfig" -> KMSEncryptionConfig.map { x => x.asInstanceOf[js.Any] },
        "NoEncryptionConfig" -> NoEncryptionConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionConfiguration]
    }
  }

  /**
   * Describes the configuration of a destination in Amazon S3.
   */
  @js.native
  trait ExtendedS3DestinationConfiguration extends js.Object {
    var BucketARN: BucketARN
    var RoleARN: RoleARN
    var BufferingHints: js.UndefOr[BufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix]
    var Prefix: js.UndefOr[Prefix]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration]
    var S3BackupMode: js.UndefOr[S3BackupMode]
  }

  object ExtendedS3DestinationConfiguration {
    def apply(
      BucketARN: BucketARN,
      RoleARN: RoleARN,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined,
      S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined): ExtendedS3DestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "DataFormatConversionConfiguration" -> DataFormatConversionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ErrorOutputPrefix" -> ErrorOutputPrefix.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "S3BackupConfiguration" -> S3BackupConfiguration.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtendedS3DestinationConfiguration]
    }
  }

  /**
   * Describes a destination in Amazon S3.
   */
  @js.native
  trait ExtendedS3DestinationDescription extends js.Object {
    var BucketARN: BucketARN
    var BufferingHints: BufferingHints
    var CompressionFormat: CompressionFormat
    var EncryptionConfiguration: EncryptionConfiguration
    var RoleARN: RoleARN
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration]
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix]
    var Prefix: js.UndefOr[Prefix]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var S3BackupDescription: js.UndefOr[S3DestinationDescription]
    var S3BackupMode: js.UndefOr[S3BackupMode]
  }

  object ExtendedS3DestinationDescription {
    def apply(
      BucketARN: BucketARN,
      BufferingHints: BufferingHints,
      CompressionFormat: CompressionFormat,
      EncryptionConfiguration: EncryptionConfiguration,
      RoleARN: RoleARN,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined,
      ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined): ExtendedS3DestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "BufferingHints" -> BufferingHints.asInstanceOf[js.Any],
        "CompressionFormat" -> CompressionFormat.asInstanceOf[js.Any],
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "DataFormatConversionConfiguration" -> DataFormatConversionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ErrorOutputPrefix" -> ErrorOutputPrefix.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "S3BackupDescription" -> S3BackupDescription.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtendedS3DestinationDescription]
    }
  }

  /**
   * Describes an update for a destination in Amazon S3.
   */
  @js.native
  trait ExtendedS3DestinationUpdate extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var BufferingHints: js.UndefOr[BufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix]
    var Prefix: js.UndefOr[Prefix]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RoleARN: js.UndefOr[RoleARN]
    var S3BackupMode: js.UndefOr[S3BackupMode]
    var S3BackupUpdate: js.UndefOr[S3DestinationUpdate]
  }

  object ExtendedS3DestinationUpdate {
    def apply(
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined,
      S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined): ExtendedS3DestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "DataFormatConversionConfiguration" -> DataFormatConversionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ErrorOutputPrefix" -> ErrorOutputPrefix.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "S3BackupUpdate" -> S3BackupUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtendedS3DestinationUpdate]
    }
  }

  object HECEndpointTypeEnum {
    val Raw = "Raw"
    val Event = "Event"

    val values = IndexedSeq(Raw, Event)
  }

  /**
   * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.
   */
  @js.native
  trait HiveJsonSerDe extends js.Object {
    var TimestampFormats: js.UndefOr[ListOfNonEmptyStrings]
  }

  object HiveJsonSerDe {
    def apply(
      TimestampFormats: js.UndefOr[ListOfNonEmptyStrings] = js.undefined): HiveJsonSerDe = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimestampFormats" -> TimestampFormats.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HiveJsonSerDe]
    }
  }

  /**
   * Specifies the deserializer you want to use to convert the format of the input data.
   */
  @js.native
  trait InputFormatConfiguration extends js.Object {
    var Deserializer: js.UndefOr[Deserializer]
  }

  object InputFormatConfiguration {
    def apply(
      Deserializer: js.UndefOr[Deserializer] = js.undefined): InputFormatConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Deserializer" -> Deserializer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputFormatConfiguration]
    }
  }

  /**
   * Describes an encryption key for a destination in Amazon S3.
   */
  @js.native
  trait KMSEncryptionConfig extends js.Object {
    var AWSKMSKeyARN: AWSKMSKeyARN
  }

  object KMSEncryptionConfig {
    def apply(
      AWSKMSKeyARN: AWSKMSKeyARN): KMSEncryptionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AWSKMSKeyARN" -> AWSKMSKeyARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KMSEncryptionConfig]
    }
  }

  /**
   * The stream and role Amazon Resource Names (ARNs) for a Kinesis data stream used as the source for a delivery stream.
   */
  @js.native
  trait KinesisStreamSourceConfiguration extends js.Object {
    var KinesisStreamARN: KinesisStreamARN
    var RoleARN: RoleARN
  }

  object KinesisStreamSourceConfiguration {
    def apply(
      KinesisStreamARN: KinesisStreamARN,
      RoleARN: RoleARN): KinesisStreamSourceConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KinesisStreamARN" -> KinesisStreamARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamSourceConfiguration]
    }
  }

  /**
   * Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.
   */
  @js.native
  trait KinesisStreamSourceDescription extends js.Object {
    var DeliveryStartTimestamp: js.UndefOr[DeliveryStartTimestamp]
    var KinesisStreamARN: js.UndefOr[KinesisStreamARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamSourceDescription {
    def apply(
      DeliveryStartTimestamp: js.UndefOr[DeliveryStartTimestamp] = js.undefined,
      KinesisStreamARN: js.UndefOr[KinesisStreamARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisStreamSourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStartTimestamp" -> DeliveryStartTimestamp.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamARN" -> KinesisStreamARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamSourceDescription]
    }
  }

  @js.native
  trait ListDeliveryStreamsInput extends js.Object {
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType]
    var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName]
    var Limit: js.UndefOr[ListDeliveryStreamsInputLimit]
  }

  object ListDeliveryStreamsInput {
    def apply(
      DeliveryStreamType: js.UndefOr[DeliveryStreamType] = js.undefined,
      ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined,
      Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.undefined): ListDeliveryStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamType" -> DeliveryStreamType.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartDeliveryStreamName" -> ExclusiveStartDeliveryStreamName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeliveryStreamsInput]
    }
  }

  @js.native
  trait ListDeliveryStreamsOutput extends js.Object {
    var DeliveryStreamNames: DeliveryStreamNameList
    var HasMoreDeliveryStreams: BooleanObject
  }

  object ListDeliveryStreamsOutput {
    def apply(
      DeliveryStreamNames: DeliveryStreamNameList,
      HasMoreDeliveryStreams: BooleanObject): ListDeliveryStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamNames" -> DeliveryStreamNames.asInstanceOf[js.Any],
        "HasMoreDeliveryStreams" -> HasMoreDeliveryStreams.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeliveryStreamsOutput]
    }
  }

  @js.native
  trait ListTagsForDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var ExclusiveStartTagKey: js.UndefOr[TagKey]
    var Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit]
  }

  object ListTagsForDeliveryStreamInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName,
      ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined,
      Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit] = js.undefined): ListTagsForDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "ExclusiveStartTagKey" -> ExclusiveStartTagKey.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForDeliveryStreamInput]
    }
  }

  @js.native
  trait ListTagsForDeliveryStreamOutput extends js.Object {
    var HasMoreTags: BooleanObject
    var Tags: ListTagsForDeliveryStreamOutputTagList
  }

  object ListTagsForDeliveryStreamOutput {
    def apply(
      HasMoreTags: BooleanObject,
      Tags: ListTagsForDeliveryStreamOutputTagList): ListTagsForDeliveryStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HasMoreTags" -> HasMoreTags.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForDeliveryStreamOutput]
    }
  }

  object NoEncryptionConfigEnum {
    val NoEncryption = "NoEncryption"

    val values = IndexedSeq(NoEncryption)
  }

  /**
   * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.
   */
  @js.native
  trait OpenXJsonSerDe extends js.Object {
    var CaseInsensitive: js.UndefOr[BooleanObject]
    var ColumnToJsonKeyMappings: js.UndefOr[ColumnToJsonKeyMappings]
    var ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject]
  }

  object OpenXJsonSerDe {
    def apply(
      CaseInsensitive: js.UndefOr[BooleanObject] = js.undefined,
      ColumnToJsonKeyMappings: js.UndefOr[ColumnToJsonKeyMappings] = js.undefined,
      ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject] = js.undefined): OpenXJsonSerDe = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaseInsensitive" -> CaseInsensitive.map { x => x.asInstanceOf[js.Any] },
        "ColumnToJsonKeyMappings" -> ColumnToJsonKeyMappings.map { x => x.asInstanceOf[js.Any] },
        "ConvertDotsInJsonKeysToUnderscores" -> ConvertDotsInJsonKeysToUnderscores.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OpenXJsonSerDe]
    }
  }

  object OrcCompressionEnum {
    val NONE = "NONE"
    val ZLIB = "ZLIB"
    val SNAPPY = "SNAPPY"

    val values = IndexedSeq(NONE, ZLIB, SNAPPY)
  }

  object OrcFormatVersionEnum {
    val V0_11 = "V0_11"
    val V0_12 = "V0_12"

    val values = IndexedSeq(V0_11, V0_12)
  }

  /**
   * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see [[https://orc.apache.org/docs/|Apache ORC]].
   */
  @js.native
  trait OrcSerDe extends js.Object {
    var BlockSizeBytes: js.UndefOr[BlockSizeBytes]
    var BloomFilterColumns: js.UndefOr[ListOfNonEmptyStringsWithoutWhitespace]
    var BloomFilterFalsePositiveProbability: js.UndefOr[Proportion]
    var Compression: js.UndefOr[OrcCompression]
    var DictionaryKeyThreshold: js.UndefOr[Proportion]
    var EnablePadding: js.UndefOr[BooleanObject]
    var FormatVersion: js.UndefOr[OrcFormatVersion]
    var PaddingTolerance: js.UndefOr[Proportion]
    var RowIndexStride: js.UndefOr[OrcRowIndexStride]
    var StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes]
  }

  object OrcSerDe {
    def apply(
      BlockSizeBytes: js.UndefOr[BlockSizeBytes] = js.undefined,
      BloomFilterColumns: js.UndefOr[ListOfNonEmptyStringsWithoutWhitespace] = js.undefined,
      BloomFilterFalsePositiveProbability: js.UndefOr[Proportion] = js.undefined,
      Compression: js.UndefOr[OrcCompression] = js.undefined,
      DictionaryKeyThreshold: js.UndefOr[Proportion] = js.undefined,
      EnablePadding: js.UndefOr[BooleanObject] = js.undefined,
      FormatVersion: js.UndefOr[OrcFormatVersion] = js.undefined,
      PaddingTolerance: js.UndefOr[Proportion] = js.undefined,
      RowIndexStride: js.UndefOr[OrcRowIndexStride] = js.undefined,
      StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes] = js.undefined): OrcSerDe = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlockSizeBytes" -> BlockSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "BloomFilterColumns" -> BloomFilterColumns.map { x => x.asInstanceOf[js.Any] },
        "BloomFilterFalsePositiveProbability" -> BloomFilterFalsePositiveProbability.map { x => x.asInstanceOf[js.Any] },
        "Compression" -> Compression.map { x => x.asInstanceOf[js.Any] },
        "DictionaryKeyThreshold" -> DictionaryKeyThreshold.map { x => x.asInstanceOf[js.Any] },
        "EnablePadding" -> EnablePadding.map { x => x.asInstanceOf[js.Any] },
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "PaddingTolerance" -> PaddingTolerance.map { x => x.asInstanceOf[js.Any] },
        "RowIndexStride" -> RowIndexStride.map { x => x.asInstanceOf[js.Any] },
        "StripeSizeBytes" -> StripeSizeBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrcSerDe]
    }
  }

  /**
   * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data before it writes it to Amazon S3.
   */
  @js.native
  trait OutputFormatConfiguration extends js.Object {
    var Serializer: js.UndefOr[Serializer]
  }

  object OutputFormatConfiguration {
    def apply(
      Serializer: js.UndefOr[Serializer] = js.undefined): OutputFormatConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Serializer" -> Serializer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputFormatConfiguration]
    }
  }

  object ParquetCompressionEnum {
    val UNCOMPRESSED = "UNCOMPRESSED"
    val GZIP = "GZIP"
    val SNAPPY = "SNAPPY"

    val values = IndexedSeq(UNCOMPRESSED, GZIP, SNAPPY)
  }

  /**
   * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see [[https://parquet.apache.org/documentation/latest/|Apache Parquet]].
   */
  @js.native
  trait ParquetSerDe extends js.Object {
    var BlockSizeBytes: js.UndefOr[BlockSizeBytes]
    var Compression: js.UndefOr[ParquetCompression]
    var EnableDictionaryCompression: js.UndefOr[BooleanObject]
    var MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject]
    var PageSizeBytes: js.UndefOr[ParquetPageSizeBytes]
    var WriterVersion: js.UndefOr[ParquetWriterVersion]
  }

  object ParquetSerDe {
    def apply(
      BlockSizeBytes: js.UndefOr[BlockSizeBytes] = js.undefined,
      Compression: js.UndefOr[ParquetCompression] = js.undefined,
      EnableDictionaryCompression: js.UndefOr[BooleanObject] = js.undefined,
      MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject] = js.undefined,
      PageSizeBytes: js.UndefOr[ParquetPageSizeBytes] = js.undefined,
      WriterVersion: js.UndefOr[ParquetWriterVersion] = js.undefined): ParquetSerDe = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlockSizeBytes" -> BlockSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "Compression" -> Compression.map { x => x.asInstanceOf[js.Any] },
        "EnableDictionaryCompression" -> EnableDictionaryCompression.map { x => x.asInstanceOf[js.Any] },
        "MaxPaddingBytes" -> MaxPaddingBytes.map { x => x.asInstanceOf[js.Any] },
        "PageSizeBytes" -> PageSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "WriterVersion" -> WriterVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParquetSerDe]
    }
  }

  object ParquetWriterVersionEnum {
    val V1 = "V1"
    val V2 = "V2"

    val values = IndexedSeq(V1, V2)
  }

  /**
   * Describes a data processing configuration.
   */
  @js.native
  trait ProcessingConfiguration extends js.Object {
    var Enabled: js.UndefOr[BooleanObject]
    var Processors: js.UndefOr[ProcessorList]
  }

  object ProcessingConfiguration {
    def apply(
      Enabled: js.UndefOr[BooleanObject] = js.undefined,
      Processors: js.UndefOr[ProcessorList] = js.undefined): ProcessingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "Processors" -> Processors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessingConfiguration]
    }
  }

  /**
   * Describes a data processor.
   */
  @js.native
  trait Processor extends js.Object {
    var Type: ProcessorType
    var Parameters: js.UndefOr[ProcessorParameterList]
  }

  object Processor {
    def apply(
      Type: ProcessorType,
      Parameters: js.UndefOr[ProcessorParameterList] = js.undefined): Processor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Processor]
    }
  }

  /**
   * Describes the processor parameter.
   */
  @js.native
  trait ProcessorParameter extends js.Object {
    var ParameterName: ProcessorParameterName
    var ParameterValue: ProcessorParameterValue
  }

  object ProcessorParameter {
    def apply(
      ParameterName: ProcessorParameterName,
      ParameterValue: ProcessorParameterValue): ProcessorParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterName" -> ParameterName.asInstanceOf[js.Any],
        "ParameterValue" -> ParameterValue.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessorParameter]
    }
  }

  object ProcessorParameterNameEnum {
    val LambdaArn = "LambdaArn"
    val NumberOfRetries = "NumberOfRetries"
    val RoleArn = "RoleArn"
    val BufferSizeInMBs = "BufferSizeInMBs"
    val BufferIntervalInSeconds = "BufferIntervalInSeconds"

    val values = IndexedSeq(LambdaArn, NumberOfRetries, RoleArn, BufferSizeInMBs, BufferIntervalInSeconds)
  }

  object ProcessorTypeEnum {
    val Lambda = "Lambda"

    val values = IndexedSeq(Lambda)
  }

  @js.native
  trait PutRecordBatchInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var Records: PutRecordBatchRequestEntryList
  }

  object PutRecordBatchInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName,
      Records: PutRecordBatchRequestEntryList): PutRecordBatchInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "Records" -> Records.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordBatchInput]
    }
  }

  @js.native
  trait PutRecordBatchOutput extends js.Object {
    var FailedPutCount: NonNegativeIntegerObject
    var RequestResponses: PutRecordBatchResponseEntryList
    var Encrypted: js.UndefOr[BooleanObject]
  }

  object PutRecordBatchOutput {
    def apply(
      FailedPutCount: NonNegativeIntegerObject,
      RequestResponses: PutRecordBatchResponseEntryList,
      Encrypted: js.UndefOr[BooleanObject] = js.undefined): PutRecordBatchOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedPutCount" -> FailedPutCount.asInstanceOf[js.Any],
        "RequestResponses" -> RequestResponses.asInstanceOf[js.Any],
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordBatchOutput]
    }
  }

  /**
   * Contains the result for an individual record from a <a>PutRecordBatch</a> request. If the record is successfully added to your delivery stream, it receives a record ID. If the record fails to be added to your delivery stream, the result includes an error code and an error message.
   */
  @js.native
  trait PutRecordBatchResponseEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var RecordId: js.UndefOr[PutResponseRecordId]
  }

  object PutRecordBatchResponseEntry {
    def apply(
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
      RecordId: js.UndefOr[PutResponseRecordId] = js.undefined): PutRecordBatchResponseEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "RecordId" -> RecordId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordBatchResponseEntry]
    }
  }

  @js.native
  trait PutRecordInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var Record: Record
  }

  object PutRecordInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName,
      Record: Record): PutRecordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "Record" -> Record.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordInput]
    }
  }

  @js.native
  trait PutRecordOutput extends js.Object {
    var RecordId: PutResponseRecordId
    var Encrypted: js.UndefOr[BooleanObject]
  }

  object PutRecordOutput {
    def apply(
      RecordId: PutResponseRecordId,
      Encrypted: js.UndefOr[BooleanObject] = js.undefined): PutRecordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordId" -> RecordId.asInstanceOf[js.Any],
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordOutput]
    }
  }

  /**
   * The unit of data in a delivery stream.
   */
  @js.native
  trait Record extends js.Object {
    var Data: Data
  }

  object Record {
    def apply(
      Data: Data): Record = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
    }
  }

  /**
   * Describes the configuration of a destination in Amazon Redshift.
   */
  @js.native
  trait RedshiftDestinationConfiguration extends js.Object {
    var ClusterJDBCURL: ClusterJDBCURL
    var CopyCommand: CopyCommand
    var Password: Password
    var RoleARN: RoleARN
    var S3Configuration: S3DestinationConfiguration
    var Username: Username
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[RedshiftRetryOptions]
    var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration]
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode]
  }

  object RedshiftDestinationConfiguration {
    def apply(
      ClusterJDBCURL: ClusterJDBCURL,
      CopyCommand: CopyCommand,
      Password: Password,
      RoleARN: RoleARN,
      S3Configuration: S3DestinationConfiguration,
      Username: Username,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined,
      S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined,
      S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined): RedshiftDestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterJDBCURL" -> ClusterJDBCURL.asInstanceOf[js.Any],
        "CopyCommand" -> CopyCommand.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "S3Configuration" -> S3Configuration.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any],
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "S3BackupConfiguration" -> S3BackupConfiguration.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDestinationConfiguration]
    }
  }

  /**
   * Describes a destination in Amazon Redshift.
   */
  @js.native
  trait RedshiftDestinationDescription extends js.Object {
    var ClusterJDBCURL: ClusterJDBCURL
    var CopyCommand: CopyCommand
    var RoleARN: RoleARN
    var S3DestinationDescription: S3DestinationDescription
    var Username: Username
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[RedshiftRetryOptions]
    var S3BackupDescription: js.UndefOr[S3DestinationDescription]
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode]
  }

  object RedshiftDestinationDescription {
    def apply(
      ClusterJDBCURL: ClusterJDBCURL,
      CopyCommand: CopyCommand,
      RoleARN: RoleARN,
      S3DestinationDescription: S3DestinationDescription,
      Username: Username,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined,
      S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined): RedshiftDestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterJDBCURL" -> ClusterJDBCURL.asInstanceOf[js.Any],
        "CopyCommand" -> CopyCommand.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "S3DestinationDescription" -> S3DestinationDescription.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any],
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "S3BackupDescription" -> S3BackupDescription.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDestinationDescription]
    }
  }

  /**
   * Describes an update for a destination in Amazon Redshift.
   */
  @js.native
  trait RedshiftDestinationUpdate extends js.Object {
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var ClusterJDBCURL: js.UndefOr[ClusterJDBCURL]
    var CopyCommand: js.UndefOr[CopyCommand]
    var Password: js.UndefOr[Password]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[RedshiftRetryOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode]
    var S3BackupUpdate: js.UndefOr[S3DestinationUpdate]
    var S3Update: js.UndefOr[S3DestinationUpdate]
    var Username: js.UndefOr[Username]
  }

  object RedshiftDestinationUpdate {
    def apply(
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      ClusterJDBCURL: js.UndefOr[ClusterJDBCURL] = js.undefined,
      CopyCommand: js.UndefOr[CopyCommand] = js.undefined,
      Password: js.UndefOr[Password] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined,
      S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined,
      S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined,
      Username: js.UndefOr[Username] = js.undefined): RedshiftDestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "ClusterJDBCURL" -> ClusterJDBCURL.map { x => x.asInstanceOf[js.Any] },
        "CopyCommand" -> CopyCommand.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "S3BackupUpdate" -> S3BackupUpdate.map { x => x.asInstanceOf[js.Any] },
        "S3Update" -> S3Update.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDestinationUpdate]
    }
  }

  /**
   * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift.
   */
  @js.native
  trait RedshiftRetryOptions extends js.Object {
    var DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds]
  }

  object RedshiftRetryOptions {
    def apply(
      DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds] = js.undefined): RedshiftRetryOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DurationInSeconds" -> DurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftRetryOptions]
    }
  }

  object RedshiftS3BackupModeEnum {
    val Disabled = "Disabled"
    val Enabled = "Enabled"

    val values = IndexedSeq(Disabled, Enabled)
  }

  object S3BackupModeEnum {
    val Disabled = "Disabled"
    val Enabled = "Enabled"

    val values = IndexedSeq(Disabled, Enabled)
  }

  /**
   * Describes the configuration of a destination in Amazon S3.
   */
  @js.native
  trait S3DestinationConfiguration extends js.Object {
    var BucketARN: BucketARN
    var RoleARN: RoleARN
    var BufferingHints: js.UndefOr[BufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix]
    var Prefix: js.UndefOr[Prefix]
  }

  object S3DestinationConfiguration {
    def apply(
      BucketARN: BucketARN,
      RoleARN: RoleARN,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined): S3DestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ErrorOutputPrefix" -> ErrorOutputPrefix.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DestinationConfiguration]
    }
  }

  /**
   * Describes a destination in Amazon S3.
   */
  @js.native
  trait S3DestinationDescription extends js.Object {
    var BucketARN: BucketARN
    var BufferingHints: BufferingHints
    var CompressionFormat: CompressionFormat
    var EncryptionConfiguration: EncryptionConfiguration
    var RoleARN: RoleARN
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix]
    var Prefix: js.UndefOr[Prefix]
  }

  object S3DestinationDescription {
    def apply(
      BucketARN: BucketARN,
      BufferingHints: BufferingHints,
      CompressionFormat: CompressionFormat,
      EncryptionConfiguration: EncryptionConfiguration,
      RoleARN: RoleARN,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined): S3DestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "BufferingHints" -> BufferingHints.asInstanceOf[js.Any],
        "CompressionFormat" -> CompressionFormat.asInstanceOf[js.Any],
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "ErrorOutputPrefix" -> ErrorOutputPrefix.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DestinationDescription]
    }
  }

  /**
   * Describes an update for a destination in Amazon S3.
   */
  @js.native
  trait S3DestinationUpdate extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var BufferingHints: js.UndefOr[BufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix]
    var Prefix: js.UndefOr[Prefix]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object S3DestinationUpdate {
    def apply(
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): S3DestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ErrorOutputPrefix" -> ErrorOutputPrefix.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DestinationUpdate]
    }
  }

  /**
   * Specifies the schema to which you want Kinesis Data Firehose to configure your data before it writes it to Amazon S3.
   */
  @js.native
  trait SchemaConfiguration extends js.Object {
    var CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var Region: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var TableName: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace]
  }

  object SchemaConfiguration {
    def apply(
      CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      Region: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      TableName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined): SchemaConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CatalogId" -> CatalogId.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SchemaConfiguration]
    }
  }

  /**
   * The serializer that you want Kinesis Data Firehose to use to convert data to the target format before writing it to Amazon S3. Kinesis Data Firehose supports two types of serializers: the [[https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/orc/OrcSerde.html|ORC SerDe]] and the [[https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/parquet/serde/ParquetHiveSerDe.html|Parquet SerDe]].
   */
  @js.native
  trait Serializer extends js.Object {
    var OrcSerDe: js.UndefOr[OrcSerDe]
    var ParquetSerDe: js.UndefOr[ParquetSerDe]
  }

  object Serializer {
    def apply(
      OrcSerDe: js.UndefOr[OrcSerDe] = js.undefined,
      ParquetSerDe: js.UndefOr[ParquetSerDe] = js.undefined): Serializer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrcSerDe" -> OrcSerDe.map { x => x.asInstanceOf[js.Any] },
        "ParquetSerDe" -> ParquetSerDe.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Serializer]
    }
  }

  /**
   * Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.
   */
  @js.native
  trait SourceDescription extends js.Object {
    var KinesisStreamSourceDescription: js.UndefOr[KinesisStreamSourceDescription]
  }

  object SourceDescription {
    def apply(
      KinesisStreamSourceDescription: js.UndefOr[KinesisStreamSourceDescription] = js.undefined): SourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KinesisStreamSourceDescription" -> KinesisStreamSourceDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceDescription]
    }
  }

  /**
   * Describes the configuration of a destination in Splunk.
   */
  @js.native
  trait SplunkDestinationConfiguration extends js.Object {
    var HECEndpoint: HECEndpoint
    var HECEndpointType: HECEndpointType
    var HECToken: HECToken
    var S3Configuration: S3DestinationConfiguration
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[SplunkRetryOptions]
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode]
  }

  object SplunkDestinationConfiguration {
    def apply(
      HECEndpoint: HECEndpoint,
      HECEndpointType: HECEndpointType,
      HECToken: HECToken,
      S3Configuration: S3DestinationConfiguration,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined,
      S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined): SplunkDestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HECEndpoint" -> HECEndpoint.asInstanceOf[js.Any],
        "HECEndpointType" -> HECEndpointType.asInstanceOf[js.Any],
        "HECToken" -> HECToken.asInstanceOf[js.Any],
        "S3Configuration" -> S3Configuration.asInstanceOf[js.Any],
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "HECAcknowledgmentTimeoutInSeconds" -> HECAcknowledgmentTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplunkDestinationConfiguration]
    }
  }

  /**
   * Describes a destination in Splunk.
   */
  @js.native
  trait SplunkDestinationDescription extends js.Object {
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds]
    var HECEndpoint: js.UndefOr[HECEndpoint]
    var HECEndpointType: js.UndefOr[HECEndpointType]
    var HECToken: js.UndefOr[HECToken]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[SplunkRetryOptions]
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode]
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription]
  }

  object SplunkDestinationDescription {
    def apply(
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined,
      HECEndpoint: js.UndefOr[HECEndpoint] = js.undefined,
      HECEndpointType: js.UndefOr[HECEndpointType] = js.undefined,
      HECToken: js.UndefOr[HECToken] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined,
      S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined,
      S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined): SplunkDestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "HECAcknowledgmentTimeoutInSeconds" -> HECAcknowledgmentTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "HECEndpoint" -> HECEndpoint.map { x => x.asInstanceOf[js.Any] },
        "HECEndpointType" -> HECEndpointType.map { x => x.asInstanceOf[js.Any] },
        "HECToken" -> HECToken.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationDescription" -> S3DestinationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplunkDestinationDescription]
    }
  }

  /**
   * Describes an update for a destination in Splunk.
   */
  @js.native
  trait SplunkDestinationUpdate extends js.Object {
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds]
    var HECEndpoint: js.UndefOr[HECEndpoint]
    var HECEndpointType: js.UndefOr[HECEndpointType]
    var HECToken: js.UndefOr[HECToken]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[SplunkRetryOptions]
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode]
    var S3Update: js.UndefOr[S3DestinationUpdate]
  }

  object SplunkDestinationUpdate {
    def apply(
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined,
      HECEndpoint: js.UndefOr[HECEndpoint] = js.undefined,
      HECEndpointType: js.UndefOr[HECEndpointType] = js.undefined,
      HECToken: js.UndefOr[HECToken] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined,
      S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined,
      S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined): SplunkDestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "HECAcknowledgmentTimeoutInSeconds" -> HECAcknowledgmentTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "HECEndpoint" -> HECEndpoint.map { x => x.asInstanceOf[js.Any] },
        "HECEndpointType" -> HECEndpointType.map { x => x.asInstanceOf[js.Any] },
        "HECToken" -> HECToken.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "S3Update" -> S3Update.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplunkDestinationUpdate]
    }
  }

  /**
   * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Splunk, or if it doesn't receive an acknowledgment from Splunk.
   */
  @js.native
  trait SplunkRetryOptions extends js.Object {
    var DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds]
  }

  object SplunkRetryOptions {
    def apply(
      DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds] = js.undefined): SplunkRetryOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DurationInSeconds" -> DurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplunkRetryOptions]
    }
  }

  object SplunkS3BackupModeEnum {
    val FailedEventsOnly = "FailedEventsOnly"
    val AllEvents = "AllEvents"

    val values = IndexedSeq(FailedEventsOnly, AllEvents)
  }

  @js.native
  trait StartDeliveryStreamEncryptionInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
  }

  object StartDeliveryStreamEncryptionInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName): StartDeliveryStreamEncryptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDeliveryStreamEncryptionInput]
    }
  }

  @js.native
  trait StartDeliveryStreamEncryptionOutput extends js.Object {

  }

  object StartDeliveryStreamEncryptionOutput {
    def apply(): StartDeliveryStreamEncryptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDeliveryStreamEncryptionOutput]
    }
  }

  @js.native
  trait StopDeliveryStreamEncryptionInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
  }

  object StopDeliveryStreamEncryptionInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName): StopDeliveryStreamEncryptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDeliveryStreamEncryptionInput]
    }
  }

  @js.native
  trait StopDeliveryStreamEncryptionOutput extends js.Object {

  }

  object StopDeliveryStreamEncryptionOutput {
    def apply(): StopDeliveryStreamEncryptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDeliveryStreamEncryptionOutput]
    }
  }

  /**
   * Metadata that you can assign to a delivery stream, consisting of a key-value pair.
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var Tags: TagDeliveryStreamInputTagList
  }

  object TagDeliveryStreamInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName,
      Tags: TagDeliveryStreamInputTagList): TagDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDeliveryStreamInput]
    }
  }

  @js.native
  trait TagDeliveryStreamOutput extends js.Object {

  }

  object TagDeliveryStreamOutput {
    def apply(): TagDeliveryStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDeliveryStreamOutput]
    }
  }

  @js.native
  trait UntagDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var TagKeys: TagKeyList
  }

  object UntagDeliveryStreamInput {
    def apply(
      DeliveryStreamName: DeliveryStreamName,
      TagKeys: TagKeyList): UntagDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagDeliveryStreamInput]
    }
  }

  @js.native
  trait UntagDeliveryStreamOutput extends js.Object {

  }

  object UntagDeliveryStreamOutput {
    def apply(): UntagDeliveryStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagDeliveryStreamOutput]
    }
  }

  @js.native
  trait UpdateDestinationInput extends js.Object {
    var CurrentDeliveryStreamVersionId: DeliveryStreamVersionId
    var DeliveryStreamName: DeliveryStreamName
    var DestinationId: DestinationId
    var ElasticsearchDestinationUpdate: js.UndefOr[ElasticsearchDestinationUpdate]
    var ExtendedS3DestinationUpdate: js.UndefOr[ExtendedS3DestinationUpdate]
    var RedshiftDestinationUpdate: js.UndefOr[RedshiftDestinationUpdate]
    var S3DestinationUpdate: js.UndefOr[S3DestinationUpdate]
    var SplunkDestinationUpdate: js.UndefOr[SplunkDestinationUpdate]
  }

  object UpdateDestinationInput {
    def apply(
      CurrentDeliveryStreamVersionId: DeliveryStreamVersionId,
      DeliveryStreamName: DeliveryStreamName,
      DestinationId: DestinationId,
      ElasticsearchDestinationUpdate: js.UndefOr[ElasticsearchDestinationUpdate] = js.undefined,
      ExtendedS3DestinationUpdate: js.UndefOr[ExtendedS3DestinationUpdate] = js.undefined,
      RedshiftDestinationUpdate: js.UndefOr[RedshiftDestinationUpdate] = js.undefined,
      S3DestinationUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined,
      SplunkDestinationUpdate: js.UndefOr[SplunkDestinationUpdate] = js.undefined): UpdateDestinationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentDeliveryStreamVersionId" -> CurrentDeliveryStreamVersionId.asInstanceOf[js.Any],
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "DestinationId" -> DestinationId.asInstanceOf[js.Any],
        "ElasticsearchDestinationUpdate" -> ElasticsearchDestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "ExtendedS3DestinationUpdate" -> ExtendedS3DestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "RedshiftDestinationUpdate" -> RedshiftDestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationUpdate" -> S3DestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "SplunkDestinationUpdate" -> SplunkDestinationUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDestinationInput]
    }
  }

  @js.native
  trait UpdateDestinationOutput extends js.Object {

  }

  object UpdateDestinationOutput {
    def apply(): UpdateDestinationOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDestinationOutput]
    }
  }
}
