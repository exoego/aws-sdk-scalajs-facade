package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisanalytics {
  type ApplicationCode = String
  type ApplicationDescription = String
  type ApplicationName = String
  type ApplicationStatus = String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type ApplicationVersionId = Double
  type BooleanObject = Boolean
  type BucketARN = String
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]
  type ErrorMessage = String
  type FileKey = String
  type Id = String
  type InAppStreamName = String
  type InAppStreamNames = js.Array[InAppStreamName]
  type InAppTableName = String
  type InputConfigurations = js.Array[InputConfiguration]
  type InputDescriptions = js.Array[InputDescription]
  type InputParallelismCount = Int
  type InputStartingPosition = String
  type InputUpdates = js.Array[InputUpdate]
  type Inputs = js.Array[Input]
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
  type RecordFormatType = String
  type RecordRowDelimiter = String
  type RecordRowPath = String
  type ReferenceDataSourceDescriptions = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[ReferenceDataSourceUpdate]
  type ResourceARN = String
  type RoleARN = String
  type Timestamp = js.Date
}

package kinesisanalytics {
  @js.native
  @JSImport("aws-sdk", "KinesisAnalytics")
  class KinesisAnalytics(config: AWSConfig) extends js.Object {
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
    def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse] = js.native
    def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
  }

  @js.native
  trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var CloudWatchLoggingOption: js.UndefOr[CloudWatchLoggingOption]
  }

  object AddApplicationCloudWatchLoggingOptionRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      CloudWatchLoggingOption: js.UndefOr[CloudWatchLoggingOption] = js.undefined): AddApplicationCloudWatchLoggingOptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOption" -> CloudWatchLoggingOption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationCloudWatchLoggingOptionRequest]
    }
  }

  @js.native
  trait AddApplicationCloudWatchLoggingOptionResponse extends js.Object {

  }

  object AddApplicationCloudWatchLoggingOptionResponse {
    def apply(): AddApplicationCloudWatchLoggingOptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationCloudWatchLoggingOptionResponse]
    }
  }

  @js.native
  trait AddApplicationInputProcessingConfigurationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var InputId: js.UndefOr[Id]
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
  }

  object AddApplicationInputProcessingConfigurationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      InputId: js.UndefOr[Id] = js.undefined,
      InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined): AddApplicationInputProcessingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "InputId" -> InputId.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfiguration" -> InputProcessingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationInputProcessingConfigurationRequest]
    }
  }

  @js.native
  trait AddApplicationInputProcessingConfigurationResponse extends js.Object {

  }

  object AddApplicationInputProcessingConfigurationResponse {
    def apply(): AddApplicationInputProcessingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationInputProcessingConfigurationResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddApplicationInputRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var Input: js.UndefOr[Input]
  }

  object AddApplicationInputRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      Input: js.UndefOr[Input] = js.undefined): AddApplicationInputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "Input" -> Input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationInputRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddApplicationInputResponse extends js.Object {

  }

  object AddApplicationInputResponse {
    def apply(): AddApplicationInputResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationInputResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddApplicationOutputRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var Output: js.UndefOr[Output]
  }

  object AddApplicationOutputRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      Output: js.UndefOr[Output] = js.undefined): AddApplicationOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "Output" -> Output.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationOutputRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddApplicationOutputResponse extends js.Object {

  }

  object AddApplicationOutputResponse {
    def apply(): AddApplicationOutputResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationOutputResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddApplicationReferenceDataSourceRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ReferenceDataSource: js.UndefOr[ReferenceDataSource]
  }

  object AddApplicationReferenceDataSourceRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      ReferenceDataSource: js.UndefOr[ReferenceDataSource] = js.undefined): AddApplicationReferenceDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSource" -> ReferenceDataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationReferenceDataSourceRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddApplicationReferenceDataSourceResponse extends js.Object {

  }

  object AddApplicationReferenceDataSourceResponse {
    def apply(): AddApplicationReferenceDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddApplicationReferenceDataSourceResponse]
    }
  }

  /**
   * <p>Provides a description of the application, including the application Amazon Resource Name (ARN), status, latest version, and input and output configuration.</p>
   */
  @js.native
  trait ApplicationDetail extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var InputDescriptions: js.UndefOr[InputDescriptions]
    var OutputDescriptions: js.UndefOr[OutputDescriptions]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
    var CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions]
    var ApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ApplicationName: js.UndefOr[ApplicationName]
    var ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions]
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationCode: js.UndefOr[ApplicationCode]
  }

  object ApplicationDetail {
    def apply(
      CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      InputDescriptions: js.UndefOr[InputDescriptions] = js.undefined,
      OutputDescriptions: js.UndefOr[OutputDescriptions] = js.undefined,
      ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
      ApplicationStatus: js.UndefOr[ApplicationStatus] = js.undefined,
      CloudWatchLoggingOptionDescriptions: js.UndefOr[CloudWatchLoggingOptionDescriptions] = js.undefined,
      ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined,
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationCode: js.UndefOr[ApplicationCode] = js.undefined): ApplicationDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateTimestamp" -> LastUpdateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "InputDescriptions" -> InputDescriptions.map { x => x.asInstanceOf[js.Any] },
        "OutputDescriptions" -> OutputDescriptions.map { x => x.asInstanceOf[js.Any] },
        "ApplicationDescription" -> ApplicationDescription.map { x => x.asInstanceOf[js.Any] },
        "ApplicationStatus" -> ApplicationStatus.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptionDescriptions" -> CloudWatchLoggingOptionDescriptions.map { x => x.asInstanceOf[js.Any] },
        "ApplicationVersionId" -> ApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSourceDescriptions" -> ReferenceDataSourceDescriptions.map { x => x.asInstanceOf[js.Any] },
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationCode" -> ApplicationCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDetail]
    }
  }

  object ApplicationStatusEnum {
    val DELETING = "DELETING"
    val STARTING = "STARTING"
    val STOPPING = "STOPPING"
    val READY = "READY"
    val RUNNING = "RUNNING"
    val UPDATING = "UPDATING"

    val values = IndexedSeq(DELETING, STARTING, STOPPING, READY, RUNNING, UPDATING)
  }

  /**
   * <p>Provides application summary information, including the application Amazon Resource Name (ARN), name, and status.</p>
   */
  @js.native
  trait ApplicationSummary extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var ApplicationARN: js.UndefOr[ResourceARN]
    var ApplicationStatus: js.UndefOr[ApplicationStatus]
  }

  object ApplicationSummary {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      ApplicationARN: js.UndefOr[ResourceARN] = js.undefined,
      ApplicationStatus: js.UndefOr[ApplicationStatus] = js.undefined): ApplicationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "ApplicationARN" -> ApplicationARN.map { x => x.asInstanceOf[js.Any] },
        "ApplicationStatus" -> ApplicationStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSummary]
    }
  }

  /**
   * <p>Describes updates to apply to an existing Amazon Kinesis Analytics application.</p>
   */
  @js.native
  trait ApplicationUpdate extends js.Object {
    var CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates]
    var OutputUpdates: js.UndefOr[OutputUpdates]
    var ApplicationCodeUpdate: js.UndefOr[ApplicationCode]
    var ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates]
    var InputUpdates: js.UndefOr[InputUpdates]
  }

  object ApplicationUpdate {
    def apply(
      CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined,
      OutputUpdates: js.UndefOr[OutputUpdates] = js.undefined,
      ApplicationCodeUpdate: js.UndefOr[ApplicationCode] = js.undefined,
      ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates] = js.undefined,
      InputUpdates: js.UndefOr[InputUpdates] = js.undefined): ApplicationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptionUpdates" -> CloudWatchLoggingOptionUpdates.map { x => x.asInstanceOf[js.Any] },
        "OutputUpdates" -> OutputUpdates.map { x => x.asInstanceOf[js.Any] },
        "ApplicationCodeUpdate" -> ApplicationCodeUpdate.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSourceUpdates" -> ReferenceDataSourceUpdates.map { x => x.asInstanceOf[js.Any] },
        "InputUpdates" -> InputUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationUpdate]
    }
  }

  /**
   * <p>Provides additional mapping information when the record format uses delimiters, such as CSV. For example, the following sample records use CSV format, where the records use the <i>'\n'</i> as the row delimiter and a comma (",") as the column delimiter: </p> <p> <code>"name1", "address1" </code> </p> <p> <code>"name2, "address2"</code> </p>
   */
  @js.native
  trait CSVMappingParameters extends js.Object {
    var RecordRowDelimiter: js.UndefOr[RecordRowDelimiter]
    var RecordColumnDelimiter: js.UndefOr[RecordColumnDelimiter]
  }

  object CSVMappingParameters {
    def apply(
      RecordRowDelimiter: js.UndefOr[RecordRowDelimiter] = js.undefined,
      RecordColumnDelimiter: js.UndefOr[RecordColumnDelimiter] = js.undefined): CSVMappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordRowDelimiter" -> RecordRowDelimiter.map { x => x.asInstanceOf[js.Any] },
        "RecordColumnDelimiter" -> RecordColumnDelimiter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVMappingParameters]
    }
  }

  /**
   * <p>Provides a description of CloudWatch logging options, including the log stream Amazon Resource Name (ARN) and the role ARN.</p>
   */
  @js.native
  trait CloudWatchLoggingOption extends js.Object {
    var LogStreamARN: js.UndefOr[LogStreamARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object CloudWatchLoggingOption {
    def apply(
      LogStreamARN: js.UndefOr[LogStreamARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): CloudWatchLoggingOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogStreamARN" -> LogStreamARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOption]
    }
  }

  /**
   * <p>Description of the CloudWatch logging option.</p>
   */
  @js.native
  trait CloudWatchLoggingOptionDescription extends js.Object {
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
    var LogStreamARN: js.UndefOr[LogStreamARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object CloudWatchLoggingOptionDescription {
    def apply(
      CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined,
      LogStreamARN: js.UndefOr[LogStreamARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): CloudWatchLoggingOptionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.map { x => x.asInstanceOf[js.Any] },
        "LogStreamARN" -> LogStreamARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOptionDescription]
    }
  }

  /**
   * <p>Describes CloudWatch logging option updates.</p>
   */
  @js.native
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object CloudWatchLoggingOptionUpdate {
    def apply(
      CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined,
      LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined,
      RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): CloudWatchLoggingOptionUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.map { x => x.asInstanceOf[js.Any] },
        "LogStreamARNUpdate" -> LogStreamARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "RoleARNUpdate" -> RoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOptionUpdate]
    }
  }

  /**
   * <p>User-provided application code (query) is invalid. This can be a simple syntax error.</p>
   */
  @js.native
  trait CodeValidationExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Exception thrown as a result of concurrent modification to an application. For example, two individuals attempting to edit the same application at the same time.</p>
   */
  @js.native
  trait ConcurrentModificationExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>TBD</p>
   */
  @js.native
  trait CreateApplicationRequest extends js.Object {
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var Inputs: js.UndefOr[Inputs]
    var ApplicationName: js.UndefOr[ApplicationName]
    var ApplicationCode: js.UndefOr[ApplicationCode]
    var Outputs: js.UndefOr[Outputs]
  }

  object CreateApplicationRequest {
    def apply(
      ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      Inputs: js.UndefOr[Inputs] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      ApplicationCode: js.UndefOr[ApplicationCode] = js.undefined,
      Outputs: js.UndefOr[Outputs] = js.undefined): CreateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationDescription" -> ApplicationDescription.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "ApplicationCode" -> ApplicationCode.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationRequest]
    }
  }

  /**
   * <p>TBD</p>
   */
  @js.native
  trait CreateApplicationResponse extends js.Object {
    var ApplicationSummary: js.UndefOr[ApplicationSummary]
  }

  object CreateApplicationResponse {
    def apply(
      ApplicationSummary: js.UndefOr[ApplicationSummary] = js.undefined): CreateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationSummary" -> ApplicationSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
  }

  object DeleteApplicationCloudWatchLoggingOptionRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined): DeleteApplicationCloudWatchLoggingOptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationCloudWatchLoggingOptionRequest]
    }
  }

  @js.native
  trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object {

  }

  object DeleteApplicationCloudWatchLoggingOptionResponse {
    def apply(): DeleteApplicationCloudWatchLoggingOptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationCloudWatchLoggingOptionResponse]
    }
  }

  @js.native
  trait DeleteApplicationInputProcessingConfigurationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var InputId: js.UndefOr[Id]
  }

  object DeleteApplicationInputProcessingConfigurationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      InputId: js.UndefOr[Id] = js.undefined): DeleteApplicationInputProcessingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "InputId" -> InputId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationInputProcessingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteApplicationInputProcessingConfigurationResponse extends js.Object {

  }

  object DeleteApplicationInputProcessingConfigurationResponse {
    def apply(): DeleteApplicationInputProcessingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationInputProcessingConfigurationResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteApplicationOutputRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var OutputId: js.UndefOr[Id]
  }

  object DeleteApplicationOutputRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      OutputId: js.UndefOr[Id] = js.undefined): DeleteApplicationOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "OutputId" -> OutputId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationOutputRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteApplicationOutputResponse extends js.Object {

  }

  object DeleteApplicationOutputResponse {
    def apply(): DeleteApplicationOutputResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationOutputResponse]
    }
  }

  @js.native
  trait DeleteApplicationReferenceDataSourceRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ReferenceId: js.UndefOr[Id]
  }

  object DeleteApplicationReferenceDataSourceRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      ReferenceId: js.UndefOr[Id] = js.undefined): DeleteApplicationReferenceDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "ReferenceId" -> ReferenceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationReferenceDataSourceRequest]
    }
  }

  @js.native
  trait DeleteApplicationReferenceDataSourceResponse extends js.Object {

  }

  object DeleteApplicationReferenceDataSourceResponse {
    def apply(): DeleteApplicationReferenceDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationReferenceDataSourceResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CreateTimestamp: js.UndefOr[Timestamp]
  }

  object DeleteApplicationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CreateTimestamp: js.UndefOr[Timestamp] = js.undefined): DeleteApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteApplicationResponse extends js.Object {

  }

  object DeleteApplicationResponse {
    def apply(): DeleteApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeApplicationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
  }

  object DescribeApplicationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined): DescribeApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeApplicationResponse extends js.Object {
    var ApplicationDetail: js.UndefOr[ApplicationDetail]
  }

  object DescribeApplicationResponse {
    def apply(
      ApplicationDetail: js.UndefOr[ApplicationDetail] = js.undefined): DescribeApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationDetail" -> ApplicationDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationResponse]
    }
  }

  /**
   * <p>Describes the data format when records are written to the destination. For more information, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application Output</a>. </p>
   */
  @js.native
  trait DestinationSchema extends js.Object {
    var RecordFormatType: js.UndefOr[RecordFormatType]
  }

  object DestinationSchema {
    def apply(
      RecordFormatType: js.UndefOr[RecordFormatType] = js.undefined): DestinationSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordFormatType" -> RecordFormatType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DestinationSchema]
    }
  }

  @js.native
  trait DiscoverInputSchemaRequest extends js.Object {
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var S3Configuration: js.UndefOr[S3Configuration]
  }

  object DiscoverInputSchemaRequest {
    def apply(
      InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined,
      S3Configuration: js.UndefOr[S3Configuration] = js.undefined): DiscoverInputSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfiguration" -> InputProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "S3Configuration" -> S3Configuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverInputSchemaRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DiscoverInputSchemaResponse extends js.Object {
    var InputSchema: js.UndefOr[SourceSchema]
    var ParsedInputRecords: js.UndefOr[ParsedInputRecords]
    var ProcessedInputRecords: js.UndefOr[ProcessedInputRecords]
    var RawInputRecords: js.UndefOr[RawInputRecords]
  }

  object DiscoverInputSchemaResponse {
    def apply(
      InputSchema: js.UndefOr[SourceSchema] = js.undefined,
      ParsedInputRecords: js.UndefOr[ParsedInputRecords] = js.undefined,
      ProcessedInputRecords: js.UndefOr[ProcessedInputRecords] = js.undefined,
      RawInputRecords: js.UndefOr[RawInputRecords] = js.undefined): DiscoverInputSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSchema" -> InputSchema.map { x => x.asInstanceOf[js.Any] },
        "ParsedInputRecords" -> ParsedInputRecords.map { x => x.asInstanceOf[js.Any] },
        "ProcessedInputRecords" -> ProcessedInputRecords.map { x => x.asInstanceOf[js.Any] },
        "RawInputRecords" -> RawInputRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiscoverInputSchemaResponse]
    }
  }

  /**
   * <p>When you configure the application input, you specify the streaming source, the in-application stream name that is created, and the mapping between the two. For more information, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application Input</a>. </p>
   */
  @js.native
  trait Input extends js.Object {
    var KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput]
    var InputSchema: js.UndefOr[SourceSchema]
    var InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration]
    var KinesisStreamsInput: js.UndefOr[KinesisStreamsInput]
    var NamePrefix: js.UndefOr[InAppStreamName]
    var InputParallelism: js.UndefOr[InputParallelism]
  }

  object Input {
    def apply(
      KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput] = js.undefined,
      InputSchema: js.UndefOr[SourceSchema] = js.undefined,
      InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined,
      KinesisStreamsInput: js.UndefOr[KinesisStreamsInput] = js.undefined,
      NamePrefix: js.UndefOr[InAppStreamName] = js.undefined,
      InputParallelism: js.UndefOr[InputParallelism] = js.undefined): Input = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KinesisFirehoseInput" -> KinesisFirehoseInput.map { x => x.asInstanceOf[js.Any] },
        "InputSchema" -> InputSchema.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfiguration" -> InputProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsInput" -> KinesisStreamsInput.map { x => x.asInstanceOf[js.Any] },
        "NamePrefix" -> NamePrefix.map { x => x.asInstanceOf[js.Any] },
        "InputParallelism" -> InputParallelism.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Input]
    }
  }

  /**
   * <p>When you start your application, you provide this configuration, which identifies the input source and the point in the input source at which you want the application to start processing records.</p>
   */
  @js.native
  trait InputConfiguration extends js.Object {
    var Id: js.UndefOr[Id]
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
  }

  object InputConfiguration {
    def apply(
      Id: js.UndefOr[Id] = js.undefined,
      InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined): InputConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputConfiguration]
    }
  }

  /**
   * <p>Describes the application input configuration. For more information, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application Input</a>. </p>
   */
  @js.native
  trait InputDescription extends js.Object {
    var InputSchema: js.UndefOr[SourceSchema]
    var InAppStreamNames: js.UndefOr[InAppStreamNames]
    var InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration]
    var KinesisFirehoseInputDescription: js.UndefOr[KinesisFirehoseInputDescription]
    var InputId: js.UndefOr[Id]
    var NamePrefix: js.UndefOr[InAppStreamName]
    var InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription]
    var KinesisStreamsInputDescription: js.UndefOr[KinesisStreamsInputDescription]
    var InputParallelism: js.UndefOr[InputParallelism]
  }

  object InputDescription {
    def apply(
      InputSchema: js.UndefOr[SourceSchema] = js.undefined,
      InAppStreamNames: js.UndefOr[InAppStreamNames] = js.undefined,
      InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined,
      KinesisFirehoseInputDescription: js.UndefOr[KinesisFirehoseInputDescription] = js.undefined,
      InputId: js.UndefOr[Id] = js.undefined,
      NamePrefix: js.UndefOr[InAppStreamName] = js.undefined,
      InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription] = js.undefined,
      KinesisStreamsInputDescription: js.UndefOr[KinesisStreamsInputDescription] = js.undefined,
      InputParallelism: js.UndefOr[InputParallelism] = js.undefined): InputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSchema" -> InputSchema.map { x => x.asInstanceOf[js.Any] },
        "InAppStreamNames" -> InAppStreamNames.map { x => x.asInstanceOf[js.Any] },
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseInputDescription" -> KinesisFirehoseInputDescription.map { x => x.asInstanceOf[js.Any] },
        "InputId" -> InputId.map { x => x.asInstanceOf[js.Any] },
        "NamePrefix" -> NamePrefix.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfigurationDescription" -> InputProcessingConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsInputDescription" -> KinesisStreamsInputDescription.map { x => x.asInstanceOf[js.Any] },
        "InputParallelism" -> InputParallelism.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputDescription]
    }
  }

  /**
   * <p>An object that contains the Amazon Resource Name (ARN) of the <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a> function that is used to preprocess records in the stream, and the ARN of the IAM role that is used to access the AWS Lambda function. </p>
   */
  @js.native
  trait InputLambdaProcessor extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object InputLambdaProcessor {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): InputLambdaProcessor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessor]
    }
  }

  /**
   * <p>An object that contains the Amazon Resource Name (ARN) of the <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a> function that is used to preprocess records in the stream, and the ARN of the IAM role that is used to access the AWS Lambda expression.</p>
   */
  @js.native
  trait InputLambdaProcessorDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object InputLambdaProcessorDescription {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): InputLambdaProcessorDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessorDescription]
    }
  }

  /**
   * <p>Represents an update to the <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream.</p>
   */
  @js.native
  trait InputLambdaProcessorUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object InputLambdaProcessorUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
      RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): InputLambdaProcessorUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "RoleARNUpdate" -> RoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessorUpdate]
    }
  }

  /**
   * <p>Describes the number of in-application streams to create for a given streaming source. For information about parallelism, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application Input</a>. </p>
   */
  @js.native
  trait InputParallelism extends js.Object {
    var Count: js.UndefOr[InputParallelismCount]
  }

  object InputParallelism {
    def apply(
      Count: js.UndefOr[InputParallelismCount] = js.undefined): InputParallelism = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputParallelism]
    }
  }

  /**
   * <p>Provides updates to the parallelism count.</p>
   */
  @js.native
  trait InputParallelismUpdate extends js.Object {
    var CountUpdate: js.UndefOr[InputParallelismCount]
  }

  object InputParallelismUpdate {
    def apply(
      CountUpdate: js.UndefOr[InputParallelismCount] = js.undefined): InputParallelismUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CountUpdate" -> CountUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputParallelismUpdate]
    }
  }

  /**
   * <p>Provides a description of a processor that is used to preprocess the records in the stream before being processed by your application code. Currently, the only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.</p>
   */
  @js.native
  trait InputProcessingConfiguration extends js.Object {
    var InputLambdaProcessor: js.UndefOr[InputLambdaProcessor]
  }

  object InputProcessingConfiguration {
    def apply(
      InputLambdaProcessor: js.UndefOr[InputLambdaProcessor] = js.undefined): InputProcessingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLambdaProcessor" -> InputLambdaProcessor.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputProcessingConfiguration]
    }
  }

  /**
   * <p>Provides configuration information about an input processor. Currently, the only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.</p>
   */
  @js.native
  trait InputProcessingConfigurationDescription extends js.Object {
    var InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription]
  }

  object InputProcessingConfigurationDescription {
    def apply(
      InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription] = js.undefined): InputProcessingConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLambdaProcessorDescription" -> InputLambdaProcessorDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputProcessingConfigurationDescription]
    }
  }

  /**
   * <p>Describes updates to an <a>InputProcessingConfiguration</a>. </p>
   */
  @js.native
  trait InputProcessingConfigurationUpdate extends js.Object {
    var InputLambdaProcessorUpdate: js.UndefOr[InputLambdaProcessorUpdate]
  }

  object InputProcessingConfigurationUpdate {
    def apply(
      InputLambdaProcessorUpdate: js.UndefOr[InputLambdaProcessorUpdate] = js.undefined): InputProcessingConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLambdaProcessorUpdate" -> InputLambdaProcessorUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputProcessingConfigurationUpdate]
    }
  }

  /**
   * <p>Describes updates for the application's input schema.</p>
   */
  @js.native
  trait InputSchemaUpdate extends js.Object {
    var RecordFormatUpdate: js.UndefOr[RecordFormat]
    var RecordEncodingUpdate: js.UndefOr[RecordEncoding]
    var RecordColumnUpdates: js.UndefOr[RecordColumns]
  }

  object InputSchemaUpdate {
    def apply(
      RecordFormatUpdate: js.UndefOr[RecordFormat] = js.undefined,
      RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.undefined,
      RecordColumnUpdates: js.UndefOr[RecordColumns] = js.undefined): InputSchemaUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordFormatUpdate" -> RecordFormatUpdate.map { x => x.asInstanceOf[js.Any] },
        "RecordEncodingUpdate" -> RecordEncodingUpdate.map { x => x.asInstanceOf[js.Any] },
        "RecordColumnUpdates" -> RecordColumnUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSchemaUpdate]
    }
  }

  object InputStartingPositionEnum {
    val NOW = "NOW"
    val TRIM_HORIZON = "TRIM_HORIZON"
    val LAST_STOPPED_POINT = "LAST_STOPPED_POINT"

    val values = IndexedSeq(NOW, TRIM_HORIZON, LAST_STOPPED_POINT)
  }

  /**
   * <p>Describes the point at which the application reads from the streaming source.</p>
   */
  @js.native
  trait InputStartingPositionConfiguration extends js.Object {
    var InputStartingPosition: js.UndefOr[InputStartingPosition]
  }

  object InputStartingPositionConfiguration {
    def apply(
      InputStartingPosition: js.UndefOr[InputStartingPosition] = js.undefined): InputStartingPositionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputStartingPosition" -> InputStartingPosition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputStartingPositionConfiguration]
    }
  }

  /**
   * <p>Describes updates to a specific input configuration (identified by the <code>InputId</code> of an application). </p>
   */
  @js.native
  trait InputUpdate extends js.Object {
    var NamePrefixUpdate: js.UndefOr[InAppStreamName]
    var KinesisStreamsInputUpdate: js.UndefOr[KinesisStreamsInputUpdate]
    var InputSchemaUpdate: js.UndefOr[InputSchemaUpdate]
    var InputProcessingConfigurationUpdate: js.UndefOr[InputProcessingConfigurationUpdate]
    var InputParallelismUpdate: js.UndefOr[InputParallelismUpdate]
    var KinesisFirehoseInputUpdate: js.UndefOr[KinesisFirehoseInputUpdate]
    var InputId: js.UndefOr[Id]
  }

  object InputUpdate {
    def apply(
      NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.undefined,
      KinesisStreamsInputUpdate: js.UndefOr[KinesisStreamsInputUpdate] = js.undefined,
      InputSchemaUpdate: js.UndefOr[InputSchemaUpdate] = js.undefined,
      InputProcessingConfigurationUpdate: js.UndefOr[InputProcessingConfigurationUpdate] = js.undefined,
      InputParallelismUpdate: js.UndefOr[InputParallelismUpdate] = js.undefined,
      KinesisFirehoseInputUpdate: js.UndefOr[KinesisFirehoseInputUpdate] = js.undefined,
      InputId: js.UndefOr[Id] = js.undefined): InputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamePrefixUpdate" -> NamePrefixUpdate.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsInputUpdate" -> KinesisStreamsInputUpdate.map { x => x.asInstanceOf[js.Any] },
        "InputSchemaUpdate" -> InputSchemaUpdate.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfigurationUpdate" -> InputProcessingConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "InputParallelismUpdate" -> InputParallelismUpdate.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseInputUpdate" -> KinesisFirehoseInputUpdate.map { x => x.asInstanceOf[js.Any] },
        "InputId" -> InputId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputUpdate]
    }
  }

  /**
   * <p>User-provided application configuration is not valid.</p>
   */
  @js.native
  trait InvalidApplicationConfigurationExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Specified input parameter value is invalid.</p>
   */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Provides additional mapping information when JSON is the record format on the streaming source.</p>
   */
  @js.native
  trait JSONMappingParameters extends js.Object {
    var RecordRowPath: js.UndefOr[RecordRowPath]
  }

  object JSONMappingParameters {
    def apply(
      RecordRowPath: js.UndefOr[RecordRowPath] = js.undefined): JSONMappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordRowPath" -> RecordRowPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JSONMappingParameters]
    }
  }

  /**
   * <p> Identifies an Amazon Kinesis Firehose delivery stream as the streaming source. You provide the delivery stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon Kinesis Analytics to access the stream on your behalf.</p>
   */
  @js.native
  trait KinesisFirehoseInput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisFirehoseInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInput]
    }
  }

  /**
   * <p> Describes the Amazon Kinesis Firehose delivery stream that is configured as the streaming source in the application input configuration. </p>
   */
  @js.native
  trait KinesisFirehoseInputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseInputDescription {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisFirehoseInputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInputDescription]
    }
  }

  /**
   * <p>When updating application input configuration, provides information about an Amazon Kinesis Firehose delivery stream as the streaming source.</p>
   */
  @js.native
  trait KinesisFirehoseInputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseInputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
      RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): KinesisFirehoseInputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "RoleARNUpdate" -> RoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInputUpdate]
    }
  }

  /**
   * <p>When configuring application output, identifies an Amazon Kinesis Firehose delivery stream as the destination. You provide the stream Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to write to the stream on your behalf.</p>
   */
  @js.native
  trait KinesisFirehoseOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisFirehoseOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutput]
    }
  }

  /**
   * <p> For an application output, describes the Amazon Kinesis Firehose delivery stream configured as its destination. </p>
   */
  @js.native
  trait KinesisFirehoseOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseOutputDescription {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisFirehoseOutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutputDescription]
    }
  }

  /**
   * <p> When updating an output configuration using the <a>UpdateApplication</a> operation, provides information about an Amazon Kinesis Firehose delivery stream configured as the destination. </p>
   */
  @js.native
  trait KinesisFirehoseOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object KinesisFirehoseOutputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
      RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): KinesisFirehoseOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "RoleARNUpdate" -> RoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutputUpdate]
    }
  }

  /**
   * <p> Identifies an Amazon Kinesis stream as the streaming source. You provide the stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon Kinesis Analytics to access the stream on your behalf.</p>
   */
  @js.native
  trait KinesisStreamsInput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamsInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInput]
    }
  }

  /**
   * <p> Describes the Amazon Kinesis stream that is configured as the streaming source in the application input configuration. </p>
   */
  @js.native
  trait KinesisStreamsInputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamsInputDescription {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisStreamsInputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInputDescription]
    }
  }

  /**
   * <p>When updating application input configuration, provides information about an Amazon Kinesis stream as the streaming source.</p>
   */
  @js.native
  trait KinesisStreamsInputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object KinesisStreamsInputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
      RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): KinesisStreamsInputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "RoleARNUpdate" -> RoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInputUpdate]
    }
  }

  /**
   * <p>When configuring application output, identifies an Amazon Kinesis stream as the destination. You provide the stream Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis Analytics can use to write to the stream on your behalf.</p>
   */
  @js.native
  trait KinesisStreamsOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamsOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutput]
    }
  }

  /**
   * <p> For an application output, describes the Amazon Kinesis stream configured as its destination. </p>
   */
  @js.native
  trait KinesisStreamsOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object KinesisStreamsOutputDescription {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): KinesisStreamsOutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutputDescription]
    }
  }

  /**
   * <p> When updating an output configuration using the <a>UpdateApplication</a> operation, provides information about an Amazon Kinesis stream configured as the destination. </p>
   */
  @js.native
  trait KinesisStreamsOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object KinesisStreamsOutputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
      RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): KinesisStreamsOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "RoleARNUpdate" -> RoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutputUpdate]
    }
  }

  /**
   * <p>When configuring application output, identifies an AWS Lambda function as the destination. You provide the function Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis Analytics can use to write to the function on your behalf. </p>
   */
  @js.native
  trait LambdaOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object LambdaOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): LambdaOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutput]
    }
  }

  /**
   * <p>For an application output, describes the AWS Lambda function configured as its destination. </p>
   */
  @js.native
  trait LambdaOutputDescription extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var RoleARN: js.UndefOr[RoleARN]
  }

  object LambdaOutputDescription {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined): LambdaOutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutputDescription]
    }
  }

  /**
   * <p>When updating an output configuration using the <a>UpdateApplication</a> operation, provides information about an AWS Lambda function configured as the destination.</p>
   */
  @js.native
  trait LambdaOutputUpdate extends js.Object {
    var ResourceARNUpdate: js.UndefOr[ResourceARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object LambdaOutputUpdate {
    def apply(
      ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined,
      RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): LambdaOutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNUpdate" -> ResourceARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "RoleARNUpdate" -> RoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutputUpdate]
    }
  }

  /**
   * <p>Exceeded the number of applications allowed.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p/>
   */
  @js.native
  trait ListApplicationsRequest extends js.Object {
    var Limit: js.UndefOr[ListApplicationsInputLimit]
    var ExclusiveStartApplicationName: js.UndefOr[ApplicationName]
  }

  object ListApplicationsRequest {
    def apply(
      Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined,
      ExclusiveStartApplicationName: js.UndefOr[ApplicationName] = js.undefined): ListApplicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartApplicationName" -> ExclusiveStartApplicationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListApplicationsResponse extends js.Object {
    var ApplicationSummaries: js.UndefOr[ApplicationSummaries]
    var HasMoreApplications: js.UndefOr[BooleanObject]
  }

  object ListApplicationsResponse {
    def apply(
      ApplicationSummaries: js.UndefOr[ApplicationSummaries] = js.undefined,
      HasMoreApplications: js.UndefOr[BooleanObject] = js.undefined): ListApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationSummaries" -> ApplicationSummaries.map { x => x.asInstanceOf[js.Any] },
        "HasMoreApplications" -> HasMoreApplications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsResponse]
    }
  }

  /**
   * <p>When configuring application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.</p>
   */
  @js.native
  trait MappingParameters extends js.Object {
    var JSONMappingParameters: js.UndefOr[JSONMappingParameters]
    var CSVMappingParameters: js.UndefOr[CSVMappingParameters]
  }

  object MappingParameters {
    def apply(
      JSONMappingParameters: js.UndefOr[JSONMappingParameters] = js.undefined,
      CSVMappingParameters: js.UndefOr[CSVMappingParameters] = js.undefined): MappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JSONMappingParameters" -> JSONMappingParameters.map { x => x.asInstanceOf[js.Any] },
        "CSVMappingParameters" -> CSVMappingParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MappingParameters]
    }
  }

  /**
   * <p> Describes application output configuration in which you identify an in-application stream and a destination where you want the in-application stream data to be written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream. </p> <p/> <p>For limits on how many destinations an application can write and other limitations, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>. </p>
   */
  @js.native
  trait Output extends js.Object {
    var Name: js.UndefOr[InAppStreamName]
    var DestinationSchema: js.UndefOr[DestinationSchema]
    var KinesisStreamsOutput: js.UndefOr[KinesisStreamsOutput]
    var LambdaOutput: js.UndefOr[LambdaOutput]
    var KinesisFirehoseOutput: js.UndefOr[KinesisFirehoseOutput]
  }

  object Output {
    def apply(
      Name: js.UndefOr[InAppStreamName] = js.undefined,
      DestinationSchema: js.UndefOr[DestinationSchema] = js.undefined,
      KinesisStreamsOutput: js.UndefOr[KinesisStreamsOutput] = js.undefined,
      LambdaOutput: js.UndefOr[LambdaOutput] = js.undefined,
      KinesisFirehoseOutput: js.UndefOr[KinesisFirehoseOutput] = js.undefined): Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DestinationSchema" -> DestinationSchema.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsOutput" -> KinesisStreamsOutput.map { x => x.asInstanceOf[js.Any] },
        "LambdaOutput" -> LambdaOutput.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseOutput" -> KinesisFirehoseOutput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Output]
    }
  }

  /**
   * <p>Describes the application output configuration, which includes the in-application stream name and the destination where the stream data is written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream. </p>
   */
  @js.native
  trait OutputDescription extends js.Object {
    var Name: js.UndefOr[InAppStreamName]
    var KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription]
    var DestinationSchema: js.UndefOr[DestinationSchema]
    var OutputId: js.UndefOr[Id]
    var LambdaOutputDescription: js.UndefOr[LambdaOutputDescription]
    var KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription]
  }

  object OutputDescription {
    def apply(
      Name: js.UndefOr[InAppStreamName] = js.undefined,
      KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription] = js.undefined,
      DestinationSchema: js.UndefOr[DestinationSchema] = js.undefined,
      OutputId: js.UndefOr[Id] = js.undefined,
      LambdaOutputDescription: js.UndefOr[LambdaOutputDescription] = js.undefined,
      KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription] = js.undefined): OutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsOutputDescription" -> KinesisStreamsOutputDescription.map { x => x.asInstanceOf[js.Any] },
        "DestinationSchema" -> DestinationSchema.map { x => x.asInstanceOf[js.Any] },
        "OutputId" -> OutputId.map { x => x.asInstanceOf[js.Any] },
        "LambdaOutputDescription" -> LambdaOutputDescription.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseOutputDescription" -> KinesisFirehoseOutputDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDescription]
    }
  }

  /**
   * <p> Describes updates to the output configuration identified by the <code>OutputId</code>. </p>
   */
  @js.native
  trait OutputUpdate extends js.Object {
    var DestinationSchemaUpdate: js.UndefOr[DestinationSchema]
    var NameUpdate: js.UndefOr[InAppStreamName]
    var OutputId: js.UndefOr[Id]
    var LambdaOutputUpdate: js.UndefOr[LambdaOutputUpdate]
    var KinesisStreamsOutputUpdate: js.UndefOr[KinesisStreamsOutputUpdate]
    var KinesisFirehoseOutputUpdate: js.UndefOr[KinesisFirehoseOutputUpdate]
  }

  object OutputUpdate {
    def apply(
      DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.undefined,
      NameUpdate: js.UndefOr[InAppStreamName] = js.undefined,
      OutputId: js.UndefOr[Id] = js.undefined,
      LambdaOutputUpdate: js.UndefOr[LambdaOutputUpdate] = js.undefined,
      KinesisStreamsOutputUpdate: js.UndefOr[KinesisStreamsOutputUpdate] = js.undefined,
      KinesisFirehoseOutputUpdate: js.UndefOr[KinesisFirehoseOutputUpdate] = js.undefined): OutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationSchemaUpdate" -> DestinationSchemaUpdate.map { x => x.asInstanceOf[js.Any] },
        "NameUpdate" -> NameUpdate.map { x => x.asInstanceOf[js.Any] },
        "OutputId" -> OutputId.map { x => x.asInstanceOf[js.Any] },
        "LambdaOutputUpdate" -> LambdaOutputUpdate.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsOutputUpdate" -> KinesisStreamsOutputUpdate.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseOutputUpdate" -> KinesisFirehoseOutputUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputUpdate]
    }
  }

  /**
   * <p>Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.</p> <p>Also used to describe the format of the reference data source.</p>
   */
  @js.native
  trait RecordColumn extends js.Object {
    var Name: js.UndefOr[RecordColumnName]
    var Mapping: js.UndefOr[RecordColumnMapping]
    var SqlType: js.UndefOr[RecordColumnSqlType]
  }

  object RecordColumn {
    def apply(
      Name: js.UndefOr[RecordColumnName] = js.undefined,
      Mapping: js.UndefOr[RecordColumnMapping] = js.undefined,
      SqlType: js.UndefOr[RecordColumnSqlType] = js.undefined): RecordColumn = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Mapping" -> Mapping.map { x => x.asInstanceOf[js.Any] },
        "SqlType" -> SqlType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordColumn]
    }
  }

  /**
   * <p> Describes the record format and relevant mapping information that should be applied to schematize the records on the stream. </p>
   */
  @js.native
  trait RecordFormat extends js.Object {
    var RecordFormatType: js.UndefOr[RecordFormatType]
    var MappingParameters: js.UndefOr[MappingParameters]
  }

  object RecordFormat {
    def apply(
      RecordFormatType: js.UndefOr[RecordFormatType] = js.undefined,
      MappingParameters: js.UndefOr[MappingParameters] = js.undefined): RecordFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordFormatType" -> RecordFormatType.map { x => x.asInstanceOf[js.Any] },
        "MappingParameters" -> MappingParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordFormat]
    }
  }

  object RecordFormatTypeEnum {
    val JSON = "JSON"
    val CSV = "CSV"

    val values = IndexedSeq(JSON, CSV)
  }

  /**
   * <p>Describes the reference data source by providing the source information (S3 bucket name and object key name), the resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon S3 object to the in-application table.</p>
   */
  @js.native
  trait ReferenceDataSource extends js.Object {
    var TableName: js.UndefOr[InAppTableName]
    var S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource]
    var ReferenceSchema: js.UndefOr[SourceSchema]
  }

  object ReferenceDataSource {
    def apply(
      TableName: js.UndefOr[InAppTableName] = js.undefined,
      S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource] = js.undefined,
      ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined): ReferenceDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "S3ReferenceDataSource" -> S3ReferenceDataSource.map { x => x.asInstanceOf[js.Any] },
        "ReferenceSchema" -> ReferenceSchema.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSource]
    }
  }

  /**
   * <p>Describes the reference data source configured for an application.</p>
   */
  @js.native
  trait ReferenceDataSourceDescription extends js.Object {
    var ReferenceId: js.UndefOr[Id]
    var TableName: js.UndefOr[InAppTableName]
    var S3ReferenceDataSourceDescription: js.UndefOr[S3ReferenceDataSourceDescription]
    var ReferenceSchema: js.UndefOr[SourceSchema]
  }

  object ReferenceDataSourceDescription {
    def apply(
      ReferenceId: js.UndefOr[Id] = js.undefined,
      TableName: js.UndefOr[InAppTableName] = js.undefined,
      S3ReferenceDataSourceDescription: js.UndefOr[S3ReferenceDataSourceDescription] = js.undefined,
      ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined): ReferenceDataSourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReferenceId" -> ReferenceId.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "S3ReferenceDataSourceDescription" -> S3ReferenceDataSourceDescription.map { x => x.asInstanceOf[js.Any] },
        "ReferenceSchema" -> ReferenceSchema.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSourceDescription]
    }
  }

  /**
   * <p>When you update a reference data source configuration for an application, this object provides all the updated values (such as the source bucket name and object key name), the in-application table name that is created, and updated mapping information that maps the data in the Amazon S3 object to the in-application reference table that is created.</p>
   */
  @js.native
  trait ReferenceDataSourceUpdate extends js.Object {
    var ReferenceId: js.UndefOr[Id]
    var TableNameUpdate: js.UndefOr[InAppTableName]
    var S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate]
    var ReferenceSchemaUpdate: js.UndefOr[SourceSchema]
  }

  object ReferenceDataSourceUpdate {
    def apply(
      ReferenceId: js.UndefOr[Id] = js.undefined,
      TableNameUpdate: js.UndefOr[InAppTableName] = js.undefined,
      S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate] = js.undefined,
      ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.undefined): ReferenceDataSourceUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReferenceId" -> ReferenceId.map { x => x.asInstanceOf[js.Any] },
        "TableNameUpdate" -> TableNameUpdate.map { x => x.asInstanceOf[js.Any] },
        "S3ReferenceDataSourceUpdate" -> S3ReferenceDataSourceUpdate.map { x => x.asInstanceOf[js.Any] },
        "ReferenceSchemaUpdate" -> ReferenceSchemaUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSourceUpdate]
    }
  }

  /**
   * <p>Application is not available for this operation.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Specified application can't be found.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Discovery failed to get a record from the streaming source because of the Amazon Kinesis Streams ProvisionedThroughputExceededException. For more information, see <a href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetRecords.html">GetRecords</a> in the Amazon Kinesis Streams API Reference.</p>
   */
  @js.native
  trait ResourceProvisionedThroughputExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Provides a description of an Amazon S3 data source, including the Amazon Resource Name (ARN) of the S3 bucket, the ARN of the IAM role that is used to access the bucket, and the name of the S3 object that contains the data.</p>
   */
  @js.native
  trait S3Configuration extends js.Object {
    var RoleARN: js.UndefOr[RoleARN]
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
  }

  object S3Configuration {
    def apply(
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      FileKey: js.UndefOr[FileKey] = js.undefined): S3Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "FileKey" -> FileKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Configuration]
    }
  }

  /**
   * <p>Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your behalf.</p> <p>An Amazon Kinesis Analytics application loads reference data only once. If the data changes, you call the <a>UpdateApplication</a> operation to trigger reloading of data into your application.</p>
   */
  @js.native
  trait S3ReferenceDataSource extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
    var ReferenceRoleARN: js.UndefOr[RoleARN]
  }

  object S3ReferenceDataSource {
    def apply(
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      FileKey: js.UndefOr[FileKey] = js.undefined,
      ReferenceRoleARN: js.UndefOr[RoleARN] = js.undefined): S3ReferenceDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "FileKey" -> FileKey.map { x => x.asInstanceOf[js.Any] },
        "ReferenceRoleARN" -> ReferenceRoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSource]
    }
  }

  /**
   * <p>Provides the bucket name and object key name that stores the reference data.</p>
   */
  @js.native
  trait S3ReferenceDataSourceDescription extends js.Object {
    var BucketARN: js.UndefOr[BucketARN]
    var FileKey: js.UndefOr[FileKey]
    var ReferenceRoleARN: js.UndefOr[RoleARN]
  }

  object S3ReferenceDataSourceDescription {
    def apply(
      BucketARN: js.UndefOr[BucketARN] = js.undefined,
      FileKey: js.UndefOr[FileKey] = js.undefined,
      ReferenceRoleARN: js.UndefOr[RoleARN] = js.undefined): S3ReferenceDataSourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.map { x => x.asInstanceOf[js.Any] },
        "FileKey" -> FileKey.map { x => x.asInstanceOf[js.Any] },
        "ReferenceRoleARN" -> ReferenceRoleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSourceDescription]
    }
  }

  /**
   * <p>Describes the S3 bucket name, object key name, and IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.</p>
   */
  @js.native
  trait S3ReferenceDataSourceUpdate extends js.Object {
    var BucketARNUpdate: js.UndefOr[BucketARN]
    var FileKeyUpdate: js.UndefOr[FileKey]
    var ReferenceRoleARNUpdate: js.UndefOr[RoleARN]
  }

  object S3ReferenceDataSourceUpdate {
    def apply(
      BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined,
      FileKeyUpdate: js.UndefOr[FileKey] = js.undefined,
      ReferenceRoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): S3ReferenceDataSourceUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARNUpdate" -> BucketARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "FileKeyUpdate" -> FileKeyUpdate.map { x => x.asInstanceOf[js.Any] },
        "ReferenceRoleARNUpdate" -> ReferenceRoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSourceUpdate]
    }
  }

  /**
   * <p>The service is unavailable, back off and retry the operation. </p>
   */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.</p>
   */
  @js.native
  trait SourceSchema extends js.Object {
    var RecordFormat: js.UndefOr[RecordFormat]
    var RecordEncoding: js.UndefOr[RecordEncoding]
    var RecordColumns: js.UndefOr[RecordColumns]
  }

  object SourceSchema {
    def apply(
      RecordFormat: js.UndefOr[RecordFormat] = js.undefined,
      RecordEncoding: js.UndefOr[RecordEncoding] = js.undefined,
      RecordColumns: js.UndefOr[RecordColumns] = js.undefined): SourceSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordFormat" -> RecordFormat.map { x => x.asInstanceOf[js.Any] },
        "RecordEncoding" -> RecordEncoding.map { x => x.asInstanceOf[js.Any] },
        "RecordColumns" -> RecordColumns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceSchema]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StartApplicationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var InputConfigurations: js.UndefOr[InputConfigurations]
  }

  object StartApplicationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      InputConfigurations: js.UndefOr[InputConfigurations] = js.undefined): StartApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "InputConfigurations" -> InputConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartApplicationRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StartApplicationResponse extends js.Object {

  }

  object StartApplicationResponse {
    def apply(): StartApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartApplicationResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StopApplicationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
  }

  object StopApplicationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined): StopApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopApplicationRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StopApplicationResponse extends js.Object {

  }

  object StopApplicationResponse {
    def apply(): StopApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopApplicationResponse]
    }
  }

  /**
   * <p>Data format is not valid, Amazon Kinesis Analytics is not able to detect schema for the given streaming source.</p>
   */
  @js.native
  trait UnableToDetectSchemaExceptionException extends js.Object {
    val message: ErrorMessage
    val RawInputRecords: RawInputRecords
    val ProcessedInputRecords: ProcessedInputRecords
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId]
    var ApplicationUpdate: js.UndefOr[ApplicationUpdate]
  }

  object UpdateApplicationRequest {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
      ApplicationUpdate: js.UndefOr[ApplicationUpdate] = js.undefined): UpdateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x => x.asInstanceOf[js.Any] },
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.map { x => x.asInstanceOf[js.Any] },
        "ApplicationUpdate" -> ApplicationUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {

  }

  object UpdateApplicationResponse {
    def apply(): UpdateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationResponse]
    }
  }
}
