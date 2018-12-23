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
    var ApplicationName: ApplicationName
    var CloudWatchLoggingOption: CloudWatchLoggingOption
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  object AddApplicationCloudWatchLoggingOptionRequest {
    def apply(
      ApplicationName: ApplicationName,
      CloudWatchLoggingOption: CloudWatchLoggingOption,
      CurrentApplicationVersionId: ApplicationVersionId): AddApplicationCloudWatchLoggingOptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CloudWatchLoggingOption" -> CloudWatchLoggingOption.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var InputId: Id
    var InputProcessingConfiguration: InputProcessingConfiguration
  }

  object AddApplicationInputProcessingConfigurationRequest {
    def apply(
      ApplicationName: ApplicationName,
      CurrentApplicationVersionId: ApplicationVersionId,
      InputId: Id,
      InputProcessingConfiguration: InputProcessingConfiguration): AddApplicationInputProcessingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "InputId" -> InputId.asInstanceOf[js.Any],
        "InputProcessingConfiguration" -> InputProcessingConfiguration.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var Input: Input
  }

  object AddApplicationInputRequest {
    def apply(
      ApplicationName: ApplicationName,
      CurrentApplicationVersionId: ApplicationVersionId,
      Input: Input): AddApplicationInputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "Input" -> Input.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var Output: Output
  }

  object AddApplicationOutputRequest {
    def apply(
      ApplicationName: ApplicationName,
      CurrentApplicationVersionId: ApplicationVersionId,
      Output: Output): AddApplicationOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "Output" -> Output.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ReferenceDataSource: ReferenceDataSource
  }

  object AddApplicationReferenceDataSourceRequest {
    def apply(
      ApplicationName: ApplicationName,
      CurrentApplicationVersionId: ApplicationVersionId,
      ReferenceDataSource: ReferenceDataSource): AddApplicationReferenceDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ReferenceDataSource" -> ReferenceDataSource.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      ReferenceDataSourceDescriptions: js.UndefOr[ReferenceDataSourceDescriptions] = js.undefined): ApplicationDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.asInstanceOf[js.Any],
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationStatus" -> ApplicationStatus.asInstanceOf[js.Any],
        "ApplicationVersionId" -> ApplicationVersionId.asInstanceOf[js.Any],
        "ApplicationCode" -> ApplicationCode.map { x => x.asInstanceOf[js.Any] },
        "ApplicationDescription" -> ApplicationDescription.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptionDescriptions" -> CloudWatchLoggingOptionDescriptions.map { x => x.asInstanceOf[js.Any] },
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "InputDescriptions" -> InputDescriptions.map { x => x.asInstanceOf[js.Any] },
        "LastUpdateTimestamp" -> LastUpdateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "OutputDescriptions" -> OutputDescriptions.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSourceDescriptions" -> ReferenceDataSourceDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Provides application summary information, including the application Amazon Resource Name (ARN), name, and status.
   */
  @js.native
  trait ApplicationSummary extends js.Object {
    var ApplicationARN: ResourceARN
    var ApplicationName: ApplicationName
    var ApplicationStatus: ApplicationStatus
  }

  object ApplicationSummary {
    def apply(
      ApplicationARN: ResourceARN,
      ApplicationName: ApplicationName,
      ApplicationStatus: ApplicationStatus): ApplicationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationARN" -> ApplicationARN.asInstanceOf[js.Any],
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationStatus" -> ApplicationStatus.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSummary]
    }
  }

  /**
   * Describes updates to apply to an existing Amazon Kinesis Analytics application.
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
    def apply(
      ApplicationCodeUpdate: js.UndefOr[ApplicationCode] = js.undefined,
      CloudWatchLoggingOptionUpdates: js.UndefOr[CloudWatchLoggingOptionUpdates] = js.undefined,
      InputUpdates: js.UndefOr[InputUpdates] = js.undefined,
      OutputUpdates: js.UndefOr[OutputUpdates] = js.undefined,
      ReferenceDataSourceUpdates: js.UndefOr[ReferenceDataSourceUpdates] = js.undefined): ApplicationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationCodeUpdate" -> ApplicationCodeUpdate.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptionUpdates" -> CloudWatchLoggingOptionUpdates.map { x => x.asInstanceOf[js.Any] },
        "InputUpdates" -> InputUpdates.map { x => x.asInstanceOf[js.Any] },
        "OutputUpdates" -> OutputUpdates.map { x => x.asInstanceOf[js.Any] },
        "ReferenceDataSourceUpdates" -> ReferenceDataSourceUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationUpdate]
    }
  }

  /**
   * Provides additional mapping information when the record format uses delimiters, such as CSV. For example, the following sample records use CSV format, where the records use the <i>'n'</i> as the row delimiter and a comma (",") as the column delimiter:
   *  <code>"name1", "address1"</code>
   *  <code>"name2", "address2"</code>
   */
  @js.native
  trait CSVMappingParameters extends js.Object {
    var RecordColumnDelimiter: RecordColumnDelimiter
    var RecordRowDelimiter: RecordRowDelimiter
  }

  object CSVMappingParameters {
    def apply(
      RecordColumnDelimiter: RecordColumnDelimiter,
      RecordRowDelimiter: RecordRowDelimiter): CSVMappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordColumnDelimiter" -> RecordColumnDelimiter.asInstanceOf[js.Any],
        "RecordRowDelimiter" -> RecordRowDelimiter.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVMappingParameters]
    }
  }

  /**
   * Provides a description of CloudWatch logging options, including the log stream Amazon Resource Name (ARN) and the role ARN.
   */
  @js.native
  trait CloudWatchLoggingOption extends js.Object {
    var LogStreamARN: LogStreamARN
    var RoleARN: RoleARN
  }

  object CloudWatchLoggingOption {
    def apply(
      LogStreamARN: LogStreamARN,
      RoleARN: RoleARN): CloudWatchLoggingOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogStreamARN" -> LogStreamARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOption]
    }
  }

  /**
   * Description of the CloudWatch logging option.
   */
  @js.native
  trait CloudWatchLoggingOptionDescription extends js.Object {
    var LogStreamARN: LogStreamARN
    var RoleARN: RoleARN
    var CloudWatchLoggingOptionId: js.UndefOr[Id]
  }

  object CloudWatchLoggingOptionDescription {
    def apply(
      LogStreamARN: LogStreamARN,
      RoleARN: RoleARN,
      CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined): CloudWatchLoggingOptionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogStreamARN" -> LogStreamARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOptionDescription]
    }
  }

  /**
   * Describes CloudWatch logging option updates.
   */
  @js.native
  trait CloudWatchLoggingOptionUpdate extends js.Object {
    var CloudWatchLoggingOptionId: Id
    var LogStreamARNUpdate: js.UndefOr[LogStreamARN]
    var RoleARNUpdate: js.UndefOr[RoleARN]
  }

  object CloudWatchLoggingOptionUpdate {
    def apply(
      CloudWatchLoggingOptionId: Id,
      LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined,
      RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined): CloudWatchLoggingOptionUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.asInstanceOf[js.Any],
        "LogStreamARNUpdate" -> LogStreamARNUpdate.map { x => x.asInstanceOf[js.Any] },
        "RoleARNUpdate" -> RoleARNUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLoggingOptionUpdate]
    }
  }

  /**
   * TBD
   */
  @js.native
  trait CreateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var ApplicationCode: js.UndefOr[ApplicationCode]
    var ApplicationDescription: js.UndefOr[ApplicationDescription]
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions]
    var Inputs: js.UndefOr[Inputs]
    var Outputs: js.UndefOr[Outputs]
  }

  object CreateApplicationRequest {
    def apply(
      ApplicationName: ApplicationName,
      ApplicationCode: js.UndefOr[ApplicationCode] = js.undefined,
      ApplicationDescription: js.UndefOr[ApplicationDescription] = js.undefined,
      CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined,
      Inputs: js.UndefOr[Inputs] = js.undefined,
      Outputs: js.UndefOr[Outputs] = js.undefined): CreateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationCode" -> ApplicationCode.map { x => x.asInstanceOf[js.Any] },
        "ApplicationDescription" -> ApplicationDescription.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLoggingOptions" -> CloudWatchLoggingOptions.map { x => x.asInstanceOf[js.Any] },
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationRequest]
    }
  }

  /**
   * TBD
   */
  @js.native
  trait CreateApplicationResponse extends js.Object {
    var ApplicationSummary: ApplicationSummary
  }

  object CreateApplicationResponse {
    def apply(
      ApplicationSummary: ApplicationSummary): CreateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationSummary" -> ApplicationSummary.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
    var ApplicationName: ApplicationName
    var CloudWatchLoggingOptionId: Id
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  object DeleteApplicationCloudWatchLoggingOptionRequest {
    def apply(
      ApplicationName: ApplicationName,
      CloudWatchLoggingOptionId: Id,
      CurrentApplicationVersionId: ApplicationVersionId): DeleteApplicationCloudWatchLoggingOptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CloudWatchLoggingOptionId" -> CloudWatchLoggingOptionId.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var InputId: Id
  }

  object DeleteApplicationInputProcessingConfigurationRequest {
    def apply(
      ApplicationName: ApplicationName,
      CurrentApplicationVersionId: ApplicationVersionId,
      InputId: Id): DeleteApplicationInputProcessingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "InputId" -> InputId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var OutputId: Id
  }

  object DeleteApplicationOutputRequest {
    def apply(
      ApplicationName: ApplicationName,
      CurrentApplicationVersionId: ApplicationVersionId,
      OutputId: Id): DeleteApplicationOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "OutputId" -> OutputId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
    var CurrentApplicationVersionId: ApplicationVersionId
    var ReferenceId: Id
  }

  object DeleteApplicationReferenceDataSourceRequest {
    def apply(
      ApplicationName: ApplicationName,
      CurrentApplicationVersionId: ApplicationVersionId,
      ReferenceId: Id): DeleteApplicationReferenceDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any],
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
    var CreateTimestamp: Timestamp
  }

  object DeleteApplicationRequest {
    def apply(
      ApplicationName: ApplicationName,
      CreateTimestamp: Timestamp): DeleteApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CreateTimestamp" -> CreateTimestamp.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
  }

  object DescribeApplicationRequest {
    def apply(
      ApplicationName: ApplicationName): DescribeApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeApplicationResponse extends js.Object {
    var ApplicationDetail: ApplicationDetail
  }

  object DescribeApplicationResponse {
    def apply(
      ApplicationDetail: ApplicationDetail): DescribeApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationDetail" -> ApplicationDetail.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationResponse]
    }
  }

  /**
   * Describes the data format when records are written to the destination. For more information, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application Output</a>.
   */
  @js.native
  trait DestinationSchema extends js.Object {
    var RecordFormatType: RecordFormatType
  }

  object DestinationSchema {
    def apply(
      RecordFormatType: RecordFormatType): DestinationSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordFormatType" -> RecordFormatType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DestinationSchema]
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
    def apply(
      InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined,
      InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      S3Configuration: js.UndefOr[S3Configuration] = js.undefined): DiscoverInputSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputProcessingConfiguration" -> InputProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
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
   * When you configure the application input, you specify the streaming source, the in-application stream name that is created, and the mapping between the two. For more information, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application Input</a>.
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
    def apply(
      InputSchema: SourceSchema,
      NamePrefix: InAppStreamName,
      InputParallelism: js.UndefOr[InputParallelism] = js.undefined,
      InputProcessingConfiguration: js.UndefOr[InputProcessingConfiguration] = js.undefined,
      KinesisFirehoseInput: js.UndefOr[KinesisFirehoseInput] = js.undefined,
      KinesisStreamsInput: js.UndefOr[KinesisStreamsInput] = js.undefined): Input = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSchema" -> InputSchema.asInstanceOf[js.Any],
        "NamePrefix" -> NamePrefix.asInstanceOf[js.Any],
        "InputParallelism" -> InputParallelism.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfiguration" -> InputProcessingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseInput" -> KinesisFirehoseInput.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsInput" -> KinesisStreamsInput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Input]
    }
  }

  /**
   * When you start your application, you provide this configuration, which identifies the input source and the point in the input source at which you want the application to start processing records.
   */
  @js.native
  trait InputConfiguration extends js.Object {
    var Id: Id
    var InputStartingPositionConfiguration: InputStartingPositionConfiguration
  }

  object InputConfiguration {
    def apply(
      Id: Id,
      InputStartingPositionConfiguration: InputStartingPositionConfiguration): InputConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputConfiguration]
    }
  }

  /**
   * Describes the application input configuration. For more information, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application Input</a>.
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
    def apply(
      InAppStreamNames: js.UndefOr[InAppStreamNames] = js.undefined,
      InputId: js.UndefOr[Id] = js.undefined,
      InputParallelism: js.UndefOr[InputParallelism] = js.undefined,
      InputProcessingConfigurationDescription: js.UndefOr[InputProcessingConfigurationDescription] = js.undefined,
      InputSchema: js.UndefOr[SourceSchema] = js.undefined,
      InputStartingPositionConfiguration: js.UndefOr[InputStartingPositionConfiguration] = js.undefined,
      KinesisFirehoseInputDescription: js.UndefOr[KinesisFirehoseInputDescription] = js.undefined,
      KinesisStreamsInputDescription: js.UndefOr[KinesisStreamsInputDescription] = js.undefined,
      NamePrefix: js.UndefOr[InAppStreamName] = js.undefined): InputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InAppStreamNames" -> InAppStreamNames.map { x => x.asInstanceOf[js.Any] },
        "InputId" -> InputId.map { x => x.asInstanceOf[js.Any] },
        "InputParallelism" -> InputParallelism.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfigurationDescription" -> InputProcessingConfigurationDescription.map { x => x.asInstanceOf[js.Any] },
        "InputSchema" -> InputSchema.map { x => x.asInstanceOf[js.Any] },
        "InputStartingPositionConfiguration" -> InputStartingPositionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseInputDescription" -> KinesisFirehoseInputDescription.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsInputDescription" -> KinesisStreamsInputDescription.map { x => x.asInstanceOf[js.Any] },
        "NamePrefix" -> NamePrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputDescription]
    }
  }

  /**
   * An object that contains the Amazon Resource Name (ARN) of the <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a> function that is used to preprocess records in the stream, and the ARN of the IAM role that is used to access the AWS Lambda function.
   */
  @js.native
  trait InputLambdaProcessor extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object InputLambdaProcessor {
    def apply(
      ResourceARN: ResourceARN,
      RoleARN: RoleARN): InputLambdaProcessor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLambdaProcessor]
    }
  }

  /**
   * An object that contains the Amazon Resource Name (ARN) of the <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a> function that is used to preprocess records in the stream, and the ARN of the IAM role that is used to access the AWS Lambda expression.
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
   * Represents an update to the '''InputLambdaProcessor''' that is used to preprocess the records in the stream.
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
   * Describes the number of in-application streams to create for a given streaming source. For information about parallelism, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application Input</a>.
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
   * Provides updates to the parallelism count.
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
   * Provides a description of a processor that is used to preprocess the records in the stream before being processed by your application code. Currently, the only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
   */
  @js.native
  trait InputProcessingConfiguration extends js.Object {
    var InputLambdaProcessor: InputLambdaProcessor
  }

  object InputProcessingConfiguration {
    def apply(
      InputLambdaProcessor: InputLambdaProcessor): InputProcessingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLambdaProcessor" -> InputLambdaProcessor.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputProcessingConfiguration]
    }
  }

  /**
   * Provides configuration information about an input processor. Currently, the only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
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
   * Describes updates to an '''InputProcessingConfiguration'''.
   */
  @js.native
  trait InputProcessingConfigurationUpdate extends js.Object {
    var InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
  }

  object InputProcessingConfigurationUpdate {
    def apply(
      InputLambdaProcessorUpdate: InputLambdaProcessorUpdate): InputProcessingConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLambdaProcessorUpdate" -> InputLambdaProcessorUpdate.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputProcessingConfigurationUpdate]
    }
  }

  /**
   * Describes updates for the application's input schema.
   */
  @js.native
  trait InputSchemaUpdate extends js.Object {
    var RecordColumnUpdates: js.UndefOr[RecordColumns]
    var RecordEncodingUpdate: js.UndefOr[RecordEncoding]
    var RecordFormatUpdate: js.UndefOr[RecordFormat]
  }

  object InputSchemaUpdate {
    def apply(
      RecordColumnUpdates: js.UndefOr[RecordColumns] = js.undefined,
      RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.undefined,
      RecordFormatUpdate: js.UndefOr[RecordFormat] = js.undefined): InputSchemaUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordColumnUpdates" -> RecordColumnUpdates.map { x => x.asInstanceOf[js.Any] },
        "RecordEncodingUpdate" -> RecordEncodingUpdate.map { x => x.asInstanceOf[js.Any] },
        "RecordFormatUpdate" -> RecordFormatUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Describes the point at which the application reads from the streaming source.
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
   * Describes updates to a specific input configuration (identified by the <code>InputId</code> of an application).
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
    def apply(
      InputId: Id,
      InputParallelismUpdate: js.UndefOr[InputParallelismUpdate] = js.undefined,
      InputProcessingConfigurationUpdate: js.UndefOr[InputProcessingConfigurationUpdate] = js.undefined,
      InputSchemaUpdate: js.UndefOr[InputSchemaUpdate] = js.undefined,
      KinesisFirehoseInputUpdate: js.UndefOr[KinesisFirehoseInputUpdate] = js.undefined,
      KinesisStreamsInputUpdate: js.UndefOr[KinesisStreamsInputUpdate] = js.undefined,
      NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.undefined): InputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputId" -> InputId.asInstanceOf[js.Any],
        "InputParallelismUpdate" -> InputParallelismUpdate.map { x => x.asInstanceOf[js.Any] },
        "InputProcessingConfigurationUpdate" -> InputProcessingConfigurationUpdate.map { x => x.asInstanceOf[js.Any] },
        "InputSchemaUpdate" -> InputSchemaUpdate.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseInputUpdate" -> KinesisFirehoseInputUpdate.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsInputUpdate" -> KinesisStreamsInputUpdate.map { x => x.asInstanceOf[js.Any] },
        "NamePrefixUpdate" -> NamePrefixUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputUpdate]
    }
  }

  /**
   * Provides additional mapping information when JSON is the record format on the streaming source.
   */
  @js.native
  trait JSONMappingParameters extends js.Object {
    var RecordRowPath: RecordRowPath
  }

  object JSONMappingParameters {
    def apply(
      RecordRowPath: RecordRowPath): JSONMappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordRowPath" -> RecordRowPath.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JSONMappingParameters]
    }
  }

  /**
   * Identifies an Amazon Kinesis Firehose delivery stream as the streaming source. You provide the delivery stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon Kinesis Analytics to access the stream on your behalf.
   */
  @js.native
  trait KinesisFirehoseInput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object KinesisFirehoseInput {
    def apply(
      ResourceARN: ResourceARN,
      RoleARN: RoleARN): KinesisFirehoseInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseInput]
    }
  }

  /**
   * Describes the Amazon Kinesis Firehose delivery stream that is configured as the streaming source in the application input configuration.
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
   * When updating application input configuration, provides information about an Amazon Kinesis Firehose delivery stream as the streaming source.
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
   * When configuring application output, identifies an Amazon Kinesis Firehose delivery stream as the destination. You provide the stream Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to write to the stream on your behalf.
   */
  @js.native
  trait KinesisFirehoseOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object KinesisFirehoseOutput {
    def apply(
      ResourceARN: ResourceARN,
      RoleARN: RoleARN): KinesisFirehoseOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseOutput]
    }
  }

  /**
   * For an application output, describes the Amazon Kinesis Firehose delivery stream configured as its destination.
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
   * When updating an output configuration using the '''UpdateApplication''' operation, provides information about an Amazon Kinesis Firehose delivery stream configured as the destination.
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
   * Identifies an Amazon Kinesis stream as the streaming source. You provide the stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon Kinesis Analytics to access the stream on your behalf.
   */
  @js.native
  trait KinesisStreamsInput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object KinesisStreamsInput {
    def apply(
      ResourceARN: ResourceARN,
      RoleARN: RoleARN): KinesisStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsInput]
    }
  }

  /**
   * Describes the Amazon Kinesis stream that is configured as the streaming source in the application input configuration.
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
   * When updating application input configuration, provides information about an Amazon Kinesis stream as the streaming source.
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
   * When configuring application output, identifies an Amazon Kinesis stream as the destination. You provide the stream Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis Analytics can use to write to the stream on your behalf.
   */
  @js.native
  trait KinesisStreamsOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object KinesisStreamsOutput {
    def apply(
      ResourceARN: ResourceARN,
      RoleARN: RoleARN): KinesisStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisStreamsOutput]
    }
  }

  /**
   * For an application output, describes the Amazon Kinesis stream configured as its destination.
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
   * When updating an output configuration using the '''UpdateApplication''' operation, provides information about an Amazon Kinesis stream configured as the destination.
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
   * When configuring application output, identifies an AWS Lambda function as the destination. You provide the function Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis Analytics can use to write to the function on your behalf.
   */
  @js.native
  trait LambdaOutput extends js.Object {
    var ResourceARN: ResourceARN
    var RoleARN: RoleARN
  }

  object LambdaOutput {
    def apply(
      ResourceARN: ResourceARN,
      RoleARN: RoleARN): LambdaOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaOutput]
    }
  }

  /**
   * For an application output, describes the AWS Lambda function configured as its destination.
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
   * When updating an output configuration using the '''UpdateApplication''' operation, provides information about an AWS Lambda function configured as the destination.
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
   * <p/>
   */
  @js.native
  trait ListApplicationsRequest extends js.Object {
    var ExclusiveStartApplicationName: js.UndefOr[ApplicationName]
    var Limit: js.UndefOr[ListApplicationsInputLimit]
  }

  object ListApplicationsRequest {
    def apply(
      ExclusiveStartApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined): ListApplicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartApplicationName" -> ExclusiveStartApplicationName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListApplicationsResponse extends js.Object {
    var ApplicationSummaries: ApplicationSummaries
    var HasMoreApplications: BooleanObject
  }

  object ListApplicationsResponse {
    def apply(
      ApplicationSummaries: ApplicationSummaries,
      HasMoreApplications: BooleanObject): ListApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationSummaries" -> ApplicationSummaries.asInstanceOf[js.Any],
        "HasMoreApplications" -> HasMoreApplications.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApplicationsResponse]
    }
  }

  /**
   * When configuring application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
   */
  @js.native
  trait MappingParameters extends js.Object {
    var CSVMappingParameters: js.UndefOr[CSVMappingParameters]
    var JSONMappingParameters: js.UndefOr[JSONMappingParameters]
  }

  object MappingParameters {
    def apply(
      CSVMappingParameters: js.UndefOr[CSVMappingParameters] = js.undefined,
      JSONMappingParameters: js.UndefOr[JSONMappingParameters] = js.undefined): MappingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CSVMappingParameters" -> CSVMappingParameters.map { x => x.asInstanceOf[js.Any] },
        "JSONMappingParameters" -> JSONMappingParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MappingParameters]
    }
  }

  /**
   * Describes application output configuration in which you identify an in-application stream and a destination where you want the in-application stream data to be written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream.
   *  <p/> For limits on how many destinations an application can write and other limitations, see <a href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
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
    def apply(
      DestinationSchema: DestinationSchema,
      Name: InAppStreamName,
      KinesisFirehoseOutput: js.UndefOr[KinesisFirehoseOutput] = js.undefined,
      KinesisStreamsOutput: js.UndefOr[KinesisStreamsOutput] = js.undefined,
      LambdaOutput: js.UndefOr[LambdaOutput] = js.undefined): Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationSchema" -> DestinationSchema.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "KinesisFirehoseOutput" -> KinesisFirehoseOutput.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsOutput" -> KinesisStreamsOutput.map { x => x.asInstanceOf[js.Any] },
        "LambdaOutput" -> LambdaOutput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Output]
    }
  }

  /**
   * Describes the application output configuration, which includes the in-application stream name and the destination where the stream data is written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream.
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
    def apply(
      DestinationSchema: js.UndefOr[DestinationSchema] = js.undefined,
      KinesisFirehoseOutputDescription: js.UndefOr[KinesisFirehoseOutputDescription] = js.undefined,
      KinesisStreamsOutputDescription: js.UndefOr[KinesisStreamsOutputDescription] = js.undefined,
      LambdaOutputDescription: js.UndefOr[LambdaOutputDescription] = js.undefined,
      Name: js.UndefOr[InAppStreamName] = js.undefined,
      OutputId: js.UndefOr[Id] = js.undefined): OutputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationSchema" -> DestinationSchema.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseOutputDescription" -> KinesisFirehoseOutputDescription.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsOutputDescription" -> KinesisStreamsOutputDescription.map { x => x.asInstanceOf[js.Any] },
        "LambdaOutputDescription" -> LambdaOutputDescription.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OutputId" -> OutputId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDescription]
    }
  }

  /**
   * Describes updates to the output configuration identified by the <code>OutputId</code>.
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
    def apply(
      OutputId: Id,
      DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.undefined,
      KinesisFirehoseOutputUpdate: js.UndefOr[KinesisFirehoseOutputUpdate] = js.undefined,
      KinesisStreamsOutputUpdate: js.UndefOr[KinesisStreamsOutputUpdate] = js.undefined,
      LambdaOutputUpdate: js.UndefOr[LambdaOutputUpdate] = js.undefined,
      NameUpdate: js.UndefOr[InAppStreamName] = js.undefined): OutputUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputId" -> OutputId.asInstanceOf[js.Any],
        "DestinationSchemaUpdate" -> DestinationSchemaUpdate.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseOutputUpdate" -> KinesisFirehoseOutputUpdate.map { x => x.asInstanceOf[js.Any] },
        "KinesisStreamsOutputUpdate" -> KinesisStreamsOutputUpdate.map { x => x.asInstanceOf[js.Any] },
        "LambdaOutputUpdate" -> LambdaOutputUpdate.map { x => x.asInstanceOf[js.Any] },
        "NameUpdate" -> NameUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputUpdate]
    }
  }

  /**
   * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
   *  Also used to describe the format of the reference data source.
   */
  @js.native
  trait RecordColumn extends js.Object {
    var Name: RecordColumnName
    var SqlType: RecordColumnSqlType
    var Mapping: js.UndefOr[RecordColumnMapping]
  }

  object RecordColumn {
    def apply(
      Name: RecordColumnName,
      SqlType: RecordColumnSqlType,
      Mapping: js.UndefOr[RecordColumnMapping] = js.undefined): RecordColumn = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "SqlType" -> SqlType.asInstanceOf[js.Any],
        "Mapping" -> Mapping.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordColumn]
    }
  }

  /**
   * Describes the record format and relevant mapping information that should be applied to schematize the records on the stream.
   */
  @js.native
  trait RecordFormat extends js.Object {
    var RecordFormatType: RecordFormatType
    var MappingParameters: js.UndefOr[MappingParameters]
  }

  object RecordFormat {
    def apply(
      RecordFormatType: RecordFormatType,
      MappingParameters: js.UndefOr[MappingParameters] = js.undefined): RecordFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordFormatType" -> RecordFormatType.asInstanceOf[js.Any],
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
   * Describes the reference data source by providing the source information (S3 bucket name and object key name), the resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon S3 object to the in-application table.
   */
  @js.native
  trait ReferenceDataSource extends js.Object {
    var ReferenceSchema: SourceSchema
    var TableName: InAppTableName
    var S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource]
  }

  object ReferenceDataSource {
    def apply(
      ReferenceSchema: SourceSchema,
      TableName: InAppTableName,
      S3ReferenceDataSource: js.UndefOr[S3ReferenceDataSource] = js.undefined): ReferenceDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReferenceSchema" -> ReferenceSchema.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "S3ReferenceDataSource" -> S3ReferenceDataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSource]
    }
  }

  /**
   * Describes the reference data source configured for an application.
   */
  @js.native
  trait ReferenceDataSourceDescription extends js.Object {
    var ReferenceId: Id
    var S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription
    var TableName: InAppTableName
    var ReferenceSchema: js.UndefOr[SourceSchema]
  }

  object ReferenceDataSourceDescription {
    def apply(
      ReferenceId: Id,
      S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription,
      TableName: InAppTableName,
      ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined): ReferenceDataSourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any],
        "S3ReferenceDataSourceDescription" -> S3ReferenceDataSourceDescription.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "ReferenceSchema" -> ReferenceSchema.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSourceDescription]
    }
  }

  /**
   * When you update a reference data source configuration for an application, this object provides all the updated values (such as the source bucket name and object key name), the in-application table name that is created, and updated mapping information that maps the data in the Amazon S3 object to the in-application reference table that is created.
   */
  @js.native
  trait ReferenceDataSourceUpdate extends js.Object {
    var ReferenceId: Id
    var ReferenceSchemaUpdate: js.UndefOr[SourceSchema]
    var S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate]
    var TableNameUpdate: js.UndefOr[InAppTableName]
  }

  object ReferenceDataSourceUpdate {
    def apply(
      ReferenceId: Id,
      ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.undefined,
      S3ReferenceDataSourceUpdate: js.UndefOr[S3ReferenceDataSourceUpdate] = js.undefined,
      TableNameUpdate: js.UndefOr[InAppTableName] = js.undefined): ReferenceDataSourceUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any],
        "ReferenceSchemaUpdate" -> ReferenceSchemaUpdate.map { x => x.asInstanceOf[js.Any] },
        "S3ReferenceDataSourceUpdate" -> S3ReferenceDataSourceUpdate.map { x => x.asInstanceOf[js.Any] },
        "TableNameUpdate" -> TableNameUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReferenceDataSourceUpdate]
    }
  }

  /**
   * Provides a description of an Amazon S3 data source, including the Amazon Resource Name (ARN) of the S3 bucket, the ARN of the IAM role that is used to access the bucket, and the name of the Amazon S3 object that contains the data.
   */
  @js.native
  trait S3Configuration extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var RoleARN: RoleARN
  }

  object S3Configuration {
    def apply(
      BucketARN: BucketARN,
      FileKey: FileKey,
      RoleARN: RoleARN): S3Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey" -> FileKey.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Configuration]
    }
  }

  /**
   * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your behalf.
   *  An Amazon Kinesis Analytics application loads reference data only once. If the data changes, you call the '''UpdateApplication''' operation to trigger reloading of data into your application.
   */
  @js.native
  trait S3ReferenceDataSource extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ReferenceRoleARN: RoleARN
  }

  object S3ReferenceDataSource {
    def apply(
      BucketARN: BucketARN,
      FileKey: FileKey,
      ReferenceRoleARN: RoleARN): S3ReferenceDataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey" -> FileKey.asInstanceOf[js.Any],
        "ReferenceRoleARN" -> ReferenceRoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSource]
    }
  }

  /**
   * Provides the bucket name and object key name that stores the reference data.
   */
  @js.native
  trait S3ReferenceDataSourceDescription extends js.Object {
    var BucketARN: BucketARN
    var FileKey: FileKey
    var ReferenceRoleARN: RoleARN
  }

  object S3ReferenceDataSourceDescription {
    def apply(
      BucketARN: BucketARN,
      FileKey: FileKey,
      ReferenceRoleARN: RoleARN): S3ReferenceDataSourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketARN" -> BucketARN.asInstanceOf[js.Any],
        "FileKey" -> FileKey.asInstanceOf[js.Any],
        "ReferenceRoleARN" -> ReferenceRoleARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3ReferenceDataSourceDescription]
    }
  }

  /**
   * Describes the S3 bucket name, object key name, and IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
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
   * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
   */
  @js.native
  trait SourceSchema extends js.Object {
    var RecordColumns: RecordColumns
    var RecordFormat: RecordFormat
    var RecordEncoding: js.UndefOr[RecordEncoding]
  }

  object SourceSchema {
    def apply(
      RecordColumns: RecordColumns,
      RecordFormat: RecordFormat,
      RecordEncoding: js.UndefOr[RecordEncoding] = js.undefined): SourceSchema = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordColumns" -> RecordColumns.asInstanceOf[js.Any],
        "RecordFormat" -> RecordFormat.asInstanceOf[js.Any],
        "RecordEncoding" -> RecordEncoding.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceSchema]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StartApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var InputConfigurations: InputConfigurations
  }

  object StartApplicationRequest {
    def apply(
      ApplicationName: ApplicationName,
      InputConfigurations: InputConfigurations): StartApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "InputConfigurations" -> InputConfigurations.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ApplicationName: ApplicationName
  }

  object StopApplicationRequest {
    def apply(
      ApplicationName: ApplicationName): StopApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationName: ApplicationName
    var ApplicationUpdate: ApplicationUpdate
    var CurrentApplicationVersionId: ApplicationVersionId
  }

  object UpdateApplicationRequest {
    def apply(
      ApplicationName: ApplicationName,
      ApplicationUpdate: ApplicationUpdate,
      CurrentApplicationVersionId: ApplicationVersionId): UpdateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "ApplicationUpdate" -> ApplicationUpdate.asInstanceOf[js.Any],
        "CurrentApplicationVersionId" -> CurrentApplicationVersionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
