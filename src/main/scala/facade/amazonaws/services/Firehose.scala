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
  class Firehose(config: AWSConfig) extends js.Object {
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
   * <p>Describes hints for the buffering to perform before delivering data to the destination. These options are treated as hints, and therefore Kinesis Data Firehose might choose to use different values when it is optimal.</p>
   */
  @js.native
  trait BufferingHints extends js.Object {
    var SizeInMBs: js.UndefOr[SizeInMBs]
    var IntervalInSeconds: js.UndefOr[IntervalInSeconds]
  }

  object BufferingHints {
    def apply(
      SizeInMBs: js.UndefOr[SizeInMBs] = js.undefined,
      IntervalInSeconds: js.UndefOr[IntervalInSeconds] = js.undefined): BufferingHints = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeInMBs" -> SizeInMBs.map { x => x.asInstanceOf[js.Any] },
        "IntervalInSeconds" -> IntervalInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BufferingHints]
    }
  }

  /**
   * <p>Describes the Amazon CloudWatch logging options for your delivery stream.</p>
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
   * <p>Describes a <code>COPY</code> command for Amazon Redshift.</p>
   */
  @js.native
  trait CopyCommand extends js.Object {
    var DataTableName: js.UndefOr[DataTableName]
    var DataTableColumns: js.UndefOr[DataTableColumns]
    var CopyOptions: js.UndefOr[CopyOptions]
  }

  object CopyCommand {
    def apply(
      DataTableName: js.UndefOr[DataTableName] = js.undefined,
      DataTableColumns: js.UndefOr[DataTableColumns] = js.undefined,
      CopyOptions: js.UndefOr[CopyOptions] = js.undefined): CopyCommand = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataTableName" -> DataTableName.map { x => x.asInstanceOf[js.Any] },
        "DataTableColumns" -> DataTableColumns.map { x => x.asInstanceOf[js.Any] },
        "CopyOptions" -> CopyOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyCommand]
    }
  }

  @js.native
  trait CreateDeliveryStreamInput extends js.Object {
    var KinesisStreamSourceConfiguration: js.UndefOr[KinesisStreamSourceConfiguration]
    var SplunkDestinationConfiguration: js.UndefOr[SplunkDestinationConfiguration]
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType]
    var S3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration]
    var ElasticsearchDestinationConfiguration: js.UndefOr[ElasticsearchDestinationConfiguration]
    var RedshiftDestinationConfiguration: js.UndefOr[RedshiftDestinationConfiguration]
    var Tags: js.UndefOr[TagDeliveryStreamInputTagList]
    var ExtendedS3DestinationConfiguration: js.UndefOr[ExtendedS3DestinationConfiguration]
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
  }

  object CreateDeliveryStreamInput {
    def apply(
      KinesisStreamSourceConfiguration: js.UndefOr[KinesisStreamSourceConfiguration] = js.undefined,
      SplunkDestinationConfiguration: js.UndefOr[SplunkDestinationConfiguration] = js.undefined,
      DeliveryStreamType: js.UndefOr[DeliveryStreamType] = js.undefined,
      S3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined,
      ElasticsearchDestinationConfiguration: js.UndefOr[ElasticsearchDestinationConfiguration] = js.undefined,
      RedshiftDestinationConfiguration: js.UndefOr[RedshiftDestinationConfiguration] = js.undefined,
      Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.undefined,
      ExtendedS3DestinationConfiguration: js.UndefOr[ExtendedS3DestinationConfiguration] = js.undefined,
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined): CreateDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KinesisStreamSourceConfiguration" -> KinesisStreamSourceConfiguration.map { x => x.asInstanceOf[js.Any] },
        "SplunkDestinationConfiguration" -> SplunkDestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamType" -> DeliveryStreamType.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationConfiguration" -> S3DestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchDestinationConfiguration" -> ElasticsearchDestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RedshiftDestinationConfiguration" -> RedshiftDestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ExtendedS3DestinationConfiguration" -> ExtendedS3DestinationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Specifies that you want Kinesis Data Firehose to convert data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. Kinesis Data Firehose uses the serializer and deserializer that you specify, in addition to the column information from the AWS Glue table, to deserialize your input data from JSON and then serialize it to the Parquet or ORC format. For more information, see <a href="https://docs.aws.amazon.com/firehose/latest/dev/record-format-conversion.html">Kinesis Data Firehose Record Format Conversion</a>.</p>
   */
  @js.native
  trait DataFormatConversionConfiguration extends js.Object {
    var SchemaConfiguration: js.UndefOr[SchemaConfiguration]
    var InputFormatConfiguration: js.UndefOr[InputFormatConfiguration]
    var OutputFormatConfiguration: js.UndefOr[OutputFormatConfiguration]
    var Enabled: js.UndefOr[BooleanObject]
  }

  object DataFormatConversionConfiguration {
    def apply(
      SchemaConfiguration: js.UndefOr[SchemaConfiguration] = js.undefined,
      InputFormatConfiguration: js.UndefOr[InputFormatConfiguration] = js.undefined,
      OutputFormatConfiguration: js.UndefOr[OutputFormatConfiguration] = js.undefined,
      Enabled: js.UndefOr[BooleanObject] = js.undefined): DataFormatConversionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaConfiguration" -> SchemaConfiguration.map { x => x.asInstanceOf[js.Any] },
        "InputFormatConfiguration" -> InputFormatConfiguration.map { x => x.asInstanceOf[js.Any] },
        "OutputFormatConfiguration" -> OutputFormatConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataFormatConversionConfiguration]
    }
  }

  @js.native
  trait DeleteDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
  }

  object DeleteDeliveryStreamInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined): DeleteDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Contains information about a delivery stream.</p>
   */
  @js.native
  trait DeliveryStreamDescription extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var HasMoreDestinations: js.UndefOr[BooleanObject]
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType]
    var Destinations: js.UndefOr[DestinationDescriptionList]
    var DeliveryStreamARN: js.UndefOr[DeliveryStreamARN]
    var DeliveryStreamStatus: js.UndefOr[DeliveryStreamStatus]
    var DeliveryStreamEncryptionConfiguration: js.UndefOr[DeliveryStreamEncryptionConfiguration]
    var Source: js.UndefOr[SourceDescription]
    var VersionId: js.UndefOr[DeliveryStreamVersionId]
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
  }

  object DeliveryStreamDescription {
    def apply(
      CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      HasMoreDestinations: js.UndefOr[BooleanObject] = js.undefined,
      DeliveryStreamType: js.UndefOr[DeliveryStreamType] = js.undefined,
      Destinations: js.UndefOr[DestinationDescriptionList] = js.undefined,
      DeliveryStreamARN: js.UndefOr[DeliveryStreamARN] = js.undefined,
      DeliveryStreamStatus: js.UndefOr[DeliveryStreamStatus] = js.undefined,
      DeliveryStreamEncryptionConfiguration: js.UndefOr[DeliveryStreamEncryptionConfiguration] = js.undefined,
      Source: js.UndefOr[SourceDescription] = js.undefined,
      VersionId: js.UndefOr[DeliveryStreamVersionId] = js.undefined,
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined): DeliveryStreamDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateTimestamp" -> LastUpdateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "HasMoreDestinations" -> HasMoreDestinations.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamType" -> DeliveryStreamType.map { x => x.asInstanceOf[js.Any] },
        "Destinations" -> Destinations.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamARN" -> DeliveryStreamARN.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamStatus" -> DeliveryStreamStatus.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamEncryptionConfiguration" -> DeliveryStreamEncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryStreamDescription]
    }
  }

  /**
   * <p>Indicates the server-side encryption (SSE) status for the delivery stream.</p>
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
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
    var Limit: js.UndefOr[DescribeDeliveryStreamInputLimit]
    var ExclusiveStartDestinationId: js.UndefOr[DestinationId]
  }

  object DescribeDeliveryStreamInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined,
      Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.undefined,
      ExclusiveStartDestinationId: js.UndefOr[DestinationId] = js.undefined): DescribeDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartDestinationId" -> ExclusiveStartDestinationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryStreamInput]
    }
  }

  @js.native
  trait DescribeDeliveryStreamOutput extends js.Object {
    var DeliveryStreamDescription: js.UndefOr[DeliveryStreamDescription]
  }

  object DescribeDeliveryStreamOutput {
    def apply(
      DeliveryStreamDescription: js.UndefOr[DeliveryStreamDescription] = js.undefined): DescribeDeliveryStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamDescription" -> DeliveryStreamDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryStreamOutput]
    }
  }

  /**
   * <p>The deserializer you want Kinesis Data Firehose to use for converting the input data from JSON. Kinesis Data Firehose then serializes the data to its final format using the <a>Serializer</a>. Kinesis Data Firehose supports two types of deserializers: the <a href="https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL#LanguageManualDDL-JSON">Apache Hive JSON SerDe</a> and the <a href="https://github.com/rcongiu/Hive-JSON-Serde">OpenX JSON SerDe</a>.</p>
   */
  @js.native
  trait Deserializer extends js.Object {
    var OpenXJsonSerDe: js.UndefOr[OpenXJsonSerDe]
    var HiveJsonSerDe: js.UndefOr[HiveJsonSerDe]
  }

  object Deserializer {
    def apply(
      OpenXJsonSerDe: js.UndefOr[OpenXJsonSerDe] = js.undefined,
      HiveJsonSerDe: js.UndefOr[HiveJsonSerDe] = js.undefined): Deserializer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenXJsonSerDe" -> OpenXJsonSerDe.map { x => x.asInstanceOf[js.Any] },
        "HiveJsonSerDe" -> HiveJsonSerDe.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deserializer]
    }
  }

  /**
   * <p>Describes the destination for a delivery stream.</p>
   */
  @js.native
  trait DestinationDescription extends js.Object {
    var SplunkDestinationDescription: js.UndefOr[SplunkDestinationDescription]
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription]
    var RedshiftDestinationDescription: js.UndefOr[RedshiftDestinationDescription]
    var ElasticsearchDestinationDescription: js.UndefOr[ElasticsearchDestinationDescription]
    var DestinationId: js.UndefOr[DestinationId]
    var ExtendedS3DestinationDescription: js.UndefOr[ExtendedS3DestinationDescription]
  }

  object DestinationDescription {
    def apply(
      SplunkDestinationDescription: js.UndefOr[SplunkDestinationDescription] = js.undefined,
      S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      RedshiftDestinationDescription: js.UndefOr[RedshiftDestinationDescription] = js.undefined,
      ElasticsearchDestinationDescription: js.UndefOr[ElasticsearchDestinationDescription] = js.undefined,
      DestinationId: js.UndefOr[DestinationId] = js.undefined,
      ExtendedS3DestinationDescription: js.UndefOr[ExtendedS3DestinationDescription] = js.undefined): DestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SplunkDestinationDescription" -> SplunkDestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationDescription" -> S3DestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "RedshiftDestinationDescription" -> RedshiftDestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchDestinationDescription" -> ElasticsearchDestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "DestinationId" -> DestinationId.map { x => x.asInstanceOf[js.Any] },
        "ExtendedS3DestinationDescription" -> ExtendedS3DestinationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DestinationDescription]
    }
  }

  /**
   * <p>Describes the buffering to perform before delivering data to the Amazon ES destination.</p>
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
   * <p>Describes the configuration of a destination in Amazon ES.</p>
   */
  @js.native
  trait ElasticsearchDestinationConfiguration extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod]
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions]
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var TypeName: js.UndefOr[ElasticsearchTypeName]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode]
    var S3Configuration: js.UndefOr[S3DestinationConfiguration]
    var DomainARN: js.UndefOr[ElasticsearchDomainARN]
    var IndexName: js.UndefOr[ElasticsearchIndexName]
  }

  object ElasticsearchDestinationConfiguration {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined,
      RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined,
      BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined,
      TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.undefined,
      S3Configuration: js.UndefOr[S3DestinationConfiguration] = js.undefined,
      DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined,
      IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined): ElasticsearchDestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "IndexRotationPeriod" -> IndexRotationPeriod.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "S3Configuration" -> S3Configuration.map { x => x.asInstanceOf[js.Any] },
        "DomainARN" -> DomainARN.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchDestinationConfiguration]
    }
  }

  /**
   * <p>The destination description in Amazon ES.</p>
   */
  @js.native
  trait ElasticsearchDestinationDescription extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod]
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions]
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var TypeName: js.UndefOr[ElasticsearchTypeName]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription]
    var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode]
    var DomainARN: js.UndefOr[ElasticsearchDomainARN]
    var IndexName: js.UndefOr[ElasticsearchIndexName]
  }

  object ElasticsearchDestinationDescription {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined,
      RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined,
      BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined,
      TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.undefined,
      DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined,
      IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined): ElasticsearchDestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "IndexRotationPeriod" -> IndexRotationPeriod.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationDescription" -> S3DestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "DomainARN" -> DomainARN.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchDestinationDescription]
    }
  }

  /**
   * <p>Describes an update for a destination in Amazon ES.</p>
   */
  @js.native
  trait ElasticsearchDestinationUpdate extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod]
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions]
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var TypeName: js.UndefOr[ElasticsearchTypeName]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3Update: js.UndefOr[S3DestinationUpdate]
    var DomainARN: js.UndefOr[ElasticsearchDomainARN]
    var IndexName: js.UndefOr[ElasticsearchIndexName]
  }

  object ElasticsearchDestinationUpdate {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined,
      RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined,
      BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined,
      TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined,
      DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined,
      IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined): ElasticsearchDestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "IndexRotationPeriod" -> IndexRotationPeriod.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "TypeName" -> TypeName.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3Update" -> S3Update.map { x => x.asInstanceOf[js.Any] },
        "DomainARN" -> DomainARN.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES.</p>
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
   * <p>Describes the encryption for a destination in Amazon S3.</p>
   */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var NoEncryptionConfig: js.UndefOr[NoEncryptionConfig]
    var KMSEncryptionConfig: js.UndefOr[KMSEncryptionConfig]
  }

  object EncryptionConfiguration {
    def apply(
      NoEncryptionConfig: js.UndefOr[NoEncryptionConfig] = js.undefined,
      KMSEncryptionConfig: js.UndefOr[KMSEncryptionConfig] = js.undefined): EncryptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NoEncryptionConfig" -> NoEncryptionConfig.map { x => x.asInstanceOf[js.Any] },
        "KMSEncryptionConfig" -> KMSEncryptionConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionConfiguration]
    }
  }

  /**
   * <p>Describes the configuration of a destination in Amazon S3.</p>
   */
  @js.native
  trait ExtendedS3DestinationConfiguration extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration]
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var BufferingHints: js.UndefOr[BufferingHints]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3BackupMode: js.UndefOr[S3BackupMode]
    var Prefix: js.UndefOr[Prefix]
    var BucketARN: js.UndefOr[BucketARN]
    var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration]
  }

  object ExtendedS3DestinationConfiguration {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined,
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined): ExtendedS3DestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "DataFormatConversionConfiguration" -> DataFormatConversionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "S3BackupConfiguration" -> S3BackupConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtendedS3DestinationConfiguration]
    }
  }

  /**
   * <p>Describes a destination in Amazon S3.</p>
   */
  @js.native
  trait ExtendedS3DestinationDescription extends js.Object {
    var S3BackupDescription: js.UndefOr[S3DestinationDescription]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration]
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var BufferingHints: js.UndefOr[BufferingHints]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3BackupMode: js.UndefOr[S3BackupMode]
    var Prefix: js.UndefOr[Prefix]
    var BucketARN: js.UndefOr[BucketARN]
  }

  object ExtendedS3DestinationDescription {
    def apply(
      S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined,
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      BucketARN: js.UndefOr[BucketARN] = js.undefined): ExtendedS3DestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3BackupDescription" -> S3BackupDescription.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "DataFormatConversionConfiguration" -> DataFormatConversionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtendedS3DestinationDescription]
    }
  }

  /**
   * <p>Describes an update for a destination in Amazon S3.</p>
   */
  @js.native
  trait ExtendedS3DestinationUpdate extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration]
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var BufferingHints: js.UndefOr[BufferingHints]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3BackupMode: js.UndefOr[S3BackupMode]
    var Prefix: js.UndefOr[Prefix]
    var BucketARN: js.UndefOr[BucketARN]
    var S3BackupUpdate: js.UndefOr[S3DestinationUpdate]
  }

  object ExtendedS3DestinationUpdate {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined,
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined): ExtendedS3DestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "DataFormatConversionConfiguration" -> DataFormatConversionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
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
   * <p>The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.</p>
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
   * <p>Specifies the deserializer you want to use to convert the format of the input data.</p>
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
   * <p>Describes an encryption key for a destination in Amazon S3.</p>
   */
  @js.native
  trait KMSEncryptionConfig extends js.Object {
    var AWSKMSKeyARN: js.UndefOr[AWSKMSKeyARN]
  }

  object KMSEncryptionConfig {
    def apply(
      AWSKMSKeyARN: js.UndefOr[AWSKMSKeyARN] = js.undefined): KMSEncryptionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AWSKMSKeyARN" -> AWSKMSKeyARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KMSEncryptionConfig]
    }
  }

  /**
   * <p>The stream and role Amazon Resource Names (ARNs) for a Kinesis data stream used as the source for a delivery stream.</p>
   */
  @js.native
  trait KinesisStreamSourceConfiguration extends js.Object {
    var KinesisStreamARN: js.UndefOr[KinesisStreamARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamSourceConfiguration {
    def apply(
      KinesisStreamARN: js.UndefOr[KinesisStreamARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisStreamSourceConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KinesisStreamARN" -> KinesisStreamARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamSourceConfiguration]
    }
  }

  /**
   * <p>Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.</p>
   */
  @js.native
  trait KinesisStreamSourceDescription extends js.Object {
    var KinesisStreamARN: js.UndefOr[KinesisStreamARN]
    var RoleARN: js.UndefOr[RoleARN]
    var DeliveryStartTimestamp: js.UndefOr[DeliveryStartTimestamp]
  }

  object KinesisStreamSourceDescription {
    def apply(
      KinesisStreamARN: js.UndefOr[KinesisStreamARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      DeliveryStartTimestamp: js.UndefOr[DeliveryStartTimestamp] = js.undefined): KinesisStreamSourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KinesisStreamARN" -> KinesisStreamARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStartTimestamp" -> DeliveryStartTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamSourceDescription]
    }
  }

  @js.native
  trait ListDeliveryStreamsInput extends js.Object {
    var Limit: js.UndefOr[ListDeliveryStreamsInputLimit]
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType]
    var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName]
  }

  object ListDeliveryStreamsInput {
    def apply(
      Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.undefined,
      DeliveryStreamType: js.UndefOr[DeliveryStreamType] = js.undefined,
      ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined): ListDeliveryStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamType" -> DeliveryStreamType.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartDeliveryStreamName" -> ExclusiveStartDeliveryStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeliveryStreamsInput]
    }
  }

  @js.native
  trait ListDeliveryStreamsOutput extends js.Object {
    var DeliveryStreamNames: js.UndefOr[DeliveryStreamNameList]
    var HasMoreDeliveryStreams: js.UndefOr[BooleanObject]
  }

  object ListDeliveryStreamsOutput {
    def apply(
      DeliveryStreamNames: js.UndefOr[DeliveryStreamNameList] = js.undefined,
      HasMoreDeliveryStreams: js.UndefOr[BooleanObject] = js.undefined): ListDeliveryStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamNames" -> DeliveryStreamNames.map { x => x.asInstanceOf[js.Any] },
        "HasMoreDeliveryStreams" -> HasMoreDeliveryStreams.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeliveryStreamsOutput]
    }
  }

  @js.native
  trait ListTagsForDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
    var ExclusiveStartTagKey: js.UndefOr[TagKey]
    var Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit]
  }

  object ListTagsForDeliveryStreamInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined,
      ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined,
      Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit] = js.undefined): ListTagsForDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartTagKey" -> ExclusiveStartTagKey.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForDeliveryStreamInput]
    }
  }

  @js.native
  trait ListTagsForDeliveryStreamOutput extends js.Object {
    var Tags: js.UndefOr[ListTagsForDeliveryStreamOutputTagList]
    var HasMoreTags: js.UndefOr[BooleanObject]
  }

  object ListTagsForDeliveryStreamOutput {
    def apply(
      Tags: js.UndefOr[ListTagsForDeliveryStreamOutputTagList] = js.undefined,
      HasMoreTags: js.UndefOr[BooleanObject] = js.undefined): ListTagsForDeliveryStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "HasMoreTags" -> HasMoreTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForDeliveryStreamOutput]
    }
  }

  object NoEncryptionConfigEnum {
    val NoEncryption = "NoEncryption"

    val values = IndexedSeq(NoEncryption)
  }

  /**
   * <p>The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.</p>
   */
  @js.native
  trait OpenXJsonSerDe extends js.Object {
    var ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject]
    var CaseInsensitive: js.UndefOr[BooleanObject]
    var ColumnToJsonKeyMappings: js.UndefOr[ColumnToJsonKeyMappings]
  }

  object OpenXJsonSerDe {
    def apply(
      ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject] = js.undefined,
      CaseInsensitive: js.UndefOr[BooleanObject] = js.undefined,
      ColumnToJsonKeyMappings: js.UndefOr[ColumnToJsonKeyMappings] = js.undefined): OpenXJsonSerDe = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConvertDotsInJsonKeysToUnderscores" -> ConvertDotsInJsonKeysToUnderscores.map { x => x.asInstanceOf[js.Any] },
        "CaseInsensitive" -> CaseInsensitive.map { x => x.asInstanceOf[js.Any] },
        "ColumnToJsonKeyMappings" -> ColumnToJsonKeyMappings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see <a href="https://orc.apache.org/docs/">Apache ORC</a>.</p>
   */
  @js.native
  trait OrcSerDe extends js.Object {
    var DictionaryKeyThreshold: js.UndefOr[Proportion]
    var RowIndexStride: js.UndefOr[OrcRowIndexStride]
    var FormatVersion: js.UndefOr[OrcFormatVersion]
    var BloomFilterFalsePositiveProbability: js.UndefOr[Proportion]
    var Compression: js.UndefOr[OrcCompression]
    var EnablePadding: js.UndefOr[BooleanObject]
    var PaddingTolerance: js.UndefOr[Proportion]
    var BlockSizeBytes: js.UndefOr[BlockSizeBytes]
    var StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes]
    var BloomFilterColumns: js.UndefOr[ListOfNonEmptyStringsWithoutWhitespace]
  }

  object OrcSerDe {
    def apply(
      DictionaryKeyThreshold: js.UndefOr[Proportion] = js.undefined,
      RowIndexStride: js.UndefOr[OrcRowIndexStride] = js.undefined,
      FormatVersion: js.UndefOr[OrcFormatVersion] = js.undefined,
      BloomFilterFalsePositiveProbability: js.UndefOr[Proportion] = js.undefined,
      Compression: js.UndefOr[OrcCompression] = js.undefined,
      EnablePadding: js.UndefOr[BooleanObject] = js.undefined,
      PaddingTolerance: js.UndefOr[Proportion] = js.undefined,
      BlockSizeBytes: js.UndefOr[BlockSizeBytes] = js.undefined,
      StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes] = js.undefined,
      BloomFilterColumns: js.UndefOr[ListOfNonEmptyStringsWithoutWhitespace] = js.undefined): OrcSerDe = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DictionaryKeyThreshold" -> DictionaryKeyThreshold.map { x => x.asInstanceOf[js.Any] },
        "RowIndexStride" -> RowIndexStride.map { x => x.asInstanceOf[js.Any] },
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "BloomFilterFalsePositiveProbability" -> BloomFilterFalsePositiveProbability.map { x => x.asInstanceOf[js.Any] },
        "Compression" -> Compression.map { x => x.asInstanceOf[js.Any] },
        "EnablePadding" -> EnablePadding.map { x => x.asInstanceOf[js.Any] },
        "PaddingTolerance" -> PaddingTolerance.map { x => x.asInstanceOf[js.Any] },
        "BlockSizeBytes" -> BlockSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "StripeSizeBytes" -> StripeSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "BloomFilterColumns" -> BloomFilterColumns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrcSerDe]
    }
  }

  /**
   * <p>Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data before it writes it to Amazon S3.</p>
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
   * <p>A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.</p>
   */
  @js.native
  trait ParquetSerDe extends js.Object {
    var WriterVersion: js.UndefOr[ParquetWriterVersion]
    var EnableDictionaryCompression: js.UndefOr[BooleanObject]
    var Compression: js.UndefOr[ParquetCompression]
    var BlockSizeBytes: js.UndefOr[BlockSizeBytes]
    var MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject]
    var PageSizeBytes: js.UndefOr[ParquetPageSizeBytes]
  }

  object ParquetSerDe {
    def apply(
      WriterVersion: js.UndefOr[ParquetWriterVersion] = js.undefined,
      EnableDictionaryCompression: js.UndefOr[BooleanObject] = js.undefined,
      Compression: js.UndefOr[ParquetCompression] = js.undefined,
      BlockSizeBytes: js.UndefOr[BlockSizeBytes] = js.undefined,
      MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject] = js.undefined,
      PageSizeBytes: js.UndefOr[ParquetPageSizeBytes] = js.undefined): ParquetSerDe = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WriterVersion" -> WriterVersion.map { x => x.asInstanceOf[js.Any] },
        "EnableDictionaryCompression" -> EnableDictionaryCompression.map { x => x.asInstanceOf[js.Any] },
        "Compression" -> Compression.map { x => x.asInstanceOf[js.Any] },
        "BlockSizeBytes" -> BlockSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "MaxPaddingBytes" -> MaxPaddingBytes.map { x => x.asInstanceOf[js.Any] },
        "PageSizeBytes" -> PageSizeBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParquetSerDe]
    }
  }

  object ParquetWriterVersionEnum {
    val V1 = "V1"
    val V2 = "V2"

    val values = IndexedSeq(V1, V2)
  }

  /**
   * <p>Describes a data processing configuration.</p>
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
   * <p>Describes a data processor.</p>
   */
  @js.native
  trait Processor extends js.Object {
    var Type: js.UndefOr[ProcessorType]
    var Parameters: js.UndefOr[ProcessorParameterList]
  }

  object Processor {
    def apply(
      Type: js.UndefOr[ProcessorType] = js.undefined,
      Parameters: js.UndefOr[ProcessorParameterList] = js.undefined): Processor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Processor]
    }
  }

  /**
   * <p>Describes the processor parameter.</p>
   */
  @js.native
  trait ProcessorParameter extends js.Object {
    var ParameterName: js.UndefOr[ProcessorParameterName]
    var ParameterValue: js.UndefOr[ProcessorParameterValue]
  }

  object ProcessorParameter {
    def apply(
      ParameterName: js.UndefOr[ProcessorParameterName] = js.undefined,
      ParameterValue: js.UndefOr[ProcessorParameterValue] = js.undefined): ProcessorParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterName" -> ParameterName.map { x => x.asInstanceOf[js.Any] },
        "ParameterValue" -> ParameterValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
    var Records: js.UndefOr[PutRecordBatchRequestEntryList]
  }

  object PutRecordBatchInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined,
      Records: js.UndefOr[PutRecordBatchRequestEntryList] = js.undefined): PutRecordBatchInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] },
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordBatchInput]
    }
  }

  @js.native
  trait PutRecordBatchOutput extends js.Object {
    var FailedPutCount: js.UndefOr[NonNegativeIntegerObject]
    var Encrypted: js.UndefOr[BooleanObject]
    var RequestResponses: js.UndefOr[PutRecordBatchResponseEntryList]
  }

  object PutRecordBatchOutput {
    def apply(
      FailedPutCount: js.UndefOr[NonNegativeIntegerObject] = js.undefined,
      Encrypted: js.UndefOr[BooleanObject] = js.undefined,
      RequestResponses: js.UndefOr[PutRecordBatchResponseEntryList] = js.undefined): PutRecordBatchOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedPutCount" -> FailedPutCount.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "RequestResponses" -> RequestResponses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordBatchOutput]
    }
  }

  /**
   * <p>Contains the result for an individual record from a <a>PutRecordBatch</a> request. If the record is successfully added to your delivery stream, it receives a record ID. If the record fails to be added to your delivery stream, the result includes an error code and an error message.</p>
   */
  @js.native
  trait PutRecordBatchResponseEntry extends js.Object {
    var RecordId: js.UndefOr[PutResponseRecordId]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object PutRecordBatchResponseEntry {
    def apply(
      RecordId: js.UndefOr[PutResponseRecordId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined): PutRecordBatchResponseEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordId" -> RecordId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordBatchResponseEntry]
    }
  }

  @js.native
  trait PutRecordInput extends js.Object {
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
    var Record: js.UndefOr[Record]
  }

  object PutRecordInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined,
      Record: js.UndefOr[Record] = js.undefined): PutRecordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] },
        "Record" -> Record.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordInput]
    }
  }

  @js.native
  trait PutRecordOutput extends js.Object {
    var RecordId: js.UndefOr[PutResponseRecordId]
    var Encrypted: js.UndefOr[BooleanObject]
  }

  object PutRecordOutput {
    def apply(
      RecordId: js.UndefOr[PutResponseRecordId] = js.undefined,
      Encrypted: js.UndefOr[BooleanObject] = js.undefined): PutRecordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordId" -> RecordId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordOutput]
    }
  }

  /**
   * <p>The unit of data in a delivery stream.</p>
   */
  @js.native
  trait Record extends js.Object {
    var Data: js.UndefOr[Data]
  }

  object Record {
    def apply(
      Data: js.UndefOr[Data] = js.undefined): Record = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
    }
  }

  /**
   * <p>Describes the configuration of a destination in Amazon Redshift.</p>
   */
  @js.native
  trait RedshiftDestinationConfiguration extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var Username: js.UndefOr[Username]
    var RetryOptions: js.UndefOr[RedshiftRetryOptions]
    var ClusterJDBCURL: js.UndefOr[ClusterJDBCURL]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var Password: js.UndefOr[Password]
    var CopyCommand: js.UndefOr[CopyCommand]
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode]
    var S3Configuration: js.UndefOr[S3DestinationConfiguration]
    var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration]
  }

  object RedshiftDestinationConfiguration {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      Username: js.UndefOr[Username] = js.undefined,
      RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined,
      ClusterJDBCURL: js.UndefOr[ClusterJDBCURL] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      Password: js.UndefOr[Password] = js.undefined,
      CopyCommand: js.UndefOr[CopyCommand] = js.undefined,
      S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined,
      S3Configuration: js.UndefOr[S3DestinationConfiguration] = js.undefined,
      S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined): RedshiftDestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "ClusterJDBCURL" -> ClusterJDBCURL.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "CopyCommand" -> CopyCommand.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "S3Configuration" -> S3Configuration.map { x => x.asInstanceOf[js.Any] },
        "S3BackupConfiguration" -> S3BackupConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDestinationConfiguration]
    }
  }

  /**
   * <p>Describes a destination in Amazon Redshift.</p>
   */
  @js.native
  trait RedshiftDestinationDescription extends js.Object {
    var S3BackupDescription: js.UndefOr[S3DestinationDescription]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var Username: js.UndefOr[Username]
    var RetryOptions: js.UndefOr[RedshiftRetryOptions]
    var ClusterJDBCURL: js.UndefOr[ClusterJDBCURL]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription]
    var CopyCommand: js.UndefOr[CopyCommand]
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode]
  }

  object RedshiftDestinationDescription {
    def apply(
      S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      Username: js.UndefOr[Username] = js.undefined,
      RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined,
      ClusterJDBCURL: js.UndefOr[ClusterJDBCURL] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      CopyCommand: js.UndefOr[CopyCommand] = js.undefined,
      S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined): RedshiftDestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3BackupDescription" -> S3BackupDescription.map { x => x.asInstanceOf[js.Any] },
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "ClusterJDBCURL" -> ClusterJDBCURL.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationDescription" -> S3DestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "CopyCommand" -> CopyCommand.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDestinationDescription]
    }
  }

  /**
   * <p>Describes an update for a destination in Amazon Redshift.</p>
   */
  @js.native
  trait RedshiftDestinationUpdate extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var Username: js.UndefOr[Username]
    var RetryOptions: js.UndefOr[RedshiftRetryOptions]
    var ClusterJDBCURL: js.UndefOr[ClusterJDBCURL]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3Update: js.UndefOr[S3DestinationUpdate]
    var Password: js.UndefOr[Password]
    var CopyCommand: js.UndefOr[CopyCommand]
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode]
    var S3BackupUpdate: js.UndefOr[S3DestinationUpdate]
  }

  object RedshiftDestinationUpdate {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      Username: js.UndefOr[Username] = js.undefined,
      RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined,
      ClusterJDBCURL: js.UndefOr[ClusterJDBCURL] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined,
      Password: js.UndefOr[Password] = js.undefined,
      CopyCommand: js.UndefOr[CopyCommand] = js.undefined,
      S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined,
      S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined): RedshiftDestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "ClusterJDBCURL" -> ClusterJDBCURL.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "S3Update" -> S3Update.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "CopyCommand" -> CopyCommand.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "S3BackupUpdate" -> S3BackupUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDestinationUpdate]
    }
  }

  /**
   * <p>Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift.</p>
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
   * <p>Describes the configuration of a destination in Amazon S3.</p>
   */
  @js.native
  trait S3DestinationConfiguration extends js.Object {
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var BufferingHints: js.UndefOr[BufferingHints]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var Prefix: js.UndefOr[Prefix]
    var BucketARN: js.UndefOr[BucketARN]
  }

  object S3DestinationConfiguration {
    def apply(
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      BucketARN: js.UndefOr[BucketARN] = js.undefined): S3DestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DestinationConfiguration]
    }
  }

  /**
   * <p>Describes a destination in Amazon S3.</p>
   */
  @js.native
  trait S3DestinationDescription extends js.Object {
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var BufferingHints: js.UndefOr[BufferingHints]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var Prefix: js.UndefOr[Prefix]
    var BucketARN: js.UndefOr[BucketARN]
  }

  object S3DestinationDescription {
    def apply(
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      BucketARN: js.UndefOr[BucketARN] = js.undefined): S3DestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DestinationDescription]
    }
  }

  /**
   * <p>Describes an update for a destination in Amazon S3.</p>
   */
  @js.native
  trait S3DestinationUpdate extends js.Object {
    var CompressionFormat: js.UndefOr[CompressionFormat]
    var BufferingHints: js.UndefOr[BufferingHints]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var Prefix: js.UndefOr[Prefix]
    var BucketARN: js.UndefOr[BucketARN]
  }

  object S3DestinationUpdate {
    def apply(
      CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined,
      BufferingHints: js.UndefOr[BufferingHints] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      BucketARN: js.UndefOr[BucketARN] = js.undefined): S3DestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompressionFormat" -> CompressionFormat.map { x => x.asInstanceOf[js.Any] },
        "BufferingHints" -> BufferingHints.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DestinationUpdate]
    }
  }

  /**
   * <p>Specifies the schema to which you want Kinesis Data Firehose to configure your data before it writes it to Amazon S3.</p>
   */
  @js.native
  trait SchemaConfiguration extends js.Object {
    var DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var Region: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var TableName: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace]
  }

  object SchemaConfiguration {
    def apply(
      DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      Region: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      TableName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined,
      CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined): SchemaConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "CatalogId" -> CatalogId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SchemaConfiguration]
    }
  }

  /**
   * <p>The serializer that you want Kinesis Data Firehose to use to convert data to the target format before writing it to Amazon S3. Kinesis Data Firehose supports two types of serializers: the <a href="https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/orc/OrcSerde.html">ORC SerDe</a> and the <a href="https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/parquet/serde/ParquetHiveSerDe.html">Parquet SerDe</a>.</p>
   */
  @js.native
  trait Serializer extends js.Object {
    var ParquetSerDe: js.UndefOr[ParquetSerDe]
    var OrcSerDe: js.UndefOr[OrcSerDe]
  }

  object Serializer {
    def apply(
      ParquetSerDe: js.UndefOr[ParquetSerDe] = js.undefined,
      OrcSerDe: js.UndefOr[OrcSerDe] = js.undefined): Serializer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParquetSerDe" -> ParquetSerDe.map { x => x.asInstanceOf[js.Any] },
        "OrcSerDe" -> OrcSerDe.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Serializer]
    }
  }

  /**
   * <p>Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.</p>
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
   * <p>Describes the configuration of a destination in Splunk.</p>
   */
  @js.native
  trait SplunkDestinationConfiguration extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var HECToken: js.UndefOr[HECToken]
    var RetryOptions: js.UndefOr[SplunkRetryOptions]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode]
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds]
    var S3Configuration: js.UndefOr[S3DestinationConfiguration]
    var HECEndpointType: js.UndefOr[HECEndpointType]
    var HECEndpoint: js.UndefOr[HECEndpoint]
  }

  object SplunkDestinationConfiguration {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      HECToken: js.UndefOr[HECToken] = js.undefined,
      RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined,
      HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined,
      S3Configuration: js.UndefOr[S3DestinationConfiguration] = js.undefined,
      HECEndpointType: js.UndefOr[HECEndpointType] = js.undefined,
      HECEndpoint: js.UndefOr[HECEndpoint] = js.undefined): SplunkDestinationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "HECToken" -> HECToken.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "HECAcknowledgmentTimeoutInSeconds" -> HECAcknowledgmentTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "S3Configuration" -> S3Configuration.map { x => x.asInstanceOf[js.Any] },
        "HECEndpointType" -> HECEndpointType.map { x => x.asInstanceOf[js.Any] },
        "HECEndpoint" -> HECEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplunkDestinationConfiguration]
    }
  }

  /**
   * <p>Describes a destination in Splunk.</p>
   */
  @js.native
  trait SplunkDestinationDescription extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var HECToken: js.UndefOr[HECToken]
    var RetryOptions: js.UndefOr[SplunkRetryOptions]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription]
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode]
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds]
    var HECEndpointType: js.UndefOr[HECEndpointType]
    var HECEndpoint: js.UndefOr[HECEndpoint]
  }

  object SplunkDestinationDescription {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      HECToken: js.UndefOr[HECToken] = js.undefined,
      RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined,
      S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined,
      HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined,
      HECEndpointType: js.UndefOr[HECEndpointType] = js.undefined,
      HECEndpoint: js.UndefOr[HECEndpoint] = js.undefined): SplunkDestinationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "HECToken" -> HECToken.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationDescription" -> S3DestinationDescription.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "HECAcknowledgmentTimeoutInSeconds" -> HECAcknowledgmentTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "HECEndpointType" -> HECEndpointType.map { x => x.asInstanceOf[js.Any] },
        "HECEndpoint" -> HECEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplunkDestinationDescription]
    }
  }

  /**
   * <p>Describes an update for a destination in Splunk.</p>
   */
  @js.native
  trait SplunkDestinationUpdate extends js.Object {
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var HECToken: js.UndefOr[HECToken]
    var RetryOptions: js.UndefOr[SplunkRetryOptions]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var S3Update: js.UndefOr[S3DestinationUpdate]
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode]
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds]
    var HECEndpointType: js.UndefOr[HECEndpointType]
    var HECEndpoint: js.UndefOr[HECEndpoint]
  }

  object SplunkDestinationUpdate {
    def apply(
      ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined,
      HECToken: js.UndefOr[HECToken] = js.undefined,
      RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined,
      S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined,
      HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined,
      HECEndpointType: js.UndefOr[HECEndpointType] = js.undefined,
      HECEndpoint: js.UndefOr[HECEndpoint] = js.undefined): SplunkDestinationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProcessingConfiguration" -> ProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "HECToken" -> HECToken.map { x => x.asInstanceOf[js.Any] },
        "RetryOptions" -> RetryOptions.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "S3Update" -> S3Update.map { x => x.asInstanceOf[js.Any] },
        "S3BackupMode" -> S3BackupMode.map { x => x.asInstanceOf[js.Any] },
        "HECAcknowledgmentTimeoutInSeconds" -> HECAcknowledgmentTimeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "HECEndpointType" -> HECEndpointType.map { x => x.asInstanceOf[js.Any] },
        "HECEndpoint" -> HECEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplunkDestinationUpdate]
    }
  }

  /**
   * <p>Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Splunk, or if it doesn't receive an acknowledgment from Splunk.</p>
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
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
  }

  object StartDeliveryStreamEncryptionInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined): StartDeliveryStreamEncryptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
  }

  object StopDeliveryStreamEncryptionInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined): StopDeliveryStreamEncryptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Metadata that you can assign to a delivery stream, consisting of a key-value pair.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
    var Tags: js.UndefOr[TagDeliveryStreamInputTagList]
  }

  object TagDeliveryStreamInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined,
      Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.undefined): TagDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object UntagDeliveryStreamInput {
    def apply(
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagDeliveryStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ElasticsearchDestinationUpdate: js.UndefOr[ElasticsearchDestinationUpdate]
    var RedshiftDestinationUpdate: js.UndefOr[RedshiftDestinationUpdate]
    var ExtendedS3DestinationUpdate: js.UndefOr[ExtendedS3DestinationUpdate]
    var S3DestinationUpdate: js.UndefOr[S3DestinationUpdate]
    var DestinationId: js.UndefOr[DestinationId]
    var SplunkDestinationUpdate: js.UndefOr[SplunkDestinationUpdate]
    var CurrentDeliveryStreamVersionId: js.UndefOr[DeliveryStreamVersionId]
    var DeliveryStreamName: js.UndefOr[DeliveryStreamName]
  }

  object UpdateDestinationInput {
    def apply(
      ElasticsearchDestinationUpdate: js.UndefOr[ElasticsearchDestinationUpdate] = js.undefined,
      RedshiftDestinationUpdate: js.UndefOr[RedshiftDestinationUpdate] = js.undefined,
      ExtendedS3DestinationUpdate: js.UndefOr[ExtendedS3DestinationUpdate] = js.undefined,
      S3DestinationUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined,
      DestinationId: js.UndefOr[DestinationId] = js.undefined,
      SplunkDestinationUpdate: js.UndefOr[SplunkDestinationUpdate] = js.undefined,
      CurrentDeliveryStreamVersionId: js.UndefOr[DeliveryStreamVersionId] = js.undefined,
      DeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined): UpdateDestinationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticsearchDestinationUpdate" -> ElasticsearchDestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "RedshiftDestinationUpdate" -> RedshiftDestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "ExtendedS3DestinationUpdate" -> ExtendedS3DestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "S3DestinationUpdate" -> S3DestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "DestinationId" -> DestinationId.map { x => x.asInstanceOf[js.Any] },
        "SplunkDestinationUpdate" -> SplunkDestinationUpdate.map { x => x.asInstanceOf[js.Any] },
        "CurrentDeliveryStreamVersionId" -> CurrentDeliveryStreamVersionId.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamName" -> DeliveryStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
