package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object firehose {
  type AWSKMSKeyARN                            = String
  type BlockSizeBytes                          = Int
  type BooleanObject                           = Boolean
  type BucketARN                               = String
  type ClusterJDBCURL                          = String
  type ColumnToJsonKeyMappings                 = js.Dictionary[NonEmptyString]
  type CompressionFormat                       = String
  type CopyOptions                             = String
  type Data                                    = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DataTableColumns                        = String
  type DataTableName                           = String
  type DeliveryStartTimestamp                  = js.Date
  type DeliveryStreamARN                       = String
  type DeliveryStreamEncryptionStatus          = String
  type DeliveryStreamName                      = String
  type DeliveryStreamNameList                  = js.Array[DeliveryStreamName]
  type DeliveryStreamStatus                    = String
  type DeliveryStreamType                      = String
  type DeliveryStreamVersionId                 = String
  type DescribeDeliveryStreamInputLimit        = Int
  type DestinationDescriptionList              = js.Array[DestinationDescription]
  type DestinationId                           = String
  type ElasticsearchBufferingIntervalInSeconds = Int
  type ElasticsearchBufferingSizeInMBs         = Int
  type ElasticsearchDomainARN                  = String
  type ElasticsearchIndexName                  = String
  type ElasticsearchIndexRotationPeriod        = String
  type ElasticsearchRetryDurationInSeconds     = Int
  type ElasticsearchS3BackupMode               = String
  type ElasticsearchTypeName                   = String
  type ErrorCode                               = String
  type ErrorMessage                            = String
  type ErrorOutputPrefix                       = String
  type HECAcknowledgmentTimeoutInSeconds       = Int
  type HECEndpoint                             = String
  type HECEndpointType                         = String
  type HECToken                                = String
  type IntervalInSeconds                       = Int
  type KinesisStreamARN                        = String
  type ListDeliveryStreamsInputLimit           = Int
  type ListOfNonEmptyStrings                   = js.Array[NonEmptyString]
  type ListOfNonEmptyStringsWithoutWhitespace  = js.Array[NonEmptyStringWithoutWhitespace]
  type ListTagsForDeliveryStreamInputLimit     = Int
  type ListTagsForDeliveryStreamOutputTagList  = js.Array[Tag]
  type LogGroupName                            = String
  type LogStreamName                           = String
  type NoEncryptionConfig                      = String
  type NonEmptyString                          = String
  type NonEmptyStringWithoutWhitespace         = String
  type NonNegativeIntegerObject                = Int
  type OrcCompression                          = String
  type OrcFormatVersion                        = String
  type OrcRowIndexStride                       = Int
  type OrcStripeSizeBytes                      = Int
  type ParquetCompression                      = String
  type ParquetPageSizeBytes                    = Int
  type ParquetWriterVersion                    = String
  type Password                                = String
  type Prefix                                  = String
  type ProcessorList                           = js.Array[Processor]
  type ProcessorParameterList                  = js.Array[ProcessorParameter]
  type ProcessorParameterName                  = String
  type ProcessorParameterValue                 = String
  type ProcessorType                           = String
  type Proportion                              = Double
  type PutRecordBatchRequestEntryList          = js.Array[Record]
  type PutRecordBatchResponseEntryList         = js.Array[PutRecordBatchResponseEntry]
  type PutResponseRecordId                     = String
  type RedshiftRetryDurationInSeconds          = Int
  type RedshiftS3BackupMode                    = String
  type RoleARN                                 = String
  type S3BackupMode                            = String
  type SizeInMBs                               = Int
  type SplunkRetryDurationInSeconds            = Int
  type SplunkS3BackupMode                      = String
  type TagDeliveryStreamInputTagList           = js.Array[Tag]
  type TagKey                                  = String
  type TagKeyList                              = js.Array[TagKey]
  type TagValue                                = String
  type Timestamp                               = js.Date
  type Username                                = String

  implicit final class FirehoseOps(private val service: Firehose) extends AnyVal {

    def createDeliveryStreamFuture(params: CreateDeliveryStreamInput): Future[CreateDeliveryStreamOutput] =
      service.createDeliveryStream(params).promise.toFuture
    def deleteDeliveryStreamFuture(params: DeleteDeliveryStreamInput): Future[DeleteDeliveryStreamOutput] =
      service.deleteDeliveryStream(params).promise.toFuture
    def describeDeliveryStreamFuture(params: DescribeDeliveryStreamInput): Future[DescribeDeliveryStreamOutput] =
      service.describeDeliveryStream(params).promise.toFuture
    def listDeliveryStreamsFuture(params: ListDeliveryStreamsInput): Future[ListDeliveryStreamsOutput] =
      service.listDeliveryStreams(params).promise.toFuture
    def listTagsForDeliveryStreamFuture(
        params: ListTagsForDeliveryStreamInput
    ): Future[ListTagsForDeliveryStreamOutput] = service.listTagsForDeliveryStream(params).promise.toFuture
    def putRecordBatchFuture(params: PutRecordBatchInput): Future[PutRecordBatchOutput] =
      service.putRecordBatch(params).promise.toFuture
    def putRecordFuture(params: PutRecordInput): Future[PutRecordOutput] = service.putRecord(params).promise.toFuture
    def startDeliveryStreamEncryptionFuture(
        params: StartDeliveryStreamEncryptionInput
    ): Future[StartDeliveryStreamEncryptionOutput] = service.startDeliveryStreamEncryption(params).promise.toFuture
    def stopDeliveryStreamEncryptionFuture(
        params: StopDeliveryStreamEncryptionInput
    ): Future[StopDeliveryStreamEncryptionOutput] = service.stopDeliveryStreamEncryption(params).promise.toFuture
    def tagDeliveryStreamFuture(params: TagDeliveryStreamInput): Future[TagDeliveryStreamOutput] =
      service.tagDeliveryStream(params).promise.toFuture
    def untagDeliveryStreamFuture(params: UntagDeliveryStreamInput): Future[UntagDeliveryStreamOutput] =
      service.untagDeliveryStream(params).promise.toFuture
    def updateDestinationFuture(params: UpdateDestinationInput): Future[UpdateDestinationOutput] =
      service.updateDestination(params).promise.toFuture
  }
}

package firehose {
  @js.native
  @JSImport("aws-sdk", "Firehose")
  class Firehose() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDeliveryStream(params: CreateDeliveryStreamInput): Request[CreateDeliveryStreamOutput]       = js.native
    def deleteDeliveryStream(params: DeleteDeliveryStreamInput): Request[DeleteDeliveryStreamOutput]       = js.native
    def describeDeliveryStream(params: DescribeDeliveryStreamInput): Request[DescribeDeliveryStreamOutput] = js.native
    def listDeliveryStreams(params: ListDeliveryStreamsInput): Request[ListDeliveryStreamsOutput]          = js.native
    def listTagsForDeliveryStream(params: ListTagsForDeliveryStreamInput): Request[ListTagsForDeliveryStreamOutput] =
      js.native
    def putRecord(params: PutRecordInput): Request[PutRecordOutput]                = js.native
    def putRecordBatch(params: PutRecordBatchInput): Request[PutRecordBatchOutput] = js.native
    def startDeliveryStreamEncryption(
        params: StartDeliveryStreamEncryptionInput
    ): Request[StartDeliveryStreamEncryptionOutput] = js.native
    def stopDeliveryStreamEncryption(
        params: StopDeliveryStreamEncryptionInput
    ): Request[StopDeliveryStreamEncryptionOutput]                                                = js.native
    def tagDeliveryStream(params: TagDeliveryStreamInput): Request[TagDeliveryStreamOutput]       = js.native
    def untagDeliveryStream(params: UntagDeliveryStreamInput): Request[UntagDeliveryStreamOutput] = js.native
    def updateDestination(params: UpdateDestinationInput): Request[UpdateDestinationOutput]       = js.native
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
        SizeInMBs: js.UndefOr[SizeInMBs] = js.undefined
    ): BufferingHints = {
      val __obj = js.Dynamic.literal()
      IntervalInSeconds.foreach(__v => __obj.updateDynamic("IntervalInSeconds")(__v.asInstanceOf[js.Any]))
      SizeInMBs.foreach(__v => __obj.updateDynamic("SizeInMBs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BufferingHints]
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
        LogStreamName: js.UndefOr[LogStreamName] = js.undefined
    ): CloudWatchLoggingOptions = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      LogStreamName.foreach(__v => __obj.updateDynamic("LogStreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLoggingOptions]
    }
  }

  object CompressionFormatEnum {
    val UNCOMPRESSED = "UNCOMPRESSED"
    val GZIP         = "GZIP"
    val ZIP          = "ZIP"
    val Snappy       = "Snappy"

    val values = js.Object.freeze(js.Array(UNCOMPRESSED, GZIP, ZIP, Snappy))
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
        DataTableColumns: js.UndefOr[DataTableColumns] = js.undefined
    ): CopyCommand = {
      val __obj = js.Dynamic.literal(
        "DataTableName" -> DataTableName.asInstanceOf[js.Any]
      )

      CopyOptions.foreach(__v => __obj.updateDynamic("CopyOptions")(__v.asInstanceOf[js.Any]))
      DataTableColumns.foreach(__v => __obj.updateDynamic("DataTableColumns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyCommand]
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
        Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.undefined
    ): CreateDeliveryStreamInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]
      )

      DeliveryStreamType.foreach(__v => __obj.updateDynamic("DeliveryStreamType")(__v.asInstanceOf[js.Any]))
      ElasticsearchDestinationConfiguration.foreach(
        __v => __obj.updateDynamic("ElasticsearchDestinationConfiguration")(__v.asInstanceOf[js.Any])
      )
      ExtendedS3DestinationConfiguration.foreach(
        __v => __obj.updateDynamic("ExtendedS3DestinationConfiguration")(__v.asInstanceOf[js.Any])
      )
      KinesisStreamSourceConfiguration.foreach(
        __v => __obj.updateDynamic("KinesisStreamSourceConfiguration")(__v.asInstanceOf[js.Any])
      )
      RedshiftDestinationConfiguration.foreach(
        __v => __obj.updateDynamic("RedshiftDestinationConfiguration")(__v.asInstanceOf[js.Any])
      )
      S3DestinationConfiguration.foreach(
        __v => __obj.updateDynamic("S3DestinationConfiguration")(__v.asInstanceOf[js.Any])
      )
      SplunkDestinationConfiguration.foreach(
        __v => __obj.updateDynamic("SplunkDestinationConfiguration")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeliveryStreamInput]
    }
  }

  @js.native
  trait CreateDeliveryStreamOutput extends js.Object {
    var DeliveryStreamARN: js.UndefOr[DeliveryStreamARN]
  }

  object CreateDeliveryStreamOutput {
    def apply(
        DeliveryStreamARN: js.UndefOr[DeliveryStreamARN] = js.undefined
    ): CreateDeliveryStreamOutput = {
      val __obj = js.Dynamic.literal()
      DeliveryStreamARN.foreach(__v => __obj.updateDynamic("DeliveryStreamARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeliveryStreamOutput]
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
        SchemaConfiguration: js.UndefOr[SchemaConfiguration] = js.undefined
    ): DataFormatConversionConfiguration = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      InputFormatConfiguration.foreach(__v => __obj.updateDynamic("InputFormatConfiguration")(__v.asInstanceOf[js.Any]))
      OutputFormatConfiguration.foreach(
        __v => __obj.updateDynamic("OutputFormatConfiguration")(__v.asInstanceOf[js.Any])
      )
      SchemaConfiguration.foreach(__v => __obj.updateDynamic("SchemaConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataFormatConversionConfiguration]
    }
  }

  @js.native
  trait DeleteDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
  }

  object DeleteDeliveryStreamInput {
    def apply(
        DeliveryStreamName: DeliveryStreamName
    ): DeleteDeliveryStreamInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeliveryStreamInput]
    }
  }

  @js.native
  trait DeleteDeliveryStreamOutput extends js.Object {}

  object DeleteDeliveryStreamOutput {
    def apply(
        ): DeleteDeliveryStreamOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteDeliveryStreamOutput]
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
        Source: js.UndefOr[SourceDescription] = js.undefined
    ): DeliveryStreamDescription = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamARN"    -> DeliveryStreamARN.asInstanceOf[js.Any],
        "DeliveryStreamName"   -> DeliveryStreamName.asInstanceOf[js.Any],
        "DeliveryStreamStatus" -> DeliveryStreamStatus.asInstanceOf[js.Any],
        "DeliveryStreamType"   -> DeliveryStreamType.asInstanceOf[js.Any],
        "Destinations"         -> Destinations.asInstanceOf[js.Any],
        "HasMoreDestinations"  -> HasMoreDestinations.asInstanceOf[js.Any],
        "VersionId"            -> VersionId.asInstanceOf[js.Any]
      )

      CreateTimestamp.foreach(__v => __obj.updateDynamic("CreateTimestamp")(__v.asInstanceOf[js.Any]))
      DeliveryStreamEncryptionConfiguration.foreach(
        __v => __obj.updateDynamic("DeliveryStreamEncryptionConfiguration")(__v.asInstanceOf[js.Any])
      )
      LastUpdateTimestamp.foreach(__v => __obj.updateDynamic("LastUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliveryStreamDescription]
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
        Status: js.UndefOr[DeliveryStreamEncryptionStatus] = js.undefined
    ): DeliveryStreamEncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliveryStreamEncryptionConfiguration]
    }
  }

  object DeliveryStreamEncryptionStatusEnum {
    val ENABLED   = "ENABLED"
    val ENABLING  = "ENABLING"
    val DISABLED  = "DISABLED"
    val DISABLING = "DISABLING"

    val values = js.Object.freeze(js.Array(ENABLED, ENABLING, DISABLED, DISABLING))
  }

  object DeliveryStreamStatusEnum {
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val ACTIVE   = "ACTIVE"

    val values = js.Object.freeze(js.Array(CREATING, DELETING, ACTIVE))
  }

  object DeliveryStreamTypeEnum {
    val DirectPut             = "DirectPut"
    val KinesisStreamAsSource = "KinesisStreamAsSource"

    val values = js.Object.freeze(js.Array(DirectPut, KinesisStreamAsSource))
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
        Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.undefined
    ): DescribeDeliveryStreamInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]
      )

      ExclusiveStartDestinationId.foreach(
        __v => __obj.updateDynamic("ExclusiveStartDestinationId")(__v.asInstanceOf[js.Any])
      )
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeliveryStreamInput]
    }
  }

  @js.native
  trait DescribeDeliveryStreamOutput extends js.Object {
    var DeliveryStreamDescription: DeliveryStreamDescription
  }

  object DescribeDeliveryStreamOutput {
    def apply(
        DeliveryStreamDescription: DeliveryStreamDescription
    ): DescribeDeliveryStreamOutput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamDescription" -> DeliveryStreamDescription.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDeliveryStreamOutput]
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
        OpenXJsonSerDe: js.UndefOr[OpenXJsonSerDe] = js.undefined
    ): Deserializer = {
      val __obj = js.Dynamic.literal()
      HiveJsonSerDe.foreach(__v => __obj.updateDynamic("HiveJsonSerDe")(__v.asInstanceOf[js.Any]))
      OpenXJsonSerDe.foreach(__v => __obj.updateDynamic("OpenXJsonSerDe")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deserializer]
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
        SplunkDestinationDescription: js.UndefOr[SplunkDestinationDescription] = js.undefined
    ): DestinationDescription = {
      val __obj = js.Dynamic.literal(
        "DestinationId" -> DestinationId.asInstanceOf[js.Any]
      )

      ElasticsearchDestinationDescription.foreach(
        __v => __obj.updateDynamic("ElasticsearchDestinationDescription")(__v.asInstanceOf[js.Any])
      )
      ExtendedS3DestinationDescription.foreach(
        __v => __obj.updateDynamic("ExtendedS3DestinationDescription")(__v.asInstanceOf[js.Any])
      )
      RedshiftDestinationDescription.foreach(
        __v => __obj.updateDynamic("RedshiftDestinationDescription")(__v.asInstanceOf[js.Any])
      )
      S3DestinationDescription.foreach(__v => __obj.updateDynamic("S3DestinationDescription")(__v.asInstanceOf[js.Any]))
      SplunkDestinationDescription.foreach(
        __v => __obj.updateDynamic("SplunkDestinationDescription")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DestinationDescription]
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
        SizeInMBs: js.UndefOr[ElasticsearchBufferingSizeInMBs] = js.undefined
    ): ElasticsearchBufferingHints = {
      val __obj = js.Dynamic.literal()
      IntervalInSeconds.foreach(__v => __obj.updateDynamic("IntervalInSeconds")(__v.asInstanceOf[js.Any]))
      SizeInMBs.foreach(__v => __obj.updateDynamic("SizeInMBs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchBufferingHints]
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
        S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.undefined
    ): ElasticsearchDestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "DomainARN"       -> DomainARN.asInstanceOf[js.Any],
        "IndexName"       -> IndexName.asInstanceOf[js.Any],
        "RoleARN"         -> RoleARN.asInstanceOf[js.Any],
        "S3Configuration" -> S3Configuration.asInstanceOf[js.Any],
        "TypeName"        -> TypeName.asInstanceOf[js.Any]
      )

      BufferingHints.foreach(__v => __obj.updateDynamic("BufferingHints")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      IndexRotationPeriod.foreach(__v => __obj.updateDynamic("IndexRotationPeriod")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchDestinationConfiguration]
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
        TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined
    ): ElasticsearchDestinationDescription = {
      val __obj = js.Dynamic.literal()
      BufferingHints.foreach(__v => __obj.updateDynamic("BufferingHints")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      DomainARN.foreach(__v => __obj.updateDynamic("DomainARN")(__v.asInstanceOf[js.Any]))
      IndexName.foreach(__v => __obj.updateDynamic("IndexName")(__v.asInstanceOf[js.Any]))
      IndexRotationPeriod.foreach(__v => __obj.updateDynamic("IndexRotationPeriod")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      S3DestinationDescription.foreach(__v => __obj.updateDynamic("S3DestinationDescription")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchDestinationDescription]
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
        TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined
    ): ElasticsearchDestinationUpdate = {
      val __obj = js.Dynamic.literal()
      BufferingHints.foreach(__v => __obj.updateDynamic("BufferingHints")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      DomainARN.foreach(__v => __obj.updateDynamic("DomainARN")(__v.asInstanceOf[js.Any]))
      IndexName.foreach(__v => __obj.updateDynamic("IndexName")(__v.asInstanceOf[js.Any]))
      IndexRotationPeriod.foreach(__v => __obj.updateDynamic("IndexRotationPeriod")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      S3Update.foreach(__v => __obj.updateDynamic("S3Update")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchDestinationUpdate]
    }
  }

  object ElasticsearchIndexRotationPeriodEnum {
    val NoRotation = "NoRotation"
    val OneHour    = "OneHour"
    val OneDay     = "OneDay"
    val OneWeek    = "OneWeek"
    val OneMonth   = "OneMonth"

    val values = js.Object.freeze(js.Array(NoRotation, OneHour, OneDay, OneWeek, OneMonth))
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
        DurationInSeconds: js.UndefOr[ElasticsearchRetryDurationInSeconds] = js.undefined
    ): ElasticsearchRetryOptions = {
      val __obj = js.Dynamic.literal()
      DurationInSeconds.foreach(__v => __obj.updateDynamic("DurationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchRetryOptions]
    }
  }

  object ElasticsearchS3BackupModeEnum {
    val FailedDocumentsOnly = "FailedDocumentsOnly"
    val AllDocuments        = "AllDocuments"

    val values = js.Object.freeze(js.Array(FailedDocumentsOnly, AllDocuments))
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
        NoEncryptionConfig: js.UndefOr[NoEncryptionConfig] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      KMSEncryptionConfig.foreach(__v => __obj.updateDynamic("KMSEncryptionConfig")(__v.asInstanceOf[js.Any]))
      NoEncryptionConfig.foreach(__v => __obj.updateDynamic("NoEncryptionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
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
        S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined
    ): ExtendedS3DestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "RoleARN"   -> RoleARN.asInstanceOf[js.Any]
      )

      BufferingHints.foreach(__v => __obj.updateDynamic("BufferingHints")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      CompressionFormat.foreach(__v => __obj.updateDynamic("CompressionFormat")(__v.asInstanceOf[js.Any]))
      DataFormatConversionConfiguration.foreach(
        __v => __obj.updateDynamic("DataFormatConversionConfiguration")(__v.asInstanceOf[js.Any])
      )
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      ErrorOutputPrefix.foreach(__v => __obj.updateDynamic("ErrorOutputPrefix")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      S3BackupConfiguration.foreach(__v => __obj.updateDynamic("S3BackupConfiguration")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtendedS3DestinationConfiguration]
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
        S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined
    ): ExtendedS3DestinationDescription = {
      val __obj = js.Dynamic.literal(
        "BucketARN"               -> BucketARN.asInstanceOf[js.Any],
        "BufferingHints"          -> BufferingHints.asInstanceOf[js.Any],
        "CompressionFormat"       -> CompressionFormat.asInstanceOf[js.Any],
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "RoleARN"                 -> RoleARN.asInstanceOf[js.Any]
      )

      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      DataFormatConversionConfiguration.foreach(
        __v => __obj.updateDynamic("DataFormatConversionConfiguration")(__v.asInstanceOf[js.Any])
      )
      ErrorOutputPrefix.foreach(__v => __obj.updateDynamic("ErrorOutputPrefix")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      S3BackupDescription.foreach(__v => __obj.updateDynamic("S3BackupDescription")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtendedS3DestinationDescription]
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
        S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined
    ): ExtendedS3DestinationUpdate = {
      val __obj = js.Dynamic.literal()
      BucketARN.foreach(__v => __obj.updateDynamic("BucketARN")(__v.asInstanceOf[js.Any]))
      BufferingHints.foreach(__v => __obj.updateDynamic("BufferingHints")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      CompressionFormat.foreach(__v => __obj.updateDynamic("CompressionFormat")(__v.asInstanceOf[js.Any]))
      DataFormatConversionConfiguration.foreach(
        __v => __obj.updateDynamic("DataFormatConversionConfiguration")(__v.asInstanceOf[js.Any])
      )
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      ErrorOutputPrefix.foreach(__v => __obj.updateDynamic("ErrorOutputPrefix")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      S3BackupUpdate.foreach(__v => __obj.updateDynamic("S3BackupUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtendedS3DestinationUpdate]
    }
  }

  object HECEndpointTypeEnum {
    val Raw   = "Raw"
    val Event = "Event"

    val values = js.Object.freeze(js.Array(Raw, Event))
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
        TimestampFormats: js.UndefOr[ListOfNonEmptyStrings] = js.undefined
    ): HiveJsonSerDe = {
      val __obj = js.Dynamic.literal()
      TimestampFormats.foreach(__v => __obj.updateDynamic("TimestampFormats")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HiveJsonSerDe]
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
        Deserializer: js.UndefOr[Deserializer] = js.undefined
    ): InputFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      Deserializer.foreach(__v => __obj.updateDynamic("Deserializer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputFormatConfiguration]
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
        AWSKMSKeyARN: AWSKMSKeyARN
    ): KMSEncryptionConfig = {
      val __obj = js.Dynamic.literal(
        "AWSKMSKeyARN" -> AWSKMSKeyARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KMSEncryptionConfig]
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
        RoleARN: RoleARN
    ): KinesisStreamSourceConfiguration = {
      val __obj = js.Dynamic.literal(
        "KinesisStreamARN" -> KinesisStreamARN.asInstanceOf[js.Any],
        "RoleARN"          -> RoleARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisStreamSourceConfiguration]
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
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisStreamSourceDescription = {
      val __obj = js.Dynamic.literal()
      DeliveryStartTimestamp.foreach(__v => __obj.updateDynamic("DeliveryStartTimestamp")(__v.asInstanceOf[js.Any]))
      KinesisStreamARN.foreach(__v => __obj.updateDynamic("KinesisStreamARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisStreamSourceDescription]
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
        Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.undefined
    ): ListDeliveryStreamsInput = {
      val __obj = js.Dynamic.literal()
      DeliveryStreamType.foreach(__v => __obj.updateDynamic("DeliveryStreamType")(__v.asInstanceOf[js.Any]))
      ExclusiveStartDeliveryStreamName.foreach(
        __v => __obj.updateDynamic("ExclusiveStartDeliveryStreamName")(__v.asInstanceOf[js.Any])
      )
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeliveryStreamsInput]
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
        HasMoreDeliveryStreams: BooleanObject
    ): ListDeliveryStreamsOutput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamNames"    -> DeliveryStreamNames.asInstanceOf[js.Any],
        "HasMoreDeliveryStreams" -> HasMoreDeliveryStreams.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListDeliveryStreamsOutput]
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
        Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit] = js.undefined
    ): ListTagsForDeliveryStreamInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]
      )

      ExclusiveStartTagKey.foreach(__v => __obj.updateDynamic("ExclusiveStartTagKey")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForDeliveryStreamInput]
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
        Tags: ListTagsForDeliveryStreamOutputTagList
    ): ListTagsForDeliveryStreamOutput = {
      val __obj = js.Dynamic.literal(
        "HasMoreTags" -> HasMoreTags.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForDeliveryStreamOutput]
    }
  }

  object NoEncryptionConfigEnum {
    val NoEncryption = "NoEncryption"

    val values = js.Object.freeze(js.Array(NoEncryption))
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
        ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject] = js.undefined
    ): OpenXJsonSerDe = {
      val __obj = js.Dynamic.literal()
      CaseInsensitive.foreach(__v => __obj.updateDynamic("CaseInsensitive")(__v.asInstanceOf[js.Any]))
      ColumnToJsonKeyMappings.foreach(__v => __obj.updateDynamic("ColumnToJsonKeyMappings")(__v.asInstanceOf[js.Any]))
      ConvertDotsInJsonKeysToUnderscores.foreach(
        __v => __obj.updateDynamic("ConvertDotsInJsonKeysToUnderscores")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[OpenXJsonSerDe]
    }
  }

  object OrcCompressionEnum {
    val NONE   = "NONE"
    val ZLIB   = "ZLIB"
    val SNAPPY = "SNAPPY"

    val values = js.Object.freeze(js.Array(NONE, ZLIB, SNAPPY))
  }

  object OrcFormatVersionEnum {
    val V0_11 = "V0_11"
    val V0_12 = "V0_12"

    val values = js.Object.freeze(js.Array(V0_11, V0_12))
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
        StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes] = js.undefined
    ): OrcSerDe = {
      val __obj = js.Dynamic.literal()
      BlockSizeBytes.foreach(__v => __obj.updateDynamic("BlockSizeBytes")(__v.asInstanceOf[js.Any]))
      BloomFilterColumns.foreach(__v => __obj.updateDynamic("BloomFilterColumns")(__v.asInstanceOf[js.Any]))
      BloomFilterFalsePositiveProbability.foreach(
        __v => __obj.updateDynamic("BloomFilterFalsePositiveProbability")(__v.asInstanceOf[js.Any])
      )
      Compression.foreach(__v => __obj.updateDynamic("Compression")(__v.asInstanceOf[js.Any]))
      DictionaryKeyThreshold.foreach(__v => __obj.updateDynamic("DictionaryKeyThreshold")(__v.asInstanceOf[js.Any]))
      EnablePadding.foreach(__v => __obj.updateDynamic("EnablePadding")(__v.asInstanceOf[js.Any]))
      FormatVersion.foreach(__v => __obj.updateDynamic("FormatVersion")(__v.asInstanceOf[js.Any]))
      PaddingTolerance.foreach(__v => __obj.updateDynamic("PaddingTolerance")(__v.asInstanceOf[js.Any]))
      RowIndexStride.foreach(__v => __obj.updateDynamic("RowIndexStride")(__v.asInstanceOf[js.Any]))
      StripeSizeBytes.foreach(__v => __obj.updateDynamic("StripeSizeBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrcSerDe]
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
        Serializer: js.UndefOr[Serializer] = js.undefined
    ): OutputFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      Serializer.foreach(__v => __obj.updateDynamic("Serializer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputFormatConfiguration]
    }
  }

  object ParquetCompressionEnum {
    val UNCOMPRESSED = "UNCOMPRESSED"
    val GZIP         = "GZIP"
    val SNAPPY       = "SNAPPY"

    val values = js.Object.freeze(js.Array(UNCOMPRESSED, GZIP, SNAPPY))
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
        WriterVersion: js.UndefOr[ParquetWriterVersion] = js.undefined
    ): ParquetSerDe = {
      val __obj = js.Dynamic.literal()
      BlockSizeBytes.foreach(__v => __obj.updateDynamic("BlockSizeBytes")(__v.asInstanceOf[js.Any]))
      Compression.foreach(__v => __obj.updateDynamic("Compression")(__v.asInstanceOf[js.Any]))
      EnableDictionaryCompression.foreach(
        __v => __obj.updateDynamic("EnableDictionaryCompression")(__v.asInstanceOf[js.Any])
      )
      MaxPaddingBytes.foreach(__v => __obj.updateDynamic("MaxPaddingBytes")(__v.asInstanceOf[js.Any]))
      PageSizeBytes.foreach(__v => __obj.updateDynamic("PageSizeBytes")(__v.asInstanceOf[js.Any]))
      WriterVersion.foreach(__v => __obj.updateDynamic("WriterVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParquetSerDe]
    }
  }

  object ParquetWriterVersionEnum {
    val V1 = "V1"
    val V2 = "V2"

    val values = js.Object.freeze(js.Array(V1, V2))
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
        Processors: js.UndefOr[ProcessorList] = js.undefined
    ): ProcessingConfiguration = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      Processors.foreach(__v => __obj.updateDynamic("Processors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessingConfiguration]
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
        Parameters: js.UndefOr[ProcessorParameterList] = js.undefined
    ): Processor = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Processor]
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
        ParameterValue: ProcessorParameterValue
    ): ProcessorParameter = {
      val __obj = js.Dynamic.literal(
        "ParameterName"  -> ParameterName.asInstanceOf[js.Any],
        "ParameterValue" -> ParameterValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ProcessorParameter]
    }
  }

  object ProcessorParameterNameEnum {
    val LambdaArn               = "LambdaArn"
    val NumberOfRetries         = "NumberOfRetries"
    val RoleArn                 = "RoleArn"
    val BufferSizeInMBs         = "BufferSizeInMBs"
    val BufferIntervalInSeconds = "BufferIntervalInSeconds"

    val values =
      js.Object.freeze(js.Array(LambdaArn, NumberOfRetries, RoleArn, BufferSizeInMBs, BufferIntervalInSeconds))
  }

  object ProcessorTypeEnum {
    val Lambda = "Lambda"

    val values = js.Object.freeze(js.Array(Lambda))
  }

  @js.native
  trait PutRecordBatchInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var Records: PutRecordBatchRequestEntryList
  }

  object PutRecordBatchInput {
    def apply(
        DeliveryStreamName: DeliveryStreamName,
        Records: PutRecordBatchRequestEntryList
    ): PutRecordBatchInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "Records"            -> Records.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRecordBatchInput]
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
        Encrypted: js.UndefOr[BooleanObject] = js.undefined
    ): PutRecordBatchOutput = {
      val __obj = js.Dynamic.literal(
        "FailedPutCount"   -> FailedPutCount.asInstanceOf[js.Any],
        "RequestResponses" -> RequestResponses.asInstanceOf[js.Any]
      )

      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecordBatchOutput]
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
        RecordId: js.UndefOr[PutResponseRecordId] = js.undefined
    ): PutRecordBatchResponseEntry = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      RecordId.foreach(__v => __obj.updateDynamic("RecordId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecordBatchResponseEntry]
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
        Record: Record
    ): PutRecordInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "Record"             -> Record.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRecordInput]
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
        Encrypted: js.UndefOr[BooleanObject] = js.undefined
    ): PutRecordOutput = {
      val __obj = js.Dynamic.literal(
        "RecordId" -> RecordId.asInstanceOf[js.Any]
      )

      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecordOutput]
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
        Data: Data
    ): Record = {
      val __obj = js.Dynamic.literal(
        "Data" -> Data.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Record]
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
        S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
    ): RedshiftDestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "ClusterJDBCURL"  -> ClusterJDBCURL.asInstanceOf[js.Any],
        "CopyCommand"     -> CopyCommand.asInstanceOf[js.Any],
        "Password"        -> Password.asInstanceOf[js.Any],
        "RoleARN"         -> RoleARN.asInstanceOf[js.Any],
        "S3Configuration" -> S3Configuration.asInstanceOf[js.Any],
        "Username"        -> Username.asInstanceOf[js.Any]
      )

      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      S3BackupConfiguration.foreach(__v => __obj.updateDynamic("S3BackupConfiguration")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftDestinationConfiguration]
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
        S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
    ): RedshiftDestinationDescription = {
      val __obj = js.Dynamic.literal(
        "ClusterJDBCURL"           -> ClusterJDBCURL.asInstanceOf[js.Any],
        "CopyCommand"              -> CopyCommand.asInstanceOf[js.Any],
        "RoleARN"                  -> RoleARN.asInstanceOf[js.Any],
        "S3DestinationDescription" -> S3DestinationDescription.asInstanceOf[js.Any],
        "Username"                 -> Username.asInstanceOf[js.Any]
      )

      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      S3BackupDescription.foreach(__v => __obj.updateDynamic("S3BackupDescription")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftDestinationDescription]
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
        Username: js.UndefOr[Username] = js.undefined
    ): RedshiftDestinationUpdate = {
      val __obj = js.Dynamic.literal()
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      ClusterJDBCURL.foreach(__v => __obj.updateDynamic("ClusterJDBCURL")(__v.asInstanceOf[js.Any]))
      CopyCommand.foreach(__v => __obj.updateDynamic("CopyCommand")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      S3BackupUpdate.foreach(__v => __obj.updateDynamic("S3BackupUpdate")(__v.asInstanceOf[js.Any]))
      S3Update.foreach(__v => __obj.updateDynamic("S3Update")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftDestinationUpdate]
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
        DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds] = js.undefined
    ): RedshiftRetryOptions = {
      val __obj = js.Dynamic.literal()
      DurationInSeconds.foreach(__v => __obj.updateDynamic("DurationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftRetryOptions]
    }
  }

  object RedshiftS3BackupModeEnum {
    val Disabled = "Disabled"
    val Enabled  = "Enabled"

    val values = js.Object.freeze(js.Array(Disabled, Enabled))
  }

  object S3BackupModeEnum {
    val Disabled = "Disabled"
    val Enabled  = "Enabled"

    val values = js.Object.freeze(js.Array(Disabled, Enabled))
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
        Prefix: js.UndefOr[Prefix] = js.undefined
    ): S3DestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "RoleARN"   -> RoleARN.asInstanceOf[js.Any]
      )

      BufferingHints.foreach(__v => __obj.updateDynamic("BufferingHints")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      CompressionFormat.foreach(__v => __obj.updateDynamic("CompressionFormat")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      ErrorOutputPrefix.foreach(__v => __obj.updateDynamic("ErrorOutputPrefix")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationConfiguration]
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
        Prefix: js.UndefOr[Prefix] = js.undefined
    ): S3DestinationDescription = {
      val __obj = js.Dynamic.literal(
        "BucketARN"               -> BucketARN.asInstanceOf[js.Any],
        "BufferingHints"          -> BufferingHints.asInstanceOf[js.Any],
        "CompressionFormat"       -> CompressionFormat.asInstanceOf[js.Any],
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "RoleARN"                 -> RoleARN.asInstanceOf[js.Any]
      )

      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      ErrorOutputPrefix.foreach(__v => __obj.updateDynamic("ErrorOutputPrefix")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationDescription]
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
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): S3DestinationUpdate = {
      val __obj = js.Dynamic.literal()
      BucketARN.foreach(__v => __obj.updateDynamic("BucketARN")(__v.asInstanceOf[js.Any]))
      BufferingHints.foreach(__v => __obj.updateDynamic("BufferingHints")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      CompressionFormat.foreach(__v => __obj.updateDynamic("CompressionFormat")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      ErrorOutputPrefix.foreach(__v => __obj.updateDynamic("ErrorOutputPrefix")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationUpdate]
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
        VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
    ): SchemaConfiguration = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaConfiguration]
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
        ParquetSerDe: js.UndefOr[ParquetSerDe] = js.undefined
    ): Serializer = {
      val __obj = js.Dynamic.literal()
      OrcSerDe.foreach(__v => __obj.updateDynamic("OrcSerDe")(__v.asInstanceOf[js.Any]))
      ParquetSerDe.foreach(__v => __obj.updateDynamic("ParquetSerDe")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Serializer]
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
        KinesisStreamSourceDescription: js.UndefOr[KinesisStreamSourceDescription] = js.undefined
    ): SourceDescription = {
      val __obj = js.Dynamic.literal()
      KinesisStreamSourceDescription.foreach(
        __v => __obj.updateDynamic("KinesisStreamSourceDescription")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[SourceDescription]
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
        S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined
    ): SplunkDestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "HECEndpoint"     -> HECEndpoint.asInstanceOf[js.Any],
        "HECEndpointType" -> HECEndpointType.asInstanceOf[js.Any],
        "HECToken"        -> HECToken.asInstanceOf[js.Any],
        "S3Configuration" -> S3Configuration.asInstanceOf[js.Any]
      )

      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      HECAcknowledgmentTimeoutInSeconds.foreach(
        __v => __obj.updateDynamic("HECAcknowledgmentTimeoutInSeconds")(__v.asInstanceOf[js.Any])
      )
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SplunkDestinationConfiguration]
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
        S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined
    ): SplunkDestinationDescription = {
      val __obj = js.Dynamic.literal()
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      HECAcknowledgmentTimeoutInSeconds.foreach(
        __v => __obj.updateDynamic("HECAcknowledgmentTimeoutInSeconds")(__v.asInstanceOf[js.Any])
      )
      HECEndpoint.foreach(__v => __obj.updateDynamic("HECEndpoint")(__v.asInstanceOf[js.Any]))
      HECEndpointType.foreach(__v => __obj.updateDynamic("HECEndpointType")(__v.asInstanceOf[js.Any]))
      HECToken.foreach(__v => __obj.updateDynamic("HECToken")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      S3DestinationDescription.foreach(__v => __obj.updateDynamic("S3DestinationDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SplunkDestinationDescription]
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
        S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
    ): SplunkDestinationUpdate = {
      val __obj = js.Dynamic.literal()
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      HECAcknowledgmentTimeoutInSeconds.foreach(
        __v => __obj.updateDynamic("HECAcknowledgmentTimeoutInSeconds")(__v.asInstanceOf[js.Any])
      )
      HECEndpoint.foreach(__v => __obj.updateDynamic("HECEndpoint")(__v.asInstanceOf[js.Any]))
      HECEndpointType.foreach(__v => __obj.updateDynamic("HECEndpointType")(__v.asInstanceOf[js.Any]))
      HECToken.foreach(__v => __obj.updateDynamic("HECToken")(__v.asInstanceOf[js.Any]))
      ProcessingConfiguration.foreach(__v => __obj.updateDynamic("ProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      RetryOptions.foreach(__v => __obj.updateDynamic("RetryOptions")(__v.asInstanceOf[js.Any]))
      S3BackupMode.foreach(__v => __obj.updateDynamic("S3BackupMode")(__v.asInstanceOf[js.Any]))
      S3Update.foreach(__v => __obj.updateDynamic("S3Update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SplunkDestinationUpdate]
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
        DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds] = js.undefined
    ): SplunkRetryOptions = {
      val __obj = js.Dynamic.literal()
      DurationInSeconds.foreach(__v => __obj.updateDynamic("DurationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SplunkRetryOptions]
    }
  }

  object SplunkS3BackupModeEnum {
    val FailedEventsOnly = "FailedEventsOnly"
    val AllEvents        = "AllEvents"

    val values = js.Object.freeze(js.Array(FailedEventsOnly, AllEvents))
  }

  @js.native
  trait StartDeliveryStreamEncryptionInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
  }

  object StartDeliveryStreamEncryptionInput {
    def apply(
        DeliveryStreamName: DeliveryStreamName
    ): StartDeliveryStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartDeliveryStreamEncryptionInput]
    }
  }

  @js.native
  trait StartDeliveryStreamEncryptionOutput extends js.Object {}

  object StartDeliveryStreamEncryptionOutput {
    def apply(
        ): StartDeliveryStreamEncryptionOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartDeliveryStreamEncryptionOutput]
    }
  }

  @js.native
  trait StopDeliveryStreamEncryptionInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
  }

  object StopDeliveryStreamEncryptionInput {
    def apply(
        DeliveryStreamName: DeliveryStreamName
    ): StopDeliveryStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopDeliveryStreamEncryptionInput]
    }
  }

  @js.native
  trait StopDeliveryStreamEncryptionOutput extends js.Object {}

  object StopDeliveryStreamEncryptionOutput {
    def apply(
        ): StopDeliveryStreamEncryptionOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopDeliveryStreamEncryptionOutput]
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
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
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
        Tags: TagDeliveryStreamInputTagList
    ): TagDeliveryStreamInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "Tags"               -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagDeliveryStreamInput]
    }
  }

  @js.native
  trait TagDeliveryStreamOutput extends js.Object {}

  object TagDeliveryStreamOutput {
    def apply(
        ): TagDeliveryStreamOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagDeliveryStreamOutput]
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
        TagKeys: TagKeyList
    ): UntagDeliveryStreamInput = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamName" -> DeliveryStreamName.asInstanceOf[js.Any],
        "TagKeys"            -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagDeliveryStreamInput]
    }
  }

  @js.native
  trait UntagDeliveryStreamOutput extends js.Object {}

  object UntagDeliveryStreamOutput {
    def apply(
        ): UntagDeliveryStreamOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagDeliveryStreamOutput]
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
        SplunkDestinationUpdate: js.UndefOr[SplunkDestinationUpdate] = js.undefined
    ): UpdateDestinationInput = {
      val __obj = js.Dynamic.literal(
        "CurrentDeliveryStreamVersionId" -> CurrentDeliveryStreamVersionId.asInstanceOf[js.Any],
        "DeliveryStreamName"             -> DeliveryStreamName.asInstanceOf[js.Any],
        "DestinationId"                  -> DestinationId.asInstanceOf[js.Any]
      )

      ElasticsearchDestinationUpdate.foreach(
        __v => __obj.updateDynamic("ElasticsearchDestinationUpdate")(__v.asInstanceOf[js.Any])
      )
      ExtendedS3DestinationUpdate.foreach(
        __v => __obj.updateDynamic("ExtendedS3DestinationUpdate")(__v.asInstanceOf[js.Any])
      )
      RedshiftDestinationUpdate.foreach(
        __v => __obj.updateDynamic("RedshiftDestinationUpdate")(__v.asInstanceOf[js.Any])
      )
      S3DestinationUpdate.foreach(__v => __obj.updateDynamic("S3DestinationUpdate")(__v.asInstanceOf[js.Any]))
      SplunkDestinationUpdate.foreach(__v => __obj.updateDynamic("SplunkDestinationUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDestinationInput]
    }
  }

  @js.native
  trait UpdateDestinationOutput extends js.Object {}

  object UpdateDestinationOutput {
    def apply(
        ): UpdateDestinationOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDestinationOutput]
    }
  }
}
