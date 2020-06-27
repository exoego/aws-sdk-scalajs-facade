package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object firehose {
  type AWSKMSKeyARN                            = String
  type BlockSizeBytes                          = Int
  type BooleanObject                           = Boolean
  type BucketARN                               = String
  type ClusterJDBCURL                          = String
  type ColumnToJsonKeyMappings                 = js.Dictionary[NonEmptyString]
  type CopyOptions                             = String
  type Data                                    = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DataTableColumns                        = String
  type DataTableName                           = String
  type DeliveryStartTimestamp                  = js.Date
  type DeliveryStreamARN                       = String
  type DeliveryStreamName                      = String
  type DeliveryStreamNameList                  = js.Array[DeliveryStreamName]
  type DeliveryStreamVersionId                 = String
  type DescribeDeliveryStreamInputLimit        = Int
  type DestinationDescriptionList              = js.Array[DestinationDescription]
  type DestinationId                           = String
  type ElasticsearchBufferingIntervalInSeconds = Int
  type ElasticsearchBufferingSizeInMBs         = Int
  type ElasticsearchClusterEndpoint            = String
  type ElasticsearchDomainARN                  = String
  type ElasticsearchIndexName                  = String
  type ElasticsearchRetryDurationInSeconds     = Int
  type ElasticsearchTypeName                   = String
  type ErrorCode                               = String
  type ErrorMessage                            = String
  type ErrorOutputPrefix                       = String
  type HECAcknowledgmentTimeoutInSeconds       = Int
  type HECEndpoint                             = String
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
  type NonEmptyString                          = String
  type NonEmptyStringWithoutWhitespace         = String
  type NonNegativeIntegerObject                = Int
  type OrcRowIndexStride                       = Int
  type OrcStripeSizeBytes                      = Int
  type ParquetPageSizeBytes                    = Int
  type Password                                = String
  type Prefix                                  = String
  type ProcessorList                           = js.Array[Processor]
  type ProcessorParameterList                  = js.Array[ProcessorParameter]
  type ProcessorParameterValue                 = String
  type Proportion                              = Double
  type PutRecordBatchRequestEntryList          = js.Array[Record]
  type PutRecordBatchResponseEntryList         = js.Array[PutRecordBatchResponseEntry]
  type PutResponseRecordId                     = String
  type RedshiftRetryDurationInSeconds          = Int
  type RoleARN                                 = String
  type SizeInMBs                               = Int
  type SplunkRetryDurationInSeconds            = Int
  type TagDeliveryStreamInputTagList           = js.Array[Tag]
  type TagKey                                  = String
  type TagKeyList                              = js.Array[TagKey]
  type TagValue                                = String
  type Timestamp                               = js.Date
  type Username                                = String

  implicit final class FirehoseOps(private val service: Firehose) extends AnyVal {

    @inline def createDeliveryStreamFuture(params: CreateDeliveryStreamInput): Future[CreateDeliveryStreamOutput] =
      service.createDeliveryStream(params).promise().toFuture
    @inline def deleteDeliveryStreamFuture(params: DeleteDeliveryStreamInput): Future[DeleteDeliveryStreamOutput] =
      service.deleteDeliveryStream(params).promise().toFuture
    @inline def describeDeliveryStreamFuture(
        params: DescribeDeliveryStreamInput
    ): Future[DescribeDeliveryStreamOutput] = service.describeDeliveryStream(params).promise().toFuture
    @inline def listDeliveryStreamsFuture(params: ListDeliveryStreamsInput): Future[ListDeliveryStreamsOutput] =
      service.listDeliveryStreams(params).promise().toFuture
    @inline def listTagsForDeliveryStreamFuture(
        params: ListTagsForDeliveryStreamInput
    ): Future[ListTagsForDeliveryStreamOutput] = service.listTagsForDeliveryStream(params).promise().toFuture
    @inline def putRecordBatchFuture(params: PutRecordBatchInput): Future[PutRecordBatchOutput] =
      service.putRecordBatch(params).promise().toFuture
    @inline def putRecordFuture(params: PutRecordInput): Future[PutRecordOutput] =
      service.putRecord(params).promise().toFuture
    @inline def startDeliveryStreamEncryptionFuture(
        params: StartDeliveryStreamEncryptionInput
    ): Future[StartDeliveryStreamEncryptionOutput] = service.startDeliveryStreamEncryption(params).promise().toFuture
    @inline def stopDeliveryStreamEncryptionFuture(
        params: StopDeliveryStreamEncryptionInput
    ): Future[StopDeliveryStreamEncryptionOutput] = service.stopDeliveryStreamEncryption(params).promise().toFuture
    @inline def tagDeliveryStreamFuture(params: TagDeliveryStreamInput): Future[TagDeliveryStreamOutput] =
      service.tagDeliveryStream(params).promise().toFuture
    @inline def untagDeliveryStreamFuture(params: UntagDeliveryStreamInput): Future[UntagDeliveryStreamOutput] =
      service.untagDeliveryStream(params).promise().toFuture
    @inline def updateDestinationFuture(params: UpdateDestinationInput): Future[UpdateDestinationOutput] =
      service.updateDestination(params).promise().toFuture
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
    * Describes hints for the buffering to perform before delivering data to the destination. These options are treated as hints, and therefore Kinesis Data Firehose might choose to use different values when it is optimal. The <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if specify a value for one of them, you must also provide a value for the other.
    */
  @js.native
  @Factory
  trait BufferingHints extends js.Object {
    var IntervalInSeconds: js.UndefOr[IntervalInSeconds]
    var SizeInMBs: js.UndefOr[SizeInMBs]
  }

  /**
    * Describes the Amazon CloudWatch logging options for your delivery stream.
    */
  @js.native
  @Factory
  trait CloudWatchLoggingOptions extends js.Object {
    var Enabled: js.UndefOr[BooleanObject]
    var LogGroupName: js.UndefOr[LogGroupName]
    var LogStreamName: js.UndefOr[LogStreamName]
  }

  @js.native
  sealed trait CompressionFormat extends js.Any
  object CompressionFormat extends js.Object {
    val UNCOMPRESSED = "UNCOMPRESSED".asInstanceOf[CompressionFormat]
    val GZIP         = "GZIP".asInstanceOf[CompressionFormat]
    val ZIP          = "ZIP".asInstanceOf[CompressionFormat]
    val Snappy       = "Snappy".asInstanceOf[CompressionFormat]

    val values = js.Object.freeze(js.Array(UNCOMPRESSED, GZIP, ZIP, Snappy))
  }

  /**
    * Describes a <code>COPY</code> command for Amazon Redshift.
    */
  @js.native
  @Factory
  trait CopyCommand extends js.Object {
    var DataTableName: DataTableName
    var CopyOptions: js.UndefOr[CopyOptions]
    var DataTableColumns: js.UndefOr[DataTableColumns]
  }

  @js.native
  @Factory
  trait CreateDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[DeliveryStreamEncryptionConfigurationInput]
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType]
    var ElasticsearchDestinationConfiguration: js.UndefOr[ElasticsearchDestinationConfiguration]
    var ExtendedS3DestinationConfiguration: js.UndefOr[ExtendedS3DestinationConfiguration]
    var KinesisStreamSourceConfiguration: js.UndefOr[KinesisStreamSourceConfiguration]
    var RedshiftDestinationConfiguration: js.UndefOr[RedshiftDestinationConfiguration]
    var S3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration]
    var SplunkDestinationConfiguration: js.UndefOr[SplunkDestinationConfiguration]
    var Tags: js.UndefOr[TagDeliveryStreamInputTagList]
  }

  @js.native
  @Factory
  trait CreateDeliveryStreamOutput extends js.Object {
    var DeliveryStreamARN: js.UndefOr[DeliveryStreamARN]
  }

  /**
    * Specifies that you want Kinesis Data Firehose to convert data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. Kinesis Data Firehose uses the serializer and deserializer that you specify, in addition to the column information from the AWS Glue table, to deserialize your input data from JSON and then serialize it to the Parquet or ORC format. For more information, see [[https://docs.aws.amazon.com/firehose/latest/dev/record-format-conversion.html|Kinesis Data Firehose Record Format Conversion]].
    */
  @js.native
  @Factory
  trait DataFormatConversionConfiguration extends js.Object {
    var Enabled: js.UndefOr[BooleanObject]
    var InputFormatConfiguration: js.UndefOr[InputFormatConfiguration]
    var OutputFormatConfiguration: js.UndefOr[OutputFormatConfiguration]
    var SchemaConfiguration: js.UndefOr[SchemaConfiguration]
  }

  @js.native
  @Factory
  trait DeleteDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var AllowForceDelete: js.UndefOr[BooleanObject]
  }

  @js.native
  @Factory
  trait DeleteDeliveryStreamOutput extends js.Object {}

  /**
    * Contains information about a delivery stream.
    */
  @js.native
  @Factory
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
    var FailureDescription: js.UndefOr[FailureDescription]
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var Source: js.UndefOr[SourceDescription]
  }

  /**
    * Contains information about the server-side encryption (SSE) status for the delivery stream, the type customer master key (CMK) in use, if any, and the ARN of the CMK. You can get <code>DeliveryStreamEncryptionConfiguration</code> by invoking the <a>DescribeDeliveryStream</a> operation.
    */
  @js.native
  @Factory
  trait DeliveryStreamEncryptionConfiguration extends js.Object {
    var FailureDescription: js.UndefOr[FailureDescription]
    var KeyARN: js.UndefOr[AWSKMSKeyARN]
    var KeyType: js.UndefOr[KeyType]
    var Status: js.UndefOr[DeliveryStreamEncryptionStatus]
  }

  /**
    * Used to specify the type and Amazon Resource Name (ARN) of the CMK needed for Server-Side Encryption (SSE).
    */
  @js.native
  @Factory
  trait DeliveryStreamEncryptionConfigurationInput extends js.Object {
    var KeyType: KeyType
    var KeyARN: js.UndefOr[AWSKMSKeyARN]
  }

  @js.native
  sealed trait DeliveryStreamEncryptionStatus extends js.Any
  object DeliveryStreamEncryptionStatus extends js.Object {
    val ENABLED          = "ENABLED".asInstanceOf[DeliveryStreamEncryptionStatus]
    val ENABLING         = "ENABLING".asInstanceOf[DeliveryStreamEncryptionStatus]
    val ENABLING_FAILED  = "ENABLING_FAILED".asInstanceOf[DeliveryStreamEncryptionStatus]
    val DISABLED         = "DISABLED".asInstanceOf[DeliveryStreamEncryptionStatus]
    val DISABLING        = "DISABLING".asInstanceOf[DeliveryStreamEncryptionStatus]
    val DISABLING_FAILED = "DISABLING_FAILED".asInstanceOf[DeliveryStreamEncryptionStatus]

    val values = js.Object.freeze(js.Array(ENABLED, ENABLING, ENABLING_FAILED, DISABLED, DISABLING, DISABLING_FAILED))
  }

  @js.native
  sealed trait DeliveryStreamFailureType extends js.Any
  object DeliveryStreamFailureType extends js.Object {
    val RETIRE_KMS_GRANT_FAILED = "RETIRE_KMS_GRANT_FAILED".asInstanceOf[DeliveryStreamFailureType]
    val CREATE_KMS_GRANT_FAILED = "CREATE_KMS_GRANT_FAILED".asInstanceOf[DeliveryStreamFailureType]
    val KMS_ACCESS_DENIED       = "KMS_ACCESS_DENIED".asInstanceOf[DeliveryStreamFailureType]
    val DISABLED_KMS_KEY        = "DISABLED_KMS_KEY".asInstanceOf[DeliveryStreamFailureType]
    val INVALID_KMS_KEY         = "INVALID_KMS_KEY".asInstanceOf[DeliveryStreamFailureType]
    val KMS_KEY_NOT_FOUND       = "KMS_KEY_NOT_FOUND".asInstanceOf[DeliveryStreamFailureType]
    val KMS_OPT_IN_REQUIRED     = "KMS_OPT_IN_REQUIRED".asInstanceOf[DeliveryStreamFailureType]
    val UNKNOWN_ERROR           = "UNKNOWN_ERROR".asInstanceOf[DeliveryStreamFailureType]

    val values = js.Object.freeze(
      js.Array(
        RETIRE_KMS_GRANT_FAILED,
        CREATE_KMS_GRANT_FAILED,
        KMS_ACCESS_DENIED,
        DISABLED_KMS_KEY,
        INVALID_KMS_KEY,
        KMS_KEY_NOT_FOUND,
        KMS_OPT_IN_REQUIRED,
        UNKNOWN_ERROR
      )
    )
  }

  @js.native
  sealed trait DeliveryStreamStatus extends js.Any
  object DeliveryStreamStatus extends js.Object {
    val CREATING        = "CREATING".asInstanceOf[DeliveryStreamStatus]
    val CREATING_FAILED = "CREATING_FAILED".asInstanceOf[DeliveryStreamStatus]
    val DELETING        = "DELETING".asInstanceOf[DeliveryStreamStatus]
    val DELETING_FAILED = "DELETING_FAILED".asInstanceOf[DeliveryStreamStatus]
    val ACTIVE          = "ACTIVE".asInstanceOf[DeliveryStreamStatus]

    val values = js.Object.freeze(js.Array(CREATING, CREATING_FAILED, DELETING, DELETING_FAILED, ACTIVE))
  }

  @js.native
  sealed trait DeliveryStreamType extends js.Any
  object DeliveryStreamType extends js.Object {
    val DirectPut             = "DirectPut".asInstanceOf[DeliveryStreamType]
    val KinesisStreamAsSource = "KinesisStreamAsSource".asInstanceOf[DeliveryStreamType]

    val values = js.Object.freeze(js.Array(DirectPut, KinesisStreamAsSource))
  }

  @js.native
  @Factory
  trait DescribeDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var ExclusiveStartDestinationId: js.UndefOr[DestinationId]
    var Limit: js.UndefOr[DescribeDeliveryStreamInputLimit]
  }

  @js.native
  @Factory
  trait DescribeDeliveryStreamOutput extends js.Object {
    var DeliveryStreamDescription: DeliveryStreamDescription
  }

  /**
    * The deserializer you want Kinesis Data Firehose to use for converting the input data from JSON. Kinesis Data Firehose then serializes the data to its final format using the <a>Serializer</a>. Kinesis Data Firehose supports two types of deserializers: the [[https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL#LanguageManualDDL-JSON|Apache Hive JSON SerDe]] and the [[https://github.com/rcongiu/Hive-JSON-Serde|OpenX JSON SerDe]].
    */
  @js.native
  @Factory
  trait Deserializer extends js.Object {
    var HiveJsonSerDe: js.UndefOr[HiveJsonSerDe]
    var OpenXJsonSerDe: js.UndefOr[OpenXJsonSerDe]
  }

  /**
    * Describes the destination for a delivery stream.
    */
  @js.native
  @Factory
  trait DestinationDescription extends js.Object {
    var DestinationId: DestinationId
    var ElasticsearchDestinationDescription: js.UndefOr[ElasticsearchDestinationDescription]
    var ExtendedS3DestinationDescription: js.UndefOr[ExtendedS3DestinationDescription]
    var RedshiftDestinationDescription: js.UndefOr[RedshiftDestinationDescription]
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription]
    var SplunkDestinationDescription: js.UndefOr[SplunkDestinationDescription]
  }

  /**
    * Describes the buffering to perform before delivering data to the Amazon ES destination.
    */
  @js.native
  @Factory
  trait ElasticsearchBufferingHints extends js.Object {
    var IntervalInSeconds: js.UndefOr[ElasticsearchBufferingIntervalInSeconds]
    var SizeInMBs: js.UndefOr[ElasticsearchBufferingSizeInMBs]
  }

  /**
    * Describes the configuration of a destination in Amazon ES.
    */
  @js.native
  @Factory
  trait ElasticsearchDestinationConfiguration extends js.Object {
    var IndexName: ElasticsearchIndexName
    var RoleARN: RoleARN
    var S3Configuration: S3DestinationConfiguration
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint]
    var DomainARN: js.UndefOr[ElasticsearchDomainARN]
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions]
    var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode]
    var TypeName: js.UndefOr[ElasticsearchTypeName]
  }

  /**
    * The destination description in Amazon ES.
    */
  @js.native
  @Factory
  trait ElasticsearchDestinationDescription extends js.Object {
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint]
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

  /**
    * Describes an update for a destination in Amazon ES.
    */
  @js.native
  @Factory
  trait ElasticsearchDestinationUpdate extends js.Object {
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint]
    var DomainARN: js.UndefOr[ElasticsearchDomainARN]
    var IndexName: js.UndefOr[ElasticsearchIndexName]
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod]
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration]
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions]
    var RoleARN: js.UndefOr[RoleARN]
    var S3Update: js.UndefOr[S3DestinationUpdate]
    var TypeName: js.UndefOr[ElasticsearchTypeName]
  }

  @js.native
  sealed trait ElasticsearchIndexRotationPeriod extends js.Any
  object ElasticsearchIndexRotationPeriod extends js.Object {
    val NoRotation = "NoRotation".asInstanceOf[ElasticsearchIndexRotationPeriod]
    val OneHour    = "OneHour".asInstanceOf[ElasticsearchIndexRotationPeriod]
    val OneDay     = "OneDay".asInstanceOf[ElasticsearchIndexRotationPeriod]
    val OneWeek    = "OneWeek".asInstanceOf[ElasticsearchIndexRotationPeriod]
    val OneMonth   = "OneMonth".asInstanceOf[ElasticsearchIndexRotationPeriod]

    val values = js.Object.freeze(js.Array(NoRotation, OneHour, OneDay, OneWeek, OneMonth))
  }

  /**
    * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES.
    */
  @js.native
  @Factory
  trait ElasticsearchRetryOptions extends js.Object {
    var DurationInSeconds: js.UndefOr[ElasticsearchRetryDurationInSeconds]
  }

  @js.native
  sealed trait ElasticsearchS3BackupMode extends js.Any
  object ElasticsearchS3BackupMode extends js.Object {
    val FailedDocumentsOnly = "FailedDocumentsOnly".asInstanceOf[ElasticsearchS3BackupMode]
    val AllDocuments        = "AllDocuments".asInstanceOf[ElasticsearchS3BackupMode]

    val values = js.Object.freeze(js.Array(FailedDocumentsOnly, AllDocuments))
  }

  /**
    * Describes the encryption for a destination in Amazon S3.
    */
  @js.native
  @Factory
  trait EncryptionConfiguration extends js.Object {
    var KMSEncryptionConfig: js.UndefOr[KMSEncryptionConfig]
    var NoEncryptionConfig: js.UndefOr[NoEncryptionConfig]
  }

  /**
    * Describes the configuration of a destination in Amazon S3.
    */
  @js.native
  @Factory
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

  /**
    * Describes a destination in Amazon S3.
    */
  @js.native
  @Factory
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

  /**
    * Describes an update for a destination in Amazon S3.
    */
  @js.native
  @Factory
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

  /**
    * Provides details in case one of the following operations fails due to an error related to KMS: <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>, <a>StopDeliveryStreamEncryption</a>.
    */
  @js.native
  @Factory
  trait FailureDescription extends js.Object {
    var Details: NonEmptyString
    var Type: DeliveryStreamFailureType
  }

  @js.native
  sealed trait HECEndpointType extends js.Any
  object HECEndpointType extends js.Object {
    val Raw   = "Raw".asInstanceOf[HECEndpointType]
    val Event = "Event".asInstanceOf[HECEndpointType]

    val values = js.Object.freeze(js.Array(Raw, Event))
  }

  /**
    * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.
    */
  @js.native
  @Factory
  trait HiveJsonSerDe extends js.Object {
    var TimestampFormats: js.UndefOr[ListOfNonEmptyStrings]
  }

  /**
    * Specifies the deserializer you want to use to convert the format of the input data.
    */
  @js.native
  @Factory
  trait InputFormatConfiguration extends js.Object {
    var Deserializer: js.UndefOr[Deserializer]
  }

  /**
    * Describes an encryption key for a destination in Amazon S3.
    */
  @js.native
  @Factory
  trait KMSEncryptionConfig extends js.Object {
    var AWSKMSKeyARN: AWSKMSKeyARN
  }

  @js.native
  sealed trait KeyType extends js.Any
  object KeyType extends js.Object {
    val AWS_OWNED_CMK        = "AWS_OWNED_CMK".asInstanceOf[KeyType]
    val CUSTOMER_MANAGED_CMK = "CUSTOMER_MANAGED_CMK".asInstanceOf[KeyType]

    val values = js.Object.freeze(js.Array(AWS_OWNED_CMK, CUSTOMER_MANAGED_CMK))
  }

  /**
    * The stream and role Amazon Resource Names (ARNs) for a Kinesis data stream used as the source for a delivery stream.
    */
  @js.native
  @Factory
  trait KinesisStreamSourceConfiguration extends js.Object {
    var KinesisStreamARN: KinesisStreamARN
    var RoleARN: RoleARN
  }

  /**
    * Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.
    */
  @js.native
  @Factory
  trait KinesisStreamSourceDescription extends js.Object {
    var DeliveryStartTimestamp: js.UndefOr[DeliveryStartTimestamp]
    var KinesisStreamARN: js.UndefOr[KinesisStreamARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  @js.native
  @Factory
  trait ListDeliveryStreamsInput extends js.Object {
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType]
    var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName]
    var Limit: js.UndefOr[ListDeliveryStreamsInputLimit]
  }

  @js.native
  @Factory
  trait ListDeliveryStreamsOutput extends js.Object {
    var DeliveryStreamNames: DeliveryStreamNameList
    var HasMoreDeliveryStreams: BooleanObject
  }

  @js.native
  @Factory
  trait ListTagsForDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var ExclusiveStartTagKey: js.UndefOr[TagKey]
    var Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit]
  }

  @js.native
  @Factory
  trait ListTagsForDeliveryStreamOutput extends js.Object {
    var HasMoreTags: BooleanObject
    var Tags: ListTagsForDeliveryStreamOutputTagList
  }

  @js.native
  sealed trait NoEncryptionConfig extends js.Any
  object NoEncryptionConfig extends js.Object {
    val NoEncryption = "NoEncryption".asInstanceOf[NoEncryptionConfig]

    val values = js.Object.freeze(js.Array(NoEncryption))
  }

  /**
    * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.
    */
  @js.native
  @Factory
  trait OpenXJsonSerDe extends js.Object {
    var CaseInsensitive: js.UndefOr[BooleanObject]
    var ColumnToJsonKeyMappings: js.UndefOr[ColumnToJsonKeyMappings]
    var ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject]
  }

  @js.native
  sealed trait OrcCompression extends js.Any
  object OrcCompression extends js.Object {
    val NONE   = "NONE".asInstanceOf[OrcCompression]
    val ZLIB   = "ZLIB".asInstanceOf[OrcCompression]
    val SNAPPY = "SNAPPY".asInstanceOf[OrcCompression]

    val values = js.Object.freeze(js.Array(NONE, ZLIB, SNAPPY))
  }

  @js.native
  sealed trait OrcFormatVersion extends js.Any
  object OrcFormatVersion extends js.Object {
    val V0_11 = "V0_11".asInstanceOf[OrcFormatVersion]
    val V0_12 = "V0_12".asInstanceOf[OrcFormatVersion]

    val values = js.Object.freeze(js.Array(V0_11, V0_12))
  }

  /**
    * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see [[https://orc.apache.org/docs/|Apache ORC]].
    */
  @js.native
  @Factory
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

  /**
    * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data before it writes it to Amazon S3.
    */
  @js.native
  @Factory
  trait OutputFormatConfiguration extends js.Object {
    var Serializer: js.UndefOr[Serializer]
  }

  @js.native
  sealed trait ParquetCompression extends js.Any
  object ParquetCompression extends js.Object {
    val UNCOMPRESSED = "UNCOMPRESSED".asInstanceOf[ParquetCompression]
    val GZIP         = "GZIP".asInstanceOf[ParquetCompression]
    val SNAPPY       = "SNAPPY".asInstanceOf[ParquetCompression]

    val values = js.Object.freeze(js.Array(UNCOMPRESSED, GZIP, SNAPPY))
  }

  /**
    * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see [[https://parquet.apache.org/documentation/latest/|Apache Parquet]].
    */
  @js.native
  @Factory
  trait ParquetSerDe extends js.Object {
    var BlockSizeBytes: js.UndefOr[BlockSizeBytes]
    var Compression: js.UndefOr[ParquetCompression]
    var EnableDictionaryCompression: js.UndefOr[BooleanObject]
    var MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject]
    var PageSizeBytes: js.UndefOr[ParquetPageSizeBytes]
    var WriterVersion: js.UndefOr[ParquetWriterVersion]
  }

  @js.native
  sealed trait ParquetWriterVersion extends js.Any
  object ParquetWriterVersion extends js.Object {
    val V1 = "V1".asInstanceOf[ParquetWriterVersion]
    val V2 = "V2".asInstanceOf[ParquetWriterVersion]

    val values = js.Object.freeze(js.Array(V1, V2))
  }

  /**
    * Describes a data processing configuration.
    */
  @js.native
  @Factory
  trait ProcessingConfiguration extends js.Object {
    var Enabled: js.UndefOr[BooleanObject]
    var Processors: js.UndefOr[ProcessorList]
  }

  /**
    * Describes a data processor.
    */
  @js.native
  @Factory
  trait Processor extends js.Object {
    var Type: ProcessorType
    var Parameters: js.UndefOr[ProcessorParameterList]
  }

  /**
    * Describes the processor parameter.
    */
  @js.native
  @Factory
  trait ProcessorParameter extends js.Object {
    var ParameterName: ProcessorParameterName
    var ParameterValue: ProcessorParameterValue
  }

  @js.native
  sealed trait ProcessorParameterName extends js.Any
  object ProcessorParameterName extends js.Object {
    val LambdaArn               = "LambdaArn".asInstanceOf[ProcessorParameterName]
    val NumberOfRetries         = "NumberOfRetries".asInstanceOf[ProcessorParameterName]
    val RoleArn                 = "RoleArn".asInstanceOf[ProcessorParameterName]
    val BufferSizeInMBs         = "BufferSizeInMBs".asInstanceOf[ProcessorParameterName]
    val BufferIntervalInSeconds = "BufferIntervalInSeconds".asInstanceOf[ProcessorParameterName]

    val values =
      js.Object.freeze(js.Array(LambdaArn, NumberOfRetries, RoleArn, BufferSizeInMBs, BufferIntervalInSeconds))
  }

  @js.native
  sealed trait ProcessorType extends js.Any
  object ProcessorType extends js.Object {
    val Lambda = "Lambda".asInstanceOf[ProcessorType]

    val values = js.Object.freeze(js.Array(Lambda))
  }

  @js.native
  @Factory
  trait PutRecordBatchInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var Records: PutRecordBatchRequestEntryList
  }

  @js.native
  @Factory
  trait PutRecordBatchOutput extends js.Object {
    var FailedPutCount: NonNegativeIntegerObject
    var RequestResponses: PutRecordBatchResponseEntryList
    var Encrypted: js.UndefOr[BooleanObject]
  }

  /**
    * Contains the result for an individual record from a <a>PutRecordBatch</a> request. If the record is successfully added to your delivery stream, it receives a record ID. If the record fails to be added to your delivery stream, the result includes an error code and an error message.
    */
  @js.native
  @Factory
  trait PutRecordBatchResponseEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var RecordId: js.UndefOr[PutResponseRecordId]
  }

  @js.native
  @Factory
  trait PutRecordInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var Record: Record
  }

  @js.native
  @Factory
  trait PutRecordOutput extends js.Object {
    var RecordId: PutResponseRecordId
    var Encrypted: js.UndefOr[BooleanObject]
  }

  /**
    * The unit of data in a delivery stream.
    */
  @js.native
  @Factory
  trait Record extends js.Object {
    var Data: Data
  }

  /**
    * Describes the configuration of a destination in Amazon Redshift.
    */
  @js.native
  @Factory
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

  /**
    * Describes a destination in Amazon Redshift.
    */
  @js.native
  @Factory
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

  /**
    * Describes an update for a destination in Amazon Redshift.
    */
  @js.native
  @Factory
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

  /**
    * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift.
    */
  @js.native
  @Factory
  trait RedshiftRetryOptions extends js.Object {
    var DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds]
  }

  @js.native
  sealed trait RedshiftS3BackupMode extends js.Any
  object RedshiftS3BackupMode extends js.Object {
    val Disabled = "Disabled".asInstanceOf[RedshiftS3BackupMode]
    val Enabled  = "Enabled".asInstanceOf[RedshiftS3BackupMode]

    val values = js.Object.freeze(js.Array(Disabled, Enabled))
  }

  @js.native
  sealed trait S3BackupMode extends js.Any
  object S3BackupMode extends js.Object {
    val Disabled = "Disabled".asInstanceOf[S3BackupMode]
    val Enabled  = "Enabled".asInstanceOf[S3BackupMode]

    val values = js.Object.freeze(js.Array(Disabled, Enabled))
  }

  /**
    * Describes the configuration of a destination in Amazon S3.
    */
  @js.native
  @Factory
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

  /**
    * Describes a destination in Amazon S3.
    */
  @js.native
  @Factory
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

  /**
    * Describes an update for a destination in Amazon S3.
    */
  @js.native
  @Factory
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

  /**
    * Specifies the schema to which you want Kinesis Data Firehose to configure your data before it writes it to Amazon S3.
    */
  @js.native
  @Factory
  trait SchemaConfiguration extends js.Object {
    var CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var Region: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var TableName: js.UndefOr[NonEmptyStringWithoutWhitespace]
    var VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace]
  }

  /**
    * The serializer that you want Kinesis Data Firehose to use to convert data to the target format before writing it to Amazon S3. Kinesis Data Firehose supports two types of serializers: the [[https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/orc/OrcSerde.html|ORC SerDe]] and the [[https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/parquet/serde/ParquetHiveSerDe.html|Parquet SerDe]].
    */
  @js.native
  @Factory
  trait Serializer extends js.Object {
    var OrcSerDe: js.UndefOr[OrcSerDe]
    var ParquetSerDe: js.UndefOr[ParquetSerDe]
  }

  /**
    * Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.
    */
  @js.native
  @Factory
  trait SourceDescription extends js.Object {
    var KinesisStreamSourceDescription: js.UndefOr[KinesisStreamSourceDescription]
  }

  /**
    * Describes the configuration of a destination in Splunk.
    */
  @js.native
  @Factory
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

  /**
    * Describes a destination in Splunk.
    */
  @js.native
  @Factory
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

  /**
    * Describes an update for a destination in Splunk.
    */
  @js.native
  @Factory
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

  /**
    * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Splunk, or if it doesn't receive an acknowledgment from Splunk.
    */
  @js.native
  @Factory
  trait SplunkRetryOptions extends js.Object {
    var DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds]
  }

  @js.native
  sealed trait SplunkS3BackupMode extends js.Any
  object SplunkS3BackupMode extends js.Object {
    val FailedEventsOnly = "FailedEventsOnly".asInstanceOf[SplunkS3BackupMode]
    val AllEvents        = "AllEvents".asInstanceOf[SplunkS3BackupMode]

    val values = js.Object.freeze(js.Array(FailedEventsOnly, AllEvents))
  }

  @js.native
  @Factory
  trait StartDeliveryStreamEncryptionInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[DeliveryStreamEncryptionConfigurationInput]
  }

  @js.native
  @Factory
  trait StartDeliveryStreamEncryptionOutput extends js.Object {}

  @js.native
  @Factory
  trait StopDeliveryStreamEncryptionInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
  }

  @js.native
  @Factory
  trait StopDeliveryStreamEncryptionOutput extends js.Object {}

  /**
    * Metadata that you can assign to a delivery stream, consisting of a key-value pair.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var Tags: TagDeliveryStreamInputTagList
  }

  @js.native
  @Factory
  trait TagDeliveryStreamOutput extends js.Object {}

  @js.native
  @Factory
  trait UntagDeliveryStreamInput extends js.Object {
    var DeliveryStreamName: DeliveryStreamName
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagDeliveryStreamOutput extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateDestinationOutput extends js.Object {}
}
