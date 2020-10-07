package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object kinesisanalytics {
  type ApplicationCode = String
  type ApplicationDescription = String
  type ApplicationName = String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type ApplicationVersionId = Double
  type BooleanObject = Boolean
  type BucketARN = String
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]
  type FileKey = String
  type Id = String
  type InAppStreamName = String
  type InAppStreamNames = js.Array[InAppStreamName]
  type InAppTableName = String
  type InputConfigurations = js.Array[InputConfiguration]
  type InputDescriptions = js.Array[InputDescription]
  type InputParallelismCount = Int
  type InputUpdates = js.Array[InputUpdate]
  type Inputs = js.Array[Input]
  type KinesisAnalyticsARN = String
  type ListApplicationsInputLimit = Int
  type LogStreamARN = String
  type OutputDescriptions = js.Array[OutputDescription]
  type OutputUpdates = js.Array[OutputUpdate]
  type Outputs = js.Array[Output]
  type ParsedInputRecord = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField = String
  type ParsedInputRecords = js.Array[ParsedInputRecord]
  type ProcessedInputRecord = String
  type ProcessedInputRecords = js.Array[ProcessedInputRecord]
  type RawInputRecord = String
  type RawInputRecords = js.Array[RawInputRecord]
  type RecordColumnDelimiter = String
  type RecordColumnMapping = String
  type RecordColumnName = String
  type RecordColumnSqlType = String
  type RecordColumns = js.Array[RecordColumn]
  type RecordEncoding = String
  type RecordRowDelimiter = String
  type RecordRowPath = String
  type ReferenceDataSourceDescriptions = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[ReferenceDataSourceUpdate]
  type ResourceARN = String
  type RoleARN = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type Timestamp = js.Date

  implicit final class KinesisAnalyticsOps(private val service: KinesisAnalytics) extends AnyVal {

    @inline def addApplicationCloudWatchLoggingOptionFuture(params: AddApplicationCloudWatchLoggingOptionRequest): Future[AddApplicationCloudWatchLoggingOptionResponse] = service.addApplicationCloudWatchLoggingOption(params).promise().toFuture
    @inline def addApplicationInputFuture(params: AddApplicationInputRequest): Future[AddApplicationInputResponse] = service.addApplicationInput(params).promise().toFuture
    @inline def addApplicationInputProcessingConfigurationFuture(params: AddApplicationInputProcessingConfigurationRequest): Future[AddApplicationInputProcessingConfigurationResponse] = service.addApplicationInputProcessingConfiguration(params).promise().toFuture
    @inline def addApplicationOutputFuture(params: AddApplicationOutputRequest): Future[AddApplicationOutputResponse] = service.addApplicationOutput(params).promise().toFuture
    @inline def addApplicationReferenceDataSourceFuture(params: AddApplicationReferenceDataSourceRequest): Future[AddApplicationReferenceDataSourceResponse] = service.addApplicationReferenceDataSource(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] = service.createApplication(params).promise().toFuture
    @inline def deleteApplicationCloudWatchLoggingOptionFuture(params: DeleteApplicationCloudWatchLoggingOptionRequest): Future[DeleteApplicationCloudWatchLoggingOptionResponse] = service.deleteApplicationCloudWatchLoggingOption(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] = service.deleteApplication(params).promise().toFuture
    @inline def deleteApplicationInputProcessingConfigurationFuture(params: DeleteApplicationInputProcessingConfigurationRequest): Future[DeleteApplicationInputProcessingConfigurationResponse] = service.deleteApplicationInputProcessingConfiguration(params).promise().toFuture
    @inline def deleteApplicationOutputFuture(params: DeleteApplicationOutputRequest): Future[DeleteApplicationOutputResponse] = service.deleteApplicationOutput(params).promise().toFuture
    @inline def deleteApplicationReferenceDataSourceFuture(params: DeleteApplicationReferenceDataSourceRequest): Future[DeleteApplicationReferenceDataSourceResponse] = service.deleteApplicationReferenceDataSource(params).promise().toFuture
    @inline def describeApplicationFuture(params: DescribeApplicationRequest): Future[DescribeApplicationResponse] = service.describeApplication(params).promise().toFuture
    @inline def discoverInputSchemaFuture(params: DiscoverInputSchemaRequest): Future[DiscoverInputSchemaResponse] = service.discoverInputSchema(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] = service.listApplications(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startApplicationFuture(params: StartApplicationRequest): Future[StartApplicationResponse] = service.startApplication(params).promise().toFuture
    @inline def stopApplicationFuture(params: StopApplicationRequest): Future[StopApplicationResponse] = service.stopApplication(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] = service.updateApplication(params).promise().toFuture

  }
}

package kinesisanalytics {
  @js.native
  @JSImport("aws-sdk/clients/kinesisanalytics", JSImport.Namespace, "AWS.KinesisAnalytics")
  class KinesisAnalytics() extends js.Object {
    def this(config: AWSConfig) = this()

    def addApplicationCloudWatchLoggingOption(params: AddApplicationCloudWatchLoggingOptionRequest): Request[AddApplicationCloudWatchLoggingOptionResponse] = js.native
    def addApplicationInput(params: AddApplicationInputRequest): Request[AddApplicationInputResponse] = js.native
    def addApplicationInputProcessingConfiguration(params: AddApplicationInputProcessingConfigurationRequest): Request[AddApplicationInputProcessingConfigurationResponse] = js.native
    def addApplicationOutput(params: AddApplicationOutputRequest): Request[AddApplicationOutputResponse] = js.native
    def addApplicationReferenceDataSource(params: AddApplicationReferenceDataSourceRequest): Request[AddApplicationReferenceDataSourceResponse] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def deleteApplicationCloudWatchLoggingOption(params: DeleteApplicationCloudWatchLoggingOptionRequest): Request[DeleteApplicationCloudWatchLoggingOptionResponse] = js.native
    def deleteApplicationInputProcessingConfiguration(params: DeleteApplicationInputProcessingConfigurationRequest): Request[DeleteApplicationInputProcessingConfigurationResponse] = js.native
    def deleteApplicationOutput(params: DeleteApplicationOutputRequest): Request[DeleteApplicationOutputResponse] = js.native
    def deleteApplicationReferenceDataSource(params: DeleteApplicationReferenceDataSourceRequest): Request[DeleteApplicationReferenceDataSourceResponse] = js.native
    def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse] = js.native
    def discoverInputSchema(params: DiscoverInputSchemaRequest): Request[DiscoverInputSchemaResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse] = js.native
    def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
  }

  @js.native
  trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CloudWatchLoggingOption: CloudWatchLoggingOption
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  object AddApplicationCloudWatchLoggingOptionRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CloudWatchLoggingOption: CloudWatchLoggingOption,
        CurrentApplicationVersionId: ApplicationVersionId
    ): AddApplicationCloudWatchLoggingOptionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CloudWatchLoggingOption" -> CloudWatchLoggingOption.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionRequest]
    }
  }

  @js.native
  trait AddApplicationCloudWatchLoggingOptionResponse extends js.Object

  object AddApplicationCloudWatchLoggingOptionResponse {
    @inline
    def apply(): AddApplicationCloudWatchLoggingOptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionResponse]
    }
  }

  @js.native
  trait AddApplicationInputProcessingConfigurationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var InputId: Id
    var InputProcessingConfiguration: InputProcessingConfiguration
  }

  object AddApplicationInputProcessingConfigurationRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        InputId: Id,
        InputProcessingConfiguration: InputProcessingConfiguration
    ): AddApplicationInputProcessingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "InputId" -> InputId.asInstanceOf[js.Any],
        "InputProcessingConfiguration" -> InputProcessingConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddApplicationInputProcessingConfigurationRequest]
    }
  }

  @js.native
  trait AddApplicationInputProcessingConfigurationResponse extends js.Object

  object AddApplicationInputProcessingConfigurationResponse {
    @inline
    def apply(): AddApplicationInputProcessingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddApplicationInputProcessingConfigurationResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait AddApplicationInputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var Input: Input
  }

  object AddApplicationInputRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        Input: Input
    ): AddApplicationInputRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "Input" -> Input.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddApplicationInputRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait AddApplicationInputResponse extends js.Object

  object AddApplicationInputResponse {
    @inline
    def apply(): AddApplicationInputResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddApplicationInputResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait AddApplicationOutputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var Output: Output
  }

  object AddApplicationOutputRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        Output: Output
    ): AddApplicationOutputRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "Output" -> Output.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddApplicationOutputRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait AddApplicationOutputResponse extends js.Object

  object AddApplicationOutputResponse {
    @inline
    def apply(): AddApplicationOutputResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddApplicationOutputResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait AddApplicationReferenceDataSourceRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ReferenceDataSource: ReferenceDataSource
  }

  object AddApplicationReferenceDataSourceRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        ReferenceDataSource: ReferenceDataSource
    ): AddApplicationReferenceDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ReferenceDataSource" -> ReferenceDataSource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddApplicationReferenceDataSourceRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait AddApplicationReferenceDataSourceResponse extends js.Object

  object AddApplicationReferenceDataSourceResponse {
    @inline
    def apply(): AddApplicationReferenceDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddApplicationReferenceDataSourceResponse]
    }
  }

  /** '''Note:'''This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see [[/kinesisanalytics/latest/apiv2/Welcome.html|Amazon Kinesis Data Analytics API V2 Documentation]].
    * Provides a description of the application, including the application Amazon Resource Name (ARN), status, latest version, and input and output configuration.
    */
  @js.native
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

  object ApplicationDetail {
    @inline
    def apply(
        ApplicationARN: ResourceARN,
        ApplicationName: ApplicationName,
        ApplicationStatus: ApplicationStatus,
        ApplicationVersionId: ApplicationVersionId,
        ApplicationCode: js.UndefOr[ApplicationCode] = js.undefined,
        ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
        CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined,
        CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined,
        LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined,
        ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined
    ): ApplicationDetail = {
      val __obj = js.Dynamic.literal(
        "ApplicationARN" -> ApplicationARN.asInstanceOf[js.Any],
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationStatus" -> ApplicationStatus.asInstanceOf[js.Any],
        "ApplicationVersionId" -> ApplicationVersionId.asInstanceOf[js.Any]
      )

      ApplicationCode.foreach(__v => __obj.updateDynamic("ApplicationCode")(__v.asInstanceOf[js.Any]))
      ApplicationDescription.foreach(__v => __obj.updateDynamic("ApplicationDescription")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptionDescriptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptionDescriptions")(__v.asInstanceOf[js.Any]))
      CreateTimestamp.foreach(__v => __obj.updateDynamic("CreateTimestamp")(__v.asInstanceOf[js.Any]))
      InputDescriptions.foreach(__v => __obj.updateDynamic("InputDescriptions")(__v.asInstanceOf[js.Any]))
      LastUpdateTimestamp.foreach(__v => __obj.updateDynamic("LastUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      OutputDescriptions.foreach(__v => __obj.updateDynamic("OutputDescriptions")(__v.asInstanceOf[js.Any]))
      ReferenceDataSourceDescriptions.foreach(__v => __obj.updateDynamic("ReferenceDataSourceDescriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationDetail]
    }
  }

  @js.native
  sealed trait ApplicationStatus extends js.Any
  object ApplicationStatus {
    val DELETING = "DELETING".asInstanceOf[ApplicationStatus]
    val STARTING = "STARTING".asInstanceOf[ApplicationStatus]
    val STOPPING = "STOPPING".asInstanceOf[ApplicationStatus]
    val READY = "READY".asInstanceOf[ApplicationStatus]
    val RUNNING = "RUNNING".asInstanceOf[ApplicationStatus]
    val UPDATING = "UPDATING".asInstanceOf[ApplicationStatus]

    @inline def values = js.Array(DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING)
  }

  /** '''Note:'''This documentation is for version 1 of the Amazon Kinesis Data Analytics API, which only supports SQL applications. Version 2 of the API supports SQL and Java applications. For more information about version 2, see [[/kinesisanalytics/latest/apiv2/Welcome.html|Amazon Kinesis Data Analytics API V2 Documentation]].
    * Provides application summary information, including the application Amazon Resource Name (ARN), name, and status.
    */
  @js.native
  trait ApplicationSummary extends js.Object {
    var ApplicationARN: ResourceARN
    var ApplicationName: ApplicationName
    var ApplicationStatus: ApplicationStatus
  }

  object ApplicationSummary {
    @inline
    def apply(
        ApplicationARN: ResourceARN,
        ApplicationName: ApplicationName,
        ApplicationStatus: ApplicationStatus
    ): ApplicationSummary = {
      val __obj = js.Dynamic.literal(
        "ApplicationARN" -> ApplicationARN.asInstanceOf[js.Any],
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationStatus" -> ApplicationStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  /** Describes updates to apply to an existing Amazon Kinesis Analytics application.
    */
  @js.native
  trait ApplicationUpdate extends js.Object {
    var ApplicationCodeUpdate: js.UndefOr[ApplicationCode]
    var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates]
    var InputUpdates: js.UndefOr[InputUpdates]
    var OutputUpdates: js.UndefOr[OutputUpdates]
    var ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates]
  }

  object ApplicationUpdate {
    @inline
    def apply(
        ApplicationCodeUpdate: js.UndefOr[ApplicationCode] = js.undefined,
        CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined,
        InputUpdates: js.UndefOr[InputUpdates] = js.undefined,
        OutputUpdates: js.UndefOr[OutputUpdates] = js.undefined,
        ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates] = js.undefined
    ): ApplicationUpdate = {
      val __obj = js.Dynamic.literal()
      ApplicationCodeUpdate.foreach(__v => __obj.updateDynamic("ApplicationCodeUpdate")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptionUpdates.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptionUpdates")(__v.asInstanceOf[js.Any]))
      InputUpdates.foreach(__v => __obj.updateDynamic("InputUpdates")(__v.asInstanceOf[js.Any]))
      OutputUpdates.foreach(__v => __obj.updateDynamic("OutputUpdates")(__v.asInstanceOf[js.Any]))
      ReferenceDataSourceUpdates.foreach(__v => __obj.updateDynamic("ReferenceDataSourceUpdates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationUpdate]
    }
  }

  /** Provides additional mapping information when the record format uses delimiters, such as CSV. For example, the following sample records use CSV format, where the records use the <i>'n'</i> as the row delimiter and a comma (",") as the column delimiter:
    * <code>"name1", "address1"</code>
    * <code>"name2", "address2"</code>
    */
  @js.native
  trait CSVMappingParameters extends js.Object {
    var RecordColumnDelimiter: RecordColumnDelimiter
    var RecordRowDelimiter: RecordRowDelimiter
  }

  object CSVMappingParameters {
    @inline
    def apply(
        RecordColumnDelimiter: RecordColumnDelimiter,
        RecordRowDelimiter: RecordRowDelimiter
    ): CSVMappingParameters = {
      val __obj = js.Dynamic.literal(
        "RecordColumnDelimiter" -> RecordColumnDelimiter.asInstanceOf[js.Any],
        "RecordRowDelimiter" -> RecordRowDelimiter.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CSVMappingParameters]
    }
  }

  /** Provides a description of CloudWatch logging options, including the log stream Amazon Resource Name (ARN) and the role ARN.
    */
  @js.native
  trait CloudWatchLoggingOption extends js.Object {
    var LogStreamARN: LogStreamARN
    var RoleARN: RoleARN
  }

  object CloudWatchLoggingOption {
    @inline
    def apply(
        LogStreamARN: LogStreamARN,
        RoleARN: RoleARN
    ): CloudWatchLoggingOption = {
      val __obj = js.Dynamic.literal(
        "LogStreamARN" -> LogStreamARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudWatchLoggingOption]
    }
  }

  /** Description of the CloudWatch logging option.
    */
  @js.native
  trait CloudWatchLoggingOptionDescription extends js.Object {
    var LogStreamARN: LogStreamARN
    var RoleARN: RoleARN
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
  }

  object CloudWatchLoggingOptionDescription {
    @inline
    def apply(
        LogStreamARN: LogStreamARN,
        RoleARN: RoleARN,
        CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined
    ): CloudWatchLoggingOptionDescription = {
      val __obj = js.Dynamic.literal(
        "LogStreamARN" -> LogStreamARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )

      CloudWatchLoggingOptionId.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
    }
  }

  /** Describes CloudWatch logging option updates.
    */
  @js.native
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    var CloudWatchLoggingOptionId: Id
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object CloudWatchLoggingOptionUpdate {
    @inline
    def apply(
        CloudWatchLoggingOptionId: Id,
        LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined,
        RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
    ): CloudWatchLoggingOptionUpdate = {
      val __obj = js.Dynamic.literal(
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.asInstanceOf[js.Any]
      )

      LogStreamARNUpdate.foreach(__v => __obj.updateDynamic("LogStreamARNUpdate")(__v.asInstanceOf[js.Any]))
      RoleARNUpdate.foreach(__v => __obj.updateDynamic("RoleARNUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
    }
  }

  /** TBD
    */
  @js.native
  trait CreateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var ApplicationCode: js.UndefOr[ApplicationCode]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var Inputs: js.UndefOr[Inputs]
    var Outputs: js.UndefOr[Outputs]
    var Tags: js.UndefOr[Tags]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        ApplicationCode: js.UndefOr[ApplicationCode] = js.undefined,
        ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
        CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
        Inputs: js.UndefOr[Inputs] = js.undefined,
        Outputs: js.UndefOr[Outputs] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      ApplicationCode.foreach(__v => __obj.updateDynamic("ApplicationCode")(__v.asInstanceOf[js.Any]))
      ApplicationDescription.foreach(__v => __obj.updateDynamic("ApplicationDescription")(__v.asInstanceOf[js.Any]))
      CloudWatchLoggingOptions.foreach(__v => __obj.updateDynamic("CloudWatchLoggingOptions")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  /** TBD
    */
  @js.native
  trait CreateApplicationResponse extends js.Object {
    var ApplicationSummary: ApplicationSummary
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        ApplicationSummary: ApplicationSummary
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationSummary" -> ApplicationSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CloudWatchLoggingOptionId: Id
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  object DeleteApplicationCloudWatchLoggingOptionRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CloudWatchLoggingOptionId: Id,
        CurrentApplicationVersionId: ApplicationVersionId
    ): DeleteApplicationCloudWatchLoggingOptionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionRequest]
    }
  }

  @js.native
  trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object

  object DeleteApplicationCloudWatchLoggingOptionResponse {
    @inline
    def apply(): DeleteApplicationCloudWatchLoggingOptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionResponse]
    }
  }

  @js.native
  trait DeleteApplicationInputProcessingConfigurationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var InputId: Id
  }

  object DeleteApplicationInputProcessingConfigurationRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        InputId: Id
    ): DeleteApplicationInputProcessingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "InputId" -> InputId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteApplicationInputProcessingConfigurationResponse extends js.Object

  object DeleteApplicationInputProcessingConfigurationResponse {
    @inline
    def apply(): DeleteApplicationInputProcessingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteApplicationOutputRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var OutputId: Id
  }

  object DeleteApplicationOutputRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        OutputId: Id
    ): DeleteApplicationOutputRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "OutputId" -> OutputId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationOutputRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteApplicationOutputResponse extends js.Object

  object DeleteApplicationOutputResponse {
    @inline
    def apply(): DeleteApplicationOutputResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationOutputResponse]
    }
  }

  @js.native
  trait DeleteApplicationReferenceDataSourceRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ReferenceId: Id
  }

  object DeleteApplicationReferenceDataSourceRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CurrentApplicationVersionId: ApplicationVersionId,
        ReferenceId: Id
    ): DeleteApplicationReferenceDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationReferenceDataSourceRequest]
    }
  }

  @js.native
  trait DeleteApplicationReferenceDataSourceResponse extends js.Object

  object DeleteApplicationReferenceDataSourceResponse {
    @inline
    def apply(): DeleteApplicationReferenceDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationReferenceDataSourceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CreateTimestamp: Timestamp
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CreateTimestamp: Timestamp
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CreateTimestamp" -> CreateTimestamp.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteApplicationResponse extends js.Object

  object DeleteApplicationResponse {
    @inline
    def apply(): DeleteApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
  }

  object DescribeApplicationRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName
    ): DescribeApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeApplicationRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  object DescribeApplicationResponse {
    @inline
    def apply(
        ApplicationDetail: ApplicationDetail
    ): DescribeApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationDetail" -> ApplicationDetail.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeApplicationResponse]
    }
  }

  /** Describes the data format when records are written to the destination. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html|Configuring Application Output]].
    */
  @js.native
  trait DestinationSchema extends js.Object {
    var RecordFormatType: RecordFormatType
  }

  object DestinationSchema {
    @inline
    def apply(
        RecordFormatType: RecordFormatType
    ): DestinationSchema = {
      val __obj = js.Dynamic.literal(
        "RecordFormatType" -> RecordFormatType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DestinationSchema]
    }
  }

  @js.native
  trait DiscoverInputSchemaRequest extends js.Object {
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
    var S3Configuration: js.UndefOr[S3Configuration]
  }

  object DiscoverInputSchemaRequest {
    @inline
    def apply(
        InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined,
        InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        S3Configuration: js.UndefOr[S3Configuration] = js.undefined
    ): DiscoverInputSchemaRequest = {
      val __obj = js.Dynamic.literal()
      InputProcessingConfiguration.foreach(__v => __obj.updateDynamic("InputProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      InputStartingPositionConfiguration.foreach(__v => __obj.updateDynamic("InputStartingPositionConfiguration")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      S3Configuration.foreach(__v => __obj.updateDynamic("S3Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverInputSchemaRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait DiscoverInputSchemaResponse extends js.Object {
    var InputSchema: js.UndefOr[SourceSchema]
    var ParsedInputRecords: js.UndefOr[ParsedInputRecords]
    var ProcessedInputRecords: js.UndefOr[ProcessedInputRecords]
    var RawInputRecords: js.UndefOr[RawInputRecords]
  }

  object DiscoverInputSchemaResponse {
    @inline
    def apply(
        InputSchema: js.UndefOr[SourceSchema] = js.undefined,
        ParsedInputRecords: js.UndefOr[ParsedInputRecords] = js.undefined,
        ProcessedInputRecords: js.UndefOr[ProcessedInputRecords] = js.undefined,
        RawInputRecords: js.UndefOr[RawInputRecords] = js.undefined
    ): DiscoverInputSchemaResponse = {
      val __obj = js.Dynamic.literal()
      InputSchema.foreach(__v => __obj.updateDynamic("InputSchema")(__v.asInstanceOf[js.Any]))
      ParsedInputRecords.foreach(__v => __obj.updateDynamic("ParsedInputRecords")(__v.asInstanceOf[js.Any]))
      ProcessedInputRecords.foreach(__v => __obj.updateDynamic("ProcessedInputRecords")(__v.asInstanceOf[js.Any]))
      RawInputRecords.foreach(__v => __obj.updateDynamic("RawInputRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverInputSchemaResponse]
    }
  }

  /** When you configure the application input, you specify the streaming source, the in-application stream name that is created, and the mapping between the two. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html|Configuring Application Input]].
    */
  @js.native
  trait Input extends js.Object {
    var InputSchema: SourceSchema
    var NamePrefix: InAppStreamName
    var InputParallelism: js.UndefOr[InputParallelism]
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput]
    var KinesisStreamsInput: js.UndefOr[KinesisStreamsInput]
  }

  object Input {
    @inline
    def apply(
        InputSchema: SourceSchema,
        NamePrefix: InAppStreamName,
        InputParallelism: js.UndefOr[InputParallelism] = js.undefined,
        InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined,
        KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput] = js.undefined,
        KinesisStreamsInput: js.UndefOr[KinesisStreamsInput] = js.undefined
    ): Input = {
      val __obj = js.Dynamic.literal(
        "InputSchema" -> InputSchema.asInstanceOf[js.Any],
        "NamePrefix" -> NamePrefix.asInstanceOf[js.Any]
      )

      InputParallelism.foreach(__v => __obj.updateDynamic("InputParallelism")(__v.asInstanceOf[js.Any]))
      InputProcessingConfiguration.foreach(__v => __obj.updateDynamic("InputProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseInput.foreach(__v => __obj.updateDynamic("KinesisFirehoseInput")(__v.asInstanceOf[js.Any]))
      KinesisStreamsInput.foreach(__v => __obj.updateDynamic("KinesisStreamsInput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Input]
    }
  }

  /** When you start your application, you provide this configuration, which identifies the input source and the point in the input source at which you want the application to start processing records.
    */
  @js.native
  trait InputConfiguration extends js.Object {
    var Id: Id
    var InputStartingPositionConfiguration: InputStartingPositionConfiguration
  }

  object InputConfiguration {
    @inline
    def apply(
        Id: Id,
        InputStartingPositionConfiguration: InputStartingPositionConfiguration
    ): InputConfiguration = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputConfiguration]
    }
  }

  /** Describes the application input configuration. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html|Configuring Application Input]].
    */
  @js.native
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

  object InputDescription {
    @inline
    def apply(
        InAppStreamNames: js.UndefOr[InAppStreamNames] = js.undefined,
        InputId: js.UndefOr[Id] = js.undefined,
        InputParallelism: js.UndefOr[InputParallelism] = js.undefined,
        InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription] = js.undefined,
        InputSchema: js.UndefOr[SourceSchema] = js.undefined,
        InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined,
        KinesisFirehoseInputDescription: js.UndefOr[KinesisFirehoseInputDescription] = js.undefined,
        KinesisStreamsInputDescription: js.UndefOr[KinesisStreamsInputDescription] = js.undefined,
        NamePrefix: js.UndefOr[InAppStreamName] = js.undefined
    ): InputDescription = {
      val __obj = js.Dynamic.literal()
      InAppStreamNames.foreach(__v => __obj.updateDynamic("InAppStreamNames")(__v.asInstanceOf[js.Any]))
      InputId.foreach(__v => __obj.updateDynamic("InputId")(__v.asInstanceOf[js.Any]))
      InputParallelism.foreach(__v => __obj.updateDynamic("InputParallelism")(__v.asInstanceOf[js.Any]))
      InputProcessingConfigurationDescription.foreach(__v => __obj.updateDynamic("InputProcessingConfigurationDescription")(__v.asInstanceOf[js.Any]))
      InputSchema.foreach(__v => __obj.updateDynamic("InputSchema")(__v.asInstanceOf[js.Any]))
      InputStartingPositionConfiguration.foreach(__v => __obj.updateDynamic("InputStartingPositionConfiguration")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseInputDescription.foreach(__v => __obj.updateDynamic("KinesisFirehoseInputDescription")(__v.asInstanceOf[js.Any]))
      KinesisStreamsInputDescription.foreach(__v => __obj.updateDynamic("KinesisStreamsInputDescription")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDescription]
    }
  }

  /** An object that contains the Amazon Resource Name (ARN) of the [[https://docs.aws.amazon.com/lambda/|AWS Lambda]] function that is used to preprocess records in the stream, and the ARN of the IAM role that is used to access the AWS Lambda function.
    */
  @js.native
  trait InputLambdaProcessor extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object InputLambdaProcessor {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: RoleARN
    ): InputLambdaProcessor = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputLambdaProcessor]
    }
  }

  /** An object that contains the Amazon Resource Name (ARN) of the [[https://docs.aws.amazon.com/lambda/|AWS Lambda]] function that is used to preprocess records in the stream, and the ARN of the IAM role that is used to access the AWS Lambda expression.
    */
  @js.native
  trait InputLambdaProcessorDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object InputLambdaProcessorDescription {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): InputLambdaProcessorDescription = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputLambdaProcessorDescription]
    }
  }

  /** Represents an update to the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputLambdaProcessor.html|InputLambdaProcessor]] that is used to preprocess the records in the stream.
    */
  @js.native
  trait InputLambdaProcessorUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object InputLambdaProcessorUpdate {
    @inline
    def apply(
        ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
        RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
    ): InputLambdaProcessorUpdate = {
      val __obj = js.Dynamic.literal()
      ResourceARNUpdate.foreach(__v => __obj.updateDynamic("ResourceARNUpdate")(__v.asInstanceOf[js.Any]))
      RoleARNUpdate.foreach(__v => __obj.updateDynamic("RoleARNUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputLambdaProcessorUpdate]
    }
  }

  /** Describes the number of in-application streams to create for a given streaming source. For information about parallelism, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html|Configuring Application Input]].
    */
  @js.native
  trait InputParallelism extends js.Object {
    var Count: js.UndefOr[InputParallelismCount]
  }

  object InputParallelism {
    @inline
    def apply(
        Count: js.UndefOr[InputParallelismCount] = js.undefined
    ): InputParallelism = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputParallelism]
    }
  }

  /** Provides updates to the parallelism count.
    */
  @js.native
  trait InputParallelismUpdate extends js.Object {
    var CountUpdate: js.UndefOr[InputParallelismCount]
  }

  object InputParallelismUpdate {
    @inline
    def apply(
        CountUpdate: js.UndefOr[InputParallelismCount] = js.undefined
    ): InputParallelismUpdate = {
      val __obj = js.Dynamic.literal()
      CountUpdate.foreach(__v => __obj.updateDynamic("CountUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputParallelismUpdate]
    }
  }

  /** Provides a description of a processor that is used to preprocess the records in the stream before being processed by your application code. Currently, the only input processor available is [[https://docs.aws.amazon.com/lambda/|AWS Lambda]].
    */
  @js.native
  trait InputProcessingConfiguration extends js.Object {
    var InputLambdaProcessor: InputLambdaProcessor
  }

  object InputProcessingConfiguration {
    @inline
    def apply(
        InputLambdaProcessor: InputLambdaProcessor
    ): InputProcessingConfiguration = {
      val __obj = js.Dynamic.literal(
        "InputLambdaProcessor" -> InputLambdaProcessor.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputProcessingConfiguration]
    }
  }

  /** Provides configuration information about an input processor. Currently, the only input processor available is [[https://docs.aws.amazon.com/lambda/|AWS Lambda]].
    */
  @js.native
  trait InputProcessingConfigurationDescription extends js.Object {
    var InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription]
  }

  object InputProcessingConfigurationDescription {
    @inline
    def apply(
        InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription] = js.undefined
    ): InputProcessingConfigurationDescription = {
      val __obj = js.Dynamic.literal()
      InputLambdaProcessorDescription.foreach(__v => __obj.updateDynamic("InputLambdaProcessorDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputProcessingConfigurationDescription]
    }
  }

  /** Describes updates to an [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_InputProcessingConfiguration.html|InputProcessingConfiguration]].
    */
  @js.native
  trait InputProcessingConfigurationUpdate extends js.Object {
    var InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
  }

  object InputProcessingConfigurationUpdate {
    @inline
    def apply(
        InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
    ): InputProcessingConfigurationUpdate = {
      val __obj = js.Dynamic.literal(
        "InputLambdaProcessorUpdate" -> InputLambdaProcessorUpdate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputProcessingConfigurationUpdate]
    }
  }

  /** Describes updates for the application's input schema.
    */
  @js.native
  trait InputSchemaUpdate extends js.Object {
    var RecordColumnUpdates: js.UndefOr[RecordColumns]
    var RecordEncodingUpdate: js.UndefOr[RecordEncoding]
    var RecordFormatUpdate: js.UndefOr[RecordFormat]
  }

  object InputSchemaUpdate {
    @inline
    def apply(
        RecordColumnUpdates: js.UndefOr[RecordColumns] = js.undefined,
        RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.undefined,
        RecordFormatUpdate: js.UndefOr[RecordFormat] = js.undefined
    ): InputSchemaUpdate = {
      val __obj = js.Dynamic.literal()
      RecordColumnUpdates.foreach(__v => __obj.updateDynamic("RecordColumnUpdates")(__v.asInstanceOf[js.Any]))
      RecordEncodingUpdate.foreach(__v => __obj.updateDynamic("RecordEncodingUpdate")(__v.asInstanceOf[js.Any]))
      RecordFormatUpdate.foreach(__v => __obj.updateDynamic("RecordFormatUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSchemaUpdate]
    }
  }

  @js.native
  sealed trait InputStartingPosition extends js.Any
  object InputStartingPosition {
    val NOW = "NOW".asInstanceOf[InputStartingPosition]
    val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[InputStartingPosition]
    val LAST_STOPPED_POINT = "LAST_STOPPED_POINT".asInstanceOf[InputStartingPosition]

    @inline def values = js.Array(NOW, TRIM_HORIZON, LAST_STOPPED_POINT)
  }

  /** Describes the point at which the application reads from the streaming source.
    */
  @js.native
  trait InputStartingPositionConfiguration extends js.Object {
    var InputStartingPosition: js.UndefOr[InputStartingPosition]
  }

  object InputStartingPositionConfiguration {
    @inline
    def apply(
        InputStartingPosition: js.UndefOr[InputStartingPosition] = js.undefined
    ): InputStartingPositionConfiguration = {
      val __obj = js.Dynamic.literal()
      InputStartingPosition.foreach(__v => __obj.updateDynamic("InputStartingPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputStartingPositionConfiguration]
    }
  }

  /** Describes updates to a specific input configuration (identified by the <code>InputId</code> of an application).
    */
  @js.native
  trait InputUpdate extends js.Object {
    var InputId: Id
    var InputParallelismUpdate: js.UndefOr[InputParallelismUpdate]
    var InputProcessingConfigurationUpdate: js.UndefOr[InputProcessingConfigurationUpdate]
    var InputSchemaUpdate: js.UndefOr[InputSchemaUpdate]
    var KinesisFirehoseInputUpdate: js.UndefOr[KinesisFirehoseInputUpdate]
    var KinesisStreamsInputUpdate: js.UndefOr[KinesisStreamsInputUpdate]
    var NamePrefixUpdate: js.UndefOr[InAppStreamName]
  }

  object InputUpdate {
    @inline
    def apply(
        InputId: Id,
        InputParallelismUpdate: js.UndefOr[InputParallelismUpdate] = js.undefined,
        InputProcessingConfigurationUpdate: js.UndefOr[InputProcessingConfigurationUpdate] = js.undefined,
        InputSchemaUpdate: js.UndefOr[InputSchemaUpdate] = js.undefined,
        KinesisFirehoseInputUpdate: js.UndefOr[KinesisFirehoseInputUpdate] = js.undefined,
        KinesisStreamsInputUpdate: js.UndefOr[KinesisStreamsInputUpdate] = js.undefined,
        NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.undefined
    ): InputUpdate = {
      val __obj = js.Dynamic.literal(
        "InputId" -> InputId.asInstanceOf[js.Any]
      )

      InputParallelismUpdate.foreach(__v => __obj.updateDynamic("InputParallelismUpdate")(__v.asInstanceOf[js.Any]))
      InputProcessingConfigurationUpdate.foreach(__v => __obj.updateDynamic("InputProcessingConfigurationUpdate")(__v.asInstanceOf[js.Any]))
      InputSchemaUpdate.foreach(__v => __obj.updateDynamic("InputSchemaUpdate")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseInputUpdate.foreach(__v => __obj.updateDynamic("KinesisFirehoseInputUpdate")(__v.asInstanceOf[js.Any]))
      KinesisStreamsInputUpdate.foreach(__v => __obj.updateDynamic("KinesisStreamsInputUpdate")(__v.asInstanceOf[js.Any]))
      NamePrefixUpdate.foreach(__v => __obj.updateDynamic("NamePrefixUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputUpdate]
    }
  }

  /** Provides additional mapping information when JSON is the record format on the streaming source.
    */
  @js.native
  trait JSONMappingParameters extends js.Object {
    var RecordRowPath: RecordRowPath
  }

  object JSONMappingParameters {
    @inline
    def apply(
        RecordRowPath: RecordRowPath
    ): JSONMappingParameters = {
      val __obj = js.Dynamic.literal(
        "RecordRowPath" -> RecordRowPath.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JSONMappingParameters]
    }
  }

  /** Identifies an Amazon Kinesis Firehose delivery stream as the streaming source. You provide the delivery stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  @js.native
  trait KinesisFirehoseInput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object KinesisFirehoseInput {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: RoleARN
    ): KinesisFirehoseInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisFirehoseInput]
    }
  }

  /** Describes the Amazon Kinesis Firehose delivery stream that is configured as the streaming source in the application input configuration.
    */
  @js.native
  trait KinesisFirehoseInputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseInputDescription {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisFirehoseInputDescription = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisFirehoseInputDescription]
    }
  }

  /** When updating application input configuration, provides information about an Amazon Kinesis Firehose delivery stream as the streaming source.
    */
  @js.native
  trait KinesisFirehoseInputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseInputUpdate {
    @inline
    def apply(
        ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
        RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
    ): KinesisFirehoseInputUpdate = {
      val __obj = js.Dynamic.literal()
      ResourceARNUpdate.foreach(__v => __obj.updateDynamic("ResourceARNUpdate")(__v.asInstanceOf[js.Any]))
      RoleARNUpdate.foreach(__v => __obj.updateDynamic("RoleARNUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisFirehoseInputUpdate]
    }
  }

  /** When configuring application output, identifies an Amazon Kinesis Firehose delivery stream as the destination. You provide the stream Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to write to the stream on your behalf.
    */
  @js.native
  trait KinesisFirehoseOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object KinesisFirehoseOutput {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: RoleARN
    ): KinesisFirehoseOutput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisFirehoseOutput]
    }
  }

  /** For an application output, describes the Amazon Kinesis Firehose delivery stream configured as its destination.
    */
  @js.native
  trait KinesisFirehoseOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseOutputDescription {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisFirehoseOutputDescription = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisFirehoseOutputDescription]
    }
  }

  /** When updating an output configuration using the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html|UpdateApplication]] operation, provides information about an Amazon Kinesis Firehose delivery stream configured as the destination.
    */
  @js.native
  trait KinesisFirehoseOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseOutputUpdate {
    @inline
    def apply(
        ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
        RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
    ): KinesisFirehoseOutputUpdate = {
      val __obj = js.Dynamic.literal()
      ResourceARNUpdate.foreach(__v => __obj.updateDynamic("ResourceARNUpdate")(__v.asInstanceOf[js.Any]))
      RoleARNUpdate.foreach(__v => __obj.updateDynamic("RoleARNUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisFirehoseOutputUpdate]
    }
  }

  /** Identifies an Amazon Kinesis stream as the streaming source. You provide the stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  @js.native
  trait KinesisStreamsInput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object KinesisStreamsInput {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: RoleARN
    ): KinesisStreamsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisStreamsInput]
    }
  }

  /** Describes the Amazon Kinesis stream that is configured as the streaming source in the application input configuration.
    */
  @js.native
  trait KinesisStreamsInputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamsInputDescription {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisStreamsInputDescription = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisStreamsInputDescription]
    }
  }

  /** When updating application input configuration, provides information about an Amazon Kinesis stream as the streaming source.
    */
  @js.native
  trait KinesisStreamsInputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object KinesisStreamsInputUpdate {
    @inline
    def apply(
        ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
        RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
    ): KinesisStreamsInputUpdate = {
      val __obj = js.Dynamic.literal()
      ResourceARNUpdate.foreach(__v => __obj.updateDynamic("ResourceARNUpdate")(__v.asInstanceOf[js.Any]))
      RoleARNUpdate.foreach(__v => __obj.updateDynamic("RoleARNUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisStreamsInputUpdate]
    }
  }

  /** When configuring application output, identifies an Amazon Kinesis stream as the destination. You provide the stream Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis Analytics can use to write to the stream on your behalf.
    */
  @js.native
  trait KinesisStreamsOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object KinesisStreamsOutput {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: RoleARN
    ): KinesisStreamsOutput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisStreamsOutput]
    }
  }

  /** For an application output, describes the Amazon Kinesis stream configured as its destination.
    */
  @js.native
  trait KinesisStreamsOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamsOutputDescription {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): KinesisStreamsOutputDescription = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisStreamsOutputDescription]
    }
  }

  /** When updating an output configuration using the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html|UpdateApplication]] operation, provides information about an Amazon Kinesis stream configured as the destination.
    */
  @js.native
  trait KinesisStreamsOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object KinesisStreamsOutputUpdate {
    @inline
    def apply(
        ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
        RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
    ): KinesisStreamsOutputUpdate = {
      val __obj = js.Dynamic.literal()
      ResourceARNUpdate.foreach(__v => __obj.updateDynamic("ResourceARNUpdate")(__v.asInstanceOf[js.Any]))
      RoleARNUpdate.foreach(__v => __obj.updateDynamic("RoleARNUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisStreamsOutputUpdate]
    }
  }

  /** When configuring application output, identifies an AWS Lambda function as the destination. You provide the function Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis Analytics can use to write to the function on your behalf.
    */
  @js.native
  trait LambdaOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object LambdaOutput {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        RoleARN: RoleARN
    ): LambdaOutput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaOutput]
    }
  }

  /** For an application output, describes the AWS Lambda function configured as its destination.
    */
  @js.native
  trait LambdaOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object LambdaOutputDescription {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined
    ): LambdaOutputDescription = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaOutputDescription]
    }
  }

  /** When updating an output configuration using the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html|UpdateApplication]] operation, provides information about an AWS Lambda function configured as the destination.
    */
  @js.native
  trait LambdaOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object LambdaOutputUpdate {
    @inline
    def apply(
        ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
        RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
    ): LambdaOutputUpdate = {
      val __obj = js.Dynamic.literal()
      ResourceARNUpdate.foreach(__v => __obj.updateDynamic("ResourceARNUpdate")(__v.asInstanceOf[js.Any]))
      RoleARNUpdate.foreach(__v => __obj.updateDynamic("RoleARNUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaOutputUpdate]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListApplicationsRequest extends js.Object {
    var ExclusiveStartApplicationName: js.UndefOr[ApplicationName]
    var Limit: js.UndefOr[ListApplicationsInputLimit]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        ExclusiveStartApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      ExclusiveStartApplicationName.foreach(__v => __obj.updateDynamic("ExclusiveStartApplicationName")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListApplicationsResponse extends js.Object {
    var ApplicationSummaries: ApplicationSummaries
    var HasMoreApplications: BooleanObject
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        ApplicationSummaries: ApplicationSummaries,
        HasMoreApplications: BooleanObject
    ): ListApplicationsResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationSummaries" -> ApplicationSummaries.asInstanceOf[js.Any],
        "HasMoreApplications" -> HasMoreApplications.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: KinesisAnalyticsARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** When configuring application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  @js.native
  trait MappingParameters extends js.Object {
    var CSVMappingParameters: js.UndefOr[CSVMappingParameters]
    var JSONMappingParameters: js.UndefOr[JSONMappingParameters]
  }

  object MappingParameters {
    @inline
    def apply(
        CSVMappingParameters: js.UndefOr[CSVMappingParameters] = js.undefined,
        JSONMappingParameters: js.UndefOr[JSONMappingParameters] = js.undefined
    ): MappingParameters = {
      val __obj = js.Dynamic.literal()
      CSVMappingParameters.foreach(__v => __obj.updateDynamic("CSVMappingParameters")(__v.asInstanceOf[js.Any]))
      JSONMappingParameters.foreach(__v => __obj.updateDynamic("JSONMappingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MappingParameters]
    }
  }

  /** Describes application output configuration in which you identify an in-application stream and a destination where you want the in-application stream data to be written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream.
    * <p/> For limits on how many destinations an application can write and other limitations, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html|Limits]].
    */
  @js.native
  trait Output extends js.Object {
    var DestinationSchema: DestinationSchema
    var Name: InAppStreamName
    var KinesisFirehoseOutput: js.UndefOr[KinesisFirehoseOutput]
    var KinesisStreamsOutput: js.UndefOr[KinesisStreamsOutput]
    var LambdaOutput: js.UndefOr[LambdaOutput]
  }

  object Output {
    @inline
    def apply(
        DestinationSchema: DestinationSchema,
        Name: InAppStreamName,
        KinesisFirehoseOutput: js.UndefOr[KinesisFirehoseOutput] = js.undefined,
        KinesisStreamsOutput: js.UndefOr[KinesisStreamsOutput] = js.undefined,
        LambdaOutput: js.UndefOr[LambdaOutput] = js.undefined
    ): Output = {
      val __obj = js.Dynamic.literal(
        "DestinationSchema" -> DestinationSchema.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      KinesisFirehoseOutput.foreach(__v => __obj.updateDynamic("KinesisFirehoseOutput")(__v.asInstanceOf[js.Any]))
      KinesisStreamsOutput.foreach(__v => __obj.updateDynamic("KinesisStreamsOutput")(__v.asInstanceOf[js.Any]))
      LambdaOutput.foreach(__v => __obj.updateDynamic("LambdaOutput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
    }
  }

  /** Describes the application output configuration, which includes the in-application stream name and the destination where the stream data is written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream.
    */
  @js.native
  trait OutputDescription extends js.Object {
    var DestinationSchema: js.UndefOr[DestinationSchema]
    var KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription]
    var KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription]
    var LambdaOutputDescription: js.UndefOr[LambdaOutputDescription]
    var Name: js.UndefOr[InAppStreamName]
    var OutputId: js.UndefOr[Id]
  }

  object OutputDescription {
    @inline
    def apply(
        DestinationSchema: js.UndefOr[DestinationSchema] = js.undefined,
        KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription] = js.undefined,
        KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription] = js.undefined,
        LambdaOutputDescription: js.UndefOr[LambdaOutputDescription] = js.undefined,
        Name: js.UndefOr[InAppStreamName] = js.undefined,
        OutputId: js.UndefOr[Id] = js.undefined
    ): OutputDescription = {
      val __obj = js.Dynamic.literal()
      DestinationSchema.foreach(__v => __obj.updateDynamic("DestinationSchema")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseOutputDescription.foreach(__v => __obj.updateDynamic("KinesisFirehoseOutputDescription")(__v.asInstanceOf[js.Any]))
      KinesisStreamsOutputDescription.foreach(__v => __obj.updateDynamic("KinesisStreamsOutputDescription")(__v.asInstanceOf[js.Any]))
      LambdaOutputDescription.foreach(__v => __obj.updateDynamic("LambdaOutputDescription")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputId.foreach(__v => __obj.updateDynamic("OutputId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDescription]
    }
  }

  /** Describes updates to the output configuration identified by the <code>OutputId</code>.
    */
  @js.native
  trait OutputUpdate extends js.Object {
    var OutputId: Id
    var DestinationSchemaUpdate: js.UndefOr[DestinationSchema]
    var KinesisFirehoseOutputUpdate: js.UndefOr[KinesisFirehoseOutputUpdate]
    var KinesisStreamsOutputUpdate: js.UndefOr[KinesisStreamsOutputUpdate]
    var LambdaOutputUpdate: js.UndefOr[LambdaOutputUpdate]
    var NameUpdate: js.UndefOr[InAppStreamName]
  }

  object OutputUpdate {
    @inline
    def apply(
        OutputId: Id,
        DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.undefined,
        KinesisFirehoseOutputUpdate: js.UndefOr[KinesisFirehoseOutputUpdate] = js.undefined,
        KinesisStreamsOutputUpdate: js.UndefOr[KinesisStreamsOutputUpdate] = js.undefined,
        LambdaOutputUpdate: js.UndefOr[LambdaOutputUpdate] = js.undefined,
        NameUpdate: js.UndefOr[InAppStreamName] = js.undefined
    ): OutputUpdate = {
      val __obj = js.Dynamic.literal(
        "OutputId" -> OutputId.asInstanceOf[js.Any]
      )

      DestinationSchemaUpdate.foreach(__v => __obj.updateDynamic("DestinationSchemaUpdate")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseOutputUpdate.foreach(__v => __obj.updateDynamic("KinesisFirehoseOutputUpdate")(__v.asInstanceOf[js.Any]))
      KinesisStreamsOutputUpdate.foreach(__v => __obj.updateDynamic("KinesisStreamsOutputUpdate")(__v.asInstanceOf[js.Any]))
      LambdaOutputUpdate.foreach(__v => __obj.updateDynamic("LambdaOutputUpdate")(__v.asInstanceOf[js.Any]))
      NameUpdate.foreach(__v => __obj.updateDynamic("NameUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputUpdate]
    }
  }

  /** Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
    * Also used to describe the format of the reference data source.
    */
  @js.native
  trait RecordColumn extends js.Object {
    var Name: RecordColumnName
    var SqlType: RecordColumnSqlType
    var Mapping: js.UndefOr[RecordColumnMapping]
  }

  object RecordColumn {
    @inline
    def apply(
        Name: RecordColumnName,
        SqlType: RecordColumnSqlType,
        Mapping: js.UndefOr[RecordColumnMapping] = js.undefined
    ): RecordColumn = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SqlType" -> SqlType.asInstanceOf[js.Any]
      )

      Mapping.foreach(__v => __obj.updateDynamic("Mapping")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordColumn]
    }
  }

  /** Describes the record format and relevant mapping information that should be applied to schematize the records on the stream.
    */
  @js.native
  trait RecordFormat extends js.Object {
    var RecordFormatType: RecordFormatType
    var MappingParameters: js.UndefOr[MappingParameters]
  }

  object RecordFormat {
    @inline
    def apply(
        RecordFormatType: RecordFormatType,
        MappingParameters: js.UndefOr[MappingParameters] = js.undefined
    ): RecordFormat = {
      val __obj = js.Dynamic.literal(
        "RecordFormatType" -> RecordFormatType.asInstanceOf[js.Any]
      )

      MappingParameters.foreach(__v => __obj.updateDynamic("MappingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordFormat]
    }
  }

  @js.native
  sealed trait RecordFormatType extends js.Any
  object RecordFormatType {
    val JSON = "JSON".asInstanceOf[RecordFormatType]
    val CSV = "CSV".asInstanceOf[RecordFormatType]

    @inline def values = js.Array(JSON, CSV)
  }

  /** Describes the reference data source by providing the source information (S3 bucket name and object key name), the resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon S3 object to the in-application table.
    */
  @js.native
  trait ReferenceDataSource extends js.Object {
    var ReferenceSchema: SourceSchema
    var TableName: InAppTableName
    var S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource]
  }

  object ReferenceDataSource {
    @inline
    def apply(
        ReferenceSchema: SourceSchema,
        TableName: InAppTableName,
        S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource] = js.undefined
    ): ReferenceDataSource = {
      val __obj = js.Dynamic.literal(
        "ReferenceSchema" -> ReferenceSchema.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      S3ReferenceDataSource.foreach(__v => __obj.updateDynamic("S3ReferenceDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceDataSource]
    }
  }

  /** Describes the reference data source configured for an application.
    */
  @js.native
  trait ReferenceDataSourceDescription extends js.Object {
    var ReferenceId: Id
    var S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription
    var TableName: InAppTableName
    var ReferenceSchema: js.UndefOr[SourceSchema]
  }

  object ReferenceDataSourceDescription {
    @inline
    def apply(
        ReferenceId: Id,
        S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription,
        TableName: InAppTableName,
        ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined
    ): ReferenceDataSourceDescription = {
      val __obj = js.Dynamic.literal(
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any],
        "S3ReferenceDataSourceDescription" -> S3ReferenceDataSourceDescription.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      ReferenceSchema.foreach(__v => __obj.updateDynamic("ReferenceSchema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceDataSourceDescription]
    }
  }

  /** When you update a reference data source configuration for an application, this object provides all the updated values (such as the source bucket name and object key name), the in-application table name that is created, and updated mapping information that maps the data in the Amazon S3 object to the in-application reference table that is created.
    */
  @js.native
  trait ReferenceDataSourceUpdate extends js.Object {
    var ReferenceId: Id
    var ReferenceSchemaUpdate: js.UndefOr[SourceSchema]
    var S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate]
    var TableNameUpdate: js.UndefOr[InAppTableName]
  }

  object ReferenceDataSourceUpdate {
    @inline
    def apply(
        ReferenceId: Id,
        ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.undefined,
        S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate] = js.undefined,
        TableNameUpdate: js.UndefOr[InAppTableName] = js.undefined
    ): ReferenceDataSourceUpdate = {
      val __obj = js.Dynamic.literal(
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any]
      )

      ReferenceSchemaUpdate.foreach(__v => __obj.updateDynamic("ReferenceSchemaUpdate")(__v.asInstanceOf[js.Any]))
      S3ReferenceDataSourceUpdate.foreach(__v => __obj.updateDynamic("S3ReferenceDataSourceUpdate")(__v.asInstanceOf[js.Any]))
      TableNameUpdate.foreach(__v => __obj.updateDynamic("TableNameUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceDataSourceUpdate]
    }
  }

  /** Provides a description of an Amazon S3 data source, including the Amazon Resource Name (ARN) of the S3 bucket, the ARN of the IAM role that is used to access the bucket, and the name of the Amazon S3 object that contains the data.
    */
  @js.native
  trait S3Configuration extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var RoleARN: RoleARN
  }

  object S3Configuration {
    @inline
    def apply(
        BucketARN: BucketARN,
        FileKey: FileKey,
        RoleARN: RoleARN
    ): S3Configuration = {
      val __obj = js.Dynamic.literal(
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey" -> FileKey.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Configuration]
    }
  }

  /** Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your behalf.
    * An Amazon Kinesis Analytics application loads reference data only once. If the data changes, you call the [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html|UpdateApplication]] operation to trigger reloading of data into your application.
    */
  @js.native
  trait S3ReferenceDataSource extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ReferenceRoleARN: RoleARN
  }

  object S3ReferenceDataSource {
    @inline
    def apply(
        BucketARN: BucketARN,
        FileKey: FileKey,
        ReferenceRoleARN: RoleARN
    ): S3ReferenceDataSource = {
      val __obj = js.Dynamic.literal(
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey" -> FileKey.asInstanceOf[js.Any],
        "ReferenceRoleARN" -> ReferenceRoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3ReferenceDataSource]
    }
  }

  /** Provides the bucket name and object key name that stores the reference data.
    */
  @js.native
  trait S3ReferenceDataSourceDescription extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ReferenceRoleARN: RoleARN
  }

  object S3ReferenceDataSourceDescription {
    @inline
    def apply(
        BucketARN: BucketARN,
        FileKey: FileKey,
        ReferenceRoleARN: RoleARN
    ): S3ReferenceDataSourceDescription = {
      val __obj = js.Dynamic.literal(
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey" -> FileKey.asInstanceOf[js.Any],
        "ReferenceRoleARN" -> ReferenceRoleARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3ReferenceDataSourceDescription]
    }
  }

  /** Describes the S3 bucket name, object key name, and IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
    */
  @js.native
  trait S3ReferenceDataSourceUpdate extends js.Object {
    var BucketARNUpdate: js.UndefOr[BucketARN]
    var FileKeyUpdate: js.UndefOr[FileKey]
    var ReferenceRoleARNUpdate: js.UndefOr[RoleARN]
  }

  object S3ReferenceDataSourceUpdate {
    @inline
    def apply(
        BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined,
        FileKeyUpdate: js.UndefOr[FileKey] = js.undefined,
        ReferenceRoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
    ): S3ReferenceDataSourceUpdate = {
      val __obj = js.Dynamic.literal()
      BucketARNUpdate.foreach(__v => __obj.updateDynamic("BucketARNUpdate")(__v.asInstanceOf[js.Any]))
      FileKeyUpdate.foreach(__v => __obj.updateDynamic("FileKeyUpdate")(__v.asInstanceOf[js.Any]))
      ReferenceRoleARNUpdate.foreach(__v => __obj.updateDynamic("ReferenceRoleARNUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ReferenceDataSourceUpdate]
    }
  }

  /** Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  @js.native
  trait SourceSchema extends js.Object {
    var RecordColumns: RecordColumns
    var RecordFormat: RecordFormat
    var RecordEncoding: js.UndefOr[RecordEncoding]
  }

  object SourceSchema {
    @inline
    def apply(
        RecordColumns: RecordColumns,
        RecordFormat: RecordFormat,
        RecordEncoding: js.UndefOr[RecordEncoding] = js.undefined
    ): SourceSchema = {
      val __obj = js.Dynamic.literal(
        "RecordColumns" -> RecordColumns.asInstanceOf[js.Any],
        "RecordFormat" -> RecordFormat.asInstanceOf[js.Any]
      )

      RecordEncoding.foreach(__v => __obj.updateDynamic("RecordEncoding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceSchema]
    }
  }

  /** <p/>
    */
  @js.native
  trait StartApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var InputConfigurations: InputConfigurations
  }

  object StartApplicationRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        InputConfigurations: InputConfigurations
    ): StartApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "InputConfigurations" -> InputConfigurations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartApplicationRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait StartApplicationResponse extends js.Object

  object StartApplicationResponse {
    @inline
    def apply(): StartApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartApplicationResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait StopApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
  }

  object StopApplicationRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName
    ): StopApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopApplicationRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait StopApplicationResponse extends js.Object

  object StopApplicationResponse {
    @inline
    def apply(): StopApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopApplicationResponse]
    }
  }

  /** A key-value pair (the value is optional) that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see [[https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-tagging.html|Using Tagging]].
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
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
  trait TagResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: KinesisAnalyticsARN,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: KinesisAnalyticsARN
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: KinesisAnalyticsARN,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var ApplicationUpdate: ApplicationUpdate
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        ApplicationUpdate: ApplicationUpdate,
        CurrentApplicationVersionId: ApplicationVersionId
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationUpdate" -> ApplicationUpdate.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object

  object UpdateApplicationResponse {
    @inline
    def apply(): UpdateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }
}
