package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object kinesisanalytics {
  type ApplicationCode                     = String
  type ApplicationDescription              = String
  type ApplicationName                     = String
  type ApplicationSummaries                = js.Array[ApplicationSummary]
  type ApplicationVersionId                = Double
  type BooleanObject                       = Boolean
  type BucketARN                           = String
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates      = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions            = js.Array[CloudWatchLoggingOption]
  type FileKey                             = String
  type Id                                  = String
  type InAppStreamName                     = String
  type InAppStreamNames                    = js.Array[InAppStreamName]
  type InAppTableName                      = String
  type InputConfigurations                 = js.Array[InputConfiguration]
  type InputDescriptions                   = js.Array[InputDescription]
  type InputParallelismCount               = Int
  type InputUpdates                        = js.Array[InputUpdate]
  type Inputs                              = js.Array[Input]
  type KinesisAnalyticsARN                 = String
  type ListApplicationsInputLimit          = Int
  type LogStreamARN                        = String
  type OutputDescriptions                  = js.Array[OutputDescription]
  type OutputUpdates                       = js.Array[OutputUpdate]
  type Outputs                             = js.Array[Output]
  type ParsedInputRecord                   = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField              = String
  type ParsedInputRecords                  = js.Array[ParsedInputRecord]
  type ProcessedInputRecord                = String
  type ProcessedInputRecords               = js.Array[ProcessedInputRecord]
  type RawInputRecord                      = String
  type RawInputRecords                     = js.Array[RawInputRecord]
  type RecordColumnDelimiter               = String
  type RecordColumnMapping                 = String
  type RecordColumnName                    = String
  type RecordColumnSqlType                 = String
  type RecordColumns                       = js.Array[RecordColumn]
  type RecordEncoding                      = String
  type RecordRowDelimiter                  = String
  type RecordRowPath                       = String
  type ReferenceDataSourceDescriptions     = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates          = js.Array[ReferenceDataSourceUpdate]
  type ResourceARN                         = String
  type RoleARN                             = String
  type TagKey                              = String
  type TagKeys                             = js.Array[TagKey]
  type TagValue                            = String
  type Tags                                = js.Array[Tag]
  type Timestamp                           = js.Date

  implicit final class KinesisAnalyticsOps(private val service: KinesisAnalytics) extends AnyVal {

    @inline def addApplicationCloudWatchLoggingOptionFuture(
        params: AddApplicationCloudWatchLoggingOptionRequest
    ): Future[AddApplicationCloudWatchLoggingOptionResponse] =
      service.addApplicationCloudWatchLoggingOption(params).promise().toFuture
    @inline def addApplicationInputFuture(params: AddApplicationInputRequest): Future[AddApplicationInputResponse] =
      service.addApplicationInput(params).promise().toFuture
    @inline def addApplicationInputProcessingConfigurationFuture(
        params: AddApplicationInputProcessingConfigurationRequest
    ): Future[AddApplicationInputProcessingConfigurationResponse] =
      service.addApplicationInputProcessingConfiguration(params).promise().toFuture
    @inline def addApplicationOutputFuture(params: AddApplicationOutputRequest): Future[AddApplicationOutputResponse] =
      service.addApplicationOutput(params).promise().toFuture
    @inline def addApplicationReferenceDataSourceFuture(
        params: AddApplicationReferenceDataSourceRequest
    ): Future[AddApplicationReferenceDataSourceResponse] =
      service.addApplicationReferenceDataSource(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] =
      service.createApplication(params).promise().toFuture
    @inline def deleteApplicationCloudWatchLoggingOptionFuture(
        params: DeleteApplicationCloudWatchLoggingOptionRequest
    ): Future[DeleteApplicationCloudWatchLoggingOptionResponse] =
      service.deleteApplicationCloudWatchLoggingOption(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] =
      service.deleteApplication(params).promise().toFuture
    @inline def deleteApplicationInputProcessingConfigurationFuture(
        params: DeleteApplicationInputProcessingConfigurationRequest
    ): Future[DeleteApplicationInputProcessingConfigurationResponse] =
      service.deleteApplicationInputProcessingConfiguration(params).promise().toFuture
    @inline def deleteApplicationOutputFuture(
        params: DeleteApplicationOutputRequest
    ): Future[DeleteApplicationOutputResponse] = service.deleteApplicationOutput(params).promise().toFuture
    @inline def deleteApplicationReferenceDataSourceFuture(
        params: DeleteApplicationReferenceDataSourceRequest
    ): Future[DeleteApplicationReferenceDataSourceResponse] =
      service.deleteApplicationReferenceDataSource(params).promise().toFuture
    @inline def describeApplicationFuture(params: DescribeApplicationRequest): Future[DescribeApplicationResponse] =
      service.describeApplication(params).promise().toFuture
    @inline def discoverInputSchemaFuture(params: DiscoverInputSchemaRequest): Future[DiscoverInputSchemaResponse] =
      service.discoverInputSchema(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] =
      service.listApplications(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def startApplicationFuture(params: StartApplicationRequest): Future[StartApplicationResponse] =
      service.startApplication(params).promise().toFuture
    @inline def stopApplicationFuture(params: StopApplicationRequest): Future[StopApplicationResponse] =
      service.stopApplication(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] =
      service.updateApplication(params).promise().toFuture
  }
}

package kinesisanalytics {
  @js.native
  @JSImport("aws-sdk", "KinesisAnalytics")
  class KinesisAnalytics() extends js.Object {
    def this(config: AWSConfig) = this()

    def addApplicationCloudWatchLoggingOption(
        params: AddApplicationCloudWatchLoggingOptionRequest
    ): Request[AddApplicationCloudWatchLoggingOptionResponse]                                         = js.native
    def addApplicationInput(params: AddApplicationInputRequest): Request[AddApplicationInputResponse] = js.native
    def addApplicationInputProcessingConfiguration(
        params: AddApplicationInputProcessingConfigurationRequest
    ): Request[AddApplicationInputProcessingConfigurationResponse]                                       = js.native
    def addApplicationOutput(params: AddApplicationOutputRequest): Request[AddApplicationOutputResponse] = js.native
    def addApplicationReferenceDataSource(
        params: AddApplicationReferenceDataSourceRequest
    ): Request[AddApplicationReferenceDataSourceResponse]                                       = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def deleteApplicationCloudWatchLoggingOption(
        params: DeleteApplicationCloudWatchLoggingOptionRequest
    ): Request[DeleteApplicationCloudWatchLoggingOptionResponse] = js.native
    def deleteApplicationInputProcessingConfiguration(
        params: DeleteApplicationInputProcessingConfigurationRequest
    ): Request[DeleteApplicationInputProcessingConfigurationResponse] = js.native
    def deleteApplicationOutput(params: DeleteApplicationOutputRequest): Request[DeleteApplicationOutputResponse] =
      js.native
    def deleteApplicationReferenceDataSource(
        params: DeleteApplicationReferenceDataSourceRequest
    ): Request[DeleteApplicationReferenceDataSourceResponse]                                          = js.native
    def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse] = js.native
    def discoverInputSchema(params: DiscoverInputSchemaRequest): Request[DiscoverInputSchemaResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse]          = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse]          = js.native
    def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse]             = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse]       = js.native
  }

  @js.native
  @Factory
  trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CloudWatchLoggingOption: CloudWatchLoggingOption
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  @js.native
  @Factory
  trait AddApplicationCloudWatchLoggingOptionResponse extends js.Object {}

  @js.native
  @Factory
  trait AddApplicationInputProcessingConfigurationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var InputId: Id
    var InputProcessingConfiguration: InputProcessingConfiguration
  }

  @js.native
  @Factory
  trait AddApplicationInputProcessingConfigurationResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddApplicationInputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var Input: Input
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddApplicationInputResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddApplicationOutputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var Output: Output
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddApplicationOutputResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddApplicationReferenceDataSourceRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ReferenceDataSource: ReferenceDataSource
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddApplicationReferenceDataSourceResponse extends js.Object {}

  /**
    * '''Note:'''This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see [[/kinesisanalytics/latest/apiv2/Welcome.html|Amazon Kinesis Data Analytics API V2 Documentation]].
    * Provides a description of the application, including the application Amazon Resource Name (ARN), status, latest version, and input and output configuration.
    */
  @js.native
  @Factory
  trait ApplicationDetail extends js.Object {
    var ApplicationARN: ResourceARN
    var ApplicationName: ApplicationName
    var ApplicationStatus: ApplicationStatus
    var ApplicationVersionId: ApplicationVersionId
    var ApplicationCode: js.UndefOr[ApplicationCode]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions]
    var CreateTimestamp: js.UndefOr[Timestamp]
    var InputDescriptions: js.UndefOr[InputDescriptions]
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var OutputDescriptions: js.UndefOr[OutputDescriptions]
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions]
  }

  @js.native
  sealed trait ApplicationStatus extends js.Any
  object ApplicationStatus extends js.Object {
    val DELETING = "DELETING".asInstanceOf[ApplicationStatus]
    val STARTING = "STARTING".asInstanceOf[ApplicationStatus]
    val STOPPING = "STOPPING".asInstanceOf[ApplicationStatus]
    val READY    = "READY".asInstanceOf[ApplicationStatus]
    val RUNNING  = "RUNNING".asInstanceOf[ApplicationStatus]
    val UPDATING = "UPDATING".asInstanceOf[ApplicationStatus]

    val values = js.Object.freeze(js.Array(DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING))
  }

  /**
    * '''Note:'''This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see [[/kinesisanalytics/latest/apiv2/Welcome.html|Amazon Kinesis Data Analytics API V2 Documentation]].
    * Provides application summary information, including the application Amazon Resource Name (ARN), name, and status.
    */
  @js.native
  @Factory
  trait ApplicationSummary extends js.Object {
    var ApplicationARN: ResourceARN
    var ApplicationName: ApplicationName
    var ApplicationStatus: ApplicationStatus
  }

  /**
    * Describes updates to apply to an existing Amazon Kinesis Analytics application.
    */
  @js.native
  @Factory
  trait ApplicationUpdate extends js.Object {
    var ApplicationCodeUpdate: js.UndefOr[ApplicationCode]
    var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates]
    var InputUpdates: js.UndefOr[InputUpdates]
    var OutputUpdates: js.UndefOr[OutputUpdates]
    var ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates]
  }

  /**
    * Provides additional mapping information when the record format uses delimiters, such as CSV. For example, the following sample records use CSV format, where the records use the <i>'n'</i> as the row delimiter and a comma (",") as the column delimiter:
    *  <code>"name1", "address1"</code>
    *  <code>"name2", "address2"</code>
    */
  @js.native
  @Factory
  trait CSVMappingParameters extends js.Object {
    var RecordColumnDelimiter: RecordColumnDelimiter
    var RecordRowDelimiter: RecordRowDelimiter
  }

  /**
    * Provides a description of CloudWatch logging options, including the log stream Amazon Resource Name (ARN) and the role ARN.
    */
  @js.native
  @Factory
  trait CloudWatchLoggingOption extends js.Object {
    var LogStreamARN: LogStreamARN
    var RoleARN: RoleARN
  }

  /**
    * Description of the CloudWatch logging option.
    */
  @js.native
  @Factory
  trait CloudWatchLoggingOptionDescription extends js.Object {
    var LogStreamARN: LogStreamARN
    var RoleARN: RoleARN
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
  }

  /**
    * Describes CloudWatch logging option updates.
    */
  @js.native
  @Factory
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    var CloudWatchLoggingOptionId: Id
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  /**
    * TBD
    */
  @js.native
  @Factory
  trait CreateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var ApplicationCode: js.UndefOr[ApplicationCode]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var Inputs: js.UndefOr[Inputs]
    var Outputs: js.UndefOr[Outputs]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * TBD
    */
  @js.native
  @Factory
  trait CreateApplicationResponse extends js.Object {
    var ApplicationSummary: ApplicationSummary
  }

  @js.native
  @Factory
  trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CloudWatchLoggingOptionId: Id
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  @js.native
  @Factory
  trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteApplicationInputProcessingConfigurationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var InputId: Id
  }

  @js.native
  @Factory
  trait DeleteApplicationInputProcessingConfigurationResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteApplicationOutputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var OutputId: Id
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteApplicationOutputResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteApplicationReferenceDataSourceRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ReferenceId: Id
  }

  @js.native
  @Factory
  trait DeleteApplicationReferenceDataSourceResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CreateTimestamp: Timestamp
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteApplicationResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  /**
    * Describes the data format when records are written to the destination. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html|Configuring Application Output]].
    */
  @js.native
  @Factory
  trait DestinationSchema extends js.Object {
    var RecordFormatType: RecordFormatType
  }

  @js.native
  @Factory
  trait DiscoverInputSchemaRequest extends js.Object {
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
    var S3Configuration: js.UndefOr[S3Configuration]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DiscoverInputSchemaResponse extends js.Object {
    var InputSchema: js.UndefOr[SourceSchema]
    var ParsedInputRecords: js.UndefOr[ParsedInputRecords]
    var ProcessedInputRecords: js.UndefOr[ProcessedInputRecords]
    var RawInputRecords: js.UndefOr[RawInputRecords]
  }

  /**
    * When you configure the application input, you specify the streaming source, the in-application stream name that is created, and the mapping between the two. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html|Configuring Application Input]].
    */
  @js.native
  @Factory
  trait Input extends js.Object {
    var InputSchema: SourceSchema
    var NamePrefix: InAppStreamName
    var InputParallelism: js.UndefOr[InputParallelism]
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput]
    var KinesisStreamsInput: js.UndefOr[KinesisStreamsInput]
  }

  /**
    * When you start your application, you provide this configuration, which identifies the input source and the point in the input source at which you want the application to start processing records.
    */
  @js.native
  @Factory
  trait InputConfiguration extends js.Object {
    var Id: Id
    var InputStartingPositionConfiguration: InputStartingPositionConfiguration
  }

  /**
    * Describes the application input configuration. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html|Configuring Application Input]].
    */
  @js.native
  @Factory
  trait InputDescription extends js.Object {
    var InAppStreamNames: js.UndefOr[InAppStreamNames]
    var InputId: js.UndefOr[Id]
    var InputParallelism: js.UndefOr[InputParallelism]
    var InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription]
    var InputSchema: js.UndefOr[SourceSchema]
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
    var KinesisFirehoseInputDescription: js.UndefOr[KinesisFirehoseInputDescription]
    var KinesisStreamsInputDescription: js.UndefOr[KinesisStreamsInputDescription]
    var NamePrefix: js.UndefOr[InAppStreamName]
  }

  /**
    * An object that contains the Amazon Resource Name (ARN) of the [[https://docs.aws.amazon.com/lambda/|AWS Lambda]] function that is used to preprocess records in the stream, and the ARN of the IAM role that is used to access the AWS Lambda function.
    */
  @js.native
  @Factory
  trait InputLambdaProcessor extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  /**
    * An object that contains the Amazon Resource Name (ARN) of the [[https://docs.aws.amazon.com/lambda/|AWS Lambda]] function that is used to preprocess records in the stream, and the ARN of the IAM role that is used to access the AWS Lambda expression.
    */
  @js.native
  @Factory
  trait InputLambdaProcessorDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * Represents an update to the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html|InputLambdaProcessor]] that is used to preprocess the records in the stream.
    */
  @js.native
  @Factory
  trait InputLambdaProcessorUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  /**
    * Describes the number of in-application streams to create for a given streaming source. For information about parallelism, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html|Configuring Application Input]].
    */
  @js.native
  @Factory
  trait InputParallelism extends js.Object {
    var Count: js.UndefOr[InputParallelismCount]
  }

  /**
    * Provides updates to the parallelism count.
    */
  @js.native
  @Factory
  trait InputParallelismUpdate extends js.Object {
    var CountUpdate: js.UndefOr[InputParallelismCount]
  }

  /**
    * Provides a description of a processor that is used to preprocess the records in the stream before being processed by your application code. Currently, the only input processor available is [[https://docs.aws.amazon.com/lambda/|AWS Lambda]].
    */
  @js.native
  @Factory
  trait InputProcessingConfiguration extends js.Object {
    var InputLambdaProcessor: InputLambdaProcessor
  }

  /**
    * Provides configuration information about an input processor. Currently, the only input processor available is [[https://docs.aws.amazon.com/lambda/|AWS Lambda]].
    */
  @js.native
  @Factory
  trait InputProcessingConfigurationDescription extends js.Object {
    var InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription]
  }

  /**
    * Describes updates to an [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputProcessingConfiguration.html|InputProcessingConfiguration]].
    */
  @js.native
  @Factory
  trait InputProcessingConfigurationUpdate extends js.Object {
    var InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
  }

  /**
    * Describes updates for the application's input schema.
    */
  @js.native
  @Factory
  trait InputSchemaUpdate extends js.Object {
    var RecordColumnUpdates: js.UndefOr[RecordColumns]
    var RecordEncodingUpdate: js.UndefOr[RecordEncoding]
    var RecordFormatUpdate: js.UndefOr[RecordFormat]
  }

  @js.native
  sealed trait InputStartingPosition extends js.Any
  object InputStartingPosition extends js.Object {
    val NOW                = "NOW".asInstanceOf[InputStartingPosition]
    val TRIM_HORIZON       = "TRIM_HORIZON".asInstanceOf[InputStartingPosition]
    val LAST_STOPPED_POINT = "LAST_STOPPED_POINT".asInstanceOf[InputStartingPosition]

    val values = js.Object.freeze(js.Array(NOW, TRIM_HORIZON, LAST_STOPPED_POINT))
  }

  /**
    * Describes the point at which the application reads from the streaming source.
    */
  @js.native
  @Factory
  trait InputStartingPositionConfiguration extends js.Object {
    var InputStartingPosition: js.UndefOr[InputStartingPosition]
  }

  /**
    * Describes updates to a specific input configuration (identified by the <code>InputId</code> of an application).
    */
  @js.native
  @Factory
  trait InputUpdate extends js.Object {
    var InputId: Id
    var InputParallelismUpdate: js.UndefOr[InputParallelismUpdate]
    var InputProcessingConfigurationUpdate: js.UndefOr[InputProcessingConfigurationUpdate]
    var InputSchemaUpdate: js.UndefOr[InputSchemaUpdate]
    var KinesisFirehoseInputUpdate: js.UndefOr[KinesisFirehoseInputUpdate]
    var KinesisStreamsInputUpdate: js.UndefOr[KinesisStreamsInputUpdate]
    var NamePrefixUpdate: js.UndefOr[InAppStreamName]
  }

  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  @js.native
  @Factory
  trait JSONMappingParameters extends js.Object {
    var RecordRowPath: RecordRowPath
  }

  /**
    * Identifies an Amazon Kinesis Firehose delivery stream as the streaming source. You provide the delivery stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  @js.native
  @Factory
  trait KinesisFirehoseInput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  /**
    * Describes the Amazon Kinesis Firehose delivery stream that is configured as the streaming source in the application input configuration.
    */
  @js.native
  @Factory
  trait KinesisFirehoseInputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * When updating application input configuration, provides information about an Amazon Kinesis Firehose delivery stream as the streaming source.
    */
  @js.native
  @Factory
  trait KinesisFirehoseInputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  /**
    * When configuring application output, identifies an Amazon Kinesis Firehose delivery stream as the destination. You provide the stream Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to write to the stream on your behalf.
    */
  @js.native
  @Factory
  trait KinesisFirehoseOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  /**
    * For an application output, describes the Amazon Kinesis Firehose delivery stream configured as its destination.
    */
  @js.native
  @Factory
  trait KinesisFirehoseOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * When updating an output configuration using the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html|UpdateApplication]] operation, provides information about an Amazon Kinesis Firehose delivery stream configured as the destination.
    */
  @js.native
  @Factory
  trait KinesisFirehoseOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  /**
    * Identifies an Amazon Kinesis stream as the streaming source. You provide the stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  @js.native
  @Factory
  trait KinesisStreamsInput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  /**
    * Describes the Amazon Kinesis stream that is configured as the streaming source in the application input configuration.
    */
  @js.native
  @Factory
  trait KinesisStreamsInputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * When updating application input configuration, provides information about an Amazon Kinesis stream as the streaming source.
    */
  @js.native
  @Factory
  trait KinesisStreamsInputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  /**
    * When configuring application output, identifies an Amazon Kinesis stream as the destination. You provide the stream Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis Analytics can use to write to the stream on your behalf.
    */
  @js.native
  @Factory
  trait KinesisStreamsOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  /**
    * For an application output, describes the Amazon Kinesis stream configured as its destination.
    */
  @js.native
  @Factory
  trait KinesisStreamsOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * When updating an output configuration using the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html|UpdateApplication]] operation, provides information about an Amazon Kinesis stream configured as the destination.
    */
  @js.native
  @Factory
  trait KinesisStreamsOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  /**
    * When configuring application output, identifies an AWS Lambda function as the destination. You provide the function Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis Analytics can use to write to the function on your behalf.
    */
  @js.native
  @Factory
  trait LambdaOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  /**
    * For an application output, describes the AWS Lambda function configured as its destination.
    */
  @js.native
  @Factory
  trait LambdaOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  /**
    * When updating an output configuration using the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html|UpdateApplication]] operation, provides information about an AWS Lambda function configured as the destination.
    */
  @js.native
  @Factory
  trait LambdaOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListApplicationsRequest extends js.Object {
    var ExclusiveStartApplicationName: js.UndefOr[ApplicationName]
    var Limit: js.UndefOr[ListApplicationsInputLimit]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListApplicationsResponse extends js.Object {
    var ApplicationSummaries: ApplicationSummaries
    var HasMoreApplications: BooleanObject
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  /**
    * When configuring application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  @js.native
  @Factory
  trait MappingParameters extends js.Object {
    var CSVMappingParameters: js.UndefOr[CSVMappingParameters]
    var JSONMappingParameters: js.UndefOr[JSONMappingParameters]
  }

  /**
    * Describes application output configuration in which you identify an in-application stream and a destination where you want the in-application stream data to be written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream.
    *  <p/> For limits on how many destinations an application can write and other limitations, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html|Limits]].
    */
  @js.native
  @Factory
  trait Output extends js.Object {
    var DestinationSchema: DestinationSchema
    var Name: InAppStreamName
    var KinesisFirehoseOutput: js.UndefOr[KinesisFirehoseOutput]
    var KinesisStreamsOutput: js.UndefOr[KinesisStreamsOutput]
    var LambdaOutput: js.UndefOr[LambdaOutput]
  }

  /**
    * Describes the application output configuration, which includes the in-application stream name and the destination where the stream data is written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream.
    */
  @js.native
  @Factory
  trait OutputDescription extends js.Object {
    var DestinationSchema: js.UndefOr[DestinationSchema]
    var KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription]
    var KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription]
    var LambdaOutputDescription: js.UndefOr[LambdaOutputDescription]
    var Name: js.UndefOr[InAppStreamName]
    var OutputId: js.UndefOr[Id]
  }

  /**
    * Describes updates to the output configuration identified by the <code>OutputId</code>.
    */
  @js.native
  @Factory
  trait OutputUpdate extends js.Object {
    var OutputId: Id
    var DestinationSchemaUpdate: js.UndefOr[DestinationSchema]
    var KinesisFirehoseOutputUpdate: js.UndefOr[KinesisFirehoseOutputUpdate]
    var KinesisStreamsOutputUpdate: js.UndefOr[KinesisStreamsOutputUpdate]
    var LambdaOutputUpdate: js.UndefOr[LambdaOutputUpdate]
    var NameUpdate: js.UndefOr[InAppStreamName]
  }

  /**
    * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
    *  Also used to describe the format of the reference data source.
    */
  @js.native
  @Factory
  trait RecordColumn extends js.Object {
    var Name: RecordColumnName
    var SqlType: RecordColumnSqlType
    var Mapping: js.UndefOr[RecordColumnMapping]
  }

  /**
    * Describes the record format and relevant mapping information that should be applied to schematize the records on the stream.
    */
  @js.native
  @Factory
  trait RecordFormat extends js.Object {
    var RecordFormatType: RecordFormatType
    var MappingParameters: js.UndefOr[MappingParameters]
  }

  @js.native
  sealed trait RecordFormatType extends js.Any
  object RecordFormatType extends js.Object {
    val JSON = "JSON".asInstanceOf[RecordFormatType]
    val CSV  = "CSV".asInstanceOf[RecordFormatType]

    val values = js.Object.freeze(js.Array(JSON, CSV))
  }

  /**
    * Describes the reference data source by providing the source information (S3 bucket name and object key name), the resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon S3 object to the in-application table.
    */
  @js.native
  @Factory
  trait ReferenceDataSource extends js.Object {
    var ReferenceSchema: SourceSchema
    var TableName: InAppTableName
    var S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource]
  }

  /**
    * Describes the reference data source configured for an application.
    */
  @js.native
  @Factory
  trait ReferenceDataSourceDescription extends js.Object {
    var ReferenceId: Id
    var S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription
    var TableName: InAppTableName
    var ReferenceSchema: js.UndefOr[SourceSchema]
  }

  /**
    * When you update a reference data source configuration for an application, this object provides all the updated values (such as the source bucket name and object key name), the in-application table name that is created, and updated mapping information that maps the data in the Amazon S3 object to the in-application reference table that is created.
    */
  @js.native
  @Factory
  trait ReferenceDataSourceUpdate extends js.Object {
    var ReferenceId: Id
    var ReferenceSchemaUpdate: js.UndefOr[SourceSchema]
    var S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate]
    var TableNameUpdate: js.UndefOr[InAppTableName]
  }

  /**
    * Provides a description of an Amazon S3 data source, including the Amazon Resource Name (ARN) of the S3 bucket, the ARN of the IAM role that is used to access the bucket, and the name of the Amazon S3 object that contains the data.
    */
  @js.native
  @Factory
  trait S3Configuration extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var RoleARN: RoleARN
  }

  /**
    * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your behalf.
    *  An Amazon Kinesis Analytics application loads reference data only once. If the data changes, you call the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html|UpdateApplication]] operation to trigger reloading of data into your application.
    */
  @js.native
  @Factory
  trait S3ReferenceDataSource extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ReferenceRoleARN: RoleARN
  }

  /**
    * Provides the bucket name and object key name that stores the reference data.
    */
  @js.native
  @Factory
  trait S3ReferenceDataSourceDescription extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ReferenceRoleARN: RoleARN
  }

  /**
    * Describes the S3 bucket name, object key name, and IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
    */
  @js.native
  @Factory
  trait S3ReferenceDataSourceUpdate extends js.Object {
    var BucketARNUpdate: js.UndefOr[BucketARN]
    var FileKeyUpdate: js.UndefOr[FileKey]
    var ReferenceRoleARNUpdate: js.UndefOr[RoleARN]
  }

  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  @js.native
  @Factory
  trait SourceSchema extends js.Object {
    var RecordColumns: RecordColumns
    var RecordFormat: RecordFormat
    var RecordEncoding: js.UndefOr[RecordEncoding]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StartApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var InputConfigurations: InputConfigurations
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StartApplicationResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StopApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StopApplicationResponse extends js.Object {}

  /**
    * A key-value pair (the value is optional) that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-tagging.html|Using Tagging]].
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
    var Tags: Tags
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var ApplicationUpdate: ApplicationUpdate
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  @js.native
  @Factory
  trait UpdateApplicationResponse extends js.Object {}
}
